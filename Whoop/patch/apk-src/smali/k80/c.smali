.class public final synthetic Lk80/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/activation/view/ActivationFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/activation/view/ActivationFragment;I)V
    .locals 0

    iput p2, p0, Lk80/c;->w:I

    iput-object p1, p0, Lk80/c;->x:Lcom/whoop/activation/view/ActivationFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lk80/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lk80/c;->x:Lcom/whoop/activation/view/ActivationFragment;

    invoke-static {v0}, Lcom/whoop/activation/view/ActivationFragment;->A(Lcom/whoop/activation/view/ActivationFragment;)Lk80/j;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lk80/c;->x:Lcom/whoop/activation/view/ActivationFragment;

    invoke-static {v0}, Lcom/whoop/activation/view/ActivationFragment;->H(Lcom/whoop/activation/view/ActivationFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lk80/c;->x:Lcom/whoop/activation/view/ActivationFragment;

    invoke-static {v0}, Lcom/whoop/activation/view/ActivationFragment;->C(Lcom/whoop/activation/view/ActivationFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lk80/c;->x:Lcom/whoop/activation/view/ActivationFragment;

    invoke-static {v0}, Lcom/whoop/activation/view/ActivationFragment;->E(Lcom/whoop/activation/view/ActivationFragment;)Luf3/a;

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
