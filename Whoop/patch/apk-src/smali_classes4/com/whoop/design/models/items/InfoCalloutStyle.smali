.class public final enum Lcom/whoop/design/models/items/InfoCalloutStyle;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemEnum;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/design/models/items/InfoCalloutStyle;",
        ">;",
        "Lcom/whoop/design/models/DesignSystemEnum;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/whoop/design/models/items/InfoCalloutStyle;",
        "Lcom/whoop/design/models/DesignSystemEnum;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "IMPACT_DETAIL",
        "CONCERNING",
        "ALERTING",
        "POSITIVE",
        "NEUTRAL",
        "SUBTLE",
        "MUTED",
        "AI",
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

.field private static final synthetic $VALUES:[Lcom/whoop/design/models/items/InfoCalloutStyle;

.field public static final enum AI:Lcom/whoop/design/models/items/InfoCalloutStyle;

.field public static final enum ALERTING:Lcom/whoop/design/models/items/InfoCalloutStyle;

.field public static final enum CONCERNING:Lcom/whoop/design/models/items/InfoCalloutStyle;

.field public static final enum IMPACT_DETAIL:Lcom/whoop/design/models/items/InfoCalloutStyle;

.field public static final enum MUTED:Lcom/whoop/design/models/items/InfoCalloutStyle;

.field public static final enum NEUTRAL:Lcom/whoop/design/models/items/InfoCalloutStyle;

.field public static final enum POSITIVE:Lcom/whoop/design/models/items/InfoCalloutStyle;

.field public static final enum SUBTLE:Lcom/whoop/design/models/items/InfoCalloutStyle;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/design/models/items/InfoCalloutStyle;
    .locals 8

    sget-object v0, Lcom/whoop/design/models/items/InfoCalloutStyle;->IMPACT_DETAIL:Lcom/whoop/design/models/items/InfoCalloutStyle;

    sget-object v1, Lcom/whoop/design/models/items/InfoCalloutStyle;->CONCERNING:Lcom/whoop/design/models/items/InfoCalloutStyle;

    sget-object v2, Lcom/whoop/design/models/items/InfoCalloutStyle;->ALERTING:Lcom/whoop/design/models/items/InfoCalloutStyle;

    sget-object v3, Lcom/whoop/design/models/items/InfoCalloutStyle;->POSITIVE:Lcom/whoop/design/models/items/InfoCalloutStyle;

    sget-object v4, Lcom/whoop/design/models/items/InfoCalloutStyle;->NEUTRAL:Lcom/whoop/design/models/items/InfoCalloutStyle;

    sget-object v5, Lcom/whoop/design/models/items/InfoCalloutStyle;->SUBTLE:Lcom/whoop/design/models/items/InfoCalloutStyle;

    sget-object v6, Lcom/whoop/design/models/items/InfoCalloutStyle;->MUTED:Lcom/whoop/design/models/items/InfoCalloutStyle;

    sget-object v7, Lcom/whoop/design/models/items/InfoCalloutStyle;->AI:Lcom/whoop/design/models/items/InfoCalloutStyle;

    filled-new-array/range {v0 .. v7}, [Lcom/whoop/design/models/items/InfoCalloutStyle;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/design/models/items/InfoCalloutStyle;

    const-string v1, "IMPACT_DETAIL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/InfoCalloutStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/InfoCalloutStyle;->IMPACT_DETAIL:Lcom/whoop/design/models/items/InfoCalloutStyle;

    new-instance v0, Lcom/whoop/design/models/items/InfoCalloutStyle;

    const-string v1, "CONCERNING"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/InfoCalloutStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/InfoCalloutStyle;->CONCERNING:Lcom/whoop/design/models/items/InfoCalloutStyle;

    new-instance v0, Lcom/whoop/design/models/items/InfoCalloutStyle;

    const-string v1, "ALERTING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/InfoCalloutStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/InfoCalloutStyle;->ALERTING:Lcom/whoop/design/models/items/InfoCalloutStyle;

    new-instance v0, Lcom/whoop/design/models/items/InfoCalloutStyle;

    const-string v1, "POSITIVE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/InfoCalloutStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/InfoCalloutStyle;->POSITIVE:Lcom/whoop/design/models/items/InfoCalloutStyle;

    new-instance v0, Lcom/whoop/design/models/items/InfoCalloutStyle;

    const-string v1, "NEUTRAL"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/InfoCalloutStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/InfoCalloutStyle;->NEUTRAL:Lcom/whoop/design/models/items/InfoCalloutStyle;

    new-instance v0, Lcom/whoop/design/models/items/InfoCalloutStyle;

    const-string v1, "SUBTLE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/InfoCalloutStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/InfoCalloutStyle;->SUBTLE:Lcom/whoop/design/models/items/InfoCalloutStyle;

    new-instance v0, Lcom/whoop/design/models/items/InfoCalloutStyle;

    const-string v1, "MUTED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/InfoCalloutStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/InfoCalloutStyle;->MUTED:Lcom/whoop/design/models/items/InfoCalloutStyle;

    new-instance v0, Lcom/whoop/design/models/items/InfoCalloutStyle;

    const-string v1, "AI"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/whoop/design/models/items/InfoCalloutStyle;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/design/models/items/InfoCalloutStyle;->AI:Lcom/whoop/design/models/items/InfoCalloutStyle;

    invoke-static {}, Lcom/whoop/design/models/items/InfoCalloutStyle;->$values()[Lcom/whoop/design/models/items/InfoCalloutStyle;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/InfoCalloutStyle;->$VALUES:[Lcom/whoop/design/models/items/InfoCalloutStyle;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/design/models/items/InfoCalloutStyle;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lcom/whoop/design/models/items/InfoCalloutStyle;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/design/models/items/InfoCalloutStyle;
    .locals 1

    const-class v0, Lcom/whoop/design/models/items/InfoCalloutStyle;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/models/items/InfoCalloutStyle;

    return-object p0
.end method

.method public static values()[Lcom/whoop/design/models/items/InfoCalloutStyle;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/InfoCalloutStyle;->$VALUES:[Lcom/whoop/design/models/items/InfoCalloutStyle;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/design/models/items/InfoCalloutStyle;

    return-object v0
.end method
