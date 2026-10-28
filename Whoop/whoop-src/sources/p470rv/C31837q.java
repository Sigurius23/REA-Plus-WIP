package p470rv;

import android.animation.ValueAnimator;
import com.mapbox.geojson.Point;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: rv.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C31837q extends AbstractC22680m implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f131898w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C31838r f131899x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C31837q(C31838r c31838r, int i13) {
        super(1);
        this.f131898w = i13;
        this.f131899x = c31838r;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f131898w) {
            case 0:
                this.f131899x.f131911l = ((Number) obj).doubleValue();
                break;
            case 1:
                this.f131899x.f131908i = ((Number) obj).doubleValue();
                break;
            case 2:
                Point it = (Point) obj;
                AbstractC22676k.m65750j(it, "it");
                this.f131899x.f131906g = it;
                break;
            default:
                ValueAnimator animateToBearing = (ValueAnimator) obj;
                AbstractC22676k.m65750j(animateToBearing, "$this$animateToBearing");
                animateToBearing.setDuration(0L);
                animateToBearing.addListener(this.f131899x.f131910k);
                break;
        }
        return C23454a0.f92919a;
    }
}
