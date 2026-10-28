.class public abstract Lyw1/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a!\u0010\u000c\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Luw1/d;",
        "viewState",
        "Lkotlin/Function1;",
        "Lww1/c;",
        "Ll83/a0;",
        "onEvent",
        "i",
        "(Luw1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "",
        "description",
        "Lkd1/o;",
        "image",
        "g",
        "(Ljava/lang/String;Lkd1/o;Landroidx/compose/runtime/Composer;I)V",
        "membership_release"
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
.method public static synthetic a(Luw1/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lyw1/o;->l(Luw1/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Luw1/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lyw1/o;->k(Luw1/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;Lkd1/o;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lyw1/o;->h(Ljava/lang/String;Lkd1/o;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Luw1/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lyw1/o;->n(Luw1/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Luw1/d$a;Lkotlin/jvm/functions/Function1;Luw1/d;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lyw1/o;->j(Luw1/d$a;Lkotlin/jvm/functions/Function1;Luw1/d;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Luw1/d$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lyw1/o;->m(Luw1/d$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Ljava/lang/String;Lkd1/o;Landroidx/compose/runtime/Composer;I)V
    .locals 40

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v12, p3

    move-object/from16 v4, p2

    check-cast v4, Lp1/q;

    const v2, -0x71aa1d

    invoke-virtual {v4, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v12, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v12

    goto :goto_1

    :cond_1
    move v2, v12

    :goto_1
    and-int/lit8 v5, v12, 0x30

    if-nez v5, :cond_4

    and-int/lit8 v5, v12, 0x40

    if-nez v5, :cond_2

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_2

    :cond_2
    invoke-virtual {v4, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_2
    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v2, v5

    :cond_4
    move/from16 v39, v2

    and-int/lit8 v2, v39, 0x13

    const/16 v5, 0x12

    const/4 v13, 0x0

    if-eq v2, v5, :cond_5

    const/4 v2, 0x1

    goto :goto_4

    :cond_5
    move v2, v13

    :goto_4
    and-int/lit8 v5, v39, 0x1

    invoke-virtual {v4, v5, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_d

    sget-object v2, Ll0/m;->e:Ll0/h;

    sget-object v5, Lb2/e;->N:Lb2/k;

    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v3, v3

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float v9, v3, v8

    invoke-static {v9, v6}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v9, 0x36

    invoke-static {v2, v5, v4, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v9, v4, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v4, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-eqz v11, :cond_6

    invoke-virtual {v4, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_5
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v4, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v4, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v14, v4, Lp1/q;->S:Z

    if-nez v14, :cond_7

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v14, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    :cond_7
    invoke-static {v5, v4, v5, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v4, v5, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v6, 0x64

    int-to-float v6, v6

    if-nez v1, :cond_9

    const v2, -0x5a4aad4

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v13}, Lp1/q;->q(Z)V

    move v11, v8

    goto/16 :goto_7

    :cond_9
    const v7, -0x5a4aad3

    invoke-virtual {v4, v7}, Lp1/q;->e0(I)V

    invoke-static {v6, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    div-float/2addr v6, v3

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    invoke-static {v7, v3}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Lb2/e;->E:Lb2/m;

    invoke-static {v6, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v13, v4, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v4, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v14, v4, Lp1/q;->S:Z

    if-eqz v14, :cond_a

    invoke-virtual {v4, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v4, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v2, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v4, Lp1/q;->S:Z

    if-nez v2, :cond_b

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    :cond_b
    invoke-static {v7, v4, v7, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v4, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v2, Lkd1/o;->a:I

    shr-int/lit8 v3, v39, 0x3

    and-int/lit8 v3, v3, 0xe

    or-int v5, v2, v3

    const/4 v6, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v2

    move-object/from16 v35, v4

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v15}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v9, 0x61b0

    const/16 v10, 0x68

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    sget-object v5, Ly2/j;->a:Ly2/b1;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v11, v8

    move-object/from16 v8, v35

    invoke-static/range {v1 .. v10}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v8

    const/4 v1, 0x1

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    const/4 v1, 0x4

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-static {v1, v1, v15, v4, v2}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    :goto_7
    sget-object v13, Liz0/l;->a:Liz0/l;

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v4, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->c1()J

    move-result-wide v5

    invoke-static {v1, v4, v2}, Lte0/d;->t(Lx81/d;Lp1/q;I)Ll3/v0;

    move-result-object v17

    const/16 v30, 0x0

    const v31, 0xff7fff

    const-wide/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x3

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    invoke-static/range {v17 .. v31}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v14

    const/4 v1, 0x1

    int-to-float v2, v1

    mul-float v34, v2, v11

    sget v2, Liz0/l;->b:I

    shl-int/lit8 v2, v2, 0xf

    or-int/lit16 v2, v2, 0x6000

    const/16 v38, 0x3ffc

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v36, 0x0

    move/from16 v37, v2

    move-object/from16 v35, v4

    move-wide v15, v5

    invoke-virtual/range {v13 .. v38}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v3

    and-int/lit8 v2, v39, 0xe

    or-int/lit16 v2, v2, 0x180

    sget v4, Liz0/m;->p:I

    shl-int/lit8 v4, v4, 0x9

    or-int v10, v2, v4

    const/16 v11, 0x1f2

    move/from16 v16, v1

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v13, p1

    move/from16 v14, v16

    move-object/from16 v9, v35

    invoke-static/range {v0 .. v11}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    move-object v4, v9

    invoke-virtual {v4, v14}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_d
    move-object v13, v1

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_e

    new-instance v2, Lbm0/p;

    invoke-direct {v2, v0, v13, v12}, Lbm0/p;-><init>(Ljava/lang/String;Lkd1/o;I)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final h(Ljava/lang/String;Lkd1/o;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lyw1/o;->g(Ljava/lang/String;Lkd1/o;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i(Luw1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Luw1/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p2

    check-cast v6, Lp1/q;

    const p2, 0x3b2b120c

    invoke-virtual {v6, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_1

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v0, p3, 0x30

    if-nez v0, :cond_3

    invoke-virtual {v6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x20

    goto :goto_2

    :cond_2
    const/16 v0, 0x10

    :goto_2
    or-int/2addr p2, v0

    :cond_3
    and-int/lit8 v0, p2, 0x13

    const/16 v1, 0x12

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_4

    move v0, v3

    goto :goto_3

    :cond_4
    move v0, v2

    :goto_3
    and-int/2addr p2, v3

    invoke-virtual {v6, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-virtual {p0}, Luw1/d;->b()Luw1/d$a;

    move-result-object p2

    if-eqz p2, :cond_5

    move v2, v3

    :cond_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    new-instance v0, Lyw1/e;

    const/4 v2, 0x2

    invoke-direct {v0, p2, p1, p0, v2}, Lyw1/e;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    const p2, 0xf83d7cb    # 1.3000718E-29f

    invoke-static {p2, v6, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const/16 v7, 0x6c00

    const/4 v8, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v4, ""

    invoke-static/range {v1 .. v8}, Lpf/c;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Ld0/c0;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_6
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_7

    new-instance v0, Lyw1/l;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, p3, v1}, Lyw1/l;-><init>(Luw1/d;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final j(Luw1/d$a;Lkotlin/jvm/functions/Function1;Luw1/d;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 41

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p3

    and-int/lit8 v4, p5, 0x6

    if-nez v4, :cond_1

    move-object/from16 v4, p4

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v3}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int v4, p5, v4

    goto :goto_1

    :cond_1
    move/from16 v4, p5

    :goto_1
    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v5, v6, :cond_2

    move v5, v8

    goto :goto_2

    :cond_2
    move v5, v7

    :goto_2
    and-int/2addr v4, v8

    move-object/from16 v6, p4

    check-cast v6, Lp1/q;

    invoke-virtual {v6, v4, v5}, Lp1/q;->U(IZ)Z

    move-result v4

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    if-eqz v4, :cond_b

    if-eqz v3, :cond_a

    if-eqz v0, :cond_a

    const v3, 0x7fb692a1

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-nez v3, :cond_3

    if-ne v4, v8, :cond_4

    :cond_3
    new-instance v4, Lyw1/o$a;

    const/4 v3, 0x0

    invoke-direct {v4, v1, v3}, Lyw1/o$a;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v6, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v4, Lc93/m;

    invoke-static {v6, v4, v5}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Luw1/d$a;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v0}, Luw1/d$a;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v0}, Luw1/d$a;->e()Ly81/e;

    move-result-object v3

    if-nez v3, :cond_5

    sget-object v3, Ly81/f;->BRAND_WHITE:Ly81/f;

    :cond_5
    move-object v13, v3

    invoke-virtual {v0}, Luw1/d$a;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v17

    invoke-virtual {v0}, Luw1/d$a;->h()Z

    move-result v20

    invoke-virtual {v0}, Luw1/d$a;->j()Lj11/p;

    move-result-object v21

    invoke-virtual {v0}, Luw1/d$a;->k()Z

    move-result v12

    invoke-virtual {v6, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_6

    if-ne v4, v8, :cond_7

    :cond_6
    new-instance v4, Lyw1/n;

    const/4 v3, 0x0

    invoke-direct {v4, v2, v1, v3}, Lyw1/n;-><init>(Luw1/d;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v6, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object/from16 v30, v4

    check-cast v30, Lc93/a;

    invoke-virtual {v6, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_8

    if-ne v4, v8, :cond_9

    :cond_8
    new-instance v4, Lyw1/n;

    const/4 v3, 0x1

    invoke-direct {v4, v2, v1, v3}, Lyw1/n;-><init>(Luw1/d;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v6, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object/from16 v32, v4

    check-cast v32, Lc93/a;

    new-instance v1, Lw20/q;

    const/16 v2, 0x14

    invoke-direct {v1, v0, v2}, Lw20/q;-><init>(Ljava/lang/Object;I)V

    const v0, 0x38abdd49

    invoke-static {v0, v6, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v35

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v1, v0, 0x3

    or-int/lit16 v1, v1, 0x180

    shl-int/lit8 v2, v0, 0x9

    or-int/2addr v1, v2

    shl-int/lit8 v0, v0, 0x1b

    or-int v37, v1, v0

    const/high16 v39, 0xc00000

    const v40, 0x6bfcdc1

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v38, 0x0

    move-object/from16 v36, v6

    invoke-static/range {v8 .. v40}, Lj11/n;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLy81/e;Lg1/u0;Lf0/t;Lf0/t;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lj11/o;ZILjava/lang/Integer;Ll3/g;Ljava/lang/Integer;ZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v0, v36

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    return-object v5

    :cond_a
    move-object v0, v6

    const v1, 0x7fc66157

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    return-object v5

    :cond_b
    move-object v0, v6

    invoke-virtual {v0}, Lp1/q;->X()V

    return-object v5
.end method

.method private static final k(Luw1/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Luw1/d;->b()Luw1/d$a;

    move-result-object p0

    invoke-virtual {p0}, Luw1/d$a;->c()Lww1/c;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Luw1/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Luw1/d;->b()Luw1/d$a;

    move-result-object p0

    invoke-virtual {p0}, Luw1/d$a;->a()Lww1/c;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Luw1/d$a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 3

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Luw1/d$a;->b()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0}, Luw1/d$a;->d()Lkd1/o;

    move-result-object p0

    sget v0, Lkd1/o;->a:I

    shl-int/lit8 v0, v0, 0x3

    invoke-static {p2, p0, p1, v0}, Lyw1/o;->g(Ljava/lang/String;Lkd1/o;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Luw1/d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lyw1/o;->i(Luw1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
