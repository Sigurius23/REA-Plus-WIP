package pa3;

import al.AbstractC0954a;
import p037bu.C3632c;

/* JADX INFO: renamed from: pa3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C29040c extends AbstractC0954a {

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f117530y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C3632c f117531z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29040c(C3632c c3632c, int i13) {
        super(5);
        this.f117530y = i13;
        this.f117531z = c3632c;
    }

    @Override // al.AbstractC0954a
    /* JADX INFO: renamed from: G0 */
    public final void mo2419G0(String[] strArr) {
        switch (this.f117530y) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                }
                ((C29043f) this.f117531z.f14788w).f117545z = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                }
                ((C29043f) this.f117531z.f14788w).f117538E = strArr;
                return;
        }
    }
}
