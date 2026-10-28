.class public final synthetic Lcom/whoop/data/repositories/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/g;
.implements Lgt/e;
.implements Lio/sentry/f7;
.implements Lio/sentry/e4;
.implements Lio/sentry/util/e;
.implements Lio/sentry/util/network/c;
.implements Lcq/d;
.implements Lp73/b;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/whoop/data/repositories/c;->w:I

    iput-object p3, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 2
    iput p2, p0, Lcom/whoop/data/repositories/c;->w:I

    iput-object p1, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Lxl/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/okhttp/d;

    check-cast p1, Lud3/x0;

    invoke-static {v0, p1}, Lio/sentry/okhttp/d;->a(Lio/sentry/okhttp/d;Lud3/x0;)Lxl/a;

    move-result-object p1

    return-object p1
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lcom/whoop/data/repositories/c;->w:I

    sparse-switch v0, :sswitch_data_0

    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, Lvd1/b;

    invoke-static {v0, p1}, Lvd1/d;->n(Lvd1/b;Ljava/lang/Object;)V

    return-void

    :sswitch_0
    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, Lvd1/b;

    invoke-static {v0, p1}, Lvd1/d;->h(Lvd1/b;Ljava/lang/Object;)V

    return-void

    :sswitch_1
    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, Lrd1/d;

    check-cast p1, Ldk0/k;

    invoke-static {v0, p1}, Lrd1/d;->B(Lrd1/d;Ljava/lang/Object;)V

    return-void

    :sswitch_2
    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/service/rearchitect/a;

    invoke-static {v0, p1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->a(Lcom/whoop/service/rearchitect/a;Ljava/lang/Object;)V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x15 -> :sswitch_2
        0x18 -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lcom/whoop/data/repositories/c;->w:I

    sparse-switch v0, :sswitch_data_0

    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, Lvb1/a;

    invoke-static {v0, p1}, Lvd1/d;->m(Lvb1/a;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :sswitch_0
    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, Lqc1/a;

    invoke-static {v0, p1}, Ltd1/d;->H(Lqc1/a;Ljava/lang/Object;)Ltd1/e;

    move-result-object p1

    return-object p1

    :sswitch_1
    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, Lqc1/a;

    invoke-static {v0, p1}, Lqd1/a;->m(Lqc1/a;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :sswitch_2
    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, Lqc1/a;

    invoke-static {v0, p1}, Lqd1/a;->l(Lqc1/a;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :sswitch_3
    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, Lnm1/g;

    invoke-static {v0, p1}, Lod1/u;->a(Lnm1/g;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :sswitch_4
    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, Lnm1/g;

    invoke-static {v0, p1}, Lod1/u;->d(Lnm1/g;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :sswitch_5
    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, Lkg2/e;

    invoke-static {v0, p1}, Lkk0/a;->b(Lkg2/e;Ljava/lang/Object;)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :sswitch_6
    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/repositories/f;

    invoke-static {v0, p1}, Lcom/whoop/data/repositories/UserStrapsRepository;->h(Lcom/whoop/data/repositories/f;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :sswitch_7
    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, La11/g;

    invoke-static {v0, p1}, Lcom/whoop/data/repositories/UserStrapsRepository;->c(La11/g;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :sswitch_8
    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, La11/g;

    invoke-static {v0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->f(La11/g;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_8
        0x1 -> :sswitch_7
        0x2 -> :sswitch_6
        0x10 -> :sswitch_5
        0x13 -> :sswitch_4
        0x14 -> :sswitch_3
        0x16 -> :sswitch_2
        0x17 -> :sswitch_1
        0x1a -> :sswitch_0
    .end sparse-switch
.end method

.method public c(Lio/sentry/d7;)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/z6;

    iget-object v1, v0, Lio/sentry/z6;->q:Lio/sentry/l;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, Lio/sentry/l;->a(Lio/sentry/d7;)V

    :cond_0
    iget-object p1, v0, Lio/sentry/z6;->f:Lio/sentry/y6;

    iget-object v1, v0, Lio/sentry/z6;->r:Lio/sentry/n7;

    iget-object v2, v1, Lio/sentry/n7;->g:Ljava/lang/Long;

    if-eqz v2, :cond_3

    iget-boolean p1, v1, Lio/sentry/n7;->f:Z

    if-eqz p1, :cond_2

    iget-object p1, v0, Lio/sentry/z6;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->listIterator()Ljava/util/ListIterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/d7;

    iget-boolean v2, v1, Lio/sentry/d7;->g:Z

    if-nez v2, :cond_1

    iget-object v1, v1, Lio/sentry/d7;->b:Lio/sentry/u4;

    if-nez v1, :cond_1

    return-void

    :cond_2
    invoke-virtual {v0}, Lio/sentry/z6;->r()V

    return-void

    :cond_3
    iget-boolean v1, p1, Lio/sentry/y6;->a:Z

    if-eqz v1, :cond_4

    iget-object p1, p1, Lio/sentry/y6;->b:Lio/sentry/i7;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lio/sentry/z6;->v(Lio/sentry/i7;Lio/sentry/u4;)V

    :cond_4
    return-void
.end method

.method public d(Lw73/e;)V
    .locals 6

    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, Lec3/l;

    sget-object v1, Lbc3/q0;->b:Lbc3/l2;

    sget-object v2, Lq83/k;->w:Lq83/k;

    invoke-virtual {v1, v2}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object v1

    sget-object v2, Lbc3/d0;->y:Lbc3/d0;

    new-instance v3, La6/v;

    const/4 v4, 0x0

    const/16 v5, 0xe

    invoke-direct {v3, v0, p1, v4, v5}, La6/v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    sget-object v0, Lbc3/e1;->w:Lbc3/e1;

    invoke-static {v0, v1, v2, v3}, Lbc3/f0;->y(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;)Lbc3/c2;

    move-result-object v0

    new-instance v1, Ljc3/a;

    invoke-direct {v1, v0}, Ljc3/a;-><init>(Lbc3/c2;)V

    new-instance v0, Lq73/a;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln73/b;

    sget-object v2, Lq73/c;->w:Lq73/c;

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lq73/a;->dispose()V

    return-void

    :cond_0
    invoke-virtual {p1, v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ln73/b;->dispose()V

    :cond_1
    return-void

    :cond_2
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eq v2, v1, :cond_0

    goto :goto_0
.end method

.method public e(F)F
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, Le4/s;

    iget-object v0, v0, Le4/s;->k:Ly3/c;

    invoke-interface {v0}, Ly3/c;->getDensity()F

    move-result v0

    mul-float/2addr v0, p1

    return v0
.end method

.method public f(Laa3/i1;)Ljava/lang/Object;
    .locals 0

    iget-object p1, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    return-object p1
.end method

.method public h(Lio/sentry/b1;)V
    .locals 5

    iget v0, p0, Lcom/whoop/data/repositories/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, p1}, Lrr2/m;->l(Lkotlin/jvm/functions/Function1;Lio/sentry/b1;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/g0;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/sentry/b1;->m()Lio/sentry/n1;

    move-result-object p1

    iput-object p1, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/fragment/app/m0;

    const-string v1, "it"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-interface {p1, v1}, Lio/sentry/b1;->H(Ljava/lang/String;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/internal/gestures/g;

    new-instance v1, Lbu/d;

    const/4 v2, 0x4

    invoke-direct {v1, v2, v0, p1}, Lbu/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {p1, v1}, Lio/sentry/b1;->N(Lio/sentry/b4;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-interface {p1}, Lio/sentry/b1;->q()Lio/sentry/b7;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lio/sentry/b7;->c()Ljava/util/Date;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_1
    return-void

    :pswitch_4
    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/core/u0;

    iget-object v0, v0, Lio/sentry/android/core/u0;->w:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_2

    invoke-interface {p1}, Lio/sentry/b1;->q()Lio/sentry/b7;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lio/sentry/b7;->c()Ljava/util/Date;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lio/sentry/b7;->c()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    :cond_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public j()Ljava/lang/Object;
    .locals 6

    iget v0, p0, Lcom/whoop/data/repositories/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/v0;

    const-string v1, "androidx.core.app.FrameMetricsAggregator"

    invoke-static {v0, v1}, Lqt/e;->h(Lio/sentry/v0;Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/cache/f;

    iget-object v1, v0, Lio/sentry/cache/f;->a:Lio/sentry/q6;

    const-string v2, ".scope-cache"

    invoke-static {v1, v2}, Lio/sentry/cache/a;->b(Lio/sentry/q6;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Cache dir is not set, cannot store in scope cache"

    invoke-interface {v0, v1, v3, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lio/sentry/cache/tape/b;

    invoke-direct {v0}, Lio/sentry/cache/tape/b;-><init>()V

    goto :goto_1

    :cond_0
    new-instance v3, Ljava/io/File;

    const-string v4, "breadcrumbs.json"

    invoke-direct {v3, v2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {v1}, Lio/sentry/q6;->getMaxBreadcrumbs()I

    move-result v2

    invoke-static {v3}, Lio/sentry/cache/tape/i;->m(Ljava/io/File;)Ljava/io/RandomAccessFile;

    move-result-object v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v5, Lio/sentry/cache/tape/i;

    invoke-direct {v5, v3, v4, v2}, Lio/sentry/cache/tape/i;-><init>(Ljava/io/File;Ljava/io/RandomAccessFile;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    :try_start_2
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V

    throw v2
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :try_start_3
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    invoke-virtual {v1}, Lio/sentry/q6;->getMaxBreadcrumbs()I

    move-result v2

    invoke-static {v3}, Lio/sentry/cache/tape/i;->m(Ljava/io/File;)Ljava/io/RandomAccessFile;

    move-result-object v4
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :try_start_4
    new-instance v5, Lio/sentry/cache/tape/i;

    invoke-direct {v5, v3, v4, v2}, Lio/sentry/cache/tape/i;-><init>(Ljava/io/File;Ljava/io/RandomAccessFile;I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_0
    new-instance v1, Laj/d;

    invoke-direct {v1, v0}, Laj/d;-><init>(Ljava/lang/Object;)V

    new-instance v0, Lio/sentry/cache/tape/d;

    invoke-direct {v0, v5, v1}, Lio/sentry/cache/tape/d;-><init>(Lio/sentry/cache/tape/i;Lio/sentry/cache/tape/e;)V

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_5
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V

    throw v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    :catch_1
    move-exception v0

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v3, "Failed to create breadcrumbs queue"

    invoke-interface {v1, v2, v3, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Lio/sentry/cache/tape/b;

    invoke-direct {v0}, Lio/sentry/cache/tape/b;-><init>()V

    :goto_1
    return-object v0

    :pswitch_1
    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/cache/c;

    iget-object v0, v0, Lio/sentry/cache/c;->w:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getSerializer()Lio/sentry/j1;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public q(Lcom/google/android/gms/tasks/Task;)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/repositories/c;->x:Ljava/lang/Object;

    check-cast v0, Lxg3/q;

    invoke-static {v0, p1}, Lm92/j;->f(Lxg3/q;Lcom/google/android/gms/tasks/Task;)V

    return-void
.end method
