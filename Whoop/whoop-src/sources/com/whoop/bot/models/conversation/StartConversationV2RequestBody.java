package com.whoop.bot.models.conversation;

import ad3.C0771n;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import jl0.C21769a;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import s01.EnumC32045a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u0000 E2\u00020\u0001:\u0002FEB[\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bm\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0012\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u001e\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b+\u0010,Jn\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b/\u0010#J\u0010\u00100\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00106\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\b=\u0010%R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b>\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010(R%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010A\u001a\u0004\bB\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010C\u001a\u0004\bD\u0010,¨\u0006G"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;", "", "Lcom/whoop/bot/models/conversation/AiChatMessage;", "message", "", "sourceId", "Ls01/a;", "source", "presetQuestion", "Lcom/whoop/bot/models/conversation/Location;", "location", "", "Lkotlinx/serialization/json/JsonElement;", "args", "", "userTimestamp", "<init>", "(Lcom/whoop/bot/models/conversation/AiChatMessage;Ljava/lang/String;Ls01/a;Ljava/lang/String;Lcom/whoop/bot/models/conversation/Location;Ljava/util/Map;Ljava/lang/Long;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/bot/models/conversation/AiChatMessage;Ljava/lang/String;Ls01/a;Ljava/lang/String;Lcom/whoop/bot/models/conversation/Location;Ljava/util/Map;Ljava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/bot/models/conversation/AiChatMessage;", "component2", "()Ljava/lang/String;", "component3", "()Ls01/a;", "component4", "component5", "()Lcom/whoop/bot/models/conversation/Location;", "component6", "()Ljava/util/Map;", "component7", "()Ljava/lang/Long;", "copy", "(Lcom/whoop/bot/models/conversation/AiChatMessage;Ljava/lang/String;Ls01/a;Ljava/lang/String;Lcom/whoop/bot/models/conversation/Location;Ljava/util/Map;Ljava/lang/Long;)Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/bot/models/conversation/AiChatMessage;", "getMessage", "getMessage$annotations", "()V", "Ljava/lang/String;", "getSourceId", "Ls01/a;", "getSource", "getPresetQuestion", "Lcom/whoop/bot/models/conversation/Location;", "getLocation", "Ljava/util/Map;", "getArgs", "Ljava/lang/Long;", "getUserTimestamp", "Companion", "$serializer", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class StartConversationV2RequestBody {
    private static final InterfaceC23462h[] $childSerializers;
    private final Map<String, JsonElement> args;
    private final Location location;

    @SerializedName("initial_message")
    private final AiChatMessage message;
    private final String presetQuestion;
    private final EnumC32045a source;
    private final String sourceId;
    private final Long userTimestamp;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/bot/models/conversation/StartConversationV2RequestBody;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return StartConversationV2RequestBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C21769a(10)), null, null, AbstractC30060g.m92087G(enumC23463i, new C21769a(11)), null};
    }

    public /* synthetic */ StartConversationV2RequestBody(int i13, AiChatMessage aiChatMessage, String str, EnumC32045a enumC32045a, String str2, Location location, Map map, Long l7, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, StartConversationV2RequestBody$$serializer.INSTANCE.getDescriptor());
        }
        this.message = aiChatMessage;
        this.sourceId = str;
        this.source = enumC32045a;
        this.presetQuestion = str2;
        this.location = location;
        if ((i13 & 32) == 0) {
            this.args = null;
        } else {
            this.args = map;
        }
        if ((i13 & 64) == 0) {
            this.userTimestamp = null;
        } else {
            this.userTimestamp = l7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.molecule.coach.ConversationSourceType", EnumC32045a.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, C0771n.f2806a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StartConversationV2RequestBody copy$default(StartConversationV2RequestBody startConversationV2RequestBody, AiChatMessage aiChatMessage, String str, EnumC32045a enumC32045a, String str2, Location location, Map map, Long l7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            aiChatMessage = startConversationV2RequestBody.message;
        }
        if ((i13 & 2) != 0) {
            str = startConversationV2RequestBody.sourceId;
        }
        if ((i13 & 4) != 0) {
            enumC32045a = startConversationV2RequestBody.source;
        }
        if ((i13 & 8) != 0) {
            str2 = startConversationV2RequestBody.presetQuestion;
        }
        if ((i13 & 16) != 0) {
            location = startConversationV2RequestBody.location;
        }
        if ((i13 & 32) != 0) {
            map = startConversationV2RequestBody.args;
        }
        if ((i13 & 64) != 0) {
            l7 = startConversationV2RequestBody.userTimestamp;
        }
        Map map2 = map;
        Long l12 = l7;
        Location location2 = location;
        EnumC32045a enumC32045a2 = enumC32045a;
        return startConversationV2RequestBody.copy(aiChatMessage, str, enumC32045a2, str2, location2, map2, l12);
    }

    @InterfaceC37143h("initial_message")
    public static /* synthetic */ void getMessage$annotations() {
    }

    public static final /* synthetic */ void write$Self$bot_release(StartConversationV2RequestBody self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, AiChatMessage$$serializer.INSTANCE, self.message);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.sourceId);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.source);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.presetQuestion);
        output.encodeNullableSerializableElement(serialDesc, 4, Location$$serializer.INSTANCE, self.location);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.args != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.args);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.userTimestamp == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, LongSerializer.INSTANCE, self.userTimestamp);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AiChatMessage getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EnumC32045a getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPresetQuestion() {
        return this.presetQuestion;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Location getLocation() {
        return this.location;
    }

    public final Map<String, JsonElement> component6() {
        return this.args;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getUserTimestamp() {
        return this.userTimestamp;
    }

    public final StartConversationV2RequestBody copy(AiChatMessage message, String sourceId, EnumC32045a source, String presetQuestion, Location location, Map<String, ? extends JsonElement> args, Long userTimestamp) {
        AbstractC22676k.m65750j(source, "source");
        return new StartConversationV2RequestBody(message, sourceId, source, presetQuestion, location, args, userTimestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartConversationV2RequestBody)) {
            return false;
        }
        StartConversationV2RequestBody startConversationV2RequestBody = (StartConversationV2RequestBody) other;
        return AbstractC22676k.m65745e(this.message, startConversationV2RequestBody.message) && AbstractC22676k.m65745e(this.sourceId, startConversationV2RequestBody.sourceId) && this.source == startConversationV2RequestBody.source && AbstractC22676k.m65745e(this.presetQuestion, startConversationV2RequestBody.presetQuestion) && AbstractC22676k.m65745e(this.location, startConversationV2RequestBody.location) && AbstractC22676k.m65745e(this.args, startConversationV2RequestBody.args) && AbstractC22676k.m65745e(this.userTimestamp, startConversationV2RequestBody.userTimestamp);
    }

    public final Map<String, JsonElement> getArgs() {
        return this.args;
    }

    public final Location getLocation() {
        return this.location;
    }

    public final AiChatMessage getMessage() {
        return this.message;
    }

    public final String getPresetQuestion() {
        return this.presetQuestion;
    }

    public final EnumC32045a getSource() {
        return this.source;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final Long getUserTimestamp() {
        return this.userTimestamp;
    }

    public int hashCode() {
        AiChatMessage aiChatMessage = this.message;
        int iHashCode = (aiChatMessage == null ? 0 : aiChatMessage.hashCode()) * 31;
        String str = this.sourceId;
        int iHashCode2 = (this.source.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.presetQuestion;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Location location = this.location;
        int iHashCode4 = (iHashCode3 + (location == null ? 0 : location.hashCode())) * 31;
        Map<String, JsonElement> map = this.args;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        Long l7 = this.userTimestamp;
        return iHashCode5 + (l7 != null ? l7.hashCode() : 0);
    }

    public String toString() {
        return "StartConversationV2RequestBody(message=" + this.message + ", sourceId=" + this.sourceId + ", source=" + this.source + ", presetQuestion=" + this.presetQuestion + ", location=" + this.location + ", args=" + this.args + ", userTimestamp=" + this.userTimestamp + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StartConversationV2RequestBody(AiChatMessage aiChatMessage, String str, EnumC32045a source, String str2, Location location, Map<String, ? extends JsonElement> map, Long l7) {
        AbstractC22676k.m65750j(source, "source");
        this.message = aiChatMessage;
        this.sourceId = str;
        this.source = source;
        this.presetQuestion = str2;
        this.location = location;
        this.args = map;
        this.userTimestamp = l7;
    }

    public /* synthetic */ StartConversationV2RequestBody(AiChatMessage aiChatMessage, String str, EnumC32045a enumC32045a, String str2, Location location, Map map, Long l7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(aiChatMessage, str, enumC32045a, str2, location, (i13 & 32) != 0 ? null : map, (i13 & 64) != 0 ? null : l7);
    }
}
