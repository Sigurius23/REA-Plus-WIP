.class public final Lc70/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnd1/j;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R \u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lc70/d;",
        "Lnd1/j;",
        "<init>",
        "()V",
        "Ltf3/a;",
        "define",
        "()Ltf3/a;",
        "",
        "Lv82/a;",
        "a",
        "Ljava/util/List;",
        "getDependencies",
        "()Ljava/util/List;",
        "dependencies",
        "activation_release"
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
            "Lv82/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lb9/y;->u()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lc70/d;->a:Ljava/util/List;

    return-void
.end method

.method public static synthetic A(Lxf3/c;Luf3/a;)Lf70/r0;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->e1(Lxf3/c;Luf3/a;)Lf70/r0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic A0(Lxf3/c;Luf3/a;)Lx70/c;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->o2(Lxf3/c;Luf3/a;)Lx70/c;

    move-result-object p0

    return-object p0
.end method

.method private static final A1(Lxf3/c;Luf3/a;)Lf70/x0;
    .locals 10

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/x0;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/activation/domain/UsersServiceValidationApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/activation/domain/UsersServiceValidationApi;

    const-class v3, Lcom/whoop/activation/domain/AuthedUsernameValidationApi;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/activation/domain/AuthedUsernameValidationApi;

    const-class v4, Lp70/b;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp70/b;

    const-class v5, Lod1/j;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lod1/j;

    const-class v6, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v9}, Lf70/x0;-><init>(Lcom/whoop/activation/domain/UsersServiceValidationApi;Lcom/whoop/activation/domain/AuthedUsernameValidationApi;Lp70/b;Lod1/j;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic B(Lxf3/c;Luf3/a;)Lf70/a0;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->j2(Lxf3/c;Luf3/a;)Lf70/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B0(Lxf3/c;Luf3/a;)Lf70/f0;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->g2(Lxf3/c;Luf3/a;)Lf70/f0;

    move-result-object p0

    return-object p0
.end method

.method private static final B1(Lxf3/c;Luf3/a;)Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;
    .locals 11

    const-string v0, "it"

    const-string v1, "defaultOkHttpClient"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lud3/l0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lud3/l0;

    invoke-virtual {p1}, Lud3/l0;->a()Lud3/k0;

    move-result-object p1

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0xf

    invoke-virtual {p1, v3, v4, v1}, Lud3/k0;->e(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {p1, v3, v4, v1}, Lud3/k0;->b(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {p1, v3, v4, v1}, Lud3/k0;->f(JLjava/util/concurrent/TimeUnit;)V

    new-instance v1, Lvf3/c;

    const-string v3, "activation-feature-models"

    invoke-direct {v1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Ljava/util/Map;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Ljava/util/Map;

    new-instance v1, Lcom/google/gson/GsonBuilder;

    invoke-direct {v1}, Lcom/google/gson/GsonBuilder;-><init>()V

    const/4 v3, 0x2

    invoke-static {v1, v4, v2, v3, v2}, Lcom/whoop/design/json/d;->f(Lcom/google/gson/GsonBuilder;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object v1

    const/16 v9, 0x1e

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v10}, Lcom/whoop/design/json/b;->e(Lxf3/c;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Liy1/c;Lrr2/c;ILjava/lang/Object;)Lad3/c;

    move-result-object p0

    const-class v4, Lu82/e;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v3, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu82/e;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v5, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->KT_SERIALIZATION_ACTIVATION:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-virtual {v5}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->getFlagName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    invoke-virtual {v4, v1, p0, v5}, Lu82/e;->a(Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;)Lu82/d;

    move-result-object p0

    new-instance v1, Lpg3/x0;

    invoke-direct {v1}, Lpg3/x0;-><init>()V

    const-class v4, Lsr2/y;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {v3, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsr2/y;

    invoke-virtual {v0}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lpg3/x0;->c(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Lpg3/x0;->b(Lpg3/m;)V

    new-instance p0, Lud3/l0;

    invoke-direct {p0, p1}, Lud3/l0;-><init>(Lud3/k0;)V

    iput-object p0, v1, Lpg3/x0;->a:Lud3/i;

    invoke-virtual {v1}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object p0

    const-class p1, Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "create(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;

    return-object p0
.end method

.method public static synthetic C(Lxf3/c;Luf3/a;)Lv70/e;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->l2(Lxf3/c;Luf3/a;)Lv70/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C0(Lxf3/c;Luf3/a;)Lf70/r;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->c1(Lxf3/c;Luf3/a;)Lf70/r;

    move-result-object p0

    return-object p0
.end method

.method private static final C1(Lxf3/c;Luf3/a;)Lm70/d;
    .locals 11

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lm70/d;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lh32/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh32/a;

    const-class v3, Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;

    const-class v4, Lh80/c;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh80/c;

    const-class v5, Liy1/c;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Liy1/c;

    const-class v6, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const/16 v9, 0x60

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v10}, Lm70/d;-><init>(Lh32/a;Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;Lh80/c;Liy1/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/z;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic D(Lxf3/c;Luf3/a;)Lf80/d;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->U0(Lxf3/c;Luf3/a;)Lf80/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D0(Lxf3/c;Luf3/a;)Lf70/b;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->g1(Lxf3/c;Luf3/a;)Lf70/b;

    move-result-object p0

    return-object p0
.end method

.method private static final D1(Lxf3/c;Luf3/a;)Lo70/a;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lo70/a;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/data/remote/api/FileDownloaderApi;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/data/remote/api/FileDownloaderApi;

    const-class v3, Ltr2/n;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ltr2/n;

    invoke-direct {p1, v1, p0}, Lo70/a;-><init>(Lcom/whoop/data/remote/api/FileDownloaderApi;Ltr2/n;)V

    return-object p1
.end method

.method public static synthetic E(Lxf3/c;Luf3/a;)Lf70/x;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->f2(Lxf3/c;Luf3/a;)Lf70/x;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E0(Lxf3/c;Luf3/a;)Lf70/c0;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->m1(Lxf3/c;Luf3/a;)Lf70/c0;

    move-result-object p0

    return-object p0
.end method

.method private static final E1(Lxf3/c;Luf3/a;)Ln70/c;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ln70/c;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v0, Lhf1/b;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lhf1/b;

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Ln70/c;-><init>(Ltr2/n;Lcom/whoop/data/repositories/FeatureFlagChecker;Lhf1/b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic F(Lxf3/c;Luf3/a;)La70/c;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->w2(Lxf3/c;Luf3/a;)La70/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F0(Lxf3/c;Luf3/a;)Lf70/x0;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->A1(Lxf3/c;Luf3/a;)Lf70/x0;

    move-result-object p0

    return-object p0
.end method

.method private static final F1(Lxf3/c;Luf3/a;)Li80/d;
    .locals 6

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Li80/d;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lq22/e;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq22/e;

    const-class v3, Li80/e;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li80/e;

    const-class v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v5, Lvn0/e;

    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lvn0/e;

    invoke-direct {p1, v1, v3, v4, p0}, Li80/d;-><init>(Lq22/e;Li80/e;Lcom/whoop/data/repositories/FeatureFlagChecker;Lvn0/e;)V

    return-object p1
.end method

.method public static synthetic G(Lxf3/c;Luf3/a;)Lf70/o;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->s1(Lxf3/c;Luf3/a;)Lf70/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G0(Lxf3/c;Luf3/a;)Lcom/whoop/activation/dayzero/domain/network/DayZeroSplashApi;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->u2(Lxf3/c;Luf3/a;)Lcom/whoop/activation/dayzero/domain/network/DayZeroSplashApi;

    move-result-object p0

    return-object p0
.end method

.method private static final G1(Lxf3/c;Luf3/a;)Lg70/a;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lg70/a;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lh80/c;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh80/c;

    const-class v3, Ln70/c;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ln70/c;

    const-class v4, Lf70/y0;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf70/y0;

    const-class v5, Lod1/j;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lod1/j;

    const-class v6, Lf70/r0;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lf70/r0;

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lg70/a;-><init>(Lh80/c;Ln70/c;Lf70/y0;Lod1/j;Lf70/r0;)V

    return-object v1
.end method

.method public static synthetic H(Lxf3/c;Luf3/a;)Lh70/a;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->k1(Lxf3/c;Luf3/a;)Lh70/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H0(Lxf3/c;Luf3/a;)Lj70/d;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->c2(Lxf3/c;Luf3/a;)Lj70/d;

    move-result-object p0

    return-object p0
.end method

.method private static final H1(Lxf3/c;Luf3/a;)Li80/c;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Li80/c;

    invoke-direct {p0}, Li80/c;-><init>()V

    return-object p0
.end method

.method public static synthetic I(Lxf3/c;Luf3/a;)Lf70/p0;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->n1(Lxf3/c;Luf3/a;)Lf70/p0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I0(Lxf3/c;Luf3/a;)Lj70/a;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->R1(Lxf3/c;Luf3/a;)Lj70/a;

    move-result-object p0

    return-object p0
.end method

.method private static final I1(Lxf3/c;Luf3/a;)Le70/b;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Le70/b;

    invoke-direct {p0}, Le70/b;-><init>()V

    return-object p0
.end method

.method public static synthetic J(Lxf3/c;Luf3/a;)Lp70/a;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->a2(Lxf3/c;Luf3/a;)Lp70/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J0(Lxf3/c;Luf3/a;)Lf70/v0;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->h1(Lxf3/c;Luf3/a;)Lf70/v0;

    move-result-object p0

    return-object p0
.end method

.method private static final J1(Lxf3/c;Luf3/a;)Lg80/a;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lg80/a;

    invoke-direct {p0}, Lg80/a;-><init>()V

    return-object p0
.end method

.method public static synthetic K(Lxf3/c;Luf3/a;)La70/b;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->x2(Lxf3/c;Luf3/a;)La70/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K0(Lxf3/c;Luf3/a;)Lf80/a;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->T0(Lxf3/c;Luf3/a;)Lf80/a;

    move-result-object p0

    return-object p0
.end method

.method private static final K1(Lxf3/c;Luf3/a;)Lg80/e;
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "$this$viewModel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lf70/h;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lf70/h;

    const-class v2, Lm70/d;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lm70/d;

    const-class v2, Lo70/a;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lo70/a;

    const-class v2, Le70/b;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Le70/b;

    const-class v2, Lg80/a;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lg80/a;

    const-class v2, Li80/d;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v11, v2

    check-cast v11, Li80/d;

    const-class v2, Li80/c;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Li80/c;

    const-class v2, Lh80/c;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lh80/c;

    const-class v2, Lf70/g;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lf70/g;

    new-instance v4, Lg80/e;

    const/16 v15, 0x200

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v4 .. v16}, Lg80/e;-><init>(Lf70/h;Lm70/d;Lo70/a;Le70/b;Lg80/a;Lh80/c;Li80/d;Li80/c;Lf70/g;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method

.method public static synthetic L(Lxf3/c;Luf3/a;)Ljava/util/Map;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->S1(Lxf3/c;Luf3/a;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L0(Lxf3/c;Luf3/a;)Lg80/e;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->K1(Lxf3/c;Luf3/a;)Lg80/e;

    move-result-object p0

    return-object p0
.end method

.method private static final L1(Lxf3/c;Luf3/a;)Lf70/g;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/g;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/data/repositories/FeatureFlagRepository;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagRepository;

    const-class v3, Lbc3/c0;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lbc3/c0;

    sget-object p0, Lbc3/q0;->a:Lkc3/e;

    sget-object v4, Lkc3/d;->w:Lkc3/d;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Lf70/g;-><init>(Lcom/whoop/data/repositories/FeatureFlagRepository;Lbc3/c0;Lq83/j;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic M(Lxf3/c;Luf3/a;)Lh80/c;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->M1(Lxf3/c;Luf3/a;)Lh80/c;

    move-result-object p0

    return-object p0
.end method

.method private static final M0(Ltf3/a;)Ll83/a0;
    .locals 19

    move-object/from16 v0, p0

    const-string v1, "$this$module"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lc70/b;

    const/16 v1, 0xe

    invoke-direct {v6, v1}, Lc70/b;-><init>(I)V

    new-instance v2, Lqf3/b;

    const-class v1, Lvn0/e;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    sget-object v3, Lwf3/a;->e:Lvf3/c;

    const/4 v5, 0x0

    const/4 v12, 0x2

    move v7, v12

    invoke-direct/range {v2 .. v7}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    iget-object v1, v2, Lqf3/b;->b:Lj93/d;

    invoke-static {v1, v5, v3}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v2}, Lrf3/b;-><init>(Lqf3/b;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v4, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lc70/a;

    const/4 v1, 0x0

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lwn0/b;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    const/4 v10, 0x0

    move-object v8, v3

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v3}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/16 v1, 0xb

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/h;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/16 v1, 0x16

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lh70/a;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/b;

    const/4 v1, 0x3

    invoke-direct {v11, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Li70/a;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/b;

    const/16 v1, 0xf

    invoke-direct {v11, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lg70/a;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/b;

    const/16 v1, 0x1b

    invoke-direct {v11, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lj70/a;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/c;

    const/16 v1, 0x9

    invoke-direct {v11, v1}, Lc70/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lj70/d;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/c;

    const/16 v1, 0x14

    invoke-direct {v11, v1}, Lc70/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lk70/a;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/c;

    const/16 v1, 0x15

    invoke-direct {v11, v1}, Lc70/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/y0;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/b;

    const/16 v1, 0x19

    invoke-direct {v11, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/a;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/c;

    const/4 v1, 0x6

    invoke-direct {v11, v1}, Lc70/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lj70/c;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/c;

    const/16 v1, 0x11

    invoke-direct {v11, v1}, Lc70/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Ll70/a;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v1, Lc70/c;

    const/16 v2, 0x16

    invoke-direct {v1, v2}, Lc70/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v14

    new-instance v13, Lqf3/b;

    const-class v2, Lm5/f;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v15

    const/16 v16, 0x0

    const/4 v7, 0x1

    move-object/from16 v17, v1

    move/from16 v18, v7

    invoke-direct/range {v13 .. v18}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v1, v16

    invoke-virtual {v13}, Lqf3/b;->a()Lj93/d;

    move-result-object v2

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v3

    invoke-static {v2, v1, v3}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/d;

    invoke-direct {v2, v13}, Lrf3/d;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lbt2/b;

    const/16 v1, 0x18

    invoke-direct {v11, v1}, Lbt2/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf80/a;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lbt2/b;

    const/16 v1, 0x19

    invoke-direct {v11, v1}, Lbt2/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf80/d;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lbt2/b;

    const/16 v1, 0x1a

    invoke-direct {v11, v1}, Lbt2/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf80/e;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lbt2/b;

    const/16 v1, 0x1b

    invoke-direct {v11, v1}, Lbt2/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/a1;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lbt2/b;

    const/16 v1, 0x1c

    invoke-direct {v11, v1}, Lbt2/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/b1;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v6, Lbt2/b;

    const/16 v1, 0x1d

    invoke-direct {v6, v1}, Lbt2/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v3

    new-instance v2, Lqf3/b;

    const-class v1, Lf70/q;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    move/from16 v7, v18

    invoke-direct/range {v2 .. v7}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v3

    invoke-static {v1, v5, v3}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v2}, Lrf3/d;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/4 v1, 0x1

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/k0;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/4 v1, 0x2

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/u;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v6, Lc70/a;

    const/4 v1, 0x3

    invoke-direct {v6, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v3

    new-instance v2, Lqf3/b;

    const-class v1, Lf70/r;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    move/from16 v7, v18

    invoke-direct/range {v2 .. v7}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v3

    invoke-static {v1, v5, v3}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v2}, Lrf3/d;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/4 v1, 0x4

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/j0;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/4 v1, 0x5

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/r0;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/4 v1, 0x6

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/b;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v2

    invoke-static {v2, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v2, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    const-string v2, "account-creation-screens-helper-with-analytics"

    invoke-static {v2}, Lvf3/b;->f(Ljava/lang/String;)Lvf3/c;

    move-result-object v10

    new-instance v11, Lc70/a;

    const/4 v2, 0x7

    invoke-direct {v11, v2}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/16 v1, 0x8

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/v0;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/16 v1, 0x9

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/e0;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/16 v1, 0xa

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/d0;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/16 v1, 0xc

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/s0;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/16 v1, 0xd

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/c0;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/16 v1, 0xe

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/p0;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/16 v1, 0xf

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/c;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/16 v1, 0x10

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/o0;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/16 v1, 0x11

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/m;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/16 v1, 0x12

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/p;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/16 v1, 0x13

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/o;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/16 v1, 0x14

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/n;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/16 v1, 0x15

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Li80/e;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/16 v1, 0x17

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/z0;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/16 v1, 0x18

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/w0;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/16 v1, 0x19

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/d1;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/16 v1, 0x1a

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/c1;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/16 v1, 0x1b

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/x0;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/16 v1, 0x1c

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/a;

    const/16 v1, 0x1d

    invoke-direct {v11, v1}, Lc70/a;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lm70/d;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/b;

    const/4 v1, 0x0

    invoke-direct {v11, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lo70/a;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/b;

    const/4 v1, 0x1

    invoke-direct {v11, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Ln70/c;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/b;

    const/4 v1, 0x2

    invoke-direct {v11, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Li80/d;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/b;

    const/4 v1, 0x4

    invoke-direct {v11, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Li80/c;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/b;

    const/4 v1, 0x5

    invoke-direct {v11, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Le70/b;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/b;

    const/4 v1, 0x6

    invoke-direct {v11, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lg80/a;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/b;

    const/4 v1, 0x7

    invoke-direct {v11, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lg80/e;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/b;

    const/16 v1, 0x8

    invoke-direct {v11, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/g;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v6, Lc70/b;

    const/16 v1, 0x9

    invoke-direct {v6, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v3

    new-instance v2, Lqf3/b;

    const-class v1, Lh80/c;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    move/from16 v7, v18

    invoke-direct/range {v2 .. v7}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v3

    invoke-static {v1, v5, v3}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v2}, Lrf3/d;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v6, Lc70/b;

    const/16 v1, 0xa

    invoke-direct {v6, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v3

    new-instance v2, Lqf3/b;

    const-class v1, Lb80/c;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-direct/range {v2 .. v7}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v3

    invoke-static {v1, v5, v3}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v2}, Lrf3/d;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v3}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/b;

    const/16 v1, 0xb

    invoke-direct {v11, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Ll80/p;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/b;

    const/16 v1, 0xc

    invoke-direct {v11, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Ll80/t;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    const-class v1, Ll80/s;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v13, "clazz"

    invoke-static {v1, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v2, Lrf3/b;->a:Lqf3/b;

    iget-object v4, v3, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v4, Ljava/util/Collection;

    invoke-static {v1, v4}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v4

    iput-object v4, v3, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v4, v3, Lqf3/b;->c:Lvf3/a;

    iget-object v3, v3, Lqf3/b;->a:Lvf3/a;

    invoke-static {v1, v4, v3}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    const/4 v14, 0x1

    invoke-virtual {v0, v1, v2, v14}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lc70/b;

    const/16 v1, 0xd

    invoke-direct {v11, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lq80/j;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    const-string v1, "activation-feature-models"

    invoke-static {v1}, Lvf3/b;->f(Ljava/lang/String;)Lvf3/c;

    move-result-object v10

    new-instance v11, Lc70/b;

    const/16 v1, 0x10

    invoke-direct {v11, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Ljava/util/Map;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/b;

    const/16 v1, 0x11

    invoke-direct {v11, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/activation/domain/UsersServiceValidationApi;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/b;

    const/16 v1, 0x12

    invoke-direct {v11, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/activation/domain/AuthedUsernameValidationApi;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/b;

    const/16 v1, 0x13

    invoke-direct {v11, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Ld70/a;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/b;

    const/16 v1, 0x14

    invoke-direct {v11, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/activation/domain/ActivationApi;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/b;

    const/16 v1, 0x15

    invoke-direct {v11, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/b;

    const/16 v1, 0x16

    invoke-direct {v11, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/l;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/b;

    const/16 v1, 0x17

    invoke-direct {v11, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/m0;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v6, Lc70/b;

    const/16 v1, 0x18

    invoke-direct {v6, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v3

    new-instance v2, Lqf3/b;

    const-class v1, Lp70/a;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    move/from16 v7, v18

    invoke-direct/range {v2 .. v7}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v3

    invoke-static {v1, v5, v3}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v0, v1}, Lb9/y;->x(Lqf3/b;Ltf3/a;Ljava/lang/String;)Lrf3/d;

    move-result-object v1

    const-class v2, Lp70/b;

    invoke-static {v2}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-static {v2, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Lrf3/b;->a:Lqf3/b;

    iget-object v4, v3, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v4, Ljava/util/Collection;

    invoke-static {v2, v4}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v4

    iput-object v4, v3, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v4, v3, Lqf3/b;->c:Lvf3/a;

    iget-object v3, v3, Lqf3/b;->a:Lvf3/a;

    invoke-static {v2, v4, v3}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2, v1, v14}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lc70/b;

    const/16 v1, 0x1a

    invoke-direct {v11, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/w;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/b;

    const/16 v1, 0x1c

    invoke-direct {v11, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/y;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/b;

    const/16 v1, 0x1d

    invoke-direct {v11, v1}, Lc70/b;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/z;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/c;

    const/4 v1, 0x0

    invoke-direct {v11, v1}, Lc70/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/x;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/c;

    const/4 v1, 0x1

    invoke-direct {v11, v1}, Lc70/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/f0;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/c;

    const/4 v1, 0x2

    invoke-direct {v11, v1}, Lc70/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/i0;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/c;

    const/4 v1, 0x3

    invoke-direct {v11, v1}, Lc70/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/h0;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/c;

    const/4 v1, 0x4

    invoke-direct {v11, v1}, Lc70/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/a0;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/c;

    const/4 v1, 0x5

    invoke-direct {v11, v1}, Lc70/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lf70/t0;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/c;

    const/4 v1, 0x7

    invoke-direct {v11, v1}, Lc70/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lv70/e;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/c;

    const/16 v1, 0x8

    invoke-direct {v11, v1}, Lc70/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lz70/a;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/c;

    const/16 v1, 0xa

    invoke-direct {v11, v1}, Lc70/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lx70/c;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/c;

    const/16 v1, 0xb

    invoke-direct {v11, v1}, Lc70/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lx70/a;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/c;

    const/16 v1, 0xc

    invoke-direct {v11, v1}, Lc70/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lt70/a;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/c;

    const/16 v1, 0xd

    invoke-direct {v11, v1}, Lc70/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lv70/g;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/c;

    const/16 v1, 0xe

    invoke-direct {v11, v1}, Lc70/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Ly70/b;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/c;

    const/16 v1, 0xf

    invoke-direct {v11, v1}, Lc70/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/activation/dayzero/domain/network/DayZeroSplashApi;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/c;

    const/16 v1, 0x10

    invoke-direct {v11, v1}, Lc70/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, Ly60/c;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/c;

    const/16 v1, 0x12

    invoke-direct {v11, v1}, Lc70/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, La70/c;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v11, Lc70/c;

    const/16 v1, 0x13

    invoke-direct {v11, v1}, Lc70/c;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    new-instance v7, Lqf3/b;

    const-class v1, La70/b;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v7}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final M1(Lxf3/c;Luf3/a;)Lh80/c;
    .locals 5

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lh80/c;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lfi0/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfi0/a;

    const-class v3, Lhf1/b;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lhf1/b;

    const-class v4, Lbc3/c0;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbc3/c0;

    invoke-direct {p1, v1, v3, p0}, Lh80/c;-><init>(Lfi0/a;Lhf1/b;Lbc3/c0;)V

    return-object p1
.end method

.method public static synthetic N(Lxf3/c;Luf3/a;)Lcom/whoop/activation/domain/ActivationAuthenticatedApi;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->X1(Lxf3/c;Luf3/a;)Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    move-result-object p0

    return-object p0
.end method

.method private static final N0(Lxf3/c;Luf3/a;)Lvn0/e;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lvn0/e;

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p1}, Lvn0/e;-><init>(Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method

.method private static final N1(Lxf3/c;Luf3/a;)Lb80/c;
    .locals 5

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lb80/c;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lfi0/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfi0/a;

    const-class v3, Lhf1/b;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lhf1/b;

    const-class v4, Lbc3/c0;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbc3/c0;

    invoke-direct {p1, v1, v3, p0}, Lb80/c;-><init>(Lfi0/a;Lhf1/b;Lbc3/c0;)V

    return-object p1
.end method

.method public static synthetic O(Lxf3/c;Luf3/a;)Lf70/k0;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->a1(Lxf3/c;Luf3/a;)Lf70/k0;

    move-result-object p0

    return-object p0
.end method

.method private static final O0(Lxf3/c;Luf3/a;)Lwn0/b;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lwn0/b;

    const-class v0, Lcom/whoop/service/network/AuthServiceApiV2;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/service/network/AuthServiceApiV2;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lwn0/b;-><init>(Lcom/whoop/service/network/AuthServiceApiV2;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final O1(Lxf3/c;Luf3/a;)Ll80/p;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "$this$factory"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "params"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ll80/p;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v4, Leb/u0;

    invoke-virtual {v2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v1, v5}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object v5

    const/16 v6, 0x27

    const-string v7, "No value found for type \'"

    if-eqz v5, :cond_2

    move-object v4, v5

    check-cast v4, Leb/u0;

    const-class v5, Lj02/o0;

    invoke-virtual {v2, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-virtual {v1, v8}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_1

    move-object v5, v8

    check-cast v5, Lj02/o0;

    const-class v8, Lsr2/y;

    invoke-virtual {v2, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v0, v9, v8, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lsr2/y;

    const-class v10, Landroidx/fragment/app/r0;

    invoke-virtual {v2, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-virtual {v1, v11}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_0

    move-object v7, v1

    check-cast v7, Landroidx/fragment/app/r0;

    const-class v1, Lur2/a;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v9, v1, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lur2/a;

    const-class v6, Ll80/s;

    invoke-virtual {v2, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {v0, v9, v6, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll80/s;

    const-class v10, Ljs0/c;

    invoke-virtual {v2, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-virtual {v0, v9, v10, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljs0/c;

    const-class v11, Liy1/c;

    invoke-virtual {v2, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-virtual {v0, v9, v11, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Liy1/c;

    const-class v12, Lpy1/a;

    invoke-virtual {v2, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-virtual {v0, v9, v12, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lpy1/a;

    const-class v13, Lji0/e;

    invoke-virtual {v2, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v9, v2, v9}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lji0/e;

    const/16 v15, 0x400

    const/16 v16, 0x0

    const/4 v14, 0x0

    move-object v9, v6

    move-object v6, v8

    move-object v8, v1

    invoke-direct/range {v3 .. v16}, Ll80/p;-><init>(Leb/u0;Lj02/o0;Lsr2/y;Landroidx/fragment/app/r0;Lur2/a;Ll80/s;Ljs0/c;Liy1/c;Lpy1/a;Lji0/e;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_0
    new-instance v0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v10, v1, v6}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v5, v1, v6}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2, v4, v1, v6}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic P(Lxf3/c;Luf3/a;)Lm70/d;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->C1(Lxf3/c;Luf3/a;)Lm70/d;

    move-result-object p0

    return-object p0
.end method

.method private static final P0(Lxf3/c;Luf3/a;)Lf70/a;
    .locals 11

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/a;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    const-class v3, Lp70/b;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp70/b;

    const-class v4, Lod1/j;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lod1/j;

    const-class v5, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v6, Lwn0/b;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v2, v6, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lwn0/b;

    const-class v7, Lh80/c;

    invoke-virtual {p1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Lh80/c;

    const/16 v9, 0x40

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v10}, Lf70/a;-><init>(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lp70/b;Lod1/j;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwn0/b;Lh80/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final P1(Lxf3/c;Luf3/a;)Ll80/t;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ll80/t;

    invoke-static {p0}, Lpf/c;->i(Lxf3/c;)Landroid/content/Context;

    move-result-object p0

    invoke-direct {p1, p0}, Ll80/t;-><init>(Landroid/content/Context;)V

    return-object p1
.end method

.method public static synthetic Q(Lxf3/c;Luf3/a;)Lwn0/b;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->O0(Lxf3/c;Luf3/a;)Lwn0/b;

    move-result-object p0

    return-object p0
.end method

.method private static final Q0(Lxf3/c;Luf3/a;)Lj70/c;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lj70/c;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lh80/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh80/c;

    const-class v3, Lb80/c;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb80/c;

    invoke-direct {p1, v1, p0}, Lj70/c;-><init>(Lh80/c;Lb80/c;)V

    return-object p1
.end method

.method private static final Q1(Lxf3/c;Luf3/a;)Lq80/j;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lq80/j;

    const-class v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-direct {p1, p0}, Lq80/j;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-object p1
.end method

.method public static synthetic R(Lxf3/c;Luf3/a;)Lq80/j;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->Q1(Lxf3/c;Luf3/a;)Lq80/j;

    move-result-object p0

    return-object p0
.end method

.method private static final R0(Lxf3/c;Luf3/a;)Ll70/a;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ll70/a;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v3, Lhf1/b;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lhf1/b;

    const-class v4, Lh80/c;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lh80/c;

    invoke-direct {p1, v1, v3, p0}, Ll70/a;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lhf1/b;Lh80/c;)V

    return-object p1
.end method

.method private static final R1(Lxf3/c;Luf3/a;)Lj70/a;
    .locals 10

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lj70/a;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Ln70/c;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln70/c;

    const-class v3, Lod1/j;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lod1/j;

    const-class v4, Ll70/a;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll70/a;

    const-class v5, Lj70/c;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lj70/c;

    const-class v6, Lj70/d;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v2, v6, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lj70/d;

    const-class v7, Lk70/a;

    invoke-virtual {p1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {p0, v2, v7, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lk70/a;

    const-class v8, Lf70/y0;

    invoke-virtual {p1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-virtual {p0, v2, v8, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lf70/y0;

    const-class v9, Lf70/u;

    invoke-virtual {p1, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v9, p0

    check-cast v9, Lf70/u;

    move-object v2, v0

    invoke-direct/range {v1 .. v9}, Lj70/a;-><init>(Ln70/c;Lod1/j;Ll70/a;Lj70/c;Lj70/d;Lk70/a;Lf70/y0;Lf70/u;)V

    return-object v1
.end method

.method public static synthetic S(Lxf3/c;Luf3/a;)Lm5/f;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->S0(Lxf3/c;Luf3/a;)Lm5/f;

    move-result-object p0

    return-object p0
.end method

.method private static final S0(Lxf3/c;Luf3/a;)Lm5/f;
    .locals 2

    const-string v0, "$this$single"

    const-string v1, "it"

    invoke-static {p0, v0, p1, v1, p0}, Lb9/y;->e(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Lxf3/c;)Landroid/content/Context;

    move-result-object p0

    const-string p1, "context"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lm5/h;

    invoke-direct {p1, p0}, Lm5/h;-><init>(Landroid/content/Context;)V

    return-object p1
.end method

.method private static final S1(Lxf3/c;Luf3/a;)Ljava/util/Map;
    .locals 33

    const-string v0, "$this$factory"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/activation/domain/models/steps/ActivationFlowCreatePasswordStep;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ll83/k;

    const-string v3, "CREATE_PASSWORD"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/CountrySelectionStepModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v4, Ll83/k;

    const-string v5, "SELECT_COUNTRY"

    invoke-direct {v4, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/StateSelectionStepModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object v5, v4

    new-instance v4, Ll83/k;

    const-string v6, "SELECT_STATE"

    invoke-direct {v4, v6, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/CreateYourAccountStepModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object v6, v5

    new-instance v5, Ll83/k;

    const-string v7, "CREATE_YOUR_ACCOUNT"

    invoke-direct {v5, v7, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/DeviceEducationStepModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object v7, v6

    new-instance v6, Ll83/k;

    const-string v8, "DEVICE_EDUCATION"

    invoke-direct {v6, v8, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/HealthConnectStepModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object v8, v7

    new-instance v7, Ll83/k;

    const-string v9, "GOOGLE_HEALTH_CONNECT"

    invoke-direct {v7, v9, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/NameInformationStepModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object v9, v8

    new-instance v8, Ll83/k;

    const-string v10, "NAME_INFO"

    invoke-direct {v8, v10, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/BirthdayStepModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object v10, v9

    new-instance v9, Ll83/k;

    const-string v11, "SELECT_BIRTHDAY"

    invoke-direct {v9, v11, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/NotificationsStepModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object v11, v10

    new-instance v10, Ll83/k;

    const-string v12, "NOTIFICATIONS"

    invoke-direct {v10, v12, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/PaymentMethodStepModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object v12, v11

    new-instance v11, Ll83/k;

    const-string v13, "PAYMENT_METHOD"

    invoke-direct {v11, v13, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/ReferAFriendCodesModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object v13, v12

    new-instance v12, Ll83/k;

    const-string v14, "REFER_A_FRIEND_CODES"

    invoke-direct {v12, v14, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/GiftStepModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object v14, v13

    new-instance v13, Ll83/k;

    const-string v15, "REFER_A_FRIEND"

    invoke-direct {v13, v15, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/HeightAndWeightStepModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object v15, v14

    new-instance v14, Ll83/k;

    move-object/from16 p0, v2

    const-string v2, "HEIGHT_AND_WEIGHT"

    invoke-direct {v14, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/BillingFrequencyStepModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    move-object v2, v15

    new-instance v15, Ll83/k;

    move-object/from16 p1, v2

    const-string v2, "BILLING_FREQUENCY"

    invoke-direct {v15, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/GenderStepModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ll83/k;

    move-object/from16 v16, v4

    const-string v4, "GENDER"

    invoke-direct {v2, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/PrivacyConsentModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v4, Ll83/k;

    move-object/from16 v17, v2

    const-string v2, "CONSENTS"

    invoke-direct {v4, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/DeidentifiedStepModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ll83/k;

    move-object/from16 v18, v4

    const-string v4, "DEIDENTIFIED"

    invoke-direct {v2, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/JoinTeamStepModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v4, Ll83/k;

    move-object/from16 v19, v2

    const-string v2, "JOIN_TEAM"

    invoke-direct {v4, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/WelcomeTransitionStepModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ll83/k;

    move-object/from16 v20, v4

    const-string v4, "WELCOME_TRANSITION"

    invoke-direct {v2, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v4, Ll83/k;

    move-object/from16 v21, v2

    const-string v2, "ENTER_YOUR_EMAIL"

    invoke-direct {v4, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/EnterYourPasswordStepModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ll83/k;

    move-object/from16 v22, v4

    const-string v4, "ENTER_YOUR_PASSWORD"

    invoke-direct {v2, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/CreatePasswordStepModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v4, Ll83/k;

    invoke-direct {v4, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/UpcyclePlanPickerModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v3, Ll83/k;

    move-object/from16 v23, v2

    const-string v2, "PLAN_PICKER"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/TrialPlanPickerModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ll83/k;

    move-object/from16 v24, v3

    const-string v3, "TRIAL_OFFER_PLAN_PICKER"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/UpcycleJoinTodayModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v3, Ll83/k;

    move-object/from16 v25, v2

    const-string v2, "JOIN_TODAY"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/TrialOfferCheckoutModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ll83/k;

    move-object/from16 v26, v3

    const-string v3, "TRIAL_OFFER_CHECKOUT"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/CheckYourEmailStepModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v3, Ll83/k;

    move-object/from16 v27, v2

    const-string v2, "CHECK_YOUR_INBOX"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/FamilyPlanBlockStepModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ll83/k;

    move-object/from16 v28, v3

    const-string v3, "FAMILY_PLAN_BLOCK"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/HeroWithFooterCtaStepModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v3, Ll83/k;

    move-object/from16 v29, v2

    const-string v2, "HERO_WITH_FOOTER_CTA"

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/activation/domain/models/steps/UniversalPaymentMethodStepModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ll83/k;

    move-object/from16 v30, v3

    const-string v3, "UNIVERSAL_PAYMENT_METHOD"

    invoke-direct {v2, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class v1, Lcom/whoop/payments/stripepaymentsheettileminiarch/model/MiniArchStripePaymentSheetTileModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Ll83/k;

    const-string v3, "MINI_ARCH_STRIPE_PAYMENT_SHEET_TILE"

    invoke-direct {v1, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v3, v23

    move-object/from16 v23, v4

    move-object/from16 v4, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v20, v21

    move-object/from16 v21, v22

    move-object/from16 v22, v3

    move-object/from16 v3, p1

    move-object/from16 v32, v1

    move-object/from16 v31, v2

    move-object/from16 v2, p0

    filled-new-array/range {v2 .. v32}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic T(Lxf3/c;Luf3/a;)Lf70/u;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->b1(Lxf3/c;Luf3/a;)Lf70/u;

    move-result-object p0

    return-object p0
.end method

.method private static final T0(Lxf3/c;Luf3/a;)Lf80/a;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf80/a;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lm5/f;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm5/f;

    const-class v3, Lcom/whoop/data/datastore/EmailDataStoreHelper;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lcom/whoop/data/datastore/EmailDataStoreHelper;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lf80/a;-><init>(Lm5/f;Lcom/whoop/data/datastore/EmailDataStoreHelper;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final T1(Lxf3/c;Luf3/a;)Lcom/whoop/activation/domain/UsersServiceValidationApi;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/google/gson/Gson;

    invoke-direct {p1}, Lcom/google/gson/Gson;-><init>()V

    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object v0

    sget-object v1, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->KT_SERIALIZATION_ACTIVATION:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-virtual {v1}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->getFlagName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lu82/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {p0, v4, v3, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu82/e;

    invoke-virtual {v3, p1, v0, v1}, Lu82/e;->a(Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;)Lu82/d;

    move-result-object p1

    new-instance v0, Lpg3/x0;

    invoke-direct {v0}, Lpg3/x0;-><init>()V

    const-class v1, Lsr2/y;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v4, v1, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsr2/y;

    const-string v3, "unauthenticatedOkHttpClient"

    invoke-static {v1, v0, p1, v3}, Lb9/y;->y(Lsr2/y;Lpg3/x0;Lu82/d;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    const-class v1, Lud3/l0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v4, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lud3/l0;

    const-class p1, Lcom/whoop/activation/domain/UsersServiceValidationApi;

    const-string v1, "create(...)"

    invoke-static {v0, p0, p1, v1}, Lb9/y;->f(Lpg3/x0;Lud3/l0;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/activation/domain/UsersServiceValidationApi;

    return-object p0
.end method

.method public static synthetic U(Lxf3/c;Luf3/a;)Lf70/o0;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->p1(Lxf3/c;Luf3/a;)Lf70/o0;

    move-result-object p0

    return-object p0
.end method

.method private static final U0(Lxf3/c;Luf3/a;)Lf80/d;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lf80/d;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lh80/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh80/c;

    const-class v3, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-direct {p1, v1, p0}, Lf80/d;-><init>(Lh80/c;Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-object p1
.end method

.method private static final U1(Lxf3/c;Luf3/a;)Lcom/whoop/activation/domain/AuthedUsernameValidationApi;
    .locals 6

    const-string v0, "it"

    const-string v1, "unauthenticatedOkHttpClient"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lud3/l0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lud3/l0;

    invoke-virtual {p1}, Lud3/l0;->a()Lud3/k0;

    move-result-object p1

    const-class v1, Lj92/i;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/g0;

    invoke-virtual {p1, v1}, Lud3/k0;->a(Lud3/g0;)V

    const-class v1, Ll92/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/c;

    const-string v3, "authenticator"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p1, Lud3/k0;->h:Lud3/c;

    new-instance v1, Lud3/l0;

    invoke-direct {v1, p1}, Lud3/l0;-><init>(Lud3/k0;)V

    new-instance p1, Lcom/google/gson/Gson;

    invoke-direct {p1}, Lcom/google/gson/Gson;-><init>()V

    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object v3

    sget-object v4, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->KT_SERIALIZATION_ACTIVATION:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-virtual {v4}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->getFlagName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    const-class v5, Lu82/e;

    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lu82/e;

    invoke-virtual {v5, p1, v3, v4}, Lu82/e;->a(Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;)Lu82/d;

    move-result-object p1

    new-instance v3, Lpg3/x0;

    invoke-direct {v3}, Lpg3/x0;-><init>()V

    const-class v4, Lsr2/y;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lsr2/y;

    invoke-virtual {p0}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Lpg3/x0;->c(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Lpg3/x0;->b(Lpg3/m;)V

    iput-object v1, v3, Lpg3/x0;->a:Lud3/i;

    invoke-virtual {v3}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object p0

    const-class p1, Lcom/whoop/activation/domain/AuthedUsernameValidationApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "create(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/whoop/activation/domain/AuthedUsernameValidationApi;

    return-object p0
.end method

.method public static synthetic V(Lxf3/c;Luf3/a;)Lg80/a;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->J1(Lxf3/c;Luf3/a;)Lg80/a;

    move-result-object p0

    return-object p0
.end method

.method private static final V0(Lxf3/c;Luf3/a;)Lf80/e;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lf80/e;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lf80/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf80/a;

    const-class v3, Lf80/d;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf80/d;

    const-class v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-direct {p1, v1, v3, p0}, Lf80/e;-><init>(Lf80/a;Lf80/d;Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-object p1
.end method

.method private static final V1(Lxf3/c;Luf3/a;)Ld70/a;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ld70/a;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v3, Lj92/r;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lj92/r;

    const-class v4, Ll92/a;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll92/a;

    invoke-direct {p1, v1, v3, p0}, Ld70/a;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;Lj92/r;Ll92/a;)V

    return-object p1
.end method

.method public static synthetic W(Lxf3/c;Luf3/a;)Ly70/b;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->t2(Lxf3/c;Luf3/a;)Ly70/b;

    move-result-object p0

    return-object p0
.end method

.method private static final W0(Lxf3/c;Luf3/a;)Lf70/a1;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lf70/a1;

    invoke-direct {p0}, Lf70/a1;-><init>()V

    return-object p0
.end method

.method private static final W1(Lxf3/c;Luf3/a;)Lcom/whoop/activation/domain/ActivationApi;
    .locals 11

    const-string v0, "it"

    const-string v1, "unauthenticatedOkHttpClient"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lud3/l0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lud3/l0;

    invoke-virtual {p1}, Lud3/l0;->a()Lud3/k0;

    move-result-object p1

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x14

    invoke-virtual {p1, v3, v4, v1}, Lud3/k0;->e(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {p1, v3, v4, v1}, Lud3/k0;->b(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {p1, v3, v4, v1}, Lud3/k0;->f(JLjava/util/concurrent/TimeUnit;)V

    const-class v1, Lj92/d;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/g0;

    invoke-virtual {p1, v1}, Lud3/k0;->a(Lud3/g0;)V

    new-instance v1, Lud3/l0;

    invoke-direct {v1, p1}, Lud3/l0;-><init>(Lud3/k0;)V

    new-instance p1, Lvf3/c;

    const-string v3, "activation-feature-models"

    invoke-direct {p1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Ljava/util/Map;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Ljava/util/Map;

    new-instance p1, Lcom/google/gson/GsonBuilder;

    invoke-direct {p1}, Lcom/google/gson/GsonBuilder;-><init>()V

    const/4 v3, 0x2

    invoke-static {p1, v4, v2, v3, v2}, Lcom/whoop/design/json/d;->f(Lcom/google/gson/GsonBuilder;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object p1

    const/16 v9, 0x1e

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v10}, Lcom/whoop/design/json/b;->e(Lxf3/c;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Liy1/c;Lrr2/c;ILjava/lang/Object;)Lad3/c;

    move-result-object p0

    const-class v4, Lu82/e;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v3, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu82/e;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v5, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->KT_SERIALIZATION_ACTIVATION:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-virtual {v5}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->getFlagName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    invoke-virtual {v4, p1, p0, v5}, Lu82/e;->a(Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;)Lu82/d;

    move-result-object p0

    new-instance p1, Lpg3/x0;

    invoke-direct {p1}, Lpg3/x0;-><init>()V

    const-class v4, Lsr2/y;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {v3, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsr2/y;

    invoke-virtual {v0}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lpg3/x0;->c(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lpg3/x0;->b(Lpg3/m;)V

    iput-object v1, p1, Lpg3/x0;->a:Lud3/i;

    invoke-virtual {p1}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object p0

    const-class p1, Lcom/whoop/activation/domain/ActivationApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "create(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/whoop/activation/domain/ActivationApi;

    return-object p0
.end method

.method public static synthetic X(Lxf3/c;Luf3/a;)Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->B1(Lxf3/c;Luf3/a;)Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;

    move-result-object p0

    return-object p0
.end method

.method private static final X0(Lxf3/c;Luf3/a;)Lf70/b1;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lf70/b1;

    const/4 p1, 0x0

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, p1}, Lf70/b1;-><init>(Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method

.method private static final X1(Lxf3/c;Luf3/a;)Lcom/whoop/activation/domain/ActivationAuthenticatedApi;
    .locals 11

    const-string v0, "it"

    const-string v1, "unauthenticatedOkHttpClient"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lud3/l0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lud3/l0;

    invoke-virtual {p1}, Lud3/l0;->a()Lud3/k0;

    move-result-object p1

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x14

    invoke-virtual {p1, v3, v4, v1}, Lud3/k0;->e(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {p1, v3, v4, v1}, Lud3/k0;->b(JLjava/util/concurrent/TimeUnit;)V

    invoke-virtual {p1, v3, v4, v1}, Lud3/k0;->f(JLjava/util/concurrent/TimeUnit;)V

    const-class v1, Lj92/d;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/g0;

    invoke-virtual {p1, v1}, Lud3/k0;->a(Lud3/g0;)V

    const-class v1, Lj92/i;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/g0;

    invoke-virtual {p1, v1}, Lud3/k0;->a(Lud3/g0;)V

    const-class v1, Ld70/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/c;

    const-string v3, "authenticator"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p1, Lud3/k0;->h:Lud3/c;

    new-instance v1, Lud3/l0;

    invoke-direct {v1, p1}, Lud3/l0;-><init>(Lud3/k0;)V

    new-instance p1, Lvf3/c;

    const-string v3, "activation-feature-models"

    invoke-direct {p1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Ljava/util/Map;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Ljava/util/Map;

    new-instance p1, Lcom/google/gson/GsonBuilder;

    invoke-direct {p1}, Lcom/google/gson/GsonBuilder;-><init>()V

    const/4 v3, 0x2

    invoke-static {p1, v4, v2, v3, v2}, Lcom/whoop/design/json/d;->f(Lcom/google/gson/GsonBuilder;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object p1

    const/16 v9, 0x1e

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v10}, Lcom/whoop/design/json/b;->e(Lxf3/c;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Liy1/c;Lrr2/c;ILjava/lang/Object;)Lad3/c;

    move-result-object p0

    const-class v4, Lu82/e;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v3, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu82/e;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v5, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->KT_SERIALIZATION_ACTIVATION:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-virtual {v5}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->getFlagName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v5

    invoke-virtual {v4, p1, p0, v5}, Lu82/e;->a(Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;)Lu82/d;

    move-result-object p0

    new-instance p1, Lpg3/x0;

    invoke-direct {p1}, Lpg3/x0;-><init>()V

    const-class v4, Lsr2/y;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {v3, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsr2/y;

    invoke-virtual {v0}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lpg3/x0;->c(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lpg3/x0;->b(Lpg3/m;)V

    iput-object v1, p1, Lpg3/x0;->a:Lud3/i;

    invoke-virtual {p1}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object p0

    const-class p1, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "create(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    return-object p0
.end method

.method public static synthetic Y(Lxf3/c;Luf3/a;)Ln70/c;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->E1(Lxf3/c;Luf3/a;)Ln70/c;

    move-result-object p0

    return-object p0
.end method

.method private static final Y0(Lxf3/c;Luf3/a;)Lf70/q;
    .locals 8

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/q;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, La6/g;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La6/g;

    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object v3

    const-class v4, Liy1/c;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Liy1/c;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Lf70/q;-><init>(La6/g;Lad3/c;Liy1/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final Y1(Lxf3/c;Luf3/a;)Lf70/l;
    .locals 10

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/l;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lod1/p;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lod1/p;

    const-class v3, Lcom/whoop/data/remote/NewWhoopLoginInterceptor;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/data/remote/NewWhoopLoginInterceptor;

    const-class v4, Lod1/a0;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lod1/a0;

    const-class v5, Lpd1/a;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpd1/a;

    const-class v6, Lod1/j;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lod1/j;

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v9}, Lf70/l;-><init>(Lod1/p;Lcom/whoop/data/remote/NewWhoopLoginInterceptor;Lod1/a0;Lpd1/a;Lod1/j;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic Z(Lxf3/c;Luf3/a;)Lvn0/e;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->N0(Lxf3/c;Luf3/a;)Lvn0/e;

    move-result-object p0

    return-object p0
.end method

.method private static final Z0(Lxf3/c;Luf3/a;)Lf70/h;
    .locals 14

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/h;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lf70/r0;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lf70/r0;

    const-class v0, Lpj1/b;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lpj1/b;

    const-class v0, Lf70/a0;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lf70/a0;

    const-class v0, Lf70/a1;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lf70/a1;

    const-class v0, Lf70/b1;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lf70/b1;

    const-class v0, Li70/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Li70/a;

    const-class v0, Lj70/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lj70/a;

    const-class v0, Lg70/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lg70/a;

    const-class v0, Lh70/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v11, p0

    check-cast v11, Lh70/a;

    const/4 v12, 0x1

    const/4 v13, 0x0

    invoke-direct/range {v1 .. v13}, Lf70/h;-><init>(Ltr2/n;Lf70/r0;Lpj1/b;Lf70/a0;Lf70/a1;Lf70/b1;Li70/a;Lj70/a;Lg70/a;Lh70/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final Z1(Lxf3/c;Luf3/a;)Lf70/m0;
    .locals 17

    move-object/from16 v0, p0

    const-string v1, "$this$factory"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lf70/m0;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lod1/a0;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v3, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lod1/a0;

    const-class v5, Lp70/b;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v0, v4, v5, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp70/b;

    const-class v6, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {v0, v4, v6, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v7, Lh80/c;

    invoke-virtual {v1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {v0, v4, v7, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lh80/c;

    const-class v8, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    invoke-virtual {v1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-virtual {v0, v4, v8, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    const-class v9, Lb80/c;

    invoke-virtual {v1, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-virtual {v0, v4, v9, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lb80/c;

    const-class v10, Lf70/t0;

    invoke-virtual {v1, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-virtual {v0, v4, v10, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lf70/t0;

    const-class v11, Ll70/a;

    invoke-virtual {v1, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-virtual {v0, v4, v11, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll70/a;

    const-class v12, Ls82/a;

    invoke-virtual {v1, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-virtual {v0, v4, v12, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ls82/a;

    const-class v13, Lf70/u;

    invoke-virtual {v1, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v13

    invoke-virtual {v0, v4, v13, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lf70/u;

    const-class v14, Lf80/d;

    invoke-virtual {v1, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v4, v1, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf80/d;

    const/16 v15, 0x800

    const/16 v16, 0x0

    const/4 v14, 0x0

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v13

    move-object v13, v0

    invoke-direct/range {v2 .. v16}, Lf70/m0;-><init>(Lod1/a0;Lp70/b;Lcom/whoop/data/repositories/FeatureFlagChecker;Lh80/c;Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lb80/c;Lf70/t0;Ll70/a;Ls82/a;Lf70/u;Lf80/d;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method public static synthetic a(Lxf3/c;Luf3/a;)Lf70/a;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->P0(Lxf3/c;Luf3/a;)Lf70/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a0(Lxf3/c;Luf3/a;)Lv70/g;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->s2(Lxf3/c;Luf3/a;)Lv70/g;

    move-result-object p0

    return-object p0
.end method

.method private static final a1(Lxf3/c;Luf3/a;)Lf70/k0;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/k0;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/activation/domain/ActivationApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/activation/domain/ActivationApi;

    const-class v3, Lcom/whoop/data/datastore/EmailDataStoreHelper;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/data/datastore/EmailDataStoreHelper;

    const-class v4, Lwn0/b;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lwn0/b;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Lf70/k0;-><init>(Lcom/whoop/activation/domain/ActivationApi;Lcom/whoop/data/datastore/EmailDataStoreHelper;Lwn0/b;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final a2(Lxf3/c;Luf3/a;)Lp70/a;
    .locals 2

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lp70/a;

    const-class v0, Lci2/b;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lci2/b;

    invoke-direct {p1, p0}, Lp70/a;-><init>(Lci2/b;)V

    return-object p1
.end method

.method public static synthetic b(Lxf3/c;Luf3/a;)Lf70/c;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->o1(Lxf3/c;Luf3/a;)Lf70/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b0(Lxf3/c;Luf3/a;)Lf70/c1;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->z1(Lxf3/c;Luf3/a;)Lf70/c1;

    move-result-object p0

    return-object p0
.end method

.method private static final b1(Lxf3/c;Luf3/a;)Lf70/u;
    .locals 10

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/u;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    const-class v3, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v4, Lp70/b;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp70/b;

    const-class v5, Liy1/c;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Liy1/c;

    const-class v6, Lf70/q;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lf70/q;

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v9}, Lf70/u;-><init>(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lcom/whoop/data/repositories/FeatureFlagChecker;Lp70/b;Liy1/c;Lf70/q;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final b2(Lxf3/c;Luf3/a;)Lf70/w;
    .locals 10

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/w;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/activation/domain/ActivationApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/activation/domain/ActivationApi;

    const-class v3, Lcom/whoop/data/remote/api/FileDownloaderApi;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/data/remote/api/FileDownloaderApi;

    const-class v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-static {}, Ljava/time/Clock;->systemDefaultZone()Ljava/time/Clock;

    move-result-object v5

    const-string v6, "systemDefaultZone(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v6, Liy1/c;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Liy1/c;

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v9}, Lf70/w;-><init>(Lcom/whoop/activation/domain/ActivationApi;Lcom/whoop/data/remote/api/FileDownloaderApi;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljava/time/Clock;Liy1/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic c(Lxf3/c;Luf3/a;)Lg70/a;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->G1(Lxf3/c;Luf3/a;)Lg70/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c0(Luf3/a;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lc70/d;->p2(Luf3/a;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final c1(Lxf3/c;Luf3/a;)Lf70/r;
    .locals 5

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lf70/r;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lf70/q;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf70/q;

    const-class v3, Lod1/a0;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lod1/a0;

    const-class v4, Lbc3/c0;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbc3/c0;

    invoke-direct {p1, v1, v3, p0}, Lf70/r;-><init>(Lf70/q;Lod1/a0;Lbc3/c0;)V

    return-object p1
.end method

.method private static final c2(Lxf3/c;Luf3/a;)Lj70/d;
    .locals 21

    move-object/from16 v0, p0

    const-string v1, "$this$factory"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lj70/d;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lf70/x0;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v3, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf70/x0;

    const-class v5, Lod1/j;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v0, v4, v5, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lod1/j;

    const-class v6, Lf70/z0;

    invoke-virtual {v1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {v0, v4, v6, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf70/z0;

    const-class v7, Lf70/w0;

    invoke-virtual {v1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {v0, v4, v7, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lf70/w0;

    const-class v8, Lf70/d1;

    invoke-virtual {v1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-virtual {v0, v4, v8, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lf70/d1;

    const-class v9, Lh80/c;

    invoke-virtual {v1, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-virtual {v0, v4, v9, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lh80/c;

    const-class v10, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v1, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-virtual {v0, v4, v10, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v11, Lpj1/b;

    invoke-virtual {v1, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-virtual {v0, v4, v11, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lpj1/b;

    const-class v12, Lf70/m0;

    invoke-virtual {v1, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-virtual {v0, v4, v12, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lf70/m0;

    const-class v13, Lf70/x;

    invoke-virtual {v1, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v13

    invoke-virtual {v0, v4, v13, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lf70/x;

    const-class v14, Lci2/b;

    invoke-virtual {v1, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v14

    invoke-virtual {v0, v4, v14, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lci2/b;

    const-class v15, Lhf1/b;

    invoke-virtual {v1, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v15

    invoke-virtual {v0, v4, v15, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lhf1/b;

    move-object/from16 p1, v2

    const-class v2, Ll70/a;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll70/a;

    move-object/from16 v16, v2

    const-class v2, Lbc3/c0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbc3/c0;

    move-object/from16 v17, v2

    const-class v2, Lf70/h0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf70/h0;

    move-object/from16 v18, v2

    const-class v2, Lf70/j0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf70/j0;

    move-object/from16 v19, v2

    const-class v2, Lf70/k0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf70/k0;

    move-object/from16 v20, v2

    const-class v2, Lf70/i0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v4, v1, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf70/i0;

    move-object/from16 v2, p1

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v13

    move-object v13, v14

    move-object v14, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v20, v0

    invoke-direct/range {v2 .. v20}, Lj70/d;-><init>(Lf70/x0;Lod1/j;Lf70/z0;Lf70/w0;Lf70/d1;Lh80/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lpj1/b;Lf70/m0;Lf70/x;Lci2/b;Lhf1/b;Ll70/a;Lbc3/c0;Lf70/h0;Lf70/j0;Lf70/k0;Lf70/i0;)V

    return-object v2
.end method

.method public static synthetic d(Lxf3/c;Luf3/a;)Lf70/q;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->Y0(Lxf3/c;Luf3/a;)Lf70/q;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d0(Lxf3/c;Luf3/a;)Lf70/j0;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->d1(Lxf3/c;Luf3/a;)Lf70/j0;

    move-result-object p0

    return-object p0
.end method

.method private static final d1(Lxf3/c;Luf3/a;)Lf70/j0;
    .locals 9

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/j0;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/activation/domain/ActivationApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/activation/domain/ActivationApi;

    const-class v3, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    const-class v4, Lod1/j;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lod1/j;

    const-class v5, Lf70/u;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lf70/u;

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v8}, Lf70/j0;-><init>(Lcom/whoop/activation/domain/ActivationApi;Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lod1/j;Lf70/u;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final d2(Lxf3/c;Luf3/a;)Lf70/y;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Landroid/content/Context;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    const-class v2, Lcom/whoop/data/datastore/EmailDataStoreHelper;

    invoke-virtual {p1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/data/datastore/EmailDataStoreHelper;

    const-class v3, Ls82/a;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v1, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls82/a;

    const-class v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    new-instance p1, Lf70/y;

    invoke-direct {p1, v2, v0, v3, p0}, Lf70/y;-><init>(Lcom/whoop/data/datastore/EmailDataStoreHelper;Landroid/content/Context;Ls82/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-object p1
.end method

.method public static synthetic e(Lxf3/c;Luf3/a;)Lcom/whoop/activation/domain/ActivationApi;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->W1(Lxf3/c;Luf3/a;)Lcom/whoop/activation/domain/ActivationApi;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e0(Lxf3/c;Luf3/a;)Lf70/z0;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->w1(Lxf3/c;Luf3/a;)Lf70/z0;

    move-result-object p0

    return-object p0
.end method

.method private static final e1(Lxf3/c;Luf3/a;)Lf70/r0;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lf70/r0;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/data/datastore/EmailDataStoreHelper;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/data/datastore/EmailDataStoreHelper;

    const-class v3, Lb80/c;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb80/c;

    invoke-direct {p1, v1, p0}, Lf70/r0;-><init>(Lcom/whoop/data/datastore/EmailDataStoreHelper;Lb80/c;)V

    return-object p1
.end method

.method private static final e2(Lxf3/c;Luf3/a;)Lf70/z;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lf70/z;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Landroid/content/Context;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    const-class v3, Ls82/a;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ls82/a;

    const-class v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-direct {p1, v1, v3, p0}, Lf70/z;-><init>(Landroid/content/Context;Ls82/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-object p1
.end method

.method public static synthetic f(Lxf3/c;Luf3/a;)Lf70/n;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->t1(Lxf3/c;Luf3/a;)Lf70/n;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f0(Lxf3/c;Luf3/a;)Ll80/p;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->O1(Lxf3/c;Luf3/a;)Ll80/p;

    move-result-object p0

    return-object p0
.end method

.method private static final f1(Lxf3/c;Luf3/a;)Lf70/b;
    .locals 13

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/b;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/activation/domain/ActivationApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/activation/domain/ActivationApi;

    const-class v3, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    const-class v4, Lod1/j;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lod1/j;

    const-class v5, Lp70/b;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp70/b;

    const-class v6, Lcom/whoop/data/datastore/EmailDataStoreHelper;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v2, v6, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/data/datastore/EmailDataStoreHelper;

    const-class v7, Lwn0/b;

    invoke-virtual {p1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {p0, v2, v7, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lwn0/b;

    const-class v8, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v8, p0

    check-cast v8, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const/16 v11, 0x180

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v12}, Lf70/b;-><init>(Lcom/whoop/activation/domain/ActivationApi;Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lod1/j;Lp70/b;Lcom/whoop/data/datastore/EmailDataStoreHelper;Lwn0/b;Lcom/whoop/data/repositories/FeatureFlagChecker;Lh80/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final f2(Lxf3/c;Luf3/a;)Lf70/x;
    .locals 9

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/x;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/activation/domain/ActivationApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/activation/domain/ActivationApi;

    const-class v3, Lp70/b;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp70/b;

    const-class v4, Lh80/c;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh80/c;

    const-class v5, Lb80/c;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lb80/c;

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v8}, Lf70/x;-><init>(Lcom/whoop/activation/domain/ActivationApi;Lp70/b;Lh80/c;Lb80/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic g(Lxf3/c;Luf3/a;)Lx70/a;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->q2(Lxf3/c;Luf3/a;)Lx70/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g0(Lxf3/c;Luf3/a;)Lf70/p;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->r1(Lxf3/c;Luf3/a;)Lf70/p;

    move-result-object p0

    return-object p0
.end method

.method private static final g1(Lxf3/c;Luf3/a;)Lf70/b;
    .locals 13

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/b;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/activation/domain/ActivationApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/activation/domain/ActivationApi;

    const-class v3, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    const-class v4, Lod1/j;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lod1/j;

    const-class v5, Lp70/b;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp70/b;

    const-class v6, Lcom/whoop/data/datastore/EmailDataStoreHelper;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v2, v6, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/data/datastore/EmailDataStoreHelper;

    const-class v7, Lwn0/b;

    invoke-virtual {p1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {p0, v2, v7, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lwn0/b;

    const-class v8, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-virtual {p0, v2, v8, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v9, Lh80/c;

    invoke-virtual {p1, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v9, p0

    check-cast v9, Lh80/c;

    const/16 v11, 0x100

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v12}, Lf70/b;-><init>(Lcom/whoop/activation/domain/ActivationApi;Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lod1/j;Lp70/b;Lcom/whoop/data/datastore/EmailDataStoreHelper;Lwn0/b;Lcom/whoop/data/repositories/FeatureFlagChecker;Lh80/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final g2(Lxf3/c;Luf3/a;)Lf70/f0;
    .locals 9

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/f0;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/activation/domain/ActivationApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/activation/domain/ActivationApi;

    const-class v3, Lp70/b;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp70/b;

    const-class v4, Lh80/c;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh80/c;

    const-class v5, Lb80/c;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lb80/c;

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v8}, Lf70/f0;-><init>(Lcom/whoop/activation/domain/ActivationApi;Lp70/b;Lh80/c;Lb80/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic h(Lxf3/c;Luf3/a;)Lf70/y;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->d2(Lxf3/c;Luf3/a;)Lf70/y;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h0(Lxf3/c;Luf3/a;)Ld70/a;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->V1(Lxf3/c;Luf3/a;)Ld70/a;

    move-result-object p0

    return-object p0
.end method

.method private static final h1(Lxf3/c;Luf3/a;)Lf70/v0;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lf70/v0;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/activation/domain/ActivationApi;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/activation/domain/ActivationApi;

    const-class v3, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    const-class v4, Ltr2/n;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ltr2/n;

    invoke-direct {p1, v1, v3, p0}, Lf70/v0;-><init>(Lcom/whoop/activation/domain/ActivationApi;Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Ltr2/n;)V

    return-object p1
.end method

.method private static final h2(Lxf3/c;Luf3/a;)Lf70/i0;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lf70/i0;

    invoke-direct {p0}, Lf70/i0;-><init>()V

    return-object p0
.end method

.method public static synthetic i(Lxf3/c;Luf3/a;)Lf70/z;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->e2(Lxf3/c;Luf3/a;)Lf70/z;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i0(Lxf3/c;Luf3/a;)Lf70/m;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->q1(Lxf3/c;Luf3/a;)Lf70/m;

    move-result-object p0

    return-object p0
.end method

.method private static final i1(Lxf3/c;Luf3/a;)Lf70/e0;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/e0;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    const-class v3, Lh80/c;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lh80/c;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lf70/e0;-><init>(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lh80/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final i2(Lxf3/c;Luf3/a;)Lf70/h0;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/h0;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lf70/f0;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf70/f0;

    const-class v3, Lf70/k0;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf70/k0;

    const-class v4, Lf70/i0;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lf70/i0;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Lf70/h0;-><init>(Lf70/f0;Lf70/k0;Lf70/i0;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic j(Lxf3/c;Luf3/a;)Lf70/g;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->L1(Lxf3/c;Luf3/a;)Lf70/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j0(Lxf3/c;Luf3/a;)Lf70/m0;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->Z1(Lxf3/c;Luf3/a;)Lf70/m0;

    move-result-object p0

    return-object p0
.end method

.method private static final j1(Lxf3/c;Luf3/a;)Lf70/d0;
    .locals 12

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/d0;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    const-class v3, Lp70/b;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp70/b;

    const-class v4, Lh80/c;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh80/c;

    const-class v5, Lf70/c1;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf70/c1;

    const-class v6, Lf70/s0;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v2, v6, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf70/s0;

    const-class v7, Lf70/l;

    invoke-virtual {p1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {p0, v2, v7, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lf70/l;

    const-class v8, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v8, p0

    check-cast v8, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const/16 v10, 0x80

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v11}, Lf70/d0;-><init>(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lp70/b;Lh80/c;Lf70/c1;Lf70/s0;Lf70/l;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final j2(Lxf3/c;Luf3/a;)Lf70/a0;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/a0;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/service/network/AuthServiceApiV2;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/service/network/AuthServiceApiV2;

    const-class v3, Lh80/c;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lh80/c;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lf70/a0;-><init>(Lcom/whoop/service/network/AuthServiceApiV2;Lh80/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic k(Lxf3/c;Luf3/a;)Lf70/w0;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->x1(Lxf3/c;Luf3/a;)Lf70/w0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k0(Lxf3/c;Luf3/a;)Lt70/a;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->r2(Lxf3/c;Luf3/a;)Lt70/a;

    move-result-object p0

    return-object p0
.end method

.method private static final k1(Lxf3/c;Luf3/a;)Lh70/a;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lh70/a;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lf70/x;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lf70/x;

    const-class v0, Lf70/f0;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lf70/f0;

    const-class v0, Lf70/h0;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lf70/h0;

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v7}, Lh70/a;-><init>(Ltr2/n;Lf70/x;Lf70/f0;Lf70/h0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final k2(Lxf3/c;Luf3/a;)Lf70/t0;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/t0;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lwn0/b;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwn0/b;

    const-class v3, Lvn0/e;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lvn0/e;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lf70/t0;-><init>(Lwn0/b;Lvn0/e;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic l(Lxf3/c;Luf3/a;)Lf70/h0;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->i2(Lxf3/c;Luf3/a;)Lf70/h0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l0(Lxf3/c;Luf3/a;)Lf70/b1;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->X0(Lxf3/c;Luf3/a;)Lf70/b1;

    move-result-object p0

    return-object p0
.end method

.method private static final l1(Lxf3/c;Luf3/a;)Lf70/s0;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lf70/s0;

    const-class v0, Ln70/c;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln70/c;

    invoke-direct {p1, p0}, Lf70/s0;-><init>(Ln70/c;)V

    return-object p1
.end method

.method private static final l2(Lxf3/c;Luf3/a;)Lv70/e;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lv70/e;

    const-class v0, Lnm0/e;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lnm0/e;

    invoke-direct {p1, p0}, Lv70/e;-><init>(Lnm0/e;)V

    return-object p1
.end method

.method public static synthetic m(Lxf3/c;Luf3/a;)Ll80/t;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->P1(Lxf3/c;Luf3/a;)Ll80/t;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m0(Lxf3/c;Luf3/a;)Li80/e;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->u1(Lxf3/c;Luf3/a;)Li80/e;

    move-result-object p0

    return-object p0
.end method

.method private static final m1(Lxf3/c;Luf3/a;)Lf70/c0;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/c0;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    const-class v3, Lp70/b;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp70/b;

    const-class v4, Lh80/c;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lh80/c;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Lf70/c0;-><init>(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lp70/b;Lh80/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final m2(Lxf3/c;Luf3/a;)Lz70/a;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lz70/a;

    const/4 p1, 0x0

    const/4 v0, 0x3

    invoke-direct {p0, p1, p1, v0, p1}, Lz70/a;-><init>(Ljb1/a;Ljb1/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method

.method public static synthetic n(Lxf3/c;Luf3/a;)Lf70/b;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->f1(Lxf3/c;Luf3/a;)Lf70/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n0(Lxf3/c;Luf3/a;)Lf70/d0;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->j1(Lxf3/c;Luf3/a;)Lf70/d0;

    move-result-object p0

    return-object p0
.end method

.method private static final n1(Lxf3/c;Luf3/a;)Lf70/p0;
    .locals 9

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/p0;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    const-class v3, Lp70/b;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp70/b;

    const-class v4, Lf70/l;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf70/l;

    const-class v5, Lh80/c;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lh80/c;

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v8}, Lf70/p0;-><init>(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lp70/b;Lf70/l;Lh80/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final n2(Lxf3/c;Luf3/a;)Lk70/a;
    .locals 13

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lk70/a;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lf70/u;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf70/u;

    const-class v3, Liy1/c;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Liy1/c;

    const-class v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v5, Lf70/w0;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf70/w0;

    const-class v6, Lf70/d0;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v2, v6, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf70/d0;

    const-class v7, Lf70/p0;

    invoke-virtual {p1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {p0, v2, v7, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lf70/p0;

    const-class v8, Lf70/o;

    invoke-virtual {p1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-virtual {p0, v2, v8, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lf70/o;

    const-class v9, Lod1/j;

    invoke-virtual {p1, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v9, p0

    check-cast v9, Lod1/j;

    const/16 v11, 0x100

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v12}, Lk70/a;-><init>(Lf70/u;Liy1/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lf70/w0;Lf70/d0;Lf70/p0;Lf70/o;Lod1/j;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic o(Lxf3/c;Luf3/a;)Lf70/s0;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->l1(Lxf3/c;Luf3/a;)Lf70/s0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o0(Lxf3/c;Luf3/a;)Lb80/c;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->N1(Lxf3/c;Luf3/a;)Lb80/c;

    move-result-object p0

    return-object p0
.end method

.method private static final o1(Lxf3/c;Luf3/a;)Lf70/c;
    .locals 9

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/c;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    const-class v3, Lp70/b;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp70/b;

    const-class v4, Lh80/c;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lh80/c;

    const-class v5, Lrv1/a;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lrv1/a;

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v8}, Lf70/c;-><init>(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lp70/b;Lh80/c;Lrv1/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final o2(Lxf3/c;Luf3/a;)Lx70/c;
    .locals 9

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lx70/c;

    new-instance v0, Lal0/g;

    const/4 v2, 0x7

    invoke-direct {v0, p1, v2}, Lal0/g;-><init>(Luf3/a;I)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lj02/o0;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {p0, v0, v3, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    const-class v3, Leb/a0;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p1, v5}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    move-object v3, p1

    check-cast v3, Leb/a0;

    const-class p1, Lo02/d;

    invoke-virtual {v2, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v4, p1, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo02/d;

    const-class v5, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v2, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {p0, v4, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v4, p1

    move-object v2, v0

    invoke-direct/range {v1 .. v8}, Lx70/c;-><init>(Lj02/o0;Leb/a0;Lo02/d;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    new-instance p0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "No value found for type \'"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x27

    invoke-static {v2, v3, p1, v0}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic p(Lxf3/c;Luf3/a;)Lcom/whoop/activation/domain/AuthedUsernameValidationApi;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->U1(Lxf3/c;Luf3/a;)Lcom/whoop/activation/domain/AuthedUsernameValidationApi;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p0(Lxf3/c;Luf3/a;)Lf70/e0;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->i1(Lxf3/c;Luf3/a;)Lf70/e0;

    move-result-object p0

    return-object p0
.end method

.method private static final p1(Lxf3/c;Luf3/a;)Lf70/o0;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/o0;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    const-class v3, Lp70/b;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp70/b;

    const-class v4, Lh80/c;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lh80/c;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Lf70/o0;-><init>(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lp70/b;Lh80/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final p2(Luf3/a;)Luf3/a;
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

.method public static synthetic q(Lxf3/c;Luf3/a;)Lcom/whoop/activation/domain/UsersServiceValidationApi;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->T1(Lxf3/c;Luf3/a;)Lcom/whoop/activation/domain/UsersServiceValidationApi;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q0(Lxf3/c;Luf3/a;)Lf70/w;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->b2(Lxf3/c;Luf3/a;)Lf70/w;

    move-result-object p0

    return-object p0
.end method

.method private static final q1(Lxf3/c;Luf3/a;)Lf70/m;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/m;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    const-class v3, Lp70/b;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp70/b;

    const-class v4, Lh80/c;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lh80/c;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Lf70/m;-><init>(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lp70/b;Lh80/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final q2(Lxf3/c;Luf3/a;)Lx70/a;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lx70/a;

    const-class v0, Lt70/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lt70/a;

    invoke-direct {p1, p0}, Lx70/a;-><init>(Lt70/a;)V

    return-object p1
.end method

.method public static synthetic r(Lxf3/c;Luf3/a;)Lz70/a;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->m2(Lxf3/c;Luf3/a;)Lz70/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r0(Lxf3/c;Luf3/a;)Lf70/h;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->Z0(Lxf3/c;Luf3/a;)Lf70/h;

    move-result-object p0

    return-object p0
.end method

.method private static final r1(Lxf3/c;Luf3/a;)Lf70/p;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/p;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    const-class v3, Lh80/c;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lh80/c;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lf70/p;-><init>(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lh80/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final r2(Lxf3/c;Luf3/a;)Lt70/a;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lt70/a;

    const-class v0, Lfi0/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfi0/a;

    invoke-direct {p1, p0}, Lt70/a;-><init>(Lfi0/a;)V

    return-object p1
.end method

.method public static synthetic s(Lxf3/c;Luf3/a;)Lf70/l;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->Y1(Lxf3/c;Luf3/a;)Lf70/l;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s0(Lxf3/c;Luf3/a;)Lf70/y0;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->y2(Lxf3/c;Luf3/a;)Lf70/y0;

    move-result-object p0

    return-object p0
.end method

.method private static final s1(Lxf3/c;Luf3/a;)Lf70/o;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/o;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    const-class v3, Lf70/l;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf70/l;

    const-class v4, Lh80/c;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lh80/c;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Lf70/o;-><init>(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lf70/l;Lh80/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final s2(Lxf3/c;Luf3/a;)Lv70/g;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lv70/g;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lf70/u;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lf70/u;

    const-class v3, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-direct {p1, v1, p0}, Lv70/g;-><init>(Lf70/u;Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-object p1
.end method

.method public static synthetic t(Lxf3/c;Luf3/a;)Li80/d;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->F1(Lxf3/c;Luf3/a;)Li80/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t0(Lxf3/c;Luf3/a;)Ll70/a;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->R0(Lxf3/c;Luf3/a;)Ll70/a;

    move-result-object p0

    return-object p0
.end method

.method private static final t1(Lxf3/c;Luf3/a;)Lf70/n;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/n;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    const-class v3, Lh80/c;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lh80/c;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lf70/n;-><init>(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lh80/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final t2(Lxf3/c;Luf3/a;)Ly70/b;
    .locals 8

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ly70/b;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lv70/e;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv70/e;

    const-class v3, Lz70/a;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz70/a;

    const-class v4, Lv70/g;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lv70/g;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Ly70/b;-><init>(Lv70/e;Lz70/a;Lv70/g;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic u(Lxf3/c;Luf3/a;)Lf70/i0;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->h2(Lxf3/c;Luf3/a;)Lf70/i0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u0(Lxf3/c;Luf3/a;)Li80/c;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->H1(Lxf3/c;Luf3/a;)Li80/c;

    move-result-object p0

    return-object p0
.end method

.method private static final u1(Lxf3/c;Luf3/a;)Li80/e;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Li80/e;

    invoke-direct {p0}, Li80/e;-><init>()V

    return-object p0
.end method

.method private static final u2(Lxf3/c;Luf3/a;)Lcom/whoop/activation/dayzero/domain/network/DayZeroSplashApi;
    .locals 11

    const-string v0, "$this$factory"

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

    const/16 v9, 0x1f

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v10}, Lcom/whoop/design/json/b;->e(Lxf3/c;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Liy1/c;Lrr2/c;ILjava/lang/Object;)Lad3/c;

    move-result-object p0

    const-string v1, "defaultOkHttpClient"

    invoke-static {p0, p1, v1}, Lm4/a;->q(Lad3/c;Lpg3/x0;Ljava/lang/String;)Lvf3/c;

    move-result-object p0

    const-class v1, Lud3/l0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {v3, v2, v0, p0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lud3/l0;

    const-class v0, Lcom/whoop/activation/dayzero/domain/network/DayZeroSplashApi;

    const-string v1, "create(...)"

    invoke-static {p1, p0, v0, v1}, Lb9/y;->f(Lpg3/x0;Lud3/l0;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/activation/dayzero/domain/network/DayZeroSplashApi;

    return-object p0
.end method

.method public static synthetic v(Lxf3/c;Luf3/a;)Lo70/a;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->D1(Lxf3/c;Luf3/a;)Lo70/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v0(Lxf3/c;Luf3/a;)Lj70/c;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->Q0(Lxf3/c;Luf3/a;)Lj70/c;

    move-result-object p0

    return-object p0
.end method

.method private static final v1(Lxf3/c;Luf3/a;)Li70/a;
    .locals 25

    move-object/from16 v0, p0

    const-string v1, "$this$factory"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Li70/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lf70/w;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v3, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf70/w;

    const-class v5, Lf70/y;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v0, v4, v5, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lf70/y;

    const-class v6, Lf70/z;

    invoke-virtual {v1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {v0, v4, v6, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf70/z;

    new-instance v7, Lvf3/c;

    const-string v8, "account-creation-screens-helper-with-analytics"

    invoke-direct {v7, v8}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v8, Lf70/b;

    invoke-virtual {v1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-virtual {v0, v4, v8, v7}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lf70/b;

    const-class v8, Lf70/a;

    invoke-virtual {v1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-virtual {v0, v4, v8, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lf70/a;

    const-class v9, Lf70/v0;

    invoke-virtual {v1, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-virtual {v0, v4, v9, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lf70/v0;

    const-class v10, Lf70/e0;

    invoke-virtual {v1, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-virtual {v0, v4, v10, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lf70/e0;

    const-class v11, Lf70/d0;

    invoke-virtual {v1, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-virtual {v0, v4, v11, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lf70/d0;

    const-class v12, Lf70/c0;

    invoke-virtual {v1, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-virtual {v0, v4, v12, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lf70/c0;

    const-class v13, Lf70/p0;

    invoke-virtual {v1, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v13

    invoke-virtual {v0, v4, v13, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lf70/p0;

    const-class v14, Lf70/o0;

    invoke-virtual {v1, v14}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v14

    invoke-virtual {v0, v4, v14, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lf70/o0;

    const-class v15, Lf70/m;

    invoke-virtual {v1, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v15

    invoke-virtual {v0, v4, v15, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lf70/m;

    move-object/from16 p1, v2

    const-class v2, Lf70/p;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf70/p;

    move-object/from16 v16, v2

    const-class v2, Lf70/o;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf70/o;

    move-object/from16 v17, v2

    const-class v2, Lf70/n;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf70/n;

    move-object/from16 v18, v2

    const-class v2, Lf70/c;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf70/c;

    move-object/from16 v19, v2

    const-class v2, Lf70/d1;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf70/d1;

    move-object/from16 v20, v2

    const-class v2, Lf70/k0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lf70/k0;

    move-object/from16 v21, v2

    const-class v2, Lp70/b;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp70/b;

    move-object/from16 v22, v2

    const-class v2, Lod1/j;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lod1/j;

    move-object/from16 v23, v2

    const-class v2, Lj70/c;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lj70/c;

    move-object/from16 v24, v2

    const-class v2, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v4, v1, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-object/from16 v2, p1

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v13

    move-object v13, v14

    move-object v14, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v20, v21

    move-object/from16 v21, v22

    move-object/from16 v22, v23

    move-object/from16 v23, v24

    move-object/from16 v24, v0

    invoke-direct/range {v2 .. v24}, Li70/a;-><init>(Lf70/w;Lf70/y;Lf70/z;Lf70/b;Lf70/a;Lf70/v0;Lf70/e0;Lf70/d0;Lf70/c0;Lf70/p0;Lf70/o0;Lf70/m;Lf70/p;Lf70/o;Lf70/n;Lf70/c;Lf70/d1;Lf70/k0;Lp70/b;Lod1/j;Lj70/c;Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-object v2
.end method

.method private static final v2(Lxf3/c;Luf3/a;)Ly60/c;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ly60/c;

    const-class v0, Lcom/whoop/activation/dayzero/domain/network/DayZeroSplashApi;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/activation/dayzero/domain/network/DayZeroSplashApi;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Ly60/c;-><init>(Lcom/whoop/activation/dayzero/domain/network/DayZeroSplashApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public static synthetic w(Lxf3/c;Luf3/a;)Lf80/e;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->V0(Lxf3/c;Luf3/a;)Lf80/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w0(Lxf3/c;Luf3/a;)Le70/b;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->I1(Lxf3/c;Luf3/a;)Le70/b;

    move-result-object p0

    return-object p0
.end method

.method private static final w1(Lxf3/c;Luf3/a;)Lf70/z0;
    .locals 9

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/z0;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/activation/domain/ActivationApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/activation/domain/ActivationApi;

    const-class v3, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    const-class v4, Lod1/j;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lod1/j;

    const-class v5, Lp70/b;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp70/b;

    const-class v6, Lcom/whoop/data/datastore/EmailDataStoreHelper;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v2, v6, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/data/datastore/EmailDataStoreHelper;

    const-class v7, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {p0, v2, v7, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v8, Ltr2/n;

    invoke-virtual {p1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v8, p0

    check-cast v8, Ltr2/n;

    move-object v2, v0

    invoke-direct/range {v1 .. v8}, Lf70/z0;-><init>(Lcom/whoop/activation/domain/ActivationApi;Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lod1/j;Lp70/b;Lcom/whoop/data/datastore/EmailDataStoreHelper;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V

    return-object v1
.end method

.method private static final w2(Lxf3/c;Luf3/a;)La70/c;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, La70/c;

    const/4 p1, 0x0

    const/4 v0, 0x3

    invoke-direct {p0, p1, p1, v0, p1}, La70/c;-><init>(Ljb1/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method

.method public static synthetic x(Lxf3/c;Luf3/a;)Lk70/a;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->n2(Lxf3/c;Luf3/a;)Lk70/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x0(Lxf3/c;Luf3/a;)Lf70/d1;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->y1(Lxf3/c;Luf3/a;)Lf70/d1;

    move-result-object p0

    return-object p0
.end method

.method private static final x1(Lxf3/c;Luf3/a;)Lf70/w0;
    .locals 14

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lf70/w0;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/activation/domain/ActivationAuthenticatedApi;

    const-class v3, Lp70/b;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp70/b;

    const-class v4, Lf70/l;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lf70/l;

    const-class v5, Lzr2/a;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lzr2/a;

    const-class v6, Lf70/s0;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v2, v6, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lf70/s0;

    const-class v7, Lh80/c;

    invoke-virtual {p1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {p0, v2, v7, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lh80/c;

    const-class v8, Lf70/c1;

    invoke-virtual {p1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-virtual {p0, v2, v8, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lf70/c1;

    const-class v9, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-virtual {p0, v2, v9, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v10, Lod1/j;

    invoke-virtual {p1, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v10, p0

    check-cast v10, Lod1/j;

    const/16 v12, 0x200

    const/4 v13, 0x0

    const/4 v11, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v13}, Lf70/w0;-><init>(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lp70/b;Lf70/l;Lzr2/a;Lf70/s0;Lh80/c;Lf70/c1;Lcom/whoop/data/repositories/FeatureFlagChecker;Lod1/j;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final x2(Lxf3/c;Luf3/a;)La70/b;
    .locals 8

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, La70/b;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Ly60/c;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ly60/c;

    const-class v0, La70/c;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, La70/c;

    const-class v0, Lfi0/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lfi0/a;

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v7}, La70/b;-><init>(Lbc3/c0;Ly60/c;La70/c;Lfi0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic y(Lxf3/c;Luf3/a;)Ly60/c;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->v2(Lxf3/c;Luf3/a;)Ly60/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y0(Lxf3/c;Luf3/a;)Lf70/a1;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->W0(Lxf3/c;Luf3/a;)Lf70/a1;

    move-result-object p0

    return-object p0
.end method

.method private static final y1(Lxf3/c;Luf3/a;)Lf70/d1;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lf70/d1;

    const-class v0, Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lf70/d1;-><init>(Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final y2(Lxf3/c;Luf3/a;)Lf70/y0;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lf70/y0;

    invoke-direct {p0}, Lf70/y0;-><init>()V

    return-object p0
.end method

.method public static synthetic z(Lxf3/c;Luf3/a;)Lf70/t0;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->k2(Lxf3/c;Luf3/a;)Lf70/t0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z0(Lxf3/c;Luf3/a;)Li70/a;
    .locals 0

    invoke-static {p0, p1}, Lc70/d;->v1(Lxf3/c;Luf3/a;)Li70/a;

    move-result-object p0

    return-object p0
.end method

.method private static final z1(Lxf3/c;Luf3/a;)Lf70/c1;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lf70/c1;

    const/4 p1, 0x0

    const/4 v0, 0x3

    invoke-direct {p0, p1, p1, v0, p1}, Lf70/c1;-><init>(Lad3/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Lc70/d;->M0(Ltf3/a;)Ll83/a0;

    return-object v0
.end method

.method public getDependencies()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lv82/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lc70/d;->a:Ljava/util/List;

    return-object v0
.end method

.method public bridge getKey()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lnd1/j;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
