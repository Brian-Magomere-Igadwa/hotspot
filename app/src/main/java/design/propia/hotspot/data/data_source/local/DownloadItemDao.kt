package design.propia.hotspot.data.data_source.local

import androidx.room.*
import design.propia.hotspot.domain.model.DownloadItem
import kotlinx.coroutines.flow.Flow

@Dao
interface DownloadItemDao {

    @Query("SELECT * FROM downloaditem")
    fun getDownloadItems():Flow<List<DownloadItem>>

    @Query("SELECT * FROM downloaditem WHERE id=:id")
    suspend fun getDownloadItemById(id:Int):DownloadItem?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDownloadItem(downloadItem:DownloadItem)

    @Delete
    suspend fun deleteDownloadItem(downloadItem:DownloadItem)
}