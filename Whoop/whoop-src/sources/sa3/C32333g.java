package sa3;

import java.util.LinkedList;
import java.util.List;
import l83.C23471q;
import m83.AbstractC25265s;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import qa3.C30155o0;
import qa3.C30157p0;
import qa3.C30161r0;
import qa3.EnumC30153n0;

/* JADX INFO: renamed from: sa3.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C32333g implements InterfaceC32332f {

    /* JADX INFO: renamed from: a */
    public final C30161r0 f133830a;

    /* JADX INFO: renamed from: b */
    public final C30157p0 f133831b;

    public C32333g(C30161r0 strings, C30157p0 qualifiedNames) {
        AbstractC22676k.m65750j(strings, "strings");
        AbstractC22676k.m65750j(qualifiedNames, "qualifiedNames");
        this.f133830a = strings;
        this.f133831b = qualifiedNames;
    }

    @Override // sa3.InterfaceC32332f
    /* JADX INFO: renamed from: a */
    public final boolean mo100630a(int i13) {
        return ((Boolean) m100632c(i13).f92949y).booleanValue();
    }

    @Override // sa3.InterfaceC32332f
    /* JADX INFO: renamed from: b */
    public final String mo100631b(int i13) {
        C23471q c23471qM100632c = m100632c(i13);
        List list = (List) c23471qM100632c.f92947w;
        String strM74110N0 = AbstractC25265s.m74110N0((List) c23471qM100632c.f92948x, ".", null, null, null, 62);
        if (list.isEmpty()) {
            return strM74110N0;
        }
        return AbstractC25265s.m74110N0(list, "/", null, null, null, 62) + '/' + strM74110N0;
    }

    /* JADX INFO: renamed from: c */
    public final C23471q m100632c(int i13) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z4 = false;
        while (i13 != -1) {
            C30155o0 c30155o0 = (C30155o0) this.f133831b.f123388x.get(i13);
            String str = (String) this.f133830a.f123408x.get(c30155o0.f123381z);
            EnumC30153n0 enumC30153n0 = c30155o0.f123375E;
            AbstractC22676k.m65747g(enumC30153n0);
            int iOrdinal = enumC30153n0.ordinal();
            if (iOrdinal == 0) {
                linkedList2.addFirst(str);
            } else if (iOrdinal == 1) {
                linkedList.addFirst(str);
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                linkedList2.addFirst(str);
                z4 = true;
            }
            i13 = c30155o0.f123380y;
        }
        return new C23471q(linkedList, linkedList2, Boolean.valueOf(z4));
    }

    @Override // sa3.InterfaceC32332f
    public final String getString(int i13) {
        String str = (String) this.f133830a.f123408x.get(i13);
        AbstractC22676k.m65749i(str, "getString(...)");
        return str;
    }
}
