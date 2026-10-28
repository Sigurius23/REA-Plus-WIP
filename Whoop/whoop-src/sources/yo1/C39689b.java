package yo1;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.view.textclassifier.TextClassification;
import androidx.health.platform.client.proto.C1533u;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import com.stripe.android.core.exception.APIConnectionException;
import com.whoop.membership.management.MembershipManagementFragment;
import ds1.AbstractC12331a;
import id2.C18425j;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import l83.C23454a0;
import l83.C23468n;
import p012ab.C0684i0;
import p025b1.InterfaceC2215f;
import p027b3.AbstractC2378g1;
import p114eb.C12991u0;
import p164g2.InterfaceC15237i;
import p329n0.C26068u;
import p390p1.InterfaceC28593a1;
import p390p1.InterfaceC28601c1;
import p442qy.C30765d;
import p479s4.AbstractC32120a;
import p505ts.AbstractC34132o;
import p557vo.AbstractC36220b;
import p601x0.C37793d;
import p601x0.InterfaceC37796g;
import p635y2.InterfaceC39147y;
import p636y3.C39178j;
import p664yy.AbstractC39872m0;
import p664yy.C39863i;
import p664yy.C39866j0;
import p664yy.C39874n0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import p748zc1.AbstractC40382k7;
import r31.C30911f;
import ti0.C33840e;
import ti0.C33842g;
import wt2.AbstractC37625f;
import wt2.AbstractC37630k;
import wt2.AbstractC37636q;
import x31.C37942a;
import x50.InterfaceC37988c;
import xu2.InterfaceC38655a;
import yi1.C39575i;
import yi1.C39577k;
import yi1.C39581o;
import yt2.AbstractC39772c;
import yt2.AbstractC39780k;
import yt2.AbstractC39782m;
import yu2.AbstractC39795e;
import yz0.AbstractC39905b;
import yz0.C39906c;
import z50.AbstractC40087c;
import z50.AbstractC40088d;
import zi0.AbstractC40662a;
import zi0.AbstractC40664c;
import zi1.AbstractC40666a0;
import zi1.AbstractC40671d;
import zi1.AbstractC40687q;
import zl0.AbstractC40878j;
import zm1.AbstractC40894e;
import zm1.C40895f;
import zq0.AbstractC40965f;
import zq0.C40975p;
import zr1.AbstractC41068b;
import zt2.AbstractC41134c;
import zt2.AbstractC41135d;
import zt2.AbstractC41140i;
import zt2.C41133b;
import zt2.C41136e;
import zt2.C41139h;
import zv2.AbstractC41169e;
import zy2.AbstractC41231d;
import zy2.InterfaceC41233f;

/* JADX INFO: renamed from: yo1.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C39689b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f170840w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f170841x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f170842y;

    public /* synthetic */ C39689b(int i13, Object obj, Object obj2) {
        this.f170840w = i13;
        this.f170841x = obj;
        this.f170842y = obj2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() throws Throwable {
        Object objM107888l;
        int i13 = this.f170840w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj = this.f170842y;
        Object obj2 = this.f170841x;
        switch (i13) {
            case 0:
                return AbstractC39690c.m127017f((Function1) obj2, (C39691d) obj);
            case 1:
                return AbstractC39772c.m127352y((Function1) obj2, (AbstractC37625f.a) obj);
            case 2:
                return AbstractC39780k.m127390c0((Function1) obj2, (AbstractC37630k) obj);
            case 3:
                return AbstractC39782m.m127431G((Function1) obj2, (AbstractC37636q) obj);
            case 4:
                return AbstractC39795e.m127547P((Function1) obj2, (InterfaceC38655a) obj);
            case 5:
                C0684i0 c0684i0 = (C0684i0) obj2;
                AbstractC39872m0 request = (AbstractC39872m0) obj;
                ((C39863i) c0684i0.f2447z).getClass();
                AbstractC22676k.m65750j(request, "request");
                C37942a c37942a = new C37942a(20);
                URLConnection uRLConnectionOpenConnection = new URL(request.getUrl()).openConnection();
                AbstractC22676k.m65748h(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                c37942a.invoke(httpsURLConnection, request);
                C39866j0 c39866j0 = new C39866j0(httpsURLConnection);
                String url = request.getUrl();
                C30765d c30765d = (C30765d) c0684i0.f2443F;
                try {
                    C39874n0 c39874n0M127939b = c39866j0.m127939b();
                    c30765d.m94513c(c39874n0M127939b.toString());
                    objM107888l = c39874n0M127939b;
                    break;
                } catch (Throwable th3) {
                    objM107888l = AbstractC34132o.m107888l(th3);
                }
                Throwable thM68037a = C23468n.m68037a(objM107888l);
                if (thM68037a == null) {
                    return (C39874n0) objM107888l;
                }
                c30765d.m94512b("Exception while making Stripe API request", thM68037a);
                if (!(thM68037a instanceof IOException)) {
                    throw thM68037a;
                }
                int i14 = APIConnectionException.f22150F;
                throw AbstractC32120a.m99975a((IOException) thM68037a, url);
            case 6:
                return AbstractC39905b.m128016f((C39906c) obj, (Function1) obj2);
            case 7:
                ((C22669g0) obj2).f89336w = ((InterfaceC4339a) obj).invoke();
                return c23454a0;
            case 8:
                ((C37793d) obj2).f161895d.invoke((InterfaceC37796g) obj);
                return c23454a0;
            case 9:
                return new C39178j(AbstractC36220b.m115291C(((InterfaceC2215f) obj2).mo277G0((InterfaceC39147y) ((InterfaceC4339a) obj).invoke())));
            case 10:
                Context context = (Context) obj2;
                TextClassification textClassification = (TextClassification) obj;
                String text = textClassification.getText();
                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                if (Build.VERSION.SDK_INT >= 34) {
                    AbstractC2378g1.m7342q(activity);
                } else {
                    activity.send();
                }
                return c23454a0;
            case 11:
                return AbstractC40087c.m128475g((InterfaceC37988c) obj, (Function1) obj2);
            case 12:
                return AbstractC40088d.m128507z((Function1) obj2, (InterfaceC37988c.c) obj);
            case 13:
                return AbstractC40382k7.m130204j((InterfaceC28601c1) obj2, (C18425j) obj);
            case 14:
                return AbstractC40662a.m131979w((Function1) obj2, (C33840e) obj);
            case 15:
                return Float.valueOf(AbstractC40662a.m131982z((C26068u) obj2, (InterfaceC28593a1) obj));
            case 16:
                return AbstractC40664c.m131991i((Function1) obj2, (C33842g) obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC40671d.m132019d((C39577k) obj, (Function1) obj2);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC40687q.m132107j((Function1) obj2, (C39575i) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC40666a0.m132004g((Function1) obj2, (C39581o) obj);
            case 20:
                return AbstractC40878j.m132485e((C30911f) obj2, (String) obj);
            case 21:
                return AbstractC40894e.m132540q((Function1) obj2, (C40895f) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC40965f.m132938J((InterfaceC2994c0) obj2, (C40975p) obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC41068b.m133326n((Function1) obj2, (AbstractC12331a.a) obj);
            case 24:
                return AbstractC41134c.m133554g((Function1) obj2, (C41133b) obj);
            case 25:
                return AbstractC41135d.m133563g((Function1) obj2, (C41136e) obj);
            case 26:
                return AbstractC41140i.m133599k((C41139h) obj, (Function1) obj2);
            case 27:
                return AbstractC41169e.m133752s((InterfaceC15237i) obj2, (InterfaceC28601c1) obj);
            case 28:
                return MembershipManagementFragment.m22766O((MembershipManagementFragment) obj2, (C12991u0) obj);
            default:
                return AbstractC41231d.m133939r((Function1) obj2, (InterfaceC41233f) obj);
        }
    }

    public /* synthetic */ C39689b(Object obj, Function1 function1, int i13) {
        this.f170840w = i13;
        this.f170842y = obj;
        this.f170841x = function1;
    }
}
