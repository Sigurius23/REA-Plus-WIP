package lf3;

import aa3.C0627i1;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.InterfaceC1563a2;
import c93.InterfaceC4339a;
import j93.InterfaceC21461d;
import p715kotlin.jvm.internal.AbstractC22676k;
import vf3.InterfaceC35951a;
import xf3.C38266c;

/* JADX INFO: renamed from: lf3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C24021a implements InterfaceC1563a2 {

    /* JADX INFO: renamed from: a */
    public final C38266c f94883a;

    /* JADX INFO: renamed from: b */
    public final C0627i1 f94884b;

    public C24021a(C38266c scope, C0627i1 c0627i1) {
        AbstractC22676k.m65750j(scope, "scope");
        this.f94883a = scope;
        this.f94884b = c0627i1;
    }

    @Override // androidx.lifecycle.InterfaceC1563a2
    public final AbstractC1637w1 create(Class modelClass) {
        AbstractC22676k.m65750j(modelClass, "modelClass");
        C0627i1 c0627i1 = this.f94884b;
        InterfaceC21461d interfaceC21461d = (InterfaceC21461d) c0627i1.f2195b;
        InterfaceC35951a interfaceC35951a = (InterfaceC35951a) c0627i1.f2196c;
        return (AbstractC1637w1) this.f94883a.m122602a((InterfaceC4339a) c0627i1.f2198e, interfaceC21461d, interfaceC35951a);
    }
}
