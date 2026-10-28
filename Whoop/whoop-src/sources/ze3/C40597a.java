package ze3;

import java.util.BitSet;

/* JADX INFO: renamed from: ze3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C40597a {

    /* JADX INFO: renamed from: a */
    public final BitSet f174945a;

    public C40597a(C40597a c40597a) {
        this.f174945a = c40597a.f174945a;
    }

    /* JADX INFO: renamed from: a */
    public static C40597a m131672a() {
        return new C40597a(new BitSet());
    }

    /* JADX INFO: renamed from: b */
    public void m131673b(char c3) {
        if (c3 > 127) {
            throw new IllegalArgumentException("Can only match ASCII characters");
        }
        this.f174945a.set(c3);
    }

    /* JADX INFO: renamed from: c */
    public C40597a m131674c() {
        return new C40597a((BitSet) this.f174945a.clone());
    }

    /* JADX INFO: renamed from: d */
    public void m131675d(char c3, char c7) {
        while (c3 <= c7) {
            m131673b(c3);
            c3 = (char) (c3 + 1);
        }
    }

    public C40597a(BitSet bitSet) {
        this.f174945a = bitSet;
    }
}
