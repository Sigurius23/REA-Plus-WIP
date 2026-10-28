package bm0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ln1.AbstractC24540r;
import q11.AbstractC29798h;

/* JADX INFO: renamed from: bm0.j */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C3407j implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f13281E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13282w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f13283x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f13284y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f13285z;

    public /* synthetic */ C3407j(int i13, int i14, int i15, InterfaceC4339a interfaceC4339a, String str) {
        this.f13282w = i15;
        this.f13283x = str;
        this.f13284y = interfaceC4339a;
        this.f13285z = i13;
        this.f13281E = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13282w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC3409l.m9807n(this.f13283x, this.f13284y, this.f13285z, this.f13281E, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC24540r.m71558k(this.f13283x, this.f13284y, this.f13285z, this.f13281E, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC29798h.m91287v(this.f13283x, this.f13284y, this.f13285z, this.f13281E, (Composer) obj, iIntValue3);
        }
    }
}
