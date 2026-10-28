.class public abstract Lio2/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a-\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u000f\u0010\u000c\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a;\u0010\u0013\u001a\u00020\u00062\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0015H\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\"\u001d\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001e\u00b2\u0006\u000e\u0010\u001d\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lio2/o0;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "F",
        "(Landroidx/compose/ui/Modifier;Lio2/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "w",
        "(Lio2/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "s",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "Lio2/p0;",
        "tags",
        "",
        "cartId",
        "o",
        "(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lio2/n0$a;",
        "u",
        "(Lio2/n0$a;Landroidx/compose/runtime/Composer;I)V",
        "a",
        "Ljava/util/List;",
        "getPromoCodeViewStates",
        "()Ljava/util/List;",
        "PromoCodeViewStates",
        "promoCode",
        "universal-checkout_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio2/o0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    sget-object v0, Lro2/a;->a:Lro2/a;

    invoke-virtual {v0}, Lro2/a;->a()Lio2/o0;

    move-result-object v1

    invoke-virtual {v0}, Lro2/a;->b()Lio2/o0;

    move-result-object v2

    invoke-virtual {v0}, Lro2/a;->d()Lio2/o0;

    move-result-object v3

    invoke-virtual {v0}, Lro2/a;->e()Lio2/o0;

    move-result-object v4

    invoke-virtual {v0}, Lro2/a;->c()Lio2/o0;

    move-result-object v5

    invoke-virtual {v0}, Lro2/a;->f()Lio2/o0;

    move-result-object v6

    filled-new-array/range {v1 .. v6}, [Lio2/o0;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lio2/m0;->a:Ljava/util/List;

    return-void
.end method

.method private static final A(Lio2/o0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 28

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual/range {p0 .. p0}, Lio2/o0;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v2, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v1, v2, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    invoke-virtual {v1, v2, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v4

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v26, v1, 0x12

    const v27, 0x2fffa

    const/4 v3, 0x0

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

    move-object/from16 v24, v2

    move-object v2, v0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    move-object/from16 v24, v2

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final B()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final C(Lio2/o0;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p3}, Lio2/m0;->z(Lp1/c1;Ljava/lang/String;)V

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lio2/o0;->g()Lio2/n0;

    move-result-object p0

    instance-of p0, p0, Lio2/n0$a;

    if-eqz p0, :cond_0

    sget-object p0, Lio2/h0;->a:Lio2/h0;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lkotlin/jvm/functions/Function1;Lio2/o0;Lp1/c1;)Ll83/a0;
    .locals 1

    new-instance v0, Lio2/g0;

    invoke-virtual {p1}, Lio2/o0;->e()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2}, Lio2/m0;->y(Lp1/c1;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lio2/g0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lio2/o0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lio2/m0;->w(Lio2/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final F(Landroidx/compose/ui/Modifier;Lio2/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lio2/o0;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v0, -0x483200e4

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v2, v1, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v1, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v9, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v1

    :goto_1
    and-int/lit8 v4, v1, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, p5, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v7, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v7, v1, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v9, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_3

    :cond_7
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v3, v8

    :goto_4
    and-int/lit16 v8, v3, 0x93

    const/16 v10, 0x92

    if-eq v8, v10, :cond_8

    const/4 v8, 0x1

    goto :goto_5

    :cond_8
    const/4 v8, 0x0

    :goto_5
    and-int/lit8 v10, v3, 0x1

    invoke-virtual {v9, v10, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_19

    sget-object v8, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object v2, v8

    :cond_9
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_b

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_a

    new-instance v4, Lio2/e;

    const/4 v7, 0x6

    invoke-direct {v4, v7}, Lio2/e;-><init>(I)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_b
    move-object v4, v7

    :goto_6
    invoke-virtual {v5}, Lio2/o0;->g()Lio2/n0;

    move-result-object v7

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const-wide/high16 v14, 0x3ff8000000000000L    # 1.5

    double-to-float v14, v14

    const/16 v15, 0x8

    int-to-float v15, v15

    mul-float/2addr v14, v15

    invoke-static {v14}, Ll0/m;->i(F)Ll0/k;

    move-result-object v14

    sget-object v10, Lb2/e;->M:Lb2/k;

    const/4 v12, 0x6

    invoke-static {v14, v10, v9, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v14

    iget-wide v11, v9, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v9, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v17, v10

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v6, v9, Lp1/q;->S:Z

    if-eqz v6, :cond_c

    invoke-virtual {v9, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_c
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_7
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v9, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v9, v14, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v1, v9, Lp1/q;->S:Z

    if-nez v1, :cond_d

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v32, v2

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    goto :goto_8

    :cond_d
    move-object/from16 v32, v2

    :goto_8
    invoke-static {v11, v9, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v9, v1, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit16 v2, v3, 0x380

    const/16 v11, 0x100

    if-ne v2, v11, :cond_f

    const/4 v11, 0x1

    goto :goto_9

    :cond_f
    const/4 v11, 0x0

    :goto_9
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v11, :cond_10

    if-ne v13, v0, :cond_11

    :cond_10
    new-instance v13, Lif0/b;

    const/4 v0, 0x6

    invoke-direct {v13, v4, v0}, Lif0/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v13, Lc93/a;

    const/4 v0, 0x0

    const/4 v11, 0x3

    move/from16 v33, v2

    const/4 v2, 0x0

    invoke-static {v8, v2, v0, v13, v11}, Landroidx/room/c1;->i(Landroidx/compose/ui/Modifier;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v5}, Lio2/o0;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v13, v9, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v13, v9, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lb91/d;->b()Lb91/a;

    move-result-object v26

    invoke-virtual {v13, v9, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->d1()J

    move-result-wide v19

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v30, v11, 0x12

    const v31, 0x2fef8

    move-object v13, v10

    const-wide/16 v10, 0x0

    move-object/from16 v21, v12

    const/4 v12, 0x0

    move-object/from16 v22, v13

    const/4 v13, 0x0

    move-object/from16 v23, v14

    const/4 v14, 0x0

    move/from16 v24, v15

    const/16 v25, 0x0

    const-wide/16 v15, 0x0

    move-object/from16 v27, v17

    sget-object v17, Lw3/l;->c:Lw3/l;

    const/16 v28, 0x3

    const/16 v18, 0x0

    move-object/from16 v34, v8

    move/from16 v29, v28

    move-object/from16 v28, v9

    move-wide/from16 v8, v19

    const-wide/16 v19, 0x0

    move-object/from16 v35, v21

    const/16 v21, 0x0

    move-object/from16 v36, v22

    const/16 v22, 0x0

    move-object/from16 v37, v23

    const/16 v23, 0x0

    move/from16 v38, v24

    const/16 v24, 0x0

    move/from16 v39, v25

    const/16 v25, 0x0

    move-object/from16 v40, v27

    const/16 v27, 0x0

    move/from16 v41, v29

    const/high16 v29, 0x6000000

    move-object/from16 p0, v7

    move-object v7, v0

    move-object/from16 v0, v36

    move-object/from16 v36, v4

    move-object v4, v6

    move-object v6, v2

    move/from16 v2, v38

    move-object/from16 v38, v37

    move-object/from16 v37, v35

    move-object/from16 v35, p0

    move-object/from16 p0, v1

    move-object/from16 v5, v34

    const/high16 v1, 0x3f800000    # 1.0f

    move/from16 v34, v3

    move-object/from16 v3, v40

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    invoke-virtual/range {p1 .. p1}, Lio2/o0;->j()Z

    move-result v6

    if-eqz v6, :cond_18

    const v6, 0x3977028f

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    invoke-static {v1, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v5, 0x1

    int-to-float v6, v5

    const/4 v7, 0x6

    invoke-static {v6, v2, v3, v9, v7}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v2

    iget-wide v6, v9, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v9, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-eqz v7, :cond_12

    invoke-virtual {v9, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_12
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v9, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, v38

    invoke-static {v9, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v9, Lp1/q;->S:Z

    if-nez v0, :cond_13

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    :cond_13
    move-object/from16 v0, v37

    goto :goto_c

    :cond_14
    :goto_b
    move-object/from16 v0, p0

    goto :goto_d

    :goto_c
    invoke-static {v3, v9, v3, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_b

    :goto_d
    invoke-static {v9, v0, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v34, 0x3

    and-int/lit8 v0, v0, 0x7e

    move-object/from16 v1, p1

    move-object/from16 v8, v36

    const/4 v2, 0x0

    invoke-static {v1, v8, v9, v0, v2}, Lio2/m0;->w(Lio2/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v0, v35

    instance-of v3, v0, Lio2/n0$a;

    if-eqz v3, :cond_15

    const v3, -0x4584bd4a

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    move-object v7, v0

    check-cast v7, Lio2/n0$a;

    invoke-static {v7, v9, v2}, Lio2/m0;->u(Lio2/n0$a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_15
    const v3, -0x458376b3

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual {v1}, Lio2/o0;->h()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_16

    const v3, -0x4582a3a2

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lio2/o0;->h()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v1}, Lio2/o0;->e()Ljava/lang/String;

    move-result-object v7

    const/4 v11, 0x0

    move/from16 v10, v33

    invoke-static/range {v6 .. v11}, Lio2/m0;->o(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_16
    const v3, -0x45808ad3

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    :goto_f
    instance-of v0, v0, Lio2/n0$b;

    if-eqz v0, :cond_17

    const v0, -0x457f95bb

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-static {v9, v2}, Lio2/m0;->s(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_17
    const v0, -0x457e8773

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_18
    move-object/from16 v1, p1

    move-object/from16 v8, v36

    const/4 v2, 0x0

    const/4 v5, 0x1

    const v0, 0x3981fe3c

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    move-object v6, v8

    move-object/from16 v4, v32

    goto :goto_12

    :cond_19
    move-object v1, v5

    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v4, v2

    move-object v6, v7

    :goto_12
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1a

    new-instance v0, Lhy0/v;

    const/16 v3, 0x14

    move/from16 v2, p5

    move-object v5, v1

    move/from16 v1, p4

    invoke-direct/range {v0 .. v6}, Lhy0/v;-><init>(IIILandroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final G(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lio2/j0;->a:Lio2/j0;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Landroidx/compose/ui/Modifier;Lio2/o0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lio2/m0;->F(Landroidx/compose/ui/Modifier;Lio2/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic J(Lp1/c1;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lio2/m0;->z(Lp1/c1;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lio2/m0;->G(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lio2/o0;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lio2/m0;->D(Lkotlin/jvm/functions/Function1;Lio2/o0;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lio2/m0;->t(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lio2/o0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lio2/m0;->E(Lio2/o0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lio2/m0;->x(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ll83/a0;
    .locals 1

    move-object v0, p1

    move-object p1, p0

    move-object p0, v0

    move-object v0, p3

    move p3, p2

    move-object p2, v0

    move v0, p5

    move-object p5, p4

    move p4, v0

    invoke-static/range {p0 .. p6}, Lio2/m0;->r(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lio2/n0$a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio2/m0;->v(Lio2/n0$a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lio2/o0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lio2/m0;->A(Lio2/o0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Landroidx/compose/ui/Modifier;Lio2/o0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lio2/m0;->I(Landroidx/compose/ui/Modifier;Lio2/o0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j()Ll83/a0;
    .locals 1

    invoke-static {}, Lio2/m0;->B()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic k(Lio2/o0;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio2/m0;->C(Lio2/o0;Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lio2/m0;->p(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lio2/m0;->H(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio2/m0;->q(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio2/p0;",
            ">;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v0, -0x65339d55

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v3, v4, 0x30

    const/16 v5, 0x20

    if-nez v3, :cond_3

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move v3, v5

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit8 v3, p5, 0x4

    const/16 v6, 0x100

    if-eqz v3, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v7, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_4

    move-object/from16 v7, p2

    invoke-virtual {v14, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    move v8, v6

    goto :goto_3

    :cond_6
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v0, v8

    :goto_4
    and-int/lit16 v8, v0, 0x93

    const/16 v9, 0x92

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v8, v9, :cond_7

    move v8, v11

    goto :goto_5

    :cond_7
    move v8, v10

    :goto_5
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v14, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_e

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_9

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v8, :cond_8

    new-instance v3, Lio2/e;

    const/4 v7, 0x7

    invoke-direct {v3, v7}, Lio2/e;-><init>(I)V

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_9
    move-object v3, v7

    :goto_6
    const-wide/high16 v12, 0x3fe0000000000000L    # 0.5

    double-to-float v7, v12

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v7, v9

    invoke-static {v7}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    and-int/lit16 v12, v0, 0x380

    if-ne v12, v6, :cond_a

    move v6, v11

    goto :goto_7

    :cond_a
    move v6, v10

    :goto_7
    or-int/2addr v6, v9

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v5, :cond_b

    move v10, v11

    :cond_b
    or-int v0, v6, v10

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_c

    if-ne v5, v8, :cond_d

    :cond_c
    new-instance v5, La23/a;

    invoke-direct {v5, v1, v3, v2}, La23/a;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object v13, v5

    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/16 v15, 0x6000

    const/16 v16, 0x1ef

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v5 .. v16}, Lkotlin/jvm/internal/j;->d(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/i;Lb2/g;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_8

    :cond_e
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v3, v7

    :goto_8
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_f

    new-instance v0, Lio2/l0;

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lio2/l0;-><init>(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final p(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ln0/q;)Ll83/a0;
    .locals 3

    const-string v0, "$this$LazyRow"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio2/m0$b;->w:Lio2/m0$b;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Lio2/m0$c;

    invoke-direct {v2, v0, p0}, Lio2/m0$c;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v0, Lio2/m0$d;

    invoke-direct {v0, p0, p1, p2}, Lio2/m0$d;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    new-instance p0, Lx1/b;

    const/4 p1, 0x1

    const p2, 0x2fd4df92

    invoke-direct {p0, v0, p1, p2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    check-cast p3, Ln0/f;

    const/4 p1, 0x0

    invoke-virtual {p3, v1, p1, v2, p0}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lio2/m0;->o(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Landroidx/compose/runtime/Composer;I)V
    .locals 12

    move-object v9, p0

    check-cast v9, Lp1/q;

    const p0, -0x7c9e26d

    invoke-virtual {v9, p0}, Lp1/q;->g0(I)Lp1/q;

    const/4 p0, 0x1

    if-eqz p1, :cond_0

    move v0, p0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {v9, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object v0, Ll0/m;->e:Ll0/h;

    sget-object v1, Lb2/e;->N:Lb2/k;

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v4, 0x36

    invoke-static {v0, v1, v9, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v4, v9, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v9, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v6, v9, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {v9, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_1
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v9, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v9, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v4, v9, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v1, v9, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v9, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x2

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    invoke-static {v0, v1, v3, v9}, Ld;->w(FFLb2/t;Lp1/q;)V

    const/16 v0, 0x12

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v1, Lgy0/e;->d:I

    invoke-static {v1}, Lv41/r0$d;->b(I)I

    move-result v1

    invoke-static {v1}, Lv41/r0$d;->a(I)Lv41/r0$d;

    move-result-object v1

    const/4 v10, 0x6

    const/16 v11, 0x1fc

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v11}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, p0}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_5

    new-instance v0, Lhy0/e0;

    const/16 v1, 0x9

    invoke-direct {v0, p1, v1}, Lhy0/e0;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final t(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lio2/m0;->s(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lio2/n0$a;Landroidx/compose/runtime/Composer;I)V
    .locals 28

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, 0x16fd96d2

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_2

    and-int/lit8 v3, v1, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    or-int/2addr v3, v1

    goto :goto_2

    :cond_2
    move v3, v1

    :goto_2
    and-int/lit8 v5, v3, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v5, v4, :cond_3

    move v4, v7

    goto :goto_3

    :cond_3
    move v4, v6

    :goto_3
    and-int/2addr v3, v7

    invoke-virtual {v2, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v0}, Lio2/n0$a;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v2, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v2, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->c()Lb91/a;

    move-result-object v22

    invoke-virtual {v0}, Lio2/n0$a;->a()Ly81/f;

    move-result-object v4

    invoke-virtual {v4, v2, v6}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v26, v6, 0x12

    const v27, 0x2fffa

    move-object/from16 v24, v2

    move-object v2, v3

    const/4 v3, 0x0

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

    goto :goto_4

    :cond_4
    move-object/from16 v24, v2

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    :goto_4
    invoke-virtual/range {v24 .. v24}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_5

    new-instance v3, Ld71/c;

    const/16 v4, 0x19

    invoke-direct {v3, v0, v1, v4}, Ld71/c;-><init>(Ljava/lang/Object;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final v(Lio2/n0$a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lio2/m0;->u(Lio2/n0$a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lio2/o0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 54
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio2/o0;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v2, -0x3b604fdb

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p3, 0x6

    const/4 v3, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v5, p4, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move-object/from16 v8, p1

    :goto_2
    move/from16 v30, v2

    goto :goto_4

    :cond_3
    and-int/lit8 v8, p3, 0x30

    if-nez v8, :cond_2

    move-object/from16 v8, p1

    invoke-virtual {v0, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_3

    :cond_4
    const/16 v9, 0x10

    :goto_3
    or-int/2addr v2, v9

    goto :goto_2

    :goto_4
    and-int/lit8 v2, v30, 0x13

    const/16 v9, 0x12

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eq v2, v9, :cond_5

    move v2, v10

    goto :goto_5

    :cond_5
    move v2, v11

    :goto_5
    and-int/lit8 v12, v30, 0x1

    invoke-virtual {v0, v12, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_19

    const/16 v2, 0x8

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_7

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v12, :cond_6

    new-instance v5, Lio2/e;

    invoke-direct {v5, v2}, Lio2/e;-><init>(I)V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_7
    move-object v5, v8

    :goto_6
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v12, :cond_8

    const-string v8, ""

    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v8, Lp1/c1;

    invoke-virtual {v1}, Lio2/o0;->g()Lio2/n0;

    move-result-object v13

    instance-of v14, v13, Lio2/n0$a;

    if-eqz v14, :cond_9

    const v15, 0x1b746238

    invoke-virtual {v0, v15}, Lp1/q;->e0(I)V

    move-object v15, v13

    check-cast v15, Lio2/n0$a;

    invoke-virtual {v15}, Lio2/n0$a;->a()Ly81/f;

    move-result-object v15

    move-object/from16 p1, v5

    invoke-virtual {v15, v0, v11}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    const v15, 0x3e19999a    # 0.15f

    invoke-static {v15, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v4

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_9
    move-object/from16 p1, v5

    const v4, 0x1b7468ec

    invoke-virtual {v0, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v0, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->r()J

    move-result-wide v4

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    :goto_7
    if-eqz v14, :cond_a

    const v15, 0x1b7477f8

    invoke-virtual {v0, v15}, Lp1/q;->e0(I)V

    check-cast v13, Lio2/n0$a;

    invoke-virtual {v13}, Lio2/n0$a;->a()Ly81/f;

    move-result-object v13

    invoke-virtual {v13, v0, v11}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v15

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    :goto_8
    move-wide/from16 v18, v15

    goto :goto_9

    :cond_a
    const v13, 0x1b747eb8

    invoke-virtual {v0, v13}, Lp1/q;->e0(I)V

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v15, Lx81/d;->b:I

    invoke-virtual {v13, v0, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->f()J

    move-result-wide v15

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    goto :goto_8

    :goto_9
    invoke-virtual {v1}, Lio2/o0;->g()Lio2/n0;

    move-result-object v13

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v15, :cond_b

    if-ne v6, v12, :cond_c

    :cond_b
    new-instance v6, Lio2/m0$e;

    const/4 v15, 0x0

    invoke-direct {v6, v1, v8, v15}, Lio2/m0$e;-><init>(Lio2/o0;Lp1/c1;Lq83/d;)V

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v6, Lc93/m;

    invoke-static {v0, v6, v13}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v6, v10

    int-to-float v2, v2

    mul-float/2addr v6, v2

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    sget-object v6, Lb2/e;->J:Lb2/l;

    const/4 v13, 0x6

    invoke-static {v2, v6, v0, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    move-object v13, v8

    iget-wide v7, v0, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v20, La3/l;->a:La3/k;

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-eqz v11, :cond_d

    invoke-virtual {v0, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_d
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_a
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v0, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v0, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v8, v0, Lp1/q;->S:Z

    if-nez v8, :cond_e

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    :cond_e
    invoke-static {v7, v0, v7, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v0, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v2, 0xc

    int-to-float v2, v2

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2, v15}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/high16 v7, 0x3f800000    # 1.0f

    float-to-double v8, v7

    const-wide/16 v22, 0x0

    cmpl-double v8, v8, v22

    if-lez v8, :cond_10

    goto :goto_b

    :cond_10
    const-string v8, "invalid weight; must be greater than zero"

    invoke-static {v8}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_b
    invoke-static {v6, v10, v7}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v31

    invoke-static {v13}, Lio2/m0;->y(Lp1/c1;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v32

    const/4 v6, 0x3

    int-to-float v6, v6

    mul-float/2addr v6, v3

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v33

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v34

    sget-object v6, Lg1/i8;->a:Lg1/i8;

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v8

    invoke-virtual {v6, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v22

    invoke-virtual {v6, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v24

    invoke-virtual {v6, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->b1()J

    move-result-wide v26

    invoke-virtual {v6, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->W0()J

    move-result-wide v6

    move-object/from16 v28, v12

    move-object v11, v13

    move-wide/from16 v12, v26

    const-wide/16 v26, 0x0

    const v29, 0x1ffe82

    move/from16 v35, v14

    move-object/from16 v36, v15

    move-wide v14, v6

    move-wide v6, v4

    const-wide/16 v4, 0x0

    const/16 v37, 0x10

    const/16 v38, 0x20

    const-wide/16 v16, 0x0

    const/16 v39, 0x12

    const/16 v40, 0x0

    const-wide/16 v20, 0x0

    move/from16 v42, v2

    move/from16 v41, v3

    move-wide v2, v8

    move-wide/from16 v8, v22

    const-wide/16 v22, 0x0

    move/from16 v44, v10

    move-object/from16 v43, v11

    move-wide/from16 v10, v24

    const-wide/16 v24, 0x0

    move-object/from16 v47, v28

    move-object/from16 v50, v36

    move/from16 v49, v40

    move/from16 v46, v42

    move-object/from16 v45, v43

    move-object/from16 v28, v0

    move/from16 v0, v37

    move/from16 v43, v39

    move/from16 v42, v41

    invoke-static/range {v2 .. v29}, Lg1/i8;->h(JJJJJJJJJJJJJLandroidx/compose/runtime/Composer;I)Lg1/y1;

    move-result-object v29

    move-object/from16 v2, v28

    new-instance v3, Lhb2/f;

    invoke-direct {v3, v1, v0}, Lhb2/f;-><init>(Ljava/lang/Object;I)V

    const v0, 0xa3424e5

    invoke-static {v0, v2, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v3, v47

    if-ne v0, v3, :cond_11

    new-instance v0, Lio/getstream/chat/android/client/k;

    const/16 v4, 0x18

    invoke-direct {v0, v4}, Lio/getstream/chat/android/client/k;-><init>(I)V

    invoke-virtual {v2, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v0, Lc93/a;

    invoke-virtual {v2, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    and-int/lit8 v5, v30, 0x70

    const/16 v6, 0x20

    if-ne v5, v6, :cond_12

    const/4 v10, 0x1

    goto :goto_c

    :cond_12
    move/from16 v10, v49

    :goto_c
    or-int/2addr v4, v10

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_14

    if-ne v7, v3, :cond_13

    goto :goto_d

    :cond_13
    move-object/from16 v9, p1

    move-object/from16 v10, v45

    goto :goto_e

    :cond_14
    :goto_d
    new-instance v7, Lig0/h;

    const/16 v4, 0x13

    move-object/from16 v9, p1

    move-object/from16 v10, v45

    invoke-direct {v7, v1, v9, v10, v4}, Lig0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v2, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_e
    check-cast v7, Lkotlin/jvm/functions/Function1;

    sget v45, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v4, v45, 0x3

    const/high16 v11, 0x180000

    or-int/2addr v4, v11

    shl-int/lit8 v11, v45, 0x18

    or-int v36, v4, v11

    const v40, 0x38ffbcbc

    const/16 v41, 0x0

    const/4 v4, 0x0

    move v11, v5

    const/4 v5, 0x0

    move/from16 v48, v6

    const/4 v6, 0x0

    move-object v13, v10

    move-object/from16 v10, v34

    move-object/from16 v34, v7

    const/4 v7, 0x0

    move-object v12, v9

    const/4 v9, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    move-object v15, v13

    const/4 v13, 0x0

    move-object/from16 v16, v14

    move-object/from16 v17, v15

    const-wide/16 v14, 0x0

    move-object/from16 v18, v16

    const/16 v16, 0x0

    move-object/from16 v19, v17

    const/16 v17, 0x1

    move-object/from16 v20, v18

    const/16 v18, 0x0

    move-object/from16 v21, v19

    const/16 v19, 0x0

    move-object/from16 v22, v20

    const/16 v20, 0x0

    move-object/from16 v23, v21

    const/16 v21, 0x0

    move-object/from16 v24, v22

    const/16 v22, 0x0

    move-object/from16 v25, v23

    const/16 v23, 0x0

    move-object/from16 v26, v24

    const/16 v24, 0x0

    move-object/from16 v27, v25

    const/16 v25, 0x0

    move-object/from16 v28, v26

    const/16 v26, 0x0

    move-object/from16 v30, v27

    const-string v27, "promo-code-input"

    move-object/from16 v37, v30

    const/16 v30, 0x0

    move/from16 v38, v11

    move/from16 v11, v35

    move-object/from16 v35, v2

    move-object/from16 v2, v31

    const/16 v31, 0x0

    move-object/from16 v47, v3

    move-object/from16 v3, v32

    const/16 v32, 0x0

    move-object/from16 v39, v37

    const/16 v37, 0x6000

    move/from16 v51, v38

    const/16 v38, 0x6000

    move-object/from16 v52, v39

    const/16 v39, 0x6

    move-object/from16 p1, v28

    move-object/from16 v28, v33

    move-object/from16 v53, v47

    move/from16 v1, v48

    move-object/from16 v33, v0

    move/from16 v0, v51

    invoke-static/range {v2 .. v41}, Lqz0/k;->l(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lb91/a;Lc93/m;Lc93/m;Lqz0/c;Lcom/whoop/design/util/TextResource;ZZLb91/a;JZIIIZLq3/g0;ZZIZLj0/i;Ljava/lang/String;Li2/a1;Lg1/e8;Ll0/k1;Ll0/k1;Lu0/q0;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIIIII)V

    move-object/from16 v2, v35

    invoke-virtual/range {p0 .. p0}, Lio2/o0;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const/4 v3, 0x2

    int-to-float v3, v3

    mul-float v12, v3, v42

    invoke-static/range {v52 .. v52}, Lio2/m0;->y(Lp1/c1;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_15

    const/4 v3, 0x1

    :goto_f
    move/from16 v4, v46

    move-object/from16 v5, v50

    goto :goto_10

    :cond_15
    move/from16 v3, v49

    goto :goto_f

    :goto_10
    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    if-ne v0, v1, :cond_16

    const/4 v10, 0x1

    :goto_11
    move-object/from16 v1, p0

    goto :goto_12

    :cond_16
    move/from16 v10, v49

    goto :goto_11

    :goto_12
    invoke-virtual {v2, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v10

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_18

    move-object/from16 v0, v53

    if-ne v5, v0, :cond_17

    goto :goto_13

    :cond_17
    move-object/from16 v6, p1

    goto :goto_14

    :cond_18
    :goto_13
    new-instance v5, Lim1/a0;

    const/4 v0, 0x7

    move-object/from16 v6, p1

    move-object/from16 v13, v52

    invoke-direct {v5, v6, v1, v13, v0}, Lim1/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v2, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_14
    move-object v15, v5

    check-cast v15, Lc93/a;

    shl-int/lit8 v0, v45, 0x12

    or-int/lit16 v0, v0, 0x186

    const/16 v18, 0x6

    const/16 v19, 0x1bb8

    move-object/from16 v35, v2

    move-object v2, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v28, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v17, v0

    move-object/from16 v16, v35

    invoke-static/range {v2 .. v19}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v16

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    move-object/from16 v3, v28

    goto :goto_15

    :cond_19
    move-object v2, v0

    invoke-virtual {v2}, Lp1/q;->X()V

    move-object v3, v8

    :goto_15
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1a

    new-instance v0, Lio2/k0;

    const/4 v5, 0x0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lio2/k0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final x(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final z(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method
