package lb;

import android.database.SQLException;
import androidx.room.EnumC1840w1;
import androidx.room.InterfaceC1843x1;
import c93.InterfaceC4351m;
import hg3.AbstractC17269i;
import java.util.concurrent.atomic.AtomicInteger;
import p180h0.C16425n;
import p249jc.AbstractC21598x;
import p500tb.InterfaceC33687a;
import p500tb.InterfaceC33689c;
import p505ts.AbstractC34132o;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22672i;
import pf.AbstractC29125c;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: lb.n */
/* JADX INFO: loaded from: classes.dex */
public final class C23571n implements InterfaceC1843x1, InterfaceC23559b0 {

    /* JADX INFO: renamed from: a */
    public final C22672i f93479a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC33687a f93480b;

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f93481c;

    /* JADX INFO: renamed from: d */
    public EnumC1840w1 f93482d;

    /* JADX WARN: Multi-variable type inference failed */
    public C23571n(InterfaceC4351m interfaceC4351m, InterfaceC33687a delegate) {
        AbstractC22676k.m65750j(delegate, "delegate");
        this.f93479a = (C22672i) interfaceC4351m;
        this.f93480b = delegate;
        this.f93481c = new AtomicInteger(0);
    }

    @Override // androidx.room.InterfaceC1843x1
    /* JADX INFO: renamed from: a */
    public final Boolean mo5462a(InterfaceC30057d interfaceC30057d) {
        return Boolean.valueOf(this.f93482d != null || this.f93480b.mo68216v());
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [c93.m, kotlin.jvm.internal.i] */
    @Override // androidx.room.InterfaceC1843x1
    /* JADX INFO: renamed from: b */
    public final Object mo5463b(EnumC1840w1 enumC1840w1, InterfaceC4351m interfaceC4351m, AbstractC32275i abstractC32275i) {
        Object objInvoke = this.f93479a.invoke(new C16425n(this, enumC1840w1, interfaceC4351m, (InterfaceC30057d) null), abstractC32275i);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objInvoke;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v3, types: [c93.m, kotlin.jvm.internal.i] */
    @Override // androidx.room.InterfaceC1799j0
    /* JADX INFO: renamed from: c */
    public final Object mo5426c(String str, Function1 function1, AbstractC32269c abstractC32269c) {
        C23569l c23569l;
        if (abstractC32269c instanceof C23569l) {
            c23569l = (C23569l) abstractC32269c;
            int i13 = c23569l.f93471E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c23569l.f93471E = i13 - Integer.MIN_VALUE;
            } else {
                c23569l = new C23569l(this, abstractC32269c);
            }
        } else {
            c23569l = new C23569l(this, abstractC32269c);
        }
        Object objMo5462a = c23569l.f93474y;
        Object obj = EnumC31071a.f128113w;
        int i14 = c23569l.f93471E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo5462a);
            c23569l.f93472w = str;
            c23569l.f93473x = function1;
            c23569l.f93471E = 1;
            objMo5462a = mo5462a(c23569l);
            if (objMo5462a != obj) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo5462a);
            return objMo5462a;
        }
        function1 = c23569l.f93473x;
        str = c23569l.f93472w;
        AbstractC34132o.m107864I(objMo5462a);
        if (((Boolean) objMo5462a).booleanValue()) {
            C23570m c23570m = new C23570m(this, str, function1, null);
            c23569l.f93472w = null;
            c23569l.f93473x = null;
            c23569l.f93471E = 2;
            Object objInvoke = this.f93479a.invoke(c23570m, c23569l);
            return objInvoke == obj ? obj : objInvoke;
        }
        InterfaceC33689c interfaceC33689cMo68212g1 = this.f93480b.mo68212g1(str);
        try {
            Object objInvoke2 = function1.invoke(interfaceC33689cMo68212g1);
            AbstractC21598x.m60698r(interfaceC33689cMo68212g1, null);
            return objInvoke2;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC21598x.m60698r(interfaceC33689cMo68212g1, th3);
                throw th4;
            }
        }
    }

    @Override // lb.InterfaceC23559b0
    /* JADX INFO: renamed from: d */
    public final InterfaceC33687a mo68206d() {
        return this.f93480b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m68217e(EnumC1840w1 enumC1840w1, InterfaceC4351m interfaceC4351m, AbstractC32269c abstractC32269c) {
        C23568k c23568k;
        if (abstractC32269c instanceof C23568k) {
            c23568k = (C23568k) abstractC32269c;
            int i13 = c23568k.f93470z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c23568k.f93470z = i13 - Integer.MIN_VALUE;
            } else {
                c23568k = new C23568k(this, abstractC32269c);
            }
        } else {
            c23568k = new C23568k(this, abstractC32269c);
        }
        Object objInvoke = c23568k.f93468x;
        Object obj = EnumC31071a.f128113w;
        int i14 = c23568k.f93470z;
        AtomicInteger atomicInteger = this.f93481c;
        int i15 = 1;
        InterfaceC33687a interfaceC33687a = this.f93480b;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objInvoke);
                int iOrdinal = enumC1840w1.ordinal();
                if (iOrdinal == 0) {
                    AbstractC17269i.m48864K("BEGIN DEFERRED TRANSACTION", interfaceC33687a);
                } else if (iOrdinal == 1) {
                    AbstractC17269i.m48864K("BEGIN IMMEDIATE TRANSACTION", interfaceC33687a);
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    AbstractC17269i.m48864K("BEGIN EXCLUSIVE TRANSACTION", interfaceC33687a);
                }
                if (atomicInteger.incrementAndGet() > 0) {
                    this.f93482d = enumC1840w1;
                }
                Object c23567j = new C23567j(this);
                c23568k.f93467w = 1;
                c23568k.f93470z = 1;
                objInvoke = interfaceC4351m.invoke(c23567j, c23568k);
                if (objInvoke == obj) {
                    return obj;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i15 = c23568k.f93467w;
                AbstractC34132o.m107864I(objInvoke);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                this.f93482d = null;
            }
            if (i15 != 0) {
                AbstractC17269i.m48864K("END TRANSACTION", interfaceC33687a);
                return objInvoke;
            }
            AbstractC17269i.m48864K("ROLLBACK TRANSACTION", interfaceC33687a);
            return objInvoke;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                try {
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.f93482d = null;
                    }
                    AbstractC17269i.m48864K("ROLLBACK TRANSACTION", interfaceC33687a);
                } catch (SQLException e5) {
                    AbstractC29125c.m88530g(th3, e5);
                }
                throw th4;
            }
        }
    }
}
