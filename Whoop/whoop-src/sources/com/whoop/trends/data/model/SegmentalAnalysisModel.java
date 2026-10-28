package com.whoop.trends.data.model;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import wl2.C37358a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fB]\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(JX\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010!J\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00102\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010\u001fR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00106\u0012\u0004\b8\u00105\u001a\u0004\b7\u0010!R \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00106\u0012\u0004\b:\u00105\u001a\u0004\b9\u0010!R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010;\u0012\u0004\b=\u00105\u001a\u0004\b<\u0010$R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010>\u0012\u0004\b@\u00105\u001a\u0004\b?\u0010&R(\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010A\u0012\u0004\bC\u00105\u001a\u0004\bB\u0010(¨\u0006F"}, m65681d2 = {"Lcom/whoop/trends/data/model/SegmentalAnalysisModel;", "", "Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;", "header", "", "primarySectionLabel", "secondarySectionLabel", "Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;", "emptyState", "Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;", "lastUpdated", "", "Lcom/whoop/trends/data/model/SegmentalAnalysisSegmentModel;", "segments", "<init>", "(Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$trends_release", "(Lcom/whoop/trends/data/model/SegmentalAnalysisModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;", "component5", "()Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;", "component6", "()Ljava/util/List;", "copy", "(Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;Ljava/util/List;)Lcom/whoop/trends/data/model/SegmentalAnalysisModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;", "getHeader", "getHeader$annotations", "()V", "Ljava/lang/String;", "getPrimarySectionLabel", "getPrimarySectionLabel$annotations", "getSecondarySectionLabel", "getSecondarySectionLabel$annotations", "Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;", "getEmptyState", "getEmptyState$annotations", "Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;", "getLastUpdated", "getLastUpdated$annotations", "Ljava/util/List;", "getSegments", "getSegments$annotations", "Companion", "$serializer", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SegmentalAnalysisModel {

    @SerializedName("empty_state")
    private final SegmentalAnalysisEmptyStateModel emptyState;

    @SerializedName("header")
    private final SegmentalAnalysisHeaderModel header;

    @SerializedName("last_updated")
    private final TimeSegmentLastUpdated lastUpdated;

    @SerializedName("primary_section_label")
    private final String primarySectionLabel;

    @SerializedName("secondary_section_label")
    private final String secondarySectionLabel;

    @SerializedName("segments")
    private final List<SegmentalAnalysisSegmentModel> segments;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C37358a(4))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trends/data/model/SegmentalAnalysisModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trends/data/model/SegmentalAnalysisModel;", "serializer", "()Lwc3/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SegmentalAnalysisModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SegmentalAnalysisModel(int i13, SegmentalAnalysisHeaderModel segmentalAnalysisHeaderModel, String str, String str2, SegmentalAnalysisEmptyStateModel segmentalAnalysisEmptyStateModel, TimeSegmentLastUpdated timeSegmentLastUpdated, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, SegmentalAnalysisModel$$serializer.INSTANCE.getDescriptor());
        }
        this.header = segmentalAnalysisHeaderModel;
        this.primarySectionLabel = str;
        this.secondarySectionLabel = str2;
        this.emptyState = segmentalAnalysisEmptyStateModel;
        this.lastUpdated = timeSegmentLastUpdated;
        this.segments = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SegmentalAnalysisSegmentModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SegmentalAnalysisModel copy$default(SegmentalAnalysisModel segmentalAnalysisModel, SegmentalAnalysisHeaderModel segmentalAnalysisHeaderModel, String str, String str2, SegmentalAnalysisEmptyStateModel segmentalAnalysisEmptyStateModel, TimeSegmentLastUpdated timeSegmentLastUpdated, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            segmentalAnalysisHeaderModel = segmentalAnalysisModel.header;
        }
        if ((i13 & 2) != 0) {
            str = segmentalAnalysisModel.primarySectionLabel;
        }
        if ((i13 & 4) != 0) {
            str2 = segmentalAnalysisModel.secondarySectionLabel;
        }
        if ((i13 & 8) != 0) {
            segmentalAnalysisEmptyStateModel = segmentalAnalysisModel.emptyState;
        }
        if ((i13 & 16) != 0) {
            timeSegmentLastUpdated = segmentalAnalysisModel.lastUpdated;
        }
        if ((i13 & 32) != 0) {
            list = segmentalAnalysisModel.segments;
        }
        TimeSegmentLastUpdated timeSegmentLastUpdated2 = timeSegmentLastUpdated;
        List list2 = list;
        return segmentalAnalysisModel.copy(segmentalAnalysisHeaderModel, str, str2, segmentalAnalysisEmptyStateModel, timeSegmentLastUpdated2, list2);
    }

    @InterfaceC37143h("empty_state")
    public static /* synthetic */ void getEmptyState$annotations() {
    }

    @InterfaceC37143h("header")
    public static /* synthetic */ void getHeader$annotations() {
    }

    @InterfaceC37143h("last_updated")
    public static /* synthetic */ void getLastUpdated$annotations() {
    }

    @InterfaceC37143h("primary_section_label")
    public static /* synthetic */ void getPrimarySectionLabel$annotations() {
    }

    @InterfaceC37143h("secondary_section_label")
    public static /* synthetic */ void getSecondarySectionLabel$annotations() {
    }

    @InterfaceC37143h("segments")
    public static /* synthetic */ void getSegments$annotations() {
    }

    public static final /* synthetic */ void write$Self$trends_release(SegmentalAnalysisModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SegmentalAnalysisHeaderModel$$serializer.INSTANCE, self.header);
        output.encodeStringElement(serialDesc, 1, self.primarySectionLabel);
        output.encodeStringElement(serialDesc, 2, self.secondarySectionLabel);
        output.encodeNullableSerializableElement(serialDesc, 3, SegmentalAnalysisEmptyStateModel$$serializer.INSTANCE, self.emptyState);
        output.encodeNullableSerializableElement(serialDesc, 4, TimeSegmentLastUpdated$$serializer.INSTANCE, self.lastUpdated);
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.segments);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SegmentalAnalysisHeaderModel getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPrimarySectionLabel() {
        return this.primarySectionLabel;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSecondarySectionLabel() {
        return this.secondarySectionLabel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SegmentalAnalysisEmptyStateModel getEmptyState() {
        return this.emptyState;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TimeSegmentLastUpdated getLastUpdated() {
        return this.lastUpdated;
    }

    public final List<SegmentalAnalysisSegmentModel> component6() {
        return this.segments;
    }

    public final SegmentalAnalysisModel copy(SegmentalAnalysisHeaderModel header, String primarySectionLabel, String secondarySectionLabel, SegmentalAnalysisEmptyStateModel emptyState, TimeSegmentLastUpdated lastUpdated, List<SegmentalAnalysisSegmentModel> segments) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(primarySectionLabel, "primarySectionLabel");
        AbstractC22676k.m65750j(secondarySectionLabel, "secondarySectionLabel");
        return new SegmentalAnalysisModel(header, primarySectionLabel, secondarySectionLabel, emptyState, lastUpdated, segments);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentalAnalysisModel)) {
            return false;
        }
        SegmentalAnalysisModel segmentalAnalysisModel = (SegmentalAnalysisModel) other;
        return AbstractC22676k.m65745e(this.header, segmentalAnalysisModel.header) && AbstractC22676k.m65745e(this.primarySectionLabel, segmentalAnalysisModel.primarySectionLabel) && AbstractC22676k.m65745e(this.secondarySectionLabel, segmentalAnalysisModel.secondarySectionLabel) && AbstractC22676k.m65745e(this.emptyState, segmentalAnalysisModel.emptyState) && AbstractC22676k.m65745e(this.lastUpdated, segmentalAnalysisModel.lastUpdated) && AbstractC22676k.m65745e(this.segments, segmentalAnalysisModel.segments);
    }

    public final SegmentalAnalysisEmptyStateModel getEmptyState() {
        return this.emptyState;
    }

    public final SegmentalAnalysisHeaderModel getHeader() {
        return this.header;
    }

    public final TimeSegmentLastUpdated getLastUpdated() {
        return this.lastUpdated;
    }

    public final String getPrimarySectionLabel() {
        return this.primarySectionLabel;
    }

    public final String getSecondarySectionLabel() {
        return this.secondarySectionLabel;
    }

    public final List<SegmentalAnalysisSegmentModel> getSegments() {
        return this.segments;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.header.hashCode() * 31, 31, this.primarySectionLabel), 31, this.secondarySectionLabel);
        SegmentalAnalysisEmptyStateModel segmentalAnalysisEmptyStateModel = this.emptyState;
        int iHashCode = (iM30450d + (segmentalAnalysisEmptyStateModel == null ? 0 : segmentalAnalysisEmptyStateModel.hashCode())) * 31;
        TimeSegmentLastUpdated timeSegmentLastUpdated = this.lastUpdated;
        int iHashCode2 = (iHashCode + (timeSegmentLastUpdated == null ? 0 : timeSegmentLastUpdated.hashCode())) * 31;
        List<SegmentalAnalysisSegmentModel> list = this.segments;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "SegmentalAnalysisModel(header=" + this.header + ", primarySectionLabel=" + this.primarySectionLabel + ", secondarySectionLabel=" + this.secondarySectionLabel + ", emptyState=" + this.emptyState + ", lastUpdated=" + this.lastUpdated + ", segments=" + this.segments + ")";
    }

    public SegmentalAnalysisModel(SegmentalAnalysisHeaderModel header, String primarySectionLabel, String secondarySectionLabel, SegmentalAnalysisEmptyStateModel segmentalAnalysisEmptyStateModel, TimeSegmentLastUpdated timeSegmentLastUpdated, List<SegmentalAnalysisSegmentModel> list) {
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(primarySectionLabel, "primarySectionLabel");
        AbstractC22676k.m65750j(secondarySectionLabel, "secondarySectionLabel");
        this.header = header;
        this.primarySectionLabel = primarySectionLabel;
        this.secondarySectionLabel = secondarySectionLabel;
        this.emptyState = segmentalAnalysisEmptyStateModel;
        this.lastUpdated = timeSegmentLastUpdated;
        this.segments = list;
    }
}
