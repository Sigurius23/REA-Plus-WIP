package com.whoop.navigation;

import ad3.C0771n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25272z;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p710im1.C18681l0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0002OPB³\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016B³\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001dJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u001e\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001dJ\u0010\u0010*\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b*\u0010(J\u0010\u0010+\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b+\u0010(J\u0010\u0010,\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b,\u0010(J\u0010\u0010-\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b-\u0010(JÂ\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u001dJ\u0010\u00101\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u00020\u000e2\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106J'\u0010?\u001a\u00020<2\u0006\u00107\u001a\u00020\u00002\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0001¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010@\u001a\u0004\bB\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bC\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bD\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bE\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\bF\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\bG\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bH\u0010\u001dR%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010I\u001a\u0004\bJ\u0010&R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010K\u001a\u0004\bL\u0010(R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010@\u001a\u0004\bM\u0010\u001dR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010K\u001a\u0004\b\u0011\u0010(R\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0012\u0010K\u001a\u0004\b\u0012\u0010(R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010K\u001a\u0004\b\u0013\u0010(R\u0017\u0010\u0014\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0014\u0010K\u001a\u0004\b\u0014\u0010(¨\u0006Q"}, m65681d2 = {"Lcom/whoop/navigation/AiCoachChatScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "fingerprint", "sourceId", "sourceType", "staticInitialMessage", "userMessage", "onboardingAnalyticSource", "educationType", "presetQuestionKey", "", "Lkotlinx/serialization/json/JsonElement;", "args", "", "shouldOpenFullSize", "coachEverywhereMainContent", "isCoachEverywhereDetailScreen", "isPrefetchEnabled", "isPushNavigationEnabled", "isWhoopCoachEverywhere", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;ZZZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;ZZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Ljava/util/Map;", "component10", "()Z", "component11", "component12", "component13", "component14", "component15", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;ZZZZ)Lcom/whoop/navigation/AiCoachChatScreenModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/AiCoachChatScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getFingerprint", "getSourceId", "getSourceType", "getStaticInitialMessage", "getUserMessage", "getOnboardingAnalyticSource", "getEducationType", "getPresetQuestionKey", "Ljava/util/Map;", "getArgs", "Z", "getShouldOpenFullSize", "getCoachEverywhereMainContent", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AiCoachChatScreenModel implements CommonNavigationScreenModel {
    private final Map<String, JsonElement> args;
    private final String coachEverywhereMainContent;
    private final String educationType;
    private final String fingerprint;
    private final boolean isCoachEverywhereDetailScreen;
    private final boolean isPrefetchEnabled;
    private final boolean isPushNavigationEnabled;
    private final boolean isWhoopCoachEverywhere;
    private final String onboardingAnalyticSource;
    private final String presetQuestionKey;
    private final boolean shouldOpenFullSize;
    private final String sourceId;
    private final String sourceType;
    private final String staticInitialMessage;
    private final String userMessage;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C18681l0(26)), null, null, null, null, null, null};

    /* JADX INFO: renamed from: com.whoop.navigation.AiCoachChatScreenModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/AiCoachChatScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/AiCoachChatScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AiCoachChatScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AiCoachChatScreenModel(int i13, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map, boolean z4, String str9, boolean z13, boolean z14, boolean z15, boolean z16, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, AiCoachChatScreenModel$$serializer.INSTANCE.getDescriptor());
        }
        this.fingerprint = str;
        this.sourceId = str2;
        this.sourceType = str3;
        if ((i13 & 8) == 0) {
            this.staticInitialMessage = null;
        } else {
            this.staticInitialMessage = str4;
        }
        if ((i13 & 16) == 0) {
            this.userMessage = null;
        } else {
            this.userMessage = str5;
        }
        if ((i13 & 32) == 0) {
            this.onboardingAnalyticSource = null;
        } else {
            this.onboardingAnalyticSource = str6;
        }
        if ((i13 & 64) == 0) {
            this.educationType = null;
        } else {
            this.educationType = str7;
        }
        if ((i13 & 128) == 0) {
            this.presetQuestionKey = null;
        } else {
            this.presetQuestionKey = str8;
        }
        if ((i13 & 256) == 0) {
            this.args = C25272z.f99163w;
        } else {
            this.args = map;
        }
        if ((i13 & 512) == 0) {
            this.shouldOpenFullSize = false;
        } else {
            this.shouldOpenFullSize = z4;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.coachEverywhereMainContent = null;
        } else {
            this.coachEverywhereMainContent = str9;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.isCoachEverywhereDetailScreen = false;
        } else {
            this.isCoachEverywhereDetailScreen = z13;
        }
        this.isPrefetchEnabled = (i13 & 4096) == 0 ? true : z14;
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0) {
            this.isPushNavigationEnabled = false;
        } else {
            this.isPushNavigationEnabled = z15;
        }
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 0) {
            this.isWhoopCoachEverywhere = false;
        } else {
            this.isWhoopCoachEverywhere = z16;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, C0771n.f2806a);
    }

    public static final /* synthetic */ void write$Self$navigation_release(AiCoachChatScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.fingerprint);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.sourceId);
        output.encodeStringElement(serialDesc, 2, self.sourceType);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.staticInitialMessage != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.staticInitialMessage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.userMessage != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.userMessage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.onboardingAnalyticSource != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.onboardingAnalyticSource);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.educationType != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.educationType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.presetQuestionKey != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.presetQuestionKey);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !AbstractC22676k.m65745e(self.args, C25272z.f99163w)) {
            output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.args);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.shouldOpenFullSize) {
            output.encodeBooleanElement(serialDesc, 9, self.shouldOpenFullSize);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.coachEverywhereMainContent != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, stringSerializer, self.coachEverywhereMainContent);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.isCoachEverywhereDetailScreen) {
            output.encodeBooleanElement(serialDesc, 11, self.isCoachEverywhereDetailScreen);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || !self.isPrefetchEnabled) {
            output.encodeBooleanElement(serialDesc, 12, self.isPrefetchEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.isPushNavigationEnabled) {
            output.encodeBooleanElement(serialDesc, 13, self.isPushNavigationEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 14) || self.isWhoopCoachEverywhere) {
            output.encodeBooleanElement(serialDesc, 14, self.isWhoopCoachEverywhere);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFingerprint() {
        return this.fingerprint;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getShouldOpenFullSize() {
        return this.shouldOpenFullSize;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getCoachEverywhereMainContent() {
        return this.coachEverywhereMainContent;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsCoachEverywhereDetailScreen() {
        return this.isCoachEverywhereDetailScreen;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final boolean getIsPrefetchEnabled() {
        return this.isPrefetchEnabled;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getIsPushNavigationEnabled() {
        return this.isPushNavigationEnabled;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final boolean getIsWhoopCoachEverywhere() {
        return this.isWhoopCoachEverywhere;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSourceType() {
        return this.sourceType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStaticInitialMessage() {
        return this.staticInitialMessage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUserMessage() {
        return this.userMessage;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOnboardingAnalyticSource() {
        return this.onboardingAnalyticSource;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getEducationType() {
        return this.educationType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPresetQuestionKey() {
        return this.presetQuestionKey;
    }

    public final Map<String, JsonElement> component9() {
        return this.args;
    }

    public final AiCoachChatScreenModel copy(String fingerprint, String sourceId, String sourceType, String staticInitialMessage, String userMessage, String onboardingAnalyticSource, String educationType, String presetQuestionKey, Map<String, ? extends JsonElement> args, boolean shouldOpenFullSize, String coachEverywhereMainContent, boolean isCoachEverywhereDetailScreen, boolean isPrefetchEnabled, boolean isPushNavigationEnabled, boolean isWhoopCoachEverywhere) {
        AbstractC22676k.m65750j(fingerprint, "fingerprint");
        AbstractC22676k.m65750j(sourceType, "sourceType");
        return new AiCoachChatScreenModel(fingerprint, sourceId, sourceType, staticInitialMessage, userMessage, onboardingAnalyticSource, educationType, presetQuestionKey, args, shouldOpenFullSize, coachEverywhereMainContent, isCoachEverywhereDetailScreen, isPrefetchEnabled, isPushNavigationEnabled, isWhoopCoachEverywhere);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiCoachChatScreenModel)) {
            return false;
        }
        AiCoachChatScreenModel aiCoachChatScreenModel = (AiCoachChatScreenModel) other;
        return AbstractC22676k.m65745e(this.fingerprint, aiCoachChatScreenModel.fingerprint) && AbstractC22676k.m65745e(this.sourceId, aiCoachChatScreenModel.sourceId) && AbstractC22676k.m65745e(this.sourceType, aiCoachChatScreenModel.sourceType) && AbstractC22676k.m65745e(this.staticInitialMessage, aiCoachChatScreenModel.staticInitialMessage) && AbstractC22676k.m65745e(this.userMessage, aiCoachChatScreenModel.userMessage) && AbstractC22676k.m65745e(this.onboardingAnalyticSource, aiCoachChatScreenModel.onboardingAnalyticSource) && AbstractC22676k.m65745e(this.educationType, aiCoachChatScreenModel.educationType) && AbstractC22676k.m65745e(this.presetQuestionKey, aiCoachChatScreenModel.presetQuestionKey) && AbstractC22676k.m65745e(this.args, aiCoachChatScreenModel.args) && this.shouldOpenFullSize == aiCoachChatScreenModel.shouldOpenFullSize && AbstractC22676k.m65745e(this.coachEverywhereMainContent, aiCoachChatScreenModel.coachEverywhereMainContent) && this.isCoachEverywhereDetailScreen == aiCoachChatScreenModel.isCoachEverywhereDetailScreen && this.isPrefetchEnabled == aiCoachChatScreenModel.isPrefetchEnabled && this.isPushNavigationEnabled == aiCoachChatScreenModel.isPushNavigationEnabled && this.isWhoopCoachEverywhere == aiCoachChatScreenModel.isWhoopCoachEverywhere;
    }

    public final Map<String, JsonElement> getArgs() {
        return this.args;
    }

    public final String getCoachEverywhereMainContent() {
        return this.coachEverywhereMainContent;
    }

    public final String getEducationType() {
        return this.educationType;
    }

    public final String getFingerprint() {
        return this.fingerprint;
    }

    public final String getOnboardingAnalyticSource() {
        return this.onboardingAnalyticSource;
    }

    public final String getPresetQuestionKey() {
        return this.presetQuestionKey;
    }

    public final boolean getShouldOpenFullSize() {
        return this.shouldOpenFullSize;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final String getSourceType() {
        return this.sourceType;
    }

    public final String getStaticInitialMessage() {
        return this.staticInitialMessage;
    }

    public final String getUserMessage() {
        return this.userMessage;
    }

    public int hashCode() {
        int iHashCode = this.fingerprint.hashCode() * 31;
        String str = this.sourceId;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.sourceType);
        String str2 = this.staticInitialMessage;
        int iHashCode2 = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.userMessage;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.onboardingAnalyticSource;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.educationType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.presetQuestionKey;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Map<String, JsonElement> map = this.args;
        int iM8289b = AbstractC2875y.m8289b((iHashCode6 + (map == null ? 0 : map.hashCode())) * 31, 31, this.shouldOpenFullSize);
        String str7 = this.coachEverywhereMainContent;
        return Boolean.hashCode(this.isWhoopCoachEverywhere) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC2875y.m8289b((iM8289b + (str7 != null ? str7.hashCode() : 0)) * 31, 31, this.isCoachEverywhereDetailScreen), 31, this.isPrefetchEnabled), 31, this.isPushNavigationEnabled);
    }

    public final boolean isCoachEverywhereDetailScreen() {
        return this.isCoachEverywhereDetailScreen;
    }

    public final boolean isPrefetchEnabled() {
        return this.isPrefetchEnabled;
    }

    public final boolean isPushNavigationEnabled() {
        return this.isPushNavigationEnabled;
    }

    public final boolean isWhoopCoachEverywhere() {
        return this.isWhoopCoachEverywhere;
    }

    public String toString() {
        String str = this.fingerprint;
        String str2 = this.sourceId;
        String str3 = this.sourceType;
        String str4 = this.staticInitialMessage;
        String str5 = this.userMessage;
        String str6 = this.onboardingAnalyticSource;
        String str7 = this.educationType;
        String str8 = this.presetQuestionKey;
        Map<String, JsonElement> map = this.args;
        boolean z4 = this.shouldOpenFullSize;
        String str9 = this.coachEverywhereMainContent;
        boolean z13 = this.isCoachEverywhereDetailScreen;
        boolean z14 = this.isPrefetchEnabled;
        boolean z15 = this.isPushNavigationEnabled;
        boolean z16 = this.isWhoopCoachEverywhere;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AiCoachChatScreenModel(fingerprint=", str, ", sourceId=", str2, ", sourceType=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", staticInitialMessage=", str4, ", userMessage=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", onboardingAnalyticSource=", str6, ", educationType=");
        AbstractC11266d.m30444B(sbM32001t, str7, ", presetQuestionKey=", str8, ", args=");
        sbM32001t.append(map);
        sbM32001t.append(", shouldOpenFullSize=");
        sbM32001t.append(z4);
        sbM32001t.append(", coachEverywhereMainContent=");
        AbstractC38963t7.m124390t(sbM32001t, str9, ", isCoachEverywhereDetailScreen=", z13, ", isPrefetchEnabled=");
        AbstractC38963t7.m124392v(sbM32001t, z14, ", isPushNavigationEnabled=", z15, ", isWhoopCoachEverywhere=");
        return AbstractC18489d0.m53372m(sbM32001t, z16, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AiCoachChatScreenModel(String fingerprint, String str, String sourceType, String str2, String str3, String str4, String str5, String str6, Map<String, ? extends JsonElement> map, boolean z4, String str7, boolean z13, boolean z14, boolean z15, boolean z16) {
        AbstractC22676k.m65750j(fingerprint, "fingerprint");
        AbstractC22676k.m65750j(sourceType, "sourceType");
        this.fingerprint = fingerprint;
        this.sourceId = str;
        this.sourceType = sourceType;
        this.staticInitialMessage = str2;
        this.userMessage = str3;
        this.onboardingAnalyticSource = str4;
        this.educationType = str5;
        this.presetQuestionKey = str6;
        this.args = map;
        this.shouldOpenFullSize = z4;
        this.coachEverywhereMainContent = str7;
        this.isCoachEverywhereDetailScreen = z13;
        this.isPrefetchEnabled = z14;
        this.isPushNavigationEnabled = z15;
        this.isWhoopCoachEverywhere = z16;
    }

    public /* synthetic */ AiCoachChatScreenModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map map, boolean z4, String str9, boolean z13, boolean z14, boolean z15, boolean z16, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? null : str6, (i13 & 64) != 0 ? null : str7, (i13 & 128) != 0 ? null : str8, (i13 & 256) != 0 ? C25272z.f99163w : map, (i13 & 512) != 0 ? false : z4, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str9, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z13, (i13 & 4096) != 0 ? true : z14, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? false : z15, (i13 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? false : z16);
    }
}
