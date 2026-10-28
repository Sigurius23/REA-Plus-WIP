package com.whoop.universalcheckout.features.shippingaddress.domain;

import com.whoop.network.request.HttpTimeoutConfig;
import com.whoop.network.request.PutApiRequest;
import com.whoop.universalcheckout.features.shippingaddress.domain.models.ShippingAddressRequestBody;
import i63.C18181t;
import java.util.Map;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sr2.AbstractC32943y;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0004HÖ\u0081\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, m65681d2 = {"Lcom/whoop/universalcheckout/features/shippingaddress/domain/PostShippingAddressRequest;", "Lcom/whoop/network/request/PutApiRequest;", "Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;", "cartId", "", "requestBody", "<init>", "(Ljava/lang/String;Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;)V", "getCartId", "()Ljava/lang/String;", "getRequestBody", "()Lcom/whoop/universalcheckout/features/shippingaddress/domain/models/ShippingAddressRequestBody;", "path", "getPath", "body", "getBody", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class PostShippingAddressRequest implements PutApiRequest<ShippingAddressRequestBody> {
    public static final int $stable = 0;
    private final ShippingAddressRequestBody body;
    private final String cartId;
    private final String path;
    private final ShippingAddressRequestBody requestBody;

    public PostShippingAddressRequest(String cartId, ShippingAddressRequestBody requestBody) {
        AbstractC22676k.m65750j(cartId, "cartId");
        AbstractC22676k.m65750j(requestBody, "requestBody");
        this.cartId = cartId;
        this.requestBody = requestBody;
        this.path = AbstractC11895b.m31996o("commerce-service/v2/mobile/carts/", cartId, "/shipping-address");
        this.body = requestBody;
    }

    public static /* synthetic */ PostShippingAddressRequest copy$default(PostShippingAddressRequest postShippingAddressRequest, String str, ShippingAddressRequestBody shippingAddressRequestBody, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = postShippingAddressRequest.cartId;
        }
        if ((i13 & 2) != 0) {
            shippingAddressRequestBody = postShippingAddressRequest.requestBody;
        }
        return postShippingAddressRequest.copy(str, shippingAddressRequestBody);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCartId() {
        return this.cartId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ShippingAddressRequestBody getRequestBody() {
        return this.requestBody;
    }

    public final PostShippingAddressRequest copy(String cartId, ShippingAddressRequestBody requestBody) {
        AbstractC22676k.m65750j(cartId, "cartId");
        AbstractC22676k.m65750j(requestBody, "requestBody");
        return new PostShippingAddressRequest(cartId, requestBody);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostShippingAddressRequest)) {
            return false;
        }
        PostShippingAddressRequest postShippingAddressRequest = (PostShippingAddressRequest) other;
        return AbstractC22676k.m65745e(this.cartId, postShippingAddressRequest.cartId) && AbstractC22676k.m65745e(this.requestBody, postShippingAddressRequest.requestBody);
    }

    public final String getCartId() {
        return this.cartId;
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

    public final ShippingAddressRequestBody getRequestBody() {
        return this.requestBody;
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public /* bridge */ String getTag() {
        return super.getTag();
    }

    public int hashCode() {
        return this.requestBody.hashCode() + (this.cartId.hashCode() * 31);
    }

    public String toString() {
        return "PostShippingAddressRequest(cartId=" + this.cartId + ", requestBody=" + this.requestBody + ")";
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public /* bridge */ String url(AbstractC32943y abstractC32943y) {
        return super.url(abstractC32943y);
    }

    @Override // com.whoop.network.request.PutApiRequest, z02.InterfaceC39944a
    public ShippingAddressRequestBody getBody() {
        return this.body;
    }
}
