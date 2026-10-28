package p023ay;

import a30.C0273a;
import a30.C0290f1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.view.Window;
import android.widget.Toast;
import androidx.health.platform.client.proto.C1533u;
import b10.C2222b;
import b33.EnumC2688i;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.EnumC2998d0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import bm.C3396t;
import bs1.C3595n;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cm.AbstractC4803d;
import cm.C4800a;
import cm.C4802c;
import cm.InterfaceC4801b;
import com.amplitude.android.engagement.C4861a;
import com.stripe.android.shoppay.ShopPayActivity;
import com.whoop.android.R;
import com.whoop.data.remote.domain.dto.DateTimeRange;
import dj.AbstractC12058c;
import dj.AbstractC12064i;
import dk.C12100f;
import dz.AbstractC12462i;
import e93.AbstractC12889b;
import ec3.C13045h2;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import h20.C16651f;
import h20.C16686k4;
import h20.C16761x1;
import h20.C16776z4;
import h20.EnumC16762x2;
import h40.C16839e;
import h40.C16845k;
import i93.C18283i;
import io.sentry.config.AbstractC20301a;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import javax.net.ssl.HttpsURLConnection;
import jo2.C21841d;
import jo2.C21842e;
import k20.AbstractC22155t;
import k20.C22136a;
import kz.C22913j;
import l83.C23454a0;
import l83.C23468n;
import m63.C25126d;
import m83.AbstractC25243e0;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import m83.C25235a0;
import m83.C25272z;
import n20.C26173h;
import n20.C26175j;
import n20.C26181p;
import n30.C26212c;
import n40.C26262b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p00.C28580q;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p031b9.AbstractC2875y;
import p078d1.C11457j;
import p097ds.AbstractC12314q;
import p098dt.AbstractC12350b;
import p114eb.C12982q;
import p114eb.C12991u0;
import p138f6.AbstractC14134f;
import p138f6.C14129a;
import p138f6.C14132d;
import p164g2.C15240l;
import p164g2.InterfaceC15237i;
import p180h0.InterfaceC16413k2;
import p184h5.C16920v1;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p266jz.C22058f;
import p329n0.C26062o;
import p329n0.InterfaceC26054g;
import p343nk.C26788i;
import p343nk.C26792m;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28670t2;
import p395p6.C28889j0;
import p395p6.C28901n0;
import p426qi.C30387i;
import p426qi.C30404y;
import p470rv.C31823c;
import p470rv.C31833m;
import p497t7.InterfaceC33561b;
import p505ts.AbstractC34132o;
import p510u0.C34306c0;
import p510u0.InterfaceC34310d1;
import p512u2.InterfaceC34476v;
import p522uf.AbstractC34870c0;
import p583wh.C37297c;
import p599wz.C37718g0;
import p664yy.C39865j;
import p665yz.C39899b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q00.C29734p0;
import q20.AbstractC29840y;
import q20.C29838w;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s40.C32132a;
import s83.AbstractC32275i;
import t23.C33366b4;
import t23.C33368c0;
import t23.C33391g1;
import t23.C33487z2;
import v00.C35459c0;
import v00.C35480n;
import v20.C35567g;
import w23.C36743a;
import w23.C36756n;
import w23.C36757o;
import w23.C36758p;
import w23.C36759q;
import w23.C36760r;
import x30.C37884e0;
import y00.AbstractC38970u5;
import y00.C38889l5;
import y00.C38915o4;
import y00.InterfaceC38802c8;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ay.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C2147u extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8544w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f8545x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f8546y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f8547z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2147u(Object obj, Object obj2, Object obj3, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f8544w = i13;
        this.f8545x = obj;
        this.f8546y = obj2;
        this.f8547z = obj3;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f8544w) {
            case 0:
                return new C2147u((C2148v) this.f8545x, (C32132a) this.f8546y, (InterfaceC38802c8) this.f8547z, interfaceC30057d, 0);
            case 1:
                C2147u c2147u = new C2147u((InterfaceC26054g) this.f8546y, (C3396t) this.f8547z, interfaceC30057d, 1);
                c2147u.f8545x = obj;
                return c2147u;
            case 2:
                C2147u c2147u2 = new C2147u((String) this.f8546y, (C11457j) this.f8547z, interfaceC30057d, 2);
                c2147u2.f8545x = obj;
                return c2147u2;
            case 3:
                return new C2147u((InterfaceC15237i) this.f8545x, (InterfaceC28601c1) this.f8546y, (InterfaceC28601c1) this.f8547z, interfaceC30057d, 3);
            case 4:
                return new C2147u((C16686k4) this.f8545x, (AbstractC29840y) this.f8546y, (C35459c0) this.f8547z, interfaceC30057d, 4);
            case 5:
                return new C2147u((C16776z4) this.f8545x, (C38915o4) this.f8546y, (Function1) this.f8547z, interfaceC30057d, 5);
            case 6:
                return new C2147u((C16776z4) this.f8545x, (C0273a) this.f8546y, (String) this.f8547z, interfaceC30057d, 6);
            case 7:
                return new C2147u((ShopPayActivity) this.f8545x, (InterfaceC2994c0) this.f8546y, (C16845k) this.f8547z, interfaceC30057d, 7);
            case 8:
                return new C2147u((C22136a) this.f8545x, (AbstractC22155t) this.f8546y, (C35459c0) this.f8547z, interfaceC30057d, 8);
            case 9:
                return new C2147u((C33366b4) this.f8545x, (C33368c0) this.f8546y, (C33487z2) this.f8547z, interfaceC30057d, 9);
            case 10:
                return new C2147u((C26181p) this.f8545x, (Throwable) this.f8546y, (C21841d) this.f8547z, interfaceC30057d, 10);
            case 11:
                return new C2147u((C26181p) this.f8545x, (C0290f1) this.f8546y, (C16761x1) this.f8547z, interfaceC30057d, 11);
            case 12:
                C2147u c2147u3 = new C2147u((C26212c) this.f8546y, (Throwable) this.f8547z, interfaceC30057d, 12);
                c2147u3.f8545x = obj;
                return c2147u3;
            case 13:
                return new C2147u((C12991u0) this.f8545x, (Function1) this.f8546y, (InterfaceC28601c1) this.f8547z, interfaceC30057d, 13);
            case 14:
                return new C2147u((C26792m) this.f8545x, (String) this.f8546y, (JSONArray) this.f8547z, interfaceC30057d, 14);
            case 15:
                return new C2147u((InterfaceC4801b) this.f8545x, (C16839e) this.f8546y, (InterfaceC28670t2) this.f8547z, interfaceC30057d, 15);
            case 16:
                return new C2147u((C28580q) this.f8545x, (InterfaceC15237i) this.f8546y, (InterfaceC2464x2) this.f8547z, interfaceC30057d, 16);
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                return new C2147u((C28580q) this.f8545x, (Context) this.f8546y, (InterfaceC4339a) this.f8547z, interfaceC30057d, 17);
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                C2147u c2147u4 = new C2147u((String) this.f8546y, (String) this.f8547z, interfaceC30057d, 18);
                c2147u4.f8545x = obj;
                return c2147u4;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return new C2147u((C22058f) this.f8545x, (C22913j) this.f8546y, (C29734p0) this.f8547z, interfaceC30057d, 19);
            case 20:
                return new C2147u((String) this.f8545x, (InterfaceC28601c1) this.f8546y, (InterfaceC28601c1) this.f8547z, interfaceC30057d, 20);
            case 21:
                C2147u c2147u5 = new C2147u((C25126d) this.f8546y, (C31833m) this.f8547z, interfaceC30057d, 21);
                c2147u5.f8545x = obj;
                return c2147u5;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                C2147u c2147u6 = new C2147u((InterfaceC34476v) this.f8546y, (InterfaceC34310d1) this.f8547z, interfaceC30057d, 22);
                c2147u6.f8545x = obj;
                return c2147u6;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new C2147u((C30387i) this.f8545x, (Context) this.f8546y, (String) this.f8547z, interfaceC30057d, 23);
            case 24:
                return new C2147u((Drawable) this.f8545x, (InterfaceC4339a) this.f8546y, (InterfaceC4339a) this.f8547z, interfaceC30057d, 24);
            case 25:
                C2147u c2147u7 = new C2147u((C36758p) this.f8546y, (InterfaceC13037f2) this.f8547z, interfaceC30057d, 25);
                c2147u7.f8545x = obj;
                return c2147u7;
            default:
                return new C2147u((C39899b) this.f8545x, (AbstractC12462i) this.f8546y, (Map) this.f8547z, interfaceC30057d, 26);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) throws JSONException {
        switch (this.f8544w) {
            case 0:
                C2147u c2147u = (C2147u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c2147u.invokeSuspend(c23454a0);
                return c23454a0;
            case 1:
                C2147u c2147u2 = (C2147u) create((InterfaceC16413k2) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c2147u2.invokeSuspend(c23454a1);
                return c23454a1;
            case 2:
                return ((C2147u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 3:
                C2147u c2147u3 = (C2147u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a2 = C23454a0.f92919a;
                c2147u3.invokeSuspend(c23454a2);
                return c23454a2;
            case 4:
                return ((C2147u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 5:
                C2147u c2147u4 = (C2147u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a3 = C23454a0.f92919a;
                c2147u4.invokeSuspend(c23454a3);
                return c23454a3;
            case 6:
                C2147u c2147u5 = (C2147u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a4 = C23454a0.f92919a;
                c2147u5.invokeSuspend(c23454a4);
                return c23454a4;
            case 7:
                ((C2147u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
                throw null;
            case 8:
                C2147u c2147u6 = (C2147u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a5 = C23454a0.f92919a;
                c2147u6.invokeSuspend(c23454a5);
                return c23454a5;
            case 9:
                C2147u c2147u7 = (C2147u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a6 = C23454a0.f92919a;
                c2147u7.invokeSuspend(c23454a6);
                return c23454a6;
            case 10:
                C2147u c2147u8 = (C2147u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a7 = C23454a0.f92919a;
                c2147u8.invokeSuspend(c23454a7);
                return c23454a7;
            case 11:
                C2147u c2147u9 = (C2147u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a8 = C23454a0.f92919a;
                c2147u9.invokeSuspend(c23454a8);
                return c23454a8;
            case 12:
                C2147u c2147u10 = (C2147u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a9 = C23454a0.f92919a;
                c2147u10.invokeSuspend(c23454a9);
                return c23454a9;
            case 13:
                C2147u c2147u11 = (C2147u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a10 = C23454a0.f92919a;
                c2147u11.invokeSuspend(c23454a10);
                return c23454a10;
            case 14:
                C2147u c2147u12 = (C2147u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a11 = C23454a0.f92919a;
                c2147u12.invokeSuspend(c23454a11);
                return c23454a11;
            case 15:
                C2147u c2147u13 = (C2147u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a12 = C23454a0.f92919a;
                c2147u13.invokeSuspend(c23454a12);
                return c23454a12;
            case 16:
                C2147u c2147u14 = (C2147u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a13 = C23454a0.f92919a;
                c2147u14.invokeSuspend(c23454a13);
                return c23454a13;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                C2147u c2147u15 = (C2147u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a14 = C23454a0.f92919a;
                c2147u15.invokeSuspend(c23454a14);
                return c23454a14;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                return ((C2147u) create((AbstractC14134f) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C2147u c2147u16 = (C2147u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a15 = C23454a0.f92919a;
                c2147u16.invokeSuspend(c23454a15);
                return c23454a15;
            case 20:
                C2147u c2147u17 = (C2147u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a16 = C23454a0.f92919a;
                c2147u17.invokeSuspend(c23454a16);
                return c23454a16;
            case 21:
                C2147u c2147u18 = (C2147u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a17 = C23454a0.f92919a;
                c2147u18.invokeSuspend(c23454a17);
                return c23454a17;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ((C2147u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                C2147u c2147u19 = (C2147u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a18 = C23454a0.f92919a;
                c2147u19.invokeSuspend(c23454a18);
                return c23454a18;
            case 24:
                C2147u c2147u20 = (C2147u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a19 = C23454a0.f92919a;
                c2147u20.invokeSuspend(c23454a19);
                return c23454a19;
            case 25:
                C2147u c2147u21 = (C2147u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a20 = C23454a0.f92919a;
                c2147u21.invokeSuspend(c23454a20);
                return c23454a20;
            default:
                C2147u c2147u22 = (C2147u) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a21 = C23454a0.f92919a;
                c2147u22.invokeSuspend(c23454a21);
                return c23454a21;
        }
    }

    /* JADX WARN: Type inference failed for: r0v39, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    /* JADX WARN: Type inference failed for: r2v41, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.i] */
    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws JSONException {
        Object objM107888l;
        String headerField;
        C0273a c0273aM807b;
        C38915o4 c38915o4;
        C38915o4 c38915o5;
        C35480n c35480n;
        Map map;
        Object objM107888l2;
        Object value;
        Object value2;
        int i13 = this.f8544w;
        Map map2 = C25272z.f99163w;
        int i14 = 2;
        boolean z4 = false;
        int i15 = 1;
        InterfaceC30057d interfaceC30057d = null;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f8546y;
        Object obj3 = this.f8547z;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C2148v c2148v = (C2148v) this.f8545x;
                ((InterfaceC2152z) c2148v.f8552e.invoke((C32132a) obj2)).mo6699a(new C2142p((String) c2148v.f8548a.invoke(), c2148v.f8549b, (InterfaceC38802c8) obj3));
                return c23454a0;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                ((InterfaceC16413k2) this.f8545x).mo29373a((((C3396t) obj3).m9770i() + ((C26062o) ((InterfaceC26054g) obj2)).f103199p) * 0.0f);
                return c23454a0;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                String str = (String) obj2;
                C11457j c11457j = (C11457j) obj3;
                try {
                    URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
                    AbstractC22676k.m65748h(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setConnectTimeout(InterfaceC33561b.INVALID_OWNERSHIP);
                    httpURLConnection.setReadTimeout(InterfaceC33561b.INVALID_OWNERSHIP);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    if (httpURLConnection instanceof HttpsURLConnection) {
                        ((C3595n) c11457j.f36753x).invoke(httpURLConnection);
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    if (headerField == null || headerField.length() == 0) {
                        objM107888l = headerField;
                        objM107888l = str;
                    }
                } catch (Throwable th3) {
                    objM107888l = AbstractC34132o.m107888l(th3);
                }
                objM107888l = headerField;
                return C23468n.m68037a(objM107888l) == null ? objM107888l : str;
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                if (((Boolean) ((InterfaceC28601c1) obj2).getValue()).booleanValue() && ((Boolean) ((InterfaceC28601c1) obj3).getValue()).booleanValue()) {
                    AbstractC34870c0.m109993c0((InterfaceC15237i) this.f8545x, 1);
                }
                return c23454a0;
            case 4:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C16686k4 c16686k4 = (C16686k4) this.f8545x;
                AbstractC29840y abstractC29840yM91333h = (AbstractC29840y) obj2;
                c16686k4.f43028z.m5004e(abstractC29840yM91333h, "IN_PROGRESS_PAYMENT_SELECTION");
                if (abstractC29840yM91333h instanceof C29838w) {
                    C29838w c29838w = (C29838w) abstractC29840yM91333h;
                    AbstractC38970u5 abstractC38970u5 = c29838w.f121957z;
                    C35459c0 c35459c0 = (C35459c0) c16686k4.f43008L.getValue();
                    if (c35459c0 != null && c16686k4.f64163g0.m67270c(c35459c0.f150996w, c29838w.f121955x) && c16686k4.m35331o() == EnumC16762x2.f64427w) {
                        C38889l5 c38889l5 = abstractC38970u5 instanceof C38889l5 ? (C38889l5) abstractC38970u5 : null;
                        if (c38889l5 == null) {
                            c38889l5 = new C38889l5(7, null, null);
                        }
                        abstractC29840yM91333h = C29838w.m91333h(c29838w, null, C38889l5.m124360f(c38889l5, (String) ((C37884e0) c16686k4.f43018V.getValue()).f162215h.f45200w.getValue(), null, 14), 3);
                        c16686k4.m35340z(abstractC29840yM91333h);
                    }
                }
                if (abstractC29840yM91333h != null) {
                    return AbstractC12314q.m34319K(abstractC29840yM91333h, AbstractC20301a.m56345m(c16686k4.f43025w), (C37718g0) c16686k4.f43001E.f64395e.f45200w.getValue(), ((C35459c0) obj3).f150982Y);
                }
                return null;
            case 5:
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C16776z4 c16776z4 = (C16776z4) this.f8545x;
                C16651f c16651f = c16776z4.f64490i;
                C38915o4 c38915o6 = (C38915o4) obj2;
                c16651f.f64020a.m5004e(c38915o6, "saved_selection");
                C0273a c0273a = (C0273a) c16651f.f64021b.f45200w.getValue();
                if (c0273a != null) {
                    List<C38915o4> list = c0273a.f935w;
                    ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                    for (C38915o4 c38915o7 : list) {
                        if (AbstractC22676k.m65745e(c38915o6.f167527w, c38915o7.f167527w)) {
                            c38915o7 = c38915o6;
                        }
                        arrayList.add(c38915o7);
                    }
                    c0273aM807b = C0273a.m807b(c0273a, arrayList, null, 2);
                } else {
                    c0273aM807b = null;
                }
                c16651f.m47225a(c0273aM807b);
                Object value3 = c16776z4.f64488g.getValue();
                C29838w c29838w2 = value3 instanceof C29838w ? (C29838w) value3 : null;
                if (AbstractC22676k.m65745e((c29838w2 == null || (c38915o4 = c29838w2.f121955x) == null) ? null : c38915o4.f167527w, c38915o6.f167527w)) {
                    c16776z4.f64489h.invoke(new C29838w(c38915o6, null, null));
                }
                ((Function1) obj3).invoke(c38915o6);
                return c23454a0;
            case 6:
                EnumC31071a enumC31071a7 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C16776z4 c16776z5 = (C16776z4) this.f8545x;
                C16651f c16651f2 = c16776z5.f64490i;
                C0273a c0273a2 = (C0273a) obj2;
                List list2 = c0273a2.f935w;
                String str2 = (String) obj3;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list2) {
                    if (!AbstractC22676k.m65745e(((C38915o4) obj4).f167527w, str2)) {
                        arrayList2.add(obj4);
                    }
                }
                c16651f2.m47225a(C0273a.m807b(c0273a2, arrayList2, null, 2));
                Object value4 = c16776z5.f64488g.getValue();
                C29838w c29838w3 = value4 instanceof C29838w ? (C29838w) value4 : null;
                if (AbstractC22676k.m65745e((c29838w3 == null || (c38915o5 = c29838w3.f121955x) == null) ? null : c38915o5.f167527w, str2)) {
                    c16776z5.f64489h.invoke(null);
                }
                c16776z5.f64492k.invoke();
                return c23454a0;
            case 7:
                EnumC31071a enumC31071a8 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                ShopPayActivity shopPayActivity = (ShopPayActivity) this.f8545x;
                int i16 = ShopPayActivity.f22413E;
                AbstractC30802r.m94771t(shopPayActivity.f22415x.getValue());
                throw null;
            case 8:
                EnumC31071a enumC31071a9 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C22136a c22136a = (C22136a) this.f8545x;
                C39865j c39865j = c22136a.f85864b;
                C2222b c2222b = c22136a.f85866d;
                AbstractC22155t abstractC22155t = (AbstractC22155t) obj2;
                C35459c0 c35459c1 = (C35459c0) obj3;
                if (c35459c1 != null && (c35480n = c35459c1.f150992i0) != null && (map = c35480n.f151053x) != null) {
                    map2 = map;
                }
                c39865j.m127938a(c2222b.mo7052a(abstractC22155t, AbstractC25247g0.m73995d0(map2, abstractC22155t.getParams())));
                return c23454a0;
            case 9:
                EnumC31071a enumC31071a10 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C33391g1 c33391g1 = ((C33366b4) this.f8545x).f139248U;
                c33391g1.getClass();
                C13045h2 c13045h2 = c33391g1.f139402e;
                c13045h2.getClass();
                c13045h2.m36571k(null, (C33368c0) obj2);
                return c23454a0;
            case 10:
                EnumC31071a enumC31071a11 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C26181p c26181p = (C26181p) this.f8545x;
                Throwable th4 = (Throwable) obj2;
                c26181p.f103841g = th4 != null;
                c26181p.f103840f.set(null);
                C21841d c21841d = (C21841d) obj3;
                C21842e.m61803h(c21841d.f84295a, c21841d.f84296b, th4 == null, th4);
                return c23454a0;
            case 11:
                EnumC31071a enumC31071a12 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                ((C26181p) this.f8545x).f103837c.f103861x.m5004e(new C26173h((C0290f1) obj2, (C16761x1) obj3, false), "state");
                return c23454a0;
            case 12:
                EnumC31071a enumC31071a13 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C26212c c26212c = (C26212c) obj2;
                try {
                    C26212c.m77826a(c26212c, c26212c.m77827b((Throwable) obj3));
                    objM107888l2 = c23454a0;
                } catch (Throwable th5) {
                    objM107888l2 = AbstractC34132o.m107888l(th5);
                }
                Throwable thM68037a = C23468n.m68037a(objM107888l2);
                if (thM68037a != null) {
                    c26212c.f103933z.mo91520o("Failed to send error report.", thM68037a);
                }
                return c23454a0;
            case 13:
                EnumC31071a enumC31071a14 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                ((Function1) obj2).invoke(new C26262b(((C12991u0) this.f8545x).m36398m(), (C12982q) ((InterfaceC28601c1) obj3).getValue()));
                return c23454a0;
            case 14:
                EnumC31071a enumC31071a15 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C12100f c12100f = ((C26792m) this.f8545x).f106715a;
                String filePath = (String) obj2;
                JSONArray jSONArray = (JSONArray) obj3;
                AbstractC22676k.m65750j(filePath, "filePath");
                C26788i c26788i = c12100f.f40292c;
                File file = c26788i.f106693a;
                File file2 = new File(filePath);
                if (file2.exists()) {
                    String name = file2.getName();
                    File file3 = new File(file, AbstractC2875y.m8299l(name, "-1.tmp"));
                    File file4 = new File(file, AbstractC2875y.m8299l(name, "-2.tmp"));
                    int length = jSONArray.length() / 2;
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it = AbstractC12889b.m36278i0(0, jSONArray.length()).iterator();
                    while (((C18283i) it).f71138y) {
                        int iNextInt = ((AbstractC25243e0) it).nextInt();
                        if (iNextInt < length) {
                            JSONObject jSONObject = jSONArray.getJSONObject(iNextInt);
                            AbstractC22676k.m65749i(jSONObject, "this.getJSONObject(index)");
                            arrayList3.add(jSONObject);
                        } else {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(iNextInt);
                            AbstractC22676k.m65749i(jSONObject2, "this.getJSONObject(index)");
                            arrayList4.add(jSONObject2);
                        }
                    }
                    c26788i.m79821j(arrayList3, file3, true);
                    c26788i.m79821j(arrayList4, file4, true);
                    c26788i.m79817f(filePath);
                }
                return c23454a0;
            case 15:
                EnumC31071a enumC31071a16 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                InterfaceC4801b interfaceC4801b = (InterfaceC4801b) this.f8545x;
                long jM51541c = C17919x.m51541c(((Number) ((InterfaceC28670t2) obj3).getValue()).floatValue(), ((C16839e) obj2).f64711c);
                C4802c transformColorForLightContent = AbstractC4803d.f19791b;
                C4800a c4800a = (C4800a) interfaceC4801b;
                c4800a.getClass();
                AbstractC22676k.m65750j(transformColorForLightContent, "transformColorForLightContent");
                C16920v1 c16920v1 = c4800a.f19788c;
                if (c16920v1 != null) {
                    c16920v1.m47613b(false);
                }
                Window window = c4800a.f19787b;
                if (window != null) {
                    window.setStatusBarColor(AbstractC17918w0.m51506H(jM51541c));
                }
                return c23454a0;
            case 16:
                EnumC31071a enumC31071a17 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                if (((C28580q) this.f8545x).f115648w) {
                    ((C15240l) ((InterfaceC15237i) obj2)).m43339b(true);
                    InterfaceC2464x2 interfaceC2464x2 = (InterfaceC2464x2) obj3;
                    if (interfaceC2464x2 != null) {
                        ((C2463x1) interfaceC2464x2).m7442a();
                    }
                }
                return c23454a0;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                EnumC31071a enumC31071a18 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                if (((C28580q) this.f8545x).f115640E) {
                    Toast.makeText((Context) obj2, R.string.stripe_verification_code_sent, 0).show();
                    ((InterfaceC4339a) obj3).invoke();
                }
                return c23454a0;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                EnumC31071a enumC31071a19 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                AbstractC14134f abstractC14134f = (AbstractC14134f) this.f8545x;
                C14129a c14129aM40233c = abstractC14134f.m40233c();
                String str3 = (String) obj2;
                String str4 = (String) obj3;
                C14132d c14132d = C28901n0.f116986g;
                Set set = (Set) abstractC14134f.mo40227b(c14132d);
                if (set == null) {
                    set = C25235a0.f99113w;
                }
                c14129aM40233c.m40231h(c14132d, AbstractC12350b.m34555D(str3, set));
                c14129aM40233c.m40231h(C28889j0.m87811a(C28901n0.f116983d, str3), str4);
                return c14129aM40233c.m40234d();
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                C29734p0 c29734p0 = (C29734p0) obj3;
                EnumC31071a enumC31071a20 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C22058f c22058f = (C22058f) this.f8545x;
                if (c22058f != null) {
                    C22913j c22913j = (C22913j) obj2;
                    if (c22913j != null) {
                        c22913j.mo6701c(c22058f, null);
                        c29734p0.m91183p(true);
                    } else {
                        c29734p0.m91183p(false);
                    }
                }
                return c23454a0;
            case 20:
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) obj3;
                InterfaceC28601c1 interfaceC28601c2 = (InterfaceC28601c1) obj2;
                String str5 = (String) this.f8545x;
                EnumC31071a enumC31071a21 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                try {
                    URLConnection uRLConnectionOpenConnection2 = new URL(str5).openConnection();
                    uRLConnectionOpenConnection2.setDoInput(true);
                    uRLConnectionOpenConnection2.connect();
                    InputStream inputStream = uRLConnectionOpenConnection2.getInputStream();
                    interfaceC28601c2.setValue(BitmapFactory.decodeStream(inputStream));
                    inputStream.close();
                    if (((Bitmap) interfaceC28601c2.getValue()) == null) {
                        interfaceC28601c1.setValue(Boolean.TRUE);
                    }
                    break;
                } catch (Exception e5) {
                    C4861a.f20259o.m16032K(AbstractC11266d.m30461o("Tooltip View: Error loading image from source ", str5), e5);
                    interfaceC28601c1.setValue(Boolean.TRUE);
                }
                return c23454a0;
            case 21:
                EnumC31071a enumC31071a22 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f8545x;
                C25126d c25126d = (C25126d) obj2;
                InterfaceC13058l interfaceC13058l = (InterfaceC13058l) c25126d.f98481G;
                C31833m c31833m = (C31833m) obj3;
                AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C31823c(interfaceC13058l, c31833m, c25126d, (InterfaceC30057d) null), 3);
                AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C31823c(c25126d, interfaceC13058l, c31833m, (InterfaceC30057d) null), 3);
                AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C26175j(interfaceC13058l, c31833m, interfaceC30057d, 26), 3);
                return c23454a0;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                EnumC31071a enumC31071a23 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                InterfaceC2994c0 interfaceC2994c1 = (InterfaceC2994c0) this.f8545x;
                EnumC2998d0 enumC2998d0 = EnumC2998d0.f12007z;
                InterfaceC34476v interfaceC34476v = (InterfaceC34476v) obj2;
                InterfaceC34310d1 interfaceC34310d1 = (InterfaceC34310d1) obj3;
                AbstractC3006f0.m8732z(interfaceC2994c1, null, enumC2998d0, new C34306c0(interfaceC34476v, interfaceC34310d1, interfaceC30057d, i15), 1);
                return AbstractC3006f0.m8732z(interfaceC2994c1, null, enumC2998d0, new C34306c0(interfaceC34476v, interfaceC34310d1, interfaceC30057d, i14), 1);
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                EnumC31071a enumC31071a24 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                for (C30404y asset : ((HashMap) ((C30387i) this.f8545x).m92860c()).values()) {
                    AbstractC22676k.m65749i(asset, "asset");
                    String str6 = asset.f124778d;
                    if (asset.f124780f == null && AbstractC39421y.m125930O(str6, "data:", false) && AbstractC39414r.m125888g0(str6, "base64,", 0, false, 6) > 0) {
                        try {
                            String strSubstring = str6.substring(AbstractC39414r.m125887f0(str6, DateTimeRange.lowerUpperDelimiter, 0, false, 6) + 1);
                            AbstractC22676k.m65749i(strSubstring, "this as java.lang.String).substring(startIndex)");
                            byte[] bArrDecode = Base64.decode(strSubstring, 0);
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inScaled = true;
                            options.inDensity = 160;
                            asset.f124780f = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        } catch (IllegalArgumentException e13) {
                            AbstractC12058c.m33240c("data URL did not have correct base64 format.", e13);
                        }
                    }
                    Context context = (Context) obj2;
                    String str7 = (String) obj3;
                    if (asset.f124780f == null && str7 != null) {
                        try {
                            InputStream inputStreamOpen = context.getAssets().open(str7 + str6);
                            AbstractC22676k.m65749i(inputStreamOpen, "try {\n        context.as…, e)\n        return\n    }");
                            try {
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inScaled = true;
                                options2.inDensity = 160;
                                asset.f124780f = AbstractC12064i.m33266d(BitmapFactory.decodeStream(inputStreamOpen, null, options2), asset.f124775a, asset.f124776b);
                            } catch (IllegalArgumentException e14) {
                                AbstractC12058c.m33240c("Unable to decode image.", e14);
                            }
                        } catch (IOException e15) {
                            AbstractC12058c.m33240c("Unable to open asset.", e15);
                        }
                    }
                    break;
                }
                return c23454a0;
            case 24:
                EnumC31071a enumC31071a25 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                ((AnimatedImageDrawable) ((Drawable) this.f8545x)).registerAnimationCallback(new C37297c((InterfaceC4339a) obj2, (InterfaceC4339a) obj3));
                return c23454a0;
            case 25:
                EnumC31071a enumC31071a26 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                InterfaceC2994c0 interfaceC2994c2 = (InterfaceC2994c0) this.f8545x;
                C36758p c36758p = (C36758p) obj2;
                C36760r c36760r = c36758p.f157314g;
                C36760r c36760r2 = c36758p.f157314g;
                InterfaceC3027k1 interfaceC3027k1 = ((C36759q) c36760r.f157322b.f45200w.getValue()).f157317b;
                if (interfaceC3027k1 != null) {
                    interfaceC3027k1.cancel((CancellationException) null);
                }
                EnumC2688i enumC2688i = EnumC2688i.PUBLISH;
                C36743a c36743a = C36743a.f157261y;
                C36757o c36757o = new C36757o(c36758p, z4 ? 1 : 0);
                C35567g c35567g = new C35567g(1, c36758p.f157314g, C36760r.class, "updatePublisherStage", "updatePublisherStage(Lio/getstream/video/android/core/analytics/call/observer/model/Stage;)V", 0, 3);
                c36758p.getClass();
                C2996c2 c2996c2M8732z = AbstractC3006f0.m8732z(interfaceC2994c2, null, null, new C36756n((InterfaceC13037f2) obj3, c36743a, c36758p, c36757o, c35567g, enumC2688i, null), 3);
                C13045h2 c13045h3 = c36760r2.f157321a;
                do {
                    value = c13045h3.getValue();
                } while (!c13045h3.m36569i(value, C36759q.m117872a((C36759q) value, null, c2996c2M8732z, null, null, null, 29)));
                InterfaceC3027k1 interfaceC3027k2 = ((C36759q) c36760r2.f157322b.f45200w.getValue()).f157318c;
                if (interfaceC3027k2 != null) {
                    interfaceC3027k2.cancel((CancellationException) null);
                }
                EnumC2688i enumC2688i2 = EnumC2688i.SUBSCRIBE;
                C36743a c36743a2 = C36743a.f157262z;
                C36757o c36757o2 = new C36757o(c36758p, i15);
                C35567g c35567g2 = new C35567g(1, c36758p.f157314g, C36760r.class, "updateSubscriberStage", "updateSubscriberStage(Lio/getstream/video/android/core/analytics/call/observer/model/Stage;)V", 0, 4);
                c36758p.getClass();
                C2996c2 c2996c2M8732z2 = AbstractC3006f0.m8732z(interfaceC2994c2, null, null, new C36756n((InterfaceC13037f2) obj3, c36743a2, c36758p, c36757o2, c35567g2, enumC2688i2, null), 3);
                C13045h2 c13045h4 = c36760r2.f157321a;
                do {
                    value2 = c13045h4.getValue();
                } while (!c13045h4.m36569i(value2, C36759q.m117872a((C36759q) value2, null, null, c2996c2M8732z2, null, null, 27)));
                return c23454a0;
            default:
                EnumC31071a enumC31071a27 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C39899b c39899b = (C39899b) this.f8545x;
                C39865j c39865j2 = c39899b.f172271a;
                C2222b c2222b2 = c39899b.f172272b;
                AbstractC12462i abstractC12462i = (AbstractC12462i) obj2;
                Map map3 = (Map) obj3;
                if (map3 != null) {
                    map2 = map3;
                }
                c39865j2.m127938a(c2222b2.mo7052a(abstractC12462i, map2));
                return c23454a0;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2147u(Object obj, Object obj2, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f8544w = i13;
        this.f8546y = obj;
        this.f8547z = obj2;
    }
}
