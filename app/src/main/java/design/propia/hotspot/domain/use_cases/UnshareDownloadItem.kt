package design.propia.hotspot.domain.use_cases

import design.propia.hotspot.domain.model.DownloadItem
import design.propia.hotspot.domain.repository.DownloadRepository

class UnshareDownloadItem(
    private val repository: DownloadRepository
) {
    suspend operator fun invoke(downloadItem:DownloadItem){
        repository.unshareDownload(downloadItem)
    }
}