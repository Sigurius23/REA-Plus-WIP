package com.whoop.firmwareUpdateService.data.api;

import com.whoop.firmwareUpdateService.data.models.ChipFirmwareVersion;
import com.whoop.firmwareUpdateService.data.models.DesiredDeviceFirmwareConfig;
import com.whoop.firmwareUpdateService.data.models.DesiredDeviceFirmwareUpdate;
import com.whoop.firmwareUpdateService.data.models.DownloadFwFilePayload;
import com.whoop.firmwareUpdateService.data.models.ReportFwUpdateResultPayload;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37278i;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H§@¢\u0006\u0004\b\b\u0010\tJ$\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u000e2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/firmwareUpdateService/data/api/OtaFirmwareUpdateApi;", "", "", "deviceName", "", "Lcom/whoop/firmwareUpdateService/data/models/ChipFirmwareVersion;", "body", "Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareConfig;", "getDesiredDeviceFirmwareConfig", "(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/firmwareUpdateService/data/models/DownloadFwFilePayload;", "Lcom/whoop/firmwareUpdateService/data/models/DesiredDeviceFirmwareUpdate;", "downloadFirmwareUpdate", "(Ljava/lang/String;Lcom/whoop/firmwareUpdateService/data/models/DownloadFwFilePayload;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/firmwareUpdateService/data/models/ReportFwUpdateResultPayload;", "auxiliaryDeviceId", "Lpg3/v0;", "Ll83/a0;", "reportFirmwareUpdateResult", "(Ljava/lang/String;Lcom/whoop/firmwareUpdateService/data/models/ReportFwUpdateResultPayload;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "firmware-update-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface OtaFirmwareUpdateApi {
    @InterfaceC37284o("firmware-service/v4/firmware/version")
    Object downloadFirmwareUpdate(@InterfaceC37289t("deviceName") String str, @InterfaceC37270a DownloadFwFilePayload downloadFwFilePayload, InterfaceC30057d<? super DesiredDeviceFirmwareUpdate> interfaceC30057d);

    @InterfaceC37284o("firmware-service/v4/firmware/check")
    Object getDesiredDeviceFirmwareConfig(@InterfaceC37289t("deviceName") String str, @InterfaceC37270a List<ChipFirmwareVersion> list, InterfaceC30057d<? super DesiredDeviceFirmwareConfig> interfaceC30057d);

    @InterfaceC37284o("firmware-service/v4/firmware/result")
    Object reportFirmwareUpdateResult(@InterfaceC37289t("deviceName") String str, @InterfaceC37270a ReportFwUpdateResultPayload reportFwUpdateResultPayload, @InterfaceC37278i("X-WHOOP-Auxiliary-Device-Id") String str2, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
