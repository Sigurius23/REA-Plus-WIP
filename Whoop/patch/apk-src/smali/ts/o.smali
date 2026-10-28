.class public abstract Lts/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    return-void
.end method

.method public static A(Lof3/a;)Lnf3/a;
    .locals 1

    const-string v0, "this"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lpf3/a;->b:Lnf3/a;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "KoinApplication has not been started"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final B(Landroid/content/ComponentCallbacks;Lvf3/a;Lj93/d;Lc93/a;Lc93/a;)Landroidx/lifecycle/w1;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clazz"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "owner"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v1

    const/4 v5, 0x0

    move-object v2, p1

    move-object v4, p2

    move-object v3, p3

    move-object v6, p4

    invoke-static/range {v1 .. v6}, Ljc/x;->X(Lxf3/c;Lvf3/a;Lc93/a;Lj93/d;Lc93/a;Lc93/a;)Landroidx/lifecycle/w1;

    move-result-object p0

    return-object p0
.end method

.method public static C(Ljava/lang/Double;Z)Z
    .locals 4

    if-nez p0, :cond_0

    return p1

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Double;->isNaN()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmpl-double p1, v0, v2

    if-ltz p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p0

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    cmpg-double p0, p0, v0

    if-gtz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static final D(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;I)Lg3/a;
    .locals 55

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-static {v2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v3

    new-instance v4, Lp2/a;

    invoke-direct {v4, v2}, Lp2/a;-><init>(Landroid/content/res/XmlResourceParser;)V

    sget-object v5, Lp2/b;->a:[I

    invoke-static {v1, v0, v3, v5}, Le93/b;->R(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v6

    invoke-virtual {v4, v6}, Lp2/a;->b(I)V

    const-string v6, "autoMirrored"

    invoke-static {v2, v6}, Le93/b;->L(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x5

    if-nez v6, :cond_0

    move/from16 v18, v7

    goto :goto_0

    :cond_0
    invoke-virtual {v5, v8, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    move/from16 v18, v6

    :goto_0
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v6

    invoke-virtual {v4, v6}, Lp2/a;->b(I)V

    const-string v6, "viewportWidth"

    const/4 v9, 0x7

    const/4 v10, 0x0

    invoke-virtual {v4, v5, v6, v9, v10}, Lp2/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v13

    const-string v6, "viewportHeight"

    const/16 v11, 0x8

    invoke-virtual {v4, v5, v6, v11, v10}, Lp2/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v14

    cmpg-float v6, v13, v10

    if-lez v6, :cond_2e

    cmpg-float v6, v14, v10

    if-lez v6, :cond_2d

    const/4 v6, 0x3

    invoke-virtual {v5, v6, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v12

    invoke-virtual {v5}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v15

    invoke-virtual {v4, v15}, Lp2/a;->b(I)V

    const/4 v15, 0x2

    invoke-virtual {v5, v15, v10}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v16

    invoke-virtual {v5}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v9

    invoke-virtual {v4, v9}, Lp2/a;->b(I)V

    const/4 v9, 0x1

    invoke-virtual {v5, v9}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v19

    if-eqz v19, :cond_3

    new-instance v10, Landroid/util/TypedValue;

    invoke-direct {v10}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v5, v9, v10}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    iget v10, v10, Landroid/util/TypedValue;->type:I

    if-ne v10, v15, :cond_1

    sget-wide v20, Li2/x;->n:J

    move-wide/from16 v9, v20

    goto :goto_1

    :cond_1
    invoke-static {v5, v2, v0}, Le93/b;->H(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;)Landroid/content/res/ColorStateList;

    move-result-object v10

    invoke-virtual {v5}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v9

    invoke-virtual {v4, v9}, Lp2/a;->b(I)V

    if-eqz v10, :cond_2

    invoke-virtual {v10}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v9

    invoke-static {v9}, Li2/w0;->c(I)J

    move-result-wide v9

    goto :goto_1

    :cond_2
    sget-wide v9, Li2/x;->n:J

    goto :goto_1

    :cond_3
    sget-wide v9, Li2/x;->n:J

    :goto_1
    const/4 v7, 0x6

    move-wide/from16 v22, v9

    const/4 v10, -0x1

    invoke-virtual {v5, v7, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v9

    invoke-virtual {v5}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v11

    invoke-virtual {v4, v11}, Lp2/a;->b(I)V

    const/16 v11, 0xd

    const/16 v7, 0x9

    if-eq v9, v10, :cond_4

    if-eq v9, v6, :cond_6

    if-eq v9, v8, :cond_4

    if-eq v9, v7, :cond_5

    packed-switch v9, :pswitch_data_0

    :cond_4
    move v9, v8

    goto :goto_2

    :pswitch_0
    const/16 v9, 0xc

    goto :goto_2

    :pswitch_1
    const/16 v9, 0xe

    goto :goto_2

    :pswitch_2
    move v9, v11

    goto :goto_2

    :cond_5
    move v9, v7

    goto :goto_2

    :cond_6
    move v9, v6

    :goto_2
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v10

    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    div-float/2addr v12, v10

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v10

    iget v10, v10, Landroid/util/DisplayMetrics;->density:F

    div-float v16, v16, v10

    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    move/from16 v17, v9

    const/4 v5, 0x7

    new-instance v9, Lo2/d;

    const/4 v10, 0x0

    const/16 v27, 0x0

    const/16 v19, 0x1

    move v11, v12

    move v7, v15

    move/from16 v12, v16

    move-wide/from16 v15, v22

    const/4 v5, 0x1

    invoke-direct/range {v9 .. v19}, Lo2/d;-><init>(Ljava/lang/String;FFFFJIZI)V

    const/4 v10, 0x0

    :goto_3
    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v11

    if-eq v11, v5, :cond_2c

    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v11

    if-ge v11, v5, :cond_7

    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v11

    if-ne v11, v6, :cond_7

    goto/16 :goto_22

    :cond_7
    iget-object v11, v4, Lp2/a;->a:Lorg/xmlpull/v1/XmlPullParser;

    invoke-interface {v11}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v12

    const-string v13, "ImageVector.Builder is single use, create a new instance to create a new ImageVector"

    iget-object v14, v9, Lo2/d;->i:Ljava/util/ArrayList;

    const-string v15, "group"

    if-eq v12, v7, :cond_c

    if-eq v12, v6, :cond_9

    :cond_8
    move/from16 v17, v7

    goto :goto_5

    :cond_9
    invoke-interface {v11}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v15, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    add-int/lit8 v10, v10, 0x1

    const/4 v11, 0x0

    :goto_4
    if-ge v11, v10, :cond_b

    iget-boolean v12, v9, Lo2/d;->k:Z

    if-eqz v12, :cond_a

    invoke-static {v13}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_a
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v12

    sub-int/2addr v12, v5

    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lo2/c;

    invoke-static {v14, v5}, Lm4/a;->d(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lo2/c;

    iget-object v15, v15, Lo2/c;->j:Ljava/util/ArrayList;

    new-instance v30, Lo2/e0;

    iget-object v6, v12, Lo2/c;->a:Ljava/lang/String;

    iget v7, v12, Lo2/c;->b:F

    iget v5, v12, Lo2/c;->c:F

    iget v8, v12, Lo2/c;->d:F

    iget v2, v12, Lo2/c;->e:F

    move/from16 v35, v2

    iget v2, v12, Lo2/c;->f:F

    move/from16 v36, v2

    iget v2, v12, Lo2/c;->g:F

    move/from16 v37, v2

    iget v2, v12, Lo2/c;->h:F

    move/from16 v38, v2

    iget-object v2, v12, Lo2/c;->i:Ljava/util/List;

    iget-object v12, v12, Lo2/c;->j:Ljava/util/ArrayList;

    move-object/from16 v39, v2

    move/from16 v33, v5

    move-object/from16 v31, v6

    move/from16 v32, v7

    move/from16 v34, v8

    move-object/from16 v40, v12

    invoke-direct/range {v30 .. v40}, Lo2/e0;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/ArrayList;)V

    move-object/from16 v2, v30

    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v11, 0x1

    move-object/from16 v2, p2

    const/4 v5, 0x1

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x5

    goto :goto_4

    :cond_b
    move/from16 v17, v7

    const/4 v10, 0x0

    :goto_5
    const/4 v11, 0x0

    const/4 v15, 0x0

    :goto_6
    const/16 v24, 0x8

    const/16 v25, 0x6

    :goto_7
    const/16 v26, 0xc

    goto/16 :goto_21

    :cond_c
    invoke-interface {v11}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v5

    const v6, -0x624e8b7e

    sget-object v39, Lm83/y;->w:Lm83/y;

    const-string v7, ""

    iget-object v8, v4, Lp2/a;->c:Laj/d;

    if-eq v5, v6, :cond_27

    const v6, 0x346425

    const/high16 v12, 0x3f800000    # 1.0f

    if-eq v5, v6, :cond_12

    const v6, 0x5e0f67f

    if-eq v5, v6, :cond_e

    :cond_d
    :goto_8
    const/4 v5, 0x1

    const/4 v11, 0x0

    const/4 v15, 0x0

    goto/16 :goto_b

    :cond_e
    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    goto :goto_8

    :cond_f
    sget-object v2, Lp2/b;->b:[I

    invoke-static {v1, v0, v3, v2}, Le93/b;->R(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v5

    invoke-virtual {v4, v5}, Lp2/a;->b(I)V

    const-string v5, "rotation"

    const/4 v6, 0x5

    const/4 v15, 0x0

    invoke-virtual {v4, v2, v5, v6, v15}, Lp2/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v32

    const/4 v5, 0x1

    invoke-virtual {v2, v5, v15}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v33

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v5

    invoke-virtual {v4, v5}, Lp2/a;->b(I)V

    const/4 v5, 0x2

    invoke-virtual {v2, v5, v15}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v34

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v5

    invoke-virtual {v4, v5}, Lp2/a;->b(I)V

    const-string v5, "scaleX"

    const/4 v6, 0x3

    invoke-virtual {v4, v2, v5, v6, v12}, Lp2/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v35

    const-string v5, "scaleY"

    const/4 v6, 0x4

    invoke-virtual {v4, v2, v5, v6, v12}, Lp2/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v36

    const-string v5, "translateX"

    const/4 v6, 0x6

    invoke-virtual {v4, v2, v5, v6, v15}, Lp2/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v37

    const-string v5, "translateY"

    const/4 v6, 0x7

    invoke-virtual {v4, v2, v5, v6, v15}, Lp2/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v38

    const/4 v5, 0x0

    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v5

    invoke-virtual {v4, v5}, Lp2/a;->b(I)V

    if-nez v8, :cond_10

    move-object/from16 v31, v7

    goto :goto_9

    :cond_10
    move-object/from16 v31, v8

    :goto_9
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    sget v2, Lo2/f0;->a:I

    iget-boolean v2, v9, Lo2/d;->k:Z

    if-eqz v2, :cond_11

    invoke-static {v13}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_11
    new-instance v30, Lo2/c;

    const/16 v40, 0x200

    invoke-direct/range {v30 .. v40}, Lo2/c;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;I)V

    move-object/from16 v2, v30

    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_a
    const/4 v5, 0x1

    const/4 v11, 0x0

    :goto_b
    const/16 v17, 0x2

    goto/16 :goto_6

    :cond_12
    const/4 v6, 0x7

    const/4 v15, 0x0

    const-string v5, "path"

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    goto :goto_a

    :cond_13
    sget-object v2, Lp2/b;->c:[I

    invoke-static {v1, v0, v3, v2}, Le93/b;->R(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v5

    invoke-virtual {v4, v5}, Lp2/a;->b(I)V

    const-string v5, "pathData"

    const-string v6, "http://schemas.android.com/apk/res/android"

    invoke-interface {v11, v6, v5}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_26

    const/4 v5, 0x0

    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v5

    invoke-virtual {v4, v5}, Lp2/a;->b(I)V

    if-nez v6, :cond_14

    move-object/from16 v41, v7

    :goto_c
    const/4 v5, 0x2

    goto :goto_d

    :cond_14
    move-object/from16 v41, v6

    goto :goto_c

    :goto_d
    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v5

    invoke-virtual {v4, v5}, Lp2/a;->b(I)V

    if-nez v6, :cond_15

    sget v5, Lo2/f0;->a:I

    :goto_e
    move-object/from16 v42, v39

    goto :goto_f

    :cond_15
    invoke-static {v8, v6}, Laj/d;->t(Laj/d;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v39

    goto :goto_e

    :goto_f
    const-string v5, "fillColor"

    const/4 v6, 0x1

    invoke-static {v2, v11, v0, v5, v6}, Le93/b;->I(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Lae3/k;

    move-result-object v5

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v6

    invoke-virtual {v4, v6}, Lp2/a;->b(I)V

    const-string v6, "fillAlpha"

    const/16 v7, 0xc

    invoke-virtual {v4, v2, v6, v7, v12}, Lp2/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v45

    const-string v6, "strokeLineCap"

    invoke-static {v11, v6}, Le93/b;->L(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_16

    const/4 v6, -0x1

    const/16 v8, 0x8

    goto :goto_10

    :cond_16
    const/4 v6, -0x1

    const/16 v8, 0x8

    invoke-virtual {v2, v8, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v23

    move/from16 v6, v23

    :goto_10
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v7

    invoke-virtual {v4, v7}, Lp2/a;->b(I)V

    if-eqz v6, :cond_19

    const/4 v7, 0x1

    if-eq v6, v7, :cond_18

    const/4 v7, 0x2

    if-eq v6, v7, :cond_17

    :goto_11
    const/16 v49, 0x0

    goto :goto_12

    :cond_17
    move/from16 v49, v7

    goto :goto_12

    :cond_18
    const/4 v7, 0x2

    const/16 v49, 0x1

    goto :goto_12

    :cond_19
    const/4 v7, 0x2

    goto :goto_11

    :goto_12
    const-string v6, "strokeLineJoin"

    invoke-static {v11, v6}, Le93/b;->L(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_1a

    const/4 v6, -0x1

    goto :goto_13

    :cond_1a
    const/16 v6, 0x9

    const/4 v7, -0x1

    invoke-virtual {v2, v6, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v20

    move/from16 v6, v20

    :goto_13
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v7

    invoke-virtual {v4, v7}, Lp2/a;->b(I)V

    if-eqz v6, :cond_1c

    const/4 v7, 0x1

    if-eq v6, v7, :cond_1b

    const/16 v50, 0x2

    goto :goto_14

    :cond_1b
    const/16 v50, 0x1

    goto :goto_14

    :cond_1c
    const/16 v50, 0x0

    :goto_14
    const-string v6, "strokeMiterLimit"

    const/16 v7, 0xa

    invoke-virtual {v4, v2, v6, v7, v12}, Lp2/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v51

    const-string v6, "strokeColor"

    const/4 v7, 0x3

    invoke-static {v2, v11, v0, v6, v7}, Le93/b;->I(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Lae3/k;

    move-result-object v6

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v7

    invoke-virtual {v4, v7}, Lp2/a;->b(I)V

    const-string v7, "strokeAlpha"

    const/16 v8, 0xb

    invoke-virtual {v4, v2, v7, v8, v12}, Lp2/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v47

    const-string v7, "strokeWidth"

    const/4 v8, 0x4

    invoke-virtual {v4, v2, v7, v8, v12}, Lp2/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v48

    const-string v7, "trimPathEnd"

    const/4 v8, 0x6

    invoke-virtual {v4, v2, v7, v8, v12}, Lp2/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v53

    const-string v7, "trimPathOffset"

    const/4 v12, 0x7

    invoke-virtual {v4, v2, v7, v12, v15}, Lp2/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v54

    const-string v7, "trimPathStart"

    const/4 v12, 0x5

    invoke-virtual {v4, v2, v7, v12, v15}, Lp2/a;->a(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F

    move-result v52

    const-string v7, "fillType"

    invoke-static {v11, v7}, Le93/b;->L(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_1d

    const/16 v7, 0xd

    const/16 v19, 0x0

    goto :goto_15

    :cond_1d
    const/16 v7, 0xd

    const/4 v11, 0x0

    invoke-virtual {v2, v7, v11}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v19

    :goto_15
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v11

    invoke-virtual {v4, v11}, Lp2/a;->b(I)V

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    iget-object v2, v5, Lae3/k;->c:Ljava/lang/Object;

    check-cast v2, Landroid/graphics/Shader;

    if-eqz v2, :cond_1e

    goto :goto_16

    :cond_1e
    iget v7, v5, Lae3/k;->b:I

    if-eqz v7, :cond_20

    :goto_16
    if-eqz v2, :cond_1f

    invoke-static {v2}, Lug/m;->f(Landroid/graphics/Shader;)Li2/u;

    move-result-object v2

    :goto_17
    move-object/from16 v44, v2

    goto :goto_18

    :cond_1f
    new-instance v2, Li2/c1;

    iget v5, v5, Lae3/k;->b:I

    invoke-static {v5}, Li2/w0;->c(I)J

    move-result-wide v11

    invoke-direct {v2, v11, v12}, Li2/c1;-><init>(J)V

    goto :goto_17

    :cond_20
    const/16 v44, 0x0

    :goto_18
    iget-object v2, v6, Lae3/k;->c:Ljava/lang/Object;

    check-cast v2, Landroid/graphics/Shader;

    if-eqz v2, :cond_21

    goto :goto_19

    :cond_21
    iget v5, v6, Lae3/k;->b:I

    if-eqz v5, :cond_23

    :goto_19
    if-eqz v2, :cond_22

    invoke-static {v2}, Lug/m;->f(Landroid/graphics/Shader;)Li2/u;

    move-result-object v11

    :goto_1a
    move-object/from16 v46, v11

    goto :goto_1b

    :cond_22
    new-instance v11, Li2/c1;

    iget v2, v6, Lae3/k;->b:I

    invoke-static {v2}, Li2/w0;->c(I)J

    move-result-wide v5

    invoke-direct {v11, v5, v6}, Li2/c1;-><init>(J)V

    goto :goto_1a

    :cond_23
    const/16 v46, 0x0

    :goto_1b
    if-nez v19, :cond_24

    const/16 v43, 0x0

    goto :goto_1c

    :cond_24
    const/16 v43, 0x1

    :goto_1c
    iget-boolean v2, v9, Lo2/d;->k:Z

    if-eqz v2, :cond_25

    invoke-static {v13}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_25
    const/4 v5, 0x1

    invoke-static {v14, v5}, Lm4/a;->d(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo2/c;

    iget-object v2, v2, Lo2/c;->j:Ljava/util/ArrayList;

    new-instance v40, Lo2/h0;

    invoke-direct/range {v40 .. v54}, Lo2/h0;-><init>(Ljava/lang/String;Ljava/util/List;ILi2/t;FLi2/t;FFIIFFFF)V

    move-object/from16 v5, v40

    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v25, v8

    const/4 v5, 0x1

    const/4 v11, 0x0

    const/16 v17, 0x2

    const/16 v24, 0x8

    goto/16 :goto_7

    :cond_26
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No path data available"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_27
    move-object v5, v7

    const/4 v15, 0x0

    const/16 v17, 0x2

    const/16 v24, 0x8

    const/16 v25, 0x6

    const/16 v26, 0xc

    const-string v6, "clip-path"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_28

    const/4 v5, 0x1

    const/4 v11, 0x0

    goto :goto_21

    :cond_28
    sget-object v2, Lp2/b;->d:[I

    invoke-static {v1, v0, v3, v2}, Le93/b;->R(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v6

    invoke-virtual {v4, v6}, Lp2/a;->b(I)V

    const/4 v11, 0x0

    invoke-virtual {v2, v11}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v12

    invoke-virtual {v4, v12}, Lp2/a;->b(I)V

    if-nez v6, :cond_29

    move-object/from16 v29, v5

    :goto_1d
    const/4 v5, 0x1

    goto :goto_1e

    :cond_29
    move-object/from16 v29, v6

    goto :goto_1d

    :goto_1e
    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->getChangingConfigurations()I

    move-result v12

    invoke-virtual {v4, v12}, Lp2/a;->b(I)V

    if-nez v6, :cond_2a

    sget v6, Lo2/f0;->a:I

    :goto_1f
    move-object/from16 v37, v39

    goto :goto_20

    :cond_2a
    invoke-static {v8, v6}, Laj/d;->t(Laj/d;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v39

    goto :goto_1f

    :goto_20
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    iget-boolean v2, v9, Lo2/d;->k:Z

    if-eqz v2, :cond_2b

    invoke-static {v13}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_2b
    new-instance v28, Lo2/c;

    const/16 v38, 0x200

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/high16 v33, 0x3f800000    # 1.0f

    const/high16 v34, 0x3f800000    # 1.0f

    const/16 v35, 0x0

    const/16 v36, 0x0

    invoke-direct/range {v28 .. v38}, Lo2/c;-><init>(Ljava/lang/String;FFFFFFFLjava/util/List;I)V

    move-object/from16 v2, v28

    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    :goto_21
    invoke-interface/range {p2 .. p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-object/from16 v2, p2

    move/from16 v7, v17

    const/4 v6, 0x3

    const/4 v8, 0x5

    goto/16 :goto_3

    :cond_2c
    :goto_22
    iget v0, v4, Lp2/a;->b:I

    or-int v0, p3, v0

    new-instance v1, Lg3/a;

    invoke-virtual {v9}, Lo2/d;->b()Lo2/e;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lg3/a;-><init>(Lo2/e;I)V

    return-object v1

    :cond_2d
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "<VectorGraphic> tag requires viewportHeight > 0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2e
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5}, Landroid/content/res/TypedArray;->getPositionDescription()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "<VectorGraphic> tag requires viewportWidth > 0"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final E(Landroid/content/Context;)V
    .locals 10

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "androidx.work.workdb"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v1

    const-string v2, "getDatabasePath(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v1

    invoke-static {}, Ljc/r;->b()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Migrating WorkDatabase to the no-backup directory"

    invoke-virtual {v1, v3, v4}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    move-result-object p0

    const-string v1, "getNoBackupFilesDir(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljc/r;->a()[Ljava/lang/String;

    move-result-object v1

    array-length v2, v1

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    const/16 v3, 0x10

    if-ge v2, v3, :cond_0

    move v2, v3

    :cond_0
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    array-length v2, v1

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_1

    aget-object v5, v1, v4

    new-instance v6, Ljava/io/File;

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v7, Ljava/io/File;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v7, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-interface {v3, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Ll83/k;

    invoke-direct {v1, v0, p0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3, v1}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v2

    invoke-static {}, Ljc/r;->b()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Over-writing contents of "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lic/w;->g(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    invoke-virtual {v1, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result v2

    if-eqz v2, :cond_4

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Migrated "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "to "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Renaming "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " failed"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v1

    invoke-static {}, Ljc/r;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lic/w;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_1

    :cond_5
    return-void
.end method

.method public static final F(ILba3/i;)Laa3/i1;
    .locals 21

    move-object/from16 v0, p1

    new-instance v1, Laa3/i1;

    invoke-direct {v1}, Laa3/i1;-><init>()V

    iget-object v2, v0, Lba3/i;->a:Lsa3/f;

    iget-object v3, v0, Lba3/i;->c:Lsa3/j;

    const-string v4, "nameResolver"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "table"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v3, Lsa3/j;->a:Ljava/util/List;

    move/from16 v4, p0

    invoke-static {v4, v3}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/i1;

    sget-object v4, Lsa3/i;->d:Lsa3/i;

    const/4 v5, 0x1

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x0

    if-nez v3, :cond_0

    move-object v15, v8

    goto/16 :goto_7

    :cond_0
    iget v9, v3, Lqa3/i1;->x:I

    and-int/2addr v9, v5

    if-ne v9, v5, :cond_1

    iget v9, v3, Lqa3/i1;->y:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    goto :goto_0

    :cond_1
    move-object v9, v8

    :goto_0
    iget v10, v3, Lqa3/i1;->x:I

    and-int/2addr v10, v7

    if-ne v10, v7, :cond_2

    iget v10, v3, Lqa3/i1;->z:I

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    goto :goto_1

    :cond_2
    move-object v10, v8

    :goto_1
    const/16 v11, 0x10

    const/16 v12, 0x8

    if-eqz v10, :cond_3

    new-instance v9, Lsa3/i;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v13

    and-int/lit16 v13, v13, 0xff

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v14

    shr-int/2addr v14, v12

    and-int/lit16 v14, v14, 0xff

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    shr-int/2addr v10, v11

    and-int/lit16 v10, v10, 0xff

    invoke-direct {v9, v13, v14, v10}, Lsa3/i;-><init>(III)V

    move-object/from16 v16, v9

    goto :goto_2

    :cond_3
    if-eqz v9, :cond_4

    new-instance v10, Lsa3/i;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v13

    and-int/lit8 v13, v13, 0x7

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v14

    shr-int/2addr v14, v6

    and-int/lit8 v14, v14, 0xf

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    shr-int/lit8 v9, v9, 0x7

    and-int/lit8 v9, v9, 0x7f

    invoke-direct {v10, v13, v14, v9}, Lsa3/i;-><init>(III)V

    move-object/from16 v16, v10

    goto :goto_2

    :cond_4
    move-object/from16 v16, v4

    :goto_2
    iget-object v9, v3, Lqa3/i1;->E:Lqa3/g1;

    invoke-static {v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    if-eqz v9, :cond_7

    if-eq v9, v5, :cond_6

    if-ne v9, v7, :cond_5

    sget-object v9, Ll83/d;->y:Ll83/d;

    :goto_3
    move-object/from16 v18, v9

    goto :goto_4

    :cond_5
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_6
    sget-object v9, Ll83/d;->x:Ll83/d;

    goto :goto_3

    :cond_7
    sget-object v9, Ll83/d;->w:Ll83/d;

    goto :goto_3

    :goto_4
    iget v9, v3, Lqa3/i1;->x:I

    and-int/2addr v9, v12

    if-ne v9, v12, :cond_8

    iget v9, v3, Lqa3/i1;->F:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    move-object/from16 v19, v9

    goto :goto_5

    :cond_8
    move-object/from16 v19, v8

    :goto_5
    iget v9, v3, Lqa3/i1;->x:I

    and-int/2addr v9, v11

    if-ne v9, v11, :cond_9

    iget v9, v3, Lqa3/i1;->G:I

    invoke-interface {v2, v9}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v20, v2

    goto :goto_6

    :cond_9
    move-object/from16 v20, v8

    :goto_6
    new-instance v15, Laa3/i1;

    iget-object v2, v3, Lqa3/i1;->H:Lqa3/h1;

    const-string v3, "getVersionKind(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v17, v2

    invoke-direct/range {v15 .. v20}, Laa3/i1;-><init>(Lsa3/i;Lqa3/h1;Ll83/d;Ljava/lang/Integer;Ljava/lang/String;)V

    :goto_7
    if-nez v15, :cond_b

    iget-boolean v0, v0, Lba3/i;->d:Z

    if-eqz v0, :cond_a

    goto :goto_8

    :cond_a
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/km/InconsistentKotlinMetadataException;

    const-string v1, "No VersionRequirement with the given id in the table"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkotlin/reflect/jvm/internal/impl/km/InconsistentKotlinMetadataException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_b
    :goto_8
    if-eqz v15, :cond_c

    iget-object v0, v15, Laa3/i1;->c:Ljava/lang/Object;

    check-cast v0, Lqa3/h1;

    goto :goto_9

    :cond_c
    move-object v0, v8

    :goto_9
    const/4 v2, -0x1

    if-nez v0, :cond_d

    move v0, v2

    goto :goto_a

    :cond_d
    sget-object v3, Lba3/k;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v3, v0

    :goto_a
    if-eq v0, v2, :cond_11

    if-eq v0, v5, :cond_10

    if-eq v0, v7, :cond_f

    if-ne v0, v6, :cond_e

    sget-object v0, Laa3/k1;->y:Laa3/k1;

    goto :goto_b

    :cond_e
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_f
    sget-object v0, Laa3/k1;->x:Laa3/k1;

    goto :goto_b

    :cond_10
    sget-object v0, Laa3/k1;->w:Laa3/k1;

    goto :goto_b

    :cond_11
    sget-object v0, Laa3/k1;->z:Laa3/k1;

    :goto_b
    if-eqz v15, :cond_12

    iget-object v3, v15, Laa3/i1;->f:Ljava/lang/Object;

    check-cast v3, Ll83/d;

    goto :goto_c

    :cond_12
    move-object v3, v8

    :goto_c
    if-nez v3, :cond_13

    move v3, v2

    goto :goto_d

    :cond_13
    sget-object v9, Lba3/k;->b:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v9, v3

    :goto_d
    if-eq v3, v2, :cond_17

    if-eq v3, v5, :cond_16

    if-eq v3, v7, :cond_15

    if-ne v3, v6, :cond_14

    goto :goto_e

    :cond_14
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_15
    sget-object v2, Laa3/j1;->x:Laa3/j1;

    goto :goto_f

    :cond_16
    sget-object v2, Laa3/j1;->w:Laa3/j1;

    goto :goto_f

    :cond_17
    :goto_e
    sget-object v2, Laa3/j1;->y:Laa3/j1;

    :goto_f
    iput-object v0, v1, Laa3/i1;->b:Ljava/lang/Object;

    iput-object v2, v1, Laa3/i1;->c:Ljava/lang/Object;

    if-eqz v15, :cond_18

    iget-object v0, v15, Laa3/i1;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    goto :goto_10

    :cond_18
    move-object v0, v8

    :goto_10
    iput-object v0, v1, Laa3/i1;->d:Ljava/lang/Object;

    if-eqz v15, :cond_19

    iget-object v0, v15, Laa3/i1;->e:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    :cond_19
    iput-object v8, v1, Laa3/i1;->e:Ljava/lang/Object;

    if-eqz v15, :cond_1a

    iget-object v0, v15, Laa3/i1;->b:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lsa3/i;

    :cond_1a
    iget v0, v4, Lsa3/i;->a:I

    iget v2, v4, Lsa3/i;->b:I

    iget v3, v4, Lsa3/i;->c:I

    new-instance v4, Laa3/h1;

    invoke-direct {v4, v0, v2, v3}, Laa3/h1;-><init>(III)V

    iput-object v4, v1, Laa3/i1;->f:Ljava/lang/Object;

    return-object v1
.end method

.method public static final G(Landroid/view/View;Lpb/f;)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0d68

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public static final H(Ljava/util/Collection;Lca3/d;)Lca3/c;
    .locals 3

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lca3/c;

    invoke-interface {v1}, Lca3/c;->getType()Lca3/d;

    move-result-object v2

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    if-nez v0, :cond_1

    move-object v0, v1

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Multiple extensions handle the same extension type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    if-eqz v0, :cond_3

    return-object v0

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "No extensions handle the extension type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final I(Ljava/lang/Object;)V
    .locals 1

    instance-of v0, p0, Ll83/m;

    if-nez v0, :cond_0

    return-void

    :cond_0
    check-cast p0, Ll83/m;

    iget-object p0, p0, Ll83/m;->w:Ljava/lang/Throwable;

    throw p0
.end method

.method public static final J(Lio/ktor/utils/io/q;Ls83/c;)Ljava/io/Serializable;
    .locals 4

    instance-of v0, p1, Lo63/b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lo63/b;

    iget v1, v0, Lo63/b;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lo63/b;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lo63/b;

    invoke-direct {v0, p1}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lo63/b;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lo63/b;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Lo63/b;->x:I

    check-cast p0, Lio/ktor/utils/io/m;

    invoke-virtual {p0, v0}, Lio/ktor/utils/io/m;->v(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lv63/e;

    invoke-static {p1}, Lv63/h;->d(Lv63/e;)[B

    move-result-object p0

    return-object p0
.end method

.method public static K(Lqa3/k;Lsa3/f;ZI)Laa3/n0;
    .locals 17

    move-object/from16 v0, p0

    and-int/lit8 v1, p3, 0x2

    if-eqz v1, :cond_0

    const/4 v7, 0x0

    goto :goto_0

    :cond_0
    move/from16 v7, p2

    :goto_0
    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "strings"

    move-object/from16 v4, p1

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Laa3/n0;

    invoke-direct {v1}, Laa3/n0;-><init>()V

    new-instance v3, Lba3/i;

    new-instance v5, Lsa3/h;

    iget-object v6, v0, Lqa3/k;->a0:Lqa3/c1;

    const-string v8, "getTypeTable(...)"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v5, v6}, Lsa3/h;-><init>(Lqa3/c1;)V

    sget-object v6, Lsa3/j;->b:Lsa3/j;

    iget-object v6, v0, Lqa3/k;->c0:Lqa3/j1;

    const-string v8, "getVersionRequirementTable(...)"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v6}, Lpf/c;->r(Lqa3/j1;)Lsa3/j;

    move-result-object v6

    const/16 v9, 0x10

    sget-object v8, Lm83/y;->w:Lm83/y;

    invoke-direct/range {v3 .. v9}, Lba3/i;-><init>(Lsa3/f;Lsa3/h;Lsa3/j;ZLjava/util/List;I)V

    iget-object v4, v0, Lqa3/k;->G:Ljava/util/List;

    const-string v5, "getTypeParameterList(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lba3/i;->b(Ljava/util/List;)Lba3/i;

    move-result-object v3

    iget-object v4, v3, Lba3/i;->h:Ljava/util/List;

    iget-object v6, v3, Lba3/i;->b:Lsa3/h;

    iget v7, v0, Lqa3/k;->z:I

    iput v7, v1, Laa3/n0;->w:I

    iget v7, v0, Lqa3/k;->E:I

    iget-object v8, v3, Lba3/i;->a:Lsa3/f;

    invoke-static {v8, v7}, Lq83/g;->w(Lsa3/f;I)Ljava/lang/String;

    move-result-object v7

    const-string v9, "<set-?>"

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v7, v1, Laa3/n0;->x:Ljava/lang/String;

    iget-object v7, v0, Lqa3/k;->G:Ljava/util/List;

    invoke-static {v7, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Ljava/lang/Iterable;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lqa3/b1;

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v7, v3}, Lts/o;->P(Lqa3/b1;Lba3/i;)Laa3/d1;

    move-result-object v7

    iget-object v9, v1, Laa3/n0;->y:Ljava/util/ArrayList;

    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-static {v0, v6}, Ljc/x;->t0(Lqa3/k;Lsa3/h;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lqa3/w0;

    invoke-static {v7, v3}, Lts/o;->O(Lqa3/w0;Lba3/i;)Laa3/b1;

    move-result-object v7

    iget-object v9, v1, Laa3/n0;->z:Ljava/util/ArrayList;

    invoke-virtual {v9, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    iget-object v5, v0, Lqa3/k;->P:Ljava/util/List;

    const-string v7, "getConstructorList(...)"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const-string v9, "getAnnotationList(...)"

    const-string v10, "type"

    const-string v11, "getVersionRequirementList(...)"

    if-eqz v7, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lqa3/o;

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v12, Laa3/s0;

    iget v13, v7, Lqa3/o;->z:I

    invoke-direct {v12, v13}, Laa3/s0;-><init>(I)V

    iget-object v13, v7, Lqa3/o;->E:Ljava/util/List;

    const-string v14, "getValueParameterList(...)"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v13, Ljava/lang/Iterable;

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_4
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_3

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lqa3/e1;

    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v14, v3}, Lts/o;->Q(Lqa3/e1;Lba3/i;)Laa3/f1;

    move-result-object v14

    iget-object v15, v12, Laa3/s0;->b:Ljava/util/ArrayList;

    invoke-virtual {v15, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_3
    iget-object v13, v7, Lqa3/o;->F:Ljava/util/List;

    invoke-static {v13, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v13, Ljava/lang/Iterable;

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_5
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_4

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Integer;

    invoke-static {v13}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    invoke-static {v13, v3}, Lts/o;->F(ILba3/i;)Laa3/i1;

    move-result-object v13

    iget-object v14, v12, Laa3/s0;->c:Ljava/util/ArrayList;

    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_4
    move-object v11, v4

    check-cast v11, Ljava/lang/Iterable;

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_5
    :goto_6
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lca3/l;

    check-cast v13, Lea3/d;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, Lea3/b;->a:Lca3/d;

    invoke-static {v13, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v14, v12, Laa3/s0;->e:Ljava/util/ArrayList;

    invoke-static {v14, v13}, Lts/o;->H(Ljava/util/Collection;Lca3/d;)Lca3/c;

    move-result-object v13

    check-cast v13, Lca3/b;

    check-cast v13, Lea3/b;

    iget-object v13, v7, Lqa3/o;->H:Ljava/util/List;

    invoke-static {v13, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v13, Ljava/lang/Iterable;

    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_7
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_6

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lqa3/h;

    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v14, v8}, Lq83/g;->R(Lqa3/h;Lsa3/f;)Laa3/s;

    move-result-object v14

    iget-object v15, v12, Laa3/s0;->d:Ljava/util/ArrayList;

    invoke-virtual {v15, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_6
    sget-object v13, Lua3/g;->a:Lwa3/i;

    invoke-static {v7, v8, v6}, Lua3/g;->a(Lqa3/o;Lsa3/f;Lsa3/h;)Lua3/e;

    move-result-object v13

    if-eqz v13, :cond_5

    iget-object v14, v13, Lua3/e;->x:Ljava/lang/String;

    iget-object v13, v13, Lua3/e;->y:Ljava/lang/String;

    const-string v15, "name"

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v14, "descriptor"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_6

    :cond_7
    iget-object v7, v1, Laa3/n0;->H:Ljava/util/ArrayList;

    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_3

    :cond_8
    iget-object v5, v0, Lqa3/k;->Q:Ljava/util/List;

    const-string v7, "getFunctionList(...)"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v7, v0, Lqa3/k;->R:Ljava/util/List;

    const-string v12, "getPropertyList(...)"

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v13, v0, Lqa3/k;->S:Ljava/util/List;

    const-string v14, "getTypeAliasList(...)"

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v5, v7, v13, v3}, Lts/o;->T(Laa3/t0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lba3/i;)V

    iget v5, v0, Lqa3/k;->y:I

    const/4 v7, 0x4

    and-int/2addr v5, v7

    if-ne v5, v7, :cond_9

    iget v5, v0, Lqa3/k;->F:I

    invoke-interface {v8, v5}, Lsa3/f;->getString(I)Ljava/lang/String;

    :cond_9
    iget-object v5, v0, Lqa3/k;->K:Ljava/util/List;

    const-string v7, "getNestedClassNameList(...)"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    invoke-interface {v8, v7}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object v7

    iget-object v13, v1, Laa3/n0;->I:Ljava/util/ArrayList;

    invoke-virtual {v13, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_a
    iget-object v5, v0, Lqa3/k;->T:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v13, 0x1

    if-eqz v7, :cond_e

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lqa3/x;

    iget v14, v7, Lqa3/x;->y:I

    and-int/2addr v14, v13

    if-ne v14, v13, :cond_d

    iget v13, v7, Lqa3/x;->z:I

    invoke-interface {v8, v13}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object v13

    iget-object v14, v1, Laa3/n0;->J:Ljava/util/ArrayList;

    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v13, Ld1/j;

    iget v14, v7, Lqa3/x;->z:I

    invoke-interface {v8, v14}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object v14

    invoke-direct {v13, v14}, Ld1/j;-><init>(Ljava/lang/String;)V

    move-object v14, v4

    check-cast v14, Ljava/lang/Iterable;

    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :cond_b
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_c

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lca3/l;

    check-cast v15, Lea3/d;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v15, v7, Lqa3/x;->E:Ljava/util/List;

    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_a
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_b

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v2, v16

    check-cast v2, Lqa3/h;

    move-object/from16 v16, v4

    invoke-virtual {v13}, Ld1/j;->x()Ljava/util/ArrayList;

    move-result-object v4

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v2, v8}, Lq83/g;->R(Lqa3/h;Lsa3/f;)Laa3/s;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v4, v16

    goto :goto_a

    :cond_c
    move-object/from16 v16, v4

    iget-object v2, v1, Laa3/n0;->K:Ljava/util/ArrayList;

    invoke-virtual {v2, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_d
    new-instance v0, Lkotlin/reflect/jvm/internal/impl/km/InconsistentKotlinMetadataException;

    const-string v1, "No name for EnumEntry"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lkotlin/reflect/jvm/internal/impl/km/InconsistentKotlinMetadataException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_e
    move-object/from16 v16, v4

    const/4 v2, 0x0

    iget-object v4, v0, Lqa3/k;->U:Ljava/util/List;

    const-string v5, "getSealedSubclassFqNameList(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {v8, v5}, Lq83/g;->w(Lsa3/f;I)Ljava/lang/String;

    move-result-object v5

    iget-object v7, v1, Laa3/n0;->L:Ljava/util/ArrayList;

    invoke-virtual {v7, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_f
    iget v4, v0, Lqa3/k;->y:I

    const/16 v5, 0x8

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_10

    iget v4, v0, Lqa3/k;->W:I

    invoke-interface {v8, v4}, Lsa3/f;->getString(I)Ljava/lang/String;

    :cond_10
    invoke-static {v0, v6}, Ljc/x;->Z(Lqa3/k;Lsa3/h;)Lqa3/w0;

    move-result-object v4

    const/4 v7, 0x0

    if-eqz v4, :cond_11

    goto :goto_f

    :cond_11
    iget v4, v0, Lqa3/k;->y:I

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_16

    iget-object v4, v0, Lqa3/k;->R:Ljava/util/List;

    invoke-static {v4, v12}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-object v5, v7

    :cond_12
    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_14

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v14, v12

    check-cast v14, Lqa3/k0;

    invoke-static {v14}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v14, v6}, Ljc/x;->m0(Lqa3/k0;Lsa3/h;)Lqa3/w0;

    move-result-object v15

    if-nez v15, :cond_12

    iget v14, v14, Lqa3/k0;->F:I

    invoke-interface {v8, v14}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object v14

    iget v15, v0, Lqa3/k;->W:I

    invoke-interface {v8, v15}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_12

    if-eqz v2, :cond_13

    :goto_d
    move-object v5, v7

    goto :goto_e

    :cond_13
    move-object v5, v12

    move v2, v13

    goto :goto_c

    :cond_14
    if-nez v2, :cond_15

    goto :goto_d

    :cond_15
    :goto_e
    check-cast v5, Lqa3/k0;

    if-eqz v5, :cond_16

    invoke-static {v5, v6}, Ljc/x;->r0(Lqa3/k0;Lsa3/h;)Lqa3/w0;

    move-result-object v4

    goto :goto_f

    :cond_16
    move-object v4, v7

    :goto_f
    if-eqz v4, :cond_17

    invoke-static {v4, v3}, Lts/o;->O(Lqa3/w0;Lba3/i;)Laa3/b1;

    move-result-object v7

    :cond_17
    iput-object v7, v1, Laa3/n0;->M:Laa3/b1;

    invoke-static {v0, v6}, Ljc/x;->v(Lqa3/k;Lsa3/h;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_18

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lqa3/w0;

    invoke-static {v4, v3}, Lts/o;->O(Lqa3/w0;Lba3/i;)Laa3/b1;

    move-result-object v4

    iget-object v5, v1, Laa3/n0;->O:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_10

    :cond_18
    iget-object v2, v0, Lqa3/k;->b0:Ljava/util/List;

    invoke-static {v2, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_11
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_19

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-static {v4, v3}, Lts/o;->F(ILba3/i;)Laa3/i1;

    move-result-object v4

    iget-object v5, v1, Laa3/n0;->P:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_19
    move-object/from16 v4, v16

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1e

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lca3/l;

    check-cast v4, Lea3/d;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lea3/a;->b:Lca3/d;

    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v1, Laa3/n0;->Q:Ljava/util/ArrayList;

    invoke-static {v5, v4}, Lts/o;->H(Ljava/util/Collection;Lca3/d;)Lca3/c;

    move-result-object v4

    check-cast v4, Lca3/a;

    check-cast v4, Lea3/a;

    iget-object v5, v0, Lqa3/k;->Z:Ljava/util/List;

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_13
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1a

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lqa3/h;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v6, v8}, Lq83/g;->R(Lqa3/h;Lsa3/f;)Laa3/s;

    move-result-object v6

    iget-object v7, v1, Laa3/n0;->N:Ljava/util/ArrayList;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_13

    :cond_1a
    sget-object v5, Lta3/l;->i:Lwa3/o;

    const-string v6, "anonymousObjectOriginName"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v5}, Lj93/l0;->x(Lwa3/m;Lwa3/o;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    if-eqz v5, :cond_1b

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-interface {v8, v5}, Lsa3/f;->getString(I)Ljava/lang/String;

    :cond_1b
    sget-object v5, Lta3/l;->h:Lwa3/o;

    invoke-virtual {v0, v5}, Lwa3/m;->k(Lwa3/o;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_14
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1c

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lqa3/k0;

    iget-object v7, v4, Lea3/a;->a:Ljava/util/ArrayList;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v6, v3}, Lts/o;->N(Lqa3/k0;Lba3/i;)Laa3/z0;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_14

    :cond_1c
    sget-object v4, Lta3/l;->g:Lwa3/o;

    const-string v5, "classModuleName"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v4}, Lj93/l0;->x(Lwa3/m;Lwa3/o;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_1d

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-interface {v8, v4}, Lsa3/f;->getString(I)Ljava/lang/String;

    :cond_1d
    sget-object v4, Lta3/l;->j:Lwa3/o;

    const-string v5, "jvmClassFlags"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v4}, Lj93/l0;->x(Lwa3/m;Lwa3/o;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    goto/16 :goto_12

    :cond_1e
    return-object v1
.end method

.method public static final L(Lqa3/a0;Lba3/i;)Lwe/o;
    .locals 4

    new-instance v0, Lwe/o;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lwe/o;-><init>(IZ)V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lqa3/a0;->o()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lqa3/a0;->j()Lqa3/z;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Required value was null."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    :goto_0
    iget-object v1, p1, Lba3/i;->b:Lsa3/h;

    const-string v2, "typeTable"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lqa3/a0;->p()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lqa3/a0;->l()Lqa3/w0;

    move-result-object v1

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lqa3/a0;->q()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {p0}, Lqa3/a0;->m()I

    move-result v2

    invoke-virtual {v1, v2}, Lsa3/h;->a(I)Lqa3/w0;

    move-result-object v1

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_5

    invoke-static {v1, p1}, Lts/o;->O(Lqa3/w0;Lba3/i;)Laa3/b1;

    :cond_5
    invoke-virtual {p0}, Lqa3/a0;->i()Ljava/util/List;

    move-result-object v1

    const-string v2, "getAndArgumentList(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    iget-object v2, v0, Lwe/o;->w:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/a0;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v3, p1}, Lts/o;->L(Lqa3/a0;Lba3/i;)Lwe/o;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    invoke-virtual {p0}, Lqa3/a0;->n()Ljava/util/List;

    move-result-object p0

    const-string v1, "getOrArgumentList(...)"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    iget-object v1, v0, Lwe/o;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqa3/a0;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v2, p1}, Lts/o;->L(Lqa3/a0;Lba3/i;)Lwe/o;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    return-object v0
.end method

.method public static final M(Lqa3/c0;Lba3/i;)Laa3/y0;
    .locals 10

    new-instance v0, Laa3/y0;

    iget v1, p0, Lqa3/c0;->z:I

    iget v2, p0, Lqa3/c0;->F:I

    iget-object v3, p1, Lba3/i;->a:Lsa3/f;

    invoke-interface {v3, v2}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Laa3/y0;-><init>(ILjava/lang/String;)V

    iget-object v1, p0, Lqa3/c0;->I:Ljava/util/List;

    const-string v2, "getTypeParameterList(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lba3/i;->b(Ljava/util/List;)Lba3/i;

    move-result-object p1

    iget-object v1, p1, Lba3/i;->b:Lsa3/h;

    iget-object v3, p0, Lqa3/c0;->I:Ljava/util/List;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/b1;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v3, p1}, Lts/o;->P(Lqa3/b1;Lba3/i;)Laa3/d1;

    move-result-object v3

    iget-object v4, v0, Laa3/y0;->b:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {p0, v1}, Ljc/x;->l0(Lqa3/c0;Lsa3/h;)Lqa3/w0;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v2, p1}, Lts/o;->O(Lqa3/w0;Lba3/i;)Laa3/b1;

    :cond_1
    iget-object v2, p0, Lqa3/c0;->O:Ljava/util/List;

    const-string v3, "getContextParameterList(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    iget-object v4, v0, Laa3/y0;->e:Ljava/util/ArrayList;

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/e1;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v3, p1}, Lts/o;->Q(Lqa3/e1;Lba3/i;)Laa3/f1;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lqa3/c0;->O:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lqa3/c0;->L:Ljava/util/List;

    const-string v3, "getContextReceiverTypeList(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-static {p0, v1}, Ljc/x;->w(Lqa3/c0;Lsa3/h;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/w0;

    invoke-static {v3, p1}, Lts/o;->O(Lqa3/w0;Lba3/i;)Laa3/b1;

    new-instance v3, Laa3/f1;

    const/4 v5, 0x0

    const-string v6, "_"

    invoke-direct {v3, v5, v6}, Laa3/f1;-><init>(ILjava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    iget-object v2, p0, Lqa3/c0;->P:Ljava/util/List;

    const-string v3, "getValueParameterList(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/e1;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v3, p1}, Lts/o;->Q(Lqa3/e1;Lba3/i;)Laa3/f1;

    move-result-object v3

    iget-object v4, v0, Laa3/y0;->d:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-static {p0, v1}, Ljc/x;->q0(Lqa3/c0;Lsa3/h;)Lqa3/w0;

    move-result-object v2

    invoke-static {v2, p1}, Lts/o;->O(Lqa3/w0;Lba3/i;)Laa3/b1;

    iget v2, p0, Lqa3/c0;->y:I

    const/16 v3, 0x100

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_11

    iget-object v2, p0, Lqa3/c0;->S:Lqa3/q;

    const-string v3, "getContract(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/util/ArrayList;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v2, v2, Lqa3/q;->x:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lqa3/v;

    invoke-virtual {v5}, Lqa3/v;->n()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v5}, Lqa3/v;->k()Lqa3/t;

    move-result-object v6

    const-string v7, "Required value was null."

    if-eqz v6, :cond_10

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    const/4 v8, 0x2

    if-eqz v6, :cond_8

    if-eq v6, v4, :cond_7

    if-ne v6, v8, :cond_6

    sget-object v6, Laa3/w0;->y:Laa3/w0;

    goto :goto_5

    :cond_6
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_7
    sget-object v6, Laa3/w0;->x:Laa3/w0;

    goto :goto_5

    :cond_8
    sget-object v6, Laa3/w0;->w:Laa3/w0;

    :goto_5
    invoke-virtual {v5}, Lqa3/v;->o()Z

    move-result v9

    if-nez v9, :cond_9

    goto :goto_6

    :cond_9
    invoke-virtual {v5}, Lqa3/v;->l()Lqa3/u;

    move-result-object v9

    if-eqz v9, :cond_f

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-eqz v7, :cond_c

    if-eq v7, v4, :cond_b

    if-ne v7, v8, :cond_a

    sget-object v7, Laa3/v0;->w:[Laa3/v0;

    goto :goto_6

    :cond_a
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_b
    sget-object v7, Laa3/v0;->w:[Laa3/v0;

    goto :goto_6

    :cond_c
    sget-object v7, Laa3/v0;->w:[Laa3/v0;

    :goto_6
    new-instance v7, Laa3/u0;

    invoke-direct {v7, v6}, Laa3/u0;-><init>(Laa3/w0;)V

    invoke-virtual {v5}, Lqa3/v;->j()Ljava/util/List;

    move-result-object v6

    const-string v8, "getEffectConstructorArgumentList(...)"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/lang/Iterable;

    invoke-virtual {v7}, Laa3/u0;->l()Ljava/util/ArrayList;

    move-result-object v8

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lqa3/a0;

    invoke-static {v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v9, p1}, Lts/o;->L(Lqa3/a0;Lba3/i;)Lwe/o;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_d
    invoke-virtual {v5}, Lqa3/v;->m()Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-virtual {v5}, Lqa3/v;->i()Lqa3/a0;

    move-result-object v5

    const-string v6, "getConclusionOfConditionalEffect(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, p1}, Lts/o;->L(Lqa3/a0;Lba3/i;)Lwe/o;

    :cond_e
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_4

    :cond_f
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_10
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0, v7}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_11
    iget-object v2, p0, Lqa3/c0;->R:Ljava/util/List;

    const-string v3, "getVersionRequirementList(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3, p1}, Lts/o;->F(ILba3/i;)Laa3/i1;

    move-result-object v3

    iget-object v4, v0, Laa3/y0;->f:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_12
    iget-object v2, p1, Lba3/i;->h:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_13
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lca3/l;

    check-cast v3, Lea3/d;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p1, Lba3/i;->a:Lsa3/f;

    sget-object v4, Lea3/c;->a:Lca3/d;

    const-string v5, "type"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v0, Laa3/y0;->h:Ljava/util/ArrayList;

    invoke-static {v5, v4}, Lts/o;->H(Ljava/util/Collection;Lca3/d;)Lca3/c;

    move-result-object v4

    check-cast v4, Lca3/e;

    check-cast v4, Lea3/c;

    iget-object v4, p0, Lqa3/c0;->U:Ljava/util/List;

    const-string v5, "getAnnotationList(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_14

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lqa3/h;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v5, v3}, Lq83/g;->R(Lqa3/h;Lsa3/f;)Laa3/s;

    move-result-object v5

    iget-object v6, v0, Laa3/y0;->g:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_14
    iget-object v4, p0, Lqa3/c0;->V:Ljava/util/List;

    const-string v5, "getExtensionReceiverAnnotationList(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_15

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lqa3/h;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v5, v3}, Lq83/g;->R(Lqa3/h;Lsa3/f;)Laa3/s;

    move-result-object v5

    iget-object v6, v0, Laa3/y0;->c:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_15
    sget-object v4, Lua3/g;->a:Lwa3/i;

    invoke-static {p0, v3, v1}, Lua3/g;->c(Lqa3/c0;Lsa3/f;Lsa3/h;)Lua3/e;

    move-result-object v4

    if-eqz v4, :cond_16

    iget-object v5, v4, Lua3/e;->x:Ljava/lang/String;

    iget-object v4, v4, Lua3/e;->y:Ljava/lang/String;

    const-string v6, "name"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "descriptor"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_16
    sget-object v4, Lta3/l;->c:Lwa3/o;

    const-string v5, "lambdaClassOriginName"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, v4}, Lj93/l0;->x(Lwa3/m;Lwa3/o;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_13

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-interface {v3, v4}, Lsa3/f;->getString(I)Ljava/lang/String;

    goto/16 :goto_9

    :cond_17
    return-object v0
.end method

.method public static final N(Lqa3/k0;Lba3/i;)Laa3/z0;
    .locals 11

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Laa3/z0;

    iget v1, p0, Lqa3/k0;->z:I

    iget v2, p0, Lqa3/k0;->F:I

    iget-object v3, p1, Lba3/i;->a:Lsa3/f;

    invoke-interface {v3, v2}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Lqa3/k0;->y:I

    const/16 v4, 0x100

    and-int/2addr v3, v4

    if-ne v3, v4, :cond_0

    iget v3, p0, Lqa3/k0;->Q:I

    goto :goto_0

    :cond_0
    iget v3, p0, Lqa3/k0;->z:I

    invoke-static {v3}, Lts/o;->w(I)I

    move-result v3

    :goto_0
    iget v4, p0, Lqa3/k0;->y:I

    const/16 v5, 0x200

    and-int/2addr v4, v5

    if-ne v4, v5, :cond_1

    iget v4, p0, Lqa3/k0;->R:I

    goto :goto_1

    :cond_1
    iget v4, p0, Lqa3/k0;->z:I

    invoke-static {v4}, Lts/o;->w(I)I

    move-result v4

    :goto_1
    invoke-direct {v0, v1, v3, v4, v2}, Laa3/z0;-><init>(IIILjava/lang/String;)V

    iget-object v1, p0, Lqa3/k0;->I:Ljava/util/List;

    const-string v2, "getTypeParameterList(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lba3/i;->b(Ljava/util/List;)Lba3/i;

    move-result-object p1

    iget-object v1, p1, Lba3/i;->b:Lsa3/h;

    iget-object v3, p0, Lqa3/k0;->I:Ljava/util/List;

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/b1;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v3, p1}, Lts/o;->P(Lqa3/b1;Lba3/i;)Laa3/d1;

    move-result-object v3

    iget-object v4, v0, Laa3/z0;->d:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_2
    invoke-static {p0, v1}, Ljc/x;->m0(Lqa3/k0;Lsa3/h;)Lqa3/w0;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-static {v2, p1}, Lts/o;->O(Lqa3/w0;Lba3/i;)Laa3/b1;

    :cond_3
    iget-object v2, p0, Lqa3/k0;->O:Ljava/util/List;

    const-string v3, "getContextParameterList(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    iget-object v4, v0, Laa3/z0;->f:Ljava/util/ArrayList;

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/e1;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v3, p1}, Lts/o;->Q(Lqa3/e1;Lba3/i;)Laa3/f1;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    iget-object v2, p0, Lqa3/k0;->O:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lqa3/k0;->L:Ljava/util/List;

    const-string v3, "getContextReceiverTypeList(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-static {p0, v1}, Ljc/x;->x(Lqa3/k0;Lsa3/h;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/w0;

    invoke-static {v3, p1}, Lts/o;->O(Lqa3/w0;Lba3/i;)Laa3/b1;

    new-instance v3, Laa3/f1;

    const/4 v5, 0x0

    const-string v6, "_"

    invoke-direct {v3, v5, v6}, Laa3/f1;-><init>(ILjava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_5
    iget v2, p0, Lqa3/k0;->y:I

    const/16 v3, 0x80

    and-int/2addr v2, v3

    if-ne v2, v3, :cond_6

    iget-object v2, p0, Lqa3/k0;->P:Lqa3/e1;

    const-string v3, "getSetterValueParameter(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, p1}, Lts/o;->Q(Lqa3/e1;Lba3/i;)Laa3/f1;

    :cond_6
    invoke-static {p0, v1}, Ljc/x;->r0(Lqa3/k0;Lsa3/h;)Lqa3/w0;

    move-result-object v2

    invoke-static {v2, p1}, Lts/o;->O(Lqa3/w0;Lba3/i;)Laa3/b1;

    iget-object v2, p0, Lqa3/k0;->S:Ljava/util/List;

    const-string v3, "getVersionRequirementList(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-static {v3, p1}, Lts/o;->F(ILba3/i;)Laa3/i1;

    move-result-object v3

    iget-object v4, v0, Laa3/z0;->g:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_7
    iget-object v2, p1, Lba3/i;->h:Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_8
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lca3/l;

    check-cast v3, Lea3/d;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, p1, Lba3/i;->a:Lsa3/f;

    sget-object v4, Lea3/f;->a:Lca3/d;

    const-string v5, "type"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v0, Laa3/z0;->k:Ljava/util/ArrayList;

    invoke-static {v5, v4}, Lts/o;->H(Ljava/util/Collection;Lca3/d;)Lca3/c;

    move-result-object v4

    check-cast v4, Lca3/g;

    check-cast v4, Lea3/f;

    iget-object v4, p0, Lqa3/k0;->U:Ljava/util/List;

    const-string v5, "getAnnotationList(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lqa3/h;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v5, v3}, Lq83/g;->R(Lqa3/h;Lsa3/f;)Laa3/s;

    move-result-object v5

    iget-object v6, v0, Laa3/z0;->h:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_9
    iget-object v4, p0, Lqa3/k0;->V:Ljava/util/List;

    const-string v5, "getGetterAnnotationList(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Iterable;

    iget-object v5, v0, Laa3/z0;->b:Laa3/a1;

    iget-object v5, v5, Laa3/a1;->b:Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lqa3/h;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v6, v3}, Lq83/g;->R(Lqa3/h;Lsa3/f;)Laa3/s;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_a
    iget-object v4, v0, Laa3/z0;->c:Laa3/a1;

    if-eqz v4, :cond_b

    iget-object v5, p0, Lqa3/k0;->W:Ljava/util/List;

    const-string v6, "getSetterAnnotationList(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/Iterable;

    iget-object v4, v4, Laa3/a1;->b:Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lqa3/h;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v6, v3}, Lq83/g;->R(Lqa3/h;Lsa3/f;)Laa3/s;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_b
    iget-object v4, p0, Lqa3/k0;->X:Ljava/util/List;

    const-string v5, "getExtensionReceiverAnnotationList(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lqa3/h;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v5, v3}, Lq83/g;->R(Lqa3/h;Lsa3/f;)Laa3/s;

    move-result-object v5

    iget-object v6, v0, Laa3/z0;->e:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_c
    iget-object v4, p0, Lqa3/k0;->Y:Ljava/util/List;

    const-string v5, "getBackingFieldAnnotationList(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lqa3/h;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v5, v3}, Lq83/g;->R(Lqa3/h;Lsa3/f;)Laa3/s;

    move-result-object v5

    iget-object v6, v0, Laa3/z0;->i:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_d
    iget-object v4, p0, Lqa3/k0;->Z:Ljava/util/List;

    const-string v5, "getDelegateFieldAnnotationList(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lqa3/h;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v5, v3}, Lq83/g;->R(Lqa3/h;Lsa3/f;)Laa3/s;

    move-result-object v5

    iget-object v6, v0, Laa3/z0;->j:Ljava/util/ArrayList;

    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_e
    sget-object v4, Lua3/g;->a:Lwa3/i;

    const/4 v4, 0x1

    invoke-static {p0, v3, v1, v4}, Lua3/g;->b(Lqa3/k0;Lsa3/f;Lsa3/h;Z)Lua3/d;

    move-result-object v4

    sget-object v5, Lta3/l;->d:Lwa3/o;

    const-string v6, "propertySignature"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, v5}, Lj93/l0;->x(Lwa3/m;Lwa3/o;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lta3/f;

    const/4 v6, 0x0

    if-eqz v5, :cond_f

    invoke-virtual {v5}, Lta3/f;->i()Z

    move-result v7

    if-eqz v7, :cond_f

    iget-object v7, v5, Lta3/f;->E:Lta3/d;

    goto :goto_d

    :cond_f
    move-object v7, v6

    :goto_d
    if-eqz v5, :cond_10

    iget v8, v5, Lta3/f;->x:I

    const/16 v9, 0x8

    and-int/2addr v8, v9

    if-ne v8, v9, :cond_10

    iget-object v8, v5, Lta3/f;->F:Lta3/d;

    goto :goto_e

    :cond_10
    move-object v8, v6

    :goto_e
    sget-object v9, Lta3/l;->e:Lwa3/o;

    invoke-virtual {p0, v9}, Lwa3/m;->k(Lwa3/o;)Ljava/lang/Object;

    move-result-object v9

    const-string v10, "getExtension(...)"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    if-eqz v4, :cond_11

    iget-object v9, v4, Lua3/d;->x:Ljava/lang/String;

    iget-object v4, v4, Lua3/d;->y:Ljava/lang/String;

    const-string v10, "name"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v9, "descriptor"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_11
    if-eqz v7, :cond_12

    iget v4, v7, Lta3/d;->y:I

    invoke-interface {v3, v4}, Lsa3/f;->getString(I)Ljava/lang/String;

    iget v4, v7, Lta3/d;->z:I

    invoke-interface {v3, v4}, Lsa3/f;->getString(I)Ljava/lang/String;

    :cond_12
    if-eqz v8, :cond_13

    iget v4, v8, Lta3/d;->y:I

    invoke-interface {v3, v4}, Lsa3/f;->getString(I)Ljava/lang/String;

    iget v4, v8, Lta3/d;->z:I

    invoke-interface {v3, v4}, Lsa3/f;->getString(I)Ljava/lang/String;

    :cond_13
    if-eqz v5, :cond_14

    iget v4, v5, Lta3/f;->x:I

    const/4 v7, 0x2

    and-int/2addr v4, v7

    if-ne v4, v7, :cond_14

    iget-object v4, v5, Lta3/f;->z:Lta3/d;

    goto :goto_f

    :cond_14
    move-object v4, v6

    :goto_f
    if-eqz v4, :cond_15

    iget v7, v4, Lta3/d;->y:I

    invoke-interface {v3, v7}, Lsa3/f;->getString(I)Ljava/lang/String;

    iget v4, v4, Lta3/d;->z:I

    invoke-interface {v3, v4}, Lsa3/f;->getString(I)Ljava/lang/String;

    :cond_15
    if-eqz v5, :cond_16

    iget v4, v5, Lta3/f;->x:I

    const/16 v7, 0x10

    and-int/2addr v4, v7

    if-ne v4, v7, :cond_16

    iget-object v6, v5, Lta3/f;->G:Lta3/d;

    :cond_16
    if-eqz v6, :cond_8

    iget v4, v6, Lta3/d;->y:I

    invoke-interface {v3, v4}, Lsa3/f;->getString(I)Ljava/lang/String;

    iget v4, v6, Lta3/d;->z:I

    invoke-interface {v3, v4}, Lsa3/f;->getString(I)Ljava/lang/String;

    goto/16 :goto_6

    :cond_17
    return-object v0
.end method

.method public static final O(Lqa3/w0;Lba3/i;)Laa3/b1;
    .locals 10

    iget-object v0, p1, Lba3/i;->b:Lsa3/h;

    iget-object v1, p1, Lba3/i;->a:Lsa3/f;

    new-instance v2, Laa3/b1;

    iget-boolean v3, p0, Lqa3/w0;->E:Z

    iget v4, p0, Lqa3/w0;->Q:I

    const/4 v5, 0x1

    shl-int/2addr v4, v5

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Laa3/b1;-><init>(I)V

    invoke-virtual {p0}, Lqa3/w0;->p()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    new-instance v3, Laa3/o0;

    iget v6, p0, Lqa3/w0;->I:I

    invoke-static {v1, v6}, Lq83/g;->w(Lsa3/f;I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6}, Laa3/o0;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget v3, p0, Lqa3/w0;->y:I

    and-int/lit16 v6, v3, 0x80

    const/16 v7, 0x80

    if-ne v6, v7, :cond_1

    new-instance v3, Laa3/p0;

    iget v6, p0, Lqa3/w0;->L:I

    invoke-static {v1, v6}, Lq83/g;->w(Lsa3/f;I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6}, Laa3/p0;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    and-int/lit8 v6, v3, 0x20

    const/16 v7, 0x20

    if-ne v6, v7, :cond_2

    new-instance v3, Laa3/q0;

    iget v6, p0, Lqa3/w0;->J:I

    invoke-direct {v3, v6}, Laa3/q0;-><init>(I)V

    goto :goto_0

    :cond_2
    const/16 v6, 0x40

    and-int/2addr v3, v6

    if-ne v3, v6, :cond_12

    iget v3, p0, Lqa3/w0;->K:I

    invoke-virtual {p1, v3}, Lba3/i;->a(I)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_11

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    new-instance v6, Laa3/q0;

    invoke-direct {v6, v3}, Laa3/q0;-><init>(I)V

    move-object v3, v6

    :goto_0
    iput-object v3, v2, Laa3/b1;->b:Laa3/r0;

    iget-object v3, p0, Lqa3/w0;->z:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x2

    const/4 v8, 0x0

    if-eqz v6, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lqa3/u0;

    iget-object v9, v6, Lqa3/u0;->y:Lqa3/t0;

    if-eqz v9, :cond_9

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    if-eqz v9, :cond_6

    if-eq v9, v5, :cond_5

    if-eq v9, v7, :cond_4

    const/4 v7, 0x3

    if-ne v9, v7, :cond_3

    goto :goto_2

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_4
    sget-object v8, Laa3/g1;->w:Laa3/g1;

    goto :goto_2

    :cond_5
    sget-object v8, Laa3/g1;->y:Laa3/g1;

    goto :goto_2

    :cond_6
    sget-object v8, Laa3/g1;->x:Laa3/g1;

    :goto_2
    iget-object v7, v2, Laa3/b1;->c:Ljava/util/ArrayList;

    if-eqz v8, :cond_8

    invoke-static {v6, v0}, Ljc/x;->x0(Lqa3/u0;Lsa3/h;)Lqa3/w0;

    move-result-object v6

    if-eqz v6, :cond_7

    new-instance v9, Laa3/e1;

    invoke-static {v6, p1}, Lts/o;->O(Lqa3/w0;Lba3/i;)Laa3/b1;

    move-result-object v6

    invoke-direct {v9, v8, v6}, Laa3/e1;-><init>(Laa3/g1;Laa3/b1;)V

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_7
    new-instance p0, Lkotlin/reflect/jvm/internal/impl/km/InconsistentKotlinMetadataException;

    const-string p1, "No type argument for non-STAR projection in Type"

    invoke-direct {p0, p1, v4}, Lkotlin/reflect/jvm/internal/impl/km/InconsistentKotlinMetadataException;-><init>(Ljava/lang/String;I)V

    throw p0

    :cond_8
    sget-object v6, Laa3/e1;->c:Laa3/e1;

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Required value was null."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    invoke-static {p0, v0}, Ljc/x;->c(Lqa3/w0;Lsa3/h;)Lqa3/w0;

    move-result-object v3

    if-eqz v3, :cond_b

    invoke-static {v3, p1}, Lts/o;->O(Lqa3/w0;Lba3/i;)Laa3/b1;

    move-result-object v3

    goto :goto_3

    :cond_b
    move-object v3, v8

    :goto_3
    iput-object v3, v2, Laa3/b1;->d:Laa3/b1;

    invoke-static {p0, v0}, Ljc/x;->f0(Lqa3/w0;Lsa3/h;)Lqa3/w0;

    move-result-object v3

    if-eqz v3, :cond_c

    invoke-static {v3, p1}, Lts/o;->O(Lqa3/w0;Lba3/i;)Laa3/b1;

    move-result-object v3

    goto :goto_4

    :cond_c
    move-object v3, v8

    :goto_4
    iput-object v3, v2, Laa3/b1;->e:Laa3/b1;

    invoke-static {p0, v0}, Ljc/x;->H(Lqa3/w0;Lsa3/h;)Lqa3/w0;

    move-result-object v0

    if-eqz v0, :cond_e

    invoke-static {v0, p1}, Lts/o;->O(Lqa3/w0;Lba3/i;)Laa3/b1;

    move-result-object v0

    new-instance v3, Laa3/x0;

    iget v4, p0, Lqa3/w0;->y:I

    and-int/2addr v4, v7

    if-ne v4, v7, :cond_d

    iget v4, p0, Lqa3/w0;->F:I

    invoke-interface {v1, v4}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object v8

    :cond_d
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v0, v3, Laa3/x0;->a:Laa3/b1;

    iput-object v8, v3, Laa3/x0;->b:Ljava/lang/String;

    move-object v8, v3

    :cond_e
    iput-object v8, v2, Laa3/b1;->f:Laa3/x0;

    iget-object p1, p1, Lba3/i;->h:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_f
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lca3/l;

    check-cast v0, Lea3/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lea3/g;->c:Lca3/d;

    const-string v3, "type"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v2, Laa3/b1;->g:Ljava/util/ArrayList;

    invoke-static {v3, v0}, Lts/o;->H(Ljava/util/Collection;Lca3/d;)Lca3/c;

    move-result-object v0

    check-cast v0, Lca3/h;

    check-cast v0, Lea3/g;

    sget-object v3, Lta3/l;->f:Lwa3/o;

    invoke-virtual {p0, v3}, Lwa3/m;->k(Lwa3/o;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "getExtension(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    iput-boolean v3, v0, Lea3/g;->a:Z

    iget-object v3, p0, Lqa3/w0;->R:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lqa3/h;

    iget-object v5, v0, Lea3/g;->b:Ljava/util/ArrayList;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v4, v1}, Lq83/g;->R(Lqa3/h;Lsa3/f;)Laa3/s;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_10
    return-object v2

    :cond_11
    new-instance p1, Lkotlin/reflect/jvm/internal/impl/km/InconsistentKotlinMetadataException;

    iget p0, p0, Lqa3/w0;->K:I

    invoke-interface {v1, p0}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object p0

    const-string v0, "No type parameter id for "

    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0, v4}, Lkotlin/reflect/jvm/internal/impl/km/InconsistentKotlinMetadataException;-><init>(Ljava/lang/String;I)V

    throw p1

    :cond_12
    new-instance p0, Lkotlin/reflect/jvm/internal/impl/km/InconsistentKotlinMetadataException;

    const-string p1, "No classifier (class, type alias or type parameter) recorded for Type"

    invoke-direct {p0, p1, v4}, Lkotlin/reflect/jvm/internal/impl/km/InconsistentKotlinMetadataException;-><init>(Ljava/lang/String;I)V

    throw p0
.end method

.method public static final P(Lqa3/b1;Lba3/i;)Laa3/d1;
    .locals 6

    iget-object v0, p1, Lba3/i;->a:Lsa3/f;

    iget-object v1, p0, Lqa3/b1;->G:Lqa3/a1;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    sget-object v1, Laa3/g1;->w:Laa3/g1;

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object v1, Laa3/g1;->y:Laa3/g1;

    goto :goto_0

    :cond_2
    sget-object v1, Laa3/g1;->x:Laa3/g1;

    :goto_0
    new-instance v2, Laa3/d1;

    iget-boolean v3, p0, Lqa3/b1;->F:Z

    iget v4, p0, Lqa3/b1;->E:I

    invoke-interface {v0, v4}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget v5, p0, Lqa3/b1;->z:I

    invoke-direct {v2, v3, v4, v5, v1}, Laa3/d1;-><init>(ILjava/lang/String;ILaa3/g1;)V

    iget-object v1, p1, Lba3/i;->b:Lsa3/h;

    invoke-static {p0, v1}, Ljc/x;->A0(Lqa3/b1;Lsa3/h;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/w0;

    invoke-static {v3, p1}, Lts/o;->O(Lqa3/w0;Lba3/i;)Laa3/b1;

    move-result-object v3

    iget-object v4, v2, Laa3/d1;->e:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    iget-object p1, p1, Lba3/i;->h:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lca3/l;

    check-cast v1, Lea3/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lea3/h;->b:Lca3/d;

    const-string v3, "type"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v2, Laa3/d1;->f:Ljava/util/ArrayList;

    invoke-static {v3, v1}, Lts/o;->H(Ljava/util/Collection;Lca3/d;)Lca3/c;

    move-result-object v1

    check-cast v1, Lca3/i;

    check-cast v1, Lea3/h;

    iget-object v3, p0, Lqa3/b1;->K:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lqa3/h;

    invoke-virtual {v1}, Lea3/h;->a()Ljava/util/List;

    move-result-object v5

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v4, v0}, Lq83/g;->R(Lqa3/h;Lsa3/f;)Laa3/s;

    move-result-object v4

    check-cast v5, Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    return-object v2

    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Required value was null."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final Q(Lqa3/e1;Lba3/i;)Laa3/f1;
    .locals 5

    new-instance v0, Laa3/f1;

    iget v1, p0, Lqa3/e1;->z:I

    iget v2, p0, Lqa3/e1;->E:I

    iget-object v3, p1, Lba3/i;->a:Lsa3/f;

    invoke-interface {v3, v2}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Laa3/f1;-><init>(ILjava/lang/String;)V

    iget-object v1, p1, Lba3/i;->b:Lsa3/h;

    invoke-static {p0, v1}, Ljc/x;->y0(Lqa3/e1;Lsa3/h;)Lqa3/w0;

    move-result-object v2

    invoke-static {v2, p1}, Lts/o;->O(Lqa3/w0;Lba3/i;)Laa3/b1;

    invoke-static {p0, v1}, Ljc/x;->B0(Lqa3/e1;Lsa3/h;)Lqa3/w0;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1, p1}, Lts/o;->O(Lqa3/w0;Lba3/i;)Laa3/b1;

    :cond_0
    iget v1, p0, Lqa3/e1;->y:I

    const/16 v2, 0x40

    and-int/2addr v1, v2

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lqa3/e1;->K:Lqa3/e;

    const-string v2, "getAnnotationParameterDefaultValue(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3}, Lq83/g;->S(Lqa3/e;Lsa3/f;)Laa3/m0;

    :cond_1
    iget-object p1, p1, Lba3/i;->h:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lca3/l;

    check-cast v1, Lea3/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Lqa3/e1;->J:Ljava/util/List;

    const-string v2, "getAnnotationList(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqa3/h;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v2, v3}, Lq83/g;->R(Lqa3/h;Lsa3/f;)Laa3/s;

    move-result-object v2

    iget-object v4, v0, Laa3/f1;->b:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static final R(II)V
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-lez p0, :cond_0

    if-lez p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    if-nez v2, :cond_1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "both minLines "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " and maxLines "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " must be greater than zero"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lk0/a;->a(Ljava/lang/String;)V

    :cond_1
    if-gt p0, p1, :cond_2

    move v0, v1

    :cond_2
    if-nez v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "minLines "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " must be less than or equal to maxLines "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lk0/a;->a(Ljava/lang/String;)V

    :cond_3
    return-void
.end method

.method public static final S(ILandroidx/compose/runtime/Composer;I)Lo2/e;
    .locals 6

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    check-cast p1, Lp1/q;

    invoke-virtual {p1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    sget-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->c:Lp1/b0;

    invoke-virtual {p1, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/res/Resources;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    and-int/lit8 v3, p2, 0x70

    xor-int/lit8 v3, v3, 0x30

    const/4 v4, 0x1

    const/16 v5, 0x20

    if-le v3, v5, :cond_0

    invoke-virtual {p1, p0}, Lp1/q;->e(I)Z

    move-result v3

    if-nez v3, :cond_1

    :cond_0
    and-int/lit8 p2, p2, 0x30

    if-ne p2, v5, :cond_2

    :cond_1
    move p2, v4

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr p2, v3

    invoke-virtual {p1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr p2, v3

    invoke-virtual {p1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr p2, v2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez p2, :cond_3

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne v2, p2, :cond_5

    :cond_3
    new-instance p2, Landroid/util/TypedValue;

    invoke-direct {p2}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v1, p0, p2, v4}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    invoke-virtual {v1, p0}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p0

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2

    :goto_1
    const/4 v3, 0x2

    if-eq v2, v3, :cond_4

    if-eq v2, v4, :cond_4

    invoke-interface {p0}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2

    goto :goto_1

    :cond_4
    if-ne v2, v3, :cond_6

    iget p2, p2, Landroid/util/TypedValue;->changingConfigurations:I

    invoke-static {v0, v1, p0, p2}, Lts/o;->D(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;I)Lg3/a;

    move-result-object p0

    iget-object v2, p0, Lg3/a;->a:Lo2/e;

    invoke-virtual {p1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v2, Lo2/e;

    return-object v2

    :cond_6
    new-instance p0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string p1, "No start tag found"

    invoke-direct {p0, p1}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final T(Laa3/t0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lba3/i;)V
    .locals 5

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p0}, Laa3/t0;->c()Ljava/util/ArrayList;

    move-result-object v0

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqa3/c0;

    invoke-static {v1, p4}, Lts/o;->M(Lqa3/c0;Lba3/i;)Laa3/y0;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p0}, Laa3/t0;->a()Ljava/util/ArrayList;

    move-result-object p1

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqa3/k0;

    invoke-static {v0, p4}, Lts/o;->N(Lqa3/k0;Lba3/i;)Laa3/z0;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p0}, Laa3/t0;->b()Ljava/util/ArrayList;

    move-result-object p0

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lqa3/y0;

    new-instance p3, Laa3/c1;

    iget v0, p2, Lqa3/y0;->z:I

    iget v1, p2, Lqa3/y0;->E:I

    iget-object v2, p4, Lba3/i;->a:Lsa3/f;

    invoke-interface {v2, v1}, Lsa3/f;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p3, v0, v1}, Laa3/c1;-><init>(ILjava/lang/String;)V

    iget-object v0, p2, Lqa3/y0;->F:Ljava/util/List;

    const-string v1, "getTypeParameterList(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p4, v0}, Lba3/i;->b(Ljava/util/List;)Lba3/i;

    move-result-object v0

    iget-object v2, v0, Lba3/i;->b:Lsa3/h;

    iget-object v3, p2, Lqa3/y0;->F:Ljava/util/List;

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lqa3/b1;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v3, v0}, Lts/o;->P(Lqa3/b1;Lba3/i;)Laa3/d1;

    move-result-object v3

    iget-object v4, p3, Laa3/c1;->b:Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_2
    invoke-static {p2, v2}, Ljc/x;->z0(Lqa3/y0;Lsa3/h;)Lqa3/w0;

    move-result-object v1

    invoke-static {v1, v0}, Lts/o;->O(Lqa3/w0;Lba3/i;)Laa3/b1;

    invoke-static {p2, v2}, Ljc/x;->G(Lqa3/y0;Lsa3/h;)Lqa3/w0;

    move-result-object v1

    invoke-static {v1, v0}, Lts/o;->O(Lqa3/w0;Lba3/i;)Laa3/b1;

    iget-object v1, p2, Lqa3/y0;->K:Ljava/util/List;

    const-string v2, "getAnnotationList(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lqa3/h;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v3, v0, Lba3/i;->a:Lsa3/f;

    invoke-static {v2, v3}, Lq83/g;->R(Lqa3/h;Lsa3/f;)Laa3/s;

    move-result-object v2

    iget-object v3, p3, Laa3/c1;->c:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_3
    iget-object p2, p2, Lqa3/y0;->L:Ljava/util/List;

    const-string v1, "getVersionRequirementList(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_5
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1, v0}, Lts/o;->F(ILba3/i;)Laa3/i1;

    move-result-object v1

    iget-object v2, p3, Laa3/c1;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_4
    iget-object p2, v0, Lba3/i;->h:Ljava/util/List;

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lca3/l;

    check-cast v0, Lea3/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_6

    :cond_5
    invoke-interface {p0, p3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_6
    return-void
.end method

.method public static final U(Ljava/util/List;Lqc/q;)Lqc/q;
    .locals 14

    const-string v1, "schedulers"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "workSpec"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p1, Lqc/q;->e:Lic/g;

    const-string v2, "androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME"

    invoke-virtual {v1, v2}, Lic/g;->d(Ljava/lang/String;)Z

    move-result v1

    iget-object v3, p1, Lqc/q;->e:Lic/g;

    const-string v4, "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME"

    invoke-virtual {v3, v4}, Lic/g;->d(Ljava/lang/String;)Z

    move-result v3

    iget-object v4, p1, Lqc/q;->e:Lic/g;

    const-string v5, "androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME"

    invoke-virtual {v4, v5}, Lic/g;->d(Ljava/lang/String;)Z

    move-result v4

    if-nez v1, :cond_0

    if-eqz v3, :cond_0

    if-eqz v4, :cond_0

    iget-object v1, p1, Lqc/q;->c:Ljava/lang/String;

    new-instance v3, Lb0/b;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Lb0/b;-><init>(I)V

    iget-object v4, p1, Lqc/q;->e:Lic/g;

    const-string v5, "data"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v4, Lic/g;->a:Ljava/util/HashMap;

    invoke-virtual {v3, v4}, Lb0/b;->e(Ljava/util/Map;)V

    iget-object v4, v3, Lb0/b;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v4, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3}, Lb0/b;->b()Lic/g;

    move-result-object v4

    const/4 v12, 0x0

    const v13, 0x1ffffeb

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-string v3, "androidx.work.multiprocess.RemoteListenableDelegatingWorker"

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v13}, Lqc/q;->b(Lqc/q;Ljava/lang/String;Lic/m0;Ljava/lang/String;Lic/g;IJIIJII)Lqc/q;

    move-result-object v0

    return-object v0

    :cond_0
    return-object p1
.end method

.method public static a(Li2/g;I)Landroidx/compose/ui/graphics/painter/BitmapPainter;
    .locals 7

    iget-object v0, p0, Li2/g;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    int-to-long v1, v1

    const/16 v3, 0x20

    shl-long/2addr v1, v3

    int-to-long v3, v0

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    or-long v0, v1, v3

    new-instance v2, Landroidx/compose/ui/graphics/painter/BitmapPainter;

    invoke-direct {v2, p0, v0, v1}, Landroidx/compose/ui/graphics/painter/BitmapPainter;-><init>(Li2/g;J)V

    iput p1, v2, Landroidx/compose/ui/graphics/painter/BitmapPainter;->G:I

    return-object v2
.end method

.method public static final b(Lad3/c;Lkotlin/jvm/functions/Function1;)Lad3/r;
    .locals 19

    move-object/from16 v0, p0

    const-string v1, "from"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lad3/g;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iget-object v2, v0, Lad3/c;->a:Lad3/i;

    iget-boolean v3, v2, Lad3/i;->a:Z

    iput-boolean v3, v1, Lad3/g;->a:Z

    iget-boolean v3, v2, Lad3/i;->f:Z

    iput-boolean v3, v1, Lad3/g;->b:Z

    iget-boolean v3, v2, Lad3/i;->b:Z

    iput-boolean v3, v1, Lad3/g;->c:Z

    iget-boolean v3, v2, Lad3/i;->c:Z

    iput-boolean v3, v1, Lad3/g;->d:Z

    iget-boolean v3, v2, Lad3/i;->e:Z

    iput-boolean v3, v1, Lad3/g;->e:Z

    iget-object v3, v2, Lad3/i;->g:Ljava/lang/String;

    iput-object v3, v1, Lad3/g;->f:Ljava/lang/String;

    iget-boolean v4, v2, Lad3/i;->h:Z

    iput-boolean v4, v1, Lad3/g;->g:Z

    iget-object v4, v2, Lad3/i;->i:Ljava/lang/String;

    iput-object v4, v1, Lad3/g;->h:Ljava/lang/String;

    iget-object v4, v2, Lad3/i;->n:Lad3/a;

    iput-object v4, v1, Lad3/g;->i:Lad3/a;

    iget-boolean v4, v2, Lad3/i;->k:Z

    iput-boolean v4, v1, Lad3/g;->j:Z

    iget-object v4, v2, Lad3/i;->l:Lad3/v;

    iput-object v4, v1, Lad3/g;->k:Lad3/v;

    iget-boolean v4, v2, Lad3/i;->m:Z

    iput-boolean v4, v1, Lad3/g;->l:Z

    iget-boolean v4, v2, Lad3/i;->j:Z

    iput-boolean v4, v1, Lad3/g;->m:Z

    iget-boolean v2, v2, Lad3/i;->d:Z

    iput-boolean v2, v1, Lad3/g;->n:Z

    iget-object v0, v0, Lad3/c;->b:Lcd3/f;

    iput-object v0, v1, Lad3/g;->o:Lcd3/f;

    move-object/from16 v0, p1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget-boolean v0, v1, Lad3/g;->e:Z

    const-string v2, "    "

    if-nez v0, :cond_1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Indent should not be specified when default printing mode is used"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_4

    invoke-virtual {v3, v0}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v4, 0x20

    if-eq v2, v4, :cond_3

    const/16 v4, 0x9

    if-eq v2, v4, :cond_3

    const/16 v4, 0xd

    if-eq v2, v4, :cond_3

    const/16 v4, 0xa

    if-ne v2, v4, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had "

    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    new-instance v4, Lad3/i;

    iget-boolean v5, v1, Lad3/g;->a:Z

    iget-boolean v6, v1, Lad3/g;->c:Z

    iget-boolean v7, v1, Lad3/g;->d:Z

    iget-boolean v8, v1, Lad3/g;->n:Z

    iget-boolean v9, v1, Lad3/g;->e:Z

    iget-boolean v10, v1, Lad3/g;->b:Z

    iget-object v11, v1, Lad3/g;->f:Ljava/lang/String;

    iget-boolean v12, v1, Lad3/g;->g:Z

    iget-object v13, v1, Lad3/g;->h:Ljava/lang/String;

    iget-boolean v14, v1, Lad3/g;->m:Z

    iget-boolean v15, v1, Lad3/g;->j:Z

    iget-object v0, v1, Lad3/g;->k:Lad3/v;

    iget-boolean v2, v1, Lad3/g;->l:Z

    iget-object v3, v1, Lad3/g;->i:Lad3/a;

    move-object/from16 v16, v0

    move/from16 v17, v2

    move-object/from16 v18, v3

    invoke-direct/range {v4 .. v18}, Lad3/i;-><init>(ZZZZZZLjava/lang/String;ZLjava/lang/String;ZZLad3/v;ZLad3/a;)V

    new-instance v0, Lad3/r;

    iget-object v1, v1, Lad3/g;->o:Lcd3/f;

    const-string v2, "module"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v4, v1}, Lad3/c;-><init>(Lad3/i;Lcd3/f;)V

    sget-object v2, Lcd3/i;->a:Lcd3/d;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    return-object v0

    :cond_5
    new-instance v2, Lbd3/u;

    invoke-direct {v2, v4}, Lbd3/u;-><init>(Lad3/i;)V

    invoke-virtual {v1, v2}, Lcd3/f;->a(Lcd3/h;)V

    return-object v0
.end method

.method public static final c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 12

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p0, v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    const/4 v10, 0x0

    const v11, 0x7effb

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v4, p0

    move-object v1, p1

    invoke-static/range {v1 .. v11}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static d(Laa3/i1;)Laa3/i1;
    .locals 9

    iget-object v0, p0, Laa3/i1;->d:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Double;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Laa3/i1;->c:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Double;

    iget-object v1, p0, Laa3/i1;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lts/o;->e(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)Ljava/lang/Double;

    move-result-object v6

    new-instance v3, Laa3/i1;

    iget-object v0, p0, Laa3/i1;->b:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/Boolean;

    iget-object v0, p0, Laa3/i1;->c:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/Double;

    iget-object v0, p0, Laa3/i1;->e:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ljava/lang/Boolean;

    iget-object p0, p0, Laa3/i1;->f:Ljava/lang/Object;

    move-object v8, p0

    check-cast v8, Ljava/lang/Double;

    invoke-direct/range {v3 .. v8}, Laa3/i1;-><init>(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/Double;)V

    return-object v3
.end method

.method public static e(Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/Double;)Ljava/lang/Double;
    .locals 6

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    invoke-static {}, Lio/sentry/util/k;->a()Lio/sentry/util/j;

    move-result-object p1

    invoke-virtual {p1}, Lio/sentry/util/j;->c()D

    move-result-wide v0

    if-eqz p2, :cond_2

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p0

    mul-double/2addr p0, v0

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p0

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    sub-double/2addr v2, v4

    mul-double/2addr v2, v0

    add-double/2addr v2, p0

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ldc3/w;Ljava/lang/Throwable;)V
    .locals 1

    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/concurrent/CancellationException;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    const-string v0, "Channel was consumed, consumer had failed"

    invoke-static {v0, p1}, Ldc/a;->d(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v0

    :cond_1
    invoke-interface {p0, v0}, Ldc3/w;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final g(Landroidx/work/impl/WorkDatabase;Lic/b;Ljc/o;)V
    .locals 5

    const-string v0, "workDatabase"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {p2}, [Ljc/o;

    move-result-object p2

    invoke-static {p2}, Lwb3/f;->P([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object p2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-virtual {p2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-static {p2}, Lm83/s;->l1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljc/o;

    iget-object v2, v2, Ljc/o;->d:Ljava/util/List;

    const-string v3, "getWork(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    instance-of v3, v2, Ljava/util/Collection;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v0

    goto :goto_2

    :cond_0
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v3, v0

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lic/r0;

    iget-object v4, v4, Lic/r0;->b:Lqc/q;

    iget-object v4, v4, Lqc/q;->j:Lic/e;

    invoke-virtual {v4}, Lic/e;->b()Z

    move-result v4

    if-eqz v4, :cond_1

    add-int/lit8 v3, v3, 0x1

    if-ltz v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {}, Lwb3/f;->c0()V

    const/4 p0, 0x0

    throw p0

    :cond_3
    :goto_2
    add-int/2addr v1, v3

    goto :goto_0

    :cond_4
    if-nez v1, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {p0}, Landroidx/work/impl/WorkDatabase;->h()Lqc/u;

    move-result-object p0

    iget-object p0, p0, Lqc/u;->a:Landroidx/room/z0;

    new-instance p2, Lq80/f;

    const/16 v2, 0xe

    invoke-direct {p2, v2}, Lq80/f;-><init>(I)V

    const/4 v2, 0x1

    invoke-static {p0, v2, v0, p2}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    iget p1, p1, Lic/b;->j:I

    add-int p2, p0, v1

    if-gt p2, p1, :cond_6

    :goto_3
    return-void

    :cond_6
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, ";\nalready enqueued count: "

    const-string v2, ";\ncurrent enqueue operation count: "

    const-string v3, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: "

    invoke-static {p1, p0, v3, v0, v2}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    const-string p1, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."

    invoke-static {p0, v1, p1}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static h(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final i(Le63/d;)Li63/d;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Le63/d;->c:Li63/n;

    sget-object v0, Li63/r;->a:Ljava/util/List;

    const-string v0, "Content-Type"

    invoke-virtual {p0, v0}, Lal/a;->w0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    sget-object v0, Li63/d;->f:Li63/d;

    invoke-static {p0}, Ljc/x;->h0(Ljava/lang/String;)Li63/d;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final j(II)V
    .locals 4

    if-gt p0, p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, ") is greater than size ("

    const-string v2, ")."

    const-string v3, "toIndex ("

    invoke-static {p0, p1, v3, v1, v2}, Lm4/a;->e(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static k(Landroid/content/Context;)Lh6/t;
    .locals 8

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v1, "Package manager required to locate emoji font provider"

    invoke-static {v0, v1}, Lwb3/f;->q(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    const-string v2, "androidx.content.action.LOAD_EMOJI_FONT"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->queryIntentContentProviders(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/pm/ResolveInfo;

    iget-object v3, v3, Landroid/content/pm/ResolveInfo;->providerInfo:Landroid/content/pm/ProviderInfo;

    if-eqz v3, :cond_0

    iget-object v5, v3, Landroid/content/pm/ProviderInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    if-eqz v5, :cond_0

    iget v5, v5, Landroid/content/pm/ApplicationInfo;->flags:I

    const/4 v6, 0x1

    and-int/2addr v5, v6

    if-ne v5, v6, :cond_0

    goto :goto_0

    :cond_1
    move-object v3, v4

    :goto_0
    if-nez v3, :cond_2

    :goto_1
    move-object v2, v4

    goto :goto_3

    :cond_2
    :try_start_0
    iget-object v1, v3, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    iget-object v3, v3, Landroid/content/pm/ProviderInfo;->packageName:Ljava/lang/String;

    const/16 v5, 0x40

    invoke-virtual {v0, v3, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    array-length v6, v0

    :goto_2
    if-ge v2, v6, :cond_3

    aget-object v7, v0, v2

    invoke-virtual {v7}, Landroid/content/pm/Signature;->toByteArray()[B

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_3
    invoke-static {v5}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v2, Lc5/d;

    const-string v5, "emojicompat-emoji-font"

    invoke-direct {v2, v1, v3, v5, v0}, Lc5/d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    const-string v1, "emoji2.text.DefaultEmojiConfig"

    invoke-static {v1, v0}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    :goto_3
    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    new-instance v4, Lh6/t;

    new-instance v0, Lh6/s;

    invoke-direct {v0, p0, v2}, Lh6/s;-><init>(Landroid/content/Context;Lc5/d;)V

    invoke-direct {v4, v0}, Lh6/t;-><init>(Lh6/i;)V

    :goto_4
    return-object v4
.end method

.method public static final l(Ljava/lang/Throwable;)Ll83/m;
    .locals 1

    const-string v0, "exception"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll83/m;

    invoke-direct {v0, p0}, Ll83/m;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static final q(Lne3/p;Lne3/e0;)V
    .locals 3

    :try_start_0
    invoke-virtual {p0, p1}, Lne3/p;->J(Lne3/e0;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lne3/e0;

    :try_start_1
    invoke-virtual {p0, v1}, Lne3/p;->T(Lne3/e0;)Ln4/f;

    move-result-object v2

    iget-boolean v2, v2, Ln4/f;->c:Z

    if-eqz v2, :cond_1

    invoke-static {p0, v1}, Lts/o;->q(Lne3/p;Lne3/e0;)V

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_2

    :cond_1
    :goto_1
    invoke-virtual {p0, v1}, Lne3/p;->m(Lne3/e0;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :goto_2
    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_2
    if-nez v0, :cond_3

    return-void

    :cond_3
    throw v0

    :catch_1
    return-void
.end method

.method public static final r(Landroidx/room/j0;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 2

    new-instance v0, La11/g;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, La11/g;-><init>(I)V

    invoke-interface {p0, p1, v0, p2}, Landroidx/room/j0;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final t(Landroid/view/View;)Lpb/f;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    const/4 v0, 0x0

    if-eqz p0, :cond_3

    const v1, 0x7f0a0d68

    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lpb/f;

    if-eqz v2, :cond_0

    check-cast v1, Lpb/f;

    goto :goto_1

    :cond_0
    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_1

    return-object v1

    :cond_1
    invoke-static {p0}, Ldt/b;->v(Landroid/view/View;)Landroid/view/ViewParent;

    move-result-object p0

    instance-of v1, p0, Landroid/view/View;

    if-eqz v1, :cond_2

    check-cast p0, Landroid/view/View;

    goto :goto_0

    :cond_2
    move-object p0, v0

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method public static u(Ljavax/net/ssl/SSLSession;)Lud3/c0;
    .locals 6

    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getCipherSuite()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v1, "TLS_NULL_WITH_NULL_NULL"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "SSL_NULL_WITH_NULL_NULL"

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    sget-object v1, Lud3/o;->b:Lud3/t;

    invoke-virtual {v1, v0}, Lud3/t;->c(Ljava/lang/String;)Lud3/o;

    move-result-object v0

    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getProtocol()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v2, "NONE"

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    sget-object v2, Lud3/c1;->x:Lud3/t;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v1}, Lud3/t;->d(Ljava/lang/String;)Lud3/c1;

    move-result-object v1

    :try_start_0
    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getPeerCertificates()[Ljava/security/cert/Certificate;

    move-result-object v2

    invoke-static {v2}, Lwd3/h;->k([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v2, Lm83/y;->w:Lm83/y;

    :goto_0
    new-instance v3, Lud3/c0;

    invoke-interface {p0}, Ljavax/net/ssl/SSLSession;->getLocalCertificates()[Ljava/security/cert/Certificate;

    move-result-object p0

    invoke-static {p0}, Lwd3/h;->k([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    new-instance v4, Lm83/p;

    const/16 v5, 0xf

    invoke-direct {v4, v2, v5}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v3, v1, v0, p0, v4}, Lud3/c0;-><init>(Lud3/c1;Lud3/o;Ljava/util/List;Lc93/a;)V

    return-object v3

    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "tlsVersion == NONE"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "tlsVersion == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string v1, "cipherSuite == "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "cipherSuite == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static v(Landroid/view/KeyEvent$Callback;)Ljava/lang/String;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final w(I)I
    .locals 3

    sget-object v0, Lsa3/d;->c:Lsa3/b;

    invoke-virtual {v0, p0}, Lsa3/b;->g(I)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    sget-object v1, Lsa3/d;->d:Lsa3/c;

    invoke-virtual {v1, p0}, Lsa3/c;->e(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lqa3/k1;

    sget-object v2, Lsa3/d;->e:Lsa3/c;

    invoke-virtual {v2, p0}, Lsa3/c;->e(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lqa3/e0;

    invoke-static {v0, v1, p0}, Lsa3/d;->b(ZLqa3/k1;Lqa3/e0;)I

    move-result p0

    return p0
.end method

.method public static x(Landroid/content/Context;I)Ljava/lang/String;
    .locals 1

    const-string v0, "context"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0xffffff

    if-gt p1, v0, :cond_0

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p0

    :goto_0
    const-string p1, "try {\n                  \u2026tring()\n                }"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static y(Leb/n0;)Lxb3/i;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Leb/c;->F:Leb/c;

    invoke-static {p0, v0}, Lxb3/k;->x(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lxb3/i;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract m(Landroid/content/Context;Lu4/e;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;
.end method

.method public abstract n(Landroid/content/Context;[Lc5/i;I)Landroid/graphics/Typeface;
.end method

.method public o(Landroid/content/Context;Ljava/util/List;I)Landroid/graphics/Typeface;
    .locals 0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "createFromFontInfoWithFallback must only be called on API 29+"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public p(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;
    .locals 0

    invoke-static {p1}, Lwb3/f;->E(Landroid/content/Context;)Ljava/io/File;

    move-result-object p1

    const/4 p4, 0x0

    if-nez p1, :cond_0

    return-object p4

    :cond_0
    :try_start_0
    invoke-static {p1, p2, p3}, Lwb3/f;->v(Ljava/io/File;Landroid/content/res/Resources;I)Z

    move-result p2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p2, :cond_1

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object p4

    :cond_1
    :try_start_1
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/graphics/Typeface;->createFromFile(Ljava/lang/String;)Landroid/graphics/Typeface;

    move-result-object p2
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object p2

    :catchall_0
    move-exception p2

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    throw p2

    :catch_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    return-object p4
.end method

.method public s([Lc5/i;I)Lc5/i;
    .locals 11

    new-instance v0, Lt9/p;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lt9/p;-><init>(I)V

    and-int/lit8 v1, p2, 0x1

    if-nez v1, :cond_0

    const/16 v1, 0x190

    goto :goto_0

    :cond_0
    const/16 v1, 0x2bc

    :goto_0
    and-int/lit8 p2, p2, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz p2, :cond_1

    move p2, v3

    goto :goto_1

    :cond_1
    move p2, v2

    :goto_1
    array-length v4, p1

    const/4 v5, 0x0

    const v6, 0x7fffffff

    move v7, v2

    :goto_2
    if-ge v7, v4, :cond_5

    aget-object v8, p1, v7

    invoke-virtual {v0, v8}, Lt9/p;->r(Ljava/lang/Object;)I

    move-result v9

    sub-int/2addr v9, v1

    invoke-static {v9}, Ljava/lang/Math;->abs(I)I

    move-result v9

    mul-int/lit8 v9, v9, 0x2

    invoke-virtual {v0, v8}, Lt9/p;->s(Ljava/lang/Object;)Z

    move-result v10

    if-ne v10, p2, :cond_2

    move v10, v2

    goto :goto_3

    :cond_2
    move v10, v3

    :goto_3
    add-int/2addr v9, v10

    if-eqz v5, :cond_3

    if-le v6, v9, :cond_4

    :cond_3
    move-object v5, v8

    move v6, v9

    :cond_4
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_5
    return-object v5
.end method

.method public abstract z()Ljava/lang/Integer;
.end method
