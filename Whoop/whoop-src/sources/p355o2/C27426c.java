package p355o2;

import java.util.ArrayList;
import java.util.List;
import m83.C25271y;

/* JADX INFO: renamed from: o2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C27426c {

    /* JADX INFO: renamed from: a */
    public final String f110501a;

    /* JADX INFO: renamed from: b */
    public final float f110502b;

    /* JADX INFO: renamed from: c */
    public final float f110503c;

    /* JADX INFO: renamed from: d */
    public final float f110504d;

    /* JADX INFO: renamed from: e */
    public final float f110505e;

    /* JADX INFO: renamed from: f */
    public final float f110506f;

    /* JADX INFO: renamed from: g */
    public final float f110507g;

    /* JADX INFO: renamed from: h */
    public final float f110508h;

    /* JADX INFO: renamed from: i */
    public final List f110509i;

    /* JADX INFO: renamed from: j */
    public final ArrayList f110510j;

    public C27426c(String str, float f13, float f14, float f15, float f16, float f17, float f18, float f19, List list, int i13) {
        str = (i13 & 1) != 0 ? "" : str;
        f13 = (i13 & 2) != 0 ? 0.0f : f13;
        f14 = (i13 & 4) != 0 ? 0.0f : f14;
        f15 = (i13 & 8) != 0 ? 0.0f : f15;
        f16 = (i13 & 16) != 0 ? 1.0f : f16;
        f17 = (i13 & 32) != 0 ? 1.0f : f17;
        f18 = (i13 & 64) != 0 ? 0.0f : f18;
        f19 = (i13 & 128) != 0 ? 0.0f : f19;
        if ((i13 & 256) != 0) {
            int i14 = AbstractC27433f0.f110561a;
            list = C25271y.f99162w;
        }
        ArrayList arrayList = new ArrayList();
        this.f110501a = str;
        this.f110502b = f13;
        this.f110503c = f14;
        this.f110504d = f15;
        this.f110505e = f16;
        this.f110506f = f17;
        this.f110507g = f18;
        this.f110508h = f19;
        this.f110509i = list;
        this.f110510j = arrayList;
    }
}
