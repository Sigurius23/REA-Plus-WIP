package o71;

import com.whoop.domain.model.UnitSystem;
import com.whoop.domain.model.UnitSystemExtKt;
import d21.C11503a;
import p715kotlin.Metadata;

/* JADX INFO: renamed from: o71.g */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m65681d2 = {"", "Lcom/whoop/domain/model/UnitSystem;", "unit", "c", "(ILcom/whoop/domain/model/UnitSystem;)I", "d", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC27637g {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final int m83446c(int i13, UnitSystem unitSystem) {
        return UnitSystemExtKt.isImperial(unitSystem) ? C11503a.f37005a.m30912a(i13) : i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final int m83447d(int i13, UnitSystem unitSystem) {
        return UnitSystemExtKt.isImperial(unitSystem) ? i13 : C11503a.f37005a.m30927p(i13);
    }
}
