.class public final enum Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0014\u0008\u0086\u0081\u0002\u0018\u0000 \u00182\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u0019\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014j\u0002\u0008\u0015j\u0002\u0008\u0016j\u0002\u0008\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;",
        "",
        "code",
        "",
        "description",
        "",
        "<init>",
        "(Ljava/lang/String;IILjava/lang/String;)V",
        "getCode",
        "()I",
        "getDescription",
        "()Ljava/lang/String;",
        "UNKNOWN",
        "VALID_PATTERN",
        "INVALID_EFFECT",
        "INVALID_LOOPS",
        "INVALID_DURATION",
        "SUCCESSFUL_PLAY",
        "HAPTICS_FAILURE",
        "HAPTICS_TIMEOUT",
        "HAPTICS_BUSY",
        "HAPTICS_STOPPED",
        "INVALID_ALARM_TIME",
        "INVALID_ALARM_ID",
        "Companion",
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

.field private static final synthetic $VALUES:[Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

.field public static final Companion:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage$Companion;

.field public static final enum HAPTICS_BUSY:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

.field public static final enum HAPTICS_FAILURE:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

.field public static final enum HAPTICS_STOPPED:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

.field public static final enum HAPTICS_TIMEOUT:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

.field public static final enum INVALID_ALARM_ID:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

.field public static final enum INVALID_ALARM_TIME:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

.field public static final enum INVALID_DURATION:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

.field public static final enum INVALID_EFFECT:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

.field public static final enum INVALID_LOOPS:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

.field public static final enum SUCCESSFUL_PLAY:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

.field public static final enum UNKNOWN:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

.field public static final enum VALID_PATTERN:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;


# instance fields
.field private final code:I

.field private final description:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;
    .locals 12

    sget-object v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->UNKNOWN:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    sget-object v1, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->VALID_PATTERN:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    sget-object v2, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->INVALID_EFFECT:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    sget-object v3, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->INVALID_LOOPS:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    sget-object v4, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->INVALID_DURATION:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    sget-object v5, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->SUCCESSFUL_PLAY:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    sget-object v6, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->HAPTICS_FAILURE:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    sget-object v7, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->HAPTICS_TIMEOUT:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    sget-object v8, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->HAPTICS_BUSY:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    sget-object v9, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->HAPTICS_STOPPED:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    sget-object v10, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->INVALID_ALARM_TIME:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    sget-object v11, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->INVALID_ALARM_ID:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    filled-new-array/range {v0 .. v11}, [Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    const/4 v1, 0x0

    const-string v2, "Unknown status"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->UNKNOWN:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    new-instance v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    const/4 v1, 0x1

    const-string v2, "Input pattern is valid"

    const-string v3, "VALID_PATTERN"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->VALID_PATTERN:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    new-instance v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    const/4 v1, 0x2

    const-string v2, "Input pattern has an invalid waveform effect"

    const-string v3, "INVALID_EFFECT"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->INVALID_EFFECT:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    new-instance v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    const/4 v1, 0x3

    const-string v2, "Input pattern has an invalid number of loops"

    const-string v3, "INVALID_LOOPS"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->INVALID_LOOPS:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    new-instance v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    const/4 v1, 0x4

    const-string v2, "Input pattern has an invalid duration"

    const-string v3, "INVALID_DURATION"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->INVALID_DURATION:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    new-instance v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    const/4 v1, 0x5

    const-string v2, "Alarm played successfully"

    const-string v3, "SUCCESSFUL_PLAY"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->SUCCESSFUL_PLAY:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    new-instance v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    const/4 v1, 0x6

    const-string v2, "Haptics failure"

    const-string v3, "HAPTICS_FAILURE"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->HAPTICS_FAILURE:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    new-instance v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    const/4 v1, 0x7

    const-string v2, "Haptics timed out"

    const-string v3, "HAPTICS_TIMEOUT"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->HAPTICS_TIMEOUT:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    new-instance v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    const/16 v1, 0x8

    const-string v2, "Haptics is busy"

    const-string v3, "HAPTICS_BUSY"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->HAPTICS_BUSY:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    new-instance v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    const/16 v1, 0x9

    const-string v2, "Haptics stopped"

    const-string v3, "HAPTICS_STOPPED"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->HAPTICS_STOPPED:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    new-instance v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    const/16 v1, 0xa

    const-string v2, "Invalid alarm time"

    const-string v3, "INVALID_ALARM_TIME"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->INVALID_ALARM_TIME:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    new-instance v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    const/16 v1, 0xb

    const-string v2, "Invalid alarm ID"

    const-string v3, "INVALID_ALARM_ID"

    invoke-direct {v0, v3, v1, v1, v2}, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;-><init>(Ljava/lang/String;IILjava/lang/String;)V

    sput-object v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->INVALID_ALARM_ID:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    invoke-static {}, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->$values()[Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    move-result-object v0

    sput-object v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->$VALUES:[Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->Companion:Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage$Companion;

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

    iput p3, p0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->code:I

    iput-object p4, p0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->description:Ljava/lang/String;

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

    sget-object v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;
    .locals 1

    const-class v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    return-object p0
.end method

.method public static values()[Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;
    .locals 1

    sget-object v0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->$VALUES:[Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;

    return-object v0
.end method


# virtual methods
.method public final getCode()I
    .locals 1

    iget v0, p0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->code:I

    return v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/domain/model/haptics/HapticsAlarmStatusMessage;->description:Ljava/lang/String;

    return-object v0
.end method
