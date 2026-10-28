.class public final Lcom/iterable/iterableapi/t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/iterable/iterableapi/v0;


# direct methods
.method public synthetic constructor <init>(Lcom/iterable/iterableapi/v0;I)V
    .locals 0

    iput p2, p0, Lcom/iterable/iterableapi/t0;->w:I

    iput-object p1, p0, Lcom/iterable/iterableapi/t0;->x:Lcom/iterable/iterableapi/v0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, Lcom/iterable/iterableapi/t0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/iterable/iterableapi/t0;->x:Lcom/iterable/iterableapi/v0;

    iget-object v1, v0, Lcom/iterable/iterableapi/v0;->w:Lcom/iterable/iterableapi/h2;

    const-string v2, "IterableInAppFragmentHTMLNotification"

    if-nez v1, :cond_0

    const-string v0, "WebView is null, skipping resize"

    invoke-static {v2, v0}, Ldt/b;->a0(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/webkit/WebView;->getContentHeight()I

    move-result v1

    int-to-float v1, v1

    const/4 v3, 0x0

    cmpg-float v3, v1, v3

    if-gtz v3, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Invalid content height: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "dp, skipping resize"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Ldt/b;->a0(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget v3, v0, Lcom/iterable/iterableapi/v0;->I:F

    sub-float v3, v1, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    const/high16 v4, 0x3f800000    # 1.0f

    cmpg-float v3, v3, v4

    if-gez v3, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Content height unchanged ("

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "dp), skipping resize"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iput v1, v0, Lcom/iterable/iterableapi/v0;->I:F

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "\ud83d\udc9a Resizing in-app to height: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v4, "dp"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    move-result-object v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    new-instance v3, Lcom/iterable/iterableapi/u0;

    invoke-direct {v3, v0, v2, v1}, Lcom/iterable/iterableapi/u0;-><init>(Lcom/iterable/iterableapi/v0;Landroidx/fragment/app/r0;F)V

    invoke-virtual {v2, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/iterable/iterableapi/t0;->x:Lcom/iterable/iterableapi/v0;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Landroidx/fragment/app/y;->dismissAllowingStateLoss()V

    :cond_4
    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/iterable/iterableapi/t0;->x:Lcom/iterable/iterableapi/v0;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v0}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v0}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    if-eqz v1, :cond_8

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v0}, Lcom/iterable/iterableapi/v0;->B()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Lcom/iterable/iterableapi/v0;->z(Landroid/graphics/drawable/ColorDrawable;Landroid/graphics/drawable/ColorDrawable;)V

    iget-object v1, v0, Lcom/iterable/iterableapi/v0;->w:Lcom/iterable/iterableapi/h2;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v1, v3}, Landroid/view/View;->setAlpha(F)V

    iget-object v1, v0, Lcom/iterable/iterableapi/v0;->w:Lcom/iterable/iterableapi/h2;

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-boolean v1, v0, Lcom/iterable/iterableapi/v0;->K:Z

    if-eqz v1, :cond_8

    iget-object v1, v0, Lcom/iterable/iterableapi/v0;->J:Landroid/graphics/Rect;

    invoke-static {v1}, Lcom/iterable/iterableapi/v0;->C(Landroid/graphics/Rect;)I

    move-result v1

    invoke-static {v1}, Le4/p;->e(I)I

    move-result v1

    if-eqz v1, :cond_6

    const/4 v2, 0x1

    if-eq v1, v2, :cond_5

    const/4 v2, 0x2

    const v3, 0x7f010022

    if-eq v1, v2, :cond_7

    const/4 v2, 0x3

    goto :goto_1

    :cond_5
    const v3, 0x7f010053

    goto :goto_1

    :cond_6
    const v3, 0x7f010048

    :cond_7
    :goto_1
    :try_start_0
    invoke-virtual {v0}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    const-wide/16 v2, 0x1f4

    invoke-virtual {v1, v2, v3}, Landroid/view/animation/Animation;->setDuration(J)V

    iget-object v0, v0, Lcom/iterable/iterableapi/v0;->w:Lcom/iterable/iterableapi/h2;

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    const-string v0, "IterableInAppFragmentHTMLNotification"

    const-string v1, "Failed to show inapp with animation"

    invoke-static {v0, v1}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    :cond_8
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
