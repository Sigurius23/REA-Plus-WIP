package p029b5;

import androidx.lifecycle.C1601k1;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import ml.InterfaceC25661c;
import ml.InterfaceC25662d;
import p032bc.AbstractC2974w;
import p032bc.C2953i;
import p715kotlin.jvm.internal.AbstractC22676k;
import tl.AbstractC33913l;

/* JADX INFO: renamed from: b5.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C2725d implements InterfaceC25661c {

    /* JADX INFO: renamed from: w */
    public boolean f10733w;

    /* JADX INFO: renamed from: x */
    public boolean f10734x;

    /* JADX INFO: renamed from: y */
    public Object f10735y;

    public C2725d(boolean z4, boolean z13, C1601k1 savedStateHandle) {
        AbstractC22676k.m65750j(savedStateHandle, "savedStateHandle");
        this.f10733w = z4;
        this.f10734x = z13;
        this.f10735y = savedStateHandle;
        savedStateHandle.m5004e(Boolean.valueOf(z4), "KEY_HAS_AUTOMATICALLY_LAUNCHED_CARD_SCAN");
    }

    /* JADX INFO: renamed from: a */
    public void m7694a() {
        synchronized (this) {
            try {
                if (this.f10733w) {
                    return;
                }
                this.f10733w = true;
                this.f10734x = true;
                C2953i c2953i = (C2953i) this.f10735y;
                if (c2953i != null) {
                    try {
                        Runnable runnable = (Runnable) c2953i.f11859x;
                        AbstractC2974w abstractC2974w = (AbstractC2974w) c2953i.f11861z;
                        Runnable runnable2 = (Runnable) c2953i.f11860y;
                        if (runnable == null) {
                            abstractC2974w.cancel();
                            runnable2.run();
                        } else {
                            runnable.run();
                        }
                    } catch (Throwable th3) {
                        synchronized (this) {
                            this.f10734x = false;
                            notifyAll();
                            throw th3;
                        }
                    }
                }
                synchronized (this) {
                    this.f10734x = false;
                    notifyAll();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m7695b() {
        this.f10733w = true;
        Iterator it = AbstractC33913l.m107269d((Set) this.f10735y).iterator();
        while (it.hasNext()) {
            ((InterfaceC25662d) it.next()).onStart();
        }
    }

    @Override // ml.InterfaceC25661c
    /* JADX INFO: renamed from: h */
    public void mo7696h(InterfaceC25662d interfaceC25662d) {
        ((Set) this.f10735y).add(interfaceC25662d);
        if (this.f10734x) {
            interfaceC25662d.onDestroy();
        } else if (this.f10733w) {
            interfaceC25662d.onStart();
        } else {
            interfaceC25662d.onStop();
        }
    }

    @Override // ml.InterfaceC25661c
    /* JADX INFO: renamed from: k */
    public void mo7697k(InterfaceC25662d interfaceC25662d) {
        ((Set) this.f10735y).remove(interfaceC25662d);
    }

    public C2725d() {
        this.f10735y = Collections.newSetFromMap(new WeakHashMap());
    }
}
