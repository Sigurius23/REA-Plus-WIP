.class public final Llive/hms/video/sdk/managers/ActiveSpeakerManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/sdk/managers/IManager;
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/sdk/managers/ActiveSpeakerManager$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Llive/hms/video/sdk/managers/IManager<",
        "Llive/hms/video/sdk/models/HMSNotifications$SpeakerList;",
        ">;",
        "Ljava/io/Closeable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 \u001d2\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001dB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0008\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Llive/hms/video/sdk/managers/ActiveSpeakerManager;",
        "Llive/hms/video/sdk/managers/IManager;",
        "Llive/hms/video/sdk/models/HMSNotifications$SpeakerList;",
        "Ljava/io/Closeable;",
        "Llive/hms/video/sdk/SDKStore;",
        "store",
        "<init>",
        "(Llive/hms/video/sdk/SDKStore;)V",
        "params",
        "",
        "Llive/hms/video/sdk/models/SDKUpdate;",
        "manage",
        "(Llive/hms/video/sdk/models/HMSNotifications$SpeakerList;)Ljava/util/List;",
        "Ll83/a0;",
        "close",
        "()V",
        "Llive/hms/video/sdk/SDKStore;",
        "getStore",
        "()Llive/hms/video/sdk/SDKStore;",
        "Llive/hms/video/sdk/HMSAudioListener;",
        "audioObserver",
        "Llive/hms/video/sdk/HMSAudioListener;",
        "getAudioObserver",
        "()Llive/hms/video/sdk/HMSAudioListener;",
        "setAudioObserver",
        "(Llive/hms/video/sdk/HMSAudioListener;)V",
        "Llive/hms/video/sdk/models/HMSPeer;",
        "currentDominantSpeaker",
        "Llive/hms/video/sdk/models/HMSPeer;",
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
.field public static final Companion:Llive/hms/video/sdk/managers/ActiveSpeakerManager$Companion;

.field private static final TAG:Ljava/lang/String; = "ActiveSpeakerManager"


# instance fields
.field private audioObserver:Llive/hms/video/sdk/HMSAudioListener;

.field private currentDominantSpeaker:Llive/hms/video/sdk/models/HMSPeer;

.field private final store:Llive/hms/video/sdk/SDKStore;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/sdk/managers/ActiveSpeakerManager$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/sdk/managers/ActiveSpeakerManager$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/sdk/managers/ActiveSpeakerManager;->Companion:Llive/hms/video/sdk/managers/ActiveSpeakerManager$Companion;

    return-void
.end method

.method public constructor <init>(Llive/hms/video/sdk/SDKStore;)V
    .locals 1

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/managers/ActiveSpeakerManager;->store:Llive/hms/video/sdk/SDKStore;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Llive/hms/video/sdk/managers/ActiveSpeakerManager;->audioObserver:Llive/hms/video/sdk/HMSAudioListener;

    iput-object v0, p0, Llive/hms/video/sdk/managers/ActiveSpeakerManager;->currentDominantSpeaker:Llive/hms/video/sdk/models/HMSPeer;

    return-void
.end method

.method public final getAudioObserver()Llive/hms/video/sdk/HMSAudioListener;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/managers/ActiveSpeakerManager;->audioObserver:Llive/hms/video/sdk/HMSAudioListener;

    return-object v0
.end method

.method public getStore()Llive/hms/video/sdk/SDKStore;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/managers/ActiveSpeakerManager;->store:Llive/hms/video/sdk/SDKStore;

    return-object v0
.end method

.method public bridge synthetic manage(Ljava/lang/Object;)Ljava/util/List;
    .locals 0

    .line 1
    check-cast p1, Llive/hms/video/sdk/models/HMSNotifications$SpeakerList;

    invoke-virtual {p0, p1}, Llive/hms/video/sdk/managers/ActiveSpeakerManager;->manage(Llive/hms/video/sdk/models/HMSNotifications$SpeakerList;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public manage(Llive/hms/video/sdk/models/HMSNotifications$SpeakerList;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/HMSNotifications$SpeakerList;",
            ")",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/SDKUpdate;",
            ">;"
        }
    .end annotation

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Llive/hms/video/sdk/managers/ActiveSpeakerManager;->audioObserver:Llive/hms/video/sdk/HMSAudioListener;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$SpeakerList;->getSpeakers()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 3
    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 4
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    .line 5
    check-cast v4, Llive/hms/video/sdk/models/HMSSpeakerServerResponse;

    .line 6
    invoke-virtual {p0}, Llive/hms/video/sdk/managers/ActiveSpeakerManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v5

    invoke-virtual {v4, v5}, Llive/hms/video/sdk/models/HMSSpeakerServerResponse;->toHmsSpeaker$lib_release(Llive/hms/video/sdk/SDKStore;)Llive/hms/video/sdk/models/HMSSpeaker;

    move-result-object v4

    .line 7
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 8
    :cond_0
    new-array v2, v1, [Llive/hms/video/sdk/models/HMSSpeaker;

    invoke-interface {v3, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Llive/hms/video/sdk/models/HMSSpeaker;

    .line 9
    invoke-interface {v0, v2}, Llive/hms/video/sdk/HMSAudioListener;->onAudioLevelUpdate([Llive/hms/video/sdk/models/HMSSpeaker;)V

    .line 10
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    invoke-virtual {p0}, Llive/hms/video/sdk/managers/ActiveSpeakerManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v2

    invoke-virtual {v2}, Llive/hms/video/sdk/SDKStore;->getLocalPeer()Llive/hms/video/sdk/models/HMSLocalPeer;

    move-result-object v2

    .line 12
    const-string v3, "ActiveSpeakerManager"

    if-eqz v2, :cond_6

    .line 13
    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$SpeakerList;->getSpeakers()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 14
    new-instance p1, Llive/hms/video/sdk/models/SDKUpdate$Peer;

    sget-object v1, Llive/hms/video/sdk/models/enums/HMSPeerUpdate;->NO_DOMINANT_SPEAKER:Llive/hms/video/sdk/models/enums/HMSPeerUpdate;

    invoke-direct {p1, v1, v2}, Llive/hms/video/sdk/models/SDKUpdate$Peer;-><init>(Llive/hms/video/sdk/models/enums/HMSPeerUpdate;Llive/hms/video/sdk/models/HMSPeer;)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x0

    .line 15
    iput-object p1, p0, Llive/hms/video/sdk/managers/ActiveSpeakerManager;->currentDominantSpeaker:Llive/hms/video/sdk/models/HMSPeer;

    return-object v0

    .line 16
    :cond_2
    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSNotifications$SpeakerList;->getSpeakers()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llive/hms/video/sdk/models/HMSSpeakerServerResponse;

    .line 17
    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSSpeakerServerResponse;->getPeerId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Llive/hms/video/sdk/models/HMSPeer;->getPeerID()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    .line 18
    :cond_3
    invoke-virtual {p0}, Llive/hms/video/sdk/managers/ActiveSpeakerManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object v1

    invoke-virtual {p1}, Llive/hms/video/sdk/models/HMSSpeakerServerResponse;->getPeerId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Llive/hms/video/sdk/SDKStore;->getPeerById(Ljava/lang/String;)Llive/hms/video/sdk/models/HMSPeer;

    move-result-object v2

    :goto_1
    if-eqz v2, :cond_5

    .line 19
    iget-object p1, p0, Llive/hms/video/sdk/managers/ActiveSpeakerManager;->currentDominantSpeaker:Llive/hms/video/sdk/models/HMSPeer;

    .line 20
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    .line 21
    new-instance p1, Llive/hms/video/sdk/models/SDKUpdate$Peer;

    .line 22
    sget-object v1, Llive/hms/video/sdk/models/enums/HMSPeerUpdate;->BECAME_DOMINANT_SPEAKER:Llive/hms/video/sdk/models/enums/HMSPeerUpdate;

    .line 23
    invoke-direct {p1, v1, v2}, Llive/hms/video/sdk/models/SDKUpdate$Peer;-><init>(Llive/hms/video/sdk/models/enums/HMSPeerUpdate;Llive/hms/video/sdk/models/HMSPeer;)V

    .line 24
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 25
    iput-object v2, p0, Llive/hms/video/sdk/managers/ActiveSpeakerManager;->currentDominantSpeaker:Llive/hms/video/sdk/models/HMSPeer;

    :cond_4
    return-object v0

    .line 26
    :cond_5
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onActiveSpeakerInfoReceived: no peer found for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", store="

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    invoke-virtual {p0}, Llive/hms/video/sdk/managers/ActiveSpeakerManager;->getStore()Llive/hms/video/sdk/SDKStore;

    move-result-object p1

    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 29
    invoke-static {v3, p1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 30
    :cond_6
    const-string p1, "Local Peer is null"

    invoke-static {v3, p1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final setAudioObserver(Llive/hms/video/sdk/HMSAudioListener;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/sdk/managers/ActiveSpeakerManager;->audioObserver:Llive/hms/video/sdk/HMSAudioListener;

    return-void
.end method
