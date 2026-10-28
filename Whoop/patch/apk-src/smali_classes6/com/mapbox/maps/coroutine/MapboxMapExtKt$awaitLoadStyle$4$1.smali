.class final synthetic Lcom/mapbox/maps/coroutine/MapboxMapExtKt$awaitLoadStyle$4$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/maps/Style$OnStyleLoaded;
.implements Lkotlin/jvm/internal/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/maps/coroutine/MapboxMapExtKt;->awaitLoadStyle(Lcom/mapbox/maps/MapboxMap;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $tmp0:Lq83/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq83/d<",
            "Lcom/mapbox/maps/Style;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/mapbox/maps/Style;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$awaitLoadStyle$4$1;->$tmp0:Lq83/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/mapbox/maps/Style$OnStyleLoaded;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    instance-of v0, p1, Lkotlin/jvm/internal/f;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$awaitLoadStyle$4$1;->getFunctionDelegate()Ll83/e;

    move-result-object v0

    check-cast p1, Lkotlin/jvm/internal/f;

    invoke-interface {p1}, Lkotlin/jvm/internal/f;->getFunctionDelegate()Ll83/e;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    return v1
.end method

.method public final getFunctionDelegate()Ll83/e;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ll83/e;"
        }
    .end annotation

    new-instance v0, Lkotlin/jvm/internal/i;

    iget-object v4, p0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$awaitLoadStyle$4$1;->$tmp0:Lq83/d;

    const-string v6, "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V"

    const/4 v2, 0x1

    const/4 v1, 0x1

    const-class v3, Lq83/g;

    const-string v5, "resume"

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-virtual {p0}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$awaitLoadStyle$4$1;->getFunctionDelegate()Ll83/e;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final onStyleLoaded(Lcom/mapbox/maps/Style;)V
    .locals 1

    const-string v0, "p0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$awaitLoadStyle$4$1;->$tmp0:Lq83/d;

    invoke-interface {v0, p1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
