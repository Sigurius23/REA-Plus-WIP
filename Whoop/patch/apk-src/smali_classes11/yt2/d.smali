.class public final synthetic Lyt2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroidx/fragment/app/m0;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/m0;I)V
    .locals 0

    iput p2, p0, Lyt2/d;->w:I

    iput-object p1, p0, Lyt2/d;->x:Landroidx/fragment/app/m0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lyt2/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lyt2/d;->x:Landroidx/fragment/app/m0;

    check-cast v0, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;

    invoke-static {v0}, Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;->y(Lcom/whoop/weeklyplan/weeklyplan/view/WeeklyPlanFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lyt2/d;->x:Landroidx/fragment/app/m0;

    check-cast v0, Lcom/whoop/weeklyplan/weeklyplan/view/SummaryV2Fragment;

    invoke-static {v0}, Lcom/whoop/weeklyplan/weeklyplan/view/SummaryV2Fragment;->y(Lcom/whoop/weeklyplan/weeklyplan/view/SummaryV2Fragment;)Lvt2/b;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lyt2/d;->x:Landroidx/fragment/app/m0;

    check-cast v0, Lcom/whoop/weeklyplan/weeklyplan/view/SummaryV2Fragment;

    invoke-static {v0}, Lcom/whoop/weeklyplan/weeklyplan/view/SummaryV2Fragment;->A(Lcom/whoop/weeklyplan/weeklyplan/view/SummaryV2Fragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lyt2/d;->x:Landroidx/fragment/app/m0;

    check-cast v0, Lcom/whoop/weeklyplan/weeklyplan/view/SummaryV2Fragment;

    invoke-static {v0}, Lcom/whoop/weeklyplan/weeklyplan/view/SummaryV2Fragment;->B(Lcom/whoop/weeklyplan/weeklyplan/view/SummaryV2Fragment;)Luf3/a;

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
