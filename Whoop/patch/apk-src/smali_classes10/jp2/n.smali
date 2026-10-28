.class public abstract Ljp2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001aq\u0010\u0014\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0019\u00b2\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0017\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0018\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ljp2/o;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "v",
        "(Landroidx/compose/ui/Modifier;Ljp2/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "textValue",
        "Lq3/n;",
        "keyboardType",
        "Lq3/k;",
        "imeAction",
        "displayLabel",
        "Lg2/i;",
        "focusManager",
        "onTextValueChange",
        "o",
        "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljp2/o;IILjava/lang/String;Lg2/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "isNodePositioned",
        "isFocused",
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


# direct methods
.method private static final A(Lc2/h;Lc2/l;Lkotlin/jvm/functions/Function1;Ljp2/o;Ljava/lang/String;Lp1/c1;Lp1/c1;Lp1/c1;Lg2/v;)Ll83/a0;
    .locals 7

    const-string v0, "focusState"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p5}, Ljp2/n;->J(Lp1/c1;)Z

    move-result v0

    check-cast p8, Lg2/w;

    invoke-virtual {p8}, Lg2/w;->b()Z

    move-result v1

    invoke-static {p5, v1}, Ljp2/n;->x(Lp1/c1;Z)V

    invoke-virtual {p8}, Lg2/w;->b()Z

    move-result p5

    if-eqz p5, :cond_0

    invoke-static {p6}, Ljp2/n;->H(Lp1/c1;)Z

    move-result p5

    if-eqz p5, :cond_0

    if-eqz p0, :cond_2

    check-cast p0, Lc2/a;

    invoke-virtual {p0, p1}, Lc2/a;->a(Lc2/l;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p8}, Lg2/w;->b()Z

    move-result p5

    if-nez p5, :cond_2

    if-eqz p0, :cond_1

    check-cast p0, Lc2/a;

    iget-object p5, p0, Lc2/a;->c:Landroid/view/autofill/AutofillManager;

    iget-object p0, p0, Lc2/a;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {p1}, Lc2/l;->b()I

    move-result p1

    invoke-virtual {p5, p0, p1}, Landroid/view/autofill/AutofillManager;->notifyViewExited(Landroid/view/View;I)V

    :cond_1
    if-eqz v0, :cond_2

    new-instance v1, Ljp2/i$b;

    invoke-virtual {p3}, Ljp2/o;->h()Ljava/lang/String;

    move-result-object v2

    invoke-static {p7}, Ljp2/n;->F(Lp1/c1;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3}, Ljp2/o;->l()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p3}, Ljp2/o;->k()Ljava/lang/Integer;

    move-result-object v6

    move-object v5, p4

    invoke-direct/range {v1 .. v6}, Ljp2/i$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-interface {p2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lkotlin/jvm/functions/Function1;Ljp2/o;Ljava/lang/String;Lp1/c1;Lp1/c1;Lg2/v;)Ll83/a0;
    .locals 6

    const-string v0, "focusState"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Ljp2/n;->J(Lp1/c1;)Z

    move-result v0

    check-cast p5, Lg2/w;

    invoke-virtual {p5}, Lg2/w;->b()Z

    move-result v1

    invoke-static {p3, v1}, Ljp2/n;->x(Lp1/c1;Z)V

    if-eqz v0, :cond_0

    invoke-virtual {p5}, Lg2/w;->b()Z

    move-result p3

    if-nez p3, :cond_0

    new-instance v0, Ljp2/i$b;

    invoke-virtual {p1}, Ljp2/o;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {p4}, Ljp2/n;->F(Lp1/c1;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ljp2/o;->l()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Ljp2/o;->k()Ljava/lang/Integer;

    move-result-object v5

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Ljp2/i$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Ljp2/n;->G(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lkotlin/jvm/functions/Function1;Ljp2/o;)Ll83/a0;
    .locals 1

    new-instance v0, Ljp2/i$a;

    invoke-virtual {p1}, Ljp2/o;->n()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljp2/i$a;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Landroidx/compose/ui/Modifier;Ljp2/o;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Ljp2/n;->v(Landroidx/compose/ui/Modifier;Ljp2/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lp1/c1;)Ljava/lang/String;
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

.method private static final G(Lp1/c1;Ljava/lang/String;)V
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

.method private static final I(Lp1/c1;Z)V
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

.method private static final J(Lp1/c1;)Z
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

.method public static synthetic a(Ljp2/o;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ljp2/n;->t(Ljp2/o;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljp2/o;IILjava/lang/String;Lg2/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p12}, Ljp2/n;->u(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljp2/o;IILjava/lang/String;Lg2/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljp2/o;Lg2/i;Lu0/p0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ljp2/n;->q(Ljp2/o;Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Ljp2/o;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ljp2/n;->E(Landroidx/compose/ui/Modifier;Ljp2/o;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljp2/n;->C(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp2/n;->w(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g()Ll83/a0;
    .locals 1

    invoke-static {}, Ljp2/n;->s()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h(Ljp2/o;Lg2/i;Lu0/p0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ljp2/n;->r(Ljp2/o;Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lc2/l;Lc2/h;Lp1/c1;Lp1/c1;Ly2/y;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ljp2/n;->z(Lc2/l;Lc2/h;Lp1/c1;Lp1/c1;Ly2/y;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lc2/h;Lc2/l;Lkotlin/jvm/functions/Function1;Ljp2/o;Ljava/lang/String;Lp1/c1;Lp1/c1;Lp1/c1;Lg2/v;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Ljp2/n;->A(Lc2/h;Lc2/l;Lkotlin/jvm/functions/Function1;Ljp2/o;Ljava/lang/String;Lp1/c1;Lp1/c1;Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Ljp2/o;Ljava/lang/String;Lp1/c1;Lp1/c1;Lg2/v;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ljp2/n;->B(Lkotlin/jvm/functions/Function1;Ljp2/o;Ljava/lang/String;Lp1/c1;Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;Ljp2/o;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljp2/n;->D(Lkotlin/jvm/functions/Function1;Ljp2/o;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Ljp2/o;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ljp2/n;->y(Ljp2/o;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ljp2/n;->p(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljp2/o;IILjava/lang/String;Lg2/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 52
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ljava/lang/String;",
            "Ljp2/o;",
            "II",
            "Ljava/lang/String;",
            "Lg2/i;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p2

    move-object/from16 v7, p6

    move/from16 v10, p10

    move-object/from16 v0, p9

    check-cast v0, Lp1/q;

    const v2, 0xe2a16f3

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p11, 0x1

    const/4 v4, 0x4

    if-eqz v2, :cond_0

    or-int/lit8 v5, v10, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v10, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v10

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v10

    :goto_1
    and-int/lit8 v8, v10, 0x30

    if-nez v8, :cond_4

    move-object/from16 v8, p1

    invoke-virtual {v0, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    const/16 v9, 0x20

    goto :goto_2

    :cond_3
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v6, v9

    goto :goto_3

    :cond_4
    move-object/from16 v8, p1

    :goto_3
    and-int/lit16 v9, v10, 0x180

    if-nez v9, :cond_7

    and-int/lit16 v9, v10, 0x200

    if-nez v9, :cond_5

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_4

    :cond_5
    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_4
    if-eqz v9, :cond_6

    const/16 v9, 0x100

    goto :goto_5

    :cond_6
    const/16 v9, 0x80

    :goto_5
    or-int/2addr v6, v9

    :cond_7
    and-int/lit16 v9, v10, 0xc00

    if-nez v9, :cond_9

    move/from16 v9, p3

    invoke-virtual {v0, v9}, Lp1/q;->e(I)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x800

    goto :goto_6

    :cond_8
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v6, v12

    goto :goto_7

    :cond_9
    move/from16 v9, p3

    :goto_7
    and-int/lit16 v12, v10, 0x6000

    if-nez v12, :cond_b

    move/from16 v12, p4

    invoke-virtual {v0, v12}, Lp1/q;->e(I)Z

    move-result v13

    if-eqz v13, :cond_a

    const/16 v13, 0x4000

    goto :goto_8

    :cond_a
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v6, v13

    goto :goto_9

    :cond_b
    move/from16 v12, p4

    :goto_9
    const/high16 v13, 0x30000

    and-int/2addr v13, v10

    if-nez v13, :cond_d

    move-object/from16 v13, p5

    invoke-virtual {v0, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_c

    const/high16 v15, 0x20000

    goto :goto_a

    :cond_c
    const/high16 v15, 0x10000

    :goto_a
    or-int/2addr v6, v15

    goto :goto_b

    :cond_d
    move-object/from16 v13, p5

    :goto_b
    const/high16 v15, 0x180000

    and-int/2addr v15, v10

    if-nez v15, :cond_f

    invoke-virtual {v0, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_e

    const/high16 v15, 0x100000

    goto :goto_c

    :cond_e
    const/high16 v15, 0x80000

    :goto_c
    or-int/2addr v6, v15

    :cond_f
    const/high16 v15, 0xc00000

    and-int/2addr v15, v10

    move/from16 p9, v15

    move-object/from16 v15, p7

    if-nez p9, :cond_11

    invoke-virtual {v0, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x800000

    goto :goto_d

    :cond_10
    const/high16 v16, 0x400000

    :goto_d
    or-int v6, v6, v16

    :cond_11
    const/high16 v16, 0x6000000

    and-int v16, v10, v16

    move-object/from16 v15, p8

    if-nez v16, :cond_13

    invoke-virtual {v0, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_12

    const/high16 v17, 0x4000000

    goto :goto_e

    :cond_12
    const/high16 v17, 0x2000000

    :goto_e
    or-int v6, v6, v17

    :cond_13
    const v17, 0x2492493

    and-int v11, v6, v17

    const v14, 0x2492492

    const/4 v15, 0x0

    if-eq v11, v14, :cond_14

    const/4 v11, 0x1

    goto :goto_f

    :cond_14
    move v11, v15

    :goto_f
    and-int/lit8 v14, v6, 0x1

    invoke-virtual {v0, v14, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_36

    sget-object v11, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_15

    move-object v2, v11

    goto :goto_10

    :cond_15
    move-object/from16 v2, p0

    :goto_10
    invoke-static {v8}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v14

    if-nez v14, :cond_16

    invoke-virtual {v1}, Ljp2/o;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    if-nez v14, :cond_16

    invoke-virtual {v1}, Ljp2/o;->p()Z

    move-result v14

    if-nez v14, :cond_16

    const/16 v37, 0x1

    goto :goto_11

    :cond_16
    move/from16 v37, v15

    :goto_11
    const/4 v14, 0x3

    int-to-float v14, v14

    int-to-float v4, v4

    mul-float/2addr v14, v4

    invoke-static {v14}, Lt0/j;->e(F)Lt0/i;

    move-result-object v14

    invoke-virtual {v1}, Ljp2/o;->p()Z

    move-result v19

    if-eqz v19, :cond_17

    const v5, 0x2c006cfa

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-static {v5, v0, v3, v15}, Lih0/d0;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v20

    goto :goto_12

    :cond_17
    const v3, 0x2c0070da

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v3, v0, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->c1()J

    move-result-wide v20

    invoke-virtual {v0, v15}, Lp1/q;->q(Z)V

    :goto_12
    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v5, v0, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    move/from16 v22, v4

    iget-wide v4, v0, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v24, La3/l;->a:La3/k;

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v40, v2

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v8, v0, Lp1/q;->S:Z

    if-eqz v8, :cond_18

    invoke-virtual {v0, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_18
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_13
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v0, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v0, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v9, v0, Lp1/q;->S:Z

    if-nez v9, :cond_19

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1a

    :cond_19
    invoke-static {v4, v0, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v0, v4, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljp2/o;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v9, v0, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    sget-object v15, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v9, v15}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    const-string v15, "toUpperCase(...)"

    invoke-static {v9, v15}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v15, 0x3f800000    # 1.0f

    move-object/from16 p0, v9

    invoke-static {v15, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v15, 0x2

    int-to-float v15, v15

    mul-float v15, v15, v22

    move/from16 v41, v10

    move-object/from16 v19, v11

    const/4 v11, 0x1

    int-to-float v10, v11

    mul-float v11, v10, v22

    new-instance v12, Ll0/l1;

    invoke-direct {v12, v11, v15, v11, v15}, Ll0/l1;-><init>(FFFF)V

    invoke-static {v12, v9}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v9, v0, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->m()Lb91/a;

    move-result-object v31

    sget v42, Lb91/a;->d:I

    shl-int/lit8 v35, v42, 0x12

    const v36, 0x2fff8

    const/high16 v22, 0x4000000

    const-wide/16 v15, 0x0

    const/high16 v25, 0x20000

    const/16 v17, 0x0

    const/16 v26, 0x100

    const/16 v18, 0x0

    move-object/from16 v27, v19

    const/16 v19, 0x0

    move-object/from16 v28, v14

    move-wide/from16 v13, v20

    const-wide/16 v20, 0x0

    move/from16 v29, v22

    const/16 v22, 0x0

    const/16 v30, 0x0

    const/16 v23, 0x0

    move/from16 v33, v25

    const/high16 v32, 0x3f800000    # 1.0f

    const-wide/16 v24, 0x0

    move/from16 v34, v26

    const/16 v26, 0x0

    move-object/from16 v38, v27

    const/16 v27, 0x0

    move-object/from16 v43, v28

    const/16 v28, 0x0

    move/from16 v44, v29

    const/16 v29, 0x0

    move/from16 v45, v30

    const/16 v30, 0x0

    move/from16 v46, v32

    const/16 v32, 0x0

    move/from16 v47, v34

    const/16 v34, 0x0

    move-object/from16 v33, v0

    move/from16 p9, v6

    move v1, v11

    move-object/from16 v0, v38

    move-object/from16 v7, v43

    move/from16 v6, v46

    move-object/from16 v11, p0

    invoke-static/range {v11 .. v36}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v33

    if-eqz v37, :cond_1b

    const v12, 0x6926c69c

    invoke-virtual {v11, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->Y0()J

    move-result-wide v12

    invoke-static {v0, v10, v12, v13, v7}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/4 v12, 0x0

    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_1b
    const/4 v12, 0x0

    const v10, 0x6929a831

    invoke-virtual {v11, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    move-object v10, v0

    :goto_14
    sget-object v13, Lb2/e;->w:Lb2/m;

    invoke-static {v13, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    iget-wide v14, v11, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v11, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_1c

    invoke-virtual {v11, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_1c
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_15
    invoke-static {v11, v8, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v3, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v11, Lp1/q;->S:Z

    if-nez v2, :cond_1d

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1e

    :cond_1d
    invoke-static {v12, v11, v12, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1e
    invoke-static {v11, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static/range {p1 .. p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v9, v11, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->m()Lb91/a;

    move-result-object v10

    invoke-virtual/range {p2 .. p2}, Ljp2/o;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_1f

    const v0, -0x519b52d6

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    const/4 v12, 0x0

    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    move-object/from16 v43, v2

    goto :goto_16

    :cond_1f
    const/4 v12, 0x0

    const v3, -0x519b52d5

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    new-instance v3, Ljp2/m;

    invoke-direct {v3, v0, v12}, Ljp2/m;-><init>(Lcom/whoop/design/util/TextResource;I)V

    const v0, 0x5d861a11

    invoke-static {v0, v11, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    invoke-virtual {v11, v12}, Lp1/q;->q(Z)V

    move-object/from16 v43, v0

    :goto_16
    invoke-virtual/range {p2 .. p2}, Ljp2/o;->p()Z

    move-result v44

    move/from16 v0, p9

    and-int/lit16 v3, v0, 0x380

    const/16 v4, 0x100

    if-eq v3, v4, :cond_22

    and-int/lit16 v5, v0, 0x200

    if-eqz v5, :cond_20

    move-object/from16 v5, p2

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_21

    goto :goto_18

    :cond_20
    move-object/from16 v5, p2

    :cond_21
    const/4 v15, 0x0

    :goto_17
    move-object/from16 v46, v7

    move-object/from16 v7, p6

    goto :goto_19

    :cond_22
    move-object/from16 v5, p2

    :goto_18
    const/4 v15, 0x1

    goto :goto_17

    :goto_19
    invoke-virtual {v11, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v12, v15

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-nez v12, :cond_24

    if-ne v13, v14, :cond_23

    goto :goto_1a

    :cond_23
    const/4 v12, 0x1

    goto :goto_1b

    :cond_24
    :goto_1a
    new-instance v13, Ljp2/j;

    const/4 v12, 0x1

    invoke-direct {v13, v5, v7, v12}, Ljp2/j;-><init>(Ljp2/o;Lg2/i;I)V

    invoke-virtual {v11, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1b
    move-object/from16 v16, v13

    check-cast v16, Lkotlin/jvm/functions/Function1;

    if-eq v3, v4, :cond_26

    and-int/lit16 v13, v0, 0x200

    if-eqz v13, :cond_25

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_25

    goto :goto_1c

    :cond_25
    const/4 v15, 0x0

    goto :goto_1d

    :cond_26
    :goto_1c
    move v15, v12

    :goto_1d
    invoke-virtual {v11, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v13, v15

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v13, :cond_27

    if-ne v15, v14, :cond_28

    :cond_27
    new-instance v15, Ljp2/j;

    const/4 v13, 0x0

    invoke-direct {v15, v5, v7, v13}, Ljp2/j;-><init>(Ljp2/o;Lg2/i;I)V

    invoke-virtual {v11, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_28
    move-object/from16 v17, v15

    check-cast v17, Lkotlin/jvm/functions/Function1;

    new-instance v15, Lu0/q0;

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x3a

    invoke-direct/range {v15 .. v20}, Lu0/q0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    move-object/from16 v39, v15

    invoke-virtual {v5}, Ljp2/o;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    if-nez v13, :cond_29

    const v13, -0x518ed9b7

    invoke-virtual {v11, v13}, Lp1/q;->e0(I)V

    const/4 v15, 0x0

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    move-object v13, v2

    move/from16 v2, v41

    goto :goto_1e

    :cond_29
    const/4 v15, 0x0

    const v2, -0x518ed9b6

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    move/from16 v2, v41

    invoke-static {v13, v11, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    :goto_1e
    if-nez v13, :cond_2a

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    :cond_2a
    move-object/from16 v41, v13

    invoke-virtual {v5}, Ljp2/o;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    if-eqz v13, :cond_2b

    move/from16 v47, v12

    goto :goto_1f

    :cond_2b
    const/16 v47, 0x0

    :goto_1f
    invoke-virtual {v9, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->f()J

    move-result-wide v48

    invoke-virtual {v9, v11, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->a()Lb91/a;

    move-result-object v50

    sget-object v13, Lg1/i8;->a:Lg1/i8;

    invoke-virtual {v5}, Ljp2/o;->p()Z

    move-result v13

    if-eqz v13, :cond_2c

    const v13, 0x372d24d6

    invoke-static {v11, v13, v9, v11, v1}, Lr80/c;->c(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v15

    const/4 v13, 0x0

    :goto_20
    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    goto :goto_21

    :cond_2c
    const/4 v13, 0x0

    const v15, 0x372d28b9

    invoke-static {v11, v15, v9, v11, v1}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v15

    goto :goto_20

    :goto_21
    invoke-virtual {v5}, Ljp2/o;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v17

    if-eqz v17, :cond_2d

    const v12, 0x372d35c4

    invoke-virtual {v11, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->g()J

    move-result-wide v18

    :goto_22
    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    goto :goto_23

    :cond_2d
    const v12, 0x372d3b56

    invoke-virtual {v11, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->r()J

    move-result-wide v18

    goto :goto_22

    :goto_23
    invoke-virtual {v9, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v20

    invoke-virtual {v9, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v22

    invoke-virtual {v9, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->b1()J

    move-result-wide v24

    invoke-virtual {v9, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->W0()J

    move-result-wide v26

    invoke-virtual {v9, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->f()J

    move-result-wide v28

    const-wide/16 v35, 0x0

    const v38, 0x1ffe82

    move/from16 v45, v13

    move-object v1, v14

    const-wide/16 v13, 0x0

    move-object/from16 v37, v11

    move-wide v11, v15

    move-wide/from16 v15, v18

    move-wide/from16 v17, v20

    move-wide/from16 v19, v22

    move-wide/from16 v21, v24

    move-wide/from16 v23, v26

    const/4 v9, 0x1

    const-wide/16 v25, 0x0

    move-wide/from16 v27, v28

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const-wide/16 v33, 0x0

    invoke-static/range {v11 .. v38}, Lg1/i8;->h(JJJJJJJJJJJJJLandroidx/compose/runtime/Composer;I)Lg1/y1;

    move-result-object v38

    move-object/from16 v11, v37

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v1, :cond_2e

    new-instance v12, Ljp1/p;

    const/4 v13, 0x5

    invoke-direct {v12, v13}, Ljp1/p;-><init>(I)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2e
    check-cast v12, Lc93/a;

    if-eq v3, v4, :cond_30

    and-int/lit16 v3, v0, 0x200

    if-eqz v3, :cond_2f

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2f

    goto :goto_24

    :cond_2f
    move/from16 v15, v45

    goto :goto_25

    :cond_30
    :goto_24
    move v15, v9

    :goto_25
    const/high16 v3, 0x1c00000

    and-int/2addr v3, v0

    const/high16 v4, 0x800000

    if-ne v3, v4, :cond_31

    move v3, v9

    goto :goto_26

    :cond_31
    move/from16 v3, v45

    :goto_26
    or-int/2addr v3, v15

    const/high16 v4, 0x70000

    and-int/2addr v4, v0

    const/high16 v13, 0x20000

    if-ne v4, v13, :cond_32

    move v15, v9

    goto :goto_27

    :cond_32
    move/from16 v15, v45

    :goto_27
    or-int/2addr v3, v15

    const/high16 v4, 0xe000000

    and-int/2addr v4, v0

    const/high16 v13, 0x4000000

    if-ne v4, v13, :cond_33

    move v15, v9

    goto :goto_28

    :cond_33
    move/from16 v15, v45

    :goto_28
    or-int/2addr v3, v15

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_34

    if-ne v4, v1, :cond_35

    :cond_34
    move v1, v0

    goto :goto_29

    :cond_35
    move v13, v2

    move/from16 v17, v9

    move-object/from16 v51, v40

    move v9, v0

    goto :goto_2a

    :goto_29
    new-instance v0, Lam2/s;

    const/16 v5, 0x1c

    move-object/from16 v3, p5

    move-object/from16 v4, p8

    move v13, v2

    move/from16 v17, v9

    move-object/from16 v51, v40

    move-object/from16 v2, p7

    move v9, v1

    move-object/from16 v1, p2

    invoke-direct/range {v0 .. v5}, Lam2/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v0

    :goto_2a
    check-cast v4, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v0, v13, 0x3

    or-int/lit16 v0, v0, 0xc06

    shl-int/lit8 v1, v42, 0x6

    or-int/2addr v0, v1

    shl-int/lit8 v1, v42, 0xc

    or-int/2addr v0, v1

    shl-int/lit8 v1, v13, 0x18

    or-int v45, v0, v1

    shl-int/lit8 v0, v9, 0x3

    const v1, 0xe000

    and-int/2addr v0, v1

    const/high16 v1, 0x380000

    shl-int/lit8 v2, v9, 0x6

    and-int/2addr v1, v2

    or-int/2addr v0, v1

    move-wide/from16 v23, v48

    const v49, 0x19beaca0

    move-object/from16 v13, v50

    const/16 v50, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    move-object/from16 v15, v39

    const/16 v39, 0x0

    const/16 v40, 0x0

    move/from16 v20, v47

    const/16 v47, 0x0

    const/16 v48, 0x6

    move/from16 v26, p3

    move/from16 v28, p4

    move-object/from16 v42, v12

    move/from16 v9, v17

    move-object/from16 v19, v41

    move-object/from16 v17, v43

    move/from16 v34, v44

    move-object/from16 v37, v46

    move/from16 v46, v0

    move-object/from16 v43, v4

    move-object v12, v8

    move-object/from16 v44, v11

    move-object/from16 v41, v15

    move-object v11, v6

    move-object v15, v10

    invoke-static/range {v11 .. v50}, Lqz0/k;->l(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lb91/a;Lc93/m;Lc93/m;Lqz0/c;Lcom/whoop/design/util/TextResource;ZZLb91/a;JZIIIZLq3/g0;ZZIZLj0/i;Ljava/lang/String;Li2/a1;Lg1/e8;Ll0/k1;Ll0/k1;Lu0/q0;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIIIII)V

    move-object/from16 v11, v44

    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    move-object/from16 v1, v51

    goto :goto_2b

    :cond_36
    move-object v11, v0

    invoke-virtual {v11}, Lp1/q;->X()V

    move-object/from16 v1, p0

    :goto_2b
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_37

    new-instance v0, Ljp2/k;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Ljp2/k;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljp2/o;IILjava/lang/String;Lg2/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_37
    return-void
.end method

.method private static final p(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    move-object/from16 v1, p0

    invoke-static {v1, v2, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v1, v2, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->b1()J

    move-result-wide v4

    invoke-virtual {v1, v2, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->a()Lb91/a;

    move-result-object v22

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

.method private static final q(Ljp2/o;Lg2/i;Lu0/p0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$KeyboardActions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljp2/o;->o()Z

    move-result p0

    if-eqz p0, :cond_0

    invoke-static {p1}, Lg2/i;->a(Lg2/i;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Ljp2/o;Lg2/i;Lu0/p0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$KeyboardActions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljp2/o;->o()Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    check-cast p1, Lg2/l;

    invoke-virtual {p1, p0}, Lg2/l;->h(I)Z

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final t(Ljp2/o;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 7

    const-string v0, "newText"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljp2/o;->j()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0}, Ljp2/o;->j()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-le v0, v1, :cond_0

    invoke-virtual {p0}, Ljp2/o;->j()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0, p4}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p4

    :cond_0
    move-object v2, p4

    new-instance v0, Ljp2/i$c;

    invoke-virtual {p0}, Ljp2/o;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ljp2/o;->j()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p0}, Ljp2/o;->k()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p0}, Ljp2/o;->l()Ljava/lang/String;

    move-result-object v5

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Ljp2/i$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p3, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljp2/o;IILjava/lang/String;Lg2/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 13

    or-int/lit8 v0, p9, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v12, p10

    move-object/from16 v10, p11

    invoke-static/range {v1 .. v12}, Ljp2/n;->o(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljp2/o;IILjava/lang/String;Lg2/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final v(Landroidx/compose/ui/Modifier;Ljp2/o;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ljp2/o;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v12, p4

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v0, -0xeb8d335

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v12, 0x6

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v12, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v12

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v3, v12

    :goto_1
    and-int/lit8 v4, v12, 0x30

    if-nez v4, :cond_5

    and-int/lit8 v4, v12, 0x40

    if-nez v4, :cond_3

    invoke-virtual {v9, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_2

    :cond_3
    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_2
    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_3

    :cond_4
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_5
    and-int/lit8 v4, p5, 0x4

    if-eqz v4, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move-object/from16 v5, p2

    :goto_4
    move v15, v3

    goto :goto_6

    :cond_7
    and-int/lit16 v5, v12, 0x180

    if-nez v5, :cond_6

    move-object/from16 v5, p2

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x100

    goto :goto_5

    :cond_8
    const/16 v6, 0x80

    :goto_5
    or-int/2addr v3, v6

    goto :goto_4

    :goto_6
    and-int/lit16 v3, v15, 0x93

    const/16 v6, 0x92

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v3, v6, :cond_9

    move v3, v11

    goto :goto_7

    :cond_9
    move v3, v10

    :goto_7
    and-int/lit8 v6, v15, 0x1

    invoke-virtual {v9, v6, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_32

    sget-object v6, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_a

    move-object v7, v6

    goto :goto_8

    :cond_a
    move-object v7, v1

    :goto_8
    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_c

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_b

    new-instance v0, Ljp2/f;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljp2/f;-><init>(I)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v0, Lkotlin/jvm/functions/Function1;

    move-object v1, v0

    goto :goto_9

    :cond_c
    move-object v1, v5

    :goto_9
    invoke-virtual {v2}, Ljp2/o;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_d

    const v0, -0x364756e2

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    goto :goto_a

    :cond_d
    const v4, -0x364756e1

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v9, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v2}, Ljp2/o;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v4, v9, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Ljp2/o;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v9, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    or-int v3, v3, v16

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v3, :cond_e

    if-ne v13, v8, :cond_10

    :cond_e
    if-nez v0, :cond_f

    const-string v0, ""

    :cond_f
    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v13

    invoke-virtual {v9, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v13, Lp1/c1;

    sget-object v0, Lb3/v1;->i:Lp1/u2;

    invoke-virtual {v9, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v16, v0

    check-cast v16, Lg2/i;

    invoke-virtual {v2}, Ljp2/o;->i()I

    move-result v17

    invoke-virtual {v2}, Ljp2/o;->o()Z

    move-result v0

    const/16 v18, 0x6

    if-eqz v0, :cond_11

    const/4 v0, 0x7

    move/from16 v19, v0

    goto :goto_b

    :cond_11
    move/from16 v19, v18

    :goto_b
    invoke-virtual {v2}, Ljp2/o;->h()Ljava/lang/String;

    move-result-object v0

    const-string v3, "country"

    invoke-static {v0, v3, v11}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v20

    sget-object v0, Lb3/v1;->b:Lp1/u2;

    invoke-virtual {v9, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v23, v0

    check-cast v23, Lc2/h;

    sget-object v0, Lb3/v1;->c:Lp1/u2;

    invoke-virtual {v9, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc2/m;

    invoke-virtual {v2}, Ljp2/o;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v3, :cond_12

    if-ne v11, v8, :cond_13

    :cond_12
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v11

    invoke-virtual {v9, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v11, Lp1/c1;

    invoke-virtual {v2}, Ljp2/o;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v3, :cond_14

    if-ne v14, v8, :cond_15

    :cond_14
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v14

    invoke-virtual {v9, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v14, Lp1/c1;

    invoke-virtual {v2}, Ljp2/o;->p()Z

    move-result v3

    if-nez v3, :cond_18

    const v3, -0x36395c13

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Ljp2/o;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v3, :cond_17

    if-ne v10, v8, :cond_16

    goto :goto_c

    :cond_16
    move-object v12, v0

    move-object v3, v4

    move/from16 p2, v5

    move-object/from16 v27, v6

    move-object v4, v13

    move-object/from16 v6, v23

    goto :goto_d

    :cond_17
    :goto_c
    new-instance v10, Lc2/l;

    invoke-virtual {v2}, Ljp2/o;->c()Lc2/n;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->L(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    move-object/from16 v21, v0

    new-instance v0, Lam2/s;

    move/from16 v22, v5

    const/16 v5, 0x1d

    move-object/from16 p2, v2

    move-object v2, v1

    move-object/from16 v1, p2

    move-object/from16 p2, v13

    move-object v13, v3

    move-object v3, v4

    move-object/from16 v4, p2

    move-object/from16 v27, v6

    move-object/from16 v12, v21

    move/from16 p2, v22

    move-object/from16 v6, v23

    invoke-direct/range {v0 .. v5}, Lam2/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v28, v2

    move-object v2, v1

    move-object/from16 v1, v28

    invoke-direct {v10, v13, v0}, Lc2/l;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_d
    move-object v0, v10

    check-cast v0, Lc2/l;

    iget-object v5, v12, Lc2/m;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Lc2/l;->b()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v5, v10, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_18
    move-object v3, v4

    move/from16 p2, v5

    move-object/from16 v27, v6

    move v5, v10

    move-object v4, v13

    move-object/from16 v6, v23

    const v0, -0x3628b07d

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    :goto_e
    const/high16 v10, 0x3f800000    # 1.0f

    if-eqz v20, :cond_19

    invoke-virtual {v2}, Ljp2/o;->p()Z

    move-result v12

    if-eqz v12, :cond_19

    const v0, -0x36273b47

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    invoke-static {v10, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object v13, v7

    move v2, v10

    move-object/from16 v14, v27

    const/4 v5, 0x0

    move-object v10, v8

    goto/16 :goto_18

    :cond_19
    const v5, -0x36246970    # -1798866.0f

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    invoke-static {v10, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    if-eqz v0, :cond_21

    const v5, 0x5b4a1dfd

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v9, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v5, v13

    invoke-virtual {v9, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v5, v13

    invoke-virtual {v9, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v5, v13

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v5, :cond_1a

    if-ne v13, v8, :cond_1b

    :cond_1a
    new-instance v21, Ljp2/l;

    const/16 v26, 0x0

    move-object/from16 v22, v0

    move-object/from16 v23, v6

    move-object/from16 v24, v11

    move-object/from16 v25, v14

    invoke-direct/range {v21 .. v26}, Ljp2/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v13, v21

    invoke-virtual {v9, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-static {v12, v13}, Landroidx/compose/ui/layout/a;->d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v9, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v9, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v5, v13

    invoke-virtual {v9, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v5, v13

    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v5, v13

    and-int/lit16 v13, v15, 0x380

    const/16 v10, 0x100

    if-ne v13, v10, :cond_1c

    const/4 v10, 0x1

    goto :goto_f

    :cond_1c
    const/4 v10, 0x0

    :goto_f
    or-int/2addr v5, v10

    and-int/lit8 v10, v15, 0x70

    const/16 v13, 0x20

    if-eq v10, v13, :cond_1e

    and-int/lit8 v10, v15, 0x40

    if-eqz v10, :cond_1d

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1d

    goto :goto_10

    :cond_1d
    const/4 v10, 0x0

    goto :goto_11

    :cond_1e
    :goto_10
    const/4 v10, 0x1

    :goto_11
    or-int/2addr v5, v10

    invoke-virtual {v9, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v5, v10

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v5, v10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v5, :cond_1f

    if-ne v10, v8, :cond_20

    :cond_1f
    move-object/from16 v22, v0

    goto :goto_12

    :cond_20
    move-object v13, v7

    move-object v0, v10

    move-object/from16 v14, v27

    move-object v10, v8

    goto :goto_13

    :goto_12
    new-instance v0, Lam2/g0;

    move-object v5, v3

    move-object v13, v7

    move-object v10, v8

    move-object v7, v11

    move-object v3, v1

    move-object v8, v4

    move-object v1, v6

    move-object v6, v14

    move-object/from16 v14, v27

    move-object v4, v2

    move-object/from16 v2, v22

    invoke-direct/range {v0 .. v8}, Lam2/g0;-><init>(Lc2/h;Lc2/l;Lkotlin/jvm/functions/Function1;Ljp2/o;Ljava/lang/String;Lp1/c1;Lp1/c1;Lp1/c1;)V

    move-object v1, v3

    move-object v2, v4

    move-object v3, v5

    move-object v4, v8

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_13
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v12, v0}, Landroidx/compose/ui/focus/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v5, 0x0

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    goto :goto_17

    :cond_21
    move-object v13, v7

    move-object v10, v8

    move-object v6, v14

    move-object/from16 v14, v27

    const v0, 0x5b64ca77

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    and-int/lit16 v5, v15, 0x380

    const/16 v7, 0x100

    if-ne v5, v7, :cond_22

    const/4 v5, 0x1

    goto :goto_14

    :cond_22
    const/4 v5, 0x0

    :goto_14
    or-int/2addr v0, v5

    and-int/lit8 v5, v15, 0x70

    const/16 v7, 0x20

    if-eq v5, v7, :cond_24

    and-int/lit8 v5, v15, 0x40

    if-eqz v5, :cond_23

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_23

    goto :goto_15

    :cond_23
    const/4 v5, 0x0

    goto :goto_16

    :cond_24
    :goto_15
    const/4 v5, 0x1

    :goto_16
    or-int/2addr v0, v5

    invoke-virtual {v9, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v0, v5

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v0, v5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_25

    if-ne v5, v10, :cond_26

    :cond_25
    new-instance v0, Lam2/r;

    move-object v5, v4

    move-object v4, v6

    invoke-direct/range {v0 .. v5}, Lam2/r;-><init>(Lkotlin/jvm/functions/Function1;Ljp2/o;Ljava/lang/String;Lp1/c1;Lp1/c1;)V

    move-object v4, v5

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v0

    :cond_26
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v12, v5}, Landroidx/compose/ui/focus/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v5, 0x0

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    :goto_17
    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    const/high16 v2, 0x3f800000    # 1.0f

    :goto_18
    invoke-static {v2, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v7, v9, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v9, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v12, v9, Lp1/q;->S:Z

    if-eqz v12, :cond_27

    invoke-virtual {v9, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_19

    :cond_27
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_19
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v9, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v9, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-nez v8, :cond_28

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_29

    :cond_28
    invoke-static {v7, v9, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_29
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v9, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v2, v1

    invoke-static {v4}, Ljp2/n;->F(Lp1/c1;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v9, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_2a

    if-ne v7, v10, :cond_2b

    :cond_2a
    new-instance v7, Lf1/a0;

    const/16 v6, 0x1c

    invoke-direct {v7, v6, v4}, Lf1/a0;-><init>(ILp1/c1;)V

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2b
    move-object v8, v7

    check-cast v8, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v4, p2, 0x6

    shl-int/lit8 v6, v15, 0x3

    and-int/lit16 v6, v6, 0x380

    or-int/2addr v4, v6

    shl-int/lit8 v6, v15, 0xf

    const/high16 v7, 0x1c00000

    and-int/2addr v6, v7

    or-int/2addr v4, v6

    const/4 v11, 0x0

    move-object v7, v2

    move-object v5, v3

    move-object v12, v10

    move-object/from16 v6, v16

    move/from16 v3, v17

    move-object/from16 v2, p1

    move v10, v4

    move-object/from16 v16, v13

    move/from16 v4, v19

    const/4 v13, 0x1

    invoke-static/range {v0 .. v11}, Ljp2/n;->o(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljp2/o;IILjava/lang/String;Lg2/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v1, v7

    if-eqz v20, :cond_31

    invoke-virtual {v2}, Ljp2/o;->p()Z

    move-result v0

    if-eqz v0, :cond_31

    const v0, 0x5435e83c

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    sget-object v0, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v0, v14}, Landroidx/compose/foundation/layout/b;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    and-int/lit16 v0, v15, 0x380

    const/16 v10, 0x100

    if-ne v0, v10, :cond_2c

    move v10, v13

    goto :goto_1a

    :cond_2c
    const/4 v10, 0x0

    :goto_1a
    and-int/lit8 v0, v15, 0x70

    const/16 v7, 0x20

    if-eq v0, v7, :cond_2e

    and-int/lit8 v0, v15, 0x40

    if-eqz v0, :cond_2d

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2d

    goto :goto_1b

    :cond_2d
    const/4 v0, 0x0

    goto :goto_1c

    :cond_2e
    :goto_1b
    move v0, v13

    :goto_1c
    or-int/2addr v0, v10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_2f

    if-ne v4, v12, :cond_30

    :cond_2f
    new-instance v4, Lj11/q;

    const/16 v0, 0x8

    invoke-direct {v4, v0, v1, v2}, Lj11/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_30
    move-object v7, v4

    check-cast v7, Lc93/a;

    const/16 v8, 0xf

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v5, 0x0

    invoke-static {v0, v9, v5}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    goto :goto_1d

    :cond_31
    const/4 v5, 0x0

    const v0, 0x5439f811

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    :goto_1d
    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    move-object v3, v1

    move-object/from16 v1, v16

    goto :goto_1e

    :cond_32
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v3, v5

    :goto_1e
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_33

    new-instance v0, Ljp1/d;

    const/4 v6, 0x3

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ljp1/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_33
    return-void
.end method

.method private static final w(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lp1/c1;Z)V
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

.method private static final y(Ljp2/o;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 7

    const-string v0, "filledValue"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljp2/o;->j()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {p0}, Ljp2/o;->j()Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-le v0, v1, :cond_0

    invoke-virtual {p0}, Ljp2/o;->j()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0, p4}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p4

    :cond_0
    move-object v2, p4

    invoke-static {p3, v2}, Ljp2/n;->G(Lp1/c1;Ljava/lang/String;)V

    new-instance v0, Ljp2/i$c;

    invoke-virtual {p0}, Ljp2/o;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ljp2/o;->j()Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p0}, Ljp2/o;->k()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p0}, Ljp2/o;->l()Ljava/lang/String;

    move-result-object v5

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Ljp2/i$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lc2/l;Lc2/h;Lp1/c1;Lp1/c1;Ly2/y;)Ll83/a0;
    .locals 1

    const-string v0, "coordinates"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4}, Ly2/q1;->f(Ly2/y;)Lh2/c;

    move-result-object p4

    iput-object p4, p0, Lc2/l;->b:Lh2/c;

    const/4 p4, 0x1

    invoke-static {p2, p4}, Ljp2/n;->I(Lp1/c1;Z)V

    invoke-static {p3}, Ljp2/n;->J(Lp1/c1;)Z

    move-result p2

    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    check-cast p1, Lc2/a;

    invoke-virtual {p1, p0}, Lc2/a;->a(Lc2/l;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
