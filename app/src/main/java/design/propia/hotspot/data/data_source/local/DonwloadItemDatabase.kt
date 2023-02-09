package design.propia.hotspot.data.data_source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import design.propia.hotspot.domain.model.DownloadItem

@Database(entities = [DownloadItem::class], version = 1)
abstract class DonwloadItemDatabase:RoomDatabase() {
    abstract val downloadItemDao:DownloadItemDao
}