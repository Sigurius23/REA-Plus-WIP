package cm;

import android.os.Build;
import android.view.View;
import android.view.Window;
import p184h5.C16920v1;
import p208i2.AbstractC17918w0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cm.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C4800a implements InterfaceC4801b {

    /* JADX INFO: renamed from: a */
    public final View f19786a;

    /* JADX INFO: renamed from: b */
    public final Window f19787b;

    /* JADX INFO: renamed from: c */
    public final C16920v1 f19788c;

    public C4800a(View view, Window window) {
        AbstractC22676k.m65750j(view, "view");
        this.f19786a = view;
        this.f19787b = window;
        this.f19788c = window != null ? new C16920v1(view, window) : null;
    }

    /* JADX INFO: renamed from: a */
    public final void m15163a(long j7, Function1 transformColorForLightContent) {
        AbstractC22676k.m65750j(transformColorForLightContent, "transformColorForLightContent");
        C16920v1 c16920v1 = this.f19788c;
        if (c16920v1 != null) {
            c16920v1.m47612a(false);
        }
        int i13 = Build.VERSION.SDK_INT;
        Window window = this.f19787b;
        if (i13 >= 29 && window != null) {
            window.setNavigationBarContrastEnforced(true);
        }
        if (window == null) {
            return;
        }
        window.setNavigationBarColor(AbstractC17918w0.m51506H(j7));
    }
}
