package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import o01.EnumC27349e;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import un1.C35100f;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ`\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b4\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b5\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b6\u0010\u001c¨\u00069"}, m65681d2 = {"Lcom/whoop/design/models/items/AiChatEntryModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "hint", "Lo01/e;", "suggestionCategory", "contextualMessage", "educationType", "conversationSeedId", "sourceType", "sourceId", "<init>", "(Ljava/lang/String;Lo01/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lo01/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/AiChatEntryModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lo01/e;", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Lo01/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/AiChatEntryModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHint", "Lo01/e;", "getSuggestionCategory", "getContextualMessage", "getEducationType", "getConversationSeedId", "getSourceType", "getSourceId", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AiChatEntryModel implements DesignSystemModel {
    public static final int $stable = 0;
    private final String contextualMessage;
    private final String conversationSeedId;
    private final String educationType;
    private final String hint;
    private final String sourceId;
    private final String sourceType;
    private final EnumC27349e suggestionCategory;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C35100f(9)), null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/AiChatEntryModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/AiChatEntryModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AiChatEntryModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public AiChatEntryModel() {
        this((String) null, (EnumC27349e) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.molecule.chat.SuggestionCategory", EnumC27349e.values());
    }

    public static /* synthetic */ AiChatEntryModel copy$default(AiChatEntryModel aiChatEntryModel, String str, EnumC27349e enumC27349e, String str2, String str3, String str4, String str5, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = aiChatEntryModel.hint;
        }
        if ((i13 & 2) != 0) {
            enumC27349e = aiChatEntryModel.suggestionCategory;
        }
        if ((i13 & 4) != 0) {
            str2 = aiChatEntryModel.contextualMessage;
        }
        if ((i13 & 8) != 0) {
            str3 = aiChatEntryModel.educationType;
        }
        if ((i13 & 16) != 0) {
            str4 = aiChatEntryModel.conversationSeedId;
        }
        if ((i13 & 32) != 0) {
            str5 = aiChatEntryModel.sourceType;
        }
        if ((i13 & 64) != 0) {
            str6 = aiChatEntryModel.sourceId;
        }
        String str7 = str5;
        String str8 = str6;
        String str9 = str4;
        String str10 = str2;
        return aiChatEntryModel.copy(str, enumC27349e, str10, str3, str9, str7, str8);
    }

    public static final /* synthetic */ void write$Self$design_models_release(AiChatEntryModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.hint, "")) {
            output.encodeStringElement(serialDesc, 0, self.hint);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.suggestionCategory != EnumC27349e.GENERAL) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.suggestionCategory);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.contextualMessage != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.contextualMessage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.educationType != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.educationType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.conversationSeedId != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.conversationSeedId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.sourceType != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.sourceType);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.sourceId == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.sourceId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EnumC27349e getSuggestionCategory() {
        return this.suggestionCategory;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getContextualMessage() {
        return this.contextualMessage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEducationType() {
        return this.educationType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getConversationSeedId() {
        return this.conversationSeedId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSourceType() {
        return this.sourceType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSourceId() {
        return this.sourceId;
    }

    public final AiChatEntryModel copy(String hint, EnumC27349e suggestionCategory, String contextualMessage, String educationType, String conversationSeedId, String sourceType, String sourceId) {
        AbstractC22676k.m65750j(hint, "hint");
        AbstractC22676k.m65750j(suggestionCategory, "suggestionCategory");
        return new AiChatEntryModel(hint, suggestionCategory, contextualMessage, educationType, conversationSeedId, sourceType, sourceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiChatEntryModel)) {
            return false;
        }
        AiChatEntryModel aiChatEntryModel = (AiChatEntryModel) other;
        return AbstractC22676k.m65745e(this.hint, aiChatEntryModel.hint) && this.suggestionCategory == aiChatEntryModel.suggestionCategory && AbstractC22676k.m65745e(this.contextualMessage, aiChatEntryModel.contextualMessage) && AbstractC22676k.m65745e(this.educationType, aiChatEntryModel.educationType) && AbstractC22676k.m65745e(this.conversationSeedId, aiChatEntryModel.conversationSeedId) && AbstractC22676k.m65745e(this.sourceType, aiChatEntryModel.sourceType) && AbstractC22676k.m65745e(this.sourceId, aiChatEntryModel.sourceId);
    }

    public final String getContextualMessage() {
        return this.contextualMessage;
    }

    public final String getConversationSeedId() {
        return this.conversationSeedId;
    }

    public final String getEducationType() {
        return this.educationType;
    }

    public final String getHint() {
        return this.hint;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final String getSourceType() {
        return this.sourceType;
    }

    public final EnumC27349e getSuggestionCategory() {
        return this.suggestionCategory;
    }

    public int hashCode() {
        int iHashCode = (this.suggestionCategory.hashCode() + (this.hint.hashCode() * 31)) * 31;
        String str = this.contextualMessage;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.educationType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.conversationSeedId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sourceType;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.sourceId;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.hint;
        EnumC27349e enumC27349e = this.suggestionCategory;
        String str2 = this.contextualMessage;
        String str3 = this.educationType;
        String str4 = this.conversationSeedId;
        String str5 = this.sourceType;
        String str6 = this.sourceId;
        StringBuilder sb4 = new StringBuilder("AiChatEntryModel(hint=");
        sb4.append(str);
        sb4.append(", suggestionCategory=");
        sb4.append(enumC27349e);
        sb4.append(", contextualMessage=");
        AbstractC11266d.m30444B(sb4, str2, ", educationType=", str3, ", conversationSeedId=");
        AbstractC11266d.m30444B(sb4, str4, ", sourceType=", str5, ", sourceId=");
        return AbstractC25012a.m73376i(str6, ")", sb4);
    }

    public /* synthetic */ AiChatEntryModel(int i13, String str, EnumC27349e enumC27349e, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        this.hint = (i13 & 1) == 0 ? "" : str;
        if ((i13 & 2) == 0) {
            this.suggestionCategory = EnumC27349e.GENERAL;
        } else {
            this.suggestionCategory = enumC27349e;
        }
        if ((i13 & 4) == 0) {
            this.contextualMessage = null;
        } else {
            this.contextualMessage = str2;
        }
        if ((i13 & 8) == 0) {
            this.educationType = null;
        } else {
            this.educationType = str3;
        }
        if ((i13 & 16) == 0) {
            this.conversationSeedId = null;
        } else {
            this.conversationSeedId = str4;
        }
        if ((i13 & 32) == 0) {
            this.sourceType = null;
        } else {
            this.sourceType = str5;
        }
        if ((i13 & 64) == 0) {
            this.sourceId = null;
        } else {
            this.sourceId = str6;
        }
    }

    public AiChatEntryModel(String hint, EnumC27349e suggestionCategory, String str, String str2, String str3, String str4, String str5) {
        AbstractC22676k.m65750j(hint, "hint");
        AbstractC22676k.m65750j(suggestionCategory, "suggestionCategory");
        this.hint = hint;
        this.suggestionCategory = suggestionCategory;
        this.contextualMessage = str;
        this.educationType = str2;
        this.conversationSeedId = str3;
        this.sourceType = str4;
        this.sourceId = str5;
    }

    public /* synthetic */ AiChatEntryModel(String str, EnumC27349e enumC27349e, String str2, String str3, String str4, String str5, String str6, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? EnumC27349e.GENERAL : enumC27349e, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : str5, (i13 & 64) != 0 ? null : str6);
    }
}
