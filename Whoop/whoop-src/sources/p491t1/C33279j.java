package p491t1;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;
import v63.AbstractC35744b;

/* JADX INFO: renamed from: t1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C33279j extends AbstractC33272c {

    /* JADX INFO: renamed from: x */
    public static final C33279j f138746x = new C33279j(new Object[0]);

    /* JADX INFO: renamed from: w */
    public final Object[] f138747w;

    public C33279j(Object[] objArr) {
        this.f138747w = objArr;
    }

    @Override // m83.AbstractC25234a
    /* JADX INFO: renamed from: a */
    public final int mo73980a() {
        return this.f138747w.length;
    }

    @Override // p491t1.AbstractC33272c
    /* JADX INFO: renamed from: c */
    public final AbstractC33272c mo105551c(int i13, Object obj) {
        Object[] objArr = this.f138747w;
        AbstractC35744b.m113230c(i13, objArr.length);
        if (i13 == objArr.length) {
            return mo105552d(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            AbstractC25260n.m74068i0(0, i13, 6, objArr, objArr2);
            AbstractC25260n.m74062d0(i13 + 1, i13, objArr.length, objArr, objArr2);
            objArr2[i13] = obj;
            return new C33279j(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
        AbstractC25260n.m74062d0(i13 + 1, i13, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i13] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new C33274e(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // p491t1.AbstractC33272c
    /* JADX INFO: renamed from: d */
    public final AbstractC33272c mo105552d(Object obj) {
        Object[] objArr = this.f138747w;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new C33274e(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[objArr.length] = obj;
        return new C33279j(objArrCopyOf);
    }

    @Override // p491t1.AbstractC33272c
    /* JADX INFO: renamed from: e */
    public final AbstractC33272c mo105553e(Collection collection) {
        Object[] objArr = this.f138747w;
        if (collection.size() + objArr.length > 32) {
            C33275f c33275fMo105554g = mo105554g();
            c33275fMo105554g.addAll(collection);
            return c33275fMo105554g.m105581d();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new C33279j(objArrCopyOf);
    }

    @Override // p491t1.AbstractC33272c
    /* JADX INFO: renamed from: g */
    public final C33275f mo105554g() {
        return new C33275f(this, null, this.f138747w, 0);
    }

    @Override // java.util.List
    public final Object get(int i13) {
        AbstractC35744b.m113229b(i13, mo73980a());
        return this.f138747w[i13];
    }

    @Override // m83.AbstractC25242e, java.util.List
    public final int indexOf(Object obj) {
        return AbstractC25260n.m74085z0(this.f138747w, obj);
    }

    @Override // p491t1.AbstractC33272c
    /* JADX INFO: renamed from: j */
    public final AbstractC33272c mo105555j(C33271b c33271b) {
        Object[] objArr = this.f138747w;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z4 = false;
        for (int i13 = 0; i13 < length2; i13++) {
            Object obj = objArr[i13];
            if (((Boolean) c33271b.invoke(obj)).booleanValue()) {
                if (!z4) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
                    z4 = true;
                    length = i13;
                }
            } else if (z4) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? f138746x : new C33279j(AbstractC25260n.m74072m0(0, length, objArrCopyOf));
    }

    @Override // p491t1.AbstractC33272c
    /* JADX INFO: renamed from: l */
    public final AbstractC33272c mo105556l(int i13) {
        Object[] objArr = this.f138747w;
        AbstractC35744b.m113229b(i13, objArr.length);
        if (objArr.length == 1) {
            return f138746x;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
        AbstractC25260n.m74062d0(i13, i13 + 1, objArr.length, objArr, objArrCopyOf);
        return new C33279j(objArrCopyOf);
    }

    @Override // m83.AbstractC25242e, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f138747w;
        AbstractC22676k.m65750j(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i13 = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i13 >= 0) {
                        length = i13;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i14 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i14 < 0) {
                        break;
                    }
                    length2 = i14;
                }
            }
        }
        return -1;
    }

    @Override // m83.AbstractC25242e, java.util.List
    public final ListIterator listIterator(int i13) {
        Object[] objArr = this.f138747w;
        AbstractC35744b.m113230c(i13, objArr.length);
        return new C33273d(i13, objArr.length, objArr);
    }

    @Override // p491t1.AbstractC33272c
    /* JADX INFO: renamed from: m */
    public final AbstractC33272c mo105557m(int i13, Object obj) {
        Object[] objArr = this.f138747w;
        AbstractC35744b.m113229b(i13, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC22676k.m65749i(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i13] = obj;
        return new C33279j(objArrCopyOf);
    }
}
