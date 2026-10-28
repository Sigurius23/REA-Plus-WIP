package com.whoop.researchPacket.api;

import java.util.Map;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import ud3.AbstractC34846v0;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37278i;
import wg3.InterfaceC37279j;
import wg3.InterfaceC37284o;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001Jf\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000e\u0010\u000fJ6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J6\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0010H§@¢\u0006\u0004\b\u0014\u0010\u0013J6\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0010H§@¢\u0006\u0004\b\u0015\u0010\u0013J6\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0010H§@¢\u0006\u0004\b\u0016\u0010\u0013¨\u0006\u0017À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/researchPacket/api/ResearchMetricsApi;", "", "Lud3/v0;", "body", "", "type", "encoding", "firmwareVersion", "binaryVersion", "sigProcVersion", "binaryFlags", "hardwareVersion", "Lpg3/v0;", "Ll83/a0;", "uploadResearchPackets", "(Lud3/v0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "", "headers", "uploadR20RawData", "(Lud3/v0;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;", "uploadR21RawData", "uploadRev2RawData", "uploadDataSettings", "research-packet_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface ResearchMetricsApi {
    @InterfaceC37284o("research-metrics-service/v1/data-settings/upload")
    Object uploadDataSettings(@InterfaceC37270a AbstractC34846v0 abstractC34846v0, @InterfaceC37279j Map<String, String> map, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("research-metrics-service/v1/optical/upload")
    Object uploadR20RawData(@InterfaceC37270a AbstractC34846v0 abstractC34846v0, @InterfaceC37279j Map<String, String> map, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("research-metrics-service/v1/imu/upload")
    Object uploadR21RawData(@InterfaceC37270a AbstractC34846v0 abstractC34846v0, @InterfaceC37279j Map<String, String> map, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("research-metrics-service/v1/research/upload")
    Object uploadResearchPackets(@InterfaceC37270a AbstractC34846v0 abstractC34846v0, @InterfaceC37278i("Content-Type") String str, @InterfaceC37278i("Content-Encoding") String str2, @InterfaceC37278i("X-WHOOP-FW-Version") String str3, @InterfaceC37278i("X-WHOOP-Binary-Version") String str4, @InterfaceC37278i("X-WHOOP-DSP-Version") String str5, @InterfaceC37278i("X-WHOOP-Binary-Flags") String str6, @InterfaceC37278i("X-WHOOP-HW-Version") String str7, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("research-metrics-service/v1/raw/upload")
    Object uploadRev2RawData(@InterfaceC37270a AbstractC34846v0 abstractC34846v0, @InterfaceC37279j Map<String, String> map, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
