.class public final Llive/hms/video/connection/HMSDataChannel$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/DataChannel$Observer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/connection/HMSDataChannel;-><init>(Lhms/webrtc/DataChannel;Llive/hms/video/connection/HMSDataChannel$Observer;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "live/hms/video/connection/HMSDataChannel$1",
        "Lhms/webrtc/DataChannel$Observer;",
        "",
        "previousAmount",
        "Ll83/a0;",
        "onBufferedAmountChange",
        "(J)V",
        "onStateChange",
        "()V",
        "Lhms/webrtc/DataChannel$Buffer;",
        "buffer",
        "onMessage",
        "(Lhms/webrtc/DataChannel$Buffer;)V",
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
.field final synthetic this$0:Llive/hms/video/connection/HMSDataChannel;


# direct methods
.method public constructor <init>(Llive/hms/video/connection/HMSDataChannel;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/connection/HMSDataChannel$1;->this$0:Llive/hms/video/connection/HMSDataChannel;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onBufferedAmountChange(J)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/connection/HMSDataChannel$1;->this$0:Llive/hms/video/connection/HMSDataChannel;

    invoke-static {v1}, Llive/hms/video/connection/HMSDataChannel;->access$getMetadata$p(Llive/hms/video/connection/HMSDataChannel;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] onBufferedAmountChange: previousAmount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "HMSDataChannel"

    invoke-static {p2, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onMessage(Lhms/webrtc/DataChannel$Buffer;)V
    .locals 2

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    iget-object p1, p1, Lhms/webrtc/DataChannel$Buffer;->data:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/charset/Charset;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/nio/CharBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "toString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/connection/HMSDataChannel$1;->this$0:Llive/hms/video/connection/HMSDataChannel;

    invoke-static {v1}, Llive/hms/video/connection/HMSDataChannel;->access$getMetadata$p(Llive/hms/video/connection/HMSDataChannel;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] onMessage: label="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/HMSDataChannel$1;->this$0:Llive/hms/video/connection/HMSDataChannel;

    invoke-virtual {v1}, Llive/hms/video/connection/HMSDataChannel;->getLabel()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", [size="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "] message="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "HMSDataChannel"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/connection/HMSDataChannel$1;->this$0:Llive/hms/video/connection/HMSDataChannel;

    invoke-static {v0}, Llive/hms/video/connection/HMSDataChannel;->access$getObserver$p(Llive/hms/video/connection/HMSDataChannel;)Llive/hms/video/connection/HMSDataChannel$Observer;

    move-result-object v0

    invoke-interface {v0, p1}, Llive/hms/video/connection/HMSDataChannel$Observer;->onMessage(Ljava/lang/String;)V

    return-void
.end method

.method public onStateChange()V
    .locals 3

    iget-object v0, p0, Llive/hms/video/connection/HMSDataChannel$1;->this$0:Llive/hms/video/connection/HMSDataChannel;

    invoke-static {v0}, Llive/hms/video/connection/HMSDataChannel;->access$getNativeChannel$p(Llive/hms/video/connection/HMSDataChannel;)Lhms/webrtc/DataChannel;

    move-result-object v0

    invoke-virtual {v0}, Lhms/webrtc/DataChannel;->state()Lhms/webrtc/DataChannel$State;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Llive/hms/video/connection/HMSDataChannel$1;->this$0:Llive/hms/video/connection/HMSDataChannel;

    invoke-static {v2}, Llive/hms/video/connection/HMSDataChannel;->access$getMetadata$p(Llive/hms/video/connection/HMSDataChannel;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "] onStateChanged: state="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "HMSDataChannel"

    invoke-static {v2, v1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lhms/webrtc/DataChannel$State;->OPEN:Lhms/webrtc/DataChannel$State;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Llive/hms/video/connection/HMSDataChannel$1;->this$0:Llive/hms/video/connection/HMSDataChannel;

    invoke-static {v0}, Llive/hms/video/connection/HMSDataChannel;->access$getChannelOpenDeferred$p(Llive/hms/video/connection/HMSDataChannel;)Lbc3/s;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    check-cast v0, Lbc3/t;

    invoke-virtual {v0, v1}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
