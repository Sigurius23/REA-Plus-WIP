.class public abstract Leg2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a_\u0010\u0010\u001a\u00020\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0014\u0008\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000e2\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a5\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\n2\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000e2\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018\u00b2\u0006\u000c\u0010\t\u001a\u00020\u00088\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Ldg2/a;",
        "viewModel",
        "Lkotlin/Function1;",
        "Lcg2/a;",
        "Ll83/a0;",
        "onNavigationEvent",
        "w",
        "(Ldg2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Ldg2/b;",
        "viewState",
        "Lcom/whoop/sms/setup/view/SmsSetupDestination;",
        "initialDestination",
        "Lbg2/h;",
        "onViewEvent",
        "Lkotlin/Function0;",
        "onSuccessComplete",
        "x",
        "(Ldg2/b;Lcom/whoop/sms/setup/view/SmsSetupDestination;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "currentDestination",
        "Lp1/c1;",
        "",
        "currentRoute",
        "W",
        "(Lcom/whoop/sms/setup/view/SmsSetupDestination;Lc93/a;Lp1/c1;)V",
        "sms_release"
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
.method private static final A(Ldg2/b;Lcom/whoop/sms/setup/view/SmsSetupDestination;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Leg2/i;->x(Ldg2/b;Lcom/whoop/sms/setup/view/SmsSetupDestination;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcg2/a$b;->a:Lcg2/a$b;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Ldg2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Leg2/i;->w(Ldg2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lbg2/h;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final F(Lcg2/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(ZLp1/c1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    if-eqz p0, :cond_0

    const-string p0, "INTRO"

    invoke-interface {p1, p0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-object p0, Lcg2/a$a;->a:Lcg2/a$a;

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcg2/a$c;->a:Lcg2/a$c;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lc0/q;)Lc0/l0;
    .locals 6

    const-string v0, "$this$AnimatedContent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lc0/x;

    invoke-virtual {p0}, Lc0/x;->b()Ljava/lang/Object;

    move-result-object p0

    const-string v0, "INTRO"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    const/4 v0, 0x6

    const/4 v1, 0x0

    const/16 v2, 0x12c

    const/4 v3, 0x0

    if-eqz p0, :cond_0

    invoke-static {v2, v1, v3, v0}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object p0

    new-instance v4, Le81/e;

    const/16 v5, 0xa

    invoke-direct {v4, v5}, Le81/e;-><init>(I)V

    invoke-static {p0, v4}, Lc0/w0;->m(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/d1;

    move-result-object p0

    invoke-static {v2, v1, v3, v0}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    new-instance v1, Le81/e;

    const/16 v2, 0xb

    invoke-direct {v1, v2}, Le81/e;-><init>(I)V

    invoke-static {v0, v1}, Lc0/w0;->q(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/f1;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/compose/animation/a;->c(Lc0/d1;Lc0/f1;)Lc0/l0;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {v2, v1, v3, v0}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object p0

    new-instance v4, Le81/e;

    const/16 v5, 0xc

    invoke-direct {v4, v5}, Le81/e;-><init>(I)V

    invoke-static {p0, v4}, Lc0/w0;->m(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/d1;

    move-result-object p0

    invoke-static {v2, v1, v3, v0}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    new-instance v1, Le81/e;

    const/16 v2, 0xd

    invoke-direct {v1, v2}, Le81/e;-><init>(I)V

    invoke-static {v0, v1}, Lc0/w0;->q(Ld0/c0;Lkotlin/jvm/functions/Function1;)Lc0/f1;

    move-result-object v0

    invoke-static {p0, v0}, Landroidx/compose/animation/a;->c(Lc0/d1;Lc0/f1;)Lc0/l0;

    move-result-object p0

    return-object p0
.end method

.method private static final J(I)I
    .locals 0

    neg-int p0, p0

    return p0
.end method

.method private static final K(I)I
    .locals 0

    return p0
.end method

.method private static final L(I)I
    .locals 0

    return p0
.end method

.method private static final M(I)I
    .locals 0

    neg-int p0, p0

    return p0
.end method

.method private static final N(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Ldg2/b;Lp1/c1;Lc0/o;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    move-object/from16 v2, p4

    move-object/from16 v3, p6

    const-string v4, "$this$AnimatedContent"

    move-object/from16 v5, p5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "route"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v4, p8, 0x70

    xor-int/lit8 v4, v4, 0x30

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/16 v7, 0x20

    if-le v4, v7, :cond_0

    move-object/from16 v4, p7

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    :cond_0
    and-int/lit8 v4, p8, 0x30

    if-ne v4, v7, :cond_2

    :cond_1
    move v4, v5

    goto :goto_0

    :cond_2
    move v4, v6

    :goto_0
    move-object/from16 v7, p7

    check-cast v7, Lp1/q;

    invoke-virtual {v7, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v4, v8

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-nez v4, :cond_3

    if-ne v8, v9, :cond_4

    :cond_3
    new-instance v8, Lar2/e;

    invoke-direct {v8, v3, v2, p0}, Lar2/e;-><init>(Ljava/lang/String;Lp1/c1;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v7, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v8, Lc93/a;

    invoke-static {v8, v6, v7, v6, v5}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result p0

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/4 v8, 0x6

    const/4 v10, 0x0

    sparse-switch p0, :sswitch_data_0

    :goto_1
    move-object p0, v7

    goto/16 :goto_2

    :sswitch_0
    const-string p0, "COMPLETED"

    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_5

    goto :goto_1

    :cond_5
    const p0, 0x4e7ae9e2

    invoke-virtual {v7, p0}, Lp1/q;->e0(I)V

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-virtual {p3}, Ldg2/b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_6

    if-ne v2, v9, :cond_7

    :cond_6
    new-instance v2, Lcom/whoop/profile/view/i;

    const/16 v1, 0x12

    invoke-direct {v2, p1, v1}, Lcom/whoop/profile/view/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lc93/a;

    const/4 p1, 0x6

    const/4 v1, 0x0

    move/from16 p4, p1

    move-object p1, v0

    move/from16 p5, v1

    move-object p2, v2

    move-object p3, v7

    invoke-static/range {p0 .. p5}, Lfg2/f;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object p0, p3

    invoke-virtual {p0, v6}, Lp1/q;->q(Z)V

    goto/16 :goto_3

    :sswitch_1
    move-object p0, v7

    const-string p1, "TERMS_OF_SERVICE"

    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto/16 :goto_2

    :cond_8
    const p1, 0x4e5d37bd    # 9.278544E8f

    invoke-virtual {p0, p1}, Lp1/q;->e0(I)V

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-static {p1, p0, v8, v6}, Leg2/n;->i(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p0, v6}, Lp1/q;->q(Z)V

    goto/16 :goto_3

    :sswitch_2
    move-object p0, v7

    const-string v1, "INTRO"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    goto/16 :goto_2

    :cond_9
    const v1, 0x4e5438a8    # 8.901207E8f

    invoke-virtual {p0, v1}, Lp1/q;->e0(I)V

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {p0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {p0, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_a

    if-ne v4, v9, :cond_b

    :cond_a
    new-instance v4, Ld30/r;

    const/4 v3, 0x5

    invoke-direct {v4, p1, p2, v2, v3}, Ld30/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object p1, v4

    check-cast p1, Lc93/a;

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_c

    new-instance v0, Lb01/m;

    const/16 v3, 0x18

    invoke-direct {v0, v3, v2}, Lb01/m;-><init>(ILp1/c1;)V

    invoke-virtual {p0, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v0, Lc93/a;

    const/16 v2, 0x186

    const/4 v3, 0x0

    move-object p3, p0

    move-object p2, v0

    move-object p0, v1

    move/from16 p4, v2

    move/from16 p5, v3

    invoke-static/range {p0 .. p5}, Lfg2/m;->g(Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object p0, p3

    invoke-virtual {p0, v6}, Lp1/q;->q(Z)V

    goto/16 :goto_3

    :sswitch_3
    move-object p0, v7

    const-string v7, "INPUT"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    goto/16 :goto_2

    :cond_d
    const v3, 0x4e6061db    # 9.4112736E8f

    invoke-virtual {p0, v3}, Lp1/q;->e0(I)V

    invoke-virtual {p3}, Ldg2/b;->g()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {p0, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {p0, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_e

    if-ne v8, v9, :cond_f

    :cond_e
    new-instance v8, Leg2/i$b;

    invoke-direct {v8, p3, p2, v2, v10}, Leg2/i$b;-><init>(Ldg2/b;Lc93/a;Lp1/c1;Lq83/d;)V

    invoke-virtual {p0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v8, Lc93/m;

    invoke-static {p0, v8, v3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {p3}, Ldg2/b;->l()Z

    move-result v2

    invoke-virtual {p3}, Ldg2/b;->j()Z

    move-result v1

    invoke-virtual {p0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_10

    if-ne v4, v9, :cond_11

    :cond_10
    new-instance v4, Ldk2/i;

    const/4 v3, 0x5

    invoke-direct {v4, p1, v3}, Ldk2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {p0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x6

    const/4 v3, 0x0

    move-object/from16 p4, p0

    move/from16 p5, p1

    move-object p0, v0

    move p2, v1

    move p1, v2

    move/from16 p6, v3

    move-object p3, v4

    invoke-static/range {p0 .. p6}, Lfg2/j;->g(Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 p0, p4

    invoke-virtual {p0, v6}, Lp1/q;->q(Z)V

    goto/16 :goto_3

    :sswitch_4
    move-object p0, v7

    const-string v7, "ENTER_CODE"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_12

    :goto_2
    const p1, 0x4e8063c9

    invoke-virtual {p0, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p0, v6}, Lp1/q;->q(Z)V

    goto/16 :goto_3

    :cond_12
    const v3, 0x4e6c3362    # 9.906976E8f

    invoke-virtual {p0, v3}, Lp1/q;->e0(I)V

    invoke-virtual {p3}, Ldg2/b;->c()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {p0, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {p0, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v7, v11

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v7, :cond_13

    if-ne v11, v9, :cond_14

    :cond_13
    new-instance v11, Leg2/i$c;

    invoke-direct {v11, p3, p2, v2, v10}, Leg2/i$c;-><init>(Ldg2/b;Lc93/a;Lp1/c1;Lq83/d;)V

    invoke-virtual {p0, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v11, Lc93/m;

    invoke-static {p0, v11, v3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {p3}, Ldg2/b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p3}, Ldg2/b;->h()Z

    move-result v3

    invoke-virtual {p3}, Ldg2/b;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {p0, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v5, v7

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_15

    if-ne v7, v9, :cond_16

    :cond_15
    new-instance v7, Leg2/f;

    invoke-direct {v7, p1, p3}, Leg2/f;-><init>(Lkotlin/jvm/functions/Function1;Ldg2/b;)V

    invoke-virtual {p0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v7, Lc93/a;

    invoke-virtual {p0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_17

    if-ne v5, v9, :cond_18

    :cond_17
    new-instance v5, Ldk2/i;

    const/4 v1, 0x6

    invoke-direct {v5, p1, v1}, Ldk2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {p0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v5, Lkotlin/jvm/functions/Function1;

    sget p1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 p1, p1, 0x9

    or-int/2addr p1, v8

    const/4 v1, 0x0

    move-object/from16 p6, p0

    move/from16 p7, p1

    move-object p0, v0

    move/from16 p8, v1

    move-object p1, v2

    move p2, v3

    move-object p3, v4

    move-object/from16 p5, v5

    move-object/from16 p4, v7

    invoke-static/range {p0 .. p8}, Lfg2/h;->i(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 p0, p6

    invoke-virtual {p0, v6}, Lp1/q;->q(Z)V

    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x12223cec -> :sswitch_4
        0x4295faa -> :sswitch_3
        0x4296e4c -> :sswitch_2
        0x2cea2a05 -> :sswitch_1
        0x5279062b -> :sswitch_0
    .end sparse-switch
.end method

.method private static final O(Ljava/lang/String;Lp1/c1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    const-string v0, "TERMS_OF_SERVICE"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const-string p0, "INTRO"

    invoke-interface {p1, p0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-object p0, Lcg2/a$a;->a:Lcg2/a$a;

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;)Ll83/a0;
    .locals 1

    sget-object v0, Lbg2/h$c;->a:Lbg2/h$c;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lcom/whoop/sms/setup/view/SmsSetupDestination;->INTRO:Lcom/whoop/sms/setup/view/SmsSetupDestination;

    invoke-static {p0, p1, p2}, Leg2/i;->W(Lcom/whoop/sms/setup/view/SmsSetupDestination;Lc93/a;Lp1/c1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Q(Lp1/c1;)Ll83/a0;
    .locals 1

    const-string v0, "TERMS_OF_SERVICE"

    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final R(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 2

    const-string v0, "phoneNumber"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbg2/h$d;

    const-string v1, "+1"

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lbg2/h$d;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final S(Lkotlin/jvm/functions/Function1;Ldg2/b;)Ll83/a0;
    .locals 1

    new-instance v0, Lbg2/h$d;

    invoke-virtual {p1}, Ldg2/b;->f()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lbg2/h$d;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final T(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "code"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbg2/h$a;

    invoke-direct {v0, p1}, Lbg2/h$a;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final U(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lbg2/h$f;->a:Lbg2/h$f;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic V(Lcom/whoop/sms/setup/view/SmsSetupDestination;Lc93/a;Lp1/c1;)V
    .locals 0

    invoke-static {p0, p1, p2}, Leg2/i;->W(Lcom/whoop/sms/setup/view/SmsSetupDestination;Lc93/a;Lp1/c1;)V

    return-void
.end method

.method private static final W(Lcom/whoop/sms/setup/view/SmsSetupDestination;Lc93/a;Lp1/c1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/sms/setup/view/SmsSetupDestination;",
            "Lc93/a;",
            "Lp1/c1;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/whoop/sms/setup/view/SmsSetupDestination;->getNextStep()Lcom/whoop/sms/setup/view/SmsSetupDestination;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p2, p0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Leg2/i;->H(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p2, p1, p0}, Leg2/i;->G(ZLp1/c1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Leg2/i;->E()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Ldg2/b;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Leg2/i;->S(Lkotlin/jvm/functions/Function1;Ldg2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(I)I
    .locals 0

    invoke-static {p0}, Leg2/i;->M(I)I

    move-result p0

    return p0
.end method

.method public static synthetic f(I)I
    .locals 0

    invoke-static {p0}, Leg2/i;->K(I)I

    move-result p0

    return p0
.end method

.method public static synthetic g(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Leg2/i;->Q(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Leg2/i;->P(Lkotlin/jvm/functions/Function1;Lc93/a;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ldg2/b;Lcom/whoop/sms/setup/view/SmsSetupDestination;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Leg2/i;->A(Ldg2/b;Lcom/whoop/sms/setup/view/SmsSetupDestination;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Leg2/i;->B(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lbg2/h;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Leg2/i;->D(Lbg2/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Leg2/i;->R(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lc0/q;)Lc0/l0;
    .locals 0

    invoke-static {p0}, Leg2/i;->I(Lc0/q;)Lc0/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p2, p1}, Leg2/i;->O(Ljava/lang/String;Lp1/c1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Ldg2/b;Lp1/c1;Lc0/o;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Leg2/i;->N(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Ldg2/b;Lp1/c1;Lc0/o;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Leg2/i;->T(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lcg2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Leg2/i;->F(Lcg2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(I)I
    .locals 0

    invoke-static {p0}, Leg2/i;->J(I)I

    move-result p0

    return p0
.end method

.method public static synthetic s(Ldg2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Leg2/i;->C(Ldg2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lcg2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Leg2/i;->y(Lcg2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(I)I
    .locals 0

    invoke-static {p0}, Leg2/i;->L(I)I

    move-result p0

    return p0
.end method

.method public static synthetic v(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Leg2/i;->U(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final w(Ldg2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldg2/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewModel"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    const v0, 0x709fef58

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
    and-int/lit8 v2, p4, 0x2

    const/16 v8, 0x20

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v3, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-virtual {v5, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    move v4, v8

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :goto_3
    and-int/lit8 v4, v0, 0x13

    const/16 v6, 0x12

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v4, v6, :cond_5

    move v4, v10

    goto :goto_4

    :cond_5
    move v4, v9

    :goto_4
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v5, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_d

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_7

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v11, :cond_6

    new-instance v2, Le81/e;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Le81/e;-><init>(I)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v12, v2

    goto :goto_5

    :cond_7
    move-object v12, v3

    :goto_5
    invoke-virtual {v1}, Ldg2/a;->o()Lec3/t1;

    move-result-object v2

    new-instance v13, Ldg2/b;

    const/16 v28, 0x3fff

    const/16 v29, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v13 .. v29}, Ldg2/b;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZZLcom/whoop/design/util/TextResource;Ljava/lang/String;ZZLjava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v14, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v6, v14, 0x3

    const/4 v7, 0x2

    const/4 v4, 0x0

    move-object v3, v13

    invoke-static/range {v2 .. v7}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v2

    invoke-static {v2}, Leg2/i;->z(Lp1/t2;)Ldg2/b;

    move-result-object v2

    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_8

    if-ne v4, v11, :cond_9

    :cond_8
    new-instance v4, Leg2/i$a;

    invoke-direct {v4, v1}, Leg2/i$a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v4, Lj93/g;

    check-cast v4, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v3, v0, 0x70

    if-ne v3, v8, :cond_a

    move v9, v10

    :cond_a
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v9, :cond_b

    if-ne v3, v11, :cond_c

    :cond_b
    new-instance v3, Lcom/whoop/profile/view/i;

    const/16 v6, 0x11

    invoke-direct {v3, v12, v6}, Lcom/whoop/profile/view/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v3, Lc93/a;

    shl-int/lit8 v0, v0, 0x9

    const v6, 0xe000

    and-int/2addr v0, v6

    or-int v8, v14, v0

    const/4 v9, 0x2

    move-object v7, v5

    move-object v5, v3

    const/4 v3, 0x0

    move-object v6, v12

    invoke-static/range {v2 .. v9}, Leg2/i;->x(Ldg2/b;Lcom/whoop/sms/setup/view/SmsSetupDestination;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v7

    move-object v2, v6

    goto :goto_6

    :cond_d
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v2, v3

    :goto_6
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Leg2/g;

    const/4 v5, 0x0

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Leg2/g;-><init>(Ldg2/a;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method public static final x(Ldg2/b;Lcom/whoop/sms/setup/view/SmsSetupDestination;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 40
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldg2/b;",
            "Lcom/whoop/sms/setup/view/SmsSetupDestination;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v6, p6

    move-object/from16 v13, p5

    check-cast v13, Lp1/q;

    const v1, -0x670a2347

    invoke-virtual {v13, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v6, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_2

    and-int/lit8 v1, p7, 0x1

    if-nez v1, :cond_1

    and-int/lit8 v1, v6, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    or-int/2addr v1, v6

    goto :goto_2

    :cond_2
    move v1, v6

    :goto_2
    and-int/lit8 v3, p7, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v1, v1, 0x30

    goto :goto_5

    :cond_3
    and-int/lit8 v4, v6, 0x30

    if-nez v4, :cond_6

    if-nez p1, :cond_4

    const/4 v4, -0x1

    goto :goto_3

    :cond_4
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    :goto_3
    invoke-virtual {v13, v4}, Lp1/q;->e(I)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x20

    goto :goto_4

    :cond_5
    const/16 v4, 0x10

    :goto_4
    or-int/2addr v1, v4

    :cond_6
    :goto_5
    and-int/lit8 v4, p7, 0x4

    if-eqz v4, :cond_8

    or-int/lit16 v1, v1, 0x180

    :cond_7
    move-object/from16 v5, p2

    goto :goto_7

    :cond_8
    and-int/lit16 v5, v6, 0x180

    if-nez v5, :cond_7

    move-object/from16 v5, p2

    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    const/16 v7, 0x100

    goto :goto_6

    :cond_9
    const/16 v7, 0x80

    :goto_6
    or-int/2addr v1, v7

    :goto_7
    and-int/lit8 v7, p7, 0x8

    if-eqz v7, :cond_b

    or-int/lit16 v1, v1, 0xc00

    :cond_a
    move-object/from16 v8, p3

    goto :goto_9

    :cond_b
    and-int/lit16 v8, v6, 0xc00

    if-nez v8, :cond_a

    move-object/from16 v8, p3

    invoke-virtual {v13, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_c

    const/16 v9, 0x800

    goto :goto_8

    :cond_c
    const/16 v9, 0x400

    :goto_8
    or-int/2addr v1, v9

    :goto_9
    and-int/lit8 v9, p7, 0x10

    if-eqz v9, :cond_e

    or-int/lit16 v1, v1, 0x6000

    :cond_d
    move-object/from16 v11, p4

    goto :goto_b

    :cond_e
    and-int/lit16 v11, v6, 0x6000

    if-nez v11, :cond_d

    move-object/from16 v11, p4

    invoke-virtual {v13, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_f

    const/16 v12, 0x4000

    goto :goto_a

    :cond_f
    const/16 v12, 0x2000

    :goto_a
    or-int/2addr v1, v12

    :goto_b
    and-int/lit16 v12, v1, 0x2493

    const/16 v14, 0x2492

    move/from16 p5, v9

    if-eq v12, v14, :cond_10

    const/4 v12, 0x1

    goto :goto_c

    :cond_10
    const/4 v12, 0x0

    :goto_c
    and-int/lit8 v14, v1, 0x1

    invoke-virtual {v13, v14, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_29

    invoke-virtual {v13}, Lp1/q;->Z()V

    and-int/lit8 v12, v6, 0x1

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-eqz v12, :cond_13

    invoke-virtual {v13}, Lp1/q;->C()Z

    move-result v12

    if-eqz v12, :cond_11

    goto :goto_d

    :cond_11
    invoke-virtual {v13}, Lp1/q;->X()V

    and-int/lit8 v3, p7, 0x1

    if-eqz v3, :cond_12

    and-int/lit8 v1, v1, -0xf

    :cond_12
    move-object/from16 v21, v0

    move-object/from16 v19, v5

    move-object/from16 v20, v8

    move-object v4, v11

    move-object/from16 v0, p1

    goto/16 :goto_12

    :cond_13
    :goto_d
    and-int/lit8 v12, p7, 0x1

    if-eqz v12, :cond_14

    new-instance v16, Ldg2/b;

    const/16 v31, 0x3fff

    const/16 v32, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v16 .. v32}, Ldg2/b;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZZLcom/whoop/design/util/TextResource;Ljava/lang/String;ZZLjava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v1, v1, -0xf

    goto :goto_e

    :cond_14
    move-object/from16 v16, v0

    :goto_e
    if-eqz v3, :cond_15

    sget-object v0, Lcom/whoop/sms/setup/view/SmsSetupDestination;->INTRO:Lcom/whoop/sms/setup/view/SmsSetupDestination;

    goto :goto_f

    :cond_15
    move-object/from16 v0, p1

    :goto_f
    if-eqz v4, :cond_17

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v14, :cond_16

    new-instance v3, Le81/e;

    const/16 v4, 0xe

    invoke-direct {v3, v4}, Le81/e;-><init>(I)V

    invoke-virtual {v13, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_10

    :cond_17
    move-object v3, v5

    :goto_10
    if-eqz v7, :cond_19

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v14, :cond_18

    new-instance v4, Leb1/a;

    const/16 v5, 0x18

    invoke-direct {v4, v5}, Leb1/a;-><init>(I)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v4, Lc93/a;

    move-object v8, v4

    :cond_19
    if-eqz p5, :cond_1b

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v14, :cond_1a

    new-instance v4, Le81/e;

    const/16 v5, 0xf

    invoke-direct {v4, v5}, Le81/e;-><init>(I)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object/from16 v19, v3

    move-object/from16 v20, v8

    :goto_11
    move-object/from16 v21, v16

    goto :goto_12

    :cond_1b
    move-object/from16 v19, v3

    move-object/from16 v20, v8

    move-object v4, v11

    goto :goto_11

    :goto_12
    invoke-virtual {v13}, Lp1/q;->r()V

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v14, :cond_1c

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v13, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v3, Lp1/c1;

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    const-string v7, "TERMS_OF_SERVICE"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1d

    new-instance v7, Ly71/g;

    sget-object v8, Lgz0/m0;->CARET_BACKWARD:Lgz0/m0;

    invoke-virtual {v8}, Lgz0/m0;->toWhoopIcon()I

    move-result v8

    sget v11, Lgy0/f;->E:I

    invoke-static {v11}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v11

    invoke-direct {v7, v8, v11}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    :goto_13
    move-object/from16 v25, v7

    goto :goto_14

    :cond_1d
    new-instance v7, Ly71/g;

    sget-object v8, Lgz0/m0;->CROSS:Lgz0/m0;

    invoke-virtual {v8}, Lgz0/m0;->toWhoopIcon()I

    move-result v8

    sget v11, Lgy0/f;->K:I

    invoke-static {v11}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v11

    invoke-direct {v7, v8, v11}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;)V

    goto :goto_13

    :goto_14
    sget-object v7, Lb2/t;->w:Lb2/t;

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7}, Ll0/f;->i(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v11, Lb2/e;->N:Lb2/k;

    const/16 v12, 0x36

    invoke-static {v8, v11, v13, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v9, v13, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v13, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v15, v13, Lp1/q;->S:Z

    if-eqz v15, :cond_1e

    invoke-virtual {v13, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_1e
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_15
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v13, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v13, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-nez v10, :cond_1f

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_20

    :cond_1f
    invoke-static {v9, v13, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_20
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v13, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v7, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    invoke-direct {v7, v11}, Landroidx/compose/foundation/layout/HorizontalAlignElement;-><init>(Lb2/f;)V

    new-instance v8, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    if-eqz v5, :cond_21

    sget v9, Lvf2/b;->D:I

    invoke-static {v9}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v9

    :goto_16
    move-object/from16 v23, v9

    goto :goto_17

    :cond_21
    sget v9, Lvf2/b;->Y:I

    invoke-static {v9}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v9

    goto :goto_16

    :goto_17
    new-instance v9, Ly71/g;

    sget-object v10, Lx81/d;->a:Lx81/d;

    invoke-virtual {v10}, Lx81/d;->d()Lgz0/o0;

    move-result-object v10

    invoke-virtual {v10}, Lgz0/o0;->e()Lgz0/o;

    move-result-object v10

    invoke-virtual {v10}, Lgz0/o;->r()I

    move-result v10

    const/4 v11, 0x0

    invoke-direct {v9, v10, v11, v2, v11}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v38, 0x7ff2

    const/16 v39, 0x0

    const/16 v24, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    move-object/from16 v22, v8

    move-object/from16 v26, v9

    invoke-direct/range {v22 .. v39}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ly71/g;Ly71/g;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v13, v5}, Lp1/q;->h(Z)Z

    move-result v2

    const v9, 0xe000

    and-int/2addr v1, v9

    const/16 v9, 0x4000

    if-ne v1, v9, :cond_22

    const/4 v9, 0x1

    goto :goto_18

    :cond_22
    const/4 v9, 0x0

    :goto_18
    or-int/2addr v2, v9

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v2, :cond_23

    if-ne v9, v14, :cond_24

    :cond_23
    new-instance v9, Lbm2/d0;

    invoke-direct {v9, v4, v3, v5}, Lbm2/d0;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;Z)V

    invoke-virtual {v13, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    move-object v10, v9

    check-cast v10, Lc93/a;

    const/16 v9, 0x4000

    if-ne v1, v9, :cond_25

    const/4 v15, 0x1

    goto :goto_19

    :cond_25
    const/4 v15, 0x0

    :goto_19
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v15, :cond_26

    if-ne v1, v14, :cond_27

    :cond_26
    new-instance v1, Lcom/whoop/profile/view/i;

    const/16 v2, 0x13

    invoke-direct {v1, v4, v2}, Lcom/whoop/profile/view/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    move-object v11, v1

    check-cast v11, Lc93/a;

    sget v1, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v1, v1, 0x3

    const/16 v15, 0x24

    const/4 v9, 0x0

    const/4 v12, 0x0

    move-object v2, v14

    move v14, v1

    move-object v1, v2

    const/4 v2, 0x1

    invoke-static/range {v7 .. v15}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_28

    new-instance v5, Le81/e;

    const/16 v1, 0x10

    invoke-direct {v5, v1}, Le81/e;-><init>(I)V

    invoke-virtual {v13, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_28
    move-object v9, v5

    check-cast v9, Lkotlin/jvm/functions/Function1;

    new-instance v17, Leg2/h;

    const/16 v23, 0x0

    move-object/from16 v22, v3

    move-object/from16 v18, v4

    invoke-direct/range {v17 .. v23}, Leg2/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v1, v17

    const v3, -0x1d3e5a7

    invoke-static {v3, v13, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const v15, 0x186180

    const/16 v16, 0x2a

    const/4 v8, 0x0

    const/4 v10, 0x0

    const-string v11, "SmsSetupNavigation"

    const/4 v12, 0x0

    move-object v14, v13

    move-object v13, v1

    invoke-static/range {v7 .. v16}, Landroidx/compose/animation/a;->b(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lb2/h;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/n;Landroidx/compose/runtime/Composer;II)V

    move-object v13, v14

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    move-object v2, v0

    move-object/from16 v5, v18

    move-object/from16 v3, v19

    move-object/from16 v4, v20

    move-object/from16 v1, v21

    goto :goto_1a

    :cond_29
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object/from16 v2, p1

    move-object v1, v0

    move-object v3, v5

    move-object v4, v8

    move-object v5, v11

    :goto_1a
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_2a

    new-instance v0, La01/f;

    const/16 v8, 0x13

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, La01/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_2a
    return-void
.end method

.method private static final y(Lcg2/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lp1/t2;)Ldg2/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Ldg2/b;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldg2/b;

    return-object p0
.end method
