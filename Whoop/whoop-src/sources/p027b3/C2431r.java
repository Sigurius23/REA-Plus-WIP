package p027b3;

import android.content.Context;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import l83.C23454a0;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.InterfaceC28653p1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: b3.r */
/* JADX INFO: loaded from: classes.dex */
public final class C2431r extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: E */
    public static final C2431r f9520E;

    /* JADX INFO: renamed from: F */
    public static final C2431r f9521F;

    /* JADX INFO: renamed from: x */
    public static final C2431r f9522x;

    /* JADX INFO: renamed from: y */
    public static final C2431r f9523y;

    /* JADX INFO: renamed from: z */
    public static final C2431r f9524z;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9525w;

    static {
        int i13 = 1;
        f9522x = new C2431r(i13, 0);
        f9523y = new C2431r(i13, 1);
        f9524z = new C2431r(i13, 2);
        f9520E = new C2431r(i13, 3);
        f9521F = new C2431r(i13, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2431r(int i13, int i14) {
        super(i13);
        this.f9525w = i14;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f9525w) {
            case 0:
                return C23454a0.f92919a;
            case 1:
                return Boolean.FALSE;
            case 2:
                C28596b0 c28596b0 = AndroidCompositionLocals_androidKt.f4975a;
                InterfaceC28653p1 interfaceC28653p1 = (InterfaceC28653p1) obj;
                interfaceC28653p1.getClass();
                AbstractC28683x.m87236D(interfaceC28653p1, c28596b0);
                return ((Context) AbstractC28683x.m87236D(interfaceC28653p1, AndroidCompositionLocals_androidKt.f4976b)).getResources();
            case 3:
                return Boolean.valueOf(AbstractC2417o0.m7413e(obj));
            default:
                return C23454a0.f92919a;
        }
    }
}
