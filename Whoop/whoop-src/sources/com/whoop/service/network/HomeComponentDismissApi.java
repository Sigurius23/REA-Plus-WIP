package com.whoop.service.network;

import com.whoop.service.network.model.DismissComponentRequestBody;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37285p;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/service/network/HomeComponentDismissApi;", "", "Lcom/whoop/service/network/model/DismissComponentRequestBody;", "body", "Lpg3/v0;", "Ll83/a0;", "dismissComponent", "(Lcom/whoop/service/network/model/DismissComponentRequestBody;Lq83/d;)Ljava/lang/Object;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface HomeComponentDismissApi {
    @InterfaceC37285p("user-preferences-service/v1/components/dismissals")
    Object dismissComponent(@InterfaceC37270a DismissComponentRequestBody dismissComponentRequestBody, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
