.class public final Landroidx/recyclerview/widget/o1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:I


# virtual methods
.method public final a(Landroidx/recyclerview/widget/o2;)V
    .locals 1

    iget-object p1, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/o1;->a:I

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/o1;->b:I

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    return-void
.end method
