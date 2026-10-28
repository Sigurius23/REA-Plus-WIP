package vc3;

import kotlinx.datetime.TimeZone;
import p715kotlin.jvm.internal.AbstractC22676k;
import pc3.C29094p;
import vf3.AbstractC35952b;
import wc3.InterfaceC37138c;
import yc3.C39441e;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: vc3.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C35895n implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C35895n f152827a = new C35895n();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC39443g f152828b = AbstractC35952b.m114194b("kotlinx.datetime.TimeZone", C39441e.f169698i);

    @Override // wc3.InterfaceC37137b
    public final Object deserialize(InterfaceC40541d interfaceC40541d) {
        C29094p c29094p = TimeZone.Companion;
        String strDecodeString = interfaceC40541d.decodeString();
        c29094p.getClass();
        return C29094p.m88409a(strDecodeString);
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return f152828b;
    }

    @Override // wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e interfaceC40542e, Object obj) {
        TimeZone value = (TimeZone) obj;
        AbstractC22676k.m65750j(value, "value");
        interfaceC40542e.encodeString(value.getId());
    }
}
