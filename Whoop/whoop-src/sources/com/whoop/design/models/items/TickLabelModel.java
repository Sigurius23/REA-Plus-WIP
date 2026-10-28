package com.whoop.design.models.items;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36964k;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$JP\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u001eJ\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001cJ\u001a\u0010*\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b0\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b2\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b3\u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b\u000b\u0010$¨\u00067"}, m65681d2 = {"Lcom/whoop/design/models/items/TickLabelModel;", "", "", "index", "", "label", "subLabel", "Lcom/whoop/design/models/items/TickMarkStyle;", "labelStyle", "subLabelStyle", "", "isBelow", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TickMarkStyle;Lcom/whoop/design/models/items/TickMarkStyle;Z)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TickMarkStyle;Lcom/whoop/design/models/items/TickMarkStyle;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/TickLabelModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/whoop/design/models/items/TickMarkStyle;", "component5", "component6", "()Z", "copy", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/TickMarkStyle;Lcom/whoop/design/models/items/TickMarkStyle;Z)Lcom/whoop/design/models/items/TickLabelModel;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getIndex", "Ljava/lang/String;", "getLabel", "getSubLabel", "Lcom/whoop/design/models/items/TickMarkStyle;", "getLabelStyle", "getSubLabelStyle", "Z", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TickLabelModel {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int index;
    private final boolean isBelow;
    private final String label;
    private final TickMarkStyle labelStyle;
    private final String subLabel;
    private final TickMarkStyle subLabelStyle;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/TickLabelModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/TickLabelModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TickLabelModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36964k(14)), AbstractC30060g.m92087G(enumC23463i, new C36964k(15)), null};
    }

    public /* synthetic */ TickLabelModel(int i13, int i14, String str, String str2, TickMarkStyle tickMarkStyle, TickMarkStyle tickMarkStyle2, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, TickLabelModel$$serializer.INSTANCE.getDescriptor());
        }
        this.index = i14;
        this.label = str;
        this.subLabel = str2;
        this.labelStyle = tickMarkStyle;
        this.subLabelStyle = tickMarkStyle2;
        this.isBelow = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.TickMarkStyle", TickMarkStyle.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.TickMarkStyle", TickMarkStyle.values());
    }

    public static /* synthetic */ TickLabelModel copy$default(TickLabelModel tickLabelModel, int i13, String str, String str2, TickMarkStyle tickMarkStyle, TickMarkStyle tickMarkStyle2, boolean z4, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = tickLabelModel.index;
        }
        if ((i14 & 2) != 0) {
            str = tickLabelModel.label;
        }
        if ((i14 & 4) != 0) {
            str2 = tickLabelModel.subLabel;
        }
        if ((i14 & 8) != 0) {
            tickMarkStyle = tickLabelModel.labelStyle;
        }
        if ((i14 & 16) != 0) {
            tickMarkStyle2 = tickLabelModel.subLabelStyle;
        }
        if ((i14 & 32) != 0) {
            z4 = tickLabelModel.isBelow;
        }
        TickMarkStyle tickMarkStyle3 = tickMarkStyle2;
        boolean z13 = z4;
        return tickLabelModel.copy(i13, str, str2, tickMarkStyle, tickMarkStyle3, z13);
    }

    public static final /* synthetic */ void write$Self$design_models_release(TickLabelModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeIntElement(serialDesc, 0, self.index);
        output.encodeStringElement(serialDesc, 1, self.label);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.subLabel);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.labelStyle);
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.subLabelStyle);
        output.encodeBooleanElement(serialDesc, 5, self.isBelow);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubLabel() {
        return this.subLabel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final TickMarkStyle getLabelStyle() {
        return this.labelStyle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TickMarkStyle getSubLabelStyle() {
        return this.subLabelStyle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsBelow() {
        return this.isBelow;
    }

    public final TickLabelModel copy(int index, String label, String subLabel, TickMarkStyle labelStyle, TickMarkStyle subLabelStyle, boolean isBelow) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(labelStyle, "labelStyle");
        return new TickLabelModel(index, label, subLabel, labelStyle, subLabelStyle, isBelow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TickLabelModel)) {
            return false;
        }
        TickLabelModel tickLabelModel = (TickLabelModel) other;
        return this.index == tickLabelModel.index && AbstractC22676k.m65745e(this.label, tickLabelModel.label) && AbstractC22676k.m65745e(this.subLabel, tickLabelModel.subLabel) && this.labelStyle == tickLabelModel.labelStyle && this.subLabelStyle == tickLabelModel.subLabelStyle && this.isBelow == tickLabelModel.isBelow;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getLabel() {
        return this.label;
    }

    public final TickMarkStyle getLabelStyle() {
        return this.labelStyle;
    }

    public final String getSubLabel() {
        return this.subLabel;
    }

    public final TickMarkStyle getSubLabelStyle() {
        return this.subLabelStyle;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(Integer.hashCode(this.index) * 31, 31, this.label);
        String str = this.subLabel;
        int iHashCode = (this.labelStyle.hashCode() + ((iM30450d + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        TickMarkStyle tickMarkStyle = this.subLabelStyle;
        return Boolean.hashCode(this.isBelow) + ((iHashCode + (tickMarkStyle != null ? tickMarkStyle.hashCode() : 0)) * 31);
    }

    public final boolean isBelow() {
        return this.isBelow;
    }

    public String toString() {
        int i13 = this.index;
        String str = this.label;
        String str2 = this.subLabel;
        TickMarkStyle tickMarkStyle = this.labelStyle;
        TickMarkStyle tickMarkStyle2 = this.subLabelStyle;
        boolean z4 = this.isBelow;
        StringBuilder sbM53373n = AbstractC18489d0.m53373n(i13, "TickLabelModel(index=", ", label=", str, ", subLabel=");
        sbM53373n.append(str2);
        sbM53373n.append(", labelStyle=");
        sbM53373n.append(tickMarkStyle);
        sbM53373n.append(", subLabelStyle=");
        sbM53373n.append(tickMarkStyle2);
        sbM53373n.append(", isBelow=");
        sbM53373n.append(z4);
        sbM53373n.append(")");
        return sbM53373n.toString();
    }

    public TickLabelModel(int i13, String label, String str, TickMarkStyle labelStyle, TickMarkStyle tickMarkStyle, boolean z4) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(labelStyle, "labelStyle");
        this.index = i13;
        this.label = label;
        this.subLabel = str;
        this.labelStyle = labelStyle;
        this.subLabelStyle = tickMarkStyle;
        this.isBelow = z4;
    }
}
