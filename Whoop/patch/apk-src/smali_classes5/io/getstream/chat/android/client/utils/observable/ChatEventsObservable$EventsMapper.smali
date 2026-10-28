.class final Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$EventsMapper;
.super Lio/getstream/chat/android/client/socket/SocketListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "EventsMapper"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$EventsMapper;",
        "Lio/getstream/chat/android/client/socket/SocketListener;",
        "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;",
        "observable",
        "<init>",
        "(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;)V",
        "Ll83/a0;",
        "onConnecting",
        "()V",
        "Lio/getstream/chat/android/client/events/ConnectedEvent;",
        "event",
        "onConnected",
        "(Lio/getstream/chat/android/client/events/ConnectedEvent;)V",
        "Lio/getstream/chat/android/client/clientstate/DisconnectCause;",
        "cause",
        "onDisconnected",
        "(Lio/getstream/chat/android/client/clientstate/DisconnectCause;)V",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "onEvent",
        "(Lio/getstream/chat/android/client/events/ChatEvent;)V",
        "Ln23/e;",
        "error",
        "onError",
        "(Ln23/e;)V",
        "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;",
        "",
        "getDeliverOnMainThread",
        "()Z",
        "deliverOnMainThread",
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
.field private final observable:Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;)V
    .locals 1

    const-string v0, "observable"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/SocketListener;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$EventsMapper;->observable:Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;

    return-void
.end method


# virtual methods
.method public final getDeliverOnMainThread()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final onConnected(Lio/getstream/chat/android/client/events/ConnectedEvent;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$EventsMapper;->observable:Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->access$onNext(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;Lio/getstream/chat/android/client/events/ChatEvent;)V

    return-void
.end method

.method public final onConnecting()V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$EventsMapper;->observable:Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;

    new-instance v1, Lio/getstream/chat/android/client/events/ConnectingEvent;

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    const/4 v3, 0x0

    const-string v4, "connection.connecting"

    invoke-direct {v1, v4, v2, v3}, Lio/getstream/chat/android/client/events/ConnectingEvent;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->access$onNext(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;Lio/getstream/chat/android/client/events/ChatEvent;)V

    return-void
.end method

.method public final onDisconnected(Lio/getstream/chat/android/client/clientstate/DisconnectCause;)V
    .locals 5

    const-string v0, "cause"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$EventsMapper;->observable:Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    new-instance v2, Lio/getstream/chat/android/client/events/DisconnectedEvent;

    const-string v3, "connection.disconnected"

    const/4 v4, 0x0

    invoke-direct {v2, v3, v1, v4, p1}, Lio/getstream/chat/android/client/events/DisconnectedEvent;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Lio/getstream/chat/android/client/clientstate/DisconnectCause;)V

    invoke-static {v0, v2}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->access$onNext(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;Lio/getstream/chat/android/client/events/ChatEvent;)V

    return-void
.end method

.method public final onError(Ln23/e;)V
    .locals 5

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$EventsMapper;->observable:Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    new-instance v2, Lio/getstream/chat/android/client/events/ErrorEvent;

    const-string v3, "connection.error"

    const/4 v4, 0x0

    invoke-direct {v2, v3, v1, v4, p1}, Lio/getstream/chat/android/client/events/ErrorEvent;-><init>(Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ln23/e;)V

    invoke-static {v0, v2}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->access$onNext(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;Lio/getstream/chat/android/client/events/ChatEvent;)V

    return-void
.end method

.method public final onEvent(Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$EventsMapper;->observable:Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;

    invoke-static {v0, p1}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->access$onNext(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;Lio/getstream/chat/android/client/events/ChatEvent;)V

    return-void
.end method
