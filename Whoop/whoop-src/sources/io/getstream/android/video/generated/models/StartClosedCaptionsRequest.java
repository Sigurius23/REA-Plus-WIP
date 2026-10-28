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
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001fB5\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J>\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest;", "", "enableTranscription", "", "externalStorage", "", "language", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "speechSegmentConfig", "Lio/getstream/android/video/generated/models/SpeechSegmentConfig;", "(Ljava/lang/Boolean;Ljava/lang/String;Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;Lio/getstream/android/video/generated/models/SpeechSegmentConfig;)V", "getEnableTranscription", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getExternalStorage", "()Ljava/lang/String;", "getLanguage", "()Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "getSpeechSegmentConfig", "()Lio/getstream/android/video/generated/models/SpeechSegmentConfig;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;Lio/getstream/android/video/generated/models/SpeechSegmentConfig;)Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest;", "equals", "other", "hashCode", "", "toString", "Language", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class StartClosedCaptionsRequest {
    private final Boolean enableTranscription;
    private final String externalStorage;
    private final Language language;
    private final SpeechSegmentConfig speechSegmentConfig;

    @Metadata(m65680d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \f2\u00020\u0001:(\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001&0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTU¨\u0006V"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "Ar", "Auto", "Bg", "Ca", "Companion", "Cs", "Da", "De", "El", "En", "Es", "Et", "Fi", "Fr", "He", "Hi", "Hr", "Hu", "Id", "It", "Ja", "Ko", "LanguageAdapter", "Ms", "Nl", "No", "Pl", "Pt", "Ro", "Ru", "Sk", "Sl", "Sv", "Ta", "Th", "Tl", "Tr", "Uk", "Unknown", "Zh", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ar;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Auto;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Bg;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ca;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Cs;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Da;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$De;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$El;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$En;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Es;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Et;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Fi;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Fr;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$He;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Hi;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Hr;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Hu;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Id;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$It;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ja;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ko;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ms;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Nl;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$No;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Pl;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Pt;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ro;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ru;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Sk;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Sl;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Sv;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ta;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Th;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Tl;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Tr;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Uk;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Unknown;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Zh;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static abstract class Language {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String value;

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Ar */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ar;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18746Ar extends Language {
            public static final C18746Ar INSTANCE = new C18746Ar();

            private C18746Ar() {
                super("ar", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Auto;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Auto extends Language {
            public static final Auto INSTANCE = new Auto();

            private Auto() {
                super(UserState.Sources.AUTO, null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Bg */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Bg;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18747Bg extends Language {
            public static final C18747Bg INSTANCE = new C18747Bg();

            private C18747Bg() {
                super("bg", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Ca */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ca;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18748Ca extends Language {
            public static final C18748Ca INSTANCE = new C18748Ca();

            private C18748Ca() {
                super("ca", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Companion;", "", "()V", "fromString", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "s", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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
                            return C18746Ar.INSTANCE;
                        }
                        break;
                    case 3141:
                        if (s13.equals("bg")) {
                            return C18747Bg.INSTANCE;
                        }
                        break;
                    case 3166:
                        if (s13.equals("ca")) {
                            return C18748Ca.INSTANCE;
                        }
                        break;
                    case 3184:
                        if (s13.equals("cs")) {
                            return C18749Cs.INSTANCE;
                        }
                        break;
                    case 3197:
                        if (s13.equals("da")) {
                            return C18750Da.INSTANCE;
                        }
                        break;
                    case 3201:
                        if (s13.equals("de")) {
                            return C18751De.INSTANCE;
                        }
                        break;
                    case 3239:
                        if (s13.equals("el")) {
                            return C18752El.INSTANCE;
                        }
                        break;
                    case 3241:
                        if (s13.equals(LanguageRepositoryKt.DEFAULT_LANGUAGE)) {
                            return C18753En.INSTANCE;
                        }
                        break;
                    case 3246:
                        if (s13.equals("es")) {
                            return C18754Es.INSTANCE;
                        }
                        break;
                    case 3247:
                        if (s13.equals("et")) {
                            return C18755Et.INSTANCE;
                        }
                        break;
                    case 3267:
                        if (s13.equals("fi")) {
                            return C18756Fi.INSTANCE;
                        }
                        break;
                    case 3276:
                        if (s13.equals("fr")) {
                            return C18757Fr.INSTANCE;
                        }
                        break;
                    case 3325:
                        if (s13.equals("he")) {
                            return C18758He.INSTANCE;
                        }
                        break;
                    case 3329:
                        if (s13.equals("hi")) {
                            return C18759Hi.INSTANCE;
                        }
                        break;
                    case 3338:
                        if (s13.equals("hr")) {
                            return C18760Hr.INSTANCE;
                        }
                        break;
                    case 3341:
                        if (s13.equals("hu")) {
                            return C18761Hu.INSTANCE;
                        }
                        break;
                    case 3355:
                        if (s13.equals("id")) {
                            return C18762Id.INSTANCE;
                        }
                        break;
                    case 3371:
                        if (s13.equals("it")) {
                            return C18763It.INSTANCE;
                        }
                        break;
                    case 3383:
                        if (s13.equals("ja")) {
                            return C18764Ja.INSTANCE;
                        }
                        break;
                    case 3428:
                        if (s13.equals("ko")) {
                            return C18765Ko.INSTANCE;
                        }
                        break;
                    case 3494:
                        if (s13.equals("ms")) {
                            return C18766Ms.INSTANCE;
                        }
                        break;
                    case 3518:
                        if (s13.equals("nl")) {
                            return C18767Nl.INSTANCE;
                        }
                        break;
                    case 3521:
                        if (s13.equals("no")) {
                            return C18768No.INSTANCE;
                        }
                        break;
                    case 3580:
                        if (s13.equals("pl")) {
                            return C18769Pl.INSTANCE;
                        }
                        break;
                    case 3588:
                        if (s13.equals("pt")) {
                            return C18770Pt.INSTANCE;
                        }
                        break;
                    case 3645:
                        if (s13.equals("ro")) {
                            return C18771Ro.INSTANCE;
                        }
                        break;
                    case 3651:
                        if (s13.equals("ru")) {
                            return C18772Ru.INSTANCE;
                        }
                        break;
                    case 3672:
                        if (s13.equals("sk")) {
                            return C18773Sk.INSTANCE;
                        }
                        break;
                    case 3673:
                        if (s13.equals("sl")) {
                            return C18774Sl.INSTANCE;
                        }
                        break;
                    case 3683:
                        if (s13.equals("sv")) {
                            return C18775Sv.INSTANCE;
                        }
                        break;
                    case 3693:
                        if (s13.equals("ta")) {
                            return C18776Ta.INSTANCE;
                        }
                        break;
                    case 3700:
                        if (s13.equals("th")) {
                            return C18777Th.INSTANCE;
                        }
                        break;
                    case 3704:
                        if (s13.equals("tl")) {
                            return C18778Tl.INSTANCE;
                        }
                        break;
                    case 3710:
                        if (s13.equals("tr")) {
                            return C18779Tr.INSTANCE;
                        }
                        break;
                    case 3734:
                        if (s13.equals("uk")) {
                            return C18780Uk.INSTANCE;
                        }
                        break;
                    case 3886:
                        if (s13.equals("zh")) {
                            return C18781Zh.INSTANCE;
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

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Cs */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Cs;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18749Cs extends Language {
            public static final C18749Cs INSTANCE = new C18749Cs();

            private C18749Cs() {
                super("cs", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Da */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Da;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18750Da extends Language {
            public static final C18750Da INSTANCE = new C18750Da();

            private C18750Da() {
                super("da", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$De */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$De;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18751De extends Language {
            public static final C18751De INSTANCE = new C18751De();

            private C18751De() {
                super("de", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$El */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$El;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18752El extends Language {
            public static final C18752El INSTANCE = new C18752El();

            private C18752El() {
                super("el", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$En */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$En;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18753En extends Language {
            public static final C18753En INSTANCE = new C18753En();

            private C18753En() {
                super(LanguageRepositoryKt.DEFAULT_LANGUAGE, null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Es */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Es;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18754Es extends Language {
            public static final C18754Es INSTANCE = new C18754Es();

            private C18754Es() {
                super("es", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Et */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Et;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18755Et extends Language {
            public static final C18755Et INSTANCE = new C18755Et();

            private C18755Et() {
                super("et", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Fi */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Fi;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18756Fi extends Language {
            public static final C18756Fi INSTANCE = new C18756Fi();

            private C18756Fi() {
                super("fi", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Fr */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Fr;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18757Fr extends Language {
            public static final C18757Fr INSTANCE = new C18757Fr();

            private C18757Fr() {
                super("fr", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$He */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$He;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18758He extends Language {
            public static final C18758He INSTANCE = new C18758He();

            private C18758He() {
                super("he", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Hi */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Hi;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18759Hi extends Language {
            public static final C18759Hi INSTANCE = new C18759Hi();

            private C18759Hi() {
                super("hi", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Hr */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Hr;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18760Hr extends Language {
            public static final C18760Hr INSTANCE = new C18760Hr();

            private C18760Hr() {
                super("hr", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Hu */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Hu;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18761Hu extends Language {
            public static final C18761Hu INSTANCE = new C18761Hu();

            private C18761Hu() {
                super("hu", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Id */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Id;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18762Id extends Language {
            public static final C18762Id INSTANCE = new C18762Id();

            private C18762Id() {
                super("id", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$It */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$It;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18763It extends Language {
            public static final C18763It INSTANCE = new C18763It();

            private C18763It() {
                super("it", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Ja */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ja;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18764Ja extends Language {
            public static final C18764Ja INSTANCE = new C18764Ja();

            private C18764Ja() {
                super("ja", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Ko */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ko;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18765Ko extends Language {
            public static final C18765Ko INSTANCE = new C18765Ko();

            private C18765Ko() {
                super("ko", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$LanguageAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "Lqx/c0;", "writer", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;)V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Ms */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ms;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18766Ms extends Language {
            public static final C18766Ms INSTANCE = new C18766Ms();

            private C18766Ms() {
                super("ms", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Nl */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Nl;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18767Nl extends Language {
            public static final C18767Nl INSTANCE = new C18767Nl();

            private C18767Nl() {
                super("nl", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$No */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$No;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18768No extends Language {
            public static final C18768No INSTANCE = new C18768No();

            private C18768No() {
                super("no", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Pl */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Pl;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18769Pl extends Language {
            public static final C18769Pl INSTANCE = new C18769Pl();

            private C18769Pl() {
                super("pl", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Pt */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Pt;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18770Pt extends Language {
            public static final C18770Pt INSTANCE = new C18770Pt();

            private C18770Pt() {
                super("pt", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Ro */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ro;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18771Ro extends Language {
            public static final C18771Ro INSTANCE = new C18771Ro();

            private C18771Ro() {
                super("ro", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Ru */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ru;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18772Ru extends Language {
            public static final C18772Ru INSTANCE = new C18772Ru();

            private C18772Ru() {
                super("ru", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Sk */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Sk;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18773Sk extends Language {
            public static final C18773Sk INSTANCE = new C18773Sk();

            private C18773Sk() {
                super("sk", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Sl */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Sl;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18774Sl extends Language {
            public static final C18774Sl INSTANCE = new C18774Sl();

            private C18774Sl() {
                super("sl", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Sv */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Sv;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18775Sv extends Language {
            public static final C18775Sv INSTANCE = new C18775Sv();

            private C18775Sv() {
                super("sv", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Ta */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Ta;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18776Ta extends Language {
            public static final C18776Ta INSTANCE = new C18776Ta();

            private C18776Ta() {
                super("ta", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Th */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Th;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18777Th extends Language {
            public static final C18777Th INSTANCE = new C18777Th();

            private C18777Th() {
                super("th", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Tl */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Tl;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18778Tl extends Language {
            public static final C18778Tl INSTANCE = new C18778Tl();

            private C18778Tl() {
                super("tl", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Tr */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Tr;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18779Tr extends Language {
            public static final C18779Tr INSTANCE = new C18779Tr();

            private C18779Tr() {
                super("tr", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Uk */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Uk;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18780Uk extends Language {
            public static final C18780Uk INSTANCE = new C18780Uk();

            private C18780Uk() {
                super("uk", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Unknown;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "unknownValue", "", "(Ljava/lang/String;)V", "getUnknownValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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

            @Override // io.getstream.android.video.generated.models.StartClosedCaptionsRequest.Language
            public String toString() {
                return AbstractC11895b.m31996o("Unknown(unknownValue=", this.unknownValue, ")");
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartClosedCaptionsRequest$Language$Zh */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language$Zh;", "Lio/getstream/android/video/generated/models/StartClosedCaptionsRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18781Zh extends Language {
            public static final C18781Zh INSTANCE = new C18781Zh();

            private C18781Zh() {
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

    public StartClosedCaptionsRequest() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ StartClosedCaptionsRequest copy$default(StartClosedCaptionsRequest startClosedCaptionsRequest, Boolean bool, String str, Language language, SpeechSegmentConfig speechSegmentConfig, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bool = startClosedCaptionsRequest.enableTranscription;
        }
        if ((i13 & 2) != 0) {
            str = startClosedCaptionsRequest.externalStorage;
        }
        if ((i13 & 4) != 0) {
            language = startClosedCaptionsRequest.language;
        }
        if ((i13 & 8) != 0) {
            speechSegmentConfig = startClosedCaptionsRequest.speechSegmentConfig;
        }
        return startClosedCaptionsRequest.copy(bool, str, language, speechSegmentConfig);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnableTranscription() {
        return this.enableTranscription;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExternalStorage() {
        return this.externalStorage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Language getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SpeechSegmentConfig getSpeechSegmentConfig() {
        return this.speechSegmentConfig;
    }

    public final StartClosedCaptionsRequest copy(@InterfaceC30731q(name = "enable_transcription") Boolean enableTranscription, @InterfaceC30731q(name = "external_storage") String externalStorage, @InterfaceC30731q(name = "language") Language language, @InterfaceC30731q(name = "speech_segment_config") SpeechSegmentConfig speechSegmentConfig) {
        return new StartClosedCaptionsRequest(enableTranscription, externalStorage, language, speechSegmentConfig);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartClosedCaptionsRequest)) {
            return false;
        }
        StartClosedCaptionsRequest startClosedCaptionsRequest = (StartClosedCaptionsRequest) other;
        return AbstractC22676k.m65745e(this.enableTranscription, startClosedCaptionsRequest.enableTranscription) && AbstractC22676k.m65745e(this.externalStorage, startClosedCaptionsRequest.externalStorage) && AbstractC22676k.m65745e(this.language, startClosedCaptionsRequest.language) && AbstractC22676k.m65745e(this.speechSegmentConfig, startClosedCaptionsRequest.speechSegmentConfig);
    }

    public final Boolean getEnableTranscription() {
        return this.enableTranscription;
    }

    public final String getExternalStorage() {
        return this.externalStorage;
    }

    public final Language getLanguage() {
        return this.language;
    }

    public final SpeechSegmentConfig getSpeechSegmentConfig() {
        return this.speechSegmentConfig;
    }

    public int hashCode() {
        Boolean bool = this.enableTranscription;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.externalStorage;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Language language = this.language;
        int iHashCode3 = (iHashCode2 + (language == null ? 0 : language.hashCode())) * 31;
        SpeechSegmentConfig speechSegmentConfig = this.speechSegmentConfig;
        return iHashCode3 + (speechSegmentConfig != null ? speechSegmentConfig.hashCode() : 0);
    }

    public String toString() {
        return "StartClosedCaptionsRequest(enableTranscription=" + this.enableTranscription + ", externalStorage=" + this.externalStorage + ", language=" + this.language + ", speechSegmentConfig=" + this.speechSegmentConfig + ")";
    }

    public StartClosedCaptionsRequest(@InterfaceC30731q(name = "enable_transcription") Boolean bool, @InterfaceC30731q(name = "external_storage") String str, @InterfaceC30731q(name = "language") Language language, @InterfaceC30731q(name = "speech_segment_config") SpeechSegmentConfig speechSegmentConfig) {
        this.enableTranscription = bool;
        this.externalStorage = str;
        this.language = language;
        this.speechSegmentConfig = speechSegmentConfig;
    }

    public /* synthetic */ StartClosedCaptionsRequest(Boolean bool, String str, Language language, SpeechSegmentConfig speechSegmentConfig, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : bool, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : language, (i13 & 8) != 0 ? null : speechSegmentConfig);
    }
}
