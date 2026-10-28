.class final Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;->execute(Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/IPeerMediaControl;Lc93/a;Lec3/l;Lkotlin/jvm/functions/Function1;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneCallEvents;",
        "phoneInterruptEvents",
        "Ll83/a0;",
        "<anonymous>",
        "(Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneCallEvents;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x0,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "live.hms.video.sdk.managers.local.muteonphonecall.helpers.PhoneMutingUseCase$execute$2"
    f = "PhoneMutingUseCase.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $fireRoomMuteUpdate:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic $localMc:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;

.field final synthetic $peerMc:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/IPeerMediaControl;

.field synthetic L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/IPeerMediaControl;Lkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;",
            "Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;",
            "Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/IPeerMediaControl;",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;

    iput-object p2, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->$localMc:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;

    iput-object p3, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->$peerMc:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/IPeerMediaControl;

    iput-object p4, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->$fireRoomMuteUpdate:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;

    iget-object v1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;

    iget-object v2, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->$localMc:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;

    iget-object v3, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->$peerMc:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/IPeerMediaControl;

    iget-object v4, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->$fireRoomMuteUpdate:Lkotlin/jvm/functions/Function1;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;-><init>(Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/IPeerMediaControl;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    iput-object p1, v0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->L$0:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneCallEvents;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->invoke(Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneCallEvents;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneCallEvents;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneCallEvents;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->label:I

    if-nez v0, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->L$0:Ljava/lang/Object;

    check-cast p1, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneCallEvents;

    sget-object v0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneCallEvents$MUTE_ALL;->INSTANCE:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneCallEvents$MUTE_ALL;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;

    iget-object v0, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->$localMc:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;

    invoke-interface {v0}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;->isLocalAudioEnabled()Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1, v0}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;->access$setPrevLocalAudioState$p(Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;Ljava/lang/Boolean;)V

    iget-object p1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;

    iget-object v0, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->$localMc:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;

    invoke-interface {v0}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;->isLocalVideoEnabled()Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {p1, v0}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;->access$setPrevLocalVideoState$p(Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;Ljava/lang/Boolean;)V

    iget-object p1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;

    iget-object v0, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->$peerMc:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/IPeerMediaControl;

    invoke-interface {v0}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/IPeerMediaControl;->peerAudioState()Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;

    move-result-object v0

    invoke-static {p1, v0}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;->access$setPrevPeerAudioState$p(Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;)V

    iget-object p1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->$localMc:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;->setLocalAudioEnabled(Z)V

    iget-object p1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->$localMc:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;

    invoke-interface {p1, v0}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;->setLocalVideoEnabled(Z)V

    iget-object p1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->$peerMc:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/IPeerMediaControl;

    sget-object v1, Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;->PEERS_MUTE:Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;

    invoke-interface {p1, v1, v0}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/IPeerMediaControl;->setPeerAudioState(Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;Z)V

    iget-object p1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->$fireRoomMuteUpdate:Lkotlin/jvm/functions/Function1;

    sget-object v0, Llive/hms/video/sdk/models/enums/HMSRoomUpdate;->ROOM_MUTED:Llive/hms/video/sdk/models/enums/HMSRoomUpdate;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    sget-object v0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneCallEvents$UNMUTE_ALL;->INSTANCE:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneCallEvents$UNMUTE_ALL;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;

    invoke-static {p1}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;->access$getPrevLocalAudioState$p(Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;)Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->$localMc:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-interface {v0, p1}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;->setLocalAudioEnabled(Z)V

    :cond_1
    iget-object p1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;

    invoke-static {p1}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;->access$getPrevLocalVideoState$p(Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;)Ljava/lang/Boolean;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->$localMc:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-interface {v0, p1}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;->setLocalVideoEnabled(Z)V

    :cond_2
    iget-object p1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->this$0:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;

    invoke-static {p1}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;->access$getPrevPeerAudioState$p(Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;)Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->$peerMc:Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/IPeerMediaControl;

    const/4 v1, 0x1

    invoke-interface {v0, p1, v1}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/IPeerMediaControl;->setPeerAudioState(Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;Z)V

    :cond_3
    iget-object p1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;->$fireRoomMuteUpdate:Lkotlin/jvm/functions/Function1;

    sget-object v0, Llive/hms/video/sdk/models/enums/HMSRoomUpdate;->ROOM_UNMUTED:Llive/hms/video/sdk/models/enums/HMSRoomUpdate;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
