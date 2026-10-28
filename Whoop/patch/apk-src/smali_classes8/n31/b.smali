.class public abstract Ln31/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aa\u0010\u000c\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00080\u00072\u0014\u0008\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00080\u0007H\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u0019\u0010\u0010\u001a\u00020\u00082\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0008H\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u001b\u0010\u0016\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a\'\u0010\u001b\u001a\u00020\u00082\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0019H\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ln31/e;",
        "viewState",
        "",
        "path",
        "searchQuery",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onSearchQueryChanged",
        "",
        "onEvent",
        "o",
        "(Landroidx/compose/ui/Modifier;Ln31/e;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lcom/whoop/design/util/TextResource;",
        "loadingHintText",
        "y",
        "(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V",
        "A",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Lg2/i;",
        "focusManager",
        "C",
        "(Landroidx/compose/ui/Modifier;Lg2/i;)Landroidx/compose/ui/Modifier;",
        "error",
        "Lkotlin/Function0;",
        "onDismiss",
        "m",
        "(Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "design_release"
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
.method private static final A(Landroidx/compose/runtime/Composer;I)V
    .locals 12

    move-object v9, p0

    check-cast v9, Lp1/q;

    const p0, -0x12c2f0cc

    invoke-virtual {v9, p0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    and-int/lit8 v0, p1, 0x1

    invoke-virtual {v9, v0, p0}, Lp1/q;->U(IZ)Z

    move-result p0

    if-eqz p0, :cond_1

    const/16 p0, 0x12

    int-to-float p0, p0

    const/4 v0, 0x4

    int-to-float v0, v0

    mul-float/2addr p0, v0

    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {p0, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget p0, Lgy0/e;->d:I

    invoke-static {p0}, Lv41/r0$d;->b(I)I

    move-result p0

    invoke-static {p0}, Lv41/r0$d;->a(I)Lv41/r0$d;

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

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lm22/t;

    const/4 v1, 0x4

    invoke-direct {v0, p1, v1}, Lm22/t;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final B(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Ln31/b;->A(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Landroidx/compose/ui/Modifier;Lg2/i;)Landroidx/compose/ui/Modifier;
    .locals 1

    new-instance v0, Ln31/b$d;

    invoke-direct {v0, p1}, Ln31/b$d;-><init>(Lg2/i;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-static {p0, p1, v0}, Lu2/c0;->b(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lcom/whoop/whoopaction/domain/models/Action;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Ln31/b;->w(Lcom/whoop/whoopaction/domain/models/Action;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ln31/b;->q(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ln31/b;->p(Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Ln31/b;->v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Ln31/b;->t(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Ln31/b;->u(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Ln31/b;->s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ln31/b;->B(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ln31/b;->z(Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Landroidx/compose/ui/Modifier;Ln31/e;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Ln31/b;->x(Landroidx/compose/ui/Modifier;Ln31/e;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ln31/b;->r(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lc93/a;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2, p3, p4}, Ln31/b;->n(Ljava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    check-cast p2, Lp1/q;

    const v0, 0x2b99ba57

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    const/16 v3, 0x20

    if-nez v2, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit8 v2, v0, 0x13

    const/16 v4, 0x12

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eq v2, v4, :cond_4

    move v2, v5

    goto :goto_3

    :cond_4
    move v2, v6

    :goto_3
    and-int/lit8 v4, v0, 0x1

    invoke-virtual {p2, v4, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_a

    sget-object v2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {p2, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    if-eqz p0, :cond_9

    const v4, -0x29826cc1

    invoke-virtual {p2, v4}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    and-int/lit8 v7, v0, 0xe

    if-ne v7, v1, :cond_5

    move v1, v5

    goto :goto_4

    :cond_5
    move v1, v6

    :goto_4
    or-int/2addr v1, v4

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v3, :cond_6

    goto :goto_5

    :cond_6
    move v5, v6

    :goto_5
    or-int v0, v1, v5

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_7

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_8

    :cond_7
    new-instance v1, Ln31/b$a;

    const/4 v0, 0x0

    invoke-direct {v1, v2, p0, p1, v0}, Ln31/b$a;-><init>(Landroid/content/Context;Ljava/lang/String;Lc93/a;Lq83/d;)V

    invoke-virtual {p2, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v1, Lc93/m;

    invoke-static {p2, v1, p0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p2, v6}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_9
    const v0, -0x297e7eb5

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v6}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_a
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_b

    new-instance v0, Lcp0/i;

    const/4 v1, 0x3

    invoke-direct {v0, p0, p1, p3, v1}, Lcp0/i;-><init>(Ljava/lang/String;Lc93/a;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final n(Ljava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Ln31/b;->m(Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final o(Landroidx/compose/ui/Modifier;Ln31/e;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 57
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ln31/e;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v7, p7

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p6

    check-cast v11, Lp1/q;

    const v0, -0x302feaea

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p8, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v7, 0x6

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v7, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v7

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v3, v7

    :goto_1
    and-int/lit8 v4, v7, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, p8, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v8, v7, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v11, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_3

    :cond_7
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v3, v9

    :goto_4
    and-int/lit8 v9, p8, 0x8

    if-eqz v9, :cond_9

    or-int/lit16 v3, v3, 0xc00

    :cond_8
    move-object/from16 v10, p3

    goto :goto_6

    :cond_9
    and-int/lit16 v10, v7, 0xc00

    if-nez v10, :cond_8

    move-object/from16 v10, p3

    invoke-virtual {v11, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_5

    :cond_a
    const/16 v12, 0x400

    :goto_5
    or-int/2addr v3, v12

    :goto_6
    and-int/lit8 v12, p8, 0x10

    if-eqz v12, :cond_c

    or-int/lit16 v3, v3, 0x6000

    :cond_b
    move-object/from16 v14, p4

    goto :goto_8

    :cond_c
    and-int/lit16 v14, v7, 0x6000

    if-nez v14, :cond_b

    move-object/from16 v14, p4

    invoke-virtual {v11, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_d

    const/16 v15, 0x4000

    goto :goto_7

    :cond_d
    const/16 v15, 0x2000

    :goto_7
    or-int/2addr v3, v15

    :goto_8
    and-int/lit8 v15, p8, 0x20

    const/high16 v16, 0x30000

    if-eqz v15, :cond_e

    or-int v3, v3, v16

    move-object/from16 v13, p5

    goto :goto_a

    :cond_e
    and-int v16, v7, v16

    move-object/from16 v13, p5

    if-nez v16, :cond_10

    invoke-virtual {v11, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_f

    const/high16 v17, 0x20000

    goto :goto_9

    :cond_f
    const/high16 v17, 0x10000

    :goto_9
    or-int v3, v3, v17

    :cond_10
    :goto_a
    const v17, 0x12493

    and-int v6, v3, v17

    const v5, 0x12492

    if-eq v6, v5, :cond_11

    const/4 v5, 0x1

    goto :goto_b

    :cond_11
    const/4 v5, 0x0

    :goto_b
    and-int/lit8 v6, v3, 0x1

    invoke-virtual {v11, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_37

    sget-object v5, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_12

    move-object v1, v5

    :cond_12
    const-string v0, ""

    if-eqz v4, :cond_13

    move-object v4, v0

    goto :goto_c

    :cond_13
    move-object v4, v8

    :goto_c
    if-eqz v9, :cond_14

    goto :goto_d

    :cond_14
    move-object/from16 v0, p3

    :goto_d
    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v12, :cond_16

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v6, :cond_15

    new-instance v8, Lmx1/o;

    const/16 v9, 0x10

    invoke-direct {v8, v9}, Lmx1/o;-><init>(I)V

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v8, Lkotlin/jvm/functions/Function1;

    goto :goto_e

    :cond_16
    move-object v8, v14

    :goto_e
    if-eqz v15, :cond_18

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v6, :cond_17

    new-instance v9, Lmx1/o;

    const/16 v12, 0x11

    invoke-direct {v9, v12}, Lmx1/o;-><init>(I)V

    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v9, Lkotlin/jvm/functions/Function1;

    goto :goto_f

    :cond_18
    move-object v9, v13

    :goto_f
    sget-object v12, Lb3/v1;->i:Lp1/u2;

    invoke-virtual {v11, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lg2/i;

    invoke-virtual {v2}, Ln31/e;->a()Ljava/lang/String;

    move-result-object v13

    const/high16 v14, 0x70000

    and-int/2addr v14, v3

    const/high16 v15, 0x20000

    if-ne v14, v15, :cond_19

    const/4 v15, 0x1

    goto :goto_10

    :cond_19
    const/4 v15, 0x0

    :goto_10
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v15, :cond_1b

    if-ne v10, v6, :cond_1a

    goto :goto_11

    :cond_1a
    const/4 v15, 0x1

    goto :goto_12

    :cond_1b
    :goto_11
    new-instance v10, Ln31/g;

    const/4 v15, 0x1

    invoke-direct {v10, v9, v15}, Ln31/g;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v11, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_12
    check-cast v10, Lc93/a;

    const/4 v15, 0x0

    invoke-static {v13, v10, v11, v15}, Ln31/b;->m(Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v2}, Ln31/e;->c()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v10

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    const/high16 v15, 0x20000

    if-ne v14, v15, :cond_1c

    const/4 v15, 0x1

    goto :goto_13

    :cond_1c
    const/4 v15, 0x0

    :goto_13
    or-int/2addr v13, v15

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    move-object/from16 p0, v0

    const/4 v0, 0x0

    if-nez v13, :cond_1d

    if-ne v15, v6, :cond_1e

    :cond_1d
    new-instance v15, Ln31/b$b;

    invoke-direct {v15, v2, v9, v0}, Ln31/b$b;-><init>(Ln31/e;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v11, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v15, Lc93/m;

    sget-object v13, Lcom/whoop/navigation/models/GenericInteraction;->Companion:Lcom/whoop/navigation/models/GenericInteraction$Companion;

    invoke-static {v11, v15, v10}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln31/e;->b()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v10

    invoke-virtual {v2}, Ln31/e;->d()Ljava/util/List;

    move-result-object v13

    invoke-virtual {v2}, Ln31/e;->i()Z

    move-result v15

    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-virtual {v2}, Ln31/e;->h()Z

    move-result v19

    invoke-static/range {v19 .. v19}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    filled-new-array {v13, v10, v15, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v11, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v13, v15

    const/high16 v15, 0x20000

    if-ne v14, v15, :cond_1f

    const/4 v15, 0x1

    goto :goto_14

    :cond_1f
    const/4 v15, 0x0

    :goto_14
    or-int/2addr v13, v15

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v13, :cond_20

    if-ne v15, v6, :cond_21

    :cond_20
    new-instance v15, Ln31/b$c;

    const/4 v13, 0x0

    invoke-direct {v15, v2, v10, v9, v13}, Ln31/b$c;-><init>(Ln31/e;Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v11, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    check-cast v15, Lc93/m;

    invoke-static {v0, v15, v11}, Lp1/x;->j([Ljava/lang/Object;Lc93/m;Lp1/q;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v10, v12}, Ln31/b;->C(Landroidx/compose/ui/Modifier;Lg2/i;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v12, Ll0/m;->c:Ll0/g;

    sget-object v13, Lb2/e;->M:Lb2/k;

    const/4 v15, 0x0

    invoke-static {v12, v13, v11, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v12

    move-object/from16 v36, v1

    iget-wide v0, v11, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    invoke-static {v11, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_22

    invoke-virtual {v11, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_22
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_15
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v11, v15, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->f:La3/i;

    invoke-static {v11, v12, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v2, v11, Lp1/q;->S:Z

    if-nez v2, :cond_23

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_24

    :cond_23
    invoke-static {v0, v11, v0, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_24
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v11, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v19

    move-object/from16 p4, v8

    const-wide/high16 v7, 0x3ff8000000000000L    # 1.5

    double-to-float v2, v7

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float v23, v2, v7

    const/16 v24, 0x7

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static/range {p0 .. p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Ln31/e;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v37

    sget-object v8, Lx81/d;->a:Lx81/d;

    const/4 v10, 0x6

    invoke-virtual {v8, v11, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ly81/i;->c1()J

    move-result-wide v38

    sget-object v19, Lg1/i8;->a:Lg1/i8;

    invoke-virtual {v8, v11, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ly81/i;->y()J

    move-result-wide v19

    invoke-virtual {v8, v11, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ly81/i;->r()J

    move-result-wide v21

    invoke-virtual {v8, v11, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Ly81/i;->y()J

    move-result-wide v23

    invoke-virtual {v8, v11, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ly81/i;->y()J

    move-result-wide v25

    invoke-virtual {v8, v11, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v27

    invoke-virtual/range {v27 .. v27}, Ly81/i;->X0()J

    move-result-wide v27

    invoke-virtual {v8, v11, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v29

    invoke-virtual/range {v29 .. v29}, Ly81/i;->X0()J

    move-result-wide v29

    invoke-virtual {v8, v11, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->b()J

    move-result-wide v31

    move v8, v14

    move-object v10, v15

    move-wide/from16 v14, v23

    move-wide/from16 v16, v25

    move-wide/from16 v24, v31

    const/16 v23, 0x4000

    const/16 v26, 0x1

    const-wide/16 v32, 0x0

    const v35, 0x1ffe82

    move-object/from16 v31, v10

    move-object/from16 v34, v11

    const-wide/16 v10, 0x0

    move-object/from16 v40, v12

    move/from16 v41, v23

    move-wide/from16 v53, v21

    move-object/from16 v21, v13

    move-wide/from16 v12, v53

    const-wide/16 v22, 0x0

    move/from16 v43, v26

    const/16 v42, 0x0

    move-wide/from16 v53, v27

    move/from16 v28, v8

    move-wide/from16 v55, v19

    move-object/from16 v20, v9

    move-wide/from16 v8, v55

    move-wide/from16 v18, v53

    const-wide/16 v26, 0x0

    move-object/from16 v44, v20

    move-object/from16 v45, v21

    move-wide/from16 v20, v29

    move/from16 v30, v28

    const-wide/16 v28, 0x0

    move/from16 v46, v30

    move-object/from16 v47, v31

    const-wide/16 v30, 0x0

    move-object/from16 p5, v7

    move-object/from16 v7, p4

    move-object/from16 p4, p5

    move-object/from16 p5, v2

    move-object/from16 v52, v40

    move/from16 v2, v41

    move-object/from16 v48, v44

    move-object/from16 v50, v45

    move/from16 v49, v46

    move-object/from16 v51, v47

    invoke-static/range {v8 .. v35}, Lg1/i8;->h(JJJJJJJJJJJJJLandroidx/compose/runtime/Composer;I)Lg1/y1;

    move-result-object v16

    move-object/from16 v11, v34

    const v8, 0xe000

    and-int/2addr v8, v3

    if-ne v8, v2, :cond_25

    const/4 v10, 0x1

    goto :goto_16

    :cond_25
    const/4 v10, 0x0

    :goto_16
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v10, :cond_26

    if-ne v2, v6, :cond_27

    :cond_26
    new-instance v2, Ln31/a;

    const/4 v15, 0x0

    invoke-direct {v2, v7, v15}, Ln31/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    move-object/from16 v24, v2

    check-cast v24, Lkotlin/jvm/functions/Function1;

    const/16 v27, 0x0

    const/16 v28, 0x3d68

    move-object/from16 v34, v11

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const v26, 0x30000006

    move-object/from16 v9, p4

    move-object/from16 v8, p5

    move-object/from16 v25, v34

    move-object/from16 v10, v37

    move-wide/from16 v12, v38

    invoke-static/range {v8 .. v28}, Lhy0/v0;->j(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;JIZLg1/e8;JZLn0/u;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v25

    invoke-virtual/range {p1 .. p1}, Ln31/e;->i()Z

    move-result v2

    if-eqz v2, :cond_28

    const v0, 0x4100aaeb

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Ln31/e;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    const/4 v15, 0x0

    invoke-static {v0, v11, v15}, Ln31/b;->y(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    move-object/from16 v2, v48

    const/4 v15, 0x1

    goto/16 :goto_1f

    :cond_28
    const/4 v15, 0x0

    invoke-virtual/range {p1 .. p1}, Ln31/e;->h()Z

    move-result v2

    if-eqz v2, :cond_30

    const v2, 0x4102ece6

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v5, Lb2/e;->w:Lb2/m;

    invoke-static {v5, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v8, v11, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v11, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-eqz v10, :cond_29

    move-object/from16 v10, v50

    invoke-virtual {v11, v10}, Lp1/q;->l(Lc93/a;)V

    :goto_17
    move-object/from16 v10, v51

    goto :goto_18

    :cond_29
    invoke-virtual {v11}, Lp1/q;->s0()V

    goto :goto_17

    :goto_18
    invoke-static {v11, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v5, v52

    invoke-static {v11, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v11, Lp1/q;->S:Z

    if-nez v5, :cond_2a

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2b

    :cond_2a
    invoke-static {v8, v11, v8, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2b
    invoke-static {v11, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Le31/d;->a:Le31/d;

    invoke-virtual {v0}, Le31/d;->c()Le31/c;

    move-result-object v8

    move/from16 v0, v49

    const/high16 v15, 0x20000

    if-ne v0, v15, :cond_2c

    const/4 v10, 0x1

    goto :goto_19

    :cond_2c
    const/4 v10, 0x0

    :goto_19
    and-int/lit16 v0, v3, 0x380

    const/16 v1, 0x100

    if-ne v0, v1, :cond_2d

    const/4 v0, 0x1

    goto :goto_1a

    :cond_2d
    const/4 v0, 0x0

    :goto_1a
    or-int/2addr v0, v10

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_2f

    if-ne v1, v6, :cond_2e

    goto :goto_1b

    :cond_2e
    move-object/from16 v2, v48

    goto :goto_1c

    :cond_2f
    :goto_1b
    new-instance v1, Lc41/j0;

    const/4 v0, 0x7

    move-object/from16 v2, v48

    invoke-direct {v1, v2, v4, v0}, Lc41/j0;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;I)V

    invoke-virtual {v11, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1c
    move-object v10, v1

    check-cast v10, Lc93/a;

    const/4 v12, 0x6

    const/4 v13, 0x2

    const/4 v9, 0x0

    invoke-static/range {v8 .. v13}, Le31/b;->f(Le31/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v15, 0x1

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_1f

    :cond_30
    move-object/from16 v2, v48

    move/from16 v0, v49

    const/4 v15, 0x1

    const v1, 0x4108bca8

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Ln31/e;->d()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v10, 0x0

    :goto_1d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_36

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v5, v10, 0x1

    if-ltz v10, :cond_35

    move-object v8, v3

    check-cast v8, Lm91/o;

    invoke-virtual {v8}, Lm91/o;->c()Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_31

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    :cond_31
    const v9, -0x4f10601c

    invoke-virtual {v11, v9, v3}, Lp1/q;->b0(ILjava/lang/Object;)V

    new-instance v10, Lgf1/e;

    const/16 v3, 0x1a

    invoke-direct {v10, v3}, Lgf1/e;-><init>(I)V

    const/high16 v3, 0x20000

    if-ne v0, v3, :cond_32

    move v9, v15

    goto :goto_1e

    :cond_32
    const/4 v9, 0x0

    :goto_1e
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v9, :cond_33

    if-ne v12, v6, :cond_34

    :cond_33
    new-instance v12, Ln31/a;

    invoke-direct {v12, v2, v15}, Ln31/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_34
    check-cast v12, Lkotlin/jvm/functions/Function1;

    const/4 v13, 0x0

    const/4 v14, 0x2

    const/4 v9, 0x0

    move-object/from16 v53, v12

    move-object v12, v11

    move-object/from16 v11, v53

    invoke-static/range {v8 .. v14}, Lm91/l;->q(Lm91/o;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v12

    const/4 v8, 0x0

    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    move v10, v5

    goto :goto_1d

    :cond_35
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v13, 0x0

    throw v13

    :cond_36
    const/4 v8, 0x0

    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    :goto_1f
    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    move-object v6, v2

    move-object v3, v4

    move-object v5, v7

    move-object/from16 v1, v36

    move-object/from16 v4, p0

    goto :goto_20

    :cond_37
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object/from16 v4, p3

    move-object v3, v8

    move-object v6, v13

    move-object v5, v14

    :goto_20
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_38

    new-instance v0, Laz1/f;

    move-object/from16 v2, p1

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Laz1/f;-><init>(Landroidx/compose/ui/Modifier;Ln31/e;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_38
    return-void
.end method

.method private static final p(Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Ln31/c$b;->a:Ln31/c$b;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lhy0/x0$a;

    if-eqz v0, :cond_0

    const-string p1, ""

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lhy0/x0$c;

    if-eqz v0, :cond_1

    check-cast p1, Lhy0/x0$c;

    invoke-virtual {p1}, Lhy0/x0$c;->a()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    new-instance v0, Ln31/c$d;

    invoke-direct {v0, p1}, Ln31/c$d;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 6

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, 0x692d0572

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    double-to-float p0, v0

    const/16 p2, 0x8

    int-to-float p2, p2

    mul-float v2, p0, p2

    const/4 v3, 0x0

    const/4 v5, 0x5

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/4 v1, 0x0

    move v4, v2

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final v(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/whoop/design/item/DesignItemInteraction;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/whoop/design/item/DesignItemInteraction;

    new-instance v0, Lmx1/o;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lmx1/o;-><init>(I)V

    invoke-static {p1, p0, v0}, Lm91/i;->a(Lcom/whoop/design/item/DesignItemInteraction;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/whoop/whoopaction/domain/models/Action;

    if-eqz v0, :cond_1

    new-instance v0, Ln31/c$c;

    check-cast p1, Lcom/whoop/whoopaction/domain/models/Action;

    invoke-direct {v0, p1}, Ln31/c$c;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lcom/whoop/whoopaction/domain/models/Action;)Ljava/lang/Object;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ln31/c$c;

    invoke-direct {v0, p0}, Ln31/c$c;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    return-object v0
.end method

.method private static final x(Landroidx/compose/ui/Modifier;Ln31/e;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Ln31/b;->o(Landroidx/compose/ui/Modifier;Ln31/e;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V
    .locals 29

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, 0x446aed22

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x6

    const/4 v4, 0x2

    const/4 v5, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v6, v3, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v6, v4, :cond_2

    move v4, v7

    goto :goto_2

    :cond_2
    move v4, v8

    :goto_2
    and-int/2addr v3, v7

    invoke-virtual {v2, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_a

    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/16 v3, 0x19

    int-to-float v3, v3

    int-to-float v5, v5

    mul-float v11, v3, v5

    const/4 v3, 0x6

    int-to-float v6, v3

    const/16 v10, 0x8

    int-to-float v15, v10

    mul-float v13, v6, v15

    const/4 v14, 0x5

    const/4 v10, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v9, Lb2/e;->E:Lb2/m;

    invoke-static {v9, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v10, v2, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v2, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v13, v2, Lp1/q;->S:Z

    if-eqz v13, :cond_3

    invoke-virtual {v2, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_3
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v2, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v2, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v14, v2, Lp1/q;->S:Z

    if-nez v14, :cond_4

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v14, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5

    :cond_4
    invoke-static {v10, v2, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v2, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, Lb2/e;->N:Lb2/k;

    const/16 v10, 0x36

    invoke-static {v5, v15, v6, v2, v10}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v5

    iget-wide v14, v2, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v2, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v14, v2, Lp1/q;->S:Z

    if-eqz v14, :cond_6

    invoke-virtual {v2, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v2, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, v9, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v2, Lp1/q;->S:Z

    if-nez v5, :cond_7

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    :cond_7
    invoke-static {v6, v2, v6, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v2, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, v8}, Ln31/b;->A(Landroidx/compose/runtime/Composer;I)V

    if-nez v0, :cond_9

    const v3, -0x667f10b2

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v8}, Lp1/q;->q(Z)V

    :goto_5
    const/4 v0, 0x1

    goto/16 :goto_6

    :cond_9
    const v4, -0x667f10b1

    invoke-virtual {v2, v4}, Lp1/q;->e0(I)V

    invoke-static {v0, v2, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-virtual {v5, v2, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    invoke-virtual {v5, v2, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->c1()J

    move-result-wide v5

    new-instance v14, Lw3/k;

    const/4 v3, 0x3

    invoke-direct {v14, v3}, Lw3/k;-><init>(I)V

    const/16 v26, 0x0

    const v27, 0x2fdfa

    const/4 v3, 0x0

    move-object/from16 v24, v2

    move-object v2, v4

    move-wide v4, v5

    const-wide/16 v6, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v13, v11

    const-wide/16 v11, 0x0

    move v15, v13

    const/4 v13, 0x0

    move/from16 v17, v15

    const-wide/16 v15, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v25, v23

    const/16 v23, 0x0

    move/from16 v28, v25

    const/16 v25, 0x0

    move/from16 v0, v28

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    goto :goto_5

    :goto_6
    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_a
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_b

    new-instance v2, Lbm2/b1;

    const/4 v3, 0x6

    move-object/from16 v4, p0

    invoke-direct {v2, v4, v1, v3}, Lbm2/b1;-><init>(Lcom/whoop/design/util/TextResource;II)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final z(Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Ln31/b;->y(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
