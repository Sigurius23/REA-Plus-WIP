.class public final Lhc/g;
.super Landroidx/recyclerview/widget/LinearLayoutManager;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroidx/viewpager2/widget/ViewPager2;


# direct methods
.method public constructor <init>(Landroidx/viewpager2/widget/ViewPager2;)V
    .locals 0

    iput-object p1, p0, Lhc/g;->a:Landroidx/viewpager2/widget/ViewPager2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final calculateExtraLayoutSpace(Landroidx/recyclerview/widget/k2;[I)V
    .locals 3

    iget-object v0, p0, Lhc/g;->a:Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getOffscreenPageLimit()I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    invoke-super {p0, p1, p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->calculateExtraLayoutSpace(Landroidx/recyclerview/widget/k2;[I)V

    return-void

    :cond_0
    invoke-virtual {v0}, Landroidx/viewpager2/widget/ViewPager2;->getPageSize()I

    move-result p1

    mul-int/2addr p1, v1

    const/4 v0, 0x0

    aput p1, p2, v0

    const/4 v0, 0x1

    aput p1, p2, v0

    return-void
.end method

.method public final onInitializeAccessibilityNodeInfo(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;Li5/f;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroidx/recyclerview/widget/u1;->onInitializeAccessibilityNodeInfo(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;Li5/f;)V

    iget-object p1, p0, Lhc/g;->a:Landroidx/viewpager2/widget/ViewPager2;

    iget-object p1, p1, Landroidx/viewpager2/widget/ViewPager2;->T:La00/g;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final onInitializeAccessibilityNodeInfoForItem(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;Landroid/view/View;Li5/f;)V
    .locals 3

    iget-object p1, p0, Lhc/g;->a:Landroidx/viewpager2/widget/ViewPager2;

    iget-object p1, p1, Landroidx/viewpager2/widget/ViewPager2;->T:La00/g;

    iget-object p1, p1, La00/g;->E:Ljava/lang/Object;

    check-cast p1, Landroidx/viewpager2/widget/ViewPager2;

    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getOrientation()I

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-ne p2, v1, :cond_0

    iget-object p2, p1, Landroidx/viewpager2/widget/ViewPager2;->G:Lhc/g;

    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/u1;->getPosition(Landroid/view/View;)I

    move-result p2

    goto :goto_0

    :cond_0
    move p2, v0

    :goto_0
    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getOrientation()I

    move-result v2

    if-nez v2, :cond_1

    iget-object p1, p1, Landroidx/viewpager2/widget/ViewPager2;->G:Lhc/g;

    invoke-virtual {p1, p3}, Landroidx/recyclerview/widget/u1;->getPosition(Landroid/view/View;)I

    move-result p1

    goto :goto_1

    :cond_1
    move p1, v0

    :goto_1
    invoke-static {p2, v1, p1, v1, v0}, Laj/d;->s(IIIIZ)Laj/d;

    move-result-object p1

    invoke-virtual {p4, p1}, Li5/f;->j(Laj/d;)V

    return-void
.end method

.method public final performAccessibilityAction(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;ILandroid/os/Bundle;)Z
    .locals 1

    iget-object v0, p0, Lhc/g;->a:Landroidx/viewpager2/widget/ViewPager2;

    iget-object v0, v0, Landroidx/viewpager2/widget/ViewPager2;->T:La00/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-super {p0, p1, p2, p3, p4}, Landroidx/recyclerview/widget/u1;->performAccessibilityAction(Landroidx/recyclerview/widget/c2;Landroidx/recyclerview/widget/k2;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public final requestChildRectangleOnScreen(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
