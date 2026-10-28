.class public final synthetic Lmp0/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lmp0/h0;


# direct methods
.method public synthetic constructor <init>(Lmp0/h0;I)V
    .locals 0

    iput p2, p0, Lmp0/g0;->w:I

    iput-object p1, p0, Lmp0/g0;->x:Lmp0/h0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lmp0/g0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmp0/g0;->x:Lmp0/h0;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lmp0/h0;->I(Lmp0/h0;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lmp0/g0;->x:Lmp0/h0;

    check-cast p1, Lcom/whoop/coaching/sleepcoach/wizard/g;

    invoke-static {v0, p1}, Lmp0/h0;->E(Lmp0/h0;Lcom/whoop/coaching/sleepcoach/wizard/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lmp0/g0;->x:Lmp0/h0;

    check-cast p1, Lcom/whoop/coaching/sleepcoach/wizard/g;

    invoke-static {v0, p1}, Lmp0/h0;->G(Lmp0/h0;Lcom/whoop/coaching/sleepcoach/wizard/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lmp0/g0;->x:Lmp0/h0;

    invoke-static {v0, p1}, Lmp0/h0;->J(Lmp0/h0;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lmp0/g0;->x:Lmp0/h0;

    check-cast p1, Lop0/a;

    invoke-static {v0, p1}, Lmp0/h0;->L(Lmp0/h0;Lop0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lmp0/g0;->x:Lmp0/h0;

    invoke-static {v0, p1}, Lmp0/h0;->F(Lmp0/h0;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lmp0/g0;->x:Lmp0/h0;

    check-cast p1, Lmp0/j0;

    invoke-static {v0, p1}, Lmp0/h0;->M(Lmp0/h0;Lmp0/j0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
