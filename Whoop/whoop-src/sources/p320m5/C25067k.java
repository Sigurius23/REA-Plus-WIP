package p320m5;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.health.platform.client.proto.AbstractC1433a;
import androidx.health.platform.client.proto.AbstractC1534u0;
import androidx.health.platform.client.proto.C1474i0;
import androidx.health.platform.client.proto.C1479j0;
import androidx.health.platform.client.proto.C1483k;
import androidx.health.platform.client.proto.C1533u;
import bc3.C2996c2;
import c53.AbstractC4257c;
import c53.C4255a;
import c93.InterfaceC4339a;
import com.squareup.wire.AbstractC5586q;
import com.squareup.wire.C5578i;
import com.squareup.wire.C5585p;
import ec3.C13045h2;
import eu.C13610f;
import io.sentry.android.replay.video.C20245d;
import j63.AbstractC21386c;
import j63.AbstractC21387d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23454a0;
import lr.RunnableC24693e;
import m83.AbstractC25265s;
import nf3.C26669a;
import p000.AbstractC11266d;
import p241j3.C21266c;
import p328mj.C25607n;
import p329n0.C26062o;
import p390p1.C28679w;
import p450r5.C30931e;
import p474s.C31983m2;
import p480s5.C32198a;
import p497t7.C33562c;
import p507tx.AbstractC34232c;
import p507tx.C34231b;
import p530up.AbstractC35148d;
import p575w7.AbstractC36868a;
import p626xu.C38651a;
import p635y2.C39091f0;
import p635y2.C39092f1;
import p635y2.C39141w;
import p660yu.C39783a;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import pg3.C29222x0;
import q30.C29934u0;
import rf3.C31364c;
import stream.video.sfu.models.AudioBitrateProfile;
import t23.C33358a2;
import t23.C33392g2;
import t23.C33415l0;
import t23.C33426n1;
import t23.C33450s0;
import t23.C33476x1;
import ug3.C34954c;
import v23.C35587a;
import vf3.C35953c;
import wf3.C37247a;
import x03.C37804a;
import x03.C37805b;
import x03.C37806c;
import xb3.AbstractC38176k;
import xb3.C38184s;
import xf3.C38266c;
import y33.C39202e;
import z33.C40053b;

/* JADX INFO: renamed from: m5.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C25067k extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f98199w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f98200x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25067k(Object obj, int i13) {
        super(0);
        this.f98199w = i13;
        this.f98200x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        C28679w c28679w;
        switch (this.f98199w) {
            case 0:
                ((C13610f) this.f98200x).mo38428a(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
                return C23454a0.f92919a;
            case 1:
                ((C25607n) this.f98200x).invoke();
                return C23454a0.f92919a;
            case 2:
                ((C26669a) this.f98200x).f106047b.m99481e();
                return C23454a0.f92919a;
            case 3:
                return "|- create scope - id:'connectStrapScopeId' q:" + ((C35953c) this.f98200x);
            case 4:
                C30931e c30931e = (C30931e) this.f98200x;
                c30931e.m95140f().execute(new RunnableC24693e(c30931e, 13));
                return C23454a0.f92919a;
            case 5:
                C32198a c32198a = (C32198a) this.f98200x;
                Executor executor = c32198a.f133336f;
                if (executor != null) {
                    executor.execute(new RunnableC24693e(c32198a, 17));
                    return C23454a0.f92919a;
                }
                AbstractC22676k.m65757q("executor");
                throw null;
            case 6:
                return (AudioBitrateProfile) ((C33476x1) this.f98200x).f139758f.f139207r.getValue();
            case 7:
                C33358a2 c33358a2 = (C33358a2) this.f98200x;
                C13045h2 c13045h2 = c33358a2.f139199j;
                c13045h2.getClass();
                c13045h2.m36571k(null, C33426n1.f139555a);
                c33358a2.f139190a.m105875d(C33415l0.f139528O);
                return C23454a0.f92919a;
            case 8:
                C33392g2 c33392g2 = (C33392g2) this.f98200x;
                C29934u0 c29934u0 = c33392g2.f139424c;
                String sessionId = c33392g2.f139422a;
                c29934u0.getClass();
                AbstractC22676k.m65750j(sessionId, "sessionId");
                return Boolean.valueOf(sessionId.equals(((C33450s0) c29934u0.f122249x).f139640b.f139269D));
            case 9:
                C1474i0 c1474i0M4645u = C1479j0.m4645u();
                C33562c c33562c = (C33562c) this.f98200x;
                int i13 = c33562c.f140040x;
                c1474i0M4645u.m4815c();
                C1479j0.m4643p((C1479j0) c1474i0M4645u.f6114x, i13);
                String str = c33562c.f140041y;
                if (str != null) {
                    c1474i0M4645u.m4815c();
                    C1479j0.m4644q((C1479j0) c1474i0M4645u.f6114x, str);
                }
                return (C1479j0) c1474i0M4645u.m4813a();
            case 10:
                C34231b c34231b = (C34231b) ((AbstractC34232c) this.f98200x);
                String str2 = c34231b.f143607j;
                ClassLoader classLoader = c34231b.f143600c;
                String str3 = c34231b.f143606i;
                if (str3.length() <= 0) {
                    AbstractC5586q.Companion.getClass();
                    AbstractC5586q abstractC5586qWithLabel$wire_runtime = C5585p.m16803b(str2, classLoader).withLabel$wire_runtime(c34231b.f143601d);
                    AbstractC22676k.m65748h(abstractC5586qWithLabel$wire_runtime, "null cannot be cast to non-null type com.squareup.wire.ProtoAdapter<kotlin.Any>");
                    return abstractC5586qWithLabel$wire_runtime;
                }
                C5585p c5585p = AbstractC5586q.Companion;
                c5585p.getClass();
                AbstractC5586q abstractC5586qM16803b = C5585p.m16803b(str3, classLoader);
                c5585p.getClass();
                return new C5578i(abstractC5586qM16803b, C5585p.m16803b(str2, classLoader));
            case 11:
                C35587a c35587a = (C35587a) this.f98200x;
                C13045h2 c13045h3 = c35587a.f151344g.f37369a;
                c13045h3.getClass();
                c13045h3.m36571k(null, "");
                C20245d c20245d = c35587a.f151343f;
                ((AtomicBoolean) c20245d.f76051g).set(false);
                C2996c2 c2996c2 = (C2996c2) c20245d.f76052h;
                if (c2996c2 != null) {
                    c2996c2.cancel((CancellationException) null);
                }
                c20245d.f76052h = null;
                return C23454a0.f92919a;
            case 12:
                AbstractC1433a abstractC1433aMo4557b = ((AbstractC36868a) this.f98200x).mo4557b();
                abstractC1433aMo4557b.getClass();
                try {
                    int iMo4563b = ((AbstractC1534u0) abstractC1433aMo4557b).mo4563b(null);
                    byte[] bArr = new byte[iMo4563b];
                    C1483k c1483k = new C1483k(bArr, iMo4563b);
                    abstractC1433aMo4557b.mo4564c(c1483k);
                    if (iMo4563b - c1483k.f6061f == 0) {
                        return bArr;
                    }
                    throw new IllegalStateException("Did not write as much data as expected.");
                } catch (IOException e5) {
                    throw new RuntimeException("Serializing " + abstractC1433aMo4557b.getClass().getName() + " to a byte array threw an IOException (should never happen).", e5);
                }
            case 13:
                HashMap map = new HashMap();
                C38651a c38651a = (C38651a) this.f98200x;
                map.put("id", new C39783a("id", c38651a.f166298d));
                map.put("type", new C39783a("type", "line"));
                String str4 = c38651a.f166295a;
                if (str4 != null) {
                    map.put("source", new C39783a("source", str4));
                }
                return map;
            case 14:
                C37805b c37805b = (C37805b) this.f98200x;
                C38184s c38184sM122272A = AbstractC38176k.m122272A(AbstractC25265s.m74145r0((Iterable) c37805b.f161917a.m77565h().f103177k), C37804a.f161916w);
                Iterator it = c38184sM122272A.f163498a.iterator();
                Object obj = null;
                while (it.hasNext()) {
                    Object objInvoke = c38184sM122272A.f163499b.invoke(it.next());
                    C37806c c37806c = (C37806c) objInvoke;
                    if (((C26062o) c37806c.f161921a).f103198o <= ((Number) c37805b.f161918b.invoke(c37805b, c37806c)).intValue()) {
                        obj = objInvoke;
                    }
                }
                return (C37806c) obj;
            case 15:
                C38266c c38266c = (C38266c) this.f98200x;
                c38266c.f164066i = true;
                String str5 = c38266c.f164059b;
                ArrayList arrayList = c38266c.f164064g;
                c38266c.f164063f = null;
                C26669a c26669a = c38266c.f164061d;
                if (c26669a.f106048c.m92137D(1)) {
                    c26669a.f106048c.m92136C("closing scope:'" + str5 + '\'');
                }
                Iterator it3 = arrayList.iterator();
                if (it3.hasNext()) {
                    throw AbstractC11266d.m30454h(it3);
                }
                arrayList.clear();
                C37247a c37247a = c26669a.f106046a;
                c37247a.getClass();
                C31983m2 c31983m2 = c37247a.f159361a.f106047b;
                c31983m2.getClass();
                Collection collectionValues = ((ConcurrentHashMap) c31983m2.f132769x).values();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : collectionValues) {
                    if (obj2 instanceof C31364c) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    ((C31364c) it4.next()).f129024b.remove(str5);
                }
                c37247a.f159363c.remove(str5);
                return C23454a0.f92919a;
            case 16:
                C39091f0 c39091f0 = (C39091f0) this.f98200x;
                if (!((Boolean) c39091f0.f168168g.getValue()).booleanValue() && (c28679w = c39091f0.f168164c) != null) {
                    c28679w.m87218l();
                }
                return C23454a0.f92919a;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C39092f1 c39092f1 = (C39092f1) this.f98200x;
                C39141w c39141w = c39092f1.f168171P;
                C21266c c21266c = c39141w != null ? (C21266c) c39141w.f168289a.getValue() : null;
                if (!AbstractC22676k.m65745e(c39092f1.f168177V, c21266c)) {
                    c39092f1.f168177V = c21266c;
                    C21266c c21266c2 = c39092f1.f168176U;
                    if (c21266c2 != null) {
                        c39092f1.m124617X0(c21266c2, c21266c);
                    }
                }
                return C23454a0.f92919a;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C4255a c4255aM111177h = AbstractC35148d.m111177h(AbstractC4257c.m13288a(), null, 2);
                Object systemService = ((Context) this.f98200x).getSystemService("connectivity");
                AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
                return new C40053b(c4255aM111177h, (ConnectivityManager) systemService);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C29222x0 c29222x0 = new C29222x0();
                C39202e c39202e = (C39202e) this.f98200x;
                c29222x0.m88731e(c39202e.f168485c);
                c29222x0.m88728b(new C34954c(1));
                c29222x0.m88729c(c39202e.f168483a + "/");
                return c29222x0.m88730d();
            default:
                return ((AbstractC21386c) ((AbstractC21387d) this.f98200x)).mo1204d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25067k(C39202e c39202e, Context context) {
        super(0);
        this.f98199w = 18;
        this.f98200x = context;
    }
}
