.class Lcom/whoop/whooplive/selfie/DraggableViewGroup$b;
.super Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/whooplive/selfie/DraggableViewGroup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field private w:F

.field final synthetic x:Lcom/whoop/whooplive/selfie/DraggableViewGroup;


# direct methods
.method private constructor <init>(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$b;->x:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-direct {p0}, Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;-><init>()V

    const/4 p1, 0x1

    .line 3
    iput p1, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$b;->w:F

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/whooplive/selfie/DraggableViewGroup;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/DraggableViewGroup$b;-><init>(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)V

    return-void
.end method


# virtual methods
.method public onScale(Landroid/view/ScaleGestureDetector;)Z
    .locals 3

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getCurrentSpan()F

    move-result v0

    iget v1, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$b;->w:F

    sub-float v1, v0, v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    iget-object v2, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$b;->x:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-static {v2}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->j(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)F

    move-result v2

    cmpg-float v1, v1, v2

    if-gez v1, :cond_0

    goto :goto_0

    :cond_0
    iput v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$b;->w:F

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$b;->x:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-static {v0}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->r(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)V

    invoke-virtual {p1}, Landroid/view/ScaleGestureDetector;->getScaleFactor()F

    move-result p1

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v0

    if-nez v0, :cond_1

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_1
    iget-object v0, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$b;->x:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-static {v0}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->i(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)F

    move-result v1

    mul-float/2addr v1, p1

    invoke-static {v0, v1}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->q(Lcom/whoop/whooplive/selfie/DraggableViewGroup;F)V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$b;->x:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-static {p1}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->g(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)F

    move-result v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$b;->x:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-static {v1}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->i(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)F

    move-result v1

    iget-object v2, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$b;->x:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-static {v2}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->f(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)F

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v0

    invoke-static {p1, v0}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->q(Lcom/whoop/whooplive/selfie/DraggableViewGroup;F)V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$b;->x:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-static {p1}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->m(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)Z

    move-result p1

    const/4 v0, 0x1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$b;->x:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-static {p1}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->k(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)Llh3/e;

    move-result-object p1

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$b;->x:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-static {v1}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->i(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p1, v1}, Llh3/e;->onNext(Ljava/lang/Object;)V

    return v0

    :cond_2
    iget-object p1, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$b;->x:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-static {p1}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->i(Lcom/whoop/whooplive/selfie/DraggableViewGroup;)F

    move-result v1

    invoke-virtual {p1, v1}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->y(F)V

    return v0
.end method

.method public onScaleEnd(Landroid/view/ScaleGestureDetector;)V
    .locals 0

    const/4 p1, 0x1

    iput p1, p0, Lcom/whoop/whooplive/selfie/DraggableViewGroup$b;->w:F

    return-void
.end method
