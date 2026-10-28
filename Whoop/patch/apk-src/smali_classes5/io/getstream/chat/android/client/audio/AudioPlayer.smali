.class public interface abstract Lio/getstream/chat/android/client/audio/AudioPlayer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0018\n\u0002\u0010 \n\u0002\u0008\u000c\u0008g\u0018\u00002\u00020\u0001J+\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&\u00a2\u0006\u0004\u0008\u0008\u0010\tJ+\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004H&\u00a2\u0006\u0004\u0008\u000c\u0010\tJ+\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u0004H&\u00a2\u0006\u0004\u0008\u000f\u0010\tJ\'\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\u001a\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008!\u0010\u001cJ\u0017\u0010\"\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\"\u0010#J\u000f\u0010$\u001a\u00020\rH&\u00a2\u0006\u0004\u0008$\u0010%J\u0017\u0010&\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008&\u0010\'J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008(\u0010\u001cJ\u001d\u0010+\u001a\u00020\u00062\u000c\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00020)H&\u00a2\u0006\u0004\u0008+\u0010,J\u000f\u0010-\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008-\u0010\u0016J\u000f\u0010.\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008.\u0010\u0016R\u0014\u00101\u001a\u00020\u00058&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008/\u00100R\u0014\u00104\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00082\u00103\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u00065\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/audio/AudioPlayer;",
        "",
        "",
        "audioHash",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/client/audio/AudioState;",
        "Ll83/a0;",
        "onAudioStateChange",
        "registerOnAudioStateChange",
        "(ILkotlin/jvm/functions/Function1;)V",
        "Lio/getstream/chat/android/client/audio/ProgressData;",
        "onProgressDataChange",
        "registerOnProgressStateChange",
        "",
        "onSpeedChange",
        "registerOnSpeedChange",
        "",
        "sourceUrl",
        "position",
        "registerTrack",
        "(Ljava/lang/String;II)V",
        "clearTracks",
        "()V",
        "prepare",
        "(Ljava/lang/String;I)V",
        "play",
        "pause",
        "resume",
        "(I)V",
        "resetAudio",
        "positionInMs",
        "seekTo",
        "(II)V",
        "startSeek",
        "changeSpeed",
        "(I)F",
        "currentSpeed",
        "()F",
        "getCurrentPositionInMs",
        "(I)I",
        "removeAudio",
        "",
        "audioHashList",
        "removeAudios",
        "(Ljava/util/List;)V",
        "reset",
        "dispose",
        "getCurrentState",
        "()Lio/getstream/chat/android/client/audio/AudioState;",
        "currentState",
        "getCurrentPlayingId",
        "()I",
        "currentPlayingId",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract changeSpeed(I)F
.end method

.method public abstract clearTracks()V
.end method

.method public abstract currentSpeed()F
.end method

.method public abstract dispose()V
.end method

.method public abstract getCurrentPlayingId()I
.end method

.method public abstract getCurrentPositionInMs(I)I
.end method

.method public abstract getCurrentState()Lio/getstream/chat/android/client/audio/AudioState;
.end method

.method public abstract pause()V
.end method

.method public abstract play(Ljava/lang/String;I)V
.end method

.method public abstract prepare(Ljava/lang/String;I)V
.end method

.method public abstract registerOnAudioStateChange(ILkotlin/jvm/functions/Function1;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation
.end method

.method public abstract registerOnProgressStateChange(ILkotlin/jvm/functions/Function1;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation
.end method

.method public abstract registerOnSpeedChange(ILkotlin/jvm/functions/Function1;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation
.end method

.method public abstract registerTrack(Ljava/lang/String;II)V
.end method

.method public abstract removeAudio(I)V
.end method

.method public abstract removeAudios(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract reset()V
.end method

.method public abstract resetAudio(I)V
.end method

.method public abstract resume(I)V
.end method

.method public abstract seekTo(II)V
.end method

.method public abstract startSeek(I)V
.end method
