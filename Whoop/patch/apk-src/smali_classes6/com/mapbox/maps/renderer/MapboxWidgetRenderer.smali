.class public final Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0015\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\nJ\u000f\u0010\u0011\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\nJ\r\u0010\u0012\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00082\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u00082\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u001f\u0010\nJ\r\u0010 \u001a\u00020\u0008\u00a2\u0006\u0004\u0008 \u0010\nJ\u0015\u0010#\u001a\u00020\u00082\u0006\u0010\"\u001a\u00020!\u00a2\u0006\u0004\u0008#\u0010$J\u0015\u0010%\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!\u00a2\u0006\u0004\u0008%\u0010&J\r\u0010\'\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\'\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010(R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u0016\u0010-\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0016\u00102\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00082\u0010.R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00086\u00105R\u001a\u00108\u001a\u0008\u0012\u0004\u0012\u00020!078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010(R\u0016\u0010\u001c\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010(R\u001a\u0010:\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u000c\n\u0004\u0008:\u0010)\u0012\u0004\u0008;\u0010\nR\u0011\u0010=\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008<\u0010\u0013\u00a8\u0006>"
    }
    d2 = {
        "Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;",
        "",
        "",
        "antialiasingSampleCount",
        "",
        "mapName",
        "<init>",
        "(ILjava/lang/String;)V",
        "Ll83/a0;",
        "prepareFrameBufferWithTexture",
        "()V",
        "",
        "resizing",
        "releaseAll",
        "(Z)V",
        "deleteFrameBufferWithTexture",
        "checkSizeChanged",
        "checkEgl",
        "hasWidgets",
        "()Z",
        "hasTexture",
        "getTexture",
        "()I",
        "Landroid/opengl/EGLContext;",
        "sharedContext",
        "setSharedContext",
        "(Landroid/opengl/EGLContext;)V",
        "width",
        "height",
        "onSurfaceChanged",
        "(II)V",
        "release",
        "renderToFrameBuffer",
        "Lcom/mapbox/maps/renderer/widget/Widget;",
        "widget",
        "addWidget",
        "(Lcom/mapbox/maps/renderer/widget/Widget;)V",
        "removeWidget",
        "(Lcom/mapbox/maps/renderer/widget/Widget;)Z",
        "cleanUpAllWidgets",
        "I",
        "Ljava/lang/String;",
        "Lcom/mapbox/maps/renderer/egl/EGLCore;",
        "eglCore",
        "Lcom/mapbox/maps/renderer/egl/EGLCore;",
        "eglContextCreated",
        "Z",
        "Landroid/opengl/EGLSurface;",
        "eglSurface",
        "Landroid/opengl/EGLSurface;",
        "sizeChanged",
        "",
        "textures",
        "[I",
        "framebuffers",
        "Ljava/util/concurrent/CopyOnWriteArraySet;",
        "widgets",
        "Ljava/util/concurrent/CopyOnWriteArraySet;",
        "TAG",
        "getTAG$annotations",
        "getNeedRender",
        "needRender",
        "maps-sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;

.field private final antialiasingSampleCount:I

.field private eglContextCreated:Z

.field private eglCore:Lcom/mapbox/maps/renderer/egl/EGLCore;

.field private eglSurface:Landroid/opengl/EGLSurface;

.field private final framebuffers:[I

.field private height:I

.field private final mapName:Ljava/lang/String;

.field private sizeChanged:Z

.field private final textures:[I

.field private final widgets:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lcom/mapbox/maps/renderer/widget/Widget;",
            ">;"
        }
    .end annotation
.end field

.field private width:I


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 1

    const-string v0, "mapName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->antialiasingSampleCount:I

    iput-object p2, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->mapName:Ljava/lang/String;

    const/4 p1, 0x0

    filled-new-array {p1}, [I

    move-result-object v0

    iput-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->textures:[I

    filled-new-array {p1}, [I

    move-result-object p1

    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->framebuffers:[I

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->widgets:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "MapboxWidgetRenderer"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "\\"

    invoke-static {v0, p2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_0
    const-string p2, ""

    :goto_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->TAG:Ljava/lang/String;

    return-void
.end method

.method private final checkEgl()V
    .locals 3

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->eglSurface:Landroid/opengl/EGLSurface;

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->eglCore:Lcom/mapbox/maps/renderer/egl/EGLCore;

    if-nez v1, :cond_0

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->TAG:Ljava/lang/String;

    const-string v1, "Cannot prepare egl, eglCore has not been initialized yet."

    invoke-static {v0, v1}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {v1}, Lcom/mapbox/maps/renderer/egl/EGLCore;->getEglNoSurface$maps_sdk_release()Landroid/opengl/EGLSurface;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    iget-boolean v2, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->eglContextCreated:Z

    if-nez v2, :cond_2

    invoke-virtual {v1}, Lcom/mapbox/maps/renderer/egl/EGLCore;->prepareEgl()Z

    move-result v2

    iput-boolean v2, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->eglContextCreated:Z

    if-nez v2, :cond_2

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->TAG:Ljava/lang/String;

    const-string v1, "Widget EGL was not configured, please check logs above."

    invoke-static {v0, v1}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    if-eqz v0, :cond_3

    invoke-virtual {v1}, Lcom/mapbox/maps/renderer/egl/EGLCore;->getEglNoSurface$maps_sdk_release()Landroid/opengl/EGLSurface;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    :cond_3
    iget v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->width:I

    iget v2, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->height:I

    invoke-virtual {v1, v0, v2}, Lcom/mapbox/maps/renderer/egl/EGLCore;->createOffscreenSurface(II)Landroid/opengl/EGLSurface;

    move-result-object v0

    iput-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->eglSurface:Landroid/opengl/EGLSurface;

    invoke-virtual {v1}, Lcom/mapbox/maps/renderer/egl/EGLCore;->getEglNoSurface$maps_sdk_release()Landroid/opengl/EGLSurface;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->TAG:Ljava/lang/String;

    const-string v1, "Widget offscreen surface was not configured, please check logs above."

    invoke-static {v0, v1}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_0
    return-void
.end method

.method private final checkSizeChanged()V
    .locals 2

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->sizeChanged:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->eglCore:Lcom/mapbox/maps/renderer/egl/EGLCore;

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->eglSurface:Landroid/opengl/EGLSurface;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/egl/EGLCore;->getEglNoSurface$maps_sdk_release()Landroid/opengl/EGLSurface;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->releaseAll(Z)V

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->sizeChanged:Z

    :cond_1
    return-void
.end method

.method private final deleteFrameBufferWithTexture()V
    .locals 3

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->framebuffers:[I

    array-length v1, v0

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glDeleteFramebuffers(I[II)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->textures:[I

    array-length v1, v0

    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glDeleteTextures(I[II)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->framebuffers:[I

    aput v2, v0, v2

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->textures:[I

    aput v2, v0, v2

    return-void
.end method

.method private static synthetic getTAG$annotations()V
    .locals 0

    return-void
.end method

.method private final prepareFrameBufferWithTexture()V
    .locals 13

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->framebuffers:[I

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glGenFramebuffers(I[II)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->textures:[I

    invoke-static {v1, v0, v2}, Landroid/opengl/GLES20;->glGenTextures(I[II)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->textures:[I

    aget v0, v0, v2

    const/16 v1, 0xde1

    invoke-static {v1, v0}, Landroid/opengl/GLES20;->glBindTexture(II)V

    const/16 v0, 0x2800

    const v3, 0x46180400    # 9729.0f

    invoke-static {v1, v0, v3}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    const/16 v0, 0x2801

    invoke-static {v1, v0, v3}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    const/16 v0, 0x2802

    const v3, 0x47012f00    # 33071.0f

    invoke-static {v1, v0, v3}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    const/16 v0, 0x2803

    invoke-static {v1, v0, v3}, Landroid/opengl/GLES20;->glTexParameterf(IIF)V

    iget v7, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->width:I

    iget v8, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->height:I

    const/16 v11, 0x1401

    const/4 v12, 0x0

    const/16 v4, 0xde1

    const/4 v5, 0x0

    const/16 v6, 0x1908

    const/4 v9, 0x0

    const/16 v10, 0x1908

    invoke-static/range {v4 .. v12}, Landroid/opengl/GLES20;->glTexImage2D(IIIIIIIILjava/nio/Buffer;)V

    invoke-static {v1, v2}, Landroid/opengl/GLES20;->glBindTexture(II)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->framebuffers:[I

    aget v0, v0, v2

    const v3, 0x8d40

    invoke-static {v3, v0}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->textures:[I

    aget v0, v0, v2

    const v4, 0x8ce0

    invoke-static {v3, v4, v1, v0, v2}, Landroid/opengl/GLES20;->glFramebufferTexture2D(IIIII)V

    invoke-static {v3, v2}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    return-void
.end method

.method private final releaseAll(Z)V
    .locals 4

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->eglCore:Lcom/mapbox/maps/renderer/egl/EGLCore;

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->eglSurface:Landroid/opengl/EGLSurface;

    if-eqz v0, :cond_2

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/egl/EGLCore;->getEglNoSurface$maps_sdk_release()Landroid/opengl/EGLSurface;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lcom/mapbox/maps/renderer/egl/EGLCore;->makeCurrent(Landroid/opengl/EGLSurface;)Z

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->deleteFrameBufferWithTexture()V

    iget-object v2, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->widgets:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mapbox/maps/renderer/widget/Widget;

    invoke-virtual {v3}, Lcom/mapbox/maps/renderer/widget/Widget;->getRenderer$maps_sdk_release()Lcom/mapbox/maps/renderer/widget/WidgetRenderer;

    move-result-object v3

    invoke-interface {v3}, Lcom/mapbox/maps/renderer/widget/WidgetRenderer;->release()V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lcom/mapbox/maps/renderer/egl/EGLCore;->releaseSurface(Landroid/opengl/EGLSurface;)V

    :cond_1
    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/egl/EGLCore;->release()V

    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->eglSurface:Landroid/opengl/EGLSurface;

    if-nez p1, :cond_3

    iput-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->eglCore:Lcom/mapbox/maps/renderer/egl/EGLCore;

    :cond_3
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->eglContextCreated:Z

    return-void
.end method


# virtual methods
.method public final addWidget(Lcom/mapbox/maps/renderer/widget/Widget;)V
    .locals 3

    const-string v0, "widget"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/maps/renderer/widget/Widget;->getRenderer$maps_sdk_release()Lcom/mapbox/maps/renderer/widget/WidgetRenderer;

    move-result-object v0

    iget v1, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->width:I

    iget v2, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->height:I

    invoke-interface {v0, v1, v2}, Lcom/mapbox/maps/renderer/widget/WidgetRenderer;->onSurfaceChanged(II)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->widgets:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final cleanUpAllWidgets()V
    .locals 3

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->widgets:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mapbox/maps/renderer/widget/Widget;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/mapbox/maps/renderer/widget/Widget;->setTriggerRepaintAction$maps_sdk_release(Lc93/a;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->widgets:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    return-void
.end method

.method public final getNeedRender()Z
    .locals 3

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->widgets:Ljava/util/concurrent/CopyOnWriteArraySet;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    return v1

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/mapbox/maps/renderer/widget/Widget;

    invoke-virtual {v2}, Lcom/mapbox/maps/renderer/widget/Widget;->getRenderer$maps_sdk_release()Lcom/mapbox/maps/renderer/widget/WidgetRenderer;

    move-result-object v2

    invoke-interface {v2}, Lcom/mapbox/maps/renderer/widget/WidgetRenderer;->getNeedRender()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_2
    return v1
.end method

.method public final getTexture()I
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->textures:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    return v0
.end method

.method public final hasTexture()Z
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->textures:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    return v1
.end method

.method public final hasWidgets()Z
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->widgets:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final onSurfaceChanged(II)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->sizeChanged:Z

    iput p1, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->width:I

    iput p2, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->height:I

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->widgets:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mapbox/maps/renderer/widget/Widget;

    invoke-virtual {v1}, Lcom/mapbox/maps/renderer/widget/Widget;->getRenderer$maps_sdk_release()Lcom/mapbox/maps/renderer/widget/WidgetRenderer;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Lcom/mapbox/maps/renderer/widget/WidgetRenderer;->onSurfaceChanged(II)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final release()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->releaseAll(Z)V

    return-void
.end method

.method public final removeWidget(Lcom/mapbox/maps/renderer/widget/Widget;)Z
    .locals 2

    const-string v0, "widget"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->widgets:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lcom/mapbox/maps/renderer/widget/Widget;->setTriggerRepaintAction$maps_sdk_release(Lc93/a;)V

    :cond_0
    return v0
.end method

.method public final renderToFrameBuffer()V
    .locals 4

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->checkSizeChanged()V

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->checkEgl()V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->eglCore:Lcom/mapbox/maps/renderer/egl/EGLCore;

    iget-object v1, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->eglSurface:Landroid/opengl/EGLSurface;

    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lcom/mapbox/maps/renderer/egl/EGLCore;->getEglNoSurface$maps_sdk_release()Landroid/opengl/EGLSurface;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v1}, Lcom/mapbox/maps/renderer/egl/EGLCore;->makeCurrent(Landroid/opengl/EGLSurface;)Z

    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->hasTexture()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->prepareFrameBufferWithTexture()V

    :cond_1
    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->framebuffers:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    const v2, 0x8d40

    invoke-static {v2, v0}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    const/16 v0, 0x4500

    invoke-static {v0}, Landroid/opengl/GLES20;->glClear(I)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->widgets:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/mapbox/maps/renderer/widget/Widget;

    invoke-virtual {v3}, Lcom/mapbox/maps/renderer/widget/Widget;->getRenderer$maps_sdk_release()Lcom/mapbox/maps/renderer/widget/WidgetRenderer;

    move-result-object v3

    invoke-interface {v3}, Lcom/mapbox/maps/renderer/widget/WidgetRenderer;->render()V

    goto :goto_0

    :cond_2
    invoke-static {v2, v1}, Landroid/opengl/GLES20;->glBindFramebuffer(II)V

    :cond_3
    :goto_1
    return-void
.end method

.method public final setSharedContext(Landroid/opengl/EGLContext;)V
    .locals 4

    const-string v0, "sharedContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->eglContextCreated:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->release()V

    :cond_0
    new-instance v0, Lcom/mapbox/maps/renderer/egl/EGLCore;

    iget v1, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->antialiasingSampleCount:I

    iget-object v2, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->mapName:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, p1, v2}, Lcom/mapbox/maps/renderer/egl/EGLCore;-><init>(ZILandroid/opengl/EGLContext;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/mapbox/maps/renderer/MapboxWidgetRenderer;->eglCore:Lcom/mapbox/maps/renderer/egl/EGLCore;

    return-void
.end method
