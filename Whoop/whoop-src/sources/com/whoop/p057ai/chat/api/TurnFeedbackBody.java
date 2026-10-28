package com.whoop.p057ai.chat.api;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import s51.C32219p;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002./B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tBI\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ@\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b*\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010\u001d¨\u00060"}, m65681d2 = {"Lcom/whoop/ai/chat/api/TurnFeedbackBody;", "", "", "turnId", "feedbackType", "feedbackResponse", "", "feedbackReasons", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/ai/chat/api/TurnFeedbackBody;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/ai/chat/api/TurnFeedbackBody;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTurnId", "getFeedbackType", "getFeedbackResponse", "Ljava/util/List;", "getFeedbackReasons", "Companion", "$serializer", "a", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TurnFeedbackBody {
    private final List<String> feedbackReasons;
    private final String feedbackResponse;
    private final String feedbackType;
    private final String turnId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C32219p(27))};

    /* JADX INFO: renamed from: com.whoop.ai.chat.api.TurnFeedbackBody$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/ai/chat/api/TurnFeedbackBody$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/ai/chat/api/TurnFeedbackBody;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TurnFeedbackBody$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TurnFeedbackBody(int i13, String str, String str2, String str3, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, TurnFeedbackBody$$serializer.INSTANCE.getDescriptor());
        }
        this.turnId = str;
        this.feedbackType = str2;
        if ((i13 & 4) == 0) {
            this.feedbackResponse = null;
        } else {
            this.feedbackResponse = str3;
        }
        if ((i13 & 8) == 0) {
            this.feedbackReasons = C25271y.f99162w;
        } else {
            this.feedbackReasons = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TurnFeedbackBody copy$default(TurnFeedbackBody turnFeedbackBody, String str, String str2, String str3, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = turnFeedbackBody.turnId;
        }
        if ((i13 & 2) != 0) {
            str2 = turnFeedbackBody.feedbackType;
        }
        if ((i13 & 4) != 0) {
            str3 = turnFeedbackBody.feedbackResponse;
        }
        if ((i13 & 8) != 0) {
            list = turnFeedbackBody.feedbackReasons;
        }
        return turnFeedbackBody.copy(str, str2, str3, list);
    }

    public static final /* synthetic */ void write$Self$bot_release(TurnFeedbackBody self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.turnId);
        output.encodeStringElement(serialDesc, 1, self.feedbackType);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.feedbackResponse != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.feedbackResponse);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && AbstractC22676k.m65745e(self.feedbackReasons, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.feedbackReasons);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTurnId() {
        return this.turnId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFeedbackType() {
        return this.feedbackType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFeedbackResponse() {
        return this.feedbackResponse;
    }

    public final List<String> component4() {
        return this.feedbackReasons;
    }

    public final TurnFeedbackBody copy(String turnId, String feedbackType, String feedbackResponse, List<String> feedbackReasons) {
        AbstractC22676k.m65750j(turnId, "turnId");
        AbstractC22676k.m65750j(feedbackType, "feedbackType");
        AbstractC22676k.m65750j(feedbackReasons, "feedbackReasons");
        return new TurnFeedbackBody(turnId, feedbackType, feedbackResponse, feedbackReasons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TurnFeedbackBody)) {
            return false;
        }
        TurnFeedbackBody turnFeedbackBody = (TurnFeedbackBody) other;
        return AbstractC22676k.m65745e(this.turnId, turnFeedbackBody.turnId) && AbstractC22676k.m65745e(this.feedbackType, turnFeedbackBody.feedbackType) && AbstractC22676k.m65745e(this.feedbackResponse, turnFeedbackBody.feedbackResponse) && AbstractC22676k.m65745e(this.feedbackReasons, turnFeedbackBody.feedbackReasons);
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

    public final String getTurnId() {
        return this.turnId;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.turnId.hashCode() * 31, 31, this.feedbackType);
        String str = this.feedbackResponse;
        return this.feedbackReasons.hashCode() + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.turnId;
        String str2 = this.feedbackType;
        return AbstractC30007c.m91840j(this.feedbackResponse, ", feedbackReasons=", ")", AbstractC11895b.m32001t("TurnFeedbackBody(turnId=", str, ", feedbackType=", str2, ", feedbackResponse="), this.feedbackReasons);
    }

    public TurnFeedbackBody(String turnId, String feedbackType, String str, List<String> feedbackReasons) {
        AbstractC22676k.m65750j(turnId, "turnId");
        AbstractC22676k.m65750j(feedbackType, "feedbackType");
        AbstractC22676k.m65750j(feedbackReasons, "feedbackReasons");
        this.turnId = turnId;
        this.feedbackType = feedbackType;
        this.feedbackResponse = str;
        this.feedbackReasons = feedbackReasons;
    }

    public /* synthetic */ TurnFeedbackBody(String str, String str2, String str3, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? C25271y.f99162w : list);
    }
}
