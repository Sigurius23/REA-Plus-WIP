package cm2;

import com.whoop.trends.data.model.MeasurementBox;
import p715kotlin.jvm.functions.Function1;
import p716lb1.C23749z0;

/* JADX INFO: renamed from: cm2.u */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C4833u implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f19891w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C4834v f19892x;

    public /* synthetic */ C4833u(C4834v c4834v, int i13) {
        this.f19891w = i13;
        this.f19892x = c4834v;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19891w) {
            case 0:
                return C4834v.m15292z(this.f19892x, (C23749z0) obj);
            default:
                return C4834v.m15269A(this.f19892x, (MeasurementBox) obj);
        }
    }
}
