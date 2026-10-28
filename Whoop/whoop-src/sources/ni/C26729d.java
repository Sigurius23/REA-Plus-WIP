package ni;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ni.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C26729d {

    /* JADX INFO: renamed from: a */
    public final int f106332a;

    /* JADX INFO: renamed from: b */
    public final String f106333b;

    /* JADX INFO: renamed from: c */
    public final List f106334c;

    /* JADX INFO: renamed from: d */
    public final List f106335d;

    public C26729d(int i13, String str, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.f106332a = i13;
        this.f106333b = str;
        this.f106334c = Collections.unmodifiableList(arrayList);
        Collections.unmodifiableList(arrayList2);
        Collections.unmodifiableList(arrayList3);
        this.f106335d = Collections.unmodifiableList(arrayList4);
        Collections.unmodifiableList(arrayList5);
    }
}
