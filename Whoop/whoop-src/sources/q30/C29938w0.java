package q30;

import ag.C0854d;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.webkit.WebSettings;
import androidx.health.platform.client.proto.C1533u;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3050q0;
import bz.InterfaceC3704c;
import c93.InterfaceC4351m;
import com.google.android.exoplayer2.source.UnrecognizedInputFormatException;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.tasks.Task;
import com.google.crypto.tink.internal.AbstractC5079a0;
import com.google.crypto.tink.internal.AbstractC5086e;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxStyleManager;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.hcaptcha.HCaptchaException;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import com.stripe.hcaptcha.webview.HCaptchaWebView;
import eu.C13633t;
import io.getstream.chat.android.p226ui.common.model.MimeType;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ScheduledFuture;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23467m;
import l83.C23470p;
import m83.AbstractC25265s;
import n23.AbstractC26205h;
import n23.C26203f;
import n23.C26204g;
import n30.InterfaceC26213d;
import ne3.C26622k;
import ne3.C26624l;
import no.nordicsemi.android.dfu.DfuBaseService;
import np.C27004i;
import np.C27005j;
import p007a6.C0416e;
import p031b9.AbstractC2875y;
import p073cq.AbstractC11032a;
import p073cq.C11040i;
import p073cq.InterfaceC11035d;
import p075ct.C11105a;
import p088dc.AbstractC11895b;
import p284ko.InterfaceC22628l;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p319m4.AbstractC25012a;
import p326mf.C25483c;
import p375op.AbstractC28076h;
import p390p1.InterfaceC28670t2;
import p392p3.InterfaceC28767e0;
import p436qs.C30557a;
import p436qs.C30559c;
import p436qs.C30560d;
import p436qs.C30564h;
import p436qs.C30567k;
import p436qs.C30568l;
import p442qy.C30764c;
import p470rv.C31835o;
import p505ts.AbstractC34132o;
import p522uf.C34894u;
import p522uf.InterfaceC34888o;
import p529uo.AbstractC35135w;
import p530up.BinderC35149e;
import p530up.C35147c;
import p551vf.C35937b;
import p558vp.C36262f;
import p588wm.C37364f;
import p588wm.C37365g;
import p588wm.InterfaceC37367i;
import p629xx.InterfaceC38688e;
import p664yy.AbstractC39851c;
import p664yy.C39857f;
import p664yy.C39859g;
import p664yy.C39865j;
import p664yy.EnumC39868k0;
import p673z7.C40137a;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22665e0;
import p715kotlin.jvm.internal.C22669g0;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationUnit;
import p730qt2.C30617w;
import pg3.C29205p;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import q83.InterfaceC30063j;
import r23.C30891a;
import r23.InterfaceC30894d;
import r83.EnumC31071a;
import r93.InterfaceC31129i;
import ro.C31624i;
import s30.C32101c;
import s83.AbstractC32269c;
import sn.C32742k0;
import so.C32785b;
import so.C32800q;
import tm.C33929g;
import tm.C33946x;
import tm.C33948z;
import tm.InterfaceC33930h;
import to.InterfaceC33987n;
import u40.C34530f;
import u40.InterfaceC34532h;
import ud3.AbstractC34846v0;
import ud3.C34807d0;
import ud3.C34818h0;
import ud3.C34820i0;
import ud3.C34822j0;
import v40.C35649a;
import va3.AbstractC35854l;
import vf3.AbstractC35952b;
import vv1.C36532c;
import wd3.AbstractC37174h;
import ws.C37579b;
import ws.C37581c;
import ws.C37583e;
import ws.C37594p;
import ws.C37595q;
import ws.C37597s;
import ws.C37601w;
import ws.C37602x;
import ws.C37604z;
import y40.C39204a;
import y40.C39207d;
import y40.C39208e;
import y40.C39209f;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: q30.w0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29938w0 implements InterfaceC11035d, InterfaceC34888o, InterfaceC33987n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f122259w;

    /* JADX INFO: renamed from: x */
    public Object f122260x;

    /* JADX INFO: renamed from: y */
    public Object f122261y;

    /* JADX INFO: renamed from: z */
    public Object f122262z;

    public /* synthetic */ C29938w0(int i13, byte b) {
        this.f122259w = i13;
    }

    /* JADX INFO: renamed from: a */
    public static final C29908h0 m91541a(C29938w0 c29938w0, String str, String str2) throws IOException {
        Object objM107888l;
        String url = (String) c29938w0.f122260x;
        AbstractC22676k.m65750j(url, "url");
        URLConnection uRLConnectionOpenConnection = new URL(url).openConnection();
        AbstractC22676k.m65748h(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Type", str2);
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(str.length()));
        OutputStream outputStream = httpURLConnection.getOutputStream();
        try {
            AbstractC22676k.m65747g(outputStream);
            Charset UTF_8 = StandardCharsets.UTF_8;
            AbstractC22676k.m65749i(UTF_8, "UTF_8");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, UTF_8);
            try {
                outputStreamWriter.write(str);
                outputStreamWriter.flush();
                outputStreamWriter.close();
                outputStream.close();
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (200 > responseCode || responseCode >= 300) {
                    throw new SDKRuntimeException(AbstractC25012a.m73374g(responseCode, "Unsuccessful response code from ", url, ": "), 0);
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                AbstractC22676k.m65749i(inputStream, "getInputStream(...)");
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, AbstractC39397a.f169546a), DfuBaseService.ERROR_REMOTE_MASK);
                    try {
                        objM107888l = AbstractC35952b.m114200h(bufferedReader);
                        bufferedReader.close();
                        if (objM107888l instanceof C23467m) {
                            objM107888l = null;
                        }
                        String str3 = (String) objM107888l;
                        if (str3 == null) {
                            str3 = "";
                        }
                        return new C29908h0(str3, httpURLConnection.getContentType());
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            AbstractC35854l.m113829i(bufferedReader, th3);
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    objM107888l = AbstractC34132o.m107888l(th5);
                }
            } catch (Throwable th6) {
                try {
                    throw th6;
                } catch (Throwable th7) {
                    AbstractC35854l.m113829i(outputStreamWriter, th6);
                    throw th7;
                }
            }
        } catch (Throwable th8) {
            try {
                throw th8;
            } catch (Throwable th9) {
                AbstractC35854l.m113829i(outputStream, th8);
                throw th9;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static C39859g m91542m(C29938w0 c29938w0, String url, C39857f options, Map map, int i13) {
        if ((i13 & 4) != 0) {
            map = null;
        }
        c29938w0.getClass();
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(options, "options");
        return new C39859g(EnumC39868k0.GET, url, map, options, (C30764c) c29938w0.f122261y, (String) c29938w0.f122260x, (String) c29938w0.f122262z);
    }

    /* JADX INFO: renamed from: n */
    public static C39859g m91543n(C29938w0 c29938w0, String url, C39857f options, Map map, int i13) {
        if ((i13 & 4) != 0) {
            map = null;
        }
        c29938w0.getClass();
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(options, "options");
        return new C39859g(EnumC39868k0.POST, url, map, options, (C30764c) c29938w0.f122261y, (String) c29938w0.f122260x, (String) c29938w0.f122262z);
    }

    /* JADX INFO: renamed from: o */
    public static Float m91544o(Duration duration) {
        if (duration != null) {
            return Float.valueOf((float) Duration.m134298toDoubleimpl(duration.getRawValue(), DurationUnit.MILLISECONDS));
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x00c6, please report this as an issue */
    /* JADX INFO: renamed from: A */
    public Object m91545A(C0416e c0416e, AbstractC32269c abstractC32269c) {
        C30891a c30891a;
        C22665e0 c22665e0;
        C29938w0 c29938w0;
        Function1 function1;
        C22669g0 c22669g0;
        C22669g0 c22669g1;
        C29938w0 c29938w1;
        Object obj;
        AbstractC26205h abstractC26205h;
        Function1 function2;
        InterfaceC30894d interfaceC30894d;
        C2345k c2345k;
        InterfaceC2339e interfaceC2339e;
        String str;
        EnumC2341g enumC2341g;
        if (abstractC32269c instanceof C30891a) {
            c30891a = (C30891a) abstractC32269c;
            int i13 = c30891a.f127369H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c30891a.f127369H = i13 - Integer.MIN_VALUE;
            } else {
                c30891a = new C30891a(this, abstractC32269c);
            }
        } else {
            c30891a = new C30891a(this, abstractC32269c);
        }
        Object objInvoke = c30891a.f127367F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c30891a.f127369H;
        if (i14 != 0) {
            if (i14 == 1) {
                c22669g0 = c30891a.f127366E;
                c22669g1 = c30891a.f127373z;
                c22665e0 = c30891a.f127372y;
                c29938w1 = c30891a.f127370w;
                AbstractC34132o.m107864I(objInvoke);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c22669g0 = c30891a.f127373z;
                c22665e0 = c30891a.f127372y;
                function1 = c30891a.f127371x;
                c29938w0 = c30891a.f127370w;
                AbstractC34132o.m107864I(objInvoke);
                c22665e0.f89334w++;
            }
            c22669g0.f89336w = objInvoke;
            obj = c22669g1.f89336w;
            abstractC26205h = (AbstractC26205h) obj;
            if (!(abstractC26205h instanceof C26204g)) {
                if (abstractC26205h instanceof C26203f) {
                    throw new NoWhenBranchMatchedException();
                }
                function2 = (Function1) c29938w1.f122261y;
                interfaceC30894d = (InterfaceC30894d) c29938w1.f122260x;
                if (!((Boolean) function2.invoke(((C26203f) obj).f103918a)).booleanValue()) {
                    interfaceC30894d.shouldRetry(c22665e0.f89334w, ((C26203f) c22669g1.f89336w).f103918a);
                    interfaceC30894d.retryTimeout(c22665e0.f89334w, ((C26203f) c22669g1.f89336w).f103918a);
                    c2345k = (C2345k) ((C23470p) c29938w1.f122262z).getValue();
                    interfaceC2339e = c2345k.f9275c;
                    str = c2345k.f9273a;
                    enumC2341g = EnumC2341g.INFO;
                    if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                        c2345k.f9274b.log(enumC2341g, str, "API call failed (attempt " + c22665e0.f89334w + "). Giving up for now, will retry when connection recovers. Error was " + ((C26203f) c22669g1.f89336w).f103918a, null);
                    }
                }
            }
            return c22669g1.f89336w;
        }
        AbstractC34132o.m107864I(objInvoke);
        c22665e0 = new C22665e0();
        c22665e0.f89334w = 1;
        c29938w0 = this;
        function1 = c0416e;
        c22669g0 = new C22669g0();
        c30891a.f127370w = c29938w0;
        c30891a.f127371x = function1;
        c30891a.f127372y = c22665e0;
        c30891a.f127373z = c22669g0;
        c30891a.f127366E = c22669g0;
        c30891a.f127369H = 1;
        objInvoke = function1.invoke(c30891a);
        if (objInvoke == enumC31071a) {
            return enumC31071a;
        }
        c22669g1 = c22669g0;
        c29938w1 = c29938w0;
        c22669g0.f89336w = objInvoke;
        obj = c22669g1.f89336w;
        abstractC26205h = (AbstractC26205h) obj;
        if (!(abstractC26205h instanceof C26204g)) {
            if (abstractC26205h instanceof C26203f) {
                throw new NoWhenBranchMatchedException();
            }
            function2 = (Function1) c29938w1.f122261y;
            interfaceC30894d = (InterfaceC30894d) c29938w1.f122260x;
            if (!((Boolean) function2.invoke(((C26203f) obj).f103918a)).booleanValue()) {
                interfaceC30894d.shouldRetry(c22665e0.f89334w, ((C26203f) c22669g1.f89336w).f103918a);
                interfaceC30894d.retryTimeout(c22665e0.f89334w, ((C26203f) c22669g1.f89336w).f103918a);
                c2345k = (C2345k) ((C23470p) c29938w1.f122262z).getValue();
                interfaceC2339e = c2345k.f9275c;
                str = c2345k.f9273a;
                enumC2341g = EnumC2341g.INFO;
                if (interfaceC2339e.isLoggable(enumC2341g, str)) {
                    c2345k.f9274b.log(enumC2341g, str, "API call failed (attempt " + c22665e0.f89334w + "). Giving up for now, will retry when connection recovers. Error was " + ((C26203f) c22669g1.f89336w).f103918a, null);
                }
            }
        }
        return c22669g1.f89336w;
    }

    /* JADX INFO: renamed from: B */
    public void m91546B(C31624i c31624i) {
        this.f122261y = c31624i;
    }

    /* JADX INFO: renamed from: C */
    public void m91547C(Integer num) {
        switch (this.f122259w) {
            case 1:
                this.f122262z = num;
                break;
            case 2:
                this.f122262z = num;
                break;
            case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                this.f122262z = num;
                break;
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                this.f122262z = num;
                break;
            default:
                this.f122262z = num;
                break;
        }
    }

    /* JADX INFO: renamed from: D */
    public void m91548D(C31624i c31624i) {
        this.f122261y = c31624i;
    }

    /* JADX INFO: renamed from: E */
    public void m91549E(BigInteger bigInteger) {
        switch (this.f122259w) {
            case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                this.f122261y = bigInteger;
                break;
            default:
                this.f122261y = bigInteger;
                break;
        }
    }

    /* JADX INFO: renamed from: F */
    public void m91550F(C30560d c30560d) {
        this.f122260x = c30560d;
    }

    /* JADX INFO: renamed from: G */
    public void m91551G(C30568l c30568l) {
        this.f122260x = c30568l;
    }

    /* JADX INFO: renamed from: H */
    public void m91552H(C37581c c37581c) {
        this.f122260x = c37581c;
    }

    /* JADX INFO: renamed from: I */
    public void m91553I(C37595q c37595q) {
        this.f122260x = c37595q;
    }

    /* JADX INFO: renamed from: J */
    public void m91554J(C37602x c37602x) {
        this.f122260x = c37602x;
    }

    /* JADX INFO: renamed from: K */
    public void m91555K(ECPoint eCPoint) {
        this.f122261y = eCPoint;
    }

    /* JADX INFO: renamed from: L */
    public void m91556L(C34818h0 type) {
        AbstractC22676k.m65750j(type, "type");
        if (type.f146592b.equals("multipart")) {
            this.f122261y = type;
        } else {
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }
    }

    /* JADX INFO: renamed from: M */
    public boolean m91557M(HCaptchaException exception) {
        AbstractC22676k.m65750j(exception, "exception");
        HCaptchaConfig hCaptchaConfig = (HCaptchaConfig) this.f122260x;
        InterfaceC4351m retryPredicate = hCaptchaConfig.getRetryPredicate();
        if (retryPredicate != null) {
            return ((Boolean) retryPredicate.invoke(hCaptchaConfig, exception)).booleanValue();
        }
        return false;
    }

    @Override // to.InterfaceC33987n
    public void accept(Object obj, Object obj2) throws RemoteException {
        switch (this.f122259w) {
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                ((FusedLocationProviderClient) this.f122260x).zzc((AbstractC11032a) this.f122261y, (C27005j) this.f122262z, (C27004i) obj, (C11040i) obj2);
                break;
            default:
                ((FusedLocationProviderClient) this.f122260x).zza((C27005j) this.f122261y, (PendingIntent) this.f122262z, (C27004i) obj, (C11040i) obj2);
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m91558b(C31835o layer) {
        AbstractC22676k.m65750j(layer, "layer");
        if (((String) this.f122260x) != null) {
            layer.m98906a((MapboxStyleManager) this.f122261y, new LayerPosition((String) this.f122260x, null, null));
        } else if (((String) this.f122262z) != null) {
            layer.m98906a((MapboxStyleManager) this.f122261y, new LayerPosition(null, (String) this.f122262z, null));
        } else {
            layer.m98906a((MapboxStyleManager) this.f122261y, null);
        }
    }

    @Override // p522uf.InterfaceC34888o
    /* JADX INFO: renamed from: d */
    public Object mo9062d(Object obj, C0854d c0854d) {
        C34894u c34894u = (C34894u) obj;
        for (Map.Entry entry : ((Map) ((C25483c) this.f122261y).f475x).entrySet()) {
            ((C35937b) c34894u.f146959b).f153017y.m387h((String) entry.getKey(), (List) entry.getValue());
        }
        for (Map.Entry entry2 : ((Map) ((C25483c) this.f122260x).f475x).entrySet()) {
            ((C35937b) c34894u.f146959b).f153017y.m380N(AbstractC25265s.m74112P0((List) entry2.getValue()), (String) entry2.getKey());
        }
        for (Map.Entry entry3 : ((Map) ((C25483c) this.f122262z).f475x).entrySet()) {
            String str = (String) entry3.getKey();
            List list = (List) entry3.getValue();
            if (!((C35937b) c34894u.f146959b).f153017y.m391o(str)) {
                ((C35937b) c34894u.f146959b).f153017y.m380N(AbstractC25265s.m74112P0(list), str);
            }
        }
        return c34894u;
    }

    /* JADX INFO: renamed from: e */
    public void m91559e(C34807d0 c34807d0, AbstractC34846v0 body) {
        AbstractC22676k.m65750j(body, "body");
        if (c34807d0.m109863a("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (c34807d0.m109863a("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        m91560f(new C34820i0(c34807d0, body));
    }

    /* JADX INFO: renamed from: f */
    public void m91560f(C34820i0 part) {
        AbstractC22676k.m65750j(part, "part");
        ((ArrayList) this.f122262z).add(part);
    }

    /* JADX INFO: renamed from: g */
    public C30557a m91561g() throws GeneralSecurityException {
        C31624i c31624i;
        C11105a c11105aM15951a;
        C30560d c30560d = (C30560d) this.f122260x;
        if (c30560d == null || (c31624i = (C31624i) this.f122261y) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c30560d.f125761a != ((C11105a) c31624i.f130665x).f35302a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c30560d.mo42237a() && ((Integer) this.f122262z) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C30560d) this.f122260x).mo42237a() && ((Integer) this.f122262z) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C30559c c30559c = ((C30560d) this.f122260x).f125763c;
        if (c30559c == C30559c.f125759e) {
            c11105aM15951a = AbstractC5079a0.f21389a;
        } else if (c30559c == C30559c.f125758d || c30559c == C30559c.f125757c) {
            c11105aM15951a = AbstractC5079a0.m15951a(((Integer) this.f122262z).intValue());
        } else {
            if (c30559c != C30559c.f125756b) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + ((C30560d) this.f122260x).f125763c);
            }
            c11105aM15951a = AbstractC5079a0.m15952b(((Integer) this.f122262z).intValue());
        }
        return new C30557a((C30560d) this.f122260x, (C31624i) this.f122261y, c11105aM15951a, (Integer) this.f122262z);
    }

    /* JADX INFO: renamed from: h */
    public C30564h m91562h() throws GeneralSecurityException {
        C31624i c31624i;
        C11105a c11105aM15951a;
        C30568l c30568l = (C30568l) this.f122260x;
        if (c30568l == null || (c31624i = (C31624i) this.f122261y) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c30568l.f125789a != ((C11105a) c31624i.f130665x).f35302a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c30568l.mo42237a() && ((Integer) this.f122262z) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C30568l) this.f122260x).mo42237a() && ((Integer) this.f122262z) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C30567k c30567k = ((C30568l) this.f122260x).f125791c;
        if (c30567k == C30567k.f125787e) {
            c11105aM15951a = AbstractC5079a0.f21389a;
        } else if (c30567k == C30567k.f125786d || c30567k == C30567k.f125785c) {
            c11105aM15951a = AbstractC5079a0.m15951a(((Integer) this.f122262z).intValue());
        } else {
            if (c30567k != C30567k.f125784b) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: " + ((C30568l) this.f122260x).f125791c);
            }
            c11105aM15951a = AbstractC5079a0.m15952b(((Integer) this.f122262z).intValue());
        }
        return new C30564h((C30568l) this.f122260x, (C31624i) this.f122261y, c11105aM15951a, (Integer) this.f122262z);
    }

    /* JADX INFO: renamed from: i */
    public C34822j0 m91563i() {
        ArrayList arrayList = (ArrayList) this.f122262z;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
        return new C34822j0((C26624l) this.f122260x, (C34818h0) this.f122261y, AbstractC37174h.m119143j(arrayList));
    }

    /* JADX INFO: renamed from: j */
    public C37583e m91564j() throws GeneralSecurityException {
        C11105a c11105aM15951a;
        C37581c c37581c = (C37581c) this.f122260x;
        if (c37581c == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        ECPoint eCPoint = (ECPoint) this.f122261y;
        if (eCPoint == null) {
            throw new GeneralSecurityException("Cannot build without public point");
        }
        AbstractC5086e.m15960b(eCPoint, c37581c.f160715b.f160697b.getCurve());
        if (((C37581c) this.f122260x).mo42237a() && ((Integer) this.f122262z) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C37581c) this.f122260x).mo42237a() && ((Integer) this.f122262z) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C37579b c37579b = ((C37581c) this.f122260x).f160717d;
        if (c37579b == C37579b.f160711k) {
            c11105aM15951a = AbstractC5079a0.f21389a;
        } else if (c37579b == C37579b.f160710j || c37579b == C37579b.f160709i) {
            c11105aM15951a = AbstractC5079a0.m15951a(((Integer) this.f122262z).intValue());
        } else {
            if (c37579b != C37579b.f160708h) {
                throw new IllegalStateException("Unknown EcdsaParameters.Variant: " + ((C37581c) this.f122260x).f160717d);
            }
            c11105aM15951a = AbstractC5079a0.m15952b(((Integer) this.f122262z).intValue());
        }
        return new C37583e((C37581c) this.f122260x, (ECPoint) this.f122261y, c11105aM15951a, (Integer) this.f122262z);
    }

    /* JADX INFO: renamed from: k */
    public C37597s m91565k() throws GeneralSecurityException {
        C11105a c11105aM15951a;
        if (((C37595q) this.f122260x) == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = (BigInteger) this.f122261y;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        C37595q c37595q = (C37595q) this.f122260x;
        int i13 = c37595q.f160781a;
        if (iBitLength != i13) {
            throw new GeneralSecurityException(AbstractC2875y.m8294g(iBitLength, i13, "Got modulus size ", ", but parameters requires modulus size "));
        }
        if (c37595q.mo42237a() && ((Integer) this.f122262z) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C37595q) this.f122260x).mo42237a() && ((Integer) this.f122262z) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C37594p c37594p = ((C37595q) this.f122260x).f160783c;
        if (c37594p == C37594p.f160778e) {
            c11105aM15951a = AbstractC5079a0.f21389a;
        } else if (c37594p == C37594p.f160777d || c37594p == C37594p.f160776c) {
            c11105aM15951a = AbstractC5079a0.m15951a(((Integer) this.f122262z).intValue());
        } else {
            if (c37594p != C37594p.f160775b) {
                throw new IllegalStateException("Unknown RsaSsaPkcs1Parameters.Variant: " + ((C37595q) this.f122260x).f160783c);
            }
            c11105aM15951a = AbstractC5079a0.m15952b(((Integer) this.f122262z).intValue());
        }
        return new C37597s((C37595q) this.f122260x, (BigInteger) this.f122261y, c11105aM15951a, (Integer) this.f122262z);
    }

    /* JADX INFO: renamed from: l */
    public C37604z m91566l() throws GeneralSecurityException {
        C11105a c11105aM15951a;
        if (((C37602x) this.f122260x) == null) {
            throw new GeneralSecurityException("Cannot build without parameters");
        }
        BigInteger bigInteger = (BigInteger) this.f122261y;
        if (bigInteger == null) {
            throw new GeneralSecurityException("Cannot build without modulus");
        }
        int iBitLength = bigInteger.bitLength();
        C37602x c37602x = (C37602x) this.f122260x;
        int i13 = c37602x.f160820a;
        if (iBitLength != i13) {
            throw new GeneralSecurityException(AbstractC2875y.m8294g(iBitLength, i13, "Got modulus size ", ", but parameters requires modulus size "));
        }
        if (c37602x.mo42237a() && ((Integer) this.f122262z) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C37602x) this.f122260x).mo42237a() && ((Integer) this.f122262z) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C37601w c37601w = ((C37602x) this.f122260x).f160822c;
        if (c37601w == C37601w.f160817e) {
            c11105aM15951a = AbstractC5079a0.f21389a;
        } else if (c37601w == C37601w.f160816d || c37601w == C37601w.f160815c) {
            c11105aM15951a = AbstractC5079a0.m15951a(((Integer) this.f122262z).intValue());
        } else {
            if (c37601w != C37601w.f160814b) {
                throw new IllegalStateException("Unknown RsaSsaPssParameters.Variant: " + ((C37602x) this.f122260x).f160822c);
            }
            c11105aM15951a = AbstractC5079a0.m15952b(((Integer) this.f122262z).intValue());
        }
        return new C37604z((C37602x) this.f122260x, (BigInteger) this.f122261y, c11105aM15951a, (Integer) this.f122262z);
    }

    /* JADX INFO: renamed from: p */
    public void m91567p(InterfaceC38688e interfaceC38688e) {
        ((C39865j) this.f122260x).m127938a(((AbstractC39851c) this.f122261y).mo7052a(interfaceC38688e, interfaceC38688e.getParams()));
    }

    @Override // p073cq.InterfaceC11035d
    /* JADX INFO: renamed from: q */
    public void mo944q(Task task) {
        C32785b c32785b = (C32785b) this.f122261y;
        String str = (String) this.f122260x;
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.f122262z;
        synchronized (c32785b.f136466a) {
            c32785b.f136466a.remove(str);
        }
        scheduledFuture.cancel(false);
    }

    /* JADX INFO: renamed from: r */
    public List m91568r() {
        return (List) this.f122261y;
    }

    /* JADX INFO: renamed from: s */
    public InterfaceC31129i m91569s() {
        return (InterfaceC31129i) this.f122260x;
    }

    /* JADX INFO: renamed from: t */
    public void m91570t(C13633t c13633t) {
        try {
            C36262f c36262f = (C36262f) this.f122261y;
            BinderC35149e binderC35149e = new BinderC35149e(c13633t);
            Parcel parcelM57322k0 = c36262f.m57322k0();
            AbstractC28076h.m84852d(parcelM57322k0, binderC35149e);
            c36262f.m57323l0(parcelM57322k0, 9);
        } catch (RemoteException e5) {
            throw new RuntimeRemoteException(e5);
        }
    }

    public String toString() {
        switch (this.f122259w) {
            case 27:
                StringBuilder sb4 = new StringBuilder(32);
                sb4.append((String) this.f122260x);
                sb4.append('{');
                C29205p c29205p = (C29205p) ((C29205p) this.f122261y).f118205y;
                String str = "";
                while (c29205p != null) {
                    C40137a c40137a = (C40137a) c29205p.f118204x;
                    sb4.append(str);
                    if (c40137a == null || !C40137a.class.isArray()) {
                        sb4.append(c40137a);
                    } else {
                        String strDeepToString = Arrays.deepToString(new Object[]{c40137a});
                        sb4.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                    }
                    c29205p = (C29205p) c29205p.f118205y;
                    str = ", ";
                }
                sb4.append('}');
                return sb4.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public C29938w0 m91571u() {
        return (C29938w0) this.f122262z;
    }

    /* JADX INFO: renamed from: v */
    public Typeface m91572v() {
        Object obj = this.f122262z;
        AbstractC22676k.m65748h(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    /* JADX INFO: renamed from: w */
    public boolean m91573w() throws IOException {
        String strTrim;
        ArrayDeque arrayDeque = (ArrayDeque) this.f122262z;
        if (((String) this.f122260x) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.f122260x = str;
                return true;
            }
            do {
                String line = ((BufferedReader) this.f122261y).readLine();
                this.f122260x = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f122260x = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    /* JADX INFO: renamed from: x */
    public void m91574x(InterfaceC22628l interfaceC22628l, Uri uri, Map map, long j7, long j13, C32742k0 c32742k0) throws UnrecognizedInputFormatException {
        InterfaceC37367i[] interfaceC37367iArr;
        C37364f c37364f = new C37364f(interfaceC22628l, j7, j13);
        this.f122262z = c37364f;
        if (((InterfaceC37367i) this.f122261y) != null) {
            return;
        }
        synchronized (((C37365g) this.f122260x)) {
            try {
                ArrayList arrayList = new ArrayList(14);
                List list = (List) map.get("Content-Type");
                int iM71584t = AbstractC24543a.m71584t((list == null || list.isEmpty()) ? null : (String) list.get(0));
                if (iM71584t != -1) {
                    C37365g.m119652a(arrayList, iM71584t);
                }
                int iM71585u = AbstractC24543a.m71585u(uri);
                if (iM71585u != -1 && iM71585u != iM71584t) {
                    C37365g.m119652a(arrayList, iM71585u);
                }
                int[] iArr = C37365g.f159853a;
                for (int i13 = 0; i13 < 14; i13++) {
                    int i14 = iArr[i13];
                    if (i14 != iM71584t && i14 != iM71585u) {
                        C37365g.m119652a(arrayList, i14);
                    }
                }
                interfaceC37367iArr = (InterfaceC37367i[]) arrayList.toArray(new InterfaceC37367i[arrayList.size()]);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        boolean z4 = true;
        if (interfaceC37367iArr.length == 1) {
            this.f122261y = interfaceC37367iArr[0];
        } else {
            for (InterfaceC37367i interfaceC37367i : interfaceC37367iArr) {
                try {
                    if (interfaceC37367i.mo3073g(c37364f)) {
                        this.f122261y = interfaceC37367i;
                        c37364f.f159847F = 0;
                        break;
                    }
                    boolean z13 = ((InterfaceC37367i) this.f122261y) != null || c37364f.f159852z == j7;
                    AbstractC24543a.m71573i(z13);
                    c37364f.f159847F = 0;
                } catch (EOFException unused) {
                    if (((InterfaceC37367i) this.f122261y) != null || c37364f.f159852z == j7) {
                    }
                } catch (Throwable th4) {
                    if (((InterfaceC37367i) this.f122261y) == null && c37364f.f159852z != j7) {
                        z4 = false;
                    }
                    AbstractC24543a.m71573i(z4);
                    c37364f.f159847F = 0;
                    throw th4;
                }
                AbstractC24543a.m71573i(z13);
                c37364f.f159847F = 0;
            }
            if (((InterfaceC37367i) this.f122261y) == null) {
                int i15 = AbstractC24567y.f95875a;
                StringBuilder sb4 = new StringBuilder();
                for (int i16 = 0; i16 < interfaceC37367iArr.length; i16++) {
                    sb4.append(interfaceC37367iArr[i16].getClass().getSimpleName());
                    if (i16 < interfaceC37367iArr.length - 1) {
                        sb4.append(", ");
                    }
                }
                String string = sb4.toString();
                StringBuilder sb5 = new StringBuilder(AbstractC30007c.m91832b(58, string));
                sb5.append("None of the available extractors (");
                sb5.append(string);
                sb5.append(") could read the stream.");
                throw new UnrecognizedInputFormatException(sb5.toString(), null, false, 1);
            }
        }
        ((InterfaceC37367i) this.f122261y).mo3074h(c32742k0);
    }

    /* JADX INFO: renamed from: y */
    public boolean m91575y() {
        if (((InterfaceC28670t2) this.f122260x).getValue() != this.f122262z) {
            return true;
        }
        C29938w0 c29938w0 = (C29938w0) this.f122261y;
        return c29938w0 != null && c29938w0.m91575y();
    }

    /* JADX INFO: renamed from: z */
    public String m91576z() {
        if (!m91573w()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.f122260x;
        this.f122260x = null;
        return str;
    }

    public /* synthetic */ C29938w0(int i13, boolean z4) {
        this.f122259w = i13;
        this.f122260x = null;
        this.f122261y = null;
        this.f122262z = null;
    }

    public /* synthetic */ C29938w0(Object obj, Object obj2, Object obj3, int i13) {
        this.f122259w = i13;
        this.f122260x = obj;
        this.f122261y = obj2;
        this.f122262z = obj3;
    }

    public /* synthetic */ C29938w0(C32785b c32785b, String str, ScheduledFuture scheduledFuture) {
        this.f122259w = 10;
        this.f122261y = c32785b;
        this.f122260x = str;
        this.f122262z = scheduledFuture;
    }

    public C29938w0(C35147c c35147c, C36262f c36262f) {
        this.f122259w = 20;
        this.f122261y = c36262f;
        AbstractC35135w.m111094f(c35147c);
        this.f122260x = c35147c;
    }

    public C29938w0(C39865j analyticsRequestExecutor, AbstractC39851c analyticsRequestFactory, InterfaceC3704c durationProvider) {
        this.f122259w = 25;
        AbstractC22676k.m65750j(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC22676k.m65750j(analyticsRequestFactory, "analyticsRequestFactory");
        AbstractC22676k.m65750j(durationProvider, "durationProvider");
        this.f122260x = analyticsRequestExecutor;
        this.f122261y = analyticsRequestFactory;
        this.f122262z = durationProvider;
    }

    public C29938w0(int i13) {
        this.f122259w = i13;
        int i14 = 1;
        switch (i13) {
            case 14:
                this.f122260x = new C25483c(i14);
                this.f122261y = new C25483c(i14);
                this.f122262z = new C25483c(i14);
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                String strM31995n = AbstractC11895b.m31995n("toString(...)");
                C26622k c26622k = C26624l.f105882z;
                this.f122260x = C26622k.m79241b(strM31995n);
                this.f122261y = C34822j0.f146597e;
                this.f122262z = new ArrayList();
                break;
            default:
                this.f122260x = new Path();
                Paint paint = new Paint(1);
                this.f122261y = paint;
                this.f122262z = null;
                paint.setColor(-16777216);
                paint.setStyle(Paint.Style.FILL);
                paint.setAntiAlias(true);
                paint.setStrokeWidth(1.0f);
                break;
        }
    }

    public C29938w0(String url, InterfaceC26213d errorReporter, InterfaceC30063j workContext) {
        this.f122259w = 0;
        AbstractC22676k.m65750j(url, "url");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(workContext, "workContext");
        this.f122260x = url;
        this.f122261y = errorReporter;
        this.f122262z = workContext;
    }

    public C29938w0(InterfaceC26213d errorReporter, InterfaceC30063j workContext) {
        this.f122259w = 12;
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(workContext, "workContext");
        C32101c c32101c = C32101c.f133102a;
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(workContext, "workContext");
        C32800q c32800q = new C32800q();
        c32800q.f136504w = errorReporter;
        c32800q.f136505x = workContext;
        this.f122262z = workContext;
        this.f122260x = c32101c;
        this.f122261y = c32800q;
    }

    public C29938w0(Handler handler, Context context, HCaptchaConfig config, C35649a internalConfig, InterfaceC34532h interfaceC34532h, C34530f c34530f, HCaptchaWebView hCaptchaWebView) {
        this.f122259w = 26;
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(internalConfig, "internalConfig");
        this.f122260x = config;
        this.f122261y = c34530f;
        this.f122262z = hCaptchaWebView;
        C39207d c39207d = new C39207d(handler, config, interfaceC34532h);
        C39204a c39204a = new C39204a(context);
        WebSettings settings = hCaptchaWebView.getSettings();
        AbstractC22676k.m65749i(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setCacheMode(-1);
        settings.setGeolocationEnabled(false);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        hCaptchaWebView.setWebViewClient(new C39209f(this, handler, c34530f));
        hCaptchaWebView.setWebChromeClient(new C39208e());
        hCaptchaWebView.setBackgroundColor(0);
        if (config.getDisableHardwareAcceleration()) {
            hCaptchaWebView.setLayerType(1, null);
        }
        hCaptchaWebView.addJavascriptInterface(c39207d, "JSInterface");
        hCaptchaWebView.addJavascriptInterface(c39204a, "JSDI");
        hCaptchaWebView.loadDataWithBaseURL(config.getHost(), (String) internalConfig.f151470w.invoke(), MimeType.MIME_TYPE_HTML, "UTF-8", null);
    }

    public C29938w0(InterfaceC30894d retryPolicy) {
        this.f122259w = 3;
        C30617w c30617w = new C30617w(17);
        AbstractC22676k.m65750j(retryPolicy, "retryPolicy");
        this.f122260x = retryPolicy;
        this.f122261y = c30617w;
        this.f122262z = AbstractC1772c1.m5382S(this, "CallRetryService");
    }

    public C29938w0(Context context) {
        this.f122259w = 29;
        AbstractC22676k.m65750j(context, "context");
        C22365e c22365e = AbstractC3050q0.f12077a;
        ExecutorC22364d executorC22364d = ExecutorC22364d.f87316w;
        this.f122260x = context;
        this.f122261y = executorC22364d;
        this.f122262z = AbstractC30060g.m92088H(new C36532c(this, 29));
    }

    public C29938w0(C37365g c37365g) {
        this.f122259w = 9;
        this.f122260x = c37365g;
    }

    public C29938w0(InterfaceC31129i classifierDescriptor, List arguments, C29938w0 c29938w0) {
        this.f122259w = 4;
        AbstractC22676k.m65750j(classifierDescriptor, "classifierDescriptor");
        AbstractC22676k.m65750j(arguments, "arguments");
        this.f122260x = classifierDescriptor;
        this.f122261y = arguments;
        this.f122262z = c29938w0;
    }

    public C29938w0(C30764c c30764c, String apiVersion, String str) {
        this.f122259w = 28;
        AbstractC22676k.m65750j(apiVersion, "apiVersion");
        this.f122261y = c30764c;
        this.f122260x = apiVersion;
        this.f122262z = str;
    }

    public C29938w0(String str) {
        this.f122259w = 27;
        C29205p c29205p = new C29205p(16, false);
        this.f122261y = c29205p;
        this.f122262z = c29205p;
        this.f122260x = str;
    }

    public C29938w0(InterfaceC33930h[] interfaceC33930hArr) {
        this.f122259w = 16;
        C33946x c33946x = new C33946x();
        C33948z c33948z = new C33948z();
        c33948z.f142345c = 1.0f;
        c33948z.f142346d = 1.0f;
        C33929g c33929g = C33929g.f142174e;
        c33948z.f142347e = c33929g;
        c33948z.f142348f = c33929g;
        c33948z.f142349g = c33929g;
        c33948z.f142350h = c33929g;
        ByteBuffer byteBuffer = InterfaceC33930h.f142179a;
        c33948z.f142353k = byteBuffer;
        c33948z.f142354l = byteBuffer.asShortBuffer();
        c33948z.f142355m = byteBuffer;
        c33948z.f142344b = -1;
        InterfaceC33930h[] interfaceC33930hArr2 = new InterfaceC33930h[interfaceC33930hArr.length + 2];
        this.f122260x = interfaceC33930hArr2;
        System.arraycopy(interfaceC33930hArr, 0, interfaceC33930hArr2, 0, interfaceC33930hArr.length);
        this.f122261y = c33946x;
        this.f122262z = c33948z;
        interfaceC33930hArr2[interfaceC33930hArr.length] = c33946x;
        interfaceC33930hArr2[interfaceC33930hArr.length + 1] = c33948z;
    }

    public C29938w0(InterfaceC28767e0 interfaceC28767e0, C29938w0 c29938w0) {
        this.f122259w = 11;
        this.f122260x = interfaceC28767e0;
        this.f122261y = c29938w0;
        this.f122262z = interfaceC28767e0.getValue();
    }

    public C29938w0(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.f122259w = 21;
        this.f122262z = arrayDeque;
        this.f122261y = bufferedReader;
    }
}
