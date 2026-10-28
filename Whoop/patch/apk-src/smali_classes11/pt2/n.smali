.class public final synthetic Lpt2/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/weeklyplan/hubandspoke/view/HubAndSpokeFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/weeklyplan/hubandspoke/view/HubAndSpokeFragment;I)V
    .locals 0

    iput p2, p0, Lpt2/n;->w:I

    iput-object p1, p0, Lpt2/n;->x:Lcom/whoop/weeklyplan/hubandspoke/view/HubAndSpokeFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lpt2/n;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lpt2/n;->x:Lcom/whoop/weeklyplan/hubandspoke/view/HubAndSpokeFragment;

    invoke-static {v0}, Lcom/whoop/weeklyplan/hubandspoke/view/HubAndSpokeFragment;->y(Lcom/whoop/weeklyplan/hubandspoke/view/HubAndSpokeFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lpt2/n;->x:Lcom/whoop/weeklyplan/hubandspoke/view/HubAndSpokeFragment;

    invoke-static {v0}, Lcom/whoop/weeklyplan/hubandspoke/view/HubAndSpokeFragment;->B(Lcom/whoop/weeklyplan/hubandspoke/view/HubAndSpokeFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lpt2/n;->x:Lcom/whoop/weeklyplan/hubandspoke/view/HubAndSpokeFragment;

    invoke-static {v0}, Lcom/whoop/weeklyplan/hubandspoke/view/HubAndSpokeFragment;->A(Lcom/whoop/weeklyplan/hubandspoke/view/HubAndSpokeFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lpt2/n;->x:Lcom/whoop/weeklyplan/hubandspoke/view/HubAndSpokeFragment;

    invoke-static {v0}, Lcom/whoop/weeklyplan/hubandspoke/view/HubAndSpokeFragment;->C(Lcom/whoop/weeklyplan/hubandspoke/view/HubAndSpokeFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lpt2/n;->x:Lcom/whoop/weeklyplan/hubandspoke/view/HubAndSpokeFragment;

    invoke-static {v0}, Lcom/whoop/weeklyplan/hubandspoke/view/HubAndSpokeFragment;->z(Lcom/whoop/weeklyplan/hubandspoke/view/HubAndSpokeFragment;)Lit2/a;

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
