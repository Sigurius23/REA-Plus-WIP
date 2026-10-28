.class public final Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JS\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;",
        "",
        "<init>",
        "()V",
        "Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;",
        "localMc",
        "Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/IPeerMediaControl;",
        "peerMc",
        "Lkotlin/Function0;",
        "",
        "enabled",
        "Lec3/l;",
        "Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneCallEvents;",
        "audioFocusFlow",
        "Lkotlin/Function1;",
        "Llive/hms/video/sdk/models/enums/HMSRoomUpdate;",
        "Ll83/a0;",
        "fireRoomMuteUpdate",
        "execute",
        "(Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/IPeerMediaControl;Lc93/a;Lec3/l;Lkotlin/jvm/functions/Function1;)Lec3/l;",
        "prevLocalAudioState",
        "Ljava/lang/Boolean;",
        "prevLocalVideoState",
        "Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;",
        "prevPeerAudioState",
        "Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;",
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
.field private prevLocalAudioState:Ljava/lang/Boolean;

.field private prevLocalVideoState:Ljava/lang/Boolean;

.field private prevPeerAudioState:Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$getPrevLocalAudioState$p(Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;->prevLocalAudioState:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static final synthetic access$getPrevLocalVideoState$p(Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;)Ljava/lang/Boolean;
    .locals 0

    iget-object p0, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;->prevLocalVideoState:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static final synthetic access$getPrevPeerAudioState$p(Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;)Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;
    .locals 0

    iget-object p0, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;->prevPeerAudioState:Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;

    return-object p0
.end method

.method public static final synthetic access$setPrevLocalAudioState$p(Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;->prevLocalAudioState:Ljava/lang/Boolean;

    return-void
.end method

.method public static final synthetic access$setPrevLocalVideoState$p(Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;Ljava/lang/Boolean;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;->prevLocalVideoState:Ljava/lang/Boolean;

    return-void
.end method

.method public static final synthetic access$setPrevPeerAudioState$p(Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;->prevPeerAudioState:Llive/hms/video/sdk/managers/local/muteonphonecall/PeersMuteState;

    return-void
.end method


# virtual methods
.method public final execute(Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/IPeerMediaControl;Lc93/a;Lec3/l;Lkotlin/jvm/functions/Function1;)Lec3/l;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;",
            "Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/IPeerMediaControl;",
            "Lc93/a;",
            "Lec3/l;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "localMc"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "peerMc"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enabled"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "audioFocusFlow"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fireRoomMuteUpdate"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4}, Lec3/v;->t(Lec3/l;)Lec3/l;

    move-result-object p4

    new-instance v0, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$$inlined$filter$1;

    invoke-direct {v0, p4, p3}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$$inlined$filter$1;-><init>(Lec3/l;Lc93/a;)V

    new-instance v1, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;

    const/4 v6, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p5

    invoke-direct/range {v1 .. v6}, Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase$execute$2;-><init>(Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/PhoneMutingUseCase;Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/ILocalMediaControl;Llive/hms/video/sdk/managers/local/muteonphonecall/helpers/IPeerMediaControl;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    new-instance p1, Lec3/j1;

    const/4 p2, 0x0

    invoke-direct {p1, v0, v1, p2}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    return-object p1
.end method
