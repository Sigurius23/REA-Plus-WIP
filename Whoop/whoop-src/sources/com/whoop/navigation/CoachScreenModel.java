package com.whoop.navigation;

import ad3.C0771n;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
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
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 Q2\u00020\u0001:\u0002RSBµ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016B¯\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001cJ\u001e\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001cJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001cJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010\u001cJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001cJ\u0010\u0010,\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b,\u0010$J¾\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0014\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u001cJ\u0010\u00100\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u00020\n2\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105J'\u0010>\u001a\u00020;2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010?\u001a\u0004\bA\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\bB\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bD\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\bE\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010?\u001a\u0004\bF\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010G\u001a\u0004\bH\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\bI\u0010\u001cR%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010J\u001a\u0004\bK\u0010'R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010?\u001a\u0004\bL\u0010\u001cR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\bM\u0010\u001cR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\bN\u0010\u001cR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010?\u001a\u0004\bO\u0010\u001cR\u0017\u0010\u0014\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0014\u0010G\u001a\u0004\bP\u0010$¨\u0006T"}, m65681d2 = {"Lcom/whoop/navigation/CoachScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "", "sourceType", "entryText", "conversationSeedId", "", "cardVariant", "label", "presetQuestion", "", "includeInitialMessage", "sourceId", "", "Lkotlinx/serialization/json/JsonElement;", "args", "source", "educationType", "deeplinkConversationId", "deeplinkSourceId", "shouldOpenFullSize", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "()Z", "component8", "component9", "()Ljava/util/Map;", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/navigation/CoachScreenModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/CoachScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getSourceType", "getEntryText", "getConversationSeedId", "Ljava/lang/Integer;", "getCardVariant", "getLabel", "getPresetQuestion", "Z", "getIncludeInitialMessage", "getSourceId", "Ljava/util/Map;", "getArgs", "getSource", "getEducationType", "getDeeplinkConversationId", "getDeeplinkSourceId", "getShouldOpenFullSize", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CoachScreenModel implements CommonNavigationScreenModel {
    private final Map<String, JsonElement> args;
    private final Integer cardVariant;
    private final String conversationSeedId;
    private final String deeplinkConversationId;
    private final String deeplinkSourceId;
    private final String educationType;
    private final String entryText;
    private final boolean includeInitialMessage;
    private final String label;
    private final String presetQuestion;
    private final boolean shouldOpenFullSize;
    private final String source;
    private final String sourceId;
    private final String sourceType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C18681l0(28)), null, null, null, null, null};

    /* JADX INFO: renamed from: com.whoop.navigation.CoachScreenModel$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/CoachScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/CoachScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CoachScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public CoachScreenModel() {
        this((String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, false, (String) null, (Map) null, (String) null, (String) null, (String) null, (String) null, false, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, C0771n.f2806a);
    }

    public static final /* synthetic */ void write$Self$navigation_release(CoachScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.sourceType, "")) {
            output.encodeStringElement(serialDesc, 0, self.sourceType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.entryText != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.entryText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.conversationSeedId, "")) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.conversationSeedId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.cardVariant != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, IntSerializer.INSTANCE, self.cardVariant);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.label != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.label);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.presetQuestion != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.presetQuestion);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !self.includeInitialMessage) {
            output.encodeBooleanElement(serialDesc, 6, self.includeInitialMessage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.sourceId != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.sourceId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !AbstractC22676k.m65745e(self.args, C25272z.f99163w)) {
            output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.args);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || !AbstractC22676k.m65745e(self.source, "")) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.source);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || self.educationType != null) {
            output.encodeNullableSerializableElement(serialDesc, 10, StringSerializer.INSTANCE, self.educationType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.deeplinkConversationId != null) {
            output.encodeNullableSerializableElement(serialDesc, 11, StringSerializer.INSTANCE, self.deeplinkConversationId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 12) || self.deeplinkSourceId != null) {
            output.encodeNullableSerializableElement(serialDesc, 12, StringSerializer.INSTANCE, self.deeplinkSourceId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 13) || self.shouldOpenFullSize) {
            output.encodeBooleanElement(serialDesc, 13, self.shouldOpenFullSize);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSourceType() {
        return this.sourceType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getEducationType() {
        return this.educationType;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getDeeplinkConversationId() {
        return this.deeplinkConversationId;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getDeeplinkSourceId() {
        return this.deeplinkSourceId;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getShouldOpenFullSize() {
        return this.shouldOpenFullSize;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEntryText() {
        return this.entryText;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getConversationSeedId() {
        return this.conversationSeedId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getCardVariant() {
        return this.cardVariant;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPresetQuestion() {
        return this.presetQuestion;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIncludeInitialMessage() {
        return this.includeInitialMessage;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    public final Map<String, JsonElement> component9() {
        return this.args;
    }

    public final CoachScreenModel copy(String sourceType, String entryText, String conversationSeedId, Integer cardVariant, String label, String presetQuestion, boolean includeInitialMessage, String sourceId, Map<String, ? extends JsonElement> args, String source, String educationType, String deeplinkConversationId, String deeplinkSourceId, boolean shouldOpenFullSize) {
        AbstractC22676k.m65750j(sourceType, "sourceType");
        return new CoachScreenModel(sourceType, entryText, conversationSeedId, cardVariant, label, presetQuestion, includeInitialMessage, sourceId, args, source, educationType, deeplinkConversationId, deeplinkSourceId, shouldOpenFullSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoachScreenModel)) {
            return false;
        }
        CoachScreenModel coachScreenModel = (CoachScreenModel) other;
        return AbstractC22676k.m65745e(this.sourceType, coachScreenModel.sourceType) && AbstractC22676k.m65745e(this.entryText, coachScreenModel.entryText) && AbstractC22676k.m65745e(this.conversationSeedId, coachScreenModel.conversationSeedId) && AbstractC22676k.m65745e(this.cardVariant, coachScreenModel.cardVariant) && AbstractC22676k.m65745e(this.label, coachScreenModel.label) && AbstractC22676k.m65745e(this.presetQuestion, coachScreenModel.presetQuestion) && this.includeInitialMessage == coachScreenModel.includeInitialMessage && AbstractC22676k.m65745e(this.sourceId, coachScreenModel.sourceId) && AbstractC22676k.m65745e(this.args, coachScreenModel.args) && AbstractC22676k.m65745e(this.source, coachScreenModel.source) && AbstractC22676k.m65745e(this.educationType, coachScreenModel.educationType) && AbstractC22676k.m65745e(this.deeplinkConversationId, coachScreenModel.deeplinkConversationId) && AbstractC22676k.m65745e(this.deeplinkSourceId, coachScreenModel.deeplinkSourceId) && this.shouldOpenFullSize == coachScreenModel.shouldOpenFullSize;
    }

    public final Map<String, JsonElement> getArgs() {
        return this.args;
    }

    public final Integer getCardVariant() {
        return this.cardVariant;
    }

    public final String getConversationSeedId() {
        return this.conversationSeedId;
    }

    public final String getDeeplinkConversationId() {
        return this.deeplinkConversationId;
    }

    public final String getDeeplinkSourceId() {
        return this.deeplinkSourceId;
    }

    public final String getEducationType() {
        return this.educationType;
    }

    public final String getEntryText() {
        return this.entryText;
    }

    public final boolean getIncludeInitialMessage() {
        return this.includeInitialMessage;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getPresetQuestion() {
        return this.presetQuestion;
    }

    public final boolean getShouldOpenFullSize() {
        return this.shouldOpenFullSize;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final String getSourceType() {
        return this.sourceType;
    }

    public int hashCode() {
        int iHashCode = this.sourceType.hashCode() * 31;
        String str = this.entryText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.conversationSeedId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.cardVariant;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.label;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.presetQuestion;
        int iM8289b = AbstractC2875y.m8289b((iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.includeInitialMessage);
        String str5 = this.sourceId;
        int iHashCode6 = (iM8289b + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map<String, JsonElement> map = this.args;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        String str6 = this.source;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.educationType;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.deeplinkConversationId;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.deeplinkSourceId;
        return Boolean.hashCode(this.shouldOpenFullSize) + ((iHashCode10 + (str9 != null ? str9.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.sourceType;
        String str2 = this.entryText;
        String str3 = this.conversationSeedId;
        Integer num = this.cardVariant;
        String str4 = this.label;
        String str5 = this.presetQuestion;
        boolean z4 = this.includeInitialMessage;
        String str6 = this.sourceId;
        Map<String, JsonElement> map = this.args;
        String str7 = this.source;
        String str8 = this.educationType;
        String str9 = this.deeplinkConversationId;
        String str10 = this.deeplinkSourceId;
        boolean z13 = this.shouldOpenFullSize;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("CoachScreenModel(sourceType=", str, ", entryText=", str2, ", conversationSeedId=");
        AbstractC30007c.m91853w(num, str3, ", cardVariant=", ", label=", sbM32001t);
        AbstractC11266d.m30444B(sbM32001t, str4, ", presetQuestion=", str5, ", includeInitialMessage=");
        AbstractC38963t7.m124391u(sbM32001t, z4, ", sourceId=", str6, ", args=");
        sbM32001t.append(map);
        sbM32001t.append(", source=");
        sbM32001t.append(str7);
        sbM32001t.append(", educationType=");
        AbstractC11266d.m30444B(sbM32001t, str8, ", deeplinkConversationId=", str9, ", deeplinkSourceId=");
        return AbstractC21702c.m61137h(sbM32001t, str10, ", shouldOpenFullSize=", z13, ")");
    }

    public /* synthetic */ CoachScreenModel(int i13, String str, String str2, String str3, Integer num, String str4, String str5, boolean z4, String str6, Map map, String str7, String str8, String str9, String str10, boolean z13, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.sourceType = "";
        } else {
            this.sourceType = str;
        }
        if ((i13 & 2) == 0) {
            this.entryText = null;
        } else {
            this.entryText = str2;
        }
        if ((i13 & 4) == 0) {
            this.conversationSeedId = "";
        } else {
            this.conversationSeedId = str3;
        }
        if ((i13 & 8) == 0) {
            this.cardVariant = null;
        } else {
            this.cardVariant = num;
        }
        if ((i13 & 16) == 0) {
            this.label = null;
        } else {
            this.label = str4;
        }
        if ((i13 & 32) == 0) {
            this.presetQuestion = null;
        } else {
            this.presetQuestion = str5;
        }
        if ((i13 & 64) == 0) {
            this.includeInitialMessage = true;
        } else {
            this.includeInitialMessage = z4;
        }
        if ((i13 & 128) == 0) {
            this.sourceId = null;
        } else {
            this.sourceId = str6;
        }
        if ((i13 & 256) == 0) {
            this.args = C25272z.f99163w;
        } else {
            this.args = map;
        }
        if ((i13 & 512) == 0) {
            this.source = "";
        } else {
            this.source = str7;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.educationType = null;
        } else {
            this.educationType = str8;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.deeplinkConversationId = null;
        } else {
            this.deeplinkConversationId = str9;
        }
        if ((i13 & 4096) == 0) {
            this.deeplinkSourceId = null;
        } else {
            this.deeplinkSourceId = str10;
        }
        this.shouldOpenFullSize = (i13 & DfuBaseService.ERROR_REMOTE_MASK) == 0 ? false : z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CoachScreenModel(String sourceType, String str, String str2, Integer num, String str3, String str4, boolean z4, String str5, Map<String, ? extends JsonElement> map, String str6, String str7, String str8, String str9, boolean z13) {
        AbstractC22676k.m65750j(sourceType, "sourceType");
        this.sourceType = sourceType;
        this.entryText = str;
        this.conversationSeedId = str2;
        this.cardVariant = num;
        this.label = str3;
        this.presetQuestion = str4;
        this.includeInitialMessage = z4;
        this.sourceId = str5;
        this.args = map;
        this.source = str6;
        this.educationType = str7;
        this.deeplinkConversationId = str8;
        this.deeplinkSourceId = str9;
        this.shouldOpenFullSize = z13;
    }

    public /* synthetic */ CoachScreenModel(String str, String str2, String str3, Integer num, String str4, String str5, boolean z4, String str6, Map map, String str7, String str8, String str9, String str10, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? null : num, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : str5, (i13 & 64) != 0 ? true : z4, (i13 & 128) != 0 ? null : str6, (i13 & 256) != 0 ? C25272z.f99163w : map, (i13 & 512) == 0 ? str7 : "", (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : str8, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : str9, (i13 & 4096) == 0 ? str10 : null, (i13 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? false : z13);
    }
}
