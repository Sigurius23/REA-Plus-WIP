package com.whoop.removeDeviceConfig.domain;

import com.whoop.removeDeviceConfig.domain.dto.PropertyValuesInfo;
import java.util.List;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/removeDeviceConfig/domain/RemoteDeviceConfigApi;", "", "", "target", "Lpg3/v0;", "", "Lcom/whoop/removeDeviceConfig/domain/dto/PropertyValuesInfo;", "getPropertyValuesForUser", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "remote-device-config_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface RemoteDeviceConfigApi {
    @InterfaceC37275f("device-config/v1/value")
    Object getPropertyValuesForUser(@InterfaceC37289t("target") String str, InterfaceC30057d<? super C29218v0<List<PropertyValuesInfo>>> interfaceC30057d);
}
