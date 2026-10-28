package io.getstream.android.video.generated.models;

import c13.AbstractC3855a;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import p088dc.AbstractC11895b;
import p441qx.AbstractC30704c0;
import p441qx.InterfaceC30729p;
import p441qx.InterfaceC30731q;
import p441qx.InterfaceC30738t0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001*Bc\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010!\u001a\u0004\u0018\u00010\fHÆ\u0003Jl\u0010\"\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0014\u0010\u000fR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0017\u0010\u000fR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0018\u0010\u000fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0019\u0010\u000f¨\u0006+"}, m65681d2 = {"Lio/getstream/android/video/generated/models/AudioSettingsRequest;", "", "defaultDevice", "Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;", "accessRequestEnabled", "", "hifiAudioEnabled", "micDefaultOn", "opusDtxEnabled", "redundantCodingEnabled", "speakerDefaultOn", "noiseCancellation", "Lio/getstream/android/video/generated/models/NoiseCancellationSettings;", "(Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/NoiseCancellationSettings;)V", "getAccessRequestEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDefaultDevice", "()Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;", "getHifiAudioEnabled", "getMicDefaultOn", "getNoiseCancellation", "()Lio/getstream/android/video/generated/models/NoiseCancellationSettings;", "getOpusDtxEnabled", "getRedundantCodingEnabled", "getSpeakerDefaultOn", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/NoiseCancellationSettings;)Lio/getstream/android/video/generated/models/AudioSettingsRequest;", "equals", "other", "hashCode", "", "toString", "", "DefaultDevice", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class AudioSettingsRequest {
    private final Boolean accessRequestEnabled;
    private final DefaultDevice defaultDevice;
    private final Boolean hifiAudioEnabled;
    private final Boolean micDefaultOn;
    private final NoiseCancellationSettings noiseCancellation;
    private final Boolean opusDtxEnabled;
    private final Boolean redundantCodingEnabled;
    private final Boolean speakerDefaultOn;

    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\u0005\b\t\n\u000b\fB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\r\u000e\u000f¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "Companion", "DefaultDeviceAdapter", "Earpiece", "Speaker", "Unknown", "Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice$Earpiece;", "Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice$Speaker;", "Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice$Unknown;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static abstract class DefaultDevice {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String value;

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice$Companion;", "", "()V", "fromString", "Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;", "s", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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

        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice$DefaultDeviceAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;", "Lqx/c0;", "writer", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;)V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice$Earpiece;", "Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Earpiece extends DefaultDevice {
            public static final Earpiece INSTANCE = new Earpiece();

            private Earpiece() {
                super("earpiece", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice$Speaker;", "Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Speaker extends DefaultDevice {
            public static final Speaker INSTANCE = new Speaker();

            private Speaker() {
                super("speaker", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice$Unknown;", "Lio/getstream/android/video/generated/models/AudioSettingsRequest$DefaultDevice;", "unknownValue", "", "(Ljava/lang/String;)V", "getUnknownValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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

            @Override // io.getstream.android.video.generated.models.AudioSettingsRequest.DefaultDevice
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

    public AudioSettingsRequest(@InterfaceC30731q(name = "default_device") DefaultDevice defaultDevice, @InterfaceC30731q(name = "access_request_enabled") Boolean bool, @InterfaceC30731q(name = "hifi_audio_enabled") Boolean bool2, @InterfaceC30731q(name = "mic_default_on") Boolean bool3, @InterfaceC30731q(name = "opus_dtx_enabled") Boolean bool4, @InterfaceC30731q(name = "redundant_coding_enabled") Boolean bool5, @InterfaceC30731q(name = "speaker_default_on") Boolean bool6, @InterfaceC30731q(name = "noise_cancellation") NoiseCancellationSettings noiseCancellationSettings) {
        AbstractC22676k.m65750j(defaultDevice, "defaultDevice");
        this.defaultDevice = defaultDevice;
        this.accessRequestEnabled = bool;
        this.hifiAudioEnabled = bool2;
        this.micDefaultOn = bool3;
        this.opusDtxEnabled = bool4;
        this.redundantCodingEnabled = bool5;
        this.speakerDefaultOn = bool6;
        this.noiseCancellation = noiseCancellationSettings;
    }

    public static /* synthetic */ AudioSettingsRequest copy$default(AudioSettingsRequest audioSettingsRequest, DefaultDevice defaultDevice, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, NoiseCancellationSettings noiseCancellationSettings, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            defaultDevice = audioSettingsRequest.defaultDevice;
        }
        if ((i13 & 2) != 0) {
            bool = audioSettingsRequest.accessRequestEnabled;
        }
        if ((i13 & 4) != 0) {
            bool2 = audioSettingsRequest.hifiAudioEnabled;
        }
        if ((i13 & 8) != 0) {
            bool3 = audioSettingsRequest.micDefaultOn;
        }
        if ((i13 & 16) != 0) {
            bool4 = audioSettingsRequest.opusDtxEnabled;
        }
        if ((i13 & 32) != 0) {
            bool5 = audioSettingsRequest.redundantCodingEnabled;
        }
        if ((i13 & 64) != 0) {
            bool6 = audioSettingsRequest.speakerDefaultOn;
        }
        if ((i13 & 128) != 0) {
            noiseCancellationSettings = audioSettingsRequest.noiseCancellation;
        }
        Boolean bool7 = bool6;
        NoiseCancellationSettings noiseCancellationSettings2 = noiseCancellationSettings;
        Boolean bool8 = bool4;
        Boolean bool9 = bool5;
        return audioSettingsRequest.copy(defaultDevice, bool, bool2, bool3, bool8, bool9, bool7, noiseCancellationSettings2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DefaultDevice getDefaultDevice() {
        return this.defaultDevice;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getAccessRequestEnabled() {
        return this.accessRequestEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getHifiAudioEnabled() {
        return this.hifiAudioEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getMicDefaultOn() {
        return this.micDefaultOn;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getOpusDtxEnabled() {
        return this.opusDtxEnabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getRedundantCodingEnabled() {
        return this.redundantCodingEnabled;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getSpeakerDefaultOn() {
        return this.speakerDefaultOn;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final NoiseCancellationSettings getNoiseCancellation() {
        return this.noiseCancellation;
    }

    public final AudioSettingsRequest copy(@InterfaceC30731q(name = "default_device") DefaultDevice defaultDevice, @InterfaceC30731q(name = "access_request_enabled") Boolean accessRequestEnabled, @InterfaceC30731q(name = "hifi_audio_enabled") Boolean hifiAudioEnabled, @InterfaceC30731q(name = "mic_default_on") Boolean micDefaultOn, @InterfaceC30731q(name = "opus_dtx_enabled") Boolean opusDtxEnabled, @InterfaceC30731q(name = "redundant_coding_enabled") Boolean redundantCodingEnabled, @InterfaceC30731q(name = "speaker_default_on") Boolean speakerDefaultOn, @InterfaceC30731q(name = "noise_cancellation") NoiseCancellationSettings noiseCancellation) {
        AbstractC22676k.m65750j(defaultDevice, "defaultDevice");
        return new AudioSettingsRequest(defaultDevice, accessRequestEnabled, hifiAudioEnabled, micDefaultOn, opusDtxEnabled, redundantCodingEnabled, speakerDefaultOn, noiseCancellation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioSettingsRequest)) {
            return false;
        }
        AudioSettingsRequest audioSettingsRequest = (AudioSettingsRequest) other;
        return AbstractC22676k.m65745e(this.defaultDevice, audioSettingsRequest.defaultDevice) && AbstractC22676k.m65745e(this.accessRequestEnabled, audioSettingsRequest.accessRequestEnabled) && AbstractC22676k.m65745e(this.hifiAudioEnabled, audioSettingsRequest.hifiAudioEnabled) && AbstractC22676k.m65745e(this.micDefaultOn, audioSettingsRequest.micDefaultOn) && AbstractC22676k.m65745e(this.opusDtxEnabled, audioSettingsRequest.opusDtxEnabled) && AbstractC22676k.m65745e(this.redundantCodingEnabled, audioSettingsRequest.redundantCodingEnabled) && AbstractC22676k.m65745e(this.speakerDefaultOn, audioSettingsRequest.speakerDefaultOn) && AbstractC22676k.m65745e(this.noiseCancellation, audioSettingsRequest.noiseCancellation);
    }

    public final Boolean getAccessRequestEnabled() {
        return this.accessRequestEnabled;
    }

    public final DefaultDevice getDefaultDevice() {
        return this.defaultDevice;
    }

    public final Boolean getHifiAudioEnabled() {
        return this.hifiAudioEnabled;
    }

    public final Boolean getMicDefaultOn() {
        return this.micDefaultOn;
    }

    public final NoiseCancellationSettings getNoiseCancellation() {
        return this.noiseCancellation;
    }

    public final Boolean getOpusDtxEnabled() {
        return this.opusDtxEnabled;
    }

    public final Boolean getRedundantCodingEnabled() {
        return this.redundantCodingEnabled;
    }

    public final Boolean getSpeakerDefaultOn() {
        return this.speakerDefaultOn;
    }

    public int hashCode() {
        int iHashCode = this.defaultDevice.hashCode() * 31;
        Boolean bool = this.accessRequestEnabled;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hifiAudioEnabled;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.micDefaultOn;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.opusDtxEnabled;
        int iHashCode5 = (iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.redundantCodingEnabled;
        int iHashCode6 = (iHashCode5 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.speakerDefaultOn;
        int iHashCode7 = (iHashCode6 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        NoiseCancellationSettings noiseCancellationSettings = this.noiseCancellation;
        return iHashCode7 + (noiseCancellationSettings != null ? noiseCancellationSettings.hashCode() : 0);
    }

    public String toString() {
        DefaultDevice defaultDevice = this.defaultDevice;
        Boolean bool = this.accessRequestEnabled;
        Boolean bool2 = this.hifiAudioEnabled;
        Boolean bool3 = this.micDefaultOn;
        Boolean bool4 = this.opusDtxEnabled;
        Boolean bool5 = this.redundantCodingEnabled;
        Boolean bool6 = this.speakerDefaultOn;
        NoiseCancellationSettings noiseCancellationSettings = this.noiseCancellation;
        StringBuilder sb4 = new StringBuilder("AudioSettingsRequest(defaultDevice=");
        sb4.append(defaultDevice);
        sb4.append(", accessRequestEnabled=");
        sb4.append(bool);
        sb4.append(", hifiAudioEnabled=");
        AbstractC3855a.m11839w(sb4, bool2, ", micDefaultOn=", bool3, ", opusDtxEnabled=");
        AbstractC3855a.m11839w(sb4, bool4, ", redundantCodingEnabled=", bool5, ", speakerDefaultOn=");
        sb4.append(bool6);
        sb4.append(", noiseCancellation=");
        sb4.append(noiseCancellationSettings);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ AudioSettingsRequest(DefaultDevice defaultDevice, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, NoiseCancellationSettings noiseCancellationSettings, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(defaultDevice, (i13 & 2) != 0 ? null : bool, (i13 & 4) != 0 ? null : bool2, (i13 & 8) != 0 ? null : bool3, (i13 & 16) != 0 ? null : bool4, (i13 & 32) != 0 ? null : bool5, (i13 & 64) != 0 ? null : bool6, (i13 & 128) != 0 ? null : noiseCancellationSettings);
    }
}
