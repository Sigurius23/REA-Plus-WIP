.class public abstract La4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static A(Landroid/media/AudioAttributes$Builder;)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/media/AudioAttributes$Builder;->setAllowedCapturePolicy(I)Landroid/media/AudioAttributes$Builder;

    return-void
.end method

.method public static B(Landroid/graphics/Outline;Landroid/graphics/Path;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, Lxq/b;->a(Landroid/graphics/Outline;Landroid/graphics/Path;)V

    return-void

    :cond_0
    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    :try_start_0
    invoke-static {p0, p1}, Lxq/a;->a(Landroid/graphics/Outline;Landroid/graphics/Path;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void

    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Path;->isConvex()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0, p1}, Lxq/a;->a(Landroid/graphics/Outline;Landroid/graphics/Path;)V

    :cond_2
    return-void
.end method

.method public static C(Landroidx/work/impl/foreground/SystemForegroundService;ILandroid/app/Notification;I)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;I)V

    return-void
.end method

.method public static D(Landroidx/work/impl/foreground/SystemForegroundService;ILandroid/app/Notification;I)V
    .locals 2

    const-string v0, "Unable to start foreground service"

    const/4 v1, 0x5

    :try_start_0
    invoke-virtual {p0, p1, p2, p3}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;I)V
    :try_end_0
    .catch Landroid/app/ForegroundServiceStartNotAllowedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object p1

    sget-object p2, Landroidx/work/impl/foreground/SystemForegroundService;->E:Ljava/lang/String;

    iget p1, p1, Lic/w;->a:I

    if-gt p1, v1, :cond_0

    invoke-static {p2, v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    :catch_1
    move-exception p0

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object p1

    sget-object p2, Landroidx/work/impl/foreground/SystemForegroundService;->E:Ljava/lang/String;

    iget p1, p1, Lic/w;->a:I

    if-gt p1, v1, :cond_0

    invoke-static {p2, v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    :goto_0
    return-void
.end method

.method public static final E(Lsh/q;Lfi/o;Z)Landroid/graphics/ImageDecoder$Source;
    .locals 3

    invoke-interface {p0}, Lsh/q;->getFileSystem()Lne3/p;

    move-result-object v0

    sget-object v1, Lne3/p;->w:Lne3/a0;

    if-ne v0, v1, :cond_0

    invoke-interface {p0}, Lsh/q;->V0()Lne3/e0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lne3/e0;->toFile()Ljava/io/File;

    move-result-object p0

    invoke-static {p0}, Landroid/graphics/ImageDecoder;->createSource(Ljava/io/File;)Landroid/graphics/ImageDecoder$Source;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p0}, Lsh/q;->c()Ls2/a;

    move-result-object p0

    instance-of v0, p0, Lsh/a;

    if-eqz v0, :cond_1

    iget-object p1, p1, Lfi/o;->a:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object p1

    check-cast p0, Lsh/a;

    iget-object p0, p0, Lsh/a;->a:Ljava/lang/String;

    invoke-static {p1, p0}, Landroid/graphics/ImageDecoder;->createSource(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/ImageDecoder$Source;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v0, p0, Lsh/g;

    if-eqz v0, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_2

    :try_start_0
    check-cast p0, Lsh/g;

    iget-object p0, p0, Lsh/g;->b:Landroid/content/res/AssetFileDescriptor;

    invoke-virtual {p0}, Landroid/content/res/AssetFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    move-result-object p1

    invoke-virtual {p0}, Landroid/content/res/AssetFileDescriptor;->getStartOffset()J

    move-result-wide v0

    sget p2, Landroid/system/OsConstants;->SEEK_SET:I

    invoke-static {p1, v0, v1, p2}, Landroid/system/Os;->lseek(Ljava/io/FileDescriptor;JI)J

    new-instance p1, Lio/sentry/i0;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Lio/sentry/i0;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Landroid/graphics/ImageDecoder;->createSource(Ljava/util/concurrent/Callable;)Landroid/graphics/ImageDecoder$Source;

    move-result-object p0
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :cond_2
    instance-of v0, p0, Lsh/r;

    if-eqz v0, :cond_3

    move-object v0, p0

    check-cast v0, Lsh/r;

    iget-object v1, v0, Lsh/r;->a:Ljava/lang/String;

    iget-object v2, p1, Lfi/o;->a:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object p0, p1, Lfi/o;->a:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    iget p1, v0, Lsh/r;->b:I

    invoke-static {p0, p1}, Landroid/graphics/ImageDecoder;->createSource(Landroid/content/res/Resources;I)Landroid/graphics/ImageDecoder$Source;

    move-result-object p0

    return-object p0

    :cond_3
    instance-of p1, p0, Lsh/f;

    if-eqz p1, :cond_5

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1e

    if-ge p1, v0, :cond_4

    if-eqz p2, :cond_4

    move-object p1, p0

    check-cast p1, Lsh/f;

    iget-object p1, p1, Lsh/f;->a:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result p1

    if-eqz p1, :cond_5

    :cond_4
    check-cast p0, Lsh/f;

    iget-object p0, p0, Lsh/f;->a:Ljava/nio/ByteBuffer;

    invoke-static {p0}, Landroid/graphics/ImageDecoder;->createSource(Ljava/nio/ByteBuffer;)Landroid/graphics/ImageDecoder$Source;

    move-result-object p0

    return-object p0

    :catch_0
    :cond_5
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final F(JLjava/lang/String;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-static {p2, p0, p1}, Landroid/os/Trace;->setCounter(Ljava/lang/String;J)V

    :cond_0
    return-void
.end method

.method public static final G(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/g;Li63/j;Lio/sentry/v0;Ljava/util/List;)V
    .locals 6

    const-string v0, "options"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Landroid/view/ViewGroup;

    if-nez v0, :cond_0

    goto :goto_3

    :cond_0
    sget-object v0, Lio/sentry/android/replay/viewhierarchy/b;->a:Ljava/lang/Object;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AndroidComposeView"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    :try_start_0
    instance-of v0, p0, Landroidx/compose/ui/node/Owner;

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, Landroidx/compose/ui/node/Owner;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_4

    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getRoot()La3/n0;

    move-result-object v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    const/4 v1, 0x1

    invoke-static {v0, p1, v1, p2, p3}, Lio/sentry/android/replay/viewhierarchy/b;->b(La3/n0;Lio/sentry/android/replay/viewhierarchy/g;ZLi63/j;Lio/sentry/v0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_1
    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v3, "Error traversing Compose tree. Most likely you\'re using an unsupported version of\nandroidx.compose.ui:ui. The minimum supported version is 1.5.0. If it\'s a newer\nversion, please open a github issue with the version you\'re using, so we can add\nsupport for it."

    new-array v4, v2, [Ljava/lang/Object;

    invoke-interface {p3, v1, v0, v3, v4}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_4
    :goto_2
    check-cast p0, Landroid/view/ViewGroup;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    if-nez v0, :cond_5

    :goto_3
    return-void

    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    :goto_4
    if-ge v2, v1, :cond_8

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    invoke-static {v3, p1, p2}, Lo73/a;->A(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/g;Li63/j;)Lio/sentry/android/replay/viewhierarchy/g;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz p4, :cond_6

    instance-of v5, v4, Lio/sentry/android/replay/viewhierarchy/e;

    if-eqz v5, :cond_6

    iget-boolean v5, v4, Lio/sentry/android/replay/viewhierarchy/g;->e:Z

    if-eqz v5, :cond_6

    invoke-interface {p4, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_6
    invoke-static {v3, v4, p2, p3, p4}, La4/a;->G(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/g;Li63/j;Lio/sentry/v0;Ljava/util/List;)V

    :cond_7
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    :cond_8
    iput-object v0, p1, Lio/sentry/android/replay/viewhierarchy/g;->g:Ljava/util/ArrayList;

    return-void
.end method

.method public static final a(Landroid/view/View;Landroid/view/ViewTreeObserver$OnDrawListener;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/view/ViewTreeObserver;->addOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-void
.end method

.method public static b(Landroid/media/MediaCodecInfo$VideoCapabilities;IID)I
    .locals 2

    invoke-virtual {p0}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getSupportedPerformancePoints()Ljava/util/List;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_9

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_3

    :cond_0
    new-instance v1, Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;

    double-to-int p3, p3

    new-instance p4, Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;

    invoke-direct {p4, p1, p2, p3}, Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;-><init>(III)V

    move p1, v0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p2

    const/4 p3, 0x2

    const/4 v1, 0x1

    if-ge p1, p2, :cond_2

    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Li9/h;->c(Ljava/lang/Object;)Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;

    move-result-object p2

    invoke-virtual {p2, p4}, Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;->covers(Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;)Z

    move-result p2

    if-eqz p2, :cond_1

    move p0, p3

    goto :goto_1

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    move p0, v1

    :goto_1
    if-ne p0, v1, :cond_8

    sget-object p1, Lbp/b;->E:Ljava/lang/Boolean;

    if-nez p1, :cond_8

    sget p1, Lx8/t;->a:I

    const/16 p2, 0x23

    if-lt p1, p2, :cond_4

    :cond_3
    move v1, v0

    goto :goto_2

    :cond_4
    invoke-static {v0}, La4/a;->o(Z)I

    move-result p1

    invoke-static {v1}, La4/a;->o(Z)I

    move-result p2

    if-nez p1, :cond_5

    goto :goto_2

    :cond_5
    if-nez p2, :cond_6

    if-eq p1, p3, :cond_3

    goto :goto_2

    :cond_6
    if-ne p1, p3, :cond_7

    if-eq p2, p3, :cond_3

    :cond_7
    :goto_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    sput-object p1, Lbp/b;->E:Ljava/lang/Boolean;

    if-eqz v1, :cond_8

    goto :goto_3

    :cond_8
    return p0

    :cond_9
    :goto_3
    return v0
.end method

.method public static c()V
    .locals 2

    const-string v0, "GlanceAppWidget::update"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/os/Trace;->beginAsyncSection(Ljava/lang/String;I)V

    return-void
.end method

.method public static d(Ljava/lang/String;)Landroid/content/LocusId;
    .locals 1

    new-instance v0, Landroid/content/LocusId;

    invoke-direct {v0, p0}, Landroid/content/LocusId;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static e(Landroid/graphics/Canvas;)V
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/Canvas;->disableZ()V

    return-void
.end method

.method public static f(Landroid/graphics/Canvas;ILandroid/graphics/BlendMode;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/BlendMode;)V

    return-void
.end method

.method public static g(Landroid/graphics/Canvas;J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroid/graphics/Canvas;->drawColor(J)V

    return-void
.end method

.method public static h(Landroid/graphics/Canvas;JLandroid/graphics/BlendMode;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Landroid/graphics/Canvas;->drawColor(JLandroid/graphics/BlendMode;)V

    return-void
.end method

.method public static i(Landroid/graphics/Canvas;Landroid/graphics/RectF;FFLandroid/graphics/RectF;FFLandroid/graphics/Paint;)V
    .locals 0

    invoke-virtual/range {p0 .. p7}, Landroid/graphics/Canvas;->drawDoubleRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    return-void
.end method

.method public static j(Landroid/graphics/Canvas;Landroid/graphics/RectF;[FLandroid/graphics/RectF;[FLandroid/graphics/Paint;)V
    .locals 0

    invoke-virtual/range {p0 .. p5}, Landroid/graphics/Canvas;->drawDoubleRoundRect(Landroid/graphics/RectF;[FLandroid/graphics/RectF;[FLandroid/graphics/Paint;)V

    return-void
.end method

.method public static k(Landroid/graphics/Canvas;Landroid/graphics/RenderNode;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroid/graphics/Canvas;->drawRenderNode(Landroid/graphics/RenderNode;)V

    return-void
.end method

.method public static l(Landroid/graphics/Canvas;Landroid/graphics/text/MeasuredText;IIIIFFZLandroid/graphics/Paint;)V
    .locals 0

    invoke-virtual/range {p0 .. p9}, Landroid/graphics/Canvas;->drawTextRun(Landroid/graphics/text/MeasuredText;IIIIFFZLandroid/graphics/Paint;)V

    return-void
.end method

.method public static m(Landroid/graphics/Canvas;)V
    .locals 0

    invoke-virtual {p0}, Landroid/graphics/Canvas;->enableZ()V

    return-void
.end method

.method public static n()V
    .locals 2

    const-string v0, "GlanceAppWidget::update"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/os/Trace;->endAsyncSection(Ljava/lang/String;I)V

    return-void
.end method

.method public static o(Z)I
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Lu8/o;

    invoke-direct {v1}, Lu8/o;-><init>()V

    const-string v2, "video/avc"

    invoke-static {v2}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lu8/o;->m:Ljava/lang/String;

    new-instance v2, Lu8/p;

    invoke-direct {v2, v1}, Lu8/p;-><init>(Lu8/o;)V

    iget-object v1, v2, Lu8/p;->n:Ljava/lang/String;

    if-eqz v1, :cond_4

    invoke-static {v1, p0, v0}, Li9/s;->e(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v1

    invoke-static {v2}, Li9/s;->b(Lu8/p;)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    sget-object p0, Lzr/w0;->E:Lzr/w0;

    goto :goto_0

    :cond_0
    invoke-static {v2, p0, v0}, Li9/s;->e(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object p0

    :goto_0
    invoke-static {}, Lzr/g0;->l()Lzr/d0;

    move-result-object v2

    invoke-virtual {v2, v1}, Lzr/a0;->c(Ljava/lang/Iterable;)V

    invoke-virtual {v2, p0}, Lzr/a0;->c(Ljava/lang/Iterable;)V

    invoke-virtual {v2}, Lzr/d0;->f()Lzr/w0;

    move-result-object p0

    move v1, v0

    :goto_1
    iget v2, p0, Lzr/w0;->z:I

    if-ge v1, v2, :cond_4

    invoke-virtual {p0, v1}, Lzr/w0;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li9/m;

    iget-object v2, v2, Li9/m;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    if-eqz v2, :cond_3

    invoke-virtual {p0, v1}, Lzr/w0;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li9/m;

    iget-object v2, v2, Li9/m;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    invoke-virtual {v2}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {p0, v1}, Lzr/w0;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li9/m;

    iget-object v2, v2, Li9/m;->d:Landroid/media/MediaCodecInfo$CodecCapabilities;

    invoke-virtual {v2}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    move-result-object v2

    invoke-virtual {v2}, Landroid/media/MediaCodecInfo$VideoCapabilities;->getSupportedPerformancePoints()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    new-instance p0, Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;

    new-instance p0, Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;

    const/16 v1, 0x500

    const/16 v3, 0x2d0

    const/16 v4, 0x3c

    invoke-direct {p0, v1, v3, v4}, Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;-><init>(III)V

    move v1, v0

    :goto_2
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Li9/h;->c(Ljava/lang/Object;)Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;

    move-result-object v3

    invoke-virtual {v3, p0}, Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;->covers(Landroid/media/MediaCodecInfo$VideoCapabilities$PerformancePoint;)Z

    move-result v3
    :try_end_0
    .catch Landroidx/media3/exoplayer/mediacodec/MediaCodecUtil$DecoderQueryException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v3, :cond_1

    const/4 p0, 0x2

    return p0

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    const/4 p0, 0x1

    return p0

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :catch_0
    :cond_4
    return v0
.end method

.method public static p(Landroid/graphics/drawable/Drawable;)Landroid/content/res/ColorStateList;
    .locals 2

    instance-of v0, p0, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {p0}, Landroid/graphics/drawable/ColorDrawable;->getColor()I

    move-result p0

    invoke-static {p0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    instance-of v0, p0, Landroid/graphics/drawable/ColorStateListDrawable;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/graphics/drawable/ColorStateListDrawable;

    invoke-virtual {p0}, Landroid/graphics/drawable/ColorStateListDrawable;->getColorStateList()Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static q(Lu8/d;)Lzr/w0;
    .locals 6

    invoke-static {}, Lzr/g0;->l()Lzr/d0;

    move-result-object v0

    sget-object v1, Ld9/b;->e:Lzr/b1;

    iget-object v2, v1, Lzr/b1;->x:Lzr/z0;

    if-nez v2, :cond_0

    new-instance v2, Lzr/a1;

    iget-object v3, v1, Lzr/b1;->E:[Ljava/lang/Object;

    const/4 v4, 0x0

    iget v5, v1, Lzr/b1;->F:I

    invoke-direct {v2, v4, v5, v3}, Lzr/a1;-><init>(II[Ljava/lang/Object;)V

    new-instance v3, Lzr/z0;

    invoke-direct {v3, v1, v2}, Lzr/z0;-><init>(Lzr/b1;Lzr/a1;)V

    iput-object v3, v1, Lzr/b1;->x:Lzr/z0;

    move-object v2, v3

    :cond_0
    invoke-virtual {v2}, Lzr/z0;->o()Lzr/k1;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    sget v4, Lx8/t;->a:I

    invoke-static {v3}, Lx8/t;->o(I)I

    move-result v5

    if-ge v4, v5, :cond_2

    goto :goto_0

    :cond_2
    new-instance v4, Landroid/media/AudioFormat$Builder;

    invoke-direct {v4}, Landroid/media/AudioFormat$Builder;-><init>()V

    const/16 v5, 0xc

    invoke-virtual {v4, v5}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    move-result-object v3

    const v4, 0xbb80

    invoke-virtual {v3, v4}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    move-result-object v3

    invoke-virtual {v3}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    move-result-object v3

    invoke-virtual {p0}, Lu8/d;->a()Lty/c;

    move-result-object v4

    iget-object v4, v4, Lty/c;->x:Ljava/lang/Object;

    check-cast v4, Landroid/media/AudioAttributes;

    invoke-static {v3, v4}, Landroid/media/AudioTrack;->isDirectPlaybackSupported(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0, v2}, Lzr/a0;->a(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    const/4 p0, 0x2

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {v0, p0}, Lzr/a0;->a(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lzr/d0;->f()Lzr/w0;

    move-result-object p0

    return-object p0
.end method

.method public static r(Landroid/content/LocusId;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Landroid/content/LocusId;->getId()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static s(IILu8/d;)I
    .locals 3

    const/16 v0, 0xa

    :goto_0
    if-lez v0, :cond_2

    invoke-static {v0}, Lx8/t;->q(I)I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    new-instance v2, Landroid/media/AudioFormat$Builder;

    invoke-direct {v2}, Landroid/media/AudioFormat$Builder;-><init>()V

    invoke-virtual {v2, p0}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    move-result-object v2

    invoke-virtual {v2, v1}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    move-result-object v1

    invoke-virtual {p2}, Lu8/d;->a()Lty/c;

    move-result-object v2

    iget-object v2, v2, Lty/c;->x:Ljava/lang/Object;

    check-cast v2, Landroid/media/AudioAttributes;

    invoke-static {v1, v2}, Landroid/media/AudioTrack;->isDirectPlaybackSupported(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    move-result v1

    if-eqz v1, :cond_1

    return v0

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static t(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;Z)Ld9/g;
    .locals 0

    invoke-static {p0, p1}, Landroid/media/AudioManager;->isOffloadedPlaybackSupported(Landroid/media/AudioFormat;Landroid/media/AudioAttributes;)Z

    move-result p0

    if-nez p0, :cond_0

    sget-object p0, Ld9/g;->d:Ld9/g;

    return-object p0

    :cond_0
    new-instance p0, Ld9/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Ld9/f;->a:Z

    iput-boolean p2, p0, Ld9/f;->c:Z

    invoke-virtual {p0}, Ld9/f;->a()Ld9/g;

    move-result-object p0

    return-object p0
.end method

.method public static u(Landroid/view/accessibility/AccessibilityManager;II)I
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroid/view/accessibility/AccessibilityManager;->getRecommendedTimeoutMillis(II)I

    move-result p0

    return p0
.end method

.method public static final v(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Rect;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/CharSequence;IILandroid/graphics/Rect;)V

    return-void
.end method

.method public static final w(Landroid/view/View;)Ll83/k;
    .locals 5

    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Landroid/view/View;->getWindowVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v0, Ll83/k;

    invoke-direct {v0, p0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_0
    move-object v0, p0

    :goto_0
    instance-of v2, v0, Landroid/view/View;

    if-eqz v2, :cond_4

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-lt v2, v3, :cond_1

    move-object v2, v0

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getTransitionAlpha()F

    move-result v2

    goto :goto_1

    :cond_1
    const/high16 v2, 0x3f800000    # 1.0f

    :goto_1
    check-cast v0, Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getAlpha()F

    move-result v3

    const/4 v4, 0x0

    cmpg-float v3, v3, v4

    if-lez v3, :cond_3

    cmpg-float v2, v2, v4

    if-lez v2, :cond_3

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_3
    :goto_2
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v0, Ll83/k;

    invoke-direct {v0, p0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0

    :cond_4
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    new-instance v1, Landroid/graphics/Point;

    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;Landroid/graphics/Point;)Z

    move-result p0

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    new-instance v1, Ll83/k;

    invoke-direct {v1, p0, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1

    :cond_5
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v0, Ll83/k;

    invoke-direct {v0, p0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public static x(I)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Le4/p;->e(I)I

    move-result p0

    packed-switch p0, :pswitch_data_0

    const/4 p0, 0x0

    return-object p0

    :pswitch_0
    sget-object p0, Landroid/graphics/BlendMode;->LUMINOSITY:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_1
    sget-object p0, Landroid/graphics/BlendMode;->COLOR:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_2
    sget-object p0, Landroid/graphics/BlendMode;->SATURATION:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_3
    sget-object p0, Landroid/graphics/BlendMode;->HUE:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_4
    sget-object p0, Landroid/graphics/BlendMode;->MULTIPLY:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_5
    sget-object p0, Landroid/graphics/BlendMode;->EXCLUSION:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_6
    sget-object p0, Landroid/graphics/BlendMode;->DIFFERENCE:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_7
    sget-object p0, Landroid/graphics/BlendMode;->SOFT_LIGHT:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_8
    sget-object p0, Landroid/graphics/BlendMode;->HARD_LIGHT:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_9
    sget-object p0, Landroid/graphics/BlendMode;->COLOR_BURN:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_a
    sget-object p0, Landroid/graphics/BlendMode;->COLOR_DODGE:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_b
    sget-object p0, Landroid/graphics/BlendMode;->LIGHTEN:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_c
    sget-object p0, Landroid/graphics/BlendMode;->DARKEN:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_d
    sget-object p0, Landroid/graphics/BlendMode;->OVERLAY:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_e
    sget-object p0, Landroid/graphics/BlendMode;->SCREEN:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_f
    sget-object p0, Landroid/graphics/BlendMode;->MODULATE:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_10
    sget-object p0, Landroid/graphics/BlendMode;->PLUS:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_11
    sget-object p0, Landroid/graphics/BlendMode;->XOR:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_12
    sget-object p0, Landroid/graphics/BlendMode;->DST_ATOP:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_13
    sget-object p0, Landroid/graphics/BlendMode;->SRC_ATOP:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_14
    sget-object p0, Landroid/graphics/BlendMode;->DST_OUT:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_15
    sget-object p0, Landroid/graphics/BlendMode;->SRC_OUT:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_16
    sget-object p0, Landroid/graphics/BlendMode;->DST_IN:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_17
    sget-object p0, Landroid/graphics/BlendMode;->SRC_IN:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_18
    sget-object p0, Landroid/graphics/BlendMode;->DST_OVER:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_19
    sget-object p0, Landroid/graphics/BlendMode;->SRC_OVER:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_1a
    sget-object p0, Landroid/graphics/BlendMode;->DST:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_1b
    sget-object p0, Landroid/graphics/BlendMode;->SRC:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_1c
    sget-object p0, Landroid/graphics/BlendMode;->CLEAR:Landroid/graphics/BlendMode;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static y(IIII)Landroid/graphics/Insets;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Landroid/graphics/Insets;->of(IIII)Landroid/graphics/Insets;

    move-result-object p0

    return-object p0
.end method

.method public static final z(Landroid/view/View;Lio/sentry/android/replay/c0;)V
    .locals 1

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-void
.end method
