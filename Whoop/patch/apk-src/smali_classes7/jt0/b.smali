.class public final enum Ljt0/b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ljt0/b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0010\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Ljt0/b;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "HISTORICAL_R10",
        "HISTORICAL_R11",
        "HISTORICAL_R12",
        "HISTORICAL_RAW_ECG",
        "HISTORICAL_OPTICAL_R20_MAVERICK",
        "HISTORICAL_IMU",
        "HISTORICAL_METRICS_R24_HARVARD",
        "REALTIME_HR",
        "REALTIME_OPTICAL_R20_MAVERICK",
        "REALTIME_IMU",
        "REALTIME_R10",
        "REALTIME_R11",
        "REALTIME_FILTERED_ECG",
        "connectivity-core_release"
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

.field private static final synthetic $VALUES:[Ljt0/b;

.field public static final enum HISTORICAL_IMU:Ljt0/b;

.field public static final enum HISTORICAL_METRICS_R24_HARVARD:Ljt0/b;

.field public static final enum HISTORICAL_OPTICAL_R20_MAVERICK:Ljt0/b;

.field public static final enum HISTORICAL_R10:Ljt0/b;

.field public static final enum HISTORICAL_R11:Ljt0/b;

.field public static final enum HISTORICAL_R12:Ljt0/b;

.field public static final enum HISTORICAL_RAW_ECG:Ljt0/b;

.field public static final enum REALTIME_FILTERED_ECG:Ljt0/b;

.field public static final enum REALTIME_HR:Ljt0/b;

.field public static final enum REALTIME_IMU:Ljt0/b;

.field public static final enum REALTIME_OPTICAL_R20_MAVERICK:Ljt0/b;

.field public static final enum REALTIME_R10:Ljt0/b;

.field public static final enum REALTIME_R11:Ljt0/b;


# direct methods
.method private static final synthetic $values()[Ljt0/b;
    .locals 13

    sget-object v0, Ljt0/b;->HISTORICAL_R10:Ljt0/b;

    sget-object v1, Ljt0/b;->HISTORICAL_R11:Ljt0/b;

    sget-object v2, Ljt0/b;->HISTORICAL_R12:Ljt0/b;

    sget-object v3, Ljt0/b;->HISTORICAL_RAW_ECG:Ljt0/b;

    sget-object v4, Ljt0/b;->HISTORICAL_OPTICAL_R20_MAVERICK:Ljt0/b;

    sget-object v5, Ljt0/b;->HISTORICAL_IMU:Ljt0/b;

    sget-object v6, Ljt0/b;->HISTORICAL_METRICS_R24_HARVARD:Ljt0/b;

    sget-object v7, Ljt0/b;->REALTIME_HR:Ljt0/b;

    sget-object v8, Ljt0/b;->REALTIME_OPTICAL_R20_MAVERICK:Ljt0/b;

    sget-object v9, Ljt0/b;->REALTIME_IMU:Ljt0/b;

    sget-object v10, Ljt0/b;->REALTIME_R10:Ljt0/b;

    sget-object v11, Ljt0/b;->REALTIME_R11:Ljt0/b;

    sget-object v12, Ljt0/b;->REALTIME_FILTERED_ECG:Ljt0/b;

    filled-new-array/range {v0 .. v12}, [Ljt0/b;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljt0/b;

    const-string v1, "HISTORICAL_R10"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ljt0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljt0/b;->HISTORICAL_R10:Ljt0/b;

    new-instance v0, Ljt0/b;

    const-string v1, "HISTORICAL_R11"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ljt0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljt0/b;->HISTORICAL_R11:Ljt0/b;

    new-instance v0, Ljt0/b;

    const-string v1, "HISTORICAL_R12"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ljt0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljt0/b;->HISTORICAL_R12:Ljt0/b;

    new-instance v0, Ljt0/b;

    const-string v1, "HISTORICAL_RAW_ECG"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ljt0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljt0/b;->HISTORICAL_RAW_ECG:Ljt0/b;

    new-instance v0, Ljt0/b;

    const-string v1, "HISTORICAL_OPTICAL_R20_MAVERICK"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ljt0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljt0/b;->HISTORICAL_OPTICAL_R20_MAVERICK:Ljt0/b;

    new-instance v0, Ljt0/b;

    const-string v1, "HISTORICAL_IMU"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Ljt0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljt0/b;->HISTORICAL_IMU:Ljt0/b;

    new-instance v0, Ljt0/b;

    const-string v1, "HISTORICAL_METRICS_R24_HARVARD"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Ljt0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljt0/b;->HISTORICAL_METRICS_R24_HARVARD:Ljt0/b;

    new-instance v0, Ljt0/b;

    const-string v1, "REALTIME_HR"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Ljt0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljt0/b;->REALTIME_HR:Ljt0/b;

    new-instance v0, Ljt0/b;

    const-string v1, "REALTIME_OPTICAL_R20_MAVERICK"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Ljt0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljt0/b;->REALTIME_OPTICAL_R20_MAVERICK:Ljt0/b;

    new-instance v0, Ljt0/b;

    const-string v1, "REALTIME_IMU"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Ljt0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljt0/b;->REALTIME_IMU:Ljt0/b;

    new-instance v0, Ljt0/b;

    const-string v1, "REALTIME_R10"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Ljt0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljt0/b;->REALTIME_R10:Ljt0/b;

    new-instance v0, Ljt0/b;

    const-string v1, "REALTIME_R11"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Ljt0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljt0/b;->REALTIME_R11:Ljt0/b;

    new-instance v0, Ljt0/b;

    const-string v1, "REALTIME_FILTERED_ECG"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Ljt0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ljt0/b;->REALTIME_FILTERED_ECG:Ljt0/b;

    invoke-static {}, Ljt0/b;->$values()[Ljt0/b;

    move-result-object v0

    sput-object v0, Ljt0/b;->$VALUES:[Ljt0/b;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ljt0/b;->$ENTRIES:Lt83/a;

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

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Ljt0/b;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ljt0/b;
    .locals 1

    const-class v0, Ljt0/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ljt0/b;

    return-object p0
.end method

.method public static values()[Ljt0/b;
    .locals 1

    sget-object v0, Ljt0/b;->$VALUES:[Ljt0/b;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljt0/b;

    return-object v0
.end method
