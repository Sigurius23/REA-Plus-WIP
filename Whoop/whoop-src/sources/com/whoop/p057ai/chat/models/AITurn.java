package com.whoop.p057ai.chat.models;

import com.whoop.bot.models.conversation.AiMessageStatus;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
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
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@ABI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fBS\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b(\u0010)JV\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00100\u001a\u00020\u000b2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010'R \u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010<\u0012\u0004\b=\u0010>\u001a\u0004\b\r\u0010)¨\u0006B"}, m65681d2 = {"Lcom/whoop/ai/chat/models/AITurn;", "", "", "id", "Lcom/whoop/bot/models/conversation/AiMessageStatus;", "turnStatus", "", "Lcom/whoop/ai/chat/models/AIMessage;", "messages", "Lcom/whoop/ai/chat/models/TurnFeedbackResponse;", "feedback", "", "shouldShowSuggestedChips", "isOptimistic", "<init>", "(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/util/List;Lcom/whoop/ai/chat/models/TurnFeedbackResponse;Ljava/lang/Boolean;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/util/List;Lcom/whoop/ai/chat/models/TurnFeedbackResponse;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/ai/chat/models/AITurn;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/bot/models/conversation/AiMessageStatus;", "component3", "()Ljava/util/List;", "component4", "()Lcom/whoop/ai/chat/models/TurnFeedbackResponse;", "component5", "()Ljava/lang/Boolean;", "component6", "()Z", "copy", "(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/util/List;Lcom/whoop/ai/chat/models/TurnFeedbackResponse;Ljava/lang/Boolean;Z)Lcom/whoop/ai/chat/models/AITurn;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lcom/whoop/bot/models/conversation/AiMessageStatus;", "getTurnStatus", "Ljava/util/List;", "getMessages", "Lcom/whoop/ai/chat/models/TurnFeedbackResponse;", "getFeedback", "Ljava/lang/Boolean;", "getShouldShowSuggestedChips", "Z", "isOptimistic$annotations", "()V", "Companion", "$serializer", "a", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AITurn {
    private static final InterfaceC23462h[] $childSerializers;
    private final TurnFeedbackResponse feedback;
    private final String id;
    private final boolean isOptimistic;
    private final List<AIMessage> messages;
    private final Boolean shouldShowSuggestedChips;
    private final AiMessageStatus turnStatus;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.ai.chat.models.AITurn$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/ai/chat/models/AITurn$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/ai/chat/models/AITurn;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AITurn$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C38138a(15)), AbstractC30060g.m92087G(enumC23463i, new C38138a(16)), null, null};
    }

    public /* synthetic */ AITurn(int i13, String str, AiMessageStatus aiMessageStatus, List list, TurnFeedbackResponse turnFeedbackResponse, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, AITurn$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.turnStatus = aiMessageStatus;
        if ((i13 & 4) == 0) {
            this.messages = C25271y.f99162w;
        } else {
            this.messages = list;
        }
        if ((i13 & 8) == 0) {
            this.feedback = null;
        } else {
            this.feedback = turnFeedbackResponse;
        }
        if ((i13 & 16) == 0) {
            this.shouldShowSuggestedChips = null;
        } else {
            this.shouldShowSuggestedChips = bool;
        }
        this.isOptimistic = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.bot.models.conversation.AiMessageStatus", AiMessageStatus.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(AIMessage$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AITurn copy$default(AITurn aITurn, String str, AiMessageStatus aiMessageStatus, List list, TurnFeedbackResponse turnFeedbackResponse, Boolean bool, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = aITurn.id;
        }
        if ((i13 & 2) != 0) {
            aiMessageStatus = aITurn.turnStatus;
        }
        if ((i13 & 4) != 0) {
            list = aITurn.messages;
        }
        if ((i13 & 8) != 0) {
            turnFeedbackResponse = aITurn.feedback;
        }
        if ((i13 & 16) != 0) {
            bool = aITurn.shouldShowSuggestedChips;
        }
        if ((i13 & 32) != 0) {
            z4 = aITurn.isOptimistic;
        }
        Boolean bool2 = bool;
        boolean z13 = z4;
        return aITurn.copy(str, aiMessageStatus, list, turnFeedbackResponse, bool2, z13);
    }

    public static /* synthetic */ void isOptimistic$annotations() {
    }

    public static final /* synthetic */ void write$Self$bot_release(AITurn self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.turnStatus);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.messages, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.messages);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.feedback != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, TurnFeedbackResponse$$serializer.INSTANCE, self.feedback);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.shouldShowSuggestedChips == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, BooleanSerializer.INSTANCE, self.shouldShowSuggestedChips);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AiMessageStatus getTurnStatus() {
        return this.turnStatus;
    }

    public final List<AIMessage> component3() {
        return this.messages;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TurnFeedbackResponse getFeedback() {
        return this.feedback;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getShouldShowSuggestedChips() {
        return this.shouldShowSuggestedChips;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsOptimistic() {
        return this.isOptimistic;
    }

    public final AITurn copy(String id4, AiMessageStatus turnStatus, List<AIMessage> messages, TurnFeedbackResponse feedback, Boolean shouldShowSuggestedChips, boolean isOptimistic) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(turnStatus, "turnStatus");
        AbstractC22676k.m65750j(messages, "messages");
        return new AITurn(id4, turnStatus, messages, feedback, shouldShowSuggestedChips, isOptimistic);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AITurn)) {
            return false;
        }
        AITurn aITurn = (AITurn) other;
        return AbstractC22676k.m65745e(this.id, aITurn.id) && this.turnStatus == aITurn.turnStatus && AbstractC22676k.m65745e(this.messages, aITurn.messages) && AbstractC22676k.m65745e(this.feedback, aITurn.feedback) && AbstractC22676k.m65745e(this.shouldShowSuggestedChips, aITurn.shouldShowSuggestedChips) && this.isOptimistic == aITurn.isOptimistic;
    }

    public final TurnFeedbackResponse getFeedback() {
        return this.feedback;
    }

    public final String getId() {
        return this.id;
    }

    public final List<AIMessage> getMessages() {
        return this.messages;
    }

    public final Boolean getShouldShowSuggestedChips() {
        return this.shouldShowSuggestedChips;
    }

    public final AiMessageStatus getTurnStatus() {
        return this.turnStatus;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b((this.turnStatus.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.messages);
        TurnFeedbackResponse turnFeedbackResponse = this.feedback;
        int iHashCode = (iM31983b + (turnFeedbackResponse == null ? 0 : turnFeedbackResponse.hashCode())) * 31;
        Boolean bool = this.shouldShowSuggestedChips;
        return Boolean.hashCode(this.isOptimistic) + ((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final boolean isOptimistic() {
        return this.isOptimistic;
    }

    public String toString() {
        return "AITurn(id=" + this.id + ", turnStatus=" + this.turnStatus + ", messages=" + this.messages + ", feedback=" + this.feedback + ", shouldShowSuggestedChips=" + this.shouldShowSuggestedChips + ", isOptimistic=" + this.isOptimistic + ")";
    }

    public AITurn(String id4, AiMessageStatus turnStatus, List<AIMessage> messages, TurnFeedbackResponse turnFeedbackResponse, Boolean bool, boolean z4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(turnStatus, "turnStatus");
        AbstractC22676k.m65750j(messages, "messages");
        this.id = id4;
        this.turnStatus = turnStatus;
        this.messages = messages;
        this.feedback = turnFeedbackResponse;
        this.shouldShowSuggestedChips = bool;
        this.isOptimistic = z4;
    }

    public /* synthetic */ AITurn(String str, AiMessageStatus aiMessageStatus, List list, TurnFeedbackResponse turnFeedbackResponse, Boolean bool, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, aiMessageStatus, (i13 & 4) != 0 ? C25271y.f99162w : list, (i13 & 8) != 0 ? null : turnFeedbackResponse, (i13 & 16) != 0 ? null : bool, (i13 & 32) != 0 ? false : z4);
    }
}
