package com.whoop.nativestore.pdp.domain.api;

import com.whoop.nativestore.pdp.domain.model.ProductDescriptionPageResponse;
import com.whoop.nativestore.pdp.domain.model.ProductSizeGuideResponse;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J2\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/nativestore/pdp/domain/api/PdpApi;", "", "", "slug", "sku", "source", "Lcom/whoop/nativestore/pdp/domain/model/ProductDescriptionPageResponse;", "getProductDescriptionPage", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "key", "Lcom/whoop/nativestore/pdp/domain/model/ProductSizeGuideResponse;", "getSizeGuide", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface PdpApi {
    @InterfaceC37275f("commerce-service/v1/mobile/shop/pdp")
    Object getProductDescriptionPage(@InterfaceC37289t("slug") String str, @InterfaceC37289t("sku") String str2, @InterfaceC37289t("source") String str3, InterfaceC30057d<? super ProductDescriptionPageResponse> interfaceC30057d);

    @InterfaceC37275f("commerce-service/v1/mobile/shop/size-guide")
    Object getSizeGuide(@InterfaceC37289t("key") String str, InterfaceC30057d<? super ProductSizeGuideResponse> interfaceC30057d);
}
