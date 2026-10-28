package p239j1;

import androidx.room.C1832u;
import p479s4.AbstractC32128i;
import p492t2.InterfaceC33313a;
import p505ts.AbstractC34132o;
import p636y3.C39185q;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: j1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C21192j implements InterfaceC33313a {

    /* JADX INFO: renamed from: w */
    public final C1832u f80751w;

    /* JADX INFO: renamed from: x */
    public final C21190h f80752x;

    public C21192j(C1832u c1832u, C21190h c21190h) {
        this.f80751w = c1832u;
        this.f80752x = c21190h;
    }

    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: J */
    public final long mo9761J(long j7, long j13, int i13) {
        if (i13 != 1) {
            return 0L;
        }
        int i14 = (int) (j13 & 4294967295L);
        if (Float.intBitsToFloat(i14) <= 0.0f) {
            return 0L;
        }
        return (4294967295L & ((long) Float.floatToRawIntBits(((Number) this.f80751w.invoke(Float.valueOf(Float.intBitsToFloat(i14)))).floatValue()))) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: l0 */
    public final long mo29341l0(long j7, int i13) {
        if (i13 != 1) {
            return 0L;
        }
        int i14 = (int) (j7 & 4294967295L);
        if (Float.intBitsToFloat(i14) >= 0.0f) {
            return 0L;
        }
        float fFloatValue = ((Number) this.f80751w.invoke(Float.valueOf(Float.intBitsToFloat(i14)))).floatValue();
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fFloatValue)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: p0 */
    public final Object mo29342p0(long j7, InterfaceC30057d interfaceC30057d) {
        C21191i c21191i;
        if (interfaceC30057d instanceof C21191i) {
            c21191i = (C21191i) interfaceC30057d;
            int i13 = c21191i.f80750y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c21191i.f80750y = i13 - Integer.MIN_VALUE;
            } else {
                c21191i = new C21191i(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c21191i = new C21191i(this, (AbstractC32269c) interfaceC30057d);
        }
        Object objInvoke = c21191i.f80748w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c21191i.f80750y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objInvoke);
            Float f13 = new Float(C39185q.m124814e(j7));
            c21191i.f80750y = 1;
            objInvoke = this.f80752x.invoke(f13, c21191i);
            if (objInvoke == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objInvoke);
        }
        return C39185q.m124810a(AbstractC32128i.m100047a(0.0f, ((Number) objInvoke).floatValue()));
    }
}
