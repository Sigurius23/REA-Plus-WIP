package com.whoop.p057ai.chat.api;

import ad3.C0771n;
import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25272z;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import s51.C32219p;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>?Be\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fBw\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u001c\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJv\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001fJ\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b7\u0010\u001fR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b<\u0010\u001f¨\u0006@"}, m65681d2 = {"Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;", "", "", "fingerprint", "sourceType", "sourceId", "initialMessage", "presetQuestionKey", "", "Lkotlinx/serialization/json/JsonElement;", "args", "Lcom/whoop/ai/chat/api/AiTrackingCapabilities;", "trackingCapabilities", "entrypointExperience", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/Map;", "component7", "()Lcom/whoop/ai/chat/api/AiTrackingCapabilities;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;Ljava/lang/String;)Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFingerprint", "getSourceType", "getSourceId", "getInitialMessage", "getPresetQuestionKey", "Ljava/util/Map;", "getArgs", "Lcom/whoop/ai/chat/api/AiTrackingCapabilities;", "getTrackingCapabilities", "getEntrypointExperience", "Companion", "$serializer", "a", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AiCreateConversationRequestBody {
    private final Map<String, JsonElement> args;
    private final String entrypointExperience;
    private final String fingerprint;
    private final String initialMessage;
    private final String presetQuestionKey;
    private final String sourceId;
    private final String sourceType;
    private final AiTrackingCapabilities trackingCapabilities;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C32219p(24)), null, null};

    /* JADX INFO: renamed from: com.whoop.ai.chat.api.AiCreateConversationRequestBody$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/ai/chat/api/AiCreateConversationRequestBody;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AiCreateConversationRequestBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AiCreateConversationRequestBody(int i13, String str, String str2, String str3, String str4, String str5, Map map, AiTrackingCapabilities aiTrackingCapabilities, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, AiCreateConversationRequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.fingerprint = str;
        this.sourceType = str2;
        this.sourceId = str3;
        this.initialMessage = str4;
        if ((i13 & 16) == 0) {
            this.presetQuestionKey = null;
        } else {
            this.presetQuestionKey = str5;
        }
        if ((i13 & 32) == 0) {
            this.args = C25272z.f99163w;
        } else {
            this.args = map;
        }
        if ((i13 & 64) == 0) {
            this.trackingCapabilities = new AiTrackingCapabilities(false, false, false, 7, (DefaultConstructorMarker) null);
        } else {
            this.trackingCapabilities = aiTrackingCapabilities;
        }
        if ((i13 & 128) == 0) {
            this.entrypointExperience = null;
        } else {
            this.entrypointExperience = str6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, C0771n.f2806a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AiCreateConversationRequestBody copy$default(AiCreateConversationRequestBody aiCreateConversationRequestBody, String str, String str2, String str3, String str4, String str5, Map map, AiTrackingCapabilities aiTrackingCapabilities, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = aiCreateConversationRequestBody.fingerprint;
        }
        if ((i13 & 2) != 0) {
            str2 = aiCreateConversationRequestBody.sourceType;
        }
        if ((i13 & 4) != 0) {
            str3 = aiCreateConversationRequestBody.sourceId;
        }
        if ((i13 & 8) != 0) {
            str4 = aiCreateConversationRequestBody.initialMessage;
        }
        if ((i13 & 16) != 0) {
            str5 = aiCreateConversationRequestBody.presetQuestionKey;
        }
        if ((i13 & 32) != 0) {
            map = aiCreateConversationRequestBody.args;
        }
        if ((i13 & 64) != 0) {
            aiTrackingCapabilities = aiCreateConversationRequestBody.trackingCapabilities;
        }
        if ((i13 & 128) != 0) {
            str6 = aiCreateConversationRequestBody.entrypointExperience;
        }
        AiTrackingCapabilities aiTrackingCapabilities2 = aiTrackingCapabilities;
        String str7 = str6;
        String str8 = str5;
        Map map2 = map;
        return aiCreateConversationRequestBody.copy(str, str2, str3, str4, str8, map2, aiTrackingCapabilities2, str7);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    public static final /* synthetic */ void write$Self$bot_release(AiCreateConversationRequestBody self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.fingerprint);
        output.encodeStringElement(serialDesc, 1, self.sourceType);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.sourceId);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.initialMessage);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.presetQuestionKey != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.presetQuestionKey);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !AbstractC22676k.m65745e(self.args, C25272z.f99163w)) {
            output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.args);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6)) {
            output.encodeSerializableElement(serialDesc, 6, AiTrackingCapabilities$$serializer.INSTANCE, self.trackingCapabilities);
        } else {
            if (!AbstractC22676k.m65745e(self.trackingCapabilities, new AiTrackingCapabilities(false, false, false, 7, (DefaultConstructorMarker) null))) {
                output.encodeSerializableElement(serialDesc, 6, AiTrackingCapabilities$$serializer.INSTANCE, self.trackingCapabilities);
            }
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.entrypointExperience == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, stringSerializer, self.entrypointExperience);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFingerprint() {
        return this.fingerprint;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSourceType() {
        return this.sourceType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInitialMessage() {
        return this.initialMessage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPresetQuestionKey() {
        return this.presetQuestionKey;
    }

    public final Map<String, JsonElement> component6() {
        return this.args;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final AiTrackingCapabilities getTrackingCapabilities() {
        return this.trackingCapabilities;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getEntrypointExperience() {
        return this.entrypointExperience;
    }

    public final AiCreateConversationRequestBody copy(String fingerprint, String sourceType, String sourceId, String initialMessage, String presetQuestionKey, Map<String, ? extends JsonElement> args, AiTrackingCapabilities trackingCapabilities, String entrypointExperience) {
        AbstractC22676k.m65750j(sourceType, "sourceType");
        AbstractC22676k.m65750j(args, "args");
        AbstractC22676k.m65750j(trackingCapabilities, "trackingCapabilities");
        return new AiCreateConversationRequestBody(fingerprint, sourceType, sourceId, initialMessage, presetQuestionKey, args, trackingCapabilities, entrypointExperience);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiCreateConversationRequestBody)) {
            return false;
        }
        AiCreateConversationRequestBody aiCreateConversationRequestBody = (AiCreateConversationRequestBody) other;
        return AbstractC22676k.m65745e(this.fingerprint, aiCreateConversationRequestBody.fingerprint) && AbstractC22676k.m65745e(this.sourceType, aiCreateConversationRequestBody.sourceType) && AbstractC22676k.m65745e(this.sourceId, aiCreateConversationRequestBody.sourceId) && AbstractC22676k.m65745e(this.initialMessage, aiCreateConversationRequestBody.initialMessage) && AbstractC22676k.m65745e(this.presetQuestionKey, aiCreateConversationRequestBody.presetQuestionKey) && AbstractC22676k.m65745e(this.args, aiCreateConversationRequestBody.args) && AbstractC22676k.m65745e(this.trackingCapabilities, aiCreateConversationRequestBody.trackingCapabilities) && AbstractC22676k.m65745e(this.entrypointExperience, aiCreateConversationRequestBody.entrypointExperience);
    }

    public final Map<String, JsonElement> getArgs() {
        return this.args;
    }

    public final String getEntrypointExperience() {
        return this.entrypointExperience;
    }

    public final String getFingerprint() {
        return this.fingerprint;
    }

    public final String getInitialMessage() {
        return this.initialMessage;
    }

    public final String getPresetQuestionKey() {
        return this.presetQuestionKey;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final String getSourceType() {
        return this.sourceType;
    }

    public final AiTrackingCapabilities getTrackingCapabilities() {
        return this.trackingCapabilities;
    }

    public int hashCode() {
        String str = this.fingerprint;
        int iM30450d = AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.sourceType);
        String str2 = this.sourceId;
        int iHashCode = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.initialMessage;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.presetQuestionKey;
        int iHashCode3 = (this.trackingCapabilities.hashCode() + AbstractC3855a.m11821e(this.args, (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31)) * 31;
        String str5 = this.entrypointExperience;
        return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.fingerprint;
        String str2 = this.sourceType;
        String str3 = this.sourceId;
        String str4 = this.initialMessage;
        String str5 = this.presetQuestionKey;
        Map<String, JsonElement> map = this.args;
        AiTrackingCapabilities aiTrackingCapabilities = this.trackingCapabilities;
        String str6 = this.entrypointExperience;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AiCreateConversationRequestBody(fingerprint=", str, ", sourceType=", str2, ", sourceId=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", initialMessage=", str4, ", presetQuestionKey=");
        AbstractC36095b.m114695w(sbM32001t, str5, ", args=", map, ", trackingCapabilities=");
        sbM32001t.append(aiTrackingCapabilities);
        sbM32001t.append(", entrypointExperience=");
        sbM32001t.append(str6);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AiCreateConversationRequestBody(String str, String sourceType, String str2, String str3, String str4, Map<String, ? extends JsonElement> args, AiTrackingCapabilities trackingCapabilities, String str5) {
        AbstractC22676k.m65750j(sourceType, "sourceType");
        AbstractC22676k.m65750j(args, "args");
        AbstractC22676k.m65750j(trackingCapabilities, "trackingCapabilities");
        this.fingerprint = str;
        this.sourceType = sourceType;
        this.sourceId = str2;
        this.initialMessage = str3;
        this.presetQuestionKey = str4;
        this.args = args;
        this.trackingCapabilities = trackingCapabilities;
        this.entrypointExperience = str5;
    }

    public /* synthetic */ AiCreateConversationRequestBody(String str, String str2, String str3, String str4, String str5, Map map, AiTrackingCapabilities aiTrackingCapabilities, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i13 & 16) != 0 ? null : str5, (i13 & 32) != 0 ? C25272z.f99163w : map, (i13 & 64) != 0 ? new AiTrackingCapabilities(false, false, false, 7, (DefaultConstructorMarker) null) : aiTrackingCapabilities, (i13 & 128) != 0 ? null : str6);
    }
}
