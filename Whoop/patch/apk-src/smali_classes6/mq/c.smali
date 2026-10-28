.class public final Lmq/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lmq/b;

.field public final b:Lmq/b;

.field public final c:F

.field public final d:F

.field public final e:F

.field public final f:F

.field public final g:F

.field public final h:F

.field public final i:I

.field public final j:I

.field public final k:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 18

    move-object/from16 v1, p0

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lmq/b;

    invoke-direct {v0}, Lmq/b;-><init>()V

    iput-object v0, v1, Lmq/c;->b:Lmq/b;

    new-instance v0, Lmq/b;

    invoke-direct {v0}, Lmq/b;-><init>()V

    iget v2, v0, Lmq/b;->w:I

    const/4 v8, 0x2

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eqz v2, :cond_4

    const-string v3, "badge"

    :try_start_0
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4, v2}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object v4

    :cond_0
    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v5

    if-eq v5, v8, :cond_1

    if-ne v5, v9, :cond_0

    :cond_1
    if-ne v5, v8, :cond_3

    invoke-interface {v4}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-static {v4}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v2
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-interface {v2}, Landroid/util/AttributeSet;->getStyleAttribute()I

    move-result v3

    move/from16 v17, v3

    move-object v3, v2

    move/from16 v2, v17

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_0

    :cond_2
    :try_start_1
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Must have a <"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, "> start tag"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Lorg/xmlpull/v1/XmlPullParserException;

    const-string v3, "No start tag found"

    invoke-direct {v0, v3}, Lorg/xmlpull/v1/XmlPullParserException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :goto_0
    new-instance v3, Landroid/content/res/Resources$NotFoundException;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Can\'t load badge resource ID #0x"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v3

    :cond_4
    const/4 v2, 0x0

    move-object v3, v2

    move v2, v10

    :goto_1
    if-nez v2, :cond_5

    const v2, 0x7f1505bc

    :cond_5
    move v6, v2

    sget-object v4, Ljq/a;->c:[I

    new-array v7, v10, [I

    const v5, 0x7f04007c

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v7}, Lcr/m;->g(Landroid/content/Context;Landroid/util/AttributeSet;[III[I)Landroid/content/res/TypedArray;

    move-result-object v3

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const/4 v5, 0x4

    const/4 v6, -0x1

    invoke-virtual {v3, v5, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v7

    int-to-float v7, v7

    iput v7, v1, Lmq/c;->c:F

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v11, 0x7f0702f4

    invoke-virtual {v7, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v7

    iput v7, v1, Lmq/c;->i:I

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    const v11, 0x7f0702f7

    invoke-virtual {v7, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v7

    iput v7, v1, Lmq/c;->j:I

    const/16 v7, 0xe

    invoke-virtual {v3, v7, v6}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v11

    int-to-float v11, v11

    iput v11, v1, Lmq/c;->d:F

    const v11, 0x7f070114

    invoke-virtual {v4, v11}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v12

    const/16 v13, 0xc

    invoke-virtual {v3, v13, v12}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v12

    iput v12, v1, Lmq/c;->e:F

    const/16 v12, 0x11

    const v14, 0x7f070118

    invoke-virtual {v4, v14}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v15

    invoke-virtual {v3, v12, v15}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v12

    iput v12, v1, Lmq/c;->g:F

    invoke-virtual {v4, v11}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v11

    const/4 v12, 0x3

    invoke-virtual {v3, v12, v11}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v11

    iput v11, v1, Lmq/c;->f:F

    const/16 v11, 0xd

    invoke-virtual {v4, v14}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v14

    invoke-virtual {v3, v11, v14}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v11

    iput v11, v1, Lmq/c;->h:F

    const/16 v11, 0x18

    invoke-virtual {v3, v11, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v11

    iput v11, v1, Lmq/c;->k:I

    iget-object v11, v1, Lmq/c;->b:Lmq/b;

    iget v14, v0, Lmq/b;->I:I

    const/4 v15, -0x2

    if-ne v14, v15, :cond_6

    const/16 v14, 0xff

    :cond_6
    iput v14, v11, Lmq/b;->I:I

    iget v14, v0, Lmq/b;->K:I

    if-eq v14, v15, :cond_7

    iput v14, v11, Lmq/b;->K:I

    goto :goto_2

    :cond_7
    const/16 v11, 0x17

    invoke-virtual {v3, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v14

    if-eqz v14, :cond_8

    iget-object v6, v1, Lmq/c;->b:Lmq/b;

    invoke-virtual {v3, v11, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v11

    iput v11, v6, Lmq/b;->K:I

    goto :goto_2

    :cond_8
    iget-object v11, v1, Lmq/c;->b:Lmq/b;

    iput v6, v11, Lmq/b;->K:I

    :goto_2
    iget-object v6, v0, Lmq/b;->J:Ljava/lang/String;

    const/4 v11, 0x7

    if-eqz v6, :cond_9

    iget-object v14, v1, Lmq/c;->b:Lmq/b;

    iput-object v6, v14, Lmq/b;->J:Ljava/lang/String;

    goto :goto_3

    :cond_9
    invoke-virtual {v3, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    if-eqz v6, :cond_a

    iget-object v6, v1, Lmq/c;->b:Lmq/b;

    invoke-virtual {v3, v11}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v14

    iput-object v14, v6, Lmq/b;->J:Ljava/lang/String;

    :cond_a
    :goto_3
    iget-object v6, v1, Lmq/c;->b:Lmq/b;

    iget-object v14, v0, Lmq/b;->O:Ljava/lang/CharSequence;

    iput-object v14, v6, Lmq/b;->O:Ljava/lang/CharSequence;

    iget-object v14, v0, Lmq/b;->P:Ljava/lang/CharSequence;

    if-nez v14, :cond_b

    const v14, 0x7f1408cb

    invoke-virtual {v2, v14}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v14

    :cond_b
    iput-object v14, v6, Lmq/b;->P:Ljava/lang/CharSequence;

    iget-object v6, v1, Lmq/c;->b:Lmq/b;

    iget v14, v0, Lmq/b;->Q:I

    if-nez v14, :cond_c

    const v14, 0x7f120022

    :cond_c
    iput v14, v6, Lmq/b;->Q:I

    iget v14, v0, Lmq/b;->R:I

    if-nez v14, :cond_d

    const v14, 0x7f1408d8

    :cond_d
    iput v14, v6, Lmq/b;->R:I

    iget-object v14, v0, Lmq/b;->T:Ljava/lang/Boolean;

    if-eqz v14, :cond_f

    invoke-virtual {v14}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v14

    if-eqz v14, :cond_e

    goto :goto_4

    :cond_e
    move v14, v10

    goto :goto_5

    :cond_f
    :goto_4
    move v14, v9

    :goto_5
    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    iput-object v14, v6, Lmq/b;->T:Ljava/lang/Boolean;

    iget-object v6, v1, Lmq/c;->b:Lmq/b;

    iget v14, v0, Lmq/b;->L:I

    if-ne v14, v15, :cond_10

    const/16 v14, 0x15

    invoke-virtual {v3, v14, v15}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v14

    :cond_10
    iput v14, v6, Lmq/b;->L:I

    iget-object v6, v1, Lmq/c;->b:Lmq/b;

    iget v14, v0, Lmq/b;->M:I

    if-ne v14, v15, :cond_11

    const/16 v14, 0x16

    invoke-virtual {v3, v14, v15}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v14

    :cond_11
    iput v14, v6, Lmq/b;->M:I

    iget-object v6, v1, Lmq/c;->b:Lmq/b;

    iget-object v14, v0, Lmq/b;->E:Ljava/lang/Integer;

    const v15, 0x7f150229

    const/4 v11, 0x5

    if-nez v14, :cond_12

    invoke-virtual {v3, v11, v15}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v14

    goto :goto_6

    :cond_12
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    :goto_6
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    iput-object v14, v6, Lmq/b;->E:Ljava/lang/Integer;

    iget-object v6, v1, Lmq/c;->b:Lmq/b;

    iget-object v14, v0, Lmq/b;->F:Ljava/lang/Integer;

    const/4 v7, 0x6

    if-nez v14, :cond_13

    invoke-virtual {v3, v7, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v14

    goto :goto_7

    :cond_13
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    :goto_7
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    iput-object v14, v6, Lmq/b;->F:Ljava/lang/Integer;

    iget-object v6, v1, Lmq/c;->b:Lmq/b;

    iget-object v14, v0, Lmq/b;->G:Ljava/lang/Integer;

    if-nez v14, :cond_14

    const/16 v14, 0xf

    invoke-virtual {v3, v14, v15}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v14

    goto :goto_8

    :cond_14
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    :goto_8
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    iput-object v14, v6, Lmq/b;->G:Ljava/lang/Integer;

    iget-object v6, v1, Lmq/c;->b:Lmq/b;

    iget-object v14, v0, Lmq/b;->H:Ljava/lang/Integer;

    if-nez v14, :cond_15

    const/16 v14, 0x10

    invoke-virtual {v3, v14, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v14

    goto :goto_9

    :cond_15
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    :goto_9
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    iput-object v14, v6, Lmq/b;->H:Ljava/lang/Integer;

    iget-object v6, v1, Lmq/c;->b:Lmq/b;

    iget-object v14, v0, Lmq/b;->x:Ljava/lang/Integer;

    if-nez v14, :cond_16

    invoke-static {v3, v2, v9}, Lkotlin/jvm/internal/j;->C(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v14

    invoke-virtual {v14}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v14

    goto :goto_a

    :cond_16
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    :goto_a
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    iput-object v14, v6, Lmq/b;->x:Ljava/lang/Integer;

    iget-object v6, v1, Lmq/c;->b:Lmq/b;

    iget-object v14, v0, Lmq/b;->z:Ljava/lang/Integer;

    const/16 v15, 0x8

    if-nez v14, :cond_17

    const v14, 0x7f150358

    invoke-virtual {v3, v15, v14}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v14

    goto :goto_b

    :cond_17
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    :goto_b
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    iput-object v14, v6, Lmq/b;->z:Ljava/lang/Integer;

    iget-object v6, v0, Lmq/b;->y:Ljava/lang/Integer;

    if-eqz v6, :cond_18

    iget-object v2, v1, Lmq/c;->b:Lmq/b;

    iput-object v6, v2, Lmq/b;->y:Ljava/lang/Integer;

    goto/16 :goto_d

    :cond_18
    const/16 v6, 0x9

    invoke-virtual {v3, v6}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v16

    if-eqz v16, :cond_19

    iget-object v5, v1, Lmq/c;->b:Lmq/b;

    invoke-static {v3, v2, v6}, Lkotlin/jvm/internal/j;->C(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iput-object v2, v5, Lmq/b;->y:Ljava/lang/Integer;

    goto :goto_d

    :cond_19
    iget-object v14, v1, Lmq/c;->b:Lmq/b;

    iget-object v14, v14, Lmq/b;->z:Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    sget-object v6, Ljq/a;->N:[I

    invoke-virtual {v2, v14, v6}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v6

    const/4 v15, 0x0

    invoke-virtual {v6, v10, v15}, Landroid/content/res/TypedArray;->getDimension(IF)F

    invoke-static {v6, v2, v12}, Lkotlin/jvm/internal/j;->C(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v12

    invoke-static {v6, v2, v5}, Lkotlin/jvm/internal/j;->C(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    invoke-static {v6, v2, v11}, Lkotlin/jvm/internal/j;->C(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    invoke-virtual {v6, v8, v10}, Landroid/content/res/TypedArray;->getInt(II)I

    invoke-virtual {v6, v9, v9}, Landroid/content/res/TypedArray;->getInt(II)I

    invoke-virtual {v6, v13}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v5

    if-eqz v5, :cond_1a

    goto :goto_c

    :cond_1a
    const/16 v13, 0xa

    :goto_c
    invoke-virtual {v6, v13, v10}, Landroid/content/res/TypedArray;->getResourceId(II)I

    invoke-virtual {v6, v13}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    const/16 v5, 0xe

    invoke-virtual {v6, v5, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    invoke-static {v6, v2, v7}, Lkotlin/jvm/internal/j;->C(Landroid/content/res/TypedArray;Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    const/4 v5, 0x7

    invoke-virtual {v6, v5, v15}, Landroid/content/res/TypedArray;->getFloat(IF)F

    const/16 v5, 0x8

    invoke-virtual {v6, v5, v15}, Landroid/content/res/TypedArray;->getFloat(IF)F

    const/16 v5, 0x9

    invoke-virtual {v6, v5, v15}, Landroid/content/res/TypedArray;->getFloat(IF)F

    invoke-virtual {v6}, Landroid/content/res/TypedArray;->recycle()V

    sget-object v5, Ljq/a;->B:[I

    invoke-virtual {v2, v14, v5}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v2

    invoke-virtual {v2, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z

    invoke-virtual {v2, v10, v15}, Landroid/content/res/TypedArray;->getFloat(IF)F

    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    iget-object v2, v1, Lmq/c;->b:Lmq/b;

    invoke-virtual {v12}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, v2, Lmq/b;->y:Ljava/lang/Integer;

    :goto_d
    iget-object v2, v1, Lmq/c;->b:Lmq/b;

    iget-object v5, v0, Lmq/b;->S:Ljava/lang/Integer;

    if-nez v5, :cond_1b

    const v5, 0x800035

    invoke-virtual {v3, v8, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v5

    goto :goto_e

    :cond_1b
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    :goto_e
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, v2, Lmq/b;->S:Ljava/lang/Integer;

    iget-object v2, v1, Lmq/c;->b:Lmq/b;

    iget-object v5, v0, Lmq/b;->U:Ljava/lang/Integer;

    if-nez v5, :cond_1c

    const v5, 0x7f0702f5

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    const/16 v6, 0xb

    invoke-virtual {v3, v6, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v5

    goto :goto_f

    :cond_1c
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    :goto_f
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, v2, Lmq/b;->U:Ljava/lang/Integer;

    iget-object v2, v1, Lmq/c;->b:Lmq/b;

    iget-object v5, v0, Lmq/b;->V:Ljava/lang/Integer;

    if-nez v5, :cond_1d

    const v5, 0x7f07011a

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    const/16 v5, 0xa

    invoke-virtual {v3, v5, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v4

    goto :goto_10

    :cond_1d
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v4

    :goto_10
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v2, Lmq/b;->V:Ljava/lang/Integer;

    iget-object v2, v1, Lmq/c;->b:Lmq/b;

    iget-object v4, v0, Lmq/b;->W:Ljava/lang/Integer;

    if-nez v4, :cond_1e

    const/16 v4, 0x12

    invoke-virtual {v3, v4, v10}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    goto :goto_11

    :cond_1e
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    :goto_11
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v2, Lmq/b;->W:Ljava/lang/Integer;

    iget-object v2, v1, Lmq/c;->b:Lmq/b;

    iget-object v4, v0, Lmq/b;->X:Ljava/lang/Integer;

    if-nez v4, :cond_1f

    const/16 v4, 0x19

    invoke-virtual {v3, v4, v10}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    goto :goto_12

    :cond_1f
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    :goto_12
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v2, Lmq/b;->X:Ljava/lang/Integer;

    iget-object v2, v1, Lmq/c;->b:Lmq/b;

    iget-object v4, v0, Lmq/b;->Y:Ljava/lang/Integer;

    if-nez v4, :cond_20

    iget-object v4, v2, Lmq/b;->W:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v5, 0x13

    invoke-virtual {v3, v5, v4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    goto :goto_13

    :cond_20
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    :goto_13
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v2, Lmq/b;->Y:Ljava/lang/Integer;

    iget-object v2, v1, Lmq/c;->b:Lmq/b;

    iget-object v4, v0, Lmq/b;->Z:Ljava/lang/Integer;

    if-nez v4, :cond_21

    iget-object v4, v2, Lmq/b;->X:Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v5, 0x1a

    invoke-virtual {v3, v5, v4}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    goto :goto_14

    :cond_21
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    :goto_14
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v2, Lmq/b;->Z:Ljava/lang/Integer;

    iget-object v2, v1, Lmq/c;->b:Lmq/b;

    iget-object v4, v0, Lmq/b;->c0:Ljava/lang/Integer;

    if-nez v4, :cond_22

    const/16 v4, 0x14

    invoke-virtual {v3, v4, v10}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    goto :goto_15

    :cond_22
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    :goto_15
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v2, Lmq/b;->c0:Ljava/lang/Integer;

    iget-object v2, v1, Lmq/c;->b:Lmq/b;

    iget-object v4, v0, Lmq/b;->a0:Ljava/lang/Integer;

    if-nez v4, :cond_23

    move v4, v10

    goto :goto_16

    :cond_23
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    :goto_16
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v2, Lmq/b;->a0:Ljava/lang/Integer;

    iget-object v2, v1, Lmq/c;->b:Lmq/b;

    iget-object v4, v0, Lmq/b;->b0:Ljava/lang/Integer;

    if-nez v4, :cond_24

    move v4, v10

    goto :goto_17

    :cond_24
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    :goto_17
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v2, Lmq/b;->b0:Ljava/lang/Integer;

    iget-object v2, v1, Lmq/c;->b:Lmq/b;

    iget-object v4, v0, Lmq/b;->d0:Ljava/lang/Boolean;

    if-nez v4, :cond_25

    invoke-virtual {v3, v10, v10}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    goto :goto_18

    :cond_25
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    :goto_18
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    iput-object v4, v2, Lmq/b;->d0:Ljava/lang/Boolean;

    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    iget-object v2, v0, Lmq/b;->N:Ljava/util/Locale;

    if-nez v2, :cond_26

    iget-object v2, v1, Lmq/c;->b:Lmq/b;

    sget-object v3, Ljava/util/Locale$Category;->FORMAT:Ljava/util/Locale$Category;

    invoke-static {v3}, Ljava/util/Locale;->getDefault(Ljava/util/Locale$Category;)Ljava/util/Locale;

    move-result-object v3

    iput-object v3, v2, Lmq/b;->N:Ljava/util/Locale;

    goto :goto_19

    :cond_26
    iget-object v3, v1, Lmq/c;->b:Lmq/b;

    iput-object v2, v3, Lmq/b;->N:Ljava/util/Locale;

    :goto_19
    iput-object v0, v1, Lmq/c;->a:Lmq/b;

    return-void
.end method
