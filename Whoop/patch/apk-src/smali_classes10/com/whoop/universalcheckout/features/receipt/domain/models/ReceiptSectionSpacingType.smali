.class public final enum Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;",
        "",
        "Ly3/f;",
        "spacing",
        "<init>",
        "(Ljava/lang/String;IF)V",
        "F",
        "getSpacing-D9Ej5fM",
        "()F",
        "LARGE",
        "NORMAL",
        "COMPACT",
        "universal-checkout_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;

.field public static final enum COMPACT:Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;

.field public static final enum LARGE:Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;

.field public static final enum NORMAL:Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;


# instance fields
.field private final spacing:F


# direct methods
.method private static final synthetic $values()[Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;
    .locals 3

    sget-object v0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;->LARGE:Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;

    sget-object v1, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;->NORMAL:Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;

    sget-object v2, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;->COMPACT:Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;

    filled-new-array {v0, v1, v2}, [Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;

    const/4 v1, 0x6

    int-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float/2addr v1, v2

    const-string v3, "LARGE"

    const/4 v4, 0x0

    invoke-direct {v0, v3, v4, v1}, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;-><init>(Ljava/lang/String;IF)V

    sput-object v0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;->LARGE:Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;

    new-instance v0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;

    const/4 v1, 0x1

    mul-float v3, v2, v2

    const-string v4, "NORMAL"

    invoke-direct {v0, v4, v1, v3}, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;-><init>(Ljava/lang/String;IF)V

    sput-object v0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;->NORMAL:Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;

    new-instance v0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;

    const/4 v1, 0x3

    int-to-float v1, v1

    mul-float/2addr v1, v2

    const-string v2, "COMPACT"

    const/4 v3, 0x2

    invoke-direct {v0, v2, v3, v1}, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;-><init>(Ljava/lang/String;IF)V

    sput-object v0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;->COMPACT:Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;

    invoke-static {}, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;->$values()[Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;

    move-result-object v0

    sput-object v0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;->$VALUES:[Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;->$ENTRIES:Lt83/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IF)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;->spacing:F

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

    sget-object v0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;
    .locals 1

    const-class v0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;

    return-object p0
.end method

.method public static values()[Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;
    .locals 1

    sget-object v0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;->$VALUES:[Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;

    return-object v0
.end method


# virtual methods
.method public final getSpacing-D9Ej5fM()F
    .locals 1

    iget v0, p0, Lcom/whoop/universalcheckout/features/receipt/domain/models/ReceiptSectionSpacingType;->spacing:F

    return v0
.end method
