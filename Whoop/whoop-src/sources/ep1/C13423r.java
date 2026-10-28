package ep1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;
import jp1.AbstractC21865q;

/* JADX INFO: renamed from: ep1.r */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C13423r implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ TextResource f47011E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC4339a f47012F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC4339a f47013G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int f47014H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f47015I;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f47016w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TextResource f47017x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ TextResource f47018y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f47019z;

    public /* synthetic */ C13423r(TextResource textResource, TextResource textResource2, int i13, TextResource textResource3, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, int i14, int i15, int i16) {
        this.f47016w = i16;
        this.f47017x = textResource;
        this.f47018y = textResource2;
        this.f47019z = i13;
        this.f47011E = textResource3;
        this.f47012F = interfaceC4339a;
        this.f47013G = interfaceC4339a2;
        this.f47014H = i14;
        this.f47015I = i15;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f47016w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC13424s.m38066i(this.f47017x, this.f47018y, this.f47019z, this.f47011E, this.f47012F, this.f47013G, this.f47014H, this.f47015I, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC21865q.m61953i(this.f47017x, this.f47018y, this.f47019z, this.f47011E, this.f47012F, this.f47013G, this.f47014H, this.f47015I, (Composer) obj, iIntValue2);
        }
    }
}
