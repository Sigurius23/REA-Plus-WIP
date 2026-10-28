.class public abstract Lfr/m;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"

# interfaces
.implements Landroid/graphics/drawable/Animatable;


# static fields
.field public static final K:Lbc/b;


# instance fields
.field public E:Landroid/animation/ObjectAnimator;

.field public F:Ljava/util/ArrayList;

.field public G:Z

.field public H:F

.field public final I:Landroid/graphics/Paint;

.field public J:I

.field public final w:Landroid/content/Context;

.field public final x:Lfr/e;

.field public y:Lfr/a;

.field public z:Landroid/animation/ObjectAnimator;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lbc/b;

    const-string v1, "growFraction"

    const/16 v2, 0x9

    const-class v3, Ljava/lang/Float;

    invoke-direct {v0, v3, v1, v2}, Lbc/b;-><init>(Ljava/lang/Class;Ljava/lang/String;I)V

    sput-object v0, Lfr/m;->K:Lbc/b;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lfr/e;)V
    .locals 1

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lfr/m;->I:Landroid/graphics/Paint;

    iput-object p1, p0, Lfr/m;->w:Landroid/content/Context;

    iput-object p2, p0, Lfr/m;->x:Lfr/e;

    new-instance p1, Lfr/a;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfr/m;->y:Lfr/a;

    const/16 p1, 0xff

    invoke-virtual {p0, p1}, Lfr/m;->setAlpha(I)V

    return-void
.end method

.method public static synthetic a(Lfr/m;)V
    .locals 1

    const/4 v0, 0x0

    invoke-super {p0, v0, v0}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    return-void
.end method


# virtual methods
.method public final b()F
    .locals 2

    iget-object v0, p0, Lfr/m;->x:Lfr/e;

    iget v1, v0, Lfr/e;->e:I

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget v0, v0, Lfr/e;->f:I

    if-eqz v0, :cond_1

    :goto_0
    iget v0, p0, Lfr/m;->H:F

    return v0

    :cond_1
    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public final c(ZZZ)Z
    .locals 3

    iget-object v0, p0, Lfr/m;->y:Lfr/a;

    iget-object v1, p0, Lfr/m;->w:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "animator_duration_scale"

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v1, v0, v2}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    move-result v0

    if-eqz p3, :cond_0

    const/4 p3, 0x0

    cmpl-float p3, v0, p3

    if-lez p3, :cond_0

    const/4 p3, 0x1

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    invoke-virtual {p0, p1, p2, p3}, Lfr/m;->d(ZZZ)Z

    move-result p1

    return p1
.end method

.method public d(ZZZ)Z
    .locals 7

    iget-object v0, p0, Lfr/m;->z:Landroid/animation/ObjectAnimator;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const-wide/16 v3, 0x1f4

    sget-object v5, Lfr/m;->K:Lbc/b;

    if-nez v0, :cond_2

    new-array v0, v1, [F

    fill-array-data v0, :array_0

    invoke-static {p0, v5, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lfr/m;->z:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object v0, p0, Lfr/m;->z:Landroid/animation/ObjectAnimator;

    sget-object v6, Lkq/a;->b:Lh8/a;

    invoke-virtual {v0, v6}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v0, p0, Lfr/m;->z:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v6

    if-nez v6, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Cannot set showAnimator while the current showAnimator is running."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iput-object v0, p0, Lfr/m;->z:Landroid/animation/ObjectAnimator;

    new-instance v6, Lfr/l;

    invoke-direct {v6, p0, v2}, Lfr/l;-><init>(Lfr/m;I)V

    invoke-virtual {v0, v6}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_2
    iget-object v0, p0, Lfr/m;->E:Landroid/animation/ObjectAnimator;

    const/4 v6, 0x1

    if-nez v0, :cond_5

    new-array v0, v1, [F

    fill-array-data v0, :array_1

    invoke-static {p0, v5, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lfr/m;->E:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0, v3, v4}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    iget-object v0, p0, Lfr/m;->E:Landroid/animation/ObjectAnimator;

    sget-object v1, Lkq/a;->b:Lh8/a;

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    iget-object v0, p0, Lfr/m;->E:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Cannot set hideAnimator while the current hideAnimator is running."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    iput-object v0, p0, Lfr/m;->E:Landroid/animation/ObjectAnimator;

    new-instance v1, Lfr/l;

    invoke-direct {v1, p0, v6}, Lfr/l;-><init>(Lfr/m;I)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    :cond_5
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v0

    if-nez v0, :cond_6

    if-nez p1, :cond_6

    goto :goto_5

    :cond_6
    if-eqz p1, :cond_7

    iget-object v0, p0, Lfr/m;->z:Landroid/animation/ObjectAnimator;

    goto :goto_2

    :cond_7
    iget-object v0, p0, Lfr/m;->E:Landroid/animation/ObjectAnimator;

    :goto_2
    if-eqz p1, :cond_8

    iget-object v1, p0, Lfr/m;->E:Landroid/animation/ObjectAnimator;

    goto :goto_3

    :cond_8
    iget-object v1, p0, Lfr/m;->z:Landroid/animation/ObjectAnimator;

    :goto_3
    if-nez p3, :cond_b

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result p2

    if-eqz p2, :cond_9

    new-array p2, v6, [Landroid/animation/ValueAnimator;

    aput-object v1, p2, v2

    iget-boolean p3, p0, Lfr/m;->G:Z

    iput-boolean v6, p0, Lfr/m;->G:Z

    aget-object p2, p2, v2

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->cancel()V

    iput-boolean p3, p0, Lfr/m;->G:Z

    :cond_9
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result p2

    if-eqz p2, :cond_a

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->end()V

    goto :goto_4

    :cond_a
    new-array p2, v6, [Landroid/animation/ValueAnimator;

    aput-object v0, p2, v2

    iget-boolean p3, p0, Lfr/m;->G:Z

    iput-boolean v6, p0, Lfr/m;->G:Z

    aget-object p2, p2, v2

    invoke-virtual {p2}, Landroid/animation/ValueAnimator;->end()V

    iput-boolean p3, p0, Lfr/m;->G:Z

    :goto_4
    invoke-super {p0, p1, v2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result p1

    return p1

    :cond_b
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result p3

    if-eqz p3, :cond_c

    :goto_5
    return v2

    :cond_c
    if-eqz p1, :cond_e

    invoke-super {p0, p1, v2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result p3

    if-eqz p3, :cond_d

    goto :goto_6

    :cond_d
    move p3, v2

    goto :goto_7

    :cond_e
    :goto_6
    move p3, v6

    :goto_7
    iget-object v1, p0, Lfr/m;->x:Lfr/e;

    if-eqz p1, :cond_f

    iget p1, v1, Lfr/e;->e:I

    if-eqz p1, :cond_12

    goto :goto_8

    :cond_f
    iget p1, v1, Lfr/e;->f:I

    if-eqz p1, :cond_12

    :goto_8
    if-nez p2, :cond_11

    invoke-virtual {v0}, Landroid/animation/Animator;->isPaused()Z

    move-result p1

    if-nez p1, :cond_10

    goto :goto_9

    :cond_10
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->resume()V

    return p3

    :cond_11
    :goto_9
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return p3

    :cond_12
    new-array p1, v6, [Landroid/animation/ValueAnimator;

    aput-object v0, p1, v2

    iget-boolean p2, p0, Lfr/m;->G:Z

    iput-boolean v6, p0, Lfr/m;->G:Z

    aget-object p1, p1, v2

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->end()V

    iput-boolean p2, p0, Lfr/m;->G:Z

    return p3

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public final e(Lfr/c;)V
    .locals 1

    iget-object v0, p0, Lfr/m;->F:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lfr/m;->F:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lfr/m;->F:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lfr/m;->F:Ljava/util/ArrayList;

    :cond_0
    return-void
.end method

.method public final getAlpha()I
    .locals 1

    iget v0, p0, Lfr/m;->J:I

    return v0
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, -0x3

    return v0
.end method

.method public final isRunning()Z
    .locals 1

    iget-object v0, p0, Lfr/m;->z:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lfr/m;->E:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->isRunning()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    return v0

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public final setAlpha(I)V
    .locals 0

    iput p1, p0, Lfr/m;->J:I

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    iget-object v0, p0, Lfr/m;->I:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final setVisible(ZZ)Z
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, p2, v0}, Lfr/m;->c(ZZZ)Z

    move-result p1

    return p1
.end method

.method public final start()V
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v0, v1}, Lfr/m;->d(ZZZ)Z

    return-void
.end method

.method public final stop()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1, v0}, Lfr/m;->d(ZZZ)Z

    return-void
.end method
