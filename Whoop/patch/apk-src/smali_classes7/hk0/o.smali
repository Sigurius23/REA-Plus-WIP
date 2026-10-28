.class public final enum Lhk0/o;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhk0/o$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lhk0/o;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0008\n\u0002\u0008\u000f\u0008\u0086\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000fj\u0002\u0008\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lhk0/o;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;II)V",
        "I",
        "getValue",
        "()I",
        "Companion",
        "a",
        "UNKNOWN",
        "BLE_COMMAND_FRAMEWORK",
        "HISTORICAL_METADATA",
        "HISTORICAL_DATA",
        "REALTIME_DATA",
        "INFORMATIONAL",
        "connectivity-core_release"
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

.field private static final synthetic $VALUES:[Lhk0/o;

.field public static final enum BLE_COMMAND_FRAMEWORK:Lhk0/o;

.field public static final Companion:Lhk0/o$a;

.field public static final enum HISTORICAL_DATA:Lhk0/o;

.field public static final enum HISTORICAL_METADATA:Lhk0/o;

.field public static final enum INFORMATIONAL:Lhk0/o;

.field public static final enum REALTIME_DATA:Lhk0/o;

.field public static final enum UNKNOWN:Lhk0/o;


# instance fields
.field private final value:I


# direct methods
.method private static final synthetic $values()[Lhk0/o;
    .locals 6

    sget-object v0, Lhk0/o;->UNKNOWN:Lhk0/o;

    sget-object v1, Lhk0/o;->BLE_COMMAND_FRAMEWORK:Lhk0/o;

    sget-object v2, Lhk0/o;->HISTORICAL_METADATA:Lhk0/o;

    sget-object v3, Lhk0/o;->HISTORICAL_DATA:Lhk0/o;

    sget-object v4, Lhk0/o;->REALTIME_DATA:Lhk0/o;

    sget-object v5, Lhk0/o;->INFORMATIONAL:Lhk0/o;

    filled-new-array/range {v0 .. v5}, [Lhk0/o;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lhk0/o;

    const/4 v1, 0x0

    const/4 v2, -0x1

    const-string v3, "UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lhk0/o;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhk0/o;->UNKNOWN:Lhk0/o;

    new-instance v0, Lhk0/o;

    const/4 v1, 0x1

    const/16 v2, 0x40

    const-string v3, "BLE_COMMAND_FRAMEWORK"

    invoke-direct {v0, v3, v1, v2}, Lhk0/o;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhk0/o;->BLE_COMMAND_FRAMEWORK:Lhk0/o;

    new-instance v0, Lhk0/o;

    const/4 v1, 0x2

    const/16 v2, 0x41

    const-string v3, "HISTORICAL_METADATA"

    invoke-direct {v0, v3, v1, v2}, Lhk0/o;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhk0/o;->HISTORICAL_METADATA:Lhk0/o;

    new-instance v0, Lhk0/o;

    const/4 v1, 0x3

    const/16 v2, 0x42

    const-string v3, "HISTORICAL_DATA"

    invoke-direct {v0, v3, v1, v2}, Lhk0/o;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhk0/o;->HISTORICAL_DATA:Lhk0/o;

    new-instance v0, Lhk0/o;

    const/4 v1, 0x4

    const/16 v2, 0x43

    const-string v3, "REALTIME_DATA"

    invoke-direct {v0, v3, v1, v2}, Lhk0/o;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhk0/o;->REALTIME_DATA:Lhk0/o;

    new-instance v0, Lhk0/o;

    const/4 v1, 0x5

    const/16 v2, 0x44

    const-string v3, "INFORMATIONAL"

    invoke-direct {v0, v3, v1, v2}, Lhk0/o;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lhk0/o;->INFORMATIONAL:Lhk0/o;

    invoke-static {}, Lhk0/o;->$values()[Lhk0/o;

    move-result-object v0

    sput-object v0, Lhk0/o;->$VALUES:[Lhk0/o;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lhk0/o;->$ENTRIES:Lt83/a;

    new-instance v0, Lhk0/o$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhk0/o$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lhk0/o;->Companion:Lhk0/o$a;

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

    iput p3, p0, Lhk0/o;->value:I

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

    sget-object v0, Lhk0/o;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lhk0/o;
    .locals 1

    const-class v0, Lhk0/o;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lhk0/o;

    return-object p0
.end method

.method public static values()[Lhk0/o;
    .locals 1

    sget-object v0, Lhk0/o;->$VALUES:[Lhk0/o;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lhk0/o;

    return-object v0
.end method


# virtual methods
.method public final getValue()I
    .locals 1

    iget v0, p0, Lhk0/o;->value:I

    return v0
.end method
