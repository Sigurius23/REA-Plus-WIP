.class public final Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        "E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \"*\u0008\u0008\u0000\u0010\u0002*\u00020\u0001*\u0008\u0008\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0001\"B{\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012P\u0010\t\u001aL\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00028\u00000\u0006\u0012:\u00128\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00028\u00010\u0006\u0012&\u0012$\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00080\u00050\u0005\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0001H\u0086@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R^\u0010\t\u001aL\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00028\u00000\u0006\u0012:\u00128\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00028\u00010\u0006\u0012&\u0012$\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0007j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00080\u00050\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0013R&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u001d\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR\u0011\u0010!\u001a\u00028\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010\u0012\u00a8\u0006#"
    }
    d2 = {
        "Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;",
        "",
        "S",
        "E",
        "initialState",
        "",
        "Lj93/d;",
        "Lkotlin/Function2;",
        "Lio/getstream/chat/android/core/internal/fsm/builder/StateFunction;",
        "stateFunctions",
        "defaultEventHandler",
        "<init>",
        "(Ljava/lang/Object;Ljava/util/Map;Lc93/m;)V",
        "event",
        "Ll83/a0;",
        "sendEvent",
        "(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;",
        "stay",
        "()Ljava/lang/Object;",
        "Ljava/util/Map;",
        "Lc93/m;",
        "Lmc3/a;",
        "mutex",
        "Lmc3/a;",
        "Lec3/p1;",
        "_state",
        "Lec3/p1;",
        "Lec3/f2;",
        "stateFlow",
        "Lec3/f2;",
        "getStateFlow",
        "()Lec3/f2;",
        "getState",
        "state",
        "Companion",
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


# static fields
.field public static final Companion:Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine$Companion;


# instance fields
.field private final _state:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final defaultEventHandler:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final mutex:Lmc3/a;

.field private final stateFlow:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
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
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->Companion:Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/util/Map;Lc93/m;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;",
            "Ljava/util/Map<",
            "Lj93/d;",
            "+",
            "Ljava/util/Map<",
            "Lj93/d;",
            "+",
            "Lc93/m;",
            ">;>;",
            "Lc93/m;",
            ")V"
        }
    .end annotation

    const-string v0, "initialState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateFunctions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultEventHandler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->stateFunctions:Ljava/util/Map;

    iput-object p3, p0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->defaultEventHandler:Lc93/m;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->mutex:Lmc3/a;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->_state:Lec3/p1;

    iput-object p1, p0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->stateFlow:Lec3/f2;

    return-void
.end method


# virtual methods
.method public final getState()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TS;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->_state:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getStateFlow()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->stateFlow:Lec3/f2;

    return-object v0
.end method

.method public final sendEvent(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine$sendEvent$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine$sendEvent$1;

    iget v1, v0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine$sendEvent$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine$sendEvent$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine$sendEvent$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine$sendEvent$1;-><init>(Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine$sendEvent$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine$sendEvent$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine$sendEvent$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lmc3/a;

    iget-object v0, v0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine$sendEvent$1;->L$0:Ljava/lang/Object;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    move-object p1, v0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->mutex:Lmc3/a;

    iput-object p1, v0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine$sendEvent$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine$sendEvent$1;->L$1:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine$sendEvent$1;->I$0:I

    iput v3, v0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine$sendEvent$1;->label:I

    invoke-interface {p2, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->_state:Lec3/p1;

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->stateFunctions:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    if-eqz v2, :cond_4

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v4, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lc93/m;

    if-nez v2, :cond_5

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_4
    :goto_2
    iget-object v2, p0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->defaultEventHandler:Lc93/m;

    :cond_5
    iget-object v3, p0, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->_state:Lec3/p1;

    invoke-interface {v2, v1, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast v3, Lec3/h2;

    invoke-virtual {v3, p1}, Lec3/h2;->j(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p2, v0}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :goto_3
    invoke-interface {p2, v0}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method

.method public final stay()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TS;"
        }
    .end annotation

    invoke-virtual {p0}, Lio/getstream/chat/android/core/internal/fsm/FiniteStateMachine;->getState()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
