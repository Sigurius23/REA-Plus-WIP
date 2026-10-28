package com.amplitude.android.engagement;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Locale;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.InterfaceC23457c;
import p000.AbstractC11266d;
import p197hj.EnumC17339v;
import p197hj.EnumC17340w;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0003:;<BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBW\b\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J(\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÇ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JR\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u001dJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001d\"\u0004\b0\u00101R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u001d\"\u0004\b3\u00101R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010.\u001a\u0004\b4\u0010\u001d\"\u0004\b5\u00101R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b6\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010\"¨\u0006="}, m65681d2 = {"Lcom/amplitude/android/engagement/AmplitudeInitOptions;", "", "Lhj/w;", "serverZone", "", "serverUrl", "cdnUrl", "mediaUrl", "locale", "Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;", "options", "<init>", "(Lhj/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILhj/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/AmplitudeInitOptions;Lzc3/c;Lyc3/g;)V", "component1", "()Lhj/w;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "()Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;", "copy", "(Lhj/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;)Lcom/amplitude/android/engagement/AmplitudeInitOptions;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhj/w;", "getServerZone", "Ljava/lang/String;", "getServerUrl", "setServerUrl", "(Ljava/lang/String;)V", "getCdnUrl", "setCdnUrl", "getMediaUrl", "setMediaUrl", "getLocale", "Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;", "getOptions", "Companion", "$serializer", "com/amplitude/android/engagement/b", "Options", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AmplitudeInitOptions {
    public static final int $stable = 8;
    private String cdnUrl;
    private final String locale;
    private String mediaUrl;
    private final Options options;
    private String serverUrl;
    private final EnumC17340w serverZone;
    public static final C4862b Companion = new C4862b();
    private static final InterfaceC37138c[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.amplitude.android.engagement.AmplitudeServerZone", EnumC17340w.values()), null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\u0014¨\u0006%"}, m65681d2 = {"Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;", "", "Lhj/v;", "logLevel", "<init>", "(Lhj/v;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILhj/v;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;Lzc3/c;Lyc3/g;)V", "component1", "()Lhj/v;", "copy", "(Lhj/v;)Lcom/amplitude/android/engagement/AmplitudeInitOptions$Options;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lhj/v;", "getLogLevel", "Companion", "$serializer", "com/amplitude/android/engagement/c", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class Options {
        public static final int $stable = 0;
        private final EnumC17339v logLevel;
        public static final C4863c Companion = new C4863c();
        private static final InterfaceC37138c[] $childSerializers = {EnumsKt.createSimpleEnumSerializer("com.amplitude.android.engagement.AmplitudeLogLevel", EnumC17339v.values())};

        /* JADX WARN: Multi-variable type inference failed */
        public Options() {
            this((EnumC17339v) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ Options copy$default(Options options, EnumC17339v enumC17339v, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                enumC17339v = options.logLevel;
            }
            return options.copy(enumC17339v);
        }

        public static final /* synthetic */ void write$Self(Options self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
            if (!output.shouldEncodeElementDefault(serialDesc, 0) && self.logLevel == EnumC17339v.WARN) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 0, interfaceC37138cArr[0], self.logLevel);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final EnumC17339v getLogLevel() {
            return this.logLevel;
        }

        public final Options copy(EnumC17339v logLevel) {
            AbstractC22676k.m65750j(logLevel, "logLevel");
            return new Options(logLevel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Options) && this.logLevel == ((Options) other).logLevel;
        }

        public final EnumC17339v getLogLevel() {
            return this.logLevel;
        }

        public int hashCode() {
            return this.logLevel.hashCode();
        }

        public String toString() {
            return "Options(logLevel=" + this.logLevel + ')';
        }

        @InterfaceC23457c
        public /* synthetic */ Options(int i13, EnumC17339v enumC17339v, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i13 & 1) == 0) {
                this.logLevel = EnumC17339v.WARN;
            } else {
                this.logLevel = enumC17339v;
            }
        }

        public Options(EnumC17339v logLevel) {
            AbstractC22676k.m65750j(logLevel, "logLevel");
            this.logLevel = logLevel;
        }

        public /* synthetic */ Options(EnumC17339v enumC17339v, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? EnumC17339v.WARN : enumC17339v);
        }
    }

    public AmplitudeInitOptions() {
        this((EnumC17340w) null, (String) null, (String) null, (String) null, (String) null, (Options) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ AmplitudeInitOptions copy$default(AmplitudeInitOptions amplitudeInitOptions, EnumC17340w enumC17340w, String str, String str2, String str3, String str4, Options options, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC17340w = amplitudeInitOptions.serverZone;
        }
        if ((i13 & 2) != 0) {
            str = amplitudeInitOptions.serverUrl;
        }
        if ((i13 & 4) != 0) {
            str2 = amplitudeInitOptions.cdnUrl;
        }
        if ((i13 & 8) != 0) {
            str3 = amplitudeInitOptions.mediaUrl;
        }
        if ((i13 & 16) != 0) {
            str4 = amplitudeInitOptions.locale;
        }
        if ((i13 & 32) != 0) {
            options = amplitudeInitOptions.options;
        }
        String str5 = str4;
        Options options2 = options;
        return amplitudeInitOptions.copy(enumC17340w, str, str2, str3, str5, options2);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void write$Self(AmplitudeInitOptions self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.serverZone != EnumC17340w.f67151w) {
            output.encodeSerializableElement(serialDesc, 0, interfaceC37138cArr[0], self.serverZone);
        }
        int i13 = 1;
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.serverUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.serverUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.cdnUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.cdnUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.mediaUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.mediaUrl);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4)) {
            output.encodeStringElement(serialDesc, 4, self.locale);
        } else {
            String str = self.locale;
            String language = Locale.getDefault().getLanguage();
            AbstractC22676k.m65749i(language, "getDefault().language");
            if (!AbstractC22676k.m65745e(str, language)) {
                output.encodeStringElement(serialDesc, 4, self.locale);
            }
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && AbstractC22676k.m65745e(self.options, new Options((EnumC17339v) null, i13, (DefaultConstructorMarker) (0 == true ? 1 : 0)))) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 5, AmplitudeInitOptions$Options$$serializer.INSTANCE, self.options);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EnumC17340w getServerZone() {
        return this.serverZone;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getServerUrl() {
        return this.serverUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCdnUrl() {
        return this.cdnUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMediaUrl() {
        return this.mediaUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Options getOptions() {
        return this.options;
    }

    public final AmplitudeInitOptions copy(EnumC17340w serverZone, String serverUrl, String cdnUrl, String mediaUrl, String locale, Options options) {
        AbstractC22676k.m65750j(serverZone, "serverZone");
        AbstractC22676k.m65750j(locale, "locale");
        AbstractC22676k.m65750j(options, "options");
        return new AmplitudeInitOptions(serverZone, serverUrl, cdnUrl, mediaUrl, locale, options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmplitudeInitOptions)) {
            return false;
        }
        AmplitudeInitOptions amplitudeInitOptions = (AmplitudeInitOptions) other;
        return this.serverZone == amplitudeInitOptions.serverZone && AbstractC22676k.m65745e(this.serverUrl, amplitudeInitOptions.serverUrl) && AbstractC22676k.m65745e(this.cdnUrl, amplitudeInitOptions.cdnUrl) && AbstractC22676k.m65745e(this.mediaUrl, amplitudeInitOptions.mediaUrl) && AbstractC22676k.m65745e(this.locale, amplitudeInitOptions.locale) && AbstractC22676k.m65745e(this.options, amplitudeInitOptions.options);
    }

    public final String getCdnUrl() {
        return this.cdnUrl;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getMediaUrl() {
        return this.mediaUrl;
    }

    public final Options getOptions() {
        return this.options;
    }

    public final String getServerUrl() {
        return this.serverUrl;
    }

    public final EnumC17340w getServerZone() {
        return this.serverZone;
    }

    public int hashCode() {
        int iHashCode = this.serverZone.hashCode() * 31;
        String str = this.serverUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cdnUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mediaUrl;
        return this.options.hashCode() + AbstractC11266d.m30450d((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.locale);
    }

    public final void setCdnUrl(String str) {
        this.cdnUrl = str;
    }

    public final void setMediaUrl(String str) {
        this.mediaUrl = str;
    }

    public final void setServerUrl(String str) {
        this.serverUrl = str;
    }

    public String toString() {
        return "AmplitudeInitOptions(serverZone=" + this.serverZone + ", serverUrl=" + this.serverUrl + ", cdnUrl=" + this.cdnUrl + ", mediaUrl=" + this.mediaUrl + ", locale=" + this.locale + ", options=" + this.options + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC23457c
    public /* synthetic */ AmplitudeInitOptions(int i13, EnumC17340w enumC17340w, String str, String str2, String str3, String str4, Options options, SerializationConstructorMarker serializationConstructorMarker) {
        this.serverZone = (i13 & 1) == 0 ? EnumC17340w.f67151w : enumC17340w;
        EnumC17339v enumC17339v = null;
        Object[] objArr = 0;
        if ((i13 & 2) == 0) {
            this.serverUrl = null;
        } else {
            this.serverUrl = str;
        }
        if ((i13 & 4) == 0) {
            this.cdnUrl = null;
        } else {
            this.cdnUrl = str2;
        }
        if ((i13 & 8) == 0) {
            this.mediaUrl = null;
        } else {
            this.mediaUrl = str3;
        }
        if ((i13 & 16) == 0) {
            String language = Locale.getDefault().getLanguage();
            AbstractC22676k.m65749i(language, "getDefault().language");
            this.locale = language;
        } else {
            this.locale = str4;
        }
        if ((i13 & 32) == 0) {
            this.options = new Options(enumC17339v, 1, (DefaultConstructorMarker) (objArr == true ? 1 : 0));
        } else {
            this.options = options;
        }
    }

    public AmplitudeInitOptions(EnumC17340w serverZone, String str, String str2, String str3, String locale, Options options) {
        AbstractC22676k.m65750j(serverZone, "serverZone");
        AbstractC22676k.m65750j(locale, "locale");
        AbstractC22676k.m65750j(options, "options");
        this.serverZone = serverZone;
        this.serverUrl = str;
        this.cdnUrl = str2;
        this.mediaUrl = str3;
        this.locale = locale;
        this.options = options;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ AmplitudeInitOptions(EnumC17340w enumC17340w, String str, String str2, String str3, String str4, Options options, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        enumC17340w = (i13 & 1) != 0 ? EnumC17340w.f67151w : enumC17340w;
        EnumC17339v enumC17339v = null;
        Object[] objArr = 0;
        str = (i13 & 2) != 0 ? null : str;
        str2 = (i13 & 4) != 0 ? null : str2;
        str3 = (i13 & 8) != 0 ? null : str3;
        if ((i13 & 16) != 0) {
            str4 = Locale.getDefault().getLanguage();
            AbstractC22676k.m65749i(str4, "getDefault().language");
        }
        this(enumC17340w, str, str2, str3, str4, (i13 & 32) != 0 ? new Options(enumC17339v, 1, (DefaultConstructorMarker) (objArr == true ? 1 : 0)) : options);
    }
}
