package androidx.fragment.app;

import android.view.View;
import androidx.recyclerview.widget.AbstractC1670d;
import androidx.recyclerview.widget.AbstractC1738u;
import androidx.recyclerview.widget.C1674e;
import androidx.recyclerview.widget.C1686h;
import androidx.recyclerview.widget.C1734t;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p097ds.RunnableC12316s;
import p184h5.AbstractC16877h0;
import p184h5.AbstractC16901p0;
import p217ib.AbstractC18317n;
import p217ib.C18305c;
import p217ib.C18321r;
import p217ib.C18322s;
import p489t.C33242a;

/* JADX INFO: renamed from: androidx.fragment.app.j2 */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC1310j2 implements Runnable {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f5655E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f5656F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f5657w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f5658x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f5659y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ List f5660z;

    public /* synthetic */ RunnableC1310j2(Object obj, List list, List list2, int i13, Object obj2, int i14) {
        this.f5657w = i14;
        this.f5656F = obj;
        this.f5659y = list;
        this.f5660z = list2;
        this.f5658x = i13;
        this.f5655E = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f5657w;
        List list = this.f5660z;
        List list2 = this.f5659y;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj = this.f5656F;
        switch (i13) {
            case 0:
                break;
            case 1:
                C1734t c1734tM5212c = AbstractC1670d.m5212c(new C1674e(this));
                ((C1686h) obj).f6664c.execute(new RunnableC12316s(this, c1734tM5212c, objArr == true ? 1 : 0, 1));
                return;
            default:
                C18321r c18321r = ((AbstractC18317n) list2).f71313z;
                C18321r c18321r2 = ((AbstractC18317n) list).f71313z;
                AbstractC1738u abstractC1738u = (AbstractC1738u) ((C18305c) obj).f71265b.f124536y;
                int iM52736c = c18321r.m52736c();
                int iM52736c2 = c18321r2.m52736c();
                C33242a.m105474V().m105475W(new RunnableC12316s(this, AbstractC1670d.m5212c(new C18322s(c18321r, iM52736c, c18321r2, abstractC1738u, (c18321r.size() - iM52736c) - c18321r.m52737d(), (c18321r2.size() - iM52736c2) - c18321r2.m52737d())), objArr2 == true ? 1 : 0, 9));
                return;
        }
        for (int i14 = 0; i14 < this.f5658x; i14++) {
            View view = (View) ((ArrayList) list2).get(i14);
            String str = (String) ((ArrayList) list).get(i14);
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            AbstractC16877h0.m47518m(view, str);
            AbstractC16877h0.m47518m((View) ((ArrayList) this.f5655E).get(i14), (String) ((ArrayList) obj).get(i14));
        }
    }

    public RunnableC1310j2(int i13, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f5657w = 0;
        this.f5658x = i13;
        this.f5659y = arrayList;
        this.f5660z = arrayList2;
        this.f5655E = arrayList3;
        this.f5656F = arrayList4;
    }
}
