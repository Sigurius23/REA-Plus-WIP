package p292l1;

import androidx.health.platform.client.proto.C1533u;
import c93.InterfaceC4339a;
import com.whoop.onboarding.overlay.model.FeatureOnboardingOverlayModel;
import io.getstream.chat.android.client.notifications.parser.StreamPayloadParser;
import java.util.UUID;
import l11.AbstractC23221c;
import l31.AbstractC23315i;
import l72.AbstractC23396c;
import l72.AbstractC23402i;
import p354o1.AbstractC27366e0;
import p390p1.AbstractC28683x;
import p390p1.C28674u2;
import p635y2.C39111m;
import p636y3.C39174f;

/* JADX INFO: renamed from: l1.f0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C23091f0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91166w;

    public /* synthetic */ C23091f0(int i13) {
        this.f91166w = i13;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f91166w) {
            case 0:
                return AbstractC28683x.m87272z(Boolean.FALSE);
            case 1:
                return Float.valueOf(0.0f);
            case 2:
                C39111m c39111m = AbstractC23194w1.f91761a;
                return Boolean.TRUE;
            case 3:
                return new C39174f(48);
            case 4:
                C28674u2 c28674u2 = AbstractC23200x1.f91803a;
                return Boolean.FALSE;
            case 5:
                return C23159q2.f91601a;
            case 6:
                return UUID.randomUUID();
            case 7:
                return new C23118j3();
            case 8:
                return new C23154p3();
            case 9:
                return new C39174f(0);
            case 10:
                return AbstractC27366e0.f109830a;
            case 11:
                return new C23209y4();
            case 12:
                return AbstractC23221c.m67182p();
            case 13:
                return AbstractC23221c.m67184r();
            case 14:
                return AbstractC23221c.m67185s();
            case 15:
                return AbstractC23221c.m67187u();
            case 16:
                return AbstractC23221c.m67189w();
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return FeatureOnboardingOverlayModel._childSerializers$_anonymous_();
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return StreamPayloadParser.mapAdapter_delegate$lambda$0();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC23315i.m67484k();
            case 20:
                return AbstractC23315i.m67485l();
            case 21:
                return AbstractC23315i.m67486m();
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC23315i.m67487n();
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC23315i.m67488o();
            case 24:
                return AbstractC23315i.m67489p();
            case 25:
                return AbstractC23315i.m67490q();
            case 26:
                return AbstractC23315i.m67491r();
            case 27:
                return AbstractC23396c.m67730q();
            case 28:
                return AbstractC23396c.m67729p();
            default:
                return AbstractC23402i.m67760A();
        }
    }
}
