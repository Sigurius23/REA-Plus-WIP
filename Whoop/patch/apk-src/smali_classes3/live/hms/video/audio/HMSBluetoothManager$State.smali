.class public final enum Llive/hms/video/audio/HMSBluetoothManager$State;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/audio/HMSBluetoothManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "State"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Llive/hms/video/audio/HMSBluetoothManager$State;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Llive/hms/video/audio/HMSBluetoothManager$State;

.field public static final enum ERROR:Llive/hms/video/audio/HMSBluetoothManager$State;

.field public static final enum HEADSET_AVAILABLE:Llive/hms/video/audio/HMSBluetoothManager$State;

.field public static final enum HEADSET_UNAVAILABLE:Llive/hms/video/audio/HMSBluetoothManager$State;

.field public static final enum SCO_CONNECTED:Llive/hms/video/audio/HMSBluetoothManager$State;

.field public static final enum SCO_CONNECTING:Llive/hms/video/audio/HMSBluetoothManager$State;

.field public static final enum SCO_DISCONNECTING:Llive/hms/video/audio/HMSBluetoothManager$State;

.field public static final enum UNINITIALIZED:Llive/hms/video/audio/HMSBluetoothManager$State;


# direct methods
.method private static synthetic $values()[Llive/hms/video/audio/HMSBluetoothManager$State;
    .locals 7

    sget-object v0, Llive/hms/video/audio/HMSBluetoothManager$State;->UNINITIALIZED:Llive/hms/video/audio/HMSBluetoothManager$State;

    sget-object v1, Llive/hms/video/audio/HMSBluetoothManager$State;->ERROR:Llive/hms/video/audio/HMSBluetoothManager$State;

    sget-object v2, Llive/hms/video/audio/HMSBluetoothManager$State;->HEADSET_UNAVAILABLE:Llive/hms/video/audio/HMSBluetoothManager$State;

    sget-object v3, Llive/hms/video/audio/HMSBluetoothManager$State;->HEADSET_AVAILABLE:Llive/hms/video/audio/HMSBluetoothManager$State;

    sget-object v4, Llive/hms/video/audio/HMSBluetoothManager$State;->SCO_DISCONNECTING:Llive/hms/video/audio/HMSBluetoothManager$State;

    sget-object v5, Llive/hms/video/audio/HMSBluetoothManager$State;->SCO_CONNECTING:Llive/hms/video/audio/HMSBluetoothManager$State;

    sget-object v6, Llive/hms/video/audio/HMSBluetoothManager$State;->SCO_CONNECTED:Llive/hms/video/audio/HMSBluetoothManager$State;

    filled-new-array/range {v0 .. v6}, [Llive/hms/video/audio/HMSBluetoothManager$State;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Llive/hms/video/audio/HMSBluetoothManager$State;

    const-string v1, "UNINITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Llive/hms/video/audio/HMSBluetoothManager$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/audio/HMSBluetoothManager$State;->UNINITIALIZED:Llive/hms/video/audio/HMSBluetoothManager$State;

    new-instance v0, Llive/hms/video/audio/HMSBluetoothManager$State;

    const-string v1, "ERROR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Llive/hms/video/audio/HMSBluetoothManager$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/audio/HMSBluetoothManager$State;->ERROR:Llive/hms/video/audio/HMSBluetoothManager$State;

    new-instance v0, Llive/hms/video/audio/HMSBluetoothManager$State;

    const-string v1, "HEADSET_UNAVAILABLE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Llive/hms/video/audio/HMSBluetoothManager$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/audio/HMSBluetoothManager$State;->HEADSET_UNAVAILABLE:Llive/hms/video/audio/HMSBluetoothManager$State;

    new-instance v0, Llive/hms/video/audio/HMSBluetoothManager$State;

    const-string v1, "HEADSET_AVAILABLE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Llive/hms/video/audio/HMSBluetoothManager$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/audio/HMSBluetoothManager$State;->HEADSET_AVAILABLE:Llive/hms/video/audio/HMSBluetoothManager$State;

    new-instance v0, Llive/hms/video/audio/HMSBluetoothManager$State;

    const-string v1, "SCO_DISCONNECTING"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Llive/hms/video/audio/HMSBluetoothManager$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/audio/HMSBluetoothManager$State;->SCO_DISCONNECTING:Llive/hms/video/audio/HMSBluetoothManager$State;

    new-instance v0, Llive/hms/video/audio/HMSBluetoothManager$State;

    const-string v1, "SCO_CONNECTING"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Llive/hms/video/audio/HMSBluetoothManager$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/audio/HMSBluetoothManager$State;->SCO_CONNECTING:Llive/hms/video/audio/HMSBluetoothManager$State;

    new-instance v0, Llive/hms/video/audio/HMSBluetoothManager$State;

    const-string v1, "SCO_CONNECTED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Llive/hms/video/audio/HMSBluetoothManager$State;-><init>(Ljava/lang/String;I)V

    sput-object v0, Llive/hms/video/audio/HMSBluetoothManager$State;->SCO_CONNECTED:Llive/hms/video/audio/HMSBluetoothManager$State;

    invoke-static {}, Llive/hms/video/audio/HMSBluetoothManager$State;->$values()[Llive/hms/video/audio/HMSBluetoothManager$State;

    move-result-object v0

    sput-object v0, Llive/hms/video/audio/HMSBluetoothManager$State;->$VALUES:[Llive/hms/video/audio/HMSBluetoothManager$State;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Llive/hms/video/audio/HMSBluetoothManager$State;
    .locals 1

    const-class v0, Llive/hms/video/audio/HMSBluetoothManager$State;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Llive/hms/video/audio/HMSBluetoothManager$State;

    return-object p0
.end method

.method public static values()[Llive/hms/video/audio/HMSBluetoothManager$State;
    .locals 1

    sget-object v0, Llive/hms/video/audio/HMSBluetoothManager$State;->$VALUES:[Llive/hms/video/audio/HMSBluetoothManager$State;

    invoke-virtual {v0}, [Llive/hms/video/audio/HMSBluetoothManager$State;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Llive/hms/video/audio/HMSBluetoothManager$State;

    return-object v0
.end method
