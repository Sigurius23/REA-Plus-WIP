package vc3;

import kotlinx.datetime.DateTimePeriod;
import p715kotlin.jvm.internal.AbstractC22676k;
import pc3.C29080b;
import vf3.AbstractC35952b;
import wc3.InterfaceC37138c;
import yc3.C39441e;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: vc3.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C35885d implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C35885d f152806a = new C35885d();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC39443g f152807b = AbstractC35952b.m114194b("kotlinx.datetime.DateTimePeriod/ISO", C39441e.f169698i);

    @Override // wc3.InterfaceC37137b
    public final Object deserialize(InterfaceC40541d interfaceC40541d) {
        C29080b c29080b = DateTimePeriod.Companion;
        String strDecodeString = interfaceC40541d.decodeString();
        c29080b.getClass();
        return C29080b.m88405a(strDecodeString);
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return f152807b;
    }

    @Override // wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e interfaceC40542e, Object obj) {
        DateTimePeriod value = (DateTimePeriod) obj;
        AbstractC22676k.m65750j(value, "value");
        interfaceC40542e.encodeString(value.toString());
    }
}
