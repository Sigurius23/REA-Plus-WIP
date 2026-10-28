package p459rf;

import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.MciTileSectionModel;
import java.util.List;
import jb1.C21535a;
import kotlinx.serialization.internal.StringSerializer;
import l83.C23454a0;
import l83.C23474t;
import ld1.AbstractC23864c;
import m83.C25271y;
import od1.C27858u;
import p002a0.C0039m0;
import p040c0.InterfaceC3770q;
import p390p1.InterfaceC28690z0;
import p500tb.InterfaceC33687a;
import p634y1.C39031d;
import p634y1.InterfaceC39033f;
import p635y2.InterfaceC39147y;
import p668z1.C39972u;
import p668z1.C39973v;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p741vn1.AbstractC36212p;
import p741vn1.EnumC36205i;
import pf.C29124b;
import pf.InterfaceC29129g;
import rf2.C31361c;
import rv1.C31842a;
import to1.AbstractC34019l;
import ud3.C34826l0;
import um1.AbstractC35086d;
import vf3.AbstractC35952b;
import vy0.AbstractC36578h0;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import x02.AbstractC37803b;
import yc3.C39437a;
import yc3.C39445i;
import yc3.InterfaceC39443g;
import z53.C40110b;
import z82.C40187a;

/* JADX INFO: renamed from: rf.p */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C31345p implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f128979w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f128980x;

    public /* synthetic */ C31345p(Object obj, int i13) {
        this.f128979w = i13;
        this.f128980x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC39443g descriptor;
        switch (this.f128979w) {
            case 0:
                C31347r c31347r = (C31347r) this.f128980x;
                InterfaceC29129g interfaceC29129g = (InterfaceC29129g) obj;
                AbstractC22676k.m65750j(interfaceC29129g, "<this>");
                new C29124b(c31347r, 2).invoke(interfaceC29129g);
                if (interfaceC29129g instanceof C31346q) {
                    ((C31346q) interfaceC29129g).f128981j = new C23474t(c31347r.f128985k);
                }
                return C23454a0.f92919a;
            case 1:
                return ((C31361c) this.f128980x).m96452t((InterfaceC33687a) obj);
            case 2:
                return C31842a.m98919K((C31842a) this.f128980x, (C27858u.a) obj);
            case 3:
                return AbstractC34019l.m107521D((C21535a) this.f128980x, (MciTileSectionModel) obj);
            case 4:
                return AbstractC35086d.m110968x((AbstractC23864c) this.f128980x, (EnumC36205i) obj);
            case 5:
                return AbstractC36212p.m115256v((EnumC36205i) this.f128980x, (InterfaceC3770q) obj);
            case 6:
                return AbstractC36578h0.m117333K((InterfaceC28690z0) this.f128980x, (InterfaceC39147y) obj);
            case 7:
                C37136a c37136a = (C37136a) this.f128980x;
                C39437a buildSerialDescriptor = (C39437a) obj;
                AbstractC22676k.m65750j(buildSerialDescriptor, "$this$buildSerialDescriptor");
                InterfaceC37138c interfaceC37138c = c37136a.f158878b;
                List annotations = (interfaceC37138c == null || (descriptor = interfaceC37138c.getDescriptor()) == null) ? null : descriptor.getAnnotations();
                if (annotations == null) {
                    annotations = C25271y.f99162w;
                }
                buildSerialDescriptor.f169679b = annotations;
                return C23454a0.f92919a;
            case 8:
                C37140e c37140e = (C37140e) this.f128980x;
                C39437a buildSerialDescriptor2 = (C39437a) obj;
                AbstractC22676k.m65750j(buildSerialDescriptor2, "$this$buildSerialDescriptor");
                buildSerialDescriptor2.m125993a("type", StringSerializer.INSTANCE.getDescriptor(), false);
                buildSerialDescriptor2.m125993a("value", AbstractC35952b.m114197e("kotlinx.serialization.Polymorphic<" + c37140e.f158881a.getSimpleName() + '>', C39445i.f169711a, new InterfaceC39443g[0]), false);
                List list = c37140e.f158882b;
                AbstractC22676k.m65750j(list, "<set-?>");
                buildSerialDescriptor2.f169679b = list;
                return C23454a0.f92919a;
            case 9:
                return AbstractC37803b.m121315g((C34826l0) this.f128980x, (C40110b) obj);
            case 10:
                InterfaceC39033f interfaceC39033f = ((C39031d) this.f128980x).f167999y;
                return Boolean.valueOf(interfaceC39033f != null ? interfaceC39033f.mo7446d(obj) : true);
            case 11:
                C39973v c39973v = (C39973v) this.f128980x;
                synchronized (c39973v.f172500g) {
                    C39972u c39972u = c39973v.f172502i;
                    AbstractC22676k.m65747g(c39972u);
                    Object obj2 = c39972u.f172483b;
                    AbstractC22676k.m65747g(obj2);
                    int i13 = c39972u.f172485d;
                    C0039m0 c0039m0 = c39972u.f172484c;
                    if (c0039m0 == null) {
                        c0039m0 = new C0039m0();
                        c39972u.f172484c = c0039m0;
                        c39972u.f172487f.m135m(obj2, c0039m0);
                    }
                    c39972u.m128198c(obj, i13, obj2, c0039m0);
                }
                return C23454a0.f92919a;
            default:
                return C40187a.m128949E((C40187a) this.f128980x, (C27858u.a) obj);
        }
    }
}
