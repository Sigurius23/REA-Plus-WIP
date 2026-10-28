package p087db;

import android.widget.ImageView;
import androidx.recyclerview.widget.AbstractC1717o2;
import b30.ViewOnClickListenerC2558k3;
import com.whoop.android.R;
import java.util.List;
import p031b9.C2830f0;
import p361o9.C27670j;
import p516u8.InterfaceC34599j0;
import p690zr.C41060w0;

/* JADX INFO: renamed from: db.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C11859l extends AbstractC11879v {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f38689d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C11882x f38690e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11859l(C11882x c11882x, int i13) {
        super(c11882x);
        this.f38689d = i13;
        this.f38690e = c11882x;
    }

    /* JADX INFO: renamed from: h */
    private final void m31833h(String str) {
    }

    @Override // p087db.AbstractC11879v
    /* JADX INFO: renamed from: a */
    public void mo31834a(C11873s c11873s, int i13) {
        switch (this.f38689d) {
            case 1:
                super.mo31834a(c11873s, i13);
                if (i13 > 0) {
                    C11875t c11875t = (C11875t) this.f38765b.get(i13 - 1);
                    c11873s.f38752b.setVisibility(c11875t.f38753a.f145861e[c11875t.f38754b] ? 0 : 4);
                }
                break;
            default:
                super.mo31834a(c11873s, i13);
                break;
        }
    }

    @Override // p087db.AbstractC11879v
    /* JADX INFO: renamed from: c */
    public final void mo31835c(C11873s c11873s) {
        boolean z4;
        switch (this.f38689d) {
            case 0:
                c11873s.f38751a.setText(R.string.exo_track_selection_auto);
                InterfaceC34599j0 interfaceC34599j0 = this.f38690e.f38789J0;
                interfaceC34599j0.getClass();
                c11873s.f38752b.setVisibility(m31837f(((C2830f0) interfaceC34599j0).m8111k0()) ? 4 : 0);
                c11873s.itemView.setOnClickListener(new ViewOnClickListenerC2558k3(this, 4));
                break;
            default:
                c11873s.f38751a.setText(R.string.exo_track_selection_none);
                int i13 = 0;
                while (true) {
                    if (i13 < this.f38765b.size()) {
                        C11875t c11875t = (C11875t) this.f38765b.get(i13);
                        if (c11875t.f38753a.f145861e[c11875t.f38754b]) {
                            z4 = false;
                        } else {
                            i13++;
                        }
                    } else {
                        z4 = true;
                    }
                }
                c11873s.f38752b.setVisibility(z4 ? 0 : 4);
                c11873s.itemView.setOnClickListener(new ViewOnClickListenerC2558k3(this, 6));
                break;
        }
    }

    @Override // p087db.AbstractC11879v
    /* JADX INFO: renamed from: e */
    public final void mo31836e(String str) {
        switch (this.f38689d) {
            case 0:
                this.f38690e.f38780F.f38748c[1] = str;
                break;
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m31837f(C27670j c27670j) {
        for (int i13 = 0; i13 < this.f38765b.size(); i13++) {
            if (c27670j.f145850s.containsKey(((C11875t) this.f38765b.get(i13)).f38753a.f145858b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public void m31838g(List list) {
        C11882x c11882x = this.f38690e;
        ImageView imageView = c11882x.f38814W;
        boolean z4 = false;
        for (int i13 = 0; i13 < ((C41060w0) list).f177069z; i13++) {
            C11875t c11875t = (C11875t) ((C41060w0) list).get(i13);
            if (c11875t.f38753a.f145861e[c11875t.f38754b]) {
                z4 = true;
                break;
            }
        }
        if (imageView != null) {
            imageView.setImageDrawable(z4 ? c11882x.f38775B0 : c11882x.f38776C0);
            imageView.setContentDescription(z4 ? c11882x.f38777D0 : c11882x.f38779E0);
        }
        this.f38765b = list;
    }

    @Override // p087db.AbstractC11879v, androidx.recyclerview.widget.AbstractC1692i1
    public /* bridge */ /* synthetic */ void onBindViewHolder(AbstractC1717o2 abstractC1717o2, int i13) {
        switch (this.f38689d) {
            case 1:
                mo31834a((C11873s) abstractC1717o2, i13);
                break;
            default:
                super.onBindViewHolder(abstractC1717o2, i13);
                break;
        }
    }
}
