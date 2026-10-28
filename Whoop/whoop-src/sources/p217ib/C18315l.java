package p217ib;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ib.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C18315l {

    /* JADX INFO: renamed from: e */
    public static final C18315l f71294e = new C18315l(Collections.EMPTY_LIST, 0);

    /* JADX INFO: renamed from: a */
    public final List f71295a;

    /* JADX INFO: renamed from: b */
    public final int f71296b;

    /* JADX INFO: renamed from: c */
    public final int f71297c;

    /* JADX INFO: renamed from: d */
    public final int f71298d;

    public C18315l(int i13, int i14, int i15, List list) {
        this.f71295a = list;
        this.f71296b = i13;
        this.f71297c = i14;
        this.f71298d = i15;
    }

    public final String toString() {
        return "Result " + this.f71296b + ", " + this.f71295a + ", " + this.f71297c + ", offset " + this.f71298d;
    }

    public C18315l(List list, int i13) {
        this.f71295a = list;
        this.f71296b = 0;
        this.f71297c = 0;
        this.f71298d = i13;
    }
}
