package com.stripe.android.core.networking;

import ad3.C0771n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import i93.C18284j;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.api.QueryParams;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p318m3.C24977g;
import p664yy.AbstractC39872m0;
import p664yy.AbstractC39877q;
import p664yy.C39853d;
import p664yy.EnumC39868k0;
import p664yy.EnumC39870l0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yb3.AbstractC39397a;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yc3.InterfaceC39443g;
import yv0.C39805h;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0012\n\u0002\b\b\b\u0087\b\u0018\u0000 ^2\u00020\u0001:\u0003_`aB1\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0099\u0001\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\n\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\f¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010$J\u0010\u0010(\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0002H\u0002¢\u0006\u0004\b/\u0010$J)\u00102\u001a\u00020\u00022\u000e\u00100\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000f2\b\b\u0002\u00101\u001a\u00020\fH\u0002¢\u0006\u0004\b2\u00103J\u001b\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020*0\u000fH\u0002¢\u0006\u0004\b4\u00105J!\u00106\u001a\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\u000f2\u0006\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b8\u0010$J\u0010\u00109\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b9\u0010$J\u0010\u0010:\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\b:\u0010;JB\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÂ\u0001¢\u0006\u0004\b<\u0010=J'\u0010E\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0001¢\u0006\u0004\bC\u0010DR\u0017\u0010\u0003\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010$R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010FR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010FR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010HR\u0017\u0010\t\u001a\u00020\b8G¢\u0006\f\n\u0004\b\t\u0010I\u001a\u0004\bJ\u0010&R \u0010\u000e\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010F\u0012\u0004\bL\u0010M\u001a\u0004\bK\u0010$R&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010N\u001a\u0004\bO\u00105R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010S\u001a\u0004\bT\u0010UR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010V\u001a\u0004\bW\u0010XR\u001a\u0010\u0017\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0017\u0010F\u001a\u0004\bY\u0010$R\u0014\u0010]\u001a\u00020Z8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\¨\u0006b"}, m65681d2 = {"Lcom/stripe/android/core/networking/AnalyticsRequestV2;", "Lyy/m0;", "", "eventName", "clientId", AnalyticsRequestV2.HEADER_ORIGIN, "", AnalyticsRequestV2.PARAM_CREATED, "Lkotlinx/serialization/json/JsonElement;", "params", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;)V", "", "seen0", "postParameters", "", "headers", "Lyy/k0;", "method", "Lyy/l0;", "mimeType", "", "retryResponseCodes", QueryParams.URL, "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;Ljava/lang/String;Ljava/util/Map;Lyy/k0;Lyy/l0;Ljava/lang/Iterable;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Ljava/io/OutputStream;", "outputStream", "Ll83/a0;", "writePostBody", "(Ljava/io/OutputStream;)V", "runAttemptCount", "withWorkManagerParams", "(I)Lcom/stripe/android/core/networking/AnalyticsRequestV2;", "component1", "()Ljava/lang/String;", "component5", "()Lkotlinx/serialization/json/JsonElement;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "createPostParams", "map", "level", "encodeMapParam", "(Ljava/util/Map;I)Ljava/lang/String;", "analyticParams", "()Ljava/util/Map;", "createWorkManagerParams", "(I)Ljava/util/Map;", "component2", "component3", "component4", "()D", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkotlinx/serialization/json/JsonElement;)Lcom/stripe/android/core/networking/AnalyticsRequestV2;", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "write$Self$stripe_core_release", "(Lcom/stripe/android/core/networking/AnalyticsRequestV2;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getEventName", "D", "Lkotlinx/serialization/json/JsonElement;", "getParams", "getPostParameters$stripe_core_release", "getPostParameters$stripe_core_release$annotations", "()V", "Ljava/util/Map;", "getHeaders", "Lyy/k0;", "getMethod", "()Lyy/k0;", "Lyy/l0;", "getMimeType", "()Lyy/l0;", "Ljava/lang/Iterable;", "getRetryResponseCodes", "()Ljava/lang/Iterable;", "getUrl", "", "getPostBodyBytes", "()[B", "postBodyBytes", "Companion", "yy/d", "com/stripe/android/core/networking/a", "$serializer", "stripe-core_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AnalyticsRequestV2 extends AbstractC39872m0 {
    private static final InterfaceC37138c[] $childSerializers;
    public static final String ANALYTICS_HOST = "https://r.stripe.com/0";
    public static final C5598a Companion = new C5598a();
    public static final String HEADER_ORIGIN = "origin";
    private static final String INDENTATION = "  ";
    public static final String PARAM_CLIENT_ID = "client_id";
    public static final String PARAM_CREATED = "created";
    private static final String PARAM_DELAYED = "delayed";
    public static final String PARAM_EVENT_ID = "event_id";
    public static final String PARAM_EVENT_NAME = "event_name";
    private static final String PARAM_IS_RETRY = "is_retry";
    private static final String PARAM_USES_WORK_MANAGER = "uses_work_manager";
    private final String clientId;
    private final double created;
    private final String eventName;
    private final Map<String, String> headers;
    private final EnumC39868k0 method;
    private final EnumC39870l0 mimeType;
    private final String origin;
    private final JsonElement params;
    private final String postParameters;
    private final Iterable<Integer> retryResponseCodes;
    private final String url;

    static {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        $childSerializers = new InterfaceC37138c[]{null, null, null, null, null, null, new LinkedHashMapSerializer(stringSerializer, stringSerializer), EnumsKt.createSimpleEnumSerializer("com.stripe.android.core.networking.StripeRequest.Method", EnumC39868k0.values()), EnumsKt.createSimpleEnumSerializer("com.stripe.android.core.networking.StripeRequest.MimeType", EnumC39870l0.values()), new C37140e(AbstractC22671h0.f89337a.getOrCreateKotlinClass(Iterable.class), new Annotation[0]), null};
    }

    public /* synthetic */ AnalyticsRequestV2(String str, String str2, String str3, double d3, JsonElement jsonElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, d3, jsonElement);
    }

    private final Map<String, Object> analyticParams() {
        return AbstractC25247g0.m73990Y(new C23465k(PARAM_CLIENT_ID, this.clientId), new C23465k(PARAM_CREATED, Double.valueOf(this.created)), new C23465k(PARAM_EVENT_NAME, this.eventName), new C23465k(PARAM_EVENT_ID, UUID.randomUUID().toString()));
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getClientId() {
        return this.clientId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final String getOrigin() {
        return this.origin;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final double getCreated() {
        return this.created;
    }

    private final AnalyticsRequestV2 copy(String eventName, String clientId, String origin, double created, JsonElement params) {
        return new AnalyticsRequestV2(eventName, clientId, origin, created, params);
    }

    public static /* synthetic */ AnalyticsRequestV2 copy$default(AnalyticsRequestV2 analyticsRequestV2, String str, String str2, String str3, double d3, JsonElement jsonElement, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = analyticsRequestV2.eventName;
        }
        if ((i13 & 2) != 0) {
            str2 = analyticsRequestV2.clientId;
        }
        if ((i13 & 4) != 0) {
            str3 = analyticsRequestV2.origin;
        }
        if ((i13 & 8) != 0) {
            d3 = analyticsRequestV2.created;
        }
        if ((i13 & 16) != 0) {
            jsonElement = analyticsRequestV2.params;
        }
        JsonElement jsonElement2 = jsonElement;
        String str4 = str3;
        return analyticsRequestV2.copy(str, str2, str4, d3, jsonElement2);
    }

    private final String createPostParams() {
        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(AbstractC39877q.m127955l(this.params), analyticParams());
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : AbstractC39877q.m127945b(linkedHashMapM73995d0).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                arrayList.add(new C39853d(str, encodeMapParam$default(this, (Map) value, 0, 2, null)));
            } else {
                arrayList.add(new C39853d(str, value.toString()));
            }
        }
        return AbstractC25265s.m74110N0(arrayList, "&", null, null, new C39805h(6), 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence createPostParams$lambda$1(C39853d it) {
        AbstractC22676k.m65750j(it, "it");
        return it.toString();
    }

    private final Map<String, ?> createWorkManagerParams(int runAttemptCount) {
        Duration.Companion companion = Duration.INSTANCE;
        return AbstractC25247g0.m73990Y(new C23465k(PARAM_USES_WORK_MANAGER, Boolean.TRUE), new C23465k(PARAM_IS_RETRY, Boolean.valueOf(runAttemptCount > 0)), new C23465k(PARAM_DELAYED, Boolean.valueOf(Duration.m134298toDoubleimpl(DurationKt.toDuration(System.currentTimeMillis(), DurationUnit.MILLISECONDS), DurationUnit.SECONDS) - this.created > 5.0d)));
    }

    private final String encodeMapParam(Map<?, ?> map, int level) {
        StringBuilder sb4 = new StringBuilder("{\n");
        boolean z4 = true;
        for (Map.Entry entry : AbstractC25247g0.m74006o0(map, new C24977g(19)).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            String strEncodeMapParam = value instanceof Map ? encodeMapParam((Map) value, level + 1) : value == null ? "" : AbstractC18489d0.m53369j(value, "\"", "\"");
            if (!AbstractC39414r.m125890i0(strEncodeMapParam)) {
                if (z4) {
                    sb4.append(AbstractC39421y.m125925J(level, INDENTATION));
                    sb4.append("  \"" + key + "\": " + strEncodeMapParam);
                    z4 = false;
                } else {
                    sb4.append(",\n");
                    sb4.append(AbstractC39421y.m125925J(level, INDENTATION));
                    sb4.append("  \"" + key + "\": " + strEncodeMapParam);
                }
            }
        }
        sb4.append('\n');
        sb4.append(AbstractC39421y.m125925J(level, INDENTATION));
        sb4.append("}");
        String string = sb4.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String encodeMapParam$default(AnalyticsRequestV2 analyticsRequestV2, Map map, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i13 = 0;
        }
        return analyticsRequestV2.encodeMapParam(map, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int encodeMapParam$lambda$2(Object obj, Object obj2) {
        return String.valueOf(obj).compareTo(String.valueOf(obj2));
    }

    private final byte[] getPostBodyBytes() throws UnsupportedEncodingException {
        byte[] bytes = this.postParameters.getBytes(AbstractC39397a.f169546a);
        AbstractC22676k.m65749i(bytes, "getBytes(...)");
        return bytes;
    }

    public static /* synthetic */ void getPostParameters$stripe_core_release$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:13:0x007c  */
    public static final void write$Self$stripe_core_release(AnalyticsRequestV2 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.eventName);
        output.encodeStringElement(serialDesc, 1, self.clientId);
        output.encodeStringElement(serialDesc, 2, self.origin);
        output.encodeDoubleElement(serialDesc, 3, self.created);
        output.encodeSerializableElement(serialDesc, 4, C0771n.f2806a, self.params);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !AbstractC22676k.m65745e(self.postParameters, self.createPostParams())) {
            output.encodeStringElement(serialDesc, 5, self.postParameters);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6)) {
            output.encodeSerializableElement(serialDesc, 6, interfaceC37138cArr[6], self.getHeaders());
        } else {
            Map<String, String> headers = self.getHeaders();
            EnumC39870l0 enumC39870l0 = EnumC39870l0.Form;
            if (!AbstractC22676k.m65745e(headers, AbstractC25247g0.m73990Y(new C23465k("Content-Type", AbstractC11266d.m30461o("application/x-www-form-urlencoded; charset=", AbstractC39397a.f169546a.name())), new C23465k(HEADER_ORIGIN, self.origin), new C23465k("User-Agent", "Stripe/v1 android/22.6.1")))) {
                output.encodeSerializableElement(serialDesc, 6, interfaceC37138cArr[6], self.getHeaders());
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.getMethod() != EnumC39868k0.POST) {
            output.encodeSerializableElement(serialDesc, 7, interfaceC37138cArr[7], self.getMethod());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.getMimeType() != EnumC39870l0.Form) {
            output.encodeSerializableElement(serialDesc, 8, interfaceC37138cArr[8], self.getMimeType());
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !AbstractC22676k.m65745e(self.getRetryResponseCodes(), new C18284j(429, 429, 1))) {
            output.encodeSerializableElement(serialDesc, 9, interfaceC37138cArr[9], self.getRetryResponseCodes());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && AbstractC22676k.m65745e(self.getUrl(), ANALYTICS_HOST)) {
            return;
        }
        output.encodeStringElement(serialDesc, 10, self.getUrl());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final JsonElement getParams() {
        return this.params;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsRequestV2)) {
            return false;
        }
        AnalyticsRequestV2 analyticsRequestV2 = (AnalyticsRequestV2) other;
        return AbstractC22676k.m65745e(this.eventName, analyticsRequestV2.eventName) && AbstractC22676k.m65745e(this.clientId, analyticsRequestV2.clientId) && AbstractC22676k.m65745e(this.origin, analyticsRequestV2.origin) && Double.compare(this.created, analyticsRequestV2.created) == 0 && AbstractC22676k.m65745e(this.params, analyticsRequestV2.params);
    }

    public final String getEventName() {
        return this.eventName;
    }

    @Override // p664yy.AbstractC39872m0
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // p664yy.AbstractC39872m0
    public EnumC39868k0 getMethod() {
        return this.method;
    }

    public EnumC39870l0 getMimeType() {
        return this.mimeType;
    }

    public final JsonElement getParams() {
        return this.params;
    }

    /* JADX INFO: renamed from: getPostParameters$stripe_core_release, reason: from getter */
    public final String getPostParameters() {
        return this.postParameters;
    }

    @Override // p664yy.AbstractC39872m0
    public Iterable<Integer> getRetryResponseCodes() {
        return this.retryResponseCodes;
    }

    @Override // p664yy.AbstractC39872m0
    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.params.hashCode() + AbstractC17176i.m48499a(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.eventName.hashCode() * 31, 31, this.clientId), 31, this.origin), 31, this.created);
    }

    public String toString() {
        String str = this.eventName;
        String str2 = this.clientId;
        String str3 = this.origin;
        double d3 = this.created;
        JsonElement jsonElement = this.params;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AnalyticsRequestV2(eventName=", str, ", clientId=", str2, ", origin=");
        sbM32001t.append(str3);
        sbM32001t.append(", created=");
        sbM32001t.append(d3);
        sbM32001t.append(", params=");
        sbM32001t.append(jsonElement);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public final AnalyticsRequestV2 withWorkManagerParams(int runAttemptCount) {
        return copy$default(this, null, null, null, 0.0d, AbstractC39877q.m127954k(AbstractC25247g0.m73995d0(AbstractC39877q.m127955l(this.params), createWorkManagerParams(runAttemptCount))), 15, null);
    }

    @Override // p664yy.AbstractC39872m0
    public void writePostBody(OutputStream outputStream) throws IOException {
        AbstractC22676k.m65750j(outputStream, "outputStream");
        outputStream.write(getPostBodyBytes());
        outputStream.flush();
    }

    private AnalyticsRequestV2(String str, String str2, String str3, double d3, JsonElement jsonElement) {
        this.eventName = str;
        this.clientId = str2;
        this.origin = str3;
        this.created = d3;
        this.params = jsonElement;
        this.postParameters = createPostParams();
        EnumC39870l0 enumC39870l0 = EnumC39870l0.Form;
        this.headers = AbstractC25247g0.m73990Y(new C23465k("Content-Type", AbstractC11266d.m30461o("application/x-www-form-urlencoded; charset=", AbstractC39397a.f169546a.name())), new C23465k(HEADER_ORIGIN, str3), new C23465k("User-Agent", "Stripe/v1 android/22.6.1"));
        this.method = EnumC39868k0.POST;
        this.mimeType = enumC39870l0;
        this.retryResponseCodes = new C18284j(429, 429, 1);
        this.url = ANALYTICS_HOST;
    }

    public AnalyticsRequestV2(int i13, String str, String str2, String str3, double d3, JsonElement jsonElement, String str4, Map map, EnumC39868k0 enumC39868k0, EnumC39870l0 enumC39870l0, Iterable iterable, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, AnalyticsRequestV2$$serializer.INSTANCE.getDescriptor());
        }
        this.eventName = str;
        this.clientId = str2;
        this.origin = str3;
        this.created = d3;
        this.params = jsonElement;
        if ((i13 & 32) == 0) {
            this.postParameters = createPostParams();
        } else {
            this.postParameters = str4;
        }
        if ((i13 & 64) == 0) {
            EnumC39870l0 enumC39870l1 = EnumC39870l0.Form;
            this.headers = AbstractC25247g0.m73990Y(new C23465k("Content-Type", AbstractC11266d.m30461o("application/x-www-form-urlencoded; charset=", AbstractC39397a.f169546a.name())), new C23465k(HEADER_ORIGIN, str3), new C23465k("User-Agent", "Stripe/v1 android/22.6.1"));
        } else {
            this.headers = map;
        }
        if ((i13 & 128) == 0) {
            this.method = EnumC39868k0.POST;
        } else {
            this.method = enumC39868k0;
        }
        if ((i13 & 256) == 0) {
            this.mimeType = EnumC39870l0.Form;
        } else {
            this.mimeType = enumC39870l0;
        }
        if ((i13 & 512) == 0) {
            this.retryResponseCodes = new C18284j(429, 429, 1);
        } else {
            this.retryResponseCodes = iterable;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.url = ANALYTICS_HOST;
        } else {
            this.url = str5;
        }
    }
}
