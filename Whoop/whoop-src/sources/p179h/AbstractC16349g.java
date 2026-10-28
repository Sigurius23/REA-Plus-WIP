package p179h;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import p236j.InterfaceC21072k;
import p390p1.C28596b0;
import p390p1.C28655q;

/* JADX INFO: renamed from: h.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16349g {

    /* JADX INFO: renamed from: a */
    public static final C28596b0 f62865a = new C28596b0(C16345c.f62856y);

    /* JADX INFO: renamed from: a */
    public static InterfaceC21072k m46560a(Composer composer) {
        C28655q c28655q = (C28655q) composer;
        InterfaceC21072k interfaceC21072k = (InterfaceC21072k) c28655q.m87161k(f62865a);
        if (interfaceC21072k == null) {
            c28655q.m87150e0(1006590171);
            Object baseContext = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof InterfaceC21072k) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            interfaceC21072k = (InterfaceC21072k) baseContext;
        } else {
            c28655q.m87150e0(1006589303);
        }
        c28655q.m87173q(false);
        return interfaceC21072k;
    }
}
