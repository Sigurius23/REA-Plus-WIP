package com.whoop.startactivity.dropdown;

import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import j02.C21179y0;
import java.util.List;
import java.util.Map;
import jg2.AbstractC21673e;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0002FGBC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fB\u007f\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000b\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010!\u001a\u00020\u00002\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001f0\u000fH\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b'\u0010$J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b(\u0010)JN\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b,\u0010$J\u0010\u0010-\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b4\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b5\u0010$R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u00103\u001a\u0004\b6\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b7\u0010$R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010)R0\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>RE\u0010\u0012\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000fj\u0004\u0018\u0001`?¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\t0B8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010:\u001a\u0004\bC\u0010<\"\u0004\bD\u0010>¨\u0006H"}, m65681d2 = {"Lcom/whoop/startactivity/dropdown/DropdownModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "id", "label", "placeholder", "selectedOptionId", "", "Lcom/whoop/startactivity/dropdown/DropdownOption;", "options", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$start_activity_release", "(Lcom/whoop/startactivity/dropdown/DropdownModel;Lzc3/c;Lyc3/g;)V", "write$Self", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/startactivity/dropdown/DropdownModel;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/startactivity/dropdown/DropdownModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getLabel", "getPlaceholder", "getSelectedOptionId", "Ljava/util/List;", "getOptions", "Ljava/util/Map;", "getBindings", "()Ljava/util/Map;", "setBindings", "(Ljava/util/Map;)V", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "a", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DropdownModel implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final String id;
    private final String label;
    private final List<DropdownOption> options;
    private final String placeholder;
    private final String selectedOptionId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.startactivity.dropdown.DropdownModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/startactivity/dropdown/DropdownModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/startactivity/dropdown/DropdownModel;", "serializer", "()Lwc3/c;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DropdownModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C21179y0(12)), AbstractC30060g.m92087G(enumC23463i, new C21179y0(13)), null};
    }

    public /* synthetic */ DropdownModel(int i13, String str, String str2, String str3, String str4, List list, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, DropdownModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        if ((i13 & 2) == 0) {
            this.label = null;
        } else {
            this.label = str2;
        }
        if ((i13 & 4) == 0) {
            this.placeholder = null;
        } else {
            this.placeholder = str3;
        }
        if ((i13 & 8) == 0) {
            this.selectedOptionId = null;
        } else {
            this.selectedOptionId = str4;
        }
        if ((i13 & 16) == 0) {
            this.options = C25271y.f99162w;
        } else {
            this.options = list;
        }
        if ((i13 & 32) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 64) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(DropdownOption$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DropdownModel copy$default(DropdownModel dropdownModel, String str, String str2, String str3, String str4, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = dropdownModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = dropdownModel.label;
        }
        if ((i13 & 4) != 0) {
            str3 = dropdownModel.placeholder;
        }
        if ((i13 & 8) != 0) {
            str4 = dropdownModel.selectedOptionId;
        }
        if ((i13 & 16) != 0) {
            list = dropdownModel.options;
        }
        List list2 = list;
        String str5 = str3;
        return dropdownModel.copy(str, str2, str5, str4, list2);
    }

    public static final /* synthetic */ void write$Self$start_activity_release(DropdownModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.label != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.label);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.placeholder != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.placeholder);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.selectedOptionId != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.selectedOptionId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.options, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.options);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
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
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSelectedOptionId() {
        return this.selectedOptionId;
    }

    public final List<DropdownOption> component5() {
        return this.options;
    }

    public final DropdownModel copy(String id4, String label, String placeholder, String selectedOptionId, List<DropdownOption> options) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(options, "options");
        return new DropdownModel(id4, label, placeholder, selectedOptionId, options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DropdownModel)) {
            return false;
        }
        DropdownModel dropdownModel = (DropdownModel) other;
        return AbstractC22676k.m65745e(this.id, dropdownModel.id) && AbstractC22676k.m65745e(this.label, dropdownModel.label) && AbstractC22676k.m65745e(this.placeholder, dropdownModel.placeholder) && AbstractC22676k.m65745e(this.selectedOptionId, dropdownModel.selectedOptionId) && AbstractC22676k.m65745e(this.options, dropdownModel.options);
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

    public final String getLabel() {
        return this.label;
    }

    public final List<DropdownOption> getOptions() {
        return this.options;
    }

    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final String getSelectedOptionId() {
        return this.selectedOptionId;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.label;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.placeholder;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.selectedOptionId;
        return this.options.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
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
        String str2 = this.label;
        String str3 = this.placeholder;
        String str4 = this.selectedOptionId;
        List<DropdownOption> list = this.options;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DropdownModel(id=", str, ", label=", str2, ", placeholder=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", selectedOptionId=", str4, ", options=");
        return AbstractC3855a.m11829m(sbM32001t, list, ")");
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public DropdownModel bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return AbstractC21673e.m60964a(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    public DropdownModel(String id4, String str, String str2, String str3, List<DropdownOption> options) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(options, "options");
        this.id = id4;
        this.label = str;
        this.placeholder = str2;
        this.selectedOptionId = str3;
        this.options = options;
    }

    public /* synthetic */ DropdownModel(String str, String str2, String str3, String str4, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? C25271y.f99162w : list);
    }
}
