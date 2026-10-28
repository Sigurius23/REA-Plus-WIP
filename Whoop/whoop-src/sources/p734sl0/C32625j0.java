package p734sl0;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.bot.view.AiConversationFragment;
import com.whoop.design.util.TextResource;
import java.util.List;
import kd1.AbstractC22403o;
import p390p1.InterfaceC28670t2;

/* JADX INFO: renamed from: sl0.j0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32625j0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135221w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f135222x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f135223y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f135224z;

    public /* synthetic */ C32625j0(Object obj, Object obj2, Object obj3, int i13) {
        this.f135221w = i13;
        this.f135222x = obj;
        this.f135223y = obj2;
        this.f135224z = obj3;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f135221w) {
            case 0:
                return AiConversationFragment.m18295z0((AiConversationFragment) this.f135222x, (InterfaceC2994c0) this.f135223y, (InterfaceC28670t2) this.f135224z, (List) obj, (AbstractC32662q2) obj2);
            default:
                return AbstractC32621i1.m101864i((InterfaceC4339a) this.f135222x, (AbstractC22403o) this.f135223y, (TextResource) this.f135224z, (Composer) obj, ((Integer) obj2).intValue());
        }
    }
}
