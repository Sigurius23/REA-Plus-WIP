package p668z1;

import android.os.Parcel;
import android.os.Parcelable;
import com.whoop.data.local.room.dao.wipeable.C6516c;
import d93.InterfaceC11822c;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import n83.C26459b;
import p390p1.AbstractC28657q1;
import p491t1.AbstractC33272c;
import p491t1.C33271b;
import p491t1.C33275f;
import p491t1.C33279j;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z1.p */
/* JADX INFO: loaded from: classes.dex */
public final class C39967p implements Parcelable, InterfaceC39977z, List, RandomAccess, InterfaceC11822c {
    public static final Parcelable.Creator<C39967p> CREATOR = new C39966o();

    /* JADX INFO: renamed from: w */
    public C39974w f172473w;

    public C39967p(AbstractC33272c abstractC33272c) {
        AbstractC39957f abstractC39957fM128171k = AbstractC39963l.m128171k();
        C39974w c39974w = new C39974w(abstractC39957fM128171k.mo128147g(), abstractC33272c);
        if (!(abstractC39957fM128171k instanceof C39947a)) {
            c39974w.f172420b = new C39974w(1, abstractC33272c);
        }
        this.f172473w = c39974w;
    }

    @Override // p668z1.InterfaceC39977z
    /* JADX INFO: renamed from: N */
    public final AbstractC39950b0 mo87010N() {
        return this.f172473w;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i13;
        AbstractC33272c abstractC33272c;
        AbstractC39957f abstractC39957fM128171k;
        boolean zM128188b;
        do {
            synchronized (AbstractC39968q.f172474a) {
                C39974w c39974w = this.f172473w;
                AbstractC22676k.m65748h(c39974w, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C39974w c39974w2 = (C39974w) AbstractC39963l.m128169i(c39974w);
                i13 = c39974w2.f172505d;
                abstractC33272c = c39974w2.f172504c;
            }
            AbstractC22676k.m65747g(abstractC33272c);
            AbstractC33272c abstractC33272cMo105552d = abstractC33272c.mo105552d(obj);
            if (abstractC33272cMo105552d.equals(abstractC33272c)) {
                return false;
            }
            C39974w c39974w3 = this.f172473w;
            AbstractC22676k.m65748h(c39974w3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC39963l.f172462c) {
                abstractC39957fM128171k = AbstractC39963l.m128171k();
                zM128188b = AbstractC39968q.m128188b((C39974w) AbstractC39963l.m128183w(c39974w3, this, abstractC39957fM128171k), i13, abstractC33272cMo105552d, true);
            }
            AbstractC39963l.m128174n(abstractC39957fM128171k, this);
        } while (!zM128188b);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i13, Collection collection) {
        return AbstractC39968q.m128192g(this, new C6516c(i13, collection, 14));
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        AbstractC39957f abstractC39957fM128171k;
        C39974w c39974w = this.f172473w;
        AbstractC22676k.m65748h(c39974w, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        synchronized (AbstractC39963l.f172462c) {
            abstractC39957fM128171k = AbstractC39963l.m128171k();
            C39974w c39974w2 = (C39974w) AbstractC39963l.m128183w(c39974w, this, abstractC39957fM128171k);
            synchronized (AbstractC39968q.f172474a) {
                c39974w2.f172504c = C33279j.f138746x;
                c39974w2.f172505d++;
                c39974w2.f172506e++;
            }
        }
        AbstractC39963l.m128174n(abstractC39957fM128171k, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return AbstractC39968q.m128190e(this).f172504c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return AbstractC39968q.m128190e(this).f172504c.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        return AbstractC39968q.m128190e(this).f172504c.get(i13);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return AbstractC39968q.m128190e(this).f172504c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return AbstractC39968q.m128190e(this).f172504c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return AbstractC39968q.m128190e(this).f172504c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C26459b(this, 0);
    }

    @Override // p668z1.InterfaceC39977z
    /* JADX INFO: renamed from: m0 */
    public final void mo87011m0(AbstractC39950b0 abstractC39950b0) {
        abstractC39950b0.f172420b = this.f172473w;
        this.f172473w = (C39974w) abstractC39950b0;
    }

    @Override // java.util.List
    public final Object remove(int i13) {
        int i14;
        AbstractC33272c abstractC33272c;
        AbstractC39957f abstractC39957fM128171k;
        boolean zM128188b;
        Object obj = get(i13);
        do {
            synchronized (AbstractC39968q.f172474a) {
                C39974w c39974w = this.f172473w;
                AbstractC22676k.m65748h(c39974w, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C39974w c39974w2 = (C39974w) AbstractC39963l.m128169i(c39974w);
                i14 = c39974w2.f172505d;
                abstractC33272c = c39974w2.f172504c;
            }
            AbstractC22676k.m65747g(abstractC33272c);
            AbstractC33272c abstractC33272cMo105556l = abstractC33272c.mo105556l(i13);
            if (abstractC33272cMo105556l.equals(abstractC33272c)) {
                break;
            }
            C39974w c39974w3 = this.f172473w;
            AbstractC22676k.m65748h(c39974w3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC39963l.f172462c) {
                abstractC39957fM128171k = AbstractC39963l.m128171k();
                zM128188b = AbstractC39968q.m128188b((C39974w) AbstractC39963l.m128183w(c39974w3, this, abstractC39957fM128171k), i14, abstractC33272cMo105556l, true);
            }
            AbstractC39963l.m128174n(abstractC39957fM128171k, this);
        } while (!zM128188b);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i13;
        AbstractC33272c abstractC33272c;
        AbstractC39957f abstractC39957fM128171k;
        boolean zM128188b;
        do {
            synchronized (AbstractC39968q.f172474a) {
                C39974w c39974w = this.f172473w;
                AbstractC22676k.m65748h(c39974w, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C39974w c39974w2 = (C39974w) AbstractC39963l.m128169i(c39974w);
                i13 = c39974w2.f172505d;
                abstractC33272c = c39974w2.f172504c;
            }
            AbstractC22676k.m65747g(abstractC33272c);
            AbstractC33272c abstractC33272cMo105555j = abstractC33272c.mo105555j(new C33271b(0, collection));
            if (AbstractC22676k.m65745e(abstractC33272cMo105555j, abstractC33272c)) {
                return false;
            }
            C39974w c39974w3 = this.f172473w;
            AbstractC22676k.m65748h(c39974w3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC39963l.f172462c) {
                abstractC39957fM128171k = AbstractC39963l.m128171k();
                zM128188b = AbstractC39968q.m128188b((C39974w) AbstractC39963l.m128183w(c39974w3, this, abstractC39957fM128171k), i13, abstractC33272cMo105555j, true);
            }
            AbstractC39963l.m128174n(abstractC39957fM128171k, this);
        } while (!zM128188b);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return AbstractC39968q.m128192g(this, new C33271b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i13, Object obj) {
        int i14;
        AbstractC33272c abstractC33272c;
        AbstractC39957f abstractC39957fM128171k;
        boolean zM128188b;
        Object obj2 = get(i13);
        do {
            synchronized (AbstractC39968q.f172474a) {
                C39974w c39974w = this.f172473w;
                AbstractC22676k.m65748h(c39974w, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C39974w c39974w2 = (C39974w) AbstractC39963l.m128169i(c39974w);
                i14 = c39974w2.f172505d;
                abstractC33272c = c39974w2.f172504c;
            }
            AbstractC22676k.m65747g(abstractC33272c);
            AbstractC33272c abstractC33272cMo105557m = abstractC33272c.mo105557m(i13, obj);
            if (abstractC33272cMo105557m.equals(abstractC33272c)) {
                break;
            }
            C39974w c39974w3 = this.f172473w;
            AbstractC22676k.m65748h(c39974w3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC39963l.f172462c) {
                abstractC39957fM128171k = AbstractC39963l.m128171k();
                zM128188b = AbstractC39968q.m128188b((C39974w) AbstractC39963l.m128183w(c39974w3, this, abstractC39957fM128171k), i14, abstractC33272cMo105557m, false);
            }
            AbstractC39963l.m128174n(abstractC39957fM128171k, this);
        } while (!zM128188b);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return AbstractC39968q.m128190e(this).f172504c.size();
    }

    @Override // java.util.List
    public final List subList(int i13, int i14) {
        if (!(i13 >= 0 && i13 <= i14 && i14 <= size())) {
            AbstractC28657q1.m87188a("fromIndex or toIndex are out of bounds");
        }
        return new C39952c0(this, i13, i14);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC22676k.m65758r(this);
    }

    public final String toString() {
        C39974w c39974w = this.f172473w;
        AbstractC22676k.m65748h(c39974w, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((C39974w) AbstractC39963l.m128169i(c39974w)).f172504c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        AbstractC33272c abstractC33272c = AbstractC39968q.m128190e(this).f172504c;
        int size = abstractC33272c.size();
        parcel.writeInt(size);
        for (int i14 = 0; i14 < size; i14++) {
            parcel.writeValue(abstractC33272c.get(i14));
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m128186y0(int i13, int i14) {
        int i15;
        AbstractC33272c abstractC33272c;
        AbstractC39957f abstractC39957fM128171k;
        boolean zM128188b;
        do {
            synchronized (AbstractC39968q.f172474a) {
                C39974w c39974w = this.f172473w;
                AbstractC22676k.m65748h(c39974w, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C39974w c39974w2 = (C39974w) AbstractC39963l.m128169i(c39974w);
                i15 = c39974w2.f172505d;
                abstractC33272c = c39974w2.f172504c;
            }
            AbstractC22676k.m65747g(abstractC33272c);
            C33275f c33275fMo105554g = abstractC33272c.mo105554g();
            c33275fMo105554g.subList(i13, i14).clear();
            AbstractC33272c abstractC33272cM105581d = c33275fMo105554g.m105581d();
            if (AbstractC22676k.m65745e(abstractC33272cM105581d, abstractC33272c)) {
                return;
            }
            C39974w c39974w3 = this.f172473w;
            AbstractC22676k.m65748h(c39974w3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC39963l.f172462c) {
                abstractC39957fM128171k = AbstractC39963l.m128171k();
                zM128188b = AbstractC39968q.m128188b((C39974w) AbstractC39963l.m128183w(c39974w3, this, abstractC39957fM128171k), i15, abstractC33272cM105581d, true);
            }
            AbstractC39963l.m128174n(abstractC39957fM128171k, this);
        } while (!zM128188b);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i13;
        AbstractC33272c abstractC33272c;
        AbstractC39957f abstractC39957fM128171k;
        boolean zM128188b;
        do {
            synchronized (AbstractC39968q.f172474a) {
                C39974w c39974w = this.f172473w;
                AbstractC22676k.m65748h(c39974w, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C39974w c39974w2 = (C39974w) AbstractC39963l.m128169i(c39974w);
                i13 = c39974w2.f172505d;
                abstractC33272c = c39974w2.f172504c;
            }
            AbstractC22676k.m65747g(abstractC33272c);
            AbstractC33272c abstractC33272cMo105553e = abstractC33272c.mo105553e(collection);
            if (AbstractC22676k.m65745e(abstractC33272cMo105553e, abstractC33272c)) {
                return false;
            }
            C39974w c39974w3 = this.f172473w;
            AbstractC22676k.m65748h(c39974w3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC39963l.f172462c) {
                abstractC39957fM128171k = AbstractC39963l.m128171k();
                zM128188b = AbstractC39968q.m128188b((C39974w) AbstractC39963l.m128183w(c39974w3, this, abstractC39957fM128171k), i13, abstractC33272cMo105553e, true);
            }
            AbstractC39963l.m128174n(abstractC39957fM128171k, this);
        } while (!zM128188b);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i13) {
        return new C26459b(this, i13);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC22676k.m65759s(this, objArr);
    }

    public C39967p() {
        this(C33279j.f138746x);
    }

    @Override // java.util.List
    public final void add(int i13, Object obj) {
        int i14;
        AbstractC33272c abstractC33272c;
        AbstractC39957f abstractC39957fM128171k;
        boolean zM128188b;
        do {
            synchronized (AbstractC39968q.f172474a) {
                C39974w c39974w = this.f172473w;
                AbstractC22676k.m65748h(c39974w, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C39974w c39974w2 = (C39974w) AbstractC39963l.m128169i(c39974w);
                i14 = c39974w2.f172505d;
                abstractC33272c = c39974w2.f172504c;
            }
            AbstractC22676k.m65747g(abstractC33272c);
            AbstractC33272c abstractC33272cMo105551c = abstractC33272c.mo105551c(i13, obj);
            if (abstractC33272cMo105551c.equals(abstractC33272c)) {
                return;
            }
            C39974w c39974w3 = this.f172473w;
            AbstractC22676k.m65748h(c39974w3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC39963l.f172462c) {
                abstractC39957fM128171k = AbstractC39963l.m128171k();
                zM128188b = AbstractC39968q.m128188b((C39974w) AbstractC39963l.m128183w(c39974w3, this, abstractC39957fM128171k), i14, abstractC33272cMo105551c, true);
            }
            AbstractC39963l.m128174n(abstractC39957fM128171k, this);
        } while (!zM128188b);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i13;
        AbstractC33272c abstractC33272c;
        AbstractC39957f abstractC39957fM128171k;
        boolean zM128188b;
        do {
            synchronized (AbstractC39968q.f172474a) {
                C39974w c39974w = this.f172473w;
                AbstractC22676k.m65748h(c39974w, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C39974w c39974w2 = (C39974w) AbstractC39963l.m128169i(c39974w);
                i13 = c39974w2.f172505d;
                abstractC33272c = c39974w2.f172504c;
            }
            AbstractC22676k.m65747g(abstractC33272c);
            int iIndexOf = abstractC33272c.indexOf(obj);
            AbstractC33272c abstractC33272cMo105556l = iIndexOf != -1 ? abstractC33272c.mo105556l(iIndexOf) : abstractC33272c;
            if (abstractC33272cMo105556l.equals(abstractC33272c)) {
                return false;
            }
            C39974w c39974w3 = this.f172473w;
            AbstractC22676k.m65748h(c39974w3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC39963l.f172462c) {
                abstractC39957fM128171k = AbstractC39963l.m128171k();
                zM128188b = AbstractC39968q.m128188b((C39974w) AbstractC39963l.m128183w(c39974w3, this, abstractC39957fM128171k), i13, abstractC33272cMo105556l, true);
            }
            AbstractC39963l.m128174n(abstractC39957fM128171k, this);
        } while (!zM128188b);
        return true;
    }
}
