package tm;

import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import p309lo.AbstractC24567y;
import p412q3.C29875i;
import p465rm.C31521c0;
import p465rm.SurfaceHolderCallbackC31565r;
import p527um.C35074d;
import qa.C30097b;
import sm.C32709b;
import sm.C32710c;
import sm.C32711d;

/* JADX INFO: renamed from: tm.i */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class RunnableC33931i implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f142180w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C29875i f142181x;

    public /* synthetic */ RunnableC33931i(C29875i c29875i, int i13, long j7, long j13) {
        this.f142180w = 1;
        this.f142181x = c29875i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f142180w;
        int i14 = 20;
        int i15 = 22;
        C29875i c29875i = this.f142181x;
        switch (i13) {
            case 0:
                SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r = (SurfaceHolderCallbackC31565r) c29875i.f122096x;
                int i16 = AbstractC24567y.f95875a;
                C32711d c32711d = surfaceHolderCallbackC31565r.f130359w.f130402S;
                c32711d.m102668z(c32711d.m102667y(), MessageListItemViewType.GIPHY_ATTACHMENT, new C32709b(20));
                break;
            case 1:
                SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r2 = (SurfaceHolderCallbackC31565r) c29875i.f122096x;
                int i17 = AbstractC24567y.f95875a;
                C32711d c32711d2 = surfaceHolderCallbackC31565r2.f130359w.f130402S;
                c32711d2.m102668z(c32711d2.m102667y(), MessageListItemViewType.THREAD_PLACEHOLDER, new C32710c(i15));
                break;
            case 2:
                SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r3 = (SurfaceHolderCallbackC31565r) c29875i.f122096x;
                int i18 = AbstractC24567y.f95875a;
                C32711d c32711d3 = surfaceHolderCallbackC31565r3.f130359w.f130402S;
                c32711d3.m102668z(c32711d3.m102667y(), MessageListItemViewType.GIPHY, new C30097b(29));
                break;
            case 3:
                SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r4 = (SurfaceHolderCallbackC31565r) c29875i.f122096x;
                int i19 = AbstractC24567y.f95875a;
                C32711d c32711d4 = surfaceHolderCallbackC31565r4.f130359w.f130402S;
                c32711d4.m102668z(c32711d4.m102667y(), 1029, new C32710c(i14));
                break;
            case 4:
                SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r5 = (SurfaceHolderCallbackC31565r) c29875i.f122096x;
                int i24 = AbstractC24567y.f95875a;
                C32711d c32711d5 = surfaceHolderCallbackC31565r5.f130359w.f130402S;
                c32711d5.m102668z(c32711d5.m102667y(), MessageListItemViewType.ERROR_MESSAGE, new C32709b(22));
                break;
            case 5:
                SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r6 = (SurfaceHolderCallbackC31565r) c29875i.f122096x;
                int i25 = AbstractC24567y.f95875a;
                C32711d c32711d6 = surfaceHolderCallbackC31565r6.f130359w.f130402S;
                c32711d6.m102668z(c32711d6.m102667y(), MessageListItemViewType.TYPING_INDICATOR, new C32710c(3));
                break;
            case 6:
                SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r7 = (SurfaceHolderCallbackC31565r) c29875i.f122096x;
                int i26 = AbstractC24567y.f95875a;
                C32711d c32711d7 = surfaceHolderCallbackC31565r7.f130359w.f130402S;
                c32711d7.m102668z(c32711d7.m102667y(), MessageListItemViewType.SYSTEM_MESSAGE, new C32710c(21));
                break;
            default:
                SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r8 = (SurfaceHolderCallbackC31565r) c29875i.f122096x;
                int i27 = AbstractC24567y.f95875a;
                C32711d c32711d8 = surfaceHolderCallbackC31565r8.f130359w.f130402S;
                c32711d8.m102668z(c32711d8.m102667y(), MessageListItemViewType.FILE_ATTACHMENTS, new C32709b(27));
                break;
        }
    }

    public /* synthetic */ RunnableC33931i(C29875i c29875i, long j7) {
        this.f142180w = 4;
        this.f142181x = c29875i;
    }

    public /* synthetic */ RunnableC33931i(C29875i c29875i, Object obj, int i13) {
        this.f142180w = i13;
        this.f142181x = c29875i;
    }

    public /* synthetic */ RunnableC33931i(C29875i c29875i, String str, long j7, long j13) {
        this.f142180w = 2;
        this.f142181x = c29875i;
    }

    public /* synthetic */ RunnableC33931i(C29875i c29875i, C31521c0 c31521c0, C35074d c35074d) {
        this.f142180w = 6;
        this.f142181x = c29875i;
    }
}
