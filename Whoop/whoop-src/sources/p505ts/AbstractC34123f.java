package p505ts;

import bt.InterfaceC3616c;
import com.google.crypto.tink.internal.C5089f0;
import com.google.crypto.tink.internal.C5108p;
import com.google.crypto.tink.internal.C5114s;
import java.security.GeneralSecurityException;
import p560vs.C36366i2;
import p560vs.EnumC36385l3;

/* JADX INFO: renamed from: ts.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC34123f {

    /* JADX INFO: renamed from: a */
    public static final C5089f0 f143040a = new C5089f0(C34122e.class, InterfaceC3616c.class, new C34119b(1));

    /* JADX INFO: renamed from: b */
    public static final C5089f0 f143041b = new C5089f0(C34122e.class, InterfaceC34130m.class, new C34119b(2));

    /* JADX INFO: renamed from: c */
    public static final C5108p f143042c;

    /* JADX INFO: renamed from: d */
    public static final C5114s f143043d;

    static {
        C36366i2.m116323H();
        f143042c = new C5108p("type.googleapis.com/google.crypto.tink.HkdfPrfKey", InterfaceC34130m.class, EnumC36385l3.SYMMETRIC);
        f143043d = new C5114s(15);
    }

    /* JADX INFO: renamed from: a */
    public static void m107853a(C34125h c34125h) {
        if (c34125h.f143056a < 32) {
            throw new GeneralSecurityException("Key size must be at least 32");
        }
        C34124g c34124g = c34125h.f143057b;
        if (c34124g != C34124g.f143046e && c34124g != C34124g.f143048g) {
            throw new GeneralSecurityException("Hash type must be SHA256 or SHA512");
        }
    }
}
