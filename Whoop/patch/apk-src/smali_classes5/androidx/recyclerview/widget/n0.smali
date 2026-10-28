.class public final Landroidx/recyclerview/widget/n0;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# instance fields
.field public w:Z

.field public final synthetic x:Landroidx/recyclerview/widget/o0;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/o0;)V
    .locals 0

    iput-object p1, p0, Landroidx/recyclerview/widget/n0;->x:Landroidx/recyclerview/widget/o0;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/recyclerview/widget/n0;->w:Z

    return-void
.end method


# virtual methods
.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 5

    iget-object v0, p0, Landroidx/recyclerview/widget/n0;->x:Landroidx/recyclerview/widget/o0;

    iget-object v1, v0, Landroidx/recyclerview/widget/o0;->m:Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;

    iget-boolean v2, p0, Landroidx/recyclerview/widget/n0;->w:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/o0;->j(Landroid/view/MotionEvent;)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v3, v0, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3, v2}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/o2;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v3, v0, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v3, v2}, Landroidx/recyclerview/widget/m0;->hasDragFlag(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v3

    iget v4, v0, Landroidx/recyclerview/widget/o0;->l:I

    if-ne v3, v4, :cond_2

    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    iput v4, v0, Landroidx/recyclerview/widget/o0;->d:F

    iput p1, v0, Landroidx/recyclerview/widget/o0;->e:F

    const/4 p1, 0x0

    iput p1, v0, Landroidx/recyclerview/widget/o0;->i:F

    iput p1, v0, Landroidx/recyclerview/widget/o0;->h:F

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x2

    invoke-virtual {v0, v2, p1}, Landroidx/recyclerview/widget/o0;->o(Landroidx/recyclerview/widget/o2;I)V

    :cond_2
    :goto_0
    return-void
.end method
