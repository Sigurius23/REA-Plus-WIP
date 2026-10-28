.class public final Lcom/iterable/iterableapi/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:Landroidx/fragment/app/r0;

.field public final synthetic x:F

.field public final synthetic y:Lcom/iterable/iterableapi/v0;


# direct methods
.method public constructor <init>(Lcom/iterable/iterableapi/v0;Landroidx/fragment/app/r0;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/iterable/iterableapi/u0;->y:Lcom/iterable/iterableapi/v0;

    iput-object p2, p0, Lcom/iterable/iterableapi/u0;->w:Landroidx/fragment/app/r0;

    iput p3, p0, Lcom/iterable/iterableapi/u0;->x:F

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    const-string v0, "x"

    const-string v1, "IterableInAppFragmentHTMLNotification"

    iget-object v2, p0, Lcom/iterable/iterableapi/u0;->y:Lcom/iterable/iterableapi/v0;

    const-string v3, "Applied explicit size and positioning to WebView: "

    const-string v4, "Resizing WebView directly - gravity: "

    :try_start_0
    invoke-virtual {v2}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object v5

    if-eqz v5, :cond_6

    sget-object v5, Lcom/iterable/iterableapi/v0;->N:Lcom/iterable/iterableapi/v0;

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    move-result-object v5

    if-eqz v5, :cond_6

    sget-object v5, Lcom/iterable/iterableapi/v0;->N:Lcom/iterable/iterableapi/v0;

    invoke-virtual {v5}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    move-result-object v5

    invoke-virtual {v5}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v5

    if-eqz v5, :cond_6

    sget-object v5, Lcom/iterable/iterableapi/v0;->N:Lcom/iterable/iterableapi/v0;

    invoke-virtual {v5}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    move-result-object v5

    invoke-virtual {v5}, Landroid/app/Dialog;->isShowing()Z

    move-result v5

    if-nez v5, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v5, p0, Lcom/iterable/iterableapi/u0;->w:Landroidx/fragment/app/r0;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    sget-object v5, Lcom/iterable/iterableapi/v0;->N:Lcom/iterable/iterableapi/v0;

    invoke-virtual {v5}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    move-result-object v5

    invoke-virtual {v5}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v5

    sget-object v6, Lcom/iterable/iterableapi/v0;->N:Lcom/iterable/iterableapi/v0;

    iget-object v6, v6, Lcom/iterable/iterableapi/v0;->J:Landroid/graphics/Rect;

    invoke-virtual {v2}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object v7

    const-string v8, "window"

    invoke-virtual {v7, v8}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/view/WindowManager;

    invoke-interface {v7}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v7

    new-instance v8, Landroid/graphics/Point;

    invoke-direct {v8}, Landroid/graphics/Point;-><init>()V

    invoke-virtual {v7, v8}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    iget v7, v8, Landroid/graphics/Point;->x:I

    iget v8, v8, Landroid/graphics/Point;->y:I

    iget v9, v6, Landroid/graphics/Rect;->bottom:I

    if-nez v9, :cond_1

    iget v9, v6, Landroid/graphics/Rect;->top:I

    if-nez v9, :cond_1

    invoke-virtual {v5, v7, v8}, Landroid/view/Window;->setLayout(II)V

    invoke-virtual {v2}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v2, 0x400

    invoke-virtual {v0, v2, v2}, Landroid/view/Window;->setFlags(II)V

    return-void

    :catch_0
    move-exception v0

    goto/16 :goto_2

    :cond_1
    iget v7, p0, Lcom/iterable/iterableapi/u0;->x:F

    invoke-virtual {v2}, Landroidx/fragment/app/m0;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    iget v8, v8, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v7, v8

    invoke-virtual {v2}, Landroidx/fragment/app/m0;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v8

    iget v8, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    float-to-int v7, v7

    new-instance v9, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v9, v8, v7}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-static {v6}, Lcom/iterable/iterableapi/v0;->D(Landroid/graphics/Rect;)I

    move-result v10

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " size: "

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "px for inset padding: "

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v4, 0x10

    if-ne v10, v4, :cond_2

    const/16 v4, 0xd

    invoke-virtual {v9, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const-string v4, "Applied CENTER_IN_PARENT to WebView"

    invoke-static {v1, v4}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const/16 v4, 0x30

    const/16 v6, 0xe

    if-ne v10, v4, :cond_3

    const/16 v4, 0xa

    invoke-virtual {v9, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    invoke-virtual {v9, v6}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const-string v4, "Applied TOP alignment to WebView"

    invoke-static {v1, v4}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_3
    const/16 v4, 0x50

    if-ne v10, v4, :cond_4

    const/16 v4, 0xc

    invoke-virtual {v9, v4}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    invoke-virtual {v9, v6}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    const-string v4, "Applied BOTTOM alignment to WebView"

    invoke-static {v1, v4}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_0
    const/4 v4, -0x1

    invoke-virtual {v5, v4, v4}, Landroid/view/Window;->setLayout(II)V

    iget-object v4, v2, Lcom/iterable/iterableapi/v0;->w:Lcom/iterable/iterableapi/h2;

    invoke-virtual {v4, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v4, v2, Lcom/iterable/iterableapi/v0;->w:Lcom/iterable/iterableapi/h2;

    invoke-virtual {v4}, Landroid/view/View;->requestLayout()V

    iget-object v4, v2, Lcom/iterable/iterableapi/v0;->w:Lcom/iterable/iterableapi/h2;

    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    instance-of v4, v4, Landroid/view/ViewGroup;

    if-eqz v4, :cond_5

    iget-object v2, v2, Lcom/iterable/iterableapi/v0;->w:Lcom/iterable/iterableapi/h2;

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/View;->requestLayout()V

    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_6
    :goto_1
    return-void

    :goto_2
    const-string v2, "Exception while trying to resize an in-app message"

    invoke-static {v1, v2, v0}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method
