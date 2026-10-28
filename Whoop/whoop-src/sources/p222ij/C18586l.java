package p222ij;

import ad3.C0764g;
import java.util.Arrays;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: ij.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C18586l extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: x */
    public static final C18586l f72600x;

    /* JADX INFO: renamed from: y */
    public static final C18586l f72601y;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f72602w;

    static {
        int i13 = 1;
        f72600x = new C18586l(i13, 0);
        f72601y = new C18586l(i13, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18586l(int i13, int i14) {
        super(i13);
        this.f72602w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f72602w) {
            case 0:
                return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
            default:
                C0764g Json = (C0764g) obj;
                AbstractC22676k.m65750j(Json, "$this$Json");
                Json.f2776c = true;
                return C23454a0.f92919a;
        }
    }
}
