package sv2;

import androidx.compose.runtime.Composer;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import p163g1.C15199y3;
import p715kotlin.jvm.functions.Function1;
import rv2.InterfaceC31850h;

/* JADX INFO: renamed from: sv2.d */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C33041d implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C15199y3 f137616E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f137617F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f137618w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC31850h.b f137619x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f137620y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC2994c0 f137621z;

    public /* synthetic */ C33041d(InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, InterfaceC31850h.b bVar, Function1 function1, int i13) {
        this.f137621z = interfaceC2994c0;
        this.f137616E = c15199y3;
        this.f137619x = bVar;
        this.f137620y = function1;
        this.f137617F = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f137618w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC33042e.m104541r0(this.f137621z, this.f137616E, this.f137619x, this.f137620y, this.f137617F, (Composer) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                InterfaceC2994c0 interfaceC2994c0 = this.f137621z;
                C15199y3 c15199y3 = this.f137616E;
                return AbstractC33042e.m104535p0(this.f137619x, this.f137620y, interfaceC2994c0, c15199y3, this.f137617F, (Composer) obj, iIntValue2);
        }
    }

    public /* synthetic */ C33041d(InterfaceC31850h.b bVar, Function1 function1, InterfaceC2994c0 interfaceC2994c0, C15199y3 c15199y3, int i13) {
        this.f137619x = bVar;
        this.f137620y = function1;
        this.f137621z = interfaceC2994c0;
        this.f137616E = c15199y3;
        this.f137617F = i13;
    }
}
