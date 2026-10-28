package io.getstream.chat.android.client;

import android.app.DatePickerDialog;
import android.database.SQLException;
import android.view.View;
import c93.InterfaceC4339a;
import ec3.C13096w1;
import ec3.InterfaceC13072o1;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.api.models.identifier.IdentifiersKt;
import is0.AbstractC20900p;
import is0.C20871a0;
import kd1.AbstractC22413y;
import l83.C23454a0;
import lb.C23562e;
import nh1.C26722c;
import p078d1.C11449b;
import ph1.AbstractC29245i;
import vp1.AbstractC36272h;

/* JADX INFO: renamed from: io.getstream.chat.android.client.b */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C19072b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73775w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f73776x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f73777y;

    public /* synthetic */ C19072b(Object obj, boolean z4, int i13) {
        this.f73775w = i13;
        this.f73777y = obj;
        this.f73776x = z4;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        InterfaceC13072o1 interfaceC13072o1M30726i;
        int i13 = this.f73775w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj = this.f73777y;
        boolean z4 = this.f73776x;
        switch (i13) {
            case 0:
                ChatClient.Companion companion = ChatClient.INSTANCE;
                return Integer.valueOf(IdentifiersKt.DeleteMessageIdentifier((String) obj, z4));
            case 1:
                return AbstractC20900p.m57863r(z4, (C20871a0) obj);
            case 2:
                return AbstractC22413y.m64548i((View) obj, z4);
            case 3:
                C23562e c23562e = (C23562e) obj;
                String str = z4 ? "reader" : "writer";
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Timed out attempting to acquire a " + str + " connection.");
                sb4.append("\n\nWriter pool:\n");
                c23562e.f93452x.m68221d(sb4);
                sb4.append("Reader pool:");
                sb4.append('\n');
                c23562e.f93451w.m68221d(sb4);
                try {
                    AbstractC17269i.m48901l0(5, sb4.toString());
                    throw null;
                } catch (SQLException e5) {
                    int i14 = c23562e.f93450G;
                    if (i14 == 1) {
                        throw e5;
                    }
                    if (i14 == 2) {
                        e5.printStackTrace();
                    }
                    return c23454a0;
                }
            case 4:
                return AbstractC29245i.m88792T(z4, (C26722c.d) obj);
            case 5:
                C11449b c11449b = (C11449b) obj;
                if (z4 && (interfaceC13072o1M30726i = c11449b.m30726i()) != null) {
                    ((C13096w1) interfaceC13072o1M30726i).mo36564a(c23454a0);
                }
                return c23454a0;
            default:
                return AbstractC36272h.m115855l0(z4, (DatePickerDialog) obj);
        }
    }

    public /* synthetic */ C19072b(boolean z4, Object obj, int i13) {
        this.f73775w = i13;
        this.f73776x = z4;
        this.f73777y = obj;
    }
}
