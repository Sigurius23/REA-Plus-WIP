.class public abstract Ld2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/widget/RemoteViews;ILandroid/widget/RemoteViews;I)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroid/widget/RemoteViews;->addStableView(ILandroid/widget/RemoteViews;I)V

    return-void
.end method

.method public static b(Landroid/content/Context;)Landroid/widget/EdgeEffect;
    .locals 2

    :try_start_0
    new-instance v0, Landroid/widget/EdgeEffect;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    new-instance v0, Landroid/widget/EdgeEffect;

    invoke-direct {v0, p0}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static c(FFI)Landroid/graphics/RenderEffect;
    .locals 2

    const/4 v0, 0x0

    cmpg-float v1, p0, v0

    if-nez v1, :cond_0

    cmpg-float v1, p1, v0

    if-nez v1, :cond_0

    invoke-static {v0, v0}, Landroid/graphics/RenderEffect;->createOffsetEffect(FF)Landroid/graphics/RenderEffect;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p2}, Li2/w0;->G(I)Landroid/graphics/Shader$TileMode;

    move-result-object p2

    invoke-static {p0, p1, p2}, Landroid/graphics/RenderEffect;->createBlurEffect(FFLandroid/graphics/Shader$TileMode;)Landroid/graphics/RenderEffect;

    move-result-object p0

    return-object p0
.end method

.method public static d(Ljava/util/Map;)Landroid/widget/RemoteViews;
    .locals 1

    new-instance v0, Landroid/widget/RemoteViews;

    invoke-direct {v0, p0}, Landroid/widget/RemoteViews;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public static e(Ld2/d;Landroid/util/LongSparseArray;)V
    .locals 6

    invoke-virtual {p1}, Landroid/util/LongSparseArray;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p1, v1}, Landroid/util/LongSparseArray;->keyAt(I)J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Landroid/util/LongSparseArray;->get(J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/translation/ViewTranslationResponse;

    if-eqz v4, :cond_1

    const-string v5, "android:text"

    invoke-virtual {v4, v5}, Landroid/view/translation/ViewTranslationResponse;->getValue(Ljava/lang/String;)Landroid/view/translation/TranslationResponseValue;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Landroid/view/translation/TranslationResponseValue;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {p0}, Ld2/d;->d()La0/s;

    move-result-object v5

    long-to-int v2, v2

    invoke-virtual {v5, v2}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li3/q;

    if-eqz v2, :cond_1

    iget-object v2, v2, Li3/q;->a:Li3/p;

    if-eqz v2, :cond_1

    iget-object v2, v2, Li3/p;->d:Li3/l;

    sget-object v3, Li3/k;->k:Li3/y;

    iget-object v2, v2, Li3/l;->w:La0/v0;

    invoke-virtual {v2, v3}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v2, 0x0

    :cond_0
    check-cast v2, Li3/a;

    if-eqz v2, :cond_1

    iget-object v2, v2, Li3/a;->b:Ll83/e;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    if-eqz v2, :cond_1

    new-instance v3, Ll3/g;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ll3/g;-><init>(Ljava/lang/String;)V

    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static f(Landroid/graphics/Canvas;[II[FIILandroid/graphics/fonts/Font;Landroid/graphics/Paint;)V
    .locals 0

    invoke-virtual/range {p0 .. p7}, Landroid/graphics/Canvas;->drawGlyphs([II[FIILandroid/graphics/fonts/Font;Landroid/graphics/Paint;)V

    return-void
.end method

.method public static g(Landroid/graphics/Canvas;Landroid/graphics/NinePatch;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroid/graphics/Canvas;->drawPatch(Landroid/graphics/NinePatch;Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    return-void
.end method

.method public static h(Landroid/graphics/Canvas;Landroid/graphics/NinePatch;Landroid/graphics/RectF;Landroid/graphics/Paint;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroid/graphics/Canvas;->drawPatch(Landroid/graphics/NinePatch;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    return-void
.end method

.method public static i(Landroid/widget/EdgeEffect;)F
    .locals 0

    :try_start_0
    invoke-virtual {p0}, Landroid/widget/EdgeEffect;->getDistance()F

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    const/4 p0, 0x0

    return p0
.end method

.method public static j()Landroid/graphics/Shader$TileMode;
    .locals 1

    sget-object v0, Landroid/graphics/Shader$TileMode;->DECAL:Landroid/graphics/Shader$TileMode;

    return-object v0
.end method

.method public static k(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;Z)Ld9/g;
    .locals 3

    invoke-static {p0, p1}, Landroid/media/AudioManager;->getPlaybackOffloadSupport(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)I

    move-result p0

    if-nez p0, :cond_0

    sget-object p0, Ld9/g;->d:Ld9/g;

    return-object p0

    :cond_0
    new-instance p1, Ld9/f;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sget v0, Lx8/t;->a:I

    const/16 v1, 0x20

    const/4 v2, 0x1

    if-le v0, v1, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_1

    move p0, v2

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    iput-boolean v2, p1, Ld9/f;->a:Z

    iput-boolean p0, p1, Ld9/f;->b:Z

    iput-boolean p2, p1, Ld9/f;->c:Z

    invoke-virtual {p1}, Ld9/f;->a()Ld9/g;

    move-result-object p0

    return-object p0
.end method

.method public static l(Landroid/content/res/Configuration;Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Lb23/h;->a(Landroid/content/res/Configuration;)I

    move-result v0

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Typeface;->getWeight()I

    move-result v0

    invoke-static {p0}, Lb23/h;->a(Landroid/content/res/Configuration;)I

    move-result p0

    add-int/2addr v0, p0

    const/4 p0, 0x1

    const/16 v1, 0x3e8

    invoke-static {v0, p0, v1}, Lrj/j;->r(III)I

    move-result p0

    invoke-virtual {p1}, Landroid/graphics/Typeface;->isItalic()Z

    move-result v0

    invoke-static {p1, p0, v0}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static m(Ld2/d;[JLjava/util/function/Consumer;)V
    .locals 7

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    aget-wide v2, p1, v1

    invoke-virtual {p0}, Ld2/d;->d()La0/s;

    move-result-object v4

    long-to-int v2, v2

    invoke-virtual {v4, v2}, La0/s;->b(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li3/q;

    if-eqz v2, :cond_2

    iget-object v2, v2, Li3/q;->a:Li3/p;

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    new-instance v3, Landroid/view/translation/ViewTranslationRequest$Builder;

    iget-object v3, p0, Ld2/d;->w:Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v3}, Landroid/view/View;->getAutofillId()Landroid/view/autofill/AutofillId;

    move-result-object v3

    iget v4, v2, Li3/p;->g:I

    int-to-long v4, v4

    new-instance v6, Landroid/view/translation/ViewTranslationRequest$Builder;

    invoke-direct {v6, v3, v4, v5}, Landroid/view/translation/ViewTranslationRequest$Builder;-><init>(Landroid/view/autofill/AutofillId;J)V

    iget-object v2, v2, Li3/p;->d:Li3/l;

    sget-object v3, Li3/u;->A:Li3/y;

    iget-object v2, v2, Li3/l;->w:La0/v0;

    invoke-virtual {v2, v3}, La0/v0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    if-nez v2, :cond_1

    move-object v2, v3

    :cond_1
    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_2

    const-string v4, "\n"

    const/16 v5, 0x3e

    invoke-static {v5, v4, v2, v3}, La4/b;->b(ILjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    new-instance v3, Ll3/g;

    invoke-direct {v3, v2}, Ll3/g;-><init>(Ljava/lang/String;)V

    const-string v2, "android:text"

    invoke-static {v3}, Landroid/view/translation/TranslationRequestValue;->forText(Ljava/lang/CharSequence;)Landroid/view/translation/TranslationRequestValue;

    move-result-object v3

    invoke-virtual {v6, v2, v3}, Landroid/view/translation/ViewTranslationRequest$Builder;->setValue(Ljava/lang/String;Landroid/view/translation/TranslationRequestValue;)Landroid/view/translation/ViewTranslationRequest$Builder;

    invoke-virtual {v6}, Landroid/view/translation/ViewTranslationRequest$Builder;->build()Landroid/view/translation/ViewTranslationRequest;

    move-result-object v2

    invoke-interface {p2, v2}, Ljava/util/function/Consumer;->accept(Ljava/lang/Object;)V

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static n(Landroid/widget/EdgeEffect;FF)F
    .locals 0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Landroid/widget/EdgeEffect;->onPullDistance(FF)F

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p0

    :catchall_0
    invoke-virtual {p0, p1, p2}, Landroid/widget/EdgeEffect;->onPull(FF)V

    const/4 p0, 0x0

    return p0
.end method

.method public static o(Ld2/d;Landroid/util/LongSparseArray;)V
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1f

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p0, p1}, Ld2/b;->e(Ld2/d;Landroid/util/LongSparseArray;)V

    return-void

    :cond_1
    iget-object v0, p0, Ld2/d;->w:Landroidx/compose/ui/platform/AndroidComposeView;

    new-instance v1, La8/c;

    const/16 v2, 0x11

    invoke-direct {v1, v2, p0, p1}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public static p(IILjava/lang/String;)Landroid/widget/RemoteViews;
    .locals 1

    new-instance v0, Landroid/widget/RemoteViews;

    invoke-direct {v0, p2, p0, p1}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;II)V

    return-object v0
.end method

.method public static q(Landroid/media/AudioTrack;Lc9/n;)V
    .locals 1

    invoke-virtual {p1}, Lc9/n;->a()Landroid/media/metrics/LogSessionId;

    move-result-object p1

    invoke-static {}, Lc9/g;->d()Landroid/media/metrics/LogSessionId;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/media/metrics/LogSessionId;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Landroid/media/AudioTrack;->setLogSessionId(Landroid/media/metrics/LogSessionId;)V

    :cond_0
    return-void
.end method

.method public static r(La30/w0;Lc9/n;)V
    .locals 1

    invoke-virtual {p1}, Lc9/n;->a()Landroid/media/metrics/LogSessionId;

    move-result-object p1

    invoke-static {}, Lc9/g;->d()Landroid/media/metrics/LogSessionId;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/media/metrics/LogSessionId;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p0, p0, La30/w0;->y:Ljava/lang/Object;

    check-cast p0, Landroid/media/MediaFormat;

    const-string v0, "log-session-id"

    invoke-virtual {p1}, Landroid/media/metrics/LogSessionId;->getStringId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static s(Landroid/graphics/RenderNode;Lal/a;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lal/a;->t0()Landroid/graphics/RenderEffect;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Landroid/graphics/RenderNode;->setRenderEffect(Landroid/graphics/RenderEffect;)Z

    return-void
.end method

.method public static t(Landroid/view/View;Lal/a;)V
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lal/a;->t0()Landroid/graphics/RenderEffect;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setRenderEffect(Landroid/graphics/RenderEffect;)V

    return-void
.end method

.method public static final u(Lp3/q;Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    iget-object p0, p0, Lp3/q;->a:Ljava/util/ArrayList;

    invoke-static {p1}, Lva3/g;->a(Landroid/content/Context;)Ly3/e;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v2, 0x0

    const/16 v3, 0x1f

    if-lt v1, v3, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    invoke-static {v1}, Lb23/h;->a(Landroid/content/res/Configuration;)I

    move-result v1

    const v4, 0x7fffffff

    if-ne v1, v4, :cond_1

    :cond_0
    move p1, v2

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    invoke-static {p1}, Lb23/h;->a(Landroid/content/res/Configuration;)I

    move-result p1

    :goto_0
    if-nez p1, :cond_2

    new-instance p1, Lov2/f;

    invoke-direct {p1, v0}, Lov2/f;-><init>(Ly3/e;)V

    const/4 v0, 0x0

    invoke-static {v3, v0, p0, p1}, La4/b;->b(ILjava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_4

    const/high16 v0, 0x43c80000    # 400.0f

    int-to-float p1, p1

    add-float/2addr p1, v0

    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v1, 0x447a0000    # 1000.0f

    invoke-static {p1, v0, v1}, Le93/b;->m(FFF)F

    move-result p1

    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_3

    const-string p0, ","

    goto :goto_1

    :cond_3
    const-string p0, ""

    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\'wght\' "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Ljava/lang/ClassCastException;

    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    throw p0
.end method
