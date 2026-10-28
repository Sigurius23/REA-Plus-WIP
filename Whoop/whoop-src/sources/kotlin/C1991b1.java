package kotlin;

import android.app.Application;
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1601k1;
import androidx.lifecycle.C1646z1;
import au0.C2055f;
import au2.AbstractC2078c;
import au2.AbstractC2083h;
import aw0.AbstractC2102b;
import aw0.AbstractC2112l;
import ay1.AbstractC2154b;
import az1.AbstractC2166g;
import az1.AbstractC2167h;
import az1.AbstractC2173n;
import b01.AbstractC2181b;
import b10.C2222b;
import b20.C2326f;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivity;
import com.whoop.navigation.C9598e;
import cy.AbstractC11180a;
import e20.C12593a;
import kr.C22786e;
import l83.C23454a0;
import m83.AbstractC25265s;
import p003a1.C0111j;
import p023ay.C2126b0;
import p023ay.C2128c0;
import p023ay.C2136j;
import p023ay.C2146t;
import p209i3.InterfaceC18044z;
import p270k2.InterfaceC22131e;
import p298l8.AbstractC23420c;
import p442qy.C30765d;
import p499t9.C33623c0;
import p499t9.C33647p;
import p500tb.InterfaceC33687a;
import p664yy.C39865j;
import p698au1.AbstractC2063h;
import p698au1.AbstractC2072q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.C25308q;
import q83.InterfaceC30063j;
import u00.C34377e;
import uy.C35373a;
import v03.C35516c;
import v03.InterfaceC35521h;
import ws2.AbstractC37617i;
import wy1.InterfaceC37694a;
import yt1.InterfaceC39768a;
import yx1.InterfaceC39843d;
import yy1.AbstractC39895c;
import zt1.InterfaceC41129d;

/* JADX INFO: renamed from: at2.b1 */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C1991b1 implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f7877w;

    public /* synthetic */ C1991b1(int i13) {
        this.f7877w = i13;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7877w) {
            case 0:
                return AbstractC1997d1.m6140o((AbstractC37617i) obj);
            case 1:
                return AbstractC1997d1.m6144s((InterfaceC18044z) obj);
            case 2:
                return AbstractC2003f1.m6159h((AbstractC37617i) obj);
            case 3:
                return C2055f.m6474u((InterfaceC33687a) obj);
            case 4:
                return AbstractC2063h.m6498f((InterfaceC39768a) obj);
            case 5:
                return p698au1.Function1.m6509e((InterfaceC41129d) obj);
            case 6:
                return AbstractC2072q.m6522H((InterfaceC41129d) obj);
            case 7:
                return AbstractC2072q.m6523I((InterfaceC39768a) obj);
            case 8:
                return AbstractC2072q.m6551u((InterfaceC41129d) obj);
            case 9:
                return AbstractC2072q.m6552v((InterfaceC39768a) obj);
            case 10:
                return AbstractC2078c.m6574k((InterfaceC22131e) obj);
            case 11:
                return AbstractC2083h.m6594i((C9598e) obj);
            case 12:
                return AbstractC2102b.m6640h(obj);
            case 13:
                return AbstractC2102b.m6645m(obj);
            case 14:
                return AbstractC2112l.m6675g((C25308q) obj);
            case 15:
                Context context = (Context) obj;
                AbstractC22676k.m65750j(context, "context");
                C2128c0 c2128c0 = new C2128c0(context);
                c2128c0.setBackgroundColor(0);
                WebSettings settings = c2128c0.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setDomStorageEnabled(true);
                return c2128c0;
            case 16:
                C2128c0 view = (C2128c0) obj;
                AbstractC22676k.m65750j(view, "view");
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return C23454a0.f92919a;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                AbstractC23420c initializer = (AbstractC23420c) obj;
                AbstractC22676k.m65750j(initializer, "$this$initializer");
                C1601k1 c1601k1M5015e = AbstractC1613o1.m5015e(initializer);
                Object objMo67910a = initializer.mo67910a(C1646z1.f6353d);
                AbstractC22676k.m65748h(objMo67910a, "null cannot be cast to non-null type android.app.Application");
                Application application = (Application) objMo67910a;
                int i13 = IntentConfirmationChallengeActivity.f22141y;
                C2146t c2146t = (C2146t) c1601k1M5015e.m5001b("intent_confirmation_challenge_args");
                if (c2146t == null) {
                    throw new IllegalArgumentException("No IntentConfirmationChallengeArgs found");
                }
                C33647p c33647p = new C33647p(7);
                C33623c0 c33623c0 = new C33623c0();
                InterfaceC35521h interfaceC35521hM112678b = C35516c.m112678b(new C12593a(c33647p, AbstractC11180a.f35799a, 5));
                InterfaceC35521h interfaceC35521hM112678b2 = C35516c.m112678b(new C35373a(c33623c0, 1));
                InterfaceC35521h interfaceC35521hM112678b3 = C35516c.m112678b(new C35373a(c33623c0, 0));
                return new C2126b0(new C2136j(new C22786e(11), new C34377e(10), c2146t, (C30765d) interfaceC35521hM112678b.get(), new C2326f(new C39865j((C30765d) interfaceC35521hM112678b.get(), (InterfaceC30063j) interfaceC35521hM112678b2.get()), new C2222b(application, AbstractC25265s.m74103I1(c2146t.f8542x), new C0111j(c2146t, 27)))), (InterfaceC30063j) interfaceC35521hM112678b3.get());
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC2154b.m6706e((InterfaceC39843d) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC2166g.m6762r((AbstractC39895c) obj);
            case 20:
                return AbstractC2166g.m6767w((InterfaceC37694a) obj);
            case 21:
                return AbstractC2166g.m6769y((AbstractC39895c) obj);
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return AbstractC2166g.m6738A(obj);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return AbstractC2167h.m6783l((AbstractC39895c) obj);
            case 24:
                return AbstractC2167h.m6787p((AbstractC39895c) obj);
            case 25:
                return AbstractC2173n.m6843y((String) obj);
            case 26:
                return AbstractC2173n.m6844z((AbstractC39895c) obj);
            case 27:
                return AbstractC2173n.m6799E((String) obj);
            case 28:
                return AbstractC2173n.m6800F((AbstractC39895c) obj);
            default:
                return AbstractC2181b.m6869e(obj);
        }
    }
}
