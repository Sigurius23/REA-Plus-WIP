package com.amplitude.android.engagement.types;

import ad3.C0771n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import l83.InterfaceC23457c;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 Z2\u00020\u0001:\u0002[\\BÑ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017BÓ\u0001\b\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0011\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0016\b\u0001\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0016\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001dJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001dJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001dJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001dJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001dJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001dJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b+\u0010,J\u001c\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003¢\u0006\u0004\b-\u0010.JÚ\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\u001dJ\u0010\u00102\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107J(\u0010>\u001a\u00020=2\u0006\u00108\u001a\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;HÇ\u0001¢\u0006\u0004\b>\u0010?R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010@\u0012\u0004\bB\u0010C\u001a\u0004\bA\u0010\u001dR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010@\u0012\u0004\bE\u0010C\u001a\u0004\bD\u0010\u001dR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bF\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bG\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bH\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bI\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\bJ\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bK\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bL\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bM\u0010\u001dR\"\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010@\u0012\u0004\bO\u0010C\u001a\u0004\bN\u0010\u001dR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bP\u0010\u001dR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010@\u001a\u0004\bQ\u0010\u001dR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010@\u0012\u0004\bS\u0010C\u001a\u0004\bR\u0010\u001dR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010T\u0012\u0004\bV\u0010C\u001a\u0004\bU\u0010,R,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010W\u0012\u0004\bY\u0010C\u001a\u0004\bX\u0010.¨\u0006]"}, m65681d2 = {"Lcom/amplitude/android/engagement/types/EndUser;", "", "", "userId", "deviceId", "country", "city", "region", "dma", "language", "platform", "version", "os", "deviceModel", "carrier", "library", "userAgent", "", "sessionId", "", "Lkotlinx/serialization/json/JsonElement;", "userProperties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "()Ljava/lang/Integer;", "component16", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;)Lcom/amplitude/android/engagement/types/EndUser;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self", "(Lcom/amplitude/android/engagement/types/EndUser;Lzc3/c;Lyc3/g;)V", "Ljava/lang/String;", "getUserId", "getUserId$annotations", "()V", "getDeviceId", "getDeviceId$annotations", "getCountry", "getCity", "getRegion", "getDma", "getLanguage", "getPlatform", "getVersion", "getOs", "getDeviceModel", "getDeviceModel$annotations", "getCarrier", "getLibrary", "getUserAgent", "getUserAgent$annotations", "Ljava/lang/Integer;", "getSessionId", "getSessionId$annotations", "Ljava/util/Map;", "getUserProperties", "getUserProperties$annotations", "Companion", "$serializer", "com/amplitude/android/engagement/types/u", "engagement_release"}, m65682k = 1, m65683mv = {1, 8, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class EndUser {
    public static final int $stable = 8;
    private final String carrier;
    private final String city;
    private final String country;
    private final String deviceId;
    private final String deviceModel;
    private final String dma;
    private final String language;
    private final String library;
    private final String os;
    private final String platform;
    private final String region;
    private final Integer sessionId;
    private final String userAgent;
    private final String userId;
    private final Map<String, JsonElement> userProperties;
    private final String version;
    public static final C4937u Companion = new C4937u();
    private static final InterfaceC37138c[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new LinkedHashMapSerializer(StringSerializer.INSTANCE, C0771n.f2806a)};

    public EndUser() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (Map) null, 65535, (DefaultConstructorMarker) null);
    }

    @InterfaceC37143h("device_id")
    public static /* synthetic */ void getDeviceId$annotations() {
    }

    @InterfaceC37143h("device_model")
    public static /* synthetic */ void getDeviceModel$annotations() {
    }

    @InterfaceC37143h("session_id")
    public static /* synthetic */ void getSessionId$annotations() {
    }

    @InterfaceC37143h("user_agent")
    public static /* synthetic */ void getUserAgent$annotations() {
    }

    @InterfaceC37143h("user_id")
    public static /* synthetic */ void getUserId$annotations() {
    }

    @InterfaceC37143h("user_properties")
    public static /* synthetic */ void getUserProperties$annotations() {
    }

    public static final /* synthetic */ void write$Self(EndUser self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC37138c[] interfaceC37138cArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.userId != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.userId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.deviceId != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.deviceId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.country != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.country);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.city != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.city);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.region != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.region);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.dma != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.dma);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.language != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.language);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.platform != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.platform);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.version != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.version);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.os != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.os);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.deviceModel != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.deviceModel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.carrier != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.carrier);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.library != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, self.library);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.userAgent != null) {
            output.encodeNullableSerializableElement(serialDesc, 13, StringSerializer.INSTANCE, self.userAgent);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.sessionId != null) {
            output.encodeNullableSerializableElement(serialDesc, 14, IntSerializer.INSTANCE, self.sessionId);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 15) && AbstractC22676k.m65745e(self.userProperties, C25272z.f99163w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 15, interfaceC37138cArr[15], self.userProperties);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCarrier() {
        return this.carrier;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getLibrary() {
        return this.library;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getUserAgent() {
        return this.userAgent;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getSessionId() {
        return this.sessionId;
    }

    public final Map<String, JsonElement> component16() {
        return this.userProperties;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDma() {
        return this.dma;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final EndUser copy(String userId, String deviceId, String country, String city, String region, String dma, String language, String platform, String version, String os2, String deviceModel, String carrier, String library, String userAgent, Integer sessionId, Map<String, ? extends JsonElement> userProperties) {
        AbstractC22676k.m65750j(userProperties, "userProperties");
        return new EndUser(userId, deviceId, country, city, region, dma, language, platform, version, os2, deviceModel, carrier, library, userAgent, sessionId, userProperties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EndUser)) {
            return false;
        }
        EndUser endUser = (EndUser) other;
        return AbstractC22676k.m65745e(this.userId, endUser.userId) && AbstractC22676k.m65745e(this.deviceId, endUser.deviceId) && AbstractC22676k.m65745e(this.country, endUser.country) && AbstractC22676k.m65745e(this.city, endUser.city) && AbstractC22676k.m65745e(this.region, endUser.region) && AbstractC22676k.m65745e(this.dma, endUser.dma) && AbstractC22676k.m65745e(this.language, endUser.language) && AbstractC22676k.m65745e(this.platform, endUser.platform) && AbstractC22676k.m65745e(this.version, endUser.version) && AbstractC22676k.m65745e(this.os, endUser.os) && AbstractC22676k.m65745e(this.deviceModel, endUser.deviceModel) && AbstractC22676k.m65745e(this.carrier, endUser.carrier) && AbstractC22676k.m65745e(this.library, endUser.library) && AbstractC22676k.m65745e(this.userAgent, endUser.userAgent) && AbstractC22676k.m65745e(this.sessionId, endUser.sessionId) && AbstractC22676k.m65745e(this.userProperties, endUser.userProperties);
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getDma() {
        return this.dma;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getLibrary() {
        return this.library;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getRegion() {
        return this.region;
    }

    public final Integer getSessionId() {
        return this.sessionId;
    }

    public final String getUserAgent() {
        return this.userAgent;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final Map<String, JsonElement> getUserProperties() {
        return this.userProperties;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.userId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.deviceId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.country;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.city;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.region;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.dma;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.language;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.platform;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.version;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.os;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.deviceModel;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.carrier;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.library;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.userAgent;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Integer num = this.sessionId;
        return this.userProperties.hashCode() + ((iHashCode14 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public String toString() {
        StringBuilder sb4 = new StringBuilder("EndUser(userId=");
        sb4.append(this.userId);
        sb4.append(", deviceId=");
        sb4.append(this.deviceId);
        sb4.append(", country=");
        sb4.append(this.country);
        sb4.append(", city=");
        sb4.append(this.city);
        sb4.append(", region=");
        sb4.append(this.region);
        sb4.append(", dma=");
        sb4.append(this.dma);
        sb4.append(", language=");
        sb4.append(this.language);
        sb4.append(", platform=");
        sb4.append(this.platform);
        sb4.append(", version=");
        sb4.append(this.version);
        sb4.append(", os=");
        sb4.append(this.os);
        sb4.append(", deviceModel=");
        sb4.append(this.deviceModel);
        sb4.append(", carrier=");
        sb4.append(this.carrier);
        sb4.append(", library=");
        sb4.append(this.library);
        sb4.append(", userAgent=");
        sb4.append(this.userAgent);
        sb4.append(", sessionId=");
        sb4.append(this.sessionId);
        sb4.append(", userProperties=");
        return AbstractC30802r.m94764m(sb4, this.userProperties, ')');
    }

    @InterfaceC23457c
    public /* synthetic */ EndUser(int i13, @InterfaceC37143h("user_id") String str, @InterfaceC37143h("device_id") String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, @InterfaceC37143h("device_model") String str11, String str12, String str13, @InterfaceC37143h("user_agent") String str14, @InterfaceC37143h("session_id") Integer num, @InterfaceC37143h("user_properties") Map map, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.userId = null;
        } else {
            this.userId = str;
        }
        if ((i13 & 2) == 0) {
            this.deviceId = null;
        } else {
            this.deviceId = str2;
        }
        if ((i13 & 4) == 0) {
            this.country = null;
        } else {
            this.country = str3;
        }
        if ((i13 & 8) == 0) {
            this.city = null;
        } else {
            this.city = str4;
        }
        if ((i13 & 16) == 0) {
            this.region = null;
        } else {
            this.region = str5;
        }
        if ((i13 & 32) == 0) {
            this.dma = null;
        } else {
            this.dma = str6;
        }
        if ((i13 & 64) == 0) {
            this.language = null;
        } else {
            this.language = str7;
        }
        if ((i13 & 128) == 0) {
            this.platform = null;
        } else {
            this.platform = str8;
        }
        if ((i13 & 256) == 0) {
            this.version = null;
        } else {
            this.version = str9;
        }
        if ((i13 & 512) == 0) {
            this.os = null;
        } else {
            this.os = str10;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.deviceModel = null;
        } else {
            this.deviceModel = str11;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.carrier = null;
        } else {
            this.carrier = str12;
        }
        if ((i13 & 4096) == 0) {
            this.library = null;
        } else {
            this.library = str13;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
            this.userAgent = null;
        } else {
            this.userAgent = str14;
        }
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
            this.sessionId = null;
        } else {
            this.sessionId = num;
        }
        this.userProperties = (i13 & 32768) == 0 ? C25272z.f99163w : map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EndUser(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Integer num, Map<String, ? extends JsonElement> userProperties) {
        AbstractC22676k.m65750j(userProperties, "userProperties");
        this.userId = str;
        this.deviceId = str2;
        this.country = str3;
        this.city = str4;
        this.region = str5;
        this.dma = str6;
        this.language = str7;
        this.platform = str8;
        this.version = str9;
        this.os = str10;
        this.deviceModel = str11;
        this.carrier = str12;
        this.library = str13;
        this.userAgent = str14;
        this.sessionId = num;
        this.userProperties = userProperties;
    }

    public /* synthetic */ EndUser(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Integer num, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : str6, (i13 & 64) != 0 ? null : str7, (i13 & 128) != 0 ? null : str8, (i13 & 256) != 0 ? null : str9, (i13 & 512) != 0 ? null : str10, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str11, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str12, (i13 & 4096) != 0 ? null : str13, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : str14, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? null : num, (i13 & 32768) != 0 ? C25272z.f99163w : map);
    }
}
