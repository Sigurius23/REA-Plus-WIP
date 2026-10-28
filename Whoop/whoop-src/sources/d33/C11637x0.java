package d33;

import e33.C12645n;
import ec3.C13045h2;
import ec3.InterfaceC13062m;
import java.util.Set;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: d33.x0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11637x0 implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C11602h1 f37587w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Set f37588x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Set f37589y;

    public C11637x0(C11602h1 c11602h1, Set set, Set set2) {
        this.f37587w = c11602h1;
        this.f37588x = set;
        this.f37589y = set2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ec3.InterfaceC13062m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object emit(C12645n c12645n, InterfaceC30057d interfaceC30057d) {
        C11635w0 c11635w0;
        C13045h2 c13045h2;
        if (interfaceC30057d instanceof C11635w0) {
            c11635w0 = (C11635w0) interfaceC30057d;
            int i13 = c11635w0.f37584y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c11635w0.f37584y = i13 - Integer.MIN_VALUE;
            } else {
                c11635w0 = new C11635w0(this, interfaceC30057d);
            }
        } else {
            c11635w0 = new C11635w0(this, interfaceC30057d);
        }
        Object obj = c11635w0.f37582w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c11635w0.f37584y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw AbstractC2875y.m8309v(obj);
        }
        AbstractC34132o.m107864I(obj);
        if (c12645n == null || (c13045h2 = c12645n.f43279s) == null) {
            return C23454a0.f92919a;
        }
        C11633v0 c11633v0 = new C11633v0(this.f37587w, this.f37588x, this.f37589y);
        c11635w0.f37584y = 1;
        c13045h2.collect(c11633v0, c11635w0);
        return enumC31071a;
    }
}
