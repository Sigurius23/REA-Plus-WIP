package p669z2;

import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p603x2.AbstractC37831a;
import v63.AbstractC35745c;

/* JADX INFO: renamed from: z2.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C40006i extends AbstractC35745c {

    /* JADX INFO: renamed from: a */
    public final C40005h f172592a;

    /* JADX INFO: renamed from: b */
    public final C28633k1 f172593b = AbstractC28683x.m87272z(null);

    public C40006i(C40005h c40005h) {
        this.f172592a = c40005h;
    }

    @Override // v63.AbstractC35745c
    /* JADX INFO: renamed from: c */
    public final boolean mo113251c(C40005h c40005h) {
        return c40005h == this.f172592a;
    }

    @Override // v63.AbstractC35745c
    /* JADX INFO: renamed from: e */
    public final Object mo113253e(C40005h c40005h) {
        if (c40005h != this.f172592a) {
            AbstractC37831a.m121374b("Check failed.");
        }
        Object value = this.f172593b.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }
}
