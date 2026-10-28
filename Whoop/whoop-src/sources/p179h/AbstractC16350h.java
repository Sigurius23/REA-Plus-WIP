package p179h;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.room.AbstractC1772c1;
import p161g.InterfaceC14897b0;
import p390p1.C28596b0;
import p390p1.C28655q;

/* JADX INFO: renamed from: h.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16350h {

    /* JADX INFO: renamed from: a */
    public static final C28596b0 f62866a = new C28596b0(C16345c.f62857z);

    /* JADX INFO: renamed from: a */
    public static InterfaceC14897b0 m46561a(Composer composer) {
        C28655q c28655q = (C28655q) composer;
        InterfaceC14897b0 interfaceC14897b0M5402t = (InterfaceC14897b0) c28655q.m87161k(f62866a);
        if (interfaceC14897b0M5402t == null) {
            c28655q.m87150e0(544166745);
            interfaceC14897b0M5402t = AbstractC1772c1.m5402t((View) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4980f));
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(544164296);
            c28655q.m87173q(false);
        }
        if (interfaceC14897b0M5402t != null) {
            c28655q.m87150e0(544164377);
            c28655q.m87173q(false);
            return interfaceC14897b0M5402t;
        }
        c28655q.m87150e0(544168748);
        Object baseContext = (Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b);
        while (baseContext instanceof ContextWrapper) {
            if (baseContext instanceof InterfaceC14897b0) {
                InterfaceC14897b0 interfaceC14897b0 = (InterfaceC14897b0) baseContext;
                c28655q.m87173q(false);
                return interfaceC14897b0;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        baseContext = null;
        InterfaceC14897b0 interfaceC14897b1 = (InterfaceC14897b0) baseContext;
        c28655q.m87173q(false);
        return interfaceC14897b1;
    }
}
