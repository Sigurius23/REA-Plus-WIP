.class public final Lcom/mapbox/common/module/cronet/CronetClientDetailKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\"\u001c\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/mapbox/common/ReadStream;",
        "Lne3/h;",
        "toOkioBuffer",
        "(Lcom/mapbox/common/ReadStream;)Lne3/h;",
        "Ljava/util/concurrent/ExecutorService;",
        "kotlin.jvm.PlatformType",
        "callbackExecutor",
        "Ljava/util/concurrent/ExecutorService;",
        "common_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field private static final callbackExecutor:Ljava/util/concurrent/ExecutorService;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/mapbox/common/module/cronet/CronetClientDetailKt;->callbackExecutor:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public static final synthetic access$getCallbackExecutor$p()Ljava/util/concurrent/ExecutorService;
    .locals 1

    sget-object v0, Lcom/mapbox/common/module/cronet/CronetClientDetailKt;->callbackExecutor:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public static final synthetic access$toOkioBuffer(Lcom/mapbox/common/ReadStream;)Lne3/h;
    .locals 0

    invoke-static {p0}, Lcom/mapbox/common/module/cronet/CronetClientDetailKt;->toOkioBuffer(Lcom/mapbox/common/ReadStream;)Lne3/h;

    move-result-object p0

    return-object p0
.end method

.method private static final toOkioBuffer(Lcom/mapbox/common/ReadStream;)Lne3/h;
    .locals 5

    new-instance v0, Lne3/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/16 v1, 0x1000

    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    new-instance v2, Lcom/mapbox/common/Buffer;

    new-instance v3, Lcom/mapbox/bindgen/DataRef;

    invoke-direct {v3, v1}, Lcom/mapbox/bindgen/DataRef;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-direct {v2, v3}, Lcom/mapbox/common/Buffer;-><init>(Lcom/mapbox/bindgen/DataRef;)V

    :goto_0
    invoke-interface {p0}, Lcom/mapbox/common/ReadStream;->isExhausted()Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    invoke-interface {p0, v2}, Lcom/mapbox/common/ReadStream;->read(Lcom/mapbox/common/Buffer;)Lcom/mapbox/bindgen/Expected;

    move-result-object v3

    const-string v4, "this.read(commonBuffer)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Lcom/mapbox/bindgen/Expected;->isValue()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v3}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    long-to-int v3, v3

    invoke-virtual {v1, v3}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    invoke-virtual {v0, v1}, Lne3/h;->write(Ljava/nio/ByteBuffer;)I

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/io/IOException;

    invoke-virtual {v3}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/String;

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-object v0
.end method
