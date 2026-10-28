package lb3;

import com.squareup.wire.AbstractC5583n;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25271y;
import mb3.C25391h;
import ob3.C27791a;
import ob3.EnumC27792b;
import ob3.EnumC27806p;
import ob3.InterfaceC27793c;
import ob3.InterfaceC27794d;
import ob3.InterfaceC27797g;
import ob3.InterfaceC27798h;
import ob3.InterfaceC27800j;
import ob3.InterfaceC27801k;
import ob3.InterfaceC27802l;
import ob3.InterfaceC27803m;
import ob3.InterfaceC27805o;
import p048ce.AbstractC4482w;
import p097ds.AbstractC12313p;
import p477s2.AbstractC32073e;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import r93.InterfaceC31126h;
import r93.InterfaceC31165x0;
import u93.C34705u0;
import ub3.C34752f;
import ub3.C34754h;
import ug.AbstractC34924m;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: lb3.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C23765d {

    /* JADX INFO: renamed from: a */
    public static final C23765d f94131a = new C23765d();

    /* JADX INFO: renamed from: a */
    public static final boolean m69829a(InterfaceC27805o c3, InterfaceC27798h interfaceC27798h) {
        AbstractC22676k.m65750j(c3, "c");
        if (!c3.mo74540P(interfaceC27798h)) {
            if (!(interfaceC27798h instanceof InterfaceC27794d)) {
                return false;
            }
            InterfaceC27793c interfaceC27793cMo74567k = c3.mo74567k((InterfaceC27794d) interfaceC27798h);
            AbstractC22676k.m65750j(interfaceC27793cMo74567k, "<this>");
            InterfaceC27797g interfaceC27797gM92083A = AbstractC30060g.m92083A(c3, c3.mo74586x(interfaceC27793cMo74567k));
            if (interfaceC27797gM92083A == null || !c3.mo74540P(c3.mo74570l0(interfaceC27797gM92083A))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m69830b(InterfaceC27805o c3, C23794p0 c23794p0, InterfaceC27798h interfaceC27798h, InterfaceC27798h interfaceC27798h2, boolean z4) {
        AbstractC22676k.m65750j(c3, "c");
        Collection<InterfaceC27797g> collectionMo74548X = c3.mo74548X(interfaceC27798h);
        if ((collectionMo74548X instanceof Collection) && collectionMo74548X.isEmpty()) {
            return false;
        }
        for (InterfaceC27797g interfaceC27797g : collectionMo74548X) {
            if (AbstractC22676k.m65745e(AbstractC30060g.m92112d0(c3, interfaceC27797g), AbstractC30060g.m92114e0(c3, interfaceC27798h2))) {
                return true;
            }
            if (z4 && m69837k(f94131a, c23794p0, interfaceC27798h2, interfaceC27797g)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static List m69831c(C23794p0 c23794p0, InterfaceC27805o c3, InterfaceC27798h interfaceC27798h, InterfaceC27802l interfaceC27802l) {
        AbstractC32073e abstractC32073eMo74573n;
        C23792o0 c23792o0 = C23792o0.f94173c;
        AbstractC22676k.m65750j(c3, "c");
        c3.mo74534I(interfaceC27798h, interfaceC27802l);
        if (c3.mo74528C(interfaceC27802l) || !c3.mo74565j(interfaceC27798h)) {
            if (!c3.mo74535J(interfaceC27802l)) {
                C34752f c34752f = new C34752f();
                c23794p0.m69905c();
                InterfaceC27805o interfaceC27805o = c23794p0.f94180c;
                ArrayDeque arrayDeque = c23794p0.f94184g;
                AbstractC22676k.m65747g(arrayDeque);
                C34754h c34754h = c23794p0.f94185h;
                AbstractC22676k.m65747g(c34754h);
                arrayDeque.push(interfaceC27798h);
                while (!arrayDeque.isEmpty()) {
                    InterfaceC27798h interfaceC27798h2 = (InterfaceC27798h) arrayDeque.pop();
                    AbstractC22676k.m65747g(interfaceC27798h2);
                    if (c34754h.add(interfaceC27798h2)) {
                        EnumC27792b enumC27792b = EnumC27792b.f112043w;
                        InterfaceC27798h interfaceC27798hMo74532G = c3.mo74532G(interfaceC27798h2);
                        if (interfaceC27798hMo74532G == null) {
                            interfaceC27798hMo74532G = interfaceC27798h2;
                        }
                        if (c3.mo74533H(AbstractC30060g.m92114e0(c3, interfaceC27798hMo74532G), interfaceC27802l)) {
                            c34752f.add(interfaceC27798hMo74532G);
                            abstractC32073eMo74573n = c23792o0;
                        } else {
                            abstractC32073eMo74573n = c3.mo74559g(interfaceC27798hMo74532G) == 0 ? C23792o0.f94172b : interfaceC27805o.mo74573n(interfaceC27798hMo74532G);
                        }
                        if (abstractC32073eMo74573n.equals(c23792o0)) {
                            abstractC32073eMo74573n = null;
                        }
                        if (abstractC32073eMo74573n != null) {
                            Iterator it = interfaceC27805o.mo74582s(interfaceC27805o.mo74544T(interfaceC27798h2)).iterator();
                            while (it.hasNext()) {
                                arrayDeque.add(abstractC32073eMo74573n.mo69898i0(c23794p0, (InterfaceC27797g) it.next()));
                            }
                        }
                    }
                }
                c23794p0.m69903a();
                return c34752f;
            }
            if (c3.mo74533H(AbstractC30060g.m92114e0(c3, interfaceC27798h), interfaceC27802l)) {
                EnumC27792b enumC27792b2 = EnumC27792b.f112043w;
                InterfaceC27798h interfaceC27798hMo74532G2 = c3.mo74532G(interfaceC27798h);
                if (interfaceC27798hMo74532G2 != null) {
                    interfaceC27798h = interfaceC27798hMo74532G2;
                }
                return AbstractC37056f.m118958J(interfaceC27798h);
            }
        }
        return C25271y.f99162w;
    }

    /* JADX INFO: renamed from: d */
    public static List m69832d(C23794p0 c23794p0, InterfaceC27805o interfaceC27805o, InterfaceC27798h interfaceC27798h, InterfaceC27802l interfaceC27802l) {
        List listM69831c = m69831c(c23794p0, interfaceC27805o, interfaceC27798h, interfaceC27802l);
        if (listM69831c.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM69831c) {
                InterfaceC27798h interfaceC27798h2 = (InterfaceC27798h) obj;
                AbstractC22676k.m65750j(interfaceC27798h2, "<this>");
                InterfaceC27800j interfaceC27800jMo74537M = interfaceC27805o.mo74537M(interfaceC27798h2);
                int iMo74549Y = interfaceC27805o.mo74549Y(interfaceC27800jMo74537M);
                int i13 = 0;
                while (true) {
                    if (i13 >= iMo74549Y) {
                        arrayList.add(obj);
                        break;
                    }
                    InterfaceC27797g interfaceC27797gM92083A = AbstractC30060g.m92083A(interfaceC27805o, interfaceC27805o.mo74529D(interfaceC27800jMo74537M, i13));
                    if ((interfaceC27797gM92083A != null ? interfaceC27805o.mo74581r(interfaceC27797gM92083A) : null) != null) {
                        break;
                    }
                    i13++;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return listM69831c;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m69833g(C23794p0 c23794p0, InterfaceC27797g a5, InterfaceC27797g b) {
        AbstractC22676k.m65750j(a5, "a");
        AbstractC22676k.m65750j(b, "b");
        InterfaceC27805o interfaceC27805o = c23794p0.f94180c;
        if (a5 == b) {
            return true;
        }
        if (m69835i(interfaceC27805o, a5) && m69835i(interfaceC27805o, b)) {
            AbstractC23773f1 abstractC23773f1M69906d = c23794p0.m69906d(c23794p0.m69907e(a5));
            AbstractC23773f1 abstractC23773f1M69906d2 = c23794p0.m69906d(c23794p0.m69907e(b));
            InterfaceC27798h interfaceC27798hMo74557f = interfaceC27805o.mo74557f(abstractC23773f1M69906d);
            if (!interfaceC27805o.mo74533H(interfaceC27805o.mo74538N(abstractC23773f1M69906d), interfaceC27805o.mo74538N(abstractC23773f1M69906d2))) {
                return false;
            }
            if (interfaceC27805o.mo74559g(interfaceC27798hMo74557f) == 0) {
                return interfaceC27805o.mo74547W(abstractC23773f1M69906d) || interfaceC27805o.mo74547W(abstractC23773f1M69906d2) || interfaceC27805o.mo74542R(interfaceC27798hMo74557f) == interfaceC27805o.mo74542R(interfaceC27805o.mo74557f(abstractC23773f1M69906d2));
            }
        }
        C23765d c23765d = f94131a;
        return m69837k(c23765d, c23794p0, a5, b) && m69837k(c23765d, c23794p0, b, a5);
    }

    /* JADX INFO: renamed from: h */
    public static InterfaceC27803m m69834h(InterfaceC27805o c3, InterfaceC27797g interfaceC27797g, InterfaceC27798h interfaceC27798h) {
        InterfaceC27797g interfaceC27797gM92083A;
        AbstractC22676k.m65750j(c3, "c");
        int iMo74559g = c3.mo74559g(interfaceC27797g);
        int i13 = 0;
        while (true) {
            if (i13 >= iMo74559g) {
                return null;
            }
            InterfaceC27801k interfaceC27801kMo74536K = c3.mo74536K(interfaceC27797g, i13);
            AbstractC22676k.m65750j(interfaceC27801kMo74536K, "<this>");
            InterfaceC27801k interfaceC27801k = c3.mo74527B(interfaceC27801kMo74536K) ? null : interfaceC27801kMo74536K;
            if (interfaceC27801k != null && (interfaceC27797gM92083A = AbstractC30060g.m92083A(c3, interfaceC27801k)) != null) {
                boolean z4 = c3.mo74555e(AbstractC30060g.m92090L(c3, interfaceC27797gM92083A)) && c3.mo74555e(AbstractC30060g.m92090L(c3, interfaceC27798h));
                if (interfaceC27797gM92083A.equals(interfaceC27798h) || (z4 && AbstractC22676k.m65745e(AbstractC30060g.m92112d0(c3, interfaceC27797gM92083A), AbstractC30060g.m92112d0(c3, interfaceC27798h)))) {
                    InterfaceC27802l interfaceC27802lM92112d0 = AbstractC30060g.m92112d0(c3, interfaceC27797g);
                    AbstractC22676k.m65750j(interfaceC27802lM92112d0, "<this>");
                    return c3.mo74553c0(interfaceC27802lM92112d0, i13);
                }
                InterfaceC27803m interfaceC27803mM69834h = m69834h(c3, interfaceC27797gM92083A, interfaceC27798h);
                if (interfaceC27803mM69834h != null) {
                    return interfaceC27803mM69834h;
                }
            }
            i13++;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m69835i(InterfaceC27805o interfaceC27805o, InterfaceC27797g interfaceC27797g) {
        InterfaceC27802l interfaceC27802lM92112d0 = AbstractC30060g.m92112d0(interfaceC27805o, interfaceC27797g);
        AbstractC22676k.m65750j(interfaceC27802lM92112d0, "<this>");
        if (!interfaceC27805o.mo74583t(interfaceC27802lM92112d0)) {
            return false;
        }
        interfaceC27805o.mo74545U(interfaceC27797g);
        return (interfaceC27805o.mo74558f0(interfaceC27797g) || interfaceC27805o.mo74575o(interfaceC27797g) || interfaceC27805o.mo74526A(interfaceC27797g)) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m69836j(C23794p0 c23794p0, InterfaceC27805o c3, InterfaceC27800j capturedSubArguments, InterfaceC27798h interfaceC27798h) {
        boolean zM69837k;
        AbstractC22676k.m65750j(c3, "c");
        AbstractC22676k.m65750j(capturedSubArguments, "capturedSubArguments");
        InterfaceC27802l interfaceC27802lM92114e0 = AbstractC30060g.m92114e0(c3, interfaceC27798h);
        int iMo74549Y = c3.mo74549Y(capturedSubArguments);
        int iM92092N = AbstractC30060g.m92092N(c3, interfaceC27802lM92114e0);
        if (iMo74549Y == iM92092N && iMo74549Y == c3.mo74559g(interfaceC27798h)) {
            for (int i13 = 0; i13 < iM92092N; i13++) {
                InterfaceC27801k interfaceC27801kMo74536K = c3.mo74536K(interfaceC27798h, i13);
                InterfaceC27797g interfaceC27797gM92083A = AbstractC30060g.m92083A(c3, interfaceC27801kMo74536K);
                if (interfaceC27797gM92083A != null) {
                    InterfaceC27801k interfaceC27801kMo74529D = c3.mo74529D(capturedSubArguments, i13);
                    AbstractC22676k.m65750j(interfaceC27801kMo74529D, "<this>");
                    c3.mo74563i(interfaceC27801kMo74529D);
                    EnumC27806p enumC27806p = EnumC27806p.INV;
                    InterfaceC27797g interfaceC27797gM92083A2 = AbstractC30060g.m92083A(c3, interfaceC27801kMo74529D);
                    AbstractC22676k.m65747g(interfaceC27797gM92083A2);
                    EnumC27806p enumC27806pMo74569l = c3.mo74569l(c3.mo74553c0(interfaceC27802lM92114e0, i13));
                    EnumC27806p enumC27806pMo74563i = c3.mo74563i(interfaceC27801kMo74536K);
                    if (enumC27806pMo74569l == enumC27806p) {
                        enumC27806pMo74569l = enumC27806pMo74563i;
                    } else if (enumC27806pMo74563i != enumC27806p && enumC27806pMo74569l != enumC27806pMo74563i) {
                        enumC27806pMo74569l = null;
                    }
                    if (enumC27806pMo74569l == null) {
                        return c23794p0.f94178a;
                    }
                    if (enumC27806pMo74569l == enumC27806p) {
                        m69838l(c3, interfaceC27797gM92083A2, interfaceC27797gM92083A);
                        m69838l(c3, interfaceC27797gM92083A, interfaceC27797gM92083A2);
                    }
                    int i14 = c23794p0.f94183f;
                    if (i14 > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + interfaceC27797gM92083A2).toString());
                    }
                    c23794p0.f94183f = i14 + 1;
                    int iOrdinal = enumC27806pMo74569l.ordinal();
                    C23765d c23765d = f94131a;
                    if (iOrdinal == 0) {
                        zM69837k = m69837k(c23765d, c23794p0, interfaceC27797gM92083A, interfaceC27797gM92083A2);
                    } else if (iOrdinal == 1) {
                        zM69837k = m69837k(c23765d, c23794p0, interfaceC27797gM92083A2, interfaceC27797gM92083A);
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zM69837k = m69833g(c23794p0, interfaceC27797gM92083A2, interfaceC27797gM92083A);
                    }
                    c23794p0.f94183f--;
                    if (!zM69837k) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m69837k(C23765d c23765d, C23794p0 c23794p0, InterfaceC27797g subType, InterfaceC27797g superType) {
        AbstractC22676k.m65750j(subType, "subType");
        AbstractC22676k.m65750j(superType, "superType");
        if (subType == superType) {
            return true;
        }
        if (!c23794p0.m69904b(subType, superType)) {
            return false;
        }
        return f94131a.m69840e(c23794p0, c23794p0.f94180c, subType, superType);
    }

    /* JADX INFO: renamed from: l */
    public static void m69838l(InterfaceC27805o interfaceC27805o, InterfaceC27797g interfaceC27797g, InterfaceC27797g interfaceC27797g2) {
        InterfaceC27798h interfaceC27798hM92121k = AbstractC30060g.m92121k(interfaceC27805o, interfaceC27797g);
        if (interfaceC27798hM92121k instanceof InterfaceC27794d) {
            InterfaceC27794d interfaceC27794d = (InterfaceC27794d) interfaceC27798hM92121k;
            if (interfaceC27805o.mo74560g0(interfaceC27794d)) {
                return;
            }
            InterfaceC27793c interfaceC27793cMo74567k = interfaceC27805o.mo74567k(interfaceC27794d);
            AbstractC22676k.m65750j(interfaceC27793cMo74567k, "<this>");
            InterfaceC27801k interfaceC27801kMo74586x = interfaceC27805o.mo74586x(interfaceC27793cMo74567k);
            AbstractC22676k.m65750j(interfaceC27801kMo74586x, "<this>");
            if (interfaceC27805o.mo74527B(interfaceC27801kMo74586x) && interfaceC27805o.mo74539O(interfaceC27794d) == EnumC27792b.f112043w) {
                AbstractC30060g.m92112d0(interfaceC27805o, interfaceC27797g2);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static C23785l m69839m(AbstractC23773f1 type, boolean z4) {
        boolean zM69849e;
        AbstractC22676k.m65750j(type, "type");
        if (type instanceof C23785l) {
            return (C23785l) type;
        }
        type.mo69844i0();
        if ((type.mo69844i0().mo1784d() instanceof InterfaceC31165x0) || (type instanceof C25391h)) {
            InterfaceC31126h interfaceC31126hMo1784d = type.mo69844i0().mo1784d();
            C34705u0 c34705u0 = interfaceC31126hMo1784d instanceof C34705u0 ? (C34705u0) interfaceC31126hMo1784d : null;
            zM69849e = true;
            if (c34705u0 == null || c34705u0.m109621O0()) {
                zM69849e = (z4 && (type.mo69844i0().mo1784d() instanceof InterfaceC31165x0)) ? AbstractC23767d1.m69849e(type) : true ^ AbstractC34924m.m110126H(type);
            }
        } else {
            zM69849e = false;
        }
        if (!zM69849e) {
            return null;
        }
        if (type instanceof AbstractC23797r) {
            AbstractC23797r abstractC23797r = (AbstractC23797r) type;
            AbstractC22676k.m65745e(abstractC23797r.f94187x.mo69844i0(), abstractC23797r.f94188y.mo69844i0());
        }
        return new C23785l(AbstractC12313p.m34261M(type).mo64125r0(false), z4);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:155:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:158:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:162:0x02db  */
    /* JADX WARN: Code duplicated, block: B:164:0x02de  */
    /* JADX WARN: Code duplicated, block: B:166:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:171:0x0302  */
    /* JADX WARN: Code duplicated, block: B:173:0x0305  */
    /* JADX WARN: Code duplicated, block: B:176:0x0318  */
    /* JADX WARN: Code duplicated, block: B:178:0x0327  */
    /* JADX WARN: Code duplicated, block: B:181:0x0332  */
    /* JADX WARN: Code duplicated, block: B:189:0x037e  */
    /* JADX WARN: Code duplicated, block: B:197:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:199:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:201:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:203:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:207:0x03da  */
    /* JADX WARN: Code duplicated, block: B:210:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:212:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:214:0x0405  */
    /* JADX WARN: Code duplicated, block: B:215:0x0407  */
    /* JADX WARN: Code duplicated, block: B:219:0x040f  */
    /* JADX WARN: Code duplicated, block: B:225:0x0425  */
    /* JADX WARN: Code duplicated, block: B:229:0x0442 A[LOOP:4: B:223:0x041f->B:229:0x0442, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:235:0x02d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:0x0345 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:244:0x0448 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x0413 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x043c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x03ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:77:0x0156  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16, types: [int] */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r21v0, types: [ob3.o] */
    /* JADX INFO: renamed from: e */
    public boolean m69840e(C23794p0 c23794p0, InterfaceC27805o interfaceC27805o, InterfaceC27797g interfaceC27797g, InterfaceC27797g interfaceC27797g2) {
        Boolean boolValueOf;
        Boolean bool;
        boolean z4;
        List listM69831c;
        C23792o0 c23792o0;
        ArrayList<InterfaceC27798h> arrayList;
        int i13;
        int size;
        InterfaceC27802l interfaceC27802lM92114e0;
        InterfaceC27802l interfaceC27802lM92114e1;
        ArrayDeque arrayDeque;
        C34754h c34754h;
        InterfaceC27798h interfaceC27798h;
        C23792o0 c23792o1;
        Iterator it;
        InterfaceC27798h interfaceC27798hMo69898i0;
        InterfaceC27802l interfaceC27802lM92114e2;
        C27791a c27791a;
        int iM92092N;
        boolean z13;
        boolean z14;
        ?? r10;
        boolean z15;
        int i14;
        InterfaceC27801k interfaceC27801kMo74543S;
        InterfaceC27797g interfaceC27797gM92083A;
        InterfaceC27798h interfaceC27798hM92121k;
        InterfaceC27803m interfaceC27803mM69834h;
        boolean z16;
        AbstractC23773f1 abstractC23773f1M69906d = c23794p0.m69906d(c23794p0.m69907e(interfaceC27797g));
        AbstractC23773f1 abstractC23773f1M69906d2 = c23794p0.m69906d(c23794p0.m69907e(interfaceC27797g2));
        InterfaceC27798h interfaceC27798hM92090L = AbstractC30060g.m92090L(interfaceC27805o, abstractC23773f1M69906d);
        AbstractC22676k.m65750j(abstractC23773f1M69906d2, "<this>");
        InterfaceC27798h interfaceC27798hMo74570l0 = interfaceC27805o.mo74570l0(abstractC23773f1M69906d2);
        boolean z17 = false;
        if (!interfaceC27805o.mo74566j0(interfaceC27798hM92090L) && !interfaceC27805o.mo74566j0(interfaceC27798hMo74570l0)) {
            interfaceC27805o.mo74577p(interfaceC27798hM92090L);
            interfaceC27805o.mo74551a0(interfaceC27798hM92090L);
            interfaceC27805o.mo74551a0(interfaceC27798hMo74570l0);
            InterfaceC27794d interfaceC27794dMo74564i0 = interfaceC27805o.mo74564i0(interfaceC27798hMo74570l0);
            InterfaceC27797g interfaceC27797gMo74568k0 = interfaceC27794dMo74564i0 != null ? interfaceC27805o.mo74568k0(interfaceC27794dMo74564i0) : null;
            if (interfaceC27794dMo74564i0 != null && interfaceC27797gMo74568k0 != null) {
                if (AbstractC30060g.m92085E(interfaceC27805o, interfaceC27798hMo74570l0)) {
                    interfaceC27797gMo74568k0 = interfaceC27805o.mo74541Q(interfaceC27797gMo74568k0);
                } else if (interfaceC27805o.mo74571m(interfaceC27798hMo74570l0)) {
                    interfaceC27797gMo74568k0 = interfaceC27805o.mo74531F(interfaceC27797gMo74568k0);
                }
                EnumC23788m0[] enumC23788m0Arr = EnumC23788m0.f94170w;
                if (m69837k(this, c23794p0, interfaceC27798hM92090L, interfaceC27797gMo74568k0)) {
                    boolValueOf = Boolean.TRUE;
                }
            }
            InterfaceC27802l interfaceC27802lM92114e3 = AbstractC30060g.m92114e0(interfaceC27805o, interfaceC27798hMo74570l0);
            AbstractC22676k.m65750j(interfaceC27802lM92114e3, "<this>");
            if (interfaceC27805o.mo74585v(interfaceC27802lM92114e3)) {
                AbstractC30060g.m92085E(interfaceC27805o, interfaceC27798hMo74570l0);
                Collection collectionMo74582s = interfaceC27805o.mo74582s(interfaceC27802lM92114e3);
                if (!(collectionMo74582s instanceof Collection) || !collectionMo74582s.isEmpty()) {
                    Iterator it3 = collectionMo74582s.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z16 = true;
                            break;
                        }
                        if (!m69837k(f94131a, c23794p0, interfaceC27798hM92090L, (InterfaceC27797g) it3.next())) {
                            z16 = false;
                            break;
                        }
                    }
                } else {
                    z16 = true;
                    break;
                }
                boolValueOf = Boolean.valueOf(z16);
            } else {
                InterfaceC27802l interfaceC27802lM92114e4 = AbstractC30060g.m92114e0(interfaceC27805o, interfaceC27798hM92090L);
                if (interfaceC27798hM92090L instanceof InterfaceC27794d) {
                    interfaceC27803mM69834h = m69834h(interfaceC27805o, interfaceC27798hMo74570l0, interfaceC27798hM92090L);
                    boolValueOf = interfaceC27803mM69834h == null ? null : null;
                } else {
                    AbstractC22676k.m65750j(interfaceC27802lM92114e4, "<this>");
                    if (interfaceC27805o.mo74585v(interfaceC27802lM92114e4)) {
                        Collection collectionMo74582s2 = interfaceC27805o.mo74582s(interfaceC27802lM92114e4);
                        if ((collectionMo74582s2 instanceof Collection) && collectionMo74582s2.isEmpty()) {
                            interfaceC27803mM69834h = m69834h(interfaceC27805o, interfaceC27798hMo74570l0, interfaceC27798hM92090L);
                            if (interfaceC27803mM69834h == null) {
                            }
                        } else {
                            Iterator it4 = collectionMo74582s2.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    interfaceC27803mM69834h = m69834h(interfaceC27805o, interfaceC27798hMo74570l0, interfaceC27798hM92090L);
                                    if (interfaceC27803mM69834h == null && interfaceC27805o.mo74579q(interfaceC27803mM69834h, AbstractC30060g.m92114e0(interfaceC27805o, interfaceC27798hMo74570l0))) {
                                        boolValueOf = Boolean.TRUE;
                                    }
                                } else if (!(((InterfaceC27797g) it4.next()) instanceof InterfaceC27794d)) {
                                }
                            }
                        }
                    }
                }
            }
        } else if (c23794p0.f94178a) {
            boolValueOf = Boolean.TRUE;
        } else {
            boolValueOf = (!AbstractC30060g.m92085E(interfaceC27805o, interfaceC27798hM92090L) || AbstractC30060g.m92085E(interfaceC27805o, interfaceC27798hMo74570l0)) ? Boolean.valueOf(AbstractC5583n.m16774d0(interfaceC27805o, interfaceC27805o.mo74460d(interfaceC27798hM92090L), interfaceC27805o.mo74460d(interfaceC27798hMo74570l0))) : Boolean.FALSE;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        InterfaceC27798h interfaceC27798hM92090L2 = AbstractC30060g.m92090L(interfaceC27805o, abstractC23773f1M69906d);
        InterfaceC27798h interfaceC27798hMo74570l1 = interfaceC27805o.mo74570l0(abstractC23773f1M69906d2);
        C23792o0 c23792o2 = C23792o0.f94172b;
        C23792o0 c23792o3 = C23792o0.f94173c;
        boolean zM13987X = AbstractC4482w.m13987X(c23794p0, interfaceC27798hM92090L2, interfaceC27798hMo74570l1);
        InterfaceC27805o c3 = c23794p0.f94180c;
        if (!zM13987X) {
            return false;
        }
        if (!interfaceC27805o.mo74540P(interfaceC27798hM92090L2) && !interfaceC27805o.mo74540P(interfaceC27798hMo74570l1)) {
            bool = null;
        } else if (m69829a(interfaceC27805o, interfaceC27798hM92090L2) && m69829a(interfaceC27805o, interfaceC27798hMo74570l1)) {
            bool = Boolean.TRUE;
        } else if (interfaceC27805o.mo74540P(interfaceC27798hM92090L2)) {
            if (m69830b(interfaceC27805o, c23794p0, interfaceC27798hM92090L2, interfaceC27798hMo74570l1, false)) {
                bool = Boolean.TRUE;
            } else {
                bool = null;
            }
        } else if (interfaceC27805o.mo74540P(interfaceC27798hMo74570l1)) {
            InterfaceC27802l interfaceC27802lM92114e5 = AbstractC30060g.m92114e0(interfaceC27805o, interfaceC27798hM92090L2);
            if (interfaceC27802lM92114e5 instanceof C23809x) {
                Collection collectionMo74582s3 = interfaceC27805o.mo74582s(interfaceC27802lM92114e5);
                if (!(collectionMo74582s3 instanceof Collection) || !collectionMo74582s3.isEmpty()) {
                    Iterator it5 = collectionMo74582s3.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            InterfaceC27798h interfaceC27798hM92121k2 = AbstractC30060g.m92121k(interfaceC27805o, (InterfaceC27797g) it5.next());
                            if (interfaceC27798hM92121k2 == null || !interfaceC27805o.mo74540P(interfaceC27798hM92121k2)) {
                            }
                        } else if (!m69830b(interfaceC27805o, c23794p0, interfaceC27798hMo74570l1, interfaceC27798hM92090L2, true)) {
                            bool = null;
                        }
                    }
                } else if (!m69830b(interfaceC27805o, c23794p0, interfaceC27798hMo74570l1, interfaceC27798hM92090L2, true)) {
                    bool = null;
                }
            } else if (!m69830b(interfaceC27805o, c23794p0, interfaceC27798hMo74570l1, interfaceC27798hM92090L2, true)) {
                bool = null;
            }
            bool = Boolean.TRUE;
        } else {
            bool = null;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        InterfaceC27802l superConstructor = AbstractC30060g.m92114e0(interfaceC27805o, interfaceC27798hMo74570l1);
        if (!interfaceC27805o.mo74533H(AbstractC30060g.m92114e0(interfaceC27805o, interfaceC27798hM92090L2), superConstructor) || AbstractC30060g.m92092N(interfaceC27805o, superConstructor) != 0) {
            InterfaceC27802l interfaceC27802lM92114e6 = AbstractC30060g.m92114e0(interfaceC27805o, interfaceC27798hMo74570l1);
            AbstractC22676k.m65750j(interfaceC27802lM92114e6, "<this>");
            if (!interfaceC27805o.mo74552b0(interfaceC27802lM92114e6)) {
                AbstractC22676k.m65750j(superConstructor, "superConstructor");
                AbstractC22676k.m65750j(c3, "c");
                if (!c3.mo74565j(interfaceC27798hM92090L2)) {
                    if (c3.mo74528C(superConstructor) || c3.mo74572m0(superConstructor)) {
                        C34752f<InterfaceC27798h> c34752f = new C34752f();
                        c23794p0.m69905c();
                        ArrayDeque arrayDeque2 = c23794p0.f94184g;
                        AbstractC22676k.m65747g(arrayDeque2);
                        C34754h c34754h2 = c23794p0.f94185h;
                        AbstractC22676k.m65747g(c34754h2);
                        arrayDeque2.push(interfaceC27798hM92090L2);
                        while (!arrayDeque2.isEmpty()) {
                            boolean z18 = z17;
                            InterfaceC27798h interfaceC27798h2 = (InterfaceC27798h) arrayDeque2.pop();
                            AbstractC22676k.m65747g(interfaceC27798h2);
                            if (c34754h2.add(interfaceC27798h2)) {
                                if (c3.mo74565j(interfaceC27798h2)) {
                                    c34752f.add(interfaceC27798h2);
                                    c23792o0 = c23792o3;
                                } else {
                                    c23792o0 = c23792o2;
                                }
                                if (c23792o0.equals(c23792o3)) {
                                    c23792o0 = null;
                                }
                                if (c23792o0 != null) {
                                    Iterator it6 = c3.mo74582s(c3.mo74544T(interfaceC27798h2)).iterator();
                                    while (it6.hasNext()) {
                                        arrayDeque2.add(c23792o0.mo69898i0(c23794p0, (InterfaceC27797g) it6.next()));
                                    }
                                }
                            }
                            z17 = z18;
                        }
                        z4 = z17;
                        c23794p0.m69903a();
                        ArrayList arrayList2 = new ArrayList();
                        for (InterfaceC27798h interfaceC27798h3 : c34752f) {
                            AbstractC22676k.m65747g(interfaceC27798h3);
                            AbstractC25265s.m74141p0(arrayList2, m69832d(c23794p0, c3, interfaceC27798h3, superConstructor));
                        }
                        listM69831c = arrayList2;
                    } else {
                        listM69831c = m69831c(c23794p0, c3, interfaceC27798hM92090L2, superConstructor);
                    }
                    listM69831c.size();
                    List<InterfaceC27798h> list = listM69831c;
                    i13 = 10;
                    arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                    for (InterfaceC27798h interfaceC27798h4 : list) {
                        interfaceC27798hM92121k = AbstractC30060g.m92121k(interfaceC27805o, c23794p0.m69906d(interfaceC27798h4));
                        if (interfaceC27798hM92121k == null) {
                            interfaceC27798h4 = interfaceC27798hM92121k;
                        }
                        arrayList.add(interfaceC27798h4);
                    }
                    size = arrayList.size();
                    if (size == 0) {
                        interfaceC27802lM92114e0 = AbstractC30060g.m92114e0(interfaceC27805o, interfaceC27798hM92090L2);
                        AbstractC22676k.m65750j(interfaceC27802lM92114e0, "<this>");
                        if (interfaceC27805o.mo74528C(interfaceC27802lM92114e0)) {
                            return interfaceC27805o.mo74584u(interfaceC27802lM92114e0);
                        }
                        interfaceC27802lM92114e1 = AbstractC30060g.m92114e0(interfaceC27805o, interfaceC27798hM92090L2);
                        AbstractC22676k.m65750j(interfaceC27802lM92114e1, "<this>");
                        if (!interfaceC27805o.mo74584u(interfaceC27802lM92114e1)) {
                            c23794p0.m69905c();
                            arrayDeque = c23794p0.f94184g;
                            AbstractC22676k.m65747g(arrayDeque);
                            c34754h = c23794p0.f94185h;
                            AbstractC22676k.m65747g(c34754h);
                            arrayDeque.push(interfaceC27798hM92090L2);
                            while (!arrayDeque.isEmpty()) {
                                interfaceC27798h = (InterfaceC27798h) arrayDeque.pop();
                                AbstractC22676k.m65747g(interfaceC27798h);
                                if (!c34754h.add(interfaceC27798h)) {
                                    if (interfaceC27805o.mo74565j(interfaceC27798h)) {
                                        c23792o1 = c23792o3;
                                    } else {
                                        c23792o1 = c23792o2;
                                    }
                                    if (c23792o1.equals(c23792o3)) {
                                        c23792o1 = null;
                                    }
                                    if (c23792o1 == null) {
                                        continue;
                                    } else {
                                        it = c3.mo74582s(c3.mo74544T(interfaceC27798h)).iterator();
                                        while (it.hasNext()) {
                                            interfaceC27798hMo69898i0 = c23792o1.mo69898i0(c23794p0, (InterfaceC27797g) it.next());
                                            interfaceC27802lM92114e2 = AbstractC30060g.m92114e0(interfaceC27805o, interfaceC27798hMo69898i0);
                                            AbstractC22676k.m65750j(interfaceC27802lM92114e2, "<this>");
                                            if (interfaceC27805o.mo74584u(interfaceC27802lM92114e2)) {
                                                c23794p0.m69903a();
                                                return true;
                                            }
                                            arrayDeque.add(interfaceC27798hMo69898i0);
                                        }
                                    }
                                }
                            }
                            c23794p0.m69903a();
                            return z4;
                        }
                    } else {
                        if (size != 1) {
                            InterfaceC27798h interfaceC27798h5 = (InterfaceC27798h) AbstractC25265s.m74094E0(arrayList);
                            AbstractC22676k.m65750j(interfaceC27798h5, "<this>");
                            return m69836j(c23794p0, interfaceC27805o, interfaceC27805o.mo74537M(interfaceC27798h5), interfaceC27798hMo74570l1);
                        }
                        c27791a = new C27791a(AbstractC30060g.m92092N(interfaceC27805o, superConstructor));
                        iM92092N = AbstractC30060g.m92092N(interfaceC27805o, superConstructor);
                        z13 = z4;
                        z14 = z13;
                        while (r10 < iM92092N) {
                            if (z14 && interfaceC27805o.mo74569l(interfaceC27805o.mo74553c0(superConstructor, r10)) == EnumC27806p.OUT) {
                                z15 = z4;
                            } else {
                                z15 = true;
                            }
                            if (z15) {
                                i14 = iM92092N;
                            } else {
                                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList, i13));
                                for (InterfaceC27798h interfaceC27798h6 : arrayList) {
                                    AbstractC22676k.m65750j(interfaceC27798h6, "<this>");
                                    interfaceC27801kMo74543S = interfaceC27805o.mo74543S(interfaceC27798h6, r10);
                                    if (interfaceC27801kMo74543S != null) {
                                        int i15 = iM92092N;
                                        if (interfaceC27805o.mo74563i(interfaceC27801kMo74543S) != EnumC27806p.INV) {
                                            interfaceC27801kMo74543S = null;
                                        }
                                        if (interfaceC27801kMo74543S == null && (interfaceC27797gM92083A = AbstractC30060g.m92083A(interfaceC27805o, interfaceC27801kMo74543S)) != null) {
                                            arrayList3.add(interfaceC27797gM92083A);
                                            iM92092N = i15;
                                        }
                                    }
                                    throw new IllegalStateException(("Incorrect type: " + interfaceC27798h6 + ", subType: " + interfaceC27798hM92090L2 + ", superType: " + interfaceC27798hMo74570l1).toString());
                                }
                                i14 = iM92092N;
                                InterfaceC27797g interfaceC27797gMo74588z = interfaceC27805o.mo74588z(arrayList3);
                                AbstractC22676k.m65750j(interfaceC27797gMo74588z, "<this>");
                                c27791a.add(interfaceC27805o.mo74556e0(interfaceC27797gMo74588z));
                            }
                            iM92092N = i14;
                            i13 = 10;
                            r10++;
                            z14 = z15;
                        }
                        if (!z14 || !m69836j(c23794p0, interfaceC27805o, c27791a, interfaceC27798hMo74570l1)) {
                            r10 = z13;
                            r10 = z13;
                            C23762c c23762c = new C23762c(arrayList, c23794p0, interfaceC27805o, interfaceC27798hMo74570l1);
                            C23786l0 c23786l0 = new C23786l0();
                            c23762c.invoke(c23786l0);
                            return c23786l0.m69881a();
                        }
                    }
                    r10 = z13;
                    return true;
                }
                listM69831c = m69832d(c23794p0, c3, interfaceC27798hM92090L2, superConstructor);
                z4 = false;
                listM69831c.size();
                List<InterfaceC27798h> list2 = listM69831c;
                i13 = 10;
                arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                while (r10.hasNext()) {
                    interfaceC27798hM92121k = AbstractC30060g.m92121k(interfaceC27805o, c23794p0.m69906d(interfaceC27798h4));
                    if (interfaceC27798hM92121k == null) {
                        interfaceC27798h4 = interfaceC27798hM92121k;
                    }
                    arrayList.add(interfaceC27798h4);
                }
                size = arrayList.size();
                if (size == 0) {
                    if (size != 1) {
                        InterfaceC27798h interfaceC27798h7 = (InterfaceC27798h) AbstractC25265s.m74094E0(arrayList);
                        AbstractC22676k.m65750j(interfaceC27798h7, "<this>");
                        return m69836j(c23794p0, interfaceC27805o, interfaceC27805o.mo74537M(interfaceC27798h7), interfaceC27798hMo74570l1);
                    }
                    c27791a = new C27791a(AbstractC30060g.m92092N(interfaceC27805o, superConstructor));
                    iM92092N = AbstractC30060g.m92092N(interfaceC27805o, superConstructor);
                    z13 = z4;
                    z14 = z13;
                    while (r10 < iM92092N) {
                        if (z14) {
                            z15 = true;
                        } else {
                            z15 = true;
                        }
                        if (z15) {
                            ArrayList arrayList4 = new ArrayList(AbstractC25267u.m74163i0(arrayList, i13));
                            while (r14.hasNext()) {
                                AbstractC22676k.m65750j(interfaceC27798h6, "<this>");
                                interfaceC27801kMo74543S = interfaceC27805o.mo74543S(interfaceC27798h6, r10);
                                if (interfaceC27801kMo74543S != null) {
                                    int i16 = iM92092N;
                                    if (interfaceC27805o.mo74563i(interfaceC27801kMo74543S) != EnumC27806p.INV) {
                                        interfaceC27801kMo74543S = null;
                                    }
                                    if (interfaceC27801kMo74543S == null) {
                                    }
                                }
                                throw new IllegalStateException(("Incorrect type: " + interfaceC27798h6 + ", subType: " + interfaceC27798hM92090L2 + ", superType: " + interfaceC27798hMo74570l1).toString());
                            }
                            i14 = iM92092N;
                            InterfaceC27797g interfaceC27797gMo74588z2 = interfaceC27805o.mo74588z(arrayList4);
                            AbstractC22676k.m65750j(interfaceC27797gMo74588z2, "<this>");
                            c27791a.add(interfaceC27805o.mo74556e0(interfaceC27797gMo74588z2));
                        } else {
                            i14 = iM92092N;
                        }
                        iM92092N = i14;
                        i13 = 10;
                        r10++;
                        z14 = z15;
                    }
                    if (!z14) {
                    }
                    r10 = z13;
                    r10 = z13;
                    C23762c c23762c2 = new C23762c(arrayList, c23794p0, interfaceC27805o, interfaceC27798hMo74570l1);
                    C23786l0 c23786l1 = new C23786l0();
                    c23762c2.invoke(c23786l1);
                    return c23786l1.m69881a();
                }
                interfaceC27802lM92114e0 = AbstractC30060g.m92114e0(interfaceC27805o, interfaceC27798hM92090L2);
                AbstractC22676k.m65750j(interfaceC27802lM92114e0, "<this>");
                if (interfaceC27805o.mo74528C(interfaceC27802lM92114e0)) {
                    return interfaceC27805o.mo74584u(interfaceC27802lM92114e0);
                }
                interfaceC27802lM92114e1 = AbstractC30060g.m92114e0(interfaceC27805o, interfaceC27798hM92090L2);
                AbstractC22676k.m65750j(interfaceC27802lM92114e1, "<this>");
                if (!interfaceC27805o.mo74584u(interfaceC27802lM92114e1)) {
                    c23794p0.m69905c();
                    arrayDeque = c23794p0.f94184g;
                    AbstractC22676k.m65747g(arrayDeque);
                    c34754h = c23794p0.f94185h;
                    AbstractC22676k.m65747g(c34754h);
                    arrayDeque.push(interfaceC27798hM92090L2);
                    while (!arrayDeque.isEmpty()) {
                        interfaceC27798h = (InterfaceC27798h) arrayDeque.pop();
                        AbstractC22676k.m65747g(interfaceC27798h);
                        if (!c34754h.add(interfaceC27798h)) {
                            if (interfaceC27805o.mo74565j(interfaceC27798h)) {
                                c23792o1 = c23792o3;
                            } else {
                                c23792o1 = c23792o2;
                            }
                            if (c23792o1.equals(c23792o3)) {
                                c23792o1 = null;
                            }
                            if (c23792o1 == null) {
                                continue;
                            } else {
                                it = c3.mo74582s(c3.mo74544T(interfaceC27798h)).iterator();
                                while (it.hasNext()) {
                                    interfaceC27798hMo69898i0 = c23792o1.mo69898i0(c23794p0, (InterfaceC27797g) it.next());
                                    interfaceC27802lM92114e2 = AbstractC30060g.m92114e0(interfaceC27805o, interfaceC27798hMo69898i0);
                                    AbstractC22676k.m65750j(interfaceC27802lM92114e2, "<this>");
                                    if (interfaceC27805o.mo74584u(interfaceC27802lM92114e2)) {
                                        c23794p0.m69903a();
                                        return true;
                                    }
                                    arrayDeque.add(interfaceC27798hMo69898i0);
                                }
                            }
                        }
                    }
                    c23794p0.m69903a();
                    return z4;
                }
                r10 = z13;
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public AbstractC23812y0 m69841f(InterfaceC23796q0 typeConstructor, List arguments) {
        AbstractC22676k.m65750j(typeConstructor, "typeConstructor");
        AbstractC22676k.m65750j(arguments, "arguments");
        List parameters = typeConstructor.getParameters();
        AbstractC22676k.m65749i(parameters, "getParameters(...)");
        InterfaceC31165x0 interfaceC31165x0 = (InterfaceC31165x0) AbstractC25265s.m74114R0(parameters);
        if (interfaceC31165x0 == null || !interfaceC31165x0.mo95861D()) {
            return new C23803u((InterfaceC31165x0[]) parameters.toArray(new InterfaceC31165x0[0]), (AbstractC23804u0[]) arguments.toArray(new AbstractC23804u0[0]), false);
        }
        List parameters2 = typeConstructor.getParameters();
        AbstractC22676k.m65749i(parameters2, "getParameters(...)");
        List list = parameters2;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC31165x0) it.next()).mo60496e());
        }
        return new C23798r0(AbstractC25247g0.m74000i0(AbstractC25265s.m74107K1(arrayList, arguments)));
    }
}
