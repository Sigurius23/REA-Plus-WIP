.class public final Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/BlockUserListenerState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/BlockUserListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/BlockUserListenerState;",
        "Lio/getstream/chat/android/client/plugin/listeners/BlockUserListener;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
        "globalState",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)V",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/UserBlock;",
        "result",
        "Ll83/a0;",
        "onBlockUserResult",
        "(Ln23/h;)V",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
        "stream-chat-android-client_release"
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
.field private final globalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)V
    .locals 1

    const-string v0, "globalState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/BlockUserListenerState;->globalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    return-void
.end method


# virtual methods
.method public final onBlockUserResult(Ln23/h;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            ")V"
        }
    .end annotation

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ln23/g;

    if-eqz v0, :cond_0

    check-cast p1, Ln23/g;

    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/UserBlock;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/UserBlock;->getUserId()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/BlockUserListenerState;->globalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->getBlockedUserIds()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/BlockUserListenerState;->globalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    check-cast v0, Ljava/util/Collection;

    invoke-static {p1, v0}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {v1, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->setBlockedUserIds(Ljava/util/List;)V

    :cond_0
    return-void
.end method
