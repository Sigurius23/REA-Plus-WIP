package io.getstream.android.video.generated.models;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.whoop.data.repositories.LanguageRepositoryKt;
import com.whoop.service.network.model.UserState;
import p088dc.AbstractC11895b;
import p441qx.AbstractC30704c0;
import p441qx.InterfaceC30729p;
import p441qx.InterfaceC30731q;
import p441qx.InterfaceC30738t0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003$%&B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003J?\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse;", "", "closedCaptionMode", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode;", "language", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "mode", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode;", "speechSegmentConfig", "Lio/getstream/android/video/generated/models/SpeechSegmentConfig;", "translation", "Lio/getstream/android/video/generated/models/TranslationSettings;", "(Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode;Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode;Lio/getstream/android/video/generated/models/SpeechSegmentConfig;Lio/getstream/android/video/generated/models/TranslationSettings;)V", "getClosedCaptionMode", "()Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode;", "getLanguage", "()Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "getMode", "()Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode;", "getSpeechSegmentConfig", "()Lio/getstream/android/video/generated/models/SpeechSegmentConfig;", "getTranslation", "()Lio/getstream/android/video/generated/models/TranslationSettings;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ClosedCaptionMode", "Language", "Mode", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class TranscriptionSettingsResponse {
    private final ClosedCaptionMode closedCaptionMode;
    private final Language language;
    private final Mode mode;
    private final SpeechSegmentConfig speechSegmentConfig;
    private final TranslationSettings translation;

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000b2\u00020\u0001:\u0006\b\t\n\u000b\f\rB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "AutoOn", "Available", "ClosedCaptionModeAdapter", "Companion", "Disabled", "Unknown", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode$AutoOn;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode$Available;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode$Disabled;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode$Unknown;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static abstract class ClosedCaptionMode {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String value;

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode$AutoOn;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class AutoOn extends ClosedCaptionMode {
            public static final AutoOn INSTANCE = new AutoOn();

            private AutoOn() {
                super("auto-on", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode$Available;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Available extends ClosedCaptionMode {
            public static final Available INSTANCE = new Available();

            private Available() {
                super("available", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode$ClosedCaptionModeAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode;", "Lqx/c0;", "writer", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode;)V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class ClosedCaptionModeAdapter extends JsonAdapter<ClosedCaptionMode> {
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public ClosedCaptionMode fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                String strNextString = reader.nextString();
                if (strNextString == null) {
                    return null;
                }
                return ClosedCaptionMode.INSTANCE.fromString(strNextString);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, ClosedCaptionMode value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.mo94362F0(value != null ? value.getValue() : null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode$Companion;", "", "()V", "fromString", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode;", "s", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ClosedCaptionMode fromString(String s13) {
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

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode$Disabled;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Disabled extends ClosedCaptionMode {
            public static final Disabled INSTANCE = new Disabled();

            private Disabled() {
                super("disabled", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode$Unknown;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$ClosedCaptionMode;", "unknownValue", "", "(Ljava/lang/String;)V", "getUnknownValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final /* data */ class Unknown extends ClosedCaptionMode {
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

            @Override // io.getstream.android.video.generated.models.TranscriptionSettingsResponse.ClosedCaptionMode
            public String toString() {
                return AbstractC11895b.m31996o("Unknown(unknownValue=", this.unknownValue, ")");
            }
        }

        public /* synthetic */ ClosedCaptionMode(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public final String getValue() {
            return this.value;
        }

        public String toString() {
            return this.value;
        }

        private ClosedCaptionMode(String str) {
            this.value = str;
        }
    }

    @Metadata(m65680d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \f2\u00020\u0001:(\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001&0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTU¨\u0006V"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "Ar", "Auto", "Bg", "Ca", "Companion", "Cs", "Da", "De", "El", "En", "Es", "Et", "Fi", "Fr", "He", "Hi", "Hr", "Hu", "Id", "It", "Ja", "Ko", "LanguageAdapter", "Ms", "Nl", "No", "Pl", "Pt", "Ro", "Ru", "Sk", "Sl", "Sv", "Ta", "Th", "Tl", "Tr", "Uk", "Unknown", "Zh", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Ar;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Auto;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Bg;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Ca;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Cs;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Da;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$De;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$El;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$En;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Es;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Et;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Fi;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Fr;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$He;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Hi;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Hr;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Hu;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Id;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$It;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Ja;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Ko;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Ms;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Nl;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$No;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Pl;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Pt;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Ro;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Ru;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Sk;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Sl;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Sv;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Ta;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Th;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Tl;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Tr;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Uk;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Unknown;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Zh;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static abstract class Language {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String value;

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Ar */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Ar;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18854Ar extends Language {
            public static final C18854Ar INSTANCE = new C18854Ar();

            private C18854Ar() {
                super("ar", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Auto;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Auto extends Language {
            public static final Auto INSTANCE = new Auto();

            private Auto() {
                super(UserState.Sources.AUTO, null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Bg */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Bg;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18855Bg extends Language {
            public static final C18855Bg INSTANCE = new C18855Bg();

            private C18855Bg() {
                super("bg", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Ca */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Ca;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18856Ca extends Language {
            public static final C18856Ca INSTANCE = new C18856Ca();

            private C18856Ca() {
                super("ca", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Companion;", "", "()V", "fromString", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "s", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            public final Language fromString(String s13) {
                AbstractC22676k.m65750j(s13, "s");
                switch (s13.hashCode()) {
                    case 3121:
                        if (s13.equals("ar")) {
                            return C18854Ar.INSTANCE;
                        }
                        break;
                    case 3141:
                        if (s13.equals("bg")) {
                            return C18855Bg.INSTANCE;
                        }
                        break;
                    case 3166:
                        if (s13.equals("ca")) {
                            return C18856Ca.INSTANCE;
                        }
                        break;
                    case 3184:
                        if (s13.equals("cs")) {
                            return C18857Cs.INSTANCE;
                        }
                        break;
                    case 3197:
                        if (s13.equals("da")) {
                            return C18858Da.INSTANCE;
                        }
                        break;
                    case 3201:
                        if (s13.equals("de")) {
                            return C18859De.INSTANCE;
                        }
                        break;
                    case 3239:
                        if (s13.equals("el")) {
                            return C18860El.INSTANCE;
                        }
                        break;
                    case 3241:
                        if (s13.equals(LanguageRepositoryKt.DEFAULT_LANGUAGE)) {
                            return C18861En.INSTANCE;
                        }
                        break;
                    case 3246:
                        if (s13.equals("es")) {
                            return C18862Es.INSTANCE;
                        }
                        break;
                    case 3247:
                        if (s13.equals("et")) {
                            return C18863Et.INSTANCE;
                        }
                        break;
                    case 3267:
                        if (s13.equals("fi")) {
                            return C18864Fi.INSTANCE;
                        }
                        break;
                    case 3276:
                        if (s13.equals("fr")) {
                            return C18865Fr.INSTANCE;
                        }
                        break;
                    case 3325:
                        if (s13.equals("he")) {
                            return C18866He.INSTANCE;
                        }
                        break;
                    case 3329:
                        if (s13.equals("hi")) {
                            return C18867Hi.INSTANCE;
                        }
                        break;
                    case 3338:
                        if (s13.equals("hr")) {
                            return C18868Hr.INSTANCE;
                        }
                        break;
                    case 3341:
                        if (s13.equals("hu")) {
                            return C18869Hu.INSTANCE;
                        }
                        break;
                    case 3355:
                        if (s13.equals("id")) {
                            return C18870Id.INSTANCE;
                        }
                        break;
                    case 3371:
                        if (s13.equals("it")) {
                            return C18871It.INSTANCE;
                        }
                        break;
                    case 3383:
                        if (s13.equals("ja")) {
                            return C18872Ja.INSTANCE;
                        }
                        break;
                    case 3428:
                        if (s13.equals("ko")) {
                            return C18873Ko.INSTANCE;
                        }
                        break;
                    case 3494:
                        if (s13.equals("ms")) {
                            return C18874Ms.INSTANCE;
                        }
                        break;
                    case 3518:
                        if (s13.equals("nl")) {
                            return C18875Nl.INSTANCE;
                        }
                        break;
                    case 3521:
                        if (s13.equals("no")) {
                            return C18876No.INSTANCE;
                        }
                        break;
                    case 3580:
                        if (s13.equals("pl")) {
                            return C18877Pl.INSTANCE;
                        }
                        break;
                    case 3588:
                        if (s13.equals("pt")) {
                            return C18878Pt.INSTANCE;
                        }
                        break;
                    case 3645:
                        if (s13.equals("ro")) {
                            return C18879Ro.INSTANCE;
                        }
                        break;
                    case 3651:
                        if (s13.equals("ru")) {
                            return C18880Ru.INSTANCE;
                        }
                        break;
                    case 3672:
                        if (s13.equals("sk")) {
                            return C18881Sk.INSTANCE;
                        }
                        break;
                    case 3673:
                        if (s13.equals("sl")) {
                            return C18882Sl.INSTANCE;
                        }
                        break;
                    case 3683:
                        if (s13.equals("sv")) {
                            return C18883Sv.INSTANCE;
                        }
                        break;
                    case 3693:
                        if (s13.equals("ta")) {
                            return C18884Ta.INSTANCE;
                        }
                        break;
                    case 3700:
                        if (s13.equals("th")) {
                            return C18885Th.INSTANCE;
                        }
                        break;
                    case 3704:
                        if (s13.equals("tl")) {
                            return C18886Tl.INSTANCE;
                        }
                        break;
                    case 3710:
                        if (s13.equals("tr")) {
                            return C18887Tr.INSTANCE;
                        }
                        break;
                    case 3734:
                        if (s13.equals("uk")) {
                            return C18888Uk.INSTANCE;
                        }
                        break;
                    case 3886:
                        if (s13.equals("zh")) {
                            return C18889Zh.INSTANCE;
                        }
                        break;
                    case 3005871:
                        if (s13.equals(UserState.Sources.AUTO)) {
                            return Auto.INSTANCE;
                        }
                        break;
                }
                return new Unknown(s13);
            }

            private Companion() {
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Cs */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Cs;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18857Cs extends Language {
            public static final C18857Cs INSTANCE = new C18857Cs();

            private C18857Cs() {
                super("cs", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Da */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Da;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18858Da extends Language {
            public static final C18858Da INSTANCE = new C18858Da();

            private C18858Da() {
                super("da", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$De */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$De;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18859De extends Language {
            public static final C18859De INSTANCE = new C18859De();

            private C18859De() {
                super("de", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$El */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$El;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18860El extends Language {
            public static final C18860El INSTANCE = new C18860El();

            private C18860El() {
                super("el", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$En */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$En;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18861En extends Language {
            public static final C18861En INSTANCE = new C18861En();

            private C18861En() {
                super(LanguageRepositoryKt.DEFAULT_LANGUAGE, null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Es */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Es;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18862Es extends Language {
            public static final C18862Es INSTANCE = new C18862Es();

            private C18862Es() {
                super("es", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Et */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Et;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18863Et extends Language {
            public static final C18863Et INSTANCE = new C18863Et();

            private C18863Et() {
                super("et", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Fi */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Fi;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18864Fi extends Language {
            public static final C18864Fi INSTANCE = new C18864Fi();

            private C18864Fi() {
                super("fi", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Fr */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Fr;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18865Fr extends Language {
            public static final C18865Fr INSTANCE = new C18865Fr();

            private C18865Fr() {
                super("fr", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$He */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$He;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18866He extends Language {
            public static final C18866He INSTANCE = new C18866He();

            private C18866He() {
                super("he", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Hi */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Hi;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18867Hi extends Language {
            public static final C18867Hi INSTANCE = new C18867Hi();

            private C18867Hi() {
                super("hi", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Hr */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Hr;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18868Hr extends Language {
            public static final C18868Hr INSTANCE = new C18868Hr();

            private C18868Hr() {
                super("hr", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Hu */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Hu;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18869Hu extends Language {
            public static final C18869Hu INSTANCE = new C18869Hu();

            private C18869Hu() {
                super("hu", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Id */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Id;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18870Id extends Language {
            public static final C18870Id INSTANCE = new C18870Id();

            private C18870Id() {
                super("id", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$It */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$It;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18871It extends Language {
            public static final C18871It INSTANCE = new C18871It();

            private C18871It() {
                super("it", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Ja */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Ja;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18872Ja extends Language {
            public static final C18872Ja INSTANCE = new C18872Ja();

            private C18872Ja() {
                super("ja", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Ko */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Ko;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18873Ko extends Language {
            public static final C18873Ko INSTANCE = new C18873Ko();

            private C18873Ko() {
                super("ko", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$LanguageAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "Lqx/c0;", "writer", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;)V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class LanguageAdapter extends JsonAdapter<Language> {
            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30729p
            public Language fromJson(JsonReader reader) {
                AbstractC22676k.m65750j(reader, "reader");
                String strNextString = reader.nextString();
                if (strNextString == null) {
                    return null;
                }
                return Language.INSTANCE.fromString(strNextString);
            }

            @Override // com.squareup.moshi.JsonAdapter
            @InterfaceC30738t0
            public void toJson(AbstractC30704c0 writer, Language value) {
                AbstractC22676k.m65750j(writer, "writer");
                writer.mo94362F0(value != null ? value.getValue() : null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Ms */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Ms;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18874Ms extends Language {
            public static final C18874Ms INSTANCE = new C18874Ms();

            private C18874Ms() {
                super("ms", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Nl */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Nl;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18875Nl extends Language {
            public static final C18875Nl INSTANCE = new C18875Nl();

            private C18875Nl() {
                super("nl", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$No */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$No;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18876No extends Language {
            public static final C18876No INSTANCE = new C18876No();

            private C18876No() {
                super("no", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Pl */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Pl;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18877Pl extends Language {
            public static final C18877Pl INSTANCE = new C18877Pl();

            private C18877Pl() {
                super("pl", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Pt */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Pt;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18878Pt extends Language {
            public static final C18878Pt INSTANCE = new C18878Pt();

            private C18878Pt() {
                super("pt", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Ro */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Ro;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18879Ro extends Language {
            public static final C18879Ro INSTANCE = new C18879Ro();

            private C18879Ro() {
                super("ro", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Ru */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Ru;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18880Ru extends Language {
            public static final C18880Ru INSTANCE = new C18880Ru();

            private C18880Ru() {
                super("ru", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Sk */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Sk;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18881Sk extends Language {
            public static final C18881Sk INSTANCE = new C18881Sk();

            private C18881Sk() {
                super("sk", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Sl */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Sl;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18882Sl extends Language {
            public static final C18882Sl INSTANCE = new C18882Sl();

            private C18882Sl() {
                super("sl", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Sv */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Sv;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18883Sv extends Language {
            public static final C18883Sv INSTANCE = new C18883Sv();

            private C18883Sv() {
                super("sv", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Ta */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Ta;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18884Ta extends Language {
            public static final C18884Ta INSTANCE = new C18884Ta();

            private C18884Ta() {
                super("ta", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Th */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Th;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18885Th extends Language {
            public static final C18885Th INSTANCE = new C18885Th();

            private C18885Th() {
                super("th", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Tl */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Tl;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18886Tl extends Language {
            public static final C18886Tl INSTANCE = new C18886Tl();

            private C18886Tl() {
                super("tl", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Tr */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Tr;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18887Tr extends Language {
            public static final C18887Tr INSTANCE = new C18887Tr();

            private C18887Tr() {
                super("tr", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Uk */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Uk;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18888Uk extends Language {
            public static final C18888Uk INSTANCE = new C18888Uk();

            private C18888Uk() {
                super("uk", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Unknown;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "unknownValue", "", "(Ljava/lang/String;)V", "getUnknownValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final /* data */ class Unknown extends Language {
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

            @Override // io.getstream.android.video.generated.models.TranscriptionSettingsResponse.Language
            public String toString() {
                return AbstractC11895b.m31996o("Unknown(unknownValue=", this.unknownValue, ")");
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsResponse$Language$Zh */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language$Zh;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18889Zh extends Language {
            public static final C18889Zh INSTANCE = new C18889Zh();

            private C18889Zh() {
                super("zh", null);
            }
        }

        public /* synthetic */ Language(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public final String getValue() {
            return this.value;
        }

        public String toString() {
            return this.value;
        }

        private Language(String str) {
            this.value = str;
        }
    }

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\u0006\b\t\n\u000b\f\rB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "AutoOn", "Available", "Companion", "Disabled", "ModeAdapter", "Unknown", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode$AutoOn;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode$Available;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode$Disabled;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode$Unknown;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static abstract class Mode {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String value;

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode$AutoOn;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class AutoOn extends Mode {
            public static final AutoOn INSTANCE = new AutoOn();

            private AutoOn() {
                super("auto-on", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode$Available;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Available extends Mode {
            public static final Available INSTANCE = new Available();

            private Available() {
                super("available", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode$Companion;", "", "()V", "fromString", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode;", "s", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode$Disabled;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Disabled extends Mode {
            public static final Disabled INSTANCE = new Disabled();

            private Disabled() {
                super("disabled", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode$ModeAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode;", "Lqx/c0;", "writer", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode;)V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode$Unknown;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsResponse$Mode;", "unknownValue", "", "(Ljava/lang/String;)V", "getUnknownValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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

            @Override // io.getstream.android.video.generated.models.TranscriptionSettingsResponse.Mode
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

    public TranscriptionSettingsResponse(@InterfaceC30731q(name = "closed_caption_mode") ClosedCaptionMode closedCaptionMode, @InterfaceC30731q(name = "language") Language language, @InterfaceC30731q(name = "mode") Mode mode, @InterfaceC30731q(name = "speech_segment_config") SpeechSegmentConfig speechSegmentConfig, @InterfaceC30731q(name = "translation") TranslationSettings translationSettings) {
        AbstractC22676k.m65750j(closedCaptionMode, "closedCaptionMode");
        AbstractC22676k.m65750j(language, "language");
        AbstractC22676k.m65750j(mode, "mode");
        this.closedCaptionMode = closedCaptionMode;
        this.language = language;
        this.mode = mode;
        this.speechSegmentConfig = speechSegmentConfig;
        this.translation = translationSettings;
    }

    public static /* synthetic */ TranscriptionSettingsResponse copy$default(TranscriptionSettingsResponse transcriptionSettingsResponse, ClosedCaptionMode closedCaptionMode, Language language, Mode mode, SpeechSegmentConfig speechSegmentConfig, TranslationSettings translationSettings, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            closedCaptionMode = transcriptionSettingsResponse.closedCaptionMode;
        }
        if ((i13 & 2) != 0) {
            language = transcriptionSettingsResponse.language;
        }
        if ((i13 & 4) != 0) {
            mode = transcriptionSettingsResponse.mode;
        }
        if ((i13 & 8) != 0) {
            speechSegmentConfig = transcriptionSettingsResponse.speechSegmentConfig;
        }
        if ((i13 & 16) != 0) {
            translationSettings = transcriptionSettingsResponse.translation;
        }
        TranslationSettings translationSettings2 = translationSettings;
        Mode mode2 = mode;
        return transcriptionSettingsResponse.copy(closedCaptionMode, language, mode2, speechSegmentConfig, translationSettings2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ClosedCaptionMode getClosedCaptionMode() {
        return this.closedCaptionMode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Language getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Mode getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SpeechSegmentConfig getSpeechSegmentConfig() {
        return this.speechSegmentConfig;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TranslationSettings getTranslation() {
        return this.translation;
    }

    public final TranscriptionSettingsResponse copy(@InterfaceC30731q(name = "closed_caption_mode") ClosedCaptionMode closedCaptionMode, @InterfaceC30731q(name = "language") Language language, @InterfaceC30731q(name = "mode") Mode mode, @InterfaceC30731q(name = "speech_segment_config") SpeechSegmentConfig speechSegmentConfig, @InterfaceC30731q(name = "translation") TranslationSettings translation) {
        AbstractC22676k.m65750j(closedCaptionMode, "closedCaptionMode");
        AbstractC22676k.m65750j(language, "language");
        AbstractC22676k.m65750j(mode, "mode");
        return new TranscriptionSettingsResponse(closedCaptionMode, language, mode, speechSegmentConfig, translation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TranscriptionSettingsResponse)) {
            return false;
        }
        TranscriptionSettingsResponse transcriptionSettingsResponse = (TranscriptionSettingsResponse) other;
        return AbstractC22676k.m65745e(this.closedCaptionMode, transcriptionSettingsResponse.closedCaptionMode) && AbstractC22676k.m65745e(this.language, transcriptionSettingsResponse.language) && AbstractC22676k.m65745e(this.mode, transcriptionSettingsResponse.mode) && AbstractC22676k.m65745e(this.speechSegmentConfig, transcriptionSettingsResponse.speechSegmentConfig) && AbstractC22676k.m65745e(this.translation, transcriptionSettingsResponse.translation);
    }

    public final ClosedCaptionMode getClosedCaptionMode() {
        return this.closedCaptionMode;
    }

    public final Language getLanguage() {
        return this.language;
    }

    public final Mode getMode() {
        return this.mode;
    }

    public final SpeechSegmentConfig getSpeechSegmentConfig() {
        return this.speechSegmentConfig;
    }

    public final TranslationSettings getTranslation() {
        return this.translation;
    }

    public int hashCode() {
        int iHashCode = (this.mode.hashCode() + ((this.language.hashCode() + (this.closedCaptionMode.hashCode() * 31)) * 31)) * 31;
        SpeechSegmentConfig speechSegmentConfig = this.speechSegmentConfig;
        int iHashCode2 = (iHashCode + (speechSegmentConfig == null ? 0 : speechSegmentConfig.hashCode())) * 31;
        TranslationSettings translationSettings = this.translation;
        return iHashCode2 + (translationSettings != null ? translationSettings.hashCode() : 0);
    }

    public String toString() {
        return "TranscriptionSettingsResponse(closedCaptionMode=" + this.closedCaptionMode + ", language=" + this.language + ", mode=" + this.mode + ", speechSegmentConfig=" + this.speechSegmentConfig + ", translation=" + this.translation + ")";
    }

    public /* synthetic */ TranscriptionSettingsResponse(ClosedCaptionMode closedCaptionMode, Language language, Mode mode, SpeechSegmentConfig speechSegmentConfig, TranslationSettings translationSettings, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(closedCaptionMode, language, mode, (i13 & 8) != 0 ? null : speechSegmentConfig, (i13 & 16) != 0 ? null : translationSettings);
    }
}
