.class public final enum Lul1/c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lul1/c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000c\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lul1/c;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "NONE",
        "FIRMWARE_UPDATE",
        "SOFT_TOMBSTONE",
        "HARD_TOMBSTONE",
        "CDM",
        "SLEEP_NEED",
        "LANGUAGE_MODAL",
        "PROCESS_FW",
        "APP_CRASH",
        "home_release"
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

.field private static final synthetic $VALUES:[Lul1/c;

.field public static final enum APP_CRASH:Lul1/c;

.field public static final enum CDM:Lul1/c;

.field public static final enum FIRMWARE_UPDATE:Lul1/c;

.field public static final enum HARD_TOMBSTONE:Lul1/c;

.field public static final enum LANGUAGE_MODAL:Lul1/c;

.field public static final enum NONE:Lul1/c;

.field public static final enum PROCESS_FW:Lul1/c;

.field public static final enum SLEEP_NEED:Lul1/c;

.field public static final enum SOFT_TOMBSTONE:Lul1/c;


# direct methods
.method private static final synthetic $values()[Lul1/c;
    .locals 9

    sget-object v0, Lul1/c;->NONE:Lul1/c;

    sget-object v1, Lul1/c;->FIRMWARE_UPDATE:Lul1/c;

    sget-object v2, Lul1/c;->SOFT_TOMBSTONE:Lul1/c;

    sget-object v3, Lul1/c;->HARD_TOMBSTONE:Lul1/c;

    sget-object v4, Lul1/c;->CDM:Lul1/c;

    sget-object v5, Lul1/c;->SLEEP_NEED:Lul1/c;

    sget-object v6, Lul1/c;->LANGUAGE_MODAL:Lul1/c;

    sget-object v7, Lul1/c;->PROCESS_FW:Lul1/c;

    sget-object v8, Lul1/c;->APP_CRASH:Lul1/c;

    filled-new-array/range {v0 .. v8}, [Lul1/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lul1/c;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lul1/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lul1/c;->NONE:Lul1/c;

    new-instance v0, Lul1/c;

    const-string v1, "FIRMWARE_UPDATE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lul1/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lul1/c;->FIRMWARE_UPDATE:Lul1/c;

    new-instance v0, Lul1/c;

    const-string v1, "SOFT_TOMBSTONE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lul1/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lul1/c;->SOFT_TOMBSTONE:Lul1/c;

    new-instance v0, Lul1/c;

    const-string v1, "HARD_TOMBSTONE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lul1/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lul1/c;->HARD_TOMBSTONE:Lul1/c;

    new-instance v0, Lul1/c;

    const-string v1, "CDM"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lul1/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lul1/c;->CDM:Lul1/c;

    new-instance v0, Lul1/c;

    const-string v1, "SLEEP_NEED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lul1/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lul1/c;->SLEEP_NEED:Lul1/c;

    new-instance v0, Lul1/c;

    const-string v1, "LANGUAGE_MODAL"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lul1/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lul1/c;->LANGUAGE_MODAL:Lul1/c;

    new-instance v0, Lul1/c;

    const-string v1, "PROCESS_FW"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lul1/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lul1/c;->PROCESS_FW:Lul1/c;

    new-instance v0, Lul1/c;

    const-string v1, "APP_CRASH"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lul1/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lul1/c;->APP_CRASH:Lul1/c;

    invoke-static {}, Lul1/c;->$values()[Lul1/c;

    move-result-object v0

    sput-object v0, Lul1/c;->$VALUES:[Lul1/c;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lul1/c;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lul1/c;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lul1/c;
    .locals 1

    const-class v0, Lul1/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lul1/c;

    return-object p0
.end method

.method public static values()[Lul1/c;
    .locals 1

    sget-object v0, Lul1/c;->$VALUES:[Lul1/c;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lul1/c;

    return-object v0
.end method
