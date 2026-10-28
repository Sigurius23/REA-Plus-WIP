package p141f9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: f9.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C14266h {

    /* JADX INFO: renamed from: a */
    public final String f52094a;

    /* JADX INFO: renamed from: b */
    public final long f52095b;

    /* JADX INFO: renamed from: c */
    public final List f52096c;

    /* JADX INFO: renamed from: d */
    public final List f52097d;

    public C14266h(String str, long j7, ArrayList arrayList, List list) {
        this.f52094a = str;
        this.f52095b = j7;
        this.f52096c = Collections.unmodifiableList(arrayList);
        this.f52097d = Collections.unmodifiableList(list);
    }
}
