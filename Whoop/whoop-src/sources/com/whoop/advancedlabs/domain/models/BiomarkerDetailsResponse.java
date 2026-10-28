package com.whoop.advancedlabs.domain.models;

import androidx.core.app.NotificationCompat;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
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
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB]\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0012\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b'\u0010(JV\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001fJ\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b7\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010%R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b:\u0010\u001fR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b<\u0010(¨\u0006?"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;", "", "", "navigationTitle", "Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsHeader;", "header", "", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsSectionModel;", "sections", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "analytics", NotificationCompat.CATEGORY_STATUS, "Lcom/whoop/advancedlabs/domain/models/MetaData;", "metadata", "<init>", "(Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsHeader;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/MetaData;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsHeader;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsHeader;", "component3", "()Ljava/util/List;", "component4", "()Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "component5", "component6", "()Lcom/whoop/advancedlabs/domain/models/MetaData;", "copy", "(Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsHeader;Ljava/util/List;Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/MetaData;)Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getNavigationTitle", "Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsHeader;", "getHeader", "Ljava/util/List;", "getSections", "Lcom/whoop/advancedlabs/domain/models/AdvancedLabsAnalyticsDomainModel;", "getAnalytics", "getStatus", "Lcom/whoop/advancedlabs/domain/models/MetaData;", "getMetadata", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BiomarkerDetailsResponse {
    private final AdvancedLabsAnalyticsDomainModel analytics;
    private final BiomarkerDetailsHeader header;
    private final MetaData metadata;
    private final String navigationTitle;
    private final List<AdvancedLabsSectionModel> sections;
    private final String status;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C33662a(18)), null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/BiomarkerDetailsResponse;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BiomarkerDetailsResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BiomarkerDetailsResponse(int i13, String str, BiomarkerDetailsHeader biomarkerDetailsHeader, List list, AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel, String str2, MetaData metaData, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, BiomarkerDetailsResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.navigationTitle = str;
        this.header = biomarkerDetailsHeader;
        this.sections = list;
        this.analytics = advancedLabsAnalyticsDomainModel;
        this.status = str2;
        this.metadata = metaData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(AdvancedLabsSectionModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BiomarkerDetailsResponse copy$default(BiomarkerDetailsResponse biomarkerDetailsResponse, String str, BiomarkerDetailsHeader biomarkerDetailsHeader, List list, AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel, String str2, MetaData metaData, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = biomarkerDetailsResponse.navigationTitle;
        }
        if ((i13 & 2) != 0) {
            biomarkerDetailsHeader = biomarkerDetailsResponse.header;
        }
        if ((i13 & 4) != 0) {
            list = biomarkerDetailsResponse.sections;
        }
        if ((i13 & 8) != 0) {
            advancedLabsAnalyticsDomainModel = biomarkerDetailsResponse.analytics;
        }
        if ((i13 & 16) != 0) {
            str2 = biomarkerDetailsResponse.status;
        }
        if ((i13 & 32) != 0) {
            metaData = biomarkerDetailsResponse.metadata;
        }
        String str3 = str2;
        MetaData metaData2 = metaData;
        return biomarkerDetailsResponse.copy(str, biomarkerDetailsHeader, list, advancedLabsAnalyticsDomainModel, str3, metaData2);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(BiomarkerDetailsResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.navigationTitle);
        output.encodeSerializableElement(serialDesc, 1, BiomarkerDetailsHeader$$serializer.INSTANCE, self.header);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.sections);
        output.encodeNullableSerializableElement(serialDesc, 3, AdvancedLabsAnalyticsDomainModel$$serializer.INSTANCE, self.analytics);
        output.encodeStringElement(serialDesc, 4, self.status);
        output.encodeNullableSerializableElement(serialDesc, 5, MetaData$$serializer.INSTANCE, self.metadata);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BiomarkerDetailsHeader getHeader() {
        return this.header;
    }

    public final List<AdvancedLabsSectionModel> component3() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AdvancedLabsAnalyticsDomainModel getAnalytics() {
        return this.analytics;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final BiomarkerDetailsResponse copy(String navigationTitle, BiomarkerDetailsHeader header, List<AdvancedLabsSectionModel> sections, AdvancedLabsAnalyticsDomainModel analytics, String status, MetaData metadata) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(status, "status");
        return new BiomarkerDetailsResponse(navigationTitle, header, sections, analytics, status, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiomarkerDetailsResponse)) {
            return false;
        }
        BiomarkerDetailsResponse biomarkerDetailsResponse = (BiomarkerDetailsResponse) other;
        return AbstractC22676k.m65745e(this.navigationTitle, biomarkerDetailsResponse.navigationTitle) && AbstractC22676k.m65745e(this.header, biomarkerDetailsResponse.header) && AbstractC22676k.m65745e(this.sections, biomarkerDetailsResponse.sections) && AbstractC22676k.m65745e(this.analytics, biomarkerDetailsResponse.analytics) && AbstractC22676k.m65745e(this.status, biomarkerDetailsResponse.status) && AbstractC22676k.m65745e(this.metadata, biomarkerDetailsResponse.metadata);
    }

    public final AdvancedLabsAnalyticsDomainModel getAnalytics() {
        return this.analytics;
    }

    public final BiomarkerDetailsHeader getHeader() {
        return this.header;
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final String getNavigationTitle() {
        return this.navigationTitle;
    }

    public final List<AdvancedLabsSectionModel> getSections() {
        return this.sections;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b((this.header.hashCode() + (this.navigationTitle.hashCode() * 31)) * 31, 31, this.sections);
        AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel = this.analytics;
        int iM30450d = AbstractC11266d.m30450d((iM31983b + (advancedLabsAnalyticsDomainModel == null ? 0 : advancedLabsAnalyticsDomainModel.hashCode())) * 31, 31, this.status);
        MetaData metaData = this.metadata;
        return iM30450d + (metaData != null ? metaData.hashCode() : 0);
    }

    public String toString() {
        return "BiomarkerDetailsResponse(navigationTitle=" + this.navigationTitle + ", header=" + this.header + ", sections=" + this.sections + ", analytics=" + this.analytics + ", status=" + this.status + ", metadata=" + this.metadata + ")";
    }

    public BiomarkerDetailsResponse(String navigationTitle, BiomarkerDetailsHeader header, List<AdvancedLabsSectionModel> sections, AdvancedLabsAnalyticsDomainModel advancedLabsAnalyticsDomainModel, String status, MetaData metaData) {
        AbstractC22676k.m65750j(navigationTitle, "navigationTitle");
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(sections, "sections");
        AbstractC22676k.m65750j(status, "status");
        this.navigationTitle = navigationTitle;
        this.header = header;
        this.sections = sections;
        this.analytics = advancedLabsAnalyticsDomainModel;
        this.status = status;
        this.metadata = metaData;
    }
}
