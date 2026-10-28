package com.whoop.user.journey.model.yearinreview;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import cq2.C11062a;
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
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J>\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010 R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b4\u0010\"¨\u00067"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;", "header", "", "Lcom/whoop/user/journey/model/yearinreview/ComparisonRow;", "comparisons", "Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;", "footer", "<init>", "(Ljava/lang/String;Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$user_journey_release", "(Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;", "component3", "()Ljava/util/List;", "component4", "()Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;", "copy", "(Ljava/lang/String;Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;Ljava/util/List;Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;)Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Lcom/whoop/user/journey/model/yearinreview/ComparisonHeader;", "getHeader", "Ljava/util/List;", "getComparisons", "Lcom/whoop/user/journey/model/yearinreview/ComparisonFooter;", "getFooter", "Companion", "$serializer", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class YearInReviewComparisonModel implements DesignSystemModel {
    private final List<ComparisonRow> comparisons;
    private final ComparisonFooter footer;
    private final ComparisonHeader header;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C11062a(23)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/user/journey/model/yearinreview/YearInReviewComparisonModel;", "serializer", "()Lwc3/c;", "user-journey_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return YearInReviewComparisonModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ YearInReviewComparisonModel(int i13, String str, ComparisonHeader comparisonHeader, List list, ComparisonFooter comparisonFooter, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, YearInReviewComparisonModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.header = comparisonHeader;
        this.comparisons = list;
        this.footer = comparisonFooter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ComparisonRow$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ YearInReviewComparisonModel copy$default(YearInReviewComparisonModel yearInReviewComparisonModel, String str, ComparisonHeader comparisonHeader, List list, ComparisonFooter comparisonFooter, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = yearInReviewComparisonModel.title;
        }
        if ((i13 & 2) != 0) {
            comparisonHeader = yearInReviewComparisonModel.header;
        }
        if ((i13 & 4) != 0) {
            list = yearInReviewComparisonModel.comparisons;
        }
        if ((i13 & 8) != 0) {
            comparisonFooter = yearInReviewComparisonModel.footer;
        }
        return yearInReviewComparisonModel.copy(str, comparisonHeader, list, comparisonFooter);
    }

    public static final /* synthetic */ void write$Self$user_journey_release(YearInReviewComparisonModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeSerializableElement(serialDesc, 1, ComparisonHeader$$serializer.INSTANCE, self.header);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.comparisons);
        output.encodeSerializableElement(serialDesc, 3, ComparisonFooter$$serializer.INSTANCE, self.footer);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ComparisonHeader getHeader() {
        return this.header;
    }

    public final List<ComparisonRow> component3() {
        return this.comparisons;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ComparisonFooter getFooter() {
        return this.footer;
    }

    public final YearInReviewComparisonModel copy(String title, ComparisonHeader header, List<ComparisonRow> comparisons, ComparisonFooter footer) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(comparisons, "comparisons");
        AbstractC22676k.m65750j(footer, "footer");
        return new YearInReviewComparisonModel(title, header, comparisons, footer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YearInReviewComparisonModel)) {
            return false;
        }
        YearInReviewComparisonModel yearInReviewComparisonModel = (YearInReviewComparisonModel) other;
        return AbstractC22676k.m65745e(this.title, yearInReviewComparisonModel.title) && AbstractC22676k.m65745e(this.header, yearInReviewComparisonModel.header) && AbstractC22676k.m65745e(this.comparisons, yearInReviewComparisonModel.comparisons) && AbstractC22676k.m65745e(this.footer, yearInReviewComparisonModel.footer);
    }

    public final List<ComparisonRow> getComparisons() {
        return this.comparisons;
    }

    public final ComparisonFooter getFooter() {
        return this.footer;
    }

    public final ComparisonHeader getHeader() {
        return this.header;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.footer.hashCode() + AbstractC11895b.m31983b((this.header.hashCode() + (this.title.hashCode() * 31)) * 31, 31, this.comparisons);
    }

    public String toString() {
        return "YearInReviewComparisonModel(title=" + this.title + ", header=" + this.header + ", comparisons=" + this.comparisons + ", footer=" + this.footer + ")";
    }

    public YearInReviewComparisonModel(String title, ComparisonHeader header, List<ComparisonRow> comparisons, ComparisonFooter footer) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(comparisons, "comparisons");
        AbstractC22676k.m65750j(footer, "footer");
        this.title = title;
        this.header = header;
        this.comparisons = comparisons;
        this.footer = footer;
    }
}
