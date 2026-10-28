package pj2;

import com.whoop.stress.view.StressSessionFragment;
import lj2.AbstractC24479e;
import lj2.AbstractC24480f;
import lj2.C24481g;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: pj2.v */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29323v implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f118769w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C24481g f118770x;

    public /* synthetic */ C29323v(C24481g c24481g, int i13) {
        this.f118769w = i13;
        this.f118770x = c24481g;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f118769w) {
            case 0:
                return StressSessionFragment.m26451S(this.f118770x, obj);
            case 1:
                return StressSessionFragment.m26456X(this.f118770x, (AbstractC24479e) obj);
            case 2:
                return StressSessionFragment.m26458Z(this.f118770x, (AbstractC24479e) obj);
            default:
                return StressSessionFragment.m26453U(this.f118770x, (AbstractC24480f) obj);
        }
    }
}
