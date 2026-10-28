.class public final enum Ltp1/h;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ltp1/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Ltp1/h;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "HORMONAL_INSIGHTS_MODE",
        "MCI_CONTRACEPTION_TYPE",
        "PREVIOUS_PREGNANCIES",
        "FERTILITY_INSIGHTS_DISABLE_SURVEY",
        "HORMONAL_GOALS",
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

.field private static final synthetic $VALUES:[Ltp1/h;

.field public static final enum FERTILITY_INSIGHTS_DISABLE_SURVEY:Ltp1/h;

.field public static final enum HORMONAL_GOALS:Ltp1/h;

.field public static final enum HORMONAL_INSIGHTS_MODE:Ltp1/h;

.field public static final enum MCI_CONTRACEPTION_TYPE:Ltp1/h;

.field public static final enum PREVIOUS_PREGNANCIES:Ltp1/h;


# direct methods
.method private static final synthetic $values()[Ltp1/h;
    .locals 5

    sget-object v0, Ltp1/h;->HORMONAL_INSIGHTS_MODE:Ltp1/h;

    sget-object v1, Ltp1/h;->MCI_CONTRACEPTION_TYPE:Ltp1/h;

    sget-object v2, Ltp1/h;->PREVIOUS_PREGNANCIES:Ltp1/h;

    sget-object v3, Ltp1/h;->FERTILITY_INSIGHTS_DISABLE_SURVEY:Ltp1/h;

    sget-object v4, Ltp1/h;->HORMONAL_GOALS:Ltp1/h;

    filled-new-array {v0, v1, v2, v3, v4}, [Ltp1/h;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ltp1/h;

    const-string v1, "HORMONAL_INSIGHTS_MODE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ltp1/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltp1/h;->HORMONAL_INSIGHTS_MODE:Ltp1/h;

    new-instance v0, Ltp1/h;

    const-string v1, "MCI_CONTRACEPTION_TYPE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ltp1/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltp1/h;->MCI_CONTRACEPTION_TYPE:Ltp1/h;

    new-instance v0, Ltp1/h;

    const-string v1, "PREVIOUS_PREGNANCIES"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ltp1/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltp1/h;->PREVIOUS_PREGNANCIES:Ltp1/h;

    new-instance v0, Ltp1/h;

    const-string v1, "FERTILITY_INSIGHTS_DISABLE_SURVEY"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ltp1/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltp1/h;->FERTILITY_INSIGHTS_DISABLE_SURVEY:Ltp1/h;

    new-instance v0, Ltp1/h;

    const-string v1, "HORMONAL_GOALS"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Ltp1/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltp1/h;->HORMONAL_GOALS:Ltp1/h;

    invoke-static {}, Ltp1/h;->$values()[Ltp1/h;

    move-result-object v0

    sput-object v0, Ltp1/h;->$VALUES:[Ltp1/h;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Ltp1/h;->$ENTRIES:Lt83/a;

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

    sget-object v0, Ltp1/h;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ltp1/h;
    .locals 1

    const-class v0, Ltp1/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ltp1/h;

    return-object p0
.end method

.method public static values()[Ltp1/h;
    .locals 1

    sget-object v0, Ltp1/h;->$VALUES:[Ltp1/h;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ltp1/h;

    return-object v0
.end method
