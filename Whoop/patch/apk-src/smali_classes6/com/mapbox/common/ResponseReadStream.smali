.class public final Lcom/mapbox/common/ResponseReadStream;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/ReadStream;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u000f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\u000bJ#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0008\"\u0004\u0008\u0018\u0010\u0019R\"\u0010\u001a\u001a\u00020\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u000b\"\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/mapbox/common/ResponseReadStream;",
        "Lcom/mapbox/common/ReadStream;",
        "Lne3/h;",
        "okioBuffer",
        "<init>",
        "(Lne3/h;)V",
        "",
        "readBytes",
        "()J",
        "",
        "isExhausted",
        "()Z",
        "isReadable",
        "Lcom/mapbox/common/Buffer;",
        "commonBuffer",
        "Lcom/mapbox/bindgen/Expected;",
        "",
        "read",
        "(Lcom/mapbox/common/Buffer;)Lcom/mapbox/bindgen/Expected;",
        "Lne3/h;",
        "getOkioBuffer",
        "()Lne3/h;",
        "J",
        "getReadBytes",
        "setReadBytes",
        "(J)V",
        "exhausted",
        "Z",
        "getExhausted",
        "setExhausted",
        "(Z)V",
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
.field private exhausted:Z

.field private final okioBuffer:Lne3/h;

.field private readBytes:J


# direct methods
.method public constructor <init>(Lne3/h;)V
    .locals 1

    const-string v0, "okioBuffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/mapbox/common/ResponseReadStream;->okioBuffer:Lne3/h;

    return-void
.end method


# virtual methods
.method public final getExhausted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mapbox/common/ResponseReadStream;->exhausted:Z

    return v0
.end method

.method public final getOkioBuffer()Lne3/h;
    .locals 1

    iget-object v0, p0, Lcom/mapbox/common/ResponseReadStream;->okioBuffer:Lne3/h;

    return-object v0
.end method

.method public final getReadBytes()J
    .locals 2

    iget-wide v0, p0, Lcom/mapbox/common/ResponseReadStream;->readBytes:J

    return-wide v0
.end method

.method public isExhausted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/mapbox/common/ResponseReadStream;->exhausted:Z

    return v0
.end method

.method public isReadable()Z
    .locals 4

    iget-object v0, p0, Lcom/mapbox/common/ResponseReadStream;->okioBuffer:Lne3/h;

    iget-wide v0, v0, Lne3/h;->x:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public read(Lcom/mapbox/common/Buffer;)Lcom/mapbox/bindgen/Expected;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/common/Buffer;",
            ")",
            "Lcom/mapbox/bindgen/Expected<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    const-string v0, "commonBuffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p1}, Lcom/mapbox/common/Buffer;->getData()Lcom/mapbox/bindgen/DataRef;

    move-result-object p1

    invoke-virtual {p1}, Lcom/mapbox/bindgen/DataRef;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v0, "commonBuffer.data.buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lcom/mapbox/common/ResponseReadStream;->isReadable()Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v3, "createValue(totalRead)"

    if-eqz v2, :cond_1

    :try_start_1
    invoke-virtual {p1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/mapbox/common/ResponseReadStream;->okioBuffer:Lne3/h;

    invoke-virtual {v2, p1}, Lne3/h;->read(Ljava/nio/ByteBuffer;)I

    move-result v2

    const/4 v4, -0x1

    if-ne v2, v4, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/mapbox/common/ResponseReadStream;->exhausted:Z

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {p1}, Lcom/mapbox/bindgen/ExpectedFactory;->createValue(Ljava/lang/Object;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    int-to-long v2, v2

    add-long/2addr v0, v2

    iget-wide v4, p0, Lcom/mapbox/common/ResponseReadStream;->readBytes:J

    add-long/2addr v4, v2

    iput-wide v4, p0, Lcom/mapbox/common/ResponseReadStream;->readBytes:J

    goto :goto_0

    :cond_1
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {p1}, Lcom/mapbox/bindgen/ExpectedFactory;->createValue(Ljava/lang/Object;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_1
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    const-string p1, "Unknown stream error"

    :cond_2
    invoke-static {p1}, Lcom/mapbox/bindgen/ExpectedFactory;->createError(Ljava/lang/Object;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "createError(e.message ?: \"Unknown stream error\")"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public readBytes()J
    .locals 2

    iget-wide v0, p0, Lcom/mapbox/common/ResponseReadStream;->readBytes:J

    return-wide v0
.end method

.method public final setExhausted(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/mapbox/common/ResponseReadStream;->exhausted:Z

    return-void
.end method

.method public final setReadBytes(J)V
    .locals 0

    iput-wide p1, p0, Lcom/mapbox/common/ResponseReadStream;->readBytes:J

    return-void
.end method
