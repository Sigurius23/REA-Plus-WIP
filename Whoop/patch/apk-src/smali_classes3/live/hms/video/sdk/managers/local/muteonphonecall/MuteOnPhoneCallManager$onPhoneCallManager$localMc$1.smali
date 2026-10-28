.class public final Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$localMc$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->onPhoneCallManager(Lkotlin/jvm/functions/Function1;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0004J\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\n\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "live/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$localMc$1",
        "Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;",
        "",
        "isLocalAudioEnabled",
        "()Ljava/lang/Boolean;",
        "isLocalVideoEnabled",
        "enabled",
        "Ll83/a0;",
        "setLocalAudioEnabled",
        "(Z)V",
        "setLocalVideoEnabled",
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
.field final synthetic $fireUpdates:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$localMc$1;->this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;

    iput-object p2, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$localMc$1;->$fireUpdates:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public isLocalAudioEnabled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$localMc$1;->this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;

    invoke-static {v0}, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->access$getStore$p(Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;)Llive/hms/video/sdk/SDKStore;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKStore;->getLocalPeer()Llive/hms/video/sdk/models/HMSLocalPeer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSLocalPeer;->getAudioTrack()Llive/hms/video/media/tracks/HMSLocalAudioTrack;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSTrack;->isMute()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public isLocalVideoEnabled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$localMc$1;->this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;

    invoke-static {v0}, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->access$getStore$p(Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;)Llive/hms/video/sdk/SDKStore;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKStore;->getLocalPeer()Llive/hms/video/sdk/models/HMSLocalPeer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSLocalPeer;->getVideoTrack()Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Llive/hms/video/media/tracks/HMSTrack;->isMute()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public setLocalAudioEnabled(Z)V
    .locals 4

    iget-object v0, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$localMc$1;->this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;

    invoke-static {v0}, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->access$getStore$p(Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;)Llive/hms/video/sdk/SDKStore;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKStore;->getLocalPeer()Llive/hms/video/sdk/models/HMSLocalPeer;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$localMc$1;->$fireUpdates:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSLocalPeer;->getAudioTrack()Llive/hms/video/media/tracks/HMSLocalAudioTrack;

    move-result-object v2

    if-eqz v2, :cond_1

    xor-int/lit8 v3, p1, 0x1

    invoke-virtual {v2, v3}, Llive/hms/video/media/tracks/HMSLocalAudioTrack;->setMute(Z)V

    if-eqz p1, :cond_0

    sget-object p1, Llive/hms/video/sdk/models/enums/HMSTrackUpdate;->TRACK_UNMUTED:Llive/hms/video/sdk/models/enums/HMSTrackUpdate;

    goto :goto_0

    :cond_0
    sget-object p1, Llive/hms/video/sdk/models/enums/HMSTrackUpdate;->TRACK_MUTED:Llive/hms/video/sdk/models/enums/HMSTrackUpdate;

    :goto_0
    new-instance v3, Llive/hms/video/sdk/models/SDKUpdate$Track;

    invoke-direct {v3, p1, v2, v0}, Llive/hms/video/sdk/models/SDKUpdate$Track;-><init>(Llive/hms/video/sdk/models/enums/HMSTrackUpdate;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public setLocalVideoEnabled(Z)V
    .locals 4

    iget-object v0, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$localMc$1;->this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;

    invoke-static {v0}, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->access$getStore$p(Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;)Llive/hms/video/sdk/SDKStore;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/sdk/SDKStore;->getLocalPeer()Llive/hms/video/sdk/models/HMSLocalPeer;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$localMc$1;->$fireUpdates:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v0}, Llive/hms/video/sdk/models/HMSLocalPeer;->getVideoTrack()Llive/hms/video/media/tracks/HMSLocalVideoTrack;

    move-result-object v2

    if-eqz v2, :cond_1

    xor-int/lit8 v3, p1, 0x1

    invoke-virtual {v2, v3}, Llive/hms/video/media/tracks/HMSLocalVideoTrack;->setMute(Z)V

    if-eqz p1, :cond_0

    sget-object p1, Llive/hms/video/sdk/models/enums/HMSTrackUpdate;->TRACK_UNMUTED:Llive/hms/video/sdk/models/enums/HMSTrackUpdate;

    goto :goto_0

    :cond_0
    sget-object p1, Llive/hms/video/sdk/models/enums/HMSTrackUpdate;->TRACK_MUTED:Llive/hms/video/sdk/models/enums/HMSTrackUpdate;

    :goto_0
    new-instance v3, Llive/hms/video/sdk/models/SDKUpdate$Track;

    invoke-direct {v3, p1, v2, v0}, Llive/hms/video/sdk/models/SDKUpdate$Track;-><init>(Llive/hms/video/sdk/models/enums/HMSTrackUpdate;Llive/hms/video/media/tracks/HMSTrack;Llive/hms/video/sdk/models/HMSPeer;)V

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-interface {v1, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
