.class public final synthetic Lcom/mapbox/maps/coroutine/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/maps/MapLoadingErrorCallback;


# instance fields
.field public final synthetic w:Ldc3/u;


# direct methods
.method public synthetic constructor <init>(Ldc3/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/maps/coroutine/b;->w:Ldc3/u;

    return-void
.end method


# virtual methods
.method public final run(Lcom/mapbox/maps/MapLoadingError;)V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/coroutine/b;->w:Ldc3/u;

    invoke-static {v0, p1}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$mapLoadingErrorEvents$1;->f(Ldc3/u;Lcom/mapbox/maps/MapLoadingError;)V

    return-void
.end method
