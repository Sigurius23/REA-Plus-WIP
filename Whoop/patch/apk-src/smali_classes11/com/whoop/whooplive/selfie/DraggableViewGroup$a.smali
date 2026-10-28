.class Lcom/whoop/whooplive/selfie/DraggableViewGroup$a;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplive/selfie/DraggableViewGroup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field final synthetic w:Lcom/whoop/whooplive/selfie/DraggableViewGroup;


# direct methods
.method private constructor <init>(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$a;->w:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/whooplive/selfie/DraggableViewGroup;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/DraggableViewGroup$a;-><init>(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)V

    return-void
.end method


# virtual methods
.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 2

    iget-object p3, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$a;->w:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-static {p3}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->l(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)Z

    move-result p3

    const/4 p4, 0x0

    if-eqz p3, :cond_0

    return p4

    :cond_0
    invoke-virtual {p1, p4}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p3

    invoke-virtual {p2, p4}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    if-eq p3, v0, :cond_1

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$a;->w:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-static {p1}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->e(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)Ltr2/n;

    move-result-object p1

    const-string p2, "Pointer IDs do not match"

    new-array p3, p4, [Lqr2/a$a;

    invoke-interface {p1, p2, p3}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return p4

    :cond_1
    iget-object p3, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$a;->w:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-static {p3}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->a(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)I

    move-result p3

    const/high16 v0, -0x80000000

    if-ne p3, v0, :cond_2

    iget-object p3, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$a;->w:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-static {p3}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->b(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)Landroid/view/View;

    move-result-object p3

    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    check-cast p3, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$a;->w:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    iget v1, p3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    int-to-float v1, v1

    invoke-static {v0, v1}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->o(Lcom/whoop/whooplive/selfie/DraggableViewGroup;F)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$a;->w:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    iget p3, p3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    int-to-float p3, p3

    invoke-static {v0, p3}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->p(Lcom/whoop/whooplive/selfie/DraggableViewGroup;F)V

    iget-object p3, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$a;->w:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-virtual {p1, p4}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result p4

    invoke-static {p3, p4}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->n(Lcom/whoop/whooplive/selfie/DraggableViewGroup;I)V

    :cond_2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawX()F

    move-result p3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawX()F

    move-result p4

    sub-float/2addr p3, p4

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getRawY()F

    move-result p2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    move-result p1

    sub-float/2addr p2, p1

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$a;->w:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-static {p1}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->c(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)F

    move-result p1

    add-float/2addr p1, p3

    float-to-int p1, p1

    iget-object p3, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$a;->w:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-static {p3}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->d(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)F

    move-result p3

    add-float/2addr p3, p2

    float-to-int p2, p3

    iget-object p3, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$a;->w:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-virtual {p3}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->u()Z

    move-result p3

    if-eqz p3, :cond_3

    iget-object p3, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$a;->w:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-static {p3}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->h(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)Llh3/e;

    move-result-object p3

    new-instance p4, Landroid/util/Pair;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p4, p1, p2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p3, p4}, Llh3/e;->onNext(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    iget-object p3, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$a;->w:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-virtual {p3, p1, p2}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->x(II)V

    :goto_0
    const/4 p1, 0x1

    return p1
.end method
