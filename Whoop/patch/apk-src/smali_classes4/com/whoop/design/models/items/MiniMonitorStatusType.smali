.class public final enum Lcom/whoop/design/models/items/MiniMonitorStatusType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/design/models/items/MiniMonitorStatusType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/design/models/items/MiniMonitorStatusType;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "OK",
        "WARNING",
        "ALERT",
        "LOW",
        "MEDIUM",
        "HIGH",
        "CALIBRATING",
        "NO_DATA",
        "DATA_HIDDEN",
        "PENDING",
        "design-models_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/design/models/items/MiniMonitorStatusType;

.field public static final enum ALERT:Lcom/whoop/design/models/items/MiniMonitorStatusType;

.field public static final enum CALIBRATING:Lcom/whoop/design/models/items/MiniMonitorStatusType;

.field public static final enum DATA_HIDDEN:Lcom/whoop/design/models/items/MiniMonitorStatusType;

.field public static final enum HIGH:Lcom/whoop/design/models/items/MiniMonitorStatusType;

.field public static final enum LOW:Lcom/whoop/design/models/items/MiniMonitorStatusType;

.field public static final enum MEDIUM:Lcom/whoop/design/models/items/MiniMonitorStatusType;

.field public static final enum NO_DATA:Lcom/whoop/design/models/items/MiniMonitorStatusType;

.field public static final enum OK:Lcom/whoop/design/models/items/MiniMonitorStatusType;

.field public static final enum PENDING:Lcom/whoop/design/models/items/MiniMonitorStatusType;

.field public static final enum WARNING:Lcom/whoop/design/models/items/MiniMonitorStatusType;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/design/models/items/MiniMonitorStatusType;
    .locals 10

    sget-object v0, Lcom/whoop/design/models/items/MiniMonitorStatusType;->OK:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    sget-object v1, Lcom/whoop/design/models/items/MiniMonitorStatusType;->WARNING:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    sget-object v2, Lcom/whoop/design/models/items/MiniMonitorStatusType;->ALERT:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    sget-object v3, Lcom/whoop/design/models/items/MiniMonitorStatusType;->LOW:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    sget-object v4, Lcom/whoop/design/models/items/MiniMonitorStatusType;->MEDIUM:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    sget-object v5, Lcom/whoop/design/models/items/MiniMonitorStatusType;->HIGH:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    sget-object v6, Lcom/whoop/design/models/items/MiniMonitorStatusType;->CALIBRATING:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    sget-object v7, Lcom/whoop/design/models/items/MiniMonitorStatusType;->NO_DATA:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    sget-object v8, Lcom/whoop/design/models/items/MiniMonitorStatusType;->DATA_HIDDEN:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    sget-object v9, Lcom/whoop/design/models/items/MiniMonitorStatusType;->PENDING:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    filled-new-array/range {v0 .. v9}, [Lcom/whoop/design/models/items/MiniMonitorStatusType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/design/models/items/MiniMonitorStatusType;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/MiniMonitorStatusType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/MiniMonitorStatusType;->OK:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    new-instance v0, Lcom/whoop/design/models/items/MiniMonitorStatusType;

    const-string v1, "WARNING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/MiniMonitorStatusType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/MiniMonitorStatusType;->WARNING:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    new-instance v0, Lcom/whoop/design/models/items/MiniMonitorStatusType;

    const-string v1, "ALERT"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/MiniMonitorStatusType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/MiniMonitorStatusType;->ALERT:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    new-instance v0, Lcom/whoop/design/models/items/MiniMonitorStatusType;

    const-string v1, "LOW"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/MiniMonitorStatusType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/MiniMonitorStatusType;->LOW:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    new-instance v0, Lcom/whoop/design/models/items/MiniMonitorStatusType;

    const-string v1, "MEDIUM"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/MiniMonitorStatusType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/MiniMonitorStatusType;->MEDIUM:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    new-instance v0, Lcom/whoop/design/models/items/MiniMonitorStatusType;

    const-string v1, "HIGH"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/MiniMonitorStatusType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/MiniMonitorStatusType;->HIGH:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    new-instance v0, Lcom/whoop/design/models/items/MiniMonitorStatusType;

    const-string v1, "CALIBRATING"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/MiniMonitorStatusType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/MiniMonitorStatusType;->CALIBRATING:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    new-instance v0, Lcom/whoop/design/models/items/MiniMonitorStatusType;

    const-string v1, "NO_DATA"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/MiniMonitorStatusType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/MiniMonitorStatusType;->NO_DATA:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    new-instance v0, Lcom/whoop/design/models/items/MiniMonitorStatusType;

    const-string v1, "DATA_HIDDEN"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/MiniMonitorStatusType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/MiniMonitorStatusType;->DATA_HIDDEN:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    new-instance v0, Lcom/whoop/design/models/items/MiniMonitorStatusType;

    const-string v1, "PENDING"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/MiniMonitorStatusType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/MiniMonitorStatusType;->PENDING:Lcom/whoop/design/models/items/MiniMonitorStatusType;

    invoke-static {}, Lcom/whoop/design/models/items/MiniMonitorStatusType;->$values()[Lcom/whoop/design/models/items/MiniMonitorStatusType;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/MiniMonitorStatusType;->$VALUES:[Lcom/whoop/design/models/items/MiniMonitorStatusType;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/MiniMonitorStatusType;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lcom/whoop/design/models/items/MiniMonitorStatusType;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/design/models/items/MiniMonitorStatusType;
    .locals 1

    const-class v0, Lcom/whoop/design/models/items/MiniMonitorStatusType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/models/items/MiniMonitorStatusType;

    return-object p0
.end method

.method public static values()[Lcom/whoop/design/models/items/MiniMonitorStatusType;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/MiniMonitorStatusType;->$VALUES:[Lcom/whoop/design/models/items/MiniMonitorStatusType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/design/models/items/MiniMonitorStatusType;

    return-object v0
.end method
