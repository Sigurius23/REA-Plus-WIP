.class public abstract Lb9/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb9/e1;


# instance fields
.field public E:I

.field public F:Lc9/n;

.field public G:Lx8/p;

.field public H:I

.field public I:Ll9/z0;

.field public J:[Lu8/p;

.field public K:J

.field public L:J

.field public M:J

.field public N:Z

.field public O:Z

.field public P:Lu8/o0;

.field public Q:Lo9/q;

.field public final w:Ljava/lang/Object;

.field public final x:I

.field public final y:Lqg3/d;

.field public z:Lb9/i1;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lb9/f;->w:Ljava/lang/Object;

    iput p1, p0, Lb9/f;->x:I

    new-instance p1, Lqg3/d;

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lqg3/d;-><init>(IC)V

    iput-object p1, p0, Lb9/f;->y:Lqg3/d;

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lb9/f;->M:J

    sget-object p1, Lu8/o0;->a:Lu8/l0;

    iput-object p1, p0, Lb9/f;->P:Lu8/o0;

    return-void
.end method

.method public static f(IIII)I
    .locals 0

    or-int/2addr p0, p1

    or-int/2addr p0, p2

    or-int/lit16 p0, p0, 0x80

    or-int/2addr p0, p3

    return p0
.end method

.method public static m(IZ)Z
    .locals 1

    and-int/lit8 p0, p0, 0x7

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public abstract A(Lu8/p;)I
.end method

.method public B()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public a(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final g(Ljava/lang/Exception;Lu8/p;ZI)Landroidx/media3/exoplayer/ExoPlaybackException;
    .locals 10

    const/4 v0, 0x4

    if-eqz p2, :cond_0

    iget-boolean v1, p0, Lb9/f;->O:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lb9/f;->O:Z

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0, p2}, Lb9/f;->A(Lu8/p;)I

    move-result v2
    :try_end_0
    .catch Landroidx/media3/exoplayer/ExoPlaybackException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    and-int/lit8 v2, v2, 0x7

    iput-boolean v1, p0, Lb9/f;->O:Z

    goto :goto_0

    :catchall_0
    move-exception v0

    iput-boolean v1, p0, Lb9/f;->O:Z

    throw v0

    :catch_0
    iput-boolean v1, p0, Lb9/f;->O:Z

    :cond_0
    move v2, v0

    :goto_0
    invoke-virtual {p0}, Lb9/f;->j()Ljava/lang/String;

    move-result-object v5

    iget v6, p0, Lb9/f;->E:I

    new-instance v1, Landroidx/media3/exoplayer/ExoPlaybackException;

    if-nez p2, :cond_1

    move v8, v0

    goto :goto_1

    :cond_1
    move v8, v2

    :goto_1
    const/4 v2, 0x1

    move-object v3, p1

    move-object v7, p2

    move v9, p3

    move v4, p4

    invoke-direct/range {v1 .. v9}, Landroidx/media3/exoplayer/ExoPlaybackException;-><init>(ILjava/lang/Exception;ILjava/lang/String;ILu8/p;IZ)V

    return-object v1
.end method

.method public h()V
    .locals 0

    return-void
.end method

.method public i()Lb9/p0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract j()Ljava/lang/String;
.end method

.method public final k()Z
    .locals 4

    iget-wide v0, p0, Lb9/f;->M:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public abstract l()Z
.end method

.method public abstract n()Z
.end method

.method public abstract o()V
.end method

.method public p(ZZ)V
    .locals 0

    return-void
.end method

.method public abstract q(JZ)V
.end method

.method public r()V
    .locals 0

    return-void
.end method

.method public s()V
    .locals 0

    return-void
.end method

.method public t()V
    .locals 0

    return-void
.end method

.method public u()V
    .locals 0

    return-void
.end method

.method public v([Lu8/p;JJLl9/c0;)V
    .locals 0

    return-void
.end method

.method public final w(Lqg3/d;La9/e;I)I
    .locals 4

    iget-object v0, p0, Lb9/f;->I:Ll9/z0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, p1, p2, p3}, Ll9/z0;->l(Lqg3/d;La9/e;I)I

    move-result p3

    const/4 v0, -0x4

    if-ne p3, v0, :cond_2

    const/4 p1, 0x4

    invoke-virtual {p2, p1}, La9/a;->f(I)Z

    move-result p1

    if-eqz p1, :cond_1

    const-wide/high16 p1, -0x8000000000000000L

    iput-wide p1, p0, Lb9/f;->M:J

    iget-boolean p1, p0, Lb9/f;->N:Z

    if-eqz p1, :cond_0

    return v0

    :cond_0
    const/4 p1, -0x3

    return p1

    :cond_1
    iget-wide v0, p2, La9/e;->G:J

    iget-wide v2, p0, Lb9/f;->K:J

    add-long/2addr v0, v2

    iput-wide v0, p2, La9/e;->G:J

    iget-wide p1, p0, Lb9/f;->M:J

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Lb9/f;->M:J

    return p3

    :cond_2
    const/4 p2, -0x5

    if-ne p3, p2, :cond_3

    iget-object p2, p1, Lqg3/d;->y:Ljava/lang/Object;

    check-cast p2, Lu8/p;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v0, p2, Lu8/p;->s:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v2, v0, v2

    if-eqz v2, :cond_3

    invoke-virtual {p2}, Lu8/p;->a()Lu8/o;

    move-result-object p2

    iget-wide v2, p0, Lb9/f;->K:J

    add-long/2addr v0, v2

    iput-wide v0, p2, Lu8/o;->r:J

    new-instance v0, Lu8/p;

    invoke-direct {v0, p2}, Lu8/p;-><init>(Lu8/o;)V

    iput-object v0, p1, Lqg3/d;->y:Ljava/lang/Object;

    :cond_3
    return p3
.end method

.method public abstract x(JJ)V
.end method

.method public final y([Lu8/p;Ll9/z0;JJLl9/c0;)V
    .locals 7

    iget-boolean v0, p0, Lb9/f;->N:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lva3/g;->i(Z)V

    iput-object p2, p0, Lb9/f;->I:Ll9/z0;

    iget-wide v0, p0, Lb9/f;->M:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long p2, v0, v2

    if-nez p2, :cond_0

    iput-wide p3, p0, Lb9/f;->M:J

    :cond_0
    iput-object p1, p0, Lb9/f;->J:[Lu8/p;

    iput-wide p5, p0, Lb9/f;->K:J

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p3

    move-wide v4, p5

    move-object v6, p7

    invoke-virtual/range {v0 .. v6}, Lb9/f;->v([Lu8/p;JJLl9/c0;)V

    return-void
.end method

.method public z(FF)V
    .locals 0

    return-void
.end method
