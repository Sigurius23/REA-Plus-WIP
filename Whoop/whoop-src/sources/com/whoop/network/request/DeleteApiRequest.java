package com.whoop.network.request;

import i63.C18181t;
import java.util.Map;
import l83.C23454a0;
import p715kotlin.Metadata;
import sr2.AbstractC32943y;
import z02.InterfaceC39944a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u000e\u0012\n\u0012\b\u0018\u00010\u0002j\u0002`\u00030\u0001R\u0014\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/network/request/DeleteApiRequest;", "Lz02/a;", "Ll83/a0;", "Lcom/whoop/network/request/NoRequestBody;", "Li63/t;", "getMethod", "()Li63/t;", "method", "", "getBody", "()Ljava/lang/Void;", "body", "", "getHasBody", "()Z", "hasBody", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface DeleteApiRequest extends InterfaceC39944a<C23454a0> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // z02.InterfaceC39944a
    default C23454a0 getBody() {
        return null;
    }

    @Override // z02.InterfaceC39944a
    default boolean getHasBody() {
        return false;
    }

    @Override // z02.InterfaceC39944a
    /* bridge */ /* synthetic */ default Map getHeaders() {
        return super.getHeaders();
    }

    @Override // z02.InterfaceC39944a
    /* bridge */ /* synthetic */ default HttpTimeoutConfig getHttpTimeoutConfig() {
        return super.getHttpTimeoutConfig();
    }

    @Override // z02.InterfaceC39944a
    default C18181t getMethod() {
        C18181t c18181t = C18181t.f70508b;
        return C18181t.f70512f;
    }

    @Override // z02.InterfaceC39944a
    /* bridge */ /* synthetic */ default Map getParameters() {
        return super.getParameters();
    }

    @Override // z02.InterfaceC39944a
    /* synthetic */ String getPath();

    @Override // z02.InterfaceC39944a
    /* bridge */ /* synthetic */ default String getTag() {
        return super.getTag();
    }

    @Override // z02.InterfaceC39944a
    /* bridge */ /* synthetic */ default String url(AbstractC32943y abstractC32943y) {
        return super.url(abstractC32943y);
    }
}
