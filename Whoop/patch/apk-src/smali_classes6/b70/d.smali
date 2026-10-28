.class public abstract Lb70/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a;\u0010\u0008\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001aM\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0014\u0008\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0014\u0008\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0019\u0010\u0010\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\"\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0014\"\u0014\u0010\u0019\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0014\u00a8\u0006\u001a\u00b2\u0006\u000c\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lkotlin/Function1;",
        "Lcom/whoop/navigation/e;",
        "Ll83/a0;",
        "onClick",
        "Lkotlin/Function0;",
        "onDismiss",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "m",
        "(Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "Lb70/e;",
        "viewState",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "onAnalyticEvent",
        "r",
        "(Lb70/e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "k",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "Ly3/f;",
        "a",
        "F",
        "HORIZONTAL_PADDING",
        "b",
        "FOOTER_BOTTOM_PADDING",
        "c",
        "LOADING_SIZE",
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


# static fields
.field private static final a:F

.field private static final b:F

.field private static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/high16 v0, 0x4004000000000000L    # 2.5

    double-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Lb70/d;->a:F

    const/4 v0, 0x3

    int-to-float v0, v0

    mul-float/2addr v0, v1

    sput v0, Lb70/d;->b:F

    mul-float/2addr v1, v1

    sput v1, Lb70/d;->c:F

    return-void
.end method

.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lb70/d;->o()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lb70/d;->v()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lld1/c;Lcom/whoop/analytics/AnalyticEventModel;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lb70/d;->p(Lld1/c;Lcom/whoop/analytics/AnalyticEventModel;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/navigation/e;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lb70/d;->s(Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lb70/d;->q(Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lb70/d;->l(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lb70/e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lb70/d;->x(Lb70/e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lb70/d;->u(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lb70/d;->w(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcom/whoop/analytics/AnalyticEventModel;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lb70/d;->t(Lcom/whoop/analytics/AnalyticEventModel;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 12

    move-object v9, p1

    check-cast v9, Lp1/q;

    const p1, -0x647187e7

    invoke-virtual {v9, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p3, 0x1

    const/4 v0, 0x2

    if-eqz p1, :cond_0

    or-int/lit8 v1, p2, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p2, 0x6

    if-nez v1, :cond_2

    invoke-virtual {v9, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    move v1, v0

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_2
    move v1, p2

    :goto_1
    and-int/lit8 v2, v1, 0x3

    const/4 v3, 0x1

    if-eq v2, v0, :cond_3

    move v0, v3

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    and-int/2addr v1, v3

    invoke-virtual {v9, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_5

    if-eqz p1, :cond_4

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_4
    sget p1, Lb70/d;->c:F

    invoke-static {p1, p0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget p1, Lgy0/e;->d:I

    invoke-static {p1}, Lv41/r0$d;->b(I)I

    move-result p1

    invoke-static {p1}, Lv41/r0$d;->a(I)Lv41/r0$d;

    move-result-object v1

    const/4 v10, 0x0

    const/16 v11, 0x1fc

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v11}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_5
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_6

    new-instance v0, Lb70/a;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p3, v1, p0}, Lb70/a;-><init>(IIILandroidx/compose/ui/Modifier;)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final l(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, Lb70/d;->k(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final m(Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v7, p1

    move/from16 v8, p4

    const-string v0, "onClick"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDismiss"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, 0x47e2020c

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v8

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    and-int/lit8 v2, v8, 0x30

    const/16 v3, 0x20

    if-nez v2, :cond_3

    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit8 v2, p5, 0x4

    if-eqz v2, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v4, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v4, v8, 0x180

    if-nez v4, :cond_4

    move-object/from16 v4, p2

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x100

    goto :goto_3

    :cond_6
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :goto_4
    and-int/lit16 v5, v0, 0x93

    const/16 v6, 0x92

    const/4 v15, 0x1

    const/4 v9, 0x0

    if-eq v5, v6, :cond_7

    move v5, v15

    goto :goto_5

    :cond_7
    move v5, v9

    :goto_5
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v12, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_1b

    if-eqz v2, :cond_8

    sget-object v2, Lb2/t;->w:Lb2/t;

    move-object v1, v2

    goto :goto_6

    :cond_8
    move-object v1, v4

    :goto_6
    new-instance v16, Lb70/e;

    const/16 v22, 0x1f

    const/16 v23, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v16 .. v23}, Lb70/e;-><init>(ZLjava/util/List;Ljava/util/List;ZLcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v16

    const v4, 0x51c1188b

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    const/4 v5, 0x6

    invoke-virtual {v4, v12, v5}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v4

    const-string v6, "safe-design-view-model-injection-android"

    invoke-interface {v4, v6}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v4

    const-class v6, La70/b;

    sget-object v10, Lp1/l;->a:Lp1/v0;

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    if-nez v4, :cond_f

    const v4, -0x2a32dbfc

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    invoke-static {v12}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v17

    if-nez v17, :cond_9

    const v4, -0x2a322beb

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v9}, Lp1/q;->q(Z)V

    move/from16 p2, v5

    move-object v5, v11

    move-object v4, v13

    move-object v13, v14

    goto :goto_9

    :cond_9
    const v4, -0x2a322bea

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    sget-object v4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v12, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    move/from16 p2, v5

    const-string v5, "null cannot be cast to non-null type android.app.Application"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v16, v4

    check-cast v16, Landroid/app/Application;

    invoke-virtual {v12, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v12, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_b

    if-ne v5, v10, :cond_a

    goto :goto_7

    :cond_a
    move-object v4, v13

    move-object v13, v14

    goto :goto_8

    :cond_b
    :goto_7
    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    new-instance v4, Lld1/b;

    invoke-direct {v4, v2}, Lld1/b;-><init>(Ljava/lang/Object;)V

    move-object/from16 v20, v4

    move-object/from16 v21, v13

    move-object/from16 v19, v14

    invoke-static/range {v16 .. v21}, Lld1/d;->b(Landroid/app/Application;Landroidx/lifecycle/f2;Lj93/d;Lc93/a;Lld1/c;Ljava/lang/String;)Lld1/c;

    move-result-object v5

    move-object/from16 v13, v19

    move-object/from16 v4, v21

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_8
    check-cast v5, Lld1/c;

    invoke-virtual {v12, v9}, Lp1/q;->q(Z)V

    :goto_9
    if-nez v5, :cond_e

    const v5, -0x2a2a887e

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v12, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_c

    if-ne v5, v10, :cond_d

    :cond_c
    new-instance v5, Lld1/b;

    invoke-direct {v5, v2}, Lld1/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v5, Lld1/b;

    invoke-virtual {v12, v9}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_e
    const v2, -0x1a22aa39

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v9}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v12, v9}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v12, v9}, Lp1/q;->q(Z)V

    move v2, v9

    goto :goto_d

    :cond_f
    move/from16 p2, v5

    move-object v4, v13

    move-object v13, v14

    const v5, -0x2a28ba09

    invoke-static {v12, v5, v9, v12}, Ld;->f(Lp1/q;IZLp1/q;)Landroidx/lifecycle/f2;

    move-result-object v16

    sget-object v5, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v12, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    instance-of v14, v5, Landroid/app/Application;

    if-eqz v14, :cond_10

    check-cast v5, Landroid/app/Application;

    move-object/from16 v18, v5

    goto :goto_c

    :cond_10
    move-object/from16 v18, v11

    :goto_c
    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v5, v14

    invoke-virtual {v12, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v5, v14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v5, :cond_11

    if-ne v14, v10, :cond_12

    :cond_11
    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v19

    move-object/from16 v17, v2

    move-object/from16 v21, v4

    move-object/from16 v20, v13

    invoke-static/range {v16 .. v21}, Lld1/d;->d(Landroidx/lifecycle/f2;Ljava/lang/Object;Landroid/app/Application;Lj93/d;Lc93/a;Ljava/lang/String;)Lld1/c;

    move-result-object v14

    invoke-virtual {v12, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object v5, v14

    check-cast v5, Lld1/c;

    goto :goto_b

    :goto_d
    invoke-virtual {v5}, Lld1/c;->getViewState()Lec3/l;

    move-result-object v9

    new-instance v16, Lb70/e;

    const/16 v22, 0x1f

    const/16 v23, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v16 .. v23}, Lb70/e;-><init>(ZLjava/util/List;Ljava/util/List;ZLcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v13, 0x0

    const/4 v14, 0x2

    move-object v4, v11

    const/4 v11, 0x0

    move v6, v2

    move-object v2, v10

    move-object/from16 v10, v16

    invoke-static/range {v9 .. v14}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v9

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v2, :cond_13

    new-instance v10, Lb1/h;

    const/16 v11, 0x9

    invoke-direct {v10, v11}, Lb1/h;-><init>(I)V

    invoke-virtual {v12, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v10, Lc93/a;

    const/16 v11, 0x36

    invoke-static {v10, v15, v12, v11, v6}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_14

    if-ne v11, v2, :cond_15

    :cond_14
    new-instance v11, Lb70/d$a;

    invoke-direct {v11, v5, v4}, Lb70/d$a;-><init>(Lld1/c;Lq83/d;)V

    invoke-virtual {v12, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v11, Lc93/m;

    sget-object v10, Ll83/a0;->a:Ll83/a0;

    invoke-static {v12, v11, v10}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9}, Lb70/d;->n(Lp1/t2;)Lb70/e;

    move-result-object v10

    invoke-virtual {v10}, Lb70/e;->d()Z

    move-result v10

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    invoke-virtual {v12, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    and-int/lit8 v13, v0, 0x70

    if-ne v13, v3, :cond_16

    goto :goto_e

    :cond_16
    move v15, v6

    :goto_e
    or-int v3, v11, v15

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_17

    if-ne v6, v2, :cond_18

    :cond_17
    new-instance v6, Lb70/d$b;

    invoke-direct {v6, v7, v9, v4}, Lb70/d$b;-><init>(Lc93/a;Lp1/t2;Lq83/d;)V

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v6, Lc93/m;

    invoke-static {v12, v6, v10}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9}, Lb70/d;->n(Lp1/t2;)Lb70/e;

    move-result-object v3

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_19

    if-ne v6, v2, :cond_1a

    :cond_19
    new-instance v6, Lb70/b;

    const/4 v2, 0x0

    invoke-direct {v6, v5, v2}, Lb70/b;-><init>(Lld1/c;I)V

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v6, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v2, v0, 0x3

    and-int/lit8 v2, v2, 0x70

    shl-int/lit8 v0, v0, 0x6

    and-int/lit16 v0, v0, 0x380

    or-int v5, v2, v0

    move-object v0, v3

    move-object v3, v6

    const/4 v6, 0x0

    move-object/from16 v2, p0

    move-object v4, v12

    invoke-static/range {v0 .. v6}, Lb70/d;->r(Lb70/e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v1

    goto :goto_f

    :cond_1b
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v3, v4

    :goto_f
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1c

    new-instance v0, La01/e;

    move-object/from16 v1, p0

    move/from16 v5, p5

    move-object v2, v7

    move v4, v8

    invoke-direct/range {v0 .. v5}, La01/e;-><init>(Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method private static final n(Lp1/t2;)Lb70/e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lb70/e;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb70/e;

    return-object p0
.end method

.method private static final o()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final p(Lld1/c;Lcom/whoop/analytics/AnalyticEventModel;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, La70/a$b;

    invoke-direct {v0, p1}, La70/a$b;-><init>(Lcom/whoop/analytics/AnalyticEventModel;)V

    invoke-virtual {p0, v0}, Lld1/c;->g(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lb70/d;->m(Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final r(Lb70/e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb70/e;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v5, p5

    sget-object v0, Lb2/e;->E:Lb2/m;

    sget-object v2, Lb2/e;->w:Lb2/m;

    const-string v3, "viewState"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v3, 0x3b7f8b13

    invoke-virtual {v10, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v5, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v5

    goto :goto_1

    :cond_1
    move v3, v5

    :goto_1
    and-int/lit8 v6, p6, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v3, v3, 0x30

    :cond_2
    move-object/from16 v7, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_2

    move-object/from16 v7, p1

    invoke-virtual {v10, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v3, v8

    :goto_3
    and-int/lit8 v8, p6, 0x4

    const/16 v9, 0x100

    if-eqz v8, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v11, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v11, v5, 0x180

    if-nez v11, :cond_5

    move-object/from16 v11, p2

    invoke-virtual {v10, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    move v12, v9

    goto :goto_4

    :cond_7
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v3, v12

    :goto_5
    and-int/lit8 v12, p6, 0x8

    const/16 v13, 0x800

    if-eqz v12, :cond_9

    or-int/lit16 v3, v3, 0xc00

    :cond_8
    move-object/from16 v14, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v14, v5, 0xc00

    if-nez v14, :cond_8

    move-object/from16 v14, p3

    invoke-virtual {v10, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_a

    move v15, v13

    goto :goto_6

    :cond_a
    const/16 v15, 0x400

    :goto_6
    or-int/2addr v3, v15

    :goto_7
    and-int/lit16 v15, v3, 0x493

    const/16 v4, 0x492

    const/4 v7, 0x0

    if-eq v15, v4, :cond_b

    const/4 v4, 0x1

    goto :goto_8

    :cond_b
    move v4, v7

    :goto_8
    and-int/lit8 v15, v3, 0x1

    invoke-virtual {v10, v15, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_26

    sget-object v4, Lb2/t;->w:Lb2/t;

    if-eqz v6, :cond_c

    move-object v15, v4

    goto :goto_9

    :cond_c
    move-object/from16 v15, p1

    :goto_9
    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v8, :cond_e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v6, :cond_d

    new-instance v8, Lb01/f;

    const/16 v11, 0x1b

    invoke-direct {v8, v11}, Lb01/f;-><init>(I)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v8, Lkotlin/jvm/functions/Function1;

    goto :goto_a

    :cond_e
    move-object v8, v11

    :goto_a
    if-eqz v12, :cond_10

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v6, :cond_f

    new-instance v11, Lb01/f;

    const/16 v12, 0x1c

    invoke-direct {v11, v12}, Lb01/f;-><init>(I)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v11, Lkotlin/jvm/functions/Function1;

    move-object v14, v11

    :cond_10
    and-int/lit16 v11, v3, 0x1c00

    if-ne v11, v13, :cond_11

    const/4 v11, 0x1

    goto :goto_b

    :cond_11
    move v11, v7

    :goto_b
    and-int/lit16 v3, v3, 0x380

    if-ne v3, v9, :cond_12

    const/4 v3, 0x1

    goto :goto_c

    :cond_12
    move v3, v7

    :goto_c
    or-int/2addr v3, v11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v3, :cond_13

    if-ne v9, v6, :cond_14

    :cond_13
    new-instance v9, Lb70/c;

    const/4 v3, 0x0

    invoke-direct {v9, v8, v3, v14}, Lb70/c;-><init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v10, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object v3, v9

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v1}, Lb70/e;->a()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v9

    invoke-static {v9, v3, v10, v7}, Lsz0/t0;->c(Lcom/whoop/analytics/AnalyticEventModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v15}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v6, :cond_15

    invoke-static {v10}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v9

    :cond_15
    move-object/from16 v17, v9

    check-cast v17, Lj0/i;

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v6, :cond_16

    new-instance v9, Lb1/h;

    const/16 v6, 0xa

    invoke-direct {v9, v6}, Lb1/h;-><init>(I)V

    invoke-virtual {v10, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    move-object/from16 v21, v9

    check-cast v21, Lc93/a;

    const/16 v22, 0x1c

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6}, Lgb1/b0;->E(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v2, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v10, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-eqz v7, :cond_17

    invoke-virtual {v10, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_17
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_d
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v10, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v10, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-nez v1, :cond_18

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 p2, v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    goto :goto_e

    :cond_18
    move-object/from16 p2, v3

    :goto_e
    invoke-static {v11, v10, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v10, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lb70/e;->e()Z

    move-result v3

    sget-object v6, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    if-eqz v3, :cond_1a

    const v1, -0x28f5e850

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v4, v0}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v0, v10, v3, v3}, Lb70/d;->k(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    move-object/from16 v17, v8

    const/4 v1, 0x1

    goto/16 :goto_14

    :cond_1a
    const/4 v3, 0x0

    const v11, -0x28f3d1ed

    invoke-virtual {v10, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v4, v0}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v11, Lb70/d;->a:F

    const/4 v3, 0x0

    const/4 v5, 0x2

    invoke-static {v0, v11, v3, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, Lb2/e;->N:Lb2/k;

    sget-object v11, Ll0/m;->c:Ll0/g;

    const/16 v3, 0x30

    invoke-static {v11, v5, v10, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    move-object v11, v6

    iget-wide v5, v10, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v10}, Lp1/q;->i0()V

    move-object/from16 v17, v8

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-eqz v8, :cond_1b

    invoke-virtual {v10, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_1b
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v10, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v10, Lp1/q;->S:Z

    if-nez v3, :cond_1c

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1d

    :cond_1c
    invoke-static {v5, v10, v5, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    invoke-static {v10, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x116eab7e

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lb70/e;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lm91/u;

    move-object v1, v11

    const/4 v11, 0x0

    const/16 v12, 0xe

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v5, v1

    const/4 v1, 0x1

    const/4 v3, 0x0

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v5

    goto :goto_10

    :cond_1e
    move-object v5, v11

    const/4 v1, 0x1

    const/4 v3, 0x0

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    sget-object v0, Lb2/e;->H:Lb2/m;

    invoke-virtual {v5, v4, v0}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v5, Lb70/d;->a:F

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static {v0, v5, v7, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v18

    sget v22, Lb70/d;->b:F

    const/16 v23, 0x7

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v6, Lb2/e;->M:Lb2/k;

    invoke-static {v5, v6, v10, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_1f

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_1f
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_11
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v10, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v10, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-nez v7, :cond_20

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_21

    :cond_20
    invoke-static {v6, v10, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_21
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v10, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x79dd19bf

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lb70/e;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_25

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lm91/u;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Ll0/a1;->w:Ll0/a1;

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/a;->j(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v2, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v10, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-eqz v13, :cond_22

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_22
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_13
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v10, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v10, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-nez v11, :cond_23

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_24

    :cond_23
    invoke-static {v9, v10, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_24
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v10, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v8, Lf;

    const/16 v7, 0x10

    invoke-direct {v8, v7}, Lf;-><init>(I)V

    const/4 v11, 0x0

    const/4 v12, 0x2

    const/4 v7, 0x0

    move-object/from16 v9, p2

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    goto :goto_12

    :cond_25
    invoke-static {v10, v3, v1, v3}, Lm4/a;->y(Lp1/q;ZZZ)V

    :goto_14
    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    move-object v2, v15

    move-object/from16 v3, v17

    :goto_15
    move-object v4, v14

    goto :goto_16

    :cond_26
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object/from16 v2, p1

    move-object v3, v11

    goto :goto_15

    :goto_16
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_27

    new-instance v0, La81/f;

    const/16 v7, 0x9

    move-object/from16 v1, p0

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, La81/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_27
    return-void
.end method

.method private static final s(Lcom/whoop/navigation/e;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lcom/whoop/analytics/AnalyticEventModel;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lcom/whoop/design/item/DesignItemInteraction;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/whoop/design/item/DesignItemInteraction;

    invoke-virtual {p2}, Lcom/whoop/design/item/DesignItemInteraction;->getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    instance-of p1, p2, Lny0/h;

    if-eqz p1, :cond_1

    check-cast p2, Lny0/h;

    invoke-virtual {p2}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final w(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, 0xc2f542

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final x(Lb70/e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lb70/d;->r(Lb70/e;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic y(Lp1/t2;)Lb70/e;
    .locals 0

    invoke-static {p0}, Lb70/d;->n(Lp1/t2;)Lb70/e;

    move-result-object p0

    return-object p0
.end method
