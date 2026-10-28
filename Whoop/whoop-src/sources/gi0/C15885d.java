package gi0;

import com.whoop.analytics.strain.model.HeartRateTimestamp;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: renamed from: gi0.d */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C15885d implements Function {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60005a;

    public /* synthetic */ C15885d(int i13) {
        this.f60005a = i13;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f60005a) {
            case 0:
                return AbstractC15887f.m44815p((List) obj);
            case 1:
                return AbstractC15887f.m44816q((HeartRateTimestamp) obj);
            case 2:
                return AbstractC15887f.m44817r((HeartRateTimestamp) obj);
            case 3:
                return Long.valueOf(((HeartRateTimestamp) obj).getTime());
            case 4:
                return Double.valueOf(((HeartRateTimestamp) obj).getHeartRate());
            default:
                return AbstractC15887f.m44818s((Double) obj);
        }
    }
}
