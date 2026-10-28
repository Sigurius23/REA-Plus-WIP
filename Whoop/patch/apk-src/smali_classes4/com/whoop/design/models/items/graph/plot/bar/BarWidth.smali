.class public final enum Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemEnum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;",
        ">;",
        "Lcom/whoop/design/models/DesignSystemEnum;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;",
        "Lcom/whoop/design/models/DesignSystemEnum;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "NARROW",
        "STANDARD",
        "WIDE",
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

.field private static final synthetic $VALUES:[Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;

.field public static final enum NARROW:Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;

.field public static final enum STANDARD:Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;

.field public static final enum WIDE:Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;
    .locals 3

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;->NARROW:Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;

    sget-object v1, Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;->STANDARD:Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;

    sget-object v2, Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;->WIDE:Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;

    filled-new-array {v0, v1, v2}, [Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;

    const-string v1, "NARROW"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;->NARROW:Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;

    const-string v1, "STANDARD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;->STANDARD:Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;

    new-instance v0, Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;

    const-string v1, "WIDE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;->WIDE:Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;->$values()[Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;->$VALUES:[Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;
    .locals 1

    const-class v0, Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;

    return-object p0
.end method

.method public static values()[Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;->$VALUES:[Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;

    return-object v0
.end method
