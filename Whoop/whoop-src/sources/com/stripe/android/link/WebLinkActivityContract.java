package com.stripe.android.link;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import b10.C2273z0;
import b10.InterfaceC2227c1;
import b20.C2326f;
import b20.EnumC2325e;
import com.stripe.android.link.serialization.C5638b;
import com.stripe.android.link.serialization.PopupPayload;
import f00.EnumC13841a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l83.C23468n;
import m83.AbstractC25267u;
import m83.C25235a0;
import org.json.JSONObject;
import p029b5.AbstractC2724c;
import p267k.AbstractC22081b;
import p499t9.C33623c0;
import p505ts.AbstractC34132o;
import p537ux.C35362x;
import p537ux.C35363y;
import p550vd.AbstractC35903f;
import p599wz.AbstractC37747q;
import p599wz.C37702b;
import p599wz.C37712e0;
import p599wz.C37715f0;
import p599wz.C37718g0;
import p599wz.C37729k;
import p599wz.C37735m;
import p599wz.C37741o;
import p599wz.C37744p;
import p599wz.EnumC37732l;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38840g6;
import y00.C38887l3;
import y00.C38915o4;
import y00.EnumC38828f4;
import y00.InterfaceC38802c8;
import yb3.AbstractC39397a;
import z00.C39932a;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, m65681d2 = {"Lcom/stripe/android/link/WebLinkActivityContract;", "Lk/b;", "Lwz/k;", "Lwz/q;", "paymentsheet_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class WebLinkActivityContract extends AbstractC22081b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2227c1 f22205a;

    /* JADX INFO: renamed from: b */
    public final C2326f f22206b;

    public WebLinkActivityContract(InterfaceC2227c1 stripeRepository, C2326f errorReporter) {
        AbstractC22676k.m65750j(stripeRepository, "stripeRepository");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        this.f22205a = stripeRepository;
        this.f22206b = errorReporter;
    }

    @Override // p267k.AbstractC22081b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Intent createIntent(Context context, C37729k input) {
        EnumC13841a enumC13841a;
        boolean zM124359b;
        AbstractC22676k.m65750j(input, "input");
        C35363y c35363y = C35363y.f150632y;
        PopupPayload.PaymentInfo paymentInfo = null;
        if (c35363y == null) {
            SharedPreferences sharedPreferences = new C35362x(context).f150631a;
            String string = sharedPreferences.getString("key_publishable_key", null);
            c35363y = string != null ? new C35363y(string, sharedPreferences.getString("key_account_id", null)) : null;
            if (c35363y == null) {
                throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
            }
            C35363y.f150632y = c35363y;
        }
        C5638b c5638b = PopupPayload.Companion;
        C37718g0 configuration = input.f161671a;
        String publishableKey = c35363y.f150633w;
        String str = c35363y.f150634x;
        String paymentUserAgent = ((C2273z0) this.f22205a).m7081c(C25235a0.f99113w);
        c5638b.getClass();
        AbstractC22676k.m65750j(configuration, "configuration");
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        AbstractC22676k.m65750j(paymentUserAgent, "paymentUserAgent");
        String str2 = configuration.f161637x;
        InterfaceC38802c8 interfaceC38802c8 = configuration.f161636w;
        PopupPayload.MerchantInfo merchantInfo = new PopupPayload.MerchantInfo(str2, configuration.f161639z);
        C37715f0 c37715f0 = configuration.f161606F;
        String str3 = c37715f0.f161585x;
        String country = c37715f0.f161587z;
        if (country == null) {
            country = context.getResources().getConfiguration().getLocales().get(0).getCountry();
            AbstractC22676k.m65749i(country, "getCountry(...)");
        }
        PopupPayload.CustomerInfo customerInfo = new PopupPayload.CustomerInfo(str3, country);
        C37712e0 c37712e0 = configuration.f161610J;
        PopupPayload.CardBrandChoice cardBrandChoice = c37712e0 != null ? new PopupPayload.CardBrandChoice(c37712e0.f161578w, c37712e0.f161579x) : null;
        boolean z4 = interfaceC38802c8 instanceof C38887l3;
        if (z4) {
            C38887l3 c38887l3 = (C38887l3) interfaceC38802c8;
            String str4 = c38887l3.f167376K;
            Long l7 = c38887l3.f167393y;
            if (str4 != null && l7 != null) {
                paymentInfo = new PopupPayload.PaymentInfo(str4, l7.longValue());
            }
        } else if (!(interfaceC38802c8 instanceof C38840g6)) {
            throw new NoWhenBranchMatchedException();
        }
        PopupPayload.PaymentInfo paymentInfo2 = paymentInfo;
        String packageName = context.getApplicationInfo().packageName;
        AbstractC22676k.m65749i(packageName, "packageName");
        String country2 = context.getResources().getConfiguration().getLocales().get(0).getCountry();
        AbstractC22676k.m65749i(country2, "getCountry(...)");
        boolean z13 = configuration.f161608H;
        String str5 = z13 ? "card_payment_method" : "link_payment_method";
        if (z4) {
            enumC13841a = EnumC13841a.Payment;
        } else {
            if (!(interfaceC38802c8 instanceof C38840g6)) {
                throw new NoWhenBranchMatchedException();
            }
            enumC13841a = EnumC13841a.Setup;
        }
        String str6 = enumC13841a.f49381w;
        if (z4) {
            if (z13) {
                C33623c0 c33623c0 = EnumC38828f4.f167088G;
                zM124359b = ((C38887l3) interfaceC38802c8).m124359b("card");
            } else {
                C33623c0 c33623c1 = EnumC38828f4.f167088G;
                zM124359b = ((C38887l3) interfaceC38802c8).m124359b("link");
            }
        } else {
            if (!(interfaceC38802c8 instanceof C38840g6)) {
                throw new NoWhenBranchMatchedException();
            }
            zM124359b = true;
        }
        boolean z14 = zM124359b;
        Map map = configuration.f161609I;
        List listMo124333i0 = interfaceC38802c8.mo124333i0();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listMo124333i0, 10));
        Iterator it = listMo124333i0.iterator();
        while (it.hasNext()) {
            Map map2 = map;
            String upperCase = ((String) it.next()).toUpperCase(Locale.ROOT);
            AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
            arrayList.add(upperCase);
            map = map2;
        }
        PopupPayload popupPayload = new PopupPayload(publishableKey, str, merchantInfo, customerInfo, paymentInfo2, packageName, country2, paymentUserAgent, str5, str6, z14, cardBrandChoice, map, arrayList, configuration.f161635i0.mo124325c0());
        int i13 = LinkForegroundActivity.f22201x;
        String popupUrl = popupPayload.toUrl();
        AbstractC22676k.m65750j(popupUrl, "popupUrl");
        Intent intentPutExtra = new Intent(context, (Class<?>) LinkForegroundActivity.class).putExtra("LinkPopupUrl", popupUrl);
        AbstractC22676k.m65749i(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    @Override // p267k.AbstractC22081b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC37747q parseResult(int i13, Intent intent) {
        Uri data;
        Object objM107888l;
        Bundle extras;
        C37702b c37702b = C37702b.f161559w;
        if (i13 == 0) {
            return new C37735m(c37702b);
        }
        C38915o4 c38915o4 = null;
        Serializable serializableM7691c = null;
        exc = null;
        Exception exc = null;
        Object obj = null;
        if (i13 != 49871) {
            if (i13 != 91367) {
                return new C37735m(c37702b);
            }
            if (intent != null && (extras = intent.getExtras()) != null) {
                if (Build.VERSION.SDK_INT >= 34) {
                    serializableM7691c = AbstractC2724c.m7691c(extras);
                } else {
                    Serializable serializable = extras.getSerializable("LinkFailure");
                    if (Exception.class.isInstance(serializable)) {
                        serializableM7691c = serializable;
                    }
                }
                exc = (Exception) serializableM7691c;
            }
            return exc != null ? new C37741o(exc, c37702b) : new C37735m(c37702b);
        }
        if (intent == null || (data = intent.getData()) == null) {
            return new C37735m(c37702b);
        }
        String queryParameter = data.getQueryParameter("link_status");
        if (queryParameter != null) {
            int iHashCode = queryParameter.hashCode();
            if (iHashCode != -1097329270) {
                if (iHashCode == -599445191 && queryParameter.equals("complete")) {
                    String queryParameter2 = data.getQueryParameter("pm");
                    if (queryParameter2 != null) {
                        try {
                            byte[] bArrDecode = Base64.decode(queryParameter2, 0);
                            AbstractC22676k.m65749i(bArrDecode, "decode(...)");
                            objM107888l = new C39932a(29).m128096d(new JSONObject(new String(bArrDecode, AbstractC39397a.f169546a)));
                        } catch (Throwable th3) {
                            objM107888l = AbstractC34132o.m107888l(th3);
                        }
                        Throwable thM68037a = C23468n.m68037a(objM107888l);
                        if (thM68037a == null) {
                            obj = objM107888l;
                        } else {
                            AbstractC35903f.m113990H(this.f22206b, EnumC2325e.LINK_WEB_FAILED_TO_PARSE_RESULT_URI, new FailedToParseLinkResultUriException(0, 23, null, null, thM68037a, null), null, 4);
                        }
                        c38915o4 = (C38915o4) obj;
                    }
                    return c38915o4 == null ? new C37735m(c37702b) : new C37744p(c38915o4);
                }
            } else if (queryParameter.equals("logout")) {
                return new C37735m(EnumC37732l.f161681x, c37702b);
            }
        }
        return new C37735m(c37702b);
    }
}
