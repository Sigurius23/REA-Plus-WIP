package p481s6;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.compose.runtime.Composer;
import bc3.C3033m;
import bi.C3273k;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import eu.C13610f;
import ge3.AbstractC15751g;
import java.util.List;
import java.util.Map;
import l83.C23454a0;
import o23.C27486p;
import o73.C27648a;
import org.json.JSONObject;
import p000.C11327d0;
import p000.C31931s;
import p072cp.BinderC10935b;
import p072cp.InterfaceC10934a;
import p179h.AbstractC16349g;
import p236j.InterfaceC21072k;
import p335n6.InterfaceC26395l;
import p375op.AbstractC28076h;
import p375op.C28077i;
import p375op.InterfaceC28079k;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28601c1;
import p395p6.C28864b;
import p459rf.C31343n;
import p474s.AbstractC32004s;
import p499t9.C33623c0;
import p499t9.C33647p;
import p508ty.C34249c;
import p516u8.AbstractC34587d0;
import p529uo.AbstractC35135w;
import p550vd.AbstractC35902e;
import p591wp.C37481b;
import p598wy.InterfaceC37689b;
import p639y6.C39254f;
import p639y6.C39256h;
import p639y6.InterfaceC39255g;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s01.C32049e;
import s83.AbstractC32269c;
import s90.C32290f;
import so.C32800q;
import t20.C33326g;
import t20.C33331l;
import t20.C33333n;
import t20.C33342w;
import v00.C35463e0;
import v00.C35465f0;
import v00.C35469h0;
import v00.InterfaceC35471i0;
import y00.AbstractC38833g;
import y00.C38855i1;
import y00.C38865j1;
import y00.C38903n1;
import y00.C38912o1;
import y00.C38921p1;
import y00.C38966u1;
import y00.C39007y6;
import y00.EnumC38852h8;
import y00.EnumC38853i;
import y00.EnumC38863j;
import y00.InterfaceC38875k1;
import yb3.C39410n;
import zd3.C40571o;

/* JADX INFO: renamed from: s6.a */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC32229a implements InterfaceC37689b {

    /* JADX INFO: renamed from: w */
    public static InterfaceC28079k f133444w;

    /* JADX INFO: renamed from: x */
    public static C32800q f133445x;

    /* JADX INFO: renamed from: a */
    public static final void m100254a(C33342w c33342w, C33333n usBankAccountFormArgs, InterfaceC4339a onFormCompleted, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(usBankAccountFormArgs, "usBankAccountFormArgs");
        AbstractC22676k.m65750j(onFormCompleted, "onFormCompleted");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-947794794);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(c33342w) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(usBankAccountFormArgs) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onFormCompleted) ? 256 : 128;
        }
        if ((i14 & 147) == 146 && c28655q.m87121F()) {
            c28655q.m87138X();
        } else {
            InterfaceC28601c1 interfaceC28601c1M83597t = C27648a.m83597t(c33342w.f139125Z, c28655q, 0);
            InterfaceC28601c1 interfaceC28601c1M83597t2 = C27648a.m83597t(c33342w.f139129d0, c28655q, 0);
            InterfaceC21072k interfaceC21072kM46560a = AbstractC16349g.m46560a(c28655q);
            c28655q.m87150e0(1934804376);
            boolean zM87157i = c28655q.m87157i(c33342w) | c28655q.m87157i(usBankAccountFormArgs);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            InterfaceC30057d interfaceC30057d = null;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C33331l(c33342w, usBankAccountFormArgs, interfaceC30057d, 0);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            C23454a0 c23454a0 = C23454a0.f92919a;
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R, c23454a0);
            c28655q.m87150e0(1934809732);
            boolean zM87157i2 = c28655q.m87157i(c33342w) | c28655q.m87157i(usBankAccountFormArgs);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C33331l(c33342w, usBankAccountFormArgs, interfaceC30057d, 1);
                c28655q.m87172p0(objM87133R2);
            }
            c28655q.m87173q(false);
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R2, c23454a0);
            Boolean bool = (Boolean) interfaceC28601c1M83597t2.getValue();
            bool.booleanValue();
            c28655q.m87150e0(1934817726);
            boolean zM87153g = ((i14 & 896) == 256) | c28655q.m87153g(interfaceC28601c1M83597t2);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87153g || objM87133R3 == c28676v0) {
                objM87133R3 = new C27486p(onFormCompleted, interfaceC28601c1M83597t2, interfaceC30057d, 9);
                c28655q.m87172p0(objM87133R3);
            }
            c28655q.m87173q(false);
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R3, bool);
            c28655q.m87150e0(1934821165);
            boolean zM87157i3 = c28655q.m87157i(c33342w) | c28655q.m87157i(usBankAccountFormArgs);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i3 || objM87133R4 == c28676v0) {
                objM87133R4 = new C33331l(c33342w, usBankAccountFormArgs, interfaceC30057d, 2);
                c28655q.m87172p0(objM87133R4);
            }
            c28655q.m87173q(false);
            AbstractC28683x.m87253g(c28655q, (InterfaceC4351m) objM87133R4, c23454a0);
            C33326g c33326g = (C33326g) interfaceC28601c1M83597t.getValue();
            Boolean bool2 = (Boolean) interfaceC28601c1M83597t2.getValue();
            bool2.getClass();
            c28655q.m87150e0(1934826173);
            boolean zM87153g2 = c28655q.m87153g(interfaceC28601c1M83597t) | c28655q.m87153g(interfaceC28601c1M83597t2) | c28655q.m87157i(c33342w) | c28655q.m87157i(usBankAccountFormArgs);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87153g2 || objM87133R5 == c28676v0) {
                C11327d0 c11327d0 = new C11327d0(c33342w, usBankAccountFormArgs, interfaceC28601c1M83597t, interfaceC28601c1M83597t2, null, 7);
                c28655q.m87172p0(c11327d0);
                objM87133R5 = c11327d0;
            }
            c28655q.m87173q(false);
            AbstractC28683x.m87254h(c33326g, bool2, (InterfaceC4351m) objM87133R5, c28655q);
            c28655q.m87150e0(1934838680);
            boolean zM87157i4 = c28655q.m87157i(c33342w) | c28655q.m87157i(interfaceC21072kM46560a) | c28655q.m87157i(usBankAccountFormArgs);
            Object objM87133R6 = c28655q.m87133R();
            if (zM87157i4 || objM87133R6 == c28676v0) {
                objM87133R6 = new C32290f(c33342w, interfaceC21072kM46560a, usBankAccountFormArgs, 7);
                c28655q.m87172p0(objM87133R6);
            }
            c28655q.m87173q(false);
            AbstractC28683x.m87251e(c23454a0, (Function1) objM87133R6, c28655q);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32049e(c33342w, usBankAccountFormArgs, onFormCompleted, i13, 15);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final short m100255b(int i13) {
        return (short) (i13 >>> 16);
    }

    /* JADX INFO: renamed from: c */
    public static final short m100256c(int i13) {
        return (short) (i13 & 65535);
    }

    /* JADX INFO: renamed from: d */
    public static final Object m100257d(C40571o c40571o, C31343n c31343n) {
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(c31343n));
        c3033m.m8774s();
        c3033m.m8776u(new C31931s(c40571o, 26));
        c40571o.m131548d(new C13610f(c3033m, 10));
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    /* JADX INFO: renamed from: e */
    public static C37481b m100258e(Bitmap bitmap) {
        AbstractC35135w.m111095g(bitmap, "image must not be null");
        try {
            InterfaceC28079k interfaceC28079k = f133444w;
            AbstractC35135w.m111095g(interfaceC28079k, "IBitmapDescriptorFactory is not initialized");
            C28077i c28077i = (C28077i) interfaceC28079k;
            Parcel parcelM57322k0 = c28077i.m57322k0();
            AbstractC28076h.m84851c(parcelM57322k0, bitmap);
            Parcel parcelM57321j0 = c28077i.m57321j0(parcelM57322k0, 6);
            InterfaceC10934a interfaceC10934aM28986X = BinderC10935b.m28986X(parcelM57321j0.readStrongBinder());
            parcelM57321j0.recycle();
            return new C37481b(interfaceC10934aM28986X);
        } catch (RemoteException e5) {
            throw new RuntimeRemoteException(e5);
        }
    }

    /* JADX INFO: renamed from: f */
    public static C34249c m100259f(C39410n c39410n) {
        return new C34249c(c39410n, 25);
    }

    /* JADX INFO: renamed from: g */
    public static int m100260g(Map map) {
        List list = (List) map.get("Content-Type");
        String str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
        if (str != null) {
            String strM109382o = AbstractC34587d0.m109382o(str);
            strM109382o.getClass();
            switch (strM109382o) {
                case "audio/eac3-joc":
                case "audio/ac3":
                case "audio/eac3":
                    return 0;
                case "video/mp2p":
                    return 10;
                case "video/mp2t":
                    return 11;
                case "video/webm":
                case "audio/x-matroska":
                case "application/webm":
                case "audio/webm":
                case "video/x-matroska":
                    return 6;
                case "audio/amr-wb":
                case "audio/amr":
                case "audio/3gpp":
                    return 3;
                case "image/avif":
                    return 21;
                case "image/heic":
                case "image/heif":
                    return 20;
                case "image/jpeg":
                    return 14;
                case "image/webp":
                    return 18;
                case "application/mp4":
                case "audio/mp4":
                case "video/mp4":
                    return 8;
                case "video/x-msvideo":
                    return 16;
                case "text/vtt":
                    return 13;
                case "image/bmp":
                    return 19;
                case "image/png":
                    return 17;
                case "video/x-flv":
                    return 5;
                case "audio/ac4":
                    return 1;
                case "audio/ogg":
                    return 9;
                case "audio/wav":
                    return 12;
                case "audio/flac":
                    return 4;
                case "audio/midi":
                    return 15;
                case "audio/mpeg":
                    return 7;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: h */
    public static int m100261h(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    /* JADX INFO: renamed from: i */
    public static C39007y6 m100262i(JSONObject jSONObject) {
        String strM99551t = AbstractC32004s.m99551t("address_line1_check", jSONObject);
        String strM99551t2 = AbstractC32004s.m99551t("address_zip_check", jSONObject);
        EnumC38853i enumC38853iM124346b = AbstractC38833g.m124346b(AbstractC32004s.m99551t("brand", jSONObject));
        String strM99551t3 = AbstractC32004s.m99551t("country", jSONObject);
        String strM99551t4 = AbstractC32004s.m99551t("cvc_check", jSONObject);
        String strM99551t5 = AbstractC32004s.m99551t("dynamic_last4", jSONObject);
        Integer numValueOf = !jSONObject.has("exp_month") ? null : Integer.valueOf(jSONObject.optInt("exp_month"));
        Integer numValueOf2 = jSONObject.has("exp_year") ? Integer.valueOf(jSONObject.optInt("exp_year")) : null;
        C33647p c33647p = EnumC38863j.f167290x;
        String strM99551t6 = AbstractC32004s.m99551t("funding", jSONObject);
        c33647p.getClass();
        EnumC38863j enumC38863jM106269k = C33647p.m106269k(strM99551t6);
        String strM99551t7 = AbstractC32004s.m99551t("last4", jSONObject);
        C33623c0 c33623c0 = EnumC38852h8.f167234x;
        String strM99551t8 = AbstractC32004s.m99551t("tokenization_method", jSONObject);
        c33623c0.getClass();
        return new C39007y6(strM99551t, strM99551t2, enumC38853iM124346b, strM99551t3, strM99551t4, strM99551t5, numValueOf, numValueOf2, enumC38863jM106269k, strM99551t7, C33623c0.m106238m(strM99551t8));
    }

    /* JADX INFO: renamed from: j */
    public static final InterfaceC35471i0 m100263j(C38966u1 c38966u1) {
        C38912o1 c38912o1;
        C38903n1 c38903n1;
        C38921p1 c38921p1 = c38966u1.f167723H;
        InterfaceC38875k1 interfaceC38875k1 = (c38921p1 == null || (c38912o1 = c38921p1.f167545y) == null || (c38903n1 = c38912o1.f167499F) == null) ? null : c38903n1.f167472w;
        if (interfaceC38875k1 instanceof C38865j1) {
            C38865j1 c38865j1 = (C38865j1) interfaceC38875k1;
            return c38865j1.f167299w ? C35465f0.f151003w : new C35463e0(c38865j1.f167302z);
        }
        if ((interfaceC38875k1 instanceof C38855i1) || interfaceC38875k1 == null) {
            return C35469h0.f151005w;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: k */
    public static final Object m100264k(Context context, InterfaceC26395l interfaceC26395l, InterfaceC4351m interfaceC4351m, AbstractC32269c abstractC32269c) {
        Object objM100265l = m100265l(context, C39256h.f168775a, interfaceC26395l, new C3273k(interfaceC4351m, null, 2), abstractC32269c);
        return objM100265l == EnumC31071a.f128113w ? objM100265l : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public static final Object m100265l(Context context, InterfaceC39255g interfaceC39255g, InterfaceC26395l interfaceC26395l, InterfaceC4351m interfaceC4351m, AbstractC32269c abstractC32269c) {
        if (interfaceC26395l instanceof C28864b) {
            return C39254f.f168772a.m125029d(context, interfaceC39255g, AbstractC35902e.m113970l(((C28864b) interfaceC26395l).f116802a), interfaceC4351m, abstractC32269c);
        }
        throw new IllegalArgumentException("The glance ID is not the one of an App Widget");
    }
}
