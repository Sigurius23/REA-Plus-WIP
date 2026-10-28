.class public abstract Lb90/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb90/f$g;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000f\u00b2\u0006\u000e\u0010\t\u001a\u00020\u00088\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u000c\u001a\u00020\n8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\r\u001a\u00020\n8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u000e\u001a\u00020\n8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lb90/g;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "l",
        "(Lb90/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "passwordValue",
        "",
        "hidePassword",
        "submitEnabled",
        "hasBeenFocusedPassword",
        "isKeyboardOpen",
        "activation_release"
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
.method private static final A(Lp1/c1;)Ljava/lang/String;
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

.method private static final B(Lp1/c1;Ljava/lang/String;)V
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

.method private static final C(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final D(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final E(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final F(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic G(Lp1/c1;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lb90/f;->A(Lp1/c1;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic H(Lp1/c1;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lb90/f;->B(Lp1/c1;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic I(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lb90/f;->F(Lp1/c1;Z)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lg80/i;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lb90/f;->r(Lkotlin/jvm/functions/Function1;Lg80/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lg2/i;Lu0/p0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lb90/f;->u(Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Li3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lb90/f;->s(Li3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lb90/g;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lb90/f;->v(Lkotlin/jvm/functions/Function1;Lb90/g;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lb90/f;->m(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lb90/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lb90/f;->z(Lb90/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Lg80/i;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lb90/f;->q(Lkotlin/jvm/functions/Function1;Lg80/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lb90/f;->y(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lb90/f;->w(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Lb90/g;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lb90/f;->x(Lkotlin/jvm/functions/Function1;Lb90/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Lb90/g;Lp1/c1;Lp1/c1;Lg2/v;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lb90/f;->t(Lkotlin/jvm/functions/Function1;Lb90/g;Lp1/c1;Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Lb90/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 69
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb90/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    const v0, -0x333a63cf

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x4

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

    move v0, v2

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int v0, p3, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p3

    :goto_2
    and-int/lit8 v4, p4, 0x2

    const/16 v6, 0x20

    if-eqz v4, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v7, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v7, p3, 0x30

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-virtual {v5, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    move v8, v6

    goto :goto_3

    :cond_5
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v0, v8

    :goto_4
    and-int/lit8 v8, v0, 0x13

    const/16 v9, 0x12

    const/4 v11, 0x0

    if-eq v8, v9, :cond_6

    const/4 v8, 0x1

    goto :goto_5

    :cond_6
    move v8, v11

    :goto_5
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v5, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_4e

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_8

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v8, :cond_7

    new-instance v4, Lb72/a;

    const/4 v7, 0x6

    invoke-direct {v4, v7}, Lb72/a;-><init>(I)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_8
    move-object v4, v7

    :goto_6
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v8, :cond_9

    invoke-virtual {v1}, Lb90/g;->l()Ld70/e;

    move-result-object v7

    invoke-virtual {v7}, Ld70/e;->a()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v5, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v7, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v8, :cond_a

    invoke-virtual {v1}, Lb90/g;->h()Z

    move-result v9

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    invoke-static {v9}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v9

    invoke-virtual {v5, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v9, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    const/4 v13, 0x6

    if-ne v12, v8, :cond_c

    invoke-static {v7}, Lb90/f;->A(Lp1/c1;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/String;->length()I

    move-result v12

    if-lt v12, v13, :cond_b

    const/4 v12, 0x1

    goto :goto_7

    :cond_b
    move v12, v11

    :goto_7
    invoke-static {v12, v5}, Lr80/c;->w(ZLp1/q;)Lp1/k1;

    move-result-object v12

    :cond_c
    check-cast v12, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v8, :cond_d

    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v14}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v14

    invoke-virtual {v5, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v14, Lp1/c1;

    sget-object v15, Lb3/v1;->i:Lp1/u2;

    invoke-virtual {v5, v15}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lg2/i;

    invoke-static {v5, v11}, Lk80/s;->h(Landroidx/compose/runtime/Composer;I)Lp1/t2;

    move-result-object v35

    invoke-virtual {v1}, Lb90/g;->l()Ld70/e;

    move-result-object v16

    move/from16 p1, v13

    invoke-virtual/range {v16 .. v16}, Ld70/e;->a()Ljava/lang/String;

    move-result-object v13

    move-object/from16 p2, v9

    and-int/lit8 v9, v0, 0xe

    if-eq v9, v2, :cond_f

    and-int/lit8 v16, v0, 0x8

    if-eqz v16, :cond_e

    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_e

    goto :goto_8

    :cond_e
    move/from16 v16, v11

    goto :goto_9

    :cond_f
    :goto_8
    const/16 v16, 0x1

    :goto_9
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    move/from16 v18, v9

    const/4 v9, 0x0

    if-nez v16, :cond_10

    if-ne v2, v8, :cond_11

    :cond_10
    new-instance v2, Lb90/f$a;

    invoke-direct {v2, v1, v7, v12, v9}, Lb90/f$a;-><init>(Lb90/g;Lp1/c1;Lp1/c1;Lq83/d;)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v2, Lc93/m;

    invoke-static {v5, v2, v13}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lb90/g;->k()Lg80/i;

    move-result-object v2

    if-eqz v2, :cond_12

    invoke-virtual {v2}, Lg80/i;->f()Lg80/h;

    move-result-object v2

    goto :goto_a

    :cond_12
    move-object v2, v9

    :goto_a
    sget-object v13, Lg80/h;->ALERT_TILE:Lg80/h;

    if-ne v2, v13, :cond_13

    const/4 v2, 0x1

    goto :goto_b

    :cond_13
    move v2, v11

    :goto_b
    invoke-static {v12}, Lb90/f;->E(Lp1/c1;)Z

    move-result v16

    if-eqz v16, :cond_14

    if-nez v2, :cond_14

    const/4 v2, 0x1

    goto :goto_c

    :cond_14
    move v2, v11

    :goto_c
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    move-object/from16 v19, v7

    and-int/lit8 v7, v0, 0x70

    if-ne v7, v6, :cond_15

    const/16 v20, 0x1

    goto :goto_d

    :cond_15
    move/from16 v20, v11

    :goto_d
    invoke-virtual {v5, v2}, Lp1/q;->h(Z)Z

    move-result v21

    or-int v20, v20, v21

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v20, :cond_16

    if-ne v6, v8, :cond_17

    :cond_16
    new-instance v6, Lb90/f$b;

    invoke-direct {v6, v4, v2, v9}, Lb90/f$b;-><init>(Lkotlin/jvm/functions/Function1;ZLq83/d;)V

    invoke-virtual {v5, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v6, Lc93/m;

    invoke-static {v5, v6, v3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lb90/g;->k()Lg80/i;

    move-result-object v2

    if-nez v2, :cond_18

    const v2, -0x77d06a32

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v11}, Lp1/q;->q(Z)V

    move/from16 v36, v0

    move-object/from16 v46, v4

    move/from16 v37, v7

    move-object/from16 v43, v8

    move v1, v11

    move-object/from16 v51, v12

    move-object/from16 v54, v13

    move-object/from16 v52, v14

    move-object/from16 v53, v15

    move/from16 v40, v18

    move-object/from16 v41, v19

    move/from16 v0, p1

    goto/16 :goto_11

    :cond_18
    const v3, -0x77d06a31

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    new-instance v3, Lh80/b$a;

    invoke-virtual {v1}, Lb90/g;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lg80/i;->e()Ljava/lang/String;

    move-result-object v9

    const-string v11, "authentication"

    const-string v10, "inline_error"

    invoke-direct {v3, v6, v10, v9, v11}, Lh80/b$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lg80/i;->f()Lg80/h;

    move-result-object v3

    sget-object v6, Lb90/f$g;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v6, v3

    const/4 v6, 0x1

    if-eq v3, v6, :cond_1a

    const/4 v9, 0x2

    if-ne v3, v9, :cond_19

    const v2, -0x100b26be

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    const/4 v3, 0x0

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    move/from16 v36, v0

    move v1, v3

    move-object/from16 v46, v4

    move/from16 v37, v7

    move-object/from16 v43, v8

    move-object/from16 v51, v12

    move-object/from16 v54, v13

    move-object/from16 v52, v14

    move-object/from16 v53, v15

    move/from16 v40, v18

    move-object/from16 v41, v19

    move/from16 v0, p1

    goto/16 :goto_10

    :cond_19
    const/4 v3, 0x0

    const v0, -0x4295536f

    invoke-static {v0, v5, v3}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_1a
    const/4 v3, 0x0

    const v9, -0x10140486

    invoke-virtual {v5, v9}, Lp1/q;->e0(I)V

    move/from16 v22, v3

    invoke-virtual {v2}, Lg80/i;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v2}, Lg80/i;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    new-instance v10, Lcom/whoop/design/util/TextResource$b;

    sget v11, Lx60/b;->N:I

    move/from16 v36, v0

    const/4 v0, 0x0

    const/4 v6, 0x2

    invoke-direct {v10, v11, v0, v6, v0}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v11, 0x20

    if-ne v7, v11, :cond_1b

    const/4 v11, 0x1

    goto :goto_e

    :cond_1b
    move/from16 v11, v22

    :goto_e
    invoke-virtual {v5, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    or-int v11, v11, v16

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v11, :cond_1c

    if-ne v0, v8, :cond_1d

    :cond_1c
    new-instance v0, Lb90/d;

    const/4 v11, 0x0

    invoke-direct {v0, v4, v2, v11}, Lb90/d;-><init>(Lkotlin/jvm/functions/Function1;Lg80/i;I)V

    invoke-virtual {v5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    move-object/from16 v24, v0

    check-cast v24, Lc93/a;

    const/16 v11, 0x20

    if-ne v7, v11, :cond_1e

    const/4 v0, 0x1

    goto :goto_f

    :cond_1e
    move/from16 v0, v22

    :goto_f
    invoke-virtual {v5, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    or-int v0, v0, v16

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_1f

    if-ne v6, v8, :cond_20

    :cond_1f
    new-instance v6, Lb90/d;

    const/4 v0, 0x1

    invoke-direct {v6, v4, v2, v0}, Lb90/d;-><init>(Lkotlin/jvm/functions/Function1;Lg80/i;I)V

    invoke-virtual {v5, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    move-object/from16 v26, v6

    check-cast v26, Lc93/a;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v2, v0, 0x3

    shl-int/lit8 v0, v0, 0x6

    or-int/2addr v0, v2

    sget v2, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v2, v2, 0x9

    or-int v31, v0, v2

    const/16 v33, 0x0

    const v34, 0xebfeff1

    const/4 v2, 0x0

    const/4 v6, 0x0

    move v0, v7

    const/4 v7, 0x0

    move-object/from16 v21, v8

    const/4 v8, 0x0

    move-object/from16 v25, v4

    move-object v4, v9

    const/4 v9, 0x0

    move-object/from16 v30, v5

    move-object v5, v10

    const/4 v10, 0x0

    move/from16 v27, v11

    const/4 v11, 0x0

    move-object/from16 v28, v12

    const/4 v12, 0x0

    move-object/from16 v29, v13

    const/4 v13, 0x0

    move-object/from16 v32, v14

    const/4 v14, 0x0

    move-object/from16 v37, v15

    const/4 v15, 0x0

    const/16 v38, 0x2

    const/16 v16, 0x0

    const/16 v39, 0x4

    const/16 v17, 0x0

    move/from16 v40, v18

    const/16 v18, 0x0

    move-object/from16 v41, v19

    const/16 v19, 0x0

    const/16 v42, 0x0

    const/16 v20, 0x0

    move-object/from16 v43, v21

    const/16 v21, 0x0

    move/from16 v44, v22

    const/16 v22, 0x0

    const/16 v45, 0x1

    const/16 v23, 0x0

    move-object/from16 v46, v25

    const/16 v25, 0x0

    move/from16 v47, v27

    const/16 v27, 0x0

    move-object/from16 v48, v28

    const/16 v28, 0x0

    move-object/from16 v49, v29

    const/16 v29, 0x0

    move-object/from16 v50, v32

    const/16 v32, 0x180

    move-object/from16 v53, v37

    move/from16 v1, v44

    move-object/from16 v51, v48

    move-object/from16 v54, v49

    move-object/from16 v52, v50

    move/from16 v37, v0

    move/from16 v0, p1

    invoke-static/range {v2 .. v34}, Lj11/n;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLy81/e;Lg1/u0;Lf0/t;Lf0/t;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lj11/o;ZILjava/lang/Integer;Ll3/g;Ljava/lang/Integer;ZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v5, v30

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    :goto_11
    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->w:Lb2/m;

    invoke-static {v4, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v5, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v10, v5, Lp1/q;->S:Z

    if-eqz v10, :cond_21

    invoke-virtual {v5, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_21
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_12
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v5, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v5, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v11, v5, Lp1/q;->S:Z

    if-nez v11, :cond_22

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_23

    :cond_22
    invoke-static {v6, v5, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_23
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v5, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/4 v2, 0x2

    int-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v12, v3

    mul-float/2addr v2, v12

    const/4 v13, 0x7

    int-to-float v13, v13

    mul-float/2addr v13, v12

    const/4 v15, 0x0

    const/16 v16, 0x8

    move v14, v2

    move/from16 v24, v12

    move v12, v2

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move/from16 v25, v12

    sget-object v11, Ll0/m;->d:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    invoke-static {v11, v12, v5, v0}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    iget-wide v12, v5, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v14, v5, Lp1/q;->S:Z

    if-eqz v14, :cond_24

    invoke-virtual {v5, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_24
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_13
    invoke-static {v5, v10, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v4, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-nez v4, :cond_25

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_26

    :cond_25
    invoke-static {v12, v5, v12, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_26
    invoke-static {v5, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {v35 .. v35}, Lb90/f;->p(Lp1/t2;)Z

    move-result v2

    const/4 v12, 0x3

    if-nez v2, :cond_27

    const v2, 0x66a220c

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lb90/g;->j()Lkd1/o;

    move-result-object v2

    move v4, v3

    invoke-virtual/range {p0 .. p0}, Lb90/g;->n()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    move v6, v4

    invoke-virtual/range {p0 .. p0}, Lb90/g;->m()Ljava/lang/String;

    move-result-object v4

    sget v7, Lkd1/o;->a:I

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/2addr v9, v12

    or-int/2addr v7, v9

    move v9, v6

    move v6, v7

    const/4 v7, 0x0

    move/from16 v26, v9

    invoke-static/range {v2 .. v7}, Lk80/q;->b(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_27
    move/from16 v26, v3

    const v2, 0x66d1495

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    :goto_14
    int-to-float v2, v12

    mul-float v2, v2, v24

    const/4 v10, 0x0

    const/16 v11, 0xd

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object v6, v8

    move v8, v2

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v27, v6

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v4, v43

    if-ne v3, v4, :cond_28

    new-instance v3, Lb72/a;

    const/4 v6, 0x7

    invoke-direct {v3, v6}, Lb72/a;-><init>(I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_28
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v1, v3}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move/from16 v3, v37

    const/16 v6, 0x20

    if-ne v3, v6, :cond_29

    const/4 v10, 0x1

    :goto_15
    move/from16 v7, v40

    const/4 v8, 0x4

    goto :goto_16

    :cond_29
    move v10, v1

    goto :goto_15

    :goto_16
    if-eq v7, v8, :cond_2c

    and-int/lit8 v9, v36, 0x8

    if-eqz v9, :cond_2a

    move-object/from16 v9, p0

    invoke-virtual {v5, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2b

    goto :goto_17

    :cond_2a
    move-object/from16 v9, p0

    :cond_2b
    move v11, v1

    goto :goto_18

    :cond_2c
    move-object/from16 v9, p0

    :goto_17
    const/4 v11, 0x1

    :goto_18
    or-int/2addr v10, v11

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_2e

    if-ne v11, v4, :cond_2d

    goto :goto_19

    :cond_2d
    move-object/from16 v10, v46

    move-object/from16 v13, v51

    goto :goto_1a

    :cond_2e
    :goto_19
    new-instance v11, Lam2/s;

    move-object/from16 v10, v46

    move-object/from16 v13, v51

    move-object/from16 v14, v52

    invoke-direct {v11, v10, v9, v14, v13}, Lam2/s;-><init>(Lkotlin/jvm/functions/Function1;Lb90/g;Lp1/c1;Lp1/c1;)V

    invoke-virtual {v5, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1a
    check-cast v11, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v11}, Landroidx/compose/ui/focus/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v9}, Lb90/g;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-static/range {v41 .. v41}, Lb90/f;->A(Lp1/c1;)Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-static/range {p2 .. p2}, Lb90/f;->C(Lp1/c1;)Z

    move-result v15

    if-eqz v15, :cond_2f

    new-instance v15, Lq3/s;

    invoke-direct {v15}, Ljava/lang/Object;-><init>()V

    goto :goto_1b

    :cond_2f
    sget-object v15, Lq3/f0;->w:Lg40/h2;

    :goto_1b
    invoke-static/range {v41 .. v41}, Lb90/f;->A(Lp1/c1;)Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->length()I

    move-result v16

    if-lez v16, :cond_30

    const/16 v16, 0x1

    goto :goto_1c

    :cond_30
    move/from16 v16, v1

    :goto_1c
    if-eqz v16, :cond_32

    invoke-static/range {p2 .. p2}, Lb90/f;->C(Lp1/c1;)Z

    move-result v16

    if-eqz v16, :cond_32

    move/from16 p1, v0

    const v0, -0x41dab0ae

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/k0;->Z()I

    move-result v17

    int-to-float v0, v8

    mul-float/2addr v0, v0

    new-instance v12, Ly3/f;

    invoke-direct {v12, v0}, Ly3/f;-><init>(F)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_31

    sget-object v0, Lb90/f$d;->w:Lb90/f$d;

    invoke-virtual {v5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_31
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v19

    new-instance v16, Lqz0/c$a;

    const/16 v20, 0x0

    const/16 v21, 0x8

    const/16 v22, 0x0

    move-object/from16 v18, v12

    invoke-direct/range {v16 .. v22}, Lqz0/c$a;-><init>(ILy3/f;Ly81/e;Li2/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    :goto_1d
    move-object/from16 v0, v53

    goto :goto_1f

    :cond_32
    move/from16 p1, v0

    invoke-static/range {v41 .. v41}, Lb90/f;->A(Lp1/c1;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_33

    const/4 v0, 0x1

    goto :goto_1e

    :cond_33
    move v0, v1

    :goto_1e
    if-eqz v0, :cond_35

    invoke-static/range {p2 .. p2}, Lb90/f;->C(Lp1/c1;)Z

    move-result v0

    if-nez v0, :cond_35

    const v0, -0x41da8e0a

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/k0;->f0()I

    move-result v17

    int-to-float v0, v8

    mul-float/2addr v0, v0

    new-instance v12, Ly3/f;

    invoke-direct {v12, v0}, Ly3/f;-><init>(F)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_34

    sget-object v0, Lb90/f$e;->w:Lb90/f$e;

    invoke-virtual {v5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_34
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v19

    new-instance v16, Lqz0/c$a;

    const/16 v20, 0x0

    const/16 v21, 0x8

    const/16 v22, 0x0

    move-object/from16 v18, v12

    invoke-direct/range {v16 .. v22}, Lqz0/c$a;-><init>(ILy3/f;Ly81/e;Li2/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    goto :goto_1d

    :cond_35
    const v0, 0x68c3410

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    move-object/from16 v0, v53

    const/16 v16, 0x0

    :goto_1f
    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v12, :cond_36

    if-ne v1, v4, :cond_37

    :cond_36
    new-instance v1, Lb30/l1;

    const/4 v12, 0x1

    invoke-direct {v1, v0, v12}, Lb30/l1;-><init>(Lg2/i;I)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_37
    move-object/from16 v29, v1

    check-cast v29, Lkotlin/jvm/functions/Function1;

    new-instance v28, Lu0/q0;

    move-object/from16 v30, v29

    move-object/from16 v31, v29

    move-object/from16 v32, v29

    move-object/from16 v33, v29

    move-object/from16 v34, v29

    invoke-direct/range {v28 .. v34}, Lu0/q0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v9}, Lb90/g;->k()Lg80/i;

    move-result-object v0

    if-eqz v0, :cond_38

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    goto :goto_20

    :cond_38
    invoke-virtual {v9}, Lb90/g;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->f(Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    :goto_20
    invoke-virtual {v9}, Lb90/g;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    if-eqz v1, :cond_39

    invoke-virtual {v9}, Lb90/g;->k()Lg80/i;

    move-result-object v1

    if-nez v1, :cond_39

    const/4 v1, 0x1

    goto :goto_21

    :cond_39
    const/4 v1, 0x0

    :goto_21
    if-ne v3, v6, :cond_3a

    const/4 v12, 0x1

    goto :goto_22

    :cond_3a
    const/4 v12, 0x0

    :goto_22
    if-eq v7, v8, :cond_3c

    and-int/lit8 v17, v36, 0x8

    if-eqz v17, :cond_3b

    invoke-virtual {v5, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_3b

    goto :goto_23

    :cond_3b
    const/16 v17, 0x0

    goto :goto_24

    :cond_3c
    :goto_23
    const/16 v17, 0x1

    :goto_24
    or-int v12, v12, v17

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v12, :cond_3d

    if-ne v8, v4, :cond_3e

    :cond_3d
    new-instance v8, Lc;

    const/16 v12, 0x9

    move-object/from16 v6, p2

    invoke-direct {v8, v10, v9, v6, v12}, Lc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v5, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3e
    move-object/from16 v18, v8

    check-cast v18, Lc93/a;

    const/16 v6, 0x20

    if-ne v3, v6, :cond_3f

    const/4 v8, 0x1

    goto :goto_25

    :cond_3f
    const/4 v8, 0x0

    :goto_25
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v8, :cond_40

    if-ne v12, v4, :cond_41

    :cond_40
    new-instance v12, Lb90/e;

    const/4 v8, 0x0

    move-object/from16 v6, v41

    invoke-direct {v12, v8, v10, v6, v13}, Lb90/e;-><init>(ILkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;)V

    invoke-virtual {v5, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_41
    move-object/from16 v19, v12

    check-cast v19, Lkotlin/jvm/functions/Function1;

    sget v29, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v29, 0x3

    or-int/lit16 v6, v6, 0xc00

    shl-int/lit8 v8, v29, 0x6

    or-int/2addr v6, v8

    sget v8, Lqz0/c$a;->f:I

    shl-int/lit8 v8, v8, 0xf

    or-int/2addr v6, v8

    shl-int/lit8 v8, v29, 0x12

    or-int/2addr v6, v8

    const/16 v22, 0x6006

    const/4 v8, 0x3

    const/16 v23, 0x1b00

    move-object/from16 v30, v5

    const/4 v5, 0x7

    move-object/from16 v46, v10

    const/4 v10, 0x0

    move/from16 v37, v3

    move-object v3, v11

    const/4 v11, 0x0

    const-string v12, "password_field_tag"

    move-object/from16 v43, v4

    move-object v4, v14

    const-wide/16 v13, 0x0

    move/from16 v21, v6

    move-object v6, v15

    const/16 v47, 0x20

    const/4 v15, 0x0

    const/16 v39, 0x4

    const/16 v17, 0x7

    move v9, v1

    move/from16 v40, v7

    move-object/from16 v7, v16

    move-object/from16 v16, v28

    move-object/from16 v20, v30

    move/from16 v1, v37

    move-object/from16 v57, v43

    move/from16 v28, v8

    move-object v8, v0

    move/from16 v0, v47

    invoke-static/range {v2 .. v23}, Lk80/b;->c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILq3/g0;Lqz0/c;Lcom/whoop/design/util/TextResource;ZZZLjava/lang/String;JLc93/m;Lu0/q0;ILc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v20

    invoke-virtual/range {p0 .. p0}, Lb90/g;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-ne v1, v0, :cond_42

    const/4 v10, 0x1

    :goto_26
    move/from16 v7, v40

    const/4 v8, 0x4

    goto :goto_27

    :cond_42
    const/4 v10, 0x0

    goto :goto_26

    :goto_27
    if-eq v7, v8, :cond_44

    and-int/lit8 v3, v36, 0x8

    move-object/from16 v12, p0

    if-eqz v3, :cond_43

    invoke-virtual {v5, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_43

    goto :goto_28

    :cond_43
    const/4 v3, 0x0

    goto :goto_29

    :cond_44
    move-object/from16 v12, p0

    :goto_28
    const/4 v3, 0x1

    :goto_29
    or-int/2addr v3, v10

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v13, v57

    if-nez v3, :cond_46

    if-ne v4, v13, :cond_45

    goto :goto_2a

    :cond_45
    move-object/from16 v14, v46

    goto :goto_2b

    :cond_46
    :goto_2a
    new-instance v4, Li;

    const/16 v3, 0x14

    move-object/from16 v14, v46

    invoke-direct {v4, v3, v14, v12}, Li;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_2b
    check-cast v4, Lc93/a;

    const/4 v7, 0x2

    const/4 v3, 0x0

    move/from16 v6, v29

    invoke-static/range {v2 .. v7}, Lk80/p;->d(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12}, Lb90/g;->k()Lg80/i;

    move-result-object v2

    if-eqz v2, :cond_47

    invoke-virtual {v2}, Lg80/i;->f()Lg80/h;

    move-result-object v9

    :goto_2c
    move-object/from16 v2, v54

    goto :goto_2d

    :cond_47
    const/4 v9, 0x0

    goto :goto_2c

    :goto_2d
    if-ne v9, v2, :cond_4a

    const v2, 0x6b27168

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    const/4 v10, 0x0

    const/16 v11, 0xd

    const/4 v7, 0x0

    const/4 v9, 0x0

    move/from16 v8, v25

    move-object/from16 v6, v27

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object v9, v6

    sget-object v47, Lgz0/m0;->TINY_INFORMATION:Lgz0/m0;

    invoke-virtual {v12}, Lb90/g;->k()Lg80/i;

    move-result-object v3

    invoke-virtual {v3}, Lg80/i;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v51

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v13, :cond_48

    sget-object v3, Lb90/f$f;->w:Lb90/f$f;

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_48
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v53

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v13, :cond_49

    sget-object v3, Lb90/f$c;->w:Lb90/f$c;

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_49
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v55

    new-instance v46, Lc41/p2;

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v52, 0x0

    const/16 v54, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const v67, 0xffeae

    const/16 v68, 0x0

    invoke-direct/range {v46 .. v68}, Lc41/p2;-><init>(Lgz0/m0;FLc41/n2;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Lrz0/f;Ly81/e;ZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Lc41/o2;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v3, Lc41/p2;->v:I

    shl-int/lit8 v3, v3, 0x3

    or-int/lit8 v6, v3, 0x6

    const/4 v7, 0x4

    const/4 v4, 0x0

    move-object/from16 v3, v46

    invoke-static/range {v2 .. v7}, Lc41/r2;->f(Landroidx/compose/ui/Modifier;Lc41/p2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x0

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    goto :goto_2e

    :cond_4a
    move/from16 v8, v25

    move-object/from16 v9, v27

    const/4 v3, 0x0

    const v2, 0x6b9ac15

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    :goto_2e
    const/16 v2, 0xd

    int-to-float v2, v2

    mul-float v2, v2, v24

    invoke-static {v2, v9}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v5, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Lp1/q;->q(Z)V

    new-instance v15, Lny0/o;

    sget-object v16, Lny0/q$a;->f:Lny0/q$a;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/k0;->B()I

    move-result v17

    const/16 v26, 0x3fc

    const/16 v27, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v15 .. v27}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v2, Lb2/e;->y:Lb2/m;

    sget-object v3, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v3, v9, v2}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v8, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget v2, Lx60/b;->G:I

    const/4 v3, 0x0

    invoke-static {v2, v5, v3}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    if-ne v1, v0, :cond_4b

    const/4 v10, 0x1

    goto :goto_2f

    :cond_4b
    move v10, v3

    :goto_2f
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v10, :cond_4c

    if-ne v0, v13, :cond_4d

    :cond_4c
    new-instance v0, Lo;

    const/16 v1, 0x10

    invoke-direct {v0, v14, v1}, Lo;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4d
    move-object v6, v0

    check-cast v6, Lc93/a;

    sget v8, Lny0/o;->k:I

    const/16 v9, 0x8

    move-object/from16 v30, v5

    const/4 v5, 0x0

    move-object v3, v2

    move-object v2, v15

    move-object/from16 v7, v30

    invoke-static/range {v2 .. v9}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v7

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Lp1/q;->q(Z)V

    move-object v3, v14

    goto :goto_30

    :cond_4e
    move-object v12, v1

    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v3, v7

    :goto_30
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_4f

    new-instance v0, La01/i;

    const/16 v5, 0xb

    move/from16 v2, p3

    move/from16 v4, p4

    move-object v1, v12

    invoke-direct/range {v0 .. v5}, La01/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_4f
    return-void
.end method

.method private static final m(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final o(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final p(Lp1/t2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final q(Lkotlin/jvm/functions/Function1;Lg80/i;)Ll83/a0;
    .locals 1

    new-instance v0, Lj80/a$g;

    invoke-virtual {p1}, Lg80/i;->e()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lj80/a$g;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lkotlin/jvm/functions/Function1;Lg80/i;)Ll83/a0;
    .locals 1

    new-instance v0, Lj80/a$g;

    invoke-virtual {p1}, Lg80/i;->e()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lj80/a$g;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Li3/z;)Ll83/a0;
    .locals 4

    const-string v0, "$this$semantics"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc2/p;->a:Lc2/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lc2/o;->b:Lc2/g;

    sget-object v1, Li3/w;->a:[Lj93/z;

    sget-object v1, Li3/u;->q:Li3/y;

    sget-object v2, Li3/w;->a:[Lj93/z;

    const/16 v3, 0x8

    aget-object v2, v2, v3

    invoke-virtual {v1, p0, v0}, Li3/y;->a(Li3/z;Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lkotlin/jvm/functions/Function1;Lb90/g;Lp1/c1;Lp1/c1;Lg2/v;)Ll83/a0;
    .locals 3

    const-string v0, "focusState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lb90/f;->n(Lp1/c1;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lg2/w;

    invoke-virtual {v0}, Lg2/w;->b()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lb90/f;->o(Lp1/c1;Z)V

    invoke-static {p3}, Lb90/f;->E(Lp1/c1;)Z

    move-result p3

    if-nez p3, :cond_0

    new-instance p3, Lh80/b$a;

    invoke-virtual {p1}, Lb90/g;->c()Ljava/lang/String;

    move-result-object p1

    const-string v0, "formatting"

    const-string v1, "account_creation"

    const-string v2, "inline_error"

    invoke-direct {p3, p1, v2, v0, v1}, Lh80/b$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast p4, Lg2/w;

    invoke-virtual {p4}, Lg2/w;->a()Z

    move-result p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    invoke-static {p2, p0}, Lb90/f;->o(Lp1/c1;Z)V

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lg2/i;Lu0/p0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$KeyboardActions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lg2/i;->a(Lg2/i;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lkotlin/jvm/functions/Function1;Lb90/g;Lp1/c1;)Ll83/a0;
    .locals 10

    invoke-static {p2}, Lb90/f;->C(Lp1/c1;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p2, v0}, Lb90/f;->D(Lp1/c1;Z)V

    new-instance v1, Lh80/b$i;

    invoke-virtual {p1}, Lb90/g;->c()Ljava/lang/String;

    move-result-object v2

    const/16 v8, 0x22

    const/4 v9, 0x0

    const/4 v3, 0x0

    const-string v4, "icon"

    const-string v5, "eye"

    const-string v6, "account_creation"

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 3

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3}, Lb90/f;->B(Lp1/c1;Ljava/lang/String;)V

    invoke-static {p1}, Lb90/f;->A(Lp1/c1;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/4 v0, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lt p1, v0, :cond_0

    move p1, v2

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    invoke-static {p2, p1}, Lb90/f;->F(Lp1/c1;Z)V

    new-instance p1, Lj80/a$u0;

    new-instance p2, Ld70/e;

    invoke-direct {p2, p3}, Ld70/e;-><init>(Ljava/lang/String;)V

    const/4 p3, 0x2

    const/4 v0, 0x0

    invoke-direct {p1, p2, v1, p3, v0}, Lj80/a$u0;-><init>(Ld70/e;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lj80/a$o0;

    invoke-direct {p1, v2}, Lj80/a$o0;-><init>(Z)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lkotlin/jvm/functions/Function1;Lb90/g;)Ll83/a0;
    .locals 9

    new-instance v0, Lh80/b$i;

    invoke-virtual {p1}, Lb90/g;->c()Ljava/lang/String;

    move-result-object v1

    const/16 v7, 0x22

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "link"

    const-string v4, "forgot_pw"

    const-string v5, "account_creation"

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll80/o$g;

    sget-object v1, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->FORGOT_PASSWORD:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    invoke-virtual {p1}, Lb90/g;->e()Ld70/c;

    move-result-object p1

    invoke-virtual {p1}, Ld70/c;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ll83/k;

    const-string v3, "email"

    invoke-direct {v2, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    new-instance v3, Ll83/k;

    const-string v4, "fromPostPairing"

    invoke-direct {v3, v4, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v3}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ll80/o$g;-><init>(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Ljava/util/Map;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Ll80/o$d;->a:Ll80/o$d;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lb90/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lb90/f;->l(Lb90/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
