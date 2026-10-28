package p085d9;

import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import io.sentry.internal.debugmeta.C20378c;
import p012ab.C0667a;
import p031b9.C2835h;
import p031b9.SurfaceHolderCallbackC2821c0;
import p047c9.C4313d;
import p047c9.C4317h;
import p516u8.C34610p;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: d9.h */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC11791h implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f38237w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C20378c f38238x;

    public /* synthetic */ RunnableC11791h(C20378c c20378c, int i13, long j7, long j13) {
        this.f38237w = 6;
        this.f38238x = c20378c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f38237w;
        C20378c c20378c = this.f38238x;
        switch (i13) {
            case 0:
                SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c0 = (SurfaceHolderCallbackC2821c0) c20378c.f76423y;
                int i14 = AbstractC38065t.f163031a;
                C4317h c4317h = surfaceHolderCallbackC2821c0.f11043w.f11124T;
                c4317h.m13602l(c4317h.m13601k(), 1029, new C4313d(1));
                break;
            case 1:
                SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c1 = (SurfaceHolderCallbackC2821c0) c20378c.f76423y;
                int i15 = AbstractC38065t.f163031a;
                C4317h c4317h2 = surfaceHolderCallbackC2821c1.f11043w.f11124T;
                c4317h2.m13602l(c4317h2.m13601k(), MessageListItemViewType.ERROR_MESSAGE, new C4313d(10));
                break;
            case 2:
                SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c2 = (SurfaceHolderCallbackC2821c0) c20378c.f76423y;
                int i16 = AbstractC38065t.f163031a;
                C4317h c4317h3 = surfaceHolderCallbackC2821c2.f11043w.f11124T;
                c4317h3.m13602l(c4317h3.m13601k(), 1032, new C4313d(27));
                break;
            case 3:
                SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c3 = (SurfaceHolderCallbackC2821c0) c20378c.f76423y;
                int i17 = AbstractC38065t.f163031a;
                C4317h c4317h4 = surfaceHolderCallbackC2821c3.f11043w.f11124T;
                c4317h4.m13602l(c4317h4.m13601k(), MessageListItemViewType.GIPHY, new C0667a(19));
                break;
            case 4:
                SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c4 = (SurfaceHolderCallbackC2821c0) c20378c.f76423y;
                int i18 = AbstractC38065t.f163031a;
                C4317h c4317h5 = surfaceHolderCallbackC2821c4.f11043w.f11124T;
                c4317h5.m13602l(c4317h5.m13601k(), MessageListItemViewType.GIPHY_ATTACHMENT, new C4313d(29));
                break;
            case 5:
                SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c5 = (SurfaceHolderCallbackC2821c0) c20378c.f76423y;
                int i19 = AbstractC38065t.f163031a;
                C4317h c4317h6 = surfaceHolderCallbackC2821c5.f11043w.f11124T;
                c4317h6.m13602l(c4317h6.m13601k(), MessageListItemViewType.TYPING_INDICATOR, new C4313d(8));
                break;
            case 6:
                SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c6 = (SurfaceHolderCallbackC2821c0) c20378c.f76423y;
                int i24 = AbstractC38065t.f163031a;
                C4317h c4317h7 = surfaceHolderCallbackC2821c6.f11043w.f11124T;
                c4317h7.m13602l(c4317h7.m13601k(), MessageListItemViewType.THREAD_PLACEHOLDER, new C4313d(9));
                break;
            case 7:
                SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c7 = (SurfaceHolderCallbackC2821c0) c20378c.f76423y;
                int i25 = AbstractC38065t.f163031a;
                C4317h c4317h8 = surfaceHolderCallbackC2821c7.f11043w.f11124T;
                c4317h8.m13602l(c4317h8.m13601k(), 1031, new C4313d(18));
                break;
            case 8:
                SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c8 = (SurfaceHolderCallbackC2821c0) c20378c.f76423y;
                int i26 = AbstractC38065t.f163031a;
                C4317h c4317h9 = surfaceHolderCallbackC2821c8.f11043w.f11124T;
                c4317h9.m13602l(c4317h9.m13601k(), MessageListItemViewType.FILE_ATTACHMENTS, new C4313d(23));
                break;
            default:
                SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c9 = (SurfaceHolderCallbackC2821c0) c20378c.f76423y;
                int i27 = AbstractC38065t.f163031a;
                C4317h c4317h10 = surfaceHolderCallbackC2821c9.f11043w.f11124T;
                c4317h10.m13602l(c4317h10.m13601k(), MessageListItemViewType.SYSTEM_MESSAGE, new C4313d(20));
                break;
        }
    }

    public /* synthetic */ RunnableC11791h(C20378c c20378c, long j7) {
        this.f38237w = 1;
        this.f38238x = c20378c;
    }

    public /* synthetic */ RunnableC11791h(C20378c c20378c, Object obj, int i13) {
        this.f38237w = i13;
        this.f38238x = c20378c;
    }

    public /* synthetic */ RunnableC11791h(C20378c c20378c, String str, long j7, long j13) {
        this.f38237w = 3;
        this.f38238x = c20378c;
    }

    public /* synthetic */ RunnableC11791h(C20378c c20378c, C34610p c34610p, C2835h c2835h) {
        this.f38237w = 9;
        this.f38238x = c20378c;
    }
}
