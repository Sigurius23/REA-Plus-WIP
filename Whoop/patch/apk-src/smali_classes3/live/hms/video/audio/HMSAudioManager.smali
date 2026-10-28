.class public interface abstract Llive/hms/video/audio/HMSAudioManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/audio/HMSAudioManager$AudioDevice;,
        Llive/hms/video/audio/HMSAudioManager$AudioManagerDeviceChangeListener;,
        Llive/hms/video/audio/HMSAudioManager$AudioManagerState;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\"\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008f\u0018\u00002\u00020\u0001:\u0003\u001f !J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\t0\rH&\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010H&\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H&\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH&\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH&\u00a2\u0006\u0004\u0008\u001e\u0010\u001d\u00a8\u0006\""
    }
    d2 = {
        "Llive/hms/video/audio/HMSAudioManager;",
        "",
        "Ll83/a0;",
        "start",
        "()V",
        "stop",
        "",
        "isStarted",
        "()Z",
        "Llive/hms/video/audio/HMSAudioManager$AudioDevice;",
        "device",
        "selectAudioDevice",
        "(Llive/hms/video/audio/HMSAudioManager$AudioDevice;)V",
        "",
        "getAudioDevices",
        "()Ljava/util/Set;",
        "",
        "Llive/hms/video/audio/HMSAudioDeviceInfo;",
        "getAudioDevicesInfoList",
        "()Ljava/util/List;",
        "getSelectedAudioDevice",
        "()Llive/hms/video/audio/HMSAudioManager$AudioDevice;",
        "",
        "audioMode",
        "setAudioMode",
        "(I)V",
        "Llive/hms/video/audio/AudioManagerFocusChangeCallbacks;",
        "callback",
        "addAudioFocusChangeCallback",
        "(Llive/hms/video/audio/AudioManagerFocusChangeCallbacks;)V",
        "removeAudioFocusChangeCallback",
        "AudioDevice",
        "AudioManagerDeviceChangeListener",
        "AudioManagerState",
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
.method public abstract addAudioFocusChangeCallback(Llive/hms/video/audio/AudioManagerFocusChangeCallbacks;)V
.end method

.method public abstract getAudioDevices()Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Llive/hms/video/audio/HMSAudioManager$AudioDevice;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getAudioDevicesInfoList()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/audio/HMSAudioDeviceInfo;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getSelectedAudioDevice()Llive/hms/video/audio/HMSAudioManager$AudioDevice;
.end method

.method public abstract isStarted()Z
.end method

.method public abstract removeAudioFocusChangeCallback(Llive/hms/video/audio/AudioManagerFocusChangeCallbacks;)V
.end method

.method public abstract selectAudioDevice(Llive/hms/video/audio/HMSAudioManager$AudioDevice;)V
.end method

.method public abstract setAudioMode(I)V
.end method

.method public abstract start()V
.end method

.method public abstract stop()V
.end method
