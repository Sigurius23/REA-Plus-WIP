package ed3;

import cd3.AbstractC4454f;
import dd3.C11972a;
import dd3.InterfaceC11974c;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.SerializationException;
import m83.AbstractC25265s;
import p522uf.AbstractC34870c0;
import p715kotlin.jvm.internal.AbstractC22676k;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;

/* JADX INFO: renamed from: ed3.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C13125i extends C13129m {

    /* JADX INFO: renamed from: k */
    public final long f45394k;

    /* JADX INFO: renamed from: l */
    public boolean f45395l;

    /* JADX INFO: renamed from: m */
    public boolean f45396m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13125i(C11972a c11972a, C13131o c13131o, long j7, InterfaceC39443g descriptor) {
        super(c11972a, c13131o, descriptor);
        AbstractC22676k.m65750j(descriptor, "descriptor");
        this.f45394k = j7;
    }

    @Override // ed3.C13129m
    /* JADX INFO: renamed from: Q */
    public final String mo36725Q(long j7) {
        Object next;
        String serialName;
        if (j7 != 19501) {
            return super.mo36725Q(j7);
        }
        AbstractC4454f serializersModule = this.f45408c.f39316a;
        long j13 = this.f45394k;
        int i13 = (int) (j13 & 2147483647L);
        InterfaceC39443g interfaceC39443g = this.f45410e;
        AbstractC22676k.m65750j(interfaceC39443g, "<this>");
        AbstractC22676k.m65750j(serializersModule, "serializersModule");
        Iterator it = AbstractC34870c0.m109979N(interfaceC39443g, serializersModule).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((int) (AbstractC34870c0.m109976K((InterfaceC39443g) next, 0) & 2147483647L)) != i13);
        InterfaceC39443g interfaceC39443g2 = (InterfaceC39443g) next;
        if (interfaceC39443g2 != null && (serialName = interfaceC39443g2.getSerialName()) != null) {
            return serialName;
        }
        StringBuilder sb4 = new StringBuilder("Cannot find a subclass of ");
        sb4.append(interfaceC39443g.getSerialName());
        sb4.append(" annotated with @ProtoNumber(");
        throw new SerializationException(AbstractC18489d0.m53371l(sb4, (int) (j13 & 2147483647L), ")."));
    }

    @Override // ed3.C13129m
    /* JADX INFO: renamed from: T */
    public final long mo36721T(InterfaceC39443g interfaceC39443g, int i13) {
        AbstractC22676k.m65750j(interfaceC39443g, "<this>");
        if (i13 == 0) {
            return 19501L;
        }
        return AbstractC34870c0.m109976K(interfaceC39443g, 0);
    }

    @Override // ed3.C13129m, zc3.InterfaceC40541d
    public final InterfaceC40539b beginStructure(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        if (descriptor.equals(this.f45410e)) {
            return this;
        }
        C13123g c13123g = new C13123g(this.f45408c, this.f45409d, descriptor);
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
        InterfaceC11974c interfaceC11974c = (InterfaceC11974c) AbstractC25265s.m74146r1(arrayList);
        if (interfaceC11974c != null) {
            interfaceC11974c.number();
            return c13123g;
        }
        throw new IllegalArgumentException(("Implementation of oneOf type " + descriptor.getSerialName() + " should have @ProtoNumber annotation").toString());
    }

    @Override // ed3.C13129m, zc3.InterfaceC40539b
    public final int decodeElementIndex(InterfaceC39443g descriptor) {
        AbstractC22676k.m65750j(descriptor, "descriptor");
        if (!this.f45395l) {
            this.f45395l = true;
            return 0;
        }
        if (this.f45396m) {
            return -1;
        }
        this.f45396m = true;
        return 1;
    }
}
