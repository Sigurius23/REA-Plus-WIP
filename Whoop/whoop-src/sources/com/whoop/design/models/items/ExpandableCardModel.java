package com.whoop.design.models.items;

import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36956c;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000254BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\n\u0010\u000bBQ\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"JL\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010&\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b\u0006\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\"¨\u00066"}, m65681d2 = {"Lcom/whoop/design/models/items/ExpandableCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "iconCollapsed", "iconExpanded", "", "isExpanded", "headerContent", "", "expandedContent", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/design/models/DesignSystemModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLcom/whoop/design/models/DesignSystemModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ExpandableCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Lcom/whoop/design/models/DesignSystemModel;", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/design/models/DesignSystemModel;Ljava/util/List;)Lcom/whoop/design/models/items/ExpandableCardModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIconCollapsed", "getIconExpanded", "Z", "Lcom/whoop/design/models/DesignSystemModel;", "getHeaderContent", "Ljava/util/List;", "getExpandedContent", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ExpandableCardModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<DesignSystemModel> expandedContent;
    private final DesignSystemModel headerContent;
    private final String iconCollapsed;
    private final String iconExpanded;
    private final boolean isExpanded;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ExpandableCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ExpandableCardModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ExpandableCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36956c(28)), AbstractC30060g.m92087G(enumC23463i, new C36956c(29))};
    }

    public /* synthetic */ ExpandableCardModel(int i13, String str, String str2, boolean z4, DesignSystemModel designSystemModel, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (8 != (i13 & 8)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 8, ExpandableCardModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.iconCollapsed = null;
        } else {
            this.iconCollapsed = str;
        }
        if ((i13 & 2) == 0) {
            this.iconExpanded = null;
        } else {
            this.iconExpanded = str2;
        }
        if ((i13 & 4) == 0) {
            this.isExpanded = false;
        } else {
            this.isExpanded = z4;
        }
        this.headerContent = designSystemModel;
        if ((i13 & 16) == 0) {
            this.expandedContent = C25271y.f99162w;
        } else {
            this.expandedContent = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExpandableCardModel copy$default(ExpandableCardModel expandableCardModel, String str, String str2, boolean z4, DesignSystemModel designSystemModel, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = expandableCardModel.iconCollapsed;
        }
        if ((i13 & 2) != 0) {
            str2 = expandableCardModel.iconExpanded;
        }
        if ((i13 & 4) != 0) {
            z4 = expandableCardModel.isExpanded;
        }
        if ((i13 & 8) != 0) {
            designSystemModel = expandableCardModel.headerContent;
        }
        if ((i13 & 16) != 0) {
            list = expandableCardModel.expandedContent;
        }
        List list2 = list;
        boolean z13 = z4;
        return expandableCardModel.copy(str, str2, z13, designSystemModel, list2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ExpandableCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.iconCollapsed != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.iconCollapsed);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.iconExpanded != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.iconExpanded);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.isExpanded) {
            output.encodeBooleanElement(serialDesc, 2, self.isExpanded);
        }
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.headerContent);
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && AbstractC22676k.m65745e(self.expandedContent, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.expandedContent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIconCollapsed() {
        return this.iconCollapsed;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIconExpanded() {
        return this.iconExpanded;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DesignSystemModel getHeaderContent() {
        return this.headerContent;
    }

    public final List<DesignSystemModel> component5() {
        return this.expandedContent;
    }

    public final ExpandableCardModel copy(String iconCollapsed, String iconExpanded, boolean isExpanded, DesignSystemModel headerContent, List<? extends DesignSystemModel> expandedContent) {
        AbstractC22676k.m65750j(headerContent, "headerContent");
        AbstractC22676k.m65750j(expandedContent, "expandedContent");
        return new ExpandableCardModel(iconCollapsed, iconExpanded, isExpanded, headerContent, expandedContent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpandableCardModel)) {
            return false;
        }
        ExpandableCardModel expandableCardModel = (ExpandableCardModel) other;
        return AbstractC22676k.m65745e(this.iconCollapsed, expandableCardModel.iconCollapsed) && AbstractC22676k.m65745e(this.iconExpanded, expandableCardModel.iconExpanded) && this.isExpanded == expandableCardModel.isExpanded && AbstractC22676k.m65745e(this.headerContent, expandableCardModel.headerContent) && AbstractC22676k.m65745e(this.expandedContent, expandableCardModel.expandedContent);
    }

    public final List<DesignSystemModel> getExpandedContent() {
        return this.expandedContent;
    }

    public final DesignSystemModel getHeaderContent() {
        return this.headerContent;
    }

    public final String getIconCollapsed() {
        return this.iconCollapsed;
    }

    public final String getIconExpanded() {
        return this.iconExpanded;
    }

    public int hashCode() {
        String str = this.iconCollapsed;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.iconExpanded;
        return this.expandedContent.hashCode() + ((this.headerContent.hashCode() + AbstractC2875y.m8289b((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.isExpanded)) * 31);
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public String toString() {
        String str = this.iconCollapsed;
        String str2 = this.iconExpanded;
        boolean z4 = this.isExpanded;
        DesignSystemModel designSystemModel = this.headerContent;
        List<DesignSystemModel> list = this.expandedContent;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ExpandableCardModel(iconCollapsed=", str, ", iconExpanded=", str2, ", isExpanded=");
        sbM32001t.append(z4);
        sbM32001t.append(", headerContent=");
        sbM32001t.append(designSystemModel);
        sbM32001t.append(", expandedContent=");
        return AbstractC3855a.m11829m(sbM32001t, list, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExpandableCardModel(String str, String str2, boolean z4, DesignSystemModel headerContent, List<? extends DesignSystemModel> expandedContent) {
        AbstractC22676k.m65750j(headerContent, "headerContent");
        AbstractC22676k.m65750j(expandedContent, "expandedContent");
        this.iconCollapsed = str;
        this.iconExpanded = str2;
        this.isExpanded = z4;
        this.headerContent = headerContent;
        this.expandedContent = expandedContent;
    }

    public /* synthetic */ ExpandableCardModel(String str, String str2, boolean z4, DesignSystemModel designSystemModel, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? false : z4, designSystemModel, (i13 & 16) != 0 ? C25271y.f99162w : list);
    }
}
