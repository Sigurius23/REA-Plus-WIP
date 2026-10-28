.class public final enum Lzj0/j0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzj0/j0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lzj0/j0;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u0011\u0008\u0086\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010j\u0002\u0008\u0011j\u0002\u0008\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lzj0/j0;",
        "",
        "",
        "bit",
        "<init>",
        "(Ljava/lang/String;II)V",
        "I",
        "getBit",
        "()I",
        "Companion",
        "a",
        "FUELGAUGE_BAD_SOC_ERROR",
        "FUELGAUGE_TIMEOUT_ERROR",
        "LISTENER_CHG_STATUS_ERROR",
        "LISTENER_TIMEOUT_ERROR",
        "SERIAL_NUM_NOT_ASSIGNED",
        "STRAP_SIGNATURE_NOT_ASSIGNED",
        "FIRMWARE_VERSION_NOT_ASSIGNED",
        "COMMIT_HASH_VERSION_NOT_ASSIGNED",
        "connectivity_release"
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

.field private static final synthetic $VALUES:[Lzj0/j0;

.field public static final enum COMMIT_HASH_VERSION_NOT_ASSIGNED:Lzj0/j0;

.field public static final Companion:Lzj0/j0$a;

.field public static final enum FIRMWARE_VERSION_NOT_ASSIGNED:Lzj0/j0;

.field public static final enum FUELGAUGE_BAD_SOC_ERROR:Lzj0/j0;

.field public static final enum FUELGAUGE_TIMEOUT_ERROR:Lzj0/j0;

.field public static final enum LISTENER_CHG_STATUS_ERROR:Lzj0/j0;

.field public static final enum LISTENER_TIMEOUT_ERROR:Lzj0/j0;

.field public static final enum SERIAL_NUM_NOT_ASSIGNED:Lzj0/j0;

.field public static final enum STRAP_SIGNATURE_NOT_ASSIGNED:Lzj0/j0;


# instance fields
.field private final bit:I


# direct methods
.method private static final synthetic $values()[Lzj0/j0;
    .locals 8

    sget-object v0, Lzj0/j0;->FUELGAUGE_BAD_SOC_ERROR:Lzj0/j0;

    sget-object v1, Lzj0/j0;->FUELGAUGE_TIMEOUT_ERROR:Lzj0/j0;

    sget-object v2, Lzj0/j0;->LISTENER_CHG_STATUS_ERROR:Lzj0/j0;

    sget-object v3, Lzj0/j0;->LISTENER_TIMEOUT_ERROR:Lzj0/j0;

    sget-object v4, Lzj0/j0;->SERIAL_NUM_NOT_ASSIGNED:Lzj0/j0;

    sget-object v5, Lzj0/j0;->STRAP_SIGNATURE_NOT_ASSIGNED:Lzj0/j0;

    sget-object v6, Lzj0/j0;->FIRMWARE_VERSION_NOT_ASSIGNED:Lzj0/j0;

    sget-object v7, Lzj0/j0;->COMMIT_HASH_VERSION_NOT_ASSIGNED:Lzj0/j0;

    filled-new-array/range {v0 .. v7}, [Lzj0/j0;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lzj0/j0;

    const-string v1, "FUELGAUGE_BAD_SOC_ERROR"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lzj0/j0;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lzj0/j0;->FUELGAUGE_BAD_SOC_ERROR:Lzj0/j0;

    new-instance v0, Lzj0/j0;

    const-string v1, "FUELGAUGE_TIMEOUT_ERROR"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lzj0/j0;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lzj0/j0;->FUELGAUGE_TIMEOUT_ERROR:Lzj0/j0;

    new-instance v0, Lzj0/j0;

    const-string v1, "LISTENER_CHG_STATUS_ERROR"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, v2}, Lzj0/j0;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lzj0/j0;->LISTENER_CHG_STATUS_ERROR:Lzj0/j0;

    new-instance v0, Lzj0/j0;

    const-string v1, "LISTENER_TIMEOUT_ERROR"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2, v2}, Lzj0/j0;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lzj0/j0;->LISTENER_TIMEOUT_ERROR:Lzj0/j0;

    new-instance v0, Lzj0/j0;

    const-string v1, "SERIAL_NUM_NOT_ASSIGNED"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2, v2}, Lzj0/j0;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lzj0/j0;->SERIAL_NUM_NOT_ASSIGNED:Lzj0/j0;

    new-instance v0, Lzj0/j0;

    const-string v1, "STRAP_SIGNATURE_NOT_ASSIGNED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2, v2}, Lzj0/j0;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lzj0/j0;->STRAP_SIGNATURE_NOT_ASSIGNED:Lzj0/j0;

    new-instance v0, Lzj0/j0;

    const-string v1, "FIRMWARE_VERSION_NOT_ASSIGNED"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2, v2}, Lzj0/j0;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lzj0/j0;->FIRMWARE_VERSION_NOT_ASSIGNED:Lzj0/j0;

    new-instance v0, Lzj0/j0;

    const-string v1, "COMMIT_HASH_VERSION_NOT_ASSIGNED"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2, v2}, Lzj0/j0;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lzj0/j0;->COMMIT_HASH_VERSION_NOT_ASSIGNED:Lzj0/j0;

    invoke-static {}, Lzj0/j0;->$values()[Lzj0/j0;

    move-result-object v0

    sput-object v0, Lzj0/j0;->$VALUES:[Lzj0/j0;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lzj0/j0;->$ENTRIES:Lt83/a;

    new-instance v0, Lzj0/j0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzj0/j0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lzj0/j0;->Companion:Lzj0/j0$a;

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

    iput p3, p0, Lzj0/j0;->bit:I

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

    sget-object v0, Lzj0/j0;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lzj0/j0;
    .locals 1

    const-class v0, Lzj0/j0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lzj0/j0;

    return-object p0
.end method

.method public static values()[Lzj0/j0;
    .locals 1

    sget-object v0, Lzj0/j0;->$VALUES:[Lzj0/j0;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lzj0/j0;

    return-object v0
.end method


# virtual methods
.method public final getBit()I
    .locals 1

    iget v0, p0, Lzj0/j0;->bit:I

    return v0
.end method
