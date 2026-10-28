package io.getstream.chat.android.client.audio;

import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.data.local.room.dao.persistent.C6494e;
import com.whoop.data.local.room.dao.wipeable.C6516c;
import io.getstream.chat.android.client.scope.UserScope;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.AbstractC25265s;
import m83.AbstractC25269w;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p133f1.C13990x;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 ~2\u00020\u0001:\u0001~B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0011J+\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0011J'\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0015H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010\u001eJ\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\u00020\u000e2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\n0)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b-\u0010(J\u000f\u0010.\u001a\u00020\u000eH\u0016¢\u0006\u0004\b.\u0010\u001eJ\u000f\u0010/\u001a\u00020\u000eH\u0016¢\u0006\u0004\b/\u0010\u001eJ\u0017\u00100\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b0\u0010(J\u001f\u00102\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u0010(J\u000f\u00107\u001a\u00020\u000eH\u0002¢\u0006\u0004\b7\u0010\u001eJ)\u0010:\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u00109\u001a\u000208H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u000eH\u0002¢\u0006\u0004\b<\u0010\u001eJ\u001f\u0010=\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u00109\u001a\u000208H\u0002¢\u0006\u0004\b=\u0010>J\u001f\u0010@\u001a\u0002082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010?\u001a\u00020\nH\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\bB\u0010(J\u0017\u0010C\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\bC\u0010(J\u0017\u0010D\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\bD\u0010(J\u000f\u0010E\u001a\u00020\u000eH\u0002¢\u0006\u0004\bE\u0010\u001eJ\u000f\u0010F\u001a\u00020\u000eH\u0002¢\u0006\u0004\bF\u0010\u001eJ\u001f\u0010H\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010G\u001a\u00020\rH\u0002¢\u0006\u0004\bH\u0010IJ\u001f\u0010K\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010J\u001a\u00020\u0012H\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010N\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010M\u001a\u00020\u0015H\u0002¢\u0006\u0004\bN\u0010OJ\u0013\u0010P\u001a\u000208*\u00020\u0002H\u0002¢\u0006\u0004\bP\u0010QJ\u0013\u0010R\u001a\u000208*\u00020\u0002H\u0002¢\u0006\u0004\bR\u0010QR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010SR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010TR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010UR\u001b\u0010[\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR2\u0010^\u001a \u0012\u0004\u0012\u00020\n\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0]0\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R2\u0010`\u001a \u0012\u0004\u0012\u00020\n\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\f0]0\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010_R2\u0010a\u001a \u0012\u0004\u0012\u00020\n\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000e0\f0]0\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010_R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020b0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\n0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR \u0010h\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010_R \u0010i\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00150\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010_R$\u0010l\u001a\u00020j2\u0006\u0010k\u001a\u00020j8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bl\u0010m\"\u0004\bn\u0010oR\u0018\u0010q\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010s\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010u\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010w\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010tR\u0014\u0010z\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0014\u0010}\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|¨\u0006\u007f"}, m65681d2 = {"Lio/getstream/chat/android/client/audio/StreamAudioPlayer;", "Lio/getstream/chat/android/client/audio/AudioPlayer;", "Lio/getstream/chat/android/client/audio/NativeMediaPlayer;", "mediaPlayer", "Lio/getstream/chat/android/client/scope/UserScope;", "userScope", "", "progressUpdatePeriod", "<init>", "(Lio/getstream/chat/android/client/audio/NativeMediaPlayer;Lio/getstream/chat/android/client/scope/UserScope;J)V", "", "audioHash", "Lkotlin/Function1;", "Lio/getstream/chat/android/client/audio/AudioState;", "Ll83/a0;", "onAudioStateChange", "registerOnAudioStateChange", "(ILkotlin/jvm/functions/Function1;)V", "Lio/getstream/chat/android/client/audio/ProgressData;", "onProgressDataChange", "registerOnProgressStateChange", "", "onSpeedChange", "registerOnSpeedChange", "", "sourceUrl", "position", "registerTrack", "(Ljava/lang/String;II)V", "clearTracks", "()V", "prepare", "(Ljava/lang/String;I)V", "play", "changeSpeed", "(I)F", "currentSpeed", "()F", "dispose", "removeAudio", "(I)V", "", "audioHashList", "removeAudios", "(Ljava/util/List;)V", "resetAudio", "reset", "pause", "resume", "positionInMs", "seekTo", "(II)V", "getCurrentPositionInMs", "(I)I", "startSeek", "resetPlayer", "", "autoPlay", "setAudio", "(Ljava/lang/String;IZ)V", "start", "onPrepared", "(IZ)V", "errorCode", "onError", "(II)Z", "postOnComplete", "onComplete", "complete", "pollProgress", "stopPolling", "audioState", "publishAudioState", "(ILio/getstream/chat/android/client/audio/AudioState;)V", "progressData", "publishProgress", "(ILio/getstream/chat/android/client/audio/ProgressData;)V", "speed", "publishSpeed", "(IF)V", "isSeekable", "(Lio/getstream/chat/android/client/audio/NativeMediaPlayer;)Z", "isSpeedSettable", "Lio/getstream/chat/android/client/audio/NativeMediaPlayer;", "Lio/getstream/chat/android/client/scope/UserScope;", "J", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "", "", "onStateListeners", "Ljava/util/Map;", "onProgressListeners", "onSpeedListeners", "Lio/getstream/chat/android/client/audio/TrackInfo;", "audioTracks", "Ljava/util/List;", "", "registeredTrackHashSet", "Ljava/util/Set;", "seekMap", "speedMap", "Lio/getstream/chat/android/client/audio/PlayerState;", "value", "playerState", "Lio/getstream/chat/android/client/audio/PlayerState;", "setPlayerState", "(Lio/getstream/chat/android/client/audio/PlayerState;)V", "Lbc3/k1;", "pollJob", "Lbc3/k1;", "currentAudioHash", "I", "playingSpeed", "F", "currentIndex", "getCurrentPlayingId", "()I", "currentPlayingId", "getCurrentState", "()Lio/getstream/chat/android/client/audio/AudioState;", "currentState", "Companion", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StreamAudioPlayer implements AudioPlayer {
    private static final boolean DEBUG_POLLING = false;
    private static final float INITIAL_SPEED = 1.0f;
    private static final float SPEED_INCREMENT = 0.5f;
    private final List<TrackInfo> audioTracks;
    private int currentAudioHash;
    private int currentIndex;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final NativeMediaPlayer mediaPlayer;
    private final Map<Integer, List<Function1>> onProgressListeners;
    private final Map<Integer, List<Function1>> onSpeedListeners;
    private final Map<Integer, List<Function1>> onStateListeners;
    private PlayerState playerState;
    private float playingSpeed;
    private InterfaceC3027k1 pollJob;
    private final long progressUpdatePeriod;
    private final Set<Integer> registeredTrackHashSet;
    private final Map<Integer, Integer> seekMap;
    private final Map<Integer, Float> speedMap;
    private final UserScope userScope;

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PlayerState.values().length];
            try {
                iArr[PlayerState.UNSET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayerState.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PlayerState.IDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PlayerState.PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PlayerState.PLAYING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NativeMediaPlayerState.values().length];
            try {
                iArr2[NativeMediaPlayerState.PREPARED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[NativeMediaPlayerState.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[NativeMediaPlayerState.PAUSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[NativeMediaPlayerState.PLAYBACK_COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[NativeMediaPlayerState.INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[NativeMediaPlayerState.ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.audio.StreamAudioPlayer$dispose$1 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.audio.StreamAudioPlayer$dispose$1", m100430f = "StreamAudioPlayer.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190681 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C190681(InterfaceC30057d<? super C190681> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return StreamAudioPlayer.this.new C190681(interfaceC30057d);
        }

        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C190681 c190681 = (C190681) create(interfaceC2994c0, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c190681.invokeSuspend(c23454a0);
            return c23454a0;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C2345k logger = StreamAudioPlayer.this.getLogger();
            StreamAudioPlayer streamAudioPlayer = StreamAudioPlayer.this;
            InterfaceC2339e interfaceC2339e = logger.f9275c;
            String str = logger.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.INFO;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                logger.f9274b.log(enumC2341g, str, "[dispose] playerState: " + streamAudioPlayer.playerState, null);
            }
            StreamAudioPlayer.this.stopPolling();
            StreamAudioPlayer.this.onStateListeners.clear();
            StreamAudioPlayer.this.onProgressListeners.clear();
            StreamAudioPlayer.this.onSpeedListeners.clear();
            StreamAudioPlayer.this.seekMap.clear();
            StreamAudioPlayer.this.speedMap.clear();
            StreamAudioPlayer.this.audioTracks.clear();
            StreamAudioPlayer.this.mediaPlayer.release();
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2994c0) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.audio.StreamAudioPlayer$pollProgress$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.audio.StreamAudioPlayer$pollProgress$2", m100430f = "StreamAudioPlayer.kt", m100431l = {398}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190692 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ int $audioHash;
        float F$0;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190692(int i13, InterfaceC30057d<? super C190692> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$audioHash = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            C190692 c190692 = StreamAudioPlayer.this.new C190692(this.$audioHash, interfaceC30057d);
            c190692.L$0 = obj;
            return c190692;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C190692) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws IOException {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0 && i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            while (AbstractC3006f0.m8729w(interfaceC2994c0)) {
                int currentPosition = StreamAudioPlayer.this.mediaPlayer.getCurrentPosition();
                int duration = StreamAudioPlayer.this.mediaPlayer.getDuration();
                float f13 = currentPosition / duration;
                StreamAudioPlayer.this.publishProgress(this.$audioHash, new ProgressData(currentPosition, f13, duration));
                if (currentPosition >= duration) {
                    C2345k logger = StreamAudioPlayer.this.getLogger();
                    InterfaceC2339e interfaceC2339e = logger.f9275c;
                    String str = logger.f9273a;
                    EnumC2341g enumC2341g = EnumC2341g.INFO;
                    if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                        logger.f9274b.log(enumC2341g, str, AbstractC25012a.m73372e(currentPosition, duration, "[pollProgress] #3; currentPosition(", ") >= durationMs(", ")"), null);
                    }
                    StreamAudioPlayer.this.complete(this.$audioHash);
                    break;
                }
                long j7 = StreamAudioPlayer.this.progressUpdatePeriod;
                this.L$0 = interfaceC2994c0;
                this.I$0 = currentPosition;
                this.I$1 = duration;
                this.F$0 = f13;
                this.label = 1;
                if (AbstractC3034m0.m8782b(j7, this) == enumC31071a) {
                    return enumC31071a;
                }
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.client.audio.StreamAudioPlayer$postOnComplete$2 */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.client.audio.StreamAudioPlayer$postOnComplete$2", m100430f = "StreamAudioPlayer.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C190702 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ int $audioHash;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190702(int i13, InterfaceC30057d<? super C190702> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$audioHash = i13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return StreamAudioPlayer.this.new C190702(this.$audioHash, interfaceC30057d);
        }

        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws IOException {
            C190702 c190702 = (C190702) create(interfaceC2994c0, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c190702.invokeSuspend(c23454a0);
            return c23454a0;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws IOException {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            StreamAudioPlayer.this.complete(this.$audioHash);
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            invoke((InterfaceC2994c0) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }
    }

    public StreamAudioPlayer(NativeMediaPlayer mediaPlayer, UserScope userScope, long j7) {
        AbstractC22676k.m65750j(mediaPlayer, "mediaPlayer");
        AbstractC22676k.m65750j(userScope, "userScope");
        this.mediaPlayer = mediaPlayer;
        this.userScope = userScope;
        this.progressUpdatePeriod = j7;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:StreamAudioPlayer");
        this.onStateListeners = new LinkedHashMap();
        this.onProgressListeners = new LinkedHashMap();
        this.onSpeedListeners = new LinkedHashMap();
        this.audioTracks = new ArrayList();
        this.registeredTrackHashSet = new LinkedHashSet();
        this.seekMap = new LinkedHashMap();
        this.speedMap = new LinkedHashMap();
        this.playerState = PlayerState.UNSET;
        this.currentAudioHash = -1;
        this.playingSpeed = 1.0f;
    }

    /* JADX INFO: renamed from: b */
    public static void m54635b(StreamAudioPlayer streamAudioPlayer, int i13, int i14) {
        streamAudioPlayer.onError(i13, i14);
    }

    /* JADX INFO: renamed from: c */
    public static void m54636c(StreamAudioPlayer streamAudioPlayer, int i13) {
        streamAudioPlayer.onComplete(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void complete(int audioHash) throws IOException {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[complete] audioHash: " + audioHash, null);
        }
        publishProgress(audioHash, new ProgressData(0, 0.0f, this.mediaPlayer.getDuration()));
        stopPolling();
        setPlayerState(PlayerState.IDLE);
        publishAudioState(audioHash, AudioState.IDLE);
        this.seekMap.put(Integer.valueOf(audioHash), 0);
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339eM7232c2 = logger2.m7232c();
        EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
        if (interfaceC2339eM7232c2.isLoggable(enumC2341g2, logger2.m7231b())) {
            logger2.m7230a().log(enumC2341g2, logger2.m7231b(), AbstractC2875y.m8294g(this.currentIndex, AbstractC37056f.m118951C(this.audioTracks), "[complete] currentIndex: ", ", lastIndex: "), null);
        }
        if (this.currentIndex < AbstractC37056f.m118951C(this.audioTracks)) {
            TrackInfo trackInfo = this.audioTracks.get(this.currentIndex + 1);
            resetPlayer();
            setAudio$default(this, trackInfo.getUrl(), trackInfo.getHash(), false, 4, null);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m54637d(StreamAudioPlayer streamAudioPlayer, int i13, boolean z4) {
        streamAudioPlayer.onPrepared(i13, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final boolean isSeekable(NativeMediaPlayer nativeMediaPlayer) {
        int i13 = WhenMappings.$EnumSwitchMapping$1[nativeMediaPlayer.getState().ordinal()];
        return i13 == 1 || i13 == 2 || i13 == 3 || i13 == 4;
    }

    private final boolean isSpeedSettable(NativeMediaPlayer nativeMediaPlayer) {
        switch (WhenMappings.$EnumSwitchMapping$1[nativeMediaPlayer.getState().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    private final void onComplete(int audioHash) throws IOException {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[onComplete] audioHash: " + audioHash, null);
        }
        complete(audioHash);
    }

    private final boolean onError(int audioHash, int errorCode) throws IOException {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC2875y.m8294g(audioHash, errorCode, "[onError] audioHash: ", ", errorCode: "), null);
        }
        complete(audioHash);
        resetPlayer();
        this.mediaPlayer.release();
        return true;
    }

    private final void onPrepared(int audioHash, boolean autoPlay) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[onPrepared] audioHash: " + audioHash + ", autoPlay: " + autoPlay, null);
        }
        setPlayerState(PlayerState.IDLE);
        publishAudioState(audioHash, AudioState.IDLE);
        if (autoPlay) {
            start();
        }
    }

    private final void pollProgress() {
        int i13 = this.currentAudioHash;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            InterfaceC2344j interfaceC2344jM7230a = logger.m7230a();
            String strM7231b = logger.m7231b();
            int currentPosition = this.mediaPlayer.getCurrentPosition();
            int duration = this.mediaPlayer.getDuration();
            StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, currentPosition, "[pollProgress] #1; audioHash: ", ", currentPosition: ", ", duration: ");
            sbM30465s.append(duration);
            interfaceC2344jM7230a.log(enumC2341g, strM7231b, sbM30465s.toString(), null);
        }
        this.pollJob = AbstractC3006f0.m8732z(this.userScope, DispatcherProvider.INSTANCE.getMain(), null, new C190692(i13, null), 2);
    }

    private final void postOnComplete(int audioHash) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[postOnComplete] audioHash: " + audioHash, null);
        }
        AbstractC3006f0.m8732z(this.userScope, DispatcherProvider.INSTANCE.getMain(), null, new C190702(audioHash, null), 2);
    }

    private final void publishAudioState(int audioHash, AudioState audioState) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[publishAudioState] audioHash: " + audioHash + ", audioState: " + audioState, null);
        }
        List<Function1> list = this.onStateListeners.get(Integer.valueOf(audioHash));
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(audioState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishProgress(int audioHash, ProgressData progressData) {
        List<Function1> list = this.onProgressListeners.get(Integer.valueOf(audioHash));
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(progressData);
            }
        }
    }

    private final void publishSpeed(int audioHash, float speed) {
        List<Function1> list = this.onSpeedListeners.get(Integer.valueOf(audioHash));
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(Float.valueOf(speed));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeAudio$lambda$14(int i13, TrackInfo trackInto) {
        AbstractC22676k.m65750j(trackInto, "trackInto");
        return trackInto.getHash() == i13;
    }

    private final void resetPlayer() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[resetPlayer] playerState: " + this.playerState + ", audioHash: " + this.currentAudioHash, null);
        }
        stopPolling();
        this.mediaPlayer.reset();
        setPlayerState(PlayerState.UNSET);
        int i13 = this.currentAudioHash;
        if (i13 != -1) {
            publishAudioState(i13, AudioState.UNSET);
            this.seekMap.remove(Integer.valueOf(this.currentAudioHash));
            this.currentAudioHash = -1;
        }
    }

    private final void setAudio(String sourceUrl, final int audioHash, final boolean autoPlay) throws IOException {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[setAudio] audioHash: " + audioHash + ", autoPlay: " + autoPlay + ", sourceUrl.hash: " + sourceUrl.hashCode(), null);
        }
        Iterator<TrackInfo> it = this.audioTracks.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            } else if (it.next().getHash() == audioHash) {
                break;
            } else {
                i13++;
            }
        }
        Integer numValueOf = Integer.valueOf(i13);
        if (i13 == -1) {
            numValueOf = null;
        }
        this.currentIndex = numValueOf != null ? numValueOf.intValue() : 0;
        this.currentAudioHash = audioHash;
        NativeMediaPlayer nativeMediaPlayer = this.mediaPlayer;
        nativeMediaPlayer.setOnPreparedListener(new InterfaceC4339a() { // from class: io.getstream.chat.android.client.audio.a
            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                StreamAudioPlayer.m54637d(this.f73772w, audioHash, autoPlay);
                return C23454a0.f92919a;
            }
        });
        nativeMediaPlayer.setOnCompletionListener(new C13990x(this, audioHash, 3));
        nativeMediaPlayer.setOnErrorListener(new C6516c(this, audioHash, 9));
        setPlayerState(PlayerState.LOADING);
        publishAudioState(this.currentAudioHash, AudioState.LOADING);
        nativeMediaPlayer.setDataSource(sourceUrl);
        nativeMediaPlayer.prepareAsync();
    }

    public static /* synthetic */ void setAudio$default(StreamAudioPlayer streamAudioPlayer, String str, int i13, boolean z4, int i14, Object obj) throws IOException {
        if ((i14 & 4) != 0) {
            z4 = true;
        }
        streamAudioPlayer.setAudio(str, i13, z4);
    }

    private static final C23454a0 setAudio$lambda$27$lambda$24(StreamAudioPlayer streamAudioPlayer, int i13, boolean z4) {
        streamAudioPlayer.onPrepared(i13, z4);
        return C23454a0.f92919a;
    }

    private static final C23454a0 setAudio$lambda$27$lambda$25(StreamAudioPlayer streamAudioPlayer, int i13) throws IOException {
        streamAudioPlayer.onComplete(i13);
        return C23454a0.f92919a;
    }

    private static final boolean setAudio$lambda$27$lambda$26(StreamAudioPlayer streamAudioPlayer, int i13, int i14) throws IOException {
        streamAudioPlayer.onError(i13, i14);
        return true;
    }

    private final void setPlayerState(PlayerState playerState) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[setPlayerState] value: " + playerState, null);
        }
        this.playerState = playerState;
    }

    private final void start() {
        int currentPosition = this.mediaPlayer.getCurrentPosition();
        int i13 = this.currentAudioHash;
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            InterfaceC2344j interfaceC2344jM7230a = logger.m7230a();
            String strM7231b = logger.m7231b();
            PlayerState playerState = this.playerState;
            StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, currentPosition, "[start] currentAudioHash: ", ", currentPosition: ", ", playerState: ");
            sbM30465s.append(playerState);
            interfaceC2344jM7230a.log(enumC2341g, strM7231b, sbM30465s.toString(), null);
        }
        PlayerState playerState2 = this.playerState;
        if (playerState2 == PlayerState.IDLE || playerState2 == PlayerState.PAUSE) {
            Integer num = this.seekMap.get(Integer.valueOf(i13));
            int iIntValue = num != null ? num.intValue() : 0;
            int duration = this.mediaPlayer.getDuration();
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339eM7232c2 = logger2.m7232c();
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (interfaceC2339eM7232c2.isLoggable(enumC2341g2, logger2.m7231b())) {
                logger2.m7230a().log(enumC2341g2, logger2.m7231b(), AbstractC2875y.m8294g(iIntValue, duration, "[start] seekTo: ", ", duration: "), null);
            }
            if (iIntValue >= duration) {
                publishProgress(i13, new ProgressData(duration, 1.0f, duration));
                postOnComplete(i13);
                return;
            }
            this.mediaPlayer.seekTo(iIntValue);
            if (isSpeedSettable(this.mediaPlayer)) {
                Float f13 = this.speedMap.get(Integer.valueOf(i13));
                float fFloatValue = f13 != null ? f13.floatValue() : 1.0f;
                this.playingSpeed = fFloatValue;
                this.mediaPlayer.setSpeed(fFloatValue);
                publishSpeed(i13, fFloatValue);
            }
            this.mediaPlayer.start();
            setPlayerState(PlayerState.PLAYING);
            publishAudioState(i13, AudioState.PLAYING);
            pollProgress();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopPolling() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[stopPolling] no args", null);
        }
        InterfaceC3027k1 interfaceC3027k1 = this.pollJob;
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
    }

    @Override // io.getstream.chat.android.client.audio.AudioPlayer
    public final float changeSpeed(int audioHash) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[changeSpeed] audioHash: " + audioHash, null);
        }
        Float f13 = this.speedMap.get(Integer.valueOf(audioHash));
        float f14 = 1.0f;
        float fFloatValue = f13 != null ? f13.floatValue() : 1.0f;
        if (fFloatValue < 2.0f && fFloatValue >= 1.0f) {
            f14 = SPEED_INCREMENT + fFloatValue;
        }
        this.speedMap.put(Integer.valueOf(audioHash), Float.valueOf(f14));
        if (this.currentAudioHash == audioHash) {
            this.playingSpeed = f14;
            if (this.playerState == PlayerState.PLAYING && isSpeedSettable(this.mediaPlayer)) {
                this.mediaPlayer.setSpeed(f14);
            }
        }
        publishSpeed(audioHash, f14);
        return f14;
    }

    @Override // io.getstream.chat.android.client.audio.AudioPlayer
    public final void clearTracks() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[clearTracks] no args", null);
        }
        this.registeredTrackHashSet.clear();
        this.audioTracks.clear();
    }

    @Override // io.getstream.chat.android.client.audio.AudioPlayer
    public final float currentSpeed() {
        return this.mediaPlayer.getSpeed();
    }

    @Override // io.getstream.chat.android.client.audio.AudioPlayer
    public final void dispose() {
        AbstractC3006f0.m8732z(this.userScope, DispatcherProvider.INSTANCE.getMain(), null, new C190681(null), 2);
    }

    @Override // io.getstream.chat.android.client.audio.AudioPlayer
    /* JADX INFO: renamed from: getCurrentPlayingId, reason: from getter */
    public final int getCurrentAudioHash() {
        return this.currentAudioHash;
    }

    @Override // io.getstream.chat.android.client.audio.AudioPlayer
    public final int getCurrentPositionInMs(int audioHash) {
        if (this.currentIndex == audioHash) {
            return this.mediaPlayer.getCurrentPosition();
        }
        Integer num = this.seekMap.get(Integer.valueOf(audioHash));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // io.getstream.chat.android.client.audio.AudioPlayer
    public final AudioState getCurrentState() {
        int i13 = WhenMappings.$EnumSwitchMapping$0[this.playerState.ordinal()];
        if (i13 == 1) {
            return AudioState.UNSET;
        }
        if (i13 == 2) {
            return AudioState.LOADING;
        }
        if (i13 == 3) {
            return AudioState.IDLE;
        }
        if (i13 == 4) {
            return AudioState.PAUSE;
        }
        if (i13 == 5) {
            return AudioState.PLAYING;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // io.getstream.chat.android.client.audio.AudioPlayer
    public final void pause() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[pause] playerState: " + this.playerState + ", currentAudioHash: " + this.currentAudioHash, null);
        }
        if (this.playerState == PlayerState.PLAYING) {
            this.mediaPlayer.pause();
            this.seekMap.put(Integer.valueOf(this.currentAudioHash), Integer.valueOf(this.mediaPlayer.getCurrentPosition()));
            setPlayerState(PlayerState.PAUSE);
            publishAudioState(this.currentAudioHash, AudioState.PAUSE);
            stopPolling();
        }
    }

    @Override // io.getstream.chat.android.client.audio.AudioPlayer
    public final void play(String sourceUrl, int audioHash) throws IOException {
        AbstractC22676k.m65750j(sourceUrl, "sourceUrl");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            InterfaceC2344j interfaceC2344jM7230a = logger.m7230a();
            String strM7231b = logger.m7231b();
            int i13 = this.currentAudioHash;
            PlayerState playerState = this.playerState;
            StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, audioHash, "[play] audioHash(", "): ", ", playerState: ");
            sbM30465s.append(playerState);
            interfaceC2344jM7230a.log(enumC2341g, strM7231b, sbM30465s.toString(), null);
        }
        if (audioHash != this.currentAudioHash) {
            resetPlayer();
            setAudio(sourceUrl, audioHash, true);
            return;
        }
        C2345k logger2 = getLogger();
        InterfaceC2339e interfaceC2339eM7232c2 = logger2.m7232c();
        EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
        if (interfaceC2339eM7232c2.isLoggable(enumC2341g2, logger2.m7231b())) {
            logger2.m7230a().log(enumC2341g2, logger2.m7231b(), "[play] currentAudioHash: " + this.currentAudioHash + ", playerState: " + this.playerState, null);
        }
        int i14 = WhenMappings.$EnumSwitchMapping$0[this.playerState.ordinal()];
        if (i14 == 1) {
            setAudio$default(this, sourceUrl, audioHash, false, 4, null);
            return;
        }
        if (i14 != 2) {
            if (i14 == 3 || i14 == 4) {
                start();
            } else {
                if (i14 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                pause();
            }
        }
    }

    @Override // io.getstream.chat.android.client.audio.AudioPlayer
    public final void prepare(String sourceUrl, int audioHash) throws IOException {
        AbstractC22676k.m65750j(sourceUrl, "sourceUrl");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC2875y.m8294g(audioHash, sourceUrl.hashCode(), "[prepare] audioHash: ", ", sourceUrl.hash: "), null);
        }
        if (audioHash != this.currentAudioHash) {
            resetPlayer();
            setAudio(sourceUrl, audioHash, false);
        }
    }

    @Override // io.getstream.chat.android.client.audio.AudioPlayer
    public final void registerOnAudioStateChange(int audioHash, Function1 onAudioStateChange) {
        AbstractC22676k.m65750j(onAudioStateChange, "onAudioStateChange");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC2875y.m8294g(audioHash, this.onStateListeners.size(), "[registerOnAudioStateChange] audioHash: ", ", size: "), null);
        }
        List<Function1> list = this.onStateListeners.get(Integer.valueOf(audioHash));
        if (list != null) {
            list.add(onAudioStateChange);
        } else {
            this.onStateListeners.put(Integer.valueOf(audioHash), AbstractC37056f.m118964P(onAudioStateChange));
        }
    }

    @Override // io.getstream.chat.android.client.audio.AudioPlayer
    public final void registerOnProgressStateChange(int audioHash, Function1 onProgressDataChange) {
        AbstractC22676k.m65750j(onProgressDataChange, "onProgressDataChange");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC2875y.m8294g(audioHash, this.onProgressListeners.size(), "[registerOnProgressStateChange] audioHash: ", ", size: "), null);
        }
        List<Function1> list = this.onProgressListeners.get(Integer.valueOf(audioHash));
        if (list != null) {
            list.add(onProgressDataChange);
        } else {
            this.onProgressListeners.put(Integer.valueOf(audioHash), AbstractC37056f.m118964P(onProgressDataChange));
        }
    }

    @Override // io.getstream.chat.android.client.audio.AudioPlayer
    public final void registerOnSpeedChange(int audioHash, Function1 onSpeedChange) {
        AbstractC22676k.m65750j(onSpeedChange, "onSpeedChange");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), AbstractC2875y.m8294g(audioHash, this.onSpeedListeners.size(), "[registerOnSpeedChange] audioHash: ", ", size: "), null);
        }
        List<Function1> list = this.onSpeedListeners.get(Integer.valueOf(audioHash));
        if (list != null) {
            list.add(onSpeedChange);
        } else {
            this.onSpeedListeners.put(Integer.valueOf(audioHash), AbstractC37056f.m118964P(onSpeedChange));
        }
    }

    @Override // io.getstream.chat.android.client.audio.AudioPlayer
    public final void registerTrack(String sourceUrl, int audioHash, int position) {
        AbstractC22676k.m65750j(sourceUrl, "sourceUrl");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            InterfaceC2344j interfaceC2344jM7230a = logger.m7230a();
            String strM7231b = logger.m7231b();
            int iHashCode = sourceUrl.hashCode();
            StringBuilder sbM30465s = AbstractC11266d.m30465s(audioHash, position, "[registerTrack] audioHash: ", ", position: ", ", sourceUrl.hash: ");
            sbM30465s.append(iHashCode);
            interfaceC2344jM7230a.log(enumC2341g, strM7231b, sbM30465s.toString(), null);
        }
        if (this.registeredTrackHashSet.contains(Integer.valueOf(audioHash))) {
            return;
        }
        this.registeredTrackHashSet.add(Integer.valueOf(audioHash));
        this.audioTracks.add(new TrackInfo(sourceUrl, audioHash, position));
        AbstractC25269w.m74165k0(this.audioTracks);
    }

    @Override // io.getstream.chat.android.client.audio.AudioPlayer
    public final void removeAudio(int audioHash) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[removeAudio] audioHash: " + audioHash, null);
        }
        this.onStateListeners.remove(Integer.valueOf(audioHash));
        this.onProgressListeners.remove(Integer.valueOf(audioHash));
        this.onSpeedListeners.remove(Integer.valueOf(audioHash));
        AbstractC25265s.m74132j1(this.audioTracks, new C6494e(audioHash, 16));
        this.seekMap.remove(Integer.valueOf(audioHash));
        this.speedMap.remove(Integer.valueOf(audioHash));
    }

    @Override // io.getstream.chat.android.client.audio.AudioPlayer
    public final void removeAudios(List<Integer> audioHashList) {
        AbstractC22676k.m65750j(audioHashList, "audioHashList");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[removeAudios] audioHashList.size: " + audioHashList.size(), null);
        }
        Iterator<T> it = audioHashList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339eM7232c2 = logger2.m7232c();
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (interfaceC2339eM7232c2.isLoggable(enumC2341g2, logger2.m7231b())) {
                logger2.m7230a().log(enumC2341g2, logger2.m7231b(), "[removeAudios] audioHash: " + iIntValue, null);
            }
            removeAudio(iIntValue);
        }
    }

    @Override // io.getstream.chat.android.client.audio.AudioPlayer
    public final void reset() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[reset] playerState: " + this.playerState + ", currentAudioHash: " + this.currentAudioHash, null);
        }
        resetPlayer();
        this.onStateListeners.clear();
        this.onProgressListeners.clear();
        this.onSpeedListeners.clear();
        this.audioTracks.clear();
        this.seekMap.clear();
        this.speedMap.clear();
    }

    @Override // io.getstream.chat.android.client.audio.AudioPlayer
    public final void resetAudio(int audioHash) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[resetAudio] playerState: " + this.playerState + ", audioHash: " + audioHash, null);
        }
        if (audioHash == this.currentAudioHash) {
            resetPlayer();
        }
        removeAudio(audioHash);
    }

    @Override // io.getstream.chat.android.client.audio.AudioPlayer
    public final void resume(int audioHash) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[resume] audioHash: " + audioHash + ", playerState: " + this.playerState, null);
        }
        PlayerState playerState = this.playerState;
        if ((playerState == PlayerState.IDLE || playerState == PlayerState.PAUSE) && this.currentAudioHash == audioHash) {
            start();
        }
    }

    @Override // io.getstream.chat.android.client.audio.AudioPlayer
    public final void seekTo(int positionInMs, int audioHash) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            InterfaceC2344j interfaceC2344jM7230a = logger.m7230a();
            String strM7231b = logger.m7231b();
            PlayerState playerState = this.playerState;
            StringBuilder sbM30465s = AbstractC11266d.m30465s(audioHash, positionInMs, "[seekTo] audioHash: ", ", positionInMs: ", ", playerState: ");
            sbM30465s.append(playerState);
            interfaceC2344jM7230a.log(enumC2341g, strM7231b, sbM30465s.toString(), null);
        }
        this.seekMap.put(Integer.valueOf(audioHash), Integer.valueOf(positionInMs));
        if (this.currentAudioHash == audioHash && isSeekable(this.mediaPlayer)) {
            this.mediaPlayer.seekTo(positionInMs);
            int currentPosition = this.mediaPlayer.getCurrentPosition();
            int duration = this.mediaPlayer.getDuration();
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339eM7232c2 = logger2.m7232c();
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (interfaceC2339eM7232c2.isLoggable(enumC2341g2, logger2.m7231b())) {
                InterfaceC2344j interfaceC2344jM7230a2 = logger2.m7230a();
                String strM7231b2 = logger2.m7231b();
                StringBuilder sbM30465s2 = AbstractC11266d.m30465s(positionInMs, currentPosition, "[seekTo] msec: ", ", currentPosition: ", ", duration: ");
                sbM30465s2.append(duration);
                interfaceC2344jM7230a2.log(enumC2341g2, strM7231b2, sbM30465s2.toString(), null);
            }
        }
    }

    @Override // io.getstream.chat.android.client.audio.AudioPlayer
    public final void startSeek(int audioHash) {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339eM7232c = logger.m7232c();
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        if (interfaceC2339eM7232c.isLoggable(enumC2341g, logger.m7231b())) {
            logger.m7230a().log(enumC2341g, logger.m7231b(), "[startSeek] audioHash: " + audioHash + ", playerState: " + this.playerState, null);
        }
        if (this.playerState == PlayerState.PLAYING && this.currentAudioHash == audioHash) {
            pause();
        }
    }

    public /* synthetic */ StreamAudioPlayer(NativeMediaPlayer nativeMediaPlayer, UserScope userScope, long j7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeMediaPlayer, userScope, (i13 & 4) != 0 ? 50L : j7);
    }
}
