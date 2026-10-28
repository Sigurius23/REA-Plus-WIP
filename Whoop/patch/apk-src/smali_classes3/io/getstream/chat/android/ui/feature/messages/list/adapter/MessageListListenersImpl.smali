.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008i\u0008\u0000\u0018\u00002\u00020\u0001:\u0002\u0091\u0001B\u00c1\u0001\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u0013\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0015\u0012\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0017\u0012\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0019\u0012\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020\'\u0012\u0006\u0010(\u001a\u00020)\u00a2\u0006\u0004\u0008*\u0010+R+\u0010\u0002\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00038V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00081\u00102\u001a\u0004\u0008-\u0010.\"\u0004\u0008/\u00100R+\u0010\u0004\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00058V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u00087\u00102\u001a\u0004\u00083\u00104\"\u0004\u00085\u00106R+\u0010\u0006\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u00078V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008<\u00102\u001a\u0004\u00088\u00109\"\u0004\u0008:\u0010;R+\u0010\u0008\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008A\u00102\u001a\u0004\u0008=\u0010>\"\u0004\u0008?\u0010@R\u001b\u0010\n\u001a\u00020\u000b8VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008D\u00102\u001a\u0004\u0008B\u0010CR+\u0010\u000c\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008I\u00102\u001a\u0004\u0008E\u0010F\"\u0004\u0008G\u0010HR+\u0010\u000e\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u000f8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008N\u00102\u001a\u0004\u0008J\u0010K\"\u0004\u0008L\u0010MR+\u0010\u0010\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00118V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008S\u00102\u001a\u0004\u0008O\u0010P\"\u0004\u0008Q\u0010RR+\u0010\u0012\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\u00138V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008X\u00102\u001a\u0004\u0008T\u0010U\"\u0004\u0008V\u0010WR+\u0010\u0014\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00158V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008]\u00102\u001a\u0004\u0008Y\u0010Z\"\u0004\u0008[\u0010\\R+\u0010\u0016\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u00178V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008b\u00102\u001a\u0004\u0008^\u0010_\"\u0004\u0008`\u0010aR+\u0010\u0018\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u00198V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008g\u00102\u001a\u0004\u0008c\u0010d\"\u0004\u0008e\u0010fR+\u0010h\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008m\u00102\u001a\u0004\u0008i\u0010j\"\u0004\u0008k\u0010lR+\u0010\u001c\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u001d8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008r\u00102\u001a\u0004\u0008n\u0010o\"\u0004\u0008p\u0010qR+\u0010\u001e\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u001f8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008w\u00102\u001a\u0004\u0008s\u0010t\"\u0004\u0008u\u0010vR+\u0010 \u001a\u00020!2\u0006\u0010,\u001a\u00020!8V@VX\u0096\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008|\u00102\u001a\u0004\u0008x\u0010y\"\u0004\u0008z\u0010{R-\u0010\"\u001a\u00020#2\u0006\u0010,\u001a\u00020#8V@VX\u0096\u008e\u0002\u00a2\u0006\u0014\n\u0005\u0008\u0081\u0001\u00102\u001a\u0004\u0008}\u0010~\"\u0005\u0008\u007f\u0010\u0080\u0001R0\u0010$\u001a\u00020%2\u0006\u0010,\u001a\u00020%8V@VX\u0096\u008e\u0002\u00a2\u0006\u0017\n\u0005\u0008\u0086\u0001\u00102\u001a\u0006\u0008\u0082\u0001\u0010\u0083\u0001\"\u0006\u0008\u0084\u0001\u0010\u0085\u0001R0\u0010&\u001a\u00020\'2\u0006\u0010,\u001a\u00020\'8V@VX\u0096\u008e\u0002\u00a2\u0006\u0017\n\u0005\u0008\u008b\u0001\u00102\u001a\u0006\u0008\u0087\u0001\u0010\u0088\u0001\"\u0006\u0008\u0089\u0001\u0010\u008a\u0001R0\u0010(\u001a\u00020)2\u0006\u0010,\u001a\u00020)8V@VX\u0096\u008e\u0002\u00a2\u0006\u0017\n\u0005\u0008\u0090\u0001\u00102\u001a\u0006\u0008\u008c\u0001\u0010\u008d\u0001\"\u0006\u0008\u008e\u0001\u0010\u008f\u0001\u00a8\u0006\u0092\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;",
        "messageClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;",
        "messageLongClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;",
        "messageRetryListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;",
        "threadClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;",
        "translatedLabelClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnTranslatedLabelClickListener;",
        "attachmentClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;",
        "attachmentDownloadClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;",
        "reactionViewClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;",
        "userClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;",
        "mentionClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;",
        "giphySendListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;",
        "linkClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;",
        "onUnreadLabelReachedListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;",
        "onPollOptionClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;",
        "onShowAllPollOptionClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;",
        "onPollCloseClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;",
        "onViewPollResultClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;",
        "onSuggestPollOptionClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;",
        "onAddPollCommentClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;",
        "onViewPollCommentsClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnTranslatedLabelClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;)V",
        "<set-?>",
        "getMessageClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;",
        "setMessageClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;)V",
        "messageClickListener$delegate",
        "Lio/getstream/chat/android/ui/utils/ListenerDelegate;",
        "getMessageLongClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;",
        "setMessageLongClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;)V",
        "messageLongClickListener$delegate",
        "getMessageRetryListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;",
        "setMessageRetryListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;)V",
        "messageRetryListener$delegate",
        "getThreadClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;",
        "setThreadClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;)V",
        "threadClickListener$delegate",
        "getTranslatedLabelClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnTranslatedLabelClickListener;",
        "translatedLabelClickListener$delegate",
        "getAttachmentClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;",
        "setAttachmentClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;)V",
        "attachmentClickListener$delegate",
        "getAttachmentDownloadClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;",
        "setAttachmentDownloadClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;)V",
        "attachmentDownloadClickListener$delegate",
        "getReactionViewClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;",
        "setReactionViewClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;)V",
        "reactionViewClickListener$delegate",
        "getUserClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;",
        "setUserClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;)V",
        "userClickListener$delegate",
        "getMentionClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;",
        "setMentionClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;)V",
        "mentionClickListener$delegate",
        "getGiphySendListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;",
        "setGiphySendListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;)V",
        "giphySendListener$delegate",
        "getLinkClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;",
        "setLinkClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;)V",
        "linkClickListener$delegate",
        "unreadLabelReachedListener",
        "getUnreadLabelReachedListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;",
        "setUnreadLabelReachedListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;)V",
        "unreadLabelReachedListener$delegate",
        "getOnPollOptionClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;",
        "setOnPollOptionClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;)V",
        "onPollOptionClickListener$delegate",
        "getOnShowAllPollOptionClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;",
        "setOnShowAllPollOptionClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;)V",
        "onShowAllPollOptionClickListener$delegate",
        "getOnPollCloseClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;",
        "setOnPollCloseClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;)V",
        "onPollCloseClickListener$delegate",
        "getOnViewPollResultClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;",
        "setOnViewPollResultClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;)V",
        "onViewPollResultClickListener$delegate",
        "getOnSuggestPollOptionClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;",
        "setOnSuggestPollOptionClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;)V",
        "onSuggestPollOptionClickListener$delegate",
        "getOnAddPollCommentClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;",
        "setOnAddPollCommentClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;)V",
        "onAddPollCommentClickListener$delegate",
        "getOnViewPollCommentsClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;",
        "setOnViewPollCommentsClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;)V",
        "onViewPollCommentsClickListener$delegate",
        "EmptyFunctions",
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


# static fields
.field static final synthetic $$delegatedProperties:[Lj93/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lj93/z;"
        }
    .end annotation
.end field


# instance fields
.field private final attachmentClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

.field private final attachmentDownloadClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

.field private final giphySendListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

.field private final linkClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

.field private final mentionClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

.field private final messageClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

.field private final messageLongClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

.field private final messageRetryListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

.field private final onAddPollCommentClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

.field private final onPollCloseClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

.field private final onPollOptionClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

.field private final onShowAllPollOptionClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

.field private final onSuggestPollOptionClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

.field private final onViewPollCommentsClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

.field private final onViewPollResultClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

.field private final reactionViewClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

.field private final threadClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

.field private final translatedLabelClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

.field private final unreadLabelReachedListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

.field private final userClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;


# direct methods
.method static constructor <clinit>()V
    .locals 24

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;

    const-string v2, "messageClickListener"

    const-string v3, "getMessageClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    const-string v3, "messageLongClickListener"

    const-string v5, "getMessageLongClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;"

    invoke-static {v1, v3, v5, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v3

    const-string v5, "messageRetryListener"

    const-string v6, "getMessageRetryListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;"

    invoke-static {v1, v5, v6, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v5

    const-string v6, "threadClickListener"

    const-string v7, "getThreadClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;"

    invoke-static {v1, v6, v7, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v6

    const-string v7, "translatedLabelClickListener"

    const-string v8, "getTranslatedLabelClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnTranslatedLabelClickListener;"

    invoke-static {v1, v7, v8, v4, v2}, Lr80/c;->h(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/w;

    move-result-object v7

    const-string v8, "attachmentClickListener"

    const-string v9, "getAttachmentClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;"

    invoke-static {v1, v8, v9, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v8

    const-string v9, "attachmentDownloadClickListener"

    const-string v10, "getAttachmentDownloadClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;"

    invoke-static {v1, v9, v10, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v9

    const-string v10, "reactionViewClickListener"

    const-string v11, "getReactionViewClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;"

    invoke-static {v1, v10, v11, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v10

    const-string v11, "userClickListener"

    const-string v12, "getUserClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;"

    invoke-static {v1, v11, v12, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v11

    const-string v12, "mentionClickListener"

    const-string v13, "getMentionClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;"

    invoke-static {v1, v12, v13, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v12

    const-string v13, "giphySendListener"

    const-string v14, "getGiphySendListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;"

    invoke-static {v1, v13, v14, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v13

    const-string v14, "linkClickListener"

    const-string v15, "getLinkClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;"

    invoke-static {v1, v14, v15, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v14

    const-string v15, "unreadLabelReachedListener"

    move-object/from16 v16, v0

    const-string v0, "getUnreadLabelReachedListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;"

    invoke-static {v1, v15, v0, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v0

    const-string v15, "onPollOptionClickListener"

    move-object/from16 v17, v0

    const-string v0, "getOnPollOptionClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;"

    invoke-static {v1, v15, v0, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v0

    const-string v15, "onShowAllPollOptionClickListener"

    move-object/from16 v18, v0

    const-string v0, "getOnShowAllPollOptionClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;"

    invoke-static {v1, v15, v0, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v0

    const-string v15, "onPollCloseClickListener"

    move-object/from16 v19, v0

    const-string v0, "getOnPollCloseClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;"

    invoke-static {v1, v15, v0, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v0

    const-string v15, "onViewPollResultClickListener"

    move-object/from16 v20, v0

    const-string v0, "getOnViewPollResultClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;"

    invoke-static {v1, v15, v0, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v0

    const-string v15, "onSuggestPollOptionClickListener"

    move-object/from16 v21, v0

    const-string v0, "getOnSuggestPollOptionClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;"

    invoke-static {v1, v15, v0, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v0

    const-string v15, "onAddPollCommentClickListener"

    move-object/from16 v22, v0

    const-string v0, "getOnAddPollCommentClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;"

    invoke-static {v1, v15, v0, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v0

    const-string v15, "onViewPollCommentsClickListener"

    move-object/from16 v23, v0

    const-string v0, "getOnViewPollCommentsClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;"

    invoke-static {v1, v15, v0, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v0

    const/16 v1, 0x14

    new-array v1, v1, [Lj93/z;

    aput-object v16, v1, v4

    const/4 v2, 0x1

    aput-object v3, v1, v2

    const/4 v2, 0x2

    aput-object v5, v1, v2

    const/4 v2, 0x3

    aput-object v6, v1, v2

    const/4 v2, 0x4

    aput-object v7, v1, v2

    const/4 v2, 0x5

    aput-object v8, v1, v2

    const/4 v2, 0x6

    aput-object v9, v1, v2

    const/4 v2, 0x7

    aput-object v10, v1, v2

    const/16 v2, 0x8

    aput-object v11, v1, v2

    const/16 v2, 0x9

    aput-object v12, v1, v2

    const/16 v2, 0xa

    aput-object v13, v1, v2

    const/16 v2, 0xb

    aput-object v14, v1, v2

    const/16 v2, 0xc

    aput-object v17, v1, v2

    const/16 v2, 0xd

    aput-object v18, v1, v2

    const/16 v2, 0xe

    aput-object v19, v1, v2

    const/16 v2, 0xf

    aput-object v20, v1, v2

    const/16 v2, 0x10

    aput-object v21, v1, v2

    const/16 v2, 0x11

    aput-object v22, v1, v2

    const/16 v2, 0x12

    aput-object v23, v1, v2

    const/16 v2, 0x13

    aput-object v0, v1, v2

    sput-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnTranslatedLabelClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;)V
    .locals 16

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    const-string v0, "messageClickListener"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageLongClickListener"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageRetryListener"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "threadClickListener"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "translatedLabelClickListener"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachmentClickListener"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachmentDownloadClickListener"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reactionViewClickListener"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userClickListener"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mentionClickListener"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "giphySendListener"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "linkClickListener"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onUnreadLabelReachedListener"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPollOptionClickListener"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onShowAllPollOptionClickListener"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onPollCloseClickListener"

    move-object/from16 v15, p16

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewPollResultClickListener"

    move-object/from16 v15, p17

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSuggestPollOptionClickListener"

    move-object/from16 v15, p18

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onAddPollCommentClickListener"

    move-object/from16 v15, p19

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewPollCommentsClickListener"

    move-object/from16 v15, p20

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 3
    new-instance v15, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;

    const/4 v14, 0x1

    invoke-direct {v15, v14}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;-><init>(I)V

    .line 4
    invoke-direct {v0, v1, v15}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    move-object/from16 v1, p0

    iput-object v0, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->messageClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 5
    new-instance v0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 6
    new-instance v14, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;

    const/16 v15, 0xc

    invoke-direct {v14, v15}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;-><init>(I)V

    .line 7
    invoke-direct {v0, v2, v14}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->messageLongClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 8
    new-instance v0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 9
    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;

    const/16 v14, 0xd

    invoke-direct {v2, v14}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;-><init>(I)V

    .line 10
    invoke-direct {v0, v3, v2}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->messageRetryListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 11
    new-instance v0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 12
    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;

    const/16 v3, 0xe

    invoke-direct {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;-><init>(I)V

    .line 13
    invoke-direct {v0, v4, v2}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->threadClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 14
    new-instance v0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 15
    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;

    const/16 v3, 0xf

    invoke-direct {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;-><init>(I)V

    .line 16
    invoke-direct {v0, v5, v2}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->translatedLabelClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 17
    new-instance v0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 18
    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;

    const/16 v3, 0x10

    invoke-direct {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;-><init>(I)V

    .line 19
    invoke-direct {v0, v6, v2}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->attachmentClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 20
    new-instance v0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 21
    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;

    const/16 v3, 0x11

    invoke-direct {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;-><init>(I)V

    .line 22
    invoke-direct {v0, v7, v2}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->attachmentDownloadClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 23
    new-instance v0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 24
    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;

    const/16 v3, 0x12

    invoke-direct {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;-><init>(I)V

    .line 25
    invoke-direct {v0, v8, v2}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->reactionViewClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 26
    new-instance v0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 27
    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;

    const/16 v3, 0x13

    invoke-direct {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;-><init>(I)V

    .line 28
    invoke-direct {v0, v9, v2}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->userClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 29
    new-instance v0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 30
    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;-><init>(I)V

    .line 31
    invoke-direct {v0, v10, v2}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->mentionClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 32
    new-instance v0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 33
    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;-><init>(I)V

    .line 34
    invoke-direct {v0, v11, v2}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->giphySendListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 35
    new-instance v0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 36
    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;-><init>(I)V

    .line 37
    invoke-direct {v0, v12, v2}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->linkClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 38
    new-instance v0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 39
    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;

    const/4 v3, 0x4

    invoke-direct {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;-><init>(I)V

    .line 40
    invoke-direct {v0, v13, v2}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->unreadLabelReachedListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 41
    new-instance v0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 42
    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;

    const/4 v3, 0x5

    invoke-direct {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;-><init>(I)V

    move-object/from16 v14, p14

    .line 43
    invoke-direct {v0, v14, v2}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onPollOptionClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 44
    new-instance v0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 45
    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;-><init>(I)V

    move-object/from16 v15, p15

    .line 46
    invoke-direct {v0, v15, v2}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onShowAllPollOptionClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 47
    new-instance v0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 48
    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;-><init>(I)V

    move-object/from16 v15, p16

    .line 49
    invoke-direct {v0, v15, v2}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onPollCloseClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 50
    new-instance v0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 51
    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;-><init>(I)V

    move-object/from16 v15, p17

    .line 52
    invoke-direct {v0, v15, v2}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onViewPollResultClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 53
    new-instance v0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 54
    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;-><init>(I)V

    move-object/from16 v15, p18

    .line 55
    invoke-direct {v0, v15, v2}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onSuggestPollOptionClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 56
    new-instance v0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 57
    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;-><init>(I)V

    move-object/from16 v15, p19

    .line 58
    invoke-direct {v0, v15, v2}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onAddPollCommentClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 59
    new-instance v0, Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    .line 60
    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;

    const/16 v3, 0xb

    invoke-direct {v2, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/w;-><init>(I)V

    move-object/from16 v15, p20

    .line 61
    invoke-direct {v0, v15, v2}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onViewPollCommentsClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnTranslatedLabelClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 24

    move/from16 v0, p21

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 62
    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->getONE_PARAM()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$sam$io_getstream_chat_android_ui_feature_messages_list_MessageListView_OnMessageClickListener$0;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$sam$io_getstream_chat_android_ui_feature_messages_list_MessageListView_OnMessageClickListener$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object v4, v2

    goto :goto_0

    :cond_0
    move-object/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    .line 63
    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->getONE_PARAM()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$sam$io_getstream_chat_android_ui_feature_messages_list_MessageListView_OnMessageLongClickListener$0;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$sam$io_getstream_chat_android_ui_feature_messages_list_MessageListView_OnMessageLongClickListener$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object v5, v2

    goto :goto_1

    :cond_1
    move-object/from16 v5, p2

    :goto_1
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    .line 64
    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->getONE_PARAM()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$sam$io_getstream_chat_android_ui_feature_messages_list_MessageListView_OnMessageRetryListener$0;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$sam$io_getstream_chat_android_ui_feature_messages_list_MessageListView_OnMessageRetryListener$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object v6, v2

    goto :goto_2

    :cond_2
    move-object/from16 v6, p3

    :goto_2
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_3

    .line 65
    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->getONE_PARAM()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$sam$io_getstream_chat_android_ui_feature_messages_list_MessageListView_OnThreadClickListener$0;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$sam$io_getstream_chat_android_ui_feature_messages_list_MessageListView_OnThreadClickListener$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object v7, v2

    goto :goto_3

    :cond_3
    move-object/from16 v7, p4

    :goto_3
    and-int/lit8 v1, v0, 0x10

    if-eqz v1, :cond_4

    .line 66
    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->getONE_PARAM()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$sam$io_getstream_chat_android_ui_feature_messages_list_MessageListView_OnTranslatedLabelClickListener$0;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$sam$io_getstream_chat_android_ui_feature_messages_list_MessageListView_OnTranslatedLabelClickListener$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object v8, v2

    goto :goto_4

    :cond_4
    move-object/from16 v8, p5

    :goto_4
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_5

    .line 67
    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->getTWO_PARAM()Lc93/m;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$sam$io_getstream_chat_android_ui_feature_messages_list_MessageListView_OnAttachmentClickListener$0;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$sam$io_getstream_chat_android_ui_feature_messages_list_MessageListView_OnAttachmentClickListener$0;-><init>(Lc93/m;)V

    move-object v9, v2

    goto :goto_5

    :cond_5
    move-object/from16 v9, p6

    :goto_5
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_6

    .line 68
    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->getONE_PARAM()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$sam$io_getstream_chat_android_ui_feature_messages_list_MessageListView_OnAttachmentDownloadClickListener$0;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$sam$io_getstream_chat_android_ui_feature_messages_list_MessageListView_OnAttachmentDownloadClickListener$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object v10, v2

    goto :goto_6

    :cond_6
    move-object/from16 v10, p7

    :goto_6
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_7

    .line 69
    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->getONE_PARAM()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$sam$io_getstream_chat_android_ui_feature_messages_list_MessageListView_OnReactionViewClickListener$0;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$sam$io_getstream_chat_android_ui_feature_messages_list_MessageListView_OnReactionViewClickListener$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object v11, v2

    goto :goto_7

    :cond_7
    move-object/from16 v11, p8

    :goto_7
    and-int/lit16 v1, v0, 0x100

    if-eqz v1, :cond_8

    .line 70
    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->getONE_PARAM()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$sam$io_getstream_chat_android_ui_feature_messages_list_MessageListView_OnUserClickListener$0;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$sam$io_getstream_chat_android_ui_feature_messages_list_MessageListView_OnUserClickListener$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object v12, v2

    goto :goto_8

    :cond_8
    move-object/from16 v12, p9

    :goto_8
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_9

    .line 71
    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->getONE_PARAM()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$sam$io_getstream_chat_android_ui_feature_messages_list_MessageListView_OnMentionClickListener$0;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$sam$io_getstream_chat_android_ui_feature_messages_list_MessageListView_OnMentionClickListener$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object v13, v2

    goto :goto_9

    :cond_9
    move-object/from16 v13, p10

    :goto_9
    and-int/lit16 v1, v0, 0x400

    if-eqz v1, :cond_a

    .line 72
    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->getONE_PARAM()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$sam$io_getstream_chat_android_ui_feature_messages_list_MessageListView_OnGiphySendListener$0;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$sam$io_getstream_chat_android_ui_feature_messages_list_MessageListView_OnGiphySendListener$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object v14, v2

    goto :goto_a

    :cond_a
    move-object/from16 v14, p11

    :goto_a
    and-int/lit16 v1, v0, 0x800

    if-eqz v1, :cond_b

    .line 73
    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$EmptyFunctions;->getONE_PARAM()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$sam$io_getstream_chat_android_ui_feature_messages_list_MessageListView_OnLinkClickListener$0;

    invoke-direct {v2, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl$sam$io_getstream_chat_android_ui_feature_messages_list_MessageListView_OnLinkClickListener$0;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object v15, v2

    goto :goto_b

    :cond_b
    move-object/from16 v15, p12

    :goto_b
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    .line 74
    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/o;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v16, v0

    :goto_c
    move-object/from16 v3, p0

    move-object/from16 v17, p14

    move-object/from16 v18, p15

    move-object/from16 v19, p16

    move-object/from16 v20, p17

    move-object/from16 v21, p18

    move-object/from16 v22, p19

    move-object/from16 v23, p20

    goto :goto_d

    :cond_c
    move-object/from16 v16, p13

    goto :goto_c

    .line 75
    :goto_d
    invoke-direct/range {v3 .. v23}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnTranslatedLabelClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;)V

    return-void
.end method

.method public static synthetic A(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/f;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onShowAllPollOptionClickListener_delegate$lambda$30(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/f;

    return-object p0
.end method

.method public static synthetic B(Lc93/a;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onViewPollCommentsClickListener_delegate$lambda$40$lambda$39(Lc93/a;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;)Z

    move-result p0

    return p0
.end method

.method public static synthetic C(Lc93/a;Lio/getstream/chat/android/models/Message;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->messageLongClickListener_delegate$lambda$4$lambda$3(Lc93/a;Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method public static synthetic D(Lc93/a;Lio/getstream/chat/android/models/Poll;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onPollCloseClickListener_delegate$lambda$32$lambda$31(Lc93/a;Lio/getstream/chat/android/models/Poll;)Z

    move-result p0

    return p0
.end method

.method public static synthetic E(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/l;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->userClickListener_delegate$lambda$18(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/l;

    return-object p0
.end method

.method public static synthetic F(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/h;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->threadClickListener_delegate$lambda$8(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/h;

    return-object p0
.end method

.method public static synthetic G(Lc93/a;Lio/getstream/chat/android/models/Message;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->translatedLabelClickListener_delegate$lambda$10$lambda$9(Lc93/a;Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method public static synthetic H(Lc93/a;Lio/getstream/chat/android/models/Poll;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onSuggestPollOptionClickListener_delegate$lambda$36$lambda$35(Lc93/a;Lio/getstream/chat/android/models/Poll;)Z

    move-result p0

    return p0
.end method

.method public static synthetic I(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/j;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->reactionViewClickListener_delegate$lambda$16(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/j;

    return-object p0
.end method

.method public static synthetic J(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/u;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->giphySendListener_delegate$lambda$22(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/u;

    return-object p0
.end method

.method public static synthetic K(Lc93/a;Lio/getstream/chat/android/models/Attachment;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->attachmentDownloadClickListener_delegate$lambda$14$lambda$13(Lc93/a;Lio/getstream/chat/android/models/Attachment;)Z

    move-result p0

    return p0
.end method

.method public static synthetic L(Lc93/a;Lio/getstream/chat/android/models/Poll;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onViewPollResultClickListener_delegate$lambda$34$lambda$33(Lc93/a;Lio/getstream/chat/android/models/Poll;)Z

    move-result p0

    return p0
.end method

.method public static synthetic M(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/n;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->unreadLabelReachedListener_delegate$lambda$26(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/n;

    return-object p0
.end method

.method private static final _init_$lambda$0()V
    .locals 0

    return-void
.end method

.method public static synthetic a(Lc93/a;Lio/getstream/chat/android/models/Message;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->messageClickListener_delegate$lambda$2$lambda$1(Lc93/a;Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method private static final attachmentClickListener_delegate$lambda$12(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;
    .locals 1

    const-string v0, "realListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/d;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/d;-><init>(Lc93/a;)V

    return-object v0
.end method

.method private static final attachmentClickListener_delegate$lambda$12$lambda$11(Lc93/a;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Attachment;)Z
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachment"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;

    invoke-interface {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;->onAttachmentClick(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Attachment;)Z

    move-result p0

    return p0
.end method

.method private static final attachmentDownloadClickListener_delegate$lambda$14(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;
    .locals 1

    const-string v0, "realListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/g;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/g;-><init>(Lc93/a;)V

    return-object v0
.end method

.method private static final attachmentDownloadClickListener_delegate$lambda$14$lambda$13(Lc93/a;Lio/getstream/chat/android/models/Attachment;)Z
    .locals 1

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;->onAttachmentDownloadClick(Lio/getstream/chat/android/models/Attachment;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lc93/a;Ljava/lang/String;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->linkClickListener_delegate$lambda$24$lambda$23(Lc93/a;Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/p;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onPollCloseClickListener_delegate$lambda$32(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/p;

    return-object p0
.end method

.method public static synthetic d(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/c;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->translatedLabelClickListener_delegate$lambda$10(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnTranslatedLabelClickListener;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/c;

    return-object p0
.end method

.method public static synthetic e(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/q;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onPollOptionClickListener_delegate$lambda$28(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/q;

    return-object p0
.end method

.method public static synthetic f(Lc93/a;Lio/getstream/chat/android/models/User;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->mentionClickListener_delegate$lambda$20$lambda$19(Lc93/a;Lio/getstream/chat/android/models/User;)Z

    move-result p0

    return p0
.end method

.method public static synthetic g(Lc93/a;Lio/getstream/chat/android/models/Message;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->reactionViewClickListener_delegate$lambda$16$lambda$15(Lc93/a;Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method private static final giphySendListener_delegate$lambda$22(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;
    .locals 1

    const-string v0, "realListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/u;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/u;-><init>(Lc93/a;)V

    return-object v0
.end method

.method private static final giphySendListener_delegate$lambda$22$lambda$21(Lc93/a;Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;)Z
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;->onGiphySend(Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;)Z

    move-result p0

    return p0
.end method

.method public static synthetic h(Lc93/a;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onPollOptionClickListener_delegate$lambda$28$lambda$27(Lc93/a;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)Z

    move-result p0

    return p0
.end method

.method public static synthetic i(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/s;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->messageRetryListener_delegate$lambda$6(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/s;

    return-object p0
.end method

.method public static synthetic j(Lc93/a;Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->giphySendListener_delegate$lambda$22$lambda$21(Lc93/a;Lio/getstream/chat/android/ui/common/state/messages/list/GiphyAction;)Z

    move-result p0

    return p0
.end method

.method public static synthetic k(Lc93/a;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onShowAllPollOptionClickListener_delegate$lambda$30$lambda$29(Lc93/a;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;)Z

    move-result p0

    return p0
.end method

.method public static synthetic l(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/g;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->attachmentDownloadClickListener_delegate$lambda$14(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/g;

    return-object p0
.end method

.method private static final linkClickListener_delegate$lambda$24(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;
    .locals 1

    const-string v0, "realListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/v;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/v;-><init>(Lc93/a;)V

    return-object v0
.end method

.method private static final linkClickListener_delegate$lambda$24$lambda$23(Lc93/a;Ljava/lang/String;)Z
    .locals 1

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;->onLinkClick(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static synthetic m(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/i;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onAddPollCommentClickListener_delegate$lambda$38(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/i;

    return-object p0
.end method

.method private static final mentionClickListener_delegate$lambda$20(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;
    .locals 1

    const-string v0, "realListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/t;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/t;-><init>(Lc93/a;)V

    return-object v0
.end method

.method private static final mentionClickListener_delegate$lambda$20$lambda$19(Lc93/a;Lio/getstream/chat/android/models/User;)Z
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;->onMentionClick(Lio/getstream/chat/android/models/User;)Z

    move-result p0

    return p0
.end method

.method private static final messageClickListener_delegate$lambda$2(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;
    .locals 1

    const-string v0, "realListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/e;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/e;-><init>(Lc93/a;)V

    return-object v0
.end method

.method private static final messageClickListener_delegate$lambda$2$lambda$1(Lc93/a;Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;->onMessageClick(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method private static final messageLongClickListener_delegate$lambda$4(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;
    .locals 1

    const-string v0, "realListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/m;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/m;-><init>(Lc93/a;)V

    return-object v0
.end method

.method private static final messageLongClickListener_delegate$lambda$4$lambda$3(Lc93/a;Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;->onMessageLongClick(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method private static final messageRetryListener_delegate$lambda$6(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;
    .locals 1

    const-string v0, "realListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/s;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/s;-><init>(Lc93/a;)V

    return-object v0
.end method

.method private static final messageRetryListener_delegate$lambda$6$lambda$5(Lc93/a;Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;->onRetryMessage(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method public static synthetic n(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/k;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onViewPollResultClickListener_delegate$lambda$34(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/k;

    return-object p0
.end method

.method public static synthetic o(Lc93/a;Lio/getstream/chat/android/models/Message;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->messageRetryListener_delegate$lambda$6$lambda$5(Lc93/a;Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method private static final onAddPollCommentClickListener_delegate$lambda$38(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;
    .locals 1

    const-string v0, "realListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/i;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/i;-><init>(Lc93/a;)V

    return-object v0
.end method

.method private static final onAddPollCommentClickListener_delegate$lambda$38$lambda$37(Lc93/a;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;)Z
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "poll"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;

    invoke-interface {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;->onAddPollCommentClick(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;)Z

    move-result p0

    return p0
.end method

.method private static final onPollCloseClickListener_delegate$lambda$32(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;
    .locals 1

    const-string v0, "realListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/p;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/p;-><init>(Lc93/a;)V

    return-object v0
.end method

.method private static final onPollCloseClickListener_delegate$lambda$32$lambda$31(Lc93/a;Lio/getstream/chat/android/models/Poll;)Z
    .locals 1

    const-string v0, "poll"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;->onPollCloseClick(Lio/getstream/chat/android/models/Poll;)Z

    move-result p0

    return p0
.end method

.method private static final onPollOptionClickListener_delegate$lambda$28(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;
    .locals 1

    const-string v0, "realListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/q;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/q;-><init>(Lc93/a;)V

    return-object v0
.end method

.method private static final onPollOptionClickListener_delegate$lambda$28$lambda$27(Lc93/a;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)Z
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "poll"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "option"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;

    invoke-interface {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;->onPollOptionClick(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;Lio/getstream/chat/android/models/Option;)Z

    move-result p0

    return p0
.end method

.method private static final onShowAllPollOptionClickListener_delegate$lambda$30(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;
    .locals 1

    const-string v0, "realListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/f;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/f;-><init>(Lc93/a;)V

    return-object v0
.end method

.method private static final onShowAllPollOptionClickListener_delegate$lambda$30$lambda$29(Lc93/a;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;)Z
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "poll"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;

    invoke-interface {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;->onShowAllPollOptionClick(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;)Z

    move-result p0

    return p0
.end method

.method private static final onSuggestPollOptionClickListener_delegate$lambda$36(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;
    .locals 1

    const-string v0, "realListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/r;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/r;-><init>(Lc93/a;)V

    return-object v0
.end method

.method private static final onSuggestPollOptionClickListener_delegate$lambda$36$lambda$35(Lc93/a;Lio/getstream/chat/android/models/Poll;)Z
    .locals 1

    const-string v0, "poll"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;->onSuggestPollOptionClick(Lio/getstream/chat/android/models/Poll;)Z

    move-result p0

    return p0
.end method

.method private static final onViewPollCommentsClickListener_delegate$lambda$40(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;
    .locals 1

    const-string v0, "realListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/b;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/b;-><init>(Lc93/a;)V

    return-object v0
.end method

.method private static final onViewPollCommentsClickListener_delegate$lambda$40$lambda$39(Lc93/a;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;)Z
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "poll"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;

    invoke-interface {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;->onViewPollCommentsClick(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;)Z

    move-result p0

    return p0
.end method

.method private static final onViewPollResultClickListener_delegate$lambda$34(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;
    .locals 1

    const-string v0, "realListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/k;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/k;-><init>(Lc93/a;)V

    return-object v0
.end method

.method private static final onViewPollResultClickListener_delegate$lambda$34$lambda$33(Lc93/a;Lio/getstream/chat/android/models/Poll;)Z
    .locals 1

    const-string v0, "poll"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;->onViewPollResultClick(Lio/getstream/chat/android/models/Poll;)Z

    move-result p0

    return p0
.end method

.method public static synthetic p(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/d;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->attachmentClickListener_delegate$lambda$12(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/d;

    return-object p0
.end method

.method public static synthetic q(Lc93/a;Lio/getstream/chat/android/models/User;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->userClickListener_delegate$lambda$18$lambda$17(Lc93/a;Lio/getstream/chat/android/models/User;)Z

    move-result p0

    return p0
.end method

.method public static synthetic r(Lc93/a;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onAddPollCommentClickListener_delegate$lambda$38$lambda$37(Lc93/a;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Poll;)Z

    move-result p0

    return p0
.end method

.method private static final reactionViewClickListener_delegate$lambda$16(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;
    .locals 1

    const-string v0, "realListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/j;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/j;-><init>(Lc93/a;)V

    return-object v0
.end method

.method private static final reactionViewClickListener_delegate$lambda$16$lambda$15(Lc93/a;Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;->onReactionViewClick(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method public static synthetic s(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/r;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onSuggestPollOptionClickListener_delegate$lambda$36(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/r;

    return-object p0
.end method

.method public static synthetic t(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/v;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->linkClickListener_delegate$lambda$24(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/v;

    return-object p0
.end method

.method private static final threadClickListener_delegate$lambda$8(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;
    .locals 1

    const-string v0, "realListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/h;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/h;-><init>(Lc93/a;)V

    return-object v0
.end method

.method private static final threadClickListener_delegate$lambda$8$lambda$7(Lc93/a;Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;->onThreadClick(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method private static final translatedLabelClickListener_delegate$lambda$10(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnTranslatedLabelClickListener;
    .locals 1

    const-string v0, "realListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/c;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/c;-><init>(Lc93/a;)V

    return-object v0
.end method

.method private static final translatedLabelClickListener_delegate$lambda$10$lambda$9(Lc93/a;Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnTranslatedLabelClickListener;

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnTranslatedLabelClickListener;->onTranslatedLabelClick(Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method public static synthetic u(Lc93/a;Lio/getstream/chat/android/models/Message;)Z
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->threadClickListener_delegate$lambda$8$lambda$7(Lc93/a;Lio/getstream/chat/android/models/Message;)Z

    move-result p0

    return p0
.end method

.method private static final unreadLabelReachedListener_delegate$lambda$26(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;
    .locals 1

    const-string v0, "realListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/n;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/n;-><init>(Lc93/a;)V

    return-object v0
.end method

.method private static final unreadLabelReachedListener_delegate$lambda$26$lambda$25(Lc93/a;)V
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;->onUnreadLabelReached()V

    return-void
.end method

.method private static final userClickListener_delegate$lambda$18(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;
    .locals 1

    const-string v0, "realListener"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/l;

    invoke-direct {v0, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/l;-><init>(Lc93/a;)V

    return-object v0
.end method

.method private static final userClickListener_delegate$lambda$18$lambda$17(Lc93/a;Lio/getstream/chat/android/models/User;)Z
    .locals 1

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;->onUserClick(Lio/getstream/chat/android/models/User;)Z

    move-result p0

    return p0
.end method

.method public static synthetic v(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/e;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->messageClickListener_delegate$lambda$2(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/e;

    return-object p0
.end method

.method public static synthetic w(Lc93/a;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Attachment;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->attachmentClickListener_delegate$lambda$12$lambda$11(Lc93/a;Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Attachment;)Z

    move-result p0

    return p0
.end method

.method public static synthetic x(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/m;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->messageLongClickListener_delegate$lambda$4(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/m;

    return-object p0
.end method

.method public static synthetic y(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/t;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->mentionClickListener_delegate$lambda$20(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/t;

    return-object p0
.end method

.method public static synthetic z(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/b;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onViewPollCommentsClickListener_delegate$lambda$40(Lc93/a;)Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/b;

    return-object p0
.end method


# virtual methods
.method public final getAttachmentClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->attachmentClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;

    return-object v0
.end method

.method public final getAttachmentDownloadClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->attachmentDownloadClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;

    return-object v0
.end method

.method public final getGiphySendListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->giphySendListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;

    return-object v0
.end method

.method public final getLinkClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->linkClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/16 v2, 0xb

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;

    return-object v0
.end method

.method public final getMentionClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->mentionClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;

    return-object v0
.end method

.method public final getMessageClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->messageClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;

    return-object v0
.end method

.method public final getMessageLongClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->messageLongClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;

    return-object v0
.end method

.method public final getMessageRetryListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->messageRetryListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;

    return-object v0
.end method

.method public final getOnAddPollCommentClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onAddPollCommentClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/16 v2, 0x12

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;

    return-object v0
.end method

.method public final getOnPollCloseClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onPollCloseClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/16 v2, 0xf

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;

    return-object v0
.end method

.method public final getOnPollOptionClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onPollOptionClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/16 v2, 0xd

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;

    return-object v0
.end method

.method public final getOnShowAllPollOptionClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onShowAllPollOptionClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/16 v2, 0xe

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;

    return-object v0
.end method

.method public final getOnSuggestPollOptionClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onSuggestPollOptionClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/16 v2, 0x11

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;

    return-object v0
.end method

.method public final getOnViewPollCommentsClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onViewPollCommentsClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/16 v2, 0x13

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;

    return-object v0
.end method

.method public final getOnViewPollResultClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onViewPollResultClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/16 v2, 0x10

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;

    return-object v0
.end method

.method public final getReactionViewClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->reactionViewClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x7

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;

    return-object v0
.end method

.method public final getThreadClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->threadClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;

    return-object v0
.end method

.method public final getTranslatedLabelClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnTranslatedLabelClickListener;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->translatedLabelClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x4

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnTranslatedLabelClickListener;

    return-object v0
.end method

.method public final getUnreadLabelReachedListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->unreadLabelReachedListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/16 v2, 0xc

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;

    return-object v0
.end method

.method public final getUserClickListener()Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->userClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/16 v2, 0x8

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;

    return-object v0
.end method

.method public final setAttachmentClickListener(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentClickListener;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->attachmentClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final setAttachmentDownloadClickListener(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAttachmentDownloadClickListener;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->attachmentDownloadClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x6

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final setGiphySendListener(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnGiphySendListener;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->giphySendListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/16 v2, 0xa

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final setLinkClickListener(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnLinkClickListener;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->linkClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/16 v2, 0xb

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final setMentionClickListener(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMentionClickListener;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->mentionClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/16 v2, 0x9

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final setMessageClickListener(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageClickListener;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->messageClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final setMessageLongClickListener(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageLongClickListener;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->messageLongClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final setMessageRetryListener(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnMessageRetryListener;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->messageRetryListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x2

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final setOnAddPollCommentClickListener(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnAddPollCommentClickListener;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onAddPollCommentClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/16 v2, 0x12

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final setOnPollCloseClickListener(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollCloseClickListener;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onPollCloseClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/16 v2, 0xf

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final setOnPollOptionClickListener(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnPollOptionClickListener;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onPollOptionClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/16 v2, 0xd

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final setOnShowAllPollOptionClickListener(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnShowAllPollOptionClickListener;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onShowAllPollOptionClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/16 v2, 0xe

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final setOnSuggestPollOptionClickListener(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnSuggestPollOptionClickListener;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onSuggestPollOptionClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/16 v2, 0x11

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final setOnViewPollCommentsClickListener(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollCommentsClickListener;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onViewPollCommentsClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/16 v2, 0x13

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final setOnViewPollResultClickListener(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnViewPollResultClickListener;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->onViewPollResultClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/16 v2, 0x10

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final setReactionViewClickListener(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnReactionViewClickListener;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->reactionViewClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x7

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final setThreadClickListener(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnThreadClickListener;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->threadClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x3

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final setUnreadLabelReachedListener(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUnreadLabelReachedListener;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->unreadLabelReachedListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/16 v2, 0xc

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final setUserClickListener(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnUserClickListener;)V
    .locals 3

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->userClickListener$delegate:Lio/getstream/chat/android/ui/utils/ListenerDelegate;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListenersImpl;->$$delegatedProperties:[Lj93/z;

    const/16 v2, 0x8

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lio/getstream/chat/android/ui/utils/ListenerDelegate;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method
