.class public abstract Llb1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/i$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "e",
        "()Llb1/y0;",
        "aiWeeklyPlanSuggestionMapper",
        "design-models_release"
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
.field private static final a:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llb1/a;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Llb1/a;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/i;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/i;->c(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionModel;)Ly41/f;
    .locals 0

    invoke-static {p0}, Llb1/i;->d(Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionModel;)Ly41/f;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/a;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Llb1/a;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/i$b;

    invoke-direct {v2, v0}, Llb1/i$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionModel;)Ly41/f;
    .locals 20

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionModel;->getTitleIcon()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_2

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v4

    array-length v5, v4

    move v6, v2

    :goto_0
    if-ge v6, v5, :cond_1

    aget-object v7, v4, v6

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    move-object v7, v3

    :goto_1
    move-object v9, v7

    goto :goto_2

    :cond_2
    move-object v9, v3

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionModel;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionModel;->getContributorSections()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v12, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/items/ContributorSectionModel;

    invoke-virtual {v5}, Lcom/whoop/design/models/items/ContributorSectionModel;->getContributorSectionTitle()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v5}, Lcom/whoop/design/models/items/ContributorSectionModel;->getContributors()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v5, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/design/models/items/ContributorModel;

    new-instance v13, Ly41/h;

    invoke-virtual {v8}, Lcom/whoop/design/models/items/ContributorModel;->getTitle()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v8}, Lcom/whoop/design/models/items/ContributorModel;->getSubtitle()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-direct {v13, v14, v8}, Ly41/h;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_3
    new-instance v5, Ly41/g;

    invoke-direct {v5, v6, v7}, Ly41/g;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionModel;->getSecondaryActionButton()Lcom/whoop/design/models/items/SecondaryActionButtonModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/SecondaryActionButtonModel;->getText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionModel;->getSecondaryActionButton()Lcom/whoop/design/models/items/SecondaryActionButtonModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/design/models/items/SecondaryActionButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lgz0/m0;->AI_SPARKLE:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v6

    array-length v7, v6

    :goto_5
    if-ge v2, v7, :cond_6

    aget-object v8, v6, v2

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_5

    move-object v3, v8

    goto :goto_6

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_6
    :goto_6
    if-nez v3, :cond_7

    goto :goto_7

    :cond_7
    move-object v5, v3

    :goto_7
    invoke-virtual {v1}, Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionModel;->getSecondaryActionButton()Lcom/whoop/design/models/items/SecondaryActionButtonModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/design/models/items/SecondaryActionButtonModel;->getAction()Lcom/whoop/navigation/e;

    move-result-object v2

    new-instance v13, Ly41/i;

    invoke-direct {v13, v0, v5, v2}, Ly41/i;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/navigation/e;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionModel;->getExplanationTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v1}, Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionModel;->getExplanation()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v1}, Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionModel;->getStyle()Lcom/whoop/design/models/items/AiWeeklyPlanSuggestionStyleModel;

    move-result-object v0

    if-nez v0, :cond_8

    const/4 v0, -0x1

    goto :goto_8

    :cond_8
    sget-object v1, Llb1/i$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_8
    const/4 v1, 0x1

    if-ne v0, v1, :cond_9

    sget-object v0, Ly41/e;->COMPACT:Ly41/e;

    :goto_9
    move-object/from16 v16, v0

    goto :goto_a

    :cond_9
    sget-object v0, Ly41/e;->DEFAULT:Ly41/e;

    goto :goto_9

    :goto_a
    new-instance v8, Ly41/f;

    const/16 v17, 0x0

    const/16 v18, 0x100

    const/16 v19, 0x0

    invoke-direct/range {v8 .. v19}, Ly41/f;-><init>(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ly41/i;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly41/e;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v8
.end method

.method public static final e()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/i;->a:Llb1/y0;

    return-object v0
.end method
