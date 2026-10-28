package live.hms.video.media.settings;

import ge3.AbstractC15751g;
import java.util.HashMap;
import l83.C23465k;
import live.hms.video.events.IAnalyticsPropertiesProvider;
import live.hms.video.media.codec.HMSAudioCodec;
import m83.AbstractC25247g0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import t83.InterfaceC33616a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u00029:B_\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J)\u00101\u001a\u001e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020405j\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u000204`2H\u0016¢\u0006\u0002\u00106J\u0006\u00107\u001a\u000208R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R$\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020%@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010,\u001a\u00020+2\u0006\u0010$\u001a\u00020+@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u0006;"}, m65681d2 = {"Llive/hms/video/media/settings/HMSAudioTrackSettings;", "Llive/hms/video/events/IAnalyticsPropertiesProvider;", "volume", "", "disableInternalAudioManager", "", "useHardwareAcousticEchoCanceler", "initialState", "Llive/hms/video/media/settings/HMSTrackSettings$InitState;", "enableEchoCancellation", "enableNoiseSupression", "enableAutomaticGainControl", "phoneCallState", "Llive/hms/video/media/settings/PhoneCallState;", "enableNoiseCancellation", "audioMode", "Llive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;", "<init>", "(DZLjava/lang/Boolean;Llive/hms/video/media/settings/HMSTrackSettings$InitState;ZZZLlive/hms/video/media/settings/PhoneCallState;ZLlive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;)V", "getVolume", "()D", "getDisableInternalAudioManager", "()Z", "getUseHardwareAcousticEchoCanceler", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getInitialState", "()Llive/hms/video/media/settings/HMSTrackSettings$InitState;", "getEnableEchoCancellation", "getEnableNoiseSupression", "getEnableAutomaticGainControl", "getPhoneCallState", "()Llive/hms/video/media/settings/PhoneCallState;", "getEnableNoiseCancellation", "getAudioMode", "()Llive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;", "value", "", "maxBitrate", "getMaxBitrate", "()I", "setMaxBitrate$lib_release", "(I)V", "Llive/hms/video/media/codec/HMSAudioCodec;", "codec", "getCodec", "()Llive/hms/video/media/codec/HMSAudioCodec;", "setCodec$lib_release", "(Llive/hms/video/media/codec/HMSAudioCodec;)V", "toAnalyticsProperties", "Lkotlin/collections/HashMap;", "", "", "Ljava/util/HashMap;", "()Ljava/util/HashMap;", "builder", "Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;", "HMSAudioMode", "Builder", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HMSAudioTrackSettings implements IAnalyticsPropertiesProvider {
    private final HMSAudioMode audioMode;
    private HMSAudioCodec codec;
    private final boolean disableInternalAudioManager;
    private final boolean enableAutomaticGainControl;
    private final boolean enableEchoCancellation;
    private final boolean enableNoiseCancellation;
    private final boolean enableNoiseSupression;
    private final HMSTrackSettings.InitState initialState;
    private int maxBitrate;
    private final PhoneCallState phoneCallState;
    private final Boolean useHardwareAcousticEchoCanceler;
    private final double volume;

    @Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00002\b\b\u0001\u0010\u0004\u001a\u00020\u0005J\u0010\u0010\u0018\u001a\u00020\u00002\b\b\u0001\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000bJ\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000bJ\u0015\u0010\u001b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u001e\u001a\u00020\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, m65681d2 = {"Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;", "", "<init>", "()V", "volume", "", "maxBitRate", "", "codec", "Llive/hms/video/media/codec/HMSAudioCodec;", "useHardwareAcousticEchoCanceler", "", "Ljava/lang/Boolean;", "initialState", "Llive/hms/video/media/settings/HMSTrackSettings$InitState;", "enableEchoCancellation", "enableNoiseSupression", "enableNoiseCancellation", "enableAutomaticGainControl", "disableInternalAudioManager", "phoneCallState", "Llive/hms/video/media/settings/PhoneCallState;", "audioMode", "Llive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;", "maxBitrate", "setPhoneCallMuteState", "setDisableInternalAudioManager", "setUseHardwareAcousticEchoCanceler", "(Ljava/lang/Boolean;)Llive/hms/video/media/settings/HMSAudioTrackSettings$Builder;", "setAudioMode", "build", "Llive/hms/video/media/settings/HMSAudioTrackSettings;", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public static final class Builder {
        private boolean disableInternalAudioManager;
        private boolean enableNoiseCancellation;
        private Boolean useHardwareAcousticEchoCanceler;
        private double volume = 1.0d;
        private int maxBitRate = 32000;
        private HMSAudioCodec codec = HMSAudioCodec.OPUS;
        private HMSTrackSettings.InitState initialState = HMSTrackSettings.InitState.UNMUTED;
        private boolean enableEchoCancellation = true;
        private boolean enableNoiseSupression = true;
        private boolean enableAutomaticGainControl = true;
        private PhoneCallState phoneCallState = PhoneCallState.ENABLE_MUTE_ON_PHONE_CALL_RING;
        private HMSAudioMode audioMode = HMSAudioMode.HMSAUDIOMODEVOICE;

        public final HMSAudioTrackSettings build() {
            double d3 = this.volume;
            boolean z4 = this.disableInternalAudioManager;
            Boolean bool = this.useHardwareAcousticEchoCanceler;
            HMSTrackSettings.InitState initState = this.initialState;
            boolean z13 = this.enableEchoCancellation;
            HMSAudioMode hMSAudioMode = this.audioMode;
            HMSAudioMode hMSAudioMode2 = HMSAudioMode.HMSAUDIOMODEMUSIC;
            boolean z14 = false;
            boolean z15 = (hMSAudioMode == hMSAudioMode2 || this.enableNoiseCancellation) ? false : this.enableNoiseSupression;
            if (hMSAudioMode != hMSAudioMode2 && !this.enableNoiseCancellation) {
                z14 = this.enableAutomaticGainControl;
            }
            HMSAudioTrackSettings hMSAudioTrackSettings = new HMSAudioTrackSettings(d3, z4, bool, initState, z13, z15, z14, this.phoneCallState, this.enableNoiseCancellation, hMSAudioMode, null);
            hMSAudioTrackSettings.setCodec$lib_release(this.codec);
            hMSAudioTrackSettings.setMaxBitrate$lib_release(this.maxBitRate);
            return hMSAudioTrackSettings;
        }

        public final Builder codec(HMSAudioCodec codec) {
            AbstractC22676k.m65750j(codec, "codec");
            this.codec = codec;
            return this;
        }

        public final Builder enableAutomaticGainControl(boolean enableAutomaticGainControl) {
            this.enableAutomaticGainControl = enableAutomaticGainControl;
            return this;
        }

        public final Builder enableEchoCancellation(boolean enableEchoCancellation) {
            this.enableEchoCancellation = enableEchoCancellation;
            return this;
        }

        public final Builder enableNoiseCancellation(boolean enableNoiseCancellation) {
            this.enableNoiseCancellation = enableNoiseCancellation;
            return this;
        }

        public final Builder enableNoiseSupression(boolean enableNoiseSupression) {
            this.enableNoiseSupression = enableNoiseSupression;
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

        public final Builder setAudioMode(HMSAudioMode audioMode) {
            AbstractC22676k.m65750j(audioMode, "audioMode");
            this.audioMode = audioMode;
            return this;
        }

        public final Builder setDisableInternalAudioManager(boolean disableInternalAudioManager) {
            this.disableInternalAudioManager = disableInternalAudioManager;
            return this;
        }

        public final Builder setPhoneCallMuteState(PhoneCallState phoneCallState) {
            AbstractC22676k.m65750j(phoneCallState, "phoneCallState");
            this.phoneCallState = phoneCallState;
            return this;
        }

        public final Builder setUseHardwareAcousticEchoCanceler(Boolean useHardwareAcousticEchoCanceler) {
            this.useHardwareAcousticEchoCanceler = useHardwareAcousticEchoCanceler;
            return this;
        }

        public final Builder volume(double volume) {
            this.volume = volume;
            return this;
        }
    }

    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m65681d2 = {"Llive/hms/video/media/settings/HMSAudioTrackSettings$HMSAudioMode;", "", "<init>", "(Ljava/lang/String;I)V", "HMSAUDIOMODEVOICE", "HMSAUDIOMODEMUSIC", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
    public enum HMSAudioMode {
        HMSAUDIOMODEVOICE,
        HMSAUDIOMODEMUSIC;

        private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());

        public static InterfaceC33616a getEntries() {
            return $ENTRIES;
        }
    }

    public /* synthetic */ HMSAudioTrackSettings(double d3, boolean z4, Boolean bool, HMSTrackSettings.InitState initState, boolean z13, boolean z14, boolean z15, PhoneCallState phoneCallState, boolean z16, HMSAudioMode hMSAudioMode, DefaultConstructorMarker defaultConstructorMarker) {
        this(d3, z4, bool, initState, z13, z14, z15, phoneCallState, z16, hMSAudioMode);
    }

    public final Builder builder() {
        return new Builder().volume(this.volume).maxBitrate(this.maxBitrate).codec(this.codec).setUseHardwareAcousticEchoCanceler(this.useHardwareAcousticEchoCanceler).setPhoneCallMuteState(this.phoneCallState);
    }

    public final HMSAudioMode getAudioMode() {
        return this.audioMode;
    }

    public final HMSAudioCodec getCodec() {
        return this.codec;
    }

    public final boolean getDisableInternalAudioManager() {
        return this.disableInternalAudioManager;
    }

    public final boolean getEnableAutomaticGainControl() {
        return this.enableAutomaticGainControl;
    }

    public final boolean getEnableEchoCancellation() {
        return this.enableEchoCancellation;
    }

    public final boolean getEnableNoiseCancellation() {
        return this.enableNoiseCancellation;
    }

    public final boolean getEnableNoiseSupression() {
        return this.enableNoiseSupression;
    }

    public final HMSTrackSettings.InitState getInitialState() {
        return this.initialState;
    }

    public final int getMaxBitrate() {
        return this.maxBitrate;
    }

    public final PhoneCallState getPhoneCallState() {
        return this.phoneCallState;
    }

    public final Boolean getUseHardwareAcousticEchoCanceler() {
        return this.useHardwareAcousticEchoCanceler;
    }

    public final double getVolume() {
        return this.volume;
    }

    public final void setCodec$lib_release(HMSAudioCodec hMSAudioCodec) {
        AbstractC22676k.m65750j(hMSAudioCodec, "<set-?>");
        this.codec = hMSAudioCodec;
    }

    public final void setMaxBitrate$lib_release(int i13) {
        this.maxBitrate = i13;
    }

    @Override // live.hms.video.events.IAnalyticsPropertiesProvider
    public HashMap<String, Object> toAnalyticsProperties() {
        return AbstractC25247g0.m73987V(new C23465k("audio_bitrate", Integer.valueOf(this.maxBitrate)), new C23465k("audio_codec", this.codec));
    }

    private HMSAudioTrackSettings(double d3, boolean z4, Boolean bool, HMSTrackSettings.InitState initState, boolean z13, boolean z14, boolean z15, PhoneCallState phoneCallState, boolean z16, HMSAudioMode hMSAudioMode) {
        this.volume = d3;
        this.disableInternalAudioManager = z4;
        this.useHardwareAcousticEchoCanceler = bool;
        this.initialState = initState;
        this.enableEchoCancellation = z13;
        this.enableNoiseSupression = z14;
        this.enableAutomaticGainControl = z15;
        this.phoneCallState = phoneCallState;
        this.enableNoiseCancellation = z16;
        this.audioMode = hMSAudioMode;
        this.maxBitrate = 32000;
        this.codec = HMSAudioCodec.OPUS;
    }

    public /* synthetic */ HMSAudioTrackSettings(double d3, boolean z4, Boolean bool, HMSTrackSettings.InitState initState, boolean z13, boolean z14, boolean z15, PhoneCallState phoneCallState, boolean z16, HMSAudioMode hMSAudioMode, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(d3, z4, bool, (i13 & 8) != 0 ? HMSTrackSettings.InitState.UNMUTED : initState, z13, z14, z15, phoneCallState, z16, (i13 & 512) != 0 ? HMSAudioMode.HMSAUDIOMODEVOICE : hMSAudioMode);
    }
}
