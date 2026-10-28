.class public final Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$Companion;,
        Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$MessageReadListener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 [2\u00020\u0001:\u0002\\[B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000eH\u0000\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J/\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u000f\u0010\"\u001a\u00020!H\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008$\u0010%J\u0017\u0010&\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008&\u0010\'J\u001f\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008)\u0010*J/\u0010,\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008,\u0010-J\u000f\u0010.\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008.\u0010%J\u0013\u00100\u001a\u00020\u0006*\u00020/H\u0002\u00a2\u0006\u0004\u00080\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u00104R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u00105R\u001b\u0010;\u001a\u0002068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00087\u00108\u001a\u0004\u00089\u0010:R+\u0010B\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00068@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008=\u0010>\u001a\u0004\u0008?\u0010%\"\u0004\u0008@\u0010AR+\u0010F\u001a\u00020\u00062\u0006\u0010<\u001a\u00020\u00068@@@X\u0080\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008C\u0010>\u001a\u0004\u0008D\u0010%\"\u0004\u0008E\u0010AR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010GR\"\u0010H\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008H\u00104\u001a\u0004\u0008I\u0010%\"\u0004\u0008J\u0010AR\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u00104R\u0016\u0010K\u001a\u00020!8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008K\u0010LR$\u0010+\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u00068\u0002@BX\u0082\u000e\u00a2\u0006\u000c\n\u0004\u0008+\u00104\"\u0004\u0008N\u0010AR\u0014\u0010R\u001a\u00020O8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008P\u0010QR\u0014\u0010V\u001a\u00020S8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008T\u0010UR\u001a\u0010Z\u001a\u0008\u0012\u0004\u0012\u00020/0W8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008X\u0010Y\u00a8\u0006]"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;",
        "",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "recyclerView",
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;",
        "scrollButtonView",
        "",
        "disableScrollWhenShowingDialog",
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$MessageReadListener;",
        "callback",
        "<init>",
        "(Landroidx/recyclerview/widget/RecyclerView;Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;ZLio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$MessageReadListener;)V",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "Ll83/a0;",
        "scrollToMessage$stream_chat_android_ui_components_release",
        "(Lio/getstream/chat/android/models/Message;)V",
        "scrollToMessage",
        "scrollToBottom$stream_chat_android_ui_components_release",
        "()V",
        "scrollToBottom",
        "isThreadStart",
        "hasNewMessages",
        "isInitialList",
        "endOfNewMessagesReached",
        "onMessageListChanged$stream_chat_android_ui_components_release",
        "(ZZZZ)V",
        "onMessageListChanged",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnScrollToBottomHandler;",
        "onScrollToBottomHandler",
        "setScrollToBottomHandler$stream_chat_android_ui_components_release",
        "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnScrollToBottomHandler;)V",
        "setScrollToBottomHandler",
        "",
        "calculateBottomOffset",
        "()I",
        "shouldScrollToBottomBeVisible",
        "()Z",
        "stopScrollIfPopupShown",
        "(Landroidx/recyclerview/widget/RecyclerView;)V",
        "areNewestMessagesLoaded",
        "shouldKeepScrollPosition",
        "(ZZ)Z",
        "isAtBottom",
        "shouldScrollToBottom",
        "(ZZZZ)Z",
        "isLastMessageMine",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
        "isValid",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)Z",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;",
        "Z",
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$MessageReadListener;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "<set-?>",
        "alwaysScrollToBottom$delegate",
        "Lf93/d;",
        "getAlwaysScrollToBottom$stream_chat_android_ui_components_release",
        "setAlwaysScrollToBottom$stream_chat_android_ui_components_release",
        "(Z)V",
        "alwaysScrollToBottom",
        "scrollToBottomButtonEnabled$delegate",
        "getScrollToBottomButtonEnabled$stream_chat_android_ui_components_release",
        "setScrollToBottomButtonEnabled$stream_chat_android_ui_components_release",
        "scrollToBottomButtonEnabled",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnScrollToBottomHandler;",
        "unreadCountEnabled",
        "getUnreadCountEnabled$stream_chat_android_ui_components_release",
        "setUnreadCountEnabled$stream_chat_android_ui_components_release",
        "bottomOffset",
        "I",
        "value",
        "setAtBottom",
        "Landroidx/recyclerview/widget/LinearLayoutManager;",
        "getLayoutManager",
        "()Landroidx/recyclerview/widget/LinearLayoutManager;",
        "layoutManager",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;",
        "getAdapter",
        "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;",
        "adapter",
        "",
        "getCurrentList",
        "()Ljava/util/List;",
        "currentList",
        "Companion",
        "MessageReadListener",
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

.field private static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$Companion;

.field private static final HIGHLIGHT_MESSAGE_DELAY:J = 0x64L

.field private static final SCROLL_BUTTON_VISIBILITY_THRESHOLD:I = 0x8


# instance fields
.field private final alwaysScrollToBottom$delegate:Lf93/d;

.field private bottomOffset:I

.field private final callback:Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$MessageReadListener;

.field private final disableScrollWhenShowingDialog:Z

.field private endOfNewMessagesReached:Z

.field private isAtBottom:Z

.field private final logger$delegate:Ll83/h;

.field private onScrollToBottomHandler:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnScrollToBottomHandler;

.field private final recyclerView:Landroidx/recyclerview/widget/RecyclerView;

.field private final scrollButtonView:Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;

.field private final scrollToBottomButtonEnabled$delegate:Lf93/d;

.field private unreadCountEnabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;

    const-string v2, "alwaysScrollToBottom"

    const-string v3, "getAlwaysScrollToBottom$stream_chat_android_ui_components_release()Z"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    const-string v3, "scrollToBottomButtonEnabled"

    const-string v5, "getScrollToBottomButtonEnabled$stream_chat_android_ui_components_release()Z"

    invoke-static {v1, v3, v5, v4, v2}, Ldc/b;->i(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/i0;)Lj93/l;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Lj93/z;

    aput-object v0, v2, v4

    const/4 v0, 0x1

    aput-object v1, v2, v0

    sput-object v2, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->$$delegatedProperties:[Lj93/z;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$Companion;

    return-void
.end method

.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;ZLio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$MessageReadListener;)V
    .locals 1

    const-string v0, "recyclerView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scrollButtonView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->scrollButtonView:Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;

    iput-boolean p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->disableScrollWhenShowingDialog:Z

    iput-object p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->callback:Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$MessageReadListener;

    const-string p3, "MessageListScrollHelper"

    invoke-static {p0, p3}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p3

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->logger$delegate:Ll83/h;

    new-instance p3, Lf93/a;

    const/4 p4, 0x0

    invoke-direct {p3, p4}, Lf93/a;-><init>(I)V

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->alwaysScrollToBottom$delegate:Lf93/d;

    new-instance p3, Lf93/a;

    invoke-direct {p3, p4}, Lf93/a;-><init>(I)V

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->scrollToBottomButtonEnabled$delegate:Lf93/d;

    new-instance p3, Lhn/p;

    const/16 p4, 0x9

    invoke-direct {p3, p0, p4}, Lhn/p;-><init>(Ljava/lang/Object;I)V

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->onScrollToBottomHandler:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnScrollToBottomHandler;

    const/4 p3, 0x1

    iput-boolean p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->unreadCountEnabled:Z

    iput-boolean p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->endOfNewMessagesReached:Z

    new-instance p3, Lb30/k3;

    const/16 p4, 0x14

    invoke-direct {p3, p0, p4}, Lb30/k3;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$2;

    invoke-direct {p2, p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$2;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;)V

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/z1;)V

    return-void
.end method

.method private static final _init_$lambda$2(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->onScrollToBottomHandler:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnScrollToBottomHandler;

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnScrollToBottomHandler;->onScrollToBottom()V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;Lio/getstream/chat/android/models/Message;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->scrollToMessage$lambda$12(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;Lio/getstream/chat/android/models/Message;)V

    return-void
.end method

.method public static final synthetic access$getCurrentList(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;)Ljava/util/List;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getCurrentList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getDisableScrollWhenShowingDialog$p(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;)Z
    .locals 0

    iget-boolean p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->disableScrollWhenShowingDialog:Z

    return p0
.end method

.method public static final synthetic access$getLogger(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;)Lb23/k;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getLogger()Lb23/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getScrollButtonView$p(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;)Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->scrollButtonView:Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;

    return-object p0
.end method

.method public static final synthetic access$shouldScrollToBottomBeVisible(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;)Z
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->shouldScrollToBottomBeVisible()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$stopScrollIfPopupShown(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->stopScrollIfPopupShown(Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method

.method public static synthetic b(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->scrollToMessage$lambda$12$lambda$11$lambda$10$lambda$9(Landroidx/recyclerview/widget/RecyclerView;I)V

    return-void
.end method

.method public static c(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->onScrollToBottomHandler:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnScrollToBottomHandler;

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnScrollToBottomHandler;->onScrollToBottom()V

    return-void
.end method

.method private final calculateBottomOffset()I
    .locals 7

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getLayoutManager()Landroidx/recyclerview/widget/LinearLayoutManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result v0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getCurrentList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v1, v2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    invoke-direct {p0, v2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->isValid(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/ListIterator;->nextIndex()I

    move-result v1

    goto :goto_0

    :cond_1
    const/4 v1, -0x1

    :goto_0
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v3, "[calculateBottomOffset] lastVisibleItemPosition: "

    const-string v6, ", lastPotentiallyVisibleItemPosition: "

    invoke-static {v0, v1, v3, v6}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x0

    invoke-interface {v2, v5, v4, v3, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    sub-int/2addr v1, v0

    return v1
.end method

.method public static synthetic d(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->onScrollToBottomHandler$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;)V

    return-void
.end method

.method private final getAdapter()Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/i1;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type io.getstream.chat.android.ui.feature.messages.list.adapter.internal.MessageListItemAdapter"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;

    return-object v0
.end method

.method private final getCurrentList()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getAdapter()Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/z0;->getCurrentList()Ljava/util/List;

    move-result-object v0

    const-string v1, "getCurrentList(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method private final getLayoutManager()Landroidx/recyclerview/widget/LinearLayoutManager;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    return-object v0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final isLastMessageMine()Z
    .locals 2

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getCurrentList()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    if-eqz v0, :cond_1

    instance-of v1, v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    if-nez v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isMine()Z

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private final isValid(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)Z
    .locals 2

    instance-of v0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->isTheirs()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-static {v0}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    instance-of p1, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$ThreadSeparatorItem;

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method private static final onScrollToBottomHandler$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getCurrentList()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result p0

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    return-void
.end method

.method private static final scrollToMessage$lambda$12(Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;Lio/getstream/chat/android/models/Message;)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getCurrentList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;

    instance-of v4, v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    if-eqz v4, :cond_0

    check-cast v3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, -0x1

    :goto_1
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-ltz v2, :cond_2

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result p1

    const/16 v2, 0x8

    if-eqz p1, :cond_3

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getLayoutManager()Landroidx/recyclerview/widget/LinearLayoutManager;

    move-result-object p1

    invoke-static {v2}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v3

    invoke-virtual {p1, v0, v3}, Landroidx/recyclerview/widget/LinearLayoutManager;->scrollToPositionWithOffset(II)V

    goto :goto_3

    :cond_3
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getLayoutManager()Landroidx/recyclerview/widget/LinearLayoutManager;

    move-result-object v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v4

    div-int/lit8 v4, v4, 0x3

    invoke-virtual {v3, v0, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;->scrollToPositionWithOffset(II)V

    new-instance v3, Lb9/g0;

    const/4 v4, 0x2

    invoke-direct {v3, p1, v0, v4}, Lb9/g0;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {p1, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :goto_3
    if-le v0, v2, :cond_4

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->scrollButtonView:Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;

    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_4
    return-void
.end method

.method private static final scrollToMessage$lambda$12$lambda$11$lambda$10$lambda$9(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForAdapterPosition(I)Landroidx/recyclerview/widget/o2;

    move-result-object p0

    if-eqz p0, :cond_1

    instance-of p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    if-nez p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    check-cast p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;->startHighlightAnimation$stream_chat_android_ui_components_release()V

    :cond_1
    return-void
.end method

.method private final setAtBottom(Z)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[setIsAtBottom] value: "

    invoke-static {v1, p1}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    if-eqz p1, :cond_1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->isAtBottom:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->callback:Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$MessageReadListener;

    invoke-interface {v0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$MessageReadListener;->onLastMessageRead()V

    :cond_1
    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->isAtBottom:Z

    return-void
.end method

.method private final shouldKeepScrollPosition(ZZ)Z
    .locals 0

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getScrollToBottomButtonEnabled$stream_chat_android_ui_components_release()Z

    move-result p1

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getAdapter()Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/z0;->getCurrentList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private final shouldScrollToBottom(ZZZZ)Z
    .locals 8

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->isLastMessageMine()Z

    move-result v1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getAlwaysScrollToBottom$stream_chat_android_ui_components_release()Z

    move-result v4

    const-string v5, ", endOfNewMessagesReached: "

    const-string v6, ", isInitialList: "

    const-string v7, "[shouldScrollToBottom] hasNewMessages: "

    invoke-static {v7, v5, v6, p3, p2}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, ", isLastMessageMine: "

    const-string v7, ", isAtBottom: "

    invoke-static {v5, p1, v6, v1, v7}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v5, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", alwaysScrollToBottom: "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    if-eqz p3, :cond_2

    if-eqz p2, :cond_2

    if-nez p1, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->isLastMessageMine()Z

    move-result p1

    if-nez p1, :cond_1

    if-nez p4, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getAlwaysScrollToBottom$stream_chat_android_ui_components_release()Z

    move-result p1

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method private final shouldScrollToBottomBeVisible()Z
    .locals 7

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->calculateBottomOffset()I

    move-result v0

    iput v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->bottomOffset:I

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->bottomOffset:I

    iget-boolean v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->endOfNewMessagesReached:Z

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[shouldScrollToBottomBeVisible] bottomOffset: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", endOfNewMessagesReached: "

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->bottomOffset:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-gtz v0, :cond_1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->endOfNewMessagesReached:Z

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->setAtBottom(Z)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getAdapter()Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/z0;->getItemCount()I

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->endOfNewMessagesReached:Z

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->isAtBottom:Z

    iget v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->bottomOffset:I

    const/16 v4, 0x8

    if-le v3, v4, :cond_4

    move v3, v2

    goto :goto_1

    :cond_4
    move v3, v1

    :goto_1
    if-eqz v0, :cond_6

    if-eqz v3, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    return v1

    :cond_6
    :goto_3
    return v2
.end method

.method private final stopScrollIfPopupShown(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getFragmentManager(Landroid/content/Context;)Landroidx/fragment/app/o1;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, v0, Landroidx/fragment/app/o1;->c:Landroidx/fragment/app/a2;

    invoke-virtual {v0}, Landroidx/fragment/app/a2;->f()Ljava/util/List;

    move-result-object v0

    const-string v1, "getFragments(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_1

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/m0;

    instance-of v1, v1, Landroidx/fragment/app/y;

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->stopScroll()V

    :cond_3
    return-void
.end method


# virtual methods
.method public final getAlwaysScrollToBottom$stream_chat_android_ui_components_release()Z
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->alwaysScrollToBottom$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getScrollToBottomButtonEnabled$stream_chat_android_ui_components_release()Z
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->scrollToBottomButtonEnabled$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-interface {v0, p0, v1}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getUnreadCountEnabled$stream_chat_android_ui_components_release()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->unreadCountEnabled:Z

    return v0
.end method

.method public final onMessageListChanged$stream_chat_android_ui_components_release(ZZZZ)V
    .locals 8

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->isAtBottom:Z

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    const/4 v5, 0x0

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, ", hasNewMessages: "

    const-string v6, ", endOfNewMessagesReached: "

    const-string v7, "[onMessageListChanged] isInitialList: "

    invoke-static {v7, v2, v6, p3, p2}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v6, ", isAtBottom: "

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v3, v4, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iput-boolean p4, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->endOfNewMessagesReached:Z

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->scrollButtonView:Lio/getstream/chat/android/ui/feature/messages/list/internal/ScrollButtonView;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->shouldScrollToBottomBeVisible()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    const/16 v2, 0x8

    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    if-nez p1, :cond_2

    invoke-direct {p0, p4, p2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->shouldKeepScrollPosition(ZZ)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    if-eqz p1, :cond_3

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getLayoutManager()Landroidx/recyclerview/widget/LinearLayoutManager;

    move-result-object p1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getCurrentList()Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lwb3/f;->C(Ljava/util/List;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->scrollToPosition(I)V

    return-void

    :cond_3
    invoke-direct {p0, p3, p4, p2, v0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->shouldScrollToBottom(ZZZZ)Z

    move-result p1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getLogger()Lb23/k;

    move-result-object p2

    iget-object p3, p2, Lb23/k;->c:Lb23/e;

    iget-object p4, p2, Lb23/k;->a:Ljava/lang/String;

    sget-object v0, Lb23/g;->x:Lb23/g;

    invoke-interface {p3, v0, p4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_4

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    const-string p3, "[onMessageListChanged] shouldScrollToBottom: "

    invoke-static {p3, p1}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2, v0, p4, p3, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    if-eqz p1, :cond_5

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getLayoutManager()Landroidx/recyclerview/widget/LinearLayoutManager;

    move-result-object p1

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getCurrentList()Ljava/util/List;

    move-result-object p2

    invoke-static {p2}, Lwb3/f;->C(Ljava/util/List;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->scrollToPosition(I)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->callback:Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$MessageReadListener;

    invoke-interface {p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper$MessageReadListener;->onLastMessageRead()V

    :cond_5
    :goto_1
    return-void
.end method

.method public final scrollToBottom$stream_chat_android_ui_components_release()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->getCurrentList()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    return-void
.end method

.method public final scrollToMessage$stream_chat_android_ui_components_release(Lio/getstream/chat/android/models/Message;)V
    .locals 4

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->recyclerView:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v1, La8/c;

    const/16 v2, 0x19

    invoke-direct {v1, v2, p0, p1}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v2, 0x64

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final setAlwaysScrollToBottom$stream_chat_android_ui_components_release(Z)V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->alwaysScrollToBottom$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p0, v1, p1}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final setScrollToBottomButtonEnabled$stream_chat_android_ui_components_release(Z)V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->scrollToBottomButtonEnabled$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->$$delegatedProperties:[Lj93/z;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {v0, p0, v1, p1}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public final setScrollToBottomHandler$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnScrollToBottomHandler;)V
    .locals 1

    const-string v0, "onScrollToBottomHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->onScrollToBottomHandler:Lio/getstream/chat/android/ui/feature/messages/list/MessageListView$OnScrollToBottomHandler;

    return-void
.end method

.method public final setUnreadCountEnabled$stream_chat_android_ui_components_release(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/MessageListScrollHelper;->unreadCountEnabled:Z

    return-void
.end method
