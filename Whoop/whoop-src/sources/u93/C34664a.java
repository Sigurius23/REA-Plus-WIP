package u93;

import c93.InterfaceC4339a;
import dc3.C11934s;
import java.util.List;
import lb3.AbstractC23767d1;
import lb3.AbstractC23791o;
import lb3.C23784k0;
import lb3.InterfaceC23796q0;
import nb3.C26552i;
import nb3.C26555l;
import nb3.EnumC26554k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22707j;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;

/* JADX INFO: renamed from: u93.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C34664a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f146025w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC34666b f146026x;

    public /* synthetic */ C34664a(AbstractC34666b abstractC34666b, int i13) {
        this.f146025w = i13;
        this.f146026x = abstractC34666b;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f146025w;
        AbstractC34666b abstractC34666b = this.f146026x;
        switch (i13) {
            case 0:
                InterfaceC22712o interfaceC22712oMo60489K = abstractC34666b.mo60489K();
                C11934s c11934s = new C11934s(this, 14);
                C26552i c26552i = AbstractC23767d1.f94137a;
                if (C26555l.m78685f(abstractC34666b)) {
                    return C26555l.m78682c(EnumC26554k.UNABLE_TO_SUBSTITUTE_TYPE, abstractC34666b.toString());
                }
                InterfaceC23796q0 interfaceC23796q0Mo60496e = abstractC34666b.mo60496e();
                if (interfaceC23796q0Mo60496e == null) {
                    AbstractC23767d1.m69845a(12);
                    throw null;
                }
                if (interfaceC22712oMo60489K == null) {
                    AbstractC23767d1.m69845a(13);
                    throw null;
                }
                List listM69848d = AbstractC23767d1.m69848d(interfaceC23796q0Mo60496e.getParameters());
                C23784k0.f94165x.getClass();
                return AbstractC23791o.m69893l(C23784k0.f94166y, interfaceC23796q0Mo60496e, listM69848d, false, interfaceC22712oMo60489K, c11934s);
            case 1:
                return new C22707j(abstractC34666b.mo60489K());
            default:
                return new C34712y(abstractC34666b);
        }
    }
}
