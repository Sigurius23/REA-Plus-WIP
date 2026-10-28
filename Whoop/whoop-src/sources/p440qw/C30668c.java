package p440qw;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC11266d;
import p384ow.AbstractC28430z;
import p384ow.C28417m;
import p384ow.InterfaceC28405a0;
import p563vw.C36540a;
import s30.AbstractC32100b;
import tw.AbstractC34214c;

/* JADX INFO: renamed from: qw.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C30668c implements InterfaceC28405a0, Cloneable {

    /* JADX INFO: renamed from: y */
    public static final C30668c f126207y;

    /* JADX INFO: renamed from: w */
    public List f126208w;

    /* JADX INFO: renamed from: x */
    public List f126209x;

    static {
        C30668c c30668c = new C30668c();
        List list = Collections.EMPTY_LIST;
        c30668c.f126208w = list;
        c30668c.f126209x = list;
        f126207y = c30668c;
    }

    @Override // p384ow.InterfaceC28405a0
    /* JADX INFO: renamed from: a */
    public final AbstractC28430z mo86129a(C28417m c28417m, C36540a c36540a) {
        Class cls = c36540a.f156459a;
        boolean zM94264b = m94264b(cls, true);
        boolean zM94264b2 = m94264b(cls, false);
        if (zM94264b || zM94264b2) {
            return new C30667b(this, zM94264b2, zM94264b, c28417m, c36540a);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m94264b(Class cls, boolean z4) {
        if (!z4 && !Enum.class.isAssignableFrom(cls)) {
            AbstractC32100b abstractC32100b = AbstractC34214c.f143522a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z4 ? this.f126208w : this.f126209x).iterator();
        if (it.hasNext()) {
            throw AbstractC11266d.m30454h(it);
        }
        return false;
    }

    public final Object clone() {
        try {
            return (C30668c) super.clone();
        } catch (CloneNotSupportedException e5) {
            throw new AssertionError(e5);
        }
    }
}
