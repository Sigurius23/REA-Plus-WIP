.class public final Le33/j0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lt23/l;

.field public final c:Lt23/l;

.field public final d:Lt23/l;

.field public final e:Lorg/webrtc/Logging$Severity;

.field public f:Lstream/video/sfu/models/AudioBitrateProfile;

.field public final g:Ll83/p;

.field public final h:Ll83/p;

.field public i:Ld33/p;

.field public j:Lc2/q;

.field public k:Ld33/q;

.field public l:Ld33/r;

.field public final m:Ll83/p;

.field public final n:Ll83/p;

.field public final o:Ll83/p;

.field public p:Lorg/webrtc/audio/JavaAudioDeviceModule;

.field public volatile q:Landroid/media/AudioDeviceInfo;

.field public volatile r:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lt23/l;Lt23/l;Lt23/l;Lorg/webrtc/Logging$Severity;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webRtcLoggingLevel"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le33/j0;->a:Landroid/content/Context;

    iput-object p2, p0, Le33/j0;->b:Lt23/l;

    iput-object p3, p0, Le33/j0;->c:Lt23/l;

    iput-object p4, p0, Le33/j0;->d:Lt23/l;

    iput-object p5, p0, Le33/j0;->e:Lorg/webrtc/Logging$Severity;

    const-string p1, "Call:WebRTC"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Le33/j0;->g:Ll83/p;

    const-string p1, "Call:AudioTrackCallback"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Le33/j0;->h:Ll83/p;

    new-instance p1, Le33/x;

    invoke-direct {p1, p0}, Le33/x;-><init>(Le33/j0;)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    new-instance p1, Le33/h0;

    invoke-direct {p1, p0}, Le33/h0;-><init>(Le33/j0;)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Le33/j0;->m:Ll83/p;

    new-instance p1, Le33/i0;

    invoke-direct {p1, p0}, Le33/i0;-><init>(Le33/j0;)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Le33/j0;->n:Ll83/p;

    new-instance p1, Le33/y;

    invoke-direct {p1, p0}, Le33/y;-><init>(Le33/j0;)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Le33/j0;->o:Ll83/p;

    return-void
.end method


# virtual methods
.method public final a()Lb23/k;
    .locals 1

    iget-object v0, p0, Le33/j0;->h:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public final b()Lorg/webrtc/PeerConnectionFactory;
    .locals 1

    iget-object v0, p0, Le33/j0;->o:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/webrtc/PeerConnectionFactory;

    return-object v0
.end method

.method public final c()Lb23/k;
    .locals 1

    iget-object v0, p0, Le33/j0;->g:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public final d(Lorg/webrtc/PeerConnection$RTCConfiguration;Le33/u;)Lorg/webrtc/PeerConnection;
    .locals 1

    invoke-virtual {p0}, Le33/j0;->b()Lorg/webrtc/PeerConnectionFactory;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/webrtc/PeerConnectionFactory;->createPeerConnection(Lorg/webrtc/PeerConnection$RTCConfiguration;Lorg/webrtc/PeerConnection$Observer;)Lorg/webrtc/PeerConnection;

    move-result-object p1

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Required value was null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e(Ljava/lang/String;Lorg/webrtc/VideoSource;)Lorg/webrtc/VideoTrack;
    .locals 1

    invoke-virtual {p0}, Le33/j0;->b()Lorg/webrtc/PeerConnectionFactory;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lorg/webrtc/PeerConnectionFactory;->createVideoTrack(Ljava/lang/String;Lorg/webrtc/VideoSource;)Lorg/webrtc/VideoTrack;

    move-result-object p1

    const-string p2, "createVideoTrack(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
