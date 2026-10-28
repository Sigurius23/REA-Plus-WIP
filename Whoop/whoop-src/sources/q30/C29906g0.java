package q30;

import bc3.AbstractC3034m0;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import java.util.concurrent.TimeUnit;
import l83.C23454a0;
import ng3.C26701n;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import r30.C30897b;
import r30.C30902g;
import r30.EnumC30901f;
import r30.EnumC30904i;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: q30.g0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29906g0 {

    /* JADX INFO: renamed from: a */
    public final C29936v0 f122178a;

    /* JADX INFO: renamed from: b */
    public final C30897b f122179b;

    /* JADX INFO: renamed from: c */
    public final long f122180c;

    /* JADX INFO: renamed from: d */
    public final C13045h2 f122181d;

    /* JADX INFO: renamed from: e */
    public final C13045h2 f122182e;

    public C29906g0(int i13, C29936v0 errorRequestExecutor, C30897b creqData) {
        AbstractC22676k.m65750j(errorRequestExecutor, "errorRequestExecutor");
        AbstractC22676k.m65750j(creqData, "creqData");
        this.f122178a = errorRequestExecutor;
        this.f122179b = creqData;
        this.f122180c = TimeUnit.MINUTES.toMillis(i13);
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(Boolean.FALSE);
        this.f122181d = c13045h2M36593c;
        this.f122182e = c13045h2M36593c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m91516a(AbstractC32269c abstractC32269c) {
        C29904f0 c29904f0;
        C29906g0 c29906g0;
        if (abstractC32269c instanceof C29904f0) {
            c29904f0 = (C29904f0) abstractC32269c;
            int i13 = c29904f0.f122176z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c29904f0.f122176z = i13 - Integer.MIN_VALUE;
            } else {
                c29904f0 = new C29904f0(this, abstractC32269c);
            }
        } else {
            c29904f0 = new C29904f0(this, abstractC32269c);
        }
        Object obj = c29904f0.f122174x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c29904f0.f122176z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c29904f0.f122173w = this;
            c29904f0.f122176z = 1;
            if (AbstractC3034m0.m8782b(this.f122180c, c29904f0) == enumC31071a) {
                return enumC31071a;
            }
            c29906g0 = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c29906g0 = c29904f0.f122173w;
            AbstractC34132o.m107864I(obj);
        }
        C29936v0 c29936v0 = c29906g0.f122178a;
        C30897b c30897b = c29906g0.f122179b;
        String str = c30897b.f127394x;
        String str2 = c30897b.f127395y;
        EnumC30904i enumC30904i = EnumC30904i.UnrecognizedCriticalMessageExtensions;
        String strValueOf = String.valueOf(402);
        C26701n c26701n = EnumC30901f.f127432x;
        c29936v0.m91540a(new C30902g(str, str2, strValueOf, "Transaction timed-out.", "Timeout expiry reached for the transaction", null, c30897b.f127393w, c30897b.f127396z, 132));
        C13045h2 c13045h2 = c29906g0.f122181d;
        Boolean bool = Boolean.TRUE;
        c13045h2.getClass();
        c13045h2.m36571k(null, bool);
        return C23454a0.f92919a;
    }
}
