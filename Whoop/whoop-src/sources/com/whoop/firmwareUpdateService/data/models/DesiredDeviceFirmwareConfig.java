package com.whoop.firmwareUpdateService.data.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import na1.C26511a;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0081\b\u0018\u0000 72\u00020\u0001:\u000289B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBG\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J@\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010)\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001cR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010\u001eR \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00102\u0012\u0004\b3\u0010.\u001a\u0004\b\b\u0010 R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00104\u0012\u0004\b6\u0010.\u001a\u0004\b5\u0010\"¨\u0006:"}, m65681d2 = {"Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareConfig;", "", "", "hardwareDevice", "", "Lcom/whoop/firmwareUpdateService/data/models/ChipFirmwareVersion;", "chipFirmwares", "", "isForceUpdate", "", "forceUpdateRepromptTime", "<init>", "(Ljava/lang/String;Ljava/util/List;ZLjava/lang/Long;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;ZLjava/lang/Long;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$firmware_update_service_release", "(Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareConfig;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Z", "component4", "()Ljava/lang/Long;", "copy", "(Ljava/lang/String;Ljava/util/List;ZLjava/lang/Long;)Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareConfig;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHardwareDevice", "getHardwareDevice$annotations", "()V", "Ljava/util/List;", "getChipFirmwares", "getChipFirmwares$annotations", "Z", "isForceUpdate$annotations", "Ljava/lang/Long;", "getForceUpdateRepromptTime", "getForceUpdateRepromptTime$annotations", "Companion", "$serializer", "a", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DesiredDeviceFirmwareConfig {

    @SerializedName("chip_firmwares")
    private final List<ChipFirmwareVersion> chipFirmwares;

    @SerializedName("force_update_reprompt_cadence")
    private final Long forceUpdateRepromptTime;

    @SerializedName("hardware_device")
    private final String hardwareDevice;

    @SerializedName("force_update")
    private final boolean isForceUpdate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C26511a(21)), null, null};

    /* JADX INFO: renamed from: com.whoop.firmwareUpdateService.data.models.DesiredDeviceFirmwareConfig$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareConfig$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareConfig;", "serializer", "()Lwc3/c;", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DesiredDeviceFirmwareConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DesiredDeviceFirmwareConfig(int i13, String str, List list, boolean z4, Long l7, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i13 & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 15, DesiredDeviceFirmwareConfig$$serializer.INSTANCE.getDescriptor());
        }
        this.hardwareDevice = str;
        this.chipFirmwares = list;
        this.isForceUpdate = z4;
        this.forceUpdateRepromptTime = l7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(ChipFirmwareVersion$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DesiredDeviceFirmwareConfig copy$default(DesiredDeviceFirmwareConfig desiredDeviceFirmwareConfig, String str, List list, boolean z4, Long l7, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = desiredDeviceFirmwareConfig.hardwareDevice;
        }
        if ((i13 & 2) != 0) {
            list = desiredDeviceFirmwareConfig.chipFirmwares;
        }
        if ((i13 & 4) != 0) {
            z4 = desiredDeviceFirmwareConfig.isForceUpdate;
        }
        if ((i13 & 8) != 0) {
            l7 = desiredDeviceFirmwareConfig.forceUpdateRepromptTime;
        }
        return desiredDeviceFirmwareConfig.copy(str, list, z4, l7);
    }

    @InterfaceC37143h("chip_firmwares")
    public static /* synthetic */ void getChipFirmwares$annotations() {
    }

    @InterfaceC37143h("force_update_reprompt_cadence")
    public static /* synthetic */ void getForceUpdateRepromptTime$annotations() {
    }

    @InterfaceC37143h("hardware_device")
    public static /* synthetic */ void getHardwareDevice$annotations() {
    }

    @InterfaceC37143h("force_update")
    public static /* synthetic */ void isForceUpdate$annotations() {
    }

    public static final /* synthetic */ void write$Self$firmware_update_service_release(DesiredDeviceFirmwareConfig self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.hardwareDevice);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.chipFirmwares);
        output.encodeBooleanElement(serialDesc, 2, self.isForceUpdate);
        output.encodeNullableSerializableElement(serialDesc, 3, LongSerializer.INSTANCE, self.forceUpdateRepromptTime);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getHardwareDevice() {
        return this.hardwareDevice;
    }

    public final List<ChipFirmwareVersion> component2() {
        return this.chipFirmwares;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsForceUpdate() {
        return this.isForceUpdate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Long getForceUpdateRepromptTime() {
        return this.forceUpdateRepromptTime;
    }

    public final DesiredDeviceFirmwareConfig copy(String hardwareDevice, List<ChipFirmwareVersion> chipFirmwares, boolean isForceUpdate, Long forceUpdateRepromptTime) {
        AbstractC22676k.m65750j(hardwareDevice, "hardwareDevice");
        AbstractC22676k.m65750j(chipFirmwares, "chipFirmwares");
        return new DesiredDeviceFirmwareConfig(hardwareDevice, chipFirmwares, isForceUpdate, forceUpdateRepromptTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DesiredDeviceFirmwareConfig)) {
            return false;
        }
        DesiredDeviceFirmwareConfig desiredDeviceFirmwareConfig = (DesiredDeviceFirmwareConfig) other;
        return AbstractC22676k.m65745e(this.hardwareDevice, desiredDeviceFirmwareConfig.hardwareDevice) && AbstractC22676k.m65745e(this.chipFirmwares, desiredDeviceFirmwareConfig.chipFirmwares) && this.isForceUpdate == desiredDeviceFirmwareConfig.isForceUpdate && AbstractC22676k.m65745e(this.forceUpdateRepromptTime, desiredDeviceFirmwareConfig.forceUpdateRepromptTime);
    }

    public final List<ChipFirmwareVersion> getChipFirmwares() {
        return this.chipFirmwares;
    }

    public final Long getForceUpdateRepromptTime() {
        return this.forceUpdateRepromptTime;
    }

    public final String getHardwareDevice() {
        return this.hardwareDevice;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC11895b.m31983b(this.hardwareDevice.hashCode() * 31, 31, this.chipFirmwares), 31, this.isForceUpdate);
        Long l7 = this.forceUpdateRepromptTime;
        return iM8289b + (l7 == null ? 0 : l7.hashCode());
    }

    public final boolean isForceUpdate() {
        return this.isForceUpdate;
    }

    public String toString() {
        String str = this.hardwareDevice;
        List<ChipFirmwareVersion> list = this.chipFirmwares;
        boolean z4 = this.isForceUpdate;
        Long l7 = this.forceUpdateRepromptTime;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("DesiredDeviceFirmwareConfig(hardwareDevice=", str, ", chipFirmwares=", ", isForceUpdate=", list);
        sbM94766o.append(z4);
        sbM94766o.append(", forceUpdateRepromptTime=");
        sbM94766o.append(l7);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public DesiredDeviceFirmwareConfig(String hardwareDevice, List<ChipFirmwareVersion> chipFirmwares, boolean z4, Long l7) {
        AbstractC22676k.m65750j(hardwareDevice, "hardwareDevice");
        AbstractC22676k.m65750j(chipFirmwares, "chipFirmwares");
        this.hardwareDevice = hardwareDevice;
        this.chipFirmwares = chipFirmwares;
        this.isForceUpdate = z4;
        this.forceUpdateRepromptTime = l7;
    }
}
