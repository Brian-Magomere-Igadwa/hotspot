package design.propia.hotspot.domain.use_cases

import design.propia.hotspot.domain.model.DownloadCategories
import design.propia.hotspot.domain.model.DownloadItem
import design.propia.hotspot.domain.repository.DownloadRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


class GetDownloads(
    private val repository: DownloadRepository
) {
    operator fun invoke(
        filter: DownloadCategories?
    ): Flow<List<DownloadItem>> {
        if (filter != null) {
            return repository.getDownloads().map {

                when (filter) {
                    DownloadCategories.Movies -> it.filter { it.itemCategory == DownloadCategories.Movies }
                    DownloadCategories.Music -> it.filter { it.itemCategory == DownloadCategories.Music }
                    DownloadCategories.Series -> it.filter { it.itemCategory == DownloadCategories.Series }
                    DownloadCategories.Software -> it.filter { it.itemCategory == DownloadCategories.Software }
                    DownloadCategories.Games -> it.filter { it.itemCategory == DownloadCategories.Games }
                }
            }
        } else {
            return repository.getDownloads()
        }
    }
}