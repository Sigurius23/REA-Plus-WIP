.class public abstract Le61/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a=\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "verticalOffset",
        "",
        "icon",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "subtitle",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/ui/Modifier;FILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;FILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Le61/d;->c(Landroidx/compose/ui/Modifier;FILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;FILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;II)V
    .locals 36

    move/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v6, p6

    const-string v0, "title"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v0, 0x79eafad

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p7, 0x1

    const/4 v1, 0x4

    const/4 v2, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v5, v6, 0x6

    move v7, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v6, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v12, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v1

    goto :goto_0

    :cond_1
    move v7, v2

    :goto_0
    or-int/2addr v7, v6

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v7, v6

    :goto_1
    and-int/lit8 v8, p7, 0x2

    if-eqz v8, :cond_4

    or-int/lit8 v7, v7, 0x30

    :cond_3
    move/from16 v9, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v9, v6, 0x30

    if-nez v9, :cond_3

    move/from16 v9, p1

    invoke-virtual {v12, v9}, Lp1/q;->d(F)Z

    move-result v10

    if-eqz v10, :cond_5

    const/16 v10, 0x20

    goto :goto_2

    :cond_5
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v7, v10

    :goto_3
    and-int/lit16 v10, v6, 0x180

    if-nez v10, :cond_7

    invoke-virtual {v12, v3}, Lp1/q;->e(I)Z

    move-result v10

    if-eqz v10, :cond_6

    const/16 v10, 0x100

    goto :goto_4

    :cond_6
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v7, v10

    :cond_7
    and-int/lit16 v10, v6, 0xc00

    if-nez v10, :cond_9

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x800

    goto :goto_5

    :cond_8
    const/16 v10, 0x400

    :goto_5
    or-int/2addr v7, v10

    :cond_9
    and-int/lit16 v10, v6, 0x6000

    if-nez v10, :cond_c

    and-int/lit8 v10, p7, 0x10

    if-nez v10, :cond_a

    move-object/from16 v10, p4

    invoke-virtual {v12, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x4000

    goto :goto_6

    :cond_a
    move-object/from16 v10, p4

    :cond_b
    const/16 v11, 0x2000

    :goto_6
    or-int/2addr v7, v11

    goto :goto_7

    :cond_c
    move-object/from16 v10, p4

    :goto_7
    and-int/lit16 v11, v7, 0x2493

    const/16 v13, 0x2492

    if-eq v11, v13, :cond_d

    const/4 v11, 0x1

    goto :goto_8

    :cond_d
    const/4 v11, 0x0

    :goto_8
    and-int/lit8 v13, v7, 0x1

    invoke-virtual {v12, v13, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_16

    invoke-virtual {v12}, Lp1/q;->Z()V

    and-int/lit8 v11, v6, 0x1

    sget-object v13, Lb2/t;->w:Lb2/t;

    const v14, -0xe001

    if-eqz v11, :cond_10

    invoke-virtual {v12}, Lp1/q;->C()Z

    move-result v11

    if-eqz v11, :cond_e

    goto :goto_a

    :cond_e
    invoke-virtual {v12}, Lp1/q;->X()V

    and-int/lit8 v0, p7, 0x10

    if-eqz v0, :cond_f

    and-int/2addr v7, v14

    :cond_f
    :goto_9
    move/from16 v33, v7

    move v0, v9

    goto :goto_b

    :cond_10
    :goto_a
    if-eqz v0, :cond_11

    move-object v5, v13

    :cond_11
    if-eqz v8, :cond_12

    const/4 v0, 0x0

    move v9, v0

    :cond_12
    and-int/lit8 v0, p7, 0x10

    if-eqz v0, :cond_f

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    and-int/2addr v7, v14

    move-object v10, v0

    goto :goto_9

    :goto_b
    invoke-virtual {v12}, Lp1/q;->r()V

    const/high16 v7, 0x3f000000    # 0.5f

    add-float v8, v0, v7

    sget-object v9, Lp91/a;->e:Lp91/a$a;

    invoke-virtual {v9}, Lp91/a$a;->a()Lp91/a;

    move-result-object v9

    invoke-static {v13, v7, v8, v9}, Lp91/e;->j(Landroidx/compose/ui/Modifier;FFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x3

    invoke-static {v7, v8, v9}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v8, 0x50

    int-to-float v8, v8

    int-to-float v1, v1

    mul-float/2addr v8, v1

    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-interface {v7, v5}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Lb2/e;->N:Lb2/k;

    sget-object v11, Ll0/m;->e:Ll0/h;

    const/16 v14, 0x36

    invoke-static {v11, v8, v12, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    move-object/from16 p0, v10

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_13

    invoke-virtual {v12, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_13
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_c
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v12, v11, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v12, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-nez v10, :cond_14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_15

    :cond_14
    invoke-static {v9, v12, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v12, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v7, v33, 0x3

    and-int/lit8 v7, v7, 0x70

    const/4 v8, 0x6

    or-int/2addr v7, v8

    invoke-static {v3, v12, v7}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v7

    int-to-float v9, v8

    mul-float/2addr v9, v1

    invoke-static {v9, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, Lx81/d;->a:Lx81/d;

    invoke-virtual {v10, v12, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->b1()J

    move-result-wide v16

    move-object v11, v13

    const/16 v13, 0x1b0

    const/4 v14, 0x0

    move/from16 v18, v8

    const/4 v8, 0x0

    move-object/from16 v34, p0

    move/from16 p0, v0

    move-object v15, v10

    move-object v0, v11

    move-wide/from16 v10, v16

    move/from16 v16, v1

    move/from16 v1, v18

    invoke-static/range {v7 .. v14}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    int-to-float v2, v2

    mul-float v2, v2, v16

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v12, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    shr-int/lit8 v7, v33, 0x9

    and-int/lit8 v7, v7, 0xe

    invoke-static {v4, v12, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v15, v12, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->r()Lb91/a;

    move-result-object v27

    invoke-virtual {v15, v12, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v9

    const/16 v31, 0x0

    const v32, 0x2fffa

    const/4 v8, 0x0

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    move-object/from16 v18, v16

    const-wide/16 v16, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object/from16 v22, v20

    const-wide/16 v20, 0x0

    move-object/from16 v23, v22

    const/16 v22, 0x0

    move-object/from16 v24, v23

    const/16 v23, 0x0

    move-object/from16 v25, v24

    const/16 v24, 0x0

    move-object/from16 v26, v25

    const/16 v25, 0x0

    move-object/from16 v28, v26

    const/16 v26, 0x0

    move-object/from16 v30, v28

    const/16 v28, 0x0

    move-object/from16 v35, v30

    const/16 v30, 0x0

    move-object/from16 v3, v35

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v12, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    shr-int/lit8 v0, v33, 0xc

    and-int/lit8 v0, v0, 0xe

    move-object/from16 v2, v34

    invoke-static {v2, v12, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3, v12, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v27

    invoke-virtual {v3, v12, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b1()J

    move-result-wide v9

    new-instance v0, Lw3/k;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lw3/k;-><init>(I)V

    const v32, 0x2fdfa

    const-wide/16 v11, 0x0

    move-object/from16 v19, v0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    const/4 v0, 0x1

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    move-object v1, v5

    move-object v5, v2

    move/from16 v2, p0

    goto :goto_d

    :cond_16
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v1, v5

    move v2, v9

    move-object v5, v10

    :goto_d
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_17

    new-instance v0, Le61/c;

    move/from16 v3, p2

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Le61/c;-><init>(Landroidx/compose/ui/Modifier;FILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;FILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Le61/d;->b(Landroidx/compose/ui/Modifier;FILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
