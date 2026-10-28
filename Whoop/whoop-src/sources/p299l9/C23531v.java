package p299l9;

import java.util.Objects;
import p516u8.AbstractC34609o0;
import p516u8.C34605m0;
import p516u8.C34607n0;

/* JADX INFO: renamed from: l9.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C23531v extends AbstractC23523r {

    /* JADX INFO: renamed from: e */
    public static final Object f93172e = new Object();

    /* JADX INFO: renamed from: c */
    public final Object f93173c;

    /* JADX INFO: renamed from: d */
    public final Object f93174d;

    public C23531v(AbstractC34609o0 abstractC34609o0, Object obj, Object obj2) {
        super(abstractC34609o0);
        this.f93173c = obj;
        this.f93174d = obj2;
    }

    @Override // p299l9.AbstractC23523r, p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: b */
    public final int mo8132b(Object obj) {
        Object obj2;
        if (f93172e.equals(obj) && (obj2 = this.f93174d) != null) {
            obj = obj2;
        }
        return this.f93108b.mo8132b(obj);
    }

    @Override // p299l9.AbstractC23523r, p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: f */
    public final C34605m0 mo8128f(int i13, C34605m0 c34605m0, boolean z4) {
        this.f93108b.mo8128f(i13, c34605m0, z4);
        if (Objects.equals(c34605m0.f145692b, this.f93174d) && z4) {
            c34605m0.f145692b = f93172e;
        }
        return c34605m0;
    }

    @Override // p299l9.AbstractC23523r, p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: l */
    public final Object mo8138l(int i13) {
        Object objMo8138l = this.f93108b.mo8138l(i13);
        return Objects.equals(objMo8138l, this.f93174d) ? f93172e : objMo8138l;
    }

    @Override // p299l9.AbstractC23523r, p516u8.AbstractC34609o0
    /* JADX INFO: renamed from: m */
    public final C34607n0 mo8129m(int i13, C34607n0 c34607n0, long j7) {
        this.f93108b.mo8129m(i13, c34607n0, j7);
        if (Objects.equals(c34607n0.f145701a, this.f93173c)) {
            c34607n0.f145701a = C34607n0.f145699q;
        }
        return c34607n0;
    }
}
