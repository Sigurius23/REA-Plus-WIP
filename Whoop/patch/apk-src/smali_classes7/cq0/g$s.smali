.class public final Lcq0/g$s;
.super Lcq0/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcq0/g;->Q(Lcom/whoop/domain/model/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/lifecycle/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcq0/e<",
        "Ljava/util/List<",
        "+",
        "Lcom/whoop/data/local/room/entity/TeamsDto;",
        ">;",
        "Ljava/util/List<",
        "+",
        "Lcom/whoop/data/local/room/entity/TeamsDto;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002*\u0001\u0000\u0008\n\u0018\u00002\u001a\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0014\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\t2\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001b\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u000cH\u0014\u00a2\u0006\u0004\u0008\r\u0010\u000eJ!\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u00020\u000f0\u000cH\u0014\u00a2\u0006\u0004\u0008\u0010\u0010\u000e\u00a8\u0006\u0011"
    }
    d2 = {
        "cq0/g$s",
        "Lcq0/e;",
        "",
        "Lcom/whoop/data/local/room/entity/TeamsDto;",
        "item",
        "Ll83/a0;",
        "D",
        "(Ljava/util/List;)V",
        "data",
        "",
        "E",
        "(Ljava/util/List;)Z",
        "Landroidx/lifecycle/p0;",
        "x",
        "()Landroidx/lifecycle/p0;",
        "Lcom/whoop/data/remote/commons/ApiResponse;",
        "m",
        "community_release"
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
.field final synthetic c:Lcq0/g;

.field final synthetic d:Lcom/whoop/domain/model/User;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Ljava/lang/String;

.field final synthetic g:Ljava/lang/String;

.field final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcq0/g;Lcom/whoop/domain/model/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/data/remote/commons/AppExecutors;)V
    .locals 0

    iput-object p1, p0, Lcq0/g$s;->c:Lcq0/g;

    iput-object p2, p0, Lcq0/g$s;->d:Lcom/whoop/domain/model/User;

    iput-object p3, p0, Lcq0/g$s;->e:Ljava/lang/String;

    iput-object p4, p0, Lcq0/g$s;->f:Ljava/lang/String;

    iput-object p5, p0, Lcq0/g$s;->g:Ljava/lang/String;

    iput-object p6, p0, Lcq0/g$s;->h:Ljava/lang/String;

    invoke-direct {p0, p7}, Lcq0/e;-><init>(Lcom/whoop/data/remote/commons/AppExecutors;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic A(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcq0/g$s;->D(Ljava/util/List;)V

    return-void
.end method

.method public bridge synthetic C(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcq0/g$s;->E(Ljava/util/List;)Z

    move-result p1

    return p1
.end method

.method public D(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/data/local/room/entity/TeamsDto;",
            ">;)V"
        }
    .end annotation

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcq0/g$s;->c:Lcq0/g;

    invoke-virtual {v0}, Lcq0/g;->O()Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;

    move-result-object v0

    iget-object v1, p0, Lcq0/g$s;->d:Lcom/whoop/domain/model/User;

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getId()I

    move-result v1

    invoke-interface {v0, v1, p1}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;->updateTeams(ILjava/util/List;)V

    return-void
.end method

.method public E(Ljava/util/List;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/data/local/room/entity/TeamsDto;",
            ">;)Z"
        }
    .end annotation

    const/4 p1, 0x1

    return p1
.end method

.method public m()Landroidx/lifecycle/p0;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lcq0/g$s;->c:Lcq0/g;

    invoke-virtual {v0}, Lcq0/g;->K()Lcom/whoop/data/remote/RemoteDataSource;

    move-result-object v1

    iget-object v0, p0, Lcq0/g$s;->d:Lcom/whoop/domain/model/User;

    invoke-virtual {v0}, Lcom/whoop/domain/model/User;->getId()I

    move-result v2

    iget-object v3, p0, Lcq0/g$s;->e:Ljava/lang/String;

    iget-object v4, p0, Lcq0/g$s;->f:Ljava/lang/String;

    iget-object v5, p0, Lcq0/g$s;->g:Ljava/lang/String;

    iget-object v6, p0, Lcq0/g$s;->h:Ljava/lang/String;

    invoke-interface/range {v1 .. v6}, Lcom/whoop/data/remote/RemoteDataSource;->getTeamsWithRankLiveData(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/lifecycle/p0;

    move-result-object v0

    return-object v0
.end method

.method public x()Landroidx/lifecycle/p0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lcq0/g$s;->c:Lcq0/g;

    invoke-virtual {v0}, Lcq0/g;->O()Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;

    move-result-object v0

    iget-object v1, p0, Lcq0/g$s;->d:Lcom/whoop/domain/model/User;

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getId()I

    move-result v1

    invoke-interface {v0, v1}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;->getLiveTeamData(I)Landroidx/lifecycle/p0;

    move-result-object v0

    return-object v0
.end method
