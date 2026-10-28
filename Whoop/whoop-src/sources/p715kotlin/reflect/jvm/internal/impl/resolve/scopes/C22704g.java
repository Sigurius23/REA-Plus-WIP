package p715kotlin.reflect.jvm.internal.impl.resolve.scopes;

import hc3.AbstractC17176i;
import ih0.AbstractC18489d0;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25265s;
import m83.C25271y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.scopes.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C22704g {

    /* JADX INFO: renamed from: c */
    public static final C22710m f89353c = new C22710m();

    /* JADX INFO: renamed from: d */
    public static final int f89354d;

    /* JADX INFO: renamed from: e */
    public static final int f89355e;

    /* JADX INFO: renamed from: f */
    public static final int f89356f;

    /* JADX INFO: renamed from: g */
    public static final int f89357g;

    /* JADX INFO: renamed from: h */
    public static final int f89358h;

    /* JADX INFO: renamed from: i */
    public static final int f89359i;

    /* JADX INFO: renamed from: j */
    public static final int f89360j;

    /* JADX INFO: renamed from: k */
    public static final int f89361k;

    /* JADX INFO: renamed from: l */
    public static final int f89362l;

    /* JADX INFO: renamed from: m */
    public static final C22704g f89363m;

    /* JADX INFO: renamed from: n */
    public static final C22704g f89364n;

    /* JADX INFO: renamed from: o */
    public static final C22704g f89365o;

    /* JADX INFO: renamed from: p */
    public static final C22704g f89366p;

    /* JADX INFO: renamed from: q */
    public static final C22704g f89367q;

    /* JADX INFO: renamed from: r */
    public static final ArrayList f89368r;

    /* JADX INFO: renamed from: s */
    public static final ArrayList f89369s;

    /* JADX INFO: renamed from: a */
    public final List f89370a;

    /* JADX INFO: renamed from: b */
    public final int f89371b;

    static {
        C22703f c22703f;
        int i13 = f89354d;
        int i14 = i13 << 1;
        f89355e = i13;
        int i15 = i13 << 2;
        f89356f = i14;
        int i16 = i13 << 3;
        f89357g = i15;
        int i17 = i13 << 4;
        f89358h = i16;
        int i18 = i13 << 5;
        f89359i = i17;
        f89360j = i18;
        f89354d = i13 << 7;
        int i19 = (i13 << 6) - 1;
        f89361k = i19;
        int i24 = i13 | i14 | i15;
        f89362l = i24;
        f89363m = new C22704g(i19);
        f89364n = new C22704g(i17 | i18);
        new C22704g(i13);
        new C22704g(i14);
        new C22704g(i15);
        f89365o = new C22704g(i24);
        new C22704g(i16);
        f89366p = new C22704g(i17);
        f89367q = new C22704g(i18);
        new C22704g(i14 | i17 | i18);
        Field[] fields = C22704g.class.getFields();
        AbstractC22676k.m65749i(fields, "getFields(...)");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            C22703f c22703f2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            C22704g c22704g = obj instanceof C22704g ? (C22704g) obj : null;
            if (c22704g != null) {
                int i25 = c22704g.f89371b;
                String name = field2.getName();
                AbstractC22676k.m65749i(name, "getName(...)");
                c22703f2 = new C22703f(i25, name);
            }
            if (c22703f2 != null) {
                arrayList2.add(c22703f2);
            }
        }
        f89368r = arrayList2;
        Field[] fields2 = C22704g.class.getFields();
        AbstractC22676k.m65749i(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (AbstractC22676k.m65745e(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            AbstractC22676k.m65748h(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                AbstractC22676k.m65749i(name2, "getName(...)");
                c22703f = new C22703f(iIntValue, name2);
            } else {
                c22703f = null;
            }
            if (c22703f != null) {
                arrayList5.add(c22703f);
            }
        }
        f89369s = arrayList5;
    }

    public C22704g(int i13, List excludes) {
        AbstractC22676k.m65750j(excludes, "excludes");
        this.f89370a = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i13 &= ~((AbstractC22702e) it.next()).mo65788a();
        }
        this.f89371b = i13;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m65789a(int i13) {
        return (i13 & this.f89371b) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C22704g.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        C22704g c22704g = (C22704g) obj;
        return AbstractC22676k.m65745e(this.f89370a, c22704g.f89370a) && this.f89371b == c22704g.f89371b;
    }

    public final int hashCode() {
        return (this.f89370a.hashCode() * 31) + this.f89371b;
    }

    public final String toString() {
        Object next;
        Iterator it = f89368r.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C22703f) next).f89351a != this.f89371b);
        C22703f c22703f = (C22703f) next;
        String strM74110N0 = c22703f != null ? c22703f.f89352b : null;
        if (strM74110N0 == null) {
            ArrayList arrayList = new ArrayList();
            for (C22703f c22703f2 : f89369s) {
                String str = m65789a(c22703f2.f89351a) ? c22703f2.f89352b : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            strM74110N0 = AbstractC25265s.m74110N0(arrayList, " | ", null, null, null, 62);
        }
        return AbstractC17176i.m48506h(AbstractC18489d0.m53375p("DescriptorKindFilter(", strM74110N0, ", "), this.f89370a, ')');
    }

    public /* synthetic */ C22704g(int i13) {
        this(i13, C25271y.f99162w);
    }
}
