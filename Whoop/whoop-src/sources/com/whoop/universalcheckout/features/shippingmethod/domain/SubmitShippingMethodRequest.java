package com.whoop.universalcheckout.features.shippingmethod.domain;

import com.whoop.network.request.HttpTimeoutConfig;
import com.whoop.network.request.PutApiRequest;
import com.whoop.universalcheckout.features.shippingmethod.domain.models.SubmitShippingMethodRequestBody;
import i63.C18181t;
import java.util.Map;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sr2.AbstractC32943y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/shippingmethod/domain/SubmitShippingMethodRequest;", "Lcom/whoop/network/request/PutApiRequest;", "Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/SubmitShippingMethodRequestBody;", "cartId", "", "body", "<init>", "(Ljava/lang/String;Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/SubmitShippingMethodRequestBody;)V", "getBody", "()Lcom/whoop/universalcheckout/features/shippingmethod/domain/models/SubmitShippingMethodRequestBody;", "path", "getPath", "()Ljava/lang/String;", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SubmitShippingMethodRequest implements PutApiRequest<SubmitShippingMethodRequestBody> {
    public static final int $stable = 0;
    private final SubmitShippingMethodRequestBody body;
    private final String cartId;
    private final String path;

    public SubmitShippingMethodRequest(String cartId, SubmitShippingMethodRequestBody body) {
        AbstractC22676k.m65750j(cartId, "cartId");
        AbstractC22676k.m65750j(body, "body");
        this.cartId = cartId;
        this.body = body;
        this.path = AbstractC11895b.m31996o("commerce-service/v2/mobile/carts/", cartId, "/shipping-method");
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public /* bridge */ boolean getHasBody() {
        return super.getHasBody();
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public /* bridge */ Map<String, String> getHeaders() {
        return super.getHeaders();
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public /* bridge */ HttpTimeoutConfig getHttpTimeoutConfig() {
        return super.getHttpTimeoutConfig();
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public /* bridge */ C18181t getMethod() {
        return super.getMethod();
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public /* bridge */ Map<String, String> getParameters() {
        return super.getParameters();
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public String getPath() {
        return this.path;
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public /* bridge */ String getTag() {
        return super.getTag();
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public /* bridge */ String url(AbstractC32943y abstractC32943y) {
        return super.url(abstractC32943y);
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public SubmitShippingMethodRequestBody getBody() {
        return this.body;
    }
}
