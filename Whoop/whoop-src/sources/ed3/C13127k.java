package ed3;

import dd3.C11972a;
import e10.C12554k0;
import kotlinx.serialization.SerializationException;
import p715kotlin.jvm.internal.AbstractC22676k;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: renamed from: ed3.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C13127k extends C13121e {
    public C13127k(long j7, C11972a proto, C12554k0 writer, InterfaceC39443g descriptor) {
        C13118b c13118b = new C13118b();
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC22676k.m65750j(writer, "writer");
        AbstractC22676k.m65750j(descriptor, "descriptor");
        super(proto, writer, j7, descriptor, c13118b);
    }

    @Override // ed3.C13130n
    /* JADX INFO: renamed from: O */
    public final void mo36724O(long j7, String value) {
        AbstractC22676k.m65750j(value, "value");
        throw new SerializationException("Packing only supports primitive number types");
    }

    @Override // ed3.C13121e, ed3.C13130n
    /* JADX INFO: renamed from: P */
    public final void mo36723P(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        if (this.f45391j.f45386b > 0) {
            super.mo36723P(descriptor);
        }
    }

    @Override // ed3.C13121e, ed3.C13130n
    /* JADX INFO: renamed from: Q */
    public final long mo36722Q(InterfaceC39443g interfaceC39443g, int i13) {
        AbstractC22676k.m65750j(interfaceC39443g, "<this>");
        return 19500L;
    }

    @Override // ed3.C13130n, zc3.InterfaceC40542e
    public final InterfaceC40540c beginCollection(InterfaceC39443g descriptor, int i13) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        throw new SerializationException("Packing only supports primitive number types");
    }

    @Override // ed3.C13130n, zc3.InterfaceC40542e
    public final InterfaceC40540c beginStructure(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        throw new SerializationException("Packing only supports primitive number types");
    }
}
