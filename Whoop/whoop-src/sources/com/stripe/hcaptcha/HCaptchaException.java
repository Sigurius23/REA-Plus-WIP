package com.stripe.hcaptcha;

import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import u40.EnumC34528d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, m65681d2 = {"Lcom/stripe/hcaptcha/HCaptchaException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "hcaptcha_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final /* data */ class HCaptchaException extends Exception {

    /* JADX INFO: renamed from: w */
    public final EnumC34528d f22595w;

    /* JADX INFO: renamed from: x */
    public final String f22596x;

    public HCaptchaException(EnumC34528d enumC34528d) {
        this.f22595w = enumC34528d;
        this.f22596x = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HCaptchaException)) {
            return false;
        }
        HCaptchaException hCaptchaException = (HCaptchaException) obj;
        return this.f22595w == hCaptchaException.f22595w && AbstractC22676k.m65745e(this.f22596x, hCaptchaException.f22596x);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str = this.f22596x;
        return str == null ? this.f22595w.f145147x : str;
    }

    public final int hashCode() {
        int iHashCode = this.f22595w.hashCode() * 31;
        String str = this.f22596x;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "HCaptchaException(hCaptchaError=" + this.f22595w + ", hCaptchaMessage=" + this.f22596x + ")";
    }

    public HCaptchaException(EnumC34528d enumC34528d, String str) {
        this.f22595w = enumC34528d;
        this.f22596x = str;
    }
}
