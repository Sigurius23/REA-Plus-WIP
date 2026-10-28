.class public final Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<STATE:",
        "Ljava/lang/Object;",
        "EVENT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilderMarker;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u0001*\u0008\u0008\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ)\u0010\u000b\u001a\u00020\u00072\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\nH\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJE\u0010\u0006\u001a\u00020\u0007\"\n\u0008\u0002\u0010\r\u0018\u0001*\u00028\u00002$\u0010\u0010\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000eH\u0087\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0011J\u001b\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0012H\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00028\u00008\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017Ra\u0010\u001c\u001aL\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00028\u00000\u0019\u0012:\u00128\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00028\u00010\u0019\u0012&\u0012$\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\nj\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u001b0\u001a0\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR(\u0010 \u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\""
    }
    d2 = {
        "Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;",
        "",
        "STATE",
        "EVENT",
        "<init>",
        "()V",
        "state",
        "Ll83/a0;",
        "initialState",
        "(Ljava/lang/Object;)V",
        "Lkotlin/Function2;",
        "defaultHandler",
        "(Lc93/m;)V",
        "S",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/core/internal/fsm/builder/StateHandlerBuilder;",
        "stateHandlerBuilder",
        "(Lkotlin/jvm/functions/Function1;)V",
        "Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;",
        "build$stream_chat_android_core",
        "()Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;",
        "build",
        "_initialState",
        "Ljava/lang/Object;",
        "",
        "Lj93/d;",
        "",
        "Lio/getstream/chat/android/core/internal/fsm/builder/StateFunction;",
        "stateFunctions",
        "Ljava/util/Map;",
        "getStateFunctions",
        "()Ljava/util/Map;",
        "_defaultHandler",
        "Lc93/m;",
        "stream-chat-android-core"
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
.field private _defaultHandler:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private _initialState:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TSTATE;"
        }
    .end annotation
.end field

.field private final stateFunctions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lj93/d;",
            "Ljava/util/Map<",
            "Lj93/d;",
            "Lc93/m;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;->stateFunctions:Ljava/util/Map;

    new-instance v0, Lin0/a;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lin0/a;-><init>(I)V

    iput-object v0, p0, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;->_defaultHandler:Lc93/m;

    return-void
.end method

.method private static final _defaultHandler$lambda$0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "s"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;->_defaultHandler$lambda$0(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final build$stream_chat_android_core()Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine<",
            "TSTATE;TEVENT;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;->_initialState:Ljava/lang/Object;

    if-eqz v0, :cond_0

    new-instance v1, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;

    iget-object v2, p0, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;->stateFunctions:Ljava/util/Map;

    iget-object v3, p0, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;->_defaultHandler:Lc93/m;

    invoke-direct {v1, v0, v2, v3}, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;-><init>(Ljava/lang/Object;Ljava/util/Map;Lc93/m;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Initial state must be set!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final defaultHandler(Lc93/m;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            ")V"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilderMarker;
    .end annotation

    const-string v0, "defaultHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;->_defaultHandler:Lc93/m;

    return-void
.end method

.method public final getStateFunctions()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lj93/d;",
            "Ljava/util/Map<",
            "Lj93/d;",
            "Lc93/m;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;->stateFunctions:Ljava/util/Map;

    return-object v0
.end method

.method public final initialState(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TSTATE;)V"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilderMarker;
    .end annotation

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilder;->_initialState:Ljava/lang/Object;

    return-void
.end method

.method public final state(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S::TSTATE;>(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/fsm/builder/FSMBuilderMarker;
    .end annotation

    const-string v0, "stateHandlerBuilder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    const/4 p1, 0x0

    throw p1
.end method
