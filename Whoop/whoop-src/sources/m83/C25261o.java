package m83;

import java.util.RandomAccess;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: m83.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C25261o extends AbstractC25242e implements RandomAccess {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int[] f99152w;

    public C25261o(int[] iArr) {
        this.f99152w = iArr;
    }

    @Override // m83.AbstractC25234a
    /* JADX INFO: renamed from: a */
    public final int mo73980a() {
        return this.f99152w.length;
    }

    @Override // m83.AbstractC25234a, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        return AbstractC25260n.m74054Z(this.f99152w, ((Number) obj).intValue());
    }

    @Override // java.util.List
    public final Object get(int i13) {
        return Integer.valueOf(this.f99152w[i13]);
    }

    @Override // m83.AbstractC25242e, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f99152w;
        AbstractC22676k.m65750j(iArr, "<this>");
        int length = iArr.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (iIntValue == iArr[i13]) {
                return i13;
            }
        }
        return -1;
    }

    @Override // m83.AbstractC25234a, java.util.Collection
    public final boolean isEmpty() {
        return this.f99152w.length == 0;
    }

    @Override // m83.AbstractC25242e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f99152w;
        AbstractC22676k.m65750j(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i13 = length - 1;
                if (iIntValue == iArr[length]) {
                    return length;
                }
                if (i13 >= 0) {
                    length = i13;
                }
            }
        }
        return -1;
    }
}
