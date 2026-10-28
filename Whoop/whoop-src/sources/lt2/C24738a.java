package lt2;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.stripe.android.financialconnections.lite.FinancialConnectionsSheetLiteActivity;
import com.whoop.pairing.p066ui.view.PairingFragment;
import com.whoop.weeklyplan.hubandspoke.domain.models.MetricValue;
import java.util.UUID;
import lw1.AbstractC24770f;
import lw1.AbstractC24772h;
import m01.AbstractC24876d;
import m01.AbstractC24879g;
import m12.AbstractC24936d;
import p313lz.C24805b;
import p719m22.AbstractC24949d;
import p719m22.AbstractC24951f;
import p719m22.AbstractC24955j;
import p719m22.AbstractC42785i;
import p719m22.AbstractC42786k;
import p719m22.AbstractC42787l;
import p719m22.Function0;

/* JADX INFO: renamed from: lt2.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C24738a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f96732w;

    public /* synthetic */ C24738a(int i13) {
        this.f96732w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f96732w) {
            case 0:
                return MetricValue._childSerializers$_anonymous_();
            case 1:
                return AbstractC24770f.m72565m();
            case 2:
                return AbstractC24772h.m72580k();
            case 3:
                int i13 = FinancialConnectionsSheetLiteActivity.f22170z;
                return new C24805b(0);
            case 4:
                return UUID.randomUUID().toString();
            case 5:
                return AbstractC24876d.m72947x();
            case 6:
                return AbstractC24879g.m72954e();
            case 7:
                return AbstractC24936d.m73043E();
            case 8:
                return AbstractC24936d.m73076v();
            case 9:
                return AbstractC24936d.m73040B();
            case 10:
                return AbstractC24936d.m73047I();
            case 11:
                return AbstractC24936d.m73041C();
            case 12:
                return AbstractC24936d.m73042D();
            case 13:
                return AbstractC24949d.m73134w();
            case 14:
                return AbstractC24949d.m73135x();
            case 15:
                return AbstractC24949d.m73127p();
            case 16:
                return Function0.m73149l();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return Function0.m73150m();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return Function0.m73151n();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC24951f.m73164l();
            case 20:
                return AbstractC24951f.m73165m();
            case 21:
                return AbstractC24951f.m73166n();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return PairingFragment.m23210O();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC42785i.m73180m();
            case 24:
                return AbstractC24955j.m73197o();
            case 25:
                return AbstractC24955j.m73198p();
            case 26:
                return AbstractC42786k.m73212h();
            case 27:
                return AbstractC42786k.m73213i();
            case 28:
                return AbstractC42787l.m73222h();
            default:
                return AbstractC42787l.m73223i();
        }
    }
}
