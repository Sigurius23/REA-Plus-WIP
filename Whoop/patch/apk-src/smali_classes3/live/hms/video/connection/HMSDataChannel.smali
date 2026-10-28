.class public final Llive/hms/video/connection/HMSDataChannel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/connection/HMSDataChannel$Companion;,
        Llive/hms/video/connection/HMSDataChannel$Observer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000  2\u00020\u0001:\u0002 !B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0015R\u001a\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0015\u001a\u0004\u0008\u001a\u0010\u0012R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\u00a8\u0006\""
    }
    d2 = {
        "Llive/hms/video/connection/HMSDataChannel;",
        "",
        "Lhms/webrtc/DataChannel;",
        "nativeChannel",
        "Llive/hms/video/connection/HMSDataChannel$Observer;",
        "observer",
        "",
        "metadata",
        "<init>",
        "(Lhms/webrtc/DataChannel;Llive/hms/video/connection/HMSDataChannel$Observer;Ljava/lang/String;)V",
        "message",
        "",
        "send",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Ll83/a0;",
        "close",
        "()V",
        "toString",
        "()Ljava/lang/String;",
        "Lhms/webrtc/DataChannel;",
        "Llive/hms/video/connection/HMSDataChannel$Observer;",
        "Ljava/lang/String;",
        "Lbc3/s;",
        "channelOpenDeferred",
        "Lbc3/s;",
        "label",
        "getLabel",
        "",
        "id",
        "I",
        "getId",
        "()I",
        "Companion",
        "Observer",
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


# static fields
.field public static final Companion:Llive/hms/video/connection/HMSDataChannel$Companion;

.field private static final TAG:Ljava/lang/String; = "HMSDataChannel"


# instance fields
.field private final channelOpenDeferred:Lbc3/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc3/s;"
        }
    .end annotation
.end field

.field private final id:I

.field private final label:Ljava/lang/String;

.field private final metadata:Ljava/lang/String;

.field private final nativeChannel:Lhms/webrtc/DataChannel;

.field private final observer:Llive/hms/video/connection/HMSDataChannel$Observer;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/connection/HMSDataChannel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/connection/HMSDataChannel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/connection/HMSDataChannel;->Companion:Llive/hms/video/connection/HMSDataChannel$Companion;

    return-void
.end method

.method public constructor <init>(Lhms/webrtc/DataChannel;Llive/hms/video/connection/HMSDataChannel$Observer;Ljava/lang/String;)V
    .locals 2

    const-string v0, "nativeChannel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "observer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadata"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Llive/hms/video/connection/HMSDataChannel;->nativeChannel:Lhms/webrtc/DataChannel;

    .line 3
    iput-object p2, p0, Llive/hms/video/connection/HMSDataChannel;->observer:Llive/hms/video/connection/HMSDataChannel$Observer;

    .line 4
    iput-object p3, p0, Llive/hms/video/connection/HMSDataChannel;->metadata:Ljava/lang/String;

    .line 5
    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object p2

    iput-object p2, p0, Llive/hms/video/connection/HMSDataChannel;->channelOpenDeferred:Lbc3/s;

    .line 6
    invoke-virtual {p1}, Lhms/webrtc/DataChannel;->label()Ljava/lang/String;

    move-result-object p3

    const-string v0, "label(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p3, p0, Llive/hms/video/connection/HMSDataChannel;->label:Ljava/lang/String;

    .line 7
    invoke-virtual {p1}, Lhms/webrtc/DataChannel;->id()I

    move-result p3

    iput p3, p0, Llive/hms/video/connection/HMSDataChannel;->id:I

    .line 8
    sget-object p3, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Created data channel "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HMSDataChannel"

    invoke-virtual {p3, v1, v0}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    invoke-virtual {p1}, Lhms/webrtc/DataChannel;->state()Lhms/webrtc/DataChannel$State;

    move-result-object p3

    sget-object v0, Lhms/webrtc/DataChannel$State;->OPEN:Lhms/webrtc/DataChannel$State;

    if-ne p3, v0, :cond_0

    .line 10
    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 11
    invoke-virtual {p2, p3}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    .line 12
    :cond_0
    new-instance p2, Llive/hms/video/connection/HMSDataChannel$1;

    invoke-direct {p2, p0}, Llive/hms/video/connection/HMSDataChannel$1;-><init>(Llive/hms/video/connection/HMSDataChannel;)V

    invoke-virtual {p1, p2}, Lhms/webrtc/DataChannel;->registerObserver(Lhms/webrtc/DataChannel$Observer;)V

    return-void
.end method

.method public synthetic constructor <init>(Lhms/webrtc/DataChannel;Llive/hms/video/connection/HMSDataChannel$Observer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 13
    const-string p3, ""

    .line 14
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Llive/hms/video/connection/HMSDataChannel;-><init>(Lhms/webrtc/DataChannel;Llive/hms/video/connection/HMSDataChannel$Observer;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic access$getChannelOpenDeferred$p(Llive/hms/video/connection/HMSDataChannel;)Lbc3/s;
    .locals 0

    iget-object p0, p0, Llive/hms/video/connection/HMSDataChannel;->channelOpenDeferred:Lbc3/s;

    return-object p0
.end method

.method public static final synthetic access$getMetadata$p(Llive/hms/video/connection/HMSDataChannel;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Llive/hms/video/connection/HMSDataChannel;->metadata:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$getNativeChannel$p(Llive/hms/video/connection/HMSDataChannel;)Lhms/webrtc/DataChannel;
    .locals 0

    iget-object p0, p0, Llive/hms/video/connection/HMSDataChannel;->nativeChannel:Lhms/webrtc/DataChannel;

    return-object p0
.end method

.method public static final synthetic access$getObserver$p(Llive/hms/video/connection/HMSDataChannel;)Llive/hms/video/connection/HMSDataChannel$Observer;
    .locals 0

    iget-object p0, p0, Llive/hms/video/connection/HMSDataChannel;->observer:Llive/hms/video/connection/HMSDataChannel$Observer;

    return-object p0
.end method


# virtual methods
.method public final close()V
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Closing "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " START"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "HMSDataChannel"

    invoke-static {v2, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Llive/hms/video/connection/HMSDataChannel;->nativeChannel:Lhms/webrtc/DataChannel;

    invoke-virtual {v0}, Lhms/webrtc/DataChannel;->unregisterObserver()V

    iget-object v0, p0, Llive/hms/video/connection/HMSDataChannel;->nativeChannel:Lhms/webrtc/DataChannel;

    invoke-virtual {v0}, Lhms/webrtc/DataChannel;->close()V

    iget-object v0, p0, Llive/hms/video/connection/HMSDataChannel;->nativeChannel:Lhms/webrtc/DataChannel;

    invoke-virtual {v0}, Lhms/webrtc/DataChannel;->dispose()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v3, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "["

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Llive/hms/video/connection/HMSDataChannel;->metadata:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "] Could not close "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " cleanly"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v2, v4, v0}, Llive/hms/video/utils/HMSLogger;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " DONE"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Llive/hms/video/connection/HMSDataChannel;->id:I

    return v0
.end method

.method public final getLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/HMSDataChannel;->label:Ljava/lang/String;

    return-object v0
.end method

.method public final send(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Llive/hms/video/connection/HMSDataChannel$send$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Llive/hms/video/connection/HMSDataChannel$send$1;

    iget v1, v0, Llive/hms/video/connection/HMSDataChannel$send$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llive/hms/video/connection/HMSDataChannel$send$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Llive/hms/video/connection/HMSDataChannel$send$1;

    invoke-direct {v0, p0, p2}, Llive/hms/video/connection/HMSDataChannel$send$1;-><init>(Llive/hms/video/connection/HMSDataChannel;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Llive/hms/video/connection/HMSDataChannel$send$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llive/hms/video/connection/HMSDataChannel$send$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Llive/hms/video/connection/HMSDataChannel$send$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v0, v0, Llive/hms/video/connection/HMSDataChannel$send$1;->L$0:Ljava/lang/Object;

    check-cast v0, Llive/hms/video/connection/HMSDataChannel;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Llive/hms/video/connection/HMSDataChannel;->channelOpenDeferred:Lbc3/s;

    check-cast p2, Lbc3/t1;

    invoke-virtual {p2}, Lbc3/t1;->isCompleted()Z

    move-result p2

    if-nez p2, :cond_3

    iget-object p2, p0, Llive/hms/video/connection/HMSDataChannel;->channelOpenDeferred:Lbc3/s;

    iput-object p0, v0, Llive/hms/video/connection/HMSDataChannel$send$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Llive/hms/video/connection/HMSDataChannel$send$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Llive/hms/video/connection/HMSDataChannel$send$1;->label:I

    check-cast p2, Lbc3/t;

    invoke-virtual {p2, v0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    const-string p2, "UTF-8"

    invoke-static {p2}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object p2

    const-string v1, "forName(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    const-string v1, "getBytes(...)"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v0, Llive/hms/video/connection/HMSDataChannel;->metadata:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "] Sending [size="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "] message="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "HMSDataChannel"

    invoke-static {v1, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    :try_start_0
    iget-object v0, v0, Llive/hms/video/connection/HMSDataChannel;->nativeChannel:Lhms/webrtc/DataChannel;

    new-instance v2, Lhms/webrtc/DataChannel$Buffer;

    invoke-direct {v2, p2, p1}, Lhms/webrtc/DataChannel$Buffer;-><init>(Ljava/nio/ByteBuffer;Z)V

    invoke-virtual {v0, v2}, Lhms/webrtc/DataChannel;->send(Lhms/webrtc/DataChannel$Buffer;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    const-string p2, "Cannot send msg via data as it has been disposed"

    invoke-static {v1, p2}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HMSDataChannel{id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Llive/hms/video/connection/HMSDataChannel;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", label="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/HMSDataChannel;->label:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", metadata=["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/HMSDataChannel;->metadata:Ljava/lang/String;

    const-string v2, "]}"

    invoke-static {v1, v2, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
