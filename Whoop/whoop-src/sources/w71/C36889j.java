package w71;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: w71.j */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C36889j implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f157801E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f157802F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Integer f157803G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ TextResource f157804H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Function1 f157805I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ int f157806J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ int f157807K;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f157808w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C36893l f157809x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C36906y f157810y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f157811z;

    public /* synthetic */ C36889j(C36893l c36893l, C36906y c36906y, int i13, int i14, int i15, Integer num, TextResource textResource, Function1 function1, int i16, int i17, int i18) {
        this.f157808w = i18;
        this.f157809x = c36893l;
        this.f157810y = c36906y;
        this.f157811z = i13;
        this.f157801E = i14;
        this.f157802F = i15;
        this.f157803G = num;
        this.f157804H = textResource;
        this.f157805I = function1;
        this.f157806J = i16;
        this.f157807K = i17;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f157808w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return C36893l.m118421k0(this.f157809x, this.f157810y, this.f157811z, this.f157801E, this.f157802F, this.f157803G, this.f157804H, this.f157805I, this.f157806J, this.f157807K, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return C36893l.m118409e0(this.f157809x, this.f157810y, this.f157811z, this.f157801E, this.f157802F, this.f157803G, this.f157804H, this.f157805I, this.f157806J, this.f157807K, (Composer) obj, iIntValue2);
        }
    }
}
