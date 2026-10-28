.class final synthetic Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleImageMissingEvents$1$cancelable$2;
.super Lkotlin/jvm/internal/a;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleImageMissingEvents$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/a;",
        "Lc93/a;"
    }
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


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 7

    const-string v6, "close(Ljava/lang/Throwable;)Z"

    const/16 v2, 0x8

    const/4 v1, 0x0

    const-class v3, Ldc3/x;

    const-string v5, "close"

    move-object v0, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/a;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$getReceiver$p(Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleImageMissingEvents$1$cancelable$2;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lkotlin/jvm/internal/a;->receiver:Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleImageMissingEvents$1$cancelable$2;->invoke()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    invoke-static {p0}, Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleImageMissingEvents$1$cancelable$2;->access$getReceiver$p(Lcom/mapbox/maps/coroutine/MapboxMapExtKt$styleImageMissingEvents$1$cancelable$2;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldc3/x;

    const/4 v1, 0x0

    .line 3
    invoke-interface {v0, v1}, Ldc3/x;->r(Ljava/lang/Throwable;)Z

    return-void
.end method
