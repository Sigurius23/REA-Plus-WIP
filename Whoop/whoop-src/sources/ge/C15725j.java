package ge;

/* JADX INFO: renamed from: ge.j */
/* JADX INFO: loaded from: classes.dex */
public final class C15725j {

    /* JADX INFO: renamed from: a */
    public final String f59235a;

    public C15725j(String str) {
        this.f59235a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15725j) && this.f59235a.equals(((C15725j) obj).f59235a);
    }

    public final int hashCode() {
        return this.f59235a.hashCode() - 533068001;
    }

    public final String toString() {
        return AbstractC15719d.m44302c(4, "aws-sdk-kotlin", this.f59235a, null);
    }
}
