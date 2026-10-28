package com.whoop.trackactivity.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Map;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import na1.C26511a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0002FEB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBm\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\n\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010 \u001a\u00020\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001e0\u000eH\u0016¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010(J:\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b+\u0010#J\u0010\u0010,\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010/\u001a\u00020\u00062\b\u0010.\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b2\u0010#R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b3\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010&R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00106\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010(R0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>RE\u0010\u0011\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000ej\u0004\u0018\u0001`?¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\t0B8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010:\u001a\u0004\bC\u0010<\"\u0004\bD\u0010>¨\u0006G"}, m65681d2 = {"Lcom/whoop/trackactivity/domain/models/TrackSessionMiniArchModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "selectedActivityInternalName", "", "gpsTrackingEnabled", "Lcom/whoop/navigation/e;", "restoreSessionDestination", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/e;)V", "", "seen0", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "aggregateBindings", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/e;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$track_activity_release", "(Lcom/whoop/trackactivity/domain/models/TrackSessionMiniArchModel;Lzc3/c;Lyc3/g;)V", "write$Self", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/trackactivity/domain/models/TrackSessionMiniArchModel;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Lcom/whoop/navigation/e;", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/e;)Lcom/whoop/trackactivity/domain/models/TrackSessionMiniArchModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getSelectedActivityInternalName", "Z", "getGpsTrackingEnabled", "Lcom/whoop/navigation/e;", "getRestoreSessionDestination", "getRestoreSessionDestination$annotations", "()V", "Ljava/util/Map;", "getBindings", "()Ljava/util/Map;", "setBindings", "(Ljava/util/Map;)V", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TrackSessionMiniArchModel implements WithGeneratedBindings, DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final boolean gpsTrackingEnabled;
    private final String id;
    private final C9598e restoreSessionDestination;
    private final String selectedActivityInternalName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trackactivity/domain/models/TrackSessionMiniArchModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trackactivity/domain/models/TrackSessionMiniArchModel;", "serializer", "()Lwc3/c;", "track-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TrackSessionMiniArchModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C26511a(27)), AbstractC30060g.m92087G(enumC23463i, new C26511a(28)), null};
    }

    public /* synthetic */ TrackSessionMiniArchModel(int i13, String str, String str2, boolean z4, C9598e c9598e, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, TrackSessionMiniArchModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        if ((i13 & 2) == 0) {
            this.selectedActivityInternalName = "";
        } else {
            this.selectedActivityInternalName = str2;
        }
        if ((i13 & 4) == 0) {
            this.gpsTrackingEnabled = false;
        } else {
            this.gpsTrackingEnabled = z4;
        }
        if ((i13 & 8) == 0) {
            this.restoreSessionDestination = null;
        } else {
            this.restoreSessionDestination = c9598e;
        }
        if ((i13 & 16) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 32) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
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

    public static /* synthetic */ TrackSessionMiniArchModel copy$default(TrackSessionMiniArchModel trackSessionMiniArchModel, String str, String str2, boolean z4, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = trackSessionMiniArchModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = trackSessionMiniArchModel.selectedActivityInternalName;
        }
        if ((i13 & 4) != 0) {
            z4 = trackSessionMiniArchModel.gpsTrackingEnabled;
        }
        if ((i13 & 8) != 0) {
            c9598e = trackSessionMiniArchModel.restoreSessionDestination;
        }
        return trackSessionMiniArchModel.copy(str, str2, z4, c9598e);
    }

    public static /* synthetic */ void getRestoreSessionDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$track_activity_release(TrackSessionMiniArchModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.selectedActivityInternalName, "")) {
            output.encodeStringElement(serialDesc, 1, self.selectedActivityInternalName);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.gpsTrackingEnabled) {
            output.encodeBooleanElement(serialDesc, 2, self.gpsTrackingEnabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.restoreSessionDestination != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.restoreSessionDestination);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 5, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
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
    public final String getSelectedActivityInternalName() {
        return this.selectedActivityInternalName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getGpsTrackingEnabled() {
        return this.gpsTrackingEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final C9598e getRestoreSessionDestination() {
        return this.restoreSessionDestination;
    }

    public final TrackSessionMiniArchModel copy(String id4, String selectedActivityInternalName, boolean gpsTrackingEnabled, C9598e restoreSessionDestination) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(selectedActivityInternalName, "selectedActivityInternalName");
        return new TrackSessionMiniArchModel(id4, selectedActivityInternalName, gpsTrackingEnabled, restoreSessionDestination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackSessionMiniArchModel)) {
            return false;
        }
        TrackSessionMiniArchModel trackSessionMiniArchModel = (TrackSessionMiniArchModel) other;
        return AbstractC22676k.m65745e(this.id, trackSessionMiniArchModel.id) && AbstractC22676k.m65745e(this.selectedActivityInternalName, trackSessionMiniArchModel.selectedActivityInternalName) && this.gpsTrackingEnabled == trackSessionMiniArchModel.gpsTrackingEnabled && AbstractC22676k.m65745e(this.restoreSessionDestination, trackSessionMiniArchModel.restoreSessionDestination);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final boolean getGpsTrackingEnabled() {
        return this.gpsTrackingEnabled;
    }

    public final String getId() {
        return this.id;
    }

    public final C9598e getRestoreSessionDestination() {
        return this.restoreSessionDestination;
    }

    public final String getSelectedActivityInternalName() {
        return this.selectedActivityInternalName;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.selectedActivityInternalName), 31, this.gpsTrackingEnabled);
        C9598e c9598e = this.restoreSessionDestination;
        return iM8289b + (c9598e == null ? 0 : c9598e.hashCode());
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
        String str2 = this.selectedActivityInternalName;
        boolean z4 = this.gpsTrackingEnabled;
        C9598e c9598e = this.restoreSessionDestination;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("TrackSessionMiniArchModel(id=", str, ", selectedActivityInternalName=", str2, ", gpsTrackingEnabled=");
        sbM32001t.append(z4);
        sbM32001t.append(", restoreSessionDestination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public TrackSessionMiniArchModel bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return TrackSessionMiniArchModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    public TrackSessionMiniArchModel(String id4, String selectedActivityInternalName, boolean z4, C9598e c9598e) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(selectedActivityInternalName, "selectedActivityInternalName");
        this.id = id4;
        this.selectedActivityInternalName = selectedActivityInternalName;
        this.gpsTrackingEnabled = z4;
        this.restoreSessionDestination = c9598e;
    }

    public /* synthetic */ TrackSessionMiniArchModel(String str, String str2, boolean z4, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? false : z4, (i13 & 8) != 0 ? null : c9598e);
    }
}
