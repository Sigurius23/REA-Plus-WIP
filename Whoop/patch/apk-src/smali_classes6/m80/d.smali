.class public abstract Lm80/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000f\u00b2\u0006\u000e\u0010\t\u001a\u00020\u00088\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u000c\u001a\u00020\n8\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010\r\u001a\u00020\n8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u000e\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lm80/e;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "m",
        "(Lm80/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "emailValue",
        "",
        "marketingOptIn",
        "isKeyboardOpen",
        "isEmailValid",
        "hasBeenFocusedEmail",
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
.method private static final A(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Ll80/o$d;->a:Ll80/o$d;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lm80/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lm80/d;->m(Lm80/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lp1/c1;)Ljava/lang/String;
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

.method private static final D(Lp1/c1;Ljava/lang/String;)V
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

.method private static final G(Lp1/t2;)Z
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

.method private static final H(Lp1/c1;)Z
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

.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lm80/d;->n(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lg2/i;Lu0/p0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lm80/d;->u(Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lm80/d;->A(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Ll83/a0;
    .locals 1

    invoke-static {}, Lm80/d;->x()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lm80/d;->s(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lm80/d;->y(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/whoop/activation/domain/models/EmailDialogInfo;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lm80/d;->t(Lcom/whoop/activation/domain/models/EmailDialogInfo;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lm80/d;->z(Lkotlin/jvm/functions/Function1;Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lm80/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lm80/d;->B(Lm80/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Lm80/e;Lp1/c1;Lp1/c1;Lg2/v;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lm80/d;->w(Lkotlin/jvm/functions/Function1;Lm80/e;Lp1/c1;Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lm80/d;->r(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Li3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lm80/d;->v(Li3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lm80/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 59
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm80/e;",
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

    const v0, 0x5fe35272

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v4, p4, 0x2

    const/16 v6, 0x20

    if-eqz v4, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v7, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v7, p3, 0x30

    if-nez v7, :cond_2

    move-object/from16 v7, p1

    invoke-virtual {v5, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    move v8, v6

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v0, v8

    :goto_3
    and-int/lit8 v8, v0, 0x13

    const/16 v9, 0x12

    const/4 v11, 0x0

    if-eq v8, v9, :cond_5

    const/4 v8, 0x1

    goto :goto_4

    :cond_5
    move v8, v11

    :goto_4
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v5, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_3a

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_7

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v8, :cond_6

    new-instance v4, Lm01/c;

    const/16 v7, 0xd

    invoke-direct {v4, v7}, Lm01/c;-><init>(I)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_5

    :cond_7
    move-object v4, v7

    :goto_5
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v8, :cond_8

    invoke-virtual {v1}, Lm80/e;->f()Ld70/c;

    move-result-object v7

    invoke-virtual {v7}, Ld70/c;->a()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v5, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v7, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v8, :cond_9

    invoke-virtual {v1}, Lm80/e;->j()Z

    move-result v9

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    invoke-static {v9}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v9

    invoke-virtual {v5, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v9, Lp1/c1;

    invoke-static {v5, v11}, Lk80/s;->h(Landroidx/compose/runtime/Composer;I)Lp1/t2;

    move-result-object v35

    sget-object v12, Lb3/v1;->i:Lp1/u2;

    invoke-virtual {v5, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lg2/i;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v8, :cond_a

    sget-object v13, Lk80/n;->a:Lk80/n;

    invoke-static {v7}, Lm80/d;->C(Lp1/c1;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Lk80/n;->a(Ljava/lang/String;)Z

    move-result v13

    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    invoke-static {v13}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v13

    invoke-virtual {v5, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object/from16 v36, v13

    check-cast v36, Lp1/c1;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v8, :cond_b

    sget-object v13, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v13}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v13

    invoke-virtual {v5, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object/from16 v37, v13

    check-cast v37, Lp1/c1;

    invoke-static {v7}, Lm80/d;->C(Lp1/c1;)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v13

    if-nez v13, :cond_c

    invoke-static/range {v36 .. v36}, Lm80/d;->H(Lp1/c1;)Z

    move-result v13

    if-eqz v13, :cond_c

    const/4 v13, 0x1

    goto :goto_6

    :cond_c
    move v13, v11

    :goto_6
    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v6, :cond_d

    const/4 v15, 0x1

    goto :goto_7

    :cond_d
    move v15, v11

    :goto_7
    invoke-virtual {v5, v13}, Lp1/q;->h(Z)Z

    move-result v16

    or-int v15, v15, v16

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 p1, v9

    const/4 v9, 0x0

    if-nez v15, :cond_e

    if-ne v2, v8, :cond_f

    :cond_e
    new-instance v2, Lm80/d$a;

    invoke-direct {v2, v4, v13, v9}, Lm80/d$a;-><init>(Lkotlin/jvm/functions/Function1;ZLq83/d;)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v2, Lc93/m;

    invoke-static {v5, v2, v14}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm80/e;->f()Ld70/c;

    move-result-object v2

    invoke-virtual {v2}, Ld70/c;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-ne v0, v6, :cond_10

    const/4 v14, 0x1

    goto :goto_8

    :cond_10
    move v14, v11

    :goto_8
    or-int/2addr v13, v14

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v13, :cond_11

    if-ne v14, v8, :cond_12

    :cond_11
    new-instance v14, Lm80/d$b;

    invoke-direct {v14, v1, v4, v9}, Lm80/d$b;-><init>(Lm80/e;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v5, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v14, Lc93/m;

    invoke-static {v5, v14, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lm80/e;->e()Lcom/whoop/activation/domain/models/EmailDialogInfo;

    move-result-object v2

    if-nez v2, :cond_13

    const v2, -0x69345796

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v11}, Lp1/q;->q(Z)V

    move-object v10, v4

    move-object/from16 v39, v7

    move-object/from16 v49, v12

    move v12, v11

    move-object v11, v9

    move-object v9, v8

    move-object v8, v1

    move v1, v6

    goto/16 :goto_10

    :cond_13
    const v13, -0x69345795

    invoke-virtual {v5, v13}, Lp1/q;->e0(I)V

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v14, Lx81/d;->b:I

    invoke-virtual {v13, v5, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v13, v5, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v13, v5, v14}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v13

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v8, :cond_14

    new-instance v14, Lm80/b;

    invoke-direct {v14, v3, v15, v13}, Lm80/b;-><init>(Lb91/d;Ly81/i;Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    invoke-virtual {v5, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v14, Lm80/b;

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/EmailDialogInfo;->getParagraphs()Ljava/util/List;

    move-result-object v3

    invoke-static {v7}, Lm80/d;->C(Lp1/c1;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/EmailDialogInfo;->getSuggestedEmail()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v3, v13, v15}, Lm80/b;->d(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ll3/g;

    move-result-object v20

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/EmailDialogInfo;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/4 v13, 0x2

    sget-object v16, Lj11/o;->CENTER:Lj11/o;

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/EmailDialogInfo;->getBackText()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v2}, Lcom/whoop/activation/domain/models/EmailDialogInfo;->getConfirmationText()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    if-ne v0, v6, :cond_15

    const/16 v17, 0x1

    goto :goto_9

    :cond_15
    move/from16 v17, v11

    :goto_9
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v17, :cond_16

    if-ne v9, v8, :cond_17

    :cond_16
    new-instance v9, Lky2/a;

    const/16 v10, 0x16

    invoke-direct {v9, v4, v10}, Lky2/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object/from16 v24, v9

    check-cast v24, Lc93/a;

    if-ne v0, v6, :cond_18

    const/4 v9, 0x1

    goto :goto_a

    :cond_18
    move v9, v11

    :goto_a
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_19

    if-ne v10, v8, :cond_1a

    :cond_19
    new-instance v10, Lky2/a;

    const/16 v9, 0x17

    invoke-direct {v10, v4, v9}, Lky2/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    move-object/from16 v25, v10

    check-cast v25, Lc93/a;

    invoke-virtual {v5, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-ne v0, v6, :cond_1b

    const/4 v10, 0x1

    goto :goto_b

    :cond_1b
    move v10, v11

    :goto_b
    or-int/2addr v9, v10

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_1c

    if-ne v10, v8, :cond_1d

    :cond_1c
    new-instance v10, Lim1/a0;

    const/16 v9, 0x1a

    invoke-direct {v10, v2, v4, v7, v9}, Lim1/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v5, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    move-object/from16 v26, v10

    check-cast v26, Lc93/a;

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v9, v2, 0x3

    shl-int/lit8 v10, v2, 0x9

    or-int/2addr v9, v10

    shl-int/lit8 v2, v2, 0x1b

    or-int v31, v9, v2

    const/16 v33, 0x0

    const v34, 0xe3aadf5

    const/4 v2, 0x0

    move-object v9, v4

    const/4 v4, 0x0

    move v10, v6

    const/4 v6, 0x0

    move-object/from16 v19, v7

    const/4 v7, 0x0

    move-object/from16 v21, v8

    const/4 v8, 0x0

    move-object/from16 v22, v9

    const/4 v9, 0x0

    move/from16 v23, v10

    const/4 v10, 0x0

    move-object/from16 v27, v12

    const/4 v12, 0x0

    move/from16 v28, v13

    const/4 v13, 0x0

    move-object/from16 v30, v5

    move-object v5, v14

    const/4 v14, 0x0

    move/from16 v29, v11

    move-object v11, v15

    const/4 v15, 0x0

    const/16 v32, 0x1

    const/16 v17, 0x0

    const/16 v38, 0x0

    const/16 v18, 0x3

    move-object/from16 v39, v19

    const/16 v19, 0x0

    move-object/from16 v40, v21

    const/16 v21, 0x0

    move-object/from16 v41, v22

    const/16 v22, 0x0

    move/from16 v42, v23

    const/16 v23, 0x0

    move-object/from16 v43, v27

    const/16 v27, 0x0

    move/from16 v44, v28

    const/16 v28, 0x0

    move/from16 v45, v29

    const/16 v29, 0x0

    move/from16 v46, v32

    const/16 v32, 0x6180

    move-object/from16 v50, v40

    move-object/from16 v48, v41

    move/from16 v1, v42

    move-object/from16 v49, v43

    invoke-static/range {v2 .. v34}, Lj11/n;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLy81/e;Lg1/u0;Lf0/t;Lf0/t;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lj11/o;ZILjava/lang/Integer;Ll3/g;Ljava/lang/Integer;ZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v5, v30

    invoke-virtual/range {p0 .. p0}, Lm80/e;->e()Lcom/whoop/activation/domain/models/EmailDialogInfo;

    move-result-object v2

    if-ne v0, v1, :cond_1e

    const/4 v10, 0x1

    :goto_c
    move-object/from16 v8, p0

    goto :goto_d

    :cond_1e
    const/4 v10, 0x0

    goto :goto_c

    :goto_d
    invoke-virtual {v5, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v3, v10

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v9, v50

    if-nez v3, :cond_20

    if-ne v4, v9, :cond_1f

    goto :goto_e

    :cond_1f
    move-object/from16 v10, v48

    const/4 v11, 0x0

    goto :goto_f

    :cond_20
    :goto_e
    new-instance v4, Lm80/d$c;

    move-object/from16 v10, v48

    const/4 v11, 0x0

    invoke-direct {v4, v10, v8, v11}, Lm80/d$c;-><init>(Lkotlin/jvm/functions/Function1;Lm80/e;Lq83/d;)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_f
    check-cast v4, Lc93/m;

    invoke-static {v5, v4, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v12, 0x0

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    :goto_10
    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v13}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->w:Lb2/m;

    invoke-static {v4, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v5, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v15, v5, Lp1/q;->S:Z

    if-eqz v15, :cond_21

    invoke-virtual {v5, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_21
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_11
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v5, v15, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v5, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v11, v5, Lp1/q;->S:Z

    if-nez v11, :cond_22

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v11, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_23

    :cond_22
    invoke-static {v6, v5, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_23
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v5, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, v13}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v24

    const-wide/high16 v2, 0x4004000000000000L    # 2.5

    double-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v11, v3

    mul-float v25, v2, v11

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float v28, v2, v11

    const/16 v29, 0x2

    const/16 v26, 0x0

    move/from16 v27, v25

    invoke-static/range {v24 .. v29}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Ll0/m;->d:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    move-object/from16 v22, v10

    const/4 v10, 0x6

    invoke-static {v6, v12, v5, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    move/from16 p2, v10

    move v12, v11

    iget-wide v10, v5, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v5, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v5}, Lp1/q;->i0()V

    move/from16 v16, v2

    iget-boolean v2, v5, Lp1/q;->S:Z

    if-eqz v2, :cond_24

    invoke-virtual {v5, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_24
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_12
    invoke-static {v5, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v4, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v5, Lp1/q;->S:Z

    if-nez v2, :cond_25

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_26

    :cond_25
    invoke-static {v10, v5, v10, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_26
    invoke-static {v5, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {v35 .. v35}, Lm80/d;->G(Lp1/t2;)Z

    move-result v1

    const/4 v10, 0x3

    if-nez v1, :cond_27

    const v1, 0x202220a3

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lm80/e;->h()Lkd1/o;

    move-result-object v2

    invoke-virtual {v8}, Lm80/e;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v8}, Lm80/e;->k()Ljava/lang/String;

    move-result-object v4

    sget v1, Lkd1/o;->a:I

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/2addr v6, v10

    or-int/2addr v6, v1

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lk80/q;->b(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v5

    const/4 v1, 0x0

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_27
    move-object v6, v5

    const/4 v1, 0x0

    const v2, 0x20253ea5

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    const-wide/high16 v2, 0x400c000000000000L    # 3.5

    double-to-float v2, v2

    invoke-static {v2, v12, v13, v6, v1}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    :goto_13
    mul-float v2, v16, v16

    invoke-static {v2, v13}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v6, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v8}, Lm80/e;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static/range {v39 .. v39}, Lm80/d;->C(Lp1/c1;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    move-object/from16 v1, v49

    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_28

    if-ne v3, v9, :cond_29

    :cond_28
    new-instance v3, Lb30/l1;

    const/16 v2, 0x9

    invoke-direct {v3, v1, v2}, Lb30/l1;-><init>(Lg2/i;I)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_29
    move-object/from16 v41, v3

    check-cast v41, Lkotlin/jvm/functions/Function1;

    new-instance v15, Lu0/q0;

    move-object/from16 v42, v41

    move-object/from16 v43, v41

    move-object/from16 v44, v41

    move-object/from16 v45, v41

    move-object/from16 v46, v41

    move-object/from16 v40, v15

    invoke-direct/range {v40 .. v46}, Lu0/q0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v9, :cond_2a

    new-instance v1, Lm01/c;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Lm01/c;-><init>(I)V

    invoke-virtual {v6, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2a
    check-cast v1, Lkotlin/jvm/functions/Function1;

    const/4 v14, 0x0

    invoke-static {v13, v14, v1}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v2, 0x20

    if-ne v0, v2, :cond_2b

    const/4 v3, 0x1

    goto :goto_14

    :cond_2b
    move v3, v14

    :goto_14
    invoke-virtual {v6, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_2c

    if-ne v4, v9, :cond_2d

    :cond_2c
    move v3, v0

    goto :goto_15

    :cond_2d
    move v8, v0

    move-object v10, v1

    move-object v0, v4

    move-object/from16 v17, v7

    move-object/from16 v1, v22

    move-object/from16 v4, v36

    move v7, v2

    goto :goto_16

    :goto_15
    new-instance v0, Ljp2/l;

    const/16 v5, 0x9

    move-object v10, v1

    move-object/from16 v17, v7

    move-object/from16 v1, v22

    move-object/from16 v4, v36

    move v7, v2

    move-object v2, v8

    move v8, v3

    move-object/from16 v3, v37

    invoke-direct/range {v0 .. v5}, Ljp2/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_16
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v10, v0}, Landroidx/compose/ui/focus/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v9, :cond_2e

    new-instance v2, Lm22/m;

    const/4 v3, 0x7

    invoke-direct {v2, v3}, Lm22/m;-><init>(I)V

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2e
    check-cast v2, Lc93/a;

    if-ne v8, v7, :cond_2f

    const/4 v10, 0x1

    goto :goto_17

    :cond_2f
    move v10, v14

    :goto_17
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v10, :cond_30

    if-ne v3, v9, :cond_31

    :cond_30
    new-instance v3, Lb90/e;

    const/4 v5, 0x3

    move-object/from16 v10, v39

    invoke-direct {v3, v5, v1, v10, v4}, Lb90/e;-><init>(ILkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_31
    check-cast v3, Lkotlin/jvm/functions/Function1;

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v4, 0x3

    const v10, 0x30c00

    or-int/2addr v5, v10

    shl-int/lit8 v4, v4, 0x6

    or-int v20, v5, v4

    const v21, 0x36006

    const/16 v22, 0x1bd0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object/from16 v30, v6

    const/4 v6, 0x0

    move/from16 v23, v7

    const/4 v7, 0x0

    move v10, v8

    const/4 v8, 0x0

    move-object/from16 v50, v9

    const/4 v9, 0x0

    move/from16 v19, v10

    const/4 v10, 0x0

    move-object/from16 v18, v3

    move-object v3, v11

    const/16 v47, 0x0

    const-string v11, "SIGN_IN_EMAIL"

    move/from16 v24, v12

    move-object/from16 v25, v13

    const-wide/16 v12, 0x0

    move/from16 v29, v14

    const/4 v14, 0x0

    const/16 v26, 0x3

    const/16 v16, 0x7

    move-object/from16 v23, v17

    move-object/from16 v17, v2

    move-object/from16 v2, v23

    move-object/from16 v41, v1

    move/from16 v23, v19

    move-object/from16 v53, v25

    move-object/from16 v19, v30

    move-object/from16 v51, v50

    move/from16 v25, p2

    move-object v1, v0

    move/from16 v0, v29

    invoke-static/range {v1 .. v22}, Lk80/b;->c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILq3/g0;Lqz0/c;Lcom/whoop/design/util/TextResource;ZZZLjava/lang/String;JLc93/m;Lu0/q0;ILc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v19

    invoke-virtual/range {p0 .. p0}, Lm80/e;->i()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_32

    const v1, 0x2046049f

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    move/from16 v55, v23

    move/from16 v12, v24

    move-object/from16 v54, v41

    move-object/from16 v9, v47

    move-object/from16 v57, v51

    move-object/from16 v4, v53

    goto/16 :goto_1b

    :cond_32
    const v1, 0x204604a0

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    const/4 v1, 0x3

    int-to-float v1, v1

    move/from16 v3, v24

    move-object/from16 v4, v53

    invoke-static {v1, v3, v4, v5}, Ld;->w(FFLb2/t;Lp1/q;)V

    const/4 v1, -0x2

    int-to-float v1, v1

    mul-float/2addr v1, v3

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-static {v4, v1, v6, v7}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v6, v5, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->a()Lb91/a;

    move-result-object v9

    invoke-static/range {p1 .. p1}, Lm80/d;->E(Lp1/c1;)Z

    move-result v4

    invoke-virtual {v6, v5, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v10

    move/from16 v6, v23

    const/16 v8, 0x20

    if-ne v6, v8, :cond_33

    const/4 v12, 0x1

    goto :goto_18

    :cond_33
    move v12, v0

    :goto_18
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_35

    move-object/from16 v12, v51

    if-ne v13, v12, :cond_34

    goto :goto_19

    :cond_34
    move-object/from16 v15, v41

    goto :goto_1a

    :cond_35
    move-object/from16 v12, v51

    :goto_19
    new-instance v13, Lb30/r;

    const/16 v14, 0x15

    move-object/from16 v7, p1

    move-object/from16 v15, v41

    invoke-direct {v13, v15, v7, v14}, Lb30/r;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v5, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1a
    move-object/from16 v17, v13

    check-cast v17, Lkotlin/jvm/functions/Function1;

    sget v7, Lb91/a;->d:I

    shl-int/lit8 v7, v7, 0x6

    or-int/lit8 v19, v7, 0x6

    const/16 v20, 0x0

    const/16 v21, 0x1fb0

    move-object/from16 v30, v5

    const/4 v5, 0x0

    move/from16 v23, v6

    const/4 v6, 0x0

    move/from16 v24, v3

    move/from16 v52, v8

    move-object v3, v9

    move-wide v7, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v50, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v22, v15

    const/16 v28, 0x2

    const-wide/16 v15, 0x0

    move-object/from16 v54, v22

    move/from16 v55, v23

    move/from16 v56, v24

    move-object/from16 v18, v30

    move-object/from16 v57, v50

    move-object/from16 v58, v53

    invoke-static/range {v1 .. v21}, Lsy0/m;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lb91/a;ZZFJJLl0/k1;ZLb2/f;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v18

    const/4 v1, 0x5

    int-to-float v1, v1

    move/from16 v12, v56

    move-object/from16 v4, v58

    invoke-static {v1, v12, v4, v5, v0}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    :goto_1b
    if-nez v9, :cond_36

    const v1, 0x20518e39

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    mul-float v11, v12, v12

    invoke-static {v11, v4}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v5, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    :goto_1c
    const/4 v9, 0x1

    goto :goto_1d

    :cond_36
    const v1, -0x4948130e

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    goto :goto_1c

    :goto_1d
    invoke-virtual {v5, v9}, Lp1/q;->q(Z)V

    new-instance v13, Lny0/o;

    sget-object v14, Lny0/q$a;->f:Lny0/q$a;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/k0;->B()I

    move-result v15

    const/16 v24, 0x3fc

    const/16 v25, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v13 .. v25}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v1, "email_logs_button"

    invoke-static {v4, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->y:Lb2/m;

    sget-object v3, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v3, v1, v2}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v7, 0x2

    int-to-float v2, v7

    mul-float/2addr v2, v12

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget v1, Lx60/b;->G:I

    invoke-static {v1, v5, v0}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move/from16 v6, v55

    const/16 v1, 0x20

    if-ne v6, v1, :cond_37

    move v10, v9

    goto :goto_1e

    :cond_37
    move v10, v0

    :goto_1e
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v10, :cond_39

    move-object/from16 v12, v57

    if-ne v0, v12, :cond_38

    goto :goto_1f

    :cond_38
    move-object/from16 v15, v54

    goto :goto_20

    :cond_39
    :goto_1f
    new-instance v0, Lky2/a;

    const/16 v1, 0x15

    move-object/from16 v15, v54

    invoke-direct {v0, v15, v1}, Lky2/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_20
    check-cast v0, Lc93/a;

    sget v7, Lny0/o;->k:I

    const/16 v8, 0x8

    const/4 v4, 0x0

    move-object v6, v5

    move-object v1, v13

    move-object v5, v0

    invoke-static/range {v1 .. v8}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v6

    invoke-virtual {v5, v9}, Lp1/q;->q(Z)V

    move-object v3, v15

    goto :goto_21

    :cond_3a
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v3, v7

    :goto_21
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_3b

    new-instance v0, Llq2/c;

    const/16 v5, 0xa

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Llq2/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_3b
    return-void
.end method

.method private static final n(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
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

.method private static final p(Lp1/c1;)Z
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

.method private static final q(Lp1/c1;Z)V
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

.method private static final r(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lj80/a$e;->a:Lj80/a$e;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lj80/a$c;->a:Lj80/a$c;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lcom/whoop/activation/domain/models/EmailDialogInfo;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lcom/whoop/activation/domain/models/EmailDialogInfo;->getSuggestedEmail()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p2}, Lm80/d;->C(Lp1/c1;)Ljava/lang/String;

    move-result-object p0

    :cond_0
    invoke-static {p2, p0}, Lm80/d;->D(Lp1/c1;Ljava/lang/String;)V

    new-instance p0, Lj80/a$s0;

    new-instance v0, Ld70/c;

    invoke-static {p2}, Lm80/d;->C(Lp1/c1;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Ld70/c;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lj80/a$s0;-><init>(Ld70/c;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lj80/a$e;->a:Lj80/a$e;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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

.method private static final v(Li3/z;)Ll83/a0;
    .locals 4

    const-string v0, "$this$semantics"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lc2/p;->a:Lc2/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lc2/o;->c:Lc2/g;

    sget-object v1, Li3/w;->a:[Lj93/z;

    sget-object v1, Li3/u;->q:Li3/y;

    sget-object v2, Li3/w;->a:[Lj93/z;

    const/16 v3, 0x8

    aget-object v2, v2, v3

    invoke-virtual {v1, p0, v0}, Li3/y;->a(Li3/z;Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lkotlin/jvm/functions/Function1;Lm80/e;Lp1/c1;Lp1/c1;Lg2/v;)Ll83/a0;
    .locals 3

    const-string v0, "focusState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lm80/d;->p(Lp1/c1;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lg2/w;

    invoke-virtual {v0}, Lg2/w;->b()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-static {p2, v0}, Lm80/d;->q(Lp1/c1;Z)V

    invoke-static {p3}, Lm80/d;->H(Lp1/c1;)Z

    move-result p3

    if-nez p3, :cond_0

    new-instance p3, Lh80/b$a;

    invoke-virtual {p1}, Lm80/e;->c()Ljava/lang/String;

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

    invoke-static {p2, p0}, Lm80/d;->q(Lp1/c1;Z)V

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final y(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3}, Lm80/d;->D(Lp1/c1;Ljava/lang/String;)V

    sget-object v0, Lk80/n;->a:Lk80/n;

    invoke-static {p1}, Lm80/d;->C(Lp1/c1;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lk80/n;->a(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p2, p1}, Lm80/d;->o(Lp1/c1;Z)V

    new-instance p1, Lj80/a$s0;

    new-instance p2, Ld70/c;

    invoke-direct {p2, p3}, Ld70/c;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lj80/a$s0;-><init>(Ld70/c;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lkotlin/jvm/functions/Function1;Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1, p2}, Lm80/d;->F(Lp1/c1;Z)V

    new-instance p1, Lj80/a$g0;

    invoke-direct {p1, p2}, Lj80/a$g0;-><init>(Z)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
