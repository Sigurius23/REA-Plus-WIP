.class public abstract Lyq0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\u000c*\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\"\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\"\u001a\u0010\u001c\u001a\u00020\u00138\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u0017\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;",
        "Lzq0/l;",
        "t",
        "(Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;)Lzq0/l;",
        "Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel;",
        "Lzq0/y;",
        "w",
        "(Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel;)Lzq0/y;",
        "Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;",
        "Lzq0/d0;",
        "x",
        "(Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;)Lzq0/d0;",
        "Lj71/c;",
        "y",
        "(Lj71/c;)Lj71/c;",
        "Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;",
        "Lzq0/u;",
        "v",
        "(Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;)Lzq0/u;",
        "Ljb1/a;",
        "a",
        "Ll83/h;",
        "q",
        "()Ljb1/a;",
        "graphNestedReducer",
        "b",
        "Ljb1/a;",
        "p",
        "communityEverydayStatsDesignItemReducer",
        "community-everyday-stats_release"
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
.field private static final a:Ll83/h;

.field private static final b:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lyq0/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lyq0/a;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lyq0/b;->a:Ll83/h;

    new-instance v0, Lvb1/a;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lvb1/a;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lyq0/b;->b:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel;)Lzq0/y;
    .locals 0

    invoke-static {p0}, Lyq0/b;->n(Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel;)Lzq0/y;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;)Lzq0/u;
    .locals 0

    invoke-static {p0}, Lyq0/b;->m(Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;)Lzq0/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyq0/b;->j(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;)Lzq0/l;
    .locals 0

    invoke-static {p0}, Lyq0/b;->o(Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;)Lzq0/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyq0/b;->s(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyq0/b;->u(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;)Lzq0/d0;
    .locals 0

    invoke-static {p0}, Lyq0/b;->l(Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;)Lzq0/d0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lyq0/b;->k(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i()Ljb1/a;
    .locals 1

    invoke-static {}, Lyq0/b;->r()Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method private static final j(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvb1/a;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Lvb1/a;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lvb1/a;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lvb1/a;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lyq0/b$a;

    invoke-direct {v3, v0}, Lyq0/b$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lvb1/a;

    const/16 v2, 0x18

    invoke-direct {v0, v2}, Lvb1/a;-><init>(I)V

    const-class v2, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lyq0/b$b;

    invoke-direct {v3, v0}, Lyq0/b$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lvb1/a;

    const/16 v2, 0x19

    invoke-direct {v0, v2}, Lvb1/a;-><init>(I)V

    const-class v2, Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lyq0/b$c;

    invoke-direct {v3, v0}, Lyq0/b$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lvb1/a;

    const/16 v2, 0x1a

    invoke-direct {v0, v2}, Lvb1/a;-><init>(I)V

    const-class v2, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lyq0/b$d;

    invoke-direct {v2, v0}, Lyq0/b$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;)Lzq0/d0;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lyq0/b;->x(Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;)Lzq0/d0;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;)Lzq0/u;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lyq0/b;->v(Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;)Lzq0/u;

    move-result-object p0

    return-object p0
.end method

.method private static final n(Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel;)Lzq0/y;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lyq0/b;->w(Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel;)Lzq0/y;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;)Lzq0/l;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lyq0/b;->t(Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;)Lzq0/l;

    move-result-object p0

    return-object p0
.end method

.method public static final p()Ljb1/a;
    .locals 1

    sget-object v0, Lyq0/b;->b:Ljb1/a;

    return-object v0
.end method

.method private static final q()Ljb1/a;
    .locals 1

    sget-object v0, Lyq0/b;->a:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljb1/a;

    return-object v0
.end method

.method private static final r()Ljb1/a;
    .locals 2

    new-instance v0, Lyk2/k;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lyk2/k;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    return-object v0
.end method

.method private static final s(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lj71/c;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lyq0/b$e;

    invoke-direct {v1}, Lyq0/b$e;-><init>()V

    invoke-virtual {p0, v0, v1}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;)Lzq0/l;
    .locals 17

    new-instance v0, Lyk2/k;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lyk2/k;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->getProgressSegmentCount()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->getActiveSegmentIndex()I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->getNextAction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->getBackAction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->getBackgroundImageUrl()Ljava/lang/String;

    move-result-object v1

    const/4 v7, 0x0

    if-eqz v1, :cond_1

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_0

    move-object v10, v1

    goto :goto_0

    :cond_0
    move-object v10, v7

    :goto_0
    if-eqz v10, :cond_1

    new-instance v9, Lkd1/o$c;

    const/16 v14, 0xe

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_1
    move-object v9, v7

    :goto_1
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->getPhotoRevealFraction()F

    move-result v1

    const/4 v8, 0x0

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v1, v8, v10}, Le93/b;->m(FFF)F

    move-result v8

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->getItems()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->getHeaderOverlayItems()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v0, v10}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->getFooterOverlayItems()Ljava/util/List;

    move-result-object v11

    invoke-virtual {v0, v11}, Ljb1/a;->m(Ljava/util/List;)Ljava/util/List;

    move-result-object v11

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->getAchievementBackgroundStyle()Lcom/whoop/design/models/AchievementsBackgroundStyle;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->getColors()Lcom/whoop/design/models/colortheme/ColorThemeModel;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/design/models/colortheme/ColorThemeModel;->getBackground()Lcom/whoop/design/models/colortheme/ColorBackgroundModel;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Llb1/f0;->a(Lcom/whoop/design/models/colortheme/ColorBackgroundModel;)Lm51/a;

    move-result-object v0

    move-object v13, v0

    goto :goto_2

    :cond_2
    move-object v13, v7

    :goto_2
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->getColors()Lcom/whoop/design/models/colortheme/ColorThemeModel;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/whoop/design/models/colortheme/ColorThemeModel;->getAccentColor()Lcom/whoop/design/models/colortheme/ColorValueModel;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Llb1/f0;->b(Lcom/whoop/design/models/colortheme/ColorValueModel;)Ly81/e;

    move-result-object v7

    :cond_3
    move-object v14, v7

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->getSecurityPolicy()Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityeverydaystats/domain/models/CommunitySnapshotContainerModel;->getBorderStyle()Lxq0/a;

    move-result-object v16

    move-object v7, v9

    move-object v9, v1

    new-instance v1, Lzq0/l;

    invoke-direct/range {v1 .. v16}, Lzq0/l;-><init>(Ljava/lang/String;IILcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lkd1/o;FLjava/util/List;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/models/AchievementsBackgroundStyle;Lm51/a;Ly81/e;Lcom/whoop/communityeverydaystats/domain/models/SecurityPolicyModel;Lxq0/a;)V

    return-object v1
.end method

.method private static final u(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llb1/b1;->a:Llb1/b1;

    invoke-virtual {v0}, Llb1/b1;->a()Llb1/y0;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljb1/b;->c(Llb1/y0;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;)Lzq0/u;
    .locals 28

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->getSubtitleStyle()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-static {}, Ly81/f;->values()[Ly81/f;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_1

    aget-object v5, v2, v4

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    move-object v5, v1

    :goto_1
    if-eqz v5, :cond_2

    :goto_2
    move-object v9, v5

    goto :goto_4

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    sget-object v5, Ly81/f;->ACCENT_ACTION:Ly81/f;

    goto :goto_2

    :cond_4
    :goto_3
    sget-object v5, Ly81/f;->STRAIN:Ly81/f;

    goto :goto_2

    :goto_4
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_6

    :cond_5
    new-instance v2, Lkd1/o$c;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->getImageUrl()Ljava/lang/String;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_5
    move-object v10, v2

    goto :goto_8

    :cond_6
    :goto_6
    new-instance v2, Lkd1/o$a;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->getIconKey()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgz0/n0;->a(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_7

    :cond_7
    sget-object v0, Lgz0/m0;->WEIGHTLIFTING:Lgz0/m0;

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    :goto_7
    invoke-direct {v2, v0}, Lkd1/o$a;-><init>(I)V

    goto :goto_5

    :goto_8
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->getTitleDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->getSubtitleDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_a

    :cond_8
    sget-object v0, Ly81/f;->TRANSPARENT:Ly81/f;

    :goto_9
    move-object v11, v0

    goto :goto_b

    :cond_9
    :goto_a
    sget-object v0, Ly81/f;->WHITE_10:Ly81/f;

    goto :goto_9

    :goto_b
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseTileModel;->getStats()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v12, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseStatModel;

    new-instance v13, Lsz0/q;

    invoke-virtual {v2}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseStatModel;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v2}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseStatModel;->getValueSuffix()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    move-object/from16 v17, v3

    goto :goto_d

    :cond_a
    move-object/from16 v17, v1

    :goto_d
    invoke-virtual {v2}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotExerciseStatModel;->getLabel()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    const/16 v26, 0xfb5

    const/16 v27, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v13 .. v27}, Lsz0/q;-><init>(Ljava/lang/Object;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;Lsz0/h1;Lsz0/g1;Lcom/whoop/design/util/TextResource;ZLy81/f;Ly81/f;Lsz0/f1;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_b
    new-instance v6, Lzq0/u;

    invoke-direct/range {v6 .. v12}, Lzq0/u;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Lkd1/o;Ly81/f;Ljava/util/List;)V

    return-object v6
.end method

.method private static final w(Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel;)Lzq0/y;
    .locals 10

    invoke-virtual {p0}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel;->getSubtitle()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, v1

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel;->getAvatar()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v0

    move-object v4, v0

    goto :goto_1

    :cond_1
    move-object v4, v1

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel;->getAction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel;->getTrailingButtons()Ljava/util/List;

    move-result-object p0

    if-nez p0, :cond_2

    sget-object p0, Lm83/y;->w:Lm83/y;

    :cond_2
    check-cast p0, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v0, 0xa

    invoke-static {p0, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel$TrailingButton;

    invoke-virtual {v0}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel$TrailingButton;->getIcon()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x1

    invoke-static {v7, v1, v8, v1}, Lgz0/n0;->f(Ljava/lang/String;Lgz0/m0;ILjava/lang/Object;)I

    move-result v7

    invoke-virtual {v0}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel$TrailingButton;->getAction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v8

    invoke-virtual {v0}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotHeaderModel$TrailingButton;->getMenu()Lcom/whoop/design/models/items/FabMenuModel;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {v0}, Llb1/p1;->f(Lcom/whoop/design/models/items/FabMenuModel;)Lvy0/d0;

    move-result-object v0

    goto :goto_3

    :cond_3
    move-object v0, v1

    :goto_3
    new-instance v9, Lzq0/y$a;

    invoke-direct {v9, v7, v8, v0}, Lzq0/y$a;-><init>(ILcom/whoop/navigation/models/GenericInteraction;Lvy0/d0;)V

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    new-instance v1, Lzq0/y;

    invoke-direct/range {v1 .. v6}, Lzq0/y;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;)V

    return-object v1
.end method

.method private static final x(Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;)Lzq0/d0;
    .locals 11

    invoke-virtual {p0}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->getTrendState()Lcom/whoop/design/models/TrendStateEnum;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/whoop/design/models/TrendStateEnum;->UNKNOWN:Lcom/whoop/design/models/TrendStateEnum;

    :cond_0
    invoke-static {v0}, Llb1/o;->a(Lcom/whoop/design/models/TrendStateEnum;)Lly0/a;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->getValueSuffix()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move-object v5, v1

    goto :goto_0

    :cond_1
    move-object v5, v2

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->getPreviousValue()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move-object v6, v1

    goto :goto_1

    :cond_2
    move-object v6, v2

    :goto_1
    invoke-virtual {v0}, Lly0/a;->a()Ly71/g;

    move-result-object v7

    invoke-virtual {v0}, Lly0/a;->b()Ly81/f;

    move-result-object v8

    invoke-virtual {p0}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->getBarStyles()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v9, 0xa

    invoke-static {v0, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v1, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/design/models/LegendStyle;

    invoke-static {v9}, Llb1/r2;->a(Lcom/whoop/design/models/LegendStyle;)Ly81/f;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    move-object v9, v1

    goto :goto_3

    :cond_4
    move-object v9, v2

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/communityeverydaystats/domain/models/SnapshotMetricCardModel;->getGraph()Lcom/whoop/design/models/items/graph/GraphModel;

    move-result-object p0

    if-eqz p0, :cond_8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/GraphModel;->getPlots()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_4

    :cond_5
    move-object p0, v2

    :goto_4
    if-eqz p0, :cond_8

    invoke-static {}, Lyq0/b;->q()Ljb1/a;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljb1/a;->l(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object p0

    instance-of v0, p0, Lj71/c;

    if-eqz v0, :cond_6

    move-object v2, p0

    check-cast v2, Lj71/c;

    :cond_6
    if-eqz v2, :cond_7

    invoke-static {v2}, Lyq0/b;->y(Lj71/c;)Lj71/c;

    move-result-object v0

    if-eqz v0, :cond_7

    move-object v2, v0

    goto :goto_5

    :cond_7
    move-object v2, p0

    :cond_8
    :goto_5
    move-object v10, v2

    new-instance v2, Lzq0/d0;

    invoke-direct/range {v2 .. v10}, Lzq0/d0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/f;Ljava/util/List;Lm91/u;)V

    return-object v2
.end method

.method private static final y(Lj71/c;)Lj71/c;
    .locals 27

    invoke-virtual/range {p0 .. p0}, Lj71/c;->e()Lj61/h;

    move-result-object v0

    invoke-virtual {v0}, Lj61/h;->h()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj61/c;

    invoke-virtual {v1}, Lj61/c;->l()Lj61/e;

    move-result-object v1

    sget-object v2, Lj61/e;->REGION_HIGHLIGHT:Lj61/e;

    if-ne v1, v2, :cond_1

    invoke-virtual/range {p0 .. p0}, Lj71/c;->e()Lj61/h;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lj71/c;->e()Lj61/h;

    move-result-object v0

    invoke-virtual {v0}, Lj61/h;->h()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v10, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lj61/c;

    invoke-virtual {v11}, Lj61/c;->l()Lj61/e;

    move-result-object v1

    sget-object v2, Lj61/e;->REGION_HIGHLIGHT:Lj61/e;

    if-ne v1, v2, :cond_2

    const/4 v1, 0x1

    int-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float v24, v1, v2

    const/16 v25, 0x7ff

    const/16 v26, 0x0

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

    const/16 v22, 0x0

    const/16 v23, 0x1

    invoke-static/range {v11 .. v26}, Lj61/c;->b(Lj61/c;FFFFLy81/e;Lj61/a;Lj61/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lj61/b;ZFILjava/lang/Object;)Lj61/c;

    move-result-object v11

    :cond_2
    invoke-interface {v10, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    const/16 v18, 0x1fbf

    const/16 v19, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    invoke-static/range {v3 .. v19}, Lj61/h;->b(Lj61/h;Lg61/b;Lg61/b;Lg61/b;Lg61/b;Lh2/c;Ljava/util/List;Ljava/util/List;Lj61/g;ZZLg61/g;JFILjava/lang/Object;)Lj61/h;

    move-result-object v21

    const/16 v25, 0xe

    const/16 v26, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v20, p0

    invoke-static/range {v20 .. v26}, Lj71/c;->b(Lj71/c;Lj61/h;Ljava/util/List;Lcom/whoop/design/models/items/graph/LayoutDirection;Ljava/lang/Object;ILjava/lang/Object;)Lj71/c;

    move-result-object v0

    return-object v0

    :cond_4
    return-object p0
.end method
