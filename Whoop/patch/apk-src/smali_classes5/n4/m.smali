.class public final Ln4/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ln4/p;

.field public final b:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ln4/p;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Ln4/m;->a:Ln4/p;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ln4/m;->b:Ljava/util/ArrayList;

    iput-object p1, p0, Ln4/m;->a:Ln4/p;

    return-void
.end method

.method public static c(Ln4/g;J)J
    .locals 9

    iget-object v0, p0, Ln4/g;->d:Ln4/p;

    iget-object v1, p0, Ln4/g;->k:Ljava/util/ArrayList;

    instance-of v2, v0, Ln4/k;

    if-eqz v2, :cond_0

    return-wide p1

    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    move-wide v4, p1

    :goto_0
    if-ge v3, v2, :cond_3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ln4/e;

    instance-of v7, v6, Ln4/g;

    if-eqz v7, :cond_2

    check-cast v6, Ln4/g;

    iget-object v7, v6, Ln4/g;->d:Ln4/p;

    if-ne v7, v0, :cond_1

    goto :goto_1

    :cond_1
    iget v7, v6, Ln4/g;->f:I

    int-to-long v7, v7

    add-long/2addr v7, p1

    invoke-static {v6, v7, v8}, Ln4/m;->c(Ln4/g;J)J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    iget-object v1, v0, Ln4/p;->i:Ln4/g;

    iget-object v2, v0, Ln4/p;->h:Ln4/g;

    if-ne p0, v1, :cond_4

    invoke-virtual {v0}, Ln4/p;->j()J

    move-result-wide v0

    sub-long/2addr p1, v0

    invoke-static {v2, p1, p2}, Ln4/m;->c(Ln4/g;J)J

    move-result-wide v0

    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    iget p0, v2, Ln4/g;->f:I

    int-to-long v2, p0

    sub-long/2addr p1, v2

    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p0

    return-wide p0

    :cond_4
    return-wide v4
.end method

.method public static d(Ln4/g;J)J
    .locals 9

    iget-object v0, p0, Ln4/g;->d:Ln4/p;

    iget-object v1, p0, Ln4/g;->k:Ljava/util/ArrayList;

    instance-of v2, v0, Ln4/k;

    if-eqz v2, :cond_0

    return-wide p1

    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    move-wide v4, p1

    :goto_0
    if-ge v3, v2, :cond_3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ln4/e;

    instance-of v7, v6, Ln4/g;

    if-eqz v7, :cond_2

    check-cast v6, Ln4/g;

    iget-object v7, v6, Ln4/g;->d:Ln4/p;

    if-ne v7, v0, :cond_1

    goto :goto_1

    :cond_1
    iget v7, v6, Ln4/g;->f:I

    int-to-long v7, v7

    add-long/2addr v7, p1

    invoke-static {v6, v7, v8}, Ln4/m;->d(Ln4/g;J)J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v4

    :cond_2
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    iget-object v1, v0, Ln4/p;->h:Ln4/g;

    iget-object v2, v0, Ln4/p;->i:Ln4/g;

    if-ne p0, v1, :cond_4

    invoke-virtual {v0}, Ln4/p;->j()J

    move-result-wide v0

    add-long/2addr v0, p1

    invoke-static {v2, v0, v1}, Ln4/m;->d(Ln4/g;J)J

    move-result-wide p0

    invoke-static {v4, v5, p0, p1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p0

    iget p2, v2, Ln4/g;->f:I

    int-to-long v2, p2

    sub-long/2addr v0, v2

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p0

    return-wide p0

    :cond_4
    return-wide v4
.end method


# virtual methods
.method public final a(Ln4/p;)V
    .locals 1

    iget-object v0, p0, Ln4/m;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final b(Lm4/f;I)J
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p0

    move/from16 v2, p2

    iget-object v3, v1, Ln4/m;->a:Ln4/p;

    instance-of v4, v3, Ln4/d;

    const-wide/16 v5, 0x0

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Ln4/d;

    iget v4, v4, Ln4/p;->f:I

    if-eq v4, v2, :cond_2

    goto :goto_0

    :cond_0
    if-nez v2, :cond_1

    instance-of v4, v3, Ln4/l;

    if-nez v4, :cond_2

    goto :goto_0

    :cond_1
    instance-of v4, v3, Ln4/n;

    if-nez v4, :cond_2

    :goto_0
    return-wide v5

    :cond_2
    if-nez v2, :cond_3

    iget-object v4, v0, Lm4/e;->d:Ln4/l;

    :goto_1
    iget-object v4, v4, Ln4/p;->h:Ln4/g;

    goto :goto_2

    :cond_3
    iget-object v4, v0, Lm4/e;->e:Ln4/n;

    goto :goto_1

    :goto_2
    if-nez v2, :cond_4

    iget-object v0, v0, Lm4/e;->d:Ln4/l;

    :goto_3
    iget-object v0, v0, Ln4/p;->i:Ln4/g;

    goto :goto_4

    :cond_4
    iget-object v0, v0, Lm4/e;->e:Ln4/n;

    goto :goto_3

    :goto_4
    iget-object v7, v3, Ln4/p;->h:Ln4/g;

    iget-object v8, v3, Ln4/p;->h:Ln4/g;

    iget-object v9, v3, Ln4/p;->i:Ln4/g;

    iget-object v7, v7, Ln4/g;->l:Ljava/util/ArrayList;

    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    iget-object v7, v9, Ln4/g;->l:Ljava/util/ArrayList;

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v3}, Ln4/p;->j()J

    move-result-wide v10

    if-eqz v4, :cond_a

    if-eqz v0, :cond_a

    invoke-static {v8, v5, v6}, Ln4/m;->d(Ln4/g;J)J

    move-result-wide v12

    invoke-static {v9, v5, v6}, Ln4/m;->c(Ln4/g;J)J

    move-result-wide v14

    sub-long/2addr v12, v10

    iget v0, v9, Ln4/g;->f:I

    neg-int v4, v0

    int-to-long v5, v4

    cmp-long v4, v12, v5

    if-ltz v4, :cond_5

    int-to-long v4, v0

    add-long/2addr v12, v4

    :cond_5
    neg-long v4, v14

    sub-long/2addr v4, v10

    iget v0, v8, Ln4/g;->f:I

    int-to-long v6, v0

    sub-long/2addr v4, v6

    cmp-long v0, v4, v6

    if-ltz v0, :cond_6

    sub-long/2addr v4, v6

    :cond_6
    iget-object v0, v3, Ln4/p;->b:Lm4/e;

    if-nez v2, :cond_7

    iget v0, v0, Lm4/e;->e0:F

    goto :goto_5

    :cond_7
    const/4 v3, 0x1

    if-ne v2, v3, :cond_8

    iget v0, v0, Lm4/e;->f0:F

    goto :goto_5

    :cond_8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 v0, -0x40800000    # -1.0f

    :goto_5
    const/4 v2, 0x0

    cmpl-float v2, v0, v2

    const/high16 v3, 0x3f800000    # 1.0f

    if-lez v2, :cond_9

    long-to-float v2, v4

    div-float/2addr v2, v0

    long-to-float v4, v12

    sub-float v5, v3, v0

    div-float/2addr v4, v5

    add-float/2addr v4, v2

    float-to-long v5, v4

    goto :goto_6

    :cond_9
    const-wide/16 v5, 0x0

    :goto_6
    long-to-float v2, v5

    mul-float v4, v2, v0

    const/high16 v5, 0x3f000000    # 0.5f

    add-float/2addr v4, v5

    float-to-long v6, v4

    invoke-static {v3, v0, v2, v5}, Lb9/y;->a(FFFF)F

    move-result v0

    float-to-long v2, v0

    add-long/2addr v6, v10

    add-long/2addr v6, v2

    iget v0, v8, Ln4/g;->f:I

    int-to-long v2, v0

    add-long/2addr v2, v6

    iget v0, v9, Ln4/g;->f:I

    int-to-long v4, v0

    sub-long/2addr v2, v4

    return-wide v2

    :cond_a
    if-eqz v4, :cond_b

    iget v0, v8, Ln4/g;->f:I

    int-to-long v2, v0

    invoke-static {v8, v2, v3}, Ln4/m;->d(Ln4/g;J)J

    move-result-wide v2

    iget v0, v8, Ln4/g;->f:I

    int-to-long v4, v0

    add-long/2addr v4, v10

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    return-wide v2

    :cond_b
    if-eqz v0, :cond_c

    iget v0, v9, Ln4/g;->f:I

    int-to-long v2, v0

    invoke-static {v9, v2, v3}, Ln4/m;->c(Ln4/g;J)J

    move-result-wide v2

    iget v0, v9, Ln4/g;->f:I

    neg-int v0, v0

    int-to-long v4, v0

    add-long/2addr v4, v10

    neg-long v2, v2

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    return-wide v2

    :cond_c
    iget v0, v8, Ln4/g;->f:I

    int-to-long v4, v0

    invoke-virtual {v3}, Ln4/p;->j()J

    move-result-wide v2

    add-long/2addr v2, v4

    iget v0, v9, Ln4/g;->f:I

    int-to-long v4, v0

    sub-long/2addr v2, v4

    return-wide v2
.end method
