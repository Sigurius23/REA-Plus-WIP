package io.getstream.chat.android.client.audio;

import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import c93.InterfaceC4339a;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.io.IOException;
import java.util.List;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p004a2.AbstractC0152a;
import p031b9.C2830f0;
import p299l9.AbstractC23481a;
import p299l9.C23530u0;
import p299l9.InterfaceC23485b0;
import p499t9.C33640l;
import p516u8.AbstractC34609o0;
import p516u8.C34581a0;
import p516u8.C34585c0;
import p516u8.C34586d;
import p516u8.C34589e0;
import p516u8.C34591f0;
import p516u8.C34593g0;
import p516u8.C34596i;
import p516u8.C34597i0;
import p516u8.C34619t0;
import p516u8.C34623v0;
import p516u8.C34626x;
import p516u8.C34629y0;
import p516u8.InterfaceC34595h0;
import p516u8.InterfaceC34599j0;
import p576w8.C36933c;
import p674z8.InterfaceC40169e;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f*\u0001@\b\u0001\u0018\u0000 Q2\u00020\u0001:\u0001QB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ\u000f\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u000fJ\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u000fJ\u001d\u0010\u001a\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001c\u001a\u00020\u000b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ#\u0010\u001f\u001a\u00020\u000b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\u0005*\u00020\u0005H\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\u00020\u0005*\u00020\u0005H\u0002¢\u0006\u0004\b#\u0010\"R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R(\u0010,\u001a\u0004\u0018\u00010\u00052\b\u0010+\u001a\u0004\u0018\u00010\u00058\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010$R$\u00104\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001e\u00106\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010$R\u0016\u00107\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R*\u0010:\u001a\u0002092\u0006\u0010+\u001a\u0002098\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR$\u0010H\u001a\u00020C2\u0006\u0010+\u001a\u00020C8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0014\u0010K\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010JR\u0014\u0010P\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006R"}, m65681d2 = {"Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl;", "Lio/getstream/chat/android/client/audio/NativeMediaPlayer;", "Lz8/e;", "dataSourceFactory", "Lkotlin/Function0;", "Landroidx/media3/exoplayer/ExoPlayer;", "builder", "<init>", "(Lz8/e;Lc93/a;)V", "", "path", "Ll83/a0;", "setDataSource", "(Ljava/lang/String;)V", "prepareAsync", "()V", "", "msec", "seekTo", "(I)V", "start", "pause", "stop", "reset", "release", "listener", "setOnPreparedListener", "(Lc93/a;)V", "setOnCompletionListener", "Lkotlin/Function1;", "", "setOnErrorListener", "(Lkotlin/jvm/functions/Function1;)V", "setupListeners", "(Landroidx/media3/exoplayer/ExoPlayer;)Landroidx/media3/exoplayer/ExoPlayer;", "clearListeners", "Lc93/a;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "value", "_exoPlayer", "Landroidx/media3/exoplayer/ExoPlayer;", "set_exoPlayer", "(Landroidx/media3/exoplayer/ExoPlayer;)V", "Ll9/b0;", "mediaSourceFactory", "Ll9/b0;", "onCompletionListener", "onErrorListener", "Lkotlin/jvm/functions/Function1;", "onPreparedListener", "isPreparing", "Z", "Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;", "state", "Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;", "getState", "()Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;", "setState", "(Lio/getstream/chat/android/client/audio/NativeMediaPlayerState;)V", "io/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1", "playerListener", "Lio/getstream/chat/android/client/audio/NativeMediaPlayerImpl$playerListener$1;", "", "getSpeed", "()F", "setSpeed", "(F)V", "speed", "getCurrentPosition", "()I", "currentPosition", "getDuration", AttachmentExtensionsKt.EXTRA_DURATION, "getExoPlayer", "()Landroidx/media3/exoplayer/ExoPlayer;", "exoPlayer", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class NativeMediaPlayerImpl implements NativeMediaPlayer {
    private static final boolean DEBUG = false;
    private ExoPlayer _exoPlayer;
    private final InterfaceC4339a builder;
    private boolean isPreparing;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final InterfaceC23485b0 mediaSourceFactory;
    private InterfaceC4339a onCompletionListener;
    private Function1 onErrorListener;
    private InterfaceC4339a onPreparedListener;
    private final NativeMediaPlayerImpl$playerListener$1 playerListener;
    private NativeMediaPlayerState state;

    /* JADX WARN: Type inference failed for: r3v3, types: [io.getstream.chat.android.client.audio.NativeMediaPlayerImpl$playerListener$1] */
    public NativeMediaPlayerImpl(InterfaceC40169e dataSourceFactory, InterfaceC4339a builder) {
        AbstractC22676k.m65750j(dataSourceFactory, "dataSourceFactory");
        AbstractC22676k.m65750j(builder, "builder");
        this.builder = builder;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:NativeMediaPlayer");
        C33640l c33640l = new C33640l();
        synchronized (c33640l) {
            c33640l.f140413w = true;
        }
        this.mediaSourceFactory = new C23530u0(dataSourceFactory, c33640l);
        this.state = NativeMediaPlayerState.END;
        this.playerListener = new InterfaceC34595h0() { // from class: io.getstream.chat.android.client.audio.NativeMediaPlayerImpl$playerListener$1
            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onAudioAttributesChanged(C34586d c34586d) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i13) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onAvailableCommandsChanged(C34591f0 c34591f0) {
            }

            @Override // p516u8.InterfaceC34595h0
            @Deprecated
            public final /* bridge */ /* synthetic */ void onCues(List list) {
            }

            public final /* bridge */ /* synthetic */ void onDeviceInfoChanged(C34596i c34596i) {
            }

            public final /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i13, boolean z4) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onEvents(InterfaceC34599j0 interfaceC34599j0, C34593g0 c34593g0) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z4) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final void onIsPlayingChanged(boolean isPlaying) {
                if (isPlaying) {
                    NativeMediaPlayerState state = this.this$0.getState();
                    NativeMediaPlayerState nativeMediaPlayerState = NativeMediaPlayerState.STARTED;
                    if (state != nativeMediaPlayerState) {
                        this.this$0.setState(nativeMediaPlayerState);
                        return;
                    }
                }
                if (isPlaying || this.this$0.getState() != NativeMediaPlayerState.STARTED || ((C2830f0) this.this$0.getExoPlayer()).m8110i0() == 4) {
                    return;
                }
                this.this$0.setState(NativeMediaPlayerState.PAUSED);
            }

            @Deprecated
            public final /* bridge */ /* synthetic */ void onLoadingChanged(boolean z4) {
            }

            public final /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j7) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onMediaItemTransition(C34626x c34626x, int i13) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onMediaMetadataChanged(C34581a0 c34581a0) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onMetadata(C34585c0 c34585c0) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z4, int i13) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onPlaybackParametersChanged(C34589e0 c34589e0) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final void onPlaybackStateChanged(int playbackState) {
                if (playbackState == 2) {
                    if (this.this$0.isPreparing) {
                        this.this$0.setState(NativeMediaPlayerState.PREPARING);
                        return;
                    }
                    return;
                }
                if (playbackState != 3) {
                    if (playbackState != 4) {
                        return;
                    }
                    this.this$0.setState(NativeMediaPlayerState.PLAYBACK_COMPLETED);
                    InterfaceC4339a interfaceC4339a = this.this$0.onCompletionListener;
                    if (interfaceC4339a != null) {
                        interfaceC4339a.invoke();
                        return;
                    }
                    return;
                }
                if (this.this$0.isPreparing) {
                    this.this$0.isPreparing = false;
                    this.this$0.setState(NativeMediaPlayerState.PREPARED);
                    InterfaceC4339a interfaceC4339a2 = this.this$0.onPreparedListener;
                    if (interfaceC4339a2 != null) {
                        interfaceC4339a2.invoke();
                    }
                }
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i13) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final void onPlayerError(PlaybackException error) {
                AbstractC22676k.m65750j(error, "error");
                this.this$0.setState(NativeMediaPlayerState.ERROR);
                Function1 function1 = this.this$0.onErrorListener;
                if (function1 != null) {
                }
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
            }

            @Override // p516u8.InterfaceC34595h0
            @Deprecated
            public final /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z4, int i13) {
            }

            public final /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(C34581a0 c34581a0) {
            }

            @Deprecated
            public final /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i13) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onRepeatModeChanged(int i13) {
            }

            public final /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j7) {
            }

            public final /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j7) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z4) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z4) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i13, int i14) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onTimelineChanged(AbstractC34609o0 abstractC34609o0, int i13) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(C34619t0 c34619t0) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onTracksChanged(C34623v0 c34623v0) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onVideoSizeChanged(C34629y0 c34629y0) {
            }

            public final /* bridge */ /* synthetic */ void onVolumeChanged(float f13) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onCues(C36933c c36933c) {
            }

            @Override // p516u8.InterfaceC34595h0
            public final /* bridge */ /* synthetic */ void onPositionDiscontinuity(C34597i0 c34597i0, C34597i0 c34597i1, int i13) {
            }
        };
    }

    private final ExoPlayer clearListeners(ExoPlayer exoPlayer) {
        C2830f0 c2830f0 = (C2830f0) exoPlayer;
        c2830f0.m8118s0(this.playerListener);
        return c2830f0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExoPlayer getExoPlayer() {
        ExoPlayer exoPlayer = this._exoPlayer;
        if (exoPlayer != null) {
            return exoPlayer;
        }
        ExoPlayer exoPlayer2 = (ExoPlayer) this.builder.invoke();
        this._exoPlayer = setupListeners(exoPlayer2);
        setState(NativeMediaPlayerState.IDLE);
        return exoPlayer2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final void set_exoPlayer(ExoPlayer exoPlayer) {
        this._exoPlayer = exoPlayer;
    }

    private final ExoPlayer setupListeners(ExoPlayer exoPlayer) {
        C2830f0 c2830f0 = (C2830f0) exoPlayer;
        c2830f0.m8092Q(this.playerListener);
        return c2830f0;
    }

    @Override // io.getstream.chat.android.client.audio.NativeMediaPlayer
    public final int getCurrentPosition() {
        return (int) ((C2830f0) getExoPlayer()).m8102a0();
    }

    @Override // io.getstream.chat.android.client.audio.NativeMediaPlayer
    public final int getDuration() {
        return (int) ((C2830f0) getExoPlayer()).m8107f0();
    }

    @Override // io.getstream.chat.android.client.audio.NativeMediaPlayer
    public final float getSpeed() {
        return ((C2830f0) getExoPlayer()).m8109h0().f145648a;
    }

    @Override // io.getstream.chat.android.client.audio.NativeMediaPlayer
    public final NativeMediaPlayerState getState() {
        return this.state;
    }

    @Override // io.getstream.chat.android.client.audio.NativeMediaPlayer
    public final void pause() throws IllegalStateException {
        ((C2830f0) getExoPlayer()).m8125z0(false);
        setState(NativeMediaPlayerState.PAUSED);
    }

    @Override // io.getstream.chat.android.client.audio.NativeMediaPlayer
    public final void prepareAsync() throws IllegalStateException {
        ExoPlayer exoPlayer = getExoPlayer();
        this.isPreparing = true;
        setState(NativeMediaPlayerState.PREPARING);
        ((C2830f0) exoPlayer).m8116q0();
    }

    @Override // io.getstream.chat.android.client.audio.NativeMediaPlayer
    public final void release() {
        ExoPlayer exoPlayer = this._exoPlayer;
        if (exoPlayer == null) {
            return;
        }
        ((C2830f0) clearListeners(exoPlayer)).m8117r0();
        setState(NativeMediaPlayerState.END);
        this._exoPlayer = null;
    }

    @Override // io.getstream.chat.android.client.audio.NativeMediaPlayer
    public final void reset() {
        C2830f0 c2830f0 = (C2830f0) getExoPlayer();
        c2830f0.m8085F0();
        c2830f0.m388i();
        this.isPreparing = false;
        setState(NativeMediaPlayerState.IDLE);
    }

    @Override // io.getstream.chat.android.client.audio.NativeMediaPlayer
    public final void seekTo(int msec) throws IllegalStateException {
        ((AbstractC0152a) getExoPlayer()).m375I(msec);
    }

    @Override // io.getstream.chat.android.client.audio.NativeMediaPlayer
    public final void setDataSource(String path) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        AbstractC22676k.m65750j(path, "path");
        ExoPlayer exoPlayer = getExoPlayer();
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC11266d.m30456j(exoPlayer.hashCode(), "[setDataSource] exoPlayer: ", ", path: ", path), null);
        }
        AbstractC23481a abstractC23481aMo5056b = this.mediaSourceFactory.mo5056b(C34626x.m109419b(path));
        AbstractC22676k.m65749i(abstractC23481aMo5056b, "createMediaSource(...)");
        ((C2830f0) exoPlayer).m8122w0(abstractC23481aMo5056b);
        setState(NativeMediaPlayerState.INITIALIZED);
    }

    @Override // io.getstream.chat.android.client.audio.NativeMediaPlayer
    public final void setOnCompletionListener(InterfaceC4339a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.onCompletionListener = listener;
    }

    @Override // io.getstream.chat.android.client.audio.NativeMediaPlayer
    public final void setOnErrorListener(Function1 listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.onErrorListener = listener;
    }

    @Override // io.getstream.chat.android.client.audio.NativeMediaPlayer
    public final void setOnPreparedListener(InterfaceC4339a listener) {
        AbstractC22676k.m65750j(listener, "listener");
        this.onPreparedListener = listener;
    }

    @Override // io.getstream.chat.android.client.audio.NativeMediaPlayer
    public final void setSpeed(float f13) {
        ((C2830f0) getExoPlayer()).m8080A0(new C34589e0(f13));
    }

    public final void setState(NativeMediaPlayerState value) {
        AbstractC22676k.m65750j(value, "value");
        this.state = value;
    }

    @Override // io.getstream.chat.android.client.audio.NativeMediaPlayer
    public final void start() throws IllegalStateException {
        ((C2830f0) getExoPlayer()).m8125z0(true);
        setState(NativeMediaPlayerState.STARTED);
    }

    @Override // io.getstream.chat.android.client.audio.NativeMediaPlayer
    public final void stop() throws IllegalStateException {
        ((C2830f0) getExoPlayer()).m8085F0();
        setState(NativeMediaPlayerState.STOPPED);
    }
}
