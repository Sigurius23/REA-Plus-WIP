package p027b3;

import android.view.View;
import p164g2.C15252x;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: b3.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C2466y extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9616w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f9617x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2466y(int i13, int i14) {
        super(1);
        this.f9616w = i14;
        this.f9617x = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f9616w) {
            case 0:
                return Boolean.valueOf(((C15252x) obj).m43360b1(this.f9617x));
            case 1:
                return Boolean.valueOf(((View) obj).getId() == this.f9617x);
            default:
                return Boolean.valueOf(((C15252x) obj).m43360b1(this.f9617x));
        }
    }
}
