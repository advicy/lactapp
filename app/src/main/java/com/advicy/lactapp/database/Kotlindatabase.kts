@Entity(tableName = "name_table")
class Name(
    @PrimaryKey(autoGenerate = true) val id:Int,
    @ColumnInfo(name = "Name") val word: String

)

@Dao
interface NameDao{
    @Query("SELECT * from name_table ORDER BY word ASC")
    fun getAlphabetizedNames(): LiveData<List<Name>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(name:Name)

    @Query("DELETE FROM name_table")
    suspend fun deleteAll()
}
class NameRepository(private val NameDao: NameDao) {

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    val allNames: LiveData<List<Name>> = NameDao.getAlphabetizedNames()

    suspend fun insert(name: Name) {
        NameDao.insert(name)
    }
}

@Database(entities = arrayOf(Word::class), version = 1, exportSchema = false)
 abstract class NameRoomDatabase : RoomDatabase() {

    abstract fun NameDao(): NameDao

    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: NameRoomDatabase? = null

        fun getDatabase(context: Context): NameRoomDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                        context.applicationContext,
                        NameRoomDatabase::class.java,
                        "name_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}
