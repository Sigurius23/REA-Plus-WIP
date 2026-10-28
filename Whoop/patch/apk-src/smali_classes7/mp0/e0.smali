.class public final synthetic Lmp0/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/coaching/sleepcoach/wizard/e;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/coaching/sleepcoach/wizard/e;I)V
    .locals 0

    iput p2, p0, Lmp0/e0;->w:I

    iput-object p1, p0, Lmp0/e0;->x:Lcom/whoop/coaching/sleepcoach/wizard/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lmp0/e0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lmp0/e0;->x:Lcom/whoop/coaching/sleepcoach/wizard/e;

    check-cast p1, Lmp0/c;

    invoke-static {v0, p1}, Lcom/whoop/coaching/sleepcoach/wizard/e;->H(Lcom/whoop/coaching/sleepcoach/wizard/e;Lmp0/c;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lmp0/e0;->x:Lcom/whoop/coaching/sleepcoach/wizard/e;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/coaching/sleepcoach/wizard/e;->G(Lcom/whoop/coaching/sleepcoach/wizard/e;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lmp0/e0;->x:Lcom/whoop/coaching/sleepcoach/wizard/e;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/coaching/sleepcoach/wizard/e;->I(Lcom/whoop/coaching/sleepcoach/wizard/e;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lmp0/e0;->x:Lcom/whoop/coaching/sleepcoach/wizard/e;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/coaching/sleepcoach/wizard/e;->F(Lcom/whoop/coaching/sleepcoach/wizard/e;Landroid/view/View;)Ll83/a0;

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
