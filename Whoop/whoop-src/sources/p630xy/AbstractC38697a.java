package p630xy;

import java.util.LinkedHashMap;
import m83.AbstractC25247g0;
import m83.AbstractC25260n;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import vf3.AbstractC35952b;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import yc3.C39441e;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40541d;
import zc3.InterfaceC40542e;

/* JADX INFO: renamed from: xy.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC38697a implements InterfaceC37138c {

    /* JADX INFO: renamed from: a */
    public final Enum f166521a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC39443g f166522b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f166523c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashMap f166524d;

    public AbstractC38697a(Enum[] values, Enum defaultValue) {
        String strName;
        String strName2;
        AbstractC22676k.m65750j(values, "values");
        AbstractC22676k.m65750j(defaultValue, "defaultValue");
        this.f166521a = defaultValue;
        String qualifiedName = AbstractC22671h0.f89337a.getOrCreateKotlinClass(AbstractC25260n.m74078s0(values).getClass()).getQualifiedName();
        AbstractC22676k.m65747g(qualifiedName);
        this.f166522b = AbstractC35952b.m114194b(qualifiedName, C39441e.f169698i);
        int iM73988W = AbstractC25247g0.m73988W(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W < 16 ? 16 : iM73988W);
        for (Enum r10 : values) {
            InterfaceC37143h interfaceC37143h = (InterfaceC37143h) r10.getClass().getField(r10.name()).getAnnotation(InterfaceC37143h.class);
            if (interfaceC37143h == null || (strName2 = interfaceC37143h.value()) == null) {
                strName2 = r10.name();
            }
            linkedHashMap.put(r10, strName2);
        }
        this.f166523c = linkedHashMap;
        int iM73988W2 = AbstractC25247g0.m73988W(values.length);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iM73988W2 >= 16 ? iM73988W2 : 16);
        for (Enum r14 : values) {
            InterfaceC37143h interfaceC37143h2 = (InterfaceC37143h) r14.getClass().getField(r14.name()).getAnnotation(InterfaceC37143h.class);
            if (interfaceC37143h2 == null || (strName = interfaceC37143h2.value()) == null) {
                strName = r14.name();
            }
            linkedHashMap2.put(strName, r14);
        }
        this.f166524d = linkedHashMap2;
    }

    @Override // wc3.InterfaceC37137b
    public final Object deserialize(InterfaceC40541d interfaceC40541d) {
        Enum r10 = (Enum) this.f166524d.get(interfaceC40541d.decodeString());
        return r10 == null ? this.f166521a : r10;
    }

    @Override // wc3.InterfaceC37145j, wc3.InterfaceC37137b
    public final InterfaceC39443g getDescriptor() {
        return this.f166522b;
    }

    @Override // wc3.InterfaceC37145j
    public final void serialize(InterfaceC40542e interfaceC40542e, Object obj) {
        Enum value = (Enum) obj;
        AbstractC22676k.m65750j(value, "value");
        interfaceC40542e.encodeString((String) AbstractC25247g0.m73986U(value, this.f166523c));
    }
}
