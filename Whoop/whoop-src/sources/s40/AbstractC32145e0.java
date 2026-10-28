package s40;

import a20.C0168h;
import android.content.Context;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.C1579e2;
import androidx.lifecycle.InterfaceC1583f2;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.lifecycle.InterfaceC1620r;
import aws.smithy.kotlin.runtime.serde.DeserializationException;
import c93.InterfaceC4351m;
import com.google.android.exoplayer2.ParserException;
import com.whoop.android.R;
import ed3.C13117a;
import f63.AbstractC14155c;
import in.C18715c;
import j93.InterfaceC21461d;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kg.C22447a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.C2817b;
import p249jc.AbstractC21598x;
import p298l8.AbstractC23420c;
import p298l8.C23418a;
import p308ln.C24519a;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p431qn.C30505a;
import p499t9.C33643m0;
import p598wy.InterfaceC37689b;
import p658yr.AbstractC39717d;
import p692zt.C41113q;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s63.C32236a;
import v00.C35459c0;
import v00.EnumC35470i;
import v00.InterfaceC35457b0;

/* JADX INFO: renamed from: s40.e0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC32145e0 implements InterfaceC37689b {
    /* JADX INFO: renamed from: a */
    public static final boolean m100094a(String str) {
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (AbstractC22676k.m65751k(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final Object m100095b(AbstractC14155c abstractC14155c, C32236a c32236a, InterfaceC30057d interfaceC30057d) {
        Object objM118137a = abstractC14155c.mo13321a().m118137a(c32236a, interfaceC30057d);
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM118137a;
    }

    /* JADX INFO: renamed from: c */
    public static long m100096c(InputStream inputStream, OutputStream outputStream) throws IOException {
        AbstractC22676k.m65750j(inputStream, "<this>");
        byte[] bArr = new byte[DfuBaseService.ERROR_REMOTE_MASK];
        int i13 = inputStream.read(bArr);
        long j7 = 0;
        while (i13 >= 0) {
            outputStream.write(bArr, 0, i13);
            j7 += (long) i13;
            i13 = inputStream.read(bArr);
        }
        return j7;
    }

    /* JADX INFO: renamed from: d */
    public static final void m100097d(View view, InterfaceC1583f2 interfaceC1583f2, InterfaceC4351m interfaceC4351m) {
        InterfaceC1585g0 interfaceC1585g0M5017g = AbstractC1613o1.m5017g(view);
        if (interfaceC1583f2 == null) {
            interfaceC1583f2 = AbstractC1613o1.m5018h(view);
        }
        if (interfaceC1585g0M5017g == null || interfaceC1583f2 == null) {
            return;
        }
        Context applicationContext = view.getContext().getApplicationContext();
        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
        C0168h c0168h = new C0168h(applicationContext, 7);
        C1579e2 store = interfaceC1583f2.getViewModelStore();
        AbstractC23420c defaultCreationExtras = interfaceC1583f2 instanceof InterfaceC1620r ? ((InterfaceC1620r) interfaceC1583f2).getDefaultViewModelCreationExtras() : C23418a.f92771b;
        AbstractC22676k.m65750j(store, "store");
        AbstractC22676k.m65750j(defaultCreationExtras, "defaultCreationExtras");
        C41113q c41113q = new C41113q(store, c0168h, defaultCreationExtras);
        InterfaceC21461d modelClass = AbstractC21598x.m60666V(C32142d0.class);
        AbstractC22676k.m65750j(modelClass, "modelClass");
        String qualifiedName = modelClass.getQualifiedName();
        if (qualifiedName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        interfaceC4351m.invoke(interfaceC1585g0M5017g, (C32142d0) c41113q.m133475w("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(qualifiedName), modelClass));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m100098e(InterfaceC35457b0 interfaceC35457b0, C35459c0 c35459c0) {
        AbstractC22676k.m65750j(interfaceC35457b0, "<this>");
        Set setMo112526a = interfaceC35457b0.mo112526a(c35459c0.m112543x(interfaceC35457b0.getType().f167132w));
        if ((setMo112526a instanceof Collection) && setMo112526a.isEmpty()) {
            return true;
        }
        Iterator it = setMo112526a.iterator();
        while (it.hasNext()) {
            if (!((EnumC35470i) it.next()).mo112525a(c35459c0, interfaceC35457b0.getType().f167132w)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static C18715c m100099f(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < list.size(); i13++) {
            String str = (String) list.get(i13);
            int i14 = AbstractC24567y.f95875a;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                Log.w("VorbisUtil", str.length() != 0 ? "Failed to parse Vorbis comment: ".concat(str) : new String("Failed to parse Vorbis comment: "));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C24519a.m71426b(new C13117a(Base64.decode(strArrSplit[1], 0), 1, (byte) 0)));
                } catch (RuntimeException e5) {
                    AbstractC24543a.m71564F("VorbisUtil", "Failed to parse vorbis picture", e5);
                }
            } else {
                arrayList.add(new C30505a(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C18715c(arrayList);
    }

    /* JADX INFO: renamed from: g */
    public static final byte[] m100100g(InputStream inputStream) throws IOException {
        AbstractC22676k.m65750j(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(DfuBaseService.ERROR_REMOTE_MASK, inputStream.available()));
        m100096c(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        AbstractC22676k.m65749i(byteArray, "toByteArray(...)");
        return byteArray;
    }

    /* JADX INFO: renamed from: h */
    public static C33643m0 m100101h(C13117a c13117a, boolean z4, boolean z13) throws ParserException {
        if (z4) {
            m100104k(3, c13117a, false);
        }
        c13117a.m36712v((int) c13117a.m36703m(), AbstractC39717d.f170958c);
        long jM36703m = c13117a.m36703m();
        String[] strArr = new String[(int) jM36703m];
        for (int i13 = 0; i13 < jM36703m; i13++) {
            strArr[i13] = c13117a.m36712v((int) c13117a.m36703m(), AbstractC39717d.f170958c);
        }
        if (z13 && (c13117a.m36715y() & 1) == 0) {
            throw ParserException.m15562a(null, "framing bit expected to be set");
        }
        return new C33643m0(strArr);
    }

    /* JADX INFO: renamed from: i */
    public static final int m100102i(int i13, String str) {
        if (str == null) {
            return i13;
        }
        switch (str.hashCode()) {
            case -1765633026:
                return !str.equals("capitalone") ? i13 : R.drawable.stripe_ic_bank_capitalone;
            case -1716678772:
                return !str.equals("suntrust") ? i13 : R.drawable.stripe_ic_bank_suntrust;
            case -1435862505:
                return !str.equals("citibank") ? i13 : R.drawable.stripe_ic_bank_citi;
            case -891985843:
                return !str.equals("stripe") ? i13 : R.drawable.stripe_ic_bank_stripe;
            case -836135462:
                return !str.equals("usbank") ? i13 : R.drawable.stripe_ic_bank_usbank;
            case -270531414:
                return !str.equals("morganchase") ? i13 : R.drawable.stripe_ic_bank_morganchase;
            case -78918662:
                return !str.equals("wellsfargo") ? i13 : R.drawable.stripe_ic_bank_wellsfargo;
            case 3696:
                return !str.equals("td") ? i13 : R.drawable.stripe_ic_bank_td;
            case 97716:
                return !str.equals("boa") ? i13 : R.drawable.stripe_ic_bank_boa;
            case 111141:
                return !str.equals("pnc") ? i13 : R.drawable.stripe_ic_bank_pnc;
            case 114271:
                return !str.equals("svb") ? i13 : R.drawable.stripe_ic_bank_svb;
            case 3378218:
                return !str.equals("nfcu") ? i13 : R.drawable.stripe_ic_bank_nfcu;
            case 3599166:
                return !str.equals("usaa") ? i13 : R.drawable.stripe_ic_bank_usaa;
            case 950484242:
                return !str.equals("compass") ? i13 : R.drawable.stripe_ic_bank_compass;
            default:
                return i13;
        }
    }

    /* JADX INFO: renamed from: j */
    public static final C2817b m100103j(C2817b c2817b) {
        if (!AbstractC22676k.m65745e(c2817b.m8014q(), "ErrorResponse")) {
            throw new DeserializationException("invalid root, expected <ErrorResponse>; found `" + ((C22447a) c2817b.f11024y) + '`');
        }
        C2817b c2817bM8017t = c2817b.m8017t();
        if (c2817bM8017t != null && AbstractC22676k.m65745e(c2817bM8017t.m8014q(), "Error")) {
            return c2817bM8017t;
        }
        StringBuilder sb4 = new StringBuilder("invalid error, expected <Error>; found `");
        sb4.append(c2817bM8017t != null ? (C22447a) c2817bM8017t.f11024y : null);
        sb4.append('`');
        throw new DeserializationException(sb4.toString());
    }

    /* JADX INFO: renamed from: k */
    public static boolean m100104k(int i13, C13117a c13117a, boolean z4) throws ParserException {
        if (c13117a.m36692a() < 7) {
            if (z4) {
                return false;
            }
            int iM36692a = c13117a.m36692a();
            StringBuilder sb4 = new StringBuilder(29);
            sb4.append("too short header: ");
            sb4.append(iM36692a);
            throw ParserException.m15562a(null, sb4.toString());
        }
        if (c13117a.m36715y() != i13) {
            if (z4) {
                return false;
            }
            String strValueOf = String.valueOf(Integer.toHexString(i13));
            throw ParserException.m15562a(null, strValueOf.length() != 0 ? "expected header type ".concat(strValueOf) : new String("expected header type "));
        }
        if (c13117a.m36715y() == 118 && c13117a.m36715y() == 111 && c13117a.m36715y() == 114 && c13117a.m36715y() == 98 && c13117a.m36715y() == 105 && c13117a.m36715y() == 115) {
            return true;
        }
        if (z4) {
            return false;
        }
        throw ParserException.m15562a(null, "expected characters 'vorbis'");
    }
}
