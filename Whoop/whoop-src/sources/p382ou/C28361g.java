package p382ou;

import android.util.Pair;

/* JADX INFO: renamed from: ou.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C28361g extends Pair {
    @Override // android.util.Pair
    public final boolean equals(Object obj) {
        if (!(obj instanceof C28361g)) {
            return false;
        }
        C28361g c28361g = (C28361g) obj;
        if (((Integer) ((Pair) this).first).equals(((Pair) c28361g).first) && ((Integer) ((Pair) this).second).equals(((Pair) c28361g).second)) {
            return true;
        }
        return ((Integer) ((Pair) this).first).equals(((Pair) c28361g).second) && ((Integer) ((Pair) this).second).equals(((Pair) c28361g).first);
    }
}
