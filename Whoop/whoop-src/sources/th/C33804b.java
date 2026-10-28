package th;

import java.io.IOException;
import java.util.ArrayList;
import ne3.C26611e0;
import p031b9.C2817b;

/* JADX INFO: renamed from: th.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C33804b {

    /* JADX INFO: renamed from: a */
    public final String f141579a;

    /* JADX INFO: renamed from: b */
    public final long[] f141580b = new long[2];

    /* JADX INFO: renamed from: c */
    public final ArrayList f141581c = new ArrayList(2);

    /* JADX INFO: renamed from: d */
    public final ArrayList f141582d = new ArrayList(2);

    /* JADX INFO: renamed from: e */
    public boolean f141583e;

    /* JADX INFO: renamed from: f */
    public boolean f141584f;

    /* JADX INFO: renamed from: g */
    public C2817b f141585g;

    /* JADX INFO: renamed from: h */
    public int f141586h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C33807e f141587i;

    public C33804b(C33807e c33807e, String str) {
        this.f141587i = c33807e;
        this.f141579a = str;
        StringBuilder sb4 = new StringBuilder(str);
        sb4.append('.');
        int length = sb4.length();
        for (int i13 = 0; i13 < 2; i13++) {
            sb4.append(i13);
            this.f141581c.add(this.f141587i.f141605w.m79176e(sb4.toString()));
            sb4.append(".tmp");
            this.f141582d.add(this.f141587i.f141605w.m79176e(sb4.toString()));
            sb4.setLength(length);
        }
    }

    /* JADX INFO: renamed from: a */
    public final C33805c m106960a() {
        if (!this.f141583e || this.f141585g != null || this.f141584f) {
            return null;
        }
        ArrayList arrayList = this.f141581c;
        int size = arrayList.size();
        int i13 = 0;
        while (true) {
            C33807e c33807e = this.f141587i;
            if (i13 >= size) {
                this.f141586h++;
                return new C33805c(c33807e, this);
            }
            if (!c33807e.f141604Q.m79274x((C26611e0) arrayList.get(i13))) {
                try {
                    c33807e.m106964T(this);
                } catch (IOException unused) {
                }
                return null;
            }
            i13++;
        }
    }
}
