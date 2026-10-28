.class public final Lcom/whoop/data/local/room/entity/GpsMetaDataDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0008\r\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u0008\"\u0004\u0008\u000c\u0010\nR\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u0008\"\u0004\u0008\u000f\u0010\n\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/data/local/room/entity/GpsMetaDataDto;",
        "",
        "start",
        "",
        "end",
        "<init>",
        "(JJ)V",
        "getStart",
        "()J",
        "setStart",
        "(J)V",
        "getEnd",
        "setEnd",
        "id",
        "getId",
        "setId",
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


# instance fields
.field private end:J

.field private id:J

.field private start:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/whoop/data/local/room/entity/GpsMetaDataDto;->start:J

    iput-wide p3, p0, Lcom/whoop/data/local/room/entity/GpsMetaDataDto;->end:J

    return-void
.end method


# virtual methods
.method public final getEnd()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/GpsMetaDataDto;->end:J

    return-wide v0
.end method

.method public final getId()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/GpsMetaDataDto;->id:J

    return-wide v0
.end method

.method public final getStart()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/GpsMetaDataDto;->start:J

    return-wide v0
.end method

.method public final setEnd(J)V
    .locals 0

    iput-wide p1, p0, Lcom/whoop/data/local/room/entity/GpsMetaDataDto;->end:J

    return-void
.end method

.method public final setId(J)V
    .locals 0

    iput-wide p1, p0, Lcom/whoop/data/local/room/entity/GpsMetaDataDto;->id:J

    return-void
.end method

.method public final setStart(J)V
    .locals 0

    iput-wide p1, p0, Lcom/whoop/data/local/room/entity/GpsMetaDataDto;->start:J

    return-void
.end method
