.class public final Landroidx/recyclerview/widget/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/recyclerview/widget/a1;


# instance fields
.field public final w:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Landroidx/recyclerview/widget/c;->w:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/c;->w:Ljava/lang/Object;

    check-cast v0, Landroidx/recyclerview/widget/i1;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/i1;->notifyItemRangeInserted(II)V

    return-void
.end method

.method public b(II)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/c;->w:Ljava/lang/Object;

    check-cast v0, Landroidx/recyclerview/widget/i1;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/i1;->notifyItemRangeRemoved(II)V

    return-void
.end method

.method public c(IILjava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/c;->w:Ljava/lang/Object;

    check-cast v0, Landroidx/recyclerview/widget/i1;

    invoke-virtual {v0, p1, p2, p3}, Landroidx/recyclerview/widget/i1;->notifyItemRangeChanged(IILjava/lang/Object;)V

    return-void
.end method

.method public d(II)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/c;->w:Ljava/lang/Object;

    check-cast v0, Landroidx/recyclerview/widget/i1;

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/i1;->notifyItemMoved(II)V

    return-void
.end method
