.class public final Landroidx/viewpager2/widget/ViewPager2;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# instance fields
.field public E:Z

.field public final F:Lhc/d;

.field public G:Lhc/g;

.field public H:I

.field public I:Landroid/os/Parcelable;

.field public J:Lhc/l;

.field public K:Lhc/k;

.field public L:Lhc/c;

.field public M:Landroidx/viewpager2/adapter/d;

.field public N:Le10/k0;

.field public O:Lhc/b;

.field public P:Landroidx/recyclerview/widget/p1;

.field public Q:Z

.field public R:Z

.field public S:I

.field public T:La00/g;

.field public final w:Landroid/graphics/Rect;

.field public final x:Landroid/graphics/Rect;

.field public final y:Landroidx/viewpager2/adapter/d;

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Landroid/graphics/Rect;

    .line 3
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->x:Landroid/graphics/Rect;

    .line 4
    new-instance v0, Landroidx/viewpager2/adapter/d;

    invoke-direct {v0}, Landroidx/viewpager2/adapter/d;-><init>()V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->y:Landroidx/viewpager2/adapter/d;

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->E:Z

    .line 6
    new-instance v1, Lhc/d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lhc/d;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->F:Lhc/d;

    const/4 v1, -0x1

    .line 7
    iput v1, p0, Landroidx/viewpager2/widget/ViewPager2;->H:I

    const/4 v2, 0x0

    .line 8
    iput-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->P:Landroidx/recyclerview/widget/p1;

    .line 9
    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->Q:Z

    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->R:Z

    .line 11
    iput v1, p0, Landroidx/viewpager2/widget/ViewPager2;->S:I

    .line 12
    invoke-virtual {p0, p1, v2}, Landroidx/viewpager2/widget/ViewPager2;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    .line 13
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 14
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Landroid/graphics/Rect;

    .line 15
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->x:Landroid/graphics/Rect;

    .line 16
    new-instance v0, Landroidx/viewpager2/adapter/d;

    invoke-direct {v0}, Landroidx/viewpager2/adapter/d;-><init>()V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->y:Landroidx/viewpager2/adapter/d;

    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->E:Z

    .line 18
    new-instance v1, Lhc/d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lhc/d;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->F:Lhc/d;

    const/4 v1, -0x1

    .line 19
    iput v1, p0, Landroidx/viewpager2/widget/ViewPager2;->H:I

    const/4 v2, 0x0

    .line 20
    iput-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->P:Landroidx/recyclerview/widget/p1;

    .line 21
    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->Q:Z

    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->R:Z

    .line 23
    iput v1, p0, Landroidx/viewpager2/widget/ViewPager2;->S:I

    .line 24
    invoke-virtual {p0, p1, p2}, Landroidx/viewpager2/widget/ViewPager2;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 8

    new-instance v0, La00/g;

    invoke-direct {v0, p0}, La00/g;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->T:La00/g;

    new-instance v0, Lhc/l;

    invoke-direct {v0, p0, p1}, Lhc/l;-><init>(Landroidx/viewpager2/widget/ViewPager2;Landroid/content/Context;)V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    const/high16 v1, 0x20000

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    new-instance v0, Lhc/g;

    invoke-direct {v0, p0}, Lhc/g;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->G:Lhc/g;

    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/u1;)V

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setScrollingTouchSlop(I)V

    sget-object v4, Lgc/a;->a:[I

    invoke-virtual {p1, p2, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v6

    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v5, p2

    invoke-static/range {v2 .. v7}, Lh5/p0;->m(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    const/4 p1, 0x0

    :try_start_0
    invoke-virtual {v6, p1, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p2

    invoke-virtual {p0, p2}, Landroidx/viewpager2/widget/ViewPager2;->setOrientation(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    iget-object p2, v2, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v3, -0x1

    invoke-direct {v0, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p2, v2, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    new-instance v0, Lhc/f;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnChildAttachStateChangeListener(Landroidx/recyclerview/widget/w1;)V

    new-instance p2, Lhc/c;

    invoke-direct {p2, p0}, Lhc/c;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    iput-object p2, v2, Landroidx/viewpager2/widget/ViewPager2;->L:Lhc/c;

    new-instance v0, Le10/k0;

    const/16 v3, 0x1d

    invoke-direct {v0, p2, v3}, Le10/k0;-><init>(Ljava/lang/Object;I)V

    iput-object v0, v2, Landroidx/viewpager2/widget/ViewPager2;->N:Le10/k0;

    new-instance p2, Lhc/k;

    invoke-direct {p2, p0}, Lhc/k;-><init>(Landroidx/viewpager2/widget/ViewPager2;)V

    iput-object p2, v2, Landroidx/viewpager2/widget/ViewPager2;->K:Lhc/k;

    iget-object v0, v2, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/e1;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    iget-object p2, v2, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    iget-object v0, v2, Landroidx/viewpager2/widget/ViewPager2;->L:Lhc/c;

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/z1;)V

    new-instance p2, Landroidx/viewpager2/adapter/d;

    invoke-direct {p2}, Landroidx/viewpager2/adapter/d;-><init>()V

    iput-object p2, v2, Landroidx/viewpager2/widget/ViewPager2;->M:Landroidx/viewpager2/adapter/d;

    iget-object v0, v2, Landroidx/viewpager2/widget/ViewPager2;->L:Lhc/c;

    iput-object p2, v0, Lhc/c;->a:Landroidx/viewpager2/adapter/d;

    new-instance v0, Lhc/e;

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3}, Lhc/e;-><init>(Landroidx/viewpager2/widget/ViewPager2;I)V

    new-instance v3, Lhc/e;

    const/4 v4, 0x1

    invoke-direct {v3, p0, v4}, Lhc/e;-><init>(Landroidx/viewpager2/widget/ViewPager2;I)V

    iget-object p2, p2, Landroidx/viewpager2/adapter/d;->b:Ljava/lang/Object;

    check-cast p2, Ljava/util/ArrayList;

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p2, v2, Landroidx/viewpager2/widget/ViewPager2;->M:Landroidx/viewpager2/adapter/d;

    iget-object p2, p2, Landroidx/viewpager2/adapter/d;->b:Ljava/lang/Object;

    check-cast p2, Ljava/util/ArrayList;

    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p2, v2, Landroidx/viewpager2/widget/ViewPager2;->T:La00/g;

    iget-object v0, v2, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x2

    invoke-virtual {v0, v3}, Landroid/view/View;->setImportantForAccessibility(I)V

    new-instance v0, Lhc/d;

    const/4 v3, 0x1

    invoke-direct {v0, p2, v3}, Lhc/d;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p2, La00/g;->z:Ljava/lang/Object;

    iget-object p2, p2, La00/g;->E:Ljava/lang/Object;

    check-cast p2, Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p2}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p2, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    :cond_0
    iget-object p2, v2, Landroidx/viewpager2/widget/ViewPager2;->M:Landroidx/viewpager2/adapter/d;

    iget-object p2, p2, Landroidx/viewpager2/adapter/d;->b:Ljava/lang/Object;

    check-cast p2, Ljava/util/ArrayList;

    iget-object v0, v2, Landroidx/viewpager2/widget/ViewPager2;->y:Landroidx/viewpager2/adapter/d;

    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p2, Lhc/b;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p2, v2, Landroidx/viewpager2/widget/ViewPager2;->O:Lhc/b;

    iget-object v0, v2, Landroidx/viewpager2/widget/ViewPager2;->M:Landroidx/viewpager2/adapter/d;

    iget-object v0, v0, Landroidx/viewpager2/adapter/d;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p2, v2, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {p0, p2, p1, v0}, Landroid/view/ViewGroup;->attachViewToParent(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void

    :catchall_0
    move-exception v0

    move-object p1, v0

    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    throw p1
.end method

.method public final b(Lhc/h;)V
    .locals 1

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->y:Landroidx/viewpager2/adapter/d;

    iget-object v0, v0, Landroidx/viewpager2/adapter/d;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final c()V
    .locals 4

    iget v0, p0, Landroidx/viewpager2/widget/ViewPager2;->H:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/i1;

    move-result-object v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    :cond_1
    iget-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->I:Landroid/os/Parcelable;

    if-eqz v2, :cond_3

    instance-of v3, v0, Landroidx/viewpager2/adapter/i;

    if-eqz v3, :cond_2

    move-object v3, v0

    check-cast v3, Landroidx/viewpager2/adapter/i;

    invoke-virtual {v3, v2}, Landroidx/viewpager2/adapter/i;->restoreState(Landroid/os/Parcelable;)V

    :cond_2
    const/4 v2, 0x0

    iput-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->I:Landroid/os/Parcelable;

    :cond_3
    iget v2, p0, Landroidx/viewpager2/widget/ViewPager2;->H:I

    invoke-virtual {v0}, Landroidx/recyclerview/widget/i1;->getItemCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v2, 0x0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Landroidx/viewpager2/widget/ViewPager2;->z:I

    iput v1, p0, Landroidx/viewpager2/widget/ViewPager2;->H:I

    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->T:La00/g;

    invoke-virtual {v0}, La00/g;->P()V

    return-void
.end method

.method public final canScrollHorizontally(I)Z
    .locals 1

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-virtual {v0, p1}, Landroid/view/View;->canScrollHorizontally(I)Z

    move-result p1

    return p1
.end method

.method public final canScrollVertically(I)Z
    .locals 1

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-virtual {v0, p1}, Landroid/view/View;->canScrollVertically(I)Z

    move-result p1

    return p1
.end method

.method public final d(IZ)V
    .locals 1

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->N:Le10/k0;

    iget-object v0, v0, Le10/k0;->x:Ljava/lang/Object;

    invoke-virtual {p0, p1, p2}, Landroidx/viewpager2/widget/ViewPager2;->e(IZ)V

    return-void
.end method

.method public final dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .locals 3

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Parcelable;

    instance-of v1, v0, Lhc/m;

    if-eqz v1, :cond_0

    check-cast v0, Lhc/m;

    iget v0, v0, Lhc/m;->w:I

    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v1

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Parcelable;

    invoke-virtual {p1, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->remove(I)V

    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchRestoreInstanceState(Landroid/util/SparseArray;)V

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->c()V

    return-void
.end method

.method public final e(IZ)V
    .locals 9

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/i1;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget p2, p0, Landroidx/viewpager2/widget/ViewPager2;->H:I

    const/4 v0, -0x1

    if-eq p2, v0, :cond_3

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Landroidx/viewpager2/widget/ViewPager2;->H:I

    return-void

    :cond_0
    invoke-virtual {v0}, Landroidx/recyclerview/widget/i1;->getItemCount()I

    move-result v2

    if-gtz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-virtual {v0}, Landroidx/recyclerview/widget/i1;->getItemCount()I

    move-result v0

    const/4 v2, 0x1

    sub-int/2addr v0, v2

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    iget v0, p0, Landroidx/viewpager2/widget/ViewPager2;->z:I

    if-ne p1, v0, :cond_2

    iget-object v3, p0, Landroidx/viewpager2/widget/ViewPager2;->L:Lhc/c;

    iget v3, v3, Lhc/c;->f:I

    if-nez v3, :cond_2

    return-void

    :cond_2
    if-ne p1, v0, :cond_4

    if-eqz p2, :cond_4

    :cond_3
    :goto_0
    return-void

    :cond_4
    int-to-double v3, v0

    iput p1, p0, Landroidx/viewpager2/widget/ViewPager2;->z:I

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->T:La00/g;

    invoke-virtual {v0}, La00/g;->P()V

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->L:Lhc/c;

    iget v5, v0, Lhc/c;->f:I

    if-nez v5, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {v0}, Lhc/c;->d()V

    iget-object v0, v0, Lhc/c;->g:Lfo/c;

    iget v3, v0, Lfo/c;->a:I

    int-to-double v3, v3

    iget v0, v0, Lfo/c;->b:F

    float-to-double v5, v0

    add-double/2addr v3, v5

    :goto_1
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->L:Lhc/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v5, 0x2

    if-eqz p2, :cond_6

    move v6, v5

    goto :goto_2

    :cond_6
    const/4 v6, 0x3

    :goto_2
    iput v6, v0, Lhc/c;->e:I

    iget v6, v0, Lhc/c;->i:I

    if-eq v6, p1, :cond_7

    move v1, v2

    :cond_7
    iput p1, v0, Lhc/c;->i:I

    invoke-virtual {v0, v5}, Lhc/c;->b(I)V

    if-eqz v1, :cond_8

    invoke-virtual {v0, p1}, Lhc/c;->a(I)V

    :cond_8
    if-nez p2, :cond_9

    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    return-void

    :cond_9
    int-to-double v0, p1

    sub-double v5, v0, v3

    invoke-static {v5, v6}, Ljava/lang/Math;->abs(D)D

    move-result-wide v5

    const-wide/high16 v7, 0x4008000000000000L    # 3.0

    cmpl-double p2, v5, v7

    if-lez p2, :cond_b

    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    cmpl-double v0, v0, v3

    if-lez v0, :cond_a

    add-int/lit8 v0, p1, -0x3

    goto :goto_3

    :cond_a
    add-int/lit8 v0, p1, 0x3

    :goto_3
    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    new-instance v0, Lc5/a;

    invoke-direct {v0, p1, p2}, Lc5/a;-><init>(ILhc/l;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_b
    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/RecyclerView;->smoothScrollToPosition(I)V

    return-void
.end method

.method public final f()V
    .locals 2

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->K:Lhc/k;

    if-eqz v0, :cond_2

    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->G:Lhc/g;

    invoke-virtual {v0, v1}, Lhc/k;->e(Landroidx/recyclerview/widget/u1;)Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->G:Lhc/g;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/u1;->getPosition(Landroid/view/View;)I

    move-result v0

    iget v1, p0, Landroidx/viewpager2/widget/ViewPager2;->z:I

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getScrollState()I

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->M:Landroidx/viewpager2/adapter/d;

    invoke-virtual {v1, v0}, Landroidx/viewpager2/adapter/d;->onPageSelected(I)V

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->E:Z

    return-void

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Design assumption violated."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->T:La00/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->T:La00/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "androidx.viewpager.widget.ViewPager"

    return-object v0
.end method

.method public getAdapter()Landroidx/recyclerview/widget/i1;
    .locals 1

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/i1;

    move-result-object v0

    return-object v0
.end method

.method public getCurrentItem()I
    .locals 1

    iget v0, p0, Landroidx/viewpager2/widget/ViewPager2;->z:I

    return v0
.end method

.method public getItemDecorationCount()I
    .locals 1

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getItemDecorationCount()I

    move-result v0

    return v0
.end method

.method public getOffscreenPageLimit()I
    .locals 1

    iget v0, p0, Landroidx/viewpager2/widget/ViewPager2;->S:I

    return v0
.end method

.method public getOrientation()I
    .locals 2

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->G:Lhc/g;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->getOrientation()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getPageSize()I
    .locals 3

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->getOrientation()I

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v0

    :goto_0
    sub-int/2addr v1, v0

    return v1

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    goto :goto_0
.end method

.method public getScrollState()I
    .locals 1

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->L:Lhc/c;

    iget v0, v0, Lhc/c;->f:I

    return v0
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V
    .locals 5

    invoke-super {p0, p1}, Landroid/view/View;->onInitializeAccessibilityNodeInfo(Landroid/view/accessibility/AccessibilityNodeInfo;)V

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->T:La00/g;

    iget-object v0, v0, La00/g;->E:Ljava/lang/Object;

    check-cast v0, Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/i1;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getOrientation()I

    move-result v1

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/i1;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/recyclerview/widget/i1;->getItemCount()I

    move-result v1

    move v4, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/i1;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/recyclerview/widget/i1;->getItemCount()I

    move-result v1

    move v4, v1

    move v1, v2

    goto :goto_0

    :cond_1
    move v1, v3

    move v4, v1

    :goto_0
    invoke-static {v1, v4, v3, v3}, Lg9/b;->c(IIIZ)Lg9/b;

    move-result-object v1

    iget-object v1, v1, Lg9/b;->a:Ljava/lang/Object;

    check-cast v1, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;

    invoke-virtual {p1, v1}, Landroid/view/accessibility/AccessibilityNodeInfo;->setCollectionInfo(Landroid/view/accessibility/AccessibilityNodeInfo$CollectionInfo;)V

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getAdapter()Landroidx/recyclerview/widget/i1;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Landroidx/recyclerview/widget/i1;->getItemCount()I

    move-result v1

    if-eqz v1, :cond_6

    iget-boolean v3, v0, Landroidx/viewpager2/widget/ViewPager2;->R:Z

    if-nez v3, :cond_3

    goto :goto_1

    :cond_3
    iget v3, v0, Landroidx/viewpager2/widget/ViewPager2;->z:I

    if-lez v3, :cond_4

    const/16 v3, 0x2000

    invoke-virtual {p1, v3}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    :cond_4
    iget v0, v0, Landroidx/viewpager2/widget/ViewPager2;->z:I

    sub-int/2addr v1, v2

    if-ge v0, v1, :cond_5

    const/16 v0, 0x1000

    invoke-virtual {p1, v0}, Landroid/view/accessibility/AccessibilityNodeInfo;->addAction(I)V

    :cond_5
    invoke-virtual {p1, v2}, Landroid/view/accessibility/AccessibilityNodeInfo;->setScrollable(Z)V

    :cond_6
    :goto_1
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 3

    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result p1

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    iget-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->w:Landroid/graphics/Rect;

    iput v1, v2, Landroid/graphics/Rect;->left:I

    sub-int/2addr p4, p2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p2

    sub-int/2addr p4, p2

    iput p4, v2, Landroid/graphics/Rect;->right:I

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result p2

    iput p2, v2, Landroid/graphics/Rect;->top:I

    sub-int/2addr p5, p3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p2

    sub-int/2addr p5, p2

    iput p5, v2, Landroid/graphics/Rect;->bottom:I

    const p2, 0x800033

    iget-object p3, p0, Landroidx/viewpager2/widget/ViewPager2;->x:Landroid/graphics/Rect;

    invoke-static {p2, p1, v0, v2, p3}, Landroid/view/Gravity;->apply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;)V

    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    iget p2, p3, Landroid/graphics/Rect;->left:I

    iget p4, p3, Landroid/graphics/Rect;->top:I

    iget p5, p3, Landroid/graphics/Rect;->right:I

    iget p3, p3, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p1, p2, p4, p5, p3}, Landroid/view/View;->layout(IIII)V

    iget-boolean p1, p0, Landroidx/viewpager2/widget/ViewPager2;->E:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->f()V

    :cond_0
    return-void
.end method

.method public final onMeasure(II)V
    .locals 5

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-virtual {p0, v0, p1, p2}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    iget-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredState()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    add-int/2addr v4, v3

    add-int/2addr v4, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v3

    add-int/2addr v3, v0

    add-int/2addr v3, v1

    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumWidth()I

    move-result v0

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getSuggestedMinimumHeight()I

    move-result v1

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v0, p1, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result p1

    shl-int/lit8 v0, v2, 0x10

    invoke-static {v1, p2, v0}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    instance-of v0, p1, Lhc/m;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_0
    check-cast p1, Lhc/m;

    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget v0, p1, Lhc/m;->x:I

    iput v0, p0, Landroidx/viewpager2/widget/ViewPager2;->H:I

    iget-object p1, p1, Lhc/m;->y:Landroid/os/Parcelable;

    iput-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->I:Landroid/os/Parcelable;

    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Lhc/m;

    invoke-direct {v1, v0}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    iput v0, v1, Lhc/m;->w:I

    iget v0, p0, Landroidx/viewpager2/widget/ViewPager2;->H:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_0

    iget v0, p0, Landroidx/viewpager2/widget/ViewPager2;->z:I

    :cond_0
    iput v0, v1, Lhc/m;->x:I

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->I:Landroid/os/Parcelable;

    if-eqz v0, :cond_1

    iput-object v0, v1, Lhc/m;->y:Landroid/os/Parcelable;

    return-object v1

    :cond_1
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/i1;

    move-result-object v0

    instance-of v2, v0, Landroidx/viewpager2/adapter/i;

    if-eqz v2, :cond_2

    check-cast v0, Landroidx/viewpager2/adapter/i;

    invoke-virtual {v0}, Landroidx/viewpager2/adapter/i;->saveState()Landroid/os/Parcelable;

    move-result-object v0

    iput-object v0, v1, Lhc/m;->y:Landroid/os/Parcelable;

    :cond_2
    return-object v1
.end method

.method public final onViewAdded(Landroid/view/View;)V
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "ViewPager2 does not support direct child views"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final performAccessibilityAction(ILandroid/os/Bundle;)Z
    .locals 3

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->T:La00/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0x1000

    const/16 v1, 0x2000

    if-eq p1, v1, :cond_1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/View;->performAccessibilityAction(ILandroid/os/Bundle;)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    iget-object p2, p0, Landroidx/viewpager2/widget/ViewPager2;->T:La00/g;

    iget-object v2, p2, La00/g;->E:Ljava/lang/Object;

    check-cast v2, Landroidx/viewpager2/widget/ViewPager2;

    if-eq p1, v1, :cond_3

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_3
    :goto_1
    const/4 v0, 0x1

    if-ne p1, v1, :cond_4

    invoke-virtual {v2}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result p1

    sub-int/2addr p1, v0

    goto :goto_2

    :cond_4
    invoke-virtual {v2}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    move-result p1

    add-int/2addr p1, v0

    :goto_2
    iget-object p2, p2, La00/g;->E:Ljava/lang/Object;

    check-cast p2, Landroidx/viewpager2/widget/ViewPager2;

    iget-boolean v1, p2, Landroidx/viewpager2/widget/ViewPager2;->R:Z

    if-eqz v1, :cond_5

    invoke-virtual {p2, p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->e(IZ)V

    :cond_5
    return v0
.end method

.method public setAdapter(Landroidx/recyclerview/widget/i1;)V
    .locals 2

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/i1;

    move-result-object v0

    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->T:La00/g;

    if-eqz v0, :cond_0

    iget-object v1, v1, La00/g;->z:Ljava/lang/Object;

    check-cast v1, Lhc/d;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/i1;->unregisterAdapterDataObserver(Landroidx/recyclerview/widget/k1;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_0
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->F:Lhc/d;

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/i1;->unregisterAdapterDataObserver(Landroidx/recyclerview/widget/k1;)V

    :cond_1
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    const/4 v0, 0x0

    iput v0, p0, Landroidx/viewpager2/widget/ViewPager2;->z:I

    invoke-virtual {p0}, Landroidx/viewpager2/widget/ViewPager2;->c()V

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->T:La00/g;

    invoke-virtual {v0}, La00/g;->P()V

    if-eqz p1, :cond_2

    iget-object v0, v0, La00/g;->z:Ljava/lang/Object;

    check-cast v0, Lhc/d;

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/i1;->registerAdapterDataObserver(Landroidx/recyclerview/widget/k1;)V

    :cond_2
    if-eqz p1, :cond_3

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/i1;->registerAdapterDataObserver(Landroidx/recyclerview/widget/k1;)V

    :cond_3
    return-void
.end method

.method public setCurrentItem(I)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Landroidx/viewpager2/widget/ViewPager2;->d(IZ)V

    return-void
.end method

.method public setLayoutDirection(I)V
    .locals 0

    invoke-super {p0, p1}, Landroid/view/View;->setLayoutDirection(I)V

    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->T:La00/g;

    invoke-virtual {p1}, La00/g;->P()V

    return-void
.end method

.method public setOffscreenPageLimit(I)V
    .locals 1

    const/4 v0, 0x1

    if-ge p1, v0, :cond_1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput p1, p0, Landroidx/viewpager2/widget/ViewPager2;->S:I

    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    return-void
.end method

.method public setOrientation(I)V
    .locals 1

    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->G:Lhc/g;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;->setOrientation(I)V

    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->T:La00/g;

    invoke-virtual {p1}, La00/g;->P()V

    return-void
.end method

.method public setPageTransformer(Lhc/j;)V
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-boolean v1, p0, Landroidx/viewpager2/widget/ViewPager2;->Q:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/p1;

    move-result-object v1

    iput-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->P:Landroidx/recyclerview/widget/p1;

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroidx/viewpager2/widget/ViewPager2;->Q:Z

    :cond_0
    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/p1;)V

    goto :goto_0

    :cond_1
    iget-boolean v1, p0, Landroidx/viewpager2/widget/ViewPager2;->Q:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroidx/viewpager2/widget/ViewPager2;->J:Lhc/l;

    iget-object v2, p0, Landroidx/viewpager2/widget/ViewPager2;->P:Landroidx/recyclerview/widget/p1;

    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/p1;)V

    iput-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->P:Landroidx/recyclerview/widget/p1;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/viewpager2/widget/ViewPager2;->Q:Z

    :cond_2
    :goto_0
    iget-object v0, p0, Landroidx/viewpager2/widget/ViewPager2;->O:Lhc/b;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez p1, :cond_3

    return-void

    :cond_3
    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->O:Lhc/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->O:Lhc/b;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public setUserInputEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/viewpager2/widget/ViewPager2;->R:Z

    iget-object p1, p0, Landroidx/viewpager2/widget/ViewPager2;->T:La00/g;

    invoke-virtual {p1}, La00/g;->P()V

    return-void
.end method
