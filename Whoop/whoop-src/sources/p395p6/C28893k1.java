package p395p6;

import android.widget.RemoteViews;
import java.util.ArrayList;
import m83.AbstractC25265s;
import nh3.AbstractC26725a;

/* JADX INFO: renamed from: p6.k1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28893k1 {

    /* JADX INFO: renamed from: d */
    public static final C28893k1 f116947d = new C28893k1(new long[0], new RemoteViews[0], 1);

    /* JADX INFO: renamed from: a */
    public final long[] f116948a;

    /* JADX INFO: renamed from: b */
    public final RemoteViews[] f116949b;

    /* JADX INFO: renamed from: c */
    public final int f116950c;

    public C28893k1(long[] jArr, RemoteViews[] remoteViewsArr, int i13) {
        this.f116948a = jArr;
        this.f116949b = remoteViewsArr;
        this.f116950c = i13;
        if (jArr.length != remoteViewsArr.length) {
            throw new IllegalArgumentException("RemoteCollectionItems has different number of ids and views");
        }
        if (i13 < 1) {
            throw new IllegalArgumentException("View type count must be >= 1");
        }
        ArrayList arrayList = new ArrayList(remoteViewsArr.length);
        for (RemoteViews remoteViews : remoteViewsArr) {
            arrayList.add(Integer.valueOf(remoteViews.getLayoutId()));
        }
        int size = AbstractC25265s.m74159y0(arrayList).size();
        if (size > this.f116950c) {
            throw new IllegalArgumentException(AbstractC26725a.m79505i(new StringBuilder("View type count is set to "), this.f116950c, ", but the collection contains ", size, " different layout ids").toString());
        }
    }
}
