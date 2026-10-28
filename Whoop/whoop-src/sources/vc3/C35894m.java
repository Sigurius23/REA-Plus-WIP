package vc3;

import kotlinx.datetime.DateTimeUnit;
import kotlinx.serialization.MissingFieldException;
import l83.EnumC23463i;
import p479s4.AbstractC32123d;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import v40.C35652d;
import wc3.InterfaceC37138c;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40539b;
import zc3.InterfaceC40540c;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: vc3.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C35894m implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C35894m f152825a = new C35894m();

    /* JADX INFO: renamed from: b */
    public static final Object f152826b = AbstractC30060g.m92087G(EnumC23463i.f92934x, new C35652d(29));

    @Override // wc3.InterfaceC37137b
    public final Object deserialize(InterfaceC40541d interfaceC40541d) {
        long jDecodeLongElement;
        InterfaceC39443g descriptor = getDescriptor();
        InterfaceC40539b interfaceC40539bBeginStructure = interfaceC40541d.beginStructure(descriptor);
        boolean zDecodeSequentially = interfaceC40539bBeginStructure.decodeSequentially();
        boolean z4 = true;
        C35894m c35894m = f152825a;
        if (!zDecodeSequentially) {
            long jDecodeLongElement2 = 0;
            boolean z13 = false;
            while (true) {
                int iDecodeElementIndex = interfaceC40539bBeginStructure.decodeElementIndex(c35894m.getDescriptor());
                if (iDecodeElementIndex == -1) {
                    z4 = z13;
                    jDecodeLongElement = jDecodeLongElement2;
                    break;
                }
                if (iDecodeElementIndex != 0) {
                    AbstractC32123d.m100029i(iDecodeElementIndex);
                    throw null;
                }
                jDecodeLongElement2 = interfaceC40539bBeginStructure.decodeLongElement(c35894m.getDescriptor(), 0);
                z13 = true;
            }
        } else {
            jDecodeLongElement = interfaceC40539bBeginStructure.decodeLongElement(c35894m.getDescriptor(), 0);
        }
        interfaceC40539bBeginStructure.endStructure(descriptor);
        if (z4) {
            return new DateTimeUnit.TimeBased(jDecodeLongElement);
        }
        throw new MissingFieldException("nanoseconds", getDescriptor().getSerialName());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l83.h] */
    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return (InterfaceC39443g) f152826b.getValue();
    }

    @Override // wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e interfaceC40542e, Object obj) {
        DateTimeUnit.TimeBased value = (DateTimeUnit.TimeBased) obj;
        AbstractC22676k.m65750j(value, "value");
        InterfaceC39443g descriptor = getDescriptor();
        InterfaceC40540c interfaceC40540cBeginStructure = interfaceC40542e.beginStructure(descriptor);
        interfaceC40540cBeginStructure.encodeLongElement(f152825a.getDescriptor(), 0, value.getNanoseconds());
        interfaceC40540cBeginStructure.endStructure(descriptor);
    }
}
