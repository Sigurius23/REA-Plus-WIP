.class public final Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u000eR\u001d\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController;",
        "",
        "",
        "cid",
        "Lbc3/c0;",
        "scope",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "Lec3/l;",
        "Lio/getstream/chat/android/client/channel/state/ChannelState;",
        "channelState",
        "<init>",
        "(Ljava/lang/String;Lbc3/c0;Lio/getstream/chat/android/client/ChatClient;Lec3/l;)V",
        "Lbc3/c0;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Lec3/f2;",
        "Lio/getstream/chat/android/ui/common/state/messages/list/ChannelHeaderViewState;",
        "state",
        "Lec3/f2;",
        "getState",
        "()Lec3/f2;",
        "stream-chat-android-ui-common_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final chatClient:Lio/getstream/chat/android/client/ChatClient;

.field private final scope:Lbc3/c0;

.field private final state:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lbc3/c0;Lio/getstream/chat/android/client/ChatClient;Lec3/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lbc3/c0;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lec3/l;",
            ")V"
        }
    .end annotation

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "scope"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "chatClient"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "channelState"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController;->scope:Lbc3/c0;

    .line 3
    iput-object p3, p0, Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    .line 4
    new-instance p1, Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController$special$$inlined$flatMapLatest$1;

    const/4 p3, 0x0

    invoke-direct {p1, p3, p0}, Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController$special$$inlined$flatMapLatest$1;-><init>(Lq83/d;Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController;)V

    invoke-static {p4, p1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    const-wide/16 p3, 0x1388

    const/4 v0, 0x2

    .line 5
    invoke-static {v0, p3, p4}, Lec3/z1;->a(IJ)Lec3/e2;

    move-result-object p3

    .line 6
    sget-object p4, Lio/getstream/chat/android/ui/common/state/messages/list/ChannelHeaderViewState$Loading;->INSTANCE:Lio/getstream/chat/android/ui/common/state/messages/list/ChannelHeaderViewState$Loading;

    .line 7
    invoke-static {p1, p2, p3, p4}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController;->state:Lec3/f2;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lbc3/c0;Lio/getstream/chat/android/client/ChatClient;Lec3/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    .line 8
    sget-object p3, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p3}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p3

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const/4 p4, 0x0

    .line 9
    invoke-static {p3, p1, p4, p2}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->watchChannelAsState(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ILbc3/c0;)Lec3/f2;

    move-result-object p4

    .line 10
    new-instance p5, Lch/i;

    const/4 p6, 0x2

    invoke-direct {p5, p4, p6}, Lch/i;-><init>(Lec3/l;I)V

    move-object p4, p5

    .line 11
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController;-><init>(Ljava/lang/String;Lbc3/c0;Lio/getstream/chat/android/client/ChatClient;Lec3/l;)V

    return-void
.end method

.method public static final synthetic access$getChatClient$p(Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController;)Lio/getstream/chat/android/client/ChatClient;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    return-object p0
.end method


# virtual methods
.method public final getState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/channel/header/ChannelHeaderViewController;->state:Lec3/f2;

    return-object v0
.end method
