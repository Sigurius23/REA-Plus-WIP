.class public final Lao1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnd1/j;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R \u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lao1/j;",
        "Lnd1/j;",
        "<init>",
        "()V",
        "Ltf3/a;",
        "define",
        "()Ltf3/a;",
        "",
        "a",
        "Ljava/util/List;",
        "getDependencies",
        "()Ljava/util/List;",
        "dependencies",
        "hormonal-insights_release"
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
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lnd1/j;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lnd1/i;

    invoke-direct {v0}, Lnd1/i;-><init>()V

    new-instance v1, Lv82/a;

    invoke-direct {v1}, Lv82/a;-><init>()V

    const/4 v2, 0x2

    new-array v2, v2, [Lnd1/j;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lao1/j;->a:Ljava/util/List;

    return-void
.end method

.method public static synthetic A(Lxf3/c;Luf3/a;)Llo1/b;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->b1(Lxf3/c;Luf3/a;)Llo1/b;

    move-result-object p0

    return-object p0
.end method

.method private static final A0(Lxf3/c;Luf3/a;)Lso1/f0;
    .locals 7

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lso1/f0;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Loo1/k;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loo1/k;

    const-class v3, Lto1/n;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lto1/n;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lso1/f0;-><init>(Loo1/k;Lto1/n;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic B(Lxf3/c;Luf3/a;)Lao1/c;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->g0(Lxf3/c;Luf3/a;)Lao1/c;

    move-result-object p0

    return-object p0
.end method

.method private static final B0(Lxf3/c;Luf3/a;)Lro1/k;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lro1/k;

    new-instance v1, Lal0/g;

    const/4 v2, 0x3

    invoke-direct {v1, p1, v2}, Lal0/g;-><init>(Luf3/a;I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lj02/o0;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {p0, v1, v3, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj02/o0;

    const-class v1, Leb/a0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p1, v3}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Leb/a0;

    invoke-direct {v0, p0, p1}, Lro1/k;-><init>(Lj02/o0;Leb/a0;)V

    return-object v0

    :cond_0
    new-instance p0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "No value found for type \'"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x27

    invoke-static {v2, v1, p1, v0}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic C(Lxf3/c;Luf3/a;)Lso1/o;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->x0(Lxf3/c;Luf3/a;)Lso1/o;

    move-result-object p0

    return-object p0
.end method

.method private static final C0(Luf3/a;)Luf3/a;
    .locals 4

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {p0, v2}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "No value found for type \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v3, 0x27

    invoke-static {v0, v1, v2, v3}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic D(Lxf3/c;Luf3/a;)Ljava/util/Map;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->f0(Lxf3/c;Luf3/a;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final D0(Lxf3/c;Luf3/a;)Lup1/a;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lup1/a;

    const-class v0, Lzr2/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzr2/a;

    invoke-direct {p1, p0}, Lup1/a;-><init>(Lzr2/a;)V

    return-object p1
.end method

.method public static synthetic E(Lxf3/c;Luf3/a;)Lmo1/a;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->X0(Lxf3/c;Luf3/a;)Lmo1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final E0(Lxf3/c;Luf3/a;)Lad3/c;
    .locals 8

    const-string v0, "it"

    const-string v1, "hormonal-insights-feature-models"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    const-class v0, Ljava/util/Map;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/util/Map;

    const/16 v6, 0x1e

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v7}, Lcom/whoop/design/json/b;->e(Lxf3/c;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Liy1/c;Lrr2/c;ILjava/lang/Object;)Lad3/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lxf3/c;Luf3/a;)Lao1/a;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->P0(Lxf3/c;Luf3/a;)Lao1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final F0(Lxf3/c;Luf3/a;)Lqp1/f;
    .locals 9

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    const-class v0, Lin2/d;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lin2/d;

    new-instance v0, Lvf3/c;

    const-string v2, "mainPrefs"

    invoke-direct {v0, v2}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v2, Lu92/d;

    invoke-virtual {p1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lu92/d;

    new-instance v2, Lqp1/f;

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lqp1/f;-><init>(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Lu92/d;Lin2/d;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method public static synthetic G(Lxf3/c;Luf3/a;)Lfp1/f;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->i0(Lxf3/c;Luf3/a;)Lfp1/f;

    move-result-object p0

    return-object p0
.end method

.method private static final G0(Lxf3/c;Luf3/a;)Leo1/b;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Leo1/b;

    const-class v0, Lcom/whoop/hormonalinsights/fertility/api/FertilitySettingsApi;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/hormonalinsights/fertility/api/FertilitySettingsApi;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Leo1/b;-><init>(Lcom/whoop/hormonalinsights/fertility/api/FertilitySettingsApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public static synthetic H(Lxf3/c;Luf3/a;)Lcp1/j;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->o0(Lxf3/c;Luf3/a;)Lcp1/j;

    move-result-object p0

    return-object p0
.end method

.method private static final H0(Lxf3/c;Luf3/a;)Lqp1/c;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lqp1/c;

    invoke-direct {p0}, Lqp1/c;-><init>()V

    return-object p0
.end method

.method public static synthetic I(Lxf3/c;Luf3/a;)Lzo1/d;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->n0(Lxf3/c;Luf3/a;)Lzo1/d;

    move-result-object p0

    return-object p0
.end method

.method private static final I0(Lxf3/c;Luf3/a;)Ltp1/n;
    .locals 11

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ltp1/n;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lqp1/f;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqp1/f;

    const-class v3, Leo1/b;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Leo1/b;

    const-class v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v5, Lqp1/c;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lqp1/c;

    const-class v6, Lup1/a;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lup1/a;

    const/16 v9, 0x60

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v10}, Ltp1/n;-><init>(Lqp1/f;Leo1/b;Lcom/whoop/data/repositories/FeatureFlagChecker;Lqp1/c;Lup1/a;Lbc3/c0;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic J(Lxf3/c;Luf3/a;)Lho1/a;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->c1(Lxf3/c;Luf3/a;)Lho1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final J0(Lxf3/c;Luf3/a;)Lto1/d;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lto1/d;

    invoke-direct {p0}, Lto1/d;-><init>()V

    return-object p0
.end method

.method public static synthetic K(Lxf3/c;Luf3/a;)Lko1/c;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->Y0(Lxf3/c;Luf3/a;)Lko1/c;

    move-result-object p0

    return-object p0
.end method

.method private static final K0(Lxf3/c;Luf3/a;)Lpo1/c;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lpo1/c;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    const-class v3, Lbc3/c0;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lbc3/c0;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lpo1/c;-><init>(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Ltr2/n;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic L(Lxf3/c;Luf3/a;)Lko1/a;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->a1(Lxf3/c;Luf3/a;)Lko1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final L0(Lxf3/c;Luf3/a;)Lso1/w;
    .locals 7

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lso1/w;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lpo1/c;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpo1/c;

    const-class v3, Lto1/d;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lto1/d;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lso1/w;-><init>(Lpo1/c;Lto1/d;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic M(Lxf3/c;Luf3/a;)Lzp1/c;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->M0(Lxf3/c;Luf3/a;)Lzp1/c;

    move-result-object p0

    return-object p0
.end method

.method private static final M0(Lxf3/c;Luf3/a;)Lzp1/c;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lzp1/c;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    new-instance v3, Lvf3/c;

    const-string v4, "hormonal-insights-polymorphic-json"

    invoke-direct {v3, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Lad3/c;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lad3/c;

    invoke-direct {p1, v1, p0}, Lzp1/c;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lad3/c;)V

    return-object p1
.end method

.method public static synthetic N(Lxf3/c;Luf3/a;)Lpo1/c;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->K0(Lxf3/c;Luf3/a;)Lpo1/c;

    move-result-object p0

    return-object p0
.end method

.method private static final N0(Lxf3/c;Luf3/a;)Lwp1/c;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lwp1/c;

    const-class v0, Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lwp1/c;-><init>(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public static synthetic O(Luf3/a;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lao1/j;->S0(Luf3/a;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final O0(Lxf3/c;Luf3/a;)Lyp1/a;
    .locals 9

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lyp1/a;

    iget-object p1, p1, Luf3/a;->a:Ljava/util/ArrayList;

    const/4 v0, 0x0

    invoke-static {v0, p1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/String;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v0, Ljava/lang/String;

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    const/4 v0, 0x1

    invoke-static {v0, p1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_1

    check-cast p1, Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object p1, v3

    :goto_1
    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v4, Lwp1/c;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v3, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwp1/c;

    const-class v5, Lzp1/c;

    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v3, v0, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lzp1/c;

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v3, p1

    invoke-direct/range {v1 .. v8}, Lyp1/a;-><init>(Ljava/lang/String;Ljava/lang/String;Lwp1/c;Lzp1/c;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic P(Ljava/util/Map;Lu82/i;)Luf3/a;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->t0(Ljava/util/Map;Lu82/i;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final P0(Lxf3/c;Luf3/a;)Lao1/a;
    .locals 3

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lao1/a;

    new-instance v0, Lvf3/c;

    const-string v1, "hormonal-insights-polymorphic-json"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v1, Lad3/c;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lad3/c;

    new-instance v1, Lao1/g;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lao1/g;-><init>(Lxf3/c;I)V

    invoke-direct {p1, v0, v1}, Lao1/a;-><init>(Lad3/c;Lc93/a;)V

    return-object p1
.end method

.method public static synthetic Q(Lxf3/c;Luf3/a;)Lyp1/a;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->O0(Lxf3/c;Luf3/a;)Lyp1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final Q0(Lxf3/c;)Lmo1/d;
    .locals 2

    const-class v0, Lmo1/d;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmo1/d;

    return-object p0
.end method

.method public static synthetic R(Lxf3/c;Luf3/a;)Loo1/k;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->z0(Lxf3/c;Luf3/a;)Loo1/k;

    move-result-object p0

    return-object p0
.end method

.method private static final R0(Lxf3/c;Luf3/a;)Lxp1/b;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxp1/b;

    new-instance v1, Lal0/g;

    const/4 v2, 0x4

    invoke-direct {v1, p1, v2}, Lal0/g;-><init>(Luf3/a;I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lj02/o0;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {p0, v1, v3, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj02/o0;

    const-class v1, Leb/a0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p1, v3}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Leb/a0;

    invoke-direct {v0, p0, p1}, Lxp1/b;-><init>(Lj02/o0;Leb/a0;)V

    return-object v0

    :cond_0
    new-instance p0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "No value found for type \'"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x27

    invoke-static {v2, v1, p1, v0}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic S(Lxf3/c;Luf3/a;)Lkp1/e;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->f1(Lxf3/c;Luf3/a;)Lkp1/e;

    move-result-object p0

    return-object p0
.end method

.method private static final S0(Luf3/a;)Luf3/a;
    .locals 4

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {p0, v2}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "No value found for type \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v3, 0x27

    invoke-static {v0, v1, v2, v3}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic T(Lxf3/c;Luf3/a;)Lmo1/d;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->V0(Lxf3/c;Luf3/a;)Lmo1/d;

    move-result-object p0

    return-object p0
.end method

.method private static final T0(Lxf3/c;Luf3/a;)Lio1/g;
    .locals 12

    const-string v0, "it"

    const-string v1, "hormonal-insights-feature-models"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Ljava/util/Map;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Ljava/util/Map;

    const/16 v9, 0x1e

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v10}, Lcom/whoop/design/json/b;->e(Lxf3/c;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Liy1/c;Lrr2/c;ILjava/lang/Object;)Lad3/c;

    move-result-object p0

    new-instance p1, Lu82/i;

    invoke-direct {p1, p0}, Lu82/i;-><init>(Lad3/c;)V

    new-instance v5, Lio1/g;

    new-instance p0, Lao1/e;

    const/4 v1, 0x1

    invoke-direct {p0, v4, p1, v1}, Lao1/e;-><init>(Ljava/util/Map;Lu82/i;I)V

    const-class p1, Lnm0/e;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {v3, p0, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lnm0/e;

    const-class p0, Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    invoke-virtual {v3, v2, p0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    const-class p0, Lzr2/a;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    invoke-virtual {v3, v2, p0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v8, p0

    check-cast v8, Lzr2/a;

    const-class p0, Lwm0/a;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    invoke-virtual {v3, v2, p0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v9, p0

    check-cast v9, Lwm0/a;

    const-class p0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    invoke-virtual {v3, v2, p0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v10, p0

    check-cast v10, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class p0, Ltr2/n;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    invoke-virtual {v3, v2, p0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v11, p0

    check-cast v11, Ltr2/n;

    invoke-direct/range {v5 .. v11}, Lio1/g;-><init>(Lnm0/e;Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Lzr2/a;Lwm0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V

    return-object v5
.end method

.method public static synthetic U(Lxf3/c;Luf3/a;)Lto1/e;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->p0(Lxf3/c;Luf3/a;)Lto1/e;

    move-result-object p0

    return-object p0
.end method

.method private static final U0(Ljava/util/Map;Lu82/i;)Luf3/a;
    .locals 0

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic V(Lxf3/c;Luf3/a;)Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->d1(Lxf3/c;Luf3/a;)Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    move-result-object p0

    return-object p0
.end method

.method private static final V0(Lxf3/c;Luf3/a;)Lmo1/d;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lmo1/d;

    new-instance p1, Lao1/h;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lao1/h;-><init>(Lxf3/c;I)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lor2/u0;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, p1, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lor2/u0;

    const-class p1, Lzr2/a;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v3, p1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lzr2/a;

    sget-object v5, Lmo1/d$a;->CHECKBOX:Lmo1/d$a;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v7}, Lmo1/d;-><init>(Lor2/u0;Lzr2/a;Ltr2/n;Lmo1/d$a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic W(Lxf3/c;Luf3/a;)Lhp1/g;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->k0(Lxf3/c;Luf3/a;)Lhp1/g;

    move-result-object p0

    return-object p0
.end method

.method private static final W0(Lxf3/c;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lpf/c;->i(Lxf3/c;)Landroid/content/Context;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X(Lxf3/c;Luf3/a;)Lip1/a;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->j0(Lxf3/c;Luf3/a;)Lip1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final X0(Lxf3/c;Luf3/a;)Lmo1/a;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lmo1/a;

    const-class v0, Lmo1/d;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmo1/d;

    invoke-direct {p1, p0}, Lmo1/a;-><init>(Lmo1/d;)V

    return-object p1
.end method

.method public static synthetic Y(Ljava/util/Map;Lu82/i;)Luf3/a;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->U0(Ljava/util/Map;Lu82/i;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final Y0(Lxf3/c;Luf3/a;)Lko1/c;
    .locals 11

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Landroidx/fragment/app/r0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {p1, v2}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object v2

    const/16 v3, 0x27

    const-string v4, "No value found for type \'"

    if-eqz v2, :cond_1

    check-cast v2, Landroidx/fragment/app/r0;

    const-class v1, Leb/a0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p1, v5}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    move-object v7, p1

    check-cast v7, Leb/a0;

    new-instance v5, Lko1/c;

    new-instance p1, Lao1/f;

    const/4 v1, 0x0

    invoke-direct {p1, v2, v1}, Lao1/f;-><init>(Landroidx/fragment/app/r0;I)V

    const-class v1, Lj02/o0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lj02/o0;

    const/4 v9, 0x4

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lko1/c;-><init>(Lj02/o0;Leb/a0;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :cond_0
    new-instance p0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, p1, v3}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v1, p1, v3}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic Z(Lxf3/c;Luf3/a;)Ltp1/n;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->I0(Lxf3/c;Luf3/a;)Ltp1/n;

    move-result-object p0

    return-object p0
.end method

.method private static final Z0(Landroidx/fragment/app/r0;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lxf3/c;Luf3/a;)Lkp1/b;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->i1(Lxf3/c;Luf3/a;)Lkp1/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a0(Lxf3/c;Luf3/a;)Lxp1/b;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->R0(Lxf3/c;Luf3/a;)Lxp1/b;

    move-result-object p0

    return-object p0
.end method

.method private static final a1(Lxf3/c;Luf3/a;)Lko1/a;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lko1/a;

    const-class v0, Lho1/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lho1/a;

    invoke-direct {p1, p0}, Lko1/a;-><init>(Lho1/a;)V

    return-object p1
.end method

.method public static synthetic b(Lxf3/c;)Lmo1/d;
    .locals 0

    invoke-static {p0}, Lao1/j;->Q0(Lxf3/c;)Lmo1/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b0(Lxf3/c;Luf3/a;)Lcom/whoop/hormonalinsights/fertility/api/FertilitySettingsApi;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->e1(Lxf3/c;Luf3/a;)Lcom/whoop/hormonalinsights/fertility/api/FertilitySettingsApi;

    move-result-object p0

    return-object p0
.end method

.method private static final b1(Lxf3/c;Luf3/a;)Llo1/b;
    .locals 8

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llo1/b;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lio1/g;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio1/g;

    const-class v3, Lmo1/a;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lmo1/a;

    const-class v4, Lho1/a;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lho1/a;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Llo1/b;-><init>(Lio1/g;Lmo1/a;Lho1/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic c(Lxf3/c;Luf3/a;)Lto1/b;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->v0(Lxf3/c;Luf3/a;)Lto1/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c0(Lxf3/c;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lao1/j;->W0(Lxf3/c;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final c1(Lxf3/c;Luf3/a;)Lho1/a;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lho1/a;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lfi0/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfi0/a;

    const-class v3, Lyn1/b;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lyn1/b;

    invoke-direct {p1, v1, p0}, Lho1/a;-><init>(Lfi0/a;Lyn1/b;)V

    return-object p1
.end method

.method public static synthetic d(Lxf3/c;Luf3/a;)Lto1/d;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->J0(Lxf3/c;Luf3/a;)Lto1/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d0(Lxf3/c;Luf3/a;)Lao1/b;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->r0(Lxf3/c;Luf3/a;)Lao1/b;

    move-result-object p0

    return-object p0
.end method

.method private static final d1(Lxf3/c;Luf3/a;)Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;
    .locals 11

    const-string v0, "it"

    const-string v1, "hormonal-insights-feature-models"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Ljava/util/Map;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Ljava/util/Map;

    const/16 v9, 0x1e

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v10}, Lcom/whoop/design/json/b;->e(Lxf3/c;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Liy1/c;Lrr2/c;ILjava/lang/Object;)Lad3/c;

    move-result-object p0

    new-instance p1, Lpg3/x0;

    invoke-direct {p1}, Lpg3/x0;-><init>()V

    const-class v1, Lsr2/y;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v3, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsr2/y;

    invoke-virtual {v1}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lpg3/x0;->c(Ljava/lang/String;)V

    invoke-static {p0}, Lu82/f;->a(Lad3/c;)Lpg3/m;

    move-result-object p0

    invoke-virtual {p1, p0}, Lpg3/x0;->b(Lpg3/m;)V

    new-instance p0, Lvf3/c;

    const-string v1, "defaultOkHttpClient"

    invoke-direct {p0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v1, Lud3/l0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {v3, v2, v0, p0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lud3/l0;

    const-class v0, Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    const-string v1, "create(...)"

    invoke-static {p1, p0, v0, v1}, Lb9/y;->f(Lpg3/x0;Lud3/l0;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    return-object p0
.end method

.method public static synthetic e(Lxf3/c;Luf3/a;)Lop1/b;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->h1(Lxf3/c;Luf3/a;)Lop1/b;

    move-result-object p0

    return-object p0
.end method

.method private static final e0(Ltf3/a;)Ll83/a0;
    .locals 13

    const-string v0, "$this$module"

    const-string v1, "hormonal-insights-feature-models"

    invoke-static {p0, v0, v1}, Lm4/a;->s(Ltf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object v5

    new-instance v6, Lal0/d;

    const/16 v0, 0x10

    invoke-direct {v6, v0}, Lal0/d;-><init>(I)V

    new-instance v2, Lqf3/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Ljava/util/Map;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    sget-object v8, Lwf3/a;->e:Lvf3/c;

    const/4 v12, 0x1

    move-object v3, v8

    move v7, v12

    invoke-direct/range {v2 .. v7}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v4, v5, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v2}, Lrf3/b;-><init>(Lqf3/b;)V

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lal0/d;

    const/16 v1, 0x12

    invoke-direct {v11, v1}, Lal0/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lao1/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, p0, v1, v2}, Lm4/a;->p(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)Lrf3/d;

    move-result-object v1

    const-class v3, Ljb1/e;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const-string v4, "clazz"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v1, Lrf3/b;->a:Lqf3/b;

    iget-object v6, v5, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v6, Ljava/util/Collection;

    invoke-static {v3, v6}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v6

    iput-object v6, v5, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v6, v5, Lqf3/b;->c:Lvf3/a;

    iget-object v5, v5, Lqf3/b;->a:Lvf3/a;

    invoke-static {v3, v6, v5}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x1

    invoke-virtual {p0, v3, v1, v5}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/4 v1, 0x0

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lao1/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, p0, v1, v2}, Lm4/a;->p(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)Lrf3/d;

    move-result-object v1

    const-class v3, Lm91/s;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v1, Lrf3/b;->a:Lqf3/b;

    iget-object v7, v6, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v7, Ljava/util/Collection;

    invoke-static {v3, v7}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v7

    iput-object v7, v6, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v7, v6, Lqf3/b;->c:Lvf3/a;

    iget-object v6, v6, Lqf3/b;->a:Lvf3/a;

    invoke-static {v3, v7, v6}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3, v1, v5}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lvf3/c;

    const-string v1, "hormonal-insights-polymorphic-json"

    invoke-direct {v10, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    new-instance v11, Lao1/d;

    const/16 v1, 0xc

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lad3/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/16 v1, 0x16

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lao1/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, p0, v1, v2}, Lm4/a;->p(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)Lrf3/d;

    move-result-object v1

    const-class v3, Ljb1/d;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v1, Lrf3/b;->a:Lqf3/b;

    iget-object v6, v4, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v6, Ljava/util/Collection;

    invoke-static {v3, v6}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v6

    iput-object v6, v4, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v6, v4, Lqf3/b;->c:Lvf3/a;

    iget-object v4, v4, Lqf3/b;->a:Lvf3/a;

    invoke-static {v3, v6, v4}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3, v1, v5}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/16 v1, 0x17

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/16 v1, 0x18

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/hormonalinsights/fertility/api/FertilitySettingsApi;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/16 v1, 0x19

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lkp1/e;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    const/4 v12, 0x2

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/16 v1, 0x1a

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lop1/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/16 v1, 0x1b

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lkp1/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lal0/d;

    const/16 v1, 0x1b

    invoke-direct {v11, v1}, Lal0/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lnp1/i;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/16 v1, 0x8

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lfp1/f;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/16 v1, 0x13

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lip1/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/16 v1, 0x1c

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lhp1/g;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/16 v1, 0x1d

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lyn1/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/i;

    const/4 v1, 0x0

    invoke-direct {v11, v1}, Lao1/i;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Ldp1/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/i;

    const/4 v1, 0x1

    invoke-direct {v11, v1}, Lao1/i;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lzo1/d;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/i;

    const/4 v1, 0x2

    invoke-direct {v11, v1}, Lao1/i;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lcp1/j;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/i;

    const/4 v1, 0x3

    invoke-direct {v11, v1}, Lao1/i;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lto1/e;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lal0/d;

    const/16 v1, 0x11

    invoke-direct {v11, v1}, Lal0/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Loo1/d;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lal0/d;

    const/16 v1, 0x13

    invoke-direct {v11, v1}, Lal0/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Loo1/g;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lal0/d;

    const/16 v1, 0x14

    invoke-direct {v11, v1}, Lal0/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lso1/b0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lal0/d;

    const/16 v1, 0x15

    invoke-direct {v11, v1}, Lal0/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lto1/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lal0/d;

    const/16 v1, 0x16

    invoke-direct {v11, v1}, Lal0/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Loo1/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lal0/d;

    const/16 v1, 0x17

    invoke-direct {v11, v1}, Lal0/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lso1/o;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lal0/d;

    const/16 v1, 0x18

    invoke-direct {v11, v1}, Lal0/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lto1/n;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lal0/d;

    const/16 v1, 0x19

    invoke-direct {v11, v1}, Lal0/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Loo1/k;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lal0/d;

    const/16 v1, 0x1a

    invoke-direct {v11, v1}, Lal0/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lso1/f0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lal0/d;

    const/16 v1, 0x1c

    invoke-direct {v11, v1}, Lal0/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lro1/k;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lal0/d;

    const/16 v1, 0x1d

    invoke-direct {v11, v1}, Lal0/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lup1/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/4 v1, 0x1

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lqp1/f;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/4 v1, 0x2

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Leo1/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/4 v1, 0x3

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lqp1/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/4 v1, 0x4

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Ltp1/n;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/4 v1, 0x5

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lto1/d;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/4 v1, 0x6

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lpo1/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/4 v1, 0x7

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lso1/w;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/16 v1, 0x9

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lzp1/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/16 v1, 0xa

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lwp1/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/16 v1, 0xb

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lyp1/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/16 v1, 0xd

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lxp1/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/16 v1, 0xe

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lio1/g;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/16 v1, 0xf

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lmo1/d;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/16 v1, 0x10

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lmo1/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/16 v1, 0x11

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lko1/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/16 v1, 0x12

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lko1/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/16 v1, 0x14

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Llo1/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v3, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lao1/d;

    const/16 v1, 0x15

    invoke-direct {v11, v1}, Lao1/d;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lho1/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v0, v7, Lqf3/b;->b:Lj93/d;

    invoke-static {v0, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, p0, v0, v2}, Lm4/a;->z(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e1(Lxf3/c;Luf3/a;)Lcom/whoop/hormonalinsights/fertility/api/FertilitySettingsApi;
    .locals 4

    const-string v0, "$this$single"

    const-string v1, "it"

    invoke-static {p0, v0, p1, v1}, Lm4/a;->o(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;)Lpg3/x0;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lsr2/y;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsr2/y;

    invoke-virtual {v1}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lpg3/x0;->c(Ljava/lang/String;)V

    invoke-static {}, Lu82/k;->d()Lpg3/m;

    move-result-object v1

    invoke-virtual {p1, v1}, Lpg3/x0;->b(Lpg3/m;)V

    new-instance v1, Lvf3/c;

    const-string v3, "defaultOkHttpClient"

    invoke-direct {v1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Lud3/l0;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lud3/l0;

    const-class v0, Lcom/whoop/hormonalinsights/fertility/api/FertilitySettingsApi;

    const-string v1, "create(...)"

    invoke-static {p1, p0, v0, v1}, Lb9/y;->f(Lpg3/x0;Lud3/l0;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/hormonalinsights/fertility/api/FertilitySettingsApi;

    return-object p0
.end method

.method public static synthetic f(Lxf3/c;Luf3/a;)Loo1/g;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->s0(Lxf3/c;Luf3/a;)Loo1/g;

    move-result-object p0

    return-object p0
.end method

.method private static final f0(Lxf3/c;Luf3/a;)Ljava/util/Map;
    .locals 24

    const-string v0, "$this$single"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CalendarTileModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ll83/k;

    const-string v3, "CALENDAR_TILE"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CurrentCycleTileModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v3, Ll83/k;

    const-string v4, "CURRENT_CYCLE_GRAPH"

    invoke-direct {v3, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CycleJournalTileModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v4, Ll83/k;

    const-string v5, "CYCLE_JOURNAL_TILE"

    invoke-direct {v4, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/CyclePatternTileModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v5, Ll83/k;

    const-string v6, "CYCLE_PATTERN"

    invoke-direct {v5, v6, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingTileModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v6, Ll83/k;

    const-string v7, "CYCLE_PHASE_COACHING"

    invoke-direct {v6, v7, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v7, Ll83/k;

    const-string v8, "DAILY_TICK_MARK"

    invoke-direct {v7, v8, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/DateSelectedTileModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v8, Ll83/k;

    const-string v9, "DATE_SELECTED_TILE"

    invoke-direct {v8, v9, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/hormonalinsights/fertility/FertilitySettingsToggleModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v9, Ll83/k;

    const-string v10, "FERTILITY_SETTINGS_TOGGLE"

    invoke-direct {v9, v10, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciHeaderModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v10, Ll83/k;

    const-string v11, "HEADER_TILE"

    invoke-direct {v10, v11, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsLoaderModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v11, Ll83/k;

    const-string v12, "HORMONAL_INSIGHTS_LOADER"

    invoke-direct {v11, v12, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogDataButtonModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v12, Ll83/k;

    const-string v13, "LOG_DATA_BUTTON"

    invoke-direct {v12, v13, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciMedicalDisclaimerModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v13, Ll83/k;

    const-string v14, "MCI_MEDICAL_DISCLAIMER"

    invoke-direct {v13, v14, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTileSectionModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v14, Ll83/k;

    const-string v15, "MCI_TILE_SECTION"

    invoke-direct {v14, v15, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsMenuItemModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v15, Ll83/k;

    move-object/from16 p0, v2

    const-string v2, "MENU_ITEM"

    invoke-direct {v15, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/hormonalinsights/naturalcycles/domain/models/NaturalCyclesFertilityCardModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ll83/k;

    move-object/from16 p1, v3

    const-string v3, "NATURAL_CYCLES_FERTILITY_CARD"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PossibleSymptomsCardModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v3, Ll83/k;

    move-object/from16 v16, v2

    const-string v2, "POSSIBLE_SYMPTOMS_CARD"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyDisclaimer;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ll83/k;

    move-object/from16 v17, v3

    const-string v3, "PREGNANCY_DISCLAIMER"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsPrivacy;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v3, Ll83/k;

    move-object/from16 v18, v2

    const-string v2, "PRIVACY_TILE"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsToggle;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ll83/k;

    move-object/from16 v19, v3

    const-string v3, "SETTINGS_TOGGLE"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/TileWithTitleModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v3, Ll83/k;

    move-object/from16 v20, v2

    const-string v2, "TILE_WITH_TITLE"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/TypicalCycleTileModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ll83/k;

    move-object/from16 v21, v3

    const-string v3, "TYPICAL_CYCLE_TILE"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v3, "UPSELL_TILE"

    invoke-direct {v1, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v3, p1

    move-object/from16 v23, v1

    move-object/from16 v22, v2

    move-object/from16 v2, p0

    filled-new-array/range {v2 .. v23}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private static final f1(Lxf3/c;Luf3/a;)Lkp1/e;
    .locals 11

    const-string v0, "it"

    const-string v1, "hormonal-insights-feature-models"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Ljava/util/Map;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Ljava/util/Map;

    const/16 v9, 0x1e

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v10}, Lcom/whoop/design/json/b;->e(Lxf3/c;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Liy1/c;Lrr2/c;ILjava/lang/Object;)Lad3/c;

    move-result-object p0

    new-instance p1, Lu82/i;

    invoke-direct {p1, p0}, Lu82/i;-><init>(Lad3/c;)V

    new-instance p0, Lao1/e;

    const/4 v1, 0x0

    invoke-direct {p0, v4, p1, v1}, Lao1/e;-><init>(Ljava/util/Map;Lu82/i;I)V

    const-class p1, Lnm0/e;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {v3, p0, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lnm0/e;

    const-class p0, Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    invoke-virtual {v0, p0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    invoke-virtual {v3, v2, p0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    new-instance v3, Lkp1/e;

    const/4 v7, 0x4

    invoke-direct/range {v3 .. v8}, Lkp1/e;-><init>(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Lnm0/e;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method

.method public static synthetic g(Lxf3/c;Luf3/a;)Lso1/b0;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->u0(Lxf3/c;Luf3/a;)Lso1/b0;

    move-result-object p0

    return-object p0
.end method

.method private static final g0(Lxf3/c;Luf3/a;)Lao1/c;
    .locals 3

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lao1/c;

    new-instance v0, Lvf3/c;

    const-string v1, "hormonal-insights-feature-models"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v1, Ljava/util/Map;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map;

    invoke-direct {p1, p0}, Lao1/c;-><init>(Ljava/util/Map;)V

    return-object p1
.end method

.method private static final g1(Ljava/util/Map;Lu82/i;)Luf3/a;
    .locals 0

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lxf3/c;Luf3/a;)Loo1/b;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->w0(Lxf3/c;Luf3/a;)Loo1/b;

    move-result-object p0

    return-object p0
.end method

.method private static final h0(Lxf3/c;Luf3/a;)Lnp1/i;
    .locals 8

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lnp1/i;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lkp1/e;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkp1/e;

    const-class v3, Lop1/b;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lop1/b;

    const-class v4, Lkp1/b;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lkp1/b;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Lnp1/i;-><init>(Lkp1/e;Lop1/b;Lkp1/b;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final h1(Lxf3/c;Luf3/a;)Lop1/b;
    .locals 3

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lop1/b;

    new-instance v0, Lvf3/c;

    const-string v1, "hormonal-insights-polymorphic-json"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v1, Lad3/c;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lad3/c;

    invoke-direct {p1, p0}, Lop1/b;-><init>(Lad3/c;)V

    return-object p1
.end method

.method public static synthetic i(Landroidx/fragment/app/r0;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lao1/j;->Z0(Landroidx/fragment/app/r0;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final i0(Lxf3/c;Luf3/a;)Lfp1/f;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lfp1/f;

    const-class v0, Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lfp1/f;-><init>(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final i1(Lxf3/c;Luf3/a;)Lkp1/b;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lkp1/b;

    invoke-direct {p0}, Lkp1/b;-><init>()V

    return-object p0
.end method

.method public static synthetic j(Lxf3/c;Luf3/a;)Lup1/a;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->D0(Lxf3/c;Luf3/a;)Lup1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final j0(Lxf3/c;Luf3/a;)Lip1/a;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lip1/a;

    invoke-direct {p0}, Lip1/a;-><init>()V

    return-object p0
.end method

.method public static synthetic k(Lxf3/c;Luf3/a;)Lio1/g;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->T0(Lxf3/c;Luf3/a;)Lio1/g;

    move-result-object p0

    return-object p0
.end method

.method private static final k0(Lxf3/c;Luf3/a;)Lhp1/g;
    .locals 8

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lfp1/f;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lfp1/f;

    const-class v0, Lip1/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lip1/a;

    new-instance v2, Lhp1/g;

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lhp1/g;-><init>(Lip1/a;Lfp1/f;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method public static synthetic l(Lxf3/c;Luf3/a;)Lqp1/c;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->H0(Lxf3/c;Luf3/a;)Lqp1/c;

    move-result-object p0

    return-object p0
.end method

.method private static final l0(Lxf3/c;Luf3/a;)Lyn1/b;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lyn1/b;

    const-class v0, Lfi0/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfi0/a;

    invoke-direct {p1, p0}, Lyn1/b;-><init>(Lfi0/a;)V

    return-object p1
.end method

.method public static synthetic m(Lxf3/c;Luf3/a;)Lwp1/c;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->N0(Lxf3/c;Luf3/a;)Lwp1/c;

    move-result-object p0

    return-object p0
.end method

.method private static final m0(Lxf3/c;Luf3/a;)Ldp1/a;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ldp1/a;

    const-class v0, Lzr2/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzr2/a;

    invoke-direct {p1, p0}, Ldp1/a;-><init>(Lzr2/a;)V

    return-object p1
.end method

.method public static synthetic n(Ljava/util/Map;Lu82/i;)Luf3/a;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->g1(Ljava/util/Map;Lu82/i;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final n0(Lxf3/c;Luf3/a;)Lzo1/d;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lzo1/d;

    const-class p1, Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lzo1/d;-><init>(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Ltr2/n;Lzo1/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic o(Luf3/a;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lao1/j;->C0(Luf3/a;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final o0(Lxf3/c;Luf3/a;)Lcp1/j;
    .locals 7

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcp1/j;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lzo1/d;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzo1/d;

    const-class v3, Ldp1/a;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Ldp1/a;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lcp1/j;-><init>(Lzo1/d;Ldp1/a;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic p(Lxf3/c;Luf3/a;)Ldp1/a;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->m0(Lxf3/c;Luf3/a;)Ldp1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final p0(Lxf3/c;Luf3/a;)Lto1/e;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lto1/e;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    new-instance v3, Lvf3/c;

    const-string v4, "hormonal-insights-polymorphic-json"

    invoke-direct {v3, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Lad3/c;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lad3/c;

    invoke-direct {p1, v1, p0}, Lto1/e;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lad3/c;)V

    return-object p1
.end method

.method public static synthetic q(Lxf3/c;Luf3/a;)Lso1/f0;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->A0(Lxf3/c;Luf3/a;)Lso1/f0;

    move-result-object p0

    return-object p0
.end method

.method private static final q0(Lxf3/c;Luf3/a;)Loo1/d;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Loo1/d;

    invoke-direct {p0}, Loo1/d;-><init>()V

    return-object p0
.end method

.method public static synthetic r(Lxf3/c;Luf3/a;)Lqp1/f;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->F0(Lxf3/c;Luf3/a;)Lqp1/f;

    move-result-object p0

    return-object p0
.end method

.method private static final r0(Lxf3/c;Luf3/a;)Lao1/b;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lao1/b;

    invoke-direct {p0}, Lao1/b;-><init>()V

    return-object p0
.end method

.method public static synthetic s(Lxf3/c;Luf3/a;)Lyn1/b;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->l0(Lxf3/c;Luf3/a;)Lyn1/b;

    move-result-object p0

    return-object p0
.end method

.method private static final s0(Lxf3/c;Luf3/a;)Loo1/g;
    .locals 23

    move-object/from16 v0, p0

    const-string v1, "it"

    const-string v2, "hormonal-insights-feature-models"

    const-string v3, "$this$factory"

    move-object/from16 v4, p1

    invoke-static {v0, v3, v4, v1, v2}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object v1

    sget-object v8, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Ljava/util/Map;

    invoke-virtual {v8, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v9, 0x0

    invoke-virtual {v0, v9, v2, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    const/16 v6, 0x1e

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/whoop/design/json/b;->e(Lxf3/c;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Liy1/c;Lrr2/c;ILjava/lang/Object;)Lad3/c;

    move-result-object v2

    new-instance v3, Lu82/i;

    invoke-direct {v3, v2}, Lu82/i;-><init>(Lad3/c;)V

    const-class v4, Lqw2/c;

    invoke-virtual {v8, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v0, v9, v4, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    move-object v11, v4

    check-cast v11, Lqw2/c;

    const-class v4, Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    invoke-virtual {v8, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v0, v9, v4, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    move-object v12, v4

    check-cast v12, Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    const-class v4, Lzr2/a;

    invoke-virtual {v8, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v0, v9, v4, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    move-object v15, v4

    check-cast v15, Lzr2/a;

    new-instance v4, Lao1/e;

    const/4 v5, 0x2

    invoke-direct {v4, v1, v3, v5}, Lao1/e;-><init>(Ljava/util/Map;Lu82/i;I)V

    const-class v1, Lnm0/e;

    invoke-virtual {v8, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v4, v1, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Lnm0/e;

    const-class v1, Lxm0/b;

    invoke-virtual {v8, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v9, v1, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lxm0/b;

    const-class v1, Ljs0/c;

    invoke-virtual {v8, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v9, v1, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v18, v1

    check-cast v18, Ljs0/c;

    const-class v1, Lwm0/a;

    invoke-virtual {v8, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v9, v1, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v19, v0

    check-cast v19, Lwm0/a;

    new-instance v10, Loo1/g;

    const/16 v21, 0x60

    const/16 v22, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v20, v2

    invoke-direct/range {v10 .. v22}, Loo1/g;-><init>(Lqw2/c;Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Lnm0/e;Lxm0/b;Lzr2/a;Ltr2/n;Ljava/util/Locale;Ljs0/c;Lwm0/a;Lad3/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v10
.end method

.method public static synthetic t(Lxf3/c;Luf3/a;)Lro1/k;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->B0(Lxf3/c;Luf3/a;)Lro1/k;

    move-result-object p0

    return-object p0
.end method

.method private static final t0(Ljava/util/Map;Lu82/i;)Luf3/a;
    .locals 0

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u(Lxf3/c;Luf3/a;)Loo1/d;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->q0(Lxf3/c;Luf3/a;)Loo1/d;

    move-result-object p0

    return-object p0
.end method

.method private static final u0(Lxf3/c;Luf3/a;)Lso1/b0;
    .locals 8

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lso1/b0;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Loo1/g;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loo1/g;

    const-class v3, Lto1/e;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lto1/e;

    const-class v4, Loo1/d;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Loo1/d;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Lso1/b0;-><init>(Loo1/g;Lto1/e;Loo1/d;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic v(Lxf3/c;Luf3/a;)Lad3/c;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->E0(Lxf3/c;Luf3/a;)Lad3/c;

    move-result-object p0

    return-object p0
.end method

.method private static final v0(Lxf3/c;Luf3/a;)Lto1/b;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lto1/b;

    invoke-direct {p0}, Lto1/b;-><init>()V

    return-object p0
.end method

.method public static synthetic w(Lxf3/c;Luf3/a;)Lnp1/i;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->h0(Lxf3/c;Luf3/a;)Lnp1/i;

    move-result-object p0

    return-object p0
.end method

.method private static final w0(Lxf3/c;Luf3/a;)Loo1/b;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Loo1/b;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    const-class v3, Lzr2/a;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lzr2/a;

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Loo1/b;-><init>(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Lzr2/a;Ltr2/n;Ljava/util/Locale;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic x(Lxf3/c;Luf3/a;)Lto1/n;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->y0(Lxf3/c;Luf3/a;)Lto1/n;

    move-result-object p0

    return-object p0
.end method

.method private static final x0(Lxf3/c;Luf3/a;)Lso1/o;
    .locals 7

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lso1/o;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Loo1/b;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loo1/b;

    const-class v3, Lto1/b;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lto1/b;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lso1/o;-><init>(Loo1/b;Lto1/b;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic y(Lxf3/c;Luf3/a;)Leo1/b;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->G0(Lxf3/c;Luf3/a;)Leo1/b;

    move-result-object p0

    return-object p0
.end method

.method private static final y0(Lxf3/c;Luf3/a;)Lto1/n;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lto1/n;

    invoke-direct {p0}, Lto1/n;-><init>()V

    return-object p0
.end method

.method public static synthetic z(Lxf3/c;Luf3/a;)Lso1/w;
    .locals 0

    invoke-static {p0, p1}, Lao1/j;->L0(Lxf3/c;Luf3/a;)Lso1/w;

    move-result-object p0

    return-object p0
.end method

.method private static final z0(Lxf3/c;Luf3/a;)Loo1/k;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Loo1/k;

    const-class v0, Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Loo1/k;-><init>(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Lao1/j;->e0(Ltf3/a;)Ll83/a0;

    return-object v0
.end method

.method public getDependencies()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnd1/j;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lao1/j;->a:Ljava/util/List;

    return-object v0
.end method

.method public bridge getKey()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lnd1/j;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
