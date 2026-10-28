package com.whoop.advancedlabs.domain.models;

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
import q83.AbstractC30060g;
import t91.C33662a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"JB\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b1\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010\"¨\u00068"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;", "", "Lcom/whoop/advancedlabs/domain/models/MetaData;", "metadata", "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "navigationBar", "", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;", "sections", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "analytics", "<init>", "(Lcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/advancedlabs/domain/models/MetaData;", "component2", "()Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "component3", "()Ljava/util/List;", "component4", "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "copy", "(Lcom/whoop/advancedlabs/domain/models/MetaData;Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;)Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/advancedlabs/domain/models/MetaData;", "getMetadata", "Lcom/whoop/advancedlabs/domain/models/NavigationBarModel;", "getNavigationBar", "Ljava/util/List;", "getSections", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "getAnalytics", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ClinicalInsightsResponse {
    private final AdvancedLabsAnalyticsDomainModel analytics;
    private final MetaData metadata;
    private final NavigationBarModel navigationBar;
    private final List<AdvancedLabsSectionModel> sections;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C33662a(27)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/ClinicalInsightsResponse;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ClinicalInsightsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ClinicalInsightsResponse(int i13, MetaData metaData, NavigationBarModel navigationBarModel, List list, AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ClinicalInsightsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.metadata = metaData;
        this.navigationBar = navigationBarModel;
        this.sections = list;
        this.analytics = advancedLabsAnalyticsDomainModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(AdvancedLabsSectionModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClinicalInsightsResponse copy$default(ClinicalInsightsResponse clinicalInsightsResponse, MetaData metaData, NavigationBarModel navigationBarModel, List list, AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            metaData = clinicalInsightsResponse.metadata;
        }
        if ((i13 & 2) != 0) {
            navigationBarModel = clinicalInsightsResponse.navigationBar;
        }
        if ((i13 & 4) != 0) {
            list = clinicalInsightsResponse.sections;
        }
        if ((i13 & 8) != 0) {
            advancedLabsAnalyticsDomainModel = clinicalInsightsResponse.analytics;
        }
        return clinicalInsightsResponse.copy(metaData, navigationBarModel, list, advancedLabsAnalyticsDomainModel);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(ClinicalInsightsResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, MetaData$$serializer.INSTANCE, self.metadata);
        output.encodeSerializableElement(serialDesc, 1, NavigationBarModel$$serializer.INSTANCE, self.navigationBar);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.sections);
        output.encodeNullableSerializableElement(serialDesc, 3, AdvancedLabsAnalyticsDomainModel$$serializer.INSTANCE, self.analytics);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MetaData getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    public final List<AdvancedLabsSectionModel> component3() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AdvancedLabsAnalyticsDomainModel getAnalytics() {
        return this.analytics;
    }

    public final ClinicalInsightsResponse copy(MetaData metadata, NavigationBarModel navigationBar, List<AdvancedLabsSectionModel> sections, AdvancedLabsAnalyticsDomainModel analytics) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(sections, "sections");
        return new ClinicalInsightsResponse(metadata, navigationBar, sections, analytics);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClinicalInsightsResponse)) {
            return false;
        }
        ClinicalInsightsResponse clinicalInsightsResponse = (ClinicalInsightsResponse) other;
        return AbstractC22676k.m65745e(this.metadata, clinicalInsightsResponse.metadata) && AbstractC22676k.m65745e(this.navigationBar, clinicalInsightsResponse.navigationBar) && AbstractC22676k.m65745e(this.sections, clinicalInsightsResponse.sections) && AbstractC22676k.m65745e(this.analytics, clinicalInsightsResponse.analytics);
    }

    public final AdvancedLabsAnalyticsDomainModel getAnalytics() {
        return this.analytics;
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final NavigationBarModel getNavigationBar() {
        return this.navigationBar;
    }

    public final List<AdvancedLabsSectionModel> getSections() {
        return this.sections;
    }

    public int hashCode() {
        MetaData metaData = this.metadata;
        int iM31983b = AbstractC11895b.m31983b((this.navigationBar.hashCode() + ((metaData == null ? 0 : metaData.hashCode()) * 31)) * 31, 31, this.sections);
        AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel = this.analytics;
        return iM31983b + (advancedLabsAnalyticsDomainModel != null ? advancedLabsAnalyticsDomainModel.hashCode() : 0);
    }

    public String toString() {
        return "ClinicalInsightsResponse(metadata=" + this.metadata + ", navigationBar=" + this.navigationBar + ", sections=" + this.sections + ", analytics=" + this.analytics + ")";
    }

    public ClinicalInsightsResponse(MetaData metaData, NavigationBarModel navigationBar, List<AdvancedLabsSectionModel> sections, AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel) {
        AbstractC22676k.m65750j(navigationBar, "navigationBar");
        AbstractC22676k.m65750j(sections, "sections");
        this.metadata = metaData;
        this.navigationBar = navigationBar;
        this.sections = sections;
        this.analytics = advancedLabsAnalyticsDomainModel;
    }
}
