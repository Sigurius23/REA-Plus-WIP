.class public abstract Lw80/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0011\u00b2\u0006\u000e\u0010\t\u001a\u00020\u00088\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\n\u001a\u00020\u00088\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u000c\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u0010\u0010\r\u001a\u0004\u0018\u00010\u000b8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u000e\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u0010\u001a\u00020\u000b8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lw80/c;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "m",
        "(Lw80/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "emailValue",
        "passwordValue",
        "",
        "hidePassword",
        "isEmailValid",
        "shouldValidateEmailOnInput",
        "isPasswordValid",
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
.method private static final A(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 2

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3}, Lw80/b;->J(Lp1/c1;Ljava/lang/String;)V

    invoke-static {p1}, Lw80/b;->I(Lp1/c1;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    const/16 v0, 0xc

    const/4 v1, 0x0

    if-lt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p2, p1}, Lw80/b;->t(Lp1/c1;Ljava/lang/Boolean;)V

    new-instance p1, Lj80/a$u0;

    new-instance p2, Ld70/e;

    invoke-direct {p2, p3}, Ld70/e;-><init>(Ljava/lang/String;)V

    const/4 p3, 0x2

    const/4 v0, 0x0

    invoke-direct {p1, p2, v1, p3, v0}, Lj80/a$u0;-><init>(Ld70/e;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final C(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p4}, Lw80/b;->H(Lp1/c1;Ljava/lang/String;)V

    invoke-static {p2}, Lw80/b;->q(Lp1/c1;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Lk80/n;->a:Lk80/n;

    invoke-static {p1}, Lw80/b;->v(Lp1/c1;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lk80/n;->a(Ljava/lang/String;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p3, p1}, Lw80/b;->p(Lp1/c1;Ljava/lang/Boolean;)V

    :cond_0
    new-instance p1, Lj80/a$s0;

    new-instance p2, Ld70/c;

    invoke-direct {p2, p4}, Ld70/c;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lj80/a$s0;-><init>(Ld70/c;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lp1/c1;Lp1/c1;Lg2/v;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lg2/w;

    invoke-virtual {p2}, Lg2/w;->a()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-static {p0}, Lw80/b;->I(Lp1/c1;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-lez p2, :cond_1

    invoke-static {p0}, Lw80/b;->I(Lp1/c1;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    const/16 p2, 0xc

    if-lt p0, p2, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-static {p1, p0}, Lw80/b;->t(Lp1/c1;Ljava/lang/Boolean;)V

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lg2/i;Lu0/p0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$KeyboardActions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lg2/i;->a(Lg2/i;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lw80/b;->K(Lp1/c1;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p0, v0}, Lw80/b;->L(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lw80/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lw80/b;->m(Lw80/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lp1/c1;Ljava/lang/String;)V
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

.method private static final I(Lp1/c1;)Ljava/lang/String;
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

.method private static final J(Lp1/c1;Ljava/lang/String;)V
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

.method private static final K(Lp1/c1;)Z
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

.method private static final L(Lp1/c1;Z)V
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

.method public static final synthetic M(Lp1/c1;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Lw80/b;->o(Lp1/c1;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic N(Lp1/c1;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Lw80/b;->s(Lp1/c1;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lg2/i;Lu0/p0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lw80/b;->E(Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lw80/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lw80/b;->G(Lw80/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lw80/b;->A(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lw80/b;->C(Lkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lw80/b;->F(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lp1/c1;Lp1/c1;Lp1/c1;Lg2/v;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lw80/b;->y(Lp1/c1;Lp1/c1;Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lp1/c1;Lp1/c1;Lg2/v;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lw80/b;->D(Lp1/c1;Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h()Ll83/a0;
    .locals 1

    invoke-static {}, Lw80/b;->B()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lw80/b;->n(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lw80/b;->w(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lg2/i;Lu0/p0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lw80/b;->z(Lg2/i;Lu0/p0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lw80/b;->x(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lw80/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 74
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw80/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p2

    check-cast v11, Lp1/q;

    const v0, 0x265f6b8f

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    const/16 v5, 0x20

    if-eqz v4, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_2

    move-object/from16 v6, p1

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    move v7, v5

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit8 v7, v0, 0x13

    const/16 v8, 0x12

    const/4 v10, 0x0

    if-eq v7, v8, :cond_5

    const/4 v7, 0x1

    goto :goto_4

    :cond_5
    move v7, v10

    :goto_4
    and-int/lit8 v12, v0, 0x1

    invoke-virtual {v11, v12, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_45

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v7, :cond_6

    new-instance v4, Lw01/e;

    const/16 v6, 0x13

    invoke-direct {v4, v6}, Lw01/e;-><init>(I)V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_5

    :cond_7
    move-object v4, v6

    :goto_5
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    const-string v12, ""

    if-ne v6, v7, :cond_a

    invoke-virtual {v1}, Lw80/c;->i()Lf70/q0;

    move-result-object v6

    if-eqz v6, :cond_8

    invoke-virtual {v6}, Lf70/q0;->j()Ld70/c;

    move-result-object v6

    if-eqz v6, :cond_8

    invoke-virtual {v6}, Ld70/c;->a()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_9

    :cond_8
    move-object v6, v12

    :cond_9
    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v14, v6

    check-cast v14, Lp1/c1;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v7, :cond_d

    invoke-virtual {v1}, Lw80/c;->i()Lf70/q0;

    move-result-object v6

    if-eqz v6, :cond_c

    invoke-virtual {v6}, Lf70/q0;->s()Ld70/e;

    move-result-object v6

    if-eqz v6, :cond_c

    invoke-virtual {v6}, Ld70/e;->a()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_b

    goto :goto_6

    :cond_b
    move-object v12, v6

    :cond_c
    :goto_6
    invoke-static {v12}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v6, Lp1/c1;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v7, :cond_e

    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v12}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v12

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v12, Lp1/c1;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    const/4 v15, 0x0

    if-ne v13, v7, :cond_f

    invoke-static {v15}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v13

    invoke-virtual {v11, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v13, Lp1/c1;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v7, :cond_10

    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v8, Lp1/c1;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v7, :cond_11

    invoke-static {v15}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v2, Lp1/c1;

    invoke-static {v13}, Lw80/b;->o(Lp1/c1;)Ljava/lang/Boolean;

    move-result-object v3

    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-static {v2}, Lw80/b;->s(Lp1/c1;)Ljava/lang/Boolean;

    move-result-object v3

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    const/4 v3, 0x1

    goto :goto_7

    :cond_12
    move v3, v10

    :goto_7
    invoke-static {v11, v10}, Lk80/s;->h(Landroidx/compose/runtime/Composer;I)Lp1/t2;

    move-result-object v35

    sget-object v9, Lb3/v1;->i:Lp1/u2;

    invoke-virtual {v11, v9}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lg2/i;

    invoke-static {v13}, Lw80/b;->o(Lp1/c1;)Ljava/lang/Boolean;

    move-result-object v10

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v5, :cond_13

    const/16 v20, 0x1

    goto :goto_8

    :cond_13
    const/16 v20, 0x0

    :goto_8
    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v21

    or-int v20, v20, v21

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v20, :cond_14

    if-ne v5, v7, :cond_15

    :cond_14
    new-instance v5, Lw80/b$a;

    invoke-direct {v5, v4, v1, v13, v15}, Lw80/b$a;-><init>(Lkotlin/jvm/functions/Function1;Lw80/c;Lp1/c1;Lq83/d;)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v5, Lc93/m;

    invoke-static {v11, v5, v10}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2}, Lw80/b;->s(Lp1/c1;)Ljava/lang/Boolean;

    move-result-object v5

    const/16 v10, 0x20

    if-ne v0, v10, :cond_16

    const/4 v10, 0x1

    goto :goto_9

    :cond_16
    const/4 v10, 0x0

    :goto_9
    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    or-int v10, v10, v20

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v10, :cond_17

    if-ne v15, v7, :cond_18

    :cond_17
    new-instance v15, Lw80/b$b;

    const/4 v10, 0x0

    invoke-direct {v15, v4, v1, v2, v10}, Lw80/b$b;-><init>(Lkotlin/jvm/functions/Function1;Lw80/c;Lp1/c1;Lq83/d;)V

    invoke-virtual {v11, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v15, Lc93/m;

    invoke-static {v11, v15, v5}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    const/16 v10, 0x20

    if-ne v0, v10, :cond_19

    const/4 v10, 0x1

    goto :goto_a

    :cond_19
    const/4 v10, 0x0

    :goto_a
    invoke-virtual {v11, v3}, Lp1/q;->h(Z)Z

    move-result v15

    or-int/2addr v10, v15

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v10, :cond_1a

    if-ne v15, v7, :cond_1b

    :cond_1a
    new-instance v15, Lw80/b$c;

    const/4 v10, 0x0

    invoke-direct {v15, v4, v3, v10}, Lw80/b$c;-><init>(Lkotlin/jvm/functions/Function1;ZLq83/d;)V

    invoke-virtual {v11, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v15, Lc93/m;

    invoke-static {v11, v15, v5}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v15, Lb2/e;->w:Lb2/m;

    const/4 v3, 0x0

    invoke-static {v15, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v15

    move-object/from16 v19, v4

    iget-wide v3, v11, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v11, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v23, La3/l;->a:La3/k;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v23, v2

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v1, v11, Lp1/q;->S:Z

    if-eqz v1, :cond_1c

    invoke-virtual {v11, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_1c
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_b
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v11, v1, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->f:La3/i;

    invoke-static {v11, v15, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    move-object/from16 v24, v2

    iget-boolean v2, v11, Lp1/q;->S:Z

    if-nez v2, :cond_1d

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v25, v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1e

    goto :goto_c

    :cond_1d
    move-object/from16 v25, v5

    :goto_c
    invoke-static {v3, v11, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1e
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v11, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lw80/c;->i()Lf70/q0;

    move-result-object v3

    if-eqz v3, :cond_25

    invoke-virtual {v3}, Lf70/q0;->k()Z

    move-result v3

    const/4 v10, 0x1

    if-ne v3, v10, :cond_25

    invoke-virtual/range {p0 .. p0}, Lw80/c;->e()Z

    move-result v3

    if-eqz v3, :cond_25

    const v3, 0x5a1aab6b

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    new-instance v3, Lcom/whoop/design/util/TextResource$b;

    sget v10, Lx60/b;->m:I

    move-object/from16 p1, v2

    const/4 v2, 0x0

    const/4 v5, 0x2

    invoke-direct {v3, v10, v2, v5, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v10, v4

    new-instance v4, Lcom/whoop/design/util/TextResource$b;

    move-object/from16 v17, v3

    sget v3, Lx60/b;->l:I

    invoke-direct {v4, v3, v2, v5, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/whoop/design/util/TextResource$b;

    move-object/from16 v27, v4

    sget v4, Lx60/b;->b:I

    invoke-direct {v3, v4, v2, v5, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v4, 0x20

    if-ne v0, v4, :cond_1f

    const/4 v4, 0x1

    goto :goto_d

    :cond_1f
    const/4 v4, 0x0

    :goto_d
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v4, :cond_21

    if-ne v2, v7, :cond_20

    goto :goto_e

    :cond_20
    move-object/from16 v4, v19

    const/4 v5, 0x4

    goto :goto_f

    :cond_21
    :goto_e
    new-instance v2, Lw01/f;

    move-object/from16 v4, v19

    const/4 v5, 0x4

    invoke-direct {v2, v4, v5}, Lw01/f;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_f
    check-cast v2, Lc93/a;

    const/16 v5, 0x20

    if-ne v0, v5, :cond_22

    const/16 v21, 0x1

    goto :goto_10

    :cond_22
    const/16 v21, 0x0

    :goto_10
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v21, :cond_24

    if-ne v5, v7, :cond_23

    goto :goto_11

    :cond_23
    move-object/from16 v21, v2

    const/4 v2, 0x5

    goto :goto_12

    :cond_24
    :goto_11
    new-instance v5, Lw01/f;

    move-object/from16 v21, v2

    const/4 v2, 0x5

    invoke-direct {v5, v4, v2}, Lw01/f;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_12
    move-object/from16 v26, v5

    check-cast v26, Lc93/a;

    sget v5, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v30, v5, 0x3

    shl-int/lit8 v31, v5, 0x6

    or-int v30, v30, v31

    shl-int/lit8 v5, v5, 0x9

    or-int v31, v30, v5

    const/16 v33, 0x0

    const v34, 0xebfeff1

    move v5, v2

    const/4 v2, 0x0

    move-object/from16 v30, v6

    const/4 v6, 0x0

    move-object/from16 v32, v7

    const/4 v7, 0x0

    move-object/from16 v36, v8

    const/4 v8, 0x0

    move-object/from16 v37, v9

    const/4 v9, 0x0

    move-object/from16 v38, v10

    const/4 v10, 0x0

    move-object/from16 v39, v30

    move-object/from16 v30, v11

    const/4 v11, 0x0

    move-object/from16 v40, v12

    const/4 v12, 0x0

    move-object/from16 v41, v13

    const/4 v13, 0x0

    move-object/from16 v42, v14

    const/4 v14, 0x1

    move-object/from16 v43, v15

    const/4 v15, 0x0

    const/16 v44, 0x2

    const/16 v16, 0x0

    move/from16 v45, v5

    move-object v5, v3

    move-object/from16 v3, v17

    const/16 v17, 0x0

    const/16 v46, 0x1

    const/16 v18, 0x0

    const/16 v47, 0x4

    const/16 v19, 0x0

    const/high16 v48, 0x3f800000    # 1.0f

    const/16 v20, 0x0

    move-object/from16 v49, v24

    move-object/from16 v24, v21

    const/16 v21, 0x0

    const/16 v50, 0x0

    const/16 v22, 0x0

    move-object/from16 v51, v23

    const/16 v23, 0x0

    move-object/from16 v52, v25

    const/16 v25, 0x0

    move-object/from16 v53, v4

    move-object/from16 v4, v27

    const/16 v27, 0x0

    const/16 v54, 0x0

    const/16 v28, 0x0

    const/16 v55, 0x20

    const/16 v29, 0x0

    move-object/from16 v56, v32

    const/16 v32, 0x180

    move-object/from16 v65, p1

    move/from16 v57, v0

    move-object/from16 p1, v1

    move-object/from16 v59, v36

    move-object/from16 v61, v37

    move-object/from16 v64, v38

    move-object/from16 v58, v41

    move-object/from16 v63, v43

    move-object/from16 v62, v49

    move/from16 v0, v50

    move-object/from16 v60, v51

    move-object/from16 v1, v52

    move-object/from16 v66, v56

    const/16 v36, 0x12

    invoke-static/range {v2 .. v34}, Lj11/n;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLy81/e;Lg1/u0;Lf0/t;Lf0/t;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lj11/o;ZILjava/lang/Integer;Ll3/g;Ljava/lang/Integer;ZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v11, v30

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_13
    const/high16 v2, 0x3f800000    # 1.0f

    goto :goto_14

    :cond_25
    move/from16 v57, v0

    move-object/from16 p1, v1

    move-object/from16 v65, v2

    move-object/from16 v64, v4

    move-object/from16 v39, v6

    move-object/from16 v66, v7

    move-object/from16 v59, v8

    move-object/from16 v61, v9

    move-object/from16 v40, v12

    move-object/from16 v58, v13

    move-object/from16 v42, v14

    move-object/from16 v63, v15

    move-object/from16 v53, v19

    move-object/from16 v60, v23

    move-object/from16 v62, v24

    move-object/from16 v1, v25

    const/4 v0, 0x0

    const/16 v36, 0x12

    const/16 v54, 0x0

    const v2, 0x5a26e62d

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto :goto_13

    :goto_14
    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-wide/high16 v4, 0x4004000000000000L    # 2.5

    double-to-float v2, v4

    const/16 v4, 0x8

    int-to-float v9, v4

    mul-float v4, v2, v9

    const/4 v10, 0x4

    int-to-float v12, v10

    mul-float v7, v12, v9

    const/4 v8, 0x2

    const/4 v5, 0x0

    move v6, v4

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move/from16 v24, v7

    const/4 v3, 0x1

    invoke-static {v0, v11, v3}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v4

    const/16 v3, 0xe

    invoke-static {v2, v4, v3}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Ll0/m;->d:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    const/4 v5, 0x6

    invoke-static {v3, v4, v11, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v11, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v11, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v6, v11, Lp1/q;->S:Z

    if-eqz v6, :cond_26

    move-object/from16 v6, v62

    invoke-virtual {v11, v6}, Lp1/q;->l(Lc93/a;)V

    :goto_15
    move-object/from16 v6, p1

    goto :goto_16

    :cond_26
    invoke-virtual {v11}, Lp1/q;->s0()V

    goto :goto_15

    :goto_16
    invoke-static {v11, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v63

    invoke-static {v11, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v11, Lp1/q;->S:Z

    if-nez v3, :cond_27

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_28

    :cond_27
    move-object/from16 v3, v64

    goto :goto_18

    :cond_28
    :goto_17
    move-object/from16 v3, v65

    goto :goto_19

    :goto_18
    invoke-static {v4, v11, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_17

    :goto_19
    invoke-static {v11, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {v35 .. v35}, Lw80/b;->u(Lp1/t2;)Z

    move-result v2

    const/4 v8, 0x3

    if-nez v2, :cond_29

    const v2, -0x78b5212

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lw80/c;->h()Lkd1/o;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lw80/c;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lw80/c;->j()Ljava/lang/String;

    move-result-object v4

    sget v5, Lkd1/o;->a:I

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/2addr v6, v8

    or-int/2addr v6, v5

    const/4 v7, 0x0

    move-object v5, v11

    invoke-static/range {v2 .. v7}, Lk80/q;->b(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto :goto_1a

    :cond_29
    const v2, -0x7883410

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    const-wide/high16 v2, 0x400c000000000000L    # 3.5

    double-to-float v2, v2

    invoke-static {v2, v9, v1, v11, v0}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    :goto_1a
    int-to-float v2, v8

    mul-float/2addr v2, v9

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v11, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lw80/c;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static/range {v42 .. v42}, Lw80/b;->v(Lp1/c1;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    move-object/from16 v5, v66

    if-ne v2, v5, :cond_2a

    new-instance v2, Lbm2/x;

    move-object/from16 v14, v42

    move-object/from16 v13, v58

    move-object/from16 v15, v59

    const/4 v6, 0x5

    invoke-direct {v2, v14, v13, v15, v6}, Lbm2/x;-><init>(Lp1/c1;Lp1/c1;Lp1/c1;I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_1b

    :cond_2a
    move-object/from16 v14, v42

    move-object/from16 v13, v58

    move-object/from16 v15, v59

    const/4 v6, 0x5

    :goto_1b
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v2}, Landroidx/compose/ui/focus/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v13}, Lw80/b;->o(Lp1/c1;)Ljava/lang/Boolean;

    move-result-object v7

    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2c

    invoke-virtual/range {p0 .. p0}, Lw80/c;->i()Lf70/q0;

    move-result-object v7

    if-eqz v7, :cond_2b

    invoke-virtual {v7}, Lf70/q0;->k()Z

    move-result v7

    const/4 v6, 0x1

    if-ne v7, v6, :cond_2b

    goto :goto_1c

    :cond_2b
    move v6, v9

    move v9, v0

    goto :goto_1d

    :cond_2c
    :goto_1c
    move v6, v9

    const/4 v9, 0x1

    :goto_1d
    invoke-static {v13}, Lw80/b;->o(Lp1/c1;)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2d

    sget v7, Lx60/b;->k:I

    invoke-static {v7}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v7

    move/from16 v50, v0

    :goto_1e
    move-object/from16 v0, v61

    goto :goto_1f

    :cond_2d
    invoke-virtual/range {p0 .. p0}, Lw80/c;->i()Lf70/q0;

    move-result-object v7

    if-eqz v7, :cond_2e

    invoke-virtual {v7}, Lf70/q0;->k()Z

    move-result v7

    move/from16 v50, v0

    const/4 v0, 0x1

    if-ne v7, v0, :cond_2f

    sget v0, Lx60/b;->n:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v7

    goto :goto_1e

    :cond_2e
    move/from16 v50, v0

    :cond_2f
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    goto :goto_1e

    :goto_1f
    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v16, :cond_31

    if-ne v10, v5, :cond_30

    goto :goto_20

    :cond_30
    move-object/from16 p1, v2

    goto :goto_21

    :cond_31
    :goto_20
    new-instance v10, Lb30/l1;

    move-object/from16 p1, v2

    const/16 v2, 0x15

    invoke-direct {v10, v0, v2}, Lb30/l1;-><init>(Lg2/i;I)V

    invoke-virtual {v11, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_21
    move-object/from16 v28, v10

    check-cast v28, Lkotlin/jvm/functions/Function1;

    new-instance v27, Lu0/q0;

    move-object/from16 v29, v28

    move-object/from16 v30, v28

    move-object/from16 v31, v28

    move-object/from16 v32, v28

    move-object/from16 v33, v28

    invoke-direct/range {v27 .. v33}, Lu0/q0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v5, :cond_32

    new-instance v2, Lw70/a;

    const/4 v10, 0x4

    invoke-direct {v2, v10}, Lw70/a;-><init>(I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_32
    move-object/from16 v18, v2

    check-cast v18, Lc93/a;

    move/from16 v2, v57

    const/16 v10, 0x20

    if-ne v2, v10, :cond_33

    const/16 v16, 0x1

    goto :goto_22

    :cond_33
    move/from16 v16, v50

    :goto_22
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v16, :cond_34

    if-ne v10, v5, :cond_35

    :cond_34
    move v10, v12

    goto :goto_23

    :cond_35
    move/from16 v25, v12

    goto :goto_24

    :goto_23
    new-instance v12, Lry2/d;

    const/16 v17, 0x15

    move/from16 v25, v10

    move-object/from16 v16, v13

    move-object/from16 v13, v53

    invoke-direct/range {v12 .. v17}, Lry2/d;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v10, v12

    :goto_24
    move-object/from16 v19, v10

    check-cast v19, Lkotlin/jvm/functions/Function1;

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v12, v10, 0x3

    const v13, 0x30c00

    or-int/2addr v13, v12

    shl-int/lit8 v28, v10, 0x6

    or-int v13, v13, v28

    shl-int/lit8 v29, v10, 0x12

    or-int v10, v13, v29

    const v22, 0x36006

    const/16 v23, 0x1b10

    move-object/from16 v32, v5

    const/4 v5, 0x6

    move v13, v6

    const/4 v6, 0x0

    move-object v14, v8

    move-object v8, v7

    const/4 v7, 0x0

    move/from16 v21, v10

    const/16 v67, 0x20

    const/4 v10, 0x0

    move-object/from16 v30, v11

    const/4 v11, 0x0

    move v15, v12

    const-string v12, "EMAIL_INPUT"

    move/from16 v16, v13

    move-object/from16 v17, v14

    const-wide/16 v13, 0x0

    move/from16 v20, v15

    const/4 v15, 0x0

    move-object/from16 v31, v17

    const/16 v17, 0x6

    move-object/from16 v37, v0

    move/from16 v69, v2

    move/from16 v70, v16

    move/from16 v71, v20

    move-object/from16 v16, v27

    move-object/from16 v20, v30

    move-object/from16 v0, v32

    move-object/from16 v68, v53

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v23}, Lk80/b;->c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILq3/g0;Lqz0/c;Lcom/whoop/design/util/TextResource;ZZZLjava/lang/String;JLc93/m;Lu0/q0;ILc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v20

    const/4 v5, 0x2

    int-to-float v2, v5

    mul-float v2, v2, v25

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v11, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    const/16 v4, 0xc

    if-ne v3, v0, :cond_36

    new-instance v3, Lcom/whoop/design/util/TextResource$b;

    sget v5, Lx60/b;->Q:I

    new-instance v6, Lcom/whoop/design/util/TextResource$d$b;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-direct {v6, v7}, Lcom/whoop/design/util/TextResource$d$b;-><init>(Ljava/lang/Number;)V

    const/4 v10, 0x1

    new-array v7, v10, [Lcom/whoop/design/util/TextResource$d;

    aput-object v6, v7, v50

    invoke-direct {v3, v5, v7}, Lcom/whoop/design/util/TextResource$b;-><init>(I[Lcom/whoop/design/util/TextResource$d;)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_36
    check-cast v3, Lcom/whoop/design/util/TextResource$b;

    move-object v5, v3

    invoke-virtual/range {p0 .. p0}, Lw80/c;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static/range {v39 .. v39}, Lw80/b;->I(Lp1/c1;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static/range {v40 .. v40}, Lw80/b;->K(Lp1/c1;)Z

    move-result v7

    if-eqz v7, :cond_37

    new-instance v7, Lq3/s;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    goto :goto_25

    :cond_37
    sget-object v7, Lq3/f0;->w:Lg40/h2;

    :goto_25
    invoke-static/range {v39 .. v39}, Lw80/b;->I(Lp1/c1;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    if-lez v8, :cond_39

    invoke-static/range {v40 .. v40}, Lw80/b;->K(Lp1/c1;)Z

    move-result v8

    if-eqz v8, :cond_39

    const v8, 0x18893b90

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-virtual {v8}, Lx81/d;->d()Lgz0/o0;

    move-result-object v8

    invoke-virtual {v8}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v8

    invoke-virtual {v8}, Lgz0/k0;->Z()I

    move-result v13

    mul-float v12, v25, v25

    new-instance v14, Ly3/f;

    invoke-direct {v14, v12}, Ly3/f;-><init>(F)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v0, :cond_38

    sget-object v8, Lw80/b$d;->w:Lw80/b$d;

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_38
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v8}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v15

    new-instance v12, Lqz0/c$a;

    const/16 v16, 0x0

    const/16 v17, 0x8

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v18}, Lqz0/c$a;-><init>(ILy3/f;Ly81/e;Li2/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move/from16 v8, v50

    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    :goto_26
    move-object v15, v12

    goto :goto_27

    :cond_39
    invoke-static/range {v39 .. v39}, Lw80/b;->I(Lp1/c1;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    if-lez v8, :cond_3b

    invoke-static/range {v40 .. v40}, Lw80/b;->K(Lp1/c1;)Z

    move-result v8

    if-nez v8, :cond_3b

    const v8, 0x18895e34

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-virtual {v8}, Lx81/d;->d()Lgz0/o0;

    move-result-object v8

    invoke-virtual {v8}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v8

    invoke-virtual {v8}, Lgz0/k0;->f0()I

    move-result v13

    mul-float v12, v25, v25

    new-instance v14, Ly3/f;

    invoke-direct {v14, v12}, Ly3/f;-><init>(F)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v0, :cond_3a

    sget-object v8, Lw80/b$e;->w:Lw80/b$e;

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3a
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v8}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v15

    new-instance v12, Lqz0/c$a;

    const/16 v16, 0x0

    const/16 v17, 0x8

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v18}, Lqz0/c$a;-><init>(ILy3/f;Ly81/e;Li2/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v8, 0x0

    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    goto :goto_26

    :cond_3b
    const/4 v8, 0x0

    const v9, -0x75a306e

    invoke-virtual {v11, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    move-object/from16 v15, v54

    :goto_27
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v0, :cond_3c

    new-instance v8, Lam2/j;

    const/16 v9, 0xa

    move-object/from16 v10, v39

    move-object/from16 v12, v60

    invoke-direct {v8, v9, v10, v12}, Lam2/j;-><init>(ILp1/c1;Lp1/c1;)V

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_28

    :cond_3c
    move-object/from16 v10, v39

    move-object/from16 v12, v60

    :goto_28
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v8}, Landroidx/compose/ui/focus/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v12}, Lw80/b;->s(Lp1/c1;)Ljava/lang/Boolean;

    move-result-object v9

    move-object/from16 v14, v31

    invoke-static {v9, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    invoke-static {v12}, Lw80/b;->s(Lp1/c1;)Ljava/lang/Boolean;

    move-result-object v13

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_3d

    :goto_29
    move-object/from16 v13, v37

    goto :goto_2a

    :cond_3d
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    goto :goto_29

    :goto_2a
    invoke-virtual {v11, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v14, :cond_3e

    if-ne v4, v0, :cond_3f

    :cond_3e
    new-instance v4, Lb30/l1;

    const/16 v14, 0x14

    invoke-direct {v4, v13, v14}, Lb30/l1;-><init>(Lg2/i;I)V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3f
    move-object/from16 v17, v4

    check-cast v17, Lkotlin/jvm/functions/Function1;

    new-instance v16, Lu0/q0;

    move-object/from16 v18, v17

    move-object/from16 v19, v17

    move-object/from16 v20, v17

    move-object/from16 v21, v17

    move-object/from16 v22, v17

    invoke-direct/range {v16 .. v22}, Lu0/q0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_40

    new-instance v4, Luz1/g;

    move-object/from16 v13, v40

    const/16 v14, 0xc

    invoke-direct {v4, v14, v13}, Luz1/g;-><init>(ILp1/c1;)V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_40
    move-object/from16 v18, v4

    check-cast v18, Lc93/a;

    move/from16 v4, v69

    const/16 v13, 0x20

    if-ne v4, v13, :cond_41

    const/4 v4, 0x1

    goto :goto_2b

    :cond_41
    const/4 v4, 0x0

    :goto_2b
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v4, :cond_43

    if-ne v13, v0, :cond_42

    goto :goto_2c

    :cond_42
    move-object/from16 v0, v68

    goto :goto_2d

    :cond_43
    :goto_2c
    new-instance v13, Lb90/e;

    move-object/from16 v0, v68

    const/4 v4, 0x5

    invoke-direct {v13, v4, v0, v10, v12}, Lb90/e;-><init>(ILkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;)V

    invoke-virtual {v11, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_2d
    move-object/from16 v19, v13

    check-cast v19, Lkotlin/jvm/functions/Function1;

    move/from16 v4, v71

    or-int/lit16 v4, v4, 0xc00

    or-int v4, v4, v28

    sget v10, Lqz0/c$a;->f:I

    shl-int/lit8 v10, v10, 0xf

    or-int/2addr v4, v10

    or-int v21, v4, v29

    const v22, 0x36006

    const/16 v23, 0x1b00

    move v4, v2

    move-object v2, v8

    move-object v8, v5

    const/4 v5, 0x7

    const/4 v10, 0x0

    move-object/from16 v30, v11

    const/4 v11, 0x0

    const-string v12, "PASSWORD_INPUT"

    const-wide/16 v13, 0x0

    move/from16 v17, v4

    move-object v4, v6

    move-object v6, v7

    move-object v7, v15

    const/4 v15, 0x0

    move/from16 v20, v17

    const/16 v17, 0x7

    move-object/from16 v53, v0

    move/from16 v0, v20

    move-object/from16 v20, v30

    invoke-static/range {v2 .. v23}, Lk80/b;->c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILq3/g0;Lqz0/c;Lcom/whoop/design/util/TextResource;ZZZLjava/lang/String;JLc93/m;Lu0/q0;ILc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v20

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v11, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lw80/c;->k()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_44

    const v0, -0x7475a3c

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    const/4 v8, 0x0

    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    move-object v0, v1

    goto/16 :goto_2e

    :cond_44
    const v2, -0x7475a3b

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    const/16 v26, 0x0

    const/16 v27, 0xd

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v22, v1

    invoke-static/range {v22 .. v27}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v52, v22

    sget-object v2, Liz0/l;->a:Liz0/l;

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v11, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->b1()J

    move-result-wide v5

    invoke-virtual {v3, v11, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->b1()J

    move-result-wide v3

    new-instance v12, Ll3/v0;

    const-wide/16 v25, 0x0

    const v27, 0xff7fff

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x3

    invoke-direct/range {v12 .. v27}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    sget v7, Liz0/l;->b:I

    shl-int/lit8 v26, v7, 0xf

    const/16 v27, 0x7ff8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    move-wide/from16 v72, v5

    move-wide v6, v3

    move-wide/from16 v4, v72

    move-object/from16 v30, v11

    move-object v3, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 p1, v0

    move-object/from16 v24, v30

    move-object/from16 v0, v52

    invoke-virtual/range {v2 .. v27}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v5

    move-object/from16 v11, v24

    sget v2, Liz0/m;->p:I

    shl-int/lit8 v2, v2, 0x9

    or-int/lit8 v12, v2, 0x30

    const/16 v13, 0x1f4

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v2, p1

    move-object v3, v1

    invoke-static/range {v2 .. v13}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    const/4 v8, 0x0

    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    :goto_2e
    const/16 v1, 0xd

    int-to-float v1, v1

    move/from16 v13, v70

    const/4 v10, 0x1

    invoke-static {v1, v13, v0, v11, v10}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    invoke-virtual {v11, v10}, Lp1/q;->q(Z)V

    move-object/from16 v3, v53

    goto :goto_2f

    :cond_45
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v3, v6

    :goto_2f
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_46

    new-instance v0, Lt80/b;

    const/16 v5, 0x19

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lt80/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_46
    return-void
.end method

.method private static final n(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lp1/c1;)Ljava/lang/Boolean;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method private static final p(Lp1/c1;Ljava/lang/Boolean;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final q(Lp1/c1;)Z
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

.method private static final r(Lp1/c1;Z)V
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

.method private static final s(Lp1/c1;)Ljava/lang/Boolean;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method private static final t(Lp1/c1;Ljava/lang/Boolean;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/Boolean;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final u(Lp1/t2;)Z
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

.method private static final v(Lp1/c1;)Ljava/lang/String;
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

.method private static final w(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lj80/a$f;->a:Lj80/a$f;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 4

    sget-object v0, Lj80/a$f;->a:Lj80/a$f;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll80/o$g;

    sget-object v1, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->ENTER_YOUR_EMAIL:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3, v2}, Ll80/o$g;-><init>(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lp1/c1;Lp1/c1;Lp1/c1;Lg2/v;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lg2/w;

    invoke-virtual {p3}, Lg2/w;->a()Z

    move-result p3

    if-nez p3, :cond_0

    invoke-static {p0}, Lw80/b;->v(Lp1/c1;)Ljava/lang/String;

    move-result-object p3

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result p3

    if-lez p3, :cond_0

    sget-object p3, Lk80/n;->a:Lk80/n;

    invoke-static {p0}, Lw80/b;->v(Lp1/c1;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, p0}, Lk80/n;->a(Ljava/lang/String;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-static {p1, p0}, Lw80/b;->p(Lp1/c1;Ljava/lang/Boolean;)V

    const/4 p0, 0x1

    invoke-static {p2, p0}, Lw80/b;->r(Lp1/c1;Z)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lg2/i;Lu0/p0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$KeyboardActions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    check-cast p0, Lg2/l;

    invoke-virtual {p0, p1}, Lg2/l;->h(I)Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
