package rw;

import com.nimbusds.jose.shaded.gson.JsonSyntaxException;
import java.io.IOException;
import p108e4.AbstractC12682p;
import p384ow.AbstractC28430z;
import p384ow.EnumC28428x;
import p555vl.AbstractC36095b;
import p596ww.C37653a;
import p596ww.C37654b;

/* JADX INFO: renamed from: rw.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C31859i extends AbstractC28430z {

    /* JADX INFO: renamed from: b */
    public static final C31858h f132124b = new C31858h(new C31859i(EnumC28428x.f114646x), 0);

    /* JADX INFO: renamed from: a */
    public final EnumC28428x f132125a;

    public C31859i(EnumC28428x enumC28428x) {
        this.f132125a = enumC28428x;
    }

    @Override // p384ow.AbstractC28430z
    /* JADX INFO: renamed from: b */
    public final Object mo86132b(C37653a c37653a) {
        int iM121062o0 = c37653a.m121062o0();
        int iM35485e = AbstractC12682p.m35485e(iM121062o0);
        if (iM35485e == 5 || iM35485e == 6) {
            return this.f132125a.mo86143a(c37653a);
        }
        if (iM35485e == 8) {
            c37653a.m121053T();
            return null;
        }
        throw new JsonSyntaxException("Expecting number, got: " + AbstractC36095b.m114672B(iM121062o0) + "; at path " + c37653a.m121060k(false));
    }

    @Override // p384ow.AbstractC28430z
    /* JADX INFO: renamed from: c */
    public final void mo86133c(C37654b c37654b, Object obj) throws IOException {
        c37654b.m121077o0((Number) obj);
    }
}
