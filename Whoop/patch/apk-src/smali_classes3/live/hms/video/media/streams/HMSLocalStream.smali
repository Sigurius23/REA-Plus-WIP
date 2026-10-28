.class public final Llive/hms/video/media/streams/HMSLocalStream;
.super Llive/hms/video/media/streams/HMSMediaStream;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/media/streams/HMSLocalStream$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J-\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Llive/hms/video/media/streams/HMSLocalStream;",
        "Llive/hms/video/media/streams/HMSMediaStream;",
        "Lhms/webrtc/MediaStream;",
        "nativeStream",
        "<init>",
        "(Lhms/webrtc/MediaStream;)V",
        "Llive/hms/video/connection/publish/HMSPublishConnection;",
        "connection",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "track",
        "",
        "isScreenShare",
        "Llive/hms/video/media/settings/HMSTrackSettings;",
        "hmsTrackSettings",
        "Lhms/webrtc/RtpTransceiver;",
        "addTransceiver",
        "(Llive/hms/video/connection/publish/HMSPublishConnection;Llive/hms/video/media/tracks/HMSTrack;ZLlive/hms/video/media/settings/HMSTrackSettings;)Lhms/webrtc/RtpTransceiver;",
        "Ll83/a0;",
        "removeSender",
        "(Llive/hms/video/connection/publish/HMSPublishConnection;Llive/hms/video/media/tracks/HMSTrack;)V",
        "Companion",
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
.field public static final Companion:Llive/hms/video/media/streams/HMSLocalStream$Companion;

.field private static final TAG:Ljava/lang/String; = "HMSLocalStream"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/media/streams/HMSLocalStream$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/media/streams/HMSLocalStream$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/media/streams/HMSLocalStream;->Companion:Llive/hms/video/media/streams/HMSLocalStream$Companion;

    return-void
.end method

.method public constructor <init>(Lhms/webrtc/MediaStream;)V
    .locals 1

    const-string v0, "nativeStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Llive/hms/video/media/streams/HMSMediaStream;-><init>(Lhms/webrtc/MediaStream;)V

    return-void
.end method


# virtual methods
.method public final addTransceiver(Llive/hms/video/connection/publish/HMSPublishConnection;Llive/hms/video/media/tracks/HMSTrack;ZLlive/hms/video/media/settings/HMSTrackSettings;)Lhms/webrtc/RtpTransceiver;
    .locals 6

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "track"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsTrackSettings"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Llive/hms/video/media/tracks/HMSTrack;->getType()Llive/hms/video/media/tracks/HMSTrackType;

    move-result-object v0

    sget-object v1, Llive/hms/video/media/tracks/HMSTrackType;->VIDEO:Llive/hms/video/media/tracks/HMSTrackType;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    sget-object v0, Llive/hms/video/utils/HMSUtils;->INSTANCE:Llive/hms/video/utils/HMSUtils;

    move-object v3, p2

    check-cast v3, Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    invoke-virtual {v3}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->getSettings()Llive/hms/video/media/settings/HMSVideoTrackSettings;

    move-result-object v3

    invoke-virtual {v0, v3, p3}, Llive/hms/video/utils/HMSUtils;->getVideoEncodingParameter$lib_release(Llive/hms/video/media/settings/HMSVideoTrackSettings;Z)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Lhms/webrtc/RtpParameters$Encoding;

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v2}, Lhms/webrtc/RtpParameters$Encoding;-><init>(Ljava/lang/String;ZLjava/lang/Double;)V

    const-wide/high16 v3, 0x4000000000000000L    # 2.0

    iput-wide v3, v0, Lhms/webrtc/RtpParameters$Encoding;->bitratePriority:D

    move-object v3, p2

    check-cast v3, Llive/hms/video/media/tracks/HMSLocalAudioTrack;

    invoke-virtual {v3}, Llive/hms/video/media/tracks/HMSLocalAudioTrack;->getSettings()Llive/hms/video/media/settings/HMSAudioTrackSettings;

    move-result-object v3

    invoke-virtual {v3}, Llive/hms/video/media/settings/HMSAudioTrackSettings;->getMaxBitrate()I

    move-result v3

    mul-int/lit16 v3, v3, 0x3e8

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iput-object v3, v0, Lhms/webrtc/RtpParameters$Encoding;->maxBitrateBps:Ljava/lang/Integer;

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :goto_0
    new-instance v3, Lhms/webrtc/RtpTransceiver$RtpTransceiverInit;

    sget-object v4, Lhms/webrtc/RtpTransceiver$RtpTransceiverDirection;->SEND_ONLY:Lhms/webrtc/RtpTransceiver$RtpTransceiverDirection;

    invoke-virtual {p0}, Llive/hms/video/media/streams/HMSMediaStream;->getNativeStream()Lhms/webrtc/MediaStream;

    move-result-object v5

    invoke-virtual {v5}, Lhms/webrtc/MediaStream;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct {v3, v4, v5, v0}, Lhms/webrtc/RtpTransceiver$RtpTransceiverInit;-><init>(Lhms/webrtc/RtpTransceiver$RtpTransceiverDirection;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual {p2}, Llive/hms/video/media/tracks/HMSTrack;->getNativeTrack$lib_release()Lhms/webrtc/MediaStreamTrack;

    move-result-object v4

    invoke-virtual {p1, v4, v3}, Llive/hms/video/connection/HMSConnection;->addTransceiver(Lhms/webrtc/MediaStreamTrack;Lhms/webrtc/RtpTransceiver$RtpTransceiverInit;)Lhms/webrtc/RtpTransceiver;

    move-result-object p1

    invoke-virtual {p4}, Llive/hms/video/media/settings/HMSTrackSettings;->getVideoSettings()Llive/hms/video/media/settings/HMSVideoTrackSettings;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getDegradationPreference()Llive/hms/video/sdk/models/DegradationPreference;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v2

    :goto_1
    sget-object v4, Llive/hms/video/sdk/models/DegradationPreference;->DEFAULT:Llive/hms/video/sdk/models/DegradationPreference;

    if-eq v3, v4, :cond_3

    invoke-virtual {p2}, Llive/hms/video/media/tracks/HMSTrack;->getType()Llive/hms/video/media/tracks/HMSTrackType;

    move-result-object v3

    if-ne v3, v1, :cond_3

    if-nez p3, :cond_3

    invoke-virtual {p1}, Lhms/webrtc/RtpTransceiver;->getSender()Lhms/webrtc/RtpSender;

    move-result-object p3

    invoke-virtual {p3}, Lhms/webrtc/RtpSender;->getParameters()Lhms/webrtc/RtpParameters;

    move-result-object p3

    sget-object v1, Llive/hms/video/utils/HMSUtils;->INSTANCE:Llive/hms/video/utils/HMSUtils;

    invoke-virtual {p4}, Llive/hms/video/media/settings/HMSTrackSettings;->getVideoSettings()Llive/hms/video/media/settings/HMSVideoTrackSettings;

    move-result-object p4

    if-eqz p4, :cond_2

    invoke-virtual {p4}, Llive/hms/video/media/settings/HMSVideoTrackSettings;->getDegradationPreference()Llive/hms/video/sdk/models/DegradationPreference;

    move-result-object v2

    :cond_2
    invoke-virtual {v1, v2}, Llive/hms/video/utils/HMSUtils;->mapHmsDegradationPreference(Llive/hms/video/sdk/models/DegradationPreference;)Lhms/webrtc/RtpParameters$DegradationPreference;

    move-result-object p4

    iput-object p4, p3, Lhms/webrtc/RtpParameters;->degradationPreference:Lhms/webrtc/RtpParameters$DegradationPreference;

    :cond_3
    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "[streamId="

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Llive/hms/video/media/streams/HMSMediaStream;->getNativeStream()Lhms/webrtc/MediaStream;

    move-result-object p4

    invoke-virtual {p4}, Lhms/webrtc/MediaStream;->getId()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, "] publishTrack trackId="

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Llive/hms/video/media/tracks/HMSTrack;->getTrackId()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " kind="

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Llive/hms/video/media/tracks/HMSTrack;->getType()Llive/hms/video/media/tracks/HMSTrackType;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " sendEncodings="

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ", Added transceiver: mid="

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lhms/webrtc/RtpTransceiver;->getMid()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "HMSLocalStream"

    invoke-static {p3, p2}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public final removeSender(Llive/hms/video/connection/publish/HMSPublishConnection;Llive/hms/video/media/tracks/HMSTrack;)V
    .locals 4

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "track"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/connection/HMSConnection;->getSenders()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lhms/webrtc/RtpSender;

    invoke-virtual {v1}, Lhms/webrtc/RtpSender;->getParameters()Lhms/webrtc/RtpParameters;

    invoke-virtual {v1}, Lhms/webrtc/RtpSender;->track()Lhms/webrtc/MediaStreamTrack;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lhms/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Llive/hms/video/media/tracks/HMSTrack;->getNativeTrack$lib_release()Lhms/webrtc/MediaStreamTrack;

    move-result-object v3

    invoke-virtual {v3}, Lhms/webrtc/MediaStreamTrack;->id()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v1}, Llive/hms/video/connection/HMSConnection;->removeTrack(Lhms/webrtc/RtpSender;)Z

    invoke-virtual {p0}, Llive/hms/video/media/streams/HMSMediaStream;->getTracks()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot find "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " in locally stored tracks"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Cannot find sender track in streamId="

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Llive/hms/video/media/streams/HMSMediaStream;->getId()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "HMSLocalStream"

    invoke-static {p2, p1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
