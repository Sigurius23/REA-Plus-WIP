.class public final enum Lbi2/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lbi2/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lbi2/a;",
        "",
        "",
        "tag",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getTag",
        "()Ljava/lang/String;",
        "Cancelled",
        "Stuck",
        "SensorInfoNull",
        "SendCommandException",
        "PacketFlowException",
        "Unknown",
        "strap-history-sync_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lbi2/a;

.field public static final enum Cancelled:Lbi2/a;

.field public static final enum PacketFlowException:Lbi2/a;

.field public static final enum SendCommandException:Lbi2/a;

.field public static final enum SensorInfoNull:Lbi2/a;

.field public static final enum Stuck:Lbi2/a;

.field public static final enum Unknown:Lbi2/a;


# instance fields
.field private final tag:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lbi2/a;
    .locals 6

    sget-object v0, Lbi2/a;->Cancelled:Lbi2/a;

    sget-object v1, Lbi2/a;->Stuck:Lbi2/a;

    sget-object v2, Lbi2/a;->SensorInfoNull:Lbi2/a;

    sget-object v3, Lbi2/a;->SendCommandException:Lbi2/a;

    sget-object v4, Lbi2/a;->PacketFlowException:Lbi2/a;

    sget-object v5, Lbi2/a;->Unknown:Lbi2/a;

    filled-new-array/range {v0 .. v5}, [Lbi2/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lbi2/a;

    const/4 v1, 0x0

    const-string v2, "cancelled"

    const-string v3, "Cancelled"

    invoke-direct {v0, v3, v1, v2}, Lbi2/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbi2/a;->Cancelled:Lbi2/a;

    new-instance v0, Lbi2/a;

    const/4 v1, 0x1

    const-string v2, "stuck"

    const-string v3, "Stuck"

    invoke-direct {v0, v3, v1, v2}, Lbi2/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbi2/a;->Stuck:Lbi2/a;

    new-instance v0, Lbi2/a;

    const/4 v1, 0x2

    const-string v2, "sensor_info_null"

    const-string v3, "SensorInfoNull"

    invoke-direct {v0, v3, v1, v2}, Lbi2/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbi2/a;->SensorInfoNull:Lbi2/a;

    new-instance v0, Lbi2/a;

    const/4 v1, 0x3

    const-string v2, "send_command_exception"

    const-string v3, "SendCommandException"

    invoke-direct {v0, v3, v1, v2}, Lbi2/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbi2/a;->SendCommandException:Lbi2/a;

    new-instance v0, Lbi2/a;

    const/4 v1, 0x4

    const-string v2, "packet_flow_exception"

    const-string v3, "PacketFlowException"

    invoke-direct {v0, v3, v1, v2}, Lbi2/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbi2/a;->PacketFlowException:Lbi2/a;

    new-instance v0, Lbi2/a;

    const/4 v1, 0x5

    const-string v2, "unknown"

    const-string v3, "Unknown"

    invoke-direct {v0, v3, v1, v2}, Lbi2/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lbi2/a;->Unknown:Lbi2/a;

    invoke-static {}, Lbi2/a;->$values()[Lbi2/a;

    move-result-object v0

    sput-object v0, Lbi2/a;->$VALUES:[Lbi2/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lbi2/a;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lbi2/a;->tag:Ljava/lang/String;

    return-void
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lbi2/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lbi2/a;
    .locals 1

    const-class v0, Lbi2/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lbi2/a;

    return-object p0
.end method

.method public static values()[Lbi2/a;
    .locals 1

    sget-object v0, Lbi2/a;->$VALUES:[Lbi2/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lbi2/a;

    return-object v0
.end method


# virtual methods
.method public final getTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lbi2/a;->tag:Ljava/lang/String;

    return-object v0
.end method
