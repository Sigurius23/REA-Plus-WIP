package p222ij;

import android.view.View;
import android.view.Window;
import androidx.work.impl.WorkDatabase;
import io.sentry.android.core.C20121k0;
import io.sentry.android.core.internal.util.ViewTreeObserverOnDrawListenerC20108i;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonObject;
import org.joda.time.DateTime;
import p027b3.C2442t0;
import p218ic.C18348b;
import p249jc.AbstractC21585k;
import p249jc.InterfaceC21581i;
import p420qc.C30200j;
import p715kotlin.jvm.internal.AbstractC22676k;
import vr2.C36309b;

/* JADX INFO: renamed from: ij.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC18575a implements Runnable {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f72573E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f72574w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f72575x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f72576y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f72577z;

    public /* synthetic */ RunnableC18575a(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f72574w = i13;
        this.f72575x = obj;
        this.f72576y = obj2;
        this.f72577z = obj3;
        this.f72573E = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f72574w) {
            case 0:
                InterfaceC18576b interfaceC18576b = (InterfaceC18576b) this.f72575x;
                String msgId = (String) this.f72576y;
                JsonObject jsonObject = (JsonObject) this.f72577z;
                C18580f c18580f = (C18580f) this.f72573E;
                AbstractC22676k.m65750j(msgId, "$msgId");
                try {
                    interfaceC18576b.mo53797a(msgId, jsonObject, new C2442t0(10, c18580f, msgId));
                } catch (Exception e5) {
                    String message = e5.getMessage();
                    if (message == null) {
                        message = "Unknown error";
                    }
                    c18580f.m53799b(msgId, message);
                    return;
                }
                break;
            case 1:
                Window window = (Window) this.f72575x;
                Window.Callback callback = (Window.Callback) this.f72576y;
                Runnable runnable = (Runnable) this.f72577z;
                C20121k0 c20121k0 = (C20121k0) this.f72573E;
                View viewPeekDecorView = window.peekDecorView();
                if (viewPeekDecorView != null) {
                    window.setCallback(callback);
                    ViewTreeObserverOnDrawListenerC20108i viewTreeObserverOnDrawListenerC20108i = new ViewTreeObserverOnDrawListenerC20108i(viewPeekDecorView, runnable);
                    c20121k0.getClass();
                    viewPeekDecorView.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC20108i);
                }
                break;
            case 2:
                List list = (List) this.f72575x;
                C30200j c30200j = (C30200j) this.f72576y;
                C18348b c18348b = (C18348b) this.f72577z;
                WorkDatabase workDatabase = (WorkDatabase) this.f72573E;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((InterfaceC21581i) it.next()).mo60623a(c30200j.f123603a);
                }
                AbstractC21585k.m60632b(c18348b, workDatabase, list);
                break;
            default:
                C36309b.m116097f((C36309b) this.f72575x, (DateTime) this.f72577z, (DateTime) this.f72573E, (String) this.f72576y);
                break;
        }
    }

    public /* synthetic */ RunnableC18575a(C36309b c36309b, DateTime dateTime, DateTime dateTime2, String str) {
        this.f72574w = 3;
        this.f72575x = c36309b;
        this.f72577z = dateTime;
        this.f72573E = dateTime2;
        this.f72576y = str;
    }
}
