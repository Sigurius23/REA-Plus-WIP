.class public final synthetic Llive/hms/video/encoder/video/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic w:Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;

.field public final synthetic x:Lhms/webrtc/VideoEncoder$BitrateAllocation;

.field public final synthetic y:I


# direct methods
.method public synthetic constructor <init>(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;Lhms/webrtc/VideoEncoder$BitrateAllocation;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/encoder/video/b;->w:Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;

    iput-object p2, p0, Llive/hms/video/encoder/video/b;->x:Lhms/webrtc/VideoEncoder$BitrateAllocation;

    iput p3, p0, Llive/hms/video/encoder/video/b;->y:I

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Llive/hms/video/encoder/video/b;->x:Lhms/webrtc/VideoEncoder$BitrateAllocation;

    iget v1, p0, Llive/hms/video/encoder/video/b;->y:I

    iget-object v2, p0, Llive/hms/video/encoder/video/b;->w:Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;

    invoke-static {v2, v0, v1}, Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;->h(Llive/hms/video/encoder/video/SimulcastVideoEncoderFactoryWrapper$StreamEncoderWrapper;Lhms/webrtc/VideoEncoder$BitrateAllocation;I)Lhms/webrtc/VideoCodecStatus;

    move-result-object v0

    return-object v0
.end method
