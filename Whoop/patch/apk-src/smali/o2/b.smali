.class public final Lo2/b;
.super Lo2/b0;
.source "SourceFile"


# instance fields
.field public b:[F

.field public final c:Ljava/util/ArrayList;

.field public d:Z

.field public e:J

.field public f:Ljava/util/List;

.field public g:Z

.field public h:Li2/j;

.field public i:Lkotlin/jvm/functions/Function1;

.field public final j:La3/m1;

.field public k:Ljava/lang/String;

.field public l:F

.field public m:F

.field public n:F

.field public o:F

.field public p:F

.field public q:F

.field public r:F

.field public s:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo2/b;->c:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo2/b;->d:Z

    sget-wide v1, Li2/x;->n:J

    iput-wide v1, p0, Lo2/b;->e:J

    sget v1, Lo2/f0;->a:I

    sget-object v1, Lm83/y;->w:Lm83/y;

    iput-object v1, p0, Lo2/b;->f:Ljava/util/List;

    iput-boolean v0, p0, Lo2/b;->g:Z

    new-instance v1, La3/m1;

    const/16 v2, 0x18

    invoke-direct {v1, p0, v2}, La3/m1;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Lo2/b;->j:La3/m1;

    const-string v1, ""

    iput-object v1, p0, Lo2/b;->k:Ljava/lang/String;

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, p0, Lo2/b;->o:F

    iput v1, p0, Lo2/b;->p:F

    iput-boolean v0, p0, Lo2/b;->s:Z

    return-void
.end method


# virtual methods
.method public final a(Lk2/e;)V
    .locals 23

    move-object/from16 v1, p0

    iget-boolean v0, v1, Lo2/b;->s:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iget-object v0, v1, Lo2/b;->b:[F

    if-nez v0, :cond_0

    invoke-static {}, Li2/l0;->a()[F

    move-result-object v0

    iput-object v0, v1, Lo2/b;->b:[F

    goto :goto_0

    :cond_0
    invoke-static {v0}, Li2/l0;->d([F)V

    :goto_0
    iget v3, v1, Lo2/b;->q:F

    iget v4, v1, Lo2/b;->m:F

    add-float/2addr v3, v4

    iget v4, v1, Lo2/b;->r:F

    iget v5, v1, Lo2/b;->n:F

    add-float/2addr v4, v5

    invoke-static {v0, v3, v4}, Li2/l0;->g([FFF)V

    iget v3, v1, Lo2/b;->l:F

    array-length v4, v0

    const/16 v5, 0x10

    if-ge v4, v5, :cond_1

    goto :goto_1

    :cond_1
    float-to-double v3, v3

    const-wide v5, 0x3f91df46a2529d39L    # 0.017453292519943295

    mul-double/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->sin(D)D

    move-result-wide v5

    double-to-float v5, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    double-to-float v3, v3

    const/4 v4, 0x0

    aget v6, v0, v4

    const/4 v7, 0x4

    aget v8, v0, v7

    mul-float v9, v3, v6

    mul-float v10, v5, v8

    add-float/2addr v10, v9

    neg-float v9, v5

    mul-float/2addr v6, v9

    mul-float/2addr v8, v3

    add-float/2addr v8, v6

    const/4 v6, 0x1

    aget v11, v0, v6

    const/4 v12, 0x5

    aget v13, v0, v12

    mul-float v14, v3, v11

    mul-float v15, v5, v13

    add-float/2addr v15, v14

    mul-float/2addr v11, v9

    mul-float/2addr v13, v3

    add-float/2addr v13, v11

    const/4 v11, 0x2

    aget v14, v0, v11

    const/16 v16, 0x6

    aget v17, v0, v16

    mul-float v18, v3, v14

    mul-float v19, v5, v17

    add-float v19, v19, v18

    mul-float/2addr v14, v9

    mul-float v17, v17, v3

    add-float v17, v17, v14

    const/4 v14, 0x3

    aget v18, v0, v14

    const/16 v20, 0x7

    aget v21, v0, v20

    mul-float v22, v3, v18

    mul-float v5, v5, v21

    add-float v5, v5, v22

    mul-float v9, v9, v18

    mul-float v3, v3, v21

    add-float/2addr v3, v9

    aput v10, v0, v4

    aput v15, v0, v6

    aput v19, v0, v11

    aput v5, v0, v14

    aput v8, v0, v7

    aput v13, v0, v12

    aput v17, v0, v16

    aput v3, v0, v20

    :goto_1
    iget v3, v1, Lo2/b;->o:F

    iget v4, v1, Lo2/b;->p:F

    invoke-static {v0, v3, v4}, Li2/l0;->e([FFF)V

    iget v3, v1, Lo2/b;->m:F

    neg-float v3, v3

    iget v4, v1, Lo2/b;->n:F

    neg-float v4, v4

    invoke-static {v0, v3, v4}, Li2/l0;->g([FFF)V

    iput-boolean v2, v1, Lo2/b;->s:Z

    :cond_2
    iget-boolean v0, v1, Lo2/b;->g:Z

    if-eqz v0, :cond_5

    iget-object v0, v1, Lo2/b;->f:Ljava/util/List;

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, v1, Lo2/b;->h:Li2/j;

    if-nez v0, :cond_3

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v0

    iput-object v0, v1, Lo2/b;->h:Li2/j;

    :cond_3
    iget-object v3, v1, Lo2/b;->f:Ljava/util/List;

    invoke-static {v3, v0}, Lo2/a;->d(Ljava/util/List;Li2/s0;)V

    :cond_4
    iput-boolean v2, v1, Lo2/b;->g:Z

    :cond_5
    invoke-interface/range {p1 .. p1}, Lk2/e;->t0()La3/p;

    move-result-object v3

    invoke-virtual {v3}, La3/p;->A()J

    move-result-wide v4

    invoke-virtual {v3}, La3/p;->w()Li2/v;

    move-result-object v0

    invoke-interface {v0}, Li2/v;->q()V

    :try_start_0
    iget-object v0, v3, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Laj/d;

    iget-object v6, v1, Lo2/b;->b:[F

    if-eqz v6, :cond_6

    iget-object v7, v0, Laj/d;->w:Ljava/lang/Object;

    check-cast v7, La3/p;

    invoke-virtual {v7}, La3/p;->w()Li2/v;

    move-result-object v7

    invoke-interface {v7, v6}, Li2/v;->s([F)V

    :cond_6
    iget-object v6, v1, Lo2/b;->h:Li2/j;

    iget-object v7, v1, Lo2/b;->f:Ljava/util/List;

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_7

    if-eqz v6, :cond_7

    const/4 v7, 0x1

    invoke-virtual {v0, v6, v7}, Laj/d;->b(Li2/s0;I)V

    goto :goto_2

    :catchall_0
    move-exception v0

    goto :goto_4

    :cond_7
    :goto_2
    iget-object v0, v1, Lo2/b;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    :goto_3
    if-ge v2, v6, :cond_8

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lo2/b0;

    move-object/from16 v8, p1

    invoke-virtual {v7, v8}, Lo2/b0;->a(Lk2/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_8
    invoke-static {v3, v4, v5}, Ld;->z(La3/p;J)V

    return-void

    :goto_4
    invoke-static {v3, v4, v5}, Ld;->z(La3/p;J)V

    throw v0
.end method

.method public final b()Lkotlin/jvm/functions/Function1;
    .locals 1

    iget-object v0, p0, Lo2/b;->i:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final d(La3/m1;)V
    .locals 0

    iput-object p1, p0, Lo2/b;->i:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public final e(ILo2/b0;)V
    .locals 2

    iget-object v0, p0, Lo2/b;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    invoke-virtual {v0, p1, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-virtual {p0, p2}, Lo2/b;->g(Lo2/b0;)V

    iget-object p1, p0, Lo2/b;->j:La3/m1;

    invoke-virtual {p2, p1}, Lo2/b0;->d(La3/m1;)V

    invoke-virtual {p0}, Lo2/b0;->c()V

    return-void
.end method

.method public final f(J)V
    .locals 4

    iget-boolean v0, p0, Lo2/b;->d:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x10

    cmp-long v2, p1, v0

    if-eqz v2, :cond_3

    iget-wide v2, p0, Lo2/b;->e:J

    cmp-long v0, v2, v0

    if-nez v0, :cond_1

    iput-wide p1, p0, Lo2/b;->e:J

    return-void

    :cond_1
    sget v0, Lo2/f0;->a:I

    invoke-static {v2, v3}, Li2/x;->i(J)F

    move-result v0

    invoke-static {p1, p2}, Li2/x;->i(J)F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_2

    invoke-static {v2, v3}, Li2/x;->h(J)F

    move-result v0

    invoke-static {p1, p2}, Li2/x;->h(J)F

    move-result v1

    cmpg-float v0, v0, v1

    if-nez v0, :cond_2

    invoke-static {v2, v3}, Li2/x;->f(J)F

    move-result v0

    invoke-static {p1, p2}, Li2/x;->f(J)F

    move-result p1

    cmpg-float p1, v0, p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    iput-boolean p1, p0, Lo2/b;->d:Z

    sget-wide p1, Li2/x;->n:J

    iput-wide p1, p0, Lo2/b;->e:J

    :cond_3
    :goto_0
    return-void
.end method

.method public final g(Lo2/b0;)V
    .locals 4

    instance-of v0, p1, Lo2/g;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    check-cast p1, Lo2/g;

    iget-object v0, p1, Lo2/g;->b:Li2/t;

    iget-boolean v2, p0, Lo2/b;->d:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_2

    instance-of v2, v0, Li2/c1;

    if-eqz v2, :cond_1

    check-cast v0, Li2/c1;

    iget-wide v2, v0, Li2/c1;->c:J

    invoke-virtual {p0, v2, v3}, Lo2/b;->f(J)V

    goto :goto_0

    :cond_1
    iput-boolean v1, p0, Lo2/b;->d:Z

    sget-wide v2, Li2/x;->n:J

    iput-wide v2, p0, Lo2/b;->e:J

    :cond_2
    :goto_0
    iget-object p1, p1, Lo2/g;->g:Li2/t;

    iget-boolean v0, p0, Lo2/b;->d:Z

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    if-eqz p1, :cond_7

    instance-of v0, p1, Li2/c1;

    if-eqz v0, :cond_4

    check-cast p1, Li2/c1;

    iget-wide v0, p1, Li2/c1;->c:J

    invoke-virtual {p0, v0, v1}, Lo2/b;->f(J)V

    return-void

    :cond_4
    iput-boolean v1, p0, Lo2/b;->d:Z

    sget-wide v0, Li2/x;->n:J

    iput-wide v0, p0, Lo2/b;->e:J

    return-void

    :cond_5
    instance-of v0, p1, Lo2/b;

    if-eqz v0, :cond_7

    check-cast p1, Lo2/b;

    iget-boolean v0, p1, Lo2/b;->d:Z

    if-eqz v0, :cond_6

    iget-boolean v0, p0, Lo2/b;->d:Z

    if-eqz v0, :cond_6

    iget-wide v0, p1, Lo2/b;->e:J

    invoke-virtual {p0, v0, v1}, Lo2/b;->f(J)V

    return-void

    :cond_6
    iput-boolean v1, p0, Lo2/b;->d:Z

    sget-wide v0, Li2/x;->n:J

    iput-wide v0, p0, Lo2/b;->e:J

    :cond_7
    :goto_1
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "VGroup: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lo2/b;->k:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lo2/b;->c:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo2/b0;

    const-string v5, "\t"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\n"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
