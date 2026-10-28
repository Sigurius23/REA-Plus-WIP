package p734sl0;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.bot.models.feedback.AiFeedbackType;
import mh.C25540h;
import ml0.AbstractC25669a;
import nl0.AbstractC26802d;
import p208i2.InterfaceC17886g0;
import p270k2.InterfaceC22131e;
import p715kotlin.jvm.functions.Function1;
import p720m91.C25308q;
import p736sz0.AbstractC33174e;
import pt1.EnumC29515e;
import ql0.AbstractC30467b;
import qu1.InterfaceC30627c;
import rt1.InterfaceC31804b;
import so2.AbstractC32849g;
import ss1.C32948a;
import st1.AbstractC32991l;
import st1.AbstractC32993n;
import su1.AbstractC33017c;
import su1.AbstractC33020f;
import sv2.AbstractC33042e;
import sx0.AbstractC33059a;
import sx0.C33062d;
import sy2.AbstractC33103f;
import sy2.AbstractC33108k;

/* JADX INFO: renamed from: sl0.h3 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32618h3 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135199w;

    public /* synthetic */ C32618h3(int i13) {
        this.f135199w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f135199w) {
            case 0:
                return AbstractC32623i3.m101881o((C25308q) obj);
            case 1:
                return AbstractC32648n3.m102045g(((Boolean) obj).booleanValue());
            case 2:
                return AbstractC32648n3.m102046h((InterfaceC17886g0) obj);
            case 3:
                return AbstractC32658p3.m102191P((AbstractC30467b) obj);
            case 4:
                return AbstractC32668r3.m102264n((AbstractC26802d) obj);
            case 5:
                return AbstractC32668r3.m102273w((AbstractC26802d) obj);
            case 6:
                return AbstractC32668r3.m102274x((AbstractC25669a) obj);
            case 7:
                return AbstractC32668r3.m102265o((AbstractC25669a) obj);
            case 8:
                return AbstractC32668r3.m102266p((String) obj);
            case 9:
                return AbstractC32668r3.m102269s((InterfaceC22131e) obj);
            case 10:
                return AbstractC32668r3.m102272v((AiFeedbackType) obj);
            case 11:
                return AbstractC32673s3.m102321u((AbstractC26802d) obj);
            case 12:
                return AbstractC32673s3.m102322v((AbstractC25669a) obj);
            case 13:
                return AbstractC32673s3.m102323w((InterfaceC22131e) obj);
            case 14:
                return AbstractC32673s3.m102326z((AiFeedbackType) obj);
            case 15:
                return AbstractC32673s3.m102295A((AbstractC26802d) obj);
            case 16:
                return AbstractC32673s3.m102296B((AbstractC25669a) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC32849g.m103115q(obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C32948a.m104027u((EnumC29515e) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC32991l.m104152D((InterfaceC31804b.e) obj);
            case 20:
                return AbstractC32993n.m104205k((String) obj);
            case 21:
                return AbstractC33017c.m104247e((C25308q) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC33020f.m104267o((InterfaceC30627c) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC33020f.m104269q((C25308q) obj);
            case 24:
                return AbstractC33020f.m104270r(obj);
            case 25:
                return AbstractC33042e.m104533o1((C25308q) obj);
            case 26:
                return AbstractC33059a.m104684l((C33062d) obj);
            case 27:
                return AbstractC33103f.m104899e((C25540h) obj);
            case 28:
                return AbstractC33108k.m104913l((C25540h) obj);
            default:
                return AbstractC33174e.m105101h(obj);
        }
    }
}
