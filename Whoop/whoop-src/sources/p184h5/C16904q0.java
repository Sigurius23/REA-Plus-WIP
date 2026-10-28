package p184h5;

import android.view.View;
import android.view.ViewGroup;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: h5.q0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16904q0 extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C16904q0 f64862w = new C16904q0(1);

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            return new C16907r0(viewGroup);
        }
        return null;
    }
}
