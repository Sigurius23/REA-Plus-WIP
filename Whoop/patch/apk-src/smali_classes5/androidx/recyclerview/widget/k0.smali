.class public final Landroidx/recyclerview/widget/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:Landroidx/recyclerview/widget/j0;

.field public final synthetic x:I

.field public final synthetic y:Landroidx/recyclerview/widget/o0;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/o0;Landroidx/recyclerview/widget/j0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/recyclerview/widget/k0;->y:Landroidx/recyclerview/widget/o0;

    iput-object p2, p0, Landroidx/recyclerview/widget/k0;->w:Landroidx/recyclerview/widget/j0;

    iput p3, p0, Landroidx/recyclerview/widget/k0;->x:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Landroidx/recyclerview/widget/k0;->w:Landroidx/recyclerview/widget/j0;

    iget-object v1, v0, Landroidx/recyclerview/widget/j0;->e:Landroidx/recyclerview/widget/o2;

    iget-object v2, p0, Landroidx/recyclerview/widget/k0;->y:Landroidx/recyclerview/widget/o0;

    iget-object v3, v2, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v3, :cond_4

    iget-boolean v3, v3, Landroidx/recyclerview/widget/RecyclerView;->mIsAttached:Z

    if-eqz v3, :cond_4

    iget-boolean v0, v0, Landroidx/recyclerview/widget/j0;->k:Z

    if-nez v0, :cond_4

    invoke-virtual {v1}, Landroidx/recyclerview/widget/o2;->getAbsoluteAdapterPosition()I

    move-result v0

    const/4 v3, -0x1

    if-eq v0, v3, :cond_4

    iget-object v0, v2, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getItemAnimator()Landroidx/recyclerview/widget/p1;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/p1;->f()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, v2, Landroidx/recyclerview/widget/o0;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_3

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/recyclerview/widget/j0;

    iget-boolean v5, v5, Landroidx/recyclerview/widget/j0;->l:Z

    if-nez v5, :cond_2

    :cond_1
    iget-object v0, v2, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    iget-object v0, v2, Landroidx/recyclerview/widget/o0;->m:Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;

    iget v2, p0, Landroidx/recyclerview/widget/k0;->x:I

    invoke-virtual {v0, v1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->onSwiped(Landroidx/recyclerview/widget/o2;I)V

    :cond_4
    return-void
.end method
