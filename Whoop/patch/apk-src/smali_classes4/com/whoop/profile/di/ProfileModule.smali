.class public final Lcom/whoop/profile/di/ProfileModule;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnd1/j;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R \u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00078\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/profile/di/ProfileModule;",
        "Lnd1/j;",
        "<init>",
        "()V",
        "Ltf3/a;",
        "define",
        "()Ltf3/a;",
        "",
        "dependencies",
        "Ljava/util/List;",
        "getDependencies",
        "()Ljava/util/List;",
        "profile_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final dependencies:Ljava/util/List;
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

    iput-object v0, p0, Lcom/whoop/profile/di/ProfileModule;->dependencies:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Lxf3/c;Luf3/a;)Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/di/ProfileModule;->define$lambda$0$4(Lxf3/c;Luf3/a;)Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lxf3/c;Luf3/a;)Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/di/ProfileModule;->define$lambda$0$6(Lxf3/c;Luf3/a;)Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lxf3/c;Luf3/a;)Lcom/whoop/profile/domain/edit/EditProfileInteractor;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/di/ProfileModule;->define$lambda$0$8(Lxf3/c;Luf3/a;)Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lxf3/c;Luf3/a;)Ljava/util/Map;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/di/ProfileModule;->define$lambda$0$0(Lxf3/c;Luf3/a;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final define$lambda$0(Ltf3/a;)Ll83/a0;
    .locals 13

    const-string v0, "$this$module"

    const-string v1, "profile-feature-models"

    invoke-static {p0, v0, v1}, Lm4/a;->s(Ltf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object v5

    new-instance v6, Lp02/a;

    const/16 v0, 0x1d

    invoke-direct {v6, v0}, Lp02/a;-><init>(I)V

    new-instance v2, Lqf3/b;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Ljava/util/Map;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    sget-object v8, Lwf3/a;->e:Lvf3/c;

    const/4 v12, 0x2

    move-object v3, v8

    move v7, v12

    invoke-direct/range {v2 .. v7}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v4, v5, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "profile-converter-factory"

    const/4 v4, 0x0

    invoke-static {v2, p0, v1, v4, v3}, Lm4/a;->r(Lqf3/b;Ltf3/a;Ljava/lang/String;ZLjava/lang/String;)Lvf3/c;

    move-result-object v10

    new-instance v11, Lq42/a;

    const/4 v1, 0x3

    invoke-direct {v11, v1}, Lq42/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lu82/d;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v2, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    const-class v1, Lpg3/m;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const-string v3, "clazz"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v2, Lrf3/b;->a:Lqf3/b;

    iget-object v5, v3, Lqf3/b;->f:Ljava/lang/Object;

    check-cast v5, Ljava/util/Collection;

    invoke-static {v1, v5}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v5

    iput-object v5, v3, Lqf3/b;->f:Ljava/lang/Object;

    iget-object v5, v3, Lqf3/b;->c:Lvf3/a;

    iget-object v3, v3, Lqf3/b;->a:Lvf3/a;

    invoke-static {v1, v5, v3}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x1

    invoke-virtual {p0, v1, v2, v3}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v10, Lvf3/c;

    const-string v1, "profile-bff-cache-deserializer"

    invoke-direct {v10, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    new-instance v11, Lq42/a;

    const/4 v1, 0x4

    invoke-direct {v11, v1}, Lq42/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lu82/a;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v2, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lq42/a;

    const/4 v1, 0x5

    invoke-direct {v11, v1}, Lq42/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/profile/domain/ProfileInteractor;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v2, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lq42/a;

    const/4 v1, 0x6

    invoke-direct {v11, v1}, Lq42/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v2, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lq42/a;

    const/4 v1, 0x7

    invoke-direct {v11, v1}, Lq42/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/profile/navigation/ProfileActionRouter;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v2, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lp02/a;

    const/16 v1, 0x19

    invoke-direct {v11, v1}, Lp02/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v2, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lp02/a;

    const/16 v1, 0x1a

    invoke-direct {v11, v1}, Lp02/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/profile/domain/ProfileApi;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v2, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lp02/a;

    const/16 v1, 0x1b

    invoke-direct {v11, v1}, Lp02/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v2, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lp02/a;

    const/16 v1, 0x1c

    invoke-direct {v11, v1}, Lp02/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v2, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lq42/a;

    const/4 v1, 0x0

    invoke-direct {v11, v1}, Lq42/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/profile/presentation/ProfileViewModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v2, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lq42/a;

    const/4 v1, 0x1

    invoke-direct {v11, v1}, Lq42/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lrf3/a;

    invoke-direct {v2, v7}, Lrf3/b;-><init>(Lqf3/b;)V

    invoke-virtual {p0, v1, v2, v4}, Ltf3/a;->b(Ljava/lang/String;Lrf3/b;Z)V

    new-instance v11, Lq42/a;

    const/4 v1, 0x2

    invoke-direct {v11, v1}, Lq42/a;-><init>(I)V

    new-instance v7, Lqf3/b;

    const-class v1, Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v9

    invoke-direct/range {v7 .. v12}, Lqf3/b;-><init>(Lvf3/a;Lj93/d;Lvf3/c;Lc93/m;I)V

    invoke-static {v9, v10, v8}, Ljc/x;->Y(Lj93/d;Lvf3/a;Lvf3/a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v7, p0, v0, v4}, Lm4/a;->z(Lqf3/b;Ltf3/a;Ljava/lang/String;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final define$lambda$0$0(Lxf3/c;Luf3/a;)Ljava/util/Map;
    .locals 4

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class p1, Lcom/whoop/profile/domain/models/components/StreakTileModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v0, Ll83/k;

    const-string v1, "STREAK_TILE"

    invoke-direct {v0, v1, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v1, Ll83/k;

    const-string v2, "REFERRALS_TILE"

    invoke-direct {v1, v2, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/profile/domain/models/components/ContextHubTileModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    new-instance v2, Ll83/k;

    const-string v3, "CONTEXT_HUB_TILE"

    invoke-direct {v2, v3, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-class p1, Lcom/whoop/communitymoments/domain/models/MomentCardModel;

    invoke-virtual {p0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    new-instance p1, Ll83/k;

    const-string v3, "MOMENT_CARD"

    invoke-direct {p1, v3, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1, v2, p1}, [Ll83/k;

    move-result-object p0

    invoke-static {p0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final define$lambda$0$1(Lxf3/c;Luf3/a;)Lu82/d;
    .locals 11

    const-string v0, "it"

    const-string v1, "profile-feature-models"

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

    new-instance p1, Lcom/google/gson/GsonBuilder;

    invoke-direct {p1}, Lcom/google/gson/GsonBuilder;-><init>()V

    const/4 v1, 0x2

    invoke-static {p1, v4, v2, v1, v2}, Lcom/whoop/design/json/d;->f(Lcom/google/gson/GsonBuilder;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/google/gson/GsonBuilder;

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

    const-class v1, Lu82/e;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {v3, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu82/e;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-string v1, "kt-serialization-profile"

    invoke-static {v1}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-virtual {v0, p1, p0, v1}, Lu82/e;->a(Lcom/google/gson/Gson;Lad3/c;Ljava/util/Set;)Lu82/d;

    move-result-object p0

    return-object p0
.end method

.method private static final define$lambda$0$10(Lxf3/c;Luf3/a;)Lcom/whoop/profile/presentation/ProfileViewModel;
    .locals 9

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v2}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    const/4 v3, 0x1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p1, v3, v1}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    new-instance v3, Lcom/whoop/profile/presentation/ProfileViewModel;

    new-instance v1, Lcom/whoop/profile/view/g;

    const/4 v4, 0x1

    invoke-direct {v1, v2, p1, v4}, Lcom/whoop/profile/view/g;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;I)V

    const-class p1, Lcom/whoop/profile/domain/ProfileInteractor;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    const/4 v2, 0x0

    invoke-virtual {p0, v1, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lcom/whoop/profile/domain/ProfileInteractor;

    const-class p1, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;

    invoke-virtual {v0, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/whoop/profile/presentation/ProfileViewModel;-><init>(Lcom/whoop/profile/domain/ProfileInteractor;Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method

.method private static final define$lambda$0$10$0(Ljava/lang/Integer;Ljava/lang/Integer;)Luf3/a;
    .locals 0

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final define$lambda$0$11(Lxf3/c;Luf3/a;)Lcom/whoop/profile/presentation/edit/EditProfileViewModel;
    .locals 8

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    const-class v3, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;

    invoke-virtual {p1, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {p0, v2, v3, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;

    const-class v4, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v7}, Lcom/whoop/profile/presentation/edit/EditProfileViewModel;-><init>(Lcom/whoop/profile/domain/edit/EditProfileInteractor;Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;Lbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final define$lambda$0$12(Lxf3/c;Luf3/a;)Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;
    .locals 4

    const-string v0, "$this$viewModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/data/repositories/AchievementsRepository;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/data/repositories/AchievementsRepository;

    const-class v3, Lsr2/y;

    invoke-virtual {v0, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lsr2/y;

    invoke-direct {p1, v1, p0}, Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;-><init>(Lcom/whoop/data/repositories/AchievementsRepository;Lsr2/y;)V

    return-object p1
.end method

.method private static final define$lambda$0$2(Lxf3/c;Luf3/a;)Lu82/a;
    .locals 11

    const-string v0, "it"

    const-string v1, "profile-feature-models"

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

    new-instance p1, Lu82/c;

    const/16 v9, 0x1e

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v10}, Lcom/whoop/design/json/b;->e(Lxf3/c;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Liy1/c;Lrr2/c;ILjava/lang/Object;)Lad3/c;

    move-result-object p0

    new-instance v1, Lcom/google/gson/GsonBuilder;

    invoke-direct {v1}, Lcom/google/gson/GsonBuilder;-><init>()V

    const/4 v5, 0x2

    invoke-static {v1, v4, v2, v5, v2}, Lcom/whoop/design/json/d;->f(Lcom/google/gson/GsonBuilder;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/google/gson/GsonBuilder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/gson/GsonBuilder;->create()Lcom/google/gson/Gson;

    move-result-object v1

    const-string v4, "create(...)"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v4, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {v3, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v2, "kt-serialization-profile"

    invoke-static {v2}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-direct {p1, p0, v1, v0, v2}, Lu82/c;-><init>(Lad3/c;Lcom/google/gson/Gson;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljava/util/Set;)V

    return-object p1
.end method

.method private static final define$lambda$0$3(Lxf3/c;Luf3/a;)Lcom/whoop/profile/domain/ProfileInteractor;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "$this$factory"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "<destruct>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Ljava/lang/Integer;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v1, v5, v4}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object v4

    move-object v15, v4

    check-cast v15, Ljava/lang/Integer;

    const/4 v4, 0x1

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {v1, v4, v3}, Luf3/a;->a(ILj93/d;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v16, v1

    check-cast v16, Ljava/lang/Integer;

    new-instance v8, Lcom/whoop/profile/domain/ProfileInteractor;

    new-instance v1, Lon2/b;

    const/4 v3, 0x4

    invoke-direct {v1, v0, v3}, Lon2/b;-><init>(Lxf3/c;I)V

    const-class v3, Lnm0/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v3, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object v9, v1

    check-cast v9, Lnm0/e;

    const-class v1, Lu02/c;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v4, v1, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object v10, v1

    check-cast v10, Lu02/c;

    const-class v1, Lqw2/c;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v4, v1, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lqw2/c;

    const-class v1, Lwm0/a;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v4, v1, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lwm0/a;

    const-class v1, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v4, v1, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    const-class v1, Lji0/f;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v4, v1, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Lji0/f;

    const-class v1, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v4, v1, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v17, v1

    check-cast v17, Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v1, Ltr2/n;->a:Ltr2/n$a;

    const-string v3, "ProfileInteractor"

    invoke-virtual {v1, v3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v18

    new-instance v1, Lvf3/c;

    const-string v3, "profile-feature-models"

    invoke-direct {v1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v3, Ljava/util/Map;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    const/16 v6, 0x1e

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/whoop/design/json/b;->e(Lxf3/c;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Liy1/c;Lrr2/c;ILjava/lang/Object;)Lad3/c;

    move-result-object v0

    move-object v5, v8

    move-object v6, v9

    move-object v7, v10

    move-object v8, v11

    move-object v9, v12

    move-object v10, v13

    move-object v11, v14

    move-object/from16 v12, v17

    move-object/from16 v13, v18

    move-object v14, v0

    invoke-direct/range {v5 .. v16}, Lcom/whoop/profile/domain/ProfileInteractor;-><init>(Lnm0/e;Lu02/c;Lqw2/c;Lwm0/a;Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;Lji0/f;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;Lad3/c;Ljava/lang/Integer;Ljava/lang/Integer;)V

    return-object v5
.end method

.method private static final define$lambda$0$3$0(Lxf3/c;)Luf3/a;
    .locals 3

    new-instance v0, Lvf3/c;

    const-string v1, "profile-bff-cache-deserializer"

    invoke-direct {v0, v1}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v1, Lu82/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    new-instance v0, Luf3/a;

    invoke-static {p0}, Lm83/n;->Z0([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-direct {v0, p0}, Luf3/a;-><init>(Ljava/util/ArrayList;)V

    return-object v0
.end method

.method private static final define$lambda$0$4(Lxf3/c;Luf3/a;)Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "it"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string v0, "ProfileViewStateReducer"

    invoke-virtual {p1, v0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v1, p1, v0, v1}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducer;-><init>(Ljb1/a;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method

.method private static final define$lambda$0$5(Lxf3/c;Luf3/a;)Lcom/whoop/profile/navigation/ProfileActionRouter;
    .locals 10

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/whoop/profile/navigation/ProfileActionRouter;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v1, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    new-instance v3, Lvf3/c;

    const-string v4, "profile-feature-models"

    invoke-direct {v3, v4}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v4, Ljava/util/Map;

    invoke-virtual {v0, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p0, v2, v0, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Ljava/util/Map;

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v9}, Lcom/whoop/design/json/b;->e(Lxf3/c;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Liy1/c;Lrr2/c;ILjava/lang/Object;)Lad3/c;

    move-result-object p0

    invoke-direct {p1, v1, p0}, Lcom/whoop/profile/navigation/ProfileActionRouter;-><init>(Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;Lad3/c;)V

    return-object p1
.end method

.method private static final define$lambda$0$6(Lxf3/c;Luf3/a;)Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;

    const-class v0, Lfi0/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lfi0/a;

    invoke-direct {p1, p0}, Lcom/whoop/profile/analytics/ProfileAnalyticsHelper;-><init>(Lfi0/a;)V

    return-object p1
.end method

.method private static final define$lambda$0$7(Lxf3/c;Luf3/a;)Lcom/whoop/profile/domain/ProfileApi;
    .locals 3

    const-string v0, "it"

    const-string v1, "featureFlaggableDefaultRetrofit"

    const-string v2, "$this$factory"

    invoke-static {p0, v2, p1, v0, v1}, Lm4/a;->t(Lxf3/c;Ljava/lang/String;Luf3/a;Ljava/lang/String;Ljava/lang/String;)Lvf3/c;

    move-result-object p1

    new-instance v0, Lq41/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lq41/a;-><init>(I)V

    const-class v1, Lpg3/y0;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {p0, v0, v1, p1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lpg3/y0;

    const-class p1, Lcom/whoop/profile/domain/ProfileApi;

    invoke-virtual {p0, p1}, Lpg3/y0;->b(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    const-string p1, "create(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/whoop/profile/domain/ProfileApi;

    return-object p0
.end method

.method private static final define$lambda$0$7$0()Luf3/a;
    .locals 1

    const-string v0, "kt-serialization-profile"

    invoke-static {v0}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method private static final define$lambda$0$8(Lxf3/c;Luf3/a;)Lcom/whoop/profile/domain/edit/EditProfileInteractor;
    .locals 9

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/profile/domain/edit/EditProfileInteractor;

    sget-object p1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lu02/c;

    invoke-virtual {p1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu02/c;

    sget-object v3, Ltr2/n;->a:Ltr2/n$a;

    const-string v4, "EditProfileInteractor"

    invoke-virtual {v3, v4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v3

    const-class v4, Lpr2/b;

    invoke-virtual {p1, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {p0, v2, v4, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpr2/b;

    const-class v5, Lpd1/a;

    invoke-virtual {p1, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    invoke-virtual {p0, v2, p1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lpd1/a;

    const/16 v7, 0x10

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v2, v0

    invoke-direct/range {v1 .. v8}, Lcom/whoop/profile/domain/edit/EditProfileInteractor;-><init>(Lu02/c;Ltr2/n;Lpr2/b;Lpd1/a;Lw02/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final define$lambda$0$9(Lxf3/c;Luf3/a;)Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;
    .locals 2

    const-string v0, "$this$factory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;

    const-class v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    invoke-direct {p1, p0}, Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;-><init>(Lcom/whoop/data/repositories/FeatureFlagChecker;)V

    return-object p1
.end method

.method public static synthetic e()Luf3/a;
    .locals 1

    invoke-static {}, Lcom/whoop/profile/di/ProfileModule;->define$lambda$0$7$0()Luf3/a;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f(Lxf3/c;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/di/ProfileModule;->define$lambda$0$3$0(Lxf3/c;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lxf3/c;Luf3/a;)Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/di/ProfileModule;->define$lambda$0$12(Lxf3/c;Luf3/a;)Lcom/whoop/profile/presentation/memberlevels/MemberLevelsViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lxf3/c;Luf3/a;)Lcom/whoop/profile/domain/ProfileApi;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/di/ProfileModule;->define$lambda$0$7(Lxf3/c;Luf3/a;)Lcom/whoop/profile/domain/ProfileApi;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lxf3/c;Luf3/a;)Lcom/whoop/profile/navigation/ProfileActionRouter;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/di/ProfileModule;->define$lambda$0$5(Lxf3/c;Luf3/a;)Lcom/whoop/profile/navigation/ProfileActionRouter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lxf3/c;Luf3/a;)Lu82/a;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/di/ProfileModule;->define$lambda$0$2(Lxf3/c;Luf3/a;)Lu82/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lxf3/c;Luf3/a;)Lcom/whoop/profile/presentation/ProfileViewModel;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/di/ProfileModule;->define$lambda$0$10(Lxf3/c;Luf3/a;)Lcom/whoop/profile/presentation/ProfileViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lxf3/c;Luf3/a;)Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/di/ProfileModule;->define$lambda$0$9(Lxf3/c;Luf3/a;)Lcom/whoop/profile/presentation/edit/reducers/EditProfileViewStateReducer;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lxf3/c;Luf3/a;)Lcom/whoop/profile/domain/ProfileInteractor;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/di/ProfileModule;->define$lambda$0$3(Lxf3/c;Luf3/a;)Lcom/whoop/profile/domain/ProfileInteractor;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lxf3/c;Luf3/a;)Lcom/whoop/profile/presentation/edit/EditProfileViewModel;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/di/ProfileModule;->define$lambda$0$11(Lxf3/c;Luf3/a;)Lcom/whoop/profile/presentation/edit/EditProfileViewModel;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lxf3/c;Luf3/a;)Lu82/d;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/di/ProfileModule;->define$lambda$0$1(Lxf3/c;Luf3/a;)Lu82/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Ljava/lang/Integer;Ljava/lang/Integer;)Luf3/a;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/di/ProfileModule;->define$lambda$0$10$0(Ljava/lang/Integer;Ljava/lang/Integer;)Luf3/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public define()Ltf3/a;
    .locals 1

    new-instance v0, Ltf3/a;

    invoke-direct {v0}, Ltf3/a;-><init>()V

    invoke-static {v0}, Lcom/whoop/profile/di/ProfileModule;->define$lambda$0(Ltf3/a;)Ll83/a0;

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

    iget-object v0, p0, Lcom/whoop/profile/di/ProfileModule;->dependencies:Ljava/util/List;

    return-object v0
.end method

.method public bridge getKey()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Lnd1/j;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
