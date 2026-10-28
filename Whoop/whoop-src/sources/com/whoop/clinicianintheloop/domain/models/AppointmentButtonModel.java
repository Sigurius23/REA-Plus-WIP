package com.whoop.clinicianintheloop.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import jh3.AbstractC21702c;
import jl0.C21769a;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0002LKB;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eB\u0081\u0001\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0011\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\r\u0010\u0017J#\u0010\u001a\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%JN\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b,\u0010-J'\u00106\u001a\u0002032\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b4\u00105R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00107\u001a\u0004\b8\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b9\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b\u0007\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010\"R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b=\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010%R0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DRE\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011j\u0004\u0018\u0001`E¢\u0006\f\bF\u0012\b\bG\u0012\u0004\b\t0H8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010@\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010D¨\u0006M"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/domain/models/AppointmentButtonModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "id", "text", "", "isSelected", "Ly81/f;", "selectedColor", "selectedBorderColor", "Lcom/whoop/navigation/models/GenericInteraction;", "interaction", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLy81/f;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;)V", "", "seen0", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLy81/f;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/clinicianintheloop/domain/models/AppointmentButtonModel;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Ly81/f;", "component5", "component6", "()Lcom/whoop/navigation/models/GenericInteraction;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLy81/f;Ly81/f;Lcom/whoop/navigation/models/GenericInteraction;)Lcom/whoop/clinicianintheloop/domain/models/AppointmentButtonModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$clinician_in_the_loop_release", "(Lcom/whoop/clinicianintheloop/domain/models/AppointmentButtonModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getText", "Z", "Ly81/f;", "getSelectedColor", "getSelectedBorderColor", "Lcom/whoop/navigation/models/GenericInteraction;", "getInteraction", "Ljava/util/Map;", "getBindings", "()Ljava/util/Map;", "setBindings", "(Ljava/util/Map;)V", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AppointmentButtonModel implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final String id;
    private final GenericInteraction interaction;
    private final boolean isSelected;
    private final EnumC39333f selectedBorderColor;
    private final EnumC39333f selectedColor;
    private final String text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/domain/models/AppointmentButtonModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/clinicianintheloop/domain/models/AppointmentButtonModel;", "serializer", "()Lwc3/c;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AppointmentButtonModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C21769a(16)), AbstractC30060g.m92087G(enumC23463i, new C21769a(17)), null, AbstractC30060g.m92087G(enumC23463i, new C21769a(18)), null};
    }

    public /* synthetic */ AppointmentButtonModel(int i13, String str, String str2, boolean z4, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, GenericInteraction genericInteraction, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, AppointmentButtonModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.text = str2;
        this.isSelected = z4;
        this.selectedColor = enumC39333f;
        this.selectedBorderColor = enumC39333f2;
        if ((i13 & 32) == 0) {
            this.interaction = null;
        } else {
            this.interaction = genericInteraction;
        }
        if ((i13 & 64) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 128) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    public static /* synthetic */ AppointmentButtonModel copy$default(AppointmentButtonModel appointmentButtonModel, String str, String str2, boolean z4, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, GenericInteraction genericInteraction, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = appointmentButtonModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = appointmentButtonModel.text;
        }
        if ((i13 & 4) != 0) {
            z4 = appointmentButtonModel.isSelected;
        }
        if ((i13 & 8) != 0) {
            enumC39333f = appointmentButtonModel.selectedColor;
        }
        if ((i13 & 16) != 0) {
            enumC39333f2 = appointmentButtonModel.selectedBorderColor;
        }
        if ((i13 & 32) != 0) {
            genericInteraction = appointmentButtonModel.interaction;
        }
        EnumC39333f enumC39333f3 = enumC39333f2;
        GenericInteraction genericInteraction2 = genericInteraction;
        return appointmentButtonModel.copy(str, str2, z4, enumC39333f, enumC39333f3, genericInteraction2);
    }

    public static final /* synthetic */ void write$Self$clinician_in_the_loop_release(AppointmentButtonModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.text);
        output.encodeBooleanElement(serialDesc, 2, self.isSelected);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.selectedColor);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.selectedBorderColor);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.interaction != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, GenericInteraction$$serializer.INSTANCE, self.interaction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public /* bridge */ /* synthetic */ WithGeneratedBindings bind(Map map) {
        return bind((Map<String, ? extends Object>) map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EnumC39333f getSelectedColor() {
        return this.selectedColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EnumC39333f getSelectedBorderColor() {
        return this.selectedBorderColor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final AppointmentButtonModel copy(String id4, String text, boolean isSelected, EnumC39333f selectedColor, EnumC39333f selectedBorderColor, GenericInteraction interaction) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(selectedColor, "selectedColor");
        AbstractC22676k.m65750j(selectedBorderColor, "selectedBorderColor");
        return new AppointmentButtonModel(id4, text, isSelected, selectedColor, selectedBorderColor, interaction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppointmentButtonModel)) {
            return false;
        }
        AppointmentButtonModel appointmentButtonModel = (AppointmentButtonModel) other;
        return AbstractC22676k.m65745e(this.id, appointmentButtonModel.id) && AbstractC22676k.m65745e(this.text, appointmentButtonModel.text) && this.isSelected == appointmentButtonModel.isSelected && this.selectedColor == appointmentButtonModel.selectedColor && this.selectedBorderColor == appointmentButtonModel.selectedBorderColor && AbstractC22676k.m65745e(this.interaction, appointmentButtonModel.interaction);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final String getId() {
        return this.id;
    }

    public final GenericInteraction getInteraction() {
        return this.interaction;
    }

    public final EnumC39333f getSelectedBorderColor() {
        return this.selectedBorderColor;
    }

    public final EnumC39333f getSelectedColor() {
        return this.selectedColor;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iM61132c = AbstractC21702c.m61132c(this.selectedBorderColor, AbstractC21702c.m61132c(this.selectedColor, AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.text), 31, this.isSelected), 31), 31);
        GenericInteraction genericInteraction = this.interaction;
        return iM61132c + (genericInteraction == null ? 0 : genericInteraction.hashCode());
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setAggregateBindings(Map<String, AggregateBinding> map) {
        this.aggregateBindings = map;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setBindings(Map<String, String> map) {
        this.bindings = map;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.text;
        boolean z4 = this.isSelected;
        EnumC39333f enumC39333f = this.selectedColor;
        EnumC39333f enumC39333f2 = this.selectedBorderColor;
        GenericInteraction genericInteraction = this.interaction;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AppointmentButtonModel(id=", str, ", text=", str2, ", isSelected=");
        sbM32001t.append(z4);
        sbM32001t.append(", selectedColor=");
        sbM32001t.append(enumC39333f);
        sbM32001t.append(", selectedBorderColor=");
        sbM32001t.append(enumC39333f2);
        sbM32001t.append(", interaction=");
        sbM32001t.append(genericInteraction);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public AppointmentButtonModel(String id4, String text, boolean z4, EnumC39333f selectedColor, EnumC39333f selectedBorderColor, GenericInteraction genericInteraction) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(text, "text");
        AbstractC22676k.m65750j(selectedColor, "selectedColor");
        AbstractC22676k.m65750j(selectedBorderColor, "selectedBorderColor");
        this.id = id4;
        this.text = text;
        this.isSelected = z4;
        this.selectedColor = selectedColor;
        this.selectedBorderColor = selectedBorderColor;
        this.interaction = genericInteraction;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public AppointmentButtonModel bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return AppointmentButtonModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    public /* synthetic */ AppointmentButtonModel(String str, String str2, boolean z4, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, GenericInteraction genericInteraction, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z4, enumC39333f, enumC39333f2, (i13 & 32) != 0 ? null : genericInteraction);
    }
}
