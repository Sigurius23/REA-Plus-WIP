package p690zr;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: zr.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class EnumC41038l0 implements Iterator {

    /* JADX INFO: renamed from: w */
    public static final EnumC41038l0 f177021w;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ EnumC41038l0[] f177022x;

    static {
        EnumC41038l0 enumC41038l0 = new EnumC41038l0("INSTANCE", 0);
        f177021w = enumC41038l0;
        f177022x = new EnumC41038l0[]{enumC41038l0};
    }

    public static EnumC41038l0 valueOf(String str) {
        return (EnumC41038l0) Enum.valueOf(EnumC41038l0.class, str);
    }

    public static EnumC41038l0[] values() {
        return (EnumC41038l0[]) f177022x.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
