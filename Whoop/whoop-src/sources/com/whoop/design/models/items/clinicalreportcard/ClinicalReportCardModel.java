package com.whoop.design.models.items.clinicalreportcard;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p004a2.C0155d;
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
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJF\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u001e¨\u00062"}, m65681d2 = {"Lcom/whoop/design/models/items/clinicalreportcard/ClinicalReportCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "imageUrl", "title", "description", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/clinicalreportcard/ClinicalReportCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/whoop/design/models/DesignSystemModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/items/clinicalreportcard/ClinicalReportCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getImageUrl", "getTitle", "getDescription", "Lcom/whoop/design/models/DesignSystemModel;", "getButton", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ClinicalReportCardModel implements DesignSystemModel {
    private final DesignSystemModel button;
    private final String description;
    private final String id;
    private final String imageUrl;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C0155d(10))};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/clinicalreportcard/ClinicalReportCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/clinicalreportcard/ClinicalReportCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
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

    public /* synthetic */ ClinicalReportCardModel(int i13, String str, String str2, String str3, String str4, DesignSystemModel designSystemModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i13 & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2, ClinicalReportCardModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        this.imageUrl = str2;
        if ((i13 & 4) == 0) {
            this.title = "";
        } else {
            this.title = str3;
        }
        if ((i13 & 8) == 0) {
            this.description = "";
        } else {
            this.description = str4;
        }
        if ((i13 & 16) == 0) {
            this.button = null;
        } else {
            this.button = designSystemModel;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    public static /* synthetic */ ClinicalReportCardModel copy$default(ClinicalReportCardModel clinicalReportCardModel, String str, String str2, String str3, String str4, DesignSystemModel designSystemModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = clinicalReportCardModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = clinicalReportCardModel.imageUrl;
        }
        if ((i13 & 4) != 0) {
            str3 = clinicalReportCardModel.title;
        }
        if ((i13 & 8) != 0) {
            str4 = clinicalReportCardModel.description;
        }
        if ((i13 & 16) != 0) {
            designSystemModel = clinicalReportCardModel.button;
        }
        DesignSystemModel designSystemModel2 = designSystemModel;
        String str5 = str3;
        return clinicalReportCardModel.copy(str, str2, str5, str4, designSystemModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ClinicalReportCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.id, "")) {
            output.encodeStringElement(serialDesc, 0, self.id);
        }
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.imageUrl);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.title, "")) {
            output.encodeStringElement(serialDesc, 2, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.description, "")) {
            output.encodeStringElement(serialDesc, 3, self.description);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.button == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.button);
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
    public final DesignSystemModel getButton() {
        return this.button;
    }

    public final ClinicalReportCardModel copy(String id4, String imageUrl, String title, String description, DesignSystemModel button) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        return new ClinicalReportCardModel(id4, imageUrl, title, description, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClinicalReportCardModel)) {
            return false;
        }
        ClinicalReportCardModel clinicalReportCardModel = (ClinicalReportCardModel) other;
        return AbstractC22676k.m65745e(this.id, clinicalReportCardModel.id) && AbstractC22676k.m65745e(this.imageUrl, clinicalReportCardModel.imageUrl) && AbstractC22676k.m65745e(this.title, clinicalReportCardModel.title) && AbstractC22676k.m65745e(this.description, clinicalReportCardModel.description) && AbstractC22676k.m65745e(this.button, clinicalReportCardModel.button);
    }

    public final DesignSystemModel getButton() {
        return this.button;
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

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.imageUrl;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.title), 31, this.description);
        DesignSystemModel designSystemModel = this.button;
        return iM30450d + (designSystemModel != null ? designSystemModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.imageUrl;
        String str3 = this.title;
        String str4 = this.description;
        DesignSystemModel designSystemModel = this.button;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ClinicalReportCardModel(id=", str, ", imageUrl=", str2, ", title=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", description=", str4, ", button=");
        sbM32001t.append(designSystemModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public ClinicalReportCardModel(String id4, String str, String title, String description, DesignSystemModel designSystemModel) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        this.id = id4;
        this.imageUrl = str;
        this.title = title;
        this.description = description;
        this.button = designSystemModel;
    }

    public /* synthetic */ ClinicalReportCardModel(String str, String str2, String str3, String str4, DesignSystemModel designSystemModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? null : designSystemModel);
    }
}
