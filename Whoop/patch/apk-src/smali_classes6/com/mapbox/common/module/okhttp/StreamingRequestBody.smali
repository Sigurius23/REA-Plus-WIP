.class public final Lcom/mapbox/common/module/okhttp/StreamingRequestBody;
.super Lud3/v0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0008R\u0017\u0010\u001a\u001a\u00020\u00198\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/mapbox/common/module/okhttp/StreamingRequestBody;",
        "Lud3/v0;",
        "Lcom/mapbox/common/ReadStream;",
        "inputStream",
        "Lud3/h0;",
        "contentType",
        "<init>",
        "(Lcom/mapbox/common/ReadStream;Lud3/h0;)V",
        "()Lud3/h0;",
        "",
        "isOneShot",
        "()Z",
        "",
        "contentLength",
        "()J",
        "Lne3/i;",
        "sink",
        "Ll83/a0;",
        "writeTo",
        "(Lne3/i;)V",
        "Lcom/mapbox/common/ReadStream;",
        "getInputStream",
        "()Lcom/mapbox/common/ReadStream;",
        "Lud3/h0;",
        "getContentType",
        "Lne3/h;",
        "buffer",
        "Lne3/h;",
        "getBuffer",
        "()Lne3/h;",
        "common_release"
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
.field private final buffer:Lne3/h;

.field private final contentType:Lud3/h0;

.field private final inputStream:Lcom/mapbox/common/ReadStream;


# direct methods
.method public constructor <init>(Lcom/mapbox/common/ReadStream;Lud3/h0;)V
    .locals 2

    const-string v0, "inputStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/common/module/okhttp/StreamingRequestBody;->inputStream:Lcom/mapbox/common/ReadStream;

    iput-object p2, p0, Lcom/mapbox/common/module/okhttp/StreamingRequestBody;->contentType:Lud3/h0;

    new-instance p1, Lne3/h;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/common/module/okhttp/StreamingRequestBody;->buffer:Lne3/h;

    const/16 p1, 0x1000

    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    new-instance p2, Lcom/mapbox/common/Buffer;

    new-instance v0, Lcom/mapbox/bindgen/DataRef;

    invoke-direct {v0, p1}, Lcom/mapbox/bindgen/DataRef;-><init>(Ljava/nio/ByteBuffer;)V

    invoke-direct {p2, v0}, Lcom/mapbox/common/Buffer;-><init>(Lcom/mapbox/bindgen/DataRef;)V

    :goto_0
    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/StreamingRequestBody;->inputStream:Lcom/mapbox/common/ReadStream;

    invoke-interface {v0}, Lcom/mapbox/common/ReadStream;->isExhausted()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/StreamingRequestBody;->inputStream:Lcom/mapbox/common/ReadStream;

    invoke-interface {v0, p2}, Lcom/mapbox/common/ReadStream;->read(Lcom/mapbox/common/Buffer;)Lcom/mapbox/bindgen/Expected;

    move-result-object v0

    const-string v1, "inputStream.read(commonBuffer)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/mapbox/bindgen/Expected;->isValue()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/StreamingRequestBody;->buffer:Lne3/h;

    invoke-virtual {v0, p1}, Lne3/h;->write(Ljava/nio/ByteBuffer;)I

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {v0}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p2, Ljava/lang/String;

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/StreamingRequestBody;->buffer:Lne3/h;

    iget-wide v0, v0, Lne3/h;->x:J

    return-wide v0
.end method

.method public contentType()Lud3/h0;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/StreamingRequestBody;->contentType:Lud3/h0;

    return-object v0
.end method

.method public final getBuffer()Lne3/h;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/StreamingRequestBody;->buffer:Lne3/h;

    return-object v0
.end method

.method public final getContentType()Lud3/h0;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/StreamingRequestBody;->contentType:Lud3/h0;

    return-object v0
.end method

.method public final getInputStream()Lcom/mapbox/common/ReadStream;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/StreamingRequestBody;->inputStream:Lcom/mapbox/common/ReadStream;

    return-object v0
.end method

.method public isOneShot()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public writeTo(Lne3/i;)V
    .locals 1

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/mapbox/common/module/okhttp/StreamingRequestBody;->buffer:Lne3/h;

    invoke-virtual {v0}, Lne3/h;->i()Lne3/h;

    move-result-object v0

    invoke-interface {p1, v0}, Lne3/i;->N0(Lne3/p0;)J

    return-void
.end method
