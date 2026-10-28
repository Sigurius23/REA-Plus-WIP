package p511u1;

import java.util.Iterator;
import java.util.Map;
import m83.AbstractC25254k;
import p476s1.InterfaceC32055b;

/* JADX INFO: renamed from: u1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C34403j extends AbstractC25254k implements InterfaceC32055b {

    /* JADX INFO: renamed from: w */
    public final C34396c f144620w;

    public C34403j(C34396c c34396c) {
        this.f144620w = c34396c;
    }

    @Override // m83.AbstractC25234a
    /* JADX INFO: renamed from: a */
    public final int mo73980a() {
        C34396c c34396c = this.f144620w;
        c34396c.getClass();
        return c34396c.f144603x;
    }

    @Override // m83.AbstractC25234a, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        C34396c c34396c = this.f144620w;
        Object obj2 = c34396c.get(key);
        if (obj2 != null) {
            return obj2.equals(entry.getValue());
        }
        return entry.getValue() == null && c34396c.containsKey(entry.getKey());
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C34408o c34408o = this.f144620w.f144602w;
        AbstractC34409p[] abstractC34409pArr = new AbstractC34409p[8];
        for (int i13 = 0; i13 < 8; i13++) {
            abstractC34409pArr[i13] = new C34410q();
        }
        return new C34404k(c34408o, abstractC34409pArr);
    }
}
