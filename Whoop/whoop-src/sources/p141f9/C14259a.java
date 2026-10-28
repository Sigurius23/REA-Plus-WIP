package p141f9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: f9.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C14259a {

    /* JADX INFO: renamed from: a */
    public final long f52052a;

    /* JADX INFO: renamed from: b */
    public final int f52053b;

    /* JADX INFO: renamed from: c */
    public final List f52054c;

    /* JADX INFO: renamed from: d */
    public final List f52055d;

    /* JADX INFO: renamed from: e */
    public final List f52056e;

    /* JADX INFO: renamed from: f */
    public final List f52057f;

    public C14259a(long j7, int i13, ArrayList arrayList, List list, List list2, List list3) {
        this.f52052a = j7;
        this.f52053b = i13;
        this.f52054c = Collections.unmodifiableList(arrayList);
        this.f52055d = Collections.unmodifiableList(list);
        this.f52056e = Collections.unmodifiableList(list2);
        this.f52057f = Collections.unmodifiableList(list3);
    }
}
