.class public final enum Lcom/whoop/design/models/items/AlarmStatus;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemEnum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/design/models/items/AlarmStatus;",
        ">;",
        "Lcom/whoop/design/models/DesignSystemEnum;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/design/models/items/AlarmStatus;",
        "Lcom/whoop/design/models/DesignSystemEnum;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "OFF",
        "ON",
        "EXACT_TIME",
        "GREEN_RECOVERY",
        "SLEEP_PERFORMANCE_100",
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

.field private static final synthetic $VALUES:[Lcom/whoop/design/models/items/AlarmStatus;

.field public static final enum EXACT_TIME:Lcom/whoop/design/models/items/AlarmStatus;

.field public static final enum GREEN_RECOVERY:Lcom/whoop/design/models/items/AlarmStatus;

.field public static final enum OFF:Lcom/whoop/design/models/items/AlarmStatus;

.field public static final enum ON:Lcom/whoop/design/models/items/AlarmStatus;

.field public static final enum SLEEP_PERFORMANCE_100:Lcom/whoop/design/models/items/AlarmStatus;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/design/models/items/AlarmStatus;
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/AlarmStatus;->OFF:Lcom/whoop/design/models/items/AlarmStatus;

    sget-object v1, Lcom/whoop/design/models/items/AlarmStatus;->ON:Lcom/whoop/design/models/items/AlarmStatus;

    sget-object v2, Lcom/whoop/design/models/items/AlarmStatus;->EXACT_TIME:Lcom/whoop/design/models/items/AlarmStatus;

    sget-object v3, Lcom/whoop/design/models/items/AlarmStatus;->GREEN_RECOVERY:Lcom/whoop/design/models/items/AlarmStatus;

    sget-object v4, Lcom/whoop/design/models/items/AlarmStatus;->SLEEP_PERFORMANCE_100:Lcom/whoop/design/models/items/AlarmStatus;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/whoop/design/models/items/AlarmStatus;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/design/models/items/AlarmStatus;

    const-string v1, "OFF"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/AlarmStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/AlarmStatus;->OFF:Lcom/whoop/design/models/items/AlarmStatus;

    new-instance v0, Lcom/whoop/design/models/items/AlarmStatus;

    const-string v1, "ON"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/AlarmStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/AlarmStatus;->ON:Lcom/whoop/design/models/items/AlarmStatus;

    new-instance v0, Lcom/whoop/design/models/items/AlarmStatus;

    const-string v1, "EXACT_TIME"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/AlarmStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/AlarmStatus;->EXACT_TIME:Lcom/whoop/design/models/items/AlarmStatus;

    new-instance v0, Lcom/whoop/design/models/items/AlarmStatus;

    const-string v1, "GREEN_RECOVERY"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/AlarmStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/AlarmStatus;->GREEN_RECOVERY:Lcom/whoop/design/models/items/AlarmStatus;

    new-instance v0, Lcom/whoop/design/models/items/AlarmStatus;

    const-string v1, "SLEEP_PERFORMANCE_100"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/AlarmStatus;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/AlarmStatus;->SLEEP_PERFORMANCE_100:Lcom/whoop/design/models/items/AlarmStatus;

    invoke-static {}, Lcom/whoop/design/models/items/AlarmStatus;->$values()[Lcom/whoop/design/models/items/AlarmStatus;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/AlarmStatus;->$VALUES:[Lcom/whoop/design/models/items/AlarmStatus;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/AlarmStatus;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lcom/whoop/design/models/items/AlarmStatus;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/design/models/items/AlarmStatus;
    .locals 1

    const-class v0, Lcom/whoop/design/models/items/AlarmStatus;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/models/items/AlarmStatus;

    return-object p0
.end method

.method public static values()[Lcom/whoop/design/models/items/AlarmStatus;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/AlarmStatus;->$VALUES:[Lcom/whoop/design/models/items/AlarmStatus;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/design/models/items/AlarmStatus;

    return-object v0
.end method
