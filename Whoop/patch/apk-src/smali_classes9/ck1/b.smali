.class public final synthetic Lck1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;I)V
    .locals 0

    iput p2, p0, Lck1/b;->w:I

    iput-object p1, p0, Lck1/b;->x:Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lck1/b;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lck1/b;->x:Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;

    check-cast p1, Lvj1/a;

    invoke-static {v0, p1}, Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;->D(Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;Lvj1/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lck1/b;->x:Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;

    check-cast p1, Lak1/b;

    invoke-static {v0, p1}, Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;->F(Lcom/whoop/healthmonitor/view/ComposableHealthMonitorFragment;Lak1/b;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
