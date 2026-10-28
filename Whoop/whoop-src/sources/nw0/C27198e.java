package nw0;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.os.PowerManager;
import androidx.health.platform.client.proto.C1533u;
import androidx.work.impl.foreground.SystemForegroundService;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.activation.iajf.domain.SignUpSource;
import com.whoop.educationModels.MediaHeader;
import com.whoop.membership.management.navigation.AbstractC9127b;
import com.whoop.whooplabs.data.domain.SurveyProvider;
import g80.C15562c;
import hg3.AbstractC17269i;
import java.util.UUID;
import jx1.AbstractC22012e;
import l83.InterfaceC23462h;
import mw0.C25984l;
import nj2.C26764k;
import nx1.AbstractC27220b;
import ox2.AbstractC28462h;
import p027b3.InterfaceC2464x2;
import p12.AbstractC28734x;
import p12.C28709b0;
import p12.C28714e;
import p163g1.C15136s0;
import p163g1.C15199y3;
import p164g2.InterfaceC15237i;
import p179h.C16351i;
import p218ic.C18370m;
import p218ic.C18389w;
import p249jc.C21577g;
import p249jc.C21582i0;
import p329n0.C26068u;
import p390p1.InterfaceC28601c1;
import p400pc.C29063b;
import p411q2.InterfaceC29805a;
import p420qc.C30200j;
import p420qc.C30207q;
import p457rc.AbstractC31227j;
import p457rc.C31230m;
import p479s4.AbstractC32122c;
import p715kotlin.jvm.functions.Function1;
import p720m91.InterfaceC25312u;
import p728ql2.Function0;
import p734sl0.AbstractC32679u0;
import p734sl0.AbstractC32686w;
import p734sl0.C32659q;
import p736sz0.C33210q;
import p741vn1.AbstractC36203g;
import pj2.AbstractC29321t;
import pt2.AbstractC29540v;
import pt2.EnumC29521c0;
import q80.AbstractC30037i;
import r41.AbstractC30924h;
import r41.AbstractC30925i;
import re1.AbstractC31323j;
import rm1.AbstractC31594h;
import rv2.InterfaceC31850h;
import so1.C32820j;
import so1.C32831o0;
import so1.C32833q;
import sv2.AbstractC33042e;
import sy2.AbstractC33117t;
import te0.AbstractC33749h;
import ui2.C35022c;
import uw0.AbstractC35304n;
import v41.AbstractC35664f;
import ve0.AbstractC35927e;
import vo1.AbstractC36243r;
import vy0.C36570d0;
import wo1.AbstractC37458l;
import wo1.AbstractC37464o;
import xi2.AbstractC38328f;
import xu2.InterfaceC38658d;
import xz0.AbstractC38754e;
import xz0.C38751b;
import xz0.C38755f;
import yt2.AbstractC39782m;
import yu2.AbstractC39795e;
import yw1.AbstractC39822i;
import zq0.AbstractC40983x;
import zq0.C40984y;

/* JADX INFO: renamed from: nw0.e */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C27198e implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f108895E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f108896w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f108897x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f108898y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f108899z;

    public /* synthetic */ C27198e(InterfaceC2994c0 interfaceC2994c0, InterfaceC31850h.b bVar, C15199y3 c15199y3, Function1 function1) {
        this.f108896w = 16;
        this.f108898y = interfaceC2994c0;
        this.f108895E = bVar;
        this.f108899z = c15199y3;
        this.f108897x = function1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f108896w) {
            case 0:
                return AbstractC27200g.m81777B((Function1) this.f108897x, (C33210q) this.f108895E, (Function1) this.f108898y, (String) this.f108899z);
            case 1:
                return AbstractC27200g.m81827z((Function1) this.f108897x, (C25984l) this.f108895E, (Function1) this.f108898y, (String) this.f108899z);
            case 2:
                return AbstractC27220b.m81958h((AbstractC22012e) this.f108895E, (Function1) this.f108897x, (AbstractC9127b) this.f108899z, (Function1) this.f108898y);
            case 3:
                return AbstractC28462h.m86325J((Function1) this.f108897x, (InterfaceC2464x2) this.f108898y, (InterfaceC2994c0) this.f108895E, (C15199y3) this.f108899z);
            case 4:
                return AbstractC28734x.m87429h0((C28709b0) this.f108895E, (Function1) this.f108897x, (C28714e) this.f108899z, (Function1) this.f108898y);
            case 5:
                return AbstractC29321t.m89239w((C26764k) this.f108897x, (InterfaceC4339a) this.f108898y, (InterfaceC4339a) this.f108895E, (InterfaceC28601c1) this.f108899z);
            case 6:
                return AbstractC29540v.m90391P0((EnumC29521c0) this.f108895E, (Function1) this.f108897x, (Function1) this.f108898y, (String) this.f108899z);
            case 7:
                return AbstractC30037i.m91965w((C15562c) this.f108898y, (InterfaceC25312u) this.f108895E, (Function1) this.f108897x, (SignUpSource) this.f108899z);
            case 8:
                return Function0.m93274u((LocationManager) this.f108897x, (Context) this.f108898y, (C16351i) this.f108895E, (InterfaceC23462h) this.f108899z);
            case 9:
                return AbstractC30924h.m95062C((InterfaceC15237i) this.f108898y, (Function1) this.f108897x, (AbstractC30925i) this.f108895E, (InterfaceC28601c1) this.f108899z);
            case 10:
                C31230m c31230m = (C31230m) this.f108897x;
                UUID uuid = (UUID) this.f108898y;
                C18370m c18370m = (C18370m) this.f108895E;
                Context context = (Context) this.f108899z;
                String string = uuid.toString();
                C30207q c30207qM92434e = c31230m.f128611c.m92434e(string);
                if (c30207qM92434e == null || c30207qM92434e.f123635b.m52871a()) {
                    throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                }
                C21577g c21577g = (C21577g) c31230m.f128610b;
                synchronized (c21577g.f82749k) {
                    try {
                        C18389w.m52886d().m52891e(C21577g.f82738l, "Moving WorkSpec (" + string + ") to the foreground");
                        C21582i0 c21582i0 = (C21582i0) c21577g.f82745g.remove(string);
                        if (c21582i0 != null) {
                            if (c21577g.f82739a == null) {
                                PowerManager.WakeLock wakeLockM96167a = AbstractC31227j.m96167a(c21577g.f82740b);
                                c21577g.f82739a = wakeLockM96167a;
                                wakeLockM96167a.acquire();
                            }
                            c21577g.f82744f.put(string, c21582i0);
                            AbstractC32122c.startForegroundService(c21577g.f82740b, C29063b.m88340a(c21577g.f82740b, AbstractC17269i.m48869P(c21582i0.f82758a), c18370m));
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                C30200j c30200jM48869P = AbstractC17269i.m48869P(c30207qM92434e);
                String str = C29063b.f117588J;
                Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                intent.setAction("ACTION_NOTIFY");
                intent.putExtra("KEY_NOTIFICATION_ID", c18370m.f71509a);
                intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c18370m.f71510b);
                intent.putExtra("KEY_NOTIFICATION", c18370m.f71511c);
                intent.putExtra("KEY_WORKSPEC_ID", c30200jM48869P.f123603a);
                intent.putExtra("KEY_GENERATION", c30200jM48869P.f123604b);
                context.startService(intent);
                return null;
            case 11:
                return AbstractC31323j.m96345S((MediaHeader) this.f108897x, (InterfaceC4339a) this.f108898y, (InterfaceC2994c0) this.f108895E, (C15199y3) this.f108899z);
            case 12:
                return AbstractC31594h.m97409L((AbstractC36203g.c) this.f108898y, (Function1) this.f108897x, (InterfaceC4351m) this.f108895E, (InterfaceC29805a) this.f108899z);
            case 13:
                return AbstractC32686w.m102500F((InterfaceC2994c0) this.f108897x, (C15199y3) this.f108898y, (InterfaceC4339a) this.f108895E, (InterfaceC28601c1) this.f108899z);
            case 14:
                return AbstractC32686w.m102508N((InterfaceC2994c0) this.f108897x, (C15199y3) this.f108898y, (InterfaceC4339a) this.f108895E, (C32659q) this.f108899z);
            case 15:
                return AbstractC32679u0.m102367c0((InterfaceC2994c0) this.f108897x, (C15199y3) this.f108898y, (InterfaceC4339a) this.f108895E, (InterfaceC2464x2) this.f108899z);
            case 16:
                return AbstractC33042e.m104485Y((InterfaceC2994c0) this.f108898y, (InterfaceC31850h.b) this.f108895E, (C15199y3) this.f108899z, (Function1) this.f108897x);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC33117t.m104984E((InterfaceC28601c1) this.f108898y, (InterfaceC28601c1) this.f108895E, (Function1) this.f108897x, (SurveyProvider) this.f108899z);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC35304n.m112061l((InterfaceC28601c1) this.f108898y, (Function1) this.f108897x, (InterfaceC2994c0) this.f108895E, (AbstractC35664f.a) this.f108899z);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC35927e.m114113L((AbstractC33749h.e) this.f108895E, (Function1) this.f108897x, (Function1) this.f108898y, (InterfaceC4339a) this.f108899z);
            case 20:
                return AbstractC36243r.m115485D0((Function1) this.f108897x, (Function1) this.f108898y, (Function1) this.f108895E, (String) this.f108899z);
            case 21:
                return AbstractC37458l.m120012j((InterfaceC2994c0) this.f108898y, (Function1) this.f108897x, (C32820j) this.f108895E, (C15199y3) this.f108899z);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC37458l.m120014l((InterfaceC2994c0) this.f108898y, (Function1) this.f108897x, (C32831o0) this.f108895E, (C15199y3) this.f108899z);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC37464o.m120059t((Function1) this.f108897x, (C32833q) this.f108895E, (InterfaceC28601c1) this.f108899z, (Function1) this.f108898y);
            case 24:
                return AbstractC38328f.m122856B((C35022c) this.f108895E, (Function1) this.f108897x, (Context) this.f108899z, (Function1) this.f108898y);
            case 25:
                return AbstractC38754e.m124210y((C38751b) this.f108898y, (InterfaceC4339a) this.f108895E, (Function1) this.f108897x, (C38755f) this.f108899z);
            case 26:
                return AbstractC39782m.m127446V((InterfaceC2994c0) this.f108898y, (C15136s0) this.f108895E, (Function1) this.f108897x, (InterfaceC28601c1) this.f108899z);
            case 27:
                return AbstractC39795e.m127538G((InterfaceC38658d.c) this.f108898y, (Function1) this.f108897x, (InterfaceC2994c0) this.f108895E, (C26068u) this.f108899z);
            case 28:
                return AbstractC39822i.m127711t((Function1) this.f108897x, (String) this.f108899z, (String) this.f108898y, (InterfaceC4339a) this.f108895E);
            default:
                return AbstractC40983x.m133085o((C36570d0) this.f108898y, (Function1) this.f108897x, (C40984y.a) this.f108895E, (InterfaceC28601c1) this.f108899z);
        }
    }

    public /* synthetic */ C27198e(Object obj, Object obj2, Object obj3, Object obj4, int i13) {
        this.f108896w = i13;
        this.f108897x = obj;
        this.f108898y = obj2;
        this.f108895E = obj3;
        this.f108899z = obj4;
    }

    public /* synthetic */ C27198e(Object obj, Object obj2, Function1 function1, Object obj3, int i13) {
        this.f108896w = i13;
        this.f108898y = obj;
        this.f108895E = obj2;
        this.f108897x = function1;
        this.f108899z = obj3;
    }

    public /* synthetic */ C27198e(Object obj, Function1 function1, Object obj2, Object obj3, int i13) {
        this.f108896w = i13;
        this.f108898y = obj;
        this.f108897x = function1;
        this.f108895E = obj2;
        this.f108899z = obj3;
    }

    public /* synthetic */ C27198e(Object obj, Function1 function1, Object obj2, Function1 function2, int i13) {
        this.f108896w = i13;
        this.f108895E = obj;
        this.f108897x = function1;
        this.f108899z = obj2;
        this.f108898y = function2;
    }

    public /* synthetic */ C27198e(Object obj, Function1 function1, Function1 function2, Object obj2, int i13) {
        this.f108896w = i13;
        this.f108895E = obj;
        this.f108897x = function1;
        this.f108898y = function2;
        this.f108899z = obj2;
    }

    public /* synthetic */ C27198e(Function1 function1, Object obj, Function1 function2, String str, int i13) {
        this.f108896w = i13;
        this.f108897x = function1;
        this.f108895E = obj;
        this.f108898y = function2;
        this.f108899z = str;
    }

    public /* synthetic */ C27198e(Function1 function1, String str, String str2, InterfaceC4339a interfaceC4339a) {
        this.f108896w = 28;
        this.f108897x = function1;
        this.f108899z = str;
        this.f108898y = str2;
        this.f108895E = interfaceC4339a;
    }

    public /* synthetic */ C27198e(Function1 function1, C32833q c32833q, InterfaceC28601c1 interfaceC28601c1, Function1 function2) {
        this.f108896w = 23;
        this.f108897x = function1;
        this.f108895E = c32833q;
        this.f108899z = interfaceC28601c1;
        this.f108898y = function2;
    }
}
