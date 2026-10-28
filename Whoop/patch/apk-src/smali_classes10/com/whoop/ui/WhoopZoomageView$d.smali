.class Lcom/whoop/ui/WhoopZoomageView$d;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/ui/WhoopZoomageView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic w:Lcom/whoop/ui/WhoopZoomageView;


# direct methods
.method public constructor <init>(Lcom/whoop/ui/WhoopZoomageView;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/ui/WhoopZoomageView$d;->w:Lcom/whoop/ui/WhoopZoomageView;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDoubleTapEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lcom/whoop/ui/WhoopZoomageView$d;->w:Lcom/whoop/ui/WhoopZoomageView;

    invoke-static {p1}, Lcom/whoop/ui/WhoopZoomageView;->c(Lcom/whoop/ui/WhoopZoomageView;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onSingleTapConfirmed(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object p1, p0, Lcom/whoop/ui/WhoopZoomageView$d;->w:Lcom/whoop/ui/WhoopZoomageView;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/whoop/ui/WhoopZoomageView;->d(Lcom/whoop/ui/WhoopZoomageView;Z)V

    return v0
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object p1, p0, Lcom/whoop/ui/WhoopZoomageView$d;->w:Lcom/whoop/ui/WhoopZoomageView;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/whoop/ui/WhoopZoomageView;->d(Lcom/whoop/ui/WhoopZoomageView;Z)V

    const/4 p1, 0x0

    return p1
.end method
