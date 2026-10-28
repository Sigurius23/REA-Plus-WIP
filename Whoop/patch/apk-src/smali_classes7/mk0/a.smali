.class public final enum Lmk0/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lmk0/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000f\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\r\u0010\u0008\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lmk0/a;",
        "",
        "",
        "stepNumber",
        "",
        "failureDescription",
        "<init>",
        "(Ljava/lang/String;IILjava/lang/String;)V",
        "toFailureMessage",
        "()Ljava/lang/String;",
        "I",
        "Ljava/lang/String;",
        "BLE_CONNECT_FAILED",
        "SERVICE_DISCOVERY_FAILED",
        "BLE_BONDING_FAILED",
        "CHARACTERISTIC_NOTIFICATIONS_EMPTY",
        "CHARACTERISTIC_NOTIFICATIONS_FAILED",
        "HELLO_PACKET_EXCHANGE_FAILED",
        "SET_RTC_FAILED",
        "connectivity_release"
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

.field private static final synthetic $VALUES:[Lmk0/a;

.field public static final enum BLE_BONDING_FAILED:Lmk0/a;

.field public static final enum BLE_CONNECT_FAILED:Lmk0/a;

.field public static final enum CHARACTERISTIC_NOTIFICATIONS_EMPTY:Lmk0/a;

.field public static final enum CHARACTERISTIC_NOTIFICATIONS_FAILED:Lmk0/a;

.field public static final enum HELLO_PACKET_EXCHANGE_FAILED:Lmk0/a;

.field public static final enum SERVICE_DISCOVERY_FAILED:Lmk0/a;

.field public static final enum SET_RTC_FAILED:Lmk0/a;


# instance fields
.field private final failureDescription:Ljava/lang/String;

.field private final stepNumber:I


# direct methods
.method private static final synthetic $values()[Lmk0/a;
    .locals 7

    sget-object v0, Lmk0/a;->BLE_CONNECT_FAILED:Lmk0/a;

    sget-object v1, Lmk0/a;->SERVICE_DISCOVERY_FAILED:Lmk0/a;

    sget-object v2, Lmk0/a;->BLE_BONDING_FAILED:Lmk0/a;

    sget-object v3, Lmk0/a;->CHARACTERISTIC_NOTIFICATIONS_EMPTY:Lmk0/a;

    sget-object v4, Lmk0/a;->CHARACTERISTIC_NOTIFICATIONS_FAILED:Lmk0/a;

    sget-object v5, Lmk0/a;->HELLO_PACKET_EXCHANGE_FAILED:Lmk0/a;

    sget-object v6, Lmk0/a;->SET_RTC_FAILED:Lmk0/a;

    filled-new-array/range {v0 .. v6}, [Lmk0/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lmk0/a;

    const-string v1, "BLE Connect Failed"

    const-string v2, "BLE_CONNECT_FAILED"

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v2, v3, v4, v1}, Lmk0/a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lmk0/a;->BLE_CONNECT_FAILED:Lmk0/a;

    new-instance v0, Lmk0/a;

    const-string v1, "BLE Service Discovery Failed"

    const-string v2, "SERVICE_DISCOVERY_FAILED"

    const/4 v3, 0x2

    invoke-direct {v0, v2, v4, v3, v1}, Lmk0/a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lmk0/a;->SERVICE_DISCOVERY_FAILED:Lmk0/a;

    new-instance v0, Lmk0/a;

    const-string v1, "BLE Bonding Failed"

    const-string v2, "BLE_BONDING_FAILED"

    const/4 v4, 0x3

    invoke-direct {v0, v2, v3, v4, v1}, Lmk0/a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lmk0/a;->BLE_BONDING_FAILED:Lmk0/a;

    new-instance v0, Lmk0/a;

    const-string v1, "No characteristics to register for notifications"

    const-string v2, "CHARACTERISTIC_NOTIFICATIONS_EMPTY"

    const/4 v3, 0x4

    invoke-direct {v0, v2, v4, v3, v1}, Lmk0/a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lmk0/a;->CHARACTERISTIC_NOTIFICATIONS_EMPTY:Lmk0/a;

    new-instance v0, Lmk0/a;

    const-string v1, "CHARACTERISTIC_NOTIFICATIONS_FAILED"

    const-string v2, "BLE Characteristic Notification Registration Failed"

    invoke-direct {v0, v1, v3, v3, v2}, Lmk0/a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lmk0/a;->CHARACTERISTIC_NOTIFICATIONS_FAILED:Lmk0/a;

    new-instance v0, Lmk0/a;

    const/4 v1, 0x5

    const-string v2, "BLE Synchronous send FAILED to get Hello Command Response Packet!"

    const-string v3, "HELLO_PACKET_EXCHANGE_FAILED"

    invoke-direct {v0, v3, v1, v1, v2}, Lmk0/a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lmk0/a;->HELLO_PACKET_EXCHANGE_FAILED:Lmk0/a;

    new-instance v0, Lmk0/a;

    const/4 v1, 0x6

    const-string v2, "BLE Synchronous Clock Synchronization Failed!"

    const-string v3, "SET_RTC_FAILED"

    invoke-direct {v0, v3, v1, v1, v2}, Lmk0/a;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lmk0/a;->SET_RTC_FAILED:Lmk0/a;

    invoke-static {}, Lmk0/a;->$values()[Lmk0/a;

    move-result-object v0

    sput-object v0, Lmk0/a;->$VALUES:[Lmk0/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lmk0/a;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lmk0/a;->stepNumber:I

    iput-object p4, p0, Lmk0/a;->failureDescription:Ljava/lang/String;

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

    sget-object v0, Lmk0/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lmk0/a;
    .locals 1

    const-class v0, Lmk0/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmk0/a;

    return-object p0
.end method

.method public static values()[Lmk0/a;
    .locals 1

    sget-object v0, Lmk0/a;->$VALUES:[Lmk0/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmk0/a;

    return-object v0
.end method


# virtual methods
.method public final toFailureMessage()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lmk0/a;->stepNumber:I

    iget-object v1, p0, Lmk0/a;->failureDescription:Ljava/lang/String;

    const-string v2, "Connection Step: "

    const-string v3, " "

    invoke-static {v0, v2, v3, v1}, Ld;->j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
