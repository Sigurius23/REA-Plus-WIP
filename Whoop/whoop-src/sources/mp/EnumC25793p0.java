package mp;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: mp.p0 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC25793p0 implements Comparator {

    /* JADX INFO: renamed from: w */
    public static final EnumC25793p0 f101525w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC25793p0[] f101526x;

    static {
        EnumC25793p0 enumC25793p0 = new EnumC25793p0("INSTANCE", 0);
        f101525w = enumC25793p0;
        f101526x = new EnumC25793p0[]{enumC25793p0};
    }

    public static EnumC25793p0[] values() {
        return (EnumC25793p0[]) f101526x.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int iMin = Math.min(bArr.length, bArr2.length);
        for (int i13 = 0; i13 < iMin; i13++) {
            int i14 = (bArr[i13] & 255) - (bArr2[i13] & 255);
            if (i14 != 0) {
                return i14;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
