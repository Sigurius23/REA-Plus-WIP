package p347ns;

import a33.C0352d;
import at.C1967k;
import com.google.crypto.tink.internal.C5089f0;
import com.google.crypto.tink.internal.C5110q;
import io.sentry.okhttp.C20450b;
import p154fs.InterfaceC14726d;
import p154fs.InterfaceC14727e;
import p154fs.InterfaceC14734l;

/* JADX INFO: renamed from: ns.r */
/* JADX INFO: loaded from: classes.dex */
public final class C27097r implements InterfaceC14734l {

    /* JADX INFO: renamed from: b */
    public static final C27097r f108311b = new C27097r(0);

    /* JADX INFO: renamed from: c */
    public static final C5089f0 f108312c = new C5089f0(C5110q.class, InterfaceC14726d.class, new C20450b(27));

    /* JADX INFO: renamed from: d */
    public static final C27097r f108313d = new C27097r(1);

    /* JADX INFO: renamed from: e */
    public static final C5089f0 f108314e = new C5089f0(C5110q.class, InterfaceC14727e.class, new C20450b(28));

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f108315a;

    public /* synthetic */ C27097r(int i13) {
        this.f108315a = i13;
    }

    @Override // p154fs.InterfaceC14734l
    /* JADX INFO: renamed from: a */
    public final Class mo42238a() {
        switch (this.f108315a) {
            case 0:
                return InterfaceC14726d.class;
            default:
                return InterfaceC14727e.class;
        }
    }

    @Override // p154fs.InterfaceC14734l
    /* JADX INFO: renamed from: b */
    public final Class mo42239b() {
        switch (this.f108315a) {
            case 0:
                return InterfaceC14726d.class;
            default:
                return InterfaceC14727e.class;
        }
    }

    @Override // p154fs.InterfaceC14734l
    /* JADX INFO: renamed from: c */
    public final Object mo42240c(C0352d c0352d) {
        switch (this.f108315a) {
            case 0:
                return new C1967k(c0352d);
            default:
                return new C27098s(c0352d);
        }
    }
}
