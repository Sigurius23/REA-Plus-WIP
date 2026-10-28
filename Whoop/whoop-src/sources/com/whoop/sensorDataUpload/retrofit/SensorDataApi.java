package com.whoop.sensorDataUpload.retrofit;

import com.whoop.domain.model.MetricsProcessedTime;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import ud3.AbstractC34846v0;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37278i;
import wg3.InterfaceC37284o;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J`\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\nH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/sensorDataUpload/retrofit/SensorDataApi;", "", "Lud3/v0;", "body", "", "encoding", "hardwareVersion", "firmwareVersion", "sigProcVersion", "strapId", "", "binaryVersion", "binaryFlags", "Lcom/whoop/domain/model/MetricsProcessedTime;", "uploadMetricsData", "(Lud3/v0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILq83/d;)Ljava/lang/Object;", "sensor-data-upload_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface SensorDataApi {
    @InterfaceC37284o("metrics-service/v1/metrics")
    Object uploadMetricsData(@InterfaceC37270a AbstractC34846v0 abstractC34846v0, @InterfaceC37278i("Content-Encoding") String str, @InterfaceC37278i("X-WHOOP-HW-Version") String str2, @InterfaceC37278i("X-WHOOP-FW-Version") String str3, @InterfaceC37278i("X-WHOOP-DSP-Version") String str4, @InterfaceC37278i("X-WHOOP-Strap-Id") String str5, @InterfaceC37278i("X-WHOOP-Binary-Version") int i13, @InterfaceC37278i("X-WHOOP-Binary-Flags") int i14, InterfaceC30057d<? super MetricsProcessedTime> interfaceC30057d);
}
