package gi0;

import com.whoop.analytics.strain.model.HeartRateTimestamp;
import java.util.List;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: gi0.h */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C15889h implements ToLongFunction {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60010a;

    public /* synthetic */ C15889h(int i13) {
        this.f60010a = i13;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        switch (this.f60010a) {
            case 0:
                return AbstractC15890i.m44824d((List) obj);
            default:
                return ((HeartRateTimestamp) obj).getTime();
        }
    }
}
