.class public final Ljv2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ#\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\u000b2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J#\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u000b2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u000bH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0010J\u0017\u0010\u0017\u001a\u00020\u00082\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00082\u0006\u0010\u001a\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0017\u0010#\u001a\u00020\u001f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010 \u001a\u0004\u0008!\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Ljv2/d;",
        "",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;",
        "result",
        "Ljv2/c;",
        "g",
        "(Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;)Ljv2/c;",
        "",
        "Lcom/whoop/weightlifting/data/dto/WorkoutMetadataDescriptionsItem;",
        "workoutMetadataList",
        "Ljv2/e;",
        "c",
        "(Ljava/util/List;)Ljava/util/List;",
        "Lcom/whoop/weightlifting/data/dto/TitleMetricTilesItem;",
        "titleMetricTiles",
        "Lsz0/q;",
        "b",
        "Liv2/a;",
        "fullScreenModal",
        "f",
        "(Liv2/a;)Ljv2/c;",
        "Liv2/c;",
        "domainState",
        "d",
        "(Liv2/c;)Ljv2/c;",
        "a",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Ljb1/a;",
        "Ljb1/a;",
        "getReducer",
        "()Ljb1/a;",
        "reducer",
        "weightlifting_release"
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
.field private final a:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final b:Ljb1/a;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljv2/d;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    new-instance p1, Ljp2/f;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Ljp2/f;-><init>(I)V

    invoke-static {p1}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object p1

    iput-object p1, p0, Ljv2/d;->b:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljv2/d;->e(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final b(Ljava/util/List;)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/TitleMetricTilesItem;",
            ">;)",
            "Ljava/util/List<",
            "Lsz0/q;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/weightlifting/data/dto/TitleMetricTilesItem;

    new-instance v3, Lsz0/q;

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/dto/TitleMetricTilesItem;->getMetricValueDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/dto/TitleMetricTilesItem;->getMetricUnitDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/dto/TitleMetricTilesItem;->getMetricSubtitleDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    const/16 v16, 0xfb5

    const/16 v17, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v3 .. v17}, Lsz0/q;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZLy81/f;Ly81/f;Lsz0/f1;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private final c(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/dto/WorkoutMetadataDescriptionsItem;",
            ">;)",
            "Ljava/util/List<",
            "Ljv2/e;",
            ">;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/weightlifting/data/dto/WorkoutMetadataDescriptionsItem;

    new-instance v2, Ljv2/e;

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/dto/WorkoutMetadataDescriptionsItem;->getMetadataTitleDisplay()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/dto/WorkoutMetadataDescriptionsItem;->getMetadataValueDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v3, v1}, Ljv2/e;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private static final e(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final f(Liv2/a;)Ljv2/c;
    .locals 7

    sget-object v0, Liv2/a$a;->a:Liv2/a$a;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Ljv2/c$a;->e:Ljv2/c$a$a;

    invoke-virtual {p1}, Ljv2/c$a$a;->a()Ljv2/c$a;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Liv2/a$b;->a:Liv2/a$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Ljv2/c$a;->e:Ljv2/c$a$a;

    invoke-virtual {p1}, Ljv2/c$a$a;->b()Ljv2/c$a;

    move-result-object v0

    sget-object v4, Ljv2/a$a;->a:Ljv2/a$a;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Ljv2/c$a;->e(Ljv2/c$a;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljv2/a;ILjava/lang/Object;)Ljv2/c$a;

    move-result-object p1

    return-object p1

    :cond_1
    sget-object v0, Liv2/a$c;->a:Liv2/a$c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Ljv2/c$a;->e:Ljv2/c$a$a;

    invoke-virtual {p1}, Ljv2/c$a$a;->c()Ljv2/c$a;

    move-result-object v0

    sget-object v4, Ljv2/a$a;->a:Ljv2/a$a;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v6}, Ljv2/c$a;->e(Ljv2/c$a;Lsz0/p0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljv2/a;ILjava/lang/Object;)Ljv2/c$a;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final g(Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;)Ljv2/c;
    .locals 20

    move-object/from16 v0, p0

    if-nez p1, :cond_0

    sget-object v1, Liv2/a$c;->a:Liv2/a$c;

    invoke-direct {v0, v1}, Ljv2/d;->f(Liv2/a;)Ljv2/c;

    move-result-object v1

    return-object v1

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->getDetailsPageTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->getPrebuiltTemplateDetailsHeader()Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->getWorkoutTitleDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->getPrebuiltTemplateDetailsHeader()Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->getWorkoutSubtitleDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->getWorkoutSummaryDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    new-instance v8, Lkd1/o$c;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->getPrebuiltTemplateDetailsHeader()Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->getBackgroundImageUrl()Ljava/lang/String;

    move-result-object v9

    const/16 v13, 0xe

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v8 .. v14}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->getExercises()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;

    new-instance v14, Ljv2/a$d;

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getExerciseId()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v14, v9}, Ljv2/a$d;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getExerciseId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v2}, Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;->getImageUrl()Ljava/lang/String;

    move-result-object v12

    iget-object v2, v0, Ljv2/d;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v9, "exercise-details-image-navigation-android"

    invoke-interface {v2, v9}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v2, v14

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-nez v2, :cond_2

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    :cond_2
    move-object/from16 v16, v2

    new-instance v9, Lo11/m$c$a;

    const/4 v13, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x88

    const/16 v19, 0x0

    move-object v15, v14

    invoke-direct/range {v9 .. v19}, Lo11/m$c$a;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->getCallToActionDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->getPrebuiltTemplateDetailsHeader()Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weightlifting/data/dto/PrebuiltTemplateDetailsHeader;->getTitleMetricTiles()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljv2/d;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->getWorkoutMetadataDescriptions()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljv2/d;->c(Ljava/util/List;)Ljava/util/List;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;->getExerciseListTitleDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    new-instance v2, Ljv2/c$b;

    invoke-direct/range {v2 .. v12}, Ljv2/c$b;-><init>(Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;)V

    return-object v2
.end method


# virtual methods
.method public final d(Liv2/c;)Ljv2/c;
    .locals 1

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Liv2/c;->a()Liv2/a;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Liv2/c;->a()Liv2/a;

    move-result-object p1

    invoke-direct {p0, p1}, Ljv2/d;->f(Liv2/a;)Ljv2/c;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Liv2/c;->b()Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;

    move-result-object p1

    invoke-direct {p0, p1}, Ljv2/d;->g(Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;)Ljv2/c;

    move-result-object p1

    return-object p1
.end method
