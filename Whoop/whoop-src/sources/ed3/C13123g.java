package ed3;

import kotlinx.serialization.SerializationException;
import p522uf.AbstractC34870c0;
import p715kotlin.jvm.internal.AbstractC22676k;
import ug.AbstractC34924m;
import yc3.AbstractC39440d;
import yc3.AbstractC39447k;
import yc3.C39448l;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;

/* JADX INFO: renamed from: ed3.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C13123g extends C13129m {

    /* JADX INFO: renamed from: k */
    public boolean f45392k;

    @Override // ed3.C13129m, zc3.InterfaceC40541d
    public final InterfaceC40539b beginStructure(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        AbstractC39447k kind = descriptor.getKind();
        if (!AbstractC22676k.m65745e(kind, C39448l.f169713a) && !AbstractC22676k.m65745e(kind, C39448l.f169716d) && !(kind instanceof AbstractC39440d)) {
            throw new SerializationException("Type " + descriptor.getKind() + " cannot be directly child of oneof element");
        }
        long jM4428i = m4428i();
        if (jM4428i == 19500 && AbstractC22676k.m65745e(this.f45410e, descriptor)) {
            return this;
        }
        if (AbstractC34870c0.m109989Z(jM4428i)) {
            throw new SerializationException("An oneof element cannot be directly child of another oneof element");
        }
        return new C13129m(this.f45408c, AbstractC34924m.m110150k(this.f45409d, jM4428i), descriptor);
    }

    @Override // ed3.C13129m, zc3.InterfaceC40539b
    public final int decodeElementIndex(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        if (this.f45392k) {
            return -1;
        }
        this.f45392k = true;
        return 0;
    }
}
