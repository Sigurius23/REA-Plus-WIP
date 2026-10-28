.class public abstract Leo0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001aS\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00062\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001aO\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00062\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\u000b\u001a+\u0010\u000f\u001a\u00020\u00042\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00062\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0006H\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0013\u00b2\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lbo0/c;",
        "viewState",
        "Lkotlin/Function1;",
        "Lbo0/a;",
        "Ll83/a0;",
        "onViewEvent",
        "Lkotlin/Function0;",
        "onBackPressed",
        "Ltn0/a;",
        "onAnalyticsEvent",
        "M",
        "(Lbo0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "z",
        "onConfirmExit",
        "onDismiss",
        "x",
        "(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "",
        "hidePassword",
        "change-password_release"
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
.method private static final A(Ltn0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lp1/c1;)Z
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

.method private static final C(Lp1/c1;Z)V
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

.method private static final D(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lbo0/a$a;->a:Lbo0/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Leo0/g;->B(Lp1/c1;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p0, v0}, Leo0/g;->C(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "newPassword"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lbo0/a$g;

    invoke-direct {v0, p1}, Lbo0/a$g;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(I)I
    .locals 0

    div-int/lit8 p0, p0, 0x4

    return p0
.end method

.method private static final H(I)I
    .locals 0

    div-int/lit8 p0, p0, 0x4

    return p0
.end method

.method private static final I(Lbo0/c;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 31

    move-object/from16 v0, p1

    move-object/from16 v3, p3

    const-string v1, "$this$AnimatedVisibility"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ll0/m;->c:Ll0/g;

    sget-object v2, Lb2/e;->M:Lb2/k;

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    move-object v6, v3

    check-cast v6, Lp1/q;

    iget-wide v4, v6, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    iget-object v9, v6, Lp1/q;->a:Lhb3/a0;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v9, v6, Lp1/q;->S:Z

    if-eqz v9, :cond_0

    invoke-virtual {v6, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_0
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v3, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v3, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v4, v6, Lp1/q;->S:Z

    if-nez v4, :cond_1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    :cond_1
    invoke-static {v2, v6, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v3, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v1, Lc41/p2;

    sget-object v9, Lgz0/m0;->TINY_ATTENTION:Lgz0/m0;

    invoke-virtual/range {p0 .. p0}, Lbo0/c;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-nez v2, :cond_3

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    :cond_3
    move-object v13, v2

    sget-object v15, Ly81/f;->ACCENT_NEGATIVE_TREND_15:Ly81/f;

    sget-object v17, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    const v29, 0xfdeae

    const/16 v30, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x1

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object v8, v1

    invoke-direct/range {v8 .. v30}, Lc41/p2;-><init>(Lgz0/m0;FLc41/n2;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Lrz0/f;Ly81/e;ZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Lc41/o2;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v6, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_4

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v4, v2, :cond_5

    :cond_4
    new-instance v4, Ldk2/i;

    const/16 v2, 0xa

    invoke-direct {v4, v0, v2}, Ldk2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v6, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v2, v4

    check-cast v2, Lkotlin/jvm/functions/Function1;

    sget v0, Lc41/p2;->v:I

    shl-int/lit8 v0, v0, 0x3

    or-int/lit8 v4, v0, 0x6

    move-object v0, v5

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Lc41/r2;->f(Landroidx/compose/ui/Modifier;Lc41/p2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x2

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v3, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final J(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lbo0/a$c;->a:Lbo0/a$c;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lbo0/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lbo0/c;->i()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lbo0/c;->j()Z

    move-result p0

    if-nez p0, :cond_0

    sget-object p0, Ltn0/a$c;->a:Ltn0/a$c;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lbo0/a$h;->a:Lbo0/a$h;

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lbo0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Leo0/g;->z(Lbo0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final M(Lbo0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbo0/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v7, p5

    sget-object v1, Lb2/e;->E:Lb2/m;

    const-string v2, "viewState"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p4

    check-cast v4, Lp1/q;

    const v2, -0x1d1a9d3b

    invoke-virtual {v4, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v7, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v7

    goto :goto_1

    :cond_1
    move v2, v7

    :goto_1
    and-int/lit8 v5, p6, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move-object/from16 v8, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v7, 0x30

    if-nez v8, :cond_2

    move-object/from16 v8, p1

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_4
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v2, v9

    :goto_3
    and-int/lit8 v9, p6, 0x4

    if-eqz v9, :cond_6

    or-int/lit16 v2, v2, 0x180

    :cond_5
    move-object/from16 v10, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v10, v7, 0x180

    if-nez v10, :cond_5

    move-object/from16 v10, p2

    invoke-virtual {v4, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x100

    goto :goto_4

    :cond_7
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v2, v11

    :goto_5
    and-int/lit8 v11, p6, 0x8

    const/16 v12, 0x800

    if-eqz v11, :cond_9

    or-int/lit16 v2, v2, 0xc00

    :cond_8
    move-object/from16 v13, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v13, v7, 0xc00

    if-nez v13, :cond_8

    move-object/from16 v13, p3

    invoke-virtual {v4, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    move v14, v12

    goto :goto_6

    :cond_a
    const/16 v14, 0x400

    :goto_6
    or-int/2addr v2, v14

    :goto_7
    and-int/lit16 v14, v2, 0x493

    const/16 v15, 0x492

    const/4 v6, 0x0

    if-eq v14, v15, :cond_b

    const/4 v14, 0x1

    goto :goto_8

    :cond_b
    move v14, v6

    :goto_8
    and-int/lit8 v15, v2, 0x1

    invoke-virtual {v4, v15, v14}, Lp1/q;->U(IZ)Z

    move-result v14

    if-eqz v14, :cond_35

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_d

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v14, :cond_c

    new-instance v5, Lej1/n;

    const/16 v8, 0xf

    invoke-direct {v5, v8}, Lej1/n;-><init>(I)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_9

    :cond_d
    move-object v5, v8

    :goto_9
    if-eqz v9, :cond_f

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v14, :cond_e

    new-instance v8, Lej1/a;

    const/4 v9, 0x5

    invoke-direct {v8, v9}, Lej1/a;-><init>(I)V

    invoke-virtual {v4, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v8, Lc93/a;

    move-object/from16 v25, v8

    goto :goto_a

    :cond_f
    move-object/from16 v25, v10

    :goto_a
    if-eqz v11, :cond_11

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v14, :cond_10

    new-instance v8, Lej1/n;

    const/16 v9, 0x13

    invoke-direct {v8, v9}, Lej1/n;-><init>(I)V

    invoke-virtual {v4, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v8, Lkotlin/jvm/functions/Function1;

    goto :goto_b

    :cond_11
    move-object v8, v13

    :goto_b
    and-int/lit16 v9, v2, 0x1c00

    if-ne v9, v12, :cond_12

    const/4 v9, 0x1

    goto :goto_c

    :cond_12
    move v9, v6

    :goto_c
    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    const/4 v11, 0x0

    if-nez v9, :cond_13

    if-ne v10, v14, :cond_14

    :cond_13
    new-instance v10, Leo0/g$a;

    invoke-direct {v10, v8, v11}, Leo0/g$a;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v4, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v10, Lc93/m;

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    invoke-static {v4, v10, v9}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v9, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v13, Lb2/e;->w:Lb2/m;

    invoke-static {v13, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    iget-wide v6, v4, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v4, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v3, v4, Lp1/q;->S:Z

    if-eqz v3, :cond_15

    invoke-virtual {v4, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_15
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_d
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v4, v3, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v4, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-nez v11, :cond_16

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v11, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_17

    :cond_16
    invoke-static {v6, v4, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v4, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lbo0/c;->j()Z

    move-result v9

    const/4 v11, 0x0

    const/4 v12, 0x6

    if-eqz v9, :cond_1c

    const v9, -0x2d121003

    invoke-virtual {v4, v9}, Lp1/q;->e0(I)V

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {}, Lgb1/b0;->U()Li2/t;

    move-result-object v10

    const/4 v0, 0x0

    invoke-static {v9, v10, v0, v11, v12}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v0, 0x0

    invoke-static {v1, v0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v10, v4, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v4, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-eqz v11, :cond_18

    invoke-virtual {v4, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_18
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v4, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v13, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v4, Lp1/q;->S:Z

    if-nez v1, :cond_19

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    :cond_19
    invoke-static {v0, v4, v0, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    invoke-static {v4, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v17, Lsz0/p0$h;

    const/16 v22, 0x7

    const/16 v23, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v17 .. v23}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lsn0/b;->q:I

    const/4 v1, 0x2

    const/4 v3, 0x0

    invoke-direct {v9, v0, v3, v1, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v14, :cond_1b

    new-instance v0, Lej1/a;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lej1/a;-><init>(I)V

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    move-object v10, v0

    check-cast v10, Lc93/a;

    sget v0, Lsz0/p0$h;->h:I

    or-int/lit16 v0, v0, 0x180

    sget v1, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v1, v1, 0x3

    or-int v21, v0, v1

    const/16 v22, 0x0

    const/16 v23, 0xff8

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v0, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v3, v8

    move-object/from16 v8, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v20, v4

    move-object v4, v0

    move-object v0, v3

    invoke-static/range {v8 .. v23}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v20

    const/4 v1, 0x1

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    const/4 v1, 0x0

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    move v11, v1

    move-object v10, v4

    move-object v1, v5

    move-object v4, v8

    :goto_f
    const/4 v7, 0x1

    :goto_10
    const/16 v9, 0x20

    move v8, v2

    :goto_11
    move-object/from16 v2, v25

    goto/16 :goto_16

    :cond_1c
    move-object v0, v8

    move-object v8, v4

    move-object v4, v14

    invoke-virtual/range {p0 .. p0}, Lbo0/c;->f()Z

    move-result v9

    if-eqz v9, :cond_23

    const v1, -0x2d0981e9

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    and-int/lit8 v1, v2, 0x70

    const/16 v3, 0x20

    if-ne v1, v3, :cond_1d

    const/4 v3, 0x1

    goto :goto_12

    :cond_1d
    const/4 v3, 0x0

    :goto_12
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_1e

    if-ne v6, v4, :cond_1f

    :cond_1e
    new-instance v6, Lcom/whoop/profile/view/i;

    const/16 v3, 0x1c

    invoke-direct {v6, v5, v3}, Lcom/whoop/profile/view/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v6, Lc93/a;

    const/16 v3, 0x20

    if-ne v1, v3, :cond_20

    const/4 v1, 0x1

    goto :goto_13

    :cond_20
    const/4 v1, 0x0

    :goto_13
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_21

    if-ne v3, v4, :cond_22

    :cond_21
    new-instance v3, Lcom/whoop/profile/view/i;

    const/16 v1, 0x1d

    invoke-direct {v3, v5, v1}, Lcom/whoop/profile/view/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_22
    check-cast v3, Lc93/a;

    const/4 v9, 0x0

    invoke-static {v6, v3, v8, v9}, Leo0/a;->c(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    move-object v3, v0

    move-object v10, v4

    move-object v1, v5

    move-object v4, v8

    move v11, v9

    goto :goto_f

    :cond_23
    const/4 v9, 0x0

    invoke-virtual/range {p0 .. p0}, Lbo0/c;->g()Z

    move-result v14

    if-eqz v14, :cond_28

    const v14, -0x2d04c46e

    invoke-virtual {v8, v14}, Lp1/q;->e0(I)V

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {}, Lgb1/b0;->U()Li2/t;

    move-result-object v14

    move-object/from16 p2, v0

    const/4 v0, 0x0

    invoke-static {v10, v14, v0, v11, v12}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v1, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v11, v8, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v8, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v11, v8, Lp1/q;->S:Z

    if-eqz v11, :cond_24

    invoke-virtual {v8, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_14

    :cond_24
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_14
    invoke-static {v8, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v8, Lp1/q;->S:Z

    if-nez v0, :cond_25

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_26

    :cond_25
    invoke-static {v1, v8, v1, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_26
    invoke-static {v8, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lsz0/p0$c;->e:Lsz0/p0$c;

    new-instance v9, Lcom/whoop/design/util/TextResource$b;

    sget v1, Lsn0/b;->u:I

    const/4 v3, 0x2

    const/4 v6, 0x0

    invoke-direct {v9, v1, v6, v3, v6}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_27

    new-instance v1, Lej1/a;

    const/4 v3, 0x7

    invoke-direct {v1, v3}, Lej1/a;-><init>(I)V

    invoke-virtual {v8, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    move-object v10, v1

    check-cast v10, Lc93/a;

    sget v1, Lsz0/p0$c;->f:I

    or-int/lit16 v1, v1, 0x180

    sget v3, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v3, v3, 0x3

    or-int v21, v1, v3

    const/16 v22, 0x0

    const/16 v23, 0xff8

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v20, v8

    move-object v8, v0

    invoke-static/range {v8 .. v23}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v20

    const/4 v1, 0x1

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    move-object/from16 v3, p2

    move v7, v1

    move-object v10, v4

    move-object v1, v5

    move-object v4, v8

    move v11, v9

    goto/16 :goto_10

    :cond_28
    move-object/from16 p2, v0

    const/4 v1, 0x1

    invoke-virtual/range {p0 .. p0}, Lbo0/c;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-eqz v0, :cond_2d

    const v0, -0x2cfb53c3

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    new-instance v9, Lsz0/p0$b;

    new-instance v10, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lsn0/b;->o:I

    const/4 v3, 0x2

    const/4 v6, 0x0

    invoke-direct {v10, v0, v6, v3, v6}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v13, 0x6

    const/4 v14, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p0 .. p0}, Lbo0/c;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    new-instance v11, Lcom/whoop/design/util/TextResource$b;

    sget v7, Lsn0/b;->p:I

    invoke-direct {v11, v7, v6, v3, v6}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_29

    new-instance v3, Lej1/a;

    const/16 v6, 0x8

    invoke-direct {v3, v6}, Lej1/a;-><init>(I)V

    invoke-virtual {v8, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_29
    move-object v10, v3

    check-cast v10, Lc93/a;

    and-int/lit8 v3, v2, 0x70

    const/16 v6, 0x20

    if-ne v3, v6, :cond_2a

    move v3, v1

    goto :goto_15

    :cond_2a
    const/4 v3, 0x0

    :goto_15
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_2b

    if-ne v7, v4, :cond_2c

    :cond_2b
    new-instance v7, Lcom/whoop/profile/view/i;

    const/16 v3, 0x18

    invoke-direct {v7, v5, v3}, Lcom/whoop/profile/view/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2c
    move-object v12, v7

    check-cast v12, Lc93/a;

    sget v3, Lsz0/p0$b;->h:I

    or-int/lit16 v3, v3, 0x180

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v7, v7, 0x3

    or-int/2addr v3, v7

    sget v7, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v7, v7, 0x9

    or-int v21, v3, v7

    const/16 v22, 0x0

    const/16 v23, 0xfe0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v20, v8

    move-object v8, v9

    move-object v9, v0

    invoke-static/range {v8 .. v23}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v20

    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    move-object/from16 v3, p2

    move v7, v1

    move-object v10, v4

    move-object v1, v5

    move-object v4, v8

    move v11, v9

    move v8, v2

    move v9, v6

    goto/16 :goto_11

    :cond_2d
    const/16 v6, 0x20

    const/4 v9, 0x0

    const v0, -0x2cf3b855

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    move/from16 v24, v1

    move-object v1, v5

    and-int/lit16 v5, v2, 0x1ffe

    move v3, v6

    const/4 v6, 0x0

    move-object/from16 v0, p0

    move-object v10, v4

    move-object v4, v8

    move v11, v9

    move/from16 v7, v24

    move v8, v2

    move v9, v3

    move-object/from16 v2, v25

    move-object/from16 v3, p2

    invoke-static/range {v0 .. v6}, Leo0/g;->z(Lbo0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v11}, Lp1/q;->q(Z)V

    :goto_16
    invoke-virtual/range {p0 .. p0}, Lbo0/c;->c()Z

    move-result v0

    if-eqz v0, :cond_34

    const v0, -0x2ceeec71

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    and-int/lit8 v0, v8, 0x70

    if-ne v0, v9, :cond_2e

    move v6, v7

    goto :goto_17

    :cond_2e
    move v6, v11

    :goto_17
    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v6, :cond_2f

    if-ne v5, v10, :cond_30

    :cond_2f
    new-instance v5, Lcom/whoop/profile/view/i;

    const/16 v6, 0x19

    invoke-direct {v5, v1, v6}, Lcom/whoop/profile/view/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_30
    check-cast v5, Lc93/a;

    if-ne v0, v9, :cond_31

    move v6, v7

    goto :goto_18

    :cond_31
    move v6, v11

    :goto_18
    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v6, :cond_32

    if-ne v0, v10, :cond_33

    :cond_32
    new-instance v0, Lcom/whoop/profile/view/i;

    const/16 v6, 0x1b

    invoke-direct {v0, v1, v6}, Lcom/whoop/profile/view/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_33
    check-cast v0, Lc93/a;

    invoke-static {v5, v0, v4, v11}, Leo0/g;->x(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v11}, Lp1/q;->q(Z)V

    goto :goto_19

    :cond_34
    const v0, -0x2ceb8589

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v11}, Lp1/q;->q(Z)V

    :goto_19
    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    move-object/from16 v20, v4

    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    goto :goto_1a

    :cond_35
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object/from16 v20, v4

    move-object v2, v8

    move-object v3, v10

    move-object v4, v13

    :goto_1a
    invoke-virtual/range {v20 .. v20}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_36

    new-instance v0, Leo0/f;

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Leo0/f;-><init>(Lbo0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_36
    return-void
.end method

.method private static final N(Lbo0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final O()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final P(Ltn0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Q()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final R(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lbo0/a$f;->a:Lbo0/a$f;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final S(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lbo0/a$a;->a:Lbo0/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final T()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final U()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final V(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lbo0/a$c;->a:Lbo0/a$c;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final W(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lbo0/a$b;->a:Lbo0/a$b;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final X(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lbo0/a$d;->a:Lbo0/a$d;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Y(Lbo0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Leo0/g;->M(Lbo0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Ltn0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Leo0/g;->A(Ltn0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Leo0/g;->W(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Leo0/g;->Q()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lbo0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Leo0/g;->Y(Lbo0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e()Ll83/a0;
    .locals 1

    invoke-static {}, Leo0/g;->T()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Leo0/g;->X(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Leo0/g;->y(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Leo0/g;->E(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Leo0/g;->V(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Leo0/g;->S(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k()Ll83/a0;
    .locals 1

    invoke-static {}, Leo0/g;->U()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic l(Lbo0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Leo0/g;->L(Lbo0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lbo0/c;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Leo0/g;->I(Lbo0/c;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Leo0/g;->D(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(I)I
    .locals 0

    invoke-static {p0}, Leo0/g;->H(I)I

    move-result p0

    return p0
.end method

.method public static synthetic p()Ll83/a0;
    .locals 1

    invoke-static {}, Leo0/g;->O()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic q(Ltn0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Leo0/g;->P(Ltn0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lbo0/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Leo0/g;->K(Lbo0/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Leo0/g;->R(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(I)I
    .locals 0

    invoke-static {p0}, Leo0/g;->G(I)I

    move-result p0

    return p0
.end method

.method public static synthetic u(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Leo0/g;->J(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lbo0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Leo0/g;->N(Lbo0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Leo0/g;->F(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final x(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    check-cast v2, Lp1/q;

    const v3, -0x766fc1a2

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v2, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit8 v5, v3, 0x13

    const/16 v6, 0x12

    if-eq v5, v6, :cond_4

    const/4 v5, 0x1

    goto :goto_3

    :cond_4
    const/4 v5, 0x0

    :goto_3
    and-int/lit8 v6, v3, 0x1

    invoke-virtual {v2, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_5

    new-instance v1, Lcom/whoop/design/util/TextResource$b;

    sget v5, Lsn0/b;->f:I

    const/4 v6, 0x0

    invoke-direct {v1, v5, v6, v4, v6}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v28, v2

    new-instance v2, Lcom/whoop/design/util/TextResource$b;

    sget v5, Lsn0/b;->e:I

    invoke-direct {v2, v5, v6, v4, v6}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move v5, v3

    new-instance v3, Lcom/whoop/design/util/TextResource$b;

    sget v7, Lsn0/b;->c:I

    invoke-direct {v3, v7, v6, v4, v6}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lcom/whoop/design/util/TextResource$b;

    sget v7, Lsn0/b;->d:I

    invoke-direct {v9, v7, v6, v4, v6}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v4, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v6, v4, 0x3

    shl-int/lit8 v7, v4, 0x6

    or-int/2addr v6, v7

    shl-int/lit8 v7, v4, 0x9

    or-int/2addr v6, v7

    shl-int/lit8 v4, v4, 0x1b

    or-int v29, v6, v4

    shl-int/lit8 v4, v5, 0x3

    and-int/lit16 v4, v4, 0x380

    or-int/lit8 v4, v4, 0x6

    shl-int/lit8 v5, v5, 0xc

    const v6, 0xe000

    and-int/2addr v5, v6

    or-int v31, v4, v5

    const v32, 0xeafedf1

    const/4 v0, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v30, 0x180

    move-object/from16 v24, p0

    move-object/from16 v22, p1

    invoke-static/range {v0 .. v32}, Lj11/n;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLy81/e;Lg1/u0;Lf0/t;Lf0/t;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZZLj11/p;Lj11/o;ZILjava/lang/Integer;Ll3/g;Ljava/lang/Integer;ZLjava/lang/String;Lc93/a;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/m;Lc93/m;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v1, v22

    move-object/from16 v0, v24

    goto :goto_4

    :cond_5
    move-object/from16 v28, v2

    invoke-virtual/range {v28 .. v28}, Lp1/q;->X()V

    :goto_4
    invoke-virtual/range {v28 .. v28}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_6

    new-instance v3, Lam2/g;

    const/4 v4, 0x2

    move/from16 v5, p3

    invoke-direct {v3, v0, v1, v5, v4}, Lam2/g;-><init>(Lc93/a;Lc93/a;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final y(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Leo0/g;->x(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lbo0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 56
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbo0/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v5, p5

    move-object/from16 v13, p4

    check-cast v13, Lp1/q;

    const v0, -0x289d067a

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v6, v5, 0x30

    const/16 v7, 0x10

    if-nez v6, :cond_3

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    move v6, v7

    :goto_2
    or-int/2addr v0, v6

    :cond_3
    and-int/lit8 v6, p6, 0x8

    if-eqz v6, :cond_5

    or-int/lit16 v0, v0, 0xc00

    :cond_4
    move-object/from16 v9, p3

    goto :goto_4

    :cond_5
    and-int/lit16 v9, v5, 0xc00

    if-nez v9, :cond_4

    move-object/from16 v9, p3

    invoke-virtual {v13, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    const/16 v10, 0x800

    goto :goto_3

    :cond_6
    const/16 v10, 0x400

    :goto_3
    or-int/2addr v0, v10

    :goto_4
    and-int/lit16 v10, v0, 0x413

    const/16 v11, 0x412

    const/4 v12, 0x0

    if-eq v10, v11, :cond_7

    const/4 v10, 0x1

    goto :goto_5

    :cond_7
    move v10, v12

    :goto_5
    and-int/lit8 v11, v0, 0x1

    invoke-virtual {v13, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_29

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_9

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v10, :cond_8

    new-instance v6, Lej1/n;

    invoke-direct {v6, v7}, Lej1/n;-><init>(I)V

    invoke-virtual {v13, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object v9, v6

    :cond_9
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v10, :cond_a

    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v13, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v6, Lp1/c1;

    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v11}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {}, Lgb1/b0;->U()Li2/t;

    move-result-object v14

    const/4 v3, 0x0

    const/4 v15, 0x0

    const/4 v4, 0x6

    invoke-static {v8, v14, v3, v15, v4}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8}, Ll0/f;->l(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v14, Lb2/e;->w:Lb2/m;

    invoke-static {v14, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v14

    move/from16 p3, v4

    iget-wide v4, v13, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v13, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v3, v13, Lp1/q;->S:Z

    if-eqz v3, :cond_b

    invoke-virtual {v13, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_b
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_6
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v13, v3, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v13, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v15, v13, Lp1/q;->S:Z

    if-nez v15, :cond_c

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v15, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_d

    :cond_c
    invoke-static {v4, v13, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v13, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v11}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v15, 0x2

    int-to-float v7, v15

    const/16 v15, 0x8

    int-to-float v15, v15

    mul-float/2addr v7, v15

    move-object/from16 v27, v6

    move-object/from16 v28, v9

    const/4 v6, 0x0

    const/4 v9, 0x2

    invoke-static {v8, v7, v6, v9}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Lb2/e;->M:Lb2/k;

    sget-object v9, Ll0/m;->c:Ll0/g;

    move/from16 v29, v7

    const/16 v7, 0x30

    invoke-static {v9, v8, v13, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v8, v13, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v13, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v13}, Lp1/q;->i0()V

    move-object/from16 v16, v11

    iget-boolean v11, v13, Lp1/q;->S:Z

    if-eqz v11, :cond_e

    invoke-virtual {v13, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_e
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v13, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v13, Lp1/q;->S:Z

    if-nez v3, :cond_f

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_10

    :cond_f
    invoke-static {v8, v13, v8, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    invoke-static {v13, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide/high16 v3, 0x3ff8000000000000L    # 1.5

    double-to-float v3, v3

    mul-float v18, v3, v15

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v3, v16

    new-instance v32, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v33

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-static {v4}, Lev/n;->h(Lx81/d;)Ljava/lang/Integer;

    move-result-object v35

    sget v5, Lgy0/f;->K:I

    invoke-static {v13, v5}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v36

    const v49, 0xfdf2

    const/16 v50, 0x0

    const/16 v34, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

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

    invoke-direct/range {v32 .. v50}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v5, v0, 0x70

    const/16 v7, 0x20

    if-ne v5, v7, :cond_11

    const/4 v8, 0x1

    goto :goto_8

    :cond_11
    const/4 v8, 0x0

    :goto_8
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    const/16 v11, 0x1a

    if-nez v8, :cond_12

    if-ne v9, v10, :cond_13

    :cond_12
    new-instance v9, Lcom/whoop/profile/view/i;

    invoke-direct {v9, v2, v11}, Lcom/whoop/profile/view/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v9, Lc93/a;

    sget v8, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    const/4 v12, 0x3

    shl-int/2addr v8, v12

    or-int/lit8 v8, v8, 0x6

    const/16 v14, 0x34

    move-object/from16 v17, v13

    move v13, v8

    const/4 v8, 0x0

    move-object/from16 v16, v10

    const/4 v10, 0x0

    move/from16 v18, v11

    const/4 v11, 0x0

    move/from16 v24, v7

    move/from16 v19, v15

    move-object/from16 v53, v16

    move-object/from16 v12, v17

    move-object/from16 p4, v27

    move-object/from16 v51, v28

    move/from16 v52, v29

    move-object/from16 v7, v32

    const/4 v15, 0x1

    invoke-static/range {v6 .. v14}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v13, v12

    const/high16 v6, 0x3f000000    # 0.5f

    sget-object v7, Ll0/z;->a:Ll0/z;

    invoke-virtual {v7, v3, v15, v6}, Ll0/z;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v13, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget v6, Lsn0/a;->a:I

    const/4 v8, 0x0

    invoke-static {v6, v13, v8}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v6

    const/16 v9, 0x14

    int-to-float v9, v9

    const/4 v10, 0x4

    int-to-float v10, v10

    mul-float/2addr v9, v10

    invoke-static {v9, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/16 v14, 0x61b0

    move/from16 v22, v15

    const/16 v15, 0x68

    move-object v11, v7

    const/4 v7, 0x0

    move/from16 v25, v8

    move-object v8, v9

    const/4 v9, 0x0

    move v12, v10

    sget-object v10, Ly2/j;->b:Ly2/b1;

    move-object/from16 v16, v11

    const/4 v11, 0x0

    move/from16 v17, v12

    const/4 v12, 0x0

    move/from16 v34, v0

    move-object/from16 v36, v16

    move/from16 v33, v17

    move/from16 v32, v19

    move/from16 v0, v22

    invoke-static/range {v6 .. v15}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    const/4 v6, 0x3

    int-to-float v7, v6

    mul-float v7, v7, v32

    invoke-static {v7, v3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v13, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget v8, Lsn0/b;->w:I

    invoke-static {v13, v8}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    sget v9, Lx81/d;->b:I

    invoke-virtual {v4, v13, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    invoke-virtual {v4, v13, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->O()Lb91/a;

    move-result-object v26

    sget v37, Lb91/a;->d:I

    shl-int/lit8 v30, v37, 0x12

    const v31, 0x2fffa

    move v12, v7

    const/4 v7, 0x0

    move/from16 v54, v6

    move-object v6, v8

    move v14, v9

    move-wide v8, v10

    const-wide/16 v10, 0x0

    move v15, v12

    const/4 v12, 0x0

    move-object/from16 v17, v13

    const/4 v13, 0x0

    move/from16 v16, v14

    const/4 v14, 0x0

    move/from16 v18, v15

    move/from16 v19, v16

    const-wide/16 v15, 0x0

    move-object/from16 v28, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v22, v19

    move/from16 v21, v20

    const-wide/16 v19, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v25, v23

    const/16 v23, 0x0

    move/from16 v27, v24

    const/16 v24, 0x0

    move/from16 v29, v25

    const/16 v25, 0x0

    move/from16 v38, v27

    const/16 v27, 0x0

    move/from16 v39, v29

    const/16 v29, 0x0

    move/from16 v40, v0

    move/from16 v1, v38

    move/from16 v0, v39

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v28

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v13, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v7, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lsn0/b;->v:I

    const/4 v6, 0x0

    const/4 v9, 0x2

    invoke-direct {v7, v0, v6, v9, v6}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4, v13, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->I()Lb91/a;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lbo0/c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_14

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    :goto_9
    move-object v8, v0

    goto :goto_a

    :cond_14
    new-instance v0, Lcom/whoop/design/util/TextResource$e;

    invoke-virtual/range {p0 .. p0}, Lbo0/c;->a()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v6}, Lcom/whoop/design/util/TextResource$e;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_9

    :goto_a
    new-instance v11, Lqz0/c$a;

    invoke-static/range {p4 .. p4}, Leo0/g;->B(Lp1/c1;)Z

    move-result v0

    if-eqz v0, :cond_15

    invoke-virtual {v4}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/k0;->Z()I

    move-result v0

    :goto_b
    move v15, v0

    goto :goto_c

    :cond_15
    invoke-virtual {v4}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/k0;->f0()I

    move-result v0

    goto :goto_b

    :goto_c
    const/16 v19, 0xe

    const/16 v20, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v14, v11

    invoke-direct/range {v14 .. v20}, Lqz0/c$a;-><init>(ILy3/f;Ly81/e;Li2/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {p4 .. p4}, Leo0/g;->B(Lp1/c1;)Z

    move-result v0

    if-eqz v0, :cond_16

    new-instance v0, Lq3/s;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_d

    :cond_16
    sget-object v0, Lq3/f0;->w:Lg40/h2;

    :goto_d
    invoke-virtual/range {p0 .. p0}, Lbo0/c;->i()Z

    move-result v6

    xor-int/lit8 v14, v6, 0x1

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v10, v53

    if-ne v6, v10, :cond_17

    new-instance v6, Lb01/m;

    move-object/from16 v12, p4

    const/16 v15, 0x1a

    invoke-direct {v6, v15, v12}, Lb01/m;-><init>(ILp1/c1;)V

    invoke-virtual {v13, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object v15, v6

    check-cast v15, Lc93/a;

    const/16 v6, 0x20

    if-ne v5, v6, :cond_18

    move/from16 v12, v40

    goto :goto_e

    :cond_18
    const/4 v12, 0x0

    :goto_e
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v12, :cond_19

    if-ne v6, v10, :cond_1a

    :cond_19
    new-instance v6, Ldk2/i;

    const/16 v12, 0x9

    invoke-direct {v6, v2, v12}, Ldk2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    move-object/from16 v16, v6

    check-cast v16, Lkotlin/jvm/functions/Function1;

    sget v6, Lcom/whoop/design/util/TextResource$b;->c:I

    const/16 v54, 0x3

    shl-int/lit8 v6, v6, 0x3

    const v12, 0x30006006

    or-int/2addr v6, v12

    sget v21, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v12, v21, 0x6

    or-int/2addr v6, v12

    shl-int/lit8 v12, v37, 0x9

    or-int/2addr v6, v12

    sget v12, Lqz0/c$a;->f:I

    shl-int/lit8 v12, v12, 0xf

    or-int v18, v6, v12

    const/16 v19, 0x0

    const/16 v20, 0x40

    move-object/from16 v53, v10

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object v6, v3

    move-object/from16 v17, v13

    move/from16 v3, v54

    move-object v13, v0

    move-object/from16 v0, v53

    invoke-static/range {v6 .. v20}, Ldo0/f;->e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lqz0/c;Lcom/whoop/design/util/TextResource;Lq3/g0;ZLc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object v7, v6

    move-object/from16 v13, v17

    move/from16 v6, v52

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v13, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lbo0/c;->e()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_1b

    const v8, -0x6bfdb1ba

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lbo0/c;->e()Ljava/util/List;

    move-result-object v8

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static {v8, v11, v13, v10, v9}, Leo0/c;->h(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v10}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_1b
    const/4 v10, 0x0

    const v8, -0x6bfb8da8

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v10}, Lp1/q;->q(Z)V

    :goto_f
    mul-float v8, v33, v32

    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v13, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lbo0/c;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    if-eqz v8, :cond_1c

    move/from16 v12, v40

    :goto_10
    const/4 v11, 0x0

    goto :goto_11

    :cond_1c
    move v12, v10

    goto :goto_10

    :goto_11
    invoke-static {v11, v3}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v8

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    const/16 v14, 0x11

    if-ne v9, v0, :cond_1d

    new-instance v9, Lej1/n;

    invoke-direct {v9, v14}, Lej1/n;-><init>(I)V

    invoke-virtual {v13, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v9, Lkotlin/jvm/functions/Function1;

    move/from16 v15, v40

    invoke-static {v11, v9, v15}, Lc0/w0;->p(Ld0/e2;Lkotlin/jvm/functions/Function1;I)Lc0/d1;

    move-result-object v9

    invoke-virtual {v8, v9}, Lc0/c1;->a(Lc0/c1;)Lc0/d1;

    move-result-object v9

    invoke-static {v11, v3}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v3

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    const/16 v11, 0x12

    if-ne v8, v0, :cond_1e

    new-instance v8, Lej1/n;

    invoke-direct {v8, v11}, Lej1/n;-><init>(I)V

    invoke-virtual {v13, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/4 v15, 0x1

    invoke-static {v15, v8}, Lc0/w0;->t(ILkotlin/jvm/functions/Function1;)Lc0/f1;

    move-result-object v8

    invoke-virtual {v3, v8}, Lc0/e1;->a(Lc0/e1;)Lc0/f1;

    move-result-object v3

    new-instance v8, Ll;

    move-object/from16 v15, p0

    invoke-direct {v8, v14, v15, v2}, Ll;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v14, 0x19eb5b32

    invoke-static {v14, v13, v8}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const v14, 0x186c06

    const/16 v15, 0x12

    move-object/from16 v16, v7

    move v7, v12

    move-object v12, v8

    const/4 v8, 0x0

    move/from16 v17, v11

    const/4 v11, 0x0

    move-object v10, v3

    move/from16 v55, v6

    move-object/from16 v2, v16

    move-object/from16 v6, v36

    move-object/from16 v3, p0

    invoke-static/range {v6 .. v15}, Landroidx/compose/animation/b;->e(Ll0/y;ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    invoke-virtual {v3}, Lbo0/c;->h()Z

    move-result v6

    if-eqz v6, :cond_1f

    invoke-virtual {v3}, Lbo0/c;->i()Z

    move-result v6

    if-nez v6, :cond_1f

    invoke-virtual {v3}, Lbo0/c;->j()Z

    move-result v6

    if-nez v6, :cond_1f

    const/16 v19, 0x1

    goto :goto_12

    :cond_1f
    const/16 v19, 0x0

    :goto_12
    invoke-virtual {v3}, Lbo0/c;->j()Z

    move-result v6

    if-eqz v6, :cond_20

    sget v6, Lgy0/a;->M:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    move-object/from16 v20, v6

    goto :goto_13

    :cond_20
    const/16 v20, 0x0

    :goto_13
    invoke-virtual {v3}, Lbo0/c;->j()Z

    move-result v6

    if-nez v6, :cond_22

    invoke-virtual {v3}, Lbo0/c;->i()Z

    move-result v6

    if-eqz v6, :cond_21

    goto :goto_14

    :cond_21
    const v6, -0x6bdaefe1

    invoke-virtual {v13, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lg1/v0;->a:Ll0/l1;

    invoke-virtual {v4, v13, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v6

    invoke-virtual {v4, v13, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->w()J

    move-result-wide v8

    invoke-virtual {v4, v13, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->W0()J

    move-result-wide v10

    invoke-virtual {v4, v13, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->X0()J

    move-result-wide v14

    move-object/from16 v28, v13

    move-wide v12, v14

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v14, v28

    invoke-static/range {v6 .. v16}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v6

    move-object v13, v14

    const/4 v10, 0x0

    invoke-virtual {v13, v10}, Lp1/q;->q(Z)V

    goto :goto_15

    :cond_22
    :goto_14
    const v6, -0x6be1d4b3

    invoke-virtual {v13, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lg1/v0;->a:Ll0/l1;

    invoke-virtual {v4, v13, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->W0()J

    move-result-wide v6

    invoke-virtual {v4, v13, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->j()J

    move-result-wide v8

    invoke-virtual {v4, v13, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->W0()J

    move-result-wide v10

    invoke-virtual {v4, v13, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->j()J

    move-result-wide v14

    move-object/from16 v28, v13

    move-wide v12, v14

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v14, v28

    invoke-static/range {v6 .. v16}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v6

    move-object v13, v14

    const/4 v10, 0x0

    invoke-virtual {v13, v10}, Lp1/q;->q(Z)V

    :goto_15
    invoke-virtual {v3}, Lbo0/c;->i()Z

    move-result v7

    if-eqz v7, :cond_23

    sget v7, Lgy0/e;->d:I

    invoke-static {v7}, Lv41/r0$d;->b(I)I

    move-result v7

    invoke-static {v7}, Lv41/r0$d;->a(I)Lv41/r0$d;

    move-result-object v7

    move-object v11, v7

    goto :goto_16

    :cond_23
    const/4 v11, 0x0

    :goto_16
    invoke-virtual {v3}, Lbo0/c;->j()Z

    move-result v7

    if-eqz v7, :cond_24

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    :goto_17
    move-object v12, v7

    goto :goto_18

    :cond_24
    new-instance v7, Lcom/whoop/design/util/TextResource$b;

    sget v8, Lsn0/b;->r:I

    const/4 v9, 0x2

    const/4 v12, 0x0

    invoke-direct {v7, v8, v12, v9, v12}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_17

    :goto_18
    invoke-virtual {v4, v13, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->r()Lb91/a;

    move-result-object v1

    invoke-virtual {v13, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    move/from16 v7, v34

    and-int/lit16 v7, v7, 0x1c00

    const/16 v8, 0x800

    if-ne v7, v8, :cond_25

    const/4 v7, 0x1

    goto :goto_19

    :cond_25
    move v7, v10

    :goto_19
    or-int/2addr v4, v7

    const/16 v7, 0x20

    if-ne v5, v7, :cond_26

    const/4 v10, 0x1

    :cond_26
    or-int/2addr v4, v10

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_28

    if-ne v5, v0, :cond_27

    goto :goto_1a

    :cond_27
    move-object/from16 v0, p1

    move/from16 v7, p3

    move-object/from16 v4, v51

    goto :goto_1b

    :cond_28
    :goto_1a
    new-instance v5, Ld30/r;

    move-object/from16 v0, p1

    move/from16 v7, p3

    move-object/from16 v4, v51

    invoke-direct {v5, v3, v4, v0, v7}, Ld30/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v13, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1b
    check-cast v5, Lc93/a;

    shl-int/lit8 v8, v21, 0x12

    or-int/lit8 v21, v8, 0x6

    shl-int/lit8 v22, v37, 0x6

    const/16 v23, 0xf14

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move/from16 v7, v19

    move-object/from16 v9, v20

    move-object/from16 v19, v5

    move-object/from16 v20, v13

    move-object v13, v6

    move-object/from16 v6, v18

    move-object/from16 v18, v1

    invoke-static/range {v6 .. v23}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v20

    move/from16 v6, v55

    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v13, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v15, 0x1

    invoke-virtual {v13, v15}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v15}, Lp1/q;->q(Z)V

    goto :goto_1c

    :cond_29
    move-object v3, v1

    move-object v0, v2

    invoke-virtual {v13}, Lp1/q;->X()V

    move-object v4, v9

    :goto_1c
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_2a

    new-instance v0, Leo0/f;

    const/4 v7, 0x0

    move-object/from16 v2, p1

    move/from16 v5, p5

    move/from16 v6, p6

    move-object v1, v3

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v7}, Leo0/f;-><init>(Lbo0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_2a
    return-void
.end method
