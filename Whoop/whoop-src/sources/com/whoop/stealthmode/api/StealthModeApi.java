package com.whoop.stealthmode.api;

import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37288s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u0010\u0010\rJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u0011\u0010\r¨\u0006\u0012À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/stealthmode/api/StealthModeApi;", "", "Lcom/whoop/stealthmode/api/StealthModeEnabled;", "isStealthModeEnabled", "", "toggleStealthMode", "(Lcom/whoop/stealthmode/api/StealthModeEnabled;Lq83/d;)Ljava/lang/Object;", "getStealthModeStatus", "(Lq83/d;)Ljava/lang/Object;", "", "metricType", "Lcom/whoop/stealthmode/api/HiddenMetricsResponse;", "getHiddenMetric", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lpg3/v0;", "Ll83/a0;", "updateHiddenMetric", "deleteHiddenMetric", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface StealthModeApi {
    @InterfaceC37271b("/users-service/v1/hidden-metrics/{metricType}")
    Object deleteHiddenMetric(@InterfaceC37288s("metricType") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37275f("/users-service/v1/hidden-metrics/{metricType}")
    Object getHiddenMetric(@InterfaceC37288s("metricType") String str, InterfaceC30057d<? super HiddenMetricsResponse> interfaceC30057d);

    @InterfaceC37275f("/users-service/v1/stealth-mode")
    Object getStealthModeStatus(InterfaceC30057d<? super Boolean> interfaceC30057d);

    @InterfaceC37285p("/users-service/v1/stealth-mode")
    Object toggleStealthMode(@InterfaceC37270a StealthModeEnabled stealthModeEnabled, InterfaceC30057d<? super Boolean> interfaceC30057d);

    @InterfaceC37284o("/users-service/v1/hidden-metrics/{metricType}")
    Object updateHiddenMetric(@InterfaceC37288s("metricType") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
