.class public final Ld33/z;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# static fields
.field public static final w:Ld33/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ld33/z;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/m;-><init>(I)V

    sput-object v0, Ld33/z;->w:Ld33/z;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    check-cast p1, Le33/u;

    const-string v0, "spc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    const/16 v1, 0x1e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p1, Le33/u;->h:I

    new-instance v3, Lorg/webrtc/RtpParameters$Encoding;

    const-wide/high16 v4, 0x4010000000000000L    # 4.0

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    const-string v5, "q"

    const/4 v6, 0x1

    invoke-direct {v3, v5, v6, v4}, Lorg/webrtc/RtpParameters$Encoding;-><init>(Ljava/lang/String;ZLjava/lang/Double;)V

    div-int/lit8 v4, v2, 0x4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v3, Lorg/webrtc/RtpParameters$Encoding;->maxBitrateBps:Ljava/lang/Integer;

    iput-object v1, v3, Lorg/webrtc/RtpParameters$Encoding;->maxFramerate:Ljava/lang/Integer;

    new-instance v4, Lorg/webrtc/RtpParameters$Encoding;

    const-wide/high16 v7, 0x4000000000000000L    # 2.0

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    const-string v7, "h"

    invoke-direct {v4, v7, v6, v5}, Lorg/webrtc/RtpParameters$Encoding;-><init>(Ljava/lang/String;ZLjava/lang/Double;)V

    div-int/lit8 v5, v2, 0x2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iput-object v5, v4, Lorg/webrtc/RtpParameters$Encoding;->maxBitrateBps:Ljava/lang/Integer;

    iput-object v1, v4, Lorg/webrtc/RtpParameters$Encoding;->maxFramerate:Ljava/lang/Integer;

    new-instance v5, Lorg/webrtc/RtpParameters$Encoding;

    const-string v7, "f"

    invoke-direct {v5, v7, v6, v0}, Lorg/webrtc/RtpParameters$Encoding;-><init>(Ljava/lang/String;ZLjava/lang/Double;)V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, v5, Lorg/webrtc/RtpParameters$Encoding;->maxBitrateBps:Ljava/lang/Integer;

    iput-object v1, v5, Lorg/webrtc/RtpParameters$Encoding;->maxFramerate:Ljava/lang/Integer;

    filled-new-array {v3, v4, v5}, [Lorg/webrtc/RtpParameters$Encoding;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v1, Lorg/webrtc/RtpTransceiver$RtpTransceiverInit;

    sget-object v2, Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;->SEND_ONLY:Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-direct {v1, v2, v3, v0}, Lorg/webrtc/RtpTransceiver$RtpTransceiverInit;-><init>(Lorg/webrtc/RtpTransceiver$RtpTransceiverDirection;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {p1}, Le33/u;->e()Lorg/webrtc/PeerConnection;

    move-result-object v0

    sget-object v1, Lorg/webrtc/MediaStreamTrack$MediaType;->MEDIA_TYPE_AUDIO:Lorg/webrtc/MediaStreamTrack$MediaType;

    invoke-virtual {v0, v1}, Lorg/webrtc/PeerConnection;->addTransceiver(Lorg/webrtc/MediaStreamTrack$MediaType;)Lorg/webrtc/RtpTransceiver;

    invoke-virtual {p1}, Le33/u;->e()Lorg/webrtc/PeerConnection;

    move-result-object p1

    sget-object v0, Lorg/webrtc/MediaStreamTrack$MediaType;->MEDIA_TYPE_VIDEO:Lorg/webrtc/MediaStreamTrack$MediaType;

    invoke-virtual {p1, v0}, Lorg/webrtc/PeerConnection;->addTransceiver(Lorg/webrtc/MediaStreamTrack$MediaType;)Lorg/webrtc/RtpTransceiver;

    move-result-object p1

    return-object p1
.end method
