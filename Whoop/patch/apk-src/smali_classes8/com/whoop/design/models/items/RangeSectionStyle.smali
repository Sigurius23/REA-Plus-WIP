.class public final enum Lcom/whoop/design/models/items/RangeSectionStyle;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/design/models/items/RangeSectionStyle;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0006\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/whoop/design/models/items/RangeSectionStyle;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "OPTIMAL",
        "SUFFICIENT",
        "OUT_OF_RANGE",
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

.field private static final synthetic $VALUES:[Lcom/whoop/design/models/items/RangeSectionStyle;

.field public static final enum OPTIMAL:Lcom/whoop/design/models/items/RangeSectionStyle;

.field public static final enum OUT_OF_RANGE:Lcom/whoop/design/models/items/RangeSectionStyle;

.field public static final enum SUFFICIENT:Lcom/whoop/design/models/items/RangeSectionStyle;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/design/models/items/RangeSectionStyle;
    .locals 3

    sget-object v0, Lcom/whoop/design/models/items/RangeSectionStyle;->OPTIMAL:Lcom/whoop/design/models/items/RangeSectionStyle;

    sget-object v1, Lcom/whoop/design/models/items/RangeSectionStyle;->SUFFICIENT:Lcom/whoop/design/models/items/RangeSectionStyle;

    sget-object v2, Lcom/whoop/design/models/items/RangeSectionStyle;->OUT_OF_RANGE:Lcom/whoop/design/models/items/RangeSectionStyle;

    filled-new-array {v0, v1, v2}, [Lcom/whoop/design/models/items/RangeSectionStyle;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/design/models/items/RangeSectionStyle;

    const-string v1, "OPTIMAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/RangeSectionStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/RangeSectionStyle;->OPTIMAL:Lcom/whoop/design/models/items/RangeSectionStyle;

    new-instance v0, Lcom/whoop/design/models/items/RangeSectionStyle;

    const-string v1, "SUFFICIENT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/RangeSectionStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/RangeSectionStyle;->SUFFICIENT:Lcom/whoop/design/models/items/RangeSectionStyle;

    new-instance v0, Lcom/whoop/design/models/items/RangeSectionStyle;

    const-string v1, "OUT_OF_RANGE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/RangeSectionStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/RangeSectionStyle;->OUT_OF_RANGE:Lcom/whoop/design/models/items/RangeSectionStyle;

    invoke-static {}, Lcom/whoop/design/models/items/RangeSectionStyle;->$values()[Lcom/whoop/design/models/items/RangeSectionStyle;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/RangeSectionStyle;->$VALUES:[Lcom/whoop/design/models/items/RangeSectionStyle;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/RangeSectionStyle;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lcom/whoop/design/models/items/RangeSectionStyle;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/design/models/items/RangeSectionStyle;
    .locals 1

    const-class v0, Lcom/whoop/design/models/items/RangeSectionStyle;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/models/items/RangeSectionStyle;

    return-object p0
.end method

.method public static values()[Lcom/whoop/design/models/items/RangeSectionStyle;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/RangeSectionStyle;->$VALUES:[Lcom/whoop/design/models/items/RangeSectionStyle;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/design/models/items/RangeSectionStyle;

    return-object v0
.end method
