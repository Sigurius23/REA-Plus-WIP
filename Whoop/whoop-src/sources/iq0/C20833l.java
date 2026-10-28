package iq0;

import android.view.View;
import com.whoop.community.presentation.chat.NotificationSettingsFragment;
import n23.AbstractC26205h;
import o23.InterfaceC27471a;
import p184h5.C16905q1;
import p184h5.InterfaceC16915u;

/* JADX INFO: renamed from: iq0.l */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C20833l implements InterfaceC27471a, InterfaceC16915u {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f78219w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f78220x;

    public /* synthetic */ C20833l(Object obj, int i13) {
        this.f78219w = i13;
        this.f78220x = obj;
    }

    @Override // p184h5.InterfaceC16915u
    /* JADX INFO: renamed from: o */
    public C16905q1 mo1682o(View view, C16905q1 c16905q1) {
        return NotificationSettingsFragment.m19276J((NotificationSettingsFragment) this.f78220x, view, c16905q1);
    }

    @Override // o23.InterfaceC27471a
    public void onResult(AbstractC26205h abstractC26205h) {
        switch (this.f78219w) {
            case 0:
                C20834m.m57489c0((C20834m) this.f78220x, abstractC26205h);
                break;
            default:
                C20834m.m57490e0((C20834m) this.f78220x, abstractC26205h);
                break;
        }
    }
}
