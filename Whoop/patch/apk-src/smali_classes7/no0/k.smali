.class public abstract Lno0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a!\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Llo0/e;",
        "state",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "e",
        "(Llo0/e;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "Llo0/c;",
        "date",
        "c",
        "(Llo0/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "clinician-in-the-loop_release"
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
.method public static synthetic a(Llo0/e;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lno0/k;->f(Llo0/e;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llo0/c;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lno0/k;->d(Llo0/c;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llo0/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 32

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v2, -0x2f35bda0

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    and-int/lit8 v2, p3, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_1

    :cond_1
    const/4 v2, 0x2

    :goto_1
    or-int v2, p3, v2

    goto :goto_2

    :cond_2
    move/from16 v2, p3

    :goto_2
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x20

    goto :goto_3

    :cond_5
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v2, v5

    :goto_4
    and-int/lit8 v5, v2, 0x13

    const/4 v6, 0x0

    const/16 v7, 0x12

    const/4 v8, 0x1

    if-eq v5, v7, :cond_6

    move v5, v8

    goto :goto_5

    :cond_6
    move v5, v6

    :goto_5
    and-int/2addr v2, v8

    invoke-virtual {v0, v2, v5}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_e

    sget-object v2, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_7

    move-object v3, v2

    goto :goto_6

    :cond_7
    move-object v3, v4

    :goto_6
    const/16 v4, 0x48

    int-to-float v4, v4

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v5, 0x8

    int-to-float v5, v5

    invoke-static {v5}, Lt0/j;->e(F)Lt0/i;

    move-result-object v5

    invoke-static {v4, v5}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v5, v0, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->W0()J

    move-result-wide v10

    sget-object v12, Li2/w0;->a:Li2/v0;

    invoke-static {v4, v10, v11, v12}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v10, Lb2/e;->E:Lb2/m;

    invoke-static {v10, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v10, v0, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v0, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-eqz v13, :cond_8

    invoke-virtual {v0, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_8
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_7
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v0, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v0, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v14, v0, Lp1/q;->S:Z

    if-nez v14, :cond_9

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_a

    :cond_9
    invoke-static {v10, v0, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v0, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, Lb2/e;->N:Lb2/k;

    sget-object v14, Ll0/m;->e:Ll0/h;

    const/16 v15, 0x36

    invoke-static {v14, v4, v0, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v14, v0, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v0}, Lp1/q;->i0()V

    move/from16 p2, v7

    iget-boolean v7, v0, Lp1/q;->S:Z

    if-eqz v7, :cond_b

    invoke-virtual {v0, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v0, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v6, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v0, Lp1/q;->S:Z

    if-nez v4, :cond_c

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    :cond_c
    invoke-static {v14, v0, v14, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v0, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Llo0/c;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v0, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v0, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->b()Lb91/a;

    move-result-object v22

    invoke-virtual {v5, v0, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->c1()J

    move-result-wide v6

    sget v10, Lb91/a;->d:I

    shl-int/lit8 v26, v10, 0x12

    const v27, 0x2fffa

    move-object v10, v3

    const/4 v3, 0x0

    move v12, v4

    move-object v11, v5

    move-wide v4, v6

    const-wide/16 v6, 0x0

    move v13, v8

    const/4 v8, 0x0

    move v14, v9

    const/4 v9, 0x0

    move-object v15, v10

    const/4 v10, 0x0

    move-object/from16 v16, v11

    move/from16 v17, v12

    const-wide/16 v11, 0x0

    move/from16 v18, v13

    const/4 v13, 0x0

    move/from16 v19, v14

    const/4 v14, 0x0

    move-object/from16 v20, v15

    move-object/from16 v21, v16

    const-wide/16 v15, 0x0

    move/from16 v23, v17

    const/16 v17, 0x0

    move/from16 v24, v18

    const/16 v18, 0x0

    move/from16 v25, v19

    const/16 v19, 0x0

    move-object/from16 v28, v20

    const/16 v20, 0x0

    move-object/from16 v29, v21

    const/16 v21, 0x0

    move/from16 v30, v23

    const/16 v23, 0x0

    move/from16 v31, v25

    const/16 v25, 0x0

    move-object/from16 v24, v0

    move/from16 v0, v30

    move/from16 v1, v31

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual/range {p0 .. p0}, Llo0/c;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v2, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v11, v29

    invoke-virtual {v11, v2, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->z()Lb91/a;

    move-result-object v22

    invoke-virtual {v11, v2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v4

    const/4 v3, 0x0

    const-wide/16 v11, 0x0

    move-object v2, v0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    const/4 v13, 0x1

    invoke-virtual {v2, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v2, v13}, Lp1/q;->q(Z)V

    move-object/from16 v3, v28

    goto :goto_9

    :cond_e
    move-object v2, v0

    invoke-virtual {v2}, Lp1/q;->X()V

    move-object v3, v4

    :goto_9
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_f

    new-instance v0, Llq2/c;

    const/16 v5, 0x17

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Llq2/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final d(Llo0/c;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lno0/k;->c(Llo0/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final e(Llo0/e;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 29

    move-object/from16 v1, p0

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    const v0, 0x59760e7c

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x2

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    or-int v0, p3, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p3

    :goto_2
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v5, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_3

    :cond_5
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v0, v6

    :goto_4
    and-int/lit8 v6, v0, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x1

    if-eq v6, v8, :cond_6

    move v6, v9

    goto :goto_5

    :cond_6
    const/4 v6, 0x0

    :goto_5
    and-int/2addr v0, v9

    invoke-virtual {v5, v0, v6}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_10

    if-eqz v3, :cond_7

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_6

    :cond_7
    move-object v0, v4

    :goto_6
    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v6, 0x8

    int-to-float v6, v6

    const/4 v10, 0x0

    invoke-static {v4, v10, v6, v9}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v10, Lb2/e;->K:Lb2/l;

    const/16 v11, 0xc

    int-to-float v11, v11

    invoke-static {v11}, Ll0/m;->i(F)Ll0/k;

    move-result-object v11

    const/16 v12, 0x36

    invoke-static {v11, v10, v5, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v10

    iget-wide v11, v5, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v5, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v14, v5, Lp1/q;->S:Z

    if-eqz v14, :cond_8

    invoke-virtual {v5, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_8
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_7
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v5, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v5, v10, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v15, v5, Lp1/q;->S:Z

    if-nez v15, :cond_9

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v15, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    :cond_9
    invoke-static {v11, v5, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v5, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Llo0/e;->b()Llo0/c;

    move-result-object v4

    sget v11, Lcom/whoop/design/util/TextResource;->$stable:I

    const/4 v15, 0x0

    invoke-static {v4, v15, v5, v11, v2}, Lno0/k;->c(Llo0/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move v15, v8

    float-to-double v8, v3

    const-wide/16 v17, 0x0

    cmpl-double v2, v8, v17

    if-lez v2, :cond_b

    const/4 v2, 0x1

    goto :goto_8

    :cond_b
    const/4 v2, 0x0

    :goto_8
    if-nez v2, :cond_c

    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_c
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v8, 0x1

    invoke-direct {v2, v3, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v6, 0x6

    invoke-static {v3, v4, v5, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v8, v5, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v8, v5, Lp1/q;->S:Z

    if-eqz v8, :cond_d

    invoke-virtual {v5, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_d
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v5, v14, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v5, Lp1/q;->S:Z

    if-nez v3, :cond_e

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    :cond_e
    invoke-static {v4, v5, v4, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v5, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Llo0/e;->a()Lhy0/h1;

    move-result-object v2

    sget v6, Lhy0/h1;->w:I

    const/4 v7, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lhy0/g1;->h(Lhy0/h1;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v1}, Llo0/e;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v5, v11}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v5, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    invoke-virtual {v3, v5, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v3

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v26, v6, 0x12

    const v27, 0x2fffa

    move-object/from16 v24, v5

    move-wide v4, v3

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x1

    const-wide/16 v15, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v25, v23

    const/16 v23, 0x0

    move/from16 v28, v25

    const/16 v25, 0x0

    move-object/from16 p1, v0

    move/from16 v0, v28

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    move-object/from16 v3, p1

    goto :goto_a

    :cond_10
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v3, v4

    :goto_a
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_11

    new-instance v0, Llq2/c;

    const/16 v5, 0x16

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Llq2/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final f(Llo0/e;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lno0/k;->e(Llo0/e;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
