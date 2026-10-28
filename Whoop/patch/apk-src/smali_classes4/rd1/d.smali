.class public Lrd1/d;
.super Lod1/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrd1/d$j;,
        Lrd1/d$k;,
        Lrd1/d$b;,
        Lrd1/d$e;,
        Lrd1/d$i;,
        Lrd1/d$h;,
        Lrd1/d$g;,
        Lrd1/d$d;,
        Lrd1/d$l;,
        Lrd1/d$m;,
        Lrd1/d$c;,
        Lrd1/d$f;
    }
.end annotation


# instance fields
.field private k:Ltd1/d;

.field private final l:Ltr2/n;

.field private m:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private n:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private o:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private p:Lze1/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lze1/d<",
            "Lsj0/a;",
            ">;"
        }
    .end annotation
.end field

.field private q:Llh3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/b;"
        }
    .end annotation
.end field

.field private final r:Ln73/a;

.field private final s:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private t:Lxg3/t;

.field private u:Lrd1/e;


# direct methods
.method public constructor <init>(Ltd1/d;)V
    .locals 2

    const-string v0, "RealTimeStream"

    invoke-direct {p0, v0}, Lod1/t;-><init>(Ljava/lang/String;)V

    const-string v0, "RealTimeStreamStateMachine"

    invoke-static {v0}, Ltr2/n;->d(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    iput-object v0, p0, Lrd1/d;->l:Ltr2/n;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lrd1/d;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lrd1/d;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lrd1/d;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-static {}, Lze1/d;->Y()Lze1/d;

    move-result-object v0

    iput-object v0, p0, Lrd1/d;->p:Lze1/d;

    new-instance v0, Ln73/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lrd1/d;->r:Ln73/a;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lrd1/d;->s:Ljava/util/HashSet;

    iput-object p1, p0, Lrd1/d;->k:Ltd1/d;

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Llh3/b;->Y(Ljava/lang/Object;Z)Llh3/b;

    move-result-object v0

    iput-object v0, p0, Lrd1/d;->q:Llh3/b;

    invoke-direct {p0}, Lrd1/d;->L()V

    invoke-direct {p0}, Lrd1/d;->K()V

    invoke-virtual {p0}, Lod1/t;->d()V

    invoke-virtual {p1}, Ltd1/d;->i()Lxg3/g;

    move-result-object v0

    new-instance v1, Lrd1/c;

    invoke-direct {v1, p0, p1}, Lrd1/c;-><init>(Lrd1/d;Ltd1/d;)V

    invoke-virtual {v0, v1}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    invoke-direct {p0}, Lrd1/d;->a0()V

    return-void
.end method

.method public static bridge synthetic A(Lrd1/d;Lsj0/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lrd1/d;->R(Lsj0/a;)V

    return-void
.end method

.method public static bridge synthetic B(Lrd1/d;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lrd1/d;->S(Ljava/lang/Object;)V

    return-void
.end method

.method public static bridge synthetic C(Lrd1/d;)V
    .locals 0

    invoke-direct {p0}, Lrd1/d;->T()V

    return-void
.end method

.method public static bridge synthetic D(Lrd1/d;)V
    .locals 0

    invoke-direct {p0}, Lrd1/d;->U()V

    return-void
.end method

.method public static bridge synthetic E(Lrd1/d;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lrd1/d;->V(Z)V

    return-void
.end method

.method public static bridge synthetic F(Lrd1/d;)V
    .locals 0

    invoke-direct {p0}, Lrd1/d;->a0()V

    return-void
.end method

.method public static synthetic G(Lrd1/d;Lod1/t$i;)Lod1/t$h;
    .locals 0

    invoke-virtual {p0, p1}, Lod1/t;->l(Lod1/t$i;)Lod1/t$h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Lrd1/d;Lod1/t$i;)Lod1/t$h;
    .locals 0

    invoke-virtual {p0, p1}, Lod1/t;->l(Lod1/t$i;)Lod1/t$h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I(Lrd1/d;Lod1/t$i;)Lod1/t$h;
    .locals 0

    invoke-virtual {p0, p1}, Lod1/t;->l(Lod1/t$i;)Lod1/t$h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J(Lrd1/d;Lod1/t$i;)Lod1/t$h;
    .locals 0

    invoke-virtual {p0, p1}, Lod1/t;->l(Lod1/t$i;)Lod1/t$h;

    move-result-object p0

    return-object p0
.end method

.method private K()V
    .locals 17

    move-object/from16 v0, p0

    new-instance v1, Lod1/t$b;

    sget-object v2, Lrd1/d$j;->ENABLE:Lrd1/d$j;

    sget-object v3, Lrd1/d$k;->DISABLED:Lrd1/d$k;

    sget-object v4, Lrd1/d$k;->ENABLING:Lrd1/d$k;

    sget-object v5, Lrd1/d$k;->DISABLING:Lrd1/d$k;

    const/4 v6, 0x4

    new-array v7, v6, [Lod1/t$i;

    const/4 v8, 0x0

    aput-object v3, v7, v8

    const/4 v9, 0x1

    aput-object v4, v7, v9

    const/4 v10, 0x2

    aput-object v5, v7, v10

    const/4 v11, 0x3

    aput-object v4, v7, v11

    invoke-direct {v1, v2, v7}, Lod1/t$b;-><init>(Lod1/t$c;[Lod1/t$i;)V

    invoke-virtual {v0, v1}, Lod1/t;->b(Lod1/t$b;)V

    new-instance v1, Lod1/t$b;

    sget-object v2, Lrd1/d$j;->ENABLED_PRIMING:Lrd1/d$j;

    sget-object v7, Lrd1/d$k;->PRIMING:Lrd1/d$k;

    new-array v12, v10, [Lod1/t$i;

    aput-object v4, v12, v8

    aput-object v7, v12, v9

    invoke-direct {v1, v2, v12}, Lod1/t$b;-><init>(Lod1/t$c;[Lod1/t$i;)V

    invoke-virtual {v0, v1}, Lod1/t;->b(Lod1/t$b;)V

    new-instance v1, Lod1/t$b;

    sget-object v2, Lrd1/d$j;->PRIMING_COMPLETE:Lrd1/d$j;

    new-array v12, v10, [Lod1/t$i;

    aput-object v7, v12, v8

    sget-object v13, Lrd1/d$k;->PRIMING_FINISHING:Lrd1/d$k;

    aput-object v13, v12, v9

    invoke-direct {v1, v2, v12}, Lod1/t$b;-><init>(Lod1/t$c;[Lod1/t$i;)V

    invoke-virtual {v0, v1}, Lod1/t;->b(Lod1/t$b;)V

    new-instance v1, Lod1/t$b;

    sget-object v2, Lrd1/d$j;->ENABLED:Lrd1/d$j;

    sget-object v12, Lrd1/d$k;->ENABLED:Lrd1/d$k;

    new-array v13, v10, [Lod1/t$i;

    aput-object v4, v13, v8

    aput-object v12, v13, v9

    invoke-direct {v1, v2, v13}, Lod1/t$b;-><init>(Lod1/t$c;[Lod1/t$i;)V

    invoke-virtual {v0, v1}, Lod1/t;->b(Lod1/t$b;)V

    new-instance v1, Lod1/t$b;

    sget-object v2, Lrd1/d$j;->REAL_TIME_DATA_RECEIVED:Lrd1/d$j;

    const/16 v13, 0x8

    new-array v13, v13, [Lod1/t$i;

    aput-object v4, v13, v8

    aput-object v12, v13, v9

    aput-object v12, v13, v10

    sget-object v14, Lrd1/d$k;->RECEIVED:Lrd1/d$k;

    aput-object v14, v13, v11

    aput-object v7, v13, v6

    sget-object v14, Lrd1/d$k;->PRIMING_RECEIVED:Lrd1/d$k;

    const/4 v15, 0x5

    aput-object v14, v13, v15

    const/4 v14, 0x6

    aput-object v3, v13, v14

    const/16 v16, 0x7

    aput-object v5, v13, v16

    invoke-direct {v1, v2, v13}, Lod1/t$b;-><init>(Lod1/t$c;[Lod1/t$i;)V

    invoke-virtual {v0, v1}, Lod1/t;->b(Lod1/t$b;)V

    new-instance v1, Lod1/t$b;

    sget-object v2, Lrd1/d$j;->DISABLE:Lrd1/d$j;

    new-array v13, v14, [Lod1/t$i;

    aput-object v12, v13, v8

    aput-object v5, v13, v9

    aput-object v4, v13, v10

    aput-object v5, v13, v11

    aput-object v7, v13, v6

    aput-object v5, v13, v15

    invoke-direct {v1, v2, v13}, Lod1/t$b;-><init>(Lod1/t$c;[Lod1/t$i;)V

    invoke-virtual {v0, v1}, Lod1/t;->b(Lod1/t$b;)V

    new-instance v1, Lod1/t$b;

    sget-object v2, Lrd1/d$j;->DISABLED:Lrd1/d$j;

    new-array v4, v10, [Lod1/t$i;

    aput-object v5, v4, v8

    aput-object v3, v4, v9

    invoke-direct {v1, v2, v4}, Lod1/t$b;-><init>(Lod1/t$c;[Lod1/t$i;)V

    invoke-virtual {v0, v1}, Lod1/t;->b(Lod1/t$b;)V

    new-instance v1, Lod1/t$b;

    sget-object v2, Lrd1/d$j;->DISCONNECTED:Lrd1/d$j;

    new-array v4, v10, [Lod1/t$i;

    sget-object v5, Lod1/t$g;->WILDCARD:Lod1/t$g;

    aput-object v5, v4, v8

    aput-object v3, v4, v9

    invoke-direct {v1, v2, v4}, Lod1/t$b;-><init>(Lod1/t$c;[Lod1/t$i;)V

    invoke-virtual {v0, v1}, Lod1/t;->b(Lod1/t$b;)V

    return-void
.end method

.method private L()V
    .locals 2

    new-instance v0, Lrd1/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lrd1/d$b;-><init>(ILrd1/d;)V

    invoke-virtual {p0, v0}, Lod1/t;->c(Lod1/t$h;)V

    new-instance v0, Lrd1/d$e;

    invoke-direct {v0, v1, p0}, Lrd1/d$e;-><init>(ILrd1/d;)V

    invoke-virtual {p0, v0}, Lod1/t;->c(Lod1/t$h;)V

    new-instance v0, Lrd1/d$i;

    invoke-direct {v0, v1, p0}, Lrd1/d$i;-><init>(ILrd1/d;)V

    invoke-virtual {p0, v0}, Lod1/t;->c(Lod1/t$h;)V

    new-instance v0, Lrd1/d$h;

    invoke-direct {v0, v1, p0}, Lrd1/d$h;-><init>(ILrd1/d;)V

    invoke-virtual {p0, v0}, Lod1/t;->c(Lod1/t$h;)V

    new-instance v0, Lrd1/d$g;

    invoke-direct {v0, v1, p0}, Lrd1/d$g;-><init>(ILrd1/d;)V

    invoke-virtual {p0, v0}, Lod1/t;->c(Lod1/t$h;)V

    new-instance v0, Lrd1/d$d;

    invoke-direct {v0, v1, p0}, Lrd1/d$d;-><init>(ILrd1/d;)V

    invoke-virtual {p0, v0}, Lod1/t;->c(Lod1/t$h;)V

    new-instance v0, Lrd1/d$l;

    invoke-direct {v0, v1, p0}, Lrd1/d$l;-><init>(ILrd1/d;)V

    invoke-virtual {p0, v0}, Lod1/t;->c(Lod1/t$h;)V

    new-instance v0, Lrd1/d$m;

    invoke-direct {v0, v1, p0}, Lrd1/d$m;-><init>(ILrd1/d;)V

    invoke-virtual {p0, v0}, Lod1/t;->c(Lod1/t$h;)V

    new-instance v0, Lrd1/d$c;

    invoke-direct {v0, v1, p0}, Lrd1/d$c;-><init>(ILrd1/d;)V

    invoke-virtual {p0, v0}, Lod1/t;->c(Lod1/t$h;)V

    return-void
.end method

.method private synthetic N(Ltd1/d;Ltd1/e;)V
    .locals 1

    sget-object v0, Ltd1/e;->READY:Ltd1/e;

    if-ne p2, v0, :cond_2

    iget-object p2, p0, Lrd1/d;->u:Lrd1/e;

    if-eqz p2, :cond_0

    invoke-interface {p2}, Lrd1/e;->a()V

    :cond_0
    invoke-virtual {p1}, Ltd1/d;->S()Ljk0/d;

    move-result-object p2

    if-eqz p2, :cond_1

    new-instance p2, Lrd1/d$f;

    invoke-virtual {p1}, Ltd1/d;->S()Ljk0/d;

    move-result-object p1

    invoke-direct {p2, p0, p1}, Lrd1/d$f;-><init>(Lrd1/d;Ljk0/d;)V

    iput-object p2, p0, Lrd1/d;->u:Lrd1/e;

    :cond_1
    iget-object p1, p0, Lrd1/d;->u:Lrd1/e;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lrd1/d;->l:Ltr2/n;

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    const-string v0, "Initializing RealTime Stream strategy"

    invoke-interface {p1, v0, p2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lrd1/d;->u:Lrd1/e;

    invoke-interface {p1}, Lrd1/e;->b()V

    :cond_2
    return-void
.end method

.method private synthetic O(Ltd1/e;)V
    .locals 2

    iget-object p1, p0, Lrd1/d;->k:Ltd1/d;

    invoke-virtual {p1}, Ltd1/d;->A()Ltd1/e;

    move-result-object p1

    sget-object v0, Lrd1/d$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    const/4 v1, 0x3

    if-eq p1, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lrd1/d;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {p0}, Lod1/t;->g()Lod1/t$h;

    move-result-object p1

    instance-of p1, p1, Lrd1/d$b;

    if-nez p1, :cond_2

    sget-object p1, Lrd1/d$j;->DISCONNECTED:Lrd1/d$j;

    invoke-virtual {p0, p1, v0}, Lod1/t;->j(Lod1/t$c;Ljava/lang/Object;)Z

    return-void

    :cond_1
    iget-object p1, p0, Lrd1/d;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object p1, p0, Lrd1/d;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lrd1/d$j;->ENABLE:Lrd1/d$j;

    invoke-virtual {p0, p1, v0}, Lod1/t;->j(Lod1/t$c;Ljava/lang/Object;)Z

    :cond_2
    :goto_0
    return-void
.end method

.method private R(Lsj0/a;)V
    .locals 2

    invoke-virtual {p0}, Lrd1/d;->M()Lrd1/b;

    move-result-object v0

    sget-object v1, Lrd1/b;->ENABLING:Lrd1/b;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lrd1/d;->q:Llh3/b;

    sget-object v1, Lrd1/b;->ENABLED:Lrd1/b;

    invoke-virtual {v0, v1}, Llh3/b;->onNext(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lrd1/d;->p:Lze1/d;

    invoke-virtual {v0, p1}, Llh3/j;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method private S(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lrd1/d;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lrd1/d$j;->REAL_TIME_DATA_RECEIVED:Lrd1/d$j;

    invoke-virtual {p0, v0, p1}, Lod1/t;->j(Lod1/t$c;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lod1/t;->g()Lod1/t$h;

    move-result-object p1

    invoke-virtual {p1}, Lod1/t$h;->d()Lod1/t$i;

    move-result-object p1

    if-eqz p1, :cond_1

    sget-object v0, Lrd1/d$k;->DISABLED:Lrd1/d$k;

    if-eq p1, v0, :cond_1

    sget-object p1, Lrd1/d$k;->ENABLING:Lrd1/d$k;

    :cond_1
    :goto_0
    return-void
.end method

.method private T()V
    .locals 4

    iget-object v0, p0, Lrd1/d;->l:Ltr2/n;

    const/4 v1, 0x0

    new-array v2, v1, [Lqr2/a$a;

    const-string v3, "Real time stream disabled"

    invoke-interface {v0, v3, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0, v1}, Lrd1/d;->V(Z)V

    sget-object v0, Lrd1/d$j;->DISABLED:Lrd1/d$j;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lod1/t;->j(Lod1/t$c;Ljava/lang/Object;)Z

    return-void
.end method

.method private U()V
    .locals 3

    iget-object v0, p0, Lrd1/d;->l:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Real time stream enabled"

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v0, Lrd1/d$j;->ENABLED:Lrd1/d$j;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0, v1}, Lod1/t;->j(Lod1/t$c;Ljava/lang/Object;)Z

    return-void
.end method

.method private declared-synchronized V(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lrd1/d;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Lrd1/d;->u:Lrd1/e;

    invoke-interface {v0, p1}, Lrd1/e;->g(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private W()V
    .locals 3

    iget-object v0, p0, Lrd1/d;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrd1/d;->l:Ltr2/n;

    const-string v1, "Starting real time stream"

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lrd1/d;->a0()V

    return-void

    :cond_0
    iget-object v0, p0, Lrd1/d;->l:Ltr2/n;

    const-string v1, "Tried to start real time stream, but already started"

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method private Y()V
    .locals 3

    iget-object v0, p0, Lrd1/d;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lrd1/d;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrd1/d;->l:Ltr2/n;

    const-string v1, "Stopping real time stream"

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v0, Lrd1/d$j;->DISABLE:Lrd1/d$j;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lod1/t;->j(Lod1/t$c;Ljava/lang/Object;)Z

    return-void

    :cond_0
    iget-object v0, p0, Lrd1/d;->l:Ltr2/n;

    const-string v1, "Stopping real time stream, but strap isn\'t connected"

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_1
    iget-object v0, p0, Lrd1/d;->l:Ltr2/n;

    const-string v1, "Tried to stop real time stream, but already stopped"

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method private a0()V
    .locals 3

    iget-object v0, p0, Lrd1/d;->t:Lxg3/t;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lxg3/t;->b()V

    :cond_0
    iget-object v0, p0, Lrd1/d;->k:Ltd1/d;

    invoke-virtual {v0}, Ltd1/d;->i()Lxg3/g;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/onboarding/c;

    const/16 v2, 0x11

    invoke-direct {v1, p0, v2}, Lcom/whoop/data/onboarding/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object v0

    iput-object v0, p0, Lrd1/d;->t:Lxg3/t;

    return-void
.end method

.method public static synthetic q(Lrd1/d;Ltd1/d;Ltd1/e;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lrd1/d;->N(Ltd1/d;Ltd1/e;)V

    return-void
.end method

.method public static synthetic r(Lrd1/d;Ltd1/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lrd1/d;->O(Ltd1/e;)V

    return-void
.end method

.method public static bridge synthetic s(Lrd1/d;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lrd1/d;->n:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static bridge synthetic t(Lrd1/d;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lrd1/d;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static bridge synthetic u(Lrd1/d;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lrd1/d;->l:Ltr2/n;

    return-object p0
.end method

.method public static bridge synthetic v(Lrd1/d;)Lrd1/e;
    .locals 0

    iget-object p0, p0, Lrd1/d;->u:Lrd1/e;

    return-object p0
.end method

.method public static bridge synthetic w(Lrd1/d;)Lze1/d;
    .locals 0

    iget-object p0, p0, Lrd1/d;->p:Lze1/d;

    return-object p0
.end method

.method public static bridge synthetic x(Lrd1/d;)Llh3/b;
    .locals 0

    iget-object p0, p0, Lrd1/d;->q:Llh3/b;

    return-object p0
.end method

.method public static bridge synthetic y(Lrd1/d;)Ltd1/d;
    .locals 0

    iget-object p0, p0, Lrd1/d;->k:Ltd1/d;

    return-object p0
.end method

.method public static bridge synthetic z(Lrd1/d;)Lxg3/t;
    .locals 0

    iget-object p0, p0, Lrd1/d;->t:Lxg3/t;

    return-object p0
.end method


# virtual methods
.method public M()Lrd1/b;
    .locals 1

    iget-object v0, p0, Lrd1/d;->q:Llh3/b;

    invoke-virtual {v0}, Llh3/b;->Z()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrd1/b;

    return-object v0
.end method

.method public P()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Lsj0/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lrd1/d;->p:Lze1/d;

    return-object v0
.end method

.method public Q()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Lrd1/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lrd1/d;->q:Llh3/b;

    return-object v0
.end method

.method public X(I)V
    .locals 4

    const-string v0, "start("

    iget-object v1, p0, Lrd1/d;->s:Ljava/util/HashSet;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lrd1/d;->l:Ltr2/n;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {v2, v0, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lrd1/d;->s:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    iget-object v2, p0, Lrd1/d;->s:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lrd1/d;->W()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public Z(I)V
    .locals 4

    const-string v0, "stop("

    iget-object v1, p0, Lrd1/d;->r:Ln73/a;

    invoke-virtual {v1}, Ln73/a;->d()V

    iget-object v1, p0, Lrd1/d;->s:Ljava/util/HashSet;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lrd1/d;->l:Ltr2/n;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {v2, v0, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lrd1/d;->s:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    iget-object v2, p0, Lrd1/d;->s:Ljava/util/HashSet;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    if-nez v0, :cond_0

    iget-object p1, p0, Lrd1/d;->s:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lrd1/d;->Y()V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
