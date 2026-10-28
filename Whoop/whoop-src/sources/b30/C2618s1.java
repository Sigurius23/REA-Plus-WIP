package b30;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.C17919x;
import p331n2.AbstractC26165a;
import p390p1.C28655q;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: b30.s1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2618s1 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10196w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f10197x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f10198y;

    public C2618s1(int i13, long j7, boolean z4) {
        this.f10196w = i13;
        this.f10197x = z4;
        this.f10198y = j7;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f  */
    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        long jM51541c;
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C28655q c28655q = (C28655q) composer;
            if (c28655q.m87121F()) {
                c28655q.m87138X();
            } else {
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
                AbstractC26165a abstractC26165aM88500I = AbstractC29125c.m88500I(this.f10196w, composer, 0);
                if (this.f10197x) {
                    jM51541c = C17919x.m51541c(0.6f, this.f10198y);
                } else {
                    jM51541c = C17919x.f69637n;
                }
                AbstractC15005f3.m43107a(abstractC26165aM88500I, null, modifierM3407d, jM51541c, composer, 432, 0);
            }
        } else {
            Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, C2314t.f9131w);
            AbstractC26165a abstractC26165aM88500I2 = AbstractC29125c.m88500I(this.f10196w, composer, 0);
            if (this.f10197x) {
                jM51541c = C17919x.m51541c(0.6f, this.f10198y);
            } else {
                jM51541c = C17919x.f69637n;
            }
            AbstractC15005f3.m43107a(abstractC26165aM88500I2, null, modifierM3407d2, jM51541c, composer, 432, 0);
        }
        return C23454a0.f92919a;
    }
}
