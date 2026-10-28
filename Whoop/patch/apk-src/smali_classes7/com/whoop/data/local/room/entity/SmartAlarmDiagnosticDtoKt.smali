.class public final Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDtoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00030\u0001\u00a8\u0006\u0004"
    }
    d2 = {
        "toRequestBody",
        "",
        "Lcom/whoop/service/network/model/SmartAlarmDiagnosticBody;",
        "Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;",
        "app_prodStandardRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final toRequestBody(Ljava/util/List;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/whoop/service/network/model/SmartAlarmDiagnosticBody;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;

    new-instance v2, Lcom/whoop/service/network/model/SmartAlarmDiagnosticBody;

    invoke-virtual {v1}, Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;->getEventType()Lf82/a;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;->getMobileEventMetadata()Lcom/whoop/service/network/model/MobileEventMetaData;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;->getAlarmTrigger()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/whoop/data/local/room/entity/SmartAlarmDiagnosticDto;->getTimestamp()J

    move-result-wide v6

    invoke-direct/range {v2 .. v7}, Lcom/whoop/service/network/model/SmartAlarmDiagnosticBody;-><init>(Lf82/a;Lcom/whoop/service/network/model/MobileEventMetaData;Ljava/lang/String;J)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method
