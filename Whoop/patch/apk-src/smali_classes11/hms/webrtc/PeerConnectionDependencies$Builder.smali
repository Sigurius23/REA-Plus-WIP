.class public Lhms/webrtc/PeerConnectionDependencies$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/PeerConnectionDependencies;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private observer:Lhms/webrtc/PeerConnection$Observer;

.field private sslCertificateVerifier:Lhms/webrtc/SSLCertificateVerifier;


# direct methods
.method private constructor <init>(Lhms/webrtc/PeerConnection$Observer;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lhms/webrtc/PeerConnectionDependencies$Builder;->observer:Lhms/webrtc/PeerConnection$Observer;

    return-void
.end method

.method public synthetic constructor <init>(Lhms/webrtc/PeerConnection$Observer;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lhms/webrtc/PeerConnectionDependencies$Builder;-><init>(Lhms/webrtc/PeerConnection$Observer;)V

    return-void
.end method


# virtual methods
.method public createPeerConnectionDependencies()Lhms/webrtc/PeerConnectionDependencies;
    .locals 4

    new-instance v0, Lhms/webrtc/PeerConnectionDependencies;

    iget-object v1, p0, Lhms/webrtc/PeerConnectionDependencies$Builder;->observer:Lhms/webrtc/PeerConnection$Observer;

    iget-object v2, p0, Lhms/webrtc/PeerConnectionDependencies$Builder;->sslCertificateVerifier:Lhms/webrtc/SSLCertificateVerifier;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lhms/webrtc/PeerConnectionDependencies;-><init>(Lhms/webrtc/PeerConnection$Observer;Lhms/webrtc/SSLCertificateVerifier;I)V

    return-object v0
.end method

.method public setSSLCertificateVerifier(Lhms/webrtc/SSLCertificateVerifier;)Lhms/webrtc/PeerConnectionDependencies$Builder;
    .locals 0

    iput-object p1, p0, Lhms/webrtc/PeerConnectionDependencies$Builder;->sslCertificateVerifier:Lhms/webrtc/SSLCertificateVerifier;

    return-object p0
.end method
