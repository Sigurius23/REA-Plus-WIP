.class public final Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/LiveLocationListenerState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/LiveLocationListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001e\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u0008\n\u0010\u000bJ$\u0010\u000e\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u000c0\u0008H\u0096@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ&\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0008H\u0096@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J&\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0008H\u0096@\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J&\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0008H\u0096@\u00a2\u0006\u0004\u0008\u0013\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/LiveLocationListenerState;",
        "Lio/getstream/chat/android/client/plugin/listeners/LiveLocationListener;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
        "mutableGlobalState",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)V",
        "Lio/getstream/chat/android/models/Location;",
        "location",
        "Ln23/h;",
        "Ll83/a0;",
        "onUpdateLiveLocationPrecondition",
        "(Lio/getstream/chat/android/models/Location;Lq83/d;)Ljava/lang/Object;",
        "",
        "result",
        "onQueryActiveLocationsResult",
        "(Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "onUpdateLiveLocationResult",
        "(Lio/getstream/chat/android/models/Location;Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "onStopLiveLocationSharingResult",
        "onStartLiveLocationSharingResult",
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
.field private final mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)V
    .locals 1

    const-string v0, "mutableGlobalState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/LiveLocationListenerState;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    return-void
.end method

.method public static final synthetic access$getMutableGlobalState$p(Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/LiveLocationListenerState;)Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/LiveLocationListenerState;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    return-object p0
.end method


# virtual methods
.method public final onQueryActiveLocationsResult(Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p1, Ln23/g;

    if-eqz p2, :cond_0

    check-cast p1, Ln23/g;

    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/LiveLocationListenerState;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->addLiveLocations(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    instance-of p1, p1, Ln23/f;

    if-eqz p1, :cond_1

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final onStartLiveLocationSharingResult(Lio/getstream/chat/android/models/Location;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Location;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p1, p2, Ln23/g;

    if-eqz p1, :cond_0

    check-cast p2, Ln23/g;

    iget-object p1, p2, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Location;

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/LiveLocationListenerState;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->addLiveLocation(Lio/getstream/chat/android/models/Location;)V

    goto :goto_0

    :cond_0
    instance-of p1, p2, Ln23/f;

    if-eqz p1, :cond_1

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final onStopLiveLocationSharingResult(Lio/getstream/chat/android/models/Location;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Location;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p1, p2, Ln23/g;

    if-eqz p1, :cond_0

    check-cast p2, Ln23/g;

    iget-object p1, p2, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Location;

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/LiveLocationListenerState;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->removeExpiredLiveLocations()V

    goto :goto_0

    :cond_0
    instance-of p1, p2, Ln23/f;

    if-eqz p1, :cond_1

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final onUpdateLiveLocationPrecondition(Lio/getstream/chat/android/models/Location;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Location;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p1, Ln23/g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, p2}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final onUpdateLiveLocationResult(Lio/getstream/chat/android/models/Location;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Location;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p1, p2, Ln23/g;

    if-eqz p1, :cond_0

    check-cast p2, Ln23/g;

    iget-object p1, p2, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Location;

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/LiveLocationListenerState;->mutableGlobalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->addLiveLocation(Lio/getstream/chat/android/models/Location;)V

    goto :goto_0

    :cond_0
    instance-of p1, p2, Ln23/f;

    if-eqz p1, :cond_1

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
