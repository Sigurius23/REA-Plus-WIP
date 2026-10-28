package mb3;

import ge3.AbstractC15751g;
import lb3.AbstractC23773f1;
import lb3.C23785l;
import lb3.C23792o0;
import p048ce.AbstractC4482w;
import p097ds.AbstractC12313p;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: mb3.s */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC25402s {

    /* JADX INFO: renamed from: E */
    public static final /* synthetic */ EnumC25402s[] f99495E;

    /* JADX INFO: renamed from: w */
    public static final C25400q f99496w;

    /* JADX INFO: renamed from: x */
    public static final C25398o f99497x;

    /* JADX INFO: renamed from: y */
    public static final C25401r f99498y;

    /* JADX INFO: renamed from: z */
    public static final C25399p f99499z;

    static {
        C25400q c25400q = new C25400q();
        f99496w = c25400q;
        C25398o c25398o = new C25398o();
        f99497x = c25398o;
        C25401r c25401r = new C25401r();
        f99498y = c25401r;
        C25399p c25399p = new C25399p();
        f99499z = c25399p;
        EnumC25402s[] enumC25402sArr = {c25400q, c25398o, c25401r, c25399p};
        f99495E = enumC25402sArr;
        AbstractC15751g.m44468u(enumC25402sArr);
    }

    /* JADX INFO: renamed from: b */
    public static EnumC25402s m74590b(AbstractC23773f1 abstractC23773f1) {
        AbstractC22676k.m65750j(abstractC23773f1, "<this>");
        if (abstractC23773f1.mo69814k0()) {
            return f99497x;
        }
        if (abstractC23773f1 instanceof C23785l) {
        }
        return AbstractC4482w.m13984U(C25396m.f99492w.m74578p0(), AbstractC12313p.m34261M(abstractC23773f1), C23792o0.f94172b) ? f99499z : f99498y;
    }

    public static EnumC25402s valueOf(String str) {
        return (EnumC25402s) Enum.valueOf(EnumC25402s.class, str);
    }

    public static EnumC25402s[] values() {
        return (EnumC25402s[]) f99495E.clone();
    }

    /* JADX INFO: renamed from: a */
    public abstract EnumC25402s mo74589a(AbstractC23773f1 abstractC23773f1);
}
