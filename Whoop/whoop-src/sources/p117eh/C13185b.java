package p117eh;

import java.io.IOException;
import java.util.ArrayList;
import ne3.C26611e0;

/* JADX INFO: renamed from: eh.b */
/* JADX INFO: loaded from: classes.dex */
public final class C13185b {

    /* JADX INFO: renamed from: a */
    public final String f45700a;

    /* JADX INFO: renamed from: b */
    public final long[] f45701b = new long[2];

    /* JADX INFO: renamed from: c */
    public final ArrayList f45702c = new ArrayList(2);

    /* JADX INFO: renamed from: d */
    public final ArrayList f45703d = new ArrayList(2);

    /* JADX INFO: renamed from: e */
    public boolean f45704e;

    /* JADX INFO: renamed from: f */
    public boolean f45705f;

    /* JADX INFO: renamed from: g */
    public C13184a f45706g;

    /* JADX INFO: renamed from: h */
    public int f45707h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C13188e f45708i;

    public C13185b(C13188e c13188e, String str) {
        this.f45708i = c13188e;
        this.f45700a = str;
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append('.');
        int length = sb4.length();
        for (int i13 = 0; i13 < 2; i13++) {
            sb4.append(i13);
            this.f45702c.add(this.f45708i.f45725w.m79176e(sb4.toString()));
            sb4.append(".tmp");
            this.f45703d.add(this.f45708i.f45725w.m79176e(sb4.toString()));
            sb4.setLength(length);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C13186c m37079a() {
        if (!this.f45704e || this.f45706g != null || this.f45705f) {
            return null;
        }
        ArrayList arrayList = this.f45702c;
        int size = arrayList.size();
        int i13 = 0;
        while (true) {
            C13188e c13188e = this.f45708i;
            if (i13 >= size) {
                this.f45707h++;
                return new C13186c(c13188e, this);
            }
            if (!c13188e.f45724P.m79274x((C26611e0) arrayList.get(i13))) {
                try {
                    c13188e.m37084T(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i13++;
        }
    }
}
