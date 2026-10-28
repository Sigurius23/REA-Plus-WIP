.class public Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;
.super Landroid/widget/HorizontalScrollView;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$a;,
        Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$b;
    }
.end annotation


# instance fields
.field private E:Landroidx/viewpager/widget/ViewPager;

.field private F:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private G:Lfc/g;

.field private H:Lcom/whoop/realtime/presentation/views/a;

.field private w:I

.field private x:I

.field private y:I

.field private z:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    .line 2
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->F:Landroid/util/SparseArray;

    .line 4
    invoke-direct {p0}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->f()V

    .line 5
    sget-object v0, Lk52/h;->m:[I

    const/4 v1, 0x0

    .line 6
    invoke-virtual {p1, p2, v0, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 7
    invoke-direct {p0, p1}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->h(Landroid/content/res/TypedArray;)V

    .line 8
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static bridge synthetic a(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;)Lcom/whoop/realtime/presentation/views/a;
    .locals 0

    iget-object p0, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->H:Lcom/whoop/realtime/presentation/views/a;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;)Landroidx/viewpager/widget/ViewPager;
    .locals 0

    iget-object p0, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->E:Landroidx/viewpager/widget/ViewPager;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;)Lfc/g;
    .locals 0

    iget-object p0, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->G:Lfc/g;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->i(II)V

    return-void
.end method

.method private f()V
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/widget/HorizontalScrollView;->setFillViewport(Z)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x41c00000    # 24.0f

    mul-float/2addr v0, v1

    float-to-int v0, v0

    iput v0, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->w:I

    new-instance v0, Lcom/whoop/realtime/presentation/views/a;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/whoop/realtime/presentation/views/a;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->H:Lcom/whoop/realtime/presentation/views/a;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-virtual {p0, v0, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    return-void
.end method

.method private g()V
    .locals 9

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->E:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getAdapter()Lfc/a;

    move-result-object v0

    new-instance v1, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$b;-><init>(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;I)V

    iget-object v3, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->H:Lcom/whoop/realtime/presentation/views/a;

    invoke-virtual {v3}, Landroid/view/ViewGroup;->removeAllViews()V

    move v3, v2

    :goto_0
    invoke-virtual {v0}, Lfc/a;->d()I

    move-result v4

    if-ge v3, v4, :cond_6

    iget v4, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->x:I

    const/4 v5, 0x0

    if-eqz v4, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    iget v6, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->x:I

    iget-object v7, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->H:Lcom/whoop/realtime/presentation/views/a;

    invoke-virtual {v4, v6, v7, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    iget v6, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->y:I

    invoke-virtual {v4, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    goto :goto_1

    :cond_0
    move-object v4, v5

    move-object v6, v4

    :goto_1
    if-nez v4, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {p0, v4}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->e(Landroid/content/Context;)Landroid/widget/TextView;

    move-result-object v4

    :cond_1
    if-nez v6, :cond_2

    const-class v7, Landroid/widget/TextView;

    invoke-virtual {v7, v4}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    move-object v6, v4

    check-cast v6, Landroid/widget/TextView;

    :cond_2
    iget-boolean v7, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->z:Z

    if-eqz v7, :cond_3

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    check-cast v7, Landroid/widget/LinearLayout$LayoutParams;

    iput v2, v7, Landroid/widget/LinearLayout$LayoutParams;->width:I

    const/high16 v8, 0x3f800000    # 1.0f

    iput v8, v7, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    :cond_3
    invoke-virtual {v0, v3}, Lfc/a;->f(I)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v4, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v6, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->F:Landroid/util/SparseArray;

    invoke-virtual {v6, v3, v5}, Landroid/util/SparseArray;->get(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    if-eqz v5, :cond_4

    invoke-virtual {v4, v5}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_4
    iget-object v5, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->H:Lcom/whoop/realtime/presentation/views/a;

    invoke-virtual {v5, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v5, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->E:Landroidx/viewpager/widget/ViewPager;

    invoke-virtual {v5}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v5

    if-ne v3, v5, :cond_5

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Landroid/view/View;->setSelected(Z)V

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_6
    return-void
.end method

.method private h(Landroid/content/res/TypedArray;)V
    .locals 3

    sget v0, Lk52/h;->o:I

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v0

    sget v2, Lk52/h;->p:I

    invoke-virtual {p1, v2, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0, v1}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->j(II)V

    :cond_0
    sget v0, Lk52/h;->n:I

    const v1, 0x7fffffff

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result p1

    if-eq p1, v1, :cond_1

    filled-new-array {p1}, [I

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->setSelectedIndicatorColors([I)V

    :cond_1
    return-void
.end method

.method private i(II)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->H:Lcom/whoop/realtime/presentation/views/a;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-eqz v0, :cond_3

    if-ltz p1, :cond_3

    if-lt p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->H:Lcom/whoop/realtime/presentation/views/a;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    add-int/2addr v0, p2

    if-gtz p1, :cond_1

    if-lez p2, :cond_2

    :cond_1
    iget p1, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->w:I

    sub-int/2addr v0, p1

    :cond_2
    const/4 p1, 0x0

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->scrollTo(II)V

    :cond_3
    :goto_0
    return-void
.end method


# virtual methods
.method public e(Landroid/content/Context;)Landroid/widget/TextView;
    .locals 4

    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x11

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    const/4 p1, 0x2

    const/high16 v1, 0x41400000    # 12.0f

    invoke-virtual {v0, p1, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    sget-object p1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {p1, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const v2, 0x101030e

    const/4 v3, 0x1

    invoke-virtual {v1, v2, p1, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget p1, p1, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setAllCaps(Z)V

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v1, 0x41800000    # 16.0f

    mul-float/2addr p1, v1

    float-to-int p1, p1

    invoke-virtual {v0, p1, p1, p1, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    return-object v0
.end method

.method public j(II)V
    .locals 0

    iput p1, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->x:I

    iput p2, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->y:I

    return-void
.end method

.method public onAttachedToWindow()V
    .locals 2

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->E:Landroidx/viewpager/widget/ViewPager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/viewpager/widget/ViewPager;->getCurrentItem()I

    move-result v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->i(II)V

    :cond_0
    return-void
.end method

.method public setCustomTabColorizer(Lcom/whoop/realtime/presentation/views/a$b;)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->H:Lcom/whoop/realtime/presentation/views/a;

    invoke-virtual {v0, p1}, Lcom/whoop/realtime/presentation/views/a;->setCustomTabColorizer(Lcom/whoop/realtime/presentation/views/a$b;)V

    return-void
.end method

.method public setDistributeEvenly(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->z:Z

    return-void
.end method

.method public setOnPageChangeListener(Lfc/g;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->G:Lfc/g;

    return-void
.end method

.method public varargs setSelectedIndicatorColors([I)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->H:Lcom/whoop/realtime/presentation/views/a;

    invoke-virtual {v0, p1}, Lcom/whoop/realtime/presentation/views/a;->setSelectedIndicatorColors([I)V

    return-void
.end method

.method public setViewPager(Landroidx/viewpager/widget/ViewPager;)V
    .locals 2

    iget-object v0, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->H:Lcom/whoop/realtime/presentation/views/a;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iput-object p1, p0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->E:Landroidx/viewpager/widget/ViewPager;

    if-eqz p1, :cond_0

    new-instance v0, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator$a;-><init>(Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;I)V

    invoke-virtual {p1, v0}, Landroidx/viewpager/widget/ViewPager;->setOnPageChangeListener(Lfc/g;)V

    invoke-direct {p0}, Lcom/whoop/realtime/presentation/views/SlidingTabIndicator;->g()V

    :cond_0
    return-void
.end method
