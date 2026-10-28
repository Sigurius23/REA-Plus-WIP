.class public final Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mapbox/common/battery/AndroidBatteryMonitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ3\u0010\r\u001a\u00020\u00082\u0010\u0010\u000b\u001a\u000c\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0018\u00010\u00062\u0010\u0010\u000c\u001a\u000c\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\'\u0010\u0012\u001a\u00020\u0011*\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Intent;",
        "intent",
        "Lcom/mapbox/bindgen/Expected;",
        "",
        "",
        "getState",
        "(Landroid/content/Intent;)Lcom/mapbox/bindgen/Expected;",
        "e1",
        "e2",
        "equals",
        "(Lcom/mapbox/bindgen/Expected;Lcom/mapbox/bindgen/Expected;)Z",
        "Lcom/mapbox/common/BatteryMonitorObserver;",
        "state",
        "Ll83/a0;",
        "notify",
        "(Lcom/mapbox/common/BatteryMonitorObserver;Lcom/mapbox/bindgen/Expected;)V",
        "Lcom/mapbox/common/BatteryMonitorInterface;",
        "create",
        "()Lcom/mapbox/common/BatteryMonitorInterface;",
        "",
        "BATTERY_STATUS_UNPLUGGED",
        "I",
        "NO_BATTERY_INFO_ERROR",
        "Ljava/lang/String;",
        "common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
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
    invoke-direct {p0}, Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;-><init>()V

    return-void
.end method

.method public static synthetic a(Lcom/mapbox/common/BatteryMonitorObserver;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;->notify$lambda$0(Lcom/mapbox/common/BatteryMonitorObserver;Z)V

    return-void
.end method

.method public static final synthetic access$equals(Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;Lcom/mapbox/bindgen/Expected;Lcom/mapbox/bindgen/Expected;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;->equals(Lcom/mapbox/bindgen/Expected;Lcom/mapbox/bindgen/Expected;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getState(Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;Landroid/content/Intent;)Lcom/mapbox/bindgen/Expected;
    .locals 0

    invoke-direct {p0, p1}, Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;->getState(Landroid/content/Intent;)Lcom/mapbox/bindgen/Expected;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$notify(Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;Lcom/mapbox/common/BatteryMonitorObserver;Lcom/mapbox/bindgen/Expected;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;->notify(Lcom/mapbox/common/BatteryMonitorObserver;Lcom/mapbox/bindgen/Expected;)V

    return-void
.end method

.method public static synthetic b(Lcom/mapbox/common/BatteryMonitorObserver;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;->notify$lambda$1(Lcom/mapbox/common/BatteryMonitorObserver;Ljava/lang/String;)V

    return-void
.end method

.method private final equals(Lcom/mapbox/bindgen/Expected;Lcom/mapbox/bindgen/Expected;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/bindgen/Expected<",
            "**>;",
            "Lcom/mapbox/bindgen/Expected<",
            "**>;)Z"
        }
    .end annotation

    if-eqz p1, :cond_4

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->isValue()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {p2}, Lcom/mapbox/bindgen/Expected;->isValue()Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    invoke-virtual {p2}, Lcom/mapbox/bindgen/Expected;->isError()Z

    move-result v0

    if-nez v0, :cond_3

    return v1

    :cond_3
    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p2}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    :goto_0
    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method private final getState(Landroid/content/Intent;)Lcom/mapbox/bindgen/Expected;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Intent;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    if-eqz p1, :cond_2

    const-string v0, "plugged"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {p1}, Lcom/mapbox/bindgen/ExpectedFactory;->createValue(Ljava/lang/Object;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "{\n                val is\u2026isCharging)\n            }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_2
    :goto_1
    const-string p1, "Unknown battery status"

    invoke-static {p1}, Lcom/mapbox/bindgen/ExpectedFactory;->createError(Ljava/lang/Object;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "{\n                Expect\u2026INFO_ERROR)\n            }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final notify(Lcom/mapbox/common/BatteryMonitorObserver;Lcom/mapbox/bindgen/Expected;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/common/BatteryMonitorObserver;",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/mapbox/common/battery/a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/mapbox/common/battery/a;-><init>(Lcom/mapbox/common/BatteryMonitorObserver;I)V

    invoke-virtual {p2, v0}, Lcom/mapbox/bindgen/Expected;->onValue(Lcom/mapbox/bindgen/Expected$Action;)Lcom/mapbox/bindgen/Expected;

    move-result-object p2

    new-instance v0, Lcom/mapbox/common/battery/a;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lcom/mapbox/common/battery/a;-><init>(Lcom/mapbox/common/BatteryMonitorObserver;I)V

    invoke-virtual {p2, v0}, Lcom/mapbox/bindgen/Expected;->onError(Lcom/mapbox/bindgen/Expected$Action;)Lcom/mapbox/bindgen/Expected;

    return-void
.end method

.method private static final notify$lambda$0(Lcom/mapbox/common/BatteryMonitorObserver;Z)V
    .locals 1

    const-string v0, "$this_notify"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lcom/mapbox/common/BatteryMonitorObserver;->onBatteryChargingStatusChanged(Z)V

    return-void
.end method

.method private static final notify$lambda$1(Lcom/mapbox/common/BatteryMonitorObserver;Ljava/lang/String;)V
    .locals 1

    const-string v0, "$this_notify"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lcom/mapbox/common/BatteryMonitorObserver;->onBatteryStatusError(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final create()Lcom/mapbox/common/BatteryMonitorInterface;
    .locals 4

    new-instance v0, Lcom/mapbox/common/battery/AndroidBatteryMonitor;

    sget-object v1, Lcom/mapbox/common/MapboxSDKCommon;->INSTANCE:Lcom/mapbox/common/MapboxSDKCommon;

    invoke-virtual {v1}, Lcom/mapbox/common/MapboxSDKCommon;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3, v2}, Lcom/mapbox/common/battery/AndroidBatteryMonitor;-><init>(Landroid/content/Context;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
