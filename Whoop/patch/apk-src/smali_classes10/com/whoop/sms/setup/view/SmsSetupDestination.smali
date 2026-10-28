.class public final enum Lcom/whoop/sms/setup/view/SmsSetupDestination;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/sms/setup/view/SmsSetupDestination;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\t\u0008\u0087\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\t\u001a\u0004\u0018\u00010\u0000j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/sms/setup/view/SmsSetupDestination;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "INTRO",
        "INPUT",
        "ENTER_CODE",
        "COMPLETED",
        "TERMS_OF_SERVICE",
        "getNextStep",
        "sms_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/sms/setup/view/SmsSetupDestination;

.field public static final enum COMPLETED:Lcom/whoop/sms/setup/view/SmsSetupDestination;

.field public static final enum ENTER_CODE:Lcom/whoop/sms/setup/view/SmsSetupDestination;

.field public static final enum INPUT:Lcom/whoop/sms/setup/view/SmsSetupDestination;

.field public static final enum INTRO:Lcom/whoop/sms/setup/view/SmsSetupDestination;

.field public static final enum TERMS_OF_SERVICE:Lcom/whoop/sms/setup/view/SmsSetupDestination;


# direct methods
.method private static final synthetic $values()[Lcom/whoop/sms/setup/view/SmsSetupDestination;
    .locals 5

    sget-object v0, Lcom/whoop/sms/setup/view/SmsSetupDestination;->INTRO:Lcom/whoop/sms/setup/view/SmsSetupDestination;

    sget-object v1, Lcom/whoop/sms/setup/view/SmsSetupDestination;->INPUT:Lcom/whoop/sms/setup/view/SmsSetupDestination;

    sget-object v2, Lcom/whoop/sms/setup/view/SmsSetupDestination;->ENTER_CODE:Lcom/whoop/sms/setup/view/SmsSetupDestination;

    sget-object v3, Lcom/whoop/sms/setup/view/SmsSetupDestination;->COMPLETED:Lcom/whoop/sms/setup/view/SmsSetupDestination;

    sget-object v4, Lcom/whoop/sms/setup/view/SmsSetupDestination;->TERMS_OF_SERVICE:Lcom/whoop/sms/setup/view/SmsSetupDestination;

    filled-new-array {v0, v1, v2, v3, v4}, [Lcom/whoop/sms/setup/view/SmsSetupDestination;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/sms/setup/view/SmsSetupDestination;

    const-string v1, "INTRO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/whoop/sms/setup/view/SmsSetupDestination;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/sms/setup/view/SmsSetupDestination;->INTRO:Lcom/whoop/sms/setup/view/SmsSetupDestination;

    new-instance v0, Lcom/whoop/sms/setup/view/SmsSetupDestination;

    const-string v1, "INPUT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/whoop/sms/setup/view/SmsSetupDestination;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/sms/setup/view/SmsSetupDestination;->INPUT:Lcom/whoop/sms/setup/view/SmsSetupDestination;

    new-instance v0, Lcom/whoop/sms/setup/view/SmsSetupDestination;

    const-string v1, "ENTER_CODE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lcom/whoop/sms/setup/view/SmsSetupDestination;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/sms/setup/view/SmsSetupDestination;->ENTER_CODE:Lcom/whoop/sms/setup/view/SmsSetupDestination;

    new-instance v0, Lcom/whoop/sms/setup/view/SmsSetupDestination;

    const-string v1, "COMPLETED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/whoop/sms/setup/view/SmsSetupDestination;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/sms/setup/view/SmsSetupDestination;->COMPLETED:Lcom/whoop/sms/setup/view/SmsSetupDestination;

    new-instance v0, Lcom/whoop/sms/setup/view/SmsSetupDestination;

    const-string v1, "TERMS_OF_SERVICE"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lcom/whoop/sms/setup/view/SmsSetupDestination;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/whoop/sms/setup/view/SmsSetupDestination;->TERMS_OF_SERVICE:Lcom/whoop/sms/setup/view/SmsSetupDestination;

    invoke-static {}, Lcom/whoop/sms/setup/view/SmsSetupDestination;->$values()[Lcom/whoop/sms/setup/view/SmsSetupDestination;

    move-result-object v0

    sput-object v0, Lcom/whoop/sms/setup/view/SmsSetupDestination;->$VALUES:[Lcom/whoop/sms/setup/view/SmsSetupDestination;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/sms/setup/view/SmsSetupDestination;->$ENTRIES:Lt83/a;

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

    sget-object v0, Lcom/whoop/sms/setup/view/SmsSetupDestination;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/sms/setup/view/SmsSetupDestination;
    .locals 1

    const-class v0, Lcom/whoop/sms/setup/view/SmsSetupDestination;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/sms/setup/view/SmsSetupDestination;

    return-object p0
.end method

.method public static values()[Lcom/whoop/sms/setup/view/SmsSetupDestination;
    .locals 1

    sget-object v0, Lcom/whoop/sms/setup/view/SmsSetupDestination;->$VALUES:[Lcom/whoop/sms/setup/view/SmsSetupDestination;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/sms/setup/view/SmsSetupDestination;

    return-object v0
.end method


# virtual methods
.method public final getNextStep()Lcom/whoop/sms/setup/view/SmsSetupDestination;
    .locals 4

    sget-object v0, Lcom/whoop/sms/setup/view/SmsSetupDestination;->INTRO:Lcom/whoop/sms/setup/view/SmsSetupDestination;

    sget-object v1, Lcom/whoop/sms/setup/view/SmsSetupDestination;->INPUT:Lcom/whoop/sms/setup/view/SmsSetupDestination;

    sget-object v2, Lcom/whoop/sms/setup/view/SmsSetupDestination;->ENTER_CODE:Lcom/whoop/sms/setup/view/SmsSetupDestination;

    sget-object v3, Lcom/whoop/sms/setup/view/SmsSetupDestination;->COMPLETED:Lcom/whoop/sms/setup/view/SmsSetupDestination;

    filled-new-array {v0, v1, v2, v3}, [Lcom/whoop/sms/setup/view/SmsSetupDestination;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    if-ltz v1, :cond_0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/sms/setup/view/SmsSetupDestination;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
