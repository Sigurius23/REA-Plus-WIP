.class public Landroidx/core/widget/NestedScrollView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lh5/s;
.implements Lh5/p;
.implements Landroidx/core/view/ScrollingView;


# static fields
.field private static final g0:F

.field private static final h0:Ll5/e;

.field private static final i0:[I


# instance fields
.field public E:Landroid/widget/EdgeEffect;

.field public F:Landroid/widget/EdgeEffect;

.field private G:I

.field private H:Z

.field private I:Z

.field private J:Landroid/view/View;

.field private K:Z

.field private L:Landroid/view/VelocityTracker;

.field private M:Z

.field private N:Z

.field private O:I

.field private P:I

.field private Q:I

.field private R:I

.field private final S:[I

.field private final T:[I

.field private U:I

.field private V:I

.field private W:Ll5/h;

.field private final a0:Lh5/t;

.field private final b0:Lh5/q;

.field private c0:F

.field private d0:Ll5/g;

.field final e0:Ll5/f;

.field f0:Lh5/g;

.field private final w:F

.field private x:J

.field private final y:Landroid/graphics/Rect;

.field private z:Landroid/widget/OverScroller;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-wide v0, 0x3fe8f5c28f5c28f6L    # 0.78

    invoke-static {v0, v1}, Ljava/lang/Math;->log(D)D

    move-result-wide v0

    const-wide v2, 0x3feccccccccccccdL    # 0.9

    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    move-result-wide v2

    div-double/2addr v0, v2

    double-to-float v0, v0

    sput v0, Landroidx/core/widget/NestedScrollView;->g0:F

    new-instance v0, Ll5/e;

    invoke-direct {v0}, Lh5/b;-><init>()V

    sput-object v0, Landroidx/core/widget/NestedScrollView;->h0:Ll5/e;

    const v0, 0x101017a

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Landroidx/core/widget/NestedScrollView;->i0:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f0404bb

    .line 1
    invoke-direct {p0, p1, p2, v0}, Landroidx/core/widget/NestedScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    const/4 v0, 0x1

    .line 4
    iput-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->H:Z

    const/4 v1, 0x0

    .line 5
    iput-boolean v1, p0, Landroidx/core/widget/NestedScrollView;->I:Z

    const/4 v2, 0x0

    .line 6
    iput-object v2, p0, Landroidx/core/widget/NestedScrollView;->J:Landroid/view/View;

    .line 7
    iput-boolean v1, p0, Landroidx/core/widget/NestedScrollView;->K:Z

    .line 8
    iput-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->N:Z

    const/4 v2, -0x1

    .line 9
    iput v2, p0, Landroidx/core/widget/NestedScrollView;->R:I

    const/4 v2, 0x2

    .line 10
    new-array v3, v2, [I

    iput-object v3, p0, Landroidx/core/widget/NestedScrollView;->S:[I

    .line 11
    new-array v2, v2, [I

    iput-object v2, p0, Landroidx/core/widget/NestedScrollView;->T:[I

    .line 12
    new-instance v2, Ll5/f;

    invoke-direct {v2, p0}, Ll5/f;-><init>(Landroidx/core/widget/NestedScrollView;)V

    iput-object v2, p0, Landroidx/core/widget/NestedScrollView;->e0:Ll5/f;

    .line 13
    new-instance v3, Lh5/g;

    .line 14
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4, v2}, Lh5/g;-><init>(Landroid/content/Context;Ll5/f;)V

    iput-object v3, p0, Landroidx/core/widget/NestedScrollView;->f0:Lh5/g;

    .line 15
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1f

    if-lt v2, v3, :cond_0

    .line 16
    invoke-static {p1, p2}, Ll5/c;->a(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/EdgeEffect;

    move-result-object v4

    goto :goto_0

    .line 17
    :cond_0
    new-instance v4, Landroid/widget/EdgeEffect;

    invoke-direct {v4, p1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    .line 18
    :goto_0
    iput-object v4, p0, Landroidx/core/widget/NestedScrollView;->E:Landroid/widget/EdgeEffect;

    if-lt v2, v3, :cond_1

    .line 19
    invoke-static {p1, p2}, Ll5/c;->a(Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/widget/EdgeEffect;

    move-result-object v2

    goto :goto_1

    .line 20
    :cond_1
    new-instance v2, Landroid/widget/EdgeEffect;

    invoke-direct {v2, p1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    .line 21
    :goto_1
    iput-object v2, p0, Landroidx/core/widget/NestedScrollView;->F:Landroid/widget/EdgeEffect;

    .line 22
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    const/high16 v3, 0x43200000    # 160.0f

    mul-float/2addr v2, v3

    const v3, 0x43c10b3d

    mul-float/2addr v2, v3

    const v3, 0x3f570a3d    # 0.84f

    mul-float/2addr v2, v3

    .line 23
    iput v2, p0, Landroidx/core/widget/NestedScrollView;->w:F

    .line 24
    new-instance v2, Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Landroidx/core/widget/NestedScrollView;->z:Landroid/widget/OverScroller;

    .line 25
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusable(Z)V

    const/high16 v2, 0x40000

    .line 26
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 27
    invoke-virtual {p0, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v2

    .line 29
    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v3

    iput v3, p0, Landroidx/core/widget/NestedScrollView;->O:I

    .line 30
    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v3

    iput v3, p0, Landroidx/core/widget/NestedScrollView;->P:I

    .line 31
    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v2

    iput v2, p0, Landroidx/core/widget/NestedScrollView;->Q:I

    .line 32
    sget-object v2, Landroidx/core/widget/NestedScrollView;->i0:[I

    invoke-virtual {p1, p2, v2, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 33
    invoke-virtual {p1, v1, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    invoke-virtual {p0, p2}, Landroidx/core/widget/NestedScrollView;->setFillViewport(Z)V

    .line 34
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 35
    new-instance p1, Lh5/t;

    .line 36
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Landroidx/core/widget/NestedScrollView;->a0:Lh5/t;

    .line 38
    new-instance p1, Lh5/q;

    invoke-direct {p1, p0}, Lh5/q;-><init>(Landroid/view/ViewGroup;)V

    iput-object p1, p0, Landroidx/core/widget/NestedScrollView;->b0:Lh5/q;

    .line 39
    invoke-virtual {p0, v0}, Landroidx/core/widget/NestedScrollView;->setNestedScrollingEnabled(Z)V

    .line 40
    sget-object p1, Landroidx/core/widget/NestedScrollView;->h0:Ll5/e;

    invoke-static {p0, p1}, Lh5/p0;->n(Landroid/view/View;Lh5/b;)V

    return-void
.end method

.method public static synthetic a(Landroidx/core/widget/NestedScrollView;)Landroid/widget/OverScroller;
    .locals 0

    iget-object p0, p0, Landroidx/core/widget/NestedScrollView;->z:Landroid/widget/OverScroller;

    return-object p0
.end method

.method public static q(Landroid/view/View;Landroidx/core/widget/NestedScrollView;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p0

    instance-of v0, p0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/view/View;

    invoke-static {p0, p1}, Landroidx/core/widget/NestedScrollView;->q(Landroid/view/View;Landroidx/core/widget/NestedScrollView;)Z

    move-result p0

    if-eqz p0, :cond_1

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final A(IIIZ)V
    .locals 9

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Landroidx/core/widget/NestedScrollView;->x:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0xfa

    cmp-long v0, v0, v2

    const/4 v1, 0x1

    if-lez v0, :cond_2

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iget v3, v2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    add-int/2addr v0, v3

    iget v2, v2, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v5

    sub-int/2addr v0, v2

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr p2, v5

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    sub-int v7, p1, v5

    iget-object v3, p0, Landroidx/core/widget/NestedScrollView;->z:Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v4

    const/4 v6, 0x0

    move v8, p3

    invoke-virtual/range {v3 .. v8}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    if-eqz p4, :cond_1

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v1}, Landroidx/core/widget/NestedScrollView;->D(II)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v1}, Landroidx/core/widget/NestedScrollView;->F(I)V

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p1

    iput p1, p0, Landroidx/core/widget/NestedScrollView;->V:I

    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    goto :goto_1

    :cond_2
    iget-object p3, p0, Landroidx/core/widget/NestedScrollView;->z:Landroid/widget/OverScroller;

    invoke-virtual {p3}, Landroid/widget/OverScroller;->isFinished()Z

    move-result p3

    if-nez p3, :cond_3

    iget-object p3, p0, Landroidx/core/widget/NestedScrollView;->z:Landroid/widget/OverScroller;

    invoke-virtual {p3}, Landroid/widget/OverScroller;->abortAnimation()V

    invoke-virtual {p0, v1}, Landroidx/core/widget/NestedScrollView;->F(I)V

    :cond_3
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->scrollBy(II)V

    :goto_1
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide p1

    iput-wide p1, p0, Landroidx/core/widget/NestedScrollView;->x:J

    return-void
.end method

.method public B(IIIZ)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v0

    sub-int/2addr p1, v0

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    sub-int/2addr p2, v0

    invoke-virtual {p0, p1, p2, p3, p4}, Landroidx/core/widget/NestedScrollView;->A(IIIZ)V

    return-void
.end method

.method public C(IIZ)V
    .locals 1

    const/16 v0, 0xfa

    invoke-virtual {p0, p1, p2, v0, p3}, Landroidx/core/widget/NestedScrollView;->B(IIIZ)V

    return-void
.end method

.method public D(II)Z
    .locals 1

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->b0:Lh5/q;

    invoke-virtual {v0, p1, p2}, Lh5/q;->f(II)Z

    move-result p1

    return p1
.end method

.method public final E(Landroid/view/MotionEvent;)Z
    .locals 5

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->E:Landroid/widget/EdgeEffect;

    invoke-static {v0}, Luf/c0;->R(Landroid/widget/EdgeEffect;)F

    move-result v0

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    invoke-static {v0, v1, v3}, Luf/c0;->e0(Landroid/widget/EdgeEffect;FF)F

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v3, p0, Landroidx/core/widget/NestedScrollView;->F:Landroid/widget/EdgeEffect;

    invoke-static {v3}, Luf/c0;->R(Landroid/widget/EdgeEffect;)F

    move-result v3

    cmpl-float v3, v3, v1

    if-eqz v3, :cond_1

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->F:Landroid/widget/EdgeEffect;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr p1, v3

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float/2addr v3, p1

    invoke-static {v0, v1, v3}, Luf/c0;->e0(Landroid/widget/EdgeEffect;FF)F

    return v2

    :cond_1
    return v0
.end method

.method public F(I)V
    .locals 1

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->b0:Lh5/q;

    invoke-virtual {v0, p1}, Lh5/q;->g(I)V

    return-void
.end method

.method public addView(Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-gtz v0, :cond_0

    .line 2
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "ScrollView can host only one direct child"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addView(Landroid/view/View;I)V
    .locals 1

    .line 4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-gtz v0, :cond_0

    .line 5
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "ScrollView can host only one direct child"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 10
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-gtz v0, :cond_0

    .line 11
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 12
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "ScrollView can host only one direct child"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1

    .line 7
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-gtz v0, :cond_0

    .line 8
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "ScrollView can host only one direct child"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Landroid/view/View;Landroid/view/View;II)V
    .locals 0

    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->a0:Lh5/t;

    invoke-virtual {p1, p3, p4}, Lh5/t;->b(II)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, p4}, Landroidx/core/widget/NestedScrollView;->D(II)Z

    return-void
.end method

.method public c(Landroid/view/View;I)V
    .locals 0

    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->a0:Lh5/t;

    invoke-virtual {p1, p2}, Lh5/t;->c(I)V

    invoke-virtual {p0, p2}, Landroidx/core/widget/NestedScrollView;->F(I)V

    return-void
.end method

.method public computeHorizontalScrollExtent()I
    .locals 1

    invoke-super {p0}, Landroid/view/View;->computeHorizontalScrollExtent()I

    move-result v0

    return v0
.end method

.method public computeHorizontalScrollOffset()I
    .locals 1

    invoke-super {p0}, Landroid/view/View;->computeHorizontalScrollOffset()I

    move-result v0

    return v0
.end method

.method public computeHorizontalScrollRange()I
    .locals 1

    invoke-super {p0}, Landroid/view/View;->computeHorizontalScrollRange()I

    move-result v0

    return v0
.end method

.method public computeScroll()V
    .locals 12

    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->z:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->z:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->z:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrY()I

    move-result v1

    iget v2, p0, Landroidx/core/widget/NestedScrollView;->V:I

    sub-int v2, v1, v2

    invoke-virtual {p0, v2}, Landroidx/core/widget/NestedScrollView;->j(I)I

    move-result v2

    iput v1, p0, Landroidx/core/widget/NestedScrollView;->V:I

    iget-object v3, p0, Landroidx/core/widget/NestedScrollView;->T:[I

    const/4 v10, 0x1

    const/4 v11, 0x0

    aput v11, v3, v10

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v1, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Landroidx/core/widget/NestedScrollView;->k(II[I[II)Z

    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->T:[I

    aget v1, v1, v10

    sub-int/2addr v2, v1

    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I

    move-result v6

    invoke-static {}, Lb5/b;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->z:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-static {p0, v1}, Lj5/a;->a(Landroidx/core/widget/NestedScrollView;F)V

    :cond_1
    if-eqz v2, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v3

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v9}, Landroidx/core/widget/NestedScrollView;->u(IIIIIIIIZ)Z

    move v8, v6

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    sub-int/2addr v1, v4

    sub-int v4, v2, v1

    iget-object v7, p0, Landroidx/core/widget/NestedScrollView;->T:[I

    aput v11, v7, v10

    iget-object v5, p0, Landroidx/core/widget/NestedScrollView;->S:[I

    const/4 v6, 0x1

    move v2, v1

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v7}, Landroidx/core/widget/NestedScrollView;->l(IIII[II[I)V

    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->T:[I

    aget v1, v1, v10

    sub-int v2, v4, v1

    goto :goto_0

    :cond_2
    move v8, v6

    :goto_0
    if-eqz v2, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->getOverScrollMode()I

    move-result v1

    if-eqz v1, :cond_3

    if-ne v1, v10, :cond_5

    if-lez v8, :cond_5

    :cond_3
    if-gez v2, :cond_4

    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->E:Landroid/widget/EdgeEffect;

    iget-object v2, p0, Landroidx/core/widget/NestedScrollView;->z:Landroid/widget/OverScroller;

    invoke-virtual {v2}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v1, v2}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_1

    :cond_4
    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->F:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->F:Landroid/widget/EdgeEffect;

    iget-object v2, p0, Landroidx/core/widget/NestedScrollView;->z:Landroid/widget/OverScroller;

    invoke-virtual {v2}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v1, v2}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    :cond_5
    :goto_1
    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->z:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->abortAnimation()V

    invoke-virtual {p0, v10}, Landroidx/core/widget/NestedScrollView;->F(I)V

    :cond_6
    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->z:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    return-void

    :cond_7
    invoke-virtual {p0, v10}, Landroidx/core/widget/NestedScrollView;->F(I)V

    return-void
.end method

.method public computeVerticalScrollExtent()I
    .locals 1

    invoke-super {p0}, Landroid/view/View;->computeVerticalScrollExtent()I

    move-result v0

    return v0
.end method

.method public computeVerticalScrollOffset()I
    .locals 2

    const/4 v0, 0x0

    invoke-super {p0}, Landroid/view/View;->computeVerticalScrollOffset()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public computeVerticalScrollRange()I
    .locals 4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    if-nez v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v2

    iget v3, v3, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v3

    sub-int v1, v2, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-gez v3, :cond_1

    sub-int/2addr v2, v3

    return v2

    :cond_1
    if-le v3, v0, :cond_2

    sub-int/2addr v3, v0

    add-int/2addr v3, v2

    return v3

    :cond_2
    return v2
.end method

.method public d(Landroid/view/View;II[II)V
    .locals 6

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p2

    move v2, p3

    move-object v3, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Landroidx/core/widget/NestedScrollView;->k(II[I[II)Z

    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->m(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public dispatchNestedFling(FFZ)Z
    .locals 1

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->b0:Lh5/q;

    invoke-virtual {v0, p1, p2, p3}, Lh5/q;->a(FFZ)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedPreFling(FF)Z
    .locals 1

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->b0:Lh5/q;

    invoke-virtual {v0, p1, p2}, Lh5/q;->b(FF)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedPreScroll(II[I[I)Z
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Landroidx/core/widget/NestedScrollView;->k(II[I[II)Z

    move-result p1

    return p1
.end method

.method public dispatchNestedScroll(IIII[I)Z
    .locals 8

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->b0:Lh5/q;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v7}, Lh5/q;->d(IIII[II[I)Z

    move-result p1

    return p1
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 9

    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_3

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getClipToPadding()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v7

    add-int/2addr v7, v6

    sub-int/2addr v3, v7

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v6

    goto :goto_0

    :cond_0
    move v6, v2

    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getClipToPadding()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v8

    add-int/2addr v8, v7

    sub-int/2addr v4, v8

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    add-int/2addr v5, v7

    :cond_1
    int-to-float v6, v6

    int-to-float v5, v5

    invoke-virtual {p1, v6, v5}, Landroid/graphics/Canvas;->translate(FF)V

    iget-object v5, p0, Landroidx/core/widget/NestedScrollView;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v5, v3, v4}, Landroid/widget/EdgeEffect;->setSize(II)V

    iget-object v3, p0, Landroidx/core/widget/NestedScrollView;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v3, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    :cond_2
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_3
    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->F:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-nez v1, :cond_7

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I

    move-result v5

    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    add-int/2addr v0, v4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getClipToPadding()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v5

    add-int/2addr v5, v2

    sub-int/2addr v3, v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    :cond_4
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getClipToPadding()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v6

    add-int/2addr v6, v5

    sub-int/2addr v4, v6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v5

    sub-int/2addr v0, v5

    :cond_5
    sub-int/2addr v2, v3

    int-to-float v2, v2

    int-to-float v0, v0

    invoke-virtual {p1, v2, v0}, Landroid/graphics/Canvas;->translate(FF)V

    int-to-float v0, v3

    const/4 v2, 0x0

    const/high16 v5, 0x43340000    # 180.0f

    invoke-virtual {p1, v5, v0, v2}, Landroid/graphics/Canvas;->rotate(FFF)V

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->F:Landroid/widget/EdgeEffect;

    invoke-virtual {v0, v3, v4}, Landroid/widget/EdgeEffect;->setSize(II)V

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->F:Landroid/widget/EdgeEffect;

    invoke-virtual {v0, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    :cond_6
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_7
    return-void
.end method

.method public e(I)Z
    .locals 8

    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x0

    :cond_0
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v1

    invoke-virtual {v1, p0, v0, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->getMaxScrollAmount()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    invoke-virtual {p0, v1, v2, v5}, Landroidx/core/widget/NestedScrollView;->r(Landroid/view/View;II)Z

    move-result v5

    if-eqz v5, :cond_1

    iget-object v2, p0, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    invoke-virtual {v1, v2}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    iget-object v2, p0, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    invoke-virtual {p0, v1, v2}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    iget-object v2, p0, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    invoke-virtual {p0, v2}, Landroidx/core/widget/NestedScrollView;->f(Landroid/graphics/Rect;)I

    move-result v2

    invoke-virtual {p0, v2, v3, v4, v4}, Landroidx/core/widget/NestedScrollView;->x(IIIZ)I

    invoke-virtual {v1, p1}, Landroid/view/View;->requestFocus(I)Z

    goto :goto_2

    :cond_1
    const/16 v1, 0x21

    const/16 v5, 0x82

    if-ne p1, v1, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    if-ge v1, v2, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v2

    goto :goto_0

    :cond_2
    if-ne p1, v5, :cond_3

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-lez v1, :cond_3

    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v1

    iget v6, v6, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v1, v6

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v6

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v7

    add-int/2addr v7, v6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v6

    sub-int/2addr v7, v6

    sub-int/2addr v1, v7

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    :cond_3
    :goto_0
    if-nez v2, :cond_4

    return v3

    :cond_4
    if-ne p1, v5, :cond_5

    goto :goto_1

    :cond_5
    neg-int v2, v2

    :goto_1
    invoke-virtual {p0, v2, v3, v4, v4}, Landroidx/core/widget/NestedScrollView;->x(IIIZ)I

    :goto_2
    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p1

    invoke-virtual {p0, v0, v3, p1}, Landroidx/core/widget/NestedScrollView;->r(Landroid/view/View;II)Z

    move-result p1

    if-nez p1, :cond_6

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getDescendantFocusability()I

    move-result p1

    const/high16 v0, 0x20000

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    :cond_6
    return v4
.end method

.method public f(Landroid/graphics/Rect;)I
    .locals 10

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v2

    add-int v3, v2, v0

    invoke-virtual {p0}, Landroid/view/View;->getVerticalFadingEdgeLength()I

    move-result v4

    iget v5, p1, Landroid/graphics/Rect;->top:I

    if-lez v5, :cond_1

    add-int/2addr v2, v4

    :cond_1
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v6

    check-cast v6, Landroid/widget/FrameLayout$LayoutParams;

    iget v7, p1, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v8

    iget v9, v6, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    add-int/2addr v8, v9

    iget v9, v6, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v8, v9

    if-ge v7, v8, :cond_2

    sub-int v4, v3, v4

    goto :goto_0

    :cond_2
    move v4, v3

    :goto_0
    iget v7, p1, Landroid/graphics/Rect;->bottom:I

    if-le v7, v4, :cond_4

    iget v8, p1, Landroid/graphics/Rect;->top:I

    if-le v8, v2, :cond_4

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v1

    if-le v1, v0, :cond_3

    iget p1, p1, Landroid/graphics/Rect;->top:I

    sub-int/2addr p1, v2

    goto :goto_1

    :cond_3
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p1, v4

    :goto_1
    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v0

    iget v1, v6, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    sub-int/2addr v0, v3

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1

    :cond_4
    iget v3, p1, Landroid/graphics/Rect;->top:I

    if-ge v3, v2, :cond_6

    if-ge v7, v4, :cond_6

    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result v3

    if-le v3, v0, :cond_5

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v4, p1

    sub-int/2addr v1, v4

    goto :goto_2

    :cond_5
    iget p1, p1, Landroid/graphics/Rect;->top:I

    sub-int/2addr v2, p1

    sub-int/2addr v1, v2

    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p1

    neg-int p1, p1

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1

    :cond_6
    return v1
.end method

.method public g(Landroid/view/View;IIIII[I)V
    .locals 0

    invoke-virtual {p0, p5, p6, p7}, Landroidx/core/widget/NestedScrollView;->s(II[I)V

    return-void
.end method

.method public getBottomFadingEdgeStrength()F
    .locals 5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p0}, Landroid/view/View;->getVerticalFadingEdgeLength()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    iget v1, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    sub-int/2addr v0, v1

    sub-int/2addr v0, v3

    if-ge v0, v2, :cond_1

    int-to-float v0, v0

    int-to-float v1, v2

    div-float/2addr v0, v1

    return v0

    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public getMaxScrollAmount()I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    return v0
.end method

.method public getNestedScrollAxes()I
    .locals 1

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->a0:Lh5/t;

    invoke-virtual {v0}, Lh5/t;->a()I

    move-result v0

    return v0
.end method

.method public getScrollRange()I
    .locals 4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iget v3, v2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    add-int/2addr v0, v3

    iget v2, v2, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    sub-int/2addr v0, v2

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0

    :cond_0
    return v1
.end method

.method public getTopFadingEdgeStrength()F
    .locals 2

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getVerticalFadingEdgeLength()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    if-ge v1, v0, :cond_1

    int-to-float v1, v1

    int-to-float v0, v0

    div-float/2addr v1, v0

    return v1

    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public getVerticalScrollFactorCompat()F
    .locals 5

    iget v0, p0, Landroidx/core/widget/NestedScrollView;->c0:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-nez v0, :cond_1

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    const v3, 0x101004d

    const/4 v4, 0x1

    invoke-virtual {v2, v3, v0, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F

    move-result v0

    iput v0, p0, Landroidx/core/widget/NestedScrollView;->c0:F

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Expected theme to define listPreferredItemHeight."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget v0, p0, Landroidx/core/widget/NestedScrollView;->c0:F

    return v0
.end method

.method public h(Landroid/view/View;IIIII)V
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p0, p5, p6, p1}, Landroidx/core/widget/NestedScrollView;->s(II[I)V

    return-void
.end method

.method public hasNestedScrollingParent()Z
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/core/widget/NestedScrollView;->p(I)Z

    move-result v0

    return v0
.end method

.method public i(Landroid/view/View;Landroid/view/View;II)Z
    .locals 0

    and-int/lit8 p1, p3, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public isNestedScrollingEnabled()Z
    .locals 1

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->b0:Lh5/q;

    iget-boolean v0, v0, Lh5/q;->d:Z

    return v0
.end method

.method public j(I)I
    .locals 5

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    const/high16 v1, 0x3f000000    # 0.5f

    const/4 v2, 0x0

    const/high16 v3, 0x40800000    # 4.0f

    if-lez p1, :cond_1

    iget-object v4, p0, Landroidx/core/widget/NestedScrollView;->E:Landroid/widget/EdgeEffect;

    invoke-static {v4}, Luf/c0;->R(Landroid/widget/EdgeEffect;)F

    move-result v4

    cmpl-float v4, v4, v2

    if-eqz v4, :cond_1

    neg-int v2, p1

    int-to-float v2, v2

    mul-float/2addr v2, v3

    int-to-float v4, v0

    div-float/2addr v2, v4

    neg-int v0, v0

    int-to-float v0, v0

    div-float/2addr v0, v3

    iget-object v3, p0, Landroidx/core/widget/NestedScrollView;->E:Landroid/widget/EdgeEffect;

    invoke-static {v3, v2, v1}, Luf/c0;->e0(Landroid/widget/EdgeEffect;FF)F

    move-result v1

    mul-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v0

    if-eq v0, p1, :cond_0

    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->finish()V

    :cond_0
    sub-int/2addr p1, v0

    return p1

    :cond_1
    if-gez p1, :cond_3

    iget-object v4, p0, Landroidx/core/widget/NestedScrollView;->F:Landroid/widget/EdgeEffect;

    invoke-static {v4}, Luf/c0;->R(Landroid/widget/EdgeEffect;)F

    move-result v4

    cmpl-float v2, v4, v2

    if-eqz v2, :cond_3

    int-to-float v2, p1

    mul-float/2addr v2, v3

    int-to-float v0, v0

    div-float/2addr v2, v0

    div-float/2addr v0, v3

    iget-object v3, p0, Landroidx/core/widget/NestedScrollView;->F:Landroid/widget/EdgeEffect;

    invoke-static {v3, v2, v1}, Luf/c0;->e0(Landroid/widget/EdgeEffect;FF)F

    move-result v1

    mul-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v0

    if-eq v0, p1, :cond_2

    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->F:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->finish()V

    :cond_2
    sub-int/2addr p1, v0

    :cond_3
    return p1
.end method

.method public k(II[I[II)Z
    .locals 6

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->b0:Lh5/q;

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lh5/q;->c(II[I[II)Z

    move-result p1

    return p1
.end method

.method public l(IIII[II[I)V
    .locals 8

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->b0:Lh5/q;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    move v6, p6

    move-object v7, p7

    invoke-virtual/range {v0 .. v7}, Lh5/q;->d(IIII[II[I)Z

    return-void
.end method

.method public m(Landroid/view/KeyEvent;)Z
    .locals 5

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/16 v1, 0x82

    const/4 v2, 0x0

    if-lez v0, :cond_b

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    check-cast v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iget v4, v3, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    add-int/2addr v0, v4

    iget v3, v3, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v3

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    if-le v0, v3, :cond_b

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v3, 0x13

    const/16 v4, 0x21

    if-eq v0, v3, :cond_8

    const/16 v3, 0x14

    if-eq v0, v3, :cond_6

    const/16 v3, 0x3e

    if-eq v0, v3, :cond_4

    const/16 p1, 0x5c

    if-eq v0, p1, :cond_3

    const/16 p1, 0x5d

    if-eq v0, p1, :cond_2

    const/16 p1, 0x7a

    if-eq v0, p1, :cond_1

    const/16 p1, 0x7b

    if-eq v0, p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v1}, Landroidx/core/widget/NestedScrollView;->v(I)Z

    return v2

    :cond_1
    invoke-virtual {p0, v4}, Landroidx/core/widget/NestedScrollView;->v(I)Z

    return v2

    :cond_2
    invoke-virtual {p0, v1}, Landroidx/core/widget/NestedScrollView;->o(I)Z

    move-result p1

    return p1

    :cond_3
    invoke-virtual {p0, v4}, Landroidx/core/widget/NestedScrollView;->o(I)Z

    move-result p1

    return p1

    :cond_4
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isShiftPressed()Z

    move-result p1

    if-eqz p1, :cond_5

    move v1, v4

    :cond_5
    invoke-virtual {p0, v1}, Landroidx/core/widget/NestedScrollView;->v(I)Z

    return v2

    :cond_6
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isAltPressed()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p0, v1}, Landroidx/core/widget/NestedScrollView;->o(I)Z

    move-result p1

    return p1

    :cond_7
    invoke-virtual {p0, v1}, Landroidx/core/widget/NestedScrollView;->e(I)Z

    move-result p1

    return p1

    :cond_8
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isAltPressed()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {p0, v4}, Landroidx/core/widget/NestedScrollView;->o(I)Z

    move-result p1

    return p1

    :cond_9
    invoke-virtual {p0, v4}, Landroidx/core/widget/NestedScrollView;->e(I)Z

    move-result p1

    return p1

    :cond_a
    :goto_0
    return v2

    :cond_b
    invoke-virtual {p0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_d

    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object p1

    if-ne p1, p0, :cond_c

    const/4 p1, 0x0

    :cond_c
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v0

    invoke-virtual {v0, p0, p1, v1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_d

    if-eq p1, p0, :cond_d

    invoke-virtual {p1, v1}, Landroid/view/View;->requestFocus(I)Z

    move-result p1

    if-eqz p1, :cond_d

    const/4 p1, 0x1

    return p1

    :cond_d
    return v2
.end method

.method public measureChild(Landroid/view/View;II)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    add-int/2addr v1, v0

    iget p3, p3, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static {p2, v1, p3}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result p2

    const/4 p3, 0x0

    invoke-static {p3, p3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V

    return-void
.end method

.method public measureChildWithMargins(Landroid/view/View;IIII)V
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p4

    check-cast p4, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result p5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    add-int/2addr v0, p5

    iget p5, p4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v0, p5

    iget p5, p4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v0, p5

    add-int/2addr v0, p3

    iget p3, p4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {p2, v0, p3}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result p2

    iget p3, p4, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget p4, p4, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr p3, p4

    const/4 p4, 0x0

    invoke-static {p3, p4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Landroid/view/View;->measure(II)V

    return-void
.end method

.method public n(I)V
    .locals 12

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v1, p0, Landroidx/core/widget/NestedScrollView;->z:Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v3

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/high16 v8, -0x80000000

    const v9, 0x7fffffff

    move v5, p1

    invoke-virtual/range {v1 .. v11}, Landroid/widget/OverScroller;->fling(IIIIIIIIII)V

    const/4 p1, 0x1

    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1}, Landroidx/core/widget/NestedScrollView;->D(II)Z

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p1

    iput p1, p0, Landroidx/core/widget/NestedScrollView;->V:I

    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    invoke-static {}, Lb5/b;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->z:Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/widget/OverScroller;->getCurrVelocity()F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    invoke-static {p0, p1}, Lj5/a;->a(Landroidx/core/widget/NestedScrollView;F)V

    :cond_0
    return-void
.end method

.method public o(I)Z
    .locals 5

    const/16 v0, 0x82

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p1, v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    iget-object v4, p0, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    iput v1, v4, Landroid/graphics/Rect;->top:I

    iput v3, v4, Landroid/graphics/Rect;->bottom:I

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_1

    sub-int/2addr v0, v2

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v2, p0, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    iget v1, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    add-int/2addr v1, v0

    iput v1, v2, Landroid/graphics/Rect;->bottom:I

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v1, v3

    iput v1, v0, Landroid/graphics/Rect;->top:I

    :cond_1
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->top:I

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p0, p1, v1, v0}, Landroidx/core/widget/NestedScrollView;->w(III)Z

    move-result p1

    return p1
.end method

.method public onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->I:Z

    return-void
.end method

.method public onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_2e

    iget-boolean v2, v0, Landroidx/core/widget/NestedScrollView;->K:Z

    if-nez v2, :cond_2e

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getSource()I

    move-result v2

    const/4 v3, 0x2

    and-int/2addr v2, v3

    const/high16 v5, 0x400000

    const/4 v6, 0x0

    const/16 v7, 0x1a

    if-ne v2, v3, :cond_0

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v8

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    move-result v9

    float-to-int v9, v9

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getSource()I

    move-result v2

    and-int/2addr v2, v5

    if-ne v2, v5, :cond_1

    invoke-virtual {v1, v7}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v8

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v2

    div-int/lit8 v9, v2, 0x2

    move v2, v7

    goto :goto_0

    :cond_1
    move v8, v6

    const/4 v2, 0x0

    const/4 v9, 0x0

    :goto_0
    cmpl-float v10, v8, v6

    if-eqz v10, :cond_2e

    invoke-virtual {v0}, Landroidx/core/widget/NestedScrollView;->getVerticalScrollFactorCompat()F

    move-result v10

    mul-float/2addr v10, v8

    float-to-int v8, v10

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getSource()I

    move-result v10

    const/16 v11, 0x2002

    and-int/2addr v10, v11

    const/4 v12, 0x1

    if-ne v10, v11, :cond_2

    move v10, v12

    goto :goto_1

    :cond_2
    const/4 v10, 0x0

    :goto_1
    neg-int v8, v8

    invoke-virtual {v0, v8, v9, v12, v10}, Landroidx/core/widget/NestedScrollView;->x(IIIZ)I

    if-eqz v2, :cond_2c

    iget-object v8, v0, Landroidx/core/widget/NestedScrollView;->f0:Lh5/g;

    iget-object v9, v8, Lh5/g;->b:Ll5/f;

    iget-object v9, v9, Ll5/f;->a:Landroidx/core/widget/NestedScrollView;

    iget-object v10, v8, Lh5/g;->h:[I

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getSource()I

    move-result v11

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v13

    iget v14, v8, Lh5/g;->f:I

    const/16 v15, 0x22

    move/from16 v16, v12

    if-ne v14, v11, :cond_4

    iget v14, v8, Lh5/g;->g:I

    if-ne v14, v13, :cond_4

    iget v14, v8, Lh5/g;->e:I

    if-eq v14, v2, :cond_3

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    const/16 v19, 0x0

    goto/16 :goto_9

    :cond_4
    :goto_2
    iget-object v14, v8, Lh5/g;->a:Landroid/content/Context;

    invoke-static {v14}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v3

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v6

    const/16 v19, 0x0

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getSource()I

    move-result v4

    sget v12, Landroid/os/Build$VERSION;->SDK_INT:I

    const-string v7, "android"

    const-string v5, "dimen"

    const/4 v0, -0x1

    if-lt v12, v15, :cond_5

    invoke-static {v3, v6, v2, v4}, Lb3/g1;->j(Landroid/view/ViewConfiguration;III)I

    move-result v4

    goto :goto_5

    :cond_5
    invoke-static {v6}, Landroid/view/InputDevice;->getDevice(I)Landroid/view/InputDevice;

    move-result-object v6

    if-eqz v6, :cond_8

    invoke-virtual {v6, v2, v4}, Landroid/view/InputDevice;->getMotionRange(II)Landroid/view/InputDevice$MotionRange;

    move-result-object v6

    if-eqz v6, :cond_8

    invoke-virtual {v14}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const/high16 v15, 0x400000

    if-ne v4, v15, :cond_6

    const/16 v4, 0x1a

    if-ne v2, v4, :cond_6

    const-string v4, "config_viewMinRotaryEncoderFlingVelocity"

    invoke-virtual {v6, v4, v5, v7}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    goto :goto_3

    :cond_6
    move v4, v0

    :goto_3
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-eq v4, v0, :cond_7

    if-eqz v4, :cond_8

    invoke-virtual {v6, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    if-gez v4, :cond_9

    goto :goto_4

    :cond_7
    invoke-virtual {v3}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v4

    goto :goto_5

    :cond_8
    :goto_4
    const v4, 0x7fffffff

    :cond_9
    :goto_5
    aput v4, v10, v19

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result v4

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getSource()I

    move-result v6

    const/16 v15, 0x22

    if-lt v12, v15, :cond_a

    invoke-static {v3, v4, v2, v6}, Lb3/g1;->i(Landroid/view/ViewConfiguration;III)I

    move-result v0

    goto :goto_8

    :cond_a
    invoke-static {v4}, Landroid/view/InputDevice;->getDevice(I)Landroid/view/InputDevice;

    move-result-object v4

    const/high16 v12, -0x80000000

    if-eqz v4, :cond_d

    invoke-virtual {v4, v2, v6}, Landroid/view/InputDevice;->getMotionRange(II)Landroid/view/InputDevice$MotionRange;

    move-result-object v4

    if-eqz v4, :cond_d

    invoke-virtual {v14}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const/high16 v15, 0x400000

    if-ne v6, v15, :cond_b

    const/16 v6, 0x1a

    if-ne v2, v6, :cond_b

    const-string v6, "config_viewMaxRotaryEncoderFlingVelocity"

    invoke-virtual {v4, v6, v5, v7}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v5

    goto :goto_6

    :cond_b
    move v5, v0

    :goto_6
    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-eq v5, v0, :cond_c

    if-eqz v5, :cond_d

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    if-gez v0, :cond_e

    goto :goto_7

    :cond_c
    invoke-virtual {v3}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v0

    goto :goto_8

    :cond_d
    :goto_7
    move v0, v12

    :cond_e
    :goto_8
    aput v0, v10, v16

    iput v11, v8, Lh5/g;->f:I

    iput v13, v8, Lh5/g;->g:I

    iput v2, v8, Lh5/g;->e:I

    move/from16 v4, v16

    :goto_9
    aget v0, v10, v19

    const v3, 0x7fffffff

    if-ne v0, v3, :cond_f

    iget-object v0, v8, Lh5/g;->c:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_2d

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v0, 0x0

    iput-object v0, v8, Lh5/g;->c:Landroid/view/VelocityTracker;

    return v16

    :cond_f
    iget-object v0, v8, Lh5/g;->c:Landroid/view/VelocityTracker;

    if-nez v0, :cond_10

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, v8, Lh5/g;->c:Landroid/view/VelocityTracker;

    :cond_10
    iget-object v0, v8, Lh5/g;->c:Landroid/view/VelocityTracker;

    sget-object v3, Lh5/a0;->a:Ljava/util/Map;

    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x14

    const/16 v15, 0x22

    if-lt v3, v15, :cond_11

    goto :goto_a

    :cond_11
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getSource()I

    move-result v3

    const/high16 v15, 0x400000

    if-ne v3, v15, :cond_15

    sget-object v3, Lh5/a0;->a:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_12

    new-instance v6, Lh5/b0;

    invoke-direct {v6}, Lh5/b0;-><init>()V

    invoke-interface {v3, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_12
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh5/b0;

    iget-object v6, v3, Lh5/b0;->b:[J

    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v11

    iget v7, v3, Lh5/b0;->d:I

    if-eqz v7, :cond_13

    iget v7, v3, Lh5/b0;->e:I

    aget-wide v13, v6, v7

    sub-long v13, v11, v13

    const-wide/16 v22, 0x28

    cmp-long v7, v13, v22

    if-lez v7, :cond_13

    move/from16 v7, v19

    iput v7, v3, Lh5/b0;->d:I

    const/4 v7, 0x0

    iput v7, v3, Lh5/b0;->c:F

    :cond_13
    iget v7, v3, Lh5/b0;->e:I

    add-int/lit8 v7, v7, 0x1

    rem-int/2addr v7, v5

    iput v7, v3, Lh5/b0;->e:I

    iget v13, v3, Lh5/b0;->d:I

    if-eq v13, v5, :cond_14

    add-int/lit8 v13, v13, 0x1

    iput v13, v3, Lh5/b0;->d:I

    :cond_14
    iget-object v13, v3, Lh5/b0;->a:[F

    const/16 v14, 0x1a

    invoke-virtual {v1, v14}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result v1

    aput v1, v13, v7

    iget v1, v3, Lh5/b0;->e:I

    aput-wide v11, v6, v1

    :cond_15
    :goto_a
    const/16 v1, 0x3e8

    const v3, 0x7f7fffff    # Float.MAX_VALUE

    invoke-virtual {v0, v1, v3}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    sget-object v6, Lh5/a0;->a:Ljava/util/Map;

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lh5/b0;

    if-eqz v6, :cond_21

    iget-object v7, v6, Lh5/b0;->a:[F

    iget-object v11, v6, Lh5/b0;->b:[J

    iget v12, v6, Lh5/b0;->d:I

    const/4 v13, 0x2

    if-ge v12, v13, :cond_16

    :goto_b
    move/from16 v25, v2

    move/from16 p1, v3

    move v2, v1

    const/4 v1, 0x0

    goto/16 :goto_f

    :cond_16
    iget v13, v6, Lh5/b0;->e:I

    add-int/lit8 v14, v13, 0x14

    add-int/lit8 v12, v12, -0x1

    sub-int/2addr v14, v12

    rem-int/2addr v14, v5

    aget-wide v12, v11, v13

    :goto_c
    aget-wide v22, v11, v14

    sub-long v24, v12, v22

    const-wide/16 v26, 0x64

    cmp-long v15, v24, v26

    if-lez v15, :cond_17

    iget v15, v6, Lh5/b0;->d:I

    add-int/lit8 v15, v15, -0x1

    iput v15, v6, Lh5/b0;->d:I

    add-int/lit8 v14, v14, 0x1

    rem-int/2addr v14, v5

    goto :goto_c

    :cond_17
    iget v12, v6, Lh5/b0;->d:I

    const/4 v13, 0x2

    if-ge v12, v13, :cond_18

    goto :goto_b

    :cond_18
    if-ne v12, v13, :cond_1a

    add-int/lit8 v14, v14, 0x1

    rem-int/2addr v14, v5

    aget-wide v11, v11, v14

    cmp-long v5, v22, v11

    if-nez v5, :cond_19

    goto :goto_b

    :cond_19
    aget v5, v7, v14

    sub-long v11, v11, v22

    long-to-float v7, v11

    div-float/2addr v5, v7

    move/from16 v25, v2

    move/from16 p1, v3

    move v2, v1

    move v1, v5

    goto/16 :goto_f

    :cond_1a
    move/from16 p1, v3

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    :goto_d
    iget v3, v6, Lh5/b0;->d:I

    add-int/lit8 v3, v3, -0x1

    const/high16 v17, 0x40000000    # 2.0f

    const/high16 v20, 0x3f800000    # 1.0f

    const/high16 v21, -0x40800000    # -1.0f

    if-ge v13, v3, :cond_1e

    add-int v3, v13, v14

    rem-int/lit8 v22, v3, 0x14

    aget-wide v22, v11, v22

    add-int/lit8 v3, v3, 0x1

    rem-int/2addr v3, v5

    aget-wide v24, v11, v3

    cmp-long v24, v24, v22

    if-nez v24, :cond_1b

    move/from16 v25, v2

    goto :goto_e

    :cond_1b
    add-int/lit8 v15, v15, 0x1

    const/16 v18, 0x0

    cmpg-float v24, v12, v18

    if-gez v24, :cond_1c

    move/from16 v20, v21

    :cond_1c
    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    move-result v21

    mul-float v5, v21, v17

    move/from16 v25, v2

    float-to-double v1, v5

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float v20, v20, v1

    aget v1, v7, v3

    aget-wide v2, v11, v3

    sub-long v2, v2, v22

    long-to-float v2, v2

    div-float/2addr v1, v2

    sub-float v2, v1, v20

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    mul-float/2addr v1, v2

    add-float/2addr v1, v12

    move/from16 v2, v16

    if-ne v15, v2, :cond_1d

    const/high16 v2, 0x3f000000    # 0.5f

    mul-float/2addr v1, v2

    :cond_1d
    move v12, v1

    :goto_e
    add-int/lit8 v13, v13, 0x1

    move/from16 v2, v25

    const/16 v1, 0x3e8

    const/16 v5, 0x14

    const/16 v16, 0x1

    goto :goto_d

    :cond_1e
    move/from16 v25, v2

    const/16 v18, 0x0

    cmpg-float v1, v12, v18

    if-gez v1, :cond_1f

    move/from16 v20, v21

    :cond_1f
    invoke-static {v12}, Ljava/lang/Math;->abs(F)F

    move-result v1

    mul-float v1, v1, v17

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float v1, v1, v20

    const/16 v2, 0x3e8

    :goto_f
    int-to-float v2, v2

    mul-float/2addr v1, v2

    iput v1, v6, Lh5/b0;->c:F

    invoke-static/range {p1 .. p1}, Ljava/lang/Math;->abs(F)F

    move-result v2

    neg-float v2, v2

    cmpg-float v1, v1, v2

    if-gez v1, :cond_20

    invoke-static/range {p1 .. p1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    neg-float v1, v1

    iput v1, v6, Lh5/b0;->c:F

    goto :goto_10

    :cond_20
    iget v1, v6, Lh5/b0;->c:F

    invoke-static/range {p1 .. p1}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpl-float v1, v1, v2

    if-lez v1, :cond_22

    invoke-static/range {p1 .. p1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    iput v1, v6, Lh5/b0;->c:F

    goto :goto_10

    :cond_21
    move/from16 v25, v2

    :cond_22
    :goto_10
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v15, 0x22

    if-lt v1, v15, :cond_23

    move/from16 v2, v25

    invoke-static {v0, v2}, Lb3/g1;->e(Landroid/view/VelocityTracker;I)F

    move-result v0

    goto :goto_12

    :cond_23
    move/from16 v2, v25

    if-nez v2, :cond_24

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result v0

    goto :goto_12

    :cond_24
    const/4 v1, 0x1

    if-ne v2, v1, :cond_25

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v0

    goto :goto_12

    :cond_25
    sget-object v1, Lh5/a0;->a:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lh5/b0;

    if-eqz v0, :cond_27

    const/16 v14, 0x1a

    if-eq v2, v14, :cond_26

    goto :goto_11

    :cond_26
    iget v0, v0, Lh5/b0;->c:F

    goto :goto_12

    :cond_27
    :goto_11
    const/4 v0, 0x0

    :goto_12
    invoke-virtual {v9}, Landroidx/core/widget/NestedScrollView;->getVerticalScrollFactorCompat()F

    move-result v1

    neg-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    move-result v1

    if-nez v4, :cond_28

    iget v2, v8, Lh5/g;->d:F

    invoke-static {v2}, Ljava/lang/Math;->signum(F)F

    move-result v2

    cmpl-float v2, v1, v2

    if-eqz v2, :cond_29

    const/16 v18, 0x0

    cmpl-float v1, v1, v18

    if-eqz v1, :cond_29

    :cond_28
    invoke-static {v9}, Landroidx/core/widget/NestedScrollView;->a(Landroidx/core/widget/NestedScrollView;)Landroid/widget/OverScroller;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/OverScroller;->abortAnimation()V

    :cond_29
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v1

    const/16 v19, 0x0

    aget v2, v10, v19

    int-to-float v2, v2

    cmpg-float v1, v1, v2

    if-gez v1, :cond_2a

    const/16 v16, 0x1

    goto :goto_14

    :cond_2a
    const/16 v16, 0x1

    aget v1, v10, v16

    neg-int v2, v1

    int-to-float v2, v2

    int-to-float v1, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    const/16 v18, 0x0

    cmpl-float v1, v0, v18

    if-nez v1, :cond_2b

    move/from16 v6, v18

    goto :goto_13

    :cond_2b
    invoke-static {v9}, Landroidx/core/widget/NestedScrollView;->a(Landroidx/core/widget/NestedScrollView;)Landroid/widget/OverScroller;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/OverScroller;->abortAnimation()V

    float-to-int v1, v0

    invoke-virtual {v9, v1}, Landroidx/core/widget/NestedScrollView;->n(I)V

    move v6, v0

    :goto_13
    iput v6, v8, Lh5/g;->d:F

    const/16 v16, 0x1

    return v16

    :cond_2c
    move/from16 v16, v12

    :cond_2d
    :goto_14
    return v16

    :cond_2e
    const/16 v19, 0x0

    return v19
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 12

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    iget-boolean v3, p0, Landroidx/core/widget/NestedScrollView;->K:Z

    if-eqz v3, :cond_0

    return v1

    :cond_0
    and-int/lit16 v0, v0, 0xff

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v0, :cond_9

    const/4 v5, -0x1

    if-eq v0, v1, :cond_6

    if-eq v0, v2, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_6

    const/4 v1, 0x6

    if-eq v0, v1, :cond_1

    goto/16 :goto_3

    :cond_1
    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->t(Landroid/view/MotionEvent;)V

    goto/16 :goto_3

    :cond_2
    iget v0, p0, Landroidx/core/widget/NestedScrollView;->R:I

    if-ne v0, v5, :cond_3

    goto/16 :goto_3

    :cond_3
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v3

    if-ne v3, v5, :cond_4

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Invalid pointerId="

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " in onInterceptTouchEvent"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "NestedScrollView"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_3

    :cond_4
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    float-to-int v0, v0

    iget v3, p0, Landroidx/core/widget/NestedScrollView;->G:I

    sub-int v3, v0, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    iget v5, p0, Landroidx/core/widget/NestedScrollView;->O:I

    if-le v3, v5, :cond_10

    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->getNestedScrollAxes()I

    move-result v3

    and-int/2addr v2, v3

    if-nez v2, :cond_10

    iput-boolean v1, p0, Landroidx/core/widget/NestedScrollView;->K:Z

    iput v0, p0, Landroidx/core/widget/NestedScrollView;->G:I

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->L:Landroid/view/VelocityTracker;

    if-nez v0, :cond_5

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Landroidx/core/widget/NestedScrollView;->L:Landroid/view/VelocityTracker;

    :cond_5
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->L:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    iput v4, p0, Landroidx/core/widget/NestedScrollView;->U:I

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_10

    invoke-interface {p1, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    goto/16 :goto_3

    :cond_6
    iput-boolean v4, p0, Landroidx/core/widget/NestedScrollView;->K:Z

    iput v5, p0, Landroidx/core/widget/NestedScrollView;->R:I

    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->L:Landroid/view/VelocityTracker;

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->recycle()V

    iput-object v3, p0, Landroidx/core/widget/NestedScrollView;->L:Landroid/view/VelocityTracker;

    :cond_7
    iget-object v5, p0, Landroidx/core/widget/NestedScrollView;->z:Landroid/widget/OverScroller;

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v6

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v7

    const/4 v10, 0x0

    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I

    move-result v11

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {v5 .. v11}, Landroid/widget/OverScroller;->springBack(IIIIII)Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    :cond_8
    invoke-virtual {p0, v4}, Landroidx/core/widget/NestedScrollView;->F(I)V

    goto/16 :goto_3

    :cond_9
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    float-to-int v5, v5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    if-lez v6, :cond_d

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v6

    invoke-virtual {p0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    move-result v8

    sub-int/2addr v8, v6

    if-lt v0, v8, :cond_d

    invoke-virtual {v7}, Landroid/view/View;->getBottom()I

    move-result v8

    sub-int/2addr v8, v6

    if-ge v0, v8, :cond_d

    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    move-result v6

    if-lt v5, v6, :cond_d

    invoke-virtual {v7}, Landroid/view/View;->getRight()I

    move-result v6

    if-ge v5, v6, :cond_d

    iput v0, p0, Landroidx/core/widget/NestedScrollView;->G:I

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Landroidx/core/widget/NestedScrollView;->R:I

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->L:Landroid/view/VelocityTracker;

    if-nez v0, :cond_a

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Landroidx/core/widget/NestedScrollView;->L:Landroid/view/VelocityTracker;

    goto :goto_0

    :cond_a
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    :goto_0
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->L:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->z:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->E(Landroid/view/MotionEvent;)Z

    move-result p1

    if-nez p1, :cond_c

    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->z:Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/widget/OverScroller;->isFinished()Z

    move-result p1

    if-nez p1, :cond_b

    goto :goto_1

    :cond_b
    move v1, v4

    :cond_c
    :goto_1
    iput-boolean v1, p0, Landroidx/core/widget/NestedScrollView;->K:Z

    invoke-virtual {p0, v2, v4}, Landroidx/core/widget/NestedScrollView;->D(II)Z

    goto :goto_3

    :cond_d
    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->E(Landroid/view/MotionEvent;)Z

    move-result p1

    if-nez p1, :cond_f

    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->z:Landroid/widget/OverScroller;

    invoke-virtual {p1}, Landroid/widget/OverScroller;->isFinished()Z

    move-result p1

    if-nez p1, :cond_e

    goto :goto_2

    :cond_e
    move v1, v4

    :cond_f
    :goto_2
    iput-boolean v1, p0, Landroidx/core/widget/NestedScrollView;->K:Z

    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->L:Landroid/view/VelocityTracker;

    if-eqz p1, :cond_10

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->recycle()V

    iput-object v3, p0, Landroidx/core/widget/NestedScrollView;->L:Landroid/view/VelocityTracker;

    :cond_10
    :goto_3
    iget-boolean p1, p0, Landroidx/core/widget/NestedScrollView;->K:Z

    return p1
.end method

.method public onLayout(ZIIII)V
    .locals 2

    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    move-object p1, p0

    const/4 p2, 0x0

    iput-boolean p2, p1, Landroidx/core/widget/NestedScrollView;->H:Z

    iget-object p4, p1, Landroidx/core/widget/NestedScrollView;->J:Landroid/view/View;

    if-eqz p4, :cond_0

    invoke-static {p4, p0}, Landroidx/core/widget/NestedScrollView;->q(Landroid/view/View;Landroidx/core/widget/NestedScrollView;)Z

    move-result p4

    if-eqz p4, :cond_0

    iget-object p4, p1, Landroidx/core/widget/NestedScrollView;->J:Landroid/view/View;

    iget-object v0, p1, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    invoke-virtual {p4, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    iget-object v0, p1, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    invoke-virtual {p0, p4, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    iget-object p4, p1, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    invoke-virtual {p0, p4}, Landroidx/core/widget/NestedScrollView;->f(Landroid/graphics/Rect;)I

    move-result p4

    if-eqz p4, :cond_0

    invoke-virtual {p0, p2, p4}, Landroid/view/View;->scrollBy(II)V

    :cond_0
    const/4 p4, 0x0

    iput-object p4, p1, Landroidx/core/widget/NestedScrollView;->J:Landroid/view/View;

    iget-boolean v0, p1, Landroidx/core/widget/NestedScrollView;->I:Z

    if-nez v0, :cond_6

    iget-object v0, p1, Landroidx/core/widget/NestedScrollView;->W:Ll5/h;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v0

    iget-object v1, p1, Landroidx/core/widget/NestedScrollView;->W:Ll5/h;

    iget v1, v1, Ll5/h;->w:I

    invoke-virtual {p0, v0, v1}, Landroidx/core/widget/NestedScrollView;->scrollTo(II)V

    iput-object p4, p1, Landroidx/core/widget/NestedScrollView;->W:Ll5/h;

    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p4

    if-lez p4, :cond_2

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p4

    invoke-virtual {p4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    move-result p4

    iget v1, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    add-int/2addr p4, v1

    iget v0, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr p4, v0

    goto :goto_0

    :cond_2
    move p4, p2

    :goto_0
    sub-int/2addr p5, p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p3

    sub-int/2addr p5, p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p3

    sub-int/2addr p5, p3

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p3

    if-ge p5, p4, :cond_5

    if-gez p3, :cond_3

    goto :goto_1

    :cond_3
    add-int p2, p5, p3

    if-le p2, p4, :cond_4

    sub-int p2, p4, p5

    goto :goto_1

    :cond_4
    move p2, p3

    :cond_5
    :goto_1
    if-eq p2, p3, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p3

    invoke-virtual {p0, p3, p2}, Landroidx/core/widget/NestedScrollView;->scrollTo(II)V

    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result p2

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p3

    invoke-virtual {p0, p2, p3}, Landroidx/core/widget/NestedScrollView;->scrollTo(II)V

    const/4 p2, 0x1

    iput-boolean p2, p1, Landroidx/core/widget/NestedScrollView;->I:Z

    return-void
.end method

.method public onMeasure(II)V
    .locals 4

    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    iget-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->M:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-lez p2, :cond_2

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    iget v3, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    sub-int/2addr v2, v3

    iget v3, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    sub-int/2addr v2, v3

    if-ge v1, v2, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v3

    add-int/2addr v3, v1

    iget v1, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    add-int/2addr v3, v1

    iget v1, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    add-int/2addr v3, v1

    iget v0, v0, Landroid/widget/FrameLayout$LayoutParams;->width:I

    invoke-static {p1, v3, v0}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I

    move-result p1

    const/high16 v0, 0x40000000    # 2.0f

    invoke-static {v2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p2, p1, v0}, Landroid/view/View;->measure(II)V

    :cond_2
    :goto_0
    return-void
.end method

.method public onNestedFling(Landroid/view/View;FFZ)Z
    .locals 0

    if-nez p4, :cond_0

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p3, p2}, Landroidx/core/widget/NestedScrollView;->dispatchNestedFling(FFZ)Z

    float-to-int p1, p3

    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->n(I)V

    return p2

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onNestedPreFling(Landroid/view/View;FF)Z
    .locals 0

    invoke-virtual {p0, p2, p3}, Landroidx/core/widget/NestedScrollView;->dispatchNestedPreFling(FF)Z

    move-result p1

    return p1
.end method

.method public onNestedPreScroll(Landroid/view/View;II[I)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    invoke-virtual/range {v0 .. v5}, Landroidx/core/widget/NestedScrollView;->d(Landroid/view/View;II[II)V

    return-void
.end method

.method public onNestedScroll(Landroid/view/View;IIII)V
    .locals 0

    const/4 p1, 0x0

    const/4 p2, 0x0

    invoke-virtual {p0, p5, p1, p2}, Landroidx/core/widget/NestedScrollView;->s(II[I)V

    return-void
.end method

.method public onNestedScrollAccepted(Landroid/view/View;Landroid/view/View;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/core/widget/NestedScrollView;->b(Landroid/view/View;Landroid/view/View;II)V

    return-void
.end method

.method public onOverScrolled(IIZZ)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/view/View;->scrollTo(II)V

    return-void
.end method

.method public onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z
    .locals 3

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const/16 p1, 0x82

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    const/16 p1, 0x21

    :cond_1
    :goto_0
    if-nez p2, :cond_2

    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    goto :goto_1

    :cond_2
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v0

    invoke-virtual {v0, p0, p2, p1}, Landroid/view/FocusFinder;->findNextFocusFromRect(Landroid/view/ViewGroup;Landroid/graphics/Rect;I)Landroid/view/View;

    move-result-object v0

    :goto_1
    const/4 v1, 0x0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    invoke-virtual {p0, v0, v1, v2}, Landroidx/core/widget/NestedScrollView;->r(Landroid/view/View;II)Z

    move-result v2

    if-nez v2, :cond_4

    :goto_2
    return v1

    :cond_4
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result p1

    return p1
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, Ll5/h;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_0
    check-cast p1, Ll5/h;

    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iput-object p1, p0, Landroidx/core/widget/NestedScrollView;->W:Ll5/h;

    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->requestLayout()V

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Ll5/h;

    invoke-direct {v1, v0}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    iput v0, v1, Ll5/h;->w:I

    return-object v1
.end method

.method public onScrollChanged(IIII)V
    .locals 7

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onScrollChanged(IIII)V

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->d0:Ll5/g;

    if-eqz v0, :cond_0

    check-cast v0, Lhn/p;

    iget-object v0, v0, Lhn/p;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;

    move-object v2, p0

    move v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    invoke-static/range {v1 .. v6}, Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;->b(Lio/getstream/chat/android/ui/widgets/NestedScrollViewPaginationHelper;Landroidx/core/widget/NestedScrollView;IIII)V

    :cond_0
    return-void
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    invoke-virtual {p0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2, p4}, Landroidx/core/widget/NestedScrollView;->r(Landroid/view/View;II)Z

    move-result p3

    if-eqz p3, :cond_2

    iget-object p3, p0, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    invoke-virtual {p1, p3}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    iget-object p3, p0, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    invoke-virtual {p0, p1, p3}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    invoke-virtual {p0, p1}, Landroidx/core/widget/NestedScrollView;->f(Landroid/graphics/Rect;)I

    move-result p1

    if-eqz p1, :cond_2

    iget-boolean p3, p0, Landroidx/core/widget/NestedScrollView;->N:Z

    if-eqz p3, :cond_1

    invoke-virtual {p0, p2, p1}, Landroidx/core/widget/NestedScrollView;->z(II)V

    return-void

    :cond_1
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->scrollBy(II)V

    :cond_2
    :goto_0
    return-void
.end method

.method public onStartNestedScroll(Landroid/view/View;Landroid/view/View;I)Z
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/core/widget/NestedScrollView;->i(Landroid/view/View;Landroid/view/View;II)Z

    move-result p1

    return p1
.end method

.method public onStopNestedScroll(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/core/widget/NestedScrollView;->c(Landroid/view/View;I)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Landroidx/core/widget/NestedScrollView;->L:Landroid/view/VelocityTracker;

    if-nez v2, :cond_0

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v2

    iput-object v2, v0, Landroidx/core/widget/NestedScrollView;->L:Landroid/view/VelocityTracker;

    :cond_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    iput v3, v0, Landroidx/core/widget/NestedScrollView;->U:I

    :cond_1
    invoke-static {v1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v4

    iget v5, v0, Landroidx/core/widget/NestedScrollView;->U:I

    int-to-float v5, v5

    const/4 v6, 0x0

    invoke-virtual {v4, v6, v5}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    const/4 v5, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_18

    const/4 v8, 0x0

    const/4 v9, -0x1

    if-eq v2, v7, :cond_10

    if-eq v2, v5, :cond_7

    const/4 v5, 0x3

    if-eq v2, v5, :cond_4

    const/4 v3, 0x5

    if-eq v2, v3, :cond_3

    const/4 v3, 0x6

    if-eq v2, v3, :cond_2

    goto/16 :goto_4

    :cond_2
    invoke-virtual/range {p0 .. p1}, Landroidx/core/widget/NestedScrollView;->t(Landroid/view/MotionEvent;)V

    iget v2, v0, Landroidx/core/widget/NestedScrollView;->R:I

    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    float-to-int v1, v1

    iput v1, v0, Landroidx/core/widget/NestedScrollView;->G:I

    goto/16 :goto_4

    :cond_3
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v3

    float-to-int v3, v3

    iput v3, v0, Landroidx/core/widget/NestedScrollView;->G:I

    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iput v1, v0, Landroidx/core/widget/NestedScrollView;->R:I

    goto/16 :goto_4

    :cond_4
    iget-boolean v1, v0, Landroidx/core/widget/NestedScrollView;->K:Z

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-lez v1, :cond_5

    iget-object v10, v0, Landroidx/core/widget/NestedScrollView;->z:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v11

    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    move-result v12

    const/4 v15, 0x0

    invoke-virtual {v0}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I

    move-result v16

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-virtual/range {v10 .. v16}, Landroid/widget/OverScroller;->springBack(IIIIII)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Landroid/view/View;->postInvalidateOnAnimation()V

    :cond_5
    iput v9, v0, Landroidx/core/widget/NestedScrollView;->R:I

    iput-boolean v3, v0, Landroidx/core/widget/NestedScrollView;->K:Z

    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->L:Landroid/view/VelocityTracker;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Landroid/view/VelocityTracker;->recycle()V

    iput-object v8, v0, Landroidx/core/widget/NestedScrollView;->L:Landroid/view/VelocityTracker;

    :cond_6
    invoke-virtual {v0, v3}, Landroidx/core/widget/NestedScrollView;->F(I)V

    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->F:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    goto/16 :goto_4

    :cond_7
    iget v2, v0, Landroidx/core/widget/NestedScrollView;->R:I

    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v2

    if-ne v2, v9, :cond_8

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid pointerId="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, v0, Landroidx/core/widget/NestedScrollView;->R:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " in onTouchEvent"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "NestedScrollView"

    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_4

    :cond_8
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v5

    float-to-int v5, v5

    iget v8, v0, Landroidx/core/widget/NestedScrollView;->G:I

    sub-int/2addr v8, v5

    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v9

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v10

    int-to-float v10, v10

    div-float/2addr v9, v10

    int-to-float v10, v8

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v11

    int-to-float v11, v11

    div-float/2addr v10, v11

    iget-object v11, v0, Landroidx/core/widget/NestedScrollView;->E:Landroid/widget/EdgeEffect;

    invoke-static {v11}, Luf/c0;->R(Landroid/widget/EdgeEffect;)F

    move-result v11

    cmpl-float v11, v11, v6

    if-eqz v11, :cond_a

    iget-object v11, v0, Landroidx/core/widget/NestedScrollView;->E:Landroid/widget/EdgeEffect;

    neg-float v10, v10

    invoke-static {v11, v10, v9}, Luf/c0;->e0(Landroid/widget/EdgeEffect;FF)F

    move-result v9

    neg-float v9, v9

    iget-object v10, v0, Landroidx/core/widget/NestedScrollView;->E:Landroid/widget/EdgeEffect;

    invoke-static {v10}, Luf/c0;->R(Landroid/widget/EdgeEffect;)F

    move-result v10

    cmpl-float v6, v10, v6

    if-nez v6, :cond_9

    iget-object v6, v0, Landroidx/core/widget/NestedScrollView;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v6}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_9
    :goto_0
    move v6, v9

    goto :goto_1

    :cond_a
    iget-object v11, v0, Landroidx/core/widget/NestedScrollView;->F:Landroid/widget/EdgeEffect;

    invoke-static {v11}, Luf/c0;->R(Landroid/widget/EdgeEffect;)F

    move-result v11

    cmpl-float v11, v11, v6

    if-eqz v11, :cond_b

    iget-object v11, v0, Landroidx/core/widget/NestedScrollView;->F:Landroid/widget/EdgeEffect;

    const/high16 v12, 0x3f800000    # 1.0f

    sub-float/2addr v12, v9

    invoke-static {v11, v10, v12}, Luf/c0;->e0(Landroid/widget/EdgeEffect;FF)F

    move-result v9

    iget-object v10, v0, Landroidx/core/widget/NestedScrollView;->F:Landroid/widget/EdgeEffect;

    invoke-static {v10}, Luf/c0;->R(Landroid/widget/EdgeEffect;)F

    move-result v10

    cmpl-float v6, v10, v6

    if-nez v6, :cond_9

    iget-object v6, v0, Landroidx/core/widget/NestedScrollView;->F:Landroid/widget/EdgeEffect;

    invoke-virtual {v6}, Landroid/widget/EdgeEffect;->onRelease()V

    goto :goto_0

    :cond_b
    :goto_1
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v9

    int-to-float v9, v9

    mul-float/2addr v6, v9

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    if-eqz v6, :cond_c

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    :cond_c
    sub-int/2addr v8, v6

    iget-boolean v6, v0, Landroidx/core/widget/NestedScrollView;->K:Z

    if-nez v6, :cond_f

    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    move-result v6

    iget v9, v0, Landroidx/core/widget/NestedScrollView;->O:I

    if-le v6, v9, :cond_f

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    if-eqz v6, :cond_d

    invoke-interface {v6, v7}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_d
    iput-boolean v7, v0, Landroidx/core/widget/NestedScrollView;->K:Z

    if-lez v8, :cond_e

    iget v6, v0, Landroidx/core/widget/NestedScrollView;->O:I

    sub-int/2addr v8, v6

    goto :goto_2

    :cond_e
    iget v6, v0, Landroidx/core/widget/NestedScrollView;->O:I

    add-int/2addr v8, v6

    :cond_f
    :goto_2
    iget-boolean v6, v0, Landroidx/core/widget/NestedScrollView;->K:Z

    if-eqz v6, :cond_1c

    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v8, v1, v3, v3}, Landroidx/core/widget/NestedScrollView;->x(IIIZ)I

    move-result v1

    sub-int/2addr v5, v1

    iput v5, v0, Landroidx/core/widget/NestedScrollView;->G:I

    iget v2, v0, Landroidx/core/widget/NestedScrollView;->U:I

    add-int/2addr v2, v1

    iput v2, v0, Landroidx/core/widget/NestedScrollView;->U:I

    goto/16 :goto_4

    :cond_10
    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->L:Landroid/view/VelocityTracker;

    iget v2, v0, Landroidx/core/widget/NestedScrollView;->Q:I

    int-to-float v2, v2

    const/16 v5, 0x3e8

    invoke-virtual {v1, v5, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    iget v2, v0, Landroidx/core/widget/NestedScrollView;->R:I

    invoke-virtual {v1, v2}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v1

    float-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v2

    iget v5, v0, Landroidx/core/widget/NestedScrollView;->P:I

    if-lt v2, v5, :cond_15

    iget-object v2, v0, Landroidx/core/widget/NestedScrollView;->E:Landroid/widget/EdgeEffect;

    invoke-static {v2}, Luf/c0;->R(Landroid/widget/EdgeEffect;)F

    move-result v2

    cmpl-float v2, v2, v6

    if-eqz v2, :cond_12

    iget-object v2, v0, Landroidx/core/widget/NestedScrollView;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v0, v2, v1}, Landroidx/core/widget/NestedScrollView;->y(Landroid/widget/EdgeEffect;I)Z

    move-result v2

    if-eqz v2, :cond_11

    iget-object v2, v0, Landroidx/core/widget/NestedScrollView;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v2, v1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_3

    :cond_11
    neg-int v1, v1

    invoke-virtual {v0, v1}, Landroidx/core/widget/NestedScrollView;->n(I)V

    goto :goto_3

    :cond_12
    iget-object v2, v0, Landroidx/core/widget/NestedScrollView;->F:Landroid/widget/EdgeEffect;

    invoke-static {v2}, Luf/c0;->R(Landroid/widget/EdgeEffect;)F

    move-result v2

    cmpl-float v2, v2, v6

    if-eqz v2, :cond_14

    iget-object v2, v0, Landroidx/core/widget/NestedScrollView;->F:Landroid/widget/EdgeEffect;

    neg-int v1, v1

    invoke-virtual {v0, v2, v1}, Landroidx/core/widget/NestedScrollView;->y(Landroid/widget/EdgeEffect;I)Z

    move-result v2

    if-eqz v2, :cond_13

    iget-object v2, v0, Landroidx/core/widget/NestedScrollView;->F:Landroid/widget/EdgeEffect;

    invoke-virtual {v2, v1}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    goto :goto_3

    :cond_13
    invoke-virtual {v0, v1}, Landroidx/core/widget/NestedScrollView;->n(I)V

    goto :goto_3

    :cond_14
    neg-int v1, v1

    int-to-float v2, v1

    invoke-virtual {v0, v6, v2}, Landroidx/core/widget/NestedScrollView;->dispatchNestedPreFling(FF)Z

    move-result v5

    if-nez v5, :cond_16

    invoke-virtual {v0, v6, v2, v7}, Landroidx/core/widget/NestedScrollView;->dispatchNestedFling(FFZ)Z

    invoke-virtual {v0, v1}, Landroidx/core/widget/NestedScrollView;->n(I)V

    goto :goto_3

    :cond_15
    iget-object v10, v0, Landroidx/core/widget/NestedScrollView;->z:Landroid/widget/OverScroller;

    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v11

    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    move-result v12

    const/4 v15, 0x0

    invoke-virtual {v0}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I

    move-result v16

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-virtual/range {v10 .. v16}, Landroid/widget/OverScroller;->springBack(IIIIII)Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-virtual {v0}, Landroid/view/View;->postInvalidateOnAnimation()V

    :cond_16
    :goto_3
    iput v9, v0, Landroidx/core/widget/NestedScrollView;->R:I

    iput-boolean v3, v0, Landroidx/core/widget/NestedScrollView;->K:Z

    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->L:Landroid/view/VelocityTracker;

    if-eqz v1, :cond_17

    invoke-virtual {v1}, Landroid/view/VelocityTracker;->recycle()V

    iput-object v8, v0, Landroidx/core/widget/NestedScrollView;->L:Landroid/view/VelocityTracker;

    :cond_17
    invoke-virtual {v0, v3}, Landroidx/core/widget/NestedScrollView;->F(I)V

    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->F:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    goto :goto_4

    :cond_18
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    if-nez v2, :cond_19

    return v3

    :cond_19
    iget-boolean v2, v0, Landroidx/core/widget/NestedScrollView;->K:Z

    if-eqz v2, :cond_1a

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-eqz v2, :cond_1a

    invoke-interface {v2, v7}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_1a
    iget-object v2, v0, Landroidx/core/widget/NestedScrollView;->z:Landroid/widget/OverScroller;

    invoke-virtual {v2}, Landroid/widget/OverScroller;->isFinished()Z

    move-result v2

    if-nez v2, :cond_1b

    iget-object v2, v0, Landroidx/core/widget/NestedScrollView;->z:Landroid/widget/OverScroller;

    invoke-virtual {v2}, Landroid/widget/OverScroller;->abortAnimation()V

    invoke-virtual {v0, v7}, Landroidx/core/widget/NestedScrollView;->F(I)V

    :cond_1b
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iput v2, v0, Landroidx/core/widget/NestedScrollView;->G:I

    iput v1, v0, Landroidx/core/widget/NestedScrollView;->R:I

    invoke-virtual {v0, v5, v3}, Landroidx/core/widget/NestedScrollView;->D(II)Z

    :cond_1c
    :goto_4
    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->L:Landroid/view/VelocityTracker;

    if-eqz v1, :cond_1d

    invoke-virtual {v1, v4}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    :cond_1d
    invoke-virtual {v4}, Landroid/view/MotionEvent;->recycle()V

    return v7
.end method

.method public p(I)Z
    .locals 1

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->b0:Lh5/q;

    invoke-virtual {v0, p1}, Lh5/q;->e(I)Landroid/view/ViewParent;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final r(Landroid/view/View;II)Z
    .locals 1

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    invoke-virtual {p0, p1, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p1, p2

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    if-lt p1, v0, :cond_0

    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->top:I

    sub-int/2addr p1, p2

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result p2

    add-int/2addr p2, p3

    if-gt p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public requestChildFocus(Landroid/view/View;Landroid/view/View;)V
    .locals 2

    iget-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->H:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    invoke-virtual {p2, v0}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    invoke-virtual {p0, p2, v0}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    invoke-virtual {p0, v0}, Landroidx/core/widget/NestedScrollView;->f(Landroid/graphics/Rect;)I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0}, Landroid/view/View;->scrollBy(II)V

    goto :goto_0

    :cond_0
    iput-object p2, p0, Landroidx/core/widget/NestedScrollView;->J:Landroid/view/View;

    :cond_1
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V

    return-void
.end method

.method public requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result p1

    sub-int/2addr v1, p1

    invoke-virtual {p2, v0, v1}, Landroid/graphics/Rect;->offset(II)V

    invoke-virtual {p0, p2}, Landroidx/core/widget/NestedScrollView;->f(Landroid/graphics/Rect;)I

    move-result p1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, p2

    :goto_0
    if-eqz v0, :cond_2

    if-eqz p3, :cond_1

    invoke-virtual {p0, p2, p1}, Landroid/view/View;->scrollBy(II)V

    return v0

    :cond_1
    invoke-virtual {p0, p2, p1}, Landroidx/core/widget/NestedScrollView;->z(II)V

    :cond_2
    return v0
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->L:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/core/widget/NestedScrollView;->L:Landroid/view/VelocityTracker;

    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    return-void
.end method

.method public requestLayout()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->H:Z

    invoke-super {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final s(II[I)V
    .locals 10

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, p1}, Landroid/view/View;->scrollBy(II)V

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    sub-int v4, v1, v0

    if-eqz p3, :cond_0

    const/4 v0, 0x1

    aget v1, p3, v0

    add-int/2addr v1, v4

    aput v1, p3, v0

    :cond_0
    sub-int v6, p1, v4

    iget-object v2, p0, Landroidx/core/widget/NestedScrollView;->b0:Lh5/q;

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v3, 0x0

    move v8, p2

    move-object v9, p3

    invoke-virtual/range {v2 .. v9}, Lh5/q;->d(IIII[II[I)Z

    return-void
.end method

.method public scrollTo(II)V
    .locals 7

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_7

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    sub-int/2addr v3, v4

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v4

    iget v5, v2, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    add-int/2addr v4, v5

    iget v5, v2, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    add-int/2addr v4, v5

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v5

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v6

    sub-int/2addr v5, v6

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v6

    sub-int/2addr v5, v6

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    iget v6, v2, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    add-int/2addr v1, v6

    iget v2, v2, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v1, v2

    if-ge v3, v4, :cond_1

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    add-int v2, v3, p1

    if-le v2, v4, :cond_2

    sub-int p1, v4, v3

    goto :goto_1

    :cond_1
    :goto_0
    move p1, v0

    :cond_2
    :goto_1
    if-ge v5, v1, :cond_4

    if-gez p2, :cond_3

    goto :goto_2

    :cond_3
    add-int v0, v5, p2

    if-le v0, v1, :cond_5

    sub-int p2, v1, v5

    goto :goto_3

    :cond_4
    :goto_2
    move p2, v0

    :cond_5
    :goto_3
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    move-result v0

    if-ne p1, v0, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v0

    if-eq p2, v0, :cond_7

    :cond_6
    invoke-super {p0, p1, p2}, Landroid/view/View;->scrollTo(II)V

    :cond_7
    return-void
.end method

.method public setFillViewport(Z)V
    .locals 1

    iget-boolean v0, p0, Landroidx/core/widget/NestedScrollView;->M:Z

    if-eq p1, v0, :cond_0

    iput-boolean p1, p0, Landroidx/core/widget/NestedScrollView;->M:Z

    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->requestLayout()V

    :cond_0
    return-void
.end method

.method public setNestedScrollingEnabled(Z)V
    .locals 3

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->b0:Lh5/q;

    iget-boolean v1, v0, Lh5/q;->d:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, Lh5/q;->c:Landroid/view/ViewGroup;

    sget-object v2, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v1}, Lh5/h0;->n(Landroid/view/View;)V

    :cond_0
    iput-boolean p1, v0, Lh5/q;->d:Z

    return-void
.end method

.method public setOnScrollChangeListener(Ll5/g;)V
    .locals 0

    iput-object p1, p0, Landroidx/core/widget/NestedScrollView;->d0:Ll5/g;

    return-void
.end method

.method public setSmoothScrollingEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/core/widget/NestedScrollView;->N:Z

    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public startNestedScroll(I)Z
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/core/widget/NestedScrollView;->D(II)Z

    move-result p1

    return p1
.end method

.method public stopNestedScroll()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/core/widget/NestedScrollView;->F(I)V

    return-void
.end method

.method public final t(Landroid/view/MotionEvent;)V
    .locals 3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v1

    iget v2, p0, Landroidx/core/widget/NestedScrollView;->R:I

    if-ne v1, v2, :cond_1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    move-result v1

    float-to-int v1, v1

    iput v1, p0, Landroidx/core/widget/NestedScrollView;->G:I

    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Landroidx/core/widget/NestedScrollView;->R:I

    iget-object p1, p0, Landroidx/core/widget/NestedScrollView;->L:Landroid/view/VelocityTracker;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/view/VelocityTracker;->clear()V

    :cond_1
    return-void
.end method

.method public u(IIIIIIIIZ)Z
    .locals 11

    invoke-virtual {p0}, Landroid/view/View;->getOverScrollMode()I

    move-result v0

    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->computeHorizontalScrollRange()I

    move-result v1

    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->computeHorizontalScrollExtent()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-le v1, v2, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->computeVerticalScrollRange()I

    move-result v2

    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->computeVerticalScrollExtent()I

    move-result v5

    if-le v2, v5, :cond_1

    move v2, v4

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    if-eqz v0, :cond_3

    if-ne v0, v4, :cond_2

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    move v1, v3

    goto :goto_3

    :cond_3
    :goto_2
    move v1, v4

    :goto_3
    if-eqz v0, :cond_5

    if-ne v0, v4, :cond_4

    if-eqz v2, :cond_4

    goto :goto_4

    :cond_4
    move v0, v3

    goto :goto_5

    :cond_5
    :goto_4
    move v0, v4

    :goto_5
    add-int v2, p3, p1

    if-nez v1, :cond_6

    move v1, v3

    goto :goto_6

    :cond_6
    move/from16 v1, p7

    :goto_6
    add-int v5, p4, p2

    if-nez v0, :cond_7

    move v0, v3

    goto :goto_7

    :cond_7
    move/from16 v0, p8

    :goto_7
    neg-int v6, v1

    add-int v1, v1, p5

    neg-int v7, v0

    add-int v0, v0, p6

    if-le v2, v1, :cond_8

    move v2, v1

    move v1, v4

    goto :goto_8

    :cond_8
    if-ge v2, v6, :cond_9

    move v1, v4

    move v2, v6

    goto :goto_8

    :cond_9
    move v1, v3

    :goto_8
    if-le v5, v0, :cond_a

    move v5, v0

    move v0, v4

    goto :goto_9

    :cond_a
    if-ge v5, v7, :cond_b

    move v0, v4

    move v5, v7

    goto :goto_9

    :cond_b
    move v0, v3

    :goto_9
    if-eqz v0, :cond_c

    invoke-virtual {p0, v4}, Landroidx/core/widget/NestedScrollView;->p(I)Z

    move-result v6

    if-nez v6, :cond_c

    iget-object v6, p0, Landroidx/core/widget/NestedScrollView;->z:Landroid/widget/OverScroller;

    const/4 v7, 0x0

    invoke-virtual {p0}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I

    move-result v8

    const/4 v9, 0x0

    const/4 v10, 0x0

    move p2, v2

    move p3, v5

    move-object p1, v6

    move/from16 p6, v7

    move/from16 p7, v8

    move p4, v9

    move/from16 p5, v10

    invoke-virtual/range {p1 .. p7}, Landroid/widget/OverScroller;->springBack(IIIIII)Z

    move v6, p2

    goto :goto_a

    :cond_c
    move v6, v2

    :goto_a
    invoke-virtual {p0, v6, v5, v1, v0}, Landroidx/core/widget/NestedScrollView;->onOverScrolled(IIZZ)V

    if-nez v1, :cond_e

    if-eqz v0, :cond_d

    goto :goto_b

    :cond_d
    return v3

    :cond_e
    :goto_b
    return v4
.end method

.method public v(I)Z
    .locals 4

    const/16 v0, 0x82

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne p1, v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v1

    add-int/2addr v1, v3

    iput v1, v0, Landroid/graphics/Rect;->top:I

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-lez v0, :cond_2

    sub-int/2addr v0, v2

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    iget v1, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    add-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    add-int/2addr v1, v0

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    iget v2, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr v2, v3

    if-le v2, v1, :cond_2

    sub-int/2addr v1, v3

    iput v1, v0, Landroid/graphics/Rect;->top:I

    goto :goto_1

    :cond_1
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    move-result v2

    sub-int/2addr v2, v3

    iput v2, v0, Landroid/graphics/Rect;->top:I

    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    iget v2, v0, Landroid/graphics/Rect;->top:I

    if-gez v2, :cond_2

    iput v1, v0, Landroid/graphics/Rect;->top:I

    :cond_2
    :goto_1
    iget-object v0, p0, Landroidx/core/widget/NestedScrollView;->y:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr v3, v1

    iput v3, v0, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p0, p1, v1, v3}, Landroidx/core/widget/NestedScrollView;->w(III)Z

    move-result p1

    return p1
.end method

.method public final w(III)Z
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    move-result v5

    add-int/2addr v4, v5

    const/16 v6, 0x21

    if-ne v1, v6, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    const/4 v9, 0x2

    invoke-virtual {v0, v9}, Landroid/view/View;->getFocusables(I)Ljava/util/ArrayList;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_1
    if-ge v12, v10, :cond_9

    invoke-interface {v9, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroid/view/View;

    invoke-virtual {v14}, Landroid/view/View;->getTop()I

    move-result v15

    invoke-virtual {v14}, Landroid/view/View;->getBottom()I

    move-result v7

    if-ge v2, v7, :cond_8

    if-ge v15, v3, :cond_8

    if-ge v2, v15, :cond_1

    if-ge v7, v3, :cond_1

    const/16 v16, 0x1

    goto :goto_2

    :cond_1
    const/16 v16, 0x0

    :goto_2
    if-nez v11, :cond_2

    move-object v11, v14

    move/from16 v13, v16

    goto :goto_5

    :cond_2
    if-eqz v6, :cond_3

    invoke-virtual {v11}, Landroid/view/View;->getTop()I

    move-result v8

    if-lt v15, v8, :cond_4

    :cond_3
    if-nez v6, :cond_5

    invoke-virtual {v11}, Landroid/view/View;->getBottom()I

    move-result v8

    if-le v7, v8, :cond_5

    :cond_4
    const/4 v7, 0x1

    goto :goto_3

    :cond_5
    const/4 v7, 0x0

    :goto_3
    if-eqz v13, :cond_6

    if-eqz v16, :cond_8

    if-eqz v7, :cond_8

    goto :goto_4

    :cond_6
    if-eqz v16, :cond_7

    move-object v11, v14

    const/4 v13, 0x1

    goto :goto_5

    :cond_7
    if-eqz v7, :cond_8

    :goto_4
    move-object v11, v14

    :cond_8
    :goto_5
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_9
    if-nez v11, :cond_a

    move-object v11, v0

    :cond_a
    if-lt v2, v5, :cond_b

    if-gt v3, v4, :cond_b

    const/4 v7, 0x0

    goto :goto_8

    :cond_b
    if-eqz v6, :cond_c

    sub-int/2addr v2, v5

    :goto_6
    const/4 v3, 0x0

    const/4 v4, 0x1

    goto :goto_7

    :cond_c
    sub-int v2, v3, v4

    goto :goto_6

    :goto_7
    invoke-virtual {v0, v2, v3, v4, v4}, Landroidx/core/widget/NestedScrollView;->x(IIIZ)I

    move v7, v4

    :goto_8
    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    move-result-object v2

    if-eq v11, v2, :cond_d

    invoke-virtual {v11, v1}, Landroid/view/View;->requestFocus(I)Z

    :cond_d
    return v7
.end method

.method public final x(IIIZ)I
    .locals 18

    move-object/from16 v0, p0

    move/from16 v10, p2

    move/from16 v5, p3

    const/4 v11, 0x1

    if-ne v5, v11, :cond_0

    const/4 v1, 0x2

    invoke-virtual {v0, v1, v5}, Landroidx/core/widget/NestedScrollView;->D(II)Z

    :cond_0
    iget-object v3, v0, Landroidx/core/widget/NestedScrollView;->T:[I

    iget-object v4, v0, Landroidx/core/widget/NestedScrollView;->S:[I

    const/4 v1, 0x0

    move/from16 v2, p1

    invoke-virtual/range {v0 .. v5}, Landroidx/core/widget/NestedScrollView;->k(II[I[II)Z

    move-result v1

    move v12, v5

    const/4 v13, 0x0

    if-eqz v1, :cond_1

    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->T:[I

    aget v1, v1, v11

    sub-int v1, p1, v1

    iget-object v2, v0, Landroidx/core/widget/NestedScrollView;->S:[I

    aget v2, v2, v11

    move v14, v2

    move v2, v1

    goto :goto_0

    :cond_1
    move/from16 v2, p1

    move v14, v13

    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    move-result v4

    invoke-virtual {v0}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I

    move-result v6

    invoke-virtual {v0}, Landroid/view/View;->getOverScrollMode()I

    move-result v1

    if-eqz v1, :cond_2

    if-ne v1, v11, :cond_3

    invoke-virtual {v0}, Landroidx/core/widget/NestedScrollView;->getScrollRange()I

    move-result v1

    if-lez v1, :cond_3

    :cond_2
    if-nez p4, :cond_3

    move v15, v11

    goto :goto_1

    :cond_3
    move v15, v13

    :goto_1
    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v9}, Landroidx/core/widget/NestedScrollView;->u(IIIIIIIIZ)Z

    move-result v1

    move v8, v2

    move v9, v4

    if-eqz v1, :cond_4

    invoke-virtual {v0, v12}, Landroidx/core/widget/NestedScrollView;->p(I)Z

    move-result v1

    if-nez v1, :cond_4

    move/from16 v16, v11

    goto :goto_2

    :cond_4
    move/from16 v16, v13

    :goto_2
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    move-result v1

    sub-int v2, v1, v9

    sub-int v4, v8, v2

    iget-object v7, v0, Landroidx/core/widget/NestedScrollView;->T:[I

    aput v13, v7, v11

    const/4 v3, 0x0

    iget-object v5, v0, Landroidx/core/widget/NestedScrollView;->S:[I

    const/4 v1, 0x0

    move/from16 v17, v12

    move v12, v6

    move/from16 v6, v17

    invoke-virtual/range {v0 .. v7}, Landroidx/core/widget/NestedScrollView;->l(IIII[II[I)V

    move v5, v6

    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->S:[I

    aget v1, v1, v11

    add-int/2addr v14, v1

    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->T:[I

    aget v1, v1, v11

    sub-int v2, v8, v1

    add-int v4, v9, v2

    if-gez v4, :cond_5

    if-eqz v15, :cond_6

    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->E:Landroid/widget/EdgeEffect;

    neg-int v2, v2

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    int-to-float v3, v10

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    invoke-static {v1, v2, v3}, Luf/c0;->e0(Landroid/widget/EdgeEffect;FF)F

    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->F:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->F:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    goto :goto_3

    :cond_5
    if-le v4, v12, :cond_6

    if-eqz v15, :cond_6

    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->F:Landroid/widget/EdgeEffect;

    int-to-float v2, v2

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    int-to-float v3, v10

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    div-float/2addr v3, v4

    const/high16 v4, 0x3f800000    # 1.0f

    sub-float/2addr v4, v3

    invoke-static {v1, v2, v4}, Luf/c0;->e0(Landroid/widget/EdgeEffect;FF)F

    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_6
    :goto_3
    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->F:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_4

    :cond_7
    move/from16 v13, v16

    goto :goto_5

    :cond_8
    :goto_4
    invoke-virtual {v0}, Landroid/view/View;->postInvalidateOnAnimation()V

    :goto_5
    if-eqz v13, :cond_9

    if-nez v5, :cond_9

    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->L:Landroid/view/VelocityTracker;

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Landroid/view/VelocityTracker;->clear()V

    :cond_9
    if-ne v5, v11, :cond_a

    invoke-virtual {v0, v5}, Landroidx/core/widget/NestedScrollView;->F(I)V

    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->E:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    iget-object v1, v0, Landroidx/core/widget/NestedScrollView;->F:Landroid/widget/EdgeEffect;

    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    :cond_a
    return v14
.end method

.method public final y(Landroid/widget/EdgeEffect;I)Z
    .locals 9

    const/4 v0, 0x1

    if-lez p2, :cond_0

    return v0

    :cond_0
    invoke-static {p1}, Luf/c0;->R(Landroid/widget/EdgeEffect;)F

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr p1, v1

    neg-int p2, p2

    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    int-to-float p2, p2

    const v1, 0x3eb33333    # 0.35f

    mul-float/2addr p2, v1

    iget v1, p0, Landroidx/core/widget/NestedScrollView;->w:F

    const v2, 0x3c75c28f    # 0.015f

    mul-float/2addr v1, v2

    div-float/2addr p2, v1

    float-to-double v3, p2

    invoke-static {v3, v4}, Ljava/lang/Math;->log(D)D

    move-result-wide v3

    sget p2, Landroidx/core/widget/NestedScrollView;->g0:F

    float-to-double v5, p2

    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    sub-double v7, v5, v7

    iget p2, p0, Landroidx/core/widget/NestedScrollView;->w:F

    mul-float/2addr p2, v2

    float-to-double v1, p2

    div-double/2addr v5, v7

    mul-double/2addr v5, v3

    invoke-static {v5, v6}, Ljava/lang/Math;->exp(D)D

    move-result-wide v3

    mul-double/2addr v3, v1

    double-to-float p2, v3

    cmpg-float p1, p2, p1

    if-gez p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final z(II)V
    .locals 2

    const/16 v0, 0xfa

    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, v0, v1}, Landroidx/core/widget/NestedScrollView;->A(IIIZ)V

    return-void
.end method
