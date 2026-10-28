package kz2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.TextResource;

/* JADX INFO: renamed from: kz2.b */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C22925b implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ TextResource f90491E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ TextResource f90492F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ TextResource f90493G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ boolean f90494H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ int f90495I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ int f90496J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f90497w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f90498x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ TextResource f90499y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f90500z;

    public /* synthetic */ C22925b(InterfaceC4339a interfaceC4339a, TextResource textResource, InterfaceC4339a interfaceC4339a2, TextResource textResource2, TextResource textResource3, TextResource textResource4, boolean z4, int i13, int i14) {
        this.f90498x = interfaceC4339a;
        this.f90499y = textResource;
        this.f90500z = interfaceC4339a2;
        this.f90491E = textResource2;
        this.f90492F = textResource3;
        this.f90493G = textResource4;
        this.f90494H = z4;
        this.f90495I = i13;
        this.f90496J = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f90497w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                InterfaceC4339a interfaceC4339a = this.f90498x;
                TextResource textResource = this.f90499y;
                InterfaceC4339a interfaceC4339a2 = this.f90500z;
                return AbstractC22926c.m66661B(textResource, this.f90491E, this.f90492F, interfaceC4339a, this.f90493G, interfaceC4339a2, this.f90494H, this.f90495I, this.f90496J, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC22926c.m66678q(this.f90498x, this.f90499y, this.f90500z, this.f90491E, this.f90492F, this.f90493G, this.f90494H, this.f90495I, this.f90496J, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C22925b(TextResource textResource, TextResource textResource2, TextResource textResource3, InterfaceC4339a interfaceC4339a, TextResource textResource4, InterfaceC4339a interfaceC4339a2, boolean z4, int i13, int i14) {
        this.f90499y = textResource;
        this.f90491E = textResource2;
        this.f90492F = textResource3;
        this.f90498x = interfaceC4339a;
        this.f90493G = textResource4;
        this.f90500z = interfaceC4339a2;
        this.f90494H = z4;
        this.f90495I = i13;
        this.f90496J = i14;
    }
}
