package gt;

import com.whoop.data.repositories.C6656c;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p505ts.AbstractC34132o;

/* JADX INFO: renamed from: gt.b */
/* JADX INFO: loaded from: classes.dex */
public final class C16163b {

    /* JADX INFO: renamed from: a */
    public final String f61428a;

    /* JADX INFO: renamed from: b */
    public final Set f61429b;

    /* JADX INFO: renamed from: c */
    public final Set f61430c;

    /* JADX INFO: renamed from: d */
    public final int f61431d;

    /* JADX INFO: renamed from: e */
    public final int f61432e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC16166e f61433f;

    /* JADX INFO: renamed from: g */
    public final Set f61434g;

    public C16163b(String str, Set set, Set set2, int i13, int i14, InterfaceC16166e interfaceC16166e, Set set3) {
        this.f61428a = str;
        this.f61429b = Collections.unmodifiableSet(set);
        this.f61430c = Collections.unmodifiableSet(set2);
        this.f61431d = i13;
        this.f61432e = i14;
        this.f61433f = interfaceC16166e;
        this.f61434g = Collections.unmodifiableSet(set3);
    }

    /* JADX INFO: renamed from: a */
    public static C16162a m45707a(C16177p c16177p) {
        return new C16162a(c16177p, new C16177p[0]);
    }

    /* JADX INFO: renamed from: b */
    public static C16163b m45708b(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(C16177p.m45715a(cls));
        for (Class cls2 : clsArr) {
            AbstractC34132o.m107884h(cls2, "Null interface");
            hashSet.add(C16177p.m45715a(cls2));
        }
        return new C16163b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C6656c(obj, 4), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f61429b.toArray()) + ">{" + this.f61431d + ", type=" + this.f61432e + ", deps=" + Arrays.toString(this.f61430c.toArray()) + "}";
    }
}
