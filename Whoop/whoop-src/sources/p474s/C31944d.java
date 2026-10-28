package p474s;

import android.content.Context;
import android.view.View;
import com.whoop.android.R;
import p444r.AbstractC30826t;
import p444r.C30828v;
import p444r.MenuC30818l;
import p444r.SubMenuC30810d0;
import q30.C29934u0;

/* JADX INFO: renamed from: s.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C31944d extends C30828v {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f132653l = 0;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C31960h f132654m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31944d(C31960h c31960h, Context context, MenuC30818l menuC30818l, View view) {
        super(context, menuC30818l, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.f132654m = c31960h;
        this.f127127f = 8388613;
        C29934u0 c29934u0 = c31960h.f132700W;
        this.f127129h = c29934u0;
        AbstractC30826t abstractC30826t = this.f127130i;
        if (abstractC30826t != null) {
            abstractC30826t.mo94787h(c29934u0);
        }
    }

    @Override // p444r.C30828v
    /* JADX INFO: renamed from: c */
    public final void mo94836c() {
        switch (this.f132653l) {
            case 0:
                C31960h c31960h = this.f132654m;
                c31960h.f132697T = null;
                c31960h.getClass();
                super.mo94836c();
                break;
            default:
                C31960h c31960h2 = this.f132654m;
                MenuC30818l menuC30818l = c31960h2.f132703y;
                if (menuC30818l != null) {
                    menuC30818l.m94815d(true);
                }
                c31960h2.f132696S = null;
                super.mo94836c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31944d(C31960h c31960h, Context context, SubMenuC30810d0 subMenuC30810d0, View view) {
        super(context, subMenuC30810d0, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.f132654m = c31960h;
        if ((subMenuC30810d0.f127011B.f127109y & 32) != 32) {
            View view2 = c31960h.f132686I;
            this.f127126e = view2 == null ? (View) c31960h.f132685H : view2;
        }
        C29934u0 c29934u0 = c31960h.f132700W;
        this.f127129h = c29934u0;
        AbstractC30826t abstractC30826t = this.f127130i;
        if (abstractC30826t != null) {
            abstractC30826t.mo94787h(c29934u0);
        }
    }
}
