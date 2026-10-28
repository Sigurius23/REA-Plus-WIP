package androidx.databinding;

import androidx.lifecycle.EnumC1632v;
import androidx.lifecycle.InterfaceC1581f0;
import androidx.lifecycle.InterfaceC1636w0;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: androidx.databinding.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C1193w implements InterfaceC1581f0 {

    /* JADX INFO: renamed from: w */
    public final WeakReference f5344w;

    public C1193w(AbstractC1168a0 abstractC1168a0) {
        this.f5344w = new WeakReference(abstractC1168a0);
    }

    @InterfaceC1636w0(EnumC1632v.ON_START)
    public void onStart() throws Throwable {
        AbstractC1168a0 abstractC1168a0 = (AbstractC1168a0) this.f5344w.get();
        if (abstractC1168a0 != null) {
            abstractC1168a0.executePendingBindings();
        }
    }
}
