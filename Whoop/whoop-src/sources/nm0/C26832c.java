package nm0;

import java.util.Set;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import sr2.AbstractC32943y;
import z02.InterfaceC39944a;

/* JADX INFO: renamed from: nm0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0010¨\u0006 "}, m65681d2 = {"Lnm0/c;", "RequestT", "", "Lz02/a;", "apiRequest", "", "", "scopes", "uri", "<init>", "(Lz02/a;Ljava/util/Set;Ljava/lang/String;)V", "Lsr2/y;", "baseProvider", "d", "(Lsr2/y;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz02/a;", "()Lz02/a;", "b", "Ljava/util/Set;", "()Ljava/util/Set;", "c", "Ljava/lang/String;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C26832c<RequestT> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC39944a<RequestT> apiRequest;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Set<String> scopes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final String uri;

    public C26832c(InterfaceC39944a<RequestT> apiRequest, Set<String> scopes, String str) {
        AbstractC22676k.m65750j(apiRequest, "apiRequest");
        AbstractC22676k.m65750j(scopes, "scopes");
        this.apiRequest = apiRequest;
        this.scopes = scopes;
        this.uri = str;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC39944a<RequestT> m80074a() {
        return this.apiRequest;
    }

    /* JADX INFO: renamed from: b */
    public final Set<String> m80075b() {
        return this.scopes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* JADX INFO: renamed from: d */
    public final String m80077d(AbstractC32943y baseProvider) {
        AbstractC22676k.m65750j(baseProvider, "baseProvider");
        String str = this.uri;
        return str == null ? this.apiRequest.url(baseProvider) : str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C26832c)) {
            return false;
        }
        C26832c c26832c = (C26832c) other;
        return AbstractC22676k.m65745e(this.apiRequest, c26832c.apiRequest) && AbstractC22676k.m65745e(this.scopes, c26832c.scopes) && AbstractC22676k.m65745e(this.uri, c26832c.uri);
    }

    public int hashCode() {
        int iM73368a = AbstractC25012a.m73368a(this.scopes, this.apiRequest.hashCode() * 31, 31);
        String str = this.uri;
        return iM73368a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        InterfaceC39944a<RequestT> interfaceC39944a = this.apiRequest;
        Set<String> set = this.scopes;
        String str = this.uri;
        StringBuilder sb4 = new StringBuilder("CachableRequest(apiRequest=");
        sb4.append(interfaceC39944a);
        sb4.append(", scopes=");
        sb4.append(set);
        sb4.append(", uri=");
        return AbstractC25012a.m73376i(str, ")", sb4);
    }
}
