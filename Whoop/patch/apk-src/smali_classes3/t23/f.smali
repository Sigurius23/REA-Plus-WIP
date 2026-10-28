.class public final Lt23/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lhc3/d;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public final c:Lt23/c4;

.field public final d:J

.field public final e:Ll83/p;

.field public final f:Ljava/util/concurrent/atomic/AtomicReference;

.field public final g:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(Lhc3/d;Ljava/util/concurrent/ConcurrentHashMap$KeySetView;)V
    .locals 1

    sget-object v0, Lt23/c4;->x:Lt23/c4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt23/f;->a:Lhc3/d;

    iput-object p2, p0, Lt23/f;->b:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    iput-object v0, p0, Lt23/f;->c:Lt23/c4;

    const-wide/16 p1, 0x1388

    iput-wide p1, p0, Lt23/f;->d:J

    const-string p1, "ActiveStateGate"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lt23/f;->e:Ll83/p;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lt23/f;->f:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lt23/f;->g:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method

.method public static final a(Lt23/f;Lt23/c0;Ls83/c;)Ljava/lang/Object;
    .locals 9

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p2, Lt23/a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lt23/a;

    iget v1, v0, Lt23/a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lt23/a;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lt23/a;

    invoke-direct {v0, p0, p2}, Lt23/a;-><init>(Lt23/f;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lt23/a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lt23/a;->E:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-wide p0, v0, Lt23/a;->x:J

    iget-object v0, v0, Lt23/a;->w:Lt23/f;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-wide v5, p0

    move-object p0, v0

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-wide v7, p0, Lt23/f;->d:J

    new-instance p2, Ls40/c0;

    const/4 v2, 0x5

    invoke-direct {p2, p0, p1, v3, v2}, Ls40/c0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p0, v0, Lt23/a;->w:Lt23/f;

    iput-wide v5, v0, Lt23/a;->x:J

    iput v4, v0, Lt23/a;->E:I

    invoke-static {v7, v8, p2, v0}, Lbc3/k2;->d(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ll83/a0;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sub-long/2addr v0, v5

    const-string p1, "ms"

    if-eqz p2, :cond_4

    invoke-virtual {p0}, Lt23/f;->d()Lb23/k;

    move-result-object p0

    iget-object p2, p0, Lb23/k;->c:Lb23/e;

    iget-object v2, p0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-interface {p2, v4, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_5

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    const-string p2, "[observeConnection] Connected in "

    invoke-static {v0, v1, p2, p1}, Lr80/c;->l(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, v4, v2, p1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lt23/f;->d()Lb23/k;

    move-result-object p0

    iget-object p2, p0, Lb23/k;->c:Lb23/e;

    iget-object v2, p0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->E:Lb23/g;

    invoke-interface {p2, v4, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_5

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    const-string p2, "[observeConnection] Timeout after "

    invoke-static {v0, v1, p2, p1}, Lr80/c;->l(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, v4, v2, p1, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final b(Lt23/f;Lt23/c0;Ls83/c;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of p1, p2, Lt23/e;

    if-eqz p1, :cond_0

    move-object p1, p2

    check-cast p1, Lt23/e;

    iget v0, p1, Lt23/e;->y:I

    const/high16 v1, -0x80000000

    and-int v2, v0, v1

    if-eqz v2, :cond_0

    sub-int/2addr v0, v1

    iput v0, p1, Lt23/e;->y:I

    goto :goto_0

    :cond_0
    new-instance p1, Lt23/e;

    invoke-direct {p1, p0, p2}, Lt23/e;-><init>(Lt23/f;Ls83/c;)V

    :goto_0
    iget-object p2, p1, Lt23/e;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget p1, p1, Lt23/e;->y:I

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    const/4 p0, 0x1

    if-ne p1, p0, :cond_1

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lio/getstream/video/android/core/CallJoinInterceptionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    throw v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    throw v0

    :catch_1
    throw v0

    :catch_2
    move-exception p0

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    invoke-virtual {p0}, Lt23/f;->d()Lb23/k;

    move-result-object p0

    iget-object v1, p0, Lb23/k;->c:Lb23/e;

    iget-object v2, p0, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object p0, p0, Lb23/k;->b:Lb23/j;

    const-string v1, "[invokeInterceptor] start at "

    invoke-static {p1, p2, v1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, v3, v2, p1, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0
.end method


# virtual methods
.method public final c()V
    .locals 3

    iget-object v0, p0, Lt23/f;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbc3/k1;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-interface {v1, v2}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v0, p0, Lt23/f;->g:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbc3/k1;

    if-eqz v1, :cond_1

    invoke-interface {v1, v2}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final d()Lb23/k;
    .locals 1

    iget-object v0, p0, Lt23/f;->e:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method
