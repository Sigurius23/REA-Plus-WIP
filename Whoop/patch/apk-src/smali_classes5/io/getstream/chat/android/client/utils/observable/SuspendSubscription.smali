.class public final Lio/getstream/chat/android/client/utils/observable/SuspendSubscription;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/utils/observable/EventSubscription;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000e\u0008\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0012R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0013R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0014R\"\u0010\u0015\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0015\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lio/getstream/chat/android/client/utils/observable/SuspendSubscription;",
        "Lio/getstream/chat/android/client/utils/observable/EventSubscription;",
        "Lbc3/c0;",
        "scope",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "",
        "filter",
        "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener;",
        "listener",
        "<init>",
        "(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener;)V",
        "Ll83/a0;",
        "dispose",
        "()V",
        "event",
        "onNext",
        "(Lio/getstream/chat/android/client/events/ChatEvent;)V",
        "Lbc3/c0;",
        "Lkotlin/jvm/functions/Function1;",
        "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener;",
        "isDisposed",
        "Z",
        "()Z",
        "setDisposed",
        "(Z)V",
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
.field private final filter:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private volatile isDisposed:Z

.field private volatile listener:Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener<",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;"
        }
    .end annotation
.end field

.field private final scope:Lbc3/c0;


# direct methods
.method public constructor <init>(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lkotlin/jvm/functions/Function1;",
            "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener<",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;)V"
        }
    .end annotation

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/utils/observable/SuspendSubscription;->scope:Lbc3/c0;

    iput-object p2, p0, Lio/getstream/chat/android/client/utils/observable/SuspendSubscription;->filter:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lio/getstream/chat/android/client/utils/observable/SuspendSubscription;->listener:Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener;

    return-void
.end method

.method public static final synthetic access$getFilter$p(Lio/getstream/chat/android/client/utils/observable/SuspendSubscription;)Lkotlin/jvm/functions/Function1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/utils/observable/SuspendSubscription;->filter:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$getListener$p(Lio/getstream/chat/android/client/utils/observable/SuspendSubscription;)Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/utils/observable/SuspendSubscription;->listener:Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener;

    return-object p0
.end method


# virtual methods
.method public final dispose()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/getstream/chat/android/client/utils/observable/SuspendSubscription;->isDisposed:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/client/utils/observable/SuspendSubscription;->listener:Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener;

    return-void
.end method

.method public final isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/utils/observable/SuspendSubscription;->isDisposed:Z

    return v0
.end method

.method public final onNext(Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lio/getstream/chat/android/client/utils/observable/SuspendSubscription;->isDisposed:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/utils/observable/SuspendSubscription;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/client/utils/observable/SuspendSubscription$onNext$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/utils/observable/SuspendSubscription$onNext$1;-><init>(Lio/getstream/chat/android/client/utils/observable/SuspendSubscription;Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final setDisposed(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/client/utils/observable/SuspendSubscription;->isDisposed:Z

    return-void
.end method
