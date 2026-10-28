.class public final Lio/b;
.super Lio/c;
.source "SourceFile"


# instance fields
.field public final g:Lko/e;

.field public final h:J

.field public final i:J

.field public final j:J

.field public final k:I

.field public final l:I

.field public final m:F

.field public final n:F

.field public final o:Lzr/g0;

.field public final p:Llo/t;

.field public q:F

.field public r:I

.field public s:I

.field public t:J

.field public u:Lun/b;


# direct methods
.method public constructor <init>(Lsn/w0;[ILko/e;JJJLzr/g0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/c;-><init>(Lsn/w0;[I)V

    cmp-long p1, p8, p4

    if-gez p1, :cond_0

    const-string p1, "AdaptiveTrackSelection"

    const-string p2, "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs"

    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move-wide p8, p4

    :cond_0
    iput-object p3, p0, Lio/b;->g:Lko/e;

    const-wide/16 p1, 0x3e8

    mul-long/2addr p4, p1

    iput-wide p4, p0, Lio/b;->h:J

    mul-long/2addr p6, p1

    iput-wide p6, p0, Lio/b;->i:J

    mul-long/2addr p8, p1

    iput-wide p8, p0, Lio/b;->j:J

    const/16 p1, 0x4ff

    iput p1, p0, Lio/b;->k:I

    const/16 p1, 0x2cf

    iput p1, p0, Lio/b;->l:I

    const p1, 0x3f333333    # 0.7f

    iput p1, p0, Lio/b;->m:F

    const/high16 p1, 0x3f400000    # 0.75f

    iput p1, p0, Lio/b;->n:F

    invoke-static {p10}, Lzr/g0;->m(Ljava/util/Collection;)Lzr/g0;

    move-result-object p1

    iput-object p1, p0, Lio/b;->o:Lzr/g0;

    sget-object p1, Llo/t;->a:Llo/t;

    iput-object p1, p0, Lio/b;->p:Llo/t;

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lio/b;->q:F

    const/4 p1, 0x0

    iput p1, p0, Lio/b;->s:I

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lio/b;->t:J

    return-void
.end method

.method public static u(Ljava/util/ArrayList;[J)V
    .locals 7

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    array-length v4, p1

    if-ge v3, v4, :cond_0

    aget-wide v4, p1, v3

    add-long/2addr v0, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzr/d0;

    if-nez v3, :cond_1

    goto :goto_2

    :cond_1
    new-instance v4, Lio/a;

    aget-wide v5, p1, v2

    invoke-direct {v4, v0, v1, v5, v6}, Lio/a;-><init>(JJ)V

    invoke-virtual {v3, v4}, Lzr/a0;->a(Ljava/lang/Object;)V

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public static w(Ljava/util/List;)J
    .locals 7

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, Lzr/q;->i(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lun/b;

    iget-wide v3, p0, Lun/a;->g:J

    cmp-long v0, v3, v1

    if-eqz v0, :cond_1

    iget-wide v5, p0, Lun/a;->h:J

    cmp-long p0, v5, v1

    if-eqz p0, :cond_1

    sub-long/2addr v5, v3

    return-wide v5

    :cond_1
    :goto_0
    return-wide v1
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lio/b;->u:Lun/b;

    return-void
.end method

.method public final b()V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lio/b;->t:J

    const/4 v0, 0x0

    iput-object v0, p0, Lio/b;->u:Lun/b;

    return-void
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lio/b;->r:I

    return v0
.end method

.method public final f(F)V
    .locals 0

    iput p1, p0, Lio/b;->q:F

    return-void
.end method

.method public final g()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final l(JLjava/util/List;)I
    .locals 10

    iget-object v0, p0, Lio/b;->p:Llo/t;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Lio/b;->t:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v2, v4

    if-eqz v4, :cond_1

    sub-long v2, v0, v2

    const-wide/16 v4, 0x3e8

    cmp-long v2, v2, v4

    if-gez v2, :cond_1

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {p3}, Lzr/q;->i(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lun/b;

    iget-object v3, p0, Lio/b;->u:Lun/b;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    return p1

    :cond_1
    :goto_0
    iput-wide v0, p0, Lio/b;->t:J

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    invoke-static {p3}, Lzr/q;->i(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lun/b;

    :goto_1
    iput-object v2, p0, Lio/b;->u:Lun/b;

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    return v3

    :cond_3
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v4, v2, -0x1

    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lun/b;

    iget-wide v4, v4, Lun/a;->g:J

    sub-long/2addr v4, p1

    iget v6, p0, Lio/b;->q:F

    invoke-static {v6, v4, v5}, Llo/y;->s(FJ)J

    move-result-wide v4

    iget-wide v6, p0, Lio/b;->j:J

    cmp-long v4, v4, v6

    if-gez v4, :cond_4

    goto :goto_3

    :cond_4
    invoke-static {p3}, Lio/b;->w(Ljava/util/List;)J

    invoke-virtual {p0, v0, v1}, Lio/b;->v(J)I

    move-result v0

    iget-object v1, p0, Lio/c;->d:[Lrm/c0;

    aget-object v0, v1, v0

    :goto_2
    if-ge v3, v2, :cond_6

    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lun/b;

    iget-object v4, v1, Lun/a;->d:Lrm/c0;

    iget-wide v8, v1, Lun/a;->g:J

    sub-long/2addr v8, p1

    iget v1, p0, Lio/b;->q:F

    invoke-static {v1, v8, v9}, Llo/y;->s(FJ)J

    move-result-wide v8

    cmp-long v1, v8, v6

    if-ltz v1, :cond_5

    iget v1, v4, Lrm/c0;->H:I

    iget v5, v0, Lrm/c0;->H:I

    if-ge v1, v5, :cond_5

    iget v1, v4, Lrm/c0;->R:I

    const/4 v5, -0x1

    if-eq v1, v5, :cond_5

    iget v8, p0, Lio/b;->l:I

    if-gt v1, v8, :cond_5

    iget v4, v4, Lrm/c0;->Q:I

    if-eq v4, v5, :cond_5

    iget v5, p0, Lio/b;->k:I

    if-gt v4, v5, :cond_5

    iget v4, v0, Lrm/c0;->R:I

    if-ge v1, v4, :cond_5

    return v3

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_6
    :goto_3
    return v2
.end method

.method public final o()I
    .locals 1

    iget v0, p0, Lio/b;->s:I

    return v0
.end method

.method public final q(JJJLjava/util/List;[Lun/c;)V
    .locals 10

    move-object/from16 p1, p8

    iget-object p2, p0, Lio/b;->p:Llo/t;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget p2, p0, Lio/b;->r:I

    array-length v2, p1

    const/4 v3, 0x0

    if-ge p2, v2, :cond_0

    aget-object p2, p1, p2

    invoke-interface {p2}, Lun/c;->next()Z

    move-result p2

    if-eqz p2, :cond_0

    iget p2, p0, Lio/b;->r:I

    aget-object p1, p1, p2

    invoke-interface {p1}, Lun/c;->e()J

    move-result-wide v4

    invoke-interface {p1}, Lun/c;->b()J

    move-result-wide p1

    sub-long/2addr v4, p1

    goto :goto_1

    :cond_0
    array-length p2, p1

    move v2, v3

    :goto_0
    if-ge v2, p2, :cond_2

    aget-object v4, p1, v2

    invoke-interface {v4}, Lun/c;->next()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Lun/c;->e()J

    move-result-wide p1

    invoke-interface {v4}, Lun/c;->b()J

    move-result-wide v4

    sub-long v4, p1, v4

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-static/range {p7 .. p7}, Lio/b;->w(Ljava/util/List;)J

    move-result-wide v4

    :goto_1
    iget p1, p0, Lio/b;->s:I

    if-nez p1, :cond_3

    const/4 p1, 0x1

    iput p1, p0, Lio/b;->s:I

    invoke-virtual {p0, v0, v1}, Lio/b;->v(J)I

    move-result p1

    iput p1, p0, Lio/b;->r:I

    return-void

    :cond_3
    iget p2, p0, Lio/b;->r:I

    invoke-interface/range {p7 .. p7}, Ljava/util/List;->isEmpty()Z

    move-result v2

    iget-object v6, p0, Lio/c;->d:[Lrm/c0;

    const/4 v7, -0x1

    if-eqz v2, :cond_5

    :cond_4
    move v3, v7

    goto :goto_3

    :cond_5
    invoke-static/range {p7 .. p7}, Lzr/q;->i(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lun/b;

    iget-object v2, v2, Lun/a;->d:Lrm/c0;

    :goto_2
    iget v8, p0, Lio/c;->b:I

    if-ge v3, v8, :cond_4

    aget-object v8, v6, v3

    if-ne v8, v2, :cond_6

    goto :goto_3

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :goto_3
    if-eq v3, v7, :cond_7

    invoke-static/range {p7 .. p7}, Lzr/q;->i(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lun/b;

    iget p1, p1, Lun/a;->e:I

    move p2, v3

    :cond_7
    invoke-virtual {p0, v0, v1}, Lio/b;->v(J)I

    move-result v2

    invoke-virtual {p0, p2, v0, v1}, Lio/c;->s(IJ)Z

    move-result v0

    if-nez v0, :cond_b

    aget-object v0, v6, p2

    aget-object v1, v6, v2

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, p5, v6

    iget-wide v8, p0, Lio/b;->h:J

    if-nez v3, :cond_8

    goto :goto_5

    :cond_8
    cmp-long v3, v4, v6

    if-eqz v3, :cond_9

    sub-long v3, p5, v4

    goto :goto_4

    :cond_9
    move-wide v3, p5

    :goto_4
    long-to-float v3, v3

    iget v4, p0, Lio/b;->n:F

    mul-float/2addr v3, v4

    float-to-long v3, v3

    invoke-static {v3, v4, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    :goto_5
    iget v1, v1, Lrm/c0;->H:I

    iget v0, v0, Lrm/c0;->H:I

    if-le v1, v0, :cond_a

    cmp-long v3, p3, v8

    if-gez v3, :cond_a

    goto :goto_6

    :cond_a
    if-ge v1, v0, :cond_b

    iget-wide v0, p0, Lio/b;->i:J

    cmp-long v0, p3, v0

    if-ltz v0, :cond_b

    :goto_6
    move v2, p2

    :cond_b
    if-ne v2, p2, :cond_c

    goto :goto_7

    :cond_c
    const/4 p1, 0x3

    :goto_7
    iput p1, p0, Lio/b;->s:I

    iput v2, p0, Lio/b;->r:I

    return-void
.end method

.method public final v(J)I
    .locals 8

    iget-object v0, p0, Lio/b;->g:Lko/e;

    check-cast v0, Lko/q;

    monitor-enter v0

    :try_start_0
    iget-wide v1, v0, Lko/q;->l:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    long-to-float v0, v1

    iget v1, p0, Lio/b;->m:F

    mul-float/2addr v0, v1

    float-to-long v0, v0

    iget-object v2, p0, Lio/b;->g:Lko/e;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    long-to-float v0, v0

    iget v1, p0, Lio/b;->q:F

    div-float/2addr v0, v1

    float-to-long v0, v0

    iget-object v2, p0, Lio/b;->o:Lzr/g0;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v2, 0x1

    move v3, v2

    :goto_0
    iget-object v4, p0, Lio/b;->o:Lzr/g0;

    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    move-result v4

    sub-int/2addr v4, v2

    if-ge v3, v4, :cond_1

    iget-object v4, p0, Lio/b;->o:Lzr/g0;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/a;

    iget-wide v4, v4, Lio/a;->a:J

    cmp-long v4, v4, v0

    if-gez v4, :cond_1

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lio/b;->o:Lzr/g0;

    add-int/lit8 v4, v3, -0x1

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/a;

    iget-object v4, p0, Lio/b;->o:Lzr/g0;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/a;

    iget-wide v4, v2, Lio/a;->a:J

    sub-long/2addr v0, v4

    long-to-float v0, v0

    iget-wide v6, v3, Lio/a;->a:J

    sub-long/2addr v6, v4

    long-to-float v1, v6

    div-float/2addr v0, v1

    iget-wide v1, v2, Lio/a;->b:J

    iget-wide v3, v3, Lio/a;->b:J

    sub-long/2addr v3, v1

    long-to-float v3, v3

    mul-float/2addr v0, v3

    float-to-long v3, v0

    add-long v0, v1, v3

    :goto_1
    const/4 v2, 0x0

    move v3, v2

    :goto_2
    iget v4, p0, Lio/c;->b:I

    if-ge v2, v4, :cond_5

    const-wide/high16 v4, -0x8000000000000000L

    cmp-long v4, p1, v4

    if-eqz v4, :cond_2

    invoke-virtual {p0, v2, p1, p2}, Lio/c;->s(IJ)Z

    move-result v4

    if-nez v4, :cond_4

    :cond_2
    iget-object v3, p0, Lio/c;->d:[Lrm/c0;

    aget-object v3, v3, v2

    iget v3, v3, Lrm/c0;->H:I

    int-to-long v3, v3

    cmp-long v3, v3, v0

    if-gtz v3, :cond_3

    return v2

    :cond_3
    move v3, v2

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    return v3

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
