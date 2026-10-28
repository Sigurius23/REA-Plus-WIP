package n53;

import t23.C33425n0;

/* JADX INFO: renamed from: n53.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C26324g {

    /* JADX INFO: renamed from: a */
    public final C33425n0 f104649a;

    public C26324g(C33425n0 c33425n0) {
        this.f104649a = c33425n0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26324g) && this.f104649a.equals(((C26324g) obj).f104649a);
    }

    public final int hashCode() {
        return this.f104649a.hashCode();
    }

    public final String toString() {
        return "ScheduleConfig(debounce=" + this.f104649a + ")";
    }
}
