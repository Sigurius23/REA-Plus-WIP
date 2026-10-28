package hh0;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import j72.AbstractC21405j;
import kd1.C22409u;
import l72.AbstractC23408o;
import mt2.AbstractC25944e;
import mt2.C25945f;
import nt2.C27133c;
import ot2.AbstractC28344m;
import p040c0.InterfaceC3747i0;
import p114eb.C12982q;
import p291l0.InterfaceC23004v;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p720m91.InterfaceC25312u;
import y21.AbstractC39162i;

/* JADX INFO: renamed from: hh0.d */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C17284d implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f66442E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f66443F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f66444w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f66445x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f66446y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f66447z;

    public /* synthetic */ C17284d(int i13, Object obj, Object obj2, Object obj3, Object obj4, boolean z4) {
        this.f66444w = i13;
        this.f66446y = obj;
        this.f66447z = obj2;
        this.f66445x = z4;
        this.f66442E = obj3;
        this.f66443F = obj4;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f66444w) {
            case 0:
                int iIntValue = ((Integer) obj3).intValue();
                return AbstractC17286f.m48945l((Modifier) this.f66446y, (C17281a) this.f66447z, this.f66445x, (InterfaceC28601c1) this.f66442E, (C22409u) this.f66443F, (InterfaceC23004v) obj, (Composer) obj2, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj3).intValue();
                return AbstractC23408o.m67840d0((Function1) this.f66446y, (AbstractC21405j) this.f66447z, (Function1) this.f66442E, (Function1) this.f66443F, this.f66445x, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj3).intValue();
                return AbstractC25944e.m76743A((AbstractC28344m) this.f66446y, (C27133c) this.f66447z, this.f66445x, (InterfaceC4339a) this.f66442E, (C25945f) this.f66443F, (C12982q) obj, (Composer) obj2, iIntValue3);
            default:
                int iIntValue4 = ((Integer) obj3).intValue();
                return AbstractC39162i.m124732w((InterfaceC25312u) this.f66446y, (String) this.f66447z, this.f66445x, (Function1) this.f66443F, (InterfaceC28601c1) this.f66442E, (InterfaceC3747i0) obj, (Composer) obj2, iIntValue4);
        }
    }

    public /* synthetic */ C17284d(Function1 function1, AbstractC21405j abstractC21405j, Function1 function2, Function1 function3, boolean z4) {
        this.f66444w = 1;
        this.f66446y = function1;
        this.f66447z = abstractC21405j;
        this.f66442E = function2;
        this.f66443F = function3;
        this.f66445x = z4;
    }

    public /* synthetic */ C17284d(InterfaceC25312u interfaceC25312u, String str, boolean z4, Function1 function1, InterfaceC28601c1 interfaceC28601c1) {
        this.f66444w = 3;
        this.f66446y = interfaceC25312u;
        this.f66447z = str;
        this.f66445x = z4;
        this.f66443F = function1;
        this.f66442E = interfaceC28601c1;
    }
}
