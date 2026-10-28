.class public abstract Landroidx/recyclerview/widget/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final ABS_HORIZONTAL_DIR_FLAGS:I = 0xc0c0c

.field public static final DEFAULT_DRAG_ANIMATION_DURATION:I = 0xc8

.field public static final DEFAULT_SWIPE_ANIMATION_DURATION:I = 0xfa

.field private static final DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS:J = 0x7d0L

.field static final RELATIVE_DIR_FLAGS:I = 0x303030

.field private static final sDragScrollInterpolator:Landroid/view/animation/Interpolator;

.field private static final sDragViewScrollCapInterpolator:Landroid/view/animation/Interpolator;


# instance fields
.field private mCachedMaxScrollSpeed:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroidx/recyclerview/widget/l0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/l0;-><init>(I)V

    sput-object v0, Landroidx/recyclerview/widget/m0;->sDragScrollInterpolator:Landroid/view/animation/Interpolator;

    new-instance v0, Landroidx/recyclerview/widget/l0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/l0;-><init>(I)V

    sput-object v0, Landroidx/recyclerview/widget/m0;->sDragViewScrollCapInterpolator:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/recyclerview/widget/m0;->mCachedMaxScrollSpeed:I

    return-void
.end method

.method public static convertToRelativeDirection(II)I
    .locals 3

    const v0, 0xc0c0c

    and-int v1, p0, v0

    if-nez v1, :cond_0

    return p0

    :cond_0
    not-int v2, v1

    and-int/2addr p0, v2

    if-nez p1, :cond_1

    shl-int/lit8 p1, v1, 0x2

    :goto_0
    or-int/2addr p0, p1

    return p0

    :cond_1
    shl-int/lit8 p1, v1, 0x1

    const v1, -0xc0c0d

    and-int/2addr v1, p1

    or-int/2addr p0, v1

    and-int/2addr p1, v0

    shl-int/lit8 p1, p1, 0x2

    goto :goto_0
.end method

.method public static getDefaultUIUtil()Landroidx/recyclerview/widget/p0;
    .locals 1

    sget-object v0, Landroidx/recyclerview/widget/q0;->a:Landroidx/recyclerview/widget/q0;

    return-object v0
.end method

.method public static makeFlag(II)I
    .locals 0

    mul-int/lit8 p0, p0, 0x8

    shl-int p0, p1, p0

    return p0
.end method

.method public static makeMovementFlags(II)I
    .locals 2

    const/4 v0, 0x0

    or-int v1, p1, p0

    invoke-static {v0, v1}, Landroidx/recyclerview/widget/m0;->makeFlag(II)I

    move-result v0

    const/4 v1, 0x1

    invoke-static {v1, p1}, Landroidx/recyclerview/widget/m0;->makeFlag(II)I

    move-result p1

    or-int/2addr p1, v0

    const/4 v0, 0x2

    invoke-static {v0, p0}, Landroidx/recyclerview/widget/m0;->makeFlag(II)I

    move-result p0

    or-int/2addr p0, p1

    return p0
.end method


# virtual methods
.method public final canDropOver(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;Landroidx/recyclerview/widget/o2;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final chooseDropTarget(Landroidx/recyclerview/widget/o2;Ljava/util/List;II)Landroidx/recyclerview/widget/o2;
    .locals 12
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/o2;",
            "Ljava/util/List<",
            "Landroidx/recyclerview/widget/o2;",
            ">;II)",
            "Landroidx/recyclerview/widget/o2;"
        }
    .end annotation

    iget-object v0, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    add-int/2addr v0, p3

    iget-object v1, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    add-int v1, v1, p4

    iget-object v2, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v2

    sub-int v2, p3, v2

    iget-object v3, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v3

    sub-int v3, p4, v3

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, -0x1

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v4, :cond_4

    invoke-interface {p2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/recyclerview/widget/o2;

    if-lez v2, :cond_0

    iget-object v9, v8, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v9}, Landroid/view/View;->getRight()I

    move-result v9

    sub-int/2addr v9, v0

    if-gez v9, :cond_0

    iget-object v10, v8, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v10}, Landroid/view/View;->getRight()I

    move-result v10

    iget-object v11, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v11}, Landroid/view/View;->getRight()I

    move-result v11

    if-le v10, v11, :cond_0

    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    move-result v9

    if-le v9, v6, :cond_0

    move-object v5, v8

    move v6, v9

    :cond_0
    if-gez v2, :cond_1

    iget-object v9, v8, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v9}, Landroid/view/View;->getLeft()I

    move-result v9

    sub-int/2addr v9, p3

    if-lez v9, :cond_1

    iget-object v10, v8, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v10}, Landroid/view/View;->getLeft()I

    move-result v10

    iget-object v11, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v11}, Landroid/view/View;->getLeft()I

    move-result v11

    if-ge v10, v11, :cond_1

    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    move-result v9

    if-le v9, v6, :cond_1

    move-object v5, v8

    move v6, v9

    :cond_1
    if-gez v3, :cond_2

    iget-object v9, v8, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v9}, Landroid/view/View;->getTop()I

    move-result v9

    sub-int v9, v9, p4

    if-lez v9, :cond_2

    iget-object v10, v8, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v10}, Landroid/view/View;->getTop()I

    move-result v10

    iget-object v11, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v11}, Landroid/view/View;->getTop()I

    move-result v11

    if-ge v10, v11, :cond_2

    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    move-result v9

    if-le v9, v6, :cond_2

    move-object v5, v8

    move v6, v9

    :cond_2
    if-lez v3, :cond_3

    iget-object v9, v8, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v9}, Landroid/view/View;->getBottom()I

    move-result v9

    sub-int/2addr v9, v1

    if-gez v9, :cond_3

    iget-object v10, v8, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v10}, Landroid/view/View;->getBottom()I

    move-result v10

    iget-object v11, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v11}, Landroid/view/View;->getBottom()I

    move-result v11

    if-le v10, v11, :cond_3

    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    move-result v9

    if-le v9, v6, :cond_3

    move-object v5, v8

    move v6, v9

    :cond_3
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    :cond_4
    return-object v5
.end method

.method public final clearView(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;)V
    .locals 2

    iget-object p1, p2, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    const p2, 0x7f0a07ea

    invoke-virtual {p1, p2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Ljava/lang/Float;

    if-eqz v1, :cond_0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    sget-object v1, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {p1, v0}, Lh5/h0;->k(Landroid/view/View;F)V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationX(F)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationY(F)V

    return-void
.end method

.method public final convertToAbsoluteDirection(II)I
    .locals 3

    const v0, 0x303030

    and-int v1, p1, v0

    if-nez v1, :cond_0

    return p1

    :cond_0
    not-int v2, v1

    and-int/2addr p1, v2

    if-nez p2, :cond_1

    shr-int/lit8 p2, v1, 0x2

    :goto_0
    or-int/2addr p1, p2

    return p1

    :cond_1
    shr-int/lit8 p2, v1, 0x1

    const v1, -0x303031

    and-int/2addr v1, p2

    or-int/2addr p1, v1

    and-int/2addr p2, v0

    shr-int/lit8 p2, p2, 0x2

    goto :goto_0
.end method

.method public final getAbsoluteMovementFlags(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;)I
    .locals 1

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/m0;->getMovementFlags(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;)I

    move-result p2

    sget-object v0, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutDirection()I

    move-result p1

    invoke-virtual {p0, p2, p1}, Landroidx/recyclerview/widget/m0;->convertToAbsoluteDirection(II)I

    move-result p1

    return p1
.end method

.method public final getAnimationDuration(Landroidx/recyclerview/widget/RecyclerView;IFF)J
    .locals 0

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/p1;

    move-result-object p1

    const/16 p3, 0x8

    if-nez p1, :cond_1

    if-ne p2, p3, :cond_0

    const-wide/16 p1, 0xc8

    return-wide p1

    :cond_0
    const-wide/16 p1, 0xfa

    return-wide p1

    :cond_1
    if-ne p2, p3, :cond_2

    iget-wide p1, p1, Landroidx/recyclerview/widget/p1;->e:J

    return-wide p1

    :cond_2
    iget-wide p1, p1, Landroidx/recyclerview/widget/p1;->d:J

    return-wide p1
.end method

.method public final getBoundingBoxMargin()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getMoveThreshold(Landroidx/recyclerview/widget/o2;)F
    .locals 0

    const/high16 p1, 0x3f000000    # 0.5f

    return p1
.end method

.method public abstract getMovementFlags(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;)I
.end method

.method public final getSwipeEscapeVelocity(F)F
    .locals 0

    return p1
.end method

.method public final getSwipeVelocityThreshold(F)F
    .locals 0

    return p1
.end method

.method public final hasDragFlag(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;)Z
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/m0;->getAbsoluteMovementFlags(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;)I

    move-result p1

    const/high16 p2, 0xff0000

    and-int/2addr p1, p2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hasSwipeFlag(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;)Z
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/m0;->getAbsoluteMovementFlags(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;)I

    move-result p1

    const p2, 0xff00

    and-int/2addr p1, p2

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final interpolateOutOfBoundsScroll(Landroidx/recyclerview/widget/RecyclerView;IIIJ)I
    .locals 5

    iget p4, p0, Landroidx/recyclerview/widget/m0;->mCachedMaxScrollSpeed:I

    const/4 v0, -0x1

    if-ne p4, v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const p4, 0x7f0700f8

    invoke-virtual {p1, p4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/m0;->mCachedMaxScrollSpeed:I

    :cond_0
    iget p1, p0, Landroidx/recyclerview/widget/m0;->mCachedMaxScrollSpeed:I

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result p4

    int-to-float v1, p3

    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    move-result v1

    float-to-int v1, v1

    int-to-float p4, p4

    const/high16 v2, 0x3f800000    # 1.0f

    mul-float/2addr p4, v2

    int-to-float p2, p2

    div-float/2addr p4, p2

    invoke-static {v2, p4}, Ljava/lang/Math;->min(FF)F

    move-result p2

    mul-int/2addr v1, p1

    int-to-float p1, v1

    sget-object p4, Landroidx/recyclerview/widget/m0;->sDragViewScrollCapInterpolator:Landroid/view/animation/Interpolator;

    invoke-interface {p4, p2}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result p2

    mul-float/2addr p2, p1

    float-to-int p1, p2

    const-wide/16 v3, 0x7d0

    cmp-long p2, p5, v3

    if-lez p2, :cond_1

    goto :goto_0

    :cond_1
    long-to-float p2, p5

    const/high16 p4, 0x44fa0000    # 2000.0f

    div-float v2, p2, p4

    :goto_0
    int-to-float p1, p1

    sget-object p2, Landroidx/recyclerview/widget/m0;->sDragScrollInterpolator:Landroid/view/animation/Interpolator;

    invoke-interface {p2, v2}, Landroid/animation/TimeInterpolator;->getInterpolation(F)F

    move-result p2

    mul-float/2addr p2, p1

    float-to-int p1, p2

    if-nez p1, :cond_3

    if-lez p3, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    return v0

    :cond_3
    return p1
.end method

.method public final isItemViewSwipeEnabled()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final isLongPressDragEnabled()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public abstract onChildDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;FFIZ)V
.end method

.method public final onChildDrawOver(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;FFIZ)V
    .locals 0
    .param p3    # Landroidx/recyclerview/widget/o2;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param

    iget-object p1, p3, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;Ljava/util/List;IFF)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Landroidx/recyclerview/widget/RecyclerView;",
            "Landroidx/recyclerview/widget/o2;",
            "Ljava/util/List<",
            "Landroidx/recyclerview/widget/j0;",
            ">;IFF)V"
        }
    .end annotation

    invoke-interface/range {p4 .. p4}, Ljava/util/List;->size()I

    move-result v8

    const/4 v0, 0x0

    move v9, v0

    :goto_0
    if-ge v9, v8, :cond_2

    move-object/from16 v10, p4

    invoke-interface {v10, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/j0;

    iget-object v1, v0, Landroidx/recyclerview/widget/j0;->e:Landroidx/recyclerview/widget/o2;

    iget v2, v0, Landroidx/recyclerview/widget/j0;->a:F

    iget v3, v0, Landroidx/recyclerview/widget/j0;->c:F

    cmpl-float v4, v2, v3

    if-nez v4, :cond_0

    iget-object v2, v1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getTranslationX()F

    move-result v2

    iput v2, v0, Landroidx/recyclerview/widget/j0;->i:F

    goto :goto_1

    :cond_0
    iget v4, v0, Landroidx/recyclerview/widget/j0;->m:F

    invoke-static {v3, v2, v4, v2}, Lb9/y;->a(FFFF)F

    move-result v2

    iput v2, v0, Landroidx/recyclerview/widget/j0;->i:F

    :goto_1
    iget v2, v0, Landroidx/recyclerview/widget/j0;->b:F

    iget v3, v0, Landroidx/recyclerview/widget/j0;->d:F

    cmpl-float v4, v2, v3

    if-nez v4, :cond_1

    iget-object v1, v1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getTranslationY()F

    move-result v1

    iput v1, v0, Landroidx/recyclerview/widget/j0;->j:F

    goto :goto_2

    :cond_1
    iget v1, v0, Landroidx/recyclerview/widget/j0;->m:F

    invoke-static {v3, v2, v1, v2}, Lb9/y;->a(FFFF)F

    move-result v1

    iput v1, v0, Landroidx/recyclerview/widget/j0;->j:F

    :goto_2
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v11

    iget-object v3, v0, Landroidx/recyclerview/widget/j0;->e:Landroidx/recyclerview/widget/o2;

    iget v4, v0, Landroidx/recyclerview/widget/j0;->i:F

    iget v5, v0, Landroidx/recyclerview/widget/j0;->j:F

    iget v6, v0, Landroidx/recyclerview/widget/j0;->f:I

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v7}, Landroidx/recyclerview/widget/m0;->onChildDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;FFIZ)V

    invoke-virtual {p1, v11}, Landroid/graphics/Canvas;->restoreToCount(I)V

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_2
    if-eqz p3, :cond_3

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v8

    const/4 v7, 0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move/from16 v6, p5

    move/from16 v4, p6

    move/from16 v5, p7

    invoke-virtual/range {v0 .. v7}, Landroidx/recyclerview/widget/m0;->onChildDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;FFIZ)V

    invoke-virtual {p1, v8}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_3
    return-void
.end method

.method public final onDrawOver(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;Ljava/util/List;IFF)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Landroidx/recyclerview/widget/RecyclerView;",
            "Landroidx/recyclerview/widget/o2;",
            "Ljava/util/List<",
            "Landroidx/recyclerview/widget/j0;",
            ">;IFF)V"
        }
    .end annotation

    invoke-interface {p4}, Ljava/util/List;->size()I

    move-result p5

    const/4 p6, 0x0

    move p7, p6

    :goto_0
    if-ge p7, p5, :cond_0

    invoke-interface {p4, p7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/j0;

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v1

    iget-object v0, v0, Landroidx/recyclerview/widget/j0;->e:Landroidx/recyclerview/widget/o2;

    iget-object v0, v0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    add-int/lit8 p7, p7, 0x1

    goto :goto_0

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result p3

    invoke-virtual {p1, p3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_1
    const/4 p1, 0x1

    sub-int/2addr p5, p1

    :goto_1
    if-ltz p5, :cond_4

    invoke-interface {p4, p5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroidx/recyclerview/widget/j0;

    iget-boolean p7, p3, Landroidx/recyclerview/widget/j0;->l:Z

    if-eqz p7, :cond_2

    iget-boolean p3, p3, Landroidx/recyclerview/widget/j0;->h:Z

    if-nez p3, :cond_2

    invoke-interface {p4, p5}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    if-nez p7, :cond_3

    move p6, p1

    :cond_3
    :goto_2
    add-int/lit8 p5, p5, -0x1

    goto :goto_1

    :cond_4
    if-eqz p6, :cond_5

    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    :cond_5
    return-void
.end method

.method public final onMoved(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;ILandroidx/recyclerview/widget/o2;III)V
    .locals 1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object p3

    instance-of v0, p3, Landroidx/recyclerview/widget/LinearLayoutManager;

    if-eqz v0, :cond_0

    check-cast p3, Landroidx/recyclerview/widget/LinearLayoutManager;

    iget-object p1, p2, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    iget-object p2, p4, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {p3, p1, p2, p6, p7}, Landroidx/recyclerview/widget/LinearLayoutManager;->prepareForDrop(Landroid/view/View;Landroid/view/View;II)V

    return-void

    :cond_0
    invoke-virtual {p3}, Landroidx/recyclerview/widget/u1;->canScrollHorizontally()Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p4, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/u1;->getDecoratedLeft(Landroid/view/View;)I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result p6

    if-gt p2, p6, :cond_1

    invoke-virtual {p1, p5}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    :cond_1
    iget-object p2, p4, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/u1;->getDecoratedRight(Landroid/view/View;)I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p6

    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    move-result p7

    sub-int/2addr p6, p7

    if-lt p2, p6, :cond_2

    invoke-virtual {p1, p5}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    :cond_2
    invoke-virtual {p3}, Landroidx/recyclerview/widget/u1;->canScrollVertically()Z

    move-result p2

    if-eqz p2, :cond_4

    iget-object p2, p4, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/u1;->getDecoratedTop(Landroid/view/View;)I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getPaddingTop()I

    move-result p6

    if-gt p2, p6, :cond_3

    invoke-virtual {p1, p5}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    :cond_3
    iget-object p2, p4, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/u1;->getDecoratedBottom(Landroid/view/View;)I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p3

    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result p4

    sub-int/2addr p3, p4

    if-lt p2, p3, :cond_4

    invoke-virtual {p1, p5}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    :cond_4
    return-void
.end method

.method public final onSelectedChanged(Landroidx/recyclerview/widget/o2;I)V
    .locals 0

    return-void
.end method
