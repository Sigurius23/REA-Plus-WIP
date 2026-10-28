.class public final Ldv1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\r*\u00020\u00102\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J)\u0010\u001c\u001a\u0004\u0018\u00010\u001a*\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Ldv1/a;",
        "",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Ljb1/a;",
        "reducer",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;Ljb1/a;)V",
        "",
        "selectedSegmentId",
        "d",
        "(Ljava/lang/String;)Ljb1/a;",
        "Lzu1/a$a;",
        "Lcv1/c;",
        "k",
        "(Lzu1/a$a;)Lcv1/c;",
        "Lzu1/c;",
        "Lcv1/c$c;",
        "dialog",
        "l",
        "(Lzu1/c;Lcv1/c$c;)Lcv1/c;",
        "spacing",
        "Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionSpacingType;",
        "i",
        "(Ljava/lang/String;)Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionSpacingType;",
        "",
        "Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;",
        "selectedCardId",
        "h",
        "(Ljava/util/Map;Ljava/lang/String;)Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;",
        "domainResult",
        "j",
        "(Lzu1/c;)Lcv1/c;",
        "a",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "b",
        "Ljb1/a;",
        "limited-time-offer_release"
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
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Ljb1/a;)V
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reducer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ldv1/a;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    .line 3
    iput-object p2, p0, Ldv1/a;->b:Ljb1/a;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    invoke-static {}, Ldv1/b;->b()Ljb1/a;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Ldv1/a;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Ljb1/a;)V

    return-void
.end method

.method public static synthetic a(Lcom/whoop/limitedtimeoffer/domain/models/TimerPillModel;)Lcv1/d;
    .locals 0

    invoke-static {p0}, Ldv1/a;->g(Lcom/whoop/limitedtimeoffer/domain/models/TimerPillModel;)Lcv1/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ldv1/a;->e(Ljava/lang/String;Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ldv1/a;->f(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final d(Ljava/lang/String;)Ljb1/a;
    .locals 2

    new-instance v0, Lb30/y4;

    const/16 v1, 0xf

    invoke-direct {v0, p1, v1}, Lb30/y4;-><init>(Ljava/lang/String;I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object p1

    return-object p1
.end method

.method private static final e(Ljava/lang/String;Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldo0/c;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ldo0/c;-><init>(I)V

    invoke-virtual {p1, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    const-class v0, Lq31/f;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Ldv1/a$a;

    invoke-direct {v1, p0}, Ldv1/a$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0, v1}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ldo0/c;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ldo0/c;-><init>(I)V

    const-class v1, Lcom/whoop/limitedtimeoffer/domain/models/TimerPillModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ldv1/a$b;

    invoke-direct {v2, v0}, Ldv1/a$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/limitedtimeoffer/domain/models/TimerPillModel;)Lcv1/d;
    .locals 9

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcv1/d;

    invoke-virtual {p0}, Lcom/whoop/limitedtimeoffer/domain/models/TimerPillModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/limitedtimeoffer/domain/models/TimerPillModel;->getPillIcon()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/limitedtimeoffer/domain/models/TimerPillModel;->getPillTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/limitedtimeoffer/domain/models/TimerPillModel;->getTimerMetadata()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p0

    instance-of v0, p0, Lcom/whoop/design/models/items/TimerMetaDataModel;

    const/4 v5, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Lcom/whoop/design/models/items/TimerMetaDataModel;

    goto :goto_0

    :cond_0
    move-object p0, v5

    :goto_0
    if-eqz p0, :cond_1

    invoke-static {p0}, Llb1/c5;->j(Lcom/whoop/design/models/items/TimerMetaDataModel;)Ln41/b;

    move-result-object v5

    :cond_1
    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lcv1/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ln41/b;Landroidx/compose/ui/Modifier;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private final h(Ljava/util/Map;Ljava/lang/String;)Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;"
        }
    .end annotation

    invoke-static {p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    :goto_0
    move-object p2, v1

    goto :goto_1

    :cond_0
    const-string v0, "null"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;

    return-object p1

    :cond_2
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;

    if-nez v0, :cond_5

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "toLowerCase(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;

    if-nez v2, :cond_4

    const-string v2, "_"

    const/4 v4, 0x0

    invoke-static {p2, v2, v1, v4}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;

    if-nez v1, :cond_3

    const-string v1, "(.)([A-Z])"

    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    const-string v2, "compile(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$1_$2"

    invoke-virtual {v1, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p2

    invoke-virtual {p2, v2}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v1, "replaceAll(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;

    return-object p1

    :cond_3
    return-object v1

    :cond_4
    return-object v2

    :cond_5
    return-object v0
.end method

.method private final i(Ljava/lang/String;)Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionSpacingType;
    .locals 1

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toUpperCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "NORMAL"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionSpacingType;->NORMAL:Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionSpacingType;

    return-object p1

    :cond_0
    const-string v0, "COMPACT"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionSpacingType;->COMPACT:Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionSpacingType;

    return-object p1

    :cond_1
    sget-object p1, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionSpacingType;->COMPACT:Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionSpacingType;

    return-object p1
.end method

.method private final k(Lzu1/a$a;)Lcv1/c;
    .locals 9

    instance-of v0, p1, Lzu1/a$b;

    if-eqz v0, :cond_0

    new-instance v1, Lcv1/c;

    new-instance v2, Lcv1/c$b;

    sget-object p1, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {p1}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcv1/c$b;-><init>(Lsz0/q0;Lcv1/a;Lcv1/a;Lcv1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    move-object v3, v2

    const/4 v2, 0x0

    invoke-direct/range {v1 .. v6}, Lcv1/c;-><init>(Lcv1/c$c;Lcv1/c$b;Lcv1/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    instance-of v0, p1, Lzu1/a$c;

    if-eqz v0, :cond_1

    new-instance v1, Lcv1/c;

    new-instance v2, Lcv1/c$b;

    sget-object v0, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v0}, Lsz0/o0;->c()Lsz0/q0;

    move-result-object v3

    new-instance v4, Lcv1/a$j;

    check-cast p1, Lzu1/a$c;

    invoke-virtual {p1}, Lzu1/a$c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lzu1/a$c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v4, v0, p1}, Lcv1/a$j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v6, Lcv1/a$e;->a:Lcv1/a$e;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lcv1/c$b;-><init>(Lsz0/q0;Lcv1/a;Lcv1/a;Lcv1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    const/4 v6, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcv1/c;-><init>(Lcv1/c$c;Lcv1/c$b;Lcv1/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    instance-of v0, p1, Lzu1/a$d;

    if-eqz v0, :cond_2

    new-instance v1, Lcv1/c;

    new-instance v2, Lcv1/c$b;

    sget-object v0, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v0}, Lsz0/o0;->e()Lsz0/q0;

    move-result-object v3

    new-instance v4, Lcv1/a$j;

    check-cast p1, Lzu1/a$d;

    invoke-virtual {p1}, Lzu1/a$d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lzu1/a$d;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v4, v0, p1}, Lcv1/a$j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v6, Lcv1/a$e;->a:Lcv1/a$e;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lcv1/c$b;-><init>(Lsz0/q0;Lcv1/a;Lcv1/a;Lcv1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    const/4 v6, 0x0

    move-object v3, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcv1/c;-><init>(Lcv1/c$c;Lcv1/c$b;Lcv1/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final l(Lzu1/c;Lcv1/c$c;)Lcv1/c;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Ldv1/a;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v2, "lto-plan-picker-ui-and-analytics-android"

    invoke-interface {v1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    invoke-virtual/range {p1 .. p1}, Lzu1/c;->h()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ldv1/a;->d(Ljava/lang/String;)Ljb1/a;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lzu1/c;->g()Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->getBottomStickyItems()Ljava/util/Map;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual/range {p1 .. p1}, Lzu1/c;->h()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v3, v5}, Ldv1/a;->h(Ljava/util/Map;Ljava/lang/String;)Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, v4

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lzu1/c;->g()Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->getImageUrl()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_1

    new-instance v6, Lkd1/o$c;

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    move-object v15, v6

    goto :goto_2

    :cond_1
    sget-object v6, Lkd1/o$b;->b:Lkd1/o$b;

    goto :goto_1

    :goto_2
    if-eqz v1, :cond_4

    invoke-static {v15}, Lkd1/p;->f(Lkd1/o;)Z

    move-result v5

    if-nez v5, :cond_4

    invoke-virtual/range {p1 .. p1}, Lzu1/c;->g()Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->getBackgroundImageUrl()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-static {v5}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_2

    move-object v8, v5

    goto :goto_3

    :cond_2
    move-object v8, v4

    :goto_3
    if-eqz v8, :cond_3

    new-instance v7, Lkd1/o$c;

    const/16 v12, 0xe

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_4
    move-object/from16 v16, v7

    goto :goto_5

    :cond_3
    sget-object v7, Lkd1/o$b;->b:Lkd1/o$b;

    goto :goto_4

    :cond_4
    sget-object v7, Lkd1/o$b;->b:Lkd1/o$b;

    goto :goto_4

    :goto_5
    if-eqz v1, :cond_b

    invoke-virtual/range {p1 .. p1}, Lzu1/c;->g()Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;

    move-result-object v5

    if-eqz v5, :cond_b

    invoke-virtual {v5}, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->getBottomStickyItems()Ljava/util/Map;

    move-result-object v5

    if-eqz v5, :cond_b

    invoke-interface {v5}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v5

    if-eqz v5, :cond_b

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_5
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;

    invoke-virtual {v7}, Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;->getText()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_5

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_6
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_7

    move-object v6, v4

    goto :goto_7

    :cond_7
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-nez v7, :cond_8

    goto :goto_7

    :cond_8
    move-object v7, v6

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    :cond_9
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    if-ge v7, v9, :cond_a

    move-object v6, v8

    move v7, v9

    :cond_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-nez v8, :cond_9

    :goto_7
    check-cast v6, Ljava/lang/String;

    move-object/from16 v17, v6

    goto :goto_8

    :cond_b
    move-object/from16 v17, v4

    :goto_8
    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v1, :cond_f

    invoke-virtual/range {p1 .. p1}, Lzu1/c;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_e

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;->getText()Ljava/lang/String;

    move-result-object v1

    goto :goto_9

    :cond_c
    move-object v1, v4

    :goto_9
    if-eqz v1, :cond_e

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_d

    goto :goto_a

    :cond_d
    move/from16 v18, v5

    goto :goto_c

    :cond_e
    :goto_a
    move/from16 v18, v6

    goto :goto_c

    :cond_f
    if-eqz v3, :cond_10

    invoke-virtual {v3}, Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;->getText()Ljava/lang/String;

    move-result-object v1

    goto :goto_b

    :cond_10
    move-object v1, v4

    :goto_b
    if-eqz v1, :cond_e

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_d

    goto :goto_a

    :goto_c
    if-eqz v3, :cond_12

    new-instance v4, Lcv1/c$e;

    invoke-virtual {v3}, Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;->getItems()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    invoke-virtual {v3}, Lcom/whoop/limitedtimeoffer/domain/models/LtoStickyModel;->getShouldDismissTile()Ljava/lang/Boolean;

    move-result-object v3

    if-eqz v3, :cond_11

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    goto :goto_d

    :cond_11
    move v3, v6

    :goto_d
    invoke-direct {v4, v1, v7, v3}, Lcv1/c$e;-><init>(Ljava/lang/String;Ljava/util/List;Z)V

    :cond_12
    move-object v11, v4

    invoke-virtual/range {p1 .. p1}, Lzu1/c;->g()Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;

    move-result-object v1

    if-eqz v1, :cond_14

    invoke-virtual {v1}, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->getToolBarTitle()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_14

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    if-nez v1, :cond_13

    goto :goto_f

    :cond_13
    :goto_e
    move-object v8, v1

    goto :goto_10

    :cond_14
    :goto_f
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    goto :goto_e

    :goto_10
    invoke-virtual/range {p1 .. p1}, Lzu1/c;->g()Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;

    move-result-object v1

    if-eqz v1, :cond_18

    invoke-virtual {v1}, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferModels;->getSections()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_18

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_17

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionModel;

    invoke-virtual {v4}, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionModel;->getSectionType()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_15

    invoke-direct {v0, v7}, Ldv1/a;->i(Ljava/lang/String;)Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionSpacingType;

    move-result-object v7

    if-nez v7, :cond_16

    :cond_15
    sget-object v7, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionSpacingType;->COMPACT:Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionSpacingType;

    :cond_16
    new-instance v9, Lcv1/c$a;

    invoke-virtual {v4}, Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionModel;->getItems()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v9, v4, v7}, Lcv1/c$a;-><init>(Ljava/util/List;Lcom/whoop/limitedtimeoffer/domain/models/LimitedTimeOfferSectionSpacingType;)V

    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_17
    :goto_12
    move-object v9, v3

    goto :goto_13

    :cond_18
    sget-object v3, Lm83/y;->w:Lm83/y;

    goto :goto_12

    :goto_13
    invoke-virtual/range {p1 .. p1}, Lzu1/c;->e()Z

    move-result v1

    if-nez v1, :cond_19

    invoke-virtual/range {p1 .. p1}, Lzu1/c;->d()Z

    move-result v1

    if-eqz v1, :cond_19

    move v10, v5

    goto :goto_14

    :cond_19
    move v10, v6

    :goto_14
    invoke-virtual/range {p1 .. p1}, Lzu1/c;->h()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lzu1/c;->i()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lzu1/c;->f()Ljava/lang/String;

    move-result-object v14

    new-instance v4, Lcv1/c$d;

    move-object v7, v4

    invoke-direct/range {v7 .. v18}, Lcv1/c$d;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;ZLcv1/c$e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lkd1/o;Ljava/lang/String;Z)V

    new-instance v1, Lcv1/c;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object/from16 v2, p2

    invoke-direct/range {v1 .. v6}, Lcv1/c;-><init>(Lcv1/c$c;Lcv1/c$b;Lcv1/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method


# virtual methods
.method public final j(Lzu1/c;)Lcv1/c;
    .locals 1

    const-string v0, "domainResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lzu1/c;->c()Lzu1/a;

    move-result-object v0

    instance-of v0, v0, Lzu1/a$a;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lzu1/c;->c()Lzu1/a;

    move-result-object p1

    check-cast p1, Lzu1/a$a;

    invoke-direct {p0, p1}, Ldv1/a;->k(Lzu1/a$a;)Lcv1/c;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ldv1/a;->l(Lzu1/c;Lcv1/c$c;)Lcv1/c;

    move-result-object p1

    return-object p1
.end method
