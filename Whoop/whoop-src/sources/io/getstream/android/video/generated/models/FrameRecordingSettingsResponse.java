package io.getstream.android.video.generated.models;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p441qx.AbstractC30704c0;
import p441qx.InterfaceC30729p;
import p441qx.InterfaceC30731q;
import p441qx.InterfaceC30738t0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m65681d2 = {"Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse;", "", "captureIntervalInSeconds", "", "mode", "Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;", "quality", "", "(ILio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;Ljava/lang/String;)V", "getCaptureIntervalInSeconds", "()I", "getMode", "()Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;", "getQuality", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Mode", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class FrameRecordingSettingsResponse {
    private final int captureIntervalInSeconds;
    private final Mode mode;
    private final String quality;

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\u0006\b\t\n\u000b\f\rB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "AutoOn", "Available", "Companion", "Disabled", "ModeAdapter", "Unknown", "Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode$AutoOn;", "Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode$Available;", "Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode$Disabled;", "Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode$Unknown;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static abstract class Mode {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String value;

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode$AutoOn;", "Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class AutoOn extends Mode {
            public static final AutoOn INSTANCE = new AutoOn();

            private AutoOn() {
                super("auto-on", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode$Available;", "Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Available extends Mode {
            public static final Available INSTANCE = new Available();

            private Available() {
                super("available", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode$Companion;", "", "()V", "fromString", "Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;", "s", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode$Disabled;", "Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Disabled extends Mode {
            public static final Disabled INSTANCE = new Disabled();

            private Disabled() {
                super("disabled", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode$ModeAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;", "Lqx/c0;", "writer", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;)V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode$Unknown;", "Lio/getstream/android/video/generated/models/FrameRecordingSettingsResponse$Mode;", "unknownValue", "", "(Ljava/lang/String;)V", "getUnknownValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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

            @Override // io.getstream.android.video.generated.models.FrameRecordingSettingsResponse.Mode
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

    public FrameRecordingSettingsResponse(@InterfaceC30731q(name = "capture_interval_in_seconds") int i13, @InterfaceC30731q(name = "mode") Mode mode, @InterfaceC30731q(name = "quality") String str) {
        AbstractC22676k.m65750j(mode, "mode");
        this.captureIntervalInSeconds = i13;
        this.mode = mode;
        this.quality = str;
    }

    public static /* synthetic */ FrameRecordingSettingsResponse copy$default(FrameRecordingSettingsResponse frameRecordingSettingsResponse, int i13, Mode mode, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = frameRecordingSettingsResponse.captureIntervalInSeconds;
        }
        if ((i14 & 2) != 0) {
            mode = frameRecordingSettingsResponse.mode;
        }
        if ((i14 & 4) != 0) {
            str = frameRecordingSettingsResponse.quality;
        }
        return frameRecordingSettingsResponse.copy(i13, mode, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCaptureIntervalInSeconds() {
        return this.captureIntervalInSeconds;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Mode getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getQuality() {
        return this.quality;
    }

    public final FrameRecordingSettingsResponse copy(@InterfaceC30731q(name = "capture_interval_in_seconds") int captureIntervalInSeconds, @InterfaceC30731q(name = "mode") Mode mode, @InterfaceC30731q(name = "quality") String quality) {
        AbstractC22676k.m65750j(mode, "mode");
        return new FrameRecordingSettingsResponse(captureIntervalInSeconds, mode, quality);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrameRecordingSettingsResponse)) {
            return false;
        }
        FrameRecordingSettingsResponse frameRecordingSettingsResponse = (FrameRecordingSettingsResponse) other;
        return this.captureIntervalInSeconds == frameRecordingSettingsResponse.captureIntervalInSeconds && AbstractC22676k.m65745e(this.mode, frameRecordingSettingsResponse.mode) && AbstractC22676k.m65745e(this.quality, frameRecordingSettingsResponse.quality);
    }

    public final int getCaptureIntervalInSeconds() {
        return this.captureIntervalInSeconds;
    }

    public final Mode getMode() {
        return this.mode;
    }

    public final String getQuality() {
        return this.quality;
    }

    public int hashCode() {
        int iHashCode = (this.mode.hashCode() + (Integer.hashCode(this.captureIntervalInSeconds) * 31)) * 31;
        String str = this.quality;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        int i13 = this.captureIntervalInSeconds;
        Mode mode = this.mode;
        String str = this.quality;
        StringBuilder sb4 = new StringBuilder("FrameRecordingSettingsResponse(captureIntervalInSeconds=");
        sb4.append(i13);
        sb4.append(", mode=");
        sb4.append(mode);
        sb4.append(", quality=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }

    public /* synthetic */ FrameRecordingSettingsResponse(int i13, Mode mode, String str, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, mode, (i14 & 4) != 0 ? null : str);
    }
}
