package g83;

import b83.C2810f;
import b83.EnumC2812h;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import l73.InterfaceC23413d;
import r73.AbstractC31056a;

/* JADX INFO: renamed from: g83.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C15580f extends AtomicReference {

    /* JADX INFO: renamed from: w */
    public final ArrayList f58522w;

    /* JADX INFO: renamed from: x */
    public volatile boolean f58523x;

    /* JADX INFO: renamed from: y */
    public volatile int f58524y;

    public C15580f() {
        AbstractC31056a.m95617b(16, "capacityHint");
        this.f58522w = new ArrayList(16);
    }

    /* JADX INFO: renamed from: a */
    public final void m43876a(C15579e c15579e) {
        int iIntValue;
        int i13;
        if (c15579e.getAndIncrement() != 0) {
            return;
        }
        ArrayList arrayList = this.f58522w;
        InterfaceC23413d interfaceC23413d = c15579e.f58518w;
        Integer num = c15579e.f58520y;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
            c15579e.f58520y = 0;
        }
        int iAddAndGet = 1;
        while (!c15579e.f58521z) {
            int i14 = this.f58524y;
            while (i14 != iIntValue) {
                if (c15579e.f58521z) {
                    c15579e.f58520y = null;
                    return;
                }
                Object obj = arrayList.get(iIntValue);
                if (this.f58523x && (i13 = iIntValue + 1) == i14 && i13 == (i14 = this.f58524y)) {
                    if (obj == EnumC2812h.f11003w) {
                        interfaceC23413d.onComplete();
                    } else {
                        interfaceC23413d.onError(((C2810f) obj).f11001w);
                    }
                    c15579e.f58520y = null;
                    c15579e.f58521z = true;
                    return;
                }
                interfaceC23413d.onNext(obj);
                iIntValue++;
            }
            if (iIntValue == this.f58524y) {
                c15579e.f58520y = Integer.valueOf(iIntValue);
                iAddAndGet = c15579e.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        c15579e.f58520y = null;
    }
}
