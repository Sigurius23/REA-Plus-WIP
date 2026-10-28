.class public final enum Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemEnum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;",
        ">;",
        "Lcom/whoop/design/models/DesignSystemEnum;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\r\u0008\u0086\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;",
        "Lcom/whoop/design/models/DesignSystemEnum;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "PREGNANCY_FIRST_TRIMESTER",
        "PREGNANCY_SECOND_TRIMESTER",
        "PREGNANCY_THIRD_TRIMESTER",
        "PREGNANCY_POST_PARTUM",
        "INACTIVE",
        "PREGNANCY_NONE",
        "MCI_MENSTRUAL",
        "MCI_FOLLICULAR",
        "MCI_OVULATORY",
        "MCI_LUTEAL",
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

.field private static final synthetic $VALUES:[Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

.field public static final enum INACTIVE:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

.field public static final enum MCI_FOLLICULAR:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

.field public static final enum MCI_LUTEAL:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

.field public static final enum MCI_MENSTRUAL:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

.field public static final enum MCI_OVULATORY:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

.field public static final enum PREGNANCY_FIRST_TRIMESTER:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

.field public static final enum PREGNANCY_NONE:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

.field public static final enum PREGNANCY_POST_PARTUM:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

.field public static final enum PREGNANCY_SECOND_TRIMESTER:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

.field public static final enum PREGNANCY_THIRD_TRIMESTER:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;
    .locals 10

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->PREGNANCY_FIRST_TRIMESTER:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    sget-object v1, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->PREGNANCY_SECOND_TRIMESTER:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    sget-object v2, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->PREGNANCY_THIRD_TRIMESTER:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    sget-object v3, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->PREGNANCY_POST_PARTUM:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    sget-object v4, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->INACTIVE:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    sget-object v5, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->PREGNANCY_NONE:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    sget-object v6, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->MCI_MENSTRUAL:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    sget-object v7, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->MCI_FOLLICULAR:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    sget-object v8, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->MCI_OVULATORY:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    sget-object v9, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->MCI_LUTEAL:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    filled-new-array/range {v0 .. v9}, [Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    const-string v1, "PREGNANCY_FIRST_TRIMESTER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->PREGNANCY_FIRST_TRIMESTER:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    const-string v1, "PREGNANCY_SECOND_TRIMESTER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->PREGNANCY_SECOND_TRIMESTER:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    const-string v1, "PREGNANCY_THIRD_TRIMESTER"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->PREGNANCY_THIRD_TRIMESTER:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    const-string v1, "PREGNANCY_POST_PARTUM"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->PREGNANCY_POST_PARTUM:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    const-string v1, "INACTIVE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->INACTIVE:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    const-string v1, "PREGNANCY_NONE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->PREGNANCY_NONE:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    const-string v1, "MCI_MENSTRUAL"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->MCI_MENSTRUAL:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    const-string v1, "MCI_FOLLICULAR"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->MCI_FOLLICULAR:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    const-string v1, "MCI_OVULATORY"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->MCI_OVULATORY:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    const-string v1, "MCI_LUTEAL"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->MCI_LUTEAL:Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->$values()[Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->$VALUES:[Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;
    .locals 1

    const-class v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    return-object p0
.end method

.method public static values()[Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;->$VALUES:[Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    return-object v0
.end method
