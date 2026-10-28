package p114eb;

import ih0.AbstractC18489d0;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: eb.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class C12943b1 extends C12955f1 {

    /* JADX INFO: renamed from: s */
    public final Class f44711s;

    public C12943b1(Class cls) {
        super(0, cls);
        if (cls.isEnum()) {
            this.f44711s = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
    }

    @Override // p114eb.C12955f1, p114eb.AbstractC12958g1
    /* JADX INFO: renamed from: b */
    public final String mo36412b() {
        return this.f44711s.getName();
    }

    @Override // p114eb.C12955f1
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final Enum mo36417g(String value) {
        Object obj;
        AbstractC22676k.m65750j(value, "value");
        Class cls = this.f44711s;
        Object[] enumConstants = cls.getEnumConstants();
        AbstractC22676k.m65749i(enumConstants, "type.enumConstants");
        int length = enumConstants.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i13];
            if (AbstractC39421y.m125921F(((Enum) obj).name(), value, true)) {
                break;
            }
            i13++;
        }
        Enum r10 = (Enum) obj;
        if (r10 != null) {
            return r10;
        }
        StringBuilder sbM53375p = AbstractC18489d0.m53375p("Enum value ", value, " not found for type ");
        sbM53375p.append(cls.getName());
        sbM53375p.append('.');
        throw new IllegalArgumentException(sbM53375p.toString());
    }
}
