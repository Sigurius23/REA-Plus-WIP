package com.whoop.service.network;

import l83.InterfaceC23457c;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/service/network/UsersApi;", "", "", "getHealthReportUrl", "(Lq83/d;)Ljava/lang/Object;", "", "generateHealthReport", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC23457c
public interface UsersApi {
    @InterfaceC37284o("coaching-service/v1/health/report")
    Object generateHealthReport(InterfaceC30057d<? super Integer> interfaceC30057d);

    @InterfaceC37275f("coaching-service/v1/health/report")
    Object getHealthReportUrl(InterfaceC30057d<? super String> interfaceC30057d);
}
