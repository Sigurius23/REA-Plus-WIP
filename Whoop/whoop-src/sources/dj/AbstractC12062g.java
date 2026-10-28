package dj;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import p031b9.AbstractC2875y;
import p584wi.C37301a;
import p584wi.C37305e;
import p649yi.C39557l;
import si.InterfaceC32525k;

/* JADX INFO: renamed from: dj.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12062g {

    /* JADX INFO: renamed from: a */
    public static final PointF f40002a = new PointF();

    /* JADX INFO: renamed from: a */
    public static PointF m33251a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* JADX INFO: renamed from: b */
    public static float m33252b(float f13, float f14, float f15) {
        return Math.max(f14, Math.min(f15, f13));
    }

    /* JADX INFO: renamed from: c */
    public static int m33253c(int i13) {
        return Math.max(0, Math.min(255, i13));
    }

    /* JADX INFO: renamed from: d */
    public static int m33254d(float f13, float f14) {
        int i13 = (int) f13;
        int i14 = (int) f14;
        int i15 = i13 / i14;
        int i16 = i13 % i14;
        if (!((i13 ^ i14) >= 0) && i16 != 0) {
            i15--;
        }
        return i13 - (i14 * i15);
    }

    /* JADX INFO: renamed from: e */
    public static void m33255e(C39557l c39557l, Path path) {
        Path path2;
        path.reset();
        PointF pointF = c39557l.f170184b;
        ArrayList arrayList = c39557l.f170183a;
        path.moveTo(pointF.x, pointF.y);
        float f13 = pointF.x;
        float f14 = pointF.y;
        PointF pointF2 = f40002a;
        pointF2.set(f13, f14);
        int i13 = 0;
        while (i13 < arrayList.size()) {
            C37301a c37301a = (C37301a) arrayList.get(i13);
            PointF pointF3 = c37301a.f159492a;
            PointF pointF4 = c37301a.f159493b;
            PointF pointF5 = c37301a.f159494c;
            if (pointF3.equals(pointF2) && pointF4.equals(pointF5)) {
                path.lineTo(pointF5.x, pointF5.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(pointF3.x, pointF3.y, pointF4.x, pointF4.y, pointF5.x, pointF5.y);
            }
            pointF2.set(pointF5.x, pointF5.y);
            i13++;
            path = path2;
        }
        Path path3 = path;
        if (c39557l.f170185c) {
            path3.close();
        }
    }

    /* JADX INFO: renamed from: f */
    public static float m33256f(float f13, float f14, float f15) {
        return AbstractC2875y.m8288a(f14, f13, f15, f13);
    }

    /* JADX INFO: renamed from: g */
    public static void m33257g(C37305e c37305e, int i13, ArrayList arrayList, C37305e c37305e2, InterfaceC32525k interfaceC32525k) {
        if (c37305e.m119478b(i13, interfaceC32525k.getName())) {
            arrayList.add(c37305e2.m119477a(interfaceC32525k.getName()).m119483g(interfaceC32525k));
        }
    }
}
