.class public abstract Lc41/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u001aG\u0010\u000b\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000fH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0012H\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0015H\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0018H\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u001a\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u001bH\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001d\u001a!\u0010!\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\u0008\u0008\u0002\u0010 \u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008!\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lc41/u0;",
        "type",
        "Li2/x;",
        "background",
        "Lf0/t;",
        "border",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "p",
        "(Landroidx/compose/ui/Modifier;Lc41/u0;JLf0/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "l",
        "(Lc41/u0;Landroidx/compose/runtime/Composer;I)V",
        "Lc41/u0$b;",
        "w",
        "(Lc41/u0$b;Landroidx/compose/runtime/Composer;I)V",
        "Lc41/u0$c;",
        "y",
        "(Lc41/u0$c;Landroidx/compose/runtime/Composer;I)V",
        "Lc41/u0$d;",
        "A",
        "(Lc41/u0$d;Landroidx/compose/runtime/Composer;I)V",
        "Lc41/u0$e;",
        "C",
        "(Lc41/u0$e;Landroidx/compose/runtime/Composer;I)V",
        "Lc41/u0$a;",
        "u",
        "(Lc41/u0$a;Landroidx/compose/runtime/Composer;I)V",
        "",
        "icon",
        "iconTint",
        "n",
        "(IJLandroidx/compose/runtime/Composer;II)V",
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
.method private static final A(Lc41/u0$d;Landroidx/compose/runtime/Composer;I)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v5, p1

    check-cast v5, Lp1/q;

    const v2, -0x52ab8b51

    invoke-virtual {v5, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v6, v2, 0x3

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v6, v4, :cond_2

    move v4, v9

    goto :goto_2

    :cond_2
    move v4, v8

    :goto_2
    and-int/2addr v2, v9

    invoke-virtual {v5, v2, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_a

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    double-to-float v4, v6

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v4, v6

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Lb2/e;->K:Lb2/l;

    const/4 v6, 0x3

    int-to-float v6, v6

    int-to-float v3, v3

    const/16 v7, 0x36

    invoke-static {v6, v3, v4, v5, v7}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v3

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-eqz v7, :cond_3

    invoke-virtual {v5, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_3
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v5, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v5, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v3, v5, Lp1/q;->S:Z

    if-nez v3, :cond_4

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    :cond_4
    invoke-static {v4, v5, v4, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v15, La3/k;->d:La3/i;

    invoke-static {v5, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lc41/u0$d;->b()I

    move-result v2

    const/4 v6, 0x0

    const/4 v7, 0x2

    const-wide/16 v3, 0x0

    invoke-static/range {v2 .. v7}, Lc41/q0;->n(IJLandroidx/compose/runtime/Composer;II)V

    float-to-double v2, v10

    const-wide/16 v6, 0x0

    cmpl-double v2, v2, v6

    if-lez v2, :cond_6

    goto :goto_4

    :cond_6
    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_4
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v2, v10, v9}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v4, v5, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-eqz v7, :cond_7

    invoke-virtual {v5, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v5, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v5, Lp1/q;->S:Z

    if-nez v3, :cond_8

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    :cond_8
    invoke-static {v4, v5, v4, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    invoke-static {v5, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lc41/u0$d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v5, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v4, 0x6

    invoke-virtual {v3, v5, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v6

    invoke-virtual {v3, v5, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->s()Lb91/a;

    move-result-object v22

    const/16 v26, 0x0

    const v27, 0x2fffa

    move-object v10, v3

    const/4 v3, 0x0

    move v11, v4

    move-object/from16 v24, v5

    move-wide v4, v6

    const-wide/16 v6, 0x0

    move v12, v8

    const/4 v8, 0x0

    move v13, v9

    const/4 v9, 0x0

    move-object v14, v10

    const/4 v10, 0x0

    move/from16 v16, v11

    move v15, v12

    const-wide/16 v11, 0x0

    move/from16 v17, v13

    const/4 v13, 0x0

    move-object/from16 v18, v14

    const/4 v14, 0x0

    move/from16 v19, v15

    move/from16 v20, v16

    const-wide/16 v15, 0x0

    move/from16 v21, v17

    const/16 v17, 0x0

    move-object/from16 v23, v18

    const/16 v18, 0x0

    move/from16 v25, v19

    const/16 v19, 0x0

    move/from16 v28, v20

    const/16 v20, 0x0

    move/from16 v29, v21

    const/16 v21, 0x0

    move-object/from16 v30, v23

    const/16 v23, 0x0

    move/from16 v31, v25

    const/16 v25, 0x0

    move-object/from16 v0, v30

    move/from16 v1, v31

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    invoke-virtual/range {p0 .. p0}, Lc41/u0$d;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v5, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    const/4 v11, 0x6

    invoke-virtual {v0, v5, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v3

    invoke-virtual {v0, v5, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->d()Lb91/a;

    move-result-object v22

    move-wide v4, v3

    const/4 v3, 0x0

    const-wide/16 v11, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    const/4 v13, 0x1

    invoke-virtual {v5, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v13}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_a
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_b

    new-instance v1, La41/i;

    const/16 v2, 0x12

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, La41/i;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final B(Lc41/u0$d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lc41/q0;->A(Lc41/u0$d;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lc41/u0$e;Landroidx/compose/runtime/Composer;I)V
    .locals 55

    move-object/from16 v0, p0

    move-object/from16 v5, p1

    check-cast v5, Lp1/q;

    const v2, 0x3b272ced

    invoke-virtual {v5, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v4, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v6, v2, 0x3

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eq v6, v4, :cond_2

    move v6, v8

    goto :goto_2

    :cond_2
    move v6, v9

    :goto_2
    and-int/2addr v2, v8

    invoke-virtual {v5, v2, v6}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_17

    const/high16 v10, 0x3f800000    # 1.0f

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    double-to-float v6, v6

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v6, v7

    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v12, Lb2/e;->K:Lb2/l;

    sget-object v6, Ll0/m;->g:Ll0/h;

    const/16 v13, 0x36

    invoke-static {v6, v12, v5, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v14, v5, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v8, v5, Lp1/q;->S:Z

    if-eqz v8, :cond_3

    invoke-virtual {v5, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_3
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v5, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v5, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v13, v5, Lp1/q;->S:Z

    if-nez v13, :cond_4

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v13, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    :cond_4
    invoke-static {v7, v5, v7, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v13, La3/k;->d:La3/i;

    invoke-static {v5, v13, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v2, v10

    const-wide/16 v28, 0x0

    cmpl-double v2, v2, v28

    const-string v30, "invalid weight; must be greater than zero"

    if-lez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-static/range {v30 .. v30}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_4
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v31, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v3, v10, v31

    if-lez v3, :cond_7

    move/from16 v3, v31

    goto :goto_5

    :cond_7
    move v3, v10

    :goto_5
    invoke-direct {v2, v3, v9}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    int-to-float v3, v4

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float v32, v3, v4

    invoke-static/range {v32 .. v32}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    const/16 v7, 0x36

    invoke-static {v3, v12, v5, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    move-object/from16 v17, v11

    iget-wide v10, v5, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-eqz v7, :cond_8

    invoke-virtual {v5, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v5, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v5, Lp1/q;->S:Z

    if-nez v3, :cond_9

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    :cond_9
    invoke-static {v10, v5, v10, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    invoke-static {v5, v13, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lc41/u0$e;->c()I

    move-result v2

    move-object v3, v6

    const/4 v6, 0x0

    const/4 v7, 0x2

    move-object v10, v3

    move v11, v4

    const-wide/16 v3, 0x0

    move/from16 v33, v11

    const/16 v18, 0x36

    invoke-static/range {v2 .. v7}, Lc41/q0;->n(IJLandroidx/compose/runtime/Composer;II)V

    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v3, Lb2/e;->M:Lb2/k;

    invoke-static {v2, v3, v5, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v3, v5, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    move-object/from16 v6, v17

    invoke-static {v5, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v11, v5, Lp1/q;->S:Z

    if-eqz v11, :cond_b

    invoke-virtual {v5, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v5, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v5, Lp1/q;->S:Z

    if-nez v2, :cond_c

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    :cond_c
    invoke-static {v3, v5, v3, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v5, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lc41/u0$e;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v5, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v4, 0x6

    invoke-virtual {v3, v5, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->s()Lb91/a;

    move-result-object v22

    invoke-virtual {v0}, Lc41/u0$e;->e()Ly81/f;

    move-result-object v7

    invoke-virtual {v7, v5, v9}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v19

    const/16 v26, 0x0

    const v27, 0x2fffa

    move-object v7, v3

    const/4 v3, 0x0

    move-object/from16 v17, v6

    move-object v11, v7

    const-wide/16 v6, 0x0

    move-object/from16 v21, v8

    const/4 v8, 0x0

    move/from16 v23, v9

    const/4 v9, 0x0

    move-object/from16 v24, v10

    const/4 v10, 0x0

    move-object/from16 v34, v11

    move-object/from16 v25, v12

    const-wide/16 v11, 0x0

    move-object/from16 v35, v13

    const/4 v13, 0x0

    move-object/from16 v36, v14

    const/4 v14, 0x0

    move-object/from16 v37, v15

    const/high16 v38, 0x3f800000    # 1.0f

    const-wide/16 v15, 0x0

    move-object/from16 v39, v17

    const/16 v17, 0x0

    move/from16 v40, v18

    const/16 v18, 0x0

    move/from16 v41, v4

    move-object/from16 v54, v24

    move-object/from16 v24, v5

    move-wide/from16 v4, v19

    move-object/from16 v20, v54

    const/16 v19, 0x0

    move-object/from16 v42, v20

    const/16 v20, 0x0

    move-object/from16 v43, v21

    const/16 v21, 0x0

    move/from16 v44, v23

    const/16 v23, 0x0

    move-object/from16 v45, v25

    const/16 v25, 0x0

    move-object/from16 v0, v34

    move-object/from16 v51, v35

    move-object/from16 v50, v36

    move-object/from16 v47, v37

    move-object/from16 v53, v39

    move-object/from16 v49, v42

    move-object/from16 v48, v43

    move/from16 v1, v44

    move-object/from16 v46, v45

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    invoke-virtual/range {p0 .. p0}, Lc41/u0$e;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-eqz v2, :cond_e

    const v2, 0x3fb8da07

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lc41/u0$e;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v5, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x6

    invoke-virtual {v0, v5, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->d()Lb91/a;

    move-result-object v22

    invoke-virtual {v0, v5, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->b1()J

    move-result-wide v6

    const/16 v26, 0x0

    const v27, 0x2fffa

    move/from16 v52, v3

    const/4 v3, 0x0

    move-object/from16 v24, v5

    move-wide v4, v6

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    :goto_8
    const/4 v2, 0x1

    goto :goto_9

    :cond_e
    const v2, 0x3fbc1d93

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    goto :goto_8

    :goto_9
    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    sget-object v2, Lb2/e;->F:Lb2/m;

    const/high16 v3, 0x3f800000    # 1.0f

    float-to-double v6, v3

    cmpl-double v4, v6, v28

    if-lez v4, :cond_f

    goto :goto_a

    :cond_f
    invoke-static/range {v30 .. v30}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_a
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v6, v3, v31

    if-lez v6, :cond_10

    move/from16 v10, v31

    :goto_b
    const/4 v3, 0x1

    goto :goto_c

    :cond_10
    move v10, v3

    goto :goto_b

    :goto_c
    invoke-direct {v4, v10, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v2, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-eqz v7, :cond_11

    move-object/from16 v7, v47

    invoke-virtual {v5, v7}, Lp1/q;->l(Lc93/a;)V

    :goto_d
    move-object/from16 v8, v48

    goto :goto_e

    :cond_11
    move-object/from16 v7, v47

    invoke-virtual {v5}, Lp1/q;->s0()V

    goto :goto_d

    :goto_e
    invoke-static {v5, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v10, v49

    invoke-static {v5, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v5, Lp1/q;->S:Z

    if-nez v2, :cond_12

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    :cond_12
    move-object/from16 v2, v50

    goto :goto_10

    :cond_13
    move-object/from16 v2, v50

    :goto_f
    move-object/from16 v3, v51

    goto :goto_11

    :goto_10
    invoke-static {v3, v5, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_f

    :goto_11
    invoke-static {v5, v3, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {v32 .. v32}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    move-object/from16 v6, v46

    const/16 v9, 0x36

    invoke-static {v4, v6, v5, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v11, v5, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    move-object/from16 v11, v53

    invoke-static {v5, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v13, v5, Lp1/q;->S:Z

    if-eqz v13, :cond_14

    invoke-virtual {v5, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_14
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_12
    invoke-static {v5, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v10, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-nez v4, :cond_15

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_16

    :cond_15
    invoke-static {v6, v5, v6, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    invoke-static {v5, v3, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lc41/u0$e;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v5, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    const/4 v1, 0x6

    invoke-virtual {v0, v5, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->k()Lb91/a;

    move-result-object v22

    invoke-virtual {v0, v5, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v3

    new-instance v14, Lw3/k;

    invoke-direct {v14, v1}, Lw3/k;-><init>(I)V

    const/16 v26, 0x0

    const v27, 0x2fdfa

    move-object/from16 v24, v5

    move-wide v4, v3

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v17, v11

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    move-object/from16 v53, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v1, v53

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    mul-float v4, v33, v33

    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/w;->b()I

    move-result v1

    const/4 v3, 0x6

    invoke-static {v1, v5, v3}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    invoke-virtual {v0, v5, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v0

    const/16 v8, 0x1b0

    const/4 v9, 0x0

    const/4 v3, 0x0

    move-object v7, v5

    move-wide v5, v0

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v5, v7

    const/4 v2, 0x1

    invoke-static {v5, v2, v2, v2}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_13

    :cond_17
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_13
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_18

    new-instance v1, La41/i;

    const/16 v2, 0x13

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, La41/i;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final D(Lc41/u0$e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lc41/q0;->C(Lc41/u0$e;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lc41/u0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lc41/q0;->s(Lc41/u0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lc41/q0;->r(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc41/u0$a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lc41/q0;->v(Lc41/u0$a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Ll83/a0;
    .locals 1

    invoke-static {}, Lc41/q0;->q()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Lc41/u0$b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lc41/q0;->x(Lc41/u0$b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lc41/u0$e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lc41/q0;->D(Lc41/u0$e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lc41/u0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lc41/q0;->m(Lc41/u0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lc41/u0$d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lc41/q0;->B(Lc41/u0$d;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroidx/compose/ui/Modifier;Lc41/u0;JLf0/t;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lc41/q0;->t(Landroidx/compose/ui/Modifier;Lc41/u0;JLf0/t;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lc41/u0$c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lc41/q0;->z(Lc41/u0$c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(IJIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lc41/q0;->o(IJIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Lc41/u0;Landroidx/compose/runtime/Composer;I)V
    .locals 4

    check-cast p1, Lp1/q;

    const v0, 0x1ec48571

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p2, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_1

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p2

    goto :goto_1

    :cond_1
    move v0, p2

    :goto_1
    and-int/lit8 v2, v0, 0x3

    const/4 v3, 0x0

    if-eq v2, v1, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    move v1, v3

    :goto_2
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p1, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_8

    instance-of v1, p0, Lc41/u0$b;

    if-eqz v1, :cond_3

    const v1, 0x7fb8f99c

    invoke-virtual {p1, v1}, Lp1/q;->e0(I)V

    move-object v1, p0

    check-cast v1, Lc41/u0$b;

    and-int/lit8 v0, v0, 0xe

    invoke-static {v1, p1, v0}, Lc41/q0;->w(Lc41/u0$b;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_3
    instance-of v1, p0, Lc41/u0$c;

    if-eqz v1, :cond_4

    const v1, 0x7fb9018b

    invoke-virtual {p1, v1}, Lp1/q;->e0(I)V

    move-object v1, p0

    check-cast v1, Lc41/u0$c;

    and-int/lit8 v0, v0, 0xe

    invoke-static {v1, p1, v0}, Lc41/q0;->y(Lc41/u0$c;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_4
    instance-of v1, p0, Lc41/u0$d;

    if-eqz v1, :cond_5

    const v1, 0x7fb90a64

    invoke-virtual {p1, v1}, Lp1/q;->e0(I)V

    move-object v1, p0

    check-cast v1, Lc41/u0$d;

    and-int/lit8 v0, v0, 0xe

    invoke-static {v1, p1, v0}, Lc41/q0;->A(Lc41/u0$d;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_5
    instance-of v1, p0, Lc41/u0$e;

    if-eqz v1, :cond_6

    const v1, 0x7fb911bf

    invoke-virtual {p1, v1}, Lp1/q;->e0(I)V

    move-object v1, p0

    check-cast v1, Lc41/u0$e;

    and-int/lit8 v0, v0, 0xe

    invoke-static {v1, p1, v0}, Lc41/q0;->C(Lc41/u0$e;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_6
    instance-of v1, p0, Lc41/u0$a;

    if-eqz v1, :cond_7

    const v1, 0x7fb9187f

    invoke-virtual {p1, v1}, Lp1/q;->e0(I)V

    move-object v1, p0

    check-cast v1, Lc41/u0$a;

    and-int/lit8 v0, v0, 0xe

    invoke-static {v1, p1, v0}, Lc41/q0;->u(Lc41/u0$a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_7
    const p0, 0x7fb8f48e

    invoke-static {p0, p1, v3}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_8
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_9

    new-instance v0, La41/i;

    const/16 v1, 0x10

    invoke-direct {v0, p0, p2, v1}, La41/i;-><init>(Ljava/lang/Object;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final m(Lc41/u0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lc41/q0;->l(Lc41/u0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(IJLandroidx/compose/runtime/Composer;II)V
    .locals 10

    move-object v5, p3

    check-cast v5, Lp1/q;

    const p3, 0x1b4d73f6

    invoke-virtual {v5, p3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p3, p4, 0x6

    const/4 v0, 0x4

    if-nez p3, :cond_1

    invoke-virtual {v5, p0}, Lp1/q;->e(I)Z

    move-result p3

    if-eqz p3, :cond_0

    move p3, v0

    goto :goto_0

    :cond_0
    const/4 p3, 0x2

    :goto_0
    or-int/2addr p3, p4

    goto :goto_1

    :cond_1
    move p3, p4

    :goto_1
    and-int/lit8 v1, p4, 0x30

    if-nez v1, :cond_3

    and-int/lit8 v1, p5, 0x2

    if-nez v1, :cond_2

    invoke-virtual {v5, p1, p2}, Lp1/q;->f(J)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr p3, v1

    :cond_3
    and-int/lit8 v1, p3, 0x13

    const/16 v2, 0x12

    if-eq v1, v2, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    and-int/lit8 v2, p3, 0x1

    invoke-virtual {v5, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {v5}, Lp1/q;->Z()V

    and-int/lit8 v1, p4, 0x1

    const/4 v2, 0x6

    if-eqz v1, :cond_7

    invoke-virtual {v5}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v5}, Lp1/q;->X()V

    and-int/lit8 v1, p5, 0x2

    if-eqz v1, :cond_6

    :goto_4
    and-int/lit8 p3, p3, -0x71

    :cond_6
    move-wide v3, p1

    goto :goto_6

    :cond_7
    :goto_5
    and-int/lit8 v1, p5, 0x2

    if-eqz v1, :cond_6

    sget-object p1, Lx81/d;->a:Lx81/d;

    invoke-virtual {p1, v5, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p1

    invoke-virtual {p1}, Ly81/i;->b1()J

    move-result-wide p1

    goto :goto_4

    :goto_6
    invoke-virtual {v5}, Lp1/q;->r()V

    int-to-float p1, v2

    int-to-float p2, v0

    mul-float/2addr p1, p2

    sget-object p2, Lb2/t;->w:Lb2/t;

    invoke-static {p1, p2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    shl-int/lit8 p2, p3, 0x3

    and-int/lit8 p2, p2, 0x70

    or-int/2addr p2, v2

    invoke-static {p0, v5, p2}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    shl-int/lit8 p2, p3, 0x6

    and-int/lit16 p2, p2, 0x1c00

    or-int/lit16 v6, p2, 0x1b0

    const/4 v7, 0x0

    const/4 v1, 0x0

    move-object v2, p1

    invoke-static/range {v0 .. v7}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-wide p1, v3

    goto :goto_7

    :cond_8
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_9

    move-wide v8, p1

    move p2, p4

    move-wide p3, v8

    move p1, p0

    new-instance p0, Lc41/o0;

    invoke-direct/range {p0 .. p5}, Lc41/o0;-><init>(IIJI)V

    iput-object p0, v0, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final o(IJIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move v0, p0

    move-wide v1, p1

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lc41/q0;->n(IJLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final p(Landroidx/compose/ui/Modifier;Lc41/u0;JLf0/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lc41/u0;",
            "J",
            "Lf0/t;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v7, p7

    const-string v0, "type"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p6

    check-cast v0, Lp1/q;

    const v1, -0x49e3b51

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v7, 0x30

    if-nez v1, :cond_1

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/16 v1, 0x20

    goto :goto_0

    :cond_0
    const/16 v1, 0x10

    :goto_0
    or-int/2addr v1, v7

    goto :goto_1

    :cond_1
    move v1, v7

    :goto_1
    and-int/lit16 v3, v7, 0x180

    if-nez v3, :cond_4

    and-int/lit8 v3, p8, 0x4

    if-nez v3, :cond_2

    move-wide/from16 v3, p2

    invoke-virtual {v0, v3, v4}, Lp1/q;->f(J)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x100

    goto :goto_2

    :cond_2
    move-wide/from16 v3, p2

    :cond_3
    const/16 v5, 0x80

    :goto_2
    or-int/2addr v1, v5

    goto :goto_3

    :cond_4
    move-wide/from16 v3, p2

    :goto_3
    and-int/lit8 v5, p8, 0x8

    if-eqz v5, :cond_6

    or-int/lit16 v1, v1, 0xc00

    :cond_5
    move-object/from16 v6, p4

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v7, 0xc00

    if-nez v6, :cond_5

    move-object/from16 v6, p4

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x800

    goto :goto_4

    :cond_7
    const/16 v8, 0x400

    :goto_4
    or-int/2addr v1, v8

    :goto_5
    and-int/lit8 v8, p8, 0x10

    const/16 v9, 0x4000

    if-eqz v8, :cond_9

    or-int/lit16 v1, v1, 0x6000

    :cond_8
    move-object/from16 v10, p5

    goto :goto_7

    :cond_9
    and-int/lit16 v10, v7, 0x6000

    if-nez v10, :cond_8

    move-object/from16 v10, p5

    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    move v11, v9

    goto :goto_6

    :cond_a
    const/16 v11, 0x2000

    :goto_6
    or-int/2addr v1, v11

    :goto_7
    and-int/lit16 v11, v1, 0x2491

    const/16 v12, 0x2490

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eq v11, v12, :cond_b

    move v11, v14

    goto :goto_8

    :cond_b
    move v11, v13

    :goto_8
    and-int/lit8 v12, v1, 0x1

    invoke-virtual {v0, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_18

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v11, v7, 0x1

    sget-object v15, Lb2/t;->w:Lb2/t;

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-eqz v11, :cond_e

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v11

    if-eqz v11, :cond_c

    goto :goto_9

    :cond_c
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/lit8 v5, p8, 0x4

    if-eqz v5, :cond_d

    and-int/lit16 v1, v1, -0x381

    :cond_d
    move/from16 v22, v13

    move-object v13, v6

    move-object v6, v10

    move-wide v10, v3

    move/from16 v4, v22

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_d

    :cond_e
    :goto_9
    and-int/lit8 v11, p8, 0x1

    if-eqz v11, :cond_f

    move-object v11, v15

    goto :goto_a

    :cond_f
    move-object/from16 v11, p0

    :goto_a
    and-int/lit8 v16, p8, 0x4

    if-eqz v16, :cond_10

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v4, 0x6

    invoke-virtual {v3, v0, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->W0()J

    move-result-wide v3

    and-int/lit16 v1, v1, -0x381

    :cond_10
    if-eqz v5, :cond_11

    const/4 v5, 0x0

    goto :goto_b

    :cond_11
    move-object v5, v6

    :goto_b
    if-eqz v8, :cond_13

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v12, :cond_12

    new-instance v6, Lbo2/a;

    const/16 v8, 0x11

    invoke-direct {v6, v8}, Lbo2/a;-><init>(I)V

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v6, Lc93/a;

    move-wide/from16 v22, v3

    move v3, v1

    move-object v1, v11

    move-wide/from16 v10, v22

    move v4, v13

    :goto_c
    move-object v13, v5

    goto :goto_d

    :cond_13
    move-object v6, v10

    move-wide/from16 v22, v3

    move v3, v1

    move-object v1, v11

    move v4, v13

    move-wide/from16 v10, v22

    goto :goto_c

    :goto_d
    invoke-virtual {v0}, Lp1/q;->r()V

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v12, :cond_14

    invoke-static {v0}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v5

    :cond_14
    move-object/from16 v16, v5

    check-cast v16, Lj0/i;

    sget-object v5, Landroidx/compose/foundation/d;->a:Lp1/b0;

    invoke-virtual {v0, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v17, v5

    check-cast v17, Lf0/v0;

    const v5, 0xe000

    and-int v8, v3, v5

    if-ne v8, v9, :cond_15

    goto :goto_e

    :cond_15
    move v14, v4

    :goto_e
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v14, :cond_16

    if-ne v4, v12, :cond_17

    :cond_16
    new-instance v4, La31/e;

    const/4 v8, 0x7

    invoke-direct {v4, v6, v8}, La31/e;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object/from16 v20, v4

    check-cast v20, Lc93/a;

    const/16 v21, 0x1c

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v8

    new-instance v4, La80/c;

    const/16 v9, 0x15

    invoke-direct {v4, v2, v9}, La80/c;-><init>(Ljava/lang/Object;I)V

    const v9, -0x3a44b8e1

    invoke-static {v9, v0, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v16

    and-int/lit16 v4, v3, 0x380

    const/high16 v9, 0xc00000

    or-int/2addr v4, v9

    shl-int/lit8 v3, v3, 0x3

    and-int/2addr v3, v5

    or-int v18, v4, v3

    const/16 v19, 0x6a

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v17, v0

    invoke-static/range {v8 .. v19}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-wide v3, v10

    move-object v5, v13

    goto :goto_f

    :cond_18
    move-object/from16 v17, v0

    invoke-virtual/range {v17 .. v17}, Lp1/q;->X()V

    move-object/from16 v1, p0

    move-object v5, v6

    move-object v6, v10

    :goto_f
    invoke-virtual/range {v17 .. v17}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_19

    new-instance v0, Lc41/p0;

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lc41/p0;-><init>(Landroidx/compose/ui/Modifier;Lc41/u0;JLf0/t;Lc93/a;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final q()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final r(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lc41/u0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p2, v3

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {p0, p1, v2}, Lc41/q0;->l(Lc41/u0;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Landroidx/compose/ui/Modifier;Lc41/u0;JLf0/t;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move-object v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lc41/q0;->p(Landroidx/compose/ui/Modifier;Lc41/u0;JLf0/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lc41/u0$a;Landroidx/compose/runtime/Composer;I)V
    .locals 54

    move-object/from16 v0, p0

    move-object/from16 v5, p1

    check-cast v5, Lp1/q;

    const v2, 0xc7e958d

    invoke-virtual {v5, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v4, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v6, v2, 0x3

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eq v6, v4, :cond_2

    move v6, v8

    goto :goto_2

    :cond_2
    move v6, v9

    :goto_2
    and-int/2addr v2, v8

    invoke-virtual {v5, v2, v6}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_17

    const/high16 v10, 0x3f800000    # 1.0f

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    double-to-float v6, v6

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v6, v7

    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v12, Lb2/e;->K:Lb2/l;

    sget-object v6, Ll0/m;->g:Ll0/h;

    const/16 v13, 0x36

    invoke-static {v6, v12, v5, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v14, v5, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v8, v5, Lp1/q;->S:Z

    if-eqz v8, :cond_3

    invoke-virtual {v5, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_3
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v5, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v5, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v13, v5, Lp1/q;->S:Z

    if-nez v13, :cond_4

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v13, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    :cond_4
    invoke-static {v7, v5, v7, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v13, La3/k;->d:La3/i;

    invoke-static {v5, v13, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v2, v10

    const-wide/16 v28, 0x0

    cmpl-double v2, v2, v28

    const-string v30, "invalid weight; must be greater than zero"

    if-lez v2, :cond_6

    goto :goto_4

    :cond_6
    invoke-static/range {v30 .. v30}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_4
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v31, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v3, v10, v31

    if-lez v3, :cond_7

    move/from16 v3, v31

    goto :goto_5

    :cond_7
    move v3, v10

    :goto_5
    invoke-direct {v2, v3, v9}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    int-to-float v3, v4

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float v32, v3, v4

    invoke-static/range {v32 .. v32}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    const/16 v4, 0x36

    invoke-static {v3, v12, v5, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    move-object/from16 v17, v11

    iget-wide v10, v5, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v11, v5, Lp1/q;->S:Z

    if-eqz v11, :cond_8

    invoke-virtual {v5, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v5, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v5, Lp1/q;->S:Z

    if-nez v3, :cond_9

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v3, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    :cond_9
    invoke-static {v7, v5, v7, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    invoke-static {v5, v13, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lc41/u0$a;->c()I

    move-result v2

    move-object v3, v6

    const/4 v6, 0x0

    const/4 v7, 0x2

    move-object v10, v3

    move v11, v4

    const-wide/16 v3, 0x0

    invoke-static/range {v2 .. v7}, Lc41/q0;->n(IJLandroidx/compose/runtime/Composer;II)V

    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v3, Lb2/e;->M:Lb2/k;

    invoke-static {v2, v3, v5, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v3, v5, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    move-object/from16 v6, v17

    invoke-static {v5, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v11, v5, Lp1/q;->S:Z

    if-eqz v11, :cond_b

    invoke-virtual {v5, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v5, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v5, Lp1/q;->S:Z

    if-nez v2, :cond_c

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    :cond_c
    invoke-static {v3, v5, v3, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v5, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lc41/u0$a;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v5, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v4, 0x6

    invoke-virtual {v3, v5, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->s()Lb91/a;

    move-result-object v22

    invoke-virtual {v0}, Lc41/u0$a;->e()Ly81/f;

    move-result-object v7

    invoke-virtual {v7, v5, v9}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v18

    const/16 v26, 0x0

    const v27, 0x2fffa

    move-object v7, v3

    const/4 v3, 0x0

    move-object/from16 v20, v6

    move-object v11, v7

    const-wide/16 v6, 0x0

    move-object/from16 v21, v8

    const/4 v8, 0x0

    move/from16 v23, v9

    const/4 v9, 0x0

    move-object/from16 v24, v10

    const/4 v10, 0x0

    move-object/from16 v33, v11

    move-object/from16 v25, v12

    const-wide/16 v11, 0x0

    move-object/from16 v34, v13

    const/4 v13, 0x0

    move-object/from16 v35, v14

    const/4 v14, 0x0

    move-object/from16 v36, v15

    const/high16 v37, 0x3f800000    # 1.0f

    const-wide/16 v15, 0x0

    const/16 v38, 0x36

    const/16 v17, 0x0

    move/from16 v39, v4

    move-object/from16 v53, v24

    move-object/from16 v24, v5

    move-wide/from16 v4, v18

    move-object/from16 v19, v53

    const/16 v18, 0x0

    move-object/from16 v40, v19

    const/16 v19, 0x0

    move-object/from16 v41, v20

    const/16 v20, 0x0

    move-object/from16 v42, v21

    const/16 v21, 0x0

    move/from16 v43, v23

    const/16 v23, 0x0

    move-object/from16 v44, v25

    const/16 v25, 0x0

    move-object/from16 v0, v33

    move-object/from16 v50, v34

    move-object/from16 v49, v35

    move-object/from16 v46, v36

    move-object/from16 v48, v40

    move-object/from16 v52, v41

    move-object/from16 v47, v42

    move/from16 v1, v43

    move-object/from16 v45, v44

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    invoke-virtual/range {p0 .. p0}, Lc41/u0$a;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-eqz v2, :cond_e

    const v2, -0x756ed299

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lc41/u0$a;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v5, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x6

    invoke-virtual {v0, v5, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->d()Lb91/a;

    move-result-object v22

    invoke-virtual {v0, v5, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->b1()J

    move-result-wide v6

    const/16 v26, 0x0

    const v27, 0x2fffa

    move/from16 v51, v3

    const/4 v3, 0x0

    move-object/from16 v24, v5

    move-wide v4, v6

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    :goto_8
    const/4 v2, 0x1

    goto :goto_9

    :cond_e
    const v2, -0x756b8f0d

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    goto :goto_8

    :goto_9
    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    sget-object v2, Lb2/e;->F:Lb2/m;

    const/high16 v3, 0x3f800000    # 1.0f

    float-to-double v6, v3

    cmpl-double v4, v6, v28

    if-lez v4, :cond_f

    goto :goto_a

    :cond_f
    invoke-static/range {v30 .. v30}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_a
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v6, v3, v31

    if-lez v6, :cond_10

    move/from16 v10, v31

    :goto_b
    const/4 v3, 0x1

    goto :goto_c

    :cond_10
    move v10, v3

    goto :goto_b

    :goto_c
    invoke-direct {v4, v10, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v2, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-eqz v7, :cond_11

    move-object/from16 v7, v46

    invoke-virtual {v5, v7}, Lp1/q;->l(Lc93/a;)V

    :goto_d
    move-object/from16 v8, v47

    goto :goto_e

    :cond_11
    move-object/from16 v7, v46

    invoke-virtual {v5}, Lp1/q;->s0()V

    goto :goto_d

    :goto_e
    invoke-static {v5, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v10, v48

    invoke-static {v5, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v5, Lp1/q;->S:Z

    if-nez v2, :cond_12

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    :cond_12
    move-object/from16 v2, v49

    goto :goto_10

    :cond_13
    move-object/from16 v2, v49

    :goto_f
    move-object/from16 v3, v50

    goto :goto_11

    :goto_10
    invoke-static {v3, v5, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_f

    :goto_11
    invoke-static {v5, v3, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {v32 .. v32}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    move-object/from16 v6, v45

    const/16 v11, 0x36

    invoke-static {v4, v6, v5, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v11, v5, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    move-object/from16 v11, v52

    invoke-static {v5, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v12, v5, Lp1/q;->S:Z

    if-eqz v12, :cond_14

    invoke-virtual {v5, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_14
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_12
    invoke-static {v5, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v10, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-nez v4, :cond_15

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_16

    :cond_15
    invoke-static {v6, v5, v6, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    invoke-static {v5, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lc41/u0$a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v5, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x6

    invoke-virtual {v0, v5, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->k()Lb91/a;

    move-result-object v22

    invoke-virtual {v0, v5, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v0

    new-instance v14, Lw3/k;

    invoke-direct {v14, v3}, Lw3/k;-><init>(I)V

    const/16 v26, 0x0

    const v27, 0x2fdfa

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v24, v5

    move-wide v4, v0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    const/4 v2, 0x1

    invoke-static {v5, v2, v2, v2}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_13

    :cond_17
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_13
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_18

    new-instance v1, La41/i;

    const/16 v2, 0x14

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, La41/i;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final v(Lc41/u0$a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lc41/q0;->u(Lc41/u0$a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final w(Lc41/u0$b;Landroidx/compose/runtime/Composer;I)V
    .locals 43

    move-object/from16 v0, p0

    const-string v2, "type"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p1

    check-cast v6, Lp1/q;

    const v2, -0x59716733

    invoke-virtual {v6, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v4, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v6, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v5, v2, 0x3

    const/4 v9, 0x1

    if-eq v5, v4, :cond_2

    move v5, v9

    goto :goto_2

    :cond_2
    const/4 v5, 0x0

    :goto_2
    and-int/2addr v2, v9

    invoke-virtual {v6, v2, v5}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_12

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const-wide/high16 v7, 0x3ff8000000000000L    # 1.5

    double-to-float v7, v7

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v7, v8

    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, Lb2/e;->K:Lb2/l;

    sget-object v8, Ll0/m;->g:Ll0/h;

    const/16 v12, 0x36

    invoke-static {v8, v7, v6, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v13, v6, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v6, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v10, v6, Lp1/q;->S:Z

    if-eqz v10, :cond_3

    invoke-virtual {v6, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_3
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v6, v10, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v6, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v12, v6, Lp1/q;->S:Z

    if-nez v12, :cond_4

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v12, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    :cond_4
    invoke-static {v13, v6, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v12, La3/k;->d:La3/i;

    invoke-static {v6, v12, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v4, v2

    const-wide/16 v29, 0x0

    cmpl-double v4, v4, v29

    const-string v31, "invalid weight; must be greater than zero"

    if-lez v4, :cond_6

    goto :goto_4

    :cond_6
    invoke-static/range {v31 .. v31}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_4
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v32, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v5, v2, v32

    if-lez v5, :cond_7

    move/from16 v5, v32

    goto :goto_5

    :cond_7
    move v5, v2

    :goto_5
    invoke-direct {v4, v5, v9}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v3, 0x2

    int-to-float v3, v3

    const/4 v5, 0x4

    int-to-float v13, v5

    mul-float/2addr v3, v13

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    const/16 v9, 0x36

    invoke-static {v5, v7, v6, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    move v7, v3

    iget-wide v2, v6, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v6, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v9, v6, Lp1/q;->S:Z

    if-eqz v9, :cond_8

    invoke-virtual {v6, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v6, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v6, Lp1/q;->S:Z

    if-nez v3, :cond_9

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    :cond_9
    invoke-static {v2, v6, v2, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    invoke-static {v6, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lc41/u0$b;->c()I

    move-result v3

    move v2, v7

    const/4 v7, 0x0

    move-object v4, v8

    const/4 v8, 0x2

    move-object v9, v4

    const-wide/16 v4, 0x0

    invoke-static/range {v3 .. v8}, Lc41/q0;->n(IJLandroidx/compose/runtime/Composer;II)V

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x0

    invoke-static {v3, v4, v6, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v6, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v6, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_b

    invoke-virtual {v6, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v6, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v6, Lp1/q;->S:Z

    if-nez v3, :cond_c

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    :cond_c
    invoke-static {v4, v6, v4, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v6, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lc41/u0$b;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/4 v5, 0x0

    invoke-static {v3, v6, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    const/4 v7, 0x6

    invoke-virtual {v4, v6, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->s()Lb91/a;

    move-result-object v23

    invoke-virtual {v0}, Lc41/u0$b;->f()Ly81/f;

    move-result-object v8

    invoke-virtual {v8, v6, v5}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v8

    const/16 v27, 0x0

    const v28, 0x2fffa

    move-object v10, v4

    const/4 v4, 0x0

    move-object/from16 v25, v6

    move v12, v7

    move-wide/from16 v41, v8

    move v9, v5

    move-wide/from16 v5, v41

    const-wide/16 v7, 0x0

    move v14, v9

    const/4 v9, 0x0

    move-object v15, v10

    const/4 v10, 0x0

    move-object/from16 v16, v11

    const/4 v11, 0x0

    move/from16 v19, v12

    move/from16 v18, v13

    const-wide/16 v12, 0x0

    move/from16 v20, v14

    const/4 v14, 0x0

    move-object/from16 v21, v15

    const/4 v15, 0x0

    move-object/from16 v24, v16

    const/16 v22, 0x1

    const-wide/16 v16, 0x0

    move/from16 v26, v18

    const/16 v18, 0x0

    move/from16 v34, v19

    const/16 v19, 0x0

    move/from16 v35, v20

    const/16 v20, 0x0

    move-object/from16 v36, v21

    const/16 v21, 0x0

    move/from16 v37, v22

    const/16 v22, 0x0

    move-object/from16 v38, v24

    const/16 v24, 0x0

    move/from16 v39, v26

    const/16 v26, 0x0

    move/from16 v1, v35

    move-object/from16 v0, v36

    move-object/from16 v40, v38

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v25

    invoke-virtual/range {p0 .. p0}, Lc41/u0$b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    if-eqz v3, :cond_e

    const v3, -0x32cc7759

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lc41/u0$b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v6, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x6

    invoke-virtual {v0, v6, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->d()Lb91/a;

    move-result-object v23

    invoke-virtual {v0, v6, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->b1()J

    move-result-wide v7

    const/16 v27, 0x0

    const v28, 0x2fffa

    move/from16 v34, v4

    const/4 v4, 0x0

    move-object/from16 v25, v6

    move-wide v5, v7

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move/from16 v35, v2

    move/from16 v2, v34

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v25

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    :goto_8
    const/4 v3, 0x1

    goto :goto_9

    :cond_e
    move/from16 v35, v2

    const/4 v2, 0x6

    const v3, -0x32c933cd

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    goto :goto_8

    :goto_9
    invoke-virtual {v6, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v3}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lc41/u0$b;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v6, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    const/high16 v4, 0x3f800000    # 1.0f

    float-to-double v7, v4

    cmpl-double v5, v7, v29

    if-lez v5, :cond_f

    :goto_a
    move/from16 v33, v4

    goto :goto_b

    :cond_f
    invoke-static/range {v31 .. v31}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_a

    :goto_b
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v5, v33, v32

    if-lez v5, :cond_10

    move/from16 v5, v32

    :goto_c
    const/4 v7, 0x1

    goto :goto_d

    :cond_10
    move/from16 v5, v33

    goto :goto_c

    :goto_d
    invoke-direct {v4, v5, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual {v0, v6, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->t()Lb91/a;

    move-result-object v23

    invoke-virtual {v0, v6, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->b()J

    move-result-wide v7

    new-instance v15, Lw3/k;

    invoke-direct {v15, v2}, Lw3/k;-><init>(I)V

    const/16 v27, 0x0

    const v28, 0x2fdf8

    move-object/from16 v25, v6

    move-wide v5, v7

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v25

    invoke-virtual/range {p0 .. p0}, Lc41/u0$b;->d()Z

    move-result v3

    if-eqz v3, :cond_11

    const v3, -0x146e3200

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    move/from16 v7, v35

    move-object/from16 v3, v40

    invoke-static {v7, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v6, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    mul-float v13, v39, v39

    invoke-static {v13, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/w;->b()I

    move-result v3

    invoke-static {v3, v6, v2}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v3

    invoke-virtual {v0, v6, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v7

    const/16 v9, 0x1b0

    const/4 v10, 0x0

    const/4 v4, 0x0

    move-wide/from16 v41, v7

    move-object v8, v6

    move-wide/from16 v6, v41

    invoke-static/range {v3 .. v10}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v6, v8

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    :goto_e
    const/4 v3, 0x1

    goto :goto_f

    :cond_11
    const v0, -0x146922e7

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    goto :goto_e

    :goto_f
    invoke-virtual {v6, v3}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_12
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_10
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_13

    new-instance v1, La41/i;

    const/16 v2, 0x11

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, La41/i;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final x(Lc41/u0$b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lc41/q0;->w(Lc41/u0$b;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lc41/u0$c;Landroidx/compose/runtime/Composer;I)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v5, p1

    check-cast v5, Lp1/q;

    const v2, -0x14719d33

    invoke-virtual {v5, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v6, v2, 0x3

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eq v6, v4, :cond_2

    move v4, v8

    goto :goto_2

    :cond_2
    move v4, v9

    :goto_2
    and-int/2addr v2, v8

    invoke-virtual {v5, v2, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_a

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-wide/high16 v6, 0x3ff8000000000000L    # 1.5

    double-to-float v4, v6

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v4, v6

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Lb2/e;->K:Lb2/l;

    const/4 v6, 0x3

    int-to-float v6, v6

    int-to-float v3, v3

    const/16 v7, 0x36

    invoke-static {v6, v3, v4, v5, v7}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v3

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-eqz v7, :cond_3

    invoke-virtual {v5, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_3
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v5, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v5, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v3, v5, Lp1/q;->S:Z

    if-nez v3, :cond_4

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    :cond_4
    invoke-static {v4, v5, v4, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v15, La3/k;->d:La3/i;

    invoke-static {v5, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lc41/u0$c;->c()I

    move-result v2

    invoke-virtual {v0}, Lc41/u0$c;->d()Ly81/f;

    move-result-object v3

    invoke-virtual {v3, v5, v9}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v3

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lc41/q0;->n(IJLandroidx/compose/runtime/Composer;II)V

    float-to-double v2, v10

    const-wide/16 v6, 0x0

    cmpl-double v2, v2, v6

    if-lez v2, :cond_6

    goto :goto_4

    :cond_6
    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_4
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v2, v10, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v4, v5, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-eqz v7, :cond_7

    invoke-virtual {v5, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v5, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v5, Lp1/q;->S:Z

    if-nez v3, :cond_8

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    :cond_8
    invoke-static {v4, v5, v4, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    invoke-static {v5, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lc41/u0$c;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v5, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lc41/u0$c;->f()Ly81/f;

    move-result-object v3

    invoke-virtual {v3, v5, v9}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v3

    sget-object v6, Lx81/d;->a:Lx81/d;

    const/4 v7, 0x6

    invoke-virtual {v6, v5, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->r()Lb91/a;

    move-result-object v22

    const/16 v26, 0x0

    const v27, 0x2fffa

    move-object/from16 v24, v5

    move-wide v4, v3

    const/4 v3, 0x0

    move-object v10, v6

    move v11, v7

    const-wide/16 v6, 0x0

    move v12, v8

    const/4 v8, 0x0

    move v13, v9

    const/4 v9, 0x0

    move-object v14, v10

    const/4 v10, 0x0

    move/from16 v16, v11

    move v15, v12

    const-wide/16 v11, 0x0

    move/from16 v17, v13

    const/4 v13, 0x0

    move-object/from16 v18, v14

    const/4 v14, 0x0

    move/from16 v19, v15

    move/from16 v20, v16

    const-wide/16 v15, 0x0

    move/from16 v21, v17

    const/16 v17, 0x0

    move-object/from16 v23, v18

    const/16 v18, 0x0

    move/from16 v25, v19

    const/16 v19, 0x0

    move/from16 v28, v20

    const/16 v20, 0x0

    move/from16 v29, v21

    const/16 v21, 0x0

    move-object/from16 v30, v23

    const/16 v23, 0x0

    move/from16 v31, v25

    const/16 v25, 0x0

    move/from16 v1, v29

    move-object/from16 v0, v30

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    invoke-virtual/range {p0 .. p0}, Lc41/u0$c;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v5, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lc41/u0$c;->b()Ly81/f;

    move-result-object v3

    invoke-virtual {v3, v5, v1}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v3

    const/4 v11, 0x6

    invoke-virtual {v0, v5, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->c()Lb91/a;

    move-result-object v22

    move-wide v4, v3

    const/4 v3, 0x0

    const-wide/16 v11, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    const/4 v15, 0x1

    invoke-virtual {v5, v15}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v15}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_a
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_b

    new-instance v1, La41/i;

    const/16 v2, 0x15

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, La41/i;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final z(Lc41/u0$c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lc41/q0;->y(Lc41/u0$c;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
