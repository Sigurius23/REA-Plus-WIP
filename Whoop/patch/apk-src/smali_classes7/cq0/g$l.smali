.class public final Lcq0/g$l;
.super Lcq0/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcq0/g;->C()Landroidx/lifecycle/p0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcq0/e<",
        "Lcom/whoop/service/network/model/DefaultImages;",
        "Lcom/whoop/service/network/model/DefaultImages;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00040\u0003H\u0014\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0002H\u0014\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0014\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0003H\u0014\u00a2\u0006\u0004\u0008\u000f\u0010\u0006\u00a8\u0006\u0010"
    }
    d2 = {
        "cq0/g$l",
        "Lcq0/e;",
        "Lcom/whoop/service/network/model/DefaultImages;",
        "Landroidx/lifecycle/p0;",
        "Lcom/whoop/data/remote/commons/ApiResponse;",
        "m",
        "()Landroidx/lifecycle/p0;",
        "item",
        "Ll83/a0;",
        "D",
        "(Lcom/whoop/service/network/model/DefaultImages;)V",
        "data",
        "",
        "E",
        "(Lcom/whoop/service/network/model/DefaultImages;)Z",
        "x",
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


# direct methods
.method public constructor <init>(Lcq0/g;Lcom/whoop/data/remote/commons/AppExecutors;)V
    .locals 0

    iput-object p1, p0, Lcq0/g$l;->c:Lcq0/g;

    invoke-direct {p0, p2}, Lcq0/e;-><init>(Lcom/whoop/data/remote/commons/AppExecutors;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic A(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/whoop/service/network/model/DefaultImages;

    invoke-virtual {p0, p1}, Lcq0/g$l;->D(Lcom/whoop/service/network/model/DefaultImages;)V

    return-void
.end method

.method public bridge synthetic C(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Lcom/whoop/service/network/model/DefaultImages;

    invoke-virtual {p0, p1}, Lcq0/g$l;->E(Lcom/whoop/service/network/model/DefaultImages;)Z

    move-result p1

    return p1
.end method

.method public D(Lcom/whoop/service/network/model/DefaultImages;)V
    .locals 1

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcq0/g$l;->c:Lcq0/g;

    invoke-virtual {v0}, Lcq0/g;->O()Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;->saveDefaultImages(Lcom/whoop/service/network/model/DefaultImages;)V

    return-void
.end method

.method public E(Lcom/whoop/service/network/model/DefaultImages;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public m()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lcq0/g$l;->c:Lcq0/g;

    invoke-virtual {v0}, Lcq0/g;->K()Lcom/whoop/data/remote/RemoteDataSource;

    move-result-object v0

    invoke-interface {v0}, Lcom/whoop/data/remote/RemoteDataSource;->getDefaultImagesLiveData()Landroidx/lifecycle/p0;

    move-result-object v0

    return-object v0
.end method

.method public x()Landroidx/lifecycle/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation

    iget-object v0, p0, Lcq0/g$l;->c:Lcq0/g;

    invoke-virtual {v0}, Lcq0/g;->O()Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;

    move-result-object v0

    invoke-interface {v0}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;->getDefaultImagesLiveData()Landroidx/lifecycle/p0;

    move-result-object v0

    return-object v0
.end method
