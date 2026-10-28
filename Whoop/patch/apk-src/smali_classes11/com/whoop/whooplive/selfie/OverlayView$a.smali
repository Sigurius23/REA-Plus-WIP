.class Lcom/whoop/whooplive/selfie/OverlayView$a;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplive/selfie/OverlayView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field final synthetic w:Lcom/whoop/whooplive/selfie/OverlayView;


# direct methods
.method private constructor <init>(Lcom/whoop/whooplive/selfie/OverlayView;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView$a;->w:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/whooplive/selfie/OverlayView;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/OverlayView$a;-><init>(Lcom/whoop/whooplive/selfie/OverlayView;)V

    return-void
.end method


# virtual methods
.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 2

    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p3

    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result p4

    cmpl-float p3, p3, p4

    const/4 p4, 0x1

    if-lez p3, :cond_9

    iget-object p3, p0, Lcom/whoop/whooplive/selfie/OverlayView$a;->w:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-static {p3}, Lcom/whoop/whooplive/selfie/OverlayView;->h(Lcom/whoop/whooplive/selfie/OverlayView;)Z

    move-result p3

    const/4 v0, 0x0

    if-eqz p3, :cond_3

    iget-object p3, p0, Lcom/whoop/whooplive/selfie/OverlayView$a;->w:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-static {p3}, Lcom/whoop/whooplive/selfie/OverlayView;->g(Lcom/whoop/whooplive/selfie/OverlayView;)Z

    move-result p3

    if-nez p3, :cond_9

    iget-object p3, p0, Lcom/whoop/whooplive/selfie/OverlayView$a;->w:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-static {p3}, Lcom/whoop/whooplive/selfie/OverlayView;->f(Lcom/whoop/whooplive/selfie/OverlayView;)Llh3/b;

    move-result-object p3

    invoke-virtual {p3}, Llh3/b;->Z()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lrz2/a;

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    invoke-static {}, Lrz2/a;->values()[Lrz2/a;

    move-result-object v1

    array-length v1, v1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result p2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result p1

    cmpl-float p1, p2, p1

    if-lez p1, :cond_0

    add-int/lit8 p3, p3, -0x1

    goto :goto_0

    :cond_0
    add-int/2addr p3, p4

    :goto_0
    if-gez p3, :cond_1

    add-int/lit8 v0, v1, -0x1

    goto :goto_1

    :cond_1
    if-lt p3, v1, :cond_2

    goto :goto_1

    :cond_2
    move v0, p3

    :goto_1
    invoke-static {}, Lrz2/a;->values()[Lrz2/a;

    move-result-object p1

    aget-object p1, p1, v0

    iget-object p2, p0, Lcom/whoop/whooplive/selfie/OverlayView$a;->w:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-static {p2}, Lcom/whoop/whooplive/selfie/OverlayView;->f(Lcom/whoop/whooplive/selfie/OverlayView;)Llh3/b;

    move-result-object p2

    invoke-virtual {p2, p1}, Llh3/b;->onNext(Ljava/lang/Object;)V

    return p4

    :cond_3
    iget-object p3, p0, Lcom/whoop/whooplive/selfie/OverlayView$a;->w:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-static {p3}, Lcom/whoop/whooplive/selfie/OverlayView;->e(Lcom/whoop/whooplive/selfie/OverlayView;)Llh3/b;

    move-result-object p3

    invoke-virtual {p3}, Llh3/b;->Z()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Luz2/a;

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/OverlayView$a;->w:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-static {v1}, Lcom/whoop/whooplive/selfie/OverlayView;->i(Lcom/whoop/whooplive/selfie/OverlayView;)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    invoke-static {}, Luz2/a;->values()[Luz2/a;

    move-result-object v1

    array-length v1, v1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result p2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result p1

    cmpl-float p1, p2, p1

    if-lez p1, :cond_4

    add-int/lit8 p3, p3, -0x1

    goto :goto_2

    :cond_4
    add-int/2addr p3, p4

    :goto_2
    if-gez p3, :cond_5

    add-int/lit8 v0, v1, -0x1

    goto :goto_3

    :cond_5
    if-lt p3, v1, :cond_6

    goto :goto_3

    :cond_6
    move v0, p3

    :goto_3
    invoke-static {}, Luz2/a;->values()[Luz2/a;

    move-result-object p1

    aget-object p1, p1, v0

    goto :goto_4

    :cond_7
    sget-object p1, Luz2/a;->LIGHT:Luz2/a;

    if-ne p3, p1, :cond_8

    sget-object p1, Luz2/a;->DARK:Luz2/a;

    :cond_8
    :goto_4
    iget-object p2, p0, Lcom/whoop/whooplive/selfie/OverlayView$a;->w:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-static {p2}, Lcom/whoop/whooplive/selfie/OverlayView;->e(Lcom/whoop/whooplive/selfie/OverlayView;)Llh3/b;

    move-result-object p2

    invoke-virtual {p2, p1}, Llh3/b;->onNext(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/whoop/whooplive/selfie/OverlayView$a;->w:Lcom/whoop/whooplive/selfie/OverlayView;

    invoke-static {p2, p1}, Lcom/whoop/whooplive/selfie/OverlayView;->j(Lcom/whoop/whooplive/selfie/OverlayView;Luz2/a;)V

    :cond_9
    return p4
.end method
