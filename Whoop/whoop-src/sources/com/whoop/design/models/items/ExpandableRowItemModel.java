package com.whoop.design.models.items;

import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
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
import w91.C36957d;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B=\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!JH\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u001bJ\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010!¨\u00067"}, m65681d2 = {"Lcom/whoop/design/models/items/ExpandableRowItemModel;", "", "", "id", "titleDisplay", "descriptionDisplay", "Lcom/whoop/design/models/DesignSystemModel;", "rightItem", "Lcom/whoop/analytics/AnalyticEventModel;", "primaryAnalyticEvent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/analytics/AnalyticEventModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/analytics/AnalyticEventModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ExpandableRowItemModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/design/models/DesignSystemModel;", "component5", "()Lcom/whoop/analytics/AnalyticEventModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/analytics/AnalyticEventModel;)Lcom/whoop/design/models/items/ExpandableRowItemModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getTitleDisplay", "getDescriptionDisplay", "Lcom/whoop/design/models/DesignSystemModel;", "getRightItem", "getRightItem$annotations", "()V", "Lcom/whoop/analytics/AnalyticEventModel;", "getPrimaryAnalyticEvent", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ExpandableRowItemModel {
    private final String descriptionDisplay;
    private final String id;
    private final AnalyticEventModel primaryAnalyticEvent;
    private final DesignSystemModel rightItem;
    private final String titleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36957d(5)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ExpandableRowItemModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ExpandableRowItemModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ExpandableRowItemModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ ExpandableRowItemModel(int i13, String str, String str2, String str3, DesignSystemModel designSystemModel, AnalyticEventModel analyticEventModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (16 != (i13 & 16)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 16, ExpandableRowItemModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i13 & 2) == 0) {
            this.titleDisplay = "";
        } else {
            this.titleDisplay = str2;
        }
        if ((i13 & 4) == 0) {
            this.descriptionDisplay = "";
        } else {
            this.descriptionDisplay = str3;
        }
        if ((i13 & 8) == 0) {
            this.rightItem = null;
        } else {
            this.rightItem = designSystemModel;
        }
        this.primaryAnalyticEvent = analyticEventModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    public static /* synthetic */ ExpandableRowItemModel copy$default(ExpandableRowItemModel expandableRowItemModel, String str, String str2, String str3, DesignSystemModel designSystemModel, AnalyticEventModel analyticEventModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = expandableRowItemModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = expandableRowItemModel.titleDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = expandableRowItemModel.descriptionDisplay;
        }
        if ((i13 & 8) != 0) {
            designSystemModel = expandableRowItemModel.rightItem;
        }
        if ((i13 & 16) != 0) {
            analyticEventModel = expandableRowItemModel.primaryAnalyticEvent;
        }
        AnalyticEventModel analyticEventModel2 = analyticEventModel;
        String str4 = str3;
        return expandableRowItemModel.copy(str, str2, str4, designSystemModel, analyticEventModel2);
    }

    public static /* synthetic */ void getRightItem$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(ExpandableRowItemModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.titleDisplay, "")) {
            output.encodeStringElement(serialDesc, 1, self.titleDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.descriptionDisplay, "")) {
            output.encodeStringElement(serialDesc, 2, self.descriptionDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.rightItem != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.rightItem);
        }
        output.encodeNullableSerializableElement(serialDesc, 4, AnalyticEventModel$$serializer.INSTANCE, self.primaryAnalyticEvent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DesignSystemModel getRightItem() {
        return this.rightItem;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final AnalyticEventModel getPrimaryAnalyticEvent() {
        return this.primaryAnalyticEvent;
    }

    public final ExpandableRowItemModel copy(String id4, String titleDisplay, String descriptionDisplay, DesignSystemModel rightItem, AnalyticEventModel primaryAnalyticEvent) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        return new ExpandableRowItemModel(id4, titleDisplay, descriptionDisplay, rightItem, primaryAnalyticEvent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpandableRowItemModel)) {
            return false;
        }
        ExpandableRowItemModel expandableRowItemModel = (ExpandableRowItemModel) other;
        return AbstractC22676k.m65745e(this.id, expandableRowItemModel.id) && AbstractC22676k.m65745e(this.titleDisplay, expandableRowItemModel.titleDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, expandableRowItemModel.descriptionDisplay) && AbstractC22676k.m65745e(this.rightItem, expandableRowItemModel.rightItem) && AbstractC22676k.m65745e(this.primaryAnalyticEvent, expandableRowItemModel.primaryAnalyticEvent);
    }

    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public final String getId() {
        return this.id;
    }

    public final AnalyticEventModel getPrimaryAnalyticEvent() {
        return this.primaryAnalyticEvent;
    }

    public final DesignSystemModel getRightItem() {
        return this.rightItem;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        String str = this.id;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.titleDisplay), 31, this.descriptionDisplay);
        DesignSystemModel designSystemModel = this.rightItem;
        int iHashCode = (iM30450d + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.primaryAnalyticEvent;
        return iHashCode + (analyticEventModel != null ? analyticEventModel.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.titleDisplay;
        String str3 = this.descriptionDisplay;
        DesignSystemModel designSystemModel = this.rightItem;
        AnalyticEventModel analyticEventModel = this.primaryAnalyticEvent;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ExpandableRowItemModel(id=", str, ", titleDisplay=", str2, ", descriptionDisplay=");
        sbM32001t.append(str3);
        sbM32001t.append(", rightItem=");
        sbM32001t.append(designSystemModel);
        sbM32001t.append(", primaryAnalyticEvent=");
        return AbstractC38963t7.m124378h(sbM32001t, analyticEventModel, ")");
    }

    public ExpandableRowItemModel(String str, String titleDisplay, String descriptionDisplay, DesignSystemModel designSystemModel, AnalyticEventModel analyticEventModel) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        this.id = str;
        this.titleDisplay = titleDisplay;
        this.descriptionDisplay = descriptionDisplay;
        this.rightItem = designSystemModel;
        this.primaryAnalyticEvent = analyticEventModel;
    }

    public /* synthetic */ ExpandableRowItemModel(String str, String str2, String str3, DesignSystemModel designSystemModel, AnalyticEventModel analyticEventModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? null : designSystemModel, analyticEventModel);
    }
}
