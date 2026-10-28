package p715kotlin.jvm.internal;

import c93.InterfaceC4339a;
import c93.InterfaceC4340b;
import c93.InterfaceC4341c;
import c93.InterfaceC4342d;
import c93.InterfaceC4343e;
import c93.InterfaceC4344f;
import c93.InterfaceC4345g;
import c93.InterfaceC4346h;
import c93.InterfaceC4347i;
import c93.InterfaceC4348j;
import c93.InterfaceC4349k;
import c93.InterfaceC4350l;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import c93.InterfaceC4353o;
import c93.InterfaceC4354p;
import c93.InterfaceC4355q;
import c93.InterfaceC4356r;
import c93.InterfaceC4357s;
import d93.InterfaceC11820a;
import d93.InterfaceC11821b;
import d93.InterfaceC11822c;
import d93.InterfaceC11824e;
import d93.InterfaceC11825f;
import ih0.AbstractC18489d0;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l83.InterfaceC23459e;
import p002a0.C0030i1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.reflect.jvm.internal.FunctionWithAllInvokes;

/* JADX INFO: renamed from: kotlin.jvm.internal.m0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC22681m0 {
    /* JADX INFO: renamed from: a */
    public static Collection m65770a(AbstractCollection abstractCollection) {
        if (!(abstractCollection instanceof InterfaceC11820a) || (abstractCollection instanceof InterfaceC11821b)) {
            return abstractCollection;
        }
        m65778i(abstractCollection, "kotlin.collections.MutableCollection");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public static List m65771b(Object obj) {
        if ((obj instanceof InterfaceC11820a) && !(obj instanceof InterfaceC11822c)) {
            m65778i(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e5) {
            AbstractC22676k.m65754n(e5, AbstractC22681m0.class.getName());
            throw e5;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Map m65772c(Object obj) {
        if ((obj instanceof InterfaceC11820a) && !(obj instanceof InterfaceC11824e)) {
            m65778i(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e5) {
            AbstractC22676k.m65754n(e5, AbstractC22681m0.class.getName());
            throw e5;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Set m65773d(Object obj) {
        if ((obj instanceof InterfaceC11820a) && !(obj instanceof InterfaceC11825f)) {
            m65778i(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e5) {
            AbstractC22676k.m65754n(e5, AbstractC22681m0.class.getName());
            throw e5;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m65774e(int i13, Object obj) {
        if (obj == null || m65775f(i13, obj)) {
            return;
        }
        m65778i(obj, "kotlin.jvm.functions.Function" + i13);
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m65775f(int i13, Object obj) {
        int arity;
        if (obj instanceof InterfaceC23459e) {
            if (obj instanceof InterfaceC22668g) {
                arity = ((InterfaceC22668g) obj).getArity();
            } else if (obj instanceof InterfaceC4339a) {
                arity = 0;
            } else if (obj instanceof Function1) {
                arity = 1;
            } else if (obj instanceof InterfaceC4351m) {
                arity = 2;
            } else if (obj instanceof Function3) {
                arity = 3;
            } else if (obj instanceof InterfaceC4352n) {
                arity = 4;
            } else if (obj instanceof InterfaceC4353o) {
                arity = 5;
            } else if (obj instanceof InterfaceC4354p) {
                arity = 6;
            } else if (obj instanceof InterfaceC4355q) {
                arity = 7;
            } else if (obj instanceof InterfaceC4356r) {
                arity = 8;
            } else if (obj instanceof InterfaceC4357s) {
                arity = 9;
            } else if (obj instanceof InterfaceC4340b) {
                arity = 10;
            } else if (obj instanceof InterfaceC4341c) {
                arity = 11;
            } else {
                boolean z4 = obj instanceof FunctionWithAllInvokes;
                if (z4) {
                    arity = 12;
                } else if (obj instanceof InterfaceC4342d) {
                    arity = 13;
                } else if (obj instanceof InterfaceC4343e) {
                    arity = 14;
                } else if (obj instanceof InterfaceC4344f) {
                    arity = 15;
                } else if (obj instanceof InterfaceC4345g) {
                    arity = 16;
                } else if (obj instanceof InterfaceC4346h) {
                    arity = 17;
                } else if (obj instanceof InterfaceC4347i) {
                    arity = 18;
                } else if (obj instanceof InterfaceC4348j) {
                    arity = 19;
                } else if (obj instanceof InterfaceC4349k) {
                    arity = 20;
                } else if (obj instanceof InterfaceC4350l) {
                    arity = 21;
                } else {
                    arity = z4 ? 22 : -1;
                }
            }
            if (arity == i13) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m65776g(Object obj) {
        if (obj instanceof List) {
            return !(obj instanceof InterfaceC11820a) || (obj instanceof InterfaceC11822c);
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static final C0030i1 m65777h(Object[] array) {
        AbstractC22676k.m65750j(array, "array");
        return new C0030i1(array);
    }

    /* JADX INFO: renamed from: i */
    public static void m65778i(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(AbstractC18489d0.m53370k(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        AbstractC22676k.m65754n(classCastException, AbstractC22681m0.class.getName());
        throw classCastException;
    }
}
