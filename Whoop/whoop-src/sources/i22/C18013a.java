package i22;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import g22.C15281a;

/* JADX INFO: renamed from: i22.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C18013a implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f69921E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f69922F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f69923w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15281a f69924x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4351m f69925y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4339a f69926z;

    public /* synthetic */ C18013a(C15281a c15281a, InterfaceC4351m interfaceC4351m, InterfaceC4339a interfaceC4339a, int i13, int i14, int i15) {
        this.f69923w = i15;
        this.f69924x = c15281a;
        this.f69925y = interfaceC4351m;
        this.f69926z = interfaceC4339a;
        this.f69921E = i13;
        this.f69922F = i14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f69923w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC18015c.m51764y(this.f69924x, this.f69925y, this.f69926z, this.f69921E, this.f69922F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC18015c.m51723D(this.f69924x, this.f69925y, this.f69926z, this.f69921E, this.f69922F, (Composer) obj, iIntValue2);
        }
    }
}
