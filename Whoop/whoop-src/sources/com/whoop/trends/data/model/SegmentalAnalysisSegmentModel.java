package com.whoop.trends.data.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import wl2.C37358a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bBO\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001fJF\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001bJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010\u001dR&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00101\u0012\u0004\b3\u0010-\u001a\u0004\b2\u0010\u001fR(\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00101\u0012\u0004\b5\u0010-\u001a\u0004\b4\u0010\u001f¨\u00068"}, m65681d2 = {"Lcom/whoop/trends/data/model/SegmentalAnalysisSegmentModel;", "", "", "title", "Lcom/whoop/trends/data/model/SegmentalAnalysisTrendStatModel;", "trendStat", "", "Lcom/whoop/trends/data/model/SegmentalAnalysisTrendReadingModel;", "mostRecentReading", "previousReading", "<init>", "(Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentalAnalysisTrendStatModel;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/trends/data/model/SegmentalAnalysisTrendStatModel;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$trends_release", "(Lcom/whoop/trends/data/model/SegmentalAnalysisSegmentModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/trends/data/model/SegmentalAnalysisTrendStatModel;", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentalAnalysisTrendStatModel;Ljava/util/List;Ljava/util/List;)Lcom/whoop/trends/data/model/SegmentalAnalysisSegmentModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Lcom/whoop/trends/data/model/SegmentalAnalysisTrendStatModel;", "getTrendStat", "getTrendStat$annotations", "Ljava/util/List;", "getMostRecentReading", "getMostRecentReading$annotations", "getPreviousReading", "getPreviousReading$annotations", "Companion", "$serializer", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SegmentalAnalysisSegmentModel {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("most_recent_reading")
    private final List<SegmentalAnalysisTrendReadingModel> mostRecentReading;

    @SerializedName("previous_reading")
    private final List<SegmentalAnalysisTrendReadingModel> previousReading;

    @SerializedName("title")
    private final String title;

    @SerializedName("trend_stat")
    private final SegmentalAnalysisTrendStatModel trendStat;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trends/data/model/SegmentalAnalysisSegmentModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trends/data/model/SegmentalAnalysisSegmentModel;", "serializer", "()Lwc3/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SegmentalAnalysisSegmentModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C37358a(5)), AbstractC30060g.m92087G(enumC23463i, new C37358a(6))};
    }

    public /* synthetic */ SegmentalAnalysisSegmentModel(int i13, String str, SegmentalAnalysisTrendStatModel segmentalAnalysisTrendStatModel, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, SegmentalAnalysisSegmentModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.trendStat = segmentalAnalysisTrendStatModel;
        this.mostRecentReading = list;
        this.previousReading = list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SegmentalAnalysisTrendReadingModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(SegmentalAnalysisTrendReadingModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SegmentalAnalysisSegmentModel copy$default(SegmentalAnalysisSegmentModel segmentalAnalysisSegmentModel, String str, SegmentalAnalysisTrendStatModel segmentalAnalysisTrendStatModel, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = segmentalAnalysisSegmentModel.title;
        }
        if ((i13 & 2) != 0) {
            segmentalAnalysisTrendStatModel = segmentalAnalysisSegmentModel.trendStat;
        }
        if ((i13 & 4) != 0) {
            list = segmentalAnalysisSegmentModel.mostRecentReading;
        }
        if ((i13 & 8) != 0) {
            list2 = segmentalAnalysisSegmentModel.previousReading;
        }
        return segmentalAnalysisSegmentModel.copy(str, segmentalAnalysisTrendStatModel, list, list2);
    }

    @InterfaceC37143h("most_recent_reading")
    public static /* synthetic */ void getMostRecentReading$annotations() {
    }

    @InterfaceC37143h("previous_reading")
    public static /* synthetic */ void getPreviousReading$annotations() {
    }

    @InterfaceC37143h("title")
    public static /* synthetic */ void getTitle$annotations() {
    }

    @InterfaceC37143h("trend_stat")
    public static /* synthetic */ void getTrendStat$annotations() {
    }

    public static final /* synthetic */ void write$Self$trends_release(SegmentalAnalysisSegmentModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeSerializableElement(serialDesc, 1, SegmentalAnalysisTrendStatModel$$serializer.INSTANCE, self.trendStat);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.mostRecentReading);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.previousReading);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final SegmentalAnalysisTrendStatModel getTrendStat() {
        return this.trendStat;
    }

    public final List<SegmentalAnalysisTrendReadingModel> component3() {
        return this.mostRecentReading;
    }

    public final List<SegmentalAnalysisTrendReadingModel> component4() {
        return this.previousReading;
    }

    public final SegmentalAnalysisSegmentModel copy(String title, SegmentalAnalysisTrendStatModel trendStat, List<SegmentalAnalysisTrendReadingModel> mostRecentReading, List<SegmentalAnalysisTrendReadingModel> previousReading) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(trendStat, "trendStat");
        AbstractC22676k.m65750j(mostRecentReading, "mostRecentReading");
        return new SegmentalAnalysisSegmentModel(title, trendStat, mostRecentReading, previousReading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentalAnalysisSegmentModel)) {
            return false;
        }
        SegmentalAnalysisSegmentModel segmentalAnalysisSegmentModel = (SegmentalAnalysisSegmentModel) other;
        return AbstractC22676k.m65745e(this.title, segmentalAnalysisSegmentModel.title) && AbstractC22676k.m65745e(this.trendStat, segmentalAnalysisSegmentModel.trendStat) && AbstractC22676k.m65745e(this.mostRecentReading, segmentalAnalysisSegmentModel.mostRecentReading) && AbstractC22676k.m65745e(this.previousReading, segmentalAnalysisSegmentModel.previousReading);
    }

    public final List<SegmentalAnalysisTrendReadingModel> getMostRecentReading() {
        return this.mostRecentReading;
    }

    public final List<SegmentalAnalysisTrendReadingModel> getPreviousReading() {
        return this.previousReading;
    }

    public final String getTitle() {
        return this.title;
    }

    public final SegmentalAnalysisTrendStatModel getTrendStat() {
        return this.trendStat;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b((this.trendStat.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.mostRecentReading);
        List<SegmentalAnalysisTrendReadingModel> list = this.previousReading;
        return iM31983b + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        String str = this.title;
        SegmentalAnalysisTrendStatModel segmentalAnalysisTrendStatModel = this.trendStat;
        List<SegmentalAnalysisTrendReadingModel> list = this.mostRecentReading;
        List<SegmentalAnalysisTrendReadingModel> list2 = this.previousReading;
        StringBuilder sb4 = new StringBuilder("SegmentalAnalysisSegmentModel(title=");
        sb4.append(str);
        sb4.append(", trendStat=");
        sb4.append(segmentalAnalysisTrendStatModel);
        sb4.append(", mostRecentReading=");
        return AbstractC30007c.m91843m(sb4, list, ", previousReading=", list2, ")");
    }

    public SegmentalAnalysisSegmentModel(String title, SegmentalAnalysisTrendStatModel trendStat, List<SegmentalAnalysisTrendReadingModel> mostRecentReading, List<SegmentalAnalysisTrendReadingModel> list) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(trendStat, "trendStat");
        AbstractC22676k.m65750j(mostRecentReading, "mostRecentReading");
        this.title = title;
        this.trendStat = trendStat;
        this.mostRecentReading = mostRecentReading;
        this.previousReading = list;
    }
}
