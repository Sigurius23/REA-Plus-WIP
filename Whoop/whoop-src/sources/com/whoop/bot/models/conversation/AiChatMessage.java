package com.whoop.bot.models.conversation;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.service.network.model.UserState;
import j02.C21179y0;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.UUID;
import jl0.C21769a;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
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
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0002ONB\u0093\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014B\u009b\u0001\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\u0006\u0010\u0012\u001a\u00020\f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001bJ\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001bJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001bJ\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\tHÆ\u0003¢\u0006\u0004\b)\u0010\"J\u0010\u0010*\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b*\u0010$J\u009c\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u001bJ\u0010\u0010.\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\f2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102J'\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b?\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b@\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010<\u001a\u0004\bA\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010<\u001a\u0004\bB\u0010\u001bR&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010C\u0012\u0004\bE\u0010F\u001a\u0004\bD\u0010\"R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010G\u001a\u0004\bH\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010I\u001a\u0004\b\u000e\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\bJ\u0010\u001bR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\bK\u0010\u001bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010C\u001a\u0004\bL\u0010\"R\u0017\u0010\u0012\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010G\u001a\u0004\bM\u0010$¨\u0006P"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/AiChatMessage;", "", "", "content", "Lcom/whoop/bot/models/conversation/AiMessageStatus;", "messageStatus", "role", "id", "timestamp", "", "Lcom/whoop/design/models/DesignSystemModel;", "additionalContext", "", "canHaveFeedback", "isSuggestion", "feedbackType", "feedbackResponse", "feedbackReasons", "stoppedByUser", "<init>", "(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/bot/models/conversation/AiMessageStatus;", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "()Z", "component8", "()Ljava/lang/Boolean;", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)Lcom/whoop/bot/models/conversation/AiChatMessage;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/bot/models/conversation/AiChatMessage;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getContent", "Lcom/whoop/bot/models/conversation/AiMessageStatus;", "getMessageStatus", "getRole", "getId", "getTimestamp", "Ljava/util/List;", "getAdditionalContext", "getAdditionalContext$annotations", "()V", "Z", "getCanHaveFeedback", "Ljava/lang/Boolean;", "getFeedbackType", "getFeedbackResponse", "getFeedbackReasons", "getStoppedByUser", "Companion", "$serializer", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AiChatMessage {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<DesignSystemModel> additionalContext;
    private final boolean canHaveFeedback;
    private final String content;
    private final List<String> feedbackReasons;
    private final String feedbackResponse;
    private final String feedbackType;
    private final String id;
    private final Boolean isSuggestion;
    private final AiMessageStatus messageStatus;
    private final String role;
    private final boolean stoppedByUser;
    private final String timestamp;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/bot/models/conversation/AiChatMessage$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/bot/models/conversation/AiChatMessage;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AiChatMessage$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C21179y0(29)), null, null, null, AbstractC30060g.m92087G(enumC23463i, new C21769a(0)), null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C21769a(1)), null};
    }

    public AiChatMessage() {
        this((String) null, (AiMessageStatus) null, (String) null, (String) null, (String) null, (List) null, false, (Boolean) null, (String) null, (String) null, (List) null, false, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.bot.models.conversation.AiMessageStatus", AiMessageStatus.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(List.class), new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0])), new InterfaceC37138c[]{new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0])});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AiChatMessage copy$default(AiChatMessage aiChatMessage, String str, AiMessageStatus aiMessageStatus, String str2, String str3, String str4, List list, boolean z4, Boolean bool, String str5, String str6, List list2, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = aiChatMessage.content;
        }
        if ((i13 & 2) != 0) {
            aiMessageStatus = aiChatMessage.messageStatus;
        }
        if ((i13 & 4) != 0) {
            str2 = aiChatMessage.role;
        }
        if ((i13 & 8) != 0) {
            str3 = aiChatMessage.id;
        }
        if ((i13 & 16) != 0) {
            str4 = aiChatMessage.timestamp;
        }
        if ((i13 & 32) != 0) {
            list = aiChatMessage.additionalContext;
        }
        if ((i13 & 64) != 0) {
            z4 = aiChatMessage.canHaveFeedback;
        }
        if ((i13 & 128) != 0) {
            bool = aiChatMessage.isSuggestion;
        }
        if ((i13 & 256) != 0) {
            str5 = aiChatMessage.feedbackType;
        }
        if ((i13 & 512) != 0) {
            str6 = aiChatMessage.feedbackResponse;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            list2 = aiChatMessage.feedbackReasons;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            z13 = aiChatMessage.stoppedByUser;
        }
        List list3 = list2;
        boolean z14 = z13;
        String str7 = str5;
        String str8 = str6;
        boolean z15 = z4;
        Boolean bool2 = bool;
        String str9 = str4;
        List list4 = list;
        return aiChatMessage.copy(str, aiMessageStatus, str2, str3, str9, list4, z15, bool2, str7, str8, list3, z14);
    }

    public static /* synthetic */ void getAdditionalContext$annotations() {
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    public static final /* synthetic */ void write$Self$bot_release(AiChatMessage self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.content, "")) {
            output.encodeStringElement(serialDesc, 0, self.content);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.messageStatus != AiMessageStatus.COMPLETE) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.messageStatus);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.role, UserState.Sources.USER)) {
            output.encodeStringElement(serialDesc, 2, self.role);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3)) {
            output.encodeStringElement(serialDesc, 3, self.id);
        } else {
            String str = self.id;
            String string = UUID.randomUUID().toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            if (!AbstractC22676k.m65745e(str, string)) {
                output.encodeStringElement(serialDesc, 3, self.id);
            }
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.timestamp != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.timestamp);
        }
        boolean zShouldEncodeElementDefault = output.shouldEncodeElementDefault(serialDesc, 5);
        C25271y c25271y = C25271y.f99162w;
        if (zShouldEncodeElementDefault || !AbstractC22676k.m65745e(self.additionalContext, c25271y)) {
            output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.additionalContext);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.canHaveFeedback) {
            output.encodeBooleanElement(serialDesc, 6, self.canHaveFeedback);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !AbstractC22676k.m65745e(self.isSuggestion, Boolean.FALSE)) {
            output.encodeNullableSerializableElement(serialDesc, 7, BooleanSerializer.INSTANCE, self.isSuggestion);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.feedbackType != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.feedbackType);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.feedbackResponse != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.feedbackResponse);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 10) || !AbstractC22676k.m65745e(self.feedbackReasons, c25271y)) {
            output.encodeSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.feedbackReasons);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 11) || self.stoppedByUser) {
            output.encodeBooleanElement(serialDesc, 11, self.stoppedByUser);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getFeedbackResponse() {
        return this.feedbackResponse;
    }

    public final List<String> component11() {
        return this.feedbackReasons;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getStoppedByUser() {
        return this.stoppedByUser;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AiMessageStatus getMessageStatus() {
        return this.messageStatus;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    public final List<DesignSystemModel> component6() {
        return this.additionalContext;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getCanHaveFeedback() {
        return this.canHaveFeedback;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getIsSuggestion() {
        return this.isSuggestion;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFeedbackType() {
        return this.feedbackType;
    }

    public final AiChatMessage copy(String content, AiMessageStatus messageStatus, String role, String id4, String timestamp, List<? extends DesignSystemModel> additionalContext, boolean canHaveFeedback, Boolean isSuggestion, String feedbackType, String feedbackResponse, List<String> feedbackReasons, boolean stoppedByUser) {
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(messageStatus, "messageStatus");
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(additionalContext, "additionalContext");
        AbstractC22676k.m65750j(feedbackReasons, "feedbackReasons");
        return new AiChatMessage(content, messageStatus, role, id4, timestamp, additionalContext, canHaveFeedback, isSuggestion, feedbackType, feedbackResponse, feedbackReasons, stoppedByUser);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiChatMessage)) {
            return false;
        }
        AiChatMessage aiChatMessage = (AiChatMessage) other;
        return AbstractC22676k.m65745e(this.content, aiChatMessage.content) && this.messageStatus == aiChatMessage.messageStatus && AbstractC22676k.m65745e(this.role, aiChatMessage.role) && AbstractC22676k.m65745e(this.id, aiChatMessage.id) && AbstractC22676k.m65745e(this.timestamp, aiChatMessage.timestamp) && AbstractC22676k.m65745e(this.additionalContext, aiChatMessage.additionalContext) && this.canHaveFeedback == aiChatMessage.canHaveFeedback && AbstractC22676k.m65745e(this.isSuggestion, aiChatMessage.isSuggestion) && AbstractC22676k.m65745e(this.feedbackType, aiChatMessage.feedbackType) && AbstractC22676k.m65745e(this.feedbackResponse, aiChatMessage.feedbackResponse) && AbstractC22676k.m65745e(this.feedbackReasons, aiChatMessage.feedbackReasons) && this.stoppedByUser == aiChatMessage.stoppedByUser;
    }

    public final List<DesignSystemModel> getAdditionalContext() {
        return this.additionalContext;
    }

    public final boolean getCanHaveFeedback() {
        return this.canHaveFeedback;
    }

    public final String getContent() {
        return this.content;
    }

    public final List<String> getFeedbackReasons() {
        return this.feedbackReasons;
    }

    public final String getFeedbackResponse() {
        return this.feedbackResponse;
    }

    public final String getFeedbackType() {
        return this.feedbackType;
    }

    public final String getId() {
        return this.id;
    }

    public final AiMessageStatus getMessageStatus() {
        return this.messageStatus;
    }

    public final String getRole() {
        return this.role;
    }

    public final boolean getStoppedByUser() {
        return this.stoppedByUser;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((this.messageStatus.hashCode() + (this.content.hashCode() * 31)) * 31, 31, this.role), 31, this.id);
        String str = this.timestamp;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11895b.m31983b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.additionalContext), 31, this.canHaveFeedback);
        Boolean bool = this.isSuggestion;
        int iHashCode = (iM8289b + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.feedbackType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.feedbackResponse;
        return Boolean.hashCode(this.stoppedByUser) + AbstractC11895b.m31983b((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.feedbackReasons);
    }

    public final Boolean isSuggestion() {
        return this.isSuggestion;
    }

    public String toString() {
        String str = this.content;
        AiMessageStatus aiMessageStatus = this.messageStatus;
        String str2 = this.role;
        String str3 = this.id;
        String str4 = this.timestamp;
        List<DesignSystemModel> list = this.additionalContext;
        boolean z4 = this.canHaveFeedback;
        Boolean bool = this.isSuggestion;
        String str5 = this.feedbackType;
        String str6 = this.feedbackResponse;
        List<String> list2 = this.feedbackReasons;
        boolean z13 = this.stoppedByUser;
        StringBuilder sb4 = new StringBuilder("AiChatMessage(content=");
        sb4.append(str);
        sb4.append(", messageStatus=");
        sb4.append(aiMessageStatus);
        sb4.append(", role=");
        AbstractC11266d.m30444B(sb4, str2, ", id=", str3, ", timestamp=");
        AbstractC36095b.m114694v(str4, ", additionalContext=", ", canHaveFeedback=", sb4, list);
        sb4.append(z4);
        sb4.append(", isSuggestion=");
        sb4.append(bool);
        sb4.append(", feedbackType=");
        AbstractC11266d.m30444B(sb4, str5, ", feedbackResponse=", str6, ", feedbackReasons=");
        sb4.append(list2);
        sb4.append(", stoppedByUser=");
        sb4.append(z13);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ AiChatMessage(int i13, String str, AiMessageStatus aiMessageStatus, String str2, String str3, String str4, List list, boolean z4, Boolean bool, String str5, String str6, List list2, boolean z13, SerializationConstructorMarker serializationConstructorMarker) {
        this.content = (i13 & 1) == 0 ? "" : str;
        if ((i13 & 2) == 0) {
            this.messageStatus = AiMessageStatus.COMPLETE;
        } else {
            this.messageStatus = aiMessageStatus;
        }
        if ((i13 & 4) == 0) {
            this.role = UserState.Sources.USER;
        } else {
            this.role = str2;
        }
        if ((i13 & 8) == 0) {
            this.id = AbstractC11895b.m31995n("toString(...)");
        } else {
            this.id = str3;
        }
        if ((i13 & 16) == 0) {
            this.timestamp = null;
        } else {
            this.timestamp = str4;
        }
        int i14 = i13 & 32;
        C25271y c25271y = C25271y.f99162w;
        if (i14 == 0) {
            this.additionalContext = c25271y;
        } else {
            this.additionalContext = list;
        }
        if ((i13 & 64) == 0) {
            this.canHaveFeedback = false;
        } else {
            this.canHaveFeedback = z4;
        }
        if ((i13 & 128) == 0) {
            this.isSuggestion = Boolean.FALSE;
        } else {
            this.isSuggestion = bool;
        }
        if ((i13 & 256) == 0) {
            this.feedbackType = null;
        } else {
            this.feedbackType = str5;
        }
        if ((i13 & 512) == 0) {
            this.feedbackResponse = null;
        } else {
            this.feedbackResponse = str6;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.feedbackReasons = c25271y;
        } else {
            this.feedbackReasons = list2;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 0) {
            this.stoppedByUser = false;
        } else {
            this.stoppedByUser = z13;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AiChatMessage(String content, AiMessageStatus messageStatus, String role, String id4, String str, List<? extends DesignSystemModel> additionalContext, boolean z4, Boolean bool, String str2, String str3, List<String> feedbackReasons, boolean z13) {
        AbstractC22676k.m65750j(content, "content");
        AbstractC22676k.m65750j(messageStatus, "messageStatus");
        AbstractC22676k.m65750j(role, "role");
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(additionalContext, "additionalContext");
        AbstractC22676k.m65750j(feedbackReasons, "feedbackReasons");
        this.content = content;
        this.messageStatus = messageStatus;
        this.role = role;
        this.id = id4;
        this.timestamp = str;
        this.additionalContext = additionalContext;
        this.canHaveFeedback = z4;
        this.isSuggestion = bool;
        this.feedbackType = str2;
        this.feedbackResponse = str3;
        this.feedbackReasons = feedbackReasons;
        this.stoppedByUser = z13;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AiChatMessage(String str, AiMessageStatus aiMessageStatus, String str2, String str3, String str4, List list, boolean z4, Boolean bool, String str5, String str6, List list2, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i13 & 1) != 0 ? "" : str;
        AiMessageStatus aiMessageStatus2 = (i13 & 2) != 0 ? AiMessageStatus.COMPLETE : aiMessageStatus;
        String str7 = (i13 & 4) != 0 ? UserState.Sources.USER : str2;
        String strM31995n = (i13 & 8) != 0 ? AbstractC11895b.m31995n("toString(...)") : str3;
        String str8 = (i13 & 16) != 0 ? null : str4;
        int i14 = i13 & 32;
        List list3 = C25271y.f99162w;
        this(str, aiMessageStatus2, str7, strM31995n, str8, i14 != 0 ? list3 : list, (i13 & 64) != 0 ? false : z4, (i13 & 128) != 0 ? Boolean.FALSE : bool, (i13 & 256) != 0 ? null : str5, (i13 & 512) == 0 ? str6 : null, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 ? list2 : list3, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z13);
    }
}
