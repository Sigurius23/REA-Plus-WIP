.class final Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/data/remote/RemoteDataSourceImpl;->getTeamsWithRankLiveData(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/lifecycle/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.data.remote.RemoteDataSourceImpl$getTeamsWithRankLiveData$1"
    f = "RemoteDataSourceImpl.kt"
    l = {
        0x86
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $endDate:Ljava/lang/String;

.field final synthetic $leaderboardType:Ljava/lang/String;

.field final synthetic $liveData:Landroidx/lifecycle/u0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/u0;"
        }
    .end annotation
.end field

.field final synthetic $period:Ljava/lang/String;

.field final synthetic $startDate:Ljava/lang/String;

.field final synthetic $userId:I

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lcom/whoop/data/remote/RemoteDataSourceImpl;


# direct methods
.method public constructor <init>(Lcom/whoop/data/remote/RemoteDataSourceImpl;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/lifecycle/u0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/remote/RemoteDataSourceImpl;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroidx/lifecycle/u0;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->this$0:Lcom/whoop/data/remote/RemoteDataSourceImpl;

    iput p2, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->$userId:I

    iput-object p3, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->$leaderboardType:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->$startDate:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->$endDate:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->$period:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->$liveData:Landroidx/lifecycle/u0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;

    iget-object v1, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->this$0:Lcom/whoop/data/remote/RemoteDataSourceImpl;

    iget v2, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->$userId:I

    iget-object v3, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->$leaderboardType:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->$startDate:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->$endDate:Ljava/lang/String;

    iget-object v6, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->$period:Ljava/lang/String;

    iget-object v7, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->$liveData:Landroidx/lifecycle/u0;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;-><init>(Lcom/whoop/data/remote/RemoteDataSourceImpl;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/lifecycle/u0;Lq83/d;)V

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    move-object/from16 v10, p0

    sget-object v11, Lr83/a;->w:Lr83/a;

    iget v0, v10, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->label:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    iget-object v0, v10, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v12, v0

    move-object/from16 v0, p1

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, v10, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->this$0:Lcom/whoop/data/remote/RemoteDataSourceImpl;

    invoke-static {v0}, Lcom/whoop/data/remote/RemoteDataSourceImpl;->access$getCommunityApi$p(Lcom/whoop/data/remote/RemoteDataSourceImpl;)Lcom/whoop/service/network/CommunityApi;

    move-result-object v0

    iget v2, v10, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->$userId:I

    iget-object v4, v10, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->$leaderboardType:Ljava/lang/String;

    iget-object v5, v10, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->$startDate:Ljava/lang/String;

    iget-object v6, v10, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->$endDate:Ljava/lang/String;

    iget-object v7, v10, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->$period:Ljava/lang/String;

    iput-object v12, v10, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->L$0:Ljava/lang/Object;

    iput v1, v10, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->label:I

    move v1, v2

    const/4 v2, 0x1

    const/4 v3, 0x1

    const/4 v8, 0x0

    const/16 v9, 0x32

    invoke-interface/range {v0 .. v10}, Lcom/whoop/service/network/CommunityApi;->getTeamsWithRankForUser(IZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_2

    return-object v11

    :cond_2
    :goto_0
    check-cast v0, Lpg3/v0;

    iget-object v0, v0, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/domain/model/RecordsDto;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/whoop/domain/model/RecordsDto;->getRecords()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_4

    check-cast v0, Ljava/lang/Iterable;

    iget v1, v10, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->$userId:I

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/domain/model/teams/CommunityDto;

    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/CommunityDto;->toTeam()Lcom/whoop/domain/model/teams/Team;

    move-result-object v2

    if-eqz v2, :cond_3

    new-instance v13, Lcom/whoop/data/local/room/entity/TeamsDto;

    new-instance v14, Ljava/lang/Integer;

    invoke-direct {v14, v1}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/Team;->getId()I

    move-result v15

    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/Team;->getName()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/Team;->getDescription()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/Team;->getIconUrl()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/Team;->getBannerUrl()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/Team;->getAthletePrivacyId()I

    move-result v20

    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/Team;->getPrivacyProfile()Lcom/whoop/domain/model/teams/TeamPrivacyProfile;

    move-result-object v21

    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/Team;->getEnabledTabs()Ljava/util/List;

    move-result-object v22

    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/Team;->getAdminId()I

    move-result v23

    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/Team;->getTeamType()Lcom/whoop/domain/model/teams/TeamType;

    move-result-object v24

    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/Team;->getMemberCount()I

    move-result v25

    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/Team;->getRank()I

    move-result v26

    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/Team;->getChatChannel()Lcom/whoop/domain/model/teams/ChatChannel;

    move-result-object v27

    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/Team;->getChatEnabled()Z

    move-result v28

    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/Team;->getUnreadCount()I

    move-result v29

    invoke-direct/range {v13 .. v29}, Lcom/whoop/data/local/room/entity/TeamsDto;-><init>(Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/whoop/domain/model/teams/TeamPrivacyProfile;Ljava/util/List;ILcom/whoop/domain/model/teams/TeamType;IILcom/whoop/domain/model/teams/ChatChannel;ZI)V

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    iget-object v0, v10, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->$liveData:Landroidx/lifecycle/u0;

    sget-object v1, Lcom/whoop/data/remote/commons/ApiResponse;->Companion:Lcom/whoop/data/remote/commons/ApiResponse$Companion;

    invoke-virtual {v1, v12}, Lcom/whoop/data/remote/commons/ApiResponse$Companion;->create(Ljava/lang/Object;)Lcom/whoop/data/remote/commons/ApiResponse;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :goto_2
    iget-object v1, v10, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->this$0:Lcom/whoop/data/remote/RemoteDataSourceImpl;

    invoke-static {v1}, Lcom/whoop/data/remote/RemoteDataSourceImpl;->access$getLogger$p(Lcom/whoop/data/remote/RemoteDataSourceImpl;)Ltr2/n;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Unable to get teams data: "

    invoke-static {v3, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, v10, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;->$liveData:Landroidx/lifecycle/u0;

    sget-object v2, Lcom/whoop/data/remote/commons/ApiResponse;->Companion:Lcom/whoop/data/remote/commons/ApiResponse$Companion;

    invoke-virtual {v2, v0}, Lcom/whoop/data/remote/commons/ApiResponse$Companion;->create(Ljava/lang/Throwable;)Lcom/whoop/data/remote/commons/ApiErrorResponse;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
