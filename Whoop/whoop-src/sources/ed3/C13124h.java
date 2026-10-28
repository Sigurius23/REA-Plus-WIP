package ed3;

import dd3.C11972a;
import dd3.InterfaceC11974c;
import e10.C12554k0;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.SerializationException;
import m83.AbstractC25265s;
import p000.AbstractC11266d;
import p522uf.AbstractC34870c0;
import p715kotlin.jvm.internal.AbstractC22676k;
import yc3.AbstractC39440d;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: ed3.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C13124h extends C13130n {

    /* JADX INFO: renamed from: g */
    public final C12554k0 f45393g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13124h(C11972a proto, C12554k0 parentWriter, InterfaceC39443g descriptor) {
        super(proto, parentWriter, descriptor);
        AbstractC22676k.m65750j(proto, "proto");
        AbstractC22676k.m65750j(parentWriter, "parentWriter");
        AbstractC22676k.m65750j(descriptor, "descriptor");
        this.f45393g = parentWriter;
        if (descriptor.getKind() instanceof AbstractC39440d) {
            return;
        }
        throw new IllegalArgumentException(("The serializer of one of type " + descriptor.getSerialName() + " should be using generic polymorphic serializer, but got " + descriptor.getKind() + '.').toString());
    }

    @Override // ed3.C13130n
    /* JADX INFO: renamed from: O */
    public final void mo36724O(long j7, String value) {
        AbstractC22676k.m65750j(value, "value");
        if (j7 != 19501) {
            super.mo36724O(j7, value);
        }
    }

    @Override // ed3.C13130n
    /* JADX INFO: renamed from: Q */
    public final long mo36722Q(InterfaceC39443g interfaceC39443g, int i13) {
        AbstractC22676k.m65750j(interfaceC39443g, "<this>");
        if (i13 == 0) {
            return 19501L;
        }
        if (i13 == 1) {
            return AbstractC34870c0.m109976K(interfaceC39443g, i13);
        }
        StringBuilder sbM30466t = AbstractC11266d.m30466t(i13, "Unsupported index: ", " in a oneOf type ");
        sbM30466t.append(interfaceC39443g.getSerialName());
        sbM30466t.append(", which should be using generic polymorphic serializer");
        throw new SerializationException(sbM30466t.toString());
    }

    @Override // ed3.C13130n, zc3.InterfaceC40542e
    public final InterfaceC40540c beginStructure(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        if (descriptor.equals(this.f45419f)) {
            return this;
        }
        C11972a proto = this.f45417d;
        AbstractC22676k.m65750j(proto, "proto");
        C12554k0 parentWriter = this.f45393g;
        AbstractC22676k.m65750j(parentWriter, "parentWriter");
        C13122f c13122f = new C13122f(proto, parentWriter, descriptor);
        if (descriptor.getElementsCount() != 1) {
            throw new IllegalArgumentException(("Implementation of oneOf type " + descriptor.getSerialName() + " should contain only 1 element, but get " + descriptor.getElementsCount()).toString());
        }
        List elementAnnotations = descriptor.getElementAnnotations(0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : elementAnnotations) {
            if (obj instanceof InterfaceC11974c) {
                arrayList.add(obj);
            }
        }
        if (((InterfaceC11974c) AbstractC25265s.m74146r1(arrayList)) != null) {
            return c13122f;
        }
        throw new IllegalArgumentException(("Implementation of oneOf type " + descriptor.getSerialName() + " should have @ProtoNumber annotation").toString());
    }

    @Override // ed3.C13130n, zc3.InterfaceC40542e
    public final InterfaceC40542e encodeInline(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        m4433r((m4430n() & 1152921500311879680L) | ((long) ((int) (AbstractC34870c0.m109976K(descriptor, 0) & 2147483647L))));
        return this;
    }
}
