.class public Landroidx/media3/ui/PlayerView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final synthetic j0:I


# instance fields
.field public final E:Z

.field public final F:Ldb/h0;

.field public final G:Landroid/widget/ImageView;

.field public final H:Landroid/widget/ImageView;

.field public final I:Landroidx/media3/ui/SubtitleView;

.field public final J:Landroid/view/View;

.field public final K:Landroid/widget/TextView;

.field public final L:Ldb/x;

.field public final M:Landroid/widget/FrameLayout;

.field public final N:Landroid/widget/FrameLayout;

.field public final O:Landroid/os/Handler;

.field public final P:Ljava/lang/Class;

.field public final Q:Ljava/lang/reflect/Method;

.field public final R:Ljava/lang/Object;

.field public S:Lu8/j0;

.field public T:Z

.field public U:Ldb/w;

.field public V:I

.field public W:I

.field public a0:Landroid/graphics/drawable/Drawable;

.field public b0:I

.field public c0:Z

.field public d0:Ljava/lang/CharSequence;

.field public e0:I

.field public f0:Z

.field public g0:Z

.field public h0:Z

.field public i0:Z

.field public final w:Ldb/e0;

.field public final x:Landroidx/media3/ui/AspectRatioFrameLayout;

.field public final y:Landroid/view/View;

.field public final z:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, v3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v4, Ldb/e0;

    invoke-direct {v4, v1}, Ldb/e0;-><init>(Landroidx/media3/ui/PlayerView;)V

    iput-object v4, v1, Landroidx/media3/ui/PlayerView;->w:Ldb/e0;

    new-instance v5, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v6

    invoke-direct {v5, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v5, v1, Landroidx/media3/ui/PlayerView;->O:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/view/View;->isInEditMode()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->x:Landroidx/media3/ui/AspectRatioFrameLayout;

    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->y:Landroid/view/View;

    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->z:Landroid/view/View;

    iput-boolean v3, v1, Landroidx/media3/ui/PlayerView;->E:Z

    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->F:Ldb/h0;

    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->G:Landroid/widget/ImageView;

    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->H:Landroid/widget/ImageView;

    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->I:Landroidx/media3/ui/SubtitleView;

    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->J:Landroid/view/View;

    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->K:Landroid/widget/TextView;

    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->M:Landroid/widget/FrameLayout;

    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->N:Landroid/widget/FrameLayout;

    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->P:Ljava/lang/Class;

    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->Q:Ljava/lang/reflect/Method;

    iput-object v6, v1, Landroidx/media3/ui/PlayerView;->R:Ljava/lang/Object;

    new-instance v2, Landroid/widget/ImageView;

    invoke-direct {v2, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    sget v3, Lx8/t;->a:I

    const/16 v4, 0x17

    const v5, 0x7f080404

    const v7, 0x7f0600e2

    if-lt v3, v4, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    invoke-virtual {v3, v5, v0}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v3, v7, v6}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    invoke-virtual {v3, v5, v0}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v3, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/view/View;->setBackgroundColor(I)V

    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void

    :cond_1
    const/4 v7, 0x3

    const/4 v8, 0x1

    const v9, 0x7f0d017a

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v11

    sget-object v12, Ldb/i0;->e:[I

    invoke-virtual {v11, v2, v12, v3, v3}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v11

    const/16 v12, 0x2a

    :try_start_0
    invoke-virtual {v11, v12}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v13

    invoke-virtual {v11, v12, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v12

    const/16 v14, 0x16

    invoke-virtual {v11, v14, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v9

    const/16 v14, 0x31

    invoke-virtual {v11, v14, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v14

    invoke-virtual {v11, v7, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v15

    const/16 v6, 0x9

    invoke-virtual {v11, v6, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    const/16 v7, 0xf

    invoke-virtual {v11, v7, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v7

    const/16 v5, 0x32

    invoke-virtual {v11, v5, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    const/16 v10, 0x2d

    invoke-virtual {v11, v10, v8}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v10

    const/16 v8, 0x1c

    invoke-virtual {v11, v8, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v8

    const/16 v3, 0x26

    move/from16 v17, v5

    const/16 v5, 0x1388

    invoke-virtual {v11, v3, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    const/16 v5, 0xe

    move/from16 v16, v3

    const/4 v3, 0x1

    invoke-virtual {v11, v5, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    move/from16 v18, v5

    const/4 v5, 0x4

    invoke-virtual {v11, v5, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v19

    const/16 v3, 0x23

    const/4 v5, 0x0

    invoke-virtual {v11, v3, v5}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v3

    iget-boolean v5, v1, Landroidx/media3/ui/PlayerView;->c0:Z

    move/from16 v20, v3

    const/16 v3, 0x10

    invoke-virtual {v11, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, v1, Landroidx/media3/ui/PlayerView;->c0:Z

    const/16 v3, 0xd

    const/4 v5, 0x1

    invoke-virtual {v11, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v11}, Landroid/content/res/TypedArray;->recycle()V

    move v11, v9

    move/from16 v5, v19

    move v9, v7

    move/from16 v19, v13

    move/from16 v7, v20

    move v13, v12

    move v12, v10

    move v10, v8

    move v8, v6

    move v6, v3

    move/from16 v3, v18

    move/from16 v18, v15

    move v15, v14

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {v11}, Landroid/content/res/TypedArray;->recycle()V

    throw v0

    :cond_2
    const/16 v5, 0x1388

    move/from16 v16, v5

    move v11, v9

    const/4 v3, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v15, 0x1

    const/16 v17, 0x1

    const/16 v18, 0x1

    const/16 v19, 0x0

    :goto_1
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v14

    invoke-virtual {v14, v11, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const/high16 v11, 0x40000

    invoke-virtual {v1, v11}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    const v11, 0x7f0a0457

    invoke-virtual {v1, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Landroidx/media3/ui/AspectRatioFrameLayout;

    iput-object v11, v1, Landroidx/media3/ui/PlayerView;->x:Landroidx/media3/ui/AspectRatioFrameLayout;

    if-eqz v11, :cond_3

    invoke-virtual {v11, v10}, Landroidx/media3/ui/AspectRatioFrameLayout;->setResizeMode(I)V

    :cond_3
    const v10, 0x7f0a0479

    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    iput-object v10, v1, Landroidx/media3/ui/PlayerView;->y:Landroid/view/View;

    if-eqz v10, :cond_4

    if-eqz v19, :cond_4

    invoke-virtual {v10, v13}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_4
    const/4 v13, 0x2

    if-eqz v11, :cond_9

    if-eqz v12, :cond_9

    new-instance v14, Landroid/view/ViewGroup$LayoutParams;

    const/4 v10, -0x1

    invoke-direct {v14, v10, v10}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    if-eq v12, v13, :cond_8

    const-class v10, Landroid/content/Context;

    const/4 v13, 0x3

    if-eq v12, v13, :cond_7

    const/4 v13, 0x4

    if-eq v12, v13, :cond_6

    new-instance v10, Landroid/view/SurfaceView;

    invoke-direct {v10, v0}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V

    sget v12, Lx8/t;->a:I

    const/16 v13, 0x22

    if-lt v12, v13, :cond_5

    invoke-static {v10}, Lb3/g1;->u(Landroid/view/SurfaceView;)V

    :cond_5
    iput-object v10, v1, Landroidx/media3/ui/PlayerView;->z:Landroid/view/View;

    goto :goto_2

    :cond_6
    :try_start_1
    const-class v12, Lr9/k;

    sget v13, Lr9/k;->x:I

    filled-new-array {v10}, [Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v12, v10}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v10

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v10, v12}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/view/View;

    iput-object v10, v1, Landroidx/media3/ui/PlayerView;->z:Landroid/view/View;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "video_decoder_gl_surface_view requires an ExoPlayer dependency"

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_7
    :try_start_2
    const-class v12, Ls9/i;

    sget v13, Ls9/i;->L:I

    filled-new-array {v10}, [Ljava/lang/Class;

    move-result-object v10

    invoke-virtual {v12, v10}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v10

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v10, v12}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/view/View;

    iput-object v10, v1, Landroidx/media3/ui/PlayerView;->z:Landroid/view/View;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    const/4 v10, 0x1

    goto :goto_3

    :catch_1
    move-exception v0

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "spherical_gl_surface_view requires an ExoPlayer dependency"

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_8
    new-instance v10, Landroid/view/TextureView;

    invoke-direct {v10, v0}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    iput-object v10, v1, Landroidx/media3/ui/PlayerView;->z:Landroid/view/View;

    :goto_2
    const/4 v10, 0x0

    :goto_3
    iget-object v12, v1, Landroidx/media3/ui/PlayerView;->z:Landroid/view/View;

    invoke-virtual {v12, v14}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v12, v1, Landroidx/media3/ui/PlayerView;->z:Landroid/view/View;

    invoke-virtual {v12, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v4, v1, Landroidx/media3/ui/PlayerView;->z:Landroid/view/View;

    const/4 v12, 0x0

    invoke-virtual {v4, v12}, Landroid/view/View;->setClickable(Z)V

    iget-object v4, v1, Landroidx/media3/ui/PlayerView;->z:Landroid/view/View;

    invoke-virtual {v11, v4, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    goto :goto_4

    :cond_9
    const/4 v12, 0x0

    const/4 v4, 0x0

    iput-object v4, v1, Landroidx/media3/ui/PlayerView;->z:Landroid/view/View;

    move v10, v12

    :goto_4
    iput-boolean v10, v1, Landroidx/media3/ui/PlayerView;->E:Z

    sget v4, Lx8/t;->a:I

    const/16 v13, 0x22

    if-ne v4, v13, :cond_a

    new-instance v4, Ldb/h0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    goto :goto_5

    :cond_a
    const/4 v4, 0x0

    :goto_5
    iput-object v4, v1, Landroidx/media3/ui/PlayerView;->F:Ldb/h0;

    const v4, 0x7f0a044f

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/FrameLayout;

    iput-object v4, v1, Landroidx/media3/ui/PlayerView;->M:Landroid/widget/FrameLayout;

    const v4, 0x7f0a046a

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/FrameLayout;

    iput-object v4, v1, Landroidx/media3/ui/PlayerView;->N:Landroid/widget/FrameLayout;

    const v4, 0x7f0a0463

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, v1, Landroidx/media3/ui/PlayerView;->G:Landroid/widget/ImageView;

    iput v9, v1, Landroidx/media3/ui/PlayerView;->W:I

    :try_start_3
    const-class v4, Landroidx/media3/exoplayer/ExoPlayer;

    const-class v9, Landroidx/media3/exoplayer/image/ImageOutput;

    const-string v10, "setImageOutput"

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v11

    invoke-virtual {v4, v10, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v10

    invoke-virtual {v9}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v11

    filled-new-array {v9}, [Ljava/lang/Class;

    move-result-object v9

    new-instance v13, Ldb/d0;

    invoke-direct {v13, v1}, Ldb/d0;-><init>(Landroidx/media3/ui/PlayerView;)V

    invoke-static {v11, v9, v13}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    move-result-object v9
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_6

    :catch_2
    const/4 v4, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_6
    iput-object v4, v1, Landroidx/media3/ui/PlayerView;->P:Ljava/lang/Class;

    iput-object v10, v1, Landroidx/media3/ui/PlayerView;->Q:Ljava/lang/reflect/Method;

    iput-object v9, v1, Landroidx/media3/ui/PlayerView;->R:Ljava/lang/Object;

    const v4, 0x7f0a0450

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/ImageView;

    iput-object v4, v1, Landroidx/media3/ui/PlayerView;->H:Landroid/widget/ImageView;

    if-eqz v15, :cond_b

    if-eqz v18, :cond_b

    if-eqz v4, :cond_b

    move/from16 v4, v18

    goto :goto_7

    :cond_b
    move v4, v12

    :goto_7
    iput v4, v1, Landroidx/media3/ui/PlayerView;->V:I

    if-eqz v8, :cond_c

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v8}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    iput-object v4, v1, Landroidx/media3/ui/PlayerView;->a0:Landroid/graphics/drawable/Drawable;

    :cond_c
    const v4, 0x7f0a047c

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroidx/media3/ui/SubtitleView;

    iput-object v4, v1, Landroidx/media3/ui/PlayerView;->I:Landroidx/media3/ui/SubtitleView;

    if-eqz v4, :cond_d

    invoke-virtual {v4}, Landroidx/media3/ui/SubtitleView;->a()V

    invoke-virtual {v4}, Landroidx/media3/ui/SubtitleView;->b()V

    :cond_d
    const v4, 0x7f0a0454

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    iput-object v4, v1, Landroidx/media3/ui/PlayerView;->J:Landroid/view/View;

    const/16 v8, 0x8

    if-eqz v4, :cond_e

    invoke-virtual {v4, v8}, Landroid/view/View;->setVisibility(I)V

    :cond_e
    iput v7, v1, Landroidx/media3/ui/PlayerView;->b0:I

    const v4, 0x7f0a045c

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    iput-object v4, v1, Landroidx/media3/ui/PlayerView;->K:Landroid/widget/TextView;

    if-eqz v4, :cond_f

    invoke-virtual {v4, v8}, Landroid/view/View;->setVisibility(I)V

    :cond_f
    const v4, 0x7f0a0458

    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Ldb/x;

    const v8, 0x7f0a0459

    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    if-eqz v7, :cond_10

    iput-object v7, v1, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    goto :goto_8

    :cond_10
    if-eqz v8, :cond_11

    new-instance v7, Ldb/x;

    invoke-direct {v7, v0, v2}, Ldb/x;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    iput-object v7, v1, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    invoke-virtual {v7, v4}, Landroid/view/View;->setId(I)V

    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    invoke-virtual {v7, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v2

    invoke-virtual {v0, v8}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    invoke-virtual {v0, v7, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    goto :goto_8

    :cond_11
    const/4 v4, 0x0

    iput-object v4, v1, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    :goto_8
    iget-object v0, v1, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    if-eqz v0, :cond_12

    move/from16 v2, v16

    goto :goto_9

    :cond_12
    move v2, v12

    :goto_9
    iput v2, v1, Landroidx/media3/ui/PlayerView;->e0:I

    iput-boolean v3, v1, Landroidx/media3/ui/PlayerView;->h0:Z

    iput-boolean v5, v1, Landroidx/media3/ui/PlayerView;->f0:Z

    iput-boolean v6, v1, Landroidx/media3/ui/PlayerView;->g0:Z

    if-eqz v17, :cond_13

    if-eqz v0, :cond_13

    const/4 v3, 0x1

    goto :goto_a

    :cond_13
    move v3, v12

    :goto_a
    iput-boolean v3, v1, Landroidx/media3/ui/PlayerView;->T:Z

    if-eqz v0, :cond_16

    iget-object v0, v0, Ldb/x;->w:Ldb/c0;

    iget v2, v0, Ldb/c0;->t:I

    const/4 v13, 0x3

    if-eq v2, v13, :cond_15

    const/4 v3, 0x2

    if-ne v2, v3, :cond_14

    goto :goto_b

    :cond_14
    invoke-virtual {v0}, Ldb/c0;->h()V

    invoke-virtual {v0, v3}, Ldb/c0;->k(I)V

    :cond_15
    :goto_b
    iget-object v0, v1, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    iget-object v2, v1, Landroidx/media3/ui/PlayerView;->w:Ldb/e0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Ldb/x;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    :cond_16
    if-eqz v17, :cond_17

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Landroid/view/View;->setClickable(Z)V

    :cond_17
    invoke-virtual {v1}, Landroidx/media3/ui/PlayerView;->m()V

    return-void
.end method

.method public static a(Landroidx/media3/ui/PlayerView;Landroid/graphics/Bitmap;)V
    .locals 2

    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-direct {p0, v0}, Landroidx/media3/ui/PlayerView;->setImage(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->c()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Landroidx/media3/ui/PlayerView;->G:Landroid/widget/ImageView;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->p()V

    :cond_0
    iget-object p0, p0, Landroidx/media3/ui/PlayerView;->y:Landroid/view/View;

    if-eqz p0, :cond_1

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    return-void
.end method

.method private setImage(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->G:Landroid/widget/ImageView;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->p()V

    return-void
.end method

.method private setImageOutput(Lu8/j0;)V
    .locals 2

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->P:Ljava/lang/Class;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->Q:Ljava/lang/reflect/Method;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->R:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 3

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->S:Lu8/j0;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->R:Ljava/lang/Object;

    if-eqz v1, :cond_0

    const/16 v1, 0x1e

    move-object v2, v0

    check-cast v2, La2/a;

    invoke-virtual {v2, v1}, La2/a;->A(I)Z

    move-result v1

    if-eqz v1, :cond_0

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->d0()Lu8/v0;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lu8/v0;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final c()Z
    .locals 3

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->S:Lu8/j0;

    if-eqz v0, :cond_0

    const/16 v1, 0x1e

    move-object v2, v0

    check-cast v2, La2/a;

    invoke-virtual {v2, v1}, La2/a;->A(I)Z

    move-result v1

    if-eqz v1, :cond_0

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->d0()Lu8/v0;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lu8/v0;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final d()V
    .locals 2

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->G:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_0
    if-eqz v0, :cond_1

    const v1, 0x106000d

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_1
    return-void
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    sget p1, Lx8/t;->a:I

    const/16 v0, 0x22

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Landroidx/media3/ui/PlayerView;->F:Ldb/h0;

    if-eqz p1, :cond_0

    iget-boolean v0, p0, Landroidx/media3/ui/PlayerView;->i0:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ldb/h0;->b()V

    :cond_0
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 5

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->S:Lu8/j0;

    if-eqz v0, :cond_0

    const/16 v1, 0x10

    check-cast v0, La2/a;

    invoke-virtual {v0, v1}, La2/a;->A(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->S:Lu8/j0;

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->l0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x13

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_2

    const/16 v1, 0x10e

    if-eq v0, v1, :cond_2

    const/16 v1, 0x16

    if-eq v0, v1, :cond_2

    const/16 v1, 0x10f

    if-eq v0, v1, :cond_2

    const/16 v1, 0x14

    if-eq v0, v1, :cond_2

    const/16 v1, 0x10d

    if-eq v0, v1, :cond_2

    const/16 v1, 0x15

    if-eq v0, v1, :cond_2

    const/16 v1, 0x10c

    if-eq v0, v1, :cond_2

    const/16 v1, 0x17

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1

    :cond_2
    :goto_0
    move v0, v3

    :goto_1
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->q()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v1}, Ldb/x;->g()Z

    move-result v4

    if-nez v4, :cond_3

    invoke-virtual {p0, v3}, Landroidx/media3/ui/PlayerView;->f(Z)V

    return v3

    :cond_3
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->q()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v1, p1}, Ldb/x;->c(Landroid/view/KeyEvent;)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_5

    :goto_2
    invoke-virtual {p0, v3}, Landroidx/media3/ui/PlayerView;->f(Z)V

    return v3

    :cond_5
    if-eqz v0, :cond_6

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->q()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-virtual {p0, v3}, Landroidx/media3/ui/PlayerView;->f(Z)V

    :cond_6
    return v2
.end method

.method public final e()Z
    .locals 2

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->S:Lu8/j0;

    if-eqz v0, :cond_0

    const/16 v1, 0x10

    check-cast v0, La2/a;

    invoke-virtual {v0, v1}, La2/a;->A(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->S:Lu8/j0;

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->l0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->S:Lu8/j0;

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->g0()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final f(Z)V
    .locals 2

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroidx/media3/ui/PlayerView;->g0:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->q()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    invoke-virtual {v0}, Ldb/x;->g()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Ldb/x;->getShowTimeoutMs()I

    move-result v0

    if-gtz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->h()Z

    move-result v1

    if-nez p1, :cond_2

    if-nez v0, :cond_2

    if-eqz v1, :cond_3

    :cond_2
    invoke-virtual {p0, v1}, Landroidx/media3/ui/PlayerView;->i(Z)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final g(Landroid/graphics/drawable/Drawable;)Z
    .locals 6

    const/4 v0, 0x0

    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->H:Landroid/widget/ImageView;

    if-eqz v1, :cond_2

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v3

    if-lez v2, :cond_2

    if-lez v3, :cond_2

    int-to-float v2, v2

    int-to-float v3, v3

    div-float/2addr v2, v3

    sget-object v3, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    iget v4, p0, Landroidx/media3/ui/PlayerView;->V:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    sget-object v3, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    :cond_0
    iget-object v4, p0, Landroidx/media3/ui/PlayerView;->x:Landroidx/media3/ui/AspectRatioFrameLayout;

    if-eqz v4, :cond_1

    invoke-virtual {v4, v2}, Landroidx/media3/ui/AspectRatioFrameLayout;->setAspectRatio(F)V

    :cond_1
    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    const/4 p1, 0x1

    return p1

    :cond_2
    return v0
.end method

.method public getAdOverlayInfos()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljo/a;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->N:Landroid/widget/FrameLayout;

    if-eqz v1, :cond_0

    new-instance v2, Ljo/a;

    invoke-direct {v2, v1}, Ljo/a;-><init>(Landroid/view/View;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    if-eqz v1, :cond_1

    new-instance v2, Ljo/a;

    invoke-direct {v2, v1}, Ljo/a;-><init>(Landroid/view/View;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-static {v0}, Lzr/g0;->m(Ljava/util/Collection;)Lzr/g0;

    move-result-object v0

    return-object v0
.end method

.method public getAdViewGroup()Landroid/view/ViewGroup;
    .locals 2

    const-string v0, "exo_ad_overlay must be present for ad playback"

    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->M:Landroid/widget/FrameLayout;

    invoke-static {v1, v0}, Lva3/g;->k(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v1
.end method

.method public getArtworkDisplayMode()I
    .locals 1

    iget v0, p0, Landroidx/media3/ui/PlayerView;->V:I

    return v0
.end method

.method public getControllerAutoShow()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/media3/ui/PlayerView;->f0:Z

    return v0
.end method

.method public getControllerHideOnTouch()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/media3/ui/PlayerView;->h0:Z

    return v0
.end method

.method public getControllerShowTimeoutMs()I
    .locals 1

    iget v0, p0, Landroidx/media3/ui/PlayerView;->e0:I

    return v0
.end method

.method public getDefaultArtwork()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->a0:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getImageDisplayMode()I
    .locals 1

    iget v0, p0, Landroidx/media3/ui/PlayerView;->W:I

    return v0
.end method

.method public getOverlayFrameLayout()Landroid/widget/FrameLayout;
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->N:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public getPlayer()Lu8/j0;
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->S:Lu8/j0;

    return-object v0
.end method

.method public getResizeMode()I
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->x:Landroidx/media3/ui/AspectRatioFrameLayout;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroidx/media3/ui/AspectRatioFrameLayout;->getResizeMode()I

    move-result v0

    return v0
.end method

.method public getSubtitleView()Landroidx/media3/ui/SubtitleView;
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->I:Landroidx/media3/ui/SubtitleView;

    return-object v0
.end method

.method public getUseArtwork()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget v0, p0, Landroidx/media3/ui/PlayerView;->V:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getUseController()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/media3/ui/PlayerView;->T:Z

    return v0
.end method

.method public getVideoSurfaceView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->z:Landroid/view/View;

    return-object v0
.end method

.method public final h()Z
    .locals 4

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->S:Lu8/j0;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->i0()I

    move-result v0

    iget-boolean v2, p0, Landroidx/media3/ui/PlayerView;->f0:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Landroidx/media3/ui/PlayerView;->S:Lu8/j0;

    const/16 v3, 0x11

    check-cast v2, La2/a;

    invoke-virtual {v2, v3}, La2/a;->A(I)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Landroidx/media3/ui/PlayerView;->S:Lu8/j0;

    check-cast v2, Lb9/f0;

    invoke-virtual {v2}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v2

    invoke-virtual {v2}, Lu8/o0;->p()Z

    move-result v2

    if-nez v2, :cond_3

    :cond_1
    if-eq v0, v1, :cond_2

    const/4 v2, 0x4

    if-eq v0, v2, :cond_2

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->S:Lu8/j0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->g0()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    return v1

    :cond_3
    const/4 v0, 0x0

    return v0
.end method

.method public final i(Z)V
    .locals 3

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->q()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_1

    move p1, v0

    goto :goto_0

    :cond_1
    iget p1, p0, Landroidx/media3/ui/PlayerView;->e0:I

    :goto_0
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    invoke-virtual {v1, p1}, Ldb/x;->setShowTimeoutMs(I)V

    iget-object p1, v1, Ldb/x;->w:Ldb/c0;

    iget-object v1, p1, Ldb/c0;->x:Landroid/widget/FrameLayout;

    check-cast v1, Ldb/x;

    invoke-virtual {v1}, Ldb/x;->h()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v1}, Ldb/x;->i()V

    iget-object v0, v1, Ldb/x;->O:Landroid/widget/ImageView;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    :cond_2
    invoke-virtual {p1}, Ldb/c0;->n()V

    return-void
.end method

.method public final j()V
    .locals 2

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->q()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->S:Lu8/j0;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    invoke-virtual {v0}, Ldb/x;->g()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/media3/ui/PlayerView;->f(Z)V

    return-void

    :cond_1
    iget-boolean v1, p0, Landroidx/media3/ui/PlayerView;->h0:Z

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ldb/x;->f()V

    :cond_2
    :goto_0
    return-void
.end method

.method public final k()V
    .locals 4

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->S:Lu8/j0;

    if-eqz v0, :cond_0

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->L0()V

    iget-object v0, v0, Lb9/f0;->G0:Lu8/y0;

    goto :goto_0

    :cond_0
    sget-object v0, Lu8/y0;->d:Lu8/y0;

    :goto_0
    iget v1, v0, Lu8/y0;->a:I

    iget v2, v0, Lu8/y0;->b:I

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    int-to-float v1, v1

    iget v0, v0, Lu8/y0;->c:F

    mul-float/2addr v1, v0

    int-to-float v0, v2

    div-float/2addr v1, v0

    goto :goto_2

    :cond_2
    :goto_1
    move v1, v3

    :goto_2
    iget-boolean v0, p0, Landroidx/media3/ui/PlayerView;->E:Z

    if-eqz v0, :cond_3

    goto :goto_3

    :cond_3
    move v3, v1

    :goto_3
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->x:Landroidx/media3/ui/AspectRatioFrameLayout;

    if-eqz v0, :cond_4

    invoke-virtual {v0, v3}, Landroidx/media3/ui/AspectRatioFrameLayout;->setAspectRatio(F)V

    :cond_4
    return-void
.end method

.method public final l()V
    .locals 5

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->J:Landroid/view/View;

    if-eqz v0, :cond_3

    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->S:Lu8/j0;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v1, Lb9/f0;

    invoke-virtual {v1}, Lb9/f0;->i0()I

    move-result v1

    const/4 v3, 0x2

    if-ne v1, v3, :cond_0

    iget v1, p0, Landroidx/media3/ui/PlayerView;->b0:I

    const/4 v4, 0x1

    if-eq v1, v3, :cond_1

    if-ne v1, v4, :cond_0

    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->S:Lu8/j0;

    check-cast v1, Lb9/f0;

    invoke-virtual {v1}, Lb9/f0;->g0()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move v4, v2

    :cond_1
    :goto_0
    if-eqz v4, :cond_2

    goto :goto_1

    :cond_2
    const/16 v2, 0x8

    :goto_1
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    return-void
.end method

.method public final m()V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    if-eqz v1, :cond_3

    iget-boolean v2, p0, Landroidx/media3/ui/PlayerView;->T:Z

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ldb/x;->g()Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Landroidx/media3/ui/PlayerView;->h0:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1404ab

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    :cond_1
    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f1404b9

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    :cond_3
    :goto_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final n()V
    .locals 2

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->K:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->d0:Ljava/lang/CharSequence;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->S:Lu8/j0;

    if-eqz v1, :cond_1

    check-cast v1, Lb9/f0;

    invoke-virtual {v1}, Lb9/f0;->L0()V

    iget-object v1, v1, Lb9/f0;->I0:Lb9/c1;

    iget-object v1, v1, Lb9/c1;->f:Landroidx/media3/exoplayer/ExoPlaybackException;

    :cond_1
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    return-void
.end method

.method public final o(Z)V
    .locals 10

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->S:Lu8/j0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/16 v3, 0x1e

    move-object v4, v0

    check-cast v4, La2/a;

    invoke-virtual {v4, v3}, La2/a;->A(I)Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lb9/f0;

    invoke-virtual {v3}, Lb9/f0;->d0()Lu8/v0;

    move-result-object v3

    iget-object v3, v3, Lu8/v0;->a:Lzr/g0;

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_0

    move v3, v1

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    iget-boolean v4, p0, Landroidx/media3/ui/PlayerView;->c0:Z

    const v5, 0x106000d

    const/4 v6, 0x4

    iget-object v7, p0, Landroidx/media3/ui/PlayerView;->H:Landroid/widget/ImageView;

    iget-object v8, p0, Landroidx/media3/ui/PlayerView;->y:Landroid/view/View;

    if-nez v4, :cond_4

    if-eqz v3, :cond_1

    if-eqz p1, :cond_4

    :cond_1
    if-eqz v7, :cond_2

    invoke-virtual {v7, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v7, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_2
    if-eqz v8, :cond_3

    invoke-virtual {v8, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_3
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->d()V

    :cond_4
    if-nez v3, :cond_5

    goto/16 :goto_5

    :cond_5
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->c()Z

    move-result p1

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->b()Z

    move-result v3

    if-nez p1, :cond_7

    if-nez v3, :cond_7

    if-eqz v8, :cond_6

    invoke-virtual {v8, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_6
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->d()V

    :cond_7
    iget-object v4, p0, Landroidx/media3/ui/PlayerView;->G:Landroid/widget/ImageView;

    if-eqz v8, :cond_9

    invoke-virtual {v8}, Landroid/view/View;->getVisibility()I

    move-result v9

    if-ne v9, v6, :cond_9

    if-nez v4, :cond_8

    goto :goto_1

    :cond_8
    invoke-virtual {v4}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v9

    if-eqz v9, :cond_9

    invoke-virtual {v9}, Landroid/graphics/drawable/Drawable;->getAlpha()I

    move-result v9

    if-eqz v9, :cond_9

    goto :goto_2

    :cond_9
    :goto_1
    move v1, v2

    :goto_2
    if-eqz v3, :cond_b

    if-nez p1, :cond_b

    if-eqz v1, :cond_b

    if-eqz v8, :cond_a

    invoke-virtual {v8, v2}, Landroid/view/View;->setVisibility(I)V

    :cond_a
    if-eqz v4, :cond_c

    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->p()V

    goto :goto_3

    :cond_b
    if-eqz p1, :cond_c

    if-nez v3, :cond_c

    if-eqz v1, :cond_c

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->d()V

    :cond_c
    :goto_3
    if-nez p1, :cond_11

    if-nez v3, :cond_11

    iget p1, p0, Landroidx/media3/ui/PlayerView;->V:I

    if-eqz p1, :cond_11

    invoke-static {v7}, Lva3/g;->j(Ljava/lang/Object;)V

    if-eqz v0, :cond_f

    const/16 p1, 0x12

    move-object v1, v0

    check-cast v1, La2/a;

    invoke-virtual {v1, p1}, La2/a;->A(I)Z

    move-result p1

    if-nez p1, :cond_d

    goto :goto_4

    :cond_d
    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->L0()V

    iget-object p1, v0, Lb9/f0;->q0:Lu8/a0;

    iget-object p1, p1, Lu8/a0;->f:[B

    if-nez p1, :cond_e

    goto :goto_4

    :cond_e
    array-length v0, p1

    invoke-static {p1, v2, v0}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object p1

    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    invoke-virtual {p0, v0}, Landroidx/media3/ui/PlayerView;->g(Landroid/graphics/drawable/Drawable;)Z

    move-result v2

    :cond_f
    :goto_4
    if-eqz v2, :cond_10

    goto :goto_5

    :cond_10
    iget-object p1, p0, Landroidx/media3/ui/PlayerView;->a0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerView;->g(Landroid/graphics/drawable/Drawable;)Z

    move-result p1

    if-eqz p1, :cond_11

    goto :goto_5

    :cond_11
    if-eqz v7, :cond_12

    invoke-virtual {v7, v5}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v7, v6}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_12
    :goto_5
    return-void
.end method

.method public final onTrackballEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->q()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Landroidx/media3/ui/PlayerView;->S:Lu8/j0;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerView;->f(Z)V

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final p()V
    .locals 5

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->G:Landroid/widget/ImageView;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    if-lez v2, :cond_5

    if-gtz v1, :cond_2

    goto :goto_0

    :cond_2
    int-to-float v2, v2

    int-to-float v1, v1

    div-float/2addr v2, v1

    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_XY:Landroid/widget/ImageView$ScaleType;

    iget v3, p0, Landroidx/media3/ui/PlayerView;->W:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float v2, v1, v2

    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_4

    iget-object v3, p0, Landroidx/media3/ui/PlayerView;->x:Landroidx/media3/ui/AspectRatioFrameLayout;

    if-eqz v3, :cond_4

    invoke-virtual {v3, v2}, Landroidx/media3/ui/AspectRatioFrameLayout;->setAspectRatio(F)V

    :cond_4
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    :cond_5
    :goto_0
    return-void
.end method

.method public final performClick()Z
    .locals 1

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->j()V

    invoke-super {p0}, Landroid/view/View;->performClick()Z

    move-result v0

    return v0
.end method

.method public final q()Z
    .locals 1

    iget-boolean v0, p0, Landroidx/media3/ui/PlayerView;->T:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public setArtworkDisplayMode(I)V
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->H:Landroid/widget/ImageView;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, Lva3/g;->i(Z)V

    iget v1, p0, Landroidx/media3/ui/PlayerView;->V:I

    if-eq v1, p1, :cond_2

    iput p1, p0, Landroidx/media3/ui/PlayerView;->V:I

    invoke-virtual {p0, v0}, Landroidx/media3/ui/PlayerView;->o(Z)V

    :cond_2
    return-void
.end method

.method public setAspectRatioListener(Ldb/a;)V
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->x:Landroidx/media3/ui/AspectRatioFrameLayout;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Landroidx/media3/ui/AspectRatioFrameLayout;->setAspectRatioListener(Ldb/a;)V

    return-void
.end method

.method public setControllerAnimationEnabled(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ldb/x;->setAnimationEnabled(Z)V

    return-void
.end method

.method public setControllerAutoShow(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/media3/ui/PlayerView;->f0:Z

    return-void
.end method

.method public setControllerHideDuringAds(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/media3/ui/PlayerView;->g0:Z

    return-void
.end method

.method public setControllerHideOnTouch(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    iput-boolean p1, p0, Landroidx/media3/ui/PlayerView;->h0:Z

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->m()V

    return-void
.end method

.method public setControllerOnFullScreenModeChangedListener(Ldb/n;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ldb/x;->setOnFullScreenModeChangedListener(Ldb/n;)V

    return-void
.end method

.method public setControllerShowTimeoutMs(I)V
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    iput p1, p0, Landroidx/media3/ui/PlayerView;->e0:I

    invoke-virtual {v0}, Ldb/x;->g()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->h()Z

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerView;->i(Z)V

    :cond_0
    return-void
.end method

.method public setControllerVisibilityListener(Ldb/f0;)V
    .locals 0

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    .line 1
    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerView;->setControllerVisibilityListener(Ldb/w;)V

    :cond_0
    return-void
.end method

.method public setControllerVisibilityListener(Ldb/w;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 2
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-object v0, v0, Ldb/x;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 3
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->U:Ldb/w;

    if-ne v1, p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 5
    :cond_1
    iput-object p1, p0, Landroidx/media3/ui/PlayerView;->U:Ldb/w;

    if-eqz p1, :cond_2

    .line 6
    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    .line 7
    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerView;->setControllerVisibilityListener(Ldb/f0;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public setCustomErrorMessage(Ljava/lang/CharSequence;)V
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->K:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lva3/g;->i(Z)V

    iput-object p1, p0, Landroidx/media3/ui/PlayerView;->d0:Ljava/lang/CharSequence;

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->n()V

    return-void
.end method

.method public setDefaultArtwork(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->a0:Landroid/graphics/drawable/Drawable;

    if-eq v0, p1, :cond_0

    iput-object p1, p0, Landroidx/media3/ui/PlayerView;->a0:Landroid/graphics/drawable/Drawable;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerView;->o(Z)V

    :cond_0
    return-void
.end method

.method public setEnableComposeSurfaceSyncWorkaround(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/media3/ui/PlayerView;->i0:Z

    return-void
.end method

.method public setErrorMessageProvider(Lu8/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu8/m;",
            ")V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->n()V

    :cond_0
    return-void
.end method

.method public setFullscreenButtonClickListener(Ldb/g0;)V
    .locals 1

    iget-object p1, p0, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    invoke-static {p1}, Lva3/g;->j(Ljava/lang/Object;)V

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->w:Ldb/e0;

    invoke-virtual {p1, v0}, Ldb/x;->setOnFullScreenModeChangedListener(Ldb/n;)V

    return-void
.end method

.method public setFullscreenButtonState(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ldb/x;->k(Z)V

    return-void
.end method

.method public setImageDisplayMode(I)V
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->G:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lva3/g;->i(Z)V

    iget v0, p0, Landroidx/media3/ui/PlayerView;->W:I

    if-eq v0, p1, :cond_1

    iput p1, p0, Landroidx/media3/ui/PlayerView;->W:I

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->p()V

    :cond_1
    return-void
.end method

.method public setKeepContentOnPlayerReset(Z)V
    .locals 1

    iget-boolean v0, p0, Landroidx/media3/ui/PlayerView;->c0:Z

    if-eq v0, p1, :cond_0

    iput-boolean p1, p0, Landroidx/media3/ui/PlayerView;->c0:Z

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerView;->o(Z)V

    :cond_0
    return-void
.end method

.method public setPlayer(Lu8/j0;)V
    .locals 11

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    invoke-static {v0}, Lva3/g;->i(Z)V

    if-eqz p1, :cond_2

    move-object v0, p1

    check-cast v0, Lb9/f0;

    iget-object v0, v0, Lb9/f0;->U:Landroid/os/Looper;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    move v0, v3

    goto :goto_2

    :cond_2
    :goto_1
    move v0, v2

    :goto_2
    invoke-static {v0}, Lva3/g;->d(Z)V

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->S:Lu8/j0;

    if-ne v0, p1, :cond_3

    goto/16 :goto_b

    :cond_3
    iget-object v1, p0, Landroidx/media3/ui/PlayerView;->z:Landroid/view/View;

    const/16 v4, 0x1b

    iget-object v5, p0, Landroidx/media3/ui/PlayerView;->w:Ldb/e0;

    const/4 v6, 0x0

    if-eqz v0, :cond_6

    move-object v7, v0

    check-cast v7, Lb9/f0;

    invoke-virtual {v7, v5}, Lb9/f0;->s0(Lu8/h0;)V

    move-object v8, v0

    check-cast v8, La2/a;

    invoke-virtual {v8, v4}, La2/a;->A(I)Z

    move-result v8

    if-eqz v8, :cond_5

    instance-of v8, v1, Landroid/view/TextureView;

    if-eqz v8, :cond_4

    move-object v8, v1

    check-cast v8, Landroid/view/TextureView;

    invoke-virtual {v7}, Lb9/f0;->L0()V

    iget-object v9, v7, Lb9/f0;->w0:Landroid/view/TextureView;

    if-ne v8, v9, :cond_5

    invoke-virtual {v7}, Lb9/f0;->S()V

    goto :goto_3

    :cond_4
    instance-of v8, v1, Landroid/view/SurfaceView;

    if-eqz v8, :cond_5

    move-object v8, v1

    check-cast v8, Landroid/view/SurfaceView;

    invoke-virtual {v7}, Lb9/f0;->L0()V

    invoke-virtual {v8}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v8

    invoke-virtual {v7}, Lb9/f0;->L0()V

    if-eqz v8, :cond_5

    iget-object v9, v7, Lb9/f0;->t0:Landroid/view/SurfaceHolder;

    if-ne v8, v9, :cond_5

    invoke-virtual {v7}, Lb9/f0;->S()V

    :cond_5
    :goto_3
    iget-object v7, p0, Landroidx/media3/ui/PlayerView;->P:Ljava/lang/Class;

    if-eqz v7, :cond_6

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v7

    if-eqz v7, :cond_6

    :try_start_0
    iget-object v7, p0, Landroidx/media3/ui/PlayerView;->Q:Ljava/lang/reflect/Method;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v7, v0, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :catch_0
    move-exception p1

    goto :goto_4

    :catch_1
    move-exception p1

    :goto_4
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_6
    :goto_5
    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->I:Landroidx/media3/ui/SubtitleView;

    if-eqz v0, :cond_7

    invoke-virtual {v0, v6}, Landroidx/media3/ui/SubtitleView;->setCues(Ljava/util/List;)V

    :cond_7
    iput-object p1, p0, Landroidx/media3/ui/PlayerView;->S:Lu8/j0;

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->q()Z

    move-result v7

    iget-object v8, p0, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    if-eqz v7, :cond_8

    invoke-virtual {v8, p1}, Ldb/x;->setPlayer(Lu8/j0;)V

    :cond_8
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->l()V

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->n()V

    invoke-virtual {p0, v2}, Landroidx/media3/ui/PlayerView;->o(Z)V

    if-eqz p1, :cond_18

    move-object v7, p1

    check-cast v7, La2/a;

    invoke-virtual {v7, v4}, La2/a;->A(I)Z

    move-result v4

    if-eqz v4, :cond_16

    instance-of v4, v1, Landroid/view/TextureView;

    if-eqz v4, :cond_c

    check-cast v1, Landroid/view/TextureView;

    move-object v2, p1

    check-cast v2, Lb9/f0;

    invoke-virtual {v2}, Lb9/f0;->L0()V

    invoke-virtual {v2}, Lb9/f0;->u0()V

    iput-object v1, v2, Lb9/f0;->w0:Landroid/view/TextureView;

    invoke-virtual {v1}, Landroid/view/TextureView;->getSurfaceTextureListener()Landroid/view/TextureView$SurfaceTextureListener;

    move-result-object v4

    if-eqz v4, :cond_9

    const-string v4, "ExoPlayerImpl"

    const-string v8, "Replacing existing SurfaceTextureListener."

    invoke-static {v4, v8}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    :cond_9
    iget-object v4, v2, Lb9/f0;->a0:Lb9/c0;

    invoke-virtual {v1, v4}, Landroid/view/TextureView;->setSurfaceTextureListener(Landroid/view/TextureView$SurfaceTextureListener;)V

    invoke-virtual {v1}, Landroid/view/TextureView;->isAvailable()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-virtual {v1}, Landroid/view/TextureView;->getSurfaceTexture()Landroid/graphics/SurfaceTexture;

    move-result-object v4

    goto :goto_6

    :cond_a
    move-object v4, v6

    :goto_6
    if-nez v4, :cond_b

    invoke-virtual {v2, v6}, Lb9/f0;->E0(Ljava/lang/Object;)V

    invoke-virtual {v2, v3, v3}, Lb9/f0;->p0(II)V

    goto/16 :goto_7

    :cond_b
    new-instance v6, Landroid/view/Surface;

    invoke-direct {v6, v4}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    invoke-virtual {v2, v6}, Lb9/f0;->E0(Ljava/lang/Object;)V

    iput-object v6, v2, Lb9/f0;->s0:Landroid/view/Surface;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v4

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    invoke-virtual {v2, v4, v1}, Lb9/f0;->p0(II)V

    goto/16 :goto_7

    :cond_c
    instance-of v4, v1, Landroid/view/SurfaceView;

    if-eqz v4, :cond_11

    check-cast v1, Landroid/view/SurfaceView;

    move-object v4, p1

    check-cast v4, Lb9/f0;

    iget-object v8, v4, Lb9/f0;->a0:Lb9/c0;

    invoke-virtual {v4}, Lb9/f0;->L0()V

    instance-of v9, v1, Lr9/l;

    if-eqz v9, :cond_d

    invoke-virtual {v4}, Lb9/f0;->u0()V

    invoke-virtual {v4, v1}, Lb9/f0;->E0(Ljava/lang/Object;)V

    invoke-virtual {v1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v1

    invoke-virtual {v4, v1}, Lb9/f0;->y0(Landroid/view/SurfaceHolder;)V

    goto/16 :goto_7

    :cond_d
    instance-of v9, v1, Ls9/i;

    if-eqz v9, :cond_e

    invoke-virtual {v4}, Lb9/f0;->u0()V

    move-object v6, v1

    check-cast v6, Ls9/i;

    iput-object v6, v4, Lb9/f0;->u0:Ls9/i;

    iget-object v6, v4, Lb9/f0;->b0:Lb9/d0;

    invoke-virtual {v4, v6}, Lb9/f0;->U(Lb9/e1;)Lb9/f1;

    move-result-object v6

    iget-boolean v9, v6, Lb9/f1;->f:Z

    xor-int/2addr v9, v2

    invoke-static {v9}, Lva3/g;->i(Z)V

    const/16 v9, 0x2710

    iput v9, v6, Lb9/f1;->c:I

    iget-object v9, v4, Lb9/f0;->u0:Ls9/i;

    iget-boolean v10, v6, Lb9/f1;->f:Z

    xor-int/2addr v2, v10

    invoke-static {v2}, Lva3/g;->i(Z)V

    iput-object v9, v6, Lb9/f1;->d:Ljava/lang/Object;

    invoke-virtual {v6}, Lb9/f1;->b()V

    iget-object v2, v4, Lb9/f0;->u0:Ls9/i;

    iget-object v2, v2, Ls9/i;->w:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2, v8}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, v4, Lb9/f0;->u0:Ls9/i;

    invoke-virtual {v2}, Ls9/i;->getVideoSurface()Landroid/view/Surface;

    move-result-object v2

    invoke-virtual {v4, v2}, Lb9/f0;->E0(Ljava/lang/Object;)V

    invoke-virtual {v1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v1

    invoke-virtual {v4, v1}, Lb9/f0;->y0(Landroid/view/SurfaceHolder;)V

    goto :goto_7

    :cond_e
    invoke-virtual {v1}, Landroid/view/SurfaceView;->getHolder()Landroid/view/SurfaceHolder;

    move-result-object v1

    invoke-virtual {v4}, Lb9/f0;->L0()V

    if-nez v1, :cond_f

    invoke-virtual {v4}, Lb9/f0;->S()V

    goto :goto_7

    :cond_f
    invoke-virtual {v4}, Lb9/f0;->u0()V

    iput-boolean v2, v4, Lb9/f0;->v0:Z

    iput-object v1, v4, Lb9/f0;->t0:Landroid/view/SurfaceHolder;

    invoke-interface {v1, v8}, Landroid/view/SurfaceHolder;->addCallback(Landroid/view/SurfaceHolder$Callback;)V

    invoke-interface {v1}, Landroid/view/SurfaceHolder;->getSurface()Landroid/view/Surface;

    move-result-object v2

    if-eqz v2, :cond_10

    invoke-virtual {v2}, Landroid/view/Surface;->isValid()Z

    move-result v8

    if-eqz v8, :cond_10

    invoke-virtual {v4, v2}, Lb9/f0;->E0(Ljava/lang/Object;)V

    invoke-interface {v1}, Landroid/view/SurfaceHolder;->getSurfaceFrame()Landroid/graphics/Rect;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v1

    invoke-virtual {v4, v2, v1}, Lb9/f0;->p0(II)V

    goto :goto_7

    :cond_10
    invoke-virtual {v4, v6}, Lb9/f0;->E0(Ljava/lang/Object;)V

    invoke-virtual {v4, v3, v3}, Lb9/f0;->p0(II)V

    :cond_11
    :goto_7
    const/16 v1, 0x1e

    invoke-virtual {v7, v1}, La2/a;->A(I)Z

    move-result v1

    if-eqz v1, :cond_15

    move-object v1, p1

    check-cast v1, Lb9/f0;

    invoke-virtual {v1}, Lb9/f0;->d0()Lu8/v0;

    move-result-object v1

    iget-object v1, v1, Lu8/v0;->a:Lzr/g0;

    const/4 v2, 0x0

    move v4, v2

    :goto_8
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v6

    if-ge v4, v6, :cond_14

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lu8/u0;

    iget-object v6, v6, Lu8/u0;->b:Lu8/p0;

    iget v6, v6, Lu8/p0;->c:I

    const/4 v8, 0x2

    if-ne v6, v8, :cond_13

    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lu8/u0;

    move v8, v2

    :goto_9
    iget-object v9, v6, Lu8/u0;->d:[I

    array-length v9, v9

    if-ge v8, v9, :cond_13

    invoke-virtual {v6, v8}, Lu8/u0;->a(I)Z

    move-result v9

    if-eqz v9, :cond_12

    const/4 v2, 0x1

    goto :goto_a

    :cond_12
    add-int/lit8 v8, v8, 0x1

    goto :goto_9

    :cond_13
    add-int/lit8 v4, v4, 0x1

    goto :goto_8

    :cond_14
    :goto_a
    if-eqz v2, :cond_16

    :cond_15
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->k()V

    :cond_16
    if-eqz v0, :cond_17

    const/16 v1, 0x1c

    invoke-virtual {v7, v1}, La2/a;->A(I)Z

    move-result v1

    if-eqz v1, :cond_17

    move-object v1, p1

    check-cast v1, Lb9/f0;

    invoke-virtual {v1}, Lb9/f0;->L0()V

    iget-object v1, v1, Lb9/f0;->B0:Lw8/c;

    iget-object v1, v1, Lw8/c;->a:Lzr/g0;

    invoke-virtual {v0, v1}, Landroidx/media3/ui/SubtitleView;->setCues(Ljava/util/List;)V

    :cond_17
    move-object v0, p1

    check-cast v0, Lb9/f0;

    invoke-virtual {v0, v5}, Lb9/f0;->Q(Lu8/h0;)V

    invoke-direct {p0, p1}, Landroidx/media3/ui/PlayerView;->setImageOutput(Lu8/j0;)V

    invoke-virtual {p0, v3}, Landroidx/media3/ui/PlayerView;->f(Z)V

    return-void

    :cond_18
    if-eqz v8, :cond_19

    invoke-virtual {v8}, Ldb/x;->f()V

    :cond_19
    :goto_b
    return-void
.end method

.method public setRepeatToggleModes(I)V
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ldb/x;->setRepeatToggleModes(I)V

    return-void
.end method

.method public setResizeMode(I)V
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->x:Landroidx/media3/ui/AspectRatioFrameLayout;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Landroidx/media3/ui/AspectRatioFrameLayout;->setResizeMode(I)V

    return-void
.end method

.method public setShowBuffering(I)V
    .locals 1

    iget v0, p0, Landroidx/media3/ui/PlayerView;->b0:I

    if-eq v0, p1, :cond_0

    iput p1, p0, Landroidx/media3/ui/PlayerView;->b0:I

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->l()V

    :cond_0
    return-void
.end method

.method public setShowFastForwardButton(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ldb/x;->setShowFastForwardButton(Z)V

    return-void
.end method

.method public setShowMultiWindowTimeBar(Z)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ldb/x;->setShowMultiWindowTimeBar(Z)V

    return-void
.end method

.method public setShowNextButton(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ldb/x;->setShowNextButton(Z)V

    return-void
.end method

.method public setShowPlayButtonIfPlaybackIsSuppressed(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ldb/x;->setShowPlayButtonIfPlaybackIsSuppressed(Z)V

    return-void
.end method

.method public setShowPreviousButton(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ldb/x;->setShowPreviousButton(Z)V

    return-void
.end method

.method public setShowRewindButton(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ldb/x;->setShowRewindButton(Z)V

    return-void
.end method

.method public setShowShuffleButton(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ldb/x;->setShowShuffleButton(Z)V

    return-void
.end method

.method public setShowSubtitleButton(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ldb/x;->setShowSubtitleButton(Z)V

    return-void
.end method

.method public setShowVrButton(Z)V
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    invoke-static {v0}, Lva3/g;->j(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ldb/x;->setShowVrButton(Z)V

    return-void
.end method

.method public setShutterBackgroundColor(I)V
    .locals 1

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->y:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_0
    return-void
.end method

.method public setUseArtwork(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    xor-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Landroidx/media3/ui/PlayerView;->setArtworkDisplayMode(I)V

    return-void
.end method

.method public setUseController(Z)V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    iget-object v2, p0, Landroidx/media3/ui/PlayerView;->L:Ldb/x;

    if-eqz p1, :cond_1

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move v3, v1

    goto :goto_1

    :cond_1
    :goto_0
    move v3, v0

    :goto_1
    invoke-static {v3}, Lva3/g;->i(Z)V

    if-nez p1, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->hasOnClickListeners()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    move v0, v1

    :cond_3
    :goto_2
    invoke-virtual {p0, v0}, Landroid/view/View;->setClickable(Z)V

    iget-boolean v0, p0, Landroidx/media3/ui/PlayerView;->T:Z

    if-ne v0, p1, :cond_4

    return-void

    :cond_4
    iput-boolean p1, p0, Landroidx/media3/ui/PlayerView;->T:Z

    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->q()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Landroidx/media3/ui/PlayerView;->S:Lu8/j0;

    invoke-virtual {v2, p1}, Ldb/x;->setPlayer(Lu8/j0;)V

    goto :goto_3

    :cond_5
    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ldb/x;->f()V

    const/4 p1, 0x0

    invoke-virtual {v2, p1}, Ldb/x;->setPlayer(Lu8/j0;)V

    :cond_6
    :goto_3
    invoke-virtual {p0}, Landroidx/media3/ui/PlayerView;->m()V

    return-void
.end method

.method public setVisibility(I)V
    .locals 2

    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Landroidx/media3/ui/PlayerView;->z:Landroid/view/View;

    instance-of v1, v0, Landroid/view/SurfaceView;

    if-eqz v1, :cond_0

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method
