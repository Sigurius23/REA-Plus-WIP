package t23;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import bi.C3278p;
import c43.C4202r;
import c93.InterfaceC4351m;
import d43.C11701a;
import ec3.C13045h2;
import io.getstream.android.video.generated.models.CallSettingsResponse;
import io.getstream.android.video.generated.models.RingSettingsResponse;
import j43.C21319c;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import ro.C31624i;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: t23.p0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33435p0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f139581w;

    /* JADX INFO: renamed from: x */
    public int f139582x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C33450s0 f139583y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33435p0(C33450s0 c33450s0, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f139581w = i13;
        this.f139583y = c33450s0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f139581w) {
            case 0:
                return new C33435p0(this.f139583y, interfaceC30057d, 0);
            case 1:
                return new C33435p0(this.f139583y, interfaceC30057d, 1);
            case 2:
                return new C33435p0(this.f139583y, interfaceC30057d, 2);
            default:
                return new C33435p0(this.f139583y, interfaceC30057d, 3);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f139581w) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((C33435p0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0097  */
    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        C33391g1 c33391g1;
        C3278p c3278p;
        C33391g1 c33391g2;
        C3278p c3278p2;
        RingSettingsResponse ring;
        String str;
        switch (this.f139581w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f139582x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC33408j3.f139483t.getClass();
                    InterfaceC33408j3 interfaceC33408j3 = C33403i3.f139477b;
                    C21319c c21319c = (interfaceC33408j3 == null || (c33391g2 = ((C33366b4) interfaceC33408j3).f139248U) == null || (c3278p2 = c33391g2.f139406i) == null) ? new C21319c(false, 0, (Class) null, false, (C11701a) null, 63) : c3278p2.m9548b(this.f139583y.f139640b.f139288b);
                    if (c21319c.f81526f.f37845b.f37846a) {
                        C31624i c31624i = this.f139583y.f139640b.f139302p.f139679u0;
                        c31624i.getClass();
                        InterfaceC33408j3 interfaceC33408j4 = C33403i3.f139477b;
                        ((C33368c0) c31624i.f130665x).f139309w = ((interfaceC33408j4 == null || (c33391g1 = ((C33366b4) interfaceC33408j4).f139248U) == null || (c3278p = c33391g1.f139406i) == null) ? new C21319c(false, 0, (Class) null, false, (C11701a) null, 63) : c3278p.m9548b(((C33368c0) c31624i.f130665x).f139288b)).f81526f.f37845b.f37848c;
                        long j7 = c21319c.f81526f.f37845b.f37847b;
                        this.f139582x = 1;
                        if (AbstractC3034m0.m8782b(j7, this) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                    return C23454a0.f92919a;
                }
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                ((C33368c0) this.f139583y.f139640b.f139302p.f139679u0.f130665x).f139309w = null;
                return C23454a0.f92919a;
            case 1:
                C33450s0 c33450s0 = this.f139583y;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f139582x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C33368c0 c33368c0 = c33450s0.f139640b;
                    this.f139582x = 1;
                    if (c33368c0.m105821l((63 & 1) == 0, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                c33450s0.f139673r0 = null;
                return C23454a0.f92919a;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f139582x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f139582x = 1;
                    if (AbstractC3034m0.m8782b(2000L, this) == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                C13045h2 c13045h2 = this.f139583y.f139688z;
                Boolean bool = Boolean.FALSE;
                c13045h2.getClass();
                c13045h2.m36571k(null, bool);
                return C23454a0.f92919a;
            default:
                C33450s0 c33450s1 = this.f139583y;
                C33368c0 c33368c1 = c33450s1.f139640b;
                C13045h2 c13045h3 = c33450s1.f139617F;
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i16 = this.f139582x;
                if (i16 != 0) {
                    if (i16 == 1) {
                        AbstractC34132o.m107864I(obj);
                    } else {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                    }
                    if (c13045h3.getValue() instanceof C33359a3) {
                        str = "Outgoing call timed out with no answer";
                    } else {
                        str = "Incoming call timed out with no answer";
                    }
                    c33368c1.m105823p(new C33390g0(EnumC33393g3.RING_TIMEOUT, str));
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                CallSettingsResponse callSettingsResponse = (CallSettingsResponse) c33450s1.f139621J.getValue();
                Integer num = (callSettingsResponse == null || (ring = callSettingsResponse.getRing()) == null) ? null : new Integer(ring.getAutoCancelTimeoutMs());
                if (num == null || num.intValue() <= 0) {
                    C2345k c2345kM105860b = c33450s1.m105860b();
                    InterfaceC2339e interfaceC2339e = c2345kM105860b.f9275c;
                    String str2 = c2345kM105860b.f9273a;
                    EnumC2341g enumC2341g = EnumC2341g.WARN;
                    if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                        c2345kM105860b.f9274b.log(enumC2341g, str2, "[startRingingTimer] No autoCancelTimeoutMs set - call ring with no timeout", null);
                    }
                } else {
                    long jIntValue = num.intValue();
                    this.f139582x = 1;
                    if (AbstractC3034m0.m8782b(jIntValue, this) == enumC31071a4) {
                        return enumC31071a4;
                    }
                }
                return C23454a0.f92919a;
                if ((c13045h3.getValue() instanceof C33359a3) || ((c13045h3.getValue() instanceof C33487z2) && c33450s1.f139638a.f139248U.f139405h.getValue() == null)) {
                    c33450s1.f139613B0.set(false);
                    C4202r c4202r = new C4202r("timeout");
                    this.f139582x = 2;
                    if (c33368c1.m105828w(c4202r, this) == enumC31071a4) {
                        return enumC31071a4;
                    }
                    if (c13045h3.getValue() instanceof C33359a3) {
                        str = "Outgoing call timed out with no answer";
                    } else {
                        str = "Incoming call timed out with no answer";
                    }
                    c33368c1.m105823p(new C33390g0(EnumC33393g3.RING_TIMEOUT, str));
                }
                return C23454a0.f92919a;
        }
    }
}
