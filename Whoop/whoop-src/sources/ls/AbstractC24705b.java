package ls;

import com.google.crypto.tink.internal.C5089f0;
import com.google.crypto.tink.internal.C5108p;
import com.google.crypto.tink.internal.C5114s;
import gs.C16135h;
import ih0.AbstractC18489d0;
import io.sentry.okhttp.C20450b;
import java.security.InvalidAlgorithmParameterException;
import p154fs.InterfaceC14725c;
import p560vs.C36442v0;
import p560vs.EnumC36385l3;

/* JADX INFO: renamed from: ls.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24705b {

    /* JADX INFO: renamed from: a */
    public static final C5089f0 f96627a = new C5089f0(C24704a.class, InterfaceC14725c.class, new C20450b(12));

    /* JADX INFO: renamed from: b */
    public static final C5108p f96628b;

    /* JADX INFO: renamed from: c */
    public static final C16135h f96629c;

    /* JADX INFO: renamed from: d */
    public static final C5114s f96630d;

    static {
        C36442v0.m116696F();
        f96628b = new C5108p("type.googleapis.com/google.crypto.tink.AesSivKey", InterfaceC14725c.class, EnumC36385l3.SYMMETRIC);
        f96629c = new C16135h();
        f96630d = new C5114s(9);
    }

    /* JADX INFO: renamed from: a */
    public static void m72315a(C24707d c24707d) {
        if (c24707d.f96635a != 64) {
            throw new InvalidAlgorithmParameterException(AbstractC18489d0.m53371l(new StringBuilder("invalid key size: "), c24707d.f96635a, ". Valid keys must have 64 bytes."));
        }
    }
}
