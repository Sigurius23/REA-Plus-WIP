.class public final Ls53/b;
.super Landroid/view/ViewOutlineProvider;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;I)V
    .locals 0

    iput p2, p0, Ls53/b;->a:I

    iput-object p1, p0, Ls53/b;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public final getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .locals 2

    iget v0, p0, Ls53/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ls53/b;->b:Landroid/view/View;

    check-cast v0, Lde/hdodenhof/circleimageview/CircleImageView;

    iget-boolean v1, v0, Lde/hdodenhof/circleimageview/CircleImageView;->T:Z

    if-eqz v1, :cond_0

    sget-object v0, Landroid/view/ViewOutlineProvider;->BACKGROUND:Landroid/view/ViewOutlineProvider;

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewOutlineProvider;->getOutline(Landroid/view/View;Landroid/graphics/Outline;)V

    goto :goto_0

    :cond_0
    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iget-object v0, v0, Lde/hdodenhof/circleimageview/CircleImageView;->x:Landroid/graphics/RectF;

    invoke-virtual {v0, p1}, Landroid/graphics/RectF;->roundOut(Landroid/graphics/Rect;)V

    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    invoke-virtual {p2, p1, v0}, Landroid/graphics/Outline;->setRoundRect(Landroid/graphics/Rect;F)V

    :goto_0
    return-void

    :pswitch_0
    iget-object p1, p0, Ls53/b;->b:Landroid/view/View;

    check-cast p1, Lcom/google/android/material/chip/Chip;

    iget-object p1, p1, Lcom/google/android/material/chip/Chip;->E:Luq/d;

    if-eqz p1, :cond_1

    invoke-virtual {p1, p2}, Luq/d;->getOutline(Landroid/graphics/Outline;)V

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Landroid/graphics/Outline;->setAlpha(F)V

    :goto_1
    return-void

    :pswitch_1
    iget-object p1, p0, Ls53/b;->b:Landroid/view/View;

    check-cast p1, Ls53/c;

    iget-object v0, p1, Ls53/c;->z:Lq30/w0;

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object p1, p1, Ls53/c;->z:Lq30/w0;

    iget-object p1, p1, Lq30/w0;->x:Ljava/lang/Object;

    check-cast p1, Landroid/graphics/Path;

    if-eqz p1, :cond_2

    :try_start_0
    invoke-virtual {p2, p1}, Landroid/graphics/Outline;->setConvexPath(Landroid/graphics/Path;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
