package com.whoop.user.journey.model.yearinreview;

import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import cq2.C11062a;
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
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBg\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#Jf\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b4\u0010\u001cR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010#¨\u00069"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/YearInReviewStreaksStatsCard;", "Lcom/whoop/design/models/DesignSystemModel;", "", "statValueTitle", "statSubtitle", "styleType", "todayStreakState", "imageUrl", "lottieUrl", "", "items", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/yearinreview/YearInReviewStreaksStatsCard;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/user/journey/model/yearinreview/YearInReviewStreaksStatsCard;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStatValueTitle", "getStatSubtitle", "getStyleType", "getTodayStreakState", "getImageUrl", "getLottieUrl", "Ljava/util/List;", "getItems", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class YearInReviewStreaksStatsCard implements DesignSystemModel {
    private final String imageUrl;
    private final List<DesignSystemModel> items;
    private final String lottieUrl;
    private final String statSubtitle;
    private final String statValueTitle;
    private final String styleType;
    private final String todayStreakState;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C11062a(25))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/YearInReviewStreaksStatsCard$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/yearinreview/YearInReviewStreaksStatsCard;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return YearInReviewStreaksStatsCard$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ YearInReviewStreaksStatsCard(int i13, String str, String str2, String str3, String str4, String str5, String str6, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, YearInReviewStreaksStatsCard$$serializer.INSTANCE.getDescriptor());
        }
        this.statValueTitle = str;
        this.statSubtitle = str2;
        this.styleType = str3;
        this.todayStreakState = str4;
        this.imageUrl = str5;
        this.lottieUrl = str6;
        this.items = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ YearInReviewStreaksStatsCard copy$default(YearInReviewStreaksStatsCard yearInReviewStreaksStatsCard, String str, String str2, String str3, String str4, String str5, String str6, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = yearInReviewStreaksStatsCard.statValueTitle;
        }
        if ((i13 & 2) != 0) {
            str2 = yearInReviewStreaksStatsCard.statSubtitle;
        }
        if ((i13 & 4) != 0) {
            str3 = yearInReviewStreaksStatsCard.styleType;
        }
        if ((i13 & 8) != 0) {
            str4 = yearInReviewStreaksStatsCard.todayStreakState;
        }
        if ((i13 & 16) != 0) {
            str5 = yearInReviewStreaksStatsCard.imageUrl;
        }
        if ((i13 & 32) != 0) {
            str6 = yearInReviewStreaksStatsCard.lottieUrl;
        }
        if ((i13 & 64) != 0) {
            list = yearInReviewStreaksStatsCard.items;
        }
        String str7 = str6;
        List list2 = list;
        String str8 = str5;
        String str9 = str3;
        return yearInReviewStreaksStatsCard.copy(str, str2, str9, str4, str8, str7, list2);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(YearInReviewStreaksStatsCard self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.statValueTitle);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.statSubtitle);
        output.encodeStringElement(serialDesc, 2, self.styleType);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.todayStreakState);
        output.encodeNullableSerializableElement(serialDesc, 4, stringSerializer, self.imageUrl);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.lottieUrl);
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.items);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStatValueTitle() {
        return this.statValueTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStatSubtitle() {
        return this.statSubtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStyleType() {
        return this.styleType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTodayStreakState() {
        return this.todayStreakState;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLottieUrl() {
        return this.lottieUrl;
    }

    public final List<DesignSystemModel> component7() {
        return this.items;
    }

    public final YearInReviewStreaksStatsCard copy(String statValueTitle, String statSubtitle, String styleType, String todayStreakState, String imageUrl, String lottieUrl, List<? extends DesignSystemModel> items) {
        AbstractC22676k.m65750j(statValueTitle, "statValueTitle");
        AbstractC22676k.m65750j(styleType, "styleType");
        return new YearInReviewStreaksStatsCard(statValueTitle, statSubtitle, styleType, todayStreakState, imageUrl, lottieUrl, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YearInReviewStreaksStatsCard)) {
            return false;
        }
        YearInReviewStreaksStatsCard yearInReviewStreaksStatsCard = (YearInReviewStreaksStatsCard) other;
        return AbstractC22676k.m65745e(this.statValueTitle, yearInReviewStreaksStatsCard.statValueTitle) && AbstractC22676k.m65745e(this.statSubtitle, yearInReviewStreaksStatsCard.statSubtitle) && AbstractC22676k.m65745e(this.styleType, yearInReviewStreaksStatsCard.styleType) && AbstractC22676k.m65745e(this.todayStreakState, yearInReviewStreaksStatsCard.todayStreakState) && AbstractC22676k.m65745e(this.imageUrl, yearInReviewStreaksStatsCard.imageUrl) && AbstractC22676k.m65745e(this.lottieUrl, yearInReviewStreaksStatsCard.lottieUrl) && AbstractC22676k.m65745e(this.items, yearInReviewStreaksStatsCard.items);
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final String getLottieUrl() {
        return this.lottieUrl;
    }

    public final String getStatSubtitle() {
        return this.statSubtitle;
    }

    public final String getStatValueTitle() {
        return this.statValueTitle;
    }

    public final String getStyleType() {
        return this.styleType;
    }

    public final String getTodayStreakState() {
        return this.todayStreakState;
    }

    public int hashCode() {
        int iHashCode = this.statValueTitle.hashCode() * 31;
        String str = this.statSubtitle;
        int iM30450d = AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.styleType);
        String str2 = this.todayStreakState;
        int iHashCode2 = (iM30450d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.lottieUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<DesignSystemModel> list = this.items;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.statValueTitle;
        String str2 = this.statSubtitle;
        String str3 = this.styleType;
        String str4 = this.todayStreakState;
        String str5 = this.imageUrl;
        String str6 = this.lottieUrl;
        List<DesignSystemModel> list = this.items;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("YearInReviewStreaksStatsCard(statValueTitle=", str, ", statSubtitle=", str2, ", styleType=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", todayStreakState=", str4, ", imageUrl=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", lottieUrl=", str6, ", items=");
        return AbstractC3855a.m11829m(sbM32001t, list, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public YearInReviewStreaksStatsCard(String statValueTitle, String str, String styleType, String str2, String str3, String str4, List<? extends DesignSystemModel> list) {
        AbstractC22676k.m65750j(statValueTitle, "statValueTitle");
        AbstractC22676k.m65750j(styleType, "styleType");
        this.statValueTitle = statValueTitle;
        this.statSubtitle = str;
        this.styleType = styleType;
        this.todayStreakState = str2;
        this.imageUrl = str3;
        this.lottieUrl = str4;
        this.items = list;
    }
}
