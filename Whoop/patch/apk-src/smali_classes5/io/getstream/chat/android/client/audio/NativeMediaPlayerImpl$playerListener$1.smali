.class public final Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu8/h0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;-><init>(Lz8/e;Lc93/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "io/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1",
        "Lu8/h0;",
        "",
        "playbackState",
        "Ll83/a0;",
        "onPlaybackStateChanged",
        "(I)V",
        "",
        "isPlaying",
        "onIsPlayingChanged",
        "(Z)V",
        "Landroidx/media3/common/PlaybackException;",
        "error",
        "onPlayerError",
        "(Landroidx/media3/common/PlaybackException;)V",
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


# instance fields
.field final synthetic this$0:Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1;->this$0:Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic onAudioAttributesChanged(Lu8/d;)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic onAudioSessionIdChanged(I)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic onAvailableCommandsChanged(Lu8/f0;)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic onCues(Ljava/util/List;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    return-void
.end method

.method public final bridge synthetic onCues(Lw8/c;)V
    .locals 0

    .line 2
    return-void
.end method

.method public final bridge synthetic onDeviceInfoChanged(Lu8/i;)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic onDeviceVolumeChanged(IZ)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic onEvents(Lu8/j0;Lu8/g0;)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic onIsLoadingChanged(Z)V
    .locals 0

    return-void
.end method

.method public final onIsPlayingChanged(Z)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1;->this$0:Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->getState()Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    move-result-object v0

    sget-object v1, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->STARTED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    if-eq v0, v1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1;->this$0:Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->setState(Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;)V

    return-void

    :cond_0
    if-nez p1, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1;->this$0:Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->getState()Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    move-result-object p1

    sget-object v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->STARTED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1;->this$0:Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;

    invoke-static {p1}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->access$getExoPlayer(Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;)Landroidx/media3/exoplayer/ExoPlayer;

    move-result-object p1

    check-cast p1, Lb9/f0;

    invoke-virtual {p1}, Lb9/f0;->i0()I

    move-result p1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1;->this$0:Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;

    sget-object v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->PAUSED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->setState(Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;)V

    :cond_1
    return-void
.end method

.method public final bridge synthetic onLoadingChanged(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public final bridge synthetic onMaxSeekToPreviousPositionChanged(J)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic onMediaItemTransition(Lu8/x;I)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic onMediaMetadataChanged(Lu8/a0;)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic onMetadata(Lu8/c0;)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic onPlayWhenReadyChanged(ZI)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic onPlaybackParametersChanged(Lu8/e0;)V
    .locals 0

    return-void
.end method

.method public final onPlaybackStateChanged(I)V
    .locals 1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1;->this$0:Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;

    sget-object v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->PLAYBACK_COMPLETED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->setState(Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1;->this$0:Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;

    invoke-static {p1}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->access$getOnCompletionListener$p(Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;)Lc93/a;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :cond_1
    iget-object p1, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1;->this$0:Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;

    invoke-static {p1}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->access$isPreparing$p(Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1;->this$0:Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->access$setPreparing$p(Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;Z)V

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1;->this$0:Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;

    sget-object v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->PREPARED:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->setState(Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1;->this$0:Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;

    invoke-static {p1}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->access$getOnPreparedListener$p(Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;)Lc93/a;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void

    :cond_2
    iget-object p1, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1;->this$0:Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;

    invoke-static {p1}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->access$isPreparing$p(Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1;->this$0:Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;

    sget-object v0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->PREPARING:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->setState(Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public final bridge synthetic onPlaybackSuppressionReasonChanged(I)V
    .locals 0

    return-void
.end method

.method public final onPlayerError(Landroidx/media3/common/PlaybackException;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1;->this$0:Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;

    sget-object v1, Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;->ERROR:Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->setState(Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1;->this$0:Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;

    invoke-static {v0}, Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;->access$getOnErrorListener$p(Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;)Lkotlin/jvm/functions/Function1;

    move-result-object v0

    if-eqz v0, :cond_0

    iget p1, p1, Landroidx/media3/common/PlaybackException;->w:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    :cond_0
    return-void
.end method

.method public final bridge synthetic onPlayerErrorChanged(Landroidx/media3/common/PlaybackException;)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic onPlayerStateChanged(ZI)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public final bridge synthetic onPlaylistMetadataChanged(Lu8/a0;)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic onPositionDiscontinuity(I)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    return-void
.end method

.method public final bridge synthetic onPositionDiscontinuity(Lu8/i0;Lu8/i0;I)V
    .locals 0

    .line 2
    return-void
.end method

.method public final bridge synthetic onRenderedFirstFrame()V
    .locals 0

    return-void
.end method

.method public final bridge synthetic onRepeatModeChanged(I)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic onSeekBackIncrementChanged(J)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic onSeekForwardIncrementChanged(J)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic onShuffleModeEnabledChanged(Z)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic onSkipSilenceEnabledChanged(Z)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic onSurfaceSizeChanged(II)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic onTimelineChanged(Lu8/o0;I)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic onTrackSelectionParametersChanged(Lu8/t0;)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic onTracksChanged(Lu8/v0;)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic onVideoSizeChanged(Lu8/y0;)V
    .locals 0

    return-void
.end method

.method public final bridge synthetic onVolumeChanged(F)V
    .locals 0

    return-void
.end method
