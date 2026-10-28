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
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J0\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RecordSettingsRequest;", "", "mode", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;", "audioOnly", "", "quality", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;", "(Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;)V", "getAudioOnly", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMode", "()Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;", "getQuality", "()Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;", "component1", "component2", "component3", "copy", "(Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;)Lio/getstream/android/video/generated/models/RecordSettingsRequest;", "equals", "other", "hashCode", "", "toString", "", "Mode", "Quality", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class RecordSettingsRequest {
    private final Boolean audioOnly;
    private final Mode mode;
    private final Quality quality;

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\u0006\b\t\n\u000b\f\rB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "AutoOn", "Available", "Companion", "Disabled", "ModeAdapter", "Unknown", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode$AutoOn;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode$Available;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode$Disabled;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode$Unknown;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static abstract class Mode {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String value;

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode$AutoOn;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class AutoOn extends Mode {
            public static final AutoOn INSTANCE = new AutoOn();

            private AutoOn() {
                super("auto-on", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode$Available;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Available extends Mode {
            public static final Available INSTANCE = new Available();

            private Available() {
                super("available", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode$Companion;", "", "()V", "fromString", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;", "s", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode$Disabled;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Disabled extends Mode {
            public static final Disabled INSTANCE = new Disabled();

            private Disabled() {
                super("disabled", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode$ModeAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;", "Lqx/c0;", "writer", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;)V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode$Unknown;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Mode;", "unknownValue", "", "(Ljava/lang/String;)V", "getUnknownValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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

            @Override // io.getstream.android.video.generated.models.RecordSettingsRequest.Mode
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

    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \b2\u00020\u0001:\r\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u000b\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, m65681d2 = {"Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "Companion", "Portrait1080x1920", "Portrait1440x2560", "Portrait360x640", "Portrait480x854", "Portrait720x1280", "Quality1080p", "Quality1440p", "Quality360p", "Quality480p", "Quality720p", "QualityAdapter", "Unknown", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$Portrait1080x1920;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$Portrait1440x2560;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$Portrait360x640;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$Portrait480x854;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$Portrait720x1280;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$Quality1080p;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$Quality1440p;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$Quality360p;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$Quality480p;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$Quality720p;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$Unknown;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static abstract class Quality {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String value;

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$Companion;", "", "()V", "fromString", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;", "s", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            public final Quality fromString(String s13) {
                AbstractC22676k.m65750j(s13, "s");
                switch (s13.hashCode()) {
                    case -1301276363:
                        if (s13.equals("portrait-360x640")) {
                            return Portrait360x640.INSTANCE;
                        }
                        break;
                    case -356512423:
                        if (s13.equals("portrait-480x854")) {
                            return Portrait480x854.INSTANCE;
                        }
                        break;
                    case 1572835:
                        if (s13.equals("360p")) {
                            return Quality360p.INSTANCE;
                        }
                        break;
                    case 1604548:
                        if (s13.equals("480p")) {
                            return Quality480p.INSTANCE;
                        }
                        break;
                    case 1688155:
                        if (s13.equals("720p")) {
                            return Quality720p.INSTANCE;
                        }
                        break;
                    case 46737913:
                        if (s13.equals("1080p")) {
                            return Quality1080p.INSTANCE;
                        }
                        break;
                    case 46853233:
                        if (s13.equals("1440p")) {
                            return Quality1440p.INSTANCE;
                        }
                        break;
                    case 987801732:
                        if (s13.equals("portrait-1440x2560")) {
                            return Portrait1440x2560.INSTANCE;
                        }
                        break;
                    case 1736214446:
                        if (s13.equals("portrait-720x1280")) {
                            return Portrait720x1280.INSTANCE;
                        }
                        break;
                    case 1861516341:
                        if (s13.equals("portrait-1080x1920")) {
                            return Portrait1080x1920.INSTANCE;
                        }
                        break;
                }
                return new Unknown(s13);
            }

            private Companion() {
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$Portrait1080x1920;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Portrait1080x1920 extends Quality {
            public static final Portrait1080x1920 INSTANCE = new Portrait1080x1920();

            private Portrait1080x1920() {
                super("portrait-1080x1920", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$Portrait1440x2560;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Portrait1440x2560 extends Quality {
            public static final Portrait1440x2560 INSTANCE = new Portrait1440x2560();

            private Portrait1440x2560() {
                super("portrait-1440x2560", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$Portrait360x640;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Portrait360x640 extends Quality {
            public static final Portrait360x640 INSTANCE = new Portrait360x640();

            private Portrait360x640() {
                super("portrait-360x640", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$Portrait480x854;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Portrait480x854 extends Quality {
            public static final Portrait480x854 INSTANCE = new Portrait480x854();

            private Portrait480x854() {
                super("portrait-480x854", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$Portrait720x1280;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Portrait720x1280 extends Quality {
            public static final Portrait720x1280 INSTANCE = new Portrait720x1280();

            private Portrait720x1280() {
                super("portrait-720x1280", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$Quality1080p;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Quality1080p extends Quality {
            public static final Quality1080p INSTANCE = new Quality1080p();

            private Quality1080p() {
                super("1080p", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$Quality1440p;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Quality1440p extends Quality {
            public static final Quality1440p INSTANCE = new Quality1440p();

            private Quality1440p() {
                super("1440p", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$Quality360p;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Quality360p extends Quality {
            public static final Quality360p INSTANCE = new Quality360p();

            private Quality360p() {
                super("360p", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$Quality480p;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Quality480p extends Quality {
            public static final Quality480p INSTANCE = new Quality480p();

            private Quality480p() {
                super("480p", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$Quality720p;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Quality720p extends Quality {
            public static final Quality720p INSTANCE = new Quality720p();

            private Quality720p() {
                super("720p", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$QualityAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;", "Lqx/c0;", "writer", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;)V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class QualityAdapter extends JsonAdapter<Quality> {
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public Quality fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                String strNextString = reader.nextString();
                if (strNextString == null) {
                    return null;
                }
                return Quality.INSTANCE.fromString(strNextString);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, Quality value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.mo94362F0(value != null ? value.getValue() : null);
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality$Unknown;", "Lio/getstream/android/video/generated/models/RecordSettingsRequest$Quality;", "unknownValue", "", "(Ljava/lang/String;)V", "getUnknownValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final /* data */ class Unknown extends Quality {
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

            @Override // io.getstream.android.video.generated.models.RecordSettingsRequest.Quality
            public String toString() {
                return AbstractC11895b.m31996o("Unknown(unknownValue=", this.unknownValue, ")");
            }
        }

        public /* synthetic */ Quality(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public final String getValue() {
            return this.value;
        }

        public String toString() {
            return this.value;
        }

        private Quality(String str) {
            this.value = str;
        }
    }

    public RecordSettingsRequest(@InterfaceC30731q(name = "mode") Mode mode, @InterfaceC30731q(name = "audio_only") Boolean bool, @InterfaceC30731q(name = "quality") Quality quality) {
        AbstractC22676k.m65750j(mode, "mode");
        this.mode = mode;
        this.audioOnly = bool;
        this.quality = quality;
    }

    public static /* synthetic */ RecordSettingsRequest copy$default(RecordSettingsRequest recordSettingsRequest, Mode mode, Boolean bool, Quality quality, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            mode = recordSettingsRequest.mode;
        }
        if ((i13 & 2) != 0) {
            bool = recordSettingsRequest.audioOnly;
        }
        if ((i13 & 4) != 0) {
            quality = recordSettingsRequest.quality;
        }
        return recordSettingsRequest.copy(mode, bool, quality);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Mode getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getAudioOnly() {
        return this.audioOnly;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Quality getQuality() {
        return this.quality;
    }

    public final RecordSettingsRequest copy(@InterfaceC30731q(name = "mode") Mode mode, @InterfaceC30731q(name = "audio_only") Boolean audioOnly, @InterfaceC30731q(name = "quality") Quality quality) {
        AbstractC22676k.m65750j(mode, "mode");
        return new RecordSettingsRequest(mode, audioOnly, quality);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecordSettingsRequest)) {
            return false;
        }
        RecordSettingsRequest recordSettingsRequest = (RecordSettingsRequest) other;
        return AbstractC22676k.m65745e(this.mode, recordSettingsRequest.mode) && AbstractC22676k.m65745e(this.audioOnly, recordSettingsRequest.audioOnly) && AbstractC22676k.m65745e(this.quality, recordSettingsRequest.quality);
    }

    public final Boolean getAudioOnly() {
        return this.audioOnly;
    }

    public final Mode getMode() {
        return this.mode;
    }

    public final Quality getQuality() {
        return this.quality;
    }

    public int hashCode() {
        int iHashCode = this.mode.hashCode() * 31;
        Boolean bool = this.audioOnly;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Quality quality = this.quality;
        return iHashCode2 + (quality != null ? quality.hashCode() : 0);
    }

    public String toString() {
        return "RecordSettingsRequest(mode=" + this.mode + ", audioOnly=" + this.audioOnly + ", quality=" + this.quality + ")";
    }

    public /* synthetic */ RecordSettingsRequest(Mode mode, Boolean bool, Quality quality, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(mode, (i13 & 2) != 0 ? null : bool, (i13 & 4) != 0 ? null : quality);
    }
}
