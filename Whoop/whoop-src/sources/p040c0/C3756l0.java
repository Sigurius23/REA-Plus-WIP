package p040c0;

import androidx.compose.animation.AbstractC1089a;
import p390p1.C28617g1;

/* JADX INFO: renamed from: c0.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3756l0 {

    /* JADX INFO: renamed from: a */
    public final AbstractC3730c1 f15349a;

    /* JADX INFO: renamed from: b */
    public final AbstractC3736e1 f15350b;

    /* JADX INFO: renamed from: c */
    public final C28617g1 f15351c;

    /* JADX INFO: renamed from: d */
    public C3775r1 f15352d;

    public C3756l0(AbstractC3730c1 abstractC3730c1, AbstractC3736e1 abstractC3736e1, float f13, C3775r1 c3775r1) {
        this.f15349a = abstractC3730c1;
        this.f15350b = abstractC3736e1;
        this.f15351c = new C28617g1(f13);
        this.f15352d = c3775r1;
    }

    public C3756l0(C3733d1 c3733d1, C3739f1 c3739f1, C3775r1 c3775r1, int i13) {
        if ((i13 & 8) != 0) {
            int i14 = AbstractC1089a.f4473b;
            c3775r1 = new C3775r1(true, C3755l.f15346x);
        }
        this(c3733d1, c3739f1, 0.0f, c3775r1);
    }
}
