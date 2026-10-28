.class public final enum La11/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La11/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "La11/a;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "NONE",
        "PROCESS_FW",
        "RETRY_FW_UPDATE",
        "RESET_FW_STATE",
        "LOCATION_PERMISSION_REQUIRED",
        "LOW_BATTERY_ONCE_A_DAY_DISMISS",
        "design_release"
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

.field private static final synthetic $VALUES:[La11/a;

.field public static final enum LOCATION_PERMISSION_REQUIRED:La11/a;

.field public static final enum LOW_BATTERY_ONCE_A_DAY_DISMISS:La11/a;

.field public static final enum NONE:La11/a;

.field public static final enum PROCESS_FW:La11/a;

.field public static final enum RESET_FW_STATE:La11/a;

.field public static final enum RETRY_FW_UPDATE:La11/a;


# direct methods
.method private static final synthetic $values()[La11/a;
    .locals 6

    sget-object v0, La11/a;->NONE:La11/a;

    sget-object v1, La11/a;->PROCESS_FW:La11/a;

    sget-object v2, La11/a;->RETRY_FW_UPDATE:La11/a;

    sget-object v3, La11/a;->RESET_FW_STATE:La11/a;

    sget-object v4, La11/a;->LOCATION_PERMISSION_REQUIRED:La11/a;

    sget-object v5, La11/a;->LOW_BATTERY_ONCE_A_DAY_DISMISS:La11/a;

    filled-new-array/range {v0 .. v5}, [La11/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, La11/a;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, La11/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, La11/a;->NONE:La11/a;

    new-instance v0, La11/a;

    const-string v1, "PROCESS_FW"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, La11/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, La11/a;->PROCESS_FW:La11/a;

    new-instance v0, La11/a;

    const-string v1, "RETRY_FW_UPDATE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, La11/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, La11/a;->RETRY_FW_UPDATE:La11/a;

    new-instance v0, La11/a;

    const-string v1, "RESET_FW_STATE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, La11/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, La11/a;->RESET_FW_STATE:La11/a;

    new-instance v0, La11/a;

    const-string v1, "LOCATION_PERMISSION_REQUIRED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, La11/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, La11/a;->LOCATION_PERMISSION_REQUIRED:La11/a;

    new-instance v0, La11/a;

    const-string v1, "LOW_BATTERY_ONCE_A_DAY_DISMISS"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, La11/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, La11/a;->LOW_BATTERY_ONCE_A_DAY_DISMISS:La11/a;

    invoke-static {}, La11/a;->$values()[La11/a;

    move-result-object v0

    sput-object v0, La11/a;->$VALUES:[La11/a;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, La11/a;->$ENTRIES:Lt83/a;

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

    sget-object v0, La11/a;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)La11/a;
    .locals 1

    const-class v0, La11/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La11/a;

    return-object p0
.end method

.method public static values()[La11/a;
    .locals 1

    sget-object v0, La11/a;->$VALUES:[La11/a;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La11/a;

    return-object v0
.end method
