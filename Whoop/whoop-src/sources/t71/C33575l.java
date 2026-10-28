package t71;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;

/* JADX INFO: renamed from: t71.l */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C33575l implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ long f140086E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ long f140087F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f140088G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f140089w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f140090x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f140091y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ TextResource f140092z;

    public /* synthetic */ C33575l(int i13, long j7, TextResource textResource, long j13, long j14, int i14, int i15) {
        this.f140089w = i15;
        this.f140090x = i13;
        this.f140091y = j7;
        this.f140092z = textResource;
        this.f140086E = j13;
        this.f140087F = j14;
        this.f140088G = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f140089w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC33576m.m106048r(this.f140090x, this.f140091y, this.f140092z, this.f140086E, this.f140087F, this.f140088G, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC33576m.m106046p(this.f140090x, this.f140091y, this.f140092z, this.f140086E, this.f140087F, this.f140088G, (Composer) obj, iIntValue2);
        }
    }
}
