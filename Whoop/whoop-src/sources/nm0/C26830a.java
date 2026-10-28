package nm0;

import ec3.InterfaceC13058l;
import ge3.AbstractC15751g;
import j93.AbstractC21478l0;
import j93.InterfaceC21456a0;
import ne3.C26624l;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import s63.C32236a;
import u02.AbstractC34390f;
import u02.C34387c;

/* JADX INFO: renamed from: nm0.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0007\"\u0004\b\u0000\u0010\u00062\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, m65681d2 = {"Lnm0/a;", "", "Lu02/c;", "apiClient", "<init>", "(Lu02/c;)V", "RequestBodyT", "Lec3/l;", "Lz02/a;", "requestFlow", "Ls63/a;", "requestBodyTypeInfo", "Lu02/g;", "Lne3/l;", "a", "(Lec3/l;Ls63/a;)Lec3/l;", "Lu02/c;", "cache_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26830a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C34387c apiClient;

    public C26830a(C34387c apiClient) {
        AbstractC22676k.m65750j(apiClient, "apiClient");
        this.apiClient = apiClient;
    }

    /* JADX INFO: renamed from: a */
    public final <RequestBodyT> InterfaceC13058l m80064a(InterfaceC13058l requestFlow, C32236a requestBodyTypeInfo) {
        AbstractC22676k.m65750j(requestFlow, "requestFlow");
        AbstractC22676k.m65750j(requestBodyTypeInfo, "requestBodyTypeInfo");
        C34387c c34387c = this.apiClient;
        InterfaceC21456a0 interfaceC21456a0M65691d = AbstractC22671h0.m65691d(C26624l.class);
        return AbstractC34390f.m108754b(requestFlow, c34387c, requestBodyTypeInfo, AbstractC15751g.m44445Y(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C26624l.class), interfaceC21456a0M65691d, AbstractC21478l0.m60396B(interfaceC21456a0M65691d)));
    }
}
