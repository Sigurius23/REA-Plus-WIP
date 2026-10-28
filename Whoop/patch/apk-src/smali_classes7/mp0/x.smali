.class public final synthetic Lmp0/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lmp0/b0;


# direct methods
.method public synthetic constructor <init>(Lmp0/b0;I)V
    .locals 0

    iput p2, p0, Lmp0/x;->w:I

    iput-object p1, p0, Lmp0/x;->x:Lmp0/b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lmp0/x;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmp0/x;->x:Lmp0/b0;

    check-cast p1, Lop0/h;

    invoke-static {v0, p1}, Lmp0/b0;->G(Lmp0/b0;Lop0/h;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lmp0/x;->x:Lmp0/b0;

    check-cast p1, Lop0/a;

    invoke-static {v0, p1}, Lmp0/b0;->S(Lmp0/b0;Lop0/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lmp0/x;->x:Lmp0/b0;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lmp0/b0;->P(Lmp0/b0;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lmp0/x;->x:Lmp0/b0;

    check-cast p1, Lmp0/c;

    invoke-static {v0, p1}, Lmp0/b0;->F(Lmp0/b0;Lmp0/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lmp0/x;->x:Lmp0/b0;

    check-cast p1, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;

    invoke-static {v0, p1}, Lmp0/b0;->L(Lmp0/b0;Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lmp0/x;->x:Lmp0/b0;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lmp0/b0;->U(Lmp0/b0;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lmp0/x;->x:Lmp0/b0;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lmp0/b0;->J(Lmp0/b0;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lmp0/x;->x:Lmp0/b0;

    invoke-static {v0, p1}, Lmp0/b0;->Q(Lmp0/b0;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_7
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lmp0/x;->x:Lmp0/b0;

    invoke-static {v0, p1}, Lmp0/b0;->Y(Lmp0/b0;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_8
    iget-object v0, p0, Lmp0/x;->x:Lmp0/b0;

    check-cast p1, Lcom/whoop/coaching/sleepcoach/wizard/a;

    invoke-static {v0, p1}, Lmp0/b0;->H(Lmp0/b0;Lcom/whoop/coaching/sleepcoach/wizard/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
