package com.whoop.startactivity.presession.domain.model;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import qa1.C30112a;
import qg2.AbstractC30348a;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 N2\u00020\u00012\u00020\u0002:\u0002OPBU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB\u008f\u0001\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u000e\u0010\u0017J#\u0010\u001a\u001a\u00020\u00002\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u001e\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b%\u0010&J`\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b)\u0010\u001dJ\u0010\u0010*\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010-\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b-\u0010.J'\u00107\u001a\u0002042\u0006\u0010/\u001a\u00020\u00002\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0001¢\u0006\u0004\b5\u00106R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00108\u001a\u0004\b9\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b:\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010 R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010=\u0012\u0004\b?\u0010@\u001a\u0004\b>\u0010\"R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bB\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010C\u001a\u0004\bD\u0010&R0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010A\u001a\u0004\bE\u0010$\"\u0004\bF\u0010GRE\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0018\u00010\nj\u0004\u0018\u0001`H¢\u0006\f\bI\u0012\b\bJ\u0012\u0004\b\t0K8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010A\u001a\u0004\bL\u0010$\"\u0004\bM\u0010G¨\u0006Q"}, m65681d2 = {"Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "selectedInternalName", "", "gpsTrackingEnabled", "Lcom/whoop/navigation/e;", "destination", "", "stateKeys", "Lcom/whoop/design/models/modal/AnyModal;", "modal", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/navigation/e;Ljava/util/Map;Lcom/whoop/design/models/modal/AnyModal;)V", "", "seen0", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/navigation/e;Ljava/util/Map;Lcom/whoop/design/models/modal/AnyModal;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "()Lcom/whoop/navigation/e;", "component5", "()Ljava/util/Map;", "component6", "()Lcom/whoop/design/models/modal/AnyModal;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/navigation/e;Ljava/util/Map;Lcom/whoop/design/models/modal/AnyModal;)Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$start_activity_release", "(Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getSelectedInternalName", "Ljava/lang/Boolean;", "getGpsTrackingEnabled", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "Ljava/util/Map;", "getStateKeys", "Lcom/whoop/design/models/modal/AnyModal;", "getModal", "getBindings", "setBindings", "(Ljava/util/Map;)V", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "a", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PreSessionWidgetModel implements WithGeneratedBindings, DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final C9598e destination;
    private final Boolean gpsTrackingEnabled;
    private final String id;
    private final AnyModal modal;
    private final String selectedInternalName;
    private final Map<String, String> stateKeys;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.startactivity.presession.domain.model.PreSessionWidgetModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/startactivity/presession/domain/model/PreSessionWidgetModel;", "serializer", "()Lwc3/c;", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PreSessionWidgetModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C30112a(24)), AbstractC30060g.m92087G(enumC23463i, new C30112a(25)), AbstractC30060g.m92087G(enumC23463i, new C30112a(26)), AbstractC30060g.m92087G(enumC23463i, new C30112a(27)), null};
    }

    public /* synthetic */ PreSessionWidgetModel(int i13, String str, String str2, Boolean bool, C9598e c9598e, Map map, AnyModal anyModal, Map map2, Map map3, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, PreSessionWidgetModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        if ((i13 & 2) == 0) {
            this.selectedInternalName = "";
        } else {
            this.selectedInternalName = str2;
        }
        if ((i13 & 4) == 0) {
            this.gpsTrackingEnabled = null;
        } else {
            this.gpsTrackingEnabled = bool;
        }
        if ((i13 & 8) == 0) {
            this.destination = null;
        } else {
            this.destination = c9598e;
        }
        if ((i13 & 16) == 0) {
            this.stateKeys = null;
        } else {
            this.stateKeys = map;
        }
        if ((i13 & 32) == 0) {
            this.modal = null;
        } else {
            this.modal = anyModal;
        }
        if ((i13 & 64) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map2;
        }
        if ((i13 & 128) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return AnyModal.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PreSessionWidgetModel copy$default(PreSessionWidgetModel preSessionWidgetModel, String str, String str2, Boolean bool, C9598e c9598e, Map map, AnyModal anyModal, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = preSessionWidgetModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = preSessionWidgetModel.selectedInternalName;
        }
        if ((i13 & 4) != 0) {
            bool = preSessionWidgetModel.gpsTrackingEnabled;
        }
        if ((i13 & 8) != 0) {
            c9598e = preSessionWidgetModel.destination;
        }
        if ((i13 & 16) != 0) {
            map = preSessionWidgetModel.stateKeys;
        }
        if ((i13 & 32) != 0) {
            anyModal = preSessionWidgetModel.modal;
        }
        Map map2 = map;
        AnyModal anyModal2 = anyModal;
        return preSessionWidgetModel.copy(str, str2, bool, c9598e, map2, anyModal2);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$start_activity_release(PreSessionWidgetModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.selectedInternalName, "")) {
            output.encodeStringElement(serialDesc, 1, self.selectedInternalName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.gpsTrackingEnabled != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, self.gpsTrackingEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.destination != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.destination);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.stateKeys != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.stateKeys);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.modal != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.modal);
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
    public final String getSelectedInternalName() {
        return this.selectedInternalName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getGpsTrackingEnabled() {
        return this.gpsTrackingEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final Map<String, String> component5() {
        return this.stateKeys;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AnyModal getModal() {
        return this.modal;
    }

    public final PreSessionWidgetModel copy(String id4, String selectedInternalName, Boolean gpsTrackingEnabled, C9598e destination, Map<String, String> stateKeys, AnyModal modal) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(selectedInternalName, "selectedInternalName");
        return new PreSessionWidgetModel(id4, selectedInternalName, gpsTrackingEnabled, destination, stateKeys, modal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreSessionWidgetModel)) {
            return false;
        }
        PreSessionWidgetModel preSessionWidgetModel = (PreSessionWidgetModel) other;
        return AbstractC22676k.m65745e(this.id, preSessionWidgetModel.id) && AbstractC22676k.m65745e(this.selectedInternalName, preSessionWidgetModel.selectedInternalName) && AbstractC22676k.m65745e(this.gpsTrackingEnabled, preSessionWidgetModel.gpsTrackingEnabled) && AbstractC22676k.m65745e(this.destination, preSessionWidgetModel.destination) && AbstractC22676k.m65745e(this.stateKeys, preSessionWidgetModel.stateKeys) && AbstractC22676k.m65745e(this.modal, preSessionWidgetModel.modal);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final Boolean getGpsTrackingEnabled() {
        return this.gpsTrackingEnabled;
    }

    public final String getId() {
        return this.id;
    }

    public final AnyModal getModal() {
        return this.modal;
    }

    public final String getSelectedInternalName() {
        return this.selectedInternalName;
    }

    public final Map<String, String> getStateKeys() {
        return this.stateKeys;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.selectedInternalName);
        Boolean bool = this.gpsTrackingEnabled;
        int iHashCode = (iM30450d + (bool == null ? 0 : bool.hashCode())) * 31;
        C9598e c9598e = this.destination;
        int iHashCode2 = (iHashCode + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        Map<String, String> map = this.stateKeys;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        AnyModal anyModal = this.modal;
        return iHashCode3 + (anyModal != null ? anyModal.hashCode() : 0);
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
        Boolean bool = this.gpsTrackingEnabled;
        C9598e c9598e = this.destination;
        Map<String, String> map = this.stateKeys;
        AnyModal anyModal = this.modal;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PreSessionWidgetModel(id=", str, ", selectedInternalName=", str2, ", gpsTrackingEnabled=");
        sbM32001t.append(bool);
        sbM32001t.append(", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", stateKeys=");
        sbM32001t.append(map);
        sbM32001t.append(", modal=");
        sbM32001t.append(anyModal);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public PreSessionWidgetModel bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return AbstractC30348a.m92783a(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    public PreSessionWidgetModel(String id4, String selectedInternalName, Boolean bool, C9598e c9598e, Map<String, String> map, AnyModal anyModal) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(selectedInternalName, "selectedInternalName");
        this.id = id4;
        this.selectedInternalName = selectedInternalName;
        this.gpsTrackingEnabled = bool;
        this.destination = c9598e;
        this.stateKeys = map;
        this.modal = anyModal;
    }

    public /* synthetic */ PreSessionWidgetModel(String str, String str2, Boolean bool, C9598e c9598e, Map map, AnyModal anyModal, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? null : bool, (i13 & 8) != 0 ? null : c9598e, (i13 & 16) != 0 ? null : map, (i13 & 32) != 0 ? null : anyModal);
    }
}
