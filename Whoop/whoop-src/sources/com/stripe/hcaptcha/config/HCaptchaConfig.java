package com.stripe.hcaptcha.config;

import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4351m;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import java.io.Serializable;
import java.util.Locale;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import w40.C36798a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0087\b\u0018\u0000 o2\u00020\u0001:\u0002pqBå\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u001c\b\u0002\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eBÇ\u0001\b\u0010\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u001d\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010%J\u0010\u0010+\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b+\u0010%J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010%J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010%J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010%J\u0012\u0010/\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b/\u0010%J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010%J\u0010\u00101\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b5\u00106J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010%J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010%J$\u00109\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b9\u0010:J\u0010\u0010=\u001a\u00020\u001aHÆ\u0003¢\u0006\u0004\b;\u0010<J\u0010\u0010>\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b>\u0010'Jð\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u001c\b\u0002\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010B\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bB\u0010%J\u0010\u0010C\u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\bC\u0010DJ\u001a\u0010G\u001a\u00020\u00042\b\u0010F\u001a\u0004\u0018\u00010EHÖ\u0003¢\u0006\u0004\bG\u0010HJ'\u0010Q\u001a\u00020N2\u0006\u0010I\u001a\u00020\u00002\u0006\u0010K\u001a\u00020J2\u0006\u0010M\u001a\u00020LH\u0001¢\u0006\u0004\bO\u0010PR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010R\u001a\u0004\bS\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010T\u001a\u0004\bU\u0010'R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010T\u001a\u0004\bV\u0010'R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010T\u001a\u0004\bW\u0010'R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010R\u001a\u0004\bX\u0010%R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010R\u001a\u0004\bY\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010R\u001a\u0004\bZ\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010R\u001a\u0004\b[\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010R\u001a\u0004\b\\\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010R\u001a\u0004\b]\u0010%R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010R\u001a\u0004\b^\u0010%R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010_\u001a\u0004\b`\u00102R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010a\u001a\u0004\bb\u00104R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010c\u001a\u0004\bd\u00106R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010R\u001a\u0004\be\u0010%R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010R\u001a\u0004\bf\u0010%R4\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010g\u0012\u0004\bi\u0010j\u001a\u0004\bh\u0010:R \u0010\u001b\u001a\u00020\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010k\u0012\u0004\bm\u0010j\u001a\u0004\bl\u0010<R\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010T\u001a\u0004\bn\u0010'¨\u0006r"}, m65681d2 = {"Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "Ljava/io/Serializable;", "", "siteKey", "", "sentry", "loading", "hideDialog", "rqdata", "jsSrc", "endpoint", "reportapi", "assethost", "imghost", "locale", "Lcom/stripe/hcaptcha/config/HCaptchaSize;", "size", "Lcom/stripe/hcaptcha/config/HCaptchaOrientation;", "orientation", "Lcom/stripe/hcaptcha/config/HCaptchaTheme;", "theme", "host", "customTheme", "Lkotlin/Function2;", "Lcom/stripe/hcaptcha/HCaptchaException;", "retryPredicate", "Lkotlin/time/Duration;", "tokenExpiration", "disableHardwareAcceleration", "<init>", "(Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lc93/m;JZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lkotlin/time/Duration;ZLkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "()Lcom/stripe/hcaptcha/config/HCaptchaSize;", "component13", "()Lcom/stripe/hcaptcha/config/HCaptchaOrientation;", "component14", "()Lcom/stripe/hcaptcha/config/HCaptchaTheme;", "component15", "component16", "component17", "()Lc93/m;", "component18-UwyO8pc", "()J", "component18", "component19", "copy-ZIzw2bI", "(Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/hcaptcha/config/HCaptchaSize;Lcom/stripe/hcaptcha/config/HCaptchaOrientation;Lcom/stripe/hcaptcha/config/HCaptchaTheme;Ljava/lang/String;Ljava/lang/String;Lc93/m;JZ)Lcom/stripe/hcaptcha/config/HCaptchaConfig;", "copy", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hcaptcha_release", "(Lcom/stripe/hcaptcha/config/HCaptchaConfig;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getSiteKey", "Z", "getSentry", "getLoading", "getHideDialog", "getRqdata", "getJsSrc", "getEndpoint", "getReportapi", "getAssethost", "getImghost", "getLocale", "Lcom/stripe/hcaptcha/config/HCaptchaSize;", "getSize", "Lcom/stripe/hcaptcha/config/HCaptchaOrientation;", "getOrientation", "Lcom/stripe/hcaptcha/config/HCaptchaTheme;", "getTheme", "getHost", "getCustomTheme", "Lc93/m;", "getRetryPredicate", "getRetryPredicate$annotations", "()V", "J", "getTokenExpiration-UwyO8pc", "getTokenExpiration-UwyO8pc$annotations", "getDisableHardwareAcceleration", "Companion", "com/stripe/hcaptcha/config/a", "$serializer", "hcaptcha_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HCaptchaConfig implements Serializable {
    private static final long serialVersionUID = 6277779472462415908L;
    private final String assethost;
    private final String customTheme;
    private final boolean disableHardwareAcceleration;
    private final String endpoint;
    private final boolean hideDialog;
    private final String host;
    private final String imghost;
    private final String jsSrc;
    private final boolean loading;
    private final String locale;
    private final HCaptchaOrientation orientation;
    private final String reportapi;
    private final InterfaceC4351m retryPredicate;
    private final String rqdata;
    private final boolean sentry;
    private final String siteKey;
    private final HCaptchaSize size;
    private final HCaptchaTheme theme;
    private final long tokenExpiration;
    public static final C5706a Companion = new C5706a();
    private static final InterfaceC37138c[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, HCaptchaSize.Companion.serializer(), HCaptchaOrientation.Companion.serializer(), HCaptchaTheme.Companion.serializer(), null, null, null, null};

    public /* synthetic */ HCaptchaConfig(int i13, String str, boolean z4, boolean z13, boolean z14, String str2, String str3, String str4, String str5, String str6, String str7, String str8, HCaptchaSize hCaptchaSize, HCaptchaOrientation hCaptchaOrientation, HCaptchaTheme hCaptchaTheme, String str9, String str10, Duration duration, boolean z15, SerializationConstructorMarker serializationConstructorMarker, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, str, z4, z13, z14, str2, str3, str4, str5, str6, str7, str8, hCaptchaSize, hCaptchaOrientation, hCaptchaTheme, str9, str10, duration, z15, serializationConstructorMarker);
    }

    /* JADX INFO: renamed from: copy-ZIzw2bI$default, reason: not valid java name */
    public static /* synthetic */ HCaptchaConfig m134140copyZIzw2bI$default(HCaptchaConfig hCaptchaConfig, String str, boolean z4, boolean z13, boolean z14, String str2, String str3, String str4, String str5, String str6, String str7, String str8, HCaptchaSize hCaptchaSize, HCaptchaOrientation hCaptchaOrientation, HCaptchaTheme hCaptchaTheme, String str9, String str10, InterfaceC4351m interfaceC4351m, long j7, boolean z15, int i13, Object obj) {
        boolean z16;
        long j13;
        String str11 = (i13 & 1) != 0 ? hCaptchaConfig.siteKey : str;
        boolean z17 = (i13 & 2) != 0 ? hCaptchaConfig.sentry : z4;
        boolean z18 = (i13 & 4) != 0 ? hCaptchaConfig.loading : z13;
        boolean z19 = (i13 & 8) != 0 ? hCaptchaConfig.hideDialog : z14;
        String str12 = (i13 & 16) != 0 ? hCaptchaConfig.rqdata : str2;
        String str13 = (i13 & 32) != 0 ? hCaptchaConfig.jsSrc : str3;
        String str14 = (i13 & 64) != 0 ? hCaptchaConfig.endpoint : str4;
        String str15 = (i13 & 128) != 0 ? hCaptchaConfig.reportapi : str5;
        String str16 = (i13 & 256) != 0 ? hCaptchaConfig.assethost : str6;
        String str17 = (i13 & 512) != 0 ? hCaptchaConfig.imghost : str7;
        String str18 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? hCaptchaConfig.locale : str8;
        HCaptchaSize hCaptchaSize2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? hCaptchaConfig.size : hCaptchaSize;
        HCaptchaOrientation hCaptchaOrientation2 = (i13 & 4096) != 0 ? hCaptchaConfig.orientation : hCaptchaOrientation;
        HCaptchaTheme hCaptchaTheme2 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? hCaptchaConfig.theme : hCaptchaTheme;
        String str19 = str11;
        String str20 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? hCaptchaConfig.host : str9;
        String str21 = (i13 & 32768) != 0 ? hCaptchaConfig.customTheme : str10;
        InterfaceC4351m interfaceC4351m2 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? hCaptchaConfig.retryPredicate : interfaceC4351m;
        String str22 = str20;
        long j14 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? hCaptchaConfig.tokenExpiration : j7;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0) {
            j13 = j14;
            z16 = hCaptchaConfig.disableHardwareAcceleration;
        } else {
            z16 = z15;
            j13 = j14;
        }
        return hCaptchaConfig.m134143copyZIzw2bI(str19, z17, z18, z19, str12, str13, str14, str15, str16, str17, str18, hCaptchaSize2, hCaptchaOrientation2, hCaptchaTheme2, str22, str21, interfaceC4351m2, j13, z16);
    }

    public static /* synthetic */ void getRetryPredicate$annotations() {
    }

    @InterfaceC37144i(with = C36798a.class)
    /* JADX INFO: renamed from: getTokenExpiration-UwyO8pc$annotations, reason: not valid java name */
    public static /* synthetic */ void m134141getTokenExpirationUwyO8pc$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:97:0x015c  */
    public static final /* synthetic */ void write$Self$hcaptcha_release(HCaptchaConfig self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.siteKey);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !self.sentry) {
            output.encodeBooleanElement(serialDesc, 1, self.sentry);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !self.loading) {
            output.encodeBooleanElement(serialDesc, 2, self.loading);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.hideDialog) {
            output.encodeBooleanElement(serialDesc, 3, self.hideDialog);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.rqdata != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.rqdata);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !AbstractC22676k.m65745e(self.jsSrc, "https://js.hcaptcha.com/1/api.js")) {
            output.encodeStringElement(serialDesc, 5, self.jsSrc);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.endpoint != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.endpoint);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.reportapi != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.reportapi);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.assethost != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.assethost);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.imghost != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.imghost);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || !AbstractC22676k.m65745e(self.locale, Locale.getDefault().getLanguage())) {
            output.encodeStringElement(serialDesc, 10, self.locale);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.size != HCaptchaSize.INVISIBLE) {
            output.encodeSerializableElement(serialDesc, 11, interfaceC37138cArr[11], self.size);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.orientation != HCaptchaOrientation.PORTRAIT) {
            output.encodeSerializableElement(serialDesc, 12, interfaceC37138cArr[12], self.orientation);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.theme != HCaptchaTheme.LIGHT) {
            output.encodeSerializableElement(serialDesc, 13, interfaceC37138cArr[13], self.theme);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.host != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, StringSerializer.INSTANCE, self.host);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 15) || self.customTheme != null) {
            output.encodeNullableSerializableElement(serialDesc, 15, StringSerializer.INSTANCE, self.customTheme);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16)) {
            output.encodeSerializableElement(serialDesc, 16, C36798a.f157424a, Duration.m134260boximpl(self.tokenExpiration));
        } else {
            long j7 = self.tokenExpiration;
            Duration.Companion companion = Duration.INSTANCE;
            if (!Duration.m134267equalsimpl0(j7, DurationKt.toDuration(120, DurationUnit.SECONDS))) {
                output.encodeSerializableElement(serialDesc, 16, C36798a.f157424a, Duration.m134260boximpl(self.tokenExpiration));
            }
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 17) && self.disableHardwareAcceleration) {
            return;
        }
        output.encodeBooleanElement(serialDesc, 17, self.disableHardwareAcceleration);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSiteKey() {
        return this.siteKey;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getImghost() {
        return this.imghost;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final HCaptchaSize getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final HCaptchaOrientation getOrientation() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final HCaptchaTheme getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getHost() {
        return this.host;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getCustomTheme() {
        return this.customTheme;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final InterfaceC4351m getRetryPredicate() {
        return this.retryPredicate;
    }

    /* JADX INFO: renamed from: component18-UwyO8pc, reason: not valid java name and from getter */
    public final long getTokenExpiration() {
        return this.tokenExpiration;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getDisableHardwareAcceleration() {
        return this.disableHardwareAcceleration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSentry() {
        return this.sentry;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHideDialog() {
        return this.hideDialog;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRqdata() {
        return this.rqdata;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getJsSrc() {
        return this.jsSrc;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEndpoint() {
        return this.endpoint;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getReportapi() {
        return this.reportapi;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAssethost() {
        return this.assethost;
    }

    /* JADX INFO: renamed from: copy-ZIzw2bI, reason: not valid java name */
    public final HCaptchaConfig m134143copyZIzw2bI(String siteKey, boolean sentry, boolean loading, boolean hideDialog, String rqdata, String jsSrc, String endpoint, String reportapi, String assethost, String imghost, String locale, HCaptchaSize size, HCaptchaOrientation orientation, HCaptchaTheme theme, String host, String customTheme, InterfaceC4351m retryPredicate, long tokenExpiration, boolean disableHardwareAcceleration) {
        AbstractC22676k.m65750j(siteKey, "siteKey");
        AbstractC22676k.m65750j(jsSrc, "jsSrc");
        AbstractC22676k.m65750j(locale, "locale");
        AbstractC22676k.m65750j(size, "size");
        AbstractC22676k.m65750j(orientation, "orientation");
        AbstractC22676k.m65750j(theme, "theme");
        return new HCaptchaConfig(siteKey, sentry, loading, hideDialog, rqdata, jsSrc, endpoint, reportapi, assethost, imghost, locale, size, orientation, theme, host, customTheme, retryPredicate, tokenExpiration, disableHardwareAcceleration, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HCaptchaConfig)) {
            return false;
        }
        HCaptchaConfig hCaptchaConfig = (HCaptchaConfig) other;
        return AbstractC22676k.m65745e(this.siteKey, hCaptchaConfig.siteKey) && this.sentry == hCaptchaConfig.sentry && this.loading == hCaptchaConfig.loading && this.hideDialog == hCaptchaConfig.hideDialog && AbstractC22676k.m65745e(this.rqdata, hCaptchaConfig.rqdata) && AbstractC22676k.m65745e(this.jsSrc, hCaptchaConfig.jsSrc) && AbstractC22676k.m65745e(this.endpoint, hCaptchaConfig.endpoint) && AbstractC22676k.m65745e(this.reportapi, hCaptchaConfig.reportapi) && AbstractC22676k.m65745e(this.assethost, hCaptchaConfig.assethost) && AbstractC22676k.m65745e(this.imghost, hCaptchaConfig.imghost) && AbstractC22676k.m65745e(this.locale, hCaptchaConfig.locale) && this.size == hCaptchaConfig.size && this.orientation == hCaptchaConfig.orientation && this.theme == hCaptchaConfig.theme && AbstractC22676k.m65745e(this.host, hCaptchaConfig.host) && AbstractC22676k.m65745e(this.customTheme, hCaptchaConfig.customTheme) && AbstractC22676k.m65745e(this.retryPredicate, hCaptchaConfig.retryPredicate) && Duration.m134267equalsimpl0(this.tokenExpiration, hCaptchaConfig.tokenExpiration) && this.disableHardwareAcceleration == hCaptchaConfig.disableHardwareAcceleration;
    }

    public final String getAssethost() {
        return this.assethost;
    }

    public final String getCustomTheme() {
        return this.customTheme;
    }

    public final boolean getDisableHardwareAcceleration() {
        return this.disableHardwareAcceleration;
    }

    public final String getEndpoint() {
        return this.endpoint;
    }

    public final boolean getHideDialog() {
        return this.hideDialog;
    }

    public final String getHost() {
        return this.host;
    }

    public final String getImghost() {
        return this.imghost;
    }

    public final String getJsSrc() {
        return this.jsSrc;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final HCaptchaOrientation getOrientation() {
        return this.orientation;
    }

    public final String getReportapi() {
        return this.reportapi;
    }

    public final InterfaceC4351m getRetryPredicate() {
        return this.retryPredicate;
    }

    public final String getRqdata() {
        return this.rqdata;
    }

    public final boolean getSentry() {
        return this.sentry;
    }

    public final String getSiteKey() {
        return this.siteKey;
    }

    public final HCaptchaSize getSize() {
        return this.size;
    }

    public final HCaptchaTheme getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: getTokenExpiration-UwyO8pc, reason: not valid java name */
    public final long m134144getTokenExpirationUwyO8pc() {
        return this.tokenExpiration;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.siteKey.hashCode() * 31, 31, this.sentry), 31, this.loading), 31, this.hideDialog);
        String str = this.rqdata;
        int iM30450d = AbstractC11266d.m30450d((iM8289b + (str == null ? 0 : str.hashCode())) * 31, 31, this.jsSrc);
        String str2 = this.endpoint;
        int iHashCode = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.reportapi;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.assethost;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.imghost;
        int iHashCode4 = (this.theme.hashCode() + ((this.orientation.hashCode() + ((this.size.hashCode() + AbstractC11266d.m30450d((iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.locale)) * 31)) * 31)) * 31;
        String str6 = this.host;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.customTheme;
        int iHashCode6 = (iHashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
        InterfaceC4351m interfaceC4351m = this.retryPredicate;
        return Boolean.hashCode(this.disableHardwareAcceleration) + ((Duration.m134283hashCodeimpl(this.tokenExpiration) + ((iHashCode6 + (interfaceC4351m != null ? interfaceC4351m.hashCode() : 0)) * 31)) * 31);
    }

    public String toString() {
        String str = this.siteKey;
        boolean z4 = this.sentry;
        boolean z13 = this.loading;
        boolean z14 = this.hideDialog;
        String str2 = this.rqdata;
        String str3 = this.jsSrc;
        String str4 = this.endpoint;
        String str5 = this.reportapi;
        String str6 = this.assethost;
        String str7 = this.imghost;
        String str8 = this.locale;
        HCaptchaSize hCaptchaSize = this.size;
        HCaptchaOrientation hCaptchaOrientation = this.orientation;
        HCaptchaTheme hCaptchaTheme = this.theme;
        String str9 = this.host;
        String str10 = this.customTheme;
        InterfaceC4351m interfaceC4351m = this.retryPredicate;
        String strM134302toStringimpl = Duration.m134302toStringimpl(this.tokenExpiration);
        boolean z15 = this.disableHardwareAcceleration;
        StringBuilder sbM73379l = AbstractC25012a.m73379l("HCaptchaConfig(siteKey=", str, ", sentry=", ", loading=", z4);
        AbstractC38963t7.m124392v(sbM73379l, z13, ", hideDialog=", z14, ", rqdata=");
        AbstractC11266d.m30444B(sbM73379l, str2, ", jsSrc=", str3, ", endpoint=");
        AbstractC11266d.m30444B(sbM73379l, str4, ", reportapi=", str5, ", assethost=");
        AbstractC11266d.m30444B(sbM73379l, str6, ", imghost=", str7, ", locale=");
        sbM73379l.append(str8);
        sbM73379l.append(", size=");
        sbM73379l.append(hCaptchaSize);
        sbM73379l.append(", orientation=");
        sbM73379l.append(hCaptchaOrientation);
        sbM73379l.append(", theme=");
        sbM73379l.append(hCaptchaTheme);
        sbM73379l.append(", host=");
        AbstractC11266d.m30444B(sbM73379l, str9, ", customTheme=", str10, ", retryPredicate=");
        sbM73379l.append(interfaceC4351m);
        sbM73379l.append(", tokenExpiration=");
        sbM73379l.append(strM134302toStringimpl);
        sbM73379l.append(", disableHardwareAcceleration=");
        return AbstractC18489d0.m53372m(sbM73379l, z15, ")");
    }

    public /* synthetic */ HCaptchaConfig(String str, boolean z4, boolean z13, boolean z14, String str2, String str3, String str4, String str5, String str6, String str7, String str8, HCaptchaSize hCaptchaSize, HCaptchaOrientation hCaptchaOrientation, HCaptchaTheme hCaptchaTheme, String str9, String str10, InterfaceC4351m interfaceC4351m, long j7, boolean z15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z4, z13, z14, str2, str3, str4, str5, str6, str7, str8, hCaptchaSize, hCaptchaOrientation, hCaptchaTheme, str9, str10, interfaceC4351m, j7, z15);
    }

    private /* synthetic */ HCaptchaConfig(int i13, String str, boolean z4, boolean z13, boolean z14, String str2, String str3, String str4, String str5, String str6, String str7, String str8, HCaptchaSize hCaptchaSize, HCaptchaOrientation hCaptchaOrientation, HCaptchaTheme hCaptchaTheme, String str9, String str10, Duration duration, boolean z15, SerializationConstructorMarker serializationConstructorMarker) {
        long rawValue;
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, HCaptchaConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.siteKey = str;
        if ((i13 & 2) == 0) {
            this.sentry = true;
        } else {
            this.sentry = z4;
        }
        if ((i13 & 4) == 0) {
            this.loading = true;
        } else {
            this.loading = z13;
        }
        if ((i13 & 8) == 0) {
            this.hideDialog = false;
        } else {
            this.hideDialog = z14;
        }
        if ((i13 & 16) == 0) {
            this.rqdata = null;
        } else {
            this.rqdata = str2;
        }
        if ((i13 & 32) == 0) {
            this.jsSrc = "https://js.hcaptcha.com/1/api.js";
        } else {
            this.jsSrc = str3;
        }
        if ((i13 & 64) == 0) {
            this.endpoint = null;
        } else {
            this.endpoint = str4;
        }
        if ((i13 & 128) == 0) {
            this.reportapi = null;
        } else {
            this.reportapi = str5;
        }
        if ((i13 & 256) == 0) {
            this.assethost = null;
        } else {
            this.assethost = str6;
        }
        if ((i13 & 512) == 0) {
            this.imghost = null;
        } else {
            this.imghost = str7;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.locale = Locale.getDefault().getLanguage();
        } else {
            this.locale = str8;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.size = HCaptchaSize.INVISIBLE;
        } else {
            this.size = hCaptchaSize;
        }
        this.orientation = (i13 & 4096) == 0 ? HCaptchaOrientation.PORTRAIT : hCaptchaOrientation;
        this.theme = (i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0 ? HCaptchaTheme.LIGHT : hCaptchaTheme;
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
            this.host = null;
        } else {
            this.host = str9;
        }
        if ((32768 & i13) == 0) {
            this.customTheme = null;
        } else {
            this.customTheme = str10;
        }
        this.retryPredicate = null;
        if ((65536 & i13) == 0) {
            Duration.Companion companion = Duration.INSTANCE;
            rawValue = DurationKt.toDuration(120, DurationUnit.SECONDS);
        } else {
            rawValue = duration.getRawValue();
        }
        this.tokenExpiration = rawValue;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) == 0) {
            this.disableHardwareAcceleration = true;
        } else {
            this.disableHardwareAcceleration = z15;
        }
    }

    private HCaptchaConfig(String siteKey, boolean z4, boolean z13, boolean z14, String str, String jsSrc, String str2, String str3, String str4, String str5, String locale, HCaptchaSize size, HCaptchaOrientation orientation, HCaptchaTheme theme, String str6, String str7, InterfaceC4351m interfaceC4351m, long j7, boolean z15) {
        AbstractC22676k.m65750j(siteKey, "siteKey");
        AbstractC22676k.m65750j(jsSrc, "jsSrc");
        AbstractC22676k.m65750j(locale, "locale");
        AbstractC22676k.m65750j(size, "size");
        AbstractC22676k.m65750j(orientation, "orientation");
        AbstractC22676k.m65750j(theme, "theme");
        this.siteKey = siteKey;
        this.sentry = z4;
        this.loading = z13;
        this.hideDialog = z14;
        this.rqdata = str;
        this.jsSrc = jsSrc;
        this.endpoint = str2;
        this.reportapi = str3;
        this.assethost = str4;
        this.imghost = str5;
        this.locale = locale;
        this.size = size;
        this.orientation = orientation;
        this.theme = theme;
        this.host = str6;
        this.customTheme = str7;
        this.retryPredicate = interfaceC4351m;
        this.tokenExpiration = j7;
        this.disableHardwareAcceleration = z15;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ HCaptchaConfig(String str, boolean z4, boolean z13, boolean z14, String str2, String str3, String str4, String str5, String str6, String str7, String str8, HCaptchaSize hCaptchaSize, HCaptchaOrientation hCaptchaOrientation, HCaptchaTheme hCaptchaTheme, String str9, String str10, InterfaceC4351m interfaceC4351m, long j7, boolean z15, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        long duration;
        boolean z16 = (i13 & 2) != 0 ? true : z4;
        boolean z17 = (i13 & 4) != 0 ? true : z13;
        boolean z18 = (i13 & 8) != 0 ? false : z14;
        String str11 = (i13 & 16) != 0 ? null : str2;
        String str12 = (i13 & 32) != 0 ? "https://js.hcaptcha.com/1/api.js" : str3;
        String str13 = (i13 & 64) != 0 ? null : str4;
        String str14 = (i13 & 128) != 0 ? null : str5;
        String str15 = (i13 & 256) != 0 ? null : str6;
        String str16 = (i13 & 512) != 0 ? null : str7;
        String language = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? Locale.getDefault().getLanguage() : str8;
        HCaptchaSize hCaptchaSize2 = (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? HCaptchaSize.INVISIBLE : hCaptchaSize;
        HCaptchaOrientation hCaptchaOrientation2 = (i13 & 4096) != 0 ? HCaptchaOrientation.PORTRAIT : hCaptchaOrientation;
        HCaptchaTheme hCaptchaTheme2 = (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? HCaptchaTheme.LIGHT : hCaptchaTheme;
        String str17 = (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : str9;
        String str18 = (32768 & i13) != 0 ? null : str10;
        InterfaceC4351m interfaceC4351m2 = (65536 & i13) != 0 ? null : interfaceC4351m;
        if ((131072 & i13) != 0) {
            Duration.Companion companion = Duration.INSTANCE;
            duration = DurationKt.toDuration(120, DurationUnit.SECONDS);
        } else {
            duration = j7;
        }
        this(str, z16, z17, z18, str11, str12, str13, str14, str15, str16, language, hCaptchaSize2, hCaptchaOrientation2, hCaptchaTheme2, str17, str18, interfaceC4351m2, duration, (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? true : z15, (DefaultConstructorMarker) null);
    }
}
