package com.whoop.bot.models.conversation;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import j02.C21179y0;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.UUID;
import jh3.AbstractC21702c;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0081\b\u0018\u0000 =2\u00020\u0001:\u0002>=Bk\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBy\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJt\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0016J\u0010\u0010\"\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J'\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b5\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b6\u0010\u0018R(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00103\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b:\u0010\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010\u001e¨\u0006?"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/AiChatConversation;", "", "", "id", "", "Lcom/whoop/bot/models/conversation/AiChatMessage;", "messages", "suggestions", "topics", "Lcom/whoop/design/models/DesignSystemModel;", "conversationContext", "header", "Lcom/whoop/bot/models/conversation/BetaTagModel;", "tag", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/bot/models/conversation/BetaTagModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/bot/models/conversation/BetaTagModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "component6", "component7", "()Lcom/whoop/bot/models/conversation/BetaTagModel;", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/bot/models/conversation/BetaTagModel;)Lcom/whoop/bot/models/conversation/AiChatConversation;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/bot/models/conversation/AiChatConversation;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getMessages", "getSuggestions", "getTopics", "getConversationContext", "getConversationContext$annotations", "()V", "getHeader", "Lcom/whoop/bot/models/conversation/BetaTagModel;", "getTag", "Companion", "$serializer", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AiChatConversation {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<DesignSystemModel> conversationContext;
    private final String header;
    private final String id;
    private final List<AiChatMessage> messages;
    private final List<String> suggestions;
    private final BetaTagModel tag;
    private final List<String> topics;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/AiChatConversation$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/bot/models/conversation/AiChatConversation;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AiChatConversation$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C21179y0(25)), AbstractC30060g.m92087G(enumC23463i, new C21179y0(26)), AbstractC30060g.m92087G(enumC23463i, new C21179y0(27)), AbstractC30060g.m92087G(enumC23463i, new C21179y0(28)), null, null};
    }

    public AiChatConversation() {
        this((String) null, (List) null, (List) null, (List) null, (List) null, (String) null, (BetaTagModel) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(AiChatMessage$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$2() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(List.class), AbstractC38195a.m122336d(new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]))), new InterfaceC37138c[]{new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0])});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AiChatConversation copy$default(AiChatConversation aiChatConversation, String str, List list, List list2, List list3, List list4, String str2, BetaTagModel betaTagModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = aiChatConversation.id;
        }
        if ((i13 & 2) != 0) {
            list = aiChatConversation.messages;
        }
        if ((i13 & 4) != 0) {
            list2 = aiChatConversation.suggestions;
        }
        if ((i13 & 8) != 0) {
            list3 = aiChatConversation.topics;
        }
        if ((i13 & 16) != 0) {
            list4 = aiChatConversation.conversationContext;
        }
        if ((i13 & 32) != 0) {
            str2 = aiChatConversation.header;
        }
        if ((i13 & 64) != 0) {
            betaTagModel = aiChatConversation.tag;
        }
        String str3 = str2;
        BetaTagModel betaTagModel2 = betaTagModel;
        List list5 = list4;
        List list6 = list2;
        return aiChatConversation.copy(str, list, list6, list3, list5, str3, betaTagModel2);
    }

    public static /* synthetic */ void getConversationContext$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public static final /* synthetic */ void write$Self$bot_release(AiChatConversation self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0)) {
            output.encodeStringElement(serialDesc, 0, self.id);
        } else {
            String str = self.id;
            String string = UUID.randomUUID().toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            if (!AbstractC22676k.m65745e(str, string)) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
        }
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 1);
        C25271y c25271y = C25271y.f99162w;
        if (zShouldEncodeElementDefault || !AbstractC22676k.m65745e(self.messages, c25271y)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.messages);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.suggestions, c25271y)) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.suggestions);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.topics, c25271y)) {
            output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.topics);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.conversationContext != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.conversationContext);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.header != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.header);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.tag == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, BetaTagModel$$serializer.INSTANCE, self.tag);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<AiChatMessage> component2() {
        return this.messages;
    }

    public final List<String> component3() {
        return this.suggestions;
    }

    public final List<String> component4() {
        return this.topics;
    }

    public final List<DesignSystemModel> component5() {
        return this.conversationContext;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BetaTagModel getTag() {
        return this.tag;
    }

    public final AiChatConversation copy(String id4, List<AiChatMessage> messages, List<String> suggestions, List<String> topics, List<? extends DesignSystemModel> conversationContext, String header, BetaTagModel tag) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(messages, "messages");
        AbstractC22676k.m65750j(suggestions, "suggestions");
        AbstractC22676k.m65750j(topics, "topics");
        return new AiChatConversation(id4, messages, suggestions, topics, conversationContext, header, tag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiChatConversation)) {
            return false;
        }
        AiChatConversation aiChatConversation = (AiChatConversation) other;
        return AbstractC22676k.m65745e(this.id, aiChatConversation.id) && AbstractC22676k.m65745e(this.messages, aiChatConversation.messages) && AbstractC22676k.m65745e(this.suggestions, aiChatConversation.suggestions) && AbstractC22676k.m65745e(this.topics, aiChatConversation.topics) && AbstractC22676k.m65745e(this.conversationContext, aiChatConversation.conversationContext) && AbstractC22676k.m65745e(this.header, aiChatConversation.header) && AbstractC22676k.m65745e(this.tag, aiChatConversation.tag);
    }

    public final List<DesignSystemModel> getConversationContext() {
        return this.conversationContext;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getId() {
        return this.id;
    }

    public final List<AiChatMessage> getMessages() {
        return this.messages;
    }

    public final List<String> getSuggestions() {
        return this.suggestions;
    }

    public final BetaTagModel getTag() {
        return this.tag;
    }

    public final List<String> getTopics() {
        return this.topics;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(this.id.hashCode() * 31, 31, this.messages), 31, this.suggestions), 31, this.topics);
        List<DesignSystemModel> list = this.conversationContext;
        int iHashCode = (iM31983b + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.header;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BetaTagModel betaTagModel = this.tag;
        return iHashCode2 + (betaTagModel != null ? betaTagModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        List<AiChatMessage> list = this.messages;
        List<String> list2 = this.suggestions;
        List<String> list3 = this.topics;
        List<DesignSystemModel> list4 = this.conversationContext;
        String str2 = this.header;
        BetaTagModel betaTagModel = this.tag;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("AiChatConversation(id=", str, ", messages=", ", suggestions=", list);
        AbstractC21702c.m61148s(sbM94766o, list2, ", topics=", list3, ", conversationContext=");
        AbstractC17176i.m48511m(", header=", str2, ", tag=", sbM94766o, list4);
        sbM94766o.append(betaTagModel);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public /* synthetic */ AiChatConversation(int i13, String str, List list, List list2, List list3, List list4, String str2, BetaTagModel betaTagModel, SerializationConstructorMarker serializationConstructorMarker) {
        this.id = (i13 & 1) == 0 ? AbstractC11895b.m31995n("toString(...)") : str;
        int i14 = i13 & 2;
        C25271y c25271y = C25271y.f99162w;
        if (i14 == 0) {
            this.messages = c25271y;
        } else {
            this.messages = list;
        }
        if ((i13 & 4) == 0) {
            this.suggestions = c25271y;
        } else {
            this.suggestions = list2;
        }
        if ((i13 & 8) == 0) {
            this.topics = c25271y;
        } else {
            this.topics = list3;
        }
        if ((i13 & 16) == 0) {
            this.conversationContext = null;
        } else {
            this.conversationContext = list4;
        }
        if ((i13 & 32) == 0) {
            this.header = null;
        } else {
            this.header = str2;
        }
        if ((i13 & 64) == 0) {
            this.tag = null;
        } else {
            this.tag = betaTagModel;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AiChatConversation(String id4, List<AiChatMessage> messages, List<String> suggestions, List<String> topics, List<? extends DesignSystemModel> list, String str, BetaTagModel betaTagModel) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(messages, "messages");
        AbstractC22676k.m65750j(suggestions, "suggestions");
        AbstractC22676k.m65750j(topics, "topics");
        this.id = id4;
        this.messages = messages;
        this.suggestions = suggestions;
        this.topics = topics;
        this.conversationContext = list;
        this.header = str;
        this.tag = betaTagModel;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AiChatConversation(String str, List list, List list2, List list3, List list4, String str2, BetaTagModel betaTagModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i13 & 1) != 0 ? AbstractC11895b.m31995n("toString(...)") : str;
        int i14 = i13 & 2;
        C25271y c25271y = C25271y.f99162w;
        this(str, i14 != 0 ? c25271y : list, (i13 & 4) != 0 ? c25271y : list2, (i13 & 8) != 0 ? c25271y : list3, (i13 & 16) != 0 ? null : list4, (i13 & 32) != 0 ? null : str2, (i13 & 64) != 0 ? null : betaTagModel);
    }
}
