.class public final Ll0/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/r0;


# instance fields
.field public final a:Lb2/h;

.field public final b:Z


# direct methods
.method public constructor <init>(Lb2/h;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll0/t;->a:Lb2/h;

    iput-boolean p2, p0, Ll0/t;->b:Z

    return-void
.end method


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 16

    move-object/from16 v3, p1

    move-object/from16 v2, p2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    sget-object v7, Lm83/z;->w:Lm83/z;

    if-eqz v0, :cond_0

    invoke-static/range {p3 .. p4}, Ly3/a;->k(J)I

    move-result v0

    invoke-static/range {p3 .. p4}, Ly3/a;->j(J)I

    move-result v1

    new-instance v2, Ldc1/c;

    const/16 v4, 0x1b

    invoke-direct {v2, v4}, Ldc1/c;-><init>(I)V

    invoke-interface {v3, v0, v1, v7, v2}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v0

    return-object v0

    :cond_0
    move-object/from16 v6, p0

    iget-boolean v0, v6, Ll0/t;->b:Z

    if-eqz v0, :cond_1

    move-wide/from16 v0, p3

    goto :goto_0

    :cond_1
    const-wide v0, -0x1fffffffdL

    and-long v0, p3, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-ne v4, v8, :cond_8

    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly2/q0;

    invoke-interface {v2}, Ly2/q0;->p()Ljava/lang/Object;

    move-result-object v4

    instance-of v10, v4, Ll0/o;

    if-eqz v10, :cond_2

    move-object v5, v4

    check-cast v5, Ll0/o;

    :cond_2
    if-eqz v5, :cond_3

    iget-boolean v4, v5, Ll0/o;->P:Z

    goto :goto_1

    :cond_3
    move v4, v9

    :goto_1
    if-nez v4, :cond_4

    invoke-interface {v2, v0, v1}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v0

    invoke-static/range {p3 .. p4}, Ly3/a;->k(J)I

    move-result v1

    iget v4, v0, Ly2/j1;->w:I

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static/range {p3 .. p4}, Ly3/a;->j(J)I

    move-result v4

    iget v5, v0, Ly2/j1;->x:I

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    :goto_2
    move v5, v4

    move v4, v1

    move-object v1, v0

    goto :goto_5

    :cond_4
    invoke-static/range {p3 .. p4}, Ly3/a;->k(J)I

    move-result v1

    invoke-static/range {p3 .. p4}, Ly3/a;->j(J)I

    move-result v4

    invoke-static/range {p3 .. p4}, Ly3/a;->k(J)I

    move-result v0

    invoke-static/range {p3 .. p4}, Ly3/a;->j(J)I

    move-result v5

    if-ltz v0, :cond_5

    move v10, v8

    goto :goto_3

    :cond_5
    move v10, v9

    :goto_3
    if-ltz v5, :cond_6

    goto :goto_4

    :cond_6
    move v8, v9

    :goto_4
    and-int/2addr v8, v10

    if-nez v8, :cond_7

    const-string v8, "width and height must be >= 0"

    invoke-static {v8}, Ly3/i;->a(Ljava/lang/String;)V

    :cond_7
    invoke-static {v0, v0, v5, v5}, Ly3/b;->h(IIII)J

    move-result-wide v8

    invoke-interface {v2, v8, v9}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v0

    goto :goto_2

    :goto_5
    new-instance v0, Ll0/r;

    invoke-direct/range {v0 .. v6}, Ll0/r;-><init>(Ly2/j1;Ly2/q0;Ly2/t0;IILl0/t;)V

    invoke-interface {v3, v4, v5, v7, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v0

    return-object v0

    :cond_8
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    new-array v4, v4, [Ly2/j1;

    move-object v6, v4

    new-instance v4, Lkotlin/jvm/internal/e0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    invoke-static/range {p3 .. p4}, Ly3/a;->k(J)I

    move-result v10

    iput v10, v4, Lkotlin/jvm/internal/e0;->w:I

    move-object v10, v5

    new-instance v5, Lkotlin/jvm/internal/e0;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    invoke-static/range {p3 .. p4}, Ly3/a;->j(J)I

    move-result v11

    iput v11, v5, Lkotlin/jvm/internal/e0;->w:I

    move-object v11, v2

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->size()I

    move-result v12

    move v13, v9

    move v14, v13

    :goto_6
    if-ge v13, v12, :cond_c

    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ly2/q0;

    invoke-interface {v15}, Ly2/q0;->p()Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Ll0/o;

    if-eqz v9, :cond_9

    check-cast v8, Ll0/o;

    goto :goto_7

    :cond_9
    move-object v8, v10

    :goto_7
    if-eqz v8, :cond_a

    iget-boolean v8, v8, Ll0/o;->P:Z

    goto :goto_8

    :cond_a
    const/4 v8, 0x0

    :goto_8
    if-nez v8, :cond_b

    invoke-interface {v15, v0, v1}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v8

    aput-object v8, v6, v13

    iget v9, v4, Lkotlin/jvm/internal/e0;->w:I

    iget v15, v8, Ly2/j1;->w:I

    invoke-static {v9, v15}, Ljava/lang/Math;->max(II)I

    move-result v9

    iput v9, v4, Lkotlin/jvm/internal/e0;->w:I

    iget v9, v5, Lkotlin/jvm/internal/e0;->w:I

    iget v8, v8, Ly2/j1;->x:I

    invoke-static {v9, v8}, Ljava/lang/Math;->max(II)I

    move-result v8

    iput v8, v5, Lkotlin/jvm/internal/e0;->w:I

    goto :goto_9

    :cond_b
    const/4 v14, 0x1

    :goto_9
    add-int/lit8 v13, v13, 0x1

    const/4 v8, 0x1

    const/4 v9, 0x0

    goto :goto_6

    :cond_c
    if-eqz v14, :cond_12

    iget v0, v4, Lkotlin/jvm/internal/e0;->w:I

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_d

    move v8, v0

    goto :goto_a

    :cond_d
    const/4 v8, 0x0

    :goto_a
    iget v9, v5, Lkotlin/jvm/internal/e0;->w:I

    if-eq v9, v1, :cond_e

    move v1, v9

    goto :goto_b

    :cond_e
    const/4 v1, 0x0

    :goto_b
    invoke-static {v8, v0, v1, v9}, Ly3/b;->a(IIII)J

    move-result-wide v0

    invoke-interface {v11}, Ljava/util/Collection;->size()I

    move-result v8

    const/4 v9, 0x0

    :goto_c
    if-ge v9, v8, :cond_12

    invoke-interface {v2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ly2/q0;

    invoke-interface {v11}, Ly2/q0;->p()Ljava/lang/Object;

    move-result-object v12

    instance-of v13, v12, Ll0/o;

    if-eqz v13, :cond_f

    check-cast v12, Ll0/o;

    goto :goto_d

    :cond_f
    move-object v12, v10

    :goto_d
    if-eqz v12, :cond_10

    iget-boolean v12, v12, Ll0/o;->P:Z

    goto :goto_e

    :cond_10
    const/4 v12, 0x0

    :goto_e
    if-eqz v12, :cond_11

    invoke-interface {v11, v0, v1}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v11

    aput-object v11, v6, v9

    :cond_11
    add-int/lit8 v9, v9, 0x1

    goto :goto_c

    :cond_12
    iget v8, v4, Lkotlin/jvm/internal/e0;->w:I

    iget v9, v5, Lkotlin/jvm/internal/e0;->w:I

    new-instance v0, Ll0/s;

    move-object v1, v6

    move-object/from16 v6, p0

    invoke-direct/range {v0 .. v6}, Ll0/s;-><init>([Ly2/j1;Ljava/util/List;Ly2/t0;Lkotlin/jvm/internal/e0;Lkotlin/jvm/internal/e0;Ll0/t;)V

    invoke-interface {v3, v8, v9, v7, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ll0/t;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ll0/t;

    iget-object v1, p0, Ll0/t;->a:Lb2/h;

    iget-object v3, p1, Ll0/t;->a:Lb2/h;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Ll0/t;->b:Z

    iget-boolean p1, p1, Ll0/t;->b:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Ll0/t;->a:Lb2/h;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Ll0/t;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "BoxMeasurePolicy(alignment="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll0/t;->a:Lb2/h;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", propagateMinConstraints="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll0/t;->b:Z

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lb9/y;->r(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
