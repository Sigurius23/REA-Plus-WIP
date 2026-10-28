.class public final Lcc/p;
.super Lcc/g;
.source "SourceFile"


# static fields
.field public static final J:Landroid/graphics/PorterDuff$Mode;


# instance fields
.field public E:Z

.field public F:Z

.field public final G:[F

.field public final H:Landroid/graphics/Matrix;

.field public final I:Landroid/graphics/Rect;

.field public x:Lcc/n;

.field public y:Landroid/graphics/PorterDuffColorFilter;

.field public z:Landroid/graphics/ColorFilter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    sput-object v0, Lcc/p;->J:Landroid/graphics/PorterDuff$Mode;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcc/p;->F:Z

    const/16 v0, 0x9

    .line 3
    new-array v0, v0, [F

    iput-object v0, p0, Lcc/p;->G:[F

    .line 4
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcc/p;->H:Landroid/graphics/Matrix;

    .line 5
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcc/p;->I:Landroid/graphics/Rect;

    .line 6
    new-instance v0, Lcc/n;

    invoke-direct {v0}, Lcc/n;-><init>()V

    iput-object v0, p0, Lcc/p;->x:Lcc/n;

    return-void
.end method

.method public constructor <init>(Lcc/n;)V
    .locals 1

    .line 7
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lcc/p;->F:Z

    const/16 v0, 0x9

    .line 9
    new-array v0, v0, [F

    iput-object v0, p0, Lcc/p;->G:[F

    .line 10
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Lcc/p;->H:Landroid/graphics/Matrix;

    .line 11
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcc/p;->I:Landroid/graphics/Rect;

    .line 12
    iput-object p1, p0, Lcc/p;->x:Lcc/n;

    .line 13
    iget-object v0, p1, Lcc/n;->c:Landroid/content/res/ColorStateList;

    iget-object p1, p1, Lcc/n;->d:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0, v0, p1}, Lcc/p;->a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object p1

    iput-object p1, p0, Lcc/p;->y:Landroid/graphics/PorterDuffColorFilter;

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    .locals 2

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcc/g;->getState()[I

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    new-instance v0, Landroid/graphics/PorterDuffColorFilter;

    invoke-direct {v0, p1, p2}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    return-object v0

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final canApplyTheme()Z
    .locals 1

    iget-object v0, p0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ls4/b;->d(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 11

    iget-object v0, p0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcc/p;->I:Landroid/graphics/Rect;

    invoke-virtual {p0, v0}, Landroid/graphics/drawable/Drawable;->copyBounds(Landroid/graphics/Rect;)V

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v1

    if-lez v1, :cond_9

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v1

    if-gtz v1, :cond_1

    goto/16 :goto_1

    :cond_1
    iget-object v1, p0, Lcc/p;->z:Landroid/graphics/ColorFilter;

    if-nez v1, :cond_2

    iget-object v1, p0, Lcc/p;->y:Landroid/graphics/PorterDuffColorFilter;

    :cond_2
    iget-object v2, p0, Lcc/p;->H:Landroid/graphics/Matrix;

    invoke-virtual {p1, v2}, Landroid/graphics/Canvas;->getMatrix(Landroid/graphics/Matrix;)V

    iget-object v3, p0, Lcc/p;->G:[F

    invoke-virtual {v2, v3}, Landroid/graphics/Matrix;->getValues([F)V

    const/4 v2, 0x0

    aget v4, v3, v2

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    const/4 v5, 0x4

    aget v5, v3, v5

    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    const/4 v6, 0x1

    aget v7, v3, v6

    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v7

    const/4 v8, 0x3

    aget v3, v3, v8

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    const/4 v8, 0x0

    cmpl-float v7, v7, v8

    const/high16 v9, 0x3f800000    # 1.0f

    if-nez v7, :cond_3

    cmpl-float v3, v3, v8

    if-eqz v3, :cond_4

    :cond_3
    move v4, v9

    move v5, v4

    :cond_4
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v3

    int-to-float v3, v3

    mul-float/2addr v3, v4

    float-to-int v3, v3

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v4

    int-to-float v4, v4

    mul-float/2addr v4, v5

    float-to-int v4, v4

    const/16 v5, 0x800

    invoke-static {v5, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-static {v5, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    if-lez v3, :cond_9

    if-gtz v4, :cond_5

    goto :goto_1

    :cond_5
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v5

    iget v7, v0, Landroid/graphics/Rect;->left:I

    int-to-float v7, v7

    iget v10, v0, Landroid/graphics/Rect;->top:I

    int-to-float v10, v10

    invoke-virtual {p1, v7, v10}, Landroid/graphics/Canvas;->translate(FF)V

    invoke-virtual {p0}, Lcc/p;->isAutoMirrored()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-static {p0}, Ls4/b;->h(Lcc/p;)I

    move-result v7

    if-ne v7, v6, :cond_6

    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    move-result v6

    int-to-float v6, v6

    invoke-virtual {p1, v6, v8}, Landroid/graphics/Canvas;->translate(FF)V

    const/high16 v6, -0x40800000    # -1.0f

    invoke-virtual {p1, v6, v9}, Landroid/graphics/Canvas;->scale(FF)V

    :cond_6
    invoke-virtual {v0, v2, v2}, Landroid/graphics/Rect;->offsetTo(II)V

    iget-object v2, p0, Lcc/p;->x:Lcc/n;

    invoke-virtual {v2, v3, v4}, Lcc/n;->b(II)V

    iget-boolean v2, p0, Lcc/p;->F:Z

    if-nez v2, :cond_7

    iget-object v2, p0, Lcc/p;->x:Lcc/n;

    invoke-virtual {v2, v3, v4}, Lcc/n;->g(II)V

    goto :goto_0

    :cond_7
    iget-object v2, p0, Lcc/p;->x:Lcc/n;

    invoke-virtual {v2}, Lcc/n;->a()Z

    move-result v2

    if-nez v2, :cond_8

    iget-object v2, p0, Lcc/p;->x:Lcc/n;

    invoke-virtual {v2, v3, v4}, Lcc/n;->g(II)V

    iget-object v2, p0, Lcc/p;->x:Lcc/n;

    invoke-virtual {v2}, Lcc/n;->f()V

    :cond_8
    :goto_0
    iget-object v2, p0, Lcc/p;->x:Lcc/n;

    invoke-virtual {v2, p1, v1, v0}, Lcc/n;->c(Landroid/graphics/Canvas;Landroid/graphics/ColorFilter;Landroid/graphics/Rect;)V

    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->restoreToCount(I)V

    :cond_9
    :goto_1
    return-void
.end method

.method public final getAlpha()I
    .locals 1

    iget-object v0, p0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ls4/b;->f(Landroid/graphics/drawable/Drawable;)I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lcc/p;->x:Lcc/n;

    iget-object v0, v0, Lcc/n;->b:Lcc/m;

    invoke-virtual {v0}, Lcc/m;->getRootAlpha()I

    move-result v0

    return v0
.end method

.method public final getChangingConfigurations()I
    .locals 2

    iget-object v0, p0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result v0

    return v0

    :cond_0
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->getChangingConfigurations()I

    move-result v0

    iget-object v1, p0, Lcc/p;->x:Lcc/n;

    invoke-virtual {v1}, Lcc/n;->getChangingConfigurations()I

    move-result v1

    or-int/2addr v0, v1

    return v0
.end method

.method public final getColorFilter()Landroid/graphics/ColorFilter;
    .locals 1

    iget-object v0, p0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ls4/b;->g(Landroid/graphics/drawable/Drawable;)Landroid/graphics/ColorFilter;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcc/p;->z:Landroid/graphics/ColorFilter;

    return-object v0
.end method

.method public final getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
    .locals 2

    iget-object v0, p0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    new-instance v0, Lcc/o;

    iget-object v1, p0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v1

    invoke-direct {v0, v1}, Lcc/o;-><init>(Landroid/graphics/drawable/Drawable$ConstantState;)V

    return-object v0

    :cond_0
    iget-object v0, p0, Lcc/p;->x:Lcc/n;

    invoke-virtual {p0}, Lcc/p;->getChangingConfigurations()I

    move-result v1

    iput v1, v0, Lcc/n;->a:I

    iget-object v0, p0, Lcc/p;->x:Lcc/n;

    return-object v0
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    iget-object v0, p0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lcc/p;->x:Lcc/n;

    iget-object v0, v0, Lcc/n;->b:Lcc/m;

    iget v0, v0, Lcc/m;->i:F

    float-to-int v0, v0

    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    iget-object v0, p0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lcc/p;->x:Lcc/n;

    iget-object v0, v0, Lcc/n;->b:Lcc/m;

    iget v0, v0, Lcc/m;->h:F

    float-to-int v0, v0

    return v0
.end method

.method public final getOpacity()I
    .locals 1

    iget-object v0, p0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, -0x3

    return v0
.end method

.method public final inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/drawable/Drawable;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;)V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 3
    invoke-virtual {p0, p1, p2, p3, v0}, Lcc/p;->inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    return-void
.end method

.method public final inflate(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    .line 4
    iget-object v5, v0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v5, :cond_0

    .line 5
    invoke-static {v5, v1, v2, v3, v4}, Ls4/b;->o(Landroid/graphics/drawable/Drawable;Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    return-void

    .line 6
    :cond_0
    iget-object v5, v0, Lcc/p;->x:Lcc/n;

    .line 7
    new-instance v6, Lcc/m;

    invoke-direct {v6}, Lcc/m;-><init>()V

    iput-object v6, v5, Lcc/n;->b:Lcc/m;

    .line 8
    sget-object v6, Lcc/a;->a:[I

    invoke-static {v1, v4, v3, v6}, Le93/b;->R(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v6

    .line 9
    iget-object v7, v0, Lcc/p;->x:Lcc/n;

    .line 10
    iget-object v8, v7, Lcc/n;->b:Lcc/m;

    .line 11
    const-string v9, "tintMode"

    invoke-static {v2, v9}, Le93/b;->L(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v9

    const/4 v10, -0x1

    if-nez v9, :cond_1

    goto :goto_0

    :cond_1
    const/4 v9, 0x6

    .line 12
    invoke-virtual {v6, v9, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v10

    .line 13
    :goto_0
    sget-object v9, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    const/4 v11, 0x3

    const/4 v12, 0x5

    if-eq v10, v11, :cond_3

    if-eq v10, v12, :cond_4

    const/16 v13, 0x9

    if-eq v10, v13, :cond_2

    packed-switch v10, :pswitch_data_0

    goto :goto_1

    .line 14
    :pswitch_0
    sget-object v9, Landroid/graphics/PorterDuff$Mode;->ADD:Landroid/graphics/PorterDuff$Mode;

    goto :goto_1

    .line 15
    :pswitch_1
    sget-object v9, Landroid/graphics/PorterDuff$Mode;->SCREEN:Landroid/graphics/PorterDuff$Mode;

    goto :goto_1

    .line 16
    :pswitch_2
    sget-object v9, Landroid/graphics/PorterDuff$Mode;->MULTIPLY:Landroid/graphics/PorterDuff$Mode;

    goto :goto_1

    .line 17
    :cond_2
    sget-object v9, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    goto :goto_1

    .line 18
    :cond_3
    sget-object v9, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    .line 19
    :cond_4
    :goto_1
    iput-object v9, v7, Lcc/n;->d:Landroid/graphics/PorterDuff$Mode;

    .line 20
    invoke-static {v6, v2, v4}, Le93/b;->H(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object v9

    if-eqz v9, :cond_5

    .line 21
    iput-object v9, v7, Lcc/n;->c:Landroid/content/res/ColorStateList;

    .line 22
    :cond_5
    iget-boolean v9, v7, Lcc/n;->e:Z

    .line 23
    const-string v10, "http://schemas.android.com/apk/res/android"

    const-string v13, "autoMirrored"

    invoke-interface {v2, v10, v13}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_6

    .line 24
    invoke-virtual {v6, v12, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v9

    .line 25
    :cond_6
    iput-boolean v9, v7, Lcc/n;->e:Z

    .line 26
    iget v7, v8, Lcc/m;->j:F

    .line 27
    const-string v9, "viewportWidth"

    invoke-interface {v2, v10, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_7

    const/4 v9, 0x7

    .line 28
    invoke-virtual {v6, v9, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    .line 29
    :cond_7
    iput v7, v8, Lcc/m;->j:F

    .line 30
    iget v7, v8, Lcc/m;->k:F

    .line 31
    const-string v9, "viewportHeight"

    invoke-interface {v2, v10, v9}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_8

    const/16 v9, 0x8

    .line 32
    invoke-virtual {v6, v9, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    .line 33
    :cond_8
    iput v7, v8, Lcc/m;->k:F

    .line 34
    iget v9, v8, Lcc/m;->j:F

    const/4 v12, 0x0

    cmpg-float v9, v9, v12

    if-lez v9, :cond_18

    cmpg-float v7, v7, v12

    if-lez v7, :cond_17

    .line 35
    iget v7, v8, Lcc/m;->h:F

    invoke-virtual {v6, v11, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v7

    iput v7, v8, Lcc/m;->h:F

    .line 36
    iget v7, v8, Lcc/m;->i:F

    const/4 v9, 0x2

    invoke-virtual {v6, v9, v7}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v7

    iput v7, v8, Lcc/m;->i:F

    .line 37
    iget v13, v8, Lcc/m;->h:F

    cmpg-float v13, v13, v12

    if-lez v13, :cond_16

    cmpg-float v7, v7, v12

    if-lez v7, :cond_15

    .line 38
    invoke-virtual {v8}, Lcc/m;->getAlpha()F

    move-result v7

    .line 39
    const-string v12, "alpha"

    invoke-interface {v2, v10, v12}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_9

    const/4 v10, 0x4

    .line 40
    invoke-virtual {v6, v10, v7}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v7

    .line 41
    :cond_9
    invoke-virtual {v8, v7}, Lcc/m;->setAlpha(F)V

    const/4 v7, 0x0

    .line 42
    invoke-virtual {v6, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_a

    .line 43
    iput-object v10, v8, Lcc/m;->m:Ljava/lang/String;

    .line 44
    iget-object v12, v8, Lcc/m;->o:La0/g;

    invoke-virtual {v12, v10, v8}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    :cond_a
    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    .line 46
    invoke-virtual {v0}, Lcc/p;->getChangingConfigurations()I

    move-result v6

    iput v6, v5, Lcc/n;->a:I

    const/4 v6, 0x1

    .line 47
    iput-boolean v6, v5, Lcc/n;->k:Z

    .line 48
    iget-object v8, v0, Lcc/p;->x:Lcc/n;

    .line 49
    iget-object v10, v8, Lcc/n;->b:Lcc/m;

    .line 50
    new-instance v12, Ljava/util/ArrayDeque;

    invoke-direct {v12}, Ljava/util/ArrayDeque;-><init>()V

    .line 51
    iget-object v13, v10, Lcc/m;->g:Lcc/j;

    iget-object v10, v10, Lcc/m;->o:La0/g;

    invoke-virtual {v12, v13}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 52
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v13

    .line 53
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v14

    add-int/2addr v14, v6

    move v15, v6

    :goto_2
    if-eq v13, v6, :cond_13

    .line 54
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v6

    if-ge v6, v14, :cond_b

    if-eq v13, v11, :cond_13

    .line 55
    :cond_b
    const-string v6, "group"

    if-ne v13, v9, :cond_11

    .line 56
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v13

    .line 57
    invoke-virtual {v12}, Ljava/util/ArrayDeque;->peek()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v7, v16

    check-cast v7, Lcc/j;

    if-eqz v7, :cond_12

    .line 58
    iget-object v7, v7, Lcc/j;->b:Ljava/util/ArrayList;

    .line 59
    const-string v9, "path"

    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    .line 60
    new-instance v6, Lcc/i;

    invoke-direct {v6}, Lcc/i;-><init>()V

    .line 61
    invoke-virtual {v6, v1, v2, v3, v4}, Lcc/i;->c(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    .line 62
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    invoke-virtual {v6}, Lcc/l;->getPathName()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_c

    .line 64
    invoke-virtual {v6}, Lcc/l;->getPathName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v10, v7, v6}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    :cond_c
    iget v6, v8, Lcc/n;->a:I

    iput v6, v8, Lcc/n;->a:I

    const/4 v15, 0x0

    goto :goto_3

    .line 66
    :cond_d
    const-string v9, "clip-path"

    invoke-virtual {v9, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_f

    .line 67
    new-instance v6, Lcc/h;

    invoke-direct {v6}, Lcc/h;-><init>()V

    .line 68
    invoke-virtual {v6, v1, v2, v3, v4}, Lcc/h;->c(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    .line 69
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    invoke-virtual {v6}, Lcc/l;->getPathName()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_e

    .line 71
    invoke-virtual {v6}, Lcc/l;->getPathName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v10, v7, v6}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    :cond_e
    iget v6, v8, Lcc/n;->a:I

    iput v6, v8, Lcc/n;->a:I

    goto :goto_3

    .line 73
    :cond_f
    invoke-virtual {v6, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_12

    .line 74
    new-instance v6, Lcc/j;

    invoke-direct {v6}, Lcc/j;-><init>()V

    .line 75
    invoke-virtual {v6, v1, v2, v3, v4}, Lcc/j;->c(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V

    .line 76
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    invoke-virtual {v12, v6}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    .line 78
    invoke-virtual {v6}, Lcc/j;->getGroupName()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_10

    .line 79
    invoke-virtual {v6}, Lcc/j;->getGroupName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v10, v7, v6}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    :cond_10
    iget v6, v8, Lcc/n;->a:I

    iput v6, v8, Lcc/n;->a:I

    goto :goto_3

    :cond_11
    if-ne v13, v11, :cond_12

    .line 81
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v7

    .line 82
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_12

    .line 83
    invoke-virtual {v12}, Ljava/util/ArrayDeque;->pop()Ljava/lang/Object;

    .line 84
    :cond_12
    :goto_3
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v13

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v9, 0x2

    goto/16 :goto_2

    :cond_13
    if-nez v15, :cond_14

    .line 85
    iget-object v1, v5, Lcc/n;->c:Landroid/content/res/ColorStateList;

    iget-object v2, v5, Lcc/n;->d:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1, v2}, Lcc/p;->a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v1

    iput-object v1, v0, Lcc/p;->y:Landroid/graphics/PorterDuffColorFilter;

    return-void

    .line 86
    :cond_14
    new-instance v1, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v2, "no path defined"

    invoke-direct {v1, v2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 87
    :cond_15
    new-instance v1, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "<vector> tag requires height > 0"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 88
    :cond_16
    new-instance v1, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "<vector> tag requires width > 0"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 89
    :cond_17
    new-instance v1, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "<vector> tag requires viewportHeight > 0"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 90
    :cond_18
    new-instance v1, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "<vector> tag requires viewportWidth > 0"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invalidateSelf()V
    .locals 1

    iget-object v0, p0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void

    :cond_0
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method

.method public final isAutoMirrored()Z
    .locals 1

    iget-object v0, p0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-static {v0}, Ls4/b;->p(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lcc/p;->x:Lcc/n;

    iget-boolean v0, v0, Lcc/n;->e:Z

    return v0
.end method

.method public final isStateful()Z
    .locals 1

    iget-object v0, p0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    return v0

    :cond_0
    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcc/p;->x:Lcc/n;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcc/n;->d()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcc/p;->x:Lcc/n;

    iget-object v0, v0, Lcc/n;->c:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/content/res/ColorStateList;->isStateful()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    return v0

    :cond_2
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final mutate()Landroid/graphics/drawable/Drawable;
    .locals 2

    iget-object v0, p0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    return-object p0

    :cond_0
    iget-boolean v0, p0, Lcc/p;->E:Z

    if-nez v0, :cond_1

    invoke-super {p0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-ne v0, p0, :cond_1

    new-instance v0, Lcc/n;

    iget-object v1, p0, Lcc/p;->x:Lcc/n;

    invoke-direct {v0, v1}, Lcc/n;-><init>(Lcc/n;)V

    iput-object v0, p0, Lcc/p;->x:Lcc/n;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcc/p;->E:Z

    :cond_1
    return-object p0
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    iget-object v0, p0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    :cond_0
    return-void
.end method

.method public final onStateChange([I)Z
    .locals 4

    iget-object v0, p0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Lcc/p;->x:Lcc/n;

    iget-object v1, v0, Lcc/n;->c:Landroid/content/res/ColorStateList;

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    iget-object v3, v0, Lcc/n;->d:Landroid/graphics/PorterDuff$Mode;

    if-eqz v3, :cond_1

    invoke-virtual {p0, v1, v3}, Lcc/p;->a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v1

    iput-object v1, p0, Lcc/p;->y:Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {p0}, Lcc/p;->invalidateSelf()V

    move v1, v2

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Lcc/n;->d()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v0, p1}, Lcc/n;->e([I)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lcc/p;->invalidateSelf()V

    return v2

    :cond_2
    return v1
.end method

.method public final scheduleSelf(Ljava/lang/Runnable;J)V
    .locals 1

    iget-object v0, p0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2, p3}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V

    return-void

    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/graphics/drawable/Drawable;->scheduleSelf(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public final setAlpha(I)V
    .locals 1

    iget-object v0, p0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    return-void

    :cond_0
    iget-object v0, p0, Lcc/p;->x:Lcc/n;

    iget-object v0, v0, Lcc/n;->b:Lcc/m;

    invoke-virtual {v0}, Lcc/m;->getRootAlpha()I

    move-result v0

    if-eq v0, p1, :cond_1

    iget-object v0, p0, Lcc/p;->x:Lcc/n;

    iget-object v0, v0, Lcc/n;->b:Lcc/m;

    invoke-virtual {v0, p1}, Lcc/m;->setRootAlpha(I)V

    invoke-virtual {p0}, Lcc/p;->invalidateSelf()V

    :cond_1
    return-void
.end method

.method public final setAutoMirrored(Z)V
    .locals 1

    iget-object v0, p0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Ls4/b;->z(Landroid/graphics/drawable/Drawable;Z)V

    return-void

    :cond_0
    iget-object v0, p0, Lcc/p;->x:Lcc/n;

    iput-boolean p1, v0, Lcc/n;->e:Z

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    iget-object v0, p0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    return-void

    :cond_0
    iput-object p1, p0, Lcc/p;->z:Landroid/graphics/ColorFilter;

    invoke-virtual {p0}, Lcc/p;->invalidateSelf()V

    return-void
.end method

.method public final setTint(I)V
    .locals 1

    iget-object v0, p0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-static {p1, v0}, Ls4/b;->D(ILandroid/graphics/drawable/Drawable;)V

    return-void

    :cond_0
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcc/p;->setTintList(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public final setTintList(Landroid/content/res/ColorStateList;)V
    .locals 2

    iget-object v0, p0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Ls4/b;->E(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcc/p;->x:Lcc/n;

    iget-object v1, v0, Lcc/n;->c:Landroid/content/res/ColorStateList;

    if-eq v1, p1, :cond_1

    iput-object p1, v0, Lcc/n;->c:Landroid/content/res/ColorStateList;

    iget-object v0, v0, Lcc/n;->d:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0, p1, v0}, Lcc/p;->a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object p1

    iput-object p1, p0, Lcc/p;->y:Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {p0}, Lcc/p;->invalidateSelf()V

    :cond_1
    return-void
.end method

.method public final setTintMode(Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    iget-object v0, p0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Ls4/b;->F(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcc/p;->x:Lcc/n;

    iget-object v1, v0, Lcc/n;->d:Landroid/graphics/PorterDuff$Mode;

    if-eq v1, p1, :cond_1

    iput-object p1, v0, Lcc/n;->d:Landroid/graphics/PorterDuff$Mode;

    iget-object v0, v0, Lcc/n;->c:Landroid/content/res/ColorStateList;

    invoke-virtual {p0, v0, p1}, Lcc/p;->a(Landroid/content/res/ColorStateList;Landroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;

    move-result-object p1

    iput-object p1, p0, Lcc/p;->y:Landroid/graphics/PorterDuffColorFilter;

    invoke-virtual {p0}, Lcc/p;->invalidateSelf()V

    :cond_1
    return-void
.end method

.method public final setVisible(ZZ)Z
    .locals 1

    iget-object v0, p0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result p1

    return p1

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    move-result p1

    return p1
.end method

.method public final unscheduleSelf(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lcc/g;->w:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->unscheduleSelf(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->unscheduleSelf(Ljava/lang/Runnable;)V

    return-void
.end method
