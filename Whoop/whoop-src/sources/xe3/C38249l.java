package xe3;

import af3.C0841q;
import java.util.ArrayList;
import ze3.AbstractC40598b;

/* JADX INFO: renamed from: xe3.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C38249l {

    /* JADX INFO: renamed from: e */
    public StringBuilder f164006e;

    /* JADX INFO: renamed from: f */
    public String f164007f;

    /* JADX INFO: renamed from: g */
    public char f164008g;

    /* JADX INFO: renamed from: h */
    public StringBuilder f164009h;

    /* JADX INFO: renamed from: a */
    public int f164002a = 1;

    /* JADX INFO: renamed from: b */
    public final ArrayList f164003b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f164004c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f164005d = new ArrayList();

    /* JADX INFO: renamed from: i */
    public boolean f164010i = false;

    /* JADX INFO: renamed from: a */
    public final void m122591a() {
        if (this.f164010i) {
            String strM131677b = AbstractC40598b.m131677b(this.f164007f);
            StringBuilder sb4 = this.f164009h;
            String strM131677b2 = sb4 != null ? AbstractC40598b.m131677b(sb4.toString()) : null;
            String string = this.f164006e.toString();
            C0841q c0841q = new C0841q();
            c0841q.f3034g = string;
            c0841q.f3035h = strM131677b;
            c0841q.f3036i = strM131677b2;
            ArrayList arrayList = this.f164005d;
            c0841q.m2058h(arrayList);
            arrayList.clear();
            this.f164004c.add(c0841q);
            this.f164006e = null;
            this.f164010i = false;
            this.f164007f = null;
            this.f164009h = null;
        }
    }
}
