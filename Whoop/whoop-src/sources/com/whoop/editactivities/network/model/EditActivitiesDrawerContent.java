package com.whoop.editactivities.network.model;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p133f1.C13998z1;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 92\u00020\u0001:\u0002:;BS\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rB]\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010#J\\\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b6\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b7\u0010#R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b8\u0010#¨\u0006<"}, m65681d2 = {"Lcom/whoop/editactivities/network/model/EditActivitiesDrawerContent;", "", "", "title", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "footer", "Lcom/whoop/design/models/InfoCalloutTileModel;", "gpsTextInfoCallout", "maxDurationInfoCallout", "maxSelectionInfoCallout", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/InfoCalloutTileModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$add_activity_release", "(Lcom/whoop/editactivities/network/model/EditActivitiesDrawerContent;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/design/models/DesignSystemModel;", "component4", "()Lcom/whoop/design/models/InfoCalloutTileModel;", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/design/models/InfoCalloutTileModel;)Lcom/whoop/editactivities/network/model/EditActivitiesDrawerContent;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "Ljava/util/List;", "getItems", "Lcom/whoop/design/models/DesignSystemModel;", "getFooter", "Lcom/whoop/design/models/InfoCalloutTileModel;", "getGpsTextInfoCallout", "getMaxDurationInfoCallout", "getMaxSelectionInfoCallout", "Companion", "$serializer", "a", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class EditActivitiesDrawerContent {
    private static final InterfaceC23462h[] $childSerializers;
    private final DesignSystemModel footer;
    private final InfoCalloutTileModel gpsTextInfoCallout;
    private final List<DesignSystemModel> items;
    private final InfoCalloutTileModel maxDurationInfoCallout;
    private final InfoCalloutTileModel maxSelectionInfoCallout;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.editactivities.network.model.EditActivitiesDrawerContent$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/editactivities/network/model/EditActivitiesDrawerContent$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/editactivities/network/model/EditActivitiesDrawerContent;", "serializer", "()Lwc3/c;", "add-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return EditActivitiesDrawerContent$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C13998z1(11)), AbstractC30060g.m92087G(enumC23463i, new C13998z1(12)), null, null, null};
    }

    public EditActivitiesDrawerContent() {
        this((String) null, (List) null, (DesignSystemModel) null, (InfoCalloutTileModel) null, (InfoCalloutTileModel) null, (InfoCalloutTileModel) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EditActivitiesDrawerContent copy$default(EditActivitiesDrawerContent editActivitiesDrawerContent, String str, List list, DesignSystemModel designSystemModel, InfoCalloutTileModel infoCalloutTileModel, InfoCalloutTileModel infoCalloutTileModel2, InfoCalloutTileModel infoCalloutTileModel3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = editActivitiesDrawerContent.title;
        }
        if ((i13 & 2) != 0) {
            list = editActivitiesDrawerContent.items;
        }
        if ((i13 & 4) != 0) {
            designSystemModel = editActivitiesDrawerContent.footer;
        }
        if ((i13 & 8) != 0) {
            infoCalloutTileModel = editActivitiesDrawerContent.gpsTextInfoCallout;
        }
        if ((i13 & 16) != 0) {
            infoCalloutTileModel2 = editActivitiesDrawerContent.maxDurationInfoCallout;
        }
        if ((i13 & 32) != 0) {
            infoCalloutTileModel3 = editActivitiesDrawerContent.maxSelectionInfoCallout;
        }
        InfoCalloutTileModel infoCalloutTileModel4 = infoCalloutTileModel2;
        InfoCalloutTileModel infoCalloutTileModel5 = infoCalloutTileModel3;
        return editActivitiesDrawerContent.copy(str, list, designSystemModel, infoCalloutTileModel, infoCalloutTileModel4, infoCalloutTileModel5);
    }

    public static final /* synthetic */ void write$Self$add_activity_release(EditActivitiesDrawerContent self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.items);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.footer != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.footer);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.gpsTextInfoCallout != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, InfoCalloutTileModel$$serializer.INSTANCE, self.gpsTextInfoCallout);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.maxDurationInfoCallout != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, InfoCalloutTileModel$$serializer.INSTANCE, self.maxDurationInfoCallout);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.maxSelectionInfoCallout == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, InfoCalloutTileModel$$serializer.INSTANCE, self.maxSelectionInfoCallout);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<DesignSystemModel> component2() {
        return this.items;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DesignSystemModel getFooter() {
        return this.footer;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final InfoCalloutTileModel getGpsTextInfoCallout() {
        return this.gpsTextInfoCallout;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final InfoCalloutTileModel getMaxDurationInfoCallout() {
        return this.maxDurationInfoCallout;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final InfoCalloutTileModel getMaxSelectionInfoCallout() {
        return this.maxSelectionInfoCallout;
    }

    public final EditActivitiesDrawerContent copy(String title, List<? extends DesignSystemModel> items, DesignSystemModel footer, InfoCalloutTileModel gpsTextInfoCallout, InfoCalloutTileModel maxDurationInfoCallout, InfoCalloutTileModel maxSelectionInfoCallout) {
        AbstractC22676k.m65750j(items, "items");
        return new EditActivitiesDrawerContent(title, items, footer, gpsTextInfoCallout, maxDurationInfoCallout, maxSelectionInfoCallout);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditActivitiesDrawerContent)) {
            return false;
        }
        EditActivitiesDrawerContent editActivitiesDrawerContent = (EditActivitiesDrawerContent) other;
        return AbstractC22676k.m65745e(this.title, editActivitiesDrawerContent.title) && AbstractC22676k.m65745e(this.items, editActivitiesDrawerContent.items) && AbstractC22676k.m65745e(this.footer, editActivitiesDrawerContent.footer) && AbstractC22676k.m65745e(this.gpsTextInfoCallout, editActivitiesDrawerContent.gpsTextInfoCallout) && AbstractC22676k.m65745e(this.maxDurationInfoCallout, editActivitiesDrawerContent.maxDurationInfoCallout) && AbstractC22676k.m65745e(this.maxSelectionInfoCallout, editActivitiesDrawerContent.maxSelectionInfoCallout);
    }

    public final DesignSystemModel getFooter() {
        return this.footer;
    }

    public final InfoCalloutTileModel getGpsTextInfoCallout() {
        return this.gpsTextInfoCallout;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final InfoCalloutTileModel getMaxDurationInfoCallout() {
        return this.maxDurationInfoCallout;
    }

    public final InfoCalloutTileModel getMaxSelectionInfoCallout() {
        return this.maxSelectionInfoCallout;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iM31983b = AbstractC11895b.m31983b((str == null ? 0 : str.hashCode()) * 31, 31, this.items);
        DesignSystemModel designSystemModel = this.footer;
        int iHashCode = (iM31983b + (designSystemModel == null ? 0 : designSystemModel.hashCode())) * 31;
        InfoCalloutTileModel infoCalloutTileModel = this.gpsTextInfoCallout;
        int iHashCode2 = (iHashCode + (infoCalloutTileModel == null ? 0 : infoCalloutTileModel.hashCode())) * 31;
        InfoCalloutTileModel infoCalloutTileModel2 = this.maxDurationInfoCallout;
        int iHashCode3 = (iHashCode2 + (infoCalloutTileModel2 == null ? 0 : infoCalloutTileModel2.hashCode())) * 31;
        InfoCalloutTileModel infoCalloutTileModel3 = this.maxSelectionInfoCallout;
        return iHashCode3 + (infoCalloutTileModel3 != null ? infoCalloutTileModel3.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        List<DesignSystemModel> list = this.items;
        DesignSystemModel designSystemModel = this.footer;
        InfoCalloutTileModel infoCalloutTileModel = this.gpsTextInfoCallout;
        InfoCalloutTileModel infoCalloutTileModel2 = this.maxDurationInfoCallout;
        InfoCalloutTileModel infoCalloutTileModel3 = this.maxSelectionInfoCallout;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("EditActivitiesDrawerContent(title=", str, ", items=", ", footer=", list);
        sbM94766o.append(designSystemModel);
        sbM94766o.append(", gpsTextInfoCallout=");
        sbM94766o.append(infoCalloutTileModel);
        sbM94766o.append(", maxDurationInfoCallout=");
        sbM94766o.append(infoCalloutTileModel2);
        sbM94766o.append(", maxSelectionInfoCallout=");
        sbM94766o.append(infoCalloutTileModel3);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public /* synthetic */ EditActivitiesDrawerContent(int i13, String str, List list, DesignSystemModel designSystemModel, InfoCalloutTileModel infoCalloutTileModel, InfoCalloutTileModel infoCalloutTileModel2, InfoCalloutTileModel infoCalloutTileModel3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.title = null;
        } else {
            this.title = str;
        }
        if ((i13 & 2) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
        if ((i13 & 4) == 0) {
            this.footer = null;
        } else {
            this.footer = designSystemModel;
        }
        if ((i13 & 8) == 0) {
            this.gpsTextInfoCallout = null;
        } else {
            this.gpsTextInfoCallout = infoCalloutTileModel;
        }
        if ((i13 & 16) == 0) {
            this.maxDurationInfoCallout = null;
        } else {
            this.maxDurationInfoCallout = infoCalloutTileModel2;
        }
        if ((i13 & 32) == 0) {
            this.maxSelectionInfoCallout = null;
        } else {
            this.maxSelectionInfoCallout = infoCalloutTileModel3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EditActivitiesDrawerContent(String str, List<? extends DesignSystemModel> items, DesignSystemModel designSystemModel, InfoCalloutTileModel infoCalloutTileModel, InfoCalloutTileModel infoCalloutTileModel2, InfoCalloutTileModel infoCalloutTileModel3) {
        AbstractC22676k.m65750j(items, "items");
        this.title = str;
        this.items = items;
        this.footer = designSystemModel;
        this.gpsTextInfoCallout = infoCalloutTileModel;
        this.maxDurationInfoCallout = infoCalloutTileModel2;
        this.maxSelectionInfoCallout = infoCalloutTileModel3;
    }

    public /* synthetic */ EditActivitiesDrawerContent(String str, List list, DesignSystemModel designSystemModel, InfoCalloutTileModel infoCalloutTileModel, InfoCalloutTileModel infoCalloutTileModel2, InfoCalloutTileModel infoCalloutTileModel3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? null : designSystemModel, (i13 & 8) != 0 ? null : infoCalloutTileModel, (i13 & 16) != 0 ? null : infoCalloutTileModel2, (i13 & 32) != 0 ? null : infoCalloutTileModel3);
    }
}
