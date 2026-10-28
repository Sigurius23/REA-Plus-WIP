.class public final enum Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "SLEEP",
        "ADD_ACTIVITY",
        "EDIT_ACTIVITY",
        "STRAIN_COACH",
        "STRENGTH_TRAINER",
        "WAD",
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

.field private static final synthetic $VALUES:[Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

.field public static final enum ADD_ACTIVITY:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

.field public static final enum EDIT_ACTIVITY:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

.field public static final enum SLEEP:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

.field public static final enum STRAIN_COACH:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

.field public static final enum STRENGTH_TRAINER:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

.field public static final enum WAD:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;
    .locals 6

    sget-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;->SLEEP:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    sget-object v1, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;->ADD_ACTIVITY:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    sget-object v2, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;->EDIT_ACTIVITY:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    sget-object v3, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;->STRAIN_COACH:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    sget-object v4, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;->STRENGTH_TRAINER:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    sget-object v5, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;->WAD:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    filled-new-array/range {v0 .. v5}, [Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    const-string v1, "SLEEP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;->SLEEP:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    new-instance v0, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    const-string v1, "ADD_ACTIVITY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;->ADD_ACTIVITY:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    new-instance v0, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    const-string v1, "EDIT_ACTIVITY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;->EDIT_ACTIVITY:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    new-instance v0, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    const-string v1, "STRAIN_COACH"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;->STRAIN_COACH:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    new-instance v0, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    const-string v1, "STRENGTH_TRAINER"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;->STRENGTH_TRAINER:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    new-instance v0, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    const-string v1, "WAD"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;->WAD:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    invoke-static {}, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;->$values()[Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    move-result-object v0

    sput-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;->$VALUES:[Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;
    .locals 1

    const-class v0, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    return-object p0
.end method

.method public static values()[Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;
    .locals 1

    sget-object v0, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;->$VALUES:[Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    return-object v0
.end method
