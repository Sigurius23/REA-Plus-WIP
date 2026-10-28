.class public final Landroidx/recyclerview/widget/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/recyclerview/widget/b3;
.implements Landroidx/recyclerview/widget/n1;


# instance fields
.field public final synthetic a:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public synthetic constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    iput-object p1, p0, Landroidx/recyclerview/widget/g1;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/recyclerview/widget/a;)V
    .locals 4

    iget v0, p1, Landroidx/recyclerview/widget/a;->a:I

    iget-object v1, p0, Landroidx/recyclerview/widget/g1;->a:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 v3, 0x4

    if-eq v0, v3, :cond_1

    const/16 v3, 0x8

    if-eq v0, v3, :cond_0

    return-void

    :cond_0
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->mLayout:Landroidx/recyclerview/widget/u1;

    iget v3, p1, Landroidx/recyclerview/widget/a;->b:I

    iget p1, p1, Landroidx/recyclerview/widget/a;->d:I

    invoke-virtual {v0, v1, v3, p1, v2}, Landroidx/recyclerview/widget/u1;->onItemsMoved(Landroidx/recyclerview/widget/RecyclerView;III)V

    return-void

    :cond_1
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->mLayout:Landroidx/recyclerview/widget/u1;

    iget v2, p1, Landroidx/recyclerview/widget/a;->b:I

    iget v3, p1, Landroidx/recyclerview/widget/a;->d:I

    iget-object p1, p1, Landroidx/recyclerview/widget/a;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1, v2, v3, p1}, Landroidx/recyclerview/widget/u1;->onItemsUpdated(Landroidx/recyclerview/widget/RecyclerView;IILjava/lang/Object;)V

    return-void

    :cond_2
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->mLayout:Landroidx/recyclerview/widget/u1;

    iget v2, p1, Landroidx/recyclerview/widget/a;->b:I

    iget p1, p1, Landroidx/recyclerview/widget/a;->d:I

    invoke-virtual {v0, v1, v2, p1}, Landroidx/recyclerview/widget/u1;->onItemsRemoved(Landroidx/recyclerview/widget/RecyclerView;II)V

    return-void

    :cond_3
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->mLayout:Landroidx/recyclerview/widget/u1;

    iget v2, p1, Landroidx/recyclerview/widget/a;->b:I

    iget p1, p1, Landroidx/recyclerview/widget/a;->d:I

    invoke-virtual {v0, v1, v2, p1}, Landroidx/recyclerview/widget/u1;->onItemsAdded(Landroidx/recyclerview/widget/RecyclerView;II)V

    return-void
.end method

.method public b(I)Landroidx/recyclerview/widget/o2;
    .locals 3

    const/4 v0, 0x1

    iget-object v1, p0, Landroidx/recyclerview/widget/g1;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->findViewHolderForPosition(IZ)Landroidx/recyclerview/widget/o2;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->mChildHelper:Landroidx/recyclerview/widget/j;

    iget-object v2, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    iget-object v1, v1, Landroidx/recyclerview/widget/j;->c:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-boolean p1, Landroidx/recyclerview/widget/RecyclerView;->sVerboseLoggingEnabled:Z

    if-eqz p1, :cond_1

    const-string p1, "RecyclerView"

    const-string v1, "assuming view holder cannot be find because it is hidden"

    invoke-static {p1, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    :goto_0
    return-object v0

    :cond_2
    return-object p1
.end method

.method public c(I)V
    .locals 2

    iget-object v0, p0, Landroidx/recyclerview/widget/g1;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->dispatchChildDetached(Landroid/view/View;)V

    invoke-virtual {v1}, Landroid/view/View;->clearAnimation()V

    :cond_0
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeViewAt(I)V

    return-void
.end method
