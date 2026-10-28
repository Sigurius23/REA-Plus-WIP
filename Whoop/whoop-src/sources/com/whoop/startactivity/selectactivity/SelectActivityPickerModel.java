package com.whoop.startactivity.selectactivity;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
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
import tb0.C33691b;
import tg2.AbstractC33793g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0002=>B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBc\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\b\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001e\u001a\u00020\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001c0\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J.\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b'\u0010!J\u0010\u0010(\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00062\b\u0010*\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b.\u0010!R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b/\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b\u0007\u0010$R0\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\r\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105RE\u0010\u000f\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fj\u0004\u0018\u0001`6¢\u0006\f\b7\u0012\b\b8\u0012\u0004\b\t098\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u00101\u001a\u0004\b:\u00103\"\u0004\b;\u00105¨\u0006?"}, m65681d2 = {"Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "id", "selectedInternalName", "", "isGpsTrackingEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$start_activity_release", "(Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;Lzc3/c;Lyc3/g;)V", "write$Self", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getSelectedInternalName", "Z", "Ljava/util/Map;", "getBindings", "()Ljava/util/Map;", "setBindings", "(Ljava/util/Map;)V", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "a", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SelectActivityPickerModel implements DesignSystemModel, WithGeneratedBindings {
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final String id;
    private final boolean isGpsTrackingEnabled;
    private final String selectedInternalName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C33691b(13)), null};

    /* JADX INFO: renamed from: com.whoop.startactivity.selectactivity.SelectActivityPickerModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/startactivity/selectactivity/SelectActivityPickerModel;", "serializer", "()Lwc3/c;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SelectActivityPickerModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SelectActivityPickerModel(int i13, String str, String str2, boolean z4, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, SelectActivityPickerModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        if ((i13 & 2) == 0) {
            this.selectedInternalName = "";
        } else {
            this.selectedInternalName = str2;
        }
        if ((i13 & 4) == 0) {
            this.isGpsTrackingEnabled = false;
        } else {
            this.isGpsTrackingEnabled = z4;
        }
        if ((i13 & 8) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 16) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    public static /* synthetic */ SelectActivityPickerModel copy$default(SelectActivityPickerModel selectActivityPickerModel, String str, String str2, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = selectActivityPickerModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = selectActivityPickerModel.selectedInternalName;
        }
        if ((i13 & 4) != 0) {
            z4 = selectActivityPickerModel.isGpsTrackingEnabled;
        }
        return selectActivityPickerModel.copy(str, str2, z4);
    }

    public static final /* synthetic */ void write$Self$start_activity_release(SelectActivityPickerModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.selectedInternalName, "")) {
            output.encodeStringElement(serialDesc, 1, self.selectedInternalName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.isGpsTrackingEnabled) {
            output.encodeBooleanElement(serialDesc, 2, self.isGpsTrackingEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
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
    public final String getSelectedInternalName() {
        return this.selectedInternalName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsGpsTrackingEnabled() {
        return this.isGpsTrackingEnabled;
    }

    public final SelectActivityPickerModel copy(String id4, String selectedInternalName, boolean isGpsTrackingEnabled) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(selectedInternalName, "selectedInternalName");
        return new SelectActivityPickerModel(id4, selectedInternalName, isGpsTrackingEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectActivityPickerModel)) {
            return false;
        }
        SelectActivityPickerModel selectActivityPickerModel = (SelectActivityPickerModel) other;
        return AbstractC22676k.m65745e(this.id, selectActivityPickerModel.id) && AbstractC22676k.m65745e(this.selectedInternalName, selectActivityPickerModel.selectedInternalName) && this.isGpsTrackingEnabled == selectActivityPickerModel.isGpsTrackingEnabled;
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

    public final String getSelectedInternalName() {
        return this.selectedInternalName;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isGpsTrackingEnabled) + AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.selectedInternalName);
    }

    public final boolean isGpsTrackingEnabled() {
        return this.isGpsTrackingEnabled;
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
        String str2 = this.selectedInternalName;
        return AbstractC18489d0.m53372m(AbstractC11895b.m32001t("SelectActivityPickerModel(id=", str, ", selectedInternalName=", str2, ", isGpsTrackingEnabled="), this.isGpsTrackingEnabled, ")");
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public SelectActivityPickerModel bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return AbstractC33793g.m106895a(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    public SelectActivityPickerModel(String id4, String selectedInternalName, boolean z4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(selectedInternalName, "selectedInternalName");
        this.id = id4;
        this.selectedInternalName = selectedInternalName;
        this.isGpsTrackingEnabled = z4;
    }

    public /* synthetic */ SelectActivityPickerModel(String str, String str2, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? false : z4);
    }
}
