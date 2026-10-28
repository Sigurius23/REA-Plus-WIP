.class public final Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModel;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0013\u0008\u0007\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u001f\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u001d\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\t\u001a\u0004\u0008\u000e\u0010\u000b\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModel;",
        "Landroidx/lifecycle/w1;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "<init>",
        "(Lio/getstream/chat/android/client/setup/state/ClientState;)V",
        "Landroidx/lifecycle/p0;",
        "Lio/getstream/chat/android/models/User;",
        "currentUser",
        "Landroidx/lifecycle/p0;",
        "getCurrentUser",
        "()Landroidx/lifecycle/p0;",
        "Lio/getstream/chat/android/models/ConnectionState;",
        "connectionState",
        "getConnectionState",
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
.field private final connectionState:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final currentUser:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModel;-><init>(Lio/getstream/chat/android/client/setup/state/ClientState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/setup/state/ClientState;)V
    .locals 3

    const-string v0, "clientState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    .line 5
    invoke-interface {p1}, Lio/getstream/chat/android/client/setup/state/ClientState;->getUser()Lec3/f2;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-static {v0, v1, v2}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModel;->currentUser:Landroidx/lifecycle/p0;

    .line 6
    invoke-interface {p1}, Lio/getstream/chat/android/client/setup/state/ClientState;->getConnectionState()Lec3/f2;

    move-result-object p1

    invoke-static {p1, v1, v2}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModel;->connectionState:Landroidx/lifecycle/p0;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/setup/state/ClientState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 2
    sget-object p1, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient;->getClientState()Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object p1

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModel;-><init>(Lio/getstream/chat/android/client/setup/state/ClientState;)V

    return-void
.end method


# virtual methods
.method public final getConnectionState()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModel;->connectionState:Landroidx/lifecycle/p0;

    return-object v0
.end method

.method public final getCurrentUser()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/channels/ChannelListHeaderViewModel;->currentUser:Landroidx/lifecycle/p0;

    return-object v0
.end method
