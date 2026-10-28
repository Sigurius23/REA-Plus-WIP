package com.whoop.p057ai.chat.models;

import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xa1.C38138a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000289BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\f\u0010\rBY\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJP\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b'\u0010#J\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b6\u0010\u001f¨\u0006:"}, m65681d2 = {"Lcom/whoop/ai/chat/models/AIConversation;", "", "Lcom/whoop/ai/chat/models/AIConversationMetadata;", "metadata", "", "Lcom/whoop/ai/chat/models/AITurn;", "turns", "Lcom/whoop/ai/chat/models/CoachVersionTag;", "tag", "", "header", "suggestions", "<init>", "(Lcom/whoop/ai/chat/models/AIConversationMetadata;Ljava/util/List;Lcom/whoop/ai/chat/models/CoachVersionTag;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/ai/chat/models/AIConversationMetadata;Ljava/util/List;Lcom/whoop/ai/chat/models/CoachVersionTag;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/ai/chat/models/AIConversation;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/ai/chat/models/AIConversationMetadata;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/ai/chat/models/CoachVersionTag;", "component4", "()Ljava/lang/String;", "component5", "copy", "(Lcom/whoop/ai/chat/models/AIConversationMetadata;Ljava/util/List;Lcom/whoop/ai/chat/models/CoachVersionTag;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/ai/chat/models/AIConversation;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/ai/chat/models/AIConversationMetadata;", "getMetadata", "Ljava/util/List;", "getTurns", "Lcom/whoop/ai/chat/models/CoachVersionTag;", "getTag", "Ljava/lang/String;", "getHeader", "getSuggestions", "Companion", "$serializer", "a", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AIConversation {
    private static final InterfaceC23462h[] $childSerializers;
    private final String header;
    private final AIConversationMetadata metadata;
    private final List<String> suggestions;
    private final CoachVersionTag tag;
    private final List<AITurn> turns;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.ai.chat.models.AIConversation$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/ai/chat/models/AIConversation$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/ai/chat/models/AIConversation;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AIConversation$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C38138a(12)), null, null, AbstractC30060g.m92087G(enumC23463i, new C38138a(13))};
    }

    public /* synthetic */ AIConversation(int i13, AIConversationMetadata aIConversationMetadata, List list, CoachVersionTag coachVersionTag, String str, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (13 != (i13 & 13)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 13, AIConversation$$serializer.INSTANCE.getDescriptor());
        }
        this.metadata = aIConversationMetadata;
        int i14 = i13 & 2;
        C25271y c25271y = C25271y.f99162w;
        if (i14 == 0) {
            this.turns = c25271y;
        } else {
            this.turns = list;
        }
        this.tag = coachVersionTag;
        this.header = str;
        if ((i13 & 16) == 0) {
            this.suggestions = c25271y;
        } else {
            this.suggestions = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(AITurn$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AIConversation copy$default(AIConversation aIConversation, AIConversationMetadata aIConversationMetadata, List list, CoachVersionTag coachVersionTag, String str, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            aIConversationMetadata = aIConversation.metadata;
        }
        if ((i13 & 2) != 0) {
            list = aIConversation.turns;
        }
        if ((i13 & 4) != 0) {
            coachVersionTag = aIConversation.tag;
        }
        if ((i13 & 8) != 0) {
            str = aIConversation.header;
        }
        if ((i13 & 16) != 0) {
            list2 = aIConversation.suggestions;
        }
        List list3 = list2;
        CoachVersionTag coachVersionTag2 = coachVersionTag;
        return aIConversation.copy(aIConversationMetadata, list, coachVersionTag2, str, list3);
    }

    public static final /* synthetic */ void write$Self$bot_release(AIConversation self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, AIConversationMetadata$$serializer.INSTANCE, self.metadata);
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 1);
        C25271y c25271y = C25271y.f99162w;
        if (zShouldEncodeElementDefault || !AbstractC22676k.m65745e(self.turns, c25271y)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.turns);
        }
        output.encodeSerializableElement(serialDesc, 2, CoachVersionTag$$serializer.INSTANCE, self.tag);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.header);
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && AbstractC22676k.m65745e(self.suggestions, c25271y)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.suggestions);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AIConversationMetadata getMetadata() {
        return this.metadata;
    }

    public final List<AITurn> component2() {
        return this.turns;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CoachVersionTag getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    public final List<String> component5() {
        return this.suggestions;
    }

    public final AIConversation copy(AIConversationMetadata metadata, List<AITurn> turns, CoachVersionTag tag, String header, List<String> suggestions) {
        AbstractC22676k.m65750j(metadata, "metadata");
        AbstractC22676k.m65750j(turns, "turns");
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(suggestions, "suggestions");
        return new AIConversation(metadata, turns, tag, header, suggestions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AIConversation)) {
            return false;
        }
        AIConversation aIConversation = (AIConversation) other;
        return AbstractC22676k.m65745e(this.metadata, aIConversation.metadata) && AbstractC22676k.m65745e(this.turns, aIConversation.turns) && AbstractC22676k.m65745e(this.tag, aIConversation.tag) && AbstractC22676k.m65745e(this.header, aIConversation.header) && AbstractC22676k.m65745e(this.suggestions, aIConversation.suggestions);
    }

    public final String getHeader() {
        return this.header;
    }

    public final AIConversationMetadata getMetadata() {
        return this.metadata;
    }

    public final List<String> getSuggestions() {
        return this.suggestions;
    }

    public final CoachVersionTag getTag() {
        return this.tag;
    }

    public final List<AITurn> getTurns() {
        return this.turns;
    }

    public int hashCode() {
        int iHashCode = (this.tag.hashCode() + AbstractC11895b.m31983b(this.metadata.hashCode() * 31, 31, this.turns)) * 31;
        String str = this.header;
        return this.suggestions.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        AIConversationMetadata aIConversationMetadata = this.metadata;
        List<AITurn> list = this.turns;
        CoachVersionTag coachVersionTag = this.tag;
        String str = this.header;
        List<String> list2 = this.suggestions;
        StringBuilder sb4 = new StringBuilder("AIConversation(metadata=");
        sb4.append(aIConversationMetadata);
        sb4.append(", turns=");
        sb4.append(list);
        sb4.append(", tag=");
        sb4.append(coachVersionTag);
        sb4.append(", header=");
        sb4.append(str);
        sb4.append(", suggestions=");
        return AbstractC3855a.m11829m(sb4, list2, ")");
    }

    public AIConversation(AIConversationMetadata metadata, List<AITurn> turns, CoachVersionTag tag, String str, List<String> suggestions) {
        AbstractC22676k.m65750j(metadata, "metadata");
        AbstractC22676k.m65750j(turns, "turns");
        AbstractC22676k.m65750j(tag, "tag");
        AbstractC22676k.m65750j(suggestions, "suggestions");
        this.metadata = metadata;
        this.turns = turns;
        this.tag = tag;
        this.header = str;
        this.suggestions = suggestions;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AIConversation(AIConversationMetadata aIConversationMetadata, List list, CoachVersionTag coachVersionTag, String str, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        int i14 = i13 & 2;
        C25271y c25271y = C25271y.f99162w;
        this(aIConversationMetadata, i14 != 0 ? c25271y : list, coachVersionTag, str, (i13 & 16) != 0 ? c25271y : list2);
    }
}
