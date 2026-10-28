.class public final Lki0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnd1/j;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lki0/a;",
        "Lnd1/j;",
        "<init>",
        "()V",
        "Ltf3/a;",
        "define",
        "()Ltf3/a;",
        "app-configuration_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lxf3/c;Luf3/a;)Lj02/r;
    .locals 0

    invoke-static {p0, p1}, Lki0/a;->g(Lxf3/c;Luf3/a;)Lj02/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lxf3/c;Luf3/a;)Lji0/e;
    .locals 0

    invoke-static {p0, p1}, Lki0/a;->f(Lxf3/c;Luf3/a;)Lji0/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Luf3/a;
    .locals 1

    invoke-static {}, Lki0/a;->i()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lxf3/c;Luf3/a;)Lcom/whoop/appconfiguration/AppConfigurationApi;
    .locals 0

    invoke-static {p0, p1}, Lki0/a;->h(Lxf3/c;Luf3/a;)Lcom/whoop/appconfiguration/AppConfigurationApi;

    move-result-object p0

    return-object p0
.end method

.method private static final e(Ltf3/a;)Ll83/a0;
    .locals 13

    const-string v0, "$this$module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lkf1/a;

    const/16 v0, 0xe

    invoke-direct {v5, v0}, Lkf1/a;-><init>(I)V

    new-instance v1, Lqf3/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lji0/e;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    sget-object v7, Lwf3/a;->e:Lvf3/c;

    const/4 v4, 0x0

    const/4 v6, 0x1

    move-object v2, v7

    invoke-direct/range {v1 .. v6}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v3, v4, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, p0, v2, v3}, Lm4/a;->p(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)Lrf3/d;

    move-result-object v1

    const-class v2, Lcom/whoop/data/remote/AppConfigurationRepository;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const-class v4, Lji0/f;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    const/4 v5, 0x2

    new-array v5, v5, [Lj93/d;

    aput-object v2, v5, v3

    const/4 v2, 0x1

    aput-object v4, v5, v2

    iget-object v4, v1, Lrf3/b;->a:Lqf3/b;

    iget-object v8, v4, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v8, Ljava/util/Collection;

    invoke-static {v8, v5}, Lm83/s;->h1(Ljava/util/Collection;[Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v8

    iput-object v8, v4, Lqf3/b;->f:Ljava/lang/Object;

    array-length v8, v5

    move v9, v3

    :goto_0
    if-ge v9, v8, :cond_0

    aget-object v10, v5, v9

    iget-object v11, v4, Lqf3/b;->c:Lvf3/a;

    iget-object v12, v4, Lqf3/b;->a:Lvf3/a;

    invoke-static {v10, v11, v12}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p0, v10, v1, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_0
    new-instance v10, Lkf1/a;

    const/16 v1, 0xf

    invoke-direct {v10, v1}, Lkf1/a;-><init>(I)V

    move v11, v6

    new-instance v6, Lqf3/b;

    const-class v1, Lj02/r;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/d;

    invoke-direct {v2, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v2, v3}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lkf1/a;

    const/16 v1, 0x10

    invoke-direct {v10, v1}, Lkf1/a;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v1, Lcom/whoop/appconfiguration/AppConfigurationApi;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v11, 0x2

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, p0, v0, v3}, Lm4/a;->z(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lxf3/c;Luf3/a;)Lji0/e;
    .locals 12

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lji0/e;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lji0/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lji0/a;

    invoke-static {}, Lki0/b;->b()Lad3/c;

    move-result-object v3

    const-class v4, Liy1/c;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Liy1/c;

    const-class v5, Lcom/whoop/appconfiguration/AppConfigurationApi;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/appconfiguration/AppConfigurationApi;

    const-class v6, Lcom/whoop/data/repositories/ActiveSessionChecker;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lcom/whoop/data/repositories/ActiveSessionChecker;

    const/16 v10, 0xe0

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v11}, Lji0/e;-><init>(Lji0/a;Lad3/c;Liy1/c;Lcom/whoop/appconfiguration/AppConfigurationApi;Lcom/whoop/data/repositories/ActiveSessionChecker;Ljava/time/Clock;Lze1/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final g(Lxf3/c;Luf3/a;)Lj02/r;
    .locals 5

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lji0/g;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lji0/f;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lji0/f;

    const-class v3, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-class v4, Lbc3/c0;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbc3/c0;

    invoke-direct {p1, v1, v3, p0}, Lji0/g;-><init>(Lji0/f;Lcom/whoop/data/repositories/FeatureFlagChecker;Lbc3/c0;)V

    return-object p1
.end method

.method private static final h(Lxf3/c;Luf3/a;)Lcom/whoop/appconfiguration/AppConfigurationApi;
    .locals 3

    const-string v0, "it"

    const-string v1, "retrofitWithKtxSerialization"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    new-instance v0, Lkg2/d;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lkg2/d;-><init>(I)V

    const-class v1, Lpg3/y0;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    const-class p1, Lcom/whoop/appconfiguration/AppConfigurationApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/appconfiguration/AppConfigurationApi;

    return-object p0
.end method

.method private static final i()Luf3/a;
    .locals 1

    invoke-static {}, Lki0/b;->b()Lad3/c;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Lki0/a;->e(Ltf3/a;)Ll83/a0;

    return-object v0
.end method

.method public bridge getDependencies()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lnd1/j;",
            ">;"
        }
    .end annotation

    invoke-super {p0}, Lnd1/j;->getDependencies()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge getKey()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lnd1/j;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
