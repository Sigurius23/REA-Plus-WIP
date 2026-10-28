.class public Lcom/airbnb/lottie/LottieAnimationView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# static fields
.field public static final N:Lqi/d;


# instance fields
.field public final E:Lqi/w;

.field public F:Ljava/lang/String;

.field public G:I

.field public H:Z

.field public I:Z

.field public J:Z

.field public final K:Ljava/util/HashSet;

.field public final L:Ljava/util/HashSet;

.field public M:Lqi/d0;

.field public final w:Lqi/h;

.field public final x:Lqi/h;

.field public y:Lqi/z;

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lqi/d;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/airbnb/lottie/LottieAnimationView;->N:Lqi/d;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 9

    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Lqi/h;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lqi/h;-><init>(Lcom/airbnb/lottie/LottieAnimationView;I)V

    iput-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->w:Lqi/h;

    new-instance p1, Lqi/h;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lqi/h;-><init>(Lcom/airbnb/lottie/LottieAnimationView;I)V

    iput-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->x:Lqi/h;

    const/4 p1, 0x0

    iput p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->z:I

    new-instance v0, Lqi/w;

    invoke-direct {v0}, Lqi/w;-><init>()V

    iput-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iput-boolean p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->H:Z

    iput-boolean p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->I:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/airbnb/lottie/LottieAnimationView;->J:Z

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, p0, Lcom/airbnb/lottie/LottieAnimationView;->K:Ljava/util/HashSet;

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    iput-object v3, p0, Lcom/airbnb/lottie/LottieAnimationView;->L:Ljava/util/HashSet;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    sget-object v4, Lqi/f0;->a:[I

    const v5, 0x7f040389

    invoke-virtual {v3, p2, v4, v5, p1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const/4 v3, 0x4

    invoke-virtual {p2, v3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, p0, Lcom/airbnb/lottie/LottieAnimationView;->J:Z

    const/16 v3, 0x10

    invoke-virtual {p2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    const/16 v5, 0xb

    invoke-virtual {p2, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    const/16 v7, 0x15

    invoke-virtual {p2, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v8

    if-eqz v4, :cond_1

    if-nez v6, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-eqz v4, :cond_2

    invoke-virtual {p2, v3, p1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {p0, v3}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimation(I)V

    goto :goto_1

    :cond_2
    if-eqz v6, :cond_3

    invoke-virtual {p2, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {p0, v3}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimation(Ljava/lang/String;)V

    goto :goto_1

    :cond_3
    if-eqz v8, :cond_4

    invoke-virtual {p2, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {p0, v3}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimationFromUrl(Ljava/lang/String;)V

    :cond_4
    :goto_1
    const/16 v3, 0xa

    invoke-virtual {p2, v3, p1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    invoke-virtual {p0, v3}, Lcom/airbnb/lottie/LottieAnimationView;->setFallbackResource(I)V

    const/4 v3, 0x3

    invoke-virtual {p2, v3, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    if-eqz v3, :cond_5

    iput-boolean v1, p0, Lcom/airbnb/lottie/LottieAnimationView;->I:Z

    :cond_5
    const/16 v3, 0xe

    invoke-virtual {p2, v3, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    const/4 v4, -0x1

    if-eqz v3, :cond_6

    iget-object v3, v0, Lqi/w;->x:Ldj/e;

    invoke-virtual {v3, v4}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    :cond_6
    const/16 v3, 0x13

    invoke-virtual {p2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-virtual {p2, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {p0, v3}, Lcom/airbnb/lottie/LottieAnimationView;->setRepeatMode(I)V

    :cond_7
    const/16 v3, 0x12

    invoke-virtual {p2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_8

    invoke-virtual {p2, v3, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {p0, v3}, Lcom/airbnb/lottie/LottieAnimationView;->setRepeatCount(I)V

    :cond_8
    const/16 v3, 0x14

    invoke-virtual {p2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_9

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual {p2, v3, v5}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    invoke-virtual {p0, v3}, Lcom/airbnb/lottie/LottieAnimationView;->setSpeed(F)V

    :cond_9
    const/4 v3, 0x6

    invoke-virtual {p2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-virtual {p2, v3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    invoke-virtual {p0, v3}, Lcom/airbnb/lottie/LottieAnimationView;->setClipToCompositionBounds(Z)V

    :cond_a
    const/4 v3, 0x5

    invoke-virtual {p2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-virtual {p2, v3, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    invoke-virtual {p0, v3}, Lcom/airbnb/lottie/LottieAnimationView;->setClipTextToBoundingBox(Z)V

    :cond_b
    const/16 v3, 0x8

    invoke-virtual {p2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-virtual {p2, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/airbnb/lottie/LottieAnimationView;->setDefaultFontFileExtension(Ljava/lang/String;)V

    :cond_c
    const/16 v3, 0xd

    invoke-virtual {p2, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/airbnb/lottie/LottieAnimationView;->setImageAssetsFolder(Ljava/lang/String;)V

    const/16 v3, 0xf

    invoke-virtual {p2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    const/4 v6, 0x0

    invoke-virtual {p2, v3, v6}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v3

    if-eqz v5, :cond_d

    sget-object v5, Lqi/g;->x:Lqi/g;

    invoke-virtual {v2, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_d
    invoke-virtual {v0, v3}, Lqi/w;->w(F)V

    const/16 v2, 0x9

    invoke-virtual {p2, v2, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    iget-object v3, v0, Lqi/w;->L:Lad3/z;

    iget-object v3, v3, Lad3/z;->x:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashSet;

    sget-object v5, Lqi/x;->w:Lqi/x;

    if-eqz v2, :cond_e

    invoke-virtual {v3, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_2

    :cond_e
    invoke-virtual {v3, v5}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-result v2

    :goto_2
    iget-object v3, v0, Lqi/w;->w:Lqi/i;

    if-eqz v3, :cond_f

    if-eqz v2, :cond_f

    invoke-virtual {v0}, Lqi/w;->c()V

    :cond_f
    invoke-virtual {p2, p1, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    invoke-virtual {p0, v2}, Lcom/airbnb/lottie/LottieAnimationView;->setApplyingOpacityToLayersEnabled(Z)V

    invoke-virtual {p2, v1, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    invoke-virtual {p0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->setApplyingShadowToLayersEnabled(Z)V

    const/4 v1, 0x7

    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-virtual {p2, v1, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1}, Ls4/c;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    new-instance v2, Lqi/h0;

    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    invoke-direct {v2, v1}, Lqi/h0;-><init>(I)V

    new-instance v1, Lwi/e;

    const-string v3, "**"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3}, Lwi/e;-><init>([Ljava/lang/String;)V

    new-instance v3, Ld1/j;

    invoke-direct {v3, v2}, Ld1/j;-><init>(Ljava/lang/Object;)V

    sget-object v2, Lqi/a0;->F:Landroid/graphics/ColorFilter;

    invoke-virtual {v0, v1, v2, v3}, Lqi/w;->a(Lwi/e;Ljava/lang/Object;Ld1/j;)V

    :cond_10
    const/16 v0, 0x11

    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    invoke-static {}, Lqi/g0;->values()[Lqi/g0;

    move-result-object v1

    array-length v1, v1

    if-lt v0, v1, :cond_11

    move v0, p1

    :cond_11
    invoke-static {}, Lqi/g0;->values()[Lqi/g0;

    move-result-object v1

    aget-object v0, v1, v0

    invoke-virtual {p0, v0}, Lcom/airbnb/lottie/LottieAnimationView;->setRenderMode(Lqi/g0;)V

    :cond_12
    const/4 v0, 0x2

    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    invoke-static {}, Lqi/g0;->values()[Lqi/g0;

    move-result-object v1

    array-length v1, v1

    if-lt v0, v1, :cond_13

    move v0, p1

    :cond_13
    invoke-static {}, Lqi/a;->values()[Lqi/a;

    move-result-object v1

    aget-object v0, v1, v0

    invoke-virtual {p0, v0}, Lcom/airbnb/lottie/LottieAnimationView;->setAsyncUpdates(Lqi/a;)V

    :cond_14
    const/16 v0, 0xc

    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Lcom/airbnb/lottie/LottieAnimationView;->setIgnoreDisabledSystemAnimations(Z)V

    const/16 v0, 0x16

    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-virtual {p2, v0, p1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p1

    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/LottieAnimationView;->setUseCompositionFrameRate(Z)V

    :cond_15
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private setCompositionTask(Lqi/d0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqi/d0;",
            ")V"
        }
    .end annotation

    iget-object v0, p1, Lqi/d0;->d:Lqi/b0;

    iget-object v1, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-ne v1, v2, :cond_0

    iget-object v1, v1, Lqi/w;->w:Lqi/i;

    iget-object v0, v0, Lqi/b0;->a:Lqi/i;

    if-ne v1, v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->K:Ljava/util/HashSet;

    sget-object v1, Lqi/g;->w:Lqi/g;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    invoke-virtual {v0}, Lqi/w;->d()V

    invoke-virtual {p0}, Lcom/airbnb/lottie/LottieAnimationView;->c()V

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->w:Lqi/h;

    invoke-virtual {p1, v0}, Lqi/d0;->b(Lqi/z;)V

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->x:Lqi/h;

    invoke-virtual {p1, v0}, Lqi/d0;->a(Lqi/z;)V

    iput-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->M:Lqi/d0;

    return-void
.end method


# virtual methods
.method public final c()V
    .locals 3

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->M:Lqi/d0;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/airbnb/lottie/LottieAnimationView;->w:Lqi/h;

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Lqi/d0;->a:Ljava/util/LinkedHashSet;

    invoke-interface {v2, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    iget-object v1, p0, Lcom/airbnb/lottie/LottieAnimationView;->M:Lqi/d0;

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->x:Lqi/h;

    monitor-enter v1

    :try_start_1
    iget-object v2, v1, Lqi/d0;->b:Ljava/util/LinkedHashSet;

    invoke-interface {v2, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catchall_1
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw v1

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->K:Ljava/util/HashSet;

    sget-object v1, Lqi/g;->F:Lqi/g;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    invoke-virtual {v0}, Lqi/w;->m()V

    return-void
.end method

.method public getAsyncUpdates()Lqi/a;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-object v0, v0, Lqi/w;->l0:Lqi/a;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    sget-object v0, Lqi/a;->w:Lqi/a;

    return-object v0
.end method

.method public getAsyncUpdatesEnabled()Z
    .locals 2

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-object v0, v0, Lqi/w;->l0:Lqi/a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lqi/a;->w:Lqi/a;

    :goto_0
    sget-object v1, Lqi/a;->x:Lqi/a;

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public getClipTextToBoundingBox()Z
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-boolean v0, v0, Lqi/w;->U:Z

    return v0
.end method

.method public getClipToCompositionBounds()Z
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-boolean v0, v0, Lqi/w;->N:Z

    return v0
.end method

.method public getComposition()Lqi/i;
    .locals 2

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v1, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    if-ne v0, v1, :cond_0

    iget-object v0, v1, Lqi/w;->w:Lqi/i;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getDuration()J
    .locals 2

    invoke-virtual {p0}, Lcom/airbnb/lottie/LottieAnimationView;->getComposition()Lqi/i;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lqi/i;->b()F

    move-result v0

    float-to-long v0, v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getFrame()I
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-object v0, v0, Lqi/w;->x:Ldj/e;

    iget v0, v0, Ldj/e;->H:F

    float-to-int v0, v0

    return v0
.end method

.method public getImageAssetsFolder()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-object v0, v0, Lqi/w;->H:Ljava/lang/String;

    return-object v0
.end method

.method public getMaintainOriginalImageBounds()Z
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-boolean v0, v0, Lqi/w;->M:Z

    return v0
.end method

.method public getMaxFrame()F
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-object v0, v0, Lqi/w;->x:Ldj/e;

    invoke-virtual {v0}, Ldj/e;->b()F

    move-result v0

    return v0
.end method

.method public getMinFrame()F
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-object v0, v0, Lqi/w;->x:Ldj/e;

    invoke-virtual {v0}, Ldj/e;->c()F

    move-result v0

    return v0
.end method

.method public getPerformanceTracker()Lqi/e0;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-object v0, v0, Lqi/w;->w:Lqi/i;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lqi/i;->a:Lqi/e0;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getProgress()F
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-object v0, v0, Lqi/w;->x:Ldj/e;

    invoke-virtual {v0}, Ldj/e;->a()F

    move-result v0

    return v0
.end method

.method public getRenderMode()Lqi/g0;
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-boolean v0, v0, Lqi/w;->W:Z

    if-eqz v0, :cond_0

    sget-object v0, Lqi/g0;->y:Lqi/g0;

    return-object v0

    :cond_0
    sget-object v0, Lqi/g0;->x:Lqi/g0;

    return-object v0
.end method

.method public getRepeatCount()I
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-object v0, v0, Lqi/w;->x:Ldj/e;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->getRepeatCount()I

    move-result v0

    return v0
.end method

.method public getRepeatMode()I
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-object v0, v0, Lqi/w;->x:Ldj/e;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->getRepeatMode()I

    move-result v0

    return v0
.end method

.method public getSpeed()F
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-object v0, v0, Lqi/w;->x:Ldj/e;

    iget v0, v0, Ldj/e;->z:F

    return v0
.end method

.method public final invalidate()V
    .locals 2

    invoke-super {p0}, Landroid/view/View;->invalidate()V

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    instance-of v1, v0, Lqi/w;

    if-eqz v1, :cond_1

    check-cast v0, Lqi/w;

    iget-boolean v0, v0, Lqi/w;->W:Z

    sget-object v1, Lqi/g0;->y:Lqi/g0;

    if-eqz v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    sget-object v0, Lqi/g0;->x:Lqi/g0;

    :goto_0
    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    invoke-virtual {v0}, Lqi/w;->invalidateSelf()V

    :cond_1
    return-void
.end method

.method public final invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v1, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    if-ne v0, v1, :cond_0

    invoke-super {p0, v1}, Landroid/view/View;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->I:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    invoke-virtual {v0}, Lqi/w;->m()V

    :cond_0
    return-void
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 3

    instance-of v0, p1, Lqi/f;

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void

    :cond_0
    check-cast p1, Lqi/f;

    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v0

    invoke-super {p0, v0}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    iget-object v0, p1, Lqi/f;->w:Ljava/lang/String;

    iput-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->F:Ljava/lang/String;

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->K:Ljava/util/HashSet;

    sget-object v1, Lqi/g;->w:Lqi/g;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/airbnb/lottie/LottieAnimationView;->F:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/airbnb/lottie/LottieAnimationView;->F:Ljava/lang/String;

    invoke-virtual {p0, v2}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimation(Ljava/lang/String;)V

    :cond_1
    iget v2, p1, Lqi/f;->x:I

    iput v2, p0, Lcom/airbnb/lottie/LottieAnimationView;->G:I

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    iget v1, p0, Lcom/airbnb/lottie/LottieAnimationView;->G:I

    if-eqz v1, :cond_2

    invoke-virtual {p0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->setAnimation(I)V

    :cond_2
    sget-object v1, Lqi/g;->x:Lqi/g;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget v1, p1, Lqi/f;->y:F

    iget-object v2, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    invoke-virtual {v2, v1}, Lqi/w;->w(F)V

    :cond_3
    sget-object v1, Lqi/g;->F:Lqi/g;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    iget-boolean v1, p1, Lqi/f;->z:Z

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lcom/airbnb/lottie/LottieAnimationView;->d()V

    :cond_4
    sget-object v1, Lqi/g;->E:Lqi/g;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p1, Lqi/f;->E:Ljava/lang/String;

    invoke-virtual {p0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->setImageAssetsFolder(Ljava/lang/String;)V

    :cond_5
    sget-object v1, Lqi/g;->y:Lqi/g;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    iget v1, p1, Lqi/f;->F:I

    invoke-virtual {p0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->setRepeatMode(I)V

    :cond_6
    sget-object v1, Lqi/g;->z:Lqi/g;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_7

    iget p1, p1, Lqi/f;->G:I

    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/LottieAnimationView;->setRepeatCount(I)V

    :cond_7
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 5

    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    new-instance v1, Lqi/f;

    invoke-direct {v1, v0}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->F:Ljava/lang/String;

    iput-object v0, v1, Lqi/f;->w:Ljava/lang/String;

    iget v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->G:I

    iput v0, v1, Lqi/f;->x:I

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-object v2, v0, Lqi/w;->x:Ldj/e;

    iget-object v3, v0, Lqi/w;->x:Ldj/e;

    invoke-virtual {v2}, Ldj/e;->a()F

    move-result v2

    iput v2, v1, Lqi/f;->y:F

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isVisible()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-boolean v2, v3, Ldj/e;->M:Z

    goto :goto_1

    :cond_0
    iget v2, v0, Lqi/w;->p0:I

    const/4 v4, 0x2

    if-eq v2, v4, :cond_2

    const/4 v4, 0x3

    if-ne v2, v4, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v2, 0x1

    :goto_1
    iput-boolean v2, v1, Lqi/f;->z:Z

    iget-object v0, v0, Lqi/w;->H:Ljava/lang/String;

    iput-object v0, v1, Lqi/f;->E:Ljava/lang/String;

    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->getRepeatMode()I

    move-result v0

    iput v0, v1, Lqi/f;->F:I

    invoke-virtual {v3}, Landroid/animation/ValueAnimator;->getRepeatCount()I

    move-result v0

    iput v0, v1, Lqi/f;->G:I

    return-object v1
.end method

.method public setAnimation(I)V
    .locals 3

    .line 1
    iput p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->G:I

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->F:Ljava/lang/String;

    .line 3
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4
    new-instance v0, Lqi/d0;

    new-instance v1, Lqi/e;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lqi/e;-><init>(Ljava/lang/Object;II)V

    const/4 p1, 0x1

    invoke-direct {v0, v1, p1}, Lqi/d0;-><init>(Ljava/util/concurrent/Callable;Z)V

    goto :goto_0

    .line 5
    :cond_0
    iget-boolean v1, p0, Lcom/airbnb/lottie/LottieAnimationView;->J:Z

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 7
    invoke-static {v0, p1}, Lqi/l;->l(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lqi/l;->f(Landroid/content/Context;ILjava/lang/String;)Lqi/d0;

    move-result-object v0

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, p1, v0}, Lqi/l;->f(Landroid/content/Context;ILjava/lang/String;)Lqi/d0;

    move-result-object v0

    .line 9
    :goto_0
    invoke-direct {p0, v0}, Lcom/airbnb/lottie/LottieAnimationView;->setCompositionTask(Lqi/d0;)V

    return-void
.end method

.method public setAnimation(Ljava/lang/String;)V
    .locals 5

    .line 10
    iput-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->F:Ljava/lang/String;

    const/4 v0, 0x0

    .line 11
    iput v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->G:I

    .line 12
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 13
    new-instance v0, Lqi/d0;

    new-instance v2, Lcom/iterable/iterableapi/n1;

    const/4 v3, 0x6

    invoke-direct {v2, v3, p0, p1}, Lcom/iterable/iterableapi/n1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-direct {v0, v2, v1}, Lqi/d0;-><init>(Ljava/util/concurrent/Callable;Z)V

    goto :goto_0

    .line 14
    :cond_0
    iget-boolean v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->J:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    .line 15
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v3, Lqi/l;->a:Ljava/util/HashMap;

    .line 16
    const-string v3, "asset_"

    .line 17
    invoke-static {v3, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 18
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 19
    new-instance v4, Lht/f;

    invoke-direct {v4, v0, p1, v3, v1}, Lht/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v3, v4, v2}, Lqi/l;->a(Ljava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/Runnable;)Lqi/d0;

    move-result-object v0

    goto :goto_0

    .line 20
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v3, Lqi/l;->a:Ljava/util/HashMap;

    .line 21
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 22
    new-instance v3, Lht/f;

    invoke-direct {v3, v0, p1, v2, v1}, Lht/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v2, v3, v2}, Lqi/l;->a(Ljava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/Runnable;)Lqi/d0;

    move-result-object v0

    .line 23
    :goto_0
    invoke-direct {p0, v0}, Lcom/airbnb/lottie/LottieAnimationView;->setCompositionTask(Lqi/d0;)V

    return-void
.end method

.method public setAnimationFromJson(Ljava/lang/String;)V
    .locals 4
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    new-instance p1, Lcom/iterable/iterableapi/n1;

    const/4 v1, 0x7

    const/4 v2, 0x0

    invoke-direct {p1, v1, v0, v2}, Lcom/iterable/iterableapi/n1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Llr/e;

    const/16 v3, 0xa

    invoke-direct {v1, v0, v3}, Llr/e;-><init>(Ljava/lang/Object;I)V

    invoke-static {v2, p1, v1}, Lqi/l;->a(Ljava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/Runnable;)Lqi/d0;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/airbnb/lottie/LottieAnimationView;->setCompositionTask(Lqi/d0;)V

    return-void
.end method

.method public setAnimationFromUrl(Ljava/lang/String;)V
    .locals 4

    iget-boolean v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->J:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v2, Lqi/l;->a:Ljava/util/HashMap;

    const-string v2, "url_"

    invoke-static {v2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljc/f;

    invoke-direct {v3, v0, p1, v2}, Ljc/f;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v2, v3, v1}, Lqi/l;->a(Ljava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/Runnable;)Lqi/d0;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v2, Ljc/f;

    invoke-direct {v2, v0, p1, v1}, Ljc/f;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1, v2, v1}, Lqi/l;->a(Ljava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/Runnable;)Lqi/d0;

    move-result-object p1

    :goto_0
    invoke-direct {p0, p1}, Lcom/airbnb/lottie/LottieAnimationView;->setCompositionTask(Lqi/d0;)V

    return-void
.end method

.method public setApplyingOpacityToLayersEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iput-boolean p1, v0, Lqi/w;->S:Z

    return-void
.end method

.method public setApplyingShadowToLayersEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iput-boolean p1, v0, Lqi/w;->T:Z

    return-void
.end method

.method public setAsyncUpdates(Lqi/a;)V
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iput-object p1, v0, Lqi/w;->l0:Lqi/a;

    return-void
.end method

.method public setCacheComposition(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->J:Z

    return-void
.end method

.method public setClipTextToBoundingBox(Z)V
    .locals 2

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-boolean v1, v0, Lqi/w;->U:Z

    if-eq p1, v1, :cond_0

    iput-boolean p1, v0, Lqi/w;->U:Z

    invoke-virtual {v0}, Lqi/w;->invalidateSelf()V

    :cond_0
    return-void
.end method

.method public setClipToCompositionBounds(Z)V
    .locals 2

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-boolean v1, v0, Lqi/w;->N:Z

    if-eq p1, v1, :cond_1

    iput-boolean p1, v0, Lqi/w;->N:Z

    iget-object v1, v0, Lqi/w;->O:Lzi/c;

    if-eqz v1, :cond_0

    iput-boolean p1, v1, Lzi/c;->L:Z

    :cond_0
    invoke-virtual {v0}, Lqi/w;->invalidateSelf()V

    :cond_1
    return-void
.end method

.method public setComposition(Lqi/i;)V
    .locals 2

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    invoke-virtual {v0, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/airbnb/lottie/LottieAnimationView;->H:Z

    invoke-virtual {v0, p1}, Lqi/w;->p(Lqi/i;)Z

    move-result p1

    iget-boolean v1, p0, Lcom/airbnb/lottie/LottieAnimationView;->I:Z

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lqi/w;->m()V

    :cond_0
    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/airbnb/lottie/LottieAnimationView;->H:Z

    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-ne v1, v0, :cond_1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    if-nez p1, :cond_2

    invoke-virtual {v0}, Lqi/w;->k()Z

    move-result p1

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0, v0}, Lcom/airbnb/lottie/LottieAnimationView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Lqi/w;->o()V

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p1

    invoke-virtual {p0, p0, p1}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    iget-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->L:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_3

    :goto_0
    return-void

    :cond_3
    invoke-static {p1}, Ld;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    move-result-object p1

    throw p1
.end method

.method public setDefaultFontFileExtension(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iput-object p1, v0, Lqi/w;->K:Ljava/lang/String;

    invoke-virtual {v0}, Lqi/w;->j()Lb30/m;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lb30/m;->I(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public setFailureListener(Lqi/z;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqi/z;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->y:Lqi/z;

    return-void
.end method

.method public setFallbackResource(I)V
    .locals 0

    iput p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->z:I

    return-void
.end method

.method public setFontAssetDelegate(Lqi/b;)V
    .locals 0

    iget-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-object p1, p1, Lqi/w;->I:Lb30/m;

    return-void
.end method

.method public setFontMap(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/graphics/Typeface;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-object v1, v0, Lqi/w;->J:Ljava/util/Map;

    if-ne p1, v1, :cond_0

    return-void

    :cond_0
    iput-object p1, v0, Lqi/w;->J:Ljava/util/Map;

    invoke-virtual {v0}, Lqi/w;->invalidateSelf()V

    return-void
.end method

.method public setFrame(I)V
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    invoke-virtual {v0, p1}, Lqi/w;->q(I)V

    return-void
.end method

.method public setIgnoreDisabledSystemAnimations(Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iput-boolean p1, v0, Lqi/w;->z:Z

    return-void
.end method

.method public setImageAssetDelegate(Lqi/c;)V
    .locals 0

    iget-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-object p1, p1, Lqi/w;->G:Lvi/a;

    return-void
.end method

.method public setImageAssetsFolder(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iput-object p1, v0, Lqi/w;->H:Ljava/lang/String;

    return-void
.end method

.method public setImageBitmap(Landroid/graphics/Bitmap;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->G:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->F:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/airbnb/lottie/LottieAnimationView;->c()V

    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->G:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->F:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/airbnb/lottie/LottieAnimationView;->c()V

    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setImageResource(I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->G:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->F:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/airbnb/lottie/LottieAnimationView;->c()V

    invoke-super {p0, p1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    return-void
.end method

.method public setMaintainOriginalImageBounds(Z)V
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iput-boolean p1, v0, Lqi/w;->M:Z

    return-void
.end method

.method public setMaxFrame(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    invoke-virtual {v0, p1}, Lqi/w;->r(I)V

    return-void
.end method

.method public setMaxFrame(Ljava/lang/String;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    invoke-virtual {v0, p1}, Lqi/w;->s(Ljava/lang/String;)V

    return-void
.end method

.method public setMaxProgress(F)V
    .locals 4

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-object v1, v0, Lqi/w;->w:Lqi/i;

    if-nez v1, :cond_0

    iget-object v1, v0, Lqi/w;->F:Ljava/util/ArrayList;

    new-instance v2, Lqi/p;

    const/4 v3, 0x0

    invoke-direct {v2, v0, p1, v3}, Lqi/p;-><init>(Lqi/w;FI)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    iget-object v0, v0, Lqi/w;->x:Ldj/e;

    iget v2, v1, Lqi/i;->l:F

    iget v1, v1, Lqi/i;->m:F

    invoke-static {v2, v1, p1}, Ldj/g;->f(FFF)F

    move-result p1

    iget v1, v0, Ldj/e;->J:F

    invoke-virtual {v0, v1, p1}, Ldj/e;->i(FF)V

    return-void
.end method

.method public setMinAndMaxFrame(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    invoke-virtual {v0, p1}, Lqi/w;->t(Ljava/lang/String;)V

    return-void
.end method

.method public setMinFrame(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    invoke-virtual {v0, p1}, Lqi/w;->u(I)V

    return-void
.end method

.method public setMinFrame(Ljava/lang/String;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    invoke-virtual {v0, p1}, Lqi/w;->v(Ljava/lang/String;)V

    return-void
.end method

.method public setMinProgress(F)V
    .locals 4

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-object v1, v0, Lqi/w;->w:Lqi/i;

    if-nez v1, :cond_0

    iget-object v1, v0, Lqi/w;->F:Ljava/util/ArrayList;

    new-instance v2, Lqi/p;

    const/4 v3, 0x1

    invoke-direct {v2, v0, p1, v3}, Lqi/p;-><init>(Lqi/w;FI)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    iget v2, v1, Lqi/i;->l:F

    iget v1, v1, Lqi/i;->m:F

    invoke-static {v2, v1, p1}, Ldj/g;->f(FFF)F

    move-result p1

    float-to-int p1, p1

    invoke-virtual {v0, p1}, Lqi/w;->u(I)V

    return-void
.end method

.method public setOutlineMasksAndMattes(Z)V
    .locals 2

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-boolean v1, v0, Lqi/w;->R:Z

    if-ne v1, p1, :cond_0

    goto :goto_0

    :cond_0
    iput-boolean p1, v0, Lqi/w;->R:Z

    iget-object v0, v0, Lqi/w;->O:Lzi/c;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Lzi/c;->o(Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setPerformanceTrackingEnabled(Z)V
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iput-boolean p1, v0, Lqi/w;->Q:Z

    iget-object v0, v0, Lqi/w;->w:Lqi/i;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lqi/i;->a:Lqi/e0;

    iput-boolean p1, v0, Lqi/e0;->a:Z

    :cond_0
    return-void
.end method

.method public setProgress(F)V
    .locals 2

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->K:Ljava/util/HashSet;

    sget-object v1, Lqi/g;->x:Lqi/g;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    invoke-virtual {v0, p1}, Lqi/w;->w(F)V

    return-void
.end method

.method public setRenderMode(Lqi/g0;)V
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iput-object p1, v0, Lqi/w;->V:Lqi/g0;

    invoke-virtual {v0}, Lqi/w;->e()V

    return-void
.end method

.method public setRepeatCount(I)V
    .locals 2

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->K:Ljava/util/HashSet;

    sget-object v1, Lqi/g;->z:Lqi/g;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-object v0, v0, Lqi/w;->x:Ldj/e;

    invoke-virtual {v0, p1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    return-void
.end method

.method public setRepeatMode(I)V
    .locals 2

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->K:Ljava/util/HashSet;

    sget-object v1, Lqi/g;->y:Lqi/g;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-object v0, v0, Lqi/w;->x:Ldj/e;

    invoke-virtual {v0, p1}, Ldj/e;->setRepeatMode(I)V

    return-void
.end method

.method public setSafeMode(Z)V
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iput-boolean p1, v0, Lqi/w;->E:Z

    return-void
.end method

.method public setSpeed(F)V
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-object v0, v0, Lqi/w;->x:Ldj/e;

    iput p1, v0, Ldj/e;->z:F

    return-void
.end method

.method public setTextDelegate(Lqi/i0;)V
    .locals 0

    iget-object p1, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public setUseCompositionFrameRate(Z)V
    .locals 1

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-object v0, v0, Lqi/w;->x:Ldj/e;

    iput-boolean p1, v0, Ldj/e;->N:Z

    return-void
.end method

.method public final unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    iget-boolean v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->H:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    if-ne p1, v0, :cond_0

    invoke-virtual {v0}, Lqi/w;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/airbnb/lottie/LottieAnimationView;->I:Z

    invoke-virtual {v0}, Lqi/w;->l()V

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lcom/airbnb/lottie/LottieAnimationView;->H:Z

    if-nez v0, :cond_1

    instance-of v0, p1, Lqi/w;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lqi/w;

    invoke-virtual {v0}, Lqi/w;->k()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lqi/w;->l()V

    :cond_1
    :goto_0
    invoke-super {p0, p1}, Landroid/view/View;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
