.class public interface abstract Lcom/whoop/data/remote/RemoteDataSource;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008g\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J#\u0010\n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00080\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\n\u0010\u000bJM\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00150\u00140\u00130\u00122\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0002H&\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J)\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00180\u00140\u00130\u00122\u0006\u0010\r\u001a\u00020\u000cH&\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001b0\u00130\u0012H&\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0016\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u0014H\u00a6@\u00a2\u0006\u0004\u0008\u001f\u0010 J2\u0010&\u001a\u0008\u0012\u0004\u0012\u00020%0\u00082\u0006\u0010\"\u001a\u00020!2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020#H\u00a6@\u00a2\u0006\u0004\u0008&\u0010\'J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(H\u00a6@\u00a2\u0006\u0004\u0008*\u0010 J\u001e\u0010-\u001a\u0008\u0012\u0004\u0012\u00020,0(2\u0006\u0010+\u001a\u00020\u000cH\u00a6@\u00a2\u0006\u0004\u0008-\u0010.J\u0010\u00100\u001a\u00020/H\u00a6@\u00a2\u0006\u0004\u00080\u0010 J\u001e\u00103\u001a\u0008\u0012\u0004\u0012\u00020%0\u00082\u0006\u00102\u001a\u000201H\u00a6@\u00a2\u0006\u0004\u00083\u00104\u00a8\u00065\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/data/remote/RemoteDataSource;",
        "",
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
        "leaderboardType",
        "startDate",
        "endDate",
        "period",
        "Landroidx/lifecycle/p0;",
        "Lcom/whoop/data/remote/commons/ApiResponse;",
        "",
        "Lcom/whoop/data/local/room/entity/TeamsDto;",
        "getTeamsWithRankLiveData",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/lifecycle/p0;",
        "Lcom/whoop/domain/model/teams/TeamInviteDto;",
        "getTeamInviteLiveData",
        "(I)Landroidx/lifecycle/p0;",
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

.annotation runtime Ll83/c;
.end annotation


# virtual methods
.method public abstract getAllProgressLevels(ILq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract getDefaultImagesLiveData()Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end method

.method public abstract getFeatureTeams(Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract getMemberStories(Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract getMembershipInfo(Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract getTeamInviteLiveData(I)Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end method

.method public abstract getTeamsWithRankLiveData(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/lifecycle/p0;
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
.end method

.method public abstract joinTeam(Ljava/lang/String;)Lxg3/g;
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
.end method

.method public abstract recordUserStrap(Lcom/whoop/data/remote/domain/request/RecordUserStrapRequestBody;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract uploadConsoleEventPackets(Lud3/v0;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract validateInviteCode(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method
