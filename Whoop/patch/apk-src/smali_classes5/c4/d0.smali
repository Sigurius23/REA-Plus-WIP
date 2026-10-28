.class public final Lc4/d0;
.super Lg/m;
.source "SourceFile"


# instance fields
.field public E:Lc4/a0;

.field public final F:Landroid/view/View;

.field public final G:Lc4/z;

.field public H:Z

.field public z:Lc93/a;


# direct methods
.method public constructor <init>(Lc93/a;Lc4/a0;Landroid/view/View;Ly3/m;Ly3/c;Ljava/util/UUID;)V
    .locals 4

    new-instance v0, Landroid/view/ContextThemeWrapper;

    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-boolean v2, p2, Lc4/a0;->e:Z

    if-eqz v2, :cond_0

    const v2, 0x7f150148

    goto :goto_0

    :cond_0
    const v2, 0x7f150174

    :goto_0
    invoke-direct {v0, v1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lg/m;-><init>(Landroid/content/Context;I)V

    iput-object p1, p0, Lc4/d0;->z:Lc93/a;

    iput-object p2, p0, Lc4/d0;->E:Lc4/a0;

    iput-object p3, p0, Lc4/d0;->F:Landroid/view/View;

    const/16 p1, 0x8

    int-to-float p1, p1

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p2

    if-eqz p2, :cond_5

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Landroid/view/Window;->requestFeature(I)Z

    const v0, 0x106000d

    invoke-virtual {p2, v0}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    iget-object v0, p0, Lc4/d0;->E:Lc4/a0;

    iget-boolean v0, v0, Lc4/a0;->e:Z

    invoke-static {p2, v0}, Lpf/c;->V(Landroid/view/Window;Z)V

    const/16 v0, 0x11

    invoke-virtual {p2, v0}, Landroid/view/Window;->setGravity(I)V

    iget-object v0, p0, Lc4/d0;->E:Lc4/a0;

    iget-boolean v0, v0, Lc4/a0;->e:Z

    if-nez v0, :cond_2

    const v0, 0x10100

    invoke-virtual {p2, v0}, Landroid/view/Window;->addFlags(I)V

    invoke-virtual {p2}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    sget-object v3, Lc4/s;->a:Lc4/s;

    invoke-virtual {v3, v0}, Lc4/s;->a(Landroid/view/WindowManager$LayoutParams;)V

    const/16 v3, 0x1e

    if-lt v2, v3, :cond_1

    sget-object v2, Lc4/t;->a:Lc4/t;

    invoke-virtual {v2, v0, v1}, Lc4/t;->a(Landroid/view/WindowManager$LayoutParams;I)V

    invoke-virtual {v2, v0, v1}, Lc4/t;->b(Landroid/view/WindowManager$LayoutParams;I)V

    :cond_1
    invoke-virtual {p2, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    :cond_2
    new-instance v0, Lc4/z;

    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2, p2}, Lc4/z;-><init>(Landroid/content/Context;Landroid/view/Window;)V

    iget-object v2, p0, Lc4/d0;->E:Lc4/a0;

    iget-object v2, v2, Lc4/a0;->f:Ljava/lang/String;

    invoke-virtual {p0, v2}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Dialog:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p6

    const v2, 0x7f0a032f

    invoke-virtual {v0, v2, p6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    invoke-interface {p5, p1}, Ly3/c;->q0(F)F

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/View;->setElevation(F)V

    new-instance p1, Lc4/c0;

    const/4 p5, 0x0

    invoke-direct {p1, p5}, Lc4/c0;-><init>(I)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    iput-object v0, p0, Lc4/d0;->G:Lc4/z;

    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    instance-of p2, p1, Landroid/view/ViewGroup;

    if-eqz p2, :cond_3

    check-cast p1, Landroid/view/ViewGroup;

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_4

    invoke-static {p1}, Lc4/d0;->c(Landroid/view/ViewGroup;)V

    :cond_4
    invoke-virtual {p0, v0}, Lg/m;->setContentView(Landroid/view/View;)V

    invoke-static {p3}, Landroidx/lifecycle/o1;->g(Landroid/view/View;)Landroidx/lifecycle/g0;

    move-result-object p1

    invoke-static {v0, p1}, Landroidx/lifecycle/o1;->n(Landroid/view/View;Landroidx/lifecycle/g0;)V

    invoke-static {p3}, Landroidx/lifecycle/o1;->h(Landroid/view/View;)Landroidx/lifecycle/f2;

    move-result-object p1

    invoke-static {v0, p1}, Landroidx/lifecycle/o1;->o(Landroid/view/View;Landroidx/lifecycle/f2;)V

    invoke-static {p3}, Lts/o;->t(Landroid/view/View;)Lpb/f;

    move-result-object p1

    invoke-static {v0, p1}, Lts/o;->G(Landroid/view/View;Lpb/f;)V

    iget-object p1, p0, Lc4/d0;->z:Lc93/a;

    iget-object p2, p0, Lc4/d0;->E:Lc4/a0;

    invoke-virtual {p0, p1, p2, p4}, Lc4/d0;->d(Lc93/a;Lc4/a0;Ly3/m;)V

    invoke-virtual {p0}, Lg/m;->getOnBackPressedDispatcher()Lg/z;

    move-result-object p1

    new-instance p2, Lc4/b;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p3}, Lc4/b;-><init>(Lc4/d0;I)V

    const/4 p3, 0x2

    invoke-static {p1, p0, p2, p3}, Lo73/a;->n(Lg/z;Lc4/d0;Lkotlin/jvm/functions/Function1;I)V

    return-void

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Dialog has no window"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final c(Landroid/view/ViewGroup;)V
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    instance-of v1, p0, Lc4/z;

    if-eqz v1, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    :goto_0
    if-ge v0, v1, :cond_3

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_1

    check-cast v2, Landroid/view/ViewGroup;

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_2

    invoke-static {v2}, Lc4/d0;->c(Landroid/view/ViewGroup;)V

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 0

    return-void
.end method

.method public final d(Lc93/a;Lc4/a0;Ly3/m;)V
    .locals 6

    iput-object p1, p0, Lc4/d0;->z:Lc93/a;

    iput-object p2, p0, Lc4/d0;->E:Lc4/a0;

    iget-object p1, p2, Lc4/a0;->c:Lc4/k0;

    iget-object v0, p0, Lc4/d0;->F:Landroid/view/View;

    invoke-static {v0}, Lc4/r;->c(Landroid/view/View;)Z

    move-result v0

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz p1, :cond_2

    if-eq p1, v2, :cond_1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    move v0, v2

    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/16 v3, 0x2000

    if-eqz v0, :cond_3

    move v0, v3

    goto :goto_1

    :cond_3
    const/16 v0, -0x2001

    :goto_1
    invoke-virtual {p1, v0, v3}, Landroid/view/Window;->setFlags(II)V

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_5

    if-ne p1, v2, :cond_4

    move p1, v2

    goto :goto_2

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    move p1, v1

    :goto_2
    iget-object p3, p0, Lc4/d0;->G:Lc4/z;

    invoke-virtual {p3, p1}, Landroid/view/View;->setLayoutDirection(I)V

    iget-boolean p1, p2, Lc4/a0;->e:Z

    iget-boolean v0, p2, Lc4/a0;->d:Z

    iget-object v3, p3, Lc4/z;->J:Landroid/view/Window;

    iget-boolean v4, p3, Lc4/z;->N:Z

    if-eqz v4, :cond_7

    iget-boolean v4, p3, Lc4/z;->L:Z

    if-ne v0, v4, :cond_7

    iget-boolean v4, p3, Lc4/z;->M:Z

    if-eq p1, v4, :cond_6

    goto :goto_3

    :cond_6
    move v4, v1

    goto :goto_4

    :cond_7
    :goto_3
    move v4, v2

    :goto_4
    iput-boolean v0, p3, Lc4/z;->L:Z

    iput-boolean p1, p3, Lc4/z;->M:Z

    if-eqz v4, :cond_a

    invoke-virtual {v3}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v4

    const/4 v5, -0x2

    if-eqz v0, :cond_8

    move v0, v5

    goto :goto_5

    :cond_8
    const/4 v0, -0x1

    :goto_5
    iget v4, v4, Landroid/view/WindowManager$LayoutParams;->width:I

    if-ne v0, v4, :cond_9

    iget-boolean v4, p3, Lc4/z;->N:Z

    if-nez v4, :cond_a

    :cond_9
    invoke-virtual {v3, v0, v5}, Landroid/view/Window;->setLayout(II)V

    iput-boolean v2, p3, Lc4/z;->N:Z

    :cond_a
    iget-boolean p2, p2, Lc4/a0;->b:Z

    invoke-virtual {p0, p2}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p2

    if-eqz p2, :cond_d

    if-eqz p1, :cond_b

    goto :goto_6

    :cond_b
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x1f

    if-ge p1, p3, :cond_c

    const/16 v1, 0x10

    goto :goto_6

    :cond_c
    const/16 v1, 0x30

    :goto_6
    invoke-virtual {p2, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    :cond_d
    return-void
.end method

.method public final onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lc4/d0;->E:Lc4/a0;

    iget-boolean v0, v0, Lc4/a0;->a:Z

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->isTracking()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->isCanceled()Z

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x6f

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lc4/d0;->z:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 9

    invoke-super {p0, p1}, Landroid/app/Dialog;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    iget-object v1, p0, Lc4/d0;->E:Lc4/a0;

    iget-boolean v1, v1, Lc4/a0;->b:Z

    const/4 v2, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lc4/d0;->G:Lc4/z;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v6

    if-nez v6, :cond_1

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v6

    if-nez v6, :cond_1

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v6

    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    move-result v7

    add-int/2addr v7, v6

    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    move-result v6

    add-int/2addr v6, v7

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v8

    add-int/2addr v8, v1

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v1

    add-int/2addr v1, v8

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    invoke-static {v5}, Le93/b;->X(F)I

    move-result v5

    if-gt v7, v5, :cond_1

    if-gt v5, v6, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    invoke-static {v5}, Le93/b;->X(F)I

    move-result v5

    if-gt v8, v5, :cond_1

    if-gt v5, v1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    if-eqz p1, :cond_4

    if-eq p1, v4, :cond_3

    if-eq p1, v2, :cond_2

    goto :goto_2

    :cond_2
    iput-boolean v3, p0, Lc4/d0;->H:Z

    return v0

    :cond_3
    iget-boolean p1, p0, Lc4/d0;->H:Z

    if-eqz p1, :cond_6

    iget-object p1, p0, Lc4/d0;->z:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    iput-boolean v3, p0, Lc4/d0;->H:Z

    return v4

    :cond_4
    iput-boolean v4, p0, Lc4/d0;->H:Z

    return v4

    :cond_5
    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p1

    if-eqz p1, :cond_7

    if-eq p1, v4, :cond_7

    if-eq p1, v2, :cond_7

    :cond_6
    :goto_2
    return v0

    :cond_7
    iput-boolean v3, p0, Lc4/d0;->H:Z

    return v0
.end method
