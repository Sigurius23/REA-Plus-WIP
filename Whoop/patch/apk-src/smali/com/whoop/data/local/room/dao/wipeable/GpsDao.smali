.class public interface abstract Lcom/whoop/data/local/room/dao/wipeable/GpsDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0008g\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\'\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000c\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008\u000c\u0010\rJ%\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J+\u0010\u0012\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u000e0\u00112\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\'\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140\u000e0\u0011H\'\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\'\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 \u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/data/local/room/dao/wipeable/GpsDao;",
        "",
        "Lcom/whoop/data/local/room/entity/GpsDto;",
        "gpsDto",
        "Ll83/a0;",
        "saveGpsDto",
        "(Lcom/whoop/data/local/room/entity/GpsDto;)V",
        "",
        "count",
        "()J",
        "start",
        "end",
        "removeGpsData",
        "(JJ)V",
        "",
        "getGpsData",
        "(JJ)Ljava/util/List;",
        "Landroidx/lifecycle/p0;",
        "getGpsLiveData",
        "(JJ)Landroidx/lifecycle/p0;",
        "Lcom/whoop/data/local/room/entity/GpsMetaDataDto;",
        "gpsMetaDataDto",
        "saveGpsMetaData",
        "(Lcom/whoop/data/local/room/entity/GpsMetaDataDto;)V",
        "getGpsMetaData",
        "()Landroidx/lifecycle/p0;",
        "",
        "getGpsMetaCount",
        "()I",
        "id",
        "deleteGpsMeta",
        "(J)V",
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


# virtual methods
.method public abstract count()J
.end method

.method public abstract deleteGpsMeta(J)V
.end method

.method public abstract getGpsData(JJ)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Ljava/util/List<",
            "Lcom/whoop/data/local/room/entity/GpsDto;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getGpsLiveData(JJ)Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ)",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end method

.method public abstract getGpsMetaCount()I
.end method

.method public abstract getGpsMetaData()Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end method

.method public abstract removeGpsData(JJ)V
.end method

.method public abstract saveGpsDto(Lcom/whoop/data/local/room/entity/GpsDto;)V
.end method

.method public abstract saveGpsMetaData(Lcom/whoop/data/local/room/entity/GpsMetaDataDto;)V
.end method
