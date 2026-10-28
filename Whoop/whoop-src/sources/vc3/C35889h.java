package vc3;

import kotlinx.datetime.FixedOffsetTimeZone;
import kotlinx.datetime.TimeZone;
import kotlinx.serialization.SerializationException;
import p715kotlin.jvm.internal.AbstractC22676k;
import pc3.C29094p;
import vf3.AbstractC35952b;
import wc3.InterfaceC37138c;
import yc3.C39441e;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: vc3.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C35889h implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public static final C35889h f152815a = new C35889h();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC39443g f152816b = AbstractC35952b.m114194b("kotlinx.datetime.FixedOffsetTimeZone", C39441e.f169698i);

    @Override // wc3.InterfaceC37137b
    public final Object deserialize(InterfaceC40541d interfaceC40541d) throws Exception {
        C29094p c29094p = TimeZone.Companion;
        String strDecodeString = interfaceC40541d.decodeString();
        c29094p.getClass();
        TimeZone timeZoneM88409a = C29094p.m88409a(strDecodeString);
        if (timeZoneM88409a instanceof FixedOffsetTimeZone) {
            return (FixedOffsetTimeZone) timeZoneM88409a;
        }
        throw new SerializationException("Timezone identifier '" + timeZoneM88409a + "' does not correspond to a fixed-offset timezone");
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return f152816b;
    }

    @Override // wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e interfaceC40542e, Object obj) {
        FixedOffsetTimeZone value = (FixedOffsetTimeZone) obj;
        AbstractC22676k.m65750j(value, "value");
        interfaceC40542e.encodeString(value.getId());
    }
}
