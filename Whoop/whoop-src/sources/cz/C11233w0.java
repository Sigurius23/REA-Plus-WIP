package cz;

import a33.C0352d;
import b20.C2326f;
import b20.EnumC2323c;
import com.stripe.android.core.exception.StripeException;
import cu2.C11132l;
import dz.C12456c;
import f20.C14022a;
import hm.C17417d;
import java.io.Serializable;
import l83.C23465k;
import l83.C23468n;
import p204hz.AbstractC17811a;
import p477s2.AbstractC32073e;
import p479s4.AbstractC32123d;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35903f;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import tz.C34274a;
import u00.C34377e;

/* JADX INFO: renamed from: cz.w0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11233w0 implements InterfaceC11204i {

    /* JADX INFO: renamed from: a */
    public final C17417d f36042a;

    /* JADX INFO: renamed from: b */
    public final C0352d f36043b;

    /* JADX INFO: renamed from: c */
    public final C2326f f36044c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC30063j f36045d;

    public C11233w0(C34274a googlePayRepositoryFactory, C14022a isFinancialConnectionsAvailable, C34377e lpmRepository, C0352d eventReporter, C2326f errorReporter, InterfaceC30063j workContext) {
        AbstractC22676k.m65750j(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        AbstractC22676k.m65750j(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
        AbstractC22676k.m65750j(lpmRepository, "lpmRepository");
        AbstractC22676k.m65750j(eventReporter, "eventReporter");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(workContext, "workContext");
        C17417d c17417dM99755n = AbstractC32073e.m99755n(AbstractC17811a.f69274a);
        AbstractC32073e.m99755n(AbstractC17811a.f69277d);
        this.f36042a = c17417dM99755n;
        this.f36043b = eventReporter;
        this.f36044c = errorReporter;
        this.f36045d = workContext;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0072 A[Catch: all -> 0x0059, TryCatch #2 {all -> 0x0059, blocks: (B:28:0x0051, B:37:0x006d, B:39:0x0072, B:40:0x0078), top: B:66:0x0051 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: a */
    public final Serializable m30348a(C11190b c11190b, AbstractC32269c abstractC32269c) {
        C11229u0 c11229u0;
        Object objM30349b;
        C11233w0 c11233w0;
        C11190b c11190b2;
        if (abstractC32269c instanceof C11229u0) {
            c11229u0 = (C11229u0) abstractC32269c;
            int i13 = c11229u0.f36032E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c11229u0.f36032E = i13 - Integer.MIN_VALUE;
            } else {
                c11229u0 = new C11229u0(this, abstractC32269c);
            }
        } else {
            c11229u0 = new C11229u0(this, abstractC32269c);
        }
        Object obj = c11229u0.f36035y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c11229u0.f36032E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            try {
                c11229u0.f36033w = this;
                c11229u0.f36034x = c11190b;
                c11229u0.f36032E = 1;
                objM30349b = m30349b(c11229u0);
                if (objM30349b == enumC31071a) {
                    return enumC31071a;
                }
                c11233w0 = this;
                c11190b2 = c11190b;
                AbstractC34132o.m107864I(objM30349b);
                if (objM30349b != null) {
                    throw new ClassCastException();
                }
                c11229u0.f36033w = c11233w0;
                c11229u0.f36034x = c11190b2;
                c11229u0.f36032E = 2;
                throw null;
            } catch (Throwable th3) {
                th = th3;
                c11190b = this;
            }
        } else if (i14 != 1) {
            try {
                if (i14 == 2) {
                    C11233w0 c11233w1 = c11229u0.f36033w;
                    AbstractC34132o.m107864I(obj);
                    if (obj == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C11233w0 c11233w2 = c11229u0.f36033w;
                AbstractC34132o.m107864I(obj);
                c11233w2.getClass();
                throw null;
            } catch (Throwable th4) {
                th = th4;
            }
        } else {
            C11190b c11190b3 = c11229u0.f36034x;
            c11233w0 = c11229u0.f36033w;
            try {
                AbstractC34132o.m107864I(obj);
                objM30349b = ((C23468n) obj).f92940w;
                c11190b2 = c11190b3;
                AbstractC34132o.m107864I(objM30349b);
                if (objM30349b != null) {
                    c11229u0.f36033w = c11233w0;
                    c11229u0.f36034x = c11190b2;
                    c11229u0.f36032E = 2;
                    throw null;
                }
                try {
                    throw new ClassCastException();
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }
        c11190b = c11233w0;
        Object objM107888l = AbstractC34132o.m107888l(th);
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            C0352d c0352d = c11190b.f36043b;
            c0352d.getClass();
            c0352d.m941m(new C12456c(thM68037a));
            return AbstractC34132o.m107888l(thM68037a);
        }
        C23465k c23465k = (C23465k) objM107888l;
        if (c23465k.f92937w != null) {
            throw new ClassCastException();
        }
        if (c23465k.f92938x != null) {
            throw new ClassCastException();
        }
        c11190b.f36043b.getClass();
        AbstractC22676k.m65750j(null, "customerSheetSession");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m30349b(AbstractC32269c abstractC32269c) {
        C11231v0 c11231v0;
        Object objM99756o;
        C11233w0 c11233w0;
        if (abstractC32269c instanceof C11231v0) {
            c11231v0 = (C11231v0) abstractC32269c;
            int i13 = c11231v0.f36040z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c11231v0.f36040z = i13 - Integer.MIN_VALUE;
            } else {
                c11231v0 = new C11231v0(this, abstractC32269c);
            }
        } else {
            c11231v0 = new C11231v0(this, abstractC32269c);
        }
        Object obj = c11231v0.f36038x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c11231v0.f36040z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Duration.Companion companion = Duration.INSTANCE;
            long duration = DurationKt.toDuration(5, DurationUnit.SECONDS);
            C11132l c11132l = new C11132l(8);
            c11231v0.f36037w = this;
            c11231v0.f36040z = 1;
            objM99756o = AbstractC32073e.m99756o(this.f36042a, duration, c11132l, c11231v0);
            if (objM99756o == enumC31071a) {
                return enumC31071a;
            }
            c11233w0 = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c11233w0 = c11231v0.f36037w;
            AbstractC34132o.m107864I(obj);
            objM99756o = ((C23468n) obj).f92940w;
        }
        Throwable thM68037a = C23468n.m68037a(objM99756o);
        if (thM68037a != null) {
            C2326f c2326f = c11233w0.f36044c;
            EnumC2323c enumC2323c = EnumC2323c.CUSTOMER_SHEET_ADAPTER_NOT_FOUND;
            int i15 = StripeException.f22154E;
            AbstractC35903f.m113990H(c2326f, enumC2323c, AbstractC32123d.m100024d(thM68037a), null, 4);
        }
        return objM99756o;
    }
}
