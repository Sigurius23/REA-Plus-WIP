.class public final Lsr2/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnd1/j;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lsr2/n;",
        "Lnd1/j;",
        "<init>",
        "()V",
        "Ltf3/a;",
        "define",
        "()Ltf3/a;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic A(Lxf3/c;Luf3/a;)Lor2/h1;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->Z(Lxf3/c;Luf3/a;)Lor2/h1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B()Luf3/a;
    .locals 1

    invoke-static {}, Lsr2/n;->c0()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic C(Lxf3/c;Luf3/a;)Le50/a;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->M(Lxf3/c;Luf3/a;)Le50/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lxf3/c;Luf3/a;)Lcq0/b;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->O(Lxf3/c;Luf3/a;)Lcq0/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E(Lxf3/c;Luf3/a;)Lcom/whoop/data/onboarding/OnboardingStatusApi;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->i0(Lxf3/c;Luf3/a;)Lcom/whoop/data/onboarding/OnboardingStatusApi;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/LegacyTeamServiceApi;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->p0(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/LegacyTeamServiceApi;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(Lxf3/c;Luf3/a;)Lcom/whoop/community/data/network/ChatApi;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->b0(Lxf3/c;Luf3/a;)Lcom/whoop/community/data/network/ChatApi;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Lxf3/c;Luf3/a;)Lcom/whoop/data/remote/api/FileDownloaderApi;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->v0(Lxf3/c;Luf3/a;)Lcom/whoop/data/remote/api/FileDownloaderApi;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I(Lxf3/c;Luf3/a;)Lpg3/y0;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->r0(Lxf3/c;Luf3/a;)Lpg3/y0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/MembershipV2Api;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->u0(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/MembershipV2Api;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/MembershipV0Api;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->l0(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/MembershipV0Api;

    move-result-object p0

    return-object p0
.end method

.method private static final L(Ltf3/a;)Ll83/a0;
    .locals 12

    const-string v0, "$this$module"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lsr2/h;

    const/16 v0, 0x1a

    invoke-direct {v5, v0}, Lsr2/h;-><init>(I)V

    new-instance v1, Lqf3/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Le50/a;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    sget-object v7, Lwf3/a;->e:Lvf3/c;

    const/4 v4, 0x0

    const/4 v11, 0x1

    move-object v2, v7

    move v6, v11

    invoke-direct/range {v1 .. v6}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v3, v4, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v1}, Lrf3/b;-><init>(Lqf3/b;)V

    const/4 v1, 0x0

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsr2/h;

    const/16 v2, 0x1c

    invoke-direct {v10, v2}, Lsr2/h;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lcom/whoop/service/network/MembershipApi;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsr2/m;

    const/4 v2, 0x6

    invoke-direct {v10, v2}, Lsr2/m;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lcom/whoop/service/network/UsersApi;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsr2/m;

    const/16 v2, 0x8

    invoke-direct {v10, v2}, Lsr2/m;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lcom/whoop/service/network/CommunityApi;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsr2/m;

    const/16 v2, 0x9

    invoke-direct {v10, v2}, Lsr2/m;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lcom/whoop/service/network/LegacyTeamServiceApi;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "retrofitWithRxJava"

    invoke-static {v6, p0, v2, v1, v3}, Lih0/d0;->t(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v9

    new-instance v10, Lsr2/m;

    const/16 v2, 0xa

    invoke-direct {v10, v2}, Lsr2/m;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lpg3/y0;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsr2/m;

    const/16 v2, 0xb

    invoke-direct {v10, v2}, Lsr2/m;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lcom/whoop/service/network/ProfileApiService;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsr2/m;

    const/16 v2, 0xc

    invoke-direct {v10, v2}, Lsr2/m;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lcom/whoop/service/network/MembershipV2Api;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsr2/m;

    const/16 v2, 0xd

    invoke-direct {v10, v2}, Lsr2/m;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lcom/whoop/data/remote/api/FileDownloaderApi;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsr2/m;

    const/16 v2, 0xe

    invoke-direct {v10, v2}, Lsr2/m;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lcom/whoop/data/remote/RemoteDataSource;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsr2/m;

    const/4 v2, 0x7

    invoke-direct {v10, v2}, Lsr2/m;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lcq0/b;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsr2/m;

    const/16 v2, 0xf

    invoke-direct {v10, v2}, Lsr2/m;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Li92/e;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsr2/m;

    const/16 v2, 0x10

    invoke-direct {v10, v2}, Lsr2/m;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lcom/whoop/service/network/RmaServiceApi;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsr2/m;

    const/16 v2, 0x11

    invoke-direct {v10, v2}, Lsr2/m;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lcom/whoop/service/network/CycleMetadataApi;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsr2/m;

    const/16 v2, 0x12

    invoke-direct {v10, v2}, Lsr2/m;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lcom/whoop/service/network/FeatureFlagsApi;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/d;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsr2/m;

    const/16 v2, 0x13

    invoke-direct {v10, v2}, Lsr2/m;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lcom/whoop/service/network/ConfigurationApi;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v2, v11

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsr2/m;

    const/16 v3, 0x14

    invoke-direct {v10, v3}, Lsr2/m;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v3, Lcom/whoop/service/network/ActivityServiceApi;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v11, 0x2

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lrf3/a;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v3, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsr2/m;

    const/16 v3, 0x15

    invoke-direct {v10, v3}, Lsr2/m;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v3, Lcom/whoop/service/network/UsersPreferenceApi;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    move v3, v11

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lrf3/a;

    invoke-direct {v5, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v4, v5, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsr2/m;

    const/16 v4, 0x16

    invoke-direct {v10, v4}, Lsr2/m;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v4, Lin2/h;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    move v11, v2

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v4, Lrf3/d;

    invoke-direct {v4, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v4, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsr2/h;

    const/16 v2, 0x1b

    invoke-direct {v10, v2}, Lsr2/h;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lor2/h1;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    move v11, v3

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsr2/h;

    const/16 v2, 0x1d

    invoke-direct {v10, v2}, Lsr2/h;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lcom/whoop/community/data/network/ChatApi;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsr2/m;

    const/4 v2, 0x0

    invoke-direct {v10, v2}, Lsr2/m;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lcom/whoop/service/network/LanguageApi;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsr2/m;

    const/4 v2, 0x1

    invoke-direct {v10, v2}, Lsr2/m;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lcom/whoop/coaching/sleepcoach/data/network/api/SleepCoachOnboardingApi;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsr2/m;

    const/4 v2, 0x2

    invoke-direct {v10, v2}, Lsr2/m;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lcom/whoop/service/network/NotificationApi;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsr2/m;

    const/4 v2, 0x3

    invoke-direct {v10, v2}, Lsr2/m;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lcom/whoop/data/onboarding/OnboardingStatusApi;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "coilInterceptor"

    invoke-static {v6, p0, v2, v1, v3}, Lm4/a;->r(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v9

    new-instance v10, Lsr2/m;

    const/4 v2, 0x4

    invoke-direct {v10, v2}, Lsr2/m;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lhh/i;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lrf3/a;

    invoke-direct {v3, v6}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v2, v3, v1}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lsr2/m;

    const/4 v2, 0x5

    invoke-direct {v10, v2}, Lsr2/m;-><init>(I)V

    new-instance v6, Lqf3/b;

    const-class v2, Lcom/whoop/service/network/MembershipV0Api;

    invoke-virtual {v0, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v8, v9, v7}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, p0, v0, v1}, Lm4/a;->z(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lxf3/c;Luf3/a;)Le50/a;
    .locals 4

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Le50/a;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lsr2/y;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lsr2/y;

    const-class v3, Lu82/e;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lu82/e;

    invoke-static {}, Lor2/i0;->d()Lcom/google/gson/Gson;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/Gson;->newBuilder()Lcom/google/gson/GsonBuilder;

    move-result-object v0

    const-string v2, "newBuilder(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lw82/a;->a(Lcom/google/gson/GsonBuilder;)Lcom/google/gson/GsonBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object v0

    const-string v2, "create(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object v2

    const-string v3, "kt-serialization-membership-v2"

    invoke-static {v3}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v3

    invoke-virtual {p0, v0, v2, v3}, Lu82/e;->a(Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;)Lu82/d;

    move-result-object p0

    invoke-direct {p1, v1, p0}, Le50/a;-><init>(Lsr2/y;Lpg3/m;)V

    return-object p1
.end method

.method private static final N(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/MembershipApi;
    .locals 4

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v2, "kt-serialization-membership-api"

    invoke-interface {v0, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lpg3/x0;

    invoke-direct {v0}, Lpg3/x0;-><init>()V

    new-instance v2, Lvf3/c;

    const-string v3, "defaultOkHttpClient"

    invoke-direct {v2, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Lud3/l0;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v1, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lud3/l0;

    invoke-virtual {v0, v2}, Lpg3/x0;->e(Lud3/l0;)V

    const-class v2, Lsr2/y;

    invoke-virtual {p1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lsr2/y;

    invoke-virtual {p0}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "/membership/"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lpg3/x0;->c(Ljava/lang/String;)V

    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object p0

    invoke-static {p0}, Lu82/f;->a(Lad3/c;)Lpg3/m;

    move-result-object p0

    invoke-virtual {v0, p0}, Lpg3/x0;->b(Lpg3/m;)V

    new-instance p0, Lqg3/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, p0}, Lpg3/x0;->a(Lpg3/f;)V

    invoke-virtual {v0}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object p0

    const-class p1, Lcom/whoop/service/network/MembershipApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/service/network/MembershipApi;

    goto :goto_0

    :cond_0
    const-class v0, Le50/a;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Le50/a;

    invoke-virtual {p0}, Le50/a;->e()Lcom/whoop/service/network/MembershipApi;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p0
.end method

.method private static final O(Lxf3/c;Luf3/a;)Lcq0/b;
    .locals 2

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcq0/b;

    const-class v0, Lcom/whoop/data/remote/RemoteDataSource;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/remote/RemoteDataSource;

    invoke-direct {p1, p0}, Lcq0/b;-><init>(Lcom/whoop/data/remote/RemoteDataSource;)V

    return-object p1
.end method

.method private static final P(Lxf3/c;Luf3/a;)Li92/e;
    .locals 3

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Li92/g;

    invoke-static {p0}, Lpf/c;->i(Lxf3/c;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Landroid/net/ConnectivityManager;

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    check-cast v0, Landroid/net/ConnectivityManager;

    const-class v1, Lbc3/c0;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lbc3/c0;

    invoke-direct {p1, v0, p0}, Li92/g;-><init>(Landroid/net/ConnectivityManager;Lbc3/c0;)V

    return-object p1

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Required value was null."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final Q(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/RmaServiceApi;
    .locals 3

    const-string v0, "it"

    const-string v1, "retrofitWithKtxSerialization"

    const-string v2, "$this$single"

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

    const-class p1, Lcom/whoop/service/network/RmaServiceApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/service/network/RmaServiceApi;

    return-object p0
.end method

.method private static final R(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/CycleMetadataApi;
    .locals 3

    const-string v0, "it"

    const-string v1, "featureFlaggableDefaultRetrofit"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    new-instance v0, Lsl0/a1;

    const/16 v1, 0x1b

    invoke-direct {v0, v1}, Lsl0/a1;-><init>(I)V

    const-class v1, Lpg3/y0;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    const-class p1, Lcom/whoop/service/network/CycleMetadataApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/service/network/CycleMetadataApi;

    return-object p0
.end method

.method private static final S()Luf3/a;
    .locals 1

    const-string v0, "kt-serialization-cycle-metadata"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final T(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/FeatureFlagsApi;
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

    const-class v1, Lj92/g;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/g0;

    invoke-virtual {p1, v1}, Lud3/k0;->a(Lud3/g0;)V

    const-class v1, Lj92/k;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lud3/c;

    const-string v3, "authenticator"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p1, Lud3/k0;->h:Lud3/c;

    new-instance v1, Lpg3/x0;

    invoke-direct {v1}, Lpg3/x0;-><init>()V

    new-instance v3, Lud3/l0;

    invoke-direct {v3, p1}, Lud3/l0;-><init>(Lud3/k0;)V

    iput-object v3, v1, Lpg3/x0;->a:Lud3/i;

    invoke-static {}, Lu82/k;->d()Lpg3/m;

    move-result-object p1

    invoke-virtual {v1, p1}, Lpg3/x0;->b(Lpg3/m;)V

    const-class p1, Lsr2/y;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lsr2/y;

    invoke-virtual {p0}, Lsr2/y;->a()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Lpg3/x0;->c(Ljava/lang/String;)V

    invoke-virtual {v1}, Lpg3/x0;->d()Lpg3/y0;

    move-result-object p0

    const-class p1, Lcom/whoop/service/network/FeatureFlagsApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/service/network/FeatureFlagsApi;

    return-object p0
.end method

.method private static final U(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/ConfigurationApi;
    .locals 3

    const-string v0, "it"

    const-string v1, "retrofitWithKtxSerialization"

    const-string v2, "$this$single"

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

    const-class p1, Lcom/whoop/service/network/ConfigurationApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/service/network/ConfigurationApi;

    return-object p0
.end method

.method private static final V(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/ActivityServiceApi;
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

    const-class p1, Lcom/whoop/service/network/ActivityServiceApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "create(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/whoop/service/network/ActivityServiceApi;

    return-object p0
.end method

.method private static final W(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/UsersPreferenceApi;
    .locals 3

    const-string v0, "it"

    const-string v1, "featureFlaggableRetrofitWithRxJava"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    new-instance v0, Ls52/d;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Ls52/d;-><init>(I)V

    const-class v1, Lpg3/y0;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    const-class p1, Lcom/whoop/service/network/UsersPreferenceApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "create(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/whoop/service/network/UsersPreferenceApi;

    return-object p0
.end method

.method private static final X()Luf3/a;
    .locals 1

    const-string v0, "kt-serialization-users-preference"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final Y(Lxf3/c;Luf3/a;)Lin2/h;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lin2/b;->a:Lin2/b;

    return-object p0
.end method

.method private static final Z(Lxf3/c;Luf3/a;)Lor2/h1;
    .locals 1

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lor2/h1;

    const-string p1, "5.473.0"

    const v0, 0x96ebe

    invoke-direct {p0, p1, v0}, Lor2/h1;-><init>(Ljava/lang/String;I)V

    return-object p0
.end method

.method public static synthetic a(Lxf3/c;Luf3/a;)Lcom/whoop/coaching/sleepcoach/data/network/api/SleepCoachOnboardingApi;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->f0(Lxf3/c;Luf3/a;)Lcom/whoop/coaching/sleepcoach/data/network/api/SleepCoachOnboardingApi;

    move-result-object p0

    return-object p0
.end method

.method private static final a0(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/UsersApi;
    .locals 3

    const-string v0, "it"

    const-string v1, "retrofitWithKtxSerialization"

    const-string v2, "$this$single"

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

    const-class p1, Lcom/whoop/service/network/UsersApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "create(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/whoop/service/network/UsersApi;

    return-object p0
.end method

.method public static synthetic b(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/ProfileApiService;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->s0(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/ProfileApiService;

    move-result-object p0

    return-object p0
.end method

.method private static final b0(Lxf3/c;Luf3/a;)Lcom/whoop/community/data/network/ChatApi;
    .locals 3

    const-string v0, "it"

    const-string v1, "featureFlaggableLegacyDefaultRetrofit"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    new-instance v0, Ls52/d;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Ls52/d;-><init>(I)V

    const-class v1, Lpg3/y0;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    const-class p1, Lcom/whoop/community/data/network/ChatApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/community/data/network/ChatApi;

    return-object p0
.end method

.method public static synthetic c()Luf3/a;
    .locals 1

    invoke-static {}, Lsr2/n;->X()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final c0()Luf3/a;
    .locals 1

    const-string v0, "kt-serialization-community"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Luf3/a;
    .locals 1

    invoke-static {}, Lsr2/n;->q0()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final d0(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/LanguageApi;
    .locals 3

    const-string v0, "it"

    const-string v1, "featureFlaggableDefaultRetrofit"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    new-instance v0, Ls52/d;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ls52/d;-><init>(I)V

    const-class v1, Lpg3/y0;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    const-class p1, Lcom/whoop/service/network/LanguageApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/service/network/LanguageApi;

    return-object p0
.end method

.method public static synthetic e()Luf3/a;
    .locals 1

    invoke-static {}, Lsr2/n;->e0()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final e0()Luf3/a;
    .locals 1

    const-string v0, "kt-serialization-language"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f(Lxf3/c;Luf3/a;)Lhh/i;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->k0(Lxf3/c;Luf3/a;)Lhh/i;

    move-result-object p0

    return-object p0
.end method

.method private static final f0(Lxf3/c;Luf3/a;)Lcom/whoop/coaching/sleepcoach/data/network/api/SleepCoachOnboardingApi;
    .locals 3

    const-string v0, "it"

    const-string v1, "featureFlaggableLegacyDefaultRetrofit"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    new-instance v0, Lsl0/a1;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lsl0/a1;-><init>(I)V

    const-class v1, Lpg3/y0;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    const-class p1, Lcom/whoop/coaching/sleepcoach/data/network/api/SleepCoachOnboardingApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/coaching/sleepcoach/data/network/api/SleepCoachOnboardingApi;

    return-object p0
.end method

.method public static synthetic g()Luf3/a;
    .locals 1

    invoke-static {}, Lsr2/n;->j0()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final g0()Luf3/a;
    .locals 1

    const-string v0, "kt-serialization-sleep-coach-onboarding"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic h()Luf3/a;
    .locals 1

    invoke-static {}, Lsr2/n;->o0()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final h0(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/NotificationApi;
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

    const-class p1, Lcom/whoop/service/network/NotificationApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/service/network/NotificationApi;

    return-object p0
.end method

.method public static synthetic i(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/CycleMetadataApi;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->R(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/CycleMetadataApi;

    move-result-object p0

    return-object p0
.end method

.method private static final i0(Lxf3/c;Luf3/a;)Lcom/whoop/data/onboarding/OnboardingStatusApi;
    .locals 3

    const-string v0, "it"

    const-string v1, "featureFlaggableLegacyDefaultRetrofit"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    new-instance v0, Ls52/d;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ls52/d;-><init>(I)V

    const-class v1, Lpg3/y0;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    const-class p1, Lcom/whoop/data/onboarding/OnboardingStatusApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/onboarding/OnboardingStatusApi;

    return-object p0
.end method

.method public static synthetic j(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/RmaServiceApi;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->Q(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/RmaServiceApi;

    move-result-object p0

    return-object p0
.end method

.method private static final j0()Luf3/a;
    .locals 1

    const-string v0, "kt-serialization-onboarding-status"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic k(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/ActivityServiceApi;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->V(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/ActivityServiceApi;

    move-result-object p0

    return-object p0
.end method

.method private static final k0(Lxf3/c;Luf3/a;)Lhh/i;
    .locals 3

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/data/local/prefs/PreferenceHelper;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/local/prefs/PreferenceHelper;

    const-class v2, Lcom/whoop/data/repositories/DefaultLanguageDecider;

    invoke-virtual {p1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v1, p1, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/DefaultLanguageDecider;

    new-instance p1, Lsr2/n$a;

    invoke-direct {p1, v0, p0}, Lsr2/n$a;-><init>(Lcom/whoop/data/local/prefs/PreferenceHelper;Lcom/whoop/data/repositories/DefaultLanguageDecider;)V

    return-object p1
.end method

.method public static synthetic l(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/MembershipApi;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->N(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/MembershipApi;

    move-result-object p0

    return-object p0
.end method

.method private static final l0(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/MembershipV0Api;
    .locals 3

    const-string v0, "it"

    const-string v1, "featureFlaggableDefaultRetrofit"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    new-instance v0, Lsl0/a1;

    const/16 v1, 0x1c

    invoke-direct {v0, v1}, Lsl0/a1;-><init>(I)V

    const-class v1, Lpg3/y0;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    const-class p1, Lcom/whoop/service/network/MembershipV0Api;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "create(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/whoop/service/network/MembershipV0Api;

    return-object p0
.end method

.method public static synthetic m(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/UsersApi;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->a0(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/UsersApi;

    move-result-object p0

    return-object p0
.end method

.method private static final m0()Luf3/a;
    .locals 1

    sget-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->KT_SERIALIZATION_MEMBERSHIP_V0:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-virtual {v0}, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->getFlagName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic n(Lxf3/c;Luf3/a;)Lcom/whoop/data/remote/RemoteDataSource;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->w0(Lxf3/c;Luf3/a;)Lcom/whoop/data/remote/RemoteDataSource;

    move-result-object p0

    return-object p0
.end method

.method private static final n0(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/CommunityApi;
    .locals 3

    const-string v0, "it"

    const-string v1, "featureFlaggableRetrofitWithRxJava"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    new-instance v0, Ls52/d;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Ls52/d;-><init>(I)V

    const-class v1, Lpg3/y0;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    const-class p1, Lcom/whoop/service/network/CommunityApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "create(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/whoop/service/network/CommunityApi;

    return-object p0
.end method

.method public static synthetic o(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/UsersPreferenceApi;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->W(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/UsersPreferenceApi;

    move-result-object p0

    return-object p0
.end method

.method private static final o0()Luf3/a;
    .locals 1

    const-string v0, "kt-serialization-community"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic p()Luf3/a;
    .locals 1

    invoke-static {}, Lsr2/n;->t0()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final p0(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/LegacyTeamServiceApi;
    .locals 3

    const-string v0, "it"

    const-string v1, "featureFlaggableRetrofitWithRxJava"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    new-instance v0, Ls52/d;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Ls52/d;-><init>(I)V

    const-class v1, Lpg3/y0;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    const-class p1, Lcom/whoop/service/network/LegacyTeamServiceApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "create(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/whoop/service/network/LegacyTeamServiceApi;

    return-object p0
.end method

.method public static synthetic q()Luf3/a;
    .locals 1

    invoke-static {}, Lsr2/n;->S()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final q0()Luf3/a;
    .locals 1

    const-string v0, "kt-serialization-legacy-team-service"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic r(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/LanguageApi;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->d0(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/LanguageApi;

    move-result-object p0

    return-object p0
.end method

.method private static final r0(Lxf3/c;Luf3/a;)Lpg3/y0;
    .locals 3

    const-string v0, "it"

    const-string v1, "legacyDefaultRetrofit"

    const-string v2, "$this$single"

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

    return-object p0
.end method

.method public static synthetic s(Lxf3/c;Luf3/a;)Lin2/h;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->Y(Lxf3/c;Luf3/a;)Lin2/h;

    move-result-object p0

    return-object p0
.end method

.method private static final s0(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/ProfileApiService;
    .locals 3

    const-string v0, "it"

    const-string v1, "featureFlaggableLegacyDefaultRetrofit"

    const-string v2, "$this$single"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    new-instance v0, Ls52/d;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Ls52/d;-><init>(I)V

    const-class v1, Lpg3/y0;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    const-class p1, Lcom/whoop/service/network/ProfileApiService;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "create(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/whoop/service/network/ProfileApiService;

    return-object p0
.end method

.method public static synthetic t()Luf3/a;
    .locals 1

    invoke-static {}, Lsr2/n;->g0()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final t0()Luf3/a;
    .locals 1

    const-string v0, "kt-serialization-profile-api-service"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic u(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/NotificationApi;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->h0(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/NotificationApi;

    move-result-object p0

    return-object p0
.end method

.method private static final u0(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/MembershipV2Api;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class p1, Le50/a;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Le50/a;

    invoke-virtual {p0}, Le50/a;->f()Lcom/whoop/service/network/MembershipV2Api;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v(Lxf3/c;Luf3/a;)Li92/e;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->P(Lxf3/c;Luf3/a;)Li92/e;

    move-result-object p0

    return-object p0
.end method

.method private static final v0(Lxf3/c;Luf3/a;)Lcom/whoop/data/remote/api/FileDownloaderApi;
    .locals 1

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class p1, Le50/a;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Le50/a;

    invoke-virtual {p0}, Le50/a;->a()Lcom/whoop/data/remote/api/FileDownloaderApi;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/FeatureFlagsApi;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->T(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/FeatureFlagsApi;

    move-result-object p0

    return-object p0
.end method

.method private static final w0(Lxf3/c;Luf3/a;)Lcom/whoop/data/remote/RemoteDataSource;
    .locals 13

    const-string v0, "$this$single"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/data/remote/RemoteDataSourceImpl;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/service/network/CommunityApi;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/service/network/CommunityApi;

    const-class v3, Lcom/whoop/community/data/network/CommunityServiceApi;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/community/data/network/CommunityServiceApi;

    const-class v4, Lcom/whoop/consolePackets/data/api/ConsolePacketsApi;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/consolePackets/data/api/ConsolePacketsApi;

    const-class v5, Lcom/whoop/service/network/LegacyTeamServiceApi;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {p0, v2, v5, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/service/network/LegacyTeamServiceApi;

    const-class v6, Lcom/whoop/service/network/ProfileApiService;

    invoke-virtual {p1, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {p0, v2, v6, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/service/network/ProfileApiService;

    const-class v7, Lcom/whoop/service/network/MembershipApi;

    invoke-virtual {p1, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v7

    invoke-virtual {p0, v2, v7, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/service/network/MembershipApi;

    const-class v8, Lcom/whoop/service/network/MembershipV2Api;

    invoke-virtual {p1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-virtual {p0, v2, v8, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/service/network/MembershipV2Api;

    const-class v9, Lin2/d;

    invoke-virtual {p1, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-virtual {p0, v2, v9, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lin2/d;

    sget-object v10, Ltr2/n;->a:Ltr2/n$a;

    const-string v11, "RemoteDataSourceImpl"

    invoke-virtual {v10, v11}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v10

    const-class v11, Lrr2/c;

    invoke-virtual {p1, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v11

    invoke-virtual {p0, v2, v11, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lrr2/c;

    const-class v12, Lor2/j0;

    invoke-virtual {p1, v12}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v12, p0

    check-cast v12, Lor2/j0;

    move-object v2, v0

    invoke-direct/range {v1 .. v12}, Lcom/whoop/data/remote/RemoteDataSourceImpl;-><init>(Lcom/whoop/service/network/CommunityApi;Lcom/whoop/community/data/network/CommunityServiceApi;Lcom/whoop/consolePackets/data/api/ConsolePacketsApi;Lcom/whoop/service/network/LegacyTeamServiceApi;Lcom/whoop/service/network/ProfileApiService;Lcom/whoop/service/network/MembershipApi;Lcom/whoop/service/network/MembershipV2Api;Lin2/d;Ltr2/n;Lrr2/c;Lor2/j0;)V

    return-object v1
.end method

.method public static synthetic x(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/CommunityApi;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->n0(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/CommunityApi;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y()Luf3/a;
    .locals 1

    invoke-static {}, Lsr2/n;->m0()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic z(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/ConfigurationApi;
    .locals 0

    invoke-static {p0, p1}, Lsr2/n;->U(Lxf3/c;Luf3/a;)Lcom/whoop/service/network/ConfigurationApi;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Lsr2/n;->L(Ltf3/a;)Ll83/a0;

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
