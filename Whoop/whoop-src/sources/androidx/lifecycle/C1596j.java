package androidx.lifecycle;

import a20.C0162b;
import a30.C0332w0;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.C2996c2;
import hc3.AbstractC17182o;
import hc3.C17171d;
import java.util.concurrent.CancellationException;
import kc3.C22365e;
import p000.C12473e;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: androidx.lifecycle.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C1596j extends C1627t0 {

    /* JADX INFO: renamed from: b */
    public C0332w0 f6261b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final void m4996d(AbstractC32269c abstractC32269c) {
        C1592i c1592i;
        if (abstractC32269c instanceof C1592i) {
            c1592i = (C1592i) abstractC32269c;
            int i13 = c1592i.f6247y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c1592i.f6247y = i13 - Integer.MIN_VALUE;
            } else {
                c1592i = new C1592i(this, abstractC32269c);
            }
        } else {
            c1592i = new C1592i(this, abstractC32269c);
        }
        Object obj = c1592i.f6245w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c1592i.f6247y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
    }

    @Override // androidx.lifecycle.C1627t0, androidx.lifecycle.AbstractC1615p0
    public final void onActive() {
        super.onActive();
        C0332w0 c0332w0 = this.f6261b;
        if (c0332w0 != null) {
            C2996c2 c2996c2 = (C2996c2) c0332w0.f1166G;
            InterfaceC30057d interfaceC30057d = null;
            if (c2996c2 != null) {
                c2996c2.cancel((CancellationException) null);
            }
            c0332w0.f1166G = null;
            if (((C2996c2) c0332w0.f1165F) != null) {
                return;
            }
            c0332w0.f1165F = AbstractC3006f0.m8732z((C17171d) c0332w0.f1170z, null, null, new C12473e(c0332w0, interfaceC30057d, 7), 3);
        }
    }

    @Override // androidx.lifecycle.C1627t0, androidx.lifecycle.AbstractC1615p0
    public final void onInactive() {
        super.onInactive();
        C0332w0 c0332w0 = this.f6261b;
        if (c0332w0 != null) {
            if (((C2996c2) c0332w0.f1166G) != null) {
                throw new IllegalStateException("Cancel call cannot happen without a maybeRun");
            }
            C17171d c17171d = (C17171d) c0332w0.f1170z;
            C22365e c22365e = AbstractC3050q0.f12077a;
            c0332w0.f1166G = AbstractC3006f0.m8732z(c17171d, AbstractC17182o.f65999a.mo8825s(), null, new C0162b(c0332w0, null, 2), 2);
        }
    }
}
