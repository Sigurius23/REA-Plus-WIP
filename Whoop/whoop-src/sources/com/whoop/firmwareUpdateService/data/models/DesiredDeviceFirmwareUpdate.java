package com.whoop.firmwareUpdateService.data.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0002+,B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u0019¨\u0006-"}, m65681d2 = {"Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareUpdate;", "", "Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareConfig;", "desiredDeviceFirmwareConfig", "", "firmwareFile", "<init>", "(Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareConfig;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareConfig;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$firmware_update_service_release", "(Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareUpdate;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareConfig;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareConfig;Ljava/lang/String;)Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareUpdate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareConfig;", "getDesiredDeviceFirmwareConfig", "getDesiredDeviceFirmwareConfig$annotations", "()V", "Ljava/lang/String;", "getFirmwareFile", "getFirmwareFile$annotations", "Companion", "$serializer", "a", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DesiredDeviceFirmwareUpdate {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("desired_device_firmware_config")
    private final DesiredDeviceFirmwareConfig desiredDeviceFirmwareConfig;

    @SerializedName("firmware_zip_file")
    private final String firmwareFile;

    /* JADX INFO: renamed from: com.whoop.firmwareUpdateService.data.models.DesiredDeviceFirmwareUpdate$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareUpdate$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareUpdate;", "serializer", "()Lwc3/c;", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DesiredDeviceFirmwareUpdate$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DesiredDeviceFirmwareUpdate(int i13, DesiredDeviceFirmwareConfig desiredDeviceFirmwareConfig, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i13 & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 3, DesiredDeviceFirmwareUpdate$$serializer.INSTANCE.getDescriptor());
        }
        this.desiredDeviceFirmwareConfig = desiredDeviceFirmwareConfig;
        this.firmwareFile = str;
    }

    public static /* synthetic */ DesiredDeviceFirmwareUpdate copy$default(DesiredDeviceFirmwareUpdate desiredDeviceFirmwareUpdate, DesiredDeviceFirmwareConfig desiredDeviceFirmwareConfig, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            desiredDeviceFirmwareConfig = desiredDeviceFirmwareUpdate.desiredDeviceFirmwareConfig;
        }
        if ((i13 & 2) != 0) {
            str = desiredDeviceFirmwareUpdate.firmwareFile;
        }
        return desiredDeviceFirmwareUpdate.copy(desiredDeviceFirmwareConfig, str);
    }

    @InterfaceC37143h("desired_device_firmware_config")
    public static /* synthetic */ void getDesiredDeviceFirmwareConfig$annotations() {
    }

    @InterfaceC37143h("firmware_zip_file")
    public static /* synthetic */ void getFirmwareFile$annotations() {
    }

    public static final /* synthetic */ void write$Self$firmware_update_service_release(DesiredDeviceFirmwareUpdate self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, DesiredDeviceFirmwareConfig$$serializer.INSTANCE, self.desiredDeviceFirmwareConfig);
        output.encodeStringElement(serialDesc, 1, self.firmwareFile);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DesiredDeviceFirmwareConfig getDesiredDeviceFirmwareConfig() {
        return this.desiredDeviceFirmwareConfig;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirmwareFile() {
        return this.firmwareFile;
    }

    public final DesiredDeviceFirmwareUpdate copy(DesiredDeviceFirmwareConfig desiredDeviceFirmwareConfig, String firmwareFile) {
        AbstractC22676k.m65750j(desiredDeviceFirmwareConfig, "desiredDeviceFirmwareConfig");
        AbstractC22676k.m65750j(firmwareFile, "firmwareFile");
        return new DesiredDeviceFirmwareUpdate(desiredDeviceFirmwareConfig, firmwareFile);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DesiredDeviceFirmwareUpdate)) {
            return false;
        }
        DesiredDeviceFirmwareUpdate desiredDeviceFirmwareUpdate = (DesiredDeviceFirmwareUpdate) other;
        return AbstractC22676k.m65745e(this.desiredDeviceFirmwareConfig, desiredDeviceFirmwareUpdate.desiredDeviceFirmwareConfig) && AbstractC22676k.m65745e(this.firmwareFile, desiredDeviceFirmwareUpdate.firmwareFile);
    }

    public final DesiredDeviceFirmwareConfig getDesiredDeviceFirmwareConfig() {
        return this.desiredDeviceFirmwareConfig;
    }

    public final String getFirmwareFile() {
        return this.firmwareFile;
    }

    public int hashCode() {
        return this.firmwareFile.hashCode() + (this.desiredDeviceFirmwareConfig.hashCode() * 31);
    }

    public String toString() {
        return "DesiredDeviceFirmwareUpdate(desiredDeviceFirmwareConfig=" + this.desiredDeviceFirmwareConfig + ", firmwareFile=" + this.firmwareFile + ")";
    }

    public DesiredDeviceFirmwareUpdate(DesiredDeviceFirmwareConfig desiredDeviceFirmwareConfig, String firmwareFile) {
        AbstractC22676k.m65750j(desiredDeviceFirmwareConfig, "desiredDeviceFirmwareConfig");
        AbstractC22676k.m65750j(firmwareFile, "firmwareFile");
        this.desiredDeviceFirmwareConfig = desiredDeviceFirmwareConfig;
        this.firmwareFile = firmwareFile;
    }
}
