package rm2;

import c31.EnumC3919c;
import com.whoop.weightlifting.data.domain.WeightliftingExercise;
import p114eb.C12991u0;
import p715kotlin.jvm.functions.Function1;
import uu2.AbstractC35261l;

/* JADX INFO: renamed from: rm2.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C31603c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f130615w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12991u0 f130616x;

    public /* synthetic */ C31603c(C12991u0 c12991u0, int i13) {
        this.f130615w = i13;
        this.f130616x = c12991u0;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f130615w) {
            case 0:
                return AbstractC31605e.m97583Y(this.f130616x, (EnumC3919c) obj);
            default:
                return AbstractC35261l.m111764I(this.f130616x, (WeightliftingExercise) obj);
        }
    }
}
