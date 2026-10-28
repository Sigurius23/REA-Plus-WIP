package com.google.android.gms.common.api.internal;

import android.os.Looper;
import at.C1956b;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.AbstractC4980k;
import com.google.android.gms.common.api.InterfaceC4982m;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import p529uo.AbstractC35135w;
import p715kotlin.jvm.internal.AbstractC22674j;
import to.C33998s0;
import to.C34005x;
import to.HandlerC33969e;

/* JADX INFO: loaded from: classes6.dex */
@KeepName
public abstract class BasePendingResult<R extends InterfaceC4982m> extends AbstractC22674j {

    /* JADX INFO: renamed from: j */
    public static final C1956b f20504j = new C1956b(10);

    /* JADX INFO: renamed from: e */
    public InterfaceC4982m f20509e;

    /* JADX INFO: renamed from: f */
    public Status f20510f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f20511g;

    /* JADX INFO: renamed from: h */
    public boolean f20512h;

    /* JADX INFO: renamed from: a */
    public final Object f20505a = new Object();

    /* JADX INFO: renamed from: b */
    public final CountDownLatch f20506b = new CountDownLatch(1);

    /* JADX INFO: renamed from: c */
    public final ArrayList f20507c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final AtomicReference f20508d = new AtomicReference();

    /* JADX INFO: renamed from: i */
    public boolean f20513i = false;

    public BasePendingResult(AbstractC4980k abstractC4980k) {
        new HandlerC33969e(abstractC4980k != null ? ((C34005x) abstractC4980k).f142509b.getLooper() : Looper.getMainLooper(), 0);
        new WeakReference(abstractC4980k);
    }

    /* JADX INFO: renamed from: W */
    public final void m15601W(C33998s0 c33998s0) {
        synchronized (this.f20505a) {
            try {
                if (m15604Z()) {
                    c33998s0.m107472a(this.f20510f);
                } else {
                    this.f20507c.add(c33998s0);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public abstract InterfaceC4982m mo15602X(Status status);

    /* JADX INFO: renamed from: Y */
    public final void m15603Y(Status status) {
        synchronized (this.f20505a) {
            try {
                if (!m15604Z()) {
                    m15605a0(mo15602X(status));
                    this.f20512h = true;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m15604Z() {
        return this.f20506b.getCount() == 0;
    }

    /* JADX INFO: renamed from: a0 */
    public final void m15605a0(InterfaceC4982m interfaceC4982m) {
        synchronized (this.f20505a) {
            try {
                if (this.f20512h) {
                    return;
                }
                m15604Z();
                AbstractC35135w.m111096h("Results have already been set", !m15604Z());
                AbstractC35135w.m111096h("Result has already been consumed", !this.f20511g);
                this.f20509e = interfaceC4982m;
                this.f20510f = interfaceC4982m.mo5671c();
                this.f20506b.countDown();
                ArrayList arrayList = this.f20507c;
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ((C33998s0) arrayList.get(i13)).m107472a(this.f20510f);
                }
                arrayList.clear();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m15606b0() {
        boolean z4 = true;
        if (!this.f20513i && !((Boolean) f20504j.get()).booleanValue()) {
            z4 = false;
        }
        this.f20513i = z4;
    }
}
