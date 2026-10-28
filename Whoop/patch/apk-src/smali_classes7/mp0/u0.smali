.class public final synthetic Lmp0/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lmp0/w0;


# direct methods
.method public synthetic constructor <init>(Lmp0/w0;I)V
    .locals 0

    iput p2, p0, Lmp0/u0;->w:I

    iput-object p1, p0, Lmp0/u0;->x:Lmp0/w0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lmp0/u0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmp0/u0;->x:Lmp0/w0;

    check-cast p1, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;

    invoke-static {v0, p1}, Lmp0/w0;->M(Lmp0/w0;Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lmp0/u0;->x:Lmp0/w0;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lmp0/w0;->K(Lmp0/w0;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lmp0/u0;->x:Lmp0/w0;

    check-cast p1, Lnp0/m;

    invoke-static {v0, p1}, Lmp0/w0;->J(Lmp0/w0;Lnp0/m;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
