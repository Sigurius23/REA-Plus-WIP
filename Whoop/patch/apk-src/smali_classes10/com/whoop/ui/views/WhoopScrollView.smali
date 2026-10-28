.class public Lcom/whoop/ui/views/WhoopScrollView;
.super Landroid/widget/ScrollView;
.source "SourceFile"


# instance fields
.field private w:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, -0x1

    iput v0, p0, Lcom/whoop/ui/views/WhoopScrollView;->w:I

    sget-object v0, Lvu1/j;->H0:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/ui/views/WhoopScrollView;->a(Landroid/content/res/TypedArray;)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private a(Landroid/content/res/TypedArray;)V
    .locals 2

    if-eqz p1, :cond_0

    sget v0, Lvu1/j;->I0:I

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result p1

    iput p1, p0, Lcom/whoop/ui/views/WhoopScrollView;->w:I

    :cond_0
    return-void
.end method


# virtual methods
.method public onMeasure(II)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/widget/ScrollView;->onMeasure(II)V

    iget p2, p0, Lcom/whoop/ui/views/WhoopScrollView;->w:I

    if-ltz p2, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    iget v0, p0, Lcom/whoop/ui/views/WhoopScrollView;->w:I

    if-le p2, v0, :cond_0

    const/high16 p2, -0x80000000

    invoke-static {v0, p2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    invoke-super {p0, p1, p2}, Landroid/widget/ScrollView;->onMeasure(II)V

    :cond_0
    return-void
.end method
