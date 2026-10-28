.class public final Lk1/e;
.super Landroid/view/View;
.source "SourceFile"


# static fields
.field public static final F:[I

.field public static final G:[I


# instance fields
.field public E:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

.field public w:Lk1/g;

.field public x:Ljava/lang/Boolean;

.field public y:Ljava/lang/Long;

.field public z:Lio/sentry/c7;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const v0, 0x10100a7

    const v1, 0x101009e

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sput-object v0, Lk1/e;->F:[I

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, Lk1/e;->G:[I

    return-void
.end method

.method public static synthetic a(Lk1/e;)V
    .locals 0

    invoke-static {p0}, Lk1/e;->setRippleState$lambda$2(Lk1/e;)V

    return-void
.end method

.method private final setRippleState(Z)V
    .locals 6

    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Lk1/e;->z:Lio/sentry/c7;

    if-eqz v2, :cond_0

    invoke-virtual {p0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    invoke-virtual {v2}, Lio/sentry/c7;->run()V

    :cond_0
    iget-object v2, p0, Lk1/e;->y:Ljava/lang/Long;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    goto :goto_0

    :cond_1
    const-wide/16 v2, 0x0

    :goto_0
    sub-long v2, v0, v2

    if-nez p1, :cond_2

    const-wide/16 v4, 0x5

    cmp-long v2, v2, v4

    if-gez v2, :cond_2

    new-instance p1, Lio/sentry/c7;

    const/16 v2, 0x13

    invoke-direct {p1, p0, v2}, Lio/sentry/c7;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lk1/e;->z:Lio/sentry/c7;

    const-wide/16 v2, 0x32

    invoke-virtual {p0, p1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_2

    :cond_2
    if-eqz p1, :cond_3

    sget-object p1, Lk1/e;->F:[I

    goto :goto_1

    :cond_3
    sget-object p1, Lk1/e;->G:[I

    :goto_1
    iget-object v2, p0, Lk1/e;->w:Lk1/g;

    if-eqz v2, :cond_4

    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_4
    :goto_2
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lk1/e;->y:Ljava/lang/Long;

    return-void
.end method

.method private static final setRippleState$lambda$2(Lk1/e;)V
    .locals 2

    iget-object v0, p0, Lk1/e;->w:Lk1/g;

    if-eqz v0, :cond_0

    sget-object v1, Lk1/e;->G:[I

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lk1/e;->z:Lio/sentry/c7;

    return-void
.end method


# virtual methods
.method public final b(Lj0/l;ZJIJFLio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;)V
    .locals 2

    iget-object v0, p0, Lk1/e;->w:Lk1/g;

    if-eqz v0, :cond_0

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-object v1, p0, Lk1/e;->x:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Lk1/g;

    invoke-direct {v0, p2}, Lk1/g;-><init>(Z)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iput-object v0, p0, Lk1/e;->w:Lk1/g;

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lk1/e;->x:Ljava/lang/Boolean;

    :cond_1
    iget-object v0, p0, Lk1/e;->w:Lk1/g;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p9, p0, Lk1/e;->E:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    move p9, p8

    move-wide p7, p6

    move p6, p5

    move-wide p4, p3

    move-object p3, p0

    invoke-virtual/range {p3 .. p9}, Lk1/e;->e(JIJF)V

    if-eqz p2, :cond_2

    iget-wide p4, p1, Lj0/l;->a:J

    invoke-static {p4, p5}, Lh2/b;->e(J)F

    move-result p2

    iget-wide p4, p1, Lj0/l;->a:J

    invoke-static {p4, p5}, Lh2/b;->f(J)F

    move-result p1

    invoke-virtual {v0, p2, p1}, Landroid/graphics/drawable/Drawable;->setHotspot(FF)V

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/Rect;->centerX()I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object p2

    invoke-virtual {p2}, Landroid/graphics/Rect;->centerY()I

    move-result p2

    int-to-float p2, p2

    invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setHotspot(FF)V

    :goto_0
    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lk1/e;->setRippleState(Z)V

    return-void
.end method

.method public final c()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lk1/e;->E:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    iget-object v0, p0, Lk1/e;->z:Lio/sentry/c7;

    if-eqz v0, :cond_0

    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lk1/e;->z:Lio/sentry/c7;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lio/sentry/c7;->run()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lk1/e;->w:Lk1/g;

    if-eqz v0, :cond_1

    sget-object v1, Lk1/e;->G:[I

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    :cond_1
    :goto_0
    iget-object v0, p0, Lk1/e;->w:Lk1/g;

    if-nez v0, :cond_2

    return-void

    :cond_2
    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    invoke-virtual {p0, v0}, Landroid/view/View;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final d()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lk1/e;->setRippleState(Z)V

    return-void
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lk1/e;->c()V

    return-void

    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public final e(JIJF)V
    .locals 3

    iget-object v0, p0, Lk1/e;->w:Lk1/g;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v1, v0, Lk1/g;->y:Ljava/lang/Integer;

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eq v1, p3, :cond_2

    :goto_0
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v0, Lk1/g;->y:Ljava/lang/Integer;

    invoke-virtual {v0, p3}, Landroid/graphics/drawable/RippleDrawable;->setRadius(I)V

    :cond_2
    const/high16 p3, 0x3f800000    # 1.0f

    cmpl-float v1, p6, p3

    if-lez v1, :cond_3

    move p6, p3

    :cond_3
    invoke-static {p6, p4, p5}, Li2/x;->c(FJ)J

    move-result-wide p3

    iget-object p5, v0, Lk1/g;->x:Li2/x;

    const/4 p6, 0x0

    if-nez p5, :cond_4

    move p5, p6

    goto :goto_1

    :cond_4
    iget-wide v1, p5, Li2/x;->a:J

    invoke-static {v1, v2, p3, p4}, Li2/x;->d(JJ)Z

    move-result p5

    :goto_1
    if-nez p5, :cond_5

    new-instance p5, Li2/x;

    invoke-direct {p5, p3, p4}, Li2/x;-><init>(J)V

    iput-object p5, v0, Lk1/g;->x:Li2/x;

    invoke-static {p3, p4}, Li2/w0;->H(J)I

    move-result p3

    invoke-static {p3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p3

    invoke-virtual {v0, p3}, Landroid/graphics/drawable/RippleDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    :cond_5
    new-instance p3, Landroid/graphics/Rect;

    invoke-static {p1, p2}, Lh2/e;->e(J)F

    move-result p4

    invoke-static {p4}, Le93/b;->X(F)I

    move-result p4

    invoke-static {p1, p2}, Lh2/e;->c(J)F

    move-result p1

    invoke-static {p1}, Le93/b;->X(F)I

    move-result p1

    invoke-direct {p3, p6, p6, p4, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    iget p1, p3, Landroid/graphics/Rect;->left:I

    invoke-virtual {p0, p1}, Landroid/view/View;->setLeft(I)V

    iget p1, p3, Landroid/graphics/Rect;->top:I

    invoke-virtual {p0, p1}, Landroid/view/View;->setTop(I)V

    iget p1, p3, Landroid/graphics/Rect;->right:I

    invoke-virtual {p0, p1}, Landroid/view/View;->setRight(I)V

    iget p1, p3, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {p0, p1}, Landroid/view/View;->setBottom(I)V

    invoke-virtual {v0, p3}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iget-object p1, p0, Lk1/e;->E:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    return-void
.end method

.method public final onMeasure(II)V
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final refreshDrawableState()V
    .locals 0

    return-void
.end method
