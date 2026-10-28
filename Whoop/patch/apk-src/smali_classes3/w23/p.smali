.class public final Lw23/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Lhc3/d;

.field public final d:Lz23/c;

.field public final e:Lso/q;

.field public final f:La30/w0;

.field public final g:Lw23/r;

.field public final h:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lhc3/d;Lz23/c;Lso/q;La30/w0;)V
    .locals 2

    new-instance v0, Lw23/r;

    invoke-direct {v0}, Lw23/r;-><init>()V

    const-string v1, "callType"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "reporter"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw23/p;->a:Ljava/lang/String;

    iput-object p2, p0, Lw23/p;->b:Ljava/lang/String;

    iput-object p3, p0, Lw23/p;->c:Lhc3/d;

    iput-object p4, p0, Lw23/p;->d:Lz23/c;

    iput-object p5, p0, Lw23/p;->e:Lso/q;

    iput-object p6, p0, Lw23/p;->f:La30/w0;

    iput-object v0, p0, Lw23/p;->g:Lw23/r;

    sget-object p1, Lorg/webrtc/PeerConnection$PeerConnectionState;->CONNECTING:Lorg/webrtc/PeerConnection$PeerConnectionState;

    sget-object p2, Lorg/webrtc/PeerConnection$PeerConnectionState;->FAILED:Lorg/webrtc/PeerConnection$PeerConnectionState;

    sget-object p3, Lorg/webrtc/PeerConnection$PeerConnectionState;->CONNECTED:Lorg/webrtc/PeerConnection$PeerConnectionState;

    filled-new-array {p1, p2, p3}, [Lorg/webrtc/PeerConnection$PeerConnectionState;

    move-result-object p1

    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lw23/p;->h:Ljava/util/List;

    return-void
.end method
