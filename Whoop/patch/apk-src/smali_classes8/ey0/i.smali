.class public abstract Ley0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a9\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a7\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000eH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a7\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000eH\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0012\u001a=\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000c2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a+\u0010\u0018\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000c2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000eH\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001e\u00b2\u0006\u000c\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\r\u001a\u00020\u000c8\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "",
        "pillar",
        "date",
        "Lby0/c;",
        "navRouter",
        "Lby0/a;",
        "actionRouter",
        "Lcy0/a$i;",
        "screenViewEvent",
        "Ll83/a0;",
        "x",
        "(Ljava/lang/String;Ljava/lang/String;Lby0/c;Lby0/a;Lcy0/a$i;Landroidx/compose/runtime/Composer;I)V",
        "Lcy0/c;",
        "viewState",
        "Lkotlin/Function1;",
        "Lcy0/a;",
        "onEvent",
        "w",
        "(Lcy0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "s",
        "Lg1/y3;",
        "bottomSheetState",
        "o",
        "(Lcy0/c;Lkotlin/jvm/functions/Function1;Lg1/y3;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V",
        "l",
        "(Lcy0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lcy0/b;",
        "viewModel",
        "Ltu1/a;",
        "currentBottomSheet",
        "deep-dive_release"
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
.method private static final A(Lby0/a;Lby0/c;Ll83/h;Lcy0/a;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Lby0/a;->c(Lcy0/a;)Lcy0/a;

    move-result-object p0

    instance-of p3, p0, Lcy0/a$k;

    if-eqz p3, :cond_0

    invoke-static {p2}, Ley0/i;->y(Ll83/h;)Lcy0/b;

    move-result-object p1

    check-cast p0, Lcy0/a$k;

    invoke-virtual {p1, p0}, Lcy0/b;->n(Lcy0/a$k;)V

    goto :goto_0

    :cond_0
    instance-of p2, p0, Lcy0/a$g;

    if-eqz p2, :cond_1

    check-cast p0, Lcy0/a$g;

    invoke-virtual {p1, p0}, Lby0/c;->c(Lcy0/a$g;)V

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Ljava/lang/String;Ljava/lang/String;Lby0/c;Lby0/a;Lcy0/a$i;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p6

    invoke-static/range {v0 .. v6}, Ley0/i;->x(Ljava/lang/String;Ljava/lang/String;Lby0/c;Lby0/a;Lcy0/a$i;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lcy0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lcy0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Ley0/i;->w(Lcy0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic E(Lp1/t2;)Ltu1/a;
    .locals 0

    invoke-static {p0}, Ley0/i;->u(Lp1/t2;)Ltu1/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic F(Ll83/h;)Lcy0/b;
    .locals 0

    invoke-static {p0}, Ley0/i;->y(Ll83/h;)Lcy0/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lcy0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ley0/i;->t(Lcy0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcy0/c;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ley0/i;->q(Lcy0/c;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcy0/c;Lkotlin/jvm/functions/Function1;Lg1/y3;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Ley0/i;->r(Lcy0/c;Lkotlin/jvm/functions/Function1;Lg1/y3;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcy0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ley0/i;->C(Lcy0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcy0/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ley0/i;->n(Lcy0/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcy0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ley0/i;->v(Lcy0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Lny0/p0;Lcy0/c;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ley0/i;->m(Lkotlin/jvm/functions/Function1;Lny0/p0;Lcy0/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lby0/a;Lby0/c;Ll83/h;Lcy0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ley0/i;->A(Lby0/a;Lby0/c;Ll83/h;Lcy0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcy0/c;Lkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ley0/i;->p(Lcy0/c;Lkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcy0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ley0/i;->D(Lcy0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ljava/lang/String;Ljava/lang/String;Lby0/c;Lby0/a;Lcy0/a$i;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Ley0/i;->B(Ljava/lang/String;Ljava/lang/String;Lby0/c;Lby0/a;Lcy0/a$i;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Lcy0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 65
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcy0/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    const v3, 0x1b423859

    invoke-virtual {v13, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    const/4 v5, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :cond_3
    and-int/lit8 v6, v3, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v6, v8, :cond_4

    move v6, v10

    goto :goto_3

    :cond_4
    move v6, v9

    :goto_3
    and-int/lit8 v11, v3, 0x1

    invoke-virtual {v13, v11, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-virtual {v0}, Lcy0/c;->a()Ltu1/a;

    move-result-object v30

    if-nez v30, :cond_5

    const v3, 0x1f1df723

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    goto/16 :goto_a

    :cond_5
    const v6, 0x1f1df724

    invoke-virtual {v13, v6}, Lp1/q;->e0(I)V

    int-to-float v6, v10

    int-to-float v5, v5

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v5, v11, v13}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    sget-object v5, Lb2/e;->M:Lb2/k;

    const-wide/high16 v14, 0x4004000000000000L    # 2.5

    double-to-float v6, v14

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float/2addr v6, v12

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    invoke-static {v11}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/16 v14, 0x36

    invoke-static {v6, v5, v13, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v14, v13, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v13, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v4, v13, Lp1/q;->S:Z

    if-eqz v4, :cond_6

    invoke-virtual {v13, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_4
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v13, v4, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v13, v4, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v5, v13, Lp1/q;->S:Z

    if-nez v5, :cond_7

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v5, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    :cond_7
    invoke-static {v6, v13, v6, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v13, v4, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual/range {v30 .. v30}, Ltu1/a;->c()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v4, v13, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v12, Lx81/d;->a:Lx81/d;

    sget v14, Lx81/d;->b:I

    invoke-virtual {v12, v13, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->P()Lb91/a;

    move-result-object v24

    invoke-virtual {v12, v13, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->y()J

    move-result-wide v15

    new-instance v7, Lw3/k;

    move/from16 v18, v8

    const/4 v8, 0x5

    invoke-direct {v7, v8}, Lw3/k;-><init>(I)V

    sget v8, Lb91/a;->d:I

    shl-int/lit8 v28, v8, 0x12

    const v29, 0x2fdf8

    move/from16 v18, v9

    const-wide/16 v8, 0x0

    move/from16 v19, v10

    const/4 v10, 0x0

    move-object/from16 v20, v11

    const/4 v11, 0x0

    move-object/from16 v21, v12

    const/4 v12, 0x0

    move-object/from16 v26, v13

    move/from16 v22, v14

    const-wide/16 v13, 0x0

    move-object/from16 v23, v7

    move-wide/from16 v63, v15

    move/from16 v16, v6

    move-wide/from16 v6, v63

    const/4 v15, 0x0

    move/from16 v27, v18

    const/16 v25, 0x20

    const-wide/16 v17, 0x0

    move/from16 v31, v19

    const/16 v19, 0x0

    move-object/from16 v32, v20

    const/16 v20, 0x0

    move-object/from16 v33, v21

    const/16 v21, 0x0

    move/from16 v34, v22

    const/16 v22, 0x0

    move/from16 v35, v16

    move-object/from16 v16, v23

    const/16 v23, 0x0

    move/from16 v36, v25

    const/16 v25, 0x0

    move/from16 v37, v27

    const/16 v27, 0x30

    move/from16 v38, v3

    move-object/from16 v1, v32

    move-object/from16 v3, v33

    move/from16 v2, v34

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual/range {v30 .. v30}, Ltu1/a;->b()Ljava/lang/String;

    move-result-object v31

    sget-object v4, Liz0/l;->a:Liz0/l;

    sget v5, Liz0/l;->b:I

    shl-int/lit8 v28, v5, 0xf

    const/16 v29, 0x7fff

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const-wide/16 v10, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    invoke-virtual/range {v4 .. v29}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v39

    move-object/from16 v13, v26

    invoke-virtual {v3, v13, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->c1()J

    move-result-wide v41

    invoke-virtual {v3, v13, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v48

    const/16 v61, 0x7fdd

    const/16 v62, 0x0

    const/16 v40, 0x0

    const-wide/16 v43, 0x0

    const-wide/16 v45, 0x0

    const/16 v47, 0x0

    const/16 v50, 0x0

    const-wide/16 v51, 0x0

    const/16 v53, 0x0

    const-wide/16 v54, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    invoke-static/range {v39 .. v62}, Liz0/m;->b(Liz0/m;Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFILjava/lang/Object;)Liz0/m;

    move-result-object v7

    sget v2, Liz0/m;->p:I

    shl-int/lit8 v2, v2, 0x9

    or-int/lit8 v14, v2, 0x30

    const/16 v15, 0x1f4

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v5, v1

    move-object/from16 v4, v31

    invoke-static/range {v4 .. v15}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {v30 .. v30}, Ltu1/a;->a()Lny0/p0;

    move-result-object v1

    if-nez v1, :cond_9

    const v1, -0x57dff65e

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    const/4 v1, 0x0

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    move v2, v1

    move-object/from16 v1, p1

    :goto_5
    const/4 v3, 0x1

    goto/16 :goto_9

    :cond_9
    const v2, -0x57dff65d

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lny0/p0;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object v2

    invoke-static {v2}, Lj91/c;->a(Li2/t;)Lj91/b;

    move-result-object v11

    new-instance v8, Ly71/g;

    invoke-static {v3}, Lih0/d0;->E(Lx81/d;)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-direct {v8, v2, v3, v4, v3}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v2, v38, 0x70

    const/16 v3, 0x20

    if-ne v2, v3, :cond_a

    const/4 v9, 0x1

    goto :goto_6

    :cond_a
    const/4 v9, 0x0

    :goto_6
    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v2, v9

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_c

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_b

    goto :goto_7

    :cond_b
    move-object/from16 v4, p1

    goto :goto_8

    :cond_c
    :goto_7
    new-instance v3, Lep1/g;

    const/4 v2, 0x4

    move-object/from16 v4, p1

    invoke-direct {v3, v4, v1, v0, v2}, Lep1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v13, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_8
    move-object/from16 v16, v3

    check-cast v16, Lkotlin/jvm/functions/Function1;

    const/high16 v1, 0x6000000

    shl-int/lit8 v2, v35, 0x6

    or-int/2addr v1, v2

    sget v2, Ly71/g;->c:I

    shl-int/lit8 v2, v2, 0xc

    or-int v18, v1, v2

    const/16 v19, 0x0

    const/16 v20, 0xe6b

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v26, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v1, p1

    move-object/from16 v17, v26

    invoke-static/range {v4 .. v20}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v17

    const/4 v2, 0x0

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    goto :goto_5

    :goto_9
    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_d
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_e

    new-instance v3, Lce2/b;

    const/16 v4, 0x1d

    move/from16 v5, p3

    invoke-direct {v3, v0, v1, v5, v4}, Lce2/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final m(Lkotlin/jvm/functions/Function1;Lny0/p0;Lcy0/c;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lny0/p0;->j()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-virtual {p2}, Lcy0/c;->c()Lcy0/c$d;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcy0/c$d;->c()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_1

    :cond_0
    const-string p2, ""

    :cond_1
    new-instance p3, Lcy0/a$c;

    const/4 v0, 0x0

    invoke-direct {p3, p1, p2, v0}, Lcy0/a$c;-><init>(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;)V

    invoke-interface {p0, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lcy0/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Ley0/i;->l(Lcy0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final o(Lcy0/c;Lkotlin/jvm/functions/Function1;Lg1/y3;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcy0/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Lg1/y3;",
            "Ljava/lang/String;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p5

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bottomSheetState"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v4, 0x660b3991

    invoke-virtual {v0, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v5, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v5

    goto :goto_1

    :cond_1
    move v4, v5

    :goto_1
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_3
    and-int/lit16 v6, v5, 0x180

    if-nez v6, :cond_6

    and-int/lit16 v6, v5, 0x200

    if-nez v6, :cond_4

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_3

    :cond_4
    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_3
    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_4

    :cond_5
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v4, v6

    :cond_6
    and-int/lit8 v6, p6, 0x8

    if-eqz v6, :cond_8

    or-int/lit16 v4, v4, 0xc00

    :cond_7
    move-object/from16 v7, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v7, v5, 0xc00

    if-nez v7, :cond_7

    move-object/from16 v7, p3

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x800

    goto :goto_5

    :cond_9
    const/16 v8, 0x400

    :goto_5
    or-int/2addr v4, v8

    :goto_6
    and-int/lit16 v8, v4, 0x493

    const/16 v9, 0x492

    const/4 v10, 0x1

    if-eq v8, v9, :cond_a

    move v8, v10

    goto :goto_7

    :cond_a
    const/4 v8, 0x0

    :goto_7
    and-int/2addr v4, v10

    invoke-virtual {v0, v4, v8}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_c

    if-eqz v6, :cond_b

    const-string v4, ""

    goto :goto_8

    :cond_b
    move-object v4, v7

    :goto_8
    new-instance v6, Lv41/g;

    const/16 v14, 0x7f

    const/4 v15, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v6 .. v15}, Lv41/g;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;Lv41/i0;Ly81/e;FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lv41/f$a;

    invoke-direct {v8, v3}, Lv41/f$a;-><init>(Lg1/y3;)V

    sget-object v9, Ly81/f;->BLACK_50:Ly81/f;

    new-instance v7, Ll;

    const/16 v10, 0x16

    invoke-direct {v7, v10, v1, v2}, Ll;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v10, 0x3445113f

    invoke-static {v10, v0, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    new-instance v7, La01/d;

    const/16 v10, 0xc

    invoke-direct {v7, v1, v2, v4, v10}, La01/d;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    const v10, 0x57656203

    invoke-static {v10, v0, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v20

    sget v7, Lv41/g;->h:I

    shl-int/lit8 v7, v7, 0x3

    const v10, 0xc00c00

    or-int/2addr v7, v10

    sget v10, Lv41/f$a;->c:I

    shl-int/lit8 v10, v10, 0x6

    or-int v22, v7, v10

    const/16 v23, 0x6000

    const/16 v24, 0x3f71

    move-object v7, v6

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v21, v0

    invoke-static/range {v6 .. v24}, Lv41/d;->m(Landroidx/compose/ui/Modifier;Lv41/g;Lv41/f;Ly81/e;Lc93/a;Lc93/a;Li2/a1;Lkotlin/jvm/functions/Function3;ZLny0/q;Li2/t;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;III)V

    goto :goto_9

    :cond_c
    move-object/from16 v21, v0

    invoke-virtual/range {v21 .. v21}, Lp1/q;->X()V

    move-object v4, v7

    :goto_9
    invoke-virtual/range {v21 .. v21}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_d

    new-instance v0, La81/f;

    const/16 v7, 0x17

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, La81/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final p(Lcy0/c;Lkotlin/jvm/functions/Function1;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 3

    const-string v0, "$this$BottomSheet"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p2, p4, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq p2, v0, :cond_0

    move p2, v2

    goto :goto_0

    :cond_0
    move p2, v1

    :goto_0
    and-int/2addr p4, v2

    check-cast p3, Lp1/q;

    invoke-virtual {p3, p4, p2}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {p0, p1, p3, v1}, Ley0/i;->l(Lcy0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lcy0/c;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    and-int/lit8 v0, p4, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/2addr p4, v2

    move-object v8, p3

    check-cast v8, Lp1/q;

    invoke-virtual {v8, p4, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-virtual {p0}, Lcy0/c;->c()Lcy0/c$d;

    move-result-object v4

    if-nez v4, :cond_1

    const p0, 0x5f095cc7

    invoke-virtual {v8, p0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_1
    const p0, 0x5f095cc8

    invoke-virtual {v8, p0}, Lp1/q;->e0(I)V

    const/4 v9, 0x0

    const/16 v10, 0x8

    const/4 v7, 0x0

    move-object v5, p1

    move-object v6, p2

    invoke-static/range {v4 .. v10}, Ley0/g;->n(Lcy0/c$d;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lf0/r1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_2
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lcy0/c;Lkotlin/jvm/functions/Function1;Lg1/y3;Ljava/lang/String;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Ley0/i;->o(Lcy0/c;Lkotlin/jvm/functions/Function1;Lg1/y3;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final s(Lcy0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcy0/c;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v7, p4

    const-string v1, "viewState"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v1, 0x395af879

    invoke-virtual {v12, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v7, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v7

    goto :goto_1

    :cond_1
    move v1, v7

    :goto_1
    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    :cond_2
    move-object/from16 v3, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v7, 0x30

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    :goto_3
    and-int/lit8 v4, p5, 0x4

    const/16 v5, 0x100

    if-eqz v4, :cond_6

    or-int/lit16 v1, v1, 0x180

    :cond_5
    move-object/from16 v6, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v7, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    move v8, v5

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v1, v8

    :goto_5
    and-int/lit16 v8, v1, 0x93

    const/16 v9, 0x92

    const/4 v15, 0x0

    const/16 v16, 0x1

    if-eq v8, v9, :cond_8

    move/from16 v8, v16

    goto :goto_6

    :cond_8
    move v8, v15

    :goto_6
    and-int/lit8 v9, v1, 0x1

    invoke-virtual {v12, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_12

    if-eqz v2, :cond_9

    const-string v2, ""

    move-object v3, v2

    :cond_9
    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_b

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_a

    new-instance v4, Lev2/b;

    const/16 v6, 0xa

    invoke-direct {v4, v6}, Lev2/b;-><init>(I)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_b
    move-object v4, v6

    :goto_7
    sget-object v8, Lg1/z3;->w:Lg1/z3;

    const/4 v13, 0x6

    const/16 v14, 0xe

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v14}, Landroidx/compose/material/c;->c(Lg1/z3;Ld0/e2;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)Lg1/y3;

    move-result-object v6

    invoke-virtual {v0}, Lcy0/c;->a()Ltu1/a;

    move-result-object v8

    sget v9, Ltu1/a;->d:I

    invoke-static {v8, v12}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v2, :cond_c

    invoke-static {v12}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v9

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v9, Lbc3/c0;

    invoke-virtual {v0}, Lcy0/c;->a()Ltu1/a;

    move-result-object v10

    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v11, v13

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v11, v13

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    const/4 v14, 0x0

    if-nez v11, :cond_d

    if-ne v13, v2, :cond_e

    :cond_d
    new-instance v13, Ley0/i$a;

    invoke-direct {v13, v9, v0, v6, v14}, Ley0/i$a;-><init>(Lbc3/c0;Lcy0/c;Lg1/y3;Lq83/d;)V

    invoke-virtual {v12, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v13, Lc93/m;

    invoke-static {v12, v13, v10}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v12, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    and-int/lit16 v10, v1, 0x380

    if-ne v10, v5, :cond_f

    move/from16 v15, v16

    :cond_f
    or-int v5, v9, v15

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v5, :cond_10

    if-ne v9, v2, :cond_11

    :cond_10
    new-instance v9, Ley0/i$b;

    invoke-direct {v9, v6, v4, v8, v14}, Ley0/i$b;-><init>(Lg1/y3;Lkotlin/jvm/functions/Function1;Lp1/t2;Lq83/d;)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v9, Lc93/m;

    invoke-static {v12, v9, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v2, v1, 0xe

    shr-int/lit8 v5, v1, 0x3

    and-int/lit8 v5, v5, 0x70

    or-int/2addr v2, v5

    or-int/lit16 v2, v2, 0x200

    shl-int/lit8 v1, v1, 0x6

    and-int/lit16 v1, v1, 0x1c00

    or-int v5, v2, v1

    move-object v2, v6

    const/4 v6, 0x0

    move-object v1, v4

    move-object v4, v12

    invoke-static/range {v0 .. v6}, Ley0/i;->o(Lcy0/c;Lkotlin/jvm/functions/Function1;Lg1/y3;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v3

    move-object v3, v1

    goto :goto_8

    :cond_12
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v2, v3

    move-object v3, v6

    :goto_8
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_13

    new-instance v0, Ley0/h;

    const/4 v6, 0x1

    move-object/from16 v1, p0

    move/from16 v5, p5

    move v4, v7

    invoke-direct/range {v0 .. v6}, Ley0/h;-><init>(Lcy0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final t(Lcy0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lp1/t2;)Ltu1/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Ltu1/a;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ltu1/a;

    return-object p0
.end method

.method private static final v(Lcy0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Ley0/i;->s(Lcy0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final w(Lcy0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcy0/c;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, p3

    check-cast v8, Lp1/q;

    const p3, 0x58c12241

    invoke-virtual {v8, p3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p3, v4, 0x6

    if-nez p3, :cond_1

    invoke-virtual {v8, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    const/4 p3, 0x4

    goto :goto_0

    :cond_0
    const/4 p3, 0x2

    :goto_0
    or-int/2addr p3, v4

    goto :goto_1

    :cond_1
    move p3, v4

    :goto_1
    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_2

    or-int/lit8 p3, p3, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v1, v4, 0x30

    if-nez v1, :cond_4

    invoke-virtual {v8, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x20

    goto :goto_2

    :cond_3
    const/16 v1, 0x10

    :goto_2
    or-int/2addr p3, v1

    :cond_4
    :goto_3
    and-int/lit8 v1, p5, 0x4

    if-eqz v1, :cond_5

    or-int/lit16 p3, p3, 0x180

    goto :goto_5

    :cond_5
    and-int/lit16 v2, v4, 0x180

    if-nez v2, :cond_7

    invoke-virtual {v8, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x100

    goto :goto_4

    :cond_6
    const/16 v2, 0x80

    :goto_4
    or-int/2addr p3, v2

    :cond_7
    :goto_5
    and-int/lit16 v2, p3, 0x93

    const/16 v3, 0x92

    const/4 v11, 0x0

    if-eq v2, v3, :cond_8

    const/4 v2, 0x1

    goto :goto_6

    :cond_8
    move v2, v11

    :goto_6
    and-int/lit8 v3, p3, 0x1

    invoke-virtual {v8, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_e

    if-eqz v0, :cond_9

    const-string p1, ""

    :cond_9
    move-object v6, p1

    if-eqz v1, :cond_b

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p1, p2, :cond_a

    new-instance p1, Lev2/b;

    const/16 p2, 0x9

    invoke-direct {p1, p2}, Lev2/b;-><init>(I)V

    invoke-virtual {v8, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object p2, p1

    check-cast p2, Lkotlin/jvm/functions/Function1;

    :cond_b
    move-object v7, p2

    invoke-virtual {p0}, Lcy0/c;->b()Lcy0/c$c;

    move-result-object p1

    if-eqz p1, :cond_c

    const p1, 0x2d01ace8

    invoke-virtual {v8, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lcy0/c;->b()Lcy0/c$c;

    move-result-object p1

    shr-int/lit8 p2, p3, 0x3

    and-int/lit8 p2, p2, 0x70

    invoke-static {p1, v7, v8, p2}, Ley0/d;->j(Lcy0/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_c
    invoke-virtual {p0}, Lcy0/c;->c()Lcy0/c$d;

    move-result-object p1

    if-eqz p1, :cond_d

    const p1, 0x2d01bb2f

    invoke-virtual {v8, p1}, Lp1/q;->e0(I)V

    and-int/lit16 v9, p3, 0x3fe

    const/4 v10, 0x0

    move-object v5, p0

    invoke-static/range {v5 .. v10}, Ley0/i;->s(Lcy0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_d
    const p1, 0x73366ea1

    invoke-virtual {v8, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    :goto_7
    move-object v2, v6

    move-object v3, v7

    goto :goto_8

    :cond_e
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v2, p1

    move-object v3, p2

    :goto_8
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_f

    new-instance v0, Ley0/h;

    const/4 v6, 0x0

    move-object v1, p0

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ley0/h;-><init>(Lcy0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method public static final x(Ljava/lang/String;Ljava/lang/String;Lby0/c;Lby0/a;Lcy0/a$i;Landroidx/compose/runtime/Composer;I)V
    .locals 25

    move-object/from16 v1, p0

    move-object/from16 v7, p2

    move-object/from16 v4, p3

    move-object/from16 v2, p4

    move/from16 v8, p6

    const-string v0, "pillar"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navRouter"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionRouter"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "screenViewEvent"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v0, -0x7185f76e

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v8

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    and-int/lit8 v5, v8, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-virtual {v12, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x20

    goto :goto_2

    :cond_2
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v0, v9

    goto :goto_3

    :cond_3
    move-object/from16 v5, p1

    :goto_3
    and-int/lit16 v9, v8, 0x180

    if-nez v9, :cond_5

    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x100

    goto :goto_4

    :cond_4
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v0, v9

    :cond_5
    and-int/lit16 v9, v8, 0xc00

    if-nez v9, :cond_7

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x800

    goto :goto_5

    :cond_6
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v0, v9

    :cond_7
    and-int/lit16 v9, v8, 0x6000

    const/16 v15, 0x4000

    if-nez v9, :cond_9

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    move v9, v15

    goto :goto_6

    :cond_8
    const/16 v9, 0x2000

    :goto_6
    or-int/2addr v0, v9

    :cond_9
    and-int/lit16 v9, v0, 0x2493

    const/16 v10, 0x2492

    const/16 v16, 0x1

    const/4 v11, 0x0

    if-eq v9, v10, :cond_a

    move/from16 v9, v16

    goto :goto_7

    :cond_a
    move v9, v11

    :goto_7
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v12, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_15

    const v9, -0x649fae96

    invoke-virtual {v12, v9}, Lp1/q;->f0(I)V

    sget-object v9, Lpf3/a;->b:Lnf3/a;

    if-eqz v9, :cond_14

    iget-object v9, v9, Lnf3/a;->a:Lwf3/a;

    iget-object v9, v9, Lwf3/a;->d:Lxf3/c;

    const v10, -0x649fad62

    const v13, -0x384098

    invoke-static {v12, v10, v12, v11, v13}, Lvl/b;->r(Lp1/q;ILp1/q;ZI)Ljf3/a;

    move-result-object v10

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    invoke-virtual {v12, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    or-int v14, v14, v17

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-nez v14, :cond_b

    if-ne v6, v3, :cond_c

    :cond_b
    sget-object v6, Ll83/i;->y:Ll83/i;

    new-instance v14, Ley0/i$c;

    invoke-direct {v14, v9, v13, v13, v10}, Ley0/i$c;-><init>(Lxf3/c;Lvf3/a;Lc93/a;Ljf3/a;)V

    invoke-static {v6, v14}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v6

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    check-cast v6, Ll83/h;

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    invoke-static {v6}, Ley0/i;->y(Ll83/h;)Lcy0/b;

    move-result-object v9

    invoke-virtual {v9}, Lcy0/b;->getViewState()Lec3/l;

    move-result-object v9

    new-instance v10, Lcy0/c;

    new-instance v18, Lcy0/c$c;

    sget-object v13, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v13}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v19

    const/16 v23, 0xe

    const/16 v24, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v18 .. v24}, Lcy0/c$c;-><init>(Lsz0/q0;Lcy0/a;Lcy0/a;Lcy0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v22, 0x5

    const/16 v23, 0x0

    const/16 v19, 0x0

    move-object/from16 v20, v18

    move-object/from16 v18, v10

    invoke-direct/range {v18 .. v23}, Lcy0/c;-><init>(Ltu1/a;Lcy0/c$c;Lcy0/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v13, 0x0

    const/4 v14, 0x2

    move/from16 v18, v11

    const/4 v11, 0x0

    invoke-static/range {v9 .. v14}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v9

    invoke-static {v6}, Ley0/i;->y(Ll83/h;)Lcy0/b;

    move-result-object v10

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    const v13, 0xe000

    and-int/2addr v13, v0

    if-ne v13, v15, :cond_d

    move/from16 v13, v16

    goto :goto_8

    :cond_d
    move/from16 v13, v18

    :goto_8
    or-int/2addr v11, v13

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v11, v13

    and-int/lit8 v13, v0, 0xe

    const/4 v14, 0x4

    if-ne v13, v14, :cond_e

    move/from16 v13, v16

    goto :goto_9

    :cond_e
    move/from16 v13, v18

    :goto_9
    or-int/2addr v11, v13

    and-int/lit8 v13, v0, 0x70

    const/16 v14, 0x20

    if-ne v13, v14, :cond_f

    goto :goto_a

    :cond_f
    move/from16 v16, v18

    :goto_a
    or-int v11, v11, v16

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v11, :cond_10

    if-ne v13, v3, :cond_11

    :cond_10
    move v11, v0

    goto :goto_b

    :cond_11
    move v11, v0

    move-object v5, v6

    move-object v0, v13

    move-object v13, v3

    move-object v6, v4

    goto :goto_c

    :goto_b
    new-instance v0, Ley0/i$d;

    move-object v5, v6

    const/4 v6, 0x0

    move-object v13, v3

    move-object v3, v1

    move-object v1, v4

    move-object/from16 v4, p1

    invoke-direct/range {v0 .. v6}, Ley0/i$d;-><init>(Lby0/a;Lcy0/a$i;Ljava/lang/String;Ljava/lang/String;Ll83/h;Lq83/d;)V

    move-object v6, v1

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_c
    check-cast v0, Lc93/m;

    invoke-static {v12, v0, v10}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9}, Ley0/i;->z(Lp1/t2;)Lcy0/c;

    move-result-object v0

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_12

    if-ne v2, v13, :cond_13

    :cond_12
    new-instance v2, Lep1/g;

    const/4 v1, 0x3

    invoke-direct {v2, v6, v7, v5, v1}, Lep1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v2, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v1, v11, 0x3

    and-int/lit8 v4, v1, 0x70

    const/4 v5, 0x0

    move-object/from16 v1, p0

    move-object v3, v12

    invoke-static/range {v0 .. v5}, Ley0/i;->w(Lcy0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_d

    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "KoinApplication has not been started"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    move-object v6, v4

    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_16

    new-instance v0, Laq1/c;

    const/16 v7, 0x9

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move-object v4, v6

    move v6, v8

    invoke-direct/range {v0 .. v7}, Laq1/c;-><init>(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final y(Ll83/h;)Lcy0/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")",
            "Lcy0/b;"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcy0/b;

    return-object p0
.end method

.method private static final z(Lp1/t2;)Lcy0/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lcy0/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcy0/c;

    return-object p0
.end method
