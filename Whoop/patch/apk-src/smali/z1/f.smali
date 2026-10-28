.class public abstract Lz1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lz1/j;

.field public b:J

.field public c:Z

.field public d:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(JLz1/j;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Lz1/f;->a:Lz1/j;

    iput-wide p1, p0, Lz1/f;->b:J

    sget-object p3, Lz1/l;->a:Lz1/k;

    const-wide/16 v0, 0x0

    cmp-long p3, p1, v0

    if-eqz p3, :cond_3

    invoke-virtual {p0}, Lz1/f;->d()Lz1/j;

    move-result-object p3

    iget-wide v2, p3, Lz1/j;->y:J

    iget-object v4, p3, Lz1/j;->z:[J

    if-eqz v4, :cond_0

    const/4 p1, 0x0

    aget-wide p1, v4, p1

    goto :goto_1

    :cond_0
    iget-wide v4, p3, Lz1/j;->x:J

    cmp-long v6, v4, v0

    if-eqz v6, :cond_1

    invoke-static {v4, v5}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result p1

    :goto_0
    int-to-long p1, p1

    add-long/2addr p1, v2

    goto :goto_1

    :cond_1
    iget-wide v4, p3, Lz1/j;->w:J

    cmp-long p3, v4, v0

    if-eqz p3, :cond_2

    const/16 p1, 0x40

    int-to-long p1, p1

    add-long/2addr v2, p1

    invoke-static {v4, v5}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result p1

    goto :goto_0

    :cond_2
    :goto_1
    sget-object p3, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter p3

    :try_start_0
    sget-object v0, Lz1/l;->f:Lio/sentry/android/core/j1;

    invoke-virtual {v0, p1, p2}, Lio/sentry/android/core/j1;->a(J)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p3

    goto :goto_2

    :catchall_0
    move-exception p1

    monitor-exit p3

    throw p1

    :cond_3
    const/4 p1, -0x1

    :goto_2
    iput p1, p0, Lz1/f;->d:I

    return-void
.end method

.method public static q(Lz1/f;)V
    .locals 1

    sget-object v0, Lz1/l;->b:Ls/m2;

    invoke-virtual {v0, p0}, Ls/m2;->s(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    sget-object v0, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lz1/f;->b()V

    invoke-virtual {p0}, Lz1/f;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public b()V
    .locals 3

    sget-object v0, Lz1/l;->d:Lz1/j;

    invoke-virtual {p0}, Lz1/f;->g()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lz1/j;->c(J)Lz1/j;

    move-result-object v0

    sput-object v0, Lz1/l;->d:Lz1/j;

    return-void
.end method

.method public abstract c()V
.end method

.method public d()Lz1/j;
    .locals 1

    iget-object v0, p0, Lz1/f;->a:Lz1/j;

    return-object v0
.end method

.method public abstract e()Lkotlin/jvm/functions/Function1;
.end method

.method public abstract f()Z
.end method

.method public g()J
    .locals 2

    iget-wide v0, p0, Lz1/f;->b:J

    return-wide v0
.end method

.method public h()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract i()Lkotlin/jvm/functions/Function1;
.end method

.method public final j()Lz1/f;
    .locals 2

    sget-object v0, Lz1/l;->b:Ls/m2;

    invoke-virtual {v0}, Ls/m2;->f()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz1/f;

    invoke-virtual {v0, p0}, Ls/m2;->s(Ljava/lang/Object;)V

    return-object v1
.end method

.method public abstract k()V
.end method

.method public abstract l()V
.end method

.method public abstract m()V
.end method

.method public abstract n(Lz1/z;)V
.end method

.method public final o()V
    .locals 1

    iget v0, p0, Lz1/f;->d:I

    if-ltz v0, :cond_0

    invoke-static {v0}, Lz1/l;->u(I)V

    const/4 v0, -0x1

    iput v0, p0, Lz1/f;->d:I

    :cond_0
    return-void
.end method

.method public p()V
    .locals 0

    invoke-virtual {p0}, Lz1/f;->o()V

    return-void
.end method

.method public r(Lz1/j;)V
    .locals 0

    iput-object p1, p0, Lz1/f;->a:Lz1/j;

    return-void
.end method

.method public s(J)V
    .locals 0

    iput-wide p1, p0, Lz1/f;->b:J

    return-void
.end method

.method public t(I)V
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Updating write count is not supported for this snapshot"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public abstract u(Lkotlin/jvm/functions/Function1;)Lz1/f;
.end method
