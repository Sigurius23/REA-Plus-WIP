.class public interface abstract Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u0013X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0015R\u0012\u0010\u0016\u001a\u00020\u0017X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u001bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u00020\u001fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010!R\u0012\u0010\"\u001a\u00020#X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008$\u0010%R\u0012\u0010&\u001a\u00020\'X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010)R\u0012\u0010*\u001a\u00020+X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010-R\u0012\u0010.\u001a\u00020/X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00080\u00101R\u0012\u00102\u001a\u000203X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00084\u00105R\u0012\u00106\u001a\u000207X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00088\u00109R\u0012\u0010:\u001a\u00020;X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008<\u0010=R\u0012\u0010>\u001a\u00020?X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008@\u0010AR\u0012\u0010B\u001a\u00020CX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008D\u0010ER\u0012\u0010F\u001a\u00020GX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008H\u0010IR\u0012\u0010J\u001a\u00020KX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008L\u0010MR\u0012\u0010N\u001a\u00020OX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008P\u0010Q\u0082\u0001\u0001R\u00a8\u0006S\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;",
        "",
        "messageClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;",
        "getMessageClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;",
        "messageLongClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;",
        "getMessageLongClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;",
        "messageRetryListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;",
        "getMessageRetryListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;",
        "threadClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;",
        "getThreadClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;",
        "translatedLabelClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnTranslatedLabelClickListener;",
        "getTranslatedLabelClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnTranslatedLabelClickListener;",
        "attachmentClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;",
        "getAttachmentClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;",
        "attachmentDownloadClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;",
        "getAttachmentDownloadClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;",
        "reactionViewClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;",
        "getReactionViewClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;",
        "userClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;",
        "getUserClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;",
        "mentionClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;",
        "getMentionClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;",
        "giphySendListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;",
        "getGiphySendListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;",
        "linkClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;",
        "getLinkClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;",
        "unreadLabelReachedListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;",
        "getUnreadLabelReachedListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;",
        "onPollOptionClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;",
        "getOnPollOptionClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;",
        "onShowAllPollOptionClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;",
        "getOnShowAllPollOptionClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;",
        "onPollCloseClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;",
        "getOnPollCloseClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;",
        "onViewPollResultClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;",
        "getOnViewPollResultClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;",
        "onSuggestPollOptionClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;",
        "getOnSuggestPollOptionClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;",
        "onAddPollCommentClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;",
        "getOnAddPollCommentClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;",
        "onViewPollCommentsClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;",
        "getOnViewPollCommentsClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract getAttachmentClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;
.end method

.method public abstract getAttachmentDownloadClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;
.end method

.method public abstract getGiphySendListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;
.end method

.method public abstract getLinkClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;
.end method

.method public abstract getMentionClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;
.end method

.method public abstract getMessageClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;
.end method

.method public abstract getMessageLongClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;
.end method

.method public abstract getMessageRetryListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;
.end method

.method public abstract getOnAddPollCommentClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;
.end method

.method public abstract getOnPollCloseClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;
.end method

.method public abstract getOnPollOptionClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;
.end method

.method public abstract getOnShowAllPollOptionClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;
.end method

.method public abstract getOnSuggestPollOptionClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;
.end method

.method public abstract getOnViewPollCommentsClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;
.end method

.method public abstract getOnViewPollResultClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;
.end method

.method public abstract getReactionViewClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;
.end method

.method public abstract getThreadClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;
.end method

.method public abstract getTranslatedLabelClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnTranslatedLabelClickListener;
.end method

.method public abstract getUnreadLabelReachedListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;
.end method

.method public abstract getUserClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;
.end method
