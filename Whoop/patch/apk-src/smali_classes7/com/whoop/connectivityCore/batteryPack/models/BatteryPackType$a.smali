.class public final Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType$a;",
        "",
        "<init>",
        "()V",
        "",
        "byte",
        "Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;",
        "a",
        "(B)Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;",
        "",
        "map",
        "Ljava/util/Map;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(B)Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;
    .locals 1

    invoke-static {}, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;->access$getMap$cp()Ljava/util/Map;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    if-nez p1, :cond_0

    sget-object p1, Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;->PUFFIN:Lcom/whoop/connectivityCore/batteryPack/models/BatteryPackType;

    :cond_0
    return-object p1
.end method
