.class public abstract Lnz0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001aK\u0010\r\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lnz0/b;",
        "information",
        "Lcom/whoop/design/util/TextResource;",
        "labelText",
        "Li2/x;",
        "color",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "action",
        "",
        "allowClick",
        "e",
        "(Landroidx/compose/ui/Modifier;Lnz0/b;Lcom/whoop/design/util/TextResource;JLc93/a;ZLandroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lnz0/b;Lcom/whoop/design/util/TextResource;JLc93/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Lnz0/c;->i(Landroidx/compose/ui/Modifier;Lnz0/b;Lcom/whoop/design/util/TextResource;JLc93/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;Z)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lnz0/c;->g(ZLc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lnz0/c;->f()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lc93/a;Z)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lnz0/c;->h(ZLc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lnz0/b;Lcom/whoop/design/util/TextResource;JLc93/a;ZLandroidx/compose/runtime/Composer;II)V
    .locals 39
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lnz0/b;",
            "Lcom/whoop/design/util/TextResource;",
            "J",
            "Lc93/a;",
            "Z",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v8, p8

    const-string v0, "information"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "labelText"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p7

    check-cast v14, Lp1/q;

    const v0, -0x149abf4e

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v4, v8, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v8, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v14, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v8

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v8

    :goto_1
    and-int/lit8 v6, v8, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit16 v6, v8, 0x180

    if-nez v6, :cond_6

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_3

    :cond_5
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_6
    and-int/lit16 v6, v8, 0xc00

    move-wide/from16 v11, p3

    if-nez v6, :cond_8

    invoke-virtual {v14, v11, v12}, Lp1/q;->f(J)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x800

    goto :goto_4

    :cond_7
    const/16 v6, 0x400

    :goto_4
    or-int/2addr v5, v6

    :cond_8
    and-int/lit8 v6, p9, 0x10

    if-eqz v6, :cond_a

    or-int/lit16 v5, v5, 0x6000

    :cond_9
    move-object/from16 v9, p5

    goto :goto_6

    :cond_a
    and-int/lit16 v9, v8, 0x6000

    if-nez v9, :cond_9

    move-object/from16 v9, p5

    invoke-virtual {v14, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    const/16 v10, 0x4000

    goto :goto_5

    :cond_b
    const/16 v10, 0x2000

    :goto_5
    or-int/2addr v5, v10

    :goto_6
    and-int/lit8 v10, p9, 0x20

    const/high16 v13, 0x30000

    if-eqz v10, :cond_d

    or-int/2addr v5, v13

    :cond_c
    move/from16 v13, p6

    goto :goto_8

    :cond_d
    and-int/2addr v13, v8

    if-nez v13, :cond_c

    move/from16 v13, p6

    invoke-virtual {v14, v13}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_e

    const/high16 v16, 0x20000

    goto :goto_7

    :cond_e
    const/high16 v16, 0x10000

    :goto_7
    or-int v5, v5, v16

    :goto_8
    const v16, 0x12493

    and-int v1, v5, v16

    const v7, 0x12492

    move/from16 v16, v10

    if-eq v1, v7, :cond_f

    const/4 v1, 0x1

    goto :goto_9

    :cond_f
    const/4 v1, 0x0

    :goto_9
    and-int/lit8 v7, v5, 0x1

    invoke-virtual {v14, v7, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_22

    sget-object v1, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_10

    move-object v4, v1

    :cond_10
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_12

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_11

    new-instance v6, Lnx1/a;

    const/4 v7, 0x1

    invoke-direct {v6, v7}, Lnx1/a;-><init>(I)V

    invoke-virtual {v14, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v6, Lc93/a;

    goto :goto_a

    :cond_12
    move-object v6, v9

    :goto_a
    if-eqz v16, :cond_13

    const/4 v7, 0x1

    goto :goto_b

    :cond_13
    move/from16 v7, p6

    :goto_b
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v0, :cond_14

    invoke-static {v14}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v9

    :cond_14
    move-object/from16 v17, v9

    check-cast v17, Lj0/i;

    shr-int/lit8 v9, v5, 0x6

    and-int/lit8 v13, v9, 0xe

    invoke-static {v3, v14, v13}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    new-instance v15, Ljava/lang/StringBuilder;

    const-string v2, "Sleep_Information_"

    invoke-direct {v15, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    sget-object v2, Landroidx/compose/foundation/d;->a:Lp1/b0;

    invoke-virtual {v14, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v18, v2

    check-cast v18, Lf0/v0;

    const/high16 v2, 0x70000

    and-int/2addr v2, v5

    const/high16 v10, 0x20000

    if-ne v2, v10, :cond_15

    const/4 v15, 0x1

    goto :goto_c

    :cond_15
    const/4 v15, 0x0

    :goto_c
    const v35, 0xe000

    and-int v10, v5, v35

    const/16 v8, 0x4000

    if-ne v10, v8, :cond_16

    const/4 v8, 0x1

    goto :goto_d

    :cond_16
    const/4 v8, 0x0

    :goto_d
    or-int/2addr v8, v15

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v8, :cond_17

    if-ne v15, v0, :cond_18

    :cond_17
    new-instance v15, Ldn0/c;

    const/4 v8, 0x2

    invoke-direct {v15, v8, v6, v7}, Ldn0/c;-><init>(ILc93/a;Z)V

    invoke-virtual {v14, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    move-object/from16 v21, v15

    check-cast v21, Lc93/a;

    const/16 v22, 0x1c

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-interface {v8, v4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v15, Lb2/e;->N:Lb2/k;

    move-object/from16 p0, v4

    sget-object v4, Ll0/m;->c:Ll0/g;

    move/from16 p5, v10

    const/16 v10, 0x30

    invoke-static {v4, v15, v14, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v10, v14, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v14, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v15, v14, Lp1/q;->S:Z

    if-eqz v15, :cond_19

    invoke-virtual {v14, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_19
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_e
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v14, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v14, v4, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v11, v14, Lp1/q;->S:Z

    if-nez v11, :cond_1a

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1b

    :cond_1a
    invoke-static {v10, v14, v10, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v14, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lnz0/b;->a()Lnz0/a;

    move-result-object v4

    instance-of v8, v4, Lnz0/a$b;

    const/4 v10, 0x6

    if-eqz v8, :cond_1c

    const v4, 0x75d4ae32

    invoke-virtual {v14, v4}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lnz0/b;->a()Lnz0/a;

    move-result-object v4

    check-cast v4, Lnz0/a$b;

    invoke-virtual {v4}, Lnz0/a$b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const/4 v8, 0x0

    invoke-static {v4, v14, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v11, Lx81/d;->a:Lx81/d;

    invoke-virtual {v11, v14, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->x()Lb91/a;

    move-result-object v29

    shr-int/lit8 v10, v5, 0x3

    and-int/lit16 v10, v10, 0x380

    const/16 v33, 0x0

    const v34, 0x2fffa

    move/from16 v32, v10

    const/4 v10, 0x0

    move v11, v13

    move-object/from16 v31, v14

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/4 v12, 0x1

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/high16 v26, 0x20000

    const/16 v25, 0x0

    move/from16 v27, v26

    const/16 v26, 0x0

    move/from16 v28, v27

    const/16 v27, 0x0

    move/from16 v30, v28

    const/16 v28, 0x0

    move/from16 v36, v30

    const/16 v30, 0x0

    move/from16 v36, v7

    move/from16 v7, p5

    move/from16 p5, v36

    move/from16 v36, v9

    move-object v9, v4

    move/from16 v4, v36

    move-object/from16 v37, v0

    move-object/from16 v36, v6

    move v6, v11

    move v0, v12

    const/16 v38, 0x30

    move-wide/from16 v11, p3

    invoke-static/range {v9 .. v34}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v31

    invoke-virtual {v14, v8}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_1c
    move v8, v7

    move/from16 v7, p5

    move/from16 p5, v8

    move-object/from16 v37, v0

    move-object/from16 v36, v6

    move v6, v13

    const/4 v0, 0x1

    const/4 v8, 0x0

    const/16 v38, 0x30

    instance-of v4, v4, Lnz0/a$a;

    if-eqz v4, :cond_21

    const v4, 0x75d86fae

    invoke-virtual {v14, v4}, Lp1/q;->e0(I)V

    const/16 v4, 0xa

    int-to-float v4, v4

    const/4 v11, 0x4

    int-to-float v12, v11

    mul-float/2addr v4, v12

    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lnz0/b;->a()Lnz0/a;

    move-result-object v4

    check-cast v4, Lnz0/a$a;

    invoke-virtual {v4}, Lnz0/a$a;->a()Ly71/g;

    move-result-object v4

    invoke-virtual {v4}, Ly71/g;->b()I

    move-result v4

    invoke-static {v4, v14, v10}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lnz0/b;->a()Lnz0/a;

    move-result-object v10

    check-cast v10, Lnz0/a$a;

    invoke-virtual {v10}, Lnz0/a$a;->a()Ly71/g;

    move-result-object v10

    invoke-virtual {v10}, Ly71/g;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-static {v10, v14, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    and-int/lit16 v12, v5, 0x1c00

    or-int/lit16 v15, v12, 0x180

    const/16 v16, 0x0

    move v12, v9

    move-object v9, v4

    move v4, v12

    move-wide/from16 v12, p3

    invoke-static/range {v9 .. v16}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v8}, Lp1/q;->q(Z)V

    :goto_f
    int-to-float v9, v0

    const/4 v11, 0x4

    int-to-float v10, v11

    invoke-static {v9, v10, v1, v14}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    sget-object v10, Lny0/v;->TextSmall:Lny0/v;

    invoke-static {v3, v14, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    const/high16 v1, 0x20000

    if-ne v2, v1, :cond_1d

    move v1, v0

    :goto_10
    const/16 v2, 0x4000

    goto :goto_11

    :cond_1d
    move v1, v8

    goto :goto_10

    :goto_11
    if-ne v7, v2, :cond_1e

    move v8, v0

    :cond_1e
    or-int/2addr v1, v8

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_20

    move-object/from16 v1, v37

    if-ne v2, v1, :cond_1f

    goto :goto_12

    :cond_1f
    move/from16 v12, p5

    move-object/from16 v6, v36

    goto :goto_13

    :cond_20
    :goto_12
    new-instance v2, Ldn0/c;

    const/4 v1, 0x3

    move/from16 v12, p5

    move-object/from16 v6, v36

    invoke-direct {v2, v1, v6, v12}, Ldn0/c;-><init>(ILc93/a;Z)V

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_13
    move-object/from16 v17, v2

    check-cast v17, Lc93/a;

    and-int/lit16 v1, v4, 0x1c00

    or-int/lit8 v1, v1, 0x30

    shl-int/lit8 v2, v5, 0x3

    and-int v2, v2, v35

    or-int v19, v1, v2

    const/16 v20, 0x61

    const/4 v9, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v18, v14

    move-wide/from16 v13, p3

    invoke-static/range {v9 .. v20}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v14, v18

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    move-object/from16 v1, p0

    move v7, v12

    goto :goto_14

    :cond_21
    const v0, -0x1d3b3e10

    invoke-static {v0, v14, v8}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_22
    invoke-virtual {v14}, Lp1/q;->X()V

    move/from16 v7, p6

    move-object v1, v4

    move-object v6, v9

    :goto_14
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_23

    new-instance v0, Lb21/b;

    move-object/from16 v2, p1

    move-wide/from16 v4, p3

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lb21/b;-><init>(Landroidx/compose/ui/Modifier;Lnz0/b;Lcom/whoop/design/util/TextResource;JLc93/a;ZII)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_23
    return-void
.end method

.method private static final f()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(ZLc93/a;)Ll83/a0;
    .locals 0

    if-eqz p0, :cond_0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(ZLc93/a;)Ll83/a0;
    .locals 0

    if-eqz p0, :cond_0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Lnz0/b;Lcom/whoop/design/util/TextResource;JLc93/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v10, p8

    move-object/from16 v8, p9

    invoke-static/range {v1 .. v10}, Lnz0/c;->e(Landroidx/compose/ui/Modifier;Lnz0/b;Lcom/whoop/design/util/TextResource;JLc93/a;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
