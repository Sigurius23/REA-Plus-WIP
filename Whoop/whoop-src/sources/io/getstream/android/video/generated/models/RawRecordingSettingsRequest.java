package io.getstream.android.video.generated.models;

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
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\bJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;", "", "mode", "Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest$Mode;", "audioOnly", "", "(Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest$Mode;Ljava/lang/Boolean;)V", "getAudioOnly", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMode", "()Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest$Mode;", "component1", "component2", "copy", "(Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest$Mode;Ljava/lang/Boolean;)Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest;", "equals", "other", "hashCode", "", "toString", "", "Mode", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class RawRecordingSettingsRequest {
    private final Boolean audioOnly;
    private final Mode mode;

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\u0006\b\t\n\u000b\f\rB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest$Mode;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "AutoOn", "Available", "Companion", "Disabled", "ModeAdapter", "Unknown", "Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest$Mode$AutoOn;", "Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest$Mode$Available;", "Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest$Mode$Disabled;", "Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest$Mode$Unknown;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static abstract class Mode {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String value;

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest$Mode$AutoOn;", "Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest$Mode;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class AutoOn extends Mode {
            public static final AutoOn INSTANCE = new AutoOn();

            private AutoOn() {
                super("auto-on", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest$Mode$Available;", "Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest$Mode;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Available extends Mode {
            public static final Available INSTANCE = new Available();

            private Available() {
                super("available", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest$Mode$Companion;", "", "()V", "fromString", "Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest$Mode;", "s", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Mode fromString(String s13) {
                AbstractC22676k.m65750j(s13, "s");
                int iHashCode = s13.hashCode();
                if (iHashCode != -733902135) {
                    if (iHashCode != -646363459) {
                        if (iHashCode == 270940796 && s13.equals("disabled")) {
                            return Disabled.INSTANCE;
                        }
                    } else if (s13.equals("auto-on")) {
                        return AutoOn.INSTANCE;
                    }
                } else if (s13.equals("available")) {
                    return Available.INSTANCE;
                }
                return new Unknown(s13);
            }

            private Companion() {
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest$Mode$Disabled;", "Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest$Mode;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Disabled extends Mode {
            public static final Disabled INSTANCE = new Disabled();

            private Disabled() {
                super("disabled", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest$Mode$ModeAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest$Mode;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest$Mode;", "Lqx/c0;", "writer", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest$Mode;)V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class ModeAdapter extends JsonAdapter<Mode> {
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public Mode fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                String strNextString = reader.nextString();
                if (strNextString == null) {
                    return null;
                }
                return Mode.INSTANCE.fromString(strNextString);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, Mode value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.mo94362F0(value != null ? value.getValue() : null);
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest$Mode$Unknown;", "Lio/getstream/android/video/generated/models/RawRecordingSettingsRequest$Mode;", "unknownValue", "", "(Ljava/lang/String;)V", "getUnknownValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final /* data */ class Unknown extends Mode {
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

            @Override // io.getstream.android.video.generated.models.RawRecordingSettingsRequest.Mode
            public String toString() {
                return AbstractC11895b.m31996o("Unknown(unknownValue=", this.unknownValue, ")");
            }
        }

        public /* synthetic */ Mode(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public final String getValue() {
            return this.value;
        }

        public String toString() {
            return this.value;
        }

        private Mode(String str) {
            this.value = str;
        }
    }

    public RawRecordingSettingsRequest(@InterfaceC30731q(name = "mode") Mode mode, @InterfaceC30731q(name = "audio_only") Boolean bool) {
        AbstractC22676k.m65750j(mode, "mode");
        this.mode = mode;
        this.audioOnly = bool;
    }

    public static /* synthetic */ RawRecordingSettingsRequest copy$default(RawRecordingSettingsRequest rawRecordingSettingsRequest, Mode mode, Boolean bool, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            mode = rawRecordingSettingsRequest.mode;
        }
        if ((i13 & 2) != 0) {
            bool = rawRecordingSettingsRequest.audioOnly;
        }
        return rawRecordingSettingsRequest.copy(mode, bool);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Mode getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getAudioOnly() {
        return this.audioOnly;
    }

    public final RawRecordingSettingsRequest copy(@InterfaceC30731q(name = "mode") Mode mode, @InterfaceC30731q(name = "audio_only") Boolean audioOnly) {
        AbstractC22676k.m65750j(mode, "mode");
        return new RawRecordingSettingsRequest(mode, audioOnly);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RawRecordingSettingsRequest)) {
            return false;
        }
        RawRecordingSettingsRequest rawRecordingSettingsRequest = (RawRecordingSettingsRequest) other;
        return AbstractC22676k.m65745e(this.mode, rawRecordingSettingsRequest.mode) && AbstractC22676k.m65745e(this.audioOnly, rawRecordingSettingsRequest.audioOnly);
    }

    public final Boolean getAudioOnly() {
        return this.audioOnly;
    }

    public final Mode getMode() {
        return this.mode;
    }

    public int hashCode() {
        int iHashCode = this.mode.hashCode() * 31;
        Boolean bool = this.audioOnly;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "RawRecordingSettingsRequest(mode=" + this.mode + ", audioOnly=" + this.audioOnly + ")";
    }

    public /* synthetic */ RawRecordingSettingsRequest(Mode mode, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(mode, (i13 & 2) != 0 ? null : bool);
    }
}
