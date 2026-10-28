package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.EnumC1635w;
import p000.AbstractC30802r;
import p144fc.AbstractC14345a;

/* JADX INFO: renamed from: androidx.fragment.app.v1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1354v1 extends AbstractC14345a {

    /* JADX INFO: renamed from: c */
    private final AbstractC1329o1 f5817c;

    /* JADX INFO: renamed from: g */
    private boolean f5821g;

    /* JADX INFO: renamed from: e */
    private AbstractC1282c2 f5819e = null;

    /* JADX INFO: renamed from: f */
    private AbstractComponentCallbacksC1320m0 f5820f = null;

    /* JADX INFO: renamed from: d */
    private final int f5818d = 1;

    public AbstractC1354v1(AbstractC1329o1 abstractC1329o1) {
        this.f5817c = abstractC1329o1;
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: a */
    public void mo4232a(ViewGroup viewGroup, int i13, Object obj) {
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = (AbstractComponentCallbacksC1320m0) obj;
        if (this.f5819e == null) {
            AbstractC1329o1 abstractC1329o1 = this.f5817c;
            this.f5819e = AbstractC30802r.m94758g(abstractC1329o1, abstractC1329o1);
        }
        C1271a c1271a = (C1271a) this.f5819e;
        c1271a.getClass();
        AbstractC1329o1 abstractC1329o2 = abstractComponentCallbacksC1320m0.mFragmentManager;
        if (abstractC1329o2 != null && abstractC1329o2 != c1271a.f5518t) {
            throw new IllegalStateException("Cannot detach Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC1320m0.toString() + " is already attached to a FragmentManager.");
        }
        c1271a.m4066b(new C1278b2(abstractComponentCallbacksC1320m0, 6));
        if (abstractComponentCallbacksC1320m0.equals(this.f5820f)) {
            this.f5820f = null;
        }
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: c */
    public void mo4233c(ViewGroup viewGroup) {
        AbstractC1282c2 abstractC1282c2 = this.f5819e;
        if (abstractC1282c2 != null) {
            if (!this.f5821g) {
                try {
                    this.f5821g = true;
                    C1271a c1271a = (C1271a) abstractC1282c2;
                    if (c1271a.f5569i) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    c1271a.f5570j = false;
                    c1271a.f5518t.m4136A(c1271a, true);
                    this.f5821g = false;
                } catch (Throwable th3) {
                    this.f5821g = false;
                    throw th3;
                }
            }
            this.f5819e = null;
        }
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: h */
    public Object mo4234h(ViewGroup viewGroup, int i13) {
        if (this.f5819e == null) {
            AbstractC1329o1 abstractC1329o1 = this.f5817c;
            this.f5819e = AbstractC30802r.m94758g(abstractC1329o1, abstractC1329o1);
        }
        long jMo4241u = mo4241u(i13);
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0M4140E = this.f5817c.m4140E("android:switcher:" + viewGroup.getId() + ":" + jMo4241u);
        if (abstractComponentCallbacksC1320m0M4140E != null) {
            AbstractC1282c2 abstractC1282c2 = this.f5819e;
            abstractC1282c2.getClass();
            abstractC1282c2.m4066b(new C1278b2(abstractComponentCallbacksC1320m0M4140E, 7));
        } else {
            abstractComponentCallbacksC1320m0M4140E = mo4240t(i13);
            this.f5819e.mo4042d(viewGroup.getId(), abstractComponentCallbacksC1320m0M4140E, "android:switcher:" + viewGroup.getId() + ":" + jMo4241u, 1);
        }
        if (abstractComponentCallbacksC1320m0M4140E != this.f5820f) {
            abstractComponentCallbacksC1320m0M4140E.setMenuVisibility(false);
            if (this.f5818d == 1) {
                this.f5819e.mo4043g(abstractComponentCallbacksC1320m0M4140E, EnumC1635w.f6328z);
                return abstractComponentCallbacksC1320m0M4140E;
            }
            abstractComponentCallbacksC1320m0M4140E.setUserVisibleHint(false);
        }
        return abstractComponentCallbacksC1320m0M4140E;
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: i */
    public boolean mo4235i(View view, Object obj) {
        return ((AbstractComponentCallbacksC1320m0) obj).getView() == view;
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: l */
    public void mo4236l(Parcelable parcelable, ClassLoader classLoader) {
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: m */
    public Parcelable mo4237m() {
        return null;
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: o */
    public void mo4238o(ViewGroup viewGroup, int i13, Object obj) {
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = (AbstractComponentCallbacksC1320m0) obj;
        AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m1 = this.f5820f;
        if (abstractComponentCallbacksC1320m0 != abstractComponentCallbacksC1320m1) {
            if (abstractComponentCallbacksC1320m1 != null) {
                abstractComponentCallbacksC1320m1.setMenuVisibility(false);
                if (this.f5818d == 1) {
                    if (this.f5819e == null) {
                        AbstractC1329o1 abstractC1329o1 = this.f5817c;
                        this.f5819e = AbstractC30802r.m94758g(abstractC1329o1, abstractC1329o1);
                    }
                    this.f5819e.mo4043g(this.f5820f, EnumC1635w.f6328z);
                } else {
                    this.f5820f.setUserVisibleHint(false);
                }
            }
            abstractComponentCallbacksC1320m0.setMenuVisibility(true);
            if (this.f5818d == 1) {
                if (this.f5819e == null) {
                    AbstractC1329o1 abstractC1329o2 = this.f5817c;
                    this.f5819e = AbstractC30802r.m94758g(abstractC1329o2, abstractC1329o2);
                }
                this.f5819e.mo4043g(abstractComponentCallbacksC1320m0, EnumC1635w.f6323E);
            } else {
                abstractComponentCallbacksC1320m0.setUserVisibleHint(true);
            }
            this.f5820f = abstractComponentCallbacksC1320m0;
        }
    }

    @Override // p144fc.AbstractC14345a
    /* JADX INFO: renamed from: r */
    public void mo4239r(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    /* JADX INFO: renamed from: t */
    public abstract AbstractComponentCallbacksC1320m0 mo4240t(int i13);

    /* JADX INFO: renamed from: u */
    public long mo4241u(int i13) {
        return i13;
    }
}
