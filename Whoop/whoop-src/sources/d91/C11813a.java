package d91;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import java.util.ArrayList;
import java.util.List;
import kd1.AbstractC22387b0;
import p634y1.C39029b;
import p634y1.InterfaceC39033f;

/* JADX INFO: renamed from: d91.a */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11813a implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f38404w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4351m f38405x;

    public /* synthetic */ C11813a(int i13, InterfaceC4351m interfaceC4351m) {
        this.f38404w = i13;
        this.f38405x = interfaceC4351m;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC39033f interfaceC39033f;
        switch (this.f38404w) {
            case 0:
                return AbstractC11814b.m31674d(this.f38405x, (Composer) obj, ((Integer) obj2).intValue());
            case 1:
                return AbstractC11814b.m31675e(this.f38405x, (Composer) obj, ((Integer) obj2).intValue());
            case 2:
                return AbstractC22387b0.m64388d(this.f38405x, (Composer) obj, ((Integer) obj2).intValue());
            case 3:
                return AbstractC22387b0.m64389e(this.f38405x, (Composer) obj, ((Integer) obj2).intValue());
            default:
                C39029b c39029b = (C39029b) obj;
                List list = (List) this.f38405x.invoke(c39029b, obj2);
                List list2 = list;
                int size = list2.size();
                for (int i13 = 0; i13 < size; i13++) {
                    Object obj3 = list.get(i13);
                    if (obj3 != null && (interfaceC39033f = c39029b.f167993x) != null && !interfaceC39033f.mo7446d(obj3)) {
                        throw new IllegalArgumentException(("item at index " + i13 + " can't be saved: " + obj3).toString());
                    }
                }
                if (list2.isEmpty()) {
                    return null;
                }
                return new ArrayList(list2);
        }
    }
}
