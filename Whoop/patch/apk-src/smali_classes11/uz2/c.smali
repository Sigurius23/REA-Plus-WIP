.class public final synthetic Luz2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/b;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/whooplive/selfie/OverlayView;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/whooplive/selfie/OverlayView;I)V
    .locals 0

    iput p2, p0, Luz2/c;->w:I

    iput-object p1, p0, Luz2/c;->x:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Luz2/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Luz2/c;->x:Lcom/whoop/whooplive/selfie/OverlayView;

    check-cast p1, Ljava/lang/Float;

    invoke-static {v0, p1}, Lcom/whoop/whooplive/selfie/OverlayView;->c(Lcom/whoop/whooplive/selfie/OverlayView;Ljava/lang/Float;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Luz2/c;->x:Lcom/whoop/whooplive/selfie/OverlayView;

    check-cast p1, Landroid/util/Pair;

    invoke-static {v0, p1}, Lcom/whoop/whooplive/selfie/OverlayView;->d(Lcom/whoop/whooplive/selfie/OverlayView;Landroid/util/Pair;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Luz2/c;->x:Lcom/whoop/whooplive/selfie/OverlayView;

    check-cast p1, Lrz2/a;

    invoke-static {v0, p1}, Lcom/whoop/whooplive/selfie/OverlayView;->b(Lcom/whoop/whooplive/selfie/OverlayView;Lrz2/a;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Luz2/c;->x:Lcom/whoop/whooplive/selfie/OverlayView;

    check-cast p1, Luz2/a;

    invoke-static {v0, p1}, Lcom/whoop/whooplive/selfie/OverlayView;->a(Lcom/whoop/whooplive/selfie/OverlayView;Luz2/a;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
