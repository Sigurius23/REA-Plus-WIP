package b63;

import a63.C0479c;
import a63.C0493j;
import a63.InterfaceC0500q;
import e63.C12777f;
import f63.C14154b;
import o63.C27610a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import v53.C35709c;

/* JADX INFO: renamed from: b63.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C2765c implements InterfaceC0500q {
    @Override // a63.InterfaceC0500q
    /* JADX INFO: renamed from: a */
    public final Object mo1197a(Function1 function1) {
        C2764b c2764b = new C2764b();
        function1.invoke(c2764b);
        return new C2768f(c2764b.f10892b, c2764b.f10891a);
    }

    @Override // a63.InterfaceC0500q
    /* JADX INFO: renamed from: b */
    public final void mo1198b(Object obj, C35709c scope) {
        C2768f plugin = (C2768f) obj;
        AbstractC22676k.m65750j(plugin, "plugin");
        AbstractC22676k.m65750j(scope, "scope");
        InterfaceC30057d interfaceC30057d = null;
        scope.f151925E.m95533f(C12777f.f43724i, new C0479c(plugin, interfaceC30057d, 3));
        scope.f151926F.m95533f(C14154b.f51000l, new C0493j(plugin, false, interfaceC30057d, 4));
    }

    @Override // a63.InterfaceC0500q
    public final C27610a getKey() {
        return C2768f.f10903d;
    }
}
