package p087db;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.AbstractC1692i1;
import androidx.recyclerview.widget.AbstractC1717o2;
import com.whoop.android.R;
import io.C20708t;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.poll.ViewOnClickListenerC19855d;
import java.util.ArrayList;
import java.util.List;
import jo.C21827p;
import jo.C21828q;
import jo.C21830s;
import p031b9.C2830f0;
import p465rm.C31571u;
import p465rm.InterfaceC31519b1;
import p516u8.C34611p0;
import p516u8.InterfaceC34599j0;
import sn.C32766w0;

/* JADX INFO: renamed from: db.v */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC11879v extends AbstractC1692i1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38764a = 0;

    /* JADX INFO: renamed from: b */
    public List f38765b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FrameLayout f38766c;

    public AbstractC11879v(C21830s c21830s) {
        this.f38766c = c21830s;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0039  */
    /* JADX INFO: renamed from: a */
    public void mo31834a(C11873s c11873s, int i13) {
        boolean z4;
        InterfaceC34599j0 interfaceC34599j0 = ((C11882x) this.f38766c).f38789J0;
        if (interfaceC34599j0 == null) {
            return;
        }
        if (i13 == 0) {
            mo31835c(c11873s);
            return;
        }
        C11875t c11875t = (C11875t) this.f38765b.get(i13 - 1);
        C34611p0 c34611p0 = c11875t.f38753a.f145858b;
        if (((C2830f0) interfaceC34599j0).m8111k0().f145850s.get(c34611p0) != null) {
            z4 = c11875t.f38753a.f145861e[c11875t.f38754b];
        }
        c11873s.f38751a.setText(c11875t.f38755c);
        c11873s.f38752b.setVisibility(z4 ? 0 : 4);
        c11873s.itemView.setOnClickListener(new ViewOnClickListenerC11877u(this, interfaceC34599j0, c34611p0, c11875t, 0));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0040  */
    /* JADX INFO: renamed from: b */
    public void mo31842b(C21827p c21827p, int i13) {
        boolean z4;
        C21830s c21830s = (C21830s) this.f38766c;
        if (c21830s.f84215r0 == null) {
            return;
        }
        if (i13 == 0) {
            mo31843d(c21827p);
            return;
        }
        C21828q c21828q = (C21828q) this.f38765b.get(i13 - 1);
        C32766w0 c32766w0 = c21828q.f84152a.f130351w;
        InterfaceC31519b1 interfaceC31519b1 = c21830s.f84215r0;
        interfaceC31519b1.getClass();
        if (((C20708t) ((C31571u) interfaceC31519b1).m97213g0().f77575X.f77530w.get(c32766w0)) != null) {
            z4 = c21828q.f84152a.f130354z[c21828q.f84153b];
        }
        c21827p.f84150a.setText(c21828q.f84154c);
        c21827p.f84151b.setVisibility(z4 ? 0 : 4);
        c21827p.itemView.setOnClickListener(new ViewOnClickListenerC19855d(this, c32766w0, c21828q, 1));
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo31835c(C11873s c11873s);

    /* JADX INFO: renamed from: d */
    public abstract void mo31843d(C21827p c21827p);

    /* JADX INFO: renamed from: e */
    public abstract void mo31836e(String str);

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    /* JADX INFO: renamed from: getItemCount */
    public final int getDisplayCount() {
        switch (this.f38764a) {
            case 0:
                if (this.f38765b.isEmpty()) {
                    return 0;
                }
                return this.f38765b.size() + 1;
            default:
                if (this.f38765b.isEmpty()) {
                    return 0;
                }
                return this.f38765b.size() + 1;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public /* bridge */ /* synthetic */ void onBindViewHolder(AbstractC1717o2 abstractC1717o2, int i13) {
        switch (this.f38764a) {
            case 0:
                mo31834a((C11873s) abstractC1717o2, i13);
                break;
            default:
                mo31842b((C21827p) abstractC1717o2, i13);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1692i1
    public final AbstractC1717o2 onCreateViewHolder(ViewGroup viewGroup, int i13) {
        switch (this.f38764a) {
            case 0:
                return new C11873s(LayoutInflater.from(((C11882x) this.f38766c).getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
            default:
                return new C21827p(LayoutInflater.from(((C21830s) this.f38766c).getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    public AbstractC11879v(C11882x c11882x) {
        this.f38766c = c11882x;
    }
}
