package ev2;

import ad3.C0764g;
import androidx.health.platform.client.proto.C1533u;
import com.stripe.android.link.serialization.PopupPayload;
import cy0.InterfaceC11182a;
import dv2.InterfaceC12391b;
import ew1.C13722a;
import ey0.AbstractC13740g;
import ey0.AbstractC13742i;
import ez2.C13761a;
import f01.AbstractC13852d0;
import f01.AbstractC13860g;
import f01.AbstractC13881n;
import f01.AbstractC13882n0;
import f01.AbstractC13886o1;
import f01.AbstractC13899t;
import f01.AbstractC13901t1;
import f01.AbstractC13913z;
import f11.AbstractC14004d;
import io.getstream.chat.android.client.extensions.StringExtensionsKt;
import jb1.C21536b;
import l83.C23454a0;
import o11.AbstractC27407m;
import p005a3.C0238p0;
import p077d0.C11384o;
import p133f1.AbstractC13976s0;
import p133f1.C13926b1;
import p181h2.C16617b;
import p208i2.InterfaceC17886g0;
import p270k2.InterfaceC22129c;
import p715kotlin.jvm.functions.Function1;
import p720m91.C25287a;
import p720m91.C25308q;
import yb3.InterfaceC39407k;

/* JADX INFO: renamed from: ev2.b */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C13693b implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f48517w;

    public /* synthetic */ C13693b(int i13) {
        this.f48517w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f48517w) {
            case 0:
                return AbstractC13705n.m38710z((C25287a) obj);
            case 1:
                return AbstractC13705n.m38706v((AbstractC27407m.c.b) obj);
            case 2:
                return AbstractC13712u.m38770Z0((InterfaceC12391b) obj);
            case 3:
                return AbstractC13712u.m38736I0((C25287a) obj);
            case 4:
                return AbstractC13712u.m38834x0((AbstractC27407m.c.b) obj);
            case 5:
                return AbstractC13712u.m38803k1((InterfaceC22129c) obj);
            case 6:
                return C13722a.m38881n((String) obj);
            case 7:
                return AbstractC13740g.m39048v(obj);
            case 8:
                return AbstractC13740g.m39049w((C25308q) obj);
            case 9:
                return AbstractC13742i.m39055C((InterfaceC11182a) obj);
            case 10:
                return AbstractC13742i.m39078t((InterfaceC11182a) obj);
            case 11:
                return C13761a.m39124b((C21536b) obj);
            case 12:
                ((C0238p0) ((InterfaceC22129c) obj)).m728a();
                return C23454a0.f92919a;
            case 13:
                ((Long) obj).getClass();
                return C23454a0.f92919a;
            case 14:
                return PopupPayload.PopupPayloadJson$lambda$0((C0764g) obj);
            case 15:
                return AbstractC13860g.m39274i(obj);
            case 16:
                return AbstractC13881n.m39393o(obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC13899t.m39542g(obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC13913z.m39631f(obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC13852d0.m39236g(obj);
            case 20:
                return AbstractC13882n0.m39436t((InterfaceC22129c) obj);
            case 21:
                return AbstractC13886o1.m39474k(obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC13901t1.m39573e(obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C16617b c16617b = (C16617b) obj;
                long j7 = c16617b.f63937a;
                return (9223372034707292159L & j7) != 9205357640488583168L ? new C11384o(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (c16617b.f63937a & 4294967295L))) : AbstractC13976s0.f49839a;
            case 24:
                C11384o c11384o = (C11384o) obj;
                return new C16617b((((long) Float.floatToRawIntBits(c11384o.f36504a)) << 32) | (((long) Float.floatToRawIntBits(c11384o.f36505b)) & 4294967295L));
            case 25:
                return new C13926b1(((Long) obj).longValue());
            case 26:
                return AbstractC14004d.m39870s((InterfaceC17886g0) obj);
            case 27:
                return AbstractC14004d.m39871t((InterfaceC22129c) obj);
            case 28:
                return StringExtensionsKt.m54665b((InterfaceC39407k) obj);
            default:
                return StringExtensionsKt.m54664a((InterfaceC39407k) obj);
        }
    }
}
