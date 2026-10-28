package fa3;

import c93.InterfaceC4339a;
import com.google.crypto.tink.internal.C5101l0;
import ec3.InterfaceC13058l;
import f93.AbstractC14290b;
import hb3.C17115g;
import hb3.C17122k;
import ia3.C18295a;
import ib3.C18344c;
import j93.AbstractC21478l0;
import j93.InterfaceC21461d;
import ja3.C21505d;
import ja3.C21521q;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import jb3.AbstractC21557q;
import jb3.C21558r;
import jb3.C21562v;
import lb3.AbstractC23771f;
import lb3.AbstractC23812y0;
import lb3.C23758a1;
import lb3.C23768e;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import mb3.C25389f;
import mc.AbstractC25406c;
import n83.C26460c;
import nb3.C26555l;
import nb3.EnumC26554k;
import o93.C27739k;
import p002a0.C0057v0;
import p098dt.AbstractC12350b;
import p108e4.C12669c;
import p390p1.C28649o1;
import p390p1.C28656q0;
import p390p1.C28660r0;
import p446r1.C30847a;
import p715kotlin.jvm.internal.AbstractC22660c;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22693x;
import p715kotlin.jvm.internal.InterfaceC22662d;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.C22717t;
import p715kotlin.reflect.jvm.internal.impl.resolve.scopes.InterfaceC22712o;
import pf.AbstractC29125c;
import q93.C30085i;
import q93.C30086j;
import r93.C31153r0;
import va3.C35845c;
import w93.C36969b;
import wb3.AbstractC37056f;
import xa3.C38146g;
import xa3.C38148i;
import xa3.C38151l;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: fa3.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C14328u implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f52298w;

    /* JADX INFO: renamed from: x */
    public final Object f52299x;

    public /* synthetic */ C14328u(Object obj, int i13) {
        this.f52298w = i13;
        this.f52299x = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // c93.InterfaceC4339a
    public final Object invoke() throws IllegalAccessException {
        String str;
        switch (this.f52298w) {
            case 0:
                C14329v c14329v = (C14329v) this.f52299x;
                C26460c c26460cM119000x = AbstractC37056f.m119000x();
                c26460cM119000x.add(c14329v.f52300a.f52231w);
                EnumC14304b0 enumC14304b0 = c14329v.f52301b;
                if (enumC14304b0 != null) {
                    c26460cM119000x.add("under-migration:".concat(enumC14304b0.f52231w));
                }
                for (Map.Entry entry : c14329v.f52302c.entrySet()) {
                    c26460cM119000x.add("@" + entry.getKey() + ':' + ((EnumC14304b0) entry.getValue()).f52231w);
                }
                return (String[]) AbstractC37056f.m118988k(c26460cM119000x).toArray(new String[0]);
            case 1:
                Set setKeySet = ((LinkedHashMap) ((C18344c) this.f52299x).f71440J.f177222E).keySet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : setKeySet) {
                    C35845c c35845c = (C35845c) obj;
                    if (!c35845c.m113778g() && !C17115g.f65723c.contains(c35845c)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C35845c) it.next()).m113777f());
                }
                return arrayList2;
            case 2:
                C21505d c21505d = (C21505d) this.f52299x;
                C21521q c21521q = c21505d.f82483c;
                Collection collectionValues = ((Map) AbstractC29125c.m88494C(c21521q.f82552J, C21521q.f82549N[0])).values();
                ArrayList arrayList3 = new ArrayList();
                Iterator it3 = collectionValues.iterator();
                while (it3.hasNext()) {
                    C21558r c21558rM83860a = ((C18295a) c21505d.f82482b.f177224x).f71226d.m83860a(c21521q, (C36969b) it3.next());
                    if (c21558rM83860a != null) {
                        arrayList3.add(c21558rM83860a);
                    }
                }
                return (InterfaceC22712o[]) AbstractC21478l0.m60410P(arrayList3).toArray(new InterfaceC22712o[0]);
            case 3:
                return (ArrayList) this.f52299x;
            case 4:
                AbstractC21557q abstractC21557q = (AbstractC21557q) this.f52299x;
                Set setMo60574g = abstractC21557q.mo60574g();
                if (setMo60574g == null) {
                    return null;
                }
                return AbstractC12350b.m34556E(AbstractC12350b.m34556E(abstractC21557q.m60587f(), abstractC21557q.f82673c.f82664c.keySet()), setMo60574g);
            case 5:
                C21562v c21562v = (C21562v) this.f52299x;
                C17122k c17122k = c21562v.f82699L;
                return AbstractC25265s.m74093D1(c17122k.f65760a.f65739e.mo16014r(c21562v.f82700M, c17122k.f65761b));
            case 6:
                AbstractC23812y0 abstractC23812y0M69821f = ((C23758a1) this.f52299x).m69821f();
                abstractC23812y0M69821f.getClass();
                return new C23758a1(abstractC23812y0M69821f);
            case 7:
                C22717t c22717t = (C22717t) this.f52299x;
                return c22717t.m65790a(AbstractC12350b.m34599t(c22717t.f89387b, null, 3));
            case 8:
                return new C23768e(((AbstractC23771f) this.f52299x).mo60484a());
            case 9:
                return C26555l.m78682c(EnumC26554k.CANNOT_COMPUTE_ERASED_BOUND, ((C5101l0) this.f52299x).toString());
            case 10:
                return new AbstractC25406c[((InterfaceC13058l[]) this.f52299x).length];
            case 11:
                ArrayList arrayList4 = ((C28649o1) this.f52299x).f115870a;
                C0057v0 c0057v0 = new C0057v0(arrayList4.size());
                int size = arrayList4.size();
                for (int i13 = 0; i13 < size; i13++) {
                    C28660r0 c28660r0 = (C28660r0) arrayList4.get(i13);
                    Object obj2 = c28660r0.f115946b;
                    int i14 = c28660r0.f115945a;
                    C30847a.m94881a(c0057v0, obj2 != null ? new C28656q0(Integer.valueOf(i14), c28660r0.f115946b) : Integer.valueOf(i14), c28660r0);
                }
                return new C30847a(c0057v0);
            case 12:
                C30086j c30086j = (C30086j) this.f52299x;
                C27739k c27739k = c30086j.f122786f;
                if (c27739k == null) {
                    throw new AssertionError("JvmBuiltins instance has not been initialized properly");
                }
                C30085i c30085i = (C30085i) c27739k.invoke();
                c30086j.f122786f = null;
                return c30085i;
            case 13:
                return (InterfaceC22712o) ((C31153r0) this.f52299x).f128367b.invoke(C25389f.f99474a);
            default:
                C38148i c38148i = (C38148i) this.f52299x;
                C38146g c38146g = C38146g.f163314z;
                C38151l c38151l = c38148i.f163321a;
                C38151l c38151l2 = new C38151l();
                Field[] declaredFields = C38151l.class.getDeclaredFields();
                AbstractC22676k.m65749i(declaredFields, "getDeclaredFields(...)");
                int length = declaredFields.length;
                ?? r10 = 0;
                int i15 = 0;
                while (i15 < length) {
                    Field field = declaredFields[i15];
                    if ((field.getModifiers() & 8) == 0) {
                        field.setAccessible(true);
                        Object obj3 = field.get(c38151l);
                        AbstractC14290b abstractC14290b = obj3 instanceof AbstractC14290b ? (AbstractC14290b) obj3 : null;
                        if (abstractC14290b != null) {
                            String name = field.getName();
                            AbstractC22676k.m65749i(name, "getName(...)");
                            AbstractC39421y.m125930O(name, "is", r10);
                            InterfaceC21461d orCreateKotlinClass = AbstractC22671h0.f89337a.getOrCreateKotlinClass(C38151l.class);
                            String name2 = field.getName();
                            StringBuilder sb4 = new StringBuilder("get");
                            String name3 = field.getName();
                            AbstractC22676k.m65749i(name3, "getName(...)");
                            if (name3.length() > 0) {
                                str = name3;
                                char upperCase = Character.toUpperCase(name3.charAt(r10));
                                String strSubstring = name3.substring(1);
                                AbstractC22676k.m65749i(strSubstring, "substring(...)");
                                str = upperCase + strSubstring;
                            }
                            str = name3;
                            sb4.append(str);
                            field.set(c38151l2, new C12669c(abstractC14290b.getValue(c38151l, new C22693x(AbstractC22660c.NO_RECEIVER, ((InterfaceC22662d) orCreateKotlinClass).getJClass(), name2, sb4.toString(), !Objects.nonNull(orCreateKotlinClass) ? 1 : 0)), c38151l2));
                        }
                    }
                    i15++;
                    r10 = 0;
                }
                c38146g.invoke(c38151l2);
                c38151l2.f163366a = true;
                return new C38148i(c38151l2);
        }
    }
}
