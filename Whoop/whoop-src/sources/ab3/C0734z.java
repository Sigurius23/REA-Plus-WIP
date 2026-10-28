package ab3;

import hg3.AbstractC17269i;
import lb3.AbstractC23763c0;
import lb3.AbstractC23811y;
import nb3.C26555l;
import nb3.EnumC26554k;
import o93.AbstractC27741m;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31109b0;
import r93.InterfaceC31117e;

/* JADX INFO: renamed from: ab3.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C0734z extends AbstractC0724p {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f2707b = 0;

    public C0734z(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // ab3.AbstractC0715g
    /* JADX INFO: renamed from: a */
    public final AbstractC23811y mo1776a(InterfaceC31109b0 module) {
        AbstractC23763c0 abstractC23763c0Mo60594i;
        AbstractC23763c0 abstractC23763c0Mo60594i2;
        AbstractC23763c0 abstractC23763c0Mo60594i3;
        AbstractC23763c0 abstractC23763c0Mo60594i4;
        switch (this.f2707b) {
            case 0:
                AbstractC22676k.m65750j(module, "module");
                InterfaceC31117e interfaceC31117eM48865L = AbstractC17269i.m48865L(module, AbstractC27741m.f111835S);
                return (interfaceC31117eM48865L == null || (abstractC23763c0Mo60594i = interfaceC31117eM48865L.mo60594i()) == null) ? C26555l.m78682c(EnumC26554k.NOT_FOUND_UNSIGNED_TYPE, "UByte") : abstractC23763c0Mo60594i;
            case 1:
                AbstractC22676k.m65750j(module, "module");
                InterfaceC31117e interfaceC31117eM48865L2 = AbstractC17269i.m48865L(module, AbstractC27741m.f111837U);
                return (interfaceC31117eM48865L2 == null || (abstractC23763c0Mo60594i2 = interfaceC31117eM48865L2.mo60594i()) == null) ? C26555l.m78682c(EnumC26554k.NOT_FOUND_UNSIGNED_TYPE, "UInt") : abstractC23763c0Mo60594i2;
            case 2:
                AbstractC22676k.m65750j(module, "module");
                InterfaceC31117e interfaceC31117eM48865L3 = AbstractC17269i.m48865L(module, AbstractC27741m.f111838V);
                return (interfaceC31117eM48865L3 == null || (abstractC23763c0Mo60594i3 = interfaceC31117eM48865L3.mo60594i()) == null) ? C26555l.m78682c(EnumC26554k.NOT_FOUND_UNSIGNED_TYPE, "ULong") : abstractC23763c0Mo60594i3;
            default:
                AbstractC22676k.m65750j(module, "module");
                InterfaceC31117e interfaceC31117eM48865L4 = AbstractC17269i.m48865L(module, AbstractC27741m.f111836T);
                return (interfaceC31117eM48865L4 == null || (abstractC23763c0Mo60594i4 = interfaceC31117eM48865L4.mo60594i()) == null) ? C26555l.m78682c(EnumC26554k.NOT_FOUND_UNSIGNED_TYPE, "UShort") : abstractC23763c0Mo60594i4;
        }
    }

    @Override // ab3.AbstractC0715g
    public final String toString() {
        switch (this.f2707b) {
            case 0:
                return ((Number) this.f2696a).intValue() + ".toUByte()";
            case 1:
                return ((Number) this.f2696a).intValue() + ".toUInt()";
            case 2:
                return ((Number) this.f2696a).longValue() + ".toULong()";
            default:
                return ((Number) this.f2696a).intValue() + ".toUShort()";
        }
    }

    public C0734z(short s13) {
        super(Short.valueOf(s13));
    }

    public C0734z(int i13) {
        super(Integer.valueOf(i13));
    }

    public C0734z(long j7) {
        super(Long.valueOf(j7));
    }
}
