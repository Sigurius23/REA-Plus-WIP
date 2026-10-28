.class public Lio/getstream/chat/android/ui/widgets/GridSpacingItemDecoration;
.super Landroidx/recyclerview/widget/q1;
.source "SourceFile"


# instance fields
.field private includeEdge:Z

.field private spacing:I

.field private spanCount:I


# direct methods
.method public constructor <init>(IIZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/getstream/chat/android/ui/widgets/GridSpacingItemDecoration;->spanCount:I

    iput p2, p0, Lio/getstream/chat/android/ui/widgets/GridSpacingItemDecoration;->spacing:I

    iput-boolean p3, p0, Lio/getstream/chat/android/ui/widgets/GridSpacingItemDecoration;->includeEdge:Z

    return-void
.end method


# virtual methods
.method public final getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/k2;)V
    .locals 2

    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result p2

    iget p3, p0, Lio/getstream/chat/android/ui/widgets/GridSpacingItemDecoration;->spanCount:I

    rem-int p4, p2, p3

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/widgets/GridSpacingItemDecoration;->includeEdge:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lio/getstream/chat/android/ui/widgets/GridSpacingItemDecoration;->spacing:I

    mul-int v1, p4, v0

    div-int/2addr v1, p3

    sub-int v1, v0, v1

    iput v1, p1, Landroid/graphics/Rect;->left:I

    add-int/lit8 p4, p4, 0x1

    mul-int/2addr p4, v0

    div-int/2addr p4, p3

    iput p4, p1, Landroid/graphics/Rect;->right:I

    if-ge p2, p3, :cond_0

    iput v0, p1, Landroid/graphics/Rect;->top:I

    :cond_0
    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    return-void

    :cond_1
    iget v0, p0, Lio/getstream/chat/android/ui/widgets/GridSpacingItemDecoration;->spacing:I

    mul-int v1, p4, v0

    div-int/2addr v1, p3

    iput v1, p1, Landroid/graphics/Rect;->left:I

    add-int/lit8 p4, p4, 0x1

    mul-int/2addr p4, v0

    div-int/2addr p4, p3

    sub-int p4, v0, p4

    iput p4, p1, Landroid/graphics/Rect;->right:I

    if-lt p2, p3, :cond_2

    iput v0, p1, Landroid/graphics/Rect;->top:I

    :cond_2
    return-void
.end method

.method public final setSpacing(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/ui/widgets/GridSpacingItemDecoration;->spacing:I

    return-void
.end method

.method public final setSpanCount(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/ui/widgets/GridSpacingItemDecoration;->spanCount:I

    return-void
.end method
