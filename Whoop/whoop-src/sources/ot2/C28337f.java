package ot2;

import com.whoop.design.models.items.HorizontalStatModel;
import jb1.C21536b;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: ot2.f */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C28337f implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f114282w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ HorizontalStatModel f114283x;

    public /* synthetic */ C28337f(HorizontalStatModel horizontalStatModel, int i13) {
        this.f114282w = i13;
        this.f114283x = horizontalStatModel;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f114282w) {
            case 0:
                return C28338g.m85899g(this.f114283x, (C21536b) obj);
            default:
                return C28339h.m85917f(this.f114283x, (C21536b) obj);
        }
    }
}
