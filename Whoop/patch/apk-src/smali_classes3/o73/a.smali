.class public final Lo73/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static c:Lo2/e;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lo73/a;->a:I

    iput-object p1, p0, Lo73/a;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static A(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/g;Li63/j;)Lio/sentry/android/replay/viewhierarchy/g;
    .locals 12

    const-string v2, "options"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, La4/a;->w(Landroid/view/View;)Ll83/k;

    move-result-object v2

    iget-object v3, v2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    iget-object v2, v2, Ll83/k;->x:Ljava/lang/Object;

    move-object v7, v2

    check-cast v7, Landroid/graphics/Rect;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x1

    if-eqz v6, :cond_a

    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Ljava/lang/String;

    if-eqz v9, :cond_0

    check-cast v8, Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v8, v2

    :goto_0
    const-string v9, "toLowerCase(...)"

    if-eqz v8, :cond_1

    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v8, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v10, "sentry-unmask"

    invoke-static {v8, v10, v3}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v8

    if-ne v8, v5, :cond_1

    goto :goto_1

    :cond_1
    const v8, 0x7f0a0b2d

    invoke-virtual {p0, v8}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v10

    const-string v11, "unmask"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    :goto_1
    invoke-virtual {p2}, Li63/j;->e()V

    goto/16 :goto_7

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v10

    instance-of v11, v10, Ljava/lang/String;

    if-eqz v11, :cond_3

    check-cast v10, Ljava/lang/String;

    goto :goto_2

    :cond_3
    move-object v10, v2

    :goto_2
    if-eqz v10, :cond_4

    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v10, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "sentry-mask"

    invoke-static {v10, v9, v3}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v9

    if-ne v9, v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {p0, v8}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v8

    const-string v9, "mask"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    :goto_3
    invoke-virtual {p2}, Li63/j;->e()V

    goto :goto_6

    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v8

    if-eqz v8, :cond_6

    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v8

    const-string v9, "getParent(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    iget-object v9, p2, Li63/j;->c:Ljava/util/Collection;

    check-cast v9, Ljava/util/concurrent/CopyOnWriteArraySet;

    const-string v10, "getUnmaskViewClasses(...)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_4
    if-eqz v8, :cond_8

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v8}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v8

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    iget-object v1, p2, Li63/j;->b:Ljava/io/Serializable;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    const-string v9, "getMaskViewClasses(...)"

    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_5
    if-eqz v8, :cond_a

    invoke-virtual {v8}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1, v9}, Ljava/util/concurrent/CopyOnWriteArraySet;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    :goto_6
    move v9, v5

    goto :goto_8

    :cond_9
    invoke-virtual {v8}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v8

    goto :goto_5

    :cond_a
    :goto_7
    move v9, v3

    :goto_8
    instance-of v1, p0, Landroid/widget/TextView;

    const/4 v8, 0x0

    if-eqz v1, :cond_d

    move-object v0, p0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v1

    if-eqz v1, :cond_b

    new-instance v2, Lhm/d;

    const/16 v3, 0xa

    invoke-direct {v2, v1, v3}, Lhm/d;-><init>(Ljava/lang/Object;I)V

    :cond_b
    move-object v1, v2

    invoke-virtual {v0}, Landroid/widget/TextView;->getCurrentTextColor()I

    move-result v2

    const/high16 v3, -0x1000000

    or-int/2addr v2, v3

    invoke-virtual {v0}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    move-result v3

    :try_start_0
    invoke-virtual {v0}, Landroid/widget/TextView;->getTotalPaddingTop()I

    move-result v5
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_9

    :catch_0
    invoke-virtual {v0}, Landroid/widget/TextView;->getExtendedPaddingTop()I

    move-result v5

    :goto_9
    invoke-virtual {v0}, Landroid/view/View;->getX()F

    invoke-virtual {v0}, Landroid/view/View;->getY()F

    move v10, v5

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v5

    move v11, v10

    move v10, v6

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v6

    if-eqz p1, :cond_c

    iget v8, p1, Lio/sentry/android/replay/viewhierarchy/g;->c:F

    :cond_c
    invoke-virtual {v0}, Landroid/view/View;->getElevation()F

    move-result v0

    add-float/2addr v0, v8

    move-object v8, v7

    move v7, v0

    new-instance v0, Lio/sentry/android/replay/viewhierarchy/f;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move v4, v11

    move-object v11, v8

    move-object v8, p1

    invoke-direct/range {v0 .. v11}, Lio/sentry/android/replay/viewhierarchy/f;-><init>(Lhm/d;Ljava/lang/Integer;IIIIFLio/sentry/android/replay/viewhierarchy/g;ZZLandroid/graphics/Rect;)V

    return-object v0

    :cond_d
    instance-of v1, p0, Landroid/widget/ImageView;

    if-eqz v1, :cond_18

    move-object v0, p0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/view/View;->getX()F

    invoke-virtual {v0}, Landroid/view/View;->getY()F

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v2

    if-eqz p1, :cond_e

    iget v8, p1, Lio/sentry/android/replay/viewhierarchy/g;->c:F

    :cond_e
    invoke-virtual {v0}, Landroid/view/View;->getElevation()F

    move-result v10

    add-float/2addr v10, v8

    if-eqz v9, :cond_17

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_16

    instance-of v8, v0, Landroid/graphics/drawable/InsetDrawable;

    if-eqz v8, :cond_f

    move v8, v5

    goto :goto_a

    :cond_f
    instance-of v8, v0, Landroid/graphics/drawable/ColorDrawable;

    :goto_a
    if-eqz v8, :cond_10

    move v8, v5

    goto :goto_b

    :cond_10
    instance-of v8, v0, Landroid/graphics/drawable/VectorDrawable;

    :goto_b
    if-eqz v8, :cond_11

    move v8, v5

    goto :goto_c

    :cond_11
    instance-of v8, v0, Landroid/graphics/drawable/GradientDrawable;

    :goto_c
    if-eqz v8, :cond_13

    :cond_12
    :goto_d
    move v0, v3

    goto :goto_e

    :cond_13
    instance-of v8, v0, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v8, :cond_15

    check-cast v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_14

    goto :goto_d

    :cond_14
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v8

    if-nez v8, :cond_12

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v8

    const/16 v9, 0xa

    if-le v8, v9, :cond_12

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    if-le v0, v9, :cond_12

    :cond_15
    move v0, v5

    :goto_e
    if-ne v0, v5, :cond_16

    move v0, v5

    goto :goto_f

    :cond_16
    move v0, v3

    :goto_f
    if-eqz v0, :cond_17

    goto :goto_10

    :cond_17
    move v5, v3

    :goto_10
    new-instance v0, Lio/sentry/android/replay/viewhierarchy/d;

    move-object v4, p1

    move v3, v10

    invoke-direct/range {v0 .. v7}, Lio/sentry/android/replay/viewhierarchy/g;-><init>(IIFLio/sentry/android/replay/viewhierarchy/g;ZZLandroid/graphics/Rect;)V

    return-object v0

    :cond_18
    instance-of v1, p0, Landroid/view/SurfaceView;

    if-eqz v1, :cond_1a

    new-instance v1, Lio/sentry/android/replay/viewhierarchy/e;

    move-object v2, v1

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    move-object v0, p0

    check-cast v0, Landroid/view/SurfaceView;

    invoke-virtual {v0}, Landroid/view/View;->getX()F

    invoke-virtual {v0}, Landroid/view/View;->getY()F

    move-object v3, v0

    move-object v0, v2

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v2

    move-object v5, v3

    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    move-result v3

    if-eqz p1, :cond_19

    iget v8, p1, Lio/sentry/android/replay/viewhierarchy/g;->c:F

    :cond_19
    invoke-virtual {v5}, Landroid/view/View;->getElevation()F

    move-result v5

    add-float/2addr v5, v8

    move v4, v5

    move-object v8, v7

    move-object v5, p1

    move v7, v6

    move v6, v9

    invoke-direct/range {v0 .. v8}, Lio/sentry/android/replay/viewhierarchy/e;-><init>(Ljava/lang/ref/WeakReference;IIFLio/sentry/android/replay/viewhierarchy/g;ZZLandroid/graphics/Rect;)V

    return-object v0

    :cond_1a
    new-instance v0, Lio/sentry/android/replay/viewhierarchy/c;

    invoke-virtual {p0}, Landroid/view/View;->getX()F

    invoke-virtual {p0}, Landroid/view/View;->getY()F

    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v2

    if-eqz p1, :cond_1b

    iget v8, p1, Lio/sentry/android/replay/viewhierarchy/g;->c:F

    :cond_1b
    invoke-virtual {p0}, Landroid/view/View;->getElevation()F

    move-result v3

    add-float/2addr v3, v8

    move-object v4, p1

    move v5, v9

    invoke-direct/range {v0 .. v7}, Lio/sentry/android/replay/viewhierarchy/g;-><init>(IIFLio/sentry/android/replay/viewhierarchy/g;ZZLandroid/graphics/Rect;)V

    return-object v0
.end method

.method public static B(Lce/k;Ljava/lang/String;)Ljava/lang/Boolean;
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "toLowerCase(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Laws/sdk/kotlin/runtime/ConfigurationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to parse config property "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, v0}, Lo73/a;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " as a boolean"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-object v0
.end method

.method public static final C()Lo2/e;
    .locals 12

    sget-object v0, Lo73/a;->c:Lo2/e;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lo2/d;

    const/4 v9, 0x0

    const/16 v11, 0x60

    const-string v2, "Filled.Close"

    const/high16 v3, 0x41c00000    # 24.0f

    const/high16 v4, 0x41c00000    # 24.0f

    const/high16 v5, 0x41c00000    # 24.0f

    const/high16 v6, 0x41c00000    # 24.0f

    const-wide/16 v7, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v11}, Lo2/d;-><init>(Ljava/lang/String;FFFFJIZI)V

    sget v0, Lo2/f0;->a:I

    new-instance v0, Li2/c1;

    sget-wide v2, Li2/x;->b:J

    invoke-direct {v0, v2, v3}, Li2/c1;-><init>(J)V

    new-instance v2, Laa3/u0;

    const/4 v3, 0x5

    invoke-direct {v2, v3}, Laa3/u0;-><init>(I)V

    const/high16 v3, 0x41980000    # 19.0f

    const v4, 0x40cd1eb8    # 6.41f

    invoke-virtual {v2, v3, v4}, Laa3/u0;->t(FF)V

    const v5, 0x418cb852    # 17.59f

    const/high16 v6, 0x40a00000    # 5.0f

    invoke-virtual {v2, v5, v6}, Laa3/u0;->r(FF)V

    const/high16 v7, 0x41400000    # 12.0f

    const v8, 0x412970a4    # 10.59f

    invoke-virtual {v2, v7, v8}, Laa3/u0;->r(FF)V

    invoke-virtual {v2, v4, v6}, Laa3/u0;->r(FF)V

    invoke-virtual {v2, v6, v4}, Laa3/u0;->r(FF)V

    invoke-virtual {v2, v8, v7}, Laa3/u0;->r(FF)V

    invoke-virtual {v2, v6, v5}, Laa3/u0;->r(FF)V

    invoke-virtual {v2, v4, v3}, Laa3/u0;->r(FF)V

    const v4, 0x41568f5c    # 13.41f

    invoke-virtual {v2, v7, v4}, Laa3/u0;->r(FF)V

    invoke-virtual {v2, v5, v3}, Laa3/u0;->r(FF)V

    invoke-virtual {v2, v3, v5}, Laa3/u0;->r(FF)V

    invoke-virtual {v2, v4, v7}, Laa3/u0;->r(FF)V

    invoke-virtual {v2}, Laa3/u0;->i()V

    iget-object v2, v2, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v2, v0}, Lo2/d;->a(Lo2/d;Ljava/util/ArrayList;Li2/c1;)V

    invoke-virtual {v1}, Lo2/d;->b()Lo2/e;

    move-result-object v0

    sput-object v0, Lo73/a;->c:Lo2/e;

    return-object v0
.end method

.method public static final D(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 0

    invoke-static {p0, p1}, Lq83/g;->x(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    const-string p0, "Invalid resource ID: "

    invoke-static {p1, p0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static E()Lb3/e;
    .locals 2

    sget-object v0, Lb3/e;->f:Lb3/e;

    if-nez v0, :cond_0

    new-instance v0, Lb3/e;

    invoke-direct {v0}, Lb3/b;-><init>()V

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    sput-object v0, Lb3/e;->f:Lb3/e;

    :cond_0
    sget-object v0, Lb3/e;->f:Lb3/e;

    const-string v1, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static F()Lmf/t;
    .locals 1

    sget-object v0, Lmf/t;->h:Lmf/t;

    return-object v0
.end method

.method public static final G(Lj93/z;)Ljava/lang/reflect/Field;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/UtilKt;->asReflectProperty(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/ReflectKProperty;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/ReflectKProperty;->getJavaField()Ljava/lang/reflect/Field;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final H(Lj93/g;)Ljava/lang/reflect/Method;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lkotlin/reflect/jvm/internal/UtilKt;->asReflectCallable(Ljava/lang/Object;)Lkotlin/reflect/jvm/internal/ReflectKCallable;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lkotlin/reflect/jvm/internal/ReflectKCallable;->getCaller()Lm93/g;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lm93/g;->getMember()Ljava/lang/reflect/Member;

    move-result-object p0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    instance-of v1, p0, Ljava/lang/reflect/Method;

    if-eqz v1, :cond_1

    check-cast p0, Ljava/lang/reflect/Method;

    return-object p0

    :cond_1
    return-object v0
.end method

.method public static final I(Lj93/a0;)Ljava/lang/reflect/Type;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object p0

    return-object p0
.end method

.method public static final J(Ll3/w;JLb3/j3;)I
    .locals 4

    if-eqz p3, :cond_0

    invoke-interface {p3}, Lb3/j3;->h()F

    move-result p3

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    const-wide v0, 0xffffffffL

    and-long/2addr v0, p1

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-virtual {p0, v1}, Ll3/w;->e(F)I

    move-result v1

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-virtual {p0, v1}, Ll3/w;->f(I)F

    move-result v3

    sub-float/2addr v3, p3

    cmpg-float v2, v2, v3

    if-ltz v2, :cond_3

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-virtual {p0, v1}, Ll3/w;->b(I)F

    move-result v2

    add-float/2addr v2, p3

    cmpl-float v0, v0, v2

    if-lez v0, :cond_1

    goto :goto_1

    :cond_1
    const/16 v0, 0x20

    shr-long/2addr p1, v0

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    neg-float v0, p3

    cmpg-float p2, p2, v0

    if-ltz p2, :cond_3

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    iget p0, p0, Ll3/w;->d:F

    add-float/2addr p0, p3

    cmpl-float p0, p1, p0

    if-lez p0, :cond_2

    goto :goto_1

    :cond_2
    return v1

    :cond_3
    :goto_1
    const/4 p0, -0x1

    return p0
.end method

.method public static K()Lmf/t;
    .locals 1

    sget-object v0, Lmf/t;->f:Lmf/t;

    return-object v0
.end method

.method public static final L(Lu0/s0;Lh2/c;I)J
    .locals 3

    invoke-virtual {p0}, Lu0/s0;->d()Lu0/p1;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, v0, Lu0/p1;->a:Ll3/r0;

    iget-object v0, v0, Ll3/r0;->b:Ll3/w;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lu0/s0;->c()Ly2/y;

    move-result-object p0

    if-eqz v0, :cond_2

    if-nez p0, :cond_1

    goto :goto_1

    :cond_1
    const-wide/16 v1, 0x0

    invoke-interface {p0, v1, v2}, Ly2/y;->y(J)J

    move-result-wide v1

    invoke-virtual {p1, v1, v2}, Lh2/c;->l(J)Lh2/c;

    move-result-object p0

    sget-object p1, Ll3/p0;->b:Li7/g;

    invoke-virtual {v0, p0, p2, p1}, Ll3/w;->h(Lh2/c;ILi7/g;)J

    move-result-wide p0

    return-wide p0

    :cond_2
    :goto_1
    sget-wide p0, Ll3/u0;->b:J

    return-wide p0
.end method

.method public static final M(Lce/k;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "region"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final N(Lce/k;Ljava/lang/String;Ljava/lang/String;)Lcg/o;
    .locals 3

    invoke-virtual {p0, p1, p2}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    :try_start_0
    sget-object v0, Lcg/o;->i:Lcg/n;

    invoke-static {v0, p0}, Lcg/n;->a(Lcg/n;Ljava/lang/String;)Lcg/o;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance v0, Laws/sdk/kotlin/runtime/ConfigurationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Failed to parse config property "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, p2}, Lo73/a;->p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " as a URL"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final O(Ln6/j;)Z
    .locals 3

    iget-object p0, p0, Ln6/j;->a:Ln6/o;

    sget-object v0, Ln6/q;->w:Ln6/q;

    const/4 v1, 0x0

    invoke-interface {p0, v1, v0}, Ln6/o;->a(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lw6/b;

    if-eqz p0, :cond_0

    iget-object p0, p0, Lw6/b;->a:Lw6/a;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    const/4 v0, 0x0

    if-eqz p0, :cond_2

    sget-object v2, Lw6/c;->a:Lt9/c0;

    iget-object p0, p0, Lw6/a;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {p0, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_1

    move-object p0, v1

    :cond_1
    check-cast p0, Ljava/util/List;

    if-eqz p0, :cond_2

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Ljava/lang/String;

    :cond_2
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result p0

    if-nez p0, :cond_3

    goto :goto_1

    :cond_3
    return v0

    :cond_4
    :goto_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final P(Lr93/n0;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lr93/n0;->getGetter()Lu93/n0;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final Q(I)Z
    .locals 1

    invoke-static {p0}, Ljava/lang/Character;->getType(I)I

    move-result p0

    const/16 v0, 0x17

    if-eq p0, v0, :cond_1

    const/16 v0, 0x14

    if-eq p0, v0, :cond_1

    const/16 v0, 0x16

    if-eq p0, v0, :cond_1

    const/16 v0, 0x1e

    if-eq p0, v0, :cond_1

    const/16 v0, 0x1d

    if-eq p0, v0, :cond_1

    const/16 v0, 0x18

    if-eq p0, v0, :cond_1

    const/16 v0, 0x15

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final R(I)Z
    .locals 1

    invoke-static {p0}, Ljava/lang/Character;->isWhitespace(I)Z

    move-result v0

    if-nez v0, :cond_1

    const/16 v0, 0xa0

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final S(I)Z
    .locals 2

    invoke-static {p0}, Lo73/a;->R(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Character;->getType(I)I

    move-result v0

    const/16 v1, 0xe

    if-eq v0, v1, :cond_1

    const/16 v1, 0xd

    if-eq v0, v1, :cond_1

    const/16 v0, 0xa

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static T(FFF)F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p2

    mul-float/2addr v0, p0

    mul-float/2addr p2, p1

    add-float/2addr p2, v0

    return p2
.end method

.method public static final U(Li93/j;)I
    .locals 3

    sget-object v0, Lg93/d;->w:Lg93/c;

    iget v0, p0, Li93/h;->w:I

    invoke-virtual {p0}, Li93/j;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    iget p0, p0, Li93/h;->x:I

    const v1, 0x7fffffff

    if-ge p0, v1, :cond_0

    add-int/lit8 p0, p0, 0x1

    sget-object v1, Lg93/d;->x:Lg93/a;

    invoke-virtual {v1, v0, p0}, Lg93/d;->h(II)I

    move-result p0

    return p0

    :cond_0
    const/high16 v1, -0x80000000

    if-le v0, v1, :cond_1

    add-int/lit8 v0, v0, -0x1

    sget-object v1, Lg93/d;->x:Lg93/a;

    invoke-virtual {v1, v0, p0}, Lg93/d;->h(II)I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    return p0

    :cond_1
    sget-object p0, Lg93/d;->x:Lg93/a;

    invoke-virtual {p0}, Lg93/a;->f()I

    move-result p0

    return p0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Cannot get random in empty range: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static V(Landroid/view/View;Landroid/view/autofill/AutofillManager;IZ)V
    .locals 0

    invoke-virtual {p1, p0, p2, p3}, Landroid/view/autofill/AutofillManager;->notifyViewVisibilityChanged(Landroid/view/View;IZ)V

    return-void
.end method

.method public static W(I[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1

    array-length v0, p1

    if-ge v0, p0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    invoke-static {p1, p0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/lang/Object;

    return-object p0

    :cond_0
    array-length v0, p1

    if-le v0, p0, :cond_1

    const/4 v0, 0x0

    aput-object v0, p1, p0

    :cond_1
    return-object p1
.end method

.method public static X(Landroid/view/Window;Z)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    if-eqz p1, :cond_0

    and-int/lit16 p1, v0, -0x701

    goto :goto_0

    :cond_0
    or-int/lit16 p1, v0, 0x700

    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void
.end method

.method public static final Y(Ln6/i;)Z
    .locals 2

    instance-of v0, p0, Lp6/v;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p0, Ln6/k;

    if-eqz v0, :cond_3

    check-cast p0, Ln6/k;

    iget-object p0, p0, Ln6/k;->b:Ljava/util/ArrayList;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln6/i;

    invoke-static {v0}, Lo73/a;->Y(Ln6/i;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    :cond_3
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static Z(ILt9/o;Lx8/n;)Lbb/f;
    .locals 10

    invoke-static {p1, p2}, Lbb/f;->a(Lt9/o;Lx8/n;)Lbb/f;

    move-result-object v0

    :goto_0
    iget v1, v0, Lbb/f;->a:I

    if-eq v1, p0, :cond_2

    const-string v2, "WavHeaderReader"

    const-string v3, "Ignoring unknown WAV chunk: "

    invoke-static {v1, v3, v2}, Ly00/t7;->r(ILjava/lang/String;Ljava/lang/String;)V

    iget-wide v2, v0, Lbb/f;->b:J

    const-wide/16 v4, 0x8

    add-long/2addr v4, v2

    const-wide/16 v6, 0x2

    rem-long v6, v2, v6

    const-wide/16 v8, 0x0

    cmp-long v0, v6, v8

    if-eqz v0, :cond_0

    const-wide/16 v4, 0x9

    add-long/2addr v4, v2

    :cond_0
    const-wide/32 v2, 0x7fffffff

    cmp-long v0, v4, v2

    if-gtz v0, :cond_1

    long-to-int v0, v4

    invoke-interface {p1, v0}, Lt9/o;->n(I)V

    invoke-static {p1, p2}, Lbb/f;->a(Lt9/o;Lx8/n;)Lbb/f;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p1, "Chunk is too large (~2GB+) to skip; id: "

    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroidx/media3/common/ParserException;->c(Ljava/lang/String;)Landroidx/media3/common/ParserException;

    move-result-object p0

    throw p0

    :cond_2
    return-object v0
.end method

.method public static final a(Landroidx/compose/ui/Modifier;Lam/h;Lam/g;FLam/a;FLam/g;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v8, p7

    move/from16 v9, p9

    sget-object v0, Lam/f;->w:Lam/f;

    move-object/from16 v2, p8

    check-cast v2, Lp1/q;

    const v3, -0x5d6ceaab

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v9, 0xe

    if-nez v3, :cond_1

    invoke-virtual {v2, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v9

    goto :goto_1

    :cond_1
    move v3, v9

    :goto_1
    and-int/lit8 v4, v9, 0x70

    const/16 v5, 0x20

    if-nez v4, :cond_3

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v5

    goto :goto_2

    :cond_2
    const/16 v0, 0x10

    :goto_2
    or-int/2addr v3, v0

    :cond_3
    and-int/lit16 v0, v9, 0x380

    move-object/from16 v12, p1

    if-nez v0, :cond_5

    invoke-virtual {v2, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v0, 0x100

    goto :goto_3

    :cond_4
    const/16 v0, 0x80

    :goto_3
    or-int/2addr v3, v0

    :cond_5
    and-int/lit16 v0, v9, 0x1c00

    move-object/from16 v14, p2

    if-nez v0, :cond_7

    invoke-virtual {v2, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v0, 0x800

    goto :goto_4

    :cond_6
    const/16 v0, 0x400

    :goto_4
    or-int/2addr v3, v0

    :cond_7
    const v0, 0xe000

    and-int v7, v9, v0

    const/16 v10, 0x4000

    move/from16 v11, p3

    if-nez v7, :cond_9

    invoke-virtual {v2, v11}, Lp1/q;->d(F)Z

    move-result v7

    if-eqz v7, :cond_8

    move v7, v10

    goto :goto_5

    :cond_8
    const/16 v7, 0x2000

    :goto_5
    or-int/2addr v3, v7

    :cond_9
    const/high16 v7, 0x70000

    and-int v13, v9, v7

    if-nez v13, :cond_b

    move-object/from16 v13, p4

    invoke-virtual {v2, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_a

    const/high16 v16, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v16, 0x10000

    :goto_6
    or-int v3, v3, v16

    goto :goto_7

    :cond_b
    move-object/from16 v13, p4

    :goto_7
    const/high16 v16, 0x380000

    and-int v17, v9, v16

    move/from16 p8, v0

    const/high16 v0, 0x100000

    if-nez v17, :cond_d

    move/from16 v17, v7

    move/from16 v7, p5

    invoke-virtual {v2, v7}, Lp1/q;->d(F)Z

    move-result v18

    if-eqz v18, :cond_c

    move/from16 v18, v0

    goto :goto_8

    :cond_c
    const/high16 v18, 0x80000

    :goto_8
    or-int v3, v3, v18

    goto :goto_9

    :cond_d
    move/from16 v17, v7

    move/from16 v7, p5

    :goto_9
    const/high16 v18, 0x1c00000

    and-int v19, v9, v18

    move-object/from16 v15, p6

    if-nez v19, :cond_f

    invoke-virtual {v2, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_e

    const/high16 v20, 0x800000

    goto :goto_a

    :cond_e
    const/high16 v20, 0x400000

    :goto_a
    or-int v3, v3, v20

    :cond_f
    const/high16 v20, 0xe000000

    and-int v20, v9, v20

    if-nez v20, :cond_11

    invoke-virtual {v2, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_10

    const/high16 v20, 0x4000000

    goto :goto_b

    :cond_10
    const/high16 v20, 0x2000000

    :goto_b
    or-int v3, v3, v20

    :cond_11
    const v20, 0xb6db6db

    and-int v6, v3, v20

    const v4, 0x2492492

    if-ne v6, v4, :cond_13

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_12

    goto :goto_c

    :cond_12
    invoke-virtual {v2}, Lp1/q;->X()V

    goto/16 :goto_15

    :cond_13
    :goto_c
    const v4, 0x41fecdaf

    invoke-virtual {v2, v4}, Lp1/q;->f0(I)V

    and-int/lit8 v4, v3, 0x70

    const/4 v6, 0x0

    if-ne v4, v5, :cond_14

    const/4 v4, 0x1

    goto :goto_d

    :cond_14
    move v4, v6

    :goto_d
    and-int v5, v3, p8

    if-ne v5, v10, :cond_15

    const/4 v5, 0x1

    goto :goto_e

    :cond_15
    move v5, v6

    :goto_e
    or-int/2addr v4, v5

    and-int v5, v3, v16

    if-ne v5, v0, :cond_16

    const/4 v0, 0x1

    goto :goto_f

    :cond_16
    move v0, v6

    :goto_f
    or-int/2addr v0, v4

    and-int/lit16 v4, v3, 0x380

    const/16 v5, 0x100

    if-ne v4, v5, :cond_17

    const/4 v4, 0x1

    goto :goto_10

    :cond_17
    move v4, v6

    :goto_10
    or-int/2addr v0, v4

    and-int/lit16 v4, v3, 0x1c00

    const/16 v5, 0x800

    if-ne v4, v5, :cond_18

    const/4 v4, 0x1

    goto :goto_11

    :cond_18
    move v4, v6

    :goto_11
    or-int/2addr v0, v4

    and-int v4, v3, v18

    const/high16 v5, 0x800000

    if-ne v4, v5, :cond_19

    const/4 v4, 0x1

    goto :goto_12

    :cond_19
    move v4, v6

    :goto_12
    or-int/2addr v0, v4

    and-int v4, v3, v17

    const/high16 v5, 0x20000

    if-ne v4, v5, :cond_1a

    const/4 v4, 0x1

    goto :goto_13

    :cond_1a
    move v4, v6

    :goto_13
    or-int/2addr v0, v4

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_1b

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v4, v0, :cond_1c

    :cond_1b
    new-instance v10, Lam/c;

    move-object/from16 v16, v13

    move v13, v7

    invoke-direct/range {v10 .. v16}, Lam/c;-><init>(FLam/h;FLam/g;Lam/g;Lam/a;)V

    invoke-virtual {v2, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v10

    :cond_1c
    check-cast v4, Ly2/r0;

    invoke-virtual {v2, v6}, Lp1/q;->q(Z)V

    shr-int/lit8 v0, v3, 0x18

    and-int/lit8 v0, v0, 0xe

    shl-int/lit8 v3, v3, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v0, v3

    iget-wide v5, v2, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v2, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    shl-int/lit8 v0, v0, 0x6

    and-int/lit16 v0, v0, 0x380

    or-int/lit8 v0, v0, 0x6

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v10, v2, Lp1/q;->S:Z

    if-eqz v10, :cond_1d

    invoke-virtual {v2, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_14

    :cond_1d
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_14
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v2, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v2, v4, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v5, v2, Lp1/q;->S:Z

    if-nez v5, :cond_1e

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1f

    :cond_1e
    invoke-static {v3, v2, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1f
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v2, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v0, 0x6

    and-int/lit8 v0, v0, 0xe

    const/4 v3, 0x1

    invoke-static {v0, v8, v2, v3}, Lih0/d0;->y(ILx1/b;Lp1/q;Z)V

    :goto_15
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_20

    new-instance v0, Lam/d;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v0 .. v9}, Lam/d;-><init>(Landroidx/compose/ui/Modifier;Lam/h;Lam/g;FLam/a;FLam/g;Lx1/b;I)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_20
    return-void
.end method

.method public static final a0(II)I
    .locals 1

    rsub-int/lit8 v0, p1, 0x20

    ushr-int/2addr p0, v0

    neg-int p1, p1

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p0, p1

    return p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Lam/h;Lam/g;FLam/a;FLam/g;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 20

    move-object/from16 v8, p8

    check-cast v8, Lp1/q;

    const v0, -0x83317a7

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    const v0, 0x86030

    or-int v0, p9, v0

    const v1, 0x16db6db

    and-int/2addr v0, v1

    const v1, 0x492492

    if-ne v0, v1, :cond_1

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object/from16 v12, p1

    move-object/from16 v15, p4

    move-object/from16 v17, p6

    goto :goto_3

    :cond_1
    :goto_0
    invoke-virtual {v8}, Lp1/q;->Z()V

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_3

    invoke-virtual {v8}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object/from16 v1, p1

    move-object/from16 v4, p4

    move-object/from16 v6, p6

    goto :goto_2

    :cond_3
    :goto_1
    sget-object v0, Lam/h;->w:Lam/h;

    sget-object v1, Lam/a;->w:Lam/a;

    move-object/from16 v6, p2

    move-object v4, v1

    move-object v1, v0

    :goto_2
    invoke-virtual {v8}, Lp1/q;->r()V

    sget-object v0, Lam/f;->w:Lam/f;

    const v9, 0x61b6db6

    move-object/from16 v0, p0

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v5, p5

    move-object/from16 v7, p7

    invoke-static/range {v0 .. v9}, Lo73/a;->a(Landroidx/compose/ui/Modifier;Lam/h;Lam/g;FLam/a;FLam/g;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    move-object v12, v1

    move-object v15, v4

    move-object/from16 v17, v6

    :goto_3
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v10, Lam/e;

    move-object/from16 v11, p0

    move-object/from16 v13, p2

    move/from16 v14, p3

    move/from16 v16, p5

    move-object/from16 v18, p7

    move/from16 v19, p9

    invoke-direct/range {v10 .. v19}, Lam/e;-><init>(Landroidx/compose/ui/Modifier;Lam/h;Lam/g;FLam/a;FLam/g;Lx1/b;I)V

    iput-object v10, v0, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method public static b0(Landroid/content/Context;Ljava/lang/String;JI)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    const v0, 0x7f1301f2

    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourcePackageName(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "raw"

    invoke-virtual {p0, p1, v1, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object p0

    const/16 p1, 0x400

    new-array v0, p1, [B

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    invoke-virtual {p0, p2, p3}, Ljava/io/InputStream;->skip(J)J

    if-gtz p4, :cond_0

    const p4, 0x7fffffff

    :cond_0
    :goto_0
    if-lez p4, :cond_1

    invoke-static {p4, p1}, Ljava/lang/Math;->min(II)I

    move-result p2

    const/4 p3, 0x0

    invoke-virtual {p0, v0, p3, p2}, Ljava/io/InputStream;->read([BII)I

    move-result p2

    const/4 v2, -0x1

    if-eq p2, v2, :cond_1

    invoke-virtual {v1, v0, p3, p2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    sub-int/2addr p4, p2

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    const-string p0, "UTF-8"

    invoke-virtual {v1, p0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unsupported encoding UTF8. This should always be supported."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :catch_1
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Failed to read license or metadata text."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static final c(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, 0x4af006c4    # 7865186.0f

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lp1/q;->X()V

    goto :goto_2

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_2

    sget-object v0, Lp6/w0;->w:Lp6/w0;

    invoke-virtual {p0, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, Lj93/g;

    check-cast v0, Lc93/a;

    const v1, -0x428332f6

    invoke-virtual {p0, v1}, Lp1/q;->f0(I)V

    const v1, 0x7076b8d0

    invoke-virtual {p0, v1}, Lp1/q;->f0(I)V

    iget-object v1, p0, Lp1/q;->a:Lhb3/a0;

    instance-of v1, v1, Ln6/b;

    if-eqz v1, :cond_5

    invoke-virtual {p0}, Lp1/q;->c0()V

    iget-boolean v1, p0, Lp1/q;->S:Z

    if-eqz v1, :cond_3

    new-instance v1, Lch/c;

    const/16 v2, 0x9

    invoke-direct {v1, v0, v2}, Lch/c;-><init>(Lc93/a;I)V

    invoke-virtual {p0, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lp1/q;->s0()V

    :goto_1
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v0, v1, v1}, Lm4/a;->y(Lp1/q;ZZZ)V

    :goto_2
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_4

    new-instance v0, Lp0/w0;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lp0/w0;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void

    :cond_5
    invoke-static {}, Lp1/x;->w()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final d(Ln6/r;Ljava/lang/String;Ln6/o;ILandroidx/compose/runtime/Composer;II)V
    .locals 6

    move-object v4, p4

    check-cast v4, Lp1/q;

    const p4, 0x1d5027f3

    invoke-virtual {v4, p4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p4, p5, 0x6

    if-nez p4, :cond_2

    and-int/lit8 p4, p5, 0x8

    if-nez p4, :cond_0

    invoke-virtual {v4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p4

    goto :goto_0

    :cond_0
    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p4

    :goto_0
    if-eqz p4, :cond_1

    const/4 p4, 0x4

    goto :goto_1

    :cond_1
    const/4 p4, 0x2

    :goto_1
    or-int/2addr p4, p5

    goto :goto_2

    :cond_2
    move p4, p5

    :goto_2
    and-int/lit8 v0, p5, 0x30

    if-nez v0, :cond_4

    invoke-virtual {v4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x20

    goto :goto_3

    :cond_3
    const/16 v0, 0x10

    :goto_3
    or-int/2addr p4, v0

    :cond_4
    and-int/lit8 v0, p6, 0x4

    if-eqz v0, :cond_5

    or-int/lit16 p4, p4, 0x180

    goto :goto_5

    :cond_5
    and-int/lit16 v1, p5, 0x180

    if-nez v1, :cond_7

    invoke-virtual {v4, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/16 v1, 0x100

    goto :goto_4

    :cond_6
    const/16 v1, 0x80

    :goto_4
    or-int/2addr p4, v1

    :cond_7
    :goto_5
    and-int/lit8 v1, p6, 0x8

    if-eqz v1, :cond_8

    or-int/lit16 p4, p4, 0xc00

    goto :goto_7

    :cond_8
    and-int/lit16 v2, p5, 0xc00

    if-nez v2, :cond_a

    invoke-virtual {v4, p3}, Lp1/q;->e(I)Z

    move-result v2

    if-eqz v2, :cond_9

    const/16 v2, 0x800

    goto :goto_6

    :cond_9
    const/16 v2, 0x400

    :goto_6
    or-int/2addr p4, v2

    :cond_a
    :goto_7
    or-int/lit16 p4, p4, 0x6000

    and-int/lit16 v2, p4, 0x2493

    const/16 v3, 0x2492

    if-ne v2, v3, :cond_c

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_b

    goto :goto_8

    :cond_b
    invoke-virtual {v4}, Lp1/q;->X()V

    move p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_9

    :cond_c
    :goto_8
    if-eqz v0, :cond_d

    sget-object p2, Ln6/m;->a:Ln6/m;

    :cond_d
    move-object v2, p2

    if-eqz v1, :cond_e

    const/4 p3, 0x1

    :cond_e
    move v3, p3

    and-int/lit8 p2, p4, 0xe

    const/high16 p3, 0x30000

    or-int/2addr p2, p3

    and-int/lit8 p3, p4, 0x70

    or-int/2addr p2, p3

    and-int/lit16 p3, p4, 0x380

    or-int/2addr p2, p3

    and-int/lit16 p3, p4, 0x1c00

    or-int/2addr p2, p3

    const p3, 0xe000

    and-int/2addr p3, p4

    or-int v5, p2, p3

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v5}, Lo73/a;->e(Ln6/r;Ljava/lang/String;Ln6/o;ILandroidx/compose/runtime/Composer;I)V

    move-object p1, v0

    move-object p2, v1

    move-object p3, v2

    move p4, v3

    :goto_9
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_f

    new-instance p0, Lh00/i;

    invoke-direct/range {p0 .. p6}, Lh00/i;-><init>(Ln6/r;Ljava/lang/String;Ln6/o;III)V

    iput-object p0, v0, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method public static final e(Ln6/r;Ljava/lang/String;Ln6/o;ILandroidx/compose/runtime/Composer;I)V
    .locals 7

    check-cast p4, Lp1/q;

    const v0, 0x7baf0605

    invoke-virtual {p4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p5, 0x8

    if-nez v0, :cond_0

    invoke-virtual {p4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, p5

    goto :goto_2

    :cond_2
    move v0, p5

    :goto_2
    and-int/lit8 v1, p5, 0x30

    const/16 v2, 0x20

    if-nez v1, :cond_4

    invoke-virtual {p4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    const/16 v1, 0x10

    :goto_3
    or-int/2addr v0, v1

    :cond_4
    and-int/lit16 v1, p5, 0x180

    if-nez v1, :cond_6

    invoke-virtual {p4, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    const/16 v1, 0x100

    goto :goto_4

    :cond_5
    const/16 v1, 0x80

    :goto_4
    or-int/2addr v0, v1

    :cond_6
    and-int/lit16 v1, p5, 0xc00

    if-nez v1, :cond_8

    invoke-virtual {p4, p3}, Lp1/q;->e(I)Z

    move-result v1

    if-eqz v1, :cond_7

    const/16 v1, 0x800

    goto :goto_5

    :cond_7
    const/16 v1, 0x400

    :goto_5
    or-int/2addr v0, v1

    :cond_8
    and-int/lit16 v1, p5, 0x6000

    const/4 v3, 0x0

    if-nez v1, :cond_b

    const v1, 0x8000

    and-int/2addr v1, p5

    if-nez v1, :cond_9

    invoke-virtual {p4, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_6

    :cond_9
    invoke-virtual {p4, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_6
    if-eqz v1, :cond_a

    const/16 v1, 0x4000

    goto :goto_7

    :cond_a
    const/16 v1, 0x2000

    :goto_7
    or-int/2addr v0, v1

    :cond_b
    const/high16 v1, 0x30000

    and-int/2addr v1, p5

    if-nez v1, :cond_d

    invoke-virtual {p4, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_c

    const/high16 v1, 0x20000

    goto :goto_8

    :cond_c
    const/high16 v1, 0x10000

    :goto_8
    or-int/2addr v0, v1

    :cond_d
    const v1, 0x12493

    and-int/2addr v1, v0

    const v4, 0x12492

    if-ne v1, v4, :cond_f

    invoke-virtual {p4}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_e

    goto :goto_9

    :cond_e
    invoke-virtual {p4}, Lp1/q;->X()V

    goto/16 :goto_d

    :cond_f
    :goto_9
    sget-object v1, Lp1/l;->a:Lp1/v0;

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz p1, :cond_13

    const v6, 0x34b23c22

    invoke-virtual {p4, v6}, Lp1/q;->f0(I)V

    const v6, 0x4c5de2

    invoke-virtual {p4, v6}, Lp1/q;->f0(I)V

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v2, :cond_10

    move v0, v4

    goto :goto_a

    :cond_10
    move v0, v5

    :goto_a
    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_11

    if-ne v2, v1, :cond_12

    :cond_11
    new-instance v2, Lht2/d;

    const/16 v0, 0x18

    invoke-direct {v2, p1, v0}, Lht2/d;-><init>(Ljava/lang/String;I)V

    invoke-virtual {p4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {p4, v5}, Lp1/q;->q(Z)V

    new-instance v0, Lw6/a;

    invoke-direct {v0}, Lw6/a;-><init>()V

    invoke-interface {v2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lw6/b;

    invoke-direct {v2, v0}, Lw6/b;-><init>(Lw6/a;)V

    invoke-interface {p2, v2}, Ln6/o;->d(Ln6/o;)Ln6/o;

    move-result-object v0

    invoke-virtual {p4, v5}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_13
    const v0, 0x34b3acdd

    invoke-virtual {p4, v0}, Lp1/q;->f0(I)V

    invoke-virtual {p4, v5}, Lp1/q;->q(Z)V

    move-object v0, p2

    :goto_b
    const v2, 0x6e3c21fe

    invoke-virtual {p4, v2}, Lp1/q;->f0(I)V

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_14

    sget-object v2, Ln6/p;->w:Ln6/p;

    invoke-virtual {p4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v2, Lj93/g;

    invoke-virtual {p4, v5}, Lp1/q;->q(Z)V

    check-cast v2, Lc93/a;

    const v1, -0x428332f6

    invoke-virtual {p4, v1}, Lp1/q;->f0(I)V

    const v1, 0x7076b8d0

    invoke-virtual {p4, v1}, Lp1/q;->f0(I)V

    iget-object v1, p4, Lp1/q;->a:Lhb3/a0;

    instance-of v1, v1, Ln6/b;

    if-eqz v1, :cond_17

    invoke-virtual {p4}, Lp1/q;->c0()V

    iget-boolean v1, p4, Lp1/q;->S:Z

    if-eqz v1, :cond_15

    new-instance v1, Lch/c;

    const/4 v6, 0x4

    invoke-direct {v1, v2, v6}, Lch/c;-><init>(Lc93/a;I)V

    invoke-virtual {p4, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_15
    invoke-virtual {p4}, Lp1/q;->s0()V

    :goto_c
    new-instance v1, Lm22/b;

    const/16 v2, 0x8

    invoke-direct {v1, v2}, Lm22/b;-><init>(I)V

    invoke-static {p4, v1, p0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v1, Lm22/b;

    const/16 v2, 0x9

    invoke-direct {v1, v2}, Lm22/b;-><init>(I)V

    invoke-static {p4, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v0, Lv6/i;

    invoke-direct {v0, p3}, Lv6/i;-><init>(I)V

    new-instance v1, Lm22/b;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Lm22/b;-><init>(I)V

    invoke-static {p4, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v0, Lm22/b;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lm22/b;-><init>(I)V

    invoke-static {p4, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v0, Lm22/b;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lm22/b;-><init>(I)V

    invoke-static {p4, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p4, v4}, Lp1/q;->q(Z)V

    invoke-virtual {p4, v5}, Lp1/q;->q(Z)V

    invoke-virtual {p4, v5}, Lp1/q;->q(Z)V

    :goto_d
    invoke-virtual {p4}, Lp1/q;->u()Lp1/v1;

    move-result-object p4

    if-eqz p4, :cond_16

    new-instance v0, Lm31/h;

    const/16 v6, 0x8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v6}, Lm31/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, p4, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void

    :cond_17
    invoke-static {}, Lp1/x;->w()V

    throw v3
.end method

.method public static final f(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/SimulationContext;ZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    const-string v0, "restartAction"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p4, Lp1/q;

    const v0, 0x2fca03be

    invoke-virtual {p4, v0}, Lp1/q;->g0(I)Lp1/q;

    if-nez p1, :cond_0

    sget-object v0, Lcom/amplitude/android/engagement/types/DebugStatus;->ERROR:Lcom/amplitude/android/engagement/types/DebugStatus;

    :goto_0
    move-object v2, v0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lcom/amplitude/android/engagement/types/SimulationContext;->getPassesCooldown()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/amplitude/android/engagement/types/SimulationContext;->getPassesSnoozedConditions()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    if-eqz p2, :cond_3

    :cond_2
    sget-object v0, Lcom/amplitude/android/engagement/types/DebugStatus;->SUCCESS:Lcom/amplitude/android/engagement/types/DebugStatus;

    goto :goto_0

    :cond_3
    sget-object v0, Lcom/amplitude/android/engagement/types/DebugStatus;->WARNING:Lcom/amplitude/android/engagement/types/DebugStatus;

    goto :goto_0

    :goto_1
    const/4 v0, 0x0

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/Nudge;->getLifecycleConfig()Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/NudgeLifecycleConfig;->getCooldownLimits()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-static {v1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/amplitude/android/engagement/types/NudgeCooldownLimit;

    goto :goto_2

    :cond_4
    move-object v1, v0

    :goto_2
    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/NudgeCooldownLimit;->getMax()Ljava/lang/Integer;

    move-result-object v3

    goto :goto_3

    :cond_5
    move-object v3, v0

    :goto_3
    if-eqz v1, :cond_a

    if-nez v3, :cond_6

    goto :goto_7

    :cond_6
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v4, 0x1

    if-le v0, v4, :cond_7

    const-string v0, "times"

    goto :goto_4

    :cond_7
    const-string v0, "time"

    :goto_4
    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/NudgeCooldownLimit;->getPeriodCount()Ljava/lang/Integer;

    move-result-object v5

    const/16 v6, 0x20

    if-eqz v5, :cond_8

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/NudgeCooldownLimit;->getPeriodCount()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-le v5, v4, :cond_8

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/NudgeCooldownLimit;->getPeriodCount()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/NudgeCooldownLimit;->getPeriod()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x73

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_5

    :cond_8
    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/NudgeCooldownLimit;->getPeriod()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_9

    const-string v1, "unknown period"

    :cond_9
    :goto_5
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Show a max of "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " per "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Loj/o;

    const-string v3, "User has exceeded limit"

    invoke-direct {v1, v0, v3}, Loj/o;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    :goto_6
    move-object v3, v1

    goto :goto_8

    :cond_a
    :goto_7
    new-instance v1, Loj/o;

    const-string v3, "No limit"

    invoke-direct {v1, v3, v0}, Loj/o;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_6

    :goto_8
    new-instance v1, Loj/l;

    move-object v5, p0

    move-object v4, p1

    move-object v6, p3

    move v7, p5

    invoke-direct/range {v1 .. v7}, Loj/l;-><init>(Lcom/amplitude/android/engagement/types/DebugStatus;Loj/o;Lcom/amplitude/android/engagement/types/SimulationContext;Lcom/amplitude/android/engagement/types/Nudge;Lc93/a;I)V

    const p0, 0x363e4d1f

    invoke-static {p0, p4, v1}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object p0

    const/16 p1, 0x186

    const-string p3, "Limits"

    invoke-static {p3, v2, p0, p4, p1}, Lx30/s0;->b(Ljava/lang/String;Lcom/amplitude/android/engagement/types/DebugStatus;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p4}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-nez p0, :cond_b

    return-void

    :cond_b
    move-object v8, v6

    move-object v6, v4

    new-instance v4, Loj/m;

    move v9, v7

    move v7, p2

    invoke-direct/range {v4 .. v9}, Loj/m;-><init>(Lcom/amplitude/android/engagement/types/Nudge;Lcom/amplitude/android/engagement/types/SimulationContext;ZLc93/a;I)V

    iput-object v4, p0, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final g(Ljava/lang/Integer;Ljava/lang/String;JLandroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;II)V
    .locals 36

    move-object/from16 v2, p1

    move-wide/from16 v3, p2

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v8, p8

    const-string v0, "text"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "modifier"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p7

    check-cast v0, Lp1/q;

    const v1, 0x3252e5f2

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p9, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v7, v8, 0x6

    move v9, v7

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    move-object/from16 v7, p0

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const/4 v9, 0x4

    goto :goto_0

    :cond_1
    const/4 v9, 0x2

    :goto_0
    or-int/2addr v9, v8

    :goto_1
    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x20

    goto :goto_2

    :cond_2
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v9, v10

    invoke-virtual {v0, v3, v4}, Lp1/q;->f(J)Z

    move-result v10

    if-eqz v10, :cond_3

    const/16 v10, 0x100

    goto :goto_3

    :cond_3
    const/16 v10, 0x80

    :goto_3
    or-int/2addr v9, v10

    and-int/lit16 v10, v8, 0xc00

    if-nez v10, :cond_5

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x800

    goto :goto_4

    :cond_4
    const/16 v10, 0x400

    :goto_4
    or-int/2addr v9, v10

    :cond_5
    invoke-virtual {v0, v6}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_6

    const/16 v10, 0x4000

    goto :goto_5

    :cond_6
    const/16 v10, 0x2000

    :goto_5
    or-int/2addr v9, v10

    and-int/lit8 v10, p9, 0x20

    if-eqz v10, :cond_7

    const/high16 v11, 0x30000

    or-int/2addr v9, v11

    move/from16 v11, p6

    goto :goto_7

    :cond_7
    move/from16 v11, p6

    invoke-virtual {v0, v11}, Lp1/q;->h(Z)Z

    move-result v12

    if-eqz v12, :cond_8

    const/high16 v12, 0x20000

    goto :goto_6

    :cond_8
    const/high16 v12, 0x10000

    :goto_6
    or-int/2addr v9, v12

    :goto_7
    const v12, 0x12493

    and-int/2addr v9, v12

    const v12, 0x12492

    if-ne v9, v12, :cond_a

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v9

    if-nez v9, :cond_9

    goto :goto_8

    :cond_9
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v1, v7

    move v7, v11

    goto/16 :goto_e

    :cond_a
    :goto_8
    if-eqz v1, :cond_b

    const/4 v1, 0x0

    move-object v7, v1

    :cond_b
    const/4 v1, 0x1

    if-eqz v10, :cond_c

    move v9, v1

    goto :goto_9

    :cond_c
    move v9, v11

    :goto_9
    sget-object v10, Lb2/e;->K:Lb2/l;

    sget-object v11, Ll0/m;->a:Ll0/e;

    const/16 v12, 0x30

    invoke-static {v11, v10, v0, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v10

    iget-wide v11, v0, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v0, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-eqz v15, :cond_d

    invoke-virtual {v0, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_d
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_a
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v0, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v0, v10, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-nez v12, :cond_e

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_f

    :cond_e
    invoke-static {v11, v0, v11, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v0, v10, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v10, Ll3/d;

    invoke-direct {v10}, Ll3/d;-><init>()V

    const-string v11, "lpm_selector_spacing"

    const-string v12, "lpm_selector_text_icon"

    if-eqz v7, :cond_10

    const-string v13, "[icon]"

    invoke-static {v10, v12, v13}, Lu0/n0;->j(Ll3/d;Ljava/lang/String;Ljava/lang/String;)V

    const-string v13, "[spacer]"

    invoke-static {v10, v11, v13}, Lu0/n0;->j(Ll3/d;Ljava/lang/String;Ljava/lang/String;)V

    :cond_10
    invoke-virtual {v10, v2}, Ll3/d;->b(Ljava/lang/String;)V

    invoke-virtual {v10}, Ll3/d;->k()Ll3/g;

    move-result-object v10

    sget-object v13, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v0, v13}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lg1/h9;

    iget-object v13, v13, Lg1/h9;->l:Ll3/v0;

    const v14, -0x4e069f6f

    invoke-virtual {v0, v14}, Lp1/q;->e0(I)V

    new-instance v14, Ljava/util/LinkedHashMap;

    invoke-direct {v14}, Ljava/util/LinkedHashMap;-><init>()V

    const v15, -0x4e069bdb

    invoke-virtual {v0, v15}, Lp1/q;->e0(I)V

    if-nez v7, :cond_11

    move-object/from16 v35, v7

    :goto_b
    const/4 v1, 0x0

    goto :goto_c

    :cond_11
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v15

    int-to-float v2, v1

    const-wide v5, 0x200000000L

    invoke-static {v2, v5, v6}, Lv63/c;->j(FJ)J

    move-result-wide v17

    invoke-static {v2, v5, v6}, Lv63/c;->j(FJ)J

    move-result-wide v19

    new-instance v2, Lb30/s1;

    invoke-direct {v2, v15, v3, v4, v9}, Lb30/s1;-><init>(IJZ)V

    const v15, 0x28580921

    invoke-static {v15, v0, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    new-instance v15, Lu0/j0;

    new-instance v16, Ll3/d0;

    const/16 v21, 0x4

    invoke-direct/range {v16 .. v21}, Ll3/d0;-><init>(JJI)V

    move-object/from16 v5, v16

    new-instance v6, Lb30/k2;

    const/16 v1, 0x8

    invoke-direct {v6, v2, v1}, Lb30/k2;-><init>(Lx1/b;I)V

    new-instance v1, Lx1/b;

    const v2, -0x35f71b98    # -2242842.0f

    move-object/from16 v35, v7

    const/4 v7, 0x1

    invoke-direct {v1, v6, v7, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-direct {v15, v5, v1}, Lu0/j0;-><init>(Ll3/d0;Lx1/b;)V

    invoke-interface {v14, v12, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide v5, 0x3fd999999999999aL    # 0.4

    invoke-static {v5, v6}, Lv63/c;->f(D)J

    move-result-wide v16

    const/4 v1, 0x0

    int-to-float v5, v1

    const-wide v6, 0x200000000L

    invoke-static {v5, v6, v7}, Lv63/c;->j(FJ)J

    move-result-wide v18

    sget-object v1, Loy/b;->a:Lx1/b;

    new-instance v5, Lu0/j0;

    new-instance v15, Ll3/d0;

    const/16 v20, 0x4

    invoke-direct/range {v15 .. v20}, Ll3/d0;-><init>(JJI)V

    new-instance v6, Lb30/k2;

    const/16 v7, 0x8

    invoke-direct {v6, v1, v7}, Lb30/k2;-><init>(Lx1/b;I)V

    new-instance v1, Lx1/b;

    const/4 v7, 0x1

    invoke-direct {v1, v6, v7, v2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-direct {v5, v15, v1}, Lu0/j0;-><init>(Ll3/d0;Lx1/b;)V

    invoke-interface {v14, v11, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    :goto_c
    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    if-eqz p5, :cond_12

    move-wide v11, v3

    goto :goto_d

    :cond_12
    const v1, 0x3f19999a    # 0.6f

    invoke-static {v1, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v1

    move-wide v11, v1

    :goto_d
    const/16 v33, 0xc30

    const v34, 0x157fa

    move v1, v9

    move-object v9, v10

    const/4 v10, 0x0

    move-object/from16 v30, v13

    move-object/from16 v28, v14

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x2

    const/16 v25, 0x0

    const/16 v26, 0x1

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v32, 0x0

    move-object/from16 v31, v0

    invoke-static/range {v9 .. v34}, Lg1/f9;->c(Ll3/g;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    const/4 v7, 0x1

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    move v7, v1

    move-object/from16 v1, v35

    :goto_e
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_13

    new-instance v0, Lb30/r1;

    move-object/from16 v2, p1

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lb30/r1;-><init>(Ljava/lang/Integer;Ljava/lang/String;JLandroidx/compose/ui/Modifier;ZZII)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method public static final h(Leu/j0;FJLwp/b;JLjava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 29

    move-object/from16 v13, p13

    check-cast v13, Lp1/q;

    const v0, 0x3fb696ef

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    move-object/from16 v7, p7

    invoke-virtual {v13, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    const v1, 0x1b6db0

    or-int/2addr v0, v1

    invoke-virtual {v13}, Lp1/q;->Z()V

    and-int/lit8 v1, p14, 0x1

    if-eqz v1, :cond_2

    invoke-virtual {v13}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v13}, Lp1/q;->X()V

    move/from16 v1, p1

    move-wide/from16 v17, p2

    move-wide/from16 v20, p5

    move/from16 v23, p8

    move-object/from16 v24, p9

    move-object/from16 v25, p10

    move-object/from16 v26, p11

    move-object/from16 v27, p12

    goto :goto_2

    :cond_2
    :goto_1
    const/high16 v1, 0x3f000000    # 0.5f

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v1, v2}, Lge3/g;->c(FF)J

    move-result-wide v3

    const/4 v5, 0x0

    invoke-static {v1, v5}, Lge3/g;->c(FF)J

    move-result-wide v5

    sget-object v1, Leu/c;->K:Leu/c;

    sget-object v8, Leu/c;->L:Leu/c;

    sget-object v9, Leu/c;->M:Leu/c;

    sget-object v10, Leu/c;->N:Leu/c;

    const/4 v11, 0x1

    move-object/from16 v24, v1

    move v1, v2

    move-wide/from16 v17, v3

    move-wide/from16 v20, v5

    move-object/from16 v25, v8

    move-object/from16 v26, v9

    move-object/from16 v27, v10

    move/from16 v23, v11

    :goto_2
    invoke-virtual {v13}, Lp1/q;->r()V

    const v2, 0x3ffffe

    and-int v15, v0, v2

    const v14, 0x46dc6db8

    move-object/from16 v0, p0

    move-object/from16 v4, p4

    move-wide/from16 v2, v17

    move-wide/from16 v5, v20

    move/from16 v8, v23

    move-object/from16 v9, v24

    move-object/from16 v10, v25

    move-object/from16 v11, v26

    move-object/from16 v12, v27

    invoke-static/range {v0 .. v15}, Lo73/a;->i(Leu/j0;FJLwp/b;JLjava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-nez v0, :cond_3

    return-void

    :cond_3
    new-instance v14, Leu/f0;

    move-object/from16 v15, p0

    move-object/from16 v19, p4

    move-object/from16 v22, p7

    move/from16 v28, p14

    move/from16 v16, v1

    invoke-direct/range {v14 .. v28}, Leu/f0;-><init>(Leu/j0;FJLwp/b;JLjava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    iput-object v14, v0, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final i(Leu/j0;FJLwp/b;JLjava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 26

    move-wide/from16 v3, p2

    move-wide/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v10, p9

    move-object/from16 v5, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v0, p14

    move/from16 v1, p15

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    const/4 v11, 0x0

    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v14

    move-object/from16 v15, p13

    check-cast v15, Lp1/q;

    const v11, 0x29299f09

    invoke-virtual {v15, v11}, Lp1/q;->g0(I)Lp1/q;

    iget-object v11, v15, Lp1/q;->a:Lhb3/a0;

    and-int/lit8 v16, v0, 0x70

    move/from16 v2, p1

    if-nez v16, :cond_0

    invoke-virtual {v15, v2}, Lp1/q;->d(F)Z

    :cond_0
    and-int/lit16 v2, v0, 0x380

    if-nez v2, :cond_1

    invoke-virtual {v15, v3, v4}, Lp1/q;->f(J)Z

    :cond_1
    and-int/lit16 v2, v0, 0x1c00

    if-nez v2, :cond_2

    const/4 v2, 0x0

    invoke-virtual {v15, v2}, Lp1/q;->h(Z)Z

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    const v16, 0xe000

    and-int v17, v0, v16

    if-nez v17, :cond_3

    invoke-virtual {v15, v2}, Lp1/q;->h(Z)Z

    :cond_3
    const/high16 v17, 0x380000

    and-int v18, v0, v17

    if-nez v18, :cond_4

    invoke-virtual {v15, v6, v7}, Lp1/q;->f(J)Z

    :cond_4
    const/high16 v18, 0x1c00000

    and-int v18, v0, v18

    if-nez v18, :cond_5

    const/4 v2, 0x0

    invoke-virtual {v15, v2}, Lp1/q;->d(F)Z

    :cond_5
    const/high16 v2, 0xe000000

    and-int/2addr v2, v0

    const/4 v0, 0x0

    if-nez v2, :cond_6

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    :cond_6
    and-int/lit8 v2, v1, 0xe

    if-nez v2, :cond_7

    invoke-virtual {v15, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    :cond_7
    and-int/lit8 v2, v1, 0x70

    if-nez v2, :cond_8

    move/from16 v2, p8

    invoke-virtual {v15, v2}, Lp1/q;->h(Z)Z

    goto :goto_1

    :cond_8
    move/from16 v2, p8

    :goto_1
    and-int/lit16 v0, v1, 0x380

    if-nez v0, :cond_9

    const/4 v0, 0x0

    invoke-virtual {v15, v0}, Lp1/q;->d(F)Z

    :cond_9
    and-int/lit16 v0, v1, 0x1c00

    if-nez v0, :cond_a

    invoke-virtual {v15, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    :cond_a
    and-int v0, v1, v16

    if-nez v0, :cond_b

    invoke-virtual {v15, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    :cond_b
    const/high16 v0, 0x70000

    and-int/2addr v0, v1

    if-nez v0, :cond_c

    invoke-virtual {v15, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    :cond_c
    and-int v0, v1, v17

    if-nez v0, :cond_d

    invoke-virtual {v15, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    :cond_d
    invoke-virtual {v15}, Lp1/q;->Z()V

    and-int/lit8 v0, p14, 0x1

    if-eqz v0, :cond_f

    invoke-virtual {v15}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_e

    goto :goto_2

    :cond_e
    invoke-virtual {v15}, Lp1/q;->X()V

    :cond_f
    :goto_2
    invoke-virtual {v15}, Lp1/q;->r()V

    instance-of v0, v11, Leu/v;

    if-eqz v0, :cond_10

    move-object v0, v11

    check-cast v0, Leu/v;

    goto :goto_3

    :cond_10
    const/4 v0, 0x0

    :goto_3
    invoke-static {v15}, Lp1/x;->E(Landroidx/compose/runtime/Composer;)Lp1/o;

    move-result-object v2

    move-object v1, v0

    new-instance v0, Leu/g0;

    move-object/from16 v19, v9

    move-object/from16 v22, v11

    move-object/from16 v20, v14

    move-object/from16 v21, v15

    move-object/from16 v11, p4

    move/from16 v15, p8

    move-object v14, v8

    move/from16 v8, p1

    move-wide/from16 v24, v3

    move-object/from16 v3, p0

    move-object v4, v10

    move-wide/from16 v9, v24

    move-wide/from16 v24, v6

    move-object v6, v12

    move-object v7, v13

    move-wide/from16 v12, v24

    invoke-direct/range {v0 .. v15}, Leu/g0;-><init>(Leu/v;Lp1/o;Leu/j0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FJLwp/b;JLjava/lang/String;Z)V

    move-wide/from16 v24, v9

    move-object v10, v4

    move-wide/from16 v3, v24

    move-object v8, v14

    move-wide/from16 v24, v12

    move-object v12, v6

    move-object v13, v7

    move-wide/from16 v6, v24

    const v1, 0x7076b8d0

    move-object/from16 v2, v21

    invoke-virtual {v2, v1}, Lp1/q;->f0(I)V

    move-object/from16 v1, v22

    instance-of v1, v1, Leu/v;

    if-eqz v1, :cond_13

    invoke-virtual {v2}, Lp1/q;->c0()V

    iget-boolean v1, v2, Lp1/q;->S:Z

    if-eqz v1, :cond_11

    new-instance v1, Lav/b;

    const/16 v9, 0xa

    invoke-direct {v1, v0, v9}, Lav/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_11
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_4
    sget-object v0, Leu/b;->R:Leu/b;

    invoke-static {v2, v0, v10}, Lp1/x;->K(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Leu/b;->S:Leu/b;

    invoke-static {v2, v0, v5}, Lp1/x;->K(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Leu/b;->T:Leu/b;

    invoke-static {v2, v0, v12}, Lp1/x;->K(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Leu/b;->U:Leu/b;

    invoke-static {v2, v0, v13}, Lp1/x;->K(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Leu/b;->V:Leu/b;

    const/4 v1, 0x0

    invoke-static {v2, v0, v1}, Lp1/x;->K(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Leu/b;->W:Leu/b;

    invoke-static {v2, v0, v1}, Lp1/x;->K(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {p1 .. p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    sget-object v9, Leu/b;->X:Leu/b;

    invoke-static {v2, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v0, Lh2/b;

    invoke-direct {v0, v3, v4}, Lh2/b;-><init>(J)V

    sget-object v9, Leu/b;->Y:Leu/b;

    invoke-static {v2, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Leu/b;->Z:Leu/b;

    move-object/from16 v9, v19

    invoke-static {v2, v0, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Leu/b;->H:Leu/b;

    invoke-static {v2, v0, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Leu/b;->I:Leu/b;

    move-object/from16 v11, p4

    invoke-static {v2, v0, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v0, Lh2/b;

    invoke-direct {v0, v6, v7}, Lh2/b;-><init>(J)V

    sget-object v9, Leu/b;->J:Leu/b;

    invoke-static {v2, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, p0

    iget-object v9, v0, Leu/j0;->a:Lp1/k1;

    invoke-virtual {v9}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/maps/model/LatLng;

    sget-object v14, Leu/b;->K:Leu/b;

    invoke-static {v2, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, Leu/b;->L:Leu/b;

    move-object/from16 v14, v20

    invoke-static {v2, v9, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, Leu/b;->M:Leu/b;

    invoke-static {v2, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, Leu/b;->N:Leu/b;

    invoke-static {v2, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Leu/b;->O:Leu/b;

    invoke-static {v2, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {p8 .. p8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    sget-object v9, Leu/b;->P:Leu/b;

    invoke-static {v2, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Leu/b;->Q:Leu/b;

    invoke-static {v2, v1, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-virtual {v2, v1}, Lp1/q;->q(Z)V

    const/4 v1, 0x0

    invoke-virtual {v2, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-nez v1, :cond_12

    return-void

    :cond_12
    new-instance v0, Leu/h0;

    move-object v2, v11

    move-object v11, v5

    move-object v5, v2

    move/from16 v2, p1

    move/from16 v9, p8

    move/from16 v14, p14

    move/from16 v15, p15

    move-object/from16 v23, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v15}, Leu/h0;-><init>(Leu/j0;FJLwp/b;JLjava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    move-object v1, v0

    move-object/from16 v0, v23

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_13
    const/4 v1, 0x0

    invoke-static {}, Lp1/x;->w()V

    throw v1
.end method

.method public static final j(Lu0/s0;JLb3/j3;)I
    .locals 2

    invoke-virtual {p0}, Lu0/s0;->d()Lu0/p1;

    move-result-object v0

    const/4 v1, -0x1

    if-eqz v0, :cond_1

    iget-object v0, v0, Lu0/p1;->a:Ll3/r0;

    iget-object v0, v0, Ll3/r0;->b:Ll3/w;

    invoke-virtual {p0}, Lu0/s0;->c()Ly2/y;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-interface {p0, p1, p2}, Ly2/y;->y(J)J

    move-result-wide p0

    invoke-static {v0, p0, p1, p3}, Lo73/a;->J(Ll3/w;JLb3/j3;)I

    move-result p2

    if-ne p2, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p2}, Ll3/w;->f(I)F

    move-result p3

    invoke-virtual {v0, p2}, Ll3/w;->b(I)F

    move-result p2

    add-float/2addr p2, p3

    const/high16 p3, 0x40000000    # 2.0f

    div-float/2addr p2, p3

    const/4 p3, 0x1

    const/4 v1, 0x0

    invoke-static {v1, p2, p0, p1, p3}, Lh2/b;->a(FFJI)J

    move-result-wide p0

    invoke-virtual {v0, p0, p1}, Ll3/w;->g(J)I

    move-result p0

    return p0

    :cond_1
    :goto_0
    return v1
.end method

.method public static final k(Lu0/s0;Lh2/c;Lh2/c;I)J
    .locals 2

    invoke-static {p0, p1, p3}, Lo73/a;->L(Lu0/s0;Lh2/c;I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ll3/u0;->c(J)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-wide p0, Ll3/u0;->b:J

    return-wide p0

    :cond_0
    invoke-static {p0, p2, p3}, Lo73/a;->L(Lu0/s0;Lh2/c;I)J

    move-result-wide p0

    invoke-static {p0, p1}, Ll3/u0;->c(J)Z

    move-result p2

    if-eqz p2, :cond_1

    sget-wide p0, Ll3/u0;->b:J

    return-wide p0

    :cond_1
    const/16 p2, 0x20

    shr-long p2, v0, p2

    long-to-int p2, p2

    invoke-static {p2, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    const-wide v0, 0xffffffffL

    and-long/2addr p0, v0

    long-to-int p0, p0

    invoke-static {p0, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {p2, p0}, Lj93/l0;->f(II)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final l(Ll3/r0;I)Z
    .locals 5

    iget-object v0, p0, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v0, p1}, Ll3/w;->d(I)I

    move-result v1

    invoke-virtual {p0, v1}, Ll3/r0;->h(I)I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq p1, v2, :cond_1

    invoke-virtual {v0, v1, v4}, Ll3/w;->c(IZ)I

    move-result v0

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Ll3/r0;->a(I)Lw3/j;

    move-result-object v0

    sub-int/2addr p1, v3

    invoke-virtual {p0, p1}, Ll3/r0;->a(I)Lw3/j;

    move-result-object p0

    if-eq v0, p0, :cond_2

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Ll3/r0;->i(I)Lw3/j;

    move-result-object v0

    invoke-virtual {p0, p1}, Ll3/r0;->a(I)Lw3/j;

    move-result-object p0

    if-eq v0, p0, :cond_2

    :goto_1
    return v3

    :cond_2
    return v4
.end method

.method public static final m(Landroid/graphics/PointF;)J
    .locals 6

    iget v0, p0, Landroid/graphics/PointF;->x:F

    iget p0, p0, Landroid/graphics/PointF;->y:F

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v2, p0

    const/16 p0, 0x20

    shl-long/2addr v0, p0

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    return-wide v0
.end method

.method public static n(Lg/z;Lc4/d0;Lkotlin/jvm/functions/Function1;I)V
    .locals 1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, 0x0

    :cond_0
    const-string p3, "<this>"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Lg/a0;

    const/4 v0, 0x0

    invoke-direct {p3, p2, v0}, Lg/a0;-><init>(Ljava/lang/Object;I)V

    if-eqz p1, :cond_1

    invoke-virtual {p0, p1, p3}, Lg/z;->a(Landroidx/lifecycle/g0;Lg/t;)V

    return-void

    :cond_1
    invoke-virtual {p0, p3}, Lg/z;->b(Lg/t;)Lg/y;

    return-void
.end method

.method public static final o(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Random range is empty: ["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ", "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    filled-new-array {p0, p1}, [Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/4 v4, 0x0

    const/16 v5, 0x3e

    const-string v1, "."

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static q(Lt9/o;)Z
    .locals 4

    new-instance v0, Lx8/n;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lx8/n;-><init>(I)V

    invoke-static {p0, v0}, Lbb/f;->a(Lt9/o;Lx8/n;)Lbb/f;

    move-result-object v1

    iget v1, v1, Lbb/f;->a:I

    const v2, 0x52494646

    const/4 v3, 0x0

    if-eq v1, v2, :cond_0

    const v2, 0x52463634

    if-eq v1, v2, :cond_0

    return v3

    :cond_0
    iget-object v1, v0, Lx8/n;->a:[B

    const/4 v2, 0x4

    invoke-interface {p0, v1, v3, v2}, Lt9/o;->p([BII)V

    invoke-virtual {v0, v3}, Lx8/n;->F(I)V

    invoke-virtual {v0}, Lx8/n;->g()I

    move-result p0

    const v0, 0x57415645

    if-eq p0, v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unsupported form type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "WavHeaderReader"

    invoke-static {v0, p0}, Lx8/a;->g(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final r(D)V
    .locals 3

    const-wide/16 v0, 0x0

    cmpl-double v2, p0, v0

    if-lez v2, :cond_0

    return-void

    :cond_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    invoke-static {v0, p0}, Lo73/a;->o(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final s(II)V
    .locals 0

    if-le p1, p0, :cond_0

    return-void

    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p0, p1}, Lo73/a;->o(Ljava/lang/Number;Ljava/lang/Number;)Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;
    .locals 6

    const-string p2, "<this>"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p2, 0x6134409

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    const p2, -0x789d09e3

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-nez p2, :cond_0

    if-ne v0, v2, :cond_1

    :cond_0
    invoke-virtual {p1, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v0, v1

    :cond_1
    check-cast v0, Ljava/lang/AssertionError;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    const v3, -0x789cc84a

    invoke-virtual {p1, v3}, Lp1/q;->e0(I)V

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_2

    if-ne v4, v2, :cond_3

    :cond_2
    new-instance v4, Lnr0/e;

    const/16 v3, 0x1c

    invoke-direct {v4, p0, v3}, Lnr0/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v4, Lc93/a;

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    const v3, -0x789cbfd3

    invoke-virtual {p1, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lq83/k;->w:Lq83/k;

    invoke-virtual {p1, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-virtual {p1, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_4

    if-ne v5, v2, :cond_5

    :cond_4
    new-instance v5, Ln43/a;

    const/16 v3, 0xd

    invoke-direct {v5, p0, v0, v1, v3}, Ln43/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {p1, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v5, Lc93/m;

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    const v0, 0x7c52c0f6

    invoke-virtual {p1, v0}, Lp1/q;->e0(I)V

    const v0, -0x67db71b3

    invoke-virtual {p1, v0}, Lp1/q;->e0(I)V

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_6

    if-ne v3, v2, :cond_7

    :cond_6
    invoke-interface {v4}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {p1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v3, Lp1/c1;

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    const v0, -0x67db679d

    invoke-virtual {p1, v0}, Lp1/q;->e0(I)V

    invoke-virtual {p1, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p1, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_8

    if-ne v4, v2, :cond_9

    :cond_8
    new-instance v4, Lp1/r2;

    const/4 v0, 0x2

    invoke-direct {v4, v5, v3, v1, v0}, Lp1/r2;-><init>(Lc93/m;Lp1/c1;Lq83/d;I)V

    invoke-virtual {p1, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v4, Lc93/m;

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    invoke-static {p1, v4, p0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object v3
.end method

.method public static u(Lb5/g;Lb5/g;)Lb5/g;
    .locals 4

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Lb5/g;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lb5/g;->d()I

    move-result v2

    invoke-virtual {p1}, Lb5/g;->d()I

    move-result v3

    add-int/2addr v3, v2

    if-ge v1, v3, :cond_3

    invoke-virtual {p0}, Lb5/g;->d()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {p0, v1}, Lb5/g;->b(I)Ljava/util/Locale;

    move-result-object v2

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lb5/g;->d()I

    move-result v2

    sub-int v2, v1, v2

    invoke-virtual {p1, v2}, Lb5/g;->b(I)Ljava/util/Locale;

    move-result-object v2

    :goto_1
    if-eqz v2, :cond_2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result p0

    new-array p0, p0, [Ljava/util/Locale;

    invoke-interface {v0, p0}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/util/Locale;

    new-instance p1, Landroid/os/LocaleList;

    invoke-direct {p1, p0}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    invoke-static {p1}, Lb5/g;->f(Landroid/os/LocaleList;)Lb5/g;

    move-result-object p0

    return-object p0

    :cond_4
    :goto_2
    sget-object p0, Lb5/g;->b:Lb5/g;

    return-object p0
.end method

.method public static final v(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const-string v0, "input"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "0"

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    const/16 v2, 0x31

    const/4 v3, 0x0

    if-nez v1, :cond_0

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v4, 0x30

    if-eq v1, v4, :cond_0

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v2, :cond_3

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v4, 0x1

    if-le v1, v4, :cond_2

    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v2, :cond_2

    invoke-virtual {p0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0xa

    invoke-static {v1, v2}, Ljava/lang/Character;->digit(II)I

    move-result v2

    if-ltz v2, :cond_1

    const/4 v1, 0x2

    if-le v2, v1, :cond_2

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Char "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, " is not a decimal digit"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    const/4 v0, 0x0

    :cond_3
    :goto_0
    if-nez v0, :cond_4

    return-object p0

    :cond_4
    return-object v0
.end method

.method public static w(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;
    .locals 3

    new-instance v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    sget-object v1, Lr30/i;->y:Lr30/i;

    const/16 v1, 0xcb

    const-string v2, "Data element not in the required format or value is invalid as defined in Table A.1"

    invoke-direct {v0, v1, v2, p0}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static x(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;
    .locals 3

    new-instance v0, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;

    sget-object v1, Lr30/i;->y:Lr30/i;

    const/16 v1, 0xc9

    const-string v2, "A message element required as defined in Table A.1 is missing from the message."

    invoke-direct {v0, v1, v2, p0}, Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseParseException;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final y(I)I
    .locals 0

    invoke-static {p0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result p0

    rsub-int/lit8 p0, p0, 0x1f

    return p0
.end method

.method public static z(Li63/g;Lc93/m;)V
    .locals 0

    invoke-static {p0, p1}, Lwb3/f;->z(Lo63/m;Lc93/m;)V

    return-void
.end method
