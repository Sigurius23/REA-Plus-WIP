.class public interface abstract Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/audio/HMSAudioManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "AudioManagerDeviceChangeListener"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J%\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH&\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;",
        "",
        "Llive/hms/video/audio/HMSAudioManager$AudioDevice;",
        "selectedAudioDevice",
        "",
        "availableAudioDevices",
        "Ll83/a0;",
        "onAudioDeviceChanged",
        "(Llive/hms/video/audio/HMSAudioManager$AudioDevice;Ljava/util/Set;)V",
        "",
        "Llive/hms/video/audio/HMSAudioDeviceInfo;",
        "availableAudioInfoDevices",
        "onAudioDeviceInfoChanged",
        "(Llive/hms/video/audio/HMSAudioManager$AudioDevice;Ljava/util/List;)V",
        "Llive/hms/video/error/HMSException;",
        "e",
        "onError",
        "(Llive/hms/video/error/HMSException;)V",
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


# virtual methods
.method public abstract onAudioDeviceChanged(Llive/hms/video/audio/HMSAudioManager$AudioDevice;Ljava/util/Set;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/audio/HMSAudioManager$AudioDevice;",
            "Ljava/util/Set<",
            "+",
            "Llive/hms/video/audio/HMSAudioManager$AudioDevice;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onAudioDeviceInfoChanged(Llive/hms/video/audio/HMSAudioManager$AudioDevice;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/audio/HMSAudioManager$AudioDevice;",
            "Ljava/util/List<",
            "Llive/hms/video/audio/HMSAudioDeviceInfo;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract onError(Llive/hms/video/error/HMSException;)V
.end method
