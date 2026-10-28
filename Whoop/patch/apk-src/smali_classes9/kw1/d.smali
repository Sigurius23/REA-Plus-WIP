.class public abstract Lkw1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u001aE\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0008H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0089\u0001\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000c2\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00082\u0016\u0008\u0002\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u00060\u00042\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00082\u001a\u0008\u0002\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00060\u00112\u0014\u0008\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u001a?\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000e2\u000e\u0008\u0002\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0008H\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!\u00b2\u0006\u000e\u0010 \u001a\u00020\u001a8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Liw1/b;",
        "viewState",
        "Lq22/e;",
        "formValidator",
        "Lkotlin/Function1;",
        "Liw1/a;",
        "Ll83/a0;",
        "onViewEvent",
        "Lkotlin/Function0;",
        "onBackNavigation",
        "v",
        "(Liw1/b;Lq22/e;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "Liw1/b$c;",
        "onBackButtonClicked",
        "",
        "onApplyPromoCodeClicked",
        "onPlaceOrderButtonClicked",
        "Lkotlin/Function2;",
        "",
        "Lcom/whoop/membership/extensions/domain/models/OrderOption;",
        "onUpdateOrderOption",
        "Lcom/whoop/payments/domain/models/Card;",
        "onCardUpdated",
        "K",
        "(Lq22/e;Liw1/b$c;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "buttonText",
        "",
        "buttonEnabled",
        "securityText",
        "disclaimerText",
        "G",
        "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "canSubmit",
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
.method private static final A(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Liw1/b;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 7

    check-cast p0, Liw1/b$c;

    invoke-virtual {p0}, Liw1/b$c;->b()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Liw1/b$c;->getPath()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    new-instance v6, Liw1/a$e;

    const/4 v4, 0x5

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;->copy$default(Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    move-result-object p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p2

    :goto_0
    invoke-direct {v6, v0, p0, v2}, Liw1/a$e;-><init>(Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Liw1/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 10

    check-cast p0, Liw1/b$c;

    invoke-virtual {p0}, Liw1/b$c;->b()Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    move-result-object v1

    const/4 v0, 0x0

    if-eqz v1, :cond_1

    move-object v2, v0

    new-instance v0, Liw1/a$d;

    move-object v3, v2

    invoke-virtual {p0}, Liw1/b$c;->j()Llw1/j;

    move-result-object v2

    invoke-virtual {p0}, Liw1/b$c;->k()Llw1/k;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Llw1/k;->f()Ljava/lang/String;

    move-result-object v3

    :cond_0
    invoke-virtual {p0}, Liw1/b$c;->c()Ljava/util/List;

    move-result-object v4

    invoke-virtual {p0}, Liw1/b$c;->g()Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Liw1/a$d;-><init>(Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Llw1/j;Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    move-object v3, v0

    invoke-virtual {p0}, Liw1/b$c;->i()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v5, Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;

    const-string v1, "sku"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-nez v1, :cond_2

    const-string v1, ""

    :cond_2
    const-string v2, "promo_code"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v4, "new_tier"

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v5, v1, v2, v0}, Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Liw1/a$d;

    invoke-virtual {p0}, Liw1/b$c;->j()Llw1/j;

    move-result-object v6

    invoke-virtual {p0}, Liw1/b$c;->k()Llw1/k;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Llw1/k;->f()Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    goto :goto_0

    :cond_3
    move-object v7, v3

    :goto_0
    invoke-virtual {p0}, Liw1/b$c;->c()Ljava/util/List;

    move-result-object v8

    invoke-virtual {p0}, Liw1/b$c;->g()Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;

    move-result-object v9

    invoke-direct/range {v4 .. v9}, Liw1/a$d;-><init>(Lcom/whoop/membership/extensions/domain/models/CheckoutPayload;Llw1/j;Ljava/lang/String;Ljava/util/List;Lcom/whoop/membership/extensions/domain/models/StepPrefetchContent;)V

    invoke-interface {p1, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Liw1/b;Lkotlin/jvm/functions/Function1;ILcom/whoop/membership/extensions/domain/models/OrderOption;)Ll83/a0;
    .locals 1

    const-string v0, "optionUpdated"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Liw1/b$c;

    invoke-virtual {p0}, Liw1/b$c;->c()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-static {p0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0, p2, p3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Liw1/a$g;

    invoke-direct {p2, p0}, Liw1/a$g;-><init>(Ljava/util/List;)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lkotlin/jvm/functions/Function1;Lcom/whoop/payments/domain/models/Card;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Liw1/a$f;

    invoke-direct {v0, p1}, Liw1/a$f;-><init>(Lcom/whoop/payments/domain/models/Card;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Liw1/b;Lq22/e;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lkw1/d;->v(Liw1/b;Lq22/e;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 59
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v6, p6

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v0, -0x483025ef

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    const/4 v1, 0x2

    const/4 v2, 0x4

    move-object/from16 v9, p0

    if-nez v0, :cond_1

    invoke-virtual {v12, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v3, v6, 0x30

    move/from16 v10, p1

    if-nez v3, :cond_3

    invoke-virtual {v12, v10}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit16 v3, v6, 0x180

    if-nez v3, :cond_5

    move-object/from16 v3, p2

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v0, v4

    goto :goto_4

    :cond_5
    move-object/from16 v3, p2

    :goto_4
    and-int/lit16 v4, v6, 0xc00

    if-nez v4, :cond_7

    move-object/from16 v4, p3

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x800

    goto :goto_5

    :cond_6
    const/16 v5, 0x400

    :goto_5
    or-int/2addr v0, v5

    goto :goto_6

    :cond_7
    move-object/from16 v4, p3

    :goto_6
    and-int/lit8 v5, p7, 0x10

    const/16 v7, 0x4000

    if-eqz v5, :cond_9

    or-int/lit16 v0, v0, 0x6000

    :cond_8
    move-object/from16 v8, p4

    goto :goto_8

    :cond_9
    and-int/lit16 v8, v6, 0x6000

    if-nez v8, :cond_8

    move-object/from16 v8, p4

    invoke-virtual {v12, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    move v11, v7

    goto :goto_7

    :cond_a
    const/16 v11, 0x2000

    :goto_7
    or-int/2addr v0, v11

    :goto_8
    and-int/lit16 v11, v0, 0x2493

    const/16 v13, 0x2492

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v11, v13, :cond_b

    move v11, v15

    goto :goto_9

    :cond_b
    move v11, v14

    :goto_9
    and-int/lit8 v13, v0, 0x1

    invoke-virtual {v12, v13, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_14

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_d

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v11, :cond_c

    new-instance v5, Lku2/a;

    const/16 v8, 0x13

    invoke-direct {v5, v8}, Lku2/a;-><init>(I)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v5, Lc93/a;

    goto :goto_a

    :cond_d
    move-object v5, v8

    :goto_a
    int-to-float v1, v1

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v1, v8

    int-to-float v2, v2

    mul-float/2addr v2, v8

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v13, v1, v2}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v16, v13

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move/from16 v17, v8

    sget-object v8, Lny0/v;->TextLarge:Lny0/v;

    const v18, 0xe000

    and-int v13, v0, v18

    if-ne v13, v7, :cond_e

    move v7, v15

    goto :goto_b

    :cond_e
    move v7, v14

    :goto_b
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v7, :cond_f

    if-ne v13, v11, :cond_10

    :cond_f
    new-instance v13, Liy0/a;

    const/16 v7, 0xc

    invoke-direct {v13, v5, v7}, Liy0/a;-><init>(Lc93/a;I)V

    invoke-virtual {v12, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v13, Lc93/a;

    shl-int/lit8 v7, v0, 0x6

    and-int/lit16 v11, v7, 0x380

    move/from16 v18, v11

    const/16 v11, 0x36

    or-int/lit8 v18, v18, 0x36

    and-int/lit16 v7, v7, 0x1c00

    or-int v7, v18, v7

    const/16 v18, 0x70

    move/from16 v19, v11

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    move/from16 v20, v15

    move-object v15, v13

    const/4 v13, 0x0

    move/from16 v21, v14

    const/4 v14, 0x0

    move/from16 p5, v0

    move/from16 p4, v17

    const/high16 v0, 0x3f800000    # 1.0f

    move/from16 v17, v7

    move-object v7, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v29

    invoke-static/range {v7 .. v18}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v12, v16

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Ll0/m;->e:Ll0/h;

    sget-object v9, Lb2/e;->K:Lb2/l;

    const/16 v10, 0x36

    invoke-static {v8, v9, v12, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

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

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-eqz v13, :cond_11

    invoke-virtual {v12, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_11
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_c
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v12, v11, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v12, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-nez v10, :cond_12

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_13

    :cond_12
    invoke-static {v9, v12, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v12, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v7, Lp22/a;->g:I

    const/4 v15, 0x0

    invoke-static {v7, v12, v15}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v7

    sget-wide v10, Li2/x;->n:J

    const/16 v13, 0xc30

    const/4 v14, 0x4

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v14}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v7, v12, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->c()Lb91/a;

    move-result-object v27

    invoke-virtual {v7, v12, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    shr-int/lit8 v11, p5, 0x6

    and-int/lit8 v30, v11, 0xe

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v31, v11, 0x12

    const v32, 0x2fffa

    move v11, v8

    const/4 v8, 0x0

    move v13, v11

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    move v14, v13

    const/4 v13, 0x0

    move/from16 v16, v14

    const/4 v14, 0x0

    move/from16 v33, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const-wide/16 v16, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    const-wide/16 v20, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v26, v25

    const/16 v25, 0x0

    move/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v34, v28

    const/16 v28, 0x0

    move-object/from16 v35, v7

    move-object v7, v3

    move-object/from16 v3, v35

    move/from16 v35, v34

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    const/4 v7, 0x1

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v1

    move/from16 v18, v2

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move/from16 v11, v35

    invoke-virtual {v3, v12, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->m()Lb91/a;

    move-result-object v0

    invoke-virtual {v0}, Lb91/a;->d()Ll3/v0;

    move-result-object v13

    const v27, 0xff7fff

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x3

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    invoke-static/range {v13 .. v27}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v37

    invoke-virtual {v3, v12, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v38

    invoke-virtual {v3, v12, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->k0()J

    move-result-wide v40

    invoke-virtual {v3, v12, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X()J

    move-result-wide v42

    invoke-virtual {v3, v12, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v45

    new-instance v0, Liz0/a;

    invoke-virtual {v3, v12, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->N()Lb91/a;

    move-result-object v1

    invoke-virtual {v3, v12, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->O()Lb91/a;

    move-result-object v2

    invoke-virtual {v3, v12, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->P()Lb91/a;

    move-result-object v7

    invoke-virtual {v3, v12, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->Q()Lb91/a;

    move-result-object v9

    invoke-direct {v0, v1, v2, v7, v9}, Liz0/a;-><init>(Lb91/a;Lb91/a;Lb91/a;Lb91/a;)V

    invoke-virtual {v3, v12, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v51

    const/4 v15, 0x0

    int-to-float v1, v15

    mul-float v53, v1, p4

    invoke-virtual {v3, v12, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v48

    sget-object v44, Lp3/r;->I:Lp3/r;

    new-instance v10, Liz0/m;

    const/16 v56, 0x0

    const/16 v58, 0x0

    const/16 v47, 0x1

    const/16 v55, 0x0

    move/from16 v54, v53

    move/from16 v57, v53

    move-object/from16 v50, v0

    move-object/from16 v36, v10

    invoke-direct/range {v36 .. v58}, Liz0/m;-><init>(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    shr-int/lit8 v0, p5, 0x9

    and-int/lit8 v0, v0, 0xe

    or-int/lit8 v0, v0, 0x30

    sget v1, Liz0/m;->p:I

    shl-int/lit8 v1, v1, 0x9

    or-int v17, v0, v1

    const/16 v18, 0x1f4

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v7, v4

    move-object/from16 v16, v29

    invoke-static/range {v7 .. v18}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v12, v16

    goto :goto_d

    :cond_14
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v5, v8

    :goto_d
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_15

    new-instance v0, Lbf0/g;

    const/16 v8, 0x17

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lbf0/g;-><init>(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Lc93/a;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method private static final H()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final I(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lkw1/d;->G(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lq22/e;Liw1/b$c;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 53
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq22/e;",
            "Liw1/b$c;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Lc93/m;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v9, p1

    move/from16 v10, p8

    move-object/from16 v6, p7

    check-cast v6, Lp1/q;

    const v0, 0x64b73ece

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v10, 0x6

    const/4 v2, 0x2

    if-nez v0, :cond_2

    and-int/lit8 v0, v10, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    or-int/2addr v0, v10

    goto :goto_2

    :cond_2
    move v0, v10

    :goto_2
    and-int/lit8 v4, v10, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v6, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v0, v4

    :cond_4
    and-int/lit8 v4, p9, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v5, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v10, 0x180

    if-nez v5, :cond_5

    move-object/from16 v5, p2

    invoke-virtual {v6, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v0, v7

    :goto_5
    and-int/lit8 v7, p9, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move-object/from16 v8, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v8, v10, 0xc00

    if-nez v8, :cond_8

    move-object/from16 v8, p3

    invoke-virtual {v6, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_6

    :cond_a
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v0, v11

    :goto_7
    and-int/lit8 v11, p9, 0x10

    if-eqz v11, :cond_c

    or-int/lit16 v0, v0, 0x6000

    :cond_b
    move-object/from16 v12, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v12, v10, 0x6000

    if-nez v12, :cond_b

    move-object/from16 v12, p4

    invoke-virtual {v6, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_d

    const/16 v13, 0x4000

    goto :goto_8

    :cond_d
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v0, v13

    :goto_9
    and-int/lit8 v13, p9, 0x20

    const/high16 v15, 0x30000

    if-eqz v13, :cond_f

    or-int/2addr v0, v15

    :cond_e
    move-object/from16 v15, p5

    goto :goto_b

    :cond_f
    and-int/2addr v15, v10

    if-nez v15, :cond_e

    move-object/from16 v15, p5

    invoke-virtual {v6, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v16, 0x10000

    :goto_a
    or-int v0, v0, v16

    :goto_b
    and-int/lit8 v16, p9, 0x40

    const/high16 v17, 0x180000

    if-eqz v16, :cond_12

    or-int v0, v0, v17

    move-object/from16 v14, p6

    :cond_11
    :goto_c
    move/from16 v24, v0

    goto :goto_e

    :cond_12
    and-int v17, v10, v17

    move-object/from16 v14, p6

    if-nez v17, :cond_11

    invoke-virtual {v6, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_13

    const/high16 v18, 0x100000

    goto :goto_d

    :cond_13
    const/high16 v18, 0x80000

    :goto_d
    or-int v0, v0, v18

    goto :goto_c

    :goto_e
    const v0, 0x92493

    and-int v0, v24, v0

    const v3, 0x92492

    const/4 v5, 0x0

    if-eq v0, v3, :cond_14

    const/4 v0, 0x1

    goto :goto_f

    :cond_14
    move v0, v5

    :goto_f
    and-int/lit8 v3, v24, 0x1

    invoke-virtual {v6, v3, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2e

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_16

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_15

    new-instance v3, Lku2/a;

    const/16 v4, 0x11

    invoke-direct {v3, v4}, Lku2/a;-><init>(I)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v3, Lc93/a;

    move-object v14, v3

    goto :goto_10

    :cond_16
    move-object/from16 v14, p2

    :goto_10
    if-eqz v7, :cond_18

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_17

    new-instance v3, Lkm2/e;

    const/16 v4, 0xc

    invoke-direct {v3, v4}, Lkm2/e;-><init>(I)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object/from16 v25, v3

    goto :goto_11

    :cond_18
    move-object/from16 v25, p3

    :goto_11
    if-eqz v11, :cond_1a

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_19

    new-instance v3, Lku2/a;

    const/16 v4, 0x12

    invoke-direct {v3, v4}, Lku2/a;-><init>(I)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v3, Lc93/a;

    move-object/from16 v26, v3

    goto :goto_12

    :cond_1a
    move-object/from16 v26, v12

    :goto_12
    if-eqz v13, :cond_1c

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_1b

    new-instance v3, Lkf0/l;

    const/4 v4, 0x2

    invoke-direct {v3, v4}, Lkf0/l;-><init>(I)V

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v3, Lc93/m;

    goto :goto_13

    :cond_1c
    move-object v3, v15

    :goto_13
    if-eqz v16, :cond_1e

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_1d

    new-instance v4, Lkm2/e;

    const/16 v7, 0xd

    invoke-direct {v4, v7}, Lkm2/e;-><init>(I)V

    invoke-virtual {v6, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_14

    :cond_1e
    move-object/from16 v4, p6

    :goto_14
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_1f

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v6, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v7, Lp1/c1;

    const/high16 v11, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v11}, Ll0/f;->l(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v15, Lx81/d;->b:I

    invoke-virtual {v13, v6, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->o()J

    move-result-wide v8

    sget-object v15, Li2/w0;->a:Li2/v0;

    invoke-static {v11, v8, v9, v15}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    int-to-float v2, v2

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v2, v9

    invoke-static {v2, v8}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v11, Lb2/e;->M:Lb2/k;

    invoke-static {v8, v11, v6, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v15

    move/from16 v33, v9

    iget-wide v9, v6, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v6, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v1, v6, Lp1/q;->S:Z

    if-eqz v1, :cond_20

    invoke-virtual {v6, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_20
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_15
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v6, v1, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->f:La3/i;

    invoke-static {v6, v15, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    move-object/from16 p2, v3

    iget-boolean v3, v6, Lp1/q;->S:Z

    if-nez v3, :cond_21

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 p3, v11

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v3, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_22

    goto :goto_16

    :cond_21
    move-object/from16 p3, v11

    :goto_16
    invoke-static {v9, v6, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_22
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v6, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v34, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual/range {p1 .. p1}, Liw1/b$c;->m()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v35

    invoke-static {v13}, Lev/n;->h(Lx81/d;)Ljava/lang/Integer;

    move-result-object v37

    sget v2, Lgy0/f;->K:I

    invoke-static {v6, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v38

    const v51, 0xfff2

    const/16 v52, 0x0

    const/16 v36, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    invoke-direct/range {v34 .. v52}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v2, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v2, v2, 0x3

    shl-int/lit8 v9, v24, 0x3

    and-int/lit16 v9, v9, 0x1c00

    or-int v18, v2, v9

    const/16 v19, 0x35

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-object v2, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v6

    move-object v9, v12

    move-object/from16 v12, v34

    move-object v6, v2

    move-object/from16 v2, p3

    invoke-static/range {v11 .. v19}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v34, v14

    move-object/from16 v11, v17

    const/4 v12, 0x0

    const/4 v13, 0x1

    invoke-static {v12, v11, v13}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v14

    const/16 v15, 0xe

    invoke-static {v9, v14, v15}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-static {v8, v2, v11, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v11, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-eqz v14, :cond_23

    invoke-virtual {v11, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_17

    :cond_23
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_17
    invoke-static {v11, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v11, Lp1/q;->S:Z

    if-nez v1, :cond_24

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_25

    :cond_24
    invoke-static {v8, v11, v8, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_25
    invoke-static {v11, v3, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Liw1/b$c;->j()Llw1/j;

    move-result-object v1

    move-object/from16 v10, p1

    invoke-virtual {v11, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    const/high16 v3, 0x380000

    and-int v3, v24, v3

    const/high16 v5, 0x100000

    if-ne v3, v5, :cond_26

    const/4 v3, 0x1

    goto :goto_18

    :cond_26
    const/4 v3, 0x0

    :goto_18
    or-int/2addr v2, v3

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_27

    if-ne v3, v0, :cond_28

    :cond_27
    new-instance v3, Ljp1/k;

    const/4 v2, 0x3

    invoke-direct {v3, v10, v4, v7, v2}, Ljp1/k;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_28
    check-cast v3, Lc93/m;

    sget v2, Lq22/e;->d:I

    const/4 v12, 0x6

    shl-int/2addr v2, v12

    or-int/2addr v2, v12

    shl-int/lit8 v5, v24, 0x6

    and-int/lit16 v5, v5, 0x380

    or-int/2addr v2, v5

    const/16 v8, 0x28

    move-object v5, v4

    move-object v4, v3

    const/4 v3, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    const/4 v14, 0x1

    move-object/from16 v15, p2

    move-object v13, v0

    move-object/from16 v35, v6

    move-object/from16 v36, v7

    move-object v0, v9

    move-object v6, v11

    const/4 v9, 0x0

    const/4 v11, 0x4

    move v7, v2

    move-object/from16 v2, p0

    invoke-static/range {v0 .. v8}, Llw1/e;->h(Landroidx/compose/ui/Modifier;Llw1/j;Lq22/e;ZLc93/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    int-to-float v1, v11

    mul-float v1, v1, v33

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v14}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/16 v22, 0x6

    const/16 v23, 0xfe

    move v1, v12

    const/4 v12, 0x0

    move-object v3, v13

    const/4 v13, 0x0

    move/from16 v21, v14

    const/4 v14, 0x0

    move-object v4, v15

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    move-object v8, v4

    move v4, v1

    move/from16 v1, v21

    move-object/from16 v21, v6

    invoke-static/range {v11 .. v23}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    const-wide/high16 v11, 0x3ff8000000000000L    # 1.5

    double-to-float v5, v11

    mul-float v29, v5, v33

    const/16 v32, 0x7

    const/16 v28, 0x0

    move/from16 v31, v29

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v27, v0

    invoke-static/range {v27 .. v32}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v5, v27

    invoke-virtual {v10}, Liw1/b$c;->h()Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;

    move-result-object v7

    invoke-static {v0, v7, v6, v4, v9}, Llw1/c;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/membership/extensions/domain/models/NativeOrderDetails;Landroidx/compose/runtime/Composer;II)V

    const v0, -0x74591e6d

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10}, Liw1/b$c;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v7, v9

    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_2d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v12, v7, 0x1

    if-ltz v7, :cond_2c

    check-cast v11, Lcom/whoop/membership/extensions/domain/models/OrderOption;

    int-to-float v13, v1

    mul-float v13, v13, v33

    invoke-static {v5, v2, v13, v1}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/high16 v14, 0x70000

    and-int v14, v24, v14

    const/high16 v15, 0x20000

    if-ne v14, v15, :cond_29

    move v14, v1

    goto :goto_1a

    :cond_29
    move v14, v9

    :goto_1a
    invoke-virtual {v6, v7}, Lp1/q;->e(I)Z

    move-result v16

    or-int v14, v14, v16

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v14, :cond_2a

    if-ne v1, v3, :cond_2b

    :cond_2a
    new-instance v1, Lkw1/a;

    const/4 v14, 0x0

    invoke-direct {v1, v8, v7, v14}, Lkw1/a;-><init>(Lc93/m;II)V

    invoke-virtual {v6, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2b
    check-cast v1, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x6

    const/4 v14, 0x0

    move-object/from16 p4, v1

    move-object/from16 p5, v6

    move/from16 p6, v7

    move-object/from16 p3, v11

    move-object/from16 p2, v13

    move/from16 p7, v14

    invoke-static/range {p2 .. p7}, Llw1/d;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/membership/extensions/domain/models/OrderOption;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move v7, v12

    const/4 v1, 0x1

    goto :goto_19

    :cond_2c
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_2d
    invoke-virtual {v6, v9}, Lp1/q;->q(Z)V

    move/from16 v29, v31

    const/16 v31, 0x0

    const/16 v32, 0xd

    const/16 v28, 0x0

    const/16 v30, 0x0

    move-object/from16 v27, v5

    invoke-static/range {v27 .. v32}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v10}, Liw1/b$c;->k()Llw1/k;

    move-result-object v1

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v2, v2, 0x3

    or-int/2addr v2, v4

    shr-int/lit8 v3, v24, 0x3

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v2, v3

    const/4 v3, 0x0

    move-object/from16 p2, v0

    move-object/from16 p3, v1

    move/from16 p6, v2

    move/from16 p7, v3

    move-object/from16 p5, v6

    move-object/from16 p4, v25

    invoke-static/range {p2 .. p7}, Llw1/f;->g(Landroidx/compose/ui/Modifier;Llw1/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v9, p4

    invoke-virtual {v10}, Liw1/b$c;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static/range {v36 .. v36}, Lkw1/d;->Q(Lp1/c1;)Z

    move-result v1

    invoke-virtual {v10}, Liw1/b$c;->l()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v10}, Liw1/b$c;->f()Ljava/lang/String;

    move-result-object v3

    const v4, 0xe000

    and-int v4, v24, v4

    const/4 v7, 0x0

    move-object v5, v6

    const/4 v13, 0x1

    move v6, v4

    move-object/from16 v4, v26

    invoke-static/range {v0 .. v7}, Lkw1/d;->G(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v5

    invoke-virtual {v6, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v13}, Lp1/q;->q(Z)V

    move-object v5, v4

    move-object v11, v6

    move-object v6, v8

    move-object v4, v9

    move-object/from16 v3, v34

    move-object/from16 v7, v35

    goto :goto_1b

    :cond_2e
    move-object v10, v9

    invoke-virtual {v6}, Lp1/q;->X()V

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v7, p6

    move-object v11, v6

    move-object v5, v12

    move-object v6, v15

    :goto_1b
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_2f

    new-instance v0, Lbb2/g;

    move-object/from16 v1, p0

    move/from16 v8, p8

    move/from16 v9, p9

    move-object v2, v10

    invoke-direct/range {v0 .. v9}, Lbb2/g;-><init>(Lq22/e;Liw1/b$c;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_2f
    return-void
.end method

.method private static final L()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final M(Ljava/lang/String;)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final O(ILcom/whoop/membership/extensions/domain/models/OrderOption;)Ll83/a0;
    .locals 0

    const-string p0, "<unused var>"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Lcom/whoop/payments/domain/models/Card;)Ll83/a0;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Q(Lp1/c1;)Z
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

.method private static final R(Lp1/c1;Z)V
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

.method private static final S(Liw1/b$c;Lkotlin/jvm/functions/Function1;Lp1/c1;ZLcom/whoop/payments/domain/models/Card;)Ll83/a0;
    .locals 1

    const-string v0, "newCard"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Liw1/b$c;->j()Llw1/j;

    move-result-object p0

    invoke-virtual {p0}, Llw1/j;->a()Lcom/whoop/payments/domain/models/Card;

    move-result-object p0

    invoke-virtual {p4, p0}, Lcom/whoop/payments/domain/models/Card;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p2}, Lkw1/d;->Q(Lp1/c1;)Z

    move-result p0

    if-eq p3, p0, :cond_1

    :cond_0
    invoke-static {p2, p3}, Lkw1/d;->R(Lp1/c1;Z)V

    invoke-interface {p1, p4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final T(Lc93/m;ILcom/whoop/membership/extensions/domain/models/OrderOption;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final U(Lq22/e;Liw1/b$c;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v10, p8

    move-object/from16 v8, p9

    invoke-static/range {v1 .. v10}, Lkw1/d;->K(Lq22/e;Liw1/b$c;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lcom/whoop/payments/domain/models/Card;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkw1/d;->P(Lcom/whoop/payments/domain/models/Card;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lcom/whoop/payments/domain/models/Card;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lkw1/d;->E(Lkotlin/jvm/functions/Function1;Lcom/whoop/payments/domain/models/Card;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Liw1/b;Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lkw1/d;->y(Lkotlin/jvm/functions/Function1;Liw1/b;Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Liw1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkw1/d;->w(Liw1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkw1/d;->I(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(ILcom/whoop/membership/extensions/domain/models/OrderOption;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lkw1/d;->O(ILcom/whoop/membership/extensions/domain/models/OrderOption;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Liw1/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lkw1/d;->C(Liw1/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h()Ll83/a0;
    .locals 1

    invoke-static {}, Lkw1/d;->N()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i(Lc93/m;ILcom/whoop/membership/extensions/domain/models/OrderOption;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lkw1/d;->T(Lc93/m;ILcom/whoop/membership/extensions/domain/models/OrderOption;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Liw1/b;Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lkw1/d;->z(Lkotlin/jvm/functions/Function1;Liw1/b;Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k()Ll83/a0;
    .locals 1

    invoke-static {}, Lkw1/d;->L()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic l()Ll83/a0;
    .locals 1

    invoke-static {}, Lkw1/d;->H()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic m(Liw1/b;Lkotlin/jvm/functions/Function1;ILcom/whoop/membership/extensions/domain/models/OrderOption;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lkw1/d;->D(Liw1/b;Lkotlin/jvm/functions/Function1;ILcom/whoop/membership/extensions/domain/models/OrderOption;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Liw1/b;Lq22/e;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lkw1/d;->F(Liw1/b;Lq22/e;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Liw1/b;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lkw1/d;->B(Liw1/b;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lkw1/d;->J(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkw1/d;->A(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lq22/e;Liw1/b$c;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Lkw1/d;->U(Lq22/e;Liw1/b$c;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkw1/d;->M(Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Liw1/b$c;Lkotlin/jvm/functions/Function1;Lp1/c1;ZLcom/whoop/payments/domain/models/Card;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lkw1/d;->S(Liw1/b$c;Lkotlin/jvm/functions/Function1;Lp1/c1;ZLcom/whoop/payments/domain/models/Card;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u()Ll83/a0;
    .locals 1

    invoke-static {}, Lkw1/d;->x()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final v(Liw1/b;Lq22/e;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liw1/b;",
            "Lq22/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v0, p5

    const-string v3, "viewState"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "formValidator"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v3, -0x5fb93706

    invoke-virtual {v9, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v0, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_2

    and-int/lit8 v3, v0, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v0

    goto :goto_2

    :cond_2
    move v3, v0

    :goto_2
    and-int/lit8 v5, v0, 0x30

    if-nez v5, :cond_5

    and-int/lit8 v5, v0, 0x40

    if-nez v5, :cond_3

    invoke-virtual {v9, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_3

    :cond_3
    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_3
    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_4

    :cond_4
    const/16 v5, 0x10

    :goto_4
    or-int/2addr v3, v5

    :cond_5
    and-int/lit8 v5, p6, 0x4

    const/16 v6, 0x100

    if-eqz v5, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move-object/from16 v7, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v7, v0, 0x180

    if-nez v7, :cond_6

    move-object/from16 v7, p2

    invoke-virtual {v9, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    move v8, v6

    goto :goto_5

    :cond_8
    const/16 v8, 0x80

    :goto_5
    or-int/2addr v3, v8

    :goto_6
    and-int/lit8 v8, p6, 0x8

    const/16 v10, 0x800

    if-eqz v8, :cond_a

    or-int/lit16 v3, v3, 0xc00

    :cond_9
    move-object/from16 v11, p3

    goto :goto_8

    :cond_a
    and-int/lit16 v11, v0, 0xc00

    if-nez v11, :cond_9

    move-object/from16 v11, p3

    invoke-virtual {v9, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    move v12, v10

    goto :goto_7

    :cond_b
    const/16 v12, 0x400

    :goto_7
    or-int/2addr v3, v12

    :goto_8
    and-int/lit16 v12, v3, 0x493

    const/16 v13, 0x492

    const/4 v15, 0x0

    if-eq v12, v13, :cond_c

    const/4 v12, 0x1

    goto :goto_9

    :cond_c
    move v12, v15

    :goto_9
    and-int/lit8 v13, v3, 0x1

    invoke-virtual {v9, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_33

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_e

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v12, :cond_d

    new-instance v5, Lkm2/e;

    const/16 v7, 0xb

    invoke-direct {v5, v7}, Lkm2/e;-><init>(I)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v13, v5

    goto :goto_a

    :cond_e
    move-object v13, v7

    :goto_a
    if-eqz v8, :cond_10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v12, :cond_f

    new-instance v5, Lku2/a;

    const/16 v7, 0x14

    invoke-direct {v5, v7}, Lku2/a;-><init>(I)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v5, Lc93/a;

    goto :goto_b

    :cond_10
    move-object v5, v11

    :goto_b
    instance-of v7, v1, Liw1/b$a;

    if-eqz v7, :cond_16

    const v7, -0x564768b7

    invoke-virtual {v9, v7}, Lp1/q;->e0(I)V

    move-object v7, v1

    check-cast v7, Liw1/b$a;

    invoke-virtual {v7}, Liw1/b$a;->e()Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    move-result-object v7

    and-int/lit16 v8, v3, 0x380

    if-ne v8, v6, :cond_11

    const/4 v6, 0x1

    goto :goto_c

    :cond_11
    move v6, v15

    :goto_c
    and-int/lit8 v8, v3, 0xe

    if-eq v8, v4, :cond_13

    and-int/lit8 v3, v3, 0x8

    if-eqz v3, :cond_12

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    goto :goto_d

    :cond_12
    move v14, v15

    goto :goto_e

    :cond_13
    :goto_d
    const/4 v14, 0x1

    :goto_e
    or-int v3, v6, v14

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_14

    if-ne v4, v12, :cond_15

    :cond_14
    new-instance v4, Lkw1/b;

    const/4 v3, 0x0

    invoke-direct {v4, v13, v1, v3}, Lkw1/b;-><init>(Lkotlin/jvm/functions/Function1;Liw1/b;I)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v7, v4, v9, v15, v15}, Lkw1/m;->e(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    :goto_f
    move-object v12, v5

    goto/16 :goto_1f

    :cond_16
    instance-of v7, v1, Liw1/b$b;

    if-eqz v7, :cond_1c

    const v7, -0x56474c55

    invoke-virtual {v9, v7}, Lp1/q;->e0(I)V

    move-object v7, v1

    check-cast v7, Liw1/b$b;

    invoke-virtual {v7}, Liw1/b$b;->e()Lcom/whoop/membership/extensions/domain/models/ProgressContent;

    move-result-object v7

    and-int/lit16 v8, v3, 0x380

    if-ne v8, v6, :cond_17

    const/4 v6, 0x1

    goto :goto_10

    :cond_17
    move v6, v15

    :goto_10
    and-int/lit8 v8, v3, 0xe

    if-eq v8, v4, :cond_19

    and-int/lit8 v3, v3, 0x8

    if-eqz v3, :cond_18

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_18

    goto :goto_11

    :cond_18
    move v14, v15

    goto :goto_12

    :cond_19
    :goto_11
    const/4 v14, 0x1

    :goto_12
    or-int v3, v6, v14

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_1a

    if-ne v4, v12, :cond_1b

    :cond_1a
    new-instance v4, Lkw1/b;

    const/4 v3, 0x1

    invoke-direct {v4, v13, v1, v3}, Lkw1/b;-><init>(Lkotlin/jvm/functions/Function1;Liw1/b;I)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v7, v4, v9, v15, v15}, Lkw1/n;->e(Lcom/whoop/membership/extensions/domain/models/ProgressContent;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_1c
    instance-of v7, v1, Liw1/b$c;

    if-eqz v7, :cond_32

    const v7, -0x564728ab

    invoke-virtual {v9, v7}, Lp1/q;->e0(I)V

    move-object v7, v1

    check-cast v7, Liw1/b$c;

    and-int/lit16 v8, v3, 0x1c00

    if-ne v8, v10, :cond_1d

    const/4 v8, 0x1

    goto :goto_13

    :cond_1d
    move v8, v15

    :goto_13
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_1e

    if-ne v10, v12, :cond_1f

    :cond_1e
    new-instance v10, Liy0/a;

    const/16 v8, 0xd

    invoke-direct {v10, v5, v8}, Liy0/a;-><init>(Lc93/a;I)V

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v10, Lc93/a;

    and-int/lit8 v8, v3, 0xe

    if-eq v8, v4, :cond_21

    and-int/lit8 v11, v3, 0x8

    if-eqz v11, :cond_20

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_20

    goto :goto_14

    :cond_20
    move v11, v15

    goto :goto_15

    :cond_21
    :goto_14
    const/4 v11, 0x1

    :goto_15
    and-int/lit16 v14, v3, 0x380

    if-ne v14, v6, :cond_22

    const/16 v16, 0x1

    goto :goto_16

    :cond_22
    move/from16 v16, v15

    :goto_16
    or-int v11, v11, v16

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v11, :cond_23

    if-ne v15, v12, :cond_24

    :cond_23
    new-instance v15, Lkw1/b;

    invoke-direct {v15, v1, v13}, Lkw1/b;-><init>(Liw1/b;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v9, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    check-cast v15, Lkotlin/jvm/functions/Function1;

    if-eq v8, v4, :cond_26

    and-int/lit8 v11, v3, 0x8

    if-eqz v11, :cond_25

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_25

    goto :goto_17

    :cond_25
    const/4 v11, 0x0

    goto :goto_18

    :cond_26
    :goto_17
    const/4 v11, 0x1

    :goto_18
    if-ne v14, v6, :cond_27

    const/16 v17, 0x1

    goto :goto_19

    :cond_27
    const/16 v17, 0x0

    :goto_19
    or-int v11, v11, v17

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v11, :cond_28

    if-ne v6, v12, :cond_29

    :cond_28
    new-instance v6, Lj11/q;

    const/16 v11, 0x1a

    invoke-direct {v6, v1, v13, v11}, Lj11/q;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_29
    check-cast v6, Lc93/a;

    if-eq v8, v4, :cond_2b

    and-int/lit8 v4, v3, 0x8

    if-eqz v4, :cond_2a

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2a

    goto :goto_1b

    :cond_2a
    const/4 v4, 0x0

    :goto_1a
    const/16 v8, 0x100

    goto :goto_1c

    :cond_2b
    :goto_1b
    const/4 v4, 0x1

    goto :goto_1a

    :goto_1c
    if-ne v14, v8, :cond_2c

    const/4 v8, 0x1

    goto :goto_1d

    :cond_2c
    const/4 v8, 0x0

    :goto_1d
    or-int/2addr v4, v8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_2d

    if-ne v8, v12, :cond_2e

    :cond_2d
    new-instance v8, Lj21/d;

    const/4 v4, 0x7

    invoke-direct {v8, v4, v1, v13}, Lj21/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2e
    check-cast v8, Lc93/m;

    const/16 v4, 0x100

    if-ne v14, v4, :cond_2f

    const/4 v14, 0x1

    goto :goto_1e

    :cond_2f
    const/4 v14, 0x0

    :goto_1e
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v14, :cond_30

    if-ne v4, v12, :cond_31

    :cond_30
    new-instance v4, Ljp1/n;

    const/16 v11, 0x13

    invoke-direct {v4, v13, v11}, Ljp1/n;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_31
    check-cast v4, Lkotlin/jvm/functions/Function1;

    sget v11, Lq22/e;->d:I

    shr-int/lit8 v12, v3, 0x3

    and-int/lit8 v12, v12, 0xe

    or-int/2addr v11, v12

    shl-int/lit8 v3, v3, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v3, v11

    const/4 v11, 0x0

    move-object v12, v10

    move v10, v3

    move-object v3, v7

    move-object v7, v8

    move-object v8, v4

    move-object v4, v12

    move-object v12, v5

    move-object v5, v15

    invoke-static/range {v2 .. v11}, Lkw1/d;->K(Lq22/e;Liw1/b$c;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v2, 0x0

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    :goto_1f
    move-object v4, v12

    move-object v3, v13

    goto :goto_20

    :cond_32
    move v2, v15

    const v0, -0x564767fa

    invoke-static {v0, v9, v2}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_33
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v3, v7

    move-object v4, v11

    :goto_20
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_34

    new-instance v0, Lkw1/c;

    const/4 v7, 0x0

    move-object/from16 v2, p1

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lkw1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_34
    return-void
.end method

.method private static final w(Liw1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final y(Lkotlin/jvm/functions/Function1;Liw1/b;Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Liw1/a$a;

    invoke-direct {v0, p1, p2}, Liw1/a$a;-><init>(Liw1/b;Lcom/whoop/membership/extensions/domain/models/CtaAction;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lkotlin/jvm/functions/Function1;Liw1/b;Lcom/whoop/membership/extensions/domain/models/CtaAction;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Liw1/a$a;

    invoke-direct {v0, p1, p2}, Liw1/a$a;-><init>(Liw1/b;Lcom/whoop/membership/extensions/domain/models/CtaAction;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
