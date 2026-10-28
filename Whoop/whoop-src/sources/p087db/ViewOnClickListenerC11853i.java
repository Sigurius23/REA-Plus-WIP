package p087db;

import android.view.View;
import android.widget.TextView;
import androidx.media3.p019ui.LegacyPlayerControlView;
import p004a2.AbstractC0152a;
import p031b9.C2830f0;
import p516u8.AbstractC34609o0;
import p516u8.C34593g0;
import p516u8.C34606n;
import p516u8.InterfaceC34595h0;
import p516u8.InterfaceC34599j0;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: db.i */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC11853i implements InterfaceC34595h0, InterfaceC11870q0, View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ LegacyPlayerControlView f38678w;

    public ViewOnClickListenerC11853i(LegacyPlayerControlView legacyPlayerControlView) {
        this.f38678w = legacyPlayerControlView;
    }

    @Override // p087db.InterfaceC11870q0
    /* JADX INFO: renamed from: a */
    public final void mo31812a(long j7) {
        LegacyPlayerControlView legacyPlayerControlView = this.f38678w;
        legacyPlayerControlView.f6441o0 = true;
        TextView textView = legacyPlayerControlView.f6416M;
        if (textView != null) {
            textView.setText(AbstractC38065t.m121932y(legacyPlayerControlView.f6418O, legacyPlayerControlView.f6419P, j7));
        }
    }

    @Override // p087db.InterfaceC11870q0
    /* JADX INFO: renamed from: b */
    public final void mo31813b(long j7) {
        LegacyPlayerControlView legacyPlayerControlView = this.f38678w;
        TextView textView = legacyPlayerControlView.f6416M;
        if (textView != null) {
            textView.setText(AbstractC38065t.m121932y(legacyPlayerControlView.f6418O, legacyPlayerControlView.f6419P, j7));
        }
    }

    @Override // p087db.InterfaceC11870q0
    /* JADX INFO: renamed from: c */
    public final void mo31814c(long j7, boolean z4) {
        InterfaceC34599j0 interfaceC34599j0;
        int iM8101Z;
        LegacyPlayerControlView legacyPlayerControlView = this.f38678w;
        legacyPlayerControlView.f6441o0 = false;
        if (z4 || (interfaceC34599j0 = legacyPlayerControlView.f6436j0) == null) {
            return;
        }
        C2830f0 c2830f0 = (C2830f0) interfaceC34599j0;
        AbstractC34609o0 abstractC34609o0M8104c0 = c2830f0.m8104c0();
        if (legacyPlayerControlView.f6440n0 && !abstractC34609o0M8104c0.m109408p()) {
            int iMo8139o = abstractC34609o0M8104c0.mo8139o();
            iM8101Z = 0;
            while (true) {
                long jM121907U = AbstractC38065t.m121907U(abstractC34609o0M8104c0.mo8129m(iM8101Z, legacyPlayerControlView.f6421R, 0L).f145713m);
                if (j7 < jM121907U) {
                    break;
                }
                if (iM8101Z == iMo8139o - 1) {
                    j7 = jM121907U;
                    break;
                } else {
                    j7 -= jM121907U;
                    iM8101Z++;
                }
            }
        } else {
            iM8101Z = c2830f0.m8101Z();
        }
        c2830f0.mo374H(iM8101Z, j7, false);
        legacyPlayerControlView.m5068i();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LegacyPlayerControlView legacyPlayerControlView = this.f38678w;
        InterfaceC34599j0 interfaceC34599j0 = legacyPlayerControlView.f6436j0;
        if (interfaceC34599j0 == null) {
            return;
        }
        if (legacyPlayerControlView.f6455z == view) {
            ((AbstractC0152a) interfaceC34599j0).m376J();
            return;
        }
        if (legacyPlayerControlView.f6453y == view) {
            ((AbstractC0152a) interfaceC34599j0).m379M();
            return;
        }
        if (legacyPlayerControlView.f6410G == view) {
            if (((C2830f0) interfaceC34599j0).m8110i0() != 4) {
                ((AbstractC0152a) interfaceC34599j0).m373G();
                return;
            }
            return;
        }
        if (legacyPlayerControlView.f6411H == view) {
            ((AbstractC0152a) interfaceC34599j0).m372F();
            return;
        }
        if (legacyPlayerControlView.f6408E == view) {
            AbstractC38065t.m121889C(interfaceC34599j0);
            return;
        }
        if (legacyPlayerControlView.f6409F == view) {
            AbstractC38065t.m121888B(interfaceC34599j0);
            return;
        }
        if (legacyPlayerControlView.f6412I == view) {
            C2830f0 c2830f0 = (C2830f0) interfaceC34599j0;
            c2830f0.m8091L0();
            c2830f0.m8081B0(AbstractC38046a.m121816k(c2830f0.f11138h0, legacyPlayerControlView.f6444r0));
        } else if (legacyPlayerControlView.f6413J == view) {
            C2830f0 c2830f1 = (C2830f0) interfaceC34599j0;
            c2830f1.m8091L0();
            c2830f1.m8082C0(!c2830f1.f11139i0);
        }
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onEvents(InterfaceC34599j0 interfaceC34599j0, C34593g0 c34593g0) {
        C34606n c34606n = c34593g0.f145665a;
        boolean zM109390a = c34593g0.m109390a(4, 5);
        LegacyPlayerControlView legacyPlayerControlView = this.f38678w;
        if (zM109390a) {
            int i13 = LegacyPlayerControlView.f6403E0;
            legacyPlayerControlView.m5067h();
        }
        if (c34593g0.m109390a(4, 5, 7)) {
            int i14 = LegacyPlayerControlView.f6403E0;
            legacyPlayerControlView.m5068i();
        }
        if (c34606n.f145698a.get(8)) {
            int i15 = LegacyPlayerControlView.f6403E0;
            legacyPlayerControlView.m5069j();
        }
        if (c34606n.f145698a.get(9)) {
            int i16 = LegacyPlayerControlView.f6403E0;
            legacyPlayerControlView.m5070k();
        }
        if (c34593g0.m109390a(8, 9, 11, 0, 13)) {
            int i17 = LegacyPlayerControlView.f6403E0;
            legacyPlayerControlView.m5066g();
        }
        if (c34593g0.m109390a(11, 0)) {
            int i18 = LegacyPlayerControlView.f6403E0;
            legacyPlayerControlView.m5071l();
        }
    }
}
