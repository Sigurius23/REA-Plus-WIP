package io.seon.androidsdk.service;

import android.content.Context;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: renamed from: io.seon.androidsdk.service.k0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20677k0 {

    /* JADX INFO: renamed from: a */
    public final C20650b0 f77354a;

    /* JADX INFO: renamed from: b */
    public final C20693s0 f77355b;

    /* JADX INFO: renamed from: c */
    public final C20675j1 f77356c;

    /* JADX INFO: renamed from: d */
    public final C20682n f77357d;

    /* JADX INFO: renamed from: e */
    public final C20700w f77358e;

    /* JADX INFO: renamed from: f */
    public final C20668h0 f77359f;

    /* JADX INFO: renamed from: g */
    public final C20690r f77360g;

    /* JADX INFO: renamed from: h */
    public final C20687p0 f77361h;

    /* JADX INFO: renamed from: i */
    public final C20697u0 f77362i;

    /* JADX INFO: renamed from: j */
    public final C20707z0 f77363j;

    /* JADX INFO: renamed from: k */
    public final C20696u f77364k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f77365l;

    public C20677k0(C20661f c20661f) {
        C20650b0 c20650b0 = new C20650b0();
        c20650b0.f77235e = null;
        this.f77354a = c20650b0;
        C20693s0 c20693s0 = new C20693s0();
        c20693s0.f77453e = null;
        this.f77355b = c20693s0;
        C20675j1 c20675j1 = new C20675j1();
        this.f77356c = c20675j1;
        C20682n c20682n = new C20682n();
        this.f77357d = c20682n;
        C20700w c20700w = new C20700w();
        this.f77358e = c20700w;
        C20668h0 c20668h0 = new C20668h0();
        c20668h0.f77324h = false;
        c20668h0.f77325i = null;
        this.f77359f = c20668h0;
        C20690r c20690r = new C20690r();
        this.f77360g = c20690r;
        C20687p0 c20687p0 = new C20687p0();
        this.f77361h = c20687p0;
        C20697u0 c20697u0 = new C20697u0();
        this.f77362i = c20697u0;
        C20707z0 c20707z0 = new C20707z0();
        c20707z0.f77524f = null;
        c20707z0.f77525g = null;
        this.f77363j = c20707z0;
        C20696u c20696u = new C20696u();
        c20696u.f77499f = null;
        c20696u.f77500g = null;
        this.f77364k = c20696u;
        ArrayList<AbstractC20664g> arrayList = new ArrayList();
        this.f77365l = arrayList;
        arrayList.add(c20650b0);
        arrayList.add(c20693s0);
        arrayList.add(c20675j1);
        arrayList.add(c20682n);
        arrayList.add(c20700w);
        arrayList.add(c20668h0);
        arrayList.add(c20690r);
        arrayList.add(c20687p0);
        arrayList.add(c20697u0);
        arrayList.add(c20707z0);
        arrayList.add(c20696u);
        Context context = c20661f.f77293b;
        C20663f1 c20663f1 = new C20663f1();
        c20663f1.f77299a = context;
        c20663f1.f77300b = this;
        for (AbstractC20664g abstractC20664g : arrayList) {
            abstractC20664g.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            abstractC20664g.mo56776c(c20663f1);
            try {
                ((Map) abstractC20664g.f77302a.get(abstractC20664g.f77304c)).put("bootstrap", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList m56833a() {
        return this.f77365l;
    }

    /* JADX INFO: renamed from: b */
    public final C20697u0 m56834b() {
        return this.f77362i;
    }

    /* JADX INFO: renamed from: c */
    public final C20696u m56835c() {
        return this.f77364k;
    }
}
