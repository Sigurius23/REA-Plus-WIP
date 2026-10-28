package p114eb;

import android.animation.ValueAnimator;
import c93.InterfaceC4339a;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.threading.AnimationThreadController;
import java.util.ArrayList;
import java.util.HashSet;
import l83.C23454a0;
import p157fv.C14801g;
import p157fv.C14802h;
import p176gv.AbstractC16218d;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: eb.s */
/* JADX INFO: loaded from: classes5.dex */
public final class C12986s extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f44859w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f44860x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f44861y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f44862z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12986s(Object obj, Object obj2, boolean z4, int i13) {
        super(0);
        this.f44859w = i13;
        this.f44861y = obj;
        this.f44862z = obj2;
        this.f44860x = z4;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f44859w) {
            case 0:
                ((C12988t) this.f44861y).m36495e((C12982q) this.f44862z, this.f44860x);
                break;
            default:
                ValueAnimator[] valueAnimatorArr = (ValueAnimator[]) this.f44861y;
                for (ValueAnimator valueAnimator : valueAnimatorArr) {
                    if (!(valueAnimator instanceof AbstractC16218d)) {
                        MapboxLogger.logE("Mbgl-CameraManager", "All animators must be CameraAnimator's to be unregistered!");
                    } else {
                        AnimationThreadController.INSTANCE.postOnAnimatorThread(new C14801g(this.f44860x, (AbstractC16218d) valueAnimator, 0));
                    }
                    break;
                }
                HashSet hashSet = ((C14802h) this.f44862z).f54950w;
                ArrayList arrayList = new ArrayList(valueAnimatorArr.length);
                for (ValueAnimator valueAnimator2 : valueAnimatorArr) {
                    AbstractC22676k.m65748h(valueAnimator2, "null cannot be cast to non-null type com.mapbox.maps.plugin.animation.animator.CameraAnimator<*>");
                    arrayList.add((AbstractC16218d) valueAnimator2);
                }
                hashSet.removeAll(arrayList);
                break;
        }
        return C23454a0.f92919a;
    }
}
