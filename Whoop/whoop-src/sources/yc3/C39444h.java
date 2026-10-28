package yc3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.internal.CachedNames;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptorKt;
import l83.C23465k;
import l83.C23470p;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import m83.C25239c0;
import m83.C25241d0;
import m83.C25262p;
import m83.C25263q;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: yc3.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C39444h implements InterfaceC39443g, CachedNames {

    /* JADX INFO: renamed from: a */
    public final String f169699a;

    /* JADX INFO: renamed from: b */
    public final AbstractC39447k f169700b;

    /* JADX INFO: renamed from: c */
    public final int f169701c;

    /* JADX INFO: renamed from: d */
    public final List f169702d;

    /* JADX INFO: renamed from: e */
    public final HashSet f169703e;

    /* JADX INFO: renamed from: f */
    public final String[] f169704f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC39443g[] f169705g;

    /* JADX INFO: renamed from: h */
    public final List[] f169706h;

    /* JADX INFO: renamed from: i */
    public final boolean[] f169707i;

    /* JADX INFO: renamed from: j */
    public final Map f169708j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC39443g[] f169709k;

    /* JADX INFO: renamed from: l */
    public final C23470p f169710l;

    public C39444h(String serialName, AbstractC39447k abstractC39447k, int i13, List list, C39437a c39437a) {
        AbstractC22676k.m65750j(serialName, "serialName");
        this.f169699a = serialName;
        this.f169700b = abstractC39447k;
        this.f169701c = i13;
        this.f169702d = c39437a.f169679b;
        ArrayList arrayList = c39437a.f169680c;
        AbstractC22676k.m65750j(arrayList, "<this>");
        HashSet hashSet = new HashSet(AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(arrayList, 12)));
        AbstractC25265s.m74087A1(arrayList, hashSet);
        this.f169703e = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f169704f = strArr;
        this.f169705g = Platform_commonKt.compactArray(c39437a.f169682e);
        this.f169706h = (List[]) c39437a.f169683f.toArray(new List[0]);
        this.f169707i = AbstractC25265s.m74160y1(c39437a.f169684g);
        AbstractC22676k.m65750j(strArr, "<this>");
        C25263q c25263q = new C25263q(new C25262p(strArr, 0), 1);
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(c25263q, 10));
        Iterator it = c25263q.iterator();
        while (true) {
            C25241d0 c25241d0 = (C25241d0) it;
            if (!c25241d0.f99123x.hasNext()) {
                this.f169708j = AbstractC25247g0.m74000i0(arrayList2);
                this.f169709k = Platform_commonKt.compactArray(list);
                this.f169710l = AbstractC30060g.m92088H(new C25262p(this, 27));
                return;
            }
            C25239c0 c25239c0 = (C25239c0) c25241d0.next();
            arrayList2.add(new C23465k(c25239c0.f99118b, Integer.valueOf(c25239c0.f99117a)));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C39444h) {
            InterfaceC39443g interfaceC39443g = (InterfaceC39443g) obj;
            if (AbstractC22676k.m65745e(this.f169699a, interfaceC39443g.getSerialName()) && Arrays.equals(this.f169709k, ((C39444h) obj).f169709k)) {
                int elementsCount = interfaceC39443g.getElementsCount();
                int i13 = this.f169701c;
                if (i13 == elementsCount) {
                    for (int i14 = 0; i14 < i13; i14++) {
                        InterfaceC39443g[] interfaceC39443gArr = this.f169705g;
                        if (AbstractC22676k.m65745e(interfaceC39443gArr[i14].getSerialName(), interfaceC39443g.getElementDescriptor(i14).getSerialName()) && AbstractC22676k.m65745e(interfaceC39443gArr[i14].getKind(), interfaceC39443g.getElementDescriptor(i14).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // yc3.InterfaceC39443g
    public final List getAnnotations() {
        return this.f169702d;
    }

    @Override // yc3.InterfaceC39443g
    public final List getElementAnnotations(int i13) {
        return this.f169706h[i13];
    }

    @Override // yc3.InterfaceC39443g
    public final InterfaceC39443g getElementDescriptor(int i13) {
        return this.f169705g[i13];
    }

    @Override // yc3.InterfaceC39443g
    public final int getElementIndex(String name) {
        AbstractC22676k.m65750j(name, "name");
        Integer num = (Integer) this.f169708j.get(name);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // yc3.InterfaceC39443g
    public final String getElementName(int i13) {
        return this.f169704f[i13];
    }

    @Override // yc3.InterfaceC39443g
    public final int getElementsCount() {
        return this.f169701c;
    }

    @Override // yc3.InterfaceC39443g
    public final AbstractC39447k getKind() {
        return this.f169700b;
    }

    @Override // yc3.InterfaceC39443g
    public final String getSerialName() {
        return this.f169699a;
    }

    @Override // kotlinx.serialization.internal.CachedNames
    public final Set getSerialNames() {
        return this.f169703e;
    }

    public final int hashCode() {
        return ((Number) this.f169710l.getValue()).intValue();
    }

    @Override // yc3.InterfaceC39443g
    public final boolean isElementOptional(int i13) {
        return this.f169707i[i13];
    }

    @Override // yc3.InterfaceC39443g
    /* JADX INFO: renamed from: isInline */
    public final boolean getIsInline() {
        return false;
    }

    @Override // yc3.InterfaceC39443g
    public final boolean isNullable() {
        return false;
    }

    public final String toString() {
        return PluginGeneratedSerialDescriptorKt.toStringImpl(this);
    }
}
