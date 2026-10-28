.class public final Ljc/v;
.super Lic/p0;
.source "SourceFile"


# static fields
.field public static k:Ljc/v;

.field public static l:Ljc/v;

.field public static final m:Ljava/lang/Object;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lic/b;

.field public final c:Landroidx/work/impl/WorkDatabase;

.field public final d:Lsc/a;

.field public final e:Ljava/util/List;

.field public final f:Ljc/g;

.field public final g:Lbu/c;

.field public h:Z

.field public i:Landroid/content/BroadcastReceiver$PendingResult;

.field public final j:Loc/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkManagerImpl"

    invoke-static {v0}, Lic/w;->f(Ljava/lang/String;)Ljava/lang/String;

    const/4 v0, 0x0

    sput-object v0, Ljc/v;->k:Ljc/v;

    sput-object v0, Ljc/v;->l:Ljc/v;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ljc/v;->m:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lic/b;Lsc/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;Ljc/g;Loc/i;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ljc/v;->h:Z

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->isDeviceProtectedStorage()Z

    move-result v1

    if-nez v1, :cond_2

    new-instance v1, Lic/w;

    iget v2, p2, Lic/b;->h:I

    invoke-direct {v1, v2}, Lic/w;-><init>(I)V

    sget-object v2, Lic/w;->b:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    sget-object v3, Lic/w;->c:Lic/w;

    if-nez v3, :cond_0

    sput-object v1, Lic/w;->c:Lic/w;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object p1, p0, Ljc/v;->a:Landroid/content/Context;

    iput-object p3, p0, Ljc/v;->d:Lsc/a;

    iput-object p4, p0, Ljc/v;->c:Landroidx/work/impl/WorkDatabase;

    iput-object p6, p0, Ljc/v;->f:Ljc/g;

    iput-object p7, p0, Ljc/v;->j:Loc/i;

    iput-object p2, p0, Ljc/v;->b:Lic/b;

    iput-object p5, p0, Ljc/v;->e:Ljava/util/List;

    move-object p7, p3

    check-cast p7, Lsc/b;

    iget-object v1, p7, Lsc/b;->b:Lbc3/z;

    const-string v2, "getTaskCoroutineDispatcher(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object v1

    new-instance v2, Lbu/c;

    invoke-direct {v2, p4}, Lbu/c;-><init>(Ljava/lang/Object;)V

    iput-object v2, p0, Ljc/v;->g:Lbu/c;

    iget-object p7, p7, Lsc/b;->a:Landroidx/room/u1;

    sget-object v2, Ljc/k;->a:Ljava/lang/String;

    new-instance v2, Ljc/j;

    invoke-direct {v2, p7, p5, p2, p4}, Ljc/j;-><init>(Landroidx/room/u1;Ljava/util/List;Lic/b;Landroidx/work/impl/WorkDatabase;)V

    invoke-virtual {p6, v2}, Ljc/g;->a(Ljc/d;)V

    new-instance p5, Lrc/b;

    invoke-direct {p5, p1, p0}, Lrc/b;-><init>(Landroid/content/Context;Ljc/v;)V

    invoke-interface {p3, p5}, Lsc/a;->a(Ljava/lang/Runnable;)V

    sget-object p3, Ljc/n;->a:Ljava/lang/String;

    invoke-static {p1, p2}, Lrc/h;->a(Landroid/content/Context;Lic/b;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p4}, Landroidx/work/impl/WorkDatabase;->h()Lqc/u;

    move-result-object p2

    iget-object p2, p2, Lqc/u;->a:Landroidx/room/z0;

    const-string p3, "workspec"

    filled-new-array {p3}, [Ljava/lang/String;

    move-result-object p3

    new-instance p4, Lpl0/a;

    const/16 p5, 0x1b

    invoke-direct {p4, p5}, Lpl0/a;-><init>(I)V

    invoke-static {p2, p3, p4}, Ldt/b;->l(Landroidx/room/z0;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lec3/l1;

    move-result-object p2

    new-instance p3, Ljc/m;

    const/4 p4, 0x4

    const/4 p5, 0x0

    invoke-direct {p3, p4, p5}, Ls83/i;-><init>(ILq83/d;)V

    new-instance p4, Lec3/a0;

    invoke-direct {p4, p2, p3}, Lec3/a0;-><init>(Lec3/l;Lc93/n;)V

    const/4 p2, -0x1

    const/4 p3, 0x2

    invoke-static {p4, p2, p3}, Lec3/v;->i(Lec3/l;II)Lec3/l;

    move-result-object p2

    invoke-static {p2}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p2

    new-instance p3, Lh/l;

    invoke-direct {p3, p1, p5}, Lh/l;-><init>(Landroid/content/Context;Lq83/d;)V

    new-instance p1, Lec3/j1;

    invoke-direct {p1, p2, p3, v0}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    invoke-static {p1, v1}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    :cond_1
    return-void

    :goto_1
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot initialize WorkManager in direct boot mode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static g(Landroid/content/Context;)Ljc/v;
    .locals 2

    sget-object v0, Ljc/v;->m:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    sget-object v1, Ljc/v;->k:Ljc/v;

    if-eqz v1, :cond_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    sget-object v1, Ljc/v;->l:Ljc/v;

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    if-eqz v1, :cond_1

    :try_start_2
    monitor-exit v0

    return-object v1

    :catchall_1
    move-exception p0

    goto :goto_2

    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v1, "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_1
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p0

    :goto_2
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Lic/f0;
    .locals 5

    iget-object v0, p0, Ljc/v;->b:Lic/b;

    iget-object v0, v0, Lic/b;->m:Lic/y;

    const-string v1, "CancelWorkByName_"

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ljc/v;->d:Lsc/a;

    check-cast v2, Lsc/b;

    iget-object v2, v2, Lsc/b;->a:Landroidx/room/u1;

    const-string v3, "getSerialTaskExecutor(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lk80/d;

    const/16 v4, 0x8

    invoke-direct {v3, v4, p1, p0}, Lk80/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, v1, v2, v3}, Lwb3/f;->I(Lic/y;Ljava/lang/String;Landroidx/room/u1;Lc93/a;)Lic/f0;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/String;Lic/k;Lic/k0;)Lic/e0;
    .locals 6

    sget-object v0, Lic/k;->x:Lic/k;

    if-ne p2, v0, :cond_0

    const-string p2, "workRequest"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Ljc/v;->b:Lic/b;

    iget-object p2, p2, Lic/b;->m:Lic/y;

    const-string v0, "enqueueUniquePeriodic_"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ljc/v;->d:Lsc/a;

    check-cast v1, Lsc/b;

    iget-object v1, v1, Lsc/b;->a:Landroidx/room/u1;

    const-string v2, "getSerialTaskExecutor(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lc41/m;

    const/4 v3, 0x1

    invoke-direct {v2, p0, p1, p3, v3}, Lc41/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {p2, v0, v1, v2}, Lwb3/f;->I(Lic/y;Ljava/lang/String;Landroidx/room/u1;Lc93/a;)Lic/f0;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lic/k;->w:Lic/k;

    if-ne p2, v0, :cond_1

    sget-object p2, Lic/l;->x:Lic/l;

    :goto_0
    move-object v3, p2

    goto :goto_1

    :cond_1
    sget-object p2, Lic/l;->w:Lic/l;

    goto :goto_0

    :goto_1
    new-instance v0, Ljc/o;

    invoke-static {p3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Ljc/o;-><init>(Ljc/v;Ljava/lang/String;Lic/l;Ljava/util/List;I)V

    invoke-virtual {v0}, Ljc/o;->U()Lic/e0;

    move-result-object p1

    return-object p1
.end method

.method public final f(Ljava/util/UUID;)Lic/f0;
    .locals 4

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljc/v;->b:Lic/b;

    iget-object v0, v0, Lic/b;->m:Lic/y;

    iget-object v1, p0, Ljc/v;->d:Lsc/a;

    check-cast v1, Lsc/b;

    iget-object v1, v1, Lsc/b;->a:Landroidx/room/u1;

    const-string v2, "getSerialTaskExecutor(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lqt2/e;

    const/16 v3, 0xc

    invoke-direct {v2, v3, p0, p1}, Lqt2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const-string p1, "CancelWorkById"

    invoke-static {v0, p1, v1, v2}, Lwb3/f;->I(Lic/y;Ljava/lang/String;Landroidx/room/u1;Lc93/a;)Lic/f0;

    move-result-object p1

    return-object p1
.end method

.method public final h()V
    .locals 2

    sget-object v0, Ljc/v;->m:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Ljc/v;->h:Z

    iget-object v1, p0, Ljc/v;->i:Landroid/content/BroadcastReceiver$PendingResult;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    const/4 v1, 0x0

    iput-object v1, p0, Ljc/v;->i:Landroid/content/BroadcastReceiver$PendingResult;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final i()V
    .locals 4

    iget-object v0, p0, Ljc/v;->b:Lic/b;

    iget-object v0, v0, Lic/b;->m:Lic/y;

    const-string v1, "ReschedulingWork"

    new-instance v2, La6/l0;

    const/16 v3, 0x1a

    invoke-direct {v2, p0, v3}, La6/l0;-><init>(Ljava/lang/Object;I)V

    const-string v3, "<this>"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lpf/c;->E()Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {v1}, Lpf/c;->Z(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v2}, La6/l0;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    invoke-static {}, Landroid/os/Trace;->endSection()V

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_2

    invoke-static {}, Landroid/os/Trace;->endSection()V

    :cond_2
    throw v1
.end method
