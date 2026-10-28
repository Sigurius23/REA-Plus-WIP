package pa3;

import al.AbstractC0954a;
import oa3.InterfaceC27771n;

/* JADX INFO: renamed from: pa3.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C29042e extends AbstractC0954a {

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f117534y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC27771n f117535z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29042e(InterfaceC27771n interfaceC27771n, int i13) {
        super(5);
        this.f117534y = i13;
        this.f117535z = interfaceC27771n;
    }

    @Override // al.AbstractC0954a
    /* JADX INFO: renamed from: G0 */
    public final void mo2419G0(String[] strArr) {
        switch (this.f117534y) {
            case 0:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
                }
                ((C29041d) this.f117535z).f117533x.f117545z = strArr;
                return;
            case 1:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
                }
                ((C29041d) this.f117535z).f117533x.f117538E = strArr;
                return;
            default:
                if (strArr == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
                }
                ((C29041d) this.f117535z).f117533x.f117541H = strArr;
                return;
        }
    }
}
