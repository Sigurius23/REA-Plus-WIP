.class public final synthetic Lck1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;I)V
    .locals 0

    iput p2, p0, Lck1/a;->w:I

    iput-object p1, p0, Lck1/a;->x:Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lck1/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lck1/a;->x:Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;

    invoke-static {v0}, Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;->B(Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lck1/a;->x:Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;

    invoke-static {v0}, Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;->E(Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;)Lcom/whoop/hrZones/network/ZoneID;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lck1/a;->x:Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;

    invoke-static {v0}, Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;->A(Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lck1/a;->x:Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;

    invoke-static {v0}, Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;->z(Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
