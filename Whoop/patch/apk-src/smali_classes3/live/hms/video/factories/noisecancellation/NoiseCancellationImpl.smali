.class public final Llive/hms/video/factories/noisecancellation/NoiseCancellationImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/factories/noisecancellation/NoiseCancellation;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0012R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Llive/hms/video/factories/noisecancellation/NoiseCancellationImpl;",
        "Llive/hms/video/factories/noisecancellation/NoiseCancellation;",
        "Lhms/webrtc/KrispAudioProcessingImpl;",
        "krisp",
        "Lkotlin/Function0;",
        "",
        "isNoiseCancellationFlagEnabled",
        "<init>",
        "(Lhms/webrtc/KrispAudioProcessingImpl;Lc93/a;)V",
        "enabled",
        "Lhms/webrtc/AudioProcessingFactory;",
        "getAudioProcessingFactory",
        "(Z)Lhms/webrtc/AudioProcessingFactory;",
        "Ll83/a0;",
        "setNoiseCancellationEnabled",
        "(Z)V",
        "getNoiseCancellationEnabled",
        "()Z",
        "Lhms/webrtc/KrispAudioProcessingImpl;",
        "Lc93/a;",
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
.field private final isNoiseCancellationFlagEnabled:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final krisp:Lhms/webrtc/KrispAudioProcessingImpl;


# direct methods
.method public constructor <init>(Lhms/webrtc/KrispAudioProcessingImpl;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhms/webrtc/KrispAudioProcessingImpl;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "krisp"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isNoiseCancellationFlagEnabled"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationImpl;->krisp:Lhms/webrtc/KrispAudioProcessingImpl;

    iput-object p2, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationImpl;->isNoiseCancellationFlagEnabled:Lc93/a;

    return-void
.end method


# virtual methods
.method public getAudioProcessingFactory(Z)Lhms/webrtc/AudioProcessingFactory;
    .locals 3

    invoke-virtual {p0}, Llive/hms/video/factories/noisecancellation/NoiseCancellationImpl;->getNcLogTag()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Noise Cancellation Loaded!, initial state "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", dashboard "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationImpl;->isNoiseCancellationFlagEnabled:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0, p1}, Llive/hms/video/factories/noisecancellation/NoiseCancellationImpl;->setNoiseCancellationEnabled(Z)V

    iget-object p1, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationImpl;->krisp:Lhms/webrtc/KrispAudioProcessingImpl;

    return-object p1
.end method

.method public getNcLogTag()Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Llive/hms/video/factories/noisecancellation/NoiseCancellation$DefaultImpls;->getNcLogTag(Llive/hms/video/factories/noisecancellation/NoiseCancellation;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getNoiseCancellationEnabled()Z
    .locals 1

    iget-object v0, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationImpl;->krisp:Lhms/webrtc/KrispAudioProcessingImpl;

    invoke-virtual {v0}, Lhms/webrtc/KrispAudioProcessingImpl;->IsEnabled()Z

    move-result v0

    return v0
.end method

.method public setNoiseCancellationEnabled(Z)V
    .locals 1

    iget-object v0, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationImpl;->krisp:Lhms/webrtc/KrispAudioProcessingImpl;

    if-eqz p1, :cond_0

    iget-object p1, p0, Llive/hms/video/factories/noisecancellation/NoiseCancellationImpl;->isNoiseCancellationFlagEnabled:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Lhms/webrtc/KrispAudioProcessingImpl;->Enable(Z)V

    return-void
.end method
