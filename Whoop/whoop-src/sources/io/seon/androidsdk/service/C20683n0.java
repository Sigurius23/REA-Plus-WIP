package io.seon.androidsdk.service;

import android.app.Activity;
import android.os.PowerManager;
import android.view.WindowManager;

/* JADX INFO: renamed from: io.seon.androidsdk.service.n0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20683n0 extends AbstractC20660e1 {

    /* JADX INFO: renamed from: h */
    public final Activity f77411h;

    /* JADX INFO: renamed from: i */
    public final PowerManager f77412i;

    /* JADX INFO: renamed from: j */
    public final WindowManager f77413j;

    public C20683n0() {
        super(16, 3);
        this.f77411h = AbstractC20684o.m56858k();
        try {
            this.f77412i = (PowerManager) this.f77411h.getSystemService("power");
        } catch (Throwable unused) {
        }
        try {
            this.f77413j = (WindowManager) this.f77411h.getSystemService("window");
        } catch (Throwable unused2) {
        }
    }

    @Override // io.seon.androidsdk.service.AbstractC20660e1
    /* JADX INFO: renamed from: a */
    public final void mo56787a(float[] fArr) {
        try {
            super.mo56787a(new float[]{fArr[0], this.f77413j.getDefaultDisplay().getState(), this.f77412i.isInteractive() ? 1.0f : 0.0f});
        } catch (Exception unused) {
        }
    }
}
