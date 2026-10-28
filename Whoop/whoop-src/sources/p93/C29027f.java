package p93;

import com.squareup.wire.AbstractC5583n;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l83.C23465k;
import lb3.AbstractC23811y;
import lb3.C23758a1;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import p715kotlin.jvm.internal.AbstractC22676k;
import r93.InterfaceC31107a1;
import r93.InterfaceC31135k;
import r93.InterfaceC31155s0;
import r93.InterfaceC31162w;
import rb3.AbstractC31211s;
import s93.C32305g;
import s93.InterfaceC32307i;
import u93.AbstractC34690n;
import u93.AbstractC34710x;
import u93.AbstractC34711x0;
import u93.C34697q0;
import u93.C34708w;
import u93.C34709w0;
import va3.C35850h;

/* JADX INFO: renamed from: p93.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C29027f extends C34697q0 {
    public C29027f(InterfaceC31135k interfaceC31135k, C29027f c29027f, int i13, boolean z4) {
        super(interfaceC31135k, c29027f, C32305g.f133684a, AbstractC31211s.f128562g, i13, InterfaceC31155s0.f128370q);
        this.f146200N = true;
        this.f146208V = z4;
        this.f146209W = false;
    }

    @Override // u93.C34697q0, u93.AbstractC34710x
    /* JADX INFO: renamed from: L0 */
    public final AbstractC34710x mo48177L0(int i13, InterfaceC31135k newOwner, InterfaceC31162w interfaceC31162w, InterfaceC31155s0 interfaceC31155s0, InterfaceC32307i annotations, C35850h c35850h) {
        AbstractC22676k.m65750j(newOwner, "newOwner");
        AbstractC18489d0.m53382w(i13, "kind");
        AbstractC22676k.m65750j(annotations, "annotations");
        return new C29027f(newOwner, (C29027f) interfaceC31162w, i13, this.f146208V);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u93.AbstractC34710x
    /* JADX INFO: renamed from: M0 */
    public final AbstractC34710x mo88262M0(C34708w c34708w) {
        C35850h c35850h;
        C29027f c29027f = (C29027f) super.mo88262M0(c34708w);
        if (c29027f == null) {
            return null;
        }
        List listMo78676v = c29027f.mo78676v();
        AbstractC22676k.m65749i(listMo78676v, "getValueParameters(...)");
        List list = listMo78676v;
        if ((list instanceof Collection) && list.isEmpty()) {
            return c29027f;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC23811y type = ((AbstractC34711x0) ((InterfaceC31107a1) it.next())).getType();
            AbstractC22676k.m65749i(type, "getType(...)");
            if (AbstractC5583n.m16796w(type) != null) {
                List listMo78676v2 = c29027f.mo78676v();
                AbstractC22676k.m65749i(listMo78676v2, "getValueParameters(...)");
                List list2 = listMo78676v2;
                ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    AbstractC23811y type2 = ((AbstractC34711x0) ((InterfaceC31107a1) it3.next())).getType();
                    AbstractC22676k.m65749i(type2, "getType(...)");
                    arrayList.add(AbstractC5583n.m16796w(type2));
                }
                int size = c29027f.mo78676v().size() - arrayList.size();
                boolean z4 = true;
                if (size == 0) {
                    List listMo78676v3 = c29027f.mo78676v();
                    AbstractC22676k.m65749i(listMo78676v3, "getValueParameters(...)");
                    ArrayList<C23465k> arrayListM74107K1 = AbstractC25265s.m74107K1(arrayList, listMo78676v3);
                    if (arrayListM74107K1.isEmpty()) {
                        return c29027f;
                    }
                    for (C23465k c23465k : arrayListM74107K1) {
                        if (!AbstractC22676k.m65745e((C35850h) c23465k.f92937w, ((AbstractC34690n) ((InterfaceC31107a1) c23465k.f92938x)).getName())) {
                        }
                    }
                    return c29027f;
                }
                List listMo78676v4 = c29027f.mo78676v();
                AbstractC22676k.m65749i(listMo78676v4, "getValueParameters(...)");
                List<InterfaceC31107a1> list3 = listMo78676v4;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
                for (InterfaceC31107a1 interfaceC31107a1 : list3) {
                    C35850h name = ((AbstractC34690n) interfaceC31107a1).getName();
                    AbstractC22676k.m65749i(name, "getName(...)");
                    int i13 = ((C34709w0) interfaceC31107a1).f146186G;
                    int i14 = i13 - size;
                    if (i14 >= 0 && (c35850h = (C35850h) arrayList.get(i14)) != null) {
                        name = c35850h;
                    }
                    arrayList2.add(interfaceC31107a1.mo95859o(c29027f, name, i13));
                }
                C34708w c34708wM109631P0 = c29027f.m109631P0(C23758a1.f94121b);
                if (arrayList.isEmpty()) {
                    z4 = false;
                } else {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        if (((C35850h) it4.next()) == null) {
                        }
                    }
                    z4 = false;
                }
                c34708wM109631P0.f146179V = Boolean.valueOf(z4);
                c34708wM109631P0.f146164G = arrayList2;
                c34708wM109631P0.f146162E = c29027f.mo78660a();
                AbstractC34710x abstractC34710xMo88262M0 = super.mo88262M0(c34708wM109631P0);
                AbstractC22676k.m65747g(abstractC34710xMo88262M0);
                return abstractC34710xMo88262M0;
            }
        }
        return c29027f;
    }

    @Override // u93.AbstractC34710x, r93.InterfaceC31168z
    public final boolean isExternal() {
        return false;
    }

    @Override // u93.AbstractC34710x, r93.InterfaceC31162w
    public final boolean isInline() {
        return false;
    }

    @Override // u93.AbstractC34710x, r93.InterfaceC31162w
    /* JADX INFO: renamed from: q */
    public final boolean mo60566q() {
        return false;
    }
}
