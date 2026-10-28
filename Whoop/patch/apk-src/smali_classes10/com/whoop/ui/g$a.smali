.class final Lcom/whoop/ui/g$a;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/ui/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0005\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J1\u0010\u000e\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/whoop/ui/g$a;",
        "Landroid/view/GestureDetector$SimpleOnGestureListener;",
        "<init>",
        "(Lcom/whoop/ui/g;)V",
        "Landroid/view/MotionEvent;",
        "motionEvent",
        "",
        "onDown",
        "(Landroid/view/MotionEvent;)Z",
        "motionEvent1",
        "motionEvent2",
        "",
        "velocityX",
        "velocityY",
        "onFling",
        "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z",
        "feature_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lcom/whoop/ui/g;


# direct methods
.method public constructor <init>(Lcom/whoop/ui/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/ui/g$a;->w:Lcom/whoop/ui/g;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    const-string v0, "motionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 5

    const-string v0, "motionEvent2"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    :try_start_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    sub-float/2addr v1, v2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    sub-float/2addr p2, p1

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpl-float p1, p1, v2

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/high16 v4, 0x42c80000    # 100.0f

    if-lez p1, :cond_2

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p1

    cmpl-float p1, p1, v4

    if-lez p1, :cond_4

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p1

    cmpl-float p1, p1, v4

    if-lez p1, :cond_4

    cmpl-float p1, p2, v3

    if-lez p1, :cond_1

    iget-object p1, p0, Lcom/whoop/ui/g$a;->w:Lcom/whoop/ui/g;

    invoke-virtual {p1}, Lcom/whoop/ui/g;->c()V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    iget-object p1, p0, Lcom/whoop/ui/g$a;->w:Lcom/whoop/ui/g;

    invoke-virtual {p1}, Lcom/whoop/ui/g;->b()V

    :goto_0
    return v2

    :cond_2
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result p1

    cmpl-float p1, p1, v4

    if-lez p1, :cond_4

    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result p1

    cmpl-float p1, p1, v4

    if-lez p1, :cond_4

    cmpl-float p1, v1, v3

    if-lez p1, :cond_3

    iget-object p1, p0, Lcom/whoop/ui/g$a;->w:Lcom/whoop/ui/g;

    invoke-virtual {p1}, Lcom/whoop/ui/g;->a()V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/whoop/ui/g$a;->w:Lcom/whoop/ui/g;

    invoke-virtual {p1}, Lcom/whoop/ui/g;->d()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    return v2

    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_4
    return v0
.end method
