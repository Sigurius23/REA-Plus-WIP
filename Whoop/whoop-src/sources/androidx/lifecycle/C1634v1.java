package androidx.lifecycle;

import aa3.C0627i1;
import android.os.Bundle;
import c93.InterfaceC4339a;
import j93.InterfaceC21461d;
import java.util.ArrayList;
import p005a3.C0226m0;
import p399pb.InterfaceC29049f;
import p715kotlin.jvm.internal.AbstractC22676k;
import uf3.C34911a;
import vf3.InterfaceC35951a;
import xf3.C38266c;

/* JADX INFO: renamed from: androidx.lifecycle.v1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1634v1 extends AbstractC1560a {

    /* JADX INFO: renamed from: d */
    public final C38266c f6321d;

    /* JADX INFO: renamed from: e */
    public final C0627i1 f6322e;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1634v1(C38266c scope, C0627i1 c0627i1) {
        AbstractC22676k.m65750j(scope, "scope");
        InterfaceC29049f interfaceC29049f = (InterfaceC29049f) c0627i1.f2199f;
        if (interfaceC29049f == null) {
            throw new IllegalStateException("Can't create SavedStateViewModelFactory without a proper stateRegistryOwner");
        }
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) c0627i1.f2197d;
        super(interfaceC29049f, interfaceC4339a == null ? null : (Bundle) interfaceC4339a.invoke());
        this.f6321d = scope;
        this.f6322e = c0627i1;
    }

    @Override // androidx.lifecycle.AbstractC1560a
    /* JADX INFO: renamed from: b */
    public final AbstractC1637w1 mo4970b(String str, Class modelClass, C1601k1 c1601k1) {
        AbstractC22676k.m65750j(modelClass, "modelClass");
        C0627i1 c0627i1 = this.f6322e;
        InterfaceC4339a interfaceC4339a = (InterfaceC4339a) c0627i1.f2198e;
        C34911a c34911a = interfaceC4339a == null ? null : (C34911a) interfaceC4339a.invoke();
        if (c34911a == null) {
            c34911a = new C34911a(new ArrayList());
        }
        return (AbstractC1637w1) this.f6321d.m122602a(new C0226m0(1, c34911a, c1601k1), (InterfaceC21461d) c0627i1.f2195b, (InterfaceC35951a) c0627i1.f2196c);
    }
}
