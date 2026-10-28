.class public final synthetic Lmf2/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/sleep/coach/view/scheduleList/SleepWakeTimeScheduleListFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/sleep/coach/view/scheduleList/SleepWakeTimeScheduleListFragment;I)V
    .locals 0

    iput p2, p0, Lmf2/g;->w:I

    iput-object p1, p0, Lmf2/g;->x:Lcom/whoop/sleep/coach/view/scheduleList/SleepWakeTimeScheduleListFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lmf2/g;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmf2/g;->x:Lcom/whoop/sleep/coach/view/scheduleList/SleepWakeTimeScheduleListFragment;

    check-cast p1, Lwe2/a;

    invoke-static {v0, p1}, Lcom/whoop/sleep/coach/view/scheduleList/SleepWakeTimeScheduleListFragment;->E(Lcom/whoop/sleep/coach/view/scheduleList/SleepWakeTimeScheduleListFragment;Lwe2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lmf2/g;->x:Lcom/whoop/sleep/coach/view/scheduleList/SleepWakeTimeScheduleListFragment;

    check-cast p1, Lif2/a;

    invoke-static {v0, p1}, Lcom/whoop/sleep/coach/view/scheduleList/SleepWakeTimeScheduleListFragment;->I(Lcom/whoop/sleep/coach/view/scheduleList/SleepWakeTimeScheduleListFragment;Lif2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lmf2/g;->x:Lcom/whoop/sleep/coach/view/scheduleList/SleepWakeTimeScheduleListFragment;

    check-cast p1, Lpf2/c;

    invoke-static {v0, p1}, Lcom/whoop/sleep/coach/view/scheduleList/SleepWakeTimeScheduleListFragment;->F(Lcom/whoop/sleep/coach/view/scheduleList/SleepWakeTimeScheduleListFragment;Lpf2/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lmf2/g;->x:Lcom/whoop/sleep/coach/view/scheduleList/SleepWakeTimeScheduleListFragment;

    check-cast p1, Lnf2/a;

    invoke-static {v0, p1}, Lcom/whoop/sleep/coach/view/scheduleList/SleepWakeTimeScheduleListFragment;->H(Lcom/whoop/sleep/coach/view/scheduleList/SleepWakeTimeScheduleListFragment;Lnf2/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
