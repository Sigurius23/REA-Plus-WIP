package dd3;

import cd3.AbstractC4454f;
import cd3.AbstractC4457i;
import e10.C12554k0;
import ed3.C13117a;
import ed3.C13118b;
import ed3.C13129m;
import ed3.C13130n;
import ed3.C13131o;
import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37137b;
import wc3.InterfaceC37145j;

/* JADX INFO: renamed from: dd3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C11972a {

    /* JADX INFO: renamed from: b */
    public static final C11972a f39315b = new C11972a();

    /* JADX INFO: renamed from: a */
    public final AbstractC4454f f39316a = AbstractC4457i.f17965a;

    /* JADX INFO: renamed from: a */
    public final Object m32971a(InterfaceC37137b deserializer, byte[] bArr) {
        AbstractC22676k.m65750j(deserializer, "deserializer");
        return new C13129m(this, new C13131o(new C13117a(bArr, bArr.length, 0, false)), deserializer.getDescriptor()).m36727K(deserializer, null);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m32972b(InterfaceC37145j serializer, Object obj) {
        AbstractC22676k.m65750j(serializer, "serializer");
        C13118b c13118b = new C13118b();
        new C13130n(this, new C12554k0(c13118b, 3), serializer.getDescriptor()).encodeSerializableValue(serializer, obj);
        int i13 = c13118b.f45386b;
        byte[] bArr = new byte[i13];
        AbstractC25260n.m74067h0(0, i13, 2, c13118b.f45385a, bArr);
        return bArr;
    }
}
