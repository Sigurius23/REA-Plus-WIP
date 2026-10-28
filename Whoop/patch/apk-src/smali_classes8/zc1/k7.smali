.class public abstract Lzc1/k7;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "f",
        "(Landroidx/compose/runtime/Composer;I)V",
        "design-showcase_release"
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
.method public static synthetic a(Lp1/c1;Lid2/j;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/k7;->j(Lp1/c1;Lid2/j;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/k7;->i(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/k7;->g(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/k7;->k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/k7;->h(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/runtime/Composer;I)V
    .locals 23

    move-object/from16 v10, p0

    check-cast v10, Lp1/q;

    const v1, 0x7cf0f90a    # 1.0009619E37f

    invoke-virtual {v10, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v13, 0x0

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v13

    :goto_0
    and-int/lit8 v2, p1, 0x1

    invoke-virtual {v10, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-ne v1, v15, :cond_1

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v8, v1

    check-cast v8, Lp1/c1;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v15, :cond_2

    const/4 v1, 0x0

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v9, v1

    check-cast v9, Lp1/c1;

    invoke-static {v10, v13}, Lid2/k;->a(Landroidx/compose/runtime/Composer;I)Lid2/j;

    move-result-object v3

    const/4 v1, 0x4

    int-to-float v11, v1

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v1, v11

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v12}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->N:Lb2/k;

    sget-object v4, Ll0/m;->c:Ll0/g;

    const/16 v5, 0x30

    invoke-static {v4, v2, v10, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v4, v10, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v10, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-eqz v7, :cond_3

    invoke-virtual {v10, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_3
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v10, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v10, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v5, v10, Lp1/q;->S:Z

    if-nez v5, :cond_4

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    :cond_4
    invoke-static {v4, v10, v4, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v10, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "Preview"

    const/4 v2, 0x6

    invoke-static {v1, v10, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v1, Lcom/whoop/profile/view/edit/c;

    const/16 v4, 0xc

    invoke-direct {v1, v4, v8}, Lcom/whoop/profile/view/edit/c;-><init>(ILp1/c1;)V

    const v4, -0x27df41e5

    invoke-static {v4, v10, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    sget v1, Lid2/j;->c:I

    shl-int/2addr v1, v2

    or-int/lit16 v6, v1, 0xc00

    const/4 v7, 0x3

    const/4 v1, 0x0

    move v5, v2

    const/4 v2, 0x0

    move-object/from16 v22, v10

    move v10, v5

    move-object/from16 v5, v22

    invoke-static/range {v1 .. v7}, Lid2/n;->l(Ly3/f;Ly3/f;Lid2/j;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v11, v11, v12, v5}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    sget-object v2, Lny0/v;->TextMedium:Lny0/v;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v15, :cond_6

    new-instance v1, Lzc1/l6;

    const/16 v4, 0xe

    invoke-direct {v1, v4, v8}, Lzc1/l6;-><init>(ILp1/c1;)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v1, Lc93/a;

    move v4, v11

    const v11, 0xc001b0

    move-object v6, v12

    const/16 v12, 0x79

    move-object v7, v9

    move-object v9, v1

    const/4 v1, 0x0

    move-object/from16 v16, v3

    const-string v3, "Show Gauges"

    move/from16 v17, v4

    const/4 v4, 0x0

    move-object/from16 v19, v6

    move/from16 v18, v10

    move-object v10, v5

    const-wide/16 v5, 0x0

    move-object/from16 v20, v7

    const/4 v7, 0x0

    move-object/from16 v21, v8

    const/4 v8, 0x0

    move-object/from16 v0, v16

    move-object/from16 v13, v19

    move-object/from16 v14, v21

    invoke-static/range {v1 .. v12}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x2

    int-to-float v1, v1

    mul-float v1, v1, v17

    invoke-static {v1, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v10, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v15, :cond_7

    new-instance v3, Lzc1/l6;

    const/16 v4, 0xf

    invoke-direct {v3, v4, v14}, Lzc1/l6;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v9, v3

    check-cast v9, Lc93/a;

    const v11, 0xc001b0

    const/16 v12, 0x79

    move v3, v1

    const/4 v1, 0x0

    move v4, v3

    const-string v3, "Show Sliders"

    move v5, v4

    const/4 v4, 0x0

    move v7, v5

    const-wide/16 v5, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v14, v8

    const/4 v8, 0x0

    invoke-static/range {v1 .. v12}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v14, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v10, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v10, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_9

    if-ne v3, v15, :cond_8

    goto :goto_2

    :cond_8
    move-object/from16 v15, v20

    goto :goto_3

    :cond_9
    :goto_2
    new-instance v3, Lyo1/b;

    const/16 v1, 0xd

    move-object/from16 v15, v20

    invoke-direct {v3, v1, v15, v0}, Lyo1/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_3
    move-object v9, v3

    check-cast v9, Lc93/a;

    const/16 v11, 0x1b0

    const/16 v12, 0x79

    const/4 v1, 0x0

    const-string v3, "Take Snapshot"

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v1 .. v12}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v14, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v10, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v0, "Captured Bitmap"

    const/4 v5, 0x6

    invoke-static {v0, v10, v5}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-interface {v15}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_a

    const v0, -0x29ebbccd

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-interface {v15}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object v1, v0

    check-cast v1, Li2/g;

    const/16 v0, 0xc8

    int-to-float v0, v0

    invoke-static {v0, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v6, 0x1b0

    const/16 v7, 0xf8

    const-string v2, "Capture Image"

    const/4 v4, 0x0

    move-object v5, v10

    invoke-static/range {v1 .. v7}, Lpf/c;->e(Li2/g;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ly2/k;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_4
    const/4 v0, 0x1

    goto :goto_5

    :cond_a
    const/4 v0, 0x0

    const v1, -0x29e8fed2

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_4

    :goto_5
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_b
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_c

    new-instance v1, Lzc1/g6;

    const/16 v2, 0x16

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lzc1/g6;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final g(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_1

    const p0, 0xa4b5919

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    invoke-static {p1, v3}, Lzc1/p2;->e(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_1
    const p0, 0xa4c22b8

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    invoke-static {p1, v3}, Lzc1/p7;->k(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lp1/c1;)Ll83/a0;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lp1/c1;)Ll83/a0;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lp1/c1;Lid2/j;)Ll83/a0;
    .locals 1

    invoke-virtual {p1}, Lid2/j;->b()Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Li2/g;

    invoke-direct {v0, p1}, Li2/g;-><init>(Landroid/graphics/Bitmap;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/k7;->f(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
