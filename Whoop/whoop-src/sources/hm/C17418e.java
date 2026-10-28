package hm;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import gm.C15990r;
import java.util.HashMap;
import p078d1.C11457j;
import pm.InterfaceC29353a;

/* JADX INFO: renamed from: hm.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C17418e {

    /* JADX INFO: renamed from: a */
    public final C11457j f67508a;

    /* JADX INFO: renamed from: b */
    public final C15990r f67509b;

    /* JADX INFO: renamed from: c */
    public final HashMap f67510c;

    public C17418e(Context context, C15990r c15990r) {
        C11457j c11457j = new C11457j(context, 15);
        this.f67510c = new HashMap();
        this.f67508a = c11457j;
        this.f67509b = c15990r;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized InterfaceC17419f m49437a(String str) {
        if (this.f67510c.containsKey(str)) {
            return (InterfaceC17419f) this.f67510c.get(str);
        }
        CctBackendFactory cctBackendFactoryM30752w = this.f67508a.m30752w(str);
        if (cctBackendFactoryM30752w == null) {
            return null;
        }
        C15990r c15990r = this.f67509b;
        InterfaceC17419f interfaceC17419fCreate = cctBackendFactoryM30752w.create(new C17415b((Context) c15990r.f60512x, (InterfaceC29353a) c15990r.f60513y, (InterfaceC29353a) c15990r.f60514z, str));
        this.f67510c.put(str, interfaceC17419fCreate);
        return interfaceC17419fCreate;
    }
}
