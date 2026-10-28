package com.stripe.android.link.serialization;

import ad3.AbstractC0757c;
import ad3.C0764g;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ev2.C13693b;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p505ts.AbstractC34132o;
import p664yy.AbstractC39851c;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yb3.AbstractC39421y;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b;\b\u0081\b\u0018\u0000 |2\u00020\u0001:\u000b}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001B£\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aB\u008d\u0002\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0014\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b\u0019\u0010#J\r\u0010$\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0010\u0010(\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010%J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u0010%J\u0010\u00100\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b0\u0010%J\u0010\u00101\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b1\u0010%J\u0010\u00102\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b2\u0010%J\u0010\u00103\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b5\u00106J\u001c\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u0014HÆ\u0003¢\u0006\u0004\b7\u00108J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016HÆ\u0003¢\u0006\u0004\b9\u0010:J\u001c\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0014HÆ\u0003¢\u0006\u0004\b;\u00108JÊ\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u00142\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0014HÆ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b>\u0010%J\u0010\u0010?\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b?\u0010@J\u001a\u0010B\u001a\u00020\u00102\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bB\u0010CJ'\u0010L\u001a\u00020I2\u0006\u0010D\u001a\u00020\u00002\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020GH\u0001¢\u0006\u0004\bJ\u0010KR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010M\u0012\u0004\bO\u0010P\u001a\u0004\bN\u0010%R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010M\u0012\u0004\bR\u0010P\u001a\u0004\bQ\u0010%R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010S\u0012\u0004\bU\u0010P\u001a\u0004\bT\u0010)R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010V\u0012\u0004\bX\u0010P\u001a\u0004\bW\u0010+R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010Y\u0012\u0004\b[\u0010P\u001a\u0004\bZ\u0010-R \u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010M\u0012\u0004\b]\u0010P\u001a\u0004\b\\\u0010%R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010M\u0012\u0004\b_\u0010P\u001a\u0004\b^\u0010%R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010M\u0012\u0004\ba\u0010P\u001a\u0004\b`\u0010%R \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010M\u0012\u0004\bc\u0010P\u001a\u0004\bb\u0010%R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010M\u0012\u0004\be\u0010P\u001a\u0004\bd\u0010%R \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010f\u0012\u0004\bh\u0010P\u001a\u0004\bg\u00104R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010i\u0012\u0004\bk\u0010P\u001a\u0004\bj\u00106R,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00100\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010l\u0012\u0004\bn\u0010P\u001a\u0004\bm\u00108R&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010o\u0012\u0004\bq\u0010P\u001a\u0004\bp\u0010:R,\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010l\u0012\u0004\bs\u0010P\u001a\u0004\br\u00108R \u0010\u001d\u001a\u00020\u00028\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u001d\u0010M\u0012\u0004\bu\u0010P\u001a\u0004\bt\u0010%R \u0010\u001e\u001a\u00020\u00028\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u001e\u0010M\u0012\u0004\bw\u0010P\u001a\u0004\bv\u0010%R,\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010l\u0012\u0004\by\u0010P\u001a\u0004\bx\u00108R,\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00148\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010l\u0012\u0004\b{\u0010P\u001a\u0004\bz\u00108¨\u0006\u0084\u0001"}, m65681d2 = {"Lcom/stripe/android/link/serialization/PopupPayload;", "", "", "publishableKey", "stripeAccount", "Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;", "merchantInfo", "Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;", "customerInfo", "Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;", "paymentInfo", "appId", "locale", "paymentUserAgent", "paymentObject", "intentMode", "", "setupFutureUsage", "Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;", "cardBrandChoice", "", "flags", "", "linkFundingSources", "clientAttributionMetadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;)V", "", "seen0", "path", "integrationType", "loggerMetadata", "experiments", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "toUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "()Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;", "component4", "()Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;", "component5", "()Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;", "component6", "component7", "component8", "component9", "component10", "component11", "()Z", "component12", "()Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;", "component13", "()Ljava/util/Map;", "component14", "()Ljava/util/List;", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;)Lcom/stripe/android/link/serialization/PopupPayload;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$paymentsheet_release", "(Lcom/stripe/android/link/serialization/PopupPayload;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getPublishableKey", "getPublishableKey$annotations", "()V", "getStripeAccount", "getStripeAccount$annotations", "Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;", "getMerchantInfo", "getMerchantInfo$annotations", "Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;", "getCustomerInfo", "getCustomerInfo$annotations", "Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;", "getPaymentInfo", "getPaymentInfo$annotations", "getAppId", "getAppId$annotations", "getLocale", "getLocale$annotations", "getPaymentUserAgent", "getPaymentUserAgent$annotations", "getPaymentObject", "getPaymentObject$annotations", "getIntentMode", "getIntentMode$annotations", "Z", "getSetupFutureUsage", "getSetupFutureUsage$annotations", "Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;", "getCardBrandChoice", "getCardBrandChoice$annotations", "Ljava/util/Map;", "getFlags", "getFlags$annotations", "Ljava/util/List;", "getLinkFundingSources", "getLinkFundingSources$annotations", "getClientAttributionMetadata", "getClientAttributionMetadata$annotations", "getPath", "getPath$annotations", "getIntegrationType", "getIntegrationType$annotations", "getLoggerMetadata", "getLoggerMetadata$annotations", "getExperiments", "getExperiments$annotations", "Companion", "MerchantInfo", "CustomerInfo", "PaymentInfo", "CardBrandChoice", "f00/a", "com/stripe/android/link/serialization/b", "$serializer", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PopupPayload {
    private static final InterfaceC37138c[] $childSerializers;
    public static final int $stable = 8;
    public static final C5638b Companion = new C5638b();
    private static final String MOBILE_SESSION_ID_KEY = "mobile_session_id";
    private static final AbstractC0757c PopupPayloadJson;
    private static final String baseUrl = "https://checkout.link.com/#";
    private final String appId;
    private final CardBrandChoice cardBrandChoice;
    private final Map<String, String> clientAttributionMetadata;
    private final CustomerInfo customerInfo;
    private final Map<String, String> experiments;
    private final Map<String, Boolean> flags;
    private final String integrationType;
    private final String intentMode;
    private final List<String> linkFundingSources;
    private final String locale;
    private final Map<String, String> loggerMetadata;
    private final MerchantInfo merchantInfo;
    private final String path;
    private final PaymentInfo paymentInfo;
    private final String paymentObject;
    private final String paymentUserAgent;
    private final String publishableKey;
    private final boolean setupFutureUsage;
    private final String stripeAccount;

    @Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002,-B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0018R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010(\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u001a¨\u0006."}, m65681d2 = {"Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;", "", "", "eligible", "", "", "preferredNetworks", "<init>", "(ZLjava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$paymentsheet_release", "(Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/util/List;", "copy", "(ZLjava/util/List;)Lcom/stripe/android/link/serialization/PopupPayload$CardBrandChoice;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEligible", "getEligible$annotations", "()V", "Ljava/util/List;", "getPreferredNetworks", "getPreferredNetworks$annotations", "Companion", "$serializer", "com/stripe/android/link/serialization/a", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class CardBrandChoice {
        public static final int $stable = 8;
        private final boolean eligible;
        private final List<String> preferredNetworks;
        public static final C5637a Companion = new C5637a();
        private static final InterfaceC37138c[] $childSerializers = {null, new ArrayListSerializer(StringSerializer.INSTANCE)};

        public /* synthetic */ CardBrandChoice(int i13, boolean z4, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i13 & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 3, PopupPayload$CardBrandChoice$$serializer.INSTANCE.getDescriptor());
            }
            this.eligible = z4;
            this.preferredNetworks = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CardBrandChoice copy$default(CardBrandChoice cardBrandChoice, boolean z4, List list, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                z4 = cardBrandChoice.eligible;
            }
            if ((i13 & 2) != 0) {
                list = cardBrandChoice.preferredNetworks;
            }
            return cardBrandChoice.copy(z4, list);
        }

        @InterfaceC37143h("isMerchantEligibleForCBC")
        public static /* synthetic */ void getEligible$annotations() {
        }

        @InterfaceC37143h("stripePreferredNetworks")
        public static /* synthetic */ void getPreferredNetworks$annotations() {
        }

        public static final /* synthetic */ void write$Self$paymentsheet_release(CardBrandChoice self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
            output.encodeBooleanElement(serialDesc, 0, self.eligible);
            output.encodeSerializableElement(serialDesc, 1, interfaceC37138cArr[1], self.preferredNetworks);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getEligible() {
            return this.eligible;
        }

        public final List<String> component2() {
            return this.preferredNetworks;
        }

        public final CardBrandChoice copy(boolean eligible, List<String> preferredNetworks) {
            AbstractC22676k.m65750j(preferredNetworks, "preferredNetworks");
            return new CardBrandChoice(eligible, preferredNetworks);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CardBrandChoice)) {
                return false;
            }
            CardBrandChoice cardBrandChoice = (CardBrandChoice) other;
            return this.eligible == cardBrandChoice.eligible && AbstractC22676k.m65745e(this.preferredNetworks, cardBrandChoice.preferredNetworks);
        }

        public final boolean getEligible() {
            return this.eligible;
        }

        public final List<String> getPreferredNetworks() {
            return this.preferredNetworks;
        }

        public int hashCode() {
            return this.preferredNetworks.hashCode() + (Boolean.hashCode(this.eligible) * 31);
        }

        public String toString() {
            return "CardBrandChoice(eligible=" + this.eligible + ", preferredNetworks=" + this.preferredNetworks + ")";
        }

        public CardBrandChoice(boolean z4, List<String> preferredNetworks) {
            AbstractC22676k.m65750j(preferredNetworks, "preferredNetworks");
            this.eligible = z4;
            this.preferredNetworks = preferredNetworks;
        }
    }

    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0016¨\u0006*"}, m65681d2 = {"Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;", "", "", NotificationCompat.CATEGORY_EMAIL, "country", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$paymentsheet_release", "(Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/link/serialization/PopupPayload$CustomerInfo;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEmail", "getEmail$annotations", "()V", "getCountry", "getCountry$annotations", "Companion", "$serializer", "com/stripe/android/link/serialization/c", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class CustomerInfo {
        public static final int $stable = 0;
        public static final C5639c Companion = new C5639c();
        private final String country;
        private final String email;

        public /* synthetic */ CustomerInfo(int i13, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i13 & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 3, PopupPayload$CustomerInfo$$serializer.INSTANCE.getDescriptor());
            }
            this.email = str;
            this.country = str2;
        }

        public static /* synthetic */ CustomerInfo copy$default(CustomerInfo customerInfo, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = customerInfo.email;
            }
            if ((i13 & 2) != 0) {
                str2 = customerInfo.country;
            }
            return customerInfo.copy(str, str2);
        }

        @InterfaceC37143h("country")
        public static /* synthetic */ void getCountry$annotations() {
        }

        @InterfaceC37143h(NotificationCompat.CATEGORY_EMAIL)
        public static /* synthetic */ void getEmail$annotations() {
        }

        public static final /* synthetic */ void write$Self$paymentsheet_release(CustomerInfo self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            StringSerializer stringSerializer = StringSerializer.INSTANCE;
            output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.email);
            output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.country);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        public final CustomerInfo copy(String email, String country) {
            return new CustomerInfo(email, country);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomerInfo)) {
                return false;
            }
            CustomerInfo customerInfo = (CustomerInfo) other;
            return AbstractC22676k.m65745e(this.email, customerInfo.email) && AbstractC22676k.m65745e(this.country, customerInfo.country);
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getEmail() {
            return this.email;
        }

        public int hashCode() {
            String str = this.email;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.country;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return AbstractC2875y.m8300m("CustomerInfo(email=", this.email, ", country=", this.country, ")");
        }

        public CustomerInfo(String str, String str2) {
            this.email = str;
            this.country = str2;
        }
    }

    @Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002()B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J&\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0016¨\u0006*"}, m65681d2 = {"Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;", "", "", "businessName", "country", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$paymentsheet_release", "(Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/link/serialization/PopupPayload$MerchantInfo;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBusinessName", "getBusinessName$annotations", "()V", "getCountry", "getCountry$annotations", "Companion", "$serializer", "com/stripe/android/link/serialization/d", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class MerchantInfo {
        public static final int $stable = 0;
        public static final C5640d Companion = new C5640d();
        private final String businessName;
        private final String country;

        public /* synthetic */ MerchantInfo(int i13, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i13 & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 3, PopupPayload$MerchantInfo$$serializer.INSTANCE.getDescriptor());
            }
            this.businessName = str;
            this.country = str2;
        }

        public static /* synthetic */ MerchantInfo copy$default(MerchantInfo merchantInfo, String str, String str2, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = merchantInfo.businessName;
            }
            if ((i13 & 2) != 0) {
                str2 = merchantInfo.country;
            }
            return merchantInfo.copy(str, str2);
        }

        @InterfaceC37143h("businessName")
        public static /* synthetic */ void getBusinessName$annotations() {
        }

        @InterfaceC37143h("country")
        public static /* synthetic */ void getCountry$annotations() {
        }

        public static final /* synthetic */ void write$Self$paymentsheet_release(MerchantInfo self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.businessName);
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.country);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getBusinessName() {
            return this.businessName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        public final MerchantInfo copy(String businessName, String country) {
            AbstractC22676k.m65750j(businessName, "businessName");
            return new MerchantInfo(businessName, country);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MerchantInfo)) {
                return false;
            }
            MerchantInfo merchantInfo = (MerchantInfo) other;
            return AbstractC22676k.m65745e(this.businessName, merchantInfo.businessName) && AbstractC22676k.m65745e(this.country, merchantInfo.country);
        }

        public final String getBusinessName() {
            return this.businessName;
        }

        public final String getCountry() {
            return this.country;
        }

        public int hashCode() {
            int iHashCode = this.businessName.hashCode() * 31;
            String str = this.country;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return AbstractC2875y.m8300m("MerchantInfo(businessName=", this.businessName, ", country=", this.country, ")");
        }

        public MerchantInfo(String businessName, String str) {
            AbstractC22676k.m65750j(businessName, "businessName");
            this.businessName = businessName;
            this.country = str;
        }
    }

    @Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0019¨\u0006-"}, m65681d2 = {"Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;", "", "", "currency", "", "amount", "<init>", "(Ljava/lang/String;J)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;JLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$paymentsheet_release", "(Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lcom/stripe/android/link/serialization/PopupPayload$PaymentInfo;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCurrency", "getCurrency$annotations", "()V", "J", "getAmount", "getAmount$annotations", "Companion", "$serializer", "com/stripe/android/link/serialization/e", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
    @InterfaceC37144i
    public static final /* data */ class PaymentInfo {
        public static final int $stable = 0;
        public static final C5641e Companion = new C5641e();
        private final long amount;
        private final String currency;

        public /* synthetic */ PaymentInfo(int i13, String str, long j7, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i13 & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i13, 3, PopupPayload$PaymentInfo$$serializer.INSTANCE.getDescriptor());
            }
            this.currency = str;
            this.amount = j7;
        }

        public static /* synthetic */ PaymentInfo copy$default(PaymentInfo paymentInfo, String str, long j7, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                str = paymentInfo.currency;
            }
            if ((i13 & 2) != 0) {
                j7 = paymentInfo.amount;
            }
            return paymentInfo.copy(str, j7);
        }

        @InterfaceC37143h("amount")
        public static /* synthetic */ void getAmount$annotations() {
        }

        @InterfaceC37143h("currency")
        public static /* synthetic */ void getCurrency$annotations() {
        }

        public static final /* synthetic */ void write$Self$paymentsheet_release(PaymentInfo self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.currency);
            output.encodeLongElement(serialDesc, 1, self.amount);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getAmount() {
            return this.amount;
        }

        public final PaymentInfo copy(String currency, long amount) {
            AbstractC22676k.m65750j(currency, "currency");
            return new PaymentInfo(currency, amount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaymentInfo)) {
                return false;
            }
            PaymentInfo paymentInfo = (PaymentInfo) other;
            return AbstractC22676k.m65745e(this.currency, paymentInfo.currency) && this.amount == paymentInfo.amount;
        }

        public final long getAmount() {
            return this.amount;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public int hashCode() {
            return Long.hashCode(this.amount) + (this.currency.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sbM32000s = AbstractC11895b.m32000s("PaymentInfo(currency=", this.currency, this.amount, ", amount=");
            sbM32000s.append(")");
            return sbM32000s.toString();
        }

        public PaymentInfo(String currency, long j7) {
            AbstractC22676k.m65750j(currency, "currency");
            this.currency = currency;
            this.amount = j7;
        }
    }

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new InterfaceC37138c[]{null, null, null, null, null, null, null, null, null, null, null, null, new LinkedHashMapSerializer(stringSerializer, BooleanSerializer.INSTANCE), new ArrayListSerializer(stringSerializer), new LinkedHashMapSerializer(stringSerializer, stringSerializer), null, null, new LinkedHashMapSerializer(stringSerializer, stringSerializer), new LinkedHashMapSerializer(stringSerializer, stringSerializer)};
        PopupPayloadJson = AbstractC34132o.m107878b(AbstractC0757c.f2762d, new C13693b(14));
    }

    public PopupPayload(int i13, String str, String str2, MerchantInfo merchantInfo, CustomerInfo customerInfo, PaymentInfo paymentInfo, String str3, String str4, String str5, String str6, String str7, boolean z4, CardBrandChoice cardBrandChoice, Map map, List list, Map map2, String str8, String str9, Map map3, Map map4, SerializationConstructorMarker serializationConstructorMarker) {
        Map mapM95645u;
        if (32767 != (i13 & 32767)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 32767, PopupPayload$$serializer.INSTANCE.getDescriptor());
        }
        this.publishableKey = str;
        this.stripeAccount = str2;
        this.merchantInfo = merchantInfo;
        this.customerInfo = customerInfo;
        this.paymentInfo = paymentInfo;
        this.appId = str3;
        this.locale = str4;
        this.paymentUserAgent = str5;
        this.paymentObject = str6;
        this.intentMode = str7;
        this.setupFutureUsage = z4;
        this.cardBrandChoice = cardBrandChoice;
        this.flags = map;
        this.linkFundingSources = list;
        this.clientAttributionMetadata = map2;
        this.path = (32768 & i13) == 0 ? "mobile_pay" : str8;
        this.integrationType = (65536 & i13) == 0 ? "mobile" : str9;
        if ((131072 & i13) == 0) {
            UUID uuid = AbstractC39851c.f172106g;
            mapM95645u = AbstractC31061c.m95645u(MOBILE_SESSION_ID_KEY, AbstractC39851c.f172106g.toString());
        } else {
            mapM95645u = map3;
        }
        this.loggerMetadata = mapM95645u;
        this.experiments = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 0 ? C25272z.f99163w : map4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 PopupPayloadJson$lambda$0(C0764g Json) {
        AbstractC22676k.m65750j(Json, "$this$Json");
        Json.f2774a = true;
        return C23454a0.f92919a;
    }

    @InterfaceC37143h("appId")
    public static /* synthetic */ void getAppId$annotations() {
    }

    @InterfaceC37143h("cardBrandChoice")
    public static /* synthetic */ void getCardBrandChoice$annotations() {
    }

    @InterfaceC37143h("clientAttributionMetadata")
    public static /* synthetic */ void getClientAttributionMetadata$annotations() {
    }

    @InterfaceC37143h("customerInfo")
    public static /* synthetic */ void getCustomerInfo$annotations() {
    }

    @InterfaceC37143h("experiments")
    public static /* synthetic */ void getExperiments$annotations() {
    }

    @InterfaceC37143h("flags")
    public static /* synthetic */ void getFlags$annotations() {
    }

    @InterfaceC37143h("integrationType")
    public static /* synthetic */ void getIntegrationType$annotations() {
    }

    @InterfaceC37143h("intentMode")
    public static /* synthetic */ void getIntentMode$annotations() {
    }

    @InterfaceC37143h("linkFundingSources")
    public static /* synthetic */ void getLinkFundingSources$annotations() {
    }

    @InterfaceC37143h("locale")
    public static /* synthetic */ void getLocale$annotations() {
    }

    @InterfaceC37143h("loggerMetadata")
    public static /* synthetic */ void getLoggerMetadata$annotations() {
    }

    @InterfaceC37143h("merchantInfo")
    public static /* synthetic */ void getMerchantInfo$annotations() {
    }

    @InterfaceC37143h("path")
    public static /* synthetic */ void getPath$annotations() {
    }

    @InterfaceC37143h("paymentInfo")
    public static /* synthetic */ void getPaymentInfo$annotations() {
    }

    @InterfaceC37143h("paymentObject")
    public static /* synthetic */ void getPaymentObject$annotations() {
    }

    @InterfaceC37143h("paymentUserAgent")
    public static /* synthetic */ void getPaymentUserAgent$annotations() {
    }

    @InterfaceC37143h("publishableKey")
    public static /* synthetic */ void getPublishableKey$annotations() {
    }

    @InterfaceC37143h("setupFutureUsage")
    public static /* synthetic */ void getSetupFutureUsage$annotations() {
    }

    @InterfaceC37143h("stripeAccount")
    public static /* synthetic */ void getStripeAccount$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00cd  */
    public static final void write$Self$paymentsheet_release(PopupPayload self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.publishableKey);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.stripeAccount);
        output.encodeSerializableElement(serialDesc, 2, PopupPayload$MerchantInfo$$serializer.INSTANCE, self.merchantInfo);
        output.encodeSerializableElement(serialDesc, 3, PopupPayload$CustomerInfo$$serializer.INSTANCE, self.customerInfo);
        output.encodeNullableSerializableElement(serialDesc, 4, PopupPayload$PaymentInfo$$serializer.INSTANCE, self.paymentInfo);
        output.encodeStringElement(serialDesc, 5, self.appId);
        output.encodeStringElement(serialDesc, 6, self.locale);
        output.encodeStringElement(serialDesc, 7, self.paymentUserAgent);
        output.encodeStringElement(serialDesc, 8, self.paymentObject);
        output.encodeStringElement(serialDesc, 9, self.intentMode);
        output.encodeBooleanElement(serialDesc, 10, self.setupFutureUsage);
        output.encodeNullableSerializableElement(serialDesc, 11, PopupPayload$CardBrandChoice$$serializer.INSTANCE, self.cardBrandChoice);
        output.encodeSerializableElement(serialDesc, 12, interfaceC37138cArr[12], self.flags);
        output.encodeSerializableElement(serialDesc, 13, interfaceC37138cArr[13], self.linkFundingSources);
        output.encodeSerializableElement(serialDesc, 14, interfaceC37138cArr[14], self.clientAttributionMetadata);
        if (output.shouldEncodeElementDefault(serialDesc, 15) || !AbstractC22676k.m65745e(self.path, "mobile_pay")) {
            output.encodeStringElement(serialDesc, 15, self.path);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 16) || !AbstractC22676k.m65745e(self.integrationType, "mobile")) {
            output.encodeStringElement(serialDesc, 16, self.integrationType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 17)) {
            output.encodeSerializableElement(serialDesc, 17, interfaceC37138cArr[17], self.loggerMetadata);
        } else {
            Map<String, String> map = self.loggerMetadata;
            UUID uuid = AbstractC39851c.f172106g;
            if (!AbstractC22676k.m65745e(map, AbstractC25247g0.m73989X(new C23465k(MOBILE_SESSION_ID_KEY, AbstractC39851c.f172106g.toString())))) {
                output.encodeSerializableElement(serialDesc, 17, interfaceC37138cArr[17], self.loggerMetadata);
            }
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 18) && AbstractC22676k.m65745e(self.experiments, C25272z.f99163w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 18, interfaceC37138cArr[18], self.experiments);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPublishableKey() {
        return this.publishableKey;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getIntentMode() {
        return this.intentMode;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getSetupFutureUsage() {
        return this.setupFutureUsage;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final CardBrandChoice getCardBrandChoice() {
        return this.cardBrandChoice;
    }

    public final Map<String, Boolean> component13() {
        return this.flags;
    }

    public final List<String> component14() {
        return this.linkFundingSources;
    }

    public final Map<String, String> component15() {
        return this.clientAttributionMetadata;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStripeAccount() {
        return this.stripeAccount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MerchantInfo getMerchantInfo() {
        return this.merchantInfo;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPaymentUserAgent() {
        return this.paymentUserAgent;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPaymentObject() {
        return this.paymentObject;
    }

    public final PopupPayload copy(String publishableKey, String stripeAccount, MerchantInfo merchantInfo, CustomerInfo customerInfo, PaymentInfo paymentInfo, String appId, String locale, String paymentUserAgent, String paymentObject, String intentMode, boolean setupFutureUsage, CardBrandChoice cardBrandChoice, Map<String, Boolean> flags, List<String> linkFundingSources, Map<String, String> clientAttributionMetadata) {
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        AbstractC22676k.m65750j(merchantInfo, "merchantInfo");
        AbstractC22676k.m65750j(customerInfo, "customerInfo");
        AbstractC22676k.m65750j(appId, "appId");
        AbstractC22676k.m65750j(locale, "locale");
        AbstractC22676k.m65750j(paymentUserAgent, "paymentUserAgent");
        AbstractC22676k.m65750j(paymentObject, "paymentObject");
        AbstractC22676k.m65750j(intentMode, "intentMode");
        AbstractC22676k.m65750j(flags, "flags");
        AbstractC22676k.m65750j(linkFundingSources, "linkFundingSources");
        AbstractC22676k.m65750j(clientAttributionMetadata, "clientAttributionMetadata");
        return new PopupPayload(publishableKey, stripeAccount, merchantInfo, customerInfo, paymentInfo, appId, locale, paymentUserAgent, paymentObject, intentMode, setupFutureUsage, cardBrandChoice, flags, linkFundingSources, clientAttributionMetadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PopupPayload)) {
            return false;
        }
        PopupPayload popupPayload = (PopupPayload) other;
        return AbstractC22676k.m65745e(this.publishableKey, popupPayload.publishableKey) && AbstractC22676k.m65745e(this.stripeAccount, popupPayload.stripeAccount) && AbstractC22676k.m65745e(this.merchantInfo, popupPayload.merchantInfo) && AbstractC22676k.m65745e(this.customerInfo, popupPayload.customerInfo) && AbstractC22676k.m65745e(this.paymentInfo, popupPayload.paymentInfo) && AbstractC22676k.m65745e(this.appId, popupPayload.appId) && AbstractC22676k.m65745e(this.locale, popupPayload.locale) && AbstractC22676k.m65745e(this.paymentUserAgent, popupPayload.paymentUserAgent) && AbstractC22676k.m65745e(this.paymentObject, popupPayload.paymentObject) && AbstractC22676k.m65745e(this.intentMode, popupPayload.intentMode) && this.setupFutureUsage == popupPayload.setupFutureUsage && AbstractC22676k.m65745e(this.cardBrandChoice, popupPayload.cardBrandChoice) && AbstractC22676k.m65745e(this.flags, popupPayload.flags) && AbstractC22676k.m65745e(this.linkFundingSources, popupPayload.linkFundingSources) && AbstractC22676k.m65745e(this.clientAttributionMetadata, popupPayload.clientAttributionMetadata);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final CardBrandChoice getCardBrandChoice() {
        return this.cardBrandChoice;
    }

    public final Map<String, String> getClientAttributionMetadata() {
        return this.clientAttributionMetadata;
    }

    public final CustomerInfo getCustomerInfo() {
        return this.customerInfo;
    }

    public final Map<String, String> getExperiments() {
        return this.experiments;
    }

    public final Map<String, Boolean> getFlags() {
        return this.flags;
    }

    public final String getIntegrationType() {
        return this.integrationType;
    }

    public final String getIntentMode() {
        return this.intentMode;
    }

    public final List<String> getLinkFundingSources() {
        return this.linkFundingSources;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final Map<String, String> getLoggerMetadata() {
        return this.loggerMetadata;
    }

    public final MerchantInfo getMerchantInfo() {
        return this.merchantInfo;
    }

    public final String getPath() {
        return this.path;
    }

    public final PaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    public final String getPaymentObject() {
        return this.paymentObject;
    }

    public final String getPaymentUserAgent() {
        return this.paymentUserAgent;
    }

    public final String getPublishableKey() {
        return this.publishableKey;
    }

    public final boolean getSetupFutureUsage() {
        return this.setupFutureUsage;
    }

    public final String getStripeAccount() {
        return this.stripeAccount;
    }

    public int hashCode() {
        int iHashCode = this.publishableKey.hashCode() * 31;
        String str = this.stripeAccount;
        int iHashCode2 = (this.customerInfo.hashCode() + ((this.merchantInfo.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        PaymentInfo paymentInfo = this.paymentInfo;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode2 + (paymentInfo == null ? 0 : paymentInfo.hashCode())) * 31, 31, this.appId), 31, this.locale), 31, this.paymentUserAgent), 31, this.paymentObject), 31, this.intentMode), 31, this.setupFutureUsage);
        CardBrandChoice cardBrandChoice = this.cardBrandChoice;
        return this.clientAttributionMetadata.hashCode() + AbstractC11895b.m31983b(AbstractC3855a.m11821e(this.flags, (iM8289b + (cardBrandChoice != null ? cardBrandChoice.hashCode() : 0)) * 31, 31), 31, this.linkFundingSources);
    }

    public String toString() {
        String str = this.publishableKey;
        String str2 = this.stripeAccount;
        MerchantInfo merchantInfo = this.merchantInfo;
        CustomerInfo customerInfo = this.customerInfo;
        PaymentInfo paymentInfo = this.paymentInfo;
        String str3 = this.appId;
        String str4 = this.locale;
        String str5 = this.paymentUserAgent;
        String str6 = this.paymentObject;
        String str7 = this.intentMode;
        boolean z4 = this.setupFutureUsage;
        CardBrandChoice cardBrandChoice = this.cardBrandChoice;
        Map<String, Boolean> map = this.flags;
        List<String> list = this.linkFundingSources;
        Map<String, String> map2 = this.clientAttributionMetadata;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PopupPayload(publishableKey=", str, ", stripeAccount=", str2, ", merchantInfo=");
        sbM32001t.append(merchantInfo);
        sbM32001t.append(", customerInfo=");
        sbM32001t.append(customerInfo);
        sbM32001t.append(", paymentInfo=");
        sbM32001t.append(paymentInfo);
        sbM32001t.append(", appId=");
        sbM32001t.append(str3);
        sbM32001t.append(", locale=");
        AbstractC11266d.m30444B(sbM32001t, str4, ", paymentUserAgent=", str5, ", paymentObject=");
        AbstractC11266d.m30444B(sbM32001t, str6, ", intentMode=", str7, ", setupFutureUsage=");
        sbM32001t.append(z4);
        sbM32001t.append(", cardBrandChoice=");
        sbM32001t.append(cardBrandChoice);
        sbM32001t.append(", flags=");
        sbM32001t.append(map);
        sbM32001t.append(", linkFundingSources=");
        sbM32001t.append(list);
        sbM32001t.append(", clientAttributionMetadata=");
        return AbstractC13673n.m38565l(sbM32001t, map2, ")");
    }

    public final String toUrl() {
        return AbstractC11266d.m30461o(baseUrl, Base64.encodeToString(AbstractC39421y.m125919D(PopupPayloadJson.m1833d(Companion.serializer(), this)), 2));
    }

    public PopupPayload(String publishableKey, String str, MerchantInfo merchantInfo, CustomerInfo customerInfo, PaymentInfo paymentInfo, String appId, String locale, String paymentUserAgent, String paymentObject, String intentMode, boolean z4, CardBrandChoice cardBrandChoice, Map<String, Boolean> flags, List<String> linkFundingSources, Map<String, String> clientAttributionMetadata) {
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        AbstractC22676k.m65750j(merchantInfo, "merchantInfo");
        AbstractC22676k.m65750j(customerInfo, "customerInfo");
        AbstractC22676k.m65750j(appId, "appId");
        AbstractC22676k.m65750j(locale, "locale");
        AbstractC22676k.m65750j(paymentUserAgent, "paymentUserAgent");
        AbstractC22676k.m65750j(paymentObject, "paymentObject");
        AbstractC22676k.m65750j(intentMode, "intentMode");
        AbstractC22676k.m65750j(flags, "flags");
        AbstractC22676k.m65750j(linkFundingSources, "linkFundingSources");
        AbstractC22676k.m65750j(clientAttributionMetadata, "clientAttributionMetadata");
        this.publishableKey = publishableKey;
        this.stripeAccount = str;
        this.merchantInfo = merchantInfo;
        this.customerInfo = customerInfo;
        this.paymentInfo = paymentInfo;
        this.appId = appId;
        this.locale = locale;
        this.paymentUserAgent = paymentUserAgent;
        this.paymentObject = paymentObject;
        this.intentMode = intentMode;
        this.setupFutureUsage = z4;
        this.cardBrandChoice = cardBrandChoice;
        this.flags = flags;
        this.linkFundingSources = linkFundingSources;
        this.clientAttributionMetadata = clientAttributionMetadata;
        this.path = "mobile_pay";
        this.integrationType = "mobile";
        UUID uuid = AbstractC39851c.f172106g;
        this.loggerMetadata = AbstractC31061c.m95645u(MOBILE_SESSION_ID_KEY, AbstractC39851c.f172106g.toString());
        this.experiments = C25272z.f99163w;
    }
}
