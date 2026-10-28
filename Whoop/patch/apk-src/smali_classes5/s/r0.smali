.class public final Ls/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/TextView;

.field public b:Ls/k2;

.field public c:Ls/k2;

.field public d:Ls/k2;

.field public e:Ls/k2;

.field public f:Ls/k2;

.field public g:Ls/k2;

.field public h:Ls/k2;

.field public final i:Ls/x0;

.field public j:I

.field public k:I

.field public l:Landroid/graphics/Typeface;

.field public m:Z


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ls/r0;->j:I

    const/4 v0, -0x1

    iput v0, p0, Ls/r0;->k:I

    iput-object p1, p0, Ls/r0;->a:Landroid/widget/TextView;

    new-instance v0, Ls/x0;

    invoke-direct {v0, p1}, Ls/x0;-><init>(Landroid/widget/TextView;)V

    iput-object v0, p0, Ls/r0;->i:Ls/x0;

    return-void
.end method

.method public static c(Landroid/content/Context;Ls/p;I)Ls/k2;
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Ls/p;->a:Ls/c2;

    invoke-virtual {v0, p0, p2}, Ls/c2;->f(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p1

    if-eqz p0, :cond_0

    new-instance p1, Ls/k2;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 p2, 0x1

    iput-boolean p2, p1, Ls/k2;->d:Z

    iput-object p0, p1, Ls/k2;->a:Landroid/content/res/ColorStateList;

    return-object p1

    :cond_0
    const/4 p0, 0x0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method


# virtual methods
.method public final a(Landroid/graphics/drawable/Drawable;Ls/k2;)V
    .locals 1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    iget-object v0, p0, Ls/r0;->a:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getDrawableState()[I

    move-result-object v0

    invoke-static {p1, p2, v0}, Ls/p;->e(Landroid/graphics/drawable/Drawable;Ls/k2;[I)V

    :cond_0
    return-void
.end method

.method public final b()V
    .locals 6

    iget-object v0, p0, Ls/r0;->b:Ls/k2;

    const/4 v1, 0x2

    const/4 v2, 0x0

    iget-object v3, p0, Ls/r0;->a:Landroid/widget/TextView;

    if-nez v0, :cond_0

    iget-object v0, p0, Ls/r0;->c:Ls/k2;

    if-nez v0, :cond_0

    iget-object v0, p0, Ls/r0;->d:Ls/k2;

    if-nez v0, :cond_0

    iget-object v0, p0, Ls/r0;->e:Ls/k2;

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v4, v0, v2

    iget-object v5, p0, Ls/r0;->b:Ls/k2;

    invoke-virtual {p0, v4, v5}, Ls/r0;->a(Landroid/graphics/drawable/Drawable;Ls/k2;)V

    const/4 v4, 0x1

    aget-object v4, v0, v4

    iget-object v5, p0, Ls/r0;->c:Ls/k2;

    invoke-virtual {p0, v4, v5}, Ls/r0;->a(Landroid/graphics/drawable/Drawable;Ls/k2;)V

    aget-object v4, v0, v1

    iget-object v5, p0, Ls/r0;->d:Ls/k2;

    invoke-virtual {p0, v4, v5}, Ls/r0;->a(Landroid/graphics/drawable/Drawable;Ls/k2;)V

    const/4 v4, 0x3

    aget-object v0, v0, v4

    iget-object v4, p0, Ls/r0;->e:Ls/k2;

    invoke-virtual {p0, v0, v4}, Ls/r0;->a(Landroid/graphics/drawable/Drawable;Ls/k2;)V

    :cond_1
    iget-object v0, p0, Ls/r0;->f:Ls/k2;

    if-nez v0, :cond_3

    iget-object v0, p0, Ls/r0;->g:Ls/k2;

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    :goto_0
    invoke-virtual {v3}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    aget-object v2, v0, v2

    iget-object v3, p0, Ls/r0;->f:Ls/k2;

    invoke-virtual {p0, v2, v3}, Ls/r0;->a(Landroid/graphics/drawable/Drawable;Ls/k2;)V

    aget-object v0, v0, v1

    iget-object v1, p0, Ls/r0;->g:Ls/k2;

    invoke-virtual {p0, v0, v1}, Ls/r0;->a(Landroid/graphics/drawable/Drawable;Ls/k2;)V

    return-void
.end method

.method public final d()Landroid/content/res/ColorStateList;
    .locals 1

    iget-object v0, p0, Ls/r0;->h:Ls/k2;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ls/k2;->a:Landroid/content/res/ColorStateList;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final e()Landroid/graphics/PorterDuff$Mode;
    .locals 1

    iget-object v0, p0, Ls/r0;->h:Ls/k2;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ls/k2;->b:Landroid/graphics/PorterDuff$Mode;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final f(Landroid/util/AttributeSet;I)V
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v4, p1

    move/from16 v6, p2

    iget-object v1, v0, Ls/r0;->a:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {}, Ls/p;->a()Ls/p;

    move-result-object v8

    sget-object v3, Ll/a;->h:[I

    invoke-static {v7, v4, v3, v6}, Ls/m2;->q(Landroid/content/Context;Landroid/util/AttributeSet;[II)Ls/m2;

    move-result-object v9

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v5, v9, Ls/m2;->x:Ljava/lang/Object;

    check-cast v5, Landroid/content/res/TypedArray;

    invoke-static/range {v1 .. v6}, Lh5/p0;->m(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    move-object v10, v1

    iget-object v1, v9, Ls/m2;->x:Ljava/lang/Object;

    check-cast v1, Landroid/content/res/TypedArray;

    const/4 v11, 0x0

    const/4 v12, -0x1

    invoke-virtual {v1, v11, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    const/4 v13, 0x3

    invoke-virtual {v1, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v13, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    invoke-static {v7, v8, v3}, Ls/r0;->c(Landroid/content/Context;Ls/p;I)Ls/k2;

    move-result-object v3

    iput-object v3, v0, Ls/r0;->b:Ls/k2;

    :cond_0
    const/4 v14, 0x1

    invoke-virtual {v1, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1, v14, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    invoke-static {v7, v8, v3}, Ls/r0;->c(Landroid/content/Context;Ls/p;I)Ls/k2;

    move-result-object v3

    iput-object v3, v0, Ls/r0;->c:Ls/k2;

    :cond_1
    const/4 v15, 0x4

    invoke-virtual {v1, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v1, v15, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    invoke-static {v7, v8, v3}, Ls/r0;->c(Landroid/content/Context;Ls/p;I)Ls/k2;

    move-result-object v3

    iput-object v3, v0, Ls/r0;->d:Ls/k2;

    :cond_2
    const/4 v3, 0x2

    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v1, v3, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v5

    invoke-static {v7, v8, v5}, Ls/r0;->c(Landroid/content/Context;Ls/p;I)Ls/k2;

    move-result-object v5

    iput-object v5, v0, Ls/r0;->e:Ls/k2;

    :cond_3
    const/4 v5, 0x5

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v16

    if-eqz v16, :cond_4

    invoke-virtual {v1, v5, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    invoke-static {v7, v8, v3}, Ls/r0;->c(Landroid/content/Context;Ls/p;I)Ls/k2;

    move-result-object v3

    iput-object v3, v0, Ls/r0;->f:Ls/k2;

    :cond_4
    const/4 v3, 0x6

    invoke-virtual {v1, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v17

    if-eqz v17, :cond_5

    invoke-virtual {v1, v3, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    invoke-static {v7, v8, v1}, Ls/r0;->c(Landroid/content/Context;Ls/p;I)Ls/k2;

    move-result-object v1

    iput-object v1, v0, Ls/r0;->g:Ls/k2;

    :cond_5
    invoke-virtual {v9}, Ls/m2;->r()V

    invoke-virtual {v10}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v1

    instance-of v1, v1, Landroid/text/method/PasswordTransformationMethod;

    sget-object v9, Ll/a;->w:[I

    const/16 v3, 0xe

    const/16 v13, 0xd

    const/16 v14, 0xf

    if-eq v2, v12, :cond_9

    new-instance v5, Ls/m2;

    invoke-virtual {v7, v2, v9}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v2

    invoke-direct {v5, v7, v2}, Ls/m2;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    if-nez v1, :cond_6

    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v20

    if-eqz v20, :cond_6

    invoke-virtual {v2, v3, v11}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v20

    move/from16 v21, v20

    const/16 v20, 0x1

    goto :goto_0

    :cond_6
    move/from16 v20, v11

    move/from16 v21, v20

    :goto_0
    invoke-virtual {v0, v7, v5}, Ls/r0;->j(Landroid/content/Context;Ls/m2;)V

    invoke-virtual {v2, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v22

    if-eqz v22, :cond_7

    invoke-virtual {v2, v14}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v22

    goto :goto_1

    :cond_7
    const/16 v22, 0x0

    :goto_1
    invoke-virtual {v2, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v23

    if-eqz v23, :cond_8

    invoke-virtual {v2, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_8
    const/4 v2, 0x0

    :goto_2
    invoke-virtual {v5}, Ls/m2;->r()V

    goto :goto_3

    :cond_9
    move/from16 v20, v11

    move/from16 v21, v20

    const/4 v2, 0x0

    const/16 v22, 0x0

    :goto_3
    new-instance v5, Ls/m2;

    invoke-virtual {v7, v4, v9, v6, v11}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v9

    invoke-direct {v5, v7, v9}, Ls/m2;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    if-nez v1, :cond_a

    invoke-virtual {v9, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v23

    if-eqz v23, :cond_a

    invoke-virtual {v9, v3, v11}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v21

    const/16 v20, 0x1

    :cond_a
    move/from16 v3, v21

    invoke-virtual {v9, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v21

    if-eqz v21, :cond_b

    invoke-virtual {v9, v14}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v22

    :cond_b
    invoke-virtual {v9, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v21

    if-eqz v21, :cond_c

    invoke-virtual {v9, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    :cond_c
    invoke-virtual {v9, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v21

    const/4 v14, 0x0

    if-eqz v21, :cond_d

    invoke-virtual {v9, v11, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v9

    if-nez v9, :cond_d

    invoke-virtual {v10, v11, v14}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_d
    invoke-virtual {v0, v7, v5}, Ls/r0;->j(Landroid/content/Context;Ls/m2;)V

    invoke-virtual {v5}, Ls/m2;->r()V

    if-nez v1, :cond_e

    if-eqz v20, :cond_e

    invoke-virtual {v10, v3}, Landroid/widget/TextView;->setAllCaps(Z)V

    :cond_e
    iget-object v1, v0, Ls/r0;->l:Landroid/graphics/Typeface;

    if-eqz v1, :cond_10

    iget v3, v0, Ls/r0;->k:I

    if-ne v3, v12, :cond_f

    iget v3, v0, Ls/r0;->j:I

    invoke-virtual {v10, v1, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    goto :goto_4

    :cond_f
    invoke-virtual {v10, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    :cond_10
    :goto_4
    if-eqz v2, :cond_11

    invoke-static {v10, v2}, Ls/p0;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    :cond_11
    if-eqz v22, :cond_12

    invoke-static/range {v22 .. v22}, Ls/o0;->a(Ljava/lang/String;)Landroid/os/LocaleList;

    move-result-object v1

    invoke-static {v10, v1}, Ls/o0;->b(Landroid/widget/TextView;Landroid/os/LocaleList;)V

    :cond_12
    iget-object v9, v0, Ls/r0;->i:Ls/x0;

    iget-object v1, v9, Ls/x0;->h:Landroid/content/Context;

    sget-object v3, Ll/a;->i:[I

    invoke-virtual {v1, v4, v3, v6, v11}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v5

    move-object v2, v1

    iget-object v1, v9, Ls/x0;->g:Landroid/widget/TextView;

    move-object/from16 v20, v2

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    move/from16 v16, v14

    const/4 v14, 0x2

    const/4 v15, 0x5

    invoke-static/range {v1 .. v6}, Lh5/p0;->m(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    invoke-virtual {v5, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-virtual {v5, v15, v11}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    iput v1, v9, Ls/x0;->a:I

    :cond_13
    const/4 v1, 0x4

    invoke-virtual {v5, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    const/high16 v6, -0x40800000    # -1.0f

    if-eqz v2, :cond_14

    invoke-virtual {v5, v1, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v1

    goto :goto_5

    :cond_14
    move v1, v6

    :goto_5
    invoke-virtual {v5, v14}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-virtual {v5, v14, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    :goto_6
    const/4 v15, 0x1

    goto :goto_7

    :cond_15
    move v2, v6

    goto :goto_6

    :goto_7
    invoke-virtual {v5, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v19

    if-eqz v19, :cond_16

    invoke-virtual {v5, v15, v6}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v21

    :goto_8
    const/4 v15, 0x3

    goto :goto_9

    :cond_16
    move/from16 v21, v6

    goto :goto_8

    :goto_9
    invoke-virtual {v5, v15}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v18

    if-eqz v18, :cond_1a

    invoke-virtual {v5, v15, v11}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v13

    if-lez v13, :cond_1a

    invoke-virtual {v5}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object v15

    invoke-virtual {v15, v13}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    move-result-object v13

    invoke-virtual {v13}, Landroid/content/res/TypedArray;->length()I

    move-result v15

    move/from16 v24, v11

    new-array v11, v15, [I

    if-lez v15, :cond_19

    move/from16 v14, v24

    :goto_a
    if-ge v14, v15, :cond_17

    invoke-virtual {v13, v14, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v26

    aput v26, v11, v14

    add-int/lit8 v14, v14, 0x1

    goto :goto_a

    :cond_17
    invoke-static {v11}, Ls/x0;->a([I)[I

    move-result-object v11

    iput-object v11, v9, Ls/x0;->e:[I

    array-length v14, v11

    if-lez v14, :cond_18

    const/4 v15, 0x1

    goto :goto_b

    :cond_18
    move/from16 v15, v24

    :goto_b
    iput-boolean v15, v9, Ls/x0;->f:Z

    if-eqz v15, :cond_19

    const/4 v15, 0x1

    iput v15, v9, Ls/x0;->a:I

    move/from16 v19, v15

    aget v15, v11, v24

    int-to-float v15, v15

    iput v15, v9, Ls/x0;->c:F

    add-int/lit8 v14, v14, -0x1

    aget v11, v11, v14

    int-to-float v11, v11

    iput v11, v9, Ls/x0;->d:F

    iput v6, v9, Ls/x0;->b:F

    :cond_19
    invoke-virtual {v13}, Landroid/content/res/TypedArray;->recycle()V

    goto :goto_c

    :cond_1a
    move/from16 v24, v11

    :goto_c
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {v9}, Ls/x0;->b()Z

    move-result v5

    if-eqz v5, :cond_24

    iget v5, v9, Ls/x0;->a:I

    const/4 v15, 0x1

    if-ne v5, v15, :cond_25

    iget-boolean v5, v9, Ls/x0;->f:Z

    if-nez v5, :cond_21

    invoke-virtual/range {v20 .. v20}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    cmpl-float v11, v2, v6

    if-nez v11, :cond_1b

    const/high16 v2, 0x41400000    # 12.0f

    const/4 v14, 0x2

    invoke-static {v14, v2, v5}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v2

    goto :goto_d

    :cond_1b
    const/4 v14, 0x2

    :goto_d
    cmpl-float v11, v21, v6

    if-nez v11, :cond_1c

    const/high16 v11, 0x42e00000    # 112.0f

    invoke-static {v14, v11, v5}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v21

    :cond_1c
    move/from16 v5, v21

    cmpl-float v11, v1, v6

    if-nez v11, :cond_1d

    const/high16 v1, 0x3f800000    # 1.0f

    :cond_1d
    cmpg-float v11, v2, v16

    const-string v13, "px) is less or equal to (0px)"

    if-lez v11, :cond_20

    cmpg-float v11, v5, v2

    if-lez v11, :cond_1f

    cmpg-float v11, v1, v16

    if-lez v11, :cond_1e

    const/4 v15, 0x1

    iput v15, v9, Ls/x0;->a:I

    iput v2, v9, Ls/x0;->c:F

    iput v5, v9, Ls/x0;->d:F

    iput v1, v9, Ls/x0;->b:F

    move/from16 v1, v24

    iput-boolean v1, v9, Ls/x0;->f:Z

    goto :goto_e

    :cond_1e
    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "The auto-size step granularity ("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1f
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v3, "px) is less or equal to minimum auto-size text size ("

    const-string v4, "px)"

    const-string v6, "Maximum auto-size text size ("

    invoke-static {v6, v5, v3, v2, v4}, Lr80/c;->n(Ljava/lang/String;FLjava/lang/String;FLjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_20
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Minimum auto-size text size ("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_21
    :goto_e
    invoke-virtual {v9}, Ls/x0;->b()Z

    move-result v1

    if-eqz v1, :cond_25

    iget v1, v9, Ls/x0;->a:I

    const/4 v15, 0x1

    if-ne v1, v15, :cond_25

    iget-boolean v1, v9, Ls/x0;->f:Z

    if-eqz v1, :cond_22

    iget-object v1, v9, Ls/x0;->e:[I

    array-length v1, v1

    if-nez v1, :cond_25

    :cond_22
    iget v1, v9, Ls/x0;->d:F

    iget v2, v9, Ls/x0;->c:F

    sub-float/2addr v1, v2

    iget v2, v9, Ls/x0;->b:F

    div-float/2addr v1, v2

    float-to-double v1, v1

    invoke-static {v1, v2}, Ljava/lang/Math;->floor(D)D

    move-result-wide v1

    double-to-int v1, v1

    const/16 v19, 0x1

    add-int/lit8 v1, v1, 0x1

    new-array v2, v1, [I

    const/4 v5, 0x0

    :goto_f
    if-ge v5, v1, :cond_23

    iget v11, v9, Ls/x0;->c:F

    int-to-float v13, v5

    iget v14, v9, Ls/x0;->b:F

    mul-float/2addr v13, v14

    add-float/2addr v13, v11

    invoke-static {v13}, Ljava/lang/Math;->round(F)I

    move-result v11

    aput v11, v2, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_f

    :cond_23
    invoke-static {v2}, Ls/x0;->a([I)[I

    move-result-object v1

    iput-object v1, v9, Ls/x0;->e:[I

    goto :goto_10

    :cond_24
    move/from16 v1, v24

    iput v1, v9, Ls/x0;->a:I

    :cond_25
    :goto_10
    iget v1, v9, Ls/x0;->a:I

    if-eqz v1, :cond_27

    iget-object v1, v9, Ls/x0;->e:[I

    array-length v2, v1

    if-lez v2, :cond_27

    invoke-static {v10}, Ls/p0;->a(Landroid/widget/TextView;)I

    move-result v2

    int-to-float v2, v2

    cmpl-float v2, v2, v6

    if-eqz v2, :cond_26

    iget v1, v9, Ls/x0;->c:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget v2, v9, Ls/x0;->d:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget v5, v9, Ls/x0;->b:F

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v5

    const/4 v9, 0x0

    invoke-static {v10, v1, v2, v5, v9}, Ls/p0;->b(Landroid/widget/TextView;IIII)V

    goto :goto_11

    :cond_26
    const/4 v9, 0x0

    invoke-static {v10, v1, v9}, Ls/p0;->c(Landroid/widget/TextView;[II)V

    :cond_27
    :goto_11
    invoke-virtual {v7, v4, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    if-eq v2, v12, :cond_28

    invoke-virtual {v8, v7, v2}, Ls/p;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    :goto_12
    const/16 v3, 0xd

    goto :goto_13

    :cond_28
    const/4 v2, 0x0

    goto :goto_12

    :goto_13
    invoke-virtual {v1, v3, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    if-eq v3, v12, :cond_29

    invoke-virtual {v8, v7, v3}, Ls/p;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    goto :goto_14

    :cond_29
    const/4 v3, 0x0

    :goto_14
    const/16 v4, 0x9

    invoke-virtual {v1, v4, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    if-eq v4, v12, :cond_2a

    invoke-virtual {v8, v7, v4}, Ls/p;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    :goto_15
    const/4 v5, 0x6

    goto :goto_16

    :cond_2a
    const/4 v4, 0x0

    goto :goto_15

    :goto_16
    invoke-virtual {v1, v5, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v5

    if-eq v5, v12, :cond_2b

    invoke-virtual {v8, v7, v5}, Ls/p;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    goto :goto_17

    :cond_2b
    const/4 v5, 0x0

    :goto_17
    const/16 v9, 0xa

    invoke-virtual {v1, v9, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v9

    if-eq v9, v12, :cond_2c

    invoke-virtual {v8, v7, v9}, Ls/p;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    goto :goto_18

    :cond_2c
    const/4 v9, 0x0

    :goto_18
    const/4 v11, 0x7

    invoke-virtual {v1, v11, v12}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v11

    if-eq v11, v12, :cond_2d

    invoke-virtual {v8, v7, v11}, Ls/p;->b(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    goto :goto_19

    :cond_2d
    const/4 v8, 0x0

    :goto_19
    if-nez v9, :cond_38

    if-eqz v8, :cond_2e

    goto :goto_22

    :cond_2e
    if-nez v2, :cond_2f

    if-nez v3, :cond_2f

    if-nez v4, :cond_2f

    if-eqz v5, :cond_3d

    :cond_2f
    invoke-virtual {v10}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v8

    const/16 v24, 0x0

    aget-object v9, v8, v24

    if-nez v9, :cond_30

    const/16 v25, 0x2

    aget-object v11, v8, v25

    if-eqz v11, :cond_31

    :cond_30
    const/16 v18, 0x3

    goto :goto_1e

    :cond_31
    invoke-virtual {v10}, Landroid/widget/TextView;->getCompoundDrawables()[Landroid/graphics/drawable/Drawable;

    move-result-object v8

    if-eqz v2, :cond_32

    goto :goto_1a

    :cond_32
    aget-object v2, v8, v24

    :goto_1a
    if-eqz v3, :cond_33

    goto :goto_1b

    :cond_33
    const/16 v19, 0x1

    aget-object v3, v8, v19

    :goto_1b
    if-eqz v4, :cond_34

    goto :goto_1c

    :cond_34
    const/16 v25, 0x2

    aget-object v4, v8, v25

    :goto_1c
    if-eqz v5, :cond_35

    goto :goto_1d

    :cond_35
    const/16 v18, 0x3

    aget-object v5, v8, v18

    :goto_1d
    invoke-virtual {v10, v2, v3, v4, v5}, Landroid/widget/TextView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_27

    :goto_1e
    if-eqz v3, :cond_36

    goto :goto_1f

    :cond_36
    const/16 v19, 0x1

    aget-object v3, v8, v19

    :goto_1f
    if-eqz v5, :cond_37

    :goto_20
    const/16 v25, 0x2

    goto :goto_21

    :cond_37
    aget-object v5, v8, v18

    goto :goto_20

    :goto_21
    aget-object v2, v8, v25

    invoke-virtual {v10, v9, v3, v2, v5}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto :goto_27

    :cond_38
    :goto_22
    invoke-virtual {v10}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v9, :cond_39

    goto :goto_23

    :cond_39
    const/16 v24, 0x0

    aget-object v9, v2, v24

    :goto_23
    if-eqz v3, :cond_3a

    goto :goto_24

    :cond_3a
    const/16 v19, 0x1

    aget-object v3, v2, v19

    :goto_24
    if-eqz v8, :cond_3b

    goto :goto_25

    :cond_3b
    const/16 v25, 0x2

    aget-object v8, v2, v25

    :goto_25
    if-eqz v5, :cond_3c

    goto :goto_26

    :cond_3c
    const/16 v18, 0x3

    aget-object v5, v2, v18

    :goto_26
    invoke-virtual {v10, v9, v3, v8, v5}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    :cond_3d
    :goto_27
    const/16 v2, 0xb

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_3f

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_3e

    const/4 v9, 0x0

    invoke-virtual {v1, v2, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    if-eqz v3, :cond_3e

    invoke-static {v7, v3}, Ls4/c;->getColorStateList(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v3

    if-eqz v3, :cond_3e

    goto :goto_28

    :cond_3e
    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v3

    :goto_28
    invoke-virtual {v10, v3}, Landroid/widget/TextView;->setCompoundDrawableTintList(Landroid/content/res/ColorStateList;)V

    :cond_3f
    const/16 v2, 0xc

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_40

    invoke-virtual {v1, v2, v12}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Ls/e1;->c(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuff$Mode;

    move-result-object v2

    invoke-virtual {v10, v2}, Landroid/widget/TextView;->setCompoundDrawableTintMode(Landroid/graphics/PorterDuff$Mode;)V

    :cond_40
    const/16 v2, 0xf

    invoke-virtual {v1, v2, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    const/16 v3, 0x12

    invoke-virtual {v1, v3, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    const/16 v4, 0x13

    invoke-virtual {v1, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_42

    invoke-virtual {v1, v4}, Landroid/content/res/TypedArray;->peekValue(I)Landroid/util/TypedValue;

    move-result-object v5

    if-eqz v5, :cond_41

    iget v7, v5, Landroid/util/TypedValue;->type:I

    const/4 v15, 0x5

    if-ne v7, v15, :cond_41

    iget v4, v5, Landroid/util/TypedValue;->data:I

    and-int/lit8 v5, v4, 0xf

    invoke-static {v4}, Landroid/util/TypedValue;->complexToFloat(I)F

    move-result v4

    goto :goto_2a

    :cond_41
    invoke-virtual {v1, v4, v12}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    int-to-float v4, v4

    :goto_29
    move v5, v12

    goto :goto_2a

    :cond_42
    move v4, v6

    goto :goto_29

    :goto_2a
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    if-eq v2, v12, :cond_43

    invoke-static {v2}, Lwb3/f;->n(I)V

    invoke-virtual {v10, v2}, Landroid/widget/TextView;->setFirstBaselineToTopHeight(I)V

    :cond_43
    if-eq v3, v12, :cond_45

    invoke-static {v3}, Lwb3/f;->n(I)V

    invoke-virtual {v10}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v1

    invoke-virtual {v10}, Landroid/widget/TextView;->getIncludeFontPadding()Z

    move-result v2

    if-eqz v2, :cond_44

    iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    goto :goto_2b

    :cond_44
    iget v1, v1, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    :goto_2b
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v2

    if-le v3, v2, :cond_45

    sub-int/2addr v3, v1

    invoke-virtual {v10}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    invoke-virtual {v10}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    invoke-virtual {v10}, Landroid/view/View;->getPaddingRight()I

    move-result v7

    invoke-virtual {v10, v1, v2, v7, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    :cond_45
    cmpl-float v1, v4, v6

    if-eqz v1, :cond_48

    if-ne v5, v12, :cond_46

    float-to-int v1, v4

    invoke-static {v10, v1}, Lvd/e;->b0(Landroid/widget/TextView;I)V

    return-void

    :cond_46
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x22

    if-lt v1, v2, :cond_47

    invoke-static {v10, v5, v4}, Lb3/g1;->t(Landroid/widget/TextView;IF)V

    return-void

    :cond_47
    invoke-virtual {v10}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-static {v5, v4, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static {v10, v1}, Lvd/e;->b0(Landroid/widget/TextView;I)V

    :cond_48
    return-void
.end method

.method public final g(Landroid/content/Context;I)V
    .locals 5

    new-instance v0, Ls/m2;

    sget-object v1, Ll/a;->w:[I

    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Ls/m2;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    const/16 v1, 0xe

    invoke-virtual {p2, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    iget-object v3, p0, Ls/r0;->a:Landroid/widget/TextView;

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    invoke-virtual {p2, v1, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setAllCaps(Z)V

    :cond_0
    invoke-virtual {p2, v4}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, -0x1

    invoke-virtual {p2, v4, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    invoke-virtual {v3, v4, v1}, Landroid/widget/TextView;->setTextSize(IF)V

    :cond_1
    invoke-virtual {p0, p1, v0}, Ls/r0;->j(Landroid/content/Context;Ls/m2;)V

    const/16 p1, 0xd

    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p2, p1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-static {v3, p1}, Ls/p0;->d(Landroid/widget/TextView;Ljava/lang/String;)Z

    :cond_2
    invoke-virtual {v0}, Ls/m2;->r()V

    iget-object p1, p0, Ls/r0;->l:Landroid/graphics/Typeface;

    if-eqz p1, :cond_3

    iget p2, p0, Ls/r0;->j:I

    invoke-virtual {v3, p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    :cond_3
    return-void
.end method

.method public final h(Landroid/content/res/ColorStateList;)V
    .locals 1

    iget-object v0, p0, Ls/r0;->h:Ls/k2;

    if-nez v0, :cond_0

    new-instance v0, Ls/k2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ls/r0;->h:Ls/k2;

    :cond_0
    iget-object v0, p0, Ls/r0;->h:Ls/k2;

    iput-object p1, v0, Ls/k2;->a:Landroid/content/res/ColorStateList;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, Ls/k2;->d:Z

    iput-object v0, p0, Ls/r0;->b:Ls/k2;

    iput-object v0, p0, Ls/r0;->c:Ls/k2;

    iput-object v0, p0, Ls/r0;->d:Ls/k2;

    iput-object v0, p0, Ls/r0;->e:Ls/k2;

    iput-object v0, p0, Ls/r0;->f:Ls/k2;

    iput-object v0, p0, Ls/r0;->g:Ls/k2;

    return-void
.end method

.method public final i(Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    iget-object v0, p0, Ls/r0;->h:Ls/k2;

    if-nez v0, :cond_0

    new-instance v0, Ls/k2;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ls/r0;->h:Ls/k2;

    :cond_0
    iget-object v0, p0, Ls/r0;->h:Ls/k2;

    iput-object p1, v0, Ls/k2;->b:Landroid/graphics/PorterDuff$Mode;

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, v0, Ls/k2;->c:Z

    iput-object v0, p0, Ls/r0;->b:Ls/k2;

    iput-object v0, p0, Ls/r0;->c:Ls/k2;

    iput-object v0, p0, Ls/r0;->d:Ls/k2;

    iput-object v0, p0, Ls/r0;->e:Ls/k2;

    iput-object v0, p0, Ls/r0;->f:Ls/k2;

    iput-object v0, p0, Ls/r0;->g:Ls/k2;

    return-void
.end method

.method public final j(Landroid/content/Context;Ls/m2;)V
    .locals 9

    iget v0, p0, Ls/r0;->j:I

    iget-object v1, p2, Ls/m2;->x:Ljava/lang/Object;

    check-cast v1, Landroid/content/res/TypedArray;

    const/4 v2, 0x2

    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Ls/r0;->j:I

    const/16 v0, 0xb

    const/4 v3, -0x1

    invoke-virtual {v1, v0, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Ls/r0;->k:I

    if-eq v0, v3, :cond_0

    iget v0, p0, Ls/r0;->j:I

    and-int/2addr v0, v2

    iput v0, p0, Ls/r0;->j:I

    :cond_0
    const/16 v0, 0xa

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-nez v4, :cond_5

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v7}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p1

    if-eqz p1, :cond_e

    iput-boolean v6, p0, Ls/r0;->m:Z

    invoke-virtual {v1, v7, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    if-eq p1, v7, :cond_4

    if-eq p1, v2, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    goto/16 :goto_4

    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->MONOSPACE:Landroid/graphics/Typeface;

    iput-object p1, p0, Ls/r0;->l:Landroid/graphics/Typeface;

    return-void

    :cond_3
    sget-object p1, Landroid/graphics/Typeface;->SERIF:Landroid/graphics/Typeface;

    iput-object p1, p0, Ls/r0;->l:Landroid/graphics/Typeface;

    return-void

    :cond_4
    sget-object p1, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    iput-object p1, p0, Ls/r0;->l:Landroid/graphics/Typeface;

    return-void

    :cond_5
    :goto_0
    const/4 v4, 0x0

    iput-object v4, p0, Ls/r0;->l:Landroid/graphics/Typeface;

    invoke-virtual {v1, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_6

    move v0, v5

    :cond_6
    iget v4, p0, Ls/r0;->k:I

    iget v5, p0, Ls/r0;->j:I

    invoke-virtual {p1}, Landroid/content/Context;->isRestricted()Z

    move-result p1

    if-nez p1, :cond_b

    new-instance p1, Ljava/lang/ref/WeakReference;

    iget-object v8, p0, Ls/r0;->a:Landroid/widget/TextView;

    invoke-direct {p1, v8}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance v8, Ls/n0;

    invoke-direct {v8, p0, v4, v5, p1}, Ls/n0;-><init>(Ls/r0;IILjava/lang/ref/WeakReference;)V

    :try_start_0
    iget p1, p0, Ls/r0;->j:I

    invoke-virtual {p2, v0, p1, v8}, Ls/m2;->l(IILs/n0;)Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_9

    iget p2, p0, Ls/r0;->k:I

    if-eq p2, v3, :cond_8

    invoke-static {p1, v6}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget p2, p0, Ls/r0;->k:I

    iget v4, p0, Ls/r0;->j:I

    and-int/2addr v4, v2

    if-eqz v4, :cond_7

    move v4, v7

    goto :goto_1

    :cond_7
    move v4, v6

    :goto_1
    invoke-static {p1, p2, v4}, Ls/q0;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Ls/r0;->l:Landroid/graphics/Typeface;

    goto :goto_2

    :cond_8
    iput-object p1, p0, Ls/r0;->l:Landroid/graphics/Typeface;

    :cond_9
    :goto_2
    iget-object p1, p0, Ls/r0;->l:Landroid/graphics/Typeface;

    if-nez p1, :cond_a

    move p1, v7

    goto :goto_3

    :cond_a
    move p1, v6

    :goto_3
    iput-boolean p1, p0, Ls/r0;->m:Z
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_b
    iget-object p1, p0, Ls/r0;->l:Landroid/graphics/Typeface;

    if-nez p1, :cond_e

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_e

    iget p2, p0, Ls/r0;->k:I

    if-eq p2, v3, :cond_d

    invoke-static {p1, v6}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    iget p2, p0, Ls/r0;->k:I

    iget v0, p0, Ls/r0;->j:I

    and-int/2addr v0, v2

    if-eqz v0, :cond_c

    move v6, v7

    :cond_c
    invoke-static {p1, p2, v6}, Ls/q0;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Ls/r0;->l:Landroid/graphics/Typeface;

    goto :goto_4

    :cond_d
    iget p2, p0, Ls/r0;->j:I

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Ls/r0;->l:Landroid/graphics/Typeface;

    :cond_e
    :goto_4
    return-void
.end method
