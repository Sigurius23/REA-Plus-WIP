package l83;

import bd3.C3111a0;
import hm.C17417d;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: l83.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC23453a {

    /* JADX INFO: renamed from: a */
    public static final EnumC31071a f92918a = EnumC31071a.f128113w;

    /* JADX INFO: renamed from: a */
    public static final Object m68035a(C17417d c17417d) {
        C3111a0 c3111a0 = (C3111a0) c17417d.f67507x;
        C23455b c23455b = new C23455b();
        c23455b.f92920w = c3111a0;
        c23455b.f92921x = c23455b;
        EnumC31071a enumC31071a = f92918a;
        c23455b.f92922y = enumC31071a;
        while (true) {
            Object obj = c23455b.f92922y;
            InterfaceC30057d interfaceC30057d = c23455b.f92921x;
            if (interfaceC30057d == null) {
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            if (AbstractC22676k.m65745e(enumC31071a, obj)) {
                try {
                    C3111a0 c3111a1 = c23455b.f92920w;
                    AbstractC22681m0.m65774e(3, c3111a1);
                    C3111a0 c3111a2 = new C3111a0(c3111a1.f12216z, interfaceC30057d);
                    c3111a2.f12215y = c23455b;
                    Object objInvokeSuspend = c3111a2.invokeSuspend(C23454a0.f92919a);
                    if (objInvokeSuspend != EnumC31071a.f128113w) {
                        interfaceC30057d.resumeWith(objInvokeSuspend);
                    }
                } catch (Throwable th3) {
                    interfaceC30057d.resumeWith(AbstractC34132o.m107888l(th3));
                }
            } else {
                c23455b.f92922y = enumC31071a;
                interfaceC30057d.resumeWith(obj);
            }
        }
    }
}
