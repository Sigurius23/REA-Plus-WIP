.class public final Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener;,
        Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$EventsMapper;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010#\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001:\u0002/0B+\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J1\u0010\u001d\u001a\u00020\u00152\u0014\u0008\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00190\u00182\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u001b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ1\u0010 \u001a\u00020\u00152\u0014\u0008\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00190\u00182\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u001f\u00a2\u0006\u0004\u0008 \u0010!J1\u0010\"\u001a\u00020\u00152\u0014\u0008\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00190\u00182\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u001b\u00a2\u0006\u0004\u0008\"\u0010\u001eR \u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010$R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010%R\u0014\u0010\'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u001a\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00130)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.\u00a8\u00061"
    }
    d2 = {
        "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;",
        "",
        "Lec3/m;",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/ConnectionData;",
        "waitConnection",
        "Lbc3/c0;",
        "scope",
        "Lio/getstream/chat/android/client/socket/ChatSocket;",
        "chatSocket",
        "<init>",
        "(Lec3/m;Lbc3/c0;Lio/getstream/chat/android/client/socket/ChatSocket;)V",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "event",
        "Ll83/a0;",
        "onNext",
        "(Lio/getstream/chat/android/client/events/ChatEvent;)V",
        "emitConnectionEvents",
        "notifySubscriptions",
        "Lio/getstream/chat/android/client/utils/observable/EventSubscription;",
        "subscription",
        "Lio/getstream/chat/android/client/utils/observable/Disposable;",
        "addSubscription",
        "(Lio/getstream/chat/android/client/utils/observable/EventSubscription;)Lio/getstream/chat/android/client/utils/observable/Disposable;",
        "Lkotlin/Function1;",
        "",
        "filter",
        "Lio/getstream/chat/android/client/ChatEventListener;",
        "listener",
        "subscribe",
        "(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;",
        "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener;",
        "subscribeSuspend",
        "(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;",
        "subscribeSingle",
        "Lec3/m;",
        "Lbc3/c0;",
        "Lio/getstream/chat/android/client/socket/ChatSocket;",
        "Lmc3/a;",
        "mutex",
        "Lmc3/a;",
        "",
        "subscriptions",
        "Ljava/util/Set;",
        "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$EventsMapper;",
        "eventsMapper",
        "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$EventsMapper;",
        "ChatEventSuspendListener",
        "EventsMapper",
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
.field private final chatSocket:Lio/getstream/chat/android/client/socket/ChatSocket;

.field private final eventsMapper:Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$EventsMapper;

.field private final mutex:Lmc3/a;

.field private final scope:Lbc3/c0;

.field private final subscriptions:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lio/getstream/chat/android/client/utils/observable/EventSubscription;",
            ">;"
        }
    .end annotation
.end field

.field private final waitConnection:Lec3/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/m;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lec3/m;Lbc3/c0;Lio/getstream/chat/android/client/socket/ChatSocket;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lbc3/c0;",
            "Lio/getstream/chat/android/client/socket/ChatSocket;",
            ")V"
        }
    .end annotation

    const-string v0, "waitConnection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatSocket"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->waitConnection:Lec3/m;

    iput-object p2, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->scope:Lbc3/c0;

    iput-object p3, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->chatSocket:Lio/getstream/chat/android/client/socket/ChatSocket;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->mutex:Lmc3/a;

    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->subscriptions:Ljava/util/Set;

    new-instance p1, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$EventsMapper;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$EventsMapper;-><init>(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->eventsMapper:Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$EventsMapper;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->subscribeSingle$lambda$2(Lio/getstream/chat/android/client/events/ChatEvent;)Z

    return-void
.end method

.method public static final synthetic access$getChatSocket$p(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;)Lio/getstream/chat/android/client/socket/ChatSocket;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->chatSocket:Lio/getstream/chat/android/client/socket/ChatSocket;

    return-object p0
.end method

.method public static final synthetic access$getEventsMapper$p(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;)Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$EventsMapper;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->eventsMapper:Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$EventsMapper;

    return-object p0
.end method

.method public static final synthetic access$getMutex$p(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;)Lmc3/a;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->mutex:Lmc3/a;

    return-object p0
.end method

.method public static final synthetic access$getSubscriptions$p(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->subscriptions:Ljava/util/Set;

    return-object p0
.end method

.method public static final synthetic access$getWaitConnection$p(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;)Lec3/m;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->waitConnection:Lec3/m;

    return-object p0
.end method

.method public static final synthetic access$onNext(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->onNext(Lio/getstream/chat/android/client/events/ChatEvent;)V

    return-void
.end method

.method private final addSubscription(Lio/getstream/chat/android/client/utils/observable/EventSubscription;)Lio/getstream/chat/android/client/utils/observable/Disposable;
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$addSubscription$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$addSubscription$1;-><init>(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;Lio/getstream/chat/android/client/utils/observable/EventSubscription;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object p1
.end method

.method public static synthetic b(Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->subscribeSuspend$lambda$1(Lio/getstream/chat/android/client/events/ChatEvent;)Z

    return-void
.end method

.method public static synthetic c(Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->subscribe$lambda$0(Lio/getstream/chat/android/client/events/ChatEvent;)Z

    return-void
.end method

.method private final emitConnectionEvents(Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$emitConnectionEvents$1;-><init>(Lio/getstream/chat/android/client/events/ChatEvent;Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final notifySubscriptions(Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$notifySubscriptions$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$notifySubscriptions$1;-><init>(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final onNext(Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->notifySubscriptions(Lio/getstream/chat/android/client/events/ChatEvent;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->emitConnectionEvents(Lio/getstream/chat/android/client/events/ChatEvent;)V

    return-void
.end method

.method public static synthetic subscribe$default(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatEventListener;ILjava/lang/Object;)Lio/getstream/chat/android/client/utils/observable/Disposable;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    new-instance p1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/16 p3, 0xc

    invoke-direct {p1, p3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->subscribe(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;

    move-result-object p0

    return-object p0
.end method

.method private static final subscribe$lambda$0(Lio/getstream/chat/android/client/events/ChatEvent;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic subscribeSingle$default(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatEventListener;ILjava/lang/Object;)Lio/getstream/chat/android/client/utils/observable/Disposable;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    new-instance p1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/16 p3, 0xd

    invoke-direct {p1, p3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->subscribeSingle(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;

    move-result-object p0

    return-object p0
.end method

.method private static final subscribeSingle$lambda$2(Lio/getstream/chat/android/client/events/ChatEvent;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic subscribeSuspend$default(Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener;ILjava/lang/Object;)Lio/getstream/chat/android/client/utils/observable/Disposable;
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    new-instance p1, Lim1/p0;

    const/16 p3, 0xf

    invoke-direct {p1, p3}, Lim1/p0;-><init>(I)V

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->subscribeSuspend(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;

    move-result-object p0

    return-object p0
.end method

.method private static final subscribeSuspend$lambda$1(Lio/getstream/chat/android/client/events/ChatEvent;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final subscribe(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lio/getstream/chat/android/client/ChatEventListener<",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;)",
            "Lio/getstream/chat/android/client/utils/observable/Disposable;"
        }
    .end annotation

    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/utils/observable/SubscriptionImpl;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/client/utils/observable/SubscriptionImpl;-><init>(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatEventListener;)V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->addSubscription(Lio/getstream/chat/android/client/utils/observable/EventSubscription;)Lio/getstream/chat/android/client/utils/observable/Disposable;

    return-object v0
.end method

.method public final subscribeSingle(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatEventListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lio/getstream/chat/android/client/ChatEventListener<",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;)",
            "Lio/getstream/chat/android/client/utils/observable/Disposable;"
        }
    .end annotation

    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/utils/observable/SubscriptionImpl;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/client/utils/observable/SubscriptionImpl;-><init>(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/ChatEventListener;)V

    new-instance p1, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$subscribeSingle$2$1;

    invoke-direct {p1, v0}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$subscribeSingle$2$1;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/utils/observable/SubscriptionImpl;->setAfterEventDelivered(Lc93/a;)V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->addSubscription(Lio/getstream/chat/android/client/utils/observable/EventSubscription;)Lio/getstream/chat/android/client/utils/observable/Disposable;

    return-object v0
.end method

.method public final subscribeSuspend(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener;)Lio/getstream/chat/android/client/utils/observable/Disposable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener<",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;)",
            "Lio/getstream/chat/android/client/utils/observable/Disposable;"
        }
    .end annotation

    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/utils/observable/SuspendSubscription;

    iget-object v1, p0, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->scope:Lbc3/c0;

    invoke-direct {v0, v1, p1, p2}, Lio/getstream/chat/android/client/utils/observable/SuspendSubscription;-><init>(Lbc3/c0;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable$ChatEventSuspendListener;)V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/utils/observable/ChatEventsObservable;->addSubscription(Lio/getstream/chat/android/client/utils/observable/EventSubscription;)Lio/getstream/chat/android/client/utils/observable/Disposable;

    return-object v0
.end method
