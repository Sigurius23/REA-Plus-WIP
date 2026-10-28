.class public final Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$peerMc$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/IPeerMediaControl;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->onPhoneCallManager(Lkotlin/jvm/functions/Function1;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$peerMc$1$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "live/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$peerMc$1",
        "Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/IPeerMediaControl;",
        "Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;",
        "peerAudioState",
        "()Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;",
        "setMuteState",
        "",
        "hasCallEnded",
        "Ll83/a0;",
        "setPeerAudioState",
        "(Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;Z)V",
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
.field final synthetic this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$peerMc$1;->this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public peerAudioState()Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$peerMc$1;->this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;

    invoke-static {v0}, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->access$peerAudioState(Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;)Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;

    move-result-object v0

    return-object v0
.end method

.method public setPeerAudioState(Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;Z)V
    .locals 5

    const-string v0, "setMuteState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    iget-object v1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$peerMc$1;->this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;

    invoke-static {v1}, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->access$getTAG$p(Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Audio mute/unmute of all remote tracks? "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Llive/hms/video/utils/HMSLogger;->v(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$peerMc$1$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v1, v3, :cond_2

    const/4 v4, 0x2

    if-eq v1, v4, :cond_1

    const/4 p2, 0x3

    if-ne v1, p2, :cond_0

    iget-object p2, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$peerMc$1;->this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;

    invoke-static {p2}, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->access$getStore$p(Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;)Llive/hms/video/sdk/SDKStore;

    move-result-object p2

    invoke-virtual {p2, v2}, Llive/hms/video/sdk/SDKStore;->setLocalTracksMute(Z)V

    iget-object p2, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$peerMc$1;->this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;

    invoke-static {p2}, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->access$getStore$p(Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;)Llive/hms/video/sdk/SDKStore;

    move-result-object p2

    invoke-virtual {p2, v2}, Llive/hms/video/sdk/SDKStore;->muteAllRemoteTracks(Z)V

    goto :goto_0

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    iget-object v1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$peerMc$1;->this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;

    invoke-static {v1}, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->access$getStore$p(Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;)Llive/hms/video/sdk/SDKStore;

    move-result-object v1

    xor-int/2addr p2, v3

    invoke-virtual {v1, p2}, Llive/hms/video/sdk/SDKStore;->setLocalTracksMute(Z)V

    iget-object p2, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$peerMc$1;->this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;

    invoke-static {p2}, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->access$getStore$p(Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;)Llive/hms/video/sdk/SDKStore;

    move-result-object p2

    invoke-virtual {p2, v3}, Llive/hms/video/sdk/SDKStore;->muteAllRemoteTracks(Z)V

    goto :goto_0

    :cond_2
    iget-object p2, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$peerMc$1;->this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;

    invoke-static {p2}, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->access$getStore$p(Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;)Llive/hms/video/sdk/SDKStore;

    move-result-object p2

    invoke-virtual {p2, v2}, Llive/hms/video/sdk/SDKStore;->setLocalTracksMute(Z)V

    iget-object p2, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$peerMc$1;->this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;

    invoke-static {p2}, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->access$getStore$p(Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;)Llive/hms/video/sdk/SDKStore;

    move-result-object p2

    invoke-virtual {p2, v2}, Llive/hms/video/sdk/SDKStore;->muteAllRemoteTracks(Z)V

    :goto_0
    iget-object p2, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager$onPhoneCallManager$peerMc$1;->this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;

    invoke-static {p2}, Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;->access$getTAG$p(Llive/hms/video/sdk/managers/local/muteonphonecall/MuteOnPhoneCallManager;)Ljava/lang/String;

    move-result-object p2

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Completed Audio mute/unmute of all remote tracks? "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Llive/hms/video/utils/HMSLogger;->v(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
