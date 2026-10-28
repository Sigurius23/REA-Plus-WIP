.class public final Lko/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lko/e;
.implements Lko/j0;


# static fields
.field public static final n:Lzr/w0;

.field public static final o:Lzr/w0;

.field public static final p:Lzr/w0;

.field public static final q:Lzr/w0;

.field public static final r:Lzr/w0;

.field public static final s:Lzr/w0;

.field public static t:Lko/q;


# instance fields
.field public final a:Lzr/b1;

.field public final b:Lko/d;

.field public final c:Lko/h0;

.field public final d:Llo/t;

.field public final e:Z

.field public f:I

.field public g:J

.field public h:J

.field public i:I

.field public j:J

.field public k:J

.field public l:J

.field public m:J


# direct methods
.method static constructor <clinit>()V
    .locals 9

    const-wide/32 v0, 0x5265c0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-wide/32 v1, 0x325aa0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-wide/32 v2, 0x1e8480

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-wide/32 v3, 0x13d620

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-wide/32 v4, 0xb98c0

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lzr/g0;->q(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lzr/w0;

    move-result-object v0

    sput-object v0, Lko/q;->n:Lzr/w0;

    const-wide/32 v4, 0x19f0a0

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-wide/32 v4, 0xc8320

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const-wide/32 v5, 0x6ddd0

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const-wide/32 v6, 0x2bf20

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-wide/32 v7, 0x1fbd0

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-static {v0, v4, v5, v6, v7}, Lzr/g0;->q(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lzr/w0;

    move-result-object v5

    sput-object v5, Lko/q;->o:Lzr/w0;

    const-wide/32 v5, 0x231860

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const-wide/32 v6, 0xf4240

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    const-wide/32 v7, 0x8b290

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    invoke-static {v5, v3, v6, v4, v7}, Lzr/g0;->q(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lzr/w0;

    move-result-object v3

    sput-object v3, Lko/q;->p:Lzr/w0;

    const-wide/32 v3, 0x33e140

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-wide/32 v4, 0x155cc0

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const-wide/32 v7, 0x975e0

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-static {v3, v2, v4, v6, v5}, Lzr/g0;->q(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lzr/w0;

    move-result-object v2

    sput-object v2, Lko/q;->q:Lzr/w0;

    const-wide/32 v2, 0x7270e0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-wide/32 v3, 0x4f5880

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-wide/32 v4, 0x387520

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const-wide/32 v5, 0x1b7740

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const-wide/32 v6, 0x10c8e0

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-static {v2, v3, v4, v5, v6}, Lzr/g0;->q(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lzr/w0;

    move-result-object v2

    sput-object v2, Lko/q;->r:Lzr/w0;

    const-wide/32 v2, 0x1cfde0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-wide/32 v3, 0x16e360

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-wide/32 v4, 0x124f80

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-static {v1, v2, v0, v3, v4}, Lzr/g0;->q(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lzr/w0;

    move-result-object v0

    sput-object v0, Lko/q;->s:Lzr/w0;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/Map;ILlo/t;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p2}, Lzr/b1;->a(Ljava/util/Map;)Lzr/b1;

    move-result-object p2

    iput-object p2, p0, Lko/q;->a:Lzr/b1;

    new-instance p2, Lko/d;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Lko/d;-><init>(I)V

    iput-object p2, p0, Lko/q;->b:Lko/d;

    new-instance p2, Lko/h0;

    invoke-direct {p2, p3}, Lko/h0;-><init>(I)V

    iput-object p2, p0, Lko/q;->c:Lko/h0;

    iput-object p4, p0, Lko/q;->d:Llo/t;

    iput-boolean p5, p0, Lko/q;->e:Z

    if-eqz p1, :cond_3

    const-class p2, Llo/r;

    monitor-enter p2

    :try_start_0
    sget-object p3, Llo/r;->E:Llo/r;

    if-nez p3, :cond_0

    new-instance p3, Llo/r;

    invoke-direct {p3, p1}, Llo/r;-><init>(Landroid/content/Context;)V

    sput-object p3, Llo/r;->E:Llo/r;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    sget-object p1, Llo/r;->E:Llo/r;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p2

    iget-object p3, p1, Llo/r;->w:Ljava/lang/Object;

    monitor-enter p3

    :try_start_1
    iget p2, p1, Llo/r;->x:I

    monitor-exit p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iput p2, p0, Lko/q;->i:I

    invoke-virtual {p0, p2}, Lko/q;->a(I)J

    move-result-wide p2

    iput-wide p2, p0, Lko/q;->l:J

    new-instance p2, Lko/p;

    invoke-direct {p2, p0}, Lko/p;-><init>(Lko/q;)V

    iget-object p3, p1, Llo/r;->z:Ljava/lang/Object;

    check-cast p3, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_1
    :goto_1
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_2

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/lang/ref/WeakReference;

    invoke-virtual {p5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p3, p5}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance p4, Ljava/lang/ref/WeakReference;

    invoke-direct {p4, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p3, p4}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    iget-object p3, p1, Llo/r;->y:Ljava/lang/Object;

    check-cast p3, Landroid/os/Handler;

    new-instance p4, Lio/sentry/android/core/r0;

    const/16 p5, 0x12

    invoke-direct {p4, p5, p1, p2}, Lio/sentry/android/core/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p3, p4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_1
    move-exception p1

    :try_start_2
    monitor-exit p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    :goto_2
    :try_start_3
    monitor-exit p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1

    :cond_3
    const/4 p1, 0x0

    iput p1, p0, Lko/q;->i:I

    invoke-virtual {p0, p1}, Lko/q;->a(I)J

    move-result-wide p1

    iput-wide p1, p0, Lko/q;->l:J

    return-void
.end method


# virtual methods
.method public final a(I)J
    .locals 2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v0, p0, Lko/q;->a:Lzr/b1;

    invoke-virtual {v0, p1}, Lzr/b1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lzr/b1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    :cond_0
    if-nez p1, :cond_1

    const-wide/32 v0, 0xf4240

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public final b(IJJ)V
    .locals 9

    if-nez p1, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-nez v0, :cond_0

    iget-wide v0, p0, Lko/q;->m:J

    cmp-long v0, p4, v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    iput-wide p4, p0, Lko/q;->m:J

    iget-object v0, p0, Lko/q;->b:Lko/d;

    iget-object v0, v0, Lko/d;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lko/c;

    iget-boolean v1, v3, Lko/c;->c:Z

    if-nez v1, :cond_1

    iget-object v1, v3, Lko/c;->a:Landroid/os/Handler;

    new-instance v2, Lio/sentry/c7;

    move v4, p1

    move-wide v5, p2

    move-wide v7, p4

    invoke-direct/range {v2 .. v8}, Lio/sentry/c7;-><init>(Lko/c;IJJ)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    :cond_1
    move v4, p1

    move-wide v5, p2

    move-wide v7, p4

    :goto_1
    move p1, v4

    move-wide p2, v5

    move-wide p4, v7

    goto :goto_0

    :cond_2
    :goto_2
    return-void
.end method
