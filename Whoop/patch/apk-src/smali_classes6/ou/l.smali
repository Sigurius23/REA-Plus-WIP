.class public final Lou/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lou/m;


# instance fields
.field public final synthetic w:Lou/n;


# direct methods
.method public constructor <init>(Lou/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lou/l;->w:Lou/n;

    return-void
.end method


# virtual methods
.method public final onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 2

    const/16 v0, 0xa

    iget-object v1, p0, Lou/l;->w:Lou/n;

    invoke-virtual {v1, v0}, Lou/a;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v1, Lou/a;->h:Ljava/lang/Object;

    check-cast v0, Lou/m;

    invoke-interface {v0, p1}, Landroid/view/GestureDetector$OnDoubleTapListener;->onDoubleTap(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onDoubleTapEvent(Landroid/view/MotionEvent;)Z
    .locals 2

    const/16 v0, 0xb

    iget-object v1, p0, Lou/l;->w:Lou/n;

    invoke-virtual {v1, v0}, Lou/a;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v1, Lou/a;->h:Ljava/lang/Object;

    check-cast v0, Lou/m;

    invoke-interface {v0, p1}, Landroid/view/GestureDetector$OnDoubleTapListener;->onDoubleTapEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 2

    const/16 v0, 0x9

    iget-object v1, p0, Lou/l;->w:Lou/n;

    invoke-virtual {v1, v0}, Lou/a;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v1, Lou/a;->h:Ljava/lang/Object;

    check-cast v0, Lou/m;

    invoke-interface {v0, p1}, Landroid/view/GestureDetector$OnGestureListener;->onDown(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 2

    const/4 v0, 0x7

    iget-object v1, p0, Lou/l;->w:Lou/n;

    invoke-virtual {v1, v0}, Lou/a;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v1, Lou/a;->h:Ljava/lang/Object;

    check-cast v0, Lou/m;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/GestureDetector$OnGestureListener;->onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 2

    const/4 v0, 0x6

    iget-object v1, p0, Lou/l;->w:Lou/n;

    invoke-virtual {v1, v0}, Lou/a;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v1, Lou/a;->h:Ljava/lang/Object;

    check-cast v0, Lou/m;

    invoke-interface {v0, p1}, Landroid/view/GestureDetector$OnGestureListener;->onLongPress(Landroid/view/MotionEvent;)V

    :cond_0
    return-void
.end method

.method public final onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 3

    iget-object v0, p0, Lou/l;->w:Lou/n;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lou/a;->b(I)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, v0, Lou/a;->h:Ljava/lang/Object;

    check-cast v0, Lou/m;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/GestureDetector$OnGestureListener;->onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final onShowPress(Landroid/view/MotionEvent;)V
    .locals 2

    const/16 v0, 0x8

    iget-object v1, p0, Lou/l;->w:Lou/n;

    invoke-virtual {v1, v0}, Lou/a;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v1, Lou/a;->h:Ljava/lang/Object;

    check-cast v0, Lou/m;

    invoke-interface {v0, p1}, Landroid/view/GestureDetector$OnGestureListener;->onShowPress(Landroid/view/MotionEvent;)V

    :cond_0
    return-void
.end method

.method public final onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 2

    const/16 v0, 0xc

    iget-object v1, p0, Lou/l;->w:Lou/n;

    invoke-virtual {v1, v0}, Lou/a;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v1, Lou/a;->h:Ljava/lang/Object;

    check-cast v0, Lou/m;

    invoke-interface {v0, p1}, Landroid/view/GestureDetector$OnDoubleTapListener;->onSingleTapConfirmed(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 2

    const/4 v0, 0x5

    iget-object v1, p0, Lou/l;->w:Lou/n;

    invoke-virtual {v1, v0}, Lou/a;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, v1, Lou/a;->h:Ljava/lang/Object;

    check-cast v0, Lou/m;

    invoke-interface {v0, p1}, Landroid/view/GestureDetector$OnGestureListener;->onSingleTapUp(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
