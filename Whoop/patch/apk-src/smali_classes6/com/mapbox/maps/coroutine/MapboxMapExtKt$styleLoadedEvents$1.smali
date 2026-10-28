.class final Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleLoadedEvents$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/maps/coroutine/MapboxMapExtKt;->getStyleLoadedEvents(Lcom/mapbox/maps/MapboxMap;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Ldc3/u;",
        "Lcom/mapbox/maps/StyleLoaded;",
        "Ll83/a0;",
        "<anonymous>",
        "(Ldc3/u;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.mapbox.maps.coroutine.MapboxMapExtKt$styleLoadedEvents$1"
    f = "MapboxMapExt.kt"
    l = {
        0x11e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $this_styleLoadedEvents:Lcom/mapbox/maps/MapboxMap;

.field private synthetic L$0:Ljava/lang/Object;

.field label:I


# direct methods
.method public constructor <init>(Lcom/mapbox/maps/MapboxMap;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/MapboxMap;",
            "Lq83/d<",
            "-",
            "Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleLoadedEvents$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleLoadedEvents$1;->$this_styleLoadedEvents:Lcom/mapbox/maps/MapboxMap;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Ldc3/u;Lcom/mapbox/maps/StyleLoaded;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleLoadedEvents$1;->invokeSuspend$trySendBlocking(Ldc3/u;Lcom/mapbox/maps/StyleLoaded;)V

    return-void
.end method

.method private static final invokeSuspend$trySendBlocking(Ldc3/u;Lcom/mapbox/maps/StyleLoaded;)V
    .locals 0

    invoke-static {p0, p1}, Lvd/f;->X(Ldc3/x;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleLoadedEvents$1;

    iget-object v1, p0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleLoadedEvents$1;->$this_styleLoadedEvents:Lcom/mapbox/maps/MapboxMap;

    invoke-direct {v0, v1, p2}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleLoadedEvents$1;-><init>(Lcom/mapbox/maps/MapboxMap;Lq83/d;)V

    iput-object p1, v0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleLoadedEvents$1;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldc3/u;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleLoadedEvents$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleLoadedEvents$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleLoadedEvents$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ldc3/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleLoadedEvents$1;->invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleLoadedEvents$1;->label:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleLoadedEvents$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ldc3/u;

    iget-object v1, p0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleLoadedEvents$1;->$this_styleLoadedEvents:Lcom/mapbox/maps/MapboxMap;

    invoke-virtual {v1}, Lcom/mapbox/maps/MapboxMap;->getNativeObserver$maps_sdk_release()Lcom/mapbox/maps/NativeObserver;

    move-result-object v3

    new-instance v4, Lcom/mapbox/maps/coroutine/a;

    invoke-direct {v4, p1}, Lcom/mapbox/maps/coroutine/a;-><init>(Ldc3/u;)V

    new-instance v5, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleLoadedEvents$1$cancelable$2;

    move-object v1, p1

    check-cast v1, Ldc3/t;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {v5, v1}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleLoadedEvents$1$cancelable$2;-><init>(Ljava/lang/Object;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/mapbox/maps/NativeObserver;->subscribeStyleLoaded$default(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/StyleLoadedCallback;Lc93/a;Lnv/m;ILjava/lang/Object;)Lcom/mapbox/common/Cancelable;

    move-result-object v1

    new-instance v3, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleLoadedEvents$1$1;

    invoke-direct {v3, v1}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleLoadedEvents$1$1;-><init>(Ljava/lang/Object;)V

    iput v2, p0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleLoadedEvents$1;->label:I

    invoke-static {p1, v3, p0}, Lwb3/f;->h(Ldc3/u;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
