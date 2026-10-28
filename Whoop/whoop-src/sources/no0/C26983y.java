package no0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import hy0.C17749h0;

/* JADX INFO: renamed from: no0.y */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C26983y implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f107646E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f107647w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C17749h0 f107648x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ String f107649y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ String f107650z;

    public /* synthetic */ C26983y(C17749h0 c17749h0, String str, String str2, int i13, int i14) {
        this.f107647w = i14;
        this.f107648x = c17749h0;
        this.f107649y = str;
        this.f107650z = str2;
        this.f107646E = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f107647w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC26985z.m80917j(this.f107648x, this.f107649y, this.f107650z, this.f107646E, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC26966p0.m80758o(this.f107648x, this.f107649y, this.f107650z, this.f107646E, (Composer) obj, iIntValue2);
        }
    }
}
