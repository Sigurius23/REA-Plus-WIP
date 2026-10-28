package p034bl;

import android.app.ActivityManager;
import android.content.Context;
import java.util.List;
import p000.AbstractC11266d;
import p014aj.C0928c;
import p119ej.C13224a;
import p502ti.InterfaceC33819b;

/* JADX INFO: renamed from: bl.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3366f implements InterfaceC33819b {

    /* JADX INFO: renamed from: w */
    public float f13110w;

    /* JADX INFO: renamed from: x */
    public final Object f13111x;

    /* JADX INFO: renamed from: y */
    public Object f13112y;

    /* JADX INFO: renamed from: z */
    public Object f13113z;

    public C3366f(Context context) {
        this.f13110w = 1;
        this.f13111x = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f13112y = activityManager;
        this.f13113z = new C0928c(context.getResources().getDisplayMetrics(), 3);
        if (activityManager.isLowRamDevice()) {
            this.f13110w = 0.0f;
        }
    }

    @Override // p502ti.InterfaceC33819b
    /* JADX INFO: renamed from: a */
    public boolean mo9718a(float f13) {
        C13224a c13224a = (C13224a) this.f13113z;
        C13224a c13224a2 = (C13224a) this.f13112y;
        if (c13224a == c13224a2 && this.f13110w == f13) {
            return true;
        }
        this.f13113z = c13224a2;
        this.f13110w = f13;
        return false;
    }

    @Override // p502ti.InterfaceC33819b
    /* JADX INFO: renamed from: b */
    public C13224a mo9719b() {
        return (C13224a) this.f13112y;
    }

    @Override // p502ti.InterfaceC33819b
    /* JADX INFO: renamed from: c */
    public boolean mo9720c(float f13) {
        C13224a c13224a = (C13224a) this.f13112y;
        if (f13 >= c13224a.m37124b() && f13 < c13224a.m37123a()) {
            return !((C13224a) this.f13112y).m37125c();
        }
        this.f13112y = m9723f(f13);
        return true;
    }

    @Override // p502ti.InterfaceC33819b
    /* JADX INFO: renamed from: d */
    public float mo9721d() {
        return ((C13224a) ((List) this.f13111x).get(0)).m37124b();
    }

    @Override // p502ti.InterfaceC33819b
    /* JADX INFO: renamed from: e */
    public float mo9722e() {
        return ((C13224a) AbstractC11266d.m30455i(1, (List) this.f13111x)).m37123a();
    }

    /* JADX INFO: renamed from: f */
    public C13224a m9723f(float f13) {
        List list = (List) this.f13111x;
        C13224a c13224a = (C13224a) AbstractC11266d.m30455i(1, list);
        if (f13 >= c13224a.m37124b()) {
            return c13224a;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            C13224a c13224a2 = (C13224a) list.get(size);
            if (((C13224a) this.f13112y) != c13224a2 && f13 >= c13224a2.m37124b() && f13 < c13224a2.m37123a()) {
                return c13224a2;
            }
        }
        return (C13224a) list.get(0);
    }

    @Override // p502ti.InterfaceC33819b
    public boolean isEmpty() {
        return false;
    }

    public C3366f(List list) {
        this.f13113z = null;
        this.f13110w = -1.0f;
        this.f13111x = list;
        this.f13112y = m9723f(0.0f);
    }
}
