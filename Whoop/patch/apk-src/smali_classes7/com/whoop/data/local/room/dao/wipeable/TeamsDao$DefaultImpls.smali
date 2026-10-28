.class public final Lcom/whoop/data/local/room/dao/wipeable/TeamsDao$DefaultImpls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "DefaultImpls"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static updateTeams(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;",
            "I",
            "Ljava/util/List<",
            "Lcom/whoop/data/local/room/entity/TeamsDto;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const-string v0, "teams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;->access$updateTeams$jd(Lcom/whoop/data/local/room/dao/wipeable/TeamsDao;ILjava/util/List;)V

    return-void
.end method
