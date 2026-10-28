.class public final Llive/hms/video/sdk/managers/RtmpUpdateManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/sdk/managers/IManager;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Llive/hms/video/sdk/managers/IManager<",
        "Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0016\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000c\u001a\u00020\u0002H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\r"
    }
    d2 = {
        "Llive/hms/video/sdk/managers/RtmpUpdateManager;",
        "Llive/hms/video/sdk/managers/IManager;",
        "Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;",
        "store",
        "Llive/hms/video/sdk/SDKStore;",
        "<init>",
        "(Llive/hms/video/sdk/SDKStore;)V",
        "getStore",
        "()Llive/hms/video/sdk/SDKStore;",
        "manage",
        "",
        "Llive/hms/video/sdk/models/SDKUpdate;",
        "params",
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
.field private final store:Llive/hms/video/sdk/SDKStore;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/SDKStore;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/managers/RtmpUpdateManager;->store:Llive/hms/video/sdk/SDKStore;

    return-void
.end method


# virtual methods
.method public getStore()Llive/hms/video/sdk/SDKStore;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/managers/RtmpUpdateManager;->store:Llive/hms/video/sdk/SDKStore;

    return-object v0
.end method

.method public bridge synthetic manage(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    check-cast p1, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;

    invoke-virtual {p0, p1}, Llive/hms/video/sdk/managers/RtmpUpdateManager;->manage(Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public manage(Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;)Ljava/util/List;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;",
            ")",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/SDKUpdate;",
            ">;"
        }
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p0}, Llive/hms/video/sdk/managers/RtmpUpdateManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKStore;->get_room()Llive/hms/video/sdk/models/HMSRoom;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    .line 3
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSRoom;->getRtmpHMSRtmpStreamingState()Llive/hms/video/sdk/models/HMSRtmpStreamingState;

    move-result-object v2

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSRtmpStreamingState;->getState()Llive/hms/video/sdk/models/enums/HMSStreamingState;

    move-result-object v2

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->getState()Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;->toHMSStreamingState()Llive/hms/video/sdk/models/enums/HMSStreamingState;

    move-result-object v3

    goto :goto_0

    :cond_1
    move-object v3, v4

    :goto_0
    if-eq v2, v3, :cond_7

    .line 5
    new-instance v5, Llive/hms/video/sdk/models/HMSRtmpStreamingState;

    .line 6
    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->getState()Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;->toHMSStreamingState()Llive/hms/video/sdk/models/enums/HMSStreamingState;

    move-result-object v2

    goto :goto_1

    :cond_2
    move-object v2, v4

    :goto_1
    sget-object v3, Llive/hms/video/sdk/models/enums/HMSStreamingState;->STARTED:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    if-ne v2, v3, :cond_3

    const/4 v2, 0x1

    :goto_2
    move v6, v2

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    goto :goto_2

    .line 7
    :goto_3
    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->getError()Llive/hms/video/sdk/models/HMSNotifications$ServerError;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSNotifications$ServerError;->toHmsException()Llive/hms/video/error/HMSException;

    move-result-object v4

    :cond_4
    move-object v7, v4

    .line 8
    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->getStartedAt()Ljava/lang/Long;

    move-result-object v8

    .line 9
    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->getStoppedAt()Ljava/lang/Long;

    move-result-object v9

    .line 10
    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$RtmpUpdateNotification;->getState()Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Llive/hms/video/sdk/peerlist/models/BeamStreamingStates;->toHMSStreamingState()Llive/hms/video/sdk/models/enums/HMSStreamingState;

    move-result-object p1

    if-nez p1, :cond_5

    goto :goto_5

    :cond_5
    :goto_4
    move-object v10, p1

    goto :goto_6

    :cond_6
    :goto_5
    sget-object p1, Llive/hms/video/sdk/models/enums/HMSStreamingState;->NONE:Llive/hms/video/sdk/models/enums/HMSStreamingState;

    goto :goto_4

    .line 11
    :goto_6
    invoke-direct/range {v5 .. v10}, Llive/hms/video/sdk/models/HMSRtmpStreamingState;-><init>(ZLlive/hms/video/error/HMSException;Ljava/lang/Long;Ljava/lang/Long;Llive/hms/video/sdk/models/enums/HMSStreamingState;)V

    invoke-virtual {v0, v5}, Llive/hms/video/sdk/models/HMSRoom;->setRtmpHMSRtmpStreamingState$lib_release(Llive/hms/video/sdk/models/HMSRtmpStreamingState;)V

    .line 12
    new-instance p1, Llive/hms/video/sdk/models/SDKUpdate$Room;

    sget-object v0, Llive/hms/video/sdk/models/enums/HMSRoomUpdate;->RTMP_STREAMING_STATE_UPDATED:Llive/hms/video/sdk/models/enums/HMSRoomUpdate;

    invoke-direct {p1, v0}, Llive/hms/video/sdk/models/SDKUpdate$Room;-><init>(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;)V

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    return-object v1
.end method
