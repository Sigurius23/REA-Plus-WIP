package p502ti;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.List;
import p034bl.C3366f;
import p078d1.C11457j;
import p119ej.C13224a;
import p499t9.C33647p;

/* JADX INFO: renamed from: ti.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC33821d {

    /* JADX INFO: renamed from: c */
    public final InterfaceC33819b f141647c;

    /* JADX INFO: renamed from: e */
    public C11457j f141649e;

    /* JADX INFO: renamed from: a */
    public final ArrayList f141645a = new ArrayList(1);

    /* JADX INFO: renamed from: b */
    public boolean f141646b = false;

    /* JADX INFO: renamed from: d */
    public float f141648d = 0.0f;

    /* JADX INFO: renamed from: f */
    public Object f141650f = null;

    /* JADX INFO: renamed from: g */
    public float f141651g = -1.0f;

    /* JADX INFO: renamed from: h */
    public float f141652h = -1.0f;

    public AbstractC33821d(List list) {
        InterfaceC33819b c33820c;
        if (list.isEmpty()) {
            c33820c = new C33647p(1);
        } else {
            c33820c = list.size() == 1 ? new C33820c(list) : new C3366f(list);
        }
        this.f141647c = c33820c;
    }

    /* JADX INFO: renamed from: a */
    public final void m106977a(InterfaceC33818a interfaceC33818a) {
        this.f141645a.add(interfaceC33818a);
    }

    /* JADX INFO: renamed from: b */
    public float mo106978b() {
        if (this.f141652h == -1.0f) {
            this.f141652h = this.f141647c.mo9722e();
        }
        return this.f141652h;
    }

    /* JADX INFO: renamed from: c */
    public final float m106979c() {
        Interpolator interpolator;
        C13224a c13224aMo9719b = this.f141647c.mo9719b();
        if (c13224aMo9719b == null || c13224aMo9719b.m37125c() || (interpolator = c13224aMo9719b.f45818d) == null) {
            return 0.0f;
        }
        return interpolator.getInterpolation(m106980d());
    }

    /* JADX INFO: renamed from: d */
    public final float m106980d() {
        if (this.f141646b) {
            return 0.0f;
        }
        C13224a c13224aMo9719b = this.f141647c.mo9719b();
        if (c13224aMo9719b.m37125c()) {
            return 0.0f;
        }
        return (this.f141648d - c13224aMo9719b.m37124b()) / (c13224aMo9719b.m37123a() - c13224aMo9719b.m37124b());
    }

    /* JADX INFO: renamed from: e */
    public Object mo106981e() {
        float fM106980d = m106980d();
        C11457j c11457j = this.f141649e;
        InterfaceC33819b interfaceC33819b = this.f141647c;
        if (c11457j == null && interfaceC33819b.mo9718a(fM106980d) && !mo106987k()) {
            return this.f141650f;
        }
        C13224a c13224aMo9719b = interfaceC33819b.mo9719b();
        Interpolator interpolator = c13224aMo9719b.f45819e;
        Interpolator interpolator2 = c13224aMo9719b.f45820f;
        Object objMo106982f = (interpolator == null || interpolator2 == null) ? mo106982f(c13224aMo9719b, m106979c()) : mo106983g(c13224aMo9719b, fM106980d, interpolator.getInterpolation(fM106980d), interpolator2.getInterpolation(fM106980d));
        this.f141650f = objMo106982f;
        return objMo106982f;
    }

    /* JADX INFO: renamed from: f */
    public abstract Object mo106982f(C13224a c13224a, float f13);

    /* JADX INFO: renamed from: g */
    public Object mo106983g(C13224a c13224a, float f13, float f14, float f15) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    /* JADX INFO: renamed from: h */
    public void mo106984h() {
        int i13 = 0;
        while (true) {
            ArrayList arrayList = this.f141645a;
            if (i13 >= arrayList.size()) {
                return;
            }
            ((InterfaceC33818a) arrayList.get(i13)).mo101529a();
            i13++;
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo106985i(float f13) {
        InterfaceC33819b interfaceC33819b = this.f141647c;
        if (interfaceC33819b.isEmpty()) {
            return;
        }
        if (this.f141651g == -1.0f) {
            this.f141651g = interfaceC33819b.mo9721d();
        }
        float f14 = this.f141651g;
        if (f13 < f14) {
            if (f14 == -1.0f) {
                this.f141651g = interfaceC33819b.mo9721d();
            }
            f13 = this.f141651g;
        } else if (f13 > mo106978b()) {
            f13 = mo106978b();
        }
        if (f13 == this.f141648d) {
            return;
        }
        this.f141648d = f13;
        if (interfaceC33819b.mo9720c(f13)) {
            mo106984h();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m106986j(C11457j c11457j) {
        C11457j c11457j2 = this.f141649e;
        if (c11457j2 != null) {
            c11457j2.getClass();
        }
        this.f141649e = c11457j;
    }

    /* JADX INFO: renamed from: k */
    public boolean mo106987k() {
        return false;
    }
}
