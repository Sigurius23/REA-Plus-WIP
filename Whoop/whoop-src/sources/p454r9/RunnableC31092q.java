package p454r9;

import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import p012ab.C0667a;
import p031b9.C2835h;
import p031b9.SurfaceHolderCallbackC2821c0;
import p047c9.C4313d;
import p047c9.C4316g;
import p047c9.C4317h;
import p299l9.C23488c0;
import p516u8.C34610p;
import p607x8.AbstractC38065t;
import p619xl.C38445a;

/* JADX INFO: renamed from: r9.q */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC31092q implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f128244w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C38445a f128245x;

    public /* synthetic */ RunnableC31092q(C38445a c38445a, int i13, long j7) {
        this.f128244w = 3;
        this.f128245x = c38445a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f128244w;
        C38445a c38445a = this.f128245x;
        switch (i13) {
            case 0:
                SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c0 = (SurfaceHolderCallbackC2821c0) c38445a.f164637y;
                int i14 = AbstractC38065t.f163031a;
                C4317h c4317h = surfaceHolderCallbackC2821c0.f11043w.f11124T;
                c4317h.m13602l(c4317h.m13601k(), MessageListItemViewType.UNREAD_SEPARATOR, new C4313d(2));
                break;
            case 1:
                SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c1 = (SurfaceHolderCallbackC2821c0) c38445a.f164637y;
                int i15 = AbstractC38065t.f163031a;
                C4317h c4317h2 = surfaceHolderCallbackC2821c1.f11043w.f11124T;
                c4317h2.m13602l(c4317h2.m13601k(), 1030, new C4316g(3));
                break;
            case 2:
                SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c2 = (SurfaceHolderCallbackC2821c0) c38445a.f164637y;
                int i16 = AbstractC38065t.f163031a;
                C4317h c4317h3 = surfaceHolderCallbackC2821c2.f11043w.f11124T;
                c4317h3.m13602l(c4317h3.m13601k(), 1019, new C0667a(21));
                break;
            case 3:
                SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c3 = (SurfaceHolderCallbackC2821c0) c38445a.f164637y;
                int i17 = AbstractC38065t.f163031a;
                C4317h c4317h4 = surfaceHolderCallbackC2821c3.f11043w.f11124T;
                c4317h4.m13602l(c4317h4.m13598h((C23488c0) c4317h4.f17523z.f1165F), MessageListItemViewType.POLL, new C4313d(12));
                break;
            case 4:
                SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c4 = (SurfaceHolderCallbackC2821c0) c38445a.f164637y;
                int i18 = AbstractC38065t.f163031a;
                C4317h c4317h5 = surfaceHolderCallbackC2821c4.f11043w.f11124T;
                c4317h5.m13602l(c4317h5.m13598h((C23488c0) c4317h5.f17523z.f1165F), 1021, new C4313d(13));
                break;
            case 5:
                SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c5 = (SurfaceHolderCallbackC2821c0) c38445a.f164637y;
                int i19 = AbstractC38065t.f163031a;
                C4317h c4317h6 = surfaceHolderCallbackC2821c5.f11043w.f11124T;
                c4317h6.m13602l(c4317h6.m13601k(), MessageListItemViewType.LINK_ATTACHMENTS, new C4313d(22));
                break;
            default:
                SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c6 = (SurfaceHolderCallbackC2821c0) c38445a.f164637y;
                int i24 = AbstractC38065t.f163031a;
                C4317h c4317h7 = surfaceHolderCallbackC2821c6.f11043w.f11124T;
                c4317h7.m13602l(c4317h7.m13601k(), MessageListItemViewType.START_OF_THE_CHANNEL, new C4313d(17));
                break;
        }
    }

    public /* synthetic */ RunnableC31092q(C38445a c38445a, long j7, int i13) {
        this.f128244w = 4;
        this.f128245x = c38445a;
    }

    public /* synthetic */ RunnableC31092q(C38445a c38445a, Object obj, int i13) {
        this.f128244w = i13;
        this.f128245x = c38445a;
    }

    public /* synthetic */ RunnableC31092q(C38445a c38445a, String str, long j7, long j13) {
        this.f128244w = 0;
        this.f128245x = c38445a;
    }

    public /* synthetic */ RunnableC31092q(C38445a c38445a, C34610p c34610p, C2835h c2835h) {
        this.f128244w = 6;
        this.f128245x = c38445a;
    }
}
