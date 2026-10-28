package wo1;

import a30.C0294h;
import android.app.Application;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1601k1;
import androidx.lifecycle.C1646z1;
import b10.C2222b;
import b10.EnumC2228d;
import bi.AbstractC3269g;
import bz.InterfaceC3704c;
import c00.C3795a;
import c93.InterfaceC4339a;
import com.stripe.android.attestation.AttestationActivity;
import com.stripe.android.link.LinkActivity;
import com.stripe.android.link.NoArgsException;
import com.whoop.weightlifting.data.dto.SharedWorkoutResponse;
import com.whoop.weightlifting.feature.builder.details.ExerciseInstructionsModel;
import com.whoop.weightlifting.feature.exerciserecords.domain.models.ArchMiniExerciseRecords;
import e20.C12593a;
import g73.C15556d;
import io.sentry.hints.C20363j;
import java.util.Set;
import jb1.C21536b;
import m83.AbstractC25265s;
import mh.C25540h;
import n20.C26170e;
import p209i3.InterfaceC18044z;
import p298l8.AbstractC23420c;
import p442qy.C30765d;
import p499t9.C33623c0;
import p499t9.C33647p;
import p597wx.AbstractC37679h;
import p597wx.C37678g;
import p597wx.C37681j;
import p599wz.C37708d;
import p599wz.C37718g0;
import p599wz.C37719g1;
import p599wz.C37722h1;
import p599wz.EnumC37721h0;
import p599wz.InterfaceC37739n0;
import p631xz.C38747x;
import p664yy.C39865j;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import p720m91.C25308q;
import q30.C29938w0;
import q83.InterfaceC30063j;
import ro1.AbstractC31635g;
import t40.C33536f;
import tq1.AbstractC34082a;
import uy.C35373a;
import v00.C35459c0;
import v03.C35516c;
import v03.InterfaceC35521h;
import vv1.C36532c;
import wp2.AbstractC37501b;
import wq1.AbstractC37509c;
import wq2.AbstractC37514c;
import wr0.AbstractC37523d0;
import wr0.AbstractC37528g;
import wr0.AbstractC37535j0;
import wr0.AbstractC37540m;
import wr0.AbstractC37552s;
import wr0.AbstractC37557u0;
import wr0.AbstractC37566z;
import wu2.C37647c;
import wv2.AbstractC37652a;
import yn1.AbstractC39672a;

/* JADX INFO: renamed from: wo1.e0 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C37445e0 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f160266w;

    public /* synthetic */ C37445e0(int i13) {
        this.f160266w = i13;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [wz.r] */
    /* JADX WARN: Type inference failed for: r11v0, types: [wz.r] */
    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C38747x c38747xM77714a;
        int i13 = this.f160266w;
        C20363j c20363j = C1646z1.f6353d;
        final int i14 = 1;
        switch (i13) {
            case 0:
                return AbstractC37447f0.m119915m((AbstractC39672a) obj);
            case 1:
                return AbstractC37451h0.m119930h((AbstractC31635g) obj);
            case 2:
                return AbstractC37451h0.m119931i((AbstractC39672a) obj);
            case 3:
                return AbstractC37467p0.m120087s((AbstractC31635g) obj);
            case 4:
                return AbstractC37467p0.m120088t((AbstractC39672a) obj);
            case 5:
                return AbstractC37467p0.m120080l((AbstractC39672a) obj);
            case 6:
                return AbstractC37501b.m120204c((C21536b) obj);
            case 7:
                return Integer.valueOf(AbstractC37509c.m120252y(((Integer) obj).intValue()));
            case 8:
                return Integer.valueOf(AbstractC37509c.m120253z(((Integer) obj).intValue()));
            case 9:
                return AbstractC37509c.m120220E((AbstractC34082a) obj);
            case 10:
                return AbstractC37514c.m120294c((C25308q) obj);
            case 11:
                return AbstractC37528g.m120356r(obj);
            case 12:
                return AbstractC37528g.m120349k(obj);
            case 13:
                return AbstractC37540m.m120425q(obj);
            case 14:
                return AbstractC37552s.m120458k(obj);
            case 15:
                return AbstractC37566z.m120583n(obj);
            case 16:
                return AbstractC37523d0.m120328i(obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC37535j0.m120384n(obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC37557u0.m120485G((InterfaceC18044z) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC37557u0.m120486H(obj);
            case 20:
                return AbstractC37557u0.m120544u(obj);
            case 21:
                return p744wt1.Function1.m120859F((C25540h) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return C37647c.m121014m((SharedWorkoutResponse) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC37652a.m121042f((C21536b) obj);
            case 24:
                return AbstractC37652a.m121043g((C23749z0) obj);
            case 25:
                return AbstractC37652a.m121044h((ExerciseInstructionsModel) obj);
            case 26:
                return AbstractC37652a.m121045i((ArchMiniExerciseRecords) obj);
            case 27:
                AbstractC23420c initializer = (AbstractC23420c) obj;
                AbstractC22676k.m65750j(initializer, "$this$initializer");
                int i15 = AttestationActivity.f22138y;
                C37678g c37678g = (C37678g) AbstractC1613o1.m5015e(initializer).m5001b("attestation_args");
                if (c37678g == null) {
                    throw new IllegalArgumentException() { // from class: com.stripe.android.attestation.AttestationViewModel$NoArgsException
                    };
                }
                Object objMo67910a = initializer.mo67910a(c20363j);
                AbstractC22676k.m65748h(objMo67910a, "null cannot be cast to non-null type android.app.Application");
                Application application = (Application) objMo67910a;
                C36532c c36532c = new C36532c(c37678g, 16);
                Set setM74103I1 = AbstractC25265s.m74103I1(c37678g.f161431x);
                C33647p c33647p = new C33647p(7);
                InterfaceC35521h interfaceC35521hM112678b = C35516c.m112678b(new C35373a(new C33623c0(), i14));
                InterfaceC35521h interfaceC35521hM112678b2 = C35516c.m112678b(new C12593a(c33647p, AbstractC37679h.f161433b, 5));
                InterfaceC35521h interfaceC35521hM112678b3 = C35516c.m112678b(AbstractC37679h.f161432a);
                C33536f c33536fM824a = C0294h.m824a(application);
                InterfaceC30063j interfaceC30063j = (InterfaceC30063j) interfaceC35521hM112678b.get();
                C39865j c39865j = new C39865j((C30765d) interfaceC35521hM112678b2.get(), (InterfaceC30063j) interfaceC35521hM112678b.get());
                C2222b c2222b = new C2222b(application, setM74103I1, c36532c);
                InterfaceC3704c durationProvider = (InterfaceC3704c) interfaceC35521hM112678b3.get();
                AbstractC22676k.m65750j(durationProvider, "durationProvider");
                return new C37681j(c33536fM824a, interfaceC30063j, new C29938w0(c39865j, c2222b, durationProvider));
            case 28:
                AbstractC23420c initializer2 = (AbstractC23420c) obj;
                AbstractC22676k.m65750j(initializer2, "$this$initializer");
                C1601k1 c1601k1M5015e = AbstractC1613o1.m5015e(initializer2);
                Object objMo67910a2 = initializer2.mo67910a(c20363j);
                AbstractC22676k.m65748h(objMo67910a2, "null cannot be cast to non-null type android.app.Application");
                Application application2 = (Application) objMo67910a2;
                int i16 = LinkActivity.f22192E;
                final C37719g1 c37719g1 = (C37719g1) c1601k1M5015e.m5001b("native_link_args");
                if (c37719g1 == null) {
                    throw new NoArgsException();
                }
                C37718g0 c37718g0 = c37719g1.f161645w;
                C35459c0 c35459c0 = c37719g1.f161646x;
                final int i17 = 0;
                ?? r10 = new InterfaceC4339a() { // from class: wz.r
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i17) {
                            case 0:
                                return c37719g1.f161648z;
                            default:
                                return c37719g1.f161640E;
                        }
                    }
                };
                ?? r14 = new InterfaceC4339a() { // from class: wz.r
                    @Override // c93.InterfaceC4339a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                return c37719g1.f161648z;
                            default:
                                return c37719g1.f161640E;
                        }
                    }
                };
                String str = c37719g1.f161643H;
                EnumC37721h0 enumC37721h0 = c37719g1.f161641F;
                InterfaceC37739n0 interfaceC37739n0 = c37719g1.f161644I;
                C37708d c37708d = c37719g1.f161642G;
                EnumC2228d enumC2228d = c37719g1.f161647y;
                c37718g0.getClass();
                c35459c0.getClass();
                str.getClass();
                enumC37721h0.getClass();
                interfaceC37739n0.getClass();
                c37708d.getClass();
                enumC2228d.getClass();
                return new C3795a(new C15556d(27), c37718g0, c35459c0, r10, r14, str, application2, c1601k1M5015e, application2, enumC37721h0, interfaceC37739n0, c37708d, enumC2228d).m11601c();
            default:
                C26170e c26170e = (C26170e) obj;
                return ((c26170e == null || (c38747xM77714a = c26170e.m77714a()) == null) ? null : c38747xM77714a.f166746a.f166664b) != null ? AbstractC3269g.m9484M(c26170e.m77714a().f166746a.f166664b, new C37722h1(i14)) : AbstractC3269g.m9493Z(null);
        }
    }
}
