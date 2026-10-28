.class public final Lcom/mapbox/maps/StyleObserver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/maps/StyleLoadedCallback;
.implements Lcom/mapbox/maps/MapLoadingErrorCallback;
.implements Lcom/mapbox/maps/StyleDataLoadedCallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/maps/StyleObserver$Companion;,
        Lcom/mapbox/maps/StyleObserver$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0001\u0018\u0000 ;2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001;B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J7\u0010\u0018\u001a\u00020\u00102\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u00062\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020!H\u0016\u00a2\u0006\u0004\u0008\u001f\u0010\"J\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020#H\u0016\u00a2\u0006\u0004\u0008\u001f\u0010$J\r\u0010%\u001a\u00020\u0010\u00a2\u0006\u0004\u0008%\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\'R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010)R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008+\u0010\'R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\'R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\'R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\'R\u001a\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00060,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0018\u00102\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00082\u00101R&\u00104\u001a\u0008\u0012\u0004\u0012\u0002030,8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u00084\u0010.\u0012\u0004\u00087\u0010\u0012\u001a\u0004\u00085\u00106R\u0014\u00109\u001a\u0002088BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00089\u0010:\u00a8\u0006<"
    }
    d2 = {
        "Lcom/mapbox/maps/StyleObserver;",
        "Lcom/mapbox/maps/StyleLoadedCallback;",
        "Lcom/mapbox/maps/MapLoadingErrorCallback;",
        "Lcom/mapbox/maps/StyleDataLoadedCallback;",
        "Lcom/mapbox/maps/StyleManager;",
        "styleManager",
        "Lcom/mapbox/maps/Style$OnStyleLoaded;",
        "styleLoadedListener",
        "Lcom/mapbox/maps/NativeObserver;",
        "nativeObserver",
        "",
        "pixelRatio",
        "Lcom/mapbox/maps/MapLoadingErrorDelegate;",
        "mapLoadingErrorDelegate",
        "<init>",
        "(Lcom/mapbox/maps/StyleManager;Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/NativeObserver;FLcom/mapbox/maps/MapLoadingErrorDelegate;)V",
        "Ll83/a0;",
        "onStyleSourcesReady",
        "()V",
        "onStyleSpritesReady",
        "userOnStyleLoaded",
        "styleDataStyleLoadedListener",
        "styleDataSpritesLoadedListener",
        "styleDataSourcesLoadedListener",
        "setLoadStyleListener",
        "(Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/Style$OnStyleLoaded;)V",
        "loadedListener",
        "addGetStyleListener",
        "(Lcom/mapbox/maps/Style$OnStyleLoaded;)V",
        "Lcom/mapbox/maps/StyleLoaded;",
        "eventData",
        "run",
        "(Lcom/mapbox/maps/StyleLoaded;)V",
        "Lcom/mapbox/maps/MapLoadingError;",
        "(Lcom/mapbox/maps/MapLoadingError;)V",
        "Lcom/mapbox/maps/StyleDataLoaded;",
        "(Lcom/mapbox/maps/StyleDataLoaded;)V",
        "onDestroy",
        "Lcom/mapbox/maps/StyleManager;",
        "Lcom/mapbox/maps/Style$OnStyleLoaded;",
        "Lcom/mapbox/maps/NativeObserver;",
        "F",
        "Lcom/mapbox/maps/MapLoadingErrorDelegate;",
        "userStyleLoadedListener",
        "Ljava/util/concurrent/CopyOnWriteArraySet;",
        "getStyleListeners",
        "Ljava/util/concurrent/CopyOnWriteArraySet;",
        "Lcom/mapbox/maps/Style;",
        "loadedStyle",
        "Lcom/mapbox/maps/Style;",
        "preLoadedStyle",
        "Lcom/mapbox/common/Cancelable;",
        "cancelableList",
        "getCancelableList",
        "()Ljava/util/concurrent/CopyOnWriteArraySet;",
        "getCancelableList$annotations",
        "",
        "isWaitingStyleDataStyleEvent",
        "()Z",
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
.field public static final Companion:Lcom/mapbox/maps/StyleObserver$Companion;

.field public static final TAG:Ljava/lang/String; = "Mbgl-StyleObserver"


# instance fields
.field private final cancelableList:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lcom/mapbox/common/Cancelable;",
            ">;"
        }
    .end annotation
.end field

.field private final getStyleListeners:Ljava/util/concurrent/CopyOnWriteArraySet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lcom/mapbox/maps/Style$OnStyleLoaded;",
            ">;"
        }
    .end annotation
.end field

.field private loadedStyle:Lcom/mapbox/maps/Style;

.field private final mapLoadingErrorDelegate:Lcom/mapbox/maps/MapLoadingErrorDelegate;

.field private final nativeObserver:Lcom/mapbox/maps/NativeObserver;

.field private final pixelRatio:F

.field private preLoadedStyle:Lcom/mapbox/maps/Style;

.field private styleDataSourcesLoadedListener:Lcom/mapbox/maps/Style$OnStyleLoaded;

.field private styleDataSpritesLoadedListener:Lcom/mapbox/maps/Style$OnStyleLoaded;

.field private styleDataStyleLoadedListener:Lcom/mapbox/maps/Style$OnStyleLoaded;

.field private final styleLoadedListener:Lcom/mapbox/maps/Style$OnStyleLoaded;

.field private final styleManager:Lcom/mapbox/maps/StyleManager;

.field private userStyleLoadedListener:Lcom/mapbox/maps/Style$OnStyleLoaded;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/maps/StyleObserver$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/maps/StyleObserver$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/maps/StyleObserver;->Companion:Lcom/mapbox/maps/StyleObserver$Companion;

    return-void
.end method

.method public constructor <init>(Lcom/mapbox/maps/StyleManager;Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/NativeObserver;FLcom/mapbox/maps/MapLoadingErrorDelegate;)V
    .locals 6

    const-string v0, "styleManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "styleLoadedListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nativeObserver"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mapLoadingErrorDelegate"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/StyleObserver;->styleManager:Lcom/mapbox/maps/StyleManager;

    iput-object p2, p0, Lcom/mapbox/maps/StyleObserver;->styleLoadedListener:Lcom/mapbox/maps/Style$OnStyleLoaded;

    iput-object p3, p0, Lcom/mapbox/maps/StyleObserver;->nativeObserver:Lcom/mapbox/maps/NativeObserver;

    iput p4, p0, Lcom/mapbox/maps/StyleObserver;->pixelRatio:F

    iput-object p5, p0, Lcom/mapbox/maps/StyleObserver;->mapLoadingErrorDelegate:Lcom/mapbox/maps/MapLoadingErrorDelegate;

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/StyleObserver;->getStyleListeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    new-instance p1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/StyleObserver;->cancelableList:Ljava/util/concurrent/CopyOnWriteArraySet;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v0, p3

    invoke-static/range {v0 .. v5}, Lcom/mapbox/maps/NativeObserver;->subscribeStyleLoaded$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/StyleLoadedCallback;Lc93/a;Lnv/m;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    invoke-static/range {v0 .. v5}, Lcom/mapbox/maps/NativeObserver;->subscribeMapLoadingError$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/MapLoadingErrorCallback;Lc93/a;Lnv/c;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    invoke-static/range {v0 .. v5}, Lcom/mapbox/maps/NativeObserver;->subscribeStyleDataLoaded$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/StyleDataLoadedCallback;Lc93/a;Lnv/j;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic getCancelableList$annotations()V
    .locals 0

    return-void
.end method

.method private final isWaitingStyleDataStyleEvent()Z
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/StyleObserver;->styleDataStyleLoadedListener:Lcom/mapbox/maps/Style$OnStyleLoaded;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final onStyleSourcesReady()V
    .locals 3

    iget-object v0, p0, Lcom/mapbox/maps/StyleObserver;->styleDataSourcesLoadedListener:Lcom/mapbox/maps/Style$OnStyleLoaded;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/mapbox/maps/StyleObserver;->styleDataSourcesLoadedListener:Lcom/mapbox/maps/Style$OnStyleLoaded;

    iget-object v2, p0, Lcom/mapbox/maps/StyleObserver;->preLoadedStyle:Lcom/mapbox/maps/Style;

    if-eqz v2, :cond_0

    invoke-interface {v0, v2}, Lcom/mapbox/maps/Style$OnStyleLoaded;->onStyleLoaded(Lcom/mapbox/maps/Style;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :cond_0
    if-nez v1, :cond_1

    const-string v0, "Mbgl-StyleObserver"

    const-string v1, "Style is not initialized yet although SOURCES event has arrived!"

    invoke-static {v0, v1}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method private final onStyleSpritesReady()V
    .locals 3

    iget-object v0, p0, Lcom/mapbox/maps/StyleObserver;->styleDataSpritesLoadedListener:Lcom/mapbox/maps/Style$OnStyleLoaded;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/mapbox/maps/StyleObserver;->styleDataSpritesLoadedListener:Lcom/mapbox/maps/Style$OnStyleLoaded;

    iget-object v2, p0, Lcom/mapbox/maps/StyleObserver;->preLoadedStyle:Lcom/mapbox/maps/Style;

    if-eqz v2, :cond_0

    invoke-interface {v0, v2}, Lcom/mapbox/maps/Style$OnStyleLoaded;->onStyleLoaded(Lcom/mapbox/maps/Style;)V

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :cond_0
    if-nez v1, :cond_1

    const-string v0, "Mbgl-StyleObserver"

    const-string v1, "Style is not initialized yet although SPRITES event has arrived!"

    invoke-static {v0, v1}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public static synthetic setLoadStyleListener$default(Lcom/mapbox/maps/StyleObserver;Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/Style$OnStyleLoaded;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move-object p4, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/mapbox/maps/StyleObserver;->setLoadStyleListener(Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/Style$OnStyleLoaded;)V

    return-void
.end method


# virtual methods
.method public final addGetStyleListener(Lcom/mapbox/maps/Style$OnStyleLoaded;)V
    .locals 1

    const-string v0, "loadedListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/StyleObserver;->getStyleListeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final getCancelableList()Ljava/util/concurrent/CopyOnWriteArraySet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/CopyOnWriteArraySet<",
            "Lcom/mapbox/common/Cancelable;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/mapbox/maps/StyleObserver;->cancelableList:Ljava/util/concurrent/CopyOnWriteArraySet;

    return-object v0
.end method

.method public final onDestroy()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/mapbox/maps/StyleObserver;->userStyleLoadedListener:Lcom/mapbox/maps/Style$OnStyleLoaded;

    iput-object v0, p0, Lcom/mapbox/maps/StyleObserver;->styleDataStyleLoadedListener:Lcom/mapbox/maps/Style$OnStyleLoaded;

    iput-object v0, p0, Lcom/mapbox/maps/StyleObserver;->styleDataSpritesLoadedListener:Lcom/mapbox/maps/Style$OnStyleLoaded;

    iput-object v0, p0, Lcom/mapbox/maps/StyleObserver;->styleDataSourcesLoadedListener:Lcom/mapbox/maps/Style$OnStyleLoaded;

    iget-object v1, p0, Lcom/mapbox/maps/StyleObserver;->preLoadedStyle:Lcom/mapbox/maps/Style;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/mapbox/maps/Style;->markInvalid$maps_sdk_release()V

    :cond_0
    iput-object v0, p0, Lcom/mapbox/maps/StyleObserver;->preLoadedStyle:Lcom/mapbox/maps/Style;

    iget-object v1, p0, Lcom/mapbox/maps/StyleObserver;->loadedStyle:Lcom/mapbox/maps/Style;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/mapbox/maps/Style;->markInvalid$maps_sdk_release()V

    :cond_1
    iput-object v0, p0, Lcom/mapbox/maps/StyleObserver;->loadedStyle:Lcom/mapbox/maps/Style;

    iget-object v0, p0, Lcom/mapbox/maps/StyleObserver;->getStyleListeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    iget-object v0, p0, Lcom/mapbox/maps/StyleObserver;->cancelableList:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mapbox/common/Cancelable;

    invoke-interface {v1}, Lcom/mapbox/common/Cancelable;->cancel()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/mapbox/maps/StyleObserver;->cancelableList:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    return-void
.end method

.method public run(Lcom/mapbox/maps/MapLoadingError;)V
    .locals 2

    const-string v0, "eventData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "OnMapLoadError: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/maps/MapLoadingError;->getType()Lcom/mapbox/maps/MapLoadingErrorType;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", message: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/mapbox/maps/MapLoadingError;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sourceID: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/mapbox/maps/MapLoadingError;->getSourceId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", tileID: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/mapbox/maps/MapLoadingError;->getTileId()Lcom/mapbox/maps/CanonicalTileID;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 15
    const-string v0, "Mbgl-StyleObserver"

    invoke-static {v0, p1}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public run(Lcom/mapbox/maps/StyleDataLoaded;)V
    .locals 3

    const-string v0, "eventData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-virtual {p1}, Lcom/mapbox/maps/StyleDataLoaded;->getType()Lcom/mapbox/maps/StyleDataLoadedType;

    move-result-object p1

    sget-object v0, Lcom/mapbox/maps/StyleObserver$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    const/4 v0, 0x3

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 17
    :cond_0
    invoke-direct {p0}, Lcom/mapbox/maps/StyleObserver;->isWaitingStyleDataStyleEvent()Z

    move-result p1

    if-nez p1, :cond_2

    .line 18
    invoke-direct {p0}, Lcom/mapbox/maps/StyleObserver;->onStyleSourcesReady()V

    return-void

    .line 19
    :cond_1
    invoke-direct {p0}, Lcom/mapbox/maps/StyleObserver;->isWaitingStyleDataStyleEvent()Z

    move-result p1

    if-nez p1, :cond_2

    .line 20
    invoke-direct {p0}, Lcom/mapbox/maps/StyleObserver;->onStyleSpritesReady()V

    :cond_2
    :goto_0
    return-void

    .line 21
    :cond_3
    new-instance p1, Lcom/mapbox/maps/Style;

    iget-object v0, p0, Lcom/mapbox/maps/StyleObserver;->styleManager:Lcom/mapbox/maps/StyleManager;

    iget v1, p0, Lcom/mapbox/maps/StyleObserver;->pixelRatio:F

    iget-object v2, p0, Lcom/mapbox/maps/StyleObserver;->mapLoadingErrorDelegate:Lcom/mapbox/maps/MapLoadingErrorDelegate;

    invoke-direct {p1, v0, v1, v2}, Lcom/mapbox/maps/Style;-><init>(Lcom/mapbox/maps/StyleManager;FLcom/mapbox/maps/MapLoadingErrorDelegate;)V

    .line 22
    iget-object v0, p0, Lcom/mapbox/maps/StyleObserver;->styleDataStyleLoadedListener:Lcom/mapbox/maps/Style$OnStyleLoaded;

    if-eqz v0, :cond_4

    invoke-interface {v0, p1}, Lcom/mapbox/maps/Style$OnStyleLoaded;->onStyleLoaded(Lcom/mapbox/maps/Style;)V

    .line 23
    :cond_4
    iput-object p1, p0, Lcom/mapbox/maps/StyleObserver;->preLoadedStyle:Lcom/mapbox/maps/Style;

    const/4 p1, 0x0

    .line 24
    iput-object p1, p0, Lcom/mapbox/maps/StyleObserver;->styleDataStyleLoadedListener:Lcom/mapbox/maps/Style$OnStyleLoaded;

    return-void
.end method

.method public run(Lcom/mapbox/maps/StyleLoaded;)V
    .locals 2

    const-string v0, "eventData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p0, Lcom/mapbox/maps/StyleObserver;->loadedStyle:Lcom/mapbox/maps/Style;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/mapbox/maps/Style;->markInvalid$maps_sdk_release()V

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/mapbox/maps/StyleObserver;->preLoadedStyle:Lcom/mapbox/maps/Style;

    iput-object p1, p0, Lcom/mapbox/maps/StyleObserver;->loadedStyle:Lcom/mapbox/maps/Style;

    if-eqz p1, :cond_3

    .line 3
    invoke-direct {p0}, Lcom/mapbox/maps/StyleObserver;->onStyleSpritesReady()V

    .line 4
    invoke-direct {p0}, Lcom/mapbox/maps/StyleObserver;->onStyleSourcesReady()V

    .line 5
    iget-object v0, p0, Lcom/mapbox/maps/StyleObserver;->styleLoadedListener:Lcom/mapbox/maps/Style$OnStyleLoaded;

    invoke-interface {v0, p1}, Lcom/mapbox/maps/Style$OnStyleLoaded;->onStyleLoaded(Lcom/mapbox/maps/Style;)V

    .line 6
    iget-object v0, p0, Lcom/mapbox/maps/StyleObserver;->userStyleLoadedListener:Lcom/mapbox/maps/Style$OnStyleLoaded;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 7
    iput-object v1, p0, Lcom/mapbox/maps/StyleObserver;->userStyleLoadedListener:Lcom/mapbox/maps/Style$OnStyleLoaded;

    .line 8
    invoke-interface {v0, p1}, Lcom/mapbox/maps/Style$OnStyleLoaded;->onStyleLoaded(Lcom/mapbox/maps/Style;)V

    .line 9
    :cond_1
    iget-object v0, p0, Lcom/mapbox/maps/StyleObserver;->getStyleListeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 10
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/mapbox/maps/Style$OnStyleLoaded;

    .line 11
    invoke-interface {v1, p1}, Lcom/mapbox/maps/Style$OnStyleLoaded;->onStyleLoaded(Lcom/mapbox/maps/Style;)V

    goto :goto_0

    .line 12
    :cond_2
    iget-object p1, p0, Lcom/mapbox/maps/StyleObserver;->getStyleListeners:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArraySet;->clear()V

    return-void

    .line 13
    :cond_3
    new-instance p1, Lcom/mapbox/maps/MapboxMapException;

    const-string v0, "Style is not initialized on onStyleLoaded callback!"

    invoke-direct {p1, v0}, Lcom/mapbox/maps/MapboxMapException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setLoadStyleListener(Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/Style$OnStyleLoaded;Lcom/mapbox/maps/Style$OnStyleLoaded;)V
    .locals 1

    const-string v0, "styleDataStyleLoadedListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/StyleObserver;->nativeObserver:Lcom/mapbox/maps/NativeObserver;

    invoke-virtual {v0}, Lcom/mapbox/maps/NativeObserver;->resubscribeStyleLoadListeners()V

    iput-object p1, p0, Lcom/mapbox/maps/StyleObserver;->userStyleLoadedListener:Lcom/mapbox/maps/Style$OnStyleLoaded;

    iput-object p2, p0, Lcom/mapbox/maps/StyleObserver;->styleDataStyleLoadedListener:Lcom/mapbox/maps/Style$OnStyleLoaded;

    iput-object p3, p0, Lcom/mapbox/maps/StyleObserver;->styleDataSpritesLoadedListener:Lcom/mapbox/maps/Style$OnStyleLoaded;

    iput-object p4, p0, Lcom/mapbox/maps/StyleObserver;->styleDataSourcesLoadedListener:Lcom/mapbox/maps/Style$OnStyleLoaded;

    return-void
.end method
