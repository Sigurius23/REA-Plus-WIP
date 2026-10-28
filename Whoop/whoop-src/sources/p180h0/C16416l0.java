package p180h0;

import android.view.View;
import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import h00.C16507i0;
import h11.AbstractC16611f;
import h51.AbstractC16932d;
import ic2.AbstractC18401f;
import j11.AbstractC21204g;
import jp1.AbstractC21855g;
import jp1.AbstractC21865q;
import jr1.AbstractC21896d;
import l72.AbstractC23408o;
import l83.C23454a0;
import mf0.AbstractC25506e;
import no0.AbstractC26958l0;
import nq0.C27041d;
import op0.C28095m;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p727py0.Function0;

/* JADX INFO: renamed from: h0.l0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16416l0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63083w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f63084x;

    public /* synthetic */ C16416l0(InterfaceC4339a interfaceC4339a, int i13) {
        this.f63083w = i13;
        this.f63084x = interfaceC4339a;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f63083w) {
            case 0:
                this.f63084x.invoke();
                return C23454a0.f92919a;
            case 1:
                if (!((Boolean) obj).booleanValue()) {
                    this.f63084x.invoke();
                }
                return C23454a0.f92919a;
            case 2:
                C16507i0 it = (C16507i0) obj;
                AbstractC22676k.m65750j(it, "it");
                this.f63084x.invoke();
                return C23454a0.f92919a;
            case 3:
                this.f63084x.invoke();
                return C23454a0.f92919a;
            case 4:
                return AbstractC16611f.m47156n(this.f63084x, obj);
            case 5:
                return AbstractC16611f.m47154l(this.f63084x, obj);
            case 6:
                return AbstractC16932d.m47662z(this.f63084x, obj);
            case 7:
                return AbstractC18401f.m52938u(this.f63084x, obj);
            case 8:
                return AbstractC18401f.m52940w(this.f63084x, obj);
            case 9:
                return AbstractC21204g.m59458f(this.f63084x, obj);
            case 10:
                return AbstractC21855g.m61883v(this.f63084x, obj);
            case 11:
                return AbstractC21865q.m61952h(this.f63084x, obj);
            case 12:
                return AbstractC21896d.m62214u(this.f63084x, obj);
            case 13:
                this.f63084x.invoke();
                return C23454a0.f92919a;
            case 14:
                this.f63084x.invoke();
                return C23454a0.f92919a;
            case 15:
                ((Float) obj).floatValue();
                return Float.valueOf(((Number) this.f63084x.invoke()).floatValue());
            case 16:
                return AbstractC23408o.m67862o0(this.f63084x, obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC25506e.m74961m0(this.f63084x, obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC26958l0.m80640d0(this.f63084x, obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C27041d.m81157c(this.f63084x, (View) obj);
            case 20:
                return C28095m.m84880g(this.f63084x, (View) obj);
            case 21:
                this.f63084x.invoke();
                return C23454a0.f92919a;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return Function0.m90896V(this.f63084x, obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return Function0.m90897W(this.f63084x, obj);
            case 24:
                return Function0.m90887M(this.f63084x, obj);
            case 25:
                return Function0.m90888N(this.f63084x, obj);
            case 26:
                return Function0.m90889O(this.f63084x, obj);
            case 27:
                return Function0.m90890P(this.f63084x, obj);
            case 28:
                return Function0.m90930o0(this.f63084x, obj);
            default:
                return Function0.m90932p0(this.f63084x, obj);
        }
    }
}
