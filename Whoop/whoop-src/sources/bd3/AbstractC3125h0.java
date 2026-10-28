package bd3;

import ad3.AbstractC0770m;
import java.util.Set;
import kotlinx.serialization.internal.UByteSerializer;
import kotlinx.serialization.internal.UIntSerializer;
import kotlinx.serialization.internal.ULongSerializer;
import kotlinx.serialization.internal.UShortSerializer;
import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;
import yc3.InterfaceC39443g;

/* JADX INFO: renamed from: bd3.h0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3125h0 {

    /* JADX INFO: renamed from: a */
    public static final Set f12264a = AbstractC25260n.m74059b1(new InterfaceC39443g[]{UIntSerializer.INSTANCE.getDescriptor(), ULongSerializer.INSTANCE.getDescriptor(), UByteSerializer.INSTANCE.getDescriptor(), UShortSerializer.INSTANCE.getDescriptor()});

    /* JADX INFO: renamed from: a */
    public static final boolean m8984a(InterfaceC39443g interfaceC39443g) {
        AbstractC22676k.m65750j(interfaceC39443g, "<this>");
        return interfaceC39443g.getIsInline() && interfaceC39443g.equals(AbstractC0770m.f2805a);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m8985b(InterfaceC39443g interfaceC39443g) {
        AbstractC22676k.m65750j(interfaceC39443g, "<this>");
        return interfaceC39443g.getIsInline() && f12264a.contains(interfaceC39443g);
    }
}
