.class Lcom/whoop/ui/WhoopZoomageView$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ui/WhoopZoomageView;->e(IF)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final a:[F

.field b:Landroid/graphics/Matrix;

.field final synthetic c:I

.field final synthetic d:Lcom/whoop/ui/WhoopZoomageView;


# direct methods
.method public constructor <init>(Lcom/whoop/ui/WhoopZoomageView;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/ui/WhoopZoomageView$c;->d:Lcom/whoop/ui/WhoopZoomageView;

    iput p2, p0, Lcom/whoop/ui/WhoopZoomageView$c;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x9

    new-array p1, p1, [F

    iput-object p1, p0, Lcom/whoop/ui/WhoopZoomageView$c;->a:[F

    new-instance p1, Landroid/graphics/Matrix;

    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    iput-object p1, p0, Lcom/whoop/ui/WhoopZoomageView$c;->b:Landroid/graphics/Matrix;

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView$c;->b:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/whoop/ui/WhoopZoomageView$c;->d:Lcom/whoop/ui/WhoopZoomageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView$c;->b:Landroid/graphics/Matrix;

    iget-object v1, p0, Lcom/whoop/ui/WhoopZoomageView$c;->a:[F

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView$c;->a:[F

    iget v1, p0, Lcom/whoop/ui/WhoopZoomageView$c;->c:I

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    aput p1, v0, v1

    iget-object p1, p0, Lcom/whoop/ui/WhoopZoomageView$c;->b:Landroid/graphics/Matrix;

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView$c;->a:[F

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->setValues([F)V

    iget-object p1, p0, Lcom/whoop/ui/WhoopZoomageView$c;->d:Lcom/whoop/ui/WhoopZoomageView;

    iget-object v0, p0, Lcom/whoop/ui/WhoopZoomageView$c;->b:Landroid/graphics/Matrix;

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    return-void
.end method
