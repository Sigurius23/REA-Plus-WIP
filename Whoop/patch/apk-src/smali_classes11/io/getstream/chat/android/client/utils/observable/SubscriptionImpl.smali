.class public Lio/getstream/chat/android/client/utils/observable/SubscriptionImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/utils/observable/EventSubscription;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0010\u0018\u00002\u00020\u0001B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0010R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0011R\"\u0010\u0012\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0012\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R(\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00178\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\"\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lio/getstream/chat/android/client/utils/observable/SubscriptionImpl;",
        "Lio/getstream/chat/android/client/utils/observable/EventSubscription;",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "",
        "filter",
        "Lio/getstream/chat/android/client/ChatEventListener;",
        "listener",
        "<init>",
        "(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatEventListener;)V",
        "Ll83/a0;",
        "dispose",
        "()V",
        "event",
        "onNext",
        "(Lio/getstream/chat/android/client/events/ChatEvent;)V",
        "Lkotlin/jvm/functions/Function1;",
        "Lio/getstream/chat/android/client/ChatEventListener;",
        "isDisposed",
        "Z",
        "()Z",
        "setDisposed",
        "(Z)V",
        "Lkotlin/Function0;",
        "afterEventDelivered",
        "Lc93/a;",
        "getAfterEventDelivered",
        "()Lc93/a;",
        "setAfterEventDelivered",
        "(Lc93/a;)V",
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
.field private afterEventDelivered:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final filter:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private volatile isDisposed:Z

.field private volatile listener:Lio/getstream/chat/android/client/ChatEventListener;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/client/ChatEventListener<",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatEventListener;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lio/getstream/chat/android/client/ChatEventListener<",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;)V"
        }
    .end annotation

    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/utils/observable/SubscriptionImpl;->filter:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lio/getstream/chat/android/client/utils/observable/SubscriptionImpl;->listener:Lio/getstream/chat/android/client/ChatEventListener;

    new-instance p1, Lou1/a;

    const/4 p2, 0x7

    invoke-direct {p1, p2}, Lou1/a;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/client/utils/observable/SubscriptionImpl;->afterEventDelivered:Lc93/a;

    return-void
.end method

.method private static final afterEventDelivered$lambda$0()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method


# virtual methods
.method public final dispose()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/getstream/chat/android/client/utils/observable/SubscriptionImpl;->isDisposed:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/client/utils/observable/SubscriptionImpl;->listener:Lio/getstream/chat/android/client/ChatEventListener;

    return-void
.end method

.method public final getAfterEventDelivered()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/utils/observable/SubscriptionImpl;->afterEventDelivered:Lc93/a;

    return-object v0
.end method

.method public final isDisposed()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/utils/observable/SubscriptionImpl;->isDisposed:Z

    return v0
.end method

.method public final onNext(Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lio/getstream/chat/android/client/utils/observable/SubscriptionImpl;->isDisposed:Z

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/utils/observable/SubscriptionImpl;->filter:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    :try_start_0
    iget-object v0, p0, Lio/getstream/chat/android/client/utils/observable/SubscriptionImpl;->listener:Lio/getstream/chat/android/client/ChatEventListener;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/ChatEventListener;->onEvent(Lio/getstream/chat/android/client/events/ChatEvent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p1, p0, Lio/getstream/chat/android/client/utils/observable/SubscriptionImpl;->afterEventDelivered:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :goto_1
    iget-object v0, p0, Lio/getstream/chat/android/client/utils/observable/SubscriptionImpl;->afterEventDelivered:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    throw p1

    :cond_2
    :goto_2
    return-void
.end method

.method public final setAfterEventDelivered(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/utils/observable/SubscriptionImpl;->afterEventDelivered:Lc93/a;

    return-void
.end method

.method public final setDisposed(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/client/utils/observable/SubscriptionImpl;->isDisposed:Z

    return-void
.end method
