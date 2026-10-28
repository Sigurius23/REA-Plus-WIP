package aq0;

import android.view.View;
import androidx.health.platform.client.proto.C1533u;
import io.getstream.chat.android.p226ui.common.state.messages.MessageMode;
import iq0.C20839r;
import l83.C23465k;
import p715kotlin.jvm.functions.Function1;
import zp0.C40939a;

/* JADX INFO: renamed from: aq0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C1890a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7438w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C1906q f7439x;

    public /* synthetic */ C1890a(C1906q c1906q, int i13) {
        this.f7438w = i13;
        this.f7439x = c1906q;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7438w) {
            case 0:
                return C1906q.m5774f2(this.f7439x, (Boolean) obj);
            case 1:
                return C1906q.m5695G1(this.f7439x, (Long) obj);
            case 2:
                return C1906q.m5699H1(this.f7439x, (Boolean) obj);
            case 3:
                return C1906q.m5718M1(this.f7439x, (String) obj);
            case 4:
                return C1906q.m5833z1(this.f7439x, (View) obj);
            case 5:
                return C1906q.m5691F1(this.f7439x, (View) obj);
            case 6:
                return C1906q.m5742U1(this.f7439x, (Boolean) obj);
            case 7:
                return C1906q.m5745V1(this.f7439x, (View) obj);
            case 8:
                return C1906q.m5748W1(this.f7439x, (View) obj);
            case 9:
                return C1906q.m5751X1(this.f7439x, (View) obj);
            case 10:
                return C1906q.m5680C1(this.f7439x, (C20839r) obj);
            case 11:
                return C1906q.m5733R1(this.f7439x, (View) obj);
            case 12:
                return C1906q.m5786j2(this.f7439x, (C23465k) obj);
            case 13:
                return C1906q.m5768d2(this.f7439x, (Boolean) obj);
            case 14:
                return C1906q.m5684D2(this.f7439x, (MessageMode) obj);
            case 15:
                return C1906q.m5797n1(this.f7439x, (View) obj);
            case 16:
                return C1906q.m5800o1(this.f7439x, (View) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C1906q.m5803p1(this.f7439x, (View) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C1906q.m5806q1(this.f7439x, (View) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C1906q.m5809r1(this.f7439x, (View) obj);
            case 20:
                return C1906q.m5812s1(this.f7439x, (View) obj);
            case 21:
                return C1906q.m5815t1(this.f7439x, (View) obj);
            default:
                return C1906q.m5821v1(this.f7439x, (C40939a) obj);
        }
    }
}
