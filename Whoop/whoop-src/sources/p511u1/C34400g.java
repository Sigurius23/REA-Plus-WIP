package p511u1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import m83.AbstractC25252j;
import m83.C25266t;
import n83.C26461d;
import n83.C26463f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u1.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C34400g extends AbstractC25252j {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f144617w;

    /* JADX INFO: renamed from: x */
    public final Object f144618x;

    public /* synthetic */ C34400g(Object obj, int i13) {
        this.f144617w = i13;
        this.f144618x = obj;
    }

    @Override // m83.AbstractC25252j
    /* JADX INFO: renamed from: a */
    public final int mo74013a() {
        switch (this.f144617w) {
            case 0:
                return ((C34398e) this.f144618x).mo74011c();
            case 1:
                return ((C34398e) this.f144618x).mo74011c();
            default:
                return ((C26463f) this.f144618x).f105108I;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f144617w) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        switch (this.f144617w) {
            case 2:
                AbstractC22676k.m65750j(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f144617w) {
            case 0:
                ((C34398e) this.f144618x).clear();
                break;
            case 1:
                ((C34398e) this.f144618x).clear();
                break;
            default:
                ((C26463f) this.f144618x).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f144617w) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C34398e c34398e = (C34398e) this.f144618x;
                Object obj2 = c34398e.get(entry.getKey());
                if (obj2 != null) {
                    return obj2.equals(entry.getValue());
                }
                return entry.getValue() == null && c34398e.containsKey(entry.getKey());
            case 1:
                return ((C34398e) this.f144618x).containsKey(obj);
            default:
                return ((C26463f) this.f144618x).containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        switch (this.f144617w) {
            case 2:
                return ((C26463f) this.f144618x).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f144617w) {
            case 0:
                return new C25266t((C34398e) this.f144618x);
            case 1:
                C34398e c34398e = (C34398e) this.f144618x;
                AbstractC34409p[] abstractC34409pArr = new AbstractC34409p[8];
                for (int i13 = 0; i13 < 8; i13++) {
                    abstractC34409pArr[i13] = new C34411r(0);
                }
                return new C34401h(c34398e, abstractC34409pArr);
            default:
                C26463f c26463f = (C26463f) this.f144618x;
                c26463f.getClass();
                return new C26461d(c26463f, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f144617w) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ((C34398e) this.f144618x).remove(entry.getKey(), entry.getValue());
            case 1:
                C34398e c34398e = (C34398e) this.f144618x;
                if (!c34398e.containsKey(obj)) {
                    return false;
                }
                c34398e.remove(obj);
                return true;
            default:
                C26463f c26463f = (C26463f) this.f144618x;
                c26463f.m78381c();
                int iM78386i = c26463f.m78386i(obj);
                if (iM78386i < 0) {
                    return false;
                }
                c26463f.m78390m(iM78386i);
                return true;
        }
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        switch (this.f144617w) {
            case 2:
                AbstractC22676k.m65750j(elements, "elements");
                ((C26463f) this.f144618x).m78381c();
                return super.removeAll(elements);
            default:
                return super.removeAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        switch (this.f144617w) {
            case 2:
                AbstractC22676k.m65750j(elements, "elements");
                ((C26463f) this.f144618x).m78381c();
                break;
        }
        return super.retainAll(elements);
    }
}
