package a63;

import o63.C27610a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import v53.C35709c;
import y53.InterfaceC39244d;

/* JADX INFO: renamed from: a63.g0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0488g0 implements InterfaceC0500q, InterfaceC39244d {
    @Override // a63.InterfaceC0500q
    /* JADX INFO: renamed from: a */
    public final Object mo1197a(Function1 function1) {
        C0486f0 c0486f0 = new C0486f0();
        function1.invoke(c0486f0);
        return new C0490h0(c0486f0.f1645a, c0486f0.f1646b, c0486f0.f1647c);
    }

    @Override // a63.InterfaceC0500q
    /* JADX INFO: renamed from: b */
    public final void mo1198b(Object obj, C35709c scope) {
        C0490h0 plugin = (C0490h0) obj;
        AbstractC22676k.m65750j(plugin, "plugin");
        AbstractC22676k.m65750j(scope, "scope");
        C0475a c0475a = C0484e0.f1639b;
        C0484e0 c0484e0 = (C0484e0) AbstractC0501r.m1207a(scope);
        c0484e0.f1641a.add(new C0506w(plugin, scope, null, 2));
    }

    @Override // a63.InterfaceC0500q
    public final C27610a getKey() {
        return C0490h0.f1653e;
    }
}
