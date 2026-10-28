.class public final enum Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u0000 \n2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "APP",
        "SLEEP_PROCESS_NOW",
        "ACTIVITY_PROCESS_NOW",
        "IMPLICIT_UPLOAD",
        "STRAP",
        "NONE",
        "Companion",
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

.field private static final synthetic $VALUES:[Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

.field public static final enum ACTIVITY_PROCESS_NOW:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

.field public static final enum APP:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

.field public static final Companion:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource$Companion;

.field public static final enum IMPLICIT_UPLOAD:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

.field public static final enum NONE:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

.field public static final enum SLEEP_PROCESS_NOW:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

.field public static final enum STRAP:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;
    .locals 6

    sget-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->APP:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    sget-object v1, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->SLEEP_PROCESS_NOW:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    sget-object v2, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->ACTIVITY_PROCESS_NOW:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    sget-object v3, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->IMPLICIT_UPLOAD:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    sget-object v4, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->STRAP:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    sget-object v5, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->NONE:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    filled-new-array/range {v0 .. v5}, [Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    const-string v1, "APP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->APP:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    new-instance v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    const-string v1, "SLEEP_PROCESS_NOW"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->SLEEP_PROCESS_NOW:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    new-instance v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    const-string v1, "ACTIVITY_PROCESS_NOW"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->ACTIVITY_PROCESS_NOW:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    new-instance v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    const-string v1, "IMPLICIT_UPLOAD"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->IMPLICIT_UPLOAD:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    new-instance v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    const-string v1, "STRAP"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->STRAP:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    new-instance v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    const-string v1, "NONE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->NONE:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    invoke-static {}, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->$values()[Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    move-result-object v0

    sput-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->$VALUES:[Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->Companion:Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource$Companion;

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

    sget-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;
    .locals 1

    const-class v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    return-object p0
.end method

.method public static values()[Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;
    .locals 1

    sget-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;->$VALUES:[Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/connectivityCore/dataSyncService/models/DeviceTriggerSource;

    return-object v0
.end method
