.class public Lcom/whoop/realtime/service/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/realtime/service/b$c;
    }
.end annotation


# instance fields
.field private a:Llh3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/b;"
        }
    .end annotation
.end field

.field private final b:Lcom/whoop/data/repositories/FeatureFlagRepository;

.field private final c:Lp92/c;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lp92/h$a;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Lcom/whoop/ui/l;

.field private final f:Ltr2/n;

.field private final g:Liy1/c;

.field private final h:Lz92/a;

.field private final i:I

.field private final j:Landroid/content/Context;

.field private final k:Lp92/f;

.field private final l:Llm2/a;

.field private m:Lcom/whoop/realtime/service/RealTimeActivityService;

.field private n:Lcom/whoop/realtime/service/b$c;

.field private o:Z

.field private final p:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Lbh3/b;",
            ">;"
        }
    .end annotation
.end field

.field private q:Landroid/content/BroadcastReceiver;

.field private final r:Landroid/content/ServiceConnection;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnspecifiedRegisterReceiverFlag"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Lcom/whoop/data/repositories/FeatureFlagRepository;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagRepository;

    iput-object v0, p0, Lcom/whoop/realtime/service/b;->b:Lcom/whoop/data/repositories/FeatureFlagRepository;

    const-class v0, Lp92/c;

    invoke-static {v0, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lp92/c;

    iput-object v0, p0, Lcom/whoop/realtime/service/b;->c:Lp92/c;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/whoop/realtime/service/b;->d:Ljava/util/List;

    new-instance v0, Lcom/whoop/ui/l;

    invoke-direct {v0}, Lcom/whoop/ui/l;-><init>()V

    iput-object v0, p0, Lcom/whoop/realtime/service/b;->e:Lcom/whoop/ui/l;

    const-string v0, "RealTimeActivityController"

    invoke-static {v0}, Ltr2/n;->d(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/realtime/service/b;->f:Ltr2/n;

    const-class v0, Liy1/c;

    invoke-static {v0, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Liy1/c;

    iput-object v0, p0, Lcom/whoop/realtime/service/b;->g:Liy1/c;

    const-class v0, Lz92/a;

    invoke-static {v0, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz92/a;

    iput-object v0, p0, Lcom/whoop/realtime/service/b;->h:Lz92/a;

    const/16 v0, 0x7d0

    iput v0, p0, Lcom/whoop/realtime/service/b;->i:I

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/whoop/realtime/service/b;->p:Ljava/util/Queue;

    new-instance v0, Lcom/whoop/realtime/service/b$a;

    invoke-direct {v0, p0}, Lcom/whoop/realtime/service/b$a;-><init>(Lcom/whoop/realtime/service/b;)V

    iput-object v0, p0, Lcom/whoop/realtime/service/b;->q:Landroid/content/BroadcastReceiver;

    new-instance v0, Lcom/whoop/realtime/service/b$b;

    invoke-direct {v0, p0}, Lcom/whoop/realtime/service/b$b;-><init>(Lcom/whoop/realtime/service/b;)V

    iput-object v0, p0, Lcom/whoop/realtime/service/b;->r:Landroid/content/ServiceConnection;

    iput-object p1, p0, Lcom/whoop/realtime/service/b;->j:Landroid/content/Context;

    new-instance v1, Lp92/f;

    invoke-direct {v1, p1}, Lp92/f;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, Lcom/whoop/realtime/service/b;->k:Lp92/f;

    new-instance v1, Llm2/a;

    invoke-direct {v1}, Llm2/a;-><init>()V

    iput-object v1, p0, Lcom/whoop/realtime/service/b;->l:Llm2/a;

    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/whoop/realtime/service/RealTimeActivityService;

    invoke-direct {v1, p1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget-object v2, Le92/a;->a:Le92/a;

    invoke-virtual {v2}, Le92/a;->a()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v0, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/whoop/realtime/service/b;->q:Landroid/content/BroadcastReceiver;

    invoke-static {p1}, Lcom/whoop/realtime/service/c;->b(Landroid/content/Context;)Landroid/content/IntentFilter;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    return-void

    :cond_0
    iget-object v0, p0, Lcom/whoop/realtime/service/b;->q:Landroid/content/BroadcastReceiver;

    invoke-static {p1}, Lcom/whoop/realtime/service/c;->b(Landroid/content/Context;)Landroid/content/IntentFilter;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    :cond_1
    return-void
.end method

.method private static synthetic A(Lod1/u$a;)Ljava/lang/Boolean;
    .locals 0

    invoke-virtual {p0}, Lod1/u$a;->c()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic B(Landroid/content/Context;Lod1/u$a;)V
    .locals 0

    invoke-static {p0}, Lcom/whoop/realtime/service/b;->m(Landroid/content/Context;)V

    return-void
.end method

.method private static synthetic C(Lp92/f;Landroid/content/Context;Li92/h;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    invoke-virtual {p2}, Li92/h;->a()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lp92/f;->d()I

    move-result p0

    if-lez p0, :cond_0

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object p0

    invoke-virtual {p0}, Le50/b;->d()Ltr2/n;

    move-result-object p0

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    const-string v0, "RealTimeActivityController"

    const-string v1, "Detected network availability, syncing persisted real time activities"

    invoke-interface {p0, v0, v1, p2}, Ltr2/n;->k(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {p1}, Lcom/whoop/realtime/service/b;->r(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method private synthetic D(Lbh3/b;Lp92/e;Lcom/whoop/realtime/service/RealTimeActivityService;)V
    .locals 4

    iget-object v0, p0, Lcom/whoop/realtime/service/b;->h:Lz92/a;

    invoke-interface {v0}, Lz92/a;->d()Lcom/whoop/domain/model/User;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getProfile()Lcom/whoop/domain/model/UserProfile;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object p2, p0, Lcom/whoop/realtime/service/b;->f:Ltr2/n;

    invoke-direct {p0, p1, p2}, Lcom/whoop/realtime/service/b;->G(Lbh3/b;Ltr2/n;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/whoop/realtime/service/b;->f:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "RealTimeActivityController"

    const-string v3, "Starting activity recording from restoration"

    invoke-interface {v0, v2, v3, v1}, Ltr2/n;->k(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p3, p2}, Lcom/whoop/realtime/service/RealTimeActivityService;->o(Lp92/e;)V

    invoke-interface {p1, p2}, Lbh3/b;->b(Ljava/lang/Object;)V

    return-void

    :cond_1
    iget-object p2, p0, Lcom/whoop/realtime/service/b;->f:Ltr2/n;

    invoke-direct {p0, p1, p2}, Lcom/whoop/realtime/service/b;->G(Lbh3/b;Ltr2/n;)V

    return-void
.end method

.method private static synthetic E(Lp92/e;Lcom/whoop/realtime/service/RealTimeActivityService;)V
    .locals 0

    invoke-virtual {p1, p0}, Lcom/whoop/realtime/service/RealTimeActivityService;->o(Lp92/e;)V

    return-void
.end method

.method private F(Lcom/whoop/realtime/service/a;)V
    .locals 2

    sget-object v0, Lcom/whoop/realtime/service/a;->Companion:Lcom/whoop/realtime/service/a$a;

    iget-object v1, p0, Lcom/whoop/realtime/service/b;->g:Liy1/c;

    invoke-virtual {v0, p1, v1}, Lcom/whoop/realtime/service/a$a;->a(Lcom/whoop/realtime/service/a;Liy1/c;)V

    return-void
.end method

.method private G(Lbh3/b;Ltr2/n;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbh3/b;",
            "Ltr2/n;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "RealTimeActivityController"

    const-string v2, "Restoration of recording failed. Cannot start recording without user profile info"

    invoke-interface {p2, v1, v2, v0}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    const/4 p2, 0x0

    invoke-interface {p1, p2}, Lbh3/b;->b(Ljava/lang/Object;)V

    return-void
.end method

.method private H(Lcom/whoop/realtime/service/RealTimeActivityService;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lcom/whoop/realtime/service/b;->o:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/realtime/service/b;->q()V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iput-object p1, p0, Lcom/whoop/realtime/service/b;->m:Lcom/whoop/realtime/service/RealTimeActivityService;

    iget-object v0, p0, Lcom/whoop/realtime/service/b;->a:Llh3/b;

    if-eqz v0, :cond_1

    invoke-virtual {p1, v0}, Lcom/whoop/realtime/service/RealTimeActivityService;->d(Llh3/b;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/whoop/realtime/service/b;->f:Ltr2/n;

    const-string v1, "RealTimeActivityControllerStrainCoach - strainControllerSubject is null onServiceConnected"

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_0
    iget-object v0, p0, Lcom/whoop/realtime/service/b;->p:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbh3/b;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Lbh3/b;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private I()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    iput-object v0, p0, Lcom/whoop/realtime/service/b;->m:Lcom/whoop/realtime/service/RealTimeActivityService;

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private K(Lbh3/b;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbh3/b;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/whoop/realtime/service/b;->s()Lp92/e;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/whoop/realtime/service/b;->f:Ltr2/n;

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v3, "RealTimeActivityController"

    const-string v4, "Restoring existing recording"

    invoke-interface {v1, v3, v4, v2}, Ltr2/n;->k(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v1, Ls52/b;

    invoke-direct {v1, p0, p1, v0}, Ls52/b;-><init>(Lcom/whoop/realtime/service/b;Lbh3/b;Lp92/e;)V

    invoke-direct {p0, v1}, Lcom/whoop/realtime/service/b;->L(Lbh3/b;)V

    return-void

    :cond_0
    sget-object v0, Lcom/whoop/realtime/service/a;->NO_ACTIVITY_INFO:Lcom/whoop/realtime/service/a;

    invoke-direct {p0, v0}, Lcom/whoop/realtime/service/b;->F(Lcom/whoop/realtime/service/a;)V

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lbh3/b;->b(Ljava/lang/Object;)V

    return-void
.end method

.method private L(Lbh3/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbh3/b;",
            ")V"
        }
    .end annotation

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/realtime/service/b;->m:Lcom/whoop/realtime/service/RealTimeActivityService;

    if-eqz v0, :cond_0

    invoke-interface {p1, v0}, Lbh3/b;->b(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/whoop/realtime/service/b;->p:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static synthetic a(Lp92/e;Lcom/whoop/realtime/service/RealTimeActivityService;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/service/b;->E(Lp92/e;Lcom/whoop/realtime/service/RealTimeActivityService;)V

    return-void
.end method

.method public static synthetic b(Landroid/content/Context;Lod1/u$a;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/service/b;->B(Landroid/content/Context;Lod1/u$a;)V

    return-void
.end method

.method public static synthetic c(Lod1/u$a;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Lcom/whoop/realtime/service/b;->A(Lod1/u$a;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp92/f;Landroid/content/Context;Li92/h;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/realtime/service/b;->C(Lp92/f;Landroid/content/Context;Li92/h;)V

    return-void
.end method

.method public static synthetic e(Lcom/whoop/realtime/service/b;Ljava/lang/Long;Ljava/lang/Runnable;Lcom/whoop/realtime/service/RealTimeActivityService;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/realtime/service/b;->y(Ljava/lang/Long;Ljava/lang/Runnable;Lcom/whoop/realtime/service/RealTimeActivityService;)V

    return-void
.end method

.method public static synthetic f(Lcom/whoop/realtime/service/b;Lp92/e;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/service/b;->z(Lcom/whoop/realtime/service/b;Lp92/e;)V

    return-void
.end method

.method public static synthetic g(Lcom/whoop/realtime/service/b;Lbh3/b;Lp92/e;Lcom/whoop/realtime/service/RealTimeActivityService;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/realtime/service/b;->D(Lbh3/b;Lp92/e;Lcom/whoop/realtime/service/RealTimeActivityService;)V

    return-void
.end method

.method public static bridge synthetic h(Lcom/whoop/realtime/service/b;)Lcom/whoop/realtime/service/b$c;
    .locals 0

    iget-object p0, p0, Lcom/whoop/realtime/service/b;->n:Lcom/whoop/realtime/service/b$c;

    return-object p0
.end method

.method public static bridge synthetic i(Lcom/whoop/realtime/service/b;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/realtime/service/b;->f:Ltr2/n;

    return-object p0
.end method

.method public static bridge synthetic j(Lcom/whoop/realtime/service/b;Lcom/whoop/realtime/service/RealTimeActivityService;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/realtime/service/b;->H(Lcom/whoop/realtime/service/RealTimeActivityService;)V

    return-void
.end method

.method public static bridge synthetic k(Lcom/whoop/realtime/service/b;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/realtime/service/b;->I()V

    return-void
.end method

.method private static l(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Lp92/f;

    invoke-direct {v0, p0}, Lp92/f;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lp92/f;->d()I

    move-result v0

    if-lez v0, :cond_0

    invoke-static {p0}, Lcom/whoop/realtime/service/b;->r(Landroid/content/Context;)V

    :cond_0
    return-void
.end method

.method private static m(Landroid/content/Context;)V
    .locals 1

    new-instance v0, Lcom/whoop/realtime/service/b;

    invoke-direct {v0, p0}, Lcom/whoop/realtime/service/b;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/whoop/realtime/service/b;->p()V

    return-void
.end method

.method private o(Ljava/lang/Runnable;)V
    .locals 7

    invoke-virtual {p0}, Lcom/whoop/realtime/service/b;->s()Lp92/e;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lp92/e;->c()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    iget-object v2, p0, Lcom/whoop/realtime/service/b;->c:Lp92/c;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-virtual {v2, v3, v4, v5, v6}, Lp92/c;->d(JJ)V

    :cond_1
    iget-object v2, p0, Lcom/whoop/realtime/service/b;->k:Lp92/f;

    invoke-virtual {v2, v1}, Lp92/f;->k(Lp92/e;)V

    new-instance v1, Ls52/a;

    invoke-direct {v1, p0, v0, p1}, Ls52/a;-><init>(Lcom/whoop/realtime/service/b;Ljava/lang/Long;Ljava/lang/Runnable;)V

    invoke-direct {p0, v1}, Lcom/whoop/realtime/service/b;->L(Lbh3/b;)V

    return-void
.end method

.method private static r(Landroid/content/Context;)V
    .locals 0

    invoke-static {p0}, Ls52/f;->e(Landroid/content/Context;)V

    return-void
.end method

.method private t(Ljava/util/List;I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lp92/h$a;",
            ">;I)",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Lp92/h$a;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    if-ge v2, p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp92/h$a;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static v(Landroid/content/Context;)V
    .locals 4

    invoke-static {p0}, Lcom/whoop/realtime/service/b;->x(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/whoop/realtime/service/b;

    invoke-direct {v0, p0}, Lcom/whoop/realtime/service/b;-><init>(Landroid/content/Context;)V

    new-instance v1, Lcom/whoop/data/onboarding/c;

    const/16 v2, 0x13

    invoke-direct {v1, v0, v2}, Lcom/whoop/data/onboarding/c;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, v1}, Lcom/whoop/realtime/service/b;->K(Lbh3/b;)V

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lcom/whoop/realtime/service/b;->m(Landroid/content/Context;)V

    :goto_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v0

    invoke-virtual {v0}, Le50/b;->g()Lod1/u;

    move-result-object v0

    invoke-virtual {v0}, Lod1/u;->j()Lxg3/g;

    move-result-object v0

    new-instance v1, Los/a;

    const/16 v2, 0x1b

    invoke-direct {v1, v2}, Los/a;-><init>(I)V

    invoke-virtual {v0, v1}, Lxg3/g;->n(Lbh3/g;)Lxg3/g;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/onboarding/c;

    const/16 v2, 0x14

    invoke-direct {v1, p0, v2}, Lcom/whoop/data/onboarding/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    new-instance v0, Lp92/f;

    invoke-direct {v0, p0}, Lp92/f;-><init>(Landroid/content/Context;)V

    const-class v1, Li92/e;

    const/4 v2, 0x0

    invoke-static {v1, v2, v2}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li92/e;

    invoke-interface {v1}, Li92/e;->b()Ll73/c;

    move-result-object v1

    new-instance v2, Lbu/d;

    const/4 v3, 0x7

    invoke-direct {v2, v3, v0, p0}, Lbu/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lt73/b;

    sget-object v3, Lr73/a;->d:Ljc/a;

    invoke-direct {v0, v2, v3}, Lt73/b;-><init>(Lp73/b;Lp73/b;)V

    invoke-virtual {v1, v0}, Ll73/c;->c(Ll73/d;)V

    invoke-static {p0}, Lcom/whoop/realtime/service/b;->l(Landroid/content/Context;)V

    return-void
.end method

.method public static w(Landroid/content/Context;Landroid/app/NotificationManager;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/realtime/service/RealTimeActivityService;->h(Landroid/content/Context;Landroid/app/NotificationManager;)V

    return-void
.end method

.method public static x(Landroid/content/Context;)Z
    .locals 1

    new-instance v0, Lp92/f;

    invoke-direct {v0, p0}, Lp92/f;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lp92/f;->b()Lp92/e;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private synthetic y(Ljava/lang/Long;Ljava/lang/Runnable;Lcom/whoop/realtime/service/RealTimeActivityService;)V
    .locals 1

    invoke-virtual {p3}, Lcom/whoop/realtime/service/RealTimeActivityService;->p()V

    iget-object p3, p0, Lcom/whoop/realtime/service/b;->j:Landroid/content/Context;

    const/4 v0, 0x0

    invoke-static {p3, p1, v0}, Lcom/whoop/realtime/service/c;->a(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/Long;)V

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method

.method private static synthetic z(Lcom/whoop/realtime/service/b;Lp92/e;)V
    .locals 0

    invoke-virtual {p0}, Lcom/whoop/realtime/service/b;->q()V

    return-void
.end method


# virtual methods
.method public J(Lp92/e;J)V
    .locals 4

    iget-object v0, p0, Lcom/whoop/realtime/service/b;->f:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "RealTimeActivityControllerPersisting activity from "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lp92/e;->c()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " to be retried later"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lcom/whoop/realtime/service/b;->k:Lp92/f;

    invoke-virtual {v0, p1, p2, p3}, Lp92/f;->f(Lp92/e;J)I

    iget-object p1, p0, Lcom/whoop/realtime/service/b;->j:Landroid/content/Context;

    invoke-static {p1}, Lcom/whoop/realtime/service/b;->r(Landroid/content/Context;)V

    return-void
.end method

.method public M(J)Lxg3/g;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lxg3/g<",
            "Lod1/k;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/realtime/service/b;->f:Ltr2/n;

    const-string v1, "RealTimeActivityController saveActivity "

    invoke-static {p1, p2, v1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Ls52/c;

    invoke-direct {v0}, Ls52/c;-><init>()V

    invoke-direct {p0, v0}, Lcom/whoop/realtime/service/b;->L(Lbh3/b;)V

    invoke-virtual {p0}, Lcom/whoop/realtime/service/b;->s()Lp92/e;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/realtime/service/b;->f:Ltr2/n;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "RealTimeActivityController saveActivity startInfo "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v4, v2, [Lqr2/a$a;

    invoke-interface {v1, v3, v4}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    if-nez v0, :cond_0

    iget-object p1, p0, Lcom/whoop/realtime/service/b;->f:Ltr2/n;

    const-string p2, "RealTimeActivityController startInfo null"

    new-array v0, v2, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Ljava/lang/Throwable;

    const-string p2, "RealTimeActivityStartInfo - current recording info  is null "

    invoke-direct {p1, p2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lxg3/g;->m(Ljava/lang/Throwable;)Lxg3/g;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v1

    invoke-virtual {v1}, Le50/b;->c()Lod1/f;

    move-result-object v1

    new-instance v3, Lorg/joda/time/DateTime;

    invoke-virtual {v0}, Lp92/e;->c()J

    move-result-wide v4

    invoke-direct {v3, v4, v5}, Lorg/joda/time/DateTime;-><init>(J)V

    new-instance v4, Lorg/joda/time/DateTime;

    invoke-direct {v4, p1, p2}, Lorg/joda/time/DateTime;-><init>(J)V

    iget-object v5, p0, Lcom/whoop/realtime/service/b;->l:Llm2/a;

    invoke-virtual {v0}, Lp92/e;->a()Llm2/b;

    move-result-object v6

    invoke-virtual {v5, v6}, Llm2/a;->e(Llm2/b;)V

    invoke-virtual {v0}, Lp92/e;->a()Llm2/b;

    move-result-object v5

    instance-of v5, v5, Llm2/c;

    if-eqz v5, :cond_1

    iget-object v5, p0, Lcom/whoop/realtime/service/b;->f:Ltr2/n;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "RealTimeActivityController saving start: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, "end: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-array v7, v2, [Lqr2/a$a;

    invoke-interface {v5, v6, v7}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {v0}, Lp92/e;->a()Llm2/b;

    move-result-object v5

    invoke-interface {v5, v1, v3, v4}, Llm2/b;->f(Lod1/f;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lxg3/g;

    move-result-object v1

    iget-object v3, p0, Lcom/whoop/realtime/service/b;->f:Ltr2/n;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "RealTimeActivityController saving result "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v3, v4, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_0

    :cond_1
    iget-object v5, p0, Lcom/whoop/realtime/service/b;->d:Ljava/util/List;

    if-eqz v5, :cond_2

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_2

    const/4 v2, 0x1

    :cond_2
    invoke-virtual {v0, v2}, Lp92/e;->g(Z)V

    invoke-virtual {v0}, Lp92/e;->a()Llm2/b;

    move-result-object v5

    check-cast v5, Llm2/d;

    invoke-virtual {v5, v1, v3, v4, v2}, Llm2/d;->s(Lod1/f;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Z)Lxg3/g;

    move-result-object v1

    :goto_0
    iget-object v2, p0, Lcom/whoop/realtime/service/b;->j:Landroid/content/Context;

    invoke-virtual {v0}, Lp92/e;->c()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v2, v0, p1}, Lcom/whoop/realtime/service/c;->a(Landroid/content/Context;Ljava/lang/Long;Ljava/lang/Long;)V

    iget-object p1, p0, Lcom/whoop/realtime/service/b;->k:Lp92/f;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp92/f;->k(Lp92/e;)V

    return-object v1
.end method

.method public N(Lp92/e;J)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp92/e;",
            "J)",
            "Ljava/util/List<",
            "Lxg3/g<",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p1}, Lp92/e;->a()Llm2/b;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/realtime/service/b;->d:Ljava/util/List;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v3

    invoke-virtual {v3}, Le50/b;->c()Lod1/f;

    move-result-object v3

    new-instance v4, Lorg/joda/time/DateTime;

    invoke-virtual {p1}, Lp92/e;->c()J

    move-result-wide v5

    invoke-direct {v4, v5, v6}, Lorg/joda/time/DateTime;-><init>(J)V

    new-instance p1, Lorg/joda/time/DateTime;

    invoke-direct {p1, p2, p3}, Lorg/joda/time/DateTime;-><init>(J)V

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iget-object p3, p0, Lcom/whoop/realtime/service/b;->d:Ljava/util/List;

    const/16 v5, 0x7d0

    invoke-direct {p0, p3, v5}, Lcom/whoop/realtime/service/b;->t(Ljava/util/List;I)Ljava/util/List;

    move-result-object p3

    instance-of v5, v0, Llm2/d;

    if-eqz v5, :cond_1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/whoop/realtime/service/b;->f:Ltr2/n;

    const-string v5, "RealTimeActivityController saveGps"

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, v5, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    move-object v2, v0

    check-cast v2, Llm2/d;

    invoke-virtual {v2, v3, v4, p1, v1}, Llm2/d;->x(Lod1/f;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/util/List;)Lxg3/g;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    return-object p2
.end method

.method public O(Lcom/whoop/realtime/service/b$c;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/realtime/service/b;->n:Lcom/whoop/realtime/service/b$c;

    return-void
.end method

.method public P(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/data/local/room/entity/GpsDto;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/whoop/realtime/service/b;->d:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/local/room/entity/GpsDto;

    iget-object v1, p0, Lcom/whoop/realtime/service/b;->d:Ljava/util/List;

    invoke-virtual {v0}, Lcom/whoop/data/local/room/entity/GpsDto;->toRoutePoint()Lp92/h$a;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-void
.end method

.method public Q(JLlm2/b;Lcom/whoop/data/repositories/RestingHeartRate;)V
    .locals 9

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move-object v8, p4

    invoke-virtual/range {v0 .. v8}, Lcom/whoop/realtime/service/b;->R(JLlm2/b;Lcom/whoop/domain/model/StrainRecoveryMapping;DZLcom/whoop/data/repositories/RestingHeartRate;)V

    return-void
.end method

.method public R(JLlm2/b;Lcom/whoop/domain/model/StrainRecoveryMapping;DZLcom/whoop/data/repositories/RestingHeartRate;)V
    .locals 12

    iget-object v0, p0, Lcom/whoop/realtime/service/b;->f:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "RealTimeActivityControllerSTRAINCOACH activityController startActivity mapping: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-nez p4, :cond_0

    const-string v2, "null"

    goto :goto_0

    :cond_0
    invoke-virtual/range {p4 .. p4}, Lcom/whoop/domain/model/StrainRecoveryMapping;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " goal: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v8, p5

    invoke-virtual {v1, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v3, Lp92/e;

    move-wide v4, p1

    move-object v6, p3

    move-object/from16 v7, p4

    move/from16 v10, p7

    move-object/from16 v11, p8

    invoke-direct/range {v3 .. v11}, Lp92/e;-><init>(JLlm2/b;Lcom/whoop/domain/model/StrainRecoveryMapping;DZLcom/whoop/data/repositories/RestingHeartRate;)V

    iget-object p1, p0, Lcom/whoop/realtime/service/b;->k:Lp92/f;

    invoke-virtual {p1, v3}, Lp92/f;->k(Lp92/e;)V

    new-instance p1, Lo52/m0;

    const/16 p2, 0x1a

    invoke-direct {p1, v3, p2}, Lo52/m0;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p0, p1}, Lcom/whoop/realtime/service/b;->L(Lbh3/b;)V

    return-void
.end method

.method public n(Llh3/b;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llh3/b;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/realtime/service/b;->f:Ltr2/n;

    const/4 v1, 0x0

    new-array v2, v1, [Lqr2/a$a;

    const-string v3, "RealTimeActivityController RealTimeActivityController connect straincontroller subject"

    invoke-interface {v0, v3, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iput-object p1, p0, Lcom/whoop/realtime/service/b;->a:Llh3/b;

    iget-object v0, p0, Lcom/whoop/realtime/service/b;->m:Lcom/whoop/realtime/service/RealTimeActivityService;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/whoop/realtime/service/RealTimeActivityService;->d(Llh3/b;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/whoop/realtime/service/b;->f:Ltr2/n;

    const-string v0, "RealTimeActivityControllerStrainCoach - connectStrainControllerSubject service is null"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public p()V
    .locals 2

    new-instance v0, Landroidx/lifecycle/z0;

    const/16 v1, 0x14

    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/z0;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p0, v0}, Lcom/whoop/realtime/service/b;->o(Ljava/lang/Runnable;)V

    return-void
.end method

.method public q()V
    .locals 3

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lcom/whoop/realtime/service/b;->o:Z

    iget-object v0, p0, Lcom/whoop/realtime/service/b;->m:Lcom/whoop/realtime/service/RealTimeActivityService;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/realtime/service/b;->j:Landroid/content/Context;

    iget-object v2, p0, Lcom/whoop/realtime/service/b;->r:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v2}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iput-object v1, p0, Lcom/whoop/realtime/service/b;->m:Lcom/whoop/realtime/service/RealTimeActivityService;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/whoop/realtime/service/b;->q:Landroid/content/BroadcastReceiver;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    :try_start_1
    iget-object v2, p0, Lcom/whoop/realtime/service/b;->j:Landroid/content/Context;

    invoke-virtual {v2, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    :try_start_2
    iput-object v1, p0, Lcom/whoop/realtime/service/b;->q:Landroid/content/BroadcastReceiver;

    :cond_1
    iget-object v0, p0, Lcom/whoop/realtime/service/b;->e:Lcom/whoop/ui/l;

    invoke-virtual {v0}, Lcom/whoop/ui/l;->b()V

    monitor-exit p0

    return-void

    :goto_1
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public s()Lp92/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/service/b;->k:Lp92/f;

    invoke-virtual {v0}, Lp92/f;->b()Lp92/e;

    move-result-object v0

    return-object v0
.end method

.method public u()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/realtime/service/b;->m:Lcom/whoop/realtime/service/RealTimeActivityService;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/realtime/service/RealTimeActivityService;->f()Lp92/h;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/realtime/service/b;->m:Lcom/whoop/realtime/service/RealTimeActivityService;

    invoke-virtual {v0}, Lcom/whoop/realtime/service/RealTimeActivityService;->f()Lp92/h;

    move-result-object v0

    invoke-virtual {v0}, Lp92/h;->H()Landroidx/lifecycle/p0;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
