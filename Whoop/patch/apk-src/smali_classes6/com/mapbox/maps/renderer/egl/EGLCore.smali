.class public final Lcom/mapbox/maps/renderer/egl/EGLCore;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/maps/renderer/egl/EGLCore$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0001\u0018\u0000 T2\u00020\u0001:\u0001TB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000c\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 \u00a2\u0006\u0004\u0008\"\u0010#J\u001d\u0010&\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0004\u00a2\u0006\u0004\u0008&\u0010\'J\r\u0010(\u001a\u00020\u0002\u00a2\u0006\u0004\u0008(\u0010\u0017J\u0015\u0010)\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008)\u0010*J\u0015\u0010+\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c\u00a2\u0006\u0004\u0008+\u0010,J\u0017\u00101\u001a\u00020\u00132\u0006\u0010.\u001a\u00020-H\u0000\u00a2\u0006\u0004\u0008/\u00100J\u0017\u00103\u001a\u00020\u00132\u0006\u0010.\u001a\u00020-H\u0000\u00a2\u0006\u0004\u00082\u00100J\u000f\u00105\u001a\u00020\u0013H\u0000\u00a2\u0006\u0004\u00084\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u00108R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R\"\u0010@\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008@\u00108\u001a\u0004\u0008A\u0010B\"\u0004\u0008C\u0010DR\u001a\u0010E\u001a\u00020\u001c8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008E\u0010F\u001a\u0004\u0008G\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010KR\u001a\u0010M\u001a\u0008\u0012\u0004\u0012\u00020\u00110L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008M\u0010NR\u001a\u0010P\u001a\u0008\u0012\u0004\u0012\u00020-0O8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008P\u0010QR\u001a\u0010R\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u000c\n\u0004\u0008R\u00109\u0012\u0004\u0008S\u0010\u001b\u00a8\u0006U"
    }
    d2 = {
        "Lcom/mapbox/maps/renderer/egl/EGLCore;",
        "",
        "",
        "translucentSurface",
        "",
        "antialiasingSampleCount",
        "Landroid/opengl/EGLContext;",
        "sharedContext",
        "",
        "mapName",
        "<init>",
        "(ZILandroid/opengl/EGLContext;Ljava/lang/String;)V",
        "functionName",
        "checkEglErrorAndNotify",
        "(Ljava/lang/String;)Ljava/lang/Integer;",
        "msg",
        "checkEglError",
        "Lcom/mapbox/maps/renderer/RendererError;",
        "error",
        "Ll83/a0;",
        "notifyListeners",
        "(Lcom/mapbox/maps/renderer/RendererError;)V",
        "prepareEgl",
        "()Z",
        "queryContextVersion",
        "()I",
        "release",
        "()V",
        "Landroid/opengl/EGLSurface;",
        "eglSurface",
        "releaseSurface",
        "(Landroid/opengl/EGLSurface;)V",
        "Landroid/view/Surface;",
        "surface",
        "createWindowSurface",
        "(Landroid/view/Surface;)Landroid/opengl/EGLSurface;",
        "width",
        "height",
        "createOffscreenSurface",
        "(II)Landroid/opengl/EGLSurface;",
        "makeNothingCurrent",
        "makeCurrent",
        "(Landroid/opengl/EGLSurface;)Z",
        "swapBuffers",
        "(Landroid/opengl/EGLSurface;)I",
        "Lcom/mapbox/maps/renderer/RendererSetupErrorListener;",
        "listener",
        "addRendererStateListener$maps_sdk_release",
        "(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V",
        "addRendererStateListener",
        "removeRendererStateListener$maps_sdk_release",
        "removeRendererStateListener",
        "clearRendererStateListeners$maps_sdk_release",
        "clearRendererStateListeners",
        "Z",
        "I",
        "Landroid/opengl/EGLContext;",
        "Ljava/lang/String;",
        "Landroid/opengl/EGLConfig;",
        "eglConfig",
        "Landroid/opengl/EGLConfig;",
        "Landroid/opengl/EGLDisplay;",
        "eglDisplay",
        "Landroid/opengl/EGLDisplay;",
        "eglContext",
        "getEglContext$maps_sdk_release",
        "()Landroid/opengl/EGLContext;",
        "setEglContext$maps_sdk_release",
        "(Landroid/opengl/EGLContext;)V",
        "eglNoSurface",
        "Landroid/opengl/EGLSurface;",
        "getEglNoSurface$maps_sdk_release",
        "()Landroid/opengl/EGLSurface;",
        "Landroid/os/Handler;",
        "mainHandler",
        "Landroid/os/Handler;",
        "Ljava/util/LinkedList;",
        "accumulatedRendererErrorList",
        "Ljava/util/LinkedList;",
        "Ljava/util/HashSet;",
        "rendererSetupErrorListenerSet",
        "Ljava/util/HashSet;",
        "TAG",
        "getTAG$annotations",
        "Companion",
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


# static fields
.field private static final Companion:Lcom/mapbox/maps/renderer/egl/EGLCore$Companion;

.field private static final attribsEgl3:[I
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final TAG:Ljava/lang/String;

.field private final accumulatedRendererErrorList:Ljava/util/LinkedList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedList<",
            "Lcom/mapbox/maps/renderer/RendererError;",
            ">;"
        }
    .end annotation
.end field

.field private final antialiasingSampleCount:I

.field private eglConfig:Landroid/opengl/EGLConfig;

.field private eglContext:Landroid/opengl/EGLContext;

.field private eglDisplay:Landroid/opengl/EGLDisplay;

.field private final eglNoSurface:Landroid/opengl/EGLSurface;

.field private final mainHandler:Landroid/os/Handler;

.field private final mapName:Ljava/lang/String;

.field private final rendererSetupErrorListenerSet:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lcom/mapbox/maps/renderer/RendererSetupErrorListener;",
            ">;"
        }
    .end annotation
.end field

.field private final sharedContext:Landroid/opengl/EGLContext;

.field private final translucentSurface:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/mapbox/maps/renderer/egl/EGLCore$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/maps/renderer/egl/EGLCore$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/maps/renderer/egl/EGLCore;->Companion:Lcom/mapbox/maps/renderer/egl/EGLCore$Companion;

    const/4 v0, 0x3

    const/16 v1, 0x3038

    const/16 v2, 0x3098

    filled-new-array {v2, v0, v1}, [I

    move-result-object v0

    sput-object v0, Lcom/mapbox/maps/renderer/egl/EGLCore;->attribsEgl3:[I

    return-void
.end method

.method public constructor <init>(ZILandroid/opengl/EGLContext;Ljava/lang/String;)V
    .locals 1

    const-string v0, "sharedContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->translucentSurface:Z

    .line 3
    iput p2, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->antialiasingSampleCount:I

    .line 4
    iput-object p3, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->sharedContext:Landroid/opengl/EGLContext;

    .line 5
    iput-object p4, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->mapName:Ljava/lang/String;

    .line 6
    sget-object p1, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    const-string p2, "EGL_NO_DISPLAY"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglDisplay:Landroid/opengl/EGLDisplay;

    .line 7
    sget-object p1, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    const-string p2, "EGL_NO_CONTEXT"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglContext:Landroid/opengl/EGLContext;

    .line 8
    sget-object p1, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    const-string p2, "EGL_NO_SURFACE"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglNoSurface:Landroid/opengl/EGLSurface;

    .line 9
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->mainHandler:Landroid/os/Handler;

    .line 10
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->accumulatedRendererErrorList:Ljava/util/LinkedList;

    .line 11
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->rendererSetupErrorListenerSet:Ljava/util/HashSet;

    .line 12
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Mbgl-EglCore"

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_0

    const-string p2, "\\"

    .line 13
    invoke-static {p2, p4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    .line 14
    :cond_0
    const-string p2, ""

    :goto_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->TAG:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ZILandroid/opengl/EGLContext;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    .line 19
    sget-object p3, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    const-string p5, "EGL_NO_CONTEXT"

    invoke-static {p3, p5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/mapbox/maps/renderer/egl/EGLCore;-><init>(ZILandroid/opengl/EGLContext;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Ljava/util/HashSet;Lcom/mapbox/maps/renderer/RendererError;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/maps/renderer/egl/EGLCore;->notifyListeners$lambda$5(Ljava/util/HashSet;Lcom/mapbox/maps/renderer/RendererError;)V

    return-void
.end method

.method private static final addRendererStateListener$lambda$3(Ljava/util/LinkedList;Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V
    .locals 2

    const-string v0, "$immutableCopy"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mapbox/maps/renderer/RendererError;

    const-string v1, "error"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lcom/mapbox/maps/renderer/RendererSetupErrorListener;->onError(Lcom/mapbox/maps/renderer/RendererError;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic b(Ljava/util/LinkedList;Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/maps/renderer/egl/EGLCore;->addRendererStateListener$lambda$3(Ljava/util/LinkedList;Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V

    return-void
.end method

.method private final checkEglError(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 3

    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    move-result v0

    const/16 v1, 0x3000

    if-eq v0, v1, :cond_0

    iget-object v1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->TAG:Ljava/lang/String;

    const-string v2, ": EGL error: 0x"

    invoke-static {p1, v2}, Le4/p;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final checkEglErrorAndNotify(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 5

    invoke-direct {p0, p1}, Lcom/mapbox/maps/renderer/egl/EGLCore;->checkEglError(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_1

    const/16 v1, 0x3003

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, v1, :cond_0

    sget-object v1, Lcom/mapbox/maps/renderer/RendererError;->OUT_OF_MEMORY:Lcom/mapbox/maps/renderer/RendererError;

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/mapbox/maps/renderer/RendererError;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-direct {v1, v2}, Lcom/mapbox/maps/renderer/RendererError;-><init>(I)V

    :goto_0
    iget-object v2, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "EGL error "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/mapbox/maps/renderer/RendererError;->getEglErrorCode()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " occurred for "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x21

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v1}, Lcom/mapbox/maps/renderer/egl/EGLCore;->notifyListeners(Lcom/mapbox/maps/renderer/RendererError;)V

    :cond_1
    return-object v0
.end method

.method private static synthetic getTAG$annotations()V
    .locals 0

    return-void
.end method

.method private final notifyListeners(Lcom/mapbox/maps/renderer/RendererError;)V
    .locals 4

    iget-object v0, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->accumulatedRendererErrorList:Ljava/util/LinkedList;

    invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->rendererSetupErrorListenerSet:Ljava/util/HashSet;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashSet;

    iget-object v1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->rendererSetupErrorListenerSet:Ljava/util/HashSet;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iget-object v1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->mainHandler:Landroid/os/Handler;

    new-instance v2, La8/c;

    const/16 v3, 0xe

    invoke-direct {v2, v3, v0, p1}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method private static final notifyListeners$lambda$5(Ljava/util/HashSet;Lcom/mapbox/maps/renderer/RendererError;)V
    .locals 1

    const-string v0, "$immutableCopy"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/mapbox/maps/renderer/RendererSetupErrorListener;

    invoke-interface {v0, p1}, Lcom/mapbox/maps/renderer/RendererSetupErrorListener;->onError(Lcom/mapbox/maps/renderer/RendererError;)V

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final addRendererStateListener$maps_sdk_release(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V
    .locals 4

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->rendererSetupErrorListenerSet:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->accumulatedRendererErrorList:Ljava/util/LinkedList;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/LinkedList;

    iget-object v1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->accumulatedRendererErrorList:Ljava/util/LinkedList;

    invoke-direct {v0, v1}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    iget-object v1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->mainHandler:Landroid/os/Handler;

    new-instance v2, La8/c;

    const/16 v3, 0xf

    invoke-direct {v2, v3, v0, p1}, La8/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final clearRendererStateListeners$maps_sdk_release()V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->accumulatedRendererErrorList:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/LinkedList;->clear()V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->rendererSetupErrorListenerSet:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    return-void
.end method

.method public final createOffscreenSurface(II)Landroid/opengl/EGLSurface;
    .locals 4

    const/16 v0, 0x3056

    const/16 v1, 0x3038

    const/16 v2, 0x3057

    filled-new-array {v2, p1, v0, p2, v1}, [I

    move-result-object v0

    iget-object v1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglDisplay:Landroid/opengl/EGLDisplay;

    iget-object v2, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglConfig:Landroid/opengl/EGLConfig;

    if-eqz v2, :cond_2

    const/4 v3, 0x0

    invoke-static {v1, v2, v0, v3}, Landroid/opengl/EGL14;->eglCreatePbufferSurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;[II)Landroid/opengl/EGLSurface;

    move-result-object v0

    const-string v1, "eglCreatePbufferSurface"

    invoke-direct {p0, v1}, Lcom/mapbox/maps/renderer/egl/EGLCore;->checkEglErrorAndNotify(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Created PBuffer, w = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", h = "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglNoSurface:Landroid/opengl/EGLSurface;

    return-object p1

    :cond_2
    const-string p1, "eglConfig"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final createWindowSurface(Landroid/view/Surface;)Landroid/opengl/EGLSurface;
    .locals 4

    const-string v0, "surface"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x3038

    :try_start_0
    filled-new-array {v0}, [I

    move-result-object v0

    iget-object v1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglDisplay:Landroid/opengl/EGLDisplay;

    iget-object v2, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglConfig:Landroid/opengl/EGLConfig;

    if-eqz v2, :cond_2

    const/4 v3, 0x0

    invoke-static {v1, v2, p1, v0, v3}, Landroid/opengl/EGL14;->eglCreateWindowSurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Ljava/lang/Object;[II)Landroid/opengl/EGLSurface;

    move-result-object p1

    const-string v0, "eglCreateWindowSurface"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/renderer/egl/EGLCore;->checkEglErrorAndNotify(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-nez v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglNoSurface:Landroid/opengl/EGLSurface;

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_2
    const-string p1, "eglConfig"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    iget-object v0, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->TAG:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "eglCreateWindowSurface has thrown an exception:\n"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglNoSurface:Landroid/opengl/EGLSurface;

    return-object p1
.end method

.method public final getEglContext$maps_sdk_release()Landroid/opengl/EGLContext;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglContext:Landroid/opengl/EGLContext;

    return-object v0
.end method

.method public final getEglNoSurface$maps_sdk_release()Landroid/opengl/EGLSurface;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglNoSurface:Landroid/opengl/EGLSurface;

    return-object v0
.end method

.method public final makeCurrent(Landroid/opengl/EGLSurface;)Z
    .locals 3

    const-string v0, "eglSurface"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroid/opengl/EGL14;->eglGetCurrentContext()Landroid/opengl/EGLContext;

    move-result-object v0

    iget-object v1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglContext:Landroid/opengl/EGLContext;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglDisplay:Landroid/opengl/EGLDisplay;

    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->TAG:Ljava/lang/String;

    const-string v2, "NOTE: makeCurrent but eglDisplay is EGL_NO_DISPLAY"

    invoke-static {v0, v2}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglDisplay:Landroid/opengl/EGLDisplay;

    iget-object v2, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglContext:Landroid/opengl/EGLContext;

    invoke-static {v0, p1, p1, v2}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    move-result p1

    if-nez p1, :cond_2

    const-string p1, "eglMakeCurrent"

    invoke-direct {p0, p1}, Lcom/mapbox/maps/renderer/egl/EGLCore;->checkEglErrorAndNotify(Ljava/lang/String;)Ljava/lang/Integer;

    const/4 p1, 0x0

    return p1

    :cond_2
    return v1
.end method

.method public final makeNothingCurrent()Z
    .locals 3

    iget-object v0, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglDisplay:Landroid/opengl/EGLDisplay;

    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    invoke-static {v0, v1, v1, v2}, Landroid/opengl/EGL14;->eglMakeCurrent(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;Landroid/opengl/EGLSurface;Landroid/opengl/EGLContext;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "makeNothingCurrent"

    invoke-direct {p0, v0}, Lcom/mapbox/maps/renderer/egl/EGLCore;->checkEglErrorAndNotify(Ljava/lang/String;)Ljava/lang/Integer;

    const/4 v0, 0x0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final prepareEgl()Z
    .locals 6

    const/4 v0, 0x0

    invoke-static {v0}, Landroid/opengl/EGL14;->eglGetDisplay(I)Landroid/opengl/EGLDisplay;

    move-result-object v1

    const-string v2, "eglGetDisplay(EGL14.EGL_DEFAULT_DISPLAY)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglDisplay:Landroid/opengl/EGLDisplay;

    sget-object v2, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->TAG:Ljava/lang/String;

    const-string v2, "Unable to get default display, eglInitialize will most likely fail shortly."

    invoke-static {v1, v2}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/4 v1, 0x2

    new-array v1, v1, [I

    iget-object v2, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglDisplay:Landroid/opengl/EGLDisplay;

    const/4 v3, 0x1

    invoke-static {v2, v1, v0, v1, v3}, Landroid/opengl/EGL14;->eglInitialize(Landroid/opengl/EGLDisplay;[II[II)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "eglInitialize"

    invoke-direct {p0, v1}, Lcom/mapbox/maps/renderer/egl/EGLCore;->checkEglErrorAndNotify(Ljava/lang/String;)Ljava/lang/Integer;

    return v0

    :cond_1
    new-instance v1, Lcom/mapbox/maps/renderer/egl/EGLConfigChooser;

    iget-boolean v2, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->translucentSurface:Z

    iget v4, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->antialiasingSampleCount:I

    iget-object v5, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->mapName:Ljava/lang/String;

    invoke-direct {v1, v2, v4, v5}, Lcom/mapbox/maps/renderer/egl/EGLConfigChooser;-><init>(ZILjava/lang/String;)V

    iget-object v2, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglDisplay:Landroid/opengl/EGLDisplay;

    invoke-virtual {v1, v2}, Lcom/mapbox/maps/renderer/egl/EGLConfigChooser;->chooseConfig(Landroid/opengl/EGLDisplay;)Landroid/opengl/EGLConfig;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iput-object v1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglConfig:Landroid/opengl/EGLConfig;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    goto :goto_0

    :cond_2
    move-object v1, v2

    :goto_0
    if-nez v1, :cond_3

    sget-object v1, Lcom/mapbox/maps/renderer/RendererError;->NO_VALID_EGL_CONFIG_FOUND:Lcom/mapbox/maps/renderer/RendererError;

    invoke-direct {p0, v1}, Lcom/mapbox/maps/renderer/egl/EGLCore;->notifyListeners(Lcom/mapbox/maps/renderer/RendererError;)V

    return v0

    :cond_3
    iget-object v1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglDisplay:Landroid/opengl/EGLDisplay;

    iget-object v4, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglConfig:Landroid/opengl/EGLConfig;

    if-eqz v4, :cond_5

    iget-object v2, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->sharedContext:Landroid/opengl/EGLContext;

    sget-object v5, Lcom/mapbox/maps/renderer/egl/EGLCore;->attribsEgl3:[I

    invoke-static {v1, v4, v2, v5, v0}, Landroid/opengl/EGL14;->eglCreateContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLConfig;Landroid/opengl/EGLContext;[II)Landroid/opengl/EGLContext;

    move-result-object v0

    const-string v1, "eglCreateContext"

    invoke-direct {p0, v1}, Lcom/mapbox/maps/renderer/egl/EGLCore;->checkEglError(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    if-nez v1, :cond_4

    const-string v1, "{\n      contextEgl3\n    }"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglContext:Landroid/opengl/EGLContext;

    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/egl/EGLCore;->queryContextVersion()I

    move-result v0

    iget-object v1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->TAG:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "EGLContext created, client version "

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "OpenGL ES 3.0 context could not be created"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    const-string v0, "eglConfig"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method public final queryContextVersion()I
    .locals 5

    const/4 v0, 0x1

    new-array v0, v0, [I

    iget-object v1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglDisplay:Landroid/opengl/EGLDisplay;

    iget-object v2, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglContext:Landroid/opengl/EGLContext;

    const/16 v3, 0x3098

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v0, v4}, Landroid/opengl/EGL14;->eglQueryContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;I[II)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "eglQueryContext"

    invoke-direct {p0, v1}, Lcom/mapbox/maps/renderer/egl/EGLCore;->checkEglErrorAndNotify(Ljava/lang/String;)Ljava/lang/Integer;

    :cond_0
    aget v0, v0, v4

    return v0
.end method

.method public final release()V
    .locals 2

    iget-object v0, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglDisplay:Landroid/opengl/EGLDisplay;

    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/mapbox/maps/renderer/egl/EGLCore;->makeNothingCurrent()Z

    iget-object v0, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglDisplay:Landroid/opengl/EGLDisplay;

    iget-object v1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglContext:Landroid/opengl/EGLContext;

    invoke-static {v0, v1}, Landroid/opengl/EGL14;->eglDestroyContext(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLContext;)Z

    iget-object v0, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglDisplay:Landroid/opengl/EGLDisplay;

    invoke-static {v0}, Landroid/opengl/EGL14;->eglTerminate(Landroid/opengl/EGLDisplay;)Z

    :cond_0
    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    const-string v1, "EGL_NO_DISPLAY"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglDisplay:Landroid/opengl/EGLDisplay;

    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_CONTEXT:Landroid/opengl/EGLContext;

    const-string v1, "EGL_NO_CONTEXT"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglContext:Landroid/opengl/EGLContext;

    return-void
.end method

.method public final releaseSurface(Landroid/opengl/EGLSurface;)V
    .locals 2

    const-string v0, "eglSurface"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Landroid/opengl/EGL14;->EGL_NO_SURFACE:Landroid/opengl/EGLSurface;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglDisplay:Landroid/opengl/EGLDisplay;

    sget-object v1, Landroid/opengl/EGL14;->EGL_NO_DISPLAY:Landroid/opengl/EGLDisplay;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglDisplay:Landroid/opengl/EGLDisplay;

    invoke-static {v0, p1}, Landroid/opengl/EGL14;->eglDestroySurface(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    iget-object p1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->TAG:Ljava/lang/String;

    const-string v0, "EGL surface was destroyed."

    invoke-static {p1, v0}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->TAG:Ljava/lang/String;

    const-string v0, "EGL surface was already destroyed before."

    invoke-static {p1, v0}, Lcom/mapbox/maps/MapboxLogger;->logI(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final removeRendererStateListener$maps_sdk_release(Lcom/mapbox/maps/renderer/RendererSetupErrorListener;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->rendererSetupErrorListenerSet:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public final setEglContext$maps_sdk_release(Landroid/opengl/EGLContext;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglContext:Landroid/opengl/EGLContext;

    return-void
.end method

.method public final swapBuffers(Landroid/opengl/EGLSurface;)I
    .locals 1

    const-string v0, "eglSurface"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/renderer/egl/EGLCore;->eglDisplay:Landroid/opengl/EGLDisplay;

    invoke-static {v0, p1}, Landroid/opengl/EGL14;->eglSwapBuffers(Landroid/opengl/EGLDisplay;Landroid/opengl/EGLSurface;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {}, Landroid/opengl/EGL14;->eglGetError()I

    move-result p1

    return p1

    :cond_0
    const/16 p1, 0x3000

    return p1
.end method
