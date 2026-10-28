.class public final Lnd1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnd1/j;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R \u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lnd1/i;",
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
        "core_release"
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
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lnd1/m;

    invoke-direct {v0}, Lnd1/m;-><init>()V

    new-instance v1, Lrm0/c;

    invoke-direct {v1}, Lrm0/c;-><init>()V

    new-instance v2, Lv82/a;

    invoke-direct {v2}, Lv82/a;-><init>()V

    const/4 v3, 0x3

    new-array v3, v3, [Lnd1/j;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    aput-object v2, v3, v0

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lnd1/i;->a:Ljava/util/List;

    return-void
.end method

.method public static synthetic A(Lxf3/c;Luf3/a;)Lud3/l0;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->M0(Lxf3/c;Luf3/a;)Lud3/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic A0(Lxf3/c;Luf3/a;)Lcom/whoop/domain/bootstrap/BootstrapApi;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->y1(Lxf3/c;Luf3/a;)Lcom/whoop/domain/bootstrap/BootstrapApi;

    move-result-object p0

    return-object p0
.end method

.method private static final A1(Lxf3/c;Luf3/a;)Lod1/a0;
    .locals 16

    move-object/from16 v0, p0

    const-string v1, "$this$single"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lqd1/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lod1/p;

    invoke-virtual {v1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v3, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lod1/p;

    const-class v5, Lbc3/c0;

    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v0, v4, v5, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lbc3/c0;

    const-class v6, Lod1/j;

    invoke-virtual {v1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {v0, v4, v6, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lod1/j;

    const-class v7, Lcom/whoop/data/remote/NewWhoopLoginInterceptor;

    invoke-virtual {v1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {v0, v4, v7, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/data/remote/NewWhoopLoginInterceptor;

    const-class v8, Ly92/a;

    invoke-virtual {v1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-virtual {v0, v4, v8, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly92/a;

    const-class v9, Lcom/whoop/data/remote/AppConfigurationRepository;

    invoke-virtual {v1, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-virtual {v0, v4, v9, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/data/remote/AppConfigurationRepository;

    const-class v10, Lwe1/g;

    invoke-virtual {v1, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-virtual {v0, v4, v10, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lwe1/g;

    const-class v11, Lpd1/a;

    invoke-virtual {v1, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-virtual {v0, v4, v11, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lpd1/a;

    const-class v12, Liy1/c;

    invoke-virtual {v1, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    invoke-virtual {v0, v4, v12, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Liy1/c;

    const-class v13, Ldj0/b;

    invoke-virtual {v1, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v4, v1, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldj0/b;

    const/16 v14, 0x400

    const/4 v15, 0x0

    const/4 v13, 0x0

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move-object v12, v0

    invoke-direct/range {v2 .. v15}, Lqd1/a;-><init>(Lod1/p;Lbc3/c0;Lod1/j;Lcom/whoop/data/remote/NewWhoopLoginInterceptor;Ly92/a;Lcom/whoop/data/remote/AppConfigurationRepository;Lwe1/g;Lpd1/a;Liy1/c;Ldj0/b;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method public static synthetic B(Lxf3/c;Luf3/a;)Lfn2/d;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->M1(Lxf3/c;Luf3/a;)Lfn2/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B0(Lxf3/c;Luf3/a;)Lj92/i;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->G1(Lxf3/c;Luf3/a;)Lj92/i;

    move-result-object p0

    return-object p0
.end method

.method private static final B1(Lxf3/c;Luf3/a;)Lod1/j;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lod1/j;

    invoke-direct {p0}, Lod1/j;-><init>()V

    return-object p0
.end method

.method public static synthetic C(Lxf3/c;Luf3/a;)Ls03/b;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->g2(Lxf3/c;Luf3/a;)Ls03/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C0(Lxf3/c;)Z
    .locals 0

    invoke-static {p0}, Lnd1/i;->V1(Lxf3/c;)Z

    move-result p0

    return p0
.end method

.method private static final C1(Lxf3/c;Luf3/a;)Lca2/g;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lca2/g;

    invoke-static {p0}, Lpf/c;->i(Lxf3/c;)Landroid/content/Context;

    move-result-object p1

    const-string v0, "prefs-raw-data"

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    const-string p1, "getSharedPreferences(...)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lzr2/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v0, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr2/a;

    const-class v4, Lfi0/a;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v3, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lfi0/a;

    const-class v5, Ljs0/c;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v3, p1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Ljs0/c;

    sget-object p0, Ltr2/n;->a:Ltr2/n$a;

    const-string p1, "RawDataPacketsSaveAnalytics"

    invoke-virtual {p0, p1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v6

    move-object v3, v0

    invoke-direct/range {v1 .. v6}, Lca2/g;-><init>(Landroid/content/SharedPreferences;Lzr2/a;Lfi0/a;Ljs0/c;Ltr2/n;)V

    return-object v1
.end method

.method public static synthetic D(Lxf3/c;Luf3/a;)Lz92/b;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->a2(Lxf3/c;Luf3/a;)Lz92/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D0(Lxf3/c;Luf3/a;)Lj92/v;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->N0(Lxf3/c;Luf3/a;)Lj92/v;

    move-result-object p0

    return-object p0
.end method

.method private static final D1(Lxf3/c;Luf3/a;)Lcom/whoop/data/remote/NewWhoopLoginInterceptor;
    .locals 12

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/data/remote/NewWhoopLoginInterceptor;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lrr2/c;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrr2/c;

    const-class v3, Lod1/j;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lod1/j;

    const-class v4, Ljs0/c;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljs0/c;

    const-class v5, Lcom/whoop/data/repositories/FeatureFlagRepository;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/data/repositories/FeatureFlagRepository;

    const-class v6, Lwe1/g;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v2, v6, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lwe1/g;

    const-class v7, Lcom/whoop/data/remote/AppConfigurationRepository;

    invoke-virtual {p1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {p0, v2, v7, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/data/remote/AppConfigurationRepository;

    const-class v8, Ly92/a;

    invoke-virtual {p1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v8, p0

    check-cast v8, Ly92/a;

    const/16 v10, 0x80

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v11}, Lcom/whoop/data/remote/NewWhoopLoginInterceptor;-><init>(Lrr2/c;Lod1/j;Ljs0/c;Lcom/whoop/data/repositories/FeatureFlagRepository;Lwe1/g;Lcom/whoop/data/remote/AppConfigurationRepository;Ly92/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic E(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/HomeComponentDismissApi;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->c1(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/HomeComponentDismissApi;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E0(Lxf3/c;Luf3/a;)Lfn2/n;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->P1(Lxf3/c;Luf3/a;)Lfn2/n;

    move-result-object p0

    return-object p0
.end method

.method private static final E1(Lxf3/c;Luf3/a;)Lor2/k1;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lor2/k1;

    invoke-direct {p0}, Lor2/k1;-><init>()V

    return-object p0
.end method

.method public static synthetic F(Lxf3/c;Luf3/a;)Lrg3/a;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->n1(Lxf3/c;Luf3/a;)Lrg3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F0(Lxf3/c;Luf3/a;)Lmc3/a;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->Q0(Lxf3/c;Luf3/a;)Lmc3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final F1(Lxf3/c;Luf3/a;)Lod1/b;
    .locals 6

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lod1/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Ltm0/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltm0/b;

    const-class v3, Ltr2/n;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ltr2/n;

    const-class v4, Lod1/a0;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lod1/a0;

    const-class v5, Lbc3/c0;

    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbc3/c0;

    invoke-direct {p1, v1, v3, v4, p0}, Lod1/b;-><init>(Ltm0/b;Ltr2/n;Lod1/a0;Lbc3/c0;)V

    return-object p1
.end method

.method public static synthetic G(Lxf3/c;Luf3/a;)Lj92/r;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->S0(Lxf3/c;Luf3/a;)Lj92/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G0(Lxf3/c;Luf3/a;)Landroid/content/SharedPreferences;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->q1(Lxf3/c;Luf3/a;)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method private static final G1(Lxf3/c;Luf3/a;)Lj92/i;
    .locals 9

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lj92/i;

    new-instance p1, Lvf3/c;

    const-string v0, "userContext"

    invoke-direct {p1, v0}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lod1/u;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lod1/u;

    const-class p1, Lod1/j;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v3, p1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lod1/j;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v4, Lnd1/i$k;

    invoke-direct {v4, p0, v3, v3}, Lnd1/i$k;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lnd1/i$l;

    invoke-direct {v5, p0, v3, v3}, Lnd1/i$l;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v3, p1

    invoke-direct/range {v1 .. v8}, Lj92/i;-><init>(Lod1/u;Lod1/j;Ll83/h;Ll83/h;Lj92/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic H(Lxf3/c;Luf3/a;)Lu92/c;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->e1(Lxf3/c;Luf3/a;)Lu92/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/FeatureFlagRepository;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->s1(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/FeatureFlagRepository;

    move-result-object p0

    return-object p0
.end method

.method private static final H1(Lxf3/c;Luf3/a;)Lor2/x1;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lor2/y1;

    invoke-direct {p0}, Lor2/y1;-><init>()V

    return-object p0
.end method

.method public static synthetic I(Lxf3/c;)Z
    .locals 0

    invoke-static {p0}, Lnd1/i;->r2(Lxf3/c;)Z

    move-result p0

    return p0
.end method

.method public static synthetic I0(Lxf3/c;Luf3/a;)Lfi0/e;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->r1(Lxf3/c;Luf3/a;)Lfi0/e;

    move-result-object p0

    return-object p0
.end method

.method private static final I1(Lxf3/c;Luf3/a;)Lus0/f;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lus0/f;

    const-class v0, Lfi0/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfi0/a;

    invoke-static {}, Ljava/time/Clock;->systemDefaultZone()Ljava/time/Clock;

    move-result-object v0

    const-string v1, "systemDefaultZone(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p0, v0}, Lus0/f;-><init>(Lfi0/a;Ljava/time/Clock;)V

    return-object p1
.end method

.method public static synthetic J(Lxf3/c;Luf3/a;)Ljk0/e;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->T1(Lxf3/c;Luf3/a;)Ljk0/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J0(Lxf3/c;Luf3/a;)Lpr2/a;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->l2(Lxf3/c;Luf3/a;)Lpr2/a;

    move-result-object p0

    return-object p0
.end method

.method private static final J1(Lxf3/c;Luf3/a;)Lca2/e;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lca2/e;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Liy1/c;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Liy1/c;

    const-class v3, Lbc3/c0;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbc3/c0;

    const-class v4, Lca2/h;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lca2/h;

    invoke-direct {p1, v1, v3, p0}, Lca2/e;-><init>(Liy1/c;Lbc3/c0;Lca2/h;)V

    return-object p1
.end method

.method public static synthetic K(Lxf3/c;Luf3/a;)Lod1/a0;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->A1(Lxf3/c;Luf3/a;)Lod1/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final K0(Ltf3/a;)Ll83/a0;
    .locals 27

    move-object/from16 v0, p0

    const-string v1, "$this$module"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "defaultOkHttpClient"

    invoke-static {v1}, Lvf3/b;->f(Ljava/lang/String;)Lvf3/c;

    move-result-object v5

    new-instance v6, Lnd1/d;

    const/16 v1, 0x8

    invoke-direct {v6, v1}, Lnd1/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v3

    new-instance v2, Lqf3/b;

    const-class v8, Lud3/l0;

    invoke-static {v8}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    const/4 v14, 0x1

    move v7, v14

    invoke-direct/range {v2 .. v7}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v2}, Lqf3/b;->a()Lj93/d;

    move-result-object v3

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v4

    invoke-static {v3, v5, v4}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "unauthenticatedOkHttpClient"

    invoke-static {v2, v0, v3, v4}, Lr80/c;->x(Lqf3/b;Ltf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object v12

    new-instance v13, Lnd1/d;

    const/16 v2, 0xa

    invoke-direct {v13, v2}, Lnd1/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    invoke-static {v8}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v3

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v4

    invoke-static {v3, v12, v4}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "cacheEnabledOktthpClient"

    invoke-static {v9, v0, v3, v4}, Lr80/c;->x(Lqf3/b;Ltf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object v12

    new-instance v13, Lnd1/d;

    const/16 v3, 0x16

    invoke-direct {v13, v3}, Lnd1/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    invoke-static {v8}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v4

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v5

    invoke-static {v4, v12, v5}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "cacheEnabledRetrofit"

    invoke-static {v9, v0, v4, v5}, Lr80/c;->x(Lqf3/b;Ltf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object v12

    new-instance v13, Lnd1/f;

    const/4 v4, 0x4

    invoke-direct {v13, v4}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    const-class v4, Lpg3/y0;

    invoke-static {v4}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v5

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v6

    invoke-static {v5, v12, v6}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "httpLoggingInterceptor"

    invoke-static {v9, v0, v5, v6}, Lr80/c;->x(Lqf3/b;Ltf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object v12

    new-instance v13, Lnd1/f;

    const/16 v5, 0x10

    invoke-direct {v13, v5}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    const-class v6, Lme3/c;

    invoke-static {v6}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v6

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v7

    invoke-static {v6, v12, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lrf3/d;

    invoke-direct {v7, v9}, Lrf3/d;-><init>(Lqf3/b;)V

    invoke-static {v0, v6, v7}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v6, Lnd1/f;

    const/16 v7, 0x1c

    invoke-direct {v6, v7}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v16

    new-instance v15, Lqf3/b;

    const-class v8, Lj92/i;

    invoke-static {v8}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v17

    const/16 v18, 0x0

    const/4 v13, 0x2

    move-object/from16 v19, v6

    move/from16 v20, v13

    invoke-direct/range {v15 .. v20}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move-object/from16 v6, v16

    move-object/from16 v8, v18

    invoke-virtual {v15}, Lqf3/b;->a()Lj93/d;

    move-result-object v9

    invoke-static {v9, v8, v6}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v6

    new-instance v8, Lrf3/a;

    invoke-direct {v8, v15}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v6, v8}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/g;

    invoke-direct {v12, v2}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v6, Lj92/h;

    invoke-static {v6}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v6

    invoke-static {v6, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v6

    new-instance v9, Lrf3/a;

    invoke-direct {v9, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v6, v9}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/g;

    invoke-direct {v12, v3}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v6, Lj92/b;

    invoke-static {v6}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v6

    invoke-static {v6, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v6

    new-instance v9, Lrf3/a;

    invoke-direct {v9, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v6, v9}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/g;

    invoke-direct {v12, v7}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v6, Lj92/g;

    invoke-static {v6}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v6

    invoke-static {v6, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v6

    new-instance v9, Lrf3/a;

    invoke-direct {v9, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v6, v9}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/g;

    const/16 v6, 0x1d

    invoke-direct {v12, v6}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v10, Lj92/q;

    invoke-static {v10}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/d;

    const/16 v15, 0x13

    invoke-direct {v12, v15}, Lnd1/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v10, Lj92/v;

    invoke-static {v10}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/f;

    const/4 v8, 0x0

    invoke-direct {v12, v8}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    move v10, v8

    new-instance v8, Lqf3/b;

    const-class v11, Lj92/l;

    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    move/from16 v16, v10

    move-object v10, v11

    const/4 v11, 0x0

    move/from16 v15, v16

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/f;

    const/16 v8, 0xb

    invoke-direct {v12, v8}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    move v10, v8

    new-instance v8, Lqf3/b;

    const-class v11, Lj92/k;

    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    move/from16 v16, v10

    move-object v10, v11

    const/4 v11, 0x0

    move/from16 v2, v16

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    const-string v8, "onboardingRefreshMutex"

    invoke-static {v8}, Lvf3/b;->f(Ljava/lang/String;)Lvf3/c;

    move-result-object v12

    new-instance v13, Lnd1/f;

    invoke-direct {v13, v3}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    const-class v3, Lmc3/a;

    invoke-static {v3}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v3

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    invoke-static {v3, v12, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v8, Lrf3/d;

    invoke-direct {v8, v9}, Lrf3/d;-><init>(Lqf3/b;)V

    invoke-static {v0, v3, v8}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/g;

    const/4 v3, 0x3

    invoke-direct {v12, v3}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v3, Ll92/a;

    invoke-static {v3}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v11, 0x0

    move/from16 v13, v20

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v3

    invoke-static {v3, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v9, Lrf3/a;

    invoke-direct {v9, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v3, v9}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/g;

    const/16 v3, 0xe

    invoke-direct {v12, v3}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v10, Lj92/r;

    invoke-static {v10}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v13, Lnd1/g;

    const/16 v8, 0x19

    invoke-direct {v13, v8}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    const-class v11, Lj92/p;

    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v11

    invoke-static {v10, v12, v11}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v10

    new-instance v11, Lrf3/d;

    invoke-direct {v11, v9}, Lrf3/d;-><init>(Lqf3/b;)V

    invoke-static {v0, v10, v11}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/h;

    invoke-direct {v12, v15}, Lnd1/h;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    move v10, v8

    new-instance v8, Lqf3/b;

    const-class v11, Lio/sentry/okhttp/d;

    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    move v13, v10

    move-object v10, v11

    const/4 v11, 0x0

    move v15, v13

    move/from16 v13, v20

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v13, Lnd1/h;

    const/4 v8, 0x1

    invoke-direct {v13, v8}, Lnd1/h;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    const-class v11, Lj92/n;

    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v11

    invoke-static {v10, v12, v11}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v10

    new-instance v11, Lrf3/d;

    invoke-direct {v11, v9}, Lrf3/d;-><init>(Lqf3/b;)V

    invoke-static {v0, v10, v11}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v13, Lnd1/d;

    const/16 v9, 0x9

    invoke-direct {v13, v9}, Lnd1/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    move v11, v9

    new-instance v9, Lqf3/b;

    const-class v12, Lj92/m;

    invoke-static {v12}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v12

    move/from16 v19, v11

    move-object v11, v12

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v11

    invoke-static {v10, v12, v11}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v10

    new-instance v11, Lrf3/d;

    invoke-direct {v11, v9}, Lrf3/d;-><init>(Lqf3/b;)V

    invoke-static {v0, v10, v11}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/d;

    invoke-direct {v12, v2}, Lnd1/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    move v10, v8

    new-instance v8, Lqf3/b;

    const-class v11, Lj92/d;

    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    move v13, v10

    move-object v10, v11

    const/4 v11, 0x0

    move v2, v13

    move/from16 v13, v20

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/d;

    const/16 v8, 0xc

    invoke-direct {v12, v8}, Lnd1/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    move v10, v8

    new-instance v8, Lqf3/b;

    const-class v11, Lcom/whoop/service/network/ActivitiesApi;

    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    move/from16 v20, v10

    move-object v10, v11

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/d;

    const/16 v8, 0xd

    invoke-direct {v12, v8}, Lnd1/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    move v10, v8

    new-instance v8, Lqf3/b;

    const-class v11, Lcom/whoop/service/network/GpsServiceApi;

    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    move/from16 v20, v10

    move-object v10, v11

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/d;

    invoke-direct {v12, v3}, Lnd1/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v10, Lcom/whoop/service/network/HomeComponentDismissApi;

    invoke-static {v10}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/d;

    const/16 v8, 0xf

    invoke-direct {v12, v8}, Lnd1/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    move v10, v8

    new-instance v8, Lqf3/b;

    const-class v11, Lu92/c;

    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    move/from16 v20, v10

    move-object v10, v11

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move/from16 v20, v13

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    const-string v8, "baseRetrofit"

    invoke-static {v8}, Lvf3/b;->f(Ljava/lang/String;)Lvf3/c;

    move-result-object v12

    new-instance v13, Lnd1/d;

    invoke-direct {v13, v5}, Lnd1/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    invoke-static {v4}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v8

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    invoke-static {v8, v12, v10}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v8

    const-string v10, "legacyDefaultRetrofit"

    invoke-static {v9, v0, v8, v10}, Lr80/c;->x(Lqf3/b;Ltf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object v12

    new-instance v13, Lnd1/d;

    const/16 v8, 0x11

    invoke-direct {v13, v8}, Lnd1/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    invoke-static {v4}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v11

    invoke-static {v10, v12, v11}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "defaultRetrofit"

    invoke-static {v9, v0, v10, v11}, Lr80/c;->x(Lqf3/b;Ltf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object v12

    new-instance v13, Lnd1/d;

    const/16 v9, 0x12

    invoke-direct {v13, v9}, Lnd1/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    move v11, v9

    new-instance v9, Lqf3/b;

    move/from16 v23, v11

    invoke-static {v4}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    move/from16 v5, v23

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v11

    invoke-static {v10, v12, v11}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "retrofitWithKtxSerialization"

    invoke-static {v9, v0, v10, v11}, Lr80/c;->x(Lqf3/b;Ltf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object v11

    new-instance v12, Lnd1/d;

    const/16 v9, 0x14

    invoke-direct {v12, v9}, Lnd1/d;-><init>(I)V

    move v10, v9

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    move v13, v8

    new-instance v8, Lqf3/b;

    move/from16 v23, v10

    invoke-static {v4}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    move v5, v13

    move/from16 v13, v20

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    const-string v8, "featureFlaggableLegacyDefaultRetrofit"

    invoke-static {v8}, Lvf3/b;->f(Ljava/lang/String;)Lvf3/c;

    move-result-object v11

    new-instance v12, Lnd1/d;

    const/16 v8, 0x15

    invoke-direct {v12, v8}, Lnd1/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    move v10, v8

    new-instance v8, Lqf3/b;

    move/from16 v20, v10

    invoke-static {v4}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    const-string v8, "featureFlaggableDefaultRetrofit"

    invoke-static {v8}, Lvf3/b;->f(Ljava/lang/String;)Lvf3/c;

    move-result-object v11

    new-instance v12, Lnd1/d;

    const/16 v8, 0x17

    invoke-direct {v12, v8}, Lnd1/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    move v10, v8

    new-instance v8, Lqf3/b;

    move/from16 v20, v10

    invoke-static {v4}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    const-string v8, "featureFlaggableRetrofitWithRxJava"

    invoke-static {v8}, Lvf3/b;->f(Ljava/lang/String;)Lvf3/c;

    move-result-object v11

    new-instance v12, Lnd1/d;

    const/16 v8, 0x18

    invoke-direct {v12, v8}, Lnd1/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    move v10, v8

    new-instance v8, Lqf3/b;

    invoke-static {v4}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    move/from16 v26, v10

    move-object v10, v4

    move/from16 v4, v26

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move/from16 v20, v13

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    const-string v8, "legacyGsonConverter"

    invoke-static {v8}, Lvf3/b;->f(Ljava/lang/String;)Lvf3/c;

    move-result-object v12

    new-instance v13, Lnd1/d;

    invoke-direct {v13, v15}, Lnd1/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    const-class v8, Lrg3/a;

    invoke-static {v8}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v11

    invoke-static {v10, v12, v11}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v10

    const-string v11, "gsonConverter"

    invoke-static {v9, v0, v10, v11}, Lr80/c;->x(Lqf3/b;Ltf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object v12

    new-instance v13, Lnd1/d;

    const/16 v9, 0x1a

    invoke-direct {v13, v9}, Lnd1/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    invoke-static {v8}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v8

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    invoke-static {v8, v12, v10}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v8

    new-instance v10, Lrf3/d;

    invoke-direct {v10, v9}, Lrf3/d;-><init>(Lqf3/b;)V

    invoke-static {v0, v8, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/d;

    const/16 v8, 0x1b

    invoke-direct {v12, v8}, Lnd1/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v10, Li92/c;

    invoke-static {v10}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v11, 0x0

    move/from16 v13, v20

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    const-string v8, "shared-refs-perm-status-decider"

    invoke-static {v8}, Lvf3/b;->f(Ljava/lang/String;)Lvf3/c;

    move-result-object v11

    new-instance v12, Lnd1/d;

    invoke-direct {v12, v7}, Lnd1/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v7, Landroid/content/SharedPreferences;

    invoke-static {v7}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v7

    invoke-static {v7, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v7

    new-instance v9, Lrf3/a;

    invoke-direct {v9, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v7, v9}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/d;

    invoke-direct {v12, v6}, Lnd1/d;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v7, Lfi0/e;

    invoke-static {v7}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v7

    invoke-static {v7, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v7

    new-instance v9, Lrf3/a;

    invoke-direct {v9, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v7, v9}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v13, Lnd1/f;

    invoke-direct {v13, v2}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    const-class v7, Lcom/whoop/data/repositories/FeatureFlagRepository;

    invoke-static {v7}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v7

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    invoke-static {v7, v12, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v9, v0, v7}, Lb9/y;->x(Lqf3/b;Ltf3/a;Ljava/lang/String;)Lrf3/d;

    move-result-object v7

    const-class v8, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-static {v8}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const-string v9, "clazz"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v10, v7, Lrf3/b;->a:Lqf3/b;

    iget-object v11, v10, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v11, Ljava/util/Collection;

    invoke-static {v8, v11}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v11

    iput-object v11, v10, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v11, v10, Lqf3/b;->c:Lvf3/a;

    iget-object v10, v10, Lqf3/b;->a:Lvf3/a;

    invoke-static {v8, v11, v10}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0, v8, v7, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v13, Lnd1/f;

    const/4 v7, 0x2

    invoke-direct {v13, v7}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    move-object v7, v9

    new-instance v9, Lqf3/b;

    const-class v8, Lod1/v;

    invoke-static {v8}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v8

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    invoke-static {v8, v12, v10}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v9, v0, v8}, Lb9/y;->x(Lqf3/b;Ltf3/a;Ljava/lang/String;)Lrf3/d;

    move-result-object v8

    const-class v9, Lcom/whoop/data/repositories/ActiveSessionChecker;

    invoke-static {v9}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-static {v9, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v10, v8, Lrf3/b;->a:Lqf3/b;

    iget-object v11, v10, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v11, Ljava/util/Collection;

    invoke-static {v9, v11}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v11

    iput-object v11, v10, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v11, v10, Lqf3/b;->c:Lvf3/a;

    iget-object v10, v10, Lqf3/b;->a:Lvf3/a;

    invoke-static {v9, v11, v10}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0, v9, v8, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lnd1/f;

    const/4 v8, 0x3

    invoke-direct {v12, v8}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v10, Lcom/whoop/data/repositories/ArabicLanguageEnabledChecker;

    invoke-static {v10}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v11, 0x0

    move/from16 v13, v20

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v13, Lnd1/f;

    const/4 v8, 0x5

    invoke-direct {v13, v8}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    const-class v8, Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;

    invoke-static {v8}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v8

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    invoke-static {v8, v12, v10}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v8

    new-instance v10, Lrf3/d;

    invoke-direct {v10, v9}, Lrf3/d;-><init>(Lqf3/b;)V

    invoke-static {v0, v8, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/f;

    const/4 v8, 0x6

    invoke-direct {v12, v8}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v10, Lcom/whoop/service/network/AuthServiceApiV2;

    invoke-static {v10}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v11, 0x0

    move/from16 v13, v20

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/f;

    const/4 v8, 0x7

    invoke-direct {v12, v8}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v10, Lcom/whoop/domain/bootstrap/BootstrapApi;

    invoke-static {v10}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/f;

    invoke-direct {v12, v1}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v10, Lpd1/a;

    invoke-static {v10}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v13, Lnd1/f;

    const/16 v8, 0x9

    invoke-direct {v13, v8}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    const-class v11, Lod1/a0;

    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v11

    invoke-static {v10, v12, v11}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v10

    new-instance v11, Lrf3/d;

    invoke-direct {v11, v9}, Lrf3/d;-><init>(Lqf3/b;)V

    invoke-static {v0, v10, v11}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v13, Lnd1/f;

    const/16 v9, 0xa

    invoke-direct {v13, v9}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    const-class v11, Lod1/j;

    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v11

    invoke-static {v10, v12, v11}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v10

    new-instance v11, Lrf3/d;

    invoke-direct {v11, v9}, Lrf3/d;-><init>(Lqf3/b;)V

    invoke-static {v0, v10, v11}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/f;

    const/16 v9, 0xc

    invoke-direct {v12, v9}, Lnd1/f;-><init>(I)V

    move/from16 v22, v9

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    move/from16 v21, v8

    new-instance v8, Lqf3/b;

    const-class v10, Lca2/g;

    invoke-static {v10}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v11, 0x0

    move/from16 v13, v20

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/f;

    const/16 v8, 0xd

    invoke-direct {v12, v8}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    move/from16 v20, v8

    new-instance v8, Lqf3/b;

    const-class v10, Lcom/whoop/data/remote/NewWhoopLoginInterceptor;

    invoke-static {v10}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/f;

    invoke-direct {v12, v3}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v3, Lor2/k1;

    invoke-static {v3}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v3

    invoke-static {v3, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v9, Lrf3/a;

    invoke-direct {v9, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v3, v9}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/f;

    const/16 v3, 0xf

    invoke-direct {v12, v3}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v10, Lod1/b;

    invoke-static {v10}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/f;

    invoke-direct {v12, v5}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v10, Lor2/x1;

    invoke-static {v10}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/f;

    const/16 v11, 0x12

    invoke-direct {v12, v11}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v10, Lus0/f;

    invoke-static {v10}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/f;

    const/16 v8, 0x13

    invoke-direct {v12, v8}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v10, Lca2/e;

    invoke-static {v10}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/f;

    const/16 v8, 0x14

    invoke-direct {v12, v8}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    move/from16 v23, v8

    new-instance v8, Lqf3/b;

    const-class v10, Lor2/r;

    invoke-static {v10}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move/from16 v20, v13

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v13, Lnd1/f;

    const/16 v8, 0x15

    invoke-direct {v13, v8}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    const-class v11, Lfn2/c;

    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v11

    invoke-static {v10, v12, v11}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v10

    new-instance v11, Lrf3/d;

    invoke-direct {v11, v9}, Lrf3/d;-><init>(Lqf3/b;)V

    invoke-static {v0, v10, v11}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/f;

    const/16 v9, 0x17

    invoke-direct {v12, v9}, Lnd1/f;-><init>(I)V

    move v10, v9

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    move/from16 v24, v8

    new-instance v8, Lqf3/b;

    const-class v11, Lfn2/d;

    invoke-static {v11}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    move/from16 v25, v10

    move-object v10, v11

    const/4 v11, 0x0

    move/from16 v13, v20

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/f;

    invoke-direct {v12, v4}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v10, Lfn2/l;

    invoke-static {v10}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/f;

    invoke-direct {v12, v15}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v10, Lfn2/g;

    invoke-static {v10}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/f;

    const/16 v8, 0x1a

    invoke-direct {v12, v8}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v10, Lfn2/n;

    invoke-static {v10}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/f;

    const/16 v8, 0x1b

    invoke-direct {v12, v8}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v10, Lrd1/a;

    invoke-static {v10}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v10

    invoke-static {v10, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v9

    new-instance v10, Lrf3/a;

    invoke-direct {v10, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v9, v10}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/f;

    invoke-direct {v12, v6}, Lnd1/f;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v6, Lz82/i;

    invoke-static {v6}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v6

    invoke-static {v6, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v6

    new-instance v9, Lrf3/a;

    invoke-direct {v9, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v6, v9}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/g;

    const/4 v15, 0x0

    invoke-direct {v12, v15}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v6, Ljk0/e;

    invoke-static {v6}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v6

    invoke-static {v6, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v6

    new-instance v9, Lrf3/a;

    invoke-direct {v9, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v6, v9}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/g;

    invoke-direct {v12, v2}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v6, Li92/o;

    invoke-static {v6}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v6

    invoke-static {v6, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v6

    new-instance v9, Lrf3/a;

    invoke-direct {v9, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v6, v9}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v13, Lnd1/g;

    const/4 v6, 0x2

    invoke-direct {v13, v6}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    const-class v6, Lv92/d;

    invoke-static {v6}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v6

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    invoke-static {v6, v12, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v9, v0, v6}, Lb9/y;->x(Lqf3/b;Ltf3/a;Ljava/lang/String;)Lrf3/d;

    move-result-object v6

    invoke-virtual {v0}, Ltf3/a;->a()Ljava/util/HashSet;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance v13, Lnd1/g;

    const/4 v6, 0x4

    invoke-direct {v13, v6}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    const-class v6, Lv92/c;

    invoke-static {v6}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v6

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v8

    invoke-static {v6, v12, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v6

    new-instance v8, Lrf3/d;

    invoke-direct {v8, v9}, Lrf3/d;-><init>(Lqf3/b;)V

    invoke-static {v0, v6, v8}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/g;

    const/4 v6, 0x5

    invoke-direct {v12, v6}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v6, Lv92/b;

    invoke-static {v6}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v11, 0x0

    move/from16 v13, v20

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v6

    invoke-static {v6, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v6

    new-instance v9, Lrf3/a;

    invoke-direct {v9, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v6, v9}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    const-class v6, Lv92/a;

    invoke-static {v6}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v9, Lrf3/b;->a:Lqf3/b;

    iget-object v8, v7, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v8, Ljava/util/Collection;

    invoke-static {v6, v8}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v8

    iput-object v8, v7, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v8, v7, Lqf3/b;->c:Lvf3/a;

    iget-object v7, v7, Lqf3/b;->a:Lvf3/a;

    invoke-static {v6, v8, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6, v9, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v12, Lnd1/g;

    const/4 v6, 0x6

    invoke-direct {v12, v6}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v6, Laa2/h;

    invoke-static {v6}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v6

    invoke-static {v6, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v6

    new-instance v7, Lrf3/a;

    invoke-direct {v7, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v6, v7}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v13, Lnd1/g;

    const/4 v6, 0x7

    invoke-direct {v13, v6}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    const-class v6, Lz92/b;

    invoke-static {v6}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v6

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v7

    invoke-static {v6, v12, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v9, v0, v6}, Lb9/y;->x(Lqf3/b;Ltf3/a;Ljava/lang/String;)Lrf3/d;

    move-result-object v6

    const-class v7, Lz92/a;

    invoke-static {v7}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    const-class v8, Lz92/d;

    invoke-static {v8}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v9, 0x2

    new-array v9, v9, [Lj93/d;

    const/16 v16, 0x0

    aput-object v7, v9, v16

    aput-object v8, v9, v2

    iget-object v7, v6, Lrf3/b;->a:Lqf3/b;

    iget-object v8, v7, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v8, Ljava/util/Collection;

    invoke-static {v8, v9}, Lm83/s;->h1(Ljava/util/Collection;[Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v8

    iput-object v8, v7, Lqf3/b;->f:Ljava/lang/Object;

    array-length v8, v9

    move/from16 v10, v16

    :goto_0
    if-ge v10, v8, :cond_0

    aget-object v11, v9, v10

    iget-object v12, v7, Lqf3/b;->c:Lvf3/a;

    iget-object v13, v7, Lqf3/b;->a:Lvf3/a;

    invoke-static {v11, v12, v13}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v11, v6, v2}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_0
    new-instance v12, Lnd1/g;

    invoke-direct {v12, v1}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v1, Lvs0/a;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v11, 0x0

    move/from16 v13, v20

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/g;

    const/16 v8, 0x9

    invoke-direct {v12, v8}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v1, Ly92/a;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/g;

    const/16 v2, 0xb

    invoke-direct {v12, v2}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v1, Ly92/b;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/g;

    const/16 v9, 0xc

    invoke-direct {v12, v9}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v1, Lor2/e;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/g;

    const/16 v8, 0xd

    invoke-direct {v12, v8}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v1, Ls03/b;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/g;

    invoke-direct {v12, v3}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v1, Lcom/google/android/gms/location/FusedLocationProviderClient;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/g;

    const/16 v1, 0x10

    invoke-direct {v12, v1}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v1, Lfv1/c;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/g;

    invoke-direct {v12, v5}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v1, Lcom/whoop/util/avatar/AvatarApi;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/g;

    const/16 v11, 0x12

    invoke-direct {v12, v11}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v1, Lpr2/b;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/g;

    const/16 v8, 0x13

    invoke-direct {v12, v8}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v1, Lpr2/a;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/g;

    const/16 v8, 0x14

    invoke-direct {v12, v8}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v1, Lcom/whoop/data/datastore/EmailDataStoreHelper;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/g;

    const/16 v8, 0x15

    invoke-direct {v12, v8}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v1, Lda2/a;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v13, Lnd1/g;

    const/16 v10, 0x17

    invoke-direct {v13, v10}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    const-class v1, Lq92/e;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v2

    invoke-static {v1, v12, v2}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/d;

    invoke-direct {v2, v9}, Lrf3/d;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/g;

    invoke-direct {v12, v4}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v1, Lcom/whoop/service/timezone/a;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    const/4 v11, 0x0

    move/from16 v13, v20

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v12, Lnd1/g;

    const/16 v1, 0x1a

    invoke-direct {v12, v1}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v9

    new-instance v8, Lqf3/b;

    const-class v1, Lod1/y;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-direct/range {v8 .. v13}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v8}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {v1, v11, v9}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v8}, Lrf3/a;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    new-instance v13, Lnd1/g;

    const/16 v1, 0x1b

    invoke-direct {v13, v1}, Lnd1/g;-><init>(I)V

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v10

    new-instance v9, Lqf3/b;

    const-class v1, Li92/d;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->a(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-virtual {v9}, Lqf3/b;->a()Lj93/d;

    move-result-object v1

    invoke-static {}, Lva3/d;->g()Lvf3/c;

    move-result-object v2

    invoke-static {v1, v12, v2}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/d;

    invoke-direct {v2, v9}, Lrf3/d;-><init>(Lqf3/b;)V

    invoke-static {v0, v1, v2}, Ltf3/a;->c(Ltf3/a;Ljava/lang/String;Lrf3/b;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final K1(Lxf3/c;Luf3/a;)Lor2/r;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lor2/r;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/data/repositories/FeatureFlagRepository;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/data/repositories/FeatureFlagRepository;

    const-class v3, Lrr2/c;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lrr2/c;

    const-class v4, Lbc3/c0;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbc3/c0;

    invoke-direct {p1, v1, v3, p0}, Lor2/r;-><init>(Lcom/whoop/data/repositories/FeatureFlagRepository;Lrr2/c;Lbc3/c0;)V

    return-object p1
.end method

.method public static synthetic L(Lxf3/c;Luf3/a;)Lrd1/a;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->Q1(Lxf3/c;Luf3/a;)Lrd1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final L0(Lxf3/c;Luf3/a;)Lud3/l0;
    .locals 4

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lud3/k0;

    invoke-direct {p1}, Lud3/k0;-><init>()V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lj92/q;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/g0;

    invoke-virtual {p1, v1}, Lud3/k0;->a(Lud3/g0;)V

    const-class v1, Lio/sentry/okhttp/d;

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

    const-class v1, Lj92/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/g0;

    invoke-virtual {p1, v1}, Lud3/k0;->a(Lud3/g0;)V

    const-class v1, Lj92/l;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/g0;

    invoke-virtual {p1, v1}, Lud3/k0;->a(Lud3/g0;)V

    new-instance v1, Lvf3/c;

    const-string v3, "httpLoggingInterceptor"

    invoke-direct {v1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Lme3/c;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/g0;

    invoke-virtual {p1, v1}, Lud3/k0;->a(Lud3/g0;)V

    const-class v1, Lj92/n;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/g0;

    invoke-virtual {p1, v1}, Lud3/k0;->a(Lud3/g0;)V

    const-class v1, Lj92/v;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/g0;

    invoke-virtual {p1, v1}, Lud3/k0;->a(Lud3/g0;)V

    const-class v1, Lj92/d;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/g0;

    invoke-virtual {p1, v1}, Lud3/k0;->a(Lud3/g0;)V

    const-class v1, Lj92/g;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/g0;

    invoke-virtual {p1, v1}, Lud3/k0;->a(Lud3/g0;)V

    const-class v1, Lj92/e;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/g0;

    invoke-virtual {p1, v1}, Lud3/k0;->a(Lud3/g0;)V

    const-class v1, Lj92/r;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lud3/c;

    const-string v0, "authenticator"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p0, p1, Lud3/k0;->h:Lud3/c;

    new-instance p0, Lud3/l0;

    invoke-direct {p0, p1}, Lud3/l0;-><init>(Lud3/k0;)V

    return-object p0
.end method

.method private static final L1(Lxf3/c;Luf3/a;)Lfn2/c;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lfn2/e;

    invoke-static {p0}, Lpf/c;->i(Lxf3/c;)Landroid/content/Context;

    move-result-object p0

    invoke-direct {p1, p0}, Lfn2/e;-><init>(Landroid/content/Context;)V

    return-object p1
.end method

.method public static synthetic M(Lxf3/c;Luf3/a;)Lfv1/c;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->i2(Lxf3/c;Luf3/a;)Lfv1/c;

    move-result-object p0

    return-object p0
.end method

.method private static final M0(Lxf3/c;Luf3/a;)Lud3/l0;
    .locals 4

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lud3/k0;

    invoke-direct {p1}, Lud3/k0;-><init>()V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lj92/q;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/g0;

    invoke-virtual {p1, v1}, Lud3/k0;->a(Lud3/g0;)V

    const-class v1, Lio/sentry/okhttp/d;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/g0;

    invoke-virtual {p1, v1}, Lud3/k0;->a(Lud3/g0;)V

    const-class v1, Lj92/b;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/g0;

    invoke-virtual {p1, v1}, Lud3/k0;->a(Lud3/g0;)V

    new-instance v1, Lvf3/c;

    const-string v3, "httpLoggingInterceptor"

    invoke-direct {v1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Lme3/c;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/g0;

    invoke-virtual {p1, v1}, Lud3/k0;->a(Lud3/g0;)V

    const-class v1, Lj92/v;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/g0;

    invoke-virtual {p1, v1}, Lud3/k0;->a(Lud3/g0;)V

    const-class v1, Lj92/n;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lud3/g0;

    invoke-virtual {p1, p0}, Lud3/k0;->a(Lud3/g0;)V

    sget-object p0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-string v0, "unit"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timeout"

    const-wide/16 v1, 0xa

    invoke-static {v0, v1, v2, p0}, Lwd3/h;->b(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    move-result p0

    iput p0, p1, Lud3/k0;->x:I

    new-instance p0, Lud3/l0;

    invoke-direct {p0, p1}, Lud3/l0;-><init>(Lud3/k0;)V

    return-object p0
.end method

.method private static final M1(Lxf3/c;Luf3/a;)Lfn2/d;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lfn2/f;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Landroid/content/Context;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p1, v3}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Landroid/content/Context;

    const-class v2, Lfn2/g;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfn2/g;

    const-class v4, Lfn2/c;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfn2/c;

    invoke-direct {v0, p1, v2, p0}, Lfn2/f;-><init>(Landroid/content/Context;Lfn2/g;Lfn2/c;)V

    return-object v0

    :cond_0
    new-instance p0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "No value found for type \'"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x27

    invoke-static {v1, v2, p1, v0}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic N(Lxf3/c;Luf3/a;)Lrg3/a;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->o1(Lxf3/c;Luf3/a;)Lrg3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final N0(Lxf3/c;Luf3/a;)Lj92/v;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lj92/v;

    const-class v0, Lor2/g;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lor2/g;

    sget-object v2, Ll83/i;->w:Ll83/i;

    new-instance v3, Lnd1/i$a;

    invoke-direct {v3, p0, v1, v1}, Lnd1/i$a;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p0

    invoke-direct {p1, v0, p0}, Lj92/v;-><init>(Lor2/g;Ll83/h;)V

    return-object p1
.end method

.method private static final N1(Lxf3/c;Luf3/a;)Lfn2/l;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lfn2/i;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Landroid/content/Context;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p1, v3}, Luf3/a;->b(Lj93/d;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    check-cast p1, Landroid/content/Context;

    const-class v2, Lfn2/g;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfn2/g;

    const-class v4, Lfn2/c;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfn2/c;

    invoke-direct {v0, p1, v2, p0}, Lfn2/i;-><init>(Landroid/content/Context;Lfn2/g;Lfn2/c;)V

    return-object v0

    :cond_0
    new-instance p0, Lorg/koin/core/error/DefinitionParameterException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "No value found for type \'"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/16 v0, 0x27

    invoke-static {v1, v2, p1, v0}, Lm4/a;->k(Lkotlin/jvm/internal/i0;Ljava/lang/Class;Ljava/lang/StringBuilder;C)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lorg/koin/core/error/DefinitionParameterException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic O(Lxf3/c;Luf3/a;)Lcom/whoop/data/datastore/EmailDataStoreHelper;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->m2(Lxf3/c;Luf3/a;)Lcom/whoop/data/datastore/EmailDataStoreHelper;

    move-result-object p0

    return-object p0
.end method

.method private static final O0(Lxf3/c;Luf3/a;)Lj92/l;
    .locals 5

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lj92/l;

    new-instance v0, Lvf3/c;

    const-string v1, "userContext"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lod1/u;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lod1/u;

    const-class v2, Lz92/a;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {p0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lz92/a;

    const-class v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-direct {p1, v0, v2, p0}, Lj92/l;-><init>(Lod1/u;Lz92/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-object p1
.end method

.method private static final O1(Lxf3/c;Luf3/a;)Lfn2/g;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lfn2/g;

    const-class v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-direct {p1, p0}, Lfn2/g;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-object p1
.end method

.method public static synthetic P(Lxf3/c;Luf3/a;)Lfn2/c;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->L1(Lxf3/c;Luf3/a;)Lfn2/c;

    move-result-object p0

    return-object p0
.end method

.method private static final P0(Lxf3/c;Luf3/a;)Lj92/k;
    .locals 13

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lj92/k;

    new-instance p1, Lvf3/c;

    const-string v0, "userContext"

    invoke-direct {p1, v0}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lod1/u;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Lod1/u;

    sget-object p1, Ll83/i;->w:Ll83/i;

    new-instance v4, Lnd1/i$b;

    invoke-direct {v4, p0, v3, v3}, Lnd1/i$b;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {p1, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lnd1/i$c;

    invoke-direct {v5, p0, v3, v3}, Lnd1/i$c;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {p1, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v6, Lnd1/i$d;

    invoke-direct {v6, p0, v3, v3}, Lnd1/i$d;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {p1, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v6

    new-instance v7, Lnd1/i$e;

    invoke-direct {v7, p0, v3, v3}, Lnd1/i$e;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {p1, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    new-instance v8, Lnd1/i$f;

    invoke-direct {v8, p0, v3, v3}, Lnd1/i$f;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {p1, v8}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v8

    const-class p1, Lbc3/c0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v3, p1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v9, p0

    check-cast v9, Lbc3/c0;

    const/16 v11, 0x102

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v12}, Lj92/k;-><init>(Lod1/u;Ltr2/n;Ll83/h;Ll83/h;Ll83/h;Ll83/h;Ll83/h;Lbc3/c0;Lj92/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final P1(Lxf3/c;Luf3/a;)Lfn2/n;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lfn2/a;

    const-class v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-direct {p1, p0}, Lfn2/a;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-object p1
.end method

.method public static synthetic Q(Lxf3/c;Luf3/a;)Lod1/j;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->B1(Lxf3/c;Luf3/a;)Lod1/j;

    move-result-object p0

    return-object p0
.end method

.method private static final Q0(Lxf3/c;Luf3/a;)Lmc3/a;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p0

    return-object p0
.end method

.method private static final Q1(Lxf3/c;Luf3/a;)Lrd1/a;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lrd1/a;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string v0, "AppBacklogTracker"

    invoke-virtual {p1, v0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v2

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Liy1/c;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v0, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Liy1/c;

    const-class v4, Lbc3/c0;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v3, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lbc3/c0;

    const-class v5, Lz92/a;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v3, v5, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lz92/a;

    const-class v6, Lca2/h;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v3, p1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lca2/h;

    move-object v3, v0

    invoke-direct/range {v1 .. v6}, Lrd1/a;-><init>(Ltr2/n;Liy1/c;Lbc3/c0;Lz92/a;Lca2/h;)V

    return-object v1
.end method

.method public static synthetic R(Lxf3/c;Luf3/a;)Ly92/a;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->c2(Lxf3/c;Luf3/a;)Ly92/a;

    move-result-object p0

    return-object p0
.end method

.method private static final R0(Lxf3/c;Luf3/a;)Ll92/a;
    .locals 11

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ll92/a;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lod1/j;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lod1/j;

    const-class v3, Ldj0/b;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldj0/b;

    sget-object v4, Ll83/i;->w:Ll83/i;

    new-instance v5, Lnd1/i$g;

    invoke-direct {v5, p0, v2, v2}, Lnd1/i$g;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {v4, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lvf3/c;

    const-string v6, "onboardingRefreshMutex"

    invoke-direct {v5, v6}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v6, Lmc3/a;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v5}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lmc3/a;

    const/16 v9, 0x70

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v10}, Ll92/a;-><init>(Lod1/j;Ldj0/b;Ll83/h;Lmc3/a;Lj92/a;Lj92/t;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final R1(Lxf3/c;Luf3/a;)Lj92/h;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lj92/h;

    const-class v0, Ltr2/n;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ltr2/n;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lj92/h;-><init>(Ltr2/n;Lj92/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public static synthetic S(Lxf3/c;Luf3/a;)Lpd1/a;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->z1(Lxf3/c;Luf3/a;)Lpd1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final S0(Lxf3/c;Luf3/a;)Lj92/r;
    .locals 7

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lj92/r;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lz92/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz92/a;

    const-class v3, Lod1/j;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Lod1/j;

    sget-object p1, Ll83/i;->w:Ll83/i;

    new-instance v4, Lnd1/i$h;

    invoke-direct {v4, p0, v2, v2}, Lnd1/i$h;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {p1, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lnd1/i$i;

    invoke-direct {v5, p0, v2, v2}, Lnd1/i$i;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {p1, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    new-instance v6, Lnd1/i$j;

    invoke-direct {v6, p0, v2, v2}, Lnd1/i$j;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {p1, v6}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v6

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lj92/r;-><init>(Lz92/a;Lod1/j;Ll83/h;Ll83/h;Ll83/h;)V

    return-object v1
.end method

.method private static final S1(Lxf3/c;Luf3/a;)Lz82/i;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lz82/i;

    const-class v0, Lfi0/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfi0/a;

    invoke-direct {p1, p0}, Lz82/i;-><init>(Lfi0/a;)V

    return-object p1
.end method

.method public static synthetic T(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/GpsServiceApi;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->b1(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/GpsServiceApi;

    move-result-object p0

    return-object p0
.end method

.method private static final T0(Lxf3/c;Luf3/a;)Lj92/p;
    .locals 13

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lj92/p;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/service/network/AuthServiceApiV2;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/service/network/AuthServiceApiV2;

    const-class v3, Ldj0/b;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldj0/b;

    const-class v4, Ly92/a;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly92/a;

    new-instance v5, Lvf3/c;

    const-string v6, "userContext"

    invoke-direct {v5, v6}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v6, Lod1/u;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v2, v6, v5}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lod1/u;

    const-class v5, Liy1/c;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Liy1/c;

    const-class v5, Lor2/e;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v8, p0

    check-cast v8, Lor2/e;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object v9

    const/16 v11, 0x108

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v10, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v12}, Lj92/p;-><init>(Lcom/whoop/service/network/AuthServiceApiV2;Ldj0/b;Ly92/a;Lj92/a;Lod1/u;Liy1/c;Lor2/e;Lmc3/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final T1(Lxf3/c;Luf3/a;)Ljk0/e;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lc92/j;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string v0, "ManualPairingHelper"

    invoke-virtual {p1, v0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    invoke-direct {p0, p1}, Lc92/j;-><init>(Ltr2/n;)V

    return-object p0
.end method

.method public static synthetic U(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/ActivitiesApi;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->Z0(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/ActivitiesApi;

    move-result-object p0

    return-object p0
.end method

.method private static final U0(Lxf3/c;Luf3/a;)Lio/sentry/okhttp/d;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lio/sentry/okhttp/d;

    invoke-direct {p0}, Lio/sentry/okhttp/d;-><init>()V

    return-object p0
.end method

.method private static final U1(Lxf3/c;Luf3/a;)Li92/o;
    .locals 6

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Li92/o;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lbc3/c0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbc3/c0;

    const-class v3, Lcom/whoop/service/network/UsersPreferenceApi;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/service/network/UsersPreferenceApi;

    new-instance v4, Lao1/h;

    const/16 v5, 0x1a

    invoke-direct {v4, p0, v5}, Lao1/h;-><init>(Lxf3/c;I)V

    const-class v5, Ltr2/n;

    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ltr2/n;

    invoke-direct {p1, v1, v3, v4, p0}, Li92/o;-><init>(Lbc3/c0;Lcom/whoop/service/network/UsersPreferenceApi;Lc93/a;Ltr2/n;)V

    return-object p1
.end method

.method public static synthetic V(Lxf3/c;Luf3/a;)Ly92/b;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->e2(Lxf3/c;Luf3/a;)Ly92/b;

    move-result-object p0

    return-object p0
.end method

.method private static final V0(Lxf3/c;Luf3/a;)Lj92/n;
    .locals 2

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lj92/n;

    const-class v0, Lj92/m;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj92/m;

    invoke-direct {p1, p0}, Lj92/n;-><init>(Lj92/m;)V

    return-object p1
.end method

.method private static final V1(Lxf3/c;)Z
    .locals 0

    invoke-static {p0}, Lpf/c;->h(Lxf3/c;)Landroid/app/Application;

    move-result-object p0

    invoke-static {p0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result p0

    return p0
.end method

.method public static synthetic W(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/ArabicLanguageEnabledChecker;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->u1(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/ArabicLanguageEnabledChecker;

    move-result-object p0

    return-object p0
.end method

.method private static final W0(Lxf3/c;Luf3/a;)Lj92/m;
    .locals 2

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lj92/m;

    const-class v0, Lcom/whoop/data/local/prefs/PreferenceHelper;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/local/prefs/PreferenceHelper;

    invoke-direct {p1, p0}, Lj92/m;-><init>(Lcom/whoop/data/local/prefs/PreferenceHelper;)V

    return-object p1
.end method

.method private static final W1(Lxf3/c;Luf3/a;)Lv92/d;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lv92/d;

    invoke-static {p0}, Lpf/c;->i(Lxf3/c;)Landroid/content/Context;

    move-result-object p0

    invoke-direct {p1, p0}, Lv92/d;-><init>(Landroid/content/Context;)V

    return-object p1
.end method

.method public static synthetic X(Lxf3/c;Luf3/a;)Lod1/v;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->t1(Lxf3/c;Luf3/a;)Lod1/v;

    move-result-object p0

    return-object p0
.end method

.method private static final X0(Lxf3/c;Luf3/a;)Lud3/l0;
    .locals 3

    const-string v0, "it"

    const-string v1, "defaultOkHttpClient"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    const-class v0, Lud3/l0;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lud3/l0;

    invoke-virtual {p1}, Lud3/l0;->a()Lud3/k0;

    move-result-object p1

    new-instance v0, Lud3/g;

    invoke-static {p0}, Lpf/c;->h(Lxf3/c;)Landroid/app/Application;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object p0

    const-string v1, "getCacheDir(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0}, Lud3/g;-><init>(Ljava/io/File;)V

    iput-object v0, p1, Lud3/k0;->l:Lud3/g;

    new-instance p0, Lud3/l0;

    invoke-direct {p0, p1}, Lud3/l0;-><init>(Lud3/k0;)V

    return-object p0
.end method

.method private static final X1(Lxf3/c;Luf3/a;)Lv92/c;
    .locals 6

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lv92/c;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lv92/d;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv92/d;

    const-class v3, La6/g;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La6/g;

    const-class v4, Lrr2/c;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lrr2/c;

    const-class v5, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-direct {p1, v1, v3, v4, p0}, Lv92/c;-><init>(Lv92/d;La6/g;Lrr2/c;Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-object p1
.end method

.method public static synthetic Y(Lxf3/c;Luf3/a;)Lod1/y;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->s2(Lxf3/c;Luf3/a;)Lod1/y;

    move-result-object p0

    return-object p0
.end method

.method private static final Y0(Lxf3/c;Luf3/a;)Lj92/d;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lj92/d;

    invoke-direct {p0}, Lj92/d;-><init>()V

    return-object p0
.end method

.method private static final Y1(Lxf3/c;Luf3/a;)Lv92/b;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lv92/b;

    const-class v0, Lv92/c;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lv92/c;

    invoke-direct {p1, p0}, Lv92/b;-><init>(Lv92/c;)V

    return-object p1
.end method

.method public static synthetic Z(Lxf3/c;Luf3/a;)Li92/o;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->U1(Lxf3/c;Luf3/a;)Li92/o;

    move-result-object p0

    return-object p0
.end method

.method private static final Z0(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/ActivitiesApi;
    .locals 3

    const-string v0, "it"

    const-string v1, "featureFlaggableRetrofitWithRxJava"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    new-instance v0, Lma1/a;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lma1/a;-><init>(I)V

    const-class v1, Lpg3/y0;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    const-class p1, Lcom/whoop/service/network/ActivitiesApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/service/network/ActivitiesApi;

    return-object p0
.end method

.method private static final Z1(Lxf3/c;Luf3/a;)Laa2/h;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Laa2/h;

    invoke-direct {p0}, Laa2/h;-><init>()V

    return-object p0
.end method

.method public static synthetic a(Lxf3/c;Luf3/a;)Lpg3/y0;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->f1(Lxf3/c;Luf3/a;)Lpg3/y0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a0(Lxf3/c;Luf3/a;)Lcom/google/android/gms/location/FusedLocationProviderClient;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->h2(Lxf3/c;Luf3/a;)Lcom/google/android/gms/location/FusedLocationProviderClient;

    move-result-object p0

    return-object p0
.end method

.method private static final a1()Luf3/a;
    .locals 1

    const-string v0, "kt-serialization-activities-api"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final a2(Lxf3/c;Luf3/a;)Lz92/b;
    .locals 7

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lz92/b;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Laa2/e;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laa2/e;

    const-class v3, Laa2/h;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Laa2/h;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lz92/b;-><init>(Laa2/e;Laa2/h;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic b(Lxf3/c;Luf3/a;)Lj92/m;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->W0(Lxf3/c;Luf3/a;)Lj92/m;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b0(Lxf3/c;Luf3/a;)Lj92/d;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->Y0(Lxf3/c;Luf3/a;)Lj92/d;

    move-result-object p0

    return-object p0
.end method

.method private static final b1(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/GpsServiceApi;
    .locals 3

    const-string v0, "it"

    const-string v1, "retrofitWithKtxSerialization"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    const-class v0, Lpg3/y0;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, Lpg3/x0;

    invoke-direct {p1, p0}, Lpg3/x0;-><init>(Lpg3/y0;)V

    new-instance p0, Lqg3/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1, p0}, Lpg3/x0;->a(Lpg3/f;)V

    invoke-virtual {p1}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object p0

    const-class p1, Lcom/whoop/service/network/GpsServiceApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/service/network/GpsServiceApi;

    return-object p0
.end method

.method private static final b2(Lxf3/c;Luf3/a;)Lvs0/a;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lz92/c;

    const-class v0, Lz92/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lz92/a;

    invoke-direct {p1, p0}, Lz92/c;-><init>(Lz92/a;)V

    return-object p1
.end method

.method public static synthetic c(Lxf3/c;Luf3/a;)Lj92/b;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->d2(Lxf3/c;Luf3/a;)Lj92/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c0(Lxf3/c;Luf3/a;)Lor2/x1;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->H1(Lxf3/c;Luf3/a;)Lor2/x1;

    move-result-object p0

    return-object p0
.end method

.method private static final c1(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/HomeComponentDismissApi;
    .locals 3

    const-string v0, "it"

    const-string v1, "featureFlaggableDefaultRetrofit"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    new-instance v0, Lna1/a;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lna1/a;-><init>(I)V

    const-class v1, Lpg3/y0;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    const-class p1, Lcom/whoop/service/network/HomeComponentDismissApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "create(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/whoop/service/network/HomeComponentDismissApi;

    return-object p0
.end method

.method private static final c2(Lxf3/c;Luf3/a;)Ly92/a;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ly92/a;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lz92/d;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz92/d;

    const-class v3, Lv92/a;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lv92/a;

    const-class v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Ly92/a;-><init>(Lz92/d;Lv92/a;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic d(Lxf3/c;Luf3/a;)Lcom/whoop/data/remote/NewWhoopLoginInterceptor;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->D1(Lxf3/c;Luf3/a;)Lcom/whoop/data/remote/NewWhoopLoginInterceptor;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d0(Lxf3/c;Luf3/a;)Lpg3/y0;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->h1(Lxf3/c;Luf3/a;)Lpg3/y0;

    move-result-object p0

    return-object p0
.end method

.method private static final d1()Luf3/a;
    .locals 1

    const-string v0, "kt-serialization-home-component-dismiss"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final d2(Lxf3/c;Luf3/a;)Lj92/b;
    .locals 20

    move-object/from16 v0, p0

    const-string v1, "$this$factory"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lor2/h1;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lor2/h1;

    invoke-static {v0}, Lpf/c;->i(Lxf3/c;)Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v2, v4}, Lor2/h1;->c(Landroid/content/Context;)Landroid/content/pm/PackageInfo;

    move-result-object v2

    const-class v4, Li92/c;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v0, v3, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    move-object v14, v4

    check-cast v14, Li92/c;

    sget-object v4, Lj92/c;->a:Lj92/c;

    invoke-static {v0}, Lpf/c;->i(Lxf3/c;)Landroid/content/Context;

    move-result-object v5

    invoke-static {v5}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result v5

    invoke-virtual {v4, v5}, Lj92/c;->a(Z)Ljava/lang/String;

    move-result-object v17

    new-instance v5, Lj92/b;

    const-class v4, Lq92/h;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v0, v3, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lq92/h;

    const-class v4, Lq92/e;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v0, v3, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Lq92/e;

    const-class v4, Lcom/whoop/data/local/prefs/PreferenceHelper;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v0, v3, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Lcom/whoop/data/local/prefs/PreferenceHelper;

    const-class v4, Lor2/g;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-virtual {v0, v3, v9, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lor2/g;

    sget-object v10, Ll83/i;->w:Ll83/i;

    new-instance v11, Lnd1/i$m;

    invoke-direct {v11, v0, v3, v3}, Lnd1/i$m;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {v10, v11}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v11

    move-object v12, v11

    iget-object v11, v2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    const-string v13, "packageName"

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v13, v2, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    if-nez v13, :cond_0

    const-string v13, "99.99.99"

    :cond_0
    sget-object v15, Lj92/b;->N:Lj92/b$a;

    invoke-virtual {v1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v0, v3, v4, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lor2/g;

    invoke-virtual {v4}, Lor2/g;->j()I

    move-result v4

    invoke-virtual {v15, v2, v4}, Lj92/b$a;->a(Landroid/content/pm/PackageInfo;I)Ljava/lang/Number;

    move-result-object v4

    move-object v15, v4

    iget-wide v3, v2, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    const-class v2, Lor2/r1;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v18, v1

    check-cast v18, Lor2/r1;

    new-instance v1, Lnd1/i$n;

    invoke-direct {v1, v0, v2, v2}, Lnd1/i$n;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {v10, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v19

    move-object v10, v12

    move-object v12, v13

    move-object v13, v15

    move-wide v15, v3

    invoke-direct/range {v5 .. v19}, Lj92/b;-><init>(Lq92/h;Lq92/e;Lcom/whoop/data/local/prefs/PreferenceHelper;Lor2/g;Ll83/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Li92/c;JLjava/lang/String;Lor2/r1;Ll83/h;)V

    return-object v5
.end method

.method public static synthetic e(Lxf3/c;Luf3/a;)Lpg3/y0;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->l1(Lxf3/c;Luf3/a;)Lpg3/y0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e0(Lxf3/c;Luf3/a;)Lfn2/g;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->O1(Lxf3/c;Luf3/a;)Lfn2/g;

    move-result-object p0

    return-object p0
.end method

.method private static final e1(Lxf3/c;Luf3/a;)Lu92/c;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lu92/c;

    const-class v0, La6/g;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La6/g;

    invoke-direct {p1, p0}, Lu92/c;-><init>(La6/g;)V

    return-object p1
.end method

.method private static final e2(Lxf3/c;Luf3/a;)Ly92/b;
    .locals 8

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ly92/b;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Ly92/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly92/a;

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

    invoke-direct/range {v1 .. v7}, Ly92/b;-><init>(Ly92/a;Lbc3/c0;Lq83/j;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic f(Lxf3/c;Luf3/a;)Li92/d;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->t2(Lxf3/c;Luf3/a;)Li92/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f0(Lxf3/c;Luf3/a;)Lda2/a;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->n2(Lxf3/c;Luf3/a;)Lda2/a;

    move-result-object p0

    return-object p0
.end method

.method private static final f1(Lxf3/c;Luf3/a;)Lpg3/y0;
    .locals 4

    const-string v0, "$this$single"

    const-string v1, "it"

    invoke-static {p0, v0, p1, v1}, Lm4/a;->o(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;)Lpg3/x0;

    move-result-object p1

    new-instance v0, Lvf3/c;

    const-string v1, "defaultOkHttpClient"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lud3/l0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lud3/l0;

    invoke-virtual {p1, v0}, Lpg3/x0;->e(Lud3/l0;)V

    const-class v0, Lsr2/y;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v3, v0, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lsr2/y;

    invoke-virtual {p0}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lpg3/x0;->c(Ljava/lang/String;)V

    invoke-virtual {p1}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object p0

    return-object p0
.end method

.method private static final f2(Lxf3/c;Luf3/a;)Lor2/e;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lor2/e;

    const-class v0, Lfi0/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfi0/a;

    invoke-direct {p1, p0}, Lor2/e;-><init>(Lfi0/a;)V

    return-object p1
.end method

.method public static synthetic g(Lxf3/c;Luf3/a;)Lv92/c;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->X1(Lxf3/c;Luf3/a;)Lv92/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g0(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/AuthServiceApiV2;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->x1(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/AuthServiceApiV2;

    move-result-object p0

    return-object p0
.end method

.method private static final g1(Lxf3/c;Luf3/a;)Lpg3/y0;
    .locals 4

    const-string v0, "it"

    const-string v1, "baseRetrofit"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lpg3/y0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpg3/y0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lpg3/x0;

    invoke-direct {v1, p1}, Lpg3/x0;-><init>(Lpg3/y0;)V

    new-instance p1, Lvf3/c;

    const-string v3, "legacyGsonConverter"

    invoke-direct {p1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Lrg3/a;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/m;

    invoke-virtual {v1, p0}, Lpg3/x0;->b(Lpg3/m;)V

    invoke-virtual {v1}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object p0

    return-object p0
.end method

.method private static final g2(Lxf3/c;Luf3/a;)Ls03/b;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Ls03/b;

    invoke-direct {p0}, Ls03/b;-><init>()V

    return-object p0
.end method

.method public static synthetic h(Lxf3/c;Luf3/a;)Lor2/r;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->K1(Lxf3/c;Luf3/a;)Lor2/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h0(Lxf3/c;Luf3/a;)Lvs0/a;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->b2(Lxf3/c;Luf3/a;)Lvs0/a;

    move-result-object p0

    return-object p0
.end method

.method private static final h1(Lxf3/c;Luf3/a;)Lpg3/y0;
    .locals 4

    const-string v0, "it"

    const-string v1, "baseRetrofit"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lpg3/y0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpg3/y0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lpg3/x0;

    invoke-direct {v1, p1}, Lpg3/x0;-><init>(Lpg3/y0;)V

    new-instance p1, Lvf3/c;

    const-string v3, "gsonConverter"

    invoke-direct {p1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Lrg3/a;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/m;

    invoke-virtual {v1, p0}, Lpg3/x0;->b(Lpg3/m;)V

    invoke-virtual {v1}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object p0

    return-object p0
.end method

.method private static final h2(Lxf3/c;Luf3/a;)Lcom/google/android/gms/location/FusedLocationProviderClient;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class p1, Landroid/content/Context;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    sget-object p1, Ltp/h;->a:Lcom/google/android/gms/common/api/f;

    new-instance p1, Lcom/google/android/gms/location/FusedLocationProviderClient;

    invoke-direct {p1, p0}, Lcom/google/android/gms/location/FusedLocationProviderClient;-><init>(Landroid/content/Context;)V

    return-object p1
.end method

.method public static synthetic i(Lxf3/c;Luf3/a;)Lud3/l0;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->X0(Lxf3/c;Luf3/a;)Lud3/l0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i0(Lxf3/c;Luf3/a;)Lio/sentry/okhttp/d;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->U0(Lxf3/c;Luf3/a;)Lio/sentry/okhttp/d;

    move-result-object p0

    return-object p0
.end method

.method private static final i1(Lxf3/c;Luf3/a;)Lpg3/y0;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Luf3/a;->a:Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Lad3/c;

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    check-cast v0, Lad3/c;

    if-eqz v0, :cond_3

    invoke-static {v0}, Lu82/f;->a(Lad3/c;)Lpg3/m;

    move-result-object p1

    if-nez p1, :cond_4

    :cond_3
    invoke-static {}, Lu82/k;->d()Lpg3/m;

    move-result-object p1

    :cond_4
    new-instance v0, Lvf3/c;

    const-string v2, "baseRetrofit"

    invoke-direct {v0, v2}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v2, Lpg3/y0;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lpg3/x0;

    invoke-direct {v0, p0}, Lpg3/x0;-><init>(Lpg3/y0;)V

    invoke-virtual {v0, p1}, Lpg3/x0;->b(Lpg3/m;)V

    invoke-virtual {v0}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object p0

    return-object p0
.end method

.method private static final i2(Lxf3/c;Luf3/a;)Lfv1/c;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lfv1/a;

    const-class v0, Lcom/google/android/gms/location/FusedLocationProviderClient;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/location/FusedLocationProviderClient;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "FusedLocationManager"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Lfv1/a;-><init>(Lcom/google/android/gms/location/FusedLocationProviderClient;Ltr2/n;)V

    return-object p1
.end method

.method public static synthetic j(Lxf3/c;Luf3/a;)Lus0/f;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->I1(Lxf3/c;Luf3/a;)Lus0/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j0(Lxf3/c;Luf3/a;)Lca2/g;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->C1(Lxf3/c;Luf3/a;)Lca2/g;

    move-result-object p0

    return-object p0
.end method

.method private static final j1(Lxf3/c;Luf3/a;)Lpg3/y0;
    .locals 11

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Luf3/a;->a:Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/util/Set;

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    check-cast v0, Ljava/util/Set;

    if-nez v0, :cond_3

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    :cond_3
    move-object v7, v0

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lu82/g;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lu82/g;

    const-class v0, Lsr2/y;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsr2/y;

    invoke-virtual {v0}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object v3

    new-instance v0, Lvf3/c;

    const-string v4, "defaultOkHttpClient"

    invoke-direct {v0, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Lud3/l0;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lud3/l0;

    invoke-static {}, Lor2/i0;->d()Lcom/google/gson/Gson;

    move-result-object v5

    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object v6

    const/16 v9, 0x20

    const/4 v10, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lu82/g;->b(Lu82/g;Ljava/lang/String;Lud3/l0;Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;Lpg3/f;ILjava/lang/Object;)Lpg3/y0;

    move-result-object p0

    return-object p0
.end method

.method private static final j2(Lxf3/c;Luf3/a;)Lcom/whoop/util/avatar/AvatarApi;
    .locals 3

    const-string v0, "it"

    const-string v1, "retrofitWithKtxSerialization"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    const-class v0, Lpg3/y0;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    const-class p1, Lcom/whoop/util/avatar/AvatarApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "create(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/whoop/util/avatar/AvatarApi;

    return-object p0
.end method

.method public static synthetic k(Lxf3/c;Luf3/a;)Lpg3/y0;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->g1(Lxf3/c;Luf3/a;)Lpg3/y0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k0(Lxf3/c;Luf3/a;)Lj92/h;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->R1(Lxf3/c;Luf3/a;)Lj92/h;

    move-result-object p0

    return-object p0
.end method

.method private static final k1(Lxf3/c;Luf3/a;)Lpg3/y0;
    .locals 4

    const-string v0, "it"

    const-string v1, "defaultRetrofit"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lpg3/y0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpg3/y0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lpg3/x0;

    invoke-direct {v1, p1}, Lpg3/x0;-><init>(Lpg3/y0;)V

    new-instance p1, Lvf3/c;

    const-string v3, "cacheEnabledOktthpClient"

    invoke-direct {p1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Lud3/l0;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lud3/l0;

    invoke-virtual {v1, p0}, Lpg3/x0;->e(Lud3/l0;)V

    invoke-virtual {v1}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object p0

    return-object p0
.end method

.method private static final k2(Lxf3/c;Luf3/a;)Lpr2/b;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lpr2/c;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/util/avatar/AvatarApi;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/util/avatar/AvatarApi;

    const-class v3, Lz92/a;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lz92/a;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v2, "AvatarService"

    invoke-virtual {v0, v2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    invoke-direct {p1, v1, p0, v0}, Lpr2/c;-><init>(Lcom/whoop/util/avatar/AvatarApi;Lz92/a;Ltr2/n;)V

    return-object p1
.end method

.method public static synthetic l(Lxf3/c;Luf3/a;)Lpg3/y0;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->k1(Lxf3/c;Luf3/a;)Lpg3/y0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l0(Lxf3/c;Luf3/a;)Lv92/d;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->W1(Lxf3/c;Luf3/a;)Lv92/d;

    move-result-object p0

    return-object p0
.end method

.method private static final l1(Lxf3/c;Luf3/a;)Lpg3/y0;
    .locals 11

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Luf3/a;->a:Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/util/Set;

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    check-cast v0, Ljava/util/Set;

    if-nez v0, :cond_3

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    :cond_3
    move-object v7, v0

    new-instance p1, Lcom/google/gson/GsonBuilder;

    invoke-direct {p1}, Lcom/google/gson/GsonBuilder;-><init>()V

    new-instance v0, Lcom/whoop/data/serialization/DateTimeSerializer;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lzr2/a;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v1, v3, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lzr2/a;

    invoke-direct {v0, v3}, Lcom/whoop/data/serialization/DateTimeSerializer;-><init>(Lzr2/a;)V

    const-class v3, Lorg/joda/time/DateTime;

    invoke-virtual {p1, v3, v0}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object p1

    new-instance v0, Lcom/whoop/data/serialization/DateTimeRangeSerializer;

    invoke-direct {v0}, Lcom/whoop/data/serialization/DateTimeRangeSerializer;-><init>()V

    const-class v3, Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    invoke-virtual {p1, v3, v0}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object p1

    const-string v0, "registerTypeAdapter(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lw82/a;->a(Lcom/google/gson/GsonBuilder;)Lcom/google/gson/GsonBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object v5

    const-class p1, Lu82/g;

    invoke-virtual {v2, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu82/g;

    const-class v0, Lsr2/y;

    invoke-virtual {v2, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsr2/y;

    invoke-virtual {v0}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object v3

    new-instance v0, Lvf3/c;

    const-string v4, "defaultOkHttpClient"

    invoke-direct {v0, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Lud3/l0;

    invoke-virtual {v2, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {p0, v1, v2, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lud3/l0;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object v6

    const/16 v9, 0x20

    const/4 v10, 0x0

    const/4 v8, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v10}, Lu82/g;->b(Lu82/g;Ljava/lang/String;Lud3/l0;Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;Lpg3/f;ILjava/lang/Object;)Lpg3/y0;

    move-result-object p0

    return-object p0
.end method

.method private static final l2(Lxf3/c;Luf3/a;)Lpr2/a;
    .locals 9

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lpr2/a;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lod1/a0;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lod1/a0;

    const-class v3, Lpr2/b;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lpr2/b;

    new-instance v4, Lvf3/c;

    const-string v5, "userContext"

    invoke-direct {v4, v5}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v5, Lod1/u;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lod1/u;

    const-class v5, Lbc3/c0;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lbc3/c0;

    sget-object v6, Ltr2/n;->a:Ltr2/n$a;

    const-string v7, "AvatarManager"

    invoke-virtual {v6, v7}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v6

    const-class v7, Lpd1/a;

    invoke-virtual {p1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {p0, v2, v7, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lpd1/a;

    const-class v8, Lz92/a;

    invoke-virtual {p1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v8, p0

    check-cast v8, Lz92/a;

    move-object v2, v0

    invoke-direct/range {v1 .. v8}, Lpr2/a;-><init>(Lod1/a0;Lpr2/b;Lod1/u;Lbc3/c0;Ltr2/n;Lpd1/a;Lz92/a;)V

    return-object v1
.end method

.method public static synthetic m(Lxf3/c;Luf3/a;)Lj92/g;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->o2(Lxf3/c;Luf3/a;)Lj92/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m0(Lxf3/c;Luf3/a;)Lj92/n;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->V0(Lxf3/c;Luf3/a;)Lj92/n;

    move-result-object p0

    return-object p0
.end method

.method private static final m1(Lxf3/c;Luf3/a;)Lpg3/y0;
    .locals 9

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p1, Luf3/a;->a:Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/util/Set;

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_0

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    check-cast v0, Ljava/util/Set;

    if-nez v0, :cond_3

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    :cond_3
    move-object v7, v0

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lu82/g;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lu82/g;

    const-class v0, Lsr2/y;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsr2/y;

    invoke-virtual {v0}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object v3

    new-instance v0, Lvf3/c;

    const-string v4, "defaultOkHttpClient"

    invoke-direct {v0, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Lud3/l0;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lud3/l0;

    invoke-static {}, Lor2/i0;->d()Lcom/google/gson/Gson;

    move-result-object v5

    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object v6

    new-instance v8, Lqg3/f;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    invoke-virtual/range {v2 .. v8}, Lu82/g;->a(Ljava/lang/String;Lud3/l0;Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;Lpg3/f;)Lpg3/y0;

    move-result-object p0

    return-object p0
.end method

.method private static final m2(Lxf3/c;Luf3/a;)Lcom/whoop/data/datastore/EmailDataStoreHelper;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/whoop/data/datastore/EmailDataStoreHelper;

    const-class v0, La6/g;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La6/g;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lcom/whoop/data/datastore/EmailDataStoreHelper;-><init>(La6/g;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public static synthetic n(Lxf3/c;Luf3/a;)Lod1/b;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->F1(Lxf3/c;Luf3/a;)Lod1/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n0(Lxf3/c;Luf3/a;)Lj92/q;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->u2(Lxf3/c;Luf3/a;)Lj92/q;

    move-result-object p0

    return-object p0
.end method

.method private static final n1(Lxf3/c;Luf3/a;)Lrg3/a;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lor2/i0;->d()Lcom/google/gson/Gson;

    move-result-object p0

    invoke-static {p0}, Lrg3/a;->a(Lcom/google/gson/Gson;)Lrg3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final n2(Lxf3/c;Luf3/a;)Lda2/a;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lda2/a;

    const-class v0, La6/g;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La6/g;

    const/4 v0, 0x2

    invoke-direct {p1, p0, v1, v0, v1}, Lda2/a;-><init>(La6/g;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method public static synthetic o(Lxf3/c;Luf3/a;)Ll92/a;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->R0(Lxf3/c;Luf3/a;)Ll92/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o0(Lxf3/c;Luf3/a;)Lj92/l;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->O0(Lxf3/c;Luf3/a;)Lj92/l;

    move-result-object p0

    return-object p0
.end method

.method private static final o1(Lxf3/c;Luf3/a;)Lrg3/a;
    .locals 3

    const-string v0, "$this$single"

    const-string v1, "it"

    invoke-static {p0, v0, p1, v1}, Lih0/d0;->g(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;)Lcom/google/gson/GsonBuilder;

    move-result-object p1

    new-instance v0, Lcom/whoop/data/serialization/DateTimeSerializer;

    const-class v1, Lzr2/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzr2/a;

    invoke-direct {v0, p0}, Lcom/whoop/data/serialization/DateTimeSerializer;-><init>(Lzr2/a;)V

    const-class p0, Lorg/joda/time/DateTime;

    invoke-virtual {p1, p0, v0}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object p0

    new-instance p1, Lcom/whoop/data/serialization/DateTimeRangeSerializer;

    invoke-direct {p1}, Lcom/whoop/data/serialization/DateTimeRangeSerializer;-><init>()V

    const-class v0, Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    invoke-virtual {p0, v0, p1}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object p0

    const-string p1, "registerTypeAdapter(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lw82/a;->a(Lcom/google/gson/GsonBuilder;)Lcom/google/gson/GsonBuilder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object p0

    invoke-static {p0}, Lrg3/a;->a(Lcom/google/gson/Gson;)Lrg3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final o2(Lxf3/c;Luf3/a;)Lj92/g;
    .locals 9

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object v2

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Ltm0/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ltm0/a;

    const-class v0, Li92/d;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Li92/d;

    new-instance v1, Lj92/g;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lj92/g;-><init>(Lad3/c;Li92/d;Ltm0/a;Lj92/t;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic p(Lxf3/c;Luf3/a;)Lpg3/y0;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->m1(Lxf3/c;Luf3/a;)Lpg3/y0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p0(Lxf3/c;Luf3/a;)Lcom/whoop/util/avatar/AvatarApi;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->j2(Lxf3/c;Luf3/a;)Lcom/whoop/util/avatar/AvatarApi;

    move-result-object p0

    return-object p0
.end method

.method private static final p1(Lxf3/c;Luf3/a;)Li92/c;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Li92/c;

    const-class v0, La6/g;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, La6/g;

    const/4 v0, 0x1

    invoke-direct {p1, v1, p0, v0, v1}, Li92/c;-><init>(Lor2/x1;La6/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1
.end method

.method private static final p2(Lxf3/c;Luf3/a;)Lq92/e;
    .locals 7

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lq92/e;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, La6/g;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La6/g;

    const-class v3, Lbc3/c0;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lbc3/c0;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Lq92/e;-><init>(La6/g;Lbc3/c0;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic q(Lxf3/c;Luf3/a;)Li92/c;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->p1(Lxf3/c;Luf3/a;)Li92/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q0(Lxf3/c;Luf3/a;)Lq92/e;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->p2(Lxf3/c;Luf3/a;)Lq92/e;

    move-result-object p0

    return-object p0
.end method

.method private static final q1(Lxf3/c;Luf3/a;)Landroid/content/SharedPreferences;
    .locals 2

    const-string v0, "$this$factory"

    const-string v1, "it"

    invoke-static {p0, v0, p1, v1, p0}, Lb9/y;->e(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Lxf3/c;)Landroid/content/Context;

    move-result-object p0

    const-string p1, "prefs-permission-status-decider"

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p0

    return-object p0
.end method

.method private static final q2(Lxf3/c;Luf3/a;)Lcom/whoop/service/timezone/a;
    .locals 10

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/service/timezone/a;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/service/network/UsersPreferenceApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/service/network/UsersPreferenceApi;

    const-class v3, Lda2/a;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lda2/a;

    new-instance v4, Lvf3/c;

    const-string v5, "workManagerInstance"

    invoke-direct {v4, v5}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v5, Lic/p0;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lic/p0;

    new-instance v5, Lao1/h;

    const/16 v6, 0x19

    invoke-direct {v5, p0, v6}, Lao1/h;-><init>(Lxf3/c;I)V

    const-class v6, Lbc3/c0;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lbc3/c0;

    const/16 v8, 0x20

    const/4 v9, 0x0

    const/4 v7, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v9}, Lcom/whoop/service/timezone/a;-><init>(Lcom/whoop/service/network/UsersPreferenceApi;Lda2/a;Lic/p0;Lc93/a;Lbc3/c0;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static synthetic r(Lxf3/c;Luf3/a;)Lca2/e;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->J1(Lxf3/c;Luf3/a;)Lca2/e;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r0(Lxf3/c;Luf3/a;)Lcom/whoop/service/timezone/a;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->q2(Lxf3/c;Luf3/a;)Lcom/whoop/service/timezone/a;

    move-result-object p0

    return-object p0
.end method

.method private static final r1(Lxf3/c;Luf3/a;)Lfi0/e;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lfi0/e;

    new-instance v0, Lvf3/c;

    const-string v1, "shared-refs-perm-status-decider"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Landroid/content/SharedPreferences;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/SharedPreferences;

    const-class v2, Lin2/d;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lin2/d;

    invoke-interface {v1}, Lin2/d;->b()Lq83/j;

    move-result-object v1

    invoke-static {p0}, Lpf/c;->i(Lxf3/c;)Landroid/content/Context;

    move-result-object p0

    invoke-static {p0}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object p0

    const-string v2, "from(...)"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v0, v1, p0}, Lfi0/e;-><init>(Landroid/content/SharedPreferences;Lq83/j;Landroidx/core/app/NotificationManagerCompat;)V

    return-object p1
.end method

.method private static final r2(Lxf3/c;)Z
    .locals 0

    invoke-static {p0}, Lpf/c;->h(Lxf3/c;)Landroid/app/Application;

    move-result-object p0

    invoke-static {p0}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    move-result p0

    return p0
.end method

.method public static synthetic s(Lxf3/c;Luf3/a;)Lz82/i;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->S1(Lxf3/c;Luf3/a;)Lz82/i;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s0(Lxf3/c;Luf3/a;)Laa2/h;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->Z1(Lxf3/c;Luf3/a;)Laa2/h;

    move-result-object p0

    return-object p0
.end method

.method private static final s1(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/FeatureFlagRepository;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class p1, Lcom/whoop/data/repositories/FeatureFlagRepository;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/FeatureFlagRepository;

    return-object p0
.end method

.method private static final s2(Lxf3/c;Luf3/a;)Lod1/y;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lod1/y;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lbc3/c0;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbc3/c0;

    const-class v3, Lpd1/a;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpd1/a;

    invoke-direct {p1, v1, p0}, Lod1/y;-><init>(Lbc3/c0;Lpd1/a;)V

    return-object p1
.end method

.method public static synthetic t(Lxf3/c;Luf3/a;)Lpr2/b;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->k2(Lxf3/c;Luf3/a;)Lpr2/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t0(Lxf3/c;Luf3/a;)Lor2/e;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->f2(Lxf3/c;Luf3/a;)Lor2/e;

    move-result-object p0

    return-object p0
.end method

.method private static final t1(Lxf3/c;Luf3/a;)Lod1/v;
    .locals 4

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lod1/v;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lz92/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lz92/a;

    const-class v3, Lod1/j;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lod1/j;

    invoke-direct {p1, v1, p0}, Lod1/v;-><init>(Lz92/a;Lod1/j;)V

    return-object p1
.end method

.method private static final t2(Lxf3/c;Luf3/a;)Li92/d;
    .locals 3

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Li92/d;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lnd1/i$o;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Lnd1/i$o;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p0

    invoke-direct {p1, p0}, Li92/d;-><init>(Ll83/h;)V

    return-object p1
.end method

.method public static synthetic u(Lxf3/c;Luf3/a;)Lpg3/y0;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->i1(Lxf3/c;Luf3/a;)Lpg3/y0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u0(Lxf3/c;Luf3/a;)Lud3/l0;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->L0(Lxf3/c;Luf3/a;)Lud3/l0;

    move-result-object p0

    return-object p0
.end method

.method private static final u1(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/ArabicLanguageEnabledChecker;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/whoop/data/repositories/ArabicLanguageEnabledChecker;

    const-class v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-direct {p1, p0}, Lcom/whoop/data/repositories/ArabicLanguageEnabledChecker;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-object p1
.end method

.method private static final u2(Lxf3/c;Luf3/a;)Lj92/q;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lj92/q;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lnd1/i$p;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Lnd1/i$p;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const-class v1, Lbc3/c0;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbc3/c0;

    sget-object v1, Ltr2/n;->a:Ltr2/n$a;

    const-string v2, "ResponseMetricsLoggerInterceptor"

    invoke-virtual {v1, v2}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v1

    invoke-direct {p1, v0, p0, v1}, Lj92/q;-><init>(Ll83/h;Lbc3/c0;Ltr2/n;)V

    return-object p1
.end method

.method public static synthetic v()Luf3/a;
    .locals 1

    invoke-static {}, Lnd1/i;->d1()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic v0(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->w1(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;

    move-result-object p0

    return-object p0
.end method

.method private static final v1(Lxf3/c;Luf3/a;)Lme3/c;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Li92/b;

    invoke-direct {p0}, Li92/b;-><init>()V

    invoke-virtual {p0}, Li92/b;->b()Lme3/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lxf3/c;Luf3/a;)Lj92/p;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->T0(Lxf3/c;Luf3/a;)Lj92/p;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w0(Lxf3/c;Luf3/a;)Lme3/c;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->v1(Lxf3/c;Luf3/a;)Lme3/c;

    move-result-object p0

    return-object p0
.end method

.method private static final w1(Lxf3/c;Luf3/a;)Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;

    invoke-direct {p0}, Lcom/whoop/data/repositories/ArabicBetaOptOutStatusStore;-><init>()V

    return-object p0
.end method

.method public static synthetic x(Lxf3/c;Luf3/a;)Lpg3/y0;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->j1(Lxf3/c;Luf3/a;)Lpg3/y0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x0(Lxf3/c;Luf3/a;)Lj92/k;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->P0(Lxf3/c;Luf3/a;)Lj92/k;

    move-result-object p0

    return-object p0
.end method

.method private static final x1(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/AuthServiceApiV2;
    .locals 13

    const-string v0, "$this$factory"

    const-string v1, "it"

    invoke-static {p0, v0, p1, v1}, Lih0/d0;->g(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;)Lcom/google/gson/GsonBuilder;

    move-result-object p1

    new-instance v0, Lcom/whoop/data/serialization/DateTimeSerializer;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lzr2/a;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzr2/a;

    invoke-direct {v0, v2}, Lcom/whoop/data/serialization/DateTimeSerializer;-><init>(Lzr2/a;)V

    const-class v2, Lorg/joda/time/DateTime;

    invoke-virtual {p1, v2, v0}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object p1

    new-instance v0, Lcom/whoop/data/serialization/DateTimeRangeSerializer;

    invoke-direct {v0}, Lcom/whoop/data/serialization/DateTimeRangeSerializer;-><init>()V

    const-class v2, Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    invoke-virtual {p1, v2, v0}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object p1

    const-string v0, "registerTypeAdapter(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lw82/a;->a(Lcom/google/gson/GsonBuilder;)Lcom/google/gson/GsonBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object v7

    const-class p1, Lu82/g;

    invoke-virtual {v1, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v3, p1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lu82/g;

    const-class p1, Lsr2/y;

    invoke-virtual {v1, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v3, p1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lsr2/y;

    invoke-virtual {p1}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object v5

    new-instance p1, Lvf3/c;

    const-string v0, "unauthenticatedOkHttpClient"

    invoke-direct {p1, v0}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v0, Lud3/l0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v3, v0, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lud3/l0;

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object v8

    sget-object p0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->KT_SERIALIZATION_AUTH_SERVICE:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-virtual {p0}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->getFlagName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    const/16 v11, 0x20

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-static/range {v4 .. v12}, Lu82/g;->b(Lu82/g;Ljava/lang/String;Lud3/l0;Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;Lpg3/f;ILjava/lang/Object;)Lpg3/y0;

    move-result-object p0

    const-class p1, Lcom/whoop/service/network/AuthServiceApiV2;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/service/network/AuthServiceApiV2;

    return-object p0
.end method

.method public static synthetic y()Luf3/a;
    .locals 1

    invoke-static {}, Lnd1/i;->a1()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic y0(Lxf3/c;Luf3/a;)Lfn2/l;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->N1(Lxf3/c;Luf3/a;)Lfn2/l;

    move-result-object p0

    return-object p0
.end method

.method private static final y1(Lxf3/c;Luf3/a;)Lcom/whoop/domain/bootstrap/BootstrapApi;
    .locals 13

    const-string v0, "$this$factory"

    const-string v1, "it"

    invoke-static {p0, v0, p1, v1}, Lih0/d0;->g(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;)Lcom/google/gson/GsonBuilder;

    move-result-object p1

    new-instance v0, Lcom/whoop/data/serialization/DateTimeSerializer;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lzr2/a;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lzr2/a;

    invoke-direct {v0, v2}, Lcom/whoop/data/serialization/DateTimeSerializer;-><init>(Lzr2/a;)V

    const-class v2, Lorg/joda/time/DateTime;

    invoke-virtual {p1, v2, v0}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object p1

    new-instance v0, Lcom/whoop/data/serialization/DateTimeRangeSerializer;

    invoke-direct {v0}, Lcom/whoop/data/serialization/DateTimeRangeSerializer;-><init>()V

    const-class v2, Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    invoke-virtual {p1, v2, v0}, Lcom/google/gson/GsonBuilder;->registerTypeAdapter(Ljava/lang/reflect/Type;Ljava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object p1

    const-string v0, "registerTypeAdapter(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lw82/a;->a(Lcom/google/gson/GsonBuilder;)Lcom/google/gson/GsonBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object v7

    const-class p1, Lu82/g;

    invoke-virtual {v1, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v3, p1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lu82/g;

    const-class p1, Lsr2/y;

    invoke-virtual {v1, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v3, p1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lsr2/y;

    invoke-virtual {p1}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object v5

    new-instance p1, Lvf3/c;

    const-string v0, "unauthenticatedOkHttpClient"

    invoke-direct {p1, v0}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v0, Lud3/l0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v3, v0, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Lud3/l0;

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object v8

    sget-object p0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->KT_SERIALIZATION_BOOTSTRAP_API:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-virtual {p0}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->getFlagName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v9

    const/16 v11, 0x20

    const/4 v12, 0x0

    const/4 v10, 0x0

    invoke-static/range {v4 .. v12}, Lu82/g;->b(Lu82/g;Ljava/lang/String;Lud3/l0;Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;Lpg3/f;ILjava/lang/Object;)Lpg3/y0;

    move-result-object p0

    const-class p1, Lcom/whoop/domain/bootstrap/BootstrapApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/domain/bootstrap/BootstrapApi;

    return-object p0
.end method

.method public static synthetic z(Lxf3/c;Luf3/a;)Lor2/k1;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->E1(Lxf3/c;Luf3/a;)Lor2/k1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z0(Lxf3/c;Luf3/a;)Lv92/b;
    .locals 0

    invoke-static {p0, p1}, Lnd1/i;->Y1(Lxf3/c;Luf3/a;)Lv92/b;

    move-result-object p0

    return-object p0
.end method

.method private static final z1(Lxf3/c;Luf3/a;)Lpd1/a;
    .locals 9

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lpd1/a;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/domain/bootstrap/BootstrapApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/domain/bootstrap/BootstrapApi;

    const-class v3, Lrr2/c;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lrr2/c;

    const-class v4, Ly92/a;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly92/a;

    const-class v5, Lz92/d;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lz92/d;

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v8}, Lpd1/a;-><init>(Lcom/whoop/domain/bootstrap/BootstrapApi;Lrr2/c;Ly92/a;Lz92/d;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Lnd1/i;->K0(Ltf3/a;)Ll83/a0;

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

    iget-object v0, p0, Lnd1/i;->a:Ljava/util/List;

    return-object v0
.end method

.method public bridge getKey()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lnd1/j;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
