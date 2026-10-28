package com.whoop.labradorService.network;

import com.whoop.labradorService.domain.LabradorProcessedTimeDto;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import ud3.AbstractC34846v0;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37278i;
import wg3.InterfaceC37284o;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\\\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/labradorService/network/LabradorNetworkApi;", "", "Lud3/v0;", "body", "", "encoding", "strapId", "hardwareVersion", "firmwareVersion", "", "binaryVersion", "contentLength", "Lpg3/v0;", "Lcom/whoop/labradorService/domain/LabradorProcessedTimeDto;", "uploadEcgData", "(Lud3/v0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lq83/d;)Ljava/lang/Object;", "labrador-service_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface LabradorNetworkApi {
    @InterfaceC37284o("ecg-service/v1/ecg/metric/mobile")
    Object uploadEcgData(@InterfaceC37270a AbstractC34846v0 abstractC34846v0, @InterfaceC37278i("Content-Encoding") String str, @InterfaceC37278i("X-WHOOP-Strap-Id") String str2, @InterfaceC37278i("X-WHOOP-HW-Version") String str3, @InterfaceC37278i("X-WHOOP-FW-Version") String str4, @InterfaceC37278i("X-WHOOP-Binary-Version") int i13, @InterfaceC37278i("Content-Length") String str5, InterfaceC30057d<? super C29218v0<LabradorProcessedTimeDto>> interfaceC30057d);
}
