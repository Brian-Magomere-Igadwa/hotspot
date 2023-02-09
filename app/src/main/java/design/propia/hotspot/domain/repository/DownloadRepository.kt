package design.propia.hotspot.domain.repository

import design.propia.hotspot.domain.model.DownloadItem
import kotlinx.coroutines.flow.Flow

interface DownloadRepository {
    fun getDownloads(): Flow<List<DownloadItem>>

    suspend fun getDownloadsById(id: Int): DownloadItem?

    suspend fun shareDownload(downloadItem: DownloadItem)

    //just pull the item from our saved in the room db this means the item wont be
    //visible in the network anymore
    suspend fun unshareDownload(downloadItem: DownloadItem)
}