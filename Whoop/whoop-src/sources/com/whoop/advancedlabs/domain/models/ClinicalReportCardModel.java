package com.whoop.advancedlabs.domain.models;

import com.whoop.design.models.DesignSystemModel;
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
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010*\u001a\u0004\b,\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b.\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b0\u0010\u001f¨\u00063"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "title", "Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;", "header", "Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;", "body", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;", "component4", "()Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;)Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitle", "Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardHeaderModel;", "getHeader", "Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardBodyModel;", "getBody", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ClinicalReportCardModel implements DesignSystemModel {
    private final ClinicalReportCardBodyModel body;
    private final ClinicalReportCardHeaderModel header;
    private final String id;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/ClinicalReportCardModel;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ClinicalReportCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ClinicalReportCardModel(int i13, String str, String str2, ClinicalReportCardHeaderModel clinicalReportCardHeaderModel, ClinicalReportCardBodyModel clinicalReportCardBodyModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ClinicalReportCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.title = str2;
        this.header = clinicalReportCardHeaderModel;
        this.body = clinicalReportCardBodyModel;
    }

    public static /* synthetic */ ClinicalReportCardModel copy$default(ClinicalReportCardModel clinicalReportCardModel, String str, String str2, ClinicalReportCardHeaderModel clinicalReportCardHeaderModel, ClinicalReportCardBodyModel clinicalReportCardBodyModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = clinicalReportCardModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = clinicalReportCardModel.title;
        }
        if ((i13 & 4) != 0) {
            clinicalReportCardHeaderModel = clinicalReportCardModel.header;
        }
        if ((i13 & 8) != 0) {
            clinicalReportCardBodyModel = clinicalReportCardModel.body;
        }
        return clinicalReportCardModel.copy(str, str2, clinicalReportCardHeaderModel, clinicalReportCardBodyModel);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(ClinicalReportCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeSerializableElement(serialDesc, 2, ClinicalReportCardHeaderModel$$serializer.INSTANCE, self.header);
        output.encodeSerializableElement(serialDesc, 3, ClinicalReportCardBodyModel$$serializer.INSTANCE, self.body);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ClinicalReportCardHeaderModel getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ClinicalReportCardBodyModel getBody() {
        return this.body;
    }

    public final ClinicalReportCardModel copy(String id4, String title, ClinicalReportCardHeaderModel header, ClinicalReportCardBodyModel body) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(body, "body");
        return new ClinicalReportCardModel(id4, title, header, body);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClinicalReportCardModel)) {
            return false;
        }
        ClinicalReportCardModel clinicalReportCardModel = (ClinicalReportCardModel) other;
        return AbstractC22676k.m65745e(this.id, clinicalReportCardModel.id) && AbstractC22676k.m65745e(this.title, clinicalReportCardModel.title) && AbstractC22676k.m65745e(this.header, clinicalReportCardModel.header) && AbstractC22676k.m65745e(this.body, clinicalReportCardModel.body);
    }

    public final ClinicalReportCardBodyModel getBody() {
        return this.body;
    }

    public final ClinicalReportCardHeaderModel getHeader() {
        return this.header;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.body.hashCode() + ((this.header.hashCode() + AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.title)) * 31);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.title;
        ClinicalReportCardHeaderModel clinicalReportCardHeaderModel = this.header;
        ClinicalReportCardBodyModel clinicalReportCardBodyModel = this.body;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ClinicalReportCardModel(id=", str, ", title=", str2, ", header=");
        sbM32001t.append(clinicalReportCardHeaderModel);
        sbM32001t.append(", body=");
        sbM32001t.append(clinicalReportCardBodyModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ClinicalReportCardModel(String id4, String title, ClinicalReportCardHeaderModel header, ClinicalReportCardBodyModel body) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(header, "header");
        AbstractC22676k.m65750j(body, "body");
        this.id = id4;
        this.title = title;
        this.header = header;
        this.body = body;
    }
}
