package g93;

import java.util.Random;
import o73.C27648a;

/* JADX INFO: renamed from: g93.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15609a extends AbstractC15612d {
    @Override // g93.AbstractC15612d
    /* JADX INFO: renamed from: a */
    public final int mo43925a(int i13) {
        return C27648a.m83577a0(mo43930i().nextInt(), i13);
    }

    @Override // g93.AbstractC15612d
    /* JADX INFO: renamed from: b */
    public final double mo43926b() {
        return mo43930i().nextDouble();
    }

    @Override // g93.AbstractC15612d
    /* JADX INFO: renamed from: e */
    public final float mo43927e() {
        return mo43930i().nextFloat();
    }

    @Override // g93.AbstractC15612d
    /* JADX INFO: renamed from: f */
    public final int mo43928f() {
        return mo43930i().nextInt();
    }

    @Override // g93.AbstractC15612d
    /* JADX INFO: renamed from: g */
    public final int mo43929g(int i13) {
        return mo43930i().nextInt(i13);
    }

    /* JADX INFO: renamed from: i */
    public abstract Random mo43930i();
}
