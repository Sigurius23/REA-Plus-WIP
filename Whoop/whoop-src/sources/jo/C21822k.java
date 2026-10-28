package jo;

import android.widget.ImageView;
import androidx.recyclerview.widget.AbstractC1717o2;
import com.whoop.android.R;
import io.C20708t;
import io.C20709u;
import java.util.List;
import p087db.AbstractC11879v;
import p465rm.C31571u;
import p465rm.InterfaceC31519b1;
import p690zr.C41060w0;

/* JADX INFO: renamed from: jo.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C21822k extends AbstractC11879v {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f84143d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C21830s f84144e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21822k(C21830s c21830s, int i13) {
        super(c21830s);
        this.f84143d = i13;
        this.f84144e = c21830s;
    }

    /* JADX INFO: renamed from: h */
    private final void m61752h(String str) {
    }

    @Override // p087db.AbstractC11879v
    /* JADX INFO: renamed from: b */
    public void mo31842b(C21827p c21827p, int i13) {
        switch (this.f84143d) {
            case 1:
                super.mo31842b(c21827p, i13);
                if (i13 > 0) {
                    C21828q c21828q = (C21828q) this.f38765b.get(i13 - 1);
                    c21827p.f84151b.setVisibility(c21828q.f84152a.f130354z[c21828q.f84153b] ? 0 : 4);
                }
                break;
            default:
                super.mo31842b(c21827p, i13);
                break;
        }
    }

    @Override // p087db.AbstractC11879v
    /* JADX INFO: renamed from: d */
    public final void mo31843d(C21827p c21827p) {
        boolean z4;
        switch (this.f84143d) {
            case 0:
                c21827p.f84150a.setText(R.string.exo_track_selection_auto);
                InterfaceC31519b1 interfaceC31519b1 = this.f84144e.f84215r0;
                interfaceC31519b1.getClass();
                c21827p.f84151b.setVisibility(m61753f(((C31571u) interfaceC31519b1).m97213g0().f77575X) ? 4 : 0);
                c21827p.itemView.setOnClickListener(new ViewOnClickListenerC21821j(this, 0));
                break;
            default:
                c21827p.f84150a.setText(R.string.exo_track_selection_none);
                int i13 = 0;
                while (true) {
                    if (i13 < this.f38765b.size()) {
                        C21828q c21828q = (C21828q) this.f38765b.get(i13);
                        if (c21828q.f84152a.f130354z[c21828q.f84153b]) {
                            z4 = false;
                        } else {
                            i13++;
                        }
                    } else {
                        z4 = true;
                    }
                }
                c21827p.f84151b.setVisibility(z4 ? 0 : 4);
                c21827p.itemView.setOnClickListener(new ViewOnClickListenerC21821j(this, 2));
                break;
        }
    }

    @Override // p087db.AbstractC11879v
    /* JADX INFO: renamed from: e */
    public final void mo31836e(String str) {
        switch (this.f84143d) {
            case 0:
                this.f84144e.f84171J0.f38748c[1] = str;
                break;
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m61753f(C20709u c20709u) {
        for (int i13 = 0; i13 < this.f38765b.size(); i13++) {
            if (((C20708t) c20709u.f77530w.get(((C21828q) this.f38765b.get(i13)).f84152a.f130351w)) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void m61754g(List list) {
        C21830s c21830s = this.f84144e;
        ImageView imageView = c21830s.f84187R0;
        boolean z4 = false;
        for (int i13 = 0; i13 < ((C41060w0) list).f177069z; i13++) {
            C21828q c21828q = (C21828q) ((C41060w0) list).get(i13);
            if (c21828q.f84152a.f130354z[c21828q.f84153b]) {
                z4 = true;
                break;
            }
        }
        if (imageView != null) {
            imageView.setImageDrawable(z4 ? c21830s.f84207j0 : c21830s.f84208k0);
            imageView.setContentDescription(z4 ? c21830s.f84209l0 : c21830s.f84210m0);
        }
        this.f38765b = list;
    }

    @Override // p087db.AbstractC11879v, androidx.recyclerview.widget.AbstractC1692i1
    public /* bridge */ /* synthetic */ void onBindViewHolder(AbstractC1717o2 abstractC1717o2, int i13) {
        switch (this.f84143d) {
            case 1:
                mo31842b((C21827p) abstractC1717o2, i13);
                break;
            default:
                super.onBindViewHolder(abstractC1717o2, i13);
                break;
        }
    }
}
