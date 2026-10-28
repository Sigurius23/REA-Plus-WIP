.class Lcom/whoop/whooplive/selfie/SelfieActivity$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpl/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/whooplive/selfie/SelfieActivity;->k2(Lcom/bumptech/glide/f;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lpl/c;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/whoop/whooplive/selfie/SelfieActivity;


# direct methods
.method public constructor <init>(Lcom/whoop/whooplive/selfie/SelfieActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$e;->a:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/bumptech/glide/load/engine/GlideException;Ljava/lang/Object;Lql/i;Z)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/engine/GlideException;",
            "Ljava/lang/Object;",
            "Lql/i;",
            "Z)Z"
        }
    .end annotation

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$e;->a:Lcom/whoop/whooplive/selfie/SelfieActivity;

    sget p2, Lpz2/g;->b:I

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$e;->a:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->o0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Llh3/b;

    move-result-object p1

    sget-object p2, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->SHOOTING:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    invoke-virtual {p1, p2}, Llh3/b;->onNext(Ljava/lang/Object;)V

    return p3
.end method

.method public bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;Lql/i;Lwk/a;Z)Z
    .locals 0

    check-cast p1, Landroid/graphics/drawable/Drawable;

    invoke-virtual/range {p0 .. p5}, Lcom/whoop/whooplive/selfie/SelfieActivity$e;->c(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Lql/i;Lwk/a;Z)Z

    move-result p1

    return p1
.end method

.method public c(Landroid/graphics/drawable/Drawable;Ljava/lang/Object;Lql/i;Lwk/a;Z)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/drawable/Drawable;",
            "Ljava/lang/Object;",
            "Lql/i;",
            "Lwk/a;",
            "Z)Z"
        }
    .end annotation

    instance-of p2, p1, Landroid/graphics/drawable/BitmapDrawable;

    const/4 p3, 0x0

    if-eqz p2, :cond_0

    move-object p2, p1

    check-cast p2, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p2}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p2

    iget-object p4, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$e;->a:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object p5

    invoke-virtual {p2, p5, p3}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object p2

    invoke-static {p4, p2}, Lcom/whoop/whooplive/selfie/SelfieActivity;->q0(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroid/graphics/Bitmap;)V

    iget-object p2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$e;->a:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {p2}, Lcom/whoop/whooplive/selfie/SelfieActivity;->n0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Landroid/graphics/Bitmap;

    move-result-object p4

    invoke-static {p2, p4}, Lcom/whoop/whooplive/selfie/SelfieActivity;->v0(Lcom/whoop/whooplive/selfie/SelfieActivity;Landroid/graphics/Bitmap;)V

    :cond_0
    iget-object p2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$e;->a:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {p2}, Lcom/whoop/whooplive/selfie/SelfieActivity;->p0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    move-result-object p2

    iget-object p2, p2, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    if-eqz p2, :cond_1

    iget-object p2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$e;->a:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {p2}, Lcom/whoop/whooplive/selfie/SelfieActivity;->p0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    move-result-object p2

    iget-object p2, p2, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->t:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-virtual {p2}, Lcom/whoop/whooplive/selfie/OverlayView;->getColorMode()Luz2/a;

    move-result-object p2

    iget-object p4, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$e;->a:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {p4, p2}, Lcom/whoop/whooplive/selfie/SelfieActivity;->w0(Lcom/whoop/whooplive/selfie/SelfieActivity;Luz2/a;)V

    :cond_1
    iget-object p2, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$e;->a:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {p2}, Lcom/whoop/whooplive/selfie/SelfieActivity;->p0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    move-result-object p4

    iget-object p4, p4, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    invoke-virtual {p4}, Landroid/view/View;->getWidth()I

    move-result p4

    iget-object p5, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$e;->a:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {p5}, Lcom/whoop/whooplive/selfie/SelfieActivity;->p0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Lcom/whoop/whooplive/selfie/SelfieActivity$j;

    move-result-object p5

    iget-object p5, p5, Lcom/whoop/whooplive/selfie/SelfieActivity$j;->a:Lcom/whoop/whooplive/selfie/camera/CameraView;

    invoke-virtual {p5}, Landroid/view/View;->getHeight()I

    move-result p5

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p1

    invoke-static {p2, p4, p5, v0, p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->s0(Lcom/whoop/whooplive/selfie/SelfieActivity;IIII)V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$e;->a:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->l0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Llh3/b;

    move-result-object p2

    invoke-virtual {p2}, Llh3/b;->Z()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-static {p1, p2}, Lcom/whoop/whooplive/selfie/SelfieActivity;->r0(Lcom/whoop/whooplive/selfie/SelfieActivity;Z)V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/SelfieActivity$e;->a:Lcom/whoop/whooplive/selfie/SelfieActivity;

    invoke-static {p1}, Lcom/whoop/whooplive/selfie/SelfieActivity;->o0(Lcom/whoop/whooplive/selfie/SelfieActivity;)Llh3/b;

    move-result-object p1

    sget-object p2, Lcom/whoop/whooplive/selfie/SelfieActivity$i;->EDITING:Lcom/whoop/whooplive/selfie/SelfieActivity$i;

    invoke-virtual {p1, p2}, Llh3/b;->onNext(Ljava/lang/Object;)V

    return p3
.end method
