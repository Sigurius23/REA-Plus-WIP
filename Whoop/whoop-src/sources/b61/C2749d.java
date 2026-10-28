package b61;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import java.util.List;
import l83.C23454a0;
import p026b2.InterfaceC2302h;
import p077d0.AbstractC11343d2;
import p077d0.C11409v1;
import p077d0.C11421z1;
import p077d0.InterfaceC11337c0;
import p390p1.AbstractC28683x;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: b61.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2749d implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f10793E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ Object f10794F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ Object f10795G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10796w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f10797x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f10798y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f10799z;

    public /* synthetic */ C2749d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i13, int i14) {
        this.f10796w = i14;
        this.f10798y = obj;
        this.f10799z = obj2;
        this.f10793E = obj3;
        this.f10794F = obj4;
        this.f10795G = obj5;
        this.f10797x = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10796w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC2756k.m7780M((List) this.f10798y, (List) this.f10799z, (InterfaceC2302h) this.f10793E, (C2757l) this.f10794F, (Function1) this.f10795G, this.f10797x, (Composer) obj, iIntValue);
            default:
                ((Integer) obj2).intValue();
                AbstractC11343d2.m30539a((C11421z1) this.f10798y, (C11409v1) this.f10799z, this.f10793E, this.f10794F, (InterfaceC11337c0) this.f10795G, (Composer) obj, AbstractC28683x.m87244L(this.f10797x | 1));
                return C23454a0.f92919a;
        }
    }
}
