package io.getstream.android.video.generated.models;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.whoop.data.repositories.LanguageRepositoryKt;
import com.whoop.service.network.model.UserState;
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
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001aB)\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J2\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest;", "", "enableClosedCaptions", "", "language", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "transcriptionExternalStorage", "", "(Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;Ljava/lang/String;)V", "getEnableClosedCaptions", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLanguage", "()Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "getTranscriptionExternalStorage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;Ljava/lang/String;)Lio/getstream/android/video/generated/models/StartTranscriptionRequest;", "equals", "other", "hashCode", "", "toString", "Language", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
public final /* data */ class StartTranscriptionRequest {
    private final Boolean enableClosedCaptions;
    private final Language language;
    private final String transcriptionExternalStorage;

    @Metadata(m65680d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \f2\u00020\u0001:(\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001&0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTU¨\u0006V"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "Ar", "Auto", "Bg", "Ca", "Companion", "Cs", "Da", "De", "El", "En", "Es", "Et", "Fi", "Fr", "He", "Hi", "Hr", "Hu", "Id", "It", "Ja", "Ko", "LanguageAdapter", "Ms", "Nl", "No", "Pl", "Pt", "Ro", "Ru", "Sk", "Sl", "Sv", "Ta", "Th", "Tl", "Tr", "Uk", "Unknown", "Zh", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Ar;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Auto;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Bg;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Ca;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Cs;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Da;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$De;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$El;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$En;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Es;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Et;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Fi;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Fr;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$He;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Hi;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Hr;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Hu;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Id;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$It;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Ja;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Ko;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Ms;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Nl;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$No;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Pl;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Pt;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Ro;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Ru;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Sk;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Sl;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Sv;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Ta;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Th;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Tl;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Tr;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Uk;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Unknown;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Zh;", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
    public static abstract class Language {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String value;

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Ar */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Ar;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18782Ar extends Language {
            public static final C18782Ar INSTANCE = new C18782Ar();

            private C18782Ar() {
                super("ar", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Auto;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class Auto extends Language {
            public static final Auto INSTANCE = new Auto();

            private Auto() {
                super(UserState.Sources.AUTO, null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Bg */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Bg;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18783Bg extends Language {
            public static final C18783Bg INSTANCE = new C18783Bg();

            private C18783Bg() {
                super("bg", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Ca */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Ca;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18784Ca extends Language {
            public static final C18784Ca INSTANCE = new C18784Ca();

            private C18784Ca() {
                super("ca", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Companion;", "", "()V", "fromString", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "s", "", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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
                            return C18782Ar.INSTANCE;
                        }
                        break;
                    case 3141:
                        if (s13.equals("bg")) {
                            return C18783Bg.INSTANCE;
                        }
                        break;
                    case 3166:
                        if (s13.equals("ca")) {
                            return C18784Ca.INSTANCE;
                        }
                        break;
                    case 3184:
                        if (s13.equals("cs")) {
                            return C18785Cs.INSTANCE;
                        }
                        break;
                    case 3197:
                        if (s13.equals("da")) {
                            return C18786Da.INSTANCE;
                        }
                        break;
                    case 3201:
                        if (s13.equals("de")) {
                            return C18787De.INSTANCE;
                        }
                        break;
                    case 3239:
                        if (s13.equals("el")) {
                            return C18788El.INSTANCE;
                        }
                        break;
                    case 3241:
                        if (s13.equals(LanguageRepositoryKt.DEFAULT_LANGUAGE)) {
                            return C18789En.INSTANCE;
                        }
                        break;
                    case 3246:
                        if (s13.equals("es")) {
                            return C18790Es.INSTANCE;
                        }
                        break;
                    case 3247:
                        if (s13.equals("et")) {
                            return C18791Et.INSTANCE;
                        }
                        break;
                    case 3267:
                        if (s13.equals("fi")) {
                            return C18792Fi.INSTANCE;
                        }
                        break;
                    case 3276:
                        if (s13.equals("fr")) {
                            return C18793Fr.INSTANCE;
                        }
                        break;
                    case 3325:
                        if (s13.equals("he")) {
                            return C18794He.INSTANCE;
                        }
                        break;
                    case 3329:
                        if (s13.equals("hi")) {
                            return C18795Hi.INSTANCE;
                        }
                        break;
                    case 3338:
                        if (s13.equals("hr")) {
                            return C18796Hr.INSTANCE;
                        }
                        break;
                    case 3341:
                        if (s13.equals("hu")) {
                            return C18797Hu.INSTANCE;
                        }
                        break;
                    case 3355:
                        if (s13.equals("id")) {
                            return C18798Id.INSTANCE;
                        }
                        break;
                    case 3371:
                        if (s13.equals("it")) {
                            return C18799It.INSTANCE;
                        }
                        break;
                    case 3383:
                        if (s13.equals("ja")) {
                            return C18800Ja.INSTANCE;
                        }
                        break;
                    case 3428:
                        if (s13.equals("ko")) {
                            return C18801Ko.INSTANCE;
                        }
                        break;
                    case 3494:
                        if (s13.equals("ms")) {
                            return C18802Ms.INSTANCE;
                        }
                        break;
                    case 3518:
                        if (s13.equals("nl")) {
                            return C18803Nl.INSTANCE;
                        }
                        break;
                    case 3521:
                        if (s13.equals("no")) {
                            return C18804No.INSTANCE;
                        }
                        break;
                    case 3580:
                        if (s13.equals("pl")) {
                            return C18805Pl.INSTANCE;
                        }
                        break;
                    case 3588:
                        if (s13.equals("pt")) {
                            return C18806Pt.INSTANCE;
                        }
                        break;
                    case 3645:
                        if (s13.equals("ro")) {
                            return C18807Ro.INSTANCE;
                        }
                        break;
                    case 3651:
                        if (s13.equals("ru")) {
                            return C18808Ru.INSTANCE;
                        }
                        break;
                    case 3672:
                        if (s13.equals("sk")) {
                            return C18809Sk.INSTANCE;
                        }
                        break;
                    case 3673:
                        if (s13.equals("sl")) {
                            return C18810Sl.INSTANCE;
                        }
                        break;
                    case 3683:
                        if (s13.equals("sv")) {
                            return C18811Sv.INSTANCE;
                        }
                        break;
                    case 3693:
                        if (s13.equals("ta")) {
                            return C18812Ta.INSTANCE;
                        }
                        break;
                    case 3700:
                        if (s13.equals("th")) {
                            return C18813Th.INSTANCE;
                        }
                        break;
                    case 3704:
                        if (s13.equals("tl")) {
                            return C18814Tl.INSTANCE;
                        }
                        break;
                    case 3710:
                        if (s13.equals("tr")) {
                            return C18815Tr.INSTANCE;
                        }
                        break;
                    case 3734:
                        if (s13.equals("uk")) {
                            return C18816Uk.INSTANCE;
                        }
                        break;
                    case 3886:
                        if (s13.equals("zh")) {
                            return C18817Zh.INSTANCE;
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

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Cs */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Cs;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18785Cs extends Language {
            public static final C18785Cs INSTANCE = new C18785Cs();

            private C18785Cs() {
                super("cs", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Da */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Da;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18786Da extends Language {
            public static final C18786Da INSTANCE = new C18786Da();

            private C18786Da() {
                super("da", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$De */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$De;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18787De extends Language {
            public static final C18787De INSTANCE = new C18787De();

            private C18787De() {
                super("de", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$El */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$El;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18788El extends Language {
            public static final C18788El INSTANCE = new C18788El();

            private C18788El() {
                super("el", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$En */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$En;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18789En extends Language {
            public static final C18789En INSTANCE = new C18789En();

            private C18789En() {
                super(LanguageRepositoryKt.DEFAULT_LANGUAGE, null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Es */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Es;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18790Es extends Language {
            public static final C18790Es INSTANCE = new C18790Es();

            private C18790Es() {
                super("es", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Et */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Et;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18791Et extends Language {
            public static final C18791Et INSTANCE = new C18791Et();

            private C18791Et() {
                super("et", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Fi */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Fi;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18792Fi extends Language {
            public static final C18792Fi INSTANCE = new C18792Fi();

            private C18792Fi() {
                super("fi", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Fr */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Fr;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18793Fr extends Language {
            public static final C18793Fr INSTANCE = new C18793Fr();

            private C18793Fr() {
                super("fr", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$He */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$He;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18794He extends Language {
            public static final C18794He INSTANCE = new C18794He();

            private C18794He() {
                super("he", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Hi */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Hi;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18795Hi extends Language {
            public static final C18795Hi INSTANCE = new C18795Hi();

            private C18795Hi() {
                super("hi", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Hr */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Hr;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18796Hr extends Language {
            public static final C18796Hr INSTANCE = new C18796Hr();

            private C18796Hr() {
                super("hr", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Hu */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Hu;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18797Hu extends Language {
            public static final C18797Hu INSTANCE = new C18797Hu();

            private C18797Hu() {
                super("hu", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Id */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Id;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18798Id extends Language {
            public static final C18798Id INSTANCE = new C18798Id();

            private C18798Id() {
                super("id", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$It */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$It;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18799It extends Language {
            public static final C18799It INSTANCE = new C18799It();

            private C18799It() {
                super("it", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Ja */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Ja;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18800Ja extends Language {
            public static final C18800Ja INSTANCE = new C18800Ja();

            private C18800Ja() {
                super("ja", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Ko */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Ko;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18801Ko extends Language {
            public static final C18801Ko INSTANCE = new C18801Ko();

            private C18801Ko() {
                super("ko", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$LanguageAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "<init>", "()V", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "(Lcom/squareup/moshi/JsonReader;)Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "Lqx/c0;", "writer", "value", "Ll83/a0;", "toJson", "(Lqx/c0;Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;)V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Ms */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Ms;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18802Ms extends Language {
            public static final C18802Ms INSTANCE = new C18802Ms();

            private C18802Ms() {
                super("ms", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Nl */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Nl;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18803Nl extends Language {
            public static final C18803Nl INSTANCE = new C18803Nl();

            private C18803Nl() {
                super("nl", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$No */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$No;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18804No extends Language {
            public static final C18804No INSTANCE = new C18804No();

            private C18804No() {
                super("no", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Pl */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Pl;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18805Pl extends Language {
            public static final C18805Pl INSTANCE = new C18805Pl();

            private C18805Pl() {
                super("pl", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Pt */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Pt;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18806Pt extends Language {
            public static final C18806Pt INSTANCE = new C18806Pt();

            private C18806Pt() {
                super("pt", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Ro */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Ro;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18807Ro extends Language {
            public static final C18807Ro INSTANCE = new C18807Ro();

            private C18807Ro() {
                super("ro", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Ru */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Ru;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18808Ru extends Language {
            public static final C18808Ru INSTANCE = new C18808Ru();

            private C18808Ru() {
                super("ru", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Sk */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Sk;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18809Sk extends Language {
            public static final C18809Sk INSTANCE = new C18809Sk();

            private C18809Sk() {
                super("sk", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Sl */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Sl;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18810Sl extends Language {
            public static final C18810Sl INSTANCE = new C18810Sl();

            private C18810Sl() {
                super("sl", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Sv */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Sv;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18811Sv extends Language {
            public static final C18811Sv INSTANCE = new C18811Sv();

            private C18811Sv() {
                super("sv", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Ta */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Ta;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18812Ta extends Language {
            public static final C18812Ta INSTANCE = new C18812Ta();

            private C18812Ta() {
                super("ta", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Th */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Th;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18813Th extends Language {
            public static final C18813Th INSTANCE = new C18813Th();

            private C18813Th() {
                super("th", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Tl */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Tl;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18814Tl extends Language {
            public static final C18814Tl INSTANCE = new C18814Tl();

            private C18814Tl() {
                super("tl", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Tr */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Tr;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18815Tr extends Language {
            public static final C18815Tr INSTANCE = new C18815Tr();

            private C18815Tr() {
                super("tr", null);
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Uk */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Uk;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18816Uk extends Language {
            public static final C18816Uk INSTANCE = new C18816Uk();

            private C18816Uk() {
                super("uk", null);
            }
        }

        @Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Unknown;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "unknownValue", "", "(Ljava/lang/String;)V", "getUnknownValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
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

            @Override // io.getstream.android.video.generated.models.StartTranscriptionRequest.Language
            public String toString() {
                return AbstractC11895b.m31996o("Unknown(unknownValue=", this.unknownValue, ")");
            }
        }

        /* JADX INFO: renamed from: io.getstream.android.video.generated.models.StartTranscriptionRequest$Language$Zh */
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m65681d2 = {"Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language$Zh;", "Lio/getstream/android/video/generated/models/StartTranscriptionRequest$Language;", "()V", "stream-video-android-core_release"}, m65682k = 1, m65683mv = {1, 9, 0}, m65685xi = 48)
        public static final class C18817Zh extends Language {
            public static final C18817Zh INSTANCE = new C18817Zh();

            private C18817Zh() {
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

    public StartTranscriptionRequest() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ StartTranscriptionRequest copy$default(StartTranscriptionRequest startTranscriptionRequest, Boolean bool, Language language, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bool = startTranscriptionRequest.enableClosedCaptions;
        }
        if ((i13 & 2) != 0) {
            language = startTranscriptionRequest.language;
        }
        if ((i13 & 4) != 0) {
            str = startTranscriptionRequest.transcriptionExternalStorage;
        }
        return startTranscriptionRequest.copy(bool, language, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnableClosedCaptions() {
        return this.enableClosedCaptions;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Language getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTranscriptionExternalStorage() {
        return this.transcriptionExternalStorage;
    }

    public final StartTranscriptionRequest copy(@InterfaceC30731q(name = "enable_closed_captions") Boolean enableClosedCaptions, @InterfaceC30731q(name = "language") Language language, @InterfaceC30731q(name = "transcription_external_storage") String transcriptionExternalStorage) {
        return new StartTranscriptionRequest(enableClosedCaptions, language, transcriptionExternalStorage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartTranscriptionRequest)) {
            return false;
        }
        StartTranscriptionRequest startTranscriptionRequest = (StartTranscriptionRequest) other;
        return AbstractC22676k.m65745e(this.enableClosedCaptions, startTranscriptionRequest.enableClosedCaptions) && AbstractC22676k.m65745e(this.language, startTranscriptionRequest.language) && AbstractC22676k.m65745e(this.transcriptionExternalStorage, startTranscriptionRequest.transcriptionExternalStorage);
    }

    public final Boolean getEnableClosedCaptions() {
        return this.enableClosedCaptions;
    }

    public final Language getLanguage() {
        return this.language;
    }

    public final String getTranscriptionExternalStorage() {
        return this.transcriptionExternalStorage;
    }

    public int hashCode() {
        Boolean bool = this.enableClosedCaptions;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Language language = this.language;
        int iHashCode2 = (iHashCode + (language == null ? 0 : language.hashCode())) * 31;
        String str = this.transcriptionExternalStorage;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.enableClosedCaptions;
        Language language = this.language;
        String str = this.transcriptionExternalStorage;
        StringBuilder sb4 = new StringBuilder("StartTranscriptionRequest(enableClosedCaptions=");
        sb4.append(bool);
        sb4.append(", language=");
        sb4.append(language);
        sb4.append(", transcriptionExternalStorage=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }

    public StartTranscriptionRequest(@InterfaceC30731q(name = "enable_closed_captions") Boolean bool, @InterfaceC30731q(name = "language") Language language, @InterfaceC30731q(name = "transcription_external_storage") String str) {
        this.enableClosedCaptions = bool;
        this.language = language;
        this.transcriptionExternalStorage = str;
    }

    public /* synthetic */ StartTranscriptionRequest(Boolean bool, Language language, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : bool, (i13 & 2) != 0 ? null : language, (i13 & 4) != 0 ? null : str);
    }
}
