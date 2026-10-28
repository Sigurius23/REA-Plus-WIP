package com.whoop.advancedlabs.domain.models;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ld0.EnumC23855n;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import t91.C33662a;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBQ\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b#\u0010$JJ\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010 R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b\u000b\u0010$¨\u00067"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/ChecklistStepModel;", "", "", "title", "subtitle", "Lld0/n;", NotificationCompat.CATEGORY_STATUS, "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "", "isExpanded", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lld0/n;Ljava/util/List;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lld0/n;Ljava/util/List;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/ChecklistStepModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lld0/n;", "component4", "()Ljava/util/List;", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Lld0/n;Ljava/util/List;Z)Lcom/whoop/advancedlabs/domain/models/ChecklistStepModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lld0/n;", "getStatus", "Ljava/util/List;", "getItems", "Z", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ChecklistStepModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final boolean isExpanded;
    private final List<DesignSystemModel> items;
    private final EnumC23855n status;
    private final String subtitle;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/ChecklistStepModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/ChecklistStepModel;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ChecklistStepModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C33662a(25)), AbstractC30060g.m92087G(enumC23463i, new C33662a(26)), null};
    }

    public /* synthetic */ ChecklistStepModel(int i13, String str, String str2, EnumC23855n enumC23855n, List list, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, ChecklistStepModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.subtitle = str2;
        this.status = enumC23855n;
        this.items = list;
        if ((i13 & 16) == 0) {
            this.isExpanded = false;
        } else {
            this.isExpanded = z4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.advancedlabs.presentation.models.ChecklistStepStatus", EnumC23855n.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChecklistStepModel copy$default(ChecklistStepModel checklistStepModel, String str, String str2, EnumC23855n enumC23855n, List list, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = checklistStepModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = checklistStepModel.subtitle;
        }
        if ((i13 & 4) != 0) {
            enumC23855n = checklistStepModel.status;
        }
        if ((i13 & 8) != 0) {
            list = checklistStepModel.items;
        }
        if ((i13 & 16) != 0) {
            z4 = checklistStepModel.isExpanded;
        }
        boolean z13 = z4;
        EnumC23855n enumC23855n2 = enumC23855n;
        return checklistStepModel.copy(str, str2, enumC23855n2, list, z13);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(ChecklistStepModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.subtitle);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.status);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.items);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.isExpanded) {
            output.encodeBooleanElement(serialDesc, 4, self.isExpanded);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final EnumC23855n getStatus() {
        return this.status;
    }

    public final List<DesignSystemModel> component4() {
        return this.items;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    public final ChecklistStepModel copy(String title, String subtitle, EnumC23855n status, List<? extends DesignSystemModel> items, boolean isExpanded) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(items, "items");
        return new ChecklistStepModel(title, subtitle, status, items, isExpanded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChecklistStepModel)) {
            return false;
        }
        ChecklistStepModel checklistStepModel = (ChecklistStepModel) other;
        return AbstractC22676k.m65745e(this.title, checklistStepModel.title) && AbstractC22676k.m65745e(this.subtitle, checklistStepModel.subtitle) && this.status == checklistStepModel.status && AbstractC22676k.m65745e(this.items, checklistStepModel.items) && this.isExpanded == checklistStepModel.isExpanded;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final EnumC23855n getStatus() {
        return this.status;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        return Boolean.hashCode(this.isExpanded) + AbstractC11895b.m31983b((this.status.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.items);
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        EnumC23855n enumC23855n = this.status;
        List<DesignSystemModel> list = this.items;
        boolean z4 = this.isExpanded;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ChecklistStepModel(title=", str, ", subtitle=", str2, ", status=");
        sbM32001t.append(enumC23855n);
        sbM32001t.append(", items=");
        sbM32001t.append(list);
        sbM32001t.append(", isExpanded=");
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChecklistStepModel(String title, String str, EnumC23855n status, List<? extends DesignSystemModel> items, boolean z4) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(status, "status");
        AbstractC22676k.m65750j(items, "items");
        this.title = title;
        this.subtitle = str;
        this.status = status;
        this.items = items;
        this.isExpanded = z4;
    }

    public /* synthetic */ ChecklistStepModel(String str, String str2, EnumC23855n enumC23855n, List list, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, enumC23855n, list, (i13 & 16) != 0 ? false : z4);
    }
}
