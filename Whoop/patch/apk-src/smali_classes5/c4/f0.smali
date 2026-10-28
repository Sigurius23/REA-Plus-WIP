.class public final Lc4/f0;
.super Lb3/a;
.source "SourceFile"


# instance fields
.field public J:Lc93/a;

.field public K:Lc4/j0;

.field public L:Ljava/lang/String;

.field public final M:Landroid/view/View;

.field public final N:Lc4/h0;

.field public final O:Landroid/view/WindowManager;

.field public final P:Landroid/view/WindowManager$LayoutParams;

.field public Q:Lc4/i0;

.field public R:Ly3/m;

.field public final S:Lp1/k1;

.field public final T:Lp1/k1;

.field public U:Ly3/k;

.field public final V:Lp1/f0;

.field public final W:Landroid/graphics/Rect;

.field public final a0:Lz1/v;

.field public b0:Lc4/u;

.field public final c0:Lp1/k1;

.field public d0:Z

.field public final e0:[I


# direct methods
.method public constructor <init>(Lc93/a;Lc4/j0;Ljava/lang/String;Landroid/view/View;Ly3/c;Lc4/i0;Ljava/util/UUID;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    new-instance v0, Lc4/g0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_0

    :cond_0
    new-instance v0, Lc4/h0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :goto_0
    invoke-virtual {p4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {p0, v1}, Lb3/a;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lc4/f0;->J:Lc93/a;

    iput-object p2, p0, Lc4/f0;->K:Lc4/j0;

    iput-object p3, p0, Lc4/f0;->L:Ljava/lang/String;

    iput-object p4, p0, Lc4/f0;->M:Landroid/view/View;

    iput-object v0, p0, Lc4/f0;->N:Lc4/h0;

    invoke-virtual {p4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "window"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type android.view.WindowManager"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/view/WindowManager;

    iput-object p1, p0, Lc4/f0;->O:Landroid/view/WindowManager;

    new-instance p1, Landroid/view/WindowManager$LayoutParams;

    invoke-direct {p1}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    const p2, 0x800033

    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    iget-object p2, p0, Lc4/f0;->K:Lc4/j0;

    invoke-static {p4}, Lc4/r;->c(Landroid/view/View;)Z

    move-result p3

    iget-boolean v0, p2, Lc4/j0;->b:Z

    iget p2, p2, Lc4/j0;->a:I

    if-eqz v0, :cond_1

    if-eqz p3, :cond_1

    or-int/lit16 p2, p2, 0x2000

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_2

    if-nez p3, :cond_2

    and-int/lit16 p2, p2, -0x2001

    :cond_2
    :goto_1
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    const/16 p2, 0x3ea

    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->type:I

    invoke-virtual {p4}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;

    move-result-object p2

    iput-object p2, p1, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    const/4 p2, -0x2

    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->width:I

    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->height:I

    const/4 p2, -0x3

    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->format:I

    invoke-virtual {p4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const p3, 0x7f140427

    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/WindowManager$LayoutParams;->setTitle(Ljava/lang/CharSequence;)V

    iput-object p1, p0, Lc4/f0;->P:Landroid/view/WindowManager$LayoutParams;

    iput-object p6, p0, Lc4/f0;->Q:Lc4/i0;

    sget-object p1, Ly3/m;->w:Ly3/m;

    iput-object p1, p0, Lc4/f0;->R:Ly3/m;

    const/4 p1, 0x0

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p2

    iput-object p2, p0, Lc4/f0;->S:Lp1/k1;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lc4/f0;->T:Lp1/k1;

    new-instance p1, Lav/b;

    const/4 p2, 0x5

    invoke-direct {p1, p0, p2}, Lav/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object p1

    iput-object p1, p0, Lc4/f0;->V:Lp1/f0;

    const/16 p1, 0x8

    int-to-float p1, p1

    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iput-object p2, p0, Lc4/f0;->W:Landroid/graphics/Rect;

    new-instance p2, Lz1/v;

    new-instance p3, Lc4/n;

    const/4 p6, 0x2

    invoke-direct {p3, p0, p6}, Lc4/n;-><init>(Lc4/f0;I)V

    invoke-direct {p2, p3}, Lz1/v;-><init>(Lkotlin/jvm/functions/Function1;)V

    iput-object p2, p0, Lc4/f0;->a0:Lz1/v;

    const p2, 0x1020002

    invoke-virtual {p0, p2}, Landroid/view/View;->setId(I)V

    invoke-static {p4}, Landroidx/lifecycle/o1;->g(Landroid/view/View;)Landroidx/lifecycle/g0;

    move-result-object p2

    invoke-static {p0, p2}, Landroidx/lifecycle/o1;->n(Landroid/view/View;Landroidx/lifecycle/g0;)V

    invoke-static {p4}, Landroidx/lifecycle/o1;->h(Landroid/view/View;)Landroidx/lifecycle/f2;

    move-result-object p2

    invoke-static {p0, p2}, Landroidx/lifecycle/o1;->o(Landroid/view/View;Landroidx/lifecycle/f2;)V

    invoke-static {p4}, Lts/o;->t(Landroid/view/View;)Lpb/f;

    move-result-object p2

    invoke-static {p0, p2}, Lts/o;->G(Landroid/view/View;Lpb/f;)V

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Popup:"

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const p3, 0x7f0a032f

    invoke-virtual {p0, p3, p2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    invoke-interface {p5, p1}, Ly3/c;->q0(F)F

    move-result p1

    invoke-virtual {p0, p1}, Landroid/view/View;->setElevation(F)V

    new-instance p1, Lc4/c0;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Lc4/c0;-><init>(I)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    sget-object p1, Lc4/y;->a:Lx1/b;

    invoke-static {p1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p1

    iput-object p1, p0, Lc4/f0;->c0:Lp1/k1;

    const/4 p1, 0x2

    new-array p1, p1, [I

    iput-object p1, p0, Lc4/f0;->e0:[I

    return-void
.end method

.method private final getContent()Lc93/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/m;"
        }
    .end annotation

    iget-object v0, p0, Lc4/f0;->c0:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc93/m;

    return-object v0
.end method

.method public static synthetic getParams$ui_release$annotations()V
    .locals 0

    return-void
.end method

.method private final getParentLayoutCoordinates()Ly2/y;
    .locals 1

    iget-object v0, p0, Lc4/f0;->T:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/y;

    return-object v0
.end method

.method private final getVisibleDisplayBounds()Ly3/k;
    .locals 5

    iget-object v0, p0, Lc4/f0;->N:Lc4/h0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lc4/f0;->M:Landroid/view/View;

    iget-object v1, p0, Lc4/f0;->W:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    new-instance v0, Ly3/k;

    iget v2, v1, Landroid/graphics/Rect;->left:I

    iget v3, v1, Landroid/graphics/Rect;->top:I

    iget v4, v1, Landroid/graphics/Rect;->right:I

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    invoke-direct {v0, v2, v3, v4, v1}, Ly3/k;-><init>(IIII)V

    return-object v0
.end method

.method public static final synthetic i(Lc4/f0;)Ly2/y;
    .locals 0

    invoke-direct {p0}, Lc4/f0;->getParentLayoutCoordinates()Ly2/y;

    move-result-object p0

    return-object p0
.end method

.method private final setContent(Lc93/m;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/m;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lc4/f0;->c0:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private final setParentLayoutCoordinates(Ly2/y;)V
    .locals 1

    iget-object v0, p0, Lc4/f0;->T:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/runtime/Composer;I)V
    .locals 5

    check-cast p1, Lp1/q;

    const v0, -0x331e2520

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, p2

    and-int/lit8 v2, v0, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v2, v1, :cond_1

    move v1, v4

    goto :goto_1

    :cond_1
    move v1, v3

    :goto_1
    and-int/2addr v0, v4

    invoke-virtual {p1, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-direct {p0}, Lc4/f0;->getContent()Lc93/m;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance v0, Lc4/e;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p2, v1}, Lc4/e;-><init>(Ljava/lang/Object;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    iget-object v0, p0, Lc4/f0;->K:Lc4/j0;

    iget-boolean v0, v0, Lc4/j0;->c:Z

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x6f

    if-ne v0, v1, :cond_5

    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_3

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0, p1, p0}, Landroid/view/KeyEvent$DispatcherState;->startTracking(Landroid/view/KeyEvent;Ljava/lang/Object;)V

    return v2

    :cond_3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-ne v1, v2, :cond_5

    invoke-virtual {v0, p1}, Landroid/view/KeyEvent$DispatcherState;->isTracking(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCanceled()Z

    move-result v0

    if-nez v0, :cond_5

    iget-object p1, p0, Lc4/f0;->J:Lc93/a;

    if-eqz p1, :cond_4

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_4
    return v2

    :cond_5
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final f(ZIIII)V
    .locals 0

    invoke-super/range {p0 .. p5}, Lb3/a;->f(ZIIII)V

    move-object p1, p0

    iget-object p2, p1, Lc4/f0;->K:Lc4/j0;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    if-nez p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    move-result p3

    iget-object p4, p1, Lc4/f0;->P:Landroid/view/WindowManager$LayoutParams;

    iput p3, p4, Landroid/view/WindowManager$LayoutParams;->width:I

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    iput p2, p4, Landroid/view/WindowManager$LayoutParams;->height:I

    iget-object p2, p1, Lc4/f0;->N:Lc4/h0;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p1, Lc4/f0;->O:Landroid/view/WindowManager;

    invoke-interface {p2, p0, p4}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final g(II)V
    .locals 1

    iget-object p1, p0, Lc4/f0;->K:Lc4/j0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lc4/f0;->getVisibleDisplayBounds()Ly3/k;

    move-result-object p1

    invoke-virtual {p1}, Ly3/k;->c()I

    move-result p2

    const/high16 v0, -0x80000000

    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-virtual {p1}, Ly3/k;->a()I

    move-result p1

    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-super {p0, p2, p1}, Lb3/a;->g(II)V

    return-void
.end method

.method public final getCanCalculatePosition()Z
    .locals 1

    iget-object v0, p0, Lc4/f0;->V:Lp1/f0;

    invoke-virtual {v0}, Lp1/f0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final getParams$ui_release()Landroid/view/WindowManager$LayoutParams;
    .locals 1

    iget-object v0, p0, Lc4/f0;->P:Landroid/view/WindowManager$LayoutParams;

    return-object v0
.end method

.method public final getParentLayoutDirection()Ly3/m;
    .locals 1

    iget-object v0, p0, Lc4/f0;->R:Ly3/m;

    return-object v0
.end method

.method public final getPopupContentSize-bOM6tXw()Ly3/l;
    .locals 1

    iget-object v0, p0, Lc4/f0;->S:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/l;

    return-object v0
.end method

.method public final getPositionProvider()Lc4/i0;
    .locals 1

    iget-object v0, p0, Lc4/f0;->Q:Lc4/i0;

    return-object v0
.end method

.method public getShouldCreateCompositionOnAttachedToWindow()Z
    .locals 1

    iget-boolean v0, p0, Lc4/f0;->d0:Z

    return v0
.end method

.method public getSubCompositionView()Lb3/a;
    .locals 0

    return-object p0
.end method

.method public final getTestTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lc4/f0;->L:Ljava/lang/String;

    return-object v0
.end method

.method public bridge synthetic getViewRoot()Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final j(Lp1/t;Lc93/m;)V
    .locals 0

    invoke-virtual {p0, p1}, Lb3/a;->setParentCompositionContext(Lp1/t;)V

    invoke-direct {p0, p2}, Lc4/f0;->setContent(Lc93/m;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lc4/f0;->d0:Z

    return-void
.end method

.method public final k(Lc93/a;Lc4/j0;Ljava/lang/String;Ly3/m;)V
    .locals 0

    iput-object p1, p0, Lc4/f0;->J:Lc93/a;

    iput-object p3, p0, Lc4/f0;->L:Ljava/lang/String;

    iget-object p1, p0, Lc4/f0;->K:Lc4/j0;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p2, p0, Lc4/f0;->K:Lc4/j0;

    iget-object p1, p0, Lc4/f0;->M:Landroid/view/View;

    invoke-static {p1}, Lc4/r;->c(Landroid/view/View;)Z

    move-result p1

    iget-boolean p3, p2, Lc4/j0;->b:Z

    iget p2, p2, Lc4/j0;->a:I

    if-eqz p3, :cond_1

    if-eqz p1, :cond_1

    or-int/lit16 p2, p2, 0x2000

    goto :goto_0

    :cond_1
    if-eqz p3, :cond_2

    if-nez p1, :cond_2

    and-int/lit16 p2, p2, -0x2001

    :cond_2
    :goto_0
    iget-object p1, p0, Lc4/f0;->P:Landroid/view/WindowManager$LayoutParams;

    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    iget-object p2, p0, Lc4/f0;->N:Lc4/h0;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p0, Lc4/f0;->O:Landroid/view/WindowManager;

    invoke-interface {p2, p0, p1}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :goto_1
    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_4

    const/4 p2, 0x1

    if-ne p1, p2, :cond_3

    goto :goto_2

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    const/4 p2, 0x0

    :goto_2
    invoke-super {p0, p2}, Landroid/view/View;->setLayoutDirection(I)V

    return-void
.end method

.method public final l()V
    .locals 11

    invoke-direct {p0}, Lc4/f0;->getParentLayoutCoordinates()Ly2/y;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-interface {v0}, Ly2/y;->g()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Ly2/y;->n()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    invoke-interface {v0, v3, v4}, Ly2/y;->E(J)J

    move-result-wide v3

    const/16 v0, 0x20

    shr-long v5, v3, v0

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    const-wide v6, 0xffffffffL

    and-long/2addr v3, v6

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    int-to-long v4, v5

    shl-long/2addr v4, v0

    int-to-long v8, v3

    and-long/2addr v8, v6

    or-long v3, v4, v8

    new-instance v5, Ly3/k;

    shr-long v8, v3, v0

    long-to-int v8, v8

    and-long/2addr v3, v6

    long-to-int v3, v3

    shr-long v9, v1, v0

    long-to-int v0, v9

    add-int/2addr v0, v8

    and-long/2addr v1, v6

    long-to-int v1, v1

    add-int/2addr v1, v3

    invoke-direct {v5, v8, v3, v0, v1}, Ly3/k;-><init>(IIII)V

    iget-object v0, p0, Lc4/f0;->U:Ly3/k;

    invoke-virtual {v5, v0}, Ly3/k;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    iput-object v5, p0, Lc4/f0;->U:Ly3/k;

    invoke-virtual {p0}, Lc4/f0;->n()V

    :cond_2
    :goto_1
    return-void
.end method

.method public final m(Ly2/y;)V
    .locals 0

    invoke-direct {p0, p1}, Lc4/f0;->setParentLayoutCoordinates(Ly2/y;)V

    invoke-virtual {p0}, Lc4/f0;->l()V

    return-void
.end method

.method public final n()V
    .locals 13

    iget-object v3, p0, Lc4/f0;->U:Ly3/k;

    if-nez v3, :cond_1

    :cond_0
    move-object v2, p0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lc4/f0;->getPopupContentSize-bOM6tXw()Ly3/l;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-wide v6, v0, Ly3/l;->a:J

    invoke-direct {p0}, Lc4/f0;->getVisibleDisplayBounds()Ly3/k;

    move-result-object v0

    invoke-virtual {v0}, Ly3/k;->c()I

    move-result v1

    invoke-virtual {v0}, Ly3/k;->a()I

    move-result v0

    int-to-long v1, v1

    const/16 v8, 0x20

    shl-long/2addr v1, v8

    int-to-long v4, v0

    const-wide v9, 0xffffffffL

    and-long/2addr v4, v9

    or-long/2addr v4, v1

    new-instance v1, Lkotlin/jvm/internal/f0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-wide/16 v11, 0x0

    iput-wide v11, v1, Lkotlin/jvm/internal/f0;->w:J

    sget-object v11, Lc4/d;->G:Lc4/d;

    new-instance v0, Lc4/e0;

    move-object v2, p0

    invoke-direct/range {v0 .. v7}, Lc4/e0;-><init>(Lkotlin/jvm/internal/f0;Lc4/f0;Ly3/k;JJ)V

    iget-object v3, v2, Lc4/f0;->a0:Lz1/v;

    invoke-virtual {v3, v0, v11, p0}, Lz1/v;->d(Lc93/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    iget-wide v0, v1, Lkotlin/jvm/internal/f0;->w:J

    shr-long v6, v0, v8

    long-to-int v3, v6

    iget-object v6, v2, Lc4/f0;->P:Landroid/view/WindowManager$LayoutParams;

    iput v3, v6, Landroid/view/WindowManager$LayoutParams;->x:I

    and-long/2addr v0, v9

    long-to-int v0, v0

    iput v0, v6, Landroid/view/WindowManager$LayoutParams;->y:I

    iget-object v0, v2, Lc4/f0;->K:Lc4/j0;

    iget-boolean v0, v0, Lc4/j0;->e:Z

    iget-object v1, v2, Lc4/f0;->N:Lc4/h0;

    if-eqz v0, :cond_2

    shr-long v7, v4, v8

    long-to-int v0, v7

    and-long v3, v4, v9

    long-to-int v3, v3

    invoke-virtual {v1, p0, v0, v3}, Lc4/h0;->a(Lc4/f0;II)V

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v2, Lc4/f0;->O:Landroid/view/WindowManager;

    invoke-interface {v0, p0, v6}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :goto_0
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 3

    invoke-super {p0}, Lb3/a;->onAttachedToWindow()V

    iget-object v0, p0, Lc4/f0;->a0:Lz1/v;

    invoke-virtual {v0}, Lz1/v;->e()V

    iget-object v0, p0, Lc4/f0;->K:Lc4/j0;

    iget-boolean v0, v0, Lc4/j0;->c:Z

    if-eqz v0, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-ge v0, v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lc4/f0;->b0:Lc4/u;

    if-nez v0, :cond_1

    iget-object v0, p0, Lc4/f0;->J:Lc93/a;

    new-instance v1, Lc4/u;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lc4/u;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Lc4/f0;->b0:Lc4/u;

    :cond_1
    iget-object v0, p0, Lc4/f0;->b0:Lc4/u;

    invoke-static {p0, v0}, Lc4/v;->h(Lc4/f0;Lc4/u;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Lc4/f0;->a0:Lz1/v;

    iget-object v1, v0, Lz1/v;->h:Lvd1/c;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lvd1/c;->a()V

    :cond_0
    invoke-virtual {v0}, Lz1/v;->a()V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lc4/f0;->b0:Lc4/u;

    invoke-static {p0, v0}, Lc4/v;->i(Lc4/f0;Lc4/u;)V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lc4/f0;->b0:Lc4/u;

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    iget-object v0, p0, Lc4/f0;->K:Lc4/j0;

    iget-boolean v0, v0, Lc4/j0;->d:Z

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_0
    const/4 v0, 0x1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    const/4 v2, 0x0

    cmpg-float v1, v1, v2

    if-ltz v1, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    cmpl-float v1, v1, v3

    if-gez v1, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    cmpg-float v1, v1, v2

    if-ltz v1, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_3

    :cond_1
    iget-object p1, p0, Lc4/f0;->J:Lc93/a;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_2
    return v0

    :cond_3
    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_5

    iget-object p1, p0, Lc4/f0;->J:Lc93/a;

    if-eqz p1, :cond_4

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_4
    return v0

    :cond_5
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setLayoutDirection(I)V
    .locals 0

    return-void
.end method

.method public final setParentLayoutDirection(Ly3/m;)V
    .locals 0

    iput-object p1, p0, Lc4/f0;->R:Ly3/m;

    return-void
.end method

.method public final setPopupContentSize-fhxjrPA(Ly3/l;)V
    .locals 1

    iget-object v0, p0, Lc4/f0;->S:Lp1/k1;

    invoke-virtual {v0, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final setPositionProvider(Lc4/i0;)V
    .locals 0

    iput-object p1, p0, Lc4/f0;->Q:Lc4/i0;

    return-void
.end method

.method public final setTestTag(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lc4/f0;->L:Ljava/lang/String;

    return-void
.end method
