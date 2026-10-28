.class public final Ld30/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;

.field public h:Ljava/lang/Object;

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lab/g0;Lu8/d;Lro/i;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    .line 3
    iput-object p1, p0, Ld30/h;->b:Ljava/lang/Object;

    .line 4
    iput-object p2, p0, Ld30/h;->c:Ljava/lang/Object;

    .line 5
    iput-object p3, p0, Ld30/h;->j:Ljava/lang/Object;

    .line 6
    iput-object p4, p0, Ld30/h;->i:Ljava/lang/Object;

    .line 7
    sget p2, Lx8/t;->a:I

    .line 8
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p2

    if-eqz p2, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    .line 10
    :goto_0
    new-instance p3, Landroid/os/Handler;

    const/4 p4, 0x0

    invoke-direct {p3, p2, p4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 11
    iput-object p3, p0, Ld30/h;->d:Ljava/lang/Object;

    .line 12
    sget p2, Lx8/t;->a:I

    const/16 v0, 0x17

    const/4 v1, 0x0

    if-lt p2, v0, :cond_1

    new-instance p2, Ld9/c;

    invoke-direct {p2, p0, v1}, Ld9/c;-><init>(Ljava/lang/Object;I)V

    goto :goto_1

    :cond_1
    move-object p2, p4

    :goto_1
    iput-object p2, p0, Ld30/h;->e:Ljava/lang/Object;

    .line 13
    new-instance p2, Ld9/e;

    invoke-direct {p2, p0, v1}, Ld9/e;-><init>(Ljava/lang/Object;I)V

    iput-object p2, p0, Ld30/h;->f:Ljava/lang/Object;

    .line 14
    sget-object p2, Ld9/b;->c:Ld9/b;

    .line 15
    sget-object p2, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v0, "Amazon"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "Xiaomi"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_2

    :cond_2
    move-object p2, p4

    goto :goto_3

    .line 16
    :cond_3
    :goto_2
    const-string p2, "external_surround_sound_enabled"

    invoke-static {p2}, Landroid/provider/Settings$Global;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    :goto_3
    if-eqz p2, :cond_4

    .line 17
    new-instance p4, Ld9/d;

    .line 18
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-direct {p4, p0, p3, p1, p2}, Ld9/d;-><init>(Ld30/h;Landroid/os/Handler;Landroid/content/ContentResolver;Landroid/net/Uri;)V

    .line 19
    :cond_4
    iput-object p4, p0, Ld30/h;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ln53/e;Lv00/c0;Lec3/r1;Lec3/h2;Ln53/e;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ln53/e;)V
    .locals 2

    .line 20
    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    .line 21
    sget-object v0, Lhc3/o;->a:Lbc3/w1;

    .line 22
    const-string v1, "paymentMethods"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "paymentMethodMetadata"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "selection"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "editing"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "canEdit"

    invoke-static {p5, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "defaultPaymentMethodId"

    invoke-static {p10, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "dispatcher"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Ld30/h;->b:Ljava/lang/Object;

    .line 25
    iput-object p2, p0, Ld30/h;->c:Ljava/lang/Object;

    .line 26
    check-cast p6, Lkotlin/jvm/internal/i;

    iput-object p6, p0, Ld30/h;->d:Ljava/lang/Object;

    .line 27
    iput-object p7, p0, Ld30/h;->e:Ljava/lang/Object;

    .line 28
    iput-object p8, p0, Ld30/h;->f:Ljava/lang/Object;

    .line 29
    iput-object p9, p0, Ld30/h;->g:Ljava/lang/Object;

    .line 30
    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object p6

    invoke-virtual {v0, p6}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object p6

    invoke-static {p6}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p6

    iput-object p6, p0, Ld30/h;->h:Ljava/lang/Object;

    .line 31
    new-instance p7, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p8, 0x0

    invoke-direct {p7, p8}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p7, p0, Ld30/h;->i:Ljava/lang/Object;

    .line 32
    new-instance p7, Ld30/b;

    invoke-direct {p7, p0}, Ld30/b;-><init>(Ld30/h;)V

    invoke-static {p1, p10, p7}, Lbi/g;->p(Lec3/f2;Lec3/f2;Lc93/m;)Ln53/e;

    move-result-object p1

    .line 33
    iget-object p2, p2, Lv00/c0;->w:Ly00/c8;

    .line 34
    invoke-interface {p2}, Ly00/c8;->q0()Z

    move-result p2

    iput-boolean p2, p0, Ld30/h;->a:Z

    .line 35
    new-instance p2, Ld30/c;

    invoke-direct {p2, p8}, Ld30/c;-><init>(I)V

    .line 36
    invoke-static {p1, p3, p4, p5, p2}, Lbi/g;->q(Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;Lc93/n;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Ld30/h;->j:Ljava/lang/Object;

    .line 37
    new-instance p1, Ld30/e;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2, p8}, Ld30/e;-><init>(Ld30/h;Lq83/d;I)V

    const/4 p3, 0x3

    invoke-static {p6, p2, p2, p1, p3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    .line 38
    new-instance p1, Ld30/e;

    const/4 p4, 0x1

    invoke-direct {p1, p0, p2, p4}, Ld30/e;-><init>(Ld30/h;Lq83/d;I)V

    invoke-static {p6, p2, p2, p1, p3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method


# virtual methods
.method public a(Lds/p;)V
    .locals 1

    instance-of v0, p1, Ld30/y;

    if-eqz v0, :cond_1

    check-cast p1, Ld30/y;

    iget-object p1, p1, Ld30/y;->b:Lh20/l;

    iget-object v0, p0, Ld30/h;->e:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Ld30/h;->i:Ljava/lang/Object;

    check-cast p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Ld30/h;->g:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/functions/Function1;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void

    :cond_1
    instance-of v0, p1, Ld30/a0;

    if-eqz v0, :cond_2

    iget-object v0, p0, Ld30/h;->f:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    check-cast p1, Ld30/a0;

    iget-object p1, p1, Ld30/a0;->b:Lh20/l;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    sget-object v0, Ld30/z;->b:Ld30/z;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Ld30/h;->d:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/i;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public b(Ld9/b;)V
    .locals 5

    iget-boolean v0, p0, Ld30/h;->a:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Ld30/h;->h:Ljava/lang/Object;

    check-cast v0, Ld9/b;

    invoke-virtual {p1, v0}, Ld9/b;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    iput-object p1, p0, Ld30/h;->h:Ljava/lang/Object;

    iget-object v0, p0, Ld30/h;->c:Ljava/lang/Object;

    check-cast v0, Lab/g0;

    iget-object v0, v0, Lab/g0;->x:Ljava/lang/Object;

    check-cast v0, Ld9/x;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    iget-object v2, v0, Ld9/x;->f0:Landroid/os/Looper;

    if-eq v2, v1, :cond_2

    if-nez v2, :cond_0

    const-string p1, "null"

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    :goto_0
    if-nez v1, :cond_1

    const-string v0, "null"

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    :goto_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Current looper ("

    const-string v3, ") is not the playback looper ("

    const-string v4, ")"

    invoke-static {v2, v0, v3, p1, v4}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v0, Ld9/x;->w:Ld9/b;

    if-eqz v1, :cond_3

    invoke-virtual {p1, v1}, Ld9/b;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iput-object p1, v0, Ld9/x;->w:Ld9/b;

    iget-object p1, v0, Ld9/x;->r:Lro/i;

    if-eqz p1, :cond_3

    iget-object p1, p1, Lro/i;->x:Ljava/lang/Object;

    check-cast p1, Ld9/a0;

    iget-object v0, p1, Lb9/f;->w:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object p1, p1, Lb9/f;->Q:Lo9/q;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz p1, :cond_3

    iget-object v0, p1, Lo9/q;->d:Ljava/lang/Object;

    monitor-enter v0

    :try_start_1
    iget-object p1, p1, Lo9/q;->g:Lo9/j;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :catchall_1
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    :cond_3
    return-void
.end method

.method public c(Landroid/media/AudioDeviceInfo;)V
    .locals 2

    iget-object v0, p0, Ld30/h;->i:Ljava/lang/Object;

    check-cast v0, Lro/i;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lro/i;->x:Ljava/lang/Object;

    check-cast v0, Landroid/media/AudioDeviceInfo;

    :goto_0
    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    if-eqz p1, :cond_2

    new-instance v1, Lro/i;

    const/16 v0, 0x18

    invoke-direct {v1, p1, v0}, Lro/i;-><init>(Ljava/lang/Object;I)V

    :cond_2
    iput-object v1, p0, Ld30/h;->i:Ljava/lang/Object;

    iget-object p1, p0, Ld30/h;->b:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    iget-object v0, p0, Ld30/h;->j:Ljava/lang/Object;

    check-cast v0, Lu8/d;

    invoke-static {p1, v0, v1}, Ld9/b;->c(Landroid/content/Context;Lu8/d;Lro/i;)Ld9/b;

    move-result-object p1

    invoke-virtual {p0, p1}, Ld30/h;->b(Ld9/b;)V

    return-void
.end method
