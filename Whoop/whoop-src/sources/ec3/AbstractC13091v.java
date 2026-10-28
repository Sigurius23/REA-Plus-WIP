package ec3;

import a63.C0493j;
import androidx.lifecycle.C1578e1;
import androidx.room.C1841x;
import androidx.room.C1844y;
import androidx.room.C1849z1;
import bc3.AbstractC3006f0;
import bc3.C3023j1;
import bc3.C3058t;
import bc3.EnumC2998d0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import c93.InterfaceC4353o;
import ch.C4594o;
import com.whoop.data.local.room.dao.persistent.C6493d;
import dc3.C11926k;
import dc3.EnumC11916a;
import dc3.InterfaceC11927l;
import dc3.InterfaceC11938w;
import ds2.C12347a;
import fc3.AbstractC14371b;
import fc3.AbstractC14373d;
import fc3.C14375f;
import fc3.C14377h;
import fc3.C14380k;
import fc3.C14388s;
import fc3.InterfaceC14386q;
import hc3.C17191x;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import l83.C23454a0;
import l83.C23468n;
import m83.AbstractC25260n;
import p003a1.C0109h;
import p007a6.C0456u;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22681m0;
import p715kotlin.jvm.internal.C22669g0;
import pf.AbstractC29125c;
import q83.C30064k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import so.C32798o;
import vb1.C35868a;

/* JADX INFO: renamed from: ec3.v */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC13091v {

    /* JADX INFO: renamed from: a */
    public static final C35868a f45231a = new C35868a(18);

    /* JADX INFO: renamed from: b */
    public static final C12347a f45232b = new C12347a(20);

    /* JADX INFO: renamed from: c */
    public static final C17191x f45233c;

    /* JADX INFO: renamed from: d */
    public static final C17191x f45234d;

    /* JADX INFO: renamed from: e */
    public static final C17191x f45235e;

    static {
        int i13 = 0;
        f45233c = new C17191x("NO_VALUE", i13);
        f45234d = new C17191x("NONE", i13);
        f45235e = new C17191x("PENDING", i13);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: A */
    public static final Object m36575A(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d) {
        C13104z0 c13104z0;
        C22669g0 c22669g0;
        AbortFlowException e5;
        C13098x0 c13098x0;
        C17191x c17191x = AbstractC14371b.f52477b;
        if (interfaceC30057d instanceof C13104z0) {
            c13104z0 = (C13104z0) interfaceC30057d;
            int i13 = c13104z0.f45287z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13104z0.f45287z = i13 - Integer.MIN_VALUE;
            } else {
                c13104z0 = new C13104z0(interfaceC30057d);
            }
        } else {
            c13104z0 = new C13104z0(interfaceC30057d);
        }
        Object obj = c13104z0.f45286y;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c13104z0.f45287z;
        if (i14 == 0) {
            C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
            c22669g0M32004w.f89336w = c17191x;
            C13098x0 c13098x1 = new C13098x0(c22669g0M32004w, 0);
            try {
                c13104z0.f45284w = c22669g0M32004w;
                c13104z0.f45285x = c13098x1;
                c13104z0.f45287z = 1;
                if (interfaceC13058l.collect(c13098x1, c13104z0) == obj2) {
                    return obj2;
                }
                c22669g0 = c22669g0M32004w;
            } catch (AbortFlowException e13) {
                c22669g0 = c22669g0M32004w;
                e5 = e13;
                c13098x0 = c13098x1;
                if (e5.f89399w == c13098x0) {
                    throw e5;
                }
                AbstractC3006f0.m8721o(c13104z0.getContext());
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c13098x0 = c13104z0.f45285x;
            c22669g0 = c13104z0.f45284w;
            try {
                AbstractC34132o.m107864I(obj);
            } catch (AbortFlowException e14) {
                e5 = e14;
                if (e5.f89399w == c13098x0) {
                    throw e5;
                }
                AbstractC3006f0.m8721o(c13104z0.getContext());
            }
        }
        Object obj3 = c22669g0.f89336w;
        if (obj3 != c17191x) {
            return obj3;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: B */
    public static final Object m36576B(InterfaceC13058l interfaceC13058l, InterfaceC4351m interfaceC4351m, AbstractC32269c abstractC32269c) {
        C13028d1 c13028d1;
        C22669g0 c22669g0;
        AbortFlowException e5;
        C1841x c1841x;
        if (abstractC32269c instanceof C13028d1) {
            c13028d1 = (C13028d1) abstractC32269c;
            int i13 = c13028d1.f45038z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13028d1.f45038z = i13 - Integer.MIN_VALUE;
            } else {
                c13028d1 = new C13028d1(abstractC32269c);
            }
        } else {
            c13028d1 = new C13028d1(abstractC32269c);
        }
        Object obj = c13028d1.f45037y;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c13028d1.f45038z;
        if (i14 == 0) {
            C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
            C1841x c1841x2 = new C1841x(3, interfaceC4351m, c22669g0M32004w);
            try {
                c13028d1.f45035w = c22669g0M32004w;
                c13028d1.f45036x = c1841x2;
                c13028d1.f45038z = 1;
                if (interfaceC13058l.collect(c1841x2, c13028d1) == obj2) {
                    return obj2;
                }
                c22669g0 = c22669g0M32004w;
            } catch (AbortFlowException e13) {
                c22669g0 = c22669g0M32004w;
                e5 = e13;
                c1841x = c1841x2;
                if (e5.f89399w == c1841x) {
                    throw e5;
                }
                AbstractC3006f0.m8721o(c13028d1.getContext());
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1841x = c13028d1.f45036x;
            c22669g0 = c13028d1.f45035w;
            try {
                AbstractC34132o.m107864I(obj);
            } catch (AbortFlowException e14) {
                e5 = e14;
                if (e5.f89399w == c1841x) {
                    throw e5;
                }
                AbstractC3006f0.m8721o(c13028d1.getContext());
            }
        }
        return c22669g0.f89336w;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: C */
    public static final Object m36577C(InterfaceC13058l interfaceC13058l, AbstractC32269c abstractC32269c) {
        C13024c1 c13024c1;
        C22669g0 c22669g0;
        AbortFlowException e5;
        C13098x0 c13098x0;
        if (abstractC32269c instanceof C13024c1) {
            c13024c1 = (C13024c1) abstractC32269c;
            int i13 = c13024c1.f45027z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13024c1.f45027z = i13 - Integer.MIN_VALUE;
            } else {
                c13024c1 = new C13024c1(abstractC32269c);
            }
        } else {
            c13024c1 = new C13024c1(abstractC32269c);
        }
        Object obj = c13024c1.f45026y;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c13024c1.f45027z;
        if (i14 == 0) {
            C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
            C13098x0 c13098x1 = new C13098x0(c22669g0M32004w, 1);
            try {
                c13024c1.f45024w = c22669g0M32004w;
                c13024c1.f45025x = c13098x1;
                c13024c1.f45027z = 1;
                if (interfaceC13058l.collect(c13098x1, c13024c1) == obj2) {
                    return obj2;
                }
                c22669g0 = c22669g0M32004w;
            } catch (AbortFlowException e13) {
                c22669g0 = c22669g0M32004w;
                e5 = e13;
                c13098x0 = c13098x1;
                if (e5.f89399w == c13098x0) {
                    throw e5;
                }
                AbstractC3006f0.m8721o(c13024c1.getContext());
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c13098x0 = c13024c1.f45025x;
            c22669g0 = c13024c1.f45024w;
            try {
                AbstractC34132o.m107864I(obj);
            } catch (AbortFlowException e14) {
                e5 = e14;
                if (e5.f89399w == c13098x0) {
                    throw e5;
                }
                AbstractC3006f0.m8721o(c13024c1.getContext());
            }
        }
        return c22669g0.f89336w;
    }

    /* JADX INFO: renamed from: D */
    public static final C4594o m36578D(InterfaceC4351m interfaceC4351m, InterfaceC13058l interfaceC13058l) {
        int i13 = AbstractC13095w0.f45249a;
        int i14 = 1;
        return new C4594o(new C1844y(i14, interfaceC13058l, interfaceC4351m), i14);
    }

    /* JADX INFO: renamed from: E */
    public static final InterfaceC13058l m36579E(int i13, InterfaceC4351m interfaceC4351m, InterfaceC13058l interfaceC13058l) {
        int i14 = AbstractC13095w0.f45249a;
        C13015a0 c13015a0 = new C13015a0(5, interfaceC4351m, interfaceC13058l);
        if (i13 <= 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Expected positive concurrency level, but had ").toString());
        }
        int i15 = 1;
        if (i13 == 1) {
            return new C4594o(c13015a0, i15);
        }
        return new C14375f(c13015a0, i13, C30064k.f122676w, -2, EnumC11916a.f38982w);
    }

    /* JADX INFO: renamed from: F */
    public static final InterfaceC13058l m36580F(InterfaceC13058l interfaceC13058l, InterfaceC30063j interfaceC30063j) {
        if (interfaceC30063j.get(C3023j1.f12041w) == null) {
            if (interfaceC30063j.equals(C30064k.f122676w)) {
                return interfaceC13058l;
            }
            return interfaceC13058l instanceof InterfaceC14386q ? AbstractC14371b.m41039b((InterfaceC14386q) interfaceC13058l, interfaceC30063j, 0, null, 6) : new C14377h(interfaceC13058l, interfaceC30063j, 0, null, 12);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + interfaceC30063j).toString());
    }

    /* JADX INFO: renamed from: G */
    public static final InterfaceC13058l m36581G(InterfaceC13087t1 interfaceC13087t1, InterfaceC30063j interfaceC30063j, int i13, EnumC11916a enumC11916a) {
        return ((i13 == 0 || i13 == -3) && enumC11916a == EnumC11916a.f38982w) ? interfaceC13087t1 : new C14377h(i13, enumC11916a, interfaceC13087t1, interfaceC30063j);
    }

    /* JADX INFO: renamed from: H */
    public static final InterfaceC3027k1 m36582H(InterfaceC13058l interfaceC13058l, InterfaceC2994c0 interfaceC2994c0) {
        return AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C1849z1(interfaceC13058l, null, 2), 3);
    }

    /* JADX INFO: renamed from: I */
    public static final C14380k m36583I(InterfaceC4351m interfaceC4351m, InterfaceC13058l interfaceC13058l) {
        int i13 = AbstractC13095w0.f45249a;
        return m36590P(interfaceC13058l, new C0493j(interfaceC4351m, (InterfaceC30057d) null, 5));
    }

    /* JADX INFO: renamed from: J */
    public static final C13042h m36584J(InterfaceC13058l... interfaceC13058lArr) {
        int i13 = AbstractC13095w0.f45249a;
        return new C13042h(AbstractC25260n.m74046V(interfaceC13058lArr), C30064k.f122676w, -2, EnumC11916a.f38982w);
    }

    /* JADX INFO: renamed from: K */
    public static final C13038g m36585K(InterfaceC11938w interfaceC11938w) {
        return new C13038g(interfaceC11938w, false);
    }

    /* JADX INFO: renamed from: L */
    public static final C13078q1 m36586L(InterfaceC13058l interfaceC13058l, InterfaceC2994c0 interfaceC2994c0, InterfaceC13017a2 interfaceC13017a2, int i13) {
        C32798o c32798oM36607q = m36607q(interfaceC13058l, i13);
        C13096w1 c13096w1M36591a = m36591a(i13, c32798oM36607q.f136499a, (EnumC11916a) c32798oM36607q.f136501c);
        return new C13078q1(c13096w1M36591a, AbstractC3006f0.m8731y(interfaceC2994c0, (InterfaceC30063j) c32798oM36607q.f136502d, interfaceC13017a2.equals(C13105z1.f45288a) ? EnumC2998d0.f12004w : EnumC2998d0.f12007z, new C1578e1(interfaceC13017a2, (InterfaceC13058l) c32798oM36607q.f136500b, c13096w1M36591a, f45233c, (InterfaceC30057d) null)));
    }

    /* JADX INFO: renamed from: M */
    public static final C13081r1 m36587M(InterfaceC13058l interfaceC13058l, InterfaceC2994c0 interfaceC2994c0, InterfaceC13017a2 interfaceC13017a2, Object obj) {
        C32798o c32798oM36607q = m36607q(interfaceC13058l, 1);
        C13045h2 c13045h2M36593c = m36593c(obj);
        return new C13081r1(c13045h2M36593c, AbstractC3006f0.m8731y(interfaceC2994c0, (InterfaceC30063j) c32798oM36607q.f136502d, interfaceC13017a2.equals(C13105z1.f45288a) ? EnumC2998d0.f12004w : EnumC2998d0.f12007z, new C1578e1(interfaceC13017a2, (InterfaceC13058l) c32798oM36607q.f136500b, c13045h2M36593c, obj, (InterfaceC30057d) null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: N */
    public static final Object m36588N(InterfaceC13058l interfaceC13058l, InterfaceC2994c0 interfaceC2994c0, AbstractC32269c abstractC32269c) {
        C13040g1 c13040g1;
        if (abstractC32269c instanceof C13040g1) {
            c13040g1 = (C13040g1) abstractC32269c;
            int i13 = c13040g1.f45072x;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13040g1.f45072x = i13 - Integer.MIN_VALUE;
            } else {
                c13040g1 = new C13040g1(abstractC32269c);
            }
        } else {
            c13040g1 = new C13040g1(abstractC32269c);
        }
        Object objM8817m = c13040g1.f45071w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c13040g1.f45072x;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8817m);
            C32798o c32798oM36607q = m36607q(interfaceC13058l, 1);
            C3058t c3058t = new C3058t((InterfaceC3027k1) interfaceC2994c0.getCoroutineContext().get(C3023j1.f12041w));
            AbstractC3006f0.m8732z(interfaceC2994c0, (InterfaceC30063j) c32798oM36607q.f136502d, null, new C0109h((InterfaceC13058l) c32798oM36607q.f136500b, c3058t, (InterfaceC30057d) null, 19), 2);
            c13040g1.f45072x = 1;
            objM8817m = c3058t.m8817m(c13040g1);
            if (objM8817m == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8817m);
        }
        Object obj = ((C23468n) objM8817m).f92940w;
        AbstractC34132o.m107864I(obj);
        return obj;
    }

    /* JADX INFO: renamed from: O */
    public static final C0456u m36589O(InterfaceC13058l interfaceC13058l, long j7) {
        return new C0456u(new C13088u(interfaceC13058l, j7, null));
    }

    /* JADX INFO: renamed from: P */
    public static final C14380k m36590P(InterfaceC13058l interfaceC13058l, Function3 function3) {
        int i13 = AbstractC13095w0.f45249a;
        return new C14380k(function3, interfaceC13058l, C30064k.f122676w, -2, EnumC11916a.f38982w);
    }

    /* JADX INFO: renamed from: a */
    public static final C13096w1 m36591a(int i13, int i14, EnumC11916a enumC11916a) {
        if (i13 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "replay cannot be negative, but was ").toString());
        }
        if (i14 < 0) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i14, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i13 <= 0 && i14 <= 0 && enumC11916a != EnumC11916a.f38982w) {
            throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC11916a).toString());
        }
        int i15 = i14 + i13;
        if (i15 < 0) {
            i15 = Integer.MAX_VALUE;
        }
        return new C13096w1(i13, i15, enumC11916a);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C13096w1 m36592b(int i13, int i14, EnumC11916a enumC11916a, int i15) {
        if ((i15 & 1) != 0) {
            i13 = 0;
        }
        if ((i15 & 2) != 0) {
            i14 = 0;
        }
        if ((i15 & 4) != 0) {
            enumC11916a = EnumC11916a.f38982w;
        }
        return m36591a(i13, i14, enumC11916a);
    }

    /* JADX INFO: renamed from: c */
    public static final C13045h2 m36593c(Object obj) {
        if (obj == null) {
            obj = AbstractC14371b.f52477b;
        }
        return new C13045h2(obj);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static final void m36594d(InterfaceC13062m interfaceC13062m, Object obj, Object obj2, AbstractC32269c abstractC32269c) {
        C13059l0 c13059l0;
        if (abstractC32269c instanceof C13059l0) {
            c13059l0 = (C13059l0) abstractC32269c;
            int i13 = c13059l0.f45132y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13059l0.f45132y = i13 - Integer.MIN_VALUE;
            } else {
                c13059l0 = new C13059l0(abstractC32269c);
            }
        } else {
            c13059l0 = new C13059l0(abstractC32269c);
        }
        Object obj3 = c13059l0.f45131x;
        Object obj4 = EnumC31071a.f128113w;
        int i14 = c13059l0.f45132y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj3);
            c13059l0.f45130w = obj2;
            c13059l0.f45132y = 1;
            if (interfaceC13062m.emit(obj, c13059l0) == obj4) {
                return;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = c13059l0.f45130w;
            AbstractC34132o.m107864I(obj3);
        }
        throw new AbortFlowException(obj2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public static final Object m36595e(C13069n2 c13069n2, Function3 function3, Throwable th3, AbstractC32269c abstractC32269c) {
        C13094w c13094w;
        if (abstractC32269c instanceof C13094w) {
            c13094w = (C13094w) abstractC32269c;
            int i13 = c13094w.f45248y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13094w.f45248y = i13 - Integer.MIN_VALUE;
            } else {
                c13094w = new C13094w(abstractC32269c);
            }
        } else {
            c13094w = new C13094w(abstractC32269c);
        }
        Object obj = c13094w.f45247x;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c13094w.f45248y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                c13094w.f45246w = th3;
                c13094w.f45248y = 1;
                if (function3.invoke(c13069n2, th3, c13094w) == obj2) {
                    return obj2;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th3 = c13094w.f45246w;
                AbstractC34132o.m107864I(obj);
            }
            return C23454a0.f92919a;
        } catch (Throwable th4) {
            if (th3 != null && th3 != th4) {
                AbstractC29125c.m88530g(th4, th3);
            }
            throw th4;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m36596f(Object[] objArr, long j7, Object obj) {
        objArr[((int) j7) & (objArr.length - 1)] = obj;
    }

    /* JADX INFO: renamed from: g */
    public static final C13078q1 m36597g(InterfaceC13072o1 interfaceC13072o1) {
        return new C13078q1(interfaceC13072o1, null);
    }

    /* JADX INFO: renamed from: h */
    public static final C13081r1 m36598h(InterfaceC13075p1 interfaceC13075p1) {
        return new C13081r1(interfaceC13075p1, null);
    }

    /* JADX INFO: renamed from: i */
    public static InterfaceC13058l m36599i(InterfaceC13058l interfaceC13058l, int i13, int i14) {
        if ((i14 & 1) != 0) {
            i13 = -2;
        }
        EnumC11916a enumC11916a = EnumC11916a.f38982w;
        if (i13 < 0 && i13 != -2 && i13 != -1) {
            throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i13 == -1) {
            enumC11916a = EnumC11916a.f38983x;
            i13 = 0;
        }
        int i15 = i13;
        EnumC11916a enumC11916a2 = enumC11916a;
        return interfaceC13058l instanceof InterfaceC14386q ? AbstractC14371b.m41039b((InterfaceC14386q) interfaceC13058l, null, i15, enumC11916a2, 1) : new C14377h(interfaceC13058l, null, i15, enumC11916a2, 2);
    }

    /* JADX INFO: renamed from: j */
    public static final C13022c m36600j(InterfaceC4351m interfaceC4351m) {
        return new C13022c(interfaceC4351m, C30064k.f122676w, -2, EnumC11916a.f38982w);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: k */
    public static final Serializable m36601k(InterfaceC13058l interfaceC13058l, InterfaceC13062m interfaceC13062m, AbstractC32269c abstractC32269c) throws Throwable {
        C13023c0 c13023c0;
        C22669g0 c22669g0;
        InterfaceC3027k1 interfaceC3027k1;
        CancellationException cancellationException;
        if (abstractC32269c instanceof C13023c0) {
            c13023c0 = (C13023c0) abstractC32269c;
            int i13 = c13023c0.f45023y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13023c0.f45023y = i13 - Integer.MIN_VALUE;
            } else {
                c13023c0 = new C13023c0(abstractC32269c);
            }
        } else {
            c13023c0 = new C13023c0(abstractC32269c);
        }
        Object obj = c13023c0.f45022x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c13023c0.f45023y;
        if (i14 == 0) {
            C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
            try {
                InterfaceC13062m c13031e0 = new C13031e0(0, interfaceC13062m, c22669g0M32004w);
                c13023c0.f45021w = c22669g0M32004w;
                c13023c0.f45023y = 1;
                if (interfaceC13058l.collect(c13031e0, c13023c0) == enumC31071a) {
                    return enumC31071a;
                }
                return null;
            } catch (Throwable th3) {
                th = th3;
                c22669g0 = c22669g0M32004w;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c22669g0 = c13023c0.f45021w;
            try {
                AbstractC34132o.m107864I(obj);
                return null;
            } catch (Throwable th4) {
                th = th4;
            }
        }
        Throwable th5 = (Throwable) c22669g0.f89336w;
        if ((th5 != null && th5.equals(th)) || ((interfaceC3027k1 = (InterfaceC3027k1) c13023c0.getContext().get(C3023j1.f12041w)) != null && interfaceC3027k1.isCancelled() && (cancellationException = interfaceC3027k1.getCancellationException()) != null && cancellationException.equals(th))) {
            throw th;
        }
        if (th5 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            AbstractC29125c.m88530g(th5, th);
            throw th5;
        }
        AbstractC29125c.m88530g(th, th5);
        throw th;
    }

    /* JADX INFO: renamed from: l */
    public static final C13042h m36602l(InterfaceC4351m interfaceC4351m) {
        return new C13042h(interfaceC4351m, C30064k.f122676w, -2, EnumC11916a.f38982w);
    }

    /* JADX INFO: renamed from: m */
    public static final Object m36603m(InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d) {
        Object objCollect = interfaceC13058l.collect(C14388s.f52526w, interfaceC30057d);
        return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    public static final Object m36604n(InterfaceC13058l interfaceC13058l, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        Object objM36603m = m36603m(m36599i(m36583I(interfaceC4351m, interfaceC13058l), 0, 2), interfaceC30057d);
        return objM36603m == EnumC31071a.f128113w ? objM36603m : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public static final C1844y m36605o(InterfaceC13058l interfaceC13058l, InterfaceC13058l interfaceC13058l2, InterfaceC13058l interfaceC13058l3, InterfaceC13058l interfaceC13058l4, InterfaceC4353o interfaceC4353o) {
        return new C1844y(2, new InterfaceC13058l[]{interfaceC13058l, interfaceC13058l2, interfaceC13058l3, interfaceC13058l4}, interfaceC4353o);
    }

    /* JADX INFO: renamed from: p */
    public static final C13052j1 m36606p(InterfaceC13058l interfaceC13058l, InterfaceC13058l interfaceC13058l2, InterfaceC13058l interfaceC13058l3, InterfaceC4352n interfaceC4352n) {
        return new C13052j1(new InterfaceC13058l[]{interfaceC13058l, interfaceC13058l2, interfaceC13058l3}, interfaceC4352n, 1);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0030  */
    /* JADX INFO: renamed from: q */
    public static final C32798o m36607q(InterfaceC13058l interfaceC13058l, int i13) {
        InterfaceC11927l.f39029h.getClass();
        int i14 = C11926k.f39028b;
        if (i13 >= i14) {
            i14 = i13;
        }
        int i15 = i14 - i13;
        if (interfaceC13058l instanceof AbstractC14373d) {
            AbstractC14373d abstractC14373d = (AbstractC14373d) interfaceC13058l;
            EnumC11916a enumC11916a = abstractC14373d.f52482y;
            InterfaceC13058l interfaceC13058lMo36562g = abstractC14373d.mo36562g();
            if (interfaceC13058lMo36562g != null) {
                int i16 = abstractC14373d.f52481x;
                if (i16 != -3 && i16 != -2 && i16 != 0) {
                    i15 = i16;
                } else if (enumC11916a == EnumC11916a.f38982w) {
                    if (i16 == 0) {
                        i15 = 0;
                    }
                } else if (i13 == 0) {
                    i15 = 1;
                } else {
                    i15 = 0;
                }
                return new C32798o(i15, enumC11916a, interfaceC13058lMo36562g, abstractC14373d.f52480w);
            }
        }
        return new C32798o(i15, EnumC11916a.f38982w, interfaceC13058l, C30064k.f122676w);
    }

    /* JADX INFO: renamed from: r */
    public static final InterfaceC13058l m36608r(InterfaceC13058l interfaceC13058l, long j7) {
        if (j7 >= 0) {
            return j7 == 0 ? interfaceC13058l : new C0456u(new C13082s(new C6493d(j7, 1), interfaceC13058l, null));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    /* JADX INFO: renamed from: s */
    public static final C13050j m36609s(InterfaceC4351m interfaceC4351m, InterfaceC13058l interfaceC13058l) {
        AbstractC22681m0.m65774e(2, interfaceC4351m);
        return m36611u(interfaceC13058l, f45231a, interfaceC4351m);
    }

    /* JADX INFO: renamed from: t */
    public static final InterfaceC13058l m36610t(InterfaceC13058l interfaceC13058l) {
        return interfaceC13058l instanceof InterfaceC13037f2 ? interfaceC13058l : m36611u(interfaceC13058l, f45231a, f45232b);
    }

    /* JADX INFO: renamed from: u */
    public static final C13050j m36611u(InterfaceC13058l interfaceC13058l, Function1 function1, InterfaceC4351m interfaceC4351m) {
        if (interfaceC13058l instanceof C13050j) {
            C13050j c13050j = (C13050j) interfaceC13058l;
            if (c13050j.f45103x == function1 && c13050j.f45104y == interfaceC4351m) {
                return c13050j;
            }
        }
        return new C13050j(interfaceC13058l, function1, interfaceC4351m);
    }

    /* JADX INFO: renamed from: v */
    public static final C13043h0 m36612v(InterfaceC13058l interfaceC13058l, int i13) {
        if (i13 >= 0) {
            return new C13043h0(interfaceC13058l, i13);
        }
        throw new IllegalArgumentException(AbstractC2875y.m8295h(i13, "Drop count should be non-negative, but had ").toString());
    }

    /* JADX INFO: renamed from: w */
    public static final Object m36613w(InterfaceC13062m interfaceC13062m, InterfaceC13058l interfaceC13058l, InterfaceC30057d interfaceC30057d) throws Throwable {
        m36615y(interfaceC13062m);
        Object objCollect = interfaceC13058l.collect(interfaceC13062m, interfaceC30057d);
        return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x0071 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #1 {all -> 0x0034, blocks: (B:13:0x002e, B:24:0x0054, B:28:0x0069, B:30:0x0071, B:20:0x0046, B:23:0x0050), top: B:44:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0083 -> B:14:0x0031). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m36614x(ec3.InterfaceC13062m r6, dc3.InterfaceC11938w r7, boolean r8, q83.InterfaceC30057d r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof ec3.C13076q
            if (r0 == 0) goto L13
            r0 = r9
            ec3.q r0 = (ec3.C13076q) r0
            int r1 = r0.f45183F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45183F = r1
            goto L18
        L13:
            ec3.q r0 = new ec3.q
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f45182E
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f45183F
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            boolean r8 = r0.f45187z
            dc3.c r6 = r0.f45186y
            dc3.w r7 = r0.f45185x
            ec3.m r2 = r0.f45184w
            p505ts.AbstractC34132o.m107864I(r9)     // Catch: java.lang.Throwable -> L34
        L31:
            r9 = r6
            r6 = r2
            goto L54
        L34:
            r6 = move-exception
            goto L8f
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3e:
            boolean r8 = r0.f45187z
            dc3.c r6 = r0.f45186y
            dc3.w r7 = r0.f45185x
            ec3.m r2 = r0.f45184w
            p505ts.AbstractC34132o.m107864I(r9)     // Catch: java.lang.Throwable -> L34
            goto L69
        L4a:
            p505ts.AbstractC34132o.m107864I(r9)
            m36615y(r6)
            dc3.c r9 = r7.iterator()     // Catch: java.lang.Throwable -> L34
        L54:
            r0.f45184w = r6     // Catch: java.lang.Throwable -> L34
            r0.f45185x = r7     // Catch: java.lang.Throwable -> L34
            r0.f45186y = r9     // Catch: java.lang.Throwable -> L34
            r0.f45187z = r8     // Catch: java.lang.Throwable -> L34
            r0.f45183F = r4     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r9.m32187a(r0)     // Catch: java.lang.Throwable -> L34
            if (r2 != r1) goto L65
            goto L85
        L65:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L69:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L34
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L34
            if (r9 == 0) goto L86
            java.lang.Object r9 = r6.m32188c()     // Catch: java.lang.Throwable -> L34
            r0.f45184w = r2     // Catch: java.lang.Throwable -> L34
            r0.f45185x = r7     // Catch: java.lang.Throwable -> L34
            r0.f45186y = r6     // Catch: java.lang.Throwable -> L34
            r0.f45187z = r8     // Catch: java.lang.Throwable -> L34
            r0.f45183F = r3     // Catch: java.lang.Throwable -> L34
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L34
            if (r9 != r1) goto L31
        L85:
            return r1
        L86:
            if (r8 == 0) goto L8c
            r6 = 0
            r7.cancel(r6)
        L8c:
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        L8f:
            throw r6     // Catch: java.lang.Throwable -> L90
        L90:
            r9 = move-exception
            if (r8 == 0) goto L96
            p505ts.AbstractC34132o.m107882f(r7, r6)
        L96:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ec3.AbstractC13091v.m36614x(ec3.m, dc3.w, boolean, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: y */
    public static final void m36615y(InterfaceC13062m interfaceC13062m) throws Throwable {
        if (interfaceC13062m instanceof C13069n2) {
            throw ((C13069n2) interfaceC13062m).f45160w;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: z */
    public static final Object m36616z(InterfaceC13058l interfaceC13058l, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        C13016a1 c13016a1;
        C22669g0 c22669g0;
        AbortFlowException e5;
        C13031e0 c13031e0;
        C17191x c17191x = AbstractC14371b.f52477b;
        if (interfaceC30057d instanceof C13016a1) {
            c13016a1 = (C13016a1) interfaceC30057d;
            int i13 = c13016a1.f45004z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c13016a1.f45004z = i13 - Integer.MIN_VALUE;
            } else {
                c13016a1 = new C13016a1(interfaceC30057d);
            }
        } else {
            c13016a1 = new C13016a1(interfaceC30057d);
        }
        Object obj = c13016a1.f45003y;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c13016a1.f45004z;
        if (i14 == 0) {
            C22669g0 c22669g0M32004w = AbstractC11895b.m32004w(obj);
            c22669g0M32004w.f89336w = c17191x;
            C13031e0 c13031e1 = new C13031e0(1, interfaceC4351m, c22669g0M32004w);
            try {
                c13016a1.f45001w = c22669g0M32004w;
                c13016a1.f45002x = c13031e1;
                c13016a1.f45004z = 1;
                if (interfaceC13058l.collect(c13031e1, c13016a1) == obj2) {
                    return obj2;
                }
                c22669g0 = c22669g0M32004w;
            } catch (AbortFlowException e13) {
                c22669g0 = c22669g0M32004w;
                e5 = e13;
                c13031e0 = c13031e1;
                if (e5.f89399w == c13031e0) {
                    throw e5;
                }
                AbstractC3006f0.m8721o(c13016a1.getContext());
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c13031e0 = c13016a1.f45002x;
            c22669g0 = c13016a1.f45001w;
            try {
                AbstractC34132o.m107864I(obj);
            } catch (AbortFlowException e14) {
                e5 = e14;
                if (e5.f89399w == c13031e0) {
                    throw e5;
                }
                AbstractC3006f0.m8721o(c13016a1.getContext());
            }
        }
        Object obj3 = c22669g0.f89336w;
        if (obj3 != c17191x) {
            return obj3;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate");
    }
}
