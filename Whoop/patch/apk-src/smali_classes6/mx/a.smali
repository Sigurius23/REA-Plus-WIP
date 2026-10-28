.class public final Lmx/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/recyclerview/widget/y1;


# instance fields
.field public a:Landroid/view/GestureDetector;

.field public final synthetic b:Lmx/b;


# direct methods
.method public constructor <init>(Lmx/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmx/a;->b:Lmx/b;

    return-void
.end method


# virtual methods
.method public final b(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)Z
    .locals 3

    iget-object v0, p0, Lmx/a;->a:Landroid/view/GestureDetector;

    if-nez v0, :cond_0

    new-instance v0, Landroid/view/GestureDetector;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Le23/a;

    invoke-direct {v2, p0, p1}, Le23/a;-><init>(Lmx/a;Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-direct {v0, v1, v2}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lmx/a;->a:Landroid/view/GestureDetector;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V

    :cond_0
    iget-object v0, p0, Lmx/a;->a:Landroid/view/GestureDetector;

    invoke-virtual {v0, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-virtual {p1, v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->findChildViewUnder(FF)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result v1

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/o2;

    move-result-object p1

    check-cast p1, Llx/d;

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    iget-object p2, p0, Lmx/a;->b:Lmx/b;

    iget-object v0, p2, Lmx/b;->a:Lmx/c;

    invoke-virtual {v0, v1}, Lmx/c;->A(I)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p2, p2, Lmx/b;->a:Lmx/c;

    invoke-virtual {p2, v1, p1}, Lmx/c;->O(ILlx/d;)V

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final d(Z)V
    .locals 0

    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method
