package cd3;

import java.util.List;
import p715kotlin.jvm.internal.AbstractC22676k;
import wc3.InterfaceC37138c;

/* JADX INFO: renamed from: cd3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C4449a extends AbstractC4451c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC37138c f17951a;

    public C4449a(InterfaceC37138c serializer) {
        AbstractC22676k.m65750j(serializer, "serializer");
        this.f17951a = serializer;
    }

    @Override // cd3.AbstractC4451c
    /* JADX INFO: renamed from: a */
    public final InterfaceC37138c mo13922a(List typeArgumentsSerializers) {
        AbstractC22676k.m65750j(typeArgumentsSerializers, "typeArgumentsSerializers");
        return this.f17951a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4449a) && AbstractC22676k.m65745e(((C4449a) obj).f17951a, this.f17951a);
    }

    public final int hashCode() {
        return this.f17951a.hashCode();
    }
}
