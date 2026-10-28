.class public final enum Lrm2/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrm2/f$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lrm2/f;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u000f\u0008\u0086\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lrm2/f;",
        "",
        "",
        "identifier",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "Ljava/lang/String;",
        "getIdentifier",
        "()Ljava/lang/String;",
        "Companion",
        "a",
        "CHOOSE_STRAP",
        "WAKE_YOUR_WHOOP",
        "DONT_SEE_YOUR_DEVICE",
        "TAKE_OFF_YOUR_WHOOP",
        "TAP_RAPIDLY",
        "CONNECTION_FAILURE",
        "app_prodStandardRelease"
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

.field private static final synthetic $VALUES:[Lrm2/f;

.field public static final enum CHOOSE_STRAP:Lrm2/f;

.field public static final enum CONNECTION_FAILURE:Lrm2/f;

.field public static final Companion:Lrm2/f$a;

.field public static final enum DONT_SEE_YOUR_DEVICE:Lrm2/f;

.field public static final enum TAKE_OFF_YOUR_WHOOP:Lrm2/f;

.field public static final enum TAP_RAPIDLY:Lrm2/f;

.field public static final enum WAKE_YOUR_WHOOP:Lrm2/f;


# instance fields
.field private final identifier:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lrm2/f;
    .locals 6

    sget-object v0, Lrm2/f;->CHOOSE_STRAP:Lrm2/f;

    sget-object v1, Lrm2/f;->WAKE_YOUR_WHOOP:Lrm2/f;

    sget-object v2, Lrm2/f;->DONT_SEE_YOUR_DEVICE:Lrm2/f;

    sget-object v3, Lrm2/f;->TAKE_OFF_YOUR_WHOOP:Lrm2/f;

    sget-object v4, Lrm2/f;->TAP_RAPIDLY:Lrm2/f;

    sget-object v5, Lrm2/f;->CONNECTION_FAILURE:Lrm2/f;

    filled-new-array/range {v0 .. v5}, [Lrm2/f;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lrm2/f;

    const/4 v1, 0x0

    const-string v2, "choose_strap"

    const-string v3, "CHOOSE_STRAP"

    invoke-direct {v0, v3, v1, v2}, Lrm2/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lrm2/f;->CHOOSE_STRAP:Lrm2/f;

    new-instance v0, Lrm2/f;

    const/4 v1, 0x1

    const-string v2, "wake_your_whoop"

    const-string v3, "WAKE_YOUR_WHOOP"

    invoke-direct {v0, v3, v1, v2}, Lrm2/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lrm2/f;->WAKE_YOUR_WHOOP:Lrm2/f;

    new-instance v0, Lrm2/f;

    const/4 v1, 0x2

    const-string v2, "dont_see_your_device"

    const-string v3, "DONT_SEE_YOUR_DEVICE"

    invoke-direct {v0, v3, v1, v2}, Lrm2/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lrm2/f;->DONT_SEE_YOUR_DEVICE:Lrm2/f;

    new-instance v0, Lrm2/f;

    const/4 v1, 0x3

    const-string v2, "take_off_your_whoop"

    const-string v3, "TAKE_OFF_YOUR_WHOOP"

    invoke-direct {v0, v3, v1, v2}, Lrm2/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lrm2/f;->TAKE_OFF_YOUR_WHOOP:Lrm2/f;

    new-instance v0, Lrm2/f;

    const/4 v1, 0x4

    const-string v2, "tap_rapidly"

    const-string v3, "TAP_RAPIDLY"

    invoke-direct {v0, v3, v1, v2}, Lrm2/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lrm2/f;->TAP_RAPIDLY:Lrm2/f;

    new-instance v0, Lrm2/f;

    const/4 v1, 0x5

    const-string v2, "connection_failure"

    const-string v3, "CONNECTION_FAILURE"

    invoke-direct {v0, v3, v1, v2}, Lrm2/f;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lrm2/f;->CONNECTION_FAILURE:Lrm2/f;

    invoke-static {}, Lrm2/f;->$values()[Lrm2/f;

    move-result-object v0

    sput-object v0, Lrm2/f;->$VALUES:[Lrm2/f;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lrm2/f;->$ENTRIES:Lt83/a;

    new-instance v0, Lrm2/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lrm2/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lrm2/f;->Companion:Lrm2/f$a;

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

    iput-object p3, p0, Lrm2/f;->identifier:Ljava/lang/String;

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

    sget-object v0, Lrm2/f;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lrm2/f;
    .locals 1

    const-class v0, Lrm2/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lrm2/f;

    return-object p0
.end method

.method public static values()[Lrm2/f;
    .locals 1

    sget-object v0, Lrm2/f;->$VALUES:[Lrm2/f;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lrm2/f;

    return-object v0
.end method


# virtual methods
.method public final getIdentifier()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lrm2/f;->identifier:Ljava/lang/String;

    return-object v0
.end method
