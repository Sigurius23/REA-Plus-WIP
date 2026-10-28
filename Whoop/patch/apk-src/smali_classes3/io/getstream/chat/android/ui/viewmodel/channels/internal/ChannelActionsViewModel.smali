.class public final Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u001d\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel;",
        "Landroidx/lifecycle/w1;",
        "",
        "cid",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "<init>",
        "(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;)V",
        "Lec3/l;",
        "Lio/getstream/chat/android/client/channel/state/ChannelState;",
        "observeChannelState",
        "()Lec3/l;",
        "Ljava/lang/String;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "channelState",
        "Lec3/l;",
        "Landroidx/lifecycle/p0;",
        "Lio/getstream/chat/android/models/Channel;",
        "channel",
        "Landroidx/lifecycle/p0;",
        "getChannel",
        "()Landroidx/lifecycle/p0;",
        "Companion",
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
.field private static final Companion:Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel$Companion;

.field private static final DEFAULT_MESSAGE_LIMIT:I


# instance fields
.field private final channel:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final channelState:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private final chatClient:Lio/getstream/chat/android/client/ChatClient;

.field private final cid:Ljava/lang/String;

.field private final logger$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel;->Companion:Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;)V
    .locals 2

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    .line 4
    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel;->cid:Ljava/lang/String;

    .line 5
    iput-object p2, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    .line 6
    const-string p1, "Chat:ChannelActionsVM"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel;->logger$delegate:Ll83/h;

    .line 7
    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel;->observeChannelState()Lec3/l;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel;->channelState:Lec3/l;

    .line 8
    new-instance p2, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel$special$$inlined$flatMapLatest$1;

    const/4 v0, 0x3

    const/4 v1, 0x0

    .line 9
    invoke-direct {p2, v0, v1}, Ls83/i;-><init>(ILq83/d;)V

    .line 10
    invoke-static {p1, p2}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    .line 11
    invoke-static {p1, v1, v0}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel;->channel:Landroidx/lifecycle/p0;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 1
    sget-object p2, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p2

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/ChatClient;)V

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final observeChannelState()Lec3/l;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel;->cid:Ljava/lang/String;

    const-string v4, "[observeChannelState] cid: "

    const-string v5, ", messageLimit: 0"

    invoke-static {v4, v1, v5}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel;->cid:Ljava/lang/String;

    invoke-static {p0}, Landroidx/lifecycle/x1;->b(Landroidx/lifecycle/w1;)Ln8/a;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->watchChannelAsState(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ILbc3/c0;)Lec3/f2;

    move-result-object v0

    new-instance v1, Lch/i;

    const/4 v2, 0x2

    invoke-direct {v1, v0, v2}, Lch/i;-><init>(Lec3/l;I)V

    return-object v1
.end method


# virtual methods
.method public final getChannel()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/internal/ChannelActionsViewModel;->channel:Landroidx/lifecycle/p0;

    return-object v0
.end method
