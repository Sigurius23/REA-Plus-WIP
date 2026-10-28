package bd3;

import ad3.C0766i;
import ad3.EnumC0753a;
import cd3.InterfaceC4456h;
import j93.InterfaceC21461d;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;
import yc3.AbstractC39440d;
import yc3.AbstractC39442f;
import yc3.AbstractC39447k;
import yc3.C39445i;
import yc3.C39446j;
import yc3.C39448l;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: bd3.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C3142u implements InterfaceC4456h {

    /* JADX INFO: renamed from: w */
    public final boolean f12307w;

    /* JADX INFO: renamed from: x */
    public final String f12308x;

    public C3142u(String str, boolean z4) {
        this.f12308x = str;
        this.f12307w = z4;
    }

    @Override // cd3.InterfaceC4456h
    /* JADX INFO: renamed from: e */
    public void mo2321e(InterfaceC21461d interfaceC21461d, Function1 function1) {
    }

    @Override // cd3.InterfaceC4456h
    /* JADX INFO: renamed from: k */
    public void mo2325k(InterfaceC21461d interfaceC21461d, InterfaceC37138c serializer) {
        AbstractC22676k.m65750j(serializer, "serializer");
    }

    @Override // cd3.InterfaceC4456h
    /* JADX INFO: renamed from: o */
    public void mo2326o(InterfaceC21461d kClass, Function1 function1) {
        AbstractC22676k.m65750j(kClass, "kClass");
    }

    @Override // cd3.InterfaceC4456h
    /* JADX INFO: renamed from: p */
    public void mo2327p(InterfaceC21461d interfaceC21461d, Function1 function1) {
    }

    @Override // cd3.InterfaceC4456h
    /* JADX INFO: renamed from: s */
    public void mo2330s(InterfaceC21461d interfaceC21461d, InterfaceC21461d interfaceC21461d2, InterfaceC37138c interfaceC37138c) {
        InterfaceC39443g descriptor = interfaceC37138c.getDescriptor();
        AbstractC39447k kind = descriptor.getKind();
        if ((kind instanceof AbstractC39440d) || AbstractC22676k.m65745e(kind, C39445i.f169711a)) {
            throw new IllegalArgumentException("Serializer for " + interfaceC21461d2.getSimpleName() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
        }
        boolean z4 = this.f12307w;
        if (z4 && (AbstractC22676k.m65745e(kind, C39448l.f169714b) || AbstractC22676k.m65745e(kind, C39448l.f169715c) || (kind instanceof AbstractC39442f) || (kind instanceof C39446j))) {
            throw new IllegalArgumentException("Serializer for " + interfaceC21461d2.getSimpleName() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
        }
        if (z4) {
            int elementsCount = descriptor.getElementsCount();
            for (int i13 = 0; i13 < elementsCount; i13++) {
                String elementName = descriptor.getElementName(i13);
                if (AbstractC22676k.m65745e(elementName, this.f12308x)) {
                    throw new IllegalArgumentException("Polymorphic serializer for " + interfaceC21461d2 + " has property '" + elementName + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                }
            }
        }
    }

    public C3142u(C0766i c0766i) {
        this.f12308x = c0766i.f2797i;
        this.f12307w = c0766i.f2802n != EnumC0753a.f2754w;
    }

    public C3142u(boolean z4, String str) {
        this.f12307w = z4;
        this.f12308x = str;
    }
}
