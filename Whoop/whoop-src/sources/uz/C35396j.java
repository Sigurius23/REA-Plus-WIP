package uz;

import c93.InterfaceC4351m;
import com.stripe.hcaptcha.HCaptchaException;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import p715kotlin.jvm.internal.AbstractC22676k;
import u40.EnumC34528d;

/* JADX INFO: renamed from: uz.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C35396j implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public static final C35396j f150814w = new C35396j();

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        HCaptchaException exception = (HCaptchaException) obj2;
        AbstractC22676k.m65750j((HCaptchaConfig) obj, "<unused var>");
        AbstractC22676k.m65750j(exception, "exception");
        return Boolean.valueOf(exception.f22595w == EnumC34528d.SESSION_TIMEOUT);
    }
}
