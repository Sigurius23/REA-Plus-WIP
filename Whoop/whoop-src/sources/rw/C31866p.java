package rw;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC11266d;
import p133f1.C13968p1;
import p384ow.AbstractC28430z;
import p384ow.C28417m;
import p384ow.EnumC28412h;
import p384ow.InterfaceC28405a0;
import p440qw.AbstractC30672g;
import p440qw.C30668c;
import p563vw.C36540a;
import s30.AbstractC32100b;
import tw.AbstractC34214c;

/* JADX INFO: renamed from: rw.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C31866p implements InterfaceC28405a0 {

    /* JADX INFO: renamed from: E */
    public final ArrayList f132146E;

    /* JADX INFO: renamed from: w */
    public final C13968p1 f132147w;

    /* JADX INFO: renamed from: x */
    public final EnumC28412h f132148x;

    /* JADX INFO: renamed from: y */
    public final C30668c f132149y;

    /* JADX INFO: renamed from: z */
    public final C31867q f132150z;

    public C31866p(C13968p1 c13968p1, EnumC28412h enumC28412h, C30668c c30668c, C31867q c31867q, ArrayList arrayList) {
        this.f132147w = c13968p1;
        this.f132148x = enumC28412h;
        this.f132149y = c30668c;
        this.f132150z = c31867q;
        this.f132146E = arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static void m99051b(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + AbstractC34214c.m108138c(field) + " and " + AbstractC34214c.m108138c(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    @Override // p384ow.InterfaceC28405a0
    /* JADX INFO: renamed from: a */
    public final AbstractC28430z mo86129a(C28417m c28417m, C36540a c36540a) {
        Class cls = c36540a.f156459a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        AbstractC32100b abstractC32100b = AbstractC34214c.f143522a;
        if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            return new C31857g(1);
        }
        AbstractC30672g.m94270f(this.f132146E);
        return AbstractC34214c.f143522a.mo99878q(cls) ? new C31865o(cls, m99052c(c28417m, c36540a, cls, true)) : new C31863m(this.f132147w.m39754j(c36540a, true), m99052c(c28417m, c36540a, cls, false));
    }

    /* JADX WARN: Failed to calculate best type for var: r22v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r23v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r23v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v2 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r23v2 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: c */
    public final rw.C31864n m99052c(p384ow.C28417m r30, p563vw.C36540a r31, java.lang.Class r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rw.C31866p.m99052c(ow.m, vw.a, java.lang.Class, boolean):rw.n");
    }

    /* JADX INFO: renamed from: d */
    public final boolean m99053d(Field field, boolean z4) {
        boolean z13;
        C30668c c30668c = this.f132149y;
        c30668c.getClass();
        if ((136 & field.getModifiers()) != 0 || field.isSynthetic() || c30668c.m94264b(field.getType(), z4)) {
            z13 = true;
        } else {
            List list = z4 ? c30668c.f126208w : c30668c.f126209x;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw AbstractC11266d.m30454h(it);
                }
            }
            z13 = false;
        }
        return !z13;
    }
}
