package com.whoop.advancedlabs.domain.models;

import com.whoop.design.models.DateDisplay;
import com.whoop.design.models.DateDisplay$$serializer;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import tb0.C33690a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJ\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$JJ\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010!R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b4\u0010\u001dR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u0010$¨\u00069"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;", "", "", "selectionDisplay", "", "Lcom/whoop/advancedlabs/domain/models/SchedulingTileModel;", "scheduleTiles", "Lcom/whoop/design/models/DateDisplay;", "dateDisplay", "style", "Lcom/whoop/design/models/InfoCalloutTileModel;", "infoCallout", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DateDisplay;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DateDisplay;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/design/models/DateDisplay;", "component4", "component5", "()Lcom/whoop/design/models/InfoCalloutTileModel;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DateDisplay;Ljava/lang/String;Lcom/whoop/design/models/InfoCalloutTileModel;)Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSelectionDisplay", "Ljava/util/List;", "getScheduleTiles", "Lcom/whoop/design/models/DateDisplay;", "getDateDisplay", "getStyle", "Lcom/whoop/design/models/InfoCalloutTileModel;", "getInfoCallout", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SchedulePillModel {
    private final DateDisplay dateDisplay;
    private final InfoCalloutTileModel infoCallout;
    private final List<SchedulingTileModel> scheduleTiles;
    private final String selectionDisplay;
    private final String style;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C33690a(20)), null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/SchedulePillModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/SchedulePillModel;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SchedulePillModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SchedulePillModel(int i13, String str, List list, DateDisplay dateDisplay, String str2, InfoCalloutTileModel infoCalloutTileModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, SchedulePillModel$$serializer.INSTANCE.getDescriptor());
        }
        this.selectionDisplay = str;
        this.scheduleTiles = list;
        this.dateDisplay = dateDisplay;
        this.style = str2;
        this.infoCallout = infoCalloutTileModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(SchedulingTileModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SchedulePillModel copy$default(SchedulePillModel schedulePillModel, String str, List list, DateDisplay dateDisplay, String str2, InfoCalloutTileModel infoCalloutTileModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = schedulePillModel.selectionDisplay;
        }
        if ((i13 & 2) != 0) {
            list = schedulePillModel.scheduleTiles;
        }
        if ((i13 & 4) != 0) {
            dateDisplay = schedulePillModel.dateDisplay;
        }
        if ((i13 & 8) != 0) {
            str2 = schedulePillModel.style;
        }
        if ((i13 & 16) != 0) {
            infoCalloutTileModel = schedulePillModel.infoCallout;
        }
        InfoCalloutTileModel infoCalloutTileModel2 = infoCalloutTileModel;
        DateDisplay dateDisplay2 = dateDisplay;
        return schedulePillModel.copy(str, list, dateDisplay2, str2, infoCalloutTileModel2);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(SchedulePillModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.selectionDisplay);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.scheduleTiles);
        output.encodeSerializableElement(serialDesc, 2, DateDisplay$$serializer.INSTANCE, self.dateDisplay);
        output.encodeStringElement(serialDesc, 3, self.style);
        output.encodeNullableSerializableElement(serialDesc, 4, InfoCalloutTileModel$$serializer.INSTANCE, self.infoCallout);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSelectionDisplay() {
        return this.selectionDisplay;
    }

    public final List<SchedulingTileModel> component2() {
        return this.scheduleTiles;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DateDisplay getDateDisplay() {
        return this.dateDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final InfoCalloutTileModel getInfoCallout() {
        return this.infoCallout;
    }

    public final SchedulePillModel copy(String selectionDisplay, List<SchedulingTileModel> scheduleTiles, DateDisplay dateDisplay, String style, InfoCalloutTileModel infoCallout) {
        AbstractC22676k.m65750j(selectionDisplay, "selectionDisplay");
        AbstractC22676k.m65750j(scheduleTiles, "scheduleTiles");
        AbstractC22676k.m65750j(dateDisplay, "dateDisplay");
        AbstractC22676k.m65750j(style, "style");
        return new SchedulePillModel(selectionDisplay, scheduleTiles, dateDisplay, style, infoCallout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SchedulePillModel)) {
            return false;
        }
        SchedulePillModel schedulePillModel = (SchedulePillModel) other;
        return AbstractC22676k.m65745e(this.selectionDisplay, schedulePillModel.selectionDisplay) && AbstractC22676k.m65745e(this.scheduleTiles, schedulePillModel.scheduleTiles) && AbstractC22676k.m65745e(this.dateDisplay, schedulePillModel.dateDisplay) && AbstractC22676k.m65745e(this.style, schedulePillModel.style) && AbstractC22676k.m65745e(this.infoCallout, schedulePillModel.infoCallout);
    }

    public final DateDisplay getDateDisplay() {
        return this.dateDisplay;
    }

    public final InfoCalloutTileModel getInfoCallout() {
        return this.infoCallout;
    }

    public final List<SchedulingTileModel> getScheduleTiles() {
        return this.scheduleTiles;
    }

    public final String getSelectionDisplay() {
        return this.selectionDisplay;
    }

    public final String getStyle() {
        return this.style;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.dateDisplay.hashCode() + AbstractC11895b.m31983b(this.selectionDisplay.hashCode() * 31, 31, this.scheduleTiles)) * 31, 31, this.style);
        InfoCalloutTileModel infoCalloutTileModel = this.infoCallout;
        return iM30450d + (infoCalloutTileModel == null ? 0 : infoCalloutTileModel.hashCode());
    }

    public String toString() {
        String str = this.selectionDisplay;
        List<SchedulingTileModel> list = this.scheduleTiles;
        DateDisplay dateDisplay = this.dateDisplay;
        String str2 = this.style;
        InfoCalloutTileModel infoCalloutTileModel = this.infoCallout;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("SchedulePillModel(selectionDisplay=", str, ", scheduleTiles=", ", dateDisplay=", list);
        sbM94766o.append(dateDisplay);
        sbM94766o.append(", style=");
        sbM94766o.append(str2);
        sbM94766o.append(", infoCallout=");
        sbM94766o.append(infoCalloutTileModel);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public SchedulePillModel(String selectionDisplay, List<SchedulingTileModel> scheduleTiles, DateDisplay dateDisplay, String style, InfoCalloutTileModel infoCalloutTileModel) {
        AbstractC22676k.m65750j(selectionDisplay, "selectionDisplay");
        AbstractC22676k.m65750j(scheduleTiles, "scheduleTiles");
        AbstractC22676k.m65750j(dateDisplay, "dateDisplay");
        AbstractC22676k.m65750j(style, "style");
        this.selectionDisplay = selectionDisplay;
        this.scheduleTiles = scheduleTiles;
        this.dateDisplay = dateDisplay;
        this.style = style;
        this.infoCallout = infoCalloutTileModel;
    }
}
