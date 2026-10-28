package bj;

import android.graphics.PointF;
import dj.AbstractC12062g;
import java.util.ArrayList;
import java.util.Collections;
import p049cj.AbstractC4737c;
import p581we.C37199o;
import p584wi.C37301a;
import p649yi.C39557l;

/* JADX INFO: renamed from: bj.y */
/* JADX INFO: loaded from: classes.dex */
public final class C3326y implements InterfaceC3306e0 {

    /* JADX INFO: renamed from: a */
    public static final C3326y f12911a = new C3326y();

    /* JADX INFO: renamed from: b */
    public static final C37199o f12912b = C37199o.m119195L("c", "v", "i", "o");

    @Override // bj.InterfaceC3306e0
    /* JADX INFO: renamed from: a */
    public final Object mo9604a(AbstractC4737c abstractC4737c, float f13) {
        if (abstractC4737c.mo14822i() == 1) {
            abstractC4737c.beginArray();
        }
        abstractC4737c.beginObject();
        ArrayList arrayListM9612c = null;
        ArrayList arrayListM9612c2 = null;
        ArrayList arrayListM9612c3 = null;
        boolean zMo14821h = false;
        while (abstractC4737c.hasNext()) {
            int iMo14824m = abstractC4737c.mo14824m(f12912b);
            if (iMo14824m == 0) {
                zMo14821h = abstractC4737c.mo14821h();
            } else if (iMo14824m == 1) {
                arrayListM9612c = AbstractC3316o.m9612c(abstractC4737c, f13);
            } else if (iMo14824m == 2) {
                arrayListM9612c2 = AbstractC3316o.m9612c(abstractC4737c, f13);
            } else if (iMo14824m != 3) {
                abstractC4737c.mo14825s();
                abstractC4737c.skipValue();
            } else {
                arrayListM9612c3 = AbstractC3316o.m9612c(abstractC4737c, f13);
            }
        }
        abstractC4737c.endObject();
        if (abstractC4737c.mo14822i() == 2) {
            abstractC4737c.endArray();
        }
        if (arrayListM9612c == null || arrayListM9612c2 == null || arrayListM9612c3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListM9612c.isEmpty()) {
            return new C39557l(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListM9612c.size();
        PointF pointF = (PointF) arrayListM9612c.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i13 = 1; i13 < size; i13++) {
            PointF pointF2 = (PointF) arrayListM9612c.get(i13);
            int i14 = i13 - 1;
            arrayList.add(new C37301a(AbstractC12062g.m33251a((PointF) arrayListM9612c.get(i14), (PointF) arrayListM9612c3.get(i14)), AbstractC12062g.m33251a(pointF2, (PointF) arrayListM9612c2.get(i13)), pointF2));
        }
        if (zMo14821h) {
            PointF pointF3 = (PointF) arrayListM9612c.get(0);
            int i15 = size - 1;
            arrayList.add(new C37301a(AbstractC12062g.m33251a((PointF) arrayListM9612c.get(i15), (PointF) arrayListM9612c3.get(i15)), AbstractC12062g.m33251a(pointF3, (PointF) arrayListM9612c2.get(0)), pointF3));
        }
        return new C39557l(pointF, zMo14821h, arrayList);
    }
}
