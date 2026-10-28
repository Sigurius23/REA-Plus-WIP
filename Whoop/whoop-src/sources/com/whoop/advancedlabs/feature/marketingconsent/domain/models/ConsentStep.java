package com.whoop.advancedlabs.feature.marketingconsent.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nx1.C27219a;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fBY\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\"\u0010!JN\u0010#\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b2\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010!R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b5\u0010!¨\u00069"}, m65681d2 = {"Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;", "", "", "Lcom/whoop/design/models/DesignSystemModel;", "itemsAboveToggle", "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;", "toggle", "itemsBelowToggle", "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;", "ctaWhenToggleOff", "ctaWhenToggleOn", "<init>", "(Ljava/util/List;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;Ljava/util/List;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;Ljava/util/List;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;", "component3", "component4", "()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;", "component5", "copy", "(Ljava/util/List;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;Ljava/util/List;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;)Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItemsAboveToggle", "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentToggle;", "getToggle", "getItemsBelowToggle", "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentButton;", "getCtaWhenToggleOff", "getCtaWhenToggleOn", "Companion", "$serializer", "a", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ConsentStep {
    private static final InterfaceC23462h[] $childSerializers;
    private final ConsentButton ctaWhenToggleOff;
    private final ConsentButton ctaWhenToggleOn;
    private final List<DesignSystemModel> itemsAboveToggle;
    private final List<DesignSystemModel> itemsBelowToggle;
    private final ConsentToggle toggle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.advancedlabs.feature.marketingconsent.domain.models.ConsentStep$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ConsentStep$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C27219a(25)), null, AbstractC30060g.m92087G(enumC23463i, new C27219a(26)), null, null};
    }

    public /* synthetic */ ConsentStep(int i13, List list, ConsentToggle consentToggle, List list2, ConsentButton consentButton, ConsentButton consentButton2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, ConsentStep$$serializer.INSTANCE.getDescriptor());
        }
        this.itemsAboveToggle = list;
        this.toggle = consentToggle;
        this.itemsBelowToggle = list2;
        this.ctaWhenToggleOff = consentButton;
        this.ctaWhenToggleOn = consentButton2;
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
    public static /* synthetic */ ConsentStep copy$default(ConsentStep consentStep, List list, ConsentToggle consentToggle, List list2, ConsentButton consentButton, ConsentButton consentButton2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = consentStep.itemsAboveToggle;
        }
        if ((i13 & 2) != 0) {
            consentToggle = consentStep.toggle;
        }
        if ((i13 & 4) != 0) {
            list2 = consentStep.itemsBelowToggle;
        }
        if ((i13 & 8) != 0) {
            consentButton = consentStep.ctaWhenToggleOff;
        }
        if ((i13 & 16) != 0) {
            consentButton2 = consentStep.ctaWhenToggleOn;
        }
        ConsentButton consentButton3 = consentButton2;
        List list3 = list2;
        return consentStep.copy(list, consentToggle, list3, consentButton, consentButton3);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(ConsentStep self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.itemsAboveToggle);
        output.encodeSerializableElement(serialDesc, 1, ConsentToggle$$serializer.INSTANCE, self.toggle);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.itemsBelowToggle);
        ConsentButton$$serializer consentButton$$serializer = ConsentButton$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 3, consentButton$$serializer, self.ctaWhenToggleOff);
        output.encodeSerializableElement(serialDesc, 4, consentButton$$serializer, self.ctaWhenToggleOn);
    }

    public final List<DesignSystemModel> component1() {
        return this.itemsAboveToggle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConsentToggle getToggle() {
        return this.toggle;
    }

    public final List<DesignSystemModel> component3() {
        return this.itemsBelowToggle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ConsentButton getCtaWhenToggleOff() {
        return this.ctaWhenToggleOff;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ConsentButton getCtaWhenToggleOn() {
        return this.ctaWhenToggleOn;
    }

    public final ConsentStep copy(List<? extends DesignSystemModel> itemsAboveToggle, ConsentToggle toggle, List<? extends DesignSystemModel> itemsBelowToggle, ConsentButton ctaWhenToggleOff, ConsentButton ctaWhenToggleOn) {
        AbstractC22676k.m65750j(itemsAboveToggle, "itemsAboveToggle");
        AbstractC22676k.m65750j(toggle, "toggle");
        AbstractC22676k.m65750j(itemsBelowToggle, "itemsBelowToggle");
        AbstractC22676k.m65750j(ctaWhenToggleOff, "ctaWhenToggleOff");
        AbstractC22676k.m65750j(ctaWhenToggleOn, "ctaWhenToggleOn");
        return new ConsentStep(itemsAboveToggle, toggle, itemsBelowToggle, ctaWhenToggleOff, ctaWhenToggleOn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConsentStep)) {
            return false;
        }
        ConsentStep consentStep = (ConsentStep) other;
        return AbstractC22676k.m65745e(this.itemsAboveToggle, consentStep.itemsAboveToggle) && AbstractC22676k.m65745e(this.toggle, consentStep.toggle) && AbstractC22676k.m65745e(this.itemsBelowToggle, consentStep.itemsBelowToggle) && AbstractC22676k.m65745e(this.ctaWhenToggleOff, consentStep.ctaWhenToggleOff) && AbstractC22676k.m65745e(this.ctaWhenToggleOn, consentStep.ctaWhenToggleOn);
    }

    public final ConsentButton getCtaWhenToggleOff() {
        return this.ctaWhenToggleOff;
    }

    public final ConsentButton getCtaWhenToggleOn() {
        return this.ctaWhenToggleOn;
    }

    public final List<DesignSystemModel> getItemsAboveToggle() {
        return this.itemsAboveToggle;
    }

    public final List<DesignSystemModel> getItemsBelowToggle() {
        return this.itemsBelowToggle;
    }

    public final ConsentToggle getToggle() {
        return this.toggle;
    }

    public int hashCode() {
        return this.ctaWhenToggleOn.hashCode() + ((this.ctaWhenToggleOff.hashCode() + AbstractC11895b.m31983b((this.toggle.hashCode() + (this.itemsAboveToggle.hashCode() * 31)) * 31, 31, this.itemsBelowToggle)) * 31);
    }

    public String toString() {
        return "ConsentStep(itemsAboveToggle=" + this.itemsAboveToggle + ", toggle=" + this.toggle + ", itemsBelowToggle=" + this.itemsBelowToggle + ", ctaWhenToggleOff=" + this.ctaWhenToggleOff + ", ctaWhenToggleOn=" + this.ctaWhenToggleOn + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConsentStep(List<? extends DesignSystemModel> itemsAboveToggle, ConsentToggle toggle, List<? extends DesignSystemModel> itemsBelowToggle, ConsentButton ctaWhenToggleOff, ConsentButton ctaWhenToggleOn) {
        AbstractC22676k.m65750j(itemsAboveToggle, "itemsAboveToggle");
        AbstractC22676k.m65750j(toggle, "toggle");
        AbstractC22676k.m65750j(itemsBelowToggle, "itemsBelowToggle");
        AbstractC22676k.m65750j(ctaWhenToggleOff, "ctaWhenToggleOff");
        AbstractC22676k.m65750j(ctaWhenToggleOn, "ctaWhenToggleOn");
        this.itemsAboveToggle = itemsAboveToggle;
        this.toggle = toggle;
        this.itemsBelowToggle = itemsBelowToggle;
        this.ctaWhenToggleOff = ctaWhenToggleOff;
        this.ctaWhenToggleOn = ctaWhenToggleOn;
    }
}
