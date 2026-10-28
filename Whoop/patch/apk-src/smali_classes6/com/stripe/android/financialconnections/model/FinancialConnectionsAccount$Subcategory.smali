.class public final enum Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Subcategory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0011\u0008\u0087\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\n\u000bB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "Companion",
        "com/stripe/android/financialconnections/model/s",
        "com/stripe/android/financialconnections/model/r",
        "CHECKING",
        "CREDIT_CARD",
        "LINE_OF_CREDIT",
        "MORTGAGE",
        "OTHER",
        "SAVINGS",
        "UNKNOWN",
        "financial-connections-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
    with = Lcom/stripe/android/financialconnections/model/s;
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lt83/a;

.field private static final synthetic $VALUES:[Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

.field public static final enum CHECKING:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;
    .annotation runtime Lwc3/h;
        value = "checking"
    .end annotation
.end field

.field public static final enum CREDIT_CARD:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;
    .annotation runtime Lwc3/h;
        value = "credit_card"
    .end annotation
.end field

.field public static final Companion:Lcom/stripe/android/financialconnections/model/r;

.field public static final enum LINE_OF_CREDIT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;
    .annotation runtime Lwc3/h;
        value = "line_of_credit"
    .end annotation
.end field

.field public static final enum MORTGAGE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;
    .annotation runtime Lwc3/h;
        value = "mortgage"
    .end annotation
.end field

.field public static final enum OTHER:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;
    .annotation runtime Lwc3/h;
        value = "other"
    .end annotation
.end field

.field public static final enum SAVINGS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;
    .annotation runtime Lwc3/h;
        value = "savings"
    .end annotation
.end field

.field public static final enum UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;
    .locals 7

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->CHECKING:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    sget-object v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->CREDIT_CARD:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    sget-object v2, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->LINE_OF_CREDIT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->MORTGAGE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    sget-object v4, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->OTHER:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    sget-object v5, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->SAVINGS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    sget-object v6, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    filled-new-array/range {v0 .. v6}, [Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    const/4 v1, 0x0

    const-string v2, "checking"

    const-string v3, "CHECKING"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->CHECKING:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    const/4 v1, 0x1

    const-string v2, "credit_card"

    const-string v3, "CREDIT_CARD"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->CREDIT_CARD:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    const/4 v1, 0x2

    const-string v2, "line_of_credit"

    const-string v3, "LINE_OF_CREDIT"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->LINE_OF_CREDIT:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    const/4 v1, 0x3

    const-string v2, "mortgage"

    const-string v3, "MORTGAGE"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->MORTGAGE:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    const/4 v1, 0x4

    const-string v2, "other"

    const-string v3, "OTHER"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->OTHER:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    const/4 v1, 0x5

    const-string v2, "savings"

    const-string v3, "SAVINGS"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->SAVINGS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    new-instance v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    const/4 v1, 0x6

    const-string v2, "unknown"

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->UNKNOWN:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    invoke-static {}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->$values()[Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->$VALUES:[Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/stripe/android/financialconnections/model/r;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->Companion:Lcom/stripe/android/financialconnections/model/r;

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

    iput-object p3, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->value:Ljava/lang/String;

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

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;
    .locals 1

    const-class v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    return-object p0
.end method

.method public static values()[Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;
    .locals 1

    sget-object v0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->$VALUES:[Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->value:Ljava/lang/String;

    return-object v0
.end method
