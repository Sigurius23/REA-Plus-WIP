package p669z2;

import p603x2.AbstractC37831a;
import v63.AbstractC35745c;

/* JADX INFO: renamed from: z2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C39998a extends AbstractC35745c {

    /* JADX INFO: renamed from: a */
    public InterfaceC40003f f172583a;

    @Override // v63.AbstractC35745c
    /* JADX INFO: renamed from: c */
    public final boolean mo113251c(C40005h c40005h) {
        return c40005h == this.f172583a.getKey();
    }

    @Override // v63.AbstractC35745c
    /* JADX INFO: renamed from: e */
    public final Object mo113253e(C40005h c40005h) {
        if (c40005h != this.f172583a.getKey()) {
            AbstractC37831a.m121374b("Check failed.");
        }
        return this.f172583a.mo66776d();
    }
}
