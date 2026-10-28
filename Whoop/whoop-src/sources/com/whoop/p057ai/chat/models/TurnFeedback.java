package com.whoop.p057ai.chat.models;

import com.whoop.bot.models.feedback.AiFeedbackType;
import com.whoop.bot.models.feedback.AiMessageFeedback;
import com.whoop.bot.models.feedback.AiMessageFeedback$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
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
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ.\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u00060"}, m65681d2 = {"Lcom/whoop/ai/chat/models/TurnFeedback;", "", "", "turnId", "Lcom/whoop/bot/models/feedback/AiFeedbackType;", "typeSelected", "Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "feedback", "<init>", "(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lcom/whoop/bot/models/feedback/AiMessageFeedback;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lcom/whoop/bot/models/feedback/AiMessageFeedback;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/ai/chat/models/TurnFeedback;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/bot/models/feedback/AiFeedbackType;", "component3", "()Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "copy", "(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiFeedbackType;Lcom/whoop/bot/models/feedback/AiMessageFeedback;)Lcom/whoop/ai/chat/models/TurnFeedback;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTurnId", "Lcom/whoop/bot/models/feedback/AiFeedbackType;", "getTypeSelected", "Lcom/whoop/bot/models/feedback/AiMessageFeedback;", "getFeedback", "Companion", "$serializer", "a", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TurnFeedback {
    private final AiMessageFeedback feedback;
    private final String turnId;
    private final AiFeedbackType typeSelected;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C38138a(25)), null};

    /* JADX INFO: renamed from: com.whoop.ai.chat.models.TurnFeedback$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/ai/chat/models/TurnFeedback$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/ai/chat/models/TurnFeedback;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TurnFeedback$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TurnFeedback(int i13, String str, AiFeedbackType aiFeedbackType, AiMessageFeedback aiMessageFeedback, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, TurnFeedback$$serializer.INSTANCE.getDescriptor());
        }
        this.turnId = str;
        this.typeSelected = aiFeedbackType;
        this.feedback = aiMessageFeedback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return AiFeedbackType.INSTANCE.serializer();
    }

    public static /* synthetic */ TurnFeedback copy$default(TurnFeedback turnFeedback, String str, AiFeedbackType aiFeedbackType, AiMessageFeedback aiMessageFeedback, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = turnFeedback.turnId;
        }
        if ((i13 & 2) != 0) {
            aiFeedbackType = turnFeedback.typeSelected;
        }
        if ((i13 & 4) != 0) {
            aiMessageFeedback = turnFeedback.feedback;
        }
        return turnFeedback.copy(str, aiFeedbackType, aiMessageFeedback);
    }

    public static final /* synthetic */ void write$Self$bot_release(TurnFeedback self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.turnId);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.typeSelected);
        output.encodeSerializableElement(serialDesc, 2, AiMessageFeedback$$serializer.INSTANCE, self.feedback);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTurnId() {
        return this.turnId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AiFeedbackType getTypeSelected() {
        return this.typeSelected;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AiMessageFeedback getFeedback() {
        return this.feedback;
    }

    public final TurnFeedback copy(String turnId, AiFeedbackType typeSelected, AiMessageFeedback feedback) {
        AbstractC22676k.m65750j(turnId, "turnId");
        AbstractC22676k.m65750j(typeSelected, "typeSelected");
        AbstractC22676k.m65750j(feedback, "feedback");
        return new TurnFeedback(turnId, typeSelected, feedback);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TurnFeedback)) {
            return false;
        }
        TurnFeedback turnFeedback = (TurnFeedback) other;
        return AbstractC22676k.m65745e(this.turnId, turnFeedback.turnId) && this.typeSelected == turnFeedback.typeSelected && AbstractC22676k.m65745e(this.feedback, turnFeedback.feedback);
    }

    public final AiMessageFeedback getFeedback() {
        return this.feedback;
    }

    public final String getTurnId() {
        return this.turnId;
    }

    public final AiFeedbackType getTypeSelected() {
        return this.typeSelected;
    }

    public int hashCode() {
        return this.feedback.hashCode() + ((this.typeSelected.hashCode() + (this.turnId.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "TurnFeedback(turnId=" + this.turnId + ", typeSelected=" + this.typeSelected + ", feedback=" + this.feedback + ")";
    }

    public TurnFeedback(String turnId, AiFeedbackType typeSelected, AiMessageFeedback feedback) {
        AbstractC22676k.m65750j(turnId, "turnId");
        AbstractC22676k.m65750j(typeSelected, "typeSelected");
        AbstractC22676k.m65750j(feedback, "feedback");
        this.turnId = turnId;
        this.typeSelected = typeSelected;
        this.feedback = feedback;
    }
}
