package gb;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import p077d0.C11421z1;
import p114eb.C12982q;
import p114eb.C12991u0;
import p390p1.C28633k1;
import p390p1.InterfaceC28670t2;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: gb.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C15640d0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C15648i f58692E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C11421z1 f58693w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12991u0 f58694x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Map f58695y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC28670t2 f58696z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15640d0(C11421z1 c11421z1, C12991u0 c12991u0, Map map, InterfaceC28670t2 interfaceC28670t2, C15648i c15648i, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        this.f58693w = c11421z1;
        this.f58694x = c12991u0;
        this.f58695y = map;
        this.f58696z = interfaceC28670t2;
        this.f58692E = c15648i;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        return new C15640d0(this.f58693w, this.f58694x, this.f58695y, this.f58696z, this.f58692E, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C15640d0 c15640d0 = (C15640d0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        c15640d0.invokeSuspend(c23454a0);
        return c23454a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        C11421z1 c11421z1 = this.f58693w;
        Object objMo2428y0 = c11421z1.f36630a.mo2428y0();
        C28633k1 c28633k1 = c11421z1.f36633d;
        if (AbstractC22676k.m65745e(objMo2428y0, c28633k1.getValue())) {
            C12991u0 c12991u0 = this.f58694x;
            if (c12991u0.m36393h() == null || AbstractC22676k.m65745e(c28633k1.getValue(), c12991u0.m36393h())) {
                Iterator it = ((List) this.f58696z.getValue()).iterator();
                while (it.hasNext()) {
                    this.f58692E.m36435b().m36492b((C12982q) it.next());
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map map = this.f58695y;
                for (Map.Entry entry : map.entrySet()) {
                    if (!AbstractC22676k.m65745e(entry.getKey(), ((C12982q) c28633k1.getValue()).f44835F)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it3 = linkedHashMap.entrySet().iterator();
                while (it3.hasNext()) {
                    map.remove(((Map.Entry) it3.next()).getKey());
                }
            }
        }
        return C23454a0.f92919a;
    }
}
