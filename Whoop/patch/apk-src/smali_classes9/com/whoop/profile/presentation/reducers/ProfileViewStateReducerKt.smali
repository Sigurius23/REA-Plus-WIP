.class public final Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a)\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005*\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0000H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u001b\u0010\u0008\u001a\u00020\n*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\u000b\u001a#\u0010\u000e\u001a\u00020\n*\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\"\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "",
        "iconString",
        "",
        "mapIconStringToDrawableResource",
        "(Ljava/lang/String;)I",
        "",
        "Lm91/o;",
        "inFlightCardButtonId",
        "withInFlightCardButtonDisabled",
        "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;",
        "Lm91/u;",
        "(Lm91/u;Ljava/lang/String;)Lm91/u;",
        "",
        "pairInFlight",
        "disableIfPairInFlight",
        "(Lm91/u;ZLjava/lang/String;)Lm91/u;",
        "Ljb1/a;",
        "itemReducer",
        "Ljb1/a;",
        "profile_release"
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
.field private static final itemReducer:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/data/local/room/dao/persistent/i;

    const/16 v1, 0xe

    invoke-direct {v0, v1}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt;->itemReducer:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt;->itemReducer$lambda$0(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getItemReducer$p()Ljb1/a;
    .locals 1

    sget-object v0, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt;->itemReducer:Ljb1/a;

    return-object v0
.end method

.method public static final synthetic access$withInFlightCardButtonDisabled(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt;->withInFlightCardButtonDisabled(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/profile/domain/models/components/ReferralsTileModel;)Lcom/whoop/profile/view/components/ReferralsTileViewState;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt;->itemReducer$lambda$0$0$2(Lcom/whoop/profile/domain/models/components/ReferralsTileModel;)Lcom/whoop/profile/view/components/ReferralsTileViewState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/profile/domain/models/components/StreakTileModel;)Lcom/whoop/profile/view/components/StreaksTileViewState;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt;->itemReducer$lambda$0$0$1(Lcom/whoop/profile/domain/models/components/StreakTileModel;)Lcom/whoop/profile/view/components/StreaksTileViewState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt;->itemReducer$lambda$0$0(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final disableIfPairInFlight(Lm91/u;ZLjava/lang/String;)Lm91/u;
    .locals 30

    move-object/from16 v0, p0

    if-eqz p1, :cond_0

    instance-of v1, v0, Lny0/h;

    if-eqz v1, :cond_0

    move-object v2, v0

    check-cast v2, Lny0/h;

    const v28, 0x1feffff

    const/16 v29, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

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

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v2 .. v29}, Lny0/h;->b(Lny0/h;Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILjava/lang/Object;)Lny0/h;

    move-result-object v0

    return-object v0

    :cond_0
    move-object/from16 v1, p2

    invoke-static {v0, v1}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt;->withInFlightCardButtonDisabled(Lm91/u;Ljava/lang/String;)Lm91/u;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e(Lcom/whoop/profile/domain/models/components/ContextHubTileModel;)Lcom/whoop/profile/view/components/ContextHubTileViewState;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt;->itemReducer$lambda$0$0$0(Lcom/whoop/profile/domain/models/components/ContextHubTileModel;)Lcom/whoop/profile/view/components/ContextHubTileViewState;

    move-result-object p0

    return-object p0
.end method

.method private static final itemReducer$lambda$0(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/data/local/room/dao/persistent/i;

    const/16 v1, 0xd

    invoke-direct {v0, v1}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final itemReducer$lambda$0$0(Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/data/local/room/dao/persistent/i;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/profile/domain/models/components/ContextHubTileModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt$itemReducer$lambda$0$0$$inlined$modelToItem$1;

    invoke-direct {v3, v0}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt$itemReducer$lambda$0$0$$inlined$modelToItem$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lcom/whoop/data/local/room/dao/persistent/i;

    const/16 v2, 0xb

    invoke-direct {v0, v2}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    const-class v2, Lcom/whoop/profile/domain/models/components/StreakTileModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt$itemReducer$lambda$0$0$$inlined$modelToItem$2;

    invoke-direct {v3, v0}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt$itemReducer$lambda$0$0$$inlined$modelToItem$2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lcom/whoop/data/local/room/dao/persistent/i;

    const/16 v2, 0xc

    invoke-direct {v0, v2}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    const-class v2, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt$itemReducer$lambda$0$0$$inlined$modelToItem$3;

    invoke-direct {v2, v0}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt$itemReducer$lambda$0$0$$inlined$modelToItem$3;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final itemReducer$lambda$0$0$0(Lcom/whoop/profile/domain/models/components/ContextHubTileModel;)Lcom/whoop/profile/view/components/ContextHubTileViewState;
    .locals 4

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/profile/view/components/ContextHubTileViewState;

    invoke-virtual {p0}, Lcom/whoop/profile/domain/models/components/ContextHubTileModel;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/profile/domain/models/components/ContextHubTileModel;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/profile/domain/models/components/ContextHubTileModel;->getEndIcon()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/profile/domain/models/components/ContextHubTileModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object p0

    invoke-direct {v0, v1, v2, v3, p0}, Lcom/whoop/profile/view/components/ContextHubTileViewState;-><init>(Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;)V

    return-object v0
.end method

.method private static final itemReducer$lambda$0$0$1(Lcom/whoop/profile/domain/models/components/StreakTileModel;)Lcom/whoop/profile/view/components/StreaksTileViewState;
    .locals 13

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/profile/domain/models/components/StreakTileModel;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/profile/domain/models/components/StreakTileModel;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/profile/domain/models/components/StreakTileModel;->getSubtitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/profile/domain/models/components/StreakTileModel;->getLottieUrl()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lv41/r0$e;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    invoke-static {v0}, Lv41/r0$e;->a(Ljava/lang/String;)Lv41/r0$e;

    move-result-object v0

    move-object v5, v0

    goto :goto_1

    :cond_1
    move-object v5, v1

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/profile/domain/models/components/StreakTileModel;->getImageUrl()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_2

    new-instance v6, Lkd1/o$c;

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_2

    :cond_2
    move-object v6, v1

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/profile/domain/models/components/StreakTileModel;->getEndIcon()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/profile/domain/models/components/StreakTileModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v8

    new-instance v1, Lcom/whoop/profile/view/components/StreaksTileViewState;

    invoke-direct/range {v1 .. v8}, Lcom/whoop/profile/view/components/StreaksTileViewState;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lv41/r0;Lkd1/o;Lgz0/m0;Lcom/whoop/navigation/e;)V

    return-object v1
.end method

.method private static final itemReducer$lambda$0$0$2(Lcom/whoop/profile/domain/models/components/ReferralsTileModel;)Lcom/whoop/profile/view/components/ReferralsTileViewState;
    .locals 37

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->getId()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;

    invoke-virtual {v1}, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->getHeader()Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->getHeader()Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;->getSubtitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->getHeader()Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;->getReferralsCount()I

    move-result v5

    invoke-virtual {v1}, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->getHeader()Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/profile/domain/models/components/ReferralsTileHeaderModel;->getReferralsImg()Ljava/lang/String;

    move-result-object v8

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-static {v6}, Ldc/b;->d(Lx81/d;)I

    move-result v11

    invoke-static {v6}, Ldc/b;->d(Lx81/d;)I

    move-result v9

    new-instance v7, Lkd1/o$c;

    const/4 v12, 0x4

    const/4 v13, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v7 .. v13}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v3, v0, v4, v5, v7}, Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;-><init>(Ljava/lang/String;Ljava/lang/String;ILkd1/o;)V

    invoke-virtual {v1}, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->getReferredList()Lcom/whoop/profile/domain/models/components/ReferredListModel;

    move-result-object v0

    const/4 v4, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/components/ReferredListModel;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/components/ReferredListModel;->getReferredMembers()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v6, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/profile/domain/models/components/ReferredMemberModel;

    new-instance v9, Lcom/whoop/profile/view/components/ReferredMemberViewState;

    invoke-virtual {v8}, Lcom/whoop/profile/domain/models/components/ReferredMemberModel;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8}, Lcom/whoop/profile/domain/models/components/ReferredMemberModel;->getAvatar()Ljava/lang/String;

    move-result-object v12

    sget-object v11, Lx81/d;->a:Lx81/d;

    invoke-static {v11}, Ldc/b;->d(Lx81/d;)I

    move-result v15

    invoke-static {v11}, Ldc/b;->d(Lx81/d;)I

    move-result v13

    new-instance v11, Lkd1/o$c;

    const/16 v16, 0x4

    const/16 v17, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v11 .. v17}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v8}, Lcom/whoop/profile/domain/models/components/ReferredMemberModel;->getEndIcon()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt;->mapIconStringToDrawableResource(Ljava/lang/String;)I

    move-result v12

    invoke-virtual {v8}, Lcom/whoop/profile/domain/models/components/ReferredMemberModel;->getSubtitle()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v9, v10, v11, v12, v8}, Lcom/whoop/profile/view/components/ReferredMemberViewState;-><init>(Ljava/lang/String;Lkd1/o;ILjava/lang/String;)V

    invoke-interface {v7, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/components/ReferredListModel;->getAdditionalReferralDisplay()Ljava/lang/String;

    move-result-object v0

    new-instance v6, Lcom/whoop/profile/view/components/ReferredListViewState;

    invoke-direct {v6, v5, v7, v0}, Lcom/whoop/profile/view/components/ReferredListViewState;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    move-object v6, v4

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->getFooter()Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v5, Lcom/whoop/profile/view/components/ReferralsTileFooterViewState;

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;->getTag()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/components/ReferralsTileFooterModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v7, v0}, Lcom/whoop/profile/view/components/ReferralsTileFooterViewState;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    move-object v5, v4

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->getButton()Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/whoop/profile/domain/models/components/ReferralsTileButtonModel;->getContent()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v7, "LIFE"

    invoke-static {v0, v7}, Llb1/d4;->k(Lcom/whoop/design/models/items/CardButtonModel;Ljava/lang/String;)Lny0/h;

    move-result-object v8

    if-eqz v8, :cond_3

    const v34, 0x1ff9fff

    const/16 v35, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

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

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-static/range {v8 .. v35}, Lny0/h;->b(Lny0/h;Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILjava/lang/Object;)Lny0/h;

    move-result-object v4

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/profile/domain/models/components/ReferralsTileModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v7

    new-instance v1, Lcom/whoop/profile/view/components/ReferralsTileViewState;

    move-object/from16 v36, v6

    move-object v6, v4

    move-object/from16 v4, v36

    invoke-direct/range {v1 .. v7}, Lcom/whoop/profile/view/components/ReferralsTileViewState;-><init>(Ljava/lang/String;Lcom/whoop/profile/view/components/ReferralsTileHeaderViewState;Lcom/whoop/profile/view/components/ReferredListViewState;Lcom/whoop/profile/view/components/ReferralsTileFooterViewState;Lny0/h;Lcom/whoop/navigation/e;)V

    return-object v1
.end method

.method private static final mapIconStringToDrawableResource(Ljava/lang/String;)I
    .locals 1

    const-string v0, "COMPLETED_CHECKMARK"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget p0, Lcom/whoop/profile/R$drawable;->design_ic_completed_checkmark:I

    return p0

    :cond_0
    const-string v0, "PENDING_CHECKMARK"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget p0, Lcom/whoop/profile/R$drawable;->design_ic_pending_checkmark:I

    return p0

    :cond_1
    sget-object p0, Lgz0/m0;->CHECKMARK:Lgz0/m0;

    invoke-virtual {p0}, Lgz0/m0;->toWhoopIcon()I

    move-result p0

    return p0
.end method

.method private static final withInFlightCardButtonDisabled(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lm91/o;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lm91/o;",
            ">;"
        }
    .end annotation

    if-nez p1, :cond_0

    return-object p0

    .line 1
    :cond_0
    check-cast p0, Ljava/lang/Iterable;

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 3
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 4
    check-cast v1, Lm91/o;

    .line 5
    invoke-virtual {v1}, Lm91/o;->e()Lm91/u;

    move-result-object v2

    invoke-static {v2, p1}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt;->withInFlightCardButtonDisabled(Lm91/u;Ljava/lang/String;)Lm91/u;

    move-result-object v2

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v2, v4, v3, v4}, Lm91/o;->b(Lm91/o;Lm91/u;Lcom/whoop/analytics/AnalyticEventModel;ILjava/lang/Object;)Lm91/o;

    move-result-object v1

    .line 6
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private static final withInFlightCardButtonDisabled(Lm91/u;Ljava/lang/String;)Lm91/u;
    .locals 31

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 7
    instance-of v2, v0, Lny0/h;

    if-eqz v2, :cond_1

    move-object v3, v0

    check-cast v3, Lny0/h;

    invoke-virtual {v3}, Lny0/h;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const v29, 0x1feffff

    const/16 v30, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

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

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-static/range {v3 .. v30}, Lny0/h;->b(Lny0/h;Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILjava/lang/Object;)Lny0/h;

    move-result-object v0

    return-object v0

    :cond_0
    return-object v3

    .line 8
    :cond_1
    instance-of v2, v0, Lc41/e5;

    if-eqz v2, :cond_8

    .line 9
    move-object v3, v0

    check-cast v3, Lc41/e5;

    invoke-virtual {v3}, Lc41/e5;->f()Lm91/u;

    move-result-object v0

    instance-of v2, v0, Lny0/h;

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    check-cast v0, Lny0/h;

    goto :goto_0

    :cond_2
    move-object v0, v4

    :goto_0
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lny0/h;->getId()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    move-object v0, v4

    :goto_1
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 10
    invoke-virtual {v3}, Lc41/e5;->c()Lm91/u;

    move-result-object v0

    instance-of v2, v0, Lny0/h;

    if-eqz v2, :cond_4

    check-cast v0, Lny0/h;

    goto :goto_2

    :cond_4
    move-object v0, v4

    :goto_2
    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lny0/h;->getId()Ljava/lang/String;

    move-result-object v4

    :cond_5
    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_3

    :cond_6
    const/4 v0, 0x0

    goto :goto_4

    :cond_7
    :goto_3
    const/4 v0, 0x1

    .line 11
    :goto_4
    invoke-virtual {v3}, Lc41/e5;->f()Lm91/u;

    move-result-object v2

    invoke-static {v2, v0, v1}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt;->disableIfPairInFlight(Lm91/u;ZLjava/lang/String;)Lm91/u;

    move-result-object v4

    .line 12
    invoke-virtual {v3}, Lc41/e5;->c()Lm91/u;

    move-result-object v2

    invoke-static {v2, v0, v1}, Lcom/whoop/profile/presentation/reducers/ProfileViewStateReducerKt;->disableIfPairInFlight(Lm91/u;ZLjava/lang/String;)Lm91/u;

    move-result-object v5

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    .line 13
    invoke-static/range {v3 .. v8}, Lc41/e5;->b(Lc41/e5;Lm91/u;Lm91/u;ZILjava/lang/Object;)Lc41/e5;

    move-result-object v0

    :cond_8
    return-object v0
.end method
