.class public final Landroidx/recyclerview/widget/o0;
.super Landroidx/recyclerview/widget/q1;
.source "SourceFile"

# interfaces
.implements Landroidx/recyclerview/widget/w1;


# instance fields
.field public A:Landroid/graphics/Rect;

.field public B:J

.field public final a:Ljava/util/ArrayList;

.field public final b:[F

.field public c:Landroidx/recyclerview/widget/o2;

.field public d:F

.field public e:F

.field public f:F

.field public g:F

.field public h:F

.field public i:F

.field public j:F

.field public k:F

.field public l:I

.field public final m:Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;

.field public n:I

.field public o:I

.field public final p:Ljava/util/ArrayList;

.field public q:I

.field public r:Landroidx/recyclerview/widget/RecyclerView;

.field public final s:Landroidx/recyclerview/widget/z;

.field public t:Landroid/view/VelocityTracker;

.field public u:Ljava/util/ArrayList;

.field public v:Ljava/util/ArrayList;

.field public w:Landroid/view/View;

.field public x:Le10/k0;

.field public y:Landroidx/recyclerview/widget/n0;

.field public final z:Landroidx/recyclerview/widget/i0;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/recyclerview/widget/o0;->a:Ljava/util/ArrayList;

    const/4 v0, 0x2

    new-array v0, v0, [F

    iput-object v0, p0, Landroidx/recyclerview/widget/o0;->b:[F

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/recyclerview/widget/o0;->c:Landroidx/recyclerview/widget/o2;

    const/4 v1, -0x1

    iput v1, p0, Landroidx/recyclerview/widget/o0;->l:I

    const/4 v1, 0x0

    iput v1, p0, Landroidx/recyclerview/widget/o0;->n:I

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroidx/recyclerview/widget/o0;->p:Ljava/util/ArrayList;

    new-instance v1, Landroidx/recyclerview/widget/z;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Landroidx/recyclerview/widget/z;-><init>(Ljava/lang/Object;I)V

    iput-object v1, p0, Landroidx/recyclerview/widget/o0;->s:Landroidx/recyclerview/widget/z;

    iput-object v0, p0, Landroidx/recyclerview/widget/o0;->w:Landroid/view/View;

    new-instance v0, Landroidx/recyclerview/widget/i0;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/i0;-><init>(Landroidx/recyclerview/widget/o0;)V

    iput-object v0, p0, Landroidx/recyclerview/widget/o0;->z:Landroidx/recyclerview/widget/i0;

    iput-object p1, p0, Landroidx/recyclerview/widget/o0;->m:Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;

    return-void
.end method

.method public static l(Landroid/view/View;FFFF)Z
    .locals 1

    cmpl-float v0, p1, p3

    if-ltz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    int-to-float v0, v0

    add-float/2addr p3, v0

    cmpg-float p1, p1, p3

    if-gtz p1, :cond_0

    cmpl-float p1, p2, p4

    if-ltz p1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    int-to-float p0, p0

    add-float/2addr p4, p0

    cmpg-float p0, p2, p4

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/o0;->n(Landroid/view/View;)V

    iget-object v0, p0, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/o2;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/o0;->c:Landroidx/recyclerview/widget/o2;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    if-ne p1, v0, :cond_1

    const/4 p1, 0x0

    invoke-virtual {p0, p1, v1}, Landroidx/recyclerview/widget/o0;->o(Landroidx/recyclerview/widget/o2;I)V

    return-void

    :cond_1
    invoke-virtual {p0, p1, v1}, Landroidx/recyclerview/widget/o0;->i(Landroidx/recyclerview/widget/o2;Z)V

    iget-object v0, p0, Landroidx/recyclerview/widget/o0;->a:Ljava/util/ArrayList;

    iget-object v1, p1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/recyclerview/widget/o0;->m:Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;

    iget-object v1, p0, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1, p1}, Landroidx/recyclerview/widget/m0;->clearView(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final c(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public final e(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 6

    iget-object v0, p0, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    if-ne v0, p1, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/o0;->z:Landroidx/recyclerview/widget/i0;

    if-eqz v0, :cond_4

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->removeItemDecoration(Landroidx/recyclerview/widget/q1;)V

    iget-object v0, p0, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->removeOnItemTouchListener(Landroidx/recyclerview/widget/y1;)V

    iget-object v0, p0, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/RecyclerView;->removeOnChildAttachStateChangeListener(Landroidx/recyclerview/widget/w1;)V

    iget-object v0, p0, Landroidx/recyclerview/widget/o0;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_0
    const/4 v3, 0x0

    if-ltz v2, :cond_1

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/j0;

    iget-object v4, v3, Landroidx/recyclerview/widget/j0;->g:Landroid/animation/ValueAnimator;

    invoke-virtual {v4}, Landroid/animation/ValueAnimator;->cancel()V

    iget-object v4, p0, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v3, v3, Landroidx/recyclerview/widget/j0;->e:Landroidx/recyclerview/widget/o2;

    iget-object v5, p0, Landroidx/recyclerview/widget/o0;->m:Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;

    invoke-virtual {v5, v4, v3}, Landroidx/recyclerview/widget/m0;->clearView(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;)V

    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/recyclerview/widget/o0;->w:Landroid/view/View;

    iget-object v2, p0, Landroidx/recyclerview/widget/o0;->t:Landroid/view/VelocityTracker;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Landroid/view/VelocityTracker;->recycle()V

    iput-object v0, p0, Landroidx/recyclerview/widget/o0;->t:Landroid/view/VelocityTracker;

    :cond_2
    iget-object v2, p0, Landroidx/recyclerview/widget/o0;->y:Landroidx/recyclerview/widget/n0;

    if-eqz v2, :cond_3

    iput-boolean v3, v2, Landroidx/recyclerview/widget/n0;->w:Z

    iput-object v0, p0, Landroidx/recyclerview/widget/o0;->y:Landroidx/recyclerview/widget/n0;

    :cond_3
    iget-object v2, p0, Landroidx/recyclerview/widget/o0;->x:Le10/k0;

    if-eqz v2, :cond_4

    iput-object v0, p0, Landroidx/recyclerview/widget/o0;->x:Le10/k0;

    :cond_4
    iput-object p1, p0, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f0700fa

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iput v0, p0, Landroidx/recyclerview/widget/o0;->f:F

    const v0, 0x7f0700f9

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/o0;->g:F

    iget-object p1, p0, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/o0;->q:I

    iget-object p1, p0, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v0, -0x1

    invoke-virtual {p1, p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/q1;I)V

    iget-object p1, p0, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->addOnItemTouchListener(Landroidx/recyclerview/widget/y1;)V

    iget-object p1, p0, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView;->addOnChildAttachStateChangeListener(Landroidx/recyclerview/widget/w1;)V

    new-instance p1, Landroidx/recyclerview/widget/n0;

    invoke-direct {p1, p0}, Landroidx/recyclerview/widget/n0;-><init>(Landroidx/recyclerview/widget/o0;)V

    iput-object p1, p0, Landroidx/recyclerview/widget/o0;->y:Landroidx/recyclerview/widget/n0;

    new-instance p1, Le10/k0;

    iget-object v0, p0, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Landroidx/recyclerview/widget/o0;->y:Landroidx/recyclerview/widget/n0;

    invoke-direct {p1, v0, v1}, Le10/k0;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p1, p0, Landroidx/recyclerview/widget/o0;->x:Le10/k0;

    :cond_5
    :goto_1
    return-void
.end method

.method public final f(Landroidx/recyclerview/widget/o2;I)I
    .locals 8

    and-int/lit8 v0, p2, 0xc

    if-eqz v0, :cond_3

    iget v0, p0, Landroidx/recyclerview/widget/o0;->h:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    const/4 v2, 0x4

    const/16 v3, 0x8

    if-lez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget-object v4, p0, Landroidx/recyclerview/widget/o0;->t:Landroid/view/VelocityTracker;

    iget-object v5, p0, Landroidx/recyclerview/widget/o0;->m:Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;

    if-eqz v4, :cond_2

    iget v6, p0, Landroidx/recyclerview/widget/o0;->l:I

    const/4 v7, -0x1

    if-le v6, v7, :cond_2

    iget v6, p0, Landroidx/recyclerview/widget/o0;->g:F

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v7, 0x3e8

    invoke-virtual {v4, v7, v6}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    iget-object v4, p0, Landroidx/recyclerview/widget/o0;->t:Landroid/view/VelocityTracker;

    iget v6, p0, Landroidx/recyclerview/widget/o0;->l:I

    invoke-virtual {v4, v6}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result v4

    iget-object v6, p0, Landroidx/recyclerview/widget/o0;->t:Landroid/view/VelocityTracker;

    iget v7, p0, Landroidx/recyclerview/widget/o0;->l:I

    invoke-virtual {v6, v7}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v6

    cmpl-float v1, v4, v1

    if-lez v1, :cond_1

    move v2, v3

    :cond_1
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v1

    and-int v3, v2, p2

    if-eqz v3, :cond_2

    if-ne v0, v2, :cond_2

    iget v3, p0, Landroidx/recyclerview/widget/o0;->f:F

    cmpl-float v3, v1, v3

    if-ltz v3, :cond_2

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v3

    cmpl-float v1, v1, v3

    if-lez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v5, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->getSwipeThreshold(Landroidx/recyclerview/widget/o2;)F

    const p1, 0x3e99999a    # 0.3f

    mul-float/2addr p1, v1

    and-int/2addr p2, v0

    if-eqz p2, :cond_3

    iget p2, p0, Landroidx/recyclerview/widget/o0;->h:F

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    cmpl-float p1, p2, p1

    if-lez p1, :cond_3

    return v0

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public final g(IILandroid/view/MotionEvent;)V
    .locals 8

    iget-object v0, p0, Landroidx/recyclerview/widget/o0;->c:Landroidx/recyclerview/widget/o2;

    if-nez v0, :cond_d

    const/4 v0, 0x2

    if-ne p1, v0, :cond_d

    iget p1, p0, Landroidx/recyclerview/widget/o0;->n:I

    if-eq p1, v0, :cond_d

    iget-object p1, p0, Landroidx/recyclerview/widget/o0;->m:Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getScrollState()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    goto/16 :goto_1

    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object v1

    iget v3, p0, Landroidx/recyclerview/widget/o0;->l:I

    const/4 v4, -0x1

    const/4 v5, 0x0

    if-ne v3, v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p3, v3}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v3

    invoke-virtual {p3, v3}, Landroid/view/MotionEvent;->getX(I)F

    move-result v4

    iget v6, p0, Landroidx/recyclerview/widget/o0;->d:F

    sub-float/2addr v4, v6

    invoke-virtual {p3, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v3

    iget v6, p0, Landroidx/recyclerview/widget/o0;->e:F

    sub-float/2addr v3, v6

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v6, p0, Landroidx/recyclerview/widget/o0;->q:I

    int-to-float v6, v6

    cmpg-float v7, v4, v6

    if-gez v7, :cond_2

    cmpg-float v6, v3, v6

    if-gez v6, :cond_2

    goto :goto_0

    :cond_2
    cmpl-float v6, v4, v3

    if-lez v6, :cond_3

    invoke-virtual {v1}, Landroidx/recyclerview/widget/u1;->canScrollHorizontally()Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_0

    :cond_3
    cmpl-float v3, v3, v4

    if-lez v3, :cond_4

    invoke-virtual {v1}, Landroidx/recyclerview/widget/u1;->canScrollVertically()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/o0;->j(Landroid/view/MotionEvent;)Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    iget-object v3, p0, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3, v1}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/o2;

    move-result-object v5

    :goto_0
    if-nez v5, :cond_6

    goto/16 :goto_1

    :cond_6
    iget-object v1, p0, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v1, v5}, Landroidx/recyclerview/widget/m0;->getAbsoluteMovementFlags(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;)I

    move-result p1

    const v1, 0xff00

    and-int/2addr p1, v1

    shr-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_7

    goto :goto_1

    :cond_7
    invoke-virtual {p3, p2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v1

    invoke-virtual {p3, p2}, Landroid/view/MotionEvent;->getY(I)F

    move-result p2

    iget v3, p0, Landroidx/recyclerview/widget/o0;->d:F

    sub-float/2addr v1, v3

    iget v3, p0, Landroidx/recyclerview/widget/o0;->e:F

    sub-float/2addr p2, v3

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v3

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result v4

    iget v6, p0, Landroidx/recyclerview/widget/o0;->q:I

    int-to-float v6, v6

    cmpg-float v7, v3, v6

    if-gez v7, :cond_8

    cmpg-float v6, v4, v6

    if-gez v6, :cond_8

    goto :goto_1

    :cond_8
    cmpl-float v3, v3, v4

    const/4 v4, 0x0

    if-lez v3, :cond_a

    cmpg-float p2, v1, v4

    if-gez p2, :cond_9

    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_9

    goto :goto_1

    :cond_9
    cmpl-float p2, v1, v4

    if-lez p2, :cond_c

    and-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_c

    goto :goto_1

    :cond_a
    cmpg-float v1, p2, v4

    if-gez v1, :cond_b

    and-int/lit8 v1, p1, 0x1

    if-nez v1, :cond_b

    goto :goto_1

    :cond_b
    cmpl-float p2, p2, v4

    if-lez p2, :cond_c

    and-int/2addr p1, v0

    if-nez p1, :cond_c

    goto :goto_1

    :cond_c
    iput v4, p0, Landroidx/recyclerview/widget/o0;->i:F

    iput v4, p0, Landroidx/recyclerview/widget/o0;->h:F

    const/4 p1, 0x0

    invoke-virtual {p3, p1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/o0;->l:I

    invoke-virtual {p0, v5, v2}, Landroidx/recyclerview/widget/o0;->o(Landroidx/recyclerview/widget/o2;I)V

    :cond_d
    :goto_1
    return-void
.end method

.method public final getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/k2;)V
    .locals 0

    invoke-virtual {p1}, Landroid/graphics/Rect;->setEmpty()V

    return-void
.end method

.method public final h(Landroidx/recyclerview/widget/o2;I)I
    .locals 8

    and-int/lit8 v0, p2, 0x3

    if-eqz v0, :cond_3

    iget v0, p0, Landroidx/recyclerview/widget/o0;->i:F

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-lez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iget-object v4, p0, Landroidx/recyclerview/widget/o0;->t:Landroid/view/VelocityTracker;

    iget-object v5, p0, Landroidx/recyclerview/widget/o0;->m:Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;

    if-eqz v4, :cond_2

    iget v6, p0, Landroidx/recyclerview/widget/o0;->l:I

    const/4 v7, -0x1

    if-le v6, v7, :cond_2

    iget v6, p0, Landroidx/recyclerview/widget/o0;->g:F

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v7, 0x3e8

    invoke-virtual {v4, v7, v6}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    iget-object v4, p0, Landroidx/recyclerview/widget/o0;->t:Landroid/view/VelocityTracker;

    iget v6, p0, Landroidx/recyclerview/widget/o0;->l:I

    invoke-virtual {v4, v6}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result v4

    iget-object v6, p0, Landroidx/recyclerview/widget/o0;->t:Landroid/view/VelocityTracker;

    iget v7, p0, Landroidx/recyclerview/widget/o0;->l:I

    invoke-virtual {v6, v7}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v6

    cmpl-float v1, v6, v1

    if-lez v1, :cond_1

    move v2, v3

    :cond_1
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v1

    and-int v3, v2, p2

    if-eqz v3, :cond_2

    if-ne v2, v0, :cond_2

    iget v3, p0, Landroidx/recyclerview/widget/o0;->f:F

    cmpl-float v3, v1, v3

    if-ltz v3, :cond_2

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v3

    cmpl-float v1, v1, v3

    if-lez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v5, p1}, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->getSwipeThreshold(Landroidx/recyclerview/widget/o2;)F

    const p1, 0x3e99999a    # 0.3f

    mul-float/2addr p1, v1

    and-int/2addr p2, v0

    if-eqz p2, :cond_3

    iget p2, p0, Landroidx/recyclerview/widget/o0;->i:F

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p2

    cmpl-float p1, p2, p1

    if-lez p1, :cond_3

    return v0

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public final i(Landroidx/recyclerview/widget/o2;Z)V
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/o0;->p:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-ltz v1, :cond_2

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/recyclerview/widget/j0;

    iget-object v3, v2, Landroidx/recyclerview/widget/j0;->e:Landroidx/recyclerview/widget/o2;

    if-ne v3, p1, :cond_1

    iget-boolean p1, v2, Landroidx/recyclerview/widget/j0;->k:Z

    or-int/2addr p1, p2

    iput-boolean p1, v2, Landroidx/recyclerview/widget/j0;->k:Z

    iget-boolean p1, v2, Landroidx/recyclerview/widget/j0;->l:Z

    if-nez p1, :cond_0

    iget-object p1, v2, Landroidx/recyclerview/widget/j0;->g:Landroid/animation/ValueAnimator;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    return-void

    :cond_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final j(Landroid/view/MotionEvent;)Landroid/view/View;
    .locals 6

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iget-object v1, p0, Landroidx/recyclerview/widget/o0;->c:Landroidx/recyclerview/widget/o2;

    if-eqz v1, :cond_0

    iget-object v1, v1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    iget v2, p0, Landroidx/recyclerview/widget/o0;->j:F

    iget v3, p0, Landroidx/recyclerview/widget/o0;->h:F

    add-float/2addr v2, v3

    iget v3, p0, Landroidx/recyclerview/widget/o0;->k:F

    iget v4, p0, Landroidx/recyclerview/widget/o0;->i:F

    add-float/2addr v3, v4

    invoke-static {v1, v0, p1, v2, v3}, Landroidx/recyclerview/widget/o0;->l(Landroid/view/View;FFFF)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/o0;->p:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    :goto_0
    if-ltz v2, :cond_2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/j0;

    iget-object v4, v3, Landroidx/recyclerview/widget/j0;->e:Landroidx/recyclerview/widget/o2;

    iget-object v4, v4, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    iget v5, v3, Landroidx/recyclerview/widget/j0;->i:F

    iget v3, v3, Landroidx/recyclerview/widget/j0;->j:F

    invoke-static {v4, v0, p1, v5, v3}, Landroidx/recyclerview/widget/o0;->l(Landroid/view/View;FFFF)Z

    move-result v3

    if-eqz v3, :cond_1

    return-object v4

    :cond_1
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    :cond_2
    iget-object v1, p0, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->findChildViewUnder(FF)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public final k([F)V
    .locals 3

    iget v0, p0, Landroidx/recyclerview/widget/o0;->o:I

    and-int/lit8 v0, v0, 0xc

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v0, p0, Landroidx/recyclerview/widget/o0;->j:F

    iget v2, p0, Landroidx/recyclerview/widget/o0;->h:F

    add-float/2addr v0, v2

    iget-object v2, p0, Landroidx/recyclerview/widget/o0;->c:Landroidx/recyclerview/widget/o2;

    iget-object v2, v2, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v0, v2

    aput v0, p1, v1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/o0;->c:Landroidx/recyclerview/widget/o2;

    iget-object v0, v0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTranslationX()F

    move-result v0

    aput v0, p1, v1

    :goto_0
    iget v0, p0, Landroidx/recyclerview/widget/o0;->o:I

    and-int/lit8 v0, v0, 0x3

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget v0, p0, Landroidx/recyclerview/widget/o0;->k:F

    iget v2, p0, Landroidx/recyclerview/widget/o0;->i:F

    add-float/2addr v0, v2

    iget-object v2, p0, Landroidx/recyclerview/widget/o0;->c:Landroidx/recyclerview/widget/o2;

    iget-object v2, v2, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v0, v2

    aput v0, p1, v1

    return-void

    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/o0;->c:Landroidx/recyclerview/widget/o2;

    iget-object v0, v0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    move-result v0

    aput v0, p1, v1

    return-void
.end method

.method public final m(Landroidx/recyclerview/widget/o2;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2}, Landroid/view/View;->isLayoutRequested()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_5

    :cond_0
    iget v2, v0, Landroidx/recyclerview/widget/o0;->n:I

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    goto/16 :goto_5

    :cond_1
    iget-object v2, v0, Landroidx/recyclerview/widget/o0;->m:Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v4, v0, Landroidx/recyclerview/widget/o0;->j:F

    iget v5, v0, Landroidx/recyclerview/widget/o0;->h:F

    add-float/2addr v4, v5

    float-to-int v4, v4

    iget v5, v0, Landroidx/recyclerview/widget/o0;->k:F

    iget v6, v0, Landroidx/recyclerview/widget/o0;->i:F

    add-float/2addr v5, v6

    float-to-int v5, v5

    iget-object v6, v1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    move-result v6

    sub-int v6, v5, v6

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    int-to-float v6, v6

    iget-object v7, v1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    move-result v7

    int-to-float v7, v7

    const/high16 v8, 0x3f000000    # 0.5f

    mul-float/2addr v7, v8

    cmpg-float v6, v6, v7

    if-gez v6, :cond_2

    iget-object v6, v1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    move-result v6

    sub-int v6, v4, v6

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    int-to-float v6, v6

    iget-object v7, v1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    move-result v7

    int-to-float v7, v7

    mul-float/2addr v7, v8

    cmpg-float v6, v6, v7

    if-gez v6, :cond_2

    goto/16 :goto_5

    :cond_2
    iget-object v6, v0, Landroidx/recyclerview/widget/o0;->u:Ljava/util/ArrayList;

    if-nez v6, :cond_3

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, v0, Landroidx/recyclerview/widget/o0;->u:Ljava/util/ArrayList;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iput-object v6, v0, Landroidx/recyclerview/widget/o0;->v:Ljava/util/ArrayList;

    goto :goto_0

    :cond_3
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    iget-object v6, v0, Landroidx/recyclerview/widget/o0;->v:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    :goto_0
    iget v6, v0, Landroidx/recyclerview/widget/o0;->j:F

    iget v7, v0, Landroidx/recyclerview/widget/o0;->h:F

    add-float/2addr v6, v7

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    iget v7, v0, Landroidx/recyclerview/widget/o0;->k:F

    iget v8, v0, Landroidx/recyclerview/widget/o0;->i:F

    add-float/2addr v7, v8

    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    move-result v7

    iget-object v8, v1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    move-result v8

    add-int/2addr v8, v6

    iget-object v9, v1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v9}, Landroid/view/View;->getHeight()I

    move-result v9

    add-int/2addr v9, v7

    add-int v10, v6, v8

    div-int/2addr v10, v3

    add-int v11, v7, v9

    div-int/2addr v11, v3

    iget-object v12, v0, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v12}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object v12

    invoke-virtual {v12}, Landroidx/recyclerview/widget/u1;->getChildCount()I

    move-result v13

    const/4 v15, 0x0

    :goto_1
    if-ge v15, v13, :cond_8

    move/from16 v16, v3

    invoke-virtual {v12, v15}, Landroidx/recyclerview/widget/u1;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    iget-object v14, v1, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    if-ne v3, v14, :cond_5

    :cond_4
    :goto_2
    move/from16 v17, v6

    move/from16 v18, v7

    move/from16 v19, v8

    goto/16 :goto_4

    :cond_5
    invoke-virtual {v3}, Landroid/view/View;->getBottom()I

    move-result v14

    if-lt v14, v7, :cond_4

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v14

    if-gt v14, v9, :cond_4

    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    move-result v14

    if-lt v14, v6, :cond_4

    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v14

    if-le v14, v8, :cond_6

    goto :goto_2

    :cond_6
    iget-object v14, v0, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v14, v3}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/o2;

    move-result-object v14

    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v17

    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    move-result v18

    add-int v18, v18, v17

    div-int/lit8 v18, v18, 0x2

    sub-int v17, v10, v18

    invoke-static/range {v17 .. v17}, Ljava/lang/Math;->abs(I)I

    move-result v17

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v18

    invoke-virtual {v3}, Landroid/view/View;->getBottom()I

    move-result v3

    add-int v3, v3, v18

    div-int/lit8 v3, v3, 0x2

    sub-int v3, v11, v3

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    mul-int v17, v17, v17

    mul-int/2addr v3, v3

    add-int v3, v3, v17

    move/from16 v17, v6

    iget-object v6, v0, Landroidx/recyclerview/widget/o0;->u:Ljava/util/ArrayList;

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v6

    move/from16 v18, v7

    move/from16 v19, v8

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_3
    if-ge v7, v6, :cond_7

    move/from16 v20, v6

    iget-object v6, v0, Landroidx/recyclerview/widget/o0;->v:Ljava/util/ArrayList;

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    if-le v3, v6, :cond_7

    add-int/lit8 v8, v8, 0x1

    add-int/lit8 v7, v7, 0x1

    move/from16 v6, v20

    goto :goto_3

    :cond_7
    iget-object v6, v0, Landroidx/recyclerview/widget/o0;->u:Ljava/util/ArrayList;

    invoke-virtual {v6, v8, v14}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    iget-object v6, v0, Landroidx/recyclerview/widget/o0;->v:Ljava/util/ArrayList;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v6, v8, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :goto_4
    add-int/lit8 v15, v15, 0x1

    move/from16 v3, v16

    move/from16 v6, v17

    move/from16 v7, v18

    move/from16 v8, v19

    goto/16 :goto_1

    :cond_8
    iget-object v3, v0, Landroidx/recyclerview/widget/o0;->u:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-nez v6, :cond_9

    :goto_5
    return-void

    :cond_9
    invoke-virtual {v2, v1, v3, v4, v5}, Landroidx/recyclerview/widget/m0;->chooseDropTarget(Landroidx/recyclerview/widget/o2;Ljava/util/List;II)Landroidx/recyclerview/widget/o2;

    move-result-object v3

    if-nez v3, :cond_a

    iget-object v1, v0, Landroidx/recyclerview/widget/o0;->u:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iget-object v1, v0, Landroidx/recyclerview/widget/o0;->v:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    return-void

    :cond_a
    invoke-virtual {v3}, Landroidx/recyclerview/widget/o2;->getAbsoluteAdapterPosition()I

    invoke-virtual {v1}, Landroidx/recyclerview/widget/o2;->getAbsoluteAdapterPosition()I

    iget-object v4, v0, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2, v4, v1, v3}, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->onMove(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;Landroidx/recyclerview/widget/o2;)Z

    return-void
.end method

.method public final n(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/o0;->w:Landroid/view/View;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/recyclerview/widget/o0;->w:Landroid/view/View;

    :cond_0
    return-void
.end method

.method public final o(Landroidx/recyclerview/widget/o2;I)V
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v10, p1

    move/from16 v11, p2

    iget-object v0, v1, Landroidx/recyclerview/widget/o0;->c:Landroidx/recyclerview/widget/o2;

    if-ne v10, v0, :cond_0

    iget v0, v1, Landroidx/recyclerview/widget/o0;->n:I

    if-ne v11, v0, :cond_0

    return-void

    :cond_0
    const-wide/high16 v2, -0x8000000000000000L

    iput-wide v2, v1, Landroidx/recyclerview/widget/o0;->B:J

    iget v3, v1, Landroidx/recyclerview/widget/o0;->n:I

    const/4 v12, 0x1

    invoke-virtual {v1, v10, v12}, Landroidx/recyclerview/widget/o0;->i(Landroidx/recyclerview/widget/o2;Z)V

    iput v11, v1, Landroidx/recyclerview/widget/o0;->n:I

    const/4 v13, 0x2

    if-ne v11, v13, :cond_2

    if-eqz v10, :cond_1

    iget-object v0, v10, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    iput-object v0, v1, Landroidx/recyclerview/widget/o0;->w:Landroid/view/View;

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Must pass a ViewHolder when dragging"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    mul-int/lit8 v0, v11, 0x8

    const/16 v14, 0x8

    add-int/2addr v0, v14

    shl-int v0, v12, v0

    add-int/lit8 v15, v0, -0x1

    iget-object v2, v1, Landroidx/recyclerview/widget/o0;->c:Landroidx/recyclerview/widget/o2;

    iget-object v0, v1, Landroidx/recyclerview/widget/o0;->m:Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;

    if-eqz v2, :cond_11

    iget-object v5, v2, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v5, :cond_10

    if-ne v3, v13, :cond_4

    :cond_3
    :goto_1
    const/4 v8, 0x0

    goto :goto_2

    :cond_4
    iget v5, v1, Landroidx/recyclerview/widget/o0;->n:I

    if-ne v5, v13, :cond_5

    goto :goto_1

    :cond_5
    iget-object v5, v1, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, v5, v2}, Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;->getMovementFlags(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;)I

    move-result v5

    iget-object v7, v1, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    sget-object v8, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v7}, Landroid/view/View;->getLayoutDirection()I

    move-result v7

    invoke-virtual {v0, v5, v7}, Landroidx/recyclerview/widget/m0;->convertToAbsoluteDirection(II)I

    move-result v7

    const v8, 0xff00

    and-int/2addr v7, v8

    shr-int/2addr v7, v14

    if-nez v7, :cond_6

    goto :goto_1

    :cond_6
    and-int/2addr v5, v8

    shr-int/2addr v5, v14

    iget v8, v1, Landroidx/recyclerview/widget/o0;->h:F

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v8

    iget v9, v1, Landroidx/recyclerview/widget/o0;->i:F

    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v9

    cmpl-float v8, v8, v9

    if-lez v8, :cond_8

    invoke-virtual {v1, v2, v7}, Landroidx/recyclerview/widget/o0;->f(Landroidx/recyclerview/widget/o2;I)I

    move-result v8

    if-lez v8, :cond_7

    and-int/2addr v5, v8

    if-nez v5, :cond_a

    iget-object v5, v1, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v5}, Landroid/view/View;->getLayoutDirection()I

    move-result v5

    invoke-static {v8, v5}, Landroidx/recyclerview/widget/m0;->convertToRelativeDirection(II)I

    move-result v8

    goto :goto_2

    :cond_7
    invoke-virtual {v1, v2, v7}, Landroidx/recyclerview/widget/o0;->h(Landroidx/recyclerview/widget/o2;I)I

    move-result v8

    if-lez v8, :cond_3

    goto :goto_2

    :cond_8
    invoke-virtual {v1, v2, v7}, Landroidx/recyclerview/widget/o0;->h(Landroidx/recyclerview/widget/o2;I)I

    move-result v8

    if-lez v8, :cond_9

    goto :goto_2

    :cond_9
    invoke-virtual {v1, v2, v7}, Landroidx/recyclerview/widget/o0;->f(Landroidx/recyclerview/widget/o2;I)I

    move-result v8

    if-lez v8, :cond_3

    and-int/2addr v5, v8

    if-nez v5, :cond_a

    iget-object v5, v1, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v5}, Landroid/view/View;->getLayoutDirection()I

    move-result v5

    invoke-static {v8, v5}, Landroidx/recyclerview/widget/m0;->convertToRelativeDirection(II)I

    move-result v8

    :cond_a
    :goto_2
    iget-object v5, v1, Landroidx/recyclerview/widget/o0;->t:Landroid/view/VelocityTracker;

    if-eqz v5, :cond_b

    invoke-virtual {v5}, Landroid/view/VelocityTracker;->recycle()V

    iput-object v6, v1, Landroidx/recyclerview/widget/o0;->t:Landroid/view/VelocityTracker;

    :cond_b
    const/4 v5, 0x4

    const/4 v7, 0x0

    if-eq v8, v12, :cond_d

    if-eq v8, v13, :cond_d

    if-eq v8, v5, :cond_c

    if-eq v8, v14, :cond_c

    const/16 v9, 0x10

    if-eq v8, v9, :cond_c

    const/16 v9, 0x20

    if-eq v8, v9, :cond_c

    move v4, v7

    const/16 v16, 0x0

    goto :goto_3

    :cond_c
    iget v9, v1, Landroidx/recyclerview/widget/o0;->h:F

    invoke-static {v9}, Ljava/lang/Math;->signum(F)F

    move-result v9

    const/16 v16, 0x0

    iget-object v4, v1, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v9, v4

    move v4, v7

    move v7, v9

    goto :goto_3

    :cond_d
    const/16 v16, 0x0

    iget v4, v1, Landroidx/recyclerview/widget/o0;->i:F

    invoke-static {v4}, Ljava/lang/Math;->signum(F)F

    move-result v4

    iget-object v9, v1, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v9}, Landroid/view/View;->getHeight()I

    move-result v9

    int-to-float v9, v9

    mul-float/2addr v4, v9

    :goto_3
    if-ne v3, v13, :cond_e

    move v5, v14

    goto :goto_4

    :cond_e
    if-lez v8, :cond_f

    move v5, v13

    :cond_f
    :goto_4
    iget-object v9, v1, Landroidx/recyclerview/widget/o0;->b:[F

    invoke-virtual {v1, v9}, Landroidx/recyclerview/widget/o0;->k([F)V

    move-object/from16 v17, v6

    move v6, v7

    move v7, v4

    aget v4, v9, v16

    aget v9, v9, v12

    move-object/from16 v18, v0

    new-instance v0, Landroidx/recyclerview/widget/j0;

    move/from16 v19, v5

    move v5, v9

    move-object v9, v2

    move/from16 v12, v16

    move-object/from16 v13, v18

    move/from16 v16, v14

    move/from16 v14, v19

    invoke-direct/range {v0 .. v9}, Landroidx/recyclerview/widget/j0;-><init>(Landroidx/recyclerview/widget/o0;Landroidx/recyclerview/widget/o2;IFFFFILandroidx/recyclerview/widget/o2;)V

    iget-object v3, v1, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    sub-float v4, v6, v4

    sub-float v5, v7, v5

    invoke-virtual {v13, v3, v14, v4, v5}, Landroidx/recyclerview/widget/m0;->getAnimationDuration(Landroidx/recyclerview/widget/RecyclerView;IFF)J

    move-result-wide v3

    iget-object v5, v0, Landroidx/recyclerview/widget/j0;->g:Landroid/animation/ValueAnimator;

    invoke-virtual {v5, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object v3, v1, Landroidx/recyclerview/widget/o0;->p:Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v12}, Landroidx/recyclerview/widget/o2;->setIsRecyclable(Z)V

    invoke-virtual {v5}, Landroid/animation/ValueAnimator;->start()V

    const/4 v4, 0x1

    :goto_5
    const/4 v0, 0x0

    goto :goto_6

    :cond_10
    move-object v13, v0

    move/from16 v16, v14

    const/4 v12, 0x0

    iget-object v0, v2, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/o0;->n(Landroid/view/View;)V

    iget-object v0, v1, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v13, v0, v2}, Landroidx/recyclerview/widget/m0;->clearView(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;)V

    move v4, v12

    goto :goto_5

    :goto_6
    iput-object v0, v1, Landroidx/recyclerview/widget/o0;->c:Landroidx/recyclerview/widget/o2;

    goto :goto_7

    :cond_11
    move-object v13, v0

    move/from16 v16, v14

    const/4 v12, 0x0

    move v4, v12

    :goto_7
    if-eqz v10, :cond_12

    iget-object v0, v1, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v13, v0, v10}, Landroidx/recyclerview/widget/m0;->getAbsoluteMovementFlags(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;)I

    move-result v0

    and-int/2addr v0, v15

    iget v2, v1, Landroidx/recyclerview/widget/o0;->n:I

    mul-int/lit8 v2, v2, 0x8

    shr-int/2addr v0, v2

    iput v0, v1, Landroidx/recyclerview/widget/o0;->o:I

    iget-object v0, v10, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    int-to-float v0, v0

    iput v0, v1, Landroidx/recyclerview/widget/o0;->j:F

    iget-object v0, v10, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    int-to-float v0, v0

    iput v0, v1, Landroidx/recyclerview/widget/o0;->k:F

    iput-object v10, v1, Landroidx/recyclerview/widget/o0;->c:Landroidx/recyclerview/widget/o2;

    const/4 v0, 0x2

    if-ne v11, v0, :cond_12

    iget-object v0, v10, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {v0, v12}, Landroid/view/View;->performHapticFeedback(I)Z

    :cond_12
    iget-object v0, v1, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_14

    iget-object v2, v1, Landroidx/recyclerview/widget/o0;->c:Landroidx/recyclerview/widget/o2;

    if-eqz v2, :cond_13

    const/4 v12, 0x1

    :cond_13
    invoke-interface {v0, v12}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_14
    if-nez v4, :cond_15

    iget-object v0, v1, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/u1;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/u1;->requestSimpleAnimationsInNextLayout()V

    :cond_15
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v1, Landroidx/recyclerview/widget/o0;->r:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/k2;)V
    .locals 9

    iget-object p3, p0, Landroidx/recyclerview/widget/o0;->c:Landroidx/recyclerview/widget/o2;

    if-eqz p3, :cond_0

    iget-object p3, p0, Landroidx/recyclerview/widget/o0;->b:[F

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/o0;->k([F)V

    const/4 v0, 0x0

    aget v0, p3, v0

    const/4 v1, 0x1

    aget p3, p3, v1

    move v8, p3

    move v7, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    move v7, v0

    move v8, v7

    :goto_0
    iget-object v4, p0, Landroidx/recyclerview/widget/o0;->c:Landroidx/recyclerview/widget/o2;

    iget-object v5, p0, Landroidx/recyclerview/widget/o0;->p:Ljava/util/ArrayList;

    iget v6, p0, Landroidx/recyclerview/widget/o0;->n:I

    iget-object v1, p0, Landroidx/recyclerview/widget/o0;->m:Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v1 .. v8}, Landroidx/recyclerview/widget/m0;->onDraw(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;Ljava/util/List;IFF)V

    return-void
.end method

.method public final onDrawOver(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/k2;)V
    .locals 9

    iget-object p3, p0, Landroidx/recyclerview/widget/o0;->c:Landroidx/recyclerview/widget/o2;

    if-eqz p3, :cond_0

    iget-object p3, p0, Landroidx/recyclerview/widget/o0;->b:[F

    invoke-virtual {p0, p3}, Landroidx/recyclerview/widget/o0;->k([F)V

    const/4 v0, 0x0

    aget v0, p3, v0

    const/4 v1, 0x1

    aget p3, p3, v1

    move v8, p3

    move v7, v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    move v7, v0

    move v8, v7

    :goto_0
    iget-object v4, p0, Landroidx/recyclerview/widget/o0;->c:Landroidx/recyclerview/widget/o2;

    iget-object v5, p0, Landroidx/recyclerview/widget/o0;->p:Ljava/util/ArrayList;

    iget v6, p0, Landroidx/recyclerview/widget/o0;->n:I

    iget-object v1, p0, Landroidx/recyclerview/widget/o0;->m:Lio/getstream/chat/android/ui/feature/messages/list/internal/SwipeReplyCallback;

    move-object v2, p1

    move-object v3, p2

    invoke-virtual/range {v1 .. v8}, Landroidx/recyclerview/widget/m0;->onDrawOver(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/o2;Ljava/util/List;IFF)V

    return-void
.end method

.method public final p(IILandroid/view/MotionEvent;)V
    .locals 1

    invoke-virtual {p3, p2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    invoke-virtual {p3, p2}, Landroid/view/MotionEvent;->getY(I)F

    move-result p2

    iget p3, p0, Landroidx/recyclerview/widget/o0;->d:F

    sub-float/2addr v0, p3

    iput v0, p0, Landroidx/recyclerview/widget/o0;->h:F

    iget p3, p0, Landroidx/recyclerview/widget/o0;->e:F

    sub-float/2addr p2, p3

    iput p2, p0, Landroidx/recyclerview/widget/o0;->i:F

    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_0

    invoke-static {p3, v0}, Ljava/lang/Math;->max(FF)F

    move-result p2

    iput p2, p0, Landroidx/recyclerview/widget/o0;->h:F

    :cond_0
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_1

    iget p2, p0, Landroidx/recyclerview/widget/o0;->h:F

    invoke-static {p3, p2}, Ljava/lang/Math;->min(FF)F

    move-result p2

    iput p2, p0, Landroidx/recyclerview/widget/o0;->h:F

    :cond_1
    and-int/lit8 p2, p1, 0x1

    if-nez p2, :cond_2

    iget p2, p0, Landroidx/recyclerview/widget/o0;->i:F

    invoke-static {p3, p2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    iput p2, p0, Landroidx/recyclerview/widget/o0;->i:F

    :cond_2
    and-int/lit8 p1, p1, 0x2

    if-nez p1, :cond_3

    iget p1, p0, Landroidx/recyclerview/widget/o0;->i:F

    invoke-static {p3, p1}, Ljava/lang/Math;->min(FF)F

    move-result p1

    iput p1, p0, Landroidx/recyclerview/widget/o0;->i:F

    :cond_3
    return-void
.end method
