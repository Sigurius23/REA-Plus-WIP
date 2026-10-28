.class public final enum Lcom/whoop/mfa/setup/view/MfaSetupDestination;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/mfa/setup/view/MfaSetupDestination$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/mfa/setup/view/MfaSetupDestination;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010\u0007\n\u0002\u0008\u000b\u0008\u0087\u0081\u0002\u0018\u0000 \u000f2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\r\u0010\u0008\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\r\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\r\u001a\u0004\u0008\u000e\u0010\tj\u0002\u0008\u0011j\u0002\u0008\u0012j\u0002\u0008\u0013j\u0002\u0008\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/whoop/mfa/setup/view/MfaSetupDestination;",
        "",
        "",
        "step",
        "<init>",
        "(Ljava/lang/String;II)V",
        "getNextStep",
        "()Lcom/whoop/mfa/setup/view/MfaSetupDestination;",
        "getCurrentStepIndex",
        "()I",
        "",
        "getProgress",
        "()F",
        "I",
        "getStep",
        "Companion",
        "a",
        "INTRO",
        "INPUT",
        "ENTER_CODE",
        "COMPLETED",
        "mfa_release"
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

.field private static final synthetic $VALUES:[Lcom/whoop/mfa/setup/view/MfaSetupDestination;

.field public static final enum COMPLETED:Lcom/whoop/mfa/setup/view/MfaSetupDestination;

.field public static final Companion:Lcom/whoop/mfa/setup/view/MfaSetupDestination$a;

.field public static final enum ENTER_CODE:Lcom/whoop/mfa/setup/view/MfaSetupDestination;

.field public static final enum INPUT:Lcom/whoop/mfa/setup/view/MfaSetupDestination;

.field public static final enum INTRO:Lcom/whoop/mfa/setup/view/MfaSetupDestination;

.field private static final stepsSortedByOrder:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/mfa/setup/view/MfaSetupDestination;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final step:I


# direct methods
.method private static final synthetic $values()[Lcom/whoop/mfa/setup/view/MfaSetupDestination;
    .locals 4

    sget-object v0, Lcom/whoop/mfa/setup/view/MfaSetupDestination;->INTRO:Lcom/whoop/mfa/setup/view/MfaSetupDestination;

    sget-object v1, Lcom/whoop/mfa/setup/view/MfaSetupDestination;->INPUT:Lcom/whoop/mfa/setup/view/MfaSetupDestination;

    sget-object v2, Lcom/whoop/mfa/setup/view/MfaSetupDestination;->ENTER_CODE:Lcom/whoop/mfa/setup/view/MfaSetupDestination;

    sget-object v3, Lcom/whoop/mfa/setup/view/MfaSetupDestination;->COMPLETED:Lcom/whoop/mfa/setup/view/MfaSetupDestination;

    filled-new-array {v0, v1, v2, v3}, [Lcom/whoop/mfa/setup/view/MfaSetupDestination;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/mfa/setup/view/MfaSetupDestination;

    const-string v1, "INTRO"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/whoop/mfa/setup/view/MfaSetupDestination;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/whoop/mfa/setup/view/MfaSetupDestination;->INTRO:Lcom/whoop/mfa/setup/view/MfaSetupDestination;

    new-instance v0, Lcom/whoop/mfa/setup/view/MfaSetupDestination;

    const-string v1, "INPUT"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lcom/whoop/mfa/setup/view/MfaSetupDestination;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/whoop/mfa/setup/view/MfaSetupDestination;->INPUT:Lcom/whoop/mfa/setup/view/MfaSetupDestination;

    new-instance v0, Lcom/whoop/mfa/setup/view/MfaSetupDestination;

    const-string v1, "ENTER_CODE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lcom/whoop/mfa/setup/view/MfaSetupDestination;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/whoop/mfa/setup/view/MfaSetupDestination;->ENTER_CODE:Lcom/whoop/mfa/setup/view/MfaSetupDestination;

    new-instance v0, Lcom/whoop/mfa/setup/view/MfaSetupDestination;

    const-string v1, "COMPLETED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lcom/whoop/mfa/setup/view/MfaSetupDestination;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/whoop/mfa/setup/view/MfaSetupDestination;->COMPLETED:Lcom/whoop/mfa/setup/view/MfaSetupDestination;

    invoke-static {}, Lcom/whoop/mfa/setup/view/MfaSetupDestination;->$values()[Lcom/whoop/mfa/setup/view/MfaSetupDestination;

    move-result-object v0

    sput-object v0, Lcom/whoop/mfa/setup/view/MfaSetupDestination;->$VALUES:[Lcom/whoop/mfa/setup/view/MfaSetupDestination;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/mfa/setup/view/MfaSetupDestination;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/mfa/setup/view/MfaSetupDestination$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/mfa/setup/view/MfaSetupDestination$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/mfa/setup/view/MfaSetupDestination;->Companion:Lcom/whoop/mfa/setup/view/MfaSetupDestination$a;

    invoke-static {}, Lcom/whoop/mfa/setup/view/MfaSetupDestination;->values()[Lcom/whoop/mfa/setup/view/MfaSetupDestination;

    move-result-object v0

    new-instance v1, Lcom/whoop/mfa/setup/view/MfaSetupDestination$b;

    invoke-direct {v1}, Lcom/whoop/mfa/setup/view/MfaSetupDestination$b;-><init>()V

    invoke-static {v0, v1}, Lm83/n;->Q0([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/whoop/mfa/setup/view/MfaSetupDestination;->stepsSortedByOrder:Ljava/util/List;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/whoop/mfa/setup/view/MfaSetupDestination;->step:I

    return-void
.end method

.method public static final synthetic access$getStepsSortedByOrder$cp()Ljava/util/List;
    .locals 1

    sget-object v0, Lcom/whoop/mfa/setup/view/MfaSetupDestination;->stepsSortedByOrder:Ljava/util/List;

    return-object v0
.end method

.method public static getEntries()Lt83/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt83/a;"
        }
    .end annotation

    sget-object v0, Lcom/whoop/mfa/setup/view/MfaSetupDestination;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/mfa/setup/view/MfaSetupDestination;
    .locals 1

    const-class v0, Lcom/whoop/mfa/setup/view/MfaSetupDestination;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/mfa/setup/view/MfaSetupDestination;

    return-object p0
.end method

.method public static values()[Lcom/whoop/mfa/setup/view/MfaSetupDestination;
    .locals 1

    sget-object v0, Lcom/whoop/mfa/setup/view/MfaSetupDestination;->$VALUES:[Lcom/whoop/mfa/setup/view/MfaSetupDestination;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/mfa/setup/view/MfaSetupDestination;

    return-object v0
.end method


# virtual methods
.method public final getCurrentStepIndex()I
    .locals 1

    sget-object v0, Lcom/whoop/mfa/setup/view/MfaSetupDestination;->stepsSortedByOrder:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final getNextStep()Lcom/whoop/mfa/setup/view/MfaSetupDestination;
    .locals 3

    sget-object v0, Lcom/whoop/mfa/setup/view/MfaSetupDestination;->stepsSortedByOrder:Ljava/util/List;

    invoke-interface {v0, p0}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/mfa/setup/view/MfaSetupDestination;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getProgress()F
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/mfa/setup/view/MfaSetupDestination;->getCurrentStepIndex()I

    move-result v0

    int-to-float v0, v0

    sget-object v1, Lcom/whoop/mfa/setup/view/MfaSetupDestination;->Companion:Lcom/whoop/mfa/setup/view/MfaSetupDestination$a;

    invoke-virtual {v1}, Lcom/whoop/mfa/setup/view/MfaSetupDestination$a;->a()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method public final getStep()I
    .locals 1

    iget v0, p0, Lcom/whoop/mfa/setup/view/MfaSetupDestination;->step:I

    return v0
.end method
