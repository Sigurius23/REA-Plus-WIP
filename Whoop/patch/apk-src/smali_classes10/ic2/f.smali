.class public abstract Lic2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a{\u0010\r\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0018\u0010\u0008\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00052\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\t2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a1\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0018\u0010\u0008\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0005H\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a5\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00072\u0014\u0008\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0016H\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lic2/g;",
        "viewState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onNavbarLeftIconClicked",
        "Lkotlin/Function2;",
        "",
        "",
        "onNotificationSwitchSelected",
        "Lkotlin/Function3;",
        "onShepherdNotificationSwitchSelected",
        "onSystemSettingsClicked",
        "onShepherdSettingsClicked",
        "r",
        "(Lic2/g;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "Lic2/a;",
        "individualSettings",
        "n",
        "(Lic2/a;Lc93/m;Landroidx/compose/runtime/Composer;I)V",
        "Lic2/h;",
        "toggleViewState",
        "isToggleEnabled",
        "Lkotlin/Function1;",
        "onSwitchToggle",
        "y",
        "(Lic2/h;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "settings_release"
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
.method private static final A(Lic2/h;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 14

    move-object/from16 v0, p2

    and-int/lit8 v1, p4, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, p4, 0x1

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lic2/h;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v1, v11, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {p0}, Lic2/h;->d()Z

    move-result v4

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez p0, :cond_1

    sget-object p0, Lp1/l;->a:Lp1/v0;

    if-ne v1, p0, :cond_2

    :cond_1
    new-instance v1, Lge0/c;

    const/16 p0, 0x17

    invoke-direct {v1, v0, p0}, Lge0/c;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v10, v1

    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/4 v12, 0x0

    const/16 v13, 0x38

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v5, p1

    invoke-static/range {v3 .. v13}, Lpz0/d;->e(Landroidx/compose/ui/Modifier;ZZJLpz0/e;Li2/t;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lic2/h;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lic2/f;->y(Lic2/h;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lc93/a;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lic2/f;->u(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Z)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lic2/f;->z(Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function3;Lic2/h;Lic2/g;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lic2/f;->v(Lkotlin/jvm/functions/Function3;Lic2/h;Lic2/g;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lic2/h;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lic2/f;->C(Lic2/h;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lic2/h;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lic2/f;->A(Lic2/h;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lic2/g;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lic2/f;->x(Lic2/g;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lic2/f;->B(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lc93/m;Lic2/a;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lic2/f;->p(Lc93/m;Lic2/a;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lic2/f;->s(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lc93/a;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lic2/f;->w(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lic2/a;Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lic2/f;->o(Lic2/a;Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lic2/a;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lic2/f;->q(Lic2/a;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lc93/m;Ljava/lang/String;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lic2/f;->t(Lc93/m;Ljava/lang/String;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final n(Lic2/a;Lc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lic2/a;",
            "Lc93/m;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    const v3, -0x72afadaf

    invoke-virtual {v12, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_2

    and-int/lit8 v3, p3, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    or-int v3, p3, v3

    goto :goto_2

    :cond_2
    move/from16 v3, p3

    :goto_2
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v3, v5

    :cond_4
    and-int/lit8 v5, v3, 0x13

    const/4 v6, 0x0

    const/16 v7, 0x12

    const/4 v8, 0x1

    if-eq v5, v7, :cond_5

    move v5, v8

    goto :goto_4

    :cond_5
    move v5, v6

    :goto_4
    and-int/2addr v3, v8

    invoke-virtual {v12, v3, v5}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_c

    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    int-to-float v10, v4

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float/2addr v10, v11

    const/4 v11, 0x0

    invoke-static {v9, v10, v11, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v9, v10, v12, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-eqz v13, :cond_6

    invoke-virtual {v12, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_5
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v12, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v12, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-nez v14, :cond_7

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v14, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    :cond_7
    invoke-static {v9, v12, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v12, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Ll0/m;->g:Ll0/h;

    sget-object v9, Lb2/e;->K:Lb2/l;

    const/16 v14, 0x36

    invoke-static {v4, v9, v12, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v8, v12, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v12, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_9

    invoke-virtual {v12, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v12, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v12, Lp1/q;->S:Z

    if-nez v4, :cond_a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    :cond_a
    invoke-static {v8, v12, v8, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v12, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v12, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->a()J

    move-result-wide v6

    new-instance v8, Lf01/f;

    const/16 v9, 0x19

    invoke-direct {v8, v9, v0, v1}, Lf01/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v9, -0x7c6cb0ee

    invoke-static {v9, v12, v8}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v11

    const/16 v13, 0x6000

    const/16 v14, 0xd

    move-object v8, v3

    move v9, v4

    const-wide/16 v3, 0x0

    move-wide/from16 v17, v6

    move-object v6, v8

    const-wide/16 v7, 0x0

    move/from16 v19, v9

    const-wide/16 v9, 0x0

    move-object v2, v5

    move-object v15, v6

    move-wide/from16 v5, v17

    move/from16 v0, v19

    const/4 v1, 0x1

    const/16 v16, 0x12

    invoke-static/range {v3 .. v14}, Ly81/c;->b(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lic2/a;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v12, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v15, v12, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->b1()J

    move-result-wide v5

    invoke-virtual {v15, v12, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->b()Lb91/a;

    move-result-object v23

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v27, v0, 0x12

    const v28, 0x2fffa

    const/4 v4, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v25, v12

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/4 v0, 0x4

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v25

    int-to-float v0, v0

    invoke-static {v0, v0, v2, v12, v1}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_7

    :cond_c
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_d

    new-instance v1, Lf01/b;

    const/16 v2, 0x1c

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move/from16 v5, p3

    invoke-direct {v1, v3, v4, v5, v2}, Lf01/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final o(Lic2/a;Lc93/m;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    and-int/lit8 v2, p3, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eq v2, v3, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    and-int/lit8 v3, p3, 0x1

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Lic2/a;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v12, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v2, v12, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v6

    invoke-virtual {v2, v12, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->q()Lb91/a;

    move-result-object v24

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v28, v2, 0x12

    const v29, 0x2fffa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v26, v12

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v26

    invoke-virtual {v0}, Lic2/a;->a()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "notification_switch_"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v0}, Lic2/a;->d()Z

    move-result v5

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_2

    :cond_1
    new-instance v3, Lh02/h;

    const/16 v2, 0xe

    invoke-direct {v3, v2, v1, v0}, Lh02/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v11, v3

    check-cast v11, Lkotlin/jvm/functions/Function1;

    const/4 v13, 0x0

    const/16 v14, 0x3c

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v4 .. v14}, Lpz0/d;->e(Landroidx/compose/ui/Modifier;ZZJLpz0/e;Li2/t;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final p(Lc93/m;Lic2/a;Z)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lic2/a;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lic2/a;->d()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p2, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lic2/a;Lc93/m;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lic2/f;->n(Lic2/a;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final r(Lic2/g;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 47
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lic2/g;",
            "Lc93/a;",
            "Lc93/m;",
            "Lkotlin/jvm/functions/Function3;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavbarLeftIconClicked"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNotificationSwitchSelected"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onShepherdNotificationSwitchSelected"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSystemSettingsClicked"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onShepherdSettingsClicked"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p6

    check-cast v11, Lp1/q;

    const v0, -0x386353dd

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v7

    goto :goto_1

    :cond_1
    move v0, v7

    :goto_1
    and-int/lit8 v10, v7, 0x30

    if-nez v10, :cond_3

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x20

    goto :goto_2

    :cond_2
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v0, v10

    :cond_3
    and-int/lit16 v10, v7, 0x180

    if-nez v10, :cond_5

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x100

    goto :goto_3

    :cond_4
    const/16 v10, 0x80

    :goto_3
    or-int/2addr v0, v10

    :cond_5
    and-int/lit16 v10, v7, 0xc00

    if-nez v10, :cond_7

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    const/16 v10, 0x800

    goto :goto_4

    :cond_6
    const/16 v10, 0x400

    :goto_4
    or-int/2addr v0, v10

    :cond_7
    and-int/lit16 v10, v7, 0x6000

    if-nez v10, :cond_9

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x4000

    goto :goto_5

    :cond_8
    const/16 v10, 0x2000

    :goto_5
    or-int/2addr v0, v10

    :cond_9
    const/high16 v10, 0x30000

    and-int/2addr v10, v7

    if-nez v10, :cond_b

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    const/high16 v10, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v10, 0x10000

    :goto_6
    or-int/2addr v0, v10

    :cond_b
    const v10, 0x12493

    and-int/2addr v10, v0

    const v8, 0x12492

    if-eq v10, v8, :cond_c

    const/4 v8, 0x1

    goto :goto_7

    :cond_c
    const/4 v8, 0x0

    :goto_7
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v11, v10, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_21

    sget-object v8, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v11, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/content/Context;

    const/high16 v10, 0x3f800000    # 1.0f

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v13}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v10}, Lgb1/b0;->S(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v10}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v14, Lb2/e;->N:Lb2/k;

    sget-object v15, Ll0/m;->c:Ll0/g;

    move-object/from16 v22, v13

    const/16 v13, 0x30

    invoke-static {v15, v14, v11, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v14

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v11, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v24, La3/l;->a:La3/k;

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-eqz v9, :cond_d

    invoke-virtual {v11, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_d
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_8
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v11, v9, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v11, v9, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-nez v13, :cond_e

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_f

    :cond_e
    invoke-static {v12, v11, v12, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v11, v9, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v9, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    new-instance v10, Lcom/whoop/design/util/TextResource$b;

    sget v12, Lea2/s;->M:I

    const/4 v13, 0x0

    const/4 v14, 0x2

    invoke-direct {v10, v12, v13, v14, v13}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v12, Lx81/d;->a:Lx81/d;

    invoke-static {v12}, Ly00/t7;->e(Lx81/d;)Ljava/lang/Integer;

    move-result-object v29

    sget v12, Luv0/c;->E:I

    invoke-virtual {v8, v12}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    const-string v12, "getString(...)"

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const v43, 0xfff2

    const/16 v44, 0x0

    const/16 v28, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    move-object/from16 v30, v8

    move-object/from16 v26, v9

    move-object/from16 v27, v10

    invoke-direct/range {v26 .. v44}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v8, v0, 0x70

    const/16 v15, 0x20

    if-ne v8, v15, :cond_10

    const/4 v8, 0x1

    goto :goto_9

    :cond_10
    const/4 v8, 0x0

    :goto_9
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v8, :cond_11

    if-ne v10, v12, :cond_12

    :cond_11
    new-instance v10, Lg40/i3;

    const/16 v8, 0x1b

    invoke-direct {v10, v2, v8}, Lg40/i3;-><init>(Lc93/a;I)V

    invoke-virtual {v11, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v10, Lc93/a;

    sget v8, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v15, v8, 0x3

    const/high16 v8, 0x20000

    const/16 v16, 0x35

    move/from16 v24, v8

    const/4 v8, 0x0

    move/from16 v25, v14

    move-object v14, v11

    move-object v11, v10

    const/4 v10, 0x0

    move-object/from16 v26, v12

    const/4 v12, 0x0

    move-object/from16 v27, v13

    const/4 v13, 0x0

    move-object/from16 v45, v22

    move-object/from16 v46, v26

    const/16 v2, 0x100

    const/16 v26, 0x30

    invoke-static/range {v8 .. v16}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const v8, -0x37171994

    invoke-virtual {v14, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lic2/g;->a()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_16

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lic2/a;

    and-int/lit16 v10, v0, 0x380

    if-ne v10, v2, :cond_13

    const/4 v13, 0x1

    goto :goto_b

    :cond_13
    const/4 v13, 0x0

    :goto_b
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v11, v46

    if-nez v13, :cond_14

    if-ne v10, v11, :cond_15

    :cond_14
    new-instance v10, Lcom/whoop/profile/view/edit/l;

    const/4 v12, 0x4

    invoke-direct {v10, v12, v3}, Lcom/whoop/profile/view/edit/l;-><init>(ILc93/m;)V

    invoke-virtual {v14, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v10, Lc93/m;

    sget v12, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v9, v10, v14, v12}, Lic2/f;->n(Lic2/a;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v46, v11

    goto :goto_a

    :cond_16
    move-object/from16 v11, v46

    const/4 v9, 0x0

    invoke-virtual {v14, v9}, Lp1/q;->q(Z)V

    const/4 v2, 0x6

    int-to-float v8, v2

    const/4 v9, 0x4

    int-to-float v9, v9

    mul-float/2addr v8, v9

    move-object/from16 v9, v45

    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v14, v10}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v10, "Navigate to system settings"

    invoke-static {v9, v10}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v9, Lny0/n0;->TextLarge:Lny0/n0;

    move v12, v8

    move-object v8, v10

    new-instance v10, Lcom/whoop/design/util/TextResource$b;

    sget v13, Lea2/s;->L:I

    move/from16 p6, v2

    const/4 v2, 0x0

    const/4 v15, 0x2

    invoke-direct {v10, v13, v2, v15, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move v13, v12

    new-instance v12, Ly71/g;

    sget-object v27, Lx81/d;->a:Lx81/d;

    invoke-static/range {v27 .. v27}, Lih0/d0;->E(Lx81/d;)I

    move-result v3

    invoke-direct {v12, v3, v2, v15, v2}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v3, 0xe000

    and-int/2addr v3, v0

    const/16 v15, 0x4000

    if-ne v3, v15, :cond_17

    const/4 v3, 0x1

    goto :goto_c

    :cond_17
    const/4 v3, 0x0

    :goto_c
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v3, :cond_18

    if-ne v15, v11, :cond_19

    :cond_18
    new-instance v15, Lh0/l0;

    const/4 v3, 0x7

    invoke-direct {v15, v5, v3}, Lh0/l0;-><init>(Lc93/a;I)V

    invoke-virtual {v14, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    move-object/from16 v20, v15

    check-cast v20, Lkotlin/jvm/functions/Function1;

    sget v3, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v3, v3, 0x6

    or-int/lit8 v15, v3, 0x36

    sget v16, Ly71/g;->c:I

    shl-int/lit8 v28, v16, 0xc

    or-int v22, v15, v28

    const/16 v23, 0x0

    const/16 v24, 0xfe8

    move-object/from16 v46, v11

    const/4 v11, 0x0

    move v15, v13

    const/4 v13, 0x0

    move-object/from16 v21, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v29, v19

    const/16 v19, 0x0

    move/from16 p6, v3

    move/from16 v2, v29

    move-object/from16 v3, v45

    move-object/from16 v5, v46

    const/4 v7, 0x2

    invoke-static/range {v8 .. v24}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object v15, v9

    move-object/from16 v14, v21

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v14, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v1}, Lic2/g;->b()Lic2/h;

    move-result-object v8

    if-nez v8, :cond_1a

    const v0, 0x543fe890

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    const/4 v9, 0x0

    invoke-virtual {v14, v9}, Lp1/q;->q(Z)V

    :goto_d
    const/4 v0, 0x1

    goto/16 :goto_10

    :cond_1a
    const v9, 0x543fe891

    invoke-virtual {v14, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lic2/g;->c()Z

    move-result v9

    and-int/lit16 v10, v0, 0x1c00

    const/16 v11, 0x800

    if-ne v10, v11, :cond_1b

    const/4 v13, 0x1

    goto :goto_e

    :cond_1b
    const/4 v13, 0x0

    :goto_e
    invoke-virtual {v14, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v10, v13

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v10, v11

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_1c

    if-ne v11, v5, :cond_1d

    :cond_1c
    new-instance v11, Lep1/g;

    const/16 v10, 0x1b

    invoke-direct {v11, v4, v8, v1, v10}, Lep1/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v14, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    move-object v10, v11

    check-cast v10, Lkotlin/jvm/functions/Function1;

    sget v12, Lcom/whoop/design/util/TextResource;->$stable:I

    const/4 v13, 0x0

    move-object v11, v14

    invoke-static/range {v8 .. v13}, Lic2/f;->y(Lic2/h;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v14, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v10, Lcom/whoop/design/util/TextResource$b;

    sget v2, Lea2/s;->K:I

    const/4 v3, 0x0

    invoke-direct {v10, v2, v3, v7, v3}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Ly71/g;

    invoke-static/range {v27 .. v27}, Lih0/d0;->E(Lx81/d;)I

    move-result v2

    invoke-direct {v12, v2, v3, v7, v3}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/high16 v2, 0x70000

    and-int/2addr v0, v2

    const/high16 v8, 0x20000

    if-ne v0, v8, :cond_1e

    const/4 v13, 0x1

    goto :goto_f

    :cond_1e
    const/4 v13, 0x0

    :goto_f
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v13, :cond_1f

    if-ne v0, v5, :cond_20

    :cond_1f
    new-instance v0, Lh0/l0;

    const/16 v2, 0x8

    invoke-direct {v0, v6, v2}, Lh0/l0;-><init>(Lc93/a;I)V

    invoke-virtual {v14, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    move-object/from16 v20, v0

    check-cast v20, Lkotlin/jvm/functions/Function1;

    or-int/lit8 v0, p6, 0x30

    or-int v22, v0, v28

    const/16 v23, 0x0

    const/16 v24, 0xfe9

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-object/from16 v21, v14

    const/4 v14, 0x0

    move-object v9, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v8 .. v24}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v21

    const/4 v9, 0x0

    invoke-virtual {v14, v9}, Lp1/q;->q(Z)V

    goto/16 :goto_d

    :goto_10
    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_21
    move-object v14, v11

    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_11
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_22

    new-instance v0, Lbe1/f;

    const/4 v8, 0x7

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lbe1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_22
    return-void
.end method

.method private static final s(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lc93/m;Ljava/lang/String;Z)Ll83/a0;
    .locals 1

    const-string v0, "namespace"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-interface {p0, p1, p2}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lc93/a;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lkotlin/jvm/functions/Function3;Lic2/h;Lic2/g;Z)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lic2/h;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lic2/g;->c()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    invoke-interface {p0, p1, p2, p3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lc93/a;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lic2/g;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p6, p6, 0x1

    invoke-static {p6}, Lp1/x;->L(I)I

    move-result v7

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p7

    invoke-static/range {v0 .. v7}, Lic2/f;->r(Lic2/g;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lic2/h;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lic2/h;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v4, p4

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v0, -0x72c9f0a8

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v3, 0x2

    if-nez v0, :cond_2

    and-int/lit8 v0, v4, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    move v0, v3

    :goto_1
    or-int/2addr v0, v4

    goto :goto_2

    :cond_2
    move v0, v4

    :goto_2
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v14, v2}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v0, v5

    :cond_4
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v6, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v14, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v0, v7

    :goto_5
    and-int/lit16 v7, v0, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x1

    if-eq v7, v8, :cond_8

    move v7, v9

    goto :goto_6

    :cond_8
    const/4 v7, 0x0

    :goto_6
    and-int/2addr v0, v9

    invoke-virtual {v14, v0, v7}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_e

    if-eqz v5, :cond_a

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v0, v5, :cond_9

    new-instance v0, Lib0/c;

    const/4 v5, 0x4

    invoke-direct {v0, v5}, Lib0/c;-><init>(I)V

    invoke-virtual {v14, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v0, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_a
    move-object v0, v6

    :goto_7
    const/high16 v5, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v7, v3

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v7, v8

    const/4 v8, 0x0

    invoke-static {v5, v7, v8, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v10, Ll0/m;->g:Ll0/h;

    sget-object v11, Lb2/e;->K:Lb2/l;

    const/16 v12, 0x36

    invoke-static {v10, v11, v14, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v10

    iget-wide v11, v14, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v14, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v15, v14, Lp1/q;->S:Z

    if-eqz v15, :cond_b

    invoke-virtual {v14, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_8
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v14, v13, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v14, v10, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v12, v14, Lp1/q;->S:Z

    if-nez v12, :cond_c

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_d

    :cond_c
    invoke-static {v11, v14, v11, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v14, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lic2/h;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v5, v14, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v11, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v11, v14, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v15

    invoke-virtual {v11, v14, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->r()Lb91/a;

    move-result-object v25

    sget v13, Lb91/a;->d:I

    shl-int/lit8 v29, v13, 0x12

    const v30, 0x2fffa

    move-object v13, v6

    const/4 v6, 0x0

    move/from16 v18, v9

    move/from16 v17, v10

    const-wide/16 v9, 0x0

    move-object/from16 v19, v11

    const/4 v11, 0x0

    move/from16 v20, v12

    const/4 v12, 0x0

    move-object/from16 v21, v13

    const/4 v13, 0x0

    move/from16 v22, v8

    move-object/from16 v27, v14

    move-wide/from16 v40, v15

    move/from16 v16, v7

    move-wide/from16 v7, v40

    const-wide/16 v14, 0x0

    move/from16 v23, v16

    const/16 v16, 0x0

    move/from16 v24, v17

    const/16 v17, 0x0

    move/from16 v28, v18

    move-object/from16 v26, v19

    const-wide/16 v18, 0x0

    move/from16 v31, v20

    const/16 v20, 0x0

    move-object/from16 v32, v21

    const/16 v21, 0x0

    move/from16 v33, v22

    const/16 v22, 0x0

    move/from16 v34, v23

    const/16 v23, 0x0

    move/from16 v35, v24

    const/16 v24, 0x0

    move-object/from16 v36, v26

    const/16 v26, 0x0

    move/from16 v37, v28

    const/16 v28, 0x0

    move/from16 v4, v31

    move-object/from16 v39, v32

    move/from16 v38, v35

    move-object/from16 v3, v36

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v27

    invoke-virtual {v3, v14, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->a()J

    move-result-wide v7

    new-instance v5, La31/c;

    const/4 v6, 0x7

    invoke-direct {v5, v1, v2, v0, v6}, La31/c;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    const v6, 0x4ae9fa6d    # 7666998.5f

    invoke-static {v6, v14, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const/16 v15, 0x6000

    const/16 v16, 0xd

    const-wide/16 v5, 0x0

    const-wide/16 v11, 0x0

    invoke-static/range {v5 .. v16}, Ly81/c;->b(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V

    const/4 v5, 0x1

    invoke-virtual {v14, v5}, Lp1/q;->q(Z)V

    move/from16 v7, v34

    move-object/from16 v13, v39

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-static {v13, v7, v5, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v1}, Lic2/h;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    move/from16 v7, v38

    invoke-static {v5, v14, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v14, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->b1()J

    move-result-wide v7

    invoke-virtual {v3, v14, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->b()Lb91/a;

    move-result-object v25

    const/16 v28, 0x30

    const v30, 0x2fff8

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object v3, v0

    goto :goto_9

    :cond_e
    move-object/from16 v27, v14

    invoke-virtual/range {v27 .. v27}, Lp1/q;->X()V

    move-object v3, v6

    :goto_9
    invoke-virtual/range {v27 .. v27}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_f

    new-instance v0, Lbg0/h;

    const/16 v6, 0xa

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lbg0/h;-><init>(Ljava/lang/Object;ZLjava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final z(Z)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
