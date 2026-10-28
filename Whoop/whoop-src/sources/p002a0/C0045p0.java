package p002a0;

import d93.InterfaceC11822c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p446r1.AbstractC30850d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: a0.p0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0045p0 implements List, InterfaceC11822c {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f131w;

    /* JADX INFO: renamed from: x */
    public final Object f132x;

    /* JADX INFO: renamed from: y */
    public final int f133y;

    /* JADX INFO: renamed from: z */
    public int f134z;

    public /* synthetic */ C0045p0(int i13, int i14, int i15, List list) {
        this.f131w = i15;
        this.f132x = list;
        this.f133y = i13;
        this.f134z = i14;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f131w) {
            case 0:
                int i13 = this.f134z;
                this.f134z = i13 + 1;
                this.f132x.add(i13, obj);
                break;
            default:
                int i14 = this.f134z;
                this.f134z = i14 + 1;
                this.f132x.add(i14, obj);
                break;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final boolean addAll(int i13, Collection elements) {
        switch (this.f131w) {
            case 0:
                AbstractC22676k.m65750j(elements, "elements");
                this.f132x.addAll(i13 + this.f133y, elements);
                this.f134z = elements.size() + this.f134z;
                return elements.size() > 0;
            default:
                this.f132x.addAll(i13 + this.f133y, elements);
                int size = elements.size();
                this.f134z += size;
                return size > 0;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.f131w) {
            case 0:
                int i13 = this.f134z - 1;
                int i14 = this.f133y;
                if (i14 <= i13) {
                    while (true) {
                        this.f132x.remove(i13);
                        if (i13 != i14) {
                            i13--;
                        }
                    }
                }
                this.f134z = i14;
                break;
            default:
                int i15 = this.f134z - 1;
                int i16 = this.f133y;
                if (i16 <= i15) {
                    while (true) {
                        this.f132x.remove(i15);
                        if (i15 != i16) {
                            i15--;
                        }
                    }
                }
                this.f134z = i16;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f131w) {
            case 0:
                int i13 = this.f134z;
                for (int i14 = this.f133y; i14 < i13; i14++) {
                    if (AbstractC22676k.m65745e(this.f132x.get(i14), obj)) {
                        return true;
                    }
                }
                return false;
            default:
                int i15 = this.f134z;
                for (int i16 = this.f133y; i16 < i15; i16++) {
                    if (AbstractC22676k.m65745e(this.f132x.get(i16), obj)) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection elements) {
        switch (this.f131w) {
            case 0:
                AbstractC22676k.m65750j(elements, "elements");
                Iterator it = elements.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Iterator it3 = elements.iterator();
                while (it3.hasNext()) {
                    if (!contains(it3.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object get(int i13) {
        switch (this.f131w) {
            case 0:
                AbstractC0009b1.m11a(i13, this);
                return this.f132x.get(i13 + this.f133y);
            default:
                AbstractC30850d.m94897a(i13, this);
                return this.f132x.get(i13 + this.f133y);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.f131w) {
            case 0:
                int i13 = this.f134z;
                int i14 = this.f133y;
                for (int i15 = i14; i15 < i13; i15++) {
                    if (AbstractC22676k.m65745e(this.f132x.get(i15), obj)) {
                        return i15 - i14;
                    }
                }
                return -1;
            default:
                int i16 = this.f134z;
                int i17 = this.f133y;
                for (int i18 = i17; i18 < i16; i18++) {
                    if (AbstractC22676k.m65745e(this.f132x.get(i18), obj)) {
                        return i18 - i17;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f131w) {
            case 0:
                return this.f134z == this.f133y;
            default:
                return this.f134z == this.f133y;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f131w) {
            case 0:
                return new C0041n0(this, 0, 0);
            default:
                return new C0041n0(this, 0, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.f131w) {
            case 0:
                int i13 = this.f134z - 1;
                int i14 = this.f133y;
                if (i14 <= i13) {
                    while (!AbstractC22676k.m65745e(this.f132x.get(i13), obj)) {
                        if (i13 != i14) {
                            i13--;
                        }
                    }
                    return i13 - i14;
                }
                return -1;
            default:
                int i15 = this.f134z - 1;
                int i16 = this.f133y;
                if (i16 <= i15) {
                    while (!AbstractC22676k.m65745e(this.f132x.get(i15), obj)) {
                        if (i15 != i16) {
                            i15--;
                        }
                    }
                    return i15 - i16;
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.f131w) {
            case 0:
                return new C0041n0(this, 0, 0);
            default:
                return new C0041n0(this, 0, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f131w) {
            case 0:
                int i13 = this.f134z;
                for (int i14 = this.f133y; i14 < i13; i14++) {
                    ?? r10 = this.f132x;
                    if (AbstractC22676k.m65745e(r10.get(i14), obj)) {
                        r10.remove(i14);
                        this.f134z--;
                        return true;
                    }
                }
                return false;
            default:
                int i15 = this.f134z;
                for (int i16 = this.f133y; i16 < i15; i16++) {
                    ?? r14 = this.f132x;
                    if (AbstractC22676k.m65745e(r14.get(i16), obj)) {
                        r14.remove(i16);
                        this.f134z--;
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection elements) {
        switch (this.f131w) {
            case 0:
                AbstractC22676k.m65750j(elements, "elements");
                int i13 = this.f134z;
                Iterator it = elements.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                return i13 != this.f134z;
            default:
                int i14 = this.f134z;
                Iterator it3 = elements.iterator();
                while (it3.hasNext()) {
                    remove(it3.next());
                }
                return i14 != this.f134z;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection elements) {
        switch (this.f131w) {
            case 0:
                AbstractC22676k.m65750j(elements, "elements");
                int i13 = this.f134z;
                int i14 = i13 - 1;
                int i15 = this.f133y;
                if (i15 <= i14) {
                    while (true) {
                        ?? r10 = this.f132x;
                        if (!elements.contains(r10.get(i14))) {
                            r10.remove(i14);
                            this.f134z--;
                        }
                        if (i14 != i15) {
                            i14--;
                        }
                    }
                }
                return i13 != this.f134z;
            default:
                int i16 = this.f134z;
                int i17 = i16 - 1;
                int i18 = this.f133y;
                if (i18 <= i17) {
                    while (true) {
                        ?? r14 = this.f132x;
                        if (!elements.contains(r14.get(i17))) {
                            r14.remove(i17);
                            this.f134z--;
                        }
                        if (i17 != i18) {
                            i17--;
                        }
                    }
                }
                return i16 != this.f134z;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object set(int i13, Object obj) {
        switch (this.f131w) {
            case 0:
                AbstractC0009b1.m11a(i13, this);
                return this.f132x.set(i13 + this.f133y, obj);
            default:
                AbstractC30850d.m94897a(i13, this);
                return this.f132x.set(i13 + this.f133y, obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i13;
        int i14;
        switch (this.f131w) {
            case 0:
                i13 = this.f134z;
                i14 = this.f133y;
                break;
            default:
                i13 = this.f134z;
                i14 = this.f133y;
                break;
        }
        return i13 - i14;
    }

    @Override // java.util.List
    public final List subList(int i13, int i14) {
        switch (this.f131w) {
            case 0:
                AbstractC0009b1.m12b(i13, i14, this);
                return new C0045p0(i13, i14, 0, this);
            default:
                AbstractC30850d.m94898b(i13, i14, this);
                return new C0045p0(i13, i14, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.f131w) {
            case 0:
                break;
        }
        return AbstractC22676k.m65758r(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final void add(int i13, Object obj) {
        switch (this.f131w) {
            case 0:
                this.f132x.add(i13 + this.f133y, obj);
                this.f134z++;
                break;
            default:
                this.f132x.add(i13 + this.f133y, obj);
                this.f134z++;
                break;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i13) {
        switch (this.f131w) {
            case 0:
                return new C0041n0(this, i13, 0);
            default:
                return new C0041n0(this, i13, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] array) {
        switch (this.f131w) {
            case 0:
                AbstractC22676k.m65750j(array, "array");
                break;
        }
        return AbstractC22676k.m65759s(this, array);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection elements) {
        switch (this.f131w) {
            case 0:
                AbstractC22676k.m65750j(elements, "elements");
                this.f132x.addAll(this.f134z, elements);
                this.f134z = elements.size() + this.f134z;
                return elements.size() > 0;
            default:
                this.f132x.addAll(this.f134z, elements);
                int size = elements.size();
                this.f134z += size;
                return size > 0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.List] */
    @Override // java.util.List
    public final Object remove(int i13) {
        switch (this.f131w) {
            case 0:
                AbstractC0009b1.m11a(i13, this);
                Object objRemove = this.f132x.remove(i13 + this.f133y);
                this.f134z--;
                return objRemove;
            default:
                AbstractC30850d.m94897a(i13, this);
                Object objRemove2 = this.f132x.remove(i13 + this.f133y);
                this.f134z--;
                return objRemove2;
        }
    }
}
