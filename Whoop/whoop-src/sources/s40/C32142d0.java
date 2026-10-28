package s40;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.AbstractC1640x1;
import b10.C2273z0;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3076z;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import java.util.Map;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23467m;
import l83.C23468n;
import p465rm.C31559p;
import p505ts.AbstractC34132o;
import p537ux.C35363y;
import p664yy.C39857f;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import y00.C38777a3;
import y00.C39012z2;

/* JADX INFO: renamed from: s40.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C32142d0 extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E */
    public final C13045h2 f133180E;

    /* JADX INFO: renamed from: F */
    public String f133181F;

    /* JADX INFO: renamed from: w */
    public final C31559p f133182w;

    /* JADX INFO: renamed from: x */
    public final C2273z0 f133183x;

    /* JADX INFO: renamed from: y */
    public final AbstractC3076z f133184y;

    /* JADX INFO: renamed from: z */
    public final C13045h2 f133185z;

    public C32142d0(C31559p c31559p, C2273z0 c2273z0) {
        C22365e c22365e = AbstractC3050q0.f12077a;
        ExecutorC22364d dispatcher = ExecutorC22364d.f87316w;
        AbstractC22676k.m65750j(dispatcher, "dispatcher");
        this.f133182w = c31559p;
        this.f133183x = c2273z0;
        this.f133184y = dispatcher;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(Boolean.FALSE);
        this.f133185z = c13045h2M36593c;
        this.f133180E = c13045h2M36593c;
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), dispatcher, null, new C32139c0(this, null, 0), 2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public static final Object m100092g(C32142d0 c32142d0, AbstractC32269c abstractC32269c) {
        C32136b0 c32136b0;
        Object objM7067M;
        C39012z2 c39012z2;
        if (abstractC32269c instanceof C32136b0) {
            c32136b0 = (C32136b0) abstractC32269c;
            int i13 = c32136b0.f133164y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c32136b0.f133164y = i13 - Integer.MIN_VALUE;
            } else {
                c32136b0 = new C32136b0(c32142d0, abstractC32269c);
            }
        } else {
            c32136b0 = new C32136b0(c32142d0, abstractC32269c);
        }
        Object obj = c32136b0.f133162w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c32136b0.f133164y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C35363y c35363y = (C35363y) c32142d0.f133182w.get();
            C2273z0 c2273z0 = c32142d0.f133183x;
            C39857f c39857f = new C39857f(c35363y.f150633w, c35363y.f150634x, 4);
            String str = c32142d0.f133181F;
            Map mapM95645u = str != null ? AbstractC31061c.m95645u("on_behalf_of", str) : null;
            c32136b0.f133164y = 1;
            objM7067M = c2273z0.m7067M(c39857f, mapM95645u, c32136b0);
            if (objM7067M == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objM7067M = ((C23468n) obj).f92940w;
        }
        C38777a3 c38777a3 = (C38777a3) (objM7067M instanceof C23467m ? null : objM7067M);
        return Boolean.valueOf((c38777a3 == null || (c39012z2 = c38777a3.f166913w) == null) ? false : c39012z2.f167909w);
    }
}
