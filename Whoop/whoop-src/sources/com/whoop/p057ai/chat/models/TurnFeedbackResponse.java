package com.whoop.p057ai.chat.models;

import c13.AbstractC3855a;
import com.whoop.bot.models.feedback.AiFeedbackType;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
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
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B/\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0019\u001a\u00060\u0002j\u0002`\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ:\u0010\u001f\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00061"}, m65681d2 = {"Lcom/whoop/ai/chat/models/TurnFeedbackResponse;", "", "Lcom/whoop/bot/models/feedback/AiFeedbackType;", "Lcom/whoop/ai/chat/models/TurnFeedbackType;", "feedbackType", "", "feedbackResponse", "", "feedbackReasons", "<init>", "(Lcom/whoop/bot/models/feedback/AiFeedbackType;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/bot/models/feedback/AiFeedbackType;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$bot_release", "(Lcom/whoop/ai/chat/models/TurnFeedbackResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/bot/models/feedback/AiFeedbackType;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "copy", "(Lcom/whoop/bot/models/feedback/AiFeedbackType;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/ai/chat/models/TurnFeedbackResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/bot/models/feedback/AiFeedbackType;", "getFeedbackType", "Ljava/lang/String;", "getFeedbackResponse", "Ljava/util/List;", "getFeedbackReasons", "Companion", "$serializer", "a", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TurnFeedbackResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<String> feedbackReasons;
    private final String feedbackResponse;
    private final AiFeedbackType feedbackType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.ai.chat.models.TurnFeedbackResponse$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/ai/chat/models/TurnFeedbackResponse$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/ai/chat/models/TurnFeedbackResponse;", "serializer", "()Lwc3/c;", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TurnFeedbackResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C38138a(26)), null, AbstractC30060g.m92087G(enumC23463i, new C38138a(27))};
    }

    public /* synthetic */ TurnFeedbackResponse(int i13, AiFeedbackType aiFeedbackType, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, TurnFeedbackResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.feedbackType = aiFeedbackType;
        if ((i13 & 2) == 0) {
            this.feedbackResponse = null;
        } else {
            this.feedbackResponse = str;
        }
        if ((i13 & 4) == 0) {
            this.feedbackReasons = C25271y.f99162w;
        } else {
            this.feedbackReasons = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return AiFeedbackType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TurnFeedbackResponse copy$default(TurnFeedbackResponse turnFeedbackResponse, AiFeedbackType aiFeedbackType, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            aiFeedbackType = turnFeedbackResponse.feedbackType;
        }
        if ((i13 & 2) != 0) {
            str = turnFeedbackResponse.feedbackResponse;
        }
        if ((i13 & 4) != 0) {
            list = turnFeedbackResponse.feedbackReasons;
        }
        return turnFeedbackResponse.copy(aiFeedbackType, str, list);
    }

    public static final /* synthetic */ void write$Self$bot_release(TurnFeedbackResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.feedbackType);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.feedbackResponse != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.feedbackResponse);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && AbstractC22676k.m65745e(self.feedbackReasons, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.feedbackReasons);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AiFeedbackType getFeedbackType() {
        return this.feedbackType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFeedbackResponse() {
        return this.feedbackResponse;
    }

    public final List<String> component3() {
        return this.feedbackReasons;
    }

    public final TurnFeedbackResponse copy(AiFeedbackType feedbackType, String feedbackResponse, List<String> feedbackReasons) {
        AbstractC22676k.m65750j(feedbackType, "feedbackType");
        AbstractC22676k.m65750j(feedbackReasons, "feedbackReasons");
        return new TurnFeedbackResponse(feedbackType, feedbackResponse, feedbackReasons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TurnFeedbackResponse)) {
            return false;
        }
        TurnFeedbackResponse turnFeedbackResponse = (TurnFeedbackResponse) other;
        return this.feedbackType == turnFeedbackResponse.feedbackType && AbstractC22676k.m65745e(this.feedbackResponse, turnFeedbackResponse.feedbackResponse) && AbstractC22676k.m65745e(this.feedbackReasons, turnFeedbackResponse.feedbackReasons);
    }

    public final List<String> getFeedbackReasons() {
        return this.feedbackReasons;
    }

    public final String getFeedbackResponse() {
        return this.feedbackResponse;
    }

    public final AiFeedbackType getFeedbackType() {
        return this.feedbackType;
    }

    public int hashCode() {
        int iHashCode = this.feedbackType.hashCode() * 31;
        String str = this.feedbackResponse;
        return this.feedbackReasons.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        AiFeedbackType aiFeedbackType = this.feedbackType;
        String str = this.feedbackResponse;
        List<String> list = this.feedbackReasons;
        StringBuilder sb4 = new StringBuilder("TurnFeedbackResponse(feedbackType=");
        sb4.append(aiFeedbackType);
        sb4.append(", feedbackResponse=");
        sb4.append(str);
        sb4.append(", feedbackReasons=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }

    public TurnFeedbackResponse(AiFeedbackType feedbackType, String str, List<String> feedbackReasons) {
        AbstractC22676k.m65750j(feedbackType, "feedbackType");
        AbstractC22676k.m65750j(feedbackReasons, "feedbackReasons");
        this.feedbackType = feedbackType;
        this.feedbackResponse = str;
        this.feedbackReasons = feedbackReasons;
    }

    public /* synthetic */ TurnFeedbackResponse(AiFeedbackType aiFeedbackType, String str, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(aiFeedbackType, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? C25271y.f99162w : list);
    }
}
