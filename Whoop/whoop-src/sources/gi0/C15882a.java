package gi0;

import com.whoop.analytics.strain.model.HeartRateTimestamp;
import java.util.function.ToDoubleFunction;

/* JADX INFO: renamed from: gi0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C15882a implements ToDoubleFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60003a;

    public /* synthetic */ C15882a(int i13) {
        this.f60003a = i13;
    }

    @Override // java.util.function.ToDoubleFunction
    public final double applyAsDouble(Object obj) {
        switch (this.f60003a) {
            case 0:
                return ((Double) obj).doubleValue();
            case 1:
                return ((HeartRateTimestamp) obj).getHeartRate();
            default:
                return ((Double) obj).doubleValue();
        }
    }
}
