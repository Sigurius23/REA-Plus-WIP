package io.getstream.chat.android.p226ui.common.feature.messages.composer;

import android.media.MediaRecorder;
import androidx.core.app.NotificationCompat;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.AbstractC3076z;
import bc3.C2996c2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.mapbox.maps.MapboxMap;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.InterfaceC13075p1;
import hc3.AbstractC17176i;
import io.getstream.chat.android.client.audio.AudioHashKt;
import io.getstream.chat.android.client.audio.AudioPlayer;
import io.getstream.chat.android.client.audio.AudioState;
import io.getstream.chat.android.client.audio.ProgressData;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.core.internal.coroutines.DispatcherProvider;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.common.feature.messages.composer.AudioRecordingController;
import io.getstream.chat.android.p226ui.common.state.messages.composer.RecordingState;
import io.getstream.chat.android.p226ui.common.state.messages.composer.RecordingStateKt;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import n23.AbstractC26205h;
import n23.C26198a;
import n23.C26201d;
import n23.C26203f;
import n23.C26204g;
import p028b4.C2698i;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s23.C32091d;
import s23.C32093f;
import s23.EnumC32092e;
import s23.InterfaceC32094g;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 `2\u00020\u0001:\u0001`B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\u00020\u000e2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u0017J\u0010\u0010\u001a\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u001a\u0010\u0010J\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u0017J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0086@¢\u0006\u0004\b!\u0010\u0010J\u0010\u0010\"\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\"\u0010\u0010J\r\u0010#\u001a\u00020\u000e¢\u0006\u0004\b#\u0010\u0017J\u000f\u0010$\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010\u0017J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b)\u0010(J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000eH\u0002¢\u0006\u0004\b2\u0010\u0017J\u0017\u00105\u001a\u00020\u000e2\u0006\u00104\u001a\u000203H\u0002¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\b\u0012\u0004\u0012\u00020\u001207*\b\u0012\u0004\u0012\u00020%07H\u0002¢\u0006\u0004\b8\u00109J\u0017\u00108\u001a\u00020\u00122\u0006\u0010:\u001a\u00020%H\u0002¢\u0006\u0004\b8\u0010;J'\u0010=\u001a\b\u0012\u0004\u0012\u00020%07*\b\u0012\u0004\u0012\u00020%072\u0006\u0010<\u001a\u00020%H\u0002¢\u0006\u0004\b=\u0010>J\u0013\u0010=\u001a\u00020%*\u00020?H\u0002¢\u0006\u0004\b=\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010AR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010BR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010CR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001d\u0010I\u001a\b\u0012\u0004\u0012\u0002030H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020%8\u0002X\u0082D¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010O\u001a\u00020%8\u0002X\u0082D¢\u0006\u0006\n\u0004\bO\u0010NR$\u0010R\u001a\u0012\u0012\u0004\u0012\u00020%0Pj\b\u0012\u0004\u0012\u00020%`Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010T\u001a\u00020%8\u0002X\u0082D¢\u0006\u0006\n\u0004\bT\u0010NR\u0014\u0010U\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010NR$\u0010V\u001a\u0012\u0012\u0004\u0012\u00020%0Pj\b\u0012\u0004\u0012\u00020%`Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010SR\u0016\u0010W\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010NR$\u0010X\u001a\u0012\u0012\u0004\u0012\u00020\u00120Pj\b\u0012\u0004\u0012\u00020\u0012`Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010SR\u0014\u0010Y\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010NR\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010^¨\u0006a"}, m65681d2 = {"Lio/getstream/chat/android/ui/common/feature/messages/composer/AudioRecordingController;", "", "Lio/getstream/chat/android/client/audio/AudioPlayer;", "audioPlayer", "Ls23/g;", "mediaRecorder", "Lkotlin/Function1;", "Ljava/io/File;", "", "fileToUri", "Lbc3/c0;", "scope", "<init>", "(Lio/getstream/chat/android/client/audio/AudioPlayer;Ls23/g;Lkotlin/jvm/functions/Function1;Lbc3/c0;)V", "Ll83/a0;", "startRecording", "(Lq83/d;)Ljava/lang/Object;", "Ll83/k;", "", MapboxMap.QFE_OFFSET, "holdRecording", "(Ll83/k;)V", "lockRecording", "()V", "cancelRecording", "toggleRecordingPlayback", "stopRecording", NotificationCompat.CATEGORY_PROGRESS, "seekRecordingTo", "(F)V", "pauseRecording", "Ln23/h;", "Lio/getstream/chat/android/models/Attachment;", "completeRecordingSync", "completeRecording", "onCleared", "setupMediaRecorder", "", "maxAmplitude", "saveSamples", "(I)V", "processWave", "Lio/getstream/chat/android/client/audio/AudioState;", "playbackState", "onAudioStateChanged", "(Lio/getstream/chat/android/client/audio/AudioState;)V", "Lio/getstream/chat/android/client/audio/ProgressData;", "progressState", "onAudioPlayingProgress", "(Lio/getstream/chat/android/client/audio/ProgressData;)V", "clearData", "Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;", "state", "setState", "(Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;)V", "", "normalize", "(Ljava/util/List;)Ljava/util/List;", "amplitude", "(I)F", "targetSamples", "downsampleMax", "(Ljava/util/List;I)Ljava/util/List;", "", "([I)I", "Lio/getstream/chat/android/client/audio/AudioPlayer;", "Ls23/g;", "Lkotlin/jvm/functions/Function1;", "Lbc3/c0;", "Lb23/k;", "logger", "Lb23/k;", "Lec3/p1;", "recordingState", "Lec3/p1;", "getRecordingState", "()Lec3/p1;", "drawPollingInterval", "I", "realPollingInterval", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "samples", "Ljava/util/ArrayList;", "samplesTarget", "samplesLimit", "samplesBuffer", "samplesBufferLimit", "waveform", "waveformBuffer", "[I", "waveformBufferCount", "Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingCancel", "Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingLock", "Companion", "stream-chat-android-ui-common_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AudioRecordingController {
    public static final int $stable = 8;
    private static final float MaxAmplitude = 32767.0f;
    private static final float NoiseFloor = 50.0f;
    private final AudioPlayer audioPlayer;
    private final int drawPollingInterval;
    private final Function1 fileToUri;
    private final C2345k logger;
    private final InterfaceC32094g mediaRecorder;
    private final AtomicBoolean pendingCancel;
    private final AtomicBoolean pendingLock;
    private final int realPollingInterval;
    private final InterfaceC13075p1 recordingState;
    private final ArrayList<Integer> samples;
    private final ArrayList<Integer> samplesBuffer;
    private int samplesBufferLimit;
    private final int samplesLimit;
    private final int samplesTarget;
    private final InterfaceC2994c0 scope;
    private final ArrayList<Float> waveform;
    private final int[] waveformBuffer;
    private int waveformBufferCount;

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioState.values().length];
            try {
                iArr[AudioState.PLAYING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioState.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.AudioRecordingController$completeRecording$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.AudioRecordingController", m100430f = "AudioRecordingController.kt", m100431l = {438, 445, 466}, m100432m = "completeRecording")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C195041 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C195041(InterfaceC30057d<? super C195041> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AudioRecordingController.this.completeRecording(this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.AudioRecordingController$completeRecording$5 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.AudioRecordingController$completeRecording$5", m100430f = "AudioRecordingController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195055 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ RecordingState.Complete $complete;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C195055(RecordingState.Complete complete, InterfaceC30057d<? super C195055> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$complete = complete;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return AudioRecordingController.this.new C195055(this.$complete, interfaceC30057d);
        }

        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C195055 c195055 = (C195055) create(interfaceC2994c0, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c195055.invokeSuspend(c23454a0);
            return c23454a0;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AudioRecordingController.this.setState(this.$complete);
            AudioRecordingController.this.setState(RecordingState.Idle.INSTANCE);
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2994c0) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.AudioRecordingController$completeRecording$8 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.AudioRecordingController$completeRecording$8", m100430f = "AudioRecordingController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195068 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ C32093f $recorded;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C195068(C32093f c32093f, InterfaceC30057d<? super C195068> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$recorded = c32093f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return AudioRecordingController.this.new C195068(this.$recorded, interfaceC30057d);
        }

        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C195068 c195068 = (C195068) create(interfaceC2994c0, interfaceC30057d);
            C23454a0 c23454a0 = C23454a0.f92919a;
            c195068.invokeSuspend(c23454a0);
            return c23454a0;
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            AudioRecordingController.this.setState(new RecordingState.Complete(this.$recorded.f133096b));
            AudioRecordingController.this.setState(RecordingState.Idle.INSTANCE);
            return C23454a0.f92919a;
        }

        @Override // c93.InterfaceC4351m
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((InterfaceC2994c0) obj, (InterfaceC30057d<? super C23454a0>) obj2);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.AudioRecordingController$completeRecordingSync$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.AudioRecordingController", m100430f = "AudioRecordingController.kt", m100431l = {395}, m100432m = "completeRecordingSync")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C195071 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C195071(InterfaceC30057d<? super C195071> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AudioRecordingController.this.completeRecordingSync(this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.AudioRecordingController$startRecording$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.AudioRecordingController", m100430f = "AudioRecordingController.kt", m100431l = {185}, m100432m = "startRecording")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C195081 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C195081(InterfaceC30057d<? super C195081> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AudioRecordingController.this.startRecording(this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.AudioRecordingController$startRecording$4 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.AudioRecordingController$startRecording$4", m100430f = "AudioRecordingController.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lbc3/c0;", "Ln23/h;", "Ljava/io/File;", "<anonymous>", "(Lbc3/c0;)Ln23/h;"}, m65682k = 3, m65683mv = {2, 2, 0})
    public static final class C195094 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ String $recordingName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C195094(String str, InterfaceC30057d<? super C195094> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$recordingName = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return AudioRecordingController.this.new C195094(this.$recordingName, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
            return ((C195094) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC32094g interfaceC32094g = AudioRecordingController.this.mediaRecorder;
            String recordingName = this.$recordingName;
            long j7 = AudioRecordingController.this.realPollingInterval;
            C32091d c32091d = (C32091d) interfaceC32094g;
            c32091d.getClass();
            AbstractC22676k.m65750j(recordingName, "recordingName");
            try {
                AbstractC26205h abstractC26205hCreateFileInCache = c32091d.f133075b.createFileInCache(c32091d.f133074a, recordingName);
                if (!(abstractC26205hCreateFileInCache instanceof C26204g)) {
                    if (abstractC26205hCreateFileInCache instanceof C26203f) {
                        return abstractC26205hCreateFileInCache;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                File file = (File) ((C26204g) abstractC26205hCreateFileInCache).f103919a;
                c32091d.f133082i = file;
                C32091d.m99828a(c32091d, file);
                MediaRecorder mediaRecorder = c32091d.f133081h;
                if (mediaRecorder == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                mediaRecorder.start();
                C19544a c19544a = c32091d.f133085l;
                if (c19544a != null) {
                    AudioRecordingController.setupMediaRecorder$lambda$1(c19544a.f74449a);
                }
                c32091d.m99832e(EnumC32092e.f133093y);
                c32091d.f133084k.clear();
                C2996c2 c2996c2 = c32091d.f133078e;
                InterfaceC30057d interfaceC30057d = null;
                if (c2996c2 != null) {
                    c2996c2.cancel((CancellationException) null);
                }
                c32091d.f133078e = AbstractC3006f0.m8732z(c32091d.f133077d, null, null, new C2698i(c32091d, j7, interfaceC30057d, 4), 3);
                return abstractC26205hCreateFileInCache;
            } catch (Exception e5) {
                c32091d.m99831d();
                C2345k c2345kM99830c = c32091d.m99830c();
                InterfaceC2339e interfaceC2339e = c2345kM99830c.f9275c;
                String str = c2345kM99830c.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.ERROR;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    c2345kM99830c.f9274b.log(enumC2341g, str, "Could not start recording audio", e5);
                }
                return new C26203f(new C26201d("Could not start audio recording.", e5));
            }
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.AudioRecordingController$stopRecording$1 */
    @InterfaceC32271e(m100429c = "io.getstream.chat.android.ui.common.feature.messages.composer.AudioRecordingController", m100430f = "AudioRecordingController.kt", m100431l = {331}, m100432m = "stopRecording")
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class C195101 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C195101(InterfaceC30057d<? super C195101> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AudioRecordingController.this.stopRecording(this);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.AudioRecordingController$toggleRecordingPlayback$6 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C195116 extends C22672i implements Function1 {
        public C195116(Object obj) {
            super(1, 0, AudioRecordingController.class, obj, "onAudioPlayingProgress", "onAudioPlayingProgress(Lio/getstream/chat/android/client/audio/ProgressData;)V");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ProgressData) obj);
            return C23454a0.f92919a;
        }

        public final void invoke(ProgressData p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((AudioRecordingController) this.receiver).onAudioPlayingProgress(p13);
        }
    }

    /* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.composer.AudioRecordingController$toggleRecordingPlayback$7 */
    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final /* synthetic */ class C195127 extends C22672i implements Function1 {
        public C195127(Object obj) {
            super(1, 0, AudioRecordingController.class, obj, "onAudioStateChanged", "onAudioStateChanged(Lio/getstream/chat/android/client/audio/AudioState;)V");
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AudioState) obj);
            return C23454a0.f92919a;
        }

        public final void invoke(AudioState p13) {
            AbstractC22676k.m65750j(p13, "p0");
            ((AudioRecordingController) this.receiver).onAudioStateChanged(p13);
        }
    }

    public AudioRecordingController(AudioPlayer audioPlayer, InterfaceC32094g mediaRecorder, Function1 fileToUri, InterfaceC2994c0 scope) {
        AbstractC22676k.m65750j(audioPlayer, "audioPlayer");
        AbstractC22676k.m65750j(mediaRecorder, "mediaRecorder");
        AbstractC22676k.m65750j(fileToUri, "fileToUri");
        AbstractC22676k.m65750j(scope, "scope");
        this.audioPlayer = audioPlayer;
        this.mediaRecorder = mediaRecorder;
        this.fileToUri = fileToUri;
        this.scope = scope;
        this.logger = new C2345k("Chat:RecordController", C2343i.f9271c, C2343i.f9272d);
        this.recordingState = AbstractC13091v.m36593c(RecordingState.Idle.INSTANCE);
        this.drawPollingInterval = 100;
        this.realPollingInterval = 10;
        this.samples = new ArrayList<>();
        this.samplesTarget = 100;
        this.samplesLimit = 1000;
        this.samplesBuffer = new ArrayList<>();
        this.samplesBufferLimit = 1;
        this.waveform = new ArrayList<>();
        this.waveformBuffer = new int[10];
        this.pendingCancel = new AtomicBoolean(false);
        this.pendingLock = new AtomicBoolean(false);
        setupMediaRecorder();
    }

    private final void clearData() {
        C2345k c2345k = this.logger;
        InterfaceC2339e interfaceC2339e = c2345k.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = c2345k.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345k.f9274b.log(enumC2341g, str, "[clearData] no args", null);
        }
        this.waveform.clear();
        AbstractC25260n.m74074o0(this.waveformBuffer, 0);
        this.waveformBufferCount = 0;
        this.samples.clear();
        this.samplesBuffer.clear();
        this.samplesBufferLimit = 1;
        this.pendingCancel.set(false);
        this.pendingLock.set(false);
        setState(RecordingState.Idle.INSTANCE);
    }

    private final int downsampleMax(int[] iArr) {
        AbstractC22676k.m65750j(iArr, "<this>");
        if (iArr.length == 0) {
            throw new NoSuchElementException();
        }
        int i13 = iArr[0];
        int i14 = 1;
        int length = iArr.length - 1;
        if (1 <= length) {
            while (true) {
                int i15 = iArr[i14];
                if (i13 < i15) {
                    i13 = i15;
                }
                if (i14 == length) {
                    break;
                }
                i14++;
            }
        }
        return i13;
    }

    public static /* synthetic */ void holdRecording$default(AudioRecordingController audioRecordingController, C23465k c23465k, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            c23465k = null;
        }
        audioRecordingController.holdRecording(c23465k);
    }

    private final List<Float> normalize(List<Integer> list) {
        List<Integer> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(normalize(((Number) it.next()).intValue())));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAudioPlayingProgress(ProgressData progressState) {
        RecordingState recordingState = (RecordingState) ((C13045h2) this.recordingState).getValue();
        if (recordingState instanceof RecordingState.Overview) {
            RecordingState.Overview overview = (RecordingState.Overview) recordingState;
            float progress = progressState.getProgress();
            Integer numValueOf = Integer.valueOf(progressState.getDuration());
            if (numValueOf.intValue() <= 0) {
                numValueOf = null;
            }
            setState(RecordingState.Overview.copy$default(overview, numValueOf != null ? numValueOf.intValue() : overview.getDurationInMs(), null, null, true, progress, 0, 38, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAudioStateChanged(AudioState playbackState) {
        RecordingState recordingState = (RecordingState) ((C13045h2) this.recordingState).getValue();
        if (!(recordingState instanceof RecordingState.Overview)) {
            C2345k c2345k = this.logger;
            InterfaceC2339e interfaceC2339e = c2345k.f9275c;
            String str = c2345k.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.DEBUG;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345k.f9274b.log(enumC2341g, str, AbstractC17176i.m48502d("[onAudioStateChanged] rejected (state is not Overview): ", recordingState), null);
                return;
            }
            return;
        }
        C2345k c2345k2 = this.logger;
        InterfaceC2339e interfaceC2339e2 = c2345k2.f9275c;
        String str2 = c2345k2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            c2345k2.f9274b.log(enumC2341g2, str2, "[onAudioStateChanged] playbackState: " + playbackState, null);
        }
        RecordingState.Overview overview = (RecordingState.Overview) recordingState;
        boolean z4 = playbackState == AudioState.PLAYING;
        int i13 = WhenMappings.$EnumSwitchMapping$0[playbackState.ordinal()];
        setState(RecordingState.Overview.copy$default(overview, 0, null, null, z4, (i13 == 1 || i13 == 2) ? overview.getPlayingProgress() : 0.0f, 0, 39, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processWave(int maxAmplitude) {
        int[] iArr = this.waveformBuffer;
        int i13 = this.waveformBufferCount;
        int i14 = i13 + 1;
        this.waveformBufferCount = i14;
        iArr[i13] = maxAmplitude;
        if (i14 < iArr.length) {
            return;
        }
        float fNormalize = normalize(downsampleMax(iArr));
        this.waveformBufferCount = 0;
        this.waveform.add(Float.valueOf(fNormalize));
        RecordingState recordingState = (RecordingState) ((C13045h2) this.recordingState).getValue();
        if (recordingState instanceof RecordingState.Recording) {
            C2345k c2345k = this.logger;
            InterfaceC2339e interfaceC2339e = c2345k.f9275c;
            String str = c2345k.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345k.f9274b.log(enumC2341g, str, "[processWave] waveform.size(" + fNormalize + "): " + this.waveform.size(), null);
            }
            setState(RecordingStateKt.copy$default((RecordingState.Recording) recordingState, 0, new ArrayList(this.waveform), 1, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveSamples(int maxAmplitude) {
        this.samplesBuffer.add(Integer.valueOf(maxAmplitude));
        if (this.samplesBuffer.size() < this.samplesBufferLimit) {
            return;
        }
        int iIntValue = ((Number) AbstractC25265s.m74119W0(this.samplesBuffer)).intValue();
        this.samplesBuffer.clear();
        this.samples.add(Integer.valueOf(iIntValue));
        if (this.samples.size() > this.samplesLimit) {
            List<Integer> listDownsampleMax = downsampleMax(this.samples, this.samplesTarget);
            this.samples.clear();
            this.samples.addAll(listDownsampleMax);
            this.samplesBufferLimit = (this.samplesLimit / this.samplesTarget) * this.samplesBufferLimit;
            C2345k c2345k = this.logger;
            InterfaceC2339e interfaceC2339e = c2345k.f9275c;
            String str = c2345k.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345k.f9274b.log(enumC2341g, str, AbstractC2875y.m8295h(this.samplesBufferLimit, "[saveSamples] reached samples limit; samplesBufferLimit: "), null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(RecordingState state) {
        ((C13045h2) this.recordingState).m36570j(state);
    }

    private final void setupMediaRecorder() {
        InterfaceC32094g interfaceC32094g = this.mediaRecorder;
        C19544a c19544a = new C19544a(this);
        C32091d c32091d = (C32091d) interfaceC32094g;
        c32091d.getClass();
        c32091d.f133085l = c19544a;
        InterfaceC32094g interfaceC32094g2 = this.mediaRecorder;
        C19544a c19544a2 = new C19544a(this);
        C32091d c32091d2 = (C32091d) interfaceC32094g2;
        c32091d2.getClass();
        c32091d2.f133086m = c19544a2;
        InterfaceC32094g interfaceC32094g3 = this.mediaRecorder;
        C19544a c19544a3 = new C19544a(this);
        C32091d c32091d3 = (C32091d) interfaceC32094g3;
        c32091d3.getClass();
        c32091d3.f133088o = c19544a3;
        InterfaceC32094g interfaceC32094g4 = this.mediaRecorder;
        final C19544a c19544a4 = new C19544a(this);
        final C32091d c32091d4 = (C32091d) interfaceC32094g4;
        c32091d4.getClass();
        MediaRecorder mediaRecorder = c32091d4.f133081h;
        if (mediaRecorder != null) {
            mediaRecorder.setOnErrorListener(new MediaRecorder.OnErrorListener() { // from class: s23.a
                @Override // android.media.MediaRecorder.OnErrorListener
                public final void onError(MediaRecorder mediaRecorder2, int i13, int i14) {
                    AudioRecordingController.setupMediaRecorder$lambda$7(c19544a4.f74449a, c32091d4, i13, i14);
                }
            });
        }
        InterfaceC32094g interfaceC32094g5 = this.mediaRecorder;
        final C19544a c19544a5 = new C19544a(this);
        final C32091d c32091d5 = (C32091d) interfaceC32094g5;
        c32091d5.getClass();
        MediaRecorder mediaRecorder2 = c32091d5.f133081h;
        if (mediaRecorder2 != null) {
            mediaRecorder2.setOnInfoListener(new MediaRecorder.OnInfoListener() { // from class: s23.b
                @Override // android.media.MediaRecorder.OnInfoListener
                public final void onInfo(MediaRecorder mediaRecorder3, int i13, int i14) {
                    AudioRecordingController.setupMediaRecorder$lambda$9(c19544a5.f74449a, c32091d5, i13, i14);
                }
            });
        }
        InterfaceC32094g interfaceC32094g6 = this.mediaRecorder;
        C19544a c19544a6 = new C19544a(this);
        C32091d c32091d6 = (C32091d) interfaceC32094g6;
        c32091d6.getClass();
        c32091d6.f133089p = c19544a6;
        InterfaceC32094g interfaceC32094g7 = this.mediaRecorder;
        C19544a c19544a7 = new C19544a(this);
        C32091d c32091d7 = (C32091d) interfaceC32094g7;
        c32091d7.getClass();
        c32091d7.f133087n = c19544a7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupMediaRecorder$lambda$1(AudioRecordingController audioRecordingController) {
        C2345k c2345k = audioRecordingController.logger;
        InterfaceC2339e interfaceC2339e = c2345k.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = c2345k.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345k.f9274b.log(enumC2341g, str, "[onRecorderStarted] no args", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupMediaRecorder$lambda$10(AudioRecordingController audioRecordingController, long j7) {
        AbstractC3006f0.m8732z(audioRecordingController.scope, DispatcherProvider.INSTANCE.getMain(), null, new AudioRecordingController$setupMediaRecorder$6$1(audioRecordingController, j7, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupMediaRecorder$lambda$11(AudioRecordingController audioRecordingController, int i13) {
        AbstractC3006f0.m8732z(audioRecordingController.scope, DispatcherProvider.INSTANCE.getMain(), null, new AudioRecordingController$setupMediaRecorder$7$1(audioRecordingController, i13, null), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupMediaRecorder$lambda$3(AudioRecordingController audioRecordingController) {
        C2345k c2345k = audioRecordingController.logger;
        InterfaceC2339e interfaceC2339e = c2345k.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = c2345k.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345k.f9274b.log(enumC2341g, str, AbstractC25012a.m73375h(((C13045h2) audioRecordingController.recordingState).getValue(), "[onRecorderStopped] recordingState: "), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupMediaRecorder$lambda$5(AudioRecordingController audioRecordingController, EnumC32092e state) {
        AbstractC22676k.m65750j(state, "state");
        C2345k c2345k = audioRecordingController.logger;
        InterfaceC2339e interfaceC2339e = c2345k.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = c2345k.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345k.f9274b.log(enumC2341g, str, "[onRecorderStateChanged] state: " + state + "; recordingState: " + ((C13045h2) audioRecordingController.recordingState).getValue(), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupMediaRecorder$lambda$7(AudioRecordingController audioRecordingController, InterfaceC32094g interfaceC32094g, int i13, int i14) {
        AbstractC22676k.m65750j(interfaceC32094g, "<unused var>");
        C2345k c2345k = audioRecordingController.logger;
        InterfaceC2339e interfaceC2339e = c2345k.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.ERROR;
        String str = c2345k.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345k.f9274b.log(enumC2341g, str, AbstractC2875y.m8294g(i13, i14, "[onRecorderError] what: ", ", extra: "), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupMediaRecorder$lambda$9(AudioRecordingController audioRecordingController, InterfaceC32094g interfaceC32094g, int i13, int i14) {
        AbstractC22676k.m65750j(interfaceC32094g, "<unused var>");
        C2345k c2345k = audioRecordingController.logger;
        InterfaceC2339e interfaceC2339e = c2345k.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = c2345k.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345k.f9274b.log(enumC2341g, str, AbstractC2875y.m8294g(i13, i14, "[onRecorderInfo] what: ", ", extra: "), null);
        }
    }

    public final void cancelRecording() {
        RecordingState recordingState = (RecordingState) ((C13045h2) this.recordingState).getValue();
        if (recordingState instanceof RecordingState.Idle) {
            C2345k c2345k = this.logger;
            InterfaceC2339e interfaceC2339e = c2345k.f9275c;
            String str = c2345k.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.INFO;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345k.f9274b.log(enumC2341g, str, "[cancelRecording] state is Idle, setting pending cancel", null);
            }
            this.pendingCancel.set(true);
            return;
        }
        C2345k c2345k2 = this.logger;
        InterfaceC2339e interfaceC2339e2 = c2345k2.f9275c;
        String str2 = c2345k2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.INFO;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            c2345k2.f9274b.log(enumC2341g2, str2, AbstractC17176i.m48502d("[cancelRecording] state: ", recordingState), null);
        }
        ((C32091d) this.mediaRecorder).m99831d();
        if (recordingState instanceof RecordingState.Overview) {
            RecordingState.Overview overview = (RecordingState.Overview) recordingState;
            if (overview.isPlaying()) {
                this.audioPlayer.resetAudio(overview.getPlayingId());
            }
        }
        clearData();
        setState(RecordingState.Idle.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object completeRecording(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        C195041 c195041;
        RecordingState recordingState;
        if (interfaceC30057d instanceof C195041) {
            c195041 = (C195041) interfaceC30057d;
            int i13 = c195041.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c195041.label = i13 - Integer.MIN_VALUE;
            } else {
                c195041 = new C195041(interfaceC30057d);
            }
        } else {
            c195041 = new C195041(interfaceC30057d);
        }
        Object objM8705K = c195041.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c195041.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            recordingState = (RecordingState) ((C13045h2) this.recordingState).getValue();
            C2345k c2345k = this.logger;
            InterfaceC2339e interfaceC2339e = c2345k.f9275c;
            String str = c2345k.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345k.f9274b.log(enumC2341g, str, AbstractC17176i.m48502d("[completeRecording] state: ", recordingState), null);
            }
            if (!(recordingState instanceof RecordingState.Idle)) {
                if (recordingState instanceof RecordingState.Overview) {
                    C2345k c2345k2 = this.logger;
                    InterfaceC2339e interfaceC2339e2 = c2345k2.f9275c;
                    String str2 = c2345k2.f9273a;
                    EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
                    if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                        c2345k2.f9274b.log(enumC2341g2, str2, "[completeRecording] completing from Overview state", null);
                    }
                    RecordingState.Overview overview = (RecordingState.Overview) recordingState;
                    this.audioPlayer.resetAudio(overview.getPlayingId());
                    clearData();
                    RecordingState.Complete complete = new RecordingState.Complete(Attachment.copy$default(overview.getAttachment(), null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, AbstractC25247g0.m73995d0(overview.getAttachment().getExtraData(), AbstractC25247g0.m73989X(new C23465k(AttachmentExtensionsKt.EXTRA_WAVEFORM_DATA, overview.getWaveform()))), 524287, null));
                    AbstractC3076z main = DispatcherProvider.INSTANCE.getMain();
                    C195055 c195055 = new C195055(complete, null);
                    c195041.L$0 = null;
                    c195041.L$1 = null;
                    c195041.label = 1;
                    if (AbstractC3006f0.m8705K(main, c195055, c195041) == enumC31071a) {
                    }
                } else {
                    AbstractC3076z io3 = DispatcherProvider.INSTANCE.getIO();
                    AudioRecordingController$completeRecording$result$1 audioRecordingController$completeRecording$result$1 = new AudioRecordingController$completeRecording$result$1(this, null);
                    c195041.L$0 = recordingState;
                    c195041.label = 2;
                    objM8705K = AbstractC3006f0.m8705K(io3, audioRecordingController$completeRecording$result$1, c195041);
                    if (objM8705K != enumC31071a) {
                    }
                }
            }
            C2345k c2345k3 = this.logger;
            InterfaceC2339e interfaceC2339e3 = c2345k3.f9275c;
            String str3 = c2345k3.f9273a;
            if (interfaceC2339e3.isLoggable(enumC2341g, str3)) {
                c2345k3.f9274b.log(enumC2341g, str3, "[completeRecording] rejected (state is Idle)", null);
                return c23454a0;
            }
        }
        if (i14 == 1) {
            AbstractC34132o.m107864I(objM8705K);
            return c23454a0;
        }
        if (i14 != 2) {
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
            return c23454a0;
        }
        recordingState = (RecordingState) c195041.L$0;
        AbstractC34132o.m107864I(objM8705K);
        AbstractC26205h abstractC26205h = (AbstractC26205h) objM8705K;
        if (abstractC26205h instanceof C26203f) {
            C2345k c2345k4 = this.logger;
            InterfaceC2339e interfaceC2339e4 = c2345k4.f9275c;
            String str4 = c2345k4.f9273a;
            EnumC2341g enumC2341g3 = EnumC2341g.ERROR;
            if (interfaceC2339e4.isLoggable(enumC2341g3, str4)) {
                c2345k4.f9274b.log(enumC2341g3, str4, "[completeRecording] failed: " + abstractC26205h.m77815a(), null);
            }
            clearData();
            setState(RecordingState.Idle.INSTANCE);
            return c23454a0;
        }
        List<Float> listNormalize = normalize(downsampleMax(this.samples, this.samplesTarget));
        clearData();
        C32093f c32093f = (C32093f) abstractC26205h.m77817c();
        Attachment attachment = c32093f.f133096b;
        Attachment attachment2 = Attachment.copy$default(attachment, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, AbstractC25247g0.m73995d0(attachment.getExtraData(), AbstractC25247g0.m73989X(new C23465k(AttachmentExtensionsKt.EXTRA_WAVEFORM_DATA, listNormalize))), 524287, null);
        int i15 = c32093f.f133095a;
        AbstractC22676k.m65750j(attachment2, "attachment");
        C32093f c32093f2 = new C32093f(i15, attachment2);
        C2345k c2345k5 = this.logger;
        InterfaceC2339e interfaceC2339e5 = c2345k5.f9275c;
        String str5 = c2345k5.f9273a;
        EnumC2341g enumC2341g4 = EnumC2341g.DEBUG;
        if (interfaceC2339e5.isLoggable(enumC2341g4, str5)) {
            c2345k5.f9274b.log(enumC2341g4, str5, AbstractC17176i.m48502d("[completeRecording] complete from state: ", recordingState), null);
        }
        AbstractC3076z main2 = DispatcherProvider.INSTANCE.getMain();
        C195068 c195068 = new C195068(c32093f2, null);
        c195041.L$0 = null;
        c195041.L$1 = null;
        c195041.L$2 = null;
        c195041.L$3 = null;
        c195041.L$4 = null;
        c195041.label = 3;
        return AbstractC3006f0.m8705K(main2, c195068, c195041) == enumC31071a ? enumC31071a : c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object completeRecordingSync(InterfaceC30057d<? super AbstractC26205h> interfaceC30057d) {
        C195071 c195071;
        RecordingState recordingState;
        if (interfaceC30057d instanceof C195071) {
            c195071 = (C195071) interfaceC30057d;
            int i13 = c195071.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c195071.label = i13 - Integer.MIN_VALUE;
            } else {
                c195071 = new C195071(interfaceC30057d);
            }
        } else {
            c195071 = new C195071(interfaceC30057d);
        }
        Object obj = c195071.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c195071.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            RecordingState recordingState2 = (RecordingState) ((C13045h2) this.recordingState).getValue();
            C2345k c2345k = this.logger;
            InterfaceC2339e interfaceC2339e = c2345k.f9275c;
            String str = c2345k.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345k.f9274b.log(enumC2341g, str, AbstractC17176i.m48502d("[completeRecordingSync] state: ", recordingState2), null);
            }
            if (recordingState2 instanceof RecordingState.Idle) {
                C2345k c2345k2 = this.logger;
                InterfaceC2339e interfaceC2339e2 = c2345k2.f9275c;
                String str2 = c2345k2.f9273a;
                if (interfaceC2339e2.isLoggable(enumC2341g, str2)) {
                    c2345k2.f9274b.log(enumC2341g, str2, "[completeRecordingSync] rejected (state is Idle)", null);
                }
                return new C26203f(new C26198a("Recording is in Idle state"));
            }
            if (recordingState2 instanceof RecordingState.Overview) {
                C2345k c2345k3 = this.logger;
                InterfaceC2339e interfaceC2339e3 = c2345k3.f9275c;
                String str3 = c2345k3.f9273a;
                EnumC2341g enumC2341g2 = EnumC2341g.DEBUG;
                if (interfaceC2339e3.isLoggable(enumC2341g2, str3)) {
                    c2345k3.f9274b.log(enumC2341g2, str3, "[completeRecordingSync] completing from Overview state", null);
                }
                clearData();
                RecordingState.Overview overview = (RecordingState.Overview) recordingState2;
                Attachment attachmentCopy$default = Attachment.copy$default(overview.getAttachment(), null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, AbstractC25247g0.m73995d0(overview.getAttachment().getExtraData(), AbstractC25247g0.m73989X(new C23465k(AttachmentExtensionsKt.EXTRA_WAVEFORM_DATA, overview.getWaveform()))), 524287, null);
                setState(RecordingState.Idle.INSTANCE);
                return new C26204g(attachmentCopy$default);
            }
            AbstractC3076z io3 = DispatcherProvider.INSTANCE.getIO();
            AudioRecordingController$completeRecordingSync$result$1 audioRecordingController$completeRecordingSync$result$1 = new AudioRecordingController$completeRecordingSync$result$1(this, null);
            c195071.L$0 = recordingState2;
            c195071.label = 1;
            Object objM8705K = AbstractC3006f0.m8705K(io3, audioRecordingController$completeRecordingSync$result$1, c195071);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
            recordingState = recordingState2;
            obj = objM8705K;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            recordingState = (RecordingState) c195071.L$0;
            AbstractC34132o.m107864I(obj);
        }
        AbstractC26205h abstractC26205h = (AbstractC26205h) obj;
        if (abstractC26205h instanceof C26203f) {
            C2345k c2345k4 = this.logger;
            InterfaceC2339e interfaceC2339e4 = c2345k4.f9275c;
            String str4 = c2345k4.f9273a;
            EnumC2341g enumC2341g3 = EnumC2341g.ERROR;
            if (interfaceC2339e4.isLoggable(enumC2341g3, str4)) {
                c2345k4.f9274b.log(enumC2341g3, str4, "[completeRecordingSync] failed: " + ((C26203f) abstractC26205h).f103918a, null);
            }
            clearData();
            setState(RecordingState.Idle.INSTANCE);
            return abstractC26205h;
        }
        if (!(abstractC26205h instanceof C26204g)) {
            throw new NoWhenBranchMatchedException();
        }
        C2345k c2345k5 = this.logger;
        InterfaceC2339e interfaceC2339e5 = c2345k5.f9275c;
        String str5 = c2345k5.f9273a;
        EnumC2341g enumC2341g4 = EnumC2341g.DEBUG;
        if (interfaceC2339e5.isLoggable(enumC2341g4, str5)) {
            c2345k5.f9274b.log(enumC2341g4, str5, AbstractC17176i.m48502d("[completeRecordingSync] complete from state: ", recordingState), null);
        }
        List<Float> listNormalize = normalize(downsampleMax(this.samples, this.samplesTarget));
        clearData();
        Attachment attachment = ((C32093f) ((C26204g) abstractC26205h).f103919a).f133096b;
        Attachment attachmentCopy$default2 = Attachment.copy$default(attachment, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, AbstractC25247g0.m73995d0(attachment.getExtraData(), AbstractC25247g0.m73989X(new C23465k(AttachmentExtensionsKt.EXTRA_WAVEFORM_DATA, listNormalize))), 524287, null);
        setState(RecordingState.Idle.INSTANCE);
        return new C26204g(attachmentCopy$default2);
    }

    public final InterfaceC13075p1 getRecordingState() {
        return this.recordingState;
    }

    public final void holdRecording(C23465k offset) {
        RecordingState recordingState = (RecordingState) ((C13045h2) this.recordingState).getValue();
        if (!(recordingState instanceof RecordingState.Hold)) {
            C2345k c2345k = this.logger;
            InterfaceC2339e interfaceC2339e = c2345k.f9275c;
            String str = c2345k.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345k.f9274b.log(enumC2341g, str, AbstractC17176i.m48502d("[holdRecording] rejected (state is not Hold): ", recordingState), null);
                return;
            }
            return;
        }
        if (offset == null) {
            C2345k c2345k2 = this.logger;
            InterfaceC2339e interfaceC2339e2 = c2345k2.f9275c;
            String str2 = c2345k2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                c2345k2.f9274b.log(enumC2341g2, str2, "[holdRecording] rejected (offset is null)", null);
                return;
            }
            return;
        }
        C2345k c2345k3 = this.logger;
        InterfaceC2339e interfaceC2339e3 = c2345k3.f9275c;
        String str3 = c2345k3.f9273a;
        EnumC2341g enumC2341g3 = EnumC2341g.VERBOSE;
        if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
            c2345k3.f9274b.log(enumC2341g3, str3, "[holdRecording] offset: Offset(" + offset.f92937w + ":" + offset.f92938x + ")", null);
        }
        setState(RecordingState.Hold.copy$default((RecordingState.Hold) recordingState, 0, null, offset, 3, null));
    }

    public final void lockRecording() {
        RecordingState recordingState = (RecordingState) ((C13045h2) this.recordingState).getValue();
        if (recordingState instanceof RecordingState.Idle) {
            C2345k c2345k = this.logger;
            InterfaceC2339e interfaceC2339e = c2345k.f9275c;
            String str = c2345k.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.INFO;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345k.f9274b.log(enumC2341g, str, "[lockRecording] state is Idle, setting pending lock", null);
            }
            this.pendingLock.set(true);
            return;
        }
        if (!(recordingState instanceof RecordingState.Hold)) {
            C2345k c2345k2 = this.logger;
            InterfaceC2339e interfaceC2339e2 = c2345k2.f9275c;
            String str2 = c2345k2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.WARN;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                c2345k2.f9274b.log(enumC2341g2, str2, AbstractC17176i.m48502d("[lockRecording] rejected (state is not Hold): ", recordingState), null);
                return;
            }
            return;
        }
        C2345k c2345k3 = this.logger;
        InterfaceC2339e interfaceC2339e3 = c2345k3.f9275c;
        String str3 = c2345k3.f9273a;
        EnumC2341g enumC2341g3 = EnumC2341g.INFO;
        if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
            c2345k3.f9274b.log(enumC2341g3, str3, AbstractC17176i.m48502d("[lockRecording] state: ", recordingState), null);
        }
        RecordingState.Hold hold = (RecordingState.Hold) recordingState;
        setState(new RecordingState.Locked(hold.getDurationInMs(), hold.getWaveform()));
    }

    public final void onCleared() {
        C2345k c2345k = this.logger;
        InterfaceC2339e interfaceC2339e = c2345k.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str = c2345k.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345k.f9274b.log(enumC2341g, str, "[onCleared] no args", null);
        }
        ((C32091d) this.mediaRecorder).m99831d();
        RecordingState recordingState = (RecordingState) ((C13045h2) this.recordingState).getValue();
        if (recordingState instanceof RecordingState.Overview) {
            this.audioPlayer.resetAudio(((RecordingState.Overview) recordingState).getPlayingId());
        }
        clearData();
    }

    public final void pauseRecording() {
        RecordingState recordingState = (RecordingState) ((C13045h2) this.recordingState).getValue();
        if (!(recordingState instanceof RecordingState.Overview)) {
            C2345k c2345k = this.logger;
            InterfaceC2339e interfaceC2339e = c2345k.f9275c;
            String str = c2345k.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345k.f9274b.log(enumC2341g, str, "[pauseRecording] rejected (state is not Overview)", null);
                return;
            }
            return;
        }
        C2345k c2345k2 = this.logger;
        InterfaceC2339e interfaceC2339e2 = c2345k2.f9275c;
        String str2 = c2345k2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.INFO;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            c2345k2.f9274b.log(enumC2341g2, str2, AbstractC17176i.m48502d("[pauseRecording] state: ", recordingState), null);
        }
        RecordingState.Overview overview = (RecordingState.Overview) recordingState;
        this.audioPlayer.startSeek(overview.getPlayingId());
        setState(RecordingState.Overview.copy$default(overview, 0, null, null, false, 0.0f, 0, 55, null));
    }

    public final void seekRecordingTo(float progress) {
        RecordingState recordingState = (RecordingState) ((C13045h2) this.recordingState).getValue();
        if (!(recordingState instanceof RecordingState.Overview)) {
            C2345k c2345k = this.logger;
            InterfaceC2339e interfaceC2339e = c2345k.f9275c;
            String str = c2345k.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.WARN;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345k.f9274b.log(enumC2341g, str, "[seekRecordingTo] rejected (state is not Overview)", null);
                return;
            }
            return;
        }
        RecordingState.Overview overview = (RecordingState.Overview) recordingState;
        if (overview.getAttachment().getUpload() == null) {
            C2345k c2345k2 = this.logger;
            InterfaceC2339e interfaceC2339e2 = c2345k2.f9275c;
            String str2 = c2345k2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.WARN;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                c2345k2.f9274b.log(enumC2341g2, str2, "[seekRecordingTo] rejected (audioFile is null)", null);
                return;
            }
            return;
        }
        int durationInMs = (int) (overview.getDurationInMs() * progress);
        C2345k c2345k3 = this.logger;
        InterfaceC2339e interfaceC2339e3 = c2345k3.f9275c;
        String str3 = c2345k3.f9273a;
        EnumC2341g enumC2341g3 = EnumC2341g.INFO;
        if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
            c2345k3.f9274b.log(enumC2341g3, str3, "[seekRecordingTo] progress: " + progress + " (" + durationInMs + "ms), state: " + recordingState, null);
        }
        this.audioPlayer.seekTo(durationInMs, AudioHashKt.getAudioHash(overview.getAttachment()));
        setState(RecordingState.Overview.copy$default(overview, 0, null, null, false, progress, 0, 47, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object startRecording(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C195081 c195081;
        if (interfaceC30057d instanceof C195081) {
            c195081 = (C195081) interfaceC30057d;
            int i13 = c195081.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c195081.label = i13 - Integer.MIN_VALUE;
            } else {
                c195081 = new C195081(interfaceC30057d);
            }
        } else {
            c195081 = new C195081(interfaceC30057d);
        }
        Object obj = c195081.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c195081.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            RecordingState recordingState = (RecordingState) ((C13045h2) this.recordingState).getValue();
            if (!(recordingState instanceof RecordingState.Idle)) {
                C2345k c2345k = this.logger;
                InterfaceC2339e interfaceC2339e = c2345k.f9275c;
                String str = c2345k.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.WARN;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    c2345k.f9274b.log(enumC2341g, str, AbstractC17176i.m48502d("[startRecording] rejected (state is not Idle): ", recordingState), null);
                }
                return c23454a0;
            }
            C2345k c2345k2 = this.logger;
            InterfaceC2339e interfaceC2339e2 = c2345k2.f9275c;
            String str2 = c2345k2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.INFO;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                c2345k2.f9274b.log(enumC2341g2, str2, AbstractC17176i.m48502d("[startRecording] state: ", recordingState), null);
            }
            String str3 = "audio_recording_" + new Date() + ".aac";
            this.pendingCancel.set(false);
            this.pendingLock.set(false);
            AbstractC3076z io3 = DispatcherProvider.INSTANCE.getIO();
            C195094 c195094 = new C195094(str3, null);
            c195081.L$0 = null;
            c195081.L$1 = null;
            c195081.label = 1;
            if (AbstractC3006f0.m8705K(io3, c195094, c195081) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        if (this.pendingCancel.getAndSet(false)) {
            C2345k c2345k3 = this.logger;
            InterfaceC2339e interfaceC2339e3 = c2345k3.f9275c;
            String str4 = c2345k3.f9273a;
            EnumC2341g enumC2341g3 = EnumC2341g.INFO;
            if (interfaceC2339e3.isLoggable(enumC2341g3, str4)) {
                c2345k3.f9274b.log(enumC2341g3, str4, "[startRecording] applying pending cancel", null);
            }
            ((C32091d) this.mediaRecorder).m99831d();
            clearData();
            return c23454a0;
        }
        if (!this.pendingLock.getAndSet(false)) {
            setState(new RecordingState.Hold(0, null, null, 7, null));
            return c23454a0;
        }
        C2345k c2345k4 = this.logger;
        InterfaceC2339e interfaceC2339e4 = c2345k4.f9275c;
        String str5 = c2345k4.f9273a;
        EnumC2341g enumC2341g4 = EnumC2341g.INFO;
        if (interfaceC2339e4.isLoggable(enumC2341g4, str5)) {
            c2345k4.f9274b.log(enumC2341g4, str5, "[startRecording] applying pending lock", null);
        }
        setState(new RecordingState.Locked(0, C25271y.f99162w));
        return c23454a0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object stopRecording(InterfaceC30057d<? super C23454a0> interfaceC30057d) throws Throwable {
        C195101 c195101;
        if (interfaceC30057d instanceof C195101) {
            c195101 = (C195101) interfaceC30057d;
            int i13 = c195101.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c195101.label = i13 - Integer.MIN_VALUE;
            } else {
                c195101 = new C195101(interfaceC30057d);
            }
        } else {
            c195101 = new C195101(interfaceC30057d);
        }
        Object objM8705K = c195101.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c195101.label;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            RecordingState recordingState = (RecordingState) ((C13045h2) this.recordingState).getValue();
            if (!(recordingState instanceof RecordingState.Locked)) {
                C2345k c2345k = this.logger;
                InterfaceC2339e interfaceC2339e = c2345k.f9275c;
                String str = c2345k.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.WARN;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    c2345k.f9274b.log(enumC2341g, str, AbstractC17176i.m48502d("[stopRecording] rejected (state is not Locked): ", recordingState), null);
                }
                return c23454a0;
            }
            C2345k c2345k2 = this.logger;
            InterfaceC2339e interfaceC2339e2 = c2345k2.f9275c;
            String str2 = c2345k2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.INFO;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                c2345k2.f9274b.log(enumC2341g2, str2, AbstractC17176i.m48502d("[stopRecording] no args: ", recordingState), null);
            }
            AbstractC3076z io3 = DispatcherProvider.INSTANCE.getIO();
            AudioRecordingController$stopRecording$result$1 audioRecordingController$stopRecording$result$1 = new AudioRecordingController$stopRecording$result$1(this, null);
            c195101.L$0 = null;
            c195101.label = 1;
            objM8705K = AbstractC3006f0.m8705K(io3, audioRecordingController$stopRecording$result$1, c195101);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        AbstractC26205h abstractC26205h = (AbstractC26205h) objM8705K;
        if (abstractC26205h instanceof C26203f) {
            C2345k c2345k3 = this.logger;
            InterfaceC2339e interfaceC2339e3 = c2345k3.f9275c;
            String str3 = c2345k3.f9273a;
            EnumC2341g enumC2341g3 = EnumC2341g.ERROR;
            if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
                c2345k3.f9274b.log(enumC2341g3, str3, "[stopRecording] failed: " + abstractC26205h.m77815a(), null);
            }
            clearData();
            setState(RecordingState.Idle.INSTANCE);
            return c23454a0;
        }
        List<Float> listNormalize = normalize(downsampleMax(this.samples, this.samplesTarget));
        clearData();
        C32093f c32093f = (C32093f) abstractC26205h.m77817c();
        C2345k c2345k4 = this.logger;
        InterfaceC2339e interfaceC2339e4 = c2345k4.f9275c;
        String str4 = c2345k4.f9273a;
        EnumC2341g enumC2341g4 = EnumC2341g.VERBOSE;
        if (interfaceC2339e4.isLoggable(enumC2341g4, str4)) {
            c2345k4.f9274b.log(enumC2341g4, str4, "[stopRecording] recorded: " + c32093f, null);
        }
        setState(new RecordingState.Overview(c32093f.f133095a, listNormalize, c32093f.f133096b, false, 0.0f, 0, 56, null));
        return c23454a0;
    }

    public final void toggleRecordingPlayback() {
        RecordingState recordingState = (RecordingState) ((C13045h2) this.recordingState).getValue();
        if (!(recordingState instanceof RecordingState.Overview)) {
            C2345k c2345k = this.logger;
            InterfaceC2339e interfaceC2339e = c2345k.f9275c;
            String str = c2345k.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
            if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                c2345k.f9274b.log(enumC2341g, str, AbstractC17176i.m48502d("[toggleRecordingPlayback] rejected (state is not Locked): ", recordingState), null);
                return;
            }
            return;
        }
        C2345k c2345k2 = this.logger;
        InterfaceC2339e interfaceC2339e2 = c2345k2.f9275c;
        String str2 = c2345k2.f9273a;
        EnumC2341g enumC2341g2 = EnumC2341g.INFO;
        if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
            c2345k2.f9274b.log(enumC2341g2, str2, "[toggleRecordingPlayback] state: " + recordingState + ", playerState: " + this.audioPlayer.getCurrentState(), null);
        }
        RecordingState.Overview overview = (RecordingState.Overview) recordingState;
        File upload = overview.getAttachment().getUpload();
        if (upload == null) {
            C2345k c2345k3 = this.logger;
            InterfaceC2339e interfaceC2339e3 = c2345k3.f9275c;
            String str3 = c2345k3.f9273a;
            EnumC2341g enumC2341g3 = EnumC2341g.VERBOSE;
            if (interfaceC2339e3.isLoggable(enumC2341g3, str3)) {
                c2345k3.f9274b.log(enumC2341g3, str3, "[toggleRecordingPlayback] rejected (audioFile is null)", null);
                return;
            }
            return;
        }
        if (!overview.getHasPlayingId() || overview.getPlayingId() != this.audioPlayer.getCurrentAudioHash()) {
            int audioHash = AudioHashKt.getAudioHash(overview.getAttachment());
            C2345k c2345k4 = this.logger;
            InterfaceC2339e interfaceC2339e4 = c2345k4.f9275c;
            String str4 = c2345k4.f9273a;
            EnumC2341g enumC2341g4 = EnumC2341g.DEBUG;
            if (interfaceC2339e4.isLoggable(enumC2341g4, str4)) {
                c2345k4.f9274b.log(enumC2341g4, str4, AbstractC2875y.m8295h(audioHash, "[toggleRecordingPlayback] start playback: "), null);
            }
            this.audioPlayer.registerOnProgressStateChange(audioHash, new C195116(this));
            this.audioPlayer.registerOnAudioStateChange(audioHash, new C195127(this));
            this.audioPlayer.play((String) this.fileToUri.invoke(upload), audioHash);
            setState(RecordingState.Overview.copy$default(overview, 0, null, null, true, 0.0f, audioHash, 23, null));
            return;
        }
        if (overview.isPlaying()) {
            C2345k c2345k5 = this.logger;
            InterfaceC2339e interfaceC2339e5 = c2345k5.f9275c;
            String str5 = c2345k5.f9273a;
            EnumC2341g enumC2341g5 = EnumC2341g.DEBUG;
            if (interfaceC2339e5.isLoggable(enumC2341g5, str5)) {
                c2345k5.f9274b.log(enumC2341g5, str5, "[toggleRecordingPlayback] pause playback", null);
            }
            this.audioPlayer.pause();
            setState(RecordingState.Overview.copy$default(overview, 0, null, null, false, 0.0f, 0, 55, null));
            return;
        }
        C2345k c2345k6 = this.logger;
        InterfaceC2339e interfaceC2339e6 = c2345k6.f9275c;
        String str6 = c2345k6.f9273a;
        EnumC2341g enumC2341g6 = EnumC2341g.DEBUG;
        if (interfaceC2339e6.isLoggable(enumC2341g6, str6)) {
            c2345k6.f9274b.log(enumC2341g6, str6, "[toggleRecordingPlayback] resume playback", null);
        }
        this.audioPlayer.resume(overview.getPlayingId());
        setState(RecordingState.Overview.copy$default(overview, 0, null, null, true, 0.0f, 0, 55, null));
    }

    private final List<Integer> downsampleMax(List<Integer> list, int i13) {
        int size = list.size() / i13;
        ArrayList arrayList = new ArrayList(i13);
        for (int i14 = 0; i14 < i13; i14++) {
            int iMax = 0;
            for (int i15 = 0; i15 < size; i15++) {
                iMax = Math.max(iMax, list.get((i14 * size) + i15).intValue());
            }
            arrayList.add(Integer.valueOf(iMax));
        }
        return arrayList;
    }

    private final float normalize(int amplitude) {
        if (amplitude <= 0) {
            return 0.0f;
        }
        return (AbstractC12889b.m36283m(20 * ((float) Math.log10(amplitude / MaxAmplitude)), -50.0f, 0.0f) + NoiseFloor) / NoiseFloor;
    }
}
