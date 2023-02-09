package design.propia.hotspot.data.repository

import design.propia.hotspot.data.data_source.local.DownloadItemDao
import design.propia.hotspot.domain.model.DownloadItem
import design.propia.hotspot.domain.repository.DownloadRepository
import kotlinx.coroutines.flow.Flow

class DownloadRepositoryImpl(
    private val dao: DownloadItemDao
):DownloadRepository {
    override fun getDownloads(): Flow<List<DownloadItem>> {
        //the block below could really just be a utility function in data layer for reusability
        TODO("Have the implementation function for retrieval of data from the wifi p2p network called")
        TODO("if operation successful then insert the new data into the database before returning")
        return dao.getDownloadItems()
    }

    override suspend fun getDownloadsById(id: Int): DownloadItem? {
        return dao.getDownloadItemById(id)
    }

    override suspend fun shareDownload(downloadItem: DownloadItem) {
        dao.insertDownloadItem(downloadItem)
    }

    override suspend fun unshareDownload(downloadItem: DownloadItem) {
        return dao.deleteDownloadItem(downloadItem)
    }
}