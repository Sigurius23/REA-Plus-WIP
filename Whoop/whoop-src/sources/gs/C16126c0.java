package gs;

import java.util.Objects;

/* JADX INFO: renamed from: gs.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16126c0 extends AbstractC16127d {

    /* JADX INFO: renamed from: a */
    public final String f61254a;

    /* JADX INFO: renamed from: b */
    public final C16124b0 f61255b;

    public C16126c0(String str, C16124b0 c16124b0) {
        this.f61254a = str;
        this.f61255b = c16124b0;
    }

    @Override // p154fs.AbstractC14733k
    /* JADX INFO: renamed from: a */
    public final boolean mo42237a() {
        return this.f61255b != C16124b0.f61242d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16126c0)) {
            return false;
        }
        C16126c0 c16126c0 = (C16126c0) obj;
        return c16126c0.f61254a.equals(this.f61254a) && c16126c0.f61255b.equals(this.f61255b);
    }

    public final int hashCode() {
        return Objects.hash(C16126c0.class, this.f61254a, this.f61255b);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.f61254a + ", variant: " + this.f61255b + ")";
    }
}
