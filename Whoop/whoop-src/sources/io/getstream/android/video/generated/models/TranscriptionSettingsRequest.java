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
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003$%&BA\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006'"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest;", "", "closedCaptionMode", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode;", "language", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "mode", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode;", "speechSegmentConfig", "Lio/getstream/android/video/generated/models/SpeechSegmentConfig;", "translation", "Lio/getstream/android/video/generated/models/TranslationSettings;", "(Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode;Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode;Lio/getstream/android/video/generated/models/SpeechSegmentConfig;Lio/getstream/android/video/generated/models/TranslationSettings;)V", "getClosedCaptionMode", "()Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode;", "getLanguage", "()Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "getMode", "()Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode;", "getSpeechSegmentConfig", "()Lio/getstream/android/video/generated/models/SpeechSegmentConfig;", "getTranslation", "()Lio/getstream/android/video/generated/models/TranslationSettings;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ClosedCaptionMode", "Language", "Mode", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class TranscriptionSettingsRequest {
    private final ClosedCaptionMode closedCaptionMode;
    private final Language language;
    private final Mode mode;
    private final SpeechSegmentConfig speechSegmentConfig;
    private final TranslationSettings translation;

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000b2\u00020\u0001:\u0006\b\t\n\u000b\f\rB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "AutoOn", "Available", "ClosedCaptionModeAdapter", "Companion", "Disabled", "Unknown", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode$AutoOn;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode$Available;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode$Disabled;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode$Unknown;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static abstract class ClosedCaptionMode {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String value;

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode$AutoOn;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class AutoOn extends ClosedCaptionMode {
            public static final AutoOn INSTANCE = new AutoOn();

            private AutoOn() {
                super("auto-on", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode$Available;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Available extends ClosedCaptionMode {
            public static final Available INSTANCE = new Available();

            private Available() {
                super("available", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode$ClosedCaptionModeAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode;", "Lqx/c0;", "writer", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode;)V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode$Companion;", "", "()V", "fromString", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode;", "s", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode$Disabled;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Disabled extends ClosedCaptionMode {
            public static final Disabled INSTANCE = new Disabled();

            private Disabled() {
                super("disabled", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode$Unknown;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$ClosedCaptionMode;", "unknownValue", "", "(Ljava/lang/String;)V", "getUnknownValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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

            @Override // io.getstream.android.video.generated.models.TranscriptionSettingsRequest.ClosedCaptionMode
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

    @Metadata(m65680d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \f2\u00020\u0001:(\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001&0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTU¨\u0006V"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "Ar", "Auto", "Bg", "Ca", "Companion", "Cs", "Da", "De", "El", "En", "Es", "Et", "Fi", "Fr", "He", "Hi", "Hr", "Hu", "Id", "It", "Ja", "Ko", "LanguageAdapter", "Ms", "Nl", "No", "Pl", "Pt", "Ro", "Ru", "Sk", "Sl", "Sv", "Ta", "Th", "Tl", "Tr", "Uk", "Unknown", "Zh", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Ar;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Auto;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Bg;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Ca;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Cs;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Da;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$De;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$El;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$En;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Es;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Et;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Fi;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Fr;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$He;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Hi;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Hr;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Hu;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Id;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$It;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Ja;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Ko;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Ms;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Nl;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$No;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Pl;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Pt;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Ro;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Ru;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Sk;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Sl;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Sv;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Ta;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Th;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Tl;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Tr;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Uk;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Unknown;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Zh;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static abstract class Language {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String value;

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Ar */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Ar;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18818Ar extends Language {
            public static final C18818Ar INSTANCE = new C18818Ar();

            private C18818Ar() {
                super("ar", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Auto;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Auto extends Language {
            public static final Auto INSTANCE = new Auto();

            private Auto() {
                super(UserState.Sources.AUTO, null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Bg */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Bg;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18819Bg extends Language {
            public static final C18819Bg INSTANCE = new C18819Bg();

            private C18819Bg() {
                super("bg", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Ca */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Ca;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18820Ca extends Language {
            public static final C18820Ca INSTANCE = new C18820Ca();

            private C18820Ca() {
                super("ca", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Companion;", "", "()V", "fromString", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "s", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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
                            return C18818Ar.INSTANCE;
                        }
                        break;
                    case 3141:
                        if (s13.equals("bg")) {
                            return C18819Bg.INSTANCE;
                        }
                        break;
                    case 3166:
                        if (s13.equals("ca")) {
                            return C18820Ca.INSTANCE;
                        }
                        break;
                    case 3184:
                        if (s13.equals("cs")) {
                            return C18821Cs.INSTANCE;
                        }
                        break;
                    case 3197:
                        if (s13.equals("da")) {
                            return C18822Da.INSTANCE;
                        }
                        break;
                    case 3201:
                        if (s13.equals("de")) {
                            return C18823De.INSTANCE;
                        }
                        break;
                    case 3239:
                        if (s13.equals("el")) {
                            return C18824El.INSTANCE;
                        }
                        break;
                    case 3241:
                        if (s13.equals(LanguageRepositoryKt.DEFAULT_LANGUAGE)) {
                            return C18825En.INSTANCE;
                        }
                        break;
                    case 3246:
                        if (s13.equals("es")) {
                            return C18826Es.INSTANCE;
                        }
                        break;
                    case 3247:
                        if (s13.equals("et")) {
                            return C18827Et.INSTANCE;
                        }
                        break;
                    case 3267:
                        if (s13.equals("fi")) {
                            return C18828Fi.INSTANCE;
                        }
                        break;
                    case 3276:
                        if (s13.equals("fr")) {
                            return C18829Fr.INSTANCE;
                        }
                        break;
                    case 3325:
                        if (s13.equals("he")) {
                            return C18830He.INSTANCE;
                        }
                        break;
                    case 3329:
                        if (s13.equals("hi")) {
                            return C18831Hi.INSTANCE;
                        }
                        break;
                    case 3338:
                        if (s13.equals("hr")) {
                            return C18832Hr.INSTANCE;
                        }
                        break;
                    case 3341:
                        if (s13.equals("hu")) {
                            return C18833Hu.INSTANCE;
                        }
                        break;
                    case 3355:
                        if (s13.equals("id")) {
                            return C18834Id.INSTANCE;
                        }
                        break;
                    case 3371:
                        if (s13.equals("it")) {
                            return C18835It.INSTANCE;
                        }
                        break;
                    case 3383:
                        if (s13.equals("ja")) {
                            return C18836Ja.INSTANCE;
                        }
                        break;
                    case 3428:
                        if (s13.equals("ko")) {
                            return C18837Ko.INSTANCE;
                        }
                        break;
                    case 3494:
                        if (s13.equals("ms")) {
                            return C18838Ms.INSTANCE;
                        }
                        break;
                    case 3518:
                        if (s13.equals("nl")) {
                            return C18839Nl.INSTANCE;
                        }
                        break;
                    case 3521:
                        if (s13.equals("no")) {
                            return C18840No.INSTANCE;
                        }
                        break;
                    case 3580:
                        if (s13.equals("pl")) {
                            return C18841Pl.INSTANCE;
                        }
                        break;
                    case 3588:
                        if (s13.equals("pt")) {
                            return C18842Pt.INSTANCE;
                        }
                        break;
                    case 3645:
                        if (s13.equals("ro")) {
                            return C18843Ro.INSTANCE;
                        }
                        break;
                    case 3651:
                        if (s13.equals("ru")) {
                            return C18844Ru.INSTANCE;
                        }
                        break;
                    case 3672:
                        if (s13.equals("sk")) {
                            return C18845Sk.INSTANCE;
                        }
                        break;
                    case 3673:
                        if (s13.equals("sl")) {
                            return C18846Sl.INSTANCE;
                        }
                        break;
                    case 3683:
                        if (s13.equals("sv")) {
                            return C18847Sv.INSTANCE;
                        }
                        break;
                    case 3693:
                        if (s13.equals("ta")) {
                            return C18848Ta.INSTANCE;
                        }
                        break;
                    case 3700:
                        if (s13.equals("th")) {
                            return C18849Th.INSTANCE;
                        }
                        break;
                    case 3704:
                        if (s13.equals("tl")) {
                            return C18850Tl.INSTANCE;
                        }
                        break;
                    case 3710:
                        if (s13.equals("tr")) {
                            return C18851Tr.INSTANCE;
                        }
                        break;
                    case 3734:
                        if (s13.equals("uk")) {
                            return C18852Uk.INSTANCE;
                        }
                        break;
                    case 3886:
                        if (s13.equals("zh")) {
                            return C18853Zh.INSTANCE;
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

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Cs */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Cs;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18821Cs extends Language {
            public static final C18821Cs INSTANCE = new C18821Cs();

            private C18821Cs() {
                super("cs", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Da */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Da;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18822Da extends Language {
            public static final C18822Da INSTANCE = new C18822Da();

            private C18822Da() {
                super("da", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$De */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$De;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18823De extends Language {
            public static final C18823De INSTANCE = new C18823De();

            private C18823De() {
                super("de", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$El */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$El;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18824El extends Language {
            public static final C18824El INSTANCE = new C18824El();

            private C18824El() {
                super("el", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$En */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$En;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18825En extends Language {
            public static final C18825En INSTANCE = new C18825En();

            private C18825En() {
                super(LanguageRepositoryKt.DEFAULT_LANGUAGE, null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Es */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Es;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18826Es extends Language {
            public static final C18826Es INSTANCE = new C18826Es();

            private C18826Es() {
                super("es", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Et */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Et;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18827Et extends Language {
            public static final C18827Et INSTANCE = new C18827Et();

            private C18827Et() {
                super("et", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Fi */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Fi;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18828Fi extends Language {
            public static final C18828Fi INSTANCE = new C18828Fi();

            private C18828Fi() {
                super("fi", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Fr */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Fr;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18829Fr extends Language {
            public static final C18829Fr INSTANCE = new C18829Fr();

            private C18829Fr() {
                super("fr", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$He */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$He;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18830He extends Language {
            public static final C18830He INSTANCE = new C18830He();

            private C18830He() {
                super("he", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Hi */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Hi;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18831Hi extends Language {
            public static final C18831Hi INSTANCE = new C18831Hi();

            private C18831Hi() {
                super("hi", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Hr */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Hr;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18832Hr extends Language {
            public static final C18832Hr INSTANCE = new C18832Hr();

            private C18832Hr() {
                super("hr", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Hu */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Hu;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18833Hu extends Language {
            public static final C18833Hu INSTANCE = new C18833Hu();

            private C18833Hu() {
                super("hu", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Id */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Id;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18834Id extends Language {
            public static final C18834Id INSTANCE = new C18834Id();

            private C18834Id() {
                super("id", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$It */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$It;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18835It extends Language {
            public static final C18835It INSTANCE = new C18835It();

            private C18835It() {
                super("it", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Ja */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Ja;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18836Ja extends Language {
            public static final C18836Ja INSTANCE = new C18836Ja();

            private C18836Ja() {
                super("ja", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Ko */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Ko;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18837Ko extends Language {
            public static final C18837Ko INSTANCE = new C18837Ko();

            private C18837Ko() {
                super("ko", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$LanguageAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "Lqx/c0;", "writer", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;)V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Ms */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Ms;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18838Ms extends Language {
            public static final C18838Ms INSTANCE = new C18838Ms();

            private C18838Ms() {
                super("ms", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Nl */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Nl;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18839Nl extends Language {
            public static final C18839Nl INSTANCE = new C18839Nl();

            private C18839Nl() {
                super("nl", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$No */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$No;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18840No extends Language {
            public static final C18840No INSTANCE = new C18840No();

            private C18840No() {
                super("no", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Pl */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Pl;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18841Pl extends Language {
            public static final C18841Pl INSTANCE = new C18841Pl();

            private C18841Pl() {
                super("pl", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Pt */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Pt;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18842Pt extends Language {
            public static final C18842Pt INSTANCE = new C18842Pt();

            private C18842Pt() {
                super("pt", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Ro */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Ro;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18843Ro extends Language {
            public static final C18843Ro INSTANCE = new C18843Ro();

            private C18843Ro() {
                super("ro", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Ru */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Ru;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18844Ru extends Language {
            public static final C18844Ru INSTANCE = new C18844Ru();

            private C18844Ru() {
                super("ru", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Sk */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Sk;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18845Sk extends Language {
            public static final C18845Sk INSTANCE = new C18845Sk();

            private C18845Sk() {
                super("sk", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Sl */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Sl;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18846Sl extends Language {
            public static final C18846Sl INSTANCE = new C18846Sl();

            private C18846Sl() {
                super("sl", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Sv */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Sv;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18847Sv extends Language {
            public static final C18847Sv INSTANCE = new C18847Sv();

            private C18847Sv() {
                super("sv", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Ta */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Ta;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18848Ta extends Language {
            public static final C18848Ta INSTANCE = new C18848Ta();

            private C18848Ta() {
                super("ta", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Th */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Th;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18849Th extends Language {
            public static final C18849Th INSTANCE = new C18849Th();

            private C18849Th() {
                super("th", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Tl */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Tl;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18850Tl extends Language {
            public static final C18850Tl INSTANCE = new C18850Tl();

            private C18850Tl() {
                super("tl", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Tr */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Tr;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18851Tr extends Language {
            public static final C18851Tr INSTANCE = new C18851Tr();

            private C18851Tr() {
                super("tr", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Uk */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Uk;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18852Uk extends Language {
            public static final C18852Uk INSTANCE = new C18852Uk();

            private C18852Uk() {
                super("uk", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Unknown;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "unknownValue", "", "(Ljava/lang/String;)V", "getUnknownValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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

            @Override // io.getstream.android.video.generated.models.TranscriptionSettingsRequest.Language
            public String toString() {
                return AbstractC11895b.m31996o("Unknown(unknownValue=", this.unknownValue, ")");
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.TranscriptionSettingsRequest$Language$Zh */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language$Zh;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18853Zh extends Language {
            public static final C18853Zh INSTANCE = new C18853Zh();

            private C18853Zh() {
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

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \n2\u00020\u0001:\u0006\b\t\n\u000b\f\rB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "AutoOn", "Available", "Companion", "Disabled", "ModeAdapter", "Unknown", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$AutoOn;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$Available;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$Disabled;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$Unknown;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static abstract class Mode {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String value;

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$AutoOn;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class AutoOn extends Mode {
            public static final AutoOn INSTANCE = new AutoOn();

            private AutoOn() {
                super("auto-on", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$Available;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Available extends Mode {
            public static final Available INSTANCE = new Available();

            private Available() {
                super("available", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$Companion;", "", "()V", "fromString", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode;", "s", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$Disabled;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Disabled extends Mode {
            public static final Disabled INSTANCE = new Disabled();

            private Disabled() {
                super("disabled", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$ModeAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode;", "Lqx/c0;", "writer", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode;)V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode$Unknown;", "Lio/getstream/android/video/generated/models/TranscriptionSettingsRequest$Mode;", "unknownValue", "", "(Ljava/lang/String;)V", "getUnknownValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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

            @Override // io.getstream.android.video.generated.models.TranscriptionSettingsRequest.Mode
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

    public TranscriptionSettingsRequest() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ TranscriptionSettingsRequest copy$default(TranscriptionSettingsRequest transcriptionSettingsRequest, ClosedCaptionMode closedCaptionMode, Language language, Mode mode, SpeechSegmentConfig speechSegmentConfig, TranslationSettings translationSettings, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            closedCaptionMode = transcriptionSettingsRequest.closedCaptionMode;
        }
        if ((i13 & 2) != 0) {
            language = transcriptionSettingsRequest.language;
        }
        if ((i13 & 4) != 0) {
            mode = transcriptionSettingsRequest.mode;
        }
        if ((i13 & 8) != 0) {
            speechSegmentConfig = transcriptionSettingsRequest.speechSegmentConfig;
        }
        if ((i13 & 16) != 0) {
            translationSettings = transcriptionSettingsRequest.translation;
        }
        TranslationSettings translationSettings2 = translationSettings;
        Mode mode2 = mode;
        return transcriptionSettingsRequest.copy(closedCaptionMode, language, mode2, speechSegmentConfig, translationSettings2);
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

    public final TranscriptionSettingsRequest copy(@InterfaceC30731q(name = "closed_caption_mode") ClosedCaptionMode closedCaptionMode, @InterfaceC30731q(name = "language") Language language, @InterfaceC30731q(name = "mode") Mode mode, @InterfaceC30731q(name = "speech_segment_config") SpeechSegmentConfig speechSegmentConfig, @InterfaceC30731q(name = "translation") TranslationSettings translation) {
        return new TranscriptionSettingsRequest(closedCaptionMode, language, mode, speechSegmentConfig, translation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TranscriptionSettingsRequest)) {
            return false;
        }
        TranscriptionSettingsRequest transcriptionSettingsRequest = (TranscriptionSettingsRequest) other;
        return AbstractC22676k.m65745e(this.closedCaptionMode, transcriptionSettingsRequest.closedCaptionMode) && AbstractC22676k.m65745e(this.language, transcriptionSettingsRequest.language) && AbstractC22676k.m65745e(this.mode, transcriptionSettingsRequest.mode) && AbstractC22676k.m65745e(this.speechSegmentConfig, transcriptionSettingsRequest.speechSegmentConfig) && AbstractC22676k.m65745e(this.translation, transcriptionSettingsRequest.translation);
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
        ClosedCaptionMode closedCaptionMode = this.closedCaptionMode;
        int iHashCode = (closedCaptionMode == null ? 0 : closedCaptionMode.hashCode()) * 31;
        Language language = this.language;
        int iHashCode2 = (iHashCode + (language == null ? 0 : language.hashCode())) * 31;
        Mode mode = this.mode;
        int iHashCode3 = (iHashCode2 + (mode == null ? 0 : mode.hashCode())) * 31;
        SpeechSegmentConfig speechSegmentConfig = this.speechSegmentConfig;
        int iHashCode4 = (iHashCode3 + (speechSegmentConfig == null ? 0 : speechSegmentConfig.hashCode())) * 31;
        TranslationSettings translationSettings = this.translation;
        return iHashCode4 + (translationSettings != null ? translationSettings.hashCode() : 0);
    }

    public String toString() {
        return "TranscriptionSettingsRequest(closedCaptionMode=" + this.closedCaptionMode + ", language=" + this.language + ", mode=" + this.mode + ", speechSegmentConfig=" + this.speechSegmentConfig + ", translation=" + this.translation + ")";
    }

    public TranscriptionSettingsRequest(@InterfaceC30731q(name = "closed_caption_mode") ClosedCaptionMode closedCaptionMode, @InterfaceC30731q(name = "language") Language language, @InterfaceC30731q(name = "mode") Mode mode, @InterfaceC30731q(name = "speech_segment_config") SpeechSegmentConfig speechSegmentConfig, @InterfaceC30731q(name = "translation") TranslationSettings translationSettings) {
        this.closedCaptionMode = closedCaptionMode;
        this.language = language;
        this.mode = mode;
        this.speechSegmentConfig = speechSegmentConfig;
        this.translation = translationSettings;
    }

    public /* synthetic */ TranscriptionSettingsRequest(ClosedCaptionMode closedCaptionMode, Language language, Mode mode, SpeechSegmentConfig speechSegmentConfig, TranslationSettings translationSettings, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : closedCaptionMode, (i13 & 2) != 0 ? null : language, (i13 & 4) != 0 ? null : mode, (i13 & 8) != 0 ? null : speechSegmentConfig, (i13 & 16) != 0 ? null : translationSettings);
    }
}
