.class public final synthetic Lpj2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/stress/view/StressMonitorFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/stress/view/StressMonitorFragment;I)V
    .locals 0

    iput p2, p0, Lpj2/d;->w:I

    iput-object p1, p0, Lpj2/d;->x:Lcom/whoop/stress/view/StressMonitorFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lpj2/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpj2/d;->x:Lcom/whoop/stress/view/StressMonitorFragment;

    invoke-static {v0}, Lcom/whoop/stress/view/StressMonitorFragment;->G(Lcom/whoop/stress/view/StressMonitorFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lpj2/d;->x:Lcom/whoop/stress/view/StressMonitorFragment;

    invoke-static {v0}, Lcom/whoop/stress/view/StressMonitorFragment;->N(Lcom/whoop/stress/view/StressMonitorFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
