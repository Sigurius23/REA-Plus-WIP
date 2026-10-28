.class public final Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;
.super Landroidx/recyclerview/widget/q1;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\'\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR$\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"\"\u0004\u0008#\u0010$R\"\u0010&\u001a\u00020%8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008&\u0010\'\u001a\u0004\u0008(\u0010)\"\u0004\u0008*\u0010+R\u0014\u0010,\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008,\u0010-\u00a8\u0006."
    }
    d2 = {
        "Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;",
        "Landroidx/recyclerview/widget/q1;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "",
        "determineHeight",
        "()I",
        "Landroid/graphics/Rect;",
        "outRect",
        "Landroid/view/View;",
        "view",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "parent",
        "Landroidx/recyclerview/widget/k2;",
        "state",
        "Ll83/a0;",
        "getItemOffsets",
        "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/k2;)V",
        "Landroid/graphics/Canvas;",
        "canvas",
        "onDraw",
        "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/k2;)V",
        "Landroid/graphics/drawable/Drawable;",
        "drawable",
        "Landroid/graphics/drawable/Drawable;",
        "getDrawable",
        "()Landroid/graphics/drawable/Drawable;",
        "setDrawable",
        "(Landroid/graphics/drawable/Drawable;)V",
        "drawableHeight",
        "Ljava/lang/Integer;",
        "getDrawableHeight",
        "()Ljava/lang/Integer;",
        "setDrawableHeight",
        "(Ljava/lang/Integer;)V",
        "",
        "drawOnLastItem",
        "Z",
        "getDrawOnLastItem",
        "()Z",
        "setDrawOnLastItem",
        "(Z)V",
        "bounds",
        "Landroid/graphics/Rect;",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final bounds:Landroid/graphics/Rect;

.field private drawOnLastItem:Z

.field private drawable:Landroid/graphics/drawable/Drawable;

.field private drawableHeight:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget v0, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_divider:I

    invoke-static {p1, v0}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;->drawable:Landroid/graphics/drawable/Drawable;

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;->bounds:Landroid/graphics/Rect;

    return-void
.end method

.method private final determineHeight()I
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;->drawableHeight:Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;->drawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    return v0
.end method


# virtual methods
.method public final getDrawOnLastItem()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;->drawOnLastItem:Z

    return v0
.end method

.method public final getDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;->drawable:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public final getDrawableHeight()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;->drawableHeight:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/k2;)V
    .locals 1

    const-string v0, "outRect"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "parent"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "state"

    invoke-static {p4, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x0

    invoke-direct {p0}, Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;->determineHeight()I

    move-result p3

    invoke-virtual {p1, p2, p2, p2, p3}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/k2;)V
    .locals 6

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getClipToPadding()Z

    move-result p3

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getPaddingLeft()I

    move-result p3

    goto :goto_0

    :cond_0
    move p3, v0

    :goto_0
    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getClipToPadding()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    move-result v1

    invoke-virtual {p2}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    move-result v1

    :goto_1
    iget-boolean v2, p0, Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;->drawOnLastItem:Z

    if-eqz v2, :cond_2

    new-instance v2, Lb3/d3;

    const/4 v3, 0x1

    invoke-direct {v2, p2, v3}, Lb3/d3;-><init>(Ljava/lang/Object;I)V

    invoke-static {v2}, Lxb3/k;->p(Lxb3/i;)I

    move-result v2

    invoke-static {v0, v2}, Le93/b;->i0(II)Li93/j;

    move-result-object v0

    goto :goto_2

    :cond_2
    new-instance v2, Lb3/d3;

    const/4 v3, 0x1

    invoke-direct {v2, p2, v3}, Lb3/d3;-><init>(Ljava/lang/Object;I)V

    invoke-static {v2}, Lxb3/k;->p(Lxb3/i;)I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v0, v2}, Le93/b;->i0(II)Li93/j;

    move-result-object v0

    :goto_2
    iget v2, v0, Li93/h;->w:I

    iget v0, v0, Li93/h;->x:I

    if-gt v2, v0, :cond_3

    :goto_3
    invoke-virtual {p2, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    iget-object v4, p0, Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;->bounds:Landroid/graphics/Rect;

    invoke-static {v3, v4}, Landroidx/recyclerview/widget/RecyclerView;->getDecoratedBoundsWithMarginsInt(Landroid/view/View;Landroid/graphics/Rect;)V

    iget-object v4, p0, Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;->bounds:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v3}, Landroid/view/View;->getTranslationY()F

    move-result v3

    invoke-static {v3}, Le93/b;->X(F)I

    move-result v3

    add-int/2addr v3, v4

    invoke-direct {p0}, Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;->determineHeight()I

    move-result v4

    sub-int v4, v3, v4

    iget-object v5, p0, Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;->drawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v5, p3, v4, v1, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v3, p0, Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;->drawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    if-eq v2, v0, :cond_3

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    return-void
.end method

.method public final setDrawOnLastItem(Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;->drawOnLastItem:Z

    return-void
.end method

.method public final setDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;->drawable:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public final setDrawableHeight(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/widgets/internal/SimpleVerticalListDivider;->drawableHeight:Ljava/lang/Integer;

    return-void
.end method
