.class public final Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ/\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\u000cH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J1\u0010\u0015\u001a\u00020\u000f2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0004\u0012\u00020\u000f0\u000c2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0019R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 \u00a8\u0006!"
    }
    d2 = {
        "Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;",
        "Ljava/io/Closeable;",
        "Llive/hms/video/sdk/SDKStore;",
        "store",
        "Lec3/l;",
        "Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneCallEvents;",
        "audioFocusFlow",
        "<init>",
        "(Llive/hms/video/sdk/SDKStore;Lec3/l;)V",
        "Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;",
        "peerAudioState",
        "()Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;",
        "Lkotlin/Function1;",
        "",
        "Llive/hms/video/sdk/models/SDKUpdate;",
        "Ll83/a0;",
        "fireUpdates",
        "onPhoneCallManager",
        "(Lkotlin/jvm/functions/Function1;)Lec3/l;",
        "Lbc3/c0;",
        "scope",
        "initPhoneCallManager",
        "(Lkotlin/jvm/functions/Function1;Lbc3/c0;)V",
        "close",
        "()V",
        "Llive/hms/video/sdk/SDKStore;",
        "Lec3/l;",
        "",
        "TAG",
        "Ljava/lang/String;",
        "Lbc3/k1;",
        "phoneCallManagerJob",
        "Lbc3/k1;",
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

.field private final audioFocusFlow:Lec3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field

.field private phoneCallManagerJob:Lbc3/k1;

.field private final store:Llive/hms/video/sdk/SDKStore;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/SDKStore;Lec3/l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/SDKStore;",
            "Lec3/l;",
            ")V"
        }
    .end annotation

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "audioFocusFlow"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->store:Llive/hms/video/sdk/SDKStore;

    iput-object p2, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->audioFocusFlow:Lec3/l;

    const-string p1, "MuteOnPhoneCallManager"

    iput-object p1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->TAG:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$getStore$p(Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;)Llive/hms/video/sdk/SDKStore;
    .locals 0

    iget-object p0, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->store:Llive/hms/video/sdk/SDKStore;

    return-object p0
.end method

.method public static final synthetic access$getTAG$p(Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->TAG:Ljava/lang/String;

    return-object p0
.end method

.method public static final synthetic access$peerAudioState(Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;)Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;
    .locals 0

    invoke-direct {p0}, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->peerAudioState()Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Llive/hms/video/sdk/models/enums/HMSRoomUpdate;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->onPhoneCallManager$lambda$2(Lkotlin/jvm/functions/Function1;Llive/hms/video/sdk/models/enums/HMSRoomUpdate;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static initPhoneCallManager$default(Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;Lkotlin/jvm/functions/Function1;Lbc3/c0;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    sget-object p2, Lbc3/q0;->a:Lkc3/e;

    invoke-static {p2}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p2

    :cond_0
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->initPhoneCallManager(Lkotlin/jvm/functions/Function1;Lbc3/c0;)V

    return-void
.end method

.method private final onPhoneCallManager(Lkotlin/jvm/functions/Function1;)Lec3/l;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v1, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$localMc$1;

    invoke-direct {v1, p0, p1}, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$localMc$1;-><init>(Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;Lkotlin/jvm/functions/Function1;)V

    new-instance v2, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$peerMc$1;

    invoke-direct {v2, p0}, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$peerMc$1;-><init>(Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;)V

    new-instance v0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;

    invoke-direct {v0}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;-><init>()V

    new-instance v3, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$1;

    iget-object v4, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->store:Llive/hms/video/sdk/SDKStore;

    invoke-direct {v3, v4}, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$1;-><init>(Ljava/lang/Object;)V

    iget-object v4, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->audioFocusFlow:Lec3/l;

    new-instance v5, Ll80/k;

    const/16 v6, 0xa

    invoke-direct {v5, p1, v6}, Ll80/k;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual/range {v0 .. v5}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;->execute(Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/IPeerMediaControl;Lc93/a;Lec3/l;Lkotlin/jvm/functions/Function1;)Lec3/l;

    move-result-object p1

    new-instance v0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$3;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$3;-><init>(Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;Lq83/d;)V

    new-instance v1, Lec3/a0;

    invoke-direct {v1, p1, v0}, Lec3/a0;-><init>(Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method

.method private static final onPhoneCallManager$lambda$2(Lkotlin/jvm/functions/Function1;Llive/hms/video/sdk/models/enums/HMSRoomUpdate;)Ll83/a0;
    .locals 1

    const-string v0, "$fireUpdates"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/sdk/models/SDKUpdate$Room;

    invoke-direct {v0, p1}, Llive/hms/video/sdk/models/SDKUpdate$Room;-><init>(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final peerAudioState()Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;
    .locals 7

    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    iget-object v1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->TAG:Ljava/lang/String;

    const-string v2, "Checking if peers are muted"

    invoke-virtual {v0, v1, v2}, Llive/hms/video/utils/HMSLogger;->v(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->store:Llive/hms/video/sdk/SDKStore;

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKStore;->getRemoteTrackCopy()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll83/k;

    iget-object v2, v2, Ll83/k;->x:Ljava/lang/Object;

    check-cast v2, Llive/hms/video/sdk/SDKStore$TrackTimePair;

    invoke-virtual {v2}, Llive/hms/video/sdk/SDKStore$TrackTimePair;->getTrack()Llive/hms/video/media/tracks/HMSTrack;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;

    if-eqz v3, :cond_1

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    sget-object v1, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    iget-object v2, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->TAG:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Received "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " to check"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Llive/hms/video/utils/HMSLogger;->v(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;

    invoke-virtual {v3}, Llive/hms/video/media/tracks/HMSRemoteAudioTrack;->getVolume()D

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmpg-double v3, v3, v5

    if-nez v3, :cond_4

    const/4 v3, 0x1

    goto :goto_2

    :cond_4
    const/4 v3, 0x0

    :goto_2
    if-nez v3, :cond_3

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    :goto_3
    if-eqz v2, :cond_6

    sget-object v0, Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;->PEERS_UNMUTED:Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;

    goto :goto_4

    :cond_6
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_7

    sget-object v0, Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;->NO_PEERS:Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;

    goto :goto_4

    :cond_7
    sget-object v0, Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;->PEERS_MUTE:Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;

    :goto_4
    sget-object v1, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    iget-object v2, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->TAG:Ljava/lang/String;

    const-string v3, "Done checking if peers are muted"

    invoke-virtual {v1, v2, v3}, Llive/hms/video/utils/HMSLogger;->v(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public close()V
    .locals 2

    iget-object v0, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->phoneCallManagerJob:Lbc3/k1;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method

.method public final initPhoneCallManager(Lkotlin/jvm/functions/Function1;Lbc3/c0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lbc3/c0;",
            ")V"
        }
    .end annotation

    const-string v0, "fireUpdates"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->onPhoneCallManager(Lkotlin/jvm/functions/Function1;)Lec3/l;

    move-result-object p1

    invoke-static {p1, p2}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->phoneCallManagerJob:Lbc3/k1;

    return-void
.end method
