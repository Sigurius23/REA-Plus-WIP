.class public abstract Landroidx/recyclerview/widget/u1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field mAutoMeasure:Z

.field mChildHelper:Landroidx/recyclerview/widget/j;

.field private mHeight:I

.field private mHeightMode:I

.field mHorizontalBoundCheck:Landroidx/recyclerview/widget/z2;

.field private final mHorizontalBoundCheckCallback:Landroidx/recyclerview/widget/y2;

.field mIsAttachedToWindow:Z

.field private mItemPrefetchEnabled:Z

.field private mMeasurementCacheEnabled:Z

.field mPrefetchMaxCountObserved:I

.field mPrefetchMaxObservedInInitialPrefetch:Z

.field mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

.field mRequestedSimpleAnimations:Z

.field mSmoothScroller:Landroidx/recyclerview/widget/j2;

.field mVerticalBoundCheck:Landroidx/recyclerview/widget/z2;

.field private final mVerticalBoundCheckCallback:Landroidx/recyclerview/widget/y2;

.field private mWidth:I

.field private mWidthMode:I


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/recyclerview/widget/r1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroidx/recyclerview/widget/r1;-><init>(Landroidx/recyclerview/widget/u1;I)V

    iput-object v0, p0, Landroidx/recyclerview/widget/u1;->mHorizontalBoundCheckCallback:Landroidx/recyclerview/widget/y2;

    new-instance v1, Landroidx/recyclerview/widget/r1;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Landroidx/recyclerview/widget/r1;-><init>(Landroidx/recyclerview/widget/u1;I)V

    iput-object v1, p0, Landroidx/recyclerview/widget/u1;->mVerticalBoundCheckCallback:Landroidx/recyclerview/widget/y2;

    new-instance v2, Landroidx/recyclerview/widget/z2;

    invoke-direct {v2, v0}, Landroidx/recyclerview/widget/z2;-><init>(Landroidx/recyclerview/widget/y2;)V

    iput-object v2, p0, Landroidx/recyclerview/widget/u1;->mHorizontalBoundCheck:Landroidx/recyclerview/widget/z2;

    new-instance v0, Landroidx/recyclerview/widget/z2;

    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/z2;-><init>(Landroidx/recyclerview/widget/y2;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/u1;->mVerticalBoundCheck:Landroidx/recyclerview/widget/z2;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/recyclerview/widget/u1;->mRequestedSimpleAnimations:Z

    iput-boolean v0, p0, Landroidx/recyclerview/widget/u1;->mIsAttachedToWindow:Z

    iput-boolean v0, p0, Landroidx/recyclerview/widget/u1;->mAutoMeasure:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/u1;->mMeasurementCacheEnabled:Z

    iput-boolean v0, p0, Landroidx/recyclerview/widget/u1;->mItemPrefetchEnabled:Z

    return-void
.end method

.method public static b(III)Z
    .locals 3

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    const/4 v1, 0x0

    if-lez p2, :cond_0

    if-eq p0, p2, :cond_0

    return v1

    :cond_0
    const/high16 p2, -0x80000000

    const/4 v2, 0x1

    if-eq v0, p2, :cond_4

    if-eqz v0, :cond_3

    const/high16 p2, 0x40000000    # 2.0f

    if-eq v0, p2, :cond_1

    return v1

    :cond_1
    if-ne p1, p0, :cond_2

    return v2

    :cond_2
    return v1

    :cond_3
    return v2

    :cond_4
    if-lt p1, p0, :cond_5

    return v2

    :cond_5
    return v1
.end method

.method public static chooseSize(III)I
    .locals 2

    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v0

    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p0

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_1

    const/high16 v1, 0x40000000    # 2.0f

    if-eq v0, v1, :cond_0

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p0

    :cond_0
    return p0

    :cond_1
    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    move-result p0

    return p0
.end method

.method public static getChildMeasureSpec(IIIIZ)I
    .locals 4

    sub-int/2addr p0, p2

    const/4 p2, 0x0

    .line 3
    invoke-static {p2, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    const/4 v0, -0x2

    const/4 v1, -0x1

    const/high16 v2, -0x80000000

    const/high16 v3, 0x40000000    # 2.0f

    if-eqz p4, :cond_2

    if-ltz p3, :cond_0

    :goto_0
    move p1, v3

    goto :goto_2

    :cond_0
    if-ne p3, v1, :cond_1

    if-eq p1, v2, :cond_4

    if-eqz p1, :cond_1

    if-eq p1, v3, :cond_4

    :cond_1
    move p1, p2

    move p3, p1

    goto :goto_2

    :cond_2
    if-ltz p3, :cond_3

    goto :goto_0

    :cond_3
    if-ne p3, v1, :cond_5

    :cond_4
    move p3, p0

    goto :goto_2

    :cond_5
    if-ne p3, v0, :cond_1

    if-eq p1, v2, :cond_7

    if-ne p1, v3, :cond_6

    goto :goto_1

    :cond_6
    move p3, p0

    move p1, p2

    goto :goto_2

    :cond_7
    :goto_1
    move p3, p0

    move p1, v2

    .line 4
    :goto_2
    invoke-static {p3, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    return p0
.end method

.method public static getChildMeasureSpec(IIIZ)I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sub-int/2addr p0, p1

    const/4 p1, 0x0

    .line 1
    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    const/high16 v0, 0x40000000    # 2.0f

    if-eqz p3, :cond_1

    if-ltz p2, :cond_0

    :goto_0
    move p1, v0

    goto :goto_1

    :cond_0
    move p2, p1

    goto :goto_1

    :cond_1
    if-ltz p2, :cond_2

    goto :goto_0

    :cond_2
    const/4 p3, -0x1

    if-ne p2, p3, :cond_3

    move p2, p0

    goto :goto_0

    :cond_3
    const/4 p3, -0x2

    if-ne p2, p3, :cond_0

    const/high16 p1, -0x80000000

    move p2, p0

    .line 2
    :goto_1
    invoke-static {p2, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    return p0
.end method

.method public static getProperties(Landroid/content/Context;Landroid/util/AttributeSet;II)Landroidx/recyclerview/widget/t1;
    .locals 2

    new-instance v0, Landroidx/recyclerview/widget/t1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sget-object v1, Ljb/a;->a:[I

    invoke-virtual {p0, p1, v1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p0

    const/4 p1, 0x0

    const/4 p2, 0x1

    invoke-virtual {p0, p1, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p3

    iput p3, v0, Landroidx/recyclerview/widget/t1;->a:I

    const/16 p3, 0xa

    invoke-virtual {p0, p3, p2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    iput p2, v0, Landroidx/recyclerview/widget/t1;->b:I

    const/16 p2, 0x9

    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, v0, Landroidx/recyclerview/widget/t1;->c:Z

    const/16 p2, 0xb

    invoke-virtual {p0, p2, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    iput-boolean p1, v0, Landroidx/recyclerview/widget/t1;->d:Z

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/view/View;IZ)V
    .locals 6

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolderInt(Landroid/view/View;)Landroidx/recyclerview/widget/o2;

    move-result-object v0

    const/4 v1, 0x1

    if-nez p3, :cond_1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/o2;->isRemoved()Z

    move-result p3

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    iget-object p3, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p3, p3, Landroidx/recyclerview/widget/RecyclerView;->mViewInfoStore:Landroidx/recyclerview/widget/c3;

    invoke-virtual {p3, v0}, Landroidx/recyclerview/widget/c3;->c(Landroidx/recyclerview/widget/o2;)V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p3, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p3, p3, Landroidx/recyclerview/widget/RecyclerView;->mViewInfoStore:Landroidx/recyclerview/widget/c3;

    iget-object p3, p3, Landroidx/recyclerview/widget/c3;->a:La0/f1;

    invoke-virtual {p3, v0}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/a3;

    if-nez v2, :cond_2

    invoke-static {}, Landroidx/recyclerview/widget/a3;->a()Landroidx/recyclerview/widget/a3;

    move-result-object v2

    invoke-virtual {p3, v0, v2}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    iget p3, v2, Landroidx/recyclerview/widget/a3;->a:I

    or-int/2addr p3, v1

    iput p3, v2, Landroidx/recyclerview/widget/a3;->a:I

    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    check-cast p3, Landroidx/recyclerview/widget/v1;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/o2;->wasReturnedFromScrap()Z

    move-result v2

    const-string v3, "RecyclerView"

    const/4 v4, 0x0

    if-nez v2, :cond_7

    invoke-virtual {v0}, Landroidx/recyclerview/widget/o2;->isScrap()Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    iget-object v5, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-ne v2, v5, :cond_6

    iget-object v1, p0, Landroidx/recyclerview/widget/u1;->mChildHelper:Landroidx/recyclerview/widget/j;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/j;->j(Landroid/view/View;)I

    move-result v1

    const/4 v2, -0x1

    if-ne p2, v2, :cond_4

    iget-object p2, p0, Landroidx/recyclerview/widget/u1;->mChildHelper:Landroidx/recyclerview/widget/j;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/j;->e()I

    move-result p2

    :cond_4
    if-eq v1, v2, :cond_5

    if-eq v1, p2, :cond_9

    iget-object p1, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->mLayout:Landroidx/recyclerview/widget/u1;

    invoke-virtual {p1, v1, p2}, Landroidx/recyclerview/widget/u1;->moveView(II)V

    goto :goto_4

    :cond_5
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Added View has RecyclerView as parent but view is not a real child. Unfiltered index:"

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result p1

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object p1, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {p1, p3}, Lr;->i(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    iget-object v2, p0, Landroidx/recyclerview/widget/u1;->mChildHelper:Landroidx/recyclerview/widget/j;

    invoke-virtual {v2, p1, p2, v4}, Landroidx/recyclerview/widget/j;->a(Landroid/view/View;IZ)V

    iput-boolean v1, p3, Landroidx/recyclerview/widget/v1;->c:Z

    iget-object p2, p0, Landroidx/recyclerview/widget/u1;->mSmoothScroller:Landroidx/recyclerview/widget/j2;

    if-eqz p2, :cond_9

    iget-boolean v1, p2, Landroidx/recyclerview/widget/j2;->e:Z

    if-eqz v1, :cond_9

    iget-object v1, p2, Landroidx/recyclerview/widget/j2;->b:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->getChildLayoutPosition(Landroid/view/View;)I

    move-result v1

    iget v2, p2, Landroidx/recyclerview/widget/j2;->a:I

    if-ne v1, v2, :cond_9

    iput-object p1, p2, Landroidx/recyclerview/widget/j2;->f:Landroid/view/View;

    sget-boolean p1, Landroidx/recyclerview/widget/RecyclerView;->sVerboseLoggingEnabled:Z

    if-eqz p1, :cond_9

    const-string p1, "smooth scroll target view has been attached"

    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :cond_7
    :goto_2
    invoke-virtual {v0}, Landroidx/recyclerview/widget/o2;->isScrap()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {v0}, Landroidx/recyclerview/widget/o2;->unScrap()V

    goto :goto_3

    :cond_8
    invoke-virtual {v0}, Landroidx/recyclerview/widget/o2;->clearReturnedFromScrapFlag()V

    :goto_3
    iget-object v1, p0, Landroidx/recyclerview/widget/u1;->mChildHelper:Landroidx/recyclerview/widget/j;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    invoke-virtual {v1, p1, p2, v2, v4}, Landroidx/recyclerview/widget/j;->b(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    :cond_9
    :goto_4
    iget-boolean p1, p3, Landroidx/recyclerview/widget/v1;->d:Z

    if-eqz p1, :cond_b

    sget-boolean p1, Landroidx/recyclerview/widget/RecyclerView;->sVerboseLoggingEnabled:Z

    if-eqz p1, :cond_a

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "consuming pending invalidate on child "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p2, p3, Landroidx/recyclerview/widget/v1;->a:Landroidx/recyclerview/widget/o2;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_a
    iget-object p1, v0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    iput-boolean v4, p3, Landroidx/recyclerview/widget/v1;->d:Z

    :cond_b
    return-void
.end method

.method public addDisappearingView(Landroid/view/View;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    const/4 v0, -0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/u1;->addDisappearingView(Landroid/view/View;I)V

    return-void
.end method

.method public addDisappearingView(Landroid/view/View;I)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/u1;->a(Landroid/view/View;IZ)V

    return-void
.end method

.method public addView(Landroid/view/View;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    const/4 v0, -0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/u1;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public addView(Landroid/view/View;I)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/u1;->a(Landroid/view/View;IZ)V

    return-void
.end method

.method public assertInLayoutOrScroll(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->assertInLayoutOrScroll(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public assertNotInLayoutOrScroll(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public attachView(Landroid/view/View;)V
    .locals 1

    const/4 v0, -0x1

    .line 12
    invoke-virtual {p0, p1, v0}, Landroidx/recyclerview/widget/u1;->attachView(Landroid/view/View;I)V

    return-void
.end method

.method public attachView(Landroid/view/View;I)V
    .locals 1

    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/v1;

    invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/u1;->attachView(Landroid/view/View;ILandroidx/recyclerview/widget/v1;)V

    return-void
.end method

.method public attachView(Landroid/view/View;ILandroidx/recyclerview/widget/v1;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolderInt(Landroid/view/View;)Landroidx/recyclerview/widget/o2;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Landroidx/recyclerview/widget/o2;->isRemoved()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3
    iget-object v1, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->mViewInfoStore:Landroidx/recyclerview/widget/c3;

    .line 4
    iget-object v1, v1, Landroidx/recyclerview/widget/c3;->a:La0/f1;

    .line 5
    invoke-virtual {v1, v0}, La0/f1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/a3;

    if-nez v2, :cond_0

    .line 6
    invoke-static {}, Landroidx/recyclerview/widget/a3;->a()Landroidx/recyclerview/widget/a3;

    move-result-object v2

    .line 7
    invoke-virtual {v1, v0, v2}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    :cond_0
    iget v1, v2, Landroidx/recyclerview/widget/a3;->a:I

    or-int/lit8 v1, v1, 0x1

    iput v1, v2, Landroidx/recyclerview/widget/a3;->a:I

    goto :goto_0

    .line 9
    :cond_1
    iget-object v1, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->mViewInfoStore:Landroidx/recyclerview/widget/c3;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/c3;->c(Landroidx/recyclerview/widget/o2;)V

    .line 10
    :goto_0
    iget-object v1, p0, Landroidx/recyclerview/widget/u1;->mChildHelper:Landroidx/recyclerview/widget/j;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/o2;->isRemoved()Z

    move-result v0

    invoke-virtual {v1, p1, p2, p3, v0}, Landroidx/recyclerview/widget/j;->b(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    return-void
.end method

.method public final c(Landroidx/recyclerview/widget/c2;ILandroid/view/View;)V
    .locals 2

    invoke-static {p3}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolderInt(Landroid/view/View;)Landroidx/recyclerview/widget/o2;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/o2;->shouldIgnore()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-boolean p1, Landroidx/recyclerview/widget/RecyclerView;->sVerboseLoggingEnabled:Z

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "ignoring view "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "RecyclerView"

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void

    :cond_1
    invoke-virtual {v0}, Landroidx/recyclerview/widget/o2;->isInvalid()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Landroidx/recyclerview/widget/o2;->isRemoved()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/i1;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/i1;->hasStableIds()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/u1;->removeViewAt(I)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/c2;->j(Landroidx/recyclerview/widget/o2;)V

    return-void

    :cond_2
    invoke-virtual {p0, p2}, Landroidx/recyclerview/widget/u1;->detachViewAt(I)V

    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/c2;->k(Landroid/view/View;)V

    iget-object p1, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->mViewInfoStore:Landroidx/recyclerview/widget/c3;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/c3;->c(Landroidx/recyclerview/widget/o2;)V

    return-void
.end method

.method public calculateItemDecorationsForChild(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p2, p1, p1, p1, p1}, Landroid/graphics/Rect;->set(IIII)V

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorInsetsForChild(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    return-void
.end method

.method public abstract canScrollHorizontally()Z
.end method

.method public abstract canScrollVertically()Z
.end method

.method public checkLayoutParams(Landroidx/recyclerview/widget/v1;)Z
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public collectAdjacentPrefetchPositions(IILandroidx/recyclerview/widget/k2;Landroidx/recyclerview/widget/s1;)V
    .locals 0

    return-void
.end method

.method public collectInitialPrefetchPositions(ILandroidx/recyclerview/widget/s1;)V
    .locals 0

    return-void
.end method

.method public abstract computeHorizontalScrollExtent(Landroidx/recyclerview/widget/k2;)I
.end method

.method public abstract computeHorizontalScrollOffset(Landroidx/recyclerview/widget/k2;)I
.end method

.method public abstract computeHorizontalScrollRange(Landroidx/recyclerview/widget/k2;)I
.end method

.method public abstract computeVerticalScrollExtent(Landroidx/recyclerview/widget/k2;)I
.end method

.method public abstract computeVerticalScrollOffset(Landroidx/recyclerview/widget/k2;)I
.end method

.method public abstract computeVerticalScrollRange(Landroidx/recyclerview/widget/k2;)I
.end method

.method public detachAndScrapAttachedViews(Landroidx/recyclerview/widget/c2;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/u1;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, Landroidx/recyclerview/widget/u1;->c(Landroidx/recyclerview/widget/c2;ILandroid/view/View;)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public detachAndScrapView(Landroid/view/View;Landroidx/recyclerview/widget/c2;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mChildHelper:Landroidx/recyclerview/widget/j;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/j;->j(Landroid/view/View;)I

    move-result v0

    invoke-virtual {p0, p2, v0, p1}, Landroidx/recyclerview/widget/u1;->c(Landroidx/recyclerview/widget/c2;ILandroid/view/View;)V

    return-void
.end method

.method public detachAndScrapViewAt(ILandroidx/recyclerview/widget/c2;)V
    .locals 1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/u1;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, p2, p1, v0}, Landroidx/recyclerview/widget/u1;->c(Landroidx/recyclerview/widget/c2;ILandroid/view/View;)V

    return-void
.end method

.method public detachView(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mChildHelper:Landroidx/recyclerview/widget/j;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/j;->j(Landroid/view/View;)I

    move-result p1

    if-ltz p1, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mChildHelper:Landroidx/recyclerview/widget/j;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/j;->c(I)V

    :cond_0
    return-void
.end method

.method public detachViewAt(I)V
    .locals 1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/u1;->getChildAt(I)Landroid/view/View;

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mChildHelper:Landroidx/recyclerview/widget/j;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/j;->c(I)V

    return-void
.end method

.method public dispatchAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/u1;->mIsAttachedToWindow:Z

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/u1;->onAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method

.method public dispatchDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/c2;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/recyclerview/widget/u1;->mIsAttachedToWindow:Z

    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/u1;->onDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/c2;)V

    return-void
.end method

.method public endAnimation(Landroid/view/View;)V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->mItemAnimator:Landroidx/recyclerview/widget/p1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolderInt(Landroid/view/View;)Landroidx/recyclerview/widget/o2;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/p1;->d(Landroidx/recyclerview/widget/o2;)V

    :cond_0
    return-void
.end method

.method public findContainingItemView(Landroid/view/View;)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->findContainingItemView(Landroid/view/View;)Landroid/view/View;

    move-result-object p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mChildHelper:Landroidx/recyclerview/widget/j;

    iget-object v0, v0, Landroidx/recyclerview/widget/j;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    const/4 p1, 0x0

    :cond_2
    return-object p1
.end method

.method public findViewByPosition(I)Landroid/view/View;
    .locals 5

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/u1;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-static {v2}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolderInt(Landroid/view/View;)Landroidx/recyclerview/widget/o2;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v3}, Landroidx/recyclerview/widget/o2;->getLayoutPosition()I

    move-result v4

    if-ne v4, p1, :cond_2

    invoke-virtual {v3}, Landroidx/recyclerview/widget/o2;->shouldIgnore()Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v4, v4, Landroidx/recyclerview/widget/RecyclerView;->mState:Landroidx/recyclerview/widget/k2;

    iget-boolean v4, v4, Landroidx/recyclerview/widget/k2;->g:Z

    if-nez v4, :cond_1

    invoke-virtual {v3}, Landroidx/recyclerview/widget/o2;->isRemoved()Z

    move-result v3

    if-nez v3, :cond_2

    :cond_1
    return-object v2

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public abstract generateDefaultLayoutParams()Landroidx/recyclerview/widget/v1;
.end method

.method public generateLayoutParams(Landroid/content/Context;Landroid/util/AttributeSet;)Landroidx/recyclerview/widget/v1;
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    .line 6
    new-instance v0, Landroidx/recyclerview/widget/v1;

    invoke-direct {v0, p1, p2}, Landroidx/recyclerview/widget/v1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroidx/recyclerview/widget/v1;
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    .line 1
    instance-of v0, p1, Landroidx/recyclerview/widget/v1;

    if-eqz v0, :cond_0

    .line 2
    new-instance v0, Landroidx/recyclerview/widget/v1;

    check-cast p1, Landroidx/recyclerview/widget/v1;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/v1;-><init>(Landroidx/recyclerview/widget/v1;)V

    return-object v0

    .line 3
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v0, :cond_1

    .line 4
    new-instance v0, Landroidx/recyclerview/widget/v1;

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/v1;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    return-object v0

    .line 5
    :cond_1
    new-instance v0, Landroidx/recyclerview/widget/v1;

    invoke-direct {v0, p1}, Landroidx/recyclerview/widget/v1;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public getBaseline()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public getBottomDecorationHeight(Landroid/view/View;)I
    .locals 0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/v1;

    iget-object p1, p1, Landroidx/recyclerview/widget/v1;->b:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    return p1
.end method

.method public getChildAt(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mChildHelper:Landroidx/recyclerview/widget/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/j;->d(I)Landroid/view/View;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public getChildCount()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mChildHelper:Landroidx/recyclerview/widget/j;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->e()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getClipToPadding()Z
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Landroidx/recyclerview/widget/RecyclerView;->mClipToPadding:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getColumnCountForAccessibility(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;)I
    .locals 0

    const/4 p1, -0x1

    return p1
.end method

.method public getDecoratedBottom(Landroid/view/View;)I
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/u1;->getBottomDecorationHeight(Landroid/view/View;)I

    move-result p1

    add-int/2addr p1, v0

    return p1
.end method

.method public getDecoratedBoundsWithMargins(Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    invoke-static {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->getDecoratedBoundsWithMarginsInt(Landroid/view/View;Landroid/graphics/Rect;)V

    return-void
.end method

.method public getDecoratedLeft(Landroid/view/View;)I
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/u1;->getLeftDecorationWidth(Landroid/view/View;)I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method public getDecoratedMeasuredHeight(Landroid/view/View;)I
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/v1;

    iget-object v0, v0, Landroidx/recyclerview/widget/v1;->b:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    iget v1, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p1, v0

    return p1
.end method

.method public getDecoratedMeasuredWidth(Landroid/view/View;)I
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/v1;

    iget-object v0, v0, Landroidx/recyclerview/widget/v1;->b:Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    iget v1, v0, Landroid/graphics/Rect;->left:I

    add-int/2addr p1, v1

    iget v0, v0, Landroid/graphics/Rect;->right:I

    add-int/2addr p1, v0

    return p1
.end method

.method public getDecoratedRight(Landroid/view/View;)I
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/u1;->getRightDecorationWidth(Landroid/view/View;)I

    move-result p1

    add-int/2addr p1, v0

    return p1
.end method

.method public getDecoratedTop(Landroid/view/View;)I
    .locals 1

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/u1;->getTopDecorationHeight(Landroid/view/View;)I

    move-result p1

    sub-int/2addr v0, p1

    return v0
.end method

.method public getFocusedChild()Landroid/view/View;
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v1, p0, Landroidx/recyclerview/widget/u1;->mChildHelper:Landroidx/recyclerview/widget/j;

    iget-object v1, v1, Landroidx/recyclerview/widget/j;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    return-object v0

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/u1;->mHeight:I

    return v0
.end method

.method public getHeightMode()I
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/u1;->mHeightMode:I

    return v0
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/i1;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/i1;->getItemCount()I

    move-result v0

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public getItemViewType(Landroid/view/View;)I
    .locals 0

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolderInt(Landroid/view/View;)Landroidx/recyclerview/widget/o2;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/o2;->getItemViewType()I

    move-result p1

    return p1
.end method

.method public getLayoutDirection()I
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    sget-object v1, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    return v0
.end method

.method public getLeftDecorationWidth(Landroid/view/View;)I
    .locals 0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/v1;

    iget-object p1, p1, Landroidx/recyclerview/widget/v1;->b:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->left:I

    return p1
.end method

.method public getMinimumHeight()I
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    sget-object v1, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Landroid/view/View;->getMinimumHeight()I

    move-result v0

    return v0
.end method

.method public getMinimumWidth()I
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    sget-object v1, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Landroid/view/View;->getMinimumWidth()I

    move-result v0

    return v0
.end method

.method public getPaddingBottom()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getPaddingEnd()I
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    sget-object v1, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingEnd()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getPaddingLeft()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getPaddingRight()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getPaddingStart()I
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    sget-object v1, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getPaddingTop()I
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getPosition(Landroid/view/View;)I
    .locals 0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/v1;

    iget-object p1, p1, Landroidx/recyclerview/widget/v1;->a:Landroidx/recyclerview/widget/o2;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/o2;->getLayoutPosition()I

    move-result p1

    return p1
.end method

.method public getRightDecorationWidth(Landroid/view/View;)I
    .locals 0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/v1;

    iget-object p1, p1, Landroidx/recyclerview/widget/v1;->b:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->right:I

    return p1
.end method

.method public getRowCountForAccessibility(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;)I
    .locals 0

    const/4 p1, -0x1

    return p1
.end method

.method public getSelectionModeForAccessibility(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public getTopDecorationHeight(Landroid/view/View;)I
    .locals 0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/recyclerview/widget/v1;

    iget-object p1, p1, Landroidx/recyclerview/widget/v1;->b:Landroid/graphics/Rect;

    iget p1, p1, Landroid/graphics/Rect;->top:I

    return p1
.end method

.method public getTransformedBoundingBox(Landroid/view/View;ZLandroid/graphics/Rect;)V
    .locals 5

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/v1;

    iget-object p2, p2, Landroidx/recyclerview/widget/v1;->b:Landroid/graphics/Rect;

    iget v0, p2, Landroid/graphics/Rect;->left:I

    neg-int v0, v0

    iget v1, p2, Landroid/graphics/Rect;->top:I

    neg-int v1, v1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v2

    iget v3, p2, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v3

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v3

    iget p2, p2, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v3, p2

    invoke-virtual {p3, v0, v1, v2, v3}, Landroid/graphics/Rect;->set(IIII)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p3, v1, v1, p2, v0}, Landroid/graphics/Rect;->set(IIII)V

    :goto_0
    iget-object p2, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->mTempRectF:Landroid/graphics/RectF;

    invoke-virtual {v0, p3}, Landroid/graphics/RectF;->set(Landroid/graphics/Rect;)V

    invoke-virtual {p2, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    iget p2, v0, Landroid/graphics/RectF;->left:F

    float-to-double v1, p2

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-int p2, v1

    iget v1, v0, Landroid/graphics/RectF;->top:F

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-int v1, v1

    iget v2, v0, Landroid/graphics/RectF;->right:F

    float-to-double v2, v2

    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v2

    double-to-int v2, v2

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    float-to-double v3, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v3

    double-to-int v0, v3

    invoke-virtual {p3, p2, v1, v2, v0}, Landroid/graphics/Rect;->set(IIII)V

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result p2

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    invoke-virtual {p3, p2, p1}, Landroid/graphics/Rect;->offset(II)V

    return-void
.end method

.method public getWidth()I
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/u1;->mWidth:I

    return v0
.end method

.method public getWidthMode()I
    .locals 1

    iget v0, p0, Landroidx/recyclerview/widget/u1;->mWidthMode:I

    return v0
.end method

.method public hasFlexibleChildInBothOrientations()Z
    .locals 5

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/u1;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    iget v4, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-gez v4, :cond_0

    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-gez v3, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public hasFocus()Z
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public ignoreView(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-ne v0, v1, :cond_0

    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolderInt(Landroid/view/View;)Landroidx/recyclerview/widget/o2;

    move-result-object p1

    const/16 v0, 0x80

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/o2;->addFlags(I)V

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->mViewInfoStore:Landroidx/recyclerview/widget/c3;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/c3;->d(Landroidx/recyclerview/widget/o2;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "View should be fully attached to be ignored"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v1, v0}, Lr;->i(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public isAttachedToWindow()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/u1;->mIsAttachedToWindow:Z

    return v0
.end method

.method public abstract isAutoMeasureEnabled()Z
.end method

.method public isFocused()Z
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isItemPrefetchEnabled()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/u1;->mItemPrefetchEnabled:Z

    return v0
.end method

.method public isLayoutHierarchical(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public isMeasurementCacheEnabled()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/u1;->mMeasurementCacheEnabled:Z

    return v0
.end method

.method public isSmoothScrolling()Z
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mSmoothScroller:Landroidx/recyclerview/widget/j2;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Landroidx/recyclerview/widget/j2;->e:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isViewPartiallyVisible(Landroid/view/View;ZZ)Z
    .locals 1

    iget-object p3, p0, Landroidx/recyclerview/widget/u1;->mHorizontalBoundCheck:Landroidx/recyclerview/widget/z2;

    invoke-virtual {p3, p1}, Landroidx/recyclerview/widget/z2;->b(Landroid/view/View;)Z

    move-result p3

    const/4 v0, 0x1

    if-eqz p3, :cond_0

    iget-object p3, p0, Landroidx/recyclerview/widget/u1;->mVerticalBoundCheck:Landroidx/recyclerview/widget/z2;

    invoke-virtual {p3, p1}, Landroidx/recyclerview/widget/z2;->b(Landroid/view/View;)Z

    move-result p1

    if-eqz p1, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p2, :cond_1

    return p1

    :cond_1
    xor-int/2addr p1, v0

    return p1
.end method

.method public layoutDecorated(Landroid/view/View;IIII)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/v1;

    iget-object v0, v0, Landroidx/recyclerview/widget/v1;->b:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->left:I

    add-int/2addr p2, v1

    iget v1, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr p3, v1

    iget v1, v0, Landroid/graphics/Rect;->right:I

    sub-int/2addr p4, v1

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p5, v0

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method public layoutDecoratedWithMargins(Landroid/view/View;IIII)V
    .locals 3

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/v1;

    iget-object v1, v0, Landroidx/recyclerview/widget/v1;->b:Landroid/graphics/Rect;

    iget v2, v1, Landroid/graphics/Rect;->left:I

    add-int/2addr p2, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr p2, v2

    iget v2, v1, Landroid/graphics/Rect;->top:I

    add-int/2addr p3, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr p3, v2

    iget v2, v1, Landroid/graphics/Rect;->right:I

    sub-int/2addr p4, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    sub-int/2addr p4, v2

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p5, v1

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    sub-int/2addr p5, v0

    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/view/View;->layout(IIII)V

    return-void
.end method

.method public measureChild(Landroid/view/View;II)V
    .locals 5

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/v1;

    iget-object v1, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorInsetsForChild(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v1

    iget v2, v1, Landroid/graphics/Rect;->left:I

    iget v3, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v3

    add-int/2addr v2, p2

    iget p2, v1, Landroid/graphics/Rect;->top:I

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p2, v1

    add-int/2addr p2, p3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getWidth()I

    move-result p3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getWidthMode()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingLeft()I

    move-result v3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingRight()I

    move-result v4

    add-int/2addr v4, v3

    add-int/2addr v4, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->canScrollHorizontally()Z

    move-result v3

    invoke-static {p3, v1, v4, v2, v3}, Landroidx/recyclerview/widget/u1;->getChildMeasureSpec(IIIIZ)I

    move-result p3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getHeightMode()I

    move-result v2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingTop()I

    move-result v3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingBottom()I

    move-result v4

    add-int/2addr v4, v3

    add-int/2addr v4, p2

    iget p2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->canScrollVertically()Z

    move-result v3

    invoke-static {v1, v2, v4, p2, v3}, Landroidx/recyclerview/widget/u1;->getChildMeasureSpec(IIIIZ)I

    move-result p2

    invoke-virtual {p0, p1, p3, p2, v0}, Landroidx/recyclerview/widget/u1;->shouldMeasureChild(Landroid/view/View;IILandroidx/recyclerview/widget/v1;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p3, p2}, Landroid/view/View;->measure(II)V

    :cond_0
    return-void
.end method

.method public measureChildWithMargins(Landroid/view/View;II)V
    .locals 5

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/v1;

    iget-object v1, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, p1}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorInsetsForChild(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v1

    iget v2, v1, Landroid/graphics/Rect;->left:I

    iget v3, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr v2, v3

    add-int/2addr v2, p2

    iget p2, v1, Landroid/graphics/Rect;->top:I

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p2, v1

    add-int/2addr p2, p3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getWidth()I

    move-result p3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getWidthMode()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingLeft()I

    move-result v3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingRight()I

    move-result v4

    add-int/2addr v4, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v4, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v4, v3

    add-int/2addr v4, v2

    iget v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->canScrollHorizontally()Z

    move-result v3

    invoke-static {p3, v1, v4, v2, v3}, Landroidx/recyclerview/widget/u1;->getChildMeasureSpec(IIIIZ)I

    move-result p3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getHeight()I

    move-result v1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getHeightMode()I

    move-result v2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingTop()I

    move-result v3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingBottom()I

    move-result v4

    add-int/2addr v4, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    add-int/2addr v4, v3

    iget v3, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    add-int/2addr v4, v3

    add-int/2addr v4, p2

    iget p2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->canScrollVertically()Z

    move-result v3

    invoke-static {v1, v2, v4, p2, v3}, Landroidx/recyclerview/widget/u1;->getChildMeasureSpec(IIIIZ)I

    move-result p2

    invoke-virtual {p0, p1, p3, p2, v0}, Landroidx/recyclerview/widget/u1;->shouldMeasureChild(Landroid/view/View;IILandroidx/recyclerview/widget/v1;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p3, p2}, Landroid/view/View;->measure(II)V

    :cond_0
    return-void
.end method

.method public moveView(II)V
    .locals 2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/u1;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/u1;->detachViewAt(I)V

    invoke-virtual {p0, v0, p2}, Landroidx/recyclerview/widget/u1;->attachView(Landroid/view/View;I)V

    return-void

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot move a child from non-existing index:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object p1, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public offsetChildrenHorizontal(I)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->offsetChildrenHorizontal(I)V

    :cond_0
    return-void
.end method

.method public offsetChildrenVertical(I)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->offsetChildrenVertical(I)V

    :cond_0
    return-void
.end method

.method public onAdapterChanged(Landroidx/recyclerview/widget/i1;Landroidx/recyclerview/widget/i1;)V
    .locals 0

    return-void
.end method

.method public onAddFocusables(Landroidx/recyclerview/widget/RecyclerView;Ljava/util/ArrayList;II)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/recyclerview/widget/RecyclerView;",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;II)Z"
        }
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public onAttachedToWindow(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    return-void
.end method

.method public onDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    return-void
.end method

.method public abstract onDetachedFromWindow(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/c2;)V
.end method

.method public abstract onFocusSearchFailed(Landroid/view/View;ILandroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;)Landroid/view/View;
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->mRecycler:Landroidx/recyclerview/widget/c2;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->mState:Landroidx/recyclerview/widget/k2;

    invoke-virtual {p0, v1, v0, p1}, Landroidx/recyclerview/widget/u1;->onInitializeAccessibilityEvent(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;Landroid/view/accessibility/AccessibilityEvent;)V

    return-void
.end method

.method public onInitializeAccessibilityEvent(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 2
    iget-object p1, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p1, :cond_3

    if-nez p3, :cond_0

    goto :goto_1

    :cond_0
    const/4 p2, 0x1

    .line 3
    invoke-virtual {p1, p2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v0, -0x1

    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->canScrollVertically(I)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    invoke-virtual {p1, p2}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    .line 7
    :cond_2
    :goto_0
    invoke-virtual {p3, p2}, Landroid/view/accessibility/AccessibilityRecord;->setScrollable(Z)V

    .line 8
    iget-object p1, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->mAdapter:Landroidx/recyclerview/widget/i1;

    if-eqz p1, :cond_3

    .line 9
    invoke-virtual {p1}, Landroidx/recyclerview/widget/i1;->getItemCount()I

    move-result p1

    invoke-virtual {p3, p1}, Landroid/view/accessibility/AccessibilityRecord;->setItemCount(I)V

    :cond_3
    :goto_1
    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;Li5/f;)V
    .locals 3

    .line 2
    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/16 v0, 0x2000

    .line 3
    invoke-virtual {p3, v0}, Li5/f;->a(I)V

    .line 4
    invoke-virtual {p3, v2}, Li5/f;->k(Z)V

    .line 5
    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollVertically(I)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v2}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const/16 v0, 0x1000

    .line 6
    invoke-virtual {p3, v0}, Li5/f;->a(I)V

    .line 7
    invoke-virtual {p3, v2}, Li5/f;->k(Z)V

    .line 8
    :cond_3
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/u1;->getRowCountForAccessibility(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;)I

    move-result v0

    .line 9
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/u1;->getColumnCountForAccessibility(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;)I

    move-result v1

    .line 10
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/u1;->isLayoutHierarchical(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;)Z

    move-result v2

    .line 11
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/u1;->getSelectionModeForAccessibility(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;)I

    move-result p1

    .line 12
    invoke-static {v0, v1, p1, v2}, Lg9/b;->c(IIIZ)Lg9/b;

    move-result-object p1

    .line 13
    invoke-virtual {p3, p1}, Li5/f;->i(Lg9/b;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Li5/f;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->mRecycler:Landroidx/recyclerview/widget/c2;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->mState:Landroidx/recyclerview/widget/k2;

    invoke-virtual {p0, v1, v0, p1}, Landroidx/recyclerview/widget/u1;->onInitializeAccessibilityNodeInfo(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;Li5/f;)V

    return-void
.end method

.method public onInitializeAccessibilityNodeInfoForItem(Landroid/view/View;Li5/f;)V
    .locals 2

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolderInt(Landroid/view/View;)Landroidx/recyclerview/widget/o2;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroidx/recyclerview/widget/o2;->isRemoved()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Landroidx/recyclerview/widget/u1;->mChildHelper:Landroidx/recyclerview/widget/j;

    iget-object v0, v0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    .line 3
    iget-object v1, v1, Landroidx/recyclerview/widget/j;->c:Ljava/util/ArrayList;

    .line 4
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->mRecycler:Landroidx/recyclerview/widget/c2;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->mState:Landroidx/recyclerview/widget/k2;

    invoke-virtual {p0, v1, v0, p1, p2}, Landroidx/recyclerview/widget/u1;->onInitializeAccessibilityNodeInfoForItem(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;Landroid/view/View;Li5/f;)V

    :cond_0
    return-void
.end method

.method public onInitializeAccessibilityNodeInfoForItem(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;Landroid/view/View;Li5/f;)V
    .locals 0

    .line 6
    return-void
.end method

.method public onInterceptFocusSearch(Landroid/view/View;I)Landroid/view/View;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public onItemsAdded(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    return-void
.end method

.method public onItemsChanged(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    return-void
.end method

.method public onItemsMoved(Landroidx/recyclerview/widget/RecyclerView;III)V
    .locals 0

    return-void
.end method

.method public onItemsRemoved(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    return-void
.end method

.method public onItemsUpdated(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    .line 1
    return-void
.end method

.method public onItemsUpdated(Landroidx/recyclerview/widget/RecyclerView;IILjava/lang/Object;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3}, Landroidx/recyclerview/widget/u1;->onItemsUpdated(Landroidx/recyclerview/widget/RecyclerView;II)V

    return-void
.end method

.method public abstract onLayoutChildren(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;)V
.end method

.method public abstract onLayoutCompleted(Landroidx/recyclerview/widget/k2;)V
.end method

.method public onMeasure(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;II)V
    .locals 0

    iget-object p1, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, p3, p4}, Landroidx/recyclerview/widget/RecyclerView;->defaultOnMeasure(II)V

    return-void
.end method

.method public onRequestChildFocus(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/view/View;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->isSmoothScrolling()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->isComputingLayout()Z

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

.method public onRequestChildFocus(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/k2;Landroid/view/View;Landroid/view/View;)Z
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p3, p4}, Landroidx/recyclerview/widget/u1;->onRequestChildFocus(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/view/View;)Z

    move-result p1

    return p1
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 0

    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public onScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onSmoothScrollerStopped(Landroidx/recyclerview/widget/j2;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mSmoothScroller:Landroidx/recyclerview/widget/j2;

    if-ne v0, p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/recyclerview/widget/u1;->mSmoothScroller:Landroidx/recyclerview/widget/j2;

    :cond_0
    return-void
.end method

.method public performAccessibilityAction(ILandroid/os/Bundle;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->mRecycler:Landroidx/recyclerview/widget/c2;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->mState:Landroidx/recyclerview/widget/k2;

    invoke-virtual {p0, v1, v0, p1, p2}, Landroidx/recyclerview/widget/u1;->performAccessibilityAction(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public performAccessibilityAction(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;ILandroid/os/Bundle;)Z
    .locals 8

    .line 2
    iget-object p1, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    const/4 p2, 0x0

    if-nez p1, :cond_0

    return p2

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getHeight()I

    move-result p1

    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getWidth()I

    move-result p4

    .line 5
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 6
    iget-object v1, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Matrix;->isIdentity()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 7
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result p1

    .line 8
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result p4

    :cond_1
    const/16 v0, 0x1000

    const/4 v1, 0x1

    if-eq p3, v0, :cond_5

    const/16 v0, 0x2000

    if-eq p3, v0, :cond_2

    move v3, p2

    move v4, v3

    goto :goto_3

    .line 9
    :cond_2
    iget-object p3, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v0, -0x1

    invoke-virtual {p3, v0}, Landroid/view/View;->canScrollVertically(I)Z

    move-result p3

    if-eqz p3, :cond_3

    .line 10
    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingTop()I

    move-result p3

    sub-int/2addr p1, p3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingBottom()I

    move-result p3

    sub-int/2addr p1, p3

    neg-int p1, p1

    goto :goto_0

    :cond_3
    move p1, p2

    .line 11
    :goto_0
    iget-object p3, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3, v0}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result p3

    if-eqz p3, :cond_4

    .line 12
    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingLeft()I

    move-result p3

    sub-int/2addr p4, p3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingRight()I

    move-result p3

    sub-int/2addr p4, p3

    neg-int p3, p4

    :goto_1
    move v4, p1

    move v3, p3

    goto :goto_3

    :cond_4
    move v4, p1

    move v3, p2

    goto :goto_3

    .line 13
    :cond_5
    iget-object p3, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3, v1}, Landroid/view/View;->canScrollVertically(I)Z

    move-result p3

    if-eqz p3, :cond_6

    .line 14
    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingTop()I

    move-result p3

    sub-int/2addr p1, p3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingBottom()I

    move-result p3

    sub-int/2addr p1, p3

    goto :goto_2

    :cond_6
    move p1, p2

    .line 15
    :goto_2
    iget-object p3, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3, v1}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result p3

    if-eqz p3, :cond_4

    .line 16
    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingLeft()I

    move-result p3

    sub-int/2addr p4, p3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingRight()I

    move-result p3

    sub-int p3, p4, p3

    goto :goto_1

    :goto_3
    if-nez v4, :cond_7

    if-nez v3, :cond_7

    return p2

    .line 17
    :cond_7
    iget-object v2, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    const/high16 v6, -0x80000000

    const/4 v7, 0x1

    const/4 v5, 0x0

    invoke-virtual/range {v2 .. v7}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollBy(IILandroid/view/animation/Interpolator;IZ)V

    return v1
.end method

.method public performAccessibilityActionForItem(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 7

    .line 2
    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->mRecycler:Landroidx/recyclerview/widget/c2;

    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->mState:Landroidx/recyclerview/widget/k2;

    move-object v1, p0

    move-object v4, p1

    move v5, p2

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Landroidx/recyclerview/widget/u1;->performAccessibilityActionForItem(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public performAccessibilityActionForItem(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    return p1
.end method

.method public postOnAnimation(Ljava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    sget-object v1, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public removeAllViews()V
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_0

    iget-object v1, p0, Landroidx/recyclerview/widget/u1;->mChildHelper:Landroidx/recyclerview/widget/j;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/j;->k(I)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public removeAndRecycleAllViews(Landroidx/recyclerview/widget/c2;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-ltz v0, :cond_1

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/u1;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolderInt(Landroid/view/View;)Landroidx/recyclerview/widget/o2;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/recyclerview/widget/o2;->shouldIgnore()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0, v0, p1}, Landroidx/recyclerview/widget/u1;->removeAndRecycleViewAt(ILandroidx/recyclerview/widget/c2;)V

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public removeAndRecycleScrapInt(Landroidx/recyclerview/widget/c2;)V
    .locals 7

    iget-object v0, p1, Landroidx/recyclerview/widget/c2;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v2, v1, -0x1

    :goto_0
    if-ltz v2, :cond_3

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/o2;

    iget-object v3, v3, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolderInt(Landroid/view/View;)Landroidx/recyclerview/widget/o2;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/recyclerview/widget/o2;->shouldIgnore()Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/o2;->setIsRecyclable(Z)V

    invoke-virtual {v4}, Landroidx/recyclerview/widget/o2;->isTmpDetached()Z

    move-result v6

    if-eqz v6, :cond_1

    iget-object v6, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v6, v3, v5}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    :cond_1
    iget-object v6, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView;->mItemAnimator:Landroidx/recyclerview/widget/p1;

    if-eqz v6, :cond_2

    invoke-virtual {v6, v4}, Landroidx/recyclerview/widget/p1;->d(Landroidx/recyclerview/widget/o2;)V

    :cond_2
    const/4 v6, 0x1

    invoke-virtual {v4, v6}, Landroidx/recyclerview/widget/o2;->setIsRecyclable(Z)V

    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolderInt(Landroid/view/View;)Landroidx/recyclerview/widget/o2;

    move-result-object v3

    const/4 v4, 0x0

    iput-object v4, v3, Landroidx/recyclerview/widget/o2;->mScrapContainer:Landroidx/recyclerview/widget/c2;

    iput-boolean v5, v3, Landroidx/recyclerview/widget/o2;->mInChangeScrap:Z

    invoke-virtual {v3}, Landroidx/recyclerview/widget/o2;->clearReturnedFromScrapFlag()V

    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/c2;->j(Landroidx/recyclerview/widget/o2;)V

    :goto_1
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object p1, p1, Landroidx/recyclerview/widget/c2;->b:Ljava/util/ArrayList;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    :cond_4
    if-lez v1, :cond_5

    iget-object p1, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_5
    return-void
.end method

.method public removeAndRecycleView(Landroid/view/View;Landroidx/recyclerview/widget/c2;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/u1;->removeView(Landroid/view/View;)V

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/c2;->i(Landroid/view/View;)V

    return-void
.end method

.method public removeAndRecycleViewAt(ILandroidx/recyclerview/widget/c2;)V
    .locals 1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/u1;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/u1;->removeViewAt(I)V

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/c2;->i(Landroid/view/View;)V

    return-void
.end method

.method public removeCallbacks(Ljava/lang/Runnable;)Z
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public removeDetachedView(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    return-void
.end method

.method public removeView(Landroid/view/View;)V
    .locals 6
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mChildHelper:Landroidx/recyclerview/widget/j;

    iget-object v1, v0, Landroidx/recyclerview/widget/j;->a:Landroidx/recyclerview/widget/g1;

    iget v2, v0, Landroidx/recyclerview/widget/j;->d:I

    const/4 v3, 0x1

    if-eq v2, v3, :cond_3

    const/4 v4, 0x2

    if-eq v2, v4, :cond_2

    const/4 v2, 0x0

    const/4 v4, 0x0

    :try_start_0
    iput v3, v0, Landroidx/recyclerview/widget/j;->d:I

    iput-object p1, v0, Landroidx/recyclerview/widget/j;->e:Landroid/view/View;

    iget-object v3, v1, Landroidx/recyclerview/widget/g1;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gez v3, :cond_0

    :goto_0
    iput v4, v0, Landroidx/recyclerview/widget/j;->d:I

    iput-object v2, v0, Landroidx/recyclerview/widget/j;->e:Landroid/view/View;

    return-void

    :cond_0
    :try_start_1
    iget-object v5, v0, Landroidx/recyclerview/widget/j;->b:Lan/d;

    invoke-virtual {v5, v3}, Lan/d;->L(I)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/j;->l(Landroid/view/View;)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_1
    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/g1;->c(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :goto_2
    iput v4, v0, Landroidx/recyclerview/widget/j;->d:I

    iput-object v2, v0, Landroidx/recyclerview/widget/j;->e:Landroid/view/View;

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot call removeView(At) within removeViewIfHidden"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot call removeView(At) within removeView(At)"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public removeViewAt(I)V
    .locals 1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/u1;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mChildHelper:Landroidx/recyclerview/widget/j;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/j;->k(I)V

    :cond_0
    return-void
.end method

.method public requestChildRectangleOnScreen(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    .line 30
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/u1;->requestChildRectangleOnScreen(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z

    move-result p1

    return p1
.end method

.method public requestChildRectangleOnScreen(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingLeft()I

    move-result v0

    .line 2
    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingTop()I

    move-result v1

    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingRight()I

    move-result v3

    sub-int/2addr v2, v3

    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getHeight()I

    move-result v3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingBottom()I

    move-result v4

    sub-int/2addr v3, v4

    .line 5
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v4

    iget v5, p3, Landroid/graphics/Rect;->left:I

    add-int/2addr v4, v5

    invoke-virtual {p2}, Landroid/view/View;->getScrollX()I

    move-result v5

    sub-int/2addr v4, v5

    .line 6
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v5

    iget v6, p3, Landroid/graphics/Rect;->top:I

    add-int/2addr v5, v6

    invoke-virtual {p2}, Landroid/view/View;->getScrollY()I

    move-result p2

    sub-int/2addr v5, p2

    .line 7
    invoke-virtual {p3}, Landroid/graphics/Rect;->width()I

    move-result p2

    add-int/2addr p2, v4

    .line 8
    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    move-result p3

    add-int/2addr p3, v5

    sub-int/2addr v4, v0

    const/4 v0, 0x0

    .line 9
    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v6

    sub-int/2addr v5, v1

    .line 10
    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v1

    sub-int/2addr p2, v2

    .line 11
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result v2

    sub-int/2addr p3, v3

    .line 12
    invoke-static {v0, p3}, Ljava/lang/Math;->max(II)I

    move-result p3

    .line 13
    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getLayoutDirection()I

    move-result v3

    const/4 v7, 0x1

    if-ne v3, v7, :cond_1

    if-eqz v2, :cond_0

    goto :goto_1

    .line 14
    :cond_0
    invoke-static {v6, p2}, Ljava/lang/Math;->max(II)I

    move-result v2

    goto :goto_1

    :cond_1
    if-eqz v6, :cond_2

    goto :goto_0

    .line 15
    :cond_2
    invoke-static {v4, v2}, Ljava/lang/Math;->min(II)I

    move-result v6

    :goto_0
    move v2, v6

    :goto_1
    if-eqz v1, :cond_3

    goto :goto_2

    .line 16
    :cond_3
    invoke-static {v5, p3}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 17
    :goto_2
    filled-new-array {v2, v1}, [I

    move-result-object p2

    .line 18
    aget p3, p2, v0

    .line 19
    aget p2, p2, v7

    if-eqz p5, :cond_5

    .line 20
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    move-result-object p5

    if-nez p5, :cond_4

    goto :goto_3

    .line 21
    :cond_4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingLeft()I

    move-result v1

    .line 22
    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingTop()I

    move-result v2

    .line 23
    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingRight()I

    move-result v4

    sub-int/2addr v3, v4

    .line 24
    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getHeight()I

    move-result v4

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingBottom()I

    move-result v5

    sub-int/2addr v4, v5

    .line 25
    iget-object v5, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v5, v5, Landroidx/recyclerview/widget/RecyclerView;->mTempRect:Landroid/graphics/Rect;

    .line 26
    invoke-virtual {p0, p5, v5}, Landroidx/recyclerview/widget/u1;->getDecoratedBoundsWithMargins(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 27
    iget p5, v5, Landroid/graphics/Rect;->left:I

    sub-int/2addr p5, p3

    if-ge p5, v3, :cond_6

    iget p5, v5, Landroid/graphics/Rect;->right:I

    sub-int/2addr p5, p3

    if-le p5, v1, :cond_6

    iget p5, v5, Landroid/graphics/Rect;->top:I

    sub-int/2addr p5, p2

    if-ge p5, v4, :cond_6

    iget p5, v5, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr p5, p2

    if-gt p5, v2, :cond_5

    goto :goto_3

    :cond_5
    if-nez p3, :cond_7

    if-eqz p2, :cond_6

    goto :goto_4

    :cond_6
    :goto_3
    return v0

    :cond_7
    :goto_4
    if-eqz p4, :cond_8

    .line 28
    invoke-virtual {p1, p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    goto :goto_5

    :cond_8
    const/4 p4, 0x0

    .line 29
    invoke-virtual {p1, p3, p2, p4}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollBy(IILandroid/view/animation/Interpolator;)V

    :goto_5
    return v7
.end method

.method public requestLayout()V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    :cond_0
    return-void
.end method

.method public requestSimpleAnimationsInNextLayout()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/recyclerview/widget/u1;->mRequestedSimpleAnimations:Z

    return-void
.end method

.method public abstract scrollHorizontallyBy(ILandroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;)I
.end method

.method public abstract scrollToPosition(I)V
.end method

.method public abstract scrollVerticallyBy(ILandroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;)I
.end method

.method public setAutoMeasureEnabled(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-boolean p1, p0, Landroidx/recyclerview/widget/u1;->mAutoMeasure:Z

    return-void
.end method

.method public setExactMeasureSpecsFrom(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    invoke-virtual {p0, v0, p1}, Landroidx/recyclerview/widget/u1;->setMeasureSpecs(II)V

    return-void
.end method

.method public final setItemPrefetchEnabled(Z)V
    .locals 1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/u1;->mItemPrefetchEnabled:Z

    if-eq p1, v0, :cond_0

    iput-boolean p1, p0, Landroidx/recyclerview/widget/u1;->mItemPrefetchEnabled:Z

    const/4 p1, 0x0

    iput p1, p0, Landroidx/recyclerview/widget/u1;->mPrefetchMaxCountObserved:I

    iget-object p1, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p1, :cond_0

    iget-object p1, p1, Landroidx/recyclerview/widget/RecyclerView;->mRecycler:Landroidx/recyclerview/widget/c2;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/c2;->n()V

    :cond_0
    return-void
.end method

.method public setMeasureSpecs(II)V
    .locals 1

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/u1;->mWidth:I

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/u1;->mWidthMode:I

    const/4 v0, 0x0

    if-nez p1, :cond_0

    sget-boolean p1, Landroidx/recyclerview/widget/RecyclerView;->ALLOW_SIZE_IN_UNSPECIFIED_SPEC:Z

    if-nez p1, :cond_0

    iput v0, p0, Landroidx/recyclerview/widget/u1;->mWidth:I

    :cond_0
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/u1;->mHeight:I

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/u1;->mHeightMode:I

    if-nez p1, :cond_1

    sget-boolean p1, Landroidx/recyclerview/widget/RecyclerView;->ALLOW_SIZE_IN_UNSPECIFIED_SPEC:Z

    if-nez p1, :cond_1

    iput v0, p0, Landroidx/recyclerview/widget/u1;->mHeight:I

    :cond_1
    return-void
.end method

.method public setMeasuredDimension(II)V
    .locals 1

    .line 6
    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->access$500(Landroidx/recyclerview/widget/RecyclerView;II)V

    return-void
.end method

.method public setMeasuredDimension(Landroid/graphics/Rect;II)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingLeft()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingRight()I

    move-result v0

    add-int/2addr v0, v1

    .line 2
    invoke-virtual {p1}, Landroid/graphics/Rect;->height()I

    move-result p1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingTop()I

    move-result v1

    add-int/2addr v1, p1

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getPaddingBottom()I

    move-result p1

    add-int/2addr p1, v1

    .line 3
    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getMinimumWidth()I

    move-result v1

    invoke-static {p2, v0, v1}, Landroidx/recyclerview/widget/u1;->chooseSize(III)I

    move-result p2

    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getMinimumHeight()I

    move-result v0

    invoke-static {p3, p1, v0}, Landroidx/recyclerview/widget/u1;->chooseSize(III)I

    move-result p1

    .line 5
    invoke-virtual {p0, p2, p1}, Landroidx/recyclerview/widget/u1;->setMeasuredDimension(II)V

    return-void
.end method

.method public setMeasuredDimensionFromChildren(II)V
    .locals 8

    invoke-virtual {p0}, Landroidx/recyclerview/widget/u1;->getChildCount()I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->defaultOnMeasure(II)V

    return-void

    :cond_0
    const/high16 v1, -0x80000000

    const v2, 0x7fffffff

    const/4 v3, 0x0

    move v4, v2

    move v5, v3

    move v2, v1

    move v3, v4

    :goto_0
    if-ge v5, v0, :cond_5

    invoke-virtual {p0, v5}, Landroidx/recyclerview/widget/u1;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    iget-object v7, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v7, v7, Landroidx/recyclerview/widget/RecyclerView;->mTempRect:Landroid/graphics/Rect;

    invoke-virtual {p0, v6, v7}, Landroidx/recyclerview/widget/u1;->getDecoratedBoundsWithMargins(Landroid/view/View;Landroid/graphics/Rect;)V

    iget v6, v7, Landroid/graphics/Rect;->left:I

    if-ge v6, v3, :cond_1

    move v3, v6

    :cond_1
    iget v6, v7, Landroid/graphics/Rect;->right:I

    if-le v6, v1, :cond_2

    move v1, v6

    :cond_2
    iget v6, v7, Landroid/graphics/Rect;->top:I

    if-ge v6, v4, :cond_3

    move v4, v6

    :cond_3
    iget v6, v7, Landroid/graphics/Rect;->bottom:I

    if-le v6, v2, :cond_4

    move v2, v6

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_5
    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->mTempRect:Landroid/graphics/Rect;

    invoke-virtual {v0, v3, v4, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->mTempRect:Landroid/graphics/Rect;

    invoke-virtual {p0, v0, p1, p2}, Landroidx/recyclerview/widget/u1;->setMeasuredDimension(Landroid/graphics/Rect;II)V

    return-void
.end method

.method public setMeasurementCacheEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/recyclerview/widget/u1;->mMeasurementCacheEnabled:Z

    return-void
.end method

.method public setRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, Landroidx/recyclerview/widget/u1;->mChildHelper:Landroidx/recyclerview/widget/j;

    const/4 p1, 0x0

    iput p1, p0, Landroidx/recyclerview/widget/u1;->mWidth:I

    iput p1, p0, Landroidx/recyclerview/widget/u1;->mHeight:I

    goto :goto_0

    :cond_0
    iput-object p1, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView;->mChildHelper:Landroidx/recyclerview/widget/j;

    iput-object v0, p0, Landroidx/recyclerview/widget/u1;->mChildHelper:Landroidx/recyclerview/widget/j;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/u1;->mWidth:I

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/u1;->mHeight:I

    :goto_0
    const/high16 p1, 0x40000000    # 2.0f

    iput p1, p0, Landroidx/recyclerview/widget/u1;->mWidthMode:I

    iput p1, p0, Landroidx/recyclerview/widget/u1;->mHeightMode:I

    return-void
.end method

.method public shouldMeasureChild(Landroid/view/View;IILandroidx/recyclerview/widget/v1;)Z
    .locals 2

    invoke-virtual {p1}, Landroid/view/View;->isLayoutRequested()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Landroidx/recyclerview/widget/u1;->mMeasurementCacheEnabled:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    iget v1, p4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v0, p2, v1}, Landroidx/recyclerview/widget/u1;->b(III)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result p1

    iget p2, p4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {p1, p3, p2}, Landroidx/recyclerview/widget/u1;->b(III)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public shouldMeasureTwice()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public shouldReMeasureChild(Landroid/view/View;IILandroidx/recyclerview/widget/v1;)Z
    .locals 2

    iget-boolean v0, p0, Landroidx/recyclerview/widget/u1;->mMeasurementCacheEnabled:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget v1, p4, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-static {v0, p2, v1}, Landroidx/recyclerview/widget/u1;->b(III)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result p1

    iget p2, p4, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-static {p1, p3, p2}, Landroidx/recyclerview/widget/u1;->b(III)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public abstract smoothScrollToPosition(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/k2;I)V
.end method

.method public startSmoothScroll(Landroidx/recyclerview/widget/j2;)V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "UnknownNullness"
        }
    .end annotation

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mSmoothScroller:Landroidx/recyclerview/widget/j2;

    if-eqz v0, :cond_0

    if-eq p1, v0, :cond_0

    iget-boolean v1, v0, Landroidx/recyclerview/widget/j2;->e:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/j2;->d()V

    :cond_0
    iput-object p1, p0, Landroidx/recyclerview/widget/u1;->mSmoothScroller:Landroidx/recyclerview/widget/j2;

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->mViewFlinger:Landroidx/recyclerview/widget/n2;

    iget-object v2, v1, Landroidx/recyclerview/widget/n2;->G:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v1, v1, Landroidx/recyclerview/widget/n2;->y:Landroid/widget/OverScroller;

    invoke-virtual {v1}, Landroid/widget/OverScroller;->abortAnimation()V

    iget-boolean v1, p1, Landroidx/recyclerview/widget/j2;->h:Z

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "An instance of "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " was started more than once. Each instance of"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " is intended to only be used once. You should create a new instance for each use."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "RecyclerView"

    invoke-static {v2, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    iput-object v0, p1, Landroidx/recyclerview/widget/j2;->b:Landroidx/recyclerview/widget/RecyclerView;

    iput-object p0, p1, Landroidx/recyclerview/widget/j2;->c:Landroidx/recyclerview/widget/u1;

    iget v1, p1, Landroidx/recyclerview/widget/j2;->a:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_2

    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->mState:Landroidx/recyclerview/widget/k2;

    iput v1, v2, Landroidx/recyclerview/widget/k2;->a:I

    const/4 v2, 0x1

    iput-boolean v2, p1, Landroidx/recyclerview/widget/j2;->e:Z

    iput-boolean v2, p1, Landroidx/recyclerview/widget/j2;->d:Z

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->mLayout:Landroidx/recyclerview/widget/u1;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/u1;->findViewByPosition(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p1, Landroidx/recyclerview/widget/j2;->f:Landroid/view/View;

    iget-object v0, p1, Landroidx/recyclerview/widget/j2;->b:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->mViewFlinger:Landroidx/recyclerview/widget/n2;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/n2;->b()V

    iput-boolean v2, p1, Landroidx/recyclerview/widget/j2;->h:Z

    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid target position"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public stopIgnoringView(Landroid/view/View;)V
    .locals 1

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolderInt(Landroid/view/View;)Landroidx/recyclerview/widget/o2;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/recyclerview/widget/o2;->stopIgnoring()V

    invoke-virtual {p1}, Landroidx/recyclerview/widget/o2;->resetInternal()V

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/o2;->addFlags(I)V

    return-void
.end method

.method public stopSmoothScroller()V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/u1;->mSmoothScroller:Landroidx/recyclerview/widget/j2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/j2;->d()V

    :cond_0
    return-void
.end method

.method public supportsPredictiveItemAnimations()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
