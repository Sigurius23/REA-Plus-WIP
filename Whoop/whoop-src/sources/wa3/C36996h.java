package wa3;

/* JADX INFO: renamed from: wa3.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C36996h {

    /* JADX INFO: renamed from: a */
    public final Object f158343a;

    /* JADX INFO: renamed from: b */
    public final int f158344b;

    public C36996h(Object obj, int i13) {
        this.f158343a = obj;
        this.f158344b = i13;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C36996h)) {
            return false;
        }
        C36996h c36996h = (C36996h) obj;
        return this.f158343a == c36996h.f158343a && this.f158344b == c36996h.f158344b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f158343a) * 65535) + this.f158344b;
    }
}
