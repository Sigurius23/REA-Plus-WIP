.class public final Lcom/whoop/data/remote/RemoteDataSourceImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc3/c0;
.implements Lcom/whoop/data/remote/RemoteDataSource;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00e6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B_\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0096@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ#\u0010#\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\"0!0 2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008#\u0010$J)\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020*0)0(0\'2\u0006\u0010&\u001a\u00020%H\u0016\u00a2\u0006\u0004\u0008+\u0010,JM\u00102\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002010)0(0\'2\u0006\u0010&\u001a\u00020%2\u0006\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020\u001b2\u0008\u0010/\u001a\u0004\u0018\u00010\u001b2\u0008\u00100\u001a\u0004\u0018\u00010\u001bH\u0016\u00a2\u0006\u0004\u00082\u00103J\u001b\u00105\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002040(0\'H\u0016\u00a2\u0006\u0004\u00085\u00106J\u0016\u00108\u001a\u0008\u0012\u0004\u0012\u0002070)H\u0096@\u00a2\u0006\u0004\u00088\u00109J2\u0010?\u001a\u0008\u0012\u0004\u0012\u00020>0!2\u0006\u0010;\u001a\u00020:2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0<H\u0096@\u00a2\u0006\u0004\u0008?\u0010@J\u0018\u0010C\u001a\n\u0012\u0004\u0012\u00020B\u0018\u00010AH\u0096@\u00a2\u0006\u0004\u0008C\u00109J\u001e\u0010F\u001a\u0008\u0012\u0004\u0012\u00020E0A2\u0006\u0010D\u001a\u00020%H\u0096@\u00a2\u0006\u0004\u0008F\u0010GJ\u0010\u0010I\u001a\u00020HH\u0096@\u00a2\u0006\u0004\u0008I\u00109J\u001e\u0010L\u001a\u0008\u0012\u0004\u0012\u00020>0!2\u0006\u0010K\u001a\u00020JH\u0096@\u00a2\u0006\u0004\u0008L\u0010MR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010NR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010OR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010PR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010QR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010RR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010SR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010TR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010UR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010VR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010WR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Z\u0010[R\u0014\u0010_\u001a\u00020\\8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008]\u0010^\u00a8\u0006`"
    }
    d2 = {
        "Lcom/whoop/data/remote/RemoteDataSourceImpl;",
        "Lbc3/c0;",
        "Lcom/whoop/data/remote/RemoteDataSource;",
        "Lcom/whoop/service/network/CommunityApi;",
        "communityApi",
        "Lcom/whoop/community/data/network/CommunityServiceApi;",
        "communityServiceApi",
        "Lcom/whoop/consolePackets/data/api/ConsolePacketsApi;",
        "consolePacketsApi",
        "Lcom/whoop/service/network/LegacyTeamServiceApi;",
        "legacyTeamServiceApi",
        "Lcom/whoop/service/network/ProfileApiService;",
        "profileApiService",
        "Lcom/whoop/service/network/MembershipApi;",
        "membershipApi",
        "Lcom/whoop/service/network/MembershipV2Api;",
        "membershipV2Api",
        "Lin2/d;",
        "dispatcherFactory",
        "Ltr2/n;",
        "logger",
        "Lrr2/c;",
        "crashReporter",
        "Lor2/j0;",
        "idleIndicator",
        "<init>",
        "(Lcom/whoop/service/network/CommunityApi;Lcom/whoop/community/data/network/CommunityServiceApi;Lcom/whoop/consolePackets/data/api/ConsolePacketsApi;Lcom/whoop/service/network/LegacyTeamServiceApi;Lcom/whoop/service/network/ProfileApiService;Lcom/whoop/service/network/MembershipApi;Lcom/whoop/service/network/MembershipV2Api;Lin2/d;Ltr2/n;Lrr2/c;Lor2/j0;)V",
        "",
        "inviteCode",
        "Lcom/whoop/domain/model/Invitation;",
        "validateInviteCode",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lxg3/g;",
        "Lpg3/v0;",
        "Lcom/whoop/service/network/model/ClaimInviteResponse;",
        "joinTeam",
        "(Ljava/lang/String;)Lxg3/g;",
        "",
        "userId",
        "Landroidx/lifecycle/p0;",
        "Lcom/whoop/data/remote/commons/ApiResponse;",
        "",
        "Lcom/whoop/domain/model/teams/TeamInviteDto;",
        "getTeamInviteLiveData",
        "(I)Landroidx/lifecycle/p0;",
        "leaderboardType",
        "startDate",
        "endDate",
        "period",
        "Lcom/whoop/data/local/room/entity/TeamsDto;",
        "getTeamsWithRankLiveData",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/lifecycle/p0;",
        "Lcom/whoop/service/network/model/DefaultImages;",
        "getDefaultImagesLiveData",
        "()Landroidx/lifecycle/p0;",
        "Lcom/whoop/domain/model/teams/FeatureTeam;",
        "getFeatureTeams",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lud3/v0;",
        "body",
        "",
        "headers",
        "Ll83/a0;",
        "uploadConsoleEventPackets",
        "(Lud3/v0;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/domain/model/RecordsDto;",
        "Lcom/whoop/domain/model/teams/MemberStoryDto;",
        "getMemberStories",
        "level",
        "Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;",
        "getAllProgressLevels",
        "(ILq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/data/remote/domain/dto/growth/MembershipInfoDto;",
        "getMembershipInfo",
        "Lcom/whoop/data/remote/domain/request/RecordUserStrapRequestBody;",
        "strap",
        "recordUserStrap",
        "(Lcom/whoop/data/remote/domain/request/RecordUserStrapRequestBody;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/service/network/CommunityApi;",
        "Lcom/whoop/community/data/network/CommunityServiceApi;",
        "Lcom/whoop/consolePackets/data/api/ConsolePacketsApi;",
        "Lcom/whoop/service/network/LegacyTeamServiceApi;",
        "Lcom/whoop/service/network/ProfileApiService;",
        "Lcom/whoop/service/network/MembershipApi;",
        "Lcom/whoop/service/network/MembershipV2Api;",
        "Lin2/d;",
        "Ltr2/n;",
        "Lrr2/c;",
        "Lor2/j0;",
        "Lbc3/u;",
        "job",
        "Lbc3/u;",
        "Lq83/j;",
        "getCoroutineContext",
        "()Lq83/j;",
        "coroutineContext",
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


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final communityApi:Lcom/whoop/service/network/CommunityApi;

.field private final communityServiceApi:Lcom/whoop/community/data/network/CommunityServiceApi;

.field private final consolePacketsApi:Lcom/whoop/consolePackets/data/api/ConsolePacketsApi;

.field private final crashReporter:Lrr2/c;

.field private final dispatcherFactory:Lin2/d;

.field private final idleIndicator:Lor2/j0;

.field private final job:Lbc3/u;

.field private final legacyTeamServiceApi:Lcom/whoop/service/network/LegacyTeamServiceApi;

.field private final logger:Ltr2/n;

.field private final membershipApi:Lcom/whoop/service/network/MembershipApi;

.field private final membershipV2Api:Lcom/whoop/service/network/MembershipV2Api;

.field private final profileApiService:Lcom/whoop/service/network/ProfileApiService;


# direct methods
.method public constructor <init>(Lcom/whoop/service/network/CommunityApi;Lcom/whoop/community/data/network/CommunityServiceApi;Lcom/whoop/consolePackets/data/api/ConsolePacketsApi;Lcom/whoop/service/network/LegacyTeamServiceApi;Lcom/whoop/service/network/ProfileApiService;Lcom/whoop/service/network/MembershipApi;Lcom/whoop/service/network/MembershipV2Api;Lin2/d;Ltr2/n;Lrr2/c;Lor2/j0;)V
    .locals 1

    const-string v0, "communityApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "communityServiceApi"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consolePacketsApi"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "legacyTeamServiceApi"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "profileApiService"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "membershipApi"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "membershipV2Api"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcherFactory"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "crashReporter"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "idleIndicator"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->communityApi:Lcom/whoop/service/network/CommunityApi;

    iput-object p2, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->communityServiceApi:Lcom/whoop/community/data/network/CommunityServiceApi;

    iput-object p3, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->consolePacketsApi:Lcom/whoop/consolePackets/data/api/ConsolePacketsApi;

    iput-object p4, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->legacyTeamServiceApi:Lcom/whoop/service/network/LegacyTeamServiceApi;

    iput-object p5, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->profileApiService:Lcom/whoop/service/network/ProfileApiService;

    iput-object p6, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->membershipApi:Lcom/whoop/service/network/MembershipApi;

    iput-object p7, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->membershipV2Api:Lcom/whoop/service/network/MembershipV2Api;

    iput-object p8, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->dispatcherFactory:Lin2/d;

    iput-object p9, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->logger:Ltr2/n;

    iput-object p10, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->crashReporter:Lrr2/c;

    iput-object p11, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->idleIndicator:Lor2/j0;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->job:Lbc3/u;

    return-void
.end method

.method public static final synthetic access$getCommunityApi$p(Lcom/whoop/data/remote/RemoteDataSourceImpl;)Lcom/whoop/service/network/CommunityApi;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->communityApi:Lcom/whoop/service/network/CommunityApi;

    return-object p0
.end method

.method public static final synthetic access$getCommunityServiceApi$p(Lcom/whoop/data/remote/RemoteDataSourceImpl;)Lcom/whoop/community/data/network/CommunityServiceApi;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->communityServiceApi:Lcom/whoop/community/data/network/CommunityServiceApi;

    return-object p0
.end method

.method public static final synthetic access$getConsolePacketsApi$p(Lcom/whoop/data/remote/RemoteDataSourceImpl;)Lcom/whoop/consolePackets/data/api/ConsolePacketsApi;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->consolePacketsApi:Lcom/whoop/consolePackets/data/api/ConsolePacketsApi;

    return-object p0
.end method

.method public static final synthetic access$getDispatcherFactory$p(Lcom/whoop/data/remote/RemoteDataSourceImpl;)Lin2/d;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->dispatcherFactory:Lin2/d;

    return-object p0
.end method

.method public static final synthetic access$getIdleIndicator$p(Lcom/whoop/data/remote/RemoteDataSourceImpl;)Lor2/j0;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->idleIndicator:Lor2/j0;

    return-object p0
.end method

.method public static final synthetic access$getLegacyTeamServiceApi$p(Lcom/whoop/data/remote/RemoteDataSourceImpl;)Lcom/whoop/service/network/LegacyTeamServiceApi;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->legacyTeamServiceApi:Lcom/whoop/service/network/LegacyTeamServiceApi;

    return-object p0
.end method

.method public static final synthetic access$getLogger$p(Lcom/whoop/data/remote/RemoteDataSourceImpl;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->logger:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic access$getMembershipApi$p(Lcom/whoop/data/remote/RemoteDataSourceImpl;)Lcom/whoop/service/network/MembershipApi;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->membershipApi:Lcom/whoop/service/network/MembershipApi;

    return-object p0
.end method

.method public static final synthetic access$getMembershipV2Api$p(Lcom/whoop/data/remote/RemoteDataSourceImpl;)Lcom/whoop/service/network/MembershipV2Api;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->membershipV2Api:Lcom/whoop/service/network/MembershipV2Api;

    return-object p0
.end method

.method public static final synthetic access$getProfileApiService$p(Lcom/whoop/data/remote/RemoteDataSourceImpl;)Lcom/whoop/service/network/ProfileApiService;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->profileApiService:Lcom/whoop/service/network/ProfileApiService;

    return-object p0
.end method


# virtual methods
.method public getAllProgressLevels(ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Lcom/whoop/domain/model/RecordsDto<",
            "Lcom/whoop/data/remote/domain/dto/gamification/MemberLevelDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->dispatcherFactory:Lin2/d;

    invoke-interface {v0}, Lin2/d;->b()Lq83/j;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/remote/RemoteDataSourceImpl$getAllProgressLevels$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/data/remote/RemoteDataSourceImpl$getAllProgressLevels$2;-><init>(Lcom/whoop/data/remote/RemoteDataSourceImpl;ILq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getCoroutineContext()Lq83/j;
    .locals 2

    iget-object v0, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->dispatcherFactory:Lin2/d;

    invoke-interface {v0}, Lin2/d;->getDefault()Lq83/j;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->job:Lbc3/u;

    invoke-interface {v0, v1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    return-object v0
.end method

.method public getDefaultImagesLiveData()Landroidx/lifecycle/p0;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    new-instance v0, Landroidx/lifecycle/u0;

    invoke-direct {v0}, Landroidx/lifecycle/p0;-><init>()V

    new-instance v1, Lcom/whoop/data/remote/RemoteDataSourceImpl$getDefaultImagesLiveData$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v0, v2}, Lcom/whoop/data/remote/RemoteDataSourceImpl$getDefaultImagesLiveData$1;-><init>(Lcom/whoop/data/remote/RemoteDataSourceImpl;Landroidx/lifecycle/u0;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {p0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v0
.end method

.method public getFeatureTeams(Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lcom/whoop/domain/model/teams/FeatureTeam;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/remote/RemoteDataSourceImpl$getFeatureTeams$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getFeatureTeams$1;

    iget v1, v0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getFeatureTeams$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getFeatureTeams$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getFeatureTeams$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/remote/RemoteDataSourceImpl$getFeatureTeams$1;-><init>(Lcom/whoop/data/remote/RemoteDataSourceImpl;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getFeatureTeams$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getFeatureTeams$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getFeatureTeams$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Lretrofit2/HttpException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    goto :goto_4

    :catch_2
    move-exception p1

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->dispatcherFactory:Lin2/d;

    invoke-interface {v2}, Lin2/d;->b()Lq83/j;

    move-result-object v2

    new-instance v5, Lcom/whoop/data/remote/RemoteDataSourceImpl$getFeatureTeams$data$1;

    const/4 v6, 0x0

    invoke-direct {v5, p0, v6}, Lcom/whoop/data/remote/RemoteDataSourceImpl$getFeatureTeams$data$1;-><init>(Lcom/whoop/data/remote/RemoteDataSourceImpl;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getFeatureTeams$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getFeatureTeams$1;->label:I

    invoke-static {v2, v5, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v7, v0

    move-object v0, p1

    move-object p1, v7

    :goto_1
    check-cast p1, Lcom/whoop/domain/model/RecordsDto;

    invoke-virtual {p1}, Lcom/whoop/domain/model/RecordsDto;->getRecords()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/domain/model/teams/FeatureCommunityDto;

    invoke-virtual {v1}, Lcom/whoop/domain/model/teams/FeatureCommunityDto;->toFeatureTeam()Lcom/whoop/domain/model/teams/FeatureTeam;

    move-result-object v1

    invoke-virtual {v1, v4}, Lcom/whoop/domain/model/teams/FeatureTeam;->setShowBadge(Z)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Lretrofit2/HttpException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :cond_4
    return-object v0

    :goto_3
    iget-object v0, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->logger:Ltr2/n;

    const-string v1, "Exception - printing stack trace:"

    new-array v2, v3, [Lqr2/a$a;

    invoke-interface {v0, v1, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_6

    :goto_4
    iget-object v0, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->logger:Ltr2/n;

    iget p1, p1, Lretrofit2/HttpException;->w:I

    const-string v1, "HTTP Exception: #"

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_6

    :goto_5
    iget-object v0, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->logger:Ltr2/n;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Server communication error: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_6
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public getMemberStories(Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/domain/model/RecordsDto<",
            "Lcom/whoop/domain/model/teams/MemberStoryDto;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/remote/RemoteDataSourceImpl$getMemberStories$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getMemberStories$1;

    iget v1, v0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getMemberStories$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getMemberStories$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getMemberStories$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/remote/RemoteDataSourceImpl$getMemberStories$1;-><init>(Lcom/whoop/data/remote/RemoteDataSourceImpl;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getMemberStories$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getMemberStories$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->dispatcherFactory:Lin2/d;

    invoke-interface {p1}, Lin2/d;->b()Lq83/j;

    move-result-object p1

    new-instance v2, Lcom/whoop/data/remote/RemoteDataSourceImpl$getMemberStories$2;

    invoke-direct {v2, p0, v3}, Lcom/whoop/data/remote/RemoteDataSourceImpl$getMemberStories$2;-><init>(Lcom/whoop/data/remote/RemoteDataSourceImpl;Lq83/d;)V

    iput v4, v0, Lcom/whoop/data/remote/RemoteDataSourceImpl$getMemberStories$1;->label:I

    invoke-static {p1, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1

    :goto_1
    iget-object v0, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->logger:Ltr2/n;

    iget-object v1, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->crashReporter:Lrr2/c;

    const-string v2, "Unable to fetch member stories"

    invoke-static {p1, v2, v0, v1}, Lw02/b;->a(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;)Ljava/lang/String;

    return-object v3
.end method

.method public getMembershipInfo(Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/domain/dto/growth/MembershipInfoDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->dispatcherFactory:Lin2/d;

    invoke-interface {v0}, Lin2/d;->b()Lq83/j;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/remote/RemoteDataSourceImpl$getMembershipInfo$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/data/remote/RemoteDataSourceImpl$getMembershipInfo$2;-><init>(Lcom/whoop/data/remote/RemoteDataSourceImpl;Lq83/d;)V

    invoke-static {v0, v1, p1}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getTeamInviteLiveData(I)Landroidx/lifecycle/p0;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    new-instance v0, Landroidx/lifecycle/u0;

    invoke-direct {v0}, Landroidx/lifecycle/p0;-><init>()V

    iget-object v1, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->idleIndicator:Lor2/j0;

    invoke-interface {v1}, Lor2/j0;->a()V

    new-instance v1, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamInviteLiveData$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v0, v2}, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamInviteLiveData$1;-><init>(Lcom/whoop/data/remote/RemoteDataSourceImpl;ILandroidx/lifecycle/u0;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v0
.end method

.method public getTeamsWithRankLiveData(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/lifecycle/p0;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    const-string v0, "leaderboardType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "startDate"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Landroidx/lifecycle/u0;

    invoke-direct {v8}, Landroidx/lifecycle/p0;-><init>()V

    new-instance v1, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;

    const/4 v9, 0x0

    move-object v2, p0

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v1 .. v9}, Lcom/whoop/data/remote/RemoteDataSourceImpl$getTeamsWithRankLiveData$1;-><init>(Lcom/whoop/data/remote/RemoteDataSourceImpl;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/lifecycle/u0;Lq83/d;)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {p0, p2, p2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v8
.end method

.method public joinTeam(Ljava/lang/String;)Lxg3/g;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lxg3/g<",
            "Lpg3/v0<",
            "Lcom/whoop/service/network/model/ClaimInviteResponse;",
            ">;>;"
        }
    .end annotation

    const-string v0, "inviteCode"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->legacyTeamServiceApi:Lcom/whoop/service/network/LegacyTeamServiceApi;

    new-instance v1, Lcom/whoop/service/network/model/ClaimInviteDto;

    invoke-direct {v1, p1}, Lcom/whoop/service/network/model/ClaimInviteDto;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/whoop/service/network/LegacyTeamServiceApi;->claimInvite(Lcom/whoop/service/network/model/ClaimInviteDto;)Lxg3/g;

    move-result-object p1

    invoke-static {p1}, Li92/s;->m(Lxg3/g;)Llh3/k;

    move-result-object p1

    const-string v0, "wrap(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public recordUserStrap(Lcom/whoop/data/remote/domain/request/RecordUserStrapRequestBody;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/remote/domain/request/RecordUserStrapRequestBody;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->dispatcherFactory:Lin2/d;

    invoke-interface {v0}, Lin2/d;->b()Lq83/j;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/remote/RemoteDataSourceImpl$recordUserStrap$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/data/remote/RemoteDataSourceImpl$recordUserStrap$2;-><init>(Lcom/whoop/data/remote/RemoteDataSourceImpl;Lcom/whoop/data/remote/domain/request/RecordUserStrapRequestBody;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public uploadConsoleEventPackets(Lud3/v0;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lud3/v0;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->dispatcherFactory:Lin2/d;

    invoke-interface {v0}, Lin2/d;->b()Lq83/j;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/remote/RemoteDataSourceImpl$uploadConsoleEventPackets$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lcom/whoop/data/remote/RemoteDataSourceImpl$uploadConsoleEventPackets$2;-><init>(Lcom/whoop/data/remote/RemoteDataSourceImpl;Lud3/v0;Ljava/util/Map;Lq83/d;)V

    invoke-static {v0, v1, p3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public validateInviteCode(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/domain/model/Invitation;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/whoop/data/remote/RemoteDataSourceImpl$validateInviteCode$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/data/remote/RemoteDataSourceImpl$validateInviteCode$1;

    iget v1, v0, Lcom/whoop/data/remote/RemoteDataSourceImpl$validateInviteCode$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/remote/RemoteDataSourceImpl$validateInviteCode$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/remote/RemoteDataSourceImpl$validateInviteCode$1;

    invoke-direct {v0, p0, p2}, Lcom/whoop/data/remote/RemoteDataSourceImpl$validateInviteCode$1;-><init>(Lcom/whoop/data/remote/RemoteDataSourceImpl;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/data/remote/RemoteDataSourceImpl$validateInviteCode$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/remote/RemoteDataSourceImpl$validateInviteCode$1;->label:I

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/whoop/data/remote/RemoteDataSourceImpl$validateInviteCode$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lretrofit2/HttpException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, Lcom/whoop/data/remote/RemoteDataSourceImpl;->dispatcherFactory:Lin2/d;

    invoke-interface {p2}, Lin2/d;->b()Lq83/j;

    move-result-object p2

    new-instance v2, Lcom/whoop/data/remote/RemoteDataSourceImpl$validateInviteCode$response$1;

    invoke-direct {v2, p0, p1, v5}, Lcom/whoop/data/remote/RemoteDataSourceImpl$validateInviteCode$response$1;-><init>(Lcom/whoop/data/remote/RemoteDataSourceImpl;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/data/remote/RemoteDataSourceImpl$validateInviteCode$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lcom/whoop/data/remote/RemoteDataSourceImpl$validateInviteCode$1;->label:I

    invoke-static {p2, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lpg3/v0;

    iget-object v0, p2, Lpg3/v0;->a:Lud3/x0;

    iget-boolean v1, v0, Lud3/x0;->Q:Z

    if-eqz v1, :cond_5

    iget-object p2, p2, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast p2, Lcom/whoop/data/remote/domain/dto/InvitationDto;

    if-eqz p2, :cond_4

    invoke-virtual {p2, p1}, Lcom/whoop/data/remote/domain/dto/InvitationDto;->toInvitation(Ljava/lang/String;)Lcom/whoop/domain/model/Invitation;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Lcom/whoop/network/exception/DomainException;

    sget-object p2, Lcom/whoop/domain/exception/InviteCodeException$a;->EMPTY_BODY:Lcom/whoop/domain/exception/InviteCodeException$a;

    invoke-direct {p1, p2, v5, v4, v5}, Lcom/whoop/network/exception/DomainException;-><init>(Lcom/whoop/network/exception/DomainException$b;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :cond_5
    iget p1, v0, Lud3/x0;->z:I

    const/16 p2, 0x193

    if-eq p1, p2, :cond_7

    const/16 p2, 0x1a6

    if-eq p1, p2, :cond_6

    sget-object p1, Lcom/whoop/network/exception/DomainException$c;->NETWORK_ERROR:Lcom/whoop/network/exception/DomainException$c;

    goto :goto_2

    :cond_6
    sget-object p1, Lcom/whoop/domain/exception/InviteCodeException$a;->CODE_TYPE_MISMATCH:Lcom/whoop/domain/exception/InviteCodeException$a;

    goto :goto_2

    :cond_7
    sget-object p1, Lcom/whoop/domain/exception/InviteCodeException$a;->CODE_NOT_VALID:Lcom/whoop/domain/exception/InviteCodeException$a;

    :goto_2
    new-instance p2, Lcom/whoop/network/exception/DomainException;

    invoke-direct {p2, p1, v5, v4, v5}, Lcom/whoop/network/exception/DomainException;-><init>(Lcom/whoop/network/exception/DomainException$b;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p2
    :try_end_1
    .catch Lretrofit2/HttpException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    new-instance p1, Lcom/whoop/network/exception/DomainException;

    sget-object p2, Lcom/whoop/network/exception/DomainException$c;->HTTP_ERROR:Lcom/whoop/network/exception/DomainException$c;

    invoke-direct {p1, p2, v5, v4, v5}, Lcom/whoop/network/exception/DomainException;-><init>(Lcom/whoop/network/exception/DomainException$b;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1

    :catch_1
    new-instance p1, Lcom/whoop/network/exception/DomainException;

    sget-object p2, Lcom/whoop/network/exception/DomainException$c;->HTTP_ERROR:Lcom/whoop/network/exception/DomainException$c;

    invoke-direct {p1, p2, v5, v4, v5}, Lcom/whoop/network/exception/DomainException;-><init>(Lcom/whoop/network/exception/DomainException$b;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw p1
.end method
