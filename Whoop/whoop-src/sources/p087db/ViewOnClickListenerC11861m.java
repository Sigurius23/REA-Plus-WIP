package p087db;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import p004a2.AbstractC0152a;
import p031b9.C2830f0;
import p516u8.AbstractC34609o0;
import p516u8.C34593g0;
import p516u8.InterfaceC34595h0;
import p516u8.InterfaceC34599j0;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: db.m */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC11861m implements InterfaceC34595h0, InterfaceC11870q0, View.OnClickListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C11882x f38697w;

    public ViewOnClickListenerC11861m(C11882x c11882x) {
        this.f38697w = c11882x;
    }

    @Override // p087db.InterfaceC11870q0
    /* JADX INFO: renamed from: a */
    public final void mo31812a(long j7) {
        C11882x c11882x = this.f38697w;
        c11882x.f38801P0 = true;
        TextView textView = c11882x.f38824g0;
        if (textView != null) {
            textView.setText(AbstractC38065t.m121932y(c11882x.f38826i0, c11882x.f38827j0, j7));
        }
        c11882x.f38840w.m31793h();
    }

    @Override // p087db.InterfaceC11870q0
    /* JADX INFO: renamed from: b */
    public final void mo31813b(long j7) {
        C11882x c11882x = this.f38697w;
        TextView textView = c11882x.f38824g0;
        if (textView != null) {
            textView.setText(AbstractC38065t.m121932y(c11882x.f38826i0, c11882x.f38827j0, j7));
        }
    }

    @Override // p087db.InterfaceC11870q0
    /* JADX INFO: renamed from: c */
    public final void mo31814c(long j7, boolean z4) {
        InterfaceC34599j0 interfaceC34599j0;
        C11882x c11882x = this.f38697w;
        c11882x.f38801P0 = false;
        if (!z4 && (interfaceC34599j0 = c11882x.f38789J0) != null) {
            if (c11882x.f38799O0) {
                AbstractC0152a abstractC0152a = (AbstractC0152a) interfaceC34599j0;
                if (abstractC0152a.m367A(17) && abstractC0152a.m367A(10)) {
                    AbstractC34609o0 abstractC34609o0M8104c0 = ((C2830f0) abstractC0152a).m8104c0();
                    int iMo8139o = abstractC34609o0M8104c0.mo8139o();
                    int i13 = 0;
                    while (true) {
                        long jM121907U = AbstractC38065t.m121907U(abstractC34609o0M8104c0.mo8129m(i13, c11882x.f38829l0, 0L).f145713m);
                        if (j7 < jM121907U) {
                            break;
                        }
                        if (i13 == iMo8139o - 1) {
                            j7 = jM121907U;
                            break;
                        } else {
                            j7 -= jM121907U;
                            i13++;
                        }
                    }
                    abstractC0152a.mo374H(i13, j7, false);
                }
            } else {
                AbstractC0152a abstractC0152a2 = (AbstractC0152a) interfaceC34599j0;
                if (abstractC0152a2.m367A(5)) {
                    abstractC0152a2.mo374H(((C2830f0) abstractC0152a2).m8101Z(), j7, false);
                }
            }
            c11882x.m31860o();
        }
        c11882x.f38840w.m31794i();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C11882x c11882x = this.f38697w;
        ImageView imageView = c11882x.f38814W;
        View view2 = c11882x.f38822e0;
        View view3 = c11882x.f38821d0;
        View view4 = c11882x.f38820c0;
        C11842c0 c11842c0 = c11882x.f38840w;
        InterfaceC34599j0 interfaceC34599j0 = c11882x.f38789J0;
        if (interfaceC34599j0 == null) {
            return;
        }
        c11842c0.m31794i();
        if (c11882x.f38796N == view) {
            AbstractC0152a abstractC0152a = (AbstractC0152a) interfaceC34599j0;
            if (abstractC0152a.m367A(9)) {
                abstractC0152a.m376J();
                return;
            }
            return;
        }
        if (c11882x.f38794M == view) {
            AbstractC0152a abstractC0152a2 = (AbstractC0152a) interfaceC34599j0;
            if (abstractC0152a2.m367A(7)) {
                abstractC0152a2.m379M();
                return;
            }
            return;
        }
        if (c11882x.f38800P == view) {
            if (((C2830f0) interfaceC34599j0).m8110i0() != 4) {
                AbstractC0152a abstractC0152a3 = (AbstractC0152a) interfaceC34599j0;
                if (abstractC0152a3.m367A(12)) {
                    abstractC0152a3.m373G();
                    return;
                }
                return;
            }
            return;
        }
        if (c11882x.f38802Q == view) {
            AbstractC0152a abstractC0152a4 = (AbstractC0152a) interfaceC34599j0;
            if (abstractC0152a4.m367A(11)) {
                abstractC0152a4.m372F();
                return;
            }
            return;
        }
        if (c11882x.f38798O == view) {
            if (AbstractC38065t.m121905S(interfaceC34599j0, c11882x.f38797N0)) {
                AbstractC38065t.m121889C(interfaceC34599j0);
                return;
            } else {
                AbstractC38065t.m121888B(interfaceC34599j0);
                return;
            }
        }
        if (c11882x.f38808T == view) {
            if (((AbstractC0152a) interfaceC34599j0).m367A(15)) {
                C2830f0 c2830f0 = (C2830f0) interfaceC34599j0;
                c2830f0.m8091L0();
                c2830f0.m8081B0(AbstractC38046a.m121816k(c2830f0.f11138h0, c11882x.f38807S0));
                return;
            }
            return;
        }
        if (c11882x.f38810U == view) {
            if (((AbstractC0152a) interfaceC34599j0).m367A(14)) {
                C2830f0 c2830f1 = (C2830f0) interfaceC34599j0;
                c2830f1.m8091L0();
                c2830f1.m8082C0(!c2830f1.f11139i0);
                return;
            }
            return;
        }
        if (view4 == view) {
            c11842c0.m31793h();
            c11882x.m31849d(c11882x.f38780F, view4);
            return;
        }
        if (view3 == view) {
            c11842c0.m31793h();
            c11882x.m31849d(c11882x.f38782G, view3);
        } else if (view2 == view) {
            c11842c0.m31793h();
            c11882x.m31849d(c11882x.f38786I, view2);
        } else if (imageView == view) {
            c11842c0.m31793h();
            c11882x.m31849d(c11882x.f38784H, imageView);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C11882x c11882x = this.f38697w;
        if (c11882x.f38817Y0) {
            c11882x.f38840w.m31794i();
        }
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onEvents(InterfaceC34599j0 interfaceC34599j0, C34593g0 c34593g0) {
        boolean zM109390a = c34593g0.m109390a(4, 5, 13);
        C11882x c11882x = this.f38697w;
        if (zM109390a) {
            c11882x.m31858m();
        }
        if (c34593g0.m109390a(4, 5, 7, 13)) {
            c11882x.m31860o();
        }
        if (c34593g0.m109390a(8, 13)) {
            c11882x.m31861p();
        }
        if (c34593g0.m109390a(9, 13)) {
            c11882x.m31863r();
        }
        if (c34593g0.m109390a(8, 9, 11, 0, 16, 17, 13)) {
            c11882x.m31857l();
        }
        if (c34593g0.m109390a(11, 0, 13)) {
            c11882x.m31864s();
        }
        if (c34593g0.m109390a(12, 13)) {
            c11882x.m31859n();
        }
        if (c34593g0.m109390a(2, 13)) {
            c11882x.m31865t();
        }
    }
}
