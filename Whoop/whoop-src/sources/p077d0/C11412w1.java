package p077d0;

import com.google.android.gms.maps.model.LatLng;
import e93.AbstractC12889b;
import eu.C13612g;
import f11.AbstractC14004d;
import f11.C14005e;
import g23.ViewOnTouchListenerC15285a;
import java.util.List;
import l83.C23454a0;
import p005a3.C0238p0;
import p132f0.C13825t;
import p208i2.InterfaceC17886g0;
import p270k2.C22128b;
import p270k2.InterfaceC22129c;
import p329n0.InterfaceC26064q;
import p390p1.C28625i1;
import p390p1.C28633k1;
import p636y3.C39174f;
import p715kotlin.jvm.functions.Function1;
import w41.AbstractC36811k;
import zq0.AbstractC40965f;

/* JADX INFO: renamed from: d0.w1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C11412w1 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f36606w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f36607x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f36608y;

    public /* synthetic */ C11412w1(float f13, Object obj, int i13) {
        this.f36606w = i13;
        this.f36607x = f13;
        this.f36608y = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f36606w) {
            case 0:
                C11421z1 c11421z1 = (C11421z1) this.f36608y;
                long jLongValue = ((Long) obj).longValue();
                boolean zM30665g = c11421z1.m30665g();
                C28625i1 c28625i1 = c11421z1.f36636g;
                if (!zM30665g) {
                    if (c28625i1.m87032x() == Long.MIN_VALUE) {
                        c28625i1.m87033y(jLongValue);
                        ((C28633k1) c11421z1.f36630a.f3536x).setValue(Boolean.TRUE);
                    }
                    long jM87032x = jLongValue - c28625i1.m87032x();
                    float f13 = this.f36607x;
                    if (f13 != 0.0f) {
                        jM87032x = AbstractC12889b.m36259Y(jM87032x / ((double) f13));
                    }
                    c11421z1.m30672n(jM87032x);
                    c11421z1.m30666h(jM87032x, f13 == 0.0f);
                }
                return C23454a0.f92919a;
            case 1:
                return AbstractC14004d.m39864m((C14005e) this.f36608y, this.f36607x, (InterfaceC26064q) obj);
            case 2:
                C13825t c13825t = (C13825t) this.f36608y;
                C0238p0 c0238p0 = (C0238p0) ((InterfaceC22129c) obj);
                c0238p0.m728a();
                C22128b c22128b = c0238p0.f815w;
                float f14 = this.f36607x;
                if (!C39174f.m124782b(f14, 0.0f)) {
                    float density = c22128b.getDensity() * f14;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L)) - (density / 2);
                    c0238p0.mo727R(c13825t.f49346b, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c22128b.mo731d() >> 32)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))), density, (496 & 32) != 0 ? null : null, (496 & 64) != 0 ? 1.0f : 0.0f);
                }
                return C23454a0.f92919a;
            case 3:
                ViewOnTouchListenerC15285a viewOnTouchListenerC15285a = (ViewOnTouchListenerC15285a) this.f36608y;
                if (this.f36607x != 0.0f) {
                    viewOnTouchListenerC15285a.f57426x.invoke();
                }
                viewOnTouchListenerC15285a.f57425w.animate().setUpdateListener(null);
                return C23454a0.f92919a;
            case 4:
                return AbstractC36811k.m118001o((LatLng) this.f36608y, this.f36607x, (C13612g) obj);
            default:
                return AbstractC40965f.m132950V((List) this.f36608y, this.f36607x, (InterfaceC17886g0) obj);
        }
    }

    public /* synthetic */ C11412w1(Object obj, float f13, int i13) {
        this.f36606w = i13;
        this.f36608y = obj;
        this.f36607x = f13;
    }
}
