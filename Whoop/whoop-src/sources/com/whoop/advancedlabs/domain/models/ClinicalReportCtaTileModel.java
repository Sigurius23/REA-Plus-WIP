package com.whoop.advancedlabs.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.models.items.SecondaryButtonModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001bJL\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010 R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b3\u0010\u001b¨\u00066"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/ClinicalReportCtaTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "imageUrl", "title", "description", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "cta", "reportUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/ClinicalReportCtaTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/whoop/design/models/items/SecondaryButtonModel;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/SecondaryButtonModel;Ljava/lang/String;)Lcom/whoop/advancedlabs/domain/models/ClinicalReportCtaTileModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getImageUrl", "getTitle", "getDescription", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "getCta", "getReportUrl", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ClinicalReportCtaTileModel implements DesignSystemModel {
    private final SecondaryButtonModel cta;
    private final String description;
    private final String id;
    private final String imageUrl;
    private final String reportUrl;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = SecondaryButtonModel.$stable;

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/ClinicalReportCtaTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/ClinicalReportCtaTileModel;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ClinicalReportCtaTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ClinicalReportCtaTileModel(int i13, String str, String str2, String str3, String str4, SecondaryButtonModel secondaryButtonModel, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, ClinicalReportCtaTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.imageUrl = str2;
        this.title = str3;
        this.description = str4;
        this.cta = secondaryButtonModel;
        this.reportUrl = str5;
    }

    public static /* synthetic */ ClinicalReportCtaTileModel copy$default(ClinicalReportCtaTileModel clinicalReportCtaTileModel, String str, String str2, String str3, String str4, SecondaryButtonModel secondaryButtonModel, String str5, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = clinicalReportCtaTileModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = clinicalReportCtaTileModel.imageUrl;
        }
        if ((i13 & 4) != 0) {
            str3 = clinicalReportCtaTileModel.title;
        }
        if ((i13 & 8) != 0) {
            str4 = clinicalReportCtaTileModel.description;
        }
        if ((i13 & 16) != 0) {
            secondaryButtonModel = clinicalReportCtaTileModel.cta;
        }
        if ((i13 & 32) != 0) {
            str5 = clinicalReportCtaTileModel.reportUrl;
        }
        SecondaryButtonModel secondaryButtonModel2 = secondaryButtonModel;
        String str6 = str5;
        return clinicalReportCtaTileModel.copy(str, str2, str3, str4, secondaryButtonModel2, str6);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(ClinicalReportCtaTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.imageUrl);
        output.encodeStringElement(serialDesc, 2, self.title);
        output.encodeStringElement(serialDesc, 3, self.description);
        output.encodeSerializableElement(serialDesc, 4, SecondaryButtonModel$$serializer.INSTANCE, self.cta);
        output.encodeStringElement(serialDesc, 5, self.reportUrl);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SecondaryButtonModel getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getReportUrl() {
        return this.reportUrl;
    }

    public final ClinicalReportCtaTileModel copy(String id4, String imageUrl, String title, String description, SecondaryButtonModel cta, String reportUrl) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(cta, "cta");
        AbstractC22676k.m65750j(reportUrl, "reportUrl");
        return new ClinicalReportCtaTileModel(id4, imageUrl, title, description, cta, reportUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClinicalReportCtaTileModel)) {
            return false;
        }
        ClinicalReportCtaTileModel clinicalReportCtaTileModel = (ClinicalReportCtaTileModel) other;
        return AbstractC22676k.m65745e(this.id, clinicalReportCtaTileModel.id) && AbstractC22676k.m65745e(this.imageUrl, clinicalReportCtaTileModel.imageUrl) && AbstractC22676k.m65745e(this.title, clinicalReportCtaTileModel.title) && AbstractC22676k.m65745e(this.description, clinicalReportCtaTileModel.description) && AbstractC22676k.m65745e(this.cta, clinicalReportCtaTileModel.cta) && AbstractC22676k.m65745e(this.reportUrl, clinicalReportCtaTileModel.reportUrl);
    }

    public final SecondaryButtonModel getCta() {
        return this.cta;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getReportUrl() {
        return this.reportUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.reportUrl.hashCode() + ((this.cta.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.imageUrl), 31, this.title), 31, this.description)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.imageUrl;
        String str3 = this.title;
        String str4 = this.description;
        SecondaryButtonModel secondaryButtonModel = this.cta;
        String str5 = this.reportUrl;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ClinicalReportCtaTileModel(id=", str, ", imageUrl=", str2, ", title=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", description=", str4, ", cta=");
        sbM32001t.append(secondaryButtonModel);
        sbM32001t.append(", reportUrl=");
        sbM32001t.append(str5);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ClinicalReportCtaTileModel(String id4, String imageUrl, String title, String description, SecondaryButtonModel cta, String reportUrl) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(imageUrl, "imageUrl");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(cta, "cta");
        AbstractC22676k.m65750j(reportUrl, "reportUrl");
        this.id = id4;
        this.imageUrl = imageUrl;
        this.title = title;
        this.description = description;
        this.cta = cta;
        this.reportUrl = reportUrl;
    }
}
