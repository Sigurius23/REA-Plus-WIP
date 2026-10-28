package p395p6;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.squareup.wire.AbstractC5583n;
import j93.InterfaceC21467g;
import l83.C23454a0;
import p133f1.InterfaceC13957m;
import p335n6.C26385b;
import p389p0.C28557w0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p510u0.AbstractC34302b;
import p636y3.C39176h;

/* JADX INFO: renamed from: p6.p1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C28908p1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f117000w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f117001x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f117002y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f117003z;

    public /* synthetic */ C28908p1(InterfaceC4351m interfaceC4351m, long j7, InterfaceC28923u1 interfaceC28923u1) {
        this.f117001x = interfaceC4351m;
        this.f117002y = j7;
        this.f117003z = interfaceC28923u1;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0047  */
    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
    /* JADX WARN: Code duplicated, block: B:18:0x006c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:21:0x0077  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a8  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C28655q c28655q;
        Object objM87133R;
        InterfaceC4339a interfaceC4339a;
        switch (this.f117000w) {
            case 0:
                InterfaceC28923u1 interfaceC28923u1 = (InterfaceC28923u1) this.f117003z;
                InterfaceC4351m interfaceC4351m = (InterfaceC4351m) this.f117001x;
                ((Integer) obj2).getClass();
                AbstractC5583n.m16767a(AbstractC28683x.m87244L(1), this.f117002y, (Composer) obj, interfaceC4351m, interfaceC28923u1);
                break;
            case 1:
                InterfaceC4351m interfaceC4351m2 = (InterfaceC4351m) this.f117001x;
                InterfaceC28923u1 interfaceC28923u2 = (InterfaceC28923u1) this.f117003z;
                Composer composer = (Composer) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    C28655q c28655q2 = (C28655q) composer;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        c28655q = (C28655q) composer;
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = C28911q1.f117012w;
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a = (InterfaceC4339a) ((InterfaceC21467g) objM87133R);
                        c28655q.m87152f0(-683746039);
                        c28655q.m87152f0(-548224868);
                        if (c28655q.f115906a instanceof C26385b) {
                            AbstractC28683x.m87269w();
                            throw null;
                        }
                        c28655q.m87146c0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(interfaceC4339a);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, new C28557w0(4), new C39176h(this.f117002y));
                        AbstractC28683x.m87239G(c28655q, new C28557w0(5), interfaceC28923u2);
                        interfaceC4351m2.invoke(c28655q, 0);
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                        c28655q.m87173q(false);
                    }
                } else {
                    c28655q = (C28655q) composer;
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = C28911q1.f117012w;
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a = (InterfaceC4339a) ((InterfaceC21467g) objM87133R);
                    c28655q.m87152f0(-683746039);
                    c28655q.m87152f0(-548224868);
                    if (c28655q.f115906a instanceof C26385b) {
                        AbstractC28683x.m87269w();
                        throw null;
                    }
                    c28655q.m87146c0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(interfaceC4339a);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, new C28557w0(4), new C39176h(this.f117002y));
                    AbstractC28683x.m87239G(c28655q, new C28557w0(5), interfaceC28923u2);
                    interfaceC4351m2.invoke(c28655q, 0);
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                    c28655q.m87173q(false);
                }
                return C23454a0.f92919a;
            default:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(1);
                AbstractC34302b.m108610a((InterfaceC13957m) this.f117003z, (Modifier) this.f117001x, this.f117002y, (Composer) obj, iM87244L);
                break;
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C28908p1(InterfaceC13957m interfaceC13957m, Modifier modifier, long j7, int i13) {
        this.f117003z = interfaceC13957m;
        this.f117001x = modifier;
        this.f117002y = j7;
    }

    public /* synthetic */ C28908p1(InterfaceC28923u1 interfaceC28923u1, long j7, InterfaceC4351m interfaceC4351m, int i13) {
        this.f117003z = interfaceC28923u1;
        this.f117002y = j7;
        this.f117001x = interfaceC4351m;
    }
}
