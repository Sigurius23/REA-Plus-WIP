package p209i3;

import d93.InterfaceC11820a;
import java.util.Iterator;
import l83.InterfaceC23459e;
import p002a0.AbstractC0015d1;
import p002a0.C0011c0;
import p002a0.C0034k;
import p002a0.C0057v0;
import p031b9.AbstractC2875y;
import p097ds.AbstractC12313p;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i3.l */
/* JADX INFO: loaded from: classes.dex */
public final class C18030l implements InterfaceC18044z, Iterable, InterfaceC11820a {

    /* JADX INFO: renamed from: w */
    public final C0057v0 f69980w;

    /* JADX INFO: renamed from: x */
    public C0011c0 f69981x;

    /* JADX INFO: renamed from: y */
    public boolean f69982y;

    /* JADX INFO: renamed from: z */
    public boolean f69983z;

    public C18030l() {
        long[] jArr = AbstractC0015d1.f36a;
        this.f69980w = new C0057v0();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005f A[LOOP:0: B:5:0x0028->B:15:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:18:0x0062 A[EDGE_INSN: B:18:0x0062->B:16:0x0062 BREAK  A[LOOP:0: B:5:0x0028->B:15:0x005f], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final C18030l m51769a() {
        C18030l c18030l = new C18030l();
        c18030l.f69982y = this.f69982y;
        c18030l.f69983z = this.f69983z;
        C0057v0 c0057v0 = c18030l.f69980w;
        c0057v0.getClass();
        C0057v0 from = this.f69980w;
        AbstractC22676k.m65750j(from, "from");
        Object[] objArr = from.f171b;
        Object[] objArr2 = from.f172c;
        long[] jArr = from.f170a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j7 = jArr[i13];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i13 != length) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j7) < 128) {
                            int i16 = (i13 << 3) + i15;
                            c0057v0.m135m(objArr[i16], objArr2[i16]);
                        }
                        j7 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                    if (i13 != length) {
                        break;
                    }
                    i13++;
                }
            }
        }
        return c18030l;
    }

    /* JADX INFO: renamed from: c */
    public final Object m51770c(C18043y c18043y) {
        Object objM129g = this.f69980w.m129g(c18043y);
        if (objM129g != null) {
            return objM129g;
        }
        throw new IllegalStateException("Key not present: " + c18043y + " - consider getOrElse or getOrNull");
    }

    /* JADX INFO: renamed from: d */
    public final void m51771d(C18030l c18030l) {
        C0057v0 c0057v0 = c18030l.f69980w;
        Object[] objArr = c0057v0.f171b;
        Object[] objArr2 = c0057v0.f172c;
        long[] jArr = c0057v0.f170a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            long j7 = jArr[i13];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i14 = 8 - ((~(i13 - length)) >>> 31);
                for (int i15 = 0; i15 < i14; i15++) {
                    if ((255 & j7) < 128) {
                        int i16 = (i13 << 3) + i15;
                        Object obj = objArr[i16];
                        Object obj2 = objArr2[i16];
                        C18043y c18043y = (C18043y) obj;
                        C0057v0 c0057v1 = this.f69980w;
                        Object objM129g = c0057v1.m129g(c18043y);
                        AbstractC22676k.m65748h(c18043y, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objInvoke = c18043y.f70065b.invoke(objM129g, obj2);
                        if (objInvoke != null) {
                            c0057v1.m135m(c18043y, objInvoke);
                        }
                    }
                    j7 >>= 8;
                }
                if (i14 != 8) {
                    return;
                }
            }
            if (i13 == length) {
                return;
            } else {
                i13++;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m51772e(C18043y c18043y, Object obj) {
        boolean z4 = obj instanceof C18017a;
        C0057v0 c0057v0 = this.f69980w;
        if (z4 && c0057v0.m125c(c18043y)) {
            Object objM129g = c0057v0.m129g(c18043y);
            AbstractC22676k.m65748h(objM129g, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            C18017a c18017a = (C18017a) objM129g;
            C18017a c18017a2 = (C18017a) obj;
            String str = c18017a2.f69928a;
            if (str == null) {
                str = c18017a.f69928a;
            }
            InterfaceC23459e interfaceC23459e = c18017a2.f69929b;
            if (interfaceC23459e == null) {
                interfaceC23459e = c18017a.f69929b;
            }
            c0057v0.m135m(c18043y, new C18017a(str, interfaceC23459e));
        } else {
            c0057v0.m135m(c18043y, obj);
        }
        c18043y.getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18030l)) {
            return false;
        }
        C18030l c18030l = (C18030l) obj;
        return AbstractC22676k.m65745e(this.f69980w, c18030l.f69980w) && this.f69982y == c18030l.f69982y && this.f69983z == c18030l.f69983z;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69983z) + AbstractC2875y.m8289b(this.f69980w.hashCode() * 31, 31, this.f69982y);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C0011c0 c0011c0 = this.f69981x;
        if (c0011c0 == null) {
            C0057v0 c0057v0 = this.f69980w;
            c0057v0.getClass();
            C0011c0 c0011c1 = new C0011c0(c0057v0);
            this.f69981x = c0011c1;
            c0011c0 = c0011c1;
        }
        return ((C0034k) c0011c0.entrySet()).iterator();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT, PHI: r2
      0x0078: PHI (r2v6 java.lang.String) = (r2v5 java.lang.String), (r2v7 java.lang.String) binds: [B:13:0x003f, B:20:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007a A[LOOP:0: B:12:0x0031->B:22:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[EDGE_INSN: B:26:0x007d->B:23:0x007d BREAK  A[LOOP:0: B:12:0x0031->B:22:0x007a], SYNTHETIC] */
    public final String toString() {
        String str;
        StringBuilder sb4 = new StringBuilder();
        if (this.f69982y) {
            sb4.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f69983z) {
            sb4.append(str);
            sb4.append("isClearingSemantics=true");
            str = ", ";
        }
        C0057v0 c0057v0 = this.f69980w;
        Object[] objArr = c0057v0.f171b;
        Object[] objArr2 = c0057v0.f172c;
        long[] jArr = c0057v0.f170a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i13 = 0;
            while (true) {
                long j7 = jArr[i13];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i13 != length) {
                        break;
                        break;
                    }
                    i13++;
                } else {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((255 & j7) < 128) {
                            int i16 = (i13 << 3) + i15;
                            Object obj = objArr[i16];
                            Object obj2 = objArr2[i16];
                            sb4.append(str);
                            sb4.append(((C18043y) obj).f70064a);
                            sb4.append(" : ");
                            sb4.append(obj2);
                            str = ", ";
                        }
                        j7 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                    if (i13 != length) {
                        break;
                    }
                    i13++;
                }
            }
        }
        return AbstractC12313p.m34266R(this) + "{ " + ((Object) sb4) + " }";
    }
}
