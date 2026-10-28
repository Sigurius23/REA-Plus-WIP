package p667z0;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p025b1.C2214e;
import p028b4.RunnableC2690a;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: z0.a */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C39919a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f172337w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C39924f f172338x;

    public /* synthetic */ C39919a(C39924f c39924f, int i13) {
        this.f172337w = i13;
        this.f172338x = c39924f;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f172337w) {
            case 0:
                InterfaceC4339a interfaceC4339a = (InterfaceC4339a) obj;
                View view = this.f172338x.f172350a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC4339a.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC2690a(interfaceC4339a, 9));
                    }
                }
                return C23454a0.f92919a;
            case 1:
                ActionMode actionMode = this.f172338x.f172357h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return C23454a0.f92919a;
            case 2:
                ActionMode actionMode2 = this.f172338x.f172357h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return C23454a0.f92919a;
            default:
                C39924f c39924f = this.f172338x;
                c39924f.f172354e.m128205e();
                return new C2214e(c39924f, 13);
        }
    }
}
