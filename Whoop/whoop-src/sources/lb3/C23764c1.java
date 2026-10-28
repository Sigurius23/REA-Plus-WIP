package lb3;

import mb3.C25389f;

/* JADX INFO: renamed from: lb3.c1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23764c1 extends AbstractC23787m {

    /* JADX INFO: renamed from: x */
    public final String f94130x;

    public C23764c1(String str) {
        this.f94130x = str;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m69828z0(int i13) {
        String str = (i13 == 1 || i13 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i13 == 1 || i13 == 4) ? 2 : 3];
        if (i13 == 1) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        } else if (i13 == 2) {
            objArr[0] = "delegate";
        } else if (i13 == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i13 != 4) {
            objArr[0] = "newAttributes";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        }
        if (i13 == 1) {
            objArr[1] = "toString";
        } else if (i13 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
        } else {
            objArr[1] = "refine";
        }
        if (i13 != 1) {
            if (i13 == 2) {
                objArr[2] = "replaceDelegate";
            } else if (i13 == 3) {
                objArr[2] = "refine";
            } else if (i13 != 4) {
                objArr[2] = "replaceAttributes";
            }
        }
        String str2 = String.format(str, objArr);
        if (i13 != 1 && i13 != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    @Override // lb3.AbstractC23787m, lb3.AbstractC23811y
    /* JADX INFO: renamed from: m0 */
    public final AbstractC23811y mo64126s0(C25389f c25389f) {
        if (c25389f != null) {
            return this;
        }
        m69828z0(3);
        throw null;
    }

    @Override // lb3.AbstractC23763c0, lb3.AbstractC23773f1
    /* JADX INFO: renamed from: r0 */
    public final /* bridge */ /* synthetic */ AbstractC23773f1 mo64125r0(boolean z4) {
        mo64125r0(z4);
        throw null;
    }

    @Override // lb3.AbstractC23787m, lb3.AbstractC23773f1
    /* JADX INFO: renamed from: s0 */
    public final AbstractC23773f1 mo64124m0(C25389f c25389f) {
        if (c25389f != null) {
            return this;
        }
        m69828z0(3);
        throw null;
    }

    @Override // lb3.AbstractC23763c0, lb3.AbstractC23773f1
    /* JADX INFO: renamed from: t0 */
    public final /* bridge */ /* synthetic */ AbstractC23773f1 mo64127t0(C23784k0 c23784k0) {
        mo64127t0(c23784k0);
        throw null;
    }

    @Override // lb3.AbstractC23763c0
    public final String toString() {
        String str = this.f94130x;
        if (str != null) {
            return str;
        }
        m69828z0(1);
        throw null;
    }

    @Override // lb3.AbstractC23763c0
    /* JADX INFO: renamed from: u0 */
    public final AbstractC23763c0 mo64125r0(boolean z4) {
        throw new IllegalStateException(this.f94130x);
    }

    @Override // lb3.AbstractC23763c0
    /* JADX INFO: renamed from: v0 */
    public final AbstractC23763c0 mo64127t0(C23784k0 c23784k0) {
        if (c23784k0 != null) {
            throw new IllegalStateException(this.f94130x);
        }
        m69828z0(0);
        throw null;
    }

    @Override // lb3.AbstractC23787m
    /* JADX INFO: renamed from: w0 */
    public final AbstractC23763c0 mo69810w0() {
        throw new IllegalStateException(this.f94130x);
    }

    @Override // lb3.AbstractC23787m
    /* JADX INFO: renamed from: x0 */
    public final AbstractC23763c0 mo64124m0(C25389f c25389f) {
        if (c25389f != null) {
            return this;
        }
        m69828z0(3);
        throw null;
    }

    @Override // lb3.AbstractC23787m
    /* JADX INFO: renamed from: y0 */
    public final AbstractC23787m mo69812y0(AbstractC23763c0 abstractC23763c0) {
        throw new IllegalStateException(this.f94130x);
    }
}
