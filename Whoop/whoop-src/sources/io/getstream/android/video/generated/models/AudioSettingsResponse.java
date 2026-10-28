package io.getstream.android.video.generated.models;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p441qx.AbstractC30704c0;
import p441qx.InterfaceC30729p;
import p441qx.InterfaceC30731q;
import p441qx.InterfaceC30738t0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001(BW\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003J[\u0010!\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006)"}, m65681d2 = {"Lio/getstream/android/video/generated/models/AudioSettingsResponse;", "", "accessRequestEnabled", "", "defaultDevice", "Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;", "hifiAudioEnabled", "micDefaultOn", "opusDtxEnabled", "redundantCodingEnabled", "speakerDefaultOn", "noiseCancellation", "Lio/getstream/android/video/generated/models/NoiseCancellationSettings;", "(ZLio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;ZZZZZLio/getstream/android/video/generated/models/NoiseCancellationSettings;)V", "getAccessRequestEnabled", "()Z", "getDefaultDevice", "()Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;", "getHifiAudioEnabled", "getMicDefaultOn", "getNoiseCancellation", "()Lio/getstream/android/video/generated/models/NoiseCancellationSettings;", "getOpusDtxEnabled", "getRedundantCodingEnabled", "getSpeakerDefaultOn", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "", "DefaultDevice", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class AudioSettingsResponse {
    private final boolean accessRequestEnabled;
    private final DefaultDevice defaultDevice;
    private final boolean hifiAudioEnabled;
    private final boolean micDefaultOn;
    private final NoiseCancellationSettings noiseCancellation;
    private final boolean opusDtxEnabled;
    private final boolean redundantCodingEnabled;
    private final boolean speakerDefaultOn;

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\u0005\b\t\n\u000b\fB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "Companion", "DefaultDeviceAdapter", "Earpiece", "Speaker", "Unknown", "Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice$Earpiece;", "Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice$Speaker;", "Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice$Unknown;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static abstract class DefaultDevice {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String value;

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice$Companion;", "", "()V", "fromString", "Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;", "s", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final DefaultDevice fromString(String s13) {
                AbstractC22676k.m65750j(s13, "s");
                if (s13.equals("earpiece")) {
                    return Earpiece.INSTANCE;
                }
                return s13.equals("speaker") ? Speaker.INSTANCE : new Unknown(s13);
            }

            private Companion() {
            }
        }

        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice$DefaultDeviceAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;", "Lqx/c0;", "writer", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;)V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class DefaultDeviceAdapter extends JsonAdapter<DefaultDevice> {
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public DefaultDevice fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                String strNextString = reader.nextString();
                if (strNextString == null) {
                    return null;
                }
                return DefaultDevice.INSTANCE.fromString(strNextString);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, DefaultDevice value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.mo94362F0(value != null ? value.getValue() : null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice$Earpiece;", "Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Earpiece extends DefaultDevice {
            public static final Earpiece INSTANCE = new Earpiece();

            private Earpiece() {
                super("earpiece", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice$Speaker;", "Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Speaker extends DefaultDevice {
            public static final Speaker INSTANCE = new Speaker();

            private Speaker() {
                super("speaker", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice$Unknown;", "Lio/getstream/android/video/generated/models/AudioSettingsResponse$DefaultDevice;", "unknownValue", "", "(Ljava/lang/String;)V", "getUnknownValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final /* data */ class Unknown extends DefaultDevice {
            private final String unknownValue;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Unknown(String unknownValue) {
                super(unknownValue, null);
                AbstractC22676k.m65750j(unknownValue, "unknownValue");
                this.unknownValue = unknownValue;
            }

            public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, int i13, Object obj) {
                if ((i13 & 1) != 0) {
                    str = unknown.unknownValue;
                }
                return unknown.copy(str);
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getUnknownValue() {
                return this.unknownValue;
            }

            public final Unknown copy(String unknownValue) {
                AbstractC22676k.m65750j(unknownValue, "unknownValue");
                return new Unknown(unknownValue);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Unknown) && AbstractC22676k.m65745e(this.unknownValue, ((Unknown) other).unknownValue);
            }

            public final String getUnknownValue() {
                return this.unknownValue;
            }

            public int hashCode() {
                return this.unknownValue.hashCode();
            }

            @Override // io.getstream.android.video.generated.models.AudioSettingsResponse.DefaultDevice
            public String toString() {
                return AbstractC11895b.m31996o("Unknown(unknownValue=", this.unknownValue, ")");
            }
        }

        public /* synthetic */ DefaultDevice(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public final String getValue() {
            return this.value;
        }

        public String toString() {
            return this.value;
        }

        private DefaultDevice(String str) {
            this.value = str;
        }
    }

    public AudioSettingsResponse(@InterfaceC30731q(name = "access_request_enabled") boolean z4, @InterfaceC30731q(name = "default_device") DefaultDevice defaultDevice, @InterfaceC30731q(name = "hifi_audio_enabled") boolean z13, @InterfaceC30731q(name = "mic_default_on") boolean z14, @InterfaceC30731q(name = "opus_dtx_enabled") boolean z15, @InterfaceC30731q(name = "redundant_coding_enabled") boolean z16, @InterfaceC30731q(name = "speaker_default_on") boolean z17, @InterfaceC30731q(name = "noise_cancellation") NoiseCancellationSettings noiseCancellationSettings) {
        AbstractC22676k.m65750j(defaultDevice, "defaultDevice");
        this.accessRequestEnabled = z4;
        this.defaultDevice = defaultDevice;
        this.hifiAudioEnabled = z13;
        this.micDefaultOn = z14;
        this.opusDtxEnabled = z15;
        this.redundantCodingEnabled = z16;
        this.speakerDefaultOn = z17;
        this.noiseCancellation = noiseCancellationSettings;
    }

    public static /* synthetic */ AudioSettingsResponse copy$default(AudioSettingsResponse audioSettingsResponse, boolean z4, DefaultDevice defaultDevice, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, NoiseCancellationSettings noiseCancellationSettings, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = audioSettingsResponse.accessRequestEnabled;
        }
        if ((i13 & 2) != 0) {
            defaultDevice = audioSettingsResponse.defaultDevice;
        }
        if ((i13 & 4) != 0) {
            z13 = audioSettingsResponse.hifiAudioEnabled;
        }
        if ((i13 & 8) != 0) {
            z14 = audioSettingsResponse.micDefaultOn;
        }
        if ((i13 & 16) != 0) {
            z15 = audioSettingsResponse.opusDtxEnabled;
        }
        if ((i13 & 32) != 0) {
            z16 = audioSettingsResponse.redundantCodingEnabled;
        }
        if ((i13 & 64) != 0) {
            z17 = audioSettingsResponse.speakerDefaultOn;
        }
        if ((i13 & 128) != 0) {
            noiseCancellationSettings = audioSettingsResponse.noiseCancellation;
        }
        boolean z18 = z17;
        NoiseCancellationSettings noiseCancellationSettings2 = noiseCancellationSettings;
        boolean z19 = z15;
        boolean z24 = z16;
        return audioSettingsResponse.copy(z4, defaultDevice, z13, z14, z19, z24, z18, noiseCancellationSettings2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getAccessRequestEnabled() {
        return this.accessRequestEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DefaultDevice getDefaultDevice() {
        return this.defaultDevice;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHifiAudioEnabled() {
        return this.hifiAudioEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getMicDefaultOn() {
        return this.micDefaultOn;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getOpusDtxEnabled() {
        return this.opusDtxEnabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getRedundantCodingEnabled() {
        return this.redundantCodingEnabled;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getSpeakerDefaultOn() {
        return this.speakerDefaultOn;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final NoiseCancellationSettings getNoiseCancellation() {
        return this.noiseCancellation;
    }

    public final AudioSettingsResponse copy(@InterfaceC30731q(name = "access_request_enabled") boolean accessRequestEnabled, @InterfaceC30731q(name = "default_device") DefaultDevice defaultDevice, @InterfaceC30731q(name = "hifi_audio_enabled") boolean hifiAudioEnabled, @InterfaceC30731q(name = "mic_default_on") boolean micDefaultOn, @InterfaceC30731q(name = "opus_dtx_enabled") boolean opusDtxEnabled, @InterfaceC30731q(name = "redundant_coding_enabled") boolean redundantCodingEnabled, @InterfaceC30731q(name = "speaker_default_on") boolean speakerDefaultOn, @InterfaceC30731q(name = "noise_cancellation") NoiseCancellationSettings noiseCancellation) {
        AbstractC22676k.m65750j(defaultDevice, "defaultDevice");
        return new AudioSettingsResponse(accessRequestEnabled, defaultDevice, hifiAudioEnabled, micDefaultOn, opusDtxEnabled, redundantCodingEnabled, speakerDefaultOn, noiseCancellation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioSettingsResponse)) {
            return false;
        }
        AudioSettingsResponse audioSettingsResponse = (AudioSettingsResponse) other;
        return this.accessRequestEnabled == audioSettingsResponse.accessRequestEnabled && AbstractC22676k.m65745e(this.defaultDevice, audioSettingsResponse.defaultDevice) && this.hifiAudioEnabled == audioSettingsResponse.hifiAudioEnabled && this.micDefaultOn == audioSettingsResponse.micDefaultOn && this.opusDtxEnabled == audioSettingsResponse.opusDtxEnabled && this.redundantCodingEnabled == audioSettingsResponse.redundantCodingEnabled && this.speakerDefaultOn == audioSettingsResponse.speakerDefaultOn && AbstractC22676k.m65745e(this.noiseCancellation, audioSettingsResponse.noiseCancellation);
    }

    public final boolean getAccessRequestEnabled() {
        return this.accessRequestEnabled;
    }

    public final DefaultDevice getDefaultDevice() {
        return this.defaultDevice;
    }

    public final boolean getHifiAudioEnabled() {
        return this.hifiAudioEnabled;
    }

    public final boolean getMicDefaultOn() {
        return this.micDefaultOn;
    }

    public final NoiseCancellationSettings getNoiseCancellation() {
        return this.noiseCancellation;
    }

    public final boolean getOpusDtxEnabled() {
        return this.opusDtxEnabled;
    }

    public final boolean getRedundantCodingEnabled() {
        return this.redundantCodingEnabled;
    }

    public final boolean getSpeakerDefaultOn() {
        return this.speakerDefaultOn;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.defaultDevice.hashCode() + (Boolean.hashCode(this.accessRequestEnabled) * 31)) * 31, 31, this.hifiAudioEnabled), 31, this.micDefaultOn), 31, this.opusDtxEnabled), 31, this.redundantCodingEnabled), 31, this.speakerDefaultOn);
        NoiseCancellationSettings noiseCancellationSettings = this.noiseCancellation;
        return iM8289b + (noiseCancellationSettings == null ? 0 : noiseCancellationSettings.hashCode());
    }

    public String toString() {
        boolean z4 = this.accessRequestEnabled;
        DefaultDevice defaultDevice = this.defaultDevice;
        boolean z13 = this.hifiAudioEnabled;
        boolean z14 = this.micDefaultOn;
        boolean z15 = this.opusDtxEnabled;
        boolean z16 = this.redundantCodingEnabled;
        boolean z17 = this.speakerDefaultOn;
        NoiseCancellationSettings noiseCancellationSettings = this.noiseCancellation;
        StringBuilder sb4 = new StringBuilder("AudioSettingsResponse(accessRequestEnabled=");
        sb4.append(z4);
        sb4.append(", defaultDevice=");
        sb4.append(defaultDevice);
        sb4.append(", hifiAudioEnabled=");
        AbstractC38963t7.m124392v(sb4, z13, ", micDefaultOn=", z14, ", opusDtxEnabled=");
        AbstractC38963t7.m124392v(sb4, z15, ", redundantCodingEnabled=", z16, ", speakerDefaultOn=");
        sb4.append(z17);
        sb4.append(", noiseCancellation=");
        sb4.append(noiseCancellationSettings);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ AudioSettingsResponse(boolean z4, DefaultDevice defaultDevice, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, NoiseCancellationSettings noiseCancellationSettings, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z4, defaultDevice, z13, z14, z15, z16, z17, (i13 & 128) != 0 ? null : noiseCancellationSettings);
    }
}
