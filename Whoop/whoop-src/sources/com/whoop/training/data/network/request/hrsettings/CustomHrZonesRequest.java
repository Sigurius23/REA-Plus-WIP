package com.whoop.training.data.network.request.hrsettings;

import cj0.C4744f;
import com.google.gson.annotations.SerializedName;
import com.whoop.hrZones.network.Zone;
import com.whoop.hrZones.network.Zone$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)*B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB3\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b\u0003\u0010\u0018R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u001a¨\u0006+"}, m65681d2 = {"Lcom/whoop/training/data/network/request/hrsettings/CustomHrZonesRequest;", "", "", "isCustom", "", "Lcom/whoop/hrZones/network/Zone;", "zones", "<init>", "(ZLjava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$training_release", "(Lcom/whoop/training/data/network/request/hrsettings/CustomHrZonesRequest;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/util/List;", "copy", "(ZLjava/util/List;)Lcom/whoop/training/data/network/request/hrsettings/CustomHrZonesRequest;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "Ljava/util/List;", "getZones", "Companion", "$serializer", "a", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CustomHrZonesRequest {

    @SerializedName("is_custom")
    private final boolean isCustom;

    @SerializedName("zones")
    private final List<Zone> zones;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C4744f(9))};

    /* JADX INFO: renamed from: com.whoop.training.data.network.request.hrsettings.CustomHrZonesRequest$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/training/data/network/request/hrsettings/CustomHrZonesRequest$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/training/data/network/request/hrsettings/CustomHrZonesRequest;", "serializer", "()Lwc3/c;", "training_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CustomHrZonesRequest$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CustomHrZonesRequest(int i13, boolean z4, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, CustomHrZonesRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.isCustom = z4;
        this.zones = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(Zone$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CustomHrZonesRequest copy$default(CustomHrZonesRequest customHrZonesRequest, boolean z4, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = customHrZonesRequest.isCustom;
        }
        if ((i13 & 2) != 0) {
            list = customHrZonesRequest.zones;
        }
        return customHrZonesRequest.copy(z4, list);
    }

    public static final /* synthetic */ void write$Self$training_release(CustomHrZonesRequest self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeBooleanElement(serialDesc, 0, self.isCustom);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.zones);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsCustom() {
        return this.isCustom;
    }

    public final List<Zone> component2() {
        return this.zones;
    }

    public final CustomHrZonesRequest copy(boolean isCustom, List<Zone> zones) {
        AbstractC22676k.m65750j(zones, "zones");
        return new CustomHrZonesRequest(isCustom, zones);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomHrZonesRequest)) {
            return false;
        }
        CustomHrZonesRequest customHrZonesRequest = (CustomHrZonesRequest) other;
        return this.isCustom == customHrZonesRequest.isCustom && AbstractC22676k.m65745e(this.zones, customHrZonesRequest.zones);
    }

    public final List<Zone> getZones() {
        return this.zones;
    }

    public int hashCode() {
        return this.zones.hashCode() + (Boolean.hashCode(this.isCustom) * 31);
    }

    public final boolean isCustom() {
        return this.isCustom;
    }

    public String toString() {
        return "CustomHrZonesRequest(isCustom=" + this.isCustom + ", zones=" + this.zones + ")";
    }

    public CustomHrZonesRequest(boolean z4, List<Zone> zones) {
        AbstractC22676k.m65750j(zones, "zones");
        this.isCustom = z4;
        this.zones = zones;
    }
}
