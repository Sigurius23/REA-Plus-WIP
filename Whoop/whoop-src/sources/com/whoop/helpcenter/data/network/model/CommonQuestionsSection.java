package com.whoop.helpcenter.data.network.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import u91.C34656a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0018R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006*"}, m65681d2 = {"Lcom/whoop/helpcenter/data/network/model/CommonQuestionsSection;", "", "", "commonQuestionsTitle", "", "Lcom/whoop/helpcenter/data/network/model/CommonQuestionCard;", "commonQuestionCards", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$help_center_release", "(Lcom/whoop/helpcenter/data/network/model/CommonQuestionsSection;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/whoop/helpcenter/data/network/model/CommonQuestionsSection;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCommonQuestionsTitle", "Ljava/util/List;", "getCommonQuestionCards", "Companion", "$serializer", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CommonQuestionsSection {

    @SerializedName("common_question_cards")
    private final List<CommonQuestionCard> commonQuestionCards;

    @SerializedName("common_questions_title")
    private final String commonQuestionsTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C34656a(26))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/helpcenter/data/network/model/CommonQuestionsSection$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/helpcenter/data/network/model/CommonQuestionsSection;", "serializer", "()Lwc3/c;", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CommonQuestionsSection$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CommonQuestionsSection(int i13, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, CommonQuestionsSection$$serializer.INSTANCE.getDescriptor());
        }
        this.commonQuestionsTitle = str;
        this.commonQuestionCards = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(CommonQuestionCard$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommonQuestionsSection copy$default(CommonQuestionsSection commonQuestionsSection, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = commonQuestionsSection.commonQuestionsTitle;
        }
        if ((i13 & 2) != 0) {
            list = commonQuestionsSection.commonQuestionCards;
        }
        return commonQuestionsSection.copy(str, list);
    }

    public static final /* synthetic */ void write$Self$help_center_release(CommonQuestionsSection self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.commonQuestionsTitle);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.commonQuestionCards);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCommonQuestionsTitle() {
        return this.commonQuestionsTitle;
    }

    public final List<CommonQuestionCard> component2() {
        return this.commonQuestionCards;
    }

    public final CommonQuestionsSection copy(String commonQuestionsTitle, List<CommonQuestionCard> commonQuestionCards) {
        AbstractC22676k.m65750j(commonQuestionsTitle, "commonQuestionsTitle");
        AbstractC22676k.m65750j(commonQuestionCards, "commonQuestionCards");
        return new CommonQuestionsSection(commonQuestionsTitle, commonQuestionCards);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonQuestionsSection)) {
            return false;
        }
        CommonQuestionsSection commonQuestionsSection = (CommonQuestionsSection) other;
        return AbstractC22676k.m65745e(this.commonQuestionsTitle, commonQuestionsSection.commonQuestionsTitle) && AbstractC22676k.m65745e(this.commonQuestionCards, commonQuestionsSection.commonQuestionCards);
    }

    public final List<CommonQuestionCard> getCommonQuestionCards() {
        return this.commonQuestionCards;
    }

    public final String getCommonQuestionsTitle() {
        return this.commonQuestionsTitle;
    }

    public int hashCode() {
        return this.commonQuestionCards.hashCode() + (this.commonQuestionsTitle.hashCode() * 31);
    }

    public String toString() {
        return AbstractC36095b.m114679g("CommonQuestionsSection(commonQuestionsTitle=", this.commonQuestionsTitle, ", commonQuestionCards=", ")", this.commonQuestionCards);
    }

    public CommonQuestionsSection(String commonQuestionsTitle, List<CommonQuestionCard> commonQuestionCards) {
        AbstractC22676k.m65750j(commonQuestionsTitle, "commonQuestionsTitle");
        AbstractC22676k.m65750j(commonQuestionCards, "commonQuestionCards");
        this.commonQuestionsTitle = commonQuestionsTitle;
        this.commonQuestionCards = commonQuestionCards;
    }
}
