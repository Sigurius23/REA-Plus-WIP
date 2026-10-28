.class public final Llive/hms/video/sdk/managers/UseCaseUpdateHmsRoom;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\t\u001a\u00020\u00082\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ%\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Llive/hms/video/sdk/managers/UseCaseUpdateHmsRoom;",
        "",
        "<init>",
        "()V",
        "Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;",
        "newRoom",
        "Llive/hms/video/sdk/SDKStore;",
        "store",
        "Ll83/a0;",
        "saveHMSRoom",
        "(Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;Llive/hms/video/sdk/SDKStore;)V",
        "",
        "Llive/hms/video/sdk/models/SDKUpdate;",
        "updateHmsRoom",
        "(Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;Llive/hms/video/sdk/SDKStore;)Ljava/util/List;",
        "",
        "TAG",
        "Ljava/lang/String;",
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


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "UseCaseUpdateRecordingStreaming"

    iput-object v0, p0, Llive/hms/video/sdk/managers/UseCaseUpdateHmsRoom;->TAG:Ljava/lang/String;

    return-void
.end method

.method private final saveHMSRoom(Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;Llive/hms/video/sdk/SDKStore;)V
    .locals 11

    invoke-virtual {p2}, Llive/hms/video/sdk/SDKStore;->get_room()Llive/hms/video/sdk/models/HMSRoom;

    move-result-object p2

    if-eqz p1, :cond_1c

    if-eqz p2, :cond_1c

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->getTranscriptions()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/sdk/models/Transcriptions;

    invoke-virtual {p2}, Llive/hms/video/sdk/models/HMSRoom;->get_transcriptions$lib_release()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Llive/hms/video/sdk/models/Transcriptions;

    invoke-virtual {v5}, Llive/hms/video/sdk/models/Transcriptions;->getMode()Llive/hms/video/sdk/models/TranscriptionsMode;

    move-result-object v5

    invoke-virtual {v2}, Llive/hms/video/sdk/models/Transcriptions;->getMode()Llive/hms/video/sdk/models/TranscriptionsMode;

    move-result-object v6

    if-ne v5, v6, :cond_0

    goto :goto_1

    :cond_1
    move-object v4, v1

    :goto_1
    check-cast v4, Llive/hms/video/sdk/models/Transcriptions;

    if-eqz v4, :cond_2

    invoke-virtual {v4, v2}, Llive/hms/video/sdk/models/Transcriptions;->update$lib_release(Llive/hms/video/sdk/models/Transcriptions;)V

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Llive/hms/video/sdk/models/HMSRoom;->get_transcriptions$lib_release()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->getStartedAt()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p2, v0}, Llive/hms/video/sdk/models/HMSRoom;->setStartedAt(Ljava/lang/Long;)V

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->getSessionId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Llive/hms/video/sdk/models/HMSRoom;->setSessionId$lib_release(Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Llive/hms/video/sdk/models/HMSRoom;->setName(Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->getRoomId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Llive/hms/video/sdk/models/HMSRoom;->setRoomId(Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->getStreaming()Llive/hms/video/sdk/models/HMSNotifications$Streaming;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSNotifications$Streaming;->getRtmp()Llive/hms/video/sdk/models/HMSNotifications$Rtmp;

    move-result-object v0

    if-eqz v0, :cond_7

    new-instance v4, Llive/hms/video/sdk/models/HMSRtmpStreamingState;

    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->getState()Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    move-result-object v5

    sget-object v6, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;->started:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    if-ne v5, v6, :cond_4

    move v5, v3

    goto :goto_2

    :cond_4
    move v5, v2

    :goto_2
    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->getStartedAt()Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->getStoppedAt()Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->getState()Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;->toHMSStreamingState()Llive/hms/video/sdk/models/enums/HMSStreamingState;

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_4

    :cond_5
    :goto_3
    move-object v9, v0

    goto :goto_5

    :cond_6
    :goto_4
    sget-object v0, Llive/hms/video/sdk/models/enums/HMSStreamingState;->NONE:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    goto :goto_3

    :goto_5
    const/4 v6, 0x0

    invoke-direct/range {v4 .. v9}, Llive/hms/video/sdk/models/HMSRtmpStreamingState;-><init>(ZLlive/hms/video/error/HMSException;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/enums/HMSStreamingState;)V

    invoke-virtual {p2, v4}, Llive/hms/video/sdk/models/HMSRoom;->setRtmpHMSRtmpStreamingState$lib_release(Llive/hms/video/sdk/models/HMSRtmpStreamingState;)V

    :cond_7
    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->getRecording()Llive/hms/video/sdk/peerlist/models/Recording;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Llive/hms/video/sdk/peerlist/models/Recording;->getBrowser()Llive/hms/video/sdk/peerlist/models/Browser;

    move-result-object v0

    if-eqz v0, :cond_d

    new-instance v4, Llive/hms/video/sdk/models/HMSBrowserRecordingState;

    invoke-virtual {v0}, Llive/hms/video/sdk/peerlist/models/Browser;->getState()Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    move-result-object v5

    sget-object v6, Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;->started:Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    if-eq v5, v6, :cond_9

    invoke-virtual {v0}, Llive/hms/video/sdk/peerlist/models/Browser;->getState()Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    move-result-object v5

    sget-object v6, Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;->resumed:Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    if-ne v5, v6, :cond_8

    goto :goto_6

    :cond_8
    move v5, v2

    goto :goto_7

    :cond_9
    :goto_6
    move v5, v3

    :goto_7
    invoke-virtual {v0}, Llive/hms/video/sdk/peerlist/models/Browser;->getStartedAt()Ljava/lang/Long;

    move-result-object v7

    invoke-virtual {v0}, Llive/hms/video/sdk/peerlist/models/Browser;->getStoppedAt()Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v0}, Llive/hms/video/sdk/peerlist/models/Browser;->getState()Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    move-result-object v6

    sget-object v9, Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;->initialised:Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    if-ne v6, v9, :cond_a

    move v9, v3

    goto :goto_8

    :cond_a
    move v9, v2

    :goto_8
    invoke-virtual {v0}, Llive/hms/video/sdk/peerlist/models/Browser;->getState()Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;->toHMSRecordingState()Llive/hms/video/sdk/models/enums/HMSRecordingState;

    move-result-object v0

    if-nez v0, :cond_b

    goto :goto_a

    :cond_b
    :goto_9
    move-object v10, v0

    goto :goto_b

    :cond_c
    :goto_a
    sget-object v0, Llive/hms/video/sdk/models/enums/HMSRecordingState;->NONE:Llive/hms/video/sdk/models/enums/HMSRecordingState;

    goto :goto_9

    :goto_b
    const/4 v6, 0x0

    invoke-direct/range {v4 .. v10}, Llive/hms/video/sdk/models/HMSBrowserRecordingState;-><init>(ZLlive/hms/video/error/HMSException;Ljava/lang/Long;Ljava/lang/Long;ZLlive/hms/video/sdk/models/enums/HMSRecordingState;)V

    invoke-virtual {p2, v4}, Llive/hms/video/sdk/models/HMSRoom;->setBrowserRecordingState$lib_release(Llive/hms/video/sdk/models/HMSBrowserRecordingState;)V

    :cond_d
    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->getRecording()Llive/hms/video/sdk/peerlist/models/Recording;

    move-result-object v0

    if-eqz v0, :cond_12

    invoke-virtual {v0}, Llive/hms/video/sdk/peerlist/models/Recording;->getSfu()Llive/hms/video/sdk/peerlist/models/Sfu;

    move-result-object v0

    if-eqz v0, :cond_12

    new-instance v4, Llive/hms/video/sdk/models/HMSServerRecordingState;

    invoke-virtual {v0}, Llive/hms/video/sdk/peerlist/models/Sfu;->getState()Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    move-result-object v5

    sget-object v6, Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;->started:Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    if-eq v5, v6, :cond_f

    invoke-virtual {v0}, Llive/hms/video/sdk/peerlist/models/Sfu;->getState()Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    move-result-object v5

    sget-object v6, Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;->resumed:Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    if-ne v5, v6, :cond_e

    goto :goto_c

    :cond_e
    move v5, v2

    goto :goto_d

    :cond_f
    :goto_c
    move v5, v3

    :goto_d
    invoke-virtual {v0}, Llive/hms/video/sdk/peerlist/models/Sfu;->getStartedAt()Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {v0}, Llive/hms/video/sdk/peerlist/models/Sfu;->getState()Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    move-result-object v0

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;->toHMSRecordingState()Llive/hms/video/sdk/models/enums/HMSRecordingState;

    move-result-object v0

    if-nez v0, :cond_11

    :cond_10
    sget-object v0, Llive/hms/video/sdk/models/enums/HMSRecordingState;->NONE:Llive/hms/video/sdk/models/enums/HMSRecordingState;

    :cond_11
    invoke-direct {v4, v5, v1, v6, v0}, Llive/hms/video/sdk/models/HMSServerRecordingState;-><init>(ZLlive/hms/video/error/HMSException;Ljava/lang/Long;Llive/hms/video/sdk/models/enums/HMSRecordingState;)V

    invoke-virtual {p2, v4}, Llive/hms/video/sdk/models/HMSRoom;->setServerRecordingState$lib_release(Llive/hms/video/sdk/models/HMSServerRecordingState;)V

    :cond_12
    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->getStreaming()Llive/hms/video/sdk/models/HMSNotifications$Streaming;

    move-result-object v0

    if-eqz v0, :cond_17

    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSNotifications$Streaming;->getHls()Llive/hms/video/sdk/models/HMSNotifications$Hls;

    move-result-object v0

    if-eqz v0, :cond_17

    new-instance v4, Llive/hms/video/sdk/models/HMSHLSStreamingState;

    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSNotifications$Hls;->getVariants()Ljava/util/ArrayList;

    move-result-object v5

    if-eqz v5, :cond_13

    invoke-static {v5}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Llive/hms/video/sdk/models/HMSHLSVariant;

    if-eqz v5, :cond_13

    invoke-virtual {v5}, Llive/hms/video/sdk/models/HMSHLSVariant;->getState$lib_release()Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    move-result-object v5

    goto :goto_e

    :cond_13
    move-object v5, v1

    :goto_e
    sget-object v6, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;->started:Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    if-ne v5, v6, :cond_14

    move v5, v3

    goto :goto_f

    :cond_14
    move v5, v2

    :goto_f
    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSNotifications$Hls;->getVariants()Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSNotifications$Hls;->getVariants()Ljava/util/ArrayList;

    move-result-object v0

    if-eqz v0, :cond_15

    invoke-static {v0}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llive/hms/video/sdk/models/HMSHLSVariant;

    if-eqz v0, :cond_15

    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSHLSVariant;->getState$lib_release()Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    move-result-object v0

    if-eqz v0, :cond_15

    invoke-virtual {v0}, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;->toHMSStreamingState()Llive/hms/video/sdk/models/enums/HMSStreamingState;

    move-result-object v0

    if-nez v0, :cond_16

    :cond_15
    sget-object v0, Llive/hms/video/sdk/models/enums/HMSStreamingState;->NONE:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    :cond_16
    invoke-direct {v4, v5, v6, v1, v0}, Llive/hms/video/sdk/models/HMSHLSStreamingState;-><init>(ZLjava/util/ArrayList;Llive/hms/video/error/HMSException;Llive/hms/video/sdk/models/enums/HMSStreamingState;)V

    invoke-virtual {p2, v4}, Llive/hms/video/sdk/models/HMSRoom;->setHlsStreamingState$lib_release(Llive/hms/video/sdk/models/HMSHLSStreamingState;)V

    :cond_17
    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->getRecording()Llive/hms/video/sdk/peerlist/models/Recording;

    move-result-object p1

    if-eqz p1, :cond_1c

    invoke-virtual {p1}, Llive/hms/video/sdk/peerlist/models/Recording;->getHls()Llive/hms/video/sdk/peerlist/models/Hls;

    move-result-object p1

    if-eqz p1, :cond_1c

    new-instance v4, Llive/hms/video/sdk/models/HmsHlsRecordingState;

    invoke-virtual {p1}, Llive/hms/video/sdk/peerlist/models/Hls;->getState()Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    move-result-object v0

    sget-object v1, Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;->started:Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    if-eq v0, v1, :cond_18

    invoke-virtual {p1}, Llive/hms/video/sdk/peerlist/models/Hls;->getState()Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    move-result-object v0

    sget-object v1, Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;->resumed:Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    if-ne v0, v1, :cond_19

    :cond_18
    move v2, v3

    :cond_19
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {p1}, Llive/hms/video/sdk/peerlist/models/Hls;->getStartedAt()Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {p1}, Llive/hms/video/sdk/peerlist/models/Hls;->getHlsRecordingConfig()Llive/hms/video/sdk/models/HMSHlsRecordingConfig;

    move-result-object v7

    invoke-virtual {p1}, Llive/hms/video/sdk/peerlist/models/Hls;->getState()Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    move-result-object p1

    if-eqz p1, :cond_1b

    invoke-virtual {p1}, Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;->toHMSRecordingState()Llive/hms/video/sdk/models/enums/HMSRecordingState;

    move-result-object p1

    if-nez p1, :cond_1a

    goto :goto_11

    :cond_1a
    :goto_10
    move-object v9, p1

    goto :goto_12

    :cond_1b
    :goto_11
    sget-object p1, Llive/hms/video/sdk/models/enums/HMSRecordingState;->NONE:Llive/hms/video/sdk/models/enums/HMSRecordingState;

    goto :goto_10

    :goto_12
    const/4 v8, 0x0

    invoke-direct/range {v4 .. v9}, Llive/hms/video/sdk/models/HmsHlsRecordingState;-><init>(Ljava/lang/Boolean;Ljava/lang/Long;Llive/hms/video/sdk/models/HMSHlsRecordingConfig;Llive/hms/video/error/HMSException;Llive/hms/video/sdk/models/enums/HMSRecordingState;)V

    invoke-virtual {p2, v4}, Llive/hms/video/sdk/models/HMSRoom;->setHlsRecordingState$lib_release(Llive/hms/video/sdk/models/HmsHlsRecordingState;)V

    :cond_1c
    return-void
.end method


# virtual methods
.method public final updateHmsRoom(Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;Llive/hms/video/sdk/SDKStore;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;",
            "Llive/hms/video/sdk/SDKStore;",
            ")",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/SDKUpdate;",
            ">;"
        }
    .end annotation

    const-string v0, "store"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Llive/hms/video/sdk/SDKStore;->get_room()Llive/hms/video/sdk/models/HMSRoom;

    move-result-object v1

    if-eqz p1, :cond_11

    if-eqz v1, :cond_11

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSRoom;->getBrowserRecordingState()Llive/hms/video/sdk/models/HMSBrowserRecordingState;

    move-result-object v2

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSBrowserRecordingState;->getState()Llive/hms/video/sdk/models/enums/HMSRecordingState;

    move-result-object v2

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->getRecording()Llive/hms/video/sdk/peerlist/models/Recording;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Llive/hms/video/sdk/peerlist/models/Recording;->getBrowser()Llive/hms/video/sdk/peerlist/models/Browser;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Llive/hms/video/sdk/peerlist/models/Browser;->getState()Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;->toHMSRecordingState()Llive/hms/video/sdk/models/enums/HMSRecordingState;

    move-result-object v3

    if-nez v3, :cond_1

    :cond_0
    sget-object v3, Llive/hms/video/sdk/models/enums/HMSRecordingState;->NONE:Llive/hms/video/sdk/models/enums/HMSRecordingState;

    :cond_1
    if-eq v2, v3, :cond_2

    new-instance v2, Llive/hms/video/sdk/models/SDKUpdate$Room;

    sget-object v3, Llive/hms/video/sdk/models/enums/HMSRoomUpdate;->BROWSER_RECORDING_STATE_UPDATED:Llive/hms/video/sdk/models/enums/HMSRoomUpdate;

    invoke-direct {v2, v3}, Llive/hms/video/sdk/models/SDKUpdate$Room;-><init>(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSRoom;->getServerRecordingState()Llive/hms/video/sdk/models/HMSServerRecordingState;

    move-result-object v2

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSServerRecordingState;->getState()Llive/hms/video/sdk/models/enums/HMSRecordingState;

    move-result-object v2

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->getRecording()Llive/hms/video/sdk/peerlist/models/Recording;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Llive/hms/video/sdk/peerlist/models/Recording;->getSfu()Llive/hms/video/sdk/peerlist/models/Sfu;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Llive/hms/video/sdk/peerlist/models/Sfu;->getState()Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;->toHMSRecordingState()Llive/hms/video/sdk/models/enums/HMSRecordingState;

    move-result-object v3

    if-nez v3, :cond_4

    :cond_3
    sget-object v3, Llive/hms/video/sdk/models/enums/HMSRecordingState;->NONE:Llive/hms/video/sdk/models/enums/HMSRecordingState;

    :cond_4
    if-eq v2, v3, :cond_5

    new-instance v2, Llive/hms/video/sdk/models/SDKUpdate$Room;

    sget-object v3, Llive/hms/video/sdk/models/enums/HMSRoomUpdate;->SERVER_RECORDING_STATE_UPDATED:Llive/hms/video/sdk/models/enums/HMSRoomUpdate;

    invoke-direct {v2, v3}, Llive/hms/video/sdk/models/SDKUpdate$Room;-><init>(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSRoom;->getRtmpHMSRtmpStreamingState()Llive/hms/video/sdk/models/HMSRtmpStreamingState;

    move-result-object v2

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->getState()Llive/hms/video/sdk/models/enums/HMSStreamingState;

    move-result-object v2

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->getStreaming()Llive/hms/video/sdk/models/HMSNotifications$Streaming;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Llive/hms/video/sdk/models/HMSNotifications$Streaming;->getRtmp()Llive/hms/video/sdk/models/HMSNotifications$Rtmp;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Llive/hms/video/sdk/models/HMSNotifications$Rtmp;->getState()Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    move-result-object v3

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;->toHMSStreamingState()Llive/hms/video/sdk/models/enums/HMSStreamingState;

    move-result-object v3

    if-nez v3, :cond_7

    :cond_6
    sget-object v3, Llive/hms/video/sdk/models/enums/HMSStreamingState;->NONE:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    :cond_7
    if-eq v2, v3, :cond_8

    new-instance v2, Llive/hms/video/sdk/models/SDKUpdate$Room;

    sget-object v3, Llive/hms/video/sdk/models/enums/HMSRoomUpdate;->RTMP_STREAMING_STATE_UPDATED:Llive/hms/video/sdk/models/enums/HMSRoomUpdate;

    invoke-direct {v2, v3}, Llive/hms/video/sdk/models/SDKUpdate$Room;-><init>(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_8
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSRoom;->getHlsStreamingState()Llive/hms/video/sdk/models/HMSHLSStreamingState;

    move-result-object v2

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSHLSStreamingState;->getState()Llive/hms/video/sdk/models/enums/HMSStreamingState;

    move-result-object v2

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->getStreaming()Llive/hms/video/sdk/models/HMSNotifications$Streaming;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Llive/hms/video/sdk/models/HMSNotifications$Streaming;->getHls()Llive/hms/video/sdk/models/HMSNotifications$Hls;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Llive/hms/video/sdk/models/HMSNotifications$Hls;->getVariants()Ljava/util/ArrayList;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-static {v3}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llive/hms/video/sdk/models/HMSHLSVariant;

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Llive/hms/video/sdk/models/HMSHLSVariant;->getState$lib_release()Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    move-result-object v3

    if-nez v3, :cond_a

    :cond_9
    sget-object v3, Llive/hms/video/sdk/models/enums/HMSStreamingState;->NONE:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    :cond_a
    if-eq v2, v3, :cond_b

    new-instance v2, Llive/hms/video/sdk/models/SDKUpdate$Room;

    sget-object v3, Llive/hms/video/sdk/models/enums/HMSRoomUpdate;->HLS_STREAMING_STATE_UPDATED:Llive/hms/video/sdk/models/enums/HMSRoomUpdate;

    invoke-direct {v2, v3}, Llive/hms/video/sdk/models/SDKUpdate$Room;-><init>(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_b
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSRoom;->getHlsRecordingState()Llive/hms/video/sdk/models/HmsHlsRecordingState;

    move-result-object v2

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HmsHlsRecordingState;->getState()Llive/hms/video/sdk/models/enums/HMSRecordingState;

    move-result-object v2

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->getRecording()Llive/hms/video/sdk/peerlist/models/Recording;

    move-result-object v3

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Llive/hms/video/sdk/peerlist/models/Recording;->getHls()Llive/hms/video/sdk/peerlist/models/Hls;

    move-result-object v3

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Llive/hms/video/sdk/peerlist/models/Hls;->getState()Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;

    move-result-object v3

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Llive/hms/video/sdk/peerlist/models/BeamRecordingStates;->toHMSRecordingState()Llive/hms/video/sdk/models/enums/HMSRecordingState;

    move-result-object v3

    if-nez v3, :cond_d

    :cond_c
    sget-object v3, Llive/hms/video/sdk/models/enums/HMSRecordingState;->NONE:Llive/hms/video/sdk/models/enums/HMSRecordingState;

    :cond_d
    if-eq v2, v3, :cond_e

    new-instance v2, Llive/hms/video/sdk/models/SDKUpdate$Room;

    sget-object v3, Llive/hms/video/sdk/models/enums/HMSRoomUpdate;->HLS_RECORDING_STATE_UPDATED:Llive/hms/video/sdk/models/enums/HMSRoomUpdate;

    invoke-direct {v2, v3}, Llive/hms/video/sdk/models/SDKUpdate$Room;-><init>(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_e
    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSRoom;->getTranscriptions()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->getTranscriptions()Ljava/util/List;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    invoke-virtual {v1}, Llive/hms/video/sdk/models/HMSRoom;->getTranscriptions()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;->getTranscriptions()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_10

    :cond_f
    new-instance v1, Llive/hms/video/sdk/models/SDKUpdate$Room;

    sget-object v2, Llive/hms/video/sdk/models/enums/HMSRoomUpdate;->TRANSCRIPTIONS_UPDATED:Llive/hms/video/sdk/models/enums/HMSRoomUpdate;

    invoke-direct {v1, v2}, Llive/hms/video/sdk/models/SDKUpdate$Room;-><init>(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_10
    invoke-direct {p0, p1, p2}, Llive/hms/video/sdk/managers/UseCaseUpdateHmsRoom;->saveHMSRoom(Llive/hms/video/sdk/models/HMSNotifications$InitialRoom;Llive/hms/video/sdk/SDKStore;)V

    return-object v0

    :cond_11
    if-nez p1, :cond_12

    iget-object p1, p0, Llive/hms/video/sdk/managers/UseCaseUpdateHmsRoom;->TAG:Ljava/lang/String;

    const-string p2, "new room received is null"

    invoke-static {p1, p2}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_12
    if-nez v1, :cond_13

    iget-object p1, p0, Llive/hms/video/sdk/managers/UseCaseUpdateHmsRoom;->TAG:Ljava/lang/String;

    const-string p2, "Local room from SDK Store was null"

    invoke-static {p1, p2}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_13
    return-object v0
.end method
