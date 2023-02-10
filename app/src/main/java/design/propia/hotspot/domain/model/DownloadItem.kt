package design.propia.hotspot.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class DownloadItem(
    val fileType: String,
    val downloadTimestamp: String,
    val itemTitle: String,
    val itemCategory: DownloadCategories,
    val itemSize: Long,
    val amountDownloaded: Long,
    //the venue should source the download location or estate so that users know where to source
    //files from next time
    val venue:Int,
    val timeRemaining: String,
    @PrimaryKey val id:Int,
) {
    companion object {
        val itemCategories = listOf("Movies", "Music", "Series", "Games")
    }
}
