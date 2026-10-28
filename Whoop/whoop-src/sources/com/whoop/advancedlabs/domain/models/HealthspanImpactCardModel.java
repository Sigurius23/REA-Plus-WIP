package com.whoop.advancedlabs.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.DividerModel;
import com.whoop.design.models.items.DividerModel$$serializer;
import com.whoop.design.models.items.SecondaryButtonModel;
import com.whoop.design.models.items.SecondaryButtonModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JJ\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010#¨\u00069"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/HealthspanImpactCardModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "description", "Lcom/whoop/design/models/items/DividerModel;", "divider", "", "pills", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "button", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/HealthspanImpactCardModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/items/DividerModel;", "component4", "()Ljava/util/List;", "component5", "()Lcom/whoop/design/models/items/SecondaryButtonModel;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/DividerModel;Ljava/util/List;Lcom/whoop/design/models/items/SecondaryButtonModel;)Lcom/whoop/advancedlabs/domain/models/HealthspanImpactCardModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/whoop/design/models/items/DividerModel;", "getDivider", "Ljava/util/List;", "getPills", "Lcom/whoop/design/models/items/SecondaryButtonModel;", "getButton", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HealthspanImpactCardModel implements DesignSystemModel {
    private final SecondaryButtonModel button;
    private final String description;
    private final DividerModel divider;
    private final List<String> pills;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C33690a(7)), null};

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/HealthspanImpactCardModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/HealthspanImpactCardModel;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HealthspanImpactCardModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HealthspanImpactCardModel(int i13, String str, String str2, DividerModel dividerModel, List list, SecondaryButtonModel secondaryButtonModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, HealthspanImpactCardModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.description = str2;
        this.divider = dividerModel;
        this.pills = list;
        this.button = secondaryButtonModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HealthspanImpactCardModel copy$default(HealthspanImpactCardModel healthspanImpactCardModel, String str, String str2, DividerModel dividerModel, List list, SecondaryButtonModel secondaryButtonModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = healthspanImpactCardModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = healthspanImpactCardModel.description;
        }
        if ((i13 & 4) != 0) {
            dividerModel = healthspanImpactCardModel.divider;
        }
        if ((i13 & 8) != 0) {
            list = healthspanImpactCardModel.pills;
        }
        if ((i13 & 16) != 0) {
            secondaryButtonModel = healthspanImpactCardModel.button;
        }
        SecondaryButtonModel secondaryButtonModel2 = secondaryButtonModel;
        DividerModel dividerModel2 = dividerModel;
        return healthspanImpactCardModel.copy(str, str2, dividerModel2, list, secondaryButtonModel2);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(HealthspanImpactCardModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.description);
        output.encodeSerializableElement(serialDesc, 2, DividerModel$$serializer.INSTANCE, self.divider);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.pills);
        output.encodeNullableSerializableElement(serialDesc, 4, SecondaryButtonModel$$serializer.INSTANCE, self.button);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DividerModel getDivider() {
        return this.divider;
    }

    public final List<String> component4() {
        return this.pills;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final SecondaryButtonModel getButton() {
        return this.button;
    }

    public final HealthspanImpactCardModel copy(String title, String description, DividerModel divider, List<String> pills, SecondaryButtonModel button) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(divider, "divider");
        AbstractC22676k.m65750j(pills, "pills");
        return new HealthspanImpactCardModel(title, description, divider, pills, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthspanImpactCardModel)) {
            return false;
        }
        HealthspanImpactCardModel healthspanImpactCardModel = (HealthspanImpactCardModel) other;
        return AbstractC22676k.m65745e(this.title, healthspanImpactCardModel.title) && AbstractC22676k.m65745e(this.description, healthspanImpactCardModel.description) && AbstractC22676k.m65745e(this.divider, healthspanImpactCardModel.divider) && AbstractC22676k.m65745e(this.pills, healthspanImpactCardModel.pills) && AbstractC22676k.m65745e(this.button, healthspanImpactCardModel.button);
    }

    public final SecondaryButtonModel getButton() {
        return this.button;
    }

    public final String getDescription() {
        return this.description;
    }

    public final DividerModel getDivider() {
        return this.divider;
    }

    public final List<String> getPills() {
        return this.pills;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b((this.divider.hashCode() + AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.description)) * 31, 31, this.pills);
        SecondaryButtonModel secondaryButtonModel = this.button;
        return iM31983b + (secondaryButtonModel == null ? 0 : secondaryButtonModel.hashCode());
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        DividerModel dividerModel = this.divider;
        List<String> list = this.pills;
        SecondaryButtonModel secondaryButtonModel = this.button;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HealthspanImpactCardModel(title=", str, ", description=", str2, ", divider=");
        sbM32001t.append(dividerModel);
        sbM32001t.append(", pills=");
        sbM32001t.append(list);
        sbM32001t.append(", button=");
        sbM32001t.append(secondaryButtonModel);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public HealthspanImpactCardModel(String title, String description, DividerModel divider, List<String> pills, SecondaryButtonModel secondaryButtonModel) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(divider, "divider");
        AbstractC22676k.m65750j(pills, "pills");
        this.title = title;
        this.description = description;
        this.divider = divider;
        this.pills = pills;
        this.button = secondaryButtonModel;
    }
}
