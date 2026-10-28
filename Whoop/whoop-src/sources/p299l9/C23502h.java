package p299l9;

import java.io.IOException;
import java.util.Objects;
import p032bc.C2953i;
import p047c9.C4312c;
import p171g9.C15587d;
import p171g9.InterfaceC15588e;
import p516u8.C34610p;

/* JADX INFO: renamed from: l9.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C23502h implements InterfaceC23506i0, InterfaceC15588e {

    /* JADX INFO: renamed from: w */
    public final Object f93030w;

    /* JADX INFO: renamed from: x */
    public C15587d f93031x;

    /* JADX INFO: renamed from: y */
    public C15587d f93032y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC23507j f93033z;

    public C23502h(AbstractC23507j abstractC23507j, Object obj) {
        this.f93033z = abstractC23507j;
        int i13 = 0;
        C23488c0 c23488c0 = null;
        this.f93031x = new C15587d(abstractC23507j.f92961c.f58539c, i13, c23488c0);
        this.f93032y = new C15587d(abstractC23507j.f92962d.f58539c, i13, c23488c0);
        this.f93030w = obj;
    }

    @Override // p299l9.InterfaceC23506i0
    /* JADX INFO: renamed from: a */
    public final void mo8314a(int i13, C23488c0 c23488c0, C23527t c23527t, C23537y c23537y) {
        if (m68059g(i13, c23488c0)) {
            C15587d c15587d = this.f93031x;
            C23537y c23537yM68060h = m68060h(c23537y, c23488c0);
            c15587d.getClass();
            c15587d.m43883a(new C23497f0(c15587d, c23527t, c23537yM68060h, 0));
        }
    }

    @Override // p299l9.InterfaceC23506i0
    /* JADX INFO: renamed from: b */
    public final void mo8315b(int i13, C23488c0 c23488c0, C23527t c23527t, C23537y c23537y, IOException iOException, boolean z4) {
        if (m68059g(i13, c23488c0)) {
            C15587d c15587d = this.f93031x;
            C23537y c23537yM68060h = m68060h(c23537y, c23488c0);
            c15587d.getClass();
            c15587d.m43883a(new C23500g0(c15587d, c23527t, c23537yM68060h, iOException, z4));
        }
    }

    @Override // p299l9.InterfaceC23506i0
    /* JADX INFO: renamed from: c */
    public final void mo8316c(int i13, C23488c0 c23488c0, C23527t c23527t, C23537y c23537y) {
        if (m68059g(i13, c23488c0)) {
            C15587d c15587d = this.f93031x;
            C23537y c23537yM68060h = m68060h(c23537y, c23488c0);
            c15587d.getClass();
            c15587d.m43883a(new C23497f0(c15587d, c23527t, c23537yM68060h, 1));
        }
    }

    @Override // p299l9.InterfaceC23506i0
    /* JADX INFO: renamed from: d */
    public final void mo8317d(int i13, C23488c0 c23488c0, C23537y c23537y) {
        if (m68059g(i13, c23488c0)) {
            C15587d c15587d = this.f93031x;
            C23537y c23537yM68060h = m68060h(c23537y, c23488c0);
            c15587d.getClass();
            c15587d.m43883a(new C4312c(19, c15587d, c23537yM68060h));
        }
    }

    @Override // p299l9.InterfaceC23506i0
    /* JADX INFO: renamed from: e */
    public final void mo8318e(int i13, C23488c0 c23488c0, C23537y c23537y) {
        if (m68059g(i13, c23488c0)) {
            C15587d c15587d = this.f93031x;
            C23537y c23537yM68060h = m68060h(c23537y, c23488c0);
            C23488c0 c23488c1 = c15587d.f58538b;
            c23488c1.getClass();
            c15587d.m43883a(new C2953i(c15587d, c23488c1, c23537yM68060h, 8));
        }
    }

    @Override // p299l9.InterfaceC23506i0
    /* JADX INFO: renamed from: f */
    public final void mo8319f(int i13, C23488c0 c23488c0, C23527t c23527t, C23537y c23537y, int i14) {
        if (m68059g(i13, c23488c0)) {
            C15587d c15587d = this.f93031x;
            C23537y c23537yM68060h = m68060h(c23537y, c23488c0);
            c15587d.getClass();
            c15587d.m43883a(new C23494e0(c15587d, c23527t, c23537yM68060h, i14));
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m68059g(int i13, C23488c0 c23488c0) {
        C23488c0 c23488c0Mo68062s;
        Object obj = this.f93030w;
        AbstractC23507j abstractC23507j = this.f93033z;
        if (c23488c0 != null) {
            c23488c0Mo68062s = abstractC23507j.mo68062s(obj, c23488c0);
            if (c23488c0Mo68062s == null) {
                return false;
            }
        } else {
            c23488c0Mo68062s = null;
        }
        int iMo68064u = abstractC23507j.mo68064u(i13, obj);
        C15587d c15587d = this.f93031x;
        if (c15587d.f58537a != iMo68064u || !Objects.equals(c15587d.f58538b, c23488c0Mo68062s)) {
            this.f93031x = new C15587d(abstractC23507j.f92961c.f58539c, iMo68064u, c23488c0Mo68062s);
        }
        C15587d c15587d2 = this.f93032y;
        if (c15587d2.f58537a == iMo68064u && Objects.equals(c15587d2.f58538b, c23488c0Mo68062s)) {
            return true;
        }
        this.f93032y = new C15587d(abstractC23507j.f92962d.f58539c, iMo68064u, c23488c0Mo68062s);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final C23537y m68060h(C23537y c23537y, C23488c0 c23488c0) {
        long j7 = c23537y.f93210e;
        AbstractC23507j abstractC23507j = this.f93033z;
        Object obj = this.f93030w;
        long jMo68063t = abstractC23507j.mo68063t(j7, obj);
        long j13 = c23537y.f93211f;
        long jMo68063t2 = abstractC23507j.mo68063t(j13, obj);
        return (jMo68063t == j7 && jMo68063t2 == j13) ? c23537y : new C23537y(c23537y.f93206a, c23537y.f93207b, (C34610p) c23537y.f93212g, c23537y.f93208c, c23537y.f93209d, jMo68063t, jMo68063t2);
    }
}
