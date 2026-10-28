package ed3;

import kotlinx.serialization.SerializationException;
import p715kotlin.jvm.internal.AbstractC22676k;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;

/* JADX INFO: renamed from: ed3.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C13126j extends C13129m {

    /* JADX INFO: renamed from: k */
    public int f45397k;

    @Override // ed3.C13129m
    /* JADX INFO: renamed from: Q */
    public final String mo36725Q(long j7) {
        throw new SerializationException("Packing only supports primitive number types. The actual reading is for string.");
    }

    @Override // ed3.C13129m
    /* JADX INFO: renamed from: T */
    public final long mo36721T(InterfaceC39443g interfaceC39443g, int i13) {
        AbstractC22676k.m65750j(interfaceC39443g, "<this>");
        return 19500L;
    }

    @Override // ed3.C13129m, zc3.InterfaceC40541d
    public final InterfaceC40539b beginStructure(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        throw new SerializationException("Packing only supports primitive number types. The input type however was a struct: " + descriptor);
    }

    @Override // ed3.C13129m, zc3.InterfaceC40539b
    public final int decodeElementIndex(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        C13131o c13131o = this.f45409d;
        if (!c13131o.f45423d) {
            C13117a c13117a = (C13117a) c13131o.f45424e;
            if (c13117a.f45382b - c13117a.f45383c == 0) {
                return -1;
            }
        }
        int i13 = this.f45397k;
        this.f45397k = i13 + 1;
        return i13;
    }
}
