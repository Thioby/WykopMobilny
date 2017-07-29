package io.github.feelfreelinux.wykopmobilny.objects

data class VoteResponse(
        val voteCount: Int,
        val voters: List<Voter>)

data class Voter(
        val author: String,
        val authorauthor_group: Int,
        val author_avatar: String,
        val authorAvatarBig: String,
        val authorAvatarMed: String,
        val authorAvatarLo: String,
        val authorSex: String,
        val date: String
)
data class EntryDetails (
        var id: Int,
        var author: String,
        var author_avatar: String,
        var author_avatar_big: String,
        var author_avatar_med: String,
        var author_avatar_lo: String,
        var author_group: Int,
        var author_sex: String,
        var date: String,
        var body: String,
        var source: String?,
        var url: String,
        var receiver: String?,
        var receiver_avatar: String?,
        var receiver_avatar_big: String?,
        var receiver_avatar_med: String?,
        var receiver_avatar_lo: String?,
        var receiver_group: String?,
        var receiver_sex: String?,
        var blocked: Boolean,
        var vote_count: Int,
        var user_vote: Int,
        var user_favorite: Boolean,
        var type: String,
        var embed: Embed?,
        var deleted: Boolean,
        var violation_url: String,
        var can_comment: Boolean,
        var app: String?,
        var comment_count: Int,
        var voters: List<Voter>,
        var comments: List<Comment>
)

data class Comment(
        var id: Int,
        var author: String,
        var author_avatar: String,
        var author_avatar_big: String,
        var author_avatar_med: String,
        var author_avatar_lo: String,
        var author_group: Int,
        var author_sex: String,
        var date: String,
        var body: String,
        var source: String?,
        var entry_id: Int,
        var blocked: Boolean,
        var deleted: Boolean,
        var vote_count: Int,
        var user_vote: Int,
        var voters: List<Voter>,
        var embed: Embed?,
        var type: String,
        var app: String?,
        var violation_url: String
)

data class SingleEntry(
        var id: Int,
        var author: String,
        var author_avatar: String,
        var author_avatar_big: String,
        var author_avatar_med: String,
        var author_avatar_lo: String,
        var author_group: Int,
        var author_sex: String,
        var date: String,
        var body: String,
        var source: Any,
        var url: String,
        var receiver: Any,
        var receiver_avatar: Any,
        var receiver_avatar_big: Any,
        var receiver_avatar_med: Any,
        var receiver_avatar_lo: Any,
        var receiver_group: Any,
        var receiver_sex: Any,
        var blocked: Boolean,
        var vote_count: Int,
        var user_vote: Int,
        var user_favorite: Boolean,
        var type: String,
        var embed: Embed?,
        var deleted: Boolean,
        var violation_url: String?,
        var can_comment: Boolean?,
        var app: String?,
        var comment_count: Int,
        var voters: List<Voter>
)
data class TagMeta(
        var tag: String,
        var is_observed: Boolean?,
        var is_blocked: Boolean?,
        var counters: Any
)
data class TagFeedEntries (
        var meta : TagMeta,
        var items : Array<SingleEntry>
)