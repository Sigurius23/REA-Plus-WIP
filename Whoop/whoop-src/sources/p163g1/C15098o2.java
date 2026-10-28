package p163g1;

import p180h0.EnumC16377d2;
import p292l1.C23196w3;
import p316m1.C24902g;
import p390p1.C28617g1;
import p492t2.InterfaceC33313a;
import p505ts.AbstractC34132o;
import p636y3.C39185q;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: g1.o2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15098o2 implements InterfaceC33313a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56549w;

    /* JADX INFO: renamed from: x */
    public final Object f56550x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f56551y;

    public C15098o2(C23196w3 c23196w3, Function1 function1) {
        this.f56549w = 1;
        EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
        this.f56550x = c23196w3;
        this.f56551y = function1;
    }

    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: J */
    public final long mo9761J(long j7, long j13, int i13) {
        int i14 = this.f56549w;
        Object obj = this.f56550x;
        switch (i14) {
            case 0:
                if (i13 == 1) {
                    return m43165a(((C14947a0) this.f56551y).m43069d(Float.intBitsToFloat((int) (((EnumC16377d2) obj) == EnumC16377d2.f62972x ? j13 >> 32 : j13 & 4294967295L))));
                }
                return 0L;
            default:
                if (i13 != 1) {
                    return 0L;
                }
                C24902g c24902g = ((C23196w3) obj).f91787e;
                EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
                float fM73009e = c24902g.m73009e(Float.intBitsToFloat((int) (j13 & 4294967295L)));
                C28617g1 c28617g1 = c24902g.f97550j;
                float fM87022x = Float.isNaN(c28617g1.m87022x()) ? 0.0f : c28617g1.m87022x();
                c28617g1.m87023y(fM73009e);
                return m43166b(fM73009e - fM87022x);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: V */
    public final Object mo9762V(long j7, long j13, InterfaceC30057d interfaceC30057d) {
        C15078m2 c15078m2;
        int i13 = this.f56549w;
        Object obj = this.f56551y;
        switch (i13) {
            case 0:
                if (interfaceC30057d instanceof C15078m2) {
                    c15078m2 = (C15078m2) interfaceC30057d;
                    int i14 = c15078m2.f56452z;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c15078m2.f56452z = i14 - Integer.MIN_VALUE;
                    } else {
                        c15078m2 = new C15078m2(this, (AbstractC32269c) interfaceC30057d);
                    }
                } else {
                    c15078m2 = new C15078m2(this, (AbstractC32269c) interfaceC30057d);
                }
                Object obj2 = c15078m2.f56450x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i15 = c15078m2.f56452z;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    C14947a0 c14947a0 = (C14947a0) obj;
                    float fM124813d = ((EnumC16377d2) this.f56550x) == EnumC16377d2.f62972x ? C39185q.m124813d(j13) : C39185q.m124814e(j13);
                    c15078m2.f56449w = j13;
                    c15078m2.f56452z = 1;
                    if (c14947a0.m43074i(fM124813d, c15078m2) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j13 = c15078m2.f56449w;
                    AbstractC34132o.m107864I(obj2);
                }
                return new C39185q(j13);
            default:
                EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
                ((Function1) obj).invoke(new Float(C39185q.m124814e(j13)));
                return new C39185q(j13);
        }
    }

    /* JADX INFO: renamed from: a */
    public long m43165a(float f13) {
        EnumC16377d2 enumC16377d2 = (EnumC16377d2) this.f56550x;
        float f14 = enumC16377d2 == EnumC16377d2.f62972x ? f13 : 0.0f;
        if (enumC16377d2 != EnumC16377d2.f62971w) {
            f13 = 0.0f;
        }
        return (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L);
    }

    /* JADX INFO: renamed from: b */
    public long m43166b(float f13) {
        EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
        EnumC16377d2 enumC16377d3 = EnumC16377d2.f62971w;
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L);
    }

    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: l0 */
    public final long mo29341l0(long j7, int i13) {
        int i14 = this.f56549w;
        Object obj = this.f56550x;
        switch (i14) {
            case 0:
                float fIntBitsToFloat = Float.intBitsToFloat((int) (((EnumC16377d2) obj) == EnumC16377d2.f62972x ? j7 >> 32 : j7 & 4294967295L));
                if (fIntBitsToFloat >= 0.0f || i13 != 1) {
                    return 0L;
                }
                return m43165a(((C14947a0) this.f56551y).m43069d(fIntBitsToFloat));
            default:
                EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
                if (fIntBitsToFloat2 >= 0.0f || i13 != 1) {
                    return 0L;
                }
                C24902g c24902g = ((C23196w3) obj).f91787e;
                float fM73009e = c24902g.m73009e(fIntBitsToFloat2);
                C28617g1 c28617g1 = c24902g.f97550j;
                float fM87022x = Float.isNaN(c28617g1.m87022x()) ? 0.0f : c28617g1.m87022x();
                c28617g1.m87023y(fM73009e);
                return m43166b(fM73009e - fM87022x);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0053  */
    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: p0 */
    public final Object mo29342p0(long j7, InterfaceC30057d interfaceC30057d) {
        C15088n2 c15088n2;
        int i13 = this.f56549w;
        long j13 = 0;
        Object obj = this.f56551y;
        Object obj2 = this.f56550x;
        switch (i13) {
            case 0:
                C14947a0 c14947a0 = (C14947a0) obj;
                if (interfaceC30057d instanceof C15088n2) {
                    c15088n2 = (C15088n2) interfaceC30057d;
                    int i14 = c15088n2.f56494z;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c15088n2.f56494z = i14 - Integer.MIN_VALUE;
                    } else {
                        c15088n2 = new C15088n2(this, (AbstractC32269c) interfaceC30057d);
                    }
                } else {
                    c15088n2 = new C15088n2(this, (AbstractC32269c) interfaceC30057d);
                }
                Object obj3 = c15088n2.f56492x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i15 = c15088n2.f56494z;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj3);
                    float fM124813d = ((EnumC16377d2) obj2) == EnumC16377d2.f62972x ? C39185q.m124813d(j7) : C39185q.m124814e(j7);
                    float fM43072g = c14947a0.m43072g();
                    if (fM124813d < 0.0f && fM43072g > c14947a0.m43070e().m43145c()) {
                        c15088n2.f56491w = j7;
                        c15088n2.f56494z = 1;
                        if (c14947a0.m43074i(fM124813d, c15088n2) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                    return new C39185q(j13);
                }
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j7 = c15088n2.f56491w;
                AbstractC34132o.m107864I(obj3);
                j13 = j7;
                return new C39185q(j13);
            default:
                EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
                float fM124814e = C39185q.m124814e(j7);
                C23196w3 c23196w3 = (C23196w3) obj2;
                float fM73010f = c23196w3.f91787e.m73010f();
                float fM72992c = c23196w3.f91787e.m73008d().m72992c();
                if (fM124814e >= 0.0f || fM73010f <= fM72992c) {
                    j7 = 0;
                } else {
                    ((Function1) obj).invoke(new Float(fM124814e));
                }
                return new C39185q(j7);
        }
    }

    public C15098o2(C14947a0 c14947a0) {
        this.f56549w = 0;
        this.f56551y = c14947a0;
        this.f56550x = EnumC16377d2.f62971w;
    }
}
