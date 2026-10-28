package p727py0;

import android.view.View;
import androidx.health.platform.client.proto.C1533u;
import c31.EnumC3919c;
import c93.InterfaceC4339a;
import coil.compose.AsyncImagePainter$State$Success;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.ConnectStrapNetworkErrorView;
import l83.C23454a0;
import p715kotlin.jvm.functions.Function1;
import r90.AbstractC31099f;
import rm2.AbstractC31605e;
import ry0.AbstractC31907b;
import s80.AbstractC32255c;
import wo1.AbstractC37464o;
import x11.AbstractC37828b;
import y11.AbstractC39058k;
import zi1.AbstractC40687q;
import zt2.AbstractC41140i;

/* JADX INFO: renamed from: py0.a */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C29616a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f120959w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f120960x;

    public /* synthetic */ C29616a(InterfaceC4339a interfaceC4339a, int i13) {
        this.f120959w = i13;
        this.f120960x = interfaceC4339a;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f120959w) {
            case 0:
                return Function0.m90934q0(this.f120960x, obj);
            case 1:
                return Function0.m90936r0(this.f120960x, obj);
            case 2:
                return Function0.m90902a0(this.f120960x, obj);
            case 3:
                return Function0.m90904b0(this.f120960x, obj);
            case 4:
                return Function0.m90906c0(this.f120960x, obj);
            case 5:
                return Function0.m90908d0(this.f120960x, obj);
            case 6:
                return Function0.m90944v0(this.f120960x, obj);
            case 7:
                return Function0.m90916h0(this.f120960x, obj);
            case 8:
                return Function0.m90918i0(this.f120960x, obj);
            case 9:
                return Function0.m90920j0(this.f120960x, obj);
            case 10:
                return Function0.m90922k0(this.f120960x, obj);
            case 11:
                return Function0.m90946w0(this.f120960x, obj);
            case 12:
                return Function0.m90948x0(this.f120960x, obj);
            case 13:
                return Function0.m90950y0(this.f120960x, obj);
            case 14:
                return Function0.m90894T(this.f120960x, obj);
            case 15:
                return Function0.m90895U(this.f120960x, obj);
            case 16:
                return ConnectStrapNetworkErrorView.m27135c(this.f120960x, (View) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC31099f.m95771A(this.f120960x, ((Boolean) obj).booleanValue());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC31605e.m97582X(this.f120960x, (EnumC3919c) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC31907b.m99202l(this.f120960x, ((Boolean) obj).booleanValue());
            case 20:
                return AbstractC32255c.m100374v(this.f120960x, obj);
            case 21:
                return AbstractC37464o.m120060u(this.f120960x, obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return p744wt1.Function1.m120858E(this.f120960x, (AsyncImagePainter$State$Success) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC37828b.m121368f(this.f120960x, obj);
            case 24:
                this.f120960x.invoke();
                return C23454a0.f92919a;
            case 25:
                return AbstractC39058k.m124525q(this.f120960x, ((Boolean) obj).booleanValue());
            case 26:
                return AbstractC40687q.m132116s(this.f120960x, obj);
            default:
                return AbstractC41140i.m133602n(this.f120960x, obj);
        }
    }
}
