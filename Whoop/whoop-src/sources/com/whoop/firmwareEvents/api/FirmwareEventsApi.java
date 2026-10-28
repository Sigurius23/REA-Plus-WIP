package com.whoop.firmwareEvents.api;

import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import ud3.AbstractC34846v0;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37278i;
import wg3.InterfaceC37284o;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jz\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/firmwareEvents/api/FirmwareEventsApi;", "", "Lud3/v0;", "body", "", "hardwareVersion", "firmwareVersion", "bluetoothVersion", "sigProcVersion", "strapId", "releaseVersion", "model", "", "binaryVersion", "auxiliaryDeviceId", "Lpg3/v0;", "Ll83/a0;", "uploadFirmwareEvents", "(Lud3/v0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;", "firmware-events_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface FirmwareEventsApi {
    @InterfaceC37284o("firmware-service/v1/events")
    Object uploadFirmwareEvents(@InterfaceC37270a AbstractC34846v0 abstractC34846v0, @InterfaceC37278i("X-WHOOP-HW-Version") String str, @InterfaceC37278i("X-WHOOP-FW-Version") String str2, @InterfaceC37278i("X-WHOOP-Nordic-Version") String str3, @InterfaceC37278i("X-WHOOP-DSP-Version") String str4, @InterfaceC37278i("X-WHOOP-Strap-Id") String str5, @InterfaceC37278i("X-WHOOP-Device-OS") String str6, @InterfaceC37278i("X-WHOOP-Device-Model") String str7, @InterfaceC37278i("X-WHOOP-Binary-Version") int i13, @InterfaceC37278i("X-WHOOP-Auxiliary-Device-Id") String str8, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
