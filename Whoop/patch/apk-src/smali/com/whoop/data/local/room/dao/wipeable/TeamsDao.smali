.class public interface abstract Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/local/room/dao/wipeable/TeamsDao$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008g\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J#\u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\n0\t2\u0006\u0010\u0008\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ%\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00020\nH\u0017\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\'\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00170\tH\'\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0017H\'\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;",
        "",
        "Lcom/whoop/data/local/room/entity/TeamsDto;",
        "teamsDto",
        "Ll83/a0;",
        "saveTeam",
        "(Lcom/whoop/data/local/room/entity/TeamsDto;)V",
        "",
        "userId",
        "Landroidx/lifecycle/p0;",
        "",
        "getLiveTeamData",
        "(I)Landroidx/lifecycle/p0;",
        "teams",
        "updateTeams",
        "(ILjava/util/List;)V",
        "teamId",
        "",
        "teamType",
        "removeTeam",
        "(ILjava/lang/String;)V",
        "removeAllTeams",
        "(I)V",
        "Lcom/whoop/service/network/model/DefaultImages;",
        "getDefaultImagesLiveData",
        "()Landroidx/lifecycle/p0;",
        "defaultImages",
        "saveDefaultImages",
        "(Lcom/whoop/service/network/model/DefaultImages;)V",
        "getTeamCount",
        "(ILq83/d;)Ljava/lang/Object;",
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


# direct methods
.method public static synthetic access$updateTeams$jd(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;ILjava/util/List;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;->updateTeams(ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public abstract getDefaultImagesLiveData()Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end method

.method public abstract getLiveTeamData(I)Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end method

.method public abstract getTeamCount(ILq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract removeAllTeams(I)V
.end method

.method public abstract removeTeam(ILjava/lang/String;)V
.end method

.method public abstract saveDefaultImages(Lcom/whoop/service/network/model/DefaultImages;)V
.end method

.method public abstract saveTeam(Lcom/whoop/data/local/room/entity/TeamsDto;)V
.end method

.method public updateTeams(ILjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lcom/whoop/data/local/room/entity/TeamsDto;",
            ">;)V"
        }
    .end annotation

    const-string v0, "teams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;->removeAllTeams(I)V

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/local/room/entity/TeamsDto;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/data/local/room/entity/TeamsDto;->setUserId(Ljava/lang/Integer;)V

    invoke-interface {p0, v0}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;->saveTeam(Lcom/whoop/data/local/room/entity/TeamsDto;)V

    goto :goto_0

    :cond_0
    return-void
.end method
