.class public final Lcom/whoop/stories/OnboardingStoriesDebugFragment;
.super Lhj0/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/stories/OnboardingStoriesDebugFragment$a;,
        Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006!\u00b2\u0006\u000e\u0010 \u001a\u00020\u00048\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lcom/whoop/stories/OnboardingStoriesDebugFragment;",
        "Lhj0/m;",
        "<init>",
        "()V",
        "",
        "featureEducationName",
        "Ll83/a0;",
        "M",
        "(Ljava/lang/String;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "",
        "Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;",
        "w",
        "Ljava/util/List;",
        "onboardingStoryItems",
        "Lm91/p;",
        "x",
        "Lm91/p;",
        "debugOnboardingStoriesItemFactory",
        "getLogTag",
        "()Ljava/lang/String;",
        "logTag",
        "b",
        "a",
        "text",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final w:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;",
            ">;"
        }
    .end annotation
.end field

.field private final x:Lm91/p;


# direct methods
.method public constructor <init>()V
    .locals 11

    invoke-direct {p0}, Lhj0/m;-><init>()V

    new-instance v0, Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;

    sget-object v1, Lcom/whoop/data/onboarding/FeatureEducationType;->CUSTOMIZE_JOURNAL:Lcom/whoop/data/onboarding/FeatureEducationType;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;-><init>(Lcom/whoop/data/onboarding/FeatureEducationType;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;

    sget-object v2, Lcom/whoop/data/onboarding/FeatureEducationType;->SAVE_JOURNAL:Lcom/whoop/data/onboarding/FeatureEducationType;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;-><init>(Lcom/whoop/data/onboarding/FeatureEducationType;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;

    sget-object v3, Lcom/whoop/data/onboarding/FeatureEducationType;->ALARM_SCHEDULING:Lcom/whoop/data/onboarding/FeatureEducationType;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;-><init>(Lcom/whoop/data/onboarding/FeatureEducationType;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;

    sget-object v4, Lcom/whoop/data/onboarding/FeatureEducationType;->WEIGHTLIFTING_MSK_STORY:Lcom/whoop/data/onboarding/FeatureEducationType;

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;-><init>(Lcom/whoop/data/onboarding/FeatureEducationType;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;

    sget-object v5, Lcom/whoop/data/onboarding/FeatureEducationType;->DEVICE_SETUP_STORY:Lcom/whoop/data/onboarding/FeatureEducationType;

    const/4 v8, 0x6

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;-><init>(Lcom/whoop/data/onboarding/FeatureEducationType;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;

    sget-object v6, Lcom/whoop/data/onboarding/FeatureEducationType;->STRESS_MONITOR_STORY:Lcom/whoop/data/onboarding/FeatureEducationType;

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;-><init>(Lcom/whoop/data/onboarding/FeatureEducationType;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array/range {v0 .. v5}, [Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/stories/OnboardingStoriesDebugFragment;->w:Ljava/util/List;

    new-instance v0, Llc0/g;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Llc0/g;-><init>(I)V

    invoke-static {v0}, Lm91/m;->g(Lkotlin/jvm/functions/Function1;)Lm91/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/stories/OnboardingStoriesDebugFragment;->x:Lm91/p;

    return-void
.end method

.method public static synthetic E(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/stories/OnboardingStoriesDebugFragment;->Q(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lcom/whoop/stories/OnboardingStoriesDebugFragment;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/stories/OnboardingStoriesDebugFragment;->R(Lcom/whoop/stories/OnboardingStoriesDebugFragment;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(Lm91/q;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/stories/OnboardingStoriesDebugFragment;->L(Lm91/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Lcom/whoop/stories/OnboardingStoriesDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/stories/OnboardingStoriesDebugFragment;->N(Lcom/whoop/stories/OnboardingStoriesDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I(Lcom/whoop/stories/OnboardingStoriesDebugFragment;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/stories/OnboardingStoriesDebugFragment;->S(Lcom/whoop/stories/OnboardingStoriesDebugFragment;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic J(Lcom/whoop/stories/OnboardingStoriesDebugFragment;)Lm91/p;
    .locals 0

    iget-object p0, p0, Lcom/whoop/stories/OnboardingStoriesDebugFragment;->x:Lm91/p;

    return-object p0
.end method

.method public static final synthetic K(Lcom/whoop/stories/OnboardingStoriesDebugFragment;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/stories/OnboardingStoriesDebugFragment;->M(Ljava/lang/String;)V

    return-void
.end method

.method private static final L(Lm91/q;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemViewFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lm91/q;->c()Ljava/util/Map;

    move-result-object p0

    const-class v0, Lcom/whoop/stories/OnboardingStoriesDebugFragment$b;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lcom/whoop/stories/OnboardingStoriesDebugFragment$a;

    invoke-direct {v1}, Lcom/whoop/stories/OnboardingStoriesDebugFragment$a;-><init>()V

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final M(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Lcom/whoop/stories/a;->a(Ljava/lang/String;)Lcom/whoop/stories/a$a;

    move-result-object p1

    const-string v0, "actionDebugOnboardingToOnboarding(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object v0

    invoke-virtual {v0, p1}, Lor2/s;->f(Leb/p0;)V

    return-void
.end method

.method private static final N(Lcom/whoop/stories/OnboardingStoriesDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 36

    and-int/lit8 v1, p2, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eq v1, v4, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v5, p2, 0x1

    move-object/from16 v15, p1

    check-cast v15, Lp1/q;

    invoke-virtual {v15, v5, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v1, v5, :cond_1

    const-string v1, ""

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v15, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v1, Lp1/c1;

    int-to-float v6, v4

    const/16 v7, 0x8

    int-to-float v9, v7

    mul-float/2addr v6, v9

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    sget-object v14, Lb2/e;->M:Lb2/k;

    const/4 v10, 0x6

    invoke-static {v6, v14, v15, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v10, v15, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v15, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v13, v15, Lp1/q;->S:Z

    if-eqz v13, :cond_2

    invoke-virtual {v15, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_1
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v15, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v15, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v4, v15, Lp1/q;->S:Z

    if-nez v4, :cond_3

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    :cond_3
    invoke-static {v10, v15, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v15, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object v10, v11

    const/4 v11, 0x0

    move-object/from16 v17, v13

    const/4 v13, 0x7

    move-object/from16 v18, v12

    move v12, v9

    const/4 v9, 0x0

    move-object/from16 v19, v10

    const/4 v10, 0x0

    move-object/from16 v4, v17

    move-object/from16 v3, v18

    move-object/from16 v0, v19

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move/from16 v34, v12

    sget-object v9, Lb2/e;->K:Lb2/l;

    sget-object v10, Ll0/m;->a:Ll0/e;

    const/16 v11, 0x30

    invoke-static {v10, v9, v15, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v10, v15, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v15, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v12, v15, Lp1/q;->S:Z

    if-eqz v12, :cond_5

    invoke-virtual {v15, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v15, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v9, v15, Lp1/q;->S:Z

    if-nez v9, :cond_6

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    :cond_6
    invoke-static {v10, v15, v10, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    invoke-static {v15, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v8, 0x3f800000    # 1.0f

    float-to-double v9, v8

    const-wide/16 v11, 0x0

    cmpl-double v9, v9, v11

    if-lez v9, :cond_8

    goto :goto_3

    :cond_8
    const-string v9, "invalid weight; must be greater than zero"

    invoke-static {v9}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_3
    new-instance v9, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v10, 0x1

    invoke-direct {v9, v8, v10}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v8, Ll0/m;->c:Ll0/g;

    const/4 v10, 0x0

    invoke-static {v8, v14, v15, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v10, v15, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v15, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v12, v15, Lp1/q;->S:Z

    if-eqz v12, :cond_9

    invoke-virtual {v15, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_9
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v15, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v15, Lp1/q;->S:Z

    if-nez v3, :cond_a

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    :cond_a
    invoke-static {v10, v15, v10, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v15, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1}, Lcom/whoop/stories/OnboardingStoriesDebugFragment;->O(Lp1/c1;)Ljava/lang/String;

    move-result-object v0

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lg1/i8;->a:Lg1/i8;

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v15, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v8

    invoke-virtual {v3, v15, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->X0()J

    move-result-wide v12

    invoke-virtual {v3, v15, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->X0()J

    move-result-wide v16

    sget-wide v18, Li2/x;->d:J

    invoke-virtual {v3, v15, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v24

    const-wide/16 v30, 0x0

    const v33, 0x1e7f96

    move-object v10, v7

    move-wide v6, v8

    const-wide/16 v8, 0x0

    move-object v14, v10

    const-wide/16 v10, 0x0

    move-object/from16 v20, v14

    move-object/from16 v32, v15

    const-wide/16 v14, 0x0

    move-object/from16 v22, v20

    const-wide/16 v20, 0x0

    move-object/from16 v26, v22

    const-wide/16 v22, 0x0

    const-wide/16 v28, 0x0

    move-object/from16 v35, v26

    move-wide/from16 v26, v18

    invoke-static/range {v6 .. v33}, Lg1/i8;->h(JJJJJJJJJJJJJLandroidx/compose/runtime/Composer;I)Lg1/y1;

    move-result-object v21

    move-object/from16 v15, v32

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_c

    new-instance v6, Ljs2/e;

    const/16 v7, 0xa

    invoke-direct {v6, v7, v1}, Ljs2/e;-><init>(ILp1/c1;)V

    invoke-virtual {v15, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v7, v6

    check-cast v7, Lkotlin/jvm/functions/Function1;

    sget-object v26, Llh2/a;->a:Llh2/a;

    invoke-virtual/range {v26 .. v26}, Llh2/a;->d()Lc93/m;

    move-result-object v11

    const/16 v24, 0x0

    const v25, 0x7ffb8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v32, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v23, 0x1801b0

    move-object v6, v0

    move-object v8, v2

    move-object/from16 v22, v32

    invoke-static/range {v6 .. v25}, Lg1/u8;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lc93/m;Lc93/m;Lq3/g0;Lu0/r0;Lu0/q0;ZIILi2/a1;Lg1/y1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v22

    const/4 v10, 0x1

    invoke-virtual {v15, v10}, Lp1/q;->q(Z)V

    invoke-static {v1}, Lcom/whoop/stories/OnboardingStoriesDebugFragment;->O(Lp1/c1;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/2addr v0, v10

    const/4 v12, 0x0

    const/16 v13, 0xe

    const/4 v10, 0x0

    const/4 v11, 0x0

    move/from16 v9, v34

    move-object/from16 v8, v35

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object/from16 v2, p0

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_d

    if-ne v8, v5, :cond_e

    :cond_d
    new-instance v8, Ll01/q;

    const/16 v6, 0x10

    invoke-direct {v8, v6, v2, v1}, Ll01/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v15, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object v6, v8

    check-cast v6, Lc93/a;

    invoke-virtual/range {v26 .. v26}, Llh2/a;->c()Lkotlin/jvm/functions/Function3;

    move-result-object v14

    const v16, 0x30000030

    const/16 v17, 0x1f8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move v8, v0

    invoke-static/range {v6 .. v17}, Ldt/b;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    const/4 v10, 0x1

    invoke-virtual {v15, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v3, v15, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    invoke-virtual {v3, v15, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v8

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v30, v0, 0x12

    const v31, 0x2fffa

    const-string v6, "Examples"

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    const/4 v14, 0x0

    move-object/from16 v32, v15

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x6

    move-object/from16 v28, v32

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v28

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_f

    if-ne v1, v5, :cond_10

    :cond_f
    new-instance v1, Llc0/c;

    const/4 v0, 0x2

    invoke-direct {v1, v2, v0}, Llc0/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v15, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object v14, v1

    check-cast v14, Lkotlin/jvm/functions/Function1;

    const/16 v16, 0x0

    const/16 v17, 0x1ff

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v6 .. v17}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v10, 0x1

    invoke-virtual {v15, v10}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_11
    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final O(Lp1/c1;)Ljava/lang/String;
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

.method private static final P(Lp1/c1;Ljava/lang/String;)V
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

.method private static final Q(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lcom/whoop/stories/OnboardingStoriesDebugFragment;->P(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final R(Lcom/whoop/stories/OnboardingStoriesDebugFragment;Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-static {p1}, Lcom/whoop/stories/OnboardingStoriesDebugFragment;->O(Lp1/c1;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toUpperCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/stories/OnboardingStoriesDebugFragment;->M(Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final S(Lcom/whoop/stories/OnboardingStoriesDebugFragment;Ln0/q;)Ll83/a0;
    .locals 5

    const-string v0, "$this$LazyColumn"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/stories/OnboardingStoriesDebugFragment;->w:Ljava/util/List;

    sget-object v1, Lcom/whoop/stories/OnboardingStoriesDebugFragment$d;->w:Lcom/whoop/stories/OnboardingStoriesDebugFragment$d;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    new-instance v3, Lcom/whoop/stories/OnboardingStoriesDebugFragment$e;

    invoke-direct {v3, v1, v0}, Lcom/whoop/stories/OnboardingStoriesDebugFragment$e;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v1, Lcom/whoop/stories/OnboardingStoriesDebugFragment$f;

    invoke-direct {v1, v0, p0}, Lcom/whoop/stories/OnboardingStoriesDebugFragment$f;-><init>(Ljava/util/List;Lcom/whoop/stories/OnboardingStoriesDebugFragment;)V

    new-instance p0, Lx1/b;

    const/4 v0, 0x1

    const v4, 0x2fd4df92

    invoke-direct {p0, v1, v0, v4}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    check-cast p1, Ln0/f;

    const/4 v0, 0x0

    invoke-virtual {p1, v2, v0, v3, p0}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public getLogTag()Ljava/lang/String;
    .locals 1

    const-string v0, "DebugOnboardingStoryFragment"

    return-object v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lkk1/b;

    const/16 p2, 0x13

    invoke-direct {p1, p0, p2}, Lkk1/b;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x723e6cca

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
