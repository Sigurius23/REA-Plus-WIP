package x30;

import al1.C0982c;
import android.graphics.drawable.Drawable;
import androidx.health.platform.client.proto.C1533u;
import bc3.InterfaceC3027k1;
import com.whoop.advancedlabs.allrecordings.view.AllRecordingsFragment;
import com.whoop.advancedlabs.editbiomarkers.view.EditBiomarkersFragment;
import com.whoop.advancedlabs.insightsdeepdive.view.InsightsDeepDiveFragment;
import com.whoop.advancedlabs.scheduleprimer.view.SchedulePrimerFragment;
import com.whoop.appconfiguration.TabConfiguration;
import com.whoop.sanguine.view.SanguineWaitlistBiomarkerListFragment;
import com.whoop.sanguine.view.SanguineWaitlistFragment;
import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.CancellationException;
import kd0.InterfaceC22381a;
import l40.C23328a;
import l83.C23454a0;
import l83.C23465k;
import p208i2.AbstractC17876d;
import p208i2.InterfaceC17915v;
import p209i3.InterfaceC18044z;
import p270k2.InterfaceC22131e;
import p329n0.InterfaceC26064q;
import p500tb.InterfaceC33687a;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r72.AbstractC31054a;
import ua0.AbstractC34718a;
import ua0.C34719b;
import uc0.AbstractC34758a;
import uc0.C34759b;
import v72.AbstractC35771b;
import v72.AbstractC35773d;
import v72.C35772c;
import v72.C35774e;
import va0.AbstractC35839a;
import vb0.AbstractC35866a;
import vb0.C35867b;
import vm2.C36159d;
import w72.C36913f;
import w72.InterfaceC36912e;
import wb3.AbstractC37056f;
import wd0.AbstractC37162a;
import wd0.C37163b;
import wd3.AbstractC37174h;
import x90.C38096b;
import xd3.C38223f;
import xi1.C38322b;
import yb3.C39409m;
import z72.AbstractC40161g;
import zi1.AbstractC40678h;
import zk1.AbstractC40837a;
import zm2.AbstractC40896a;
import zt2.AbstractC41144m;
import zt2.C41145n;
import zz0.AbstractC41246g;
import zz0.EnumC41241b;

/* JADX INFO: renamed from: x30.h1 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C37894h1 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f162253w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f162254x;

    public /* synthetic */ C37894h1(Object obj, int i13) {
        this.f162253w = i13;
        this.f162254x = obj;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f162253w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f162254x;
        switch (i13) {
            case 0:
                C23328a it = (C23328a) obj;
                AbstractC22676k.m65750j(it, "it");
                return AbstractC37056f.m118958J(new C23465k(((C37897i1) obj2).f162266d, it));
            case 1:
                ((InterfaceC3027k1) obj2).cancel((CancellationException) null);
                return c23454a0;
            case 2:
                return ((C38096b) obj2).m122052i((InterfaceC33687a) obj);
            case 3:
                return AllRecordingsFragment.m17271F((C34719b) obj2, (AbstractC34718a) obj);
            case 4:
                return AllRecordingsFragment.m17272G((AllRecordingsFragment) obj2, (AbstractC35839a) obj);
            case 5:
                return InsightsDeepDiveFragment.m17473I((InsightsDeepDiveFragment) obj2, (InterfaceC22381a.c) obj);
            case 6:
                return InsightsDeepDiveFragment.m17474J((C34759b) obj2, (AbstractC34758a) obj);
            case 7:
                AbstractC22676k.m65750j((IOException) obj, "it");
                TimeZone timeZone = AbstractC37174h.f158962a;
                ((C38223f) obj2).f163839K = true;
                return c23454a0;
            case 8:
                return EditBiomarkersFragment.m17416R((C35867b) obj2, (AbstractC35866a) obj);
            case 9:
                return ((C39409m) obj2).m125842c(((Integer) obj).intValue());
            case 10:
                Drawable drawable = (Drawable) obj2;
                InterfaceC22131e interfaceC22131e = (InterfaceC22131e) obj;
                InterfaceC17915v interfaceC17915vM716w = interfaceC22131e.mo744t0().m716w();
                drawable.setBounds(0, 0, (int) Float.intBitsToFloat((int) (interfaceC22131e.mo731d() >> 32)), (int) Float.intBitsToFloat((int) (interfaceC22131e.mo731d() & 4294967295L)));
                drawable.draw(AbstractC17876d.m51433a(interfaceC17915vM716w));
                return c23454a0;
            case 11:
                return SanguineWaitlistBiomarkerListFragment.m24457E((C35772c) obj2, (AbstractC35771b) obj);
            case 12:
                return SanguineWaitlistFragment.m24471L((SanguineWaitlistFragment) obj2, (AbstractC31054a) obj);
            case 13:
                return SanguineWaitlistFragment.m24472M((C35774e) obj2, (AbstractC35773d) obj);
            case 14:
                return AbstractC40161g.m128852t0((C36913f) obj2, (InterfaceC36912e) obj);
            case 15:
                return SchedulePrimerFragment.m17527K((SchedulePrimerFragment) obj2, (InterfaceC22381a.c) obj);
            case 16:
                return SchedulePrimerFragment.m17528L((C37163b) obj2, (AbstractC37162a) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC40678h.m132063g((C38322b) obj2, obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC40837a.m132345q((C0982c) obj2, obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC40896a.m132552d((C36159d) obj2, (TabConfiguration) obj);
            case 20:
                return AbstractC41144m.m133630e((C41145n) obj2, (InterfaceC26064q) obj);
            default:
                return AbstractC41246g.m133994x((EnumC41241b) obj2, (InterfaceC18044z) obj);
        }
    }
}
