package ed3;

import dd3.C11972a;
import e10.C12554k0;
import p522uf.AbstractC34870c0;
import p715kotlin.jvm.internal.AbstractC22676k;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: ed3.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C13120d extends C13121e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13120d(long j7, C11972a proto, C12554k0 parentWriter, InterfaceC39443g descriptor) {
        super(j7, proto, parentWriter, descriptor);
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC22676k.m65750j(parentWriter, "parentWriter");
        AbstractC22676k.m65750j(descriptor, "descriptor");
    }

    @Override // ed3.C13121e, ed3.C13130n
    /* JADX INFO: renamed from: Q */
    public final long mo36722Q(InterfaceC39443g interfaceC39443g, int i13) {
        AbstractC22676k.m65750j(interfaceC39443g, "<this>");
        int i14 = i13 % 2;
        long j7 = this.f45389h;
        if (i14 == 0) {
            return AbstractC34870c0.m109983S(j7).f39321w | ((long) 1);
        }
        return ((long) 2) | AbstractC34870c0.m109983S(j7).f39321w;
    }
}
