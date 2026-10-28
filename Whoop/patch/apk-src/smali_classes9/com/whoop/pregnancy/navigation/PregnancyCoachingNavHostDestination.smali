.class public final enum Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0087\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "SETTINGS_HOME",
        "SETTINGS_EXIT",
        "SETTINGS_EDUCATION",
        "ONBOARDING_WELCOME",
        "ONBOARDING_DUE_DATE",
        "ONBOARDING_SAVED",
        "pregnancy_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

.field public static final enum ONBOARDING_DUE_DATE:Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

.field public static final enum ONBOARDING_SAVED:Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

.field public static final enum ONBOARDING_WELCOME:Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

.field public static final enum SETTINGS_EDUCATION:Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

.field public static final enum SETTINGS_EXIT:Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

.field public static final enum SETTINGS_HOME:Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;
    .locals 6

    sget-object v0, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;->SETTINGS_HOME:Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

    sget-object v1, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;->SETTINGS_EXIT:Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

    sget-object v2, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;->SETTINGS_EDUCATION:Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

    sget-object v3, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;->ONBOARDING_WELCOME:Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

    sget-object v4, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;->ONBOARDING_DUE_DATE:Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

    sget-object v5, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;->ONBOARDING_SAVED:Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

    filled-new-array/range {v0 .. v5}, [Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

    const-string v1, "SETTINGS_HOME"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;->SETTINGS_HOME:Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

    new-instance v0, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

    const-string v1, "SETTINGS_EXIT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;->SETTINGS_EXIT:Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

    new-instance v0, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

    const-string v1, "SETTINGS_EDUCATION"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;->SETTINGS_EDUCATION:Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

    new-instance v0, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

    const-string v1, "ONBOARDING_WELCOME"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;->ONBOARDING_WELCOME:Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

    new-instance v0, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

    const-string v1, "ONBOARDING_DUE_DATE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;->ONBOARDING_DUE_DATE:Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

    new-instance v0, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

    const-string v1, "ONBOARDING_SAVED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;->ONBOARDING_SAVED:Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

    invoke-static {}, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;->$values()[Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

    move-result-object v0

    sput-object v0, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;->$VALUES:[Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;
    .locals 1

    const-class v0, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

    return-object p0
.end method

.method public static values()[Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;
    .locals 1

    sget-object v0, Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;->$VALUES:[Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/pregnancy/navigation/PregnancyCoachingNavHostDestination;

    return-object v0
.end method
