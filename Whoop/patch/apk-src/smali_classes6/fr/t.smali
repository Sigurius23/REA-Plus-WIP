.class public final Lfr/t;
.super Lb3/b;
.source "SourceFile"


# static fields
.field public static final l:[I

.field public static final m:[I

.field public static final n:Lbc/b;


# instance fields
.field public d:Landroid/animation/ObjectAnimator;

.field public e:Landroid/animation/ObjectAnimator;

.field public final f:[Landroid/view/animation/Interpolator;

.field public final g:Lfr/u;

.field public h:I

.field public i:Z

.field public j:F

.field public k:Lfr/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x352

    const/16 v1, 0x2ee

    const/16 v2, 0x215

    const/16 v3, 0x237

    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    sput-object v0, Lfr/t;->l:[I

    const/16 v0, 0x14d

    const/4 v1, 0x0

    const/16 v2, 0x4f3

    const/16 v3, 0x3e8

    filled-new-array {v2, v3, v0, v1}, [I

    move-result-object v0

    sput-object v0, Lfr/t;->m:[I

    new-instance v0, Lbc/b;

    const-string v1, "animationFraction"

    const/16 v2, 0xb

    const-class v3, Ljava/lang/Float;

    invoke-direct {v0, v3, v1, v2}, Lbc/b;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    sput-object v0, Lfr/t;->n:Lbc/b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lfr/u;)V
    .locals 5

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lb3/b;-><init>(I)V

    const/4 v1, 0x0

    iput v1, p0, Lfr/t;->h:I

    const/4 v2, 0x0

    iput-object v2, p0, Lfr/t;->k:Lfr/c;

    iput-object p2, p0, Lfr/t;->g:Lfr/u;

    const p2, 0x7f010033

    invoke-static {p1, p2}, Lcc/a;->a(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object p2

    const v2, 0x7f010034

    invoke-static {p1, v2}, Lcc/a;->a(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object v2

    const v3, 0x7f010035

    invoke-static {p1, v3}, Lcc/a;->a(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object v3

    const v4, 0x7f010036

    invoke-static {p1, v4}, Lcc/a;->a(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object p1

    const/4 v4, 0x4

    new-array v4, v4, [Landroid/view/animation/Interpolator;

    aput-object p2, v4, v1

    const/4 p2, 0x1

    aput-object v2, v4, p2

    aput-object v3, v4, v0

    const/4 p2, 0x3

    aput-object p1, v4, p2

    iput-object v4, p0, Lfr/t;->f:[Landroid/view/animation/Interpolator;

    return-void
.end method


# virtual methods
.method public final D(Lfr/c;)V
    .locals 0

    iput-object p1, p0, Lfr/t;->k:Lfr/c;

    return-void
.end method

.method public final E()V
    .locals 4

    iget-object v0, p0, Lfr/t;->e:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/animation/Animator;->isRunning()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lfr/t;->f()V

    iget-object v0, p0, Lb3/b;->b:Ljava/lang/Object;

    check-cast v0, Lfr/p;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lfr/t;->e:Landroid/animation/ObjectAnimator;

    iget v1, p0, Lfr/t;->j:F

    const/4 v2, 0x2

    new-array v2, v2, [F

    const/4 v3, 0x0

    aput v1, v2, v3

    const/4 v1, 0x1

    const/high16 v3, 0x3f800000    # 1.0f

    aput v3, v2, v1

    invoke-virtual {v0, v2}, Landroid/animation/ObjectAnimator;->setFloatValues([F)V

    iget-object v0, p0, Lfr/t;->e:Landroid/animation/ObjectAnimator;

    iget v1, p0, Lfr/t;->j:F

    sub-float/2addr v3, v1

    const/high16 v1, 0x44e10000    # 1800.0f

    mul-float/2addr v3, v1

    float-to-long v1, v3

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    iget-object v0, p0, Lfr/t;->e:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final I()V
    .locals 8

    iget-object v0, p0, Lfr/t;->d:Landroid/animation/ObjectAnimator;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x708

    sget-object v5, Lfr/t;->n:Lbc/b;

    if-nez v0, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    invoke-static {p0, v5, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lfr/t;->d:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    iget-object v0, p0, Lfr/t;->d:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0, v2}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v0, p0, Lfr/t;->d:Landroid/animation/ObjectAnimator;

    const/4 v6, -0x1

    invoke-virtual {v0, v6}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    iget-object v0, p0, Lfr/t;->d:Landroid/animation/ObjectAnimator;

    new-instance v6, Lfr/s;

    invoke-direct {v6, p0, v1}, Lfr/s;-><init>(Lfr/t;I)V

    invoke-virtual {v0, v6}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_0
    iget-object v0, p0, Lfr/t;->e:Landroid/animation/ObjectAnimator;

    if-nez v0, :cond_1

    const/4 v0, 0x1

    new-array v6, v0, [F

    const/high16 v7, 0x3f800000    # 1.0f

    aput v7, v6, v1

    invoke-static {p0, v5, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    iput-object v1, p0, Lfr/t;->e:Landroid/animation/ObjectAnimator;

    invoke-virtual {v1, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    iget-object v1, p0, Lfr/t;->e:Landroid/animation/ObjectAnimator;

    invoke-virtual {v1, v2}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v1, p0, Lfr/t;->e:Landroid/animation/ObjectAnimator;

    new-instance v2, Lfr/s;

    invoke-direct {v2, p0, v0}, Lfr/s;-><init>(Lfr/t;I)V

    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_1
    invoke-virtual {p0}, Lfr/t;->L()V

    iget-object v0, p0, Lfr/t;->d:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final K()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lfr/t;->k:Lfr/c;

    return-void
.end method

.method public final L()V
    .locals 4

    const/4 v0, 0x0

    iput v0, p0, Lfr/t;->h:I

    iget-object v1, p0, Lb3/b;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfr/n;

    iget-object v3, p0, Lfr/t;->g:Lfr/u;

    iget-object v3, v3, Lfr/e;->c:[I

    aget v3, v3, v0

    iput v3, v2, Lfr/n;->c:I

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final f()V
    .locals 1

    iget-object v0, p0, Lfr/t;->d:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    :cond_0
    return-void
.end method

.method public final w()V
    .locals 0

    invoke-virtual {p0}, Lfr/t;->L()V

    return-void
.end method
