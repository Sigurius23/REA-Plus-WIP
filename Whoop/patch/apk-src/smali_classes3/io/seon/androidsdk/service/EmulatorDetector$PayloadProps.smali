.class final enum Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

.field public static final enum BATTERY_CAPACITY:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

.field public static final enum BATTERY_TEMPERATURE:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

.field public static final enum BATTERY_VOLTAGE:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

.field public static final enum CPU_COUNT:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

.field public static final enum CPU_TYPE:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

.field public static final enum DEVICE_ID:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

.field public static final enum INPUT_DATA:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

.field public static final enum IS_TABLET:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

.field public static final enum KERNEL_ARCH:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

.field public static final enum KERNEL_VERSION:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

.field public static final enum WIFI_SSID:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;


# instance fields
.field private value:Ljava/lang/String;


# direct methods
.method private static synthetic $values()[Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;
    .locals 11

    sget-object v0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->CPU_TYPE:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    sget-object v1, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->KERNEL_ARCH:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    sget-object v2, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->BATTERY_VOLTAGE:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    sget-object v3, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->BATTERY_TEMPERATURE:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    sget-object v4, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->KERNEL_VERSION:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    sget-object v5, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->WIFI_SSID:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    sget-object v6, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->IS_TABLET:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    sget-object v7, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->INPUT_DATA:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    sget-object v8, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->BATTERY_CAPACITY:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    sget-object v9, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->CPU_COUNT:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    sget-object v10, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->DEVICE_ID:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    filled-new-array/range {v0 .. v10}, [Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    move-result-object v0

    return-object v0
.end method

.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    const/4 v1, 0x0

    const-string v2, "cpu_type"

    const-string v3, "CPU_TYPE"

    invoke-direct {v0, v3, v1, v2}, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->CPU_TYPE:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    new-instance v0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    const/4 v1, 0x1

    const-string v2, "kernel_arch"

    const-string v3, "KERNEL_ARCH"

    invoke-direct {v0, v3, v1, v2}, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->KERNEL_ARCH:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    new-instance v0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    const/4 v1, 0x2

    const-string v2, "battery_voltage"

    const-string v3, "BATTERY_VOLTAGE"

    invoke-direct {v0, v3, v1, v2}, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->BATTERY_VOLTAGE:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    new-instance v0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    const/4 v1, 0x3

    const-string v2, "battery_temperature"

    const-string v3, "BATTERY_TEMPERATURE"

    invoke-direct {v0, v3, v1, v2}, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->BATTERY_TEMPERATURE:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    new-instance v0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    const/4 v1, 0x4

    const-string v2, "kernel_version"

    const-string v3, "KERNEL_VERSION"

    invoke-direct {v0, v3, v1, v2}, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->KERNEL_VERSION:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    new-instance v0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    const/4 v1, 0x5

    const-string v2, "wifi_ssid"

    const-string v3, "WIFI_SSID"

    invoke-direct {v0, v3, v1, v2}, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->WIFI_SSID:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    new-instance v0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    const/4 v1, 0x6

    const-string v2, "is_tablet"

    const-string v3, "IS_TABLET"

    invoke-direct {v0, v3, v1, v2}, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->IS_TABLET:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    new-instance v0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    const/4 v1, 0x7

    const-string v2, "input_device_data"

    const-string v3, "INPUT_DATA"

    invoke-direct {v0, v3, v1, v2}, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->INPUT_DATA:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    new-instance v0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    const/16 v1, 0x8

    const-string v2, "battery_total_capacity"

    const-string v3, "BATTERY_CAPACITY"

    invoke-direct {v0, v3, v1, v2}, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->BATTERY_CAPACITY:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    new-instance v0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    const/16 v1, 0x9

    const-string v2, "cpu_count"

    const-string v3, "CPU_COUNT"

    invoke-direct {v0, v3, v1, v2}, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->CPU_COUNT:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    new-instance v0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    const/16 v1, 0xa

    const-string v2, "device_id"

    const-string v3, "DEVICE_ID"

    invoke-direct {v0, v3, v1, v2}, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->DEVICE_ID:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    invoke-static {}, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->$values()[Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    move-result-object v0

    sput-object v0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->$VALUES:[Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

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

    iput-object p3, p0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->value:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;
    .locals 1

    const-class v0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    return-object p0
.end method

.method public static values()[Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;
    .locals 1

    sget-object v0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->$VALUES:[Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    invoke-virtual {v0}, [Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    return-object v0
.end method


# virtual methods
.method public getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->value:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->getValue()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
