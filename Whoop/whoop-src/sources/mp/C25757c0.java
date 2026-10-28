package mp;

import java.util.Iterator;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: mp.c0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C25757c0 extends AbstractC25792p {

    /* JADX INFO: renamed from: z */
    public final transient Object f101471z;

    public C25757c0(Object obj) {
        this.f101471z = obj;
    }

    @Override // mp.AbstractC25774i
    /* JADX INFO: renamed from: a */
    public final int mo75979a(Object[] objArr) {
        objArr[0] = this.f101471z;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f101471z.equals(obj);
    }

    @Override // mp.AbstractC25774i
    /* JADX INFO: renamed from: e */
    public final AbstractC25763e0 mo75982e() {
        return new C25802u(this.f101471z);
    }

    @Override // mp.AbstractC25792p, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f101471z.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C25802u(this.f101471z);
    }

    @Override // mp.AbstractC25792p
    /* JADX INFO: renamed from: l */
    public final AbstractC25788n mo75984l() {
        Object[] objArr = {this.f101471z};
        for (int i13 = 0; i13 < 1; i13++) {
            C25777j c25777j = AbstractC25788n.f101515x;
            if (objArr[i13] == null) {
                throw new NullPointerException(AbstractC2875y.m8295h(i13, "at index "));
            }
        }
        return AbstractC25788n.m76024l(1, objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractC11895b.m31996o("[", this.f101471z.toString(), "]");
    }
}
