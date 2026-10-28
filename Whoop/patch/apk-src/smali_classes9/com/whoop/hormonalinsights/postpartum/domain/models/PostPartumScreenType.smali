.class public final enum Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;",
        "",
        "screen",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getScreen",
        "()Ljava/lang/String;",
        "ALL",
        "WEIGHTS",
        "DELIVERY_DATE",
        "NAME",
        "DELIVERY_METHOD",
        "hormonal-insights_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

.field public static final enum ALL:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

.field public static final enum DELIVERY_DATE:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

.field public static final enum DELIVERY_METHOD:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

.field public static final enum NAME:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

.field public static final enum WEIGHTS:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;


# instance fields
.field private final screen:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;
    .locals 5

    sget-object v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;->ALL:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    sget-object v1, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;->WEIGHTS:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    sget-object v2, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;->DELIVERY_DATE:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    sget-object v3, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;->NAME:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    sget-object v4, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;->DELIVERY_METHOD:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    const-string v1, "ALL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;->ALL:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    new-instance v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    const-string v1, "WEIGHTS"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;->WEIGHTS:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    new-instance v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    const-string v1, "DELIVERY_DATE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v1}, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;->DELIVERY_DATE:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    new-instance v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    const-string v1, "NAME"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v1}, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;->NAME:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    new-instance v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    const-string v1, "DELIVERY_METHOD"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v1}, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;->DELIVERY_METHOD:Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    invoke-static {}, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;->$values()[Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    move-result-object v0

    sput-object v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;->$VALUES:[Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;->screen:Ljava/lang/String;

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

    sget-object v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;
    .locals 1

    const-class v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    return-object p0
.end method

.method public static values()[Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;
    .locals 1

    sget-object v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;->$VALUES:[Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;

    return-object v0
.end method


# virtual methods
.method public final getScreen()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;->screen:Ljava/lang/String;

    return-object v0
.end method
