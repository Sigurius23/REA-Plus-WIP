package ub3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import m83.AbstractC25247g0;
import m83.AbstractC25252j;
import m83.AbstractC25260n;
import m83.C25266t;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22681m0;

/* JADX INFO: renamed from: ub3.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C34754h extends AbstractC25252j {

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f146410y = 0;

    /* JADX INFO: renamed from: w */
    public Object f146411w;

    /* JADX INFO: renamed from: x */
    public int f146412x;

    public C34754h(int i13) {
    }

    @Override // m83.AbstractC25252j
    /* JADX INFO: renamed from: a */
    public final int mo74013a() {
        return this.f146412x;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object obj2;
        int i13 = this.f146412x;
        if (i13 == 0) {
            this.f146411w = obj;
        } else if (i13 == 1) {
            if (AbstractC22676k.m65745e(this.f146411w, obj)) {
                return false;
            }
            this.f146411w = new Object[]{this.f146411w, obj};
        } else if (i13 < 5) {
            Object obj3 = this.f146411w;
            AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr = (Object[]) obj3;
            if (AbstractC25260n.m74056a0(objArr, obj)) {
                return false;
            }
            int i14 = this.f146412x;
            if (i14 == 4) {
                Object[] elements = Arrays.copyOf(objArr, objArr.length);
                AbstractC22676k.m65750j(elements, "elements");
                LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC25247g0.m73988W(elements.length));
                AbstractC25260n.m74043S0(elements, linkedHashSet);
                linkedHashSet.add(obj);
                obj2 = linkedHashSet;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, i14 + 1);
                AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[objArrCopyOf.length - 1] = obj;
                obj2 = objArrCopyOf;
            }
            this.f146411w = obj2;
        } else {
            Object obj4 = this.f146411w;
            AbstractC22676k.m65748h(obj4, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!AbstractC22681m0.m65773d(obj4).add(obj)) {
                return false;
            }
        }
        this.f146412x++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f146411w = null;
        this.f146412x = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (mo74013a() == 0) {
            return false;
        }
        if (mo74013a() == 1) {
            return AbstractC22676k.m65745e(this.f146411w, obj);
        }
        if (mo74013a() < 5) {
            Object obj2 = this.f146411w;
            AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return AbstractC25260n.m74056a0((Object[]) obj2, obj);
        }
        Object obj3 = this.f146411w;
        AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i13 = this.f146412x;
        if (i13 == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (i13 == 1) {
            return new C34753g(this.f146411w);
        }
        if (i13 < 5) {
            Object obj = this.f146411w;
            AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new C25266t((Object[]) obj);
        }
        Object obj2 = this.f146411w;
        AbstractC22676k.m65748h(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return AbstractC22681m0.m65773d(obj2).iterator();
    }
}
