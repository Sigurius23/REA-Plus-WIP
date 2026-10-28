package com.stripe.hcaptcha.config;

import ge3.AbstractC15751g;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.EnumsKt;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import q83.AbstractC30060g;
import t83.InterfaceC33616a;
import v40.C35652d;
import v40.C35653e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m65681d2 = {"Lcom/stripe/hcaptcha/config/HCaptchaTheme;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "v40/e", "DARK", "LIGHT", "CONTRAST", "hcaptcha_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
@InterfaceC37144i
public enum HCaptchaTheme {
    DARK,
    LIGHT,
    CONTRAST;

    private static final /* synthetic */ InterfaceC33616a $ENTRIES = AbstractC15751g.m44468u(values());
    public static final C35653e Companion = new C35653e();
    private static final InterfaceC23462h $cachedSerializer$delegate = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C35652d(0));

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.stripe.hcaptcha.config.HCaptchaTheme", values(), new String[]{"dark", "light", "contrast"}, new Annotation[][]{null, null, null}, null);
    }

    public static InterfaceC33616a getEntries() {
        return $ENTRIES;
    }
}
