package lb3;

import mb3.C25389f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: lb3.v0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23806v0 extends AbstractC23804u0 {

    /* JADX INFO: renamed from: a */
    public final EnumC23776g1 f94200a;

    /* JADX INFO: renamed from: b */
    public final AbstractC23811y f94201b;

    public C23806v0(AbstractC23811y abstractC23811y, EnumC23776g1 enumC23776g1) {
        if (enumC23776g1 == null) {
            m69911e(0);
            throw null;
        }
        if (abstractC23811y == null) {
            m69911e(1);
            throw null;
        }
        this.f94200a = enumC23776g1;
        this.f94201b = abstractC23811y;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m69911e(int i13) {
        String str = (i13 == 4 || i13 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 4 || i13 == 5) ? 2 : 3];
        switch (i13) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i13 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i13 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i13 == 3) {
            objArr[2] = "replaceType";
        } else if (i13 != 4 && i13 != 5) {
            if (i13 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String str2 = String.format(str, objArr);
        if (i13 != 4 && i13 != 5) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // lb3.AbstractC23804u0
    /* JADX INFO: renamed from: a */
    public final EnumC23776g1 mo69867a() {
        EnumC23776g1 enumC23776g1 = this.f94200a;
        if (enumC23776g1 != null) {
            return enumC23776g1;
        }
        m69911e(4);
        throw null;
    }

    @Override // lb3.AbstractC23804u0
    /* JADX INFO: renamed from: b */
    public final AbstractC23811y mo69868b() {
        AbstractC23811y abstractC23811y = this.f94201b;
        if (abstractC23811y != null) {
            return abstractC23811y;
        }
        m69911e(5);
        throw null;
    }

    @Override // lb3.AbstractC23804u0
    /* JADX INFO: renamed from: c */
    public final boolean mo69869c() {
        return false;
    }

    @Override // lb3.AbstractC23804u0
    /* JADX INFO: renamed from: d */
    public final AbstractC23804u0 mo69870d(C25389f c25389f) {
        if (c25389f == null) {
            m69911e(6);
            throw null;
        }
        c25389f.getClass();
        AbstractC23811y type = this.f94201b;
        AbstractC22676k.m65750j(type, "type");
        return new C23806v0(type, this.f94200a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C23806v0(AbstractC23811y abstractC23811y) {
        this(abstractC23811y, EnumC23776g1.INVARIANT);
        if (abstractC23811y != null) {
        } else {
            m69911e(2);
            throw null;
        }
    }
}
