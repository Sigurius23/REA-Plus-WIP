package fq2;

import android.app.Application;
import androidx.compose.material.AbstractC1118c;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1646z1;
import b10.C2222b;
import b20.C2326f;
import bz.InterfaceC3704c;
import com.stripe.android.challenge.passive.warmer.activity.PassiveChallengeWarmerActivity;
import com.whoop.user.journey.model.yearinreview.YearInReviewComparisonModel;
import com.whoop.user.journey.model.yearinreview.YearInReviewHighlightsListModel;
import com.whoop.user.journey.model.yearinreview.YearInReviewStreaksStatsCard;
import com.whoop.user.journey.model.yearinreview.YearInReviewSummaryCardModel;
import com.whoop.user.journey.model.yearinreview.chronologicalsection.InsightValueListModel;
import com.whoop.user.journey.model.yearinreview.chronologicalsection.YearInReviewCardModel;
import com.whoop.user.journey.model.yearinreview.chronologicalsection.YearInReviewTimelineModel;
import e20.C12593a;
import fr1.AbstractC14713b;
import fr1.C14715d;
import fu0.C14778c;
import fu0.C14781f;
import fx2.C14855g;
import java.util.Set;
import l83.C23454a0;
import m83.AbstractC25265s;
import p077d0.C11385o0;
import p078d1.C11456i;
import p102dy.AbstractC12439h;
import p114eb.C12970k1;
import p114eb.C12999y0;
import p159fy.C14858c;
import p159fy.C14862g;
import p163g1.AbstractC15050j4;
import p163g1.AbstractC15108p2;
import p163g1.AbstractC15170v4;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p298l8.AbstractC23420c;
import p408q.C29662f;
import p442qy.C30765d;
import p499t9.C33623c0;
import p499t9.C33647p;
import p500tb.InterfaceC33687a;
import p664yy.C39865j;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25308q;
import q83.InterfaceC30063j;
import uy.C35373a;
import uz.AbstractC35403q;
import uz.C35402p;
import v03.C35516c;
import v03.InterfaceC35521h;
import y00.C38797c3;

/* JADX INFO: renamed from: fq2.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C14686c implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f54255w;

    public /* synthetic */ C14686c(int i13) {
        this.f54255w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f54255w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        switch (i13) {
            case 0:
                return AbstractC14687d.m42051M((YearInReviewTimelineModel) obj);
            case 1:
                return AbstractC14687d.m42052N((YearInReviewComparisonModel) obj);
            case 2:
                return AbstractC14687d.m42050L((YearInReviewCardModel) obj);
            case 3:
                return AbstractC14687d.m42053O((YearInReviewSummaryCardModel) obj);
            case 4:
                return AbstractC14687d.m42054P((YearInReviewStreaksStatsCard) obj);
            case 5:
                return AbstractC14687d.m42055Q((YearInReviewHighlightsListModel) obj);
            case 6:
                return AbstractC14687d.m42056R((InsightValueListModel) obj);
            case 7:
                return AbstractC14713b.m42176o((C25308q) obj);
            case 8:
                return C14715d.m42199l((C12999y0) obj);
            case 9:
                return C14715d.m42200m((C12970k1) obj);
            case 10:
                return C14778c.m42399l((InterfaceC33687a) obj);
            case 11:
                return C14781f.m42413l((InterfaceC33687a) obj);
            case 12:
                return C14855g.m42807J0((InterfaceC33687a) obj);
            case 13:
                return C14855g.m42866y0((InterfaceC33687a) obj);
            case 14:
                return C14855g.m42795A0((InterfaceC33687a) obj);
            case 15:
                return C14855g.m42796B0((InterfaceC33687a) obj);
            case 16:
                return C14855g.m42801G0((InterfaceC33687a) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return C14855g.m42811L0((InterfaceC33687a) obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return C14855g.m42797C0((InterfaceC33687a) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return C14855g.m42800F0((InterfaceC33687a) obj);
            case 20:
                AbstractC23420c initializer = (AbstractC23420c) obj;
                AbstractC22676k.m65750j(initializer, "$this$initializer");
                int i14 = PassiveChallengeWarmerActivity.f22147y;
                C14858c c14858c = (C14858c) AbstractC1613o1.m5015e(initializer).m5001b("passive_challenge_warmer_args");
                if (c14858c == null) {
                    throw new IllegalArgumentException() { // from class: com.stripe.android.challenge.passive.warmer.activity.PassiveChallengeWarmerViewModel$NoArgsException
                    };
                }
                Object objMo67910a = initializer.mo67910a(C1646z1.f6353d);
                AbstractC22676k.m65748h(objMo67910a, "null cannot be cast to non-null type android.app.Application");
                Application application = (Application) objMo67910a;
                C11456i c11456i = new C11456i(c14858c, 21);
                Set setM74103I1 = AbstractC25265s.m74103I1(c14858c.f55484y);
                C38797c3 c38797c3 = c14858c.f55482w;
                c38797c3.getClass();
                C33647p c33647p = new C33647p(7);
                C33623c0 c33623c0 = new C33623c0();
                InterfaceC35521h interfaceC35521hM112678b = C35516c.m112678b(new C12593a(c33647p, AbstractC12439h.f42374b, 5));
                InterfaceC35521h interfaceC35521hM112678b2 = C35516c.m112678b(new C35373a(c33623c0, 1));
                InterfaceC35521h interfaceC35521hM112678b3 = C35516c.m112678b(AbstractC12439h.f42373a);
                C35402p c35402p = new C35402p();
                C39865j c39865j = new C39865j((C30765d) interfaceC35521hM112678b.get(), (InterfaceC30063j) interfaceC35521hM112678b2.get());
                C2222b c2222b = new C2222b(application, setM74103I1, c11456i);
                InterfaceC3704c durationProvider = (InterfaceC3704c) interfaceC35521hM112678b3.get();
                C2326f c2326f = new C2326f(new C39865j((C30765d) interfaceC35521hM112678b.get(), (InterfaceC30063j) interfaceC35521hM112678b2.get()), new C2222b(application, setM74103I1, c11456i));
                AbstractC22676k.m65750j(durationProvider, "durationProvider");
                return new C14862g(c38797c3, AbstractC35403q.m112323a(c35402p, new C29662f(c39865j, c2222b, durationProvider, c2326f)));
            case 21:
                float f13 = AbstractC15108p2.f56602a;
                return Boolean.TRUE;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                float f14 = AbstractC15108p2.f56602a;
                return Boolean.TRUE;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                AbstractC18041w.m51810i((InterfaceC18044z) obj, 0);
                return c23454a0;
            case 24:
                float f15 = AbstractC1118c.f4722a;
                return Boolean.TRUE;
            case 25:
                float f16 = AbstractC15050j4.f56342a;
                return c23454a0;
            case 26:
                float f17 = AbstractC15170v4.f56902a;
                return c23454a0;
            case 27:
                C11385o0 c11385o0 = (C11385o0) obj;
                c11385o0.f36506a = 1800;
                c11385o0.m30615a(0, Float.valueOf(0.0f)).f36485b = AbstractC15170v4.f56905d;
                c11385o0.m30615a(750, Float.valueOf(1.0f));
                return c23454a0;
            case 28:
                C11385o0 c11385o1 = (C11385o0) obj;
                c11385o1.f36506a = 1800;
                c11385o1.m30615a(333, Float.valueOf(0.0f)).f36485b = AbstractC15170v4.f56906e;
                c11385o1.m30615a(1183, Float.valueOf(1.0f));
                return c23454a0;
            default:
                C11385o0 c11385o2 = (C11385o0) obj;
                c11385o2.f36506a = 1800;
                c11385o2.m30615a(1000, Float.valueOf(0.0f)).f36485b = AbstractC15170v4.f56907f;
                c11385o2.m30615a(1567, Float.valueOf(1.0f));
                return c23454a0;
        }
    }
}
