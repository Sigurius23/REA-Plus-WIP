package jb3;

import c93.InterfaceC4339a;
import java.io.ByteArrayInputStream;
import kb3.InterfaceC22345n;
import r93.C31161v0;
import u93.AbstractC34680i;
import u93.C34678h;
import wa3.AbstractC36986c;
import wa3.InterfaceC37021x;

/* JADX INFO: renamed from: jb3.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C21555o implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f82657w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f82658x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f82659y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f82660z;

    public C21555o(InterfaceC37021x interfaceC37021x, ByteArrayInputStream byteArrayInputStream, AbstractC21557q abstractC21557q) {
        this.f82658x = interfaceC37021x;
        this.f82659y = byteArrayInputStream;
        this.f82660z = abstractC21557q;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f82657w) {
            case 0:
                return ((AbstractC36986c) ((InterfaceC37021x) this.f82658x)).m118734c((ByteArrayInputStream) this.f82659y, ((AbstractC21557q) this.f82660z).f82672b.f65760a.f65750p);
            default:
                return new C34678h((AbstractC34680i) this.f82660z, (InterfaceC22345n) this.f82658x, (C31161v0) this.f82659y);
        }
    }

    public C21555o(AbstractC34680i abstractC34680i, InterfaceC22345n interfaceC22345n, C31161v0 c31161v0) {
        this.f82660z = abstractC34680i;
        this.f82658x = interfaceC22345n;
        this.f82659y = c31161v0;
    }
}
