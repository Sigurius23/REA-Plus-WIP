.class final Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AllPollOptionsViewModel"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0002\u0018\u00002\u00020\u0001B1\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0012R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0013R\u001f\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;",
        "Landroidx/lifecycle/w1;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "",
        "messageId",
        "channelId",
        "channelType",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbc3/c0;)V",
        "Lio/getstream/chat/android/models/Option;",
        "option",
        "Ll83/a0;",
        "onOptionClick",
        "(Lio/getstream/chat/android/models/Option;)V",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Ljava/lang/String;",
        "Lbc3/c0;",
        "Lec3/f2;",
        "Lio/getstream/chat/android/models/Poll;",
        "pollState",
        "Lec3/f2;",
        "getPollState",
        "()Lec3/f2;",
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


# instance fields
.field private final chatClient:Lio/getstream/chat/android/client/ChatClient;

.field private final coroutineScope:Lbc3/c0;

.field private final messageId:Ljava/lang/String;

.field private final pollState:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbc3/c0;)V
    .locals 1

    const-string v0, "chatClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelType"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    .line 4
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    .line 5
    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;->messageId:Ljava/lang/String;

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;->coroutineScope:Lbc3/c0;

    .line 7
    invoke-static {p1}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->getState(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/api/state/StateRegistry;

    move-result-object p1

    .line 8
    invoke-virtual {p1, p4, p3}, Lio/getstream/chat/android/client/api/state/StateRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/channel/state/ChannelState;

    move-result-object p1

    .line 9
    invoke-interface {p1}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getMessages()Lec3/f2;

    move-result-object p1

    .line 10
    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel$pollState$1;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel$pollState$1;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;Lq83/d;)V

    invoke-static {p2, p1}, Lec3/v;->I(Lc93/m;Lec3/l;)Lfc3/k;

    move-result-object p1

    .line 11
    sget-object p2, Lec3/z1;->a:Lec3/b2;

    invoke-static {p1, p5, p2, p3}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;->pollState:Lec3/f2;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p6, 0x1

    if-eqz p6, :cond_0

    .line 1
    sget-object p1, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p1

    :cond_0
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    .line 2
    invoke-direct/range {p2 .. p7}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;-><init>(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbc3/c0;)V

    return-void
.end method

.method public static final synthetic access$getChatClient$p(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;)Lio/getstream/chat/android/client/ChatClient;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    return-object p0
.end method

.method public static final synthetic access$getMessageId$p(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;->messageId:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final getPollState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;->pollState:Lec3/f2;

    return-object v0
.end method

.method public final onOptionClick(Lio/getstream/chat/android/models/Option;)V
    .locals 3

    const-string v0, "option"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;->coroutineScope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel$onOptionClick$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel$onOptionClick$1;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/AllPollOptionsDialogFragment$AllPollOptionsViewModel;Lio/getstream/chat/android/models/Option;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
