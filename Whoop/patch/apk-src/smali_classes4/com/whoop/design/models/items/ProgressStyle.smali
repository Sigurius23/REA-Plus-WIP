.class public final enum Lcom/whoop/design/models/items/ProgressStyle;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemEnum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/design/models/items/ProgressStyle;",
        ">;",
        "Lcom/whoop/design/models/DesignSystemEnum;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/design/models/items/ProgressStyle;",
        "Lcom/whoop/design/models/DesignSystemEnum;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "STEPS",
        "HR_ZONES_ONE_TO_THREE",
        "HR_ZONES_FOUR_TO_FIVE",
        "STRENGTH_TRAINING_TIME",
        "HEALTH_INTAKE",
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

.field private static final synthetic $VALUES:[Lcom/whoop/design/models/items/ProgressStyle;

.field public static final enum HEALTH_INTAKE:Lcom/whoop/design/models/items/ProgressStyle;

.field public static final enum HR_ZONES_FOUR_TO_FIVE:Lcom/whoop/design/models/items/ProgressStyle;

.field public static final enum HR_ZONES_ONE_TO_THREE:Lcom/whoop/design/models/items/ProgressStyle;

.field public static final enum STEPS:Lcom/whoop/design/models/items/ProgressStyle;

.field public static final enum STRENGTH_TRAINING_TIME:Lcom/whoop/design/models/items/ProgressStyle;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/design/models/items/ProgressStyle;
    .locals 5

    sget-object v0, Lcom/whoop/design/models/items/ProgressStyle;->STEPS:Lcom/whoop/design/models/items/ProgressStyle;

    sget-object v1, Lcom/whoop/design/models/items/ProgressStyle;->HR_ZONES_ONE_TO_THREE:Lcom/whoop/design/models/items/ProgressStyle;

    sget-object v2, Lcom/whoop/design/models/items/ProgressStyle;->HR_ZONES_FOUR_TO_FIVE:Lcom/whoop/design/models/items/ProgressStyle;

    sget-object v3, Lcom/whoop/design/models/items/ProgressStyle;->STRENGTH_TRAINING_TIME:Lcom/whoop/design/models/items/ProgressStyle;

    sget-object v4, Lcom/whoop/design/models/items/ProgressStyle;->HEALTH_INTAKE:Lcom/whoop/design/models/items/ProgressStyle;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/whoop/design/models/items/ProgressStyle;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/design/models/items/ProgressStyle;

    const-string v1, "STEPS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/ProgressStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/ProgressStyle;->STEPS:Lcom/whoop/design/models/items/ProgressStyle;

    new-instance v0, Lcom/whoop/design/models/items/ProgressStyle;

    const-string v1, "HR_ZONES_ONE_TO_THREE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/ProgressStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/ProgressStyle;->HR_ZONES_ONE_TO_THREE:Lcom/whoop/design/models/items/ProgressStyle;

    new-instance v0, Lcom/whoop/design/models/items/ProgressStyle;

    const-string v1, "HR_ZONES_FOUR_TO_FIVE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/ProgressStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/ProgressStyle;->HR_ZONES_FOUR_TO_FIVE:Lcom/whoop/design/models/items/ProgressStyle;

    new-instance v0, Lcom/whoop/design/models/items/ProgressStyle;

    const-string v1, "STRENGTH_TRAINING_TIME"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/ProgressStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/ProgressStyle;->STRENGTH_TRAINING_TIME:Lcom/whoop/design/models/items/ProgressStyle;

    new-instance v0, Lcom/whoop/design/models/items/ProgressStyle;

    const-string v1, "HEALTH_INTAKE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/ProgressStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/ProgressStyle;->HEALTH_INTAKE:Lcom/whoop/design/models/items/ProgressStyle;

    invoke-static {}, Lcom/whoop/design/models/items/ProgressStyle;->$values()[Lcom/whoop/design/models/items/ProgressStyle;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/ProgressStyle;->$VALUES:[Lcom/whoop/design/models/items/ProgressStyle;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/ProgressStyle;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lcom/whoop/design/models/items/ProgressStyle;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/design/models/items/ProgressStyle;
    .locals 1

    const-class v0, Lcom/whoop/design/models/items/ProgressStyle;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/models/items/ProgressStyle;

    return-object p0
.end method

.method public static values()[Lcom/whoop/design/models/items/ProgressStyle;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/ProgressStyle;->$VALUES:[Lcom/whoop/design/models/items/ProgressStyle;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/design/models/items/ProgressStyle;

    return-object v0
.end method
