package p042c2;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.compose.p018ui.platform.AndroidComposeView;
import p031b9.AbstractC2875y;
import p181h2.C16618c;

/* JADX INFO: renamed from: c2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3856a implements InterfaceC3863h {

    /* JADX INFO: renamed from: a */
    public final AndroidComposeView f15778a;

    /* JADX INFO: renamed from: b */
    public final C3868m f15779b;

    /* JADX INFO: renamed from: c */
    public final AutofillManager f15780c;

    /* JADX INFO: renamed from: d */
    public final AutofillId f15781d;

    public C3856a(AndroidComposeView androidComposeView, C3868m c3868m) {
        this.f15778a = androidComposeView;
        this.f15779b = c3868m;
        AutofillManager autofillManager = (AutofillManager) androidComposeView.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f15780c = autofillManager;
        androidComposeView.setImportantForAutofill(1);
        AutofillId autofillId = androidComposeView.getAutofillId();
        if (autofillId == null) {
            throw AbstractC2875y.m8310w("Required value was null.");
        }
        this.f15781d = autofillId;
    }

    /* JADX INFO: renamed from: a */
    public final void m11843a(C3867l c3867l) {
        C16618c c16618cM11852a = c3867l.m11852a();
        if (c16618cM11852a == null) {
            throw new IllegalStateException("requestAutofill called before onChildPositioned()");
        }
        this.f15780c.notifyViewEntered(this.f15778a, c3867l.m11853b(), new Rect(Math.round(c16618cM11852a.f63939a), Math.round(c16618cM11852a.f63940b), Math.round(c16618cM11852a.f63941c), Math.round(c16618cM11852a.f63942d)));
    }
}
