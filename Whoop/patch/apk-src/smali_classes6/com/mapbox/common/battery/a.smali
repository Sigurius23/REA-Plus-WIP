.class public final synthetic Lcom/mapbox/common/battery/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/bindgen/Expected$Action;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/mapbox/common/BatteryMonitorObserver;


# direct methods
.method public synthetic constructor <init>(Lcom/mapbox/common/BatteryMonitorObserver;I)V
    .locals 0

    iput p2, p0, Lcom/mapbox/common/battery/a;->a:I

    iput-object p1, p0, Lcom/mapbox/common/battery/a;->b:Lcom/mapbox/common/BatteryMonitorObserver;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lcom/mapbox/common/battery/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/mapbox/common/battery/a;->b:Lcom/mapbox/common/BatteryMonitorObserver;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;->b(Lcom/mapbox/common/BatteryMonitorObserver;Ljava/lang/String;)V

    return-void

    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lcom/mapbox/common/battery/a;->b:Lcom/mapbox/common/BatteryMonitorObserver;

    invoke-static {v0, p1}, Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;->a(Lcom/mapbox/common/BatteryMonitorObserver;Z)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
