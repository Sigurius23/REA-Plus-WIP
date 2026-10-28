package do0;

import ad3.C0764g;
import android.app.Application;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1646z1;
import aw1.AbstractC2113a;
import b10.C2222b;
import b20.C2326f;
import b30.C2550j3;
import bi.AbstractC3269g;
import bz.InterfaceC3704c;
import com.stripe.android.challenge.passive.PassiveChallengeActivity;
import com.whoop.deepdive.domain.models.ArchMiniRecoveryImpactsModel;
import com.whoop.deepdive.domain.models.ArchMiniTrendsModel;
import com.whoop.limitedtimeoffer.domain.models.TimerPillModel;
import dp2.C12256b;
import dv1.AbstractC12389b;
import dv1.C12388a;
import dw1.AbstractC12416d;
import dw1.AbstractC12418f;
import dy0.AbstractC12444c;
import e01.AbstractC12503b;
import e02.C12512h;
import e11.AbstractC12583c;
import e20.C12593a;
import e41.AbstractC12702g;
import e51.AbstractC12727c;
import e51.AbstractC12736l;
import e51.C12729e;
import ec3.InterfaceC13037f2;
import java.util.Set;
import jb1.C21536b;
import l83.C23454a0;
import m83.AbstractC25265s;
import o02.C27354e;
import p078d1.C11456i;
import p102dy.AbstractC12439h;
import p102dy.C12438g;
import p102dy.C12441j;
import p209i3.InterfaceC18044z;
import p270k2.InterfaceC22129c;
import p298l8.AbstractC23420c;
import p31.AbstractC28799j;
import p408q.C29662f;
import p442qy.C30765d;
import p479s4.AbstractC32128i;
import p499t9.C33623c0;
import p499t9.C33647p;
import p664yy.C39865j;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p716lb1.C23749z0;
import q83.InterfaceC30063j;
import r20.InterfaceC30881s;
import tn0.InterfaceC33957a;
import uy.C35373a;
import uz.AbstractC35403q;
import uz.C35402p;
import v03.C35516c;
import v03.InterfaceC35521h;
import x43.AbstractC37978j;
import y00.C38797c3;
import zn0.AbstractC40903a;

/* JADX INFO: renamed from: do0.c */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C12229c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f40916w;

    public /* synthetic */ C12229c(int i13) {
        this.f40916w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        char c3 = 1;
        switch (this.f40916w) {
            case 0:
                return AbstractC12230d.m34005l((AbstractC40903a) obj);
            case 1:
                return AbstractC12230d.m34008o((InterfaceC33957a) obj);
            case 2:
                return C12256b.m34181g((C27354e) obj);
            case 3:
                return C12388a.m34776f((C23749z0) obj);
            case 4:
                return C12388a.m34777g((TimerPillModel) obj);
            case 5:
                return AbstractC12389b.m34787c((C21536b) obj);
            case 6:
                return AbstractC12416d.m34938k((AbstractC2113a) obj);
            case 7:
                return AbstractC12416d.m34943p((AbstractC2113a) obj);
            case 8:
                return AbstractC12416d.m34948u((InterfaceC22129c) obj);
            case 9:
                return AbstractC12418f.m34959k((AbstractC2113a) obj);
            case 10:
                return AbstractC12418f.m34964p((AbstractC2113a) obj);
            case 11:
                AbstractC23420c initializer = (AbstractC23420c) obj;
                AbstractC22676k.m65750j(initializer, "$this$initializer");
                int i13 = PassiveChallengeActivity.f22144y;
                C12438g c12438g = (C12438g) AbstractC1613o1.m5015e(initializer).m5001b("passive_challenge_args");
                if (c12438g == null) {
                    throw new IllegalArgumentException() { // from class: com.stripe.android.challenge.passive.PassiveChallengeViewModel$NoArgsException
                    };
                }
                Object objMo67910a = initializer.mo67910a(C1646z1.f6353d);
                AbstractC22676k.m65748h(objMo67910a, "null cannot be cast to non-null type android.app.Application");
                Application application = (Application) objMo67910a;
                C11456i c11456i = new C11456i(c12438g, 11);
                Set setM74103I1 = AbstractC25265s.m74103I1(c12438g.f42372y);
                C38797c3 c38797c3 = c12438g.f42370w;
                c38797c3.getClass();
                C33647p c33647p = new C33647p(7);
                C33623c0 c33623c0 = new C33623c0();
                InterfaceC35521h interfaceC35521hM112678b = C35516c.m112678b(new C12593a(c33647p, AbstractC12439h.f42374b, 5));
                InterfaceC35521h interfaceC35521hM112678b2 = C35516c.m112678b(new C35373a(c33623c0, c3 == true ? 1 : 0));
                InterfaceC35521h interfaceC35521hM112678b3 = C35516c.m112678b(AbstractC12439h.f42373a);
                C35402p c35402p = new C35402p();
                C39865j c39865j = new C39865j((C30765d) interfaceC35521hM112678b.get(), (InterfaceC30063j) interfaceC35521hM112678b2.get());
                C2222b c2222b = new C2222b(application, setM74103I1, c11456i);
                InterfaceC3704c durationProvider = (InterfaceC3704c) interfaceC35521hM112678b3.get();
                C2326f c2326f = new C2326f(new C39865j((C30765d) interfaceC35521hM112678b.get(), (InterfaceC30063j) interfaceC35521hM112678b2.get()), new C2222b(application, setM74103I1, c11456i));
                AbstractC22676k.m65750j(durationProvider, "durationProvider");
                return new C12441j(c38797c3, AbstractC35403q.m112323a(c35402p, new C29662f(c39865j, c2222b, durationProvider, c2326f)));
            case 12:
                return AbstractC12444c.m35011h((C21536b) obj);
            case 13:
                return AbstractC12444c.m35013j((ArchMiniTrendsModel) obj);
            case 14:
                return AbstractC12444c.m35015l((ArchMiniRecoveryImpactsModel) obj);
            case 15:
                return AbstractC12503b.m35141e(obj);
            case 16:
                return C12512h.m35156b((C21536b) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC12583c.m35266f(obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                InterfaceC30881s currentScreen = (InterfaceC30881s) obj;
                AbstractC22676k.m65750j(currentScreen, "currentScreen");
                return AbstractC3269g.m9484M(currentScreen.mo94931k(), new C12229c(19));
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C2550j3 c2550j3 = (C2550j3) obj;
                return Boolean.valueOf(c2550j3 != null && c2550j3.f9912c);
            case 20:
                InterfaceC13037f2 it = (InterfaceC13037f2) obj;
                AbstractC22676k.m65750j(it, "it");
                return it;
            case 21:
                String it3 = (String) obj;
                AbstractC22676k.m65750j(it3, "it");
                return AbstractC32128i.m100055i(AbstractC37978j.m121655p(it3));
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C0764g Json = (C0764g) obj;
                AbstractC22676k.m65750j(Json, "$this$Json");
                Json.f2776c = true;
                return C23454a0.f92919a;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC12702g.m35527s(obj);
            case 24:
                return AbstractC12702g.m35529u(obj);
            case 25:
                return AbstractC12727c.m35586f(obj);
            case 26:
                return AbstractC12727c.m35587g((AbstractC28799j) obj);
            case 27:
                return AbstractC12736l.m35623j(obj);
            case 28:
                return AbstractC12736l.m35625l((InterfaceC18044z) obj);
            default:
                return AbstractC12736l.m35627n((C12729e) obj);
        }
    }
}
