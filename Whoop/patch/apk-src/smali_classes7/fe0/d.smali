.class public final synthetic Lfe0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/advancedlabs/schedulingform/view/SchedulingFormFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/advancedlabs/schedulingform/view/SchedulingFormFragment;I)V
    .locals 0

    iput p2, p0, Lfe0/d;->w:I

    iput-object p1, p0, Lfe0/d;->x:Lcom/whoop/advancedlabs/schedulingform/view/SchedulingFormFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lfe0/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lfe0/d;->x:Lcom/whoop/advancedlabs/schedulingform/view/SchedulingFormFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/schedulingform/view/SchedulingFormFragment;->F(Lcom/whoop/advancedlabs/schedulingform/view/SchedulingFormFragment;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lfe0/d;->x:Lcom/whoop/advancedlabs/schedulingform/view/SchedulingFormFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/schedulingform/view/SchedulingFormFragment;->D(Lcom/whoop/advancedlabs/schedulingform/view/SchedulingFormFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lfe0/d;->x:Lcom/whoop/advancedlabs/schedulingform/view/SchedulingFormFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/schedulingform/view/SchedulingFormFragment;->I(Lcom/whoop/advancedlabs/schedulingform/view/SchedulingFormFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lfe0/d;->x:Lcom/whoop/advancedlabs/schedulingform/view/SchedulingFormFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/schedulingform/view/SchedulingFormFragment;->E(Lcom/whoop/advancedlabs/schedulingform/view/SchedulingFormFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lfe0/d;->x:Lcom/whoop/advancedlabs/schedulingform/view/SchedulingFormFragment;

    invoke-static {v0}, Lcom/whoop/advancedlabs/schedulingform/view/SchedulingFormFragment;->C(Lcom/whoop/advancedlabs/schedulingform/view/SchedulingFormFragment;)Luf3/a;

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
