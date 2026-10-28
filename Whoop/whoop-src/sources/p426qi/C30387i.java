package p426qi;

import android.graphics.Rect;
import dj.AbstractC12058c;
import dj.AbstractC12064i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p002a0.C0024g1;
import p002a0.C0062y;
import p584wi.C37308h;
import p682zi.C40655e;

/* JADX INFO: renamed from: qi.i */
/* JADX INFO: loaded from: classes.dex */
public final class C30387i {

    /* JADX INFO: renamed from: c */
    public HashMap f124683c;

    /* JADX INFO: renamed from: d */
    public HashMap f124684d;

    /* JADX INFO: renamed from: e */
    public float f124685e;

    /* JADX INFO: renamed from: f */
    public HashMap f124686f;

    /* JADX INFO: renamed from: g */
    public ArrayList f124687g;

    /* JADX INFO: renamed from: h */
    public C0024g1 f124688h;

    /* JADX INFO: renamed from: i */
    public C0062y f124689i;

    /* JADX INFO: renamed from: j */
    public ArrayList f124690j;

    /* JADX INFO: renamed from: k */
    public Rect f124691k;

    /* JADX INFO: renamed from: l */
    public float f124692l;

    /* JADX INFO: renamed from: m */
    public float f124693m;

    /* JADX INFO: renamed from: n */
    public float f124694n;

    /* JADX INFO: renamed from: a */
    public final C30380e0 f124681a = new C30380e0();

    /* JADX INFO: renamed from: b */
    public final HashSet f124682b = new HashSet();

    /* JADX INFO: renamed from: o */
    public int f124695o = 0;

    /* JADX INFO: renamed from: a */
    public final void m92858a(String str) {
        AbstractC12058c.m33239b(str);
        this.f124682b.add(str);
    }

    /* JADX INFO: renamed from: b */
    public final float m92859b() {
        return (long) (((this.f124693m - this.f124692l) / this.f124694n) * 1000.0f);
    }

    /* JADX INFO: renamed from: c */
    public final Map m92860c() {
        float fM33265c = AbstractC12064i.m33265c();
        if (fM33265c != this.f124685e) {
            for (Map.Entry entry : this.f124684d.entrySet()) {
                this.f124684d.put((String) entry.getKey(), ((C30404y) entry.getValue()).m92898a(this.f124685e / fM33265c));
            }
        }
        this.f124685e = fM33265c;
        return this.f124684d;
    }

    /* JADX INFO: renamed from: d */
    public final C37308h m92861d(String str) {
        int size = this.f124687g.size();
        for (int i13 = 0; i13 < size; i13++) {
            C37308h c37308h = (C37308h) this.f124687g.get(i13);
            if (c37308h.m119485a(str)) {
                return c37308h;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("LottieComposition:\n");
        Iterator it = this.f124690j.iterator();
        while (it.hasNext()) {
            sb4.append(((C40655e) it.next()).m131937a("\t"));
        }
        return sb4.toString();
    }
}
