package com.whoop.hrZones.network;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ep0.C13395a;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
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
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u0019¨\u0006,"}, m65681d2 = {"Lcom/whoop/hrZones/network/Zone;", "", "Lcom/whoop/hrZones/network/ZoneID;", "id", "", "min", "max", "<init>", "(Lcom/whoop/hrZones/network/ZoneID;II)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/hrZones/network/ZoneID;IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hrZones_service_release", "(Lcom/whoop/hrZones/network/Zone;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/hrZones/network/ZoneID;", "component2", "()I", "component3", "copy", "(Lcom/whoop/hrZones/network/ZoneID;II)Lcom/whoop/hrZones/network/Zone;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/hrZones/network/ZoneID;", "getId", "I", "getMin", "getMax", "Companion", "$serializer", "hrZones-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class Zone {
    private final ZoneID id;
    private final int max;
    private final int min;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C13395a(10)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hrZones/network/Zone$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hrZones/network/Zone;", "serializer", "()Lwc3/c;", "hrZones-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return Zone$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Zone(int i13, ZoneID zoneID, int i14, int i15, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, Zone$$serializer.INSTANCE.getDescriptor());
        }
        this.id = zoneID;
        this.min = i14;
        this.max = i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return ZoneID.INSTANCE.serializer();
    }

    public static /* synthetic */ Zone copy$default(Zone zone, ZoneID zoneID, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            zoneID = zone.id;
        }
        if ((i15 & 2) != 0) {
            i13 = zone.min;
        }
        if ((i15 & 4) != 0) {
            i14 = zone.max;
        }
        return zone.copy(zoneID, i13, i14);
    }

    public static final /* synthetic */ void write$Self$hrZones_service_release(Zone self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) $childSerializers[0].getValue(), self.id);
        output.encodeIntElement(serialDesc, 1, self.min);
        output.encodeIntElement(serialDesc, 2, self.max);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ZoneID getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMin() {
        return this.min;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMax() {
        return this.max;
    }

    public final Zone copy(ZoneID id4, int min, int max) {
        AbstractC22676k.m65750j(id4, "id");
        return new Zone(id4, min, max);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Zone)) {
            return false;
        }
        Zone zone = (Zone) other;
        return this.id == zone.id && this.min == zone.min && this.max == zone.max;
    }

    public final ZoneID getId() {
        return this.id;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
    }

    public int hashCode() {
        return Integer.hashCode(this.max) + AbstractC11266d.m30448b(this.min, this.id.hashCode() * 31, 31);
    }

    public String toString() {
        ZoneID zoneID = this.id;
        int i13 = this.min;
        int i14 = this.max;
        StringBuilder sb4 = new StringBuilder("Zone(id=");
        sb4.append(zoneID);
        sb4.append(", min=");
        sb4.append(i13);
        sb4.append(", max=");
        return AbstractC18489d0.m53371l(sb4, i14, ")");
    }

    public Zone(ZoneID id4, int i13, int i14) {
        AbstractC22676k.m65750j(id4, "id");
        this.id = id4;
        this.min = i13;
        this.max = i14;
    }
}
