package wc3;

import cd3.AbstractC4454f;
import j93.InterfaceC21461d;
import java.util.List;
import kotlinx.serialization.internal.Platform_commonKt;
import m83.AbstractC25260n;
import p459rf.C31345p;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.jvm.internal.AbstractC22676k;
import vf3.AbstractC35952b;
import yc3.C39438b;
import yc3.C39445i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: wc3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C37136a implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC21461d f158877a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC37138c f158878b;

    /* JADX INFO: renamed from: c */
    public final List f158879c;

    /* JADX INFO: renamed from: d */
    public final C39438b f158880d;

    public C37136a(InterfaceC21461d serializableClass, InterfaceC37138c interfaceC37138c, InterfaceC37138c[] interfaceC37138cArr) {
        AbstractC22676k.m65750j(serializableClass, "serializableClass");
        this.f158877a = serializableClass;
        this.f158878b = interfaceC37138c;
        this.f158879c = AbstractC25260n.m74048W(interfaceC37138cArr);
        C31345p c31345p = new C31345p(this, 7);
        this.f158880d = new C39438b(AbstractC35952b.m114196d("kotlinx.serialization.ContextualSerializer", C39445i.f169711a, new InterfaceC39443g[0], c31345p), serializableClass);
    }

    @Override // wc3.InterfaceC37137b
    public final Object deserialize(InterfaceC40541d interfaceC40541d) {
        AbstractC4454f serializersModule = interfaceC40541d.getSerializersModule();
        List list = this.f158879c;
        InterfaceC21461d interfaceC21461d = this.f158877a;
        InterfaceC37138c interfaceC37138cMo13924b = serializersModule.mo13924b(interfaceC21461d, list);
        if (interfaceC37138cMo13924b != null || (interfaceC37138cMo13924b = this.f158878b) != null) {
            return interfaceC40541d.decodeSerializableValue(interfaceC37138cMo13924b);
        }
        Platform_commonKt.serializerNotRegistered(interfaceC21461d);
        throw new KotlinNothingValueException();
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return this.f158880d;
    }

    @Override // wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e interfaceC40542e, Object value) {
        AbstractC22676k.m65750j(value, "value");
        AbstractC4454f serializersModule = interfaceC40542e.getSerializersModule();
        List list = this.f158879c;
        InterfaceC21461d interfaceC21461d = this.f158877a;
        InterfaceC37138c interfaceC37138cMo13924b = serializersModule.mo13924b(interfaceC21461d, list);
        if (interfaceC37138cMo13924b == null && (interfaceC37138cMo13924b = this.f158878b) == null) {
            Platform_commonKt.serializerNotRegistered(interfaceC21461d);
            throw new KotlinNothingValueException();
        }
        interfaceC40542e.encodeSerializableValue(interfaceC37138cMo13924b, value);
    }
}
