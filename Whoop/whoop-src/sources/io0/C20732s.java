package io0;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: io0.s */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, m65681d2 = {"Lio0/s;", "", "Ltr2/n;", "logger", "<init>", "(Ltr2/n;)V", "", "value", "validRegex", "", "a", "(Ljava/lang/String;Ljava/lang/String;)Z", "Ltr2/n;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20732s {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C20732s(InterfaceC34116n logger) {
        AbstractC22676k.m65750j(logger, "logger");
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m57014a(String value, String validRegex) {
        if (validRegex != null) {
            if (AbstractC39414r.m125890i0(validRegex)) {
                validRegex = null;
            }
            if (validRegex != null) {
                try {
                    Pattern patternCompile = Pattern.compile(validRegex);
                    AbstractC22676k.m65749i(patternCompile, "compile(...)");
                    if (value == null) {
                        value = "";
                    }
                    return patternCompile.matcher(value).matches();
                } catch (PatternSyntaxException e5) {
                    this.logger.mo85230v("Invalid regex pattern from server: ".concat(validRegex), e5, new AbstractC30556a.a[0]);
                }
            }
        }
        return true;
    }

    public /* synthetic */ C20732s(InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? InterfaceC34116n.INSTANCE.m107848a("FormTextFieldValidator") : interfaceC34116n);
    }
}
