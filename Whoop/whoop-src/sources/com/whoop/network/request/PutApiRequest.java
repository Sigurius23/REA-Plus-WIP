package com.whoop.network.request;

import i63.C18181t;
import java.util.Map;
import p715kotlin.Metadata;
import sr2.AbstractC32943y;
import z02.InterfaceC39944a;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u000bÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/network/request/PutApiRequest;", "T", "Lz02/a;", "Li63/t;", "getMethod", "()Li63/t;", "method", "", "getHasBody", "()Z", "hasBody", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface PutApiRequest<T> extends InterfaceC39944a<T> {
    @Override // z02.InterfaceC39944a
    /* synthetic */ Object getBody();

    @Override // z02.InterfaceC39944a
    default boolean getHasBody() {
        return true;
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
        return C18181t.f70510d;
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
