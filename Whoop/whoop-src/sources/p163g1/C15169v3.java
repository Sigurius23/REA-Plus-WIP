package p163g1;

import p180h0.EnumC16377d2;
import p492t2.InterfaceC33313a;
import p505ts.AbstractC34132o;
import p636y3.C39185q;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: g1.v3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15169v3 implements InterfaceC33313a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C14947a0 f56901w;

    public C15169v3(C14947a0 c14947a0) {
        EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
        this.f56901w = c14947a0;
    }

    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: J */
    public final long mo9761J(long j7, long j13, int i13) {
        if (i13 != 1) {
            return 0L;
        }
        EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
        return m43200a(this.f56901w.m43069d(Float.intBitsToFloat((int) (4294967295L & j13))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: V */
    public final Object mo9762V(long j7, long j13, InterfaceC30057d interfaceC30057d) {
        C15149t3 c15149t3;
        if (interfaceC30057d instanceof C15149t3) {
            c15149t3 = (C15149t3) interfaceC30057d;
            int i13 = c15149t3.f56820z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c15149t3.f56820z = i13 - Integer.MIN_VALUE;
            } else {
                c15149t3 = new C15149t3(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c15149t3 = new C15149t3(this, (AbstractC32269c) interfaceC30057d);
        }
        Object obj = c15149t3.f56818x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c15149t3.f56820z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
            float fM124814e = C39185q.m124814e(j13);
            c15149t3.f56817w = j13;
            c15149t3.f56820z = 1;
            if (this.f56901w.m43074i(fM124814e, c15149t3) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j13 = c15149t3.f56817w;
            AbstractC34132o.m107864I(obj);
        }
        return new C39185q(j13);
    }

    /* JADX INFO: renamed from: a */
    public final long m43200a(float f13) {
        EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
        EnumC16377d2 enumC16377d3 = EnumC16377d2.f62971w;
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L);
    }

    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: l0 */
    public final long mo29341l0(long j7, int i13) {
        EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i13 != 1) {
            return 0L;
        }
        return m43200a(this.f56901w.m43069d(fIntBitsToFloat));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: p0 */
    public final Object mo29342p0(long j7, InterfaceC30057d interfaceC30057d) {
        C15159u3 c15159u3;
        if (interfaceC30057d instanceof C15159u3) {
            c15159u3 = (C15159u3) interfaceC30057d;
            int i13 = c15159u3.f56859z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c15159u3.f56859z = i13 - Integer.MIN_VALUE;
            } else {
                c15159u3 = new C15159u3(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c15159u3 = new C15159u3(this, (AbstractC32269c) interfaceC30057d);
        }
        Object obj = c15159u3.f56857x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c15159u3.f56859z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
            float fM124814e = C39185q.m124814e(j7);
            C14947a0 c14947a0 = this.f56901w;
            float fM43072g = c14947a0.m43072g();
            if (fM124814e >= 0.0f || fM43072g <= c14947a0.m43070e().m43145c()) {
                j7 = 0;
            } else {
                c15159u3.f56856w = j7;
                c15159u3.f56859z = 1;
                if (c14947a0.m43074i(fM124814e, c15159u3) == enumC31071a) {
                    return enumC31071a;
                }
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j7 = c15159u3.f56856w;
            AbstractC34132o.m107864I(obj);
        }
        return new C39185q(j7);
    }
}
