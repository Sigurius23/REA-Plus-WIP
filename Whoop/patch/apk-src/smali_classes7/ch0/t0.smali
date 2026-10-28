.class public abstract Lch0/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001aP\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0080@\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a;\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lf0/r1;",
        "scrollState",
        "",
        "Lzg0/e;",
        "sections",
        "",
        "",
        "",
        "turnEndYs",
        "Lkotlin/Function0;",
        "viewportTopY",
        "turnId",
        "Ll83/a0;",
        "c",
        "(Lf0/r1;Ljava/util/List;Ljava/util/Map;Lc93/a;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "b",
        "(Ljava/util/List;Ljava/util/Map;F)Ljava/lang/String;",
        "bot_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(J)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lch0/t0;->d(J)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/util/List;Ljava/util/Map;F)Ljava/lang/String;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lzg0/e;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            ">;F)",
            "Ljava/lang/String;"
        }
    .end annotation

    const-string v0, "sections"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "turnEndYs"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Lzg0/e;

    invoke-virtual {v3}, Lzg0/e;->e()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    goto :goto_0

    :cond_1
    const v3, 0x7f7fffff    # Float.MAX_VALUE

    :goto_0
    cmpl-float v3, v3, p2

    if-lez v3, :cond_0

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    check-cast v1, Lzg0/e;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lzg0/e;->e()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_3

    return-object p1

    :cond_3
    invoke-static {p0}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzg0/e;

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Lzg0/e;->e()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    return-object v2
.end method

.method public static final c(Lf0/r1;Ljava/util/List;Ljava/util/Map;Lc93/a;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf0/r1;",
            "Ljava/util/List<",
            "Lzg0/e;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Float;",
            ">;",
            "Lc93/a;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    instance-of v3, v2, Lch0/t0$a;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lch0/t0$a;

    iget v4, v3, Lch0/t0$a;->N:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lch0/t0$a;->N:I

    goto :goto_0

    :cond_0
    new-instance v3, Lch0/t0$a;

    invoke-direct {v3, v2}, Lch0/t0$a;-><init>(Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lch0/t0$a;->M:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lch0/t0$a;->N:I

    const/4 v6, 0x4

    const/4 v7, 0x2

    const/4 v8, 0x3

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eqz v5, :cond_5

    if-eq v5, v11, :cond_2

    if-eq v5, v7, :cond_4

    if-eq v5, v8, :cond_1

    if-ne v5, v6, :cond_3

    :cond_1
    iget-object v0, v3, Lch0/t0$a;->G:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Float;

    iget-object v0, v3, Lch0/t0$a;->F:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Float;

    :cond_2
    iget-object v0, v3, Lch0/t0$a;->E:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v3, Lch0/t0$a;->z:Ljava/lang/Object;

    check-cast v0, Lc93/a;

    iget-object v0, v3, Lch0/t0$a;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    iget-object v0, v3, Lch0/t0$a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, v3, Lch0/t0$a;->w:Ljava/lang/Object;

    check-cast v0, Lf0/r1;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v9

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    iget v0, v3, Lch0/t0$a;->K:I

    iget v1, v3, Lch0/t0$a;->J:I

    iget v5, v3, Lch0/t0$a;->I:I

    iget v13, v3, Lch0/t0$a;->H:I

    iget-object v14, v3, Lch0/t0$a;->F:Ljava/lang/Object;

    check-cast v14, Ljava/lang/Float;

    iget-object v14, v3, Lch0/t0$a;->E:Ljava/lang/Object;

    check-cast v14, Ljava/lang/String;

    iget-object v15, v3, Lch0/t0$a;->z:Ljava/lang/Object;

    check-cast v15, Lc93/a;

    iget-object v6, v3, Lch0/t0$a;->y:Ljava/lang/Object;

    check-cast v6, Ljava/util/Map;

    iget-object v10, v3, Lch0/t0$a;->x:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v7, v3, Lch0/t0$a;->w:Ljava/lang/Object;

    check-cast v7, Lf0/r1;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, v6

    move/from16 v17, v11

    move v6, v0

    move-object v0, v7

    move-object v7, v3

    move-object v3, v15

    move v15, v13

    move v13, v5

    move-object v5, v14

    goto/16 :goto_4

    :cond_5
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v5, 0x0

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, -0x1

    if-eqz v6, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lzg0/e;

    invoke-virtual {v6}, Lzg0/e;->e()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_2

    :cond_6
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_7
    move v5, v7

    :goto_2
    if-gez v5, :cond_8

    iget-object v1, v0, Lf0/r1;->d:Lp1/h1;

    invoke-virtual {v1}, Lp1/h1;->x()I

    move-result v1

    iput-object v12, v3, Lch0/t0$a;->w:Ljava/lang/Object;

    iput-object v12, v3, Lch0/t0$a;->x:Ljava/lang/Object;

    iput-object v12, v3, Lch0/t0$a;->y:Ljava/lang/Object;

    iput-object v12, v3, Lch0/t0$a;->z:Ljava/lang/Object;

    iput-object v12, v3, Lch0/t0$a;->E:Ljava/lang/Object;

    iput v5, v3, Lch0/t0$a;->H:I

    iput v11, v3, Lch0/t0$a;->N:I

    invoke-virtual {v0, v1, v3}, Lf0/r1;->g(ILq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_10

    goto/16 :goto_7

    :cond_8
    move-object/from16 v2, p2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Float;

    move-object v10, v3

    move v15, v5

    move-object v14, v6

    move v13, v7

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v3, p3

    move-object v5, v1

    move-object/from16 v1, p1

    :goto_3
    if-ge v7, v8, :cond_c

    move/from16 v17, v11

    const/16 v11, 0x2d

    if-ge v6, v11, :cond_c

    new-instance v11, Lc62/a;

    const/16 v14, 0x1b

    invoke-direct {v11, v14}, Lc62/a;-><init>(I)V

    iput-object v0, v10, Lch0/t0$a;->w:Ljava/lang/Object;

    iput-object v1, v10, Lch0/t0$a;->x:Ljava/lang/Object;

    iput-object v2, v10, Lch0/t0$a;->y:Ljava/lang/Object;

    iput-object v3, v10, Lch0/t0$a;->z:Ljava/lang/Object;

    iput-object v5, v10, Lch0/t0$a;->E:Ljava/lang/Object;

    iput-object v12, v10, Lch0/t0$a;->F:Ljava/lang/Object;

    iput v15, v10, Lch0/t0$a;->H:I

    iput v13, v10, Lch0/t0$a;->I:I

    iput v7, v10, Lch0/t0$a;->J:I

    iput v6, v10, Lch0/t0$a;->K:I

    const/4 v14, 0x2

    iput v14, v10, Lch0/t0$a;->N:I

    invoke-interface {v10}, Lq83/d;->getContext()Lq83/j;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lp1/x;->v(Lq83/j;)Lp1/w0;

    move-result-object v14

    invoke-interface {v14, v11, v10}, Lp1/w0;->k(Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v4, :cond_9

    goto/16 :goto_7

    :cond_9
    move-object/from16 v18, v10

    move-object v10, v1

    move v1, v7

    move-object/from16 v7, v18

    :goto_4
    iget-object v11, v0, Lf0/r1;->f:Lh0/d0;

    invoke-virtual {v11}, Lh0/d0;->b()Z

    move-result v11

    if-eqz v11, :cond_a

    goto/16 :goto_8

    :cond_a
    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    move-object v14, v11

    check-cast v14, Ljava/lang/Float;

    iget-object v11, v0, Lf0/r1;->d:Lp1/h1;

    invoke-virtual {v11}, Lp1/h1;->x()I

    move-result v11

    if-ne v11, v13, :cond_b

    if-eqz v14, :cond_b

    const/4 v8, 0x0

    invoke-static {v14, v8}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Float;F)Z

    move-result v8

    if-nez v8, :cond_b

    add-int/lit8 v8, v1, 0x1

    invoke-static {v1}, Lhg3/i;->v(I)Ljava/lang/Integer;

    goto :goto_5

    :cond_b
    move v13, v11

    const/4 v8, 0x0

    :goto_5
    add-int/lit8 v6, v6, 0x1

    move-object v1, v10

    move/from16 v11, v17

    move-object v10, v7

    move v7, v8

    const/4 v8, 0x3

    goto :goto_3

    :cond_c
    iget-object v2, v0, Lf0/r1;->f:Lh0/d0;

    iget-object v5, v0, Lf0/r1;->d:Lp1/h1;

    invoke-virtual {v2}, Lh0/d0;->b()Z

    move-result v2

    if-eqz v2, :cond_d

    goto :goto_8

    :cond_d
    invoke-static {v1}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v1

    if-eq v15, v1, :cond_f

    if-nez v14, :cond_e

    goto :goto_6

    :cond_e
    iget-object v1, v0, Lf0/r1;->a:Lp1/h1;

    invoke-virtual {v1}, Lp1/h1;->x()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v14}, Ljava/lang/Float;->floatValue()F

    move-result v2

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    sub-float/2addr v2, v3

    add-float/2addr v2, v1

    invoke-static {v2}, Le93/b;->X(F)I

    move-result v1

    invoke-virtual {v5}, Lp1/h1;->x()I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v1, v3, v2}, Le93/b;->n(III)I

    move-result v1

    iput-object v12, v10, Lch0/t0$a;->w:Ljava/lang/Object;

    iput-object v12, v10, Lch0/t0$a;->x:Ljava/lang/Object;

    iput-object v12, v10, Lch0/t0$a;->y:Ljava/lang/Object;

    iput-object v12, v10, Lch0/t0$a;->z:Ljava/lang/Object;

    iput-object v12, v10, Lch0/t0$a;->E:Ljava/lang/Object;

    iput-object v12, v10, Lch0/t0$a;->F:Ljava/lang/Object;

    iput-object v12, v10, Lch0/t0$a;->G:Ljava/lang/Object;

    iput v15, v10, Lch0/t0$a;->H:I

    iput v13, v10, Lch0/t0$a;->I:I

    iput v7, v10, Lch0/t0$a;->J:I

    iput v6, v10, Lch0/t0$a;->K:I

    iput v1, v10, Lch0/t0$a;->L:I

    const/4 v2, 0x4

    iput v2, v10, Lch0/t0$a;->N:I

    invoke-virtual {v0, v1, v10}, Lf0/r1;->g(ILq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_10

    goto :goto_7

    :cond_f
    :goto_6
    invoke-virtual {v5}, Lp1/h1;->x()I

    move-result v1

    iput-object v12, v10, Lch0/t0$a;->w:Ljava/lang/Object;

    iput-object v12, v10, Lch0/t0$a;->x:Ljava/lang/Object;

    iput-object v12, v10, Lch0/t0$a;->y:Ljava/lang/Object;

    iput-object v12, v10, Lch0/t0$a;->z:Ljava/lang/Object;

    iput-object v12, v10, Lch0/t0$a;->E:Ljava/lang/Object;

    iput-object v12, v10, Lch0/t0$a;->F:Ljava/lang/Object;

    iput-object v12, v10, Lch0/t0$a;->G:Ljava/lang/Object;

    iput v15, v10, Lch0/t0$a;->H:I

    iput v13, v10, Lch0/t0$a;->I:I

    iput v7, v10, Lch0/t0$a;->J:I

    iput v6, v10, Lch0/t0$a;->K:I

    const/4 v2, 0x3

    iput v2, v10, Lch0/t0$a;->N:I

    invoke-virtual {v0, v1, v10}, Lf0/r1;->g(ILq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_10

    :goto_7
    return-object v4

    :cond_10
    :goto_8
    return-object v9
.end method

.method private static final d(J)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
