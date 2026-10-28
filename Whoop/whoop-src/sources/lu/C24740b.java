package lu;

import java.io.File;
import p031b9.C2817b;

/* JADX INFO: renamed from: lu.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C24740b {

    /* JADX INFO: renamed from: a */
    public final String f96734a;

    /* JADX INFO: renamed from: b */
    public final long[] f96735b;

    /* JADX INFO: renamed from: c */
    public boolean f96736c;

    /* JADX INFO: renamed from: d */
    public C2817b f96737d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C24741c f96738e;

    public C24740b(C24741c c24741c, String str) {
        this.f96738e = c24741c;
        this.f96734a = str;
        this.f96735b = new long[c24741c.f96743G];
    }

    /* JADX INFO: renamed from: a */
    public final File m72431a(int i13) {
        return new File(this.f96738e.f96751w, this.f96734a + "." + i13);
    }

    /* JADX INFO: renamed from: b */
    public final File m72432b(int i13) {
        return new File(this.f96738e.f96751w, this.f96734a + "." + i13 + ".tmp");
    }

    /* JADX INFO: renamed from: c */
    public final String m72433c() {
        StringBuilder sb4 = new StringBuilder();
        for (long j7 : this.f96735b) {
            sb4.append(' ');
            sb4.append(j7);
        }
        return sb4.toString();
    }
}
