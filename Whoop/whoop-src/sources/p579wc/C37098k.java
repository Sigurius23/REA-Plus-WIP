package p579wc;

import io.getstream.chat.android.client.api.interceptor.TokenAuthInterceptor;
import l83.C23454a0;
import p091dg.C12002a;
import p522uf.InterfaceC34885l;
import p551vf.C35937b;
import p715kotlin.jvm.internal.AbstractC22676k;
import s93.AbstractC32306h;

/* JADX INFO: renamed from: wc.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C37098k implements InterfaceC34885l {

    /* JADX INFO: renamed from: a */
    public final String f158707a;

    public C37098k(String str) {
        this.f158707a = str;
    }

    @Override // p522uf.InterfaceC34885l
    /* JADX INFO: renamed from: a */
    public final C35937b mo32257a(C12002a context, Object obj) {
        C23454a0 input = (C23454a0) obj;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(input, "input");
        C35937b c35937b = new C35937b();
        c35937b.f153016x.getClass();
        AbstractC32306h.m100568q(c35937b, "Accept", "application/json");
        AbstractC32306h.m100568q(c35937b, "Accept-Encoding", "identity");
        String str = this.f158707a;
        if (str != null) {
            AbstractC32306h.m100568q(c35937b, TokenAuthInterceptor.AUTH_HEADER, str);
        }
        return c35937b;
    }
}
