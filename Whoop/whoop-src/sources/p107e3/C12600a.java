package p107e3;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import b23.C2342h;
import p037bu.C3632c;

/* JADX INFO: renamed from: e3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C12600a {

    /* JADX INFO: renamed from: a */
    public final Object f42994a;

    /* JADX INFO: renamed from: b */
    public final View f42995b;

    public C12600a(ContentCaptureSession contentCaptureSession, View view) {
        this.f42994a = contentCaptureSession;
        this.f42995b = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m35308a() {
        if (Build.VERSION.SDK_INT >= 29) {
            C2342h.m7219b(this.f42994a).notifyViewsDisappeared(this.f42995b.getAutofillId(), new long[]{Long.MIN_VALUE});
        }
    }

    /* JADX INFO: renamed from: b */
    public final AutofillId m35309b(long j7) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C2342h.m7219b(this.f42994a).newAutofillId(this.f42995b.getAutofillId(), j7);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final C3632c m35310c(AutofillId autofillId, long j7) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new C3632c(C2342h.m7219b(this.f42994a).newVirtualViewStructure(autofillId, j7));
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m35311d(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            C2342h.m7219b(this.f42994a).notifyViewAppeared(viewStructure);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m35312e(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            C2342h.m7219b(this.f42994a).notifyViewDisappeared(autofillId);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m35313f(AutofillId autofillId, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            ((ContentCaptureSession) this.f42994a).notifyViewTextChanged(autofillId, str);
        }
    }
}
