package jk2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ik2.C18614b;

/* JADX INFO: renamed from: jk2.b */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C21761b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f83709w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C18614b f83710x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f83711y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f83712z;

    public /* synthetic */ C21761b(C18614b c18614b, InterfaceC4339a interfaceC4339a, int i13, int i14) {
        this.f83709w = i14;
        this.f83710x = c18614b;
        this.f83711y = interfaceC4339a;
        this.f83712z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f83709w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return AbstractC21762c.m61464m(this.f83710x, this.f83711y, this.f83712z, composer, iIntValue);
            case 1:
                return AbstractC21762c.m61466o(this.f83710x, this.f83711y, this.f83712z, composer, iIntValue);
            default:
                return AbstractC21764e.m61486p(this.f83710x, this.f83711y, this.f83712z, composer, iIntValue);
        }
    }
}
