.class public final enum Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemEnum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;",
        ">;",
        "Lcom/whoop/design/models/DesignSystemEnum;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;",
        "Lcom/whoop/design/models/DesignSystemEnum;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "SLEEP",
        "CARDIO_ACTIVITY",
        "RECOVERY_ACTIVITY",
        "WEIGHTLIFTING",
        "PENDING",
        "MULTIPLE_ACTIVITIES",
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

.field private static final synthetic $VALUES:[Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

.field public static final enum CARDIO_ACTIVITY:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

.field public static final enum MULTIPLE_ACTIVITIES:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

.field public static final enum PENDING:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

.field public static final enum RECOVERY_ACTIVITY:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

.field public static final enum SLEEP:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

.field public static final enum WEIGHTLIFTING:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;
    .locals 6

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;->SLEEP:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    sget-object v1, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;->CARDIO_ACTIVITY:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    sget-object v2, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;->RECOVERY_ACTIVITY:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    sget-object v3, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;->WEIGHTLIFTING:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    sget-object v4, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;->PENDING:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    sget-object v5, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;->MULTIPLE_ACTIVITIES:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    filled-new-array/range {v0 .. v5}, [Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    const-string v1, "SLEEP"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;->SLEEP:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    const-string v1, "CARDIO_ACTIVITY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;->CARDIO_ACTIVITY:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    const-string v1, "RECOVERY_ACTIVITY"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;->RECOVERY_ACTIVITY:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    const-string v1, "WEIGHTLIFTING"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;->WEIGHTLIFTING:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    const-string v1, "PENDING"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;->PENDING:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    const-string v1, "MULTIPLE_ACTIVITIES"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;->MULTIPLE_ACTIVITIES:Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;->$values()[Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;->$VALUES:[Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;
    .locals 1

    const-class v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    return-object p0
.end method

.method public static values()[Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;->$VALUES:[Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;

    return-object v0
.end method
