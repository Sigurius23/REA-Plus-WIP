.class public interface abstract Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008g\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001e\u0010\t\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004H\u00a7@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000e\u001a\u00020\rH\u00a7@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007H\u00a7@\u00a2\u0006\u0004\u0008\u0011\u0010\u000cJ\u001e\u0010\u0012\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007H\u0097@\u00a2\u0006\u0004\u0008\u0012\u0010\n\u00a8\u0006\u0013\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao;",
        "",
        "Lcom/whoop/data/local/room/entity/OptimalStrainMapping;",
        "optimalStrainMapping",
        "Ll83/a0;",
        "insert",
        "(Lcom/whoop/data/local/room/entity/OptimalStrainMapping;Lq83/d;)Ljava/lang/Object;",
        "",
        "optimalStrainMappings",
        "insertAll",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "deleteAll",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "recovery",
        "getOptimalStrainForRecovery",
        "(ILq83/d;)Ljava/lang/Object;",
        "getAll",
        "replaceAll",
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
.method public static synthetic access$replaceAll$jd(Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao;->replaceAll(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static replaceAll$suspendImpl(Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao;",
            "Ljava/util/List<",
            "Lcom/whoop/data/local/room/entity/OptimalStrainMapping;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao$replaceAll$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao$replaceAll$1;

    iget v1, v0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao$replaceAll$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao$replaceAll$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao$replaceAll$1;

    invoke-direct {v0, p0, p2}, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao$replaceAll$1;-><init>(Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao$replaceAll$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao$replaceAll$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao$replaceAll$1;->L$1:Ljava/lang/Object;

    check-cast p0, Ljava/util/List;

    iget-object p0, v0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao$replaceAll$1;->L$0:Ljava/lang/Object;

    check-cast p0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao$replaceAll$1;->L$1:Ljava/lang/Object;

    move-object p1, p0

    check-cast p1, Ljava/util/List;

    iget-object p0, v0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao$replaceAll$1;->L$0:Ljava/lang/Object;

    check-cast p0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao$replaceAll$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao$replaceAll$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao$replaceAll$1;->label:I

    invoke-interface {p0, v0}, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao;->deleteAll(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    const/4 p2, 0x0

    iput-object p2, v0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao$replaceAll$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao$replaceAll$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao$replaceAll$1;->label:I

    invoke-interface {p0, p1, v0}, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao;->insertAll(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public abstract deleteAll(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getAll(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lcom/whoop/data/local/room/entity/OptimalStrainMapping;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract getOptimalStrainForRecovery(ILq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/local/room/entity/OptimalStrainMapping;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract insert(Lcom/whoop/data/local/room/entity/OptimalStrainMapping;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/local/room/entity/OptimalStrainMapping;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract insertAll(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/data/local/room/entity/OptimalStrainMapping;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public replaceAll(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/data/local/room/entity/OptimalStrainMapping;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao;->replaceAll$suspendImpl(Lcom/whoop/data/local/room/dao/persistent/OptimalStrainMappingDao;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
