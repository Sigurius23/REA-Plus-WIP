package a01;

import androidx.compose.runtime.Composer;
import b21.AbstractC2331d;
import br2.AbstractC3566h;
import c41.AbstractC4013e0;
import c93.InterfaceC4351m;
import gz0.EnumC16313m0;
import hy0.AbstractC17781q1;
import hy0.EnumC17784r1;
import java.util.List;
import jr2.C21905d;
import p077d0.C11421z1;
import p745y81.EnumC39333f;
import q81.AbstractC30049g;
import q81.EnumC30051i;
import vq2.AbstractC36284a;

/* JADX INFO: renamed from: a01.k */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C0091k implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f295E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f296w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f297x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f298y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f299z;

    public /* synthetic */ C0091k(float f13, float f14, Object obj, int i13, int i14) {
        this.f296w = i14;
        this.f297x = f13;
        this.f298y = f14;
        this.f295E = obj;
        this.f299z = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f296w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC0092l.m254l((List) this.f295E, this.f297x, this.f298y, this.f299z, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC2331d.m7182g((C11421z1) this.f295E, this.f297x, this.f298y, this.f299z, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC3566h.m10705q((EnumC39333f) this.f295E, this.f297x, this.f298y, this.f299z, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC4013e0.m12186j(this.f297x, this.f298y, (EnumC16313m0) this.f295E, this.f299z, (Composer) obj, iIntValue4);
            case 4:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC17781q1.m51081i((EnumC17784r1) this.f295E, this.f297x, this.f298y, this.f299z, (Composer) obj, iIntValue5);
            case 5:
                int iIntValue6 = ((Integer) obj2).intValue();
                return AbstractC30049g.m92053v((EnumC30051i) this.f295E, this.f297x, this.f298y, this.f299z, (Composer) obj, iIntValue6);
            default:
                int iIntValue7 = ((Integer) obj2).intValue();
                return AbstractC36284a.m115988e(this.f297x, this.f298y, (C21905d) this.f295E, this.f299z, (Composer) obj, iIntValue7);
        }
    }

    public /* synthetic */ C0091k(Object obj, float f13, float f14, int i13, int i14) {
        this.f296w = i14;
        this.f295E = obj;
        this.f297x = f13;
        this.f298y = f14;
        this.f299z = i13;
    }
}
