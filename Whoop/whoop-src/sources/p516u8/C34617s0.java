package p516u8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p607x8.AbstractC38065t;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import p690zr.C41017e0;
import p690zr.C41060w0;

/* JADX INFO: renamed from: u8.s0 */
/* JADX INFO: loaded from: classes5.dex */
public class C34617s0 {

    /* JADX INFO: renamed from: a */
    public int f145807a = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: b */
    public int f145808b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c */
    public int f145809c = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d */
    public int f145810d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e */
    public int f145811e = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: f */
    public int f145812f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g */
    public boolean f145813g = true;

    /* JADX INFO: renamed from: h */
    public boolean f145814h = true;

    /* JADX INFO: renamed from: i */
    public AbstractC41023g0 f145815i;

    /* JADX INFO: renamed from: j */
    public AbstractC41023g0 f145816j;

    /* JADX INFO: renamed from: k */
    public AbstractC41023g0 f145817k;

    /* JADX INFO: renamed from: l */
    public int f145818l;

    /* JADX INFO: renamed from: m */
    public int f145819m;

    /* JADX INFO: renamed from: n */
    public AbstractC41023g0 f145820n;

    /* JADX INFO: renamed from: o */
    public C34615r0 f145821o;

    /* JADX INFO: renamed from: p */
    public AbstractC41023g0 f145822p;

    /* JADX INFO: renamed from: q */
    public boolean f145823q;

    /* JADX INFO: renamed from: r */
    public int f145824r;

    /* JADX INFO: renamed from: s */
    public HashMap f145825s;

    /* JADX INFO: renamed from: t */
    public HashSet f145826t;

    public C34617s0() {
        C41017e0 c41017e0 = AbstractC41023g0.f176998x;
        C41060w0 c41060w0 = C41060w0.f177067E;
        this.f145815i = c41060w0;
        this.f145816j = c41060w0;
        this.f145817k = c41060w0;
        this.f145818l = Integer.MAX_VALUE;
        this.f145819m = Integer.MAX_VALUE;
        this.f145820n = c41060w0;
        this.f145821o = C34615r0.f145806a;
        this.f145822p = c41060w0;
        this.f145823q = true;
        this.f145824r = 0;
        this.f145825s = new HashMap();
        this.f145826t = new HashSet();
    }

    /* JADX INFO: renamed from: a */
    public void m109413a(int i13) {
        Iterator it = this.f145825s.values().iterator();
        while (it.hasNext()) {
            if (((C34613q0) it.next()).f145803a.f145798c == i13) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m109414b(C34619t0 c34619t0) {
        this.f145807a = c34619t0.f145832a;
        this.f145808b = c34619t0.f145833b;
        this.f145809c = c34619t0.f145834c;
        this.f145810d = c34619t0.f145835d;
        this.f145811e = c34619t0.f145836e;
        this.f145812f = c34619t0.f145837f;
        this.f145813g = c34619t0.f145838g;
        this.f145814h = c34619t0.f145839h;
        this.f145815i = c34619t0.f145840i;
        this.f145816j = c34619t0.f145841j;
        this.f145817k = c34619t0.f145842k;
        this.f145818l = c34619t0.f145843l;
        this.f145819m = c34619t0.f145844m;
        this.f145820n = c34619t0.f145845n;
        this.f145821o = c34619t0.f145846o;
        this.f145822p = c34619t0.f145847p;
        this.f145823q = c34619t0.f145848q;
        this.f145824r = c34619t0.f145849r;
        this.f145826t = new HashSet(c34619t0.f145851t);
        this.f145825s = new HashMap(c34619t0.f145850s);
    }

    /* JADX INFO: renamed from: c */
    public C34617s0 mo83662c(String... strArr) {
        C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
        for (String str : strArr) {
            str.getClass();
            c41014d0M133251l.m133222a(AbstractC38065t.m121897K(str));
        }
        this.f145822p = c41014d0M133251l.m133239f();
        this.f145823q = false;
        return this;
    }
}
