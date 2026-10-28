.class public final Ldb/x;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# static fields
.field public static final Z0:[F


# instance fields
.field public final A0:Ljava/lang/String;

.field public final B0:Landroid/graphics/drawable/Drawable;

.field public final C0:Landroid/graphics/drawable/Drawable;

.field public final D0:Ljava/lang/String;

.field public final E:Landroidx/recyclerview/widget/RecyclerView;

.field public final E0:Ljava/lang/String;

.field public final F:Ldb/r;

.field public final F0:Landroid/graphics/drawable/Drawable;

.field public final G:Ldb/o;

.field public final G0:Landroid/graphics/drawable/Drawable;

.field public final H:Ldb/l;

.field public final H0:Ljava/lang/String;

.field public final I:Ldb/l;

.field public final I0:Ljava/lang/String;

.field public final J:Ldb/g;

.field public J0:Lu8/j0;

.field public final K:Landroid/widget/PopupWindow;

.field public K0:Z

.field public final L:I

.field public L0:Z

.field public final M:Landroid/widget/ImageView;

.field public M0:Z

.field public final N:Landroid/widget/ImageView;

.field public N0:Z

.field public final O:Landroid/widget/ImageView;

.field public O0:Z

.field public final P:Landroid/view/View;

.field public P0:Z

.field public final Q:Landroid/view/View;

.field public Q0:I

.field public final R:Landroid/widget/TextView;

.field public R0:I

.field public final S:Landroid/widget/TextView;

.field public S0:I

.field public final T:Landroid/widget/ImageView;

.field public T0:[J

.field public final U:Landroid/widget/ImageView;

.field public U0:[Z

.field public final V:Landroid/widget/ImageView;

.field public final V0:[J

.field public final W:Landroid/widget/ImageView;

.field public final W0:[Z

.field public X0:J

.field public Y0:Z

.field public final a0:Landroid/widget/ImageView;

.field public final b0:Landroid/widget/ImageView;

.field public final c0:Landroid/view/View;

.field public final d0:Landroid/view/View;

.field public final e0:Landroid/view/View;

.field public final f0:Landroid/widget/TextView;

.field public final g0:Landroid/widget/TextView;

.field public final h0:Ldb/r0;

.field public final i0:Ljava/lang/StringBuilder;

.field public final j0:Ljava/util/Formatter;

.field public final k0:Lu8/m0;

.field public final l0:Lu8/n0;

.field public final m0:Landroidx/fragment/app/m;

.field public final n0:Landroid/graphics/drawable/Drawable;

.field public final o0:Landroid/graphics/drawable/Drawable;

.field public final p0:Landroid/graphics/drawable/Drawable;

.field public final q0:Landroid/graphics/drawable/Drawable;

.field public final r0:Landroid/graphics/drawable/Drawable;

.field public final s0:Ljava/lang/String;

.field public final t0:Ljava/lang/String;

.field public final u0:Ljava/lang/String;

.field public final v0:Landroid/graphics/drawable/Drawable;

.field public final w:Ldb/c0;

.field public final w0:Landroid/graphics/drawable/Drawable;

.field public final x:Landroid/content/res/Resources;

.field public final x0:F

.field public final y:Ldb/m;

.field public final y0:F

.field public final z:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public final z0:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "media3.ui"

    invoke-static {v0}, Lu8/y;->a(Ljava/lang/String;)V

    const/4 v0, 0x7

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    sput-object v0, Ldb/x;->Z0:[F

    return-void

    :array_0
    .array-data 4
        0x3e800000    # 0.25f
        0x3f000000    # 0.5f
        0x3f400000    # 0.75f
        0x3f800000    # 1.0f
        0x3fa00000    # 1.25f
        0x3fc00000    # 1.5f
        0x40000000    # 2.0f
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 33

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v1, v0, v3, v4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 v5, 0x1

    iput-boolean v5, v1, Ldb/x;->N0:Z

    const/16 v6, 0x1388

    iput v6, v1, Ldb/x;->Q0:I

    iput v4, v1, Ldb/x;->S0:I

    const/16 v6, 0xc8

    iput v6, v1, Ldb/x;->R0:I

    const/16 v6, 0x8

    const v7, 0x7f0d0179

    const v8, 0x7f080446

    const v9, 0x7f080445

    const v10, 0x7f080442

    const v11, 0x7f08044f

    const v12, 0x7f080447

    const v13, 0x7f080450

    const v14, 0x7f080441

    const v15, 0x7f080440

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v5

    sget-object v3, Ldb/i0;->d:[I

    invoke-virtual {v5, v2, v3, v4, v4}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v3

    const/4 v5, 0x6

    :try_start_0
    invoke-virtual {v3, v5, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v7

    const/16 v5, 0xc

    invoke-virtual {v3, v5, v8}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v8

    const/16 v5, 0xb

    invoke-virtual {v3, v5, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v9

    const/16 v5, 0xa

    invoke-virtual {v3, v5, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v10

    const/4 v5, 0x7

    invoke-virtual {v3, v5, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v11

    const/16 v5, 0xf

    invoke-virtual {v3, v5, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v12

    const/16 v5, 0x14

    invoke-virtual {v3, v5, v13}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v13

    const/16 v5, 0x9

    invoke-virtual {v3, v5, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v14

    invoke-virtual {v3, v6, v15}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v15

    const/16 v5, 0x11

    const v6, 0x7f080449

    invoke-virtual {v3, v5, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v5

    const/16 v6, 0x12

    const v4, 0x7f08044a

    invoke-virtual {v3, v6, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    const/16 v6, 0x10

    move/from16 v16, v4

    const v4, 0x7f080448

    invoke-virtual {v3, v6, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    const/16 v6, 0x23

    move/from16 v17, v4

    const v4, 0x7f08044e

    invoke-virtual {v3, v6, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    const/16 v6, 0x22

    move/from16 v18, v4

    const v4, 0x7f08044d

    invoke-virtual {v3, v6, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    const/16 v6, 0x25

    move/from16 v19, v4

    const v4, 0x7f080453

    invoke-virtual {v3, v6, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    const/16 v6, 0x24

    move/from16 v20, v4

    const v4, 0x7f080452

    invoke-virtual {v3, v6, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    const/16 v6, 0x29

    move/from16 v21, v4

    const v4, 0x7f080454

    invoke-virtual {v3, v6, v4}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    iget v6, v1, Ldb/x;->Q0:I

    move/from16 v22, v4

    const/16 v4, 0x20

    invoke-virtual {v3, v4, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    iput v4, v1, Ldb/x;->Q0:I

    iget v4, v1, Ldb/x;->S0:I

    const/16 v6, 0x13

    invoke-virtual {v3, v6, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    iput v4, v1, Ldb/x;->S0:I

    const/16 v4, 0x1d

    const/4 v6, 0x1

    invoke-virtual {v3, v4, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    move/from16 v24, v4

    const/16 v4, 0x1a

    invoke-virtual {v3, v4, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    move/from16 v25, v4

    const/16 v4, 0x1c

    invoke-virtual {v3, v4, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    move/from16 v26, v4

    const/16 v4, 0x1b

    invoke-virtual {v3, v4, v6}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    const/16 v6, 0x1e

    move/from16 v27, v4

    const/4 v4, 0x0

    invoke-virtual {v3, v6, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    move/from16 v28, v5

    const/16 v5, 0x1f

    invoke-virtual {v3, v5, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    move/from16 v29, v5

    const/16 v5, 0x21

    invoke-virtual {v3, v5, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v5

    iget v4, v1, Ldb/x;->R0:I

    move/from16 v30, v5

    const/16 v5, 0x26

    invoke-virtual {v3, v5, v4}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    invoke-virtual {v1, v4}, Ldb/x;->setTimeBarMinUpdateInterval(I)V

    const/4 v4, 0x2

    const/4 v5, 0x1

    invoke-virtual {v3, v4, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    move v3, v15

    move v15, v11

    move v11, v12

    move/from16 v12, v20

    move/from16 v20, v26

    move/from16 v26, v17

    move/from16 v17, v29

    move/from16 v29, v3

    move v3, v4

    move v4, v7

    move/from16 v7, v22

    move/from16 v22, v25

    move/from16 v25, v18

    move/from16 v18, v6

    move v6, v9

    move v9, v14

    move v14, v10

    move v10, v13

    move/from16 v13, v21

    move/from16 v21, v24

    move/from16 v24, v19

    move/from16 v19, v27

    move/from16 v27, v16

    move/from16 v16, v30

    :goto_0
    move v5, v8

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    throw v0

    :cond_0
    const v4, 0x7f080454

    const v6, 0x7f080449

    const v16, 0x7f08044a

    const v17, 0x7f080448

    const v18, 0x7f08044e

    const v19, 0x7f08044d

    const v20, 0x7f080453

    const v21, 0x7f080452

    move v3, v7

    move v7, v4

    move v4, v3

    move/from16 v28, v6

    move v6, v9

    move v9, v14

    move/from16 v29, v15

    move/from16 v27, v16

    move/from16 v26, v17

    move/from16 v25, v18

    move/from16 v24, v19

    const/4 v3, 0x1

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v22, 0x1

    move v14, v10

    move v15, v11

    move v11, v12

    move v10, v13

    move/from16 v12, v20

    move/from16 v13, v21

    const/16 v20, 0x1

    const/16 v21, 0x1

    goto :goto_0

    :goto_1
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v8

    invoke-virtual {v8, v4, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    const/high16 v4, 0x40000

    invoke-virtual {v1, v4}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    new-instance v4, Ldb/m;

    invoke-direct {v4, v1}, Ldb/m;-><init>(Ldb/x;)V

    iput-object v4, v1, Ldb/x;->y:Ldb/m;

    new-instance v8, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v8}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v8, v1, Ldb/x;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v8, Lu8/m0;

    invoke-direct {v8}, Lu8/m0;-><init>()V

    iput-object v8, v1, Ldb/x;->k0:Lu8/m0;

    new-instance v8, Lu8/n0;

    invoke-direct {v8}, Lu8/n0;-><init>()V

    iput-object v8, v1, Ldb/x;->l0:Lu8/n0;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v8, v1, Ldb/x;->i0:Ljava/lang/StringBuilder;

    move/from16 v30, v9

    new-instance v9, Ljava/util/Formatter;

    move/from16 v31, v6

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v6

    invoke-direct {v9, v8, v6}, Ljava/util/Formatter;-><init>(Ljava/lang/Appendable;Ljava/util/Locale;)V

    iput-object v9, v1, Ldb/x;->j0:Ljava/util/Formatter;

    const/4 v6, 0x0

    new-array v8, v6, [J

    iput-object v8, v1, Ldb/x;->T0:[J

    new-array v8, v6, [Z

    iput-object v8, v1, Ldb/x;->U0:[Z

    new-array v8, v6, [J

    iput-object v8, v1, Ldb/x;->V0:[J

    new-array v8, v6, [Z

    iput-object v8, v1, Ldb/x;->W0:[Z

    new-instance v6, Landroidx/fragment/app/m;

    const/16 v8, 0x15

    invoke-direct {v6, v1, v8}, Landroidx/fragment/app/m;-><init>(Ljava/lang/Object;I)V

    iput-object v6, v1, Ldb/x;->m0:Landroidx/fragment/app/m;

    const v6, 0x7f0a045b

    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    iput-object v6, v1, Ldb/x;->f0:Landroid/widget/TextView;

    const v6, 0x7f0a046f

    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    iput-object v6, v1, Ldb/x;->g0:Landroid/widget/TextView;

    const v6, 0x7f0a047b

    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    iput-object v6, v1, Ldb/x;->W:Landroid/widget/ImageView;

    if-eqz v6, :cond_1

    invoke-virtual {v6, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    const v8, 0x7f0a0461

    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/ImageView;

    iput-object v8, v1, Ldb/x;->a0:Landroid/widget/ImageView;

    new-instance v9, Lb30/k3;

    move-object/from16 v32, v6

    const/4 v6, 0x3

    invoke-direct {v9, v1, v6}, Lb30/k3;-><init>(Ljava/lang/Object;I)V

    if-nez v8, :cond_2

    goto :goto_2

    :cond_2
    const/16 v6, 0x8

    invoke-virtual {v8, v6}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v8, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_2
    const v6, 0x7f0a0466

    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    iput-object v6, v1, Ldb/x;->b0:Landroid/widget/ImageView;

    new-instance v8, Lb30/k3;

    const/4 v9, 0x3

    invoke-direct {v8, v1, v9}, Lb30/k3;-><init>(Ljava/lang/Object;I)V

    if-nez v6, :cond_3

    goto :goto_3

    :cond_3
    const/16 v9, 0x8

    invoke-virtual {v6, v9}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v6, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_3
    const v6, 0x7f0a0476

    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    iput-object v6, v1, Ldb/x;->c0:Landroid/view/View;

    if-eqz v6, :cond_4

    invoke-virtual {v6, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_4
    const v6, 0x7f0a046e

    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    iput-object v6, v1, Ldb/x;->d0:Landroid/view/View;

    if-eqz v6, :cond_5

    invoke-virtual {v6, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_5
    const v6, 0x7f0a0451

    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    iput-object v6, v1, Ldb/x;->e0:Landroid/view/View;

    if-eqz v6, :cond_6

    invoke-virtual {v6, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_6
    const v6, 0x7f0a0471

    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Ldb/r0;

    const v9, 0x7f0a0472

    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    if-eqz v8, :cond_7

    iput-object v8, v1, Ldb/x;->h0:Ldb/r0;

    move/from16 v23, v5

    goto :goto_4

    :cond_7
    if-eqz v9, :cond_8

    new-instance v8, Ldb/f;

    move/from16 v23, v5

    const v5, 0x7f15016f

    invoke-direct {v8, v0, v2, v5}, Ldb/f;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    invoke-virtual {v8, v6}, Landroid/view/View;->setId(I)V

    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    invoke-virtual {v8, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v9}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {v2, v9}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v5

    invoke-virtual {v2, v9}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    invoke-virtual {v2, v8, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    iput-object v8, v1, Ldb/x;->h0:Ldb/r0;

    goto :goto_4

    :cond_8
    move/from16 v23, v5

    const/4 v2, 0x0

    iput-object v2, v1, Ldb/x;->h0:Ldb/r0;

    :goto_4
    iget-object v2, v1, Ldb/x;->h0:Ldb/r0;

    if-eqz v2, :cond_9

    check-cast v2, Ldb/f;

    iget-object v2, v2, Ldb/f;->a0:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v2, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    :cond_9
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iput-object v2, v1, Ldb/x;->x:Landroid/content/res/Resources;

    const v5, 0x7f0a046d

    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ImageView;

    iput-object v5, v1, Ldb/x;->O:Landroid/widget/ImageView;

    if-eqz v5, :cond_a

    invoke-virtual {v5, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_a
    const v5, 0x7f0a0470

    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/ImageView;

    iput-object v5, v1, Ldb/x;->M:Landroid/widget/ImageView;

    if-eqz v5, :cond_b

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    invoke-virtual {v2, v11, v6}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v5, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_b
    const v6, 0x7f0a0467

    invoke-virtual {v1, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/ImageView;

    iput-object v6, v1, Ldb/x;->N:Landroid/widget/ImageView;

    if-eqz v6, :cond_c

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v8

    invoke-virtual {v2, v14, v8}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    invoke-virtual {v6, v8}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v6, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_c
    const v8, 0x7f090006

    invoke-static {v0, v8}, Lu4/k;->b(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object v8

    const v9, 0x7f0a0474

    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/ImageView;

    const v11, 0x7f0a0475

    invoke-virtual {v1, v11}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v11

    check-cast v11, Landroid/widget/TextView;

    if-eqz v9, :cond_d

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v11

    invoke-virtual {v2, v10, v11}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iput-object v9, v1, Ldb/x;->Q:Landroid/view/View;

    const/4 v9, 0x0

    iput-object v9, v1, Ldb/x;->S:Landroid/widget/TextView;

    goto :goto_5

    :cond_d
    const/4 v9, 0x0

    if-eqz v11, :cond_e

    invoke-virtual {v11, v8}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iput-object v11, v1, Ldb/x;->S:Landroid/widget/TextView;

    iput-object v11, v1, Ldb/x;->Q:Landroid/view/View;

    goto :goto_5

    :cond_e
    iput-object v9, v1, Ldb/x;->S:Landroid/widget/TextView;

    iput-object v9, v1, Ldb/x;->Q:Landroid/view/View;

    :goto_5
    iget-object v9, v1, Ldb/x;->Q:Landroid/view/View;

    if-eqz v9, :cond_f

    invoke-virtual {v9, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_f
    const v9, 0x7f0a045f

    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/ImageView;

    const v10, 0x7f0a0460

    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TextView;

    if-eqz v9, :cond_10

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v8

    invoke-virtual {v2, v15, v8}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    invoke-virtual {v9, v8}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iput-object v9, v1, Ldb/x;->P:Landroid/view/View;

    const/4 v9, 0x0

    iput-object v9, v1, Ldb/x;->R:Landroid/widget/TextView;

    goto :goto_6

    :cond_10
    const/4 v9, 0x0

    if-eqz v10, :cond_11

    invoke-virtual {v10, v8}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iput-object v10, v1, Ldb/x;->R:Landroid/widget/TextView;

    iput-object v10, v1, Ldb/x;->P:Landroid/view/View;

    goto :goto_6

    :cond_11
    iput-object v9, v1, Ldb/x;->R:Landroid/widget/TextView;

    iput-object v9, v1, Ldb/x;->P:Landroid/view/View;

    :goto_6
    iget-object v8, v1, Ldb/x;->P:Landroid/view/View;

    if-eqz v8, :cond_12

    invoke-virtual {v8, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_12
    const v8, 0x7f0a0473

    invoke-virtual {v1, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/ImageView;

    iput-object v8, v1, Ldb/x;->T:Landroid/widget/ImageView;

    if-eqz v8, :cond_13

    invoke-virtual {v8, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_13
    const v9, 0x7f0a0478

    invoke-virtual {v1, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    check-cast v9, Landroid/widget/ImageView;

    iput-object v9, v1, Ldb/x;->U:Landroid/widget/ImageView;

    if-eqz v9, :cond_14

    invoke-virtual {v9, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_14
    const v10, 0x7f0b0017

    invoke-virtual {v2, v10}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v10

    int-to-float v10, v10

    const/high16 v11, 0x42c80000    # 100.0f

    div-float/2addr v10, v11

    iput v10, v1, Ldb/x;->x0:F

    const v10, 0x7f0b0016

    invoke-virtual {v2, v10}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v10

    int-to-float v10, v10

    div-float/2addr v10, v11

    iput v10, v1, Ldb/x;->y0:F

    const v10, 0x7f0a0480

    invoke-virtual {v1, v10}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/ImageView;

    iput-object v10, v1, Ldb/x;->V:Landroid/widget/ImageView;

    if-eqz v10, :cond_15

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v11

    invoke-virtual {v2, v7, v11}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-virtual {v10, v7}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    const/4 v7, 0x0

    invoke-virtual {v1, v10, v7}, Ldb/x;->j(Landroid/view/View;Z)V

    :cond_15
    new-instance v7, Ldb/c0;

    invoke-direct {v7, v1}, Ldb/c0;-><init>(Ldb/x;)V

    iput-object v7, v1, Ldb/x;->w:Ldb/c0;

    iput-boolean v3, v7, Ldb/c0;->w:Z

    const v3, 0x7f1404b1

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    const v11, 0x7f080451

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v14

    invoke-virtual {v2, v11, v14}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v11

    const v14, 0x7f1404d2

    invoke-virtual {v2, v14}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v14

    filled-new-array {v3, v14}, [Ljava/lang/String;

    move-result-object v3

    const v14, 0x7f08043d

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v15

    invoke-virtual {v2, v14, v15}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v14

    filled-new-array {v11, v14}, [Landroid/graphics/drawable/Drawable;

    move-result-object v11

    new-instance v14, Ldb/r;

    invoke-direct {v14, v1, v3, v11}, Ldb/r;-><init>(Ldb/x;[Ljava/lang/String;[Landroid/graphics/drawable/Drawable;)V

    iput-object v14, v1, Ldb/x;->F:Ldb/r;

    const v3, 0x7f0700d0

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    iput v3, v1, Ldb/x;->L:I

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    const v11, 0x7f0d017f

    const/4 v15, 0x0

    invoke-virtual {v3, v11, v15}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v3, v1, Ldb/x;->E:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v3, v14}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    new-instance v11, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    const/4 v14, 0x1

    invoke-direct {v11, v14}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(I)V

    invoke-virtual {v3, v11}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/u1;)V

    new-instance v11, Landroid/widget/PopupWindow;

    const/4 v15, -0x2

    invoke-direct {v11, v3, v15, v15, v14}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;IIZ)V

    iput-object v11, v1, Ldb/x;->K:Landroid/widget/PopupWindow;

    sget v3, Lx8/t;->a:I

    const/16 v15, 0x17

    if-ge v3, v15, :cond_16

    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    const/4 v15, 0x0

    invoke-direct {v3, v15}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {v11, v3}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_7

    :cond_16
    const/4 v15, 0x0

    :goto_7
    invoke-virtual {v11, v4}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    iput-boolean v14, v1, Ldb/x;->Y0:Z

    new-instance v3, Ldb/g;

    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const/4 v11, 0x0

    invoke-direct {v3, v4, v11}, Ldb/g;-><init>(Landroid/content/res/Resources;I)V

    iput-object v3, v1, Ldb/x;->J:Ldb/g;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    invoke-virtual {v2, v12, v3}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    iput-object v3, v1, Ldb/x;->B0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    invoke-virtual {v2, v13, v3}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    iput-object v3, v1, Ldb/x;->C0:Landroid/graphics/drawable/Drawable;

    const v3, 0x7f1404a6

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Ldb/x;->D0:Ljava/lang/String;

    const v3, 0x7f1404a5

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Ldb/x;->E0:Ljava/lang/String;

    new-instance v3, Ldb/l;

    const/4 v4, 0x1

    invoke-direct {v3, v1, v4}, Ldb/l;-><init>(Ldb/x;I)V

    iput-object v3, v1, Ldb/x;->H:Ldb/l;

    new-instance v3, Ldb/l;

    const/4 v4, 0x0

    invoke-direct {v3, v1, v4}, Ldb/l;-><init>(Ldb/x;I)V

    iput-object v3, v1, Ldb/x;->I:Ldb/l;

    new-instance v3, Ldb/o;

    const v4, 0x7f030003

    invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v4

    sget-object v11, Ldb/x;->Z0:[F

    const/4 v12, 0x0

    invoke-direct {v3, v1, v4, v11, v12}, Ldb/o;-><init>(Landroid/widget/FrameLayout;[Ljava/lang/String;[FI)V

    iput-object v3, v1, Ldb/x;->G:Ldb/o;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    move/from16 v4, v23

    invoke-virtual {v2, v4, v3}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    iput-object v3, v1, Ldb/x;->n0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    move/from16 v4, v31

    invoke-virtual {v2, v4, v3}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    iput-object v3, v1, Ldb/x;->o0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    move/from16 v14, v30

    invoke-virtual {v2, v14, v3}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    iput-object v3, v1, Ldb/x;->F0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    move/from16 v4, v29

    invoke-virtual {v2, v4, v3}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    iput-object v3, v1, Ldb/x;->G0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    move/from16 v4, v28

    invoke-virtual {v2, v4, v3}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    iput-object v3, v1, Ldb/x;->p0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    move/from16 v4, v27

    invoke-virtual {v2, v4, v3}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    iput-object v3, v1, Ldb/x;->q0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    move/from16 v4, v26

    invoke-virtual {v2, v4, v3}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    iput-object v3, v1, Ldb/x;->r0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    move/from16 v4, v25

    invoke-virtual {v2, v4, v3}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    iput-object v3, v1, Ldb/x;->v0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    move/from16 v3, v24

    invoke-virtual {v2, v3, v0}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, v1, Ldb/x;->w0:Landroid/graphics/drawable/Drawable;

    const v0, 0x7f1404aa

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Ldb/x;->H0:Ljava/lang/String;

    const v0, 0x7f1404a9

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Ldb/x;->I0:Ljava/lang/String;

    const v0, 0x7f1404b4

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Ldb/x;->s0:Ljava/lang/String;

    const v0, 0x7f1404b5

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Ldb/x;->t0:Ljava/lang/String;

    const v0, 0x7f1404b3

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Ldb/x;->u0:Ljava/lang/String;

    const v0, 0x7f1404bb

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Ldb/x;->z0:Ljava/lang/String;

    const v0, 0x7f1404ba

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v1, Ldb/x;->A0:Ljava/lang/String;

    const v0, 0x7f0a0453

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    const/4 v14, 0x1

    invoke-virtual {v7, v0, v14}, Ldb/c0;->j(Landroid/view/View;Z)V

    iget-object v0, v1, Ldb/x;->P:Landroid/view/View;

    move/from16 v2, v22

    invoke-virtual {v7, v0, v2}, Ldb/c0;->j(Landroid/view/View;Z)V

    iget-object v0, v1, Ldb/x;->Q:Landroid/view/View;

    move/from16 v2, v21

    invoke-virtual {v7, v0, v2}, Ldb/c0;->j(Landroid/view/View;Z)V

    move/from16 v0, v20

    invoke-virtual {v7, v5, v0}, Ldb/c0;->j(Landroid/view/View;Z)V

    move/from16 v0, v19

    invoke-virtual {v7, v6, v0}, Ldb/c0;->j(Landroid/view/View;Z)V

    move/from16 v6, v18

    invoke-virtual {v7, v9, v6}, Ldb/c0;->j(Landroid/view/View;Z)V

    move/from16 v0, v17

    move-object/from16 v6, v32

    invoke-virtual {v7, v6, v0}, Ldb/c0;->j(Landroid/view/View;Z)V

    move/from16 v0, v16

    invoke-virtual {v7, v10, v0}, Ldb/c0;->j(Landroid/view/View;Z)V

    iget v0, v1, Ldb/x;->S0:I

    if-eqz v0, :cond_17

    move v4, v14

    goto :goto_8

    :cond_17
    move v4, v15

    :goto_8
    invoke-virtual {v7, v8, v4}, Ldb/c0;->j(Landroid/view/View;Z)V

    new-instance v0, Ldb/k;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ldb/k;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v1, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    return-void
.end method

.method public static synthetic a(Ldb/x;F)V
    .locals 0

    invoke-direct {p0, p1}, Ldb/x;->setPlaybackSpeed(F)V

    return-void
.end method

.method public static b(Lu8/j0;Lu8/n0;)Z
    .locals 8

    check-cast p0, La2/a;

    const/16 v0, 0x11

    invoke-virtual {p0, v0}, La2/a;->A(I)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p0, Lb9/f0;

    invoke-virtual {p0}, Lb9/f0;->c0()Lu8/o0;

    move-result-object p0

    invoke-virtual {p0}, Lu8/o0;->o()I

    move-result v0

    const/4 v2, 0x1

    if-le v0, v2, :cond_4

    const/16 v3, 0x64

    if-le v0, v3, :cond_1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_0
    if-ge v3, v0, :cond_3

    const-wide/16 v4, 0x0

    invoke-virtual {p0, v3, p1, v4, v5}, Lu8/o0;->m(ILu8/n0;J)Lu8/n0;

    move-result-object v4

    iget-wide v4, v4, Lu8/n0;->m:J

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v4, v6

    if-nez v4, :cond_2

    return v1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return v2

    :cond_4
    :goto_1
    return v1
.end method

.method private setPlaybackSpeed(F)V
    .locals 3

    iget-object v0, p0, Ldb/x;->J0:Lu8/j0;

    if-eqz v0, :cond_1

    const/16 v1, 0xd

    check-cast v0, La2/a;

    invoke-virtual {v0, v1}, La2/a;->A(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ldb/x;->J0:Lu8/j0;

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->h0()Lu8/e0;

    move-result-object v1

    new-instance v2, Lu8/e0;

    iget v1, v1, Lu8/e0;->b:F

    invoke-direct {v2, p1, v1}, Lu8/e0;-><init>(FF)V

    invoke-virtual {v0, v2}, Lb9/f0;->A0(Lu8/e0;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final c(Landroid/view/KeyEvent;)Z
    .locals 11

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    iget-object v1, p0, Ldb/x;->J0:Lu8/j0;

    if-eqz v1, :cond_a

    const/16 v2, 0x58

    const/16 v3, 0x57

    const/16 v4, 0x7f

    const/16 v5, 0x7e

    const/16 v6, 0x4f

    const/16 v7, 0x55

    const/16 v8, 0x59

    const/16 v9, 0x5a

    if-eq v0, v9, :cond_0

    if-eq v0, v8, :cond_0

    if-eq v0, v7, :cond_0

    if-eq v0, v6, :cond_0

    if-eq v0, v5, :cond_0

    if-eq v0, v4, :cond_0

    if-eq v0, v3, :cond_0

    if-ne v0, v2, :cond_a

    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v10

    if-nez v10, :cond_9

    if-ne v0, v9, :cond_1

    move-object p1, v1

    check-cast p1, Lb9/f0;

    invoke-virtual {p1}, Lb9/f0;->i0()I

    move-result p1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_9

    check-cast v1, La2/a;

    const/16 p1, 0xc

    invoke-virtual {v1, p1}, La2/a;->A(I)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {v1}, La2/a;->G()V

    goto :goto_0

    :cond_1
    if-ne v0, v8, :cond_2

    move-object v8, v1

    check-cast v8, La2/a;

    const/16 v9, 0xb

    invoke-virtual {v8, v9}, La2/a;->A(I)Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-virtual {v8}, La2/a;->F()V

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result p1

    if-nez p1, :cond_9

    if-eq v0, v6, :cond_7

    if-eq v0, v7, :cond_7

    if-eq v0, v3, :cond_6

    if-eq v0, v2, :cond_5

    if-eq v0, v5, :cond_4

    if-eq v0, v4, :cond_3

    goto :goto_0

    :cond_3
    invoke-static {v1}, Lx8/t;->B(Lu8/j0;)Z

    goto :goto_0

    :cond_4
    invoke-static {v1}, Lx8/t;->C(Lu8/j0;)Z

    goto :goto_0

    :cond_5
    check-cast v1, La2/a;

    const/4 p1, 0x7

    invoke-virtual {v1, p1}, La2/a;->A(I)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {v1}, La2/a;->M()V

    goto :goto_0

    :cond_6
    check-cast v1, La2/a;

    const/16 p1, 0x9

    invoke-virtual {v1, p1}, La2/a;->A(I)Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-virtual {v1}, La2/a;->J()V

    goto :goto_0

    :cond_7
    iget-boolean p1, p0, Ldb/x;->N0:Z

    invoke-static {v1, p1}, Lx8/t;->S(Lu8/j0;Z)Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-static {v1}, Lx8/t;->C(Lu8/j0;)Z

    goto :goto_0

    :cond_8
    invoke-static {v1}, Lx8/t;->B(Lu8/j0;)Z

    :cond_9
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_a
    const/4 p1, 0x0

    return p1
.end method

.method public final d(Landroidx/recyclerview/widget/i1;Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Ldb/x;->E:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    invoke-virtual {p0}, Ldb/x;->q()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Ldb/x;->Y0:Z

    iget-object p1, p0, Ldb/x;->K:Landroid/widget/PopupWindow;

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->dismiss()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ldb/x;->Y0:Z

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getWidth()I

    move-result v1

    sub-int/2addr v0, v1

    iget v1, p0, Ldb/x;->L:I

    sub-int/2addr v0, v1

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getHeight()I

    move-result v2

    neg-int v2, v2

    sub-int/2addr v2, v1

    invoke-virtual {p1, p2, v0, v2}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    invoke-virtual {p0, p1}, Ldb/x;->c(Landroid/view/KeyEvent;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final e(Lu8/v0;I)Lzr/w0;
    .locals 11

    const-string v0, "initialCapacity"

    const/4 v1, 0x4

    invoke-static {v1, v0}, Lzr/q;->c(ILjava/lang/String;)V

    new-array v0, v1, [Ljava/lang/Object;

    iget-object v1, p1, Lu8/v0;->a:Lzr/g0;

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    if-ge v3, v5, :cond_5

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lu8/u0;

    iget-object v6, v5, Lu8/u0;->b:Lu8/p0;

    iget v6, v6, Lu8/p0;->c:I

    if-eq v6, p2, :cond_0

    goto :goto_4

    :cond_0
    move v6, v2

    :goto_1
    iget v7, v5, Lu8/u0;->a:I

    if-ge v6, v7, :cond_4

    invoke-virtual {v5, v6}, Lu8/u0;->a(I)Z

    move-result v7

    if-nez v7, :cond_1

    goto :goto_3

    :cond_1
    iget-object v7, v5, Lu8/u0;->b:Lu8/p0;

    iget-object v7, v7, Lu8/p0;->d:[Lu8/p;

    aget-object v7, v7, v6

    iget v8, v7, Lu8/p;->e:I

    and-int/lit8 v8, v8, 0x2

    if-eqz v8, :cond_2

    goto :goto_3

    :cond_2
    iget-object v8, p0, Ldb/x;->J:Ldb/g;

    invoke-virtual {v8, v7}, Ldb/g;->e(Lu8/p;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ldb/t;

    invoke-direct {v8, p1, v3, v6, v7}, Ldb/t;-><init>(Lu8/v0;IILjava/lang/String;)V

    array-length v7, v0

    add-int/lit8 v9, v4, 0x1

    invoke-static {v7, v9}, Lzr/a0;->e(II)I

    move-result v7

    array-length v10, v0

    if-gt v7, v10, :cond_3

    goto :goto_2

    :cond_3
    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    :goto_2
    aput-object v8, v0, v4

    move v4, v9

    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_4
    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    invoke-static {v4, v0}, Lzr/g0;->j(I[Ljava/lang/Object;)Lzr/w0;

    move-result-object p1

    return-object p1
.end method

.method public final f()V
    .locals 3

    iget-object v0, p0, Ldb/x;->w:Ldb/c0;

    iget v1, v0, Ldb/c0;->t:I

    const/4 v2, 0x3

    if-eq v1, v2, :cond_3

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ldb/c0;->h()V

    iget-boolean v1, v0, Ldb/c0;->w:Z

    if-nez v1, :cond_1

    invoke-virtual {v0, v2}, Ldb/c0;->k(I)V

    return-void

    :cond_1
    iget v1, v0, Ldb/c0;->t:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    iget-object v0, v0, Ldb/c0;->m:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    return-void

    :cond_2
    iget-object v0, v0, Ldb/c0;->n:Landroid/animation/AnimatorSet;

    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    :cond_3
    :goto_0
    return-void
.end method

.method public final g()Z
    .locals 2

    iget-object v0, p0, Ldb/x;->w:Ldb/c0;

    iget v1, v0, Ldb/c0;->t:I

    if-nez v1, :cond_0

    iget-object v0, v0, Ldb/c0;->x:Landroid/widget/FrameLayout;

    check-cast v0, Ldb/x;

    invoke-virtual {v0}, Ldb/x;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getPlayer()Lu8/j0;
    .locals 1

    iget-object v0, p0, Ldb/x;->J0:Lu8/j0;

    return-object v0
.end method

.method public getRepeatToggleModes()I
    .locals 1

    iget v0, p0, Ldb/x;->S0:I

    return v0
.end method

.method public getShowShuffleButton()Z
    .locals 2

    iget-object v0, p0, Ldb/x;->w:Ldb/c0;

    iget-object v1, p0, Ldb/x;->U:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Ldb/c0;->b(Landroid/view/View;)Z

    move-result v0

    return v0
.end method

.method public getShowSubtitleButton()Z
    .locals 2

    iget-object v0, p0, Ldb/x;->w:Ldb/c0;

    iget-object v1, p0, Ldb/x;->W:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Ldb/c0;->b(Landroid/view/View;)Z

    move-result v0

    return v0
.end method

.method public getShowTimeoutMs()I
    .locals 1

    iget v0, p0, Ldb/x;->Q0:I

    return v0
.end method

.method public getShowVrButton()Z
    .locals 2

    iget-object v0, p0, Ldb/x;->w:Ldb/c0;

    iget-object v1, p0, Ldb/x;->V:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Ldb/c0;->b(Landroid/view/View;)Z

    move-result v0

    return v0
.end method

.method public final h()Z
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final i()V
    .locals 0

    invoke-virtual {p0}, Ldb/x;->m()V

    invoke-virtual {p0}, Ldb/x;->l()V

    invoke-virtual {p0}, Ldb/x;->p()V

    invoke-virtual {p0}, Ldb/x;->r()V

    invoke-virtual {p0}, Ldb/x;->t()V

    invoke-virtual {p0}, Ldb/x;->n()V

    invoke-virtual {p0}, Ldb/x;->s()V

    return-void
.end method

.method public final j(Landroid/view/View;Z)V
    .locals 0

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    if-eqz p2, :cond_1

    iget p2, p0, Ldb/x;->x0:F

    goto :goto_0

    :cond_1
    iget p2, p0, Ldb/x;->y0:F

    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public final k(Z)V
    .locals 5

    iget-boolean v0, p0, Ldb/x;->K0:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Ldb/x;->K0:Z

    iget-object v0, p0, Ldb/x;->I0:Ljava/lang/String;

    iget-object v1, p0, Ldb/x;->G0:Landroid/graphics/drawable/Drawable;

    iget-object v2, p0, Ldb/x;->H0:Ljava/lang/String;

    iget-object v3, p0, Ldb/x;->F0:Landroid/graphics/drawable/Drawable;

    iget-object v4, p0, Ldb/x;->a0:Landroid/widget/ImageView;

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {v4, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v4, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v4, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :goto_0
    iget-object v4, p0, Ldb/x;->b0:Landroid/widget/ImageView;

    if-nez v4, :cond_3

    goto :goto_1

    :cond_3
    if-eqz p1, :cond_4

    invoke-virtual {v4, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v4, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_4
    invoke-virtual {v4, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v4, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :goto_1
    return-void
.end method

.method public final l()V
    .locals 12

    invoke-virtual {p0}, Ldb/x;->h()Z

    move-result v0

    if-eqz v0, :cond_9

    iget-boolean v0, p0, Ldb/x;->L0:Z

    if-nez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    iget-object v0, p0, Ldb/x;->J0:Lu8/j0;

    if-eqz v0, :cond_2

    iget-boolean v1, p0, Ldb/x;->M0:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Ldb/x;->l0:Lu8/n0;

    invoke-static {v0, v1}, Ldb/x;->b(Lu8/j0;Lu8/n0;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0xa

    move-object v2, v0

    check-cast v2, La2/a;

    invoke-virtual {v2, v1}, La2/a;->A(I)Z

    move-result v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x5

    move-object v2, v0

    check-cast v2, La2/a;

    invoke-virtual {v2, v1}, La2/a;->A(I)Z

    move-result v1

    :goto_0
    check-cast v0, La2/a;

    const/4 v2, 0x7

    invoke-virtual {v0, v2}, La2/a;->A(I)Z

    move-result v2

    const/16 v3, 0xb

    invoke-virtual {v0, v3}, La2/a;->A(I)Z

    move-result v3

    const/16 v4, 0xc

    invoke-virtual {v0, v4}, La2/a;->A(I)Z

    move-result v4

    const/16 v5, 0x9

    invoke-virtual {v0, v5}, La2/a;->A(I)Z

    move-result v0

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    move v0, v1

    move v2, v0

    move v3, v2

    move v4, v3

    :goto_1
    iget-object v5, p0, Ldb/x;->x:Landroid/content/res/Resources;

    iget-object v6, p0, Ldb/x;->Q:Landroid/view/View;

    const-wide/16 v7, 0x3e8

    if-eqz v3, :cond_5

    iget-object v9, p0, Ldb/x;->J0:Lu8/j0;

    if-eqz v9, :cond_3

    check-cast v9, Lb9/f0;

    invoke-virtual {v9}, Lb9/f0;->L0()V

    iget-wide v9, v9, Lb9/f0;->W:J

    goto :goto_2

    :cond_3
    const-wide/16 v9, 0x1388

    :goto_2
    div-long/2addr v9, v7

    long-to-int v9, v9

    iget-object v10, p0, Ldb/x;->S:Landroid/widget/TextView;

    if-eqz v10, :cond_4

    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    if-eqz v6, :cond_5

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v10

    const v11, 0x7f120006

    invoke-virtual {v5, v11, v9, v10}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v6, v9}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_5
    iget-object v9, p0, Ldb/x;->P:Landroid/view/View;

    if-eqz v4, :cond_8

    iget-object v10, p0, Ldb/x;->J0:Lu8/j0;

    if-eqz v10, :cond_6

    check-cast v10, Lb9/f0;

    invoke-virtual {v10}, Lb9/f0;->L0()V

    iget-wide v10, v10, Lb9/f0;->X:J

    goto :goto_3

    :cond_6
    const-wide/16 v10, 0x3a98

    :goto_3
    div-long/2addr v10, v7

    long-to-int v7, v10

    iget-object v8, p0, Ldb/x;->R:Landroid/widget/TextView;

    if-eqz v8, :cond_7

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_7
    if-eqz v9, :cond_8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    const v10, 0x7f120005

    invoke-virtual {v5, v10, v7, v8}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v9, v5}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_8
    iget-object v5, p0, Ldb/x;->M:Landroid/widget/ImageView;

    invoke-virtual {p0, v5, v2}, Ldb/x;->j(Landroid/view/View;Z)V

    invoke-virtual {p0, v6, v3}, Ldb/x;->j(Landroid/view/View;Z)V

    invoke-virtual {p0, v9, v4}, Ldb/x;->j(Landroid/view/View;Z)V

    iget-object v2, p0, Ldb/x;->N:Landroid/widget/ImageView;

    invoke-virtual {p0, v2, v0}, Ldb/x;->j(Landroid/view/View;Z)V

    iget-object v0, p0, Ldb/x;->h0:Ldb/r0;

    if-eqz v0, :cond_9

    check-cast v0, Ldb/f;

    invoke-virtual {v0, v1}, Ldb/f;->setEnabled(Z)V

    :cond_9
    :goto_4
    return-void
.end method

.method public final m()V
    .locals 5

    invoke-virtual {p0}, Ldb/x;->h()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Ldb/x;->L0:Z

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    iget-object v0, p0, Ldb/x;->O:Landroid/widget/ImageView;

    if-eqz v0, :cond_5

    iget-object v1, p0, Ldb/x;->J0:Lu8/j0;

    iget-boolean v2, p0, Ldb/x;->N0:Z

    invoke-static {v1, v2}, Lx8/t;->S(Lu8/j0;Z)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v2, p0, Ldb/x;->n0:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    :cond_1
    iget-object v2, p0, Ldb/x;->o0:Landroid/graphics/drawable/Drawable;

    :goto_0
    if-eqz v1, :cond_2

    const v1, 0x7f1404b0

    goto :goto_1

    :cond_2
    const v1, 0x7f1404af

    :goto_1
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v2, p0, Ldb/x;->x:Landroid/content/res/Resources;

    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Ldb/x;->J0:Lu8/j0;

    if-eqz v1, :cond_3

    move-object v2, v1

    check-cast v2, La2/a;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, La2/a;->A(I)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x11

    invoke-virtual {v2, v4}, La2/a;->A(I)Z

    move-result v2

    if-eqz v2, :cond_4

    check-cast v1, Lb9/f0;

    invoke-virtual {v1}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v1

    invoke-virtual {v1}, Lu8/o0;->p()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    const/4 v3, 0x0

    :cond_4
    :goto_2
    invoke-virtual {p0, v0, v3}, Ldb/x;->j(Landroid/view/View;Z)V

    :cond_5
    :goto_3
    return-void
.end method

.method public final n()V
    .locals 8

    iget-object v0, p0, Ldb/x;->J0:Lu8/j0;

    if-nez v0, :cond_0

    return-void

    :cond_0
    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->h0()Lu8/e0;

    move-result-object v0

    iget v0, v0, Lu8/e0;->a:F

    const/4 v1, 0x0

    const v2, 0x7f7fffff    # Float.MAX_VALUE

    move v3, v1

    move v4, v3

    :goto_0
    iget-object v5, p0, Ldb/x;->G:Ldb/o;

    iget-object v6, v5, Ldb/o;->c:[F

    array-length v7, v6

    if-ge v3, v7, :cond_2

    aget v5, v6, v3

    sub-float v5, v0, v5

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    cmpg-float v6, v5, v2

    if-gez v6, :cond_1

    move v4, v3

    move v2, v5

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    iput v4, v5, Ldb/o;->d:I

    iget-object v0, v5, Ldb/o;->b:[Ljava/lang/String;

    aget-object v0, v0, v4

    iget-object v2, p0, Ldb/x;->F:Ldb/r;

    iget-object v3, v2, Ldb/r;->c:[Ljava/lang/String;

    aput-object v0, v3, v1

    const/4 v0, 0x1

    invoke-virtual {v2, v0}, Ldb/r;->a(I)Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {v2, v1}, Ldb/r;->a(I)Z

    move-result v2

    if-eqz v2, :cond_4

    :cond_3
    move v1, v0

    :cond_4
    iget-object v0, p0, Ldb/x;->c0:Landroid/view/View;

    invoke-virtual {p0, v0, v1}, Ldb/x;->j(Landroid/view/View;Z)V

    return-void
.end method

.method public final o()V
    .locals 15

    invoke-virtual {p0}, Ldb/x;->h()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-boolean v0, p0, Ldb/x;->L0:Z

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v0, p0, Ldb/x;->J0:Lu8/j0;

    if-eqz v0, :cond_1

    const/16 v1, 0x10

    move-object v2, v0

    check-cast v2, La2/a;

    invoke-virtual {v2, v1}, La2/a;->A(I)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-wide v1, p0, Ldb/x;->X0:J

    move-object v3, v0

    check-cast v3, Lb9/f0;

    invoke-virtual {v3}, Lb9/f0;->L0()V

    iget-object v4, v3, Lb9/f0;->I0:Lb9/c1;

    invoke-virtual {v3, v4}, Lb9/f0;->W(Lb9/c1;)J

    move-result-wide v4

    add-long/2addr v4, v1

    iget-wide v1, p0, Ldb/x;->X0:J

    invoke-virtual {v3}, Lb9/f0;->V()J

    move-result-wide v6

    add-long/2addr v6, v1

    goto :goto_0

    :cond_1
    const-wide/16 v4, 0x0

    move-wide v6, v4

    :goto_0
    iget-object v1, p0, Ldb/x;->g0:Landroid/widget/TextView;

    if-eqz v1, :cond_2

    iget-boolean v2, p0, Ldb/x;->P0:Z

    if-nez v2, :cond_2

    iget-object v2, p0, Ldb/x;->i0:Ljava/lang/StringBuilder;

    iget-object v3, p0, Ldb/x;->j0:Ljava/util/Formatter;

    invoke-static {v2, v3, v4, v5}, Lx8/t;->y(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    iget-object v1, p0, Ldb/x;->h0:Ldb/r0;

    if-eqz v1, :cond_3

    move-object v2, v1

    check-cast v2, Ldb/f;

    invoke-virtual {v2, v4, v5}, Ldb/f;->setPosition(J)V

    invoke-virtual {v2, v6, v7}, Ldb/f;->setBufferedPosition(J)V

    :cond_3
    iget-object v2, p0, Ldb/x;->m0:Landroidx/fragment/app/m;

    invoke-virtual {p0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    const/4 v3, 0x1

    if-nez v0, :cond_4

    move v6, v3

    goto :goto_1

    :cond_4
    move-object v6, v0

    check-cast v6, Lb9/f0;

    invoke-virtual {v6}, Lb9/f0;->i0()I

    move-result v6

    :goto_1
    const-wide/16 v7, 0x3e8

    if-eqz v0, :cond_7

    move-object v9, v0

    check-cast v9, La2/a;

    check-cast v9, Lb9/f0;

    invoke-virtual {v9}, Lb9/f0;->i0()I

    move-result v10

    const/4 v11, 0x3

    if-ne v10, v11, :cond_7

    invoke-virtual {v9}, Lb9/f0;->g0()Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-virtual {v9}, Lb9/f0;->L0()V

    iget-object v9, v9, Lb9/f0;->I0:Lb9/c1;

    iget v9, v9, Lb9/c1;->n:I

    if-nez v9, :cond_7

    if-eqz v1, :cond_5

    check-cast v1, Ldb/f;

    invoke-virtual {v1}, Ldb/f;->getPreferredUpdateDelay()J

    move-result-wide v9

    goto :goto_2

    :cond_5
    move-wide v9, v7

    :goto_2
    rem-long/2addr v4, v7

    sub-long v3, v7, v4

    invoke-static {v9, v10, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->h0()Lu8/e0;

    move-result-object v0

    iget v0, v0, Lu8/e0;->a:F

    const/4 v1, 0x0

    cmpl-float v1, v0, v1

    if-lez v1, :cond_6

    long-to-float v1, v3

    div-float/2addr v1, v0

    float-to-long v7, v1

    :cond_6
    move-wide v9, v7

    iget v0, p0, Ldb/x;->R0:I

    int-to-long v11, v0

    const-wide/16 v13, 0x3e8

    invoke-static/range {v9 .. v14}, Lx8/t;->h(JJJ)J

    move-result-wide v0

    invoke-virtual {p0, v2, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_7
    const/4 v0, 0x4

    if-eq v6, v0, :cond_8

    if-eq v6, v3, :cond_8

    invoke-virtual {p0, v2, v7, v8}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_8
    :goto_3
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 3

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    iget-object v0, p0, Ldb/x;->w:Ldb/c0;

    iget-object v1, v0, Ldb/c0;->x:Landroid/widget/FrameLayout;

    check-cast v1, Ldb/x;

    iget-object v2, v0, Ldb/c0;->D:Landroid/view/View$OnLayoutChangeListener;

    check-cast v2, Ldb/k;

    invoke-virtual {v1, v2}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Ldb/x;->L0:Z

    invoke-virtual {p0}, Ldb/x;->g()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ldb/c0;->i()V

    :cond_0
    invoke-virtual {p0}, Ldb/x;->i()V

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 3

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Ldb/x;->w:Ldb/c0;

    iget-object v1, v0, Ldb/c0;->x:Landroid/widget/FrameLayout;

    check-cast v1, Ldb/x;

    iget-object v2, v0, Ldb/c0;->D:Landroid/view/View$OnLayoutChangeListener;

    check-cast v2, Ldb/k;

    invoke-virtual {v1, v2}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    const/4 v1, 0x0

    iput-boolean v1, p0, Ldb/x;->L0:Z

    iget-object v1, p0, Ldb/x;->m0:Landroidx/fragment/app/m;

    invoke-virtual {p0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    invoke-virtual {v0}, Ldb/c0;->h()V

    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 1

    invoke-super/range {p0 .. p5}, Landroid/widget/FrameLayout;->onLayout(ZIIII)V

    move-object p1, p0

    iget-object v0, p1, Ldb/x;->w:Ldb/c0;

    iget-object v0, v0, Ldb/c0;->b:Landroid/view/View;

    if-eqz v0, :cond_0

    sub-int/2addr p4, p2

    sub-int/2addr p5, p3

    const/4 p2, 0x0

    invoke-virtual {v0, p2, p2, p4, p5}, Landroid/view/View;->layout(IIII)V

    :cond_0
    return-void
.end method

.method public final p()V
    .locals 7

    invoke-virtual {p0}, Ldb/x;->h()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-boolean v0, p0, Ldb/x;->L0:Z

    if-eqz v0, :cond_7

    iget-object v0, p0, Ldb/x;->T:Landroid/widget/ImageView;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget v1, p0, Ldb/x;->S0:I

    const/4 v2, 0x0

    if-nez v1, :cond_1

    invoke-virtual {p0, v0, v2}, Ldb/x;->j(Landroid/view/View;Z)V

    return-void

    :cond_1
    iget-object v1, p0, Ldb/x;->J0:Lu8/j0;

    iget-object v3, p0, Ldb/x;->s0:Ljava/lang/String;

    iget-object v4, p0, Ldb/x;->p0:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_6

    const/16 v5, 0xf

    move-object v6, v1

    check-cast v6, La2/a;

    invoke-virtual {v6, v5}, La2/a;->A(I)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    const/4 v2, 0x1

    invoke-virtual {p0, v0, v2}, Ldb/x;->j(Landroid/view/View;Z)V

    check-cast v1, Lb9/f0;

    invoke-virtual {v1}, Lb9/f0;->L0()V

    iget v1, v1, Lb9/f0;->h0:I

    if-eqz v1, :cond_5

    if-eq v1, v2, :cond_4

    const/4 v2, 0x2

    if-eq v1, v2, :cond_3

    goto :goto_1

    :cond_3
    iget-object v1, p0, Ldb/x;->r0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, p0, Ldb/x;->u0:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    :cond_4
    iget-object v1, p0, Ldb/x;->q0:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, p0, Ldb/x;->t0:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    :cond_5
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    :cond_6
    :goto_0
    invoke-virtual {p0, v0, v2}, Ldb/x;->j(Landroid/view/View;Z)V

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_7
    :goto_1
    return-void
.end method

.method public final q()V
    .locals 4

    const/4 v0, 0x0

    iget-object v1, p0, Ldb/x;->E:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, v0, v0}, Landroid/view/View;->measure(II)V

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    iget v2, p0, Ldb/x;->L:I

    mul-int/lit8 v3, v2, 0x2

    sub-int/2addr v0, v3

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v3, p0, Ldb/x;->K:Landroid/widget/PopupWindow;

    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setWidth(I)V

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    mul-int/lit8 v2, v2, 0x2

    sub-int/2addr v0, v2

    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {v3, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    return-void
.end method

.method public final r()V
    .locals 7

    invoke-virtual {p0}, Ldb/x;->h()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-boolean v0, p0, Ldb/x;->L0:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Ldb/x;->U:Landroid/widget/ImageView;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Ldb/x;->J0:Lu8/j0;

    iget-object v2, p0, Ldb/x;->w:Ldb/c0;

    invoke-virtual {v2, v0}, Ldb/c0;->b(Landroid/view/View;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    invoke-virtual {p0, v0, v3}, Ldb/x;->j(Landroid/view/View;Z)V

    return-void

    :cond_1
    iget-object v2, p0, Ldb/x;->A0:Ljava/lang/String;

    iget-object v4, p0, Ldb/x;->w0:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_5

    const/16 v5, 0xe

    move-object v6, v1

    check-cast v6, La2/a;

    invoke-virtual {v6, v5}, La2/a;->A(I)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    const/4 v3, 0x1

    invoke-virtual {p0, v0, v3}, Ldb/x;->j(Landroid/view/View;Z)V

    check-cast v1, Lb9/f0;

    invoke-virtual {v1}, Lb9/f0;->L0()V

    iget-boolean v3, v1, Lb9/f0;->i0:Z

    if-eqz v3, :cond_3

    iget-object v4, p0, Ldb/x;->v0:Landroid/graphics/drawable/Drawable;

    :cond_3
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v1}, Lb9/f0;->L0()V

    iget-boolean v1, v1, Lb9/f0;->i0:Z

    if-eqz v1, :cond_4

    iget-object v2, p0, Ldb/x;->z0:Ljava/lang/String;

    :cond_4
    invoke-virtual {v0, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void

    :cond_5
    :goto_0
    invoke-virtual {p0, v0, v3}, Ldb/x;->j(Landroid/view/View;Z)V

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_6
    :goto_1
    return-void
.end method

.method public final s()V
    .locals 23

    move-object/from16 v0, p0

    iget-object v1, v0, Ldb/x;->J0:Lu8/j0;

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-boolean v2, v0, Ldb/x;->M0:Z

    iget-object v3, v0, Ldb/x;->l0:Lu8/n0;

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_1

    invoke-static {v1, v3}, Ldb/x;->b(Lu8/j0;Lu8/n0;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v5

    goto :goto_0

    :cond_1
    move v2, v4

    :goto_0
    iput-boolean v2, v0, Ldb/x;->O0:Z

    const-wide/16 v6, 0x0

    iput-wide v6, v0, Ldb/x;->X0:J

    move-object v2, v1

    check-cast v2, La2/a;

    const/16 v8, 0x11

    invoke-virtual {v2, v8}, La2/a;->A(I)Z

    move-result v8

    if-eqz v8, :cond_2

    move-object v8, v1

    check-cast v8, Lb9/f0;

    invoke-virtual {v8}, Lb9/f0;->c0()Lu8/o0;

    move-result-object v8

    goto :goto_1

    :cond_2
    sget-object v8, Lu8/o0;->a:Lu8/l0;

    :goto_1
    invoke-virtual {v8}, Lu8/o0;->p()Z

    move-result v9

    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v9, :cond_11

    check-cast v1, Lb9/f0;

    invoke-virtual {v1}, Lb9/f0;->Z()I

    move-result v1

    iget-boolean v2, v0, Ldb/x;->O0:Z

    if-eqz v2, :cond_3

    move v9, v4

    goto :goto_2

    :cond_3
    move v9, v1

    :goto_2
    if-eqz v2, :cond_4

    invoke-virtual {v8}, Lu8/o0;->o()I

    move-result v2

    sub-int/2addr v2, v5

    goto :goto_3

    :cond_4
    move v2, v1

    :goto_3
    move v14, v4

    move-wide v12, v6

    :goto_4
    if-gt v9, v2, :cond_6

    move-wide v15, v6

    if-ne v9, v1, :cond_5

    invoke-static {v12, v13}, Lx8/t;->U(J)J

    move-result-wide v6

    iput-wide v6, v0, Ldb/x;->X0:J

    :cond_5
    invoke-virtual {v8, v9, v3}, Lu8/o0;->n(ILu8/n0;)V

    iget-wide v6, v3, Lu8/n0;->m:J

    cmp-long v6, v6, v10

    if-nez v6, :cond_7

    iget-boolean v1, v0, Ldb/x;->O0:Z

    xor-int/2addr v1, v5

    invoke-static {v1}, Lva3/g;->i(Z)V

    :cond_6
    move v4, v5

    goto/16 :goto_c

    :cond_7
    iget v6, v3, Lu8/n0;->n:I

    :goto_5
    iget v7, v3, Lu8/n0;->o:I

    if-gt v6, v7, :cond_10

    iget-object v7, v0, Ldb/x;->k0:Lu8/m0;

    invoke-virtual {v8, v6, v7, v4}, Lu8/o0;->f(ILu8/m0;Z)Lu8/m0;

    move-wide/from16 v17, v10

    iget-object v10, v7, Lu8/m0;->g:Lu8/b;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v10, v10, Lu8/b;->a:I

    move v11, v4

    :goto_6
    if-ge v11, v10, :cond_f

    invoke-virtual {v7, v11}, Lu8/m0;->d(I)J

    iget-wide v4, v7, Lu8/m0;->e:J

    cmp-long v20, v4, v15

    if-ltz v20, :cond_e

    iget-object v15, v0, Ldb/x;->T0:[J

    move/from16 v16, v1

    array-length v1, v15

    if-ne v14, v1, :cond_9

    array-length v1, v15

    if-nez v1, :cond_8

    const/4 v1, 0x1

    goto :goto_7

    :cond_8
    array-length v1, v15

    mul-int/lit8 v1, v1, 0x2

    :goto_7
    invoke-static {v15, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v15

    iput-object v15, v0, Ldb/x;->T0:[J

    iget-object v15, v0, Ldb/x;->U0:[Z

    invoke-static {v15, v1}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object v1

    iput-object v1, v0, Ldb/x;->U0:[Z

    :cond_9
    iget-object v1, v0, Ldb/x;->T0:[J

    add-long/2addr v4, v12

    invoke-static {v4, v5}, Lx8/t;->U(J)J

    move-result-wide v4

    aput-wide v4, v1, v14

    iget-object v1, v0, Ldb/x;->U0:[Z

    iget-object v4, v7, Lu8/m0;->g:Lu8/b;

    invoke-virtual {v4, v11}, Lu8/b;->a(I)Lu8/a;

    move-result-object v4

    iget v5, v4, Lu8/a;->a:I

    const/4 v15, -0x1

    if-ne v5, v15, :cond_a

    move-object/from16 v21, v1

    const/4 v4, 0x1

    const/16 v19, 0x1

    goto :goto_a

    :cond_a
    const/4 v15, 0x0

    :goto_8
    if-ge v15, v5, :cond_d

    move-object/from16 v21, v1

    iget-object v1, v4, Lu8/a;->e:[I

    aget v1, v1, v15

    if-eqz v1, :cond_c

    move-object/from16 v22, v4

    const/4 v4, 0x1

    if-ne v1, v4, :cond_b

    goto :goto_9

    :cond_b
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v1, v21

    move-object/from16 v4, v22

    goto :goto_8

    :cond_c
    const/4 v4, 0x1

    :goto_9
    move/from16 v19, v4

    goto :goto_a

    :cond_d
    move-object/from16 v21, v1

    const/4 v4, 0x1

    const/16 v19, 0x0

    :goto_a
    xor-int/lit8 v1, v19, 0x1

    aput-boolean v1, v21, v14

    add-int/lit8 v14, v14, 0x1

    goto :goto_b

    :cond_e
    move/from16 v16, v1

    const/4 v4, 0x1

    :goto_b
    add-int/lit8 v11, v11, 0x1

    move v5, v4

    move/from16 v1, v16

    const/4 v4, 0x0

    const-wide/16 v15, 0x0

    goto :goto_6

    :cond_f
    move/from16 v16, v1

    move v4, v5

    add-int/lit8 v6, v6, 0x1

    move-wide/from16 v10, v17

    const/4 v4, 0x0

    const-wide/16 v15, 0x0

    goto/16 :goto_5

    :cond_10
    move/from16 v16, v1

    move v4, v5

    move-wide/from16 v17, v10

    iget-wide v5, v3, Lu8/n0;->m:J

    add-long/2addr v12, v5

    add-int/lit8 v9, v9, 0x1

    move v5, v4

    const/4 v4, 0x0

    const-wide/16 v6, 0x0

    goto/16 :goto_4

    :goto_c
    move-wide v6, v12

    goto :goto_e

    :cond_11
    move v4, v5

    move-wide/from16 v17, v10

    const/16 v1, 0x10

    invoke-virtual {v2, v1}, La2/a;->A(I)Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-virtual {v2}, La2/a;->x()J

    move-result-wide v1

    cmp-long v3, v1, v17

    if-eqz v3, :cond_12

    invoke-static {v1, v2}, Lx8/t;->J(J)J

    move-result-wide v6

    :goto_d
    const/4 v14, 0x0

    goto :goto_e

    :cond_12
    const-wide/16 v6, 0x0

    goto :goto_d

    :goto_e
    invoke-static {v6, v7}, Lx8/t;->U(J)J

    move-result-wide v1

    iget-object v3, v0, Ldb/x;->f0:Landroid/widget/TextView;

    if-eqz v3, :cond_13

    iget-object v5, v0, Ldb/x;->i0:Ljava/lang/StringBuilder;

    iget-object v6, v0, Ldb/x;->j0:Ljava/util/Formatter;

    invoke-static {v5, v6, v1, v2}, Lx8/t;->y(Ljava/lang/StringBuilder;Ljava/util/Formatter;J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_13
    iget-object v3, v0, Ldb/x;->h0:Ldb/r0;

    if-eqz v3, :cond_17

    check-cast v3, Ldb/f;

    invoke-virtual {v3, v1, v2}, Ldb/f;->setDuration(J)V

    iget-object v1, v0, Ldb/x;->V0:[J

    array-length v2, v1

    add-int v5, v14, v2

    iget-object v6, v0, Ldb/x;->T0:[J

    array-length v7, v6

    if-le v5, v7, :cond_14

    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v6

    iput-object v6, v0, Ldb/x;->T0:[J

    iget-object v6, v0, Ldb/x;->U0:[Z

    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([ZI)[Z

    move-result-object v6

    iput-object v6, v0, Ldb/x;->U0:[Z

    :cond_14
    iget-object v6, v0, Ldb/x;->T0:[J

    const/4 v7, 0x0

    invoke-static {v1, v7, v6, v14, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, v0, Ldb/x;->W0:[Z

    iget-object v6, v0, Ldb/x;->U0:[Z

    invoke-static {v1, v7, v6, v14, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v1, v0, Ldb/x;->T0:[J

    iget-object v2, v0, Ldb/x;->U0:[Z

    if-eqz v5, :cond_16

    if-eqz v1, :cond_15

    if-eqz v2, :cond_15

    goto :goto_f

    :cond_15
    move v4, v7

    :cond_16
    :goto_f
    invoke-static {v4}, Lva3/g;->d(Z)V

    iput v5, v3, Ldb/f;->p0:I

    iput-object v1, v3, Ldb/f;->q0:[J

    iput-object v2, v3, Ldb/f;->r0:[Z

    invoke-virtual {v3}, Ldb/f;->e()V

    :cond_17
    invoke-virtual {v0}, Ldb/x;->o()V

    return-void
.end method

.method public setAnimationEnabled(Z)V
    .locals 1

    iget-object v0, p0, Ldb/x;->w:Ldb/c0;

    iput-boolean p1, v0, Ldb/c0;->w:Z

    return-void
.end method

.method public setOnFullScreenModeChangedListener(Ldb/n;)V
    .locals 5
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    const/16 v3, 0x8

    iget-object v4, p0, Ldb/x;->a0:Landroid/widget/ImageView;

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    if-eqz v2, :cond_2

    invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_2
    invoke-virtual {v4, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    move v1, v0

    :goto_2
    iget-object p1, p0, Ldb/x;->b0:Landroid/widget/ImageView;

    if-nez p1, :cond_4

    return-void

    :cond_4
    if-eqz v1, :cond_5

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_5
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public setPlayer(Lu8/j0;)V
    .locals 4

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Lva3/g;->i(Z)V

    if-eqz p1, :cond_1

    move-object v0, p1

    check-cast v0, Lb9/f0;

    iget-object v0, v0, Lb9/f0;->U:Landroid/os/Looper;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_2

    :cond_1
    move v2, v3

    :cond_2
    invoke-static {v2}, Lva3/g;->d(Z)V

    iget-object v0, p0, Ldb/x;->J0:Lu8/j0;

    if-ne v0, p1, :cond_3

    return-void

    :cond_3
    iget-object v1, p0, Ldb/x;->y:Ldb/m;

    if-eqz v0, :cond_4

    check-cast v0, Lb9/f0;

    invoke-virtual {v0, v1}, Lb9/f0;->s0(Lu8/h0;)V

    :cond_4
    iput-object p1, p0, Ldb/x;->J0:Lu8/j0;

    if-eqz p1, :cond_5

    check-cast p1, Lb9/f0;

    invoke-virtual {p1, v1}, Lb9/f0;->Q(Lu8/h0;)V

    :cond_5
    invoke-virtual {p0}, Ldb/x;->i()V

    return-void
.end method

.method public setProgressUpdateListener(Ldb/p;)V
    .locals 0

    return-void
.end method

.method public setRepeatToggleModes(I)V
    .locals 4

    iput p1, p0, Ldb/x;->S0:I

    iget-object v0, p0, Ldb/x;->J0:Lu8/j0;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    const/16 v3, 0xf

    check-cast v0, La2/a;

    invoke-virtual {v0, v3}, La2/a;->A(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ldb/x;->J0:Lu8/j0;

    check-cast v0, Lb9/f0;

    invoke-virtual {v0}, Lb9/f0;->L0()V

    iget v0, v0, Lb9/f0;->h0:I

    if-nez p1, :cond_0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldb/x;->J0:Lu8/j0;

    check-cast v0, Lb9/f0;

    invoke-virtual {v0, v1}, Lb9/f0;->B0(I)V

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    if-ne p1, v2, :cond_1

    if-ne v0, v3, :cond_1

    iget-object v0, p0, Ldb/x;->J0:Lu8/j0;

    check-cast v0, Lb9/f0;

    invoke-virtual {v0, v2}, Lb9/f0;->B0(I)V

    goto :goto_0

    :cond_1
    if-ne p1, v3, :cond_2

    if-ne v0, v2, :cond_2

    iget-object v0, p0, Ldb/x;->J0:Lu8/j0;

    check-cast v0, Lb9/f0;

    invoke-virtual {v0, v3}, Lb9/f0;->B0(I)V

    :cond_2
    :goto_0
    if-eqz p1, :cond_3

    move v1, v2

    :cond_3
    iget-object p1, p0, Ldb/x;->w:Ldb/c0;

    iget-object v0, p0, Ldb/x;->T:Landroid/widget/ImageView;

    invoke-virtual {p1, v0, v1}, Ldb/c0;->j(Landroid/view/View;Z)V

    invoke-virtual {p0}, Ldb/x;->p()V

    return-void
.end method

.method public setShowFastForwardButton(Z)V
    .locals 2

    iget-object v0, p0, Ldb/x;->w:Ldb/c0;

    iget-object v1, p0, Ldb/x;->P:Landroid/view/View;

    invoke-virtual {v0, v1, p1}, Ldb/c0;->j(Landroid/view/View;Z)V

    invoke-virtual {p0}, Ldb/x;->l()V

    return-void
.end method

.method public setShowMultiWindowTimeBar(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iput-boolean p1, p0, Ldb/x;->M0:Z

    invoke-virtual {p0}, Ldb/x;->s()V

    return-void
.end method

.method public setShowNextButton(Z)V
    .locals 2

    iget-object v0, p0, Ldb/x;->w:Ldb/c0;

    iget-object v1, p0, Ldb/x;->N:Landroid/widget/ImageView;

    invoke-virtual {v0, v1, p1}, Ldb/c0;->j(Landroid/view/View;Z)V

    invoke-virtual {p0}, Ldb/x;->l()V

    return-void
.end method

.method public setShowPlayButtonIfPlaybackIsSuppressed(Z)V
    .locals 0

    iput-boolean p1, p0, Ldb/x;->N0:Z

    invoke-virtual {p0}, Ldb/x;->m()V

    return-void
.end method

.method public setShowPreviousButton(Z)V
    .locals 2

    iget-object v0, p0, Ldb/x;->w:Ldb/c0;

    iget-object v1, p0, Ldb/x;->M:Landroid/widget/ImageView;

    invoke-virtual {v0, v1, p1}, Ldb/c0;->j(Landroid/view/View;Z)V

    invoke-virtual {p0}, Ldb/x;->l()V

    return-void
.end method

.method public setShowRewindButton(Z)V
    .locals 2

    iget-object v0, p0, Ldb/x;->w:Ldb/c0;

    iget-object v1, p0, Ldb/x;->Q:Landroid/view/View;

    invoke-virtual {v0, v1, p1}, Ldb/c0;->j(Landroid/view/View;Z)V

    invoke-virtual {p0}, Ldb/x;->l()V

    return-void
.end method

.method public setShowShuffleButton(Z)V
    .locals 2

    iget-object v0, p0, Ldb/x;->w:Ldb/c0;

    iget-object v1, p0, Ldb/x;->U:Landroid/widget/ImageView;

    invoke-virtual {v0, v1, p1}, Ldb/c0;->j(Landroid/view/View;Z)V

    invoke-virtual {p0}, Ldb/x;->r()V

    return-void
.end method

.method public setShowSubtitleButton(Z)V
    .locals 2

    iget-object v0, p0, Ldb/x;->w:Ldb/c0;

    iget-object v1, p0, Ldb/x;->W:Landroid/widget/ImageView;

    invoke-virtual {v0, v1, p1}, Ldb/c0;->j(Landroid/view/View;Z)V

    return-void
.end method

.method public setShowTimeoutMs(I)V
    .locals 0

    iput p1, p0, Ldb/x;->Q0:I

    invoke-virtual {p0}, Ldb/x;->g()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ldb/x;->w:Ldb/c0;

    invoke-virtual {p1}, Ldb/c0;->i()V

    :cond_0
    return-void
.end method

.method public setShowVrButton(Z)V
    .locals 2

    iget-object v0, p0, Ldb/x;->w:Ldb/c0;

    iget-object v1, p0, Ldb/x;->V:Landroid/widget/ImageView;

    invoke-virtual {v0, v1, p1}, Ldb/c0;->j(Landroid/view/View;Z)V

    return-void
.end method

.method public setTimeBarMinUpdateInterval(I)V
    .locals 2

    const/16 v0, 0x10

    const/16 v1, 0x3e8

    invoke-static {p1, v0, v1}, Lx8/t;->g(III)I

    move-result p1

    iput p1, p0, Ldb/x;->R0:I

    return-void
.end method

.method public setVrButtonListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    iget-object v0, p0, Ldb/x;->V:Landroid/widget/ImageView;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, v0, p1}, Ldb/x;->j(Landroid/view/View;Z)V

    :cond_1
    return-void
.end method

.method public final t()V
    .locals 11

    iget-object v0, p0, Ldb/x;->H:Ldb/l;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, v0, Ldb/v;->b:Ljava/util/List;

    iget-object v2, p0, Ldb/x;->I:Ldb/l;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v1, v2, Ldb/v;->b:Ljava/util/List;

    iget-object v1, p0, Ldb/x;->J0:Lu8/j0;

    iget-object v3, p0, Ldb/x;->W:Landroid/widget/ImageView;

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v1, :cond_6

    const/16 v6, 0x1e

    check-cast v1, La2/a;

    invoke-virtual {v1, v6}, La2/a;->A(I)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Ldb/x;->J0:Lu8/j0;

    const/16 v6, 0x1d

    check-cast v1, La2/a;

    invoke-virtual {v1, v6}, La2/a;->A(I)Z

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v1, p0, Ldb/x;->J0:Lu8/j0;

    check-cast v1, Lb9/f0;

    invoke-virtual {v1}, Lb9/f0;->d0()Lu8/v0;

    move-result-object v1

    invoke-virtual {p0, v1, v5}, Ldb/x;->e(Lu8/v0;I)Lzr/w0;

    move-result-object v6

    iput-object v6, v2, Ldb/v;->b:Ljava/util/List;

    iget-object v7, v2, Ldb/l;->e:Ldb/x;

    iget-object v8, v7, Ldb/x;->J0:Lu8/j0;

    iget-object v9, v7, Ldb/x;->F:Ldb/r;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v8, Lb9/f0;

    invoke-virtual {v8}, Lb9/f0;->k0()Lo9/j;

    move-result-object v8

    invoke-virtual {v6}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-virtual {v7}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v6, 0x7f1404d1

    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v6, v9, Ldb/r;->c:[Ljava/lang/String;

    aput-object v2, v6, v5

    goto :goto_1

    :cond_1
    invoke-virtual {v2, v8}, Ldb/l;->f(Lo9/j;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v7}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v6, 0x7f1404d0

    invoke-virtual {v2, v6}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget-object v6, v9, Ldb/r;->c:[Ljava/lang/String;

    aput-object v2, v6, v5

    goto :goto_1

    :cond_2
    move v2, v4

    :goto_0
    iget v7, v6, Lzr/w0;->z:I

    if-ge v2, v7, :cond_4

    invoke-virtual {v6, v2}, Lzr/w0;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ldb/t;

    iget-object v8, v7, Ldb/t;->a:Lu8/u0;

    iget v10, v7, Ldb/t;->b:I

    iget-object v8, v8, Lu8/u0;->e:[Z

    aget-boolean v8, v8, v10

    if-eqz v8, :cond_3

    iget-object v2, v7, Ldb/t;->c:Ljava/lang/String;

    iget-object v6, v9, Ldb/r;->c:[Ljava/lang/String;

    aput-object v2, v6, v5

    goto :goto_1

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    iget-object v2, p0, Ldb/x;->w:Ldb/c0;

    invoke-virtual {v2, v3}, Ldb/c0;->b(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/4 v2, 0x3

    invoke-virtual {p0, v1, v2}, Ldb/x;->e(Lu8/v0;I)Lzr/w0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldb/l;->g(Ljava/util/List;)V

    goto :goto_2

    :cond_5
    sget-object v1, Lzr/w0;->E:Lzr/w0;

    invoke-virtual {v0, v1}, Ldb/l;->g(Ljava/util/List;)V

    :cond_6
    :goto_2
    invoke-virtual {v0}, Ldb/v;->getItemCount()I

    move-result v0

    if-lez v0, :cond_7

    move v0, v5

    goto :goto_3

    :cond_7
    move v0, v4

    :goto_3
    invoke-virtual {p0, v3, v0}, Ldb/x;->j(Landroid/view/View;Z)V

    iget-object v0, p0, Ldb/x;->F:Ldb/r;

    invoke-virtual {v0, v5}, Ldb/r;->a(I)Z

    move-result v1

    if-nez v1, :cond_8

    invoke-virtual {v0, v4}, Ldb/r;->a(I)Z

    move-result v0

    if-eqz v0, :cond_9

    :cond_8
    move v4, v5

    :cond_9
    iget-object v0, p0, Ldb/x;->c0:Landroid/view/View;

    invoke-virtual {p0, v0, v4}, Ldb/x;->j(Landroid/view/View;Z)V

    return-void
.end method
