.class public final Lc4/k;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    iput p6, p0, Lc4/k;->w:I

    iput-object p1, p0, Lc4/k;->x:Ljava/lang/Object;

    iput-object p2, p0, Lc4/k;->y:Ljava/lang/Object;

    iput-object p3, p0, Lc4/k;->z:Ljava/lang/Object;

    iput-object p4, p0, Lc4/k;->E:Ljava/lang/Object;

    iput-object p5, p0, Lc4/k;->F:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p0

    iget v0, v1, Lc4/k;->w:I

    packed-switch v0, :pswitch_data_0

    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/String;

    const-string v2, "newText"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lc4/k;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    new-instance v3, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;

    iget-object v4, v1, Lc4/k;->y:Ljava/lang/Object;

    check-cast v4, Lcom/amplitude/android/engagement/types/SurveyListBlock;

    invoke-virtual {v4}, Lcom/amplitude/android/engagement/types/SurveyListBlock;->getUuid()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v1, Lc4/k;->z:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Integer;

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_0

    :cond_0
    iget-object v5, v1, Lc4/k;->E:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    :goto_0
    iget-object v6, v1, Lc4/k;->F:Ljava/lang/Object;

    check-cast v6, Lrj/p;

    if-eqz v6, :cond_1

    iget-object v6, v6, Lrj/p;->a:Ljava/lang/String;

    if-nez v6, :cond_2

    :cond_1
    const-string v6, ""

    :cond_2
    invoke-direct {v3, v4, v5, v6, v0}, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_0
    move-object/from16 v0, p1

    check-cast v0, Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    const-string v2, "null cannot be cast to non-null type com.amplitude.quickjs.wrapper.JSFunction"

    const-string v3, ", "

    iget-object v4, v1, Lc4/k;->z:Ljava/lang/Object;

    check-cast v4, Landroid/graphics/Rect;

    const-string v5, "globalThis.pinPositioning.position("

    const-string v6, "jsContext"

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v1, Lc4/k;->x:Ljava/lang/Object;

    check-cast v6, Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v6

    iget v7, v6, Landroid/content/res/Configuration;->screenWidthDp:I

    iget v6, v6, Landroid/content/res/Configuration;->screenHeightDp:I

    iget-object v8, v1, Lc4/k;->E:Ljava/lang/Object;

    check-cast v8, Lp1/c1;

    invoke-static {v8}, Lvp/c;->d(Lp1/c1;)J

    move-result-wide v9

    const/16 v11, 0x20

    shr-long/2addr v9, v11

    long-to-int v9, v9

    if-lez v9, :cond_3

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ly3/l;

    iget-wide v9, v9, Ly3/l;->a:J

    shr-long/2addr v9, v11

    long-to-int v9, v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    goto :goto_1

    :cond_3
    iget-object v9, v1, Lc4/k;->y:Ljava/lang/Object;

    check-cast v9, Luj/m;

    iget v9, v9, Luj/m;->S:F

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    :goto_1
    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ly3/l;

    iget-wide v10, v10, Ly3/l;->a:J

    const-wide v12, 0xffffffffL

    and-long/2addr v10, v12

    long-to-int v10, v10

    if-lez v10, :cond_4

    invoke-interface {v8}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly3/l;

    iget-wide v10, v8, Ly3/l;->a:J

    and-long/2addr v10, v12

    long-to-int v8, v10

    goto :goto_2

    :cond_4
    const/16 v8, 0x90

    :goto_2
    new-instance v10, Lorg/json/JSONObject;

    invoke-direct {v10}, Lorg/json/JSONObject;-><init>()V

    iget v11, v4, Landroid/graphics/Rect;->left:I

    const-string v12, "x"

    invoke-virtual {v10, v12, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v10

    iget v11, v4, Landroid/graphics/Rect;->top:I

    const-string v13, "y"

    invoke-virtual {v10, v13, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v10

    invoke-virtual {v4}, Landroid/graphics/Rect;->width()I

    move-result v11

    const-string v14, "width"

    invoke-virtual {v10, v14, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v10

    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    move-result v4

    const-string v11, "height"

    invoke-virtual {v10, v11, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v4}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v10, "JSONObject()\n           \u2026              .toString()"

    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v15, Lorg/json/JSONObject;

    invoke-direct {v15}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v15, v14, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    move-result-object v9

    invoke-virtual {v9, v11, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v8, v12, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v8

    invoke-virtual {v8, v13, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v8

    invoke-virtual {v8}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v15, Lorg/json/JSONObject;

    invoke-direct {v15}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v15, v12, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v12

    invoke-virtual {v12, v13, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v9

    invoke-virtual {v9, v14, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v7

    invoke-virtual {v7, v11, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    move-result-object v6

    invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x0

    :try_start_0
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x29

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->evaluate(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type com.amplitude.quickjs.wrapper.JSObject"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lcom/amplitude/quickjs/wrapper/JSObject;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    :try_start_1
    const-string v4, "then"

    invoke-virtual {v0, v3, v4}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->getProperty(Lcom/amplitude/quickjs/wrapper/JSObject;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lcom/amplitude/quickjs/wrapper/JSFunction;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    iget-object v5, v1, Lc4/k;->F:Ljava/lang/Object;

    check-cast v5, Lp1/c1;

    new-instance v6, Lpj/t;

    invoke-direct {v6, v5}, Lpj/t;-><init>(Lp1/c1;)V

    filled-new-array {v6}, [Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v4, v5}, Lcom/amplitude/quickjs/wrapper/JSFunction;->call([Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "catch"

    invoke-virtual {v0, v3, v5}, Lcom/amplitude/quickjs/wrapper/QuickJSContext;->getProperty(Lcom/amplitude/quickjs/wrapper/JSObject;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Lcom/amplitude/quickjs/wrapper/JSFunction;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    new-instance v0, Lpj/u;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, Lcom/amplitude/quickjs/wrapper/JSFunction;->call([Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-interface {v2}, Lcom/amplitude/quickjs/wrapper/JSObject;->release()V

    invoke-interface {v4}, Lcom/amplitude/quickjs/wrapper/JSObject;->release()V

    invoke-interface {v3}, Lcom/amplitude/quickjs/wrapper/JSObject;->release()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :catchall_0
    move-exception v0

    move-object v7, v2

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object v4, v7

    goto :goto_3

    :catchall_3
    move-exception v0

    move-object v3, v7

    move-object v4, v3

    :goto_3
    if-eqz v7, :cond_5

    invoke-interface {v7}, Lcom/amplitude/quickjs/wrapper/JSObject;->release()V

    :cond_5
    if-eqz v4, :cond_6

    invoke-interface {v4}, Lcom/amplitude/quickjs/wrapper/JSObject;->release()V

    :cond_6
    if-eqz v3, :cond_7

    invoke-interface {v3}, Lcom/amplitude/quickjs/wrapper/JSObject;->release()V

    :cond_7
    throw v0

    :pswitch_1
    move-object/from16 v0, p1

    check-cast v0, Lio/sentry/android/replay/viewhierarchy/g;

    iget-object v2, v1, Lc4/k;->x:Ljava/lang/Object;

    check-cast v2, Lio/sentry/android/replay/util/c;

    iget-object v3, v2, Lio/sentry/android/replay/util/c;->y:Ljava/lang/Object;

    iget-object v4, v2, Lio/sentry/android/replay/util/c;->w:Ljava/lang/Object;

    const-string v5, "node"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v0, Lio/sentry/android/replay/viewhierarchy/g;->f:Landroid/graphics/Rect;

    iget-boolean v6, v0, Lio/sentry/android/replay/viewhierarchy/g;->d:Z

    if-eqz v6, :cond_1d

    iget v6, v0, Lio/sentry/android/replay/viewhierarchy/g;->a:I

    if-lez v6, :cond_1d

    iget v6, v0, Lio/sentry/android/replay/viewhierarchy/g;->b:I

    if-lez v6, :cond_1d

    if-nez v5, :cond_8

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto/16 :goto_16

    :cond_8
    instance-of v6, v0, Lio/sentry/android/replay/viewhierarchy/d;

    const/4 v7, 0x0

    if-eqz v6, :cond_c

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget-object v6, v1, Lc4/k;->y:Ljava/lang/Object;

    check-cast v6, Landroid/graphics/Bitmap;

    iget-object v9, v1, Lc4/k;->z:Ljava/lang/Object;

    check-cast v9, Landroid/graphics/Matrix;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v10

    if-nez v10, :cond_b

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/graphics/Bitmap;

    invoke-virtual {v10}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v10

    if-eqz v10, :cond_9

    goto :goto_4

    :cond_9
    new-instance v8, Landroid/graphics/Rect;

    invoke-direct {v8, v5}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    new-instance v5, Landroid/graphics/RectF;

    invoke-direct {v5, v8}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    if-eqz v9, :cond_a

    invoke-virtual {v9, v5}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    :cond_a
    invoke-virtual {v5, v8}, Landroid/graphics/RectF;->round(Landroid/graphics/Rect;)V

    iget-object v2, v2, Lio/sentry/android/replay/util/c;->x:Ljava/lang/Object;

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Canvas;

    new-instance v5, Landroid/graphics/Rect;

    const/4 v9, 0x1

    invoke-direct {v5, v7, v7, v9, v9}, Landroid/graphics/Rect;-><init>(IIII)V

    const/4 v9, 0x0

    invoke-virtual {v2, v6, v8, v5, v9}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    invoke-interface {v4}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Bitmap;

    invoke-virtual {v2, v7, v7}, Landroid/graphics/Bitmap;->getPixel(II)I

    move-result v8

    goto :goto_5

    :cond_b
    :goto_4
    const/high16 v8, -0x1000000

    :goto_5
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_14

    :cond_c
    instance-of v2, v0, Lio/sentry/android/replay/viewhierarchy/f;

    if-eqz v2, :cond_1b

    check-cast v0, Lio/sentry/android/replay/viewhierarchy/f;

    iget-object v2, v0, Lio/sentry/android/replay/viewhierarchy/f;->h:Lhm/d;

    if-eqz v2, :cond_12

    iget v4, v2, Lhm/d;->w:I

    packed-switch v4, :pswitch_data_1

    :goto_6
    const/4 v4, 0x0

    const/high16 v16, -0x1000000

    goto/16 :goto_9

    :pswitch_2
    iget-object v4, v2, Lhm/d;->x:Ljava/lang/Object;

    check-cast v4, Landroid/text/Layout;

    invoke-virtual {v4}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v6

    instance-of v6, v6, Landroid/text/Spanned;

    if-nez v6, :cond_d

    goto :goto_6

    :cond_d
    invoke-virtual {v4}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v6

    const-string v10, "null cannot be cast to non-null type android.text.Spanned"

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Landroid/text/Spanned;

    invoke-virtual {v4}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v11

    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    move-result v11

    const-class v12, Landroid/text/style/ForegroundColorSpan;

    const/4 v13, 0x0

    invoke-interface {v6, v13, v11, v12}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [Landroid/text/style/ForegroundColorSpan;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    array-length v11, v6

    const/high16 v12, -0x80000000

    const/4 v14, 0x0

    :goto_7
    if-ge v13, v11, :cond_10

    aget-object v15, v6, v13

    invoke-virtual {v4}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v7

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Landroid/text/Spanned;

    invoke-interface {v7, v15}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v7

    const/high16 v16, -0x1000000

    invoke-virtual {v4}, Landroid/text/Layout;->getText()Ljava/lang/CharSequence;

    move-result-object v8

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Landroid/text/Spanned;

    invoke-interface {v8, v15}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v8

    const/4 v9, -0x1

    if-eq v7, v9, :cond_f

    if-ne v8, v9, :cond_e

    goto :goto_8

    :cond_e
    sub-int/2addr v8, v7

    if-le v8, v12, :cond_f

    invoke-virtual {v15}, Landroid/text/style/ForegroundColorSpan;->getForegroundColor()I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    move v12, v8

    :cond_f
    :goto_8
    add-int/lit8 v13, v13, 0x1

    const/4 v7, 0x0

    goto :goto_7

    :cond_10
    const/high16 v16, -0x1000000

    if-eqz v14, :cond_11

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/high16 v6, -0x1000000

    or-int/2addr v4, v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_9

    :cond_11
    const/4 v4, 0x0

    :goto_9
    if-eqz v4, :cond_13

    :goto_a
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v8

    goto :goto_b

    :cond_12
    const/high16 v16, -0x1000000

    :cond_13
    iget-object v4, v0, Lio/sentry/android/replay/viewhierarchy/f;->i:Ljava/lang/Integer;

    if-eqz v4, :cond_14

    goto :goto_a

    :cond_14
    move/from16 v8, v16

    :goto_b
    iget v4, v0, Lio/sentry/android/replay/viewhierarchy/f;->j:I

    iget v0, v0, Lio/sentry/android/replay/viewhierarchy/f;->k:I

    if-nez v2, :cond_15

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto/16 :goto_13

    :cond_15
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    iget v7, v2, Lhm/d;->w:I

    packed-switch v7, :pswitch_data_2

    iget-object v7, v2, Lhm/d;->x:Ljava/lang/Object;

    check-cast v7, Ll3/r0;

    iget-object v7, v7, Ll3/r0;->b:Ll3/w;

    iget v7, v7, Ll3/w;->f:I

    goto :goto_c

    :pswitch_3
    iget-object v7, v2, Lhm/d;->x:Ljava/lang/Object;

    check-cast v7, Landroid/text/Layout;

    invoke-virtual {v7}, Landroid/text/Layout;->getLineCount()I

    move-result v7

    :goto_c
    const/4 v9, 0x0

    :goto_d
    if-ge v9, v7, :cond_1a

    iget v10, v2, Lhm/d;->w:I

    packed-switch v10, :pswitch_data_3

    iget-object v10, v2, Lhm/d;->x:Ljava/lang/Object;

    check-cast v10, Ll3/r0;

    iget-object v11, v10, Ll3/r0;->b:Ll3/w;

    iget v11, v11, Ll3/w;->d:F

    iget-wide v12, v10, Ll3/r0;->c:J

    const/16 v14, 0x20

    shr-long/2addr v12, v14

    long-to-int v12, v12

    int-to-float v12, v12

    cmpl-float v11, v11, v12

    if-lez v11, :cond_16

    :goto_e
    const/4 v10, 0x0

    goto :goto_f

    :cond_16
    invoke-virtual {v10, v9}, Ll3/r0;->f(I)F

    move-result v10

    goto :goto_f

    :pswitch_4
    iget-object v10, v2, Lhm/d;->x:Ljava/lang/Object;

    check-cast v10, Landroid/text/Layout;

    invoke-virtual {v10}, Landroid/text/Layout;->getEllipsizedWidth()I

    move-result v11

    if-lez v11, :cond_17

    invoke-virtual {v10}, Landroid/text/Layout;->getEllipsizedWidth()I

    move-result v11

    invoke-virtual {v10}, Landroid/text/Layout;->getWidth()I

    move-result v12

    if-ge v11, v12, :cond_17

    goto :goto_e

    :cond_17
    invoke-virtual {v10, v9}, Landroid/text/Layout;->getLineLeft(I)F

    move-result v10

    :goto_f
    float-to-int v10, v10

    iget v11, v2, Lhm/d;->w:I

    packed-switch v11, :pswitch_data_4

    iget-object v11, v2, Lhm/d;->x:Ljava/lang/Object;

    check-cast v11, Ll3/r0;

    iget-object v12, v11, Ll3/r0;->b:Ll3/w;

    iget v13, v12, Ll3/w;->d:F

    iget-wide v14, v11, Ll3/r0;->c:J

    const/16 v16, 0x20

    shr-long v14, v14, v16

    long-to-int v14, v14

    int-to-float v14, v14

    cmpl-float v13, v13, v14

    if-lez v13, :cond_18

    invoke-virtual {v12, v9}, Ll3/w;->m(I)V

    iget-object v11, v12, Ll3/w;->h:Ljava/util/ArrayList;

    invoke-static {v9, v11}, Ll3/s;->d(ILjava/util/List;)I

    move-result v12

    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll3/y;

    iget-object v12, v11, Ll3/y;->a:Ll3/a;

    iget v11, v11, Ll3/y;->d:I

    sub-int v11, v9, v11

    iget-object v12, v12, Ll3/a;->d:Lm3/m;

    iget-object v12, v12, Lm3/m;->f:Landroid/text/Layout;

    invoke-virtual {v12, v11}, Landroid/text/Layout;->getLineWidth(I)F

    move-result v11

    goto :goto_10

    :cond_18
    invoke-virtual {v11, v9}, Ll3/r0;->g(I)F

    move-result v11

    goto :goto_10

    :pswitch_5
    iget-object v11, v2, Lhm/d;->x:Ljava/lang/Object;

    check-cast v11, Landroid/text/Layout;

    invoke-virtual {v11}, Landroid/text/Layout;->getEllipsizedWidth()I

    move-result v12

    if-lez v12, :cond_19

    invoke-virtual {v11}, Landroid/text/Layout;->getEllipsizedWidth()I

    move-result v12

    invoke-virtual {v11}, Landroid/text/Layout;->getWidth()I

    move-result v13

    if-ge v12, v13, :cond_19

    invoke-virtual {v11}, Landroid/text/Layout;->getEllipsizedWidth()I

    move-result v11

    int-to-float v11, v11

    goto :goto_10

    :cond_19
    invoke-virtual {v11, v9}, Landroid/text/Layout;->getLineRight(I)F

    move-result v11

    :goto_10
    float-to-int v11, v11

    iget v12, v2, Lhm/d;->w:I

    packed-switch v12, :pswitch_data_5

    iget-object v12, v2, Lhm/d;->x:Ljava/lang/Object;

    check-cast v12, Ll3/r0;

    iget-object v12, v12, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v12, v9}, Ll3/w;->f(I)F

    move-result v12

    invoke-static {v12}, Le93/b;->X(F)I

    move-result v12

    goto :goto_11

    :pswitch_6
    iget-object v12, v2, Lhm/d;->x:Ljava/lang/Object;

    check-cast v12, Landroid/text/Layout;

    invoke-virtual {v12, v9}, Landroid/text/Layout;->getLineTop(I)I

    move-result v12

    :goto_11
    iget v13, v2, Lhm/d;->w:I

    packed-switch v13, :pswitch_data_6

    iget-object v13, v2, Lhm/d;->x:Ljava/lang/Object;

    check-cast v13, Ll3/r0;

    iget-object v13, v13, Ll3/r0;->b:Ll3/w;

    invoke-virtual {v13, v9}, Ll3/w;->b(I)F

    move-result v13

    invoke-static {v13}, Le93/b;->X(F)I

    move-result v13

    goto :goto_12

    :pswitch_7
    iget-object v13, v2, Lhm/d;->x:Ljava/lang/Object;

    check-cast v13, Landroid/text/Layout;

    invoke-virtual {v13, v9}, Landroid/text/Layout;->getLineBottom(I)I

    move-result v13

    :goto_12
    new-instance v14, Landroid/graphics/Rect;

    invoke-direct {v14}, Landroid/graphics/Rect;-><init>()V

    iget v15, v5, Landroid/graphics/Rect;->left:I

    add-int/2addr v15, v4

    add-int/2addr v15, v10

    iput v15, v14, Landroid/graphics/Rect;->left:I

    iget v10, v5, Landroid/graphics/Rect;->left:I

    add-int/2addr v10, v4

    add-int/2addr v10, v11

    iput v10, v14, Landroid/graphics/Rect;->right:I

    iget v10, v5, Landroid/graphics/Rect;->top:I

    add-int/2addr v10, v0

    add-int/2addr v10, v12

    iput v10, v14, Landroid/graphics/Rect;->top:I

    sub-int/2addr v13, v12

    add-int/2addr v13, v10

    iput v13, v14, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v9, v9, 0x1

    goto/16 :goto_d

    :cond_1a
    move-object v0, v6

    :goto_13
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_14

    :cond_1b
    const/high16 v16, -0x1000000

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_14
    iget-object v0, v4, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v2, v4, Ll83/k;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/graphics/Paint;

    invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setColor(I)V

    move-object v2, v0

    check-cast v2, Ljava/lang/Iterable;

    iget-object v4, v1, Lc4/k;->F:Ljava/lang/Object;

    check-cast v4, Landroid/graphics/Canvas;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_15
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/Rect;

    new-instance v6, Landroid/graphics/RectF;

    invoke-direct {v6, v5}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/graphics/Paint;

    const/high16 v7, 0x41200000    # 10.0f

    invoke-virtual {v4, v6, v7, v7, v5}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    goto :goto_15

    :cond_1c
    iget-object v2, v1, Lc4/k;->E:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_1d
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :goto_16
    return-object v0

    :pswitch_8
    move-object/from16 v0, p1

    check-cast v0, Leb/q;

    iget-object v2, v1, Lc4/k;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/e0;

    const-string v3, "entry"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v1, Lc4/k;->x:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/internal/b0;

    const/4 v4, 0x1

    iput-boolean v4, v3, Lkotlin/jvm/internal/b0;->w:Z

    iget-object v3, v1, Lc4/k;->y:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_1e

    iget v6, v2, Lkotlin/jvm/internal/e0;->w:I

    add-int/2addr v5, v4

    invoke-virtual {v3, v6, v5}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v3

    iput v5, v2, Lkotlin/jvm/internal/e0;->w:I

    goto :goto_17

    :cond_1e
    sget-object v3, Lm83/y;->w:Lm83/y;

    :goto_17
    iget-object v2, v1, Lc4/k;->E:Ljava/lang/Object;

    check-cast v2, Leb/a0;

    iget-object v4, v0, Leb/q;->x:Leb/n0;

    iget-object v5, v1, Lc4/k;->F:Ljava/lang/Object;

    check-cast v5, Landroid/os/Bundle;

    invoke-virtual {v2, v4, v5, v0, v3}, Leb/a0;->a(Leb/n0;Landroid/os/Bundle;Leb/q;Ljava/util/List;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_9
    move-object/from16 v0, p1

    check-cast v0, Lp1/i0;

    iget-object v0, v1, Lc4/k;->x:Ljava/lang/Object;

    check-cast v0, Lc4/f0;

    iget-object v2, v0, Lc4/f0;->O:Landroid/view/WindowManager;

    iget-object v3, v0, Lc4/f0;->P:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v2, v0, v3}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v2, v1, Lc4/k;->y:Ljava/lang/Object;

    check-cast v2, Lc93/a;

    iget-object v3, v1, Lc4/k;->z:Ljava/lang/Object;

    check-cast v3, Lc4/j0;

    iget-object v4, v1, Lc4/k;->E:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v1, Lc4/k;->F:Ljava/lang/Object;

    check-cast v5, Ly3/m;

    invoke-virtual {v0, v2, v3, v4, v5}, Lc4/f0;->k(Lc93/a;Lc4/j0;Ljava/lang/String;Ly3/m;)V

    new-instance v2, Lb1/e;

    const/4 v3, 0x2

    invoke-direct {v2, v0, v3}, Lb1/e;-><init>(Ljava/lang/Object;I)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0xa
        :pswitch_2
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0xa
        :pswitch_3
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0xa
        :pswitch_4
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0xa
        :pswitch_5
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0xa
        :pswitch_6
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0xa
        :pswitch_7
    .end packed-switch
.end method
