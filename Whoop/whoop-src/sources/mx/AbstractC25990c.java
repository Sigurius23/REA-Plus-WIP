package mx;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whoop.android.R;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.BleChooseStrapActivity;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.C10534d;
import e10.C12554k0;
import g73.C15556d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mm.C25680d;
import p036bq.RunnableC3543b;
import p129ex.C13724a;
import p264jx.C21997d;
import p264jx.InterfaceC21994a;
import p264jx.InterfaceC21995b;
import p312lx.AbstractC24783d;
import p312lx.C24782c;
import p351nx.InterfaceC27212a;
import p351nx.InterfaceC27213b;
import p351nx.InterfaceC27214c;
import p351nx.InterfaceC27215d;
import p351nx.InterfaceC27216e;
import p351nx.InterfaceC27217f;
import qm2.C30502s;
import se.AbstractC32411b;

/* JADX INFO: renamed from: mx.c */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC25990c {

    /* JADX INFO: renamed from: F */
    private InterfaceC27216e f102692F;

    /* JADX INFO: renamed from: G */
    private boolean f102693G;

    /* JADX INFO: renamed from: y */
    private boolean f102698y;

    /* JADX INFO: renamed from: z */
    private boolean f102699z;

    /* JADX INFO: renamed from: w */
    private final List<AbstractC24783d> f102696w = new ArrayList();

    /* JADX INFO: renamed from: x */
    private final List<AbstractC24783d> f102697x = new ArrayList();

    /* JADX INFO: renamed from: H */
    protected final InterfaceC21995b f102694H = new C24782c(this);

    /* JADX INFO: renamed from: I */
    private final Runnable f102695I = new RunnableC3543b(this, 19);

    /* JADX INFO: renamed from: E */
    private C21997d f102691E = new C21997d();

    /* JADX INFO: renamed from: A */
    public boolean m77091A(int i13) {
        if (m77096F(i13)) {
            return m77095E(i13);
        }
        if (!m77094D(i13)) {
            return m77092B(m77111e(i13));
        }
        return m77093C(i13 - (mo72642f() + m77117o()));
    }

    /* JADX INFO: renamed from: B */
    public boolean m77092B(int i13) {
        return true;
    }

    /* JADX INFO: renamed from: C */
    public boolean m77093C(int i13) {
        return true;
    }

    /* JADX INFO: renamed from: D */
    public boolean m77094D(int i13) {
        return i13 >= mo72642f() + m77117o();
    }

    /* JADX INFO: renamed from: E */
    public boolean m77095E(int i13) {
        return true;
    }

    /* JADX INFO: renamed from: F */
    public boolean m77096F(int i13) {
        return i13 < m77117o();
    }

    /* JADX INFO: renamed from: G */
    public abstract void mo72637G();

    /* JADX INFO: renamed from: H */
    public void m77097H() {
        AbstractC32411b.m101086b0(this.f102695I);
    }

    /* JADX INFO: renamed from: I */
    public void m77098I(AbstractC24783d abstractC24783d, int i13) {
    }

    /* JADX INFO: renamed from: K */
    public void m77099K(AbstractC24783d abstractC24783d, int i13) {
    }

    /* JADX INFO: renamed from: L */
    public abstract void mo27138L(AbstractC24783d abstractC24783d, Object obj, int i13);

    /* JADX INFO: renamed from: M */
    public abstract AbstractC24783d mo27139M(ViewGroup viewGroup, int i13);

    /* JADX INFO: renamed from: N */
    public void m77100N() {
        if (this.f102698y) {
            this.f102699z = true;
            return;
        }
        C21997d c21997d = this.f102691E;
        C15556d c15556d = c21997d.f85234b;
        C12554k0 c12554k0 = c21997d.f85233a;
        c12554k0.m35236k();
        c12554k0.m35236k();
        Iterator<E> it = ((C13724a) c12554k0.f42881x).iterator();
        while (it.hasNext()) {
            ((InterfaceC21995b) it.next()).mo62849c();
        }
        c12554k0.m35240v();
        c12554k0.m35240v();
    }

    /* JADX INFO: renamed from: O */
    public void m77101O(int i13, AbstractC24783d abstractC24783d) {
        if (m77091A(i13)) {
            if (m77096F(i13)) {
                m77115m();
                return;
            }
            if (m77094D(i13)) {
                m77112g();
            } else if (m77121r() != null) {
                int iM77111e = m77111e(i13);
                BleChooseStrapActivity.m26962N0((BleChooseStrapActivity) ((C25680d) m77121r()).f101015x, this, (C30502s) get(iM77111e), (C10534d.a) abstractC24783d, iM77111e);
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public boolean m77102P(int i13, AbstractC24783d abstractC24783d) {
        if (!m77091A(i13)) {
            return false;
        }
        if (m77096F(i13)) {
            m77116n();
            return false;
        }
        if (m77094D(i13)) {
            m77113j();
            return false;
        }
        m77123u();
        return false;
    }

    /* JADX INFO: renamed from: Q */
    public void m77103Q(int i13, int i14) {
        if (this.f102698y) {
            this.f102699z = true;
            return;
        }
        C12554k0 c12554k0 = this.f102691E.f85233a;
        c12554k0.m35236k();
        c12554k0.m35236k();
        Iterator<E> it = ((C13724a) c12554k0.f42881x).iterator();
        while (it.hasNext()) {
            ((InterfaceC21995b) it.next()).mo62848b(i13, i14);
        }
        c12554k0.m35240v();
        c12554k0.m35240v();
    }

    /* JADX INFO: renamed from: R */
    public void m77104R(int i13, int i14) {
        if (this.f102698y) {
            this.f102699z = true;
            return;
        }
        C12554k0 c12554k0 = this.f102691E.f85233a;
        c12554k0.m35236k();
        c12554k0.m35236k();
        Iterator<E> it = ((C13724a) c12554k0.f42881x).iterator();
        while (it.hasNext()) {
            ((InterfaceC21995b) it.next()).mo62847a(i13, i14);
        }
        c12554k0.m35240v();
        c12554k0.m35240v();
    }

    /* JADX INFO: renamed from: S */
    public void m77105S(int i13, int i14) {
        if (this.f102698y) {
            this.f102699z = true;
            return;
        }
        C12554k0 c12554k0 = this.f102691E.f85233a;
        c12554k0.m35236k();
        c12554k0.m35236k();
        Iterator<E> it = ((C13724a) c12554k0.f42881x).iterator();
        while (it.hasNext()) {
            ((InterfaceC21995b) it.next()).mo62850d(i13, i14);
        }
        c12554k0.m35240v();
        c12554k0.m35240v();
    }

    /* JADX INFO: renamed from: U */
    public void m77106U(boolean z4) {
        this.f102693G = true;
    }

    /* JADX INFO: renamed from: V */
    public void m77107V(InterfaceC27216e interfaceC27216e) {
        this.f102692F = interfaceC27216e;
    }

    /* JADX INFO: renamed from: a */
    public void m77108a(AbstractC24783d abstractC24783d, int i13) {
        if (m77096F(i13)) {
            m77099K(abstractC24783d, i13);
            return;
        }
        if (m77094D(i13)) {
            m77098I(abstractC24783d, i13 - (mo72642f() + m77117o()));
        } else {
            int iM77117o = i13 - m77117o();
            abstractC24783d.itemView.setTag(R.id.com_raizlabs_viewholderIndexID, Integer.valueOf(iM77117o));
            mo27138L(abstractC24783d, get(iM77117o), iM77117o);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m77109c() {
        if (this.f102693G) {
            return;
        }
        m77106U(true);
    }

    /* JADX INFO: renamed from: d */
    public AbstractC24783d m77110d(ViewGroup viewGroup, int i13) {
        AbstractC24783d abstractC24783dMo27139M;
        if (i13 < m77117o()) {
            abstractC24783dMo27139M = this.f102696w.get(i13);
        } else {
            abstractC24783dMo27139M = i13 > (m77125w() + m77117o()) + (-1) ? this.f102697x.get((i13 - m77117o()) - m77125w()) : mo27139M(viewGroup, i13 - m77117o());
        }
        abstractC24783dMo27139M.itemView.setTag(R.id.com_raizlabs_viewholderTagID, abstractC24783dMo27139M);
        return abstractC24783dMo27139M;
    }

    /* JADX INFO: renamed from: e */
    public int m77111e(int i13) {
        return i13 - m77117o();
    }

    /* JADX INFO: renamed from: f */
    public abstract int mo72642f();

    /* JADX INFO: renamed from: g */
    public InterfaceC27212a m77112g() {
        return null;
    }

    public abstract Object get(int i13);

    /* JADX INFO: renamed from: j */
    public InterfaceC27213b m77113j() {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public int m77114l() {
        return this.f102697x.size();
    }

    /* JADX INFO: renamed from: m */
    public InterfaceC27214c m77115m() {
        return null;
    }

    /* JADX INFO: renamed from: n */
    public InterfaceC27215d m77116n() {
        return null;
    }

    /* JADX INFO: renamed from: o */
    public int m77117o() {
        return this.f102696w.size();
    }

    /* JADX INFO: renamed from: p */
    public int m77118p() {
        return m77114l() + mo72642f() + m77117o();
    }

    /* JADX INFO: renamed from: p0 */
    public InterfaceC21994a m77119p0() {
        return this.f102691E;
    }

    /* JADX INFO: renamed from: q */
    public int m77120q(int i13) {
        if (i13 < m77117o()) {
            return i13;
        }
        if (!m77094D(i13)) {
            return m77117o() + m77124v(i13 - m77117o());
        }
        return (i13 - (mo72642f() + m77117o())) + m77125w() + m77117o();
    }

    /* JADX INFO: renamed from: r */
    public InterfaceC27216e m77121r() {
        return this.f102692F;
    }

    /* JADX INFO: renamed from: t */
    public long m77122t(int i13) {
        return 0L;
    }

    /* JADX INFO: renamed from: u */
    public InterfaceC27217f m77123u() {
        return null;
    }

    /* JADX INFO: renamed from: v */
    public int m77124v(int i13) {
        return 0;
    }

    /* JADX INFO: renamed from: w */
    public int m77125w() {
        return 1;
    }

    /* JADX INFO: renamed from: y */
    public boolean m77126y() {
        return false;
    }

    /* JADX INFO: renamed from: z */
    public View m77127z(ViewGroup viewGroup, int i13) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i13, viewGroup, false);
    }
}
