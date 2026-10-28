.class public abstract Lky0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a\'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u001f\u0010\u0008\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\'\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "topLabel",
        "bottomLabel",
        "Li2/x;",
        "rangeColor",
        "Ll83/a0;",
        "e",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JLandroidx/compose/runtime/Composer;I)V",
        "j",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V",
        "g",
        "(JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V",
        "design_release"
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
.method public static synthetic a(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lky0/b;->k(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 2

    move-wide v0, p0

    move-object p0, p2

    move-object p1, p3

    move-wide p2, v0

    invoke-static/range {p0 .. p6}, Lky0/b;->f(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lky0/b;->h(JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lky0/b;->i(JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JLandroidx/compose/runtime/Composer;I)V
    .locals 13

    move/from16 v5, p5

    const-string v0, "topLabel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bottomLabel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v0, 0x207ae29c

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    const/4 v1, 0x2

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v10, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v3, v5, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v10, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit16 v3, v5, 0x180

    if-nez v3, :cond_5

    move-wide v3, p2

    invoke-virtual {v10, v3, v4}, Lp1/q;->f(J)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v0, v6

    goto :goto_4

    :cond_5
    move-wide v3, p2

    :goto_4
    and-int/lit16 v6, v0, 0x93

    const/16 v7, 0x92

    const/4 v12, 0x1

    if-eq v6, v7, :cond_6

    move v6, v12

    goto :goto_5

    :cond_6
    const/4 v6, 0x0

    :goto_5
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v10, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_a

    sget-object v6, Lb2/t;->w:Lb2/t;

    sget-object v7, Ll0/a1;->x:Ll0/a1;

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/a;->j(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v1, v1

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    sget-object v2, Lb2/e;->J:Lb2/l;

    const/4 v7, 0x6

    invoke-static {v1, v2, v10, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_7

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_6
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v10, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v10, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-nez v7, :cond_8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9

    :cond_8
    invoke-static {v2, v10, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v10, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v1, v0, 0x7e

    invoke-static {p0, p1, v10, v1}, Lky0/b;->j(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    shr-int/lit8 v1, v0, 0x6

    and-int/lit8 v1, v1, 0xe

    shl-int/lit8 v0, v0, 0x3

    and-int/lit8 v2, v0, 0x70

    or-int/2addr v1, v2

    and-int/lit16 v0, v0, 0x380

    or-int v11, v1, v0

    move-object v8, p0

    move-object v9, p1

    move-wide v6, v3

    invoke-static/range {v6 .. v11}, Lky0/b;->g(JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_a
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_b

    new-instance v0, Lky0/a;

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    invoke-direct/range {v0 .. v6}, Lky0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;JII)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final f(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lky0/b;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;JLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move-wide/from16 v1, p0

    move/from16 v5, p5

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v3, 0x2c27ba5a

    invoke-virtual {v0, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v5, 0x6

    const/4 v4, 0x4

    const/4 v6, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v0, v1, v2}, Lp1/q;->f(J)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v6

    :goto_0
    or-int/2addr v3, v5

    goto :goto_1

    :cond_1
    move v3, v5

    :goto_1
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_3

    move-object/from16 v7, p2

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v3, v8

    goto :goto_3

    :cond_3
    move-object/from16 v7, p2

    :goto_3
    and-int/lit16 v8, v5, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p3

    invoke-virtual {v0, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x100

    goto :goto_4

    :cond_4
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v3, v9

    goto :goto_5

    :cond_5
    move-object/from16 v8, p3

    :goto_5
    and-int/lit16 v9, v3, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v9, v10, :cond_6

    move v9, v12

    goto :goto_6

    :cond_6
    move v9, v11

    :goto_6
    and-int/2addr v3, v12

    invoke-virtual {v0, v3, v9}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-static {v7}, Lcom/whoop/design/util/b;->c(Lcom/whoop/design/util/TextResource;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-static {v8}, Lcom/whoop/design/util/b;->c(Lcom/whoop/design/util/TextResource;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_d

    new-instance v0, Lky0/a;

    const/4 v6, 0x1

    move-object v3, v7

    move-object v4, v8

    invoke-direct/range {v0 .. v6}, Lky0/a;-><init>(JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_7
    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    invoke-static {v8, v9, v0, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v9, v0, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v0, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v14, v0, Lp1/q;->S:Z

    if-eqz v14, :cond_8

    invoke-virtual {v0, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_8
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_7
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v0, v13, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v0, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-nez v10, :cond_9

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v10, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_a

    :cond_9
    invoke-static {v9, v0, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v0, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v7, v12

    int-to-float v4, v4

    mul-float/2addr v7, v4

    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v0, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v4, Lt0/j;->a:Lt0/i;

    invoke-static {v5, v4}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    int-to-float v6, v6

    invoke-static {v6, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Lx81/d;->a:Lx81/d;

    const/4 v10, 0x6

    invoke-virtual {v9, v0, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v13

    sget-object v15, Li2/w0;->a:Li2/v0;

    invoke-static {v8, v13, v14, v15}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8, v0, v11}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    float-to-double v13, v3

    const-wide/16 v16, 0x0

    cmpl-double v8, v13, v16

    if-lez v8, :cond_b

    goto :goto_8

    :cond_b
    const-string v8, "invalid weight; must be greater than zero"

    invoke-static {v8}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_8
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v8, v3, v12}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v8, v1, v2, v15}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v3, v8}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v6, v3}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3, v0, v11}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v5, v4}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v6, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v9, v0, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v8

    invoke-static {v3, v8, v9, v15}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3, v0, v11}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v5, v7, v0, v12}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    goto :goto_9

    :cond_c
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_d

    new-instance v0, Lky0/a;

    const/4 v6, 0x2

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lky0/a;-><init>(JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final h(JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-wide v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lky0/b;->g(JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-wide v0, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lky0/b;->g(JLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V
    .locals 36

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, 0x1e1757a1

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, p3, 0x6

    const/4 v5, 0x4

    if-nez v4, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int v4, p3, v4

    goto :goto_1

    :cond_1
    move/from16 v4, p3

    :goto_1
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v3, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_3
    move/from16 v29, v4

    and-int/lit8 v4, v29, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x1

    if-eq v4, v6, :cond_4

    move v4, v7

    goto :goto_3

    :cond_4
    const/4 v4, 0x0

    :goto_3
    and-int/lit8 v6, v29, 0x1

    invoke-virtual {v3, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_8

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Ll0/a1;->x:Ll0/a1;

    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/a;->u(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Ll0/m;->g:Ll0/h;

    sget-object v10, Lb2/e;->M:Lb2/k;

    const/4 v11, 0x6

    invoke-static {v9, v10, v3, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v12, v3, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v3, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v14, v3, Lp1/q;->S:Z

    if-eqz v14, :cond_5

    invoke-virtual {v3, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_4
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v3, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v3, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v12, v3, Lp1/q;->S:Z

    if-nez v12, :cond_6

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_7

    :cond_6
    invoke-static {v10, v3, v10, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v3, v9, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v8, v29, 0x3

    and-int/lit8 v8, v8, 0xe

    invoke-static {v1, v3, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    move v9, v4

    invoke-static {v9, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v10, Lx81/d;->a:Lx81/d;

    invoke-virtual {v10, v3, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->F()Lb91/a;

    move-result-object v23

    invoke-virtual {v10, v3, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->b1()J

    move-result-wide v12

    new-instance v15, Lw3/k;

    invoke-direct {v15, v11}, Lw3/k;-><init>(I)V

    const/16 v27, 0x0

    const v28, 0x2fdf8

    move-object/from16 v25, v3

    move v14, v7

    move-object v3, v8

    const-wide/16 v7, 0x0

    move/from16 v16, v9

    const/4 v9, 0x0

    move-object/from16 v17, v10

    const/4 v10, 0x0

    move/from16 v18, v11

    const/4 v11, 0x0

    move/from16 v19, v5

    move-object/from16 v20, v6

    move-wide v5, v12

    const-wide/16 v12, 0x0

    move/from16 v21, v14

    const/4 v14, 0x0

    move/from16 v24, v16

    move-object/from16 v22, v17

    const-wide/16 v16, 0x0

    move/from16 v26, v18

    const/16 v18, 0x0

    move/from16 v30, v19

    const/16 v19, 0x0

    move-object/from16 v31, v20

    const/16 v20, 0x0

    move/from16 v32, v21

    const/16 v21, 0x0

    move-object/from16 v33, v22

    const/16 v22, 0x0

    move/from16 v34, v24

    const/16 v24, 0x0

    move/from16 v35, v26

    const/16 v26, 0x30

    move-object/from16 v1, v31

    move/from16 v2, v32

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    int-to-float v4, v2

    const/4 v5, 0x4

    int-to-float v5, v5

    invoke-static {v4, v5, v1, v3}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    and-int/lit8 v4, v29, 0xe

    invoke-static {v0, v3, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v5, v33

    const/4 v6, 0x6

    invoke-virtual {v5, v3, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->F()Lb91/a;

    move-result-object v23

    invoke-virtual {v5, v3, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->b1()J

    move-result-wide v7

    new-instance v15, Lw3/k;

    invoke-direct {v15, v6}, Lw3/k;-><init>(I)V

    move-wide v5, v7

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    move-object v3, v4

    move-object v4, v1

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_8
    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_9

    new-instance v2, La11/j;

    const/16 v3, 0xb

    move-object/from16 v4, p1

    move/from16 v5, p3

    invoke-direct {v2, v0, v4, v5, v3}, La11/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final k(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lky0/b;->j(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
