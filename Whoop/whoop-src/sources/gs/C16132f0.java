package gs;

import java.util.Objects;

/* JADX INFO: renamed from: gs.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16132f0 extends AbstractC16127d {

    /* JADX INFO: renamed from: a */
    public final C16124b0 f61268a;

    /* JADX INFO: renamed from: b */
    public final String f61269b;

    /* JADX INFO: renamed from: c */
    public final C16124b0 f61270c;

    /* JADX INFO: renamed from: d */
    public final AbstractC16127d f61271d;

    public C16132f0(C16124b0 c16124b0, String str, C16124b0 c16124b1, AbstractC16127d abstractC16127d) {
        this.f61268a = c16124b0;
        this.f61269b = str;
        this.f61270c = c16124b1;
        this.f61271d = abstractC16127d;
    }

    @Override // p154fs.AbstractC14733k
    /* JADX INFO: renamed from: a */
    public final boolean mo42237a() {
        return this.f61268a != C16124b0.f61250l;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16132f0)) {
            return false;
        }
        C16132f0 c16132f0 = (C16132f0) obj;
        return c16132f0.f61270c.equals(this.f61270c) && c16132f0.f61271d.equals(this.f61271d) && c16132f0.f61269b.equals(this.f61269b) && c16132f0.f61268a.equals(this.f61268a);
    }

    public final int hashCode() {
        return Objects.hash(C16132f0.class, this.f61269b, this.f61270c, this.f61271d, this.f61268a);
    }

    public final String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.f61269b + ", dekParsingStrategy: " + this.f61270c + ", dekParametersForNewKeys: " + this.f61271d + ", variant: " + this.f61268a + ")";
    }
}
