package com.whoop.clinicianintheloop.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.models.items.SecondaryButtonModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.lang.annotation.Annotation;
import java.util.List;
import jl0.C21769a;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nh3.AbstractC26725a;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fBi\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b)\u0010(Jb\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\u00072\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b7\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00108\u001a\u0004\b\b\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010(R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\b=\u0010(¨\u0006@"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "", "stickyItems", "expandableItems", "", "isExpanded", "", "collapsedHeight", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "expandButton", "collapseButton", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZDLcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/SecondaryButtonModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;ZDLcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/SecondaryButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$clinician_in_the_loop_release", "(Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "()Z", "component5", "()D", "component6", "()Lcom/whoop/design/models/items/SecondaryButtonModel;", "component7", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZDLcom/whoop/design/models/items/SecondaryButtonModel;Lcom/whoop/design/models/items/SecondaryButtonModel;)Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getStickyItems", "getExpandableItems", "Z", "D", "getCollapsedHeight", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "getExpandButton", "getCollapseButton", "Companion", "$serializer", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ExpandableClinicianNoteModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final SecondaryButtonModel collapseButton;
    private final double collapsedHeight;
    private final SecondaryButtonModel expandButton;
    private final List<DesignSystemModel> expandableItems;
    private final String id;
    private final boolean isExpanded;
    private final List<DesignSystemModel> stickyItems;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/clinicianintheloop/domain/models/ExpandableClinicianNoteModel;", "serializer", "()Lwc3/c;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ExpandableClinicianNoteModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C21769a(20)), AbstractC30060g.m92087G(enumC23463i, new C21769a(21)), null, null, null, null};
    }

    public /* synthetic */ ExpandableClinicianNoteModel(int i13, String str, List list, List list2, boolean z4, double d3, SecondaryButtonModel secondaryButtonModel, SecondaryButtonModel secondaryButtonModel2, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, ExpandableClinicianNoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.stickyItems = list;
        this.expandableItems = list2;
        this.isExpanded = z4;
        this.collapsedHeight = d3;
        this.expandButton = secondaryButtonModel;
        this.collapseButton = secondaryButtonModel2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExpandableClinicianNoteModel copy$default(ExpandableClinicianNoteModel expandableClinicianNoteModel, String str, List list, List list2, boolean z4, double d3, SecondaryButtonModel secondaryButtonModel, SecondaryButtonModel secondaryButtonModel2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = expandableClinicianNoteModel.id;
        }
        if ((i13 & 2) != 0) {
            list = expandableClinicianNoteModel.stickyItems;
        }
        if ((i13 & 4) != 0) {
            list2 = expandableClinicianNoteModel.expandableItems;
        }
        if ((i13 & 8) != 0) {
            z4 = expandableClinicianNoteModel.isExpanded;
        }
        if ((i13 & 16) != 0) {
            d3 = expandableClinicianNoteModel.collapsedHeight;
        }
        if ((i13 & 32) != 0) {
            secondaryButtonModel = expandableClinicianNoteModel.expandButton;
        }
        if ((i13 & 64) != 0) {
            secondaryButtonModel2 = expandableClinicianNoteModel.collapseButton;
        }
        double d14 = d3;
        List list3 = list2;
        boolean z13 = z4;
        return expandableClinicianNoteModel.copy(str, list, list3, z13, d14, secondaryButtonModel, secondaryButtonModel2);
    }

    public static final /* synthetic */ void write$Self$clinician_in_the_loop_release(ExpandableClinicianNoteModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.stickyItems);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.expandableItems);
        output.encodeBooleanElement(serialDesc, 3, self.isExpanded);
        output.encodeDoubleElement(serialDesc, 4, self.collapsedHeight);
        SecondaryButtonModel$$serializer secondaryButtonModel$$serializer = SecondaryButtonModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 5, secondaryButtonModel$$serializer, self.expandButton);
        output.encodeSerializableElement(serialDesc, 6, secondaryButtonModel$$serializer, self.collapseButton);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<DesignSystemModel> component2() {
        return this.stickyItems;
    }

    public final List<DesignSystemModel> component3() {
        return this.expandableItems;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getCollapsedHeight() {
        return this.collapsedHeight;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SecondaryButtonModel getExpandButton() {
        return this.expandButton;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SecondaryButtonModel getCollapseButton() {
        return this.collapseButton;
    }

    public final ExpandableClinicianNoteModel copy(String id4, List<? extends DesignSystemModel> stickyItems, List<? extends DesignSystemModel> expandableItems, boolean isExpanded, double collapsedHeight, SecondaryButtonModel expandButton, SecondaryButtonModel collapseButton) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(stickyItems, "stickyItems");
        AbstractC22676k.m65750j(expandableItems, "expandableItems");
        AbstractC22676k.m65750j(expandButton, "expandButton");
        AbstractC22676k.m65750j(collapseButton, "collapseButton");
        return new ExpandableClinicianNoteModel(id4, stickyItems, expandableItems, isExpanded, collapsedHeight, expandButton, collapseButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpandableClinicianNoteModel)) {
            return false;
        }
        ExpandableClinicianNoteModel expandableClinicianNoteModel = (ExpandableClinicianNoteModel) other;
        return AbstractC22676k.m65745e(this.id, expandableClinicianNoteModel.id) && AbstractC22676k.m65745e(this.stickyItems, expandableClinicianNoteModel.stickyItems) && AbstractC22676k.m65745e(this.expandableItems, expandableClinicianNoteModel.expandableItems) && this.isExpanded == expandableClinicianNoteModel.isExpanded && Double.compare(this.collapsedHeight, expandableClinicianNoteModel.collapsedHeight) == 0 && AbstractC22676k.m65745e(this.expandButton, expandableClinicianNoteModel.expandButton) && AbstractC22676k.m65745e(this.collapseButton, expandableClinicianNoteModel.collapseButton);
    }

    public final SecondaryButtonModel getCollapseButton() {
        return this.collapseButton;
    }

    public final double getCollapsedHeight() {
        return this.collapsedHeight;
    }

    public final SecondaryButtonModel getExpandButton() {
        return this.expandButton;
    }

    public final List<DesignSystemModel> getExpandableItems() {
        return this.expandableItems;
    }

    public final String getId() {
        return this.id;
    }

    public final List<DesignSystemModel> getStickyItems() {
        return this.stickyItems;
    }

    public int hashCode() {
        return this.collapseButton.hashCode() + ((this.expandButton.hashCode() + AbstractC17176i.m48499a(AbstractC2875y.m8289b(AbstractC11895b.m31983b(AbstractC11895b.m31983b(this.id.hashCode() * 31, 31, this.stickyItems), 31, this.expandableItems), 31, this.isExpanded), 31, this.collapsedHeight)) * 31);
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public String toString() {
        String str = this.id;
        List<DesignSystemModel> list = this.stickyItems;
        List<DesignSystemModel> list2 = this.expandableItems;
        boolean z4 = this.isExpanded;
        double d3 = this.collapsedHeight;
        SecondaryButtonModel secondaryButtonModel = this.expandButton;
        SecondaryButtonModel secondaryButtonModel2 = this.collapseButton;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("ExpandableClinicianNoteModel(id=", str, ", stickyItems=", ", expandableItems=", list);
        AbstractC26725a.m79512p(", isExpanded=", ", collapsedHeight=", sbM94766o, list2, z4);
        sbM94766o.append(d3);
        sbM94766o.append(", expandButton=");
        sbM94766o.append(secondaryButtonModel);
        sbM94766o.append(", collapseButton=");
        sbM94766o.append(secondaryButtonModel2);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandableClinicianNoteModel(String id4, List<? extends DesignSystemModel> stickyItems, List<? extends DesignSystemModel> expandableItems, boolean z4, double d3, SecondaryButtonModel expandButton, SecondaryButtonModel collapseButton) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(stickyItems, "stickyItems");
        AbstractC22676k.m65750j(expandableItems, "expandableItems");
        AbstractC22676k.m65750j(expandButton, "expandButton");
        AbstractC22676k.m65750j(collapseButton, "collapseButton");
        this.id = id4;
        this.stickyItems = stickyItems;
        this.expandableItems = expandableItems;
        this.isExpanded = z4;
        this.collapsedHeight = d3;
        this.expandButton = expandButton;
        this.collapseButton = collapseButton;
    }
}
