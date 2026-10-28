.class public final synthetic Lmp0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/coaching/sleepcoach/wizard/d;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/coaching/sleepcoach/wizard/d;I)V
    .locals 0

    iput p2, p0, Lmp0/r;->w:I

    iput-object p1, p0, Lmp0/r;->x:Lcom/whoop/coaching/sleepcoach/wizard/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lmp0/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmp0/r;->x:Lcom/whoop/coaching/sleepcoach/wizard/d;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/coaching/sleepcoach/wizard/d;->K(Lcom/whoop/coaching/sleepcoach/wizard/d;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lmp0/r;->x:Lcom/whoop/coaching/sleepcoach/wizard/d;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/coaching/sleepcoach/wizard/d;->E(Lcom/whoop/coaching/sleepcoach/wizard/d;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lmp0/r;->x:Lcom/whoop/coaching/sleepcoach/wizard/d;

    check-cast p1, Lmp0/p;

    invoke-static {v0, p1}, Lcom/whoop/coaching/sleepcoach/wizard/d;->I(Lcom/whoop/coaching/sleepcoach/wizard/d;Lmp0/p;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lmp0/r;->x:Lcom/whoop/coaching/sleepcoach/wizard/d;

    check-cast p1, Lmp0/k;

    invoke-static {v0, p1}, Lcom/whoop/coaching/sleepcoach/wizard/d;->J(Lcom/whoop/coaching/sleepcoach/wizard/d;Lmp0/k;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lmp0/r;->x:Lcom/whoop/coaching/sleepcoach/wizard/d;

    invoke-static {v0, p1}, Lcom/whoop/coaching/sleepcoach/wizard/d;->F(Lcom/whoop/coaching/sleepcoach/wizard/d;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lmp0/r;->x:Lcom/whoop/coaching/sleepcoach/wizard/d;

    check-cast p1, Lmp0/a;

    invoke-static {v0, p1}, Lcom/whoop/coaching/sleepcoach/wizard/d;->L(Lcom/whoop/coaching/sleepcoach/wizard/d;Lmp0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lmp0/r;->x:Lcom/whoop/coaching/sleepcoach/wizard/d;

    check-cast p1, Lmp0/c;

    invoke-static {v0, p1}, Lcom/whoop/coaching/sleepcoach/wizard/d;->G(Lcom/whoop/coaching/sleepcoach/wizard/d;Lmp0/c;)Ll83/a0;

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
