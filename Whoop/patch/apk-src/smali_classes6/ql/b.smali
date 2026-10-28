.class public final Lql/b;
.super Lql/k;
.source "SourceFile"


# instance fields
.field public final synthetic E:I

.field public z:Landroid/graphics/drawable/Animatable;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/ImageView;I)V
    .locals 0

    iput p2, p0, Lql/b;->E:I

    invoke-direct {p0, p1}, Lql/k;-><init>(Landroid/widget/ImageView;)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Lrl/c;)V
    .locals 1

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    invoke-interface {p2, p1, p0}, Lrl/c;->e(Ljava/lang/Object;Lql/b;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    instance-of p2, p1, Landroid/graphics/drawable/Animatable;

    if-eqz p2, :cond_1

    check-cast p1, Landroid/graphics/drawable/Animatable;

    iput-object p1, p0, Lql/b;->z:Landroid/graphics/drawable/Animatable;

    invoke-interface {p1}, Landroid/graphics/drawable/Animatable;->start()V

    return-void

    :cond_1
    iput-object v0, p0, Lql/b;->z:Landroid/graphics/drawable/Animatable;

    return-void

    :cond_2
    :goto_0
    invoke-virtual {p0, p1}, Lql/b;->i(Ljava/lang/Object;)V

    instance-of p2, p1, Landroid/graphics/drawable/Animatable;

    if-eqz p2, :cond_3

    check-cast p1, Landroid/graphics/drawable/Animatable;

    iput-object p1, p0, Lql/b;->z:Landroid/graphics/drawable/Animatable;

    invoke-interface {p1}, Landroid/graphics/drawable/Animatable;->start()V

    return-void

    :cond_3
    iput-object v0, p0, Lql/b;->z:Landroid/graphics/drawable/Animatable;

    return-void
.end method

.method public final c(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    invoke-super {p0, p1}, Lql/a;->c(Landroid/graphics/drawable/Drawable;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lql/b;->i(Ljava/lang/Object;)V

    iput-object v0, p0, Lql/b;->z:Landroid/graphics/drawable/Animatable;

    iget-object v0, p0, Lql/k;->x:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final e(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    invoke-super {p0, p1}, Lql/k;->e(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lql/b;->z:Landroid/graphics/drawable/Animatable;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->stop()V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lql/b;->i(Ljava/lang/Object;)V

    iput-object v0, p0, Lql/b;->z:Landroid/graphics/drawable/Animatable;

    iget-object v0, p0, Lql/k;->x:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final g(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    invoke-super {p0, p1}, Lql/a;->g(Landroid/graphics/drawable/Drawable;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lql/b;->i(Ljava/lang/Object;)V

    iput-object v0, p0, Lql/b;->z:Landroid/graphics/drawable/Animatable;

    iget-object v0, p0, Lql/k;->x:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final i(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lql/b;->E:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Lql/k;->x:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    :pswitch_0
    check-cast p1, Landroid/graphics/Bitmap;

    iget-object v0, p0, Lql/k;->x:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onStart()V
    .locals 1

    iget-object v0, p0, Lql/b;->z:Landroid/graphics/drawable/Animatable;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->start()V

    :cond_0
    return-void
.end method

.method public final onStop()V
    .locals 1

    iget-object v0, p0, Lql/b;->z:Landroid/graphics/drawable/Animatable;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->stop()V

    :cond_0
    return-void
.end method
