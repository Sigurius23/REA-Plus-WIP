package p700bd1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import i01.AbstractC17843f;
import i01.C17845h;
import p720m91.InterfaceC25312u;
import sg2.AbstractC32465p;
import y01.AbstractC39019b;
import y01.C39020c;
import y11.AbstractC39050c;
import y11.C39053f;

/* JADX INFO: renamed from: bd1.s */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C3101s implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f12143w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f12144x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f12145y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f12146z;

    public /* synthetic */ C3101s(float f13, Object obj, int i13, int i14) {
        this.f12143w = i14;
        this.f12144x = f13;
        this.f12146z = obj;
        this.f12145y = i13;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f12143w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return AbstractC3102t.m8900h(this.f12144x, (String) this.f12146z, this.f12145y, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                return AbstractC17843f.m51284k((C17845h) this.f12146z, this.f12144x, this.f12145y, (Composer) obj, iIntValue2);
            case 2:
                int iIntValue3 = ((Integer) obj2).intValue();
                return AbstractC32465p.m101392m(this.f12144x, (Modifier) this.f12146z, this.f12145y, (Composer) obj, iIntValue3);
            case 3:
                int iIntValue4 = ((Integer) obj2).intValue();
                return AbstractC39019b.m124417i((C39020c) this.f12146z, this.f12144x, this.f12145y, (Composer) obj, iIntValue4);
            default:
                int iIntValue5 = ((Integer) obj2).intValue();
                return AbstractC39050c.m124485n((C39053f) this.f12146z, this.f12144x, this.f12145y, (Composer) obj, iIntValue5);
        }
    }

    public /* synthetic */ C3101s(InterfaceC25312u interfaceC25312u, float f13, int i13, int i14) {
        this.f12143w = i14;
        this.f12146z = interfaceC25312u;
        this.f12144x = f13;
        this.f12145y = i13;
    }
}
