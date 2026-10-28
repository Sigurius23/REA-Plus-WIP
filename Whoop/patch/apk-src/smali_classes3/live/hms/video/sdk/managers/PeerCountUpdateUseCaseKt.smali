.class public final Llive/hms/video/sdk/managers/PeerCountUpdateUseCaseKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00082\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u00a8\u0006\t"
    }
    d2 = {
        "updatePeerCount",
        "Llive/hms/video/sdk/models/SDKUpdate$Room;",
        "increase",
        "",
        "store",
        "Llive/hms/video/sdk/SDKStore;",
        "setPeerCount",
        "givenPeerCount",
        "",
        "lib_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final setPeerCount(ILlive/hms/video/sdk/SDKStore;)Llive/hms/video/sdk/models/SDKUpdate$Room;
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/sdk/SDKStore;->get_room()Llive/hms/video/sdk/models/HMSRoom;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p0}, Llive/hms/video/sdk/models/HMSRoom;->setPeerCount$lib_release(Ljava/lang/Integer;)V

    :cond_0
    new-instance p0, Llive/hms/video/sdk/models/SDKUpdate$Room;

    sget-object p1, Llive/hms/video/sdk/models/enums/HMSRoomUpdate;->ROOM_PEER_COUNT_UPDATED:Llive/hms/video/sdk/models/enums/HMSRoomUpdate;

    invoke-direct {p0, p1}, Llive/hms/video/sdk/models/SDKUpdate$Room;-><init>(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;)V

    return-object p0
.end method

.method public static final updatePeerCount(ZLlive/hms/video/sdk/SDKStore;)Llive/hms/video/sdk/models/SDKUpdate$Room;
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Llive/hms/video/sdk/SDKStore;->get_room()Llive/hms/video/sdk/models/HMSRoom;

    move-result-object p1

    if-eqz p1, :cond_4

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSRoom;->getPeerCount()Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSRoom;->getPeerCount()Ljava/lang/Integer;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    if-eqz p0, :cond_2

    :goto_0
    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSRoom;->getPeerCount()Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSRoom;->getPeerCount()Ljava/lang/Integer;

    move-result-object v0

    :cond_3
    :goto_1
    invoke-virtual {p1, v0}, Llive/hms/video/sdk/models/HMSRoom;->setPeerCount$lib_release(Ljava/lang/Integer;)V

    :cond_4
    new-instance p0, Llive/hms/video/sdk/models/SDKUpdate$Room;

    sget-object p1, Llive/hms/video/sdk/models/enums/HMSRoomUpdate;->ROOM_PEER_COUNT_UPDATED:Llive/hms/video/sdk/models/enums/HMSRoomUpdate;

    invoke-direct {p0, p1}, Llive/hms/video/sdk/models/SDKUpdate$Room;-><init>(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;)V

    return-object p0
.end method
