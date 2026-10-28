package uz;

import bc3.C3033m;
import com.stripe.hcaptcha.HCaptchaException;
import p715kotlin.jvm.internal.AbstractC22676k;
import x40.InterfaceC37951a;

/* JADX INFO: renamed from: uz.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C35395i implements InterfaceC37951a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C3033m f150813w;

    public C35395i(C3033m c3033m) {
        this.f150813w = c3033m;
    }

    @Override // x40.InterfaceC37951a
    /* JADX INFO: renamed from: e */
    public final void mo109105e(HCaptchaException exception) {
        AbstractC22676k.m65750j(exception, "exception");
        this.f150813w.resumeWith(new C35404r(exception));
    }
}
