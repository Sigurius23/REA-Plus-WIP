.class public final Lio/getstream/chat/android/ui/viewmodel/messages/PollCommentsViewModel;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/viewmodel/messages/PollCommentsViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/viewmodel/messages/PollCommentsViewModel;",
        "Landroidx/lifecycle/w1;",
        "",
        "cid",
        "messageId",
        "Lio/getstream/chat/android/client/api/state/StateRegistry;",
        "state",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/state/StateRegistry;)V",
        "Landroidx/lifecycle/p0;",
        "Lio/getstream/chat/android/models/Poll;",
        "poll",
        "Landroidx/lifecycle/p0;",
        "getPoll",
        "()Landroidx/lifecycle/p0;",
        "Factory",
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
.field private final poll:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/state/StateRegistry;)V
    .locals 1

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Landroidx/lifecycle/w1;-><init>()V

    .line 4
    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object p1

    .line 5
    iget-object v0, p1, Ll83/k;->w:Ljava/lang/Object;

    .line 6
    check-cast v0, Ljava/lang/String;

    .line 7
    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    .line 8
    check-cast p1, Ljava/lang/String;

    .line 9
    invoke-virtual {p3, v0, p1}, Lio/getstream/chat/android/client/api/state/StateRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/channel/state/ChannelState;

    move-result-object p1

    invoke-interface {p1}, Lio/getstream/chat/android/client/channel/state/ChannelState;->getMessages()Lec3/f2;

    move-result-object p1

    .line 10
    new-instance p3, Lio/getstream/chat/android/ui/viewmodel/messages/PollCommentsViewModel$poll$lambda$2$$inlined$map$1;

    invoke-direct {p3, p1, p2}, Lio/getstream/chat/android/ui/viewmodel/messages/PollCommentsViewModel$poll$lambda$2$$inlined$map$1;-><init>(Lec3/l;Ljava/lang/String;)V

    .line 11
    new-instance p1, Lch/i;

    const/4 p2, 0x2

    invoke-direct {p1, p3, p2}, Lch/i;-><init>(Lec3/l;I)V

    .line 12
    invoke-static {p1}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p1

    const/4 p2, 0x0

    const/4 p3, 0x3

    .line 13
    invoke-static {p1, p2, p3}, Landroidx/lifecycle/o1;->b(Lec3/l;Lq83/j;I)Landroidx/lifecycle/j;

    move-result-object p1

    .line 14
    iput-object p1, p0, Lio/getstream/chat/android/ui/viewmodel/messages/PollCommentsViewModel;->poll:Landroidx/lifecycle/p0;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/state/StateRegistry;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 1
    sget-object p3, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p3}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p3

    invoke-static {p3}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->getState(Lio/getstream/chat/android/client/ChatClient;)Lio/getstream/chat/android/client/api/state/StateRegistry;

    move-result-object p3

    .line 2
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/viewmodel/messages/PollCommentsViewModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/state/StateRegistry;)V

    return-void
.end method


# virtual methods
.method public final getPoll()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/viewmodel/messages/PollCommentsViewModel;->poll:Landroidx/lifecycle/p0;

    return-object v0
.end method
