.class public final enum Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\u0008\u000b\u0008\u0087\u0081\u0002\u0018\u0000 \t2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;",
        "",
        "",
        "byte",
        "<init>",
        "(Ljava/lang/String;IB)V",
        "B",
        "getByte",
        "()B",
        "Companion",
        "a",
        "PUFFIN",
        "PENGUIN",
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

.field private static final synthetic $VALUES:[Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

.field public static final Companion:Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType$a;

.field public static final enum PENGUIN:Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

.field public static final enum PUFFIN:Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

.field private static final map:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Byte;",
            "Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final byte:B


# direct methods
.method private static final synthetic $values()[Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;
    .locals 2

    sget-object v0, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;->PUFFIN:Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    sget-object v1, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;->PENGUIN:Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    filled-new-array {v0, v1}, [Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    const/16 v1, 0xc

    const-string v2, "PUFFIN"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;->PUFFIN:Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    new-instance v0, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    const/4 v1, 0x1

    const/16 v2, 0xe

    const-string v4, "PENGUIN"

    invoke-direct {v0, v4, v1, v2}, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;-><init>(Ljava/lang/String;IB)V

    sput-object v0, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;->PENGUIN:Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    invoke-static {}, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;->$values()[Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    move-result-object v0

    sput-object v0, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;->$VALUES:[Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    invoke-static {v0}, Lge3/g;->u([Ljava/lang/Enum;)Lt83/b;

    move-result-object v0

    sput-object v0, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;->$ENTRIES:Lt83/a;

    new-instance v0, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;->Companion:Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType$a;

    invoke-static {}, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;->values()[Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    move-result-object v0

    array-length v1, v0

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    const/16 v2, 0x10

    if-ge v1, v2, :cond_0

    move v1, v2

    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    array-length v1, v0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    iget-byte v5, v4, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;->byte:B

    invoke-static {v5}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v5

    invoke-interface {v2, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    sput-object v2, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;->map:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IB)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(B)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-byte p3, p0, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;->byte:B

    return-void
.end method

.method public static final synthetic access$getMap$cp()Ljava/util/Map;
    .locals 1

    sget-object v0, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;->map:Ljava/util/Map;

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

    sget-object v0, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;->$ENTRIES:Lt83/a;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;
    .locals 1

    const-class v0, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    return-object p0
.end method

.method public static values()[Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;
    .locals 1

    sget-object v0, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;->$VALUES:[Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    return-object v0
.end method


# virtual methods
.method public final getByte()B
    .locals 1

    iget-byte v0, p0, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;->byte:B

    return v0
.end method
