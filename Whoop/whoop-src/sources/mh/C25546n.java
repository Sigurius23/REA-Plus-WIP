package mh;

import d93.InterfaceC11820a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import l83.C23465k;
import m83.C25272z;
import p000.AbstractC30802r;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mh.n */
/* JADX INFO: loaded from: classes.dex */
public final class C25546n implements Iterable, InterfaceC11820a {

    /* JADX INFO: renamed from: x */
    public static final C25546n f100150x = new C25546n(C25272z.f99163w);

    /* JADX INFO: renamed from: w */
    public final Map f100151w;

    public C25546n(Map map) {
        this.f100151w = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C25546n) {
            return AbstractC22676k.m65745e(this.f100151w, ((C25546n) obj).f100151w);
        }
        return false;
    }

    public final int hashCode() {
        return this.f100151w.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.f100151w;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            AbstractC30802r.m94771t(entry.getValue());
            arrayList.add(new C23465k(str, null));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return AbstractC30802r.m94764m(new StringBuilder("Parameters(entries="), this.f100151w, ')');
    }
}
