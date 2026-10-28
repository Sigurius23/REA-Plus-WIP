package u40;

import android.os.Build;
import android.os.Bundle;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import p098dt.AbstractC12350b;
import v40.C35649a;

/* JADX INFO: renamed from: u40.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC34525a {
    /* JADX INFO: renamed from: a */
    public static HCaptchaConfig m109100a(Bundle bundle) {
        return (HCaptchaConfig) (Build.VERSION.SDK_INT >= 33 ? bundle.getSerializable("hCaptchaConfig", HCaptchaConfig.class) : bundle.getSerializable("hCaptchaConfig"));
    }

    /* JADX INFO: renamed from: b */
    public static C35649a m109101b(Bundle bundle) {
        return (C35649a) (Build.VERSION.SDK_INT >= 33 ? bundle.getSerializable("hCaptchaInternalConfig", C35649a.class) : bundle.getSerializable("hCaptchaInternalConfig"));
    }

    /* JADX INFO: renamed from: c */
    public static C34530f m109102c(Bundle bundle) {
        return (C34530f) AbstractC12350b.m34600u(bundle, C34530f.class, "hCaptchaDialogListener");
    }
}
