.class public abstract Lzm1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\t\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a!\u0010\u000c\u001a\u00020\u00042\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u001d\u0010\u0011\u001a\u00020\u00042\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eH\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\"\u0017\u0010\u0017\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lzm1/f;",
        "cardState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "o",
        "(Lzm1/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lgz0/m0;",
        "icon",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "i",
        "(Lgz0/m0;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V",
        "",
        "Lzm1/b;",
        "progressList",
        "m",
        "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V",
        "a",
        "Lzm1/f;",
        "getPreviewState",
        "()Lzm1/f;",
        "previewState",
        "home_release"
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
.field private static final a:Lzm1/f;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Lzm1/f;

    sget-object v1, Lgz0/m0;->TUTORIALS:Lgz0/m0;

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v3, "First Week with whoop"

    const-string v4, "toUpperCase(...)"

    invoke-static {v2, v3, v4}, Ld13/a;->e(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v5, "Congrats on reaching your Sleep Score milestone! See what\u2019s next up on your week one journey."

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    move-object v6, v4

    new-instance v4, Lzm1/a;

    const-string v7, "Sleeps logged 3/7"

    invoke-static {v2, v7, v6}, Ld13/a;->e(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const/4 v6, 0x7

    const/4 v7, 0x1

    invoke-direct {v4, v2, v7, v6}, Lzm1/a;-><init>(Lcom/whoop/design/util/TextResource;II)V

    new-instance v8, Lcom/whoop/navigation/e;

    const/4 v12, 0x7

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lzm1/b;

    const-string v2, "1"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v9, v2, v7}, Lzm1/b;-><init>(Lcom/whoop/design/util/TextResource;Z)V

    new-instance v10, Lzm1/b;

    const-string v2, "2"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v10, v2, v7}, Lzm1/b;-><init>(Lcom/whoop/design/util/TextResource;Z)V

    new-instance v11, Lzm1/b;

    const-string v2, "3"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v11, v2, v7}, Lzm1/b;-><init>(Lcom/whoop/design/util/TextResource;Z)V

    new-instance v12, Lzm1/b;

    const-string v2, "4"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const/4 v6, 0x0

    invoke-direct {v12, v2, v6}, Lzm1/b;-><init>(Lcom/whoop/design/util/TextResource;Z)V

    new-instance v13, Lzm1/b;

    const-string v2, "5"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v13, v2, v6}, Lzm1/b;-><init>(Lcom/whoop/design/util/TextResource;Z)V

    new-instance v14, Lzm1/b;

    const-string v2, "6"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v14, v2, v6}, Lzm1/b;-><init>(Lcom/whoop/design/util/TextResource;Z)V

    new-instance v15, Lzm1/b;

    const-string v2, "7"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v15, v2, v6}, Lzm1/b;-><init>(Lcom/whoop/design/util/TextResource;Z)V

    filled-new-array/range {v9 .. v15}, [Lzm1/b;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    move-object v2, v3

    move-object v3, v5

    move-object v5, v8

    invoke-direct/range {v0 .. v6}, Lzm1/f;-><init>(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lzm1/a;Lcom/whoop/navigation/e;Ljava/util/List;)V

    sput-object v0, Lzm1/e;->a:Lzm1/f;

    return-void
.end method

.method public static synthetic a(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzm1/e;->n(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lgz0/m0;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lzm1/e;->l(Lgz0/m0;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzm1/e;->k(Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lf2/d;)Lf2/g;
    .locals 0

    invoke-static {p0}, Lzm1/e;->j(Lf2/d;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lzm1/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzm1/e;->s(Lzm1/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Lzm1/f;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzm1/e;->q(Lkotlin/jvm/functions/Function1;Lzm1/f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzm1/e;->p(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lzm1/f;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzm1/e;->r(Lzm1/f;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final i(Lgz0/m0;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V
    .locals 41

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v3, -0x503d4ce2

    invoke-virtual {v8, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_2

    if-nez v0, :cond_0

    const/4 v3, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    :goto_0
    invoke-virtual {v8, v3}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int v3, p3, v3

    goto :goto_2

    :cond_2
    move/from16 v3, p3

    :goto_2
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_5

    and-int/lit8 v4, p3, 0x40

    if-nez v4, :cond_3

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_3

    :cond_3
    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_3
    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_4

    :cond_4
    const/16 v4, 0x10

    :goto_4
    or-int/2addr v3, v4

    :cond_5
    move v13, v3

    and-int/lit8 v3, v13, 0x13

    const/16 v14, 0x12

    if-eq v3, v14, :cond_6

    const/4 v3, 0x1

    goto :goto_5

    :cond_6
    const/4 v3, 0x0

    :goto_5
    and-int/lit8 v5, v13, 0x1

    invoke-virtual {v8, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object v3

    invoke-virtual {v8, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v5, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->HOME_ONBOARDING_FUTURE_IA:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {v3, v5}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result v5

    if-nez v5, :cond_8

    const-string v5, "home-future-ia"

    invoke-interface {v3, v5}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_7

    goto :goto_6

    :cond_7
    const/16 v29, 0x0

    goto :goto_7

    :cond_8
    :goto_6
    const/16 v29, 0x1

    :goto_7
    const/high16 v5, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, Lb2/e;->K:Lb2/l;

    sget-object v9, Ll0/m;->g:Ll0/h;

    const/16 v10, 0x36

    invoke-static {v9, v7, v8, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v11, v8, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v8, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    move/from16 v17, v14

    iget-boolean v14, v8, Lp1/q;->S:Z

    if-eqz v14, :cond_9

    invoke-virtual {v8, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_9
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_8
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v8, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v8, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-nez v4, :cond_a

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v4, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    :cond_a
    invoke-static {v10, v8, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v8, v4, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, Ly2/d;->a:Ly2/m;

    new-instance v10, Landroidx/compose/foundation/layout/WithAlignmentLineElement;

    invoke-direct {v10, v5}, Landroidx/compose/foundation/layout/WithAlignmentLineElement;-><init>(Ly2/a;)V

    const/high16 v5, 0x40000000    # 2.0f

    move-object v15, v3

    float-to-double v2, v5

    const-wide/16 v20, 0x0

    cmpl-double v2, v2, v20

    if-lez v2, :cond_c

    goto :goto_9

    :cond_c
    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_9
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v3, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v20, v5, v3

    if-lez v20, :cond_d

    move v5, v3

    :cond_d
    const/4 v3, 0x1

    invoke-direct {v2, v5, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-interface {v10, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v5, Ll0/m;->a:Ll0/e;

    const/16 v10, 0x30

    invoke-static {v5, v7, v8, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    move-object v7, v4

    iget-wide v3, v8, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v8, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-eqz v10, :cond_e

    invoke-virtual {v8, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_e
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v8, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-nez v4, :cond_f

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_10

    :cond_f
    invoke-static {v3, v8, v3, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    invoke-static {v8, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v2, 0x6

    if-nez v0, :cond_11

    const v3, 0x6483080c

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    const/4 v3, 0x0

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    move v14, v3

    move-object v2, v6

    const/4 v11, 0x4

    const/16 v19, 0x1

    goto :goto_b

    :cond_11
    const/4 v3, 0x0

    const v4, 0x6483080d

    invoke-static {v8, v4, v0, v8, v2}, Lih0/d0;->s(Lp1/q;ILgz0/m0;Lp1/q;I)Lo2/e;

    move-result-object v4

    int-to-float v5, v2

    const/4 v11, 0x4

    int-to-float v12, v11

    mul-float/2addr v5, v12

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v30

    const/16 v39, 0x0

    const v40, 0x7fffb

    const/16 v31, 0x0

    const/16 v32, 0x0

    const v33, 0x3f7d70a4    # 0.99f

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    invoke-static/range {v30 .. v40}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v7, v9, :cond_12

    new-instance v7, Lzc1/h7;

    const/16 v9, 0x1c

    invoke-direct {v7, v9}, Lzc1/h7;-><init>(I)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v7}, Landroidx/compose/ui/draw/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v9, 0x30

    const/16 v10, 0x8

    move/from16 v18, v3

    move-object v3, v4

    const/4 v4, 0x0

    move-object v14, v6

    const-wide/16 v6, 0x0

    move-object v2, v14

    move/from16 v14, v18

    const/16 v19, 0x1

    invoke-static/range {v3 .. v10}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x2

    int-to-float v3, v3

    invoke-static {v3, v12, v2, v8, v14}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    :goto_b
    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shr-int/lit8 v4, v13, 0x3

    and-int/lit8 v4, v4, 0xe

    or-int/2addr v3, v4

    invoke-static {v1, v8, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    if-eqz v29, :cond_13

    const v4, 0x2446ad69

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v8, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->L()Lb91/a;

    move-result-object v4

    :goto_c
    invoke-virtual {v8, v14}, Lp1/q;->q(Z)V

    move-object/from16 v23, v4

    goto :goto_d

    :cond_13
    const v4, 0x2446b148

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v8, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->r()Lb91/a;

    move-result-object v4

    goto :goto_c

    :goto_d
    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v8, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v6

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v27, v9, 0x12

    const v28, 0x2fffa

    move-object v9, v4

    const/4 v4, 0x0

    move v10, v5

    move-wide v5, v6

    move-object/from16 v25, v8

    const-wide/16 v7, 0x0

    move-object v12, v9

    const/4 v9, 0x0

    move v13, v10

    const/4 v10, 0x0

    move/from16 v16, v11

    const/4 v11, 0x0

    move-object/from16 v17, v12

    move/from16 v18, v13

    const-wide/16 v12, 0x0

    move/from16 v20, v14

    const/4 v14, 0x0

    move-object/from16 v21, v15

    const/4 v15, 0x0

    move/from16 v24, v16

    move-object/from16 v22, v17

    const-wide/16 v16, 0x0

    move/from16 v26, v18

    const/16 v18, 0x0

    move/from16 v31, v19

    const/16 v19, 0x0

    move/from16 v32, v20

    const/16 v20, 0x0

    move-object/from16 v33, v21

    const/16 v21, 0x0

    move-object/from16 v34, v22

    const/16 v22, 0x0

    move/from16 v35, v24

    const/16 v24, 0x0

    move/from16 v36, v26

    const/16 v26, 0x0

    move/from16 v0, v31

    move/from16 v1, v36

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    if-nez v29, :cond_14

    const v3, -0x5b14cab1

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {v34 .. v34}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/w;->s()I

    move-result v3

    const/4 v4, 0x6

    invoke-static {v3, v8, v4}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v3

    const/4 v4, 0x5

    int-to-float v4, v4

    const/4 v11, 0x4

    int-to-float v5, v11

    mul-float/2addr v4, v5

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v12, v34

    invoke-virtual {v12, v8, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v6

    const/16 v9, 0x1b0

    const/4 v10, 0x0

    const/4 v4, 0x0

    invoke-static/range {v3 .. v10}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v14, 0x0

    invoke-virtual {v8, v14}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_14
    move-object/from16 v12, v34

    const/4 v14, 0x0

    const v3, -0x5b0f8df1

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    const-string v3, "home-ia-caret"

    move-object/from16 v15, v33

    invoke-interface {v15, v3}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_15

    const v3, -0x5b0e0c80

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v12}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/w;->s()I

    move-result v3

    const/4 v4, 0x6

    invoke-static {v3, v8, v4}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v3

    const/4 v11, 0x4

    int-to-float v4, v11

    mul-float/2addr v4, v4

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v12, v8, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->b1()J

    move-result-wide v6

    const/16 v9, 0x1b0

    const/4 v10, 0x0

    const/4 v4, 0x0

    invoke-static/range {v3 .. v10}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v14}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_15
    const v1, -0x5b095b40

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v14}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual {v8, v14}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_16
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_10
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_17

    new-instance v1, Lyf1/e;

    const/16 v2, 0x15

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    move/from16 v5, p3

    invoke-direct {v1, v3, v4, v5, v2}, Lyf1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final j(Lf2/d;)Lf2/g;
    .locals 2

    const-string v0, "$this$drawWithCache"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzc1/h7;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lzc1/h7;-><init>(I)V

    invoke-virtual {p0, v0}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Lk2/c;)Ll83/a0;
    .locals 11

    const-string v0, "$this$onDrawWithContent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, La3/p0;

    invoke-virtual {v0}, La3/p0;->a()V

    invoke-static {}, Lgb1/b0;->F0()Li2/t;

    move-result-object v2

    const/16 v9, 0x9

    const/16 v10, 0x3e

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v10}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lgz0/m0;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lzm1/e;->i(Lgz0/m0;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lzm1/b;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, -0x5c8aa1c2

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p2, 0x6

    const/4 v4, 0x2

    const/4 v5, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int v3, p2, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p2

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

    if-eqz v3, :cond_d

    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-wide/high16 v9, 0x3ff8000000000000L    # 1.5

    double-to-float v6, v9

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float v10, v6, v9

    invoke-static {v10}, Ll0/m;->i(F)Ll0/k;

    move-result-object v10

    sget-object v11, Lb2/e;->J:Lb2/l;

    const/4 v12, 0x6

    invoke-static {v10, v11, v2, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v10

    iget-wide v11, v2, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v2, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v14, v2, Lp1/q;->S:Z

    if-eqz v14, :cond_3

    invoke-virtual {v2, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_3
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v2, v13, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v2, v10, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v12, v2, Lp1/q;->S:Z

    if-nez v12, :cond_4

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_5

    :cond_4
    invoke-static {v11, v2, v11, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v2, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, 0x542e0358

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v3

    move v10, v8

    :goto_4
    if-ge v10, v3, :cond_c

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lzm1/b;

    int-to-float v12, v5

    mul-float/2addr v12, v9

    invoke-static {v12, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v11}, Lzm1/b;->a()Z

    move-result v13

    if-eqz v13, :cond_6

    const v13, -0x7631d9d0

    invoke-virtual {v2, v13}, Lp1/q;->e0(I)V

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v14, Lx81/d;->b:I

    invoke-virtual {v13, v2, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->i()J

    move-result-wide v13

    invoke-virtual {v2, v8}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_6
    const v13, -0x76305061    # -4.999859E-33f

    invoke-virtual {v2, v13}, Lp1/q;->e0(I)V

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v14, Lx81/d;->b:I

    invoke-static {v13, v2, v14, v8}, Lih0/d0;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v13

    :goto_5
    sget-object v15, Lt0/j;->a:Lt0/i;

    invoke-static {v12, v6, v13, v14, v15}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v11}, Lzm1/b;->a()Z

    move-result v13

    if-eqz v13, :cond_7

    const v13, -0x762cb1e4

    invoke-virtual {v2, v13}, Lp1/q;->e0(I)V

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v14, Lx81/d;->b:I

    invoke-virtual {v13, v2, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->i()J

    move-result-wide v13

    const v5, 0x3e19999a    # 0.15f

    invoke-static {v5, v13, v14}, Li2/x;->c(FJ)J

    move-result-wide v13

    invoke-virtual {v2, v8}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_7
    const v5, -0x762adce5

    invoke-virtual {v2, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v5, v2, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->V0()J

    move-result-wide v13

    invoke-virtual {v2, v8}, Lp1/q;->q(Z)V

    :goto_6
    invoke-static {v12, v13, v14, v15}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v12, Lb2/e;->E:Lb2/m;

    invoke-static {v12, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v12

    iget-wide v13, v2, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v2, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v7, v2, Lp1/q;->S:Z

    if-eqz v7, :cond_8

    invoke-virtual {v2, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_8
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_7
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v2, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v2, v7, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v12, v2, Lp1/q;->S:Z

    if-nez v12, :cond_9

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_a

    :cond_9
    invoke-static {v13, v2, v13, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v2, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v11}, Lzm1/b;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v5, v2, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v11}, Lzm1/b;->a()Z

    move-result v7

    if-eqz v7, :cond_b

    const v7, -0x340ad82a

    invoke-virtual {v2, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-static {v7, v2, v11, v8}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v11

    goto :goto_8

    :cond_b
    const v7, -0x340ad3ed    # -3.2135206E7f

    invoke-virtual {v2, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v7, v2, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->Y0()J

    move-result-wide v11

    invoke-virtual {v2, v8}, Lp1/q;->q(Z)V

    :goto_8
    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v7, v2, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->E()Lb91/a;

    move-result-object v22

    sget v7, Lb91/a;->d:I

    shl-int/lit8 v26, v7, 0x12

    const v27, 0x2fffa

    move v7, v3

    const/4 v3, 0x0

    move v13, v6

    move v14, v7

    const-wide/16 v6, 0x0

    move v15, v8

    const/4 v8, 0x0

    move/from16 v17, v9

    const/4 v9, 0x0

    move/from16 v18, v10

    const/4 v10, 0x0

    move-object/from16 v24, v2

    move-object/from16 v19, v4

    move-object v2, v5

    move-wide v4, v11

    const-wide/16 v11, 0x0

    move/from16 v20, v13

    const/4 v13, 0x0

    move/from16 v21, v14

    const/4 v14, 0x0

    move/from16 v25, v15

    const/16 v23, 0x1

    const-wide/16 v15, 0x0

    move/from16 v28, v17

    const/16 v17, 0x0

    move/from16 v29, v18

    const/16 v18, 0x0

    move-object/from16 v30, v19

    const/16 v19, 0x0

    move/from16 v31, v20

    const/16 v20, 0x0

    move/from16 v32, v21

    const/16 v21, 0x0

    move/from16 v33, v23

    const/16 v23, 0x0

    move/from16 v34, v25

    const/16 v25, 0x0

    move/from16 v0, v33

    move/from16 v1, v34

    const/16 v33, 0x4

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v24

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    add-int/lit8 v10, v29, 0x1

    move v7, v0

    move v8, v1

    move/from16 v9, v28

    move-object/from16 v4, v30

    move/from16 v6, v31

    move/from16 v3, v32

    move/from16 v5, v33

    move-object/from16 v0, p0

    goto/16 :goto_4

    :cond_c
    move v0, v7

    move v1, v8

    invoke-virtual {v2, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_d
    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_e

    new-instance v1, Lbm0/o;

    const/16 v2, 0x1d

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Lbm0/o;-><init>(Ljava/util/List;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final n(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lzm1/e;->m(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final o(Lzm1/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzm1/f;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "cardState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p2

    check-cast v9, Lp1/q;

    const v0, 0x305ae7f8

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    const/16 v4, 0x20

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    move v6, v4

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :goto_3
    and-int/lit8 v6, v0, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    const/4 v10, 0x1

    if-eq v6, v7, :cond_5

    move v6, v10

    goto :goto_4

    :cond_5
    move v6, v8

    :goto_4
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v9, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_e

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v6, :cond_6

    new-instance v3, Lzm1/d;

    const/4 v5, 0x0

    invoke-direct {v3, v5}, Lzm1/d;-><init>(I)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v12, v3

    goto :goto_5

    :cond_7
    move-object v12, v5

    :goto_5
    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object v3

    invoke-virtual {v9, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v5, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->HOME_ONBOARDING_FUTURE_IA:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {v3, v5}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result v5

    if-nez v5, :cond_9

    const-string v5, "home-future-ia"

    invoke-interface {v3, v5}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_8

    goto :goto_6

    :cond_8
    move v3, v8

    goto :goto_7

    :cond_9
    :goto_6
    move v3, v10

    :goto_7
    sget-object v5, Lb2/t;->w:Lb2/t;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v4, :cond_a

    goto :goto_8

    :cond_a
    move v10, v8

    :goto_8
    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_b

    if-ne v4, v6, :cond_c

    :cond_b
    new-instance v4, Lyo1/b;

    const/16 v0, 0x15

    invoke-direct {v4, v0, v12, v1}, Lyo1/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object/from16 v17, v4

    check-cast v17, Lc93/a;

    const/16 v18, 0xf

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v4, 0x3

    int-to-float v4, v4

    int-to-float v2, v2

    mul-float/2addr v4, v2

    invoke-static {v4}, Lt0/j;->e(F)Lt0/i;

    move-result-object v4

    if-eqz v3, :cond_d

    const v5, -0x7abeefc1

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-static {v5, v9, v6, v8}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v5

    goto :goto_9

    :cond_d
    const v5, -0x7abeebe2

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v9, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->a1()J

    move-result-wide v5

    invoke-virtual {v9, v8}, Lp1/q;->q(Z)V

    :goto_9
    int-to-float v7, v8

    mul-float/2addr v7, v2

    new-instance v2, Lb30/t2;

    const/16 v8, 0xd

    invoke-direct {v2, v1, v3, v8}, Lb30/t2;-><init>(Ljava/lang/Object;ZI)V

    const v3, 0x2aa6601b

    invoke-static {v3, v9, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const/high16 v10, 0x1b0000

    const/16 v11, 0x18

    move-object v3, v4

    move-wide v4, v5

    const/4 v6, 0x0

    move-object v2, v0

    invoke-static/range {v2 .. v11}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v12

    goto :goto_a

    :cond_e
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v3, v5

    :goto_a
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_f

    new-instance v0, Lzi1/c0;

    const/4 v5, 0x5

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lzi1/c0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final p(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lkotlin/jvm/functions/Function1;Lzm1/f;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lzm1/f;->e()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lzm1/f;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 46

    and-int/lit8 v0, p3, 0x3

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v4, p3, 0x1

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    invoke-virtual {v5, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_8

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v3, v3

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v3, v7

    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v8, Lb2/e;->M:Lb2/k;

    const/4 v9, 0x6

    invoke-static {v3, v8, v5, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v8, v5, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v5, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v11, v5, Lp1/q;->S:Z

    if-eqz v11, :cond_1

    invoke-virtual {v5, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_1
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v5, v11, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v5, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v12, v5, Lp1/q;->S:Z

    if-nez v12, :cond_2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3

    :cond_2
    invoke-static {v8, v5, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v5, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lzm1/f;->c()Lgz0/m0;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lzm1/f;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    sget v13, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v14, v13, 0x3

    invoke-static {v6, v12, v5, v14}, Lzm1/e;->i(Lgz0/m0;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lzm1/f;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-static {v12, v5, v13}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v12

    sget-object v14, Lx81/d;->a:Lx81/d;

    sget v15, Lx81/d;->b:I

    invoke-virtual {v14, v5, v15}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lb91/d;->b()Lb91/a;

    move-result-object v25

    invoke-virtual {v14, v5, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ly81/i;->c1()J

    move-result-wide v16

    sget v18, Lb91/a;->d:I

    shl-int/lit8 v29, v18, 0x12

    const v30, 0x2fff8

    move-object/from16 v19, v9

    move-object/from16 v18, v10

    const-wide/16 v9, 0x0

    move-object/from16 v20, v11

    const/4 v11, 0x0

    move-object/from16 v27, v5

    move-object v5, v12

    const/4 v12, 0x0

    move/from16 v21, v13

    const/4 v13, 0x0

    move-object/from16 v22, v14

    move/from16 v23, v15

    const-wide/16 v14, 0x0

    move-object/from16 v24, v8

    move-wide/from16 v44, v16

    move/from16 v17, v7

    move-wide/from16 v7, v44

    const/16 v16, 0x0

    move/from16 v26, v17

    const/16 v17, 0x0

    move-object/from16 v28, v18

    move-object/from16 v31, v19

    const-wide/16 v18, 0x0

    move-object/from16 v32, v20

    const/16 v20, 0x0

    move/from16 v33, v21

    const/16 v21, 0x0

    move-object/from16 v34, v22

    const/16 v22, 0x0

    move/from16 v35, v23

    const/16 v23, 0x0

    move-object/from16 v36, v24

    const/16 v24, 0x0

    move/from16 v37, v26

    const/16 v26, 0x0

    move-object/from16 v38, v28

    const/16 v28, 0x30

    move-object/from16 v39, v31

    move-object/from16 v1, v32

    move/from16 v41, v33

    move-object/from16 v42, v34

    move/from16 v43, v35

    move-object/from16 v40, v36

    move-object/from16 v2, v38

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const-wide/high16 v7, 0x3fe0000000000000L    # 0.5

    double-to-float v7, v7

    mul-float v8, v7, v37

    const/4 v10, 0x0

    const/16 v11, 0xd

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lb2/e;->K:Lb2/l;

    sget-object v9, Ll0/m;->g:Ll0/h;

    const/16 v10, 0x36

    invoke-static {v9, v7, v5, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v9, v5, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v5, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v11, v5, Lp1/q;->S:Z

    if-eqz v11, :cond_4

    invoke-virtual {v5, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v5, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v5, Lp1/q;->S:Z

    if-nez v1, :cond_5

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    :cond_5
    move-object/from16 v1, v39

    goto :goto_4

    :cond_6
    :goto_3
    move-object/from16 v1, v40

    goto :goto_5

    :goto_4
    invoke-static {v9, v5, v9, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_3

    :goto_5
    invoke-static {v5, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v10, 0x0

    const/16 v11, 0xb

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move-object v6, v4

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object v2, v6

    invoke-virtual/range {p0 .. p0}, Lzm1/f;->b()Lzm1/a;

    move-result-object v3

    invoke-virtual {v3}, Lzm1/a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    move/from16 v4, v41

    invoke-static {v3, v5, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    if-eqz p1, :cond_7

    const v4, 0x5a452f77

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    move-object/from16 v4, v42

    move/from16 v6, v43

    invoke-virtual {v4, v5, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->c()Lb91/a;

    move-result-object v7

    const/4 v8, 0x0

    :goto_6
    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    move-object/from16 v25, v7

    goto :goto_7

    :cond_7
    move-object/from16 v4, v42

    move/from16 v6, v43

    const/4 v8, 0x0

    const v7, 0x5a453337

    invoke-virtual {v5, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v5, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->s()Lb91/a;

    move-result-object v7

    goto :goto_6

    :goto_7
    invoke-virtual {v4, v5, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->b1()J

    move-result-wide v7

    const/16 v28, 0x30

    const v30, 0x2fff8

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move/from16 v27, v6

    move-object v6, v1

    move/from16 v1, v27

    move-object/from16 v27, v5

    move-object v5, v3

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    const/4 v3, 0x1

    int-to-float v6, v3

    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v4, v5, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->W0()J

    move-result-wide v1

    sget-object v4, Li2/w0;->a:Li2/v0;

    invoke-static {v0, v1, v2, v4}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v8, 0x0

    invoke-static {v0, v5, v8}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lzm1/f;->f()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v5, v8}, Lzm1/e;->m(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_8
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_8
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final s(Lzm1/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lzm1/e;->o(Lzm1/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
