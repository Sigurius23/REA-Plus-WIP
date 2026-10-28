package ky0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import hy0.AbstractC17755i2;
import hy0.EnumC17744g;
import p291l0.InterfaceC22997s1;

/* JADX INFO: renamed from: ky0.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22889a implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f90380E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90381w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f90382x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f90383y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f90384z;

    public /* synthetic */ C22889a(long j7, TextResource textResource, TextResource textResource2, int i13, int i14) {
        this.f90381w = i14;
        this.f90382x = j7;
        this.f90383y = textResource;
        this.f90384z = textResource2;
        this.f90380E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f90381w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC22890b.m66526f((TextResource) this.f90383y, (TextResource) this.f90384z, this.f90382x, this.f90380E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC22890b.m66528h(this.f90382x, (TextResource) this.f90383y, (TextResource) this.f90384z, this.f90380E, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC22890b.m66529i(this.f90382x, (TextResource) this.f90383y, (TextResource) this.f90384z, this.f90380E, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC17755i2.m50937i((InterfaceC22997s1) this.f90383y, (EnumC17744g) this.f90384z, this.f90382x, this.f90380E, (Composer) obj, iIntValue4);
        }
    }

    public /* synthetic */ C22889a(Object obj, Object obj2, long j7, int i13, int i14) {
        this.f90381w = i14;
        this.f90383y = obj;
        this.f90384z = obj2;
        this.f90382x = j7;
        this.f90380E = i13;
    }
}
