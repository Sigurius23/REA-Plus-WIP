.class public final Lsv/g;
.super Lsv/d;
.source "SourceFile"


# static fields
.field public static final J:Landroid/view/animation/PathInterpolator;


# instance fields
.field public final F:F

.field public G:D

.field public H:I

.field public final I:Z


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Landroid/view/animation/PathInterpolator;

    const/4 v1, 0x0

    const/high16 v2, 0x3e800000    # 0.25f

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v1, v2, v3}, Landroid/view/animation/PathInterpolator;-><init>(FFFF)V

    sput-object v0, Lsv/g;->J:Landroid/view/animation/PathInterpolator;

    return-void
.end method

.method public constructor <init>(F)V
    .locals 4

    sget-object v0, Lsv/a;->b:Lgv/j;

    invoke-direct {p0, v0}, Lsv/d;-><init>(Landroid/animation/TypeEvaluator;)V

    iput p1, p0, Lsv/g;->F:F

    const-wide/high16 v0, 0x4024000000000000L    # 10.0

    float-to-double v2, p1

    mul-double/2addr v2, v0

    iput-wide v2, p0, Lsv/g;->G:D

    const p1, -0xffff01

    iput p1, p0, Lsv/g;->H:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lsv/g;->I:Z

    const-wide/16 v0, 0xbb8

    invoke-virtual {p0, v0, v1}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    invoke-virtual {p0, p1}, Landroid/animation/ValueAnimator;->setRepeatMode(I)V

    const/4 p1, -0x1

    invoke-virtual {p0, p1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    sget-object p1, Lsv/g;->J:Landroid/view/animation/PathInterpolator;

    invoke-virtual {p0, p1}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;F)V
    .locals 6

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v0

    iget-boolean p1, p0, Lsv/g;->I:Z

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    if-eqz p1, :cond_0

    iget-wide v4, p0, Lsv/g;->G:D

    div-double v4, v0, v4

    double-to-float p1, v4

    sub-float p1, v3, p1

    invoke-static {p1, v2, v3}, Le93/b;->m(FFF)F

    move-result v3

    :cond_0
    iget-object p1, p0, Lsv/d;->y:Lrv/p;

    if-eqz p1, :cond_2

    iget v4, p0, Lsv/g;->H:I

    double-to-float v0, v0

    const v1, 0x3dcccccd    # 0.1f

    cmpg-float p2, p2, v1

    if-gtz p2, :cond_1

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-interface {p1, v4, v0, p2}, Lrv/p;->l(IFLjava/lang/Float;)V

    :cond_2
    return-void
.end method

.method public final d()V
    .locals 6

    iget-wide v0, p0, Lsv/g;->G:D

    const-wide/16 v2, 0x0

    cmpg-double v0, v0, v2

    if-gtz v0, :cond_0

    iget v0, p0, Lsv/g;->F:F

    float-to-double v0, v0

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    mul-double/2addr v0, v4

    iput-wide v0, p0, Lsv/g;->G:D

    :cond_0
    invoke-virtual {p0}, Landroid/animation/Animator;->isRunning()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iget-wide v1, p0, Lsv/g;->G:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Double;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lsv/d;->a([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    :cond_1
    new-instance v0, Lar/d;

    const/16 v1, 0x10

    invoke-direct {v0, p0, v1}, Lar/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void
.end method
