.class public final Llive/hms/video/diagnostics/models/IceCandidatePair;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u000e\u001a\u00020\u000fH\u0016R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR(\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\u0008\"\u0004\u0008\r\u0010\n\u00a8\u0006\u0010"
    }
    d2 = {
        "Llive/hms/video/diagnostics/models/IceCandidatePair;",
        "",
        "<init>",
        "()V",
        "value",
        "Lhms/webrtc/IceCandidate;",
        "local",
        "getLocal",
        "()Lhms/webrtc/IceCandidate;",
        "setLocal$lib_release",
        "(Lhms/webrtc/IceCandidate;)V",
        "remote",
        "getRemote",
        "setRemote$lib_release",
        "toString",
        "",
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
.field private local:Lhms/webrtc/IceCandidate;

.field private remote:Lhms/webrtc/IceCandidate;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getLocal()Lhms/webrtc/IceCandidate;
    .locals 1

    iget-object v0, p0, Llive/hms/video/diagnostics/models/IceCandidatePair;->local:Lhms/webrtc/IceCandidate;

    return-object v0
.end method

.method public final getRemote()Lhms/webrtc/IceCandidate;
    .locals 1

    iget-object v0, p0, Llive/hms/video/diagnostics/models/IceCandidatePair;->remote:Lhms/webrtc/IceCandidate;

    return-object v0
.end method

.method public final setLocal$lib_release(Lhms/webrtc/IceCandidate;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/diagnostics/models/IceCandidatePair;->local:Lhms/webrtc/IceCandidate;

    return-void
.end method

.method public final setRemote$lib_release(Lhms/webrtc/IceCandidate;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/diagnostics/models/IceCandidatePair;->remote:Lhms/webrtc/IceCandidate;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "IceCandidatePair(local="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/diagnostics/models/IceCandidatePair;->local:Lhms/webrtc/IceCandidate;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", remote="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/diagnostics/models/IceCandidatePair;->remote:Lhms/webrtc/IceCandidate;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
