package p714k80;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import kz2.AbstractC22924a;
import zi1.AbstractC40676f0;
import zq2.AbstractC40992e;

/* JADX INFO: renamed from: k80.l */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C22283l implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f86958E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f86959w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f86960x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ TextResource f86961y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f86962z;

    public /* synthetic */ C22283l(int i13, int i14, InterfaceC4339a interfaceC4339a, TextResource textResource) {
        this.f86959w = 1;
        this.f86960x = i13;
        this.f86961y = textResource;
        this.f86962z = interfaceC4339a;
        this.f86958E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f86959w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                int i13 = this.f86960x;
                return AbstractC22284m.m64019g(this.f86961y, this.f86962z, i13, this.f86958E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC22924a.m66659e(this.f86960x, this.f86961y, this.f86962z, this.f86958E, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                int i14 = this.f86960x;
                return AbstractC40676f0.m132046g(this.f86961y, this.f86962z, i14, this.f86958E, (Composer) obj, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj2).intValue();
                int i15 = this.f86960x;
                return AbstractC40992e.m133113f(this.f86961y, this.f86962z, i15, this.f86958E, (Composer) obj, iIntValue4);
        }
    }

    public /* synthetic */ C22283l(TextResource textResource, InterfaceC4339a interfaceC4339a, int i13, int i14, int i15) {
        this.f86959w = i15;
        this.f86961y = textResource;
        this.f86962z = interfaceC4339a;
        this.f86960x = i13;
        this.f86958E = i14;
    }
}
