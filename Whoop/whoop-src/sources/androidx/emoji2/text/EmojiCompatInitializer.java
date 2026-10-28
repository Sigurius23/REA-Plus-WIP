package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.AbstractC1638x;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import p034bl.C3364d;
import p185h6.C16955j;
import p185h6.C16956k;
import p185h6.C16965t;
import p644yb.C39376a;
import p644yb.InterfaceC39377b;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC39377b {
    @Override // p644yb.InterfaceC39377b
    public final Object create(Context context) {
        C16965t c16965t = new C16965t(new C3364d(context, 1));
        c16965t.f65115b = 1;
        if (C16955j.f65078k == null) {
            synchronized (C16955j.f65077j) {
                try {
                    if (C16955j.f65078k == null) {
                        C16955j.f65078k = new C16955j(c16965t);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        AbstractC1638x lifecycle = ((InterfaceC1585g0) C39376a.m125585c(context).m125588d(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.mo4986a(new C16956k(this, lifecycle));
        return Boolean.TRUE;
    }

    @Override // p644yb.InterfaceC39377b
    public final List dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
