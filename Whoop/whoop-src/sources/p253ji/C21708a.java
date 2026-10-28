package p253ji;

import fi.C14511q;
import fi.InterfaceC14506l;
import p012ab.C0682h0;
import p196hi.C17302a;
import sh.EnumC32482h;

/* JADX INFO: renamed from: ji.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C21708a implements InterfaceC21711d {

    /* JADX INFO: renamed from: b */
    public final int f83343b;

    public C21708a(int i13) {
        this.f83343b = i13;
        if (i13 <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
    }

    @Override // p253ji.InterfaceC21711d
    /* JADX INFO: renamed from: a */
    public final InterfaceC21712e mo61162a(C17302a c17302a, InterfaceC14506l interfaceC14506l) {
        if ((interfaceC14506l instanceof C14511q) && ((C14511q) interfaceC14506l).f53015c != EnumC32482h.f134507w) {
            return new C0682h0(c17302a, interfaceC14506l, this.f83343b);
        }
        return new C21710c(c17302a, interfaceC14506l);
    }
}
