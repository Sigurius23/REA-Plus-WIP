package com.whoop.advancedlabs.domain;

import com.whoop.advancedlabs.domain.models.RafReceiverResponse;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/GrowthContentApi;", "", "", "code", "Lcom/whoop/advancedlabs/domain/models/RafReceiverResponse;", "getRafReceiver", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface GrowthContentApi {
    @InterfaceC37275f("growth-content-service/v1/advanced-labs/raf-receiver")
    Object getRafReceiver(@InterfaceC37289t("code") String str, InterfaceC30057d<? super RafReceiverResponse> interfaceC30057d);
}
