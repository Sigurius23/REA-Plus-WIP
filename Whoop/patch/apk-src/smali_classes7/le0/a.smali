.class public final synthetic Lle0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/advancedlabs/schedulingstep/view/SchedulingStepFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/advancedlabs/schedulingstep/view/SchedulingStepFragment;I)V
    .locals 0

    iput p2, p0, Lle0/a;->w:I

    iput-object p1, p0, Lle0/a;->x:Lcom/whoop/advancedlabs/schedulingstep/view/SchedulingStepFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lle0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lle0/a;->x:Lcom/whoop/advancedlabs/schedulingstep/view/SchedulingStepFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/schedulingstep/view/SchedulingStepFragment;->z(Lcom/whoop/advancedlabs/schedulingstep/view/SchedulingStepFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lle0/a;->x:Lcom/whoop/advancedlabs/schedulingstep/view/SchedulingStepFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/schedulingstep/view/SchedulingStepFragment;->A(Lcom/whoop/advancedlabs/schedulingstep/view/SchedulingStepFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lle0/a;->x:Lcom/whoop/advancedlabs/schedulingstep/view/SchedulingStepFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/schedulingstep/view/SchedulingStepFragment;->C(Lcom/whoop/advancedlabs/schedulingstep/view/SchedulingStepFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lle0/a;->x:Lcom/whoop/advancedlabs/schedulingstep/view/SchedulingStepFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/schedulingstep/view/SchedulingStepFragment;->y(Lcom/whoop/advancedlabs/schedulingstep/view/SchedulingStepFragment;)Lie0/b;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lle0/a;->x:Lcom/whoop/advancedlabs/schedulingstep/view/SchedulingStepFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/schedulingstep/view/SchedulingStepFragment;->E(Lcom/whoop/advancedlabs/schedulingstep/view/SchedulingStepFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
