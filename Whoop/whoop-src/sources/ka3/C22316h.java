package ka3;

import io.sentry.config.AbstractC20301a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23465k;
import lb3.AbstractC23763c0;
import lb3.AbstractC23773f1;
import lb3.AbstractC23797r;
import lb3.AbstractC23804u0;
import lb3.AbstractC23811y;
import lb3.C23784k0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import mb3.C25389f;
import mb3.InterfaceC25387d;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import r93.InterfaceC31117e;
import r93.InterfaceC31126h;
import wb3.AbstractC37056f;
import xa3.C38147h;
import xa3.C38148i;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ka3.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C22316h extends AbstractC23797r {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22316h(AbstractC23763c0 lowerBound, AbstractC23763c0 upperBound) {
        super(lowerBound, upperBound);
        AbstractC22676k.m65750j(lowerBound, "lowerBound");
        AbstractC22676k.m65750j(upperBound, "upperBound");
        InterfaceC25387d.f99472a.m74525b(lowerBound, upperBound);
    }

    /* JADX INFO: renamed from: w0 */
    public static final ArrayList m64122w0(C38148i c38148i, AbstractC23811y abstractC23811y) throws IOException {
        List<AbstractC23804u0> listMo69842X = abstractC23811y.mo69842X();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listMo69842X, 10));
        for (AbstractC23804u0 typeProjection : listMo69842X) {
            AbstractC22676k.m65750j(typeProjection, "typeProjection");
            StringBuilder sb4 = new StringBuilder();
            AbstractC25265s.m74109M0(AbstractC37056f.m118958J(typeProjection), sb4, ", ", null, null, new C38147h(c38148i, 0), 60);
            arrayList.add(sb4.toString());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: x0 */
    public static final String m64123x0(String str, String str2) {
        if (!AbstractC39414r.m125875T(str, '<', false)) {
            return str;
        }
        return AbstractC39414r.m125862H0(str, '<') + '<' + str2 + '>' + AbstractC39414r.m125860F0('>', str, str);
    }

    @Override // lb3.AbstractC23811y
    /* JADX INFO: renamed from: m0 */
    public final AbstractC23811y mo64124m0(C25389f kotlinTypeRefiner) {
        AbstractC22676k.m65750j(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC23763c0 type = this.f94187x;
        AbstractC22676k.m65750j(type, "type");
        AbstractC23763c0 type2 = this.f94188y;
        AbstractC22676k.m65750j(type2, "type");
        return new C22316h(type, type2);
    }

    @Override // lb3.AbstractC23773f1
    /* JADX INFO: renamed from: r0 */
    public final AbstractC23773f1 mo64125r0(boolean z4) {
        return new C22316h(this.f94187x.mo64125r0(z4), this.f94188y.mo64125r0(z4));
    }

    @Override // lb3.AbstractC23773f1
    /* JADX INFO: renamed from: s0 */
    public final AbstractC23773f1 mo64124m0(C25389f kotlinTypeRefiner) {
        AbstractC22676k.m65750j(kotlinTypeRefiner, "kotlinTypeRefiner");
        AbstractC23763c0 type = this.f94187x;
        AbstractC22676k.m65750j(type, "type");
        AbstractC23763c0 type2 = this.f94188y;
        AbstractC22676k.m65750j(type2, "type");
        return new C22316h(type, type2);
    }

    @Override // lb3.AbstractC23773f1
    /* JADX INFO: renamed from: t0 */
    public final AbstractC23773f1 mo64127t0(C23784k0 newAttributes) {
        AbstractC22676k.m65750j(newAttributes, "newAttributes");
        return new C22316h(this.f94187x.mo64127t0(newAttributes), this.f94188y.mo64127t0(newAttributes));
    }

    @Override // lb3.AbstractC23797r, lb3.AbstractC23811y
    /* JADX INFO: renamed from: u */
    public final InterfaceC22712o mo64128u() {
        InterfaceC31126h interfaceC31126hMo1784d = mo69844i0().mo1784d();
        InterfaceC31117e interfaceC31117e = interfaceC31126hMo1784d instanceof InterfaceC31117e ? (InterfaceC31117e) interfaceC31126hMo1784d : null;
        if (interfaceC31117e != null) {
            InterfaceC22712o interfaceC22712oMo95863n = interfaceC31117e.mo95863n(new C22314f());
            AbstractC22676k.m65749i(interfaceC22712oMo95863n, "getMemberScope(...)");
            return interfaceC22712oMo95863n;
        }
        throw new IllegalStateException(("Incorrect classifier: " + mo69844i0().mo1784d()).toString());
    }

    @Override // lb3.AbstractC23797r
    /* JADX INFO: renamed from: u0 */
    public final AbstractC23763c0 mo64129u0() {
        return this.f94187x;
    }

    @Override // lb3.AbstractC23797r
    /* JADX INFO: renamed from: v0 */
    public final String mo64130v0(C38148i c38148i, C38148i c38148i2) throws IOException {
        AbstractC23763c0 abstractC23763c0 = this.f94187x;
        String strM122188X = c38148i.m122188X(abstractC23763c0);
        AbstractC23763c0 abstractC23763c1 = this.f94188y;
        String strM122188X2 = c38148i.m122188X(abstractC23763c1);
        if (c38148i2.f163321a.m122222o()) {
            return "raw (" + strM122188X + ".." + strM122188X2 + ')';
        }
        if (abstractC23763c1.mo69842X().isEmpty()) {
            return c38148i.m122171F(strM122188X, strM122188X2, AbstractC20301a.m56356z(this));
        }
        ArrayList arrayListM64122w0 = m64122w0(c38148i, abstractC23763c0);
        ArrayList arrayListM64122w1 = m64122w0(c38148i, abstractC23763c1);
        String strM74110N0 = AbstractC25265s.m74110N0(arrayListM64122w0, ", ", null, null, C22315g.f87086w, 30);
        ArrayList arrayListM74107K1 = AbstractC25265s.m74107K1(arrayListM64122w0, arrayListM64122w1);
        if (!arrayListM74107K1.isEmpty()) {
            Iterator it = arrayListM74107K1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    strM122188X2 = m64123x0(strM122188X2, strM74110N0);
                    break;
                }
                C23465k c23465k = (C23465k) it.next();
                String str = (String) c23465k.f92937w;
                String str2 = (String) c23465k.f92938x;
                if (!AbstractC22676k.m65745e(str, AbstractC39414r.m125898q0(str2, "out ")) && !str2.equals("*")) {
                    break;
                }
            }
        } else {
            strM122188X2 = m64123x0(strM122188X2, strM74110N0);
            break;
        }
        String strM64123x0 = m64123x0(strM122188X, strM74110N0);
        return AbstractC22676k.m65745e(strM64123x0, strM122188X2) ? strM64123x0 : c38148i.m122171F(strM64123x0, strM122188X2, AbstractC20301a.m56356z(this));
    }
}
