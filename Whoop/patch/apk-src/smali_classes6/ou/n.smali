.class public final Lou/n;
.super Lou/a;
.source "SourceFile"


# instance fields
.field public final i:Landroid/view/GestureDetector;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/sentry/android/replay/video/d;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Lou/a;-><init>(Landroid/content/Context;Lio/sentry/android/replay/video/d;)V

    new-instance p2, Lou/l;

    invoke-direct {p2, p0}, Lou/l;-><init>(Lou/n;)V

    new-instance v0, Landroid/view/GestureDetector;

    invoke-direct {v0, p1, p2}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lou/n;->i:Landroid/view/GestureDetector;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-object v0, p0, Lou/n;->i:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
