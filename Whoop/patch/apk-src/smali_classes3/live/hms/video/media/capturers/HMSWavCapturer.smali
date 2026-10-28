.class public final Llive/hms/video/media/capturers/HMSWavCapturer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/media/capturers/HMSCapturer;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001aR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0017\u0010#\u001a\u00020\"8\u0006\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008#\u0010%R\u0014\u0010\'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(\u00a8\u0006)"
    }
    d2 = {
        "Llive/hms/video/media/capturers/HMSWavCapturer;",
        "Llive/hms/video/media/capturers/HMSCapturer;",
        "Landroid/content/Context;",
        "context",
        "",
        "sampleRate",
        "numChannels",
        "bitsPerSample",
        "<init>",
        "(Landroid/content/Context;III)V",
        "rawRes",
        "Ll83/a0;",
        "loadUrl",
        "(I)V",
        "Ljava/nio/ByteBuffer;",
        "destBuffer",
        "",
        "readNext10ms",
        "(Ljava/nio/ByteBuffer;)Z",
        "close",
        "()V",
        "start",
        "stop",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "I",
        "Ljava/io/InputStream;",
        "fileInputStream",
        "Ljava/io/InputStream;",
        "bytesPer10ms",
        "",
        "TAG",
        "Ljava/lang/String;",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "isStarted",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "()Ljava/util/concurrent/atomic/AtomicBoolean;",
        "",
        "lock",
        "Ljava/lang/Object;",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final TAG:Ljava/lang/String;

.field private final bitsPerSample:I

.field private bytesPer10ms:I

.field private final context:Landroid/content/Context;

.field private fileInputStream:Ljava/io/InputStream;

.field private final isStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final lock:Ljava/lang/Object;

.field private final numChannels:I

.field private final sampleRate:I


# direct methods
.method public constructor <init>(Landroid/content/Context;III)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->context:Landroid/content/Context;

    .line 3
    iput p2, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->sampleRate:I

    .line 4
    iput p3, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->numChannels:I

    .line 5
    iput p4, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->bitsPerSample:I

    const/4 p1, -0x1

    .line 6
    iput p1, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->bytesPer10ms:I

    .line 7
    const-string p1, "HMSWavCapturer"

    iput-object p1, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->TAG:Ljava/lang/String;

    .line 8
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->isStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->lock:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const/4 p3, 0x1

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const/16 p4, 0x10

    .line 10
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Llive/hms/video/media/capturers/HMSWavCapturer;-><init>(Landroid/content/Context;III)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->TAG:Ljava/lang/String;

    const-string v2, "close"

    invoke-static {v1, v2}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->isStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v1, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->fileInputStream:Ljava/io/InputStream;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    :try_start_2
    invoke-static {v1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :catchall_1
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public dispose()V
    .locals 0

    invoke-static {p0}, Llive/hms/video/media/capturers/HMSCapturer$DefaultImpls;->dispose(Llive/hms/video/media/capturers/HMSCapturer;)V

    return-void
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->context:Landroid/content/Context;

    return-object v0
.end method

.method public final isStarted()Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->isStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object v0
.end method

.method public final loadUrl(I)V
    .locals 7

    const-string v0, "Failed to open raw resource for resource id: "

    iget-object v1, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->lock:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->TAG:Ljava/lang/String;

    const-string v3, "loadUrl"

    invoke-static {v2, v3}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->isStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v2, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->fileInputStream:Ljava/io/InputStream;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v2

    :try_start_2
    invoke-static {v2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    :cond_0
    :goto_0
    iget-object v2, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object v2

    iput-object v2, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->fileInputStream:Ljava/io/InputStream;

    if-eqz v2, :cond_3

    const-wide/16 v3, 0x2c

    invoke-virtual {v2, v3, v4}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v5

    cmp-long p1, v5, v3

    const/4 v0, 0x0

    if-ltz p1, :cond_2

    iget p1, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->sampleRate:I

    iget v2, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->bitsPerSample:I

    div-int/lit8 v2, v2, 0x8

    mul-int/2addr p1, v2

    iget v2, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->numChannels:I

    mul-int/2addr p1, v2

    mul-int/lit8 p1, p1, 0xa

    div-int/lit16 p1, p1, 0x3e8

    iput p1, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->bytesPer10ms:I

    if-lez p1, :cond_1

    iget-object p1, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->TAG:Ljava/lang/String;

    const-string v0, "WAV file loaded successfully."

    invoke-static {p1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v1

    return-void

    :catchall_1
    move-exception p1

    goto :goto_1

    :cond_1
    :try_start_3
    iget-object p1, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->isStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object p1, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->TAG:Ljava/lang/String;

    const-string v0, "Invalid WAV file: bytesPer10ms <= 0"

    invoke-static {p1, v0}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Invalid WAV file: bytesPer10ms <= 0"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->isStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object p1, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->TAG:Ljava/lang/String;

    const-string v0, "Invalid or corrupt WAV file (header too short)."

    invoke-static {p1, v0}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid or corrupt WAV file: header too short"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_1
    monitor-exit v1

    throw p1
.end method

.method public final readNext10ms(Ljava/nio/ByteBuffer;)Z
    .locals 5

    const-string v0, "destBuffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->lock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->isStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    iget-object p1, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->TAG:Ljava/lang/String;

    const-string v1, "WAV file not loaded."

    invoke-static {p1, v1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return v2

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    iget v1, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->bytesPer10ms:I

    new-array v3, v1, [B

    iget-object v4, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->fileInputStream:Ljava/io/InputStream;

    if-eqz v4, :cond_2

    invoke-virtual {v4, v3, v2, v1}, Ljava/io/InputStream;->read([BII)I

    move-result v1

    iget v4, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->bytesPer10ms:I

    if-ge v1, v4, :cond_1

    iget-object p1, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->TAG:Ljava/lang/String;

    const-string v1, "End of WAV file reached."

    invoke-static {p1, v1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Llive/hms/video/media/capturers/HMSWavCapturer;->isStarted:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return v2

    :cond_1
    :try_start_2
    invoke-virtual {p1, v3}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    const/4 p1, 0x1

    return p1

    :cond_2
    monitor-exit v0

    return v2

    :goto_0
    monitor-exit v0

    throw p1
.end method

.method public start()V
    .locals 0

    return-void
.end method

.method public stop()V
    .locals 0

    return-void
.end method
