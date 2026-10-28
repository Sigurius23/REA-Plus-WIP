package mo;

import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import p078d1.C11457j;
import p309lo.AbstractC24567y;
import p465rm.C31521c0;
import p465rm.SurfaceHolderCallbackC31565r;
import p527um.C35074d;
import sm.C32709b;
import sm.C32710c;
import sm.C32711d;
import sn.C32763v;

/* JADX INFO: renamed from: mo.q */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC25736q implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f101426w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11457j f101427x;

    public /* synthetic */ RunnableC25736q(C11457j c11457j, int i13, long j7) {
        this.f101426w = 0;
        this.f101427x = c11457j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f101426w;
        C11457j c11457j = this.f101427x;
        switch (i13) {
            case 0:
                SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r = (SurfaceHolderCallbackC31565r) c11457j.f36754y;
                int i14 = AbstractC24567y.f95875a;
                C32711d c32711d = surfaceHolderCallbackC31565r.f130359w.f130402S;
                c32711d.m102668z(c32711d.m102665v((C32763v) c32711d.f135994z.f1165F), MessageListItemViewType.POLL, new C32709b(24));
                break;
            case 1:
                SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r2 = (SurfaceHolderCallbackC31565r) c11457j.f36754y;
                int i15 = AbstractC24567y.f95875a;
                C32711d c32711d2 = surfaceHolderCallbackC31565r2.f130359w.f130402S;
                c32711d2.m102668z(c32711d2.m102667y(), 1019, new C32710c(8));
                break;
            case 2:
                SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r3 = (SurfaceHolderCallbackC31565r) c11457j.f36754y;
                int i16 = AbstractC24567y.f95875a;
                C32711d c32711d3 = surfaceHolderCallbackC31565r3.f130359w.f130402S;
                c32711d3.m102668z(c32711d3.m102667y(), 1030, new C32710c(19));
                break;
            case 3:
                SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r4 = (SurfaceHolderCallbackC31565r) c11457j.f36754y;
                int i17 = AbstractC24567y.f95875a;
                C32711d c32711d4 = surfaceHolderCallbackC31565r4.f130359w.f130402S;
                c32711d4.m102668z(c32711d4.m102667y(), MessageListItemViewType.UNREAD_SEPARATOR, new C32709b(15));
                break;
            case 4:
                SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r5 = (SurfaceHolderCallbackC31565r) c11457j.f36754y;
                int i18 = AbstractC24567y.f95875a;
                C32711d c32711d5 = surfaceHolderCallbackC31565r5.f130359w.f130402S;
                c32711d5.m102668z(c32711d5.m102667y(), MessageListItemViewType.LINK_ATTACHMENTS, new C32709b(13));
                break;
            case 5:
                SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r6 = (SurfaceHolderCallbackC31565r) c11457j.f36754y;
                int i19 = AbstractC24567y.f95875a;
                C32711d c32711d6 = surfaceHolderCallbackC31565r6.f130359w.f130402S;
                c32711d6.m102668z(c32711d6.m102667y(), MessageListItemViewType.START_OF_THE_CHANNEL, new C32709b(12));
                break;
            default:
                SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r7 = (SurfaceHolderCallbackC31565r) c11457j.f36754y;
                int i24 = AbstractC24567y.f95875a;
                C32711d c32711d7 = surfaceHolderCallbackC31565r7.f130359w.f130402S;
                c32711d7.m102668z(c32711d7.m102665v((C32763v) c32711d7.f135994z.f1165F), 1021, new C32709b(28));
                break;
        }
    }

    public /* synthetic */ RunnableC25736q(C11457j c11457j, long j7, int i13) {
        this.f101426w = 6;
        this.f101427x = c11457j;
    }

    public /* synthetic */ RunnableC25736q(C11457j c11457j, Object obj, int i13) {
        this.f101426w = i13;
        this.f101427x = c11457j;
    }

    public /* synthetic */ RunnableC25736q(C11457j c11457j, String str, long j7, long j13) {
        this.f101426w = 3;
        this.f101427x = c11457j;
    }

    public /* synthetic */ RunnableC25736q(C11457j c11457j, C31521c0 c31521c0, C35074d c35074d) {
        this.f101426w = 5;
        this.f101427x = c11457j;
    }
}
