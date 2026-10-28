package p323m8;

import android.view.View;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.InterfaceC1583f2;
import j02.C21174w;
import p390p1.C28596b0;
import p390p1.C28655q;

/* JADX INFO: renamed from: m8.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC25218a {

    /* JADX INFO: renamed from: a */
    public static final C28596b0 f99032a = new C28596b0(new C21174w(26));

    /* JADX INFO: renamed from: a */
    public static InterfaceC1583f2 m73844a(Composer composer) {
        C28655q c28655q = (C28655q) composer;
        InterfaceC1583f2 interfaceC1583f2M5018h = (InterfaceC1583f2) c28655q.m87161k(f99032a);
        if (interfaceC1583f2M5018h == null) {
            c28655q.m87150e0(1260197609);
            interfaceC1583f2M5018h = AbstractC1613o1.m5018h((View) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4980f));
        } else {
            c28655q.m87150e0(1260196493);
        }
        c28655q.m87173q(false);
        return interfaceC1583f2M5018h;
    }
}
