.class public abstract Lrm/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrm/c1;


# instance fields
.field public E:Lsm/f;

.field public F:I

.field public G:Lsn/r0;

.field public H:[Lrm/c0;

.field public I:J

.field public J:J

.field public K:Z

.field public L:Z

.field public final w:I

.field public final x:Lxl/a;

.field public y:Lrm/g1;

.field public z:I


# direct methods
.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lrm/d;->w:I

    new-instance p1, Lxl/a;

    const/16 v0, 0x1d

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lxl/a;-><init>(IZ)V

    iput-object p1, p0, Lrm/d;->x:Lxl/a;

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lrm/d;->J:J

    return-void
.end method

.method public static d(III)I
    .locals 0

    or-int/2addr p0, p1

    or-int/2addr p0, p2

    or-int/lit16 p0, p0, 0x80

    return p0
.end method


# virtual methods
.method public a(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final e(Ljava/lang/Exception;Lrm/c0;ZI)Lcom/google/android/exoplayer2/ExoPlaybackException;
    .locals 10

    const/4 v0, 0x4

    if-eqz p2, :cond_0

    iget-boolean v1, p0, Lrm/d;->L:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lrm/d;->L:Z

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0, p2}, Lrm/d;->x(Lrm/c0;)I

    move-result v2
    :try_end_0
    .catch Lcom/google/android/exoplayer2/ExoPlaybackException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    and-int/lit8 v2, v2, 0x7

    iput-boolean v1, p0, Lrm/d;->L:Z

    goto :goto_0

    :catchall_0
    move-exception v0

    iput-boolean v1, p0, Lrm/d;->L:Z

    throw v0

    :catch_0
    iput-boolean v1, p0, Lrm/d;->L:Z

    :cond_0
    move v2, v0

    :goto_0
    invoke-virtual {p0}, Lrm/d;->h()Ljava/lang/String;

    move-result-object v5

    iget v6, p0, Lrm/d;->z:I

    new-instance v1, Lcom/google/android/exoplayer2/ExoPlaybackException;

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

    invoke-direct/range {v1 .. v9}, Lcom/google/android/exoplayer2/ExoPlaybackException;-><init>(ILjava/lang/Throwable;ILjava/lang/String;ILrm/c0;IZ)V

    return-object v1
.end method

.method public g()Llo/l;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract h()Ljava/lang/String;
.end method

.method public final i()Z
    .locals 4

    iget-wide v0, p0, Lrm/d;->J:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public abstract j()Z
.end method

.method public abstract k()Z
.end method

.method public abstract l()V
.end method

.method public m(ZZ)V
    .locals 0

    return-void
.end method

.method public abstract n(JZ)V
.end method

.method public o()V
    .locals 0

    return-void
.end method

.method public p()V
    .locals 0

    return-void
.end method

.method public q()V
    .locals 0

    return-void
.end method

.method public abstract r([Lrm/c0;JJ)V
.end method

.method public final s(Lxl/a;Lum/c;I)I
    .locals 4

    iget-object v0, p0, Lrm/d;->G:Lsn/r0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v0, p1, p2, p3}, Lsn/r0;->e(Lxl/a;Lum/c;I)I

    move-result p3

    const/4 v0, -0x4

    if-ne p3, v0, :cond_2

    const/4 p1, 0x4

    invoke-virtual {p2, p1}, La9/a;->f(I)Z

    move-result p1

    if-eqz p1, :cond_1

    const-wide/high16 p1, -0x8000000000000000L

    iput-wide p1, p0, Lrm/d;->J:J

    iget-boolean p1, p0, Lrm/d;->K:Z

    if-eqz p1, :cond_0

    return v0

    :cond_0
    const/4 p1, -0x3

    return p1

    :cond_1
    iget-wide v0, p2, Lum/c;->F:J

    iget-wide v2, p0, Lrm/d;->I:J

    add-long/2addr v0, v2

    iput-wide v0, p2, Lum/c;->F:J

    iget-wide p1, p0, Lrm/d;->J:J

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Lrm/d;->J:J

    return p3

    :cond_2
    const/4 p2, -0x5

    if-ne p3, p2, :cond_3

    iget-object p2, p1, Lxl/a;->y:Ljava/lang/Object;

    check-cast p2, Lrm/c0;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-wide v0, p2, Lrm/c0;->P:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v2, v0, v2

    if-eqz v2, :cond_3

    invoke-virtual {p2}, Lrm/c0;->a()Lrm/b0;

    move-result-object p2

    iget-wide v2, p0, Lrm/d;->I:J

    add-long/2addr v0, v2

    iput-wide v0, p2, Lrm/b0;->o:J

    new-instance v0, Lrm/c0;

    invoke-direct {v0, p2}, Lrm/c0;-><init>(Lrm/b0;)V

    iput-object v0, p1, Lxl/a;->y:Ljava/lang/Object;

    :cond_3
    return p3
.end method

.method public abstract t(JJ)V
.end method

.method public final u([Lrm/c0;Lsn/r0;JJ)V
    .locals 6

    iget-boolean v0, p0, Lrm/d;->K:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Llo/a;->i(Z)V

    iput-object p2, p0, Lrm/d;->G:Lsn/r0;

    iget-wide v0, p0, Lrm/d;->J:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long p2, v0, v2

    if-nez p2, :cond_0

    iput-wide p3, p0, Lrm/d;->J:J

    :cond_0
    iput-object p1, p0, Lrm/d;->H:[Lrm/c0;

    iput-wide p5, p0, Lrm/d;->I:J

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p3

    move-wide v4, p5

    invoke-virtual/range {v0 .. v5}, Lrm/d;->r([Lrm/c0;JJ)V

    return-void
.end method

.method public final v()V
    .locals 1

    iget v0, p0, Lrm/d;->F:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Llo/a;->i(Z)V

    iget-object v0, p0, Lrm/d;->x:Lxl/a;

    invoke-virtual {v0}, Lxl/a;->j()V

    invoke-virtual {p0}, Lrm/d;->o()V

    return-void
.end method

.method public w(FF)V
    .locals 0

    return-void
.end method

.method public abstract x(Lrm/c0;)I
.end method

.method public y()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
