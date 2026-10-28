package com.whoop.user.journey.model.yearinreview.chronologicalsection;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.ScoreGaugeDialModel;
import com.whoop.design.models.items.ScoreGaugeDialModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import dq2.C12293a;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
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
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t¢\u0006\u0004\b\u000b\u0010\fB]\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JZ\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010#¨\u00069"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/YearInReviewCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "header", "title", "subtitle", "image", "Lcom/whoop/design/models/items/ScoreGaugeDialModel;", "scoreGaugeDial", "", "cardItems", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ScoreGaugeDialModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ScoreGaugeDialModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/YearInReviewCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/whoop/design/models/items/ScoreGaugeDialModel;", "component6", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ScoreGaugeDialModel;Ljava/util/List;)Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/YearInReviewCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHeader", "getTitle", "getSubtitle", "getImage", "Lcom/whoop/design/models/items/ScoreGaugeDialModel;", "getScoreGaugeDial", "Ljava/util/List;", "getCardItems", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class YearInReviewCardModel implements DesignSystemModel {
    private final List<DesignSystemModel> cardItems;
    private final String header;
    private final String image;
    private final ScoreGaugeDialModel scoreGaugeDial;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C12293a(1))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/YearInReviewCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/yearinreview/chronologicalsection/YearInReviewCardModel;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return YearInReviewCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ YearInReviewCardModel(int i13, String str, String str2, String str3, String str4, ScoreGaugeDialModel scoreGaugeDialModel, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, YearInReviewCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.header = str;
        this.title = str2;
        this.subtitle = str3;
        this.image = str4;
        this.scoreGaugeDial = scoreGaugeDialModel;
        this.cardItems = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ YearInReviewCardModel copy$default(YearInReviewCardModel yearInReviewCardModel, String str, String str2, String str3, String str4, ScoreGaugeDialModel scoreGaugeDialModel, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = yearInReviewCardModel.header;
        }
        if ((i13 & 2) != 0) {
            str2 = yearInReviewCardModel.title;
        }
        if ((i13 & 4) != 0) {
            str3 = yearInReviewCardModel.subtitle;
        }
        if ((i13 & 8) != 0) {
            str4 = yearInReviewCardModel.image;
        }
        if ((i13 & 16) != 0) {
            scoreGaugeDialModel = yearInReviewCardModel.scoreGaugeDial;
        }
        if ((i13 & 32) != 0) {
            list = yearInReviewCardModel.cardItems;
        }
        ScoreGaugeDialModel scoreGaugeDialModel2 = scoreGaugeDialModel;
        List list2 = list;
        return yearInReviewCardModel.copy(str, str2, str3, str4, scoreGaugeDialModel2, list2);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(YearInReviewCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.header);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.image);
        output.encodeNullableSerializableElement(serialDesc, 4, ScoreGaugeDialModel$$serializer.INSTANCE, self.scoreGaugeDial);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.cardItems);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ScoreGaugeDialModel getScoreGaugeDial() {
        return this.scoreGaugeDial;
    }

    public final List<DesignSystemModel> component6() {
        return this.cardItems;
    }

    public final YearInReviewCardModel copy(String header, String title, String subtitle, String image, ScoreGaugeDialModel scoreGaugeDial, List<? extends DesignSystemModel> cardItems) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(cardItems, "cardItems");
        return new YearInReviewCardModel(header, title, subtitle, image, scoreGaugeDial, cardItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YearInReviewCardModel)) {
            return false;
        }
        YearInReviewCardModel yearInReviewCardModel = (YearInReviewCardModel) other;
        return AbstractC22676k.m65745e(this.header, yearInReviewCardModel.header) && AbstractC22676k.m65745e(this.title, yearInReviewCardModel.title) && AbstractC22676k.m65745e(this.subtitle, yearInReviewCardModel.subtitle) && AbstractC22676k.m65745e(this.image, yearInReviewCardModel.image) && AbstractC22676k.m65745e(this.scoreGaugeDial, yearInReviewCardModel.scoreGaugeDial) && AbstractC22676k.m65745e(this.cardItems, yearInReviewCardModel.cardItems);
    }

    public final List<DesignSystemModel> getCardItems() {
        return this.cardItems;
    }

    public final String getHeader() {
        return this.header;
    }

    public final String getImage() {
        return this.image;
    }

    public final ScoreGaugeDialModel getScoreGaugeDial() {
        return this.scoreGaugeDial;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.header;
        int iM30450d = AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.title);
        String str2 = this.subtitle;
        int iHashCode = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.image;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        ScoreGaugeDialModel scoreGaugeDialModel = this.scoreGaugeDial;
        return this.cardItems.hashCode() + ((iHashCode2 + (scoreGaugeDialModel != null ? scoreGaugeDialModel.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.header;
        String str2 = this.title;
        String str3 = this.subtitle;
        String str4 = this.image;
        ScoreGaugeDialModel scoreGaugeDialModel = this.scoreGaugeDial;
        List<DesignSystemModel> list = this.cardItems;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("YearInReviewCardModel(header=", str, ", title=", str2, ", subtitle=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", image=", str4, ", scoreGaugeDial=");
        sbM32001t.append(scoreGaugeDialModel);
        sbM32001t.append(", cardItems=");
        sbM32001t.append(list);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public YearInReviewCardModel(String str, String title, String str2, String str3, ScoreGaugeDialModel scoreGaugeDialModel, List<? extends DesignSystemModel> cardItems) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(cardItems, "cardItems");
        this.header = str;
        this.title = title;
        this.subtitle = str2;
        this.image = str3;
        this.scoreGaugeDial = scoreGaugeDialModel;
        this.cardItems = cardItems;
    }
}
