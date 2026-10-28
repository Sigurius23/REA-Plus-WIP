.class public final Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment$createPlayer$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu8/h0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->createPlayer()Lu8/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "io/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment$createPlayer$1",
        "Lu8/h0;",
        "",
        "playbackState",
        "Ll83/a0;",
        "onPlaybackStateChanged",
        "(I)V",
        "Landroidx/media3/common/PlaybackException;",
        "error",
        "onPlayerError",
        "(Landroidx/media3/common/PlaybackException;)V",
        "stream-chat-android-ui-components_release"
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
.field final synthetic this$0:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment$createPlayer$1;->this$0:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;

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

.method public final bridge synthetic onIsPlayingChanged(Z)V
    .locals 0

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
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment$createPlayer$1;->this$0:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;

    invoke-static {v0}, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;->access$get_binding$p(Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;)Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentGalleryVideoBinding;->progressBar:Landroid/widget/ProgressBar;

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    const/16 v1, 0x8

    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_2
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

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment$createPlayer$1;->this$0:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment$createPlayer$1;->this$0:Lio/getstream/chat/android/ui/feature/gallery/internal/AttachmentGalleryVideoPageFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lio/getstream/chat/android/ui/R$string;->stream_ui_attachment_gallery_video_display_error:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

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
