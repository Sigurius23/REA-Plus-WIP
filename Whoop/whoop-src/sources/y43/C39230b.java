package y43;

import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import java.util.Map;
import l83.C23454a0;
import mc3.AbstractC25438d;
import mc3.C25437c;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: y43.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C39230b {

    /* JADX INFO: renamed from: a */
    public final Map f168686a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4351m f168687b;

    /* JADX INFO: renamed from: c */
    public final C25437c f168688c;

    /* JADX INFO: renamed from: d */
    public final C13045h2 f168689d;

    /* JADX INFO: renamed from: e */
    public final C13045h2 f168690e;

    public C39230b(Object initialState, Map stateFunctions, InterfaceC4351m defaultEventHandler) {
        AbstractC22676k.m65750j(initialState, "initialState");
        AbstractC22676k.m65750j(stateFunctions, "stateFunctions");
        AbstractC22676k.m65750j(defaultEventHandler, "defaultEventHandler");
        this.f168686a = stateFunctions;
        this.f168687b = defaultEventHandler;
        this.f168688c = AbstractC25438d.m74669a();
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(initialState);
        this.f168689d = c13045h2M36593c;
        this.f168690e = c13045h2M36593c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m124995a(Object obj, InterfaceC30057d interfaceC30057d) {
        C39229a c39229a;
        C25437c c25437c;
        C39230b c39230b;
        InterfaceC4351m interfaceC4351m;
        if (interfaceC30057d instanceof C39229a) {
            c39229a = (C39229a) interfaceC30057d;
            int i13 = c39229a.f168681F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c39229a.f168681F = i13 - Integer.MIN_VALUE;
            } else {
                c39229a = new C39229a(this, interfaceC30057d);
            }
        } else {
            c39229a = new C39229a(this, interfaceC30057d);
        }
        Object obj2 = c39229a.f168685z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c39229a.f168681F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj2);
            c39229a.f168682w = this;
            c39229a.f168683x = obj;
            c25437c = this.f168688c;
            c39229a.f168684y = c25437c;
            c39229a.f168681F = 1;
            if (c25437c.mo68211b(c39229a) == enumC31071a) {
                return enumC31071a;
            }
            c39230b = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C25437c c25437c2 = c39229a.f168684y;
            Object obj3 = c39229a.f168683x;
            c39230b = c39229a.f168682w;
            AbstractC34132o.m107864I(obj2);
            c25437c = c25437c2;
            obj = obj3;
        }
        try {
            Object value = c39230b.f168689d.getValue();
            Map map = c39230b.f168686a;
            Class<?> cls = value.getClass();
            C22673i0 c22673i0 = AbstractC22671h0.f89337a;
            Map map2 = (Map) map.get(c22673i0.getOrCreateKotlinClass(cls));
            if (map2 == null || (interfaceC4351m = (InterfaceC4351m) map2.get(c22673i0.getOrCreateKotlinClass(obj.getClass()))) == null) {
                interfaceC4351m = c39230b.f168687b;
            }
            c39230b.f168689d.m36570j(interfaceC4351m.invoke(value, obj));
            return C23454a0.f92919a;
        } finally {
            c25437c.mo68214i(null);
        }
    }
}
