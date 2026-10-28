package bc3;

import android.content.Context;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.WhoopApplication;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import io.getstream.chat.android.client.notifications.handler.NotificationHandlerFactory;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.Message;
import k31.C22174d;
import k71.AbstractC22253j;
import l83.C23454a0;
import mc3.C25436b;
import mc3.C25437c;
import mc3.C25442h;
import p040c0.InterfaceC3747i0;
import p291l0.InterfaceC22997s1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p720m91.InterfaceC25312u;
import p741vn1.AbstractC36215s;
import tr2.InterfaceC34116n;
import um1.AbstractC35084b;

/* JADX INFO: renamed from: bc3.l */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C3029l implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f12045w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f12046x;

    public /* synthetic */ C3029l(Object obj, int i13) {
        this.f12045w = i13;
        this.f12046x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f12045w) {
            case 0:
                ((Function1) this.f12046x).invoke((Throwable) obj);
                return C23454a0.f92919a;
            case 1:
                return WhoopApplication.m16941m((InterfaceC34116n) this.f12046x, ((Integer) obj).intValue(), (String) obj2, (Throwable) obj3);
            case 2:
                return AbstractC18249c.m52568f((AbstractC18247a) this.f12046x, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 3:
                return NotificationHandlerFactory.getDefaultActionsProvider$lambda$2((Context) this.f12046x, ((Integer) obj).intValue(), (Channel) obj2, (Message) obj3);
            case 4:
                return AbstractC22253j.m63823I((String) this.f12046x, (InterfaceC25312u) obj, (Composer) obj2, ((Integer) obj3).intValue());
            case 5:
                C25437c c25437c = (C25437c) this.f12046x;
                C25437c.f99626H.set(c25437c, null);
                c25437c.mo68214i(null);
                return C23454a0.f92919a;
            case 6:
                ((C25442h) this.f12046x).m74673d();
                return C23454a0.f92919a;
            case 7:
                return AbstractC35084b.m110940d((C22174d) this.f12046x, (InterfaceC3747i0) obj, (Composer) obj2, ((Integer) obj3).intValue());
            default:
                return AbstractC36215s.m115279l((InterfaceC4351m) this.f12046x, (InterfaceC22997s1) obj, (Composer) obj2, ((Integer) obj3).intValue());
        }
    }

    public /* synthetic */ C3029l(C25437c c25437c, C25436b c25436b) {
        this.f12045w = 5;
        this.f12046x = c25437c;
    }
}
