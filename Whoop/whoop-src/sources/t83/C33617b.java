package t83;

import java.io.Serializable;
import java.util.RandomAccess;
import m83.AbstractC25242e;
import m83.AbstractC25260n;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: t83.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C33617b extends AbstractC25242e implements InterfaceC33616a, RandomAccess, Serializable {

    /* JADX INFO: renamed from: w */
    public final Enum[] f140301w;

    public C33617b(Enum[] entries) {
        AbstractC22676k.m65750j(entries, "entries");
        this.f140301w = entries;
    }

    @Override // m83.AbstractC25234a
    /* JADX INFO: renamed from: a */
    public final int mo73980a() {
        return this.f140301w.length;
    }

    @Override // m83.AbstractC25234a, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r10 = (Enum) obj;
        return ((Enum) AbstractC25260n.m74084y0(r10.ordinal(), this.f140301w)) == r10;
    }

    @Override // java.util.List
    public final Object get(int i13) {
        Enum[] enumArr = this.f140301w;
        int length = enumArr.length;
        if (i13 < 0 || i13 >= length) {
            throw new IndexOutOfBoundsException(AbstractC2875y.m8294g(i13, length, "index: ", ", size: "));
        }
        return enumArr[i13];
    }

    @Override // m83.AbstractC25242e, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r10 = (Enum) obj;
        int iOrdinal = r10.ordinal();
        if (((Enum) AbstractC25260n.m74084y0(iOrdinal, this.f140301w)) == r10) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // m83.AbstractC25242e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r10 = (Enum) obj;
        int iOrdinal = r10.ordinal();
        if (((Enum) AbstractC25260n.m74084y0(iOrdinal, this.f140301w)) == r10) {
            return iOrdinal;
        }
        return -1;
    }
}
