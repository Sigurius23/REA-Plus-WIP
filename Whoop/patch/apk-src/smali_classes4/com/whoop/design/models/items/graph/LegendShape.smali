.class public final enum Lcom/whoop/design/models/items/graph/LegendShape;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemEnum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/design/models/items/graph/LegendShape;",
        ">;",
        "Lcom/whoop/design/models/DesignSystemEnum;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/LegendShape;",
        "Lcom/whoop/design/models/DesignSystemEnum;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "CIRCLE",
        "SQUARE",
        "ROUNDED_SQUARE",
        "CAPSULE",
        "DASHED_LINE",
        "DOTTED_LINE",
        "DASHED_CIRCLE",
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

.field private static final synthetic $VALUES:[Lcom/whoop/design/models/items/graph/LegendShape;

.field public static final enum CAPSULE:Lcom/whoop/design/models/items/graph/LegendShape;

.field public static final enum CIRCLE:Lcom/whoop/design/models/items/graph/LegendShape;

.field public static final enum DASHED_CIRCLE:Lcom/whoop/design/models/items/graph/LegendShape;

.field public static final enum DASHED_LINE:Lcom/whoop/design/models/items/graph/LegendShape;

.field public static final enum DOTTED_LINE:Lcom/whoop/design/models/items/graph/LegendShape;

.field public static final enum ROUNDED_SQUARE:Lcom/whoop/design/models/items/graph/LegendShape;

.field public static final enum SQUARE:Lcom/whoop/design/models/items/graph/LegendShape;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/design/models/items/graph/LegendShape;
    .locals 7

    sget-object v0, Lcom/whoop/design/models/items/graph/LegendShape;->CIRCLE:Lcom/whoop/design/models/items/graph/LegendShape;

    sget-object v1, Lcom/whoop/design/models/items/graph/LegendShape;->SQUARE:Lcom/whoop/design/models/items/graph/LegendShape;

    sget-object v2, Lcom/whoop/design/models/items/graph/LegendShape;->ROUNDED_SQUARE:Lcom/whoop/design/models/items/graph/LegendShape;

    sget-object v3, Lcom/whoop/design/models/items/graph/LegendShape;->CAPSULE:Lcom/whoop/design/models/items/graph/LegendShape;

    sget-object v4, Lcom/whoop/design/models/items/graph/LegendShape;->DASHED_LINE:Lcom/whoop/design/models/items/graph/LegendShape;

    sget-object v5, Lcom/whoop/design/models/items/graph/LegendShape;->DOTTED_LINE:Lcom/whoop/design/models/items/graph/LegendShape;

    sget-object v6, Lcom/whoop/design/models/items/graph/LegendShape;->DASHED_CIRCLE:Lcom/whoop/design/models/items/graph/LegendShape;

    filled-new-array/range {v0 .. v6}, [Lcom/whoop/design/models/items/graph/LegendShape;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/design/models/items/graph/LegendShape;

    const-string v1, "CIRCLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/LegendShape;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/LegendShape;->CIRCLE:Lcom/whoop/design/models/items/graph/LegendShape;

    new-instance v0, Lcom/whoop/design/models/items/graph/LegendShape;

    const-string v1, "SQUARE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/LegendShape;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/LegendShape;->SQUARE:Lcom/whoop/design/models/items/graph/LegendShape;

    new-instance v0, Lcom/whoop/design/models/items/graph/LegendShape;

    const-string v1, "ROUNDED_SQUARE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/LegendShape;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/LegendShape;->ROUNDED_SQUARE:Lcom/whoop/design/models/items/graph/LegendShape;

    new-instance v0, Lcom/whoop/design/models/items/graph/LegendShape;

    const-string v1, "CAPSULE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/LegendShape;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/LegendShape;->CAPSULE:Lcom/whoop/design/models/items/graph/LegendShape;

    new-instance v0, Lcom/whoop/design/models/items/graph/LegendShape;

    const-string v1, "DASHED_LINE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/LegendShape;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/LegendShape;->DASHED_LINE:Lcom/whoop/design/models/items/graph/LegendShape;

    new-instance v0, Lcom/whoop/design/models/items/graph/LegendShape;

    const-string v1, "DOTTED_LINE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/LegendShape;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/LegendShape;->DOTTED_LINE:Lcom/whoop/design/models/items/graph/LegendShape;

    new-instance v0, Lcom/whoop/design/models/items/graph/LegendShape;

    const-string v1, "DASHED_CIRCLE"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/LegendShape;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/LegendShape;->DASHED_CIRCLE:Lcom/whoop/design/models/items/graph/LegendShape;

    invoke-static {}, Lcom/whoop/design/models/items/graph/LegendShape;->$values()[Lcom/whoop/design/models/items/graph/LegendShape;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/graph/LegendShape;->$VALUES:[Lcom/whoop/design/models/items/graph/LegendShape;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/graph/LegendShape;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lcom/whoop/design/models/items/graph/LegendShape;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/design/models/items/graph/LegendShape;
    .locals 1

    const-class v0, Lcom/whoop/design/models/items/graph/LegendShape;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/models/items/graph/LegendShape;

    return-object p0
.end method

.method public static values()[Lcom/whoop/design/models/items/graph/LegendShape;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/LegendShape;->$VALUES:[Lcom/whoop/design/models/items/graph/LegendShape;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/design/models/items/graph/LegendShape;

    return-object v0
.end method
