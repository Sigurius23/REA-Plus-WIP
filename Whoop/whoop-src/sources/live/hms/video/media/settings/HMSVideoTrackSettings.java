package live.hms.video.media.settings;

import ge3.AbstractC15751g;
import java.util.HashMap;
import l83.C23465k;
import live.hms.video.events.IAnalyticsPropertiesProvider;
import live.hms.video.media.codec.HMSVideoCodec;
import live.hms.video.sdk.models.DegradationPreference;
import live.hms.video.sdk.models.role.VideoSimulcastLayersParams;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002@ABW\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J)\u00108\u001a\u001e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;0<j\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;`9H\u0016¢\u0006\u0002\u0010=J\u0006\u0010>\u001a\u00020?R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0014\u0010\n\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\r\u001a\u0004\u0018\u00010\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R$\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020#@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010*\u001a\u00020)2\u0006\u0010\"\u001a\u00020)@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00100\u001a\u00020/2\u0006\u0010\"\u001a\u00020/@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u00105\u001a\u00020/2\u0006\u0010\"\u001a\u00020/@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00102\"\u0004\b7\u00104¨\u0006B"}, m65681d2 = {"Llive/hms/video/media/settings/HMSVideoTrackSettings;", "Llive/hms/video/events/IAnalyticsPropertiesProvider;", "cameraFacing", "Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;", "disableAutoResize", "", "initialState", "Llive/hms/video/media/settings/HMSTrackSettings$InitState;", "forceSoftwareDecoder", "forceSoftwareEncoder", "isSimulcastFeatureFlagEnabled", "videoSimulcastLayersParams", "Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;", "screenShareSimulcastLayersParams", "degradationPreference", "Llive/hms/video/sdk/models/DegradationPreference;", "<init>", "(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;ZLlive/hms/video/media/settings/HMSTrackSettings$InitState;ZZZLlive/hms/video/sdk/models/role/VideoSimulcastLayersParams;Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;Llive/hms/video/sdk/models/DegradationPreference;)V", "getCameraFacing", "()Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;", "setCameraFacing", "(Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;)V", "getDisableAutoResize", "()Z", "getInitialState", "()Llive/hms/video/media/settings/HMSTrackSettings$InitState;", "getForceSoftwareDecoder", "getForceSoftwareEncoder", "isSimulcastFeatureFlagEnabled$lib_release", "getVideoSimulcastLayersParams$lib_release", "()Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;", "getScreenShareSimulcastLayersParams$lib_release", "getDegradationPreference", "()Llive/hms/video/sdk/models/DegradationPreference;", "value", "Llive/hms/video/media/settings/HMSVideoResolution;", "resolution", "getResolution", "()Llive/hms/video/media/settings/HMSVideoResolution;", "setResolution$lib_release", "(Llive/hms/video/media/settings/HMSVideoResolution;)V", "Llive/hms/video/media/codec/HMSVideoCodec;", "codec", "getCodec", "()Llive/hms/video/media/codec/HMSVideoCodec;", "setCodec$lib_release", "(Llive/hms/video/media/codec/HMSVideoCodec;)V", "", "maxFrameRate", "getMaxFrameRate", "()I", "setMaxFrameRate$lib_release", "(I)V", "maxBitRate", "getMaxBitRate", "setMaxBitRate$lib_release", "toAnalyticsProperties", "Lkotlin/collections/HashMap;", "", "", "Ljava/util/HashMap;", "()Ljava/util/HashMap;", "builder", "Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;", "CameraFacing", "Builder", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSVideoTrackSettings implements IAnalyticsPropertiesProvider {
    private CameraFacing cameraFacing;
    private HMSVideoCodec codec;
    private final DegradationPreference degradationPreference;
    private final boolean disableAutoResize;
    private final boolean forceSoftwareDecoder;
    private final boolean forceSoftwareEncoder;
    private final HMSTrackSettings.InitState initialState;
    private final boolean isSimulcastFeatureFlagEnabled;
    private int maxBitRate;
    private int maxFrameRate;
    private HMSVideoResolution resolution;
    private final VideoSimulcastLayersParams screenShareSimulcastLayersParams;
    private final VideoSimulcastLayersParams videoSimulcastLayersParams;

    @Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00002\b\b\u0001\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u0019\u001a\u00020\u00002\b\b\u0001\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0012J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018J)\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0002\b\u001dJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, m65681d2 = {"Llive/hms/video/media/settings/HMSVideoTrackSettings$Builder;", "", "<init>", "()V", "resolution", "Llive/hms/video/media/settings/HMSVideoResolution;", "codec", "Llive/hms/video/media/codec/HMSVideoCodec;", "initialState", "Llive/hms/video/media/settings/HMSTrackSettings$InitState;", "maxFrameRate", "", "maxBitRate", "disableAutoResize", "", "forceSoftwareDecoder", "forceSoftwareEncoder", "cameraFacing", "Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;", "isSimulcastFeatureFlagEnabled", "videoSimulcastLayersParams", "Llive/hms/video/sdk/models/role/VideoSimulcastLayersParams;", "screenShareSimulcastLayersParams", "degradationPreference", "Llive/hms/video/sdk/models/DegradationPreference;", "maxBitrate", "facing", "setDegradationPreference", "simulcast", "simulcast$lib_release", "build", "Llive/hms/video/media/settings/HMSVideoTrackSettings;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Builder {
        private boolean disableAutoResize;
        private boolean forceSoftwareDecoder;
        private boolean forceSoftwareEncoder;
        private boolean isSimulcastFeatureFlagEnabled;
        private VideoSimulcastLayersParams screenShareSimulcastLayersParams;
        private VideoSimulcastLayersParams videoSimulcastLayersParams;
        private HMSVideoResolution resolution = new HMSVideoResolution(320, 180);
        private HMSVideoCodec codec = HMSVideoCodec.VP8;
        private HMSTrackSettings.InitState initialState = HMSTrackSettings.InitState.UNMUTED;
        private int maxFrameRate = 24;
        private int maxBitRate = 150000;
        private CameraFacing cameraFacing = CameraFacing.FRONT;
        private DegradationPreference degradationPreference = DegradationPreference.DEFAULT;

        public final HMSVideoTrackSettings build() {
            HMSVideoTrackSettings hMSVideoTrackSettings = new HMSVideoTrackSettings(this.cameraFacing, this.disableAutoResize, this.initialState, this.forceSoftwareDecoder, this.forceSoftwareEncoder, this.isSimulcastFeatureFlagEnabled, this.videoSimulcastLayersParams, this.screenShareSimulcastLayersParams, this.degradationPreference, null);
            hMSVideoTrackSettings.setCodec$lib_release(this.codec);
            hMSVideoTrackSettings.setMaxBitRate$lib_release(this.maxBitRate);
            hMSVideoTrackSettings.setMaxFrameRate$lib_release(this.maxFrameRate);
            hMSVideoTrackSettings.setResolution$lib_release(this.resolution);
            return hMSVideoTrackSettings;
        }

        public final Builder cameraFacing(CameraFacing facing) {
            AbstractC22676k.m65750j(facing, "facing");
            this.cameraFacing = facing;
            return this;
        }

        public final Builder codec(HMSVideoCodec codec) {
            AbstractC22676k.m65750j(codec, "codec");
            this.codec = codec;
            return this;
        }

        public final Builder disableAutoResize(boolean disableAutoResize) {
            this.disableAutoResize = disableAutoResize;
            return this;
        }

        public final Builder forceSoftwareDecoder(boolean forceSoftwareDecoder) {
            this.forceSoftwareDecoder = forceSoftwareDecoder;
            return this;
        }

        public final Builder initialState(HMSTrackSettings.InitState initialState) {
            AbstractC22676k.m65750j(initialState, "initialState");
            this.initialState = initialState;
            return this;
        }

        public final Builder maxBitrate(int maxBitRate) {
            this.maxBitRate = maxBitRate;
            return this;
        }

        public final Builder maxFrameRate(int maxFrameRate) {
            this.maxFrameRate = maxFrameRate;
            return this;
        }

        public final Builder resolution(HMSVideoResolution resolution) {
            AbstractC22676k.m65750j(resolution, "resolution");
            this.resolution = resolution;
            return this;
        }

        public final Builder setDegradationPreference(DegradationPreference degradationPreference) {
            AbstractC22676k.m65750j(degradationPreference, "degradationPreference");
            this.degradationPreference = degradationPreference;
            return this;
        }

        public final Builder simulcast$lib_release(boolean isSimulcastFeatureFlagEnabled, VideoSimulcastLayersParams videoSimulcastLayersParams, VideoSimulcastLayersParams screenShareSimulcastLayersParams) {
            this.isSimulcastFeatureFlagEnabled = isSimulcastFeatureFlagEnabled;
            this.videoSimulcastLayersParams = videoSimulcastLayersParams;
            this.screenShareSimulcastLayersParams = screenShareSimulcastLayersParams;
            return this;
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m65681d2 = {"Llive/hms/video/media/settings/HMSVideoTrackSettings$CameraFacing;", "", "<init>", "(Ljava/lang/String;I)V", "FRONT", "BACK", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public enum CameraFacing {
        FRONT,
        BACK;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    public /* synthetic */ HMSVideoTrackSettings(CameraFacing cameraFacing, boolean z4, HMSTrackSettings.InitState initState, boolean z13, boolean z14, boolean z15, VideoSimulcastLayersParams videoSimulcastLayersParams, VideoSimulcastLayersParams videoSimulcastLayersParams2, DegradationPreference degradationPreference, DefaultConstructorMarker defaultConstructorMarker) {
        this(cameraFacing, z4, initState, z13, z14, z15, videoSimulcastLayersParams, videoSimulcastLayersParams2, degradationPreference);
    }

    public final Builder builder() {
        return new Builder().resolution(this.resolution).codec(this.codec).maxFrameRate(this.maxFrameRate).maxBitrate(this.maxBitRate).cameraFacing(this.cameraFacing).disableAutoResize(this.disableAutoResize).forceSoftwareDecoder(this.forceSoftwareDecoder);
    }

    public final CameraFacing getCameraFacing() {
        return this.cameraFacing;
    }

    public final HMSVideoCodec getCodec() {
        return this.codec;
    }

    public final DegradationPreference getDegradationPreference() {
        return this.degradationPreference;
    }

    public final boolean getDisableAutoResize() {
        return this.disableAutoResize;
    }

    public final boolean getForceSoftwareDecoder() {
        return this.forceSoftwareDecoder;
    }

    public final boolean getForceSoftwareEncoder() {
        return this.forceSoftwareEncoder;
    }

    public final HMSTrackSettings.InitState getInitialState() {
        return this.initialState;
    }

    public final int getMaxBitRate() {
        return this.maxBitRate;
    }

    public final int getMaxFrameRate() {
        return this.maxFrameRate;
    }

    public final HMSVideoResolution getResolution() {
        return this.resolution;
    }

    /* JADX INFO: renamed from: getScreenShareSimulcastLayersParams$lib_release, reason: from getter */
    public final VideoSimulcastLayersParams getScreenShareSimulcastLayersParams() {
        return this.screenShareSimulcastLayersParams;
    }

    /* JADX INFO: renamed from: getVideoSimulcastLayersParams$lib_release, reason: from getter */
    public final VideoSimulcastLayersParams getVideoSimulcastLayersParams() {
        return this.videoSimulcastLayersParams;
    }

    /* JADX INFO: renamed from: isSimulcastFeatureFlagEnabled$lib_release, reason: from getter */
    public final boolean getIsSimulcastFeatureFlagEnabled() {
        return this.isSimulcastFeatureFlagEnabled;
    }

    public final void setCameraFacing(CameraFacing cameraFacing) {
        AbstractC22676k.m65750j(cameraFacing, "<set-?>");
        this.cameraFacing = cameraFacing;
    }

    public final void setCodec$lib_release(HMSVideoCodec hMSVideoCodec) {
        AbstractC22676k.m65750j(hMSVideoCodec, "<set-?>");
        this.codec = hMSVideoCodec;
    }

    public final void setMaxBitRate$lib_release(int i13) {
        this.maxBitRate = i13;
    }

    public final void setMaxFrameRate$lib_release(int i13) {
        this.maxFrameRate = i13;
    }

    public final void setResolution$lib_release(HMSVideoResolution hMSVideoResolution) {
        AbstractC22676k.m65750j(hMSVideoResolution, "<set-?>");
        this.resolution = hMSVideoResolution;
    }

    @Override // live.hms.video.events.IAnalyticsPropertiesProvider
    public HashMap<String, Object> toAnalyticsProperties() {
        return AbstractC25247g0.m73987V(new C23465k("width", Integer.valueOf(this.resolution.getWidth())), new C23465k("height", Integer.valueOf(this.resolution.getHeight())), new C23465k("video_bitrate", Integer.valueOf(this.maxBitRate)), new C23465k("framerate", Integer.valueOf(this.maxFrameRate)), new C23465k("video_codec", this.codec), new C23465k("disable_auto_resize", Boolean.valueOf(this.disableAutoResize)), new C23465k("force_software_decoder", Boolean.valueOf(this.forceSoftwareDecoder)), new C23465k("degradation_preference", this.degradationPreference));
    }

    private HMSVideoTrackSettings(CameraFacing cameraFacing, boolean z4, HMSTrackSettings.InitState initState, boolean z13, boolean z14, boolean z15, VideoSimulcastLayersParams videoSimulcastLayersParams, VideoSimulcastLayersParams videoSimulcastLayersParams2, DegradationPreference degradationPreference) {
        this.cameraFacing = cameraFacing;
        this.disableAutoResize = z4;
        this.initialState = initState;
        this.forceSoftwareDecoder = z13;
        this.forceSoftwareEncoder = z14;
        this.isSimulcastFeatureFlagEnabled = z15;
        this.videoSimulcastLayersParams = videoSimulcastLayersParams;
        this.screenShareSimulcastLayersParams = videoSimulcastLayersParams2;
        this.degradationPreference = degradationPreference;
        this.resolution = new HMSVideoResolution(320, 180);
        this.codec = HMSVideoCodec.VP8;
        this.maxFrameRate = 24;
        this.maxBitRate = 150000;
    }

    public /* synthetic */ HMSVideoTrackSettings(CameraFacing cameraFacing, boolean z4, HMSTrackSettings.InitState initState, boolean z13, boolean z14, boolean z15, VideoSimulcastLayersParams videoSimulcastLayersParams, VideoSimulcastLayersParams videoSimulcastLayersParams2, DegradationPreference degradationPreference, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(cameraFacing, z4, (i13 & 4) != 0 ? HMSTrackSettings.InitState.UNMUTED : initState, z13, z14, z15, videoSimulcastLayersParams, videoSimulcastLayersParams2, degradationPreference);
    }
}
