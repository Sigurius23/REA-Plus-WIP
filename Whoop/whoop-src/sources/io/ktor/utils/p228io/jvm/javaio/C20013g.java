package io.ktor.utils.p228io.jvm.javaio;

import bc3.InterfaceC3027k1;
import ge3.AbstractC15751g;
import io.ktor.utils.p228io.C20020m;
import io.ktor.utils.p228io.InterfaceC20024q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: io.ktor.utils.io.jvm.javaio.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C20013g extends AbstractC20008b {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C20014h f75095g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20013g(InterfaceC3027k1 interfaceC3027k1, C20014h c20014h) {
        super(interfaceC3027k1);
        this.f75095g = c20014h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // io.ktor.utils.p228io.jvm.javaio.AbstractC20008b
    /* JADX INFO: renamed from: a */
    public final Object mo55813a(AbstractC32269c abstractC32269c) throws Throwable {
        C20012f c20012f;
        int iIntValue;
        C20013g c20013g;
        Object obj;
        InterfaceC30057d interfaceC30057dM44424D;
        if (abstractC32269c instanceof C20012f) {
            c20012f = (C20012f) abstractC32269c;
            int i13 = c20012f.f75094z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c20012f.f75094z = i13 - Integer.MIN_VALUE;
            } else {
                c20012f = new C20012f(this, abstractC32269c);
            }
        } else {
            c20012f = new C20012f(this, abstractC32269c);
        }
        Object objM55854s = c20012f.f75092x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c20012f.f75094z;
        if (i14 != 0) {
            if (i14 == 1) {
                c20013g = c20012f.f75091w;
                AbstractC34132o.m107864I(objM55854s);
                AbstractC22676k.m65748h(objM55854s, "null cannot be cast to non-null type kotlin.ByteArray");
                InterfaceC20024q interfaceC20024q = c20013g.f75095g.f75096w;
                int i15 = c20013g.f75084d;
                int i16 = c20013g.f75085e;
                c20012f.f75091w = c20013g;
                c20012f.f75094z = 2;
                objM55854s = ((C20020m) interfaceC20024q).m55854s((byte[]) objM55854s, i15, i16, c20012f);
                if (objM55854s == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c20013g = c20012f.f75091w;
                AbstractC34132o.m107864I(objM55854s);
            }
            iIntValue = ((Number) objM55854s).intValue();
            if (iIntValue == -1) {
                c20013g.f75095g.f75097x.complete();
                c20013g.result = iIntValue;
                return C23454a0.f92919a;
            }
        } else {
            AbstractC34132o.m107864I(objM55854s);
            iIntValue = 0;
            c20013g = this;
        }
        c20013g.result = iIntValue;
        c20012f.f75091w = c20013g;
        c20012f.f75094z = 1;
        Object obj2 = null;
        while (true) {
            Object obj3 = c20013g.state;
            if (obj3 instanceof Thread) {
                interfaceC30057dM44424D = AbstractC15751g.m44424D(c20012f);
                obj = obj3;
            } else {
                if (!AbstractC22676k.m65745e(obj3, c20013g)) {
                    throw new IllegalStateException("Already suspended or in finished state");
                }
                obj = obj2;
                interfaceC30057dM44424D = AbstractC15751g.m44424D(c20012f);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AbstractC20008b.f75080f;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(c20013g, obj3, interfaceC30057dM44424D)) {
                    if (obj != null) {
                        InterfaceC20015i interfaceC20015i = (InterfaceC20015i) AbstractC20016j.f75100a.get();
                        if (interfaceC20015i == null) {
                            interfaceC20015i = C20011e.f75088b;
                        }
                        interfaceC20015i.mo55817b(obj);
                    }
                    EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                    return enumC31071a;
                }
            } while (atomicReferenceFieldUpdater.get(c20013g) == obj3);
            obj2 = obj;
        }
    }
}
