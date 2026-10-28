.class public final Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDeviceKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "NO_HR_DEVICE_ID",
        "",
        "NO_HR_DEVICE",
        "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;",
        "getNO_HR_DEVICE",
        "()Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;",
        "whooplabs_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final NO_HR_DEVICE:Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;

.field public static final NO_HR_DEVICE_ID:Ljava/lang/String; = "-1"


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;

    const-string v1, "-1"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDeviceKt;->NO_HR_DEVICE:Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;

    return-void
.end method

.method public static final getNO_HR_DEVICE()Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDeviceKt;->NO_HR_DEVICE:Lcom/whoop/whooplabs/data/room/entity/WhoopLabsHrDevice;

    return-object v0
.end method
