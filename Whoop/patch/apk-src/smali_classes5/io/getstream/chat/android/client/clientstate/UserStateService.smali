.class public final Lio/getstream/chat/android/client/clientstate/UserStateService;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\"B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0086@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\r\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0004\u0008\u000f\u0010\u000eR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00178@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001cR\u001a\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u001e8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006#"
    }
    d2 = {
        "Lio/getstream/chat/android/client/clientstate/UserStateService;",
        "",
        "<init>",
        "()V",
        "Lio/getstream/chat/android/models/User;",
        "user",
        "Ll83/a0;",
        "onUserUpdated",
        "(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;",
        "",
        "isAnonymous",
        "onSetUser",
        "(Lio/getstream/chat/android/models/User;ZLq83/d;)Ljava/lang/Object;",
        "onLogout",
        "(Lq83/d;)Ljava/lang/Object;",
        "onSocketUnrecoverableError",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;",
        "Lio/getstream/chat/android/client/clientstate/UserState;",
        "Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent;",
        "fsm",
        "Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;",
        "getState$stream_chat_android_client_release",
        "()Lio/getstream/chat/android/client/clientstate/UserState;",
        "state",
        "Lec3/f2;",
        "getStateFlow$stream_chat_android_client_release",
        "()Lec3/f2;",
        "stateFlow",
        "UserStateEvent",
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
.field private final fsm:Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine<",
            "Lio/getstream/chat/android/client/clientstate/UserState;",
            "Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent;",
            ">;"
        }
    .end annotation
.end field

.field private final logger$delegate:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Chat:UserStateService"

    invoke-static {p0, v0}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/clientstate/UserStateService;->logger$delegate:Ll83/h;

    sget-object v0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->Companion:Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine$Companion;

    new-instance v1, Lio/getstream/chat/android/client/clientstate/b;

    invoke-direct {v1, p0}, Lio/getstream/chat/android/client/clientstate/b;-><init>(Lio/getstream/chat/android/client/clientstate/UserStateService;)V

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine$Companion;->invoke(Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/clientstate/UserStateService;->fsm:Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/client/clientstate/UserState$UserSet;Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UserUpdated;)Lio/getstream/chat/android/client/clientstate/UserState$UserSet;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/clientstate/UserStateService;->fsm$lambda$16$lambda$12$lambda$10(Lio/getstream/chat/android/client/clientstate/UserState$UserSet;Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UserUpdated;)Lio/getstream/chat/android/client/clientstate/UserState;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/clientstate/UserState$UserSet;

    return-object p0
.end method

.method public static synthetic b(Lio/getstream/chat/android/client/clientstate/UserState$AnonymousUserSet;Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UnsetUser;)Lio/getstream/chat/android/client/clientstate/UserState$NotSet;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/clientstate/UserStateService;->fsm$lambda$16$lambda$15$lambda$14(Lio/getstream/chat/android/client/clientstate/UserState$AnonymousUserSet;Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UnsetUser;)Lio/getstream/chat/android/client/clientstate/UserState;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/clientstate/UserState$NotSet;

    return-object p0
.end method

.method public static synthetic c(Lio/getstream/chat/android/client/clientstate/UserStateService;Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/clientstate/UserStateService;->fsm$lambda$16(Lio/getstream/chat/android/client/clientstate/UserStateService;Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;)Ll83/a0;

    return-void
.end method

.method public static synthetic d(Lio/getstream/chat/android/client/clientstate/UserState$AnonymousUserSet;Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UserUpdated;)Lio/getstream/chat/android/client/clientstate/UserState$AnonymousUserSet;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/clientstate/UserStateService;->fsm$lambda$16$lambda$15$lambda$13(Lio/getstream/chat/android/client/clientstate/UserState$AnonymousUserSet;Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UserUpdated;)Lio/getstream/chat/android/client/clientstate/UserState;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/clientstate/UserState$AnonymousUserSet;

    return-object p0
.end method

.method public static synthetic e(Lio/getstream/chat/android/client/clientstate/UserStateService;Lio/getstream/chat/android/client/clientstate/UserState;Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/clientstate/UserStateService;->fsm$lambda$16$lambda$5(Lio/getstream/chat/android/client/clientstate/UserStateService;Lio/getstream/chat/android/client/clientstate/UserState;Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent;)Lio/getstream/chat/android/client/clientstate/UserState;

    return-void
.end method

.method public static synthetic f(Lio/getstream/chat/android/client/clientstate/UserState$NotSet;Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$ConnectUser;)Lio/getstream/chat/android/client/clientstate/UserState$UserSet;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/clientstate/UserStateService;->fsm$lambda$16$lambda$9$lambda$6(Lio/getstream/chat/android/client/clientstate/UserState$NotSet;Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$ConnectUser;)Lio/getstream/chat/android/client/clientstate/UserState;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/clientstate/UserState$UserSet;

    return-object p0
.end method

.method private static final fsm$lambda$16(Lio/getstream/chat/android/client/clientstate/UserStateService;Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;)Ll83/a0;
    .locals 9

    const-string v0, "$this$FiniteStateMachine"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/clientstate/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/client/clientstate/a;-><init>(Lio/getstream/chat/android/client/clientstate/UserStateService;I)V

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;->defaultHandler(Lc93/m;)V

    sget-object v0, Lio/getstream/chat/android/client/clientstate/UserState$NotSet;->INSTANCE:Lio/getstream/chat/android/client/clientstate/UserState$NotSet;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;->initialState(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;->getStateFunctions()Ljava/util/Map;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lio/getstream/chat/android/client/clientstate/UserState$NotSet;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;

    invoke-direct {v3}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;-><init>()V

    new-instance v4, Lin0/a;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Lin0/a;-><init>(I)V

    invoke-virtual {v3}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    const-class v6, Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$ConnectUser;

    invoke-virtual {v1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    const/4 v7, 0x2

    invoke-static {v7, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lin0/a;

    const/4 v5, 0x2

    invoke-direct {v4, v5}, Lin0/a;-><init>(I)V

    invoke-virtual {v3}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v5

    const-class v6, Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$ConnectAnonymous;

    invoke-virtual {v1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v7, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/getstream/chat/android/client/clientstate/a;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5}, Lio/getstream/chat/android/client/clientstate/a;-><init>(Lio/getstream/chat/android/client/clientstate/UserStateService;I)V

    invoke-virtual {v3}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object p0

    const-class v5, Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UnsetUser;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v7, v4}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {p0, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->get()Ljava/util/Map;

    move-result-object p0

    invoke-interface {v0, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;->getStateFunctions()Ljava/util/Map;

    move-result-object p0

    const-class v0, Lio/getstream/chat/android/client/clientstate/UserState$UserSet;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v2, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;

    invoke-direct {v2}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;-><init>()V

    new-instance v3, Lin0/a;

    const/4 v4, 0x3

    invoke-direct {v3, v4}, Lin0/a;-><init>(I)V

    invoke-virtual {v2}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v4

    const-class v6, Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UserUpdated;

    invoke-virtual {v1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v7, v3}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v4, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lin0/a;

    const/4 v4, 0x4

    invoke-direct {v3, v4}, Lin0/a;-><init>(I)V

    invoke-virtual {v2}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v4

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-static {v7, v3}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v4, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->get()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p0, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;->getStateFunctions()Ljava/util/Map;

    move-result-object p0

    const-class p1, Lio/getstream/chat/android/client/clientstate/UserState$AnonymousUserSet;

    invoke-virtual {v1, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v0, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;

    invoke-direct {v0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;-><init>()V

    new-instance v2, Lin0/a;

    const/4 v3, 0x5

    invoke-direct {v2, v3}, Lin0/a;-><init>(I)V

    invoke-virtual {v0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v7, v2}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lin0/a;

    const/4 v3, 0x6

    invoke-direct {v2, v3}, Lin0/a;-><init>(I)V

    invoke-virtual {v0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->getEventHandlers()Ljava/util/Map;

    move-result-object v3

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-static {v7, v2}, Lkotlin/jvm/internal/m0;->e(ILjava/lang/Object;)V

    invoke-interface {v3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;->get()Ljava/util/Map;

    move-result-object v0

    invoke-interface {p0, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final fsm$lambda$16$lambda$12$lambda$10(Lio/getstream/chat/android/client/clientstate/UserState$UserSet;Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UserUpdated;)Lio/getstream/chat/android/client/clientstate/UserState;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "event"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/clientstate/UserState$UserSet;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UserUpdated;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/clientstate/UserState$UserSet;-><init>(Lio/getstream/chat/android/models/User;)V

    return-object p0
.end method

.method private static final fsm$lambda$16$lambda$12$lambda$11(Lio/getstream/chat/android/client/clientstate/UserState$UserSet;Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UnsetUser;)Lio/getstream/chat/android/client/clientstate/UserState;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lio/getstream/chat/android/client/clientstate/UserState$NotSet;->INSTANCE:Lio/getstream/chat/android/client/clientstate/UserState$NotSet;

    return-object p0
.end method

.method private static final fsm$lambda$16$lambda$15$lambda$13(Lio/getstream/chat/android/client/clientstate/UserState$AnonymousUserSet;Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UserUpdated;)Lio/getstream/chat/android/client/clientstate/UserState;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "event"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/clientstate/UserState$AnonymousUserSet;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UserUpdated;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/clientstate/UserState$AnonymousUserSet;-><init>(Lio/getstream/chat/android/models/User;)V

    return-object p0
.end method

.method private static final fsm$lambda$16$lambda$15$lambda$14(Lio/getstream/chat/android/client/clientstate/UserState$AnonymousUserSet;Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UnsetUser;)Lio/getstream/chat/android/client/clientstate/UserState;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lio/getstream/chat/android/client/clientstate/UserState$NotSet;->INSTANCE:Lio/getstream/chat/android/client/clientstate/UserState$NotSet;

    return-object p0
.end method

.method private static final fsm$lambda$16$lambda$5(Lio/getstream/chat/android/client/clientstate/UserStateService;Lio/getstream/chat/android/client/clientstate/UserState;Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent;)Lio/getstream/chat/android/client/clientstate/UserState;
    .locals 5

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/clientstate/UserStateService;->getLogger()Lb23/k;

    move-result-object p0

    invoke-virtual {p0}, Lb23/k;->c()Lb23/e;

    move-result-object v0

    sget-object v1, Lb23/g;->F:Lb23/g;

    invoke-virtual {p0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lb23/k;->a()Lb23/j;

    move-result-object v0

    invoke-virtual {p0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-interface {v2}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Can\'t handle "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " while being in state "

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v0, v1, p0, p2}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object p1
.end method

.method private static final fsm$lambda$16$lambda$9$lambda$6(Lio/getstream/chat/android/client/clientstate/UserState$NotSet;Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$ConnectUser;)Lio/getstream/chat/android/client/clientstate/UserState;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "event"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/clientstate/UserState$UserSet;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$ConnectUser;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/clientstate/UserState$UserSet;-><init>(Lio/getstream/chat/android/models/User;)V

    return-object p0
.end method

.method private static final fsm$lambda$16$lambda$9$lambda$7(Lio/getstream/chat/android/client/clientstate/UserState$NotSet;Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$ConnectAnonymous;)Lio/getstream/chat/android/client/clientstate/UserState;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "event"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/getstream/chat/android/client/clientstate/UserState$AnonymousUserSet;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$ConnectAnonymous;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/clientstate/UserState$AnonymousUserSet;-><init>(Lio/getstream/chat/android/models/User;)V

    return-object p0
.end method

.method private static final fsm$lambda$16$lambda$9$lambda$8(Lio/getstream/chat/android/client/clientstate/UserStateService;Lio/getstream/chat/android/client/clientstate/UserState$NotSet;Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UnsetUser;)Lio/getstream/chat/android/client/clientstate/UserState;
    .locals 1

    const-string v0, "$this$onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "it"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/client/clientstate/UserStateService;->getState$stream_chat_android_client_release()Lio/getstream/chat/android/client/clientstate/UserState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lio/getstream/chat/android/client/clientstate/UserStateService;Lio/getstream/chat/android/client/clientstate/UserState$NotSet;Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UnsetUser;)Lio/getstream/chat/android/client/clientstate/UserState;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/clientstate/UserStateService;->fsm$lambda$16$lambda$9$lambda$8(Lio/getstream/chat/android/client/clientstate/UserStateService;Lio/getstream/chat/android/client/clientstate/UserState$NotSet;Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UnsetUser;)Lio/getstream/chat/android/client/clientstate/UserState;

    move-result-object p0

    return-object p0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/clientstate/UserStateService;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public static synthetic h(Lio/getstream/chat/android/client/clientstate/UserState$UserSet;Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UnsetUser;)Lio/getstream/chat/android/client/clientstate/UserState$NotSet;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/clientstate/UserStateService;->fsm$lambda$16$lambda$12$lambda$11(Lio/getstream/chat/android/client/clientstate/UserState$UserSet;Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UnsetUser;)Lio/getstream/chat/android/client/clientstate/UserState;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/clientstate/UserState$NotSet;

    return-object p0
.end method

.method public static synthetic i(Lio/getstream/chat/android/client/clientstate/UserState$NotSet;Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$ConnectAnonymous;)Lio/getstream/chat/android/client/clientstate/UserState$AnonymousUserSet;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/clientstate/UserStateService;->fsm$lambda$16$lambda$9$lambda$7(Lio/getstream/chat/android/client/clientstate/UserState$NotSet;Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$ConnectAnonymous;)Lio/getstream/chat/android/client/clientstate/UserState;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/clientstate/UserState$AnonymousUserSet;

    return-object p0
.end method


# virtual methods
.method public final getState$stream_chat_android_client_release()Lio/getstream/chat/android/client/clientstate/UserState;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/clientstate/UserStateService;->fsm:Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    invoke-virtual {v0}, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->getState()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/clientstate/UserState;

    return-object v0
.end method

.method public final getStateFlow$stream_chat_android_client_release()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/clientstate/UserStateService;->fsm:Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    invoke-virtual {v0}, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->getStateFlow()Lec3/f2;

    move-result-object v0

    return-object v0
.end method

.method public final onLogout(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/clientstate/UserStateService;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    const-string v3, "[onLogout] no args"

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/clientstate/UserStateService;->fsm:Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    sget-object v1, Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UnsetUser;->INSTANCE:Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UnsetUser;

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->sendEvent(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onSetUser(Lio/getstream/chat/android/models/User;ZLq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/clientstate/UserStateService;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->z:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    const-string v4, "[onSetUser] user.id: \'"

    const-string v5, "\', isAnonymous: "

    invoke-static {v4, v3, v5, p2}, Ld13/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    if-eqz p2, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/clientstate/UserStateService;->fsm:Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    new-instance v0, Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$ConnectAnonymous;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$ConnectAnonymous;-><init>(Lio/getstream/chat/android/models/User;)V

    invoke-virtual {p2, v0, p3}, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->sendEvent(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_1
    iget-object p2, p0, Lio/getstream/chat/android/client/clientstate/UserStateService;->fsm:Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    new-instance v0, Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$ConnectUser;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$ConnectUser;-><init>(Lio/getstream/chat/android/models/User;)V

    invoke-virtual {p2, v0, p3}, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->sendEvent(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onSocketUnrecoverableError(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/clientstate/UserStateService;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->F:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    const-string v3, "[onSocketUnrecoverableError] no args"

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/clientstate/UserStateService;->fsm:Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    sget-object v1, Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UnsetUser;->INSTANCE:Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UnsetUser;

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->sendEvent(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onUserUpdated(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/clientstate/UserStateService;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    const-string v4, "[onUserUpdated] user.id: \'"

    const-string v5, "\'"

    invoke-static {v4, v3, v5}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/clientstate/UserStateService;->fsm:Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    new-instance v1, Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UserUpdated;

    invoke-direct {v1, p1}, Lio/getstream/chat/android/client/clientstate/UserStateService$UserStateEvent$UserUpdated;-><init>(Lio/getstream/chat/android/models/User;)V

    invoke-virtual {v0, v1, p2}, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->sendEvent(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
