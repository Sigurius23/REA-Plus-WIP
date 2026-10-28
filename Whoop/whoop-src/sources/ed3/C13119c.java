package ed3;

import dd3.C11972a;
import p522uf.AbstractC34870c0;
import p715kotlin.jvm.internal.AbstractC22676k;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: ed3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C13119c extends C13129m {

    /* JADX INFO: renamed from: k */
    public final long f45387k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13119c(C11972a c11972a, C13131o c13131o, long j7, InterfaceC39443g descriptor) {
        super(c11972a, c13131o, descriptor);
        AbstractC22676k.m65750j(descriptor, "descriptor");
        this.f45387k = j7;
    }

    @Override // ed3.C13129m
    /* JADX INFO: renamed from: T */
    public final long mo36721T(InterfaceC39443g interfaceC39443g, int i13) {
        AbstractC22676k.m65750j(interfaceC39443g, "<this>");
        int i14 = i13 % 2;
        long j7 = this.f45387k;
        if (i14 == 0) {
            return AbstractC34870c0.m109983S(j7).f39321w | ((long) 1);
        }
        return ((long) 2) | AbstractC34870c0.m109983S(j7).f39321w;
    }
}
