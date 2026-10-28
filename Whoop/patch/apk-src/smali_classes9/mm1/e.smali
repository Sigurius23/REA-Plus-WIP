.class public abstract Lmm1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\"\"\u0010\u000e\u001a\u00020\u00008\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000f"
    }
    d2 = {
        "Lmm1/f;",
        "pregnancyTileState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Lmm1/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "a",
        "Lmm1/f;",
        "getSamplePregnancyTileState",
        "()Lmm1/f;",
        "setSamplePregnancyTileState",
        "(Lmm1/f;)V",
        "samplePregnancyTileState",
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
.field private static a:Lmm1/f;


# direct methods
.method static constructor <clinit>()V
    .locals 21

    sget-object v1, Lgz0/m0;->PREGNANCY:Lgz0/m0;

    sget-object v3, Ly81/f;->STRAIN_ZONE_3:Ly81/f;

    const-string v0, "PREGNANCY - WEEK 32"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    const-string v2, "3RD TRIMESTER"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const-string v2, "March 6, 2024"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    new-instance v10, Lcom/whoop/navigation/e;

    const/4 v14, 0x7

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Llz0/a;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x0

    const v5, 0x3ea8f5c3    # 0.33f

    invoke-direct/range {v2 .. v7}, Llz0/a;-><init>(Ly81/f;FFLjava/lang/Float;Z)V

    move-object v11, v2

    new-instance v2, Llz0/a;

    const v4, 0x3eae147b    # 0.34f

    const v5, 0x3f2b851f    # 0.67f

    invoke-direct/range {v2 .. v7}, Llz0/a;-><init>(Ly81/f;FFLjava/lang/Float;Z)V

    move-object v12, v2

    new-instance v2, Llz0/a;

    const v4, 0x3f59999a    # 0.85f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    const/4 v7, 0x1

    const v4, 0x3f2e147b    # 0.68f

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-direct/range {v2 .. v7}, Llz0/a;-><init>(Ly81/f;FFLjava/lang/Float;Z)V

    filled-new-array {v11, v12, v2}, [Llz0/a;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    new-instance v11, Llz0/b;

    const-string v2, "1"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    sget-object v17, Ly81/f;->WHITE_50:Ly81/f;

    const/16 v16, 0x8

    move-object/from16 v14, v17

    const/16 v17, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v11 .. v17}, Llz0/b;-><init>(FLcom/whoop/design/util/TextResource;Ly81/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v17, v14

    new-instance v14, Llz0/b;

    const-string v2, "14"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    const/16 v19, 0x8

    const/16 v20, 0x0

    const v15, 0x3ea3d70a    # 0.32f

    const/16 v18, 0x0

    invoke-direct/range {v14 .. v20}, Llz0/b;-><init>(FLcom/whoop/design/util/TextResource;Ly81/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v14

    new-instance v14, Llz0/b;

    const-string v4, "28"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    const v15, 0x3f28f5c3    # 0.66f

    invoke-direct/range {v14 .. v20}, Llz0/b;-><init>(FLcom/whoop/design/util/TextResource;Ly81/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v14

    new-instance v5, Llz0/b;

    const-string v6, "32"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const/4 v12, 0x1

    const v13, 0x3f547ae1    # 0.83f

    invoke-direct {v5, v13, v6, v3, v12}, Llz0/b;-><init>(FLcom/whoop/design/util/TextResource;Ly81/f;Z)V

    new-instance v14, Llz0/b;

    const-string v6, "40"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    const v15, 0x3f7ae148    # 0.98f

    invoke-direct/range {v14 .. v20}, Llz0/b;-><init>(FLcom/whoop/design/util/TextResource;Ly81/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v11, v2, v4, v5, v14}, [Llz0/b;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    move-object v5, v3

    move-object v3, v8

    move-object v8, v2

    move-object v2, v0

    new-instance v0, Lmm1/f;

    move-object v6, v9

    move-object v9, v10

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v11}, Lmm1/f;-><init>(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Ly81/f;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lmm1/e;->a:Lmm1/f;

    return-void
.end method

.method public static synthetic a(Lmm1/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lmm1/e;->i(Lmm1/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lmm1/f;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lmm1/e;->h(Lmm1/f;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lmm1/f;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmm1/e;->g(Lkotlin/jvm/functions/Function1;Lmm1/f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmm1/e;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lmm1/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmm1/f;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "pregnancyTileState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p2

    check-cast v9, Lp1/q;

    const v0, 0x625c194b

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

    new-instance v3, Lm01/c;

    const/16 v5, 0x1d

    invoke-direct {v3, v5}, Lm01/c;-><init>(I)V

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
    new-instance v4, Lmi2/o;

    const/4 v0, 0x2

    invoke-direct {v4, v0, v12, v1}, Lmi2/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

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

    const v5, 0x3bbb3972

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-static {v5, v9, v6, v8}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v5

    goto :goto_9

    :cond_d
    const v5, 0x3bbb3d51

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

    const/4 v8, 0x7

    invoke-direct {v2, v1, v3, v8}, Lb30/t2;-><init>(Ljava/lang/Object;ZI)V

    const v3, 0x212a5908

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

    new-instance v0, Llq2/c;

    const/16 v5, 0xf

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Llq2/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final f(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;Lmm1/f;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lmm1/f;->b()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lmm1/f;ZLandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 41

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v4, p3, 0x1

    move-object/from16 v10, p2

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_14

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v3, v3

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v3, v6

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v6, Lb2/e;->M:Lb2/k;

    invoke-static {v5, v6, v10, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-eqz v8, :cond_1

    invoke-virtual {v10, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_1
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v10, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->f:La3/i;

    invoke-static {v10, v15, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-nez v7, :cond_2

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    :cond_2
    invoke-static {v6, v10, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v10, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v7, Lb2/e;->K:Lb2/l;

    sget-object v8, Ll0/m;->g:Ll0/h;

    const/16 v9, 0x36

    invoke-static {v8, v7, v10, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-eqz v0, :cond_4

    invoke-virtual {v10, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v10, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v15, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_5

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    :cond_5
    invoke-static {v11, v10, v11, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v10, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Ll0/t1;->a:Ll0/t1;

    invoke-virtual {v0}, Ll0/t1;->d()Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/high16 v9, 0x40000000    # 2.0f

    invoke-virtual {v0, v3, v1, v9}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v11, Ll0/m;->a:Ll0/e;

    const/16 v12, 0x30

    invoke-static {v11, v7, v10, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_7

    invoke-virtual {v10, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_7
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v10, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v15, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-nez v7, :cond_8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9

    :cond_8
    invoke-static {v11, v10, v11, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    invoke-static {v10, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v3, 0x4

    const/4 v7, 0x6

    if-nez p1, :cond_b

    const v9, -0x53919254

    invoke-virtual {v10, v9}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lmm1/f;->e()Lgz0/m0;

    move-result-object v9

    if-nez v9, :cond_a

    const v9, -0x1ea0b82b

    invoke-virtual {v10, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    move-object v3, v5

    move-object/from16 v31, v6

    move-object/from16 v32, v8

    goto :goto_4

    :cond_a
    const v11, -0x1ea0b82a

    invoke-static {v10, v11, v9, v10, v7}, Lih0/d0;->s(Lp1/q;ILgz0/m0;Lp1/q;I)Lo2/e;

    move-result-object v9

    int-to-float v11, v7

    int-to-float v12, v3

    mul-float/2addr v11, v12

    invoke-static {v11, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v7, v10, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->Y0()J

    move-result-wide v17

    move-object v7, v11

    const/16 v11, 0x1b0

    move v3, v12

    const/4 v12, 0x0

    move-object/from16 v19, v6

    const/4 v6, 0x0

    move v1, v3

    move-object v3, v5

    move-object/from16 v32, v8

    move-object v5, v9

    move-wide/from16 v8, v17

    move-object/from16 v31, v19

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-static {v1, v1, v4, v10, v2}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    :goto_4
    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_b
    move-object v3, v5

    move-object/from16 v31, v6

    move-object/from16 v32, v8

    const v1, -0x1e99c9a8

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual/range {p0 .. p0}, Lmm1/f;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v1, v10, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    if-eqz p1, :cond_c

    const v6, -0x539144b3

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v10, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->L()Lb91/a;

    move-result-object v6

    :goto_6
    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    move-object/from16 v25, v6

    goto :goto_7

    :cond_c
    const v6, -0x539140d4

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v10, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->r()Lb91/a;

    move-result-object v6

    goto :goto_6

    :goto_7
    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v10, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v8

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v29, v11, 0x12

    const v30, 0x2fffa

    move-object v11, v6

    const/4 v6, 0x0

    move v12, v7

    move-wide v7, v8

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move-object/from16 v16, v11

    const/4 v11, 0x0

    move/from16 v17, v12

    const/4 v12, 0x0

    move-object/from16 v18, v13

    const/4 v13, 0x0

    move-object/from16 v19, v14

    move-object/from16 v20, v15

    const-wide/16 v14, 0x0

    move-object/from16 v21, v16

    const/16 v16, 0x0

    move/from16 v22, v17

    const/16 v17, 0x0

    move-object/from16 v23, v18

    move-object/from16 v24, v19

    const-wide/16 v18, 0x0

    move-object/from16 v26, v20

    const/16 v20, 0x0

    move-object/from16 v28, v21

    const/16 v21, 0x0

    move/from16 v33, v22

    const/16 v22, 0x0

    move-object/from16 v34, v23

    const/16 v23, 0x0

    move-object/from16 v35, v24

    const/16 v24, 0x0

    move-object/from16 v36, v26

    const/16 v26, 0x0

    move-object/from16 v37, v28

    const/16 v28, 0x0

    move/from16 v40, v5

    move/from16 v2, v33

    move-object/from16 v38, v35

    move-object/from16 v39, v36

    move-object v5, v1

    move-object/from16 v1, v34

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    const/4 v5, 0x1

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    invoke-virtual/range {v37 .. v37}, Lx81/d;->d()Lgz0/o0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/w;->s()I

    move-result v5

    const/4 v13, 0x6

    invoke-static {v5, v10, v13}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    if-eqz p1, :cond_d

    const/4 v6, 0x5

    int-to-float v6, v6

    const/4 v7, 0x4

    :goto_8
    int-to-float v8, v7

    mul-float/2addr v6, v8

    invoke-static {v6, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object v7, v6

    goto :goto_9

    :cond_d
    const/4 v7, 0x4

    int-to-float v6, v13

    goto :goto_8

    :goto_9
    if-eqz p1, :cond_e

    const v6, -0x3a092f6b

    move-object/from16 v14, v37

    invoke-static {v10, v6, v14, v10, v2}, Lr80/c;->c(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v8

    const/4 v6, 0x0

    :goto_a
    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_e
    move-object/from16 v14, v37

    const/4 v6, 0x0

    const v8, -0x3a092b88

    invoke-static {v10, v8, v14, v10, v2}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v8

    goto :goto_a

    :goto_b
    const/16 v11, 0x30

    const/4 v12, 0x0

    const/4 v6, 0x0

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v5, 0x1

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    const/4 v7, 0x4

    int-to-float v5, v7

    invoke-static {v5, v5, v4, v10}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->J:Lb2/l;

    move-object/from16 v6, v32

    invoke-static {v6, v5, v10, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-eqz v8, :cond_f

    invoke-virtual {v10, v1}, Lp1/q;->l(Lc93/a;)V

    :goto_c
    move-object/from16 v1, v38

    goto :goto_d

    :cond_f
    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_c

    :goto_d
    invoke-static {v10, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, v39

    invoke-static {v10, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-nez v1, :cond_11

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    goto :goto_f

    :cond_10
    :goto_e
    move-object/from16 v1, v31

    goto :goto_10

    :cond_11
    :goto_f
    invoke-static {v6, v10, v6, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_e

    :goto_10
    invoke-static {v10, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lmm1/f;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move/from16 v3, v40

    invoke-static {v1, v10, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Ll0/t1;->d()Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/high16 v4, 0x40000000    # 2.0f

    const/4 v6, 0x1

    invoke-virtual {v0, v1, v6, v4}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    if-eqz p1, :cond_12

    const v4, -0x2256b747

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v10, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->r()Lb91/a;

    move-result-object v4

    const/4 v6, 0x0

    :goto_11
    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    move-object/from16 v25, v4

    goto :goto_12

    :cond_12
    const/4 v6, 0x0

    const v4, -0x2256b387

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v10, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->s()Lb91/a;

    move-result-object v4

    goto :goto_11

    :goto_12
    invoke-virtual/range {p0 .. p0}, Lmm1/f;->a()Ly81/f;

    move-result-object v4

    invoke-virtual {v4, v10, v6}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v7

    const/16 v28, 0x0

    const v30, 0x2fff8

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v37, v14

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

    move-object v6, v1

    move-object/from16 v1, v37

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    move/from16 v4, v29

    invoke-virtual/range {p0 .. p0}, Lmm1/f;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v10, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Ll0/t1;->d()Landroidx/compose/ui/Modifier;

    move-result-object v6

    if-eqz p1, :cond_13

    const v0, -0x22568c87

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v10, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->c()Lb91/a;

    move-result-object v0

    const/4 v3, 0x0

    :goto_13
    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    move-object/from16 v25, v0

    goto :goto_14

    :cond_13
    const/4 v3, 0x0

    const v0, -0x225688c7

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v10, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->d()Lb91/a;

    move-result-object v0

    goto :goto_13

    :goto_14
    invoke-virtual {v1, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b1()J

    move-result-wide v7

    or-int/lit16 v0, v4, 0xc00

    const v30, 0x2dff8

    move-object/from16 v27, v10

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

    const/16 v22, 0x1

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move/from16 v29, v0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lmm1/f;->g()Ljava/util/List;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lmm1/f;->f()Ljava/util/List;

    move-result-object v8

    const/4 v10, 0x0

    const/4 v11, 0x3

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v9, v27

    invoke-static/range {v5 .. v11}, Llz0/c;->d(Landroidx/compose/ui/Modifier;Ls21/i;Ljava/util/List;Ljava/util/List;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v9

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_15

    :cond_14
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_15
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Lmm1/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lmm1/e;->e(Lmm1/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
