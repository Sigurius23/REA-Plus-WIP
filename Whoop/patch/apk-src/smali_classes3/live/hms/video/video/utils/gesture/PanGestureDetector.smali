.class public final Llive/hms/video/video/utils/gesture/PanGestureDetector;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J*\u0010\u0008\u001a\u00020\t2\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0015\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000bH\u0000\u00a2\u0006\u0002\u0008\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"
    }
    d2 = {
        "Llive/hms/video/video/utils/gesture/PanGestureDetector;",
        "Landroid/view/GestureDetector$SimpleOnGestureListener;",
        "context",
        "Landroid/content/Context;",
        "matrixManager",
        "Llive/hms/video/video/utils/matrix/MatrixManager;",
        "<init>",
        "(Landroid/content/Context;Llive/hms/video/video/utils/matrix/MatrixManager;)V",
        "onScroll",
        "",
        "e1",
        "Landroid/view/MotionEvent;",
        "e2",
        "distanceX",
        "",
        "distanceY",
        "detector",
        "Landroid/view/GestureDetector;",
        "interceptTouch",
        "event",
        "interceptTouch$videoview_release",
        "videoview_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final detector:Landroid/view/GestureDetector;

.field private final matrixManager:Llive/hms/video/video/utils/matrix/MatrixManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;Llive/hms/video/video/utils/matrix/MatrixManager;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "matrixManager"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    iput-object p2, p0, Llive/hms/video/video/utils/gesture/PanGestureDetector;->matrixManager:Llive/hms/video/video/utils/matrix/MatrixManager;

    new-instance p2, Landroid/view/GestureDetector;

    invoke-direct {p2, p1, p0}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p2, p0, Llive/hms/video/video/utils/gesture/PanGestureDetector;->detector:Landroid/view/GestureDetector;

    return-void
.end method


# virtual methods
.method public final interceptTouch$videoview_release(Landroid/view/MotionEvent;)Z
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/video/utils/gesture/PanGestureDetector;->detector:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 0

    const-string p1, "e2"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Llive/hms/video/video/utils/gesture/PanGestureDetector;->matrixManager:Llive/hms/video/video/utils/matrix/MatrixManager;

    neg-float p2, p4

    invoke-virtual {p1, p3, p2}, Llive/hms/video/video/utils/matrix/MatrixManager;->onPan$videoview_release(FF)V

    const/4 p1, 0x1

    return p1
.end method
