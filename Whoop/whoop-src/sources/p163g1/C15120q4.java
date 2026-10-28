package p163g1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p292l1.AbstractC23112i3;
import p390p1.AbstractC28683x;
import p479s4.AbstractC32126g;

/* JADX INFO: renamed from: g1.q4 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15120q4 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ long f56639E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ int f56640F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56641w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Modifier f56642x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f56643y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f56644z;

    public /* synthetic */ C15120q4(float f13, int i13, int i14, long j7, long j13, Modifier modifier) {
        this.f56641w = 2;
        this.f56642x = modifier;
        this.f56643y = j7;
        this.f56644z = f13;
        this.f56639E = j13;
        this.f56640F = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56641w) {
            case 0:
                ((Integer) obj2).getClass();
                int iM87244L = AbstractC28683x.m87244L(this.f56640F | 1);
                AbstractC15170v4.m43204d(this.f56644z, iM87244L, this.f56643y, this.f56639E, (Composer) obj, this.f56642x);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM87244L2 = AbstractC28683x.m87244L(this.f56640F | 1);
                AbstractC15170v4.m43201a(this.f56644z, iM87244L2, this.f56643y, this.f56639E, (Composer) obj, this.f56642x);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM87244L3 = AbstractC28683x.m87244L(391);
                AbstractC23112i3.m67091b(this.f56644z, this.f56640F, iM87244L3, this.f56643y, this.f56639E, (Composer) obj, this.f56642x);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM87244L4 = AbstractC28683x.m87244L(this.f56640F | 1);
                AbstractC32126g.m100036a(this.f56644z, iM87244L4, this.f56643y, this.f56639E, (Composer) obj, this.f56642x);
                break;
        }
        return C23454a0.f92919a;
    }

    public /* synthetic */ C15120q4(float f13, Modifier modifier, long j7, long j13, int i13) {
        this.f56641w = 0;
        this.f56644z = f13;
        this.f56642x = modifier;
        this.f56643y = j7;
        this.f56639E = j13;
        this.f56640F = i13;
    }

    public /* synthetic */ C15120q4(Modifier modifier, long j7, float f13, long j13, int i13, int i14, byte b) {
        this.f56641w = i14;
        this.f56642x = modifier;
        this.f56643y = j7;
        this.f56644z = f13;
        this.f56639E = j13;
        this.f56640F = i13;
    }
}
