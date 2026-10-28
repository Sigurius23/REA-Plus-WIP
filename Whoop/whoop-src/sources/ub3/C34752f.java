package ub3;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;
import p000.AbstractC11266d;

/* JADX INFO: renamed from: ub3.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C34752f extends AbstractList implements RandomAccess {

    /* JADX INFO: renamed from: w */
    public int f146406w;

    /* JADX INFO: renamed from: x */
    public Object f146407x;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m109747a(int i13) {
        String str = (i13 == 2 || i13 == 3 || i13 == 5 || i13 == 6 || i13 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 2 || i13 == 3 || i13 == 5 || i13 == 6 || i13 == 7) ? 2 : 3];
        switch (i13) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i13 == 2 || i13 == 3) {
            objArr[1] = "iterator";
        } else if (i13 == 5 || i13 == 6 || i13 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i13) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i13 != 2 && i13 != 3 && i13 != 5 && i13 != 6 && i13 != 7) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int i13 = this.f146406w;
        if (i13 == 0) {
            this.f146407x = obj;
        } else if (i13 == 1) {
            this.f146407x = new Object[]{this.f146407x, obj};
        } else {
            Object[] objArr = (Object[]) this.f146407x;
            int length = objArr.length;
            if (i13 >= length) {
                int iM30446D = AbstractC11266d.m30446D(length, 3, 2, 1);
                int i14 = i13 + 1;
                if (iM30446D < i14) {
                    iM30446D = i14;
                }
                Object[] objArr2 = new Object[iM30446D];
                this.f146407x = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f146406w] = obj;
        }
        this.f146406w++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f146407x = null;
        this.f146406w = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        int i14;
        if (i13 >= 0 && i13 < (i14 = this.f146406w)) {
            return i14 == 1 ? this.f146407x : ((Object[]) this.f146407x)[i13];
        }
        StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Index: ", ", Size: ");
        sbM30466t.append(this.f146406w);
        throw new IndexOutOfBoundsException(sbM30466t.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        int i13 = this.f146406w;
        if (i13 == 0) {
            return C34750d.f146402w;
        }
        if (i13 == 1) {
            return new C34751e(this);
        }
        Iterator it = super.iterator();
        if (it != null) {
            return it;
        }
        m109747a(3);
        throw null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i13) {
        int i14;
        Object obj;
        if (i13 < 0 || i13 >= (i14 = this.f146406w)) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Index: ", ", Size: ");
            sbM30466t.append(this.f146406w);
            throw new IndexOutOfBoundsException(sbM30466t.toString());
        }
        if (i14 == 1) {
            obj = this.f146407x;
            this.f146407x = null;
        } else {
            Object[] objArr = (Object[]) this.f146407x;
            Object obj2 = objArr[i13];
            if (i14 == 2) {
                this.f146407x = objArr[1 - i13];
            } else {
                int i15 = (i14 - i13) - 1;
                if (i15 > 0) {
                    System.arraycopy(objArr, i13 + 1, objArr, i13, i15);
                }
                objArr[this.f146406w - 1] = null;
            }
            obj = obj2;
        }
        this.f146406w--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        int i14;
        if (i13 < 0 || i13 >= (i14 = this.f146406w)) {
            StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Index: ", ", Size: ");
            sbM30466t.append(this.f146406w);
            throw new IndexOutOfBoundsException(sbM30466t.toString());
        }
        if (i14 == 1) {
            Object obj2 = this.f146407x;
            this.f146407x = obj;
            return obj2;
        }
        Object[] objArr = (Object[]) this.f146407x;
        Object obj3 = objArr[i13];
        objArr[i13] = obj;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f146406w;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        int i13 = this.f146406w;
        if (i13 >= 2) {
            Arrays.sort((Object[]) this.f146407x, 0, i13, comparator);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            m109747a(4);
            throw null;
        }
        int length = objArr.length;
        int i13 = this.f146406w;
        if (i13 == 1) {
            if (length == 0) {
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                objArr2[0] = this.f146407x;
                return objArr2;
            }
            objArr[0] = this.f146407x;
        } else {
            if (length < i13) {
                Object[] objArrCopyOf = Arrays.copyOf((Object[]) this.f146407x, i13, objArr.getClass());
                if (objArrCopyOf != null) {
                    return objArrCopyOf;
                }
                m109747a(6);
                throw null;
            }
            if (i13 != 0) {
                System.arraycopy(this.f146407x, 0, objArr, 0, i13);
            }
        }
        int i14 = this.f146406w;
        if (length > i14) {
            objArr[i14] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        int i14;
        if (i13 >= 0 && i13 <= (i14 = this.f146406w)) {
            if (i14 == 0) {
                this.f146407x = obj;
            } else if (i14 == 1 && i13 == 0) {
                this.f146407x = new Object[]{obj, this.f146407x};
            } else {
                Object[] objArr = new Object[i14 + 1];
                if (i14 == 1) {
                    objArr[0] = this.f146407x;
                } else {
                    Object[] objArr2 = (Object[]) this.f146407x;
                    System.arraycopy(objArr2, 0, objArr, 0, i13);
                    System.arraycopy(objArr2, i13, objArr, i13 + 1, this.f146406w - i13);
                }
                objArr[i13] = obj;
                this.f146407x = objArr;
            }
            this.f146406w++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Index: ", ", Size: ");
        sbM30466t.append(this.f146406w);
        throw new IndexOutOfBoundsException(sbM30466t.toString());
    }
}
