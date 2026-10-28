.class public final Lp1/c2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc3/c0;
.implements Lp1/z1;


# static fields
.field public static final z:Lp1/f;


# instance fields
.field public final w:Lq83/j;

.field public final x:Lp1/c2;

.field public volatile y:Lq83/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp1/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lp1/c2;->z:Lp1/f;

    return-void
.end method

.method public constructor <init>(Lq83/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/c2;->w:Lq83/j;

    iput-object p0, p0, Lp1/c2;->x:Lp1/c2;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    return-void
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Lp1/c2;->x:Lp1/c2;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lp1/c2;->y:Lq83/j;

    if-nez v1, :cond_0

    sget-object v1, Lp1/c2;->z:Lp1/f;

    iput-object v1, p0, Lp1/c2;->y:Lq83/j;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    new-instance v2, Lp1/k0;

    invoke-direct {v2}, Lp1/k0;-><init>()V

    invoke-static {v1, v2}, Lbc3/f0;->i(Lq83/j;Ljava/util/concurrent/CancellationException;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public final c()V
    .locals 0

    invoke-virtual {p0}, Lp1/c2;->b()V

    return-void
.end method

.method public final d()V
    .locals 0

    invoke-virtual {p0}, Lp1/c2;->b()V

    return-void
.end method

.method public final getCoroutineContext()Lq83/j;
    .locals 5

    iget-object v0, p0, Lp1/c2;->y:Lq83/j;

    if-eqz v0, :cond_0

    sget-object v1, Lp1/c2;->z:Lp1/f;

    if-ne v0, v1, :cond_4

    :cond_0
    iget-object v0, p0, Lp1/c2;->w:Lq83/j;

    sget-object v1, La2/c;->x:Lqt/e;

    invoke-interface {v0, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    check-cast v0, La2/c;

    if-eqz v0, :cond_1

    new-instance v1, Lp1/b2;

    invoke-direct {v1, v0, p0}, Lp1/b2;-><init>(La2/c;Lp1/c2;)V

    goto :goto_0

    :cond_1
    sget-object v1, Lq83/k;->w:Lq83/k;

    :goto_0
    iget-object v0, p0, Lp1/c2;->x:Lp1/c2;

    monitor-enter v0

    :try_start_0
    iget-object v2, p0, Lp1/c2;->y:Lq83/j;

    if-nez v2, :cond_2

    iget-object v2, p0, Lp1/c2;->w:Lq83/j;

    sget-object v3, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v2, v3}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v3

    check-cast v3, Lbc3/k1;

    new-instance v4, Lbc3/l1;

    invoke-direct {v4, v3}, Lbc3/l1;-><init>(Lbc3/k1;)V

    invoke-interface {v2, v4}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v2

    sget-object v3, Lq83/k;->w:Lq83/k;

    invoke-interface {v2, v3}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v2

    invoke-interface {v2, v1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v1

    goto :goto_1

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_2
    sget-object v3, Lp1/c2;->z:Lp1/f;

    if-ne v2, v3, :cond_3

    iget-object v2, p0, Lp1/c2;->w:Lq83/j;

    sget-object v3, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v2, v3}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v3

    check-cast v3, Lbc3/k1;

    new-instance v4, Lbc3/l1;

    invoke-direct {v4, v3}, Lbc3/l1;-><init>(Lbc3/k1;)V

    new-instance v3, Lp1/k0;

    invoke-direct {v3}, Lp1/k0;-><init>()V

    invoke-virtual {v4, v3}, Lbc3/t1;->p(Ljava/util/concurrent/CancellationException;)V

    invoke-interface {v2, v4}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v2

    sget-object v3, Lq83/k;->w:Lq83/k;

    invoke-interface {v2, v3}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v2

    invoke-interface {v2, v1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v1

    goto :goto_1

    :cond_3
    move-object v1, v2

    :goto_1
    iput-object v1, p0, Lp1/c2;->y:Lq83/j;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    move-object v0, v1

    :cond_4
    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0

    :goto_2
    monitor-exit v0

    throw v1
.end method
