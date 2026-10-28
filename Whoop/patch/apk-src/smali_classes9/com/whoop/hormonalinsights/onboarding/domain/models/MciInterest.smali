.class public final enum Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "BETTER_UNDERSTAND_MY_BODY",
        "GET_PREGNANT",
        "TO_OPTIMIZE_MY_TRAINING",
        "AVOID_PREGNANCY",
        "MONITOR_PERIMENOPAUSE",
        "OTHER_OR_NONE_OF_THE_ABOVE",
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

.field private static final synthetic $VALUES:[Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

.field public static final enum AVOID_PREGNANCY:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

.field public static final enum BETTER_UNDERSTAND_MY_BODY:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

.field public static final enum GET_PREGNANT:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

.field public static final enum MONITOR_PERIMENOPAUSE:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

.field public static final enum OTHER_OR_NONE_OF_THE_ABOVE:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

.field public static final enum TO_OPTIMIZE_MY_TRAINING:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;
    .locals 6

    sget-object v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;->BETTER_UNDERSTAND_MY_BODY:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    sget-object v1, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;->GET_PREGNANT:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    sget-object v2, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;->TO_OPTIMIZE_MY_TRAINING:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    sget-object v3, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;->AVOID_PREGNANCY:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    sget-object v4, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;->MONITOR_PERIMENOPAUSE:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    sget-object v5, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;->OTHER_OR_NONE_OF_THE_ABOVE:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    filled-new-array/range {v0 .. v5}, [Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    const-string v1, "BETTER_UNDERSTAND_MY_BODY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;->BETTER_UNDERSTAND_MY_BODY:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    new-instance v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    const-string v1, "GET_PREGNANT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;->GET_PREGNANT:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    new-instance v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    const-string v1, "TO_OPTIMIZE_MY_TRAINING"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;->TO_OPTIMIZE_MY_TRAINING:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    new-instance v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    const-string v1, "AVOID_PREGNANCY"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;->AVOID_PREGNANCY:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    new-instance v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    const-string v1, "MONITOR_PERIMENOPAUSE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;->MONITOR_PERIMENOPAUSE:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    new-instance v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    const-string v1, "OTHER_OR_NONE_OF_THE_ABOVE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;->OTHER_OR_NONE_OF_THE_ABOVE:Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    invoke-static {}, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;->$values()[Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    move-result-object v0

    sput-object v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;->$VALUES:[Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;
    .locals 1

    const-class v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    return-object p0
.end method

.method public static values()[Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;
    .locals 1

    sget-object v0, Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;->$VALUES:[Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;

    return-object v0
.end method
