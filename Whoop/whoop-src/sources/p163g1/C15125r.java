package p163g1;

import androidx.compose.material.AnchoredDragFinishedSignal;
import bc3.AbstractC3006f0;
import bc3.EnumC2998d0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.InterfaceC13062m;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p316m1.C24892b;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: g1.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C15125r implements InterfaceC13062m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56673w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C22669g0 f56674x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC2994c0 f56675y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4351m f56676z;

    public /* synthetic */ C15125r(C22669g0 c22669g0, InterfaceC2994c0 interfaceC2994c0, InterfaceC4351m interfaceC4351m, int i13) {
        this.f56673w = i13;
        this.f56674x = c22669g0;
        this.f56675y = interfaceC2994c0;
        this.f56676z = interfaceC4351m;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0080  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // ec3.InterfaceC13062m
    public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
        C15115q c15115q;
        C24892b c24892b;
        switch (this.f56673w) {
            case 0:
                if (interfaceC30057d instanceof C15115q) {
                    c15115q = (C15115q) interfaceC30057d;
                    int i13 = c15115q.f56626E;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c15115q.f56626E = i13 - Integer.MIN_VALUE;
                    } else {
                        c15115q = new C15115q(this, interfaceC30057d);
                    }
                } else {
                    c15115q = new C15115q(this, interfaceC30057d);
                }
                Object obj2 = c15115q.f56629y;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c15115q.f56626E;
                C22669g0 c22669g0 = this.f56674x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) c22669g0.f89336w;
                    if (interfaceC3027k1 != null) {
                        interfaceC3027k1.cancel((CancellationException) new AnchoredDragFinishedSignal());
                        c15115q.f56627w = obj;
                        c15115q.f56628x = interfaceC3027k1;
                        c15115q.f56626E = 1;
                        if (interfaceC3027k1.join(c15115q) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = c15115q.f56627w;
                    AbstractC34132o.m107864I(obj2);
                }
                Object obj3 = obj;
                EnumC2998d0 enumC2998d0 = EnumC2998d0.f12007z;
                InterfaceC2994c0 interfaceC2994c0 = this.f56675y;
                c22669g0.f89336w = AbstractC3006f0.m8732z(interfaceC2994c0, null, enumC2998d0, new C15105p(this.f56676z, obj3, interfaceC2994c0, null, 0), 1);
                return C23454a0.f92919a;
            default:
                if (interfaceC30057d instanceof C24892b) {
                    c24892b = (C24892b) interfaceC30057d;
                    int i15 = c24892b.f97512E;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        c24892b.f97512E = i15 - Integer.MIN_VALUE;
                    } else {
                        c24892b = new C24892b(this, interfaceC30057d);
                    }
                } else {
                    c24892b = new C24892b(this, interfaceC30057d);
                }
                Object obj4 = c24892b.f97515y;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i16 = c24892b.f97512E;
                C22669g0 c22669g1 = this.f56674x;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj4);
                    InterfaceC3027k1 interfaceC3027k2 = (InterfaceC3027k1) c22669g1.f89336w;
                    if (interfaceC3027k2 != null) {
                        interfaceC3027k2.cancel((CancellationException) new androidx.compose.material3.internal.AnchoredDragFinishedSignal());
                        c24892b.f97513w = obj;
                        c24892b.f97514x = interfaceC3027k2;
                        c24892b.f97512E = 1;
                        if (interfaceC3027k2.join(c24892b) == enumC31071a2) {
                            return enumC31071a2;
                        }
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = c24892b.f97513w;
                    AbstractC34132o.m107864I(obj4);
                }
                Object obj5 = obj;
                EnumC2998d0 enumC2998d1 = EnumC2998d0.f12007z;
                InterfaceC2994c0 interfaceC2994c1 = this.f56675y;
                c22669g1.f89336w = AbstractC3006f0.m8732z(interfaceC2994c1, null, enumC2998d1, new C15105p(this.f56676z, obj5, interfaceC2994c1, null, 1), 1);
                return C23454a0.f92919a;
        }
    }
}
