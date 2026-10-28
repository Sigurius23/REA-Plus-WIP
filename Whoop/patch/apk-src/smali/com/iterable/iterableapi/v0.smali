.class public Lcom/iterable/iterableapi/v0;
.super Landroidx/fragment/app/y;
.source "SourceFile"


# static fields
.field public static N:Lcom/iterable/iterableapi/v0;

.field public static O:Lqg3/d;

.field public static P:Lcom/iterable/iterableapi/y0;


# instance fields
.field public E:Ljava/lang/String;

.field public F:Ljava/lang/String;

.field public G:Landroid/os/Handler;

.field public H:Lcom/iterable/iterableapi/t0;

.field public I:F

.field public J:Landroid/graphics/Rect;

.field public K:Z

.field public L:D

.field public M:Ljava/lang/String;

.field public w:Lcom/iterable/iterableapi/h2;

.field public x:Z

.field public y:Lcom/iterable/iterableapi/s0;

.field public z:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/fragment/app/y;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/iterable/iterableapi/v0;->z:Z

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, p0, Lcom/iterable/iterableapi/v0;->I:F

    iput-boolean v0, p0, Lcom/iterable/iterableapi/v0;->x:Z

    const-string v0, ""

    iput-object v0, p0, Lcom/iterable/iterableapi/v0;->F:Ljava/lang/String;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/iterable/iterableapi/v0;->J:Landroid/graphics/Rect;

    const/4 v0, 0x2

    const v1, 0x7f150393

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/y;->setStyle(II)V

    return-void
.end method

.method public static C(Landroid/graphics/Rect;)I
    .locals 2

    iget v0, p0, Landroid/graphics/Rect;->top:I

    if-nez v0, :cond_0

    iget v1, p0, Landroid/graphics/Rect;->bottom:I

    if-nez v1, :cond_0

    const/4 p0, 0x4

    return p0

    :cond_0
    if-nez v0, :cond_1

    iget v1, p0, Landroid/graphics/Rect;->bottom:I

    if-gez v1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    if-gez v0, :cond_2

    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    if-nez p0, :cond_2

    const/4 p0, 0x2

    return p0

    :cond_2
    const/4 p0, 0x3

    return p0
.end method

.method public static D(Landroid/graphics/Rect;)I
    .locals 2

    iget v0, p0, Landroid/graphics/Rect;->top:I

    if-nez v0, :cond_0

    iget v1, p0, Landroid/graphics/Rect;->bottom:I

    if-gez v1, :cond_0

    const/16 p0, 0x30

    return p0

    :cond_0
    if-gez v0, :cond_1

    iget p0, p0, Landroid/graphics/Rect;->bottom:I

    if-nez p0, :cond_1

    const/16 p0, 0x50

    return p0

    :cond_1
    const/16 p0, 0x10

    return p0
.end method


# virtual methods
.method public final A(Landroid/view/Window;Ljava/lang/String;)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iget-object v1, p0, Lcom/iterable/iterableapi/v0;->J:Landroid/graphics/Rect;

    invoke-static {v1}, Lcom/iterable/iterableapi/v0;->D(Landroid/graphics/Rect;)I

    move-result v1

    const/16 v2, 0x10

    if-ne v1, v2, :cond_1

    const/16 v1, 0x11

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    goto :goto_0

    :cond_1
    const/16 v2, 0x30

    if-ne v1, v2, :cond_2

    const/16 v1, 0x31

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    goto :goto_0

    :cond_2
    const/16 v2, 0x50

    if-ne v1, v2, :cond_3

    const/16 v1, 0x51

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    :cond_3
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Set window gravity in "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ": "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p2, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "IterableInAppFragmentHTMLNotification"

    invoke-static {p2, p1}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final B()Landroid/graphics/drawable/ColorDrawable;
    .locals 7

    iget-object v0, p0, Lcom/iterable/iterableapi/v0;->M:Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "IterableInAppFragmentHTMLNotification"

    if-nez v0, :cond_0

    const-string v0, "Background Color does not exist. In App background animation will not be performed"

    invoke-static {v2, v0}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_0
    :try_start_0
    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    iget-wide v3, p0, Lcom/iterable/iterableapi/v0;->L:D

    const-wide v5, 0x406fe00000000000L    # 255.0

    mul-double/2addr v3, v5

    double-to-int v3, v3

    invoke-static {v0, v3}, Lv4/a;->g(II)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v1, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    return-object v1

    :catch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "Background color could not be identified for input string \""

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/iterable/iterableapi/v0;->M:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "\". Failed to load in-app background."

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public final E()V
    .locals 4

    iget-boolean v0, p0, Lcom/iterable/iterableapi/v0;->K:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/iterable/iterableapi/v0;->J:Landroid/graphics/Rect;

    invoke-static {v0}, Lcom/iterable/iterableapi/v0;->C(Landroid/graphics/Rect;)I

    move-result v0

    invoke-static {v0}, Le4/p;->e(I)I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x2

    const v2, 0x7f010023

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    goto :goto_0

    :cond_0
    const v2, 0x7f010011

    goto :goto_0

    :cond_1
    const v2, 0x7f01005f

    :cond_2
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    iget-object v1, p0, Lcom/iterable/iterableapi/v0;->w:Lcom/iterable/iterableapi/h2;

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string v0, "IterableInAppFragmentHTMLNotification"

    const-string v1, "Failed to hide inapp with animation"

    invoke-static {v0, v1}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_1
    invoke-virtual {p0}, Lcom/iterable/iterableapi/v0;->B()Landroid/graphics/drawable/ColorDrawable;

    move-result-object v0

    new-instance v1, Landroid/graphics/drawable/ColorDrawable;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p0, v0, v1}, Lcom/iterable/iterableapi/v0;->z(Landroid/graphics/drawable/ColorDrawable;Landroid/graphics/drawable/ColorDrawable;)V

    new-instance v0, Lcom/iterable/iterableapi/t0;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lcom/iterable/iterableapi/t0;-><init>(Lcom/iterable/iterableapi/v0;I)V

    iget-object v1, p0, Lcom/iterable/iterableapi/v0;->w:Lcom/iterable/iterableapi/h2;

    const-wide/16 v2, 0x190

    invoke-virtual {v1, v0, v2, v3}, Landroid/view/View;->postOnAnimationDelayed(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public final F()V
    .locals 3

    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    invoke-virtual {v0}, Lcom/iterable/iterableapi/k;->e()Lcom/iterable/iterableapi/d1;

    move-result-object v0

    iget-object v1, p0, Lcom/iterable/iterableapi/v0;->F:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/iterable/iterableapi/d1;->d(Ljava/lang/String;)Lcom/iterable/iterableapi/j1;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "IterableInAppFragmentHTMLNotification"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Message with id "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/iterable/iterableapi/v0;->F:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " does not exist"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-virtual {v0}, Lcom/iterable/iterableapi/j1;->n()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/iterable/iterableapi/j1;->k()Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    invoke-virtual {v1}, Lcom/iterable/iterableapi/k;->e()Lcom/iterable/iterableapi/d1;

    move-result-object v1

    monitor-enter v1

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {v1, v0, v2, v2}, Lcom/iterable/iterableapi/d1;->g(Lcom/iterable/iterableapi/j1;Lcom/iterable/iterableapi/m0;Lcom/iterable/iterableapi/y0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_1
    return-void
.end method

.method public final G()V
    .locals 4

    iget-object v0, p0, Lcom/iterable/iterableapi/v0;->G:Landroid/os/Handler;

    if-nez v0, :cond_0

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/iterable/iterableapi/v0;->G:Landroid/os/Handler;

    :cond_0
    iget-object v0, p0, Lcom/iterable/iterableapi/v0;->H:Lcom/iterable/iterableapi/t0;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/iterable/iterableapi/v0;->G:Landroid/os/Handler;

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_1
    new-instance v0, Lcom/iterable/iterableapi/t0;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lcom/iterable/iterableapi/t0;-><init>(Lcom/iterable/iterableapi/v0;I)V

    iput-object v0, p0, Lcom/iterable/iterableapi/v0;->H:Lcom/iterable/iterableapi/t0;

    iget-object v1, p0, Lcom/iterable/iterableapi/v0;->G:Landroid/os/Handler;

    const-wide/16 v2, 0xc8

    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Landroidx/fragment/app/y;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    const-string v0, "HTML"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/iterable/iterableapi/v0;->E:Ljava/lang/String;

    const-string v0, "CallbackOnCancel"

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/iterable/iterableapi/v0;->z:Z

    const-string v0, "MessageId"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/iterable/iterableapi/v0;->F:Ljava/lang/String;

    const-string v0, "BackgroundAlpha"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;)D

    const-string v0, "InsetPadding"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/graphics/Rect;

    iput-object v0, p0, Lcom/iterable/iterableapi/v0;->J:Landroid/graphics/Rect;

    const-string v0, "InAppBgAlpha"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    iput-wide v2, p0, Lcom/iterable/iterableapi/v0;->L:D

    const-string v0, "InAppBgColor"

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/iterable/iterableapi/v0;->M:Ljava/lang/String;

    const-string v0, "ShouldAnimate"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Lcom/iterable/iterableapi/v0;->K:Z

    :cond_0
    sput-object p0, Lcom/iterable/iterableapi/v0;->N:Lcom/iterable/iterableapi/v0;

    return-void
.end method

.method public final onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 4

    new-instance p1, Lcom/iterable/iterableapi/q0;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/y;->getTheme()I

    move-result v1

    invoke-direct {p1, p0, v0, v1}, Lcom/iterable/iterableapi/q0;-><init>(Lcom/iterable/iterableapi/v0;Landroidx/fragment/app/r0;I)V

    new-instance v0, Lcom/iterable/iterableapi/r0;

    invoke-direct {v0, p0}, Lcom/iterable/iterableapi/r0;-><init>(Lcom/iterable/iterableapi/v0;)V

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    iget-object v1, p0, Lcom/iterable/iterableapi/v0;->J:Landroid/graphics/Rect;

    invoke-static {v1}, Lcom/iterable/iterableapi/v0;->C(Landroid/graphics/Rect;)I

    move-result v1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_0

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    const-string v3, "onCreateDialog"

    invoke-virtual {p0, v1, v3}, Lcom/iterable/iterableapi/v0;->A(Landroid/view/Window;Ljava/lang/String;)V

    :cond_0
    iget-object v1, p0, Lcom/iterable/iterableapi/v0;->J:Landroid/graphics/Rect;

    invoke-static {v1}, Lcom/iterable/iterableapi/v0;->C(Landroid/graphics/Rect;)I

    move-result v1

    if-ne v1, v2, :cond_1

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x400

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    return-object p1

    :cond_1
    iget-object v1, p0, Lcom/iterable/iterableapi/v0;->J:Landroid/graphics/Rect;

    invoke-static {v1}, Lcom/iterable/iterableapi/v0;->C(Landroid/graphics/Rect;)I

    move-result v1

    if-eq v1, v0, :cond_2

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1, v1}, Landroid/view/Window;->setFlags(II)V

    :cond_2
    return-object p1
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    const-string p1, "IterableInAppFragmentHTMLNotification"

    invoke-virtual {p0}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p2

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p2, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p2, p0, Lcom/iterable/iterableapi/v0;->J:Landroid/graphics/Rect;

    invoke-static {p2}, Lcom/iterable/iterableapi/v0;->C(Landroid/graphics/Rect;)I

    move-result p2

    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p2

    const/16 v2, 0x400

    invoke-virtual {p2, v2, v2}, Landroid/view/Window;->setFlags(II)V

    :cond_0
    iget-object p2, p0, Lcom/iterable/iterableapi/v0;->J:Landroid/graphics/Rect;

    invoke-static {p2}, Lcom/iterable/iterableapi/v0;->C(Landroid/graphics/Rect;)I

    move-result p2

    if-eq p2, v0, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    move-result-object p2

    invoke-virtual {p2}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p2

    const-string v2, "onCreateView"

    invoke-virtual {p0, p2, v2}, Lcom/iterable/iterableapi/v0;->A(Landroid/view/Window;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object p2

    const/4 v2, 0x0

    :try_start_0
    new-instance v3, Lcom/iterable/iterableapi/h2;

    invoke-direct {v3, p2}, Lcom/iterable/iterableapi/h2;-><init>(Landroid/content/Context;)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p2

    goto :goto_0

    :catch_1
    move-exception p2

    goto :goto_2

    :goto_0
    const-string v3, "Failed to create WebView - unexpected error"

    invoke-static {p1, v3, p2}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    :goto_1
    move-object v3, v2

    goto :goto_3

    :goto_2
    const-string v3, "Failed to create WebView - system WebView resource issue"

    invoke-static {p1, v3, p2}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_1

    :goto_3
    iput-object v3, p0, Lcom/iterable/iterableapi/v0;->w:Lcom/iterable/iterableapi/h2;

    if-nez v3, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismissAllowingStateLoss()V

    return-object v2

    :cond_2
    const p2, 0x7f0a0d84

    invoke-virtual {v3, p2}, Landroid/view/View;->setId(I)V

    iget-object p2, p0, Lcom/iterable/iterableapi/v0;->w:Lcom/iterable/iterableapi/h2;

    iget-object v2, p0, Lcom/iterable/iterableapi/v0;->E:Ljava/lang/String;

    invoke-virtual {p2, p0, v2}, Lcom/iterable/iterableapi/h2;->a(Lcom/iterable/iterableapi/v0;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/iterable/iterableapi/v0;->y:Lcom/iterable/iterableapi/s0;

    if-nez p2, :cond_3

    new-instance p2, Lcom/iterable/iterableapi/s0;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {p2, p0, v2}, Lcom/iterable/iterableapi/s0;-><init>(Lcom/iterable/iterableapi/v0;Landroid/content/Context;)V

    iput-object p2, p0, Lcom/iterable/iterableapi/v0;->y:Lcom/iterable/iterableapi/s0;

    :cond_3
    iget-object p2, p0, Lcom/iterable/iterableapi/v0;->y:Lcom/iterable/iterableapi/s0;

    invoke-virtual {p2}, Landroid/view/OrientationEventListener;->enable()V

    new-instance p2, Landroid/widget/FrameLayout;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {p2, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iget-object v2, p0, Lcom/iterable/iterableapi/v0;->J:Landroid/graphics/Rect;

    invoke-static {v2}, Lcom/iterable/iterableapi/v0;->C(Landroid/graphics/Rect;)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v0, :cond_4

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    iget-object v2, p0, Lcom/iterable/iterableapi/v0;->w:Lcom/iterable/iterableapi/h2;

    invoke-virtual {p2, v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_5

    :cond_4
    new-instance v0, Landroid/widget/RelativeLayout;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    iget-object v2, p0, Lcom/iterable/iterableapi/v0;->J:Landroid/graphics/Rect;

    invoke-static {v2}, Lcom/iterable/iterableapi/v0;->D(Landroid/graphics/Rect;)I

    move-result v2

    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v5, -0x2

    invoke-direct {v4, v3, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v3, 0x10

    if-ne v2, v3, :cond_5

    const/16 v2, 0x11

    iput v2, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    goto :goto_4

    :cond_5
    const/16 v3, 0x30

    if-ne v2, v3, :cond_6

    const/16 v2, 0x31

    iput v2, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    goto :goto_4

    :cond_6
    const/16 v3, 0x50

    if-ne v2, v3, :cond_7

    const/16 v2, 0x51

    iput v2, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    :cond_7
    :goto_4
    new-instance v2, Landroid/widget/RelativeLayout$LayoutParams;

    invoke-direct {v2, v5, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    const/16 v3, 0xd

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout$LayoutParams;->addRule(I)V

    iget-object v3, p0, Lcom/iterable/iterableapi/v0;->w:Lcom/iterable/iterableapi/h2;

    invoke-virtual {v0, v3, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {p2, v0, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :goto_5
    if-eqz p3, :cond_8

    const-string v0, "InAppOpenTracked"

    invoke-virtual {p3, v0, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result p3

    if-nez p3, :cond_b

    :cond_8
    sget-object p3, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v0, p0, Lcom/iterable/iterableapi/v0;->F:Ljava/lang/String;

    sget-object v1, Lcom/iterable/iterableapi/v0;->P:Lcom/iterable/iterableapi/y0;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ldt/b;->F()V

    invoke-virtual {p3}, Lcom/iterable/iterableapi/k;->e()Lcom/iterable/iterableapi/d1;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/iterable/iterableapi/d1;->d(Ljava/lang/String;)Lcom/iterable/iterableapi/j1;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {p3}, Lcom/iterable/iterableapi/k;->a()Z

    move-result v0

    if-nez v0, :cond_9

    goto :goto_6

    :cond_9
    iget-object p3, p3, Lcom/iterable/iterableapi/k;->j:Lcom/google/crypto/tink/internal/l0;

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_1
    invoke-virtual {p3, v0}, Lcom/google/crypto/tink/internal/l0;->B(Lorg/json/JSONObject;)V

    const-string v3, "messageId"

    invoke-virtual {v2}, Lcom/iterable/iterableapi/j1;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "messageContext"

    invoke-static {v2, v1}, Lcom/google/crypto/tink/internal/l0;->Q(Lcom/iterable/iterableapi/j1;Lcom/iterable/iterableapi/a1;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "deviceInfo"

    invoke-virtual {p3}, Lcom/google/crypto/tink/internal/l0;->O()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "events/trackInAppOpen"

    invoke-virtual {p3, v1, v0}, Lcom/google/crypto/tink/internal/l0;->f0(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_6

    :catch_2
    move-exception p3

    invoke-virtual {p3}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_6

    :cond_a
    new-instance p3, Ljava/lang/StringBuilder;

    const-string v1, "trackInAppOpen: could not find an in-app message with ID: "

    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const-string v0, "IterableApi"

    invoke-static {v0, p3}, Ldt/b;->a0(Ljava/lang/String;Ljava/lang/String;)V

    :cond_b
    :goto_6
    :try_start_2
    iget-object p3, p0, Lcom/iterable/iterableapi/v0;->w:Lcom/iterable/iterableapi/h2;

    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/view/View;->setAlpha(F)V

    iget-object p3, p0, Lcom/iterable/iterableapi/v0;->w:Lcom/iterable/iterableapi/h2;

    new-instance v0, Lcom/iterable/iterableapi/t0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/iterable/iterableapi/t0;-><init>(Lcom/iterable/iterableapi/v0;I)V

    const-wide/16 v1, 0x1f4

    invoke-virtual {p3, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_3

    goto :goto_7

    :catch_3
    const-string p3, "View not present. Failed to hide before resizing inapp"

    invoke-static {p1, p3}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    :goto_7
    return-object p2
.end method

.method public final onDestroy()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/m0;->onDestroy()V

    iget-object v0, p0, Lcom/iterable/iterableapi/v0;->G:Landroid/os/Handler;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/iterable/iterableapi/v0;->H:Lcom/iterable/iterableapi/t0;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/iterable/iterableapi/v0;->H:Lcom/iterable/iterableapi/t0;

    iput-object v0, p0, Lcom/iterable/iterableapi/v0;->G:Landroid/os/Handler;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    :cond_1
    sput-object v0, Lcom/iterable/iterableapi/v0;->N:Lcom/iterable/iterableapi/v0;

    sput-object v0, Lcom/iterable/iterableapi/v0;->O:Lqg3/d;

    sput-object v0, Lcom/iterable/iterableapi/v0;->P:Lcom/iterable/iterableapi/y0;

    return-void
.end method

.method public final onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/fragment/app/y;->onSaveInstanceState(Landroid/os/Bundle;)V

    const-string v0, "InAppOpenTracked"

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method public final onStart()V
    .locals 3

    invoke-super {p0}, Landroidx/fragment/app/y;->onStart()V

    invoke-virtual {p0}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/iterable/iterableapi/v0;->J:Landroid/graphics/Rect;

    invoke-static {v1}, Lcom/iterable/iterableapi/v0;->C(Landroid/graphics/Rect;)I

    move-result v1

    const/4 v2, 0x4

    if-eq v1, v2, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const-string v1, "onStart"

    invoke-virtual {p0, v0, v1}, Lcom/iterable/iterableapi/v0;->A(Landroid/view/Window;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final onStop()V
    .locals 1

    iget-object v0, p0, Lcom/iterable/iterableapi/v0;->y:Lcom/iterable/iterableapi/s0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/OrientationEventListener;->disable()V

    :cond_0
    invoke-super {p0}, Landroidx/fragment/app/y;->onStop()V

    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    iget-object p2, p0, Lcom/iterable/iterableapi/v0;->J:Landroid/graphics/Rect;

    invoke-static {p2}, Lcom/iterable/iterableapi/v0;->C(Landroid/graphics/Rect;)I

    move-result p2

    const/4 v0, 0x4

    if-eq p2, v0, :cond_0

    new-instance p2, Lc9/g;

    const/16 v0, 0xa

    invoke-direct {p2, v0}, Lc9/g;-><init>(I)V

    sget-object v0, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {p1, p2}, Lh5/h0;->l(Landroid/view/View;Lh5/u;)V

    :cond_0
    return-void
.end method

.method public final z(Landroid/graphics/drawable/ColorDrawable;Landroid/graphics/drawable/ColorDrawable;)V
    .locals 2

    if-eqz p1, :cond_3

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    new-array v0, v0, [Landroid/graphics/drawable/Drawable;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p2, v0, p1

    new-instance p2, Landroid/graphics/drawable/TransitionDrawable;

    invoke-direct {p2, v0}, Landroid/graphics/drawable/TransitionDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/TransitionDrawable;->setCrossFadeEnabled(Z)V

    invoke-virtual {p0}, Landroidx/fragment/app/y;->getDialog()Landroid/app/Dialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    const/16 p1, 0x12c

    invoke-virtual {p2, p1}, Landroid/graphics/drawable/TransitionDrawable;->startTransition(I)V

    return-void

    :cond_2
    :goto_0
    const-string p1, "IterableInAppFragmentHTMLNotification"

    const-string p2, "Dialog or Window not present. Skipping background animation"

    invoke-static {p1, p2}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    :goto_1
    return-void
.end method
