.class public abstract Ll72/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001ac\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00040\u00022\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a/\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00102\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0013H\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a!\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0013H\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001a?\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\u000e\u0008\u0002\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u001c2\u000e\u0008\u0002\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u001cH\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Lj72/a;",
        "viewState",
        "Lkotlin/Function1;",
        "Lj72/h;",
        "Ll83/a0;",
        "onViewEvent",
        "La72/a;",
        "onAnalyticsEvent",
        "Li72/a;",
        "onNavigationEvent",
        "",
        "openedFromSageScreen",
        "w",
        "(Lj72/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V",
        "",
        "title",
        "",
        "Lj72/a$a;",
        "guidelines",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "u",
        "(Ljava/lang/String;Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "guidelineState",
        "s",
        "(Lj72/a$a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "primaryButtonText",
        "secondaryButtonText",
        "Lkotlin/Function0;",
        "onPrimaryButtonClick",
        "onSecondaryButtonClick",
        "o",
        "(Ljava/lang/String;Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "sage_release"
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
.method private static final A(Lkotlin/jvm/functions/Function1;Lj72/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 2

    new-instance v0, La72/a$h;

    invoke-virtual {p1}, Lj72/a;->e()Lj72/g;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    const-string v1, "back_button"

    invoke-direct {v0, p1, v1}, La72/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lj72/h$a;->a:Lj72/h$a;

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lkotlin/jvm/functions/Function1;Lj72/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 2

    new-instance v0, La72/a$h;

    invoke-virtual {p1}, Lj72/a;->e()Lj72/g;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    const-string v1, "cancel"

    invoke-direct {v0, p1, v1}, La72/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Li72/a$a;->a:Li72/a$a;

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lkotlin/jvm/functions/Function1;Lj72/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 6

    new-instance v0, La72/a$h;

    invoke-virtual {p1}, Lj72/a;->e()Lj72/g;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    const-string v2, "calibrate_proceed"

    invoke-direct {v0, v1, v2}, La72/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lj72/h$d;

    invoke-virtual {p1}, Lj72/a;->c()Lj72/g;

    move-result-object p1

    new-instance v0, Lg72/f;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lg72/f;-><init>(Ljava/util/Map;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, p1, v0}, Lj72/h$d;-><init>(Lj72/g;Lg72/f;)V

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lj72/a;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 2

    invoke-virtual {p0}, Lj72/a;->f()Lcom/whoop/navigation/e;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance p2, La72/a$h;

    invoke-virtual {p0}, Lj72/a;->e()Lj72/g;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    const-string v1, "calibrate_exit"

    invoke-direct {p2, p0, v1}, La72/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p3, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Li72/a$e;

    const/4 p2, 0x0

    invoke-direct {p0, v0, p2}, Li72/a$e;-><init>(Lcom/whoop/navigation/e;Z)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p0, Li72/a$d;

    invoke-direct {p0, p2}, Li72/a$d;-><init>(Z)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lj72/h$a;->a:Lj72/h$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lj72/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Ll72/c;->w(Lj72/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lj72/a;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ll72/c;->D(Lj72/a;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Ll72/c;->q()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ll72/c;->E(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lj72/h;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ll72/c;->x(Lj72/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/String;Ljava/util/List;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ll72/c;->v(Ljava/lang/String;Ljava/util/List;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lj72/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Ll72/c;->F(Lj72/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Li72/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ll72/c;->z(Li72/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lj72/a$a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ll72/c;->t(Lj72/a$a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ljava/lang/String;Ljava/lang/String;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Ll72/c;->r(Ljava/lang/String;Ljava/lang/String;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lkotlin/jvm/functions/Function1;Lj72/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ll72/c;->A(Lkotlin/jvm/functions/Function1;Lj72/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;Lj72/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ll72/c;->B(Lkotlin/jvm/functions/Function1;Lj72/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l()Ll83/a0;
    .locals 1

    invoke-static {}, Ll72/c;->p()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic m(La72/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ll72/c;->y(La72/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Lj72/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ll72/c;->C(Lkotlin/jvm/functions/Function1;Lj72/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Ljava/lang/String;Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v5, p5

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v1, 0x39f9cbda

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v5, 0x6

    const/4 v3, 0x4

    if-nez v1, :cond_1

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v5

    goto :goto_1

    :cond_1
    move-object/from16 v1, p0

    move v4, v5

    :goto_1
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    goto :goto_3

    :cond_3
    move-object/from16 v6, p1

    :goto_3
    and-int/lit8 v7, p6, 0x4

    if-eqz v7, :cond_5

    or-int/lit16 v4, v4, 0x180

    :cond_4
    move-object/from16 v8, p2

    goto :goto_5

    :cond_5
    and-int/lit16 v8, v5, 0x180

    if-nez v8, :cond_4

    move-object/from16 v8, p2

    invoke-virtual {v0, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x100

    goto :goto_4

    :cond_6
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v4, v9

    :goto_5
    and-int/lit8 v9, p6, 0x8

    if-eqz v9, :cond_8

    or-int/lit16 v4, v4, 0xc00

    :cond_7
    move-object/from16 v10, p3

    goto :goto_7

    :cond_8
    and-int/lit16 v10, v5, 0xc00

    if-nez v10, :cond_7

    move-object/from16 v10, p3

    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    const/16 v11, 0x800

    goto :goto_6

    :cond_9
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v4, v11

    :goto_7
    and-int/lit16 v11, v4, 0x493

    const/16 v12, 0x492

    const/4 v13, 0x0

    if-eq v11, v12, :cond_a

    const/4 v11, 0x1

    goto :goto_8

    :cond_a
    move v11, v13

    :goto_8
    and-int/lit8 v12, v4, 0x1

    invoke-virtual {v0, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_12

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_c

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v11, :cond_b

    new-instance v7, Ll1/f0;

    const/16 v8, 0x1c

    invoke-direct {v7, v8}, Ll1/f0;-><init>(I)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v7, Lc93/a;

    move-object/from16 v19, v7

    goto :goto_9

    :cond_c
    move-object/from16 v19, v8

    :goto_9
    if-eqz v9, :cond_e

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v11, :cond_d

    new-instance v7, Ll1/f0;

    const/16 v8, 0x1b

    invoke-direct {v7, v8}, Ll1/f0;-><init>(I)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v7, Lc93/a;

    move-object/from16 v24, v7

    goto :goto_a

    :cond_e
    move-object/from16 v24, v10

    :goto_a
    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v11, 0x3

    invoke-static {v9, v10, v11}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v25

    const-wide/high16 v14, 0x4004000000000000L    # 2.5

    double-to-float v9, v14

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float v27, v9, v12

    int-to-float v3, v3

    mul-float v29, v3, v12

    const/16 v30, 0x5

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v25 .. v30}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move/from16 v9, v27

    sget-object v14, Ll0/m;->c:Ll0/g;

    sget-object v15, Lb2/e;->M:Lb2/k;

    invoke-static {v14, v15, v0, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v13

    iget-wide v14, v0, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v0, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-eqz v10, :cond_f

    invoke-virtual {v0, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_f
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_b
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v0, v2, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v0, v2, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-nez v10, :cond_10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v10, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_11

    :cond_10
    invoke-static {v14, v0, v14, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v0, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3, v11}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v10, 0x0

    const/4 v13, 0x2

    invoke-static {v2, v9, v10, v13}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move v10, v12

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    sget v25, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v13, v25, 0x12

    or-int/lit8 v21, v13, 0x6

    shl-int/lit8 v13, v4, 0x3

    and-int/lit16 v13, v13, 0x1c00

    const/16 v23, 0x1fbe

    move v14, v7

    const/4 v7, 0x0

    move-object v15, v8

    const/4 v8, 0x0

    move/from16 v27, v9

    const/4 v9, 0x0

    move/from16 v16, v10

    const/4 v10, 0x0

    move/from16 v17, v11

    const/4 v11, 0x0

    move/from16 v22, v13

    const/4 v13, 0x0

    move/from16 v18, v14

    const/4 v14, 0x0

    move-object/from16 v20, v15

    const/4 v15, 0x0

    move/from16 v26, v16

    const/16 v16, 0x0

    move/from16 v28, v17

    const/16 v17, 0x0

    move/from16 v29, v18

    const/16 v18, 0x0

    move-object v6, v2

    move-object/from16 v2, v20

    move-object/from16 v20, v0

    move/from16 v0, v29

    invoke-static/range {v6 .. v23}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v21, v19

    move-object/from16 v17, v20

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v2, 0x3

    invoke-static {v0, v3, v2}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    double-to-float v2, v2

    mul-float v28, v2, v26

    const/16 v30, 0x0

    const/16 v31, 0x8

    move/from16 v29, v27

    move-object/from16 v26, v0

    invoke-static/range {v26 .. v31}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static/range {p1 .. p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    shl-int/lit8 v18, v25, 0x6

    shr-int/lit8 v0, v4, 0x9

    and-int/lit8 v19, v0, 0xe

    const/16 v20, 0x3fa

    const/4 v12, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v24

    invoke-static/range {v6 .. v20}, Lny0/o0;->b(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v17

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    move-object/from16 v4, v16

    move-object/from16 v3, v21

    goto :goto_c

    :cond_12
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v3, v8

    move-object v4, v10

    :goto_c
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_13

    new-instance v0, Lkw1/c;

    const/4 v7, 0x2

    move-object/from16 v2, p1

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lkw1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ll83/e;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final p()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final q()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final r(Ljava/lang/String;Ljava/lang/String;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Ll72/c;->o(Ljava/lang/String;Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lj72/a$a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 32

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v2, 0x18fad68e

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p3, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-nez v2, :cond_2

    and-int/lit8 v2, p3, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    or-int v2, p3, v2

    goto :goto_2

    :cond_2
    move/from16 v2, p3

    :goto_2
    and-int/lit8 v5, p4, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_3

    :cond_5
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v2, v7

    :goto_4
    and-int/lit8 v7, v2, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v7, v8, :cond_6

    move v7, v10

    goto :goto_5

    :cond_6
    move v7, v9

    :goto_5
    and-int/2addr v2, v10

    invoke-virtual {v0, v2, v7}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_d

    sget-object v2, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_7

    move-object v5, v2

    goto :goto_6

    :cond_7
    move-object v5, v6

    :goto_6
    sget-object v6, Lb2/e;->K:Lb2/l;

    sget-object v7, Ll0/m;->a:Ll0/e;

    const/16 v11, 0x30

    invoke-static {v7, v6, v0, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v11, v0, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v0, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-eqz v15, :cond_8

    invoke-virtual {v0, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_8
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_7
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v0, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v0, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-nez v12, :cond_9

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_a

    :cond_9
    invoke-static {v11, v0, v11, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v0, v7, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide/high16 v11, 0x3fe0000000000000L    # 0.5

    double-to-float v7, v11

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float/2addr v7, v11

    invoke-static {v7, v2}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v0, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v1}, Lj72/a$a;->b()Lhy0/c2;

    move-result-object v12

    const-wide/high16 v13, 0x4004000000000000L    # 2.5

    double-to-float v7, v13

    int-to-float v3, v3

    mul-float v23, v7, v3

    const-wide/high16 v13, 0x3fec000000000000L    # 0.875

    double-to-float v3, v13

    mul-float/2addr v3, v11

    new-instance v7, Ll0/l1;

    invoke-direct {v7, v3, v3, v3, v3}, Ll0/l1;-><init>(FFFF)V

    const/16 v28, 0x3bfe

    const/16 v29, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move-object/from16 v27, v7

    invoke-static/range {v12 .. v29}, Lhy0/c2;->b(Lhy0/c2;Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;Lhy0/s0;ZZIIFLcom/whoop/navigation/e;Ljava/lang/Float;FLl0/k1;ILjava/lang/Object;)Lhy0/c2;

    move-result-object v3

    sget v7, Lhy0/c2;->p:I

    invoke-static {v3, v0, v7}, Lhy0/z1;->c(Lhy0/c2;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v1}, Lj72/a$a;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0, v9}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v7, v0, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v13

    invoke-virtual {v7, v0, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    const/4 v7, 0x3

    const/4 v12, 0x0

    invoke-static {v2, v12, v7}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    int-to-float v2, v4

    mul-float v16, v2, v11

    const/16 v19, 0x0

    const/16 v20, 0xe

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v4, Landroidx/compose/foundation/layout/VerticalAlignElement;

    invoke-direct {v4, v6}, Landroidx/compose/foundation/layout/VerticalAlignElement;-><init>(Lb2/l;)V

    invoke-interface {v2, v4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    float-to-double v11, v7

    const-wide/16 v15, 0x0

    cmpl-double v4, v11, v15

    if-lez v4, :cond_b

    move v9, v10

    :cond_b
    if-nez v9, :cond_c

    const-string v4, "invalid weight; must be greater than zero"

    invoke-static {v4}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_c
    invoke-static {v2, v10, v7}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v26, v4, 0x12

    const v27, 0x2fff8

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v4, v10

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    move v15, v4

    move-wide/from16 v30, v13

    move-object v14, v5

    move-wide/from16 v4, v30

    const/4 v13, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move/from16 v18, v15

    move-object/from16 v17, v16

    const-wide/16 v15, 0x0

    move-object/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    move-object/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v23, v20

    const/16 v20, 0x0

    move-object/from16 v24, v21

    const/16 v21, 0x0

    move/from16 v25, v23

    const/16 v23, 0x0

    move/from16 v28, v25

    const/16 v25, 0x0

    move-object/from16 p1, v3

    move-object v3, v2

    move-object/from16 v2, p1

    move-object/from16 p1, v24

    move-object/from16 v24, v0

    move/from16 v0, v28

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    move-object/from16 v3, p1

    goto :goto_8

    :cond_d
    move-object v2, v0

    invoke-virtual {v2}, Lp1/q;->X()V

    move-object v3, v6

    :goto_8
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Lio2/k0;

    const/16 v5, 0xf

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lio2/k0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final t(Lj72/a$a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ll72/c;->s(Lj72/a$a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Ljava/lang/String;Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lj72/a$a;",
            ">;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v1, 0x38ba4ef3

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v4, 0x6

    if-nez v1, :cond_1

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v4

    goto :goto_1

    :cond_1
    move-object/from16 v1, p0

    move v6, v4

    :goto_1
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_3
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_5

    or-int/lit16 v6, v6, 0x180

    :cond_4
    move-object/from16 v8, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_4

    move-object/from16 v8, p2

    invoke-virtual {v0, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x100

    goto :goto_3

    :cond_6
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v6, v9

    :goto_4
    and-int/lit16 v9, v6, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eq v9, v10, :cond_7

    move v9, v11

    goto :goto_5

    :cond_7
    move v9, v12

    :goto_5
    and-int/lit8 v10, v6, 0x1

    invoke-virtual {v0, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_d

    sget-object v9, Lb2/t;->w:Lb2/t;

    if-eqz v7, :cond_8

    move-object v7, v9

    goto :goto_6

    :cond_8
    move-object v7, v8

    :goto_6
    const/4 v8, 0x0

    const/4 v10, 0x3

    invoke-static {v9, v8, v10}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-interface {v13, v7}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, Ll0/m;->c:Ll0/g;

    sget-object v15, Lb2/e;->M:Lb2/k;

    invoke-static {v14, v15, v0, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v14

    move v15, v6

    iget-wide v5, v0, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v0, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v3, v0, Lp1/q;->S:Z

    if-eqz v3, :cond_9

    invoke-virtual {v0, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_7
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v0, v3, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v0, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v0, Lp1/q;->S:Z

    if-nez v6, :cond_a

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v6, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_b

    :cond_a
    invoke-static {v5, v0, v5, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v0, v3, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v3, v0, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v12

    invoke-virtual {v3, v0, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->O()Lb91/a;

    move-result-object v25

    invoke-static {v9, v8, v10}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v17

    int-to-float v3, v11

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float v21, v3, v5

    const/16 v22, 0x7

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move/from16 v3, v21

    and-int/lit8 v8, v15, 0xe

    or-int/lit8 v28, v8, 0x30

    sget v8, Lb91/a;->d:I

    shl-int/lit8 v29, v8, 0x12

    const v30, 0x2fff8

    move-object v8, v9

    const-wide/16 v9, 0x0

    move v14, v11

    const/4 v11, 0x0

    move-object v15, v8

    move-wide/from16 v34, v12

    move-object v13, v7

    move-wide/from16 v7, v34

    const/4 v12, 0x0

    move-object/from16 v17, v13

    const/4 v13, 0x0

    move/from16 v19, v14

    move-object/from16 v18, v15

    const-wide/16 v14, 0x0

    const/16 v20, 0x0

    const/16 v16, 0x0

    move-object/from16 v21, v17

    const/16 v17, 0x0

    move-object/from16 v22, v18

    move/from16 v23, v19

    const-wide/16 v18, 0x0

    move/from16 v24, v20

    const/16 v20, 0x0

    move-object/from16 v26, v21

    const/16 v21, 0x0

    move-object/from16 v27, v22

    const/16 v22, 0x0

    move/from16 v31, v23

    const/16 v23, 0x0

    move/from16 v32, v24

    const/16 v24, 0x0

    move-object/from16 v33, v26

    const/16 v26, 0x0

    move/from16 p2, v5

    move-object v5, v1

    move-object/from16 v1, v27

    move-object/from16 v27, v0

    const/4 v0, 0x4

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    const v6, -0x785ba9ea

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    move-object v6, v2

    check-cast v6, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v6, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lj72/a$a;

    const/16 v17, 0x0

    const/16 v18, 0xd

    const/4 v14, 0x0

    const/16 v16, 0x0

    move-object v13, v1

    move v15, v3

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v27, v13

    int-to-float v3, v0

    mul-float v3, v3, p2

    const/4 v9, 0x0

    const/4 v10, 0x2

    invoke-static {v1, v3, v9, v10}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget v3, Lhy0/c2;->p:I

    or-int/lit8 v3, v3, 0x30

    const/4 v9, 0x0

    invoke-static {v8, v1, v5, v3, v9}, Ll72/c;->s(Lj72/a$a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v3, v15

    move-object/from16 v1, v27

    goto :goto_8

    :cond_c
    const/4 v9, 0x0

    invoke-virtual {v5, v9}, Lp1/q;->q(Z)V

    const/4 v14, 0x1

    invoke-virtual {v5, v14}, Lp1/q;->q(Z)V

    move-object/from16 v3, v33

    goto :goto_9

    :cond_d
    move-object v5, v0

    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v3, v8

    :goto_9
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Le81/i;

    move-object/from16 v1, p0

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Le81/i;-><init>(Ljava/lang/String;Ljava/util/List;Landroidx/compose/ui/Modifier;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final v(Ljava/lang/String;Ljava/util/List;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Ll72/c;->u(Ljava/lang/String;Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final w(Lj72/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj72/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Z",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v6, p6

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p5

    check-cast v10, Lp1/q;

    const v0, -0x5abd3fb8

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v2, p7, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v6, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :goto_3
    and-int/lit8 v5, p7, 0x4

    const/16 v13, 0x100

    if-eqz v5, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v7, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v10, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    move v8, v13

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v0, v8

    :goto_5
    and-int/lit8 v8, p7, 0x8

    if-eqz v8, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move-object/from16 v9, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v9, v6, 0xc00

    if-nez v9, :cond_8

    move-object/from16 v9, p3

    invoke-virtual {v10, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_6

    :cond_a
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v0, v11

    :goto_7
    and-int/lit8 v11, p7, 0x10

    if-eqz v11, :cond_c

    or-int/lit16 v0, v0, 0x6000

    :cond_b
    move/from16 v12, p4

    goto :goto_9

    :cond_c
    and-int/lit16 v12, v6, 0x6000

    if-nez v12, :cond_b

    move/from16 v12, p4

    invoke-virtual {v10, v12}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_8

    :cond_d
    const/16 v16, 0x2000

    :goto_8
    or-int v0, v0, v16

    :goto_9
    and-int/lit16 v14, v0, 0x2493

    const/16 v15, 0x2492

    const/4 v3, 0x0

    move/from16 v17, v8

    if-eq v14, v15, :cond_e

    const/4 v14, 0x1

    goto :goto_a

    :cond_e
    move v14, v3

    :goto_a
    and-int/lit8 v15, v0, 0x1

    invoke-virtual {v10, v15, v14}, Lp1/q;->U(IZ)Z

    move-result v14

    if-eqz v14, :cond_38

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_10

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v14, :cond_f

    new-instance v2, Ll60/a;

    const/4 v4, 0x5

    invoke-direct {v2, v4}, Ll60/a;-><init>(I)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v2, Lkotlin/jvm/functions/Function1;

    goto :goto_b

    :cond_10
    move-object v2, v4

    :goto_b
    if-eqz v5, :cond_12

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v14, :cond_11

    new-instance v4, Ll60/a;

    const/4 v5, 0x6

    invoke-direct {v4, v5}, Ll60/a;-><init>(I)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_c

    :cond_12
    move-object v4, v7

    :goto_c
    if-eqz v17, :cond_14

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v14, :cond_13

    new-instance v5, Ll60/a;

    const/4 v7, 0x7

    invoke-direct {v5, v7}, Ll60/a;-><init>(I)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_d

    :cond_14
    move-object v5, v9

    :goto_d
    if-eqz v11, :cond_15

    move v15, v3

    goto :goto_e

    :cond_15
    move v15, v12

    :goto_e
    and-int/lit16 v7, v0, 0x380

    if-ne v7, v13, :cond_16

    const/4 v9, 0x1

    goto :goto_f

    :cond_16
    move v9, v3

    :goto_f
    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v9, v11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v9, :cond_17

    if-ne v11, v14, :cond_18

    :cond_17
    new-instance v11, Ll72/c$a;

    const/4 v9, 0x0

    invoke-direct {v11, v4, v1, v9}, Ll72/c$a;-><init>(Lkotlin/jvm/functions/Function1;Lj72/a;Lq83/d;)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v11, Lc93/m;

    invoke-static {v10, v11, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v9, 0x3f800000    # 1.0f

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v11}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-static {v12}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-static {v12}, Ll0/f;->n(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v8, Lb2/e;->w:Lb2/m;

    invoke-static {v8, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    move-object/from16 v19, v14

    iget-wide v13, v10, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v10, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v20, La3/l;->a:La3/k;

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 p1, v15

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_19

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_19
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_10
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v10, v9, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v10, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v3, v10, Lp1/q;->S:Z

    if-nez v3, :cond_1a

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1b

    :cond_1a
    invoke-static {v13, v10, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v10, v3, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move v6, v7

    invoke-virtual {v1}, Lj72/a;->a()Lkd1/o;

    move-result-object v7

    if-nez v7, :cond_1c

    const v7, -0x70f5f53b    # -6.8059994E-30f

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    const/4 v7, 0x0

    invoke-virtual {v10, v7}, Lp1/q;->q(Z)V

    move/from16 v32, p1

    move-object/from16 v21, v2

    move-object/from16 v22, v4

    move-object/from16 v18, v5

    move/from16 v24, v6

    move-object/from16 v25, v8

    move-object v6, v9

    move-object v4, v11

    move-object v5, v15

    move-object/from16 v33, v19

    const/high16 v2, 0x3f800000    # 1.0f

    move/from16 v19, v0

    move-object v0, v14

    goto/16 :goto_11

    :cond_1c
    const v12, -0x70f5f53a    # -6.806E-30f

    invoke-virtual {v10, v12}, Lp1/q;->e0(I)V

    move-object v12, v11

    sget v11, Lkd1/o;->a:I

    move-object/from16 v21, v12

    const/4 v12, 0x3

    move-object/from16 v22, v8

    const/4 v8, 0x0

    move-object/from16 v23, v9

    const/4 v9, 0x0

    move/from16 v24, v6

    move-object/from16 p2, v15

    move-object/from16 v13, v21

    move-object/from16 v25, v22

    move-object/from16 v6, v23

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static/range {v7 .. v12}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v7

    invoke-static {v15, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v26

    const/4 v8, 0x3

    int-to-float v8, v8

    const/16 v9, 0x8

    int-to-float v11, v9

    mul-float v28, v8, v11

    const/16 v30, 0x0

    const/16 v31, 0xd

    const/16 v27, 0x0

    const/16 v29, 0x0

    invoke-static/range {v26 .. v31}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move v11, v15

    const/16 v15, 0x61b0

    const/16 v12, 0x4000

    const/16 v16, 0x68

    move/from16 v21, v9

    move-object v9, v8

    const/4 v8, 0x0

    move-object/from16 v22, v14

    move-object v14, v10

    const/4 v10, 0x0

    move/from16 v23, v11

    sget-object v11, Ly2/j;->d:Ly2/b1;

    move/from16 v26, v12

    const/4 v12, 0x0

    move-object/from16 v27, v13

    const/4 v13, 0x0

    move/from16 v32, p1

    move-object/from16 v21, v2

    move-object/from16 v18, v5

    move-object/from16 v33, v19

    move/from16 v2, v23

    move-object/from16 v5, p2

    move/from16 v19, v0

    move-object/from16 v0, v22

    move-object/from16 v22, v4

    move-object/from16 v4, v27

    invoke-static/range {v7 .. v16}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v14

    const/4 v7, 0x0

    invoke-virtual {v10, v7}, Lp1/q;->q(Z)V

    :goto_11
    sget-object v7, Ll0/m;->d:Ll0/g;

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Lb2/e;->M:Lb2/k;

    const/4 v11, 0x6

    invoke-static {v7, v9, v10, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v12, v10, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v10, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v14, v10, Lp1/q;->S:Z

    if-eqz v14, :cond_1d

    invoke-virtual {v10, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_1d
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_12
    invoke-static {v10, v6, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v7, v25

    invoke-static {v10, v7, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-nez v13, :cond_1e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_1f

    :cond_1e
    invoke-static {v12, v10, v12, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1f
    invoke-static {v10, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, Ll0/m;->g:Ll0/h;

    float-to-double v12, v2

    const-wide/16 v14, 0x0

    cmpl-double v12, v12, v14

    if-lez v12, :cond_20

    goto :goto_13

    :cond_20
    const-string v12, "invalid weight; must be greater than zero"

    invoke-static {v12}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_13
    new-instance v12, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v13, 0x1

    invoke-direct {v12, v2, v13}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v8, v9, v10, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v8, v10, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v10, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-eqz v12, :cond_21

    invoke-virtual {v10, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_14

    :cond_21
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_14
    invoke-static {v10, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-nez v2, :cond_22

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_23

    :cond_22
    invoke-static {v8, v10, v8, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_23
    invoke-static {v10, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move/from16 v6, v24

    const/16 v0, 0x100

    if-ne v6, v0, :cond_24

    const/4 v8, 0x1

    goto :goto_15

    :cond_24
    const/4 v8, 0x0

    :goto_15
    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v2, v8

    and-int/lit8 v3, v19, 0x70

    const/16 v5, 0x20

    if-ne v3, v5, :cond_25

    const/4 v8, 0x1

    goto :goto_16

    :cond_25
    const/4 v8, 0x0

    :goto_16
    or-int/2addr v2, v8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_27

    move-object/from16 v2, v33

    if-ne v5, v2, :cond_26

    goto :goto_17

    :cond_26
    move-object/from16 v14, v21

    move-object/from16 v15, v22

    goto :goto_18

    :cond_27
    move-object/from16 v2, v33

    :goto_17
    new-instance v5, Ll72/b;

    const/4 v7, 0x0

    move-object/from16 v14, v21

    move-object/from16 v15, v22

    invoke-direct {v5, v15, v1, v14, v7}, Ll72/b;-><init>(Lkotlin/jvm/functions/Function1;Lj72/a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_18
    check-cast v5, Lc93/a;

    if-ne v6, v0, :cond_28

    const/4 v8, 0x1

    goto :goto_19

    :cond_28
    const/4 v8, 0x0

    :goto_19
    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v7, v8

    move/from16 v13, v19

    and-int/lit16 v8, v13, 0x1c00

    const/16 v9, 0x800

    if-ne v8, v9, :cond_29

    const/4 v11, 0x1

    goto :goto_1a

    :cond_29
    const/4 v11, 0x0

    :goto_1a
    or-int/2addr v7, v11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v7, :cond_2b

    if-ne v11, v2, :cond_2a

    goto :goto_1b

    :cond_2a
    move-object/from16 v12, v18

    goto :goto_1c

    :cond_2b
    :goto_1b
    new-instance v11, Ll72/b;

    const/4 v7, 0x1

    move-object/from16 v12, v18

    invoke-direct {v11, v15, v1, v12, v7}, Ll72/b;-><init>(Lkotlin/jvm/functions/Function1;Lj72/a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1c
    check-cast v11, Lc93/a;

    const/4 v7, 0x0

    invoke-static {v5, v11, v10, v7, v7}, Ll72/o;->l0(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v1}, Lj72/a;->h()Ljava/lang/String;

    move-result-object v7

    move v5, v8

    invoke-virtual {v1}, Lj72/a;->b()Ljava/util/List;

    move-result-object v8

    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    const/4 v11, 0x1

    int-to-float v9, v11

    mul-float/2addr v9, v1

    move-object/from16 v16, v12

    const-wide/high16 v11, 0x4004000000000000L    # 2.5

    double-to-float v11, v11

    mul-float/2addr v11, v1

    invoke-static {v4, v11, v0, v11, v9}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v11, 0x1

    invoke-static {v1, v10, v11}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v4

    const/16 v1, 0xe

    invoke-static {v0, v4, v1}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move/from16 v17, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    move v0, v5

    move-object/from16 v5, v16

    move/from16 v4, v17

    const/16 v1, 0x800

    invoke-static/range {v7 .. v12}, Ll72/c;->u(Ljava/lang/String;Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lj72/a;->d()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lj72/a;->g()Ljava/lang/String;

    move-result-object v8

    const/16 v4, 0x100

    if-ne v6, v4, :cond_2c

    const/4 v4, 0x1

    :goto_1d
    move-object/from16 v9, p0

    goto :goto_1e

    :cond_2c
    const/4 v4, 0x0

    goto :goto_1d

    :goto_1e
    invoke-virtual {v10, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v4, v11

    const/16 v11, 0x20

    if-ne v3, v11, :cond_2d

    const/4 v11, 0x1

    goto :goto_1f

    :cond_2d
    const/4 v11, 0x0

    :goto_1f
    or-int/2addr v4, v11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v4, :cond_2e

    if-ne v11, v2, :cond_2f

    :cond_2e
    new-instance v11, Ll72/b;

    const/4 v4, 0x2

    invoke-direct {v11, v15, v9, v14, v4}, Ll72/b;-><init>(Lkotlin/jvm/functions/Function1;Lj72/a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2f
    check-cast v11, Lc93/a;

    invoke-virtual {v10, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    const/16 v12, 0x100

    if-ne v6, v12, :cond_30

    const/4 v6, 0x1

    goto :goto_20

    :cond_30
    const/4 v6, 0x0

    :goto_20
    or-int/2addr v4, v6

    if-ne v0, v1, :cond_31

    const/4 v0, 0x1

    goto :goto_21

    :cond_31
    const/4 v0, 0x0

    :goto_21
    or-int/2addr v0, v4

    const v1, 0xe000

    and-int/2addr v1, v13

    const/16 v12, 0x4000

    if-ne v1, v12, :cond_32

    const/4 v1, 0x1

    goto :goto_22

    :cond_32
    const/4 v1, 0x0

    :goto_22
    or-int/2addr v0, v1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_34

    if-ne v1, v2, :cond_33

    goto :goto_23

    :cond_33
    move/from16 v0, v32

    goto :goto_24

    :cond_34
    :goto_23
    new-instance v1, Ldn0/k;

    move/from16 v0, v32

    invoke-direct {v1, v9, v5, v0, v15}, Ldn0/k;-><init>(Lj72/a;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_24
    check-cast v1, Lc93/a;

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v9, v11

    move-object v11, v10

    move-object v10, v1

    invoke-static/range {v7 .. v13}, Ll72/c;->o(Ljava/lang/String;Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v11

    const/4 v11, 0x1

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    const/16 v11, 0x20

    if-ne v3, v11, :cond_35

    const/4 v8, 0x1

    goto :goto_25

    :cond_35
    const/4 v8, 0x0

    :goto_25
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v8, :cond_36

    if-ne v1, v2, :cond_37

    :cond_36
    new-instance v1, Lky2/a;

    const/16 v2, 0xc

    invoke-direct {v1, v14, v2}, Lky2/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_37
    check-cast v1, Lc93/a;

    const/4 v7, 0x0

    const/4 v11, 0x1

    invoke-static {v1, v7, v10, v7, v11}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    move-object v4, v5

    move-object v2, v14

    move-object v3, v15

    move v5, v0

    goto :goto_26

    :cond_38
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v2, v4

    move-object v3, v7

    move-object v4, v9

    move v5, v12

    :goto_26
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_39

    new-instance v0, Lbf0/g;

    const/16 v8, 0x19

    move-object/from16 v1, p0

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lbf0/g;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZIII)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_39
    return-void
.end method

.method private static final x(Lj72/h;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(La72/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Li72/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
