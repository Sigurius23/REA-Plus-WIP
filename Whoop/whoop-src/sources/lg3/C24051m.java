package lg3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ng3.InterfaceC26700m;
import p012ab.C0682h0;

/* JADX INFO: renamed from: lg3.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C24051m implements InterfaceC24044f {

    /* JADX INFO: renamed from: w */
    public final InterfaceC26700m f95049w;

    /* JADX INFO: renamed from: x */
    public final C24041c f95050x;

    /* JADX INFO: renamed from: y */
    public volatile C24047i f95051y;

    public C24051m(InterfaceC26700m interfaceC26700m, C24041c c24041c) {
        this.f95049w = interfaceC26700m;
        this.f95050x = c24041c;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // lg3.InterfaceC24044f
    /* JADX INFO: renamed from: a */
    public final int mo70946a(C24055q c24055q, CharSequence charSequence, int i13) {
        C24055q c24055q2;
        CharSequence charSequence2;
        int i14;
        int length = charSequence.length();
        if (i13 < 0 || i13 > length) {
            throw new IndexOutOfBoundsException();
        }
        List list = (List) ((HashMap) this.f95050x.f95025a.f36754y).get(c24055q.f95069c ? EnumC24061w.f95083w : null);
        Iterator it = list != null ? list.iterator() : null;
        if (it != null) {
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                C24055q c24055q3 = c24055q;
                CharSequence charSequence3 = charSequence;
                int i15 = i13;
                if (c24055q3.m70975l(str, 0, charSequence3, i15, str.length())) {
                    return c24055q3.m70974k(this.f95049w, ((Long) entry.getValue()).longValue(), i15, str.length() + i15);
                }
                c24055q = c24055q3;
                charSequence = charSequence3;
                i13 = i15;
            }
            c24055q2 = c24055q;
            charSequence2 = charSequence;
            i14 = i13;
            if (c24055q2.f95069c) {
                return ~i14;
            }
        } else {
            c24055q2 = c24055q;
            charSequence2 = charSequence;
            i14 = i13;
        }
        if (this.f95051y == null) {
            this.f95051y = new C24047i(this.f95049w, 1, 19, 1);
        }
        return this.f95051y.mo70946a(c24055q2, charSequence2, i14);
    }

    @Override // lg3.InterfaceC24044f
    /* JADX INFO: renamed from: b */
    public final boolean mo70947b(C0682h0 c0682h0, StringBuilder sb4) {
        Long lM1703r = c0682h0.m1703r(this.f95049w);
        if (lM1703r == null) {
            return false;
        }
        Map map = (Map) ((Map) this.f95050x.f95025a.f36753x).get(EnumC24061w.f95083w);
        String str = map != null ? (String) map.get(lM1703r) : null;
        if (str != null) {
            sb4.append(str);
            return true;
        }
        if (this.f95051y == null) {
            this.f95051y = new C24047i(this.f95049w, 1, 19, 1);
        }
        return this.f95051y.mo70947b(c0682h0, sb4);
    }

    public final String toString() {
        return "Text(" + this.f95049w + ")";
    }
}
