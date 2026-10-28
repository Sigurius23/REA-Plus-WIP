package live.hms.video.media.tracks;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import hms.webrtc.VideoSink;
import hms.webrtc.VideoTrack;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23462h;
import lh1.C24069a;
import live.hms.video.media.settings.HMSLayer;
import live.hms.video.media.settings.HMSSimulcastLayer;
import live.hms.video.media.settings.HMSSimulcastLayerDefinition;
import live.hms.video.media.streams.HMSRemoteStream;
import live.hms.video.sdk.HMSAddSinkResultListener;
import live.hms.video.utils.HMSCoroutineScope;
import live.hms.video.utils.HMSLogger;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B+\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010 \u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u00142\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b \u0010!J\u0013\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"¢\u0006\u0004\b$\u0010%J\u001d\u0010)\u001a\u00020\u00112\f\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0000¢\u0006\u0004\b'\u0010(J\r\u0010*\u001a\u00020\u0014¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0007H\u0016¢\u0006\u0004\b,\u0010-J\u0013\u0010.\u001a\u00020\u001a*\u00020\u0014H\u0002¢\u0006\u0004\b.\u0010/J\u0013\u00100\u001a\u00020\u0014*\u00020\u001aH\u0002¢\u0006\u0004\b0\u00101R\u001a\u0010\u0004\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u00104R\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010-R\u0016\u0010=\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\"\u0010?\u001a\u00020\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010>\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010DR!\u0010J\u001a\b\u0012\u0004\u0012\u00020\r0E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR*\u0010M\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bM\u0010O\"\u0004\bP\u0010QR$\u0010R\u001a\u00020K2\u0006\u0010L\u001a\u00020K8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bR\u0010O\"\u0004\bS\u0010Q¨\u0006T"}, m65681d2 = {"Llive/hms/video/media/tracks/HMSRemoteVideoTrack;", "Llive/hms/video/media/tracks/HMSVideoTrack;", "Llive/hms/video/media/tracks/HMSRemoteTrack;", "Llive/hms/video/media/streams/HMSRemoteStream;", "stream", "Lhms/webrtc/VideoTrack;", "nativeTrack", "", "source", "", "ssrc", "<init>", "(Llive/hms/video/media/streams/HMSRemoteStream;Lhms/webrtc/VideoTrack;Ljava/lang/String;J)V", "Lhms/webrtc/VideoSink;", "sink", "Llive/hms/video/sdk/HMSAddSinkResultListener;", "resultListener", "Ll83/a0;", "addSink", "(Lhms/webrtc/VideoSink;Llive/hms/video/sdk/HMSAddSinkResultListener;)V", "Llive/hms/video/media/settings/HMSLayer;", "selectedLayer", "addSinkInternal", "(Lhms/webrtc/VideoSink;Llive/hms/video/media/settings/HMSLayer;)V", "removeSink", "(Lhms/webrtc/VideoSink;)V", "Llive/hms/video/media/settings/HMSSimulcastLayer;", "layer", "setExpectedLayer$lib_release", "(Llive/hms/video/media/settings/HMSSimulcastLayer;Llive/hms/video/sdk/HMSAddSinkResultListener;)V", "setExpectedLayer", "HMSLayer", "setLayer", "(Llive/hms/video/media/settings/HMSLayer;Llive/hms/video/sdk/HMSAddSinkResultListener;)V", "", "Llive/hms/video/media/settings/HMSSimulcastLayerDefinition;", "getLayerDefinition", "()Ljava/util/List;", "layerDefinition", "setLayerDefinition$lib_release", "(Ljava/util/List;)V", "setLayerDefinition", "getLayer", "()Llive/hms/video/media/settings/HMSLayer;", "toString", "()Ljava/lang/String;", "toSimulcastLayer", "(Llive/hms/video/media/settings/HMSLayer;)Llive/hms/video/media/settings/HMSSimulcastLayer;", "toHMSLayer", "(Llive/hms/video/media/settings/HMSSimulcastLayer;)Llive/hms/video/media/settings/HMSLayer;", "Llive/hms/video/media/streams/HMSRemoteStream;", "getStream$lib_release", "()Llive/hms/video/media/streams/HMSRemoteStream;", "J", "getSsrc", "()J", "setSsrc", "(J)V", "TAG", "Ljava/lang/String;", "getTAG", "expectedLayer", "Llive/hms/video/media/settings/HMSSimulcastLayer;", "currentLayer", "getCurrentLayer$lib_release", "()Llive/hms/video/media/settings/HMSSimulcastLayer;", "setCurrentLayer$lib_release", "(Llive/hms/video/media/settings/HMSSimulcastLayer;)V", "Ljava/util/List;", "Ljava/util/HashSet;", "sinksMap$delegate", "Ll83/h;", "getSinksMap", "()Ljava/util/HashSet;", "sinksMap", "", "value", "isDegraded", "Z", "()Z", "setDegraded$lib_release", "(Z)V", "isPlaybackAllowed", "setPlaybackAllowed", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSRemoteVideoTrack extends HMSVideoTrack implements HMSRemoteTrack {
    private final String TAG;
    private HMSSimulcastLayer currentLayer;
    private HMSSimulcastLayer expectedLayer;
    private boolean isDegraded;
    private List<HMSSimulcastLayerDefinition> layerDefinition;

    /* JADX INFO: renamed from: sinksMap$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h sinksMap;
    private long ssrc;
    private final HMSRemoteStream stream;

    @Metadata(m65682k = 3, m65683mv = {2, 0, 0}, m65685xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HMSLayer.values().length];
            try {
                iArr[HMSLayer.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HMSLayer.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HMSLayer.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HMSSimulcastLayer.values().length];
            try {
                iArr2[HMSSimulcastLayer.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[HMSSimulcastLayer.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[HMSSimulcastLayer.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[HMSSimulcastLayer.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.media.tracks.HMSRemoteVideoTrack$addSink$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.media.tracks.HMSRemoteVideoTrack$addSink$1", m100430f = "HMSRemoteVideoTrack.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241831 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ HMSAddSinkResultListener $resultListener;
        final /* synthetic */ VideoSink $sink;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241831(VideoSink videoSink, HMSAddSinkResultListener hMSAddSinkResultListener, InterfaceC30057d<? super C241831> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$sink = videoSink;
            this.$resultListener = hMSAddSinkResultListener;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HMSRemoteVideoTrack.this.new C241831(this.$sink, this.$resultListener, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241831) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            HMSRemoteVideoTrack.this.getSinksMap().add(this.$sink);
            if (HMSRemoteVideoTrack.this.getIsDegraded()) {
                HMSLogger.m71137e(HMSRemoteVideoTrack.this.getTAG(), "Not calling prefer-layer for video since " + HMSRemoteVideoTrack.this.getTrackId() + " is degraded");
            } else {
                HMSRemoteVideoTrack hMSRemoteVideoTrack = HMSRemoteVideoTrack.this;
                hMSRemoteVideoTrack.setExpectedLayer$lib_release(hMSRemoteVideoTrack.expectedLayer, this.$resultListener);
            }
            HMSRemoteVideoTrack.super.addSink(this.$sink, this.$resultListener);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.media.tracks.HMSRemoteVideoTrack$isPlaybackAllowed$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.media.tracks.HMSRemoteVideoTrack$isPlaybackAllowed$1", m100430f = "HMSRemoteVideoTrack.kt", m100431l = {56}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241841 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ boolean $value;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241841(boolean z4, InterfaceC30057d<? super C241841> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$value = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HMSRemoteVideoTrack.this.new C241841(this.$value, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241841) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                HMSRemoteVideoTrack hMSRemoteVideoTrack = HMSRemoteVideoTrack.this;
                boolean z4 = this.$value;
                this.label = 1;
                if (HMSRemoteVideoTrack.super.setEnabled$lib_release(z4, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: live.hms.video.media.tracks.HMSRemoteVideoTrack$removeSink$1 */
    @InterfaceC32271e(m100429c = "live.hms.video.media.tracks.HMSRemoteVideoTrack$removeSink$1", m100430f = "HMSRemoteVideoTrack.kt", m100431l = {}, m100432m = "invokeSuspend")
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
    public static final class C241851 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ VideoSink $sink;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C241851(VideoSink videoSink, InterfaceC30057d<? super C241851> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$sink = videoSink;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return HMSRemoteVideoTrack.this.new C241851(this.$sink, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C241851) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            if (HMSRemoteVideoTrack.this.getIsDegraded()) {
                HMSRemoteVideoTrack.this.setDegraded$lib_release(false);
            }
            HMSRemoteVideoTrack.this.getSinksMap().remove(this.$sink);
            if (HMSRemoteVideoTrack.this.getSinksMap().isEmpty()) {
                HMSRemoteVideoTrack.setExpectedLayer$lib_release$default(HMSRemoteVideoTrack.this, HMSSimulcastLayer.NONE, null, 2, null);
            }
            HMSRemoteVideoTrack.super.removeSink(this.$sink);
            return C23454a0.f92919a;
        }
    }

    public /* synthetic */ HMSRemoteVideoTrack(HMSRemoteStream hMSRemoteStream, VideoTrack videoTrack, String str, long j7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(hMSRemoteStream, videoTrack, (i13 & 4) != 0 ? "regular" : str, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HashSet<VideoSink> getSinksMap() {
        return (HashSet) this.sinksMap.getValue();
    }

    public static /* synthetic */ void setExpectedLayer$lib_release$default(HMSRemoteVideoTrack hMSRemoteVideoTrack, HMSSimulcastLayer hMSSimulcastLayer, HMSAddSinkResultListener hMSAddSinkResultListener, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            hMSAddSinkResultListener = null;
        }
        hMSRemoteVideoTrack.setExpectedLayer$lib_release(hMSSimulcastLayer, hMSAddSinkResultListener);
    }

    public static /* synthetic */ void setLayer$default(HMSRemoteVideoTrack hMSRemoteVideoTrack, HMSLayer hMSLayer, HMSAddSinkResultListener hMSAddSinkResultListener, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            hMSAddSinkResultListener = null;
        }
        hMSRemoteVideoTrack.setLayer(hMSLayer, hMSAddSinkResultListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashSet sinksMap_delegate$lambda$0() {
        return new HashSet();
    }

    private final HMSLayer toHMSLayer(HMSSimulcastLayer hMSSimulcastLayer) {
        int i13 = WhenMappings.$EnumSwitchMapping$1[hMSSimulcastLayer.ordinal()];
        if (i13 == 1) {
            return HMSLayer.LOW;
        }
        if (i13 == 2) {
            return HMSLayer.MEDIUM;
        }
        if (i13 != 3 && i13 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return HMSLayer.HIGH;
    }

    private final HMSSimulcastLayer toSimulcastLayer(HMSLayer hMSLayer) {
        int i13 = WhenMappings.$EnumSwitchMapping$0[hMSLayer.ordinal()];
        if (i13 == 1) {
            return HMSSimulcastLayer.LOW;
        }
        if (i13 == 2) {
            return HMSSimulcastLayer.MEDIUM;
        }
        if (i13 == 3) {
            return HMSSimulcastLayer.HIGH;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // live.hms.video.media.tracks.HMSVideoTrack
    public void addSink(VideoSink sink, HMSAddSinkResultListener resultListener) {
        AbstractC22676k.m65750j(sink, "sink");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241831(sink, resultListener, null), 3);
    }

    public final void addSinkInternal(VideoSink sink, HMSLayer selectedLayer) {
        AbstractC22676k.m65750j(sink, "sink");
        AbstractC22676k.m65750j(selectedLayer, "selectedLayer");
        this.expectedLayer = toSimulcastLayer(selectedLayer);
        addSink(sink, null);
    }

    /* JADX INFO: renamed from: getCurrentLayer$lib_release, reason: from getter */
    public final HMSSimulcastLayer getCurrentLayer() {
        return this.currentLayer;
    }

    public final HMSLayer getLayer() {
        return toHMSLayer(this.expectedLayer);
    }

    public final List<HMSSimulcastLayerDefinition> getLayerDefinition() {
        return this.layerDefinition;
    }

    @Override // live.hms.video.media.tracks.HMSRemoteTrack
    public long getSsrc() {
        return this.ssrc;
    }

    public final String getTAG() {
        return this.TAG;
    }

    @Override // live.hms.video.media.tracks.HMSVideoTrack
    /* JADX INFO: renamed from: isDegraded, reason: from getter */
    public boolean getIsDegraded() {
        return this.isDegraded;
    }

    @Override // live.hms.video.media.tracks.HMSRemoteTrack
    public boolean isPlaybackAllowed() {
        return getIsEnabled();
    }

    @Override // live.hms.video.media.tracks.HMSVideoTrack
    public void removeSink(VideoSink sink) {
        AbstractC22676k.m65750j(sink, "sink");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241851(sink, null), 3);
    }

    public final void setCurrentLayer$lib_release(HMSSimulcastLayer hMSSimulcastLayer) {
        AbstractC22676k.m65750j(hMSSimulcastLayer, "<set-?>");
        this.currentLayer = hMSSimulcastLayer;
    }

    @Override // live.hms.video.media.tracks.HMSVideoTrack
    public void setDegraded$lib_release(boolean z4) {
        if (z4 != this.isDegraded) {
            this.isDegraded = z4;
        }
    }

    public final void setExpectedLayer$lib_release(HMSSimulcastLayer layer, HMSAddSinkResultListener resultListener) {
        AbstractC22676k.m65750j(layer, "layer");
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new HMSRemoteVideoTrack$setExpectedLayer$1(this, layer, resultListener, null), 3);
        if (layer != HMSSimulcastLayer.NONE) {
            this.expectedLayer = layer;
        }
    }

    public final void setLayer(HMSLayer HMSLayer, HMSAddSinkResultListener resultListener) {
        AbstractC22676k.m65750j(HMSLayer, "HMSLayer");
        setExpectedLayer$lib_release(toSimulcastLayer(HMSLayer), resultListener);
    }

    public final void setLayerDefinition$lib_release(List<HMSSimulcastLayerDefinition> layerDefinition) {
        AbstractC22676k.m65750j(layerDefinition, "layerDefinition");
        this.layerDefinition = layerDefinition;
    }

    @Override // live.hms.video.media.tracks.HMSRemoteTrack
    public void setPlaybackAllowed(boolean z4) {
        AbstractC3006f0.m8732z(HMSCoroutineScope.INSTANCE, null, null, new C241841(z4, null), 3);
    }

    @Override // live.hms.video.media.tracks.HMSRemoteTrack
    public void setSsrc(long j7) {
        this.ssrc = j7;
    }

    @Override // live.hms.video.media.tracks.HMSVideoTrack, live.hms.video.media.tracks.HMSTrack
    public String toString() {
        return "HMSRemoteVideoTrack{trackId=" + getTrackId() + ", isEnabled=" + getIsEnabled() + '}';
    }

    @Override // live.hms.video.media.tracks.HMSTrack
    /* JADX INFO: renamed from: getStream$lib_release, reason: from getter */
    public HMSRemoteStream getStream() {
        return this.stream;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HMSRemoteVideoTrack(HMSRemoteStream stream2, VideoTrack nativeTrack, String source, long j7) {
        super(stream2, nativeTrack, source);
        AbstractC22676k.m65750j(stream2, "stream");
        AbstractC22676k.m65750j(nativeTrack, "nativeTrack");
        AbstractC22676k.m65750j(source, "source");
        this.stream = stream2;
        this.ssrc = j7;
        this.TAG = "HMSRemoteVideoTrack";
        this.expectedLayer = HMSSimulcastLayer.HIGH;
        this.currentLayer = HMSSimulcastLayer.NONE;
        this.layerDefinition = new ArrayList();
        this.sinksMap = AbstractC30060g.m92088H(new C24069a(6));
    }
}
