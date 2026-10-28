.class public final synthetic Le33/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/Loggable;
.implements Lorg/webrtc/audio/JavaAudioDeviceModule$SamplesReadyCallback;
.implements Lorg/webrtc/audio/JavaAudioDeviceModule$AudioBufferCallback;


# instance fields
.field public final synthetic a:Le33/j0;


# direct methods
.method public synthetic constructor <init>(Le33/j0;)V
    .locals 0

    iput-object p1, p0, Le33/v;->a:Le33/j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBuffer(Ljava/nio/ByteBuffer;IIIIJ)J
    .locals 2

    iget-object v0, p0, Le33/v;->a:Le33/j0;

    iget-object v1, v0, Le33/j0;->j:Lc2/q;

    if-eqz v1, :cond_0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, p2, p3, p4, p1}, Lc2/q;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    if-lez p5, :cond_5

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p2, v0, Le33/j0;->k:Ld33/q;

    if-eqz p2, :cond_1

    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p2, p3}, Ld33/q;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/nio/ByteBuffer;

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_5

    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    move-result p3

    if-lez p3, :cond_5

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p1, p3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-virtual {p2}, Ljava/nio/Buffer;->limit()I

    move-result p4

    div-int/lit8 p4, p4, 0x2

    new-array p5, p4, [S

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p2, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object p2

    invoke-virtual {p2, p5}, Ljava/nio/ShortBuffer;->get([S)Ljava/nio/ShortBuffer;

    iget-object p2, v0, Le33/j0;->l:Ld33/r;

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ld33/r;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    goto :goto_1

    :cond_2
    const/4 p2, 0x1

    :goto_1
    if-eqz p2, :cond_3

    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result p2

    div-int/lit8 p2, p2, 0x2

    new-array p3, p2, [S

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->asShortBuffer()Ljava/nio/ShortBuffer;

    move-result-object v0

    invoke-virtual {v0, p3}, Ljava/nio/ShortBuffer;->get([S)Ljava/nio/ShortBuffer;

    invoke-static {p3, p2, p5, p4}, Luf/c0;->A([SI[SI)Ljava/nio/ByteBuffer;

    move-result-object p2

    goto :goto_3

    :cond_3
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result p2

    div-int/lit8 p2, p2, 0x2

    new-array v0, p2, [S

    move v1, p3

    :goto_2
    if-ge v1, p2, :cond_4

    aput-short p3, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_4
    invoke-static {v0, p2, p5, p4}, Luf/c0;->A([SI[SI)Ljava/nio/ByteBuffer;

    move-result-object p2

    :goto_3
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    :cond_5
    return-wide p6
.end method

.method public onLogMessage(Ljava/lang/String;Lorg/webrtc/Logging$Severity;Ljava/lang/String;)V
    .locals 6

    if-nez p2, :cond_0

    const/4 p2, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Le33/w;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    :goto_0
    const/4 v0, 0x2

    const/4 v1, 0x0

    iget-object v2, p0, Le33/v;->a:Le33/j0;

    const-string v3, ", message: "

    const-string v4, "[onLogMessage] label: "

    if-eq p2, v0, :cond_4

    const/4 v0, 0x3

    if-eq p2, v0, :cond_3

    const/4 v0, 0x4

    if-eq p2, v0, :cond_2

    const/4 v0, 0x5

    if-eq p2, v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Le33/j0;->c()Lb23/k;

    move-result-object p2

    iget-object v0, p2, Lb23/k;->c:Lb23/e;

    iget-object v2, p2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-interface {v0, v5, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    invoke-static {v4, p3, v3, p1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v5, v2, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_2
    invoke-virtual {v2}, Le33/j0;->c()Lb23/k;

    move-result-object p2

    iget-object v0, p2, Lb23/k;->c:Lb23/e;

    iget-object v2, p2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->F:Lb23/g;

    invoke-interface {v0, v5, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    invoke-static {v4, p3, v3, p1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v5, v2, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_3
    invoke-virtual {v2}, Le33/j0;->c()Lb23/k;

    move-result-object p2

    iget-object v0, p2, Lb23/k;->c:Lb23/e;

    iget-object v2, p2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->E:Lb23/g;

    invoke-interface {v0, v5, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    invoke-static {v4, p3, v3, p1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v5, v2, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_4
    invoke-virtual {v2}, Le33/j0;->c()Lb23/k;

    move-result-object p2

    iget-object v0, p2, Lb23/k;->c:Lb23/e;

    iget-object v2, p2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->z:Lb23/g;

    invoke-interface {v0, v5, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    invoke-static {v4, p3, v3, p1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v5, v2, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_1
    return-void
.end method

.method public onWebRtcAudioRecordSamplesReady(Lorg/webrtc/audio/JavaAudioDeviceModule$AudioSamples;)V
    .locals 1

    iget-object v0, p0, Le33/v;->a:Le33/j0;

    iget-object v0, v0, Le33/j0;->i:Ld33/p;

    if-eqz v0, :cond_0

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Ld33/p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method
