package xe3;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: xe3.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C38241d {

    /* JADX INFO: renamed from: a */
    public final ArrayList f163952a;

    /* JADX INFO: renamed from: b */
    public final char f163953b;

    /* JADX INFO: renamed from: c */
    public final int f163954c;

    /* JADX INFO: renamed from: d */
    public final boolean f163955d;

    /* JADX INFO: renamed from: e */
    public final boolean f163956e;

    /* JADX INFO: renamed from: f */
    public C38241d f163957f;

    /* JADX INFO: renamed from: g */
    public C38241d f163958g;

    public C38241d(ArrayList arrayList, char c3, boolean z4, boolean z13, C38241d c38241d) {
        this.f163952a = arrayList;
        this.f163953b = c3;
        this.f163955d = z4;
        this.f163956e = z13;
        this.f163957f = c38241d;
        this.f163954c = arrayList.size();
    }

    /* JADX INFO: renamed from: a */
    public final List m122568a(int i13) {
        ArrayList arrayList = this.f163952a;
        if (i13 >= 1 && i13 <= arrayList.size()) {
            return arrayList.subList(0, i13);
        }
        throw new IllegalArgumentException("length must be between 1 and " + arrayList.size() + ", was " + i13);
    }

    /* JADX INFO: renamed from: b */
    public final List m122569b(int i13) {
        ArrayList arrayList = this.f163952a;
        if (i13 >= 1 && i13 <= arrayList.size()) {
            return arrayList.subList(arrayList.size() - i13, arrayList.size());
        }
        throw new IllegalArgumentException("length must be between 1 and " + arrayList.size() + ", was " + i13);
    }
}
