.class Lcom/whoop/whooplive/selfie/camera/CameraView$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh3/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplive/selfie/camera/CameraView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lbh3/b;"
    }
.end annotation


# instance fields
.field final synthetic w:Lcom/whoop/whooplive/selfie/camera/CameraView;


# direct methods
.method public constructor <init>(Lcom/whoop/whooplive/selfie/camera/CameraView;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/camera/CameraView$a;->w:Lcom/whoop/whooplive/selfie/camera/CameraView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView$a;->w:Lcom/whoop/whooplive/selfie/camera/CameraView;

    invoke-static {v0}, Lcom/whoop/whooplive/selfie/camera/CameraView;->c(Lcom/whoop/whooplive/selfie/camera/CameraView;)Lcom/whoop/whooplive/selfie/camera/TextureViewPreview;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/camera/CameraView$a;->w:Lcom/whoop/whooplive/selfie/camera/CameraView;

    invoke-static {v0}, Lcom/whoop/whooplive/selfie/camera/CameraView;->b(Lcom/whoop/whooplive/selfie/camera/CameraView;)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    instance-of p1, p1, Landroid/hardware/camera2/CameraAccessException;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/camera/CameraView$a;->w:Lcom/whoop/whooplive/selfie/camera/CameraView;

    invoke-static {p1}, Lcom/whoop/whooplive/selfie/camera/CameraView;->b(Lcom/whoop/whooplive/selfie/camera/CameraView;)Landroid/widget/TextView;

    move-result-object p1

    sget v0, Lpz2/g;->m:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/whoop/whooplive/selfie/camera/CameraView$a;->w:Lcom/whoop/whooplive/selfie/camera/CameraView;

    invoke-static {p1}, Lcom/whoop/whooplive/selfie/camera/CameraView;->b(Lcom/whoop/whooplive/selfie/camera/CameraView;)Landroid/widget/TextView;

    move-result-object p1

    sget v0, Lpz2/g;->j:I

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/whoop/whooplive/selfie/camera/CameraView$a;->a(Ljava/lang/Throwable;)V

    return-void
.end method
