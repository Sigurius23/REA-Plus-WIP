package com.whoop.connectivityCore.firmware.models;

import c13.AbstractC3855a;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ga1.C15621b;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ4\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00061"}, m65681d2 = {"Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "", "Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;", "deviceName", "", "serial", "", "Lcom/whoop/connectivityCore/firmware/models/ChipDetails;", "chips", "<init>", "(Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$connectivity_core_release", "(Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "copy", "(Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/connectivityCore/firmware/models/WhoopDeviceName;", "getDeviceName", "Ljava/lang/String;", "getSerial", "Ljava/util/List;", "getChips", "Companion", "$serializer", "a", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WhoopFwDevice {
    private static final InterfaceC23462h[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final List<ChipDetails> chips;
    private final WhoopDeviceName deviceName;
    private final String serial;

    /* JADX INFO: renamed from: com.whoop.connectivityCore.firmware.models.WhoopFwDevice$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;", "serializer", "()Lwc3/c;", "connectivity-core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WhoopFwDevice$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C15621b(14)), null, AbstractC30060g.m92087G(enumC23463i, new C15621b(15))};
    }

    public /* synthetic */ WhoopFwDevice(int i13, WhoopDeviceName whoopDeviceName, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, WhoopFwDevice$$serializer.INSTANCE.getDescriptor());
        }
        this.deviceName = whoopDeviceName;
        this.serial = str;
        this.chips = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return WhoopDeviceName.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(ChipDetails$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WhoopFwDevice copy$default(WhoopFwDevice whoopFwDevice, WhoopDeviceName whoopDeviceName, String str, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            whoopDeviceName = whoopFwDevice.deviceName;
        }
        if ((i13 & 2) != 0) {
            str = whoopFwDevice.serial;
        }
        if ((i13 & 4) != 0) {
            list = whoopFwDevice.chips;
        }
        return whoopFwDevice.copy(whoopDeviceName, str, list);
    }

    public static final /* synthetic */ void write$Self$connectivity_core_release(WhoopFwDevice self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.deviceName);
        output.encodeStringElement(serialDesc, 1, self.serial);
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.chips);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final WhoopDeviceName getDeviceName() {
        return this.deviceName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSerial() {
        return this.serial;
    }

    public final List<ChipDetails> component3() {
        return this.chips;
    }

    public final WhoopFwDevice copy(WhoopDeviceName deviceName, String serial, List<ChipDetails> chips) {
        AbstractC22676k.m65750j(deviceName, "deviceName");
        AbstractC22676k.m65750j(serial, "serial");
        AbstractC22676k.m65750j(chips, "chips");
        return new WhoopFwDevice(deviceName, serial, chips);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WhoopFwDevice)) {
            return false;
        }
        WhoopFwDevice whoopFwDevice = (WhoopFwDevice) other;
        return this.deviceName == whoopFwDevice.deviceName && AbstractC22676k.m65745e(this.serial, whoopFwDevice.serial) && AbstractC22676k.m65745e(this.chips, whoopFwDevice.chips);
    }

    public final List<ChipDetails> getChips() {
        return this.chips;
    }

    public final WhoopDeviceName getDeviceName() {
        return this.deviceName;
    }

    public final String getSerial() {
        return this.serial;
    }

    public int hashCode() {
        return this.chips.hashCode() + AbstractC11266d.m30450d(this.deviceName.hashCode() * 31, 31, this.serial);
    }

    public String toString() {
        WhoopDeviceName whoopDeviceName = this.deviceName;
        String str = this.serial;
        List<ChipDetails> list = this.chips;
        StringBuilder sb4 = new StringBuilder("WhoopFwDevice(deviceName=");
        sb4.append(whoopDeviceName);
        sb4.append(", serial=");
        sb4.append(str);
        sb4.append(", chips=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }

    public WhoopFwDevice(WhoopDeviceName deviceName, String serial, List<ChipDetails> chips) {
        AbstractC22676k.m65750j(deviceName, "deviceName");
        AbstractC22676k.m65750j(serial, "serial");
        AbstractC22676k.m65750j(chips, "chips");
        this.deviceName = deviceName;
        this.serial = serial;
        this.chips = chips;
    }
}
