.class final Lcom/mapbox/maps/NativeObserver$subscribeMapLoadingError$1;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/maps/NativeObserver;->subscribeMapLoadingError(Lcom/mapbox/maps/MapLoadingErrorCallback;Lc93/a;Lnv/c;)Lcom/mapbox/common/Cancelable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/m;",
        "Lc93/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Ll83/a0;",
        "invoke",
        "()V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field final synthetic $mapLoadingErrorCallback:Lcom/mapbox/maps/MapLoadingErrorCallback;

.field final synthetic $onCancel:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/mapbox/maps/NativeObserver;


# direct methods
.method public constructor <init>(Lcom/mapbox/maps/NativeObserver;Lcom/mapbox/maps/MapLoadingErrorCallback;Lc93/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/NativeObserver;",
            "Lcom/mapbox/maps/MapLoadingErrorCallback;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/mapbox/maps/NativeObserver$subscribeMapLoadingError$1;->this$0:Lcom/mapbox/maps/NativeObserver;

    iput-object p2, p0, Lcom/mapbox/maps/NativeObserver$subscribeMapLoadingError$1;->$mapLoadingErrorCallback:Lcom/mapbox/maps/MapLoadingErrorCallback;

    iput-object p3, p0, Lcom/mapbox/maps/NativeObserver$subscribeMapLoadingError$1;->$onCancel:Lc93/a;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/mapbox/maps/NativeObserver$subscribeMapLoadingError$1;->invoke()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver$subscribeMapLoadingError$1;->this$0:Lcom/mapbox/maps/NativeObserver;

    invoke-static {v0}, Lcom/mapbox/maps/NativeObserver;->access$getMapLoadingErrorCallbackSet$p(Lcom/mapbox/maps/NativeObserver;)Ljava/util/concurrent/CopyOnWriteArraySet;

    move-result-object v0

    iget-object v1, p0, Lcom/mapbox/maps/NativeObserver$subscribeMapLoadingError$1;->$mapLoadingErrorCallback:Lcom/mapbox/maps/MapLoadingErrorCallback;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    .line 3
    iget-object v0, p0, Lcom/mapbox/maps/NativeObserver$subscribeMapLoadingError$1;->$onCancel:Lc93/a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method
