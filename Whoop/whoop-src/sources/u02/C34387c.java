package u02;

import a63.C0486f0;
import a63.C0488g0;
import a63.C0490h0;
import androidx.room.C1849z1;
import com.whoop.network.request.HttpTimeoutConfig;
import e63.AbstractC12779h;
import e63.C12774c;
import e63.C12775d;
import f63.AbstractC14155c;
import f63.C14162j;
import i63.AbstractC18158a0;
import i63.AbstractC18159b;
import i63.AbstractC18179r;
import i63.C18163d;
import i63.C18175n;
import i63.C18181t;
import j63.C21384a;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import o63.C27610a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import rq0.C31703x;
import s63.C32236a;
import sr2.AbstractC32943y;
import v53.C35709c;
import y53.AbstractC39245e;
import z02.InterfaceC39944a;

/* JADX INFO: renamed from: u02.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ,\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"Lu02/c;", "", "Lsr2/y;", "baseUrlProvider", "Lv53/c;", "httpClient", "<init>", "(Lsr2/y;Lv53/c;)V", "Le63/d;", "Lcom/whoop/network/request/HttpTimeoutConfig;", "config", "Ll83/a0;", "b", "(Le63/d;Lcom/whoop/network/request/HttpTimeoutConfig;)V", "RequestBodyT", "Lz02/a;", "request", "Ls63/a;", "requestBodyTypeInfo", "Lf63/c;", "d", "(Lz02/a;Ls63/a;Lq83/d;)Ljava/lang/Object;", "a", "Lsr2/y;", "Lv53/c;", "network_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34387c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC32943y baseUrlProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C35709c httpClient;

    public C34387c(AbstractC32943y baseUrlProvider, C35709c httpClient) {
        AbstractC22676k.m65750j(baseUrlProvider, "baseUrlProvider");
        AbstractC22676k.m65750j(httpClient, "httpClient");
        this.baseUrlProvider = baseUrlProvider;
        this.httpClient = httpClient;
    }

    /* JADX INFO: renamed from: b */
    private final void m108746b(C12775d c12775d, HttpTimeoutConfig httpTimeoutConfig) {
        C31703x c31703x = new C31703x(httpTimeoutConfig, 24);
        AbstractC22676k.m65750j(c12775d, "<this>");
        C0488g0 c0488g0 = C0490h0.f1652d;
        C0486f0 c0486f0 = new C0486f0();
        c31703x.invoke(c0486f0);
        ((Map) c12775d.f43714f.m83373a(AbstractC39245e.f168745a, C12774c.f43708w)).put(C0490h0.f1652d, c0486f0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m108747c(HttpTimeoutConfig httpTimeoutConfig, C0486f0 timeout) {
        AbstractC22676k.m65750j(timeout, "$this$timeout");
        Long lValueOf = httpTimeoutConfig.getConnectTimeoutMillis() == 0 ? null : Long.valueOf(httpTimeoutConfig.getConnectTimeoutMillis());
        C0486f0.m1200a(lValueOf);
        timeout.f1646b = lValueOf;
        Long lValueOf2 = httpTimeoutConfig.getSocketTimeoutMillis() == 0 ? null : Long.valueOf(httpTimeoutConfig.getSocketTimeoutMillis());
        C0486f0.m1200a(lValueOf2);
        timeout.f1647c = lValueOf2;
        Long lValueOf3 = httpTimeoutConfig.getRequestTimeoutMillis() != 0 ? Long.valueOf(httpTimeoutConfig.getRequestTimeoutMillis()) : null;
        C0486f0.m1200a(lValueOf3);
        timeout.f1645a = lValueOf3;
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: d */
    public final <RequestBodyT> Object m108748d(InterfaceC39944a<RequestBodyT> interfaceC39944a, C32236a bodyType, InterfaceC30057d<? super AbstractC14155c> interfaceC30057d) {
        String urlString = interfaceC39944a.url(this.baseUrlProvider);
        C35709c c35709c = this.httpClient;
        C12775d c12775d = new C12775d();
        AbstractC22676k.m65750j(urlString, "urlString");
        AbstractC18158a0.m52160b(c12775d.f43709a, urlString);
        C18181t method = interfaceC39944a.getMethod();
        AbstractC22676k.m65750j(method, "<set-?>");
        c12775d.f43710b = method;
        boolean hasBody = interfaceC39944a.getHasBody();
        C18175n c18175n = c12775d.f43711c;
        if (hasBody) {
            C18163d type = AbstractC18159b.f70468a;
            AbstractC22676k.m65750j(type, "type");
            List list = AbstractC18179r.f70507a;
            String value = type.toString();
            c18175n.getClass();
            AbstractC22676k.m65750j(value, "value");
            c18175n.mo2418F0(value);
            List listM2425v0 = c18175n.m2425v0("Content-Type");
            listM2425v0.clear();
            listM2425v0.add(value);
            Object body = interfaceC39944a.getBody();
            C27610a c27610a = AbstractC12779h.f43741a;
            AbstractC22676k.m65750j(bodyType, "bodyType");
            if (body == null) {
                body = C21384a.f81810a;
            }
            c12775d.f43712d = body;
            c12775d.m35804a(bodyType);
        }
        for (Map.Entry<String, String> entry : interfaceC39944a.getHeaders().entrySet()) {
            c18175n.m2422s0(entry.getKey(), entry.getValue());
        }
        String tag = interfaceC39944a.getTag();
        if (tag != null) {
            c18175n.m2422s0("X-Request-Tag", tag);
        }
        HttpTimeoutConfig httpTimeoutConfig = interfaceC39944a.getHttpTimeoutConfig();
        if (httpTimeoutConfig != null) {
            m108746b(c12775d, httpTimeoutConfig);
        }
        return new C14162j(c12775d, c35709c).m40347b(new C1849z1(2, null), interfaceC30057d);
    }
}
