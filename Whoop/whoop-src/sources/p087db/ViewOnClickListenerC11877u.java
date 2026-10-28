package p087db;

import android.view.View;
import c93.InterfaceC4339a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whoop.community.presentation.teams.calendar.TeamCalendarView;
import com.whoop.domain.model.teams.TeamUser;
import eq0.AbstractC13552x1;
import p004a2.AbstractC0152a;
import p031b9.C2830f0;
import p361o9.C27669i;
import p361o9.C27670j;
import p516u8.C34611p0;
import p516u8.C34613q0;
import p516u8.InterfaceC34599j0;
import p690zr.AbstractC41023g0;
import rq0.C31672i;
import rq0.C31677k;
import rq0.C31696t0;

/* JADX INFO: renamed from: db.u */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ViewOnClickListenerC11877u implements View.OnClickListener {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f38758E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f38759w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f38760x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f38761y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f38762z;

    public /* synthetic */ ViewOnClickListenerC11877u(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f38759w = i13;
        this.f38760x = obj;
        this.f38761y = obj2;
        this.f38762z = obj3;
        this.f38758E = obj4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f38759w) {
            case 0:
                AbstractC11879v abstractC11879v = (AbstractC11879v) this.f38760x;
                InterfaceC34599j0 interfaceC34599j0 = (InterfaceC34599j0) this.f38761y;
                C34611p0 c34611p0 = (C34611p0) this.f38762z;
                C11875t c11875t = (C11875t) this.f38758E;
                AbstractC0152a abstractC0152a = (AbstractC0152a) interfaceC34599j0;
                if (abstractC0152a.m367A(29)) {
                    C2830f0 c2830f0 = (C2830f0) abstractC0152a;
                    C27670j c27670jM8111k0 = c2830f0.m8111k0();
                    c27670jM8111k0.getClass();
                    C27669i c27669i = new C27669i(c27670jM8111k0);
                    C34613q0 c34613q0 = new C34613q0(c34611p0, AbstractC41023g0.m133256r(Integer.valueOf(c11875t.f38754b)));
                    C34611p0 c34611p1 = c34613q0.f145803a;
                    c27669i.m109413a(c34611p1.f145798c);
                    c27669i.f145825s.put(c34611p1, c34613q0);
                    c27669i.m83663d(c11875t.f38753a.f145858b.f145798c);
                    c2830f0.m8083D0(new C27670j(c27669i));
                    abstractC11879v.mo31836e(c11875t.f38755c);
                    ((C11882x) abstractC11879v.f38766c).f38790K.dismiss();
                    break;
                }
                break;
            case 1:
                C31672i.b.m98063f((C31677k) this.f38760x, (TeamUser) this.f38761y, (C31672i.b) this.f38762z, (InterfaceC4339a) this.f38758E, view);
                break;
            default:
                C31696t0.m98214N0((BottomSheetBehavior) this.f38760x, (TeamCalendarView) this.f38761y, (C31696t0) this.f38762z, (AbstractC13552x1) this.f38758E, view);
                break;
        }
    }
}
