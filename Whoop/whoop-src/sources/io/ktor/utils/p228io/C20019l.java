package io.ktor.utils.p228io;

import ge3.AbstractC15751g;
import hc3.AbstractC17176i;
import io.ktor.utils.p228io.internal.C19993c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l83.C23454a0;
import p477s2.AbstractC32073e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import se.AbstractC32411b;

/* JADX INFO: renamed from: io.ktor.utils.io.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C20019l extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f75107w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C20020m f75108x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C20019l(C20020m c20020m, int i13) {
        super(1);
        this.f75107w = i13;
        this.f75108x = c20020m;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f75107w) {
            case 0:
                InterfaceC30057d ucont = (InterfaceC30057d) obj;
                AbstractC22676k.m65750j(ucont, "ucont");
                int i13 = this.f75108x.writeSuspensionSize;
                while (true) {
                    C19993c c19993cM55819a = C20020m.m55819a(this.f75108x);
                    if (c19993cM55819a != null) {
                        AbstractC32073e.m99753l(c19993cM55819a.m55792a());
                        throw null;
                    }
                    if (this.f75108x.m55839R(i13)) {
                        C20020m c20020m = this.f75108x;
                        InterfaceC30057d interfaceC30057dM44424D = AbstractC15751g.m44424D(ucont);
                        C20020m c20020m2 = this.f75108x;
                        while (true) {
                            if (((InterfaceC30057d) c20020m._writeOp) != null) {
                                throw new IllegalStateException("Operation is already in progress");
                            }
                            if (!c20020m2.m55839R(i13)) {
                            }
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C20020m.f75112m;
                            if (AbstractC17176i.m48523y(atomicReferenceFieldUpdater, c20020m, interfaceC30057dM44424D)) {
                                if (!c20020m2.m55839R(i13) && AbstractC17176i.m48524z(atomicReferenceFieldUpdater, c20020m, interfaceC30057dM44424D)) {
                                }
                                break;
                            }
                            break;
                        }
                    } else {
                        ucont.resumeWith(C23454a0.f92919a);
                    }
                    this.f75108x.m55847k(i13);
                    return EnumC31071a.f128113w;
                }
            case 1:
                Throwable th3 = (Throwable) obj;
                C20020m c20020m3 = this.f75108x;
                c20020m3.attachedJob = null;
                if (th3 != null) {
                    c20020m3.m55845i(AbstractC32411b.m101094f0(th3));
                }
                return C23454a0.f92919a;
            default:
                this.f75108x.m55845i((Throwable) obj);
                return C23454a0.f92919a;
        }
    }
}
