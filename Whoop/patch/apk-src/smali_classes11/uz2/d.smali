.class public final synthetic Luz2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/whooplive/selfie/SelfieActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/whooplive/selfie/SelfieActivity;I)V
    .locals 0

    iput p2, p0, Luz2/d;->w:I

    iput-object p1, p0, Luz2/d;->x:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, Luz2/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Luz2/d;->x:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {v0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->G(Lcom/whoop/whooplive/selfie/SelfieActivity;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Luz2/d;->x:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {v0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->K(Lcom/whoop/whooplive/selfie/SelfieActivity;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Luz2/d;->x:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {v0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->V(Lcom/whoop/whooplive/selfie/SelfieActivity;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Luz2/d;->x:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {v0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->e0(Lcom/whoop/whooplive/selfie/SelfieActivity;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Luz2/d;->x:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {v0}, Lcom/whoop/whooplive/selfie/SelfieActivity;->i0(Lcom/whoop/whooplive/selfie/SelfieActivity;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
