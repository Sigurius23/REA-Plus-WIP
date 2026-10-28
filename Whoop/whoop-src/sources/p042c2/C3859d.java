package p042c2;

import ad3.C0783z;
import android.graphics.Rect;
import android.view.autofill.AutofillId;
import androidx.compose.p018ui.platform.AndroidComposeView;
import p002a0.C0026h0;
import p031b9.AbstractC2875y;
import p209i3.C18036r;
import p241j3.C21265b;

/* JADX INFO: renamed from: c2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C3859d extends AbstractC3866k {

    /* JADX INFO: renamed from: a */
    public final C0783z f15787a;

    /* JADX INFO: renamed from: b */
    public final C18036r f15788b;

    /* JADX INFO: renamed from: c */
    public final AndroidComposeView f15789c;

    /* JADX INFO: renamed from: d */
    public final C21265b f15790d;

    /* JADX INFO: renamed from: e */
    public final String f15791e;

    /* JADX INFO: renamed from: f */
    public final Rect f15792f = new Rect();

    /* JADX INFO: renamed from: g */
    public final AutofillId f15793g;

    /* JADX INFO: renamed from: h */
    public final C0026h0 f15794h;

    /* JADX INFO: renamed from: i */
    public boolean f15795i;

    public C3859d(C0783z c0783z, C18036r c18036r, AndroidComposeView androidComposeView, C21265b c21265b, String str) {
        this.f15787a = c0783z;
        this.f15788b = c18036r;
        this.f15789c = androidComposeView;
        this.f15790d = c21265b;
        this.f15791e = str;
        androidComposeView.setImportantForAutofill(1);
        AutofillId autofillId = androidComposeView.getAutofillId();
        if (autofillId == null) {
            throw AbstractC2875y.m8310w("Required value was null.");
        }
        this.f15793g = autofillId;
        this.f15794h = new C0026h0();
    }
}
