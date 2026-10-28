package a20;

import a61.AbstractC0470c;
import a61.C0472e;
import a80.AbstractC0548l;
import a81.InterfaceC0569t;
import aa2.C0597f;
import aa2.C0598g;
import aa2.C0600i;
import ai1.C0912d;
import am2.AbstractC1035o0;
import am2.C1037p0;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.C1627t0;
import aq0.C1906q;
import ar2.AbstractC1936g;
import ar2.C1932c;
import au2.AbstractC2083h;
import az1.AbstractC2166g;
import az1.AbstractC2173n;
import b01.AbstractC2195p;
import b10.C2222b;
import b10.C2273z0;
import b30.C2482b;
import b30.C2490c;
import b30.C2547j0;
import bb2.AbstractC2933i;
import bi1.C3284a;
import c93.InterfaceC4351m;
import c93.InterfaceC4352n;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import com.whoop.android.R;
import com.whoop.trends.view.TrendsFragment;
import eb2.C13006a;
import ec.InterfaceC13008a;
import eq0.AbstractC13531t;
import eq0.AbstractC13550x;
import io.getstream.chat.android.p226ui.viewmodel.messages.MessageListViewModel;
import java.util.Set;
import k21.C22157a;
import kotlin.AbstractC1993c0;
import kotlin.AbstractC2036w;
import kz.C22915l;
import l83.C23454a0;
import l83.C23468n;
import m83.C25235a0;
import o20.C27457b;
import org.json.JSONObject;
import p114eb.C12991u0;
import p329n0.InterfaceC26064q;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p499t9.C33623c0;
import p499t9.C33647p;
import p500tb.InterfaceC33687a;
import p698au1.AbstractC2072q;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22659b0;
import wt2.C37620a;
import wy1.C37695b;
import y00.AbstractC39006y5;
import y00.C38809d5;
import y00.C38892m;
import y00.C38915o4;
import y00.C38928q;
import y00.C38937r;
import y00.C38982w;
import y00.C38997x5;
import y00.C38998x6;
import y00.EnumC38828f4;
import y00.EnumC38832f8;
import y00.InterfaceC38802c8;
import y70.C39267c;
import yl2.AbstractC39640g;
import yl2.C39644k;
import ys2.AbstractC39758e;
import z00.C39932a;
import z10.C39989l;
import z10.C39991n;
import zt1.InterfaceC41128c;

/* JADX INFO: renamed from: a20.g */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0167g implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f496w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f497x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f498y;

    public /* synthetic */ C0167g(int i13, Object obj, Object obj2) {
        this.f496w = i13;
        this.f497x = obj;
        this.f498y = obj2;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C38915o4 c38915o4M128096d;
        Set setM124342h;
        String str;
        String str2;
        LayoutInflater layoutInflaterFrom;
        int i13 = this.f496w;
        String str3 = null;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f498y;
        Object obj3 = this.f497x;
        switch (i13) {
            case 0:
                C0170j c0170j = (C0170j) obj3;
                C22915l c22915l = (C22915l) obj2;
                InterfaceC38802c8 interfaceC38802c8 = (InterfaceC38802c8) obj;
                String str4 = c22915l.f90467w;
                c0170j.getClass();
                try {
                    c38915o4M128096d = new C39932a(29).m128096d(new JSONObject(str4));
                    break;
                } catch (Exception e5) {
                    c0170j.f508G.m94512b("Failed to parse PaymentMethod", e5);
                    c38915o4M128096d = null;
                }
                return new C39991n(interfaceC38802c8, null, c38915o4M128096d != null ? new C39989l(c38915o4M128096d, c22915l.f90468x, c22915l.f90469y, c22915l.f90470z) : null);
            case 1:
                return AbstractC0470c.m1143n((Function1) obj3, (C0472e) obj2, obj);
            case 2:
                return AbstractC0548l.m1349k((C39267c.d) obj3, (Function1) obj2, (InterfaceC26064q) obj);
            case 3:
                return ((C0597f) obj3).m1581z((C0598g) obj2, (InterfaceC33687a) obj);
            case 4:
                return ((C0597f) obj3).m1563A((C0600i) obj2, (InterfaceC33687a) obj);
            case 5:
                return ((C0912d) obj3).m2253m((C3284a) obj2, (InterfaceC33687a) obj);
            case 6:
                return TrendsFragment.m26635m0((TrendsFragment) obj3, (C39644k) obj2, (AbstractC39640g) obj);
            case 7:
                return AbstractC1035o0.m2818E0((InterfaceC4351m) obj3, (C1037p0) obj2, obj);
            case 8:
                return AbstractC1035o0.m2868c0((Function1) obj3, (C22157a) obj2, obj);
            case 9:
                C1627t0 c1627t0 = (C1627t0) obj3;
                C22659b0 c22659b0 = (C22659b0) obj2;
                Object value = c1627t0.getValue();
                if (c22659b0.f89329w || ((value == null && obj != null) || (value != null && !value.equals(obj)))) {
                    c22659b0.f89329w = false;
                    c1627t0.setValue(obj);
                }
                return c23454a0;
            case 10:
                return C1906q.m5766c2((AbstractC13531t) obj3, (C1906q) obj2, (View) obj);
            case 11:
                return C1906q.m5760a2((C1906q) obj3, (MessageListViewModel) obj2, (View) obj);
            case 12:
                return C1906q.m5780h2((AbstractC13550x) obj3, (C1906q) obj2, (View) obj);
            case 13:
                return AbstractC1936g.m5934h((Function1) obj3, (C1932c) obj2, obj);
            case 14:
                return AbstractC2036w.m6405x((Function1) obj3, (AbstractC39758e.i) obj2, obj);
            case 15:
                return AbstractC1993c0.m6090u((Function1) obj3, (AbstractC39758e.j) obj2, obj);
            case 16:
                return AbstractC2072q.m6526L((Function1) obj3, (InterfaceC41128c.c) obj2, obj);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return AbstractC2083h.m6599n((Function1) obj3, (C37620a) obj2, obj);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return AbstractC2166g.m6741D((C37695b) obj3, (Function1) obj2, (String) obj);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return AbstractC2173n.m6796B((Function1) obj3, (C12991u0) obj2, (String) obj);
            case 20:
                return AbstractC2195p.m6908J((InterfaceC28670t2) obj3, (InterfaceC4352n) obj2, (InterfaceC26064q) obj);
            case 21:
                C2273z0 c2273z0 = (C2273z0) obj3;
                C2222b c2222b = c2273z0.f9019j;
                PaymentAnalyticsEvent paymentAnalyticsEvent = PaymentAnalyticsEvent.ConfirmationTokenCreate;
                C38809d5 c38809d5 = ((C38982w) obj2).f167796x;
                if (c38809d5 == null || (setM124342h = c38809d5.m124342h()) == null) {
                    setM124342h = C25235a0.f99113w;
                }
                c2273z0.f9017h.m127938a(C2222b.m7051c(c2222b, paymentAnalyticsEvent, setM124342h, null, null, null, 60));
                return c23454a0;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C2273z0 c2273z1 = (C2273z0) obj3;
                AbstractC39006y5 abstractC39006y5 = (AbstractC39006y5) obj2;
                C2222b c2222b2 = c2273z1.f9019j;
                abstractC39006y5.getClass();
                C33623c0 c33623c0 = EnumC38828f4.f167088G;
                Set productUsageTokens = ((C38997x5) abstractC39006y5).f167846E;
                c2222b2.getClass();
                AbstractC22676k.m65750j(productUsageTokens, "productUsageTokens");
                c2273z1.f9017h.m127938a(C2222b.m7051c(c2222b2, PaymentAnalyticsEvent.PaymentMethodUpdate, productUsageTokens, "card", null, null, 56));
                return c23454a0;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C2273z0 c2273z2 = (C2273z0) obj3;
                C23468n c23468n = (C23468n) obj;
                C2222b c2222b3 = c2273z2.f9019j;
                C38809d5 c38809d6 = ((C38937r) obj2).f167620y;
                str3 = c38809d6 != null ? c38809d6.f167026w : null;
                String strM7055A = c2273z2.m7055A(c23468n.f92940w);
                c2222b3.getClass();
                c2273z2.f9017h.m127938a(C2222b.m7051c(c2222b3, PaymentAnalyticsEvent.SetupIntentConfirm, null, str3, null, strM7055A, 26));
                return c23454a0;
            case 24:
                C2273z0 c2273z3 = (C2273z0) obj3;
                C38809d5 c38809d7 = (C38809d5) obj2;
                C2222b c2222b4 = c2273z3.f9019j;
                String paymentMethodCode = c38809d7.f167026w;
                Set productUsageTokens2 = c38809d7.m124342h();
                c2222b4.getClass();
                AbstractC22676k.m65750j(paymentMethodCode, "paymentMethodCode");
                AbstractC22676k.m65750j(productUsageTokens2, "productUsageTokens");
                c2273z3.f9017h.m127938a(C2222b.m7051c(c2222b4, PaymentAnalyticsEvent.PaymentMethodCreate, productUsageTokens2, paymentMethodCode, null, null, 56));
                return c23454a0;
            case 25:
                C38928q c38928q = (C38928q) obj3;
                C2273z0 c2273z4 = (C2273z0) obj2;
                C23468n c23468n2 = (C23468n) obj;
                C38809d5 c38809d8 = c38928q.f167576w;
                if (c38809d8 == null || (str2 = c38809d8.f167026w) == null) {
                    C38998x6 c38998x6 = c38928q.f167578y;
                    if (c38998x6 != null) {
                        str3 = AbstractC22676k.m65745e(c38998x6.f167858w, "card") ? "card" : "unknown";
                    }
                    str = str3;
                } else {
                    str = str2;
                }
                C2222b c2222b5 = c2273z4.f9019j;
                String strM7055A2 = c2273z4.m7055A(c23468n2.f92940w);
                c2222b5.getClass();
                c2273z4.f9017h.m127938a(C2222b.m7051c(c2222b5, PaymentAnalyticsEvent.PaymentIntentConfirm, null, str, null, strM7055A2, 26));
                return c23454a0;
            case 26:
                C2273z0 c2273z5 = (C2273z0) obj3;
                C2222b c2222b6 = c2273z5.f9019j;
                Set set = ((C38892m) obj2).f167424w;
                C33647p c33647p = EnumC38832f8.f167151x;
                c2222b6.getClass();
                c2273z5.f9017h.m127938a(C2222b.m7051c(c2222b6, PaymentAnalyticsEvent.TokenCreate, set, null, null, null, 52));
                return c23454a0;
            case 27:
                ((C2547j0) obj3).m7467a(new C2490c((C27457b) obj, ((C2482b) ((InterfaceC28601c1) obj2).getValue()).f9663a));
                return c23454a0;
            case 28:
                AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0 = (AbstractComponentCallbacksC1320m0) obj3;
                Function3 function3 = (Function3) obj2;
                Context context = (Context) obj;
                if (abstractComponentCallbacksC1320m0 == null || (layoutInflaterFrom = abstractComponentCallbacksC1320m0.getLayoutInflater()) == null) {
                    layoutInflaterFrom = LayoutInflater.from(context);
                }
                InterfaceC13008a interfaceC13008a = (InterfaceC13008a) function3.invoke(layoutInflaterFrom, new FrameLayout(context), Boolean.FALSE);
                View root = interfaceC13008a.getRoot();
                root.setTag(R.id.binding_reference, interfaceC13008a);
                return root;
            default:
                return AbstractC2933i.m8560n((C13006a) obj3, (Function1) obj2, (InterfaceC0569t) obj);
        }
    }
}
